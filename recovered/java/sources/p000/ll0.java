            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.os.Handler;
            import java.util.concurrent.LinkedBlockingDeque;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ll0 implements rc0 {

                /* JADX INFO: renamed from: a */
                public final Context f13374a;

                /* JADX INFO: renamed from: b */
                public final C0168b5 f13375b;

                /* JADX INFO: renamed from: c */
                public final zb0 f13376c;

                /* JADX INFO: renamed from: d */
                public final Object f13377d = new Object();

                /* JADX INFO: renamed from: e */
                public Handler f13378e;

                /* JADX INFO: renamed from: f */
                public ThreadPoolExecutor f13379f;

                /* JADX INFO: renamed from: g */
                public ThreadPoolExecutor f13380g;

                /* JADX INFO: renamed from: h */
                public k50 f13381h;

                public ll0(C0168b5 c0168b5, Context context) {
/* 13 */            de3.m3027i(context, "Context cannot be null");
/* 20 */            this.f13374a = context.getApplicationContext();
/* 22 */            this.f13375b = c0168b5;
/* 26 */            this.f13376c = ml0.f13846d;
                }

                @Override // p000.rc0
                /* JADX INFO: renamed from: a */
                public final void mo6481a(k50 k50Var) {
                    synchronized (this.f13377d) {
/* 4 */                 this.f13381h = k50Var;
                    }
                    synchronized (this.f13377d) {
                        try {
/* 12 */                    if (this.f13381h == null) {
/* 15 */                        return;
                            }
/* 21 */                    if (this.f13379f == null) {
/* 43 */                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2050oy("emojiCompat"));
/* 47 */                        threadPoolExecutor.allowCoreThreadTimeOut(true);
/* 50 */                        this.f13380g = threadPoolExecutor;
/* 52 */                        this.f13379f = threadPoolExecutor;
                            }
/* 63 */                    this.f13379f.execute(new RunnableC2166s2(this, 21));
                        } catch (Throwable th) {
/* 69 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m6482b() {
                    synchronized (this.f13377d) {
                        try {
/* 5 */                     this.f13381h = null;
/* 7 */                     Handler handler = this.f13378e;
/* 9 */                     if (handler != null) {
/* 11 */                        handler.removeCallbacks(null);
                            }
/* 17 */                    this.f13378e = null;
/* 19 */                    ThreadPoolExecutor threadPoolExecutor = this.f13380g;
/* 21 */                    if (threadPoolExecutor != null) {
/* 23 */                        threadPoolExecutor.shutdown();
                            }
/* 26 */                    this.f13379f = null;
/* 28 */                    this.f13380g = null;
                        } catch (Throwable th) {
/* 33 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final vl0 m6483c() {
                    try {
/* 2 */                 zb0 zb0Var = this.f13376c;
/* 4 */                 Context context = this.f13374a;
/* 6 */                 C0168b5 c0168b5 = this.f13375b;
/* 8 */                 zb0Var.getClass();
/* 11 */                C1954n7 c1954n7M7911v = qj3.m7911v(c0168b5, context);
/* 15 */                int i = c1954n7M7911v.f14151b;
/* 17 */                if (i != 0) {
/* 46 */                    f42.m3663s(AbstractC0886en.m3505i(i, "fetchFonts failed (", ")"));
/* 1 */                     return null;
                        }
/* 21 */                vl0[] vl0VarArr = (vl0[]) c1954n7M7911v.f14152c;
/* 23 */                if (vl0VarArr != null && vl0VarArr.length != 0) {
/* 29 */                    return vl0VarArr[0];
                        }
/* 34 */                f42.m3663s("fetchFonts failed (empty result)");
/* 1 */                 return null;
                    } catch (PackageManager.NameNotFoundException e) {
/* 53 */                ds0.m3198o("provider not found", e);
/* 1 */                 return null;
                    }
                }
            }
