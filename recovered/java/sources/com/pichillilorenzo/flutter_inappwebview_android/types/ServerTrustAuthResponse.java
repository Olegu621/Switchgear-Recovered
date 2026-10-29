            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ServerTrustAuthResponse {
                private Integer action;

                public ServerTrustAuthResponse(Integer num) {
/* 4 */             this.action = num;
                }

                public static ServerTrustAuthResponse fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 15 */            return new ServerTrustAuthResponse((Integer) map.get("action"));
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 21 */                Integer num = this.action;
/* 23 */                Integer num2 = ((ServerTrustAuthResponse) obj).action;
/* 25 */                if (num != null) {
/* 27 */                    return num.equals(num2);
                        }
/* 32 */                if (num2 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public Integer getAction() {
/* 1 */             return this.action;
                }

                public int hashCode() {
/* 1 */             Integer num = this.action;
/* 3 */             if (num != null) {
/* 5 */                 return num.hashCode();
                    }
/* 10 */            return 0;
                }

                public void setAction(Integer num) {
/* 1 */             this.action = num;
                }

                public String toString() {
/* 18 */            return "ServerTrustAuthResponse{action=" + this.action + '}';
                }
            }
