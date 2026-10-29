            package io.sentry.transport;

            import io.sentry.C1521j6;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1560n;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1716o;
            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.io.OutputStream;
            import java.net.Authenticator;
            import java.net.HttpURLConnection;
            import java.net.InetSocketAddress;
            import java.net.Proxy;
            import java.net.URL;
            import java.nio.charset.Charset;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.zip.GZIPOutputStream;
            import javax.net.ssl.HttpsURLConnection;
            import javax.net.ssl.SSLSocketFactory;
            import okhttp3.HttpUrl;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.transport.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1679e {

                /* JADX INFO: renamed from: e */
                public static final Charset f11693e = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: a */
                public final Proxy f11694a;

                /* JADX INFO: renamed from: b */
                public final C1505c f11695b;

                /* JADX INFO: renamed from: c */
                public final SentryAndroidOptions f11696c;

                /* JADX INFO: renamed from: d */
                public final C1690p f11697d;

                public C1679e(SentryAndroidOptions sentryAndroidOptions, C1505c c1505c, C1690p c1690p) {
                    Proxy proxy;
/* 4 */             this.f11695b = c1505c;
/* 6 */             this.f11696c = sentryAndroidOptions;
/* 8 */             this.f11697d = c1690p;
/* 10 */            C1521j6 proxy2 = sentryAndroidOptions.getProxy();
/* 14 */            if (proxy2 != null) {
/* 16 */                String str = proxy2.f11069b;
                        try {
/* 33 */                    proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy2.f11068a, Integer.parseInt(str)));
                        } catch (NumberFormatException e) {
/* 57 */                    this.f11696c.getLogger().mo4670b(EnumC1553m5.ERROR, e, fm0.m3784j("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
/* 60 */                    proxy = null;
                        }
                    } else {
/* 60 */                proxy = null;
                    }
/* 61 */            this.f11694a = proxy;
/* 63 */            if (proxy == null || sentryAndroidOptions.getProxy() == null) {
/* 95 */                return;
                    }
/* 75 */            String str2 = sentryAndroidOptions.getProxy().f11070c;
/* 81 */            String str3 = sentryAndroidOptions.getProxy().f11071d;
/* 83 */            if (str2 == null || str3 == null) {
/* 95 */                return;
                    }
/* 92 */            Authenticator.setDefault(new C1686l(str2, str3));
                }

                /* JADX INFO: renamed from: a */
                public static void m5422a(HttpURLConnection httpURLConnection) {
                    try {
/* 5 */                 httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    } finally {
/* 13 */                httpURLConnection.disconnect();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX INFO: renamed from: b */
                public static String m5423b(HttpURLConnection httpURLConnection) {
                    try {
/* 1 */                 InputStream errorStream = httpURLConnection.getErrorStream();
                        try {
/* 14 */                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f11693e));
                            try {
/* 19 */                        StringBuilder sb = new StringBuilder();
/* 22 */                        boolean z = true;
                                while (true) {
/* 23 */                            String line = bufferedReader.readLine();
/* 27 */                            if (line == null) {
                                        break;
                                    }
/* 29 */                            if (!z) {
/* 33 */                                sb.append("\n");
                                    }
/* 39 */                            sb.append(line);
/* 42 */                            z = false;
/* 68 */                            if (errorStream != null) {
                                        try {
/* 70 */                                    errorStream.close();
                                        } catch (Throwable th) {
/* 75 */                                    th.addSuppressed(th);
                                        }
                                    }
/* 78 */                            throw th;
                                }
/* 44 */                        String string = sb.toString();
/* 48 */                        bufferedReader.close();
/* 51 */                        if (errorStream != null) {
/* 53 */                            errorStream.close();
                                }
/* 56 */                        return string;
                            } catch (Throwable th2) {
                                try {
/* 59 */                            bufferedReader.close();
                                } catch (Throwable th3) {
/* 64 */                            th2.addSuppressed(th3);
                                }
/* 67 */                        throw th2;
                            }
                        } catch (Throwable th4) {
/* 68 */                    if (errorStream != null) {
/* 70 */                        errorStream.close();
                            }
/* 78 */                    throw th4;
                        }
                    } catch (IOException unused) {
/* 79 */                return "Failed to obtain error message while analyzing send failure.";
                    }
                }

                /* JADX INFO: renamed from: c */
                public final AbstractC1417a m5424c(HttpURLConnection httpURLConnection) {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f11696c;
                    try {
/* 4 */                 int responseCode = httpURLConnection.getResponseCode();
/* 8 */                 m5426e(httpURLConnection, responseCode);
/* 13 */                if (responseCode == 200) {
/* 25 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Envelope sent successfully.", new Object[0]);
/* 28 */                    return C1693s.f11716a;
                        }
/* 40 */                if (responseCode == 413) {
/* 52 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Envelope was discarded by the server because it was too large. Consider reducing the size of events, breadcrumbs, or attachments. You can use the `SentryOptions.onOversizedEvent` callback to customize how oversized events are handled.", new Object[0]);
                        } else {
/* 72 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Request failed, API returned %s", Integer.valueOf(responseCode));
                        }
/* 79 */                if (sentryAndroidOptions.isDebug()) {
/* 97 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "%s", m5423b(httpURLConnection));
                        }
/* 102 */               return new C1692r(responseCode);
                    } catch (IOException e) {
/* 119 */               sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, e, "Error reading and logging the response stream", new Object[0]);
/* 128 */               return new C1692r(-1);
                    } finally {
/* 132 */               m5422a(httpURLConnection);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final AbstractC1417a m5425d(C1505c c1505c) {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f11696c;
/* 7 */             sentryAndroidOptions.getSocketTagger().mo4944e();
/* 10 */            C1505c c1505c2 = this.f11695b;
/* 14 */            URL url = (URL) c1505c2.f11042b;
/* 16 */            Proxy proxy = this.f11694a;
/* 29 */            HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
/* 47 */            for (Map.Entry entry : ((HashMap) c1505c2.f11043c).entrySet()) {
/* 67 */                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
/* 73 */            httpURLConnection.setRequestMethod("POST");
/* 77 */            httpURLConnection.setDoOutput(true);
/* 84 */            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
/* 91 */            httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
/* 98 */            httpURLConnection.setRequestProperty("Accept", "application/json");
/* 105 */           httpURLConnection.setRequestProperty("Connection", "close");
/* 112 */           httpURLConnection.setConnectTimeout(sentryAndroidOptions.getConnectionTimeoutMillis());
/* 119 */           httpURLConnection.setReadTimeout(sentryAndroidOptions.getReadTimeoutMillis());
/* 122 */           SSLSocketFactory sslSocketFactory = sentryAndroidOptions.getSslSocketFactory();
/* 128 */           if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
/* 135 */               ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
                    }
/* 138 */           httpURLConnection.connect();
                    try {
/* 141 */               OutputStream outputStream = httpURLConnection.getOutputStream();
                        try {
/* 147 */                   GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                            try {
/* 154 */                       sentryAndroidOptions.getSerializer().mo5067e(c1505c, gZIPOutputStream);
/* 157 */                       gZIPOutputStream.close();
/* 160 */                       if (outputStream != null) {
/* 162 */                           outputStream.close();
                                }
                            } catch (Throwable th) {
                                try {
/* 183 */                           gZIPOutputStream.close();
                                } catch (Throwable th2) {
/* 188 */                           th.addSuppressed(th2);
                                }
/* 191 */                       throw th;
                            }
                        } catch (Throwable th3) {
/* 192 */                   if (outputStream != null) {
                                try {
/* 194 */                           outputStream.close();
                                } catch (Throwable th4) {
/* 199 */                           th3.addSuppressed(th4);
                                }
                            }
/* 202 */                   throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
/* 214 */                   sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, th5, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
                        } finally {
/* 219 */                   m5424c(httpURLConnection);
/* 226 */                   sentryAndroidOptions.getSocketTagger().mo4941a();
                        }
                    }
/* 168 */           return m5424c(httpURLConnection);
                }

                /* JADX INFO: renamed from: e */
                public final void m5426e(HttpURLConnection httpURLConnection, int i) {
                    long j;
                    double d;
                    long j2;
                    String string;
/* 5 */             String headerField = httpURLConnection.getHeaderField("Retry-After");
/* 11 */            String headerField2 = httpURLConnection.getHeaderField("X-Sentry-Rate-Limits");
/* 17 */            C1690p c1690p = this.f11697d;
/* 19 */            SentryAndroidOptions sentryAndroidOptions = c1690p.f11709b;
/* 21 */            C1678d c1678d = c1690p.f11708a;
/* 23 */            double d2 = 1000.0d;
/* 28 */            if (headerField2 == null) {
/* 245 */               if (i == 429) {
/* 247 */                   if (headerField != null) {
                                try {
/* 255 */                           j = (long) (Double.parseDouble(headerField) * 1000.0d);
                                } catch (NumberFormatException unused) {
/* 257 */                           j = 60000;
                                }
                            } else {
/* 257 */                       j = 60000;
                            }
/* 262 */                   c1678d.getClass();
/* 275 */                   c1690p.m5427c(EnumC1560n.All, new Date(System.currentTimeMillis() + j));
/* 278 */                   return;
                        }
/* 278 */               return;
                    }
/* 32 */            int i2 = -1;
/* 33 */            String[] strArrSplit = headerField2.split(",", -1);
/* 37 */            int length = strArrSplit.length;
/* 38 */            int i3 = 0;
/* 39 */            int i4 = 0;
/* 40 */            while (i4 < length) {
/* 54 */                String[] strArrSplit2 = strArrSplit[i4].replace(" ", HttpUrl.FRAGMENT_ENCODE_SET).split(":", i2);
/* 59 */                if (strArrSplit2.length > 0) {
/* 61 */                    String str = strArrSplit2[i3];
/* 63 */                    if (str != null) {
                                try {
/* 70 */                            j2 = (long) (Double.parseDouble(str) * d2);
                                } catch (NumberFormatException unused2) {
/* 72 */                            j2 = 60000;
                                }
                            } else {
/* 72 */                        j2 = 60000;
                            }
/* 76 */                    d = d2;
/* 79 */                    if (strArrSplit2.length > 1) {
/* 81 */                        String str2 = strArrSplit2[1];
/* 85 */                        c1678d.getClass();
/* 93 */                        Date date = new Date(j2 + System.currentTimeMillis());
/* 96 */                        if (str2 == null || str2.isEmpty()) {
/* 225 */                           c1690p.m5427c(EnumC1560n.All, date);
                                } else {
/* 106 */                           String[] strArrSplit3 = str2.split(";", i2);
/* 110 */                           int length2 = strArrSplit3.length;
/* 111 */                           int i5 = i3;
/* 112 */                           while (i5 < length2) {
/* 114 */                               String str3 = strArrSplit3[i5];
/* 116 */                               EnumC1560n enumC1560nValueOf = EnumC1560n.Unknown;
                                        try {
/* 118 */                                   Charset charset = AbstractC1716o.f11743a;
/* 120 */                                   if (str3 == null || str3.isEmpty()) {
/* 162 */                                       string = str3;
                                            } else {
/* 131 */                                       String[] strArrSplit4 = AbstractC1716o.f11744b.split(str3, i2);
/* 137 */                                       StringBuilder sb = new StringBuilder();
/* 140 */                                       int length3 = strArrSplit4.length;
/* 142 */                                       for (int i6 = i3; i6 < length3; i6++) {
/* 150 */                                           sb.append(AbstractC1716o.m5484b(strArrSplit4[i6]));
                                                }
/* 157 */                                       string = sb.toString();
                                            }
/* 163 */                                   if (string != null) {
/* 165 */                                       enumC1560nValueOf = EnumC1560n.valueOf(string);
                                            } else {
/* 184 */                                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Couldn't capitalize: %s", str3);
                                            }
                                        } catch (IllegalArgumentException e) {
/* 202 */                                   sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.INFO, e, "Unknown category: %s", str3);
                                        }
/* 187 */                               EnumC1560n enumC1560n = enumC1560nValueOf;
/* 212 */                               if (!EnumC1560n.Unknown.equals(enumC1560n)) {
/* 215 */                                   c1690p.m5427c(enumC1560n, date);
                                        }
/* 218 */                               i5++;
/* 220 */                               i2 = -1;
/* 221 */                               i3 = 0;
                                    }
                                }
                            }
                        } else {
/* 229 */                   d = d2;
                        }
/* 231 */               i4++;
/* 233 */               d2 = d;
/* 235 */               i2 = -1;
/* 236 */               i3 = 0;
                    }
                }
            }
