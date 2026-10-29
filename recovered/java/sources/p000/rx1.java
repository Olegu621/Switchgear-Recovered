            package p000;

            import android.util.SparseArray;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class rx1 {

                /* JADX INFO: renamed from: a */
                public static final SparseArray f16337a = new SparseArray();

                /* JADX INFO: renamed from: b */
                public static final HashMap f16338b;

                static {
/* 10 */            HashMap map = new HashMap();
/* 13 */            f16338b = map;
/* 22 */            map.put(px1.f15322a, 0);
/* 32 */            map.put(px1.f15323b, 1);
/* 42 */            map.put(px1.f15324c, 2);
/* 57 */            for (px1 px1Var : map.keySet()) {
/* 79 */                f16337a.append(((Integer) f16338b.get(px1Var)).intValue(), px1Var);
                    }
                }

                /* JADX INFO: renamed from: a */
                public static int m8316a(px1 px1Var) {
/* 7 */             Integer num = (Integer) f16338b.get(px1Var);
/* 9 */             if (num != null) {
/* 11 */                return num.intValue();
                    }
/* 18 */            ds0.m3204u(px1Var, "PriorityMapping is missing known Priority value ");
/* 21 */            return 0;
                }

                /* JADX INFO: renamed from: b */
                public static px1 m8317b(int i) {
/* 7 */             px1 px1Var = (px1) f16337a.get(i);
/* 9 */             if (px1Var != null) {
/* 11 */                return px1Var;
                    }
/* 18 */            C1951n4.m6859j(fm0.m3781g(i, "Unknown Priority for value "));
/* 21 */            return null;
                }
            }
