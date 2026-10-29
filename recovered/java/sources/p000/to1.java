            package p000;

            import android.app.Notification;
            import android.widget.RemoteViews;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class to1 {
                /* JADX INFO: renamed from: a */
                public static Notification.Action.Builder m8816a(Notification.Action.Builder builder, boolean z) {
/* 1 */             return builder.setAllowGeneratedReplies(z);
                }

                /* JADX INFO: renamed from: b */
                public static Notification.Builder m8817b(Notification.Builder builder, RemoteViews remoteViews) {
/* 1 */             return builder.setCustomBigContentView(remoteViews);
                }

                /* JADX INFO: renamed from: c */
                public static Notification.Builder m8818c(Notification.Builder builder, RemoteViews remoteViews) {
/* 1 */             return builder.setCustomContentView(remoteViews);
                }

                /* JADX INFO: renamed from: d */
                public static Notification.Builder m8819d(Notification.Builder builder, RemoteViews remoteViews) {
/* 1 */             return builder.setCustomHeadsUpContentView(remoteViews);
                }

                /* JADX INFO: renamed from: e */
                public static Notification.Builder m8820e(Notification.Builder builder, CharSequence[] charSequenceArr) {
/* 1 */             return builder.setRemoteInputHistory(charSequenceArr);
                }
            }
