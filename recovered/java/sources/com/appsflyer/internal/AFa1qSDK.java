            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerProperties;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFa1qSDK {
                public static JSONObject getMonetizationNetwork(String str) {
/* 1 */             JSONObject jSONObjectAFAdRevenueData = AFg1eSDK.AFAdRevenueData(str);
/* 5 */             if (jSONObjectAFAdRevenueData != null) {
                        try {
/* 13 */                    if (jSONObjectAFAdRevenueData.has("ol_id")) {
/* 18 */                        String strOptString = jSONObjectAFAdRevenueData.optString("ol_scheme", null);
/* 24 */                        String strOptString2 = jSONObjectAFAdRevenueData.optString("ol_domain", null);
/* 30 */                        String strOptString3 = jSONObjectAFAdRevenueData.optString("ol_ver", null);
/* 34 */                        if (strOptString != null) {
/* 42 */                            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, strOptString);
                                }
/* 49 */                        if (strOptString2 != null) {
/* 57 */                            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, strOptString2);
                                }
/* 60 */                        if (strOptString3 != null) {
/* 68 */                            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, strOptString3);
/* 71 */                            return jSONObjectAFAdRevenueData;
                                }
                            }
                        } catch (Throwable th) {
/* 72 */                    AFLogger aFLogger = AFLogger.INSTANCE;
/* 74 */                    AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
/* 80 */                    StringBuilder sb = new StringBuilder("Error in handleResponse: ");
/* 87 */                    sb.append(th.getMessage());
/* 97 */                    aFLogger.m1814e(aFg1cSDK, sb.toString(), th, false, false, true);
/* 112 */                   AFa1ySDK.getRevenue().getMonetizationNetwork().copy().getRevenue();
/* 127 */                   AFa1ySDK.getRevenue().getMonetizationNetwork().copy().getMediationNetwork();
                        }
                    }
/* 130 */           return jSONObjectAFAdRevenueData;
                }
            }
