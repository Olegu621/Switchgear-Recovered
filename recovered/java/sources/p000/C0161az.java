            package p000;

            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: renamed from: az */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0161az extends AbstractC1910m0 {

                /* JADX INFO: renamed from: b */
                public final String f2139b;

                /* JADX INFO: renamed from: c */
                public final String f2140c;

                /* JADX INFO: renamed from: d */
                public String f2141d;

                /* JADX INFO: renamed from: e */
                public String f2142e;

                public C0161az(String str, String str2) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 14 */            if (str.length() <= 0) {
/* 36 */                C1951n4.m6859j("Document ID cannot be empty");
/* 40 */                throw null;
                    }
/* 20 */            if (str2.length() <= 0) {
/* 29 */                C1951n4.m6859j("Document version cannot be empty");
/* 33 */                throw null;
                    }
/* 22 */            this.f2139b = str;
/* 24 */            this.f2140c = str2;
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("id", this.f2139b);
/* 13 */            String str = this.f2141d;
/* 15 */            if (str != null) {
/* 19 */                map.put("name", str);
                    }
/* 22 */            String str2 = this.f2142e;
/* 24 */            if (str2 != null) {
/* 28 */                map.put("description", str2);
                    }
/* 35 */            map.put("version", this.f2140c);
/* 38 */            return map;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 1 */             return "iglu:com.snowplowanalytics.snowplow/consent_document/jsonschema/1-0-0";
                }
            }
