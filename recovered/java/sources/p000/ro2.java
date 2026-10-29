            package p000;

            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ro2 extends AbstractC1910m0 {

                /* JADX INFO: renamed from: b */
                public final String f16210b;

                /* JADX INFO: renamed from: c */
                public final String f16211c;

                /* JADX INFO: renamed from: d */
                public final int f16212d;

                /* JADX INFO: renamed from: e */
                public String f16213e;

                public ro2(int i, String str, String str2) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 14 */            if (str.length() <= 0) {
/* 38 */                C1951n4.m6859j("category cannot be empty");
/* 42 */                throw null;
                    }
/* 20 */            if (str2.length() <= 0) {
/* 31 */                C1951n4.m6859j("variable cannot be empty");
/* 35 */                throw null;
                    }
/* 22 */            this.f16210b = str;
/* 24 */            this.f16211c = str2;
/* 26 */            this.f16212d = i;
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("category", this.f16210b);
/* 17 */            map.put("variable", this.f16211c);
/* 28 */            map.put("timing", Integer.valueOf(this.f16212d));
/* 31 */            String str = this.f16213e;
/* 33 */            if (str != null && str.length() > 0) {
/* 43 */                map.put("label", str);
                    }
/* 46 */            return map;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 1 */             return "iglu:com.snowplowanalytics.snowplow/timing/jsonschema/1-0-0";
                }
            }
