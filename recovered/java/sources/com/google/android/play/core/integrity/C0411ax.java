            package com.google.android.play.core.integrity;

            import android.content.Context;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.ax */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0411ax {

                /* JADX INFO: renamed from: a */
                private static InterfaceC0410aw f5195a;

                /* JADX INFO: renamed from: a */
                public static synchronized InterfaceC0410aw m2469a(Context context) {
                    try {
/* 6 */                 if (f5195a == null) {
/* 11 */                    C0457u c0457u = new C0457u(null);
/* 14 */                    Context applicationContext = context.getApplicationContext();
/* 18 */                    if (applicationContext != null) {
/* 20 */                        context = applicationContext;
                            }
/* 21 */                    c0457u.m2502a(context);
/* 28 */                    f5195a = c0457u.mo2467b();
                        }
                    } catch (Throwable th) {
/* 38 */                throw th;
                    }
/* 33 */            return f5195a;
                }
            }
