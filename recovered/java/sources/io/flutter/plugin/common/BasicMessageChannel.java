            package io.flutter.plugin.common;

            import io.flutter.Log;
            import java.nio.ByteBuffer;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class BasicMessageChannel<T> {
                public static final String CHANNEL_BUFFERS_CHANNEL = "dev.flutter/channel-buffers";
                private static final String TAG = "BasicMessageChannel#";
                private final MessageCodec<T> codec;
                private final BinaryMessenger messenger;
                private final String name;
                private final BinaryMessenger.TaskQueue taskQueue;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public final class IncomingMessageHandler implements BinaryMessenger.BinaryMessageHandler {
                    private final MessageHandler<T> handler;

                    private IncomingMessageHandler(MessageHandler<T> messageHandler) {
/* 6 */                 this.handler = messageHandler;
                    }

                    @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
                    public void onMessage(ByteBuffer byteBuffer, final BinaryMessenger.BinaryReply binaryReply) {
                        try {
/* 18 */                    this.handler.onMessage((T) BasicMessageChannel.this.codec.decodeMessage(byteBuffer), new Reply<T>() { // from class: io.flutter.plugin.common.BasicMessageChannel.IncomingMessageHandler.1
                                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                                public void reply(T t) {
/* 15 */                            binaryReply.reply(BasicMessageChannel.this.codec.encodeMessage(t));
                                }
                            });
                        } catch (RuntimeException e) {
/* 45 */                    Log.m4586e(BasicMessageChannel.TAG + BasicMessageChannel.this.name, "Failed to handle message", e);
/* 49 */                    binaryReply.reply(null);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public final class IncomingReplyHandler implements BinaryMessenger.BinaryReply {
                    private final Reply<T> callback;

                    private IncomingReplyHandler(Reply<T> reply) {
/* 6 */                 this.callback = reply;
                    }

                    @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
                    public void reply(ByteBuffer byteBuffer) {
                        try {
/* 13 */                    this.callback.reply((T) BasicMessageChannel.this.codec.decodeMessage(byteBuffer));
                        } catch (RuntimeException e) {
/* 40 */                    Log.m4586e(BasicMessageChannel.TAG + BasicMessageChannel.this.name, "Failed to handle message reply", e);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface MessageHandler<T> {
                    void onMessage(T t, Reply<T> reply);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface Reply<T> {
                    void reply(T t);
                }

                public BasicMessageChannel(BinaryMessenger binaryMessenger, String str, MessageCodec<T> messageCodec, BinaryMessenger.TaskQueue taskQueue) {
/* 4 */             this.messenger = binaryMessenger;
/* 6 */             this.name = str;
/* 8 */             this.codec = messageCodec;
/* 10 */            this.taskQueue = taskQueue;
                }

                private static ByteBuffer packetFromEncodedMessage(ByteBuffer byteBuffer) {
/* 1 */             byteBuffer.flip();
/* 4 */             int iRemaining = byteBuffer.remaining();
/* 8 */             byte[] bArr = new byte[iRemaining];
/* 10 */            byteBuffer.get(bArr);
/* 13 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iRemaining);
/* 17 */            byteBufferAllocateDirect.put(bArr);
/* 20 */            return byteBufferAllocateDirect;
                }

                public static void resizeChannelBuffer(BinaryMessenger binaryMessenger, String str, int i) {
/* 32 */            binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall("resize", Arrays.asList(str, Integer.valueOf(i))))));
                }

                public static void setWarnsOnChannelOverflow(BinaryMessenger binaryMessenger, String str, boolean z) {
/* 34 */            binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall("overflow", Arrays.asList(str, Boolean.valueOf(!z))))));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public void send(T t, Reply<T> reply) {
/* 21 */            this.messenger.send(this.name, this.codec.encodeMessage(t), reply != null ? new IncomingReplyHandler(reply) : null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.plugin.common.BinaryMessenger] */
                /* JADX WARN: Type inference failed for: r2v0, types: [io.flutter.plugin.common.BasicMessageChannel$1] */
                /* JADX WARN: Type inference failed for: r2v1, types: [io.flutter.plugin.common.BinaryMessenger$BinaryMessageHandler] */
                /* JADX WARN: Type inference failed for: r2v2 */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public void setMessageHandler(MessageHandler<T> messageHandler) {
/* 1 */             BinaryMessenger.TaskQueue taskQueue = this.taskQueue;
/* 3 */             ?? r1 = this.messenger;
/* 5 */             ?? r2 = 0;
/* 6 */             if (taskQueue != null) {
/* 21 */                r1.setMessageHandler(this.name, messageHandler != null ? new IncomingMessageHandler(messageHandler) : null, this.taskQueue);
                    } else {
/* 36 */                r1.setMessageHandler(this.name, messageHandler != null ? new IncomingMessageHandler(messageHandler) : 0);
                    }
                }

/* 12 */        public BasicMessageChannel(BinaryMessenger binaryMessenger, String str, MessageCodec<T> messageCodec) {
/* 13 */            this(binaryMessenger, str, messageCodec, null);
                }

/* 24 */        public void send(T t) {
/* 25 */            send(t, null);
                }

/* 35 */        public void resizeChannelBuffer(int i) {
/* 36 */            resizeChannelBuffer(this.messenger, this.name, i);
                }

/* 37 */        public void setWarnsOnChannelOverflow(boolean z) {
/* 38 */            setWarnsOnChannelOverflow(this.messenger, this.name, z);
                }
            }
