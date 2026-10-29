            package p000;

            import android.transition.Transition;
            import android.widget.PopupWindow;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ah1 {
                /* JADX INFO: renamed from: a */
                public static void m286a(PopupWindow popupWindow, Transition transition) {
/* 1 */             popupWindow.setEnterTransition(transition);
                }

                /* JADX INFO: renamed from: b */
                public static void m287b(PopupWindow popupWindow, Transition transition) {
/* 1 */             popupWindow.setExitTransition(transition);
                }
            }
