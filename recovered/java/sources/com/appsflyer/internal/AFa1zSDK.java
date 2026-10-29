            package com.appsflyer.internal;

            import android.content.Context;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
            import com.appsflyer.AppsFlyerLib;
            import com.appsflyer.attribution.AppsFlyerRequestListener;
            import com.appsflyer.internal.AFe1oSDK.RunnableC02601;
            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.lang.ref.WeakReference;
            import java.util.HashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFa1zSDK implements Runnable {
                final String AFAdRevenueData;
                private final Map<String, String> areAllFieldsValid;
                private final String component1;
                private final String component3;
                private final WeakReference<Context> getCurrencyIso4217Code;
                private final String getMediationNetwork;
                final String getMonetizationNetwork;
                final String getRevenue;

                public AFa1zSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
/* 9 */             this.getCurrencyIso4217Code = new WeakReference<>(context);
/* 11 */            this.getMediationNetwork = str;
/* 13 */            this.component1 = str2;
/* 15 */            this.getMonetizationNetwork = str4;
/* 17 */            this.getRevenue = str5;
/* 19 */            this.AFAdRevenueData = str6;
/* 21 */            this.areAllFieldsValid = map;
/* 23 */            this.component3 = str3;
                }

                public static void AFAdRevenueData(boolean z, String str, String str2, String str3, String str4) {
/* 3 */             if (AFa1ySDK.getCurrencyIso4217Code != null) {
/* 9 */                 StringBuilder sbM3514r = AbstractC0886en.m3514r("Validate callback parameters: ", str, " ", str2, " ");
/* 13 */                sbM3514r.append(str3);
/* 20 */                AFLogger.afDebugLog(sbM3514r.toString());
/* 23 */                if (z) {
/* 35 */                    AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
/* 40 */                    AFa1ySDK.getCurrencyIso4217Code.onValidateInApp();
/* 43 */                    return;
                        }
/* 54 */                AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
/* 57 */                AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1ySDK.getCurrencyIso4217Code;
/* 59 */                if (str4 == null) {
/* 61 */                    str4 = "Failed validating";
                        }
/* 63 */                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
                    }
                }

                private static AFf1sSDK getCurrencyIso4217Code(Context context, AFh1fSDK aFh1fSDK) {
/* 5 */             AFa1ySDK.getRevenue().AFAdRevenueData(context);
/* 12 */            AFd1zSDK monetizationNetwork = AFa1ySDK.getRevenue().getMonetizationNetwork();
/* 29 */            aFh1fSDK.AFAdRevenueData(monetizationNetwork.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0));
/* 34 */            AFf1sSDK aFf1sSDK = new AFf1sSDK(aFh1fSDK, monetizationNetwork);
/* 37 */            AFe1oSDK aFe1oSDKCopydefault = monetizationNetwork.copydefault();
/* 48 */            aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new RunnableC02601(aFf1sSDK));
/* 51 */            return aFf1sSDK;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             String str = this.getMediationNetwork;
/* 3 */             if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
/* 278 */               return;
                    }
                    try {
/* 27 */                Context context = this.getCurrencyIso4217Code.get();
/* 33 */                if (context == null) {
/* 278 */                   return;
                        }
/* 39 */                HashMap map = new HashMap();
/* 46 */                map.put("public-key", this.component1);
/* 53 */                map.put("sig-data", this.getMonetizationNetwork);
/* 60 */                map.put("signature", this.component3);
/* 65 */                Object map2 = new HashMap(map);
/* 68 */                Object obj = this.areAllFieldsValid;
/* 86 */                String monetizationNetwork = AFa1ySDK.getRevenue().getMonetizationNetwork().component4().getMonetizationNetwork("referrer", HttpUrl.FRAGMENT_ENCODE_SET);
/* 92 */                AFh1cSDK aFh1cSDK = new AFh1cSDK();
/* 95 */                aFh1cSDK.component1 = monetizationNetwork;
/* 97 */                AFa1ySDK revenue = AFa1ySDK.getRevenue();
/* 101 */               Map<String, Object> monetizationNetwork2 = revenue.getMonetizationNetwork(aFh1cSDK);
/* 109 */               monetizationNetwork2.put(FirebaseAnalytics.Param.PRICE, this.getRevenue);
/* 116 */               monetizationNetwork2.put(FirebaseAnalytics.Param.CURRENCY, this.AFAdRevenueData);
/* 121 */               monetizationNetwork2.put("receipt_data", map2);
/* 124 */               if (obj != null) {
/* 128 */                   monetizationNetwork2.put("extra_prms", obj);
                        }
/* 146 */               monetizationNetwork2.putAll(revenue.getMonetizationNetwork().AFInAppEventType().getRevenue());
/* 149 */               aFh1cSDK.AFAdRevenueData((Map<String, ?>) monetizationNetwork2);
/* 152 */               getCurrencyIso4217Code(context, aFh1cSDK);
/* 159 */               map.put("dev_key", this.getMediationNetwork);
/* 168 */               map.put("app_id", context.getPackageName());
/* 181 */               map.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
/* 198 */               AFh1rSDK aFh1rSDK = AFa1ySDK.getRevenue().getMonetizationNetwork().AFAdRevenueData().getMonetizationNetwork.component3;
/* 213 */               AFb1jSDK aFb1jSDK = aFh1rSDK != null ? new AFb1jSDK(aFh1rSDK.getMonetizationNetwork, aFh1rSDK.component2) : null;
/* 216 */               String str2 = aFb1jSDK != null ? aFb1jSDK.getRevenue : null;
/* 218 */               if (str2 != null) {
/* 222 */                   map.put("advertiserId", str2);
                        }
/* 234 */               AFh1bSDK aFh1bSDK = (AFh1bSDK) new AFh1bSDK().AFAdRevenueData(map);
/* 236 */               final AFf1sSDK currencyIso4217Code = getCurrencyIso4217Code(context, aFh1bSDK);
/* 245 */               aFh1bSDK.getCurrencyIso4217Code = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1zSDK.2
                            @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                            public final void onError(int i, String str3) {
                                ResponseNetwork responseNetwork;
/* 3 */                         if (i == 50 && (responseNetwork = ((AFe1fSDK) currencyIso4217Code).areAllFieldsValid) != null) {
/* 11 */                            str3 = responseNetwork.toString();
                                }
/* 15 */                        AFa1zSDK aFa1zSDK = AFa1zSDK.this;
/* 24 */                        AFa1zSDK.AFAdRevenueData(false, aFa1zSDK.getMonetizationNetwork, aFa1zSDK.getRevenue, aFa1zSDK.AFAdRevenueData, str3);
                            }

                            @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                            public final void onSuccess() {
                                try {
/* 13 */                            JSONObject jSONObject = new JSONObject((String) ((AFe1fSDK) currencyIso4217Code).areAllFieldsValid.getBody());
/* 26 */                            AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
/* 31 */                            boolean zOptBoolean = jSONObject.optBoolean("result");
/* 35 */                            AFa1zSDK aFa1zSDK = AFa1zSDK.this;
/* 47 */                            AFa1zSDK.AFAdRevenueData(zOptBoolean, aFa1zSDK.getMonetizationNetwork, aFa1zSDK.getRevenue, aFa1zSDK.AFAdRevenueData, jSONObject.toString());
                                } catch (Exception e) {
/* 62 */                            AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
/* 65 */                            AFa1zSDK aFa1zSDK2 = AFa1zSDK.this;
/* 78 */                            AFa1zSDK.AFAdRevenueData(false, aFa1zSDK2.getMonetizationNetwork, aFa1zSDK2.getRevenue, aFa1zSDK2.AFAdRevenueData, e.getMessage());
                                }
                            }
                        };
                    } catch (Throwable th) {
/* 250 */               if (AFa1ySDK.getCurrencyIso4217Code != null) {
/* 254 */                   AFLogger.afErrorLog("Failed Validate request + ex", th);
/* 268 */                   AFAdRevenueData(false, this.getMonetizationNetwork, this.getRevenue, this.AFAdRevenueData, th.getMessage());
                        }
/* 275 */               AFLogger.afErrorLog(th.getMessage(), th);
                    }
                }
            }
