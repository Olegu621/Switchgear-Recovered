            package p000;

            import kotlin.text.StringsKt;
            
            /* JADX INFO: renamed from: ht */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1003ht {

                /* JADX INFO: renamed from: a */
                public static final C1003ht f9226a = new C1003ht();

                /* JADX INFO: renamed from: b */
                public static final C0840dd f9227b = new C0840dd();

                /* JADX INFO: renamed from: c */
                public static int f9228c;

                /* JADX INFO: renamed from: d */
                public static final int f9229d;

                static {
                    Object n42Var;
                    try {
/* 15 */                m42 m42Var = o42.f14612b;
/* 19 */                String property = System.getProperty("kotlinx.serialization.json.pool.size");
/* 23 */                property.getClass();
/* 26 */                n42Var = StringsKt.toIntOrNull(property);
                    } catch (Throwable th) {
/* 32 */                m42 m42Var2 = o42.f14612b;
/* 36 */                n42Var = new n42(th);
                    }
/* 43 */            if (n42Var instanceof n42) {
/* 45 */                n42Var = null;
                    }
/* 46 */            Integer num = (Integer) n42Var;
/* 57 */            f9229d = num != null ? num.intValue() : 1048576;
                }
            }
