            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 66 */    public final class ej1 extends ea2 {

                /* JADX INFO: renamed from: a */
                public final List f7733a;

                /* JADX WARN: Illegal instructions before constructor call */
                public ej1(String str, ArrayList arrayList) {
                    String strM3791q;
/* 1 */             str.getClass();
/* 9 */             if (arrayList.size() == 1) {
/* 29 */                strM3791q = fm0.m3791q(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
                    } else {
/* 57 */                strM3791q = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
                    }
/* 62 */            super(strM3791q, null);
/* 65 */            this.f7733a = arrayList;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 67 */        public ej1(List list, String str, ej1 ej1Var) {
/* 68 */            super(str, ej1Var);
                    list.getClass();
/* 69 */            this.f7733a = list;
                }
            }
