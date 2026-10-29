            package io.sentry.android.core;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.os.Bundle;
            import android.os.HandlerThread;
            import java.lang.ref.WeakReference;
            import p000.C2076pn;
            
            /* JADX INFO: renamed from: io.sentry.android.core.r1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1267r1 implements Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: a */
                public final WeakReference f10295a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AlertDialogC1270s1 f10296b;

                public C1267r1(AlertDialogC1270s1 alertDialogC1270s1, WeakReference weakReference) {
/* 4 */             this.f10296b = alertDialogC1270s1;
/* 6 */             this.f10295a = weakReference;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    Activity activity2;
/* 7 */             if (activity == this.f10295a.get()) {
/* 9 */                 AlertDialogC1270s1 alertDialogC1270s1 = this.f10296b;
/* 11 */                C1249o1 c1249o1 = alertDialogC1270s1.f10307e;
/* 14 */                if (c1249o1 != null) {
/* 16 */                    c1249o1.m4899c();
/* 19 */                    HandlerThread handlerThread = c1249o1.f10229c;
/* 21 */                    if (handlerThread != null) {
/* 23 */                        handlerThread.quitSafely();
/* 26 */                        c1249o1.f10229c = null;
/* 28 */                        c1249o1.f10230d = null;
                            }
/* 30 */                    alertDialogC1270s1.f10307e = null;
                        }
/* 34 */                if (alertDialogC1270s1.f10308f != null) {
/* 36 */                    Context context = alertDialogC1270s1.getContext();
                            while (true) {
/* 42 */                        if (!(context instanceof ContextWrapper)) {
/* 58 */                            activity2 = null;
                                    break;
                                } else {
/* 46 */                            if (context instanceof Activity) {
/* 48 */                                activity2 = (Activity) context;
                                        break;
                                    }
/* 53 */                            context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
/* 59 */                    if (activity2 != null) {
/* 67 */                        activity2.getApplication().unregisterActivityLifecycleCallbacks(alertDialogC1270s1.f10308f);
                            }
/* 70 */                    alertDialogC1270s1.f10308f = null;
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                    C1249o1 c1249o1;
/* 7 */             if (activity != this.f10295a.get() || (c1249o1 = this.f10296b.f10307e) == null) {
/* 18 */                return;
                    }
/* 15 */            c1249o1.m4899c();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    AlertDialogC1270s1 alertDialogC1270s1;
                    C1249o1 c1249o1;
/* 1 */             WeakReference weakReference = this.f10295a;
/* 7 */             if (activity != weakReference.get() || (c1249o1 = (alertDialogC1270s1 = this.f10296b).f10307e) == null) {
/* 25 */                return;
                    }
/* 22 */            c1249o1.m4898b(activity, new C2076pn(23, alertDialogC1270s1, weakReference));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }
            }
