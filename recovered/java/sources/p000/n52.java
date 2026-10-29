            package p000;

            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class n52 {

                /* JADX INFO: renamed from: a */
                public l73 f14127a;

                /* JADX INFO: renamed from: b */
                public ArrayList f14128b;

                /* JADX INFO: renamed from: a */
                public static long m6888a(v70 v70Var, long j) {
/* 1 */             l73 l73Var = v70Var.f17884d;
/* 3 */             ArrayList arrayList = v70Var.f17891k;
/* 7 */             if (l73Var instanceof bu0) {
/* 9 */                 return j;
                    }
/* 10 */            int size = arrayList.size();
/* 15 */            long jMin = j;
/* 16 */            for (int i = 0; i < size; i++) {
/* 22 */                s70 s70Var = (s70) arrayList.get(i);
/* 26 */                if (s70Var instanceof v70) {
/* 28 */                    v70 v70Var2 = (v70) s70Var;
/* 32 */                    if (v70Var2.f17884d != l73Var) {
/* 43 */                        jMin = Math.min(jMin, m6888a(v70Var2, ((long) v70Var2.f17886f) + j));
                            }
                        }
                    }
/* 50 */            v70 v70Var3 = l73Var.f13143i;
/* 52 */            v70 v70Var4 = l73Var.f13142h;
/* 54 */            if (v70Var != v70Var3) {
/* 78 */                return jMin;
                    }
/* 60 */            long jMo6276j = j - l73Var.mo6276j();
/* 73 */            return Math.min(Math.min(jMin, m6888a(v70Var4, jMo6276j)), jMo6276j - ((long) v70Var4.f17886f));
                }

                /* JADX INFO: renamed from: b */
                public static long m6889b(v70 v70Var, long j) {
/* 1 */             l73 l73Var = v70Var.f17884d;
/* 3 */             ArrayList arrayList = v70Var.f17891k;
/* 7 */             if (l73Var instanceof bu0) {
/* 9 */                 return j;
                    }
/* 10 */            int size = arrayList.size();
/* 15 */            long jMax = j;
/* 16 */            for (int i = 0; i < size; i++) {
/* 22 */                s70 s70Var = (s70) arrayList.get(i);
/* 26 */                if (s70Var instanceof v70) {
/* 28 */                    v70 v70Var2 = (v70) s70Var;
/* 32 */                    if (v70Var2.f17884d != l73Var) {
/* 43 */                        jMax = Math.max(jMax, m6889b(v70Var2, ((long) v70Var2.f17886f) + j));
                            }
                        }
                    }
/* 50 */            v70 v70Var3 = l73Var.f13142h;
/* 52 */            v70 v70Var4 = l73Var.f13143i;
/* 54 */            if (v70Var != v70Var3) {
/* 78 */                return jMax;
                    }
/* 60 */            long jMo6276j = l73Var.mo6276j() + j;
/* 73 */            return Math.max(Math.max(jMax, m6889b(v70Var4, jMo6276j)), jMo6276j - ((long) v70Var4.f17886f));
                }
            }
