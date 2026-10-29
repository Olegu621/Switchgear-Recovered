            package p000;

            import android.app.Notification;
            import android.media.AudioAttributes;
            import android.net.Uri;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ro1 {
                /* JADX INFO: renamed from: a */
                public static Notification.Builder m8215a(Notification.Builder builder, String str) {
/* 1 */             return builder.addPerson(str);
                }

                /* JADX INFO: renamed from: b */
                public static Notification.Builder m8216b(Notification.Builder builder, String str) {
/* 1 */             return builder.setCategory(str);
                }

                /* JADX INFO: renamed from: c */
                public static Notification.Builder m8217c(Notification.Builder builder, int i) {
/* 1 */             return builder.setColor(i);
                }

                /* JADX INFO: renamed from: d */
                public static Notification.Builder m8218d(Notification.Builder builder, Notification notification) {
/* 1 */             return builder.setPublicVersion(notification);
                }

                /* JADX INFO: renamed from: e */
                public static Notification.Builder m8219e(Notification.Builder builder, Uri uri, Object obj) {
/* 3 */             return builder.setSound(uri, (AudioAttributes) obj);
                }

                /* JADX INFO: renamed from: f */
                public static Notification.Builder m8220f(Notification.Builder builder, int i) {
/* 1 */             return builder.setVisibility(i);
                }
            }
