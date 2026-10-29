            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.webkit.WebResourceRequest;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.HashMap;
            import java.util.Map;
            import p000.AbstractC2062p9;
            import p000.b73;
            import p000.fm0;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class WebResourceRequestExt {
                private boolean hasGesture;
                private Map<String, String> headers;
                private boolean isForMainFrame;
                private boolean isRedirect;
                private String method;
                private String url;

                public WebResourceRequestExt(String str, Map<String, String> map, boolean z, boolean z2, boolean z3, String str2) {
/* 4 */             this.url = str;
/* 6 */             this.headers = map;
/* 8 */             this.isRedirect = z;
/* 10 */            this.hasGesture = z2;
/* 12 */            this.isForMainFrame = z3;
/* 14 */            this.method = str2;
                }

                public static WebResourceRequestExt fromWebResourceRequest(WebResourceRequest webResourceRequest) {
                    boolean zIsRedirect;
/* 7 */             if (xe2.m9786x("WEB_RESOURCE_REQUEST_IS_REDIRECT")) {
/* 11 */                b73.f2312m.getClass();
/* 14 */                zIsRedirect = AbstractC2062p9.m7363j(webResourceRequest);
                    } else {
/* 20 */                zIsRedirect = webResourceRequest.isRedirect();
                    }
/* 51 */            return new WebResourceRequestExt(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders(), zIsRedirect, webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame(), webResourceRequest.getMethod());
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                WebResourceRequestExt webResourceRequestExt = (WebResourceRequestExt) obj;
/* 25 */                if (this.isRedirect != webResourceRequestExt.isRedirect || this.hasGesture != webResourceRequestExt.hasGesture || this.isForMainFrame != webResourceRequestExt.isForMainFrame || !this.url.equals(webResourceRequestExt.url)) {
/* 5 */                     return false;
                        }
/* 53 */                Map<String, String> map = this.headers;
/* 55 */                Map<String, String> map2 = webResourceRequestExt.headers;
/* 57 */                if (map == null ? map2 != null : !map.equals(map2)) {
/* 5 */                     return false;
                        }
/* 69 */                String str = this.method;
/* 71 */                String str2 = webResourceRequestExt.method;
/* 73 */                if (str != null) {
/* 75 */                    return str.equals(str2);
                        }
/* 80 */                if (str2 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public Map<String, String> getHeaders() {
/* 1 */             return this.headers;
                }

                public String getMethod() {
/* 1 */             return this.method;
                }

                public String getUrl() {
/* 1 */             return this.url;
                }

                public int hashCode() {
/* 7 */             int iHashCode = this.url.hashCode() * 31;
/* 9 */             Map<String, String> map = this.headers;
/* 36 */            int iHashCode2 = (((((((iHashCode + (map != null ? map.hashCode() : 0)) * 31) + (this.isRedirect ? 1 : 0)) * 31) + (this.hasGesture ? 1 : 0)) * 31) + (this.isForMainFrame ? 1 : 0)) * 31;
/* 38 */            String str = this.method;
/* 46 */            return iHashCode2 + (str != null ? str.hashCode() : 0);
                }

                public boolean isForMainFrame() {
/* 1 */             return this.isForMainFrame;
                }

                public boolean isHasGesture() {
/* 1 */             return this.hasGesture;
                }

                public boolean isRedirect() {
/* 1 */             return this.isRedirect;
                }

                public void setForMainFrame(boolean z) {
/* 1 */             this.isForMainFrame = z;
                }

                public void setHasGesture(boolean z) {
/* 1 */             this.hasGesture = z;
                }

                public void setHeaders(Map<String, String> map) {
/* 1 */             this.headers = map;
                }

                public void setMethod(String str) {
/* 1 */             this.method = str;
                }

                public void setRedirect(boolean z) {
/* 1 */             this.isRedirect = z;
                }

                public void setUrl(String str) {
/* 1 */             this.url = str;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("url", this.url);
/* 17 */            map.put("headers", this.headers);
/* 28 */            map.put("isRedirect", Boolean.valueOf(this.isRedirect));
/* 39 */            map.put("hasGesture", Boolean.valueOf(this.hasGesture));
/* 50 */            map.put("isForMainFrame", Boolean.valueOf(this.isForMainFrame));
/* 57 */            map.put(FirebaseAnalytics.Param.METHOD, this.method);
/* 60 */            return map;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("WebResourceRequestExt{url=");
/* 10 */            sb.append(this.url);
/* 15 */            sb.append(", headers=");
/* 20 */            sb.append(this.headers);
/* 25 */            sb.append(", isRedirect=");
/* 30 */            sb.append(this.isRedirect);
/* 35 */            sb.append(", hasGesture=");
/* 40 */            sb.append(this.hasGesture);
/* 45 */            sb.append(", isForMainFrame=");
/* 50 */            sb.append(this.isForMainFrame);
/* 55 */            sb.append(", method='");
/* 62 */            return fm0.m3789o(sb, this.method, "'}");
                }
            }
