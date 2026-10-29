            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a82 extends AbstractC1910m0 {

                /* JADX INFO: renamed from: b */
                public Integer f114b;

                /* JADX INFO: renamed from: c */
                public Integer f115c;

                /* JADX INFO: renamed from: d */
                public Integer f116d;

                /* JADX INFO: renamed from: e */
                public Integer f117e;

                /* JADX INFO: renamed from: f */
                public Integer f118f;

                /* JADX INFO: renamed from: g */
                public Integer f119g;

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 6 */             Integer num = this.f114b;
/* 8 */             if (num != null) {
/* 20 */                linkedHashMap.put("y_offset", Integer.valueOf(num.intValue()));
                    }
/* 23 */            Integer num2 = this.f115c;
/* 25 */            if (num2 != null) {
/* 37 */                linkedHashMap.put("x_offset", Integer.valueOf(num2.intValue()));
                    }
/* 40 */            Integer num3 = this.f116d;
/* 42 */            if (num3 != null) {
/* 54 */                linkedHashMap.put("view_width", Integer.valueOf(num3.intValue()));
                    }
/* 57 */            Integer num4 = this.f117e;
/* 59 */            if (num4 != null) {
/* 71 */                linkedHashMap.put("view_height", Integer.valueOf(num4.intValue()));
                    }
/* 74 */            Integer num5 = this.f118f;
/* 76 */            if (num5 != null) {
/* 88 */                linkedHashMap.put("content_width", Integer.valueOf(num5.intValue()));
                    }
/* 91 */            Integer num6 = this.f119g;
/* 93 */            if (num6 != null) {
/* 105 */               linkedHashMap.put("content_height", Integer.valueOf(num6.intValue()));
                    }
/* 108 */           return linkedHashMap;
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
/* 1 */             return "iglu:com.snowplowanalytics.mobile/scroll_changed/jsonschema/1-0-0";
                }
            }
