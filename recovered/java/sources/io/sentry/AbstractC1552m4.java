            package io.sentry;

            import io.sentry.android.core.C1184e;
            import io.sentry.android.core.C1274u;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.backpressure.C1386c;
            import io.sentry.backpressure.RunnableC1384a;
            import io.sentry.cache.C1398c;
            import io.sentry.cache.InterfaceC1399d;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.config.C1418b;
            import io.sentry.config.C1419c;
            import io.sentry.config.C1421e;
            import io.sentry.internal.debugmeta.C1504b;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.internal.modules.C1510c;
            import io.sentry.internal.modules.C1512e;
            import io.sentry.internal.modules.C1513f;
            import io.sentry.internal.modules.InterfaceC1508a;
            import io.sentry.profiling.InterfaceC1587a;
            import io.sentry.profiling.InterfaceC1588b;
            import io.sentry.transport.C1683i;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1712k;
            import io.sentry.util.AbstractC1715n;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1709h;
            import io.sentry.util.thread.C1719b;
            import io.sentry.util.thread.C1720c;
            import java.io.BufferedInputStream;
            import java.io.File;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.reflect.InvocationTargetException;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Properties;
            import java.util.Queue;
            import java.util.ServiceLoader;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.RejectedExecutionException;
            import p000.C1822k8;
            import p000.C1951n4;
            import p000.C2076pn;
            import p000.f72;
            import p000.u93;
            
            /* JADX INFO: renamed from: io.sentry.m4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1552m4 {

                /* JADX INFO: renamed from: a */
                public static volatile InterfaceC1424d1 f11138a = C1752y2.f11836a;

                /* JADX INFO: renamed from: b */
                public static volatile InterfaceC1389c1 f11139b = C1736w2.f11797b;

                /* JADX INFO: renamed from: c */
                public static final C1380b4 f11140c = new C1380b4(C1554m6.empty());

                /* JADX INFO: renamed from: d */
                public static volatile boolean f11141d = false;

                /* JADX INFO: renamed from: e */
                public static final Charset f11142e = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: f */
                public static final long f11143f = System.currentTimeMillis();

                /* JADX INFO: renamed from: g */
                public static final C1702a f11144g = new C1702a();

                /* JADX INFO: renamed from: a */
                public static void m5356a() {
/* 1 */             C1702a c1702a = f11144g;
/* 3 */             c1702a.m5443c();
                    try {
/* 6 */                 InterfaceC1389c1 interfaceC1389c1M5357b = m5357b();
/* 12 */                f11139b = C1736w2.f11797b;
/* 16 */                f11138a.close();
/* 20 */                interfaceC1389c1M5357b.mo5081a(false);
/* 23 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 28 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 33 */                    th.addSuppressed(th2);
                        }
/* 36 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static InterfaceC1389c1 m5357b() {
/* 3 */             if (f11141d) {
/* 5 */                 return f11139b;
                    }
/* 10 */            InterfaceC1389c1 interfaceC1389c1 = f11138a.get();
/* 14 */            if (interfaceC1389c1 != null && !interfaceC1389c1.mo5099s()) {
/* 23 */                return interfaceC1389c1;
                    }
/* 28 */            InterfaceC1389c1 interfaceC1389c1Mo5106z = f11139b.mo5106z("getCurrentScopes");
/* 34 */            f11138a.mo5190a(interfaceC1389c1Mo5106z);
/* 37 */            return interfaceC1389c1Mo5106z;
                }

                /* JADX INFO: renamed from: c */
                public static void m5358c(C1274u c1274u, C1184e c1184e) {
/* 5 */             SentryAndroidOptions sentryAndroidOptions = new SentryAndroidOptions();
                    try {
/* 8 */                 c1184e.mo3668d(sentryAndroidOptions);
                    } catch (Throwable th) {
/* 21 */                sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
                    }
/* 26 */            C1702a c1702a = f11144g;
/* 28 */            c1702a.m5443c();
                    try {
/* 41 */                if (!SentryAndroidOptions.class.getName().equals("io.sentry.android.core.SentryAndroidOptions") && AbstractC1712k.f11736a) {
/* 61 */                    throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(SentryAndroidOptions.class.getName()));
                        }
/* 69 */                if (m5362g(sentryAndroidOptions)) {
/* 76 */                    Boolean boolIsGlobalHubMode = sentryAndroidOptions.isGlobalHubMode();
/* 80 */                    int i = 1;
/* 88 */                    boolean zBooleanValue = boolIsGlobalHubMode != null ? boolIsGlobalHubMode.booleanValue() : true;
/* 105 */                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "GlobalHubMode: '%s'", String.valueOf(zBooleanValue));
/* 108 */                   f11141d = zBooleanValue;
/* 116 */                   if (sentryAndroidOptions.getFatalLogger() instanceof C1641r2) {
/* 123 */                       sentryAndroidOptions.setFatalLogger(new C1535l2());
                            }
/* 126 */                   C1380b4 c1380b4 = f11140c;
/* 138 */                   int i2 = 0;
/* 139 */                   if (AbstractC1704c.m5464s(c1380b4.f10728l, sentryAndroidOptions, m5361f())) {
/* 145 */                       if (m5361f()) {
/* 157 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                                }
/* 160 */                       sentryAndroidOptions.activate();
/* 167 */                       m5357b().mo5081a(true);
/* 170 */                       c1380b4.f10728l = sentryAndroidOptions;
/* 172 */                       Queue queue = c1380b4.f10723g;
/* 182 */                       c1380b4.f10723g = C1380b4.m5068a(sentryAndroidOptions.getMaxBreadcrumbs());
/* 184 */                       Iterator it = queue.iterator();
/* 192 */                       while (it.hasNext()) {
/* 201 */                           c1380b4.mo4693f((C1443f) it.next(), null);
                                }
/* 220 */                       f11139b = new C1460g4(new C1380b4(sentryAndroidOptions), new C1380b4(sentryAndroidOptions), c1380b4);
/* 226 */                       if (sentryAndroidOptions.isDebug() && (sentryAndroidOptions.getLogger() instanceof C1641r2)) {
/* 241 */                           sentryAndroidOptions.setLogger(new C1535l2());
                                }
/* 244 */                       m5360e(sentryAndroidOptions);
/* 251 */                       f11138a.mo5190a(f11139b);
/* 254 */                       m5359d(sentryAndroidOptions);
/* 262 */                       c1380b4.f10737u = new u93(sentryAndroidOptions);
/* 272 */                       if (sentryAndroidOptions.getExecutorService().isClosed()) {
/* 279 */                           sentryAndroidOptions.setExecutorService(new C1461g5(sentryAndroidOptions));
                                }
                                try {
/* 291 */                           sentryAndroidOptions.getExecutorService().submit(new RunnableC1528k4(sentryAndroidOptions, i2));
                                } catch (RejectedExecutionException e) {
/* 304 */                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e);
                                }
                                try {
/* 316 */                           sentryAndroidOptions.getExecutorService().submit(new RunnableC1526k2(sentryAndroidOptions, i2));
                                } catch (Throwable th2) {
/* 329 */                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.DEBUG, "Failed to move previous session.", th2);
                                }
/* 344 */                       for (InterfaceC1661s1 interfaceC1661s1 : sentryAndroidOptions.getIntegrations()) {
                                    try {
/* 352 */                               interfaceC1661s1.mo4674l(sentryAndroidOptions);
                                    } catch (Throwable th3) {
/* 388 */                               sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to register the integration " + interfaceC1661s1.getClass().getName(), th3);
                                    }
                                }
                                try {
/* 402 */                           sentryAndroidOptions.getExecutorService().submit(new RunnableC1528k4(sentryAndroidOptions, 2));
                                } catch (Throwable th4) {
/* 415 */                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.DEBUG, "Failed to notify options observers.", th4);
                                }
                                try {
/* 427 */                           sentryAndroidOptions.getExecutorService().submit(new RunnableC1551m3(sentryAndroidOptions));
                                } catch (Throwable th5) {
/* 440 */                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.DEBUG, "Failed to finalize previous session.", th5);
                                }
                                try {
/* 452 */                           sentryAndroidOptions.getExecutorService().submit(new RunnableC1528k4(sentryAndroidOptions, i));
                                } catch (Throwable th6) {
/* 465 */                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th6);
                                }
/* 468 */                       ILogger logger = sentryAndroidOptions.getLogger();
/* 472 */                       EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 484 */                       logger.mo4672k(enumC1553m5, "Using openTelemetryMode %s", sentryAndroidOptions.getOpenTelemetryMode());
/* 509 */                       sentryAndroidOptions.getLogger().mo4672k(enumC1553m5, "Using span factory %s", sentryAndroidOptions.getSpanFactory().getClass().getName());
/* 532 */                       sentryAndroidOptions.getLogger().mo4672k(enumC1553m5, "Using scopes storage %s", f11138a.getClass().getName());
                            } else {
/* 547 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                            }
                        }
/* 71 */                c1702a.close();
                    } catch (Throwable th7) {
                        try {
/* 553 */                   c1702a.close();
                        } catch (Throwable th8) {
/* 558 */                   th7.addSuppressed(th8);
                        }
/* 561 */               throw th7;
                    }
                }

                /* JADX INFO: renamed from: d */
                public static void m5359d(SentryAndroidOptions sentryAndroidOptions) {
                    InterfaceC1399d c1398c;
/* 1 */             ILogger logger = sentryAndroidOptions.getLogger();
/* 5 */             EnumC1553m5 enumC1553m5 = EnumC1553m5.INFO;
/* 17 */            logger.mo4672k(enumC1553m5, "Initializing SDK with DSN: '%s'", sentryAndroidOptions.getDsn());
/* 20 */            String outboxPath = sentryAndroidOptions.getOutboxPath();
/* 25 */            if (outboxPath != null) {
/* 32 */                new File(outboxPath).mkdirs();
                    } else {
/* 40 */                logger.mo4672k(enumC1553m5, "No outbox dir path is defined in options.", new Object[0]);
                    }
/* 43 */            String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
/* 47 */            if (cacheDirPath != null) {
/* 54 */                new File(cacheDirPath).mkdirs();
/* 63 */                if (sentryAndroidOptions.getEnvelopeDiskCache() instanceof C1683i) {
/* 65 */                    Charset charset = C1398c.f10798w;
/* 67 */                    String cacheDirPath2 = sentryAndroidOptions.getCacheDirPath();
/* 71 */                    int maxCacheItems = sentryAndroidOptions.getMaxCacheItems();
/* 75 */                    if (cacheDirPath2 == null) {
/* 87 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
/* 90 */                        c1398c = C1683i.f11698a;
                            } else {
/* 95 */                        c1398c = new C1398c(sentryAndroidOptions, cacheDirPath2, maxCacheItems);
                            }
/* 99 */                    sentryAndroidOptions.setEnvelopeDiskCache(c1398c);
                        }
                    }
/* 102 */           String profilingTracesDirPath = sentryAndroidOptions.getProfilingTracesDirPath();
/* 110 */           if ((sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
/* 122 */               File file = new File(profilingTracesDirPath);
/* 125 */               file.mkdirs();
                        try {
/* 139 */                   sentryAndroidOptions.getExecutorService().submit(new f72(file, 15));
                        } catch (RejectedExecutionException e) {
/* 152 */                   sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e);
                        }
                    }
/* 155 */           InterfaceC1508a modulesLoader = sentryAndroidOptions.getModulesLoader();
/* 163 */           if (!sentryAndroidOptions.isSendModules()) {
/* 167 */               sentryAndroidOptions.setModulesLoader(C1512e.f11057a);
                    } else if (modulesLoader instanceof C1512e) {
/* 214 */               sentryAndroidOptions.setModulesLoader(new C1513f(Arrays.asList(new C1510c(sentryAndroidOptions.getLogger()), new C1513f(sentryAndroidOptions.getLogger())), sentryAndroidOptions.getLogger()));
                    }
/* 223 */           if (sentryAndroidOptions.getDebugMetaLoader() instanceof C1504b) {
/* 234 */               sentryAndroidOptions.setDebugMetaLoader(new C1505c(sentryAndroidOptions.getLogger()));
                    }
/* 241 */           List<Properties> listMo5285f = sentryAndroidOptions.getDebugMetaLoader().mo5285f();
/* 245 */           if (listMo5285f != null) {
/* 258 */               if (sentryAndroidOptions.getBundleIds().isEmpty()) {
/* 260 */                   Iterator it = listMo5285f.iterator();
/* 268 */                   while (it.hasNext()) {
/* 278 */                       String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
/* 294 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Bundle IDs found: %s", property);
/* 297 */                       if (property != null) {
/* 305 */                           for (String str : property.split(",", -1)) {
/* 309 */                               sentryAndroidOptions.addBundleId(str);
                                    }
                                }
                            }
                        }
/* 319 */               if (sentryAndroidOptions.getProguardUuid() == null) {
/* 321 */                   Iterator it2 = listMo5285f.iterator();
/* 329 */                   while (it2.hasNext()) {
/* 339 */                       String property2 = ((Properties) it2.next()).getProperty("io.sentry.ProguardUuids");
/* 343 */                       if (property2 != null) {
/* 357 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Proguard UUID found: %s", property2);
/* 360 */                           sentryAndroidOptions.setProguardUuid(property2);
                                    break;
                                }
                            }
                        }
/* 371 */               for (Properties properties : listMo5285f) {
/* 381 */                   String property3 = properties.getProperty("io.sentry.build-tool");
/* 385 */                   if (property3 != null) {
/* 389 */                       String property4 = properties.getProperty("io.sentry.build-tool-version");
/* 393 */                       if (property4 == null) {
/* 395 */                           property4 = "unknown";
                                }
/* 409 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Build tool found: %s, version %s", property3, property4);
/* 416 */                       C1529k5.m5336d().m5338b(property3, property4);
                                break;
                            }
                        }
/* 427 */               for (Properties properties2 : listMo5285f) {
/* 437 */                   String property5 = properties2.getProperty("io.sentry.distribution.org-slug");
/* 443 */                   String property6 = properties2.getProperty("io.sentry.distribution.project-slug");
/* 449 */                   String property7 = properties2.getProperty("io.sentry.distribution.auth-token");
/* 455 */                   String property8 = properties2.getProperty("io.sentry.distribution.build-configuration");
/* 461 */                   String property9 = properties2.getProperty("io.sentry.distribution.install-groups-override");
/* 465 */                   if (property5 != null || property6 != null || property7 != null || property8 != null || property9 != null) {
/* 475 */                       C1429d6 distribution = sentryAndroidOptions.getDistribution();
/* 479 */                       if (property5 != null && !property5.isEmpty() && distribution.f10852b.isEmpty()) {
/* 507 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Distribution org slug found: %s", property5);
/* 510 */                           distribution.f10852b = property5;
                                }
/* 512 */                       if (property6 != null && !property6.isEmpty() && distribution.f10853c.isEmpty()) {
/* 540 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Distribution project slug found: %s", property6);
/* 543 */                           distribution.f10853c = property6;
                                }
/* 545 */                       if (property7 != null && !property7.isEmpty() && distribution.f10851a.isEmpty()) {
/* 571 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Distribution org auth token found", new Object[0]);
/* 574 */                           distribution.f10851a = property7;
                                }
/* 576 */                       if (property8 != null && !property8.isEmpty() && distribution.f10854d == null) {
/* 600 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Distribution build configuration found: %s", property8);
/* 603 */                           distribution.f10854d = property8;
                                }
/* 605 */                       if (property9 != null && !property9.isEmpty() && distribution.f10855e == null) {
/* 617 */                           String[] strArrSplit = property9.split(",", -1);
/* 623 */                           ArrayList arrayList = new ArrayList();
/* 628 */                           for (String str2 : strArrSplit) {
/* 632 */                               String strTrim = str2.trim();
/* 640 */                               if (!strTrim.isEmpty()) {
/* 642 */                                   arrayList.add(strTrim);
                                        }
                                    }
/* 652 */                           if (!arrayList.isEmpty()) {
/* 666 */                               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Distribution install groups override found: %s", arrayList);
/* 669 */                               distribution.f10855e = arrayList;
                                        break;
                                    }
                                    break;
                                }
                                break;
                                break;
                                break;
                            }
                        }
                    }
/* 677 */           if (sentryAndroidOptions.getThreadChecker() instanceof C1719b) {
/* 681 */               sentryAndroidOptions.setThreadChecker(C1720c.f11748b);
                    }
/* 692 */           if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
/* 699 */               sentryAndroidOptions.addPerformanceCollector(new C1669t1());
                    }
/* 706 */           if (sentryAndroidOptions.isEnableBackpressureHandling() && !AbstractC1712k.f11736a) {
/* 718 */               if (sentryAndroidOptions.getBackpressureMonitor() instanceof C1386c) {
/* 725 */                   sentryAndroidOptions.setBackpressureMonitor(new RunnableC1384a(sentryAndroidOptions));
                        }
/* 732 */               sentryAndroidOptions.getBackpressureMonitor().start();
                    }
/* 738 */           if (!AbstractC1712k.f11736a && sentryAndroidOptions.isContinuousProfilingEnabled() && (sentryAndroidOptions.getContinuousProfiler() instanceof C1572o2)) {
                        try {
/* 758 */                   if (sentryAndroidOptions.getProfilingTracesDirPath() == null) {
/* 771 */                       File file2 = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
/* 778 */                       if (file2.mkdirs() || file2.exists()) {
/* 801 */                           sentryAndroidOptions.setProfilingTracesDirPath(file2.getAbsolutePath());
                                } else {
/* 793 */                           C1951n4.m6865p(file2.getAbsolutePath(), "Creating a fallback directory for profiling failed in ");
                                }
                            }
/* 804 */                   ILogger logger2 = sentryAndroidOptions.getLogger();
/* 808 */                   sentryAndroidOptions.getProfilingTracesHz();
/* 811 */                   sentryAndroidOptions.getExecutorService();
                            try {
/* 820 */                       Iterator it3 = ServiceLoader.load(InterfaceC1587a.class).iterator();
/* 836 */                       if ((it3.hasNext() ? it3.next() : null) != null) {
/* 855 */                           throw new ClassCastException();
                                }
/* 844 */                       logger2.mo4672k(EnumC1553m5.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
/* 873 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
/* 889 */                       sentryAndroidOptions.getContinuousProfiler();
                            } catch (Throwable th) {
/* 860 */                       logger2.mo4671d(EnumC1553m5.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th);
                            }
                        } catch (Exception e2) {
/* 886 */                   sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to create default profiling traces directory", e2);
                        }
                    } else {
/* 893 */               sentryAndroidOptions.getContinuousProfiler();
                    }
/* 898 */           if (!AbstractC1712k.f11736a && sentryAndroidOptions.isContinuousProfilingEnabled() && (sentryAndroidOptions.getProfilerConverter() instanceof C1662s2)) {
/* 918 */               ILogger logger3 = f11140c.f10728l.getLogger();
                        try {
/* 928 */                   Iterator it4 = ServiceLoader.load(InterfaceC1588b.class).iterator();
/* 942 */                   if ((it4.hasNext() ? it4.next() : null) != null) {
/* 961 */                       throw new ClassCastException();
                            }
/* 950 */                   logger3.mo4672k(EnumC1553m5.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
/* 979 */                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
/* 982 */                   sentryAndroidOptions.getProfilerConverter();
                        } catch (Throwable th2) {
/* 966 */                   logger3.mo4671d(EnumC1553m5.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th2);
                        }
                    } else {
/* 986 */               sentryAndroidOptions.getProfilerConverter();
                    }
/* 1013 */          sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(sentryAndroidOptions.isContinuousProfilingEnabled()), sentryAndroidOptions.getProfileLifecycle());
                }

                /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
                /* JADX INFO: renamed from: e */
                public static void m5360e(SentryAndroidOptions sentryAndroidOptions) {
                    InterfaceC1424d1 c1659s;
                    Class clsM5475f;
                    List list;
/* 1 */             C1641r2 c1641r2 = C1641r2.f11545a;
/* 3 */             boolean z = AbstractC1712k.f11736a;
/* 5 */             if (!z) {
/* 18 */                if (EnumC1727v5.AUTO.equals(sentryAndroidOptions.getOpenTelemetryMode())) {
/* 27 */                    if (C1709h.m5474d("io.sentry.opentelemetry.agent.AgentMarker", c1641r2)) {
/* 39 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
/* 44 */                        sentryAndroidOptions.setOpenTelemetryMode(EnumC1727v5.AGENT);
                            } else if (C1709h.m5474d("io.sentry.opentelemetry.agent.AgentlessMarker", c1641r2)) {
/* 66 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
/* 71 */                        sentryAndroidOptions.setOpenTelemetryMode(EnumC1727v5.AGENTLESS);
                            } else if (C1709h.m5474d("io.sentry.opentelemetry.agent.AgentlessSpringMarker", c1641r2)) {
/* 93 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
/* 98 */                        sentryAndroidOptions.setOpenTelemetryMode(EnumC1727v5.AGENTLESS_SPRING);
                            }
                        }
                    }
/* 101 */           EnumC1727v5 enumC1727v5 = EnumC1727v5.OFF;
/* 107 */           int i = 1;
/* 108 */           if (enumC1727v5 == sentryAndroidOptions.getOpenTelemetryMode()) {
/* 115 */               sentryAndroidOptions.setSpanFactory(new C1435e3(i));
                    }
/* 120 */           f11138a.close();
/* 123 */           sentryAndroidOptions.getScopesStorageFactory();
/* 130 */           if (enumC1727v5 == sentryAndroidOptions.getOpenTelemetryMode()) {
/* 137 */               f11138a = new C1659s();
                    } else {
/* 140 */               if (z || !C1709h.m5474d("io.sentry.opentelemetry.OtelContextScopesStorage", c1641r2) || (clsM5475f = C1709h.m5475f(c1641r2, "io.sentry.opentelemetry.OtelContextScopesStorage", true)) == null) {
/* 174 */                   c1659s = new C1659s();
                        } else {
                            try {
/* 161 */                       Object objNewInstance = clsM5475f.getDeclaredConstructor(null).newInstance(null);
/* 167 */                       if (objNewInstance instanceof InterfaceC1424d1) {
/* 169 */                           c1659s = (InterfaceC1424d1) objNewInstance;
                                } else {
/* 174 */                           c1659s = new C1659s();
                                }
                            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                            }
                        }
/* 177 */               f11138a = c1659s;
                    }
/* 181 */           if (AbstractC1712k.f11736a) {
/* 357 */               return;
                    }
/* 183 */           EnumC1727v5 openTelemetryMode = sentryAndroidOptions.getOpenTelemetryMode();
/* 193 */           if (EnumC1727v5.OFF.equals(openTelemetryMode)) {
/* 195 */               list = Collections.EMPTY_LIST;
                    } else {
/* 199 */               ConcurrentHashMap concurrentHashMap = AbstractC1715n.f11742a;
/* 203 */               ArrayList arrayList = new ArrayList();
/* 206 */               EnumC1727v5 enumC1727v6 = EnumC1727v5.AGENT;
/* 208 */               if (enumC1727v6 == openTelemetryMode || EnumC1727v5.AGENTLESS_SPRING == openTelemetryMode) {
/* 216 */                   arrayList.add("auto.http.spring_jakarta.webmvc");
/* 221 */                   arrayList.add("auto.http.spring.webmvc");
/* 226 */                   arrayList.add("auto.http.spring7.webmvc");
/* 231 */                   arrayList.add("auto.spring_jakarta.webflux");
/* 236 */                   arrayList.add("auto.spring.webflux");
/* 241 */                   arrayList.add("auto.spring7.webflux");
/* 246 */                   arrayList.add("auto.db.jdbc");
/* 251 */                   arrayList.add("auto.http.spring_jakarta.webclient");
/* 256 */                   arrayList.add("auto.http.spring.webclient");
/* 261 */                   arrayList.add("auto.http.spring7.webclient");
/* 266 */                   arrayList.add("auto.http.spring_jakarta.restclient");
/* 271 */                   arrayList.add("auto.http.spring.restclient");
/* 276 */                   arrayList.add("auto.http.spring7.restclient");
/* 281 */                   arrayList.add("auto.http.spring_jakarta.resttemplate");
/* 286 */                   arrayList.add("auto.http.spring.resttemplate");
/* 291 */                   arrayList.add("auto.http.spring7.resttemplate");
/* 296 */                   arrayList.add("auto.http.openfeign");
/* 301 */                   arrayList.add("auto.http.ktor-client");
/* 306 */                   arrayList.add("auto.queue.spring_jakarta.kafka.producer");
/* 311 */                   arrayList.add("auto.queue.spring_jakarta.kafka.consumer");
/* 316 */                   arrayList.add("auto.queue.kafka.producer");
/* 321 */                   arrayList.add("auto.queue.kafka.consumer");
                        }
/* 324 */               if (enumC1727v6 == openTelemetryMode) {
/* 328 */                   arrayList.add("auto.graphql.graphql");
/* 333 */                   arrayList.add("auto.graphql.graphql22");
                        }
/* 336 */               list = arrayList;
                    }
/* 337 */           Iterator it = list.iterator();
/* 345 */           while (it.hasNext()) {
/* 353 */               sentryAndroidOptions.addIgnoredSpanOrigin((String) it.next());
                    }
                }

                /* JADX INFO: renamed from: f */
                public static boolean m5361f() {
/* 5 */             return m5357b().isEnabled();
                }

                /* JADX INFO: renamed from: g */
                public static boolean m5362g(SentryAndroidOptions sentryAndroidOptions) {
                    Properties properties;
                    Double dValueOf;
                    Double dValueOf2;
                    Double dValueOf3;
                    Properties propertiesM6009j;
                    Properties propertiesM6009j2;
/* 7 */             if (sentryAndroidOptions.isEnableExternalConfiguration()) {
/* 13 */                C1535l2 c1535l2 = new C1535l2();
/* 18 */                ArrayList arrayList = new ArrayList();
/* 32 */                arrayList.add(new C1421e("sentry.", System.getProperties()));
/* 40 */                arrayList.add(new C1419c());
/* 45 */                String property = System.getProperty("sentry.properties.file");
/* 49 */                if (property != null && (propertiesM6009j2 = new C1822k8(property, c1535l2, true).m6009j()) != null) {
/* 67 */                    arrayList.add(new C1421e(propertiesM6009j2));
                        }
/* 72 */                String str = System.getenv("SENTRY_PROPERTIES_FILE");
/* 76 */                if (str != null && (propertiesM6009j = new C1822k8(str, c1535l2, true).m6009j()) != null) {
/* 94 */                    arrayList.add(new C1421e(propertiesM6009j));
                        }
/* 107 */               Double dValueOf4 = null;
                        try {
/* 108 */                   InputStream resourceAsStream = AbstractC1704c.m5449d(AbstractC1417a.class.getClassLoader()).getResourceAsStream("sentry.properties");
/* 112 */                   if (resourceAsStream != null) {
                                try {
/* 116 */                           BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                                    try {
/* 121 */                               properties = new Properties();
/* 124 */                               properties.load(bufferedInputStream);
/* 127 */                               bufferedInputStream.close();
/* 130 */                               resourceAsStream.close();
                                    } catch (Throwable th) {
                                        try {
/* 139 */                                   bufferedInputStream.close();
                                        } catch (Throwable th2) {
/* 144 */                                   th.addSuppressed(th2);
                                        }
/* 147 */                               throw th;
                                    }
                                } catch (Throwable th3) {
                                    try {
/* 148 */                               resourceAsStream.close();
                                    } catch (Throwable th4) {
/* 153 */                               th3.addSuppressed(th4);
                                    }
/* 156 */                           throw th3;
                                }
                            } else {
/* 157 */                       if (resourceAsStream != null) {
/* 159 */                           resourceAsStream.close();
                                }
/* 162 */                       properties = null;
                            }
                        } catch (IOException e) {
/* 172 */                   c1535l2.mo4670b(EnumC1553m5.ERROR, e, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
                        }
/* 176 */               if (properties != null) {
/* 183 */                   arrayList.add(new C1421e(properties));
                        }
/* 191 */               Properties propertiesM6009j3 = new C1822k8("sentry.properties", c1535l2, false).m6009j();
/* 195 */               if (propertiesM6009j3 != null) {
/* 202 */                   arrayList.add(new C1421e(propertiesM6009j3));
                        }
/* 207 */               C1418b c1418b = new C1418b(arrayList);
/* 210 */               ILogger logger = sentryAndroidOptions.getLogger();
/* 216 */               C1432e0 c1432e0 = new C1432e0();
/* 225 */               c1432e0.f10883a = c1418b.getProperty("dsn");
/* 233 */               c1432e0.f10884b = c1418b.getProperty("environment");
/* 241 */               c1432e0.f10885c = c1418b.getProperty("release");
/* 249 */               c1432e0.f10886d = c1418b.getProperty("dist");
/* 257 */               c1432e0.f10887e = c1418b.getProperty("servername");
/* 265 */               c1432e0.f10888f = c1418b.m5187a("uncaught.handler.enabled");
/* 273 */               c1432e0.f10907y = c1418b.m5187a("uncaught.handler.print-stacktrace");
/* 277 */               String property2 = c1418b.getProperty("sample-rate");
/* 281 */               if (property2 != null) {
                            try {
/* 283 */                       dValueOf = Double.valueOf(property2);
                            } catch (NumberFormatException unused) {
/* 288 */                       dValueOf = null;
                            }
                        } else {
/* 288 */                   dValueOf = null;
                        }
/* 289 */               c1432e0.f10891i = dValueOf;
/* 293 */               String property3 = c1418b.getProperty("traces-sample-rate");
/* 297 */               if (property3 != null) {
                            try {
/* 299 */                       dValueOf2 = Double.valueOf(property3);
                            } catch (NumberFormatException unused2) {
/* 304 */                       dValueOf2 = null;
                            }
                        } else {
/* 304 */                   dValueOf2 = null;
                        }
/* 305 */               c1432e0.f10892j = dValueOf2;
/* 309 */               String property4 = c1418b.getProperty("profiles-sample-rate");
/* 313 */               if (property4 != null) {
                            try {
/* 315 */                       dValueOf3 = Double.valueOf(property4);
                            } catch (NumberFormatException unused3) {
/* 320 */                       dValueOf3 = null;
                            }
                        } else {
/* 320 */                   dValueOf3 = null;
                        }
/* 321 */               c1432e0.f10893k = dValueOf3;
/* 329 */               c1432e0.f10889g = c1418b.m5187a("debug");
/* 337 */               c1432e0.f10890h = c1418b.m5187a("enable-deduplication");
/* 345 */               c1432e0.f10908z = c1418b.m5187a("send-client-reports");
/* 353 */               c1432e0.f10875Q = c1418b.m5187a("force-init");
/* 357 */               String property5 = c1418b.getProperty("max-request-body-size");
/* 361 */               if (property5 != null) {
/* 373 */                   c1432e0.f10894l = EnumC1530k6.valueOf(property5.toUpperCase(Locale.ROOT));
                        }
/* 393 */               for (Map.Entry entry : ((ConcurrentHashMap) c1418b.mo5185c()).entrySet()) {
/* 415 */                   c1432e0.f10895m.put((String) entry.getKey(), (String) entry.getValue());
                        }
/* 421 */               String property6 = c1418b.getProperty("proxy.host");
/* 427 */               String property7 = c1418b.getProperty("proxy.user");
/* 433 */               String property8 = c1418b.getProperty("proxy.pass");
/* 439 */               String property9 = c1418b.getProperty("proxy.port");
/* 443 */               if (property9 == null) {
/* 446 */                   property9 = "80";
                        }
/* 448 */               if (property6 != null) {
/* 452 */                   C1521j6 c1521j6 = new C1521j6();
/* 455 */                   c1521j6.f11068a = property6;
/* 457 */                   c1521j6.f11069b = property9;
/* 459 */                   c1521j6.f11070c = property7;
/* 461 */                   c1521j6.f11071d = property8;
/* 463 */                   c1432e0.f10896n = c1521j6;
                        }
/* 471 */               Iterator it = c1418b.m5189d("in-app-includes").iterator();
/* 479 */               while (it.hasNext()) {
/* 489 */                   c1432e0.f10898p.add((String) it.next());
                        }
/* 499 */               Iterator it2 = c1418b.m5189d("in-app-excludes").iterator();
/* 507 */               while (it2.hasNext()) {
/* 517 */                   c1432e0.f10897o.add((String) it2.next());
                        }
/* 534 */               List<String> listM5189d = c1418b.getProperty("trace-propagation-targets") != null ? c1418b.m5189d("trace-propagation-targets") : null;
/* 535 */               if (listM5189d == null && c1418b.getProperty("tracing-origins") != null) {
/* 545 */                   listM5189d = c1418b.m5189d("tracing-origins");
                        }
/* 549 */               if (listM5189d != null) {
/* 559 */                   for (String str2 : listM5189d) {
/* 569 */                       if (c1432e0.f10899q == null) {
/* 576 */                           c1432e0.f10899q = new CopyOnWriteArrayList();
                                }
/* 582 */                       if (!str2.isEmpty()) {
/* 586 */                           c1432e0.f10899q.add(str2);
                                }
                            }
                        }
/* 596 */               Iterator it3 = c1418b.m5189d("context-tags").iterator();
/* 604 */               while (it3.hasNext()) {
/* 614 */                   c1432e0.f10900r.add((String) it3.next());
                        }
/* 624 */               c1432e0.f10901s = c1418b.getProperty("proguard-uuid");
/* 632 */               Iterator it4 = c1418b.m5189d("bundle-ids").iterator();
/* 640 */               while (it4.hasNext()) {
/* 650 */                   c1432e0.f10859A.add((String) it4.next());
                        }
/* 660 */               c1432e0.f10902t = c1418b.m5188b("idle-timeout");
/* 668 */               c1432e0.f10903u = c1418b.m5188b("shutdown-timeout-millis");
/* 676 */               c1432e0.f10904v = c1418b.m5188b("session-flush-timeout-millis");
/* 680 */               String property10 = c1418b.getProperty("ignored-errors");
/* 698 */               c1432e0.f10906x = property10 != null ? Arrays.asList(property10.split(",")) : null;
/* 706 */               c1432e0.f10860B = c1418b.m5187a("enabled");
/* 714 */               c1432e0.f10861C = c1418b.m5187a("enable-pretty-serialization-output");
/* 722 */               c1432e0.f10868J = c1418b.m5187a("send-modules");
/* 730 */               c1432e0.f10869K = c1418b.m5187a("send-default-pii");
/* 734 */               String property11 = c1418b.getProperty("ignored-checkins");
/* 750 */               c1432e0.f10866H = property11 != null ? Arrays.asList(property11.split(",")) : null;
/* 754 */               String property12 = c1418b.getProperty("ignored-transactions");
/* 770 */               c1432e0.f10867I = property12 != null ? Arrays.asList(property12.split(",")) : null;
/* 778 */               c1432e0.f10870L = c1418b.m5187a("enable-backpressure-handling");
/* 786 */               c1432e0.f10871M = c1418b.m5187a("enable-database-transaction-tracing");
/* 794 */               c1432e0.f10872N = c1418b.m5187a("enable-cache-tracing");
/* 802 */               c1432e0.f10873O = c1418b.m5187a("enable-queue-tracing");
/* 810 */               c1432e0.f10874P = c1418b.m5187a("global-hub-mode");
/* 818 */               c1432e0.f10876R = c1418b.m5187a("capture-open-telemetry-events");
/* 826 */               c1432e0.f10863E = c1418b.m5187a("logs.enabled");
/* 834 */               c1432e0.f10864F = c1418b.m5187a("metrics.enabled");
/* 850 */               for (String str3 : c1418b.m5189d("ignored-exceptions-for-type")) {
                            try {
/* 858 */                       Class<?> cls = Class.forName(str3);
/* 868 */                       if (Throwable.class.isAssignableFrom(cls)) {
/* 872 */                           c1432e0.f10905w.add(cls);
                                } else {
/* 884 */                           logger.mo4672k(EnumC1553m5.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str3, str3);
                                }
                            } catch (ClassNotFoundException unused4) {
/* 896 */                       logger.mo4672k(EnumC1553m5.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str3, str3);
                            }
                        }
/* 902 */               Long lM5188b = c1418b.m5188b("cron.default-checkin-margin");
/* 908 */               Long lM5188b2 = c1418b.m5188b("cron.default-max-runtime");
/* 914 */               String property13 = c1418b.getProperty("cron.default-timezone");
/* 920 */               Long lM5188b3 = c1418b.m5188b("cron.default-failure-issue-threshold");
/* 926 */               Long lM5188b4 = c1418b.m5188b("cron.default-recovery-threshold");
/* 930 */               if (lM5188b != null || lM5188b2 != null || property13 != null || lM5188b3 != null || lM5188b4 != null) {
/* 942 */                   C1394c6 c1394c6 = new C1394c6();
/* 945 */                   c1394c6.f10792a = lM5188b;
/* 947 */                   c1394c6.f10793b = lM5188b2;
/* 949 */                   c1394c6.f10794c = property13;
/* 951 */                   c1394c6.f10795d = lM5188b3;
/* 953 */                   c1394c6.f10796e = lM5188b4;
/* 955 */                   c1432e0.f10882X = c1394c6;
                        }
/* 963 */               c1432e0.f10880V = c1418b.m5187a("enable-strict-trace-continuation");
/* 971 */               c1432e0.f10881W = c1418b.getProperty("org-id");
/* 979 */               c1432e0.f10862D = c1418b.m5187a("enable-spotlight");
/* 987 */               c1432e0.f10865G = c1418b.getProperty("spotlight-connection-url");
/* 991 */               String property14 = c1418b.getProperty("profile-session-sample-rate");
/* 995 */               if (property14 != null) {
                            try {
/* 997 */                       dValueOf4 = Double.valueOf(property14);
                            } catch (NumberFormatException unused5) {
                            }
                        }
/* 1001 */              c1432e0.f10877S = dValueOf4;
/* 1009 */              c1432e0.f10878T = c1418b.getProperty("profiling-traces-dir-path");
/* 1013 */              String property15 = c1418b.getProperty("profile-lifecycle");
/* 1017 */              if (property15 != null && !property15.isEmpty()) {
/* 1033 */                  c1432e0.f10879U = EnumC1634q3.valueOf(property15.toUpperCase());
                        }
/* 1035 */              sentryAndroidOptions.merge(c1432e0);
                    }
/* 1038 */          String dsn = sentryAndroidOptions.getDsn();
/* 1046 */          if (!sentryAndroidOptions.isEnabled() || (dsn != null && dsn.isEmpty())) {
/* 1069 */              m5356a();
/* 5 */                 return false;
                    }
/* 1057 */          if (dsn != null) {
/* 1059 */              sentryAndroidOptions.retrieveParsedDsn();
/* 6 */                 return true;
                    }
/* 1065 */          C1951n4.m6859j("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
/* 5 */             return false;
                }

                /* JADX INFO: renamed from: h */
                public static void m5363h(C2076pn c2076pn) {
/* 5 */             m5357b().mo5091k(c2076pn);
                }
            }
