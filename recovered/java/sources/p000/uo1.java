            package p000;

            import android.app.Notification;
            import android.content.Context;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class uo1 {
                /* JADX INFO: renamed from: a */
                public static Notification.Builder m9048a(Context context, String str) {
/* 3 */             return new Notification.Builder(context, str);
                }

                /* JADX INFO: renamed from: b */
                public static Notification.Builder m9049b(Notification.Builder builder, int i) {
/* 1 */             return builder.setBadgeIconType(i);
                }

                /* JADX INFO: renamed from: c */
                public static Notification.Builder m9050c(Notification.Builder builder, boolean z) {
/* 1 */             return builder.setColorized(z);
                }

                /* JADX INFO: renamed from: d */
                public static Notification.Builder m9051d(Notification.Builder builder, int i) {
/* 1 */             return builder.setGroupAlertBehavior(i);
                }

                /* JADX INFO: renamed from: e */
                public static Notification.Builder m9052e(Notification.Builder builder, CharSequence charSequence) {
/* 1 */             return builder.setSettingsText(charSequence);
                }

                /* JADX INFO: renamed from: f */
                public static Notification.Builder m9053f(Notification.Builder builder, String str) {
/* 1 */             return builder.setShortcutId(str);
                }

                /* JADX INFO: renamed from: g */
                public static Notification.Builder m9054g(Notification.Builder builder, long j) {
/* 1 */             return builder.setTimeoutAfter(j);
                }
            }
