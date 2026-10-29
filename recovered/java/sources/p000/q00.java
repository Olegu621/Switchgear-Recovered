            package p000;

            import android.content.Context;
            import java.io.File;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class q00 {
                /* JADX INFO: renamed from: a */
                public static Context m7672a(Context context) {
/* 1 */             return context.createDeviceProtectedStorageContext();
                }

                /* JADX INFO: renamed from: b */
                public static File m7673b(Context context) {
/* 1 */             return context.getDataDir();
                }

                /* JADX INFO: renamed from: c */
                public static boolean m7674c(Context context) {
/* 1 */             return context.isDeviceProtectedStorage();
                }
            }
