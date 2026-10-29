            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.HashMap;
            import java.util.Map;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class DownloadStartRequest {
                private String contentDisposition;
                private long contentLength;
                private String mimeType;
                private String suggestedFilename;
                private String textEncodingName;
                private String url;
                private String userAgent;

                public DownloadStartRequest(String str, String str2, String str3, String str4, long j, String str5, String str6) {
/* 4 */             this.url = str;
/* 6 */             this.userAgent = str2;
/* 8 */             this.contentDisposition = str3;
/* 10 */            this.mimeType = str4;
/* 12 */            this.contentLength = j;
/* 14 */            this.suggestedFilename = str5;
/* 16 */            this.textEncodingName = str6;
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                DownloadStartRequest downloadStartRequest = (DownloadStartRequest) obj;
/* 27 */                if (this.contentLength != downloadStartRequest.contentLength || !this.url.equals(downloadStartRequest.url) || !this.userAgent.equals(downloadStartRequest.userAgent) || !this.contentDisposition.equals(downloadStartRequest.contentDisposition) || !this.mimeType.equals(downloadStartRequest.mimeType)) {
/* 5 */                     return false;
                        }
/* 74 */                String str = this.suggestedFilename;
/* 76 */                String str2 = downloadStartRequest.suggestedFilename;
/* 78 */                if (str == null ? str2 != null : !str.equals(str2)) {
/* 5 */                     return false;
                        }
/* 90 */                String str3 = this.textEncodingName;
/* 92 */                String str4 = downloadStartRequest.textEncodingName;
/* 94 */                if (str3 != null) {
/* 96 */                    return str3.equals(str4);
                        }
/* 101 */               if (str4 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public String getContentDisposition() {
/* 1 */             return this.contentDisposition;
                }

                public long getContentLength() {
/* 1 */             return this.contentLength;
                }

                public String getMimeType() {
/* 1 */             return this.mimeType;
                }

                public String getSuggestedFilename() {
/* 1 */             return this.suggestedFilename;
                }

                public String getTextEncodingName() {
/* 1 */             return this.textEncodingName;
                }

                public String getUrl() {
/* 1 */             return this.url;
                }

                public String getUserAgent() {
/* 1 */             return this.userAgent;
                }

                public int hashCode() {
/* 24 */            int iM7485h = pm2.m7485h(pm2.m7485h(pm2.m7485h(this.url.hashCode() * 31, 31, this.userAgent), 31, this.contentDisposition), 31, this.mimeType);
/* 28 */            long j = this.contentLength;
/* 37 */            int i = (iM7485h + ((int) (j ^ (j >>> 32)))) * 31;
/* 38 */            String str = this.suggestedFilename;
/* 50 */            int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
/* 51 */            String str2 = this.textEncodingName;
/* 59 */            return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public void setContentDisposition(String str) {
/* 1 */             this.contentDisposition = str;
                }

                public void setContentLength(long j) {
/* 1 */             this.contentLength = j;
                }

                public void setMimeType(String str) {
/* 1 */             this.mimeType = str;
                }

                public void setSuggestedFilename(String str) {
/* 1 */             this.suggestedFilename = str;
                }

                public void setTextEncodingName(String str) {
/* 1 */             this.textEncodingName = str;
                }

                public void setUrl(String str) {
/* 1 */             this.url = str;
                }

                public void setUserAgent(String str) {
/* 1 */             this.userAgent = str;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("url", this.url);
/* 17 */            map.put("userAgent", this.userAgent);
/* 24 */            map.put("contentDisposition", this.contentDisposition);
/* 31 */            map.put("mimeType", this.mimeType);
/* 42 */            map.put("contentLength", Long.valueOf(this.contentLength));
/* 49 */            map.put("suggestedFilename", this.suggestedFilename);
/* 56 */            map.put("textEncodingName", this.textEncodingName);
/* 59 */            return map;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("DownloadStartRequest{url='");
/* 10 */            sb.append(this.url);
/* 15 */            sb.append("', userAgent='");
/* 20 */            sb.append(this.userAgent);
/* 25 */            sb.append("', contentDisposition='");
/* 30 */            sb.append(this.contentDisposition);
/* 35 */            sb.append("', mimeType='");
/* 40 */            sb.append(this.mimeType);
/* 45 */            sb.append("', contentLength=");
/* 50 */            sb.append(this.contentLength);
/* 55 */            sb.append(", suggestedFilename='");
/* 60 */            sb.append(this.suggestedFilename);
/* 65 */            sb.append("', textEncodingName='");
/* 72 */            return fm0.m3789o(sb, this.textEncodingName, "'}");
                }
            }
