            package io.sentry.android.core;

            import android.app.Application;
            import android.content.Context;
            import android.os.Build;
            import io.sentry.C1391c3;
            import io.sentry.C1468h3;
            import io.sentry.C1519j4;
            import io.sentry.C1535l2;
            import io.sentry.C1550m2;
            import io.sentry.C1563n2;
            import io.sentry.C1569o;
            import io.sentry.C1572o2;
            import io.sentry.C1630q;
            import io.sentry.C1667t;
            import io.sentry.C1670t2;
            import io.sentry.EnumC1553m5;
            import io.sentry.InterfaceC1547m;
            import io.sentry.InterfaceC1562n1;
            import io.sentry.android.core.anr.AnrProfilingIntegration;
            import io.sentry.android.core.cache.C1180b;
            import io.sentry.android.core.internal.gestures.C1199a;
            import io.sentry.android.core.internal.util.C1216c;
            import io.sentry.android.core.internal.util.C1218e;
            import io.sentry.android.core.internal.util.C1231r;
            import io.sentry.android.core.performance.C1259g;
            import io.sentry.android.distribution.DistributionIntegration;
            import io.sentry.android.fragment.FragmentLifecycleIntegration;
            import io.sentry.android.replay.C1297c;
            import io.sentry.android.replay.ReplayIntegration;
            import io.sentry.android.timber.SentryTimberIntegration;
            import io.sentry.cache.C1400e;
            import io.sentry.cache.C1401f;
            import io.sentry.compose.gestures.ComposeGestureTargetLocator;
            import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
            import io.sentry.internal.debugmeta.C1504b;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.internal.modules.C1512e;
            import io.sentry.internal.modules.C1513f;
            import io.sentry.protocol.C1626w;
            import io.sentry.transport.C1683i;
            import io.sentry.transport.C1685k;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1708g;
            import io.sentry.util.C1709h;
            import io.sentry.util.thread.C1719b;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: io.sentry.android.core.q */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1262q {
                /* JADX INFO: renamed from: a */
                public static void m4921a(SentryAndroidOptions sentryAndroidOptions, Context context, C1248o0 c1248o0, C1709h c1709h, C1181d c1181d, boolean z) {
/* 5 */             if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof C1683i)) {
/* 20 */                sentryAndroidOptions.setEnvelopeDiskCache(new C1180b(sentryAndroidOptions));
                    }
/* 29 */            if (sentryAndroidOptions.getConnectionStatusProvider() instanceof C1563n2) {
/* 36 */                sentryAndroidOptions.setConnectionStatusProvider(new C1216c(context, c1248o0, sentryAndroidOptions));
                    }
/* 43 */            if (sentryAndroidOptions.getCacheDirPath() != null) {
/* 50 */                sentryAndroidOptions.addScopeObserver(new C1401f(sentryAndroidOptions));
/* 58 */                sentryAndroidOptions.addOptionsObserver(new C1400e(sentryAndroidOptions));
                    }
/* 66 */            sentryAndroidOptions.addEventProcessor(new C1569o(sentryAndroidOptions));
/* 74 */            sentryAndroidOptions.addEventProcessor(new C1263q0(context, c1248o0, sentryAndroidOptions));
/* 82 */            sentryAndroidOptions.addEventProcessor(new C1189f1(sentryAndroidOptions, c1181d));
/* 90 */            sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, c1248o0, z));
/* 98 */            sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
/* 106 */           sentryAndroidOptions.addEventProcessor(new C1197i0(context, c1248o0, sentryAndroidOptions));
/* 115 */           if (sentryAndroidOptions.getTransportGate() instanceof C1685k) {
/* 122 */               sentryAndroidOptions.setTransportGate(new C1283x(sentryAndroidOptions));
                    }
/* 125 */           C1259g c1259gM4907c = C1259g.m4907c();
/* 131 */           sentryAndroidOptions.setAppStartExtender(c1259gM4907c.f10278i0);
/* 140 */           if (sentryAndroidOptions.getModulesLoader() instanceof C1512e) {
/* 147 */               sentryAndroidOptions.setModulesLoader(new C1513f(context, sentryAndroidOptions));
                    }
/* 156 */           if (sentryAndroidOptions.getDebugMetaLoader() instanceof C1504b) {
/* 167 */               sentryAndroidOptions.setDebugMetaLoader(new C1505c(context, sentryAndroidOptions.getLogger()));
                    }
/* 177 */           if (sentryAndroidOptions.getVersionDetector() instanceof C1468h3) {
/* 184 */               sentryAndroidOptions.setVersionDetector(new C1667t(sentryAndroidOptions, 0));
                    }
/* 194 */           C1708g c1708g = new C1708g(new C1250p(c1709h, sentryAndroidOptions));
/* 199 */           boolean zM5473b = C1709h.m5473b(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
/* 211 */           if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
/* 216 */               ArrayList arrayList = new ArrayList(2);
/* 224 */               arrayList.add(new C1199a(c1708g));
/* 227 */               if (zM5473b && C1709h.m5473b(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
/* 246 */                   arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
                        }
/* 249 */               sentryAndroidOptions.setGestureTargetLocators(arrayList);
                    }
/* 261 */           if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zM5473b && C1709h.m5473b(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
/* 275 */               ArrayList arrayList2 = new ArrayList(1);
/* 287 */               arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
/* 290 */               sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
                    }
/* 299 */           if (sentryAndroidOptions.getThreadChecker() instanceof C1719b) {
/* 303 */               sentryAndroidOptions.setThreadChecker(C1218e.f10157a);
                    }
/* 312 */           if (sentryAndroidOptions.getSocketTagger() instanceof C1391c3) {
/* 316 */               sentryAndroidOptions.setSocketTagger(C1274u.f10341b);
                    }
/* 329 */           if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
/* 336 */               sentryAndroidOptions.addPerformanceCollector(new C1244n());
/* 348 */               sentryAndroidOptions.addPerformanceCollector(new C1196i(sentryAndroidOptions.getLogger()));
/* 355 */               if (sentryAndroidOptions.isEnablePerformanceV2()) {
/* 359 */                   C1231r frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
/* 363 */                   AbstractC1704c.m5462q(frameMetricsCollector, "options.getFrameMetricsCollector is required");
/* 369 */                   sentryAndroidOptions.addPerformanceCollector(new C1276u1(sentryAndroidOptions, frameMetricsCollector));
                        }
                    }
/* 378 */           if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof C1550m2) {
/* 385 */               sentryAndroidOptions.setCompositePerformanceCollector(new C1630q(sentryAndroidOptions));
                    }
/* 388 */           if (z && (sentryAndroidOptions.getReplayController().getF10414Z() instanceof C1670t2)) {
/* 411 */               sentryAndroidOptions.getReplayController().mo4973h(new C1297c(sentryAndroidOptions));
                    }
/* 414 */           C1702a c1702a = C1259g.f10256l0;
/* 416 */           c1702a.m5443c();
                    try {
/* 419 */               InterfaceC1562n1 interfaceC1562n1 = c1259gM4907c.f10280w;
/* 421 */               C1193h c1193h = c1259gM4907c.f10257U;
/* 424 */               c1259gM4907c.f10280w = null;
/* 426 */               c1259gM4907c.f10257U = null;
/* 428 */               c1702a.close();
/* 431 */               InterfaceC1547m compositePerformanceCollector = sentryAndroidOptions.getCompositePerformanceCollector();
/* 439 */               if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
/* 524 */                   sentryAndroidOptions.setContinuousProfiler(C1572o2.f11186a);
/* 527 */                   if (c1193h != null) {
/* 529 */                       c1193h.mo4793a(true);
                            }
/* 532 */                   if (interfaceC1562n1 != null) {
/* 534 */                       sentryAndroidOptions.setTransactionProfiler(interfaceC1562n1);
/* 537 */                       return;
                            }
/* 541 */                   C1231r frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
/* 545 */                   AbstractC1704c.m5462q(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
/* 574 */                   sentryAndroidOptions.setTransactionProfiler(new C1277v(context, c1248o0, frameMetricsCollector2, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), new C1250p(sentryAndroidOptions, 3)));
/* 577 */                   return;
                        }
/* 452 */               sentryAndroidOptions.setTransactionProfiler(C1535l2.f11115e);
/* 455 */               if (interfaceC1562n1 != null) {
/* 457 */                   interfaceC1562n1.close();
                        }
/* 460 */               if (c1193h == null) {
/* 490 */                   C1231r frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
/* 494 */                   AbstractC1704c.m5462q(frameMetricsCollector3, "options.getFrameMetricsCollector is required");
/* 518 */                   sentryAndroidOptions.setContinuousProfiler(new C1193h(c1248o0, frameMetricsCollector3, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), new C1250p(sentryAndroidOptions, 0)));
                        } else {
/* 462 */                   sentryAndroidOptions.setContinuousProfiler(c1193h);
/* 465 */                   C1626w c1626w = c1193h.f10031Z;
/* 469 */                   if (!c1193h.f10048w || c1626w.equals(C1626w.f11478b)) {
/* 486 */                       return;
                            }
/* 483 */                   compositePerformanceCollector.mo5349a(c1626w.m5380a());
                        }
                    } catch (Throwable th) {
                        try {
/* 580 */                   c1702a.close();
/* 589 */                   throw th;
                        } catch (Throwable th2) {
/* 586 */                   th.addSuppressed(th2);
/* 589 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public static void m4922b(Context context, SentryAndroidOptions sentryAndroidOptions, C1248o0 c1248o0, C1709h c1709h, C1181d c1181d, boolean z, boolean z2, boolean z3, boolean z4) {
/* 9 */             C1708g c1708g = new C1708g(new C1250p(sentryAndroidOptions, 1));
/* 29 */            sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C1519j4(new C1250p(sentryAndroidOptions, 2), 0), c1708g));
/* 47 */            sentryAndroidOptions.addIntegration(new NdkIntegration(C1709h.m5475f(sentryAndroidOptions.getLogger(), "io.sentry.android.ndk.SentryNdk", true)));
/* 50 */            int i = Build.VERSION.SDK_INT;
/* 54 */            if (i >= 31) {
/* 61 */                sentryAndroidOptions.addIntegration(new TombstoneIntegration(context));
                    }
/* 69 */            sentryAndroidOptions.addIntegration(new EnvelopeFileObserverIntegration.OutboxEnvelopeFileObserverIntegration());
/* 87 */            sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C1519j4(new C1250p(sentryAndroidOptions, 2), 1), c1708g));
/* 95 */            sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
/* 113 */           sentryAndroidOptions.addIntegration(i >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context));
/* 121 */           sentryAndroidOptions.addIntegration(new AnrProfilingIntegration());
/* 126 */           if (context instanceof Application) {
/* 131 */               Application application = (Application) context;
/* 136 */               sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, c1248o0, c1181d));
/* 144 */               sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
/* 152 */               sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application));
/* 160 */               sentryAndroidOptions.addIntegration(new FeedbackShakeIntegration(application));
/* 163 */               if (z) {
/* 170 */                   sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
                        }
                    } else {
/* 184 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
                    }
/* 187 */           if (z2) {
/* 194 */               sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
                    }
/* 202 */           sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
/* 210 */           sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
/* 218 */           sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, c1248o0));
/* 221 */           if (z3) {
/* 225 */               ReplayIntegration replayIntegration = new ReplayIntegration(context);
/* 228 */               sentryAndroidOptions.addIntegration(replayIntegration);
/* 231 */               sentryAndroidOptions.setReplayController(replayIntegration);
                    }
/* 234 */           if (z4) {
/* 238 */               DistributionIntegration distributionIntegration = new DistributionIntegration(context);
/* 241 */               sentryAndroidOptions.setDistributionController(distributionIntegration);
/* 244 */               sentryAndroidOptions.addIntegration(distributionIntegration);
                    }
/* 251 */           sentryAndroidOptions.getFeedbackOptions().getClass();
                }
            }
