            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PermissionResponse {
                private Integer action;
                private List<String> resources;

                public PermissionResponse(List<String> list, Integer num) {
/* 4 */             this.resources = list;
/* 6 */             this.action = num;
                }

                public static PermissionResponse fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 23 */            return new PermissionResponse((List) map.get("resources"), (Integer) map.get("action"));
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                PermissionResponse permissionResponse = (PermissionResponse) obj;
/* 29 */                if (!this.resources.equals(permissionResponse.resources)) {
/* 5 */                     return false;
                        }
/* 32 */                Integer num = this.action;
/* 34 */                Integer num2 = permissionResponse.action;
/* 36 */                if (num != null) {
/* 38 */                    return num.equals(num2);
                        }
/* 43 */                if (num2 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public Integer getAction() {
/* 1 */             return this.action;
                }

                public List<String> getResources() {
/* 1 */             return this.resources;
                }

                public int hashCode() {
/* 7 */             int iHashCode = this.resources.hashCode() * 31;
/* 9 */             Integer num = this.action;
/* 19 */            return iHashCode + (num != null ? num.hashCode() : 0);
                }

                public void setAction(Integer num) {
/* 1 */             this.action = num;
                }

                public void setResources(List<String> list) {
/* 1 */             this.resources = list;
                }

                public String toString() {
/* 28 */            return "PermissionResponse{resources=" + this.resources + ", action=" + this.action + '}';
                }
            }
