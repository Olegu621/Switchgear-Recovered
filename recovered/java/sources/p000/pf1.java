            package p000;

            import android.os.Build;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pf1 {

                /* JADX INFO: renamed from: a */
                public qf1 f15098a;

                public pf1(String str, int i, int i2) {
/* 8 */             if (Build.VERSION.SDK_INT >= 28) {
/* 15 */                this.f15098a = new rf1(str, i, i2);
/* 17 */                return;
                    }
/* 20 */            sf1 sf1Var = new sf1();
/* 23 */            sf1Var.f16572a = str;
/* 25 */            sf1Var.f16573b = i;
/* 27 */            sf1Var.f16574c = i2;
/* 29 */            this.f15098a = sf1Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof pf1) {
/* 17 */                return this.f15098a.equals(((pf1) obj).f15098a);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.f15098a.hashCode();
                }
            }
