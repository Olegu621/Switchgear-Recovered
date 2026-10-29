            package io.flutter.plugin.common;

            import java.nio.ByteBuffer;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public interface BinaryMessenger {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface BinaryMessageHandler {
                    void onMessage(ByteBuffer byteBuffer, BinaryReply binaryReply);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface BinaryReply {
                    void reply(ByteBuffer byteBuffer);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface TaskQueue {
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class TaskQueueOptions {
                    private boolean isSerial = true;

                    public boolean getIsSerial() {
/* 1 */                 return this.isSerial;
                    }

                    public TaskQueueOptions setIsSerial(boolean z) {
/* 1 */                 this.isSerial = z;
/* 3 */                 return this;
                    }
                }

                default void disableBufferingIncomingMessages() {
/* 8 */             throw new UnsupportedOperationException("disableBufferingIncomingMessages not implemented.");
                }

                default void enableBufferingIncomingMessages() {
/* 8 */             throw new UnsupportedOperationException("enableBufferingIncomingMessages not implemented.");
                }

                default TaskQueue makeBackgroundTaskQueue() {
/* 6 */             return makeBackgroundTaskQueue(new TaskQueueOptions());
                }

                void send(String str, ByteBuffer byteBuffer);

                void send(String str, ByteBuffer byteBuffer, BinaryReply binaryReply);

                void setMessageHandler(String str, BinaryMessageHandler binaryMessageHandler);

                default void setMessageHandler(String str, BinaryMessageHandler binaryMessageHandler, TaskQueue taskQueue) {
/* 1 */             if (taskQueue == null) {
/* 3 */                 setMessageHandler(str, binaryMessageHandler);
                    } else {
/* 9 */                 C1951n4.m6866q("setMessageHandler called with nonnull taskQueue is not supported.");
                    }
                }

/* 10 */        default TaskQueue makeBackgroundTaskQueue(TaskQueueOptions taskQueueOptions) {
/* 11 */            throw new UnsupportedOperationException("makeBackgroundTaskQueue not implemented.");
                }
            }
