            package com.appsflyer.internal;

            import android.text.TextUtils;
            import android.util.Base64;
            import com.appsflyer.AFLogger;
            import com.appsflyer.internal.components.network.http.exceptions.HttpException;
            import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.net.SocketTimeoutException;
            import java.nio.charset.Charset;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 72 */    public final class AFf1qSDK extends AFe1mSDK<AFf1pSDK> {
                public AFi1wSDK areAllFieldsValid;
                private final AFc1oSDK component1;
                public final AFf1mSDK component2;
                public AFf1pSDK component3;
                private final AFf1nSDK component4;
                private final AFd1nSDK copy;
                private final AFf1jSDK copydefault;
                private final String equals;
                private final AFf1hSDK hashCode;
                private final AFf1eSDK toString;

                public AFf1qSDK(AFf1nSDK aFf1nSDK, AFc1oSDK aFc1oSDK, AFf1eSDK aFf1eSDK, AFf1hSDK aFf1hSDK, AFd1nSDK aFd1nSDK, AFf1jSDK aFf1jSDK, String str, AFf1mSDK aFf1mSDK) {
/* 8 */             super(AFe1pSDK.RC_CDN, new AFe1pSDK[0], "UpdateRemoteConfiguration");
/* 12 */            this.component3 = null;
/* 14 */            this.component4 = aFf1nSDK;
/* 16 */            this.component1 = aFc1oSDK;
/* 18 */            this.toString = aFf1eSDK;
/* 20 */            this.hashCode = aFf1hSDK;
/* 22 */            this.copy = aFd1nSDK;
/* 24 */            this.copydefault = aFf1jSDK;
/* 26 */            this.equals = str;
/* 28 */            this.component2 = aFf1mSDK;
                }

                /* JADX WARN: Code duplicated, block: B:13:0x0051  */
                /* JADX WARN: Code duplicated, block: B:17:0x0065 A[Catch: all -> 0x0135, IOException -> 0x0138, TryCatch #6 {IOException -> 0x0138, all -> 0x0135, blocks: (B:15:0x005d, B:17:0x0065, B:19:0x008c, B:21:0x00a6, B:24:0x00b3, B:26:0x00bf, B:32:0x012f, B:46:0x0150, B:48:0x0162, B:50:0x0168, B:52:0x0188), top: B:70:0x005d }] */
                /* JADX WARN: Code duplicated, block: B:19:0x008c A[Catch: all -> 0x0135, IOException -> 0x0138, TryCatch #6 {IOException -> 0x0138, all -> 0x0135, blocks: (B:15:0x005d, B:17:0x0065, B:19:0x008c, B:21:0x00a6, B:24:0x00b3, B:26:0x00bf, B:32:0x012f, B:46:0x0150, B:48:0x0162, B:50:0x0168, B:52:0x0188), top: B:70:0x005d }] */
                /* JADX WARN: Code duplicated, block: B:50:0x0168 A[Catch: all -> 0x0135, IOException -> 0x0138, TryCatch #6 {IOException -> 0x0138, all -> 0x0135, blocks: (B:15:0x005d, B:17:0x0065, B:19:0x008c, B:21:0x00a6, B:24:0x00b3, B:26:0x00bf, B:32:0x012f, B:46:0x0150, B:48:0x0162, B:50:0x0168, B:52:0x0188), top: B:70:0x005d }] */
                /* JADX WARN: Code duplicated, block: B:52:0x0188 A[Catch: all -> 0x0135, IOException -> 0x0138, TRY_LEAVE, TryCatch #6 {IOException -> 0x0138, all -> 0x0135, blocks: (B:15:0x005d, B:17:0x0065, B:19:0x008c, B:21:0x00a6, B:24:0x00b3, B:26:0x00bf, B:32:0x012f, B:46:0x0150, B:48:0x0162, B:50:0x0168, B:52:0x0188), top: B:70:0x005d }] */
                /* JADX WARN: Code duplicated, block: B:70:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                private AFf1pSDK component3() throws InterruptedException, InterruptedIOException {
                    String monetizationNetwork;
                    AFLogger aFLogger;
                    AFg1cSDK aFg1cSDK;
                    AFe1wSDK<AFi1vSDK> currencyIso4217Code;
                    String mediationNetwork;
/* 5 */             long jCurrentTimeMillis = System.currentTimeMillis();
/* 9 */             String str = this.equals;
/* 13 */            String mediationNetwork2 = this.toString.getMediationNetwork();
/* 19 */            if (mediationNetwork2 == null || mediationNetwork2.trim().length() == 0) {
/* 76 */                AFLogger.INSTANCE.m1817w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
                    } else {
/* 32 */                if (str == null) {
/* 40 */                    AFLogger.INSTANCE.m1817w(AFg1cSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
                        } else {
/* 67 */                    monetizationNetwork = AFj1dSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str, this.component1.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()}), mediationNetwork2);
                        }
/* 80 */                if (monetizationNetwork == null) {
/* 88 */                    AFLogger.INSTANCE.m1816v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
/* 91 */                    return AFf1pSDK.FAILURE;
                        }
                        try {
/* 100 */                   if (this.copydefault.AFAdRevenueData()) {
/* 399 */                       AFLogger.INSTANCE.m1810d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
/* 402 */                       return AFf1pSDK.USE_CACHED;
                            }
/* 102 */                   aFLogger = AFLogger.INSTANCE;
/* 104 */                   aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
/* 108 */                   aFLogger.m1815i(aFg1cSDK, "Cached config is expired, updating...");
/* 131 */                   currencyIso4217Code = this.copy.getRevenue(this.copydefault.getMonetizationNetwork(), this.copydefault.getMediationNetwork(), monetizationNetwork, 1500).getCurrencyIso4217Code();
/* 139 */                   if (currencyIso4217Code.isSuccessful()) {
/* 366 */                       getCurrencyIso4217Code(monetizationNetwork, jCurrentTimeMillis, null, null, currencyIso4217Code);
/* 373 */                       StringBuilder sb = new StringBuilder("failed to fetch remote config from CDN with status code: ");
/* 380 */                       sb.append(currencyIso4217Code.getStatusCode());
/* 387 */                       aFLogger.m1817w(aFg1cSDK, sb.toString());
/* 390 */                       return AFf1pSDK.FAILURE;
                            }
/* 141 */                   AFi1vSDK body = currencyIso4217Code.getBody();
/* 149 */                   String revenue = currencyIso4217Code.getRevenue("x-amz-meta-af-auth-v1");
/* 155 */                   String revenue2 = currencyIso4217Code.getRevenue("CF-Cache-Status");
/* 161 */                   mediationNetwork = this.toString.getMediationNetwork();
/* 165 */                   if (mediationNetwork != null || mediationNetwork.trim().length() == 0) {
/* 355 */                       aFLogger.m1817w(aFg1cSDK, "Dev key is not set, SDK is not started.");
/* 358 */                       return AFf1pSDK.FAILURE;
                            }
/* 182 */                   AFi1sSDK revenue3 = this.component4.getRevenue(body, revenue, monetizationNetwork, mediationNetwork);
/* 190 */                   if (!revenue3.getCurrencyIso4217Code()) {
/* 344 */                       getCurrencyIso4217Code(monetizationNetwork, jCurrentTimeMillis, revenue3.getRevenue, revenue2, currencyIso4217Code);
/* 349 */                       aFLogger.m1817w(aFg1cSDK, "fetched config is not valid (MITM?) refuse to use it.");
/* 352 */                       return AFf1pSDK.FAILURE;
                            }
/* 194 */                   long currencyIso4217Code2 = this.copydefault.getCurrencyIso4217Code();
/* 202 */                   StringBuilder sb2 = new StringBuilder("using max-age fallback: ");
/* 205 */                   sb2.append(currencyIso4217Code2);
/* 208 */                   sb2.append(" seconds");
/* 215 */                   aFLogger.m1816v(aFg1cSDK, sb2.toString());
/* 219 */                   long jCurrentTimeMillis2 = System.currentTimeMillis();
/* 223 */                   AFf1hSDK aFf1hSDK = this.hashCode;
/* 227 */                   String str2 = monetizationNetwork;
                            try {
                                try {
/* 248 */                           aFf1hSDK.AFAdRevenueData.getRevenue("af_remote_config", Base64.encodeToString(body.getMediationNetwork.getBytes(Charset.defaultCharset()), 2));
/* 253 */                           aFf1hSDK.getMediationNetwork = aFf1hSDK.getCurrencyIso4217Code;
/* 259 */                           aFf1hSDK.AFAdRevenueData.AFAdRevenueData("af_rc_timestamp", jCurrentTimeMillis2);
/* 266 */                           aFf1hSDK.AFAdRevenueData.AFAdRevenueData("af_rc_max_age", currencyIso4217Code2);
/* 269 */                           aFf1hSDK.getCurrencyIso4217Code = body;
/* 271 */                           aFf1hSDK.getRevenue = jCurrentTimeMillis2;
/* 273 */                           aFf1hSDK.getMonetizationNetwork = currencyIso4217Code2;
/* 279 */                           StringBuilder sb3 = new StringBuilder("Config successfully updated, timeToLive: ");
/* 282 */                           sb3.append(currencyIso4217Code2);
/* 285 */                           sb3.append(" seconds");
/* 292 */                           aFLogger.m1810d(aFg1cSDK, sb3.toString());
/* 304 */                           getCurrencyIso4217Code(str2, jCurrentTimeMillis, revenue3.getRevenue, revenue2, currencyIso4217Code);
/* 307 */                           return AFf1pSDK.SUCCESS;
                                } catch (IOException e) {
/* 323 */                           e = e;
/* 324 */                           monetizationNetwork = str2;
/* 326 */                           jCurrentTimeMillis = jCurrentTimeMillis;
/* 314 */                           IOException iOException = e;
/* 462 */                           AFLogger aFLogger2 = AFLogger.INSTANCE;
/* 464 */                           AFg1cSDK aFg1cSDK2 = AFg1cSDK.REMOTE_CONTROL;
/* 470 */                           StringBuilder sb4 = new StringBuilder("failed to fetch remote config: ");
/* 477 */                           sb4.append(iOException.getMessage());
/* 487 */                           aFLogger2.m1814e(aFg1cSDK2, sb4.toString(), iOException, true, false, false);
/* 510 */                           getMonetizationNetwork(monetizationNetwork, jCurrentTimeMillis, iOException instanceof ParsingException ? ((ParsingException) iOException).getRawResponse() : null, null, null, null, iOException);
/* 520 */                           if (iOException.getCause() instanceof InterruptedIOException) {
/* 531 */                               throw ((InterruptedIOException) iOException.getCause());
                                    }
/* 522 */                           return AFf1pSDK.FAILURE;
                                } catch (Throwable th) {
/* 317 */                           th = th;
/* 318 */                           monetizationNetwork = str2;
/* 320 */                           jCurrentTimeMillis = jCurrentTimeMillis;
/* 311 */                           Throwable th2 = th;
/* 405 */                           AFLogger aFLogger3 = AFLogger.INSTANCE;
/* 407 */                           AFg1cSDK aFg1cSDK3 = AFg1cSDK.REMOTE_CONTROL;
/* 413 */                           StringBuilder sb5 = new StringBuilder("failed to update remote config: ");
/* 420 */                           sb5.append(th2.getMessage());
/* 430 */                           aFLogger3.m1814e(aFg1cSDK3, sb5.toString(), th2, true, false, false);
/* 440 */                           getMonetizationNetwork(monetizationNetwork, jCurrentTimeMillis, null, null, null, null, th2);
/* 450 */                           if (th2.getCause() instanceof InterruptedException) {
/* 461 */                               throw ((InterruptedException) th2.getCause());
                                    }
/* 452 */                           return AFf1pSDK.FAILURE;
                                }
                            } catch (IOException e2) {
/* 333 */                       e = e2;
/* 334 */                       monetizationNetwork = str2;
                            } catch (Throwable th3) {
/* 329 */                       th = th3;
/* 330 */                       monetizationNetwork = str2;
                            }
                        } catch (IOException e3) {
/* 313 */                   e = e3;
                        } catch (Throwable th4) {
/* 310 */                   th = th4;
                        }
                    }
/* 43 */            monetizationNetwork = null;
/* 80 */            if (monetizationNetwork == null) {
/* 88 */                AFLogger.INSTANCE.m1816v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
/* 91 */                return AFf1pSDK.FAILURE;
                    }
/* 100 */           if (this.copydefault.AFAdRevenueData()) {
/* 399 */               AFLogger.INSTANCE.m1810d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
/* 402 */               return AFf1pSDK.USE_CACHED;
                    }
/* 102 */           aFLogger = AFLogger.INSTANCE;
/* 104 */           aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
/* 108 */           aFLogger.m1815i(aFg1cSDK, "Cached config is expired, updating...");
/* 131 */           currencyIso4217Code = this.copy.getRevenue(this.copydefault.getMonetizationNetwork(), this.copydefault.getMediationNetwork(), monetizationNetwork, 1500).getCurrencyIso4217Code();
/* 139 */           if (currencyIso4217Code.isSuccessful()) {
/* 366 */               getCurrencyIso4217Code(monetizationNetwork, jCurrentTimeMillis, null, null, currencyIso4217Code);
/* 373 */               StringBuilder sb6 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
/* 380 */               sb6.append(currencyIso4217Code.getStatusCode());
/* 387 */               aFLogger.m1817w(aFg1cSDK, sb6.toString());
/* 390 */               return AFf1pSDK.FAILURE;
                    }
/* 141 */           AFi1vSDK body2 = currencyIso4217Code.getBody();
/* 149 */           String revenue4 = currencyIso4217Code.getRevenue("x-amz-meta-af-auth-v1");
/* 155 */           String revenue5 = currencyIso4217Code.getRevenue("CF-Cache-Status");
/* 161 */           mediationNetwork = this.toString.getMediationNetwork();
/* 165 */           if (mediationNetwork != null) {
                    }
/* 355 */           aFLogger.m1817w(aFg1cSDK, "Dev key is not set, SDK is not started.");
/* 358 */           return AFf1pSDK.FAILURE;
                }

                private void getCurrencyIso4217Code(String str, long j, AFi1ySDK aFi1ySDK, String str2, AFe1wSDK<AFi1vSDK> aFe1wSDK) {
/* 26 */            getMonetizationNetwork(str, j, aFe1wSDK, aFe1wSDK != null ? aFe1wSDK.getBody() : null, aFi1ySDK, str2 != null ? str2 : null, null);
                }

                private void getMonetizationNetwork(String str, long j, AFe1wSDK<?> aFe1wSDK, AFi1vSDK aFi1vSDK, AFi1ySDK aFi1ySDK, String str2, Throwable th) {
                    long j2;
                    int statusCode;
                    Throwable th2;
/* 7 */             if (aFe1wSDK != null) {
/* 11 */                j2 = aFe1wSDK.getMonetizationNetwork.getMediationNetwork;
/* 13 */                statusCode = aFe1wSDK.getStatusCode();
                    } else {
/* 19 */                j2 = 0;
/* 21 */                statusCode = 0;
                    }
/* 17 */            int i = statusCode;
/* 25 */            if (th instanceof HttpException) {
/* 27 */                Throwable cause = th.getCause();
/* 37 */                j2 = ((HttpException) th).getMetrics().getMediationNetwork;
/* 39 */                th2 = cause;
                    } else {
/* 42 */                th2 = th;
                    }
/* 71 */            this.areAllFieldsValid = new AFi1wSDK(aFi1vSDK != null ? aFi1vSDK.AFAdRevenueData : null, str, j2, System.currentTimeMillis() - j, i, aFi1ySDK, str2, th2);
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final long AFAdRevenueData() {
/* 1 */             return 1500L;
                }

                @Override // com.appsflyer.internal.AFe1mSDK
                public final AFe1uSDK getRevenue() throws Exception {
                    try {
/* 1 */                 AFf1pSDK aFf1pSDKComponent3 = component3();
/* 5 */                 this.component3 = aFf1pSDKComponent3;
                        return aFf1pSDKComponent3 == AFf1pSDK.FAILURE ? AFe1uSDK.FAILURE : AFe1uSDK.SUCCESS;
                    } catch (InterruptedIOException e) {
/* 17 */                e = e;
/* 31 */                AFLogger.INSTANCE.m1814e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
/* 36 */                this.component3 = AFf1pSDK.FAILURE;
/* 38 */                return AFe1uSDK.TIMEOUT;
                    } catch (InterruptedException e2) {
/* 20 */                e = e2;
/* 31 */                AFLogger.INSTANCE.m1814e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
/* 36 */                this.component3 = AFf1pSDK.FAILURE;
/* 38 */                return AFe1uSDK.TIMEOUT;
                    } catch (SocketTimeoutException unused) {
/* 43 */                this.component3 = AFf1pSDK.FAILURE;
/* 45 */                return AFe1uSDK.TIMEOUT;
                    }
                }

                @Override // com.appsflyer.internal.AFe1mSDK
/* 73 */        public final boolean getMonetizationNetwork() {
/* 74 */            return false;
                }
            }
