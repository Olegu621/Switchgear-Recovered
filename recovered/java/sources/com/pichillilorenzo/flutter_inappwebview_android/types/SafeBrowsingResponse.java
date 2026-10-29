            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SafeBrowsingResponse {
                private Integer action;
                private boolean report;

                public SafeBrowsingResponse(boolean z, Integer num) {
/* 4 */             this.report = z;
/* 6 */             this.action = num;
                }

                public static SafeBrowsingResponse fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 27 */            return new SafeBrowsingResponse(((Boolean) map.get("report")).booleanValue(), (Integer) map.get("action"));
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                SafeBrowsingResponse safeBrowsingResponse = (SafeBrowsingResponse) obj;
/* 25 */                if (this.report != safeBrowsingResponse.report) {
/* 5 */                     return false;
                        }
/* 28 */                Integer num = this.action;
/* 30 */                Integer num2 = safeBrowsingResponse.action;
/* 32 */                if (num != null) {
/* 34 */                    return num.equals(num2);
                        }
/* 39 */                if (num2 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public Integer getAction() {
/* 1 */             return this.action;
                }

                public int hashCode() {
/* 3 */             int i = (this.report ? 1 : 0) * 31;
/* 5 */             Integer num = this.action;
/* 15 */            return i + (num != null ? num.hashCode() : 0);
                }

                public boolean isReport() {
/* 1 */             return this.report;
                }

                public void setAction(Integer num) {
/* 1 */             this.action = num;
                }

                public void setReport(boolean z) {
/* 1 */             this.report = z;
                }

                public String toString() {
/* 28 */            return "SafeBrowsingResponse{report=" + this.report + ", action=" + this.action + '}';
                }
            }
