            package p000;

            import android.os.Looper;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class rk1 extends a91 {
                @Override // p000.a91
                /* JADX INFO: renamed from: j */
                public void mo124j(Object obj) {
/* 3 */             a91.m115a("setValue");
/* 10 */            this.f128g++;
/* 12 */            this.f126e = obj;
/* 15 */            m117c(null);
                }

                /* JADX INFO: renamed from: k */
                public final void m8193k(Object obj) {
                    boolean z;
                    synchronized (this.f122a) {
/* 12 */                z = this.f127f == a91.f121k;
/* 13 */                this.f127f = obj;
                    }
/* 16 */            if (z) {
/* 19 */                C2363xc c2363xcM9748y0 = C2363xc.m9748y0();
/* 23 */                RunnableC2495ye runnableC2495ye = this.f131j;
/* 25 */                z60 z60Var = c2363xcM9748y0.f19024k;
/* 29 */                if (z60Var.f19953m == null) {
                            synchronized (z60Var.f19951k) {
                                try {
/* 36 */                            if (z60Var.f19953m == null) {
/* 46 */                                z60Var.f19953m = z60.m10276y0(Looper.getMainLooper());
                                    }
                                } catch (Throwable th) {
/* 54 */                            throw th;
                                }
                            }
                        }
/* 57 */                z60Var.f19953m.post(runnableC2495ye);
                    }
                }
            }
