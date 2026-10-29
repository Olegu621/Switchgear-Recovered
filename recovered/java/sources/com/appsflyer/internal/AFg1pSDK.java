            package com.appsflyer.internal;

            import com.appsflyer.AFInAppEventParameterName;
            import com.appsflyer.AFLogger;
            import com.appsflyer.attribution.AppsFlyerRequestListener;
            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFg1pSDK extends AFe1fSDK<Map<String, Object>> {
                private static final List<String> component2 = Arrays.asList("googleplay", "playstore", "googleplaystore");
                private String AFInAppEventType;
                private Map<String, Object> copy;
                private final AFd1nSDK copydefault;
                private final AFc1oSDK equals;
                private final AFc1qSDK hashCode;
                private final AFh1xSDK toString;

                public AFg1pSDK(AFd1zSDK aFd1zSDK) {
/* 11 */            super(AFe1pSDK.GCDSDK, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, aFd1zSDK, "GCD-FETCH");
/* 18 */            this.copydefault = aFd1zSDK.getRevenue();
/* 24 */            this.hashCode = aFd1zSDK.component4();
/* 30 */            this.toString = aFd1zSDK.areAllFieldsValid();
/* 36 */            this.equals = aFd1zSDK.AFAdRevenueData();
/* 42 */            this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
/* 49 */            this.getCurrencyIso4217Code.add(AFe1pSDK.LAUNCH);
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AFd1hSDK<Map<String, Object>> AFAdRevenueData(String str) {
                    String strConcat;
/* 9 */             String strAFAdRevenueData = AFa1ySDK.AFAdRevenueData(this.hashCode, this.equals.component3());
/* 13 */            if (strAFAdRevenueData == null || strAFAdRevenueData.trim().isEmpty()) {
/* 70 */                strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else if (component2.contains(strAFAdRevenueData.toLowerCase(Locale.getDefault()))) {
/* 67 */                AFLogger.afWarnLog("[GCD] AF detected using redundant Google-Play channel for attribution - " + strAFAdRevenueData + ". Using without channel postfix.");
/* 70 */                strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 43 */                strConcat = "-".concat(strAFAdRevenueData);
                    }
/* 74 */            AFd1hSDK<Map<String, Object>> monetizationNetwork = this.copydefault.getMonetizationNetwork(strConcat, str);
/* 82 */            StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
/* 89 */            sb.append(monetizationNetwork.getMonetizationNetwork.getMediationNetwork);
/* 96 */            AFLogger.afInfoLog(sb.toString());
/* 99 */            return monetizationNetwork;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AppsFlyerRequestListener component2() {
/* 1 */             return null;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final boolean copydefault() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final void getCurrencyIso4217Code() {
/* 1 */             super.getCurrencyIso4217Code();
/* 4 */             Map<String, Object> map = this.copy;
/* 6 */             String str = this.AFInAppEventType;
/* 8 */             if (map != null) {
/* 10 */                AFg1oSDK.getCurrencyIso4217Code(map);
                    } else if (str == null || str.isEmpty()) {
/* 28 */                AFg1oSDK.getRevenue("Unknown error");
                    } else {
/* 22 */                AFg1oSDK.getRevenue(str);
                    }
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final boolean getMonetizationNetwork() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final AFe1uSDK getRevenue() throws Exception {
                    AFe1uSDK revenue;
                    AFe1uSDK aFe1uSDK;
/* 15 */            if (((AFe1fSDK) this).component1.getCurrencyIso4217Code()) {
/* 337 */               AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
/* 342 */               this.AFInAppEventType = "'isStopTracking' enabled";
/* 349 */               throw new AFe1iSDK();
                    }
/* 17 */            AFe1uSDK aFe1uSDK2 = AFe1uSDK.FAILURE;
/* 20 */            int i = 0;
/* 22 */            while (i <= 2) {
/* 24 */                boolean z = true;
/* 29 */                boolean z2 = i >= 2;
/* 36 */                this.toString.toString = System.currentTimeMillis();
                        try {
                            try {
/* 38 */                        revenue = super.getRevenue();
/* 42 */                        ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
/* 44 */                        if (responseNetwork != null) {
/* 48 */                            int statusCode = responseNetwork.getStatusCode();
/* 54 */                            if (statusCode != 403 && statusCode < 500) {
/* 61 */                                z = false;
                                    }
/* 68 */                            if (responseNetwork.isSuccessful() || statusCode == 404) {
/* 117 */                               Map<String, Object> map = (Map) responseNetwork.getBody();
/* 119 */                               int statusCode2 = responseNetwork.getStatusCode();
/* 129 */                               Boolean bool = (Boolean) map.get("iscache");
/* 131 */                               if (statusCode2 == 404) {
/* 135 */                                   map.remove("error_reason");
/* 140 */                                   map.remove("status_code");
/* 147 */                                   map.put("af_status", "Organic");
/* 154 */                                   map.put("af_message", "organic install");
                                        }
/* 157 */                               if (bool != null && !bool.booleanValue()) {
/* 173 */                                   this.hashCode.AFAdRevenueData("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                                        }
/* 180 */                               if (map.containsKey("af_siteid")) {
/* 186 */                                   if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
/* 192 */                                       StringBuilder sb = new StringBuilder("[Invite] Detected App-Invite via channel: ");
/* 199 */                                       sb.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
/* 206 */                                       AFLogger.afDebugLog(sb.toString());
                                            } else {
/* 224 */                                       AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                            }
                                        }
/* 229 */                               map.put("is_first_launch", Boolean.FALSE);
/* 245 */                               this.hashCode.getRevenue("attributionId", new JSONObject(map).toString());
/* 256 */                               if (!this.hashCode.getMediationNetwork("sixtyDayConversionData", false)) {
/* 260 */                                   map.put("is_first_launch", Boolean.TRUE);
                                        }
/* 263 */                               this.copy = map;
/* 265 */                               aFe1uSDK = AFe1uSDK.SUCCESS;
                                    } else {
/* 73 */                                if (!z2) {
/* 75 */                                    if (!z) {
                                            }
                                        }
/* 91 */                                this.AFInAppEventType = "Error connection to server: ".concat(String.valueOf(statusCode));
/* 93 */                                aFe1uSDK = AFe1uSDK.FAILURE;
                                    }
/* 97 */                            this.toString.getMonetizationNetwork(i);
/* 100 */                           AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
/* 103 */                           return aFe1uSDK;
                                }
                            } catch (AFe1nSDK e) {
/* 317 */                       AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
/* 322 */                       this.AFInAppEventType = "AppsFlyer dev key is missing";
/* 324 */                       throw e;
                            } catch (Exception e2) {
/* 273 */                       StringBuilder sb2 = new StringBuilder("[GCD] Error: ");
/* 280 */                       sb2.append(e2.getMessage());
/* 287 */                       AFLogger.afErrorLog(sb2.toString(), e2, false, false);
/* 290 */                       revenue = AFe1uSDK.FAILURE;
/* 292 */                       if (z2) {
/* 312 */                           this.AFInAppEventType = e2.getMessage();
/* 314 */                           throw e2;
                                }
                            }
/* 296 */                   this.toString.getMonetizationNetwork(i);
/* 299 */                   AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
/* 78 */                    aFe1uSDK2 = revenue;
/* 304 */                   i++;
                        } catch (Throwable th) {
/* 327 */                   this.toString.getMonetizationNetwork(i);
/* 330 */                   AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
/* 333 */                   throw th;
                        }
                    }
/* 334 */           return aFe1uSDK2;
                }
            }
