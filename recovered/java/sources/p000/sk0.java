            package p000;

            import android.app.ActivityManager;
            import android.app.Person;
            import android.media.session.MediaSessionManager;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract /* synthetic */ class sk0 {
                /* JADX INFO: renamed from: c */
                public static /* synthetic */ ActivityManager.TaskDescription m8525c(int i, String str) {
/* 4 */             return new ActivityManager.TaskDescription(str, 0, i);
                }

                /* JADX INFO: renamed from: d */
                public static /* bridge */ /* synthetic */ Person m8526d(Object obj) {
/* 1 */             return (Person) obj;
                }

                /* JADX INFO: renamed from: h */
                public static /* synthetic */ MediaSessionManager.RemoteUserInfo m8530h(int i, int i2, String str) {
/* 3 */             return new MediaSessionManager.RemoteUserInfo(str, i, i2);
                }
            }
