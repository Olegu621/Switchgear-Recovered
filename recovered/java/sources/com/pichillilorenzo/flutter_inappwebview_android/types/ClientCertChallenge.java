            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.security.Principal;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ClientCertChallenge extends URLAuthenticationChallenge {
                private String[] keyTypes;
                private Principal[] principals;

                public ClientCertChallenge(URLProtectionSpace uRLProtectionSpace, Principal[] principalArr, String[] strArr) {
/* 1 */             super(uRLProtectionSpace);
/* 4 */             this.principals = principalArr;
/* 6 */             this.keyTypes = strArr;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.URLAuthenticationChallenge
                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
/* 5 */                 return false;
                    }
/* 26 */            ClientCertChallenge clientCertChallenge = (ClientCertChallenge) obj;
/* 36 */            if (Arrays.equals(this.principals, clientCertChallenge.principals)) {
/* 43 */                return Arrays.equals(this.keyTypes, clientCertChallenge.keyTypes);
                    }
/* 5 */             return false;
                }

                public String[] getKeyTypes() {
/* 1 */             return this.keyTypes;
                }

                public Principal[] getPrincipals() {
/* 1 */             return this.principals;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.URLAuthenticationChallenge
                public int hashCode() {
/* 22 */            return (((super.hashCode() * 31) + Arrays.hashCode(this.principals)) * 31) + Arrays.hashCode(this.keyTypes);
                }

                public void setKeyTypes(String[] strArr) {
/* 1 */             this.keyTypes = strArr;
                }

                public void setPrincipals(Principal[] principalArr) {
/* 1 */             this.principals = principalArr;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.URLAuthenticationChallenge
                public Map<String, Object> toMap() {
                    ArrayList arrayList;
/* 4 */             if (this.principals != null) {
/* 8 */                 arrayList = new ArrayList();
/* 15 */                for (Principal principal : this.principals) {
/* 23 */                    arrayList.add(principal.getName());
                        }
                    } else {
/* 29 */                arrayList = null;
                    }
/* 30 */            Map<String, Object> map = super.toMap();
/* 36 */            map.put("principals", arrayList);
/* 39 */            String[] strArr = this.keyTypes;
/* 49 */            map.put("keyTypes", strArr != null ? Arrays.asList(strArr) : null);
/* 52 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.URLAuthenticationChallenge
                public String toString() {
/* 43 */            return "ClientCertChallenge{principals=" + Arrays.toString(this.principals) + ", keyTypes=" + Arrays.toString(this.keyTypes) + "} " + super.toString();
                }
            }
