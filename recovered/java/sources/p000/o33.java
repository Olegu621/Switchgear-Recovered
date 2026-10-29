            package p000;

            import android.graphics.Matrix;
            import android.view.View;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class o33 {

                /* JADX INFO: renamed from: a */
                public static final ThreadLocal f14605a = new ThreadLocal();

                /* JADX INFO: renamed from: b */
                public static final ThreadLocal f14606b = new ThreadLocal();

                /* JADX INFO: renamed from: a */
                public static void m7097a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
/* 1 */             Object parent = view.getParent();
/* 7 */             if ((parent instanceof View) && parent != coordinatorLayout) {
/* 11 */                View view2 = (View) parent;
/* 13 */                m7097a(coordinatorLayout, view2, matrix);
/* 28 */                matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
                    }
/* 41 */            matrix.preTranslate(view.getLeft(), view.getTop());
/* 52 */            if (view.getMatrix().isIdentity()) {
/* 61 */                return;
                    }
/* 58 */            matrix.preConcat(view.getMatrix());
                }
            }
