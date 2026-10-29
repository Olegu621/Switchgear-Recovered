            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.HashMap;
            import java.util.Map;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ProxyRuleExt {
                private String schemeFilter;
                private String url;

                public ProxyRuleExt(String str, String str2) {
/* 4 */             this.schemeFilter = str;
/* 6 */             this.url = str2;
                }

                public static ProxyRuleExt fromMap(Map<String, String> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 23 */            return new ProxyRuleExt(map.get("schemeFilter"), map.get("url"));
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            ProxyRuleExt proxyRuleExt = (ProxyRuleExt) obj;
/* 21 */            String str = this.schemeFilter;
/* 23 */            String str2 = proxyRuleExt.schemeFilter;
/* 25 */            if (str == null ? str2 == null : str.equals(str2)) {
/* 41 */                return this.url.equals(proxyRuleExt.url);
                    }
/* 5 */             return false;
                }

                public String getSchemeFilter() {
/* 1 */             return this.schemeFilter;
                }

                public String getUrl() {
/* 1 */             return this.url;
                }

                public int hashCode() {
/* 1 */             String str = this.schemeFilter;
/* 19 */            return this.url.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
                }

                public void setSchemeFilter(String str) {
/* 1 */             this.schemeFilter = str;
                }

                public void setUrl(String str) {
/* 1 */             this.url = str;
                }

                public Map<String, String> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("url", this.url);
/* 17 */            map.put("schemeFilter", this.schemeFilter);
/* 20 */            return map;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ProxyRuleExt{schemeFilter='");
/* 10 */            sb.append(this.schemeFilter);
/* 15 */            sb.append("', url='");
/* 22 */            return fm0.m3789o(sb, this.url, "'}");
                }
            }
