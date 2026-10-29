            package io.sentry.android.core.internal.tombstone;

            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1393c5;
            import io.sentry.C1425d2;
            import io.sentry.C1666s6;
            import io.sentry.EnumC1553m5;
            import io.sentry.protocol.C1590a0;
            import io.sentry.protocol.C1594c0;
            import io.sentry.protocol.C1598e0;
            import io.sentry.protocol.C1599f;
            import io.sentry.protocol.C1615o;
            import io.sentry.protocol.C1616p;
            import io.sentry.protocol.C1625v;
            import io.sentry.protocol.DebugImage;
            import io.sentry.protocol.EnumC1592b0;
            import java.io.ByteArrayOutputStream;
            import java.io.Closeable;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            import p000.AbstractC0886en;
            import p000.C1890lh;
            import p000.C2257uj;
            import p000.dc0;
            import p000.ds0;
            import p000.ec0;
            import p000.fg1;
            import p000.ke2;
            import p000.o22;
            import p000.p62;
            import p000.tp2;
            import p000.ts0;
            import p000.w11;
            import p000.xt0;
            import p000.zb0;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.tombstone.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1213c implements Closeable {

                /* JADX INFO: renamed from: a */
                public final InputStream f10131a;

                /* JADX INFO: renamed from: b */
                public final List f10132b;

                /* JADX INFO: renamed from: c */
                public final List f10133c;

                /* JADX INFO: renamed from: d */
                public final String f10134d;

                /* JADX INFO: renamed from: e */
                public final HashMap f10135e;

                public C1213c(InputStream inputStream, List list, List list2, String str) {
/* 6 */             HashMap map = new HashMap();
/* 9 */             this.f10135e = map;
/* 11 */            this.f10131a = inputStream;
/* 13 */            this.f10132b = list;
/* 15 */            this.f10133c = list2;
/* 17 */            this.f10134d = str;
/* 23 */            map.put("SIGILL", "IllegalInstruction");
/* 30 */            map.put("SIGTRAP", "Trap");
/* 37 */            map.put("SIGABRT", "Abort");
/* 44 */            map.put("SIGBUS", "BusError");
/* 51 */            map.put("SIGFPE", "FloatingPointException");
/* 58 */            map.put("SIGSEGV", "Segfault");
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0067. Please report as an issue. */
                /* JADX INFO: renamed from: c */
                public final C1393c5 m4823c() throws IOException {
                    DebugImage debugImageM4821a;
                    DebugImage debugImageM4821a2;
                    C2257uj c2257uj;
                    int i;
                    int i2;
                    C2257uj c2257uj2;
                    C2257uj c2257uj3;
                    C2257uj c2257uj4;
                    C2257uj c2257uj5;
                    int i3;
                    C2257uj c2257uj6;
/* 3 */             InputStream inputStream = this.f10131a;
/* 5 */             if (inputStream == null) {
/* 2282 */              ds0.m3195l("No InputStream provided; use parse(Tombstone) instead.");
/* 2278 */              return null;
                    }
/* 9 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 14 */            byte[] bArr = new byte[Segment.SIZE];
                    while (true) {
/* 16 */                int i4 = inputStream.read(bArr);
/* 22 */                if (i4 == -1) {
                            break;
                        }
/* 24 */                byteArrayOutputStream.write(bArr, 0, i4);
                    }
/* 35 */            C2257uj c2257uj7 = new C2257uj(byteArrayOutputStream.toByteArray(), 1);
/* 40 */            ArrayList arrayList = new ArrayList();
/* 45 */            ArrayList arrayList2 = new ArrayList();
/* 50 */            ArrayList arrayList3 = new ArrayList();
/* 55 */            HashMap map = new HashMap();
/* 60 */            HashMap map2 = new HashMap();
/* 65 */            ArrayList arrayList4 = new ArrayList();
/* 70 */            ArrayList arrayList5 = new ArrayList();
/* 75 */            ArrayList arrayList6 = new ArrayList();
/* 78 */            String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 80 */            int iM9030i = 0;
/* 81 */            int iM9030i2 = 0;
/* 82 */            String strM9028g = HttpUrl.FRAGMENT_ENCODE_SET;
/* 84 */            ke2 ke2Var = null;
                    while (true) {
/* 87 */                int iM9029h = c2257uj7.m9029h();
/* 93 */                if (iM9029h == 0) {
/* 1500 */                  String str2 = str;
/* 1502 */                  int i5 = iM9030i;
/* 1504 */                  int i6 = iM9030i2;
/* 1506 */                  List listUnmodifiableList = Collections.unmodifiableList(arrayList);
/* 1510 */                  Collections.unmodifiableList(arrayList2);
/* 1513 */                  Collections.unmodifiableList(arrayList3);
/* 1516 */                  Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
/* 1520 */                  Collections.unmodifiableMap(map2);
/* 1523 */                  List<fg1> listUnmodifiableList2 = Collections.unmodifiableList(arrayList4);
/* 1527 */                  Collections.unmodifiableList(arrayList5);
/* 1530 */                  Collections.unmodifiableList(arrayList6);
/* 1535 */                  C1393c5 c1393c5 = new C1393c5();
/* 1540 */                  c1393c5.f10787f0 = EnumC1553m5.FATAL;
/* 1544 */                  c1393c5.f11523v = "native";
/* 1548 */                  C1616p c1616p = new C1616p();
/* 1553 */                  StringBuilder sb = new StringBuilder();
/* 1556 */                  Iterator it = listUnmodifiableList.iterator();
/* 1564 */                  if (it.hasNext()) {
                                while (true) {
/* 1572 */                          sb.append((CharSequence) it.next());
/* 1579 */                          if (it.hasNext()) {
/* 1583 */                              sb.append((CharSequence) " ");
                                    }
                                }
                            }
/* 1587 */                  String string = sb.toString();
/* 1595 */                  if (ke2Var != null) {
/* 1597 */                      Locale locale = Locale.ROOT;
/* 1614 */                      String strConcat = !strM9028g.isEmpty() ? strM9028g.concat(": ") : str2;
/* 1683 */                      c1616p.f11420a = strConcat + "Fatal signal " + ke2Var.f12717b + " (" + ke2Var.f12716a + "), " + ke2Var.f12719d + " (" + ke2Var.f12718c + "), pid = " + i5 + " (" + string + ")";
                            } else {
/* 1688 */                      Locale locale2 = Locale.ROOT;
/* 1713 */                      c1616p.f11420a = "Fatal exit pid = " + i5 + " (" + string + ")";
                            }
/* 1715 */                  c1393c5.f10783b0 = c1616p;
/* 1719 */                  ArrayList arrayList7 = new ArrayList();
/* 1726 */                  C1212b c1212b = null;
/* 1732 */                  for (fg1 fg1Var : listUnmodifiableList2) {
/* 1740 */                      boolean z = fg1Var.f8202d;
/* 1742 */                      String str3 = fg1Var.f8204f;
/* 1744 */                      String str4 = fg1Var.f8203e;
/* 1746 */                      long j = fg1Var.f8200b;
/* 1748 */                      if (z && !str4.isEmpty() && !str4.startsWith("/dev/")) {
/* 1766 */                          boolean zIsEmpty = str3.isEmpty();
/* 1778 */                          boolean z2 = fg1Var.f8201c == 0;
/* 1779 */                          if (zIsEmpty || !z2) {
/* 1825 */                              if (c1212b != null && str4.equals((String) c1212b.f10129c)) {
/* 1837 */                                  c1212b.f10128b = j;
                                        }
                                    } else if (c1212b == null || !str4.equals((String) c1212b.f10129c)) {
/* 1798 */                              if (c1212b != null && (debugImageM4821a2 = c1212b.m4821a()) != null) {
/* 1806 */                                  arrayList7.add(debugImageM4821a2);
                                        }
/* 1811 */                              c1212b = new C1212b();
/* 1814 */                              c1212b.f10129c = str4;
/* 1816 */                              c1212b.f10130d = str3;
/* 1820 */                              c1212b.f10127a = fg1Var.f8199a;
/* 1822 */                              c1212b.f10128b = j;
                                    } else {
/* 1795 */                              c1212b.f10128b = j;
                                    }
                                }
                            }
/* 1840 */                  if (c1212b != null && (debugImageM4821a = c1212b.m4821a()) != null) {
/* 1848 */                      arrayList7.add(debugImageM4821a);
                            }
/* 1853 */                  C1599f c1599f = new C1599f();
/* 1861 */                  c1599f.f11308b = new ArrayList(arrayList7);
/* 1863 */                  c1393c5.f11514Y = c1599f;
/* 1867 */                  C1625v c1625v = new C1625v();
/* 1870 */                  if (ke2Var != null) {
/* 1872 */                      String str5 = ke2Var.f12717b;
/* 1874 */                      c1625v.f11471a = str5;
/* 1884 */                      c1625v.f11472b = (String) this.f10135e.get(str5);
/* 1888 */                      C1615o c1615o = new C1615o();
/* 1897 */                      c1615o.f11411a = EnumC1211a.TOMBSTONE.getValue();
/* 1901 */                      c1615o.f11414d = Boolean.FALSE;
/* 1905 */                      c1615o.f11417i = Boolean.TRUE;
/* 1909 */                      HashMap map3 = new HashMap();
/* 1920 */                      map3.put("number", Integer.valueOf(ke2Var.f12716a));
/* 1927 */                      map3.put("name", ke2Var.f12717b);
/* 1938 */                      map3.put("code", Integer.valueOf(ke2Var.f12718c));
/* 1945 */                      map3.put("code_name", ke2Var.f12719d);
/* 1953 */                      c1615o.f11415e = new HashMap(map3);
/* 1955 */                      c1625v.f11476f = c1615o;
                            }
/* 1957 */                  int i7 = i6;
/* 1964 */                  c1625v.f11474d = Long.valueOf(i7);
/* 1969 */                  ArrayList arrayList8 = new ArrayList(1);
/* 1972 */                  arrayList8.add(c1625v);
/* 1980 */                  c1393c5.f10786e0 = new C1425d2(arrayList8);
/* 1982 */                  ArrayList arrayListM5107d = c1393c5.m5107d();
/* 1986 */                  Objects.requireNonNull(arrayListM5107d);
/* 1994 */                  C1625v c1625v2 = (C1625v) arrayListM5107d.get(0);
/* 1998 */                  ArrayList arrayList9 = new ArrayList();
/* 2013 */                  for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
/* 2025 */                      tp2 tp2Var = (tp2) entry.getValue();
/* 2029 */                      C1598e0 c1598e0 = new C1598e0();
/* 2047 */                      c1598e0.f11298a = Long.valueOf(((Integer) entry.getKey()).intValue());
/* 2051 */                      c1598e0.f11300c = tp2Var.f17204b;
/* 2055 */                      ArrayList arrayList10 = new ArrayList();
/* 2070 */                      for (C1890lh c1890lh : tp2Var.f17208f) {
/* 2078 */                          String str6 = c1890lh.f13280c;
/* 2080 */                          String str7 = c1890lh.f13279b;
/* 2088 */                          if (!str6.endsWith("libart.so") && (!str6.startsWith("<anonymous") || !str7.isEmpty())) {
/* 2108 */                              C1590a0 c1590a0 = new C1590a0();
/* 2111 */                              c1590a0.f11253W = str6;
/* 2113 */                              c1590a0.f11265e = str7;
/* 2115 */                              int i8 = i7;
/* 2131 */                              c1590a0.f11260b0 = String.format("0x%x", Long.valueOf(c1890lh.f13278a));
/* 2146 */                              Boolean boolM5404n = str7.isEmpty() ? Boolean.FALSE : C1666s6.m5404n(str7, this.f10132b, this.f10133c);
/* 2150 */                              String str8 = this.f10134d;
/* 2180 */                              c1590a0.f11252V = Boolean.valueOf((boolM5404n != null && boolM5404n.booleanValue()) || (str8 != null && str6.startsWith(str8)));
/* 2183 */                              arrayList10.add(0, c1590a0);
/* 2186 */                              i7 = i8;
                                    }
                                }
/* 2190 */                      int i9 = i7;
/* 2195 */                      C1594c0 c1594c0 = new C1594c0();
/* 2198 */                      c1594c0.f11285a = arrayList10;
/* 2202 */                      c1594c0.f11288d = EnumC1592b0.NONE;
/* 2206 */                      HashMap map4 = new HashMap();
/* 2219 */                      for (o22 o22Var : tp2Var.f17205c) {
/* 2243 */                          map4.put(o22Var.f14594a, String.format("0x%x", Long.valueOf(o22Var.f14595b)));
                                }
/* 2247 */                      c1594c0.f11286b = map4;
/* 2249 */                      c1598e0.f11306w = c1594c0;
/* 2255 */                      if (i9 == tp2Var.f17203a) {
/* 2259 */                          c1598e0.f11302e = Boolean.TRUE;
/* 2261 */                          c1625v2.f11475e = c1594c0;
                                }
/* 2263 */                      arrayList9.add(c1598e0);
/* 2266 */                      i7 = i9;
                            }
/* 2275 */                  c1393c5.f10785d0 = new C1425d2(arrayList9);
/* 2277 */                  return c1393c5;
                        }
/* 95 */                int i10 = iM9029h >>> 3;
/* 97 */                int i11 = iM9029h & 7;
/* 99 */                String str9 = str;
                        switch (i10) {
                            case 1:
/* 1456 */                      c2257uj = c2257uj7;
/* 1458 */                      i = iM9030i;
/* 1460 */                      iM9030i2 = iM9030i2;
/* 1463 */                      C2257uj.m9022b(i10, 0, i11);
/* 1470 */                      int iM9030i3 = (int) c2257uj.m9030i();
/* 1471 */                      int[] iArrM3496E = AbstractC0886en.m3496E(6);
/* 1475 */                      int length = iArrM3496E.length;
/* 1477 */                      for (int i12 = 0; i12 < length && AbstractC0886en.m3520y(iArrM3496E[i12]) != iM9030i3; i12++) {
                                }
/* 1327 */                      iM9030i2 = iM9030i2;
/* 1329 */                      iM9030i = i;
                                break;
                            case 2:
/* 1441 */                      c2257uj = c2257uj7;
/* 1445 */                      i2 = iM9030i2;
/* 1448 */                      C2257uj.m9022b(i10, 2, i11);
/* 1451 */                      c2257uj.m9028g();
/* 257 */                       iM9030i2 = i2;
                                break;
                            case 3:
/* 1426 */                      c2257uj = c2257uj7;
/* 1430 */                      i2 = iM9030i2;
/* 1433 */                      C2257uj.m9022b(i10, 2, i11);
/* 1436 */                      c2257uj.m9028g();
/* 257 */                       iM9030i2 = i2;
                                break;
                            case 4:
/* 1411 */                      c2257uj = c2257uj7;
/* 1415 */                      i2 = iM9030i2;
/* 1418 */                      C2257uj.m9022b(i10, 2, i11);
/* 1421 */                      c2257uj.m9028g();
/* 257 */                       iM9030i2 = i2;
                                break;
                            case 5:
/* 1396 */                      c2257uj = c2257uj7;
/* 1398 */                      i2 = iM9030i2;
/* 1401 */                      C2257uj.m9022b(i10, 0, i11);
/* 1408 */                      iM9030i = (int) c2257uj.m9030i();
/* 257 */                       iM9030i2 = i2;
                                break;
                            case 6:
/* 1381 */                      c2257uj = c2257uj7;
/* 1383 */                      i = iM9030i;
/* 1386 */                      C2257uj.m9022b(i10, 0, i11);
/* 1393 */                      iM9030i2 = (int) c2257uj.m9030i();
/* 1329 */                      iM9030i = i;
                                break;
                            case 7:
/* 1366 */                      c2257uj = c2257uj7;
/* 1370 */                      i2 = iM9030i2;
/* 1373 */                      C2257uj.m9022b(i10, 0, i11);
/* 1376 */                      c2257uj.m9030i();
/* 257 */                       iM9030i2 = i2;
                                break;
                            case 8:
/* 1351 */                      c2257uj = c2257uj7;
/* 1355 */                      i2 = iM9030i2;
/* 1358 */                      C2257uj.m9022b(i10, 2, i11);
/* 1361 */                      c2257uj.m9028g();
/* 257 */                       iM9030i2 = i2;
                                break;
                            case 9:
/* 1333 */                      c2257uj = c2257uj7;
/* 1335 */                      i = iM9030i;
/* 1337 */                      iM9030i2 = iM9030i2;
/* 1340 */                      C2257uj.m9022b(i10, 2, i11);
/* 1347 */                      arrayList.add(c2257uj.m9028g());
/* 1327 */                      iM9030i2 = iM9030i2;
/* 1329 */                      iM9030i = i;
                                break;
                            case 10:
/* 1155 */                      c2257uj = c2257uj7;
/* 1157 */                      i = iM9030i;
/* 1159 */                      iM9030i2 = iM9030i2;
/* 1162 */                      C2257uj.m9022b(i10, 2, i11);
/* 1165 */                      C2257uj c2257ujM9027f = c2257uj.m9027f();
/* 1169 */                      String strM9028g2 = str9;
/* 1171 */                      String strM9028g3 = strM9028g2;
/* 1172 */                      int iM9030i4 = 0;
/* 1173 */                      int iM9030i5 = 0;
                                while (true) {
/* 1174 */                          int iM9029h2 = c2257ujM9027f.m9029h();
/* 1178 */                          if (iM9029h2 == 0) {
/* 1324 */                              ke2Var = new ke2(strM9028g2, iM9030i4, iM9030i5, strM9028g3);
/* 1327 */                              iM9030i2 = iM9030i2;
/* 1329 */                              iM9030i = i;
                                    } else {
/* 1180 */                              int i13 = iM9029h2 >>> 3;
/* 1182 */                              int i14 = iM9029h2 & 7;
                                        switch (i13) {
                                            case 1:
/* 1304 */                                      c2257uj2 = c2257ujM9027f;
/* 1309 */                                      C2257uj.m9022b(i13, 0, i14);
/* 1316 */                                      iM9030i4 = (int) c2257uj2.m9030i();
                                                break;
                                            case 2:
/* 1289 */                                      c2257uj2 = c2257ujM9027f;
/* 1293 */                                      C2257uj.m9022b(i13, 2, i14);
/* 1296 */                                      strM9028g2 = c2257uj2.m9028g();
                                                break;
                                            case 3:
/* 1275 */                                      c2257uj2 = c2257ujM9027f;
/* 1280 */                                      C2257uj.m9022b(i13, 0, i14);
/* 1287 */                                      iM9030i5 = (int) c2257uj2.m9030i();
                                                break;
                                            case 4:
/* 1260 */                                      c2257uj2 = c2257ujM9027f;
/* 1264 */                                      C2257uj.m9022b(i13, 2, i14);
/* 1267 */                                      strM9028g3 = c2257uj2.m9028g();
                                                break;
                                            case 5:
/* 1250 */                                      c2257uj2 = c2257ujM9027f;
/* 1253 */                                      C2257uj.m9022b(i13, 0, i14);
/* 1256 */                                      c2257uj2.m9025d();
                                                break;
                                            case 6:
/* 1240 */                                      c2257uj2 = c2257ujM9027f;
/* 1243 */                                      C2257uj.m9022b(i13, 0, i14);
/* 1246 */                                      c2257uj2.m9030i();
                                                break;
                                            case 7:
/* 1230 */                                      c2257uj2 = c2257ujM9027f;
/* 1233 */                                      C2257uj.m9022b(i13, 0, i14);
/* 1236 */                                      c2257uj2.m9030i();
                                                break;
                                            case 8:
/* 1220 */                                      c2257uj2 = c2257ujM9027f;
/* 1223 */                                      C2257uj.m9022b(i13, 0, i14);
/* 1226 */                                      c2257uj2.m9025d();
                                                break;
                                            case 9:
/* 1210 */                                      c2257uj2 = c2257ujM9027f;
/* 1213 */                                      C2257uj.m9022b(i13, 0, i14);
/* 1216 */                                      c2257uj2.m9030i();
                                                break;
                                            case 10:
/* 1196 */                                      c2257uj2 = c2257ujM9027f;
/* 1199 */                                      C2257uj.m9022b(i13, 2, i14);
/* 1206 */                                      w11.m9427f(c2257uj2.m9027f());
                                                break;
                                            default:
/* 1187 */                                      c2257ujM9027f.m9031j(i14);
/* 1190 */                                      c2257uj2 = c2257ujM9027f;
                                                break;
                                        }
/* 1318 */                              c2257ujM9027f = c2257uj2;
                                    }
                                    break;
                                }
                                break;
                            case 11:
                            case 12:
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                            default:
/* 107 */                       c2257uj7.m9031j(i11);
/* 110 */                       c2257uj = c2257uj7;
/* 112 */                       i = iM9030i;
/* 114 */                       iM9030i2 = iM9030i2;
/* 1327 */                      iM9030i2 = iM9030i2;
/* 1329 */                      iM9030i = i;
                                break;
                            case 14:
/* 1139 */                      c2257uj = c2257uj7;
/* 1143 */                      i2 = iM9030i2;
/* 1146 */                      C2257uj.m9022b(i10, 2, i11);
/* 1149 */                      strM9028g = c2257uj.m9028g();
/* 257 */                       iM9030i2 = i2;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 838 */                       c2257uj = c2257uj7;
/* 840 */                       i = iM9030i;
/* 842 */                       iM9030i2 = iM9030i2;
/* 844 */                       int i15 = 2;
/* 845 */                       C2257uj.m9022b(i10, 2, i11);
/* 848 */                       C2257uj c2257ujM9027f2 = c2257uj.m9027f();
                                while (true) {
/* 852 */                           int iM9029h3 = c2257ujM9027f2.m9029h();
/* 856 */                           if (iM9029h3 == 0) {
/* 1134 */                              arrayList3.add(new dc0(25));
/* 1327 */                              iM9030i2 = iM9030i2;
/* 1329 */                              iM9030i = i;
                                    } else {
/* 858 */                               int i16 = iM9029h3 >>> 3;
/* 860 */                               int i17 = iM9029h3 & 7;
/* 863 */                               if (i16 != 1) {
/* 865 */                                   if (i16 != i15) {
/* 867 */                                       c2257ujM9027f2.m9031j(i17);
                                            } else {
/* 874 */                                       C2257uj.m9022b(i16, i15, i17);
/* 877 */                                       C2257uj c2257ujM9027f3 = c2257ujM9027f2.m9027f();
                                                while (true) {
/* 881 */                                           int iM9029h4 = c2257ujM9027f3.m9029h();
/* 885 */                                           if (iM9029h4 != 0) {
/* 887 */                                               int i18 = iM9029h4 >>> 3;
/* 889 */                                               int i19 = iM9029h4 & 7;
/* 892 */                                               if (i18 == 1) {
/* 1073 */                                                  c2257uj4 = c2257ujM9027f2;
/* 1075 */                                                  c2257uj5 = c2257ujM9027f3;
/* 1078 */                                                  C2257uj.m9022b(i18, 0, i19);
/* 1085 */                                                  int iM9030i6 = (int) c2257uj5.m9030i();
/* 1088 */                                                  int[] iArrM3496E2 = AbstractC0886en.m3496E(2);
/* 1092 */                                                  int length2 = iArrM3496E2.length;
/* 1094 */                                                  for (int i20 = 0; i20 < length2 && AbstractC0886en.m3520y(iArrM3496E2[i20]) != iM9030i6; i20++) {
                                                            }
                                                        } else if (i18 == i15) {
/* 1040 */                                                  c2257uj4 = c2257ujM9027f2;
/* 1042 */                                                  c2257uj5 = c2257ujM9027f3;
/* 1045 */                                                  C2257uj.m9022b(i18, 0, i19);
/* 1052 */                                                  int iM9030i7 = (int) c2257uj5.m9030i();
/* 1053 */                                                  int[] iArrM3496E3 = AbstractC0886en.m3496E(6);
/* 1057 */                                                  int length3 = iArrM3496E3.length;
/* 1059 */                                                  for (int i21 = 0; i21 < length3 && AbstractC0886en.m3520y(iArrM3496E3[i21]) != iM9030i7; i21++) {
                                                            }
                                                        } else if (i18 != 3) {
/* 899 */                                                   c2257ujM9027f3.m9031j(i19);
/* 902 */                                                   c2257uj4 = c2257ujM9027f2;
/* 904 */                                                   c2257uj5 = c2257ujM9027f3;
                                                        } else {
/* 908 */                                                   C2257uj.m9022b(i18, i15, i19);
/* 911 */                                                   C2257uj c2257ujM9027f4 = c2257ujM9027f3.m9027f();
/* 917 */                                                   ArrayList arrayList11 = new ArrayList();
/* 922 */                                                   ArrayList arrayList12 = new ArrayList();
                                                            while (true) {
/* 925 */                                                       int iM9029h5 = c2257ujM9027f4.m9029h();
/* 929 */                                                       if (iM9029h5 != 0) {
/* 931 */                                                           int i22 = iM9029h5 >>> 3;
/* 933 */                                                           C2257uj c2257uj8 = c2257ujM9027f2;
/* 935 */                                                           int i23 = iM9029h5 & 7;
                                                                    switch (i22) {
                                                                        case 1:
/* 1013 */                                                                  c2257ujM9027f3 = c2257ujM9027f3;
/* 1016 */                                                                  C2257uj.m9022b(i22, 0, i23);
/* 1019 */                                                                  c2257ujM9027f4.m9030i();
                                                                            break;
                                                                        case 2:
/* 1003 */                                                                  c2257ujM9027f3 = c2257ujM9027f3;
/* 1006 */                                                                  C2257uj.m9022b(i22, 0, i23);
/* 1009 */                                                                  c2257ujM9027f4.m9030i();
                                                                            break;
                                                                        case 3:
/* 993 */                                                                   c2257ujM9027f3 = c2257ujM9027f3;
/* 996 */                                                                   C2257uj.m9022b(i22, 0, i23);
/* 999 */                                                                   c2257ujM9027f4.m9030i();
                                                                            break;
                                                                        case 4:
/* 977 */                                                                   C2257uj.m9022b(i22, 2, i23);
/* 988 */                                                                   arrayList11.add(w11.m9425e(c2257ujM9027f4.m9027f()));
                                                                            break;
                                                                        case 5:
/* 964 */                                                                   c2257ujM9027f3 = c2257ujM9027f3;
/* 967 */                                                                   C2257uj.m9022b(i22, 0, i23);
/* 970 */                                                                   c2257ujM9027f4.m9030i();
                                                                            break;
                                                                        case 6:
/* 949 */                                                                   C2257uj.m9022b(i22, 2, i23);
/* 960 */                                                                   arrayList12.add(w11.m9425e(c2257ujM9027f4.m9027f()));
                                                                            break;
                                                                        default:
/* 940 */                                                                   c2257ujM9027f4.m9031j(i23);
                                                                            break;
                                                                    }
/* 1022 */                                                          c2257ujM9027f3 = c2257ujM9027f3;
/* 1024 */                                                          c2257ujM9027f2 = c2257uj8;
                                                                } else {
/* 1028 */                                                          c2257uj4 = c2257ujM9027f2;
/* 1030 */                                                          c2257uj5 = c2257ujM9027f3;
/* 1033 */                                                          Collections.unmodifiableList(arrayList11);
/* 1036 */                                                          Collections.unmodifiableList(arrayList12);
                                                                }
                                                            }
                                                        }
/* 1108 */                                              c2257ujM9027f3 = c2257uj5;
/* 1110 */                                              c2257ujM9027f2 = c2257uj4;
/* 1112 */                                              i15 = 2;
                                                    }
                                                }
                                            }
/* 870 */                                   c2257uj3 = c2257ujM9027f2;
                                        } else {
/* 1115 */                                  c2257uj3 = c2257ujM9027f2;
/* 1117 */                                  C2257uj.m9022b(i16, i15, i17);
/* 1120 */                                  c2257uj3.m9028g();
                                        }
/* 1123 */                              c2257ujM9027f2 = c2257uj3;
                                    }
                                    break;
                                }
                                break;
                            case 16:
/* 819 */                       c2257uj = c2257uj7;
/* 821 */                       i = iM9030i;
/* 823 */                       iM9030i2 = iM9030i2;
/* 826 */                       C2257uj.m9022b(i10, 2, i11);
/* 833 */                       w11.m9429g(c2257uj.m9027f(), map);
/* 1327 */                      iM9030i2 = iM9030i2;
/* 1329 */                      iM9030i = i;
                                break;
                            case 17:
/* 676 */                       c2257uj = c2257uj7;
/* 679 */                       i = iM9030i;
/* 681 */                       iM9030i2 = iM9030i2;
/* 683 */                       C2257uj.m9022b(i10, 2, i11);
/* 686 */                       C2257uj c2257ujM9027f5 = c2257uj.m9027f();
/* 690 */                       String strM9028g4 = str9;
/* 692 */                       String strM9028g5 = strM9028g4;
/* 694 */                       long jM9030i = 0;
/* 696 */                       long jM9030i2 = 0;
/* 698 */                       long jM9030i3 = 0;
/* 700 */                       boolean zM9025d = false;
                                while (true) {
/* 702 */                           int iM9029h6 = c2257ujM9027f5.m9029h();
/* 706 */                           if (iM9029h6 == 0) {
/* 814 */                               arrayList4.add(new fg1(jM9030i, jM9030i2, jM9030i3, zM9025d, strM9028g4, strM9028g5));
/* 1327 */                              iM9030i2 = iM9030i2;
/* 1329 */                              iM9030i = i;
                                        break;
                                    } else {
/* 708 */                               int i24 = iM9029h6 >>> 3;
/* 710 */                               int i25 = iM9029h6 & 7;
                                        switch (i24) {
                                            case 1:
/* 797 */                                       C2257uj.m9022b(i24, 0, i25);
/* 800 */                                       jM9030i = c2257ujM9027f5.m9030i();
                                                break;
                                            case 2:
/* 786 */                                       C2257uj.m9022b(i24, 0, i25);
/* 789 */                                       jM9030i2 = c2257ujM9027f5.m9030i();
                                                break;
                                            case 3:
/* 775 */                                       C2257uj.m9022b(i24, 0, i25);
/* 778 */                                       jM9030i3 = c2257ujM9027f5.m9030i();
                                                break;
                                            case 4:
/* 764 */                                       C2257uj.m9022b(i24, 0, i25);
/* 767 */                                       zM9025d = c2257ujM9027f5.m9025d();
                                                break;
                                            case 5:
/* 756 */                                       C2257uj.m9022b(i24, 0, i25);
/* 759 */                                       c2257ujM9027f5.m9025d();
                                                break;
                                            case 6:
/* 748 */                                       C2257uj.m9022b(i24, 0, i25);
/* 751 */                                       c2257ujM9027f5.m9025d();
                                                break;
                                            case 7:
/* 739 */                                       C2257uj.m9022b(i24, 2, i25);
/* 742 */                                       strM9028g4 = c2257ujM9027f5.m9028g();
                                                break;
                                            case 8:
/* 729 */                                       C2257uj.m9022b(i24, 2, i25);
/* 732 */                                       strM9028g5 = c2257ujM9027f5.m9028g();
                                                break;
                                            case 9:
/* 720 */                                       C2257uj.m9022b(i24, 0, i25);
/* 723 */                                       c2257ujM9027f5.m9030i();
                                                break;
                                            default:
/* 715 */                                       c2257ujM9027f5.m9031j(i25);
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 18:
/* 500 */                       c2257uj = c2257uj7;
/* 502 */                       int i26 = iM9030i;
/* 503 */                       iM9030i2 = iM9030i2;
/* 506 */                       C2257uj.m9022b(i10, 2, i11);
/* 509 */                       C2257uj c2257ujM9027f6 = c2257uj.m9027f();
/* 515 */                       ArrayList arrayList13 = new ArrayList();
                                while (true) {
/* 518 */                           int iM9029h7 = c2257ujM9027f6.m9029h();
/* 522 */                           if (iM9029h7 == 0) {
/* 658 */                               i = i26;
/* 662 */                               ts0 ts0Var = new ts0();
/* 669 */                               ts0Var.f17248a = Collections.unmodifiableList(arrayList13);
/* 671 */                               arrayList5.add(ts0Var);
/* 1327 */                              iM9030i2 = iM9030i2;
/* 1329 */                              iM9030i = i;
                                    } else {
/* 524 */                               int i27 = iM9029h7 >>> 3;
/* 526 */                               int i28 = iM9029h7 & 7;
/* 529 */                               if (i27 == 1) {
/* 645 */                                   i3 = i26;
/* 648 */                                   C2257uj.m9022b(i27, 2, i28);
/* 651 */                                   c2257ujM9027f6.m9028g();
                                        } else if (i27 != 2) {
/* 534 */                                   c2257ujM9027f6.m9031j(i28);
/* 537 */                                   i3 = i26;
                                        } else {
/* 542 */                                   C2257uj.m9022b(i27, 2, i28);
/* 545 */                                   C2257uj c2257ujM9027f7 = c2257ujM9027f6.m9027f();
                                            while (true) {
/* 549 */                                       int iM9029h8 = c2257ujM9027f7.m9029h();
/* 553 */                                       if (iM9029h8 != 0) {
/* 555 */                                           int i29 = iM9029h8 >>> 3;
/* 557 */                                           int i30 = iM9029h8 & 7;
                                                    switch (i29) {
                                                        case 1:
/* 619 */                                                   i26 = i26;
/* 622 */                                                   C2257uj.m9022b(i29, 2, i30);
/* 625 */                                                   c2257ujM9027f7.m9028g();
                                                            break;
                                                        case 2:
/* 612 */                                                   C2257uj.m9022b(i29, 0, i30);
/* 615 */                                                   c2257ujM9027f7.m9030i();
                                                            break;
                                                        case 3:
/* 602 */                                                   C2257uj.m9022b(i29, 0, i30);
/* 605 */                                                   c2257ujM9027f7.m9030i();
                                                            break;
                                                        case 4:
/* 592 */                                                   C2257uj.m9022b(i29, 0, i30);
/* 595 */                                                   c2257ujM9027f7.m9030i();
                                                            break;
                                                        case 5:
/* 582 */                                                   C2257uj.m9022b(i29, 2, i30);
/* 585 */                                                   c2257ujM9027f7.m9028g();
                                                            break;
                                                        case 6:
/* 569 */                                                   i26 = i26;
/* 572 */                                                   C2257uj.m9022b(i29, 2, i30);
/* 575 */                                                   c2257ujM9027f7.m9028g();
                                                            break;
                                                        default:
/* 562 */                                                   c2257ujM9027f7.m9031j(i30);
                                                            break;
                                                    }
/* 628 */                                           i26 = i26;
                                                } else {
/* 631 */                                           i3 = i26;
/* 641 */                                           arrayList13.add(new ec0(18));
                                                }
                                            }
                                        }
/* 654 */                               i26 = i3;
                                    }
                                    break;
                                }
                                break;
                            case 19:
/* 418 */                       c2257uj = c2257uj7;
/* 423 */                       int i31 = 2;
/* 424 */                       C2257uj.m9022b(i10, 2, i11);
/* 427 */                       C2257uj c2257ujM9027f8 = c2257uj.m9027f();
                                while (true) {
/* 431 */                           int iM9029h9 = c2257ujM9027f8.m9029h();
/* 435 */                           if (iM9029h9 == 0) {
/* 496 */                               arrayList6.add(new zb0(8));
/* 400 */                               i = iM9030i;
/* 1327 */                              iM9030i2 = iM9030i2;
/* 1329 */                              iM9030i = i;
                                    } else {
/* 437 */                               int i32 = iM9029h9 >>> 3;
/* 439 */                               int i33 = iM9029h9 & 7;
/* 442 */                               if (i32 == 1) {
/* 481 */                                   C2257uj.m9022b(i32, 0, i33);
/* 484 */                                   c2257ujM9027f8.m9030i();
                                        } else if (i32 == i31) {
/* 473 */                                   C2257uj.m9022b(i32, i31, i33);
/* 476 */                                   c2257ujM9027f8.m9028g();
                                        } else if (i32 == 3) {
/* 465 */                                   C2257uj.m9022b(i32, i31, i33);
/* 468 */                                   c2257ujM9027f8.m9028g();
                                        } else if (i32 != 4) {
/* 452 */                                   c2257ujM9027f8.m9031j(i33);
                                        } else {
/* 457 */                                   C2257uj.m9022b(i32, 0, i33);
/* 460 */                                   c2257ujM9027f8.m9030i();
                                        }
/* 487 */                               i31 = 2;
                                    }
                                    break;
                                }
                                break;
                            case 20:
/* 404 */                       c2257uj = c2257uj7;
/* 407 */                       i2 = iM9030i2;
/* 410 */                       C2257uj.m9022b(i10, 0, i11);
/* 413 */                       c2257uj.m9030i();
/* 257 */                       iM9030i2 = i2;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 343 */                       c2257uj = c2257uj7;
/* 348 */                       int i34 = 2;
/* 349 */                       C2257uj.m9022b(i10, 2, i11);
/* 352 */                       C2257uj c2257ujM9027f9 = c2257uj.m9027f();
                                while (true) {
/* 356 */                           int iM9029h10 = c2257ujM9027f9.m9029h();
/* 360 */                           if (iM9029h10 == 0) {
/* 397 */                               arrayList2.add(new xt0(26));
/* 400 */                               i = iM9030i;
/* 1327 */                              iM9030i2 = iM9030i2;
/* 1329 */                              iM9030i = i;
                                    } else {
/* 362 */                               int i35 = iM9029h10 >>> 3;
/* 364 */                               int i36 = iM9029h10 & 7;
/* 367 */                               if (i35 == 1) {
/* 382 */                                   C2257uj.m9022b(i35, i34, i36);
/* 385 */                                   c2257ujM9027f9.m9026e();
                                        } else if (i35 != i34) {
/* 371 */                                   c2257ujM9027f9.m9031j(i36);
                                        } else {
/* 375 */                                   C2257uj.m9022b(i35, i34, i36);
/* 378 */                                   c2257ujM9027f9.m9026e();
                                        }
/* 388 */                               i34 = 2;
                                    }
                                    break;
                                }
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 330 */                       c2257uj = c2257uj7;
/* 333 */                       i2 = iM9030i2;
/* 336 */                       C2257uj.m9022b(i10, 0, i11);
/* 339 */                       c2257uj.m9030i();
/* 257 */                       iM9030i2 = i2;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 317 */                       c2257uj = c2257uj7;
/* 320 */                       i2 = iM9030i2;
/* 323 */                       C2257uj.m9022b(i10, 0, i11);
/* 326 */                       c2257uj.m9025d();
/* 257 */                       iM9030i2 = i2;
                                break;
                            case 24:
/* 281 */                       c2257uj = c2257uj7;
/* 283 */                       i2 = iM9030i2;
/* 286 */                       C2257uj.m9022b(i10, 0, i11);
/* 289 */                       int i37 = iM9030i;
/* 294 */                       int iM9030i8 = (int) c2257uj.m9030i();
/* 295 */                       int[] iArrM3496E4 = AbstractC0886en.m3496E(6);
/* 299 */                       int length4 = iArrM3496E4.length;
/* 301 */                       for (int i38 = 0; i38 < length4 && AbstractC0886en.m3520y(iArrM3496E4[i38]) != iM9030i8; i38++) {
                                }
/* 315 */                       iM9030i = i37;
/* 257 */                       iM9030i2 = i2;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 261 */                       c2257uj = c2257uj7;
/* 264 */                       iM9030i2 = iM9030i2;
/* 267 */                       C2257uj.m9022b(i10, 2, i11);
/* 274 */                       w11.m9429g(c2257uj.m9027f(), map2);
/* 277 */                       i = iM9030i;
/* 1327 */                      iM9030i2 = iM9030i2;
/* 1329 */                      iM9030i = i;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 118 */                       C2257uj.m9022b(i10, 2, i11);
/* 121 */                       C2257uj c2257ujM9027f10 = c2257uj7.m9027f();
/* 127 */                       ArrayList arrayList14 = new ArrayList();
                                while (true) {
/* 130 */                           int iM9029h11 = c2257ujM9027f10.m9029h();
/* 134 */                           if (iM9029h11 == 0) {
/* 249 */                               c2257uj = c2257uj7;
/* 251 */                               i2 = iM9030i2;
/* 254 */                               Collections.unmodifiableList(arrayList14);
/* 257 */                               iM9030i2 = i2;
                                    } else {
/* 136 */                               int i39 = iM9029h11 >>> 3;
/* 138 */                               C2257uj c2257uj9 = c2257uj7;
/* 140 */                               int i40 = iM9029h11 & 7;
/* 142 */                               int i41 = iM9030i2;
/* 145 */                               if (i39 == 1) {
/* 232 */                                   c2257uj6 = c2257ujM9027f10;
/* 235 */                                   C2257uj.m9022b(i39, 0, i40);
/* 238 */                                   c2257uj6.m9030i();
                                        } else if (i39 != 2) {
/* 150 */                                   c2257ujM9027f10.m9031j(i40);
/* 153 */                                   c2257uj6 = c2257ujM9027f10;
                                        } else {
/* 156 */                                   C2257uj.m9022b(i39, 2, i40);
/* 159 */                                   C2257uj c2257ujM9027f11 = c2257ujM9027f10.m9027f();
                                            while (true) {
/* 163 */                                       int iM9029h12 = c2257ujM9027f11.m9029h();
/* 167 */                                       if (iM9029h12 != 0) {
/* 169 */                                           int i42 = iM9029h12 >>> 3;
/* 171 */                                           int i43 = iM9029h12 & 7;
/* 173 */                                           C2257uj c2257uj10 = c2257ujM9027f10;
/* 176 */                                           if (i42 == 1) {
/* 205 */                                               C2257uj.m9022b(i42, 2, i43);
/* 212 */                                               w11.m9425e(c2257ujM9027f11.m9027f());
                                                    } else if (i42 == 2) {
/* 197 */                                               C2257uj.m9022b(i42, 0, i43);
/* 200 */                                               c2257ujM9027f11.m9030i();
                                                    } else if (i42 != 3) {
/* 184 */                                               c2257ujM9027f11.m9031j(i43);
                                                    } else {
/* 189 */                                               C2257uj.m9022b(i42, 0, i43);
/* 192 */                                               c2257ujM9027f11.m9030i();
                                                    }
/* 215 */                                           c2257ujM9027f10 = c2257uj10;
                                                } else {
/* 219 */                                           c2257uj6 = c2257ujM9027f10;
/* 227 */                                           arrayList14.add(new p62(3));
                                                }
                                            }
                                        }
/* 241 */                               c2257ujM9027f10 = c2257uj6;
/* 243 */                               c2257uj7 = c2257uj9;
/* 245 */                               iM9030i2 = i41;
                                    }
                                    break;
                                }
                                break;
                        }
/* 1492 */              str = str9;
/* 1494 */              c2257uj7 = c2257uj;
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
/* 1 */             InputStream inputStream = this.f10131a;
/* 3 */             if (inputStream != null) {
/* 5 */                 inputStream.close();
                    }
                }
            }
