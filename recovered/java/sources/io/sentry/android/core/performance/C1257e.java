            package io.sentry.android.core.performance;

            import android.app.ApplicationStartInfo;
            import android.os.Build;
            import android.os.MessageQueue;
            import android.os.SystemClock;
            import io.sentry.C1422d;
            import io.sentry.C1522j7;
            import io.sentry.C1531k7;
            import io.sentry.C1644r5;
            import io.sentry.EnumC1392c4;
            import io.sentry.EnumC1451f7;
            import io.sentry.InterfaceC1549m1;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.ActivityLifecycleIntegration;
            import io.sentry.android.core.C1193h;
            import io.sentry.android.core.C1277v;
            import io.sentry.protocol.EnumC1606i0;
            import io.sentry.util.C1702a;
            import p000.C2357x6;
            
            /* JADX INFO: renamed from: io.sentry.android.core.performance.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C1257e implements MessageQueue.IdleHandler {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1259g f10253a;

                public /* synthetic */ C1257e(C1259g c1259g) {
/* 4 */             this.f10253a = c1259g;
                }

                /* JADX WARN: Code duplicated, block: B:37:0x009b  */
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    C1644r5 c1644r5;
                    long jM4915a;
/* 1 */             C1259g c1259g = this.f10253a;
/* 7 */             c1259g.f10267c = SystemClock.uptimeMillis();
/* 12 */            c1259g.f10264a0.set(false);
/* 21 */            if (c1259g.f10261Y.get() == 0 && (c1259g.f10268c0 == null || !AbstractC1245n0.m4882j())) {
/* 39 */                c1259g.f10265b.m5472b(Boolean.FALSE);
/* 46 */                if (c1259g.f10263a == EnumC1258f.UNKNOWN) {
/* 50 */                    c1259g.f10263a = EnumC1258f.COLD;
                        }
/* 52 */                C1277v c1277v = c1259g.f10280w;
/* 55 */                if (c1277v != null && c1277v.f10368w.get()) {
/* 67 */                    c1259g.f10280w.close();
/* 70 */                    c1259g.f10280w = null;
                        }
/* 72 */                C1193h c1193h = c1259g.f10257U;
/* 75 */                if (c1193h != null && c1193h.f10048w) {
/* 81 */                    c1193h.mo4793a(true);
/* 84 */                    c1259g.f10257U = null;
                        }
/* 86 */                C2357x6 c2357x6 = c1259g.f10268c0;
/* 88 */                if (c2357x6 != null && c1259g.f10266b0.compareAndSet(false, true)) {
/* 98 */                    C1260h c1260h = c1259g.f10273f;
/* 107 */                   if (c1260h.m4919e()) {
/* 116 */                       c1259g.m4914h(c1260h.m4915a() + c1260h.f10283c);
                            } else {
/* 120 */                       ApplicationStartInfo applicationStartInfo = c1259g.f10276h0;
/* 122 */                       if (applicationStartInfo == null || Build.VERSION.SDK_INT < 35) {
/* 158 */                           c1259g.m4914h(C1259g.f10254j0);
                                } else {
                                    try {
/* 143 */                               Long l = (Long) applicationStartInfo.getStartupTimestamps().get(2);
/* 145 */                               if (l != null) {
/* 152 */                                   c1259g.m4914h(l.longValue() / 1000000);
                                        } else {
/* 158 */                                   c1259g.m4914h(C1259g.f10254j0);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
/* 163 */                   ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) c2357x6.f18961b;
/* 167 */                   if (activityLifecycleIntegration.f9828c != null && activityLifecycleIntegration.f9830d != null && activityLifecycleIntegration.f9832e) {
/* 179 */                       C1259g c1259gM4907c = C1259g.m4907c();
/* 183 */                       c1259gM4907c.f10258V = null;
/* 185 */                       C1260h c1260h2 = c1259gM4907c.f10269d;
/* 191 */                       if (!c1260h2.m4918d() || !c1260h2.m4919e()) {
/* 200 */                           c1260h2 = c1259gM4907c.f10271e;
                                }
/* 206 */                       if (c1260h2.m4918d() && c1260h2.m4919e()) {
/* 216 */                           C1644r5 c1644r5M4916b = c1260h2.m4916b();
/* 224 */                           if (c1260h2.m4919e()) {
/* 232 */                               if (c1260h2.m4918d()) {
/* 240 */                                   jM4915a = c1260h2.m4915a() + c1260h2.f10282b;
                                        } else {
/* 242 */                                   jM4915a = 0;
                                        }
/* 245 */                               c1644r5 = new C1644r5(jM4915a * 1000000);
                                    } else {
/* 249 */                               c1644r5 = null;
                                    }
/* 250 */                           if (c1644r5M4916b != null && c1644r5 != null) {
/* 255 */                               c1259gM4907c.f10275g0 = c1644r5;
/* 261 */                               C1702a c1702a = (C1702a) c1259gM4907c.f10278i0.f10226a;
/* 263 */                               c1702a.m5443c();
/* 266 */                               c1702a.close();
/* 271 */                               if (c1259gM4907c.f10260X) {
/* 273 */                                   C1259g c1259gM4907c2 = C1259g.m4907c();
/* 279 */                                   C1531k7 c1531k7 = new C1531k7();
/* 284 */                                   c1531k7.f10917b = EnumC1392c4.OFF;
/* 286 */                                   c1531k7.f10916a = c1644r5M4916b;
/* 290 */                                   c1531k7.f10919d = "auto.app.start";
/* 292 */                                   c1531k7.f11094e = false;
/* 307 */                                   InterfaceC1549m1 interfaceC1549m1Mo5097q = activityLifecycleIntegration.f9828c.mo5097q(new C1522j7("App Start", EnumC1606i0.COMPONENT, "app.start", null), c1531k7);
/* 311 */                                   String strM4910a = c1259gM4907c2.m4910a();
/* 315 */                                   if (strM4910a != null) {
/* 319 */                                       interfaceC1549m1Mo5097q.mo4732j(strM4910a, "app.vitals.start.reason");
                                            }
/* 328 */                                   c1259gM4907c2.f10270d0 = interfaceC1549m1Mo5097q.mo4737s().f10755a;
/* 338 */                                   c1259gM4907c2.f10272e0 = interfaceC1549m1Mo5097q.mo4726b().m5414a();
/* 340 */                                   C1422d c1422dMo5248k = interfaceC1549m1Mo5097q.mo5248k();
/* 349 */                                   c1259gM4907c2.f10274f0 = c1422dMo5248k != null ? c1422dMo5248k.f10847a : null;
/* 353 */                                   interfaceC1549m1Mo5097q.mo4740v(EnumC1451f7.OK, c1644r5);
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 11 */            return false;
                }
            }
