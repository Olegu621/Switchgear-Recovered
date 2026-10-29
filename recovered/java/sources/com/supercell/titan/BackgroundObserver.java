            package com.supercell.titan;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class BackgroundObserver implements Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: a */
                public int f5723a = 0;

                /* JADX INFO: renamed from: b */
                public boolean f5724b = false;

                /* JADX INFO: renamed from: c */
                public final Listener f5725c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface Listener {
                    void onBackground(Context context);

                    void onForeground(Context context);
                }

                public BackgroundObserver(Listener listener) {
/* 9 */             this.f5725c = listener;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
/* 4 */             int i = this.f5723a + 1;
/* 5 */             this.f5723a = i;
/* 7 */             if (i != 1 || this.f5724b) {
/* 18 */                return;
                    }
/* 15 */            this.f5725c.onForeground(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
/* 1 */             boolean zIsChangingConfigurations = activity.isChangingConfigurations();
/* 5 */             this.f5724b = zIsChangingConfigurations;
/* 9 */             int i = this.f5723a - 1;
/* 11 */            this.f5723a = i;
/* 13 */            if (i != 0 || zIsChangingConfigurations) {
/* 22 */                return;
                    }
/* 19 */            this.f5725c.onBackground(activity);
                }
            }
