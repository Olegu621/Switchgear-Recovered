            package p000;

            import android.app.Notification;
            import android.app.PendingIntent;
            import android.graphics.drawable.Icon;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class so1 {
                /* JADX INFO: renamed from: a */
                public static Notification.Action.Builder m8587a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
/* 3 */             return new Notification.Action.Builder(icon, charSequence, pendingIntent);
                }

                /* JADX INFO: renamed from: b */
                public static Notification.Builder m8588b(Notification.Builder builder, Icon icon) {
/* 1 */             return builder.setLargeIcon(icon);
                }

                /* JADX INFO: renamed from: c */
                public static Notification.Builder m8589c(Notification.Builder builder, Object obj) {
/* 3 */             return builder.setSmallIcon((Icon) obj);
                }
            }
