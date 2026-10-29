            package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

            import java.util.Map;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ContentBlockerAction {
                static final /* synthetic */ boolean $assertionsDisabled = false;
                private String selector;
                private ContentBlockerActionType type;

                public ContentBlockerAction(ContentBlockerActionType contentBlockerActionType, String str) {
/* 4 */             this.type = contentBlockerActionType;
/* 8 */             contentBlockerActionType.equals(ContentBlockerActionType.CSS_DISPLAY_NONE);
/* 11 */            this.selector = str;
                }

                public static ContentBlockerAction fromMap(Map<String, Object> map) {
/* 23 */            return new ContentBlockerAction(ContentBlockerActionType.fromValue((String) map.get("type")), (String) map.get("selector"));
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                ContentBlockerAction contentBlockerAction = (ContentBlockerAction) obj;
/* 25 */                if (this.type != contentBlockerAction.type) {
/* 5 */                     return false;
                        }
/* 28 */                String str = this.selector;
/* 30 */                String str2 = contentBlockerAction.selector;
/* 32 */                if (str != null) {
/* 34 */                    return str.equals(str2);
                        }
/* 39 */                if (str2 == null) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public String getSelector() {
/* 1 */             return this.selector;
                }

                public ContentBlockerActionType getType() {
/* 1 */             return this.type;
                }

                public int hashCode() {
/* 7 */             int iHashCode = this.type.hashCode() * 31;
/* 9 */             String str = this.selector;
/* 19 */            return iHashCode + (str != null ? str.hashCode() : 0);
                }

                public void setSelector(String str) {
/* 1 */             this.selector = str;
                }

                public void setType(ContentBlockerActionType contentBlockerActionType) {
/* 1 */             this.type = contentBlockerActionType;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ContentBlockerAction{type=");
/* 10 */            sb.append(this.type);
/* 15 */            sb.append(", selector='");
/* 22 */            return fm0.m3789o(sb, this.selector, "'}");
                }
            }
