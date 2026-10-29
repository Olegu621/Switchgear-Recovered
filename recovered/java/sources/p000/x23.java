            package p000;

            import android.view.View;
            import androidx.core.R$id;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class x23 {
                /* JADX INFO: renamed from: a */
                public static void m9685a(View view, c33 c33Var) {
/* 7 */             le2 le2Var = (le2) view.getTag(R$id.tag_unhandled_key_listeners);
/* 9 */             if (le2Var == null) {
/* 13 */                le2Var = new le2();
/* 18 */                view.setTag(R$id.tag_unhandled_key_listeners, le2Var);
                    }
/* 21 */            Objects.requireNonNull(c33Var);
/* 26 */            View.OnUnhandledKeyEventListener w23Var = new w23();
/* 29 */            le2Var.put(c33Var, w23Var);
/* 32 */            view.addOnUnhandledKeyEventListener(w23Var);
                }

                /* JADX INFO: renamed from: b */
                public static CharSequence m9686b(View view) {
/* 1 */             return view.getAccessibilityPaneTitle();
                }

                /* JADX INFO: renamed from: c */
                public static boolean m9687c(View view) {
/* 1 */             return view.isAccessibilityHeading();
                }

                /* JADX INFO: renamed from: d */
                public static boolean m9688d(View view) {
/* 1 */             return view.isScreenReaderFocusable();
                }

                /* JADX INFO: renamed from: e */
                public static void m9689e(View view, c33 c33Var) {
                    View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
/* 7 */             le2 le2Var = (le2) view.getTag(R$id.tag_unhandled_key_listeners);
/* 9 */             if (le2Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) le2Var.getOrDefault(c33Var, null)) == null) {
/* 24 */                return;
                    }
/* 21 */            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
                }

                /* JADX INFO: renamed from: f */
                public static <T> T m9690f(View view, int i) {
/* 1 */             return (T) view.requireViewById(i);
                }

                /* JADX INFO: renamed from: g */
                public static void m9691g(View view, boolean z) {
/* 1 */             view.setAccessibilityHeading(z);
                }

                /* JADX INFO: renamed from: h */
                public static void m9692h(View view, CharSequence charSequence) {
/* 1 */             view.setAccessibilityPaneTitle(charSequence);
                }

                /* JADX INFO: renamed from: i */
                public static void m9693i(View view, AbstractC2550zg abstractC2550zg) {
/* 2 */             view.setAutofillId(null);
                }

                /* JADX INFO: renamed from: j */
                public static void m9694j(View view, boolean z) {
/* 1 */             view.setScreenReaderFocusable(z);
                }
            }
