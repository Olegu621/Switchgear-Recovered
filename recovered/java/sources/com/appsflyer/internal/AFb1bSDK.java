            package com.appsflyer.internal;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import java.util.concurrent.ScheduledExecutorService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFb1bSDK implements AFb1aSDK {
                private final ScheduledExecutorService AFAdRevenueData;
                private final AFa1mSDK getCurrencyIso4217Code;
                private AFb1iSDK getMonetizationNetwork;
                private final AFi1oSDK getRevenue;

                public AFb1bSDK(ScheduledExecutorService scheduledExecutorService, AFa1mSDK aFa1mSDK, AFi1oSDK aFi1oSDK) {
/* 1 */             scheduledExecutorService.getClass();
/* 4 */             aFa1mSDK.getClass();
/* 7 */             aFi1oSDK.getClass();
/* 13 */            this.AFAdRevenueData = scheduledExecutorService;
/* 15 */            this.getCurrencyIso4217Code = aFa1mSDK;
/* 17 */            this.getRevenue = aFi1oSDK;
                }

                @Override // com.appsflyer.internal.AFb1aSDK
                public final void AFAdRevenueData(Context context, AFb1aSDK.AFa1tSDK aFa1tSDK) {
/* 1 */             context.getClass();
/* 4 */             aFa1tSDK.getClass();
/* 7 */             context.getClass();
/* 12 */            if (this.getMonetizationNetwork != null) {
/* 14 */                Context applicationContext = context.getApplicationContext();
/* 18 */                applicationContext.getClass();
/* 25 */                ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.getMonetizationNetwork);
                    }
/* 29 */            this.getMonetizationNetwork = null;
/* 39 */            AFb1iSDK aFb1iSDK = new AFb1iSDK(this.AFAdRevenueData, this.getCurrencyIso4217Code, this.getRevenue, aFa1tSDK);
/* 42 */            this.getMonetizationNetwork = aFb1iSDK;
/* 46 */            if (context instanceof Activity) {
/* 51 */                aFb1iSDK.onActivityResumed((Activity) context);
                    }
/* 54 */            Application applicationM1832O_ = AFj1kSDK.m1832O_(context);
/* 58 */            if (applicationM1832O_ != null) {
/* 62 */                applicationM1832O_.registerActivityLifecycleCallbacks(this.getMonetizationNetwork);
                    }
                }

                @Override // com.appsflyer.internal.AFb1aSDK
                public final boolean getMediationNetwork() {
                    return this.getMonetizationNetwork != null;
                }

                @Override // com.appsflyer.internal.AFb1aSDK
                public final void getMonetizationNetwork() {
                    AFb1aSDK.AFa1tSDK aFa1tSDK;
/* 1 */             AFb1iSDK aFb1iSDK = this.getMonetizationNetwork;
/* 3 */             if (aFb1iSDK == null || (aFa1tSDK = aFb1iSDK.getRevenue) == null) {
/* 12 */                return;
                    }
/* 9 */             aFa1tSDK.getMediationNetwork();
                }
            }
