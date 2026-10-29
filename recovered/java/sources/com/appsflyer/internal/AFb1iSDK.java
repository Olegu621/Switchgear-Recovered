            package com.appsflyer.internal;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Intent;
            import android.os.Bundle;
            import com.appsflyer.AFLogger;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import kotlin.Unit;
            import p000.m42;
            import p000.n42;
            import p000.o42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class AFb1iSDK implements Application.ActivityLifecycleCallbacks {
                private final AFi1oSDK AFAdRevenueData;
                private final Runnable areAllFieldsValid;
                private ScheduledFuture<?> component4;
                private final ScheduledExecutorService getCurrencyIso4217Code;
                private volatile boolean getMediationNetwork;
                private final AFa1mSDK getMonetizationNetwork;
                final AFb1aSDK.AFa1tSDK getRevenue;

                public AFb1iSDK(ScheduledExecutorService scheduledExecutorService, AFa1mSDK aFa1mSDK, AFi1oSDK aFi1oSDK, AFb1aSDK.AFa1tSDK aFa1tSDK) {
/* 1 */             scheduledExecutorService.getClass();
/* 4 */             aFa1mSDK.getClass();
/* 7 */             aFi1oSDK.getClass();
/* 10 */            aFa1tSDK.getClass();
/* 16 */            this.getCurrencyIso4217Code = scheduledExecutorService;
/* 18 */            this.getMonetizationNetwork = aFa1mSDK;
/* 20 */            this.AFAdRevenueData = aFi1oSDK;
/* 22 */            this.getRevenue = aFa1tSDK;
/* 30 */            this.areAllFieldsValid = new RunnableC0294f(this, 0);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void getMediationNetwork(AFb1iSDK aFb1iSDK) {
                    Object n42Var;
/* 1 */             aFb1iSDK.getClass();
/* 5 */             aFb1iSDK.getMediationNetwork = false;
                    try {
/* 7 */                 m42 m42Var = o42.f14612b;
/* 11 */                aFb1iSDK.getRevenue.getMediationNetwork();
/* 14 */                n42Var = Unit.f12910a;
                    } catch (Throwable th) {
/* 18 */                m42 m42Var2 = o42.f14612b;
/* 22 */                n42Var = new n42(th);
                    }
/* 26 */            Throwable thM7099a = o42.m7099a(n42Var);
/* 30 */            if (thM7099a != null) {
/* 34 */                AFLogger.afErrorLog("Background task failed with a throwable: ", thM7099a);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void getMonetizationNetwork(AFb1iSDK aFb1iSDK, AFh1qSDK aFh1qSDK) {
                    Object n42Var;
/* 1 */             aFb1iSDK.getClass();
/* 4 */             aFh1qSDK.getClass();
                    try {
/* 7 */                 m42 m42Var = o42.f14612b;
/* 11 */                aFb1iSDK.getRevenue.getRevenue(aFh1qSDK);
/* 14 */                n42Var = Unit.f12910a;
                    } catch (Throwable th) {
/* 18 */                m42 m42Var2 = o42.f14612b;
/* 22 */                n42Var = new n42(th);
                    }
/* 26 */            Throwable thM7099a = o42.m7099a(n42Var);
/* 30 */            if (thM7099a != null) {
/* 35 */                AFLogger.afErrorLog("Listener thrown an exception: ", thM7099a, true);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
/* 1 */             activity.getClass();
/* 4 */             AFa1mSDK aFa1mSDK = this.getMonetizationNetwork;
/* 6 */             Intent intent = activity.getIntent();
/* 30 */            if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1mSDK.AFAdRevenueData) {
/* 36 */                aFa1mSDK.AFAdRevenueData = intent;
                    }
/* 40 */            this.AFAdRevenueData.getMonetizationNetwork(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
/* 1 */             activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
/* 1 */             activity.getClass();
/* 6 */             if (this.getMediationNetwork) {
/* 8 */                 ScheduledExecutorService scheduledExecutorService = this.getCurrencyIso4217Code;
/* 10 */                Runnable runnable = this.areAllFieldsValid;
/* 12 */                AFb1aSDK.Companion aFa1zSDK = AFb1aSDK.INSTANCE;
/* 24 */                this.component4 = scheduledExecutorService.schedule(runnable, AFb1aSDK.Companion.getMediationNetwork(), TimeUnit.MILLISECONDS);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
/* 1 */             activity.getClass();
/* 7 */             if (!this.getMediationNetwork) {
/* 9 */                 this.getMediationNetwork = true;
/* 26 */                this.getCurrencyIso4217Code.execute(new RunnableC0295g(0, this, new AFh1qSDK(activity, this.AFAdRevenueData)));
                    } else {
/* 30 */                ScheduledFuture<?> scheduledFuture = this.component4;
/* 32 */                if (scheduledFuture != null) {
/* 34 */                    scheduledFuture.cancel(true);
                        }
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
