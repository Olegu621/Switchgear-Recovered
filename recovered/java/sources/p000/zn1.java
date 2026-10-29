            package p000;

            import android.app.Notification;
            import android.app.RemoteInput;
            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zn1 {
                /* JADX INFO: renamed from: a */
                public static boolean m10407a(RemoteInput remoteInput) {
/* 1 */             return remoteInput.getAllowFreeFormInput();
                }

                /* JADX INFO: renamed from: b */
                public static CharSequence[] m10408b(RemoteInput remoteInput) {
/* 1 */             return remoteInput.getChoices();
                }

                /* JADX INFO: renamed from: c */
                public static Bundle m10409c(Notification.Action action) {
/* 1 */             return action.getExtras();
                }

                /* JADX INFO: renamed from: d */
                public static Bundle m10410d(RemoteInput remoteInput) {
/* 1 */             return remoteInput.getExtras();
                }

                /* JADX INFO: renamed from: e */
                public static String m10411e(Notification notification) {
/* 1 */             return notification.getGroup();
                }

                /* JADX INFO: renamed from: f */
                public static CharSequence m10412f(RemoteInput remoteInput) {
/* 1 */             return remoteInput.getLabel();
                }

                /* JADX INFO: renamed from: g */
                public static RemoteInput[] m10413g(Notification.Action action) {
/* 1 */             return action.getRemoteInputs();
                }

                /* JADX INFO: renamed from: h */
                public static String m10414h(RemoteInput remoteInput) {
/* 1 */             return remoteInput.getResultKey();
                }

                /* JADX INFO: renamed from: i */
                public static String m10415i(Notification notification) {
/* 1 */             return notification.getSortKey();
                }
            }
