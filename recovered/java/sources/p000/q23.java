            package p000;

            import android.view.View;
            import android.view.WindowInsets;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class q23 {
                /* JADX INFO: renamed from: a */
                public static WindowInsets m7677a(View view, WindowInsets windowInsets) {
/* 1 */             return view.dispatchApplyWindowInsets(windowInsets);
                }

                /* JADX INFO: renamed from: b */
                public static WindowInsets m7678b(View view, WindowInsets windowInsets) {
/* 1 */             return view.onApplyWindowInsets(windowInsets);
                }

                /* JADX INFO: renamed from: c */
                public static void m7679c(View view) {
/* 1 */             view.requestApplyInsets();
                }
            }
