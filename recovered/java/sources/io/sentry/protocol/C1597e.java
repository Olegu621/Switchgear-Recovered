            package io.sentry.protocol;

            import io.sentry.C1383b7;
            import io.sentry.C1581p3;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Enumeration;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.TimeZone;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: renamed from: io.sentry.protocol.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 878 */   public class C1597e implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public final ConcurrentHashMap f11294a = new ConcurrentHashMap();

                /* JADX INFO: renamed from: b */
                public final C1702a f11295b = new C1702a();

                public C1597e(C1597e c1597e) {
/* 30 */            for (Map.Entry entry : c1597e.mo5306b()) {
/* 38 */                if (entry != null) {
/* 40 */                    Object value = entry.getValue();
/* 55 */                    if ("app".equals(entry.getKey()) && (value instanceof C1589a)) {
/* 63 */                        C1589a c1589a = (C1589a) value;
/* 65 */                        C1589a c1589a2 = new C1589a();
/* 70 */                        c1589a2.f11248i = c1589a.f11248i;
/* 74 */                        c1589a2.f11242a = c1589a.f11242a;
/* 78 */                        c1589a2.f11246e = c1589a.f11246e;
/* 82 */                        c1589a2.f11243b = c1589a.f11243b;
/* 86 */                        c1589a2.f11247f = c1589a.f11247f;
/* 90 */                        c1589a2.f11245d = c1589a.f11245d;
/* 94 */                        c1589a2.f11244c = c1589a.f11244c;
/* 102 */                       c1589a2.f11249v = AbstractC1704c.m5459n(c1589a.f11249v);
/* 106 */                       c1589a2.f11238V = c1589a.f11238V;
/* 108 */                       List list = c1589a.f11250w;
/* 117 */                       c1589a2.f11250w = list != null ? new ArrayList(list) : null;
/* 121 */                       c1589a2.f11237U = c1589a.f11237U;
/* 125 */                       c1589a2.f11239W = c1589a.f11239W;
/* 129 */                       c1589a2.f11240X = c1589a.f11240X;
/* 137 */                       c1589a2.f11241Y = AbstractC1704c.m5459n(c1589a.f11241Y);
/* 139 */                       mo5317m(c1589a2);
                            } else if ("browser".equals(entry.getKey()) && (value instanceof C1595d)) {
/* 161 */                       C1595d c1595d = (C1595d) value;
/* 163 */                       C1595d c1595d2 = new C1595d();
/* 168 */                       c1595d2.f11290a = c1595d.f11290a;
/* 172 */                       c1595d2.f11291b = c1595d.f11291b;
/* 180 */                       c1595d2.f11292c = AbstractC1704c.m5459n(c1595d.f11292c);
/* 182 */                       mo5318n(c1595d2);
                            } else if ("device".equals(entry.getKey()) && (value instanceof C1603h)) {
/* 205 */                       C1603h c1603h = (C1603h) value;
/* 207 */                       C1603h c1603h2 = new C1603h();
/* 212 */                       c1603h2.f11325a = c1603h.f11325a;
/* 216 */                       c1603h2.f11327b = c1603h.f11327b;
/* 220 */                       c1603h2.f11329c = c1603h.f11329c;
/* 224 */                       c1603h2.f11331d = c1603h.f11331d;
/* 228 */                       c1603h2.f11333e = c1603h.f11333e;
/* 232 */                       c1603h2.f11335f = c1603h.f11335f;
/* 236 */                       c1603h2.f11353w = c1603h.f11353w;
/* 240 */                       c1603h2.f11319U = c1603h.f11319U;
/* 244 */                       c1603h2.f11320V = c1603h.f11320V;
/* 248 */                       c1603h2.f11321W = c1603h.f11321W;
/* 252 */                       c1603h2.f11322X = c1603h.f11322X;
/* 256 */                       c1603h2.f11323Y = c1603h.f11323Y;
/* 260 */                       c1603h2.f11324Z = c1603h.f11324Z;
/* 264 */                       c1603h2.f11326a0 = c1603h.f11326a0;
/* 268 */                       c1603h2.f11328b0 = c1603h.f11328b0;
/* 272 */                       c1603h2.f11330c0 = c1603h.f11330c0;
/* 276 */                       c1603h2.f11332d0 = c1603h.f11332d0;
/* 280 */                       c1603h2.f11334e0 = c1603h.f11334e0;
/* 284 */                       c1603h2.f11336f0 = c1603h.f11336f0;
/* 288 */                       c1603h2.f11337g0 = c1603h.f11337g0;
/* 292 */                       c1603h2.f11338h0 = c1603h.f11338h0;
/* 296 */                       c1603h2.f11340i0 = c1603h.f11340i0;
/* 300 */                       c1603h2.f11341j0 = c1603h.f11341j0;
/* 304 */                       c1603h2.f11343l0 = c1603h.f11343l0;
/* 308 */                       c1603h2.f11345n0 = c1603h.f11345n0;
/* 312 */                       c1603h2.f11346o0 = c1603h.f11346o0;
/* 316 */                       c1603h2.f11352v = c1603h.f11352v;
/* 318 */                       String[] strArr = c1603h.f11339i;
/* 330 */                       c1603h2.f11339i = strArr != null ? (String[]) strArr.clone() : null;
/* 334 */                       c1603h2.f11344m0 = c1603h.f11344m0;
/* 336 */                       TimeZone timeZone = c1603h.f11342k0;
/* 347 */                       c1603h2.f11342k0 = timeZone != null ? (TimeZone) timeZone.clone() : null;
/* 351 */                       c1603h2.f11347p0 = c1603h.f11347p0;
/* 355 */                       c1603h2.f11348q0 = c1603h.f11348q0;
/* 359 */                       c1603h2.f11349r0 = c1603h.f11349r0;
/* 363 */                       c1603h2.f11350s0 = c1603h.f11350s0;
/* 371 */                       c1603h2.f11351t0 = AbstractC1704c.m5459n(c1603h.f11351t0);
/* 373 */                       mo5319o(c1603h2);
                            } else if ("os".equals(entry.getKey()) && (value instanceof C1620q)) {
/* 396 */                       C1620q c1620q = (C1620q) value;
/* 398 */                       C1620q c1620q2 = new C1620q();
/* 403 */                       c1620q2.f11436a = c1620q.f11436a;
/* 407 */                       c1620q2.f11437b = c1620q.f11437b;
/* 411 */                       c1620q2.f11438c = c1620q.f11438c;
/* 415 */                       c1620q2.f11439d = c1620q.f11439d;
/* 419 */                       c1620q2.f11440e = c1620q.f11440e;
/* 423 */                       c1620q2.f11441f = c1620q.f11441f;
/* 431 */                       c1620q2.f11442i = AbstractC1704c.m5459n(c1620q.f11442i);
/* 433 */                       mo5322r(c1620q2);
                            } else if ("runtime".equals(entry.getKey()) && (value instanceof C1628y)) {
/* 456 */                       C1628y c1628y = (C1628y) value;
/* 458 */                       C1628y c1628y2 = new C1628y();
/* 463 */                       c1628y2.f11483a = c1628y.f11483a;
/* 467 */                       c1628y2.f11484b = c1628y.f11484b;
/* 471 */                       c1628y2.f11485c = c1628y.f11485c;
/* 479 */                       c1628y2.f11486d = AbstractC1704c.m5459n(c1628y.f11486d);
/* 481 */                       mo5324t(c1628y2);
                            } else if ("feedback".equals(entry.getKey()) && (value instanceof C1609k)) {
/* 504 */                       C1609k c1609k = (C1609k) value;
/* 506 */                       C1609k c1609k2 = new C1609k();
/* 511 */                       c1609k2.f11369a = c1609k.f11369a;
/* 515 */                       c1609k2.f11370b = c1609k.f11370b;
/* 519 */                       c1609k2.f11371c = c1609k.f11371c;
/* 523 */                       c1609k2.f11372d = c1609k.f11372d;
/* 527 */                       c1609k2.f11373e = c1609k.f11373e;
/* 531 */                       c1609k2.f11374f = c1609k.f11374f;
/* 539 */                       c1609k2.f11375i = AbstractC1704c.m5459n(c1609k.f11375i);
/* 541 */                       mo5315k(c1609k2, "feedback");
                            } else if ("gpu".equals(entry.getKey()) && (value instanceof C1613m)) {
/* 564 */                       C1613m c1613m = (C1613m) value;
/* 566 */                       C1613m c1613m2 = new C1613m();
/* 571 */                       c1613m2.f11396a = c1613m.f11396a;
/* 575 */                       c1613m2.f11397b = c1613m.f11397b;
/* 579 */                       c1613m2.f11398c = c1613m.f11398c;
/* 583 */                       c1613m2.f11399d = c1613m.f11399d;
/* 587 */                       c1613m2.f11400e = c1613m.f11400e;
/* 591 */                       c1613m2.f11401f = c1613m.f11401f;
/* 595 */                       c1613m2.f11402i = c1613m.f11402i;
/* 599 */                       c1613m2.f11403v = c1613m.f11403v;
/* 603 */                       c1613m2.f11404w = c1613m.f11404w;
/* 611 */                       c1613m2.f11395U = AbstractC1704c.m5459n(c1613m.f11395U);
/* 613 */                       mo5321q(c1613m2);
                            } else if ("trace".equals(entry.getKey()) && (value instanceof C1383b7)) {
/* 641 */                       mo5326v(new C1383b7((C1383b7) value));
                            } else if ("profile".equals(entry.getKey()) && (value instanceof C1581p3)) {
/* 664 */                       C1581p3 c1581p3 = (C1581p3) value;
/* 666 */                       C1581p3 c1581p4 = new C1581p3();
/* 671 */                       c1581p4.f11225a = c1581p3.f11225a;
/* 675 */                       ConcurrentHashMap concurrentHashMapM5459n = AbstractC1704c.m5459n(c1581p3.f11226b);
/* 679 */                       if (concurrentHashMapM5459n != null) {
/* 681 */                           c1581p4.f11226b = concurrentHashMapM5459n;
                                }
/* 683 */                       mo5315k(c1581p4, "profile");
                            } else if ("response".equals(entry.getKey()) && (value instanceof C1622s)) {
/* 706 */                       C1622s c1622s = (C1622s) value;
/* 708 */                       C1622s c1622s2 = new C1622s();
/* 713 */                       c1622s2.f11455a = c1622s.f11455a;
/* 721 */                       c1622s2.f11456b = AbstractC1704c.m5459n(c1622s.f11456b);
/* 729 */                       c1622s2.f11460f = AbstractC1704c.m5459n(c1622s.f11460f);
/* 733 */                       c1622s2.f11457c = c1622s.f11457c;
/* 737 */                       c1622s2.f11458d = c1622s.f11458d;
/* 741 */                       c1622s2.f11459e = c1622s.f11459e;
/* 743 */                       mo5323s(c1622s2);
                            } else if ("spring".equals(entry.getKey()) && (value instanceof C1602g0)) {
/* 766 */                       C1602g0 c1602g0 = (C1602g0) value;
/* 768 */                       C1602g0 c1602g1 = new C1602g0();
/* 773 */                       c1602g1.f11317a = c1602g0.f11317a;
/* 781 */                       c1602g1.f11318b = AbstractC1704c.m5459n(c1602g0.f11318b);
/* 783 */                       mo5325u(c1602g1);
                            } else if ("art".equals(entry.getKey()) && (value instanceof C1593c)) {
/* 806 */                       C1593c c1593c = (C1593c) value;
/* 808 */                       C1593c c1593c2 = new C1593c();
/* 813 */                       c1593c2.f11276a = c1593c.f11276a;
/* 817 */                       c1593c2.f11277b = c1593c.f11277b;
/* 821 */                       c1593c2.f11278c = c1593c.f11278c;
/* 825 */                       c1593c2.f11279d = c1593c.f11279d;
/* 829 */                       c1593c2.f11280e = c1593c.f11280e;
/* 833 */                       c1593c2.f11281f = c1593c.f11281f;
/* 837 */                       c1593c2.f11282i = c1593c.f11282i;
/* 841 */                       c1593c2.f11283v = c1593c.f11283v;
/* 845 */                       c1593c2.f11284w = c1593c.f11284w;
/* 849 */                       c1593c2.f11273U = c1593c.f11273U;
/* 853 */                       c1593c2.f11274V = c1593c.f11274V;
/* 861 */                       c1593c2.f11275W = AbstractC1704c.m5459n(c1593c.f11275W);
/* 863 */                       mo5315k(c1593c2, "art");
                            } else {
/* 874 */                       mo5315k(value, (String) entry.getKey());
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public boolean mo5305a(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             return this.f11294a.containsKey(obj);
                }

                /* JADX INFO: renamed from: b */
                public Set mo5306b() {
/* 3 */             return this.f11294a.entrySet();
                }

                /* JADX INFO: renamed from: c */
                public Object mo5307c(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return null;
                    }
/* 7 */             return this.f11294a.get(obj);
                }

                /* JADX INFO: renamed from: d */
                public C1589a mo5308d() {
/* 9 */             return (C1589a) m5376w(C1589a.class, "app");
                }

                /* JADX INFO: renamed from: e */
                public C1603h mo5309e() {
/* 9 */             return (C1603h) m5376w(C1603h.class, "device");
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof C1597e) {
/* 11 */                return this.f11294a.equals(((C1597e) obj).f11294a);
                    }
/* 16 */            return false;
                }

                /* JADX INFO: renamed from: f */
                public C1607j mo5310f() {
/* 9 */             return (C1607j) m5376w(C1607j.class, "flags");
                }

                /* JADX INFO: renamed from: g */
                public C1620q mo5311g() {
/* 9 */             return (C1620q) m5376w(C1620q.class, "os");
                }

                /* JADX INFO: renamed from: h */
                public C1628y mo5312h() {
/* 9 */             return (C1628y) m5376w(C1628y.class, "runtime");
                }

                public final int hashCode() {
/* 3 */             return this.f11294a.hashCode();
                }

                /* JADX INFO: renamed from: i */
                public C1383b7 mo5313i() {
/* 9 */             return (C1383b7) m5376w(C1383b7.class, "trace");
                }

                /* JADX INFO: renamed from: j */
                public Enumeration mo5314j() {
/* 3 */             return this.f11294a.keys();
                }

                /* JADX INFO: renamed from: k */
                public Object mo5315k(Object obj, String str) {
/* 1 */             if (str == null) {
/* 3 */                 return null;
                    }
/* 5 */             ConcurrentHashMap concurrentHashMap = this.f11294a;
                    return obj == null ? concurrentHashMap.remove(str) : concurrentHashMap.put(str, obj);
                }

                /* JADX INFO: renamed from: l */
                public void mo5316l(C1597e c1597e) {
/* 1 */             if (c1597e == null) {
/* 3 */                 return;
                    }
/* 8 */             this.f11294a.putAll(c1597e.f11294a);
                }

                /* JADX INFO: renamed from: m */
                public void mo5317m(C1589a c1589a) {
/* 3 */             mo5315k(c1589a, "app");
                }

                /* JADX INFO: renamed from: n */
                public void mo5318n(C1595d c1595d) {
/* 3 */             mo5315k(c1595d, "browser");
                }

                /* JADX INFO: renamed from: o */
                public void mo5319o(C1603h c1603h) {
/* 3 */             mo5315k(c1603h, "device");
                }

                /* JADX INFO: renamed from: p */
                public void mo5320p(C1607j c1607j) {
/* 3 */             mo5315k(c1607j, "flags");
                }

                /* JADX INFO: renamed from: q */
                public void mo5321q(C1613m c1613m) {
/* 3 */             mo5315k(c1613m, "gpu");
                }

                /* JADX INFO: renamed from: r */
                public void mo5322r(C1620q c1620q) {
/* 3 */             mo5315k(c1620q, "os");
                }

                /* JADX INFO: renamed from: s */
                public void mo5323s(C1622s c1622s) {
/* 1 */             C1702a c1702a = this.f11295b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 mo5315k(c1622s, "response");
/* 11 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 16 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 21 */                    th.addSuppressed(th2);
                        }
/* 24 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1458g2
                public void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 6 */             Enumeration enumerationMo5314j = mo5314j();
/* 12 */            int size = this.f11294a.size();
/* 21 */            String[] strArr = size == 0 ? AbstractC1704c.f11727a : new String[size];
/* 24 */            int i = 0;
/* 29 */            while (enumerationMo5314j.hasMoreElements()) {
/* 32 */                if (i == strArr.length) {
/* 41 */                    strArr = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
                        }
/* 49 */                strArr[i] = (String) enumerationMo5314j.nextElement();
/* 51 */                i++;
                    }
/* 55 */            if (i != strArr.length) {
/* 62 */                strArr = (String[]) Arrays.copyOf(strArr, i);
                    }
/* 64 */            Arrays.sort(strArr);
/* 68 */            for (String str : strArr) {
/* 72 */                Object objMo5307c = mo5307c(str);
/* 76 */                if (objMo5307c != null) {
/* 78 */                    c1505c.m5291p(str);
/* 81 */                    c1505c.m5297v(iLogger, objMo5307c);
                        }
                    }
/* 87 */            c1505c.m5288l();
                }

                /* JADX INFO: renamed from: t */
                public void mo5324t(C1628y c1628y) {
/* 3 */             mo5315k(c1628y, "runtime");
                }

                /* JADX INFO: renamed from: u */
                public void mo5325u(C1602g0 c1602g0) {
/* 3 */             mo5315k(c1602g0, "spring");
                }

                /* JADX INFO: renamed from: v */
                public void mo5326v(C1383b7 c1383b7) {
/* 3 */             AbstractC1704c.m5462q(c1383b7, "traceContext is required");
/* 8 */             mo5315k(c1383b7, "trace");
                }

                /* JADX INFO: renamed from: w */
                public final Object m5376w(Class cls, String str) {
/* 1 */             Object objMo5307c = mo5307c(str);
/* 9 */             if (cls.isInstance(objMo5307c)) {
/* 11 */                return cls.cast(objMo5307c);
                    }
/* 16 */            return null;
                }

/* 879 */       public C1597e() {
                }
            }
