            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class w70 {

                /* JADX INFO: renamed from: a */
                public static final ThreadLocal f18463a = new ThreadLocal();

                /* JADX INFO: renamed from: b */
                public static final ThreadLocal f18464b = new ThreadLocal();

                /* JADX INFO: renamed from: a */
                public static void m9478a(ViewGroup viewGroup, View view, Rect rect) {
/* 10 */            rect.set(0, 0, view.getWidth(), view.getHeight());
/* 13 */            m9480c(viewGroup, view, rect);
                }

                /* JADX INFO: renamed from: b */
                public static void m9479b(ViewParent viewParent, View view, Matrix matrix) {
/* 1 */             Object parent = view.getParent();
/* 7 */             if ((parent instanceof View) && parent != viewParent) {
/* 11 */                View view2 = (View) parent;
/* 13 */                m9479b(viewParent, view2, matrix);
/* 28 */                matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
                    }
/* 41 */            matrix.preTranslate(view.getLeft(), view.getTop());
/* 52 */            if (view.getMatrix().isIdentity()) {
/* 61 */                return;
                    }
/* 58 */            matrix.preConcat(view.getMatrix());
                }

                /* JADX INFO: renamed from: c */
                public static void m9480c(ViewGroup viewGroup, View view, Rect rect) {
/* 1 */             ThreadLocal threadLocal = f18463a;
/* 7 */             Matrix matrix = (Matrix) threadLocal.get();
/* 9 */             if (matrix == null) {
/* 13 */                matrix = new Matrix();
/* 16 */                threadLocal.set(matrix);
                    } else {
/* 20 */                matrix.reset();
                    }
/* 23 */            m9479b(viewGroup, view, matrix);
/* 26 */            ThreadLocal threadLocal2 = f18464b;
/* 32 */            RectF rectF = (RectF) threadLocal2.get();
/* 34 */            if (rectF == null) {
/* 38 */                rectF = new RectF();
/* 41 */                threadLocal2.set(rectF);
                    }
/* 44 */            rectF.set(rect);
/* 47 */            matrix.mapRect(rectF);
/* 68 */            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
                }
            }
