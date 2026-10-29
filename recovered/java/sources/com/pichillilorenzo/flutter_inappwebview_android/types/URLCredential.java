            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
            import java.util.HashMap;
            import java.util.Map;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public class URLCredential {

                /* JADX INFO: renamed from: id */
                private Long f5334id;
                private String password;
                private Long protectionSpaceId;
                private String username;

                public URLCredential(Long l, String str, String str2, Long l2) {
/* 4 */             this.f5334id = l;
/* 6 */             this.username = str;
/* 8 */             this.password = str2;
/* 10 */            this.protectionSpaceId = l2;
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                URLCredential uRLCredential = (URLCredential) obj;
/* 21 */                String str = this.username;
/* 23 */                String str2 = uRLCredential.username;
/* 25 */                if (str == null ? str2 != null : !str.equals(str2)) {
/* 5 */                     return false;
                        }
/* 37 */                String str3 = this.password;
/* 39 */                String str4 = uRLCredential.password;
/* 41 */                if (str3 != null) {
/* 43 */                    return str3.equals(str4);
                        }
/* 48 */                if (str4 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public Long getId() {
/* 1 */             return this.f5334id;
                }

                public String getPassword() {
/* 1 */             return this.password;
                }

                public Long getProtectionSpaceId() {
/* 1 */             return this.protectionSpaceId;
                }

                public String getUsername() {
/* 1 */             return this.username;
                }

                public int hashCode() {
/* 1 */             String str = this.username;
/* 12 */            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
/* 14 */            String str2 = this.password;
/* 22 */            return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public void setId(Long l) {
/* 1 */             this.f5334id = l;
                }

                public void setPassword(String str) {
/* 1 */             this.password = str;
                }

                public void setProtectionSpaceId(Long l) {
/* 1 */             this.protectionSpaceId = l;
                }

                public void setUsername(String str) {
/* 1 */             this.username = str;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, this.username);
/* 17 */            map.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, this.password);
/* 23 */            map.put("certificates", null);
/* 28 */            map.put("persistence", null);
/* 31 */            return map;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("URLCredential{username='");
/* 10 */            sb.append(this.username);
/* 15 */            sb.append("', password='");
/* 22 */            return fm0.m3789o(sb, this.password, "'}");
                }

/* 12 */        public URLCredential(String str, String str2) {
/* 14 */            this.username = str;
/* 15 */            this.password = str2;
                }
            }
