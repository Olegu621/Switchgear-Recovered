            package okhttp3.internal.concurrent;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0019J\b\u0010\u001a\u001a\u00020\fH&J\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m6176d2 = {"Lokhttp3/internal/concurrent/Task;", HttpUrl.FRAGMENT_ENCODE_SET, "name", HttpUrl.FRAGMENT_ENCODE_SET, "cancelable", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Z)V", "getCancelable", "()Z", "getName", "()Ljava/lang/String;", "nextExecuteNanoTime", HttpUrl.FRAGMENT_ENCODE_SET, "getNextExecuteNanoTime$okhttp", "()J", "setNextExecuteNanoTime$okhttp", "(J)V", "queue", "Lokhttp3/internal/concurrent/TaskQueue;", "getQueue$okhttp", "()Lokhttp3/internal/concurrent/TaskQueue;", "setQueue$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "initQueue", HttpUrl.FRAGMENT_ENCODE_SET, "initQueue$okhttp", "runOnce", "toString", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 14 */    public abstract class Task {
                private final boolean cancelable;
                private final String name;
                private long nextExecuteNanoTime;
                private TaskQueue queue;

                public Task(String str, boolean z) {
/* 1 */             str.getClass();
/* 7 */             this.name = str;
/* 9 */             this.cancelable = z;
/* 13 */            this.nextExecuteNanoTime = -1L;
                }

                public final boolean getCancelable() {
/* 1 */             return this.cancelable;
                }

                public final String getName() {
/* 1 */             return this.name;
                }

                /* JADX INFO: renamed from: getNextExecuteNanoTime$okhttp, reason: from getter */
                public final long getNextExecuteNanoTime() {
/* 1 */             return this.nextExecuteNanoTime;
                }

                /* JADX INFO: renamed from: getQueue$okhttp, reason: from getter */
                public final TaskQueue getQueue() {
/* 1 */             return this.queue;
                }

                public final void initQueue$okhttp(TaskQueue queue) {
/* 1 */             queue.getClass();
/* 4 */             TaskQueue taskQueue = this.queue;
/* 6 */             if (taskQueue == queue) {
/* 8 */                 return;
                    }
/* 9 */             if (taskQueue == null) {
/* 11 */                this.queue = queue;
                    } else {
/* 16 */                f42.m3656l("task is in multiple queues");
                    }
                }

                public abstract long runOnce();

                public final void setNextExecuteNanoTime$okhttp(long j) {
/* 1 */             this.nextExecuteNanoTime = j;
                }

                public final void setQueue$okhttp(TaskQueue taskQueue) {
/* 1 */             this.queue = taskQueue;
                }

                public String toString() {
/* 1 */             return this.name;
                }

/* 15 */        public /* synthetic */ Task(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 16 */            this(str, (i & 2) != 0 ? true : z);
                }
            }
