            package p000;

            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.text.StringsKt__StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yl2 {
                /* JADX WARN: Code duplicated, block: B:101:0x0227  */
                /* JADX WARN: Code duplicated, block: B:102:0x022c  */
                /* JADX WARN: Code duplicated, block: B:105:0x0236  */
                /* JADX WARN: Code duplicated, block: B:108:0x024f  */
                /* JADX WARN: Code duplicated, block: B:110:0x0257  */
                /* JADX WARN: Code duplicated, block: B:111:0x0264  */
                /* JADX WARN: Code duplicated, block: B:113:0x026c  */
                /* JADX WARN: Code duplicated, block: B:115:0x0270  */
                /* JADX WARN: Code duplicated, block: B:116:0x0275  */
                /* JADX WARN: Code duplicated, block: B:118:0x0281  */
                /* JADX WARN: Code duplicated, block: B:120:0x0289  */
                /* JADX WARN: Code duplicated, block: B:121:0x0296  */
                /* JADX WARN: Code duplicated, block: B:123:0x029e  */
                /* JADX WARN: Code duplicated, block: B:125:0x02a2  */
                /* JADX WARN: Code duplicated, block: B:126:0x02a7  */
                /* JADX WARN: Code duplicated, block: B:128:0x02b7  */
                /* JADX WARN: Code duplicated, block: B:130:0x02bf  */
                /* JADX WARN: Code duplicated, block: B:132:0x02c3  */
                /* JADX WARN: Code duplicated, block: B:133:0x02c8  */
                /* JADX WARN: Code duplicated, block: B:135:0x02d8  */
                /* JADX WARN: Code duplicated, block: B:137:0x02e0  */
                /* JADX WARN: Code duplicated, block: B:138:0x02ed  */
                /* JADX WARN: Code duplicated, block: B:140:0x02f5  */
                /* JADX WARN: Code duplicated, block: B:142:0x02f9  */
                /* JADX WARN: Code duplicated, block: B:143:0x02fe  */
                /* JADX WARN: Code duplicated, block: B:145:0x030b  */
                /* JADX WARN: Code duplicated, block: B:147:0x0313  */
                /* JADX WARN: Code duplicated, block: B:149:0x0337  */
                /* JADX WARN: Code duplicated, block: B:151:0x0384  */
                /* JADX WARN: Code duplicated, block: B:153:0x03b1  */
                /* JADX WARN: Code duplicated, block: B:155:0x03be A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:156:0x03c0 A[LOOP:4: B:156:0x03c0->B:158:0x03c5, LOOP_START, PHI: r5
  0x03c0: PHI (r5v17 int) = (r5v15 int), (r5v18 int) binds: [B:155:0x03be, B:158:0x03c5] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:158:0x03c5 A[LOOP:4: B:156:0x03c0->B:158:0x03c5, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:162:0x03d9  */
                /* JADX WARN: Code duplicated, block: B:166:0x0407  */
                /* JADX WARN: Code duplicated, block: B:168:0x041c  */
                /* JADX WARN: Code duplicated, block: B:170:0x0420  */
                /* JADX WARN: Code duplicated, block: B:171:0x0425  */
                /* JADX WARN: Code duplicated, block: B:174:0x043b  */
                /* JADX WARN: Code duplicated, block: B:176:0x0450  */
                /* JADX WARN: Code duplicated, block: B:177:0x045d  */
                /* JADX WARN: Code duplicated, block: B:179:0x0472  */
                /* JADX WARN: Code duplicated, block: B:181:0x0476  */
                /* JADX WARN: Code duplicated, block: B:182:0x047b  */
                /* JADX WARN: Code duplicated, block: B:184:0x048e  */
                /* JADX WARN: Code duplicated, block: B:186:0x04a3  */
                /* JADX WARN: Code duplicated, block: B:188:0x04a7  */
                /* JADX WARN: Code duplicated, block: B:189:0x04ac  */
                /* JADX WARN: Code duplicated, block: B:191:0x04bc  */
                /* JADX WARN: Code duplicated, block: B:193:0x04d1  */
                /* JADX WARN: Code duplicated, block: B:195:0x04d5  */
                /* JADX WARN: Code duplicated, block: B:196:0x04da  */
                /* JADX WARN: Code duplicated, block: B:198:0x04e7  */
                /* JADX WARN: Code duplicated, block: B:200:0x04fc  */
                /* JADX WARN: Code duplicated, block: B:202:0x0500  */
                /* JADX WARN: Code duplicated, block: B:203:0x0505  */
                /* JADX WARN: Code duplicated, block: B:205:0x0515  */
                /* JADX WARN: Code duplicated, block: B:207:0x052a  */
                /* JADX WARN: Code duplicated, block: B:209:0x052e  */
                /* JADX WARN: Code duplicated, block: B:210:0x0533  */
                /* JADX WARN: Code duplicated, block: B:212:0x0546  */
                /* JADX WARN: Code duplicated, block: B:214:0x055b  */
                /* JADX WARN: Code duplicated, block: B:216:0x055f  */
                /* JADX WARN: Code duplicated, block: B:217:0x0564  */
                /* JADX WARN: Code duplicated, block: B:220:0x0574  */
                /* JADX WARN: Code duplicated, block: B:223:0x057d  */
                /* JADX WARN: Code duplicated, block: B:225:0x0592  */
                /* JADX WARN: Code duplicated, block: B:227:0x0596  */
                /* JADX WARN: Code duplicated, block: B:228:0x059b  */
                /* JADX WARN: Code duplicated, block: B:230:0x05ad  */
                /* JADX WARN: Code duplicated, block: B:232:0x05c2  */
                /* JADX WARN: Code duplicated, block: B:234:0x05cf  */
                /* JADX WARN: Code duplicated, block: B:235:0x05d7  */
                /* JADX WARN: Code duplicated, block: B:237:0x05df  */
                /* JADX WARN: Code duplicated, block: B:238:0x05e6  */
                /* JADX WARN: Code duplicated, block: B:240:0x05ea  */
                /* JADX WARN: Code duplicated, block: B:265:0x0637 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:266:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:267:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:268:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:269:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:270:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:271:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:272:0x01d3 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:273:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:274:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:275:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:276:0x0249 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:277:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:278:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:279:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:280:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:281:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:282:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:283:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:284:0x012d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:285:0x03ca A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:286:0x0438 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:287:0x0438 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:288:0x0438 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:289:0x0438 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:290:0x0438 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:291:0x0438 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:292:0x0438 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:293:0x0438 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:294:0x0577 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:295:0x0438 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:296:0x0438 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:297:0x05f3 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:298:0x0629 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:306:0x03c8 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:30:0x00cc  */
                /* JADX WARN: Code duplicated, block: B:33:0x00d6  */
                /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
                /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
                /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
                /* JADX WARN: Code duplicated, block: B:40:0x00fd  */
                /* JADX WARN: Code duplicated, block: B:43:0x010a  */
                /* JADX WARN: Code duplicated, block: B:45:0x0110 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:46:0x0112  */
                /* JADX WARN: Code duplicated, block: B:47:0x0117  */
                /* JADX WARN: Code duplicated, block: B:51:0x0130  */
                /* JADX WARN: Code duplicated, block: B:53:0x0136  */
                /* JADX WARN: Code duplicated, block: B:55:0x0150  */
                /* JADX WARN: Code duplicated, block: B:57:0x0156  */
                /* JADX WARN: Code duplicated, block: B:58:0x0162  */
                /* JADX WARN: Code duplicated, block: B:60:0x016a  */
                /* JADX WARN: Code duplicated, block: B:62:0x016e  */
                /* JADX WARN: Code duplicated, block: B:63:0x0173  */
                /* JADX WARN: Code duplicated, block: B:65:0x0182  */
                /* JADX WARN: Code duplicated, block: B:67:0x018a  */
                /* JADX WARN: Code duplicated, block: B:69:0x018e  */
                /* JADX WARN: Code duplicated, block: B:70:0x0193  */
                /* JADX WARN: Code duplicated, block: B:72:0x01a5  */
                /* JADX WARN: Code duplicated, block: B:74:0x01ad  */
                /* JADX WARN: Code duplicated, block: B:76:0x01b1  */
                /* JADX WARN: Code duplicated, block: B:77:0x01b6  */
                /* JADX WARN: Code duplicated, block: B:80:0x01c0  */
                /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
                /* JADX WARN: Code duplicated, block: B:85:0x01e1  */
                /* JADX WARN: Code duplicated, block: B:87:0x01e5  */
                /* JADX WARN: Code duplicated, block: B:88:0x01ea  */
                /* JADX WARN: Code duplicated, block: B:90:0x01fa  */
                /* JADX WARN: Code duplicated, block: B:92:0x0202  */
                /* JADX WARN: Code duplicated, block: B:94:0x0206  */
                /* JADX WARN: Code duplicated, block: B:95:0x020b  */
                /* JADX WARN: Code duplicated, block: B:97:0x021b  */
                /* JADX WARN: Code duplicated, block: B:99:0x0223  */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX INFO: renamed from: a */
                public static ql2 m10159a(String str, ql2 ql2Var) throws Throwable {
                    List list;
                    Iterator it;
                    String str2;
                    EnumC2146rj enumC2146rjM7866a;
                    Integer numValueOf;
                    int iIntValue;
                    String strSubstring;
                    int i;
                    String str3;
                    Iterator it2;
                    int i2;
                    int iIntValue2;
                    int iIntValue3;
                    uh2 uh2Var;
                    int iM9146a;
                    int iIntValue4;
                    int iIntValue5;
                    int iIntValue6;
                    int iIntValue7;
                    int iIntValue8;
                    int i3;
                    int iIntValue9;
                    xz1 xz1Var;
                    int iM9146a2;
                    int i4;
                    int i5;
                    wz1 wz1Var;
                    int iM9146a3;
                    int i6;
                    boolean zEquals;
                    int i7;
                    int iM9146a4;
                    int i8;
                    int iM9146a5;
                    int iIntValue10;
                    int iIntValue11;
                    int iIntValue12;
                    int iIntValue13;
                    int iIntValue14;
                    int iIntValue15;
                    int iIntValue16;
                    int iIntValue17;
                    int iIntValue18;
                    int iIntValue19;
                    b40 b40VarM7943a;
                    int i9;
/* 3 */             str.getClass();
/* 6 */             ql2Var.getClass();
/* 9 */             int i10 = ql2Var.f15628g;
/* 11 */            int i11 = 2;
/* 12 */            if (i10 != 2) {
/* 1634 */              throw new C0900f0(fm0.m3781g(i10, "Unable TCF String with version "), 2);
                    }
/* 20 */            int i12 = 0;
/* 21 */            int i13 = 6;
/* 7 */             List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
/* 28 */            int size = listSplit$default.size();
/* 32 */            int i14 = 0;
/* 33 */            ql2 ql2Var2 = null;
                    while (true) {
/* 34 */                if (i14 >= size) {
/* 1610 */                  if (ql2Var2 != null) {
/* 1612 */                      return ql2Var2;
                            }
/* 1621 */                  throw new C0900f0("Unable to decode given TCModel", 2);
                        }
/* 40 */                String str4 = (String) listSplit$default.get(i14);
/* 42 */                C2551zh c2551zh = AbstractC0020ai.Companion;
/* 48 */                String strValueOf = String.valueOf(str4.charAt(i12));
/* 52 */                c2551zh.getClass();
/* 55 */                String strM10353a = C2551zh.m10353a(strValueOf);
/* 59 */                C2109qj c2109qj = EnumC2146rj.Companion;
/* 62 */                String strSubstring2 = strM10353a.substring(i12, 3);
/* 68 */                x82.Companion.getClass();
/* 71 */                List list2 = x82.f18990a;
/* 75 */                vy0.Companion.getClass();
/* 89 */                String str5 = ((t82) list2.get((int) uy0.m9146a(3, strSubstring2))).f16996a;
/* 93 */                v82.Companion.getClass();
/* 96 */                String strM10353a2 = C2551zh.m10353a(str4);
/* 100 */               t82 t82Var = t82.CORE;
/* 108 */               if (str5.equals("core")) {
/* 119 */                   ql2Var.f15628g = (int) uy0.m9146a(i13, strM10353a2.substring(i12, i13));
                        }
/* 125 */               int iIntValue20 = str5.equals("core") ? i12 : 3;
/* 133 */               fs0 fs0Var = (fs0) v82.f17917a.f7001a;
/* 135 */               fs0Var.getClass();
/* 140 */               Map map = (Map) fs0Var.f8339b;
/* 144 */               t82.Companion.getClass();
/* 155 */               String str6 = "vendorsAllowed";
                        switch (str5.hashCode()) {
                            case -614130325:
/* 193 */                       if (!str5.equals("publisherTC")) {
/* 1609 */                          throw new Throwable("Invalid Value for Segment Type: ".concat(str5));
                                }
/* 195 */                       t82Var = t82.PUBLISHER_TC;
/* 201 */                       list = (List) map.get(t82Var);
/* 203 */                       if (list != null) {
/* 1594 */                          f42.m3656l("Unable to find fieldSequence");
/* 153 */                           return null;
                                }
/* 205 */                       it = list.iterator();
                                while (true) {
/* 213 */                           if (it.hasNext()) {
/* 1584 */                              i14++;
/* 1586 */                              ql2Var2 = ql2Var;
/* 1587 */                              i11 = 2;
/* 1588 */                              i12 = 0;
/* 1589 */                              i13 = 6;
                                    } else {
/* 219 */                               str2 = (String) it.next();
/* 223 */                               EnumC2146rj.Companion.getClass();
/* 226 */                               enumC2146rjM7866a = C2109qj.m7866a(str2);
/* 230 */                               if (enumC2146rjM7866a != null) {
/* 234 */                                   numValueOf = Integer.valueOf(enumC2146rjM7866a.f16116a);
                                        } else {
/* 239 */                                   numValueOf = null;
                                        }
/* 241 */                               if (numValueOf == null) {
/* 245 */                                   v82.Companion.getClass();
/* 252 */                                   if (u82.m8973a(str2)) {
/* 260 */                                       numValueOf = Integer.valueOf(ql2Var.m7944b().f17529a);
                                            }
                                        }
/* 264 */                               if (numValueOf == null && numValueOf.intValue() == 0) {
/* 1549 */                                  listSplit$default = listSplit$default;
/* 1551 */                                  size = size;
/* 1553 */                                  str6 = str6;
/* 1554 */                                  i = i14;
/* 1556 */                                  str3 = strM10353a2;
/* 1558 */                                  it2 = it;
                                        } else {
/* 273 */                                   if (numValueOf == null) {
/* 275 */                                       iIntValue = strM10353a2.length();
                                            } else {
/* 284 */                                       iIntValue = numValueOf.intValue() + iIntValue20;
                                            }
/* 285 */                                   strSubstring = strM10353a2.substring(iIntValue20, iIntValue);
                                            switch (str2.hashCode()) {
                                                case -2115730175:
/* 1459 */                                          i = i14;
/* 1461 */                                          str3 = strM10353a2;
/* 1463 */                                          it2 = it;
/* 1465 */                                          i2 = iIntValue20;
/* 1473 */                                          if (str2.equals("vendorConsents")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1477 */                                          e23.Companion.getClass();
/* 1484 */                                          ql2Var.f15646y = d23.m2911a(strSubstring);
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -2076485454:
/* 1411 */                                          i = i14;
/* 1413 */                                          str3 = strM10353a2;
/* 1415 */                                          it2 = it;
/* 1417 */                                          i2 = iIntValue20;
/* 1425 */                                          if (str2.equals("cmpVersion")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1427 */                                          uy0 uy0Var = vy0.Companion;
/* 1429 */                                          if (numValueOf != null) {
/* 1431 */                                              iIntValue2 = numValueOf.intValue();
                                                    } else {
/* 1436 */                                              iIntValue2 = 0;
                                                    }
/* 1437 */                                          uy0Var.getClass();
/* 1450 */                                          ql2Var.m7946d(new uh2((int) uy0.m9146a(iIntValue2, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -2014745908:
/* 1356 */                                          i = i14;
/* 1358 */                                          str3 = strM10353a2;
/* 1360 */                                          it2 = it;
/* 1362 */                                          i2 = iIntValue20;
/* 1370 */                                          if (str2.equals("numCustomPurposes")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1372 */                                          uy0 uy0Var2 = vy0.Companion;
/* 1374 */                                          if (numValueOf != null) {
/* 1376 */                                              iIntValue3 = numValueOf.intValue();
                                                    } else {
/* 1381 */                                              iIntValue3 = 0;
                                                    }
/* 1382 */                                          uy0Var2.getClass();
/* 1391 */                                          iM9146a = (int) uy0.m9146a(iIntValue3, strSubstring);
/* 1392 */                                          uh2Var = new uh2(iM9146a);
/* 1395 */                                          if (iM9146a >= 0) {
/* 1405 */                                              throw new C0900f0("numCustomPurposes", uh2Var);
                                                    }
/* 1397 */                                          ql2Var.f15635n = iM9146a;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -1710804154:
/* 1307 */                                          i = i14;
/* 1309 */                                          str3 = strM10353a2;
/* 1311 */                                          it2 = it;
/* 1313 */                                          i2 = iIntValue20;
/* 1321 */                                          if (str2.equals("policyVersion")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1323 */                                          uy0 uy0Var3 = vy0.Companion;
/* 1325 */                                          if (numValueOf != null) {
/* 1327 */                                              iIntValue4 = numValueOf.intValue();
                                                    } else {
/* 1332 */                                              iIntValue4 = 0;
                                                    }
/* 1333 */                                          uy0Var3.getClass();
/* 1346 */                                          ql2Var.m7948f(new uh2((int) uy0.m9146a(iIntValue4, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -879778089:
/* 1261 */                                          i = i14;
/* 1263 */                                          str3 = strM10353a2;
/* 1265 */                                          it2 = it;
/* 1267 */                                          i2 = iIntValue20;
/* 1275 */                                          if (str2.equals("purposeConsents")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1277 */                                          ij0 ij0Var = jj0.Companion;
/* 1279 */                                          if (numValueOf != null) {
/* 1281 */                                              iIntValue5 = numValueOf.intValue();
                                                    } else {
/* 1286 */                                              iIntValue5 = 0;
                                                    }
/* 1287 */                                          Integer numValueOf2 = Integer.valueOf(iIntValue5);
/* 1291 */                                          ij0Var.getClass();
/* 1298 */                                          ql2Var.f15639r = ij0.m4550a(numValueOf2, strSubstring);
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -740692217:
/* 1218 */                                          i = i14;
/* 1220 */                                          str3 = strM10353a2;
/* 1222 */                                          it2 = it;
/* 1224 */                                          i2 = iIntValue20;
/* 1232 */                                          if (str2.equals("publisherCountryCode")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1234 */                                          c51 c51Var = d51.Companion;
/* 1236 */                                          if (numValueOf != null) {
/* 1238 */                                              iIntValue6 = numValueOf.intValue();
                                                    } else {
/* 1243 */                                              iIntValue6 = 0;
                                                    }
/* 1244 */                                          c51Var.getClass();
/* 1251 */                                          ql2Var.m7949g(c51.m1532a(iIntValue6, strSubstring));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -442009786:
/* 1172 */                                          i = i14;
/* 1174 */                                          str3 = strM10353a2;
/* 1176 */                                          it2 = it;
/* 1178 */                                          i2 = iIntValue20;
/* 1186 */                                          if (str2.equals("publisherCustomConsents")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1188 */                                          ij0 ij0Var2 = jj0.Companion;
/* 1190 */                                          if (numValueOf != null) {
/* 1192 */                                              iIntValue7 = numValueOf.intValue();
                                                    } else {
/* 1197 */                                              iIntValue7 = 0;
                                                    }
/* 1198 */                                          Integer numValueOf3 = Integer.valueOf(iIntValue7);
/* 1202 */                                          ij0Var2.getClass();
/* 1209 */                                          ql2Var.f15643v = ij0.m4550a(numValueOf3, strSubstring);
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -145526490:
/* 1123 */                                          i = i14;
/* 1125 */                                          str3 = strM10353a2;
/* 1127 */                                          it2 = it;
/* 1129 */                                          i2 = iIntValue20;
/* 1137 */                                          if (str2.equals("consentScreen")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1139 */                                          uy0 uy0Var4 = vy0.Companion;
/* 1141 */                                          if (numValueOf != null) {
/* 1143 */                                              iIntValue8 = numValueOf.intValue();
                                                    } else {
/* 1148 */                                              iIntValue8 = 0;
                                                    }
/* 1149 */                                          uy0Var4.getClass();
/* 1162 */                                          ql2Var.m7947e(new uh2((int) uy0.m9146a(iIntValue8, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -117505923:
/* 1089 */                                          i = i14;
/* 1091 */                                          str3 = strM10353a2;
/* 1093 */                                          it2 = it;
/* 1095 */                                          i2 = iIntValue20;
/* 1103 */                                          if (str2.equals("isServiceSpecific")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1107 */                                          AbstractC0883ek.Companion.getClass();
/* 1114 */                                          ql2Var.f15624c = strSubstring.equals("1");
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 94785793:
/* 1037 */                                          i = i14;
/* 1039 */                                          str3 = strM10353a2;
/* 1041 */                                          it2 = it;
/* 1043 */                                          i2 = iIntValue20;
/* 1051 */                                          if (str2.equals("cmpId")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1053 */                                          uy0 uy0Var5 = vy0.Companion;
/* 1055 */                                          if (numValueOf != null) {
/* 1057 */                                              iIntValue9 = numValueOf.intValue();
                                                    } else {
/* 1062 */                                              iIntValue9 = 0;
                                                    }
/* 1063 */                                          uy0Var5.getClass();
/* 1076 */                                          ql2Var.m7945c(new uh2((int) uy0.m9146a(iIntValue9, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 204489283:
/* 786 */                                           if (str2.equals("publisherRestrictions")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 790 */                                           zz1.Companion.getClass();
/* 795 */                                           xz1Var = new xz1();
/* 798 */                                           uy0 uy0Var6 = vy0.Companion;
/* 807 */                                           String strSubstring3 = strSubstring.substring(0, 12);
/* 811 */                                           uy0Var6.getClass();
/* 819 */                                           iM9146a2 = (int) uy0.m9146a(12, strSubstring3);
/* 820 */                                           i4 = 0;
/* 821 */                                           i5 = 12;
/* 822 */                                           while (i4 < iM9146a2) {
/* 824 */                                               uy0 uy0Var7 = vy0.Companion;
/* 826 */                                               C2109qj c2109qj2 = EnumC2146rj.Companion;
/* 828 */                                               int i15 = i5 + 6;
/* 830 */                                               int i16 = iM9146a2;
/* 832 */                                               String strSubstring4 = strSubstring.substring(i5, i15);
/* 836 */                                               uy0Var7.getClass();
/* 839 */                                               int i17 = i4;
/* 841 */                                               int i18 = i14;
/* 843 */                                               String str7 = strM10353a2;
/* 850 */                                               int iM9146a6 = (int) uy0.m9146a(6, strSubstring4);
/* 851 */                                               int i19 = i5 + 8;
/* 864 */                                               int iM9146a7 = (int) uy0.m9146a(2, strSubstring.substring(i15, i19));
/* 867 */                                               Integer numValueOf4 = Integer.valueOf(iM9146a6);
/* 873 */                                               l42.Companion.getClass();
/* 880 */                                               wz1Var = new wz1(numValueOf4, k42.m5948a(iM9146a7));
/* 883 */                                               i5 += 20;
/* 897 */                                               iM9146a3 = (int) uy0.m9146a(12, strSubstring.substring(i19, i5));
/* 898 */                                               i6 = 0;
/* 899 */                                               while (i6 < iM9146a3) {
/* 901 */                                                   C0847dk c0847dk = AbstractC0883ek.Companion;
/* 903 */                                                   C2109qj c2109qj3 = EnumC2146rj.Companion;
/* 905 */                                                   int i20 = i5 + 1;
/* 907 */                                                   int i21 = iM9146a3;
/* 909 */                                                   String strSubstring5 = strSubstring.substring(i5, i20);
/* 913 */                                                   c0847dk.getClass();
/* 916 */                                                   zEquals = strSubstring5.equals("1");
/* 920 */                                                   uy0 uy0Var8 = vy0.Companion;
/* 922 */                                                   i7 = i5;
/* 924 */                                                   i5 = i7 + 17;
/* 926 */                                                   String strSubstring6 = strSubstring.substring(i20, i5);
/* 930 */                                                   uy0Var8.getClass();
/* 935 */                                                   Iterator it3 = it;
/* 937 */                                                   int i22 = iIntValue20;
/* 943 */                                                   iM9146a4 = (int) uy0.m9146a(16, strSubstring6);
/* 944 */                                                   if (zEquals) {
/* 946 */                                                       i8 = i7 + 33;
/* 956 */                                                       iM9146a5 = (int) uy0.m9146a(16, strSubstring.substring(i5, i8));
/* 957 */                                                       if (iM9146a5 >= iM9146a4) {
/* 985 */                                                           throw new C0900f0(AbstractC0886en.m3506j("Invalid RangeEntry: endVendorId ", iM9146a5, iM9146a4, " is less than "), 2);
                                                                }
/* 959 */                                                       if (iM9146a4 <= iM9146a5) {
                                                                    while (true) {
/* 961 */                                                               xz1Var.m10049a(iM9146a4, wz1Var);
/* 964 */                                                               if (iM9146a4 != iM9146a5) {
/* 966 */                                                                   iM9146a4++;
                                                                        }
                                                                    }
                                                                }
/* 969 */                                                       i5 = i8;
                                                            } else {
/* 986 */                                                       xz1Var.m10049a(iM9146a4, wz1Var);
                                                            }
/* 989 */                                                   i6++;
/* 991 */                                                   iM9146a3 = i21;
/* 993 */                                                   it = it3;
/* 995 */                                                   iIntValue20 = i22;
                                                        }
/* 1006 */                                              i4 = i17 + 1;
/* 1008 */                                              i14 = i18;
/* 1010 */                                              iM9146a2 = i16;
/* 1012 */                                              strM10353a2 = str7;
                                                    }
/* 1018 */                                          i = i14;
/* 1020 */                                          str3 = strM10353a2;
/* 1022 */                                          it2 = it;
/* 1024 */                                          i2 = iIntValue20;
/* 1026 */                                          xz1Var.f19422a = i5;
/* 1028 */                                          ql2Var.f15621C = xz1Var;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 351608024:
/* 756 */                                           if (str2.equals("version")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 758 */                                           uy0 uy0Var9 = vy0.Companion;
/* 760 */                                           if (numValueOf != null) {
/* 762 */                                               iIntValue10 = numValueOf.intValue();
                                                    } else {
/* 767 */                                               iIntValue10 = 0;
                                                    }
/* 768 */                                           uy0Var9.getClass();
/* 776 */                                           ql2Var.f15628g = (int) uy0.m9146a(iIntValue10, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 439958894:
/* 735 */                                           if (str2.equals("useNonStandardStacks")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 739 */                                           AbstractC0883ek.Companion.getClass();
/* 746 */                                           ql2Var.f15625d = strSubstring.equals("1");
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 501667126:
/* 702 */                                           if (str2.equals("purposeLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 704 */                                           ij0 ij0Var3 = jj0.Companion;
/* 706 */                                           if (numValueOf != null) {
/* 708 */                                               iIntValue11 = numValueOf.intValue();
                                                    } else {
/* 713 */                                               iIntValue11 = 0;
                                                    }
/* 714 */                                           Integer numValueOf5 = Integer.valueOf(iIntValue11);
/* 718 */                                           ij0Var3.getClass();
/* 725 */                                           ql2Var.f15640s = ij0.m4550a(numValueOf5, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 544050613:
/* 669 */                                           if (str2.equals("publisherConsents")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 671 */                                           ij0 ij0Var4 = jj0.Companion;
/* 673 */                                           if (numValueOf != null) {
/* 675 */                                               iIntValue12 = numValueOf.intValue();
                                                    } else {
/* 680 */                                               iIntValue12 = 0;
                                                    }
/* 681 */                                           Integer numValueOf6 = Integer.valueOf(iIntValue12);
/* 685 */                                           ij0Var4.getClass();
/* 692 */                                           ql2Var.f15641t = ij0.m4550a(numValueOf6, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 568283376:
/* 648 */                                           if (str2.equals("purposeOneTreatment")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 652 */                                           AbstractC0883ek.Companion.getClass();
/* 659 */                                           ql2Var.f15626e = strSubstring.equals("1");
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 680983954:
/* 619 */                                           if (str2.equals("consentLanguage")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 621 */                                           c51 c51Var2 = d51.Companion;
/* 623 */                                           if (numValueOf != null) {
/* 625 */                                               iIntValue13 = numValueOf.intValue();
                                                    } else {
/* 630 */                                               iIntValue13 = 0;
                                                    }
/* 631 */                                           c51Var2.getClass();
/* 638 */                                           ql2Var.f15631j = c51.m1532a(iIntValue13, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1000364236:
/* 598 */                                           if (str2.equals("vendorLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 602 */                                           e23.Companion.getClass();
/* 609 */                                           ql2Var.f15647z = d23.m2911a(strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1028554472:
/* 546 */                                           if (str2.equals("created")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 548 */                                           c50 c50Var = d50.Companion;
/* 550 */                                           if (numValueOf != null) {
/* 552 */                                               iIntValue14 = numValueOf.intValue();
                                                    } else {
/* 557 */                                               iIntValue14 = 0;
                                                    }
/* 558 */                                           c50Var.getClass();
/* 565 */                                           if (iIntValue14 == strSubstring.length()) {
/* 591 */                                               throw new C0900f0("Invalid bit length", i11);
                                                    }
/* 569 */                                           vy0.Companion.getClass();
/* 582 */                                           ql2Var.f15636o = Long.valueOf(uy0.m9146a(iIntValue14, strSubstring) * 100);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1272166759:
/* 513 */                                           if (str2.equals("publisherCustomLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 515 */                                           ij0 ij0Var5 = jj0.Companion;
/* 517 */                                           if (numValueOf != null) {
/* 519 */                                               iIntValue15 = numValueOf.intValue();
                                                    } else {
/* 524 */                                               iIntValue15 = 0;
                                                    }
/* 525 */                                           Integer numValueOf7 = Integer.valueOf(iIntValue15);
/* 529 */                                           ij0Var5.getClass();
/* 536 */                                           ql2Var.f15644w = ij0.m4550a(numValueOf7, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1401591704:
/* 480 */                                           if (str2.equals("publisherLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 482 */                                           ij0 ij0Var6 = jj0.Companion;
/* 484 */                                           if (numValueOf != null) {
/* 486 */                                               iIntValue16 = numValueOf.intValue();
                                                    } else {
/* 491 */                                               iIntValue16 = 0;
                                                    }
/* 492 */                                           Integer numValueOf8 = Integer.valueOf(iIntValue16);
/* 496 */                                           ij0Var6.getClass();
/* 503 */                                           ql2Var.f15642u = ij0.m4550a(numValueOf8, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1649733957:
/* 428 */                                           if (str2.equals("lastUpdated")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 430 */                                           c50 c50Var2 = d50.Companion;
/* 432 */                                           if (numValueOf != null) {
/* 434 */                                               iIntValue17 = numValueOf.intValue();
                                                    } else {
/* 439 */                                               iIntValue17 = 0;
                                                    }
/* 440 */                                           c50Var2.getClass();
/* 447 */                                           if (iIntValue17 == strSubstring.length()) {
/* 473 */                                               throw new C0900f0("Invalid bit length", i11);
                                                    }
/* 451 */                                           vy0.Companion.getClass();
/* 464 */                                           ql2Var.f15637p = Long.valueOf(uy0.m9146a(iIntValue17, strSubstring) * 100);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1722227698:
/* 393 */                                           if (str2.equals("vendorListVersion")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 395 */                                           uy0 uy0Var10 = vy0.Companion;
/* 397 */                                           if (numValueOf != null) {
/* 399 */                                               iIntValue18 = numValueOf.intValue();
                                                    } else {
/* 404 */                                               iIntValue18 = 0;
                                                    }
/* 405 */                                           uy0Var10.getClass();
/* 418 */                                           ql2Var.m7950h(new uh2((int) uy0.m9146a(iIntValue18, strSubstring)));
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1886388920:
/* 361 */                                           if (str2.equals("specialFeatureOptins")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 363 */                                           ij0 ij0Var7 = jj0.Companion;
/* 365 */                                           if (numValueOf != null) {
/* 367 */                                               iIntValue19 = numValueOf.intValue();
                                                    } else {
/* 372 */                                               iIntValue19 = 0;
                                                    }
/* 373 */                                           Integer numValueOf9 = Integer.valueOf(iIntValue19);
/* 377 */                                           ij0Var7.getClass();
/* 384 */                                           ql2Var.f15638q = ij0.m4550a(numValueOf9, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1982848911:
/* 341 */                                           if (str2.equals("vendorsDisclosed")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 345 */                                           e23.Companion.getClass();
/* 352 */                                           ql2Var.f15619A = d23.m2911a(strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1995874045:
/* 309 */                                           if (str2.equals(str6)) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 313 */                                           e23.Companion.getClass();
/* 320 */                                           ql2Var.f15620B = d23.m2911a(strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                default:
/* 302 */                                           i3 = i11;
/* 1548 */                                          throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                            }
                                        }
/* 1562 */                              str6 = str6;
/* 1563 */                              i14 = i;
/* 1565 */                              listSplit$default = listSplit$default;
/* 1567 */                              size = size;
/* 1569 */                              strM10353a2 = str3;
/* 1571 */                              it = it2;
/* 1573 */                              i11 = 2;
                                    }
                                    break;
                                }
                                break;
                            case 3059615:
/* 184 */                       if (!str5.equals("core")) {
/* 1609 */                          throw new Throwable("Invalid Value for Segment Type: ".concat(str5));
                                }
/* 201 */                       list = (List) map.get(t82Var);
/* 203 */                       if (list != null) {
/* 1594 */                          f42.m3656l("Unable to find fieldSequence");
/* 153 */                           return null;
                                }
/* 205 */                       it = list.iterator();
                                while (true) {
/* 213 */                           if (it.hasNext()) {
/* 1584 */                              i14++;
/* 1586 */                              ql2Var2 = ql2Var;
/* 1587 */                              i11 = 2;
/* 1588 */                              i12 = 0;
/* 1589 */                              i13 = 6;
                                    } else {
/* 219 */                               str2 = (String) it.next();
/* 223 */                               EnumC2146rj.Companion.getClass();
/* 226 */                               enumC2146rjM7866a = C2109qj.m7866a(str2);
/* 230 */                               if (enumC2146rjM7866a != null) {
/* 234 */                                   numValueOf = Integer.valueOf(enumC2146rjM7866a.f16116a);
                                        } else {
/* 239 */                                   numValueOf = null;
                                        }
/* 241 */                               if (numValueOf == null) {
/* 245 */                                   v82.Companion.getClass();
/* 252 */                                   if (u82.m8973a(str2)) {
/* 260 */                                       numValueOf = Integer.valueOf(ql2Var.m7944b().f17529a);
                                            }
                                        }
/* 264 */                               if (numValueOf == null) {
/* 273 */                                   if (numValueOf == null) {
/* 275 */                                       iIntValue = strM10353a2.length();
                                            } else {
/* 284 */                                       iIntValue = numValueOf.intValue() + iIntValue20;
                                            }
/* 285 */                                   strSubstring = strM10353a2.substring(iIntValue20, iIntValue);
                                            switch (str2.hashCode()) {
                                                case -2115730175:
/* 1459 */                                          i = i14;
/* 1461 */                                          str3 = strM10353a2;
/* 1463 */                                          it2 = it;
/* 1465 */                                          i2 = iIntValue20;
/* 1473 */                                          if (str2.equals("vendorConsents")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1477 */                                          e23.Companion.getClass();
/* 1484 */                                          ql2Var.f15646y = d23.m2911a(strSubstring);
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -2076485454:
/* 1411 */                                          i = i14;
/* 1413 */                                          str3 = strM10353a2;
/* 1415 */                                          it2 = it;
/* 1417 */                                          i2 = iIntValue20;
/* 1425 */                                          if (str2.equals("cmpVersion")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1427 */                                          uy0 uy0Var11 = vy0.Companion;
/* 1429 */                                          if (numValueOf != null) {
/* 1431 */                                              iIntValue2 = numValueOf.intValue();
                                                    } else {
/* 1436 */                                              iIntValue2 = 0;
                                                    }
/* 1437 */                                          uy0Var11.getClass();
/* 1450 */                                          ql2Var.m7946d(new uh2((int) uy0.m9146a(iIntValue2, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -2014745908:
/* 1356 */                                          i = i14;
/* 1358 */                                          str3 = strM10353a2;
/* 1360 */                                          it2 = it;
/* 1362 */                                          i2 = iIntValue20;
/* 1370 */                                          if (str2.equals("numCustomPurposes")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1372 */                                          uy0 uy0Var12 = vy0.Companion;
/* 1374 */                                          if (numValueOf != null) {
/* 1376 */                                              iIntValue3 = numValueOf.intValue();
                                                    } else {
/* 1381 */                                              iIntValue3 = 0;
                                                    }
/* 1382 */                                          uy0Var12.getClass();
/* 1391 */                                          iM9146a = (int) uy0.m9146a(iIntValue3, strSubstring);
/* 1392 */                                          uh2Var = new uh2(iM9146a);
/* 1395 */                                          if (iM9146a >= 0) {
/* 1405 */                                              throw new C0900f0("numCustomPurposes", uh2Var);
                                                    }
/* 1397 */                                          ql2Var.f15635n = iM9146a;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -1710804154:
/* 1307 */                                          i = i14;
/* 1309 */                                          str3 = strM10353a2;
/* 1311 */                                          it2 = it;
/* 1313 */                                          i2 = iIntValue20;
/* 1321 */                                          if (str2.equals("policyVersion")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1323 */                                          uy0 uy0Var13 = vy0.Companion;
/* 1325 */                                          if (numValueOf != null) {
/* 1327 */                                              iIntValue4 = numValueOf.intValue();
                                                    } else {
/* 1332 */                                              iIntValue4 = 0;
                                                    }
/* 1333 */                                          uy0Var13.getClass();
/* 1346 */                                          ql2Var.m7948f(new uh2((int) uy0.m9146a(iIntValue4, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -879778089:
/* 1261 */                                          i = i14;
/* 1263 */                                          str3 = strM10353a2;
/* 1265 */                                          it2 = it;
/* 1267 */                                          i2 = iIntValue20;
/* 1275 */                                          if (str2.equals("purposeConsents")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1277 */                                          ij0 ij0Var8 = jj0.Companion;
/* 1279 */                                          if (numValueOf != null) {
/* 1281 */                                              iIntValue5 = numValueOf.intValue();
                                                    } else {
/* 1286 */                                              iIntValue5 = 0;
                                                    }
/* 1287 */                                          Integer numValueOf10 = Integer.valueOf(iIntValue5);
/* 1291 */                                          ij0Var8.getClass();
/* 1298 */                                          ql2Var.f15639r = ij0.m4550a(numValueOf10, strSubstring);
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -740692217:
/* 1218 */                                          i = i14;
/* 1220 */                                          str3 = strM10353a2;
/* 1222 */                                          it2 = it;
/* 1224 */                                          i2 = iIntValue20;
/* 1232 */                                          if (str2.equals("publisherCountryCode")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1234 */                                          c51 c51Var3 = d51.Companion;
/* 1236 */                                          if (numValueOf != null) {
/* 1238 */                                              iIntValue6 = numValueOf.intValue();
                                                    } else {
/* 1243 */                                              iIntValue6 = 0;
                                                    }
/* 1244 */                                          c51Var3.getClass();
/* 1251 */                                          ql2Var.m7949g(c51.m1532a(iIntValue6, strSubstring));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -442009786:
/* 1172 */                                          i = i14;
/* 1174 */                                          str3 = strM10353a2;
/* 1176 */                                          it2 = it;
/* 1178 */                                          i2 = iIntValue20;
/* 1186 */                                          if (str2.equals("publisherCustomConsents")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1188 */                                          ij0 ij0Var9 = jj0.Companion;
/* 1190 */                                          if (numValueOf != null) {
/* 1192 */                                              iIntValue7 = numValueOf.intValue();
                                                    } else {
/* 1197 */                                              iIntValue7 = 0;
                                                    }
/* 1198 */                                          Integer numValueOf11 = Integer.valueOf(iIntValue7);
/* 1202 */                                          ij0Var9.getClass();
/* 1209 */                                          ql2Var.f15643v = ij0.m4550a(numValueOf11, strSubstring);
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -145526490:
/* 1123 */                                          i = i14;
/* 1125 */                                          str3 = strM10353a2;
/* 1127 */                                          it2 = it;
/* 1129 */                                          i2 = iIntValue20;
/* 1137 */                                          if (str2.equals("consentScreen")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1139 */                                          uy0 uy0Var14 = vy0.Companion;
/* 1141 */                                          if (numValueOf != null) {
/* 1143 */                                              iIntValue8 = numValueOf.intValue();
                                                    } else {
/* 1148 */                                              iIntValue8 = 0;
                                                    }
/* 1149 */                                          uy0Var14.getClass();
/* 1162 */                                          ql2Var.m7947e(new uh2((int) uy0.m9146a(iIntValue8, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -117505923:
/* 1089 */                                          i = i14;
/* 1091 */                                          str3 = strM10353a2;
/* 1093 */                                          it2 = it;
/* 1095 */                                          i2 = iIntValue20;
/* 1103 */                                          if (str2.equals("isServiceSpecific")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1107 */                                          AbstractC0883ek.Companion.getClass();
/* 1114 */                                          ql2Var.f15624c = strSubstring.equals("1");
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 94785793:
/* 1037 */                                          i = i14;
/* 1039 */                                          str3 = strM10353a2;
/* 1041 */                                          it2 = it;
/* 1043 */                                          i2 = iIntValue20;
/* 1051 */                                          if (str2.equals("cmpId")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1053 */                                          uy0 uy0Var15 = vy0.Companion;
/* 1055 */                                          if (numValueOf != null) {
/* 1057 */                                              iIntValue9 = numValueOf.intValue();
                                                    } else {
/* 1062 */                                              iIntValue9 = 0;
                                                    }
/* 1063 */                                          uy0Var15.getClass();
/* 1076 */                                          ql2Var.m7945c(new uh2((int) uy0.m9146a(iIntValue9, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 204489283:
/* 786 */                                           if (str2.equals("publisherRestrictions")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 790 */                                           zz1.Companion.getClass();
/* 795 */                                           xz1Var = new xz1();
/* 798 */                                           uy0 uy0Var16 = vy0.Companion;
/* 807 */                                           String strSubstring7 = strSubstring.substring(0, 12);
/* 811 */                                           uy0Var16.getClass();
/* 819 */                                           iM9146a2 = (int) uy0.m9146a(12, strSubstring7);
/* 820 */                                           i4 = 0;
/* 821 */                                           i5 = 12;
/* 822 */                                           while (i4 < iM9146a2) {
/* 824 */                                               uy0 uy0Var17 = vy0.Companion;
/* 826 */                                               C2109qj c2109qj4 = EnumC2146rj.Companion;
/* 828 */                                               int i110 = i5 + 6;
/* 830 */                                               int i111 = iM9146a2;
/* 832 */                                               String strSubstring8 = strSubstring.substring(i5, i110);
/* 836 */                                               uy0Var17.getClass();
/* 839 */                                               int i112 = i4;
/* 841 */                                               int i113 = i14;
/* 843 */                                               String str8 = strM10353a2;
/* 850 */                                               int iM9146a8 = (int) uy0.m9146a(6, strSubstring8);
/* 851 */                                               int i114 = i5 + 8;
/* 864 */                                               int iM9146a9 = (int) uy0.m9146a(2, strSubstring.substring(i110, i114));
/* 867 */                                               Integer numValueOf12 = Integer.valueOf(iM9146a8);
/* 873 */                                               l42.Companion.getClass();
/* 880 */                                               wz1Var = new wz1(numValueOf12, k42.m5948a(iM9146a9));
/* 883 */                                               i5 += 20;
/* 897 */                                               iM9146a3 = (int) uy0.m9146a(12, strSubstring.substring(i114, i5));
/* 898 */                                               i6 = 0;
/* 899 */                                               while (i6 < iM9146a3) {
/* 901 */                                                   C0847dk c0847dk2 = AbstractC0883ek.Companion;
/* 903 */                                                   C2109qj c2109qj5 = EnumC2146rj.Companion;
/* 905 */                                                   int i23 = i5 + 1;
/* 907 */                                                   int i24 = iM9146a3;
/* 909 */                                                   String strSubstring9 = strSubstring.substring(i5, i23);
/* 913 */                                                   c0847dk2.getClass();
/* 916 */                                                   zEquals = strSubstring9.equals("1");
/* 920 */                                                   uy0 uy0Var18 = vy0.Companion;
/* 922 */                                                   i7 = i5;
/* 924 */                                                   i5 = i7 + 17;
/* 926 */                                                   String strSubstring10 = strSubstring.substring(i23, i5);
/* 930 */                                                   uy0Var18.getClass();
/* 935 */                                                   Iterator it4 = it;
/* 937 */                                                   int i25 = iIntValue20;
/* 943 */                                                   iM9146a4 = (int) uy0.m9146a(16, strSubstring10);
/* 944 */                                                   if (zEquals) {
/* 946 */                                                       i8 = i7 + 33;
/* 956 */                                                       iM9146a5 = (int) uy0.m9146a(16, strSubstring.substring(i5, i8));
/* 957 */                                                       if (iM9146a5 >= iM9146a4) {
/* 985 */                                                           throw new C0900f0(AbstractC0886en.m3506j("Invalid RangeEntry: endVendorId ", iM9146a5, iM9146a4, " is less than "), 2);
                                                                }
/* 959 */                                                       if (iM9146a4 <= iM9146a5) {
                                                                    while (true) {
/* 961 */                                                               xz1Var.m10049a(iM9146a4, wz1Var);
/* 964 */                                                               if (iM9146a4 != iM9146a5) {
/* 966 */                                                                   iM9146a4++;
                                                                        }
                                                                    }
                                                                }
/* 969 */                                                       i5 = i8;
                                                            } else {
/* 986 */                                                       xz1Var.m10049a(iM9146a4, wz1Var);
                                                            }
/* 989 */                                                   i6++;
/* 991 */                                                   iM9146a3 = i24;
/* 993 */                                                   it = it4;
/* 995 */                                                   iIntValue20 = i25;
                                                        }
/* 1006 */                                              i4 = i112 + 1;
/* 1008 */                                              i14 = i113;
/* 1010 */                                              iM9146a2 = i111;
/* 1012 */                                              strM10353a2 = str8;
                                                    }
/* 1018 */                                          i = i14;
/* 1020 */                                          str3 = strM10353a2;
/* 1022 */                                          it2 = it;
/* 1024 */                                          i2 = iIntValue20;
/* 1026 */                                          xz1Var.f19422a = i5;
/* 1028 */                                          ql2Var.f15621C = xz1Var;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 351608024:
/* 756 */                                           if (str2.equals("version")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 758 */                                           uy0 uy0Var19 = vy0.Companion;
/* 760 */                                           if (numValueOf != null) {
/* 762 */                                               iIntValue10 = numValueOf.intValue();
                                                    } else {
/* 767 */                                               iIntValue10 = 0;
                                                    }
/* 768 */                                           uy0Var19.getClass();
/* 776 */                                           ql2Var.f15628g = (int) uy0.m9146a(iIntValue10, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 439958894:
/* 735 */                                           if (str2.equals("useNonStandardStacks")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 739 */                                           AbstractC0883ek.Companion.getClass();
/* 746 */                                           ql2Var.f15625d = strSubstring.equals("1");
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 501667126:
/* 702 */                                           if (str2.equals("purposeLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 704 */                                           ij0 ij0Var10 = jj0.Companion;
/* 706 */                                           if (numValueOf != null) {
/* 708 */                                               iIntValue11 = numValueOf.intValue();
                                                    } else {
/* 713 */                                               iIntValue11 = 0;
                                                    }
/* 714 */                                           Integer numValueOf13 = Integer.valueOf(iIntValue11);
/* 718 */                                           ij0Var10.getClass();
/* 725 */                                           ql2Var.f15640s = ij0.m4550a(numValueOf13, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 544050613:
/* 669 */                                           if (str2.equals("publisherConsents")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 671 */                                           ij0 ij0Var11 = jj0.Companion;
/* 673 */                                           if (numValueOf != null) {
/* 675 */                                               iIntValue12 = numValueOf.intValue();
                                                    } else {
/* 680 */                                               iIntValue12 = 0;
                                                    }
/* 681 */                                           Integer numValueOf14 = Integer.valueOf(iIntValue12);
/* 685 */                                           ij0Var11.getClass();
/* 692 */                                           ql2Var.f15641t = ij0.m4550a(numValueOf14, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 568283376:
/* 648 */                                           if (str2.equals("purposeOneTreatment")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 652 */                                           AbstractC0883ek.Companion.getClass();
/* 659 */                                           ql2Var.f15626e = strSubstring.equals("1");
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 680983954:
/* 619 */                                           if (str2.equals("consentLanguage")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 621 */                                           c51 c51Var4 = d51.Companion;
/* 623 */                                           if (numValueOf != null) {
/* 625 */                                               iIntValue13 = numValueOf.intValue();
                                                    } else {
/* 630 */                                               iIntValue13 = 0;
                                                    }
/* 631 */                                           c51Var4.getClass();
/* 638 */                                           ql2Var.f15631j = c51.m1532a(iIntValue13, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1000364236:
/* 598 */                                           if (str2.equals("vendorLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 602 */                                           e23.Companion.getClass();
/* 609 */                                           ql2Var.f15647z = d23.m2911a(strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1028554472:
/* 546 */                                           if (str2.equals("created")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 548 */                                           c50 c50Var3 = d50.Companion;
/* 550 */                                           if (numValueOf != null) {
/* 552 */                                               iIntValue14 = numValueOf.intValue();
                                                    } else {
/* 557 */                                               iIntValue14 = 0;
                                                    }
/* 558 */                                           c50Var3.getClass();
/* 565 */                                           if (iIntValue14 == strSubstring.length()) {
/* 591 */                                               throw new C0900f0("Invalid bit length", i11);
                                                    }
/* 569 */                                           vy0.Companion.getClass();
/* 582 */                                           ql2Var.f15636o = Long.valueOf(uy0.m9146a(iIntValue14, strSubstring) * 100);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1272166759:
/* 513 */                                           if (str2.equals("publisherCustomLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 515 */                                           ij0 ij0Var12 = jj0.Companion;
/* 517 */                                           if (numValueOf != null) {
/* 519 */                                               iIntValue15 = numValueOf.intValue();
                                                    } else {
/* 524 */                                               iIntValue15 = 0;
                                                    }
/* 525 */                                           Integer numValueOf15 = Integer.valueOf(iIntValue15);
/* 529 */                                           ij0Var12.getClass();
/* 536 */                                           ql2Var.f15644w = ij0.m4550a(numValueOf15, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1401591704:
/* 480 */                                           if (str2.equals("publisherLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 482 */                                           ij0 ij0Var13 = jj0.Companion;
/* 484 */                                           if (numValueOf != null) {
/* 486 */                                               iIntValue16 = numValueOf.intValue();
                                                    } else {
/* 491 */                                               iIntValue16 = 0;
                                                    }
/* 492 */                                           Integer numValueOf16 = Integer.valueOf(iIntValue16);
/* 496 */                                           ij0Var13.getClass();
/* 503 */                                           ql2Var.f15642u = ij0.m4550a(numValueOf16, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1649733957:
/* 428 */                                           if (str2.equals("lastUpdated")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 430 */                                           c50 c50Var4 = d50.Companion;
/* 432 */                                           if (numValueOf != null) {
/* 434 */                                               iIntValue17 = numValueOf.intValue();
                                                    } else {
/* 439 */                                               iIntValue17 = 0;
                                                    }
/* 440 */                                           c50Var4.getClass();
/* 447 */                                           if (iIntValue17 == strSubstring.length()) {
/* 473 */                                               throw new C0900f0("Invalid bit length", i11);
                                                    }
/* 451 */                                           vy0.Companion.getClass();
/* 464 */                                           ql2Var.f15637p = Long.valueOf(uy0.m9146a(iIntValue17, strSubstring) * 100);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1722227698:
/* 393 */                                           if (str2.equals("vendorListVersion")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 395 */                                           uy0 uy0Var110 = vy0.Companion;
/* 397 */                                           if (numValueOf != null) {
/* 399 */                                               iIntValue18 = numValueOf.intValue();
                                                    } else {
/* 404 */                                               iIntValue18 = 0;
                                                    }
/* 405 */                                           uy0Var110.getClass();
/* 418 */                                           ql2Var.m7950h(new uh2((int) uy0.m9146a(iIntValue18, strSubstring)));
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1886388920:
/* 361 */                                           if (str2.equals("specialFeatureOptins")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 363 */                                           ij0 ij0Var14 = jj0.Companion;
/* 365 */                                           if (numValueOf != null) {
/* 367 */                                               iIntValue19 = numValueOf.intValue();
                                                    } else {
/* 372 */                                               iIntValue19 = 0;
                                                    }
/* 373 */                                           Integer numValueOf17 = Integer.valueOf(iIntValue19);
/* 377 */                                           ij0Var14.getClass();
/* 384 */                                           ql2Var.f15638q = ij0.m4550a(numValueOf17, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1982848911:
/* 341 */                                           if (str2.equals("vendorsDisclosed")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 345 */                                           e23.Companion.getClass();
/* 352 */                                           ql2Var.f15619A = d23.m2911a(strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1995874045:
/* 309 */                                           if (str2.equals(str6)) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 313 */                                           e23.Companion.getClass();
/* 320 */                                           ql2Var.f15620B = d23.m2911a(strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                default:
/* 302 */                                           i3 = i11;
/* 1548 */                                          throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                            }
                                        } else {
/* 1549 */                                  listSplit$default = listSplit$default;
/* 1551 */                                  size = size;
/* 1553 */                                  str6 = str6;
/* 1554 */                                  i = i14;
/* 1556 */                                  str3 = strM10353a2;
/* 1558 */                                  it2 = it;
                                        }
/* 1562 */                              str6 = str6;
/* 1563 */                              i14 = i;
/* 1565 */                              listSplit$default = listSplit$default;
/* 1567 */                              size = size;
/* 1569 */                              strM10353a2 = str3;
/* 1571 */                              it = it2;
/* 1573 */                              i11 = 2;
                                    }
                                    break;
                                }
                                break;
                            case 1982848911:
/* 175 */                       if (!str5.equals("vendorsDisclosed")) {
/* 1609 */                          throw new Throwable("Invalid Value for Segment Type: ".concat(str5));
                                }
/* 177 */                       t82Var = t82.VENDORS_DISCLOSED;
/* 201 */                       list = (List) map.get(t82Var);
/* 203 */                       if (list != null) {
/* 1594 */                          f42.m3656l("Unable to find fieldSequence");
/* 153 */                           return null;
                                }
/* 205 */                       it = list.iterator();
                                while (true) {
/* 213 */                           if (it.hasNext()) {
/* 1584 */                              i14++;
/* 1586 */                              ql2Var2 = ql2Var;
/* 1587 */                              i11 = 2;
/* 1588 */                              i12 = 0;
/* 1589 */                              i13 = 6;
                                    } else {
/* 219 */                               str2 = (String) it.next();
/* 223 */                               EnumC2146rj.Companion.getClass();
/* 226 */                               enumC2146rjM7866a = C2109qj.m7866a(str2);
/* 230 */                               if (enumC2146rjM7866a != null) {
/* 234 */                                   numValueOf = Integer.valueOf(enumC2146rjM7866a.f16116a);
                                        } else {
/* 239 */                                   numValueOf = null;
                                        }
/* 241 */                               if (numValueOf == null) {
/* 245 */                                   v82.Companion.getClass();
/* 252 */                                   if (u82.m8973a(str2)) {
/* 260 */                                       numValueOf = Integer.valueOf(ql2Var.m7944b().f17529a);
                                            }
                                        }
/* 264 */                               if (numValueOf == null) {
/* 273 */                                   if (numValueOf == null) {
/* 275 */                                       iIntValue = strM10353a2.length();
                                            } else {
/* 284 */                                       iIntValue = numValueOf.intValue() + iIntValue20;
                                            }
/* 285 */                                   strSubstring = strM10353a2.substring(iIntValue20, iIntValue);
                                            switch (str2.hashCode()) {
                                                case -2115730175:
/* 1459 */                                          i = i14;
/* 1461 */                                          str3 = strM10353a2;
/* 1463 */                                          it2 = it;
/* 1465 */                                          i2 = iIntValue20;
/* 1473 */                                          if (str2.equals("vendorConsents")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1477 */                                          e23.Companion.getClass();
/* 1484 */                                          ql2Var.f15646y = d23.m2911a(strSubstring);
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -2076485454:
/* 1411 */                                          i = i14;
/* 1413 */                                          str3 = strM10353a2;
/* 1415 */                                          it2 = it;
/* 1417 */                                          i2 = iIntValue20;
/* 1425 */                                          if (str2.equals("cmpVersion")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1427 */                                          uy0 uy0Var111 = vy0.Companion;
/* 1429 */                                          if (numValueOf != null) {
/* 1431 */                                              iIntValue2 = numValueOf.intValue();
                                                    } else {
/* 1436 */                                              iIntValue2 = 0;
                                                    }
/* 1437 */                                          uy0Var111.getClass();
/* 1450 */                                          ql2Var.m7946d(new uh2((int) uy0.m9146a(iIntValue2, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -2014745908:
/* 1356 */                                          i = i14;
/* 1358 */                                          str3 = strM10353a2;
/* 1360 */                                          it2 = it;
/* 1362 */                                          i2 = iIntValue20;
/* 1370 */                                          if (str2.equals("numCustomPurposes")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1372 */                                          uy0 uy0Var112 = vy0.Companion;
/* 1374 */                                          if (numValueOf != null) {
/* 1376 */                                              iIntValue3 = numValueOf.intValue();
                                                    } else {
/* 1381 */                                              iIntValue3 = 0;
                                                    }
/* 1382 */                                          uy0Var112.getClass();
/* 1391 */                                          iM9146a = (int) uy0.m9146a(iIntValue3, strSubstring);
/* 1392 */                                          uh2Var = new uh2(iM9146a);
/* 1395 */                                          if (iM9146a >= 0) {
/* 1405 */                                              throw new C0900f0("numCustomPurposes", uh2Var);
                                                    }
/* 1397 */                                          ql2Var.f15635n = iM9146a;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -1710804154:
/* 1307 */                                          i = i14;
/* 1309 */                                          str3 = strM10353a2;
/* 1311 */                                          it2 = it;
/* 1313 */                                          i2 = iIntValue20;
/* 1321 */                                          if (str2.equals("policyVersion")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1323 */                                          uy0 uy0Var113 = vy0.Companion;
/* 1325 */                                          if (numValueOf != null) {
/* 1327 */                                              iIntValue4 = numValueOf.intValue();
                                                    } else {
/* 1332 */                                              iIntValue4 = 0;
                                                    }
/* 1333 */                                          uy0Var113.getClass();
/* 1346 */                                          ql2Var.m7948f(new uh2((int) uy0.m9146a(iIntValue4, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -879778089:
/* 1261 */                                          i = i14;
/* 1263 */                                          str3 = strM10353a2;
/* 1265 */                                          it2 = it;
/* 1267 */                                          i2 = iIntValue20;
/* 1275 */                                          if (str2.equals("purposeConsents")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1277 */                                          ij0 ij0Var15 = jj0.Companion;
/* 1279 */                                          if (numValueOf != null) {
/* 1281 */                                              iIntValue5 = numValueOf.intValue();
                                                    } else {
/* 1286 */                                              iIntValue5 = 0;
                                                    }
/* 1287 */                                          Integer numValueOf18 = Integer.valueOf(iIntValue5);
/* 1291 */                                          ij0Var15.getClass();
/* 1298 */                                          ql2Var.f15639r = ij0.m4550a(numValueOf18, strSubstring);
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -740692217:
/* 1218 */                                          i = i14;
/* 1220 */                                          str3 = strM10353a2;
/* 1222 */                                          it2 = it;
/* 1224 */                                          i2 = iIntValue20;
/* 1232 */                                          if (str2.equals("publisherCountryCode")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1234 */                                          c51 c51Var5 = d51.Companion;
/* 1236 */                                          if (numValueOf != null) {
/* 1238 */                                              iIntValue6 = numValueOf.intValue();
                                                    } else {
/* 1243 */                                              iIntValue6 = 0;
                                                    }
/* 1244 */                                          c51Var5.getClass();
/* 1251 */                                          ql2Var.m7949g(c51.m1532a(iIntValue6, strSubstring));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -442009786:
/* 1172 */                                          i = i14;
/* 1174 */                                          str3 = strM10353a2;
/* 1176 */                                          it2 = it;
/* 1178 */                                          i2 = iIntValue20;
/* 1186 */                                          if (str2.equals("publisherCustomConsents")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1188 */                                          ij0 ij0Var16 = jj0.Companion;
/* 1190 */                                          if (numValueOf != null) {
/* 1192 */                                              iIntValue7 = numValueOf.intValue();
                                                    } else {
/* 1197 */                                              iIntValue7 = 0;
                                                    }
/* 1198 */                                          Integer numValueOf19 = Integer.valueOf(iIntValue7);
/* 1202 */                                          ij0Var16.getClass();
/* 1209 */                                          ql2Var.f15643v = ij0.m4550a(numValueOf19, strSubstring);
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -145526490:
/* 1123 */                                          i = i14;
/* 1125 */                                          str3 = strM10353a2;
/* 1127 */                                          it2 = it;
/* 1129 */                                          i2 = iIntValue20;
/* 1137 */                                          if (str2.equals("consentScreen")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1139 */                                          uy0 uy0Var114 = vy0.Companion;
/* 1141 */                                          if (numValueOf != null) {
/* 1143 */                                              iIntValue8 = numValueOf.intValue();
                                                    } else {
/* 1148 */                                              iIntValue8 = 0;
                                                    }
/* 1149 */                                          uy0Var114.getClass();
/* 1162 */                                          ql2Var.m7947e(new uh2((int) uy0.m9146a(iIntValue8, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -117505923:
/* 1089 */                                          i = i14;
/* 1091 */                                          str3 = strM10353a2;
/* 1093 */                                          it2 = it;
/* 1095 */                                          i2 = iIntValue20;
/* 1103 */                                          if (str2.equals("isServiceSpecific")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1107 */                                          AbstractC0883ek.Companion.getClass();
/* 1114 */                                          ql2Var.f15624c = strSubstring.equals("1");
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 94785793:
/* 1037 */                                          i = i14;
/* 1039 */                                          str3 = strM10353a2;
/* 1041 */                                          it2 = it;
/* 1043 */                                          i2 = iIntValue20;
/* 1051 */                                          if (str2.equals("cmpId")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1053 */                                          uy0 uy0Var115 = vy0.Companion;
/* 1055 */                                          if (numValueOf != null) {
/* 1057 */                                              iIntValue9 = numValueOf.intValue();
                                                    } else {
/* 1062 */                                              iIntValue9 = 0;
                                                    }
/* 1063 */                                          uy0Var115.getClass();
/* 1076 */                                          ql2Var.m7945c(new uh2((int) uy0.m9146a(iIntValue9, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 204489283:
/* 786 */                                           if (str2.equals("publisherRestrictions")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 790 */                                           zz1.Companion.getClass();
/* 795 */                                           xz1Var = new xz1();
/* 798 */                                           uy0 uy0Var116 = vy0.Companion;
/* 807 */                                           String strSubstring11 = strSubstring.substring(0, 12);
/* 811 */                                           uy0Var116.getClass();
/* 819 */                                           iM9146a2 = (int) uy0.m9146a(12, strSubstring11);
/* 820 */                                           i4 = 0;
/* 821 */                                           i5 = 12;
/* 822 */                                           while (i4 < iM9146a2) {
/* 824 */                                               uy0 uy0Var117 = vy0.Companion;
/* 826 */                                               C2109qj c2109qj6 = EnumC2146rj.Companion;
/* 828 */                                               int i115 = i5 + 6;
/* 830 */                                               int i116 = iM9146a2;
/* 832 */                                               String strSubstring12 = strSubstring.substring(i5, i115);
/* 836 */                                               uy0Var117.getClass();
/* 839 */                                               int i117 = i4;
/* 841 */                                               int i118 = i14;
/* 843 */                                               String str9 = strM10353a2;
/* 850 */                                               int iM9146a10 = (int) uy0.m9146a(6, strSubstring12);
/* 851 */                                               int i119 = i5 + 8;
/* 864 */                                               int iM9146a11 = (int) uy0.m9146a(2, strSubstring.substring(i115, i119));
/* 867 */                                               Integer numValueOf110 = Integer.valueOf(iM9146a10);
/* 873 */                                               l42.Companion.getClass();
/* 880 */                                               wz1Var = new wz1(numValueOf110, k42.m5948a(iM9146a11));
/* 883 */                                               i5 += 20;
/* 897 */                                               iM9146a3 = (int) uy0.m9146a(12, strSubstring.substring(i119, i5));
/* 898 */                                               i6 = 0;
/* 899 */                                               while (i6 < iM9146a3) {
/* 901 */                                                   C0847dk c0847dk3 = AbstractC0883ek.Companion;
/* 903 */                                                   C2109qj c2109qj7 = EnumC2146rj.Companion;
/* 905 */                                                   int i26 = i5 + 1;
/* 907 */                                                   int i27 = iM9146a3;
/* 909 */                                                   String strSubstring13 = strSubstring.substring(i5, i26);
/* 913 */                                                   c0847dk3.getClass();
/* 916 */                                                   zEquals = strSubstring13.equals("1");
/* 920 */                                                   uy0 uy0Var118 = vy0.Companion;
/* 922 */                                                   i7 = i5;
/* 924 */                                                   i5 = i7 + 17;
/* 926 */                                                   String strSubstring14 = strSubstring.substring(i26, i5);
/* 930 */                                                   uy0Var118.getClass();
/* 935 */                                                   Iterator it5 = it;
/* 937 */                                                   int i28 = iIntValue20;
/* 943 */                                                   iM9146a4 = (int) uy0.m9146a(16, strSubstring14);
/* 944 */                                                   if (zEquals) {
/* 946 */                                                       i8 = i7 + 33;
/* 956 */                                                       iM9146a5 = (int) uy0.m9146a(16, strSubstring.substring(i5, i8));
/* 957 */                                                       if (iM9146a5 >= iM9146a4) {
/* 985 */                                                           throw new C0900f0(AbstractC0886en.m3506j("Invalid RangeEntry: endVendorId ", iM9146a5, iM9146a4, " is less than "), 2);
                                                                }
/* 959 */                                                       if (iM9146a4 <= iM9146a5) {
                                                                    while (true) {
/* 961 */                                                               xz1Var.m10049a(iM9146a4, wz1Var);
/* 964 */                                                               if (iM9146a4 != iM9146a5) {
/* 966 */                                                                   iM9146a4++;
                                                                        }
                                                                    }
                                                                }
/* 969 */                                                       i5 = i8;
                                                            } else {
/* 986 */                                                       xz1Var.m10049a(iM9146a4, wz1Var);
                                                            }
/* 989 */                                                   i6++;
/* 991 */                                                   iM9146a3 = i27;
/* 993 */                                                   it = it5;
/* 995 */                                                   iIntValue20 = i28;
                                                        }
/* 1006 */                                              i4 = i117 + 1;
/* 1008 */                                              i14 = i118;
/* 1010 */                                              iM9146a2 = i116;
/* 1012 */                                              strM10353a2 = str9;
                                                    }
/* 1018 */                                          i = i14;
/* 1020 */                                          str3 = strM10353a2;
/* 1022 */                                          it2 = it;
/* 1024 */                                          i2 = iIntValue20;
/* 1026 */                                          xz1Var.f19422a = i5;
/* 1028 */                                          ql2Var.f15621C = xz1Var;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 351608024:
/* 756 */                                           if (str2.equals("version")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 758 */                                           uy0 uy0Var119 = vy0.Companion;
/* 760 */                                           if (numValueOf != null) {
/* 762 */                                               iIntValue10 = numValueOf.intValue();
                                                    } else {
/* 767 */                                               iIntValue10 = 0;
                                                    }
/* 768 */                                           uy0Var119.getClass();
/* 776 */                                           ql2Var.f15628g = (int) uy0.m9146a(iIntValue10, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 439958894:
/* 735 */                                           if (str2.equals("useNonStandardStacks")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 739 */                                           AbstractC0883ek.Companion.getClass();
/* 746 */                                           ql2Var.f15625d = strSubstring.equals("1");
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 501667126:
/* 702 */                                           if (str2.equals("purposeLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 704 */                                           ij0 ij0Var17 = jj0.Companion;
/* 706 */                                           if (numValueOf != null) {
/* 708 */                                               iIntValue11 = numValueOf.intValue();
                                                    } else {
/* 713 */                                               iIntValue11 = 0;
                                                    }
/* 714 */                                           Integer numValueOf111 = Integer.valueOf(iIntValue11);
/* 718 */                                           ij0Var17.getClass();
/* 725 */                                           ql2Var.f15640s = ij0.m4550a(numValueOf111, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 544050613:
/* 669 */                                           if (str2.equals("publisherConsents")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 671 */                                           ij0 ij0Var18 = jj0.Companion;
/* 673 */                                           if (numValueOf != null) {
/* 675 */                                               iIntValue12 = numValueOf.intValue();
                                                    } else {
/* 680 */                                               iIntValue12 = 0;
                                                    }
/* 681 */                                           Integer numValueOf112 = Integer.valueOf(iIntValue12);
/* 685 */                                           ij0Var18.getClass();
/* 692 */                                           ql2Var.f15641t = ij0.m4550a(numValueOf112, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 568283376:
/* 648 */                                           if (str2.equals("purposeOneTreatment")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 652 */                                           AbstractC0883ek.Companion.getClass();
/* 659 */                                           ql2Var.f15626e = strSubstring.equals("1");
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 680983954:
/* 619 */                                           if (str2.equals("consentLanguage")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 621 */                                           c51 c51Var6 = d51.Companion;
/* 623 */                                           if (numValueOf != null) {
/* 625 */                                               iIntValue13 = numValueOf.intValue();
                                                    } else {
/* 630 */                                               iIntValue13 = 0;
                                                    }
/* 631 */                                           c51Var6.getClass();
/* 638 */                                           ql2Var.f15631j = c51.m1532a(iIntValue13, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1000364236:
/* 598 */                                           if (str2.equals("vendorLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 602 */                                           e23.Companion.getClass();
/* 609 */                                           ql2Var.f15647z = d23.m2911a(strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1028554472:
/* 546 */                                           if (str2.equals("created")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 548 */                                           c50 c50Var5 = d50.Companion;
/* 550 */                                           if (numValueOf != null) {
/* 552 */                                               iIntValue14 = numValueOf.intValue();
                                                    } else {
/* 557 */                                               iIntValue14 = 0;
                                                    }
/* 558 */                                           c50Var5.getClass();
/* 565 */                                           if (iIntValue14 == strSubstring.length()) {
/* 591 */                                               throw new C0900f0("Invalid bit length", i11);
                                                    }
/* 569 */                                           vy0.Companion.getClass();
/* 582 */                                           ql2Var.f15636o = Long.valueOf(uy0.m9146a(iIntValue14, strSubstring) * 100);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1272166759:
/* 513 */                                           if (str2.equals("publisherCustomLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 515 */                                           ij0 ij0Var19 = jj0.Companion;
/* 517 */                                           if (numValueOf != null) {
/* 519 */                                               iIntValue15 = numValueOf.intValue();
                                                    } else {
/* 524 */                                               iIntValue15 = 0;
                                                    }
/* 525 */                                           Integer numValueOf113 = Integer.valueOf(iIntValue15);
/* 529 */                                           ij0Var19.getClass();
/* 536 */                                           ql2Var.f15644w = ij0.m4550a(numValueOf113, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1401591704:
/* 480 */                                           if (str2.equals("publisherLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 482 */                                           ij0 ij0Var110 = jj0.Companion;
/* 484 */                                           if (numValueOf != null) {
/* 486 */                                               iIntValue16 = numValueOf.intValue();
                                                    } else {
/* 491 */                                               iIntValue16 = 0;
                                                    }
/* 492 */                                           Integer numValueOf114 = Integer.valueOf(iIntValue16);
/* 496 */                                           ij0Var110.getClass();
/* 503 */                                           ql2Var.f15642u = ij0.m4550a(numValueOf114, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1649733957:
/* 428 */                                           if (str2.equals("lastUpdated")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 430 */                                           c50 c50Var6 = d50.Companion;
/* 432 */                                           if (numValueOf != null) {
/* 434 */                                               iIntValue17 = numValueOf.intValue();
                                                    } else {
/* 439 */                                               iIntValue17 = 0;
                                                    }
/* 440 */                                           c50Var6.getClass();
/* 447 */                                           if (iIntValue17 == strSubstring.length()) {
/* 473 */                                               throw new C0900f0("Invalid bit length", i11);
                                                    }
/* 451 */                                           vy0.Companion.getClass();
/* 464 */                                           ql2Var.f15637p = Long.valueOf(uy0.m9146a(iIntValue17, strSubstring) * 100);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1722227698:
/* 393 */                                           if (str2.equals("vendorListVersion")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 395 */                                           uy0 uy0Var1110 = vy0.Companion;
/* 397 */                                           if (numValueOf != null) {
/* 399 */                                               iIntValue18 = numValueOf.intValue();
                                                    } else {
/* 404 */                                               iIntValue18 = 0;
                                                    }
/* 405 */                                           uy0Var1110.getClass();
/* 418 */                                           ql2Var.m7950h(new uh2((int) uy0.m9146a(iIntValue18, strSubstring)));
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1886388920:
/* 361 */                                           if (str2.equals("specialFeatureOptins")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 363 */                                           ij0 ij0Var111 = jj0.Companion;
/* 365 */                                           if (numValueOf != null) {
/* 367 */                                               iIntValue19 = numValueOf.intValue();
                                                    } else {
/* 372 */                                               iIntValue19 = 0;
                                                    }
/* 373 */                                           Integer numValueOf115 = Integer.valueOf(iIntValue19);
/* 377 */                                           ij0Var111.getClass();
/* 384 */                                           ql2Var.f15638q = ij0.m4550a(numValueOf115, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1982848911:
/* 341 */                                           if (str2.equals("vendorsDisclosed")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 345 */                                           e23.Companion.getClass();
/* 352 */                                           ql2Var.f15619A = d23.m2911a(strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1995874045:
/* 309 */                                           if (str2.equals(str6)) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 313 */                                           e23.Companion.getClass();
/* 320 */                                           ql2Var.f15620B = d23.m2911a(strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                default:
/* 302 */                                           i3 = i11;
/* 1548 */                                          throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                            }
                                        } else {
/* 1549 */                                  listSplit$default = listSplit$default;
/* 1551 */                                  size = size;
/* 1553 */                                  str6 = str6;
/* 1554 */                                  i = i14;
/* 1556 */                                  str3 = strM10353a2;
/* 1558 */                                  it2 = it;
                                        }
/* 1562 */                              str6 = str6;
/* 1563 */                              i14 = i;
/* 1565 */                              listSplit$default = listSplit$default;
/* 1567 */                              size = size;
/* 1569 */                              strM10353a2 = str3;
/* 1571 */                              it = it2;
/* 1573 */                              i11 = 2;
                                    }
                                    break;
                                }
                                break;
                            case 1995874045:
/* 166 */                       if (!str5.equals("vendorsAllowed")) {
/* 1609 */                          throw new Throwable("Invalid Value for Segment Type: ".concat(str5));
                                }
/* 168 */                       t82Var = t82.VENDORS_ALLOWED;
/* 201 */                       list = (List) map.get(t82Var);
/* 203 */                       if (list != null) {
/* 1594 */                          f42.m3656l("Unable to find fieldSequence");
/* 153 */                           return null;
                                }
/* 205 */                       it = list.iterator();
                                while (true) {
/* 213 */                           if (it.hasNext()) {
/* 1584 */                              i14++;
/* 1586 */                              ql2Var2 = ql2Var;
/* 1587 */                              i11 = 2;
/* 1588 */                              i12 = 0;
/* 1589 */                              i13 = 6;
                                    } else {
/* 219 */                               str2 = (String) it.next();
/* 223 */                               EnumC2146rj.Companion.getClass();
/* 226 */                               enumC2146rjM7866a = C2109qj.m7866a(str2);
/* 230 */                               if (enumC2146rjM7866a != null) {
/* 234 */                                   numValueOf = Integer.valueOf(enumC2146rjM7866a.f16116a);
                                        } else {
/* 239 */                                   numValueOf = null;
                                        }
/* 241 */                               if (numValueOf == null) {
/* 245 */                                   v82.Companion.getClass();
/* 252 */                                   if (u82.m8973a(str2)) {
/* 260 */                                       numValueOf = Integer.valueOf(ql2Var.m7944b().f17529a);
                                            }
                                        }
/* 264 */                               if (numValueOf == null) {
/* 273 */                                   if (numValueOf == null) {
/* 275 */                                       iIntValue = strM10353a2.length();
                                            } else {
/* 284 */                                       iIntValue = numValueOf.intValue() + iIntValue20;
                                            }
/* 285 */                                   strSubstring = strM10353a2.substring(iIntValue20, iIntValue);
                                            switch (str2.hashCode()) {
                                                case -2115730175:
/* 1459 */                                          i = i14;
/* 1461 */                                          str3 = strM10353a2;
/* 1463 */                                          it2 = it;
/* 1465 */                                          i2 = iIntValue20;
/* 1473 */                                          if (str2.equals("vendorConsents")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1477 */                                          e23.Companion.getClass();
/* 1484 */                                          ql2Var.f15646y = d23.m2911a(strSubstring);
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -2076485454:
/* 1411 */                                          i = i14;
/* 1413 */                                          str3 = strM10353a2;
/* 1415 */                                          it2 = it;
/* 1417 */                                          i2 = iIntValue20;
/* 1425 */                                          if (str2.equals("cmpVersion")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1427 */                                          uy0 uy0Var1111 = vy0.Companion;
/* 1429 */                                          if (numValueOf != null) {
/* 1431 */                                              iIntValue2 = numValueOf.intValue();
                                                    } else {
/* 1436 */                                              iIntValue2 = 0;
                                                    }
/* 1437 */                                          uy0Var1111.getClass();
/* 1450 */                                          ql2Var.m7946d(new uh2((int) uy0.m9146a(iIntValue2, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -2014745908:
/* 1356 */                                          i = i14;
/* 1358 */                                          str3 = strM10353a2;
/* 1360 */                                          it2 = it;
/* 1362 */                                          i2 = iIntValue20;
/* 1370 */                                          if (str2.equals("numCustomPurposes")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1372 */                                          uy0 uy0Var1112 = vy0.Companion;
/* 1374 */                                          if (numValueOf != null) {
/* 1376 */                                              iIntValue3 = numValueOf.intValue();
                                                    } else {
/* 1381 */                                              iIntValue3 = 0;
                                                    }
/* 1382 */                                          uy0Var1112.getClass();
/* 1391 */                                          iM9146a = (int) uy0.m9146a(iIntValue3, strSubstring);
/* 1392 */                                          uh2Var = new uh2(iM9146a);
/* 1395 */                                          if (iM9146a >= 0) {
/* 1405 */                                              throw new C0900f0("numCustomPurposes", uh2Var);
                                                    }
/* 1397 */                                          ql2Var.f15635n = iM9146a;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -1710804154:
/* 1307 */                                          i = i14;
/* 1309 */                                          str3 = strM10353a2;
/* 1311 */                                          it2 = it;
/* 1313 */                                          i2 = iIntValue20;
/* 1321 */                                          if (str2.equals("policyVersion")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1323 */                                          uy0 uy0Var1113 = vy0.Companion;
/* 1325 */                                          if (numValueOf != null) {
/* 1327 */                                              iIntValue4 = numValueOf.intValue();
                                                    } else {
/* 1332 */                                              iIntValue4 = 0;
                                                    }
/* 1333 */                                          uy0Var1113.getClass();
/* 1346 */                                          ql2Var.m7948f(new uh2((int) uy0.m9146a(iIntValue4, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -879778089:
/* 1261 */                                          i = i14;
/* 1263 */                                          str3 = strM10353a2;
/* 1265 */                                          it2 = it;
/* 1267 */                                          i2 = iIntValue20;
/* 1275 */                                          if (str2.equals("purposeConsents")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1277 */                                          ij0 ij0Var112 = jj0.Companion;
/* 1279 */                                          if (numValueOf != null) {
/* 1281 */                                              iIntValue5 = numValueOf.intValue();
                                                    } else {
/* 1286 */                                              iIntValue5 = 0;
                                                    }
/* 1287 */                                          Integer numValueOf116 = Integer.valueOf(iIntValue5);
/* 1291 */                                          ij0Var112.getClass();
/* 1298 */                                          ql2Var.f15639r = ij0.m4550a(numValueOf116, strSubstring);
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -740692217:
/* 1218 */                                          i = i14;
/* 1220 */                                          str3 = strM10353a2;
/* 1222 */                                          it2 = it;
/* 1224 */                                          i2 = iIntValue20;
/* 1232 */                                          if (str2.equals("publisherCountryCode")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1234 */                                          c51 c51Var7 = d51.Companion;
/* 1236 */                                          if (numValueOf != null) {
/* 1238 */                                              iIntValue6 = numValueOf.intValue();
                                                    } else {
/* 1243 */                                              iIntValue6 = 0;
                                                    }
/* 1244 */                                          c51Var7.getClass();
/* 1251 */                                          ql2Var.m7949g(c51.m1532a(iIntValue6, strSubstring));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -442009786:
/* 1172 */                                          i = i14;
/* 1174 */                                          str3 = strM10353a2;
/* 1176 */                                          it2 = it;
/* 1178 */                                          i2 = iIntValue20;
/* 1186 */                                          if (str2.equals("publisherCustomConsents")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1188 */                                          ij0 ij0Var113 = jj0.Companion;
/* 1190 */                                          if (numValueOf != null) {
/* 1192 */                                              iIntValue7 = numValueOf.intValue();
                                                    } else {
/* 1197 */                                              iIntValue7 = 0;
                                                    }
/* 1198 */                                          Integer numValueOf117 = Integer.valueOf(iIntValue7);
/* 1202 */                                          ij0Var113.getClass();
/* 1209 */                                          ql2Var.f15643v = ij0.m4550a(numValueOf117, strSubstring);
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -145526490:
/* 1123 */                                          i = i14;
/* 1125 */                                          str3 = strM10353a2;
/* 1127 */                                          it2 = it;
/* 1129 */                                          i2 = iIntValue20;
/* 1137 */                                          if (str2.equals("consentScreen")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1139 */                                          uy0 uy0Var1114 = vy0.Companion;
/* 1141 */                                          if (numValueOf != null) {
/* 1143 */                                              iIntValue8 = numValueOf.intValue();
                                                    } else {
/* 1148 */                                              iIntValue8 = 0;
                                                    }
/* 1149 */                                          uy0Var1114.getClass();
/* 1162 */                                          ql2Var.m7947e(new uh2((int) uy0.m9146a(iIntValue8, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case -117505923:
/* 1089 */                                          i = i14;
/* 1091 */                                          str3 = strM10353a2;
/* 1093 */                                          it2 = it;
/* 1095 */                                          i2 = iIntValue20;
/* 1103 */                                          if (str2.equals("isServiceSpecific")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1107 */                                          AbstractC0883ek.Companion.getClass();
/* 1114 */                                          ql2Var.f15624c = strSubstring.equals("1");
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 94785793:
/* 1037 */                                          i = i14;
/* 1039 */                                          str3 = strM10353a2;
/* 1041 */                                          it2 = it;
/* 1043 */                                          i2 = iIntValue20;
/* 1051 */                                          if (str2.equals("cmpId")) {
/* 1081 */                                              i3 = 2;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 1053 */                                          uy0 uy0Var1115 = vy0.Companion;
/* 1055 */                                          if (numValueOf != null) {
/* 1057 */                                              iIntValue9 = numValueOf.intValue();
                                                    } else {
/* 1062 */                                              iIntValue9 = 0;
                                                    }
/* 1063 */                                          uy0Var1115.getClass();
/* 1076 */                                          ql2Var.m7945c(new uh2((int) uy0.m9146a(iIntValue9, strSubstring)));
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 204489283:
/* 786 */                                           if (str2.equals("publisherRestrictions")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 790 */                                           zz1.Companion.getClass();
/* 795 */                                           xz1Var = new xz1();
/* 798 */                                           uy0 uy0Var1116 = vy0.Companion;
/* 807 */                                           String strSubstring15 = strSubstring.substring(0, 12);
/* 811 */                                           uy0Var1116.getClass();
/* 819 */                                           iM9146a2 = (int) uy0.m9146a(12, strSubstring15);
/* 820 */                                           i4 = 0;
/* 821 */                                           i5 = 12;
/* 822 */                                           while (i4 < iM9146a2) {
/* 824 */                                               uy0 uy0Var1117 = vy0.Companion;
/* 826 */                                               C2109qj c2109qj8 = EnumC2146rj.Companion;
/* 828 */                                               int i1110 = i5 + 6;
/* 830 */                                               int i1111 = iM9146a2;
/* 832 */                                               String strSubstring16 = strSubstring.substring(i5, i1110);
/* 836 */                                               uy0Var1117.getClass();
/* 839 */                                               int i1112 = i4;
/* 841 */                                               int i1113 = i14;
/* 843 */                                               String str10 = strM10353a2;
/* 850 */                                               int iM9146a12 = (int) uy0.m9146a(6, strSubstring16);
/* 851 */                                               int i1114 = i5 + 8;
/* 864 */                                               int iM9146a13 = (int) uy0.m9146a(2, strSubstring.substring(i1110, i1114));
/* 867 */                                               Integer numValueOf118 = Integer.valueOf(iM9146a12);
/* 873 */                                               l42.Companion.getClass();
/* 880 */                                               wz1Var = new wz1(numValueOf118, k42.m5948a(iM9146a13));
/* 883 */                                               i5 += 20;
/* 897 */                                               iM9146a3 = (int) uy0.m9146a(12, strSubstring.substring(i1114, i5));
/* 898 */                                               i6 = 0;
/* 899 */                                               while (i6 < iM9146a3) {
/* 901 */                                                   C0847dk c0847dk4 = AbstractC0883ek.Companion;
/* 903 */                                                   C2109qj c2109qj9 = EnumC2146rj.Companion;
/* 905 */                                                   int i29 = i5 + 1;
/* 907 */                                                   int i210 = iM9146a3;
/* 909 */                                                   String strSubstring17 = strSubstring.substring(i5, i29);
/* 913 */                                                   c0847dk4.getClass();
/* 916 */                                                   zEquals = strSubstring17.equals("1");
/* 920 */                                                   uy0 uy0Var1118 = vy0.Companion;
/* 922 */                                                   i7 = i5;
/* 924 */                                                   i5 = i7 + 17;
/* 926 */                                                   String strSubstring18 = strSubstring.substring(i29, i5);
/* 930 */                                                   uy0Var1118.getClass();
/* 935 */                                                   Iterator it6 = it;
/* 937 */                                                   int i211 = iIntValue20;
/* 943 */                                                   iM9146a4 = (int) uy0.m9146a(16, strSubstring18);
/* 944 */                                                   if (zEquals) {
/* 946 */                                                       i8 = i7 + 33;
/* 956 */                                                       iM9146a5 = (int) uy0.m9146a(16, strSubstring.substring(i5, i8));
/* 957 */                                                       if (iM9146a5 >= iM9146a4) {
/* 985 */                                                           throw new C0900f0(AbstractC0886en.m3506j("Invalid RangeEntry: endVendorId ", iM9146a5, iM9146a4, " is less than "), 2);
                                                                }
/* 959 */                                                       if (iM9146a4 <= iM9146a5) {
                                                                    while (true) {
/* 961 */                                                               xz1Var.m10049a(iM9146a4, wz1Var);
/* 964 */                                                               if (iM9146a4 != iM9146a5) {
/* 966 */                                                                   iM9146a4++;
                                                                        }
                                                                    }
                                                                }
/* 969 */                                                       i5 = i8;
                                                            } else {
/* 986 */                                                       xz1Var.m10049a(iM9146a4, wz1Var);
                                                            }
/* 989 */                                                   i6++;
/* 991 */                                                   iM9146a3 = i210;
/* 993 */                                                   it = it6;
/* 995 */                                                   iIntValue20 = i211;
                                                        }
/* 1006 */                                              i4 = i1112 + 1;
/* 1008 */                                              i14 = i1113;
/* 1010 */                                              iM9146a2 = i1111;
/* 1012 */                                              strM10353a2 = str10;
                                                    }
/* 1018 */                                          i = i14;
/* 1020 */                                          str3 = strM10353a2;
/* 1022 */                                          it2 = it;
/* 1024 */                                          i2 = iIntValue20;
/* 1026 */                                          xz1Var.f19422a = i5;
/* 1028 */                                          ql2Var.f15621C = xz1Var;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 351608024:
/* 756 */                                           if (str2.equals("version")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 758 */                                           uy0 uy0Var1119 = vy0.Companion;
/* 760 */                                           if (numValueOf != null) {
/* 762 */                                               iIntValue10 = numValueOf.intValue();
                                                    } else {
/* 767 */                                               iIntValue10 = 0;
                                                    }
/* 768 */                                           uy0Var1119.getClass();
/* 776 */                                           ql2Var.f15628g = (int) uy0.m9146a(iIntValue10, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 439958894:
/* 735 */                                           if (str2.equals("useNonStandardStacks")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 739 */                                           AbstractC0883ek.Companion.getClass();
/* 746 */                                           ql2Var.f15625d = strSubstring.equals("1");
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 501667126:
/* 702 */                                           if (str2.equals("purposeLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 704 */                                           ij0 ij0Var114 = jj0.Companion;
/* 706 */                                           if (numValueOf != null) {
/* 708 */                                               iIntValue11 = numValueOf.intValue();
                                                    } else {
/* 713 */                                               iIntValue11 = 0;
                                                    }
/* 714 */                                           Integer numValueOf119 = Integer.valueOf(iIntValue11);
/* 718 */                                           ij0Var114.getClass();
/* 725 */                                           ql2Var.f15640s = ij0.m4550a(numValueOf119, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 544050613:
/* 669 */                                           if (str2.equals("publisherConsents")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 671 */                                           ij0 ij0Var115 = jj0.Companion;
/* 673 */                                           if (numValueOf != null) {
/* 675 */                                               iIntValue12 = numValueOf.intValue();
                                                    } else {
/* 680 */                                               iIntValue12 = 0;
                                                    }
/* 681 */                                           Integer numValueOf1110 = Integer.valueOf(iIntValue12);
/* 685 */                                           ij0Var115.getClass();
/* 692 */                                           ql2Var.f15641t = ij0.m4550a(numValueOf1110, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 568283376:
/* 648 */                                           if (str2.equals("purposeOneTreatment")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 652 */                                           AbstractC0883ek.Companion.getClass();
/* 659 */                                           ql2Var.f15626e = strSubstring.equals("1");
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 680983954:
/* 619 */                                           if (str2.equals("consentLanguage")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 621 */                                           c51 c51Var8 = d51.Companion;
/* 623 */                                           if (numValueOf != null) {
/* 625 */                                               iIntValue13 = numValueOf.intValue();
                                                    } else {
/* 630 */                                               iIntValue13 = 0;
                                                    }
/* 631 */                                           c51Var8.getClass();
/* 638 */                                           ql2Var.f15631j = c51.m1532a(iIntValue13, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1000364236:
/* 598 */                                           if (str2.equals("vendorLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 602 */                                           e23.Companion.getClass();
/* 609 */                                           ql2Var.f15647z = d23.m2911a(strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1028554472:
/* 546 */                                           if (str2.equals("created")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 548 */                                           c50 c50Var7 = d50.Companion;
/* 550 */                                           if (numValueOf != null) {
/* 552 */                                               iIntValue14 = numValueOf.intValue();
                                                    } else {
/* 557 */                                               iIntValue14 = 0;
                                                    }
/* 558 */                                           c50Var7.getClass();
/* 565 */                                           if (iIntValue14 == strSubstring.length()) {
/* 591 */                                               throw new C0900f0("Invalid bit length", i11);
                                                    }
/* 569 */                                           vy0.Companion.getClass();
/* 582 */                                           ql2Var.f15636o = Long.valueOf(uy0.m9146a(iIntValue14, strSubstring) * 100);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1272166759:
/* 513 */                                           if (str2.equals("publisherCustomLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 515 */                                           ij0 ij0Var116 = jj0.Companion;
/* 517 */                                           if (numValueOf != null) {
/* 519 */                                               iIntValue15 = numValueOf.intValue();
                                                    } else {
/* 524 */                                               iIntValue15 = 0;
                                                    }
/* 525 */                                           Integer numValueOf1111 = Integer.valueOf(iIntValue15);
/* 529 */                                           ij0Var116.getClass();
/* 536 */                                           ql2Var.f15644w = ij0.m4550a(numValueOf1111, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1401591704:
/* 480 */                                           if (str2.equals("publisherLegitimateInterests")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 482 */                                           ij0 ij0Var117 = jj0.Companion;
/* 484 */                                           if (numValueOf != null) {
/* 486 */                                               iIntValue16 = numValueOf.intValue();
                                                    } else {
/* 491 */                                               iIntValue16 = 0;
                                                    }
/* 492 */                                           Integer numValueOf1112 = Integer.valueOf(iIntValue16);
/* 496 */                                           ij0Var117.getClass();
/* 503 */                                           ql2Var.f15642u = ij0.m4550a(numValueOf1112, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1649733957:
/* 428 */                                           if (str2.equals("lastUpdated")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 430 */                                           c50 c50Var8 = d50.Companion;
/* 432 */                                           if (numValueOf != null) {
/* 434 */                                               iIntValue17 = numValueOf.intValue();
                                                    } else {
/* 439 */                                               iIntValue17 = 0;
                                                    }
/* 440 */                                           c50Var8.getClass();
/* 447 */                                           if (iIntValue17 == strSubstring.length()) {
/* 473 */                                               throw new C0900f0("Invalid bit length", i11);
                                                    }
/* 451 */                                           vy0.Companion.getClass();
/* 464 */                                           ql2Var.f15637p = Long.valueOf(uy0.m9146a(iIntValue17, strSubstring) * 100);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1722227698:
/* 393 */                                           if (str2.equals("vendorListVersion")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 395 */                                           uy0 uy0Var11110 = vy0.Companion;
/* 397 */                                           if (numValueOf != null) {
/* 399 */                                               iIntValue18 = numValueOf.intValue();
                                                    } else {
/* 404 */                                               iIntValue18 = 0;
                                                    }
/* 405 */                                           uy0Var11110.getClass();
/* 418 */                                           ql2Var.m7950h(new uh2((int) uy0.m9146a(iIntValue18, strSubstring)));
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1886388920:
/* 361 */                                           if (str2.equals("specialFeatureOptins")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 363 */                                           ij0 ij0Var118 = jj0.Companion;
/* 365 */                                           if (numValueOf != null) {
/* 367 */                                               iIntValue19 = numValueOf.intValue();
                                                    } else {
/* 372 */                                               iIntValue19 = 0;
                                                    }
/* 373 */                                           Integer numValueOf1113 = Integer.valueOf(iIntValue19);
/* 377 */                                           ij0Var118.getClass();
/* 384 */                                           ql2Var.f15638q = ij0.m4550a(numValueOf1113, strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1982848911:
/* 341 */                                           if (str2.equals("vendorsDisclosed")) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 345 */                                           e23.Companion.getClass();
/* 352 */                                           ql2Var.f15619A = d23.m2911a(strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                case 1995874045:
/* 309 */                                           if (str2.equals(str6)) {
/* 302 */                                               i3 = i11;
/* 1548 */                                              throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                                    }
/* 313 */                                           e23.Companion.getClass();
/* 320 */                                           ql2Var.f15620B = d23.m2911a(strSubstring);
/* 327 */                                           i = i14;
/* 329 */                                           str3 = strM10353a2;
/* 331 */                                           it2 = it;
/* 333 */                                           i2 = iIntValue20;
/* 1486 */                                          if (numValueOf != null) {
/* 1496 */                                              b40VarM7943a = ql2Var.m7943a(str2);
/* 1502 */                                              if (b40VarM7943a instanceof xl2) {
/* 1508 */                                                  i9 = ((xl2) b40VarM7943a).f19245g.f17330a;
                                                        } else {
/* 1513 */                                                  if (b40VarM7943a instanceof ul2) {
/* 1536 */                                                      throw new C0900f0("Unable to increase bitLength for key: ".concat(str2), 2);
                                                            }
/* 1519 */                                                  i9 = ((ul2) b40VarM7943a).f17589g.f19422a;
                                                        }
/* 1521 */                                              iIntValue20 = i2 + i9;
                                                    } else {
/* 1492 */                                              iIntValue20 = numValueOf.intValue() + i2;
                                                    }
                                                    break;
                                                    break;
                                                default:
/* 302 */                                           i3 = i11;
/* 1548 */                                          throw new C0900f0("Unable to set decoded version of the key: ".concat(str2), i3);
                                            }
                                        } else {
/* 1549 */                                  listSplit$default = listSplit$default;
/* 1551 */                                  size = size;
/* 1553 */                                  str6 = str6;
/* 1554 */                                  i = i14;
/* 1556 */                                  str3 = strM10353a2;
/* 1558 */                                  it2 = it;
                                        }
/* 1562 */                              str6 = str6;
/* 1563 */                              i14 = i;
/* 1565 */                              listSplit$default = listSplit$default;
/* 1567 */                              size = size;
/* 1569 */                              strM10353a2 = str3;
/* 1571 */                              it = it2;
/* 1573 */                              i11 = 2;
                                    }
                                    break;
                                }
                                break;
                            default:
/* 1609 */                      throw new Throwable("Invalid Value for Segment Type: ".concat(str5));
                        }
                    }
                }
            }
