            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.util.Arrays;
            import java.util.Map;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class CustomSchemeResponse {
                private String contentEncoding;
                private String contentType;
                private byte[] data;

                public CustomSchemeResponse(byte[] bArr, String str, String str2) {
/* 4 */             this.data = bArr;
/* 6 */             this.contentType = str;
/* 8 */             this.contentEncoding = str2;
                }

                public static CustomSchemeResponse fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 31 */            return new CustomSchemeResponse((byte[]) map.get(SharedDataContentProvider.BASE_PATH), (String) map.get("contentType"), (String) map.get("contentEncoding"));
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            CustomSchemeResponse customSchemeResponse = (CustomSchemeResponse) obj;
/* 29 */            if (Arrays.equals(this.data, customSchemeResponse.data) && this.contentType.equals(customSchemeResponse.contentType)) {
/* 47 */                return this.contentEncoding.equals(customSchemeResponse.contentEncoding);
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

                public int hashCode() {
/* 22 */            return this.contentEncoding.hashCode() + pm2.m7485h(Arrays.hashCode(this.data) * 31, 31, this.contentType);
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

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("CustomSchemeResponse{data=");
/* 14 */            sb.append(Arrays.toString(this.data));
/* 19 */            sb.append(", contentType='");
/* 24 */            sb.append(this.contentType);
/* 29 */            sb.append("', contentEncoding='");
/* 36 */            return fm0.m3789o(sb, this.contentEncoding, "'}");
                }
            }
