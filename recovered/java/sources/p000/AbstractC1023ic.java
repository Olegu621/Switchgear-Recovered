            package p000;

            import android.app.AppOpsManager;
            import android.content.Context;
            
            /* JADX INFO: renamed from: ic */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1023ic {
                /* JADX INFO: renamed from: a */
                public static <T> T m4512a(Context context, Class<T> cls) {
/* 1 */             return (T) context.getSystemService(cls);
                }

                /* JADX INFO: renamed from: b */
                public static int m4513b(AppOpsManager appOpsManager, String str, String str2) {
/* 1 */             return appOpsManager.noteProxyOp(str, str2);
                }

                /* JADX INFO: renamed from: c */
                public static int m4514c(AppOpsManager appOpsManager, String str, String str2) {
/* 1 */             return appOpsManager.noteProxyOpNoThrow(str, str2);
                }

                /* JADX INFO: renamed from: d */
                public static String m4515d(String str) {
/* 1 */             return AppOpsManager.permissionToOp(str);
                }
            }
