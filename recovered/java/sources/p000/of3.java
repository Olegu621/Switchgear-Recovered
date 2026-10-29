            package p000;

            import android.os.Bundle;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class of3 extends eg3 {

                /* JADX INFO: renamed from: b */
                public final C1024id f14738b;

                /* JADX INFO: renamed from: c */
                public final C1024id f14739c;

                /* JADX INFO: renamed from: d */
                public long f14740d;

                public of3(ij3 ij3Var) {
/* 1 */             super(ij3Var);
/* 9 */             this.f14739c = new C1024id();
/* 16 */            this.f14738b = new C1024id();
                }

                /* JADX INFO: renamed from: A */
                public final void m7161A(String str, long j) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             if (str == null || str.length() == 0) {
/* 32 */                uh3 uh3Var = ij3Var.f9655f;
/* 34 */                ij3.m4555l(uh3Var);
/* 41 */                uh3Var.f17538f.m8510a("Ad unit id must be a non-empty string");
                    } else {
/* 14 */                bj3 bj3Var = ij3Var.f9659i;
/* 16 */                ij3.m4555l(bj3Var);
/* 28 */                bj3Var.m1370I(new vc3(this, str, j, 0));
                    }
                }

                /* JADX INFO: renamed from: B */
                public final void m7162B(String str, long j) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             if (str == null || str.length() == 0) {
/* 32 */                uh3 uh3Var = ij3Var.f9655f;
/* 34 */                ij3.m4555l(uh3Var);
/* 41 */                uh3Var.f17538f.m8510a("Ad unit id must be a non-empty string");
                    } else {
/* 14 */                bj3 bj3Var = ij3Var.f9659i;
/* 16 */                ij3.m4555l(bj3Var);
/* 28 */                bj3Var.m1370I(new vc3(this, str, j, 1));
                    }
                }

                /* JADX INFO: renamed from: C */
                public final void m7163C(long j) {
/* 5 */             lm3 lm3Var = ((ij3) this.f16749a).f9641W;
/* 7 */             ij3.m4554k(lm3Var);
/* 11 */            bm3 bm3VarM6503F = lm3Var.m6503F(false);
/* 15 */            C1024id c1024id = this.f14738b;
/* 31 */            for (String str : (xb1) c1024id.keySet()) {
/* 52 */                m7165E(str, j - ((Long) c1024id.getOrDefault(str, null)).longValue(), bm3VarM6503F);
                    }
/* 60 */            if (!c1024id.isEmpty()) {
/* 66 */                m7164D(j - this.f14740d, bm3VarM6503F);
                    }
/* 69 */            m7166F(j);
                }

                /* JADX INFO: renamed from: D */
                public final void m7164D(long j, bm3 bm3Var) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             if (bm3Var == null) {
/* 7 */                 uh3 uh3Var = ij3Var.f9655f;
/* 9 */                 ij3.m4555l(uh3Var);
/* 16 */                uh3Var.f17534Y.m8510a("Not logging ad exposure. No active activity");
                    } else if (j < 1000) {
/* 26 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 28 */                ij3.m4555l(uh3Var2);
/* 39 */                uh3Var2.f17534Y.m8511b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
                    } else {
/* 45 */                Bundle bundle = new Bundle();
/* 50 */                bundle.putLong("_xt", j);
/* 54 */                up3.m9072q0(bm3Var, bundle, true);
/* 57 */                sl3 sl3Var = ij3Var.f9642X;
/* 59 */                ij3.m4554k(sl3Var);
/* 66 */                sl3Var.m8556G("am", "_xa", bundle);
                    }
                }

                /* JADX INFO: renamed from: E */
                public final void m7165E(String str, long j, bm3 bm3Var) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             if (bm3Var == null) {
/* 7 */                 uh3 uh3Var = ij3Var.f9655f;
/* 9 */                 ij3.m4555l(uh3Var);
/* 16 */                uh3Var.f17534Y.m8510a("Not logging ad unit exposure. No active activity");
                    } else {
/* 24 */                if (j < 1000) {
/* 26 */                    uh3 uh3Var2 = ij3Var.f9655f;
/* 28 */                    ij3.m4555l(uh3Var2);
/* 39 */                    uh3Var2.f17534Y.m8511b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
/* 42 */                    return;
                        }
/* 45 */                Bundle bundle = new Bundle();
/* 50 */                bundle.putString("_ai", str);
/* 55 */                bundle.putLong("_xt", j);
/* 59 */                up3.m9072q0(bm3Var, bundle, true);
/* 62 */                sl3 sl3Var = ij3Var.f9642X;
/* 64 */                ij3.m4554k(sl3Var);
/* 71 */                sl3Var.m8556G("am", "_xu", bundle);
                    }
                }

                /* JADX INFO: renamed from: F */
                public final void m7166F(long j) {
/* 1 */             C1024id c1024id = this.f14738b;
/* 9 */             Iterator it = ((xb1) c1024id.keySet()).iterator();
/* 17 */            while (it.hasNext()) {
/* 29 */                c1024id.put((String) it.next(), Long.valueOf(j));
                    }
/* 37 */            if (c1024id.isEmpty()) {
/* 41 */                return;
                    }
/* 39 */            this.f14740d = j;
                }
            }
