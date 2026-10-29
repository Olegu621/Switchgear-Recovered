            package io.flutter.plugin.platform;

            import android.view.View;
            import io.flutter.view.AccessibilityBridge;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PlatformViewsControllerDelegator implements PlatformViewsAccessibilityDelegate {
                PlatformViewsController platformViewsController;
                PlatformViewsController2 platformViewsController2;

                public PlatformViewsControllerDelegator(PlatformViewsController platformViewsController, PlatformViewsController2 platformViewsController2) {
/* 4 */             this.platformViewsController = platformViewsController;
/* 6 */             this.platformViewsController2 = platformViewsController2;
                }

                @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
                public void attachAccessibilityBridge(AccessibilityBridge accessibilityBridge) {
/* 3 */             this.platformViewsController.attachAccessibilityBridge(accessibilityBridge);
/* 8 */             this.platformViewsController2.attachAccessibilityBridge(accessibilityBridge);
                }

                @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
                public void detachAccessibilityBridge() {
/* 3 */             this.platformViewsController.detachAccessibilityBridge();
/* 8 */             this.platformViewsController2.detachAccessibilityBridge();
                }

                @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
                public View getPlatformViewById(int i) {
                    return this.platformViewsController2.getPlatformViewById(i) != null ? this.platformViewsController2.getPlatformViewById(i) : this.platformViewsController.getPlatformViewById(i);
                }

                @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
                public boolean usesVirtualDisplay(int i) {
                    return this.platformViewsController2.getPlatformViewById(i) != null ? this.platformViewsController2.usesVirtualDisplay(i) : this.platformViewsController.usesVirtualDisplay(i);
                }
            }
