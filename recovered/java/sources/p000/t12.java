            package p000;

            import android.util.SparseArray;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class t12 {

                /* JADX INFO: renamed from: a */
                public SparseArray f16896a;

                /* JADX INFO: renamed from: b */
                public int f16897b;

                /* JADX INFO: renamed from: a */
                public final s12 m8672a(int i) {
/* 1 */             SparseArray sparseArray = this.f16896a;
/* 7 */             s12 s12Var = (s12) sparseArray.get(i);
/* 9 */             if (s12Var != null) {
/* 19 */                return s12Var;
                    }
/* 13 */            s12 s12Var2 = new s12();
/* 16 */            sparseArray.put(i, s12Var2);
/* 19 */            return s12Var2;
                }
            }
