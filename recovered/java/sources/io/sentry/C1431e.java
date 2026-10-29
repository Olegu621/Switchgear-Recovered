            package io.sentry;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.clientreport.C1411a;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.protocol.C1596d0;
            import io.sentry.protocol.C1599f;
            import io.sentry.protocol.C1614n;
            import io.sentry.protocol.C1616p;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1626w;
            import io.sentry.protocol.profiling.C1617a;
            import io.sentry.rrweb.EnumC1648c;
            import io.sentry.rrweb.EnumC1649d;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1716o;
            import io.sentry.util.C1710i;
            import io.sentry.vendor.gson.stream.EnumC1731b;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1431e implements InterfaceC1696u1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10858a;

                public /* synthetic */ C1431e(int i) {
/* 1 */             this.f10858a = i;
                }

                /* JADX INFO: renamed from: b */
                public static C1383b7 m5199b(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 1 */             interfaceC1489i3.beginObject();
/* 4 */             C1626w c1626w = null;
/* 5 */             C1430d7 c1430d7 = null;
/* 6 */             String strNextString = null;
/* 7 */             ConcurrentHashMap concurrentHashMap = null;
/* 8 */             C1430d7 c1430d8 = null;
/* 9 */             String strNextString2 = null;
/* 10 */            EnumC1451f7 enumC1451f7 = null;
/* 11 */            String strNextString3 = null;
/* 12 */            ConcurrentHashMap concurrentHashMapM5459n = null;
/* 13 */            Map map = null;
/* 20 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 22 */                String strNextName = interfaceC1489i3.nextName();
/* 26 */                strNextName.getClass();
                        switch (strNextName) {
                            case "span_id":
/* 240 */                       c1430d7 = new C1430d7(interfaceC1489i3.nextString());
                                break;
                            case "parent_span_id":
/* 230 */                       c1430d8 = (C1430d7) interfaceC1489i3.mo5230K0(iLogger, new C1431e(23));
                                break;
                            case "description":
/* 213 */                       strNextString2 = interfaceC1489i3.nextString();
                                break;
                            case "origin":
/* 207 */                       strNextString3 = interfaceC1489i3.nextString();
                                break;
                            case "status":
/* 203 */                       enumC1451f7 = (EnumC1451f7) interfaceC1489i3.mo5230K0(iLogger, new C1431e(24));
                                break;
                            case "op":
/* 186 */                       strNextString = interfaceC1489i3.nextString();
                                break;
                            case "data":
/* 182 */                       map = (Map) interfaceC1489i3.mo5232R0();
                                break;
                            case "tags":
/* 172 */                       concurrentHashMapM5459n = AbstractC1704c.m5459n((Map) interfaceC1489i3.mo5232R0());
                                break;
                            case "trace_id":
/* 161 */                       c1626w = new C1626w(interfaceC1489i3.nextString());
                                break;
                            default:
/* 143 */                       if (concurrentHashMap == null) {
/* 147 */                           concurrentHashMap = new ConcurrentHashMap();
                                }
/* 150 */                       interfaceC1489i3.mo5244w(iLogger, concurrentHashMap, strNextName);
                                break;
                        }
                    }
/* 245 */           if (c1626w == null) {
/* 295 */               IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
/* 300 */               iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"trace_id\"", illegalStateException);
/* 303 */               throw illegalStateException;
                    }
/* 247 */           if (c1430d7 == null) {
/* 282 */               IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
/* 287 */               iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"span_id\"", illegalStateException2);
/* 290 */               throw illegalStateException2;
                    }
/* 249 */           if (strNextString == null) {
/* 251 */               strNextString = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 255 */           C1383b7 c1383b7 = new C1383b7(c1626w, c1430d7, strNextString, c1430d8);
/* 258 */           c1383b7.f10760f = strNextString2;
/* 260 */           c1383b7.f10761i = enumC1451f7;
/* 262 */           c1383b7.f10763w = strNextString3;
/* 264 */           if (concurrentHashMapM5459n != null) {
/* 266 */               c1383b7.f10762v = concurrentHashMapM5459n;
                    }
/* 268 */           if (map != null) {
/* 270 */               c1383b7.f10749U = map;
                    }
/* 272 */           c1383b7.f10750V = concurrentHashMap;
/* 274 */           interfaceC1489i3.endObject();
/* 277 */           return c1383b7;
                }

                /* JADX INFO: renamed from: c */
                private final Object m5200c(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 3 */             interfaceC1489i3.beginObject();
/* 6 */             ConcurrentHashMap concurrentHashMap = null;
/* 7 */             C1626w c1626w = null;
/* 8 */             String strNextString = null;
/* 9 */             String strMo5231M = null;
/* 10 */            String strMo5231M2 = null;
/* 11 */            String strMo5231M3 = null;
/* 12 */            String strMo5231M4 = null;
/* 13 */            String strMo5231M5 = null;
/* 14 */            String strMo5231M6 = null;
/* 15 */            C1626w c1626w2 = null;
/* 16 */            String strMo5231M7 = null;
/* 27 */            while (interfaceC1489i3.peek() == EnumC1731b.NAME) {
/* 29 */                String strNextName = interfaceC1489i3.nextName();
/* 33 */                strNextName.getClass();
                        switch (strNextName) {
                            case "replay_id":
/* 277 */                       c1626w2 = new C1626w(interfaceC1489i3.nextString());
                                break;
                            case "user_id":
/* 262 */                       strMo5231M3 = interfaceC1489i3.mo5231M();
                                break;
                            case "environment":
/* 253 */                       strMo5231M2 = interfaceC1489i3.mo5231M();
                                break;
                            case "sample_rand":
/* 244 */                       strMo5231M7 = interfaceC1489i3.mo5231M();
                                break;
                            case "sample_rate":
/* 235 */                       strMo5231M5 = interfaceC1489i3.mo5231M();
                                break;
                            case "release":
/* 226 */                       strMo5231M = interfaceC1489i3.mo5231M();
                                break;
                            case "trace_id":
/* 218 */                       c1626w = new C1626w(interfaceC1489i3.nextString());
                                break;
                            case "sampled":
/* 203 */                       strMo5231M6 = interfaceC1489i3.mo5231M();
                                break;
                            case "public_key":
/* 194 */                       strNextString = interfaceC1489i3.nextString();
                                break;
                            case "transaction":
/* 185 */                       strMo5231M4 = interfaceC1489i3.mo5231M();
                                break;
                            default:
/* 169 */                       if (concurrentHashMap == null) {
/* 173 */                           concurrentHashMap = new ConcurrentHashMap();
                                }
/* 178 */                       interfaceC1489i3.mo5244w(iLogger, concurrentHashMap, strNextName);
                                break;
                        }
                    }
/* 285 */           if (c1626w == null) {
/* 309 */               throw m5202e("trace_id", iLogger);
                    }
/* 287 */           if (strNextString == null) {
/* 304 */               throw m5202e("public_key", iLogger);
                    }
/* 291 */           C1472h7 c1472h7 = new C1472h7(c1626w, strNextString, strMo5231M, strMo5231M2, strMo5231M3, strMo5231M4, strMo5231M5, strMo5231M6, c1626w2, strMo5231M7);
/* 294 */           c1472h7.f10986V = concurrentHashMap;
/* 296 */           interfaceC1489i3.endObject();
/* 299 */           return c1472h7;
                }

                /* JADX INFO: renamed from: d */
                public static IllegalStateException m5201d(String str, ILogger iLogger) {
/* 5 */             String strM3784j = fm0.m3784j("Missing required field \"", str, "\"");
/* 11 */            IllegalStateException illegalStateException = new IllegalStateException(strM3784j);
/* 16 */            iLogger.mo4671d(EnumC1553m5.ERROR, strM3784j, illegalStateException);
/* 19 */            return illegalStateException;
                }

                /* JADX INFO: renamed from: e */
                public static IllegalStateException m5202e(String str, ILogger iLogger) {
/* 5 */             String strM3784j = fm0.m3784j("Missing required field \"", str, "\"");
/* 11 */            IllegalStateException illegalStateException = new IllegalStateException(strM3784j);
/* 16 */            iLogger.mo4671d(EnumC1553m5.ERROR, strM3784j, illegalStateException);
/* 19 */            return illegalStateException;
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v10 */
                /* JADX WARN: Type inference failed for: r8v11 */
                /* JADX WARN: Type inference failed for: r8v13 */
                /* JADX WARN: Type inference failed for: r8v14 */
                /* JADX WARN: Type inference failed for: r8v17 */
                /* JADX WARN: Type inference failed for: r8v18 */
                /* JADX WARN: Type inference failed for: r8v20 */
                /* JADX WARN: Type inference failed for: r8v21 */
                /* JADX WARN: Type inference failed for: r8v24 */
                /* JADX WARN: Type inference failed for: r8v25 */
                /* JADX WARN: Type inference failed for: r8v28 */
                /* JADX WARN: Type inference failed for: r8v29 */
                /* JADX WARN: Type inference failed for: r8v30 */
                /* JADX WARN: Type inference failed for: r8v34 */
                /* JADX WARN: Type inference failed for: r8v6 */
                /* JADX WARN: Type inference failed for: r8v7 */
                @Override // io.sentry.InterfaceC1696u1
                /* JADX INFO: renamed from: a */
                public final Object mo5157a(InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
                    ?? r8;
                    int i;
                    ArrayList arrayList;
                    Integer numMo5243r;
                    Date date;
                    String str;
/* 1 */             InterfaceC1489i3 interfaceC1489i4 = interfaceC1489i3;
/* 9 */             int i2 = 17;
/* 17 */            int i3 = 11;
/* 31 */            ConcurrentHashMap concurrentHashMap = null;
/* 31 */            C1626w c1626w = null;
/* 31 */            ArrayList arrayListMo5239h1 = null;
/* 31 */            ArrayList arrayListMo5239h2 = null;
/* 31 */            ConcurrentHashMap concurrentHashMap2 = null;
/* 31 */            ConcurrentHashMap concurrentHashMap3 = null;
/* 31 */            HashMap map = null;
/* 31 */            ConcurrentHashMap concurrentHashMap4 = null;
/* 31 */            ConcurrentHashMap concurrentHashMap5 = null;
/* 31 */            ConcurrentHashMap concurrentHashMap6 = null;
                    switch (this.f10858a) {
                        case 0:
/* 4962 */                  boolean z = true;
/* 4963 */                  char c = 3;
/* 4964 */                  interfaceC1489i4.beginObject();
/* 4969 */                  Date date2 = new Date();
/* 4972 */                  String strMo5231M = null;
/* 4973 */                  ConcurrentHashMap concurrentHashMap7 = null;
/* 4974 */                  String strMo5231M2 = null;
/* 4975 */                  ConcurrentHashMap concurrentHashMap8 = null;
/* 4976 */                  String strMo5231M3 = null;
/* 4977 */                  EnumC1553m5 enumC1553m5ValueOf = null;
/* 4978 */                  String strMo5231M4 = null;
                            InterfaceC1489i3 interfaceC1489i5 = interfaceC1489i4;
/* 4985 */                  while (interfaceC1489i5.peek() == EnumC1731b.NAME) {
/* 4987 */                      String strNextName = interfaceC1489i5.nextName();
/* 4991 */                      strNextName.getClass();
                                switch (strNextName.hashCode()) {
                                    case -1008619738:
/* 5076 */                              r8 = strNextName.equals(FirebaseAnalytics.Param.ORIGIN) ? 0 : -1;
                                        break;
                                    case 3076010:
/* 5065 */                              r8 = strNextName.equals(SharedDataContentProvider.BASE_PATH) ? z : -1;
                                        break;
                                    case 3575610:
/* 5054 */                              r8 = strNextName.equals("type") ? 2 : -1;
                                        break;
                                    case 50511102:
/* 5045 */                              r8 = strNextName.equals("category") ? c : -1;
                                        break;
                                    case 55126294:
/* 5034 */                              r8 = strNextName.equals("timestamp") ? 4 : -1;
                                        break;
                                    case 102865796:
/* 5025 */                              r8 = strNextName.equals(FirebaseAnalytics.Param.LEVEL) ? 5 : -1;
                                        break;
                                    case 954925063:
/* 5013 */                              r8 = strNextName.equals("message") ? 6 : -1;
                                        break;
                                    default:
/* 5001 */                              r8 = -1;
                                        break;
                                }
                                switch (r8) {
                                    case 0:
/* 5171 */                              strMo5231M3 = interfaceC1489i3.mo5231M();
                                        continue;
/* 5176 */                              interfaceC1489i5 = interfaceC1489i3;
/* 5179 */                              z = true;
/* 5180 */                              c = 3;
                                        break;
                                    case 1:
/* 5156 */                              ConcurrentHashMap concurrentHashMapM5459n = AbstractC1704c.m5459n((Map) interfaceC1489i3.mo5232R0());
/* 5160 */                              if (concurrentHashMapM5459n == null) {
                                            continue;
                                        } else if (!concurrentHashMapM5459n.isEmpty()) {
/* 5168 */                                  concurrentHashMap7 = concurrentHashMapM5459n;
                                        }
/* 5176 */                              interfaceC1489i5 = interfaceC1489i3;
/* 5179 */                              z = true;
/* 5180 */                              c = 3;
                                        break;
                                    case 2:
/* 5143 */                              strMo5231M = interfaceC1489i3.mo5231M();
                                        continue;
/* 5176 */                              interfaceC1489i5 = interfaceC1489i3;
/* 5179 */                              z = true;
/* 5180 */                              c = 3;
                                        break;
                                    case 3:
/* 5136 */                              strMo5231M2 = interfaceC1489i3.mo5231M();
                                        continue;
/* 5176 */                              interfaceC1489i5 = interfaceC1489i3;
/* 5179 */                              z = true;
/* 5180 */                              c = 3;
                                        break;
                                    case 4:
/* 5127 */                              Date dateMo5241l0 = interfaceC1489i3.mo5241l0(iLogger);
/* 5131 */                              if (dateMo5241l0 != null) {
/* 5133 */                                  date2 = dateMo5241l0;
                                        } else {
                                            continue;
                                        }
/* 5176 */                              interfaceC1489i5 = interfaceC1489i3;
/* 5179 */                              z = true;
/* 5180 */                              c = 3;
                                        break;
                                    case 5:
                                        try {
/* 5108 */                                  enumC1553m5ValueOf = EnumC1553m5.valueOf(interfaceC1489i5.nextString().toUpperCase(Locale.ROOT));
                                        } catch (Exception e) {
/* 5122 */                                  iLogger.mo4670b(EnumC1553m5.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
                                        }
                                        break;
                                    case 6:
/* 5092 */                              strMo5231M4 = interfaceC1489i5.mo5231M();
                                        break;
                                    default:
/* 5080 */                              if (concurrentHashMap8 == null) {
/* 5084 */                                  concurrentHashMap8 = new ConcurrentHashMap();
                                        }
/* 5087 */                              interfaceC1489i5.mo5244w(iLogger, concurrentHashMap8, strNextName);
                                        break;
                                }
/* 5176 */                      interfaceC1489i5 = interfaceC1489i3;
/* 5179 */                      z = true;
/* 5180 */                      c = 3;
                            }
/* 5185 */                  C1443f c1443f = new C1443f(date2);
/* 5188 */                  c1443f.f10929d = strMo5231M4;
/* 5190 */                  c1443f.f10930e = strMo5231M;
/* 5192 */                  if (concurrentHashMap7 != null) {
/* 5194 */                      c1443f.f10931f = concurrentHashMap7;
                            }
/* 5196 */                  c1443f.f10932i = strMo5231M2;
/* 5198 */                  c1443f.f10933v = strMo5231M3;
/* 5200 */                  c1443f.f10934w = enumC1553m5ValueOf;
/* 5202 */                  c1443f.f10925U = concurrentHashMap8;
/* 5204 */                  interfaceC1489i3.endObject();
/* 5207 */                  return c1443f;
                        case 1:
/* 4550 */                  int i4 = 4;
/* 4555 */                  interfaceC1489i4.beginObject();
/* 4560 */                  C1626w c1626w2 = C1626w.f11478b;
/* 4583 */                  C1573o3 c1573o3 = new C1573o3(c1626w2, c1626w2, null, new HashMap(), Double.valueOf(0.0d), "android", C1554m6.empty());
/* 4594 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 4596 */                      String strNextName2 = interfaceC1489i4.nextName();
/* 4600 */                      strNextName2.getClass();
                                switch (strNextName2.hashCode()) {
                                    case -1840434063:
/* 4746 */                              i = strNextName2.equals("debug_meta") ? 0 : -1;
                                        break;
                                    case -362243017:
/* 4734 */                              i = strNextName2.equals("measurements") ? 1 : -1;
                                        break;
                                    case -309425751:
/* 4723 */                              i = strNextName2.equals("profile") ? 2 : -1;
                                        break;
                                    case -85904877:
/* 4712 */                              i = strNextName2.equals("environment") ? 3 : -1;
                                        break;
                                    case 55126294:
/* 4703 */                              i = strNextName2.equals("timestamp") ? i4 : -1;
                                        break;
                                    case 178573617:
/* 4694 */                              i = strNextName2.equals("profiler_id") ? 5 : -1;
                                        break;
                                    case 351608024:
/* 4682 */                              i = strNextName2.equals("version") ? 6 : -1;
                                        break;
                                    case 1090594823:
/* 4671 */                              i = strNextName2.equals("release") ? 7 : -1;
                                        break;
                                    case 1102774726:
/* 4660 */                              i = strNextName2.equals("client_sdk") ? 8 : -1;
                                        break;
                                    case 1874684019:
/* 4647 */                              i = strNextName2.equals("platform") ? 9 : -1;
                                        break;
                                    case 1953158756:
/* 4635 */                              i = strNextName2.equals("sampled_profile") ? 10 : -1;
                                        break;
                                    case 2005113901:
/* 4623 */                              i = strNextName2.equals("chunk_id") ? i3 : -1;
                                        break;
                                    default:
/* 4610 */                              i = -1;
                                        break;
                                }
                                switch (i) {
                                    case 0:
/* 4942 */                              C1599f c1599f = (C1599f) interfaceC1489i4.mo5230K0(iLogger, new C1411a(8));
/* 4944 */                              if (c1599f != null) {
/* 4946 */                                  c1573o3.f11192a = c1599f;
                                        }
                                        break;
                                    case 1:
/* 4914 */                              HashMap mapMo5233T = interfaceC1489i4.mo5233T(iLogger, new C1411a(2));
/* 4918 */                              if (mapMo5233T != null) {
/* 4922 */                                  c1573o3.f11196e.putAll(mapMo5233T);
                                        }
                                        break;
                                    case 2:
/* 4898 */                              C1617a c1617a = (C1617a) interfaceC1489i4.mo5230K0(iLogger, new C1596d0(5));
/* 4900 */                              if (c1617a != null) {
/* 4902 */                                  c1573o3.f11190X = c1617a;
                                        }
                                        break;
                                    case 3:
/* 4877 */                              String strMo5231M5 = interfaceC1489i4.mo5231M();
/* 4881 */                              if (strMo5231M5 != null) {
/* 4883 */                                  c1573o3.f11199v = strMo5231M5;
                                        }
                                        break;
                                    case 4:
/* 4862 */                              Double dMo5234b0 = interfaceC1489i4.mo5234b0();
/* 4866 */                              if (dMo5234b0 != null) {
/* 4872 */                                  c1573o3.f11187U = dMo5234b0.doubleValue();
                                        }
                                        break;
                                    case 5:
/* 4851 */                              C1626w c1626w3 = (C1626w) interfaceC1489i4.mo5230K0(iLogger, new C1411a(23));
/* 4853 */                              if (c1626w3 != null) {
/* 4855 */                                  c1573o3.f11193b = c1626w3;
                                        }
                                        break;
                                    case 6:
/* 4831 */                              String strMo5231M6 = interfaceC1489i4.mo5231M();
/* 4835 */                              if (strMo5231M6 != null) {
/* 4837 */                                  c1573o3.f11200w = strMo5231M6;
                                        }
                                        break;
                                    case 7:
/* 4822 */                              String strMo5231M7 = interfaceC1489i4.mo5231M();
/* 4826 */                              if (strMo5231M7 != null) {
/* 4828 */                                  c1573o3.f11198i = strMo5231M7;
                                        }
                                        break;
                                    case 8:
/* 4815 */                              C1624u c1624u = (C1624u) interfaceC1489i4.mo5230K0(iLogger, new C1411a(21));
/* 4817 */                              if (c1624u != null) {
/* 4819 */                                  c1573o3.f11195d = c1624u;
                                        }
                                        break;
                                    case 9:
/* 4795 */                              String strMo5231M8 = interfaceC1489i4.mo5231M();
/* 4799 */                              if (strMo5231M8 != null) {
/* 4801 */                                  c1573o3.f11197f = strMo5231M8;
                                        }
                                        break;
                                    case 10:
/* 4786 */                              String strMo5231M9 = interfaceC1489i4.mo5231M();
/* 4790 */                              if (strMo5231M9 != null) {
/* 4792 */                                  c1573o3.f11189W = strMo5231M9;
                                        }
                                        break;
                                    case 11:
/* 4779 */                              C1626w c1626w4 = (C1626w) interfaceC1489i4.mo5230K0(iLogger, new C1411a(23));
/* 4781 */                              if (c1626w4 != null) {
/* 4783 */                                  c1573o3.f11194c = c1626w4;
                                        }
                                        break;
                                    default:
/* 4750 */                              if (concurrentHashMap == null) {
/* 4754 */                                  concurrentHashMap = new ConcurrentHashMap();
                                        }
/* 4757 */                              interfaceC1489i4.mo5244w(iLogger, concurrentHashMap, strNextName2);
                                        break;
                                }
/* 4948 */                      i4 = 4;
/* 4949 */                      i3 = 11;
                            }
/* 4953 */                  c1573o3.f11191Y = concurrentHashMap;
/* 4955 */                  interfaceC1489i4.endObject();
/* 4586 */                  return c1573o3;
                        case 2:
/* 4480 */                  interfaceC1489i4.beginObject();
/* 4487 */                  C1581p3 c1581p3 = new C1581p3(C1626w.f11478b);
/* 4496 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 4498 */                      String strNextName3 = interfaceC1489i4.nextName();
/* 4502 */                      strNextName3.getClass();
/* 4511 */                      if (strNextName3.equals("profiler_id")) {
/* 4535 */                          C1626w c1626w5 = (C1626w) interfaceC1489i4.mo5230K0(iLogger, new C1411a(23));
/* 4537 */                          if (c1626w5 != null) {
/* 4539 */                              c1581p3.f11225a = c1626w5;
                                    }
                                } else {
/* 4513 */                          if (concurrentHashMap6 == null) {
/* 4517 */                              concurrentHashMap6 = new ConcurrentHashMap();
                                    }
/* 4520 */                          interfaceC1489i4.mo5244w(iLogger, concurrentHashMap6, strNextName3);
                                }
                            }
/* 4542 */                  c1581p3.f11226b = concurrentHashMap6;
/* 4544 */                  interfaceC1489i4.endObject();
/* 4547 */                  return c1581p3;
                        case 3:
/* 3699 */                  interfaceC1489i4.beginObject();
/* 3708 */                  File file = new File("dummy");
/* 3713 */                  Date date3 = new Date();
/* 3718 */                  ArrayList arrayList2 = new ArrayList();
/* 3721 */                  C1626w c1626w6 = C1626w.f11478b;
/* 3783 */                  C1642r3 c1642r3 = new C1642r3(file, date3, arrayList2, HttpUrl.FRAGMENT_ENCODE_SET, c1626w6.m5380a(), new C1383b7(c1626w6, C1430d7.f10856b, "op", null).f10755a.m5380a(), "0", 0, HttpUrl.FRAGMENT_ENCODE_SET, new CallableC1515j0(2), null, null, null, null, null, null, null, null, "normal", new HashMap());
/* 3788 */                  ConcurrentHashMap concurrentHashMap9 = null;
/* 3795 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 3797 */                      String strNextName4 = interfaceC1489i4.nextName();
/* 3801 */                      strNextName4.getClass();
                                switch (strNextName4) {
                                    case "device_manufacturer":
/* 4463 */                              String strMo5231M10 = interfaceC1489i4.mo5231M();
/* 4467 */                              if (strMo5231M10 == null) {
                                            break;
                                        } else {
/* 4469 */                                  c1642r3.f11560e = strMo5231M10;
                                            break;
                                        }
                                        break;
                                    case "android_api_level":
/* 4448 */                              Integer numMo5243r2 = interfaceC1489i4.mo5243r();
/* 4452 */                              if (numMo5243r2 == null) {
                                            break;
                                        } else {
/* 4458 */                                  c1642r3.f11556c = numMo5243r2.intValue();
                                            break;
                                        }
                                        break;
                                    case "build_id":
/* 4437 */                              String strMo5231M11 = interfaceC1489i4.mo5231M();
/* 4441 */                              if (strMo5231M11 == null) {
                                            break;
                                        } else {
/* 4443 */                                  c1642r3.f11551Z = strMo5231M11;
                                            break;
                                        }
                                        break;
                                    case "device_locale":
/* 4426 */                              String strMo5231M12 = interfaceC1489i4.mo5231M();
/* 4430 */                              if (strMo5231M12 == null) {
                                            break;
                                        } else {
/* 4432 */                                  c1642r3.f11558d = strMo5231M12;
                                            break;
                                        }
                                        break;
                                    case "profile_id":
/* 4415 */                              String strMo5231M13 = interfaceC1489i4.mo5231M();
/* 4419 */                              if (strMo5231M13 == null) {
                                            break;
                                        } else {
/* 4421 */                                  c1642r3.f11565h0 = strMo5231M13;
                                            break;
                                        }
                                        break;
                                    case "device_os_build_number":
/* 4404 */                              String strMo5231M14 = interfaceC1489i4.mo5231M();
/* 4408 */                              if (strMo5231M14 == null) {
                                            break;
                                        } else {
/* 4410 */                                  c1642r3.f11566i = strMo5231M14;
                                            break;
                                        }
                                        break;
                                    case "device_model":
/* 4393 */                              String strMo5231M15 = interfaceC1489i4.mo5231M();
/* 4397 */                              if (strMo5231M15 == null) {
                                            break;
                                        } else {
/* 4399 */                                  c1642r3.f11562f = strMo5231M15;
                                            break;
                                        }
                                        break;
                                    case "device_is_emulator":
/* 4378 */                              Boolean boolMo5242q0 = interfaceC1489i4.mo5242q0();
/* 4382 */                              if (boolMo5242q0 == null) {
                                            break;
                                        } else {
/* 4388 */                                  c1642r3.f11546U = boolMo5242q0.booleanValue();
                                            break;
                                        }
                                        break;
                                    case "duration_ns":
/* 4367 */                              String strMo5231M16 = interfaceC1489i4.mo5231M();
/* 4371 */                              if (strMo5231M16 == null) {
                                            break;
                                        } else {
/* 4373 */                                  c1642r3.f11557c0 = strMo5231M16;
                                            break;
                                        }
                                        break;
                                    case "measurements":
/* 4353 */                              HashMap mapMo5233T2 = interfaceC1489i4.mo5233T(iLogger, new C1411a(2));
/* 4357 */                              if (mapMo5233T2 == null) {
                                            break;
                                        } else {
/* 4361 */                                  c1642r3.f11570l0.putAll(mapMo5233T2);
                                            break;
                                        }
                                        break;
                                    case "device_physical_memory_bytes":
/* 4336 */                              String strMo5231M17 = interfaceC1489i4.mo5231M();
/* 4340 */                              if (strMo5231M17 == null) {
                                            break;
                                        } else {
/* 4342 */                                  c1642r3.f11549X = strMo5231M17;
                                            break;
                                        }
                                        break;
                                    case "device_cpu_frequencies":
/* 4327 */                              List list = (List) interfaceC1489i4.mo5232R0();
/* 4329 */                              if (list == null) {
                                            break;
                                        } else {
/* 4331 */                                  c1642r3.f11548W = list;
                                            break;
                                        }
                                        break;
                                    case "version_code":
/* 4312 */                              String strMo5231M18 = interfaceC1489i4.mo5231M();
/* 4316 */                              if (strMo5231M18 == null) {
                                            break;
                                        } else {
/* 4318 */                                  c1642r3.f11559d0 = strMo5231M18;
                                            break;
                                        }
                                        break;
                                    case "version_name":
/* 4301 */                              String strMo5231M19 = interfaceC1489i4.mo5231M();
/* 4305 */                              if (strMo5231M19 == null) {
                                            break;
                                        } else {
/* 4307 */                                  c1642r3.f11561e0 = strMo5231M19;
                                            break;
                                        }
                                        break;
                                    case "environment":
/* 4290 */                              String strMo5231M20 = interfaceC1489i4.mo5231M();
/* 4294 */                              if (strMo5231M20 == null) {
                                            break;
                                        } else {
/* 4296 */                                  c1642r3.f11567i0 = strMo5231M20;
                                            break;
                                        }
                                        break;
                                    case "timestamp":
/* 4279 */                              Date dateMo5241l1 = interfaceC1489i3.mo5241l0(iLogger);
/* 4283 */                              if (dateMo5241l1 == null) {
                                            break;
                                        } else {
/* 4285 */                                  c1642r3.f11569k0 = dateMo5241l1;
                                            break;
                                        }
                                        break;
                                    case "transaction_name":
/* 4268 */                              String strMo5231M21 = interfaceC1489i4.mo5231M();
/* 4272 */                              if (strMo5231M21 == null) {
                                            break;
                                        } else {
/* 4274 */                                  c1642r3.f11555b0 = strMo5231M21;
                                            break;
                                        }
                                        break;
                                    case "device_os_name":
/* 4257 */                              String strMo5231M22 = interfaceC1489i4.mo5231M();
/* 4261 */                              if (strMo5231M22 == null) {
                                            break;
                                        } else {
/* 4263 */                                  c1642r3.f11573v = strMo5231M22;
                                            break;
                                        }
                                        break;
                                    case "architecture":
/* 4246 */                              String strMo5231M23 = interfaceC1489i4.mo5231M();
/* 4250 */                              if (strMo5231M23 == null) {
                                            break;
                                        } else {
/* 4252 */                                  c1642r3.f11547V = strMo5231M23;
                                            break;
                                        }
                                        break;
                                    case "transaction_id":
/* 4235 */                              String strMo5231M24 = interfaceC1489i4.mo5231M();
/* 4239 */                              if (strMo5231M24 == null) {
                                            break;
                                        } else {
/* 4241 */                                  c1642r3.f11563f0 = strMo5231M24;
                                            break;
                                        }
                                        break;
                                    case "device_os_version":
/* 4224 */                              String strMo5231M25 = interfaceC1489i4.mo5231M();
/* 4228 */                              if (strMo5231M25 == null) {
                                            break;
                                        } else {
/* 4230 */                                  c1642r3.f11574w = strMo5231M25;
                                            break;
                                        }
                                        break;
                                    case "truncation_reason":
/* 4213 */                              String strMo5231M26 = interfaceC1489i4.mo5231M();
/* 4217 */                              if (strMo5231M26 == null) {
                                            break;
                                        } else {
/* 4219 */                                  c1642r3.f11568j0 = strMo5231M26;
                                            break;
                                        }
                                        break;
                                    case "trace_id":
/* 4202 */                              String strMo5231M27 = interfaceC1489i4.mo5231M();
/* 4206 */                              if (strMo5231M27 == null) {
                                            break;
                                        } else {
/* 4208 */                                  c1642r3.f11564g0 = strMo5231M27;
                                            break;
                                        }
                                        break;
                                    case "platform":
/* 4191 */                              String strMo5231M28 = interfaceC1489i4.mo5231M();
/* 4195 */                              if (strMo5231M28 == null) {
                                            break;
                                        } else {
/* 4197 */                                  c1642r3.f11550Y = strMo5231M28;
                                            break;
                                        }
                                        break;
                                    case "sampled_profile":
/* 4180 */                              String strMo5231M29 = interfaceC1489i4.mo5231M();
/* 4184 */                              if (strMo5231M29 == null) {
                                            break;
                                        } else {
/* 4186 */                                  c1642r3.f11571m0 = strMo5231M29;
                                            break;
                                        }
                                        break;
                                    case "transactions":
/* 4166 */                              ArrayList arrayListMo5239h3 = interfaceC1489i4.mo5239h1(iLogger, new C1431e(4));
/* 4170 */                              if (arrayListMo5239h3 == null) {
                                            break;
                                        } else {
/* 4174 */                                  c1642r3.f11553a0.addAll(arrayListMo5239h3);
                                            break;
                                        }
                                        break;
                                    default:
/* 4147 */                              if (concurrentHashMap9 == null) {
/* 4151 */                                  concurrentHashMap9 = new ConcurrentHashMap();
                                        }
/* 4154 */                              interfaceC1489i4.mo5244w(iLogger, concurrentHashMap9, strNextName4);
                                        break;
                                }
                            }
/* 4473 */                  c1642r3.f11572n0 = concurrentHashMap9;
/* 4475 */                  interfaceC1489i4.endObject();
/* 3786 */                  return c1642r3;
                        case 4:
/* 3490 */                  interfaceC1489i4.beginObject();
/* 3503 */                  C1663s3 c1663s3 = new C1663s3(C1447f3.f10939a, 0L, 0L);
/* 3512 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 3514 */                      String strNextName5 = interfaceC1489i4.nextName();
/* 3518 */                      strNextName5.getClass();
                                switch (strNextName5) {
                                    case "relative_start_ns":
/* 3677 */                              Long lMo5227B = interfaceC1489i4.mo5227B();
/* 3681 */                              if (lMo5227B == null) {
                                            break;
                                        } else {
/* 3683 */                                  c1663s3.f11644d = lMo5227B;
                                            break;
                                        }
                                        break;
                                    case "relative_end_ns":
/* 3667 */                              Long lMo5227B2 = interfaceC1489i4.mo5227B();
/* 3671 */                              if (lMo5227B2 == null) {
                                            break;
                                        } else {
/* 3673 */                                  c1663s3.f11645e = lMo5227B2;
                                            break;
                                        }
                                        break;
                                    case "id":
/* 3657 */                              String strMo5231M30 = interfaceC1489i4.mo5231M();
/* 3661 */                              if (strMo5231M30 == null) {
                                            break;
                                        } else {
/* 3663 */                                  c1663s3.f11641a = strMo5231M30;
                                            break;
                                        }
                                        break;
                                    case "name":
/* 3647 */                              String strMo5231M31 = interfaceC1489i4.mo5231M();
/* 3651 */                              if (strMo5231M31 == null) {
                                            break;
                                        } else {
/* 3653 */                                  c1663s3.f11643c = strMo5231M31;
                                            break;
                                        }
                                        break;
                                    case "trace_id":
/* 3637 */                              String strMo5231M32 = interfaceC1489i4.mo5231M();
/* 3641 */                              if (strMo5231M32 == null) {
                                            break;
                                        } else {
/* 3643 */                                  c1663s3.f11642b = strMo5231M32;
                                            break;
                                        }
                                        break;
                                    case "relative_cpu_end_ms":
/* 3627 */                              Long lMo5227B3 = interfaceC1489i4.mo5227B();
/* 3631 */                              if (lMo5227B3 == null) {
                                            break;
                                        } else {
/* 3633 */                                  c1663s3.f11647i = lMo5227B3;
                                            break;
                                        }
                                        break;
                                    case "relative_cpu_start_ms":
/* 3618 */                              Long lMo5227B4 = interfaceC1489i4.mo5227B();
/* 3622 */                              if (lMo5227B4 == null) {
                                            break;
                                        } else {
/* 3624 */                                  c1663s3.f11646f = lMo5227B4;
                                            break;
                                        }
                                        break;
                                    default:
/* 3607 */                              if (concurrentHashMap5 == null) {
/* 3611 */                                  concurrentHashMap5 = new ConcurrentHashMap();
                                        }
/* 3614 */                              interfaceC1489i4.mo5244w(iLogger, concurrentHashMap5, strNextName5);
                                        break;
                                }
                            }
/* 3687 */                  c1663s3.f11648v = concurrentHashMap5;
/* 3689 */                  interfaceC1489i4.endObject();
/* 3692 */                  return c1663s3;
                        case 5:
/* 3107 */                  C1745x3 c1745x3 = new C1745x3();
/* 3110 */                  interfaceC1489i4.beginObject();
/* 3113 */                  HashMap map2 = null;
/* 3114 */                  Integer numMo5243r3 = null;
/* 3121 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 3123 */                      String strNextName6 = interfaceC1489i4.nextName();
/* 3127 */                      strNextName6.getClass();
/* 3136 */                      if (strNextName6.equals("segment_id")) {
/* 3149 */                          numMo5243r3 = interfaceC1489i4.mo5243r();
                                } else {
/* 3138 */                          if (map2 == null) {
/* 3142 */                              map2 = new HashMap();
                                    }
/* 3145 */                          interfaceC1489i4.mo5244w(iLogger, map2, strNextName6);
                                }
                            }
/* 3154 */                  interfaceC1489i4.endObject();
/* 3158 */                  interfaceC1489i4.setLenient(true);
/* 3165 */                  List list2 = (List) interfaceC1489i4.mo5232R0();
/* 3168 */                  interfaceC1489i4.setLenient(false);
/* 3171 */                  if (list2 != null) {
/* 3179 */                      arrayList = new ArrayList(list2.size());
/* 3190 */                      for (Object obj : list2) {
/* 3198 */                          if (obj instanceof Map) {
/* 3200 */                              Map map3 = (Map) obj;
/* 3204 */                              C1710i c1710i = new C1710i(map3);
/* 3219 */                              for (Map.Entry entry : map3.entrySet()) {
/* 3231 */                                  String str2 = (String) entry.getKey();
/* 3233 */                                  Object value = entry.getValue();
/* 3241 */                                  if (str2.equals("type")) {
/* 3253 */                                      EnumC1648c enumC1648c = EnumC1648c.values()[((Integer) value).intValue()];
/* 3261 */                                      int i5 = AbstractC1737w3.f11800b[enumC1648c.ordinal()];
/* 3266 */                                      if (i5 == 1) {
/* 3400 */                                          Map map4 = (Map) map3.get(SharedDataContentProvider.BASE_PATH);
/* 3402 */                                          if (map4 == null) {
/* 3404 */                                              map4 = Collections.EMPTY_MAP;
                                                    }
/* 3412 */                                          Integer num = (Integer) map4.get(FirebaseAnalytics.Param.SOURCE);
/* 3414 */                                          if (num != null) {
/* 3424 */                                              EnumC1649d enumC1649d = EnumC1649d.values()[num.intValue()];
/* 3432 */                                              int i6 = AbstractC1737w3.f11799a[enumC1649d.ordinal()];
/* 3435 */                                              if (i6 == 1) {
/* 3466 */                                                  arrayList.add(C1596d0.m5371c(c1710i, iLogger));
                                                        } else if (i6 != 2) {
/* 3448 */                                                  iLogger.mo4672k(EnumC1553m5.DEBUG, "Unsupported rrweb incremental snapshot type %s", enumC1649d);
                                                        } else {
/* 3457 */                                                  arrayList.add(C1596d0.m5372d(c1710i, iLogger));
                                                        }
                                                    }
                                                } else if (i5 == 2) {
/* 3391 */                                          arrayList.add(C1596d0.m5373e(c1710i, iLogger));
                                                } else if (i5 == 3) {
/* 3291 */                                          Map map5 = (Map) map3.get(SharedDataContentProvider.BASE_PATH);
/* 3293 */                                          if (map5 == null) {
/* 3295 */                                              map5 = Collections.EMPTY_MAP;
                                                    }
/* 3303 */                                          String str3 = (String) map5.get("tag");
/* 3305 */                                          if (str3 != null) {
                                                        switch (str3) {
                                                            case "performanceSpan":
/* 3382 */                                                      arrayList.add(C1596d0.m5374f(c1710i, iLogger));
                                                                break;
                                                            case "video":
/* 3374 */                                                      arrayList.add(C1596d0.m5375g(c1710i, iLogger));
                                                                break;
                                                            case "breadcrumb":
/* 3366 */                                                      arrayList.add(C1596d0.m5370b(c1710i, iLogger));
                                                                break;
                                                            default:
/* 3358 */                                                      iLogger.mo4672k(EnumC1553m5.DEBUG, "Unsupported rrweb event type %s", enumC1648c);
                                                                break;
                                                        }
                                                    }
                                                } else {
/* 3282 */                                          iLogger.mo4672k(EnumC1553m5.DEBUG, "Unsupported rrweb event type %s", enumC1648c);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
/* 3479 */                      arrayList = null;
                            }
/* 3480 */                  c1745x3.f11809a = numMo5243r3;
/* 3482 */                  c1745x3.f11810b = arrayList;
/* 3484 */                  c1745x3.f11811c = map2;
/* 3486 */                  return c1745x3;
                        case 6:
/* 2709 */                  interfaceC1489i4.beginObject();
/* 2714 */                  C1565n4 c1565n4 = new C1565n4();
/* 2718 */                  c1565n4.f11170c = false;
/* 2720 */                  c1565n4.f11171d = null;
/* 2722 */                  c1565n4.f11168a = false;
/* 2724 */                  c1565n4.f11169b = null;
/* 2726 */                  c1565n4.f11176w = false;
/* 2728 */                  c1565n4.f11172e = null;
/* 2730 */                  c1565n4.f11173f = false;
/* 2732 */                  c1565n4.f11174i = false;
/* 2736 */                  c1565n4.f11166W = EnumC1634q3.MANUAL;
/* 2738 */                  c1565n4.f11175v = 0;
/* 2741 */                  c1565n4.f11164U = true;
/* 2743 */                  c1565n4.f11165V = false;
/* 2751 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 2753 */                      String strNextName7 = interfaceC1489i4.nextName();
/* 2757 */                      strNextName7.getClass();
                                switch (strNextName7) {
                                    case "is_enable_app_start_profiling":
/* 3084 */                              Boolean boolMo5242q1 = interfaceC1489i4.mo5242q0();
/* 3088 */                              if (boolMo5242q1 == null) {
                                            break;
                                        } else {
/* 3094 */                                  c1565n4.f11164U = boolMo5242q1.booleanValue();
                                            break;
                                        }
                                        break;
                                    case "trace_sampled":
/* 3070 */                              Boolean boolMo5242q2 = interfaceC1489i4.mo5242q0();
/* 3074 */                              if (boolMo5242q2 == null) {
                                            break;
                                        } else {
/* 3080 */                                  c1565n4.f11170c = boolMo5242q2.booleanValue();
                                            break;
                                        }
                                        break;
                                    case "profiling_traces_dir_path":
/* 3060 */                              String strMo5231M33 = interfaceC1489i4.mo5231M();
/* 3064 */                              if (strMo5231M33 == null) {
                                            break;
                                        } else {
/* 3066 */                                  c1565n4.f11172e = strMo5231M33;
                                            break;
                                        }
                                        break;
                                    case "is_continuous_profiling_enabled":
/* 3046 */                              Boolean boolMo5242q3 = interfaceC1489i4.mo5242q0();
/* 3050 */                              if (boolMo5242q3 == null) {
                                            break;
                                        } else {
/* 3056 */                                  c1565n4.f11174i = boolMo5242q3.booleanValue();
                                            break;
                                        }
                                        break;
                                    case "is_profiling_enabled":
/* 3032 */                              Boolean boolMo5242q4 = interfaceC1489i4.mo5242q0();
/* 3036 */                              if (boolMo5242q4 == null) {
                                            break;
                                        } else {
/* 3042 */                                  c1565n4.f11173f = boolMo5242q4.booleanValue();
                                            break;
                                        }
                                        break;
                                    case "is_start_profiler_on_app_start":
/* 3018 */                              Boolean boolMo5242q5 = interfaceC1489i4.mo5242q0();
/* 3022 */                              if (boolMo5242q5 == null) {
                                            break;
                                        } else {
/* 3028 */                                  c1565n4.f11165V = boolMo5242q5.booleanValue();
                                            break;
                                        }
                                        break;
                                    case "profile_sampled":
/* 3004 */                              Boolean boolMo5242q6 = interfaceC1489i4.mo5242q0();
/* 3008 */                              if (boolMo5242q6 == null) {
                                            break;
                                        } else {
/* 3014 */                                  c1565n4.f11168a = boolMo5242q6.booleanValue();
                                            break;
                                        }
                                        break;
                                    case "profile_lifecycle":
/* 2974 */                              String strMo5231M34 = interfaceC1489i4.mo5231M();
/* 2978 */                              if (strMo5231M34 == null) {
                                            break;
                                        } else {
                                            try {
/* 2984 */                                      c1565n4.f11166W = EnumC1634q3.valueOf(strMo5231M34);
                                            } catch (IllegalArgumentException unused) {
/* 2999 */                                      iLogger.mo4672k(EnumC1553m5.ERROR, "Error when deserializing ProfileLifecycle: ".concat(strMo5231M34), new Object[0]);
                                            }
                                            break;
                                        }
                                        break;
                                    case "continuous_profile_sampled":
/* 2960 */                              Boolean boolMo5242q7 = interfaceC1489i4.mo5242q0();
/* 2964 */                              if (boolMo5242q7 == null) {
                                            break;
                                        } else {
/* 2970 */                                  c1565n4.f11176w = boolMo5242q7.booleanValue();
                                            break;
                                        }
                                        break;
                                    case "profiling_traces_hz":
/* 2946 */                              Integer numMo5243r4 = interfaceC1489i4.mo5243r();
/* 2950 */                              if (numMo5243r4 == null) {
                                            break;
                                        } else {
/* 2956 */                                  c1565n4.f11175v = numMo5243r4.intValue();
                                            break;
                                        }
                                        break;
                                    case "trace_sample_rate":
/* 2936 */                              Double dMo5234b1 = interfaceC1489i4.mo5234b0();
/* 2940 */                              if (dMo5234b1 == null) {
                                            break;
                                        } else {
/* 2942 */                                  c1565n4.f11171d = dMo5234b1;
                                            break;
                                        }
                                        break;
                                    case "profile_sample_rate":
/* 2926 */                              Double dMo5234b2 = interfaceC1489i4.mo5234b0();
/* 2930 */                              if (dMo5234b2 == null) {
                                            break;
                                        } else {
/* 2932 */                                  c1565n4.f11169b = dMo5234b2;
                                            break;
                                        }
                                        break;
                                    default:
/* 2914 */                              if (concurrentHashMap4 == null) {
/* 2918 */                                  concurrentHashMap4 = new ConcurrentHashMap();
                                        }
/* 2921 */                              interfaceC1489i4.mo5244w(iLogger, concurrentHashMap4, strNextName7);
                                        break;
                                }
                            }
/* 3098 */                  c1565n4.f11167X = concurrentHashMap4;
/* 3100 */                  interfaceC1489i4.endObject();
/* 3103 */                  return c1565n4;
                        case 7:
/* 2553 */                  C1624u c1624u2 = null;
/* 2554 */                  interfaceC1489i4.beginObject();
/* 2557 */                  C1472h7 c1472h7 = null;
/* 2558 */                  Date dateMo5241l2 = null;
/* 2559 */                  HashMap map6 = null;
/* 2560 */                  C1626w c1626w7 = null;
/* 2567 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 2569 */                      String strNextName8 = interfaceC1489i4.nextName();
/* 2573 */                      strNextName8.getClass();
                                switch (strNextName8) {
                                    case "sdk":
/* 2688 */                              c1624u2 = (C1624u) interfaceC1489i4.mo5230K0(iLogger, new C1411a(21));
                                        break;
                                    case "trace":
/* 2674 */                              c1472h7 = (C1472h7) interfaceC1489i4.mo5230K0(iLogger, new C1431e(25));
                                        break;
                                    case "event_id":
/* 2659 */                              c1626w7 = (C1626w) interfaceC1489i4.mo5230K0(iLogger, new C1411a(23));
                                        break;
                                    case "sent_at":
/* 2643 */                              dateMo5241l2 = interfaceC1489i3.mo5241l0(iLogger);
                                        break;
                                    default:
/* 2632 */                              if (map6 == null) {
/* 2636 */                                  map6 = new HashMap();
                                        }
/* 2639 */                              interfaceC1489i4.mo5244w(iLogger, map6, strNextName8);
                                        break;
                                }
                            }
/* 2694 */                  C1726v4 c1726v4 = new C1726v4(c1626w7, c1624u2, c1472h7);
/* 2697 */                  c1726v4.f11763d = dateMo5241l2;
/* 2699 */                  c1726v4.f11764e = map6;
/* 2701 */                  interfaceC1489i4.endObject();
/* 2704 */                  return c1726v4;
                        case 8:
/* 2321 */                  interfaceC1489i4.beginObject();
/* 2324 */                  EnumC1538l5 enumC1538l5 = null;
/* 2326 */                  String strMo5231M35 = null;
/* 2328 */                  String strMo5231M36 = null;
/* 2330 */                  String strMo5231M37 = null;
/* 2332 */                  String strMo5231M38 = null;
/* 2334 */                  Integer numMo5243r5 = null;
/* 2336 */                  int iNextInt = 0;
/* 2344 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 2346 */                      String strNextName9 = interfaceC1489i4.nextName();
/* 2350 */                      strNextName9.getClass();
                                switch (strNextName9) {
                                    case "item_count":
/* 2517 */                              numMo5243r5 = interfaceC1489i4.mo5243r();
                                        continue;
                                        break;
                                    case "length":
/* 2507 */                              iNextInt = interfaceC1489i4.nextInt();
                                        continue;
                                        break;
                                    case "filename":
/* 2497 */                              strMo5231M36 = interfaceC1489i4.mo5231M();
                                        continue;
                                        break;
                                    case "attachment_type":
/* 2487 */                              strMo5231M37 = interfaceC1489i4.mo5231M();
                                        continue;
                                        break;
                                    case "type":
/* 2479 */                              enumC1538l5 = (EnumC1538l5) interfaceC1489i4.mo5230K0(iLogger, new C1431e(10));
                                        continue;
                                        break;
                                    case "content_type":
/* 2461 */                              strMo5231M35 = interfaceC1489i4.mo5231M();
                                        break;
                                    case "platform":
/* 2454 */                              strMo5231M38 = interfaceC1489i4.mo5231M();
                                        break;
                                    default:
/* 2441 */                              if (map == null) {
/* 2445 */                                  map = new HashMap();
                                        }
/* 2448 */                              interfaceC1489i4.mo5244w(iLogger, map, strNextName9);
                                        break;
                                }
                            }
/* 2525 */                  if (enumC1538l5 == null) {
/* 2544 */                      IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
/* 2549 */                      iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"type\"", illegalStateException);
/* 2552 */                      throw illegalStateException;
                            }
/* 2529 */                  C1381b5 c1381b5 = new C1381b5(enumC1538l5, iNextInt, strMo5231M35, strMo5231M36, strMo5231M37, strMo5231M38, numMo5243r5);
/* 2534 */                  c1381b5.f10748w = map;
/* 2536 */                  interfaceC1489i4.endObject();
/* 2532 */                  return c1381b5;
                        case 9:
/* 2021 */                  interfaceC1489i4.beginObject();
/* 2026 */                  C1393c5 c1393c5 = new C1393c5();
/* 2035 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 2037 */                      String strNextName10 = interfaceC1489i4.nextName();
/* 2041 */                      strNextName10.getClass();
                                switch (strNextName10) {
                                    case "fingerprint":
/* 2306 */                              List list3 = (List) interfaceC1489i4.mo5232R0();
/* 2308 */                              if (list3 == null) {
                                            break;
                                        } else {
/* 2310 */                                  c1393c5.f10789h0 = list3;
                                            break;
                                        }
                                        break;
                                    case "threads":
/* 2274 */                              interfaceC1489i4.beginObject();
/* 2277 */                              interfaceC1489i4.nextName();
/* 2295 */                              c1393c5.f10785d0 = new C1425d2(interfaceC1489i4.mo5239h1(iLogger, new C1596d0(0)));
/* 2297 */                              interfaceC1489i4.endObject();
                                        break;
                                    case "logger":
/* 2270 */                              c1393c5.f10784c0 = interfaceC1489i4.mo5231M();
                                        break;
                                    case "timestamp":
/* 2256 */                              Date dateMo5241l3 = interfaceC1489i3.mo5241l0(iLogger);
/* 2260 */                              if (dateMo5241l3 == null) {
                                            break;
                                        } else {
/* 2262 */                                  c1393c5.f10782a0 = dateMo5241l3;
                                            break;
                                        }
                                        break;
                                    case "level":
/* 2252 */                              c1393c5.f10787f0 = (EnumC1553m5) interfaceC1489i4.mo5230K0(iLogger, new C1431e(i3));
                                        break;
                                    case "message":
/* 2237 */                              c1393c5.f10783b0 = (C1616p) interfaceC1489i4.mo5230K0(iLogger, new C1411a(i2));
                                        break;
                                    case "modules":
/* 2222 */                              c1393c5.f10791j0 = AbstractC1704c.m5459n((Map) interfaceC1489i4.mo5232R0());
                                        break;
                                    case "exception":
/* 2183 */                              interfaceC1489i4.beginObject();
/* 2186 */                              interfaceC1489i4.nextName();
/* 2205 */                              c1393c5.f10786e0 = new C1425d2(interfaceC1489i4.mo5239h1(iLogger, new C1411a(22)));
/* 2207 */                              interfaceC1489i4.endObject();
                                        break;
                                    case "transaction":
/* 2179 */                              c1393c5.f10788g0 = interfaceC1489i4.mo5231M();
                                        break;
                                    default:
/* 2161 */                              if (!AbstractC1417a.m5168f(c1393c5, strNextName10, interfaceC1489i4, iLogger)) {
/* 2163 */                                  if (concurrentHashMap3 == null) {
/* 2167 */                                      concurrentHashMap3 = new ConcurrentHashMap();
                                            }
/* 2170 */                                  interfaceC1489i4.mo5244w(iLogger, concurrentHashMap3, strNextName10);
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                }
                            }
/* 2314 */                  c1393c5.f10790i0 = concurrentHashMap3;
/* 2316 */                  interfaceC1489i4.endObject();
/* 2319 */                  return c1393c5;
                        case 10:
/* 2015 */                  return EnumC1538l5.valueOfLabel(interfaceC1489i4.nextString().toLowerCase(Locale.ROOT));
                        case 11:
/* 2000 */                  return EnumC1553m5.valueOf(interfaceC1489i4.nextString().toUpperCase(Locale.ROOT));
                        case 12:
/* 1852 */                  C1566n5 c1566n5 = new C1566n5();
/* 1855 */                  interfaceC1489i4.beginObject();
/* 1864 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 1866 */                      String strNextName11 = interfaceC1489i4.nextName();
/* 1870 */                      strNextName11.getClass();
                                switch (strNextName11) {
                                    case "package_name":
/* 1981 */                              c1566n5.f11179c = interfaceC1489i4.mo5231M();
                                        break;
                                    case "thread_id":
/* 1974 */                              c1566n5.f11181e = interfaceC1489i4.mo5227B();
                                        break;
                                    case "address":
/* 1967 */                              c1566n5.f11178b = interfaceC1489i4.mo5231M();
                                        break;
                                    case "class_name":
/* 1960 */                              c1566n5.f11180d = interfaceC1489i4.mo5231M();
                                        break;
                                    case "type":
/* 1953 */                              c1566n5.f11177a = interfaceC1489i4.nextInt();
                                        break;
                                    default:
/* 1938 */                              if (concurrentHashMap2 == null) {
/* 1942 */                                  concurrentHashMap2 = new ConcurrentHashMap();
                                        }
/* 1945 */                              interfaceC1489i4.mo5244w(iLogger, concurrentHashMap2, strNextName11);
                                        break;
                                }
                            }
/* 1984 */                  c1566n5.f11182f = concurrentHashMap2;
/* 1986 */                  interfaceC1489i4.endObject();
/* 1989 */                  return c1566n5;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1573 */                  Double dMo5234b3 = null;
/* 1574 */                  interfaceC1489i4.beginObject();
/* 1577 */                  String strMo5231M39 = null;
/* 1578 */                  HashMap map7 = null;
/* 1579 */                  EnumC1636q5 enumC1636q5 = null;
/* 1580 */                  HashMap mapMo5233T3 = null;
/* 1581 */                  Integer numMo5243r6 = null;
/* 1582 */                  C1430d7 c1430d7 = null;
/* 1583 */                  C1626w c1626w8 = null;
/* 1590 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 1592 */                      String strNextName12 = interfaceC1489i4.nextName();
/* 1596 */                      strNextName12.getClass();
                                switch (strNextName12) {
                                    case "span_id":
/* 1768 */                              c1430d7 = (C1430d7) interfaceC1489i4.mo5230K0(iLogger, new C1431e(23));
                                        break;
                                    case "severity_number":
/* 1751 */                              numMo5243r6 = interfaceC1489i4.mo5243r();
                                        break;
                                    case "body":
/* 1745 */                              strMo5231M39 = interfaceC1489i4.mo5231M();
                                        break;
                                    case "timestamp":
/* 1739 */                              dMo5234b3 = interfaceC1489i4.mo5234b0();
                                        break;
                                    case "level":
/* 1735 */                              enumC1636q5 = (EnumC1636q5) interfaceC1489i4.mo5230K0(iLogger, new C1431e(16));
                                        break;
                                    case "attributes":
/* 1718 */                              mapMo5233T3 = interfaceC1489i4.mo5233T(iLogger, new C1431e(14));
                                        break;
                                    case "trace_id":
/* 1707 */                              c1626w8 = (C1626w) interfaceC1489i4.mo5230K0(iLogger, new C1411a(23));
                                        break;
                                    default:
/* 1685 */                              if (map7 == null) {
/* 1689 */                                  map7 = new HashMap();
                                        }
/* 1692 */                              interfaceC1489i4.mo5244w(iLogger, map7, strNextName12);
                                        break;
                                }
                            }
/* 1772 */                  interfaceC1489i4.endObject();
/* 1775 */                  if (c1626w8 == null) {
/* 1840 */                      IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"trace_id\"");
/* 1845 */                      iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"trace_id\"", illegalStateException2);
/* 1848 */                      throw illegalStateException2;
                            }
/* 1777 */                  if (dMo5234b3 == null) {
/* 1827 */                      IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"timestamp\"");
/* 1832 */                      iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"timestamp\"", illegalStateException3);
/* 1835 */                      throw illegalStateException3;
                            }
/* 1779 */                  if (strMo5231M39 == null) {
/* 1814 */                      IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"body\"");
/* 1819 */                      iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"body\"", illegalStateException4);
/* 1822 */                      throw illegalStateException4;
                            }
/* 1781 */                  if (enumC1636q5 == null) {
/* 1801 */                      IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"level\"");
/* 1806 */                      iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"level\"", illegalStateException5);
/* 1809 */                      throw illegalStateException5;
                            }
/* 1785 */                  C1575o5 c1575o5 = new C1575o5(c1626w8, dMo5234b3, strMo5231M39, enumC1636q5);
/* 1788 */                  c1575o5.f11207i = mapMo5233T3;
/* 1790 */                  c1575o5.f11206f = numMo5243r6;
/* 1792 */                  c1575o5.f11202b = c1430d7;
/* 1794 */                  c1575o5.f11208v = map7;
/* 1796 */                  return c1575o5;
                        case 14:
/* 1490 */                  Object objMo5232R0 = null;
/* 1491 */                  interfaceC1489i4.beginObject();
/* 1494 */                  HashMap map8 = null;
/* 1495 */                  String strMo5231M40 = null;
/* 1502 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 1504 */                      String strNextName13 = interfaceC1489i4.nextName();
/* 1508 */                      strNextName13.getClass();
/* 1515 */                      if (strNextName13.equals("type")) {
/* 1541 */                          strMo5231M40 = interfaceC1489i4.mo5231M();
                                } else if (strNextName13.equals(FirebaseAnalytics.Param.VALUE)) {
/* 1536 */                          objMo5232R0 = interfaceC1489i4.mo5232R0();
                                } else {
/* 1525 */                          if (map8 == null) {
/* 1529 */                              map8 = new HashMap();
                                    }
/* 1532 */                          interfaceC1489i4.mo5244w(iLogger, map8, strNextName13);
                                }
                            }
/* 1547 */                  interfaceC1489i4.endObject();
/* 1550 */                  if (strMo5231M40 != null) {
/* 1554 */                      C1614n c1614n = new C1614n(strMo5231M40, objMo5232R0);
/* 1557 */                      c1614n.f11408d = map8;
/* 1559 */                      return c1614n;
                            }
/* 1564 */                  IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"type\"");
/* 1569 */                  iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"type\"", illegalStateException6);
/* 1572 */                  throw illegalStateException6;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1413 */                  HashMap map9 = null;
/* 1414 */                  interfaceC1489i4.beginObject();
/* 1423 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 1425 */                      String strNextName14 = interfaceC1489i4.nextName();
/* 1429 */                      strNextName14.getClass();
/* 1438 */                      if (strNextName14.equals(FirebaseAnalytics.Param.ITEMS)) {
/* 1458 */                          arrayListMo5239h2 = interfaceC1489i4.mo5239h1(iLogger, new C1431e(13));
                                } else {
/* 1440 */                          if (map9 == null) {
/* 1444 */                              map9 = new HashMap();
                                    }
/* 1447 */                          interfaceC1489i4.mo5244w(iLogger, map9, strNextName14);
                                }
                            }
/* 1464 */                  interfaceC1489i4.endObject();
/* 1467 */                  if (arrayListMo5239h2 != null) {
/* 1471 */                      C1583p5 c1583p5 = new C1583p5(arrayListMo5239h2);
/* 1474 */                      c1583p5.f11229b = map9;
/* 1476 */                      return c1583p5;
                            }
/* 1481 */                  IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"items\"");
/* 1486 */                  iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"items\"", illegalStateException7);
/* 1489 */                  throw illegalStateException7;
                        case 16:
/* 1408 */                  return EnumC1636q5.valueOf(interfaceC1489i4.nextString().toUpperCase(Locale.ROOT));
                        case 17:
/* 1083 */                  Double dMo5234b4 = null;
/* 1084 */                  interfaceC1489i4.beginObject();
/* 1087 */                  String strMo5231M41 = null;
/* 1088 */                  HashMap map10 = null;
/* 1089 */                  String strMo5231M42 = null;
/* 1090 */                  Double dMo5234b5 = null;
/* 1091 */                  HashMap mapMo5233T4 = null;
/* 1092 */                  C1430d7 c1430d8 = null;
/* 1093 */                  String strMo5231M43 = null;
/* 1094 */                  C1626w c1626w9 = null;
                            while (true) {
/* 1099 */                      HashMap map11 = map10;
/* 1103 */                      if (interfaceC1489i4.peek() != EnumC1731b.NAME) {
/* 1294 */                          interfaceC1489i4.endObject();
/* 1297 */                          if (c1626w9 == null) {
/* 1389 */                              IllegalStateException illegalStateException8 = new IllegalStateException("Missing required field \"trace_id\"");
/* 1394 */                              iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"trace_id\"", illegalStateException8);
/* 1397 */                              throw illegalStateException8;
                                    }
/* 1299 */                          if (dMo5234b4 == null) {
/* 1376 */                              IllegalStateException illegalStateException9 = new IllegalStateException("Missing required field \"timestamp\"");
/* 1381 */                              iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"timestamp\"", illegalStateException9);
/* 1384 */                              throw illegalStateException9;
                                    }
/* 1301 */                          if (strMo5231M41 == null) {
/* 1363 */                              IllegalStateException illegalStateException10 = new IllegalStateException("Missing required field \"type\"");
/* 1368 */                              iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"type\"", illegalStateException10);
/* 1371 */                              throw illegalStateException10;
                                    }
/* 1303 */                          if (strMo5231M42 == null) {
/* 1350 */                              IllegalStateException illegalStateException11 = new IllegalStateException("Missing required field \"name\"");
/* 1355 */                              iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"name\"", illegalStateException11);
/* 1358 */                              throw illegalStateException11;
                                    }
/* 1305 */                          if (dMo5234b5 == null) {
/* 1337 */                              IllegalStateException illegalStateException12 = new IllegalStateException("Missing required field \"value\"");
/* 1342 */                              iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"value\"", illegalStateException12);
/* 1345 */                              throw illegalStateException12;
                                    }
/* 1309 */                          C1665s5 c1665s5 = new C1665s5();
/* 1312 */                          c1665s5.f11652a = c1626w9;
/* 1314 */                          c1665s5.f11654c = dMo5234b4;
/* 1316 */                          c1665s5.f11655d = strMo5231M42;
/* 1318 */                          c1665s5.f11657f = strMo5231M41;
/* 1320 */                          c1665s5.f11658i = dMo5234b5;
/* 1322 */                          c1665s5.f11659v = mapMo5233T4;
/* 1324 */                          c1665s5.f11653b = c1430d8;
/* 1326 */                          c1665s5.f11656e = strMo5231M43;
/* 1330 */                          c1665s5.f11660w = map11;
/* 1332 */                          return c1665s5;
                                }
/* 1105 */                      String strNextName15 = interfaceC1489i4.nextName();
/* 1109 */                      strNextName15.getClass();
                                switch (strNextName15) {
                                    case "span_id":
/* 1290 */                              c1430d8 = (C1430d7) interfaceC1489i4.mo5230K0(iLogger, new C1431e(23));
                                        break;
                                    case "name":
/* 1273 */                              strMo5231M42 = interfaceC1489i4.mo5231M();
                                        break;
                                    case "type":
/* 1268 */                              strMo5231M41 = interfaceC1489i4.mo5231M();
                                        break;
                                    case "unit":
/* 1262 */                              strMo5231M43 = interfaceC1489i4.mo5231M();
                                        break;
                                    case "timestamp":
/* 1257 */                              dMo5234b4 = interfaceC1489i4.mo5234b0();
                                        break;
                                    case "value":
/* 1251 */                              dMo5234b5 = interfaceC1489i4.mo5234b0();
                                        break;
                                    case "attributes":
/* 1245 */                              mapMo5233T4 = interfaceC1489i4.mo5233T(iLogger, new C1431e(14));
                                        break;
                                    case "trace_id":
/* 1231 */                              c1626w9 = (C1626w) interfaceC1489i4.mo5230K0(iLogger, new C1411a(23));
                                        break;
                                    default:
/* 1213 */                              HashMap map12 = map11 == null ? new HashMap() : map11;
/* 1215 */                              interfaceC1489i4.mo5244w(iLogger, map12, strNextName15);
/* 1218 */                              map10 = map12;
                                        continue;
                                        break;
                                }
/* 1234 */                      map10 = map11;
                            }
                            break;
                        case 18:
/* 1008 */                  HashMap map13 = null;
/* 1009 */                  interfaceC1489i4.beginObject();
/* 1018 */                  while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 1020 */                      String strNextName16 = interfaceC1489i4.nextName();
/* 1024 */                      strNextName16.getClass();
/* 1033 */                      if (strNextName16.equals(FirebaseAnalytics.Param.ITEMS)) {
/* 1051 */                          arrayListMo5239h1 = interfaceC1489i4.mo5239h1(iLogger, new C1431e(i2));
                                } else {
/* 1035 */                          if (map13 == null) {
/* 1039 */                              map13 = new HashMap();
                                    }
/* 1042 */                          interfaceC1489i4.mo5244w(iLogger, map13, strNextName16);
                                }
                            }
/* 1057 */                  interfaceC1489i4.endObject();
/* 1060 */                  if (arrayListMo5239h1 != null) {
/* 1064 */                      C1673t5 c1673t5 = new C1673t5(arrayListMo5239h1);
/* 1067 */                      c1673t5.f11673b = map13;
/* 1069 */                      return c1673t5;
                            }
/* 1074 */                  IllegalStateException illegalStateException13 = new IllegalStateException("Missing required field \"items\"");
/* 1079 */                  iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"items\"", illegalStateException13);
/* 1082 */                  throw illegalStateException13;
                        case 19:
/* 730 */                   EnumC1567n6 enumC1567n6 = null;
/* 733 */                   C1576o6 c1576o6 = new C1576o6();
/* 736 */                   interfaceC1489i4.beginObject();
/* 739 */                   Integer numMo5243r7 = null;
/* 740 */                   Date dateMo5241l4 = null;
/* 741 */                   HashMap map14 = null;
/* 742 */                   C1626w c1626w10 = null;
/* 743 */                   Date dateMo5241l5 = null;
/* 744 */                   List list4 = null;
/* 745 */                   List list5 = null;
/* 746 */                   List list6 = null;
/* 747 */                   String strMo5231M44 = null;
                            while (true) {
/* 752 */                       Integer num2 = numMo5243r7;
/* 756 */                       if (interfaceC1489i4.peek() != EnumC1731b.NAME) {
/* 972 */                           interfaceC1489i4.endObject();
/* 975 */                           if (strMo5231M44 != null) {
/* 977 */                               c1576o6.f11210b0 = strMo5231M44;
                                    }
/* 979 */                           if (enumC1567n6 != null) {
/* 981 */                               c1576o6.f11211c0 = enumC1567n6;
                                    }
/* 983 */                           if (num2 != null) {
/* 989 */                               c1576o6.f11213e0 = num2.intValue();
                                    }
/* 991 */                           if (dateMo5241l4 != null) {
/* 993 */                               c1576o6.f11214f0 = dateMo5241l4;
                                    }
/* 995 */                           c1576o6.f11212d0 = c1626w10;
/* 997 */                           c1576o6.f11215g0 = dateMo5241l5;
/* 999 */                           c1576o6.f11216h0 = list4;
/* 1001 */                          c1576o6.f11217i0 = list5;
/* 1003 */                          c1576o6.f11218j0 = list6;
/* 1005 */                          c1576o6.f11219k0 = map14;
/* 1007 */                          return c1576o6;
                                }
/* 758 */                       String strNextName17 = interfaceC1489i4.nextName();
/* 762 */                       strNextName17.getClass();
                                switch (strNextName17) {
                                    case "replay_id":
/* 968 */                               c1626w10 = (C1626w) interfaceC1489i4.mo5230K0(iLogger, new C1411a(23));
                                        break;
                                    case "replay_start_timestamp":
/* 951 */                               dateMo5241l5 = interfaceC1489i3.mo5241l0(iLogger);
                                        break;
                                    case "type":
/* 945 */                               strMo5231M44 = interfaceC1489i4.mo5231M();
                                        break;
                                    case "urls":
/* 941 */                               list4 = (List) interfaceC1489i4.mo5232R0();
                                        break;
                                    case "timestamp":
/* 931 */                               dateMo5241l4 = interfaceC1489i3.mo5241l0(iLogger);
                                        break;
                                    case "error_ids":
/* 927 */                               list5 = (List) interfaceC1489i4.mo5232R0();
                                        break;
                                    case "trace_ids":
/* 919 */                               list6 = (List) interfaceC1489i4.mo5232R0();
                                        break;
                                    case "replay_type":
/* 912 */                               enumC1567n6 = (EnumC1567n6) interfaceC1489i4.mo5230K0(iLogger, new C1431e(20));
                                        break;
                                    case "segment_id":
/* 895 */                               numMo5243r7 = interfaceC1489i4.mo5243r();
                                        continue;
                                        break;
                                    default:
/* 879 */                               if (!AbstractC1417a.m5168f(c1576o6, strNextName17, interfaceC1489i4, iLogger)) {
/* 881 */                                   if (map14 == null) {
/* 885 */                                       map14 = new HashMap();
                                            }
/* 888 */                                   interfaceC1489i4.mo5244w(iLogger, map14, strNextName17);
                                            break;
                                        }
                                        break;
                                }
/* 891 */                       numMo5243r7 = num2;
                            }
                            break;
                        case 20:
/* 725 */                   return EnumC1567n6.valueOf(interfaceC1489i4.nextString().toUpperCase(Locale.ROOT));
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 210 */                   interfaceC1489i4.beginObject();
/* 213 */                   Integer num3 = null;
/* 215 */                   ConcurrentHashMap concurrentHashMap10 = null;
/* 217 */                   EnumC1756y6 enumC1756y6 = null;
/* 218 */                   Date dateMo5241l6 = null;
/* 219 */                   String strMo5231M45 = null;
/* 220 */                   Date dateMo5241l7 = null;
/* 221 */                   String strMo5231M46 = null;
/* 222 */                   String str4 = null;
/* 223 */                   Double dMo5234b6 = null;
/* 224 */                   Boolean boolMo5242q8 = null;
/* 225 */                   String strMo5231M47 = null;
/* 226 */                   String strMo5231M48 = null;
/* 228 */                   Long lMo5227B5 = null;
/* 230 */                   String strMo5231M49 = null;
/* 232 */                   String strMo5231M50 = null;
                            while (true) {
/* 240 */                       EnumC1756y6 enumC1756y6ValueOf = enumC1756y6;
/* 244 */                       if (interfaceC1489i4.peek() != EnumC1731b.NAME) {
/* 649 */                           Date date4 = dateMo5241l6;
/* 651 */                           if (enumC1756y6ValueOf == null) {
/* 714 */                               throw m5201d(NotificationCompat.CATEGORY_STATUS, iLogger);
                                    }
/* 653 */                           if (date4 == null) {
/* 707 */                               throw m5201d("started", iLogger);
                                    }
/* 655 */                           if (num3 == null) {
/* 700 */                               throw m5201d("errors", iLogger);
                                    }
/* 657 */                           if (strMo5231M45 == null) {
/* 693 */                               throw m5201d("release", iLogger);
                                    }
/* 680 */                           C1764z6 c1764z6 = new C1764z6(enumC1756y6ValueOf, date4, dateMo5241l7, num3.intValue(), strMo5231M46, str4, boolMo5242q8, lMo5227B5, dMo5234b6, strMo5231M49, strMo5231M47, strMo5231M50, strMo5231M45, strMo5231M48);
/* 683 */                           c1764z6.f11861a0 = concurrentHashMap10;
/* 685 */                           interfaceC1489i4.endObject();
/* 688 */                           return c1764z6;
                                }
/* 246 */                       String strNextName18 = interfaceC1489i4.nextName();
/* 250 */                       strNextName18.getClass();
                                switch (strNextName18) {
                                    case "duration":
/* 636 */                               dMo5234b6 = interfaceC1489i4.mo5234b0();
/* 402 */                               numMo5243r = num3;
                                        break;
                                    case "started":
/* 627 */                               dateMo5241l6 = interfaceC1489i3.mo5241l0(iLogger);
/* 402 */                               numMo5243r = num3;
                                        break;
                                    case "errors":
/* 622 */                               numMo5243r = interfaceC1489i4.mo5243r();
                                        break;
                                    case "status":
/* 593 */                               date = dateMo5241l6;
/* 599 */                               String strM5484b = AbstractC1716o.m5484b(interfaceC1489i4.mo5231M());
/* 603 */                               if (strM5484b == null) {
/* 615 */                                   numMo5243r = num3;
/* 617 */                                   dateMo5241l6 = date;
                                            break;
                                        } else {
/* 605 */                                   enumC1756y6ValueOf = EnumC1756y6.valueOf(strM5484b);
/* 611 */                                   dateMo5241l6 = date;
/* 402 */                                   numMo5243r = num3;
                                            break;
                                        }
                                        break;
                                    case "did":
/* 586 */                               strMo5231M46 = interfaceC1489i4.mo5231M();
/* 402 */                               numMo5243r = num3;
                                        break;
                                    case "seq":
/* 576 */                               lMo5227B5 = interfaceC1489i4.mo5227B();
/* 402 */                               numMo5243r = num3;
                                        break;
                                    case "sid":
/* 529 */                               String strMo5231M51 = interfaceC1489i4.mo5231M();
/* 533 */                               if (strMo5231M51 != null) {
/* 539 */                                   str = strMo5231M51;
/* 543 */                                   if (strMo5231M51.length() == 36 || str.length() == 32) {
/* 553 */                                       numMo5243r = num3;
/* 555 */                                       str4 = str;
                                            }
                                            break;
                                        } else {
/* 558 */                                   str = strMo5231M51;
                                        }
/* 564 */                               date = dateMo5241l6;
/* 570 */                               iLogger.mo4672k(EnumC1553m5.ERROR, "%s sid is not valid.", str);
/* 615 */                               numMo5243r = num3;
/* 617 */                               dateMo5241l6 = date;
                                        break;
                                    case "init":
/* 523 */                               boolMo5242q8 = interfaceC1489i4.mo5242q0();
/* 402 */                               numMo5243r = num3;
                                        break;
                                    case "timestamp":
/* 517 */                               dateMo5241l7 = interfaceC1489i3.mo5241l0(iLogger);
/* 402 */                               numMo5243r = num3;
                                        break;
                                    case "attrs":
/* 413 */                               interfaceC1489i4.beginObject();
/* 422 */                               while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 424 */                                   String strNextName19 = interfaceC1489i4.nextName();
/* 428 */                                   strNextName19.getClass();
                                            switch (strNextName19) {
                                                case "environment":
/* 506 */                                           strMo5231M50 = interfaceC1489i4.mo5231M();
                                                    break;
                                                case "release":
/* 500 */                                           strMo5231M45 = interfaceC1489i4.mo5231M();
                                                    break;
                                                case "ip_address":
/* 493 */                                           strMo5231M49 = interfaceC1489i4.mo5231M();
                                                    break;
                                                case "user_agent":
/* 487 */                                           strMo5231M47 = interfaceC1489i4.mo5231M();
                                                    break;
                                                default:
/* 483 */                                           interfaceC1489i4.skipValue();
                                                    break;
                                            }
                                        }
/* 513 */                               interfaceC1489i4.endObject();
/* 402 */                               numMo5243r = num3;
                                        break;
                                    case "abnormal_mechanism":
/* 406 */                               strMo5231M48 = interfaceC1489i4.mo5231M();
/* 402 */                               numMo5243r = num3;
                                        break;
                                    default:
/* 392 */                               if (concurrentHashMap10 == null) {
/* 396 */                                   concurrentHashMap10 = new ConcurrentHashMap();
                                        }
/* 399 */                               interfaceC1489i4.mo5244w(iLogger, concurrentHashMap10, strNextName18);
/* 402 */                               numMo5243r = num3;
                                        break;
                                }
/* 643 */                       num3 = numMo5243r;
/* 645 */                       enumC1756y6 = enumC1756y6ValueOf;
                            }
                            break;
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 205 */                   return m5199b(interfaceC1489i3, iLogger);
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 201 */                   return new C1430d7(interfaceC1489i4.nextString());
                        case 24:
/* 190 */                   return EnumC1451f7.valueOf(interfaceC1489i4.nextString().toUpperCase(Locale.ROOT));
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 175 */                   return m5200c(interfaceC1489i3, iLogger);
                        default:
/* 36 */                    interfaceC1489i4.beginObject();
/* 39 */                    String strMo5231M52 = null;
/* 40 */                    String strMo5231M53 = null;
/* 41 */                    String strMo5231M54 = null;
/* 42 */                    HashMap map15 = null;
/* 49 */                    while (interfaceC1489i4.peek() == EnumC1731b.NAME) {
/* 51 */                        String strNextName20 = interfaceC1489i4.nextName();
/* 55 */                        strNextName20.getClass();
                                switch (strNextName20) {
                                    case "comments":
/* 144 */                               strMo5231M54 = interfaceC1489i4.mo5231M();
                                        break;
                                    case "name":
/* 139 */                               strMo5231M52 = interfaceC1489i4.mo5231M();
                                        break;
                                    case "email":
/* 134 */                               strMo5231M53 = interfaceC1489i4.mo5231M();
                                        break;
                                    case "event_id":
/* 129 */                               c1626w = new C1626w(interfaceC1489i4.nextString());
                                        break;
                                    default:
/* 112 */                               if (map15 == null) {
/* 116 */                                   map15 = new HashMap();
                                        }
/* 119 */                               interfaceC1489i4.mo5244w(iLogger, map15, strNextName20);
                                        break;
                                }
                            }
/* 149 */                   interfaceC1489i4.endObject();
/* 152 */                   if (c1626w != null) {
/* 156 */                       C1555m7 c1555m7 = new C1555m7(c1626w, strMo5231M52, strMo5231M53, strMo5231M54);
/* 159 */                       c1555m7.f11149e = map15;
/* 161 */                       return c1555m7;
                            }
/* 166 */                   IllegalStateException illegalStateException14 = new IllegalStateException("Missing required field \"event_id\"");
/* 171 */                   iLogger.mo4671d(EnumC1553m5.ERROR, "Missing required field \"event_id\"", illegalStateException14);
/* 174 */                   throw illegalStateException14;
                    }
                }
            }
