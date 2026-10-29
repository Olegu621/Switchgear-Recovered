            package com.pichillilorenzo.flutter_inappwebview_android.webview;

            import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 50 */    public class ContextMenuSettings implements ISettings<Object> {
                public static final String LOG_TAG = "ContextMenuOptions";
                public Boolean hideDefaultSystemContextMenuItems = Boolean.FALSE;

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> getRealSettings(Object obj) {
/* 1 */             return toMap();
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
                public ISettings<Object> parse2(Map<String, Object> map) {
/* 13 */            for (Map.Entry<String, Object> entry : map.entrySet()) {
/* 21 */                String key = entry.getKey();
/* 27 */                Object value = entry.getValue();
/* 31 */                if (value != null) {
/* 34 */                    key.getClass();
/* 43 */                    if (key.equals("hideDefaultSystemContextMenuItems")) {
/* 48 */                        this.hideDefaultSystemContextMenuItems = (Boolean) value;
                            }
                        }
                    }
/* 51 */            return this;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("hideDefaultSystemContextMenuItems", this.hideDefaultSystemContextMenuItems);
/* 13 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 51 */        public /* bridge */ /* synthetic */ ISettings<Object> parse(Map map) {
/* 52 */            return parse2((Map<String, Object>) map);
                }
            }
