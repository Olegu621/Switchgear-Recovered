            package io.sentry;

            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.cache.C1398c;
            import io.sentry.cache.InterfaceC1399d;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.C1702a;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.nio.charset.Charset;
            import java.util.Date;
            
            /* JADX INFO: renamed from: io.sentry.m3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC1551m3 implements Runnable {

                /* JADX INFO: renamed from: b */
                public static final Charset f11136b = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f11137a;

                public RunnableC1551m3(SentryAndroidOptions sentryAndroidOptions) {
/* 4 */             this.f11137a = sentryAndroidOptions;
                }

                /* JADX INFO: renamed from: a */
                public final Date m5355a(File file) {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f11137a;
                    try {
/* 17 */                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f11136b));
                        try {
/* 20 */                    String line = bufferedReader.readLine();
/* 36 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Crash marker file has %s timestamp.", line);
/* 39 */                    Date dateM5174l = AbstractC1417a.m5174l(line);
/* 43 */                    bufferedReader.close();
/* 46 */                    return dateM5174l;
                        } catch (Throwable th) {
                            try {
/* 52 */                        bufferedReader.close();
                            } catch (Throwable th2) {
/* 57 */                        th.addSuppressed(th2);
                            }
/* 60 */                    throw th;
                        }
                    } catch (IOException e) {
/* 84 */                sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error reading the crash marker file.", e);
/* 87 */                return null;
                    } catch (IllegalArgumentException e2) {
/* 72 */                sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
/* 87 */                return null;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f11137a;
/* 3 */             String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
/* 8 */             if (cacheDirPath == null) {
/* 20 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
/* 23 */                return;
                    }
/* 24 */            InterfaceC1399d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
/* 30 */            if ((envelopeDiskCache instanceof C1398c) && !((C1398c) envelopeDiskCache).m5122f()) {
/* 50 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
/* 53 */                return;
                    }
/* 54 */            Charset charset = C1398c.f10798w;
/* 60 */            File file = new File(cacheDirPath, "previous_session.json");
/* 63 */            InterfaceC1487i1 serializer = sentryAndroidOptions.getSerializer();
/* 71 */            if (file.exists()) {
/* 83 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                        try {
/* 100 */                   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f11136b));
                            try {
/* 109 */                       C1764z6 c1764z6 = (C1764z6) serializer.mo5064b(bufferedReader, C1764z6.class);
/* 111 */                       if (c1764z6 == null) {
/* 129 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                                } else {
/* 145 */                           File file2 = new File(sentryAndroidOptions.getCacheDirPath(), ".sentry-native/last_crash");
/* 148 */                           EnumC1756y6 enumC1756y6 = c1764z6.f11867i;
/* 150 */                           EnumC1756y6 enumC1756y7 = EnumC1756y6.Crashed;
/* 153 */                           if (enumC1756y6 == enumC1756y7) {
/* 155 */                               C1664s4 c1664s4 = C1664s4.f11649c;
/* 157 */                               C1702a c1702a = c1664s4.f11651b;
/* 159 */                               c1702a.m5443c();
                                        try {
/* 162 */                                   c1664s4.f11650a = false;
/* 164 */                                   c1702a.close();
/* 167 */                                   c1664s4.m5403a();
                                        } catch (Throwable th) {
                                            try {
/* 172 */                                       c1702a.close();
                                            } catch (Throwable th2) {
/* 177 */                                       th.addSuppressed(th2);
                                            }
/* 180 */                                   throw th;
                                        }
                                    } else if (file2.exists()) {
/* 197 */                               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
/* 200 */                               Date dateM5355a = m5355a(file2);
/* 205 */                               c1764z6.m5528c(enumC1756y7, null, true, null);
/* 208 */                               c1764z6.m5527b(dateM5355a);
                                    } else if (c1764z6.f11858Y == null) {
/* 221 */                               c1764z6.m5527b(new Date());
                                    }
/* 228 */                           if (file2.exists() && !file2.delete()) {
/* 252 */                               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                                    }
/* 277 */                           AbstractC1552m4.m5357b().mo5088h(new C1505c((C1626w) null, sentryAndroidOptions.getSdkVersion(), C1160a5.m4719d(serializer, c1764z6)), new C1486i0());
                                }
/* 280 */                       bufferedReader.close();
                            } catch (Throwable th3) {
                                try {
/* 286 */                           bufferedReader.close();
                                } catch (Throwable th4) {
/* 291 */                           th3.addSuppressed(th4);
                                }
/* 294 */                       throw th3;
                            }
                        } catch (Throwable th5) {
/* 303 */                   sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error processing previous session.", th5);
                        }
/* 310 */               if (file.delete()) {
/* 325 */                   return;
                        }
/* 322 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to delete the previous session file.", new Object[0]);
                    }
                }
            }
