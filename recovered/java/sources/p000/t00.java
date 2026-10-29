            package p000;

            import android.content.Context;
            import android.hardware.display.DisplayManager;
            import android.view.Display;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class t00 {
                /* JADX INFO: renamed from: a */
                public static Context m8668a(Context context, String str) {
/* 1 */             return context.createAttributionContext(str);
                }

                /* JADX INFO: renamed from: b */
                public static String m8669b(Context context) {
/* 1 */             return context.getAttributionTag();
                }

                /* JADX INFO: renamed from: c */
                public static Display m8670c(Context context) {
                    try {
/* 1 */                 return context.getDisplay();
                    } catch (UnsupportedOperationException unused) {
/* 27 */                AbstractC1245n0.m4889q("ContextCompat", "The context:" + context + " is not associated with any display. Return a fallback display instead.");
/* 39 */                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
                    }
                }
            }
