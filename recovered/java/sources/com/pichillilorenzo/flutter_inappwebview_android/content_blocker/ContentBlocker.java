            package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ContentBlocker {
                private ContentBlockerAction action;
                private ContentBlockerTrigger trigger;

                public ContentBlocker(ContentBlockerTrigger contentBlockerTrigger, ContentBlockerAction contentBlockerAction) {
/* 4 */             this.trigger = contentBlockerTrigger;
/* 6 */             this.action = contentBlockerAction;
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            ContentBlocker contentBlocker = (ContentBlocker) obj;
/* 29 */            if (this.trigger.equals(contentBlocker.trigger)) {
/* 36 */                return this.action.equals(contentBlocker.action);
                    }
/* 5 */             return false;
                }

                public ContentBlockerAction getAction() {
/* 1 */             return this.action;
                }

                public ContentBlockerTrigger getTrigger() {
/* 1 */             return this.trigger;
                }

                public int hashCode() {
/* 15 */            return this.action.hashCode() + (this.trigger.hashCode() * 31);
                }

                public void setAction(ContentBlockerAction contentBlockerAction) {
/* 1 */             this.action = contentBlockerAction;
                }

                public void setTrigger(ContentBlockerTrigger contentBlockerTrigger) {
/* 1 */             this.trigger = contentBlockerTrigger;
                }

                public String toString() {
/* 28 */            return "ContentBlocker{trigger=" + this.trigger + ", action=" + this.action + '}';
                }
            }
