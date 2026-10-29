            package p000;

            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public class tw0 implements s81 {

                /* JADX INFO: renamed from: c */
                public static final tw0 f17292c = new tw0(null, 0);

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17293a;

                /* JADX INFO: renamed from: b */
                public final Object f17294b;

                public /* synthetic */ tw0(Object obj, int i) {
/* 1 */             this.f17293a = i;
/* 3 */             this.f17294b = obj;
                }

                @Override // p000.s81
                /* JADX INFO: renamed from: a */
                public final void mo3676a(Runnable runnable, Executor executor) {
/* 1 */             executor.getClass();
                    try {
/* 4 */                 executor.execute(runnable);
                    } catch (RuntimeException e) {
/* 33 */                hu0.m4326U("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
                    }
                }

                @Override // java.util.concurrent.Future
                public final boolean cancel(boolean z) {
/* 1 */             return false;
                }

                @Override // java.util.concurrent.Future
                public final Object get() throws ExecutionException {
                    switch (this.f17293a) {
                        case 0:
/* 16 */                    return this.f17294b;
                        default:
/* 15 */                    throw new ExecutionException((Throwable) this.f17294b);
                    }
                }

                @Override // java.util.concurrent.Future
                public final boolean isCancelled() {
/* 1 */             return false;
                }

                @Override // java.util.concurrent.Future
                public final boolean isDone() {
/* 1 */             return true;
                }

                public final String toString() {
/* 1 */             int i = this.f17293a;
/* 5 */             Object obj = this.f17294b;
                    switch (i) {
                        case 0:
/* 63 */                    return super.toString() + "[status=SUCCESS, result=[" + obj + "]]";
                        default:
/* 35 */                    return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) obj) + "]]";
                    }
                }

                @Override // java.util.concurrent.Future
/* 18 */        public final Object get(long j, TimeUnit timeUnit) {
/* 19 */            timeUnit.getClass();
/* 20 */            return get();
                }
            }
