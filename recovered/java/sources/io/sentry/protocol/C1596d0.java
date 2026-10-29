            package io.sentry.protocol;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1431e;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1489i3;
            import io.sentry.InterfaceC1696u1;
            import io.sentry.clientreport.C1411a;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.protocol.profiling.C1617a;
            import io.sentry.protocol.profiling.C1618b;
            import io.sentry.protocol.profiling.C1619c;
            import io.sentry.rrweb.C1646a;
            import io.sentry.rrweb.C1652g;
            import io.sentry.rrweb.C1653h;
            import io.sentry.rrweb.C1654i;
            import io.sentry.rrweb.C1655j;
            import io.sentry.rrweb.C1657l;
            import io.sentry.rrweb.C1658m;
            import io.sentry.rrweb.EnumC1648c;
            import io.sentry.rrweb.EnumC1649d;
            import io.sentry.rrweb.EnumC1651f;
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
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: io.sentry.protocol.d0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1596d0 implements InterfaceC1696u1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11293a;

                public /* synthetic */ C1596d0(int i) {
/* 1 */             this.f11293a = i;
                }

                /* JADX INFO: renamed from: b */
                public static C1646a m5370b(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 1 */             interfaceC1489i3.beginObject();
/* 6 */             C1646a c1646a = new C1646a();
/* 10 */            HashMap map = null;
/* 17 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 19 */                String strNextName = interfaceC1489i3.nextName();
/* 23 */                strNextName.getClass();
/* 38 */                if (strNextName.equals(SharedDataContentProvider.BASE_PATH)) {
/* 89 */                    interfaceC1489i3.beginObject();
/* 92 */                    ConcurrentHashMap concurrentHashMap = null;
/* 99 */                    while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 101 */                       String strNextName2 = interfaceC1489i3.nextName();
/* 105 */                       strNextName2.getClass();
/* 114 */                       if (strNextName2.equals("payload")) {
/* 145 */                           interfaceC1489i3.beginObject();
/* 148 */                           ConcurrentHashMap concurrentHashMap2 = null;
/* 155 */                           while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 157 */                               String strNextName3 = interfaceC1489i3.nextName();
/* 161 */                               strNextName3.getClass();
                                        switch (strNextName3) {
                                            case "data":
/* 313 */                                       ConcurrentHashMap concurrentHashMapM5459n = AbstractC1704c.m5459n((Map) interfaceC1489i3.mo5232R0());
/* 317 */                                       if (concurrentHashMapM5459n == null) {
                                                    break;
                                                } else {
/* 319 */                                           c1646a.f11587w = concurrentHashMapM5459n;
                                                    break;
                                                }
                                                break;
                                            case "type":
/* 303 */                                       c1646a.f11583e = interfaceC1489i3.mo5231M();
                                                break;
                                            case "category":
/* 295 */                                       c1646a.f11584f = interfaceC1489i3.mo5231M();
                                                break;
                                            case "timestamp":
/* 287 */                                       c1646a.f11582d = interfaceC1489i3.nextDouble();
                                                break;
                                            case "level":
                                                try {
/* 268 */                                           c1646a.f11586v = EnumC1553m5.valueOf(interfaceC1489i3.nextString().toUpperCase(Locale.ROOT));
                                                    break;
                                                } catch (Exception e) {
/* 278 */                                           iLogger.mo4670b(EnumC1553m5.DEBUG, e, "Error when deserializing SentryLevel", new Object[0]);
                                                    break;
                                                }
                                                break;
                                            case "message":
/* 251 */                                       c1646a.f11585i = interfaceC1489i3.mo5231M();
                                                break;
                                            default:
/* 236 */                                       if (concurrentHashMap2 == null) {
/* 240 */                                           concurrentHashMap2 = new ConcurrentHashMap();
                                                }
/* 243 */                                       interfaceC1489i3.mo5244w(iLogger, concurrentHashMap2, strNextName3);
                                                break;
                                        }
                                    }
/* 323 */                           c1646a.f11579V = concurrentHashMap2;
/* 325 */                           interfaceC1489i3.endObject();
                                } else if (strNextName2.equals("tag")) {
/* 135 */                           String strMo5231M = interfaceC1489i3.mo5231M();
/* 139 */                           if (strMo5231M == null) {
/* 141 */                               strMo5231M = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 142 */                           c1646a.f11581c = strMo5231M;
                                } else {
/* 124 */                           if (concurrentHashMap == null) {
/* 128 */                               concurrentHashMap = new ConcurrentHashMap();
                                    }
/* 131 */                           interfaceC1489i3.mo5244w(iLogger, concurrentHashMap, strNextName2);
                                }
                            }
/* 330 */                   c1646a.f11580W = concurrentHashMap;
/* 332 */                   interfaceC1489i3.endObject();
                        } else if (strNextName.equals("type")) {
/* 81 */                    EnumC1648c enumC1648c = (EnumC1648c) interfaceC1489i3.mo5230K0(iLogger, new C1596d0(10));
/* 83 */                    AbstractC1704c.m5462q(enumC1648c, HttpUrl.FRAGMENT_ENCODE_SET);
/* 86 */                    c1646a.f11588a = enumC1648c;
                        } else if (strNextName.equals("timestamp")) {
/* 67 */                    c1646a.f11589b = interfaceC1489i3.nextLong();
                        } else {
/* 52 */                    if (map == null) {
/* 56 */                        map = new HashMap();
                            }
/* 59 */                    interfaceC1489i3.mo5244w(iLogger, map, strNextName);
                        }
                    }
/* 337 */           c1646a.f11578U = map;
/* 339 */           interfaceC1489i3.endObject();
/* 342 */           return c1646a;
                }

                /* JADX INFO: renamed from: c */
                public static C1652g m5371c(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 1 */             interfaceC1489i3.beginObject();
/* 6 */             C1652g c1652g = new C1652g();
/* 10 */            HashMap map = null;
/* 17 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 19 */                String strNextName = interfaceC1489i3.nextName();
/* 23 */                strNextName.getClass();
/* 36 */                if (strNextName.equals(SharedDataContentProvider.BASE_PATH)) {
/* 89 */                    interfaceC1489i3.beginObject();
/* 92 */                    HashMap map2 = null;
/* 99 */                    while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 101 */                       String strNextName2 = interfaceC1489i3.nextName();
/* 105 */                       strNextName2.getClass();
                                switch (strNextName2) {
                                    case "x":
/* 274 */                               c1652g.f11595f = interfaceC1489i3.nextFloat();
                                        break;
                                    case "y":
/* 266 */                               c1652g.f11596i = interfaceC1489i3.nextFloat();
                                        break;
                                    case "id":
/* 258 */                               c1652g.f11594e = interfaceC1489i3.nextInt();
                                        break;
                                    case "type":
/* 250 */                               c1652g.f11593d = (EnumC1651f) interfaceC1489i3.mo5230K0(iLogger, new C1596d0(13));
                                        break;
                                    case "pointerType":
/* 233 */                               c1652g.f11597v = interfaceC1489i3.nextInt();
                                        break;
                                    case "pointerId":
/* 225 */                               c1652g.f11598w = interfaceC1489i3.nextInt();
                                        break;
                                    default:
/* 189 */                               if (!strNextName2.equals(FirebaseAnalytics.Param.SOURCE)) {
/* 210 */                                   if (map2 == null) {
/* 214 */                                       map2 = new HashMap();
                                            }
/* 217 */                                   interfaceC1489i3.mo5244w(iLogger, map2, strNextName2);
                                            break;
                                        } else {
/* 202 */                                   EnumC1649d enumC1649d = (EnumC1649d) interfaceC1489i3.mo5230K0(iLogger, new C1596d0(11));
/* 204 */                                   AbstractC1704c.m5462q(enumC1649d, HttpUrl.FRAGMENT_ENCODE_SET);
/* 207 */                                   c1652g.f11590c = enumC1649d;
                                            break;
                                        }
                                        break;
                                }
                            }
/* 278 */                   c1652g.f11592V = map2;
/* 280 */                   interfaceC1489i3.endObject();
                        } else if (strNextName.equals("type")) {
/* 81 */                    EnumC1648c enumC1648c = (EnumC1648c) interfaceC1489i3.mo5230K0(iLogger, new C1596d0(10));
/* 83 */                    AbstractC1704c.m5462q(enumC1648c, HttpUrl.FRAGMENT_ENCODE_SET);
/* 86 */                    c1652g.f11588a = enumC1648c;
                        } else if (strNextName.equals("timestamp")) {
/* 67 */                    c1652g.f11589b = interfaceC1489i3.nextLong();
                        } else {
/* 52 */                    if (map == null) {
/* 56 */                        map = new HashMap();
                            }
/* 59 */                    interfaceC1489i3.mo5244w(iLogger, map, strNextName);
                        }
                    }
/* 285 */           c1652g.f11591U = map;
/* 287 */           interfaceC1489i3.endObject();
/* 290 */           return c1652g;
                }

                /* JADX INFO: renamed from: d */
                public static C1654i m5372d(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 1 */             interfaceC1489i3.beginObject();
/* 6 */             C1654i c1654i = new C1654i();
/* 10 */            HashMap map = null;
/* 17 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 19 */                String strNextName = interfaceC1489i3.nextName();
/* 23 */                strNextName.getClass();
/* 34 */                if (strNextName.equals(SharedDataContentProvider.BASE_PATH)) {
/* 89 */                    interfaceC1489i3.beginObject();
/* 92 */                    HashMap map2 = null;
/* 99 */                    while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 101 */                       String strNextName2 = interfaceC1489i3.nextName();
/* 105 */                       strNextName2.getClass();
/* 114 */                       if (strNextName2.equals("pointerId")) {
/* 180 */                           c1654i.f11604d = interfaceC1489i3.nextInt();
                                } else if (strNextName2.equals("positions")) {
/* 173 */                           c1654i.f11605e = interfaceC1489i3.mo5239h1(iLogger, new C1596d0(15));
                                } else if (strNextName2.equals(FirebaseAnalytics.Param.SOURCE)) {
/* 143 */                           EnumC1649d enumC1649d = (EnumC1649d) interfaceC1489i3.mo5230K0(iLogger, new C1596d0(11));
/* 145 */                           AbstractC1704c.m5462q(enumC1649d, HttpUrl.FRAGMENT_ENCODE_SET);
/* 148 */                           c1654i.f11590c = enumC1649d;
                                } else {
/* 151 */                           if (map2 == null) {
/* 155 */                               map2 = new HashMap();
                                    }
/* 158 */                           interfaceC1489i3.mo5244w(iLogger, map2, strNextName2);
                                }
                            }
/* 183 */                   c1654i.f11607i = map2;
/* 185 */                   interfaceC1489i3.endObject();
                        } else if (strNextName.equals("type")) {
/* 81 */                    EnumC1648c enumC1648c = (EnumC1648c) interfaceC1489i3.mo5230K0(iLogger, new C1596d0(10));
/* 83 */                    AbstractC1704c.m5462q(enumC1648c, HttpUrl.FRAGMENT_ENCODE_SET);
/* 86 */                    c1654i.f11588a = enumC1648c;
                        } else if (strNextName.equals("timestamp")) {
/* 67 */                    c1654i.f11589b = interfaceC1489i3.nextLong();
                        } else {
/* 52 */                    if (map == null) {
/* 56 */                        map = new HashMap();
                            }
/* 59 */                    interfaceC1489i3.mo5244w(iLogger, map, strNextName);
                        }
                    }
/* 190 */           c1654i.f11606f = map;
/* 192 */           interfaceC1489i3.endObject();
/* 195 */           return c1654i;
                }

                /* JADX INFO: renamed from: e */
                public static C1655j m5373e(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 1 */             interfaceC1489i3.beginObject();
/* 6 */             C1655j c1655j = new C1655j();
/* 10 */            HashMap map = null;
/* 17 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 19 */                String strNextName = interfaceC1489i3.nextName();
/* 23 */                strNextName.getClass();
/* 34 */                if (strNextName.equals(SharedDataContentProvider.BASE_PATH)) {
/* 89 */                    interfaceC1489i3.beginObject();
/* 92 */                    AbstractMap concurrentHashMap = null;
/* 99 */                    while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 101 */                       String strNextName2 = interfaceC1489i3.nextName();
/* 105 */                       strNextName2.getClass();
                                switch (strNextName2) {
                                    case "height":
/* 188 */                               Integer numMo5243r = interfaceC1489i3.mo5243r();
/* 199 */                               c1655j.f11609d = numMo5243r != null ? numMo5243r.intValue() : 0;
                                        break;
                                    case "href":
/* 178 */                               String strMo5231M = interfaceC1489i3.mo5231M();
/* 182 */                               if (strMo5231M == null) {
/* 184 */                                   strMo5231M = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
/* 185 */                               c1655j.f11608c = strMo5231M;
                                        break;
                                    case "width":
/* 164 */                               Integer numMo5243r2 = interfaceC1489i3.mo5243r();
/* 175 */                               c1655j.f11610e = numMo5243r2 != null ? numMo5243r2.intValue() : 0;
                                        break;
                                    default:
/* 153 */                               if (concurrentHashMap == null) {
/* 157 */                                   concurrentHashMap = new ConcurrentHashMap();
                                        }
/* 160 */                               interfaceC1489i3.mo5244w(iLogger, concurrentHashMap, strNextName2);
                                        break;
                                }
                            }
/* 202 */                   interfaceC1489i3.endObject();
                        } else if (strNextName.equals("type")) {
/* 81 */                    EnumC1648c enumC1648c = (EnumC1648c) interfaceC1489i3.mo5230K0(iLogger, new C1596d0(10));
/* 83 */                    AbstractC1704c.m5462q(enumC1648c, HttpUrl.FRAGMENT_ENCODE_SET);
/* 86 */                    c1655j.f11588a = enumC1648c;
                        } else if (strNextName.equals("timestamp")) {
/* 67 */                    c1655j.f11589b = interfaceC1489i3.nextLong();
                        } else {
/* 52 */                    if (map == null) {
/* 56 */                        map = new HashMap();
                            }
/* 59 */                    interfaceC1489i3.mo5244w(iLogger, map, strNextName);
                        }
                    }
/* 207 */           c1655j.f11611f = map;
/* 209 */           interfaceC1489i3.endObject();
/* 212 */           return c1655j;
                }

                /* JADX INFO: renamed from: f */
                public static C1657l m5374f(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 1 */             interfaceC1489i3.beginObject();
/* 6 */             C1657l c1657l = new C1657l();
/* 10 */            HashMap map = null;
/* 17 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 19 */                String strNextName = interfaceC1489i3.nextName();
/* 23 */                strNextName.getClass();
/* 34 */                if (strNextName.equals(SharedDataContentProvider.BASE_PATH)) {
/* 89 */                    interfaceC1489i3.beginObject();
/* 92 */                    ConcurrentHashMap concurrentHashMap = null;
/* 99 */                    while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 101 */                       String strNextName2 = interfaceC1489i3.nextName();
/* 105 */                       strNextName2.getClass();
/* 114 */                       if (strNextName2.equals("payload")) {
/* 145 */                           interfaceC1489i3.beginObject();
/* 148 */                           ConcurrentHashMap concurrentHashMap2 = null;
/* 155 */                           while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 157 */                               String strNextName3 = interfaceC1489i3.nextName();
/* 161 */                               strNextName3.getClass();
                                        switch (strNextName3) {
                                            case "description":
/* 279 */                                       c1657l.f11618e = interfaceC1489i3.mo5231M();
                                                break;
                                            case "endTimestamp":
/* 272 */                                       c1657l.f11620i = interfaceC1489i3.nextDouble();
                                                break;
                                            case "startTimestamp":
/* 265 */                                       c1657l.f11619f = interfaceC1489i3.nextDouble();
                                                break;
                                            case "op":
/* 258 */                                       c1657l.f11617d = interfaceC1489i3.mo5231M();
                                                break;
                                            case "data":
/* 245 */                                       ConcurrentHashMap concurrentHashMapM5459n = AbstractC1704c.m5459n((Map) interfaceC1489i3.mo5232R0());
/* 249 */                                       if (concurrentHashMapM5459n == null) {
                                                    break;
                                                } else {
/* 251 */                                           c1657l.f11621v = concurrentHashMapM5459n;
                                                    break;
                                                }
                                                break;
                                            default:
/* 228 */                                       if (concurrentHashMap2 == null) {
/* 232 */                                           concurrentHashMap2 = new ConcurrentHashMap();
                                                }
/* 235 */                                       interfaceC1489i3.mo5244w(iLogger, concurrentHashMap2, strNextName3);
                                                break;
                                        }
                                    }
/* 283 */                           c1657l.f11614U = concurrentHashMap2;
/* 285 */                           interfaceC1489i3.endObject();
                                } else if (strNextName2.equals("tag")) {
/* 135 */                           String strMo5231M = interfaceC1489i3.mo5231M();
/* 139 */                           if (strMo5231M == null) {
/* 141 */                               strMo5231M = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 142 */                           c1657l.f11616c = strMo5231M;
                                } else {
/* 124 */                           if (concurrentHashMap == null) {
/* 128 */                               concurrentHashMap = new ConcurrentHashMap();
                                    }
/* 131 */                           interfaceC1489i3.mo5244w(iLogger, concurrentHashMap, strNextName2);
                                }
                            }
/* 290 */                   c1657l.f11615V = concurrentHashMap;
/* 292 */                   interfaceC1489i3.endObject();
                        } else if (strNextName.equals("type")) {
/* 81 */                    EnumC1648c enumC1648c = (EnumC1648c) interfaceC1489i3.mo5230K0(iLogger, new C1596d0(10));
/* 83 */                    AbstractC1704c.m5462q(enumC1648c, HttpUrl.FRAGMENT_ENCODE_SET);
/* 86 */                    c1657l.f11588a = enumC1648c;
                        } else if (strNextName.equals("timestamp")) {
/* 67 */                    c1657l.f11589b = interfaceC1489i3.nextLong();
                        } else {
/* 52 */                    if (map == null) {
/* 56 */                        map = new HashMap();
                            }
/* 59 */                    interfaceC1489i3.mo5244w(iLogger, map, strNextName);
                        }
                    }
/* 297 */           c1657l.f11622w = map;
/* 299 */           interfaceC1489i3.endObject();
/* 302 */           return c1657l;
                }

                /* JADX INFO: renamed from: g */
                public static C1658m m5375g(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 1 */             interfaceC1489i3.beginObject();
/* 6 */             C1658m c1658m = new C1658m();
/* 10 */            HashMap map = null;
/* 17 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 19 */                String strNextName = interfaceC1489i3.nextName();
/* 23 */                strNextName.getClass();
/* 32 */                int i = 10;
/* 36 */                if (strNextName.equals(SharedDataContentProvider.BASE_PATH)) {
/* 89 */                    interfaceC1489i3.beginObject();
/* 92 */                    ConcurrentHashMap concurrentHashMap = null;
/* 99 */                    while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 101 */                       String strNextName2 = interfaceC1489i3.nextName();
/* 105 */                       strNextName2.getClass();
/* 114 */                       if (strNextName2.equals("payload")) {
/* 145 */                           interfaceC1489i3.beginObject();
/* 148 */                           ConcurrentHashMap concurrentHashMap2 = null;
/* 155 */                           while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 157 */                               String strNextName3 = interfaceC1489i3.nextName();
/* 161 */                               strNextName3.getClass();
                                        switch (strNextName3) {
                                            case "duration":
/* 484 */                                       c1658m.f11635f = interfaceC1489i3.nextLong();
                                                break;
                                            case "segmentId":
/* 476 */                                       c1658m.f11633d = interfaceC1489i3.nextInt();
                                                break;
                                            case "height":
/* 457 */                                       Integer numMo5243r = interfaceC1489i3.mo5243r();
/* 468 */                                       c1658m.f11638w = numMo5243r != null ? numMo5243r.intValue() : 0;
                                                break;
                                            case "container":
/* 446 */                                       String strMo5231M = interfaceC1489i3.mo5231M();
/* 450 */                                       if (strMo5231M == null) {
/* 452 */                                           strMo5231M = HttpUrl.FRAGMENT_ENCODE_SET;
                                                }
/* 453 */                                       c1658m.f11637v = strMo5231M;
                                                break;
                                            case "frameCount":
/* 431 */                                       Integer numMo5243r2 = interfaceC1489i3.mo5243r();
/* 442 */                                       c1658m.f11624V = numMo5243r2 != null ? numMo5243r2.intValue() : 0;
                                                break;
                                            case "top":
/* 416 */                                       Integer numMo5243r3 = interfaceC1489i3.mo5243r();
/* 427 */                                       c1658m.f11628Z = numMo5243r3 != null ? numMo5243r3.intValue() : 0;
                                                break;
                                            case "left":
/* 401 */                                       Integer numMo5243r4 = interfaceC1489i3.mo5243r();
/* 412 */                                       c1658m.f11627Y = numMo5243r4 != null ? numMo5243r4.intValue() : 0;
                                                break;
                                            case "size":
/* 384 */                                       Long lMo5227B = interfaceC1489i3.mo5227B();
/* 397 */                                       c1658m.f11634e = lMo5227B == null ? 0L : lMo5227B.longValue();
                                                break;
                                            case "width":
/* 369 */                                       Integer numMo5243r5 = interfaceC1489i3.mo5243r();
/* 380 */                                       c1658m.f11623U = numMo5243r5 != null ? numMo5243r5.intValue() : 0;
                                                break;
                                            case "frameRate":
/* 354 */                                       Integer numMo5243r6 = interfaceC1489i3.mo5243r();
/* 365 */                                       c1658m.f11626X = numMo5243r6 != null ? numMo5243r6.intValue() : 0;
                                                break;
                                            case "encoding":
/* 343 */                                       String strMo5231M2 = interfaceC1489i3.mo5231M();
/* 347 */                                       if (strMo5231M2 == null) {
/* 349 */                                           strMo5231M2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                }
/* 350 */                                       c1658m.f11636i = strMo5231M2;
                                                break;
                                            case "frameRateType":
/* 332 */                                       String strMo5231M3 = interfaceC1489i3.mo5231M();
/* 336 */                                       if (strMo5231M3 == null) {
/* 338 */                                           strMo5231M3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                }
/* 339 */                                       c1658m.f11625W = strMo5231M3;
                                                break;
                                            default:
/* 320 */                                       if (concurrentHashMap2 == null) {
/* 324 */                                           concurrentHashMap2 = new ConcurrentHashMap();
                                                }
/* 327 */                                       interfaceC1489i3.mo5244w(iLogger, concurrentHashMap2, strNextName3);
                                                break;
                                        }
                                    }
/* 488 */                           c1658m.f11630b0 = concurrentHashMap2;
/* 490 */                           interfaceC1489i3.endObject();
                                } else if (strNextName2.equals("tag")) {
/* 135 */                           String strMo5231M4 = interfaceC1489i3.mo5231M();
/* 139 */                           if (strMo5231M4 == null) {
/* 141 */                               strMo5231M4 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 142 */                           c1658m.f11631c = strMo5231M4;
                                } else {
/* 124 */                           if (concurrentHashMap == null) {
/* 128 */                               concurrentHashMap = new ConcurrentHashMap();
                                    }
/* 131 */                           interfaceC1489i3.mo5244w(iLogger, concurrentHashMap, strNextName2);
                                }
                            }
/* 495 */                   c1658m.f11632c0 = concurrentHashMap;
/* 497 */                   interfaceC1489i3.endObject();
                        } else if (strNextName.equals("type")) {
/* 81 */                    EnumC1648c enumC1648c = (EnumC1648c) interfaceC1489i3.mo5230K0(iLogger, new C1596d0(i));
/* 83 */                    AbstractC1704c.m5462q(enumC1648c, HttpUrl.FRAGMENT_ENCODE_SET);
/* 86 */                    c1658m.f11588a = enumC1648c;
                        } else if (strNextName.equals("timestamp")) {
/* 69 */                    c1658m.f11589b = interfaceC1489i3.nextLong();
                        } else {
/* 54 */                    if (map == null) {
/* 58 */                        map = new HashMap();
                            }
/* 61 */                    interfaceC1489i3.mo5244w(iLogger, map, strNextName);
                        }
                    }
/* 502 */           c1658m.f11629a0 = map;
/* 504 */           interfaceC1489i3.endObject();
/* 507 */           return c1658m;
                }

                @Override // io.sentry.InterfaceC1696u1
                /* JADX INFO: renamed from: a */
                public final Object mo5157a(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 21 */            int i = 7;
/* 22 */            int i2 = 8;
/* 28 */            int i3 = 4;
/* 29 */            int i4 = 6;
                    switch (this.f11293a) {
                        case 0:
/* 1598 */                  C1598e0 c1598e0 = new C1598e0();
/* 1601 */                  interfaceC1489i3.beginObject();
/* 1604 */                  ConcurrentHashMap concurrentHashMap = null;
/* 1612 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 1614 */                      String strNextName = interfaceC1489i3.nextName();
/* 1618 */                      strNextName.getClass();
                                switch (strNextName) {
                                    case "daemon":
/* 1856 */                              c1598e0.f11304i = interfaceC1489i3.mo5242q0();
                                        break;
                                    case "priority":
/* 1848 */                              c1598e0.f11299b = interfaceC1489i3.mo5243r();
                                        break;
                                    case "held_locks":
/* 1829 */                              HashMap mapMo5233T = interfaceC1489i3.mo5233T(iLogger, new C1431e(12));
/* 1833 */                              if (mapMo5233T != null) {
/* 1840 */                                  c1598e0.f11296U = new HashMap(mapMo5233T);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "id":
/* 1818 */                              c1598e0.f11298a = interfaceC1489i3.mo5227B();
                                        break;
                                    case "main":
/* 1810 */                              c1598e0.f11305v = interfaceC1489i3.mo5242q0();
                                        break;
                                    case "name":
/* 1802 */                              c1598e0.f11300c = interfaceC1489i3.mo5231M();
                                        break;
                                    case "state":
/* 1794 */                              c1598e0.f11301d = interfaceC1489i3.mo5231M();
                                        break;
                                    case "crashed":
/* 1786 */                              c1598e0.f11302e = interfaceC1489i3.mo5242q0();
                                        break;
                                    case "current":
/* 1778 */                              c1598e0.f11303f = interfaceC1489i3.mo5242q0();
                                        break;
                                    case "stacktrace":
/* 1770 */                              c1598e0.f11306w = (C1594c0) interfaceC1489i3.mo5230K0(iLogger, new C1411a(28));
                                        break;
                                    default:
/* 1745 */                              if (concurrentHashMap == null) {
/* 1749 */                                  concurrentHashMap = new ConcurrentHashMap();
                                        }
/* 1752 */                              interfaceC1489i3.mo5244w(iLogger, concurrentHashMap, strNextName);
                                        break;
                                }
                            }
/* 1860 */                  c1598e0.f11297V = concurrentHashMap;
/* 1862 */                  interfaceC1489i3.endObject();
/* 1865 */                  return c1598e0;
                        case 1:
/* 1261 */                  interfaceC1489i3.beginObject();
/* 1287 */                  C1600f0 c1600f0 = new C1600f0(new ArrayList(), new HashMap(), new C1604h0(EnumC1606i0.CUSTOM.apiName()));
/* 1290 */                  ConcurrentHashMap concurrentHashMap2 = null;
/* 1298 */                  while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 1300 */                      String strNextName2 = interfaceC1489i3.nextName();
/* 1304 */                      strNextName2.getClass();
                                switch (strNextName2) {
                                    case "start_timestamp":
                                        try {
/* 1560 */                                  Double dMo5234b0 = interfaceC1489i3.mo5234b0();
/* 1564 */                                  if (dMo5234b0 != null) {
/* 1566 */                                      c1600f0.f11311b0 = dMo5234b0;
                                            }
                                            break;
                                        } catch (NumberFormatException unused) {
/* 1570 */                                  Date dateMo5241l0 = interfaceC1489i3.mo5241l0(iLogger);
/* 1574 */                                  if (dateMo5241l0 != null) {
/* 1586 */                                      c1600f0.f11311b0 = Double.valueOf(dateMo5241l0.getTime() / 1000.0d);
                                            }
                                            break;
                                        }
                                        break;
                                    case "measurements":
/* 1547 */                              HashMap mapMo5233T2 = interfaceC1489i3.mo5233T(iLogger, new C1411a(15));
/* 1551 */                              if (mapMo5233T2 != null) {
/* 1555 */                                  c1600f0.f11314e0.putAll(mapMo5233T2);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "type":
/* 1535 */                              interfaceC1489i3.nextString();
                                        break;
                                    case "timestamp":
                                        try {
/* 1505 */                                  Double dMo5234b1 = interfaceC1489i3.mo5234b0();
/* 1509 */                                  if (dMo5234b1 != null) {
/* 1511 */                                      c1600f0.f11312c0 = dMo5234b1;
                                            }
                                            break;
                                        } catch (NumberFormatException unused2) {
/* 1515 */                                  Date dateMo5241l1 = interfaceC1489i3.mo5241l0(iLogger);
/* 1519 */                                  if (dateMo5241l1 != null) {
/* 1531 */                                      c1600f0.f11312c0 = Double.valueOf(dateMo5241l1.getTime() / 1000.0d);
                                            }
                                            break;
                                        }
                                        break;
                                    case "spans":
/* 1492 */                              ArrayList arrayListMo5239h1 = interfaceC1489i3.mo5239h1(iLogger, new C1411a(26));
/* 1496 */                              if (arrayListMo5239h1 != null) {
/* 1500 */                                  c1600f0.f11313d0.addAll(arrayListMo5239h1);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "transaction_info":
/* 1426 */                              interfaceC1489i3.beginObject();
/* 1429 */                              String strMo5231M = null;
/* 1431 */                              ConcurrentHashMap concurrentHashMap3 = null;
/* 1438 */                              while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 1440 */                                  String strNextName3 = interfaceC1489i3.nextName();
/* 1444 */                                  strNextName3.getClass();
/* 1453 */                                  if (strNextName3.equals(FirebaseAnalytics.Param.SOURCE)) {
/* 1466 */                                      strMo5231M = interfaceC1489i3.mo5231M();
                                            } else {
/* 1455 */                                      if (concurrentHashMap3 == null) {
/* 1459 */                                          concurrentHashMap3 = new ConcurrentHashMap();
                                                }
/* 1462 */                                      interfaceC1489i3.mo5244w(iLogger, concurrentHashMap3, strNextName3);
                                            }
                                        }
/* 1473 */                              C1604h0 c1604h0 = new C1604h0(strMo5231M);
/* 1476 */                              c1604h0.f11355b = concurrentHashMap3;
/* 1478 */                              interfaceC1489i3.endObject();
/* 1481 */                              c1600f0.f11315f0 = c1604h0;
                                        break;
                                    case "transaction":
/* 1422 */                              c1600f0.f11310a0 = interfaceC1489i3.mo5231M();
                                        break;
                                    default:
/* 1405 */                              if (AbstractC1417a.m5168f(c1600f0, strNextName2, interfaceC1489i3, iLogger)) {
                                            break;
                                        } else {
/* 1407 */                                  if (concurrentHashMap2 == null) {
/* 1411 */                                      concurrentHashMap2 = new ConcurrentHashMap();
                                            }
/* 1414 */                                  interfaceC1489i3.mo5244w(iLogger, concurrentHashMap2, strNextName2);
                                            break;
                                        }
                                        break;
                                }
                            }
/* 1590 */                  c1600f0.f11316g0 = concurrentHashMap2;
/* 1592 */                  interfaceC1489i3.endObject();
/* 1595 */                  return c1600f0;
                        case 2:
/* 963 */                   interfaceC1489i3.beginObject();
/* 968 */                   C1608j0 c1608j0 = new C1608j0();
/* 971 */                   ConcurrentHashMap concurrentHashMap4 = null;
/* 979 */                   while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 981 */                       String strNextName4 = interfaceC1489i3.nextName();
/* 985 */                       strNextName4.getClass();
                                switch (strNextName4) {
                                    case "username":
/* 1251 */                              c1608j0.f11363c = interfaceC1489i3.mo5231M();
                                        break;
                                    case "id":
/* 1243 */                              c1608j0.f11362b = interfaceC1489i3.mo5231M();
                                        break;
                                    case "geo":
/* 1125 */                              interfaceC1489i3.beginObject();
/* 1130 */                              C1611l c1611l = new C1611l();
/* 1133 */                              ConcurrentHashMap concurrentHashMap5 = null;
/* 1141 */                              while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 1143 */                                  String strNextName5 = interfaceC1489i3.nextName();
/* 1147 */                                  strNextName5.getClass();
                                            switch (strNextName5) {
                                                case "region":
/* 1227 */                                          c1611l.f11381c = interfaceC1489i3.mo5231M();
                                                    break;
                                                case "city":
/* 1220 */                                          c1611l.f11379a = interfaceC1489i3.mo5231M();
                                                    break;
                                                case "country_code":
/* 1213 */                                          c1611l.f11380b = interfaceC1489i3.mo5231M();
                                                    break;
                                                default:
/* 1198 */                                          if (concurrentHashMap5 == null) {
/* 1202 */                                              concurrentHashMap5 = new ConcurrentHashMap();
                                                    }
/* 1205 */                                          interfaceC1489i3.mo5244w(iLogger, concurrentHashMap5, strNextName5);
                                                    break;
                                            }
                                        }
/* 1230 */                              c1611l.f11382d = concurrentHashMap5;
/* 1232 */                              interfaceC1489i3.endObject();
/* 1235 */                              c1608j0.f11366f = c1611l;
                                        break;
                                    case "data":
/* 1121 */                              c1608j0.f11367i = AbstractC1704c.m5459n((Map) interfaceC1489i3.mo5232R0());
                                        break;
                                    case "name":
/* 1107 */                              c1608j0.f11365e = interfaceC1489i3.mo5231M();
                                        break;
                                    case "email":
/* 1099 */                              c1608j0.f11361a = interfaceC1489i3.mo5231M();
                                        break;
                                    case "ip_address":
/* 1092 */                              c1608j0.f11364d = interfaceC1489i3.mo5231M();
                                        break;
                                    default:
/* 1077 */                              if (concurrentHashMap4 == null) {
/* 1081 */                                  concurrentHashMap4 = new ConcurrentHashMap();
                                        }
/* 1084 */                              interfaceC1489i3.mo5244w(iLogger, concurrentHashMap4, strNextName4);
                                        break;
                                }
                            }
/* 1255 */                  c1608j0.f11368v = concurrentHashMap4;
/* 1257 */                  interfaceC1489i3.endObject();
/* 1260 */                  return c1608j0;
                        case 3:
/* 890 */                   interfaceC1489i3.beginObject();
/* 893 */                   String strMo5231M2 = null;
/* 895 */                   ArrayList arrayListMo5239h2 = null;
/* 896 */                   HashMap map = null;
/* 903 */                   while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 905 */                       String strNextName6 = interfaceC1489i3.nextName();
/* 909 */                       strNextName6.getClass();
/* 916 */                       if (strNextName6.equals("rendering_system")) {
/* 947 */                           strMo5231M2 = interfaceC1489i3.mo5231M();
                                } else if (strNextName6.equals("windows")) {
/* 942 */                           arrayListMo5239h2 = interfaceC1489i3.mo5239h1(iLogger, new C1596d0(i3));
                                } else {
/* 926 */                           if (map == null) {
/* 930 */                               map = new HashMap();
                                    }
/* 933 */                           interfaceC1489i3.mo5244w(iLogger, map, strNextName6);
                                }
                            }
/* 952 */                   interfaceC1489i3.endObject();
/* 957 */                   C1610k0 c1610k0 = new C1610k0(strMo5231M2, arrayListMo5239h2);
/* 960 */                   c1610k0.f11378c = map;
/* 962 */                   return c1610k0;
                        case 4:
/* 626 */                   C1612l0 c1612l0 = new C1612l0();
/* 629 */                   interfaceC1489i3.beginObject();
/* 632 */                   HashMap map2 = null;
/* 640 */                   while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 642 */                       String strNextName7 = interfaceC1489i3.nextName();
/* 646 */                       strNextName7.getClass();
                                switch (strNextName7) {
                                    case "rendering_system":
/* 880 */                               c1612l0.f11386a = interfaceC1489i3.mo5231M();
                                        break;
                                    case "identifier":
/* 872 */                               c1612l0.f11388c = interfaceC1489i3.mo5231M();
                                        break;
                                    case "height":
/* 864 */                               c1612l0.f11391f = interfaceC1489i3.mo5234b0();
                                        break;
                                    case "x":
/* 856 */                               c1612l0.f11392i = interfaceC1489i3.mo5234b0();
                                        break;
                                    case "y":
/* 848 */                               c1612l0.f11393v = interfaceC1489i3.mo5234b0();
                                        break;
                                    case "tag":
/* 840 */                               c1612l0.f11389d = interfaceC1489i3.mo5231M();
                                        break;
                                    case "type":
/* 832 */                               c1612l0.f11387b = interfaceC1489i3.mo5231M();
                                        break;
                                    case "alpha":
/* 824 */                               c1612l0.f11383U = interfaceC1489i3.mo5234b0();
                                        break;
                                    case "width":
/* 816 */                               c1612l0.f11390e = interfaceC1489i3.mo5234b0();
                                        break;
                                    case "children":
/* 808 */                               c1612l0.f11384V = interfaceC1489i3.mo5239h1(iLogger, this);
                                        break;
                                    case "visibility":
/* 800 */                               c1612l0.f11394w = interfaceC1489i3.mo5231M();
                                        break;
                                    default:
/* 784 */                               if (map2 == null) {
/* 788 */                                   map2 = new HashMap();
                                        }
/* 791 */                               interfaceC1489i3.mo5244w(iLogger, map2, strNextName7);
                                        break;
                                }
                            }
/* 884 */                   interfaceC1489i3.endObject();
/* 887 */                   c1612l0.f11385W = map2;
/* 889 */                   return c1612l0;
                        case 5:
/* 460 */                   interfaceC1489i3.beginObject();
/* 465 */                   C1617a c1617a = new C1617a();
/* 468 */                   ConcurrentHashMap concurrentHashMap6 = null;
/* 476 */                   while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 478 */                       String strNextName8 = interfaceC1489i3.nextName();
/* 482 */                       strNextName8.getClass();
                                switch (strNextName8) {
                                    case "frames":
/* 608 */                               ArrayList arrayListMo5239h3 = interfaceC1489i3.mo5239h1(iLogger, new C1411a(27));
/* 612 */                               if (arrayListMo5239h3 != null) {
/* 614 */                                   c1617a.f11426c = arrayListMo5239h3;
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "stacks":
/* 593 */                               List list = (List) interfaceC1489i3.mo5230K0(iLogger, new C1596d0(i4));
/* 595 */                               if (list != null) {
/* 597 */                                   c1617a.f11425b = list;
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "samples":
/* 575 */                               ArrayList arrayListMo5239h4 = interfaceC1489i3.mo5239h1(iLogger, new C1596d0(i));
/* 579 */                               if (arrayListMo5239h4 != null) {
/* 581 */                                   c1617a.f11424a = arrayListMo5239h4;
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "thread_metadata":
/* 561 */                               HashMap mapMo5233T3 = interfaceC1489i3.mo5233T(iLogger, new C1596d0(i2));
/* 565 */                               if (mapMo5233T3 != null) {
/* 567 */                                   c1617a.f11427d = mapMo5233T3;
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    default:
/* 545 */                               if (concurrentHashMap6 == null) {
/* 549 */                                   concurrentHashMap6 = new ConcurrentHashMap();
                                        }
/* 552 */                               interfaceC1489i3.mo5244w(iLogger, concurrentHashMap6, strNextName8);
                                        break;
                                }
                            }
/* 618 */                   c1617a.f11428e = concurrentHashMap6;
/* 620 */                   interfaceC1489i3.endObject();
/* 623 */                   return c1617a;
                        case 6:
/* 411 */                   ArrayList arrayList = new ArrayList();
/* 414 */                   interfaceC1489i3.beginArray();
/* 421 */                   while (interfaceC1489i3.hasNext()) {
/* 425 */                       ArrayList arrayList2 = new ArrayList();
/* 428 */                       interfaceC1489i3.beginArray();
/* 435 */                       while (interfaceC1489i3.hasNext()) {
/* 445 */                           arrayList2.add(Integer.valueOf(interfaceC1489i3.nextInt()));
                                }
/* 449 */                       interfaceC1489i3.endArray();
/* 452 */                       arrayList.add(arrayList2);
                            }
/* 456 */                   interfaceC1489i3.endArray();
/* 459 */                   return arrayList;
                        case 7:
/* 300 */                   interfaceC1489i3.beginObject();
/* 305 */                   C1618b c1618b = new C1618b();
/* 308 */                   HashMap map3 = null;
/* 316 */                   while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 318 */                       String strNextName9 = interfaceC1489i3.nextName();
/* 322 */                       strNextName9.getClass();
                                switch (strNextName9) {
                                    case "thread_id":
/* 400 */                               c1618b.f11431c = interfaceC1489i3.mo5231M();
                                        break;
                                    case "timestamp":
/* 393 */                               c1618b.f11429a = interfaceC1489i3.nextDouble();
                                        break;
                                    case "stack_id":
/* 386 */                               c1618b.f11430b = interfaceC1489i3.nextInt();
                                        break;
                                    default:
/* 371 */                               if (map3 == null) {
/* 375 */                                   map3 = new HashMap();
                                        }
/* 378 */                               interfaceC1489i3.mo5244w(iLogger, map3, strNextName9);
                                        break;
                                }
                            }
/* 403 */                   c1618b.f11432d = map3;
/* 405 */                   interfaceC1489i3.endObject();
/* 408 */                   return c1618b;
                        case 8:
/* 232 */                   interfaceC1489i3.beginObject();
/* 237 */                   C1619c c1619c = new C1619c();
/* 240 */                   HashMap map4 = null;
/* 248 */                   while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 250 */                       String strNextName10 = interfaceC1489i3.nextName();
/* 254 */                       strNextName10.getClass();
/* 261 */                       if (strNextName10.equals("priority")) {
/* 291 */                           c1619c.f11434b = interfaceC1489i3.nextInt();
                                } else if (strNextName10.equals("name")) {
/* 284 */                           c1619c.f11433a = interfaceC1489i3.mo5231M();
                                } else {
/* 269 */                           if (map4 == null) {
/* 273 */                               map4 = new HashMap();
                                    }
/* 276 */                           interfaceC1489i3.mo5244w(iLogger, map4, strNextName10);
                                }
                            }
/* 294 */                   c1619c.f11435c = map4;
/* 296 */                   interfaceC1489i3.endObject();
/* 299 */                   return c1619c;
                        case 9:
/* 227 */                   return m5370b(interfaceC1489i3, iLogger);
                        case 10:
/* 224 */                   return EnumC1648c.values()[interfaceC1489i3.nextInt()];
                        case 11:
/* 213 */                   return EnumC1649d.values()[interfaceC1489i3.nextInt()];
                        case 12:
/* 200 */                   return m5371c(interfaceC1489i3, iLogger);
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 197 */                   return EnumC1651f.values()[interfaceC1489i3.nextInt()];
                        case 14:
/* 184 */                   return m5372d(interfaceC1489i3, iLogger);
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 60 */                    interfaceC1489i3.beginObject();
/* 65 */                    C1653h c1653h = new C1653h();
/* 68 */                    HashMap map5 = null;
/* 76 */                    while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 78 */                        String strNextName11 = interfaceC1489i3.nextName();
/* 82 */                        strNextName11.getClass();
                                switch (strNextName11) {
                                    case "x":
/* 175 */                               c1653h.f11600b = interfaceC1489i3.nextFloat();
                                        break;
                                    case "y":
/* 168 */                               c1653h.f11601c = interfaceC1489i3.nextFloat();
                                        break;
                                    case "id":
/* 161 */                               c1653h.f11599a = interfaceC1489i3.nextInt();
                                        break;
                                    case "timeOffset":
/* 154 */                               c1653h.f11602d = interfaceC1489i3.nextLong();
                                        break;
                                    default:
/* 139 */                               if (map5 == null) {
/* 143 */                                   map5 = new HashMap();
                                        }
/* 146 */                               interfaceC1489i3.mo5244w(iLogger, map5, strNextName11);
                                        break;
                                }
                            }
/* 178 */                   c1653h.f11603e = map5;
/* 180 */                   interfaceC1489i3.endObject();
/* 183 */                   return c1653h;
                        case 16:
/* 55 */                    return m5373e(interfaceC1489i3, iLogger);
                        case 17:
/* 50 */                    return m5374f(interfaceC1489i3, iLogger);
                        default:
/* 45 */                    return m5375g(interfaceC1489i3, iLogger);
                    }
                }
            }
