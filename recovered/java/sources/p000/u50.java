            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u50 extends pg3 implements Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: U */
                public boolean f17359U;

                /* JADX INFO: renamed from: i */
                public int f17360i;

                /* JADX INFO: renamed from: v */
                public int f17361v;

                /* JADX INFO: renamed from: w */
                public boolean f17362w;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
/* 5 */             this.f17360i++;
/* 9 */             if (!this.f17359U) {
/* 13 */                if (!this.f17362w) {
/* 20 */                    xe2.m9775m("LifecycleTkr", "App is in foreground", null);
/* 33 */                    rs0.f16254y.f16271p.m8116u(new vc0(1));
                        }
/* 36 */                this.f17362w = true;
                    }
/* 39 */            this.f17359U = false;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
/* 5 */             this.f17361v++;
/* 8 */             boolean z = activity != null && activity.isChangingConfigurations();
/* 18 */            this.f17359U = z;
/* 20 */            if (z || this.f17360i != this.f17361v) {
/* 51 */                return;
                    }
/* 28 */            this.f17362w = false;
/* 35 */            xe2.m9775m("LifecycleTkr", "App is in background", null);
/* 48 */            rs0.f16254y.f16271p.m8116u(new vc0(2));
                }
            }
