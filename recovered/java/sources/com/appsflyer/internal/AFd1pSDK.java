            package com.appsflyer.internal;

            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFd1pSDK {
                public static boolean getCurrencyIso4217Code(String str, String str2) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 7 */             int mediationNetwork = AFk1xSDK.getMediationNetwork(str);
/* 11 */            int mediationNetwork2 = AFk1xSDK.getMediationNetwork(str2);
/* 15 */            Pair<Integer, Integer> monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
/* 19 */            Pair<Integer, Integer> pairAFAdRevenueData = AFd1rSDK.AFAdRevenueData(str2);
/* 26 */            if (mediationNetwork2 != -1 && monetizationNetwork == null) {
                        return mediationNetwork2 == mediationNetwork;
                    }
/* 34 */            if (pairAFAdRevenueData != null) {
                        return ((Number) pairAFAdRevenueData.f12908a).intValue() <= mediationNetwork && mediationNetwork <= ((Number) pairAFAdRevenueData.f12909b).intValue();
                    }
                    return monetizationNetwork != null && ((Number) monetizationNetwork.f12908a).intValue() <= mediationNetwork && mediationNetwork <= ((Number) monetizationNetwork.f12909b).intValue();
                }
            }
