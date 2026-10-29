            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerConversionListener;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFg1oSDK {
                public static void getCurrencyIso4217Code(Map<String, Object> map) {
/* 5 */             AppsFlyerConversionListener appsFlyerConversionListener = AFa1ySDK.getRevenue().getRevenue;
/* 7 */             if (appsFlyerConversionListener != null) {
/* 13 */                StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
/* 20 */                sb.append(map.toString());
/* 27 */                AFLogger.afDebugLog(sb.toString());
/* 30 */                appsFlyerConversionListener.onConversionDataSuccess(map);
                    }
                }

                public static void getRevenue(String str) {
/* 5 */             AppsFlyerConversionListener appsFlyerConversionListener = AFa1ySDK.getRevenue().getRevenue;
/* 7 */             if (appsFlyerConversionListener != null) {
/* 19 */                AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
/* 22 */                appsFlyerConversionListener.onConversionDataFail(str);
                    }
                }
            }
