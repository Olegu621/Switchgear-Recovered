            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AFi1cSDK extends AFj1tSDK {
                private AFc1oSDK AFAdRevenueData;

                public AFi1cSDK(String str, String str2, AFc1oSDK aFc1oSDK, Runnable runnable) {
/* 1 */             super(str, str2, runnable);
/* 4 */             this.AFAdRevenueData = aFc1oSDK;
                }

                public final boolean getRevenue() {
/* 12 */            if (this.AFAdRevenueData.getMediationNetwork.getRevenue("appsFlyerCount", 0) <= 0) {
/* 24 */                return true;
                    }
/* 20 */            AFLogger.INSTANCE.m1810d(AFg1cSDK.REFERRER, "Install referrer will not load, the counter >= 1, ");
/* 7 */             return false;
                }
            }
