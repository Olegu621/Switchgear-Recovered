            package okhttp3.internal.concurrent;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.logging.Level;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00013B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010!\u001a\u00020\"J\r\u0010#\u001a\u00020\u000eH\u0000¢\u0006\u0002\b$J8\u0010%\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u000e2\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0*H\u0086\bø\u0001\u0000J\u0006\u0010+\u001a\u00020,J.\u0010-\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020'2\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00020'0*H\u0086\bø\u0001\u0000J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020'J%\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\b2\u0006\u0010&\u001a\u00020'2\u0006\u00100\u001a\u00020\u000eH\u0000¢\u0006\u0002\b1J\u0006\u0010\u001c\u001a\u00020\"J\b\u00102\u001a\u00020\u0005H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, m6176d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", HttpUrl.FRAGMENT_ENCODE_SET, "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "name", HttpUrl.FRAGMENT_ENCODE_SET, "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/String;)V", "activeTask", "Lokhttp3/internal/concurrent/Task;", "getActiveTask$okhttp", "()Lokhttp3/internal/concurrent/Task;", "setActiveTask$okhttp", "(Lokhttp3/internal/concurrent/Task;)V", "cancelActiveTask", HttpUrl.FRAGMENT_ENCODE_SET, "getCancelActiveTask$okhttp", "()Z", "setCancelActiveTask$okhttp", "(Z)V", "futureTasks", HttpUrl.FRAGMENT_ENCODE_SET, "getFutureTasks$okhttp", "()Ljava/util/List;", "getName$okhttp", "()Ljava/lang/String;", "scheduledTasks", HttpUrl.FRAGMENT_ENCODE_SET, "getScheduledTasks", "shutdown", "getShutdown$okhttp", "setShutdown$okhttp", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "cancelAll", HttpUrl.FRAGMENT_ENCODE_SET, "cancelAllAndDecide", "cancelAllAndDecide$okhttp", "execute", "delayNanos", HttpUrl.FRAGMENT_ENCODE_SET, "cancelable", "block", "Lkotlin/Function0;", "idleLatch", "Ljava/util/concurrent/CountDownLatch;", "schedule", "task", "scheduleAndDecide", "recurrence", "scheduleAndDecide$okhttp", "toString", "AwaitIdleTask", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 20 */    public final class TaskQueue {
                private Task activeTask;
                private boolean cancelActiveTask;
                private final List<Task> futureTasks;
                private final String name;
                private boolean shutdown;
                private final TaskRunner taskRunner;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m6176d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "()V", "latch", "Ljava/util/concurrent/CountDownLatch;", "getLatch", "()Ljava/util/concurrent/CountDownLatch;", "runOnce", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class AwaitIdleTask extends Task {
                    private final CountDownLatch latch;

                    public AwaitIdleTask() {
/* 10 */                super(Intrinsics.m6219d(" awaitIdle", Util.okHttpName), false);
/* 19 */                this.latch = new CountDownLatch(1);
                    }

                    public final CountDownLatch getLatch() {
/* 1 */                 return this.latch;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
/* 3 */                 this.latch.countDown();
/* 6 */                 return -1L;
                    }
                }

                /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$execute$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m6176d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "runOnce", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 176)
                public static final class C20111 extends Task {
                    final /* synthetic */ Function0<Unit> $block;
                    final /* synthetic */ boolean $cancelable;
                    final /* synthetic */ String $name;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C20111(String str, boolean z, Function0<Unit> function0) {
/* 7 */                 super(str, z);
/* 1 */                 this.$name = str;
/* 3 */                 this.$cancelable = z;
/* 5 */                 this.$block = function0;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
/* 3 */                 this.$block.invoke();
/* 6 */                 return -1L;
                    }
                }

                /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$schedule$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m6176d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lokhttp3/internal/concurrent/Task;", "runOnce", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 176)
                public static final class C20122 extends Task {
                    final /* synthetic */ Function0<Long> $block;
                    final /* synthetic */ String $name;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C20122(String str, Function0<Long> function0) {
/* 8 */                 super(str, false, 2, null);
/* 1 */                 this.$name = str;
/* 3 */                 this.$block = function0;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
/* 9 */                 return ((Number) this.$block.invoke()).longValue();
                    }
                }

                public TaskQueue(TaskRunner taskRunner, String str) {
/* 1 */             taskRunner.getClass();
/* 4 */             str.getClass();
/* 10 */            this.taskRunner = taskRunner;
/* 12 */            this.name = str;
/* 19 */            this.futureTasks = new ArrayList();
                }

                public static /* synthetic */ void execute$default(TaskQueue taskQueue, String str, long j, boolean z, Function0 function0, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 j = 0;
                    }
/* 9 */             if ((i & 4) != 0) {
/* 11 */                z = true;
                    }
/* 12 */            str.getClass();
/* 15 */            function0.getClass();
/* 23 */            taskQueue.schedule(new C20111(str, z, function0), j);
                }

                public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String str, long j, Function0 function0, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 j = 0;
                    }
/* 7 */             str.getClass();
/* 10 */            function0.getClass();
/* 18 */            taskQueue.schedule(new C20122(str, function0), j);
                }

                public final void cancelAll() {
/* 3 */             if (Util.assertionsEnabled && Thread.holdsLock(this)) {
/* 22 */                s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
/* 25 */                return;
                    }
                    synchronized (this.taskRunner) {
/* 33 */                if (cancelAllAndDecide$okhttp()) {
/* 39 */                    getTaskRunner().kickCoordinator$okhttp(this);
                        }
                    }
                }

                public final boolean cancelAllAndDecide$okhttp() {
/* 1 */             Task task = this.activeTask;
/* 4 */             if (task != null) {
/* 6 */                 task.getClass();
/* 13 */                if (task.getCancelable()) {
/* 15 */                    this.cancelActiveTask = true;
                        }
                    }
/* 23 */            int size = this.futureTasks.size() - 1;
/* 24 */            boolean z = false;
/* 25 */            if (size < 0) {
/* 24 */                return false;
                    }
                    while (true) {
/* 27 */                int i = size - 1;
/* 41 */                if (this.futureTasks.get(size).getCancelable()) {
/* 45 */                    Task task2 = this.futureTasks.get(size);
/* 63 */                    if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
/* 1 */                         TaskLoggerKt.log(task2, this, "canceled");
                            }
/* 72 */                    this.futureTasks.remove(size);
/* 75 */                    z = true;
                        }
/* 76 */                if (i < 0) {
/* 78 */                    return z;
                        }
/* 79 */                size = i;
                    }
                }

                public final void execute(String name, long delayNanos, boolean cancelable, Function0<Unit> block) {
/* 1 */             name.getClass();
/* 4 */             block.getClass();
/* 12 */            schedule(new C20111(name, cancelable, block), delayNanos);
                }

                /* JADX INFO: renamed from: getActiveTask$okhttp, reason: from getter */
                public final Task getActiveTask() {
/* 1 */             return this.activeTask;
                }

                /* JADX INFO: renamed from: getCancelActiveTask$okhttp, reason: from getter */
                public final boolean getCancelActiveTask() {
/* 1 */             return this.cancelActiveTask;
                }

                public final List<Task> getFutureTasks$okhttp() {
/* 1 */             return this.futureTasks;
                }

                /* JADX INFO: renamed from: getName$okhttp, reason: from getter */
                public final String getName() {
/* 1 */             return this.name;
                }

                public final List<Task> getScheduledTasks() {
                    List<Task> listM6192K;
                    synchronized (this.taskRunner) {
/* 8 */                 listM6192K = CollectionsKt.m6192K(getFutureTasks$okhttp());
                    }
/* 13 */            return listM6192K;
                }

                /* JADX INFO: renamed from: getShutdown$okhttp, reason: from getter */
                public final boolean getShutdown() {
/* 1 */             return this.shutdown;
                }

                /* JADX INFO: renamed from: getTaskRunner$okhttp, reason: from getter */
                public final TaskRunner getTaskRunner() {
/* 1 */             return this.taskRunner;
                }

                public final CountDownLatch idleLatch() {
                    synchronized (this.taskRunner) {
/* 9 */                 if (getActiveTask() == null && getFutureTasks$okhttp().isEmpty()) {
/* 23 */                    return new CountDownLatch(0);
                        }
/* 30 */                Task activeTask = getActiveTask();
/* 36 */                if (activeTask instanceof AwaitIdleTask) {
/* 40 */                    return ((AwaitIdleTask) activeTask).getLatch();
                        }
/* 58 */                for (Task task : getFutureTasks$okhttp()) {
/* 68 */                    if (task instanceof AwaitIdleTask) {
/* 72 */                        return ((AwaitIdleTask) task).getLatch();
                            }
                        }
/* 80 */                AwaitIdleTask awaitIdleTask = new AwaitIdleTask();
/* 89 */                if (scheduleAndDecide$okhttp(awaitIdleTask, 0L, false)) {
/* 95 */                    getTaskRunner().kickCoordinator$okhttp(this);
                        }
/* 98 */                return awaitIdleTask.getLatch();
                    }
                }

                public final void schedule(Task task, long delayNanos) {
/* 1 */             task.getClass();
                    synchronized (this.taskRunner) {
/* 11 */                if (!getShutdown()) {
/* 73 */                    if (scheduleAndDecide$okhttp(task, delayNanos, false)) {
/* 79 */                        getTaskRunner().kickCoordinator$okhttp(this);
                            }
                        } else if (task.getCancelable()) {
/* 31 */                    if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
/* 1 */                         TaskLoggerKt.log(task, this, "schedule canceled (queue is shutdown)");
                            }
                        } else {
/* 55 */                    if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
/* 1 */                         TaskLoggerKt.log(task, this, "schedule failed (queue is shutdown)");
                            }
/* 67 */                    throw new RejectedExecutionException();
                        }
                    }
                }

                public final boolean scheduleAndDecide$okhttp(Task task, long delayNanos, boolean recurrence) {
/* 1 */             task.getClass();
/* 4 */             task.initQueue$okhttp(this);
/* 13 */            long jNanoTime = this.taskRunner.getBackend().nanoTime();
/* 17 */            long j = jNanoTime + delayNanos;
/* 21 */            int iIndexOf = this.futureTasks.indexOf(task);
/* 27 */            if (iIndexOf != -1) {
/* 35 */                if (task.getNextExecuteNanoTime() <= j) {
/* 49 */                    if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
/* 1 */                         TaskLoggerKt.log(task, this, "already scheduled");
                            }
/* 25 */                    return false;
                        }
/* 59 */                this.futureTasks.remove(iIndexOf);
                    }
/* 62 */            task.setNextExecuteNanoTime$okhttp(j);
/* 77 */            if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
/* 1 */                 TaskLoggerKt.log(task, this, recurrence ? Intrinsics.m6219d(TaskLoggerKt.formatDuration(j - jNanoTime), "run again after ") : Intrinsics.m6219d(TaskLoggerKt.formatDuration(j - jNanoTime), "scheduled after "));
                    }
/* 109 */           Iterator<Task> it = this.futureTasks.iterator();
/* 113 */           int size = 0;
                    while (true) {
/* 118 */               if (!it.hasNext()) {
/* 139 */                   size = -1;
                            break;
                        }
/* 133 */               if (it.next().getNextExecuteNanoTime() - jNanoTime > delayNanos) {
                            break;
                        }
/* 136 */               size++;
                    }
/* 140 */           if (size == -1) {
/* 144 */               size = this.futureTasks.size();
                    }
/* 150 */           this.futureTasks.add(size, task);
                    return size == 0;
                }

                public final void setActiveTask$okhttp(Task task) {
/* 1 */             this.activeTask = task;
                }

                public final void setCancelActiveTask$okhttp(boolean z) {
/* 1 */             this.cancelActiveTask = z;
                }

                public final void setShutdown$okhttp(boolean z) {
/* 1 */             this.shutdown = z;
                }

                public final void shutdown() {
/* 3 */             if (Util.assertionsEnabled && Thread.holdsLock(this)) {
/* 22 */                s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
/* 25 */                return;
                    }
                    synchronized (this.taskRunner) {
/* 30 */                setShutdown$okhttp(true);
/* 37 */                if (cancelAllAndDecide$okhttp()) {
/* 43 */                    getTaskRunner().kickCoordinator$okhttp(this);
                        }
                    }
                }

                public String toString() {
/* 1 */             return this.name;
                }

/* 21 */        public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long j, int i, Object obj) {
                    if ((i & 2) != 0) {
                        j = 0;
                    }
/* 22 */            taskQueue.schedule(task, j);
                }

/* 85 */        public final void schedule(String name, long delayNanos, Function0<Long> block) {
                    name.getClass();
                    block.getClass();
/* 86 */            schedule(new C20122(name, block), delayNanos);
                }
            }
