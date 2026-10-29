            package io.flutter.plugin.common;

            import io.flutter.Log;
            import java.nio.ByteBuffer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public class MethodChannel {
                private static final String TAG = "MethodChannel#";
                private final MethodCodec codec;
                private final BinaryMessenger messenger;
                private final String name;
                private final BinaryMessenger.TaskQueue taskQueue;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public final class IncomingMethodCallHandler implements BinaryMessenger.BinaryMessageHandler {
                    private final MethodCallHandler handler;

                    public IncomingMethodCallHandler(MethodCallHandler methodCallHandler) {
/* 6 */                 this.handler = methodCallHandler;
                    }

                    @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
                    public void onMessage(ByteBuffer byteBuffer, final BinaryMessenger.BinaryReply binaryReply) {
                        try {
/* 18 */                    this.handler.onMethodCall(MethodChannel.this.codec.decodeMethodCall(byteBuffer), new Result() { // from class: io.flutter.plugin.common.MethodChannel.IncomingMethodCallHandler.1
                                @Override // io.flutter.plugin.common.MethodChannel.Result
                                public void error(String str, String str2, Object obj) {
/* 15 */                            binaryReply.reply(MethodChannel.this.codec.encodeErrorEnvelope(str, str2, obj));
                                }

                                @Override // io.flutter.plugin.common.MethodChannel.Result
                                public void notImplemented() {
/* 4 */                             binaryReply.reply(null);
                                }

                                @Override // io.flutter.plugin.common.MethodChannel.Result
                                public void success(Object obj) {
/* 15 */                            binaryReply.reply(MethodChannel.this.codec.encodeSuccessEnvelope(obj));
                                }
                            });
                        } catch (RuntimeException e) {
/* 45 */                    Log.m4586e(MethodChannel.TAG + MethodChannel.this.name, "Failed to handle method call", e);
/* 69 */                    binaryReply.reply(MethodChannel.this.codec.encodeErrorEnvelopeWithStacktrace("error", e.getMessage(), null, Log.getStackTraceString(e)));
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public final class IncomingResultHandler implements BinaryMessenger.BinaryReply {
                    private final Result callback;

                    public IncomingResultHandler(Result result) {
/* 6 */                 this.callback = result;
                    }

                    @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
                    public void reply(ByteBuffer byteBuffer) {
/* 1 */                 Result result = this.callback;
                        try {
/* 3 */                     if (byteBuffer == null) {
/* 5 */                         result.notImplemented();
                            } else {
                                try {
/* 21 */                            result.success(MethodChannel.this.codec.decodeEnvelope(byteBuffer));
                                } catch (FlutterException e) {
/* 36 */                            this.callback.error(e.code, e.getMessage(), e.details);
                                }
                            }
                        } catch (RuntimeException e2) {
/* 62 */                    Log.m4586e(MethodChannel.TAG + MethodChannel.this.name, "Failed to handle method call result", e2);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface MethodCallHandler {
                    void onMethodCall(MethodCall methodCall, Result result);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface Result {
                    void error(String str, String str2, Object obj);

                    void notImplemented();

                    void success(Object obj);
                }

                public MethodChannel(BinaryMessenger binaryMessenger, String str, MethodCodec methodCodec, BinaryMessenger.TaskQueue taskQueue) {
/* 4 */             this.messenger = binaryMessenger;
/* 6 */             this.name = str;
/* 8 */             this.codec = methodCodec;
/* 10 */            this.taskQueue = taskQueue;
                }

                public void invokeMethod(String str, Object obj, Result result) {
/* 26 */            this.messenger.send(this.name, this.codec.encodeMethodCall(new MethodCall(str, obj)), result == null ? null : new IncomingResultHandler(result));
                }

                public void resizeChannelBuffer(int i) {
/* 5 */             BasicMessageChannel.resizeChannelBuffer(this.messenger, this.name, i);
                }

                public void setMethodCallHandler(MethodCallHandler methodCallHandler) {
/* 1 */             BinaryMessenger.TaskQueue taskQueue = this.taskQueue;
/* 3 */             BinaryMessenger binaryMessenger = this.messenger;
/* 6 */             if (taskQueue != null) {
/* 20 */                binaryMessenger.setMessageHandler(this.name, methodCallHandler != null ? new IncomingMethodCallHandler(methodCallHandler) : null, this.taskQueue);
                    } else {
/* 34 */                binaryMessenger.setMessageHandler(this.name, methodCallHandler != null ? new IncomingMethodCallHandler(methodCallHandler) : null);
                    }
                }

                public void setWarnsOnChannelOverflow(boolean z) {
/* 5 */             BasicMessageChannel.setWarnsOnChannelOverflow(this.messenger, this.name, z);
                }

/* 12 */        public MethodChannel(BinaryMessenger binaryMessenger, String str, MethodCodec methodCodec) {
/* 13 */            this(binaryMessenger, str, methodCodec, null);
                }

/* 13 */        public MethodChannel(BinaryMessenger binaryMessenger, String str) {
/* 14 */            this(binaryMessenger, str, StandardMethodCodec.INSTANCE);
                }

/* 29 */        public void invokeMethod(String str, Object obj) {
/* 30 */            invokeMethod(str, obj, null);
                }
            }
