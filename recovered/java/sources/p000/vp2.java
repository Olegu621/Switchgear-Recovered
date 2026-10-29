            package p000;

            import android.view.View;
            import android.window.OnBackInvokedCallback;
            import android.window.OnBackInvokedDispatcher;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class vp2 {
                /* JADX INFO: renamed from: a */
                public static OnBackInvokedDispatcher m9308a(View view) {
/* 1 */             return view.findOnBackInvokedDispatcher();
                }

                /* JADX INFO: renamed from: b */
                public static OnBackInvokedCallback m9309b(Runnable runnable) {
/* 1 */             Objects.requireNonNull(runnable);
/* 7 */             return new C1994oa(runnable, 3);
                }

                /* JADX INFO: renamed from: c */
                public static void m9310c(Object obj, Object obj2) {
/* 8 */             ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
                }

                /* JADX INFO: renamed from: d */
                public static void m9311d(Object obj, Object obj2) {
/* 5 */             ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
                }
            }
