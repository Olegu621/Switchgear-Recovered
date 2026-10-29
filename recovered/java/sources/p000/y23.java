            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.contentcapture.ContentCaptureSession;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class y23 {
                /* JADX INFO: renamed from: a */
                public static View.AccessibilityDelegate m10087a(View view) {
/* 1 */             return view.getAccessibilityDelegate();
                }

                /* JADX INFO: renamed from: b */
                public static ContentCaptureSession m10088b(View view) {
/* 1 */             return view.getContentCaptureSession();
                }

                /* JADX INFO: renamed from: c */
                public static List<Rect> m10089c(View view) {
/* 1 */             return view.getSystemGestureExclusionRects();
                }

                /* JADX INFO: renamed from: d */
                public static void m10090d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
/* 1 */             view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
                }

                /* JADX INFO: renamed from: e */
                public static void m10091e(View view, f00 f00Var) {
/* 2 */             view.setContentCaptureSession(null);
                }

                /* JADX INFO: renamed from: f */
                public static void m10092f(View view, List<Rect> list) {
/* 1 */             view.setSystemGestureExclusionRects(list);
                }
            }
