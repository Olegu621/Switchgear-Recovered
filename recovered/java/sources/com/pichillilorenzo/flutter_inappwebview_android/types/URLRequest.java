            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class URLRequest {
                private byte[] body;
                private Map<String, String> headers;
                private String method;
                private String url;

                public URLRequest(String str, String str2, byte[] bArr, Map<String, String> map) {
/* 4 */             this.url = str;
/* 6 */             this.method = str2;
/* 8 */             this.body = bArr;
/* 10 */            this.headers = map;
                }

                public static URLRequest fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 11 */            String str = (String) map.get("url");
/* 13 */            if (str == null) {
/* 15 */                str = "about:blank";
                    }
/* 43 */            return new URLRequest(str, (String) map.get(FirebaseAnalytics.Param.METHOD), (byte[]) map.get("body"), (Map) map.get("headers"));
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                URLRequest uRLRequest = (URLRequest) obj;
/* 21 */                String str = this.url;
/* 23 */                String str2 = uRLRequest.url;
/* 25 */                if (str == null ? str2 != null : !str.equals(str2)) {
/* 5 */                     return false;
                        }
/* 37 */                String str3 = this.method;
/* 39 */                String str4 = uRLRequest.method;
/* 41 */                if (str3 == null ? str4 != null : !str3.equals(str4)) {
/* 5 */                     return false;
                        }
/* 61 */                if (!Arrays.equals(this.body, uRLRequest.body)) {
/* 5 */                     return false;
                        }
/* 64 */                Map<String, String> map = this.headers;
/* 66 */                Map<String, String> map2 = uRLRequest.headers;
/* 68 */                if (map != null) {
/* 70 */                    return map.equals(map2);
                        }
/* 75 */                if (map2 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public byte[] getBody() {
/* 1 */             return this.body;
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
/* 1 */             String str = this.url;
/* 12 */            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
/* 14 */            String str2 = this.method;
/* 34 */            int iHashCode2 = (Arrays.hashCode(this.body) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
/* 36 */            Map<String, String> map = this.headers;
/* 44 */            return iHashCode2 + (map != null ? map.hashCode() : 0);
                }

                public void setBody(byte[] bArr) {
/* 1 */             this.body = bArr;
                }

                public void setHeaders(Map<String, String> map) {
/* 1 */             this.headers = map;
                }

                public void setMethod(String str) {
/* 1 */             this.method = str;
                }

                public void setUrl(String str) {
/* 1 */             this.url = str;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("url", this.url);
/* 17 */            map.put(FirebaseAnalytics.Param.METHOD, this.method);
/* 24 */            map.put("headers", this.headers);
/* 31 */            map.put("body", this.body);
/* 37 */            map.put("allowsCellularAccess", null);
/* 42 */            map.put("allowsConstrainedNetworkAccess", null);
/* 47 */            map.put("allowsExpensiveNetworkAccess", null);
/* 52 */            map.put("cachePolicy", null);
/* 57 */            map.put("httpShouldHandleCookies", null);
/* 62 */            map.put("httpShouldUsePipelining", null);
/* 67 */            map.put("networkServiceType", null);
/* 72 */            map.put("timeoutInterval", null);
/* 77 */            map.put("mainDocumentURL", null);
/* 82 */            map.put("assumesHTTP3Capable", null);
/* 87 */            map.put("attribution", null);
/* 90 */            return map;
                }

                public String toString() {
/* 52 */            return "URLRequest{url='" + this.url + "', method='" + this.method + "', body=" + Arrays.toString(this.body) + ", headers=" + this.headers + '}';
                }
            }
