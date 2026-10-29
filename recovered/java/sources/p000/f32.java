            package p000;

            import android.app.RemoteInput;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class f32 {
                /* JADX INFO: renamed from: a */
                public static int m3645a(Object obj) {
/* 3 */             return ((RemoteInput) obj).getEditChoicesBeforeSending();
                }

                /* JADX INFO: renamed from: b */
                public static RemoteInput.Builder m3646b(RemoteInput.Builder builder, int i) {
/* 1 */             return builder.setEditChoicesBeforeSending(i);
                }
            }
