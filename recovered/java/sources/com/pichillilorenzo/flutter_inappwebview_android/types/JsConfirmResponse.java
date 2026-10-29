            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class JsConfirmResponse {
                private Integer action;
                private String cancelButtonTitle;
                private String confirmButtonTitle;
                private boolean handledByClient;
                private String message;

                public JsConfirmResponse(String str, String str2, String str3, boolean z, Integer num) {
/* 4 */             this.message = str;
/* 6 */             this.confirmButtonTitle = str2;
/* 8 */             this.cancelButtonTitle = str3;
/* 10 */            this.handledByClient = z;
/* 12 */            this.action = num;
                }

                public static JsConfirmResponse fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 55 */            return new JsConfirmResponse((String) map.get("message"), (String) map.get("confirmButtonTitle"), (String) map.get("cancelButtonTitle"), ((Boolean) map.get("handledByClient")).booleanValue(), (Integer) map.get("action"));
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                JsConfirmResponse jsConfirmResponse = (JsConfirmResponse) obj;
/* 25 */                if (this.handledByClient != jsConfirmResponse.handledByClient) {
/* 5 */                     return false;
                        }
/* 28 */                String str = this.message;
/* 30 */                String str2 = jsConfirmResponse.message;
/* 32 */                if (str == null ? str2 != null : !str.equals(str2)) {
/* 5 */                     return false;
                        }
/* 44 */                String str3 = this.confirmButtonTitle;
/* 46 */                String str4 = jsConfirmResponse.confirmButtonTitle;
/* 48 */                if (str3 == null ? str4 != null : !str3.equals(str4)) {
/* 5 */                     return false;
                        }
/* 60 */                String str5 = this.cancelButtonTitle;
/* 62 */                String str6 = jsConfirmResponse.cancelButtonTitle;
/* 64 */                if (str5 == null ? str6 != null : !str5.equals(str6)) {
/* 5 */                     return false;
                        }
/* 76 */                Integer num = this.action;
/* 78 */                Integer num2 = jsConfirmResponse.action;
/* 80 */                if (num != null) {
/* 82 */                    return num.equals(num2);
                        }
/* 87 */                if (num2 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public Integer getAction() {
/* 1 */             return this.action;
                }

                public String getCancelButtonTitle() {
/* 1 */             return this.cancelButtonTitle;
                }

                public String getConfirmButtonTitle() {
/* 1 */             return this.confirmButtonTitle;
                }

                public String getMessage() {
/* 1 */             return this.message;
                }

                public int hashCode() {
/* 1 */             String str = this.message;
/* 12 */            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
/* 14 */            String str2 = this.confirmButtonTitle;
/* 25 */            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
/* 27 */            String str3 = this.cancelButtonTitle;
/* 43 */            int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.handledByClient ? 1 : 0)) * 31;
/* 45 */            Integer num = this.action;
/* 53 */            return iHashCode3 + (num != null ? num.hashCode() : 0);
                }

                public boolean isHandledByClient() {
/* 1 */             return this.handledByClient;
                }

                public void setAction(Integer num) {
/* 1 */             this.action = num;
                }

                public void setCancelButtonTitle(String str) {
/* 1 */             this.cancelButtonTitle = str;
                }

                public void setConfirmButtonTitle(String str) {
/* 1 */             this.confirmButtonTitle = str;
                }

                public void setHandledByClient(boolean z) {
/* 1 */             this.handledByClient = z;
                }

                public void setMessage(String str) {
/* 1 */             this.message = str;
                }

                public String toString() {
/* 58 */            return "JsConfirmResponse{message='" + this.message + "', confirmButtonTitle='" + this.confirmButtonTitle + "', cancelButtonTitle='" + this.cancelButtonTitle + "', handledByClient=" + this.handledByClient + ", action=" + this.action + '}';
                }
            }
