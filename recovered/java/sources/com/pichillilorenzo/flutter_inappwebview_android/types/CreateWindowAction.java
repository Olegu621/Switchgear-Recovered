            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class CreateWindowAction extends NavigationAction {
                boolean isDialog;
                int windowId;

                public CreateWindowAction(URLRequest uRLRequest, boolean z, boolean z2, boolean z3, int i, boolean z4) {
/* 1 */             super(uRLRequest, z, z2, z3);
/* 4 */             this.windowId = i;
/* 6 */             this.isDialog = z4;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
/* 5 */                 return false;
                    }
/* 26 */            CreateWindowAction createWindowAction = (CreateWindowAction) obj;
                    return this.windowId == createWindowAction.windowId && this.isDialog == createWindowAction.isDialog;
                }

                public int getWindowId() {
/* 1 */             return this.windowId;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
                public int hashCode() {
/* 14 */            return (((super.hashCode() * 31) + this.windowId) * 31) + (this.isDialog ? 1 : 0);
                }

                public boolean isDialog() {
/* 1 */             return this.isDialog;
                }

                public void setDialog(boolean z) {
/* 1 */             this.isDialog = z;
                }

                public void setWindowId(int i) {
/* 1 */             this.windowId = i;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
                public Map<String, Object> toMap() {
/* 1 */             Map<String, Object> map = super.toMap();
/* 13 */            map.put("windowId", Integer.valueOf(this.windowId));
/* 24 */            map.put("isDialog", Boolean.valueOf(this.isDialog));
/* 30 */            map.put("windowFeatures", null);
/* 33 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
                public String toString() {
/* 68 */            return "CreateWindowAction{windowId=" + this.windowId + ", isDialog=" + this.isDialog + ", request=" + this.request + ", isForMainFrame=" + this.isForMainFrame + ", hasGesture=" + this.hasGesture + ", isRedirect=" + this.isRedirect + '}';
                }
            }
