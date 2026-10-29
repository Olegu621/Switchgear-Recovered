            package p000;

            import android.app.Notification;
            import android.app.RemoteInput;
            import android.content.LocusId;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class eo1 {
                /* JADX INFO: renamed from: a */
                public static boolean m3526a(Notification notification) {
/* 1 */             return notification.getAllowSystemGeneratedContextualActions();
                }

                /* JADX INFO: renamed from: b */
                public static Notification.BubbleMetadata m3527b(Notification notification) {
/* 1 */             return notification.getBubbleMetadata();
                }

                /* JADX INFO: renamed from: c */
                public static int m3528c(RemoteInput remoteInput) {
/* 1 */             return remoteInput.getEditChoicesBeforeSending();
                }

                /* JADX INFO: renamed from: d */
                public static LocusId m3529d(Notification notification) {
/* 1 */             return notification.getLocusId();
                }

                /* JADX INFO: renamed from: e */
                public static boolean m3530e(Notification.Action action) {
/* 1 */             return action.isContextual();
                }
            }
