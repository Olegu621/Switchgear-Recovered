            package p000;

            import android.app.Notification;
            import android.content.LocusId;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class wo1 {
                /* JADX INFO: renamed from: a */
                public static Notification.Builder m9589a(Notification.Builder builder, boolean z) {
/* 1 */             return builder.setAllowSystemGeneratedContextualActions(z);
                }

                /* JADX INFO: renamed from: b */
                public static Notification.Builder m9590b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
/* 1 */             return builder.setBubbleMetadata(bubbleMetadata);
                }

                /* JADX INFO: renamed from: c */
                public static Notification.Action.Builder m9591c(Notification.Action.Builder builder, boolean z) {
/* 1 */             return builder.setContextual(z);
                }

                /* JADX INFO: renamed from: d */
                public static Notification.Builder m9592d(Notification.Builder builder, Object obj) {
/* 3 */             return builder.setLocusId((LocusId) obj);
                }
            }
