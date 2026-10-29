            package io.sentry.android.core;

            import io.sentry.AbstractC1552m4;
            import io.sentry.AbstractC1672t4;
            import io.sentry.C1493i7;
            import io.sentry.C1554m6;
            import io.sentry.C1564n3;
            import io.sentry.C1700u5;
            import io.sentry.C1736w2;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1560n;
            import io.sentry.EnumC1570o0;
            import io.sentry.EnumC1634q3;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1389c1;
            import io.sentry.InterfaceC1457g1;
            import io.sentry.InterfaceC1547m;
            import io.sentry.InterfaceC1639r0;
            import io.sentry.android.core.internal.util.C1231r;
            import io.sentry.protocol.C1626w;
            import io.sentry.transport.C1690p;
            import io.sentry.transport.InterfaceC1689o;
            import io.sentry.util.AbstractC1714m;
            import io.sentry.util.C1702a;
            import io.sentry.util.InterfaceC1707f;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.Map;
            import java.util.concurrent.Future;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import p000.f72;
            
            /* JADX INFO: renamed from: io.sentry.android.core.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1193h implements InterfaceC1639r0, InterfaceC1689o {

                /* JADX INFO: renamed from: U */
                public InterfaceC1389c1 f10026U;

                /* JADX INFO: renamed from: V */
                public Future f10027V;

                /* JADX INFO: renamed from: W */
                public InterfaceC1547m f10028W;

                /* JADX INFO: renamed from: Y */
                public C1626w f10030Y;

                /* JADX INFO: renamed from: Z */
                public C1626w f10031Z;

                /* JADX INFO: renamed from: a */
                public final ILogger f10032a;

                /* JADX INFO: renamed from: a0 */
                public final AtomicBoolean f10033a0;

                /* JADX INFO: renamed from: b */
                public final String f10034b;

                /* JADX INFO: renamed from: b0 */
                public AbstractC1672t4 f10035b0;

                /* JADX INFO: renamed from: c */
                public final int f10036c;

                /* JADX INFO: renamed from: c0 */
                public volatile boolean f10037c0;

                /* JADX INFO: renamed from: d */
                public final InterfaceC1707f f10038d;

                /* JADX INFO: renamed from: d0 */
                public boolean f10039d0;

                /* JADX INFO: renamed from: e */
                public final C1248o0 f10040e;

                /* JADX INFO: renamed from: e0 */
                public boolean f10041e0;

                /* JADX INFO: renamed from: f0 */
                public int f10043f0;

                /* JADX INFO: renamed from: g0 */
                public final C1702a f10044g0;

                /* JADX INFO: renamed from: h0 */
                public final C1702a f10045h0;

                /* JADX INFO: renamed from: i */
                public final C1231r f10046i;

                /* JADX INFO: renamed from: f */
                public boolean f10042f = false;

                /* JADX INFO: renamed from: v */
                public C1271t f10047v = null;

                /* JADX INFO: renamed from: w */
                public boolean f10048w = false;

                /* JADX INFO: renamed from: X */
                public final ArrayList f10029X = new ArrayList();

                public C1193h(C1248o0 c1248o0, C1231r c1231r, ILogger iLogger, String str, int i, InterfaceC1707f interfaceC1707f) {
/* 19 */            C1626w c1626w = C1626w.f11478b;
/* 21 */            this.f10030Y = c1626w;
/* 23 */            this.f10031Z = c1626w;
/* 30 */            this.f10033a0 = new AtomicBoolean(false);
/* 37 */            this.f10035b0 = new C1700u5();
/* 40 */            this.f10037c0 = true;
/* 42 */            this.f10039d0 = false;
/* 44 */            this.f10041e0 = false;
/* 46 */            this.f10043f0 = 0;
/* 53 */            this.f10044g0 = new C1702a();
/* 60 */            this.f10045h0 = new C1702a();
/* 62 */            this.f10032a = iLogger;
/* 64 */            this.f10046i = c1231r;
/* 66 */            this.f10040e = c1248o0;
/* 68 */            this.f10034b = str;
/* 70 */            this.f10036c = i;
/* 72 */            this.f10038d = interfaceC1707f;
                }

                @Override // io.sentry.InterfaceC1639r0
                /* JADX INFO: renamed from: a */
                public final void mo4793a(boolean z) {
/* 1 */             C1702a c1702a = this.f10044g0;
/* 3 */             c1702a.m5443c();
                    try {
/* 7 */                 this.f10043f0 = 0;
/* 10 */                this.f10039d0 = true;
/* 12 */                if (z) {
/* 14 */                    m4800h(false);
/* 19 */                    this.f10033a0.set(true);
                        }
/* 25 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 29 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 34 */                    th.addSuppressed(th2);
                        }
/* 37 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1639r0
                /* JADX INFO: renamed from: b */
                public final void mo4794b(EnumC1634q3 enumC1634q3) {
/* 1 */             C1702a c1702a = this.f10044g0;
/* 3 */             c1702a.m5443c();
                    try {
/* 12 */                int i = AbstractC1190g.f10016a[enumC1634q3.ordinal()];
/* 15 */                if (i == 1) {
/* 28 */                    int i2 = this.f10043f0 - 1;
/* 29 */                    this.f10043f0 = i2;
/* 31 */                    if (i2 > 0) {
/* 33 */                        c1702a.close();
/* 36 */                        return;
                            } else {
/* 37 */                        if (i2 < 0) {
/* 40 */                            this.f10043f0 = 0;
                                }
/* 42 */                        this.f10039d0 = true;
                            }
                        } else if (i == 2) {
/* 21 */                    this.f10039d0 = true;
                        }
/* 44 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 48 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 53 */                    th.addSuppressed(th2);
                        }
/* 56 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1639r0
                /* JADX INFO: renamed from: c */
                public final void mo4795c(EnumC1634q3 enumC1634q3, C1493i7 c1493i7) {
/* 1 */             C1702a c1702a = this.f10044g0;
/* 3 */             c1702a.m5443c();
                    try {
/* 10 */                if (this.f10037c0) {
/* 16 */                    double dM5480c = AbstractC1714m.m5481a().m5480c();
/* 22 */                    Double profileSessionSampleRate = c1493i7.f11014a.getProfileSessionSampleRate();
/* 39 */                    this.f10041e0 = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dM5480c;
/* 41 */                    this.f10037c0 = false;
                        }
/* 48 */                if (!this.f10041e0) {
/* 58 */                    this.f10032a.mo4672k(EnumC1553m5.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
/* 61 */                    c1702a.close();
/* 64 */                    return;
                        }
/* 71 */                int i = AbstractC1190g.f10016a[enumC1634q3.ordinal()];
/* 73 */                if (i == 1) {
/* 100 */                   if (this.f10043f0 < 0) {
/* 102 */                       this.f10043f0 = 0;
                            }
/* 107 */                   this.f10043f0++;
                        } else if (i == 2 && this.f10048w) {
/* 91 */                    this.f10032a.mo4672k(EnumC1553m5.DEBUG, "Profiler is already running.", new Object[0]);
/* 94 */                    c1702a.close();
/* 97 */                    return;
                        }
/* 111 */               if (!this.f10048w) {
/* 121 */                   this.f10032a.mo4672k(EnumC1553m5.DEBUG, "Started Profiler.", new Object[0]);
/* 124 */                   m4799g();
                        }
/* 127 */               c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 131 */                   c1702a.close();
                        } catch (Throwable th2) {
/* 136 */                   th.addSuppressed(th2);
                        }
/* 139 */               throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1639r0
                /* JADX INFO: renamed from: d */
                public final void mo4796d() {
/* 2 */             this.f10037c0 = true;
                }

                @Override // io.sentry.InterfaceC1639r0
                /* JADX INFO: renamed from: e */
                public final C1626w mo4797e() {
/* 1 */             return this.f10030Y;
                }

                /* JADX INFO: renamed from: f */
                public final void m4798f() {
/* 1 */             InterfaceC1389c1 interfaceC1389c1 = this.f10026U;
/* 3 */             if ((interfaceC1389c1 == null || interfaceC1389c1 == C1736w2.f11797b) && AbstractC1552m4.m5357b() != C1736w2.f11797b) {
/* 21 */                this.f10026U = AbstractC1552m4.m5357b();
/* 35 */                this.f10028W = AbstractC1552m4.m5357b().mo5092l().getCompositePerformanceCollector();
/* 39 */                C1690p c1690pMo5084d = this.f10026U.mo5084d();
/* 43 */                if (c1690pMo5084d != null) {
/* 47 */                    c1690pMo5084d.f11711d.add(this);
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m4799g() {
/* 1 */             m4798f();
/* 6 */             this.f10040e.getClass();
/* 13 */            if (!this.f10042f) {
/* 16 */                this.f10042f = true;
/* 18 */                ILogger iLogger = this.f10032a;
/* 20 */                String str = this.f10034b;
/* 22 */                if (str == null) {
/* 30 */                    iLogger.mo4672k(EnumC1553m5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                        } else {
/* 34 */                    int i = this.f10036c;
/* 36 */                    if (i <= 0) {
/* 50 */                        iLogger.mo4672k(EnumC1553m5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                            } else {
/* 66 */                        this.f10047v = new C1271t(str, 1000000 / i, this.f10046i, null, iLogger);
                            }
                        }
                    }
/* 70 */            if (this.f10047v == null) {
/* 177 */               return;
                    }
/* 73 */            InterfaceC1389c1 interfaceC1389c1 = this.f10026U;
/* 75 */            ILogger iLogger2 = this.f10032a;
/* 77 */            if (interfaceC1389c1 != null) {
/* 79 */                C1690p c1690pMo5084d = interfaceC1389c1.mo5084d();
/* 83 */                if (c1690pMo5084d != null && (c1690pMo5084d.m5428f(EnumC1560n.All) || c1690pMo5084d.m5428f(EnumC1560n.ProfileChunkUi))) {
/* 107 */                   iLogger2.mo4672k(EnumC1553m5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
/* 110 */                   m4800h(false);
/* 113 */                   return;
                        } else {
/* 130 */                   if (this.f10026U.mo5092l().getConnectionStatusProvider().mo4835r0() == EnumC1570o0.DISCONNECTED) {
/* 138 */                       iLogger2.mo4672k(EnumC1553m5.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
/* 141 */                       m4800h(false);
/* 144 */                       return;
                            }
/* 159 */                   this.f10035b0 = this.f10026U.mo5092l().getDateProvider().mo4856a();
                        }
                    } else {
/* 167 */               this.f10035b0 = new C1700u5();
                    }
/* 175 */           if (this.f10047v.m4936c() == null) {
/* 177 */               return;
                    }
/* 178 */           this.f10048w = true;
/* 180 */           C1626w c1626w = this.f10030Y;
/* 182 */           C1626w c1626w2 = C1626w.f11478b;
/* 188 */           if (c1626w.equals(c1626w2)) {
/* 195 */               this.f10030Y = new C1626w();
                    }
/* 203 */           if (this.f10031Z.equals(c1626w2)) {
/* 210 */               this.f10031Z = new C1626w();
                    }
/* 212 */           InterfaceC1547m interfaceC1547m = this.f10028W;
/* 214 */           if (interfaceC1547m != null) {
/* 222 */               interfaceC1547m.mo5349a(this.f10031Z.m5380a());
                    }
                    try {
/* 247 */               this.f10027V = ((InterfaceC1457g1) this.f10038d.mo4803b()).mo4714b(new f72(this, 18), 60000L);
                    } catch (RejectedExecutionException e) {
/* 255 */               iLogger2.mo4671d(EnumC1553m5.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
/* 258 */               this.f10039d0 = true;
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m4800h(boolean z) {
/* 1 */             m4798f();
/* 4 */             C1702a c1702a = this.f10044g0;
/* 6 */             c1702a.m5443c();
                    try {
/* 9 */                 Future future = this.f10027V;
/* 11 */                if (future != null) {
/* 14 */                    future.cancel(true);
                        }
/* 24 */                if (this.f10047v != null && this.f10048w) {
/* 34 */                    this.f10040e.getClass();
/* 37 */                    InterfaceC1547m interfaceC1547m = this.f10028W;
/* 56 */                    C1268s c1268sM4934a = this.f10047v.m4934a(interfaceC1547m != null ? interfaceC1547m.mo5351c(this.f10031Z.m5380a()) : null, false);
/* 60 */                    ILogger iLogger = this.f10032a;
/* 62 */                    if (c1268sM4934a == null) {
/* 70 */                        iLogger.mo4672k(EnumC1553m5.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                            } else {
/* 74 */                        C1702a c1702a2 = this.f10045h0;
/* 76 */                        c1702a2.m5443c();
                                try {
/* 101 */                           this.f10029X.add(new C1564n3(this.f10030Y, this.f10031Z, (Map) c1268sM4934a.f10301e, (File) c1268sM4934a.f10300d, this.f10035b0));
/* 104 */                           c1702a2.close();
                                } catch (Throwable th) {
                                    try {
/* 185 */                               c1702a2.close();
/* 194 */                               throw th;
                                    } catch (Throwable th2) {
/* 191 */                               th.addSuppressed(th2);
/* 194 */                               throw th;
                                    }
                                }
                            }
/* 107 */                   this.f10048w = false;
/* 111 */                   this.f10031Z = C1626w.f11478b;
/* 113 */                   InterfaceC1389c1 interfaceC1389c1 = this.f10026U;
/* 115 */                   if (interfaceC1389c1 != null) {
/* 117 */                       C1554m6 c1554m6Mo5092l = interfaceC1389c1.mo5092l();
                                try {
/* 131 */                           c1554m6Mo5092l.getExecutorService().submit(new RunnableC1192g1(2, this, c1554m6Mo5092l, interfaceC1389c1));
                                } catch (Throwable th3) {
/* 144 */                           c1554m6Mo5092l.getLogger().mo4671d(EnumC1553m5.DEBUG, "Failed to send profile chunks.", th3);
                                }
                            }
/* 147 */                   if (!z || this.f10039d0) {
/* 168 */                       this.f10030Y = C1626w.f11478b;
/* 176 */                       iLogger.mo4672k(EnumC1553m5.DEBUG, "Profile chunk finished.", new Object[0]);
                            } else {
/* 159 */                       iLogger.mo4672k(EnumC1553m5.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
/* 162 */                       m4799g();
                            }
/* 179 */                   c1702a.close();
/* 182 */                   return;
                        }
/* 195 */               C1626w c1626w = C1626w.f11478b;
/* 197 */               this.f10030Y = c1626w;
/* 199 */               this.f10031Z = c1626w;
/* 201 */               c1702a.close();
                    } catch (Throwable th4) {
                        try {
/* 205 */                   c1702a.close();
/* 214 */                   throw th4;
                        } catch (Throwable th5) {
/* 211 */                   th4.addSuppressed(th5);
/* 214 */                   throw th4;
                        }
                    }
                }

                @Override // io.sentry.transport.InterfaceC1689o
                /* JADX INFO: renamed from: k */
                public final void mo4801k(C1690p c1690p) {
/* 7 */             if (c1690p.m5428f(EnumC1560n.All) || c1690p.m5428f(EnumC1560n.ProfileChunkUi)) {
/* 28 */                this.f10032a.mo4672k(EnumC1553m5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
/* 31 */                m4800h(false);
                    }
                }
            }
