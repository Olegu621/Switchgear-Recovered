            package com.appsflyer.internal;

            import android.os.Build;
            import com.appsflyer.AFLogger;
            import com.appsflyer.attribution.AppsFlyerRequestListener;
            import com.appsflyer.deeplink.DeepLink;
            import com.appsflyer.deeplink.DeepLinkResult;
            import com.appsflyer.internal.components.network.http.ResponseNetwork;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Observable;
            import java.util.Observer;
            import java.util.TimeZone;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import kotlin.Pair;
            import p000.fm0;
            import p000.oc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 56 */    public final class AFf1xSDK extends AFe1fSDK<AFa1oSDK> {
                private int AFInAppEventParameterName;
                private final CountDownLatch AFInAppEventType;
                private int AFKeystoreWrapper;
                private final List<AFj1tSDK> AFLogger;
                private final AFa1rSDK component2;
                private final AFh1xSDK copy;
                private final AFc1oSDK copydefault;
                private final AFj1sSDK equals;
                private final AFa1mSDK hashCode;
                private int registerClient;
                private final AFc1eSDK toString;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public /* synthetic */ class AFa1uSDK {
                    public static final /* synthetic */ int[] getMonetizationNetwork;
                    public static final /* synthetic */ int[] getRevenue;

                    static {
/* 6 */                 int[] iArr = new int[AFe1uSDK.values().length];
                        try {
/* 15 */                    iArr[AFe1uSDK.SUCCESS.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 24 */                    iArr[AFe1uSDK.FAILURE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
/* 26 */                getRevenue = iArr;
/* 33 */                int[] iArr2 = new int[AFj1tSDK.AFa1tSDK.values().length];
                        try {
/* 41 */                    iArr2[AFj1tSDK.AFa1tSDK.FINISHED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
/* 49 */                    iArr2[AFj1tSDK.AFa1tSDK.STARTED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused4) {
                        }
/* 51 */                getMonetizationNetwork = iArr2;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AFf1xSDK(AFa1rSDK aFa1rSDK, AFd1zSDK aFd1zSDK) {
/* 19 */            super(AFe1pSDK.DLSDK, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, "DdlSdk");
/* 1 */             aFa1rSDK.getClass();
/* 4 */             aFd1zSDK.getClass();
/* 22 */            this.component2 = aFa1rSDK;
/* 30 */            this.AFInAppEventType = new CountDownLatch(1);
/* 37 */            this.AFLogger = new ArrayList();
/* 39 */            AFc1oSDK aFc1oSDKAFAdRevenueData = aFd1zSDK.AFAdRevenueData();
/* 43 */            aFc1oSDKAFAdRevenueData.getClass();
/* 46 */            this.copydefault = aFc1oSDKAFAdRevenueData;
/* 48 */            AFc1eSDK aFc1eSDKForce = aFd1zSDK.force();
/* 52 */            aFc1eSDKForce.getClass();
/* 55 */            this.toString = aFc1eSDKForce;
/* 57 */            AFa1mSDK aFa1mSDKMo1781i = aFd1zSDK.mo1781i();
/* 61 */            aFa1mSDKMo1781i.getClass();
/* 64 */            this.hashCode = aFa1mSDKMo1781i;
/* 66 */            AFh1xSDK aFh1xSDKAreAllFieldsValid = aFd1zSDK.areAllFieldsValid();
/* 70 */            aFh1xSDKAreAllFieldsValid.getClass();
/* 73 */            this.copy = aFh1xSDKAreAllFieldsValid;
/* 75 */            AFj1sSDK aFj1sSDKAFLogger = aFd1zSDK.AFLogger();
/* 79 */            aFj1sSDKAFLogger.getClass();
/* 82 */            this.equals = aFj1sSDKAFLogger;
/* 93 */            AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) aFj1sSDKAFLogger.getRevenue.toArray(new AFj1tSDK[0]);
/* 95 */            aFj1tSDKArr.getClass();
/* 100 */           ArrayList<AFj1tSDK> arrayList = new ArrayList();
/* 104 */           for (AFj1tSDK aFj1tSDK : aFj1tSDKArr) {
/* 108 */               if (aFj1tSDK != null && aFj1tSDK.component4 != AFj1tSDK.AFa1tSDK.NOT_STARTED) {
/* 116 */                   arrayList.add(aFj1tSDK);
                        }
                    }
/* 126 */           this.AFInAppEventParameterName = arrayList.size();
/* 136 */           for (final AFj1tSDK aFj1tSDK2 : arrayList) {
/* 144 */               AFj1tSDK.AFa1tSDK aFa1tSDK = aFj1tSDK2.component4;
/* 156 */               int i = aFa1tSDK == null ? -1 : AFa1uSDK.getMonetizationNetwork[aFa1tSDK.ordinal()];
/* 158 */               if (i == 1) {
/* 205 */                   AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK2.getMediationNetwork.get(FirebaseAnalytics.Param.SOURCE) + " referrer collected earlier", false, 4, null);
/* 208 */                   getCurrencyIso4217Code(aFj1tSDK2);
                        } else if (i == 2) {
/* 169 */                   aFj1tSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.m
                                @Override // java.util.Observer
                                public final void update(Observable observable, Object obj) {
/* 1 */                             AFf1xSDK.getRevenue(aFj1tSDK2, this, observable, obj);
                                }
                            });
                        }
                    }
                }

                private final boolean equals() {
/* 7 */             Object obj = this.component2.AFAdRevenueData.get("referrers");
/* 18 */            List list = obj instanceof List ? (List) obj : null;
                    return (list != null ? list.size() : 0) < this.AFInAppEventParameterName && !this.component2.AFAdRevenueData.containsKey("referrers");
                }

                private final void getCurrencyIso4217Code(AFj1tSDK aFj1tSDK) {
/* 5 */             if (getRevenue(aFj1tSDK)) {
/* 9 */                 this.AFLogger.add(aFj1tSDK);
/* 14 */                this.AFInAppEventType.countDown();
/* 38 */                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Added non-organic ".concat(aFj1tSDK.getClass().getSimpleName()), false, 4, null);
                    } else {
/* 44 */                int i = this.AFKeystoreWrapper + 1;
/* 46 */                this.AFKeystoreWrapper = i;
/* 50 */                if (i == this.AFInAppEventParameterName) {
/* 54 */                    this.AFInAppEventType.countDown();
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:34:0x0140  */
                @Override // com.appsflyer.internal.AFe1fSDK
                public final AFd1hSDK<AFa1oSDK> AFAdRevenueData(String str) {
                    Map mapM7131e;
                    String[] strArr;
/* 1 */             str.getClass();
/* 7 */             int i = this.registerClient + 1;
/* 8 */             this.registerClient = i;
/* 23 */            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, fm0.m3781g(i, "Preparing request "), false, 4, null);
/* 28 */            Map<String, Object> map = this.component2.AFAdRevenueData;
/* 33 */            if (this.registerClient == 1) {
/* 56 */                map.put("is_first", Boolean.valueOf(this.copydefault.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 0));
/* 97 */                map.put("lang", Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
/* 104 */               map.put("os", Build.VERSION.RELEASE);
/* 111 */               map.put("type", Build.MODEL);
/* 124 */               map.put("request_id", AFb1kSDK.getCurrencyIso4217Code(this.copydefault.getMediationNetwork));
/* 129 */               AFb1tSDK aFb1tSDK = this.toString.getRevenue;
/* 131 */               if (aFb1tSDK != null && (strArr = aFb1tSDK.AFAdRevenueData) != null) {
/* 139 */                   map.put("sharing_filter", strArr);
                        }
/* 146 */               AFh1rSDK aFh1rSDK = this.copydefault.getMonetizationNetwork.component3;
/* 161 */               Map<String, String> currencyIso4217Code = getCurrencyIso4217Code(aFh1rSDK != null ? new AFb1jSDK(aFh1rSDK.getMonetizationNetwork, aFh1rSDK.component2) : null);
/* 165 */               if (currencyIso4217Code != null) {
/* 169 */                   map.put("gaid", currencyIso4217Code);
                        }
/* 182 */               Map<String, String> currencyIso4217Code2 = getCurrencyIso4217Code(AFb1lSDK.getMediationNetwork(this.copydefault.getCurrencyIso4217Code.getMonetizationNetwork));
/* 186 */               if (currencyIso4217Code2 != null) {
/* 190 */                   map.put("oaid", currencyIso4217Code2);
                        }
                    }
/* 193 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 203 */           SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
/* 212 */           simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 226 */           map.put("timestamp", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
/* 237 */           map.put("request_count", Integer.valueOf(this.registerClient));
/* 240 */           List<AFj1tSDK> list = this.AFLogger;
/* 244 */           ArrayList arrayList = new ArrayList();
/* 255 */           for (AFj1tSDK aFj1tSDK : list) {
/* 267 */               if (aFj1tSDK.component4 == AFj1tSDK.AFa1tSDK.FINISHED) {
/* 273 */                   Object obj = aFj1tSDK.getMediationNetwork.get("referrer");
/* 284 */                   String str2 = obj instanceof String ? (String) obj : null;
/* 285 */                   if (str2 != null) {
/* 291 */                       Object obj2 = aFj1tSDK.getMediationNetwork.get(FirebaseAnalytics.Param.SOURCE);
/* 295 */                       obj2.getClass();
/* 316 */                       mapM7131e = oc1.m7131e(new Pair(FirebaseAnalytics.Param.SOURCE, (String) obj2), new Pair(FirebaseAnalytics.Param.VALUE, str2));
                            } else {
/* 321 */                       mapM7131e = null;
                            }
                        } else {
/* 321 */                   mapM7131e = null;
                        }
/* 322 */               if (mapM7131e != null) {
/* 324 */                   arrayList.add(mapM7131e);
                        }
                    }
/* 332 */           if (!arrayList.isEmpty()) {
/* 336 */               map.put("referrers", arrayList);
                    }
/* 339 */           AFa1rSDK aFa1rSDK = this.component2;
/* 346 */           AFj1cSDK aFj1cSDK = new AFj1cSDK(this.copydefault, null, 2, null);
/* 351 */           String mediationNetwork = ((AFe1fSDK) this).component1.getMediationNetwork();
/* 359 */           Object obj3 = this.component2.AFAdRevenueData.get("timestamp");
/* 363 */           obj3.getClass();
/* 372 */           aFa1rSDK.component2 = aFj1cSDK.getMonetizationNetwork(mediationNetwork, (String) obj3);
/* 374 */           AFh1xSDK aFh1xSDK = this.copy;
/* 376 */           int i2 = this.registerClient;
/* 378 */           if (i2 <= 0 || i2 > 2) {
/* 443 */               AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i2))));
                    } else {
/* 383 */               int i3 = i2 - 1;
/* 391 */               aFh1xSDK.component3[i3] = System.currentTimeMillis();
/* 393 */               if (i3 == 0) {
/* 395 */                   long j = aFh1xSDK.component4;
/* 401 */                   if (j != 0) {
/* 416 */                       aFh1xSDK.getMediationNetwork.put("from_fg", Long.valueOf(aFh1xSDK.component3[i3] - j));
                            } else {
/* 422 */                       AFLogger.afInfoLog("Metrics: fg ts is missing");
                            }
                        }
                    }
/* 450 */           AFd1hSDK<AFa1oSDK> monetizationNetwork = ((AFe1fSDK) this).component4.getMonetizationNetwork(this.component2);
/* 454 */           monetizationNetwork.getClass();
/* 457 */           return monetizationNetwork;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                /* JADX INFO: renamed from: a_ */
                public final boolean mo1797a_() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final /* bridge */ /* synthetic */ AppsFlyerRequestListener component2() {
/* 1 */             return null;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final boolean copydefault() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final boolean getMonetizationNetwork() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final AFe1uSDK getRevenue() {
/* 3 */             AFe1uSDK aFe1uSDK = AFe1uSDK.FAILURE;
                    try {
/* 7 */                 AFe1uSDK revenue = super.getRevenue();
/* 11 */                revenue.getClass();
                        try {
/* 14 */                    AFh1xSDK aFh1xSDK = this.copy;
/* 16 */                    int i = this.registerClient;
/* 21 */                    if (i <= 0 || i > 2) {
/* 104 */                       AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
                            } else {
/* 26 */                        int i2 = i - 1;
/* 33 */                        aFh1xSDK.component2[i2] = System.currentTimeMillis();
/* 37 */                        long j = aFh1xSDK.component3[i2];
/* 41 */                        if (j != 0) {
/* 43 */                            long[] jArr = aFh1xSDK.component1;
/* 50 */                            jArr[i2] = aFh1xSDK.component2[i2] - j;
/* 56 */                            aFh1xSDK.getMediationNetwork.put("net", jArr);
                                } else {
/* 68 */                            StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
/* 71 */                            sb.append(i2);
/* 76 */                            sb.append("] ts is missing");
/* 83 */                            AFLogger.afInfoLog(sb.toString());
                                }
                            }
/* 113 */                   int i3 = AFa1uSDK.getRevenue[revenue.ordinal()];
/* 115 */                   if (i3 != 1) {
/* 117 */                       if (i3 != 2) {
/* 119 */                           return revenue;
                                }
/* 120 */                       AFLogger aFLogger = AFLogger.INSTANCE;
/* 122 */                       AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
/* 124 */                       ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
/* 153 */                       AFh1ySDK.d$default(aFLogger, aFg1cSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
/* 160 */                       DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
/* 169 */                       this.copy.getCurrencyIso4217Code(deepLinkResult, this.hashCode.component2);
/* 174 */                       this.hashCode.getRevenue(deepLinkResult);
/* 177 */                       return revenue;
                            }
/* 178 */                   ResponseNetwork responseNetwork2 = ((AFe1fSDK) this).areAllFieldsValid;
/* 180 */                   responseNetwork2.getClass();
/* 183 */                   Object body = responseNetwork2.getBody();
/* 187 */                   body.getClass();
/* 190 */                   AFa1oSDK aFa1oSDK = (AFa1oSDK) body;
/* 192 */                   DeepLink deepLink = aFa1oSDK.getMediationNetwork;
/* 194 */                   if (deepLink != null) {
/* 198 */                       DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
/* 207 */                       this.copy.getCurrencyIso4217Code(deepLinkResult2, this.hashCode.component2);
/* 212 */                       this.hashCode.getRevenue(deepLinkResult2);
/* 215 */                       return revenue;
                            }
/* 218 */                   if (this.registerClient > 1 || !aFa1oSDK.getGetMonetizationNetwork() || !equals()) {
/* 317 */                       DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
/* 326 */                       this.copy.getCurrencyIso4217Code(deepLinkResult3, this.hashCode.component2);
/* 331 */                       this.hashCode.getRevenue(deepLinkResult3);
/* 334 */                       return revenue;
                            }
/* 241 */                   AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Waiting for referrers...", false, 4, null);
/* 246 */                   this.AFInAppEventType.await();
/* 249 */                   AFh1xSDK aFh1xSDK2 = this.copy;
/* 251 */                   long jCurrentTimeMillis = System.currentTimeMillis();
/* 258 */                   long j2 = aFh1xSDK2.component2[0];
/* 262 */                   if (j2 != 0) {
/* 273 */                       aFh1xSDK2.getMediationNetwork.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j2));
                            } else {
/* 279 */                       AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                            }
/* 286 */                   if (this.AFKeystoreWrapper != this.AFInAppEventParameterName) {
/* 310 */                       return getRevenue();
                            }
/* 290 */                   DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
/* 299 */                   this.copy.getCurrencyIso4217Code(deepLinkResult4, this.hashCode.component2);
/* 304 */                   this.hashCode.getRevenue(deepLinkResult4);
/* 307 */                   return AFe1uSDK.SUCCESS;
                        } catch (Exception e) {
/* 60 */                    e = e;
/* 61 */                    aFe1uSDK = revenue;
/* 336 */                   Throwable cause = e.getCause();
/* 347 */                   if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
/* 356 */                       AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
/* 399 */                       AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.registerClient + " attempt(s) within " + this.hashCode.component2 + " milliseconds", false, 4, null);
/* 406 */                       DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
/* 415 */                       this.copy.getCurrencyIso4217Code(deepLinkResult5, this.hashCode.component2);
/* 420 */                       this.hashCode.getRevenue(deepLinkResult5);
/* 423 */                       return AFe1uSDK.TIMEOUT;
                            }
/* 428 */                   if (cause instanceof IOException) {
/* 439 */                       AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
/* 446 */                       DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
/* 455 */                       this.copy.getCurrencyIso4217Code(deepLinkResult6, this.hashCode.component2);
/* 460 */                       this.hashCode.getRevenue(deepLinkResult6);
/* 509 */                       return aFe1uSDK;
                            }
/* 485 */                   AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
/* 492 */                   DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
/* 501 */                   this.copy.getCurrencyIso4217Code(deepLinkResult7, this.hashCode.component2);
/* 506 */                   this.hashCode.getRevenue(deepLinkResult7);
/* 509 */                   return aFe1uSDK;
                        }
                    } catch (Exception e2) {
/* 335 */               e = e2;
                    }
                }

/* 57 */        private static Map<String, String> getCurrencyIso4217Code(AFb1jSDK aFb1jSDK) {
                    String str;
                    if (aFb1jSDK == null || (str = aFb1jSDK.getRevenue) == null) {
                        return null;
                    }
/* 59 */            Boolean bool = aFb1jSDK.getCurrencyIso4217Code;
/* 60 */            if (bool == null || !bool.booleanValue()) {
/* 64 */                return oc1.m7131e(new Pair("type", "unhashed"), new Pair(FirebaseAnalytics.Param.VALUE, str));
                    }
                    return null;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
/* 457 */       public final long AFAdRevenueData() {
/* 459 */           return this.hashCode.component2;
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 509 */       public static final void getRevenue(AFj1tSDK aFj1tSDK, AFf1xSDK aFf1xSDK, Observable observable, Object obj) {
                    aFf1xSDK.getClass();
/* 513 */           AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, aFj1tSDK.getMediationNetwork.get(FirebaseAnalytics.Param.SOURCE) + " referrer collected via observer", false, 4, null);
/* 514 */           observable.getClass();
                    aFf1xSDK.getCurrencyIso4217Code((AFj1tSDK) observable);
                }

/* 514 */       private static boolean getRevenue(AFj1tSDK aFj1tSDK) {
/* 515 */           Object obj = aFj1tSDK.getMediationNetwork.get("click_ts");
                    Long l = obj instanceof Long ? (Long) obj : null;
                    if (l != null) {
                        if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < 86400000) {
                            return true;
                        }
                    }
                    return false;
                }
            }
