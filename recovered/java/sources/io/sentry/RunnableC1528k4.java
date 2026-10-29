            package io.sentry;

            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.cache.C1400e;
            import io.sentry.cache.C1401f;
            import io.sentry.cache.tape.AbstractC1407f;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.EnumC1606i0;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1714m;
            import java.io.BufferedWriter;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.OutputStreamWriter;
            
            /* JADX INFO: renamed from: io.sentry.k4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC1528k4 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11086a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ SentryAndroidOptions f11087b;

                public /* synthetic */ RunnableC1528k4(SentryAndroidOptions sentryAndroidOptions, int i) {
/* 1 */             this.f11086a = i;
/* 3 */             this.f11087b = sentryAndroidOptions;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f11086a;
/* 3 */             SentryAndroidOptions sentryAndroidOptions = this.f11087b;
                    switch (i) {
                        case 0:
/* 414 */                   sentryAndroidOptions.loadLazyFields();
/* 417 */                   return;
                        case 1:
/* 227 */                   String cacheDirPathWithoutDsn = sentryAndroidOptions.getCacheDirPathWithoutDsn();
/* 231 */                   if (cacheDirPathWithoutDsn != null) {
/* 237 */                       File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                                try {
/* 240 */                           AbstractC1704c.m5451f(file);
/* 247 */                           if (sentryAndroidOptions.isEnableAppStartProfiling() || sentryAndroidOptions.isStartProfilerOnAppStart()) {
/* 264 */                               if (!sentryAndroidOptions.isStartProfilerOnAppStart() && !sentryAndroidOptions.isTracingEnabled()) {
/* 283 */                                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
/* 413 */                                   return;
                                        }
/* 292 */                               if (file.createNewFile()) {
/* 347 */                                   C1565n4 c1565n4 = new C1565n4(sentryAndroidOptions, sentryAndroidOptions.isEnableAppStartProfiling() ? sentryAndroidOptions.getInternalTracesSampler().m5279a(new C1505c(new C1522j7("app.launch", EnumC1606i0.CUSTOM, "profile", null), Double.valueOf(AbstractC1714m.m5481a().m5480c()))) : new C1671t3(Boolean.FALSE, (Double) null));
/* 352 */                                   FileOutputStream fileOutputStream = new FileOutputStream(file);
                                            try {
/* 364 */                                       BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, AbstractC1552m4.f11142e));
                                                try {
/* 371 */                                           sentryAndroidOptions.getSerializer().mo5063a(bufferedWriter, c1565n4);
/* 374 */                                           bufferedWriter.close();
/* 377 */                                           fileOutputStream.close();
/* 413 */                                           return;
                                                } catch (Throwable th) {
                                                    try {
/* 384 */                                               bufferedWriter.close();
                                                        break;
                                                    } catch (Throwable th2) {
/* 389 */                                               th.addSuppressed(th2);
                                                    }
/* 392 */                                           throw th;
                                                }
                                            } catch (Throwable th3) {
                                                try {
/* 393 */                                           fileOutputStream.close();
                                                    break;
                                                } catch (Throwable th4) {
/* 398 */                                           th3.addSuppressed(th4);
                                                }
/* 401 */                                       throw th3;
                                            }
                                        }
/* 413 */                               return;
                                    }
/* 413 */                           return;
                                } catch (Throwable th5) {
/* 410 */                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Unable to create app start profiling config file. ", th5);
/* 413 */                           return;
                                }
                            }
/* 413 */                   return;
                        case 2:
/* 34 */                    for (InterfaceC1734w0 interfaceC1734w0 : sentryAndroidOptions.getOptionsObservers()) {
/* 42 */                        String release = sentryAndroidOptions.getRelease();
/* 47 */                        C1400e c1400e = (C1400e) interfaceC1734w0;
/* 51 */                        if (release == null) {
/* 53 */                            c1400e.m5125a("release.json");
                                } else {
/* 57 */                            c1400e.m5126b(release, "release.json");
                                }
/* 60 */                        String proguardUuid = sentryAndroidOptions.getProguardUuid();
/* 64 */                        C1400e c1400e2 = (C1400e) interfaceC1734w0;
/* 68 */                        if (proguardUuid == null) {
/* 70 */                            c1400e2.m5125a("proguard-uuid.json");
                                } else {
/* 74 */                            c1400e2.m5126b(proguardUuid, "proguard-uuid.json");
                                }
/* 77 */                        C1624u sdkVersion = sentryAndroidOptions.getSdkVersion();
/* 83 */                        if (sdkVersion == null) {
/* 85 */                            c1400e2.m5125a("sdk-version.json");
                                } else {
/* 89 */                            c1400e2.m5126b(sdkVersion, "sdk-version.json");
                                }
/* 92 */                        String dist = sentryAndroidOptions.getDist();
/* 98 */                        if (dist == null) {
/* 100 */                           c1400e2.m5125a("dist.json");
                                } else {
/* 104 */                           c1400e2.m5126b(dist, "dist.json");
                                }
/* 107 */                       String environment = sentryAndroidOptions.getEnvironment();
/* 113 */                       if (environment == null) {
/* 115 */                           c1400e2.m5125a("environment.json");
                                } else {
/* 119 */                           c1400e2.m5126b(environment, "environment.json");
                                }
/* 126 */                       c1400e2.m5126b(sentryAndroidOptions.getTags(), "tags.json");
/* 133 */                       Double d = sentryAndroidOptions.getSessionReplay().f11528e;
/* 137 */                       if (d == null) {
/* 139 */                           c1400e2.m5125a("replay-error-sample-rate.json");
                                } else {
/* 147 */                           c1400e2.m5126b(d.toString(), "replay-error-sample-rate.json");
                                }
                            }
/* 151 */                   C1401f c1401fFindPersistingScopeObserver = sentryAndroidOptions.findPersistingScopeObserver();
/* 155 */                   if (c1401fFindPersistingScopeObserver != null) {
                                try {
/* 165 */                           ((AbstractC1407f) c1401fFindPersistingScopeObserver.f10810b.m5471a()).clear();
                                    break;
                                } catch (IOException e) {
/* 180 */                           c1401fFindPersistingScopeObserver.f10809a.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to clear breadcrumbs from file queue", e);
                                }
/* 185 */                       c1401fFindPersistingScopeObserver.m5127a("user.json");
/* 190 */                       c1401fFindPersistingScopeObserver.m5127a("level.json");
/* 195 */                       c1401fFindPersistingScopeObserver.m5127a("request.json");
/* 200 */                       c1401fFindPersistingScopeObserver.m5127a("fingerprint.json");
/* 205 */                       c1401fFindPersistingScopeObserver.m5127a("contexts.json");
/* 210 */                       c1401fFindPersistingScopeObserver.m5127a("extras.json");
/* 213 */                       c1401fFindPersistingScopeObserver.m5127a("tags.json");
/* 218 */                       c1401fFindPersistingScopeObserver.m5127a("trace.json");
/* 223 */                       c1401fFindPersistingScopeObserver.m5127a("transaction.json");
/* 226 */                       return;
                            }
/* 226 */                   return;
                        default:
/* 16 */                    AbstractC1552m4.m5357b().mo5082b(sentryAndroidOptions.getFlushTimeoutMillis());
/* 19 */                    return;
                    }
                }
            }
