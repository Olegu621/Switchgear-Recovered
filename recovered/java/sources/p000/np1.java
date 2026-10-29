            package p000;

            import android.window.OnBackInvokedCallback;
            import android.window.OnBackInvokedDispatcher;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class np1 {

                /* JADX INFO: renamed from: a */
                public static final np1 f14401a = new np1();

                /* JADX INFO: renamed from: a */
                public final OnBackInvokedCallback m7016a(Function0<Unit> function0) {
/* 1 */             function0.getClass();
/* 7 */             return new C1994oa(function0, 2);
                }

                /* JADX INFO: renamed from: b */
                public final void m7017b(Object obj, int i, Object obj2) {
/* 1 */             obj.getClass();
/* 4 */             obj2.getClass();
/* 11 */            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
                }

                /* JADX INFO: renamed from: c */
                public final void m7018c(Object obj, Object obj2) {
/* 1 */             obj.getClass();
/* 4 */             obj2.getClass();
/* 11 */            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
                }
            }
