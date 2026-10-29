            package io.sentry.transport;

            import io.sentry.AbstractC1672t4;
            import io.sentry.C1160a5;
            import io.sentry.C1486i0;
            import io.sentry.C1540l7;
            import io.sentry.C1721v;
            import io.sentry.C1726v4;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1560n;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1699u4;
            import io.sentry.ThreadFactoryC1524k0;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.cache.InterfaceC1399d;
            import io.sentry.clientreport.EnumC1414d;
            import io.sentry.hints.AbstractC1475c;
            import io.sentry.hints.InterfaceC1476d;
            import io.sentry.hints.InterfaceC1480h;
            import io.sentry.hints.InterfaceC1483k;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.Future;
            import java.util.concurrent.RejectedExecutionHandler;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: renamed from: io.sentry.transport.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1677c implements InterfaceC1681g {

                /* JADX INFO: renamed from: a */
                public final C1688n f11685a;

                /* JADX INFO: renamed from: b */
                public final InterfaceC1399d f11686b;

                /* JADX INFO: renamed from: c */
                public final SentryAndroidOptions f11687c;

                /* JADX INFO: renamed from: d */
                public final C1690p f11688d;

                /* JADX INFO: renamed from: e */
                public final InterfaceC1682h f11689e;

                /* JADX INFO: renamed from: f */
                public final C1679e f11690f;

                /* JADX INFO: renamed from: i */
                public volatile RunnableC1676b f11691i;

                /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
                public C1677c(SentryAndroidOptions sentryAndroidOptions, C1690p c1690p, InterfaceC1682h interfaceC1682h, C1505c c1505c) {
/* 1 */             int maxQueueSize = sentryAndroidOptions.getMaxQueueSize();
/* 5 */             final InterfaceC1399d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
/* 9 */             final ILogger logger = sentryAndroidOptions.getLogger();
/* 13 */            InterfaceC1699u4 dateProvider = sentryAndroidOptions.getDateProvider();
/* 30 */            C1688n c1688n = new C1688n(maxQueueSize, new ThreadFactoryC1524k0(4), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
                        @Override // java.util.concurrent.RejectedExecutionHandler
                        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
/* 3 */                     if (runnable instanceof RunnableC1676b) {
/* 5 */                         RunnableC1676b runnableC1676b = (RunnableC1676b) runnable;
/* 7 */                         C1486i0 c1486i0 = runnableC1676b.f11681b;
/* 15 */                        if (!AbstractC1704c.m5454i(c1486i0, InterfaceC1476d.class)) {
/* 21 */                            envelopeDiskCache.mo4775K(runnableC1676b.f11680a, c1486i0);
                                }
/* 26 */                        Object objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 41 */                        if (InterfaceC1483k.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) && objM5273b != null) {
/* 47 */                            ((InterfaceC1483k) objM5273b).mo4953b(false);
                                }
/* 50 */                        Object objM5273b2 = c1486i0.m5273b("sentry:typeCheckHint");
/* 64 */                        if (InterfaceC1480h.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) && objM5273b2 != null) {
/* 71 */                            ((InterfaceC1480h) objM5273b2).mo4954c(true);
                                }
/* 82 */                        logger.mo4672k(EnumC1553m5.WARNING, "Envelope rejected", new Object[0]);
                            }
                        }
                    }, logger, dateProvider);
/* 35 */            C1679e c1679e = new C1679e(sentryAndroidOptions, c1505c, c1690p);
/* 42 */            this.f11691i = null;
/* 44 */            this.f11685a = c1688n;
/* 46 */            InterfaceC1399d envelopeDiskCache2 = sentryAndroidOptions.getEnvelopeDiskCache();
/* 52 */            AbstractC1704c.m5462q(envelopeDiskCache2, "envelopeCache is required");
/* 55 */            this.f11686b = envelopeDiskCache2;
/* 57 */            this.f11687c = sentryAndroidOptions;
/* 59 */            this.f11688d = c1690p;
/* 63 */            AbstractC1704c.m5462q(interfaceC1682h, "transportGate is required");
/* 66 */            this.f11689e = interfaceC1682h;
/* 68 */            this.f11690f = c1679e;
                }

                @Override // io.sentry.transport.InterfaceC1681g
                /* JADX INFO: renamed from: F0 */
                public final void mo5417F0(C1505c c1505c, C1486i0 c1486i0) {
                    InterfaceC1399d interfaceC1399d;
                    boolean z;
                    C1505c c1505cMo5162h;
                    List listSingletonList;
/* 9 */             Iterable<C1160a5> iterable = (Iterable) c1505c.f11043c;
/* 13 */            boolean zM5454i = AbstractC1704c.m5454i(c1486i0, InterfaceC1476d.class);
/* 17 */            SentryAndroidOptions sentryAndroidOptions = this.f11687c;
/* 19 */            InterfaceC1399d interfaceC1399d2 = this.f11686b;
/* 22 */            if (zM5454i) {
/* 34 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Captured Envelope is already cached", new Object[0]);
/* 37 */                interfaceC1399d = C1683i.f11698a;
/* 39 */                z = true;
                    } else {
/* 41 */                interfaceC1399d = interfaceC1399d2;
/* 42 */                z = false;
                    }
/* 43 */            C1690p c1690p = this.f11688d;
/* 45 */            SentryAndroidOptions sentryAndroidOptions2 = c1690p.f11709b;
/* 51 */            ArrayList arrayList = null;
/* 56 */            for (C1160a5 c1160a5 : iterable) {
/* 68 */                String itemType = c1160a5.f9799a.f10744e.getItemType();
/* 72 */                itemType.getClass();
                        switch (itemType) {
                            case "attachment":
/* 344 */                       listSingletonList = Collections.singletonList(EnumC1560n.Attachment);
                                break;
                            case "replay_video":
/* 337 */                       listSingletonList = Collections.singletonList(EnumC1560n.Replay);
                                break;
                            case "profile_chunk":
/* 330 */                       listSingletonList = Arrays.asList(EnumC1560n.ProfileChunkUi, EnumC1560n.ProfileChunk);
                                break;
                            case "profile":
/* 317 */                       listSingletonList = Collections.singletonList(EnumC1560n.Profile);
                                break;
                            case "feedback":
/* 310 */                       listSingletonList = Collections.singletonList(EnumC1560n.Feedback);
                                break;
                            case "log":
/* 303 */                       listSingletonList = Arrays.asList(EnumC1560n.LogItem, EnumC1560n.LogByte);
                                break;
                            case "span":
/* 290 */                       listSingletonList = Collections.singletonList(EnumC1560n.Span);
                                break;
                            case "event":
/* 283 */                       listSingletonList = Collections.singletonList(EnumC1560n.Error);
                                break;
                            case "trace_metric":
/* 276 */                       listSingletonList = Arrays.asList(EnumC1560n.TraceMetric, EnumC1560n.TraceMetricByte);
                                break;
                            case "check_in":
/* 263 */                       listSingletonList = Collections.singletonList(EnumC1560n.Monitor);
                                break;
                            case "session":
/* 256 */                       listSingletonList = Collections.singletonList(EnumC1560n.Session);
                                break;
                            case "transaction":
/* 249 */                       listSingletonList = Collections.singletonList(EnumC1560n.Transaction);
                                break;
                            default:
/* 242 */                       listSingletonList = Collections.singletonList(EnumC1560n.Unknown);
                                break;
                        }
/* 348 */               Iterator it = listSingletonList.iterator();
/* 356 */               while (it.hasNext()) {
/* 368 */                   if (c1690p.m5428f((EnumC1560n) it.next())) {
/* 370 */                       if (arrayList == null) {
/* 374 */                           arrayList = new ArrayList();
                                }
/* 378 */                       arrayList.add(c1160a5);
/* 387 */                       sentryAndroidOptions2.getClientReportRecorder().mo5161g(EnumC1414d.RATELIMIT_BACKOFF, c1160a5);
                                break;
                            }
                        }
                    }
/* 394 */           if (arrayList != null) {
/* 416 */               sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
/* 421 */               ArrayList arrayList2 = new ArrayList();
/* 432 */               for (C1160a5 c1160a6 : iterable) {
/* 444 */                   if (!arrayList.contains(c1160a6)) {
/* 446 */                       arrayList2.add(c1160a6);
                            }
                        }
/* 454 */               if (arrayList2.isEmpty()) {
/* 466 */                   sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
/* 469 */                   Object objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 483 */                   if (InterfaceC1483k.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) && objM5273b != null) {
/* 489 */                       ((InterfaceC1483k) objM5273b).mo4953b(false);
                            }
/* 492 */                   Object objM5273b2 = c1486i0.m5273b("sentry:typeCheckHint");
/* 506 */                   if (InterfaceC1480h.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) && objM5273b2 != null) {
/* 512 */                       ((InterfaceC1480h) objM5273b2).mo4954c(false);
                            }
/* 515 */                   Object objM5273b3 = c1486i0.m5273b("sentry:typeCheckHint");
/* 529 */                   if (AbstractC1475c.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) && objM5273b3 != null) {
/* 537 */                       ((AbstractC1475c) objM5273b3).f10996a.countDown();
/* 550 */                       sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                            }
/* 553 */                   c1505cMo5162h = null;
                        } else {
/* 561 */                   c1505cMo5162h = new C1505c((C1726v4) c1505c.f11042b, arrayList2);
                        }
                    } else {
/* 565 */               c1505cMo5162h = c1505c;
                    }
/* 566 */           if (c1505cMo5162h == null) {
/* 568 */               if (z) {
/* 570 */                   interfaceC1399d2.mo5124w1(c1505c);
/* 573 */                   return;
                        }
/* 663 */               return;
                    }
/* 584 */           if (C1540l7.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"))) {
/* 590 */               c1505cMo5162h = sentryAndroidOptions.getClientReportRecorder().mo5162h(c1505cMo5162h);
                    }
/* 601 */           Future futureSubmit = this.f11685a.submit(new RunnableC1676b(this, c1505cMo5162h, c1486i0, interfaceC1399d));
/* 605 */           if (futureSubmit != null && futureSubmit.isCancelled()) {
/* 619 */               sentryAndroidOptions.getClientReportRecorder().mo5159c(EnumC1414d.QUEUE_OVERFLOW, c1505cMo5162h);
/* 622 */               return;
                    }
/* 623 */           Object objM5273b4 = c1486i0.m5273b("sentry:typeCheckHint");
/* 637 */           if (!C1721v.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) || objM5273b4 == null) {
/* 663 */               return;
                    }
/* 641 */           C1721v c1721v = (C1721v) objM5273b4;
/* 647 */           c1721v.f11755i.add(c1721v.f11754f);
/* 660 */           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Envelope enqueued", new Object[0]);
                }

                @Override // io.sentry.transport.InterfaceC1681g
                /* JADX INFO: renamed from: a */
                public final void mo5418a(boolean z) {
/* 5 */             this.f11688d.close();
/* 10 */            this.f11685a.shutdown();
/* 26 */            this.f11687c.getLogger().mo4672k(EnumC1553m5.DEBUG, "Shutting down", new Object[0]);
/* 29 */            if (z) {
/* 122 */               return;
                    }
                    try {
/* 33 */                long flushTimeoutMillis = this.f11687c.getFlushTimeoutMillis();
/* 45 */                if (this.f11685a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
/* 122 */                   return;
                        }
/* 74 */                this.f11687c.getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
/* 79 */                this.f11685a.shutdownNow();
/* 84 */                if (this.f11691i != null) {
/* 96 */                    this.f11685a.getRejectedExecutionHandler().rejectedExecution(this.f11691i, this.f11685a);
                        }
                    } catch (InterruptedException unused) {
/* 112 */               this.f11687c.getLogger().mo4672k(EnumC1553m5.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
/* 119 */               Thread.currentThread().interrupt();
                    }
                }

                @Override // io.sentry.transport.InterfaceC1681g
                /* JADX INFO: renamed from: b */
                public final void mo5419b(long j) {
/* 1 */             C1688n c1688n = this.f11685a;
/* 3 */             c1688n.getClass();
                    try {
/* 19 */                ((C1691q) c1688n.f11707e.f11662b).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
                    } catch (InterruptedException e) {
/* 30 */                c1688n.f11705c.mo4671d(EnumC1553m5.ERROR, "Failed to wait till idle", e);
/* 37 */                Thread.currentThread().interrupt();
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 2 */             mo5418a(false);
                }

                @Override // io.sentry.transport.InterfaceC1681g
                /* JADX INFO: renamed from: d */
                public final C1690p mo5420d() {
/* 1 */             return this.f11688d;
                }

                @Override // io.sentry.transport.InterfaceC1681g
                /* JADX INFO: renamed from: e */
                public final boolean mo5421e() {
                    boolean z;
/* 1 */             C1690p c1690p = this.f11688d;
/* 3 */             c1690p.getClass();
/* 10 */            c1690p.f11708a.getClass();
/* 17 */            Date date = new Date(System.currentTimeMillis());
/* 20 */            ConcurrentHashMap concurrentHashMap = c1690p.f11710c;
/* 26 */            Iterator it = concurrentHashMap.keySet().iterator();
                    while (true) {
/* 36 */                if (!it.hasNext()) {
/* 60 */                    z = false;
                            break;
                        }
/* 48 */                Date date2 = (Date) concurrentHashMap.get((EnumC1560n) it.next());
/* 50 */                if (date2 != null && !date.after(date2)) {
/* 58 */                    z = true;
                            break;
                        }
                    }
/* 61 */            C1688n c1688n = this.f11685a;
/* 63 */            AbstractC1672t4 abstractC1672t4 = c1688n.f11704b;
                    return (z || (abstractC1672t4 != null && (c1688n.f11706d.mo4856a().mo5412b(abstractC1672t4) > 2000000000L ? 1 : (c1688n.f11706d.mo4856a().mo5412b(abstractC1672t4) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
                }
            }
