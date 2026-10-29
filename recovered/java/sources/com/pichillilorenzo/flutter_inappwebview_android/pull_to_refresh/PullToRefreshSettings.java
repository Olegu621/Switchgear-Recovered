            package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

            import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public class PullToRefreshSettings implements ISettings<PullToRefreshLayout> {
                public static final String LOG_TAG = "PullToRefreshSettings";
                public String backgroundColor;
                public String color;
                public Integer distanceToTriggerSync;
                public Boolean enabled = Boolean.TRUE;
                public Integer size;
                public Integer slingshotDistance;

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
                public ISettings<PullToRefreshLayout> parse2(Map<String, Object> map) {
/* 13 */            for (Map.Entry<String, Object> entry : map.entrySet()) {
/* 21 */                String key = entry.getKey();
/* 27 */                Object value = entry.getValue();
/* 31 */                if (value != null) {
/* 34 */                    key.getClass();
                            switch (key) {
                                case "distanceToTriggerSync":
/* 143 */                           this.distanceToTriggerSync = (Integer) value;
                                    break;
                                case "enabled":
/* 137 */                           this.enabled = (Boolean) value;
                                    break;
                                case "size":
/* 132 */                           this.size = (Integer) value;
                                    break;
                                case "color":
/* 127 */                           this.color = (String) value;
                                    break;
                                case "backgroundColor":
/* 122 */                           this.backgroundColor = (String) value;
                                    break;
                                case "slingshotDistance":
/* 117 */                           this.slingshotDistance = (Integer) value;
                                    break;
                            }
                        }
                    }
/* 147 */           return this;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("enabled", this.enabled);
/* 17 */            map.put("color", this.color);
/* 24 */            map.put("backgroundColor", this.backgroundColor);
/* 31 */            map.put("distanceToTriggerSync", this.distanceToTriggerSync);
/* 38 */            map.put("slingshotDistance", this.slingshotDistance);
/* 45 */            map.put("size", this.size);
/* 48 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 7 */         public Map<String, Object> getRealSettings(PullToRefreshLayout pullToRefreshLayout) {
/* 8 */             return toMap();
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 148 */       public /* bridge */ /* synthetic */ ISettings<PullToRefreshLayout> parse(Map map) {
/* 149 */           return parse2((Map<String, Object>) map);
                }
            }
