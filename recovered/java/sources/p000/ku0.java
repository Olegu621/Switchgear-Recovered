            package p000;

            import android.os.Handler;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.RejectedExecutionException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public final class ku0 implements Executor {

                /* JADX INFO: renamed from: c */
                public static volatile ku0 f13011c;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13012a;

                /* JADX INFO: renamed from: b */
                public final Object f13013b;

                public ku0() {
/* 2 */             this.f13012a = 0;
/* 17 */            this.f13013b = Executors.newSingleThreadExecutor(new qs0(1));
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 1 */             int i = this.f13012a;
/* 3 */             Object obj = this.f13013b;
                    switch (i) {
                        case 0:
/* 72 */                    ((ExecutorService) obj).execute(runnable);
/* 75 */                    return;
                        case 1:
/* 35 */                    Handler handler = (Handler) obj;
/* 37 */                    runnable.getClass();
/* 44 */                    if (handler.post(runnable)) {
/* 46 */                        return;
                            }
/* 69 */                    throw new RejectedExecutionException(handler + " is shutting down");
                        case 2:
/* 31 */                    ((Executor) obj).execute(new f62(runnable, 0));
/* 34 */                    return;
                        default:
/* 14 */                    bj3 bj3Var = ((ij3) ((sl3) obj).f16749a).f9659i;
/* 16 */                    ij3.m4555l(bj3Var);
/* 19 */                    bj3Var.m1370I(runnable);
/* 22 */                    return;
                    }
                }

/* 19 */        public /* synthetic */ ku0(Object obj, int i) {
/* 20 */            this.f13012a = i;
                    this.f13013b = obj;
                }
            }
