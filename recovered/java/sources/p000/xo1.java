            package p000;

            import android.app.Notification;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class xo1 {
                /* JADX INFO: renamed from: a */
                public static Notification.Action.Builder m10009a(Notification.Action.Builder builder, boolean z) {
/* 1 */             return builder.setAuthenticationRequired(z);
                }

                /* JADX INFO: renamed from: b */
                public static Notification.Builder m10010b(Notification.Builder builder, int i) {
/* 1 */             return builder.setForegroundServiceBehavior(i);
                }
            }
