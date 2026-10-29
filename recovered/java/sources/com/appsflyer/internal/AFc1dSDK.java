            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import java.io.BufferedOutputStream;
            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.io.OutputStream;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.net.URLConnection;
            import java.util.ArrayList;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.text.Charsets;
            import okhttp3.HttpUrl;
            import okio.Segment;
            import p000.C1982nz;
            import p000.C2066pd;
            import p000.jb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\f\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\f\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001a\u0010\u0013\u001a\u00020\u000b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001d"}, m6176d2 = {"Lcom/appsflyer/internal/AFc1dSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p1", HttpUrl.FRAGMENT_ENCODE_SET, "p2", "<init>", "([BLjava/util/Map;I)V", HttpUrl.FRAGMENT_ENCODE_SET, "AFAdRevenueData", "()Z", "Ljava/net/HttpURLConnection;", "getMonetizationNetwork", "(Ljava/net/HttpURLConnection;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "getRevenue", "(Ljava/net/HttpURLConnection;J)Z", "[B", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFd1jSDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFd1jSDK;", "Ljava/util/Map;", "Z", "I", "()Ljava/lang/String;", "areAllFieldsValid"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 372 */   public abstract class AFc1dSDK {
                public int AFAdRevenueData;

                /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
                private final boolean getRevenue;
                public Map<String, String> getMonetizationNetwork;

                /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
                public byte[] getCurrencyIso4217Code;

                public AFc1dSDK(byte[] bArr, Map<String, String> map, int i) {
/* 1 */             bArr.getClass();
/* 7 */             this.getCurrencyIso4217Code = bArr;
/* 9 */             this.getMonetizationNetwork = map;
/* 11 */            this.AFAdRevenueData = i;
/* 14 */            this.getRevenue = true;
                }

                private static String getMonetizationNetwork(HttpURLConnection p0) throws IOException {
                    InputStream errorStream;
                    try {
/* 3 */                 errorStream = p0.getInputStream();
                    } catch (Throwable th) {
/* 10 */                AFLogger aFLogger = AFLogger.INSTANCE;
/* 12 */                AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
/* 14 */                String message = th.getMessage();
/* 30 */                AFh1ySDK.e$default(aFLogger, aFg1cSDK, message == null ? HttpUrl.FRAGMENT_ENCODE_SET : message, th, false, false, false, false, 96, null);
/* 33 */                errorStream = p0.getErrorStream();
                    }
/* 37 */            if (errorStream == null) {
/* 1 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 50 */            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), Segment.SIZE);
/* 55 */            ArrayList arrayList = new ArrayList();
                    try {
/* 77 */                for (String str : new C1982nz(new C2066pd(bufferedReader, 2))) {
/* 85 */                    str.getClass();
/* 88 */                    arrayList.add(str);
                        }
/* 96 */                bufferedReader.close();
/* 105 */               String strM6203x = CollectionsKt.m6203x(arrayList, null, null, null, null, 63);
/* 109 */               bufferedReader.close();
/* 119 */               return strM6203x;
                    } catch (Throwable th2) {
                        try {
/* 113 */                   throw th2;
                        } catch (Throwable th3) {
/* 115 */                   jb1.m5754n(bufferedReader, th2);
/* 118 */                   throw th3;
                        }
                    }
                }

                private final boolean getRevenue(HttpURLConnection httpURLConnection, long j) throws IOException {
/* 3 */             httpURLConnection.setRequestMethod("POST");
/* 36 */            StringBuilder sb = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
/* 41 */            sb.append("\n length: ");
/* 57 */            sb.append(new String(this.getCurrencyIso4217Code, Charsets.UTF_8).length());
/* 60 */            Map<String, String> map = this.getMonetizationNetwork;
/* 62 */            if (map != null) {
/* 76 */                for (Map.Entry<String, String> entry : map.entrySet()) {
/* 86 */                    sb.append("\n ");
/* 95 */                    sb.append(entry.getKey());
/* 100 */                   sb.append(": ");
/* 109 */                   sb.append(entry.getValue());
                        }
                    }
/* 139 */           String strAFAdRevenueData = AFAdRevenueData("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb));
/* 147 */           if (getGetRevenue()) {
/* 149 */               AFLogger.afRDLog(strAFAdRevenueData);
                    } else {
/* 153 */               AFLogger.afVerboseLog(strAFAdRevenueData);
                    }
/* 157 */           httpURLConnection.setInstanceFollowRedirects(false);
/* 160 */           httpURLConnection.setUseCaches(false);
/* 165 */           httpURLConnection.setReadTimeout(this.AFAdRevenueData);
/* 170 */           httpURLConnection.setConnectTimeout(this.AFAdRevenueData);
/* 181 */           httpURLConnection.addRequestProperty("Content-Type", getGetCurrencyIso4217Code().getCurrencyIso4217Code);
/* 184 */           Map<String, String> map2 = this.getMonetizationNetwork;
/* 186 */           if (map2 != null) {
/* 200 */               for (Map.Entry<String, String> entry2 : map2.entrySet()) {
/* 220 */                   httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
                        }
                    }
/* 225 */           httpURLConnection.setDoOutput(true);
/* 237 */           httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getCurrencyIso4217Code.length));
/* 240 */           OutputStream outputStream = httpURLConnection.getOutputStream();
/* 244 */           outputStream.getClass();
/* 258 */           BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, Segment.SIZE);
/* 264 */           bufferedOutputStream.write(this.getCurrencyIso4217Code);
/* 267 */           bufferedOutputStream.close();
/* 270 */           String monetizationNetwork = getMonetizationNetwork(httpURLConnection);
/* 278 */           long jCurrentTimeMillis = System.currentTimeMillis() - j;
/* 326 */           String str = "response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + monetizationNetwork + "\n\ttook " + jCurrentTimeMillis + "ms";
/* 352 */           String strAFAdRevenueData2 = AFAdRevenueData("HTTP: [" + httpURLConnection.hashCode() + "] " + str);
/* 360 */           if (getGetRevenue()) {
/* 362 */               AFLogger.afRDLog(strAFAdRevenueData2);
                    } else {
/* 366 */               AFLogger.afVerboseLog(strAFAdRevenueData2);
                    }
/* 369 */           return AFd1qSDK.getCurrencyIso4217Code(httpURLConnection);
                }

                public abstract String AFAdRevenueData(String str);

                public final boolean AFAdRevenueData() {
                    HttpURLConnection httpURLConnection;
                    Throwable th;
/* 5 */             long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
/* 10 */                String currencyIso4217Code = getCurrencyIso4217Code();
/* 14 */                currencyIso4217Code.getClass();
/* 22 */                URLConnection uRLConnectionOpenConnection = new URL(currencyIso4217Code).openConnection();
/* 26 */                uRLConnectionOpenConnection.getClass();
/* 29 */                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        try {
/* 31 */                    boolean revenue = getRevenue(httpURLConnection, jCurrentTimeMillis);
/* 35 */                    httpURLConnection.disconnect();
/* 38 */                    return revenue;
                        } catch (Throwable th2) {
/* 39 */                    th = th2;
                            try {
/* 78 */                        String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage();
/* 113 */                       String strAFAdRevenueData = AFAdRevenueData("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + str);
/* 121 */                       if (getGetRevenue()) {
/* 123 */                           AFLogger.afRDLog(strAFAdRevenueData);
                                } else {
/* 127 */                           AFLogger.afVerboseLog(strAFAdRevenueData);
                                }
/* 82 */                        return false;
                            } finally {
/* 136 */                       if (httpURLConnection != null) {
/* 138 */                           httpURLConnection.disconnect();
                                }
                            }
                        }
                    } catch (Throwable th3) {
/* 43 */                httpURLConnection = null;
/* 44 */                th = th3;
                    }
                }

                public abstract String getCurrencyIso4217Code();

                /* JADX INFO: renamed from: getMediationNetwork */
                public abstract AFd1jSDK getGetCurrencyIso4217Code();

                /* JADX INFO: renamed from: getRevenue, reason: from getter */
/* 373 */       public boolean getGetRevenue() {
/* 374 */           return this.getRevenue;
                }
            }
