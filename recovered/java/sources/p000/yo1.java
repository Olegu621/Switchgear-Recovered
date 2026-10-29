            package p000;

            import android.app.NotificationManager;
            import android.service.notification.StatusBarNotification;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class yo1 {
                /* JADX INFO: renamed from: a */
                public static List<StatusBarNotification> m10163a(NotificationManager notificationManager) {
/* 1 */             StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                    return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
                }

                /* JADX INFO: renamed from: b */
                public static int m10164b(NotificationManager notificationManager) {
/* 1 */             return notificationManager.getCurrentInterruptionFilter();
                }
            }
