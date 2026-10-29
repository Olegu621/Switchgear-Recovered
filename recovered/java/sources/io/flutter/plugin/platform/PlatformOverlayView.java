            package io.flutter.plugin.platform;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.MotionEvent;
            import io.flutter.embedding.android.FlutterImageView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public class PlatformOverlayView extends FlutterImageView {
                private AccessibilityEventsDelegate accessibilityDelegate;

                public PlatformOverlayView(Context context, int i, int i2, AccessibilityEventsDelegate accessibilityEventsDelegate) {
/* 3 */             super(context, i, i2, FlutterImageView.SurfaceKind.overlay);
/* 6 */             this.accessibilityDelegate = accessibilityEventsDelegate;
                }

                @Override // android.view.View
                public boolean onHoverEvent(MotionEvent motionEvent) {
/* 1 */             AccessibilityEventsDelegate accessibilityEventsDelegate = this.accessibilityDelegate;
/* 3 */             if (accessibilityEventsDelegate == null || !accessibilityEventsDelegate.onAccessibilityHoverEvent(motionEvent, true)) {
/* 13 */                return super.onHoverEvent(motionEvent);
                    }
/* 5 */             return true;
                }

/* 8 */         public PlatformOverlayView(Context context) {
/* 9 */             this(context, 1, 1, null);
                }

/* 9 */         public PlatformOverlayView(Context context, AttributeSet attributeSet) {
/* 10 */            this(context, 1, 1, null);
                }
            }
