            package p000;

            import android.view.View;
            import android.view.autofill.AutofillId;
            import java.util.Collection;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class v23 {
                /* JADX INFO: renamed from: a */
                public static void m9192a(View view, Collection<View> collection, int i) {
/* 1 */             view.addKeyboardNavigationClusters(collection, i);
                }

                /* JADX INFO: renamed from: b */
                public static AutofillId m9193b(View view) {
/* 1 */             return view.getAutofillId();
                }

                /* JADX INFO: renamed from: c */
                public static int m9194c(View view) {
/* 1 */             return view.getImportantForAutofill();
                }

                /* JADX INFO: renamed from: d */
                public static int m9195d(View view) {
/* 1 */             return view.getNextClusterForwardId();
                }

                /* JADX INFO: renamed from: e */
                public static boolean m9196e(View view) {
/* 1 */             return view.hasExplicitFocusable();
                }

                /* JADX INFO: renamed from: f */
                public static boolean m9197f(View view) {
/* 1 */             return view.isFocusedByDefault();
                }

                /* JADX INFO: renamed from: g */
                public static boolean m9198g(View view) {
/* 1 */             return view.isImportantForAutofill();
                }

                /* JADX INFO: renamed from: h */
                public static boolean m9199h(View view) {
/* 1 */             return view.isKeyboardNavigationCluster();
                }

                /* JADX INFO: renamed from: i */
                public static View m9200i(View view, View view2, int i) {
/* 1 */             return view.keyboardNavigationClusterSearch(view2, i);
                }

                /* JADX INFO: renamed from: j */
                public static boolean m9201j(View view) {
/* 1 */             return view.restoreDefaultFocus();
                }

                /* JADX INFO: renamed from: k */
                public static void m9202k(View view, String... strArr) {
/* 1 */             view.setAutofillHints(strArr);
                }

                /* JADX INFO: renamed from: l */
                public static void m9203l(View view, boolean z) {
/* 1 */             view.setFocusedByDefault(z);
                }

                /* JADX INFO: renamed from: m */
                public static void m9204m(View view, int i) {
/* 1 */             view.setImportantForAutofill(i);
                }

                /* JADX INFO: renamed from: n */
                public static void m9205n(View view, boolean z) {
/* 1 */             view.setKeyboardNavigationCluster(z);
                }

                /* JADX INFO: renamed from: o */
                public static void m9206o(View view, int i) {
/* 1 */             view.setNextClusterForwardId(i);
                }

                /* JADX INFO: renamed from: p */
                public static void m9207p(View view, CharSequence charSequence) {
/* 1 */             view.setTooltipText(charSequence);
                }
            }
