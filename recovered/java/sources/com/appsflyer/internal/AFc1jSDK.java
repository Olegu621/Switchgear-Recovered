            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import java.util.Queue;
            import java.util.concurrent.BlockingQueue;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.RejectedExecutionHandler;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, m6176d2 = {"Lcom/appsflyer/internal/AFc1jSDK;", "Ljava/util/concurrent/ThreadPoolExecutor;", HttpUrl.FRAGMENT_ENCODE_SET, "p0", "p1", HttpUrl.FRAGMENT_ENCODE_SET, "p2", "Ljava/util/concurrent/TimeUnit;", "p3", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "p4", "Ljava/util/Queue;", "p5", "<init>", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/Queue;)V", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "getCurrencyIso4217Code", "()V", "getMonetizationNetwork", "Ljava/util/Queue;"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 25 */    public final class AFc1jSDK extends ThreadPoolExecutor {

                /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
                private final Queue<Runnable> getCurrencyIso4217Code;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                private AFc1jSDK(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, final Queue<Runnable> queue) {
/* 21 */            super(i, i2, j, timeUnit, blockingQueue, new RejectedExecutionHandler() { // from class: com.appsflyer.internal.h
                        @Override // java.util.concurrent.RejectedExecutionHandler
                        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
/* 1 */                     AFc1jSDK.getMonetizationNetwork(queue, runnable, threadPoolExecutor);
                        }
                    });
/* 1 */             timeUnit.getClass();
/* 4 */             blockingQueue.getClass();
/* 7 */             queue.getClass();
/* 24 */            this.getCurrencyIso4217Code = queue;
                }

                private final void getCurrencyIso4217Code() {
                    synchronized (this) {
/* 4 */                 int size = this.getCurrencyIso4217Code.size();
/* 9 */                 for (int i = 0; i < size; i++) {
/* 13 */                    Runnable runnablePoll = this.getCurrencyIso4217Code.poll();
/* 19 */                    if (runnablePoll == null) {
                                break;
                            }
/* 21 */                    execute(runnablePoll);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void getMonetizationNetwork(Queue queue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
/* 1 */             queue.getClass();
/* 4 */             runnable.getClass();
/* 7 */             threadPoolExecutor.getClass();
/* 10 */            queue.add(runnable);
                }

                @Override // java.util.concurrent.ThreadPoolExecutor
                public final void afterExecute(Runnable p0, Throwable p1) {
/* 1 */             p0.getClass();
/* 4 */             super.afterExecute(p0, p1);
/* 7 */             p0.getClass();
/* 10 */            if (p1 == null) {
                        try {
/* 12 */                    getCurrencyIso4217Code();
/* 15 */                    return;
                        } catch (Throwable th) {
/* 31 */                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.AF_EXECUTOR, "Error while executing rejected tasks", th, true, true, true, false, 64, null);
/* 34 */                    return;
                        }
                    }
/* 61 */            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.AF_EXECUTOR, "Error while executing task: " + p0, p1, true, true, true, false, 64, null);
                }

/* 26 */        public /* synthetic */ AFc1jSDK(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue queue, int i3, DefaultConstructorMarker defaultConstructorMarker) {
/* 28 */            this(i, i2, j, timeUnit, blockingQueue, (i3 & 32) != 0 ? new ConcurrentLinkedQueue() : queue);
                }
            }
