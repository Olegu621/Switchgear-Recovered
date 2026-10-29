            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class HttpAuthenticationChallenge extends URLAuthenticationChallenge {
                private int previousFailureCount;
                URLCredential proposedCredential;

                public HttpAuthenticationChallenge(URLProtectionSpace uRLProtectionSpace, int i, URLCredential uRLCredential) {
/* 1 */             super(uRLProtectionSpace);
/* 4 */             this.previousFailureCount = i;
/* 6 */             this.proposedCredential = uRLCredential;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.URLAuthenticationChallenge
                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
/* 5 */                 return false;
                    }
/* 26 */            HttpAuthenticationChallenge httpAuthenticationChallenge = (HttpAuthenticationChallenge) obj;
/* 32 */            if (this.previousFailureCount != httpAuthenticationChallenge.previousFailureCount) {
/* 5 */                 return false;
                    }
/* 35 */            URLCredential uRLCredential = this.proposedCredential;
/* 37 */            URLCredential uRLCredential2 = httpAuthenticationChallenge.proposedCredential;
/* 39 */            if (uRLCredential != null) {
/* 41 */                return uRLCredential.equals(uRLCredential2);
                    }
                    return uRLCredential2 == null;
                }

                public int getPreviousFailureCount() {
/* 1 */             return this.previousFailureCount;
                }

                public URLCredential getProposedCredential() {
/* 1 */             return this.proposedCredential;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.URLAuthenticationChallenge
                public int hashCode() {
/* 10 */            int iHashCode = ((super.hashCode() * 31) + this.previousFailureCount) * 31;
/* 12 */            URLCredential uRLCredential = this.proposedCredential;
/* 22 */            return iHashCode + (uRLCredential != null ? uRLCredential.hashCode() : 0);
                }

                public void setPreviousFailureCount(int i) {
/* 1 */             this.previousFailureCount = i;
                }

                public void setProposedCredential(URLCredential uRLCredential) {
/* 1 */             this.proposedCredential = uRLCredential;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.URLAuthenticationChallenge
                public Map<String, Object> toMap() {
/* 1 */             Map<String, Object> map = super.toMap();
/* 13 */            map.put("previousFailureCount", Integer.valueOf(this.previousFailureCount));
/* 16 */            URLCredential uRLCredential = this.proposedCredential;
/* 29 */            map.put("proposedCredential", uRLCredential != null ? uRLCredential.toMap() : null);
/* 34 */            map.put("failureResponse", null);
/* 39 */            map.put("error", null);
/* 42 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.URLAuthenticationChallenge
                public String toString() {
/* 35 */            return "HttpAuthenticationChallenge{previousFailureCount=" + this.previousFailureCount + ", proposedCredential=" + this.proposedCredential + "} " + super.toString();
                }
            }
