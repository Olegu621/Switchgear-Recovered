            package p000;

            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class nf2 {

                /* JADX INFO: renamed from: a */
                public static qa2 f14216a;

                /* JADX INFO: renamed from: b */
                public static final HashMap f14217b = new HashMap();

                /* JADX INFO: renamed from: a */
                public static final synchronized ht1 m6974a(String str) {
/* 4 */             str.getClass();
/* 13 */            qa2 qa2Var = (qa2) f14217b.get(str);
/* 15 */            if (qa2Var == null) {
/* 18 */                return null;
                    }
/* 20 */            ht1 ht1Var = qa2Var.f15466f;
/* 22 */            if (ht1Var == null) {
/* 26 */                ht1Var = new ht1(qa2Var);
/* 29 */                qa2Var.f15466f = ht1Var;
                    }
/* 32 */            return ht1Var;
                }
            }
