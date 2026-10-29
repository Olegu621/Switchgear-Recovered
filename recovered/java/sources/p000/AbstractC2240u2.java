            package p000;

            import android.app.Activity;
            import android.app.SharedElementCallback;
            
            /* JADX INFO: renamed from: u2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2240u2 {
                /* JADX INFO: renamed from: a */
                public static void m8939a(Object obj) {
/* 3 */             ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
                }

                /* JADX INFO: renamed from: b */
                public static void m8940b(Activity activity, String[] strArr, int i) {
/* 1 */             activity.requestPermissions(strArr, i);
                }

                /* JADX INFO: renamed from: c */
                public static boolean m8941c(Activity activity, String str) {
/* 1 */             return activity.shouldShowRequestPermissionRationale(str);
                }
            }
