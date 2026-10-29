            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class JsPromptResponse {
                private Integer action;
                private String cancelButtonTitle;
                private String confirmButtonTitle;
                private String defaultValue;
                private boolean handledByClient;
                private String message;
                private String value;

                public JsPromptResponse(String str, String str2, String str3, String str4, boolean z, String str5, Integer num) {
/* 4 */             this.message = str;
/* 6 */             this.defaultValue = str2;
/* 8 */             this.confirmButtonTitle = str3;
/* 10 */            this.cancelButtonTitle = str4;
/* 12 */            this.handledByClient = z;
/* 14 */            this.value = str5;
/* 16 */            this.action = num;
                }

                public static JsPromptResponse fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 73 */            return new JsPromptResponse((String) map.get("message"), (String) map.get("defaultValue"), (String) map.get("confirmButtonTitle"), (String) map.get("cancelButtonTitle"), ((Boolean) map.get("handledByClient")).booleanValue(), (String) map.get(FirebaseAnalytics.Param.VALUE), (Integer) map.get("action"));
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 20 */                JsPromptResponse jsPromptResponse = (JsPromptResponse) obj;
/* 26 */                if (this.handledByClient != jsPromptResponse.handledByClient) {
/* 5 */                     return false;
                        }
/* 29 */                String str = this.message;
/* 31 */                String str2 = jsPromptResponse.message;
/* 33 */                if (str == null ? str2 != null : !str.equals(str2)) {
/* 5 */                     return false;
                        }
/* 45 */                String str3 = this.defaultValue;
/* 47 */                String str4 = jsPromptResponse.defaultValue;
/* 49 */                if (str3 == null ? str4 != null : !str3.equals(str4)) {
/* 5 */                     return false;
                        }
/* 61 */                String str5 = this.confirmButtonTitle;
/* 63 */                String str6 = jsPromptResponse.confirmButtonTitle;
/* 65 */                if (str5 == null ? str6 != null : !str5.equals(str6)) {
/* 5 */                     return false;
                        }
/* 77 */                String str7 = this.cancelButtonTitle;
/* 79 */                String str8 = jsPromptResponse.cancelButtonTitle;
/* 81 */                if (str7 == null ? str8 != null : !str7.equals(str8)) {
/* 5 */                     return false;
                        }
/* 93 */                String str9 = this.value;
/* 95 */                String str10 = jsPromptResponse.value;
/* 97 */                if (str9 == null ? str10 != null : !str9.equals(str10)) {
/* 5 */                     return false;
                        }
/* 109 */               Integer num = this.action;
/* 111 */               Integer num2 = jsPromptResponse.action;
/* 113 */               if (num != null) {
/* 115 */                   return num.equals(num2);
                        }
/* 120 */               if (num2 == null) {
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

                public String getDefaultValue() {
/* 1 */             return this.defaultValue;
                }

                public String getMessage() {
/* 1 */             return this.message;
                }

                public String getValue() {
/* 1 */             return this.value;
                }

                public int hashCode() {
/* 1 */             String str = this.message;
/* 12 */            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
/* 14 */            String str2 = this.defaultValue;
/* 25 */            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
/* 27 */            String str3 = this.confirmButtonTitle;
/* 38 */            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
/* 40 */            String str4 = this.cancelButtonTitle;
/* 56 */            int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.handledByClient ? 1 : 0)) * 31;
/* 58 */            String str5 = this.value;
/* 69 */            int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
/* 71 */            Integer num = this.action;
/* 79 */            return iHashCode5 + (num != null ? num.hashCode() : 0);
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

                public void setDefaultValue(String str) {
/* 1 */             this.defaultValue = str;
                }

                public void setHandledByClient(boolean z) {
/* 1 */             this.handledByClient = z;
                }

                public void setMessage(String str) {
/* 1 */             this.message = str;
                }

                public void setValue(String str) {
/* 1 */             this.value = str;
                }

                public String toString() {
/* 78 */            return "JsPromptResponse{message='" + this.message + "', defaultValue='" + this.defaultValue + "', confirmButtonTitle='" + this.confirmButtonTitle + "', cancelButtonTitle='" + this.cancelButtonTitle + "', handledByClient=" + this.handledByClient + ", value='" + this.value + "', action=" + this.action + '}';
                }
            }
