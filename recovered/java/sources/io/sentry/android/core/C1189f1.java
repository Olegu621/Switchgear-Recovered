            package io.sentry.android.core;

            import io.sentry.C1383b7;
            import io.sentry.C1393c5;
            import io.sentry.C1430d7;
            import io.sentry.C1486i0;
            import io.sentry.EnumC1451f7;
            import io.sentry.EnumC1517j2;
            import io.sentry.InterfaceC1388c0;
            import io.sentry.android.core.internal.util.C1218e;
            import io.sentry.android.core.performance.C1259g;
            import io.sentry.android.core.performance.C1260h;
            import io.sentry.android.core.performance.EnumC1258f;
            import io.sentry.protocol.C1589a;
            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1614n;
            import io.sentry.protocol.C1626w;
            import io.sentry.protocol.C1629z;
            import io.sentry.util.C1702a;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.android.core.f1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1189f1 implements InterfaceC1388c0 {

                /* JADX INFO: renamed from: a */
                public final C1181d f10013a;

                /* JADX INFO: renamed from: b */
                public final SentryAndroidOptions f10014b;

                /* JADX INFO: renamed from: c */
                public final C1702a f10015c = new C1702a();

                public C1189f1(SentryAndroidOptions sentryAndroidOptions, C1181d c1181d) {
/* 11 */            this.f10014b = sentryAndroidOptions;
/* 13 */            this.f10013a = c1181d;
                }

                /* JADX INFO: renamed from: a */
                public static void m4784a(C1259g c1259g, C1600f0 c1600f0) {
                    C1430d7 c1430d7;
/* 5 */             if (c1259g.f10263a != EnumC1258f.COLD) {
/* 188 */               return;
                    }
/* 9 */             C1597e c1597e = c1600f0.f11517b;
/* 11 */            ArrayList arrayList = c1600f0.f11313d0;
/* 13 */            C1383b7 c1383b7Mo5313i = c1597e.mo5313i();
/* 17 */            if (c1383b7Mo5313i == null) {
/* 188 */               return;
                    }
/* 21 */            C1626w c1626w = c1383b7Mo5313i.f10755a;
/* 23 */            Iterator it = arrayList.iterator();
                    while (true) {
/* 31 */                if (!it.hasNext()) {
/* 52 */                    c1430d7 = null;
                            break;
                        }
/* 37 */                C1629z c1629z = (C1629z) it.next();
/* 47 */                if (c1629z.f11496f.contentEquals("app.start.cold")) {
/* 49 */                    c1430d7 = c1629z.f11494d;
                            break;
                        }
                    }
/* 55 */            if (c1430d7 == null && "app.start".equals(c1383b7Mo5313i.f10759e)) {
/* 65 */                c1430d7 = c1383b7Mo5313i.f10756b;
                    }
/* 69 */            boolean zEquals = "app.start".equals(c1383b7Mo5313i.f10759e);
/* 75 */            C1260h c1260h = new C1260h();
/* 78 */            C1260h c1260h2 = c1259g.f10269d;
/* 80 */            long j = c1260h2.f10282b;
/* 82 */            long j2 = c1260h2.f10283c;
/* 84 */            long j3 = C1259g.f10254j0;
/* 88 */            c1260h.f10281a = "Process Initialization";
/* 90 */            c1260h.f10282b = j;
/* 92 */            c1260h.f10283c = j2;
/* 94 */            c1260h.f10284d = j3;
/* 100 */           if (c1260h.m4918d() && Math.abs(c1260h.m4915a()) <= 10000) {
/* 122 */               arrayList.add(m4787e(c1260h, c1430d7, c1626w, "process.load", zEquals));
                    }
/* 133 */           ArrayList arrayList2 = new ArrayList(c1259g.f10277i.values());
/* 136 */           Collections.sort(arrayList2);
/* 143 */           if (!arrayList2.isEmpty()) {
/* 145 */               Iterator it2 = arrayList2.iterator();
/* 153 */               while (it2.hasNext()) {
/* 167 */                   arrayList.add(m4787e((C1260h) it2.next(), c1430d7, c1626w, "contentprovider.load", zEquals));
                        }
                    }
/* 171 */           C1260h c1260h3 = c1259g.f10273f;
/* 177 */           if (c1260h3.m4919e()) {
/* 185 */               arrayList.add(m4787e(c1260h3, c1430d7, c1626w, "application.load", zEquals));
                    }
                }

                /* JADX INFO: renamed from: b */
                public static boolean m4785b(C1600f0 c1600f0) {
/* 11 */            for (C1629z c1629z : c1600f0.f11313d0) {
/* 27 */                if (c1629z.f11496f.contentEquals("app.start.cold") || c1629z.f11496f.contentEquals("app.start.warm")) {
/* 58 */                    return true;
                        }
                    }
/* 42 */            C1383b7 c1383b7Mo5313i = c1600f0.f11517b.mo5313i();
                    return c1383b7Mo5313i != null && c1383b7Mo5313i.f10759e.equals("app.start");
                }

                /* JADX WARN: Code duplicated, block: B:41:0x0086  */
                /* JADX INFO: renamed from: d */
                public static void m4786d(C1600f0 c1600f0) {
                    boolean z;
                    Double d;
                    Double d2;
                    Object obj;
/* 1 */             ArrayList<C1629z> arrayList = c1600f0.f11313d0;
/* 7 */             C1629z c1629z = null;
/* 8 */             C1629z c1629z2 = null;
/* 13 */            for (C1629z c1629z3 : arrayList) {
/* 29 */                if ("ui.load.initial_display".equals(c1629z3.f11496f)) {
/* 31 */                    c1629z = c1629z3;
                        } else if ("ui.load.full_display".equals(c1629z3.f11496f)) {
/* 43 */                    c1629z2 = c1629z3;
                        }
/* 44 */                if (c1629z != null && c1629z2 != null) {
                            break;
                        }
                    }
/* 48 */            if (c1629z == null && c1629z2 == null) {
/* 200 */               return;
                    }
/* 62 */            for (C1629z c1629z4 : arrayList) {
/* 70 */                if (c1629z4 != c1629z && c1629z4 != c1629z2) {
/* 75 */                    Map map = c1629z4.f11488V;
/* 77 */                    Double d3 = c1629z4.f11491a;
/* 79 */                    boolean z2 = false;
/* 102 */                   boolean z3 = map == null || (obj = map.get("thread.name")) == null || "main".equals(obj);
/* 103 */                   if (c1629z != null) {
/* 105 */                       double dDoubleValue = d3.doubleValue();
/* 117 */                       if (dDoubleValue < c1629z.f11491a.doubleValue() || (((d2 = c1629z.f11492b) != null && dDoubleValue > d2.doubleValue()) || !z3)) {
/* 135 */                           z = false;
                                } else {
/* 133 */                           z = true;
                                }
                            } else {
/* 135 */                       z = false;
                            }
/* 136 */                   if (c1629z2 != null) {
/* 138 */                       double dDoubleValue2 = d3.doubleValue();
/* 150 */                       if (dDoubleValue2 >= c1629z2.f11491a.doubleValue() && ((d = c1629z2.f11492b) == null || dDoubleValue2 <= d.doubleValue())) {
/* 164 */                           z2 = true;
                                }
                            }
/* 165 */                   if (z || z2) {
/* 169 */                       Map concurrentHashMap = c1629z4.f11488V;
/* 171 */                       if (concurrentHashMap == null) {
/* 175 */                           concurrentHashMap = new ConcurrentHashMap();
/* 178 */                           c1629z4.f11488V = concurrentHashMap;
                                }
/* 180 */                       if (z) {
/* 186 */                           concurrentHashMap.put("ui.contributes_to_ttid", Boolean.TRUE);
                                }
/* 189 */                       if (z2) {
/* 195 */                           concurrentHashMap.put("ui.contributes_to_ttfd", Boolean.TRUE);
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public static C1629z m4787e(C1260h c1260h, C1430d7 c1430d7, C1626w c1626w, String str, boolean z) {
                    long jM4915a;
/* 4 */             HashMap map = new HashMap(2);
/* 15 */            map.put("thread.id", Long.valueOf(C1218e.f10158b));
/* 22 */            map.put("thread.name", "main");
/* 25 */            if (!z) {
/* 27 */                Boolean bool = Boolean.TRUE;
/* 31 */                map.put("ui.contributes_to_ttid", bool);
/* 36 */                map.put("ui.contributes_to_ttfd", bool);
                    }
/* 50 */            Double dValueOf = Double.valueOf(c1260h.f10282b / 1000.0d);
/* 58 */            if (c1260h.m4918d()) {
/* 66 */                jM4915a = c1260h.m4915a() + c1260h.f10282b;
                    } else {
/* 68 */                jM4915a = 0;
                    }
/* 101 */           return new C1629z(dValueOf, Double.valueOf(jM4915a / 1000.0d), c1626w, new C1430d7(), c1430d7, str, c1260h.f10281a, EnumC1451f7.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: f */
                public final C1393c5 mo4754f(C1393c5 c1393c5, C1486i0 c1486i0) {
/* 1 */             return c1393c5;
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: g */
                public final C1600f0 mo4755g(C1600f0 c1600f0, C1486i0 c1486i0) {
                    Map map;
                    C1260h c1260hM4911b;
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f10014b;
/* 3 */             C1702a c1702a = this.f10015c;
/* 5 */             c1702a.m5443c();
                    try {
/* 12 */                if (!sentryAndroidOptions.isTracingEnabled()) {
/* 14 */                    c1702a.close();
/* 17 */                    return c1600f0;
                        }
/* 18 */                C1259g c1259gM4907c = C1259g.m4907c();
/* 22 */                boolean zM4785b = m4785b(c1600f0);
/* 26 */                HashMap map2 = c1600f0.f11314e0;
/* 28 */                C1597e c1597e = c1600f0.f11517b;
/* 30 */                if (zM4785b) {
/* 32 */                    C1383b7 c1383b7Mo5313i = c1597e.mo5313i();
/* 37 */                    boolean z = true;
/* 72 */                    boolean z2 = (c1383b7Mo5313i == null || !(c1383b7Mo5313i != null && "app.start".equals(c1383b7Mo5313i.f10759e)) || c1383b7Mo5313i.f10749U.containsKey("app.vitals.start.screen")) ? false : true;
/* 96 */                    if (c1259gM4907c.f10260X && (z2 || ((Boolean) c1259gM4907c.f10265b.m5471a()).booleanValue())) {
/* 98 */                        if (z2) {
/* 100 */                           c1260hM4911b = c1259gM4907c.f10269d;
/* 106 */                           if (!c1260hM4911b.m4918d() || !c1260hM4911b.m4919e()) {
/* 115 */                               c1260hM4911b = c1259gM4907c.f10271e;
                                    }
                                } else {
/* 118 */                           c1260hM4911b = c1259gM4907c.m4911b(sentryAndroidOptions);
                                }
/* 122 */                       long jM4915a = c1260hM4911b.m4915a();
/* 130 */                       C1702a c1702a2 = (C1702a) c1259gM4907c.f10278i0.f10226a;
/* 132 */                       c1702a2.m5443c();
/* 135 */                       c1702a2.close();
/* 142 */                       if (jM4915a == 0) {
/* 145 */                           z = false;
                                }
/* 146 */                       if (z) {
/* 148 */                           if (z) {
/* 177 */                               map2.put(c1259gM4907c.f10263a == EnumC1258f.COLD ? "app_start_cold" : "app_start_warm", new C1614n(EnumC1517j2.MILLISECOND.apiName(), (Number) Float.valueOf(jM4915a)));
                                    }
/* 180 */                           m4784a(c1259gM4907c, c1600f0);
/* 183 */                           c1259gM4907c.f10260X = false;
/* 187 */                           c1259gM4907c.f10277i.clear();
/* 192 */                           c1259gM4907c.f10279v.clear();
/* 199 */                           C1702a c1702a3 = (C1702a) c1259gM4907c.f10278i0.f10226a;
/* 201 */                           c1702a3.m5443c();
/* 204 */                           c1702a3.close();
                                }
                            }
/* 207 */                   C1589a c1589aMo5308d = c1597e.mo5308d();
/* 211 */                   if (c1589aMo5308d == null) {
/* 215 */                       c1589aMo5308d = new C1589a();
/* 218 */                       c1597e.mo5317m(c1589aMo5308d);
                            }
/* 232 */                   c1589aMo5308d.f11237U = c1259gM4907c.f10263a == EnumC1258f.COLD ? "cold" : "warm";
                        }
/* 234 */               m4786d(c1600f0);
/* 237 */               C1626w c1626w = c1600f0.f11516a;
/* 239 */               C1383b7 c1383b7Mo5313i2 = c1597e.mo5313i();
/* 243 */               if (c1626w != null && c1383b7Mo5313i2 != null && c1383b7Mo5313i2.f10759e.contentEquals("ui.load")) {
/* 257 */                   C1181d c1181d = this.f10013a;
/* 261 */                   ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1181d.f9987d;
/* 265 */                   C1702a c1702a4 = (C1702a) c1181d.f9990g;
/* 267 */                   c1702a4.m5443c();
                            try {
/* 274 */                       if (c1181d.m4780e()) {
/* 285 */                           map = (Map) concurrentHashMap.get(c1626w);
/* 287 */                           concurrentHashMap.remove(c1626w);
/* 290 */                           c1702a4.close();
                                } else {
/* 276 */                           c1702a4.close();
/* 279 */                           map = null;
                                }
/* 293 */                       if (map != null) {
/* 295 */                           map2.putAll(map);
                                }
                            } catch (Throwable th) {
                                try {
/* 300 */                           c1702a4.close();
                                } catch (Throwable th2) {
/* 305 */                           th.addSuppressed(th2);
                                }
/* 308 */                       throw th;
                            }
                        }
/* 309 */               c1702a.close();
/* 312 */               return c1600f0;
                    } catch (Throwable th3) {
                        try {
/* 313 */                   c1702a.close();
                        } catch (Throwable th4) {
/* 318 */                   th3.addSuppressed(th4);
                        }
/* 321 */               throw th3;
                    }
                }
            }
