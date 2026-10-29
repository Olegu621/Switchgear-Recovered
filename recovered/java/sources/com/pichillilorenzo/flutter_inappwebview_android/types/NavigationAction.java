            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class NavigationAction {
                boolean hasGesture;
                boolean isForMainFrame;
                boolean isRedirect;
                URLRequest request;

                public NavigationAction(URLRequest uRLRequest, boolean z, boolean z2, boolean z3) {
/* 4 */             this.request = uRLRequest;
/* 6 */             this.isForMainFrame = z;
/* 8 */             this.hasGesture = z2;
/* 10 */            this.isRedirect = z3;
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            NavigationAction navigationAction = (NavigationAction) obj;
/* 25 */            if (this.isForMainFrame == navigationAction.isForMainFrame && this.hasGesture == navigationAction.hasGesture && this.isRedirect == navigationAction.isRedirect) {
/* 46 */                return this.request.equals(navigationAction.request);
                    }
/* 5 */             return false;
                }

                public URLRequest getRequest() {
/* 1 */             return this.request;
                }

                public int hashCode() {
/* 21 */            return (((((this.request.hashCode() * 31) + (this.isForMainFrame ? 1 : 0)) * 31) + (this.hasGesture ? 1 : 0)) * 31) + (this.isRedirect ? 1 : 0);
                }

                public boolean isForMainFrame() {
/* 1 */             return this.isForMainFrame;
                }

                public boolean isHasGesture() {
/* 1 */             return this.hasGesture;
                }

                public boolean isRedirect() {
/* 1 */             return this.isRedirect;
                }

                public void setForMainFrame(boolean z) {
/* 1 */             this.isForMainFrame = z;
                }

                public void setHasGesture(boolean z) {
/* 1 */             this.hasGesture = z;
                }

                public void setRedirect(boolean z) {
/* 1 */             this.isRedirect = z;
                }

                public void setRequest(URLRequest uRLRequest) {
/* 1 */             this.request = uRLRequest;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 14 */            map.put("request", this.request.toMap());
/* 25 */            map.put("isForMainFrame", Boolean.valueOf(this.isForMainFrame));
/* 36 */            map.put("hasGesture", Boolean.valueOf(this.hasGesture));
/* 47 */            map.put("isRedirect", Boolean.valueOf(this.isRedirect));
/* 53 */            map.put("navigationType", null);
/* 58 */            map.put("sourceFrame", null);
/* 63 */            map.put("targetFrame", null);
/* 68 */            map.put("shouldPerformDownload", null);
/* 71 */            return map;
                }

                public String toString() {
/* 48 */            return "NavigationAction{request=" + this.request + ", isForMainFrame=" + this.isForMainFrame + ", hasGesture=" + this.hasGesture + ", isRedirect=" + this.isRedirect + '}';
                }
            }
