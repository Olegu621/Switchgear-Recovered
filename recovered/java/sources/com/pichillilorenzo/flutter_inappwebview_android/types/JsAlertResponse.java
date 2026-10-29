            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class JsAlertResponse {
                private Integer action;
                private String confirmButtonTitle;
                private boolean handledByClient;
                private String message;

                public JsAlertResponse(String str, String str2, boolean z, Integer num) {
/* 4 */             this.message = str;
/* 6 */             this.confirmButtonTitle = str2;
/* 8 */             this.handledByClient = z;
/* 10 */            this.action = num;
                }

                public static JsAlertResponse fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 43 */            return new JsAlertResponse((String) map.get("message"), (String) map.get("confirmButtonTitle"), ((Boolean) map.get("handledByClient")).booleanValue(), (Integer) map.get("action"));
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                JsAlertResponse jsAlertResponse = (JsAlertResponse) obj;
/* 25 */                if (this.handledByClient != jsAlertResponse.handledByClient) {
/* 5 */                     return false;
                        }
/* 28 */                String str = this.message;
/* 30 */                String str2 = jsAlertResponse.message;
/* 32 */                if (str == null ? str2 != null : !str.equals(str2)) {
/* 5 */                     return false;
                        }
/* 44 */                String str3 = this.confirmButtonTitle;
/* 46 */                String str4 = jsAlertResponse.confirmButtonTitle;
/* 48 */                if (str3 == null ? str4 != null : !str3.equals(str4)) {
/* 5 */                     return false;
                        }
/* 60 */                Integer num = this.action;
/* 62 */                Integer num2 = jsAlertResponse.action;
/* 64 */                if (num != null) {
/* 66 */                    return num.equals(num2);
                        }
/* 71 */                if (num2 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public Integer getAction() {
/* 1 */             return this.action;
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
/* 30 */            int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.handledByClient ? 1 : 0)) * 31;
/* 32 */            Integer num = this.action;
/* 40 */            return iHashCode2 + (num != null ? num.hashCode() : 0);
                }

                public boolean isHandledByClient() {
/* 1 */             return this.handledByClient;
                }

                public void setAction(Integer num) {
/* 1 */             this.action = num;
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
/* 48 */            return "JsAlertResponse{message='" + this.message + "', confirmButtonTitle='" + this.confirmButtonTitle + "', handledByClient=" + this.handledByClient + ", action=" + this.action + '}';
                }
            }
