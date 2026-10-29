            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import com.google.android.gms.internal.base.zau;
            import com.google.android.gms.internal.common.zzg;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public final class wz0 implements Executor {

                /* JADX INFO: renamed from: c */
                public static volatile wz0 f18875c;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18876a;

                /* JADX INFO: renamed from: b */
                public final Object f18877b;

                public wz0() {
/* 2 */             this.f18876a = 0;
/* 17 */            this.f18877b = Executors.newFixedThreadPool(2, new ThreadFactoryC2302vp(2));
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    switch (this.f18876a) {
                        case 0:
/* 26 */                    ((ExecutorService) this.f18877b).execute(runnable);
                            break;
                        case 1:
/* 18 */                    ((zzg) this.f18877b).post(runnable);
                            break;
                        default:
/* 10 */                    ((Handler) this.f18877b).post(runnable);
                            break;
                    }
                }

/* 19 */        public wz0(Looper looper) {
                    this.f18876a = 1;
                    this.f18877b = new zzg(looper);
                }

/* 20 */        public /* synthetic */ wz0(zau zauVar) {
                    this.f18876a = 2;
                    this.f18877b = zauVar;
                }
            }
