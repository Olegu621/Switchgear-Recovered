            package com.pichillilorenzo.flutter_inappwebview_android.tracing;

            import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import p000.rq2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public class TracingSettings implements ISettings<rq2> {
                public static final String LOG_TAG = "TracingSettings";
                public List<Object> categories = new ArrayList();
                public Integer tracingMode;

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
                public ISettings<rq2> parse2(Map<String, Object> map) {
/* 13 */            for (Map.Entry<String, Object> entry : map.entrySet()) {
/* 21 */                String key = entry.getKey();
/* 27 */                Object value = entry.getValue();
/* 31 */                if (value != null) {
/* 34 */                    key.getClass();
/* 43 */                    if (key.equals("tracingMode")) {
/* 61 */                        this.tracingMode = (Integer) value;
                            } else if (key.equals("categories")) {
/* 56 */                        this.categories = (List) value;
                            }
                        }
                    }
/* 64 */            return this;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("categories", this.categories);
/* 17 */            map.put("tracingMode", this.tracingMode);
/* 20 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 7 */         public Map<String, Object> getRealSettings(rq2 rq2Var) {
/* 8 */             return toMap();
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 64 */        public /* bridge */ /* synthetic */ ISettings<rq2> parse(Map map) {
/* 65 */            return parse2((Map<String, Object>) map);
                }
            }
