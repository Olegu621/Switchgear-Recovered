            package io.sentry.clientreport;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1430d7;
            import io.sentry.C1431e;
            import io.sentry.C1566n5;
            import io.sentry.C1581p3;
            import io.sentry.EnumC1451f7;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1489i3;
            import io.sentry.InterfaceC1696u1;
            import io.sentry.profilemeasurements.C1585a;
            import io.sentry.profilemeasurements.C1586b;
            import io.sentry.protocol.C1589a;
            import io.sentry.protocol.C1590a0;
            import io.sentry.protocol.C1593c;
            import io.sentry.protocol.C1594c0;
            import io.sentry.protocol.C1595d;
            import io.sentry.protocol.C1597e;
            import io.sentry.protocol.C1599f;
            import io.sentry.protocol.C1602g0;
            import io.sentry.protocol.C1603h;
            import io.sentry.protocol.C1605i;
            import io.sentry.protocol.C1607j;
            import io.sentry.protocol.C1609k;
            import io.sentry.protocol.C1611l;
            import io.sentry.protocol.C1613m;
            import io.sentry.protocol.C1614n;
            import io.sentry.protocol.C1615o;
            import io.sentry.protocol.C1616p;
            import io.sentry.protocol.C1620q;
            import io.sentry.protocol.C1621r;
            import io.sentry.protocol.C1622s;
            import io.sentry.protocol.C1623t;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1625v;
            import io.sentry.protocol.C1626w;
            import io.sentry.protocol.C1627x;
            import io.sentry.protocol.C1628y;
            import io.sentry.protocol.C1629z;
            import io.sentry.protocol.DebugImage;
            import io.sentry.protocol.EnumC1592b0;
            import io.sentry.protocol.EnumC1601g;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.vendor.gson.stream.EnumC1731b;
            import java.util.AbstractMap;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArraySet;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.clientreport.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1411a implements InterfaceC1696u1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10834a;

                public /* synthetic */ C1411a(int i) {
/* 1 */             this.f10834a = i;
                }

                /* JADX INFO: renamed from: b */
                public static C1589a m5148b(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 1 */             interfaceC1489i3.beginObject();
/* 6 */             C1589a c1589a = new C1589a();
/* 9 */             ConcurrentHashMap concurrentHashMap = null;
/* 16 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 18 */                String strNextName = interfaceC1489i3.nextName();
/* 22 */                strNextName.getClass();
                        switch (strNextName) {
                            case "split_names":
/* 317 */                       List list = (List) interfaceC1489i3.mo5232R0();
/* 319 */                       if (list == null) {
                                    break;
                                } else {
/* 321 */                           c1589a.f11240X = list;
                                    break;
                                }
                                break;
                            case "device_app_hash":
/* 309 */                       c1589a.f11244c = interfaceC1489i3.mo5231M();
                                break;
                            case "start_type":
/* 301 */                       c1589a.f11237U = interfaceC1489i3.mo5231M();
                                break;
                            case "view_names":
/* 289 */                       List list2 = (List) interfaceC1489i3.mo5232R0();
/* 291 */                       if (list2 == null) {
                                    break;
                                } else {
/* 293 */                           c1589a.f11250w = list2;
                                    break;
                                }
                                break;
                            case "app_version":
/* 281 */                       c1589a.f11247f = interfaceC1489i3.mo5231M();
                                break;
                            case "in_foreground":
/* 273 */                       c1589a.f11238V = interfaceC1489i3.mo5242q0();
                                break;
                            case "build_type":
/* 265 */                       c1589a.f11245d = interfaceC1489i3.mo5231M();
                                break;
                            case "app_identifier":
/* 257 */                       c1589a.f11242a = interfaceC1489i3.mo5231M();
                                break;
                            case "app_start_time":
/* 249 */                       c1589a.f11243b = interfaceC1489i3.mo5241l0(iLogger);
                                break;
                            case "permissions":
/* 241 */                       c1589a.f11249v = AbstractC1704c.m5459n((Map) interfaceC1489i3.mo5232R0());
                                break;
                            case "app_name":
/* 227 */                       c1589a.f11246e = interfaceC1489i3.mo5231M();
                                break;
                            case "app_build":
/* 219 */                       c1589a.f11248i = interfaceC1489i3.mo5231M();
                                break;
                            case "is_split_apks":
/* 211 */                       c1589a.f11239W = interfaceC1489i3.mo5242q0();
                                break;
                            default:
/* 195 */                       if (concurrentHashMap == null) {
/* 199 */                           concurrentHashMap = new ConcurrentHashMap();
                                }
/* 202 */                       interfaceC1489i3.mo5244w(iLogger, concurrentHashMap, strNextName);
                                break;
                        }
                    }
/* 325 */           c1589a.f11241Y = concurrentHashMap;
/* 327 */           interfaceC1489i3.endObject();
/* 330 */           return c1589a;
                }

                /* JADX INFO: renamed from: c */
                public static C1597e m5149c(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
                    byte b;
/* 7 */             C1597e c1597e = new C1597e();
/* 10 */            interfaceC1489i3.beginObject();
/* 19 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 21 */                String strNextName = interfaceC1489i3.nextName();
/* 25 */                strNextName.getClass();
/* 32 */                int i = 11;
                        switch (strNextName) {
                            case "device":
/* 211 */                       b = 0;
                                break;
                            case "spring":
/* 198 */                       b = 1;
                                break;
                            case "response":
/* 185 */                       b = 2;
                                break;
                            case "profile":
/* 173 */                       b = 3;
                                break;
                            case "feedback":
/* 164 */                       b = 4;
                                break;
                            case "os":
/* 155 */                       b = 5;
                                break;
                            case "app":
/* 144 */                       b = 6;
                                break;
                            case "art":
/* 133 */                       b = 7;
                                break;
                            case "gpu":
/* 123 */                       b = 8;
                                break;
                            case "flags":
/* 110 */                       b = 9;
                                break;
                            case "trace":
/* 97 */                        b = 10;
                                break;
                            case "browser":
/* 85 */                        b = 11;
                                break;
                            case "runtime":
/* 72 */                        b = 12;
                                break;
                            default:
/* 59 */                        b = -1;
                                break;
                        }
/* 217 */               ArrayList arrayList = null;
                        switch (b) {
                            case 0:
/* 1129 */                      c1597e.mo5319o(m5150d(interfaceC1489i3, iLogger));
                                break;
                            case 1:
/* 1051 */                      interfaceC1489i3.beginObject();
/* 1056 */                      C1602g0 c1602g0 = new C1602g0();
/* 1059 */                      ConcurrentHashMap concurrentHashMap = null;
/* 1067 */                      while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 1069 */                          String strNextName2 = interfaceC1489i3.nextName();
/* 1073 */                          strNextName2.getClass();
/* 1082 */                          if (strNextName2.equals("active_profiles")) {
/* 1099 */                              List list = (List) interfaceC1489i3.mo5232R0();
/* 1101 */                              if (list != null) {
/* 1107 */                                  String[] strArr = new String[list.size()];
/* 1109 */                                  list.toArray(strArr);
/* 1112 */                                  c1602g0.f11317a = strArr;
                                        }
                                    } else {
/* 1084 */                              if (concurrentHashMap == null) {
/* 1088 */                                  concurrentHashMap = new ConcurrentHashMap();
                                        }
/* 1091 */                              interfaceC1489i3.mo5244w(iLogger, concurrentHashMap, strNextName2);
                                    }
                                }
/* 1115 */                      c1602g0.f11318b = concurrentHashMap;
/* 1117 */                      interfaceC1489i3.endObject();
/* 1120 */                      c1597e.mo5325u(c1602g0);
                                break;
                            case 2:
/* 889 */                       interfaceC1489i3.beginObject();
/* 894 */                       C1622s c1622s = new C1622s();
/* 897 */                       ConcurrentHashMap concurrentHashMap2 = null;
/* 905 */                       while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 907 */                           String strNextName3 = interfaceC1489i3.nextName();
/* 911 */                           strNextName3.getClass();
                                    switch (strNextName3) {
                                        case "status_code":
/* 1037 */                                  c1622s.f11457c = interfaceC1489i3.mo5243r();
                                            break;
                                        case "data":
/* 1029 */                                  c1622s.f11459e = interfaceC1489i3.mo5232R0();
                                            break;
                                        case "headers":
/* 1014 */                                  Map map = (Map) interfaceC1489i3.mo5232R0();
/* 1016 */                                  if (map != null) {
/* 1022 */                                      c1622s.f11456b = AbstractC1704c.m5459n(map);
                                                break;
                                            } else {
                                                break;
                                            }
                                            break;
                                        case "cookies":
/* 1007 */                                  c1622s.f11455a = interfaceC1489i3.mo5231M();
                                            break;
                                        case "body_size":
/* 1000 */                                  c1622s.f11458d = interfaceC1489i3.mo5227B();
                                            break;
                                        default:
/* 985 */                                   if (concurrentHashMap2 == null) {
/* 989 */                                       concurrentHashMap2 = new ConcurrentHashMap();
                                            }
/* 992 */                                   interfaceC1489i3.mo5244w(iLogger, concurrentHashMap2, strNextName3);
                                            break;
                                    }
                                }
/* 1041 */                      c1622s.f11460f = concurrentHashMap2;
/* 1043 */                      interfaceC1489i3.endObject();
/* 1046 */                      c1597e.mo5323s(c1622s);
                                break;
                            case 3:
/* 815 */                       interfaceC1489i3.beginObject();
/* 822 */                       C1581p3 c1581p3 = new C1581p3(C1626w.f11478b);
/* 825 */                       ConcurrentHashMap concurrentHashMap3 = null;
/* 833 */                       while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 835 */                           String strNextName4 = interfaceC1489i3.nextName();
/* 839 */                           strNextName4.getClass();
/* 848 */                           if (strNextName4.equals("profiler_id")) {
/* 872 */                               C1626w c1626w = (C1626w) interfaceC1489i3.mo5230K0(iLogger, new C1411a(23));
/* 874 */                               if (c1626w != null) {
/* 876 */                                   c1581p3.f11225a = c1626w;
                                        }
                                    } else {
/* 850 */                               if (concurrentHashMap3 == null) {
/* 854 */                                   concurrentHashMap3 = new ConcurrentHashMap();
                                        }
/* 857 */                               interfaceC1489i3.mo5244w(iLogger, concurrentHashMap3, strNextName4);
                                    }
                                }
/* 879 */                       c1581p3.f11226b = concurrentHashMap3;
/* 881 */                       interfaceC1489i3.endObject();
/* 884 */                       c1597e.mo5315k(c1581p3, "profile");
                                break;
                            case 4:
/* 810 */                       c1597e.mo5315k(m5151e(interfaceC1489i3, iLogger), "feedback");
                                break;
                            case 5:
/* 801 */                       c1597e.mo5322r(m5153g(interfaceC1489i3, iLogger));
                                break;
                            case 6:
/* 792 */                       c1597e.mo5317m(m5148b(interfaceC1489i3, iLogger));
                                break;
                            case 7:
/* 509 */                       interfaceC1489i3.beginObject();
/* 514 */                       C1593c c1593c = new C1593c();
/* 517 */                       ConcurrentHashMap concurrentHashMap4 = null;
/* 525 */                       while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 527 */                           String strNextName5 = interfaceC1489i3.nextName();
/* 531 */                           strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "gc.total_time":
/* 774 */                                   c1593c.f11277b = interfaceC1489i3.mo5234b0();
                                            break;
                                        case "memory.free_until_gc":
/* 766 */                                   c1593c.f11283v = interfaceC1489i3.mo5227B();
                                            break;
                                        case "gc.blocking_time":
/* 758 */                                   c1593c.f11279d = interfaceC1489i3.mo5234b0();
                                            break;
                                        case "gc.waiting_time":
/* 750 */                                   c1593c.f11281f = interfaceC1489i3.mo5234b0();
                                            break;
                                        case "memory.free_until_oome":
/* 742 */                                   c1593c.f11284w = interfaceC1489i3.mo5227B();
                                            break;
                                        case "memory.total":
/* 734 */                                   c1593c.f11273U = interfaceC1489i3.mo5227B();
                                            break;
                                        case "gc.pre_oome_count":
/* 726 */                                   c1593c.f11280e = interfaceC1489i3.mo5227B();
                                            break;
                                        case "memory.free":
/* 718 */                                   c1593c.f11282i = interfaceC1489i3.mo5227B();
                                            break;
                                        case "gc.blocking_count":
/* 710 */                                   c1593c.f11278c = interfaceC1489i3.mo5227B();
                                            break;
                                        case "gc.total_count":
/* 702 */                                   c1593c.f11276a = interfaceC1489i3.mo5227B();
                                            break;
                                        case "memory.max":
/* 694 */                                   c1593c.f11274V = interfaceC1489i3.mo5227B();
                                            break;
                                        default:
/* 678 */                                   if (concurrentHashMap4 == null) {
/* 682 */                                       concurrentHashMap4 = new ConcurrentHashMap();
                                            }
/* 685 */                                   interfaceC1489i3.mo5244w(iLogger, concurrentHashMap4, strNextName5);
                                            break;
                                    }
                                }
/* 778 */                       c1593c.f11275W = concurrentHashMap4;
/* 780 */                       interfaceC1489i3.endObject();
/* 783 */                       c1597e.mo5315k(c1593c, "art");
                                break;
                            case 8:
/* 504 */                       c1597e.mo5321q(m5152f(interfaceC1489i3, iLogger));
                                break;
                            case 9:
/* 425 */                       interfaceC1489i3.beginObject();
/* 428 */                       ConcurrentHashMap concurrentHashMap5 = null;
/* 436 */                       while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 438 */                           String strNextName6 = interfaceC1489i3.nextName();
/* 442 */                           strNextName6.getClass();
/* 451 */                           if (strNextName6.equals("values")) {
/* 469 */                               arrayList = interfaceC1489i3.mo5239h1(iLogger, new C1411a(i));
                                    } else {
/* 453 */                               if (concurrentHashMap5 == null) {
/* 457 */                                   concurrentHashMap5 = new ConcurrentHashMap();
                                        }
/* 460 */                               interfaceC1489i3.mo5244w(iLogger, concurrentHashMap5, strNextName6);
                                    }
                                }
/* 476 */                       if (arrayList == null) {
/* 480 */                           arrayList = new ArrayList();
                                }
/* 487 */                       C1607j c1607j = new C1607j(arrayList);
/* 490 */                       c1607j.f11360b = concurrentHashMap5;
/* 492 */                       interfaceC1489i3.endObject();
/* 495 */                       c1597e.mo5320p(c1607j);
                                break;
                            case 10:
/* 420 */                       c1597e.mo5326v(C1431e.m5199b(interfaceC1489i3, iLogger));
                                break;
                            case 11:
/* 344 */                       interfaceC1489i3.beginObject();
/* 349 */                       C1595d c1595d = new C1595d();
/* 352 */                       ConcurrentHashMap concurrentHashMap6 = null;
/* 360 */                       while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 362 */                           String strNextName7 = interfaceC1489i3.nextName();
/* 366 */                           strNextName7.getClass();
/* 373 */                           if (strNextName7.equals("name")) {
/* 403 */                               c1595d.f11290a = interfaceC1489i3.mo5231M();
                                    } else if (strNextName7.equals("version")) {
/* 396 */                               c1595d.f11291b = interfaceC1489i3.mo5231M();
                                    } else {
/* 381 */                               if (concurrentHashMap6 == null) {
/* 385 */                                   concurrentHashMap6 = new ConcurrentHashMap();
                                        }
/* 388 */                               interfaceC1489i3.mo5244w(iLogger, concurrentHashMap6, strNextName7);
                                    }
                                }
/* 406 */                       c1595d.f11292c = concurrentHashMap6;
/* 408 */                       interfaceC1489i3.endObject();
/* 411 */                       c1597e.mo5318n(c1595d);
                                break;
                            case 12:
/* 233 */                       interfaceC1489i3.beginObject();
/* 238 */                       C1628y c1628y = new C1628y();
/* 241 */                       ConcurrentHashMap concurrentHashMap7 = null;
/* 249 */                       while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 251 */                           String strNextName8 = interfaceC1489i3.nextName();
/* 255 */                           strNextName8.getClass();
                                    switch (strNextName8) {
                                        case "raw_description":
/* 331 */                                   c1628y.f11485c = interfaceC1489i3.mo5231M();
                                            break;
                                        case "name":
/* 324 */                                   c1628y.f11483a = interfaceC1489i3.mo5231M();
                                            break;
                                        case "version":
/* 317 */                                   c1628y.f11484b = interfaceC1489i3.mo5231M();
                                            break;
                                        default:
/* 302 */                                   if (concurrentHashMap7 == null) {
/* 306 */                                       concurrentHashMap7 = new ConcurrentHashMap();
                                            }
/* 309 */                                   interfaceC1489i3.mo5244w(iLogger, concurrentHashMap7, strNextName8);
                                            break;
                                    }
                                }
/* 334 */                       c1628y.f11486d = concurrentHashMap7;
/* 336 */                       interfaceC1489i3.endObject();
/* 339 */                       c1597e.mo5324t(c1628y);
                                break;
                            default:
/* 222 */                       Object objMo5232R0 = interfaceC1489i3.mo5232R0();
/* 226 */                       if (objMo5232R0 != null) {
/* 228 */                           c1597e.mo5315k(objMo5232R0, strNextName);
                                }
                                break;
                        }
                    }
/* 1134 */          interfaceC1489i3.endObject();
/* 1137 */          return c1597e;
                }

                /* JADX INFO: renamed from: d */
                public static C1603h m5150d(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 1 */             interfaceC1489i3.beginObject();
/* 6 */             C1603h c1603h = new C1603h();
/* 9 */             ConcurrentHashMap concurrentHashMap = null;
/* 16 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 18 */                String strNextName = interfaceC1489i3.nextName();
/* 22 */                strNextName.getClass();
/* 29 */                int i = 10;
                        switch (strNextName) {
                            case "timezone":
/* 798 */                       c1603h.f11342k0 = interfaceC1489i3.mo5229J(iLogger);
                                break;
                            case "boot_time":
/* 784 */                       if (interfaceC1489i3.peek() != EnumC1731b.STRING) {
                                    break;
                                } else {
/* 790 */                           c1603h.f11341j0 = interfaceC1489i3.mo5241l0(iLogger);
                                    break;
                                }
                                break;
                            case "simulator":
/* 774 */                       c1603h.f11321W = interfaceC1489i3.mo5242q0();
                                break;
                            case "manufacturer":
/* 766 */                       c1603h.f11327b = interfaceC1489i3.mo5231M();
                                break;
                            case "processor_count":
/* 758 */                       c1603h.f11347p0 = interfaceC1489i3.mo5243r();
                                break;
                            case "orientation":
/* 750 */                       c1603h.f11320V = (EnumC1601g) interfaceC1489i3.mo5230K0(iLogger, new C1411a(i));
                                break;
                            case "battery_temperature":
/* 735 */                       c1603h.f11346o0 = interfaceC1489i3.mo5228G0();
                                break;
                            case "family":
/* 727 */                       c1603h.f11331d = interfaceC1489i3.mo5231M();
                                break;
                            case "locale":
/* 719 */                       c1603h.f11344m0 = interfaceC1489i3.mo5231M();
                                break;
                            case "online":
/* 711 */                       c1603h.f11319U = interfaceC1489i3.mo5242q0();
                                break;
                            case "battery_level":
/* 703 */                       c1603h.f11352v = interfaceC1489i3.mo5228G0();
                                break;
                            case "model_id":
/* 695 */                       c1603h.f11335f = interfaceC1489i3.mo5231M();
                                break;
                            case "screen_density":
/* 687 */                       c1603h.f11338h0 = interfaceC1489i3.mo5228G0();
                                break;
                            case "screen_dpi":
/* 679 */                       c1603h.f11340i0 = interfaceC1489i3.mo5243r();
                                break;
                            case "free_memory":
/* 671 */                       c1603h.f11323Y = interfaceC1489i3.mo5227B();
                                break;
                            case "id":
/* 663 */                       c1603h.f11343l0 = interfaceC1489i3.mo5231M();
                                break;
                            case "name":
/* 655 */                       c1603h.f11325a = interfaceC1489i3.mo5231M();
                                break;
                            case "low_memory":
/* 647 */                       c1603h.f11326a0 = interfaceC1489i3.mo5242q0();
                                break;
                            case "archs":
/* 626 */                       List list = (List) interfaceC1489i3.mo5232R0();
/* 628 */                       if (list == null) {
                                    break;
                                } else {
/* 634 */                           String[] strArr = new String[list.size()];
/* 636 */                           list.toArray(strArr);
/* 639 */                           c1603h.f11339i = strArr;
                                    break;
                                }
                                break;
                            case "brand":
/* 618 */                       c1603h.f11329c = interfaceC1489i3.mo5231M();
                                break;
                            case "model":
/* 610 */                       c1603h.f11333e = interfaceC1489i3.mo5231M();
                                break;
                            case "cpu_description":
/* 602 */                       c1603h.f11349r0 = interfaceC1489i3.mo5231M();
                                break;
                            case "processor_frequency":
/* 594 */                       c1603h.f11348q0 = interfaceC1489i3.mo5234b0();
                                break;
                            case "connection_type":
/* 586 */                       c1603h.f11345n0 = interfaceC1489i3.mo5231M();
                                break;
                            case "chipset":
/* 578 */                       c1603h.f11350s0 = interfaceC1489i3.mo5231M();
                                break;
                            case "screen_width_pixels":
/* 570 */                       c1603h.f11336f0 = interfaceC1489i3.mo5243r();
                                break;
                            case "external_storage_size":
/* 562 */                       c1603h.f11332d0 = interfaceC1489i3.mo5227B();
                                break;
                            case "storage_size":
/* 554 */                       c1603h.f11328b0 = interfaceC1489i3.mo5227B();
                                break;
                            case "usable_memory":
/* 546 */                       c1603h.f11324Z = interfaceC1489i3.mo5227B();
                                break;
                            case "memory_size":
/* 538 */                       c1603h.f11322X = interfaceC1489i3.mo5227B();
                                break;
                            case "charging":
/* 530 */                       c1603h.f11353w = interfaceC1489i3.mo5242q0();
                                break;
                            case "external_free_storage":
/* 522 */                       c1603h.f11334e0 = interfaceC1489i3.mo5227B();
                                break;
                            case "free_storage":
/* 514 */                       c1603h.f11330c0 = interfaceC1489i3.mo5227B();
                                break;
                            case "screen_height_pixels":
/* 506 */                       c1603h.f11337g0 = interfaceC1489i3.mo5243r();
                                break;
                            default:
/* 490 */                       if (concurrentHashMap == null) {
/* 494 */                           concurrentHashMap = new ConcurrentHashMap();
                                }
/* 497 */                       interfaceC1489i3.mo5244w(iLogger, concurrentHashMap, strNextName);
                                break;
                        }
                    }
/* 802 */           c1603h.f11351t0 = concurrentHashMap;
/* 804 */           interfaceC1489i3.endObject();
/* 807 */           return c1603h;
                }

                /* JADX INFO: renamed from: e */
                public static C1609k m5151e(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 1 */             interfaceC1489i3.beginObject();
/* 4 */             String strMo5231M = null;
/* 5 */             String strMo5231M2 = null;
/* 6 */             String strMo5231M3 = null;
/* 7 */             C1626w c1626w = null;
/* 8 */             C1626w c1626w2 = null;
/* 9 */             String strMo5231M4 = null;
/* 10 */            HashMap map = null;
/* 17 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 19 */                String strNextName = interfaceC1489i3.nextName();
/* 23 */                strNextName.getClass();
                        switch (strNextName) {
                            case "associated_event_id":
/* 151 */                       c1626w = new C1626w(interfaceC1489i3.nextString());
                                break;
                            case "replay_id":
/* 140 */                       c1626w2 = new C1626w(interfaceC1489i3.nextString());
                                break;
                            case "url":
/* 129 */                       strMo5231M4 = interfaceC1489i3.mo5231M();
                                break;
                            case "name":
/* 124 */                       strMo5231M3 = interfaceC1489i3.mo5231M();
                                break;
                            case "contact_email":
/* 119 */                       strMo5231M2 = interfaceC1489i3.mo5231M();
                                break;
                            case "message":
/* 114 */                       strMo5231M = interfaceC1489i3.mo5231M();
                                break;
                            default:
/* 103 */                       if (map == null) {
/* 107 */                           map = new HashMap();
                                }
/* 110 */                       interfaceC1489i3.mo5244w(iLogger, map, strNextName);
                                break;
                        }
                    }
/* 156 */           interfaceC1489i3.endObject();
/* 159 */           if (strMo5231M == null) {
/* 183 */               IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
/* 188 */               iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"message\"", illegalStateException);
/* 191 */               throw illegalStateException;
                    }
/* 163 */           C1609k c1609k = new C1609k(strMo5231M);
/* 166 */           c1609k.f11370b = strMo5231M2;
/* 168 */           c1609k.f11371c = strMo5231M3;
/* 170 */           c1609k.f11372d = c1626w;
/* 172 */           c1609k.f11373e = c1626w2;
/* 174 */           c1609k.f11374f = strMo5231M4;
/* 176 */           c1609k.f11375i = map;
/* 178 */           return c1609k;
                }

                /* JADX INFO: renamed from: f */
                public static C1613m m5152f(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 1 */             interfaceC1489i3.beginObject();
/* 6 */             C1613m c1613m = new C1613m();
/* 9 */             ConcurrentHashMap concurrentHashMap = null;
/* 16 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 18 */                String strNextName = interfaceC1489i3.nextName();
/* 22 */                strNextName.getClass();
                        switch (strNextName) {
                            case "npot_support":
/* 219 */                       c1613m.f11404w = interfaceC1489i3.mo5231M();
                                break;
                            case "vendor_id":
/* 211 */                       c1613m.f11398c = interfaceC1489i3.mo5231M();
                                break;
                            case "multi_threaded_rendering":
/* 203 */                       c1613m.f11402i = interfaceC1489i3.mo5242q0();
                                break;
                            case "id":
/* 195 */                       c1613m.f11397b = interfaceC1489i3.mo5243r();
                                break;
                            case "name":
/* 187 */                       c1613m.f11396a = interfaceC1489i3.mo5231M();
                                break;
                            case "vendor_name":
/* 179 */                       c1613m.f11399d = interfaceC1489i3.mo5231M();
                                break;
                            case "version":
/* 171 */                       c1613m.f11403v = interfaceC1489i3.mo5231M();
                                break;
                            case "api_type":
/* 163 */                       c1613m.f11401f = interfaceC1489i3.mo5231M();
                                break;
                            case "memory_size":
/* 155 */                       c1613m.f11400e = interfaceC1489i3.mo5243r();
                                break;
                            default:
/* 139 */                       if (concurrentHashMap == null) {
/* 143 */                           concurrentHashMap = new ConcurrentHashMap();
                                }
/* 146 */                       interfaceC1489i3.mo5244w(iLogger, concurrentHashMap, strNextName);
                                break;
                        }
                    }
/* 223 */           c1613m.f11395U = concurrentHashMap;
/* 225 */           interfaceC1489i3.endObject();
/* 228 */           return c1613m;
                }

                /* JADX INFO: renamed from: g */
                public static C1620q m5153g(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 1 */             interfaceC1489i3.beginObject();
/* 6 */             C1620q c1620q = new C1620q();
/* 9 */             ConcurrentHashMap concurrentHashMap = null;
/* 16 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 18 */                String strNextName = interfaceC1489i3.nextName();
/* 22 */                strNextName.getClass();
                        switch (strNextName) {
                            case "rooted":
/* 154 */                       c1620q.f11441f = interfaceC1489i3.mo5242q0();
                                break;
                            case "raw_description":
/* 146 */                       c1620q.f11438c = interfaceC1489i3.mo5231M();
                                break;
                            case "name":
/* 138 */                       c1620q.f11436a = interfaceC1489i3.mo5231M();
                                break;
                            case "build":
/* 131 */                       c1620q.f11439d = interfaceC1489i3.mo5231M();
                                break;
                            case "version":
/* 124 */                       c1620q.f11437b = interfaceC1489i3.mo5231M();
                                break;
                            case "kernel_version":
/* 117 */                       c1620q.f11440e = interfaceC1489i3.mo5231M();
                                break;
                            default:
/* 102 */                       if (concurrentHashMap == null) {
/* 106 */                           concurrentHashMap = new ConcurrentHashMap();
                                }
/* 109 */                       interfaceC1489i3.mo5244w(iLogger, concurrentHashMap, strNextName);
                                break;
                        }
                    }
/* 158 */           c1620q.f11442i = concurrentHashMap;
/* 160 */           interfaceC1489i3.endObject();
/* 163 */           return c1620q;
                }

                /* JADX INFO: renamed from: h */
                public static IllegalStateException m5154h(String str, ILogger iLogger) {
/* 5 */             String strM3784j = fm0.m3784j("Missing required field \"", str, "\"");
/* 11 */            IllegalStateException illegalStateException = new IllegalStateException(strM3784j);
/* 16 */            iLogger.mo4671d(EnumC1553m5.ERROR, strM3784j, illegalStateException);
/* 19 */            return illegalStateException;
                }

                /* JADX INFO: renamed from: i */
                public static IllegalStateException m5155i(String str, ILogger iLogger) {
/* 5 */             String strM3784j = fm0.m3784j("Missing required field \"", str, "\"");
/* 11 */            IllegalStateException illegalStateException = new IllegalStateException(strM3784j);
/* 16 */            iLogger.mo4671d(EnumC1553m5.ERROR, strM3784j, illegalStateException);
/* 19 */            return illegalStateException;
                }

                /* JADX INFO: renamed from: j */
                public static IllegalStateException m5156j(String str, ILogger iLogger) {
/* 5 */             String strM3784j = fm0.m3784j("Missing required field \"", str, "\"");
/* 11 */            IllegalStateException illegalStateException = new IllegalStateException(strM3784j);
/* 16 */            iLogger.mo4671d(EnumC1553m5.ERROR, strM3784j, illegalStateException);
/* 19 */            return illegalStateException;
                }

                @Override // io.sentry.InterfaceC1696u1
                /* JADX INFO: renamed from: a */
                public final Object mo5157a(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
                    Double dValueOf;
/* 28 */            int i = 7;
/* 33 */            int i2 = 3;
/* 38 */            int i3 = 1;
/* 41 */            Boolean boolMo5242q0 = null;
                    switch (this.f10834a) {
                        case 0:
/* 3671 */                  ArrayList arrayList = new ArrayList();
/* 3674 */                  interfaceC1489i3.beginObject();
/* 3677 */                  Date dateMo5241l0 = null;
/* 3679 */                  HashMap map = null;
/* 3686 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 3688 */                      String strNextName = interfaceC1489i3.nextName();
/* 3692 */                      strNextName.getClass();
/* 3701 */                      if (strNextName.equals("discarded_events")) {
/* 3734 */                          arrayList.addAll(interfaceC1489i3.mo5239h1(iLogger, new C1411a(i3)));
                                } else if (strNextName.equals("timestamp")) {
/* 3720 */                          dateMo5241l0 = interfaceC1489i3.mo5241l0(iLogger);
                                } else {
/* 3709 */                          if (map == null) {
/* 3713 */                              map = new HashMap();
                                    }
/* 3716 */                          interfaceC1489i3.mo5244w(iLogger, map, strNextName);
                                }
                            }
/* 3738 */                  interfaceC1489i3.endObject();
/* 3741 */                  if (dateMo5241l0 == null) {
/* 3768 */                      throw m5154h("timestamp", iLogger);
                            }
/* 3747 */                  if (arrayList.isEmpty()) {
/* 3763 */                      throw m5154h("discarded_events", iLogger);
                            }
/* 3751 */                  C1412b c1412b = new C1412b(dateMo5241l0, arrayList);
/* 3754 */                  c1412b.f10837c = map;
/* 3756 */                  return c1412b;
                        case 1:
/* 3535 */                  interfaceC1489i3.beginObject();
/* 3538 */                  String strMo5231M = null;
/* 3540 */                  String strMo5231M2 = null;
/* 3541 */                  Long lMo5227B = null;
/* 3542 */                  HashMap map2 = null;
/* 3549 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 3551 */                      String strNextName2 = interfaceC1489i3.nextName();
/* 3555 */                      strNextName2.getClass();
                                switch (strNextName2) {
                                    case "quantity":
/* 3626 */                              lMo5227B = interfaceC1489i3.mo5227B();
                                        break;
                                    case "reason":
/* 3621 */                              strMo5231M = interfaceC1489i3.mo5231M();
                                        break;
                                    case "category":
/* 3616 */                              strMo5231M2 = interfaceC1489i3.mo5231M();
                                        break;
                                    default:
/* 3605 */                              if (map2 == null) {
/* 3609 */                                  map2 = new HashMap();
                                        }
/* 3612 */                              interfaceC1489i3.mo5244w(iLogger, map2, strNextName2);
                                        break;
                                }
                            }
/* 3631 */                  interfaceC1489i3.endObject();
/* 3634 */                  if (strMo5231M == null) {
/* 3668 */                      throw m5155i("reason", iLogger);
                            }
/* 3636 */                  if (strMo5231M2 == null) {
/* 3661 */                      throw m5155i("category", iLogger);
                            }
/* 3638 */                  if (lMo5227B == null) {
/* 3654 */                      throw m5155i(FirebaseAnalytics.Param.QUANTITY, iLogger);
                            }
/* 3642 */                  C1415e c1415e = new C1415e(strMo5231M, strMo5231M2, lMo5227B);
/* 3645 */                  c1415e.f10843d = map2;
/* 3647 */                  return c1415e;
                        case 2:
/* 3447 */                  interfaceC1489i3.beginObject();
/* 3459 */                  C1585a c1585a = new C1585a("unknown", new ArrayList());
/* 3462 */                  ConcurrentHashMap concurrentHashMap = null;
/* 3470 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 3472 */                      String strNextName3 = interfaceC1489i3.nextName();
/* 3476 */                      strNextName3.getClass();
/* 3485 */                      if (strNextName3.equals("values")) {
/* 3520 */                          ArrayList arrayListMo5239h1 = interfaceC1489i3.mo5239h1(iLogger, new C1411a(i2));
/* 3524 */                          if (arrayListMo5239h1 != null) {
/* 3526 */                              c1585a.f11232c = arrayListMo5239h1;
                                    }
                                } else if (strNextName3.equals("unit")) {
/* 3506 */                          String strMo5231M3 = interfaceC1489i3.mo5231M();
/* 3510 */                          if (strMo5231M3 != null) {
/* 3512 */                              c1585a.f11231b = strMo5231M3;
                                    }
                                } else {
/* 3495 */                          if (concurrentHashMap == null) {
/* 3499 */                              concurrentHashMap = new ConcurrentHashMap();
                                    }
/* 3502 */                          interfaceC1489i3.mo5244w(iLogger, concurrentHashMap, strNextName3);
                                }
                            }
/* 3529 */                  c1585a.f11230a = concurrentHashMap;
/* 3531 */                  interfaceC1489i3.endObject();
/* 3534 */                  return c1585a;
                        case 3:
/* 3291 */                  interfaceC1489i3.beginObject();
/* 3306 */                  C1586b c1586b = new C1586b(0L, 0, 0L);
/* 3309 */                  ConcurrentHashMap concurrentHashMap2 = null;
/* 3317 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 3319 */                      String strNextName4 = interfaceC1489i3.nextName();
/* 3323 */                      strNextName4.getClass();
                                switch (strNextName4) {
                                    case "elapsed_since_start_ns":
/* 3431 */                              String strMo5231M4 = interfaceC1489i3.mo5231M();
/* 3435 */                              if (strMo5231M4 != null) {
/* 3437 */                                  c1586b.f11235c = strMo5231M4;
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "timestamp":
                                        try {
/* 3393 */                                  dValueOf = interfaceC1489i3.mo5234b0();
                                            break;
                                        } catch (NumberFormatException unused) {
/* 3398 */                                  Date dateMo5241l1 = interfaceC1489i3.mo5241l0(iLogger);
/* 3420 */                                  dValueOf = dateMo5241l1 != null ? Double.valueOf(dateMo5241l1.getTime() / 1000.0d) : null;
                                        }
/* 3422 */                              if (dValueOf != null) {
/* 3428 */                                  c1586b.f11234b = dValueOf.doubleValue();
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "value":
/* 3380 */                              Double dMo5234b0 = interfaceC1489i3.mo5234b0();
/* 3384 */                              if (dMo5234b0 != null) {
/* 3390 */                                  c1586b.f11236d = dMo5234b0.doubleValue();
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    default:
/* 3369 */                              if (concurrentHashMap2 == null) {
/* 3373 */                                  concurrentHashMap2 = new ConcurrentHashMap();
                                        }
/* 3376 */                              interfaceC1489i3.mo5244w(iLogger, concurrentHashMap2, strNextName4);
                                        break;
                                }
                            }
/* 3441 */                  c1586b.f11233a = concurrentHashMap2;
/* 3443 */                  interfaceC1489i3.endObject();
/* 3446 */                  return c1586b;
                        case 4:
/* 3286 */                  return m5148b(interfaceC1489i3, iLogger);
                        case 5:
/* 3218 */                  interfaceC1489i3.beginObject();
/* 3223 */                  C1595d c1595d = new C1595d();
/* 3226 */                  ConcurrentHashMap concurrentHashMap3 = null;
/* 3234 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 3236 */                      String strNextName5 = interfaceC1489i3.nextName();
/* 3240 */                      strNextName5.getClass();
/* 3247 */                      if (strNextName5.equals("name")) {
/* 3277 */                          c1595d.f11290a = interfaceC1489i3.mo5231M();
                                } else if (strNextName5.equals("version")) {
/* 3270 */                          c1595d.f11291b = interfaceC1489i3.mo5231M();
                                } else {
/* 3255 */                          if (concurrentHashMap3 == null) {
/* 3259 */                              concurrentHashMap3 = new ConcurrentHashMap();
                                    }
/* 3262 */                          interfaceC1489i3.mo5244w(iLogger, concurrentHashMap3, strNextName5);
                                }
                            }
/* 3280 */                  c1595d.f11292c = concurrentHashMap3;
/* 3282 */                  interfaceC1489i3.endObject();
/* 3285 */                  return c1595d;
                        case 6:
/* 3213 */                  return m5149c(interfaceC1489i3, iLogger);
                        case 7:
/* 2977 */                  DebugImage debugImage = new DebugImage();
/* 2980 */                  interfaceC1489i3.beginObject();
/* 2983 */                  AbstractMap map3 = null;
/* 2991 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 2993 */                      String strNextName6 = interfaceC1489i3.nextName();
/* 2997 */                      strNextName6.getClass();
                                switch (strNextName6) {
                                    case "debug_file":
/* 1 */                                 debugImage.debugFile = interfaceC1489i3.mo5231M();
                                        break;
                                    case "image_addr":
/* 1 */                                 debugImage.imageAddr = interfaceC1489i3.mo5231M();
                                        break;
                                    case "image_size":
/* 1 */                                 debugImage.imageSize = interfaceC1489i3.mo5227B();
                                        break;
                                    case "code_file":
/* 1 */                                 debugImage.codeFile = interfaceC1489i3.mo5231M();
                                        break;
                                    case "arch":
/* 1 */                                 debugImage.arch = interfaceC1489i3.mo5231M();
                                        break;
                                    case "type":
/* 1 */                                 debugImage.type = interfaceC1489i3.mo5231M();
                                        break;
                                    case "uuid":
/* 1 */                                 debugImage.uuid = interfaceC1489i3.mo5231M();
                                        break;
                                    case "debug_id":
/* 1 */                                 debugImage.debugId = interfaceC1489i3.mo5231M();
                                        break;
                                    case "code_id":
/* 1 */                                 debugImage.codeId = interfaceC1489i3.mo5231M();
                                        break;
                                    default:
/* 3113 */                              if (map3 == null) {
/* 3117 */                                  map3 = new HashMap();
                                        }
/* 3120 */                              interfaceC1489i3.mo5244w(iLogger, map3, strNextName6);
                                        break;
                                }
                            }
/* 3206 */                  interfaceC1489i3.endObject();
/* 3209 */                  debugImage.setUnknown(map3);
/* 3212 */                  return debugImage;
                        case 8:
/* 2891 */                  C1599f c1599f = new C1599f();
/* 2894 */                  interfaceC1489i3.beginObject();
/* 2897 */                  HashMap map4 = null;
/* 2905 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 2907 */                      String strNextName7 = interfaceC1489i3.nextName();
/* 2911 */                      strNextName7.getClass();
/* 2920 */                      if (strNextName7.equals("images")) {
/* 2966 */                          c1599f.f11308b = interfaceC1489i3.mo5239h1(iLogger, new C1411a(i));
                                } else if (strNextName7.equals("sdk_info")) {
/* 2954 */                          c1599f.f11307a = (C1623t) interfaceC1489i3.mo5230K0(iLogger, new C1411a(20));
                                } else {
/* 2930 */                          if (map4 == null) {
/* 2934 */                              map4 = new HashMap();
                                    }
/* 2937 */                          interfaceC1489i3.mo5244w(iLogger, map4, strNextName7);
                                }
                            }
/* 2969 */                  interfaceC1489i3.endObject();
/* 2972 */                  c1599f.f11309c = map4;
/* 2974 */                  return c1599f;
                        case 9:
/* 2884 */                  return m5150d(interfaceC1489i3, iLogger);
                        case 10:
/* 2879 */                  return EnumC1601g.valueOf(interfaceC1489i3.nextString().toUpperCase(Locale.ROOT));
                        case 11:
/* 2764 */                  interfaceC1489i3.beginObject();
/* 2767 */                  String strMo5231M5 = null;
/* 2769 */                  ConcurrentHashMap concurrentHashMap4 = null;
/* 2776 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 2778 */                      String strNextName8 = interfaceC1489i3.nextName();
/* 2782 */                      strNextName8.getClass();
/* 2791 */                      if (strNextName8.equals("result")) {
/* 2817 */                          boolMo5242q0 = interfaceC1489i3.mo5242q0();
                                } else if (strNextName8.equals("flag")) {
/* 2812 */                          strMo5231M5 = interfaceC1489i3.mo5231M();
                                } else {
/* 2801 */                          if (concurrentHashMap4 == null) {
/* 2805 */                              concurrentHashMap4 = new ConcurrentHashMap();
                                    }
/* 2808 */                          interfaceC1489i3.mo5244w(iLogger, concurrentHashMap4, strNextName8);
                                }
                            }
/* 2824 */                  if (strMo5231M5 == null) {
/* 2860 */                      IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
/* 2865 */                      iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"flag\"", illegalStateException);
/* 2868 */                      throw illegalStateException;
                            }
/* 2826 */                  if (boolMo5242q0 == null) {
/* 2847 */                      IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
/* 2852 */                      iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"result\"", illegalStateException2);
/* 2855 */                      throw illegalStateException2;
                            }
/* 2834 */                  C1605i c1605i = new C1605i(strMo5231M5, boolMo5242q0.booleanValue());
/* 2837 */                  c1605i.f11358c = concurrentHashMap4;
/* 2839 */                  interfaceC1489i3.endObject();
/* 2842 */                  return c1605i;
                        case 12:
/* 2759 */                  return m5151e(interfaceC1489i3, iLogger);
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 2649 */                  interfaceC1489i3.beginObject();
/* 2654 */                  C1611l c1611l = new C1611l();
/* 2657 */                  ConcurrentHashMap concurrentHashMap5 = null;
/* 2665 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 2667 */                      String strNextName9 = interfaceC1489i3.nextName();
/* 2671 */                      strNextName9.getClass();
                                switch (strNextName9) {
                                    case "region":
/* 2750 */                              c1611l.f11381c = interfaceC1489i3.mo5231M();
                                        break;
                                    case "city":
/* 2743 */                              c1611l.f11379a = interfaceC1489i3.mo5231M();
                                        break;
                                    case "country_code":
/* 2736 */                              c1611l.f11380b = interfaceC1489i3.mo5231M();
                                        break;
                                    default:
/* 2721 */                              if (concurrentHashMap5 == null) {
/* 2725 */                                  concurrentHashMap5 = new ConcurrentHashMap();
                                        }
/* 2728 */                              interfaceC1489i3.mo5244w(iLogger, concurrentHashMap5, strNextName9);
                                        break;
                                }
                            }
/* 2753 */                  c1611l.f11382d = concurrentHashMap5;
/* 2755 */                  interfaceC1489i3.endObject();
/* 2758 */                  return c1611l;
                        case 14:
/* 2644 */                  return m5152f(interfaceC1489i3, iLogger);
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 2559 */                  interfaceC1489i3.beginObject();
/* 2562 */                  Number number = null;
/* 2564 */                  String strMo5231M6 = null;
/* 2565 */                  AbstractMap concurrentHashMap6 = null;
/* 2572 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 2574 */                      String strNextName10 = interfaceC1489i3.nextName();
/* 2578 */                      strNextName10.getClass();
/* 2587 */                      if (strNextName10.equals("unit")) {
/* 2613 */                          strMo5231M6 = interfaceC1489i3.mo5231M();
                                } else if (strNextName10.equals(FirebaseAnalytics.Param.VALUE)) {
/* 2610 */                          number = (Number) interfaceC1489i3.mo5232R0();
                                } else {
/* 2595 */                          if (concurrentHashMap6 == null) {
/* 2599 */                              concurrentHashMap6 = new ConcurrentHashMap();
                                    }
/* 2602 */                          interfaceC1489i3.mo5244w(iLogger, concurrentHashMap6, strNextName10);
                                }
                            }
/* 2618 */                  interfaceC1489i3.endObject();
/* 2621 */                  if (number != null) {
/* 2625 */                      C1614n c1614n = new C1614n(strMo5231M6, number);
/* 2628 */                      c1614n.f11408d = concurrentHashMap6;
/* 2630 */                      return c1614n;
                            }
/* 2635 */                  IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"value\"");
/* 2640 */                  iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"value\"", illegalStateException3);
/* 2643 */                  throw illegalStateException3;
                        case 16:
/* 2300 */                  C1615o c1615o = new C1615o();
/* 2303 */                  interfaceC1489i3.beginObject();
/* 2306 */                  HashMap map5 = null;
/* 2314 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 2316 */                      String strNextName11 = interfaceC1489i3.nextName();
/* 2320 */                      strNextName11.getClass();
                                switch (strNextName11) {
                                    case "description":
/* 2549 */                              c1615o.f11412b = interfaceC1489i3.mo5231M();
                                        break;
                                    case "exception_id":
/* 2541 */                              c1615o.f11418v = interfaceC1489i3.mo5243r();
                                        break;
                                    case "data":
/* 2533 */                              c1615o.f11416f = AbstractC1704c.m5459n((Map) interfaceC1489i3.mo5232R0());
                                        break;
                                    case "meta":
/* 2519 */                              c1615o.f11415e = AbstractC1704c.m5459n((Map) interfaceC1489i3.mo5232R0());
                                        break;
                                    case "type":
/* 2505 */                              c1615o.f11411a = interfaceC1489i3.mo5231M();
                                        break;
                                    case "handled":
/* 2497 */                              c1615o.f11414d = interfaceC1489i3.mo5242q0();
                                        break;
                                    case "synthetic":
/* 2489 */                              c1615o.f11417i = interfaceC1489i3.mo5242q0();
                                        break;
                                    case "is_exception_group":
/* 2481 */                              c1615o.f11409U = interfaceC1489i3.mo5242q0();
                                        break;
                                    case "help_link":
/* 2473 */                              c1615o.f11413c = interfaceC1489i3.mo5231M();
                                        break;
                                    case "parent_id":
/* 2465 */                              c1615o.f11419w = interfaceC1489i3.mo5243r();
                                        break;
                                    default:
/* 2449 */                              if (map5 == null) {
/* 2453 */                                  map5 = new HashMap();
                                        }
/* 2456 */                              interfaceC1489i3.mo5244w(iLogger, map5, strNextName11);
                                        break;
                                }
                            }
/* 2553 */                  interfaceC1489i3.endObject();
/* 2556 */                  c1615o.f11410V = map5;
/* 2558 */                  return c1615o;
                        case 17:
/* 2184 */                  interfaceC1489i3.beginObject();
/* 2189 */                  C1616p c1616p = new C1616p();
/* 2192 */                  ConcurrentHashMap concurrentHashMap7 = null;
/* 2200 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 2202 */                      String strNextName12 = interfaceC1489i3.nextName();
/* 2206 */                      strNextName12.getClass();
                                switch (strNextName12) {
                                    case "params":
/* 2285 */                              List list = (List) interfaceC1489i3.mo5232R0();
/* 2287 */                              if (list != null) {
/* 2289 */                                  c1616p.f11422c = list;
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "message":
/* 2278 */                              c1616p.f11421b = interfaceC1489i3.mo5231M();
                                        break;
                                    case "formatted":
/* 2271 */                              c1616p.f11420a = interfaceC1489i3.mo5231M();
                                        break;
                                    default:
/* 2256 */                              if (concurrentHashMap7 == null) {
/* 2260 */                                  concurrentHashMap7 = new ConcurrentHashMap();
                                        }
/* 2263 */                              interfaceC1489i3.mo5244w(iLogger, concurrentHashMap7, strNextName12);
                                        break;
                                }
                            }
/* 2292 */                  c1616p.f11423d = concurrentHashMap7;
/* 2294 */                  interfaceC1489i3.endObject();
/* 2297 */                  return c1616p;
                        case 18:
/* 2179 */                  return m5153g(interfaceC1489i3, iLogger);
                        case 19:
/* 1882 */                  interfaceC1489i3.beginObject();
/* 1887 */                  C1621r c1621r = new C1621r();
/* 1890 */                  ConcurrentHashMap concurrentHashMap8 = null;
/* 1898 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 1900 */                      String strNextName13 = interfaceC1489i3.nextName();
/* 1904 */                      strNextName13.getClass();
                                switch (strNextName13) {
                                    case "fragment":
/* 2169 */                              c1621r.f11443U = interfaceC1489i3.mo5231M();
                                        break;
                                    case "method":
/* 2161 */                              c1621r.f11447b = interfaceC1489i3.mo5231M();
                                        break;
                                    case "env":
/* 2145 */                              Map map6 = (Map) interfaceC1489i3.mo5232R0();
/* 2147 */                              if (map6 != null) {
/* 2153 */                                  c1621r.f11452i = AbstractC1704c.m5459n(map6);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "url":
/* 2137 */                              c1621r.f11446a = interfaceC1489i3.mo5231M();
                                        break;
                                    case "data":
/* 2129 */                              c1621r.f11449d = interfaceC1489i3.mo5232R0();
                                        break;
                                    case "other":
/* 2113 */                              Map map7 = (Map) interfaceC1489i3.mo5232R0();
/* 2115 */                              if (map7 != null) {
/* 2121 */                                  c1621r.f11454w = AbstractC1704c.m5459n(map7);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "headers":
/* 2097 */                              Map map8 = (Map) interfaceC1489i3.mo5232R0();
/* 2099 */                              if (map8 != null) {
/* 2105 */                                  c1621r.f11451f = AbstractC1704c.m5459n(map8);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "cookies":
/* 2089 */                              c1621r.f11450e = interfaceC1489i3.mo5231M();
                                        break;
                                    case "body_size":
/* 2081 */                              c1621r.f11453v = interfaceC1489i3.mo5227B();
                                        break;
                                    case "query_string":
/* 2073 */                              c1621r.f11448c = interfaceC1489i3.mo5231M();
                                        break;
                                    case "api_target":
/* 2065 */                              c1621r.f11444V = interfaceC1489i3.mo5231M();
                                        break;
                                    default:
/* 2049 */                              if (concurrentHashMap8 == null) {
/* 2053 */                                  concurrentHashMap8 = new ConcurrentHashMap();
                                        }
/* 2056 */                              interfaceC1489i3.mo5244w(iLogger, concurrentHashMap8, strNextName13);
                                        break;
                                }
                            }
/* 2173 */                  c1621r.f11445W = concurrentHashMap8;
/* 2175 */                  interfaceC1489i3.endObject();
/* 2178 */                  return c1621r;
                        case 20:
/* 1756 */                  C1623t c1623t = new C1623t();
/* 1759 */                  interfaceC1489i3.beginObject();
/* 1762 */                  HashMap map9 = null;
/* 1770 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 1772 */                      String strNextName14 = interfaceC1489i3.nextName();
/* 1776 */                      strNextName14.getClass();
                                switch (strNextName14) {
                                    case "sdk_name":
/* 1873 */                              c1623t.f11461a = interfaceC1489i3.mo5231M();
                                        break;
                                    case "version_patchlevel":
/* 1866 */                              c1623t.f11464d = interfaceC1489i3.mo5243r();
                                        break;
                                    case "version_major":
/* 1859 */                              c1623t.f11462b = interfaceC1489i3.mo5243r();
                                        break;
                                    case "version_minor":
/* 1852 */                              c1623t.f11463c = interfaceC1489i3.mo5243r();
                                        break;
                                    default:
/* 1837 */                              if (map9 == null) {
/* 1841 */                                  map9 = new HashMap();
                                        }
/* 1844 */                              interfaceC1489i3.mo5244w(iLogger, map9, strNextName14);
                                        break;
                                }
                            }
/* 1876 */                  interfaceC1489i3.endObject();
/* 1879 */                  c1623t.f11465e = map9;
/* 1881 */                  return c1623t;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 1565 */                  ArrayList arrayList2 = new ArrayList();
/* 1570 */                  ArrayList arrayList3 = new ArrayList();
/* 1573 */                  interfaceC1489i3.beginObject();
/* 1576 */                  String strNextString = null;
/* 1578 */                  String strNextString2 = null;
/* 1579 */                  HashMap map10 = null;
/* 1586 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 1588 */                      String strNextName15 = interfaceC1489i3.nextName();
/* 1592 */                      strNextName15.getClass();
                                switch (strNextName15) {
                                    case "name":
/* 1694 */                              strNextString = interfaceC1489i3.nextString();
                                        break;
                                    case "version":
/* 1689 */                              strNextString2 = interfaceC1489i3.nextString();
                                        break;
                                    case "packages":
/* 1679 */                              ArrayList arrayListMo5239h2 = interfaceC1489i3.mo5239h1(iLogger, new C1411a(24));
/* 1683 */                              if (arrayListMo5239h2 != null) {
/* 1685 */                                  arrayList2.addAll(arrayListMo5239h2);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "integrations":
/* 1664 */                              List list2 = (List) interfaceC1489i3.mo5232R0();
/* 1666 */                              if (list2 != null) {
/* 1668 */                                  arrayList3.addAll(list2);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    default:
/* 1649 */                              if (map10 == null) {
/* 1653 */                                  map10 = new HashMap();
                                        }
/* 1656 */                              interfaceC1489i3.mo5244w(iLogger, map10, strNextName15);
                                        break;
                                }
                            }
/* 1699 */                  interfaceC1489i3.endObject();
/* 1702 */                  if (strNextString == null) {
/* 1745 */                      IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
/* 1750 */                      iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"name\"", illegalStateException4);
/* 1753 */                      throw illegalStateException4;
                            }
/* 1704 */                  if (strNextString2 == null) {
/* 1732 */                      IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"version\"");
/* 1737 */                      iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"version\"", illegalStateException5);
/* 1740 */                      throw illegalStateException5;
                            }
/* 1708 */                  C1624u c1624u = new C1624u(strNextString, strNextString2);
/* 1716 */                  c1624u.f11468c = new CopyOnWriteArraySet(arrayList2);
/* 1723 */                  c1624u.f11469d = new CopyOnWriteArraySet(arrayList3);
/* 1725 */                  c1624u.f11470e = map10;
/* 1727 */                  return c1624u;
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 1382 */                  C1625v c1625v = new C1625v();
/* 1385 */                  interfaceC1489i3.beginObject();
/* 1388 */                  HashMap map11 = null;
/* 1396 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 1398 */                      String strNextName16 = interfaceC1489i3.nextName();
/* 1402 */                      strNextName16.getClass();
                                switch (strNextName16) {
                                    case "thread_id":
/* 1553 */                              c1625v.f11474d = interfaceC1489i3.mo5227B();
                                        break;
                                    case "module":
/* 1545 */                              c1625v.f11473c = interfaceC1489i3.mo5231M();
                                        break;
                                    case "type":
/* 1537 */                              c1625v.f11471a = interfaceC1489i3.mo5231M();
                                        break;
                                    case "value":
/* 1529 */                              c1625v.f11472b = interfaceC1489i3.mo5231M();
                                        break;
                                    case "mechanism":
/* 1521 */                              c1625v.f11476f = (C1615o) interfaceC1489i3.mo5230K0(iLogger, new C1411a(16));
                                        break;
                                    case "stacktrace":
/* 1505 */                              c1625v.f11475e = (C1594c0) interfaceC1489i3.mo5230K0(iLogger, new C1411a(28));
                                        break;
                                    default:
/* 1481 */                              if (map11 == null) {
/* 1485 */                                  map11 = new HashMap();
                                        }
/* 1488 */                              interfaceC1489i3.mo5244w(iLogger, map11, strNextName16);
                                        break;
                                }
                            }
/* 1557 */                  interfaceC1489i3.endObject();
/* 1560 */                  c1625v.f11477i = map11;
/* 1562 */                  return c1625v;
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 1376 */                  return new C1626w(interfaceC1489i3.nextString());
                        case 24:
/* 1274 */                  interfaceC1489i3.beginObject();
/* 1277 */                  String strNextString3 = null;
/* 1279 */                  String strNextString4 = null;
/* 1280 */                  HashMap map12 = null;
/* 1287 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 1289 */                      String strNextName17 = interfaceC1489i3.nextName();
/* 1293 */                      strNextName17.getClass();
/* 1300 */                      if (strNextName17.equals("name")) {
/* 1324 */                          strNextString3 = interfaceC1489i3.nextString();
                                } else if (strNextName17.equals("version")) {
/* 1319 */                          strNextString4 = interfaceC1489i3.nextString();
                                } else {
/* 1308 */                          if (map12 == null) {
/* 1312 */                              map12 = new HashMap();
                                    }
/* 1315 */                          interfaceC1489i3.mo5244w(iLogger, map12, strNextName17);
                                }
                            }
/* 1329 */                  interfaceC1489i3.endObject();
/* 1332 */                  if (strNextString3 == null) {
/* 1361 */                      IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"name\"");
/* 1366 */                      iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"name\"", illegalStateException6);
/* 1369 */                      throw illegalStateException6;
                            }
/* 1334 */                  if (strNextString4 != null) {
/* 1338 */                      C1627x c1627x = new C1627x(strNextString3, strNextString4);
/* 1341 */                      c1627x.f11482c = map12;
/* 1343 */                      return c1627x;
                            }
/* 1348 */                  IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"version\"");
/* 1353 */                  iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"version\"", illegalStateException7);
/* 1356 */                  throw illegalStateException7;
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 1168 */                  interfaceC1489i3.beginObject();
/* 1173 */                  C1628y c1628y = new C1628y();
/* 1176 */                  ConcurrentHashMap concurrentHashMap9 = null;
/* 1184 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 1186 */                      String strNextName18 = interfaceC1489i3.nextName();
/* 1190 */                      strNextName18.getClass();
                                switch (strNextName18) {
                                    case "raw_description":
/* 1265 */                              c1628y.f11485c = interfaceC1489i3.mo5231M();
                                        break;
                                    case "name":
/* 1258 */                              c1628y.f11483a = interfaceC1489i3.mo5231M();
                                        break;
                                    case "version":
/* 1251 */                              c1628y.f11484b = interfaceC1489i3.mo5231M();
                                        break;
                                    default:
/* 1236 */                              if (concurrentHashMap9 == null) {
/* 1240 */                                  concurrentHashMap9 = new ConcurrentHashMap();
                                        }
/* 1243 */                              interfaceC1489i3.mo5244w(iLogger, concurrentHashMap9, strNextName18);
                                        break;
                                }
                            }
/* 1268 */                  c1628y.f11486d = concurrentHashMap9;
/* 1270 */                  interfaceC1489i3.endObject();
/* 1273 */                  return c1628y;
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 719 */                   interfaceC1489i3.beginObject();
/* 722 */                   ConcurrentHashMap concurrentHashMap10 = null;
/* 724 */                   Map map13 = null;
/* 725 */                   HashMap map14 = null;
/* 726 */                   Double dValueOf2 = null;
/* 728 */                   Double dValueOf3 = null;
/* 730 */                   C1626w c1626w = null;
/* 732 */                   C1430d7 c1430d7 = null;
/* 734 */                   C1430d7 c1430d8 = null;
/* 736 */                   String strMo5231M7 = null;
/* 738 */                   String strMo5231M8 = null;
/* 740 */                   EnumC1451f7 enumC1451f7 = null;
/* 742 */                   String strMo5231M9 = null;
/* 744 */                   Map map15 = null;
/* 752 */                   while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 754 */                       String strNextName19 = interfaceC1489i3.nextName();
/* 758 */                       strNextName19.getClass();
                                switch (strNextName19) {
                                    case "span_id":
/* 1094 */                              c1430d7 = new C1430d7(interfaceC1489i3.nextString());
                                        break;
                                    case "parent_span_id":
/* 1084 */                              c1430d8 = (C1430d7) interfaceC1489i3.mo5230K0(iLogger, new C1431e(23));
                                        break;
                                    case "description":
/* 1065 */                              strMo5231M8 = interfaceC1489i3.mo5231M();
                                        break;
                                    case "start_timestamp":
                                        try {
/* 1035 */                                  dValueOf2 = interfaceC1489i3.mo5234b0();
                                            break;
                                        } catch (NumberFormatException unused2) {
/* 1041 */                                  Date dateMo5241l2 = interfaceC1489i3.mo5241l0(iLogger);
/* 1061 */                                  dValueOf2 = dateMo5241l2 == null ? null : Double.valueOf(dateMo5241l2.getTime() / 1000.0d);
                                            break;
                                        }
                                        break;
                                    case "origin":
/* 1029 */                              strMo5231M9 = interfaceC1489i3.mo5231M();
                                        break;
                                    case "status":
/* 1025 */                              enumC1451f7 = (EnumC1451f7) interfaceC1489i3.mo5230K0(iLogger, new C1431e(24));
                                        break;
                                    case "measurements":
/* 1006 */                              map14 = interfaceC1489i3.mo5233T(iLogger, new C1411a(15));
                                        break;
                                    case "op":
/* 993 */                               strMo5231M7 = interfaceC1489i3.mo5231M();
                                        break;
                                    case "data":
/* 989 */                               map15 = (Map) interfaceC1489i3.mo5232R0();
                                        break;
                                    case "tags":
/* 979 */                               map13 = (Map) interfaceC1489i3.mo5232R0();
                                        break;
                                    case "timestamp":
                                        try {
/* 945 */                                   dValueOf3 = interfaceC1489i3.mo5234b0();
                                            break;
                                        } catch (NumberFormatException unused3) {
/* 951 */                                   Date dateMo5241l3 = interfaceC1489i3.mo5241l0(iLogger);
/* 971 */                                   dValueOf3 = dateMo5241l3 == null ? null : Double.valueOf(dateMo5241l3.getTime() / 1000.0d);
                                            break;
                                        }
                                        break;
                                    case "trace_id":
/* 938 */                               c1626w = new C1626w(interfaceC1489i3.nextString());
                                        break;
                                    default:
/* 920 */                               if (concurrentHashMap10 == null) {
/* 924 */                                   concurrentHashMap10 = new ConcurrentHashMap();
                                        }
/* 927 */                               interfaceC1489i3.mo5244w(iLogger, concurrentHashMap10, strNextName19);
                                        break;
                                }
                            }
/* 1101 */                  if (dValueOf2 == null) {
/* 1167 */                      throw m5156j("start_timestamp", iLogger);
                            }
/* 1103 */                  if (c1626w == null) {
/* 1160 */                      throw m5156j("trace_id", iLogger);
                            }
/* 1105 */                  if (c1430d7 == null) {
/* 1153 */                      throw m5156j("span_id", iLogger);
                            }
/* 1107 */                  if (strMo5231M7 == null) {
/* 1146 */                      throw m5156j("op", iLogger);
                            }
/* 1109 */                  if (map13 == null) {
/* 1113 */                      map13 = new HashMap();
                            }
/* 1116 */                  Map map16 = map13;
/* 1118 */                  if (map14 == null) {
/* 1122 */                      map14 = new HashMap();
                            }
/* 1129 */                  C1629z c1629z = new C1629z(dValueOf2, dValueOf3, c1626w, c1430d7, c1430d8, strMo5231M7, strMo5231M8, enumC1451f7, strMo5231M9, map16, map14, map15);
/* 1134 */                  c1629z.f11490X = concurrentHashMap10;
/* 1136 */                  interfaceC1489i3.endObject();
/* 1132 */                  return c1629z;
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 214 */                   C1590a0 c1590a0 = new C1590a0();
/* 217 */                   interfaceC1489i3.beginObject();
/* 220 */                   ConcurrentHashMap concurrentHashMap11 = null;
/* 228 */                   while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 230 */                       String strNextName20 = interfaceC1489i3.nextName();
/* 234 */                       strNextName20.getClass();
                                switch (strNextName20) {
                                    case "post_context":
/* 709 */                               c1590a0.f11259b = (List) interfaceC1489i3.mo5232R0();
                                        break;
                                    case "image_addr":
/* 699 */                               c1590a0.f11256Z = interfaceC1489i3.mo5231M();
                                        break;
                                    case "in_app":
/* 691 */                               c1590a0.f11252V = interfaceC1489i3.mo5242q0();
                                        break;
                                    case "raw_function":
/* 683 */                               c1590a0.f11268f0 = interfaceC1489i3.mo5231M();
                                        break;
                                    case "lineno":
/* 675 */                               c1590a0.f11270i = interfaceC1489i3.mo5243r();
                                        break;
                                    case "module":
/* 667 */                               c1590a0.f11267f = interfaceC1489i3.mo5231M();
                                        break;
                                    case "native":
/* 659 */                               c1590a0.f11254X = interfaceC1489i3.mo5242q0();
                                        break;
                                    case "symbol":
/* 651 */                               c1590a0.f11264d0 = interfaceC1489i3.mo5231M();
                                        break;
                                    case "package":
/* 643 */                               c1590a0.f11253W = interfaceC1489i3.mo5231M();
                                        break;
                                    case "filename":
/* 635 */                               c1590a0.f11263d = interfaceC1489i3.mo5231M();
                                        break;
                                    case "symbol_addr":
/* 627 */                               c1590a0.f11258a0 = interfaceC1489i3.mo5231M();
                                        break;
                                    case "lock":
/* 619 */                               c1590a0.f11269g0 = (C1566n5) interfaceC1489i3.mo5230K0(iLogger, new C1431e(12));
                                        break;
                                    case "vars":
/* 602 */                               c1590a0.f11261c = (Map) interfaceC1489i3.mo5232R0();
                                        break;
                                    case "colno":
/* 592 */                               c1590a0.f11271v = interfaceC1489i3.mo5243r();
                                        break;
                                    case "instruction_addr":
/* 584 */                               c1590a0.f11260b0 = interfaceC1489i3.mo5231M();
                                        break;
                                    case "pre_context":
/* 576 */                               c1590a0.f11257a = (List) interfaceC1489i3.mo5232R0();
                                        break;
                                    case "addr_mode":
/* 566 */                               c1590a0.f11262c0 = interfaceC1489i3.mo5231M();
                                        break;
                                    case "context_line":
/* 558 */                               c1590a0.f11251U = interfaceC1489i3.mo5231M();
                                        break;
                                    case "function":
/* 550 */                               c1590a0.f11265e = interfaceC1489i3.mo5231M();
                                        break;
                                    case "abs_path":
/* 542 */                               c1590a0.f11272w = interfaceC1489i3.mo5231M();
                                        break;
                                    case "platform":
/* 534 */                               c1590a0.f11255Y = interfaceC1489i3.mo5231M();
                                        break;
                                    default:
/* 518 */                               if (concurrentHashMap11 == null) {
/* 522 */                                   concurrentHashMap11 = new ConcurrentHashMap();
                                        }
/* 525 */                               interfaceC1489i3.mo5244w(iLogger, concurrentHashMap11, strNextName20);
                                        break;
                                }
                            }
/* 713 */                   c1590a0.f11266e0 = concurrentHashMap11;
/* 715 */                   interfaceC1489i3.endObject();
/* 718 */                   return c1590a0;
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 63 */                    C1594c0 c1594c0 = new C1594c0();
/* 66 */                    interfaceC1489i3.beginObject();
/* 69 */                    ConcurrentHashMap concurrentHashMap12 = null;
/* 77 */                    while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 79 */                        String strNextName21 = interfaceC1489i3.nextName();
/* 83 */                        strNextName21.getClass();
                                switch (strNextName21) {
                                    case "frames":
/* 202 */                               c1594c0.f11285a = interfaceC1489i3.mo5239h1(iLogger, new C1411a(27));
                                        break;
                                    case "instruction_addr_adjustment":
/* 188 */                               c1594c0.f11288d = (EnumC1592b0) interfaceC1489i3.mo5230K0(iLogger, new C1411a(29));
                                        break;
                                    case "registers":
/* 172 */                               c1594c0.f11286b = AbstractC1704c.m5459n((Map) interfaceC1489i3.mo5232R0());
                                        break;
                                    case "snapshot":
/* 159 */                               c1594c0.f11287c = interfaceC1489i3.mo5242q0();
                                        break;
                                    default:
/* 144 */                               if (concurrentHashMap12 == null) {
/* 148 */                                   concurrentHashMap12 = new ConcurrentHashMap();
                                        }
/* 151 */                               interfaceC1489i3.mo5244w(iLogger, concurrentHashMap12, strNextName21);
                                        break;
                                }
                            }
/* 206 */                   c1594c0.f11289e = concurrentHashMap12;
/* 208 */                   interfaceC1489i3.endObject();
/* 211 */                   return c1594c0;
                        default:
/* 56 */                    return EnumC1592b0.valueOf(interfaceC1489i3.nextString().toUpperCase(Locale.ROOT));
                    }
                }
            }
