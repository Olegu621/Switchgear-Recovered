            package io.flutter.embedding.engine.dart;

            import io.flutter.FlutterInjector;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterJNI;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.util.TraceSection;
            import java.nio.ByteBuffer;
            import java.util.HashMap;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Map;
            import java.util.WeakHashMap;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 60 */    class DartMessenger implements BinaryMessenger, PlatformMessageHandler {
                private static final String TAG = "DartMessenger";
                private Map<String, List<BufferedMessageInfo>> bufferedMessages;
                private WeakHashMap<BinaryMessenger.TaskQueue, DartMessengerTaskQueue> createdTaskQueues;
                private final AtomicBoolean enableBufferingIncomingMessages;
                private final FlutterJNI flutterJNI;
                private final Object handlersLock;
                private final Map<String, HandlerInfo> messageHandlers;
                private int nextReplyId;
                private final Map<Integer, BinaryMessenger.BinaryReply> pendingReplies;
                private final DartMessengerTaskQueue platformTaskQueue;
                private TaskQueueFactory taskQueueFactory;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class BufferedMessageInfo {
                    public final ByteBuffer message;
                    long messageData;
                    int replyId;

                    public BufferedMessageInfo(ByteBuffer byteBuffer, int i, long j) {
/* 4 */                 this.message = byteBuffer;
/* 6 */                 this.replyId = i;
/* 8 */                 this.messageData = j;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ConcurrentTaskQueue implements DartMessengerTaskQueue {
                    private final ExecutorService executor;

                    public ConcurrentTaskQueue(ExecutorService executorService) {
/* 4 */                 this.executor = executorService;
                    }

                    @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
                    public void dispatch(Runnable runnable) {
/* 3 */                 this.executor.execute(runnable);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface DartMessengerTaskQueue {
                    void dispatch(Runnable runnable);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class DefaultTaskQueueFactory implements TaskQueueFactory {
                    ExecutorService executorService = FlutterInjector.instance().executorService();

                    @Override // io.flutter.embedding.engine.dart.DartMessenger.TaskQueueFactory
                    public DartMessengerTaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
/* 1 */                 boolean isSerial = taskQueueOptions.getIsSerial();
/* 5 */                 ExecutorService executorService = this.executorService;
                        return isSerial ? new SerialTaskQueue(executorService) : new ConcurrentTaskQueue(executorService);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class HandlerInfo {
                    public final BinaryMessenger.BinaryMessageHandler handler;
                    public final DartMessengerTaskQueue taskQueue;

                    public HandlerInfo(BinaryMessenger.BinaryMessageHandler binaryMessageHandler, DartMessengerTaskQueue dartMessengerTaskQueue) {
/* 4 */                 this.handler = binaryMessageHandler;
/* 6 */                 this.taskQueue = dartMessengerTaskQueue;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Reply implements BinaryMessenger.BinaryReply {
                    private final AtomicBoolean done = new AtomicBoolean(false);
                    private final FlutterJNI flutterJNI;
                    private final int replyId;

                    public Reply(FlutterJNI flutterJNI, int i) {
/* 12 */                this.flutterJNI = flutterJNI;
/* 14 */                this.replyId = i;
                    }

                    @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
                    public void reply(ByteBuffer byteBuffer) {
/* 8 */                 if (this.done.getAndSet(true)) {
/* 32 */                    f42.m3656l("Reply already submitted");
/* 35 */                    return;
                        }
/* 10 */                FlutterJNI flutterJNI = this.flutterJNI;
/* 12 */                if (byteBuffer == null) {
/* 16 */                    flutterJNI.invokePlatformMessageEmptyResponseCallback(this.replyId);
                        } else {
/* 26 */                    flutterJNI.invokePlatformMessageResponseCallback(this.replyId, byteBuffer, byteBuffer.position());
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SerialTaskQueue implements DartMessengerTaskQueue {
                    private final ExecutorService executor;
                    private final ConcurrentLinkedQueue<Runnable> queue = new ConcurrentLinkedQueue<>();
                    private final AtomicBoolean isRunning = new AtomicBoolean(false);

                    public SerialTaskQueue(ExecutorService executorService) {
/* 4 */                 this.executor = executorService;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    /* JADX INFO: renamed from: flush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public void lambda$flush$1() {
/* 4 */                 int i = 1;
/* 9 */                 if (this.isRunning.compareAndSet(false, true)) {
                            try {
/* 13 */                        Runnable runnablePoll = this.queue.poll();
/* 19 */                        if (runnablePoll != null) {
/* 21 */                            runnablePoll.run();
                                }
                            } finally {
/* 53 */                        this.isRunning.set(false);
/* 62 */                        if (!this.queue.isEmpty()) {
/* 71 */                            this.executor.execute(new RunnableC1060b(this, i));
                                }
                            }
                        }
                    }

                    @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
                    public void dispatch(Runnable runnable) {
/* 3 */                 this.queue.add(runnable);
/* 14 */                this.executor.execute(new RunnableC1060b(this, 0));
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface TaskQueueFactory {
                    DartMessengerTaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class TaskQueueToken implements BinaryMessenger.TaskQueue {
                    private TaskQueueToken() {
                    }
                }

                public DartMessenger(FlutterJNI flutterJNI, TaskQueueFactory taskQueueFactory) {
/* 9 */             this.messageHandlers = new HashMap();
/* 16 */            this.bufferedMessages = new HashMap();
/* 23 */            this.handlersLock = new Object();
/* 31 */            this.enableBufferingIncomingMessages = new AtomicBoolean(false);
/* 38 */            this.pendingReplies = new HashMap();
/* 41 */            this.nextReplyId = 1;
/* 48 */            this.platformTaskQueue = new PlatformTaskQueue();
/* 55 */            this.createdTaskQueues = new WeakHashMap<>();
/* 57 */            this.flutterJNI = flutterJNI;
/* 59 */            this.taskQueueFactory = taskQueueFactory;
                }

                private void dispatchMessageToQueue(final String str, final HandlerInfo handlerInfo, final ByteBuffer byteBuffer, final int i, final long j) {
/* 7 */             DartMessengerTaskQueue dartMessengerTaskQueue = handlerInfo != null ? handlerInfo.taskQueue : null;
/* 23 */            TraceSection.beginAsyncSection("PlatformChannel ScheduleHandler on " + str, i);
/* 34 */            Runnable runnable = new Runnable() { // from class: io.flutter.embedding.engine.dart.a
                        @Override // java.lang.Runnable
                        public final void run() {
/* 1 */                     this.f9739a.lambda$dispatchMessageToQueue$0(str, i, handlerInfo, byteBuffer, j);
                        }
                    };
/* 37 */            if (dartMessengerTaskQueue == null) {
/* 39 */                dartMessengerTaskQueue = this.platformTaskQueue;
                    }
/* 41 */            dartMessengerTaskQueue.dispatch(runnable);
                }

                private static void handleError(Error error) {
/* 1 */             Thread threadCurrentThread = Thread.currentThread();
/* 9 */             if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
/* 19 */                throw error;
                    }
/* 15 */            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, error);
                }

                private void invokeHandler(HandlerInfo handlerInfo, ByteBuffer byteBuffer, int i) {
/* 3 */             if (handlerInfo == null) {
/* 43 */                Log.m4589v(TAG, "No registered handler for message. Responding to Dart with empty reply message.");
/* 48 */                this.flutterJNI.invokePlatformMessageEmptyResponseCallback(i);
/* 51 */                return;
                    }
                    try {
/* 7 */                 Log.m4589v(TAG, "Deferring to registered handler to process message.");
/* 19 */                handlerInfo.handler.onMessage(byteBuffer, new Reply(this.flutterJNI, i));
                    } catch (Error e) {
/* 26 */                handleError(e);
                    } catch (Exception e2) {
/* 32 */                Log.m4586e(TAG, "Uncaught exception in binary message listener", e2);
/* 37 */                this.flutterJNI.invokePlatformMessageEmptyResponseCallback(i);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$dispatchMessageToQueue$0(String str, int i, HandlerInfo handlerInfo, ByteBuffer byteBuffer, long j) {
/* 17 */            TraceSection.endAsyncSection("PlatformChannel ScheduleHandler on " + str, i);
                    try {
/* 32 */                TraceSection traceSectionScoped = TraceSection.scoped("DartMessenger#handleMessageFromDart on " + str);
                        try {
/* 36 */                    invokeHandler(handlerInfo, byteBuffer, i);
/* 39 */                    if (byteBuffer != null && byteBuffer.isDirect()) {
/* 48 */                        byteBuffer.limit(0);
                            }
/* 54 */                    if (traceSectionScoped != null) {
/* 56 */                        traceSectionScoped.close();
                            }
/* 64 */                    this.flutterJNI.cleanupMessageData(j);
                        } catch (Throwable th) {
/* 68 */                    if (traceSectionScoped != null) {
                                try {
/* 70 */                            traceSectionScoped.close();
                                } catch (Throwable th2) {
/* 75 */                            th.addSuppressed(th2);
                                }
                            }
/* 78 */                    throw th;
                        }
                    } catch (Throwable th3) {
/* 81 */                this.flutterJNI.cleanupMessageData(j);
/* 84 */                throw th3;
                    }
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
                public void disableBufferingIncomingMessages() {
                    Map<String, List<BufferedMessageInfo>> map;
                    synchronized (this.handlersLock) {
/* 7 */                 this.enableBufferingIncomingMessages.set(false);
/* 10 */                map = this.bufferedMessages;
/* 17 */                this.bufferedMessages = new HashMap();
                    }
/* 32 */            for (Map.Entry<String, List<BufferedMessageInfo>> entry : map.entrySet()) {
/* 54 */                for (BufferedMessageInfo bufferedMessageInfo : entry.getValue()) {
/* 77 */                    dispatchMessageToQueue(entry.getKey(), null, bufferedMessageInfo.message, bufferedMessageInfo.replyId, bufferedMessageInfo.messageData);
                        }
                    }
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
                public void enableBufferingIncomingMessages() {
/* 4 */             this.enableBufferingIncomingMessages.set(true);
                }

                public int getPendingChannelResponseCount() {
/* 3 */             return this.pendingReplies.size();
                }

                @Override // io.flutter.embedding.engine.dart.PlatformMessageHandler
                public void handleMessageFromDart(String str, ByteBuffer byteBuffer, int i, long j) {
                    HandlerInfo handlerInfo;
                    boolean z;
/* 22 */            Log.m4589v(TAG, "Received message from Dart over channel '" + str + "'");
                    synchronized (this.handlersLock) {
                        try {
/* 30 */                    handlerInfo = this.messageHandlers.get(str);
/* 49 */                    z = this.enableBufferingIncomingMessages.get() && handlerInfo == null;
/* 50 */                    if (z) {
/* 58 */                        if (!this.bufferedMessages.containsKey(str)) {
/* 67 */                            this.bufferedMessages.put(str, new LinkedList());
                                }
/* 87 */                        this.bufferedMessages.get(str).add(new BufferedMessageInfo(byteBuffer, i, j));
                            }
                        } catch (Throwable th) {
/* 103 */                   throw th;
                        }
                    }
/* 91 */            if (z) {
/* 101 */               return;
                    }
/* 98 */            dispatchMessageToQueue(str, handlerInfo, byteBuffer, i, j);
                }

                @Override // io.flutter.embedding.engine.dart.PlatformMessageHandler
                public void handlePlatformMessageResponse(int i, ByteBuffer byteBuffer) {
/* 5 */             Log.m4589v(TAG, "Received message reply from Dart.");
/* 14 */            BinaryMessenger.BinaryReply binaryReplyRemove = this.pendingReplies.remove(Integer.valueOf(i));
/* 20 */            if (binaryReplyRemove != null) {
                        try {
/* 24 */                    Log.m4589v(TAG, "Invoking registered callback for reply from Dart.");
/* 27 */                    binaryReplyRemove.reply(byteBuffer);
/* 30 */                    if (byteBuffer == null || !byteBuffer.isDirect()) {
/* 55 */                        return;
                            }
/* 39 */                    byteBuffer.limit(0);
                        } catch (Error e) {
/* 46 */                    handleError(e);
                        } catch (Exception e2) {
/* 52 */                    Log.m4586e(TAG, "Uncaught exception in binary message reply handler", e2);
                        }
                    }
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
                public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
/* 3 */             DartMessengerTaskQueue dartMessengerTaskQueueMakeBackgroundTaskQueue = this.taskQueueFactory.makeBackgroundTaskQueue(taskQueueOptions);
/* 10 */            TaskQueueToken taskQueueToken = new TaskQueueToken();
/* 15 */            this.createdTaskQueues.put(taskQueueToken, dartMessengerTaskQueueMakeBackgroundTaskQueue);
/* 18 */            return taskQueueToken;
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
                public void send(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
/* 17 */            TraceSection traceSectionScoped = TraceSection.scoped("DartMessenger#send on " + str);
                    try {
/* 40 */                Log.m4589v(TAG, "Sending message with callback over channel '" + str + "'");
/* 43 */                int i = this.nextReplyId;
/* 47 */                this.nextReplyId = i + 1;
/* 49 */                if (binaryReply != null) {
/* 57 */                    this.pendingReplies.put(Integer.valueOf(i), binaryReply);
                        }
/* 63 */                FlutterJNI flutterJNI = this.flutterJNI;
/* 65 */                if (byteBuffer == null) {
/* 67 */                    flutterJNI.dispatchEmptyPlatformMessage(str, i);
                        } else {
/* 75 */                    flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
                        }
/* 78 */                if (traceSectionScoped != null) {
/* 80 */                    traceSectionScoped.close();
                        }
                    } catch (Throwable th) {
/* 84 */                if (traceSectionScoped != null) {
                            try {
/* 86 */                        traceSectionScoped.close();
                            } catch (Throwable th2) {
/* 91 */                        th.addSuppressed(th2);
                            }
                        }
/* 94 */                throw th;
                    }
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
                public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
                    DartMessengerTaskQueue dartMessengerTaskQueue;
/* 1 */             if (binaryMessageHandler == null) {
/* 24 */                Log.m4589v(TAG, "Removing handler for channel '" + str + "'");
                        synchronized (this.handlersLock) {
/* 32 */                    this.messageHandlers.remove(str);
                        }
/* 36 */                return;
                    }
/* 41 */            if (taskQueue != null) {
/* 45 */                dartMessengerTaskQueue = this.createdTaskQueues.get(taskQueue);
/* 51 */                if (dartMessengerTaskQueue == null) {
/* 56 */                    C1951n4.m6859j("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
/* 59 */                    return;
                        }
                    } else {
/* 60 */                dartMessengerTaskQueue = null;
                    }
/* 82 */            Log.m4589v(TAG, "Setting handler for channel '" + str + "'");
                    synchronized (this.handlersLock) {
                        try {
/* 95 */                    this.messageHandlers.put(str, new HandlerInfo(binaryMessageHandler, dartMessengerTaskQueue));
/* 100 */                   List<BufferedMessageInfo> listRemove = this.bufferedMessages.remove(str);
/* 106 */                   if (listRemove == null) {
/* 109 */                       return;
                            }
/* 122 */                   for (BufferedMessageInfo bufferedMessageInfo : listRemove) {
/* 147 */                       dispatchMessageToQueue(str, this.messageHandlers.get(str), bufferedMessageInfo.message, bufferedMessageInfo.replyId, bufferedMessageInfo.messageData);
                            }
                        } catch (Throwable th) {
/* 153 */                   throw th;
                        }
                    }
                }

/* 61 */        public DartMessenger(FlutterJNI flutterJNI) {
/* 62 */            this(flutterJNI, new DefaultTaskQueueFactory());
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
/* 94 */        public void send(String str, ByteBuffer byteBuffer) {
                    Log.m4589v(TAG, "Sending message over channel '" + str + "'");
/* 96 */            send(str, byteBuffer, null);
                }

                @Override // io.flutter.plugin.common.BinaryMessenger
/* 153 */       public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
/* 154 */           setMessageHandler(str, binaryMessageHandler, null);
                }
            }
