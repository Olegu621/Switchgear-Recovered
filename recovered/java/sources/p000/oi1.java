            package p000;

            import android.util.SparseArray;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class oi1 {

                /* JADX INFO: renamed from: a */
                public final SparseArray f14770a;

                /* JADX INFO: renamed from: b */
                public qs2 f14771b;

                public oi1(int i) {
/* 9 */             this.f14770a = new SparseArray(i);
                }

                /* JADX INFO: renamed from: a */
                public final void m7174a(qs2 qs2Var, int i, int i2) {
/* 1 */             int iM8009a = qs2Var.m8009a(i);
/* 5 */             SparseArray sparseArray = this.f14770a;
/* 15 */            oi1 oi1Var = sparseArray == null ? null : (oi1) sparseArray.get(iM8009a);
/* 18 */            if (oi1Var == null) {
/* 22 */                oi1Var = new oi1(1);
/* 29 */                sparseArray.put(qs2Var.m8009a(i), oi1Var);
                    }
/* 32 */            if (i2 > i) {
/* 35 */                oi1Var.m7174a(qs2Var, i + 1, i2);
                    } else {
/* 39 */                oi1Var.f14771b = qs2Var;
                    }
                }
            }
