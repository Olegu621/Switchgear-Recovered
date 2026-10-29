            package p000;

            import android.app.Activity;
            import android.window.OnBackInvokedCallback;
            import android.window.OnBackInvokedDispatcher;
            import java.util.Objects;
            
            /* JADX INFO: renamed from: pa */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2063pa {
                /* JADX INFO: renamed from: a */
                public static OnBackInvokedDispatcher m7373a(Activity activity) {
/* 1 */             return activity.getOnBackInvokedDispatcher();
                }

                /* JADX INFO: renamed from: b */
                public static OnBackInvokedCallback m7374b(Object obj, LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa) {
/* 1 */             Objects.requireNonNull(layoutInflaterFactory2C2324wa);
/* 7 */             C1994oa c1994oa = new C1994oa(layoutInflaterFactory2C2324wa, 0);
/* 4 */             AbstractC2481y0.m10070p(obj).registerOnBackInvokedCallback(1000000, c1994oa);
/* 17 */            return c1994oa;
                }

                /* JADX INFO: renamed from: c */
                public static void m7375c(Object obj, Object obj2) {
/* 1 */             AbstractC2481y0.m10070p(obj).unregisterOnBackInvokedCallback(AbstractC2481y0.m10066l(obj2));
                }
            }
