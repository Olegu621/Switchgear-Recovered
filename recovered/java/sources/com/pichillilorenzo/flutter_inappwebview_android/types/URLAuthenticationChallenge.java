            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class URLAuthenticationChallenge {
                private URLProtectionSpace protectionSpace;

                public URLAuthenticationChallenge(URLProtectionSpace uRLProtectionSpace) {
/* 4 */             this.protectionSpace = uRLProtectionSpace;
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 29 */                return false;
                    }
/* 24 */            return this.protectionSpace.equals(((URLAuthenticationChallenge) obj).protectionSpace);
                }

                public URLProtectionSpace getProtectionSpace() {
/* 1 */             return this.protectionSpace;
                }

                public int hashCode() {
/* 3 */             return this.protectionSpace.hashCode();
                }

                public void setProtectionSpace(URLProtectionSpace uRLProtectionSpace) {
/* 1 */             this.protectionSpace = uRLProtectionSpace;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 14 */            map.put("protectionSpace", this.protectionSpace.toMap());
/* 17 */            return map;
                }

                public String toString() {
/* 18 */            return "URLAuthenticationChallenge{protectionSpace=" + this.protectionSpace + '}';
                }
            }
