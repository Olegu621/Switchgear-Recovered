            package p000;

            import android.app.Activity;
            import android.app.SharedElementCallback;
            
            /* JADX INFO: renamed from: t2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2203t2 {
                /* JADX INFO: renamed from: a */
                public static void m8673a(Activity activity) {
/* 1 */             activity.finishAfterTransition();
                }

                /* JADX INFO: renamed from: b */
                public static void m8674b(Activity activity) {
/* 1 */             activity.postponeEnterTransition();
                }

                /* JADX INFO: renamed from: c */
                public static void m8675c(Activity activity, SharedElementCallback sharedElementCallback) {
/* 1 */             activity.setEnterSharedElementCallback(sharedElementCallback);
                }

                /* JADX INFO: renamed from: d */
                public static void m8676d(Activity activity, SharedElementCallback sharedElementCallback) {
/* 1 */             activity.setExitSharedElementCallback(sharedElementCallback);
                }

                /* JADX INFO: renamed from: e */
                public static void m8677e(Activity activity) {
/* 1 */             activity.startPostponedEnterTransition();
                }
            }
