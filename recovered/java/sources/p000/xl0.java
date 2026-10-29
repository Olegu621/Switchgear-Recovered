            package p000;

            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xl0 extends AbstractC1910m0 {

                /* JADX INFO: renamed from: b */
                public Integer f19244b;

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 3 */             HashMap map = new HashMap();
/* 6 */             Integer num = this.f19244b;
/* 8 */             if (num != null) {
/* 20 */                map.put("foregroundIndex", Integer.valueOf(num.intValue()));
                    }
/* 23 */            return map;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 1 */             return "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0";
                }
            }
