            package com.google.android.play.core.integrity;

            import android.content.Context;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.z */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0462z {

                /* JADX INFO: renamed from: a */
                private static C0455s f5277a;

                /* JADX INFO: renamed from: a */
                public static synchronized C0455s m2504a(Context context) {
                    try {
/* 6 */                 if (f5277a == null) {
/* 11 */                    C0453q c0453q = new C0453q(null);
/* 14 */                    Context applicationContext = context.getApplicationContext();
/* 18 */                    if (applicationContext != null) {
/* 20 */                        context = applicationContext;
                            }
/* 21 */                    c0453q.m2499a(context);
/* 28 */                    f5277a = c0453q.mo2500b();
                        }
                    } catch (Throwable th) {
/* 38 */                throw th;
                    }
/* 33 */            return f5277a;
                }
            }
