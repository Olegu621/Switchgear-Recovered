            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ge1 extends AbstractC1910m0 {

                /* JADX INFO: renamed from: b */
                public Integer f8569b;

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 10 */            Map mapM6963d = nc1.m6963d(new Pair("percentProgress", this.f8569b));
/* 16 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 31 */            for (Map.Entry entry : mapM6963d.entrySet()) {
/* 45 */                if (((Integer) entry.getValue()) != null) {
/* 55 */                    linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
/* 59 */            return linkedHashMap;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 3 */             return mn0.m6697m("ad_skip");
                }
            }
