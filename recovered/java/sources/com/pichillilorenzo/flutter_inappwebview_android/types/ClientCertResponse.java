            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.Map;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ClientCertResponse {
                private Integer action;
                private String certificatePassword;
                private String certificatePath;
                private String keyStoreType;

                public ClientCertResponse(String str, String str2, String str3, Integer num) {
/* 4 */             this.certificatePath = str;
/* 6 */             this.certificatePassword = str2;
/* 8 */             this.keyStoreType = str3;
/* 10 */            this.action = num;
                }

                public static ClientCertResponse fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 39 */            return new ClientCertResponse((String) map.get("certificatePath"), (String) map.get("certificatePassword"), (String) map.get("keyStoreType"), (Integer) map.get("action"));
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                ClientCertResponse clientCertResponse = (ClientCertResponse) obj;
/* 29 */                if (!this.certificatePath.equals(clientCertResponse.certificatePath)) {
/* 5 */                     return false;
                        }
/* 32 */                String str = this.certificatePassword;
/* 34 */                String str2 = clientCertResponse.certificatePassword;
/* 36 */                if (str == null ? str2 != null : !str.equals(str2)) {
/* 5 */                     return false;
                        }
/* 56 */                if (!this.keyStoreType.equals(clientCertResponse.keyStoreType)) {
/* 5 */                     return false;
                        }
/* 59 */                Integer num = this.action;
/* 61 */                Integer num2 = clientCertResponse.action;
/* 63 */                if (num != null) {
/* 65 */                    return num.equals(num2);
                        }
/* 70 */                if (num2 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public Integer getAction() {
/* 1 */             return this.action;
                }

                public String getCertificatePassword() {
/* 1 */             return this.certificatePassword;
                }

                public String getCertificatePath() {
/* 1 */             return this.certificatePath;
                }

                public String getKeyStoreType() {
/* 1 */             return this.keyStoreType;
                }

                public int hashCode() {
/* 9 */             int iHashCode = this.certificatePath.hashCode() * 31;
/* 10 */            String str = this.certificatePassword;
/* 25 */            int iM7485h = pm2.m7485h((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.keyStoreType);
/* 29 */            Integer num = this.action;
/* 37 */            return iM7485h + (num != null ? num.hashCode() : 0);
                }

                public void setAction(Integer num) {
/* 1 */             this.action = num;
                }

                public void setCertificatePassword(String str) {
/* 1 */             this.certificatePassword = str;
                }

                public void setCertificatePath(String str) {
/* 1 */             this.certificatePath = str;
                }

                public void setKeyStoreType(String str) {
/* 1 */             this.keyStoreType = str;
                }

                public String toString() {
/* 48 */            return "ClientCertResponse{certificatePath='" + this.certificatePath + "', certificatePassword='" + this.certificatePassword + "', keyStoreType='" + this.keyStoreType + "', action=" + this.action + '}';
                }
            }
