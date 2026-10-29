            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
            import java.util.Map;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class HttpAuthResponse {
                private Integer action;
                private String password;
                boolean permanentPersistence;
                private String username;

                public HttpAuthResponse(String str, String str2, boolean z, Integer num) {
/* 4 */             this.username = str;
/* 6 */             this.password = str2;
/* 8 */             this.permanentPersistence = z;
/* 10 */            this.action = num;
                }

                public static HttpAuthResponse fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 43 */            return new HttpAuthResponse((String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD), ((Boolean) map.get("permanentPersistence")).booleanValue(), (Integer) map.get("action"));
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                HttpAuthResponse httpAuthResponse = (HttpAuthResponse) obj;
/* 25 */                if (this.permanentPersistence != httpAuthResponse.permanentPersistence || !this.username.equals(httpAuthResponse.username) || !this.password.equals(httpAuthResponse.password)) {
/* 5 */                     return false;
                        }
/* 50 */                Integer num = this.action;
/* 52 */                Integer num2 = httpAuthResponse.action;
/* 54 */                if (num != null) {
/* 56 */                    return num.equals(num2);
                        }
/* 61 */                if (num2 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public Integer getAction() {
/* 1 */             return this.action;
                }

                public String getPassword() {
/* 1 */             return this.password;
                }

                public String getUsername() {
/* 1 */             return this.username;
                }

                public int hashCode() {
/* 19 */            int iM7485h = (pm2.m7485h(this.username.hashCode() * 31, 31, this.password) + (this.permanentPersistence ? 1 : 0)) * 31;
/* 20 */            Integer num = this.action;
/* 30 */            return iM7485h + (num != null ? num.hashCode() : 0);
                }

                public boolean isPermanentPersistence() {
/* 1 */             return this.permanentPersistence;
                }

                public void setAction(Integer num) {
/* 1 */             this.action = num;
                }

                public void setPassword(String str) {
/* 1 */             this.password = str;
                }

                public void setPermanentPersistence(boolean z) {
/* 1 */             this.permanentPersistence = z;
                }

                public void setUsername(String str) {
/* 1 */             this.username = str;
                }

                public String toString() {
/* 48 */            return "HttpAuthResponse{username='" + this.username + "', password='" + this.password + "', permanentPersistence=" + this.permanentPersistence + ", action=" + this.action + '}';
                }
            }
