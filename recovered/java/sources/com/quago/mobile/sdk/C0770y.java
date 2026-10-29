            package com.quago.mobile.sdk;

            import android.app.Activity;
            import android.app.Application;
            import android.os.Bundle;
            import android.view.Window;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.y */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0770y implements Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: a */
                public final QuagoSettings f5684a;

                public C0770y(QuagoSettings quagoSettings) {
/* 4 */             this.f5684a = quagoSettings;
                }

                /* JADX INFO: renamed from: a */
                public final void m2661a(Activity activity) {
                    Window window;
/* 1 */             if (activity == null || (window = activity.getWindow()) == null) {
/* 19 */                return;
                    }
/* 11 */            Window.Callback callback = window.getCallback();
/* 17 */            if (callback instanceof AbstractWindowCallbackC0726e1) {
/* 19 */                return;
                    }
/* 22 */            boolean zIsManualMotionDispatcherEnabled = this.f5684a.isManualMotionDispatcherEnabled();
/* 26 */            QuagoSettings quagoSettings = this.f5684a;
/* 28 */            if (zIsManualMotionDispatcherEnabled) {
/* 34 */                if (quagoSettings.isManualKeysDispatcherEnabled()) {
/* 41 */                    window.setCallback(new C0713a0(callback));
/* 44 */                    return;
                        } else {
/* 50 */                    window.setCallback(new C0719c0(callback));
/* 53 */                    return;
                        }
                    }
/* 58 */            if (quagoSettings.isManualKeysDispatcherEnabled()) {
/* 65 */                window.setCallback(new C0716b0(callback));
                    } else {
/* 74 */                window.setCallback(new C0772z(callback));
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
/* 1 */             Quago.onPause();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
/* 6 */             Quago.currActivityRef = new WeakReference<>(activity);
/* 8 */             Quago.onResume();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
/* 1 */             m2661a(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
/* 1 */             Quago.onStop();
                }
            }
