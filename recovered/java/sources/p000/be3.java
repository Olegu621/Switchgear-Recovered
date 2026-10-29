            package p000;

            import android.os.Handler;
            import com.google.android.gms.internal.measurement.zzcn;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class be3 {

                /* JADX INFO: renamed from: d */
                public static volatile zzcn f2392d;

                /* JADX INFO: renamed from: a */
                public final jk3 f2393a;

                /* JADX INFO: renamed from: b */
                public final cp0 f2394b;

                /* JADX INFO: renamed from: c */
                public volatile long f2395c;

                public be3(jk3 jk3Var) {
/* 4 */             kb1.m6061n(jk3Var);
/* 7 */             this.f2393a = jk3Var;
/* 17 */            this.f2394b = new cp0(this, jk3Var, 24, false);
                }

                /* JADX INFO: renamed from: a */
                public abstract void mo1347a();

                /* JADX INFO: renamed from: b */
                public final void m1348b(long j) {
/* 1 */             m1349c();
/* 8 */             if (j >= 0) {
/* 10 */                jk3 jk3Var = this.f2393a;
/* 18 */                ((xt0) jk3Var.mo4562f()).getClass();
/* 25 */                this.f2395c = System.currentTimeMillis();
/* 37 */                if (m1350d().postDelayed(this.f2394b, j)) {
/* 54 */                    return;
                        }
/* 51 */                jk3Var.mo4557a().f17538f.m8511b(Long.valueOf(j), "Failed to schedule delayed post. time");
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m1349c() {
/* 3 */             this.f2395c = 0L;
/* 11 */            m1350d().removeCallbacks(this.f2394b);
                }

                /* JADX INFO: renamed from: d */
                public final Handler m1350d() {
                    zzcn zzcnVar;
/* 3 */             if (f2392d != null) {
/* 5 */                 return f2392d;
                    }
                    synchronized (be3.class) {
                        try {
/* 13 */                    if (f2392d == null) {
/* 30 */                        f2392d = new zzcn(this.f2393a.mo4561e().getMainLooper());
                            }
/* 35 */                    zzcnVar = f2392d;
                        } catch (Throwable th) {
/* 40 */                    throw th;
                        }
                    }
/* 38 */            return zzcnVar;
                }
            }
