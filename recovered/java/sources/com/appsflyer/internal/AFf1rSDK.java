            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerProperties;
            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Map;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFf1rSDK extends AFf1sSDK {
                private final AFf1kSDK AFInAppEventType;
                private final AFa1lSDK AFKeystoreWrapper;
                private final AppsFlyerProperties AFLogger;
                private final AFc1qSDK copy;
                private final AFj1sSDK copydefault;
                private final AFh1xSDK equals;
                public Map<String, Object> hashCode;
                private final AFh1pSDK registerClient;

                /* JADX INFO: renamed from: com.appsflyer.internal.AFf1rSDK$4 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C02734 {
                    static final /* synthetic */ int[] getMonetizationNetwork;

                    static {
/* 6 */                 int[] iArr = new int[AFj1tSDK.AFa1tSDK.values().length];
/* 8 */                 getMonetizationNetwork = iArr;
                        try {
/* 17 */                    iArr[AFj1tSDK.AFa1tSDK.FINISHED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    getMonetizationNetwork[AFj1tSDK.AFa1tSDK.STARTED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                    }
                }

                public AFf1rSDK(AFh1mSDK aFh1mSDK, AFd1zSDK aFd1zSDK) {
/* 1 */             super(aFh1mSDK, aFd1zSDK);
/* 8 */             this.copydefault = aFd1zSDK.AFLogger();
/* 14 */            this.copy = aFd1zSDK.component4();
/* 20 */            this.equals = aFd1zSDK.areAllFieldsValid();
/* 26 */            this.AFInAppEventType = aFd1zSDK.component1();
/* 32 */            this.AFLogger = AppsFlyerProperties.getInstance();
/* 38 */            this.AFKeystoreWrapper = aFd1zSDK.afVerboseLog();
/* 44 */            this.registerClient = aFd1zSDK.afWarnLog();
/* 50 */            this.getCurrencyIso4217Code.add(AFe1pSDK.RESOLVE_ESP);
/* 57 */            this.getCurrencyIso4217Code.add(AFe1pSDK.DLSDK);
                }

                private boolean copy() {
/* 1 */             ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
/* 23 */            boolean z = this.getMonetizationNetwork == AFe1uSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
/* 24 */            AFe1pSDK aFe1pSDK = this.getRevenue;
                    return z && (aFe1pSDK == AFe1pSDK.CONVERSION || aFe1pSDK == AFe1pSDK.ATTR);
                }

                @Override // com.appsflyer.internal.AFf1sSDK
                public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
                    AFh1pSDK aFh1pSDK;
                    AFh1pSDK aFh1pSDK2;
/* 1 */             super.AFAdRevenueData(aFh1mSDK);
/* 4 */             int i = aFh1mSDK.component4;
/* 6 */             AFh1xSDK aFh1xSDK = this.equals;
/* 16 */            if (aFh1xSDK.getCurrencyIso4217Code()) {
/* 18 */                long jCurrentTimeMillis = System.currentTimeMillis();
/* 22 */                aFh1xSDK.copy = jCurrentTimeMillis;
/* 24 */                long j = aFh1xSDK.component4;
/* 28 */                if (j != 0) {
/* 39 */                    aFh1xSDK.AFAdRevenueData.put("from_fg", Long.valueOf(jCurrentTimeMillis - j));
/* 55 */                    aFh1xSDK.getMonetizationNetwork.getRevenue("first_launch", new JSONObject(aFh1xSDK.AFAdRevenueData).toString());
                        } else {
/* 61 */                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                        }
                    }
/* 72 */            Map map = (Map) aFh1mSDK.AFAdRevenueData.get("meta");
/* 74 */            if (map == null) {
/* 78 */                map = new HashMap();
/* 83 */                aFh1mSDK.AFAdRevenueData.put("meta", map);
                    }
/* 94 */            if (!aFh1mSDK.AFAdRevenueData.containsKey("af_deeplink")) {
/* 102 */               aFh1mSDK.AFAdRevenueData(this.AFKeystoreWrapper.getRevenue());
                    }
/* 107 */           AFi1wSDK currencyIso4217Code = this.AFInAppEventType.getCurrencyIso4217Code();
/* 111 */           if (currencyIso4217Code != null) {
/* 115 */               HashMap map2 = new HashMap();
/* 122 */               map2.put("cdn_token", currencyIso4217Code.getMonetizationNetwork);
/* 125 */               String str = currencyIso4217Code.AFAdRevenueData;
/* 127 */               if (str != null) {
/* 131 */                   map2.put("c_ver", str);
                        }
/* 134 */               long j2 = currencyIso4217Code.getCurrencyIso4217Code;
/* 138 */               if (j2 > 0) {
/* 146 */                   map2.put("latency", Long.valueOf(j2));
                        }
/* 149 */               long j3 = currencyIso4217Code.getRevenue;
/* 153 */               if (j3 > 0) {
/* 161 */                   map2.put("delay", Long.valueOf(j3));
                        }
/* 164 */               int i2 = currencyIso4217Code.getMediationNetwork;
/* 166 */               if (i2 > 0) {
/* 174 */                   map2.put("res_code", Integer.valueOf(i2));
                        }
/* 179 */               if (currencyIso4217Code.component1 != null) {
/* 183 */                   StringBuilder sb = new StringBuilder();
/* 196 */                   sb.append(currencyIso4217Code.component1.getClass().getSimpleName());
/* 201 */                   sb.append(": ");
/* 210 */                   sb.append(currencyIso4217Code.component1.getMessage());
/* 219 */                   map2.put("error", sb.toString());
                        }
/* 222 */               AFi1ySDK aFi1ySDK = currencyIso4217Code.areAllFieldsValid;
/* 224 */               if (aFi1ySDK != null) {
/* 232 */                   map2.put("sig", aFi1ySDK.toString());
                        }
/* 235 */               String str2 = currencyIso4217Code.component2;
/* 237 */               if (str2 != null) {
/* 241 */                   map2.put("cdn_cache_status", str2);
                        }
/* 246 */               map.put("rc", map2);
                    }
/* 253 */           this.toString.getCurrencyIso4217Code(aFh1mSDK.AFAdRevenueData);
/* 259 */           if (i == 1) {
/* 315 */               if (this.AFLogger.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
/* 325 */                   aFh1mSDK.AFAdRevenueData.put("wait_cid", Boolean.toString(true));
                        }
/* 328 */               AFh1xSDK aFh1xSDK2 = this.equals;
/* 334 */               HashMap map3 = new HashMap(aFh1xSDK2.getMediationNetwork);
/* 339 */               aFh1xSDK2.getMediationNetwork.clear();
/* 346 */               if (!map3.isEmpty()) {
/* 350 */                   map.put("ddl", map3);
                        }
/* 359 */               HashMap map4 = new HashMap(this.equals.AFAdRevenueData);
/* 366 */               if (!map4.isEmpty()) {
/* 368 */                   map.put("first_launch", map4);
                        }
/* 371 */               AFh1pSDK aFh1pSDK3 = this.registerClient;
/* 373 */               if (aFh1pSDK3 != null) {
/* 375 */                   aFh1pSDK3.getCurrencyIso4217Code(aFh1mSDK);
                        }
                    } else if (i == 2) {
/* 264 */               AFh1xSDK aFh1xSDK3 = this.equals;
/* 268 */               aFh1xSDK3.getMonetizationNetwork.AFAdRevenueData("first_launch");
/* 275 */               HashMap map5 = new HashMap(aFh1xSDK3.AFAdRevenueData);
/* 282 */               if (!map5.isEmpty()) {
/* 284 */                   map.put("first_launch", map5);
                        }
/* 289 */               if ((aFh1mSDK instanceof AFh1kSDK) && (aFh1pSDK2 = this.registerClient) != null && !aFh1pSDK2.getRevenue()) {
/* 303 */                   this.registerClient.getMediationNetwork(aFh1mSDK);
                        }
                    }
/* 382 */           if (map.isEmpty()) {
/* 386 */               aFh1mSDK.AFAdRevenueData.remove("meta");
                    }
/* 389 */           if (i <= 2) {
/* 393 */               ArrayList arrayList = new ArrayList();
/* 409 */               for (AFj1tSDK aFj1tSDK : (AFj1tSDK[]) this.copydefault.getRevenue.toArray(new AFj1tSDK[0])) {
/* 413 */                   boolean z = aFj1tSDK instanceof AFi1aSDK;
/* 423 */                   int i3 = C02734.getMonetizationNetwork[aFj1tSDK.component4.ordinal()];
/* 425 */                   if (i3 == 1) {
/* 464 */                       if (z) {
/* 473 */                           aFh1mSDK.getMonetizationNetwork("rfr", ((AFi1aSDK) aFj1tSDK).getMonetizationNetwork);
/* 480 */                           this.copy.AFAdRevenueData(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                                }
/* 485 */                       arrayList.add(aFj1tSDK.getMediationNetwork);
                            } else if (i3 == 2 && i == 2 && !z) {
/* 436 */                       HashMap map6 = new HashMap();
/* 443 */                       map6.put(FirebaseAnalytics.Param.SOURCE, aFj1tSDK.component3);
/* 450 */                       map6.put("response", "TIMEOUT");
/* 457 */                       map6.put("type", aFj1tSDK.areAllFieldsValid);
/* 460 */                       arrayList.add(map6);
                            }
                        }
/* 495 */               if (!arrayList.isEmpty()) {
/* 499 */                   aFh1mSDK.getMonetizationNetwork("referrers", arrayList);
                        }
/* 502 */               Object obj = this.hashCode;
/* 504 */               if (obj != null) {
/* 508 */                   aFh1mSDK.getMonetizationNetwork("fb_ddl", obj);
                        }
                    }
/* 517 */           if (aFh1mSDK.AFAdRevenueData() == AFe1pSDK.LAUNCH && (aFh1pSDK = this.registerClient) != null && aFh1pSDK.getMonetizationNetwork()) {
/* 531 */               this.registerClient.getMonetizationNetwork(aFh1mSDK);
                    }
/* 536 */           this.toString.getMonetizationNetwork(aFh1mSDK);
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final void getCurrencyIso4217Code() {
/* 1 */             super.getCurrencyIso4217Code();
/* 4 */             AFh1xSDK aFh1xSDK = this.equals;
/* 10 */            if (aFh1xSDK.getCurrencyIso4217Code()) {
/* 12 */                long jCurrentTimeMillis = System.currentTimeMillis();
/* 16 */                long j = aFh1xSDK.copy;
/* 22 */                if (j == 0) {
/* 57 */                    AFLogger.afInfoLog("Metrics: launch start ts is missing");
/* 60 */                    return;
                        }
/* 33 */                aFh1xSDK.AFAdRevenueData.put("net", Long.valueOf(jCurrentTimeMillis - j));
/* 51 */                aFh1xSDK.getMonetizationNetwork.getRevenue("first_launch", new JSONObject(aFh1xSDK.AFAdRevenueData).toString());
                    }
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final boolean getMonetizationNetwork() {
                    return super.getMonetizationNetwork() || copy();
                }
            }
