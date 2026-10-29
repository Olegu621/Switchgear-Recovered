            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.webkit.WebView;
            import java.util.HashMap;
            import java.util.Map;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class HitTestResult {
                private String extra;
                private int type;

                public HitTestResult(int i, String str) {
/* 4 */             this.type = i;
/* 6 */             this.extra = str;
                }

                public static HitTestResult fromWebViewHitTestResult(WebView.HitTestResult hitTestResult) {
/* 1 */             if (hitTestResult == null) {
/* 3 */                 return null;
                    }
/* 15 */            return new HitTestResult(hitTestResult.getType(), hitTestResult.getExtra());
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                HitTestResult hitTestResult = (HitTestResult) obj;
/* 25 */                if (this.type != hitTestResult.type) {
/* 5 */                     return false;
                        }
/* 28 */                String str = this.extra;
/* 30 */                String str2 = hitTestResult.extra;
/* 32 */                if (str != null) {
/* 34 */                    return str.equals(str2);
                        }
/* 39 */                if (str2 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public String getExtra() {
/* 1 */             return this.extra;
                }

                public int getType() {
/* 1 */             return this.type;
                }

                public int hashCode() {
/* 3 */             int i = this.type * 31;
/* 5 */             String str = this.extra;
/* 15 */            return i + (str != null ? str.hashCode() : 0);
                }

                public void setExtra(String str) {
/* 1 */             this.extra = str;
                }

                public void setType(int i) {
/* 1 */             this.type = i;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 14 */            map.put("type", Integer.valueOf(this.type));
/* 21 */            map.put("extra", this.extra);
/* 24 */            return map;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("HitTestResultMap{type=");
/* 10 */            sb.append(this.type);
/* 15 */            sb.append(", extra='");
/* 22 */            return fm0.m3789o(sb, this.extra, "'}");
                }
            }
