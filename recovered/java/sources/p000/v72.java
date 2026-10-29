            package p000;

            import java.util.HashMap;
            import java.util.Map;
            import java.util.UUID;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v72 extends AbstractC1910m0 {

                /* JADX INFO: renamed from: k */
                public static final /* synthetic */ int f17896k = 0;

                /* JADX INFO: renamed from: b */
                public final String f17897b;

                /* JADX INFO: renamed from: c */
                public final String f17898c;

                /* JADX INFO: renamed from: d */
                public String f17899d;

                /* JADX INFO: renamed from: e */
                public String f17900e;

                /* JADX INFO: renamed from: f */
                public String f17901f;

                /* JADX INFO: renamed from: g */
                public String f17902g;

                /* JADX INFO: renamed from: h */
                public String f17903h;

                /* JADX INFO: renamed from: i */
                public String f17904i;

                /* JADX INFO: renamed from: j */
                public String f17905j;

                public v72(String str, UUID uuid) {
/* 1 */             str.getClass();
/* 12 */            if (str.length() <= 0) {
/* 40 */                C1951n4.m6859j("Name cannot be empty");
/* 43 */                throw null;
                    }
/* 14 */            this.f17897b = str;
/* 18 */            String string = uuid != null ? uuid.toString() : null;
/* 22 */            if (string == null) {
/* 28 */                string = UUID.randomUUID().toString();
/* 32 */                string.getClass();
                    }
/* 35 */            this.f17898c = string;
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("id", this.f17898c);
/* 17 */            map.put("name", this.f17897b);
/* 20 */            String str = this.f17899d;
/* 22 */            if (str != null) {
/* 26 */                map.put("type", str);
                    }
/* 29 */            String str2 = this.f17901f;
/* 31 */            if (str2 != null) {
/* 35 */                map.put("previousId", str2);
                    }
/* 38 */            String str3 = this.f17900e;
/* 40 */            if (str3 != null) {
/* 44 */                map.put("previousName", str3);
                    }
/* 47 */            String str4 = this.f17902g;
/* 49 */            if (str4 != null) {
/* 53 */                map.put("previousType", str4);
                    }
/* 56 */            String str5 = this.f17903h;
/* 58 */            if (str5 != null) {
/* 62 */                map.put("transitionType", str5);
                    }
/* 65 */            return map;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 1 */             return "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0";
                }
            }
