            package p000;

            import android.view.View;
            import android.view.WindowInsets;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class t23 {
                /* JADX INFO: renamed from: a */
                public static m83 m8681a(View view) {
/* 1 */             WindowInsets rootWindowInsets = view.getRootWindowInsets();
/* 6 */             if (rootWindowInsets == null) {
/* 5 */                 return null;
                    }
/* 9 */             m83 m83VarM6620h = m83.m6620h(rootWindowInsets, null);
/* 13 */            j83 j83Var = m83VarM6620h.f13660a;
/* 15 */            j83Var.mo2975p(m83VarM6620h);
/* 22 */            j83Var.mo2969d(view.getRootView());
/* 25 */            return m83VarM6620h;
                }

                /* JADX INFO: renamed from: b */
                public static int m8682b(View view) {
/* 1 */             return view.getScrollIndicators();
                }

                /* JADX INFO: renamed from: c */
                public static void m8683c(View view, int i) {
/* 1 */             view.setScrollIndicators(i);
                }

                /* JADX INFO: renamed from: d */
                public static void m8684d(View view, int i, int i2) {
/* 1 */             view.setScrollIndicators(i, i2);
                }
            }
