            package p000;

            import android.app.AppOpsManager;
            import android.content.Context;
            
            /* JADX INFO: renamed from: jc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1788jc {
                /* JADX INFO: renamed from: a */
                public static int m5767a(AppOpsManager appOpsManager, String str, int i, String str2) {
/* 1 */             if (appOpsManager == null) {
/* 3 */                 return 1;
                    }
/* 5 */             return appOpsManager.checkOpNoThrow(str, i, str2);
                }

                /* JADX INFO: renamed from: b */
                public static String m5768b(Context context) {
/* 1 */             return context.getOpPackageName();
                }

                /* JADX INFO: renamed from: c */
                public static AppOpsManager m5769c(Context context) {
/* 7 */             return (AppOpsManager) context.getSystemService(AppOpsManager.class);
                }
            }
