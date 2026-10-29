            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFg1aSDK {
                public static String getCurrencyIso4217Code(String str) {
                    return str.length() > 20 ? str.substring(0, 10).concat("...") : str;
                }

                private static String getMediationNetwork(String str) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 11 */            for (int i = 0; i < str.length(); i++) {
/* 13 */                if (i == 0 || i == str.length() - 1) {
/* 34 */                    sb.append(str.charAt(i));
                        } else {
/* 26 */                    sb.append("*");
                        }
                    }
/* 40 */            return sb.toString();
                }

                public static void getRevenue(String str, JSONObject jSONObject) {
/* 7 */             if (jSONObject != null) {
                        try {
/* 13 */                    if (jSONObject.has("appsflyerKey")) {
/* 23 */                        jSONObject.put("appsflyerKey", getMediationNetwork(jSONObject.getString("appsflyerKey")));
                            }
/* 30 */                    if (jSONObject.has("tcstring")) {
/* 36 */                        jSONObject.put("tcstring", getCurrencyIso4217Code("tcstring"));
                            }
/* 43 */                    if (jSONObject.has("referrer")) {
/* 49 */                        jSONObject.put("referrer", getCurrencyIso4217Code("referrer"));
                            }
/* 52 */                    AFLogger aFLogger = AFLogger.INSTANCE;
/* 54 */                    AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
/* 58 */                    StringBuilder sb = new StringBuilder();
/* 61 */                    sb.append(str);
/* 64 */                    sb.append(jSONObject);
/* 71 */                    aFLogger.m1815i(aFg1cSDK, sb.toString());
                        } catch (JSONException e) {
/* 82 */                    AFLogger.INSTANCE.m1811e(AFg1cSDK.OTHER, "Not able to log the payload", e);
                        }
                    }
                }
            }
