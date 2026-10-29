            package p000;

            import android.content.ClipData;
            import android.view.PointerIcon;
            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class u23 {
                /* JADX INFO: renamed from: a */
                public static void m8942a(View view) {
/* 1 */             view.cancelDragAndDrop();
                }

                /* JADX INFO: renamed from: b */
                public static void m8943b(View view) {
/* 1 */             view.dispatchFinishTemporaryDetach();
                }

                /* JADX INFO: renamed from: c */
                public static void m8944c(View view) {
/* 1 */             view.dispatchStartTemporaryDetach();
                }

                /* JADX INFO: renamed from: d */
                public static void m8945d(View view, PointerIcon pointerIcon) {
/* 1 */             view.setPointerIcon(pointerIcon);
                }

                /* JADX INFO: renamed from: e */
                public static boolean m8946e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
/* 1 */             return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
                }

                /* JADX INFO: renamed from: f */
                public static void m8947f(View view, View.DragShadowBuilder dragShadowBuilder) {
/* 1 */             view.updateDragShadow(dragShadowBuilder);
                }
            }
