            package com.pichillilorenzo.flutter_inappwebview_android.proxy;

            import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.kz1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 177 */   public class ProxySettings implements ISettings<kz1> {
                List<String> bypassRules = new ArrayList();
                List<String> directs = new ArrayList();
                List<ProxyRuleExt> proxyRules = new ArrayList();
                Boolean bypassSimpleHostnames = null;
                Boolean removeImplicitRules = null;
                Boolean reverseBypassEnabled = Boolean.FALSE;

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> getRealSettings(kz1 kz1Var) {
/* 1 */             toMap();
/* 6 */             new ArrayList();
/* 10 */            throw null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
                public ISettings<kz1> parse2(Map<String, Object> map) {
/* 13 */            for (Map.Entry<String, Object> entry : map.entrySet()) {
/* 21 */                String key = entry.getKey();
/* 27 */                Object value = entry.getValue();
/* 31 */                if (value != null) {
/* 34 */                    key.getClass();
                            switch (key) {
                                case "bypassSimpleHostnames":
/* 174 */                           this.bypassSimpleHostnames = (Boolean) value;
                                    break;
                                case "proxyRules":
/* 140 */                           this.proxyRules = new ArrayList();
/* 144 */                           Iterator it = ((List) value).iterator();
/* 152 */                           while (it.hasNext()) {
/* 160 */                               ProxyRuleExt proxyRuleExtFromMap = ProxyRuleExt.fromMap((Map) it.next());
/* 164 */                               if (proxyRuleExtFromMap != null) {
/* 168 */                                   this.proxyRules.add(proxyRuleExtFromMap);
                                        }
                                    }
                                    break;
                                case "reverseBypassEnabled":
/* 132 */                           this.reverseBypassEnabled = (Boolean) value;
                                    break;
                                case "removeImplicitRules":
/* 127 */                           this.removeImplicitRules = (Boolean) value;
                                    break;
                                case "bypassRules":
/* 122 */                           this.bypassRules = (List) value;
                                    break;
                                case "directs":
/* 117 */                           this.directs = (List) value;
                                    break;
                            }
                        }
                    }
/* 178 */           return this;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> toMap() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             Iterator<ProxyRuleExt> it = this.proxyRules.iterator();
/* 16 */            while (it.hasNext()) {
/* 28 */                arrayList.add(it.next().toMap());
                    }
/* 34 */            HashMap map = new HashMap();
/* 41 */            map.put("bypassRules", this.bypassRules);
/* 48 */            map.put("directs", this.directs);
/* 53 */            map.put("proxyRules", arrayList);
/* 60 */            map.put("bypassSimpleHostnames", this.bypassSimpleHostnames);
/* 67 */            map.put("removeImplicitRules", this.removeImplicitRules);
/* 74 */            map.put("reverseBypassEnabled", this.reverseBypassEnabled);
/* 77 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 178 */       public /* bridge */ /* synthetic */ ISettings<kz1> parse(Map map) {
/* 179 */           return parse2((Map<String, Object>) map);
                }
            }
