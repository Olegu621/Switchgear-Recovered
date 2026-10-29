            package io.sentry.android.core;

            import android.app.Activity;
            import android.app.Application;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.SystemClock;
            import android.util.SparseIntArray;
            import androidx.core.app.FrameMetricsAggregator;
            import io.sentry.AbstractC1672t4;
            import io.sentry.C1387c;
            import io.sentry.C1422d;
            import io.sentry.C1430d7;
            import io.sentry.C1439e7;
            import io.sentry.C1447f3;
            import io.sentry.C1465h0;
            import io.sentry.C1469h4;
            import io.sentry.C1522j7;
            import io.sentry.C1531k7;
            import io.sentry.C1644r5;
            import io.sentry.C1671t3;
            import io.sentry.C1674t6;
            import io.sentry.C1697u2;
            import io.sentry.C1700u5;
            import io.sentry.EnumC1392c4;
            import io.sentry.EnumC1451f7;
            import io.sentry.EnumC1517j2;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1640r1;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1525k1;
            import io.sentry.InterfaceC1549m1;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC1223j;
            import io.sentry.android.core.performance.C1253a;
            import io.sentry.android.core.performance.C1254b;
            import io.sentry.android.core.performance.C1257e;
            import io.sentry.android.core.performance.C1259g;
            import io.sentry.android.core.performance.C1260h;
            import io.sentry.android.core.performance.EnumC1258f;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.exception.C1441b;
            import io.sentry.protocol.C1626w;
            import io.sentry.protocol.EnumC1606i0;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1716o;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1708g;
            import java.io.Closeable;
            import java.lang.ref.WeakReference;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.WeakHashMap;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.Future;
            import java.util.concurrent.RejectedExecutionException;
            import p000.C0942g5;
            import p000.C2076pn;
            import p000.C2357x6;
            import p000.f72;
            import p000.ji1;
            import p000.ur3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ActivityLifecycleIntegration implements InterfaceC1661s1, Closeable, Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: U */
                public InterfaceC1525k1 f9818U;

                /* JADX INFO: renamed from: V */
                public InterfaceC1549m1 f9819V;

                /* JADX INFO: renamed from: a */
                public final Application f9824a;

                /* JADX INFO: renamed from: b */
                public final C1248o0 f9826b;

                /* JADX INFO: renamed from: c */
                public C1469h4 f9828c;

                /* JADX INFO: renamed from: c0 */
                public final C1181d f9829c0;

                /* JADX INFO: renamed from: d */
                public SentryAndroidOptions f9830d;

                /* JADX INFO: renamed from: i */
                public final boolean f9835i;

                /* JADX INFO: renamed from: e */
                public boolean f9832e = false;

                /* JADX INFO: renamed from: f */
                public boolean f9834f = false;

                /* JADX INFO: renamed from: v */
                public boolean f9836v = false;

                /* JADX INFO: renamed from: w */
                public C1465h0 f9837w = null;

                /* JADX INFO: renamed from: W */
                public final WeakHashMap f9820W = new WeakHashMap();

                /* JADX INFO: renamed from: X */
                public final WeakHashMap f9821X = new WeakHashMap();

                /* JADX INFO: renamed from: Y */
                public final WeakHashMap f9822Y = new WeakHashMap();

                /* JADX INFO: renamed from: Z */
                public AbstractC1672t4 f9823Z = new C1700u5(0, 0);

                /* JADX INFO: renamed from: a0 */
                public Future f9825a0 = null;

                /* JADX INFO: renamed from: b0 */
                public final WeakHashMap f9827b0 = new WeakHashMap();

                /* JADX INFO: renamed from: d0 */
                public final C1702a f9831d0 = new C1702a();

                /* JADX INFO: renamed from: e0 */
                public final C1702a f9833e0 = new C1702a();

                public ActivityLifecycleIntegration(Application application, C1248o0 c1248o0, C1181d c1181d) {
/* 67 */            this.f9824a = application;
/* 69 */            this.f9826b = c1248o0;
/* 71 */            this.f9829c0 = c1181d;
/* 77 */            if (Build.VERSION.SDK_INT >= 29) {
/* 80 */                this.f9835i = true;
                    }
                }

                /* JADX INFO: renamed from: f */
                public static void m4743f(InterfaceC1525k1 interfaceC1525k1, InterfaceC1525k1 interfaceC1525k2) {
/* 1 */             if (interfaceC1525k1 == null || interfaceC1525k1.mo4728d()) {
/* 67 */                return;
                    }
/* 10 */            String description = interfaceC1525k1.getDescription();
/* 16 */            if (description == null || !description.endsWith(" - Deadline Exceeded")) {
/* 40 */                description = interfaceC1525k1.getDescription() + " - Deadline Exceeded";
                    }
/* 44 */            interfaceC1525k1.mo4734o(description);
/* 54 */            AbstractC1672t4 abstractC1672t4Mo4738t = interfaceC1525k2 != null ? interfaceC1525k2.mo4738t() : null;
/* 55 */            if (abstractC1672t4Mo4738t == null) {
/* 58 */                abstractC1672t4Mo4738t = interfaceC1525k1.mo4741w();
                    }
/* 64 */            m4744g(interfaceC1525k1, abstractC1672t4Mo4738t, EnumC1451f7.DEADLINE_EXCEEDED);
                }

                /* JADX INFO: renamed from: g */
                public static void m4744g(InterfaceC1525k1 interfaceC1525k1, AbstractC1672t4 abstractC1672t4, EnumC1451f7 enumC1451f7) {
/* 1 */             if (interfaceC1525k1 == null || interfaceC1525k1.mo4728d()) {
/* 28 */                return;
                    }
/* 9 */             if (enumC1451f7 == null) {
/* 23 */                enumC1451f7 = interfaceC1525k1.getStatus() != null ? interfaceC1525k1.getStatus() : EnumC1451f7.OK;
                    }
/* 25 */            interfaceC1525k1.mo4740v(enumC1451f7, abstractC1672t4);
                }

                /* JADX INFO: renamed from: c */
                public final void m4745c(AbstractC1672t4 abstractC1672t4) {
                    long jM4915a;
/* 2 */             if (abstractC1672t4 == null) {
/* 11 */                C1260h c1260hM4911b = C1259g.m4907c().m4911b(this.f9830d);
/* 19 */                if (c1260hM4911b.m4919e()) {
/* 27 */                    if (c1260hM4911b.m4918d()) {
/* 35 */                        jM4915a = c1260hM4911b.m4915a() + c1260hM4911b.f10282b;
                            } else {
/* 37 */                        jM4915a = 0;
                            }
/* 43 */                    abstractC1672t4 = new C1644r5(jM4915a * 1000000);
                        } else {
/* 48 */                    abstractC1672t4 = null;
                        }
                    }
/* 51 */            if (!this.f9832e || abstractC1672t4 == null) {
/* 93 */                return;
                    }
/* 57 */            m4744g(this.f9818U, abstractC1672t4, null);
/* 60 */            InterfaceC1549m1 interfaceC1549m1 = this.f9819V;
/* 62 */            if (interfaceC1549m1 != null && !interfaceC1549m1.mo4728d()) {
/* 74 */                this.f9819V.mo4740v(EnumC1451f7.OK, abstractC1672t4);
                    }
/* 85 */            C1702a c1702a = (C1702a) C1259g.m4907c().f10278i0.f10226a;
/* 87 */            c1702a.m5443c();
/* 90 */            c1702a.close();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 3 */             this.f9824a.unregisterActivityLifecycleCallbacks(this);
/* 6 */             C1259g c1259gM4907c = C1259g.m4907c();
/* 11 */            c1259gM4907c.f10268c0 = null;
/* 17 */            C1702a c1702a = (C1702a) c1259gM4907c.f10278i0.f10226a;
/* 19 */            c1702a.m5443c();
/* 22 */            c1702a.close();
/* 25 */            SentryAndroidOptions sentryAndroidOptions = this.f9830d;
/* 27 */            if (sentryAndroidOptions != null) {
/* 40 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
                    }
/* 43 */            C1181d c1181d = this.f9829c0;
/* 47 */            C1702a c1702a2 = (C1702a) c1181d.f9990g;
/* 49 */            c1702a2.m5443c();
                    try {
/* 56 */                if (c1181d.m4780e()) {
/* 67 */                    c1181d.m4782g(new f72(c1181d, 17), "FrameMetricsAggregator.stop");
/* 80 */                    ur3 ur3Var = ((FrameMetricsAggregator) ((C1708g) c1181d.f9984a).m5471a()).f1234a;
/* 82 */                    Object obj = ur3Var.f17704b;
/* 88 */                    ur3Var.f17704b = new SparseIntArray[9];
                        }
/* 97 */                ((ConcurrentHashMap) c1181d.f9987d).clear();
/* 100 */               c1702a2.close();
                    } catch (Throwable th) {
                        try {
/* 104 */                   c1702a2.close();
                        } catch (Throwable th2) {
/* 109 */                   th.addSuppressed(th2);
                        }
/* 112 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m4746h(InterfaceC1549m1 interfaceC1549m1, InterfaceC1525k1 interfaceC1525k1, InterfaceC1525k1 interfaceC1525k2) {
/* 1 */             if (interfaceC1549m1 == null || interfaceC1549m1.mo4728d()) {
/* 62 */                return;
                    }
/* 10 */            EnumC1451f7 enumC1451f7 = EnumC1451f7.DEADLINE_EXCEEDED;
/* 12 */            if (interfaceC1525k1 != null && !interfaceC1525k1.mo4728d()) {
/* 20 */                interfaceC1525k1.mo4729f(enumC1451f7);
                    }
/* 23 */            m4743f(interfaceC1525k2, interfaceC1525k1);
/* 26 */            Future future = this.f9825a0;
/* 28 */            if (future != null) {
/* 31 */                future.cancel(false);
/* 35 */                this.f9825a0 = null;
                    }
/* 37 */            EnumC1451f7 status = interfaceC1549m1.getStatus();
/* 41 */            if (status == null) {
/* 43 */                status = EnumC1451f7.OK;
                    }
/* 45 */            interfaceC1549m1.mo4729f(status);
/* 48 */            C1469h4 c1469h4 = this.f9828c;
/* 50 */            if (c1469h4 != null) {
/* 59 */                c1469h4.mo5098r(new C2357x6(27, this, interfaceC1549m1));
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m4747i(InterfaceC1525k1 interfaceC1525k1, InterfaceC1525k1 interfaceC1525k2) {
/* 1 */             C1259g c1259gM4907c = C1259g.m4907c();
/* 5 */             C1260h c1260h = c1259gM4907c.f10269d;
/* 7 */             C1260h c1260h2 = c1259gM4907c.f10271e;
/* 9 */             SentryAndroidOptions sentryAndroidOptions = this.f9830d;
/* 23 */            AbstractC1672t4 abstractC1672t4Mo4856a = sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().mo4856a() : null;
/* 31 */            if (c1260h.m4918d() && c1260h.m4917c()) {
/* 39 */                C1644r5 c1644r5M4916b = c1260h.m4916b();
/* 43 */                if (abstractC1672t4Mo4856a == null || c1644r5M4916b == null) {
/* 62 */                    c1260h.f10284d = SystemClock.uptimeMillis();
                        } else {
/* 55 */                    c1260h.f10284d = c1260h.f10283c + (abstractC1672t4Mo4856a.mo5412b(c1644r5M4916b) / 1000000);
                        }
                    }
/* 68 */            if (c1260h2.m4918d() && c1260h2.m4917c()) {
/* 76 */                C1644r5 c1644r5M4916b2 = c1260h2.m4916b();
/* 80 */                if (abstractC1672t4Mo4856a == null || c1644r5M4916b2 == null) {
/* 99 */                    c1260h2.f10284d = SystemClock.uptimeMillis();
                        } else {
/* 92 */                    c1260h2.f10284d = c1260h2.f10283c + (abstractC1672t4Mo4856a.mo5412b(c1644r5M4916b2) / 1000000);
                        }
                    }
/* 101 */           m4745c(abstractC1672t4Mo4856a);
/* 104 */           C1702a c1702a = this.f9833e0;
/* 106 */           c1702a.m5443c();
                    try {
/* 111 */               if (this.f9830d != null && interfaceC1525k2 != null && abstractC1672t4Mo4856a != null) {
/* 134 */                   interfaceC1525k2.mo4736r("time_to_initial_display", Long.valueOf(abstractC1672t4Mo4856a.mo5412b(interfaceC1525k2.mo4741w()) / 1000000), EnumC1517j2.MILLISECOND);
/* 137 */                   m4744g(interfaceC1525k2, abstractC1672t4Mo4856a, null);
                        } else if (interfaceC1525k2 != null && !interfaceC1525k2.mo4728d()) {
/* 151 */                   interfaceC1525k2.mo4731i();
                        }
/* 154 */               c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 158 */                   c1702a.close();
                        } catch (Throwable th2) {
/* 163 */                   th.addSuppressed(th2);
                        }
/* 166 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: k */
                public final void m4748k(Activity activity) {
                    WeakHashMap weakHashMap;
                    WeakHashMap weakHashMap2;
                    Boolean boolValueOf;
                    C1644r5 c1644r5;
                    AbstractC1672t4 abstractC1672t4;
                    C1671t3 c1671t3;
                    Boolean bool;
                    C1644r5 c1644r6;
                    String strM5414a;
                    AbstractC1672t4 abstractC1672t5;
                    String str;
                    SentryAndroidOptions sentryAndroidOptions;
                    AbstractC1672t4 abstractC1672t6;
                    C1671t3 c1671t4;
                    C1671t3 c1671t5;
                    C1522j7 c1522j7;
                    C1387c c1387cM5073a;
                    C1439e7 c1439e7;
                    InterfaceC1549m1 interfaceC1549m1;
/* 7 */             WeakReference weakReference = new WeakReference(activity);
/* 12 */            if (this.f9828c != null) {
/* 14 */                WeakHashMap weakHashMap3 = this.f9827b0;
/* 20 */                if (weakHashMap3.containsKey(activity)) {
/* 828 */                   return;
                        }
/* 24 */                if (!this.f9832e) {
/* 28 */                    weakHashMap3.put(activity, C1447f3.f10939a);
/* 37 */                    if (this.f9830d.isEnableAutoTraceIdGeneration()) {
/* 48 */                        this.f9828c.mo5098r(new C1697u2(22));
/* 51 */                        return;
                            }
/* 828 */                   return;
                        }
/* 56 */                Iterator it = weakHashMap3.entrySet().iterator();
                        while (true) {
/* 60 */                    boolean zHasNext = it.hasNext();
/* 64 */                    weakHashMap = this.f9821X;
/* 66 */                    weakHashMap2 = this.f9820W;
/* 68 */                    if (!zHasNext) {
                                break;
                            }
/* 74 */                    Map.Entry entry = (Map.Entry) it.next();
/* 102 */                   m4746h((InterfaceC1549m1) entry.getValue(), (InterfaceC1525k1) weakHashMap2.get(entry.getKey()), (InterfaceC1525k1) weakHashMap.get(entry.getKey()));
                        }
/* 110 */               String simpleName = activity.getClass().getSimpleName();
/* 120 */               C1260h c1260hM4911b = C1259g.m4907c().m4911b(this.f9830d);
/* 130 */               if (AbstractC1245n0.m4882j() && c1260hM4911b.m4918d()) {
/* 138 */                   C1644r5 c1644r5M4916b = c1260hM4911b.m4916b();
/* 155 */                   boolValueOf = Boolean.valueOf(C1259g.m4907c().f10263a == EnumC1258f.COLD);
/* 159 */                   c1644r5 = c1644r5M4916b;
                        } else {
/* 161 */                   boolValueOf = null;
/* 162 */                   c1644r5 = null;
                        }
/* 165 */               C1531k7 c1531k7 = new C1531k7();
/* 170 */               long deadlineTimeout = this.f9830d.getDeadlineTimeout();
/* 186 */               c1531k7.f11097h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
/* 194 */               if (this.f9830d.isEnableActivityLifecycleTracingAutoFinish()) {
/* 202 */                   c1531k7.f11096g = this.f9830d.getIdleTimeout();
/* 204 */                   c1531k7.f10918c = true;
                        }
/* 206 */               c1531k7.f11095f = true;
/* 213 */               c1531k7.f11098i = new C1184e(this, weakReference, simpleName);
/* 217 */               if (this.f9836v || c1644r5 == null || boolValueOf == null) {
/* 238 */                   abstractC1672t4 = this.f9823Z;
/* 241 */                   c1671t3 = null;
                        } else {
/* 227 */                   C1671t3 c1671t6 = C1259g.m4907c().f10258V;
/* 233 */                   C1259g.m4907c().f10258V = null;
/* 235 */                   c1671t3 = c1671t6;
/* 236 */                   abstractC1672t4 = c1644r5;
                        }
/* 242 */               c1531k7.f10916a = abstractC1672t4;
/* 249 */               c1531k7.f11094e = c1671t3 != null;
/* 253 */               c1531k7.f10919d = "auto.ui.activity";
/* 263 */               C1702a c1702a = (C1702a) C1259g.m4907c().f10278i0.f10226a;
/* 265 */               c1702a.m5443c();
/* 268 */               c1702a.close();
/* 282 */               boolean z = C1259g.m4907c().f10270d0 != null;
/* 295 */               boolean z2 = (this.f9836v || c1644r5 == null || boolValueOf == null) ? false : true;
/* 312 */               boolean z3 = z2 && this.f9830d.isEnableStandaloneAppStartTracing() && !z;
/* 314 */               if (z3) {
/* 318 */                   C1531k7 c1531k8 = new C1531k7();
/* 323 */                   c1531k8.f10917b = EnumC1392c4.OFF;
/* 325 */                   c1531k8.f10916a = c1644r5;
/* 332 */                   c1531k8.f11094e = c1671t3 != null;
/* 336 */                   c1531k8.f10919d = "auto.app.start";
/* 344 */                   bool = boolValueOf;
/* 348 */                   c1644r6 = c1644r5;
/* 355 */                   InterfaceC1549m1 interfaceC1549m1Mo5097q = this.f9828c.mo5097q(new C1522j7("App Start", EnumC1606i0.COMPONENT, "app.start", c1671t3), c1531k8);
/* 359 */                   this.f9819V = interfaceC1549m1Mo5097q;
/* 363 */                   interfaceC1549m1Mo5097q.mo4732j(simpleName, "app.vitals.start.screen");
/* 370 */                   String strM4910a = C1259g.m4907c().m4910a();
/* 374 */                   if (strM4910a != null) {
/* 380 */                       this.f9819V.mo4732j(strM4910a, "app.vitals.start.reason");
                            }
                        } else {
/* 384 */                   bool = boolValueOf;
/* 386 */                   c1644r6 = c1644r5;
                        }
/* 388 */               if (z3) {
/* 396 */                   strM5414a = this.f9819V.mo4726b().m5414a();
/* 402 */                   C1422d c1422dMo5248k = this.f9819V.mo5248k();
/* 450 */                   str = c1422dMo5248k == null ? null : c1422dMo5248k.f10847a;
                        } else if (!z || ((abstractC1672t5 = C1259g.m4907c().f10275g0) != null && abstractC1672t4.mo5412b(abstractC1672t5) > 60000000000L)) {
/* 449 */                   strM5414a = null;
                        } else {
/* 440 */                   strM5414a = C1259g.m4907c().f10272e0;
/* 446 */                   str = C1259g.m4907c().f10274f0;
                        }
/* 453 */               if (strM5414a == null || (sentryAndroidOptions = this.f9830d) == null || !sentryAndroidOptions.isTracingEnabled()) {
/* 455 */                   abstractC1672t6 = abstractC1672t4;
/* 457 */                   c1522j7 = null;
                        } else {
/* 473 */                   ILogger logger = this.f9830d.getLogger();
/* 481 */                   List listSingletonList = str == null ? null : Collections.singletonList(str);
/* 485 */                   SentryAndroidOptions sentryAndroidOptions2 = this.f9830d;
                            try {
/* 489 */                       C1674t6 c1674t6 = new C1674t6(strM5414a);
/* 492 */                       if (listSingletonList != null) {
/* 494 */                           C0942g5 c0942g5 = C1387c.f10770i;
/* 501 */                           c1387cM5073a = C1387c.m5073a(logger, AbstractC1716o.m5485c(listSingletonList), false);
/* 505 */                           abstractC1672t6 = abstractC1672t4;
                                } else {
/* 508 */                           abstractC1672t6 = abstractC1672t4;
                                    try {
/* 512 */                               c1387cM5073a = C1387c.m5073a(logger, null, false);
                                    } catch (C1441b e) {
/* 521 */                               e = e;
/* 538 */                               logger.mo4670b(EnumC1553m5.DEBUG, e, "Failed to parse Sentry trace header: %s", e.getMessage());
/* 543 */                               c1671t4 = new C1671t3();
                                    }
                                }
/* 516 */                       c1671t4 = C1671t3.m5410a(c1674t6, c1387cM5073a, sentryAndroidOptions2);
                            } catch (C1441b e2) {
/* 523 */                       e = e2;
/* 524 */                       abstractC1672t6 = abstractC1672t4;
                            }
/* 548 */                   Boolean bool2 = (Boolean) c1671t4.f11667a;
/* 552 */                   C1387c c1387c = (C1387c) c1671t4.f11671e;
/* 554 */                   if (bool2 == null) {
/* 556 */                       c1671t5 = null;
                            } else {
/* 561 */                       Double d = c1387c.f10773c;
/* 563 */                       Double d2 = c1387c.f10774d;
/* 578 */                       c1671t5 = new C1671t3(bool2, d, Double.valueOf(d2 == null ? 0.0d : d2.doubleValue()));
                            }
/* 601 */                   c1522j7 = new C1522j7((C1626w) c1671t4.f11668b, (C1430d7) c1671t4.f11669c, null, c1671t5, c1387c);
/* 606 */                   c1522j7.f11073a0 = simpleName;
/* 610 */                   c1522j7.f11074b0 = EnumC1606i0.COMPONENT;
/* 612 */                   c1522j7.f10759e = "ui.load";
                        }
/* 614 */               C1469h4 c1469h4 = this.f9828c;
/* 631 */               InterfaceC1549m1 interfaceC1549m1Mo5097q2 = c1522j7 != null ? c1469h4.mo5097q(c1522j7, c1531k7) : c1469h4.mo5097q(new C1522j7(simpleName, EnumC1606i0.COMPONENT, "ui.load", c1671t3), c1531k7);
/* 636 */               if (z) {
/* 644 */                   C1259g.m4907c().f10270d0 = null;
/* 650 */                   C1259g.m4907c().f10272e0 = null;
/* 656 */                   C1259g.m4907c().f10274f0 = null;
                        }
/* 660 */               C1439e7 c1439e8 = new C1439e7();
/* 663 */               c1439e8.f10919d = "auto.ui.activity";
/* 665 */               if (!z2 || z3 || this.f9830d.isEnableStandaloneAppStartTracing()) {
/* 724 */                   c1439e7 = c1439e8;
                        } else {
/* 687 */                   String str2 = bool.booleanValue() ? "app.start.cold" : "app.start.warm";
/* 700 */                   String str3 = bool.booleanValue() ? "Cold Start" : "Warm Start";
/* 715 */                   c1439e7 = c1439e8;
/* 717 */                   this.f9818U = interfaceC1549m1Mo5097q2.mo4733n(str2, str3, c1644r6, EnumC1640r1.SENTRY, c1439e8);
/* 720 */                   m4745c(null);
                        }
/* 730 */               String strConcat = simpleName.concat(" initial display");
/* 734 */               AbstractC1672t4 abstractC1672t7 = abstractC1672t6;
/* 736 */               EnumC1640r1 enumC1640r1 = EnumC1640r1.SENTRY;
/* 740 */               InterfaceC1525k1 interfaceC1525k1Mo4733n = interfaceC1549m1Mo5097q2.mo4733n("ui.load.initial_display", strConcat, abstractC1672t7, enumC1640r1, c1439e7);
/* 744 */               weakHashMap2.put(activity, interfaceC1525k1Mo4733n);
/* 749 */               if (!this.f9834f || this.f9837w == null || this.f9830d == null) {
/* 811 */                   interfaceC1549m1 = interfaceC1549m1Mo5097q2;
                        } else {
/* 767 */                   InterfaceC1525k1 interfaceC1525k1Mo4733n2 = interfaceC1549m1Mo5097q2.mo4733n("ui.load.full_display", simpleName.concat(" full display"), abstractC1672t7, enumC1640r1, c1439e7);
/* 771 */                   interfaceC1549m1 = interfaceC1549m1Mo5097q2;
                            try {
/* 773 */                       weakHashMap.put(activity, interfaceC1525k1Mo4733n2);
/* 793 */                       this.f9825a0 = this.f9830d.getExecutorService().mo4714b(new ji1(this, interfaceC1525k1Mo4733n2, interfaceC1525k1Mo4733n), 25000L);
                            } catch (RejectedExecutionException e3) {
/* 807 */                       this.f9830d.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e3);
                            }
                        }
/* 822 */               this.f9828c.mo5098r(new C2076pn(21, this, interfaceC1549m1));
/* 825 */               weakHashMap3.put(activity, interfaceC1549m1);
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             C1469h4 c1469h4 = C1469h4.f10976a;
/* 3 */             this.f9830d = sentryAndroidOptions;
/* 5 */             this.f9828c = c1469h4;
/* 24 */            this.f9832e = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
/* 32 */            this.f9837w = this.f9830d.getFullyDisplayedReporter();
/* 40 */            this.f9834f = this.f9830d.isEnableTimeToFullDisplayTracing();
/* 44 */            this.f9824a.registerActivityLifecycleCallbacks(this);
/* 49 */            if (this.f9832e && this.f9830d.isEnableStandaloneAppStartTracing()) {
/* 59 */                C1259g c1259gM4907c = C1259g.m4907c();
/* 70 */                c1259gM4907c.f10268c0 = new C2357x6(this, 25);
/* 74 */                if (c1259gM4907c.f10259W && c1259gM4907c.f10261Y.get() == 0 && !c1259gM4907c.f10262Z.get() && c1259gM4907c.f10264a0.compareAndSet(false, true)) {
/* 114 */                   Looper.getMainLooper().getQueue().addIdleHandler(new C1257e(c1259gM4907c));
                        }
/* 121 */               C1702a c1702a = (C1702a) c1259gM4907c.f10278i0.f10226a;
/* 123 */               c1702a.m5443c();
/* 126 */               c1702a.close();
/* 131 */               AbstractC1704c.m5446a("StandaloneAppStart");
                    }
/* 146 */           this.f9830d.getLogger().mo4672k(EnumC1553m5.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
/* 151 */           AbstractC1704c.m5446a("ActivityLifecycle");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    C1465h0 c1465h0;
                    SentryAndroidOptions sentryAndroidOptions;
/* 3 */             if (!this.f9835i) {
/* 5 */                 onActivityPreCreated(activity, bundle);
                    }
/* 8 */             C1702a c1702a = this.f9831d0;
/* 10 */            c1702a.m5443c();
                    try {
/* 15 */                if (this.f9828c != null && (sentryAndroidOptions = this.f9830d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
/* 40 */                    this.f9828c.mo5098r(new C2357x6(AbstractC1417a.m5173k(activity), 26));
                        }
/* 46 */                m4748k(activity);
/* 55 */                InterfaceC1525k1 interfaceC1525k1 = (InterfaceC1525k1) this.f9820W.get(activity);
/* 63 */                InterfaceC1525k1 interfaceC1525k2 = (InterfaceC1525k1) this.f9821X.get(activity);
/* 66 */                this.f9836v = true;
/* 70 */                if (this.f9832e && interfaceC1525k1 != null && interfaceC1525k2 != null && (c1465h0 = this.f9837w) != null) {
/* 89 */                    c1465h0.f10971a.add(new C1697u2(9));
                        }
/* 92 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 96 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 101 */                   th.addSuppressed(th2);
                        }
/* 104 */               throw th;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
/* 1 */             WeakHashMap weakHashMap = this.f9821X;
/* 3 */             WeakHashMap weakHashMap2 = this.f9820W;
/* 5 */             WeakHashMap weakHashMap3 = this.f9822Y;
/* 7 */             C1702a c1702a = this.f9831d0;
/* 9 */             c1702a.m5443c();
                    try {
/* 16 */                C1253a c1253a = (C1253a) weakHashMap3.remove(activity);
/* 19 */                if (c1253a != null) {
/* 21 */                    InterfaceC1525k1 interfaceC1525k1 = c1253a.f10247d;
/* 23 */                    if (interfaceC1525k1 != null && !interfaceC1525k1.mo4728d()) {
/* 35 */                        c1253a.f10247d.mo4729f(EnumC1451f7.CANCELLED);
                            }
/* 38 */                    c1253a.f10247d = null;
/* 40 */                    InterfaceC1525k1 interfaceC1525k2 = c1253a.f10248e;
/* 42 */                    if (interfaceC1525k2 != null && !interfaceC1525k2.mo4728d()) {
/* 54 */                        c1253a.f10248e.mo4729f(EnumC1451f7.CANCELLED);
                            }
/* 57 */                    c1253a.f10248e = null;
                        }
/* 59 */                boolean z = this.f9832e;
/* 62 */                WeakHashMap weakHashMap4 = this.f9827b0;
/* 64 */                if (z) {
/* 66 */                    InterfaceC1525k1 interfaceC1525k3 = this.f9818U;
/* 68 */                    EnumC1451f7 enumC1451f7 = EnumC1451f7.CANCELLED;
/* 70 */                    if (interfaceC1525k3 != null && !interfaceC1525k3.mo4728d()) {
/* 78 */                        interfaceC1525k3.mo4729f(enumC1451f7);
                            }
/* 81 */                    InterfaceC1549m1 interfaceC1549m1 = this.f9819V;
/* 83 */                    if (interfaceC1549m1 != null && !interfaceC1549m1.mo4728d()) {
/* 93 */                        this.f9819V.mo4729f(enumC1451f7);
                            }
/* 103 */                   InterfaceC1525k1 interfaceC1525k4 = (InterfaceC1525k1) weakHashMap2.get(activity);
/* 109 */                   InterfaceC1525k1 interfaceC1525k5 = (InterfaceC1525k1) weakHashMap.get(activity);
/* 111 */                   EnumC1451f7 enumC1451f8 = EnumC1451f7.DEADLINE_EXCEEDED;
/* 113 */                   if (interfaceC1525k4 != null && !interfaceC1525k4.mo4728d()) {
/* 121 */                       interfaceC1525k4.mo4729f(enumC1451f8);
                            }
/* 124 */                   m4743f(interfaceC1525k5, interfaceC1525k4);
/* 127 */                   Future future = this.f9825a0;
/* 129 */                   if (future != null) {
/* 131 */                       future.cancel(false);
/* 134 */                       this.f9825a0 = null;
                            }
/* 138 */                   if (this.f9832e) {
/* 146 */                       m4746h((InterfaceC1549m1) weakHashMap4.get(activity), null, null);
                            }
/* 149 */                   this.f9818U = null;
/* 151 */                   this.f9819V = null;
/* 153 */                   weakHashMap2.remove(activity);
/* 156 */                   weakHashMap.remove(activity);
                        }
/* 159 */               weakHashMap4.remove(activity);
/* 166 */               if (weakHashMap4.isEmpty() && !activity.isChangingConfigurations()) {
/* 174 */                   this.f9836v = false;
/* 183 */                   this.f9823Z = new C1700u5(0L, 0L);
/* 185 */                   weakHashMap3.clear();
                        }
/* 188 */               c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 192 */                   c1702a.close();
                        } catch (Throwable th2) {
/* 197 */                   th.addSuppressed(th2);
                        }
/* 200 */               throw th;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
/* 1 */             C1702a c1702a = this.f9831d0;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 if (!this.f9835i) {
/* 10 */                    onActivityPrePaused(activity);
                        }
/* 16 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 20 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 25 */                    th.addSuppressed(th2);
                        }
/* 28 */                throw th;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPostCreated(Activity activity, Bundle bundle) {
/* 7 */             C1253a c1253a = (C1253a) this.f9822Y.get(activity);
/* 9 */             if (c1253a != null) {
/* 11 */                InterfaceC1525k1 interfaceC1525k1 = this.f9819V;
/* 13 */                if (interfaceC1525k1 == null && (interfaceC1525k1 = this.f9818U) == null) {
/* 28 */                    interfaceC1525k1 = (InterfaceC1525k1) this.f9827b0.get(activity);
                        }
/* 32 */                if (c1253a.f10245b == null || interfaceC1525k1 == null) {
/* 55 */                    return;
                        }
/* 46 */                InterfaceC1525k1 interfaceC1525k1M4900a = C1253a.m4900a(interfaceC1525k1, c1253a.f10244a.concat(".onCreate"), c1253a.f10245b);
/* 50 */                c1253a.f10247d = interfaceC1525k1M4900a;
/* 52 */                interfaceC1525k1M4900a.mo4731i();
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPostResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPostStarted(Activity activity) {
/* 11 */            C1253a c1253a = (C1253a) this.f9822Y.get(activity);
/* 13 */            if (c1253a != null) {
/* 15 */                InterfaceC1525k1 interfaceC1525k1 = this.f9819V;
/* 17 */                if (interfaceC1525k1 == null && (interfaceC1525k1 = this.f9818U) == null) {
/* 32 */                    interfaceC1525k1 = (InterfaceC1525k1) this.f9827b0.get(activity);
                        }
/* 36 */                if (c1253a.f10246c != null && interfaceC1525k1 != null) {
/* 50 */                    InterfaceC1525k1 interfaceC1525k1M4900a = C1253a.m4900a(interfaceC1525k1, c1253a.f10244a.concat(".onStart"), c1253a.f10246c);
/* 54 */                    c1253a.f10248e = interfaceC1525k1M4900a;
/* 56 */                    interfaceC1525k1M4900a.mo4731i();
                        }
/* 59 */                InterfaceC1525k1 interfaceC1525k2 = c1253a.f10247d;
/* 61 */                if (interfaceC1525k2 != null && c1253a.f10248e != null) {
/* 69 */                    AbstractC1672t4 abstractC1672t4Mo4738t = interfaceC1525k2.mo4738t();
/* 75 */                    AbstractC1672t4 abstractC1672t4Mo4738t2 = c1253a.f10248e.mo4738t();
/* 79 */                    if (abstractC1672t4Mo4738t != null && abstractC1672t4Mo4738t2 != null) {
/* 85 */                        long jUptimeMillis = SystemClock.uptimeMillis();
/* 91 */                        AbstractC1232j.f10206a.getClass();
/* 96 */                        C1700u5 c1700u5 = new C1700u5();
/* 112 */                       long jMo5412b = c1700u5.mo5412b(c1253a.f10247d.mo4741w()) / 1000000;
/* 117 */                       long jMo5412b2 = c1700u5.mo5412b(abstractC1672t4Mo4738t) / 1000000;
/* 128 */                       long jMo5412b3 = c1700u5.mo5412b(c1253a.f10248e.mo4741w()) / 1000000;
/* 133 */                       long jMo5412b4 = c1700u5.mo5412b(abstractC1672t4Mo4738t2) / 1000000;
/* 136 */                       C1254b c1254b = new C1254b();
/* 141 */                       String description = c1253a.f10247d.getDescription();
/* 157 */                       long jMo5278d = c1253a.f10247d.mo4741w().mo5278d() / 1000000;
/* 163 */                       C1260h c1260h = c1254b.f10249a;
/* 165 */                       c1260h.f10281a = description;
/* 167 */                       c1260h.f10282b = jMo5278d;
/* 169 */                       c1260h.f10283c = jUptimeMillis - jMo5412b;
/* 171 */                       c1260h.f10284d = jUptimeMillis - jMo5412b2;
/* 175 */                       String description2 = c1253a.f10248e.getDescription();
/* 189 */                       long jMo5278d2 = c1253a.f10248e.mo4741w().mo5278d() / 1000000;
/* 194 */                       C1260h c1260h2 = c1254b.f10250b;
/* 196 */                       c1260h2.f10281a = description2;
/* 198 */                       c1260h2.f10282b = jMo5278d2;
/* 200 */                       c1260h2.f10283c = jUptimeMillis - jMo5412b3;
/* 202 */                       c1260h2.f10284d = jUptimeMillis - jMo5412b4;
/* 210 */                       C1259g.m4907c().f10279v.add(c1254b);
                            }
                        }
                    }
/* 214 */           m4745c(null);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPreCreated(Activity activity, Bundle bundle) {
                    AbstractC1672t4 c1700u5;
/* 11 */            C1253a c1253a = new C1253a(activity.getClass().getName());
/* 16 */            this.f9822Y.put(activity, c1253a);
/* 21 */            if (this.f9836v) {
/* 23 */                return;
                    }
/* 24 */            C1469h4 c1469h4 = this.f9828c;
/* 26 */            if (c1469h4 != null) {
/* 36 */                c1700u5 = c1469h4.mo5092l().getDateProvider().mo4856a();
                    } else {
/* 43 */                AbstractC1232j.f10206a.getClass();
/* 48 */                c1700u5 = new C1700u5();
                    }
/* 51 */            this.f9823Z = c1700u5;
/* 53 */            c1253a.f10245b = c1700u5;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPrePaused(Activity activity) {
                    AbstractC1672t4 c1700u5;
/* 2 */             this.f9836v = true;
/* 4 */             C1469h4 c1469h4 = this.f9828c;
/* 6 */             if (c1469h4 != null) {
/* 16 */                c1700u5 = c1469h4.mo5092l().getDateProvider().mo4856a();
                    } else {
/* 23 */                AbstractC1232j.f10206a.getClass();
/* 28 */                c1700u5 = new C1700u5();
                    }
/* 31 */            this.f9823Z = c1700u5;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPreStarted(Activity activity) {
                    AbstractC1672t4 c1700u5;
/* 7 */             C1253a c1253a = (C1253a) this.f9822Y.get(activity);
/* 9 */             if (c1253a != null) {
/* 11 */                SentryAndroidOptions sentryAndroidOptions = this.f9830d;
/* 13 */                if (sentryAndroidOptions != null) {
/* 19 */                    c1700u5 = sentryAndroidOptions.getDateProvider().mo4856a();
                        } else {
/* 26 */                    AbstractC1232j.f10206a.getClass();
/* 31 */                    c1700u5 = new C1700u5();
                        }
/* 34 */                c1253a.f10246c = c1700u5;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
/* 1 */             C1702a c1702a = this.f9831d0;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 if (!this.f9835i) {
/* 10 */                    onActivityPostStarted(activity);
                        }
/* 18 */                if (this.f9832e) {
/* 26 */                    final InterfaceC1525k1 interfaceC1525k1 = (InterfaceC1525k1) this.f9820W.get(activity);
/* 34 */                    final InterfaceC1525k1 interfaceC1525k2 = (InterfaceC1525k1) this.f9821X.get(activity);
/* 40 */                    if (activity.getWindow() != null) {
/* 44 */                        final int i = 0;
/* 50 */                        ViewTreeObserverOnDrawListenerC1223j.m4845a(activity, new Runnable(this) { // from class: io.sentry.android.core.f

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ ActivityLifecycleIntegration f10008b;

                                    {
/* 3 */                                 this.f10008b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
/* 1 */                                 int i2 = i;
/* 3 */                                 InterfaceC1525k1 interfaceC1525k3 = interfaceC1525k1;
/* 5 */                                 InterfaceC1525k1 interfaceC1525k4 = interfaceC1525k2;
/* 7 */                                 ActivityLifecycleIntegration activityLifecycleIntegration = this.f10008b;
                                        switch (i2) {
                                            case 0:
/* 16 */                                        activityLifecycleIntegration.m4747i(interfaceC1525k4, interfaceC1525k3);
                                                break;
                                            default:
/* 12 */                                        activityLifecycleIntegration.m4747i(interfaceC1525k4, interfaceC1525k3);
                                                break;
                                        }
                                    }
                                }, this.f9826b);
                            } else {
/* 65 */                        final int i2 = 1;
/* 69 */                        new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.f

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ ActivityLifecycleIntegration f10008b;

                                    {
/* 3 */                                 this.f10008b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
/* 1 */                                 int i3 = i2;
/* 3 */                                 InterfaceC1525k1 interfaceC1525k3 = interfaceC1525k1;
/* 5 */                                 InterfaceC1525k1 interfaceC1525k4 = interfaceC1525k2;
/* 7 */                                 ActivityLifecycleIntegration activityLifecycleIntegration = this.f10008b;
                                        switch (i3) {
                                            case 0:
/* 16 */                                        activityLifecycleIntegration.m4747i(interfaceC1525k4, interfaceC1525k3);
                                                break;
                                            default:
/* 12 */                                        activityLifecycleIntegration.m4747i(interfaceC1525k4, interfaceC1525k3);
                                                break;
                                        }
                                    }
                                });
                            }
                        }
/* 72 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 76 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 81 */                    th.addSuppressed(th2);
                        }
/* 84 */                throw th;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
/* 1 */             C1702a c1702a = this.f9831d0;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 if (!this.f9835i) {
/* 11 */                    onActivityPostCreated(activity, null);
/* 14 */                    onActivityPreStarted(activity);
                        }
/* 22 */                if (this.f9832e) {
/* 26 */                    this.f9829c0.m4776a(activity);
                        }
/* 29 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 33 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 38 */                    th.addSuppressed(th2);
                        }
/* 41 */                throw th;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }
            }
