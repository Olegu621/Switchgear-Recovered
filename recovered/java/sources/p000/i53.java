            package p000;

            import android.graphics.Insets;
            import android.graphics.Rect;
            import android.view.View;
            import android.view.WindowInsets;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class i53 {
                /* JADX INFO: renamed from: a */
                public static void m4475a(View view, Rect rect, Rect rect2) {
/* 22 */            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
/* 34 */            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
                }
            }
