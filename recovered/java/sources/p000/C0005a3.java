            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.os.Bundle;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: renamed from: a3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0005a3 implements Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: a */
                public Object f61a;

                /* JADX INFO: renamed from: b */
                public Activity f62b;

                /* JADX INFO: renamed from: c */
                public final int f63c;

                /* JADX INFO: renamed from: d */
                public boolean f64d = false;

                /* JADX INFO: renamed from: e */
                public boolean f65e = false;

                /* JADX INFO: renamed from: f */
                public boolean f66f = false;

                public C0005a3(Activity activity) {
/* 11 */            this.f62b = activity;
/* 17 */            this.f63c = activity.hashCode();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
/* 3 */             if (this.f62b == activity) {
/* 6 */                 this.f62b = null;
/* 9 */                 this.f65e = true;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
/* 3 */             if (!this.f65e || this.f66f || this.f64d) {
/* 64 */                return;
                    }
/* 13 */            Object obj = this.f61a;
                    try {
/* 17 */                Object obj2 = AbstractC0166b3.f2187c.get(activity);
/* 21 */                if (obj2 == obj && activity.hashCode() == this.f63c) {
/* 46 */                    AbstractC0166b3.f2191g.postAtFrontOfQueue(new cp0(3, AbstractC0166b3.f2186b.get(activity), obj2));
/* 50 */                    this.f66f = true;
/* 53 */                    this.f61a = null;
                        }
                    } catch (Throwable th) {
/* 61 */                AbstractC1245n0.m4877e("ActivityRecreator", "Exception while fetching field values", th);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
/* 3 */             if (this.f62b == activity) {
/* 6 */                 this.f64d = true;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }
            }
