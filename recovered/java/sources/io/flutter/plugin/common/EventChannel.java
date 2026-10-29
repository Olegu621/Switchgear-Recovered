            package io.flutter.plugin.common;

            import io.flutter.Log;
            import java.nio.ByteBuffer;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class EventChannel {
                private static final String TAG = "EventChannel#";
                private final MethodCodec codec;
                private final BinaryMessenger messenger;
                private final String name;
                private final BinaryMessenger.TaskQueue taskQueue;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface EventSink {
                    void endOfStream();

                    void error(String str, String str2, Object obj);

                    void success(Object obj);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public final class IncomingStreamRequestHandler implements BinaryMessenger.BinaryMessageHandler {
                    private final AtomicReference<EventSink> activeSink = new AtomicReference<>(null);
                    private final StreamHandler handler;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public final class EventSinkImplementation implements EventSink {
                        final AtomicBoolean hasEnded;

                        private EventSinkImplementation() {
/* 12 */                    this.hasEnded = new AtomicBoolean(false);
                        }

                        @Override // io.flutter.plugin.common.EventChannel.EventSink
                        public void endOfStream() {
/* 8 */                     if (this.hasEnded.getAndSet(true) || IncomingStreamRequestHandler.this.activeSink.get() != this) {
/* 43 */                        return;
                            }
/* 40 */                    EventChannel.this.messenger.send(EventChannel.this.name, null);
                        }

                        @Override // io.flutter.plugin.common.EventChannel.EventSink
                        public void error(String str, String str2, Object obj) {
/* 7 */                     if (this.hasEnded.get() || IncomingStreamRequestHandler.this.activeSink.get() != this) {
/* 53 */                        return;
                            }
/* 50 */                    EventChannel.this.messenger.send(EventChannel.this.name, EventChannel.this.codec.encodeErrorEnvelope(str, str2, obj));
                        }

                        @Override // io.flutter.plugin.common.EventChannel.EventSink
                        public void success(Object obj) {
/* 7 */                     if (this.hasEnded.get() || IncomingStreamRequestHandler.this.activeSink.get() != this) {
/* 53 */                        return;
                            }
/* 50 */                    EventChannel.this.messenger.send(EventChannel.this.name, EventChannel.this.codec.encodeSuccessEnvelope(obj));
                        }
                    }

                    public IncomingStreamRequestHandler(StreamHandler streamHandler) {
/* 14 */                this.handler = streamHandler;
                    }

                    private void onCancel(Object obj, BinaryMessenger.BinaryReply binaryReply) {
/* 12 */                if (this.activeSink.getAndSet(null) == null) {
/* 89 */                    binaryReply.reply(EventChannel.this.codec.encodeErrorEnvelope("error", "No active stream to cancel", null));
/* 92 */                    return;
                        }
                        try {
/* 16 */                    this.handler.onCancel(obj);
/* 29 */                    binaryReply.reply(EventChannel.this.codec.encodeSuccessEnvelope(null));
                        } catch (RuntimeException e) {
/* 56 */                    Log.m4586e(EventChannel.TAG + EventChannel.this.name, "Failed to close event stream", e);
/* 73 */                    binaryReply.reply(EventChannel.this.codec.encodeErrorEnvelope("error", e.getMessage(), null));
                        }
                    }

                    private void onListen(Object obj, BinaryMessenger.BinaryReply binaryReply) {
/* 4 */                 EventSinkImplementation eventSinkImplementation = new EventSinkImplementation();
/* 17 */                if (this.activeSink.getAndSet(eventSinkImplementation) != null) {
                            try {
/* 21 */                        this.handler.onCancel(null);
                            } catch (RuntimeException e) {
/* 46 */                        Log.m4586e(EventChannel.TAG + EventChannel.this.name, "Failed to close existing event stream", e);
                            }
                        }
                        try {
/* 51 */                    this.handler.onListen(obj, eventSinkImplementation);
/* 64 */                    binaryReply.reply(EventChannel.this.codec.encodeSuccessEnvelope(null));
                        } catch (RuntimeException e2) {
/* 71 */                    this.activeSink.set(null);
/* 94 */                    Log.m4586e(EventChannel.TAG + EventChannel.this.name, "Failed to open event stream", e2);
/* 113 */                   binaryReply.reply(EventChannel.this.codec.encodeErrorEnvelope("error", e2.getMessage(), null));
                        }
                    }

                    @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
                    public void onMessage(ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
/* 7 */                 MethodCall methodCallDecodeMethodCall = EventChannel.this.codec.decodeMethodCall(byteBuffer);
/* 19 */                if (methodCallDecodeMethodCall.method.equals("listen")) {
/* 23 */                    onListen(methodCallDecodeMethodCall.arguments, binaryReply);
                        } else if (methodCallDecodeMethodCall.method.equals("cancel")) {
/* 39 */                    onCancel(methodCallDecodeMethodCall.arguments, binaryReply);
                        } else {
/* 44 */                    binaryReply.reply(null);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface StreamHandler {
                    void onCancel(Object obj);

                    void onListen(Object obj, EventSink eventSink);
                }

                public EventChannel(BinaryMessenger binaryMessenger, String str, MethodCodec methodCodec, BinaryMessenger.TaskQueue taskQueue) {
/* 4 */             this.messenger = binaryMessenger;
/* 6 */             this.name = str;
/* 8 */             this.codec = methodCodec;
/* 10 */            this.taskQueue = taskQueue;
                }

                public void setStreamHandler(StreamHandler streamHandler) {
/* 1 */             BinaryMessenger.TaskQueue taskQueue = this.taskQueue;
/* 3 */             BinaryMessenger binaryMessenger = this.messenger;
/* 6 */             if (taskQueue != null) {
/* 20 */                binaryMessenger.setMessageHandler(this.name, streamHandler != null ? new IncomingStreamRequestHandler(streamHandler) : null, this.taskQueue);
                    } else {
/* 34 */                binaryMessenger.setMessageHandler(this.name, streamHandler != null ? new IncomingStreamRequestHandler(streamHandler) : null);
                    }
                }

/* 12 */        public EventChannel(BinaryMessenger binaryMessenger, String str, MethodCodec methodCodec) {
/* 13 */            this(binaryMessenger, str, methodCodec, null);
                }

/* 13 */        public EventChannel(BinaryMessenger binaryMessenger, String str) {
/* 14 */            this(binaryMessenger, str, StandardMethodCodec.INSTANCE);
                }
            }
