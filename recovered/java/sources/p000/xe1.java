            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xe1 extends AbstractC1910m0 {

                /* JADX INFO: renamed from: b */
                public String f19056b;

                /* JADX INFO: renamed from: c */
                public String f19057c;

                /* JADX INFO: renamed from: d */
                public String f19058d;

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 32 */            Map mapM7131e = oc1.m7131e(new Pair("errorCode", this.f19056b), new Pair("errorName", this.f19057c), new Pair("errorDescription", this.f19058d));
/* 38 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 53 */            for (Map.Entry entry : mapM7131e.entrySet()) {
/* 67 */                if (((String) entry.getValue()) != null) {
/* 77 */                    linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
/* 81 */            return linkedHashMap;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 3 */             return mn0.m6697m("error");
                }
            }
