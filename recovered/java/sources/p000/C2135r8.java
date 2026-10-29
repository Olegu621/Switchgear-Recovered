            package p000;

            import android.animation.LayoutTransition;
            import android.view.View;
            import android.view.ViewGroup;
            
            /* JADX INFO: renamed from: r8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2135r8 {

                /* JADX INFO: renamed from: a */
                public static final ViewGroup.MarginLayoutParams f15911a;

                static {
/* 4 */             ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
/* 7 */             f15911a = marginLayoutParams;
/* 10 */            marginLayoutParams.setMargins(0, 0, 0, 0);
                }

                /* JADX INFO: renamed from: a */
                public static boolean m8079a(View view) {
/* 4 */             if (view instanceof ViewGroup) {
/* 6 */                 ViewGroup viewGroup = (ViewGroup) view;
/* 8 */                 LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
/* 13 */                if (layoutTransition != null && layoutTransition.isChangingLayout()) {
/* 12 */                    return true;
                        }
/* 22 */                int childCount = viewGroup.getChildCount();
/* 27 */                for (int i = 0; i < childCount; i++) {
/* 37 */                    if (m8079a(viewGroup.getChildAt(i))) {
/* 12 */                        return true;
                            }
                        }
                    }
/* 3 */             return false;
                }
            }
