            package p000;

            import android.app.Activity;
            import android.content.pm.PackageManager;
            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: renamed from: v2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2278v2 {
                /* JADX INFO: renamed from: a */
                public static boolean m9190a(Activity activity) {
/* 1 */             return activity.isLaunchedFromBubble();
                }

                /* JADX INFO: renamed from: b */
                public static boolean m9191b(Activity activity, String str) {
                    try {
/* 33 */                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
/* 38 */                return activity.shouldShowRequestPermissionRationale(str);
                    }
                }
            }
