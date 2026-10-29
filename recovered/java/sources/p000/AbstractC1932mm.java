            package p000;
            
            /* JADX INFO: renamed from: mm */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1932mm {

                /* JADX INFO: renamed from: a */
                public static final boolean f13856a;

                static {
                    Object n42Var;
                    try {
/* 1 */                 m42 m42Var = o42.f14612b;
/* 5 */                 n42Var = Class.forName("java.lang.ClassValue");
                    } catch (Throwable th) {
/* 11 */                m42 m42Var2 = o42.f14612b;
/* 15 */                n42Var = new n42(th);
                    }
/* 22 */            if (!(n42Var instanceof n42)) {
/* 26 */                n42Var = Boolean.TRUE;
                    }
/* 28 */            Object obj = Boolean.FALSE;
/* 32 */            if (n42Var instanceof n42) {
/* 34 */                n42Var = obj;
                    }
/* 41 */            f13856a = ((Boolean) n42Var).booleanValue();
                }
            }
