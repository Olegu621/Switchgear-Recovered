            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import java.util.Map;
            import org.json.JSONException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFg1kSDK extends AFe1mSDK<Void> {
                private final AFe1wSDK<String> component1;
                private final Throwable component3;
                private final AFc1qSDK component4;

                public AFg1kSDK(AFf1rSDK aFf1rSDK, AFc1qSDK aFc1qSDK) {
/* 11 */            super(AFe1pSDK.GCDSDK, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, "GCD-CHECK");
/* 18 */            this.component3 = aFf1rSDK.component1();
/* 22 */            this.component1 = ((AFe1fSDK) aFf1rSDK).areAllFieldsValid;
/* 24 */            this.component4 = aFc1qSDK;
                }

                private Map<String, Object> component3() {
/* 6 */             String monetizationNetwork = this.component4.getMonetizationNetwork("attributionId", (String) null);
/* 10 */            if (monetizationNetwork == null) {
/* 5 */                 return null;
                    }
                    try {
/* 15 */                new AFd1iSDK();
/* 18 */                return AFd1iSDK.getMediationNetwork(monetizationNetwork);
                    } catch (JSONException e) {
/* 28 */                StringBuilder sb = new StringBuilder("[GCD] Failed to parse GCD response: ");
/* 35 */                sb.append(e.getMessage());
/* 42 */                AFLogger.afErrorLog(sb.toString(), e);
/* 5 */                 return null;
                    }
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final long AFAdRevenueData() {
/* 1 */             return 1000L;
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final boolean getMonetizationNetwork() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final AFe1uSDK getRevenue() throws Exception {
/* 22 */            AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.component4.getRevenue("appsFlyerCount", 0))));
/* 31 */            long monetizationNetwork = this.component4.getMonetizationNetwork("appsflyerConversionDataCacheExpiration", 0L);
/* 37 */            if (monetizationNetwork != 0 && System.currentTimeMillis() - monetizationNetwork > 5184000000L) {
/* 55 */                AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
/* 63 */                this.component4.AFAdRevenueData("sixtyDayConversionData", true);
/* 71 */                this.component4.getRevenue("attributionId", (String) null);
/* 76 */                this.component4.AFAdRevenueData("appsflyerConversionDataCacheExpiration", 0L);
                    }
/* 79 */            Map<String, Object> mapComponent3 = component3();
/* 85 */            if (mapComponent3 != null) {
                        try {
/* 91 */                    if (!mapComponent3.containsKey("is_first_launch")) {
/* 95 */                        mapComponent3.put("is_first_launch", Boolean.FALSE);
                            }
/* 101 */                   AFg1oSDK.getCurrencyIso4217Code(mapComponent3);
                        } catch (Exception e) {
/* 107 */                   StringBuilder sb = new StringBuilder("[GCD] Error executing conversion data callback: ");
/* 114 */                   sb.append(e.getLocalizedMessage());
/* 121 */                   AFLogger.afErrorLog(sb.toString(), e);
                        }
/* 124 */               return AFe1uSDK.SUCCESS;
                    }
                    try {
/* 129 */               if (this.component3 != null) {
/* 135 */                   StringBuilder sb2 = new StringBuilder("Launch exception: ");
/* 144 */                   sb2.append(this.component3.getMessage());
/* 151 */                   AFg1oSDK.getRevenue(sb2.toString());
/* 154 */                   return AFe1uSDK.SUCCESS;
                        }
/* 159 */               AFe1wSDK<String> aFe1wSDK = this.component1;
/* 161 */               if (aFe1wSDK != null && !aFe1wSDK.isSuccessful()) {
/* 173 */                   StringBuilder sb3 = new StringBuilder("Launch status code: ");
/* 182 */                   sb3.append(this.component1.getStatusCode());
/* 189 */                   AFg1oSDK.getRevenue(sb3.toString());
/* 192 */                   return AFe1uSDK.SUCCESS;
                        }
/* 214 */               return AFe1uSDK.FAILURE;
                    } catch (Exception e2) {
/* 197 */               StringBuilder sb4 = new StringBuilder("[GCD] Error executing conversion data callback: ");
/* 204 */               sb4.append(e2.getLocalizedMessage());
/* 211 */               AFLogger.afErrorLog(sb4.toString(), e2);
                    }
                }
            }
