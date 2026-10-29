            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import com.appsflyer.internal.components.network.http.exceptions.HttpException;
            import java.io.BufferedOutputStream;
            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.nio.charset.Charset;
            import java.util.HashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFd1gSDK {
                private final int getRevenue;

                public AFd1gSDK(int i) {
/* 4 */             this.getRevenue = i;
                }

                /* JADX WARN: Code duplicated, block: B:33:0x006c  */
                /* JADX WARN: Code duplicated, block: B:35:0x0071  */
                /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
                private static String getMediationNetwork(HttpURLConnection httpURLConnection) throws Throwable {
                    Throwable th;
                    BufferedReader bufferedReader;
                    InputStream errorStream;
/* 3 */             InputStreamReader inputStreamReader = null;
                    try {
                        try {
/* 4 */                     errorStream = httpURLConnection.getInputStream();
                        } catch (Exception e) {
/* 16 */                    errorStream = httpURLConnection.getErrorStream();
/* 41 */                    AFLogger.INSTANCE.mo1748e(AFg1cSDK.HTTP_CLIENT, e.getMessage() != null ? e.getMessage() : HttpUrl.FRAGMENT_ENCODE_SET, e, false, false, false, false);
                        }
/* 44 */                if (errorStream == null) {
/* 1 */                     return HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 49 */                StringBuilder sb = new StringBuilder();
/* 58 */                InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
                        try {
/* 63 */                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
/* 66 */                    boolean z = true;
                            while (true) {
                                try {
/* 67 */                            String line = bufferedReader2.readLine();
/* 71 */                            if (line == null) {
/* 92 */                                String string = sb.toString();
/* 96 */                                inputStreamReader2.close();
/* 99 */                                bufferedReader2.close();
/* 102 */                               return string;
                                    }
/* 73 */                            if (!z) {
/* 77 */                                sb.append('\n');
                                    }
/* 87 */                            sb.append(line);
/* 90 */                            z = false;
                                } catch (Throwable th2) {
/* 83 */                            bufferedReader = bufferedReader2;
/* 84 */                            th = th2;
/* 85 */                            inputStreamReader = inputStreamReader2;
/* 107 */                           if (inputStreamReader != null) {
/* 109 */                               inputStreamReader.close();
                                    }
/* 112 */                           if (bufferedReader != null) {
/* 117 */                               throw th;
                                    }
/* 114 */                           bufferedReader.close();
/* 117 */                           throw th;
                                }
                            }
                        } catch (Throwable th3) {
/* 104 */                   th = th3;
/* 105 */                   bufferedReader = null;
                        }
                    } catch (Throwable th4) {
/* 10 */                th = th4;
/* 11 */                bufferedReader = null;
                    }
/* 107 */           if (inputStreamReader != null) {
/* 109 */               inputStreamReader.close();
                    }
/* 112 */           if (bufferedReader != null) {
/* 117 */               throw th;
                    }
/* 114 */           bufferedReader.close();
/* 117 */           throw th;
                }

                public final AFe1wSDK<String> getCurrencyIso4217Code(AFd1bSDK aFd1bSDK) throws IOException {
                    Throwable th;
/* 11 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 15 */            HttpURLConnection httpURLConnection = null;
/* 15 */            BufferedOutputStream bufferedOutputStream = null;
                    try {
/* 16 */                byte[] revenue = aFd1bSDK.getRevenue();
/* 24 */                StringBuilder sb = new StringBuilder();
/* 29 */                sb.append(aFd1bSDK.getMonetizationNetwork);
/* 34 */                sb.append(":");
/* 39 */                sb.append(aFd1bSDK.getMediationNetwork);
/* 46 */                StringBuilder sb2 = new StringBuilder(sb.toString());
/* 49 */                byte[] revenue2 = aFd1bSDK.getRevenue();
/* 57 */                if (aFd1bSDK.getMonetizationNetwork() && revenue2 != null) {
/* 80 */                    String str = aFd1bSDK.getMediationNetwork() ? "<encrypted>" : new String(revenue2, Charset.defaultCharset());
/* 86 */                    sb2.append("\n payload: ");
/* 89 */                    sb2.append(str);
                        }
/* 106 */               for (Map.Entry<String, String> entry : aFd1bSDK.AFAdRevenueData.entrySet()) {
/* 116 */                   sb2.append("\n ");
/* 125 */                   sb2.append(entry.getKey());
/* 130 */                   sb2.append(": ");
/* 139 */                   sb2.append(entry.getValue());
                        }
/* 145 */               StringBuilder sb3 = new StringBuilder("[");
/* 152 */               sb3.append(aFd1bSDK.hashCode());
/* 155 */               sb3.append("] ");
/* 158 */               sb3.append((Object) sb2);
/* 169 */               AFLogger.INSTANCE.m1810d(AFg1cSDK.HTTP_CLIENT, sb3.toString());
/* 183 */               HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFd1bSDK.getMediationNetwork).openConnection();
                        try {
/* 187 */                   httpURLConnection2.setRequestMethod(aFd1bSDK.getMonetizationNetwork);
/* 195 */                   if (aFd1bSDK.getCurrencyIso4217Code()) {
/* 197 */                       httpURLConnection2.setUseCaches(false);
                            }
/* 210 */                   if (!aFd1bSDK.component1()) {
/* 212 */                       httpURLConnection2.setInstanceFollowRedirects(false);
                            }
/* 217 */                   int i = this.getRevenue;
/* 219 */                   int i2 = aFd1bSDK.component4;
/* 222 */                   if (i2 != -1) {
/* 224 */                       i = i2;
                            }
/* 225 */                   httpURLConnection2.setConnectTimeout(i);
/* 228 */                   httpURLConnection2.setReadTimeout(i);
/* 244 */                   httpURLConnection2.addRequestProperty("Content-Type", aFd1bSDK.getMediationNetwork() ? "application/octet-stream" : "application/json");
/* 261 */                   for (Map.Entry<String, String> entry2 : aFd1bSDK.AFAdRevenueData.entrySet()) {
/* 281 */                       httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                            }
/* 286 */                   if (revenue != null) {
/* 288 */                       httpURLConnection2.setDoOutput(true);
/* 295 */                       StringBuilder sb4 = new StringBuilder();
/* 299 */                       sb4.append(revenue.length);
/* 306 */                       httpURLConnection2.setRequestProperty("Content-Length", sb4.toString());
                                try {
/* 315 */                           BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                                    try {
/* 318 */                               bufferedOutputStream2.write(revenue);
/* 321 */                               bufferedOutputStream2.close();
                                    } catch (Throwable th2) {
/* 325 */                               th = th2;
/* 326 */                               bufferedOutputStream = bufferedOutputStream2;
/* 329 */                               if (bufferedOutputStream != null) {
/* 331 */                                   bufferedOutputStream.close();
                                        }
/* 334 */                               throw th;
                                    }
                                } catch (Throwable th3) {
/* 328 */                           th = th3;
                                }
                            }
/* 347 */                   boolean z = httpURLConnection2.getResponseCode() / 100 == 2;
/* 349 */                   boolean zAFAdRevenueData = aFd1bSDK.AFAdRevenueData();
/* 353 */                   String mediationNetwork = HttpUrl.FRAGMENT_ENCODE_SET;
/* 355 */                   if (zAFAdRevenueData) {
/* 357 */                       mediationNetwork = getMediationNetwork(httpURLConnection2);
                            }
/* 361 */                   String str2 = mediationNetwork;
/* 369 */                   AFd1aSDK aFd1aSDK = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
/* 376 */                   StringBuilder sb5 = new StringBuilder("response code:");
/* 383 */                   sb5.append(httpURLConnection2.getResponseCode());
/* 388 */                   sb5.append(" ");
/* 395 */                   sb5.append(httpURLConnection2.getResponseMessage());
/* 400 */                   sb5.append("\n body:");
/* 403 */                   sb5.append(str2);
/* 406 */                   sb5.append("\n took ");
/* 411 */                   sb5.append(aFd1aSDK.getMediationNetwork);
/* 414 */                   sb5.append("ms");
/* 417 */                   String string = sb5.toString();
/* 421 */                   AFLogger aFLogger = AFLogger.INSTANCE;
/* 423 */                   AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
/* 427 */                   StringBuilder sb6 = new StringBuilder("[");
/* 434 */                   sb6.append(aFd1bSDK.hashCode());
/* 437 */                   sb6.append("] ");
/* 440 */                   sb6.append(string);
/* 447 */                   aFLogger.m1810d(aFg1cSDK, sb6.toString());
/* 456 */                   HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
/* 459 */                   map.remove(null);
/* 472 */                   AFe1wSDK<String> aFe1wSDK = new AFe1wSDK<>(str2, httpURLConnection2.getResponseCode(), z, map, aFd1aSDK);
/* 475 */                   httpURLConnection2.disconnect();
/* 478 */                   return aFe1wSDK;
                        } catch (Throwable th4) {
/* 202 */                   th = th4;
/* 203 */                   httpURLConnection = httpURLConnection2;
                            try {
/* 486 */                       AFd1aSDK aFd1aSDK2 = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
/* 493 */                       StringBuilder sb7 = new StringBuilder("error: ");
/* 496 */                       sb7.append(th);
/* 499 */                       sb7.append("\n took ");
/* 504 */                       sb7.append(aFd1aSDK2.getMediationNetwork);
/* 507 */                       sb7.append("ms");
/* 510 */                       String string2 = sb7.toString();
/* 514 */                       AFLogger aFLogger2 = AFLogger.INSTANCE;
/* 516 */                       AFg1cSDK aFg1cSDK2 = AFg1cSDK.HTTP_CLIENT;
/* 520 */                       StringBuilder sb8 = new StringBuilder("[");
/* 527 */                       sb8.append(aFd1bSDK.hashCode());
/* 530 */                       sb8.append("] ");
/* 533 */                       sb8.append(string2);
/* 543 */                       aFLogger2.m1814e(aFg1cSDK2, sb8.toString(), th, false, false, false);
/* 551 */                       throw new HttpException(th, aFd1aSDK2);
                            } catch (Throwable th5) {
/* 553 */                       if (httpURLConnection != null) {
/* 555 */                           httpURLConnection.disconnect();
                                }
/* 558 */                       throw th5;
                            }
                        }
                    } catch (Throwable th6) {
/* 71 */                th = th6;
                    }
                }
            }
