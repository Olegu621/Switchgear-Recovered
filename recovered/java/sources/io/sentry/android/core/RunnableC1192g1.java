            package io.sentry.android.core;

            import android.content.Context;
            import android.content.IntentFilter;
            import android.os.Build;
            import android.os.Handler;
            import android.os.HandlerThread;
            import io.sentry.C1554m6;
            import io.sentry.C1564n3;
            import io.sentry.C1573o3;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1560n;
            import io.sentry.EnumC1570o0;
            import io.sentry.InterfaceC1389c1;
            import io.sentry.InterfaceC1631q0;
            import io.sentry.transport.C1690p;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.util.ArrayList;
            import java.util.Iterator;
            import p000.fk2;
            
            /* JADX INFO: renamed from: io.sentry.android.core.g1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final /* synthetic */ class RunnableC1192g1 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10022a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f10023b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f10024c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f10025d;

                public /* synthetic */ RunnableC1192g1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, InterfaceC1389c1 interfaceC1389c1, SentryAndroidOptions sentryAndroidOptions) {
/* 2 */             this.f10022a = 4;
/* 7 */             this.f10023b = systemEventsBreadcrumbsIntegration;
/* 9 */             this.f10025d = interfaceC1389c1;
/* 11 */            this.f10024c = sentryAndroidOptions;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f10022a) {
                        case 0:
/* 400 */                   SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.f10023b;
/* 404 */                   SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f10024c;
/* 408 */                   InterfaceC1389c1 interfaceC1389c1 = (InterfaceC1389c1) this.f10025d;
                            try {
/* 416 */                       if (sendCachedEnvelopeIntegration.f9886w.get()) {
/* 428 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
/* 548 */                           return;
                                }
/* 442 */                       if (!sendCachedEnvelopeIntegration.f9885v.getAndSet(true)) {
/* 444 */                           InterfaceC1631q0 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
/* 448 */                           sendCachedEnvelopeIntegration.f9881d = connectionStatusProvider;
/* 450 */                           connectionStatusProvider.mo4837z0(sendCachedEnvelopeIntegration);
/* 459 */                           sendCachedEnvelopeIntegration.f9884i = sendCachedEnvelopeIntegration.f9878a.m5330a(interfaceC1389c1, sentryAndroidOptions);
                                }
/* 461 */                       InterfaceC1631q0 interfaceC1631q0 = sendCachedEnvelopeIntegration.f9881d;
/* 463 */                       if (interfaceC1631q0 != null && interfaceC1631q0.mo4835r0() == EnumC1570o0.DISCONNECTED) {
/* 483 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
/* 548 */                           return;
                                }
/* 487 */                       C1690p c1690pMo5084d = interfaceC1389c1.mo5084d();
/* 491 */                       if (c1690pMo5084d != null && c1690pMo5084d.m5428f(EnumC1560n.All)) {
/* 511 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
/* 548 */                           return;
                                }
/* 515 */                       fk2 fk2Var = sendCachedEnvelopeIntegration.f9884i;
/* 517 */                       if (fk2Var == null) {
/* 529 */                           sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
/* 548 */                           return;
                                } else {
/* 533 */                           fk2Var.m3771a();
/* 548 */                           return;
                                }
                            } catch (Throwable th) {
/* 545 */                       sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed trying to send cached events.", th);
/* 548 */                       return;
                            }
                        case 1:
/* 360 */                   C1181d c1181d = (C1181d) this.f10023b;
/* 364 */                   Runnable runnable = (Runnable) this.f10024c;
/* 368 */                   String str = (String) this.f10025d;
                            try {
/* 370 */                       runnable.run();
/* 397 */                       return;
                            } catch (Throwable unused) {
/* 374 */                       if (str != null) {
/* 394 */                           ((SentryAndroidOptions) c1181d.f9986c).getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to execute ".concat(str), new Object[0]);
/* 397 */                           return;
                                }
/* 397 */                       return;
                            }
                        case 2:
/* 234 */                   C1193h c1193h = (C1193h) this.f10023b;
/* 239 */                   C1554m6 c1554m6 = (C1554m6) this.f10024c;
/* 243 */                   InterfaceC1389c1 interfaceC1389c2 = (InterfaceC1389c1) this.f10025d;
/* 245 */                   ArrayList<C1564n3> arrayList = c1193h.f10029X;
/* 253 */                   if (c1193h.f10033a0.get()) {
/* 348 */                       return;
                            }
/* 262 */                   ArrayList arrayList2 = new ArrayList(arrayList.size());
/* 265 */                   C1702a c1702a = c1193h.f10045h0;
/* 267 */                   c1702a.m5443c();
                            try {
/* 278 */                       for (C1564n3 c1564n3 : arrayList) {
/* 315 */                           arrayList2.add(new C1573o3(c1564n3.f11158a, c1564n3.f11159b, c1564n3.f11161d, c1564n3.f11160c, Double.valueOf(c1564n3.f11162e), c1564n3.f11163f, c1554m6));
                                }
/* 322 */                       arrayList.clear();
/* 325 */                       c1702a.close();
/* 328 */                       Iterator it = arrayList2.iterator();
/* 336 */                       while (it.hasNext()) {
/* 344 */                           interfaceC1389c2.mo5090j((C1573o3) it.next());
                                }
/* 348 */                       return;
                            } catch (Throwable th2) {
                                try {
/* 349 */                           c1702a.close();
/* 357 */                           throw th2;
                                } catch (Throwable th3) {
/* 354 */                           th2.addSuppressed(th3);
/* 357 */                           throw th2;
                                }
                            }
                        case 3:
/* 193 */                   EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.f10023b;
/* 197 */                   SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.f10024c;
/* 201 */                   String str2 = (String) this.f10025d;
/* 203 */                   C1702a c1702a2 = envelopeFileObserverIntegration.f9859d;
/* 205 */                   c1702a2.m5443c();
                            try {
/* 210 */                       if (!envelopeFileObserverIntegration.f9858c) {
/* 212 */                           envelopeFileObserverIntegration.m4751c(sentryAndroidOptions2, str2);
                                    break;
                                }
/* 219 */                       c1702a2.close();
/* 222 */                       return;
                            } catch (Throwable th4) {
                                try {
/* 223 */                           c1702a2.close();
/* 231 */                           throw th4;
                                } catch (Throwable th5) {
/* 228 */                           th4.addSuppressed(th5);
/* 231 */                           throw th4;
                                }
                            }
                        default:
/* 10 */                    SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.f10023b;
/* 14 */                    InterfaceC1389c1 interfaceC1389c3 = (InterfaceC1389c1) this.f10025d;
/* 18 */                    SentryAndroidOptions sentryAndroidOptions3 = (SentryAndroidOptions) this.f10024c;
/* 20 */                    C1702a c1702a3 = systemEventsBreadcrumbsIntegration.f9895V;
/* 22 */                    c1702a3.m5443c();
                            try {
/* 27 */                        if (!systemEventsBreadcrumbsIntegration.f9902f && !systemEventsBreadcrumbsIntegration.f9903i && systemEventsBreadcrumbsIntegration.f9898b == null) {
/* 44 */                            systemEventsBreadcrumbsIntegration.f9898b = new C1282w1(systemEventsBreadcrumbsIntegration, interfaceC1389c3, sentryAndroidOptions3);
/* 48 */                            if (systemEventsBreadcrumbsIntegration.f9904v == null) {
/* 55 */                                systemEventsBreadcrumbsIntegration.f9904v = new IntentFilter();
/* 61 */                                for (String str3 : systemEventsBreadcrumbsIntegration.f9901e) {
/* 67 */                                    systemEventsBreadcrumbsIntegration.f9904v.addAction(str3);
                                        }
                                    }
/* 78 */                            if (systemEventsBreadcrumbsIntegration.f9905w == null) {
/* 89 */                                systemEventsBreadcrumbsIntegration.f9905w = new HandlerThread("SystemEventsReceiver", 10);
/* 93 */                                systemEventsBreadcrumbsIntegration.f9905w.start();
                                    }
                                    try {
/* 104 */                               Handler handler = new Handler(systemEventsBreadcrumbsIntegration.f9905w.getLooper());
/* 107 */                               Context context = systemEventsBreadcrumbsIntegration.f9897a;
/* 109 */                               C1282w1 c1282w1 = systemEventsBreadcrumbsIntegration.f9898b;
/* 111 */                               IntentFilter intentFilter = systemEventsBreadcrumbsIntegration.f9904v;
/* 119 */                               AbstractC1704c.m5462q(sentryAndroidOptions3.getLogger(), "The ILogger object is required.");
/* 126 */                               if (Build.VERSION.SDK_INT >= 33) {
/* 7 */                                     context.registerReceiver(c1282w1, intentFilter, null, handler, 4);
                                        } else {
/* 133 */                                   context.registerReceiver(c1282w1, intentFilter, null, handler);
                                        }
/* 142 */                               if (!systemEventsBreadcrumbsIntegration.f9894U.getAndSet(true)) {
/* 154 */                                   sentryAndroidOptions3.getLogger().mo4672k(EnumC1553m5.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
/* 159 */                                   AbstractC1704c.m5446a("SystemEventsBreadcrumbs");
                                        }
                                    } catch (Throwable th6) {
/* 164 */                               sentryAndroidOptions3.setEnableSystemEventBreadcrumbs(false);
/* 175 */                               sentryAndroidOptions3.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th6);
                                    }
                                    break;
                                }
/* 178 */                       c1702a3.close();
/* 181 */                       return;
                            } catch (Throwable th7) {
                                try {
/* 182 */                           c1702a3.close();
/* 190 */                           throw th7;
                                } catch (Throwable th8) {
/* 187 */                           th7.addSuppressed(th8);
/* 190 */                           throw th7;
                                }
                            }
                    }
                }

/* 13 */        public /* synthetic */ RunnableC1192g1(int i, Object obj, Object obj2, Object obj3) {
/* 14 */            this.f10022a = i;
                    this.f10023b = obj;
                    this.f10024c = obj2;
                    this.f10025d = obj3;
                }
            }
