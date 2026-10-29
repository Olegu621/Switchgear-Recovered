            package androidx.appcompat.widget;

            import android.content.Context;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.widget.FrameLayout;
            import p000.hj0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FitWindowsFrameLayout extends FrameLayout {
                public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
                }

                @Override // android.view.View
                public final boolean fitSystemWindows(Rect rect) {
/* 1 */             return super.fitSystemWindows(rect);
                }

                public void setOnFitSystemWindowsListener(hj0 hj0Var) {
                }
            }
