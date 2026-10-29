            package com.appsflyer.internal;

            import android.app.Activity;
            import android.content.Intent;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFh1qSDK {
                public final String AFAdRevenueData;
                public final String getCurrencyIso4217Code;
                public final Intent getMonetizationNetwork;

                public AFh1qSDK(Activity activity, AFi1oSDK aFi1oSDK) {
/* 1 */             activity.getClass();
/* 4 */             aFi1oSDK.getClass();
/* 14 */            this.getMonetizationNetwork = activity.getIntent();
/* 20 */            this.getCurrencyIso4217Code = aFi1oSDK.getMediationNetwork(activity);
/* 26 */            this.AFAdRevenueData = aFi1oSDK.getRevenue(activity);
                }
            }
