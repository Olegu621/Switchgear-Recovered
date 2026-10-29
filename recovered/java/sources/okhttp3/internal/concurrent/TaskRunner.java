            package okhttp3.internal.concurrent;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.SynchronousQueue;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            import p000.AbstractC0208c9;
            import p000.f42;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 #2\u00020\u0001:\u0003\"#$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u001c\u001a\u00020\u0016J\u0015\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001fJ\u0006\u0010 \u001a\u00020\tJ\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m6176d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", HttpUrl.FRAGMENT_ENCODE_SET, "backend", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;)V", "getBackend", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "busyQueues", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/concurrent/TaskQueue;", "coordinatorWaiting", HttpUrl.FRAGMENT_ENCODE_SET, "coordinatorWakeUpAt", HttpUrl.FRAGMENT_ENCODE_SET, "nextQueueName", HttpUrl.FRAGMENT_ENCODE_SET, "readyQueues", "runnable", "Ljava/lang/Runnable;", "activeQueues", HttpUrl.FRAGMENT_ENCODE_SET, "afterRun", HttpUrl.FRAGMENT_ENCODE_SET, "task", "Lokhttp3/internal/concurrent/Task;", "delayNanos", "awaitTaskToRun", "beforeRun", "cancelAll", "kickCoordinator", "taskQueue", "kickCoordinator$okhttp", "newQueue", "runTask", "Backend", "Companion", "RealBackend", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class TaskRunner {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final TaskRunner INSTANCE = new TaskRunner(new RealBackend(Util.threadFactory(Intrinsics.m6219d(" TaskRunner", Util.okHttpName), true)));
                private static final Logger logger;
                private final Backend backend;
                private final List<TaskQueue> busyQueues;
                private boolean coordinatorWaiting;
                private long coordinatorWakeUpAt;
                private int nextQueueName;
                private final List<TaskQueue> readyQueues;
                private final Runnable runnable;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\tH&¨\u0006\u000e"}, m6176d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", HttpUrl.FRAGMENT_ENCODE_SET, "beforeTask", HttpUrl.FRAGMENT_ENCODE_SET, "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "coordinatorNotify", "coordinatorWait", "nanos", HttpUrl.FRAGMENT_ENCODE_SET, "execute", "runnable", "Ljava/lang/Runnable;", "nanoTime", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public interface Backend {
                    void beforeTask(TaskRunner taskRunner);

                    void coordinatorNotify(TaskRunner taskRunner);

                    void coordinatorWait(TaskRunner taskRunner, long nanos);

                    void execute(Runnable runnable);

                    long nanoTime();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0006\u0010\u0013\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m6176d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "(Ljava/util/concurrent/ThreadFactory;)V", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "beforeTask", HttpUrl.FRAGMENT_ENCODE_SET, "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "coordinatorNotify", "coordinatorWait", "nanos", HttpUrl.FRAGMENT_ENCODE_SET, "execute", "runnable", "Ljava/lang/Runnable;", "nanoTime", "shutdown", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class RealBackend implements Backend {
                    private final ThreadPoolExecutor executor;

                    public RealBackend(ThreadFactory threadFactory) {
/* 1 */                 threadFactory.getClass();
/* 26 */                this.executor = new ThreadPoolExecutor(0, AbstractC0208c9.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
                    }

                    @Override // okhttp3.internal.concurrent.TaskRunner.Backend
                    public void beforeTask(TaskRunner taskRunner) {
/* 1 */                 taskRunner.getClass();
                    }

                    @Override // okhttp3.internal.concurrent.TaskRunner.Backend
                    public void coordinatorNotify(TaskRunner taskRunner) {
/* 1 */                 taskRunner.getClass();
/* 4 */                 taskRunner.notify();
                    }

                    @Override // okhttp3.internal.concurrent.TaskRunner.Backend
                    public void coordinatorWait(TaskRunner taskRunner, long nanos) throws InterruptedException {
/* 1 */                 taskRunner.getClass();
/* 7 */                 long j = nanos / 1000000;
/* 10 */                long j2 = nanos - (1000000 * j);
/* 16 */                if (j > 0 || nanos > 0) {
/* 25 */                    taskRunner.wait(j, (int) j2);
                        }
                    }

                    @Override // okhttp3.internal.concurrent.TaskRunner.Backend
                    public void execute(Runnable runnable) {
/* 1 */                 runnable.getClass();
/* 6 */                 this.executor.execute(runnable);
                    }

                    @Override // okhttp3.internal.concurrent.TaskRunner.Backend
                    public long nanoTime() {
/* 1 */                 return System.nanoTime();
                    }

                    public final void shutdown() {
/* 3 */                 this.executor.shutdown();
                    }
                }

                static {
/* 40 */            Logger logger2 = Logger.getLogger(TaskRunner.class.getName());
/* 44 */            logger2.getClass();
/* 47 */            logger = logger2;
                }

                public TaskRunner(Backend backend) {
/* 1 */             backend.getClass();
/* 7 */             this.backend = backend;
/* 11 */            this.nextQueueName = 10000;
/* 18 */            this.busyQueues = new ArrayList();
/* 25 */            this.readyQueues = new ArrayList();
/* 32 */            this.runnable = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
                        @Override // java.lang.Runnable
                        public void run() {
                            Task taskAwaitTaskToRun;
                            long jNanoTime;
                            while (true) {
/* 1 */                         TaskRunner taskRunner = this.this$0;
                                synchronized (taskRunner) {
/* 4 */                             taskAwaitTaskToRun = taskRunner.awaitTaskToRun();
                                }
/* 9 */                         if (taskAwaitTaskToRun == null) {
/* 11 */                            return;
                                }
/* 12 */                        TaskQueue queue = taskAwaitTaskToRun.getQueue();
/* 16 */                        queue.getClass();
/* 19 */                        TaskRunner taskRunner2 = this.this$0;
/* 29 */                        boolean zIsLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
/* 33 */                        if (zIsLoggable) {
/* 43 */                            jNanoTime = queue.getTaskRunner().getBackend().nanoTime();
/* 1 */                             TaskLoggerKt.log(taskAwaitTaskToRun, queue, "starting");
                                } else {
/* 53 */                            jNanoTime = -1;
                                }
                                try {
/* 1 */                             taskRunner2.runTask(taskAwaitTaskToRun);
/* 58 */                            if (zIsLoggable) {
/* 1 */                                 TaskLoggerKt.log(taskAwaitTaskToRun, queue, Intrinsics.m6219d(TaskLoggerKt.formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime), "finished run in "));
                                    }
                                } catch (Throwable th) {
                                    try {
/* 92 */                                taskRunner2.getBackend().execute(this);
/* 95 */                                throw th;
                                    } catch (Throwable th2) {
/* 97 */                                if (zIsLoggable) {
/* 1 */                                     TaskLoggerKt.log(taskAwaitTaskToRun, queue, Intrinsics.m6219d(TaskLoggerKt.formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime), "failed a run in "));
                                        }
/* 125 */                               throw th2;
                                    }
                                }
                            }
                        }
                    };
                }

                private final void afterRun(Task task, long delayNanos) {
/* 3 */             if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
/* 22 */                s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", this);
/* 25 */                return;
                    }
/* 26 */            TaskQueue queue$okhttp = task.getQueue();
/* 30 */            queue$okhttp.getClass();
/* 37 */            if (queue$okhttp.getActiveTask() != task) {
/* 92 */                f42.m3656l("Check failed.");
/* 95 */                return;
                    }
/* 39 */            boolean cancelActiveTask$okhttp = queue$okhttp.getCancelActiveTask();
/* 44 */            queue$okhttp.setCancelActiveTask$okhttp(false);
/* 48 */            queue$okhttp.setActiveTask$okhttp(null);
/* 53 */            this.busyQueues.remove(queue$okhttp);
/* 60 */            if (delayNanos != -1 && !cancelActiveTask$okhttp && !queue$okhttp.getShutdown()) {
/* 71 */                queue$okhttp.scheduleAndDecide$okhttp(task, delayNanos, true);
                    }
/* 82 */            if (queue$okhttp.getFutureTasks$okhttp().isEmpty()) {
/* 89 */                return;
                    }
/* 86 */            this.readyQueues.add(queue$okhttp);
                }

                private final void beforeRun(Task task) {
/* 3 */             if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
/* 22 */                s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", this);
/* 25 */                return;
                    }
/* 28 */            task.setNextExecuteNanoTime$okhttp(-1L);
/* 31 */            TaskQueue queue$okhttp = task.getQueue();
/* 35 */            queue$okhttp.getClass();
/* 42 */            queue$okhttp.getFutureTasks$okhttp().remove(task);
/* 47 */            this.readyQueues.remove(queue$okhttp);
/* 50 */            queue$okhttp.setActiveTask$okhttp(task);
/* 55 */            this.busyQueues.add(queue$okhttp);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void runTask(Task task) {
/* 3 */             if (Util.assertionsEnabled && Thread.holdsLock(this)) {
/* 22 */                s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
/* 25 */                return;
                    }
/* 26 */            Thread threadCurrentThread = Thread.currentThread();
/* 30 */            String name = threadCurrentThread.getName();
/* 38 */            threadCurrentThread.setName(task.getName());
                    try {
/* 41 */                long jRunOnce = task.runOnce();
                        synchronized (this) {
/* 46 */                    afterRun(task, jRunOnce);
                        }
                    } finally {
                        synchronized (this) {
/* 61 */                    afterRun(task, -1L);
/* 65 */                    threadCurrentThread.setName(name);
                        }
                    }
                }

                public final List<TaskQueue> activeQueues() {
                    ArrayList arrayListM6183B;
                    synchronized (this) {
/* 6 */                 arrayListM6183B = CollectionsKt.m6183B(this.busyQueues, this.readyQueues);
                    }
/* 11 */            return arrayListM6183B;
                }

                public final Task awaitTaskToRun() {
                    boolean z;
/* 4 */             if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
/* 23 */                s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", this);
/* 3 */                 return null;
                    }
/* 33 */            while (!this.readyQueues.isEmpty()) {
/* 38 */                long jNanoTime = this.backend.nanoTime();
/* 44 */                Iterator<TaskQueue> it = this.readyQueues.iterator();
/* 48 */                long jMin = Long.MAX_VALUE;
/* 53 */                Task task = null;
                        while (true) {
/* 60 */                    if (!it.hasNext()) {
/* 104 */                       z = false;
                                break;
                            }
/* 72 */                    Task task2 = it.next().getFutureTasks$okhttp().get(0);
/* 85 */                    long jMax = Math.max(0L, task2.getNextExecuteNanoTime() - jNanoTime);
/* 91 */                    if (jMax > 0) {
/* 93 */                        jMin = Math.min(jMax, jMin);
                            } else {
/* 98 */                        if (task != null) {
/* 100 */                           z = true;
                                    break;
                                }
/* 102 */                       task = task2;
                            }
                        }
/* 105 */               if (task != null) {
/* 107 */                   beforeRun(task);
/* 110 */                   if (z || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
/* 128 */                       this.backend.execute(this.runnable);
                            }
/* 131 */                   return task;
                        }
/* 134 */               if (this.coordinatorWaiting) {
/* 141 */                   if (jMin < this.coordinatorWakeUpAt - jNanoTime) {
/* 145 */                       this.backend.coordinatorNotify(this);
                            }
/* 3 */                     return null;
                        }
/* 149 */               this.coordinatorWaiting = true;
/* 152 */               this.coordinatorWakeUpAt = jNanoTime + jMin;
                        try {
                            try {
/* 156 */                       this.backend.coordinatorWait(this, jMin);
                            } catch (InterruptedException unused) {
/* 165 */                       cancelAll();
                            }
/* 159 */                   this.coordinatorWaiting = false;
                        } catch (Throwable th) {
/* 169 */                   this.coordinatorWaiting = false;
/* 171 */                   throw th;
                        }
                    }
/* 3 */             return null;
                }

                public final void cancelAll() {
/* 7 */             int size = this.busyQueues.size() - 1;
/* 9 */             if (size >= 0) {
                        while (true) {
/* 11 */                    int i = size - 1;
/* 21 */                    this.busyQueues.get(size).cancelAllAndDecide$okhttp();
/* 24 */                    if (i < 0) {
                                break;
                            } else {
/* 27 */                        size = i;
                            }
                        }
                    }
/* 35 */            int size2 = this.readyQueues.size() - 1;
/* 37 */            if (size2 < 0) {
/* 72 */                return;
                    }
                    while (true) {
/* 39 */                int i2 = size2 - 1;
/* 43 */                TaskQueue taskQueue = this.readyQueues.get(size2);
/* 49 */                taskQueue.cancelAllAndDecide$okhttp();
/* 60 */                if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
/* 64 */                    this.readyQueues.remove(size2);
                        }
/* 67 */                if (i2 < 0) {
/* 72 */                    return;
                        } else {
/* 70 */                    size2 = i2;
                        }
                    }
                }

                public final Backend getBackend() {
/* 1 */             return this.backend;
                }

                public final void kickCoordinator$okhttp(TaskQueue taskQueue) {
/* 1 */             taskQueue.getClass();
/* 6 */             if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
/* 25 */                s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", this);
/* 28 */                return;
                    }
/* 33 */            if (taskQueue.getActiveTask() == null) {
/* 39 */                boolean zIsEmpty = taskQueue.getFutureTasks$okhttp().isEmpty();
/* 43 */                List<TaskQueue> list = this.readyQueues;
/* 45 */                if (zIsEmpty) {
/* 51 */                    list.remove(taskQueue);
                        } else {
/* 47 */                    Util.addIfAbsent(list, taskQueue);
                        }
                    }
/* 54 */            boolean z = this.coordinatorWaiting;
/* 56 */            Backend backend = this.backend;
/* 58 */            if (z) {
/* 60 */                backend.coordinatorNotify(this);
                    } else {
/* 66 */                backend.execute(this.runnable);
                    }
                }

                public final TaskQueue newQueue() {
                    int i;
                    synchronized (this) {
/* 2 */                 i = this.nextQueueName;
/* 6 */                 this.nextQueueName = i + 1;
                    }
/* 21 */            return new TaskQueue(this, Intrinsics.m6219d(Integer.valueOf(i), "Q"));
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m6176d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Logger getLogger() {
/* 1 */                 return TaskRunner.logger;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
