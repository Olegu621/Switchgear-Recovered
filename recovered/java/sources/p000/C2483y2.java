            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.os.Bundle;
            import androidx.core.app.NotificationCompat;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: y2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2483y2 implements Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: a */
                public static final xt0 f19451a = new xt0(15);

                /* JADX INFO: renamed from: b */
                public static C2483y2 f19452b;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
/* 1 */             activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
/* 1 */             activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
/* 1 */             activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
/* 1 */             activity.getClass();
/* 11 */            k50.m5968e("y2", "Auto screenview occurred - activity has resumed", new Object[0]);
                    try {
/* 14 */                v72 v72VarM6689e = mn0.m6689e(activity);
/* 20 */                HashMap map = new HashMap();
/* 25 */                map.put(NotificationCompat.CATEGORY_EVENT, v72VarM6689e);
/* 30 */                xn1.m10006b("SnowplowScreenView", map);
                    } catch (Exception e) {
/* 41 */                k50.m5980q("y2", "Method onActivityResumed raised an exception: %s", e);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
/* 1 */             activity.getClass();
/* 4 */             bundle.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
/* 1 */             activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
/* 1 */             activity.getClass();
                }
            }
