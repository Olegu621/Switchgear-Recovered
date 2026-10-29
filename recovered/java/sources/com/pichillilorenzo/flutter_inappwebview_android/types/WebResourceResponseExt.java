            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import android.webkit.WebResourceResponse;
            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class WebResourceResponseExt {
                private String contentEncoding;
                private String contentType;
                private byte[] data;
                private Map<String, String> headers;
                private String reasonPhrase;
                private Integer statusCode;

                public WebResourceResponseExt(String str, String str2, Integer num, String str3, Map<String, String> map, byte[] bArr) {
/* 4 */             this.contentType = str;
/* 6 */             this.contentEncoding = str2;
/* 8 */             this.statusCode = num;
/* 10 */            this.reasonPhrase = str3;
/* 12 */            this.headers = map;
/* 14 */            this.data = bArr;
                }

                public static WebResourceResponseExt fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 61 */            return new WebResourceResponseExt((String) map.get("contentType"), (String) map.get("contentEncoding"), (Integer) map.get("statusCode"), (String) map.get("reasonPhrase"), (Map) map.get("headers"), (byte[]) map.get(SharedDataContentProvider.BASE_PATH));
                }

                public static WebResourceResponseExt fromWebResourceResponse(WebResourceResponse webResourceResponse) {
/* 35 */            return new WebResourceResponseExt(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), Integer.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getReasonPhrase(), webResourceResponse.getResponseHeaders(), Util.readAllBytes(webResourceResponse.getData()));
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            WebResourceResponseExt webResourceResponseExt = (WebResourceResponseExt) obj;
/* 21 */            String str = this.contentType;
/* 23 */            String str2 = webResourceResponseExt.contentType;
/* 25 */            if (str == null ? str2 != null : !str.equals(str2)) {
/* 5 */                 return false;
                    }
/* 37 */            String str3 = this.contentEncoding;
/* 39 */            String str4 = webResourceResponseExt.contentEncoding;
/* 41 */            if (str3 == null ? str4 != null : !str3.equals(str4)) {
/* 5 */                 return false;
                    }
/* 53 */            Integer num = this.statusCode;
/* 55 */            Integer num2 = webResourceResponseExt.statusCode;
/* 57 */            if (num == null ? num2 != null : !num.equals(num2)) {
/* 5 */                 return false;
                    }
/* 69 */            String str5 = this.reasonPhrase;
/* 71 */            String str6 = webResourceResponseExt.reasonPhrase;
/* 73 */            if (str5 == null ? str6 != null : !str5.equals(str6)) {
/* 5 */                 return false;
                    }
/* 85 */            Map<String, String> map = this.headers;
/* 87 */            Map<String, String> map2 = webResourceResponseExt.headers;
/* 89 */            if (map == null ? map2 == null : map.equals(map2)) {
/* 105 */               return Arrays.equals(this.data, webResourceResponseExt.data);
                    }
/* 5 */             return false;
                }

                public String getContentEncoding() {
/* 1 */             return this.contentEncoding;
                }

                public String getContentType() {
/* 1 */             return this.contentType;
                }

                public byte[] getData() {
/* 1 */             return this.data;
                }

                public Map<String, String> getHeaders() {
/* 1 */             return this.headers;
                }

                public String getReasonPhrase() {
/* 1 */             return this.reasonPhrase;
                }

                public Integer getStatusCode() {
/* 1 */             return this.statusCode;
                }

                public int hashCode() {
/* 1 */             String str = this.contentType;
/* 12 */            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
/* 14 */            String str2 = this.contentEncoding;
/* 25 */            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
/* 27 */            Integer num = this.statusCode;
/* 38 */            int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 31;
/* 40 */            String str3 = this.reasonPhrase;
/* 51 */            int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
/* 53 */            Map<String, String> map = this.headers;
/* 70 */            return Arrays.hashCode(this.data) + ((iHashCode4 + (map != null ? map.hashCode() : 0)) * 31);
                }

                public void setContentEncoding(String str) {
/* 1 */             this.contentEncoding = str;
                }

                public void setContentType(String str) {
/* 1 */             this.contentType = str;
                }

                public void setData(byte[] bArr) {
/* 1 */             this.data = bArr;
                }

                public void setHeaders(Map<String, String> map) {
/* 1 */             this.headers = map;
                }

                public void setReasonPhrase(String str) {
/* 1 */             this.reasonPhrase = str;
                }

                public void setStatusCode(Integer num) {
/* 1 */             this.statusCode = num;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("contentType", this.contentType);
/* 17 */            map.put("contentEncoding", this.contentEncoding);
/* 24 */            map.put("statusCode", this.statusCode);
/* 31 */            map.put("reasonPhrase", this.reasonPhrase);
/* 38 */            map.put("headers", this.headers);
/* 45 */            map.put(SharedDataContentProvider.BASE_PATH, this.data);
/* 48 */            return map;
                }

                public String toString() {
/* 72 */            return "WebResourceResponseExt{contentType='" + this.contentType + "', contentEncoding='" + this.contentEncoding + "', statusCode=" + this.statusCode + ", reasonPhrase='" + this.reasonPhrase + "', headers=" + this.headers + ", data=" + Arrays.toString(this.data) + '}';
                }
            }
