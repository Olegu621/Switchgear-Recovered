            package p000;

            import android.content.Context;
            import android.os.Handler;
            import android.os.Looper;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yg3 {

                /* JADX INFO: renamed from: a */
                public final wq3 f19605a;

                /* JADX INFO: renamed from: b */
                public final df3 f19606b;

                /* JADX INFO: renamed from: c */
                public final Context f19607c;

                public yg3(wq3 wq3Var, df3 df3Var, Context context) {
/* 10 */            new Handler(Looper.getMainLooper());
/* 13 */            this.f19605a = wq3Var;
/* 15 */            this.f19606b = df3Var;
/* 17 */            this.f19607c = context;
                }

                /* JADX INFO: renamed from: a */
                public final synchronized void m10148a(C1922mc c1922mc) {
/* 2 */             df3 df3Var = this.f19606b;
                    synchronized (df3Var) {
/* 12 */                df3Var.f7166a.m1530c("registerListener", new Object[0]);
/* 17 */                if (c1922mc == null) {
/* 37 */                    throw new NullPointerException("Registered Play Core listener should not be null.");
                        }
/* 21 */                df3Var.f7169d.add(c1922mc);
/* 24 */                df3Var.m3055a();
                    }
                }
            }
