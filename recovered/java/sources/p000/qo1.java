            package p000;

            import android.app.Notification;
            import android.app.PendingIntent;
            import android.app.RemoteInput;
            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class qo1 {
                /* JADX INFO: renamed from: a */
                public static Notification.Builder m7956a(Notification.Builder builder, Notification.Action action) {
/* 1 */             return builder.addAction(action);
                }

                /* JADX INFO: renamed from: b */
                public static Notification.Action.Builder m7957b(Notification.Action.Builder builder, Bundle bundle) {
/* 1 */             return builder.addExtras(bundle);
                }

                /* JADX INFO: renamed from: c */
                public static Notification.Action.Builder m7958c(Notification.Action.Builder builder, RemoteInput remoteInput) {
/* 1 */             return builder.addRemoteInput(remoteInput);
                }

                /* JADX INFO: renamed from: d */
                public static Notification.Action m7959d(Notification.Action.Builder builder) {
/* 1 */             return builder.build();
                }

                /* JADX INFO: renamed from: e */
                public static Notification.Action.Builder m7960e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
/* 3 */             return new Notification.Action.Builder(i, charSequence, pendingIntent);
                }

                /* JADX INFO: renamed from: f */
                public static String m7961f(Notification notification) {
/* 1 */             return notification.getGroup();
                }

                /* JADX INFO: renamed from: g */
                public static Notification.Builder m7962g(Notification.Builder builder, String str) {
/* 1 */             return builder.setGroup(str);
                }

                /* JADX INFO: renamed from: h */
                public static Notification.Builder m7963h(Notification.Builder builder, boolean z) {
/* 1 */             return builder.setGroupSummary(z);
                }

                /* JADX INFO: renamed from: i */
                public static Notification.Builder m7964i(Notification.Builder builder, boolean z) {
/* 1 */             return builder.setLocalOnly(z);
                }

                /* JADX INFO: renamed from: j */
                public static Notification.Builder m7965j(Notification.Builder builder, String str) {
/* 1 */             return builder.setSortKey(str);
                }
            }
