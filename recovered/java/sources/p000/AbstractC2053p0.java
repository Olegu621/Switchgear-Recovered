            package p000;

            import android.app.NotificationChannel;
            import android.graphics.drawable.AdaptiveIconDrawable;
            import android.graphics.drawable.Drawable;
            import android.view.autofill.AutofillManager;
            
            /* JADX INFO: renamed from: p0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract /* synthetic */ class AbstractC2053p0 {
                /* JADX INFO: renamed from: e */
                public static /* synthetic */ NotificationChannel m7264e(String str) {
/* 6 */             return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
                }

                /* JADX INFO: renamed from: k */
                public static /* bridge */ /* synthetic */ Class m7270k() {
/* 1 */             return AutofillManager.class;
                }

                /* JADX INFO: renamed from: x */
                public static /* bridge */ /* synthetic */ boolean m7283x(Drawable drawable) {
/* 1 */             return drawable instanceof AdaptiveIconDrawable;
                }
            }
