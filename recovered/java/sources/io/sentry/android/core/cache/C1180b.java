            package io.sentry.android.core.cache;

            import android.os.SystemClock;
            import io.sentry.C1486i0;
            import io.sentry.C1540l7;
            import io.sentry.C1554m6;
            import io.sentry.C1697u2;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.android.core.C1285x1;
            import io.sentry.android.core.C1288z;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.core.internal.util.C1217d;
            import io.sentry.android.core.performance.C1259g;
            import io.sentry.android.core.performance.C1260h;
            import io.sentry.cache.C1398c;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.util.Arrays;
            import java.util.List;
            import p000.C2080pr;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.android.core.cache.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1180b extends C1398c {

                /* JADX INFO: renamed from: V */
                public static final List f9982V = Arrays.asList(new C1179a(C1288z.class, "ANR", "last_anr_report", new C1697u2(18)), new C1179a(C1285x1.class, "Tombstone", "last_tombstone_report", new C1697u2(19)));

                /* JADX INFO: renamed from: U */
                public final C1217d f9983U;

                /* JADX WARN: Illegal instructions before constructor call */
                public C1180b(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
/* 7 */             AbstractC1704c.m5462q(cacheDirPath, "cacheDirPath must not be null");
/* 14 */            super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
/* 19 */            this.f9983U = C1217d.f10156a;
                }

                /* JADX INFO: renamed from: h */
                public static Long m4774h(C1554m6 c1554m6, String str, String str2) {
/* 1 */             String cacheDirPath = c1554m6.getCacheDirPath();
/* 24 */            AbstractC1704c.m5462q(cacheDirPath, "Cache dir path should be set for getting " + str2 + "s reported");
/* 29 */            File file = new File(cacheDirPath, str);
                    try {
/* 32 */                String strM5461p = AbstractC1704c.m5461p(file);
/* 36 */                if (strM5461p != null && !strM5461p.equals("null")) {
/* 55 */                    return Long.valueOf(Long.parseLong(strM5461p.trim()));
                        }
/* 108 */               return null;
                    } catch (Throwable th) {
/* 63 */                if (th instanceof FileNotFoundException) {
/* 87 */                    c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, fm0.m3784j("Last ", str2, " marker does not exist. %s."), file.getAbsolutePath());
/* 108 */                   return null;
                        }
/* 105 */               c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, fm0.m3784j("Error reading last ", str2, " marker"), th);
/* 108 */               return null;
                    }
                }

                @Override // io.sentry.cache.C1398c, io.sentry.cache.InterfaceC1399d
                /* JADX INFO: renamed from: K */
                public final boolean mo4775K(C1505c c1505c, C1486i0 c1486i0) {
                    Long lValueOf;
/* 1 */             boolean zMo4775K = super.mo4775K(c1505c, c1486i0);
/* 9 */             C1260h c1260h = C1259g.m4907c().f10271e;
/* 19 */            boolean zIsInstance = C1540l7.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"));
/* 24 */            SentryAndroidOptions sentryAndroidOptions = this.f10799a;
/* 26 */            if (zIsInstance && c1260h.m4918d()) {
/* 36 */                this.f9983U.getClass();
/* 45 */                long jUptimeMillis = SystemClock.uptimeMillis() - c1260h.f10283c;
/* 52 */                if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
/* 54 */                    ILogger logger = sentryAndroidOptions.getLogger();
/* 58 */                    EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 70 */                    logger.mo4672k(enumC1553m5, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
/* 73 */                    String outboxPath = sentryAndroidOptions.getOutboxPath();
/* 77 */                    if (outboxPath == null) {
/* 87 */                        sentryAndroidOptions.getLogger().mo4672k(enumC1553m5, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                            } else {
                                try {
/* 98 */                            new File(outboxPath, "startup_crash").createNewFile();
                                } catch (Throwable th) {
/* 111 */                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error writing the startup crash marker file to the disk", th);
                                }
                            }
                        }
                    }
/* 124 */           for (C1179a c1179a : f9982V) {
/* 132 */               Class cls = c1179a.f9978a;
/* 138 */               C2080pr c2080pr = new C2080pr(9, c1179a, sentryAndroidOptions, this);
/* 141 */               Object objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 153 */               if (cls.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) && objM5273b != null) {
/* 159 */                   C1179a c1179a2 = (C1179a) c2080pr.f15255b;
/* 163 */                   SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) c2080pr.f15256c;
/* 167 */                   C1180b c1180b = (C1180b) c2080pr.f15257d;
                            switch (c1179a2.f9981d.f11719a) {
                                case 18:
/* 189 */                           lValueOf = Long.valueOf(((C1288z) objM5273b).f10393d);
                                    break;
                                default:
/* 180 */                           lValueOf = Long.valueOf(((C1285x1) objM5273b).f10387d);
                                    break;
                            }
/* 193 */                   ILogger logger2 = sentryAndroidOptions2.getLogger();
/* 197 */                   EnumC1553m5 enumC1553m6 = EnumC1553m5.DEBUG;
/* 199 */                   String str = c1179a2.f9979b;
/* 207 */                   logger2.mo4672k(enumC1553m6, "Writing last reported %s marker with timestamp %d", str, lValueOf);
/* 210 */                   String str2 = c1179a2.f9980c;
/* 212 */                   SentryAndroidOptions sentryAndroidOptions3 = c1180b.f10799a;
/* 214 */                   String cacheDirPath = sentryAndroidOptions3.getCacheDirPath();
/* 218 */                   if (cacheDirPath == null) {
/* 234 */                       sentryAndroidOptions3.getLogger().mo4672k(enumC1553m6, fm0.m3784j("Cache dir path is null, the ", str, " marker will not be written"), new Object[0]);
                            } else {
                                try {
/* 245 */                           FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str2));
                                    try {
/* 258 */                               fileOutputStream.write(String.valueOf(lValueOf).getBytes(C1398c.f10798w));
/* 261 */                               fileOutputStream.flush();
/* 264 */                               fileOutputStream.close();
                                    } catch (Throwable th2) {
                                        try {
/* 272 */                                   fileOutputStream.close();
                                        } catch (Throwable th3) {
/* 277 */                                   th2.addSuppressed(th3);
                                        }
/* 280 */                               throw th2;
                                    }
                                } catch (Throwable th4) {
/* 295 */                           sentryAndroidOptions3.getLogger().mo4671d(EnumC1553m5.ERROR, fm0.m3784j("Error writing the ", str, " marker to the disk"), th4);
                                }
                            }
                        }
                    }
/* 300 */           return zMo4775K;
                }
            }
