            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.HashMap;
            import java.util.Map;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class WebMessagePortCompatExt {
                private int index;
                private String webMessageChannelId;

                public WebMessagePortCompatExt(int i, String str) {
/* 4 */             this.index = i;
/* 6 */             this.webMessageChannelId = str;
                }

                public static WebMessagePortCompatExt fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 11 */            Integer num = (Integer) map.get(FirebaseAnalytics.Param.INDEX);
/* 27 */            return new WebMessagePortCompatExt(num.intValue(), (String) map.get("webMessageChannelId"));
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            WebMessagePortCompatExt webMessagePortCompatExt = (WebMessagePortCompatExt) obj;
/* 25 */            if (this.index != webMessagePortCompatExt.index) {
/* 5 */                 return false;
                    }
/* 32 */            return this.webMessageChannelId.equals(webMessagePortCompatExt.webMessageChannelId);
                }

                public int getIndex() {
/* 1 */             return this.index;
                }

                public String getWebMessageChannelId() {
/* 1 */             return this.webMessageChannelId;
                }

                public int hashCode() {
/* 11 */            return this.webMessageChannelId.hashCode() + (this.index * 31);
                }

                public void setIndex(int i) {
/* 1 */             this.index = i;
                }

                public void setWebMessageChannelId(String str) {
/* 1 */             this.webMessageChannelId = str;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 14 */            map.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.index));
/* 21 */            map.put("webMessageChannelId", this.webMessageChannelId);
/* 24 */            return map;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("WebMessagePortCompatExt{index=");
/* 10 */            sb.append(this.index);
/* 15 */            sb.append(", webMessageChannelId='");
/* 22 */            return fm0.m3789o(sb, this.webMessageChannelId, "'}");
                }
            }
