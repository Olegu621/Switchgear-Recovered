            package io.flutter.plugin.platform;

            import android.view.MotionEvent;
            import android.view.View;
            import android.view.accessibility.AccessibilityEvent;
            import io.flutter.view.AccessibilityBridge;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class AccessibilityEventsDelegate {
                private AccessibilityBridge accessibilityBridge;

                public boolean onAccessibilityHoverEvent(MotionEvent motionEvent, boolean z) {
/* 1 */             AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
/* 3 */             if (accessibilityBridge == null) {
/* 5 */                 return false;
                    }
/* 7 */             return accessibilityBridge.onAccessibilityHoverEvent(motionEvent, z);
                }

                public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
/* 1 */             AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
/* 3 */             if (accessibilityBridge == null) {
/* 5 */                 return false;
                    }
/* 7 */             return accessibilityBridge.externalViewRequestSendAccessibilityEvent(view, view2, accessibilityEvent);
                }

                public void setAccessibilityBridge(AccessibilityBridge accessibilityBridge) {
/* 1 */             this.accessibilityBridge = accessibilityBridge;
                }
            }
