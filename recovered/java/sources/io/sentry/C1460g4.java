            package io.sentry;

            import io.sentry.clientreport.EnumC1414d;
            import io.sentry.clientreport.InterfaceC1416f;
            import io.sentry.hints.C1482j;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.logger.InterfaceC1541a;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1609k;
            import io.sentry.protocol.C1626w;
            import io.sentry.transport.C1690p;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1715n;
            import java.io.Closeable;
            import java.util.ArrayList;
            import java.util.concurrent.RejectedExecutionException;
            import p000.C1951n4;
            import p000.C2076pn;
            import p000.ji1;
            
            /* JADX INFO: renamed from: io.sentry.g4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1460g4 implements InterfaceC1389c1 {

                /* JADX INFO: renamed from: a */
                public final InterfaceC1156a1 f10953a;

                /* JADX INFO: renamed from: b */
                public final InterfaceC1156a1 f10954b;

                /* JADX INFO: renamed from: c */
                public final InterfaceC1156a1 f10955c;

                /* JADX INFO: renamed from: d */
                public final InterfaceC1547m f10956d;

                /* JADX INFO: renamed from: e */
                public final C1532l f10957e;

                /* JADX INFO: renamed from: f */
                public final C1444f0 f10958f;

                /* JADX INFO: renamed from: g */
                public final C1444f0 f10959g;

                public C1460g4(InterfaceC1156a1 interfaceC1156a1, InterfaceC1156a1 interfaceC1156a2, InterfaceC1156a1 interfaceC1156a3) {
/* 10 */            this.f10957e = new C1532l(0, interfaceC1156a3, interfaceC1156a2, interfaceC1156a1);
/* 12 */            this.f10953a = interfaceC1156a1;
/* 14 */            this.f10954b = interfaceC1156a2;
/* 16 */            this.f10955c = interfaceC1156a3;
/* 18 */            C1554m6 c1554m6Mo5092l = mo5092l();
/* 24 */            AbstractC1704c.m5462q(c1554m6Mo5092l, "SentryOptions is required.");
/* 31 */            if (c1554m6Mo5092l.getDsn() == null || c1554m6Mo5092l.getDsn().isEmpty()) {
/* 66 */                C1951n4.m6859j("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
/* 70 */                throw null;
                    }
/* 47 */            this.f10956d = c1554m6Mo5092l.getCompositePerformanceCollector();
/* 54 */            this.f10958f = new C1444f0(this);
/* 61 */            this.f10959g = new C1444f0(this);
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: A */
                public final C1626w mo5079A(C1609k c1609k) {
/* 1 */             InterfaceC1156a1 interfaceC1156a1 = this.f10957e;
/* 3 */             C1626w c1626w = C1626w.f11478b;
/* 10 */            if (!isEnabled()) {
/* 26 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'captureFeedback' call is a no-op.", new Object[0]);
/* 29 */                return c1626w;
                    }
/* 36 */            if (c1609k.f11369a.isEmpty()) {
/* 52 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "captureFeedback called with empty message.", new Object[0]);
/* 55 */                return c1626w;
                    }
                    try {
/* 60 */                return interfaceC1156a1.mo4711y().mo5225l(c1609k, interfaceC1156a1);
                    } catch (Throwable th) {
/* 92 */                mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error while capturing feedback: " + c1609k.f11369a, th);
/* 95 */                return c1626w;
                    }
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: B */
                public final C1626w mo5080B(C1393c5 c1393c5, C1486i0 c1486i0) {
/* 1 */             InterfaceC1156a1 interfaceC1156a1 = this.f10957e;
/* 3 */             C1626w c1626wMo5226m = C1626w.f11478b;
/* 9 */             if (!isEnabled()) {
/* 26 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
/* 29 */                return c1626wMo5226m;
                    }
                    try {
/* 30 */                interfaceC1156a1.mo4679C(c1393c5);
/* 37 */                c1626wMo5226m = interfaceC1156a1.mo4711y().mo5226m(c1393c5, interfaceC1156a1, c1486i0);
/* 41 */                interfaceC1156a1.mo4684H(c1626wMo5226m);
/* 44 */                return c1626wMo5226m;
                    } catch (Throwable th) {
/* 72 */                mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error while capturing event with id: " + c1393c5.f11516a, th);
/* 75 */                return c1626wMo5226m;
                    }
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: a */
                public final void mo5081a(boolean z) {
/* 6 */             if (!isEnabled()) {
/* 22 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
/* 25 */                return;
                    }
                    try {
/* 42 */                for (InterfaceC1661s1 interfaceC1661s1 : mo5092l().getIntegrations()) {
/* 52 */                    if (interfaceC1661s1 instanceof Closeable) {
                                try {
/* 57 */                            ((Closeable) interfaceC1661s1).close();
                                } catch (Throwable th) {
/* 78 */                            mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to close the integration {}.", interfaceC1661s1, th);
                                }
                            }
                        }
/* 101 */               for (InterfaceC1388c0 interfaceC1388c0 : mo5092l().getEventProcessors()) {
/* 111 */                   if (interfaceC1388c0 instanceof Closeable) {
                                try {
/* 116 */                           ((Closeable) interfaceC1388c0).close();
                                } catch (Throwable th2) {
/* 137 */                           mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to close the event processor {}.", interfaceC1388c0, th2);
                                }
                            }
                        }
/* 141 */               boolean zIsEnabled = isEnabled();
/* 147 */               C1532l c1532l = this.f10957e;
/* 151 */               if (zIsEnabled) {
                            try {
/* 174 */                       c1532l.m5341Q(null).clear();
                            } catch (Throwable th3) {
/* 189 */                       mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error in the 'configureScope' callback.", th3);
                            }
                        } else {
/* 165 */                   mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                        }
/* 192 */               EnumC1448f4 enumC1448f4 = EnumC1448f4.ISOLATION;
/* 198 */               if (isEnabled()) {
                            try {
/* 220 */                       c1532l.m5341Q(enumC1448f4).clear();
                            } catch (Throwable th4) {
/* 235 */                       mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error in the 'configureScope' callback.", th4);
                            }
                        } else {
/* 212 */                   mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                        }
/* 246 */               mo5092l().getBackpressureMonitor().close();
/* 257 */               mo5092l().getTransactionProfiler().close();
/* 269 */               mo5092l().getContinuousProfiler().mo4793a(true);
/* 280 */               mo5092l().getCompositePerformanceCollector().close();
/* 291 */               mo5092l().getConnectionStatusProvider().close();
/* 298 */               InterfaceC1457g1 executorService = mo5092l().getExecutorService();
/* 302 */               if (z) {
                            try {
/* 311 */                       executorService.submit(new ji1(18, this, executorService));
                            } catch (RejectedExecutionException e) {
/* 328 */                       mo5092l().getLogger().mo4671d(EnumC1553m5.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e);
/* 339 */                       executorService.mo4713a(mo5092l().getShutdownTimeoutMillis());
                            }
                        } else {
/* 351 */                   executorService.mo4713a(mo5092l().getShutdownTimeoutMillis());
                        }
/* 354 */               EnumC1448f4 enumC1448f5 = EnumC1448f4.CURRENT;
/* 360 */               if (isEnabled()) {
                            try {
/* 386 */                       c1532l.m5341Q(enumC1448f5).mo4711y().mo5215a(z);
                            } catch (Throwable th5) {
/* 401 */                       mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error in the 'configureScope' callback.", th5);
                            }
                        } else {
/* 374 */                   mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                        }
/* 404 */               EnumC1448f4 enumC1448f6 = EnumC1448f4.ISOLATION;
/* 410 */               if (isEnabled()) {
                            try {
/* 436 */                       c1532l.m5341Q(enumC1448f6).mo4711y().mo5215a(z);
                            } catch (Throwable th6) {
/* 451 */                       mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error in the 'configureScope' callback.", th6);
                            }
                        } else {
/* 424 */                   mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                        }
/* 454 */               EnumC1448f4 enumC1448f7 = EnumC1448f4.GLOBAL;
/* 460 */               if (!isEnabled()) {
/* 474 */                   mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
/* 520 */                   return;
                        }
                        try {
/* 486 */                   c1532l.m5341Q(enumC1448f7).mo4711y().mo5215a(z);
                        } catch (Throwable th7) {
/* 501 */                   mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error in the 'configureScope' callback.", th7);
                        }
                    } catch (Throwable th8) {
/* 517 */               mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error while closing the Scopes.", th8);
                    }
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: b */
                public final void mo5082b(long j) {
/* 5 */             if (!isEnabled()) {
/* 22 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
/* 25 */                return;
                    }
                    try {
/* 32 */                this.f10957e.mo4711y().mo5216b(j);
                    } catch (Throwable th) {
/* 49 */                mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error in the 'client.flush'.", th);
                    }
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: c */
                public final void mo5083c(Throwable th, C1162a7 c1162a7, String str) {
/* 3 */             this.f10957e.mo4692c(th, c1162a7, str);
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
                public final InterfaceC1722v0 m10492clone() {
/* 5 */             if (!isEnabled()) {
/* 22 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Disabled Scopes cloned.", new Object[0]);
                    }
/* 35 */            return new C1548m0((C1460g4) mo5106z("scopes clone"));
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: d */
                public final C1690p mo5084d() {
/* 7 */             return this.f10957e.mo4711y().mo5218d();
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: e */
                public final boolean mo5085e() {
/* 7 */             return this.f10957e.mo4711y().mo5219e();
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: f */
                public final void mo5086f(C1443f c1443f, C1486i0 c1486i0) {
/* 5 */             if (isEnabled()) {
/* 28 */                this.f10957e.mo4693f(c1443f, c1486i0);
                    } else {
/* 22 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
                    }
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: g */
                public final InterfaceC1525k1 mo5087g() {
/* 5 */             if (isEnabled()) {
/* 29 */                return this.f10957e.mo4694g();
                    }
/* 22 */            mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
/* 25 */            return null;
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: h */
                public final C1626w mo5088h(C1505c c1505c, C1486i0 c1486i0) {
/* 1 */             C1626w c1626w = C1626w.f11478b;
/* 7 */             if (!isEnabled()) {
/* 24 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
/* 27 */                return c1626w;
                    }
                    try {
/* 34 */                C1626w c1626wMo5221h = this.f10957e.mo4711y().mo5221h(c1505c, c1486i0);
                        return c1626wMo5221h != null ? c1626wMo5221h : c1626w;
                    } catch (Throwable th) {
/* 55 */                mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error while capturing envelope.", th);
/* 58 */                return c1626w;
                    }
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: i */
                public final void mo5089i(C1443f c1443f) {
/* 6 */             mo5086f(c1443f, new C1486i0());
                }

                @Override // io.sentry.InterfaceC1389c1
                public final boolean isEnabled() {
/* 7 */             return this.f10957e.mo4711y().isEnabled();
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: j */
                public final C1626w mo5090j(C1573o3 c1573o3) {
/* 3 */             AbstractC1704c.m5462q(c1573o3, "profilingContinuousData is required");
/* 6 */             C1626w c1626w = C1626w.f11478b;
/* 12 */            if (!isEnabled()) {
/* 29 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
/* 32 */                return c1626w;
                    }
                    try {
/* 39 */                return this.f10957e.mo4711y().mo5223j(c1573o3);
                    } catch (Throwable th) {
/* 71 */                mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error while capturing profile chunk with id: " + c1573o3.f11194c, th);
/* 74 */                return c1626w;
                    }
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: k */
                public final void mo5091k(C2076pn c2076pn) {
/* 7 */             if (!isEnabled()) {
                        try {
/* 11 */                    c2076pn.mo4804e(C1724v2.f11758b);
/* 14 */                    return;
                        } catch (Throwable th) {
/* 26 */                    mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error in the 'withScope' callback.", th);
/* 83 */                    return;
                        }
                    }
/* 34 */            InterfaceC1156a1 interfaceC1156a1Clone = this.f10953a.clone();
                    try {
/* 47 */                InterfaceC1466h1 interfaceC1466h1Mo5190a = AbstractC1552m4.f11138a.mo5190a(new C1460g4(interfaceC1156a1Clone, this.f10954b, this.f10955c));
                        try {
/* 51 */                    c2076pn.mo4804e(interfaceC1156a1Clone);
/* 54 */                    interfaceC1466h1Mo5190a.close();
                        } catch (Throwable th2) {
                            try {
/* 61 */                        interfaceC1466h1Mo5190a.close();
                            } catch (Throwable th3) {
/* 66 */                        th2.addSuppressed(th3);
                            }
/* 69 */                    throw th2;
                        }
                    } catch (Throwable th4) {
/* 80 */                mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error in the 'withScope' callback.", th4);
                    }
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: l */
                public final C1554m6 mo5092l() {
/* 7 */             return ((InterfaceC1156a1) this.f10957e.f11100b).mo4699l();
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: m */
                public final InterfaceC1549m1 mo5093m() {
/* 5 */             if (isEnabled()) {
/* 29 */                return this.f10957e.mo4700m();
                    }
/* 22 */            mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
/* 25 */            return null;
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: n */
                public final void mo5094n() {
/* 5 */             if (!isEnabled()) {
/* 22 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
/* 25 */                return;
                    }
/* 26 */            C1532l c1532l = this.f10957e;
/* 28 */            C1764z6 c1764z6Mo4701n = c1532l.mo4701n();
/* 32 */            if (c1764z6Mo4701n != null) {
/* 47 */                c1532l.mo4711y().mo5217c(c1764z6Mo4701n, AbstractC1704c.m5450e(new C1482j()));
                    }
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: o */
                public final void mo5095o() {
/* 6 */             if (!isEnabled()) {
/* 22 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
/* 25 */                return;
                    }
/* 26 */            C1532l c1532l = this.f10957e;
/* 28 */            C1505c c1505cMo4702o = c1532l.mo4702o();
/* 32 */            if (c1505cMo4702o == null) {
/* 91 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Session could not be started.", new Object[0]);
/* 94 */                return;
                    }
/* 36 */            C1764z6 c1764z6 = (C1764z6) c1505cMo4702o.f11042b;
/* 38 */            if (c1764z6 != null) {
/* 53 */                c1532l.mo4711y().mo5217c(c1764z6, AbstractC1704c.m5450e(new C1482j()));
                    }
/* 73 */            c1532l.mo4711y().mo5217c((C1764z6) c1505cMo4702o.f11043c, AbstractC1704c.m5450e(new C1482j()));
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: q */
                public final InterfaceC1549m1 mo5097q(C1522j7 c1522j7, C1531k7 c1531k7) {
                    Double dValueOf;
/* 3 */             c1522j7.f10763w = c1531k7.f10919d;
/* 5 */             boolean zIsEnabled = isEnabled();
/* 10 */            InterfaceC1549m1 interfaceC1549m1Mo5203a = C1447f3.f10939a;
/* 12 */            if (!zIsEnabled) {
/* 28 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
                    } else if (AbstractC1715n.m5482a(c1522j7.f10763w, mo5092l().getIgnoredSpanOrigins())) {
/* 67 */                mo5092l().getLogger().mo4672k(EnumC1553m5.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", c1522j7.f10763w);
                    } else if (!mo5092l().getInstrumenter().equals(c1522j7.f10751W)) {
/* 114 */               mo5092l().getLogger().mo4672k(EnumC1553m5.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", c1522j7.f10751W, mo5092l().getInstrumenter());
                    } else if (mo5092l().isTracingEnabled()) {
/* 148 */               C1387c c1387c = c1522j7.f10752X;
/* 150 */               if (c1387c == null || (dValueOf = c1387c.f10774d) == null) {
/* 167 */                   Double d = ((C1387c) this.f10957e.mo4708u().f11671e).f10774d;
/* 178 */                   dValueOf = Double.valueOf(d == null ? 0.0d : d.doubleValue());
                        }
/* 195 */               C1671t3 c1671t3M5279a = mo5092l().getInternalTracesSampler().m5279a(new C1505c(c1522j7, dValueOf));
/* 201 */               Boolean bool = (Boolean) c1671t3M5279a.f11667a;
/* 203 */               c1522j7.m5070a(c1671t3M5279a);
/* 210 */               InterfaceC1534l1 spanFactory = mo5092l().getSpanFactory();
/* 218 */               if (bool.booleanValue() && mo5092l().isContinuousProfilingEnabled()) {
/* 234 */                   EnumC1634q3 profileLifecycle = mo5092l().getProfileLifecycle();
/* 238 */                   EnumC1634q3 enumC1634q3 = EnumC1634q3.TRACE;
/* 240 */                   if (profileLifecycle == enumC1634q3 && c1522j7.f10754Z.equals(C1626w.f11478b)) {
/* 268 */                       mo5092l().getContinuousProfiler().mo4795c(enumC1634q3, mo5092l().getInternalTracesSampler());
                            }
                        }
/* 273 */               interfaceC1549m1Mo5203a = spanFactory.mo5203a(c1522j7, this, c1531k7, this.f10956d);
/* 281 */               if (bool.booleanValue() && ((Boolean) c1671t3M5279a.f11670d).booleanValue()) {
/* 297 */                   InterfaceC1562n1 transactionProfiler = mo5092l().getTransactionProfiler();
/* 305 */                   if (!transactionProfiler.isRunning()) {
/* 307 */                       transactionProfiler.start();
/* 310 */                       transactionProfiler.mo4950e(interfaceC1549m1Mo5203a);
                            } else if (c1531k7.f11094e) {
/* 318 */                       transactionProfiler.mo4950e(interfaceC1549m1Mo5203a);
                            }
                        }
                    } else {
/* 143 */               mo5092l().getLogger().mo4672k(EnumC1553m5.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
                    }
/* 325 */           if (EnumC1392c4.ON == c1531k7.f10917b) {
/* 327 */               interfaceC1549m1Mo5203a.mo5249l();
                    }
/* 330 */           return interfaceC1549m1Mo5203a;
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: r */
                public final void mo5098r(InterfaceC1427d4 interfaceC1427d4) {
/* 5 */             if (!isEnabled()) {
/* 22 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
/* 25 */                return;
                    }
                    try {
/* 33 */                interfaceC1427d4.mo4804e(this.f10957e.m5341Q(null));
                    } catch (Throwable th) {
/* 50 */                mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error in the 'configureScope' callback.", th);
                    }
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: t */
                public final InterfaceC1541a mo5100t() {
/* 1 */             return this.f10958f;
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: u */
                public final C1626w mo5101u(C1576o6 c1576o6, C1486i0 c1486i0) {
/* 1 */             InterfaceC1156a1 interfaceC1156a1 = this.f10957e;
/* 3 */             C1626w c1626w = C1626w.f11478b;
/* 9 */             if (!isEnabled()) {
/* 26 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
/* 29 */                return c1626w;
                    }
                    try {
/* 34 */                return interfaceC1156a1.mo4711y().mo5220g(c1576o6, interfaceC1156a1, c1486i0);
                    } catch (Throwable th) {
/* 52 */                mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error while capturing replay", th);
/* 55 */                return c1626w;
                    }
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: v */
                public final InterfaceC1156a1 mo5102v() {
/* 1 */             return this.f10953a;
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: w */
                public final InterfaceC1695u0 mo5103w() {
/* 1 */             return this.f10959g;
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: x */
                public final C1626w mo5104x(Exception exc, C1486i0 c1486i0) {
/* 1 */             C1626w c1626wMo5226m = C1626w.f11478b;
/* 3 */             boolean zIsEnabled = isEnabled();
/* 7 */             InterfaceC1156a1 interfaceC1156a1 = this.f10957e;
/* 9 */             if (zIsEnabled) {
                        try {
/* 32 */                    C1393c5 c1393c5 = new C1393c5(exc);
/* 35 */                    interfaceC1156a1.mo4679C(c1393c5);
/* 42 */                    c1626wMo5226m = interfaceC1156a1.mo4711y().mo5226m(c1393c5, interfaceC1156a1, c1486i0);
                        } catch (Throwable th) {
/* 76 */                    mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error while capturing exception: " + exc.getMessage(), th);
                        }
                    } else {
/* 26 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
                    }
/* 79 */            interfaceC1156a1.mo4684H(c1626wMo5226m);
/* 82 */            return c1626wMo5226m;
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: y */
                public final C1626w mo5105y(C1600f0 c1600f0, C1472h7 c1472h7, C1486i0 c1486i0, C1642r3 c1642r3) {
                    C1600f0 c1600f1;
/* 1 */             InterfaceC1156a1 interfaceC1156a1 = this.f10957e;
/* 3 */             ArrayList arrayList = c1600f0.f11313d0;
/* 5 */             C1626w c1626w = C1626w.f11478b;
/* 12 */            if (!isEnabled()) {
/* 28 */                mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
/* 31 */                return c1626w;
                    }
/* 34 */            if (c1600f0.f11312c0 == null) {
/* 246 */               mo5092l().getLogger().mo4672k(EnumC1553m5.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", c1600f0.f11516a);
/* 249 */               return c1626w;
                    }
/* 36 */            Boolean bool = Boolean.TRUE;
/* 40 */            C1383b7 c1383b7Mo5313i = c1600f0.f11517b.mo5313i();
/* 48 */            C1671t3 c1671t3 = c1383b7Mo5313i == null ? null : c1383b7Mo5313i.f10758d;
/* 69 */            if (!bool.equals(Boolean.valueOf(c1671t3 != null ? ((Boolean) c1671t3.f11667a).booleanValue() : false))) {
/* 89 */                mo5092l().getLogger().mo4672k(EnumC1553m5.DEBUG, "Transaction %s was dropped due to sampling decision.", c1600f0.f11516a);
/* 104 */               if (mo5092l().getBackpressureMonitor().mo5071a() > 0) {
/* 110 */                   InterfaceC1416f clientReportRecorder = mo5092l().getClientReportRecorder();
/* 114 */                   EnumC1414d enumC1414d = EnumC1414d.BACKPRESSURE;
/* 118 */                   clientReportRecorder.mo5158a(enumC1414d, EnumC1560n.Transaction);
/* 138 */                   mo5092l().getClientReportRecorder().mo5160e(enumC1414d, EnumC1560n.Span, arrayList.size() + 1);
/* 141 */                   return c1626w;
                        }
/* 146 */               InterfaceC1416f clientReportRecorder2 = mo5092l().getClientReportRecorder();
/* 150 */               EnumC1414d enumC1414d2 = EnumC1414d.SAMPLE_RATE;
/* 154 */               clientReportRecorder2.mo5158a(enumC1414d2, EnumC1560n.Transaction);
/* 174 */               mo5092l().getClientReportRecorder().mo5160e(enumC1414d2, EnumC1560n.Span, arrayList.size() + 1);
/* 177 */               return c1626w;
                    }
                    try {
/* 182 */               c1600f1 = c1600f0;
                        try {
/* 186 */                   return interfaceC1156a1.mo4711y().mo5224k(c1600f1, c1472h7, interfaceC1156a1, c1486i0, c1642r3);
                        } catch (Throwable th) {
/* 191 */                   th = th;
/* 192 */                   Throwable th2 = th;
/* 223 */                   mo5092l().getLogger().mo4671d(EnumC1553m5.ERROR, "Error while capturing transaction with id: " + c1600f1.f11516a, th2);
/* 226 */                   return c1626w;
                        }
                    } catch (Throwable th3) {
/* 194 */               th = th3;
/* 195 */               c1600f1 = c1600f0;
                    }
                }

                @Override // io.sentry.InterfaceC1389c1
                /* JADX INFO: renamed from: z */
                public final InterfaceC1389c1 mo5106z(String str) {
/* 17 */            return new C1460g4(this.f10953a.clone(), this.f10954b.clone(), this.f10955c);
                }
            }
