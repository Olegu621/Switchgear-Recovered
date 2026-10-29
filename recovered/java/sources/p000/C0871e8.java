            package p000;

            import android.util.Size;
            import com.usercentrics.sdk.UsercentricsServiceConsent;
            import com.usercentrics.sdk.mediation.data.ConsentApplied;
            import com.usercentrics.sdk.mediation.data.MediationResultPayload;
            import com.usercentrics.sdk.p009v2.settings.data.CCPASettings;
            import java.net.HttpURLConnection;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Set;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: e8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class C0871e8 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7567a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f7568b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f7569c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f7570d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C0871e8(Object obj, Object obj2, Object obj3, c10 c10Var, int i) {
/* 10 */            super(2, c10Var);
/* 1 */             this.f7567a = i;
/* 3 */             this.f7568b = obj;
/* 5 */             this.f7569c = obj2;
/* 7 */             this.f7570d = obj3;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f7567a;
/* 3 */             Object obj2 = this.f7570d;
/* 5 */             Object obj3 = this.f7569c;
                    switch (i) {
                        case 0:
/* 58 */                    return new C0871e8((wu0) this.f7568b, (C0945g8) obj3, (HttpURLConnection) obj2, c10Var, 0);
                        case 1:
/* 36 */                    C0871e8 c0871e8 = new C0871e8((fj1) obj3, (wb2) obj2, c10Var);
/* 39 */                    c0871e8.f7568b = obj;
/* 41 */                    return c0871e8;
                        default:
/* 25 */                    return new C0871e8((a13) this.f7568b, (ArrayList) obj3, (tk2) obj2, c10Var, 2);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f7567a) {
                        case 0:
/* 52 */                    return ((C0871e8) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 1:
/* 35 */                    return ((C0871e8) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        default:
/* 18 */                    return ((C0871e8) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                    }
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    float height;
                    int height2;
                    int i;
                    int i2;
                    byte[] bArr;
                    kt0 kt0Var;
                    C1929mj c1929mj;
                    wc0 wc0VarM13a;
                    int i3;
                    g42 g42Var;
                    Boolean boolValueOf;
                    Boolean bool;
                    LinkedHashMap linkedHashMap;
                    String strM3785k;
                    C2521z3 c2521z3;
                    switch (this.f7567a) {
                        case 0:
/* 1636 */                  z10 z10Var = z10.f19902a;
/* 1638 */                  pg3.m7417A(obj);
/* 1643 */                  wu0 wu0Var = (wu0) this.f7568b;
/* 1647 */                  C0945g8 c0945g8 = (C0945g8) this.f7569c;
/* 1651 */                  HttpURLConnection httpURLConnection = (HttpURLConnection) this.f7570d;
/* 1653 */                  c0945g8.getClass();
/* 1660 */                  wu0Var.invoke(C0945g8.m3885d(httpURLConnection));
/* 1663 */                  return Unit.f12910a;
                        case 1:
/* 1016 */                  z10 z10Var2 = z10.f19902a;
/* 1018 */                  pg3.m7417A(obj);
/* 1024 */                  y10 y10Var = (y10) this.f7568b;
/* 1030 */                  y61 y61Var = ((fj1) this.f7569c).f8242v;
/* 1054 */                  boolean z = ((y61Var == null || (g42Var = y61Var.f19506c.f15695a0) == null) ? 0 : g42Var.f334a.mo309a()) % 180 == 0;
/* 1057 */                  wb2 wb2Var = (wb2) this.f7570d;
/* 1075 */                  Size size = new Size(z ? wb2Var.f18569f : wb2Var.f18570i, z ? wb2Var.f18570i : wb2Var.f18569f);
/* 1080 */                  fj1 fj1Var = (fj1) this.f7569c;
/* 1082 */                  Size size2 = fj1Var.f8230X;
/* 1084 */                  Size size3 = fj1Var.f8231Y;
/* 1086 */                  if (size2 == null) {
/* 1098 */                      size2 = new Size(size.getWidth(), size.getHeight());
                            }
/* 1101 */                  if (size3 == null) {
/* 1103 */                      size3 = size2;
                            }
/* 1128 */                  if (size2.getWidth() / size2.getHeight() > size.getWidth() / size.getHeight()) {
/* 1130 */                      height = size.getWidth();
/* 1135 */                      height2 = size2.getWidth();
                            } else {
/* 1142 */                      height = size.getHeight();
/* 1147 */                      height2 = size2.getHeight();
                            }
/* 1140 */                  float f = height / height2;
/* 1158 */                  int width = (int) (size3.getWidth() * f);
/* 1159 */                  int width2 = size.getWidth();
/* 1163 */                  if (width > width2) {
/* 1165 */                      width = width2;
                            }
/* 1166 */                  Integer numValueOf = Integer.valueOf(width);
/* 1176 */                  int height3 = (int) (size3.getHeight() * f);
/* 1177 */                  int height4 = size.getHeight();
/* 1181 */                  if (height3 > height4) {
/* 1183 */                      height3 = height4;
                            }
/* 1184 */                  Integer numValueOf2 = Integer.valueOf(height3);
/* 1188 */                  int iIntValue = numValueOf.intValue();
/* 1192 */                  int iIntValue2 = numValueOf2.intValue();
/* 1198 */                  wb2 wb2Var2 = (wb2) this.f7570d;
/* 1200 */                  int i4 = wb2Var2.f18569f;
/* 1202 */                  int i5 = wb2Var2.f18570i;
/* 1204 */                  int iMin = Math.min(iIntValue, i4);
/* 1208 */                  int iMin2 = Math.min(iIntValue2, i5);
/* 1217 */                  int iMax = Math.max(0, (i4 - iMin) / 2);
/* 1224 */                  int iMax2 = Math.max(0, (i5 - iMin2) / 2);
/* 1238 */                  int iMin3 = Math.min(i4, iMin + iMax) - iMax;
/* 1240 */                  int iMin4 = Math.min(i5, iMin2 + iMax2) - iMax2;
/* 1248 */                  lw0[] lw0VarArrMo1726j = ((wb2) this.f7570d).f2998b.mo1726j();
/* 1252 */                  lw0VarArrMo1726j.getClass();
/* 1255 */                  int i6 = i4 * i5;
/* 1261 */                  byte[] bArr2 = new byte[((i6 / 4) * 2) + i6];
/* 1266 */                  ByteBuffer buffer = lw0VarArrMo1726j[0].getBuffer();
/* 1270 */                  buffer.getClass();
/* 1277 */                  ByteBuffer buffer2 = lw0VarArrMo1726j[1].getBuffer();
/* 1281 */                  buffer2.getClass();
/* 1286 */                  ByteBuffer buffer3 = lw0VarArrMo1726j[2].getBuffer();
/* 1290 */                  buffer3.getClass();
/* 1295 */                  int iMo3991b = lw0VarArrMo1726j[0].mo3991b();
/* 1301 */                  int iMo3991b2 = lw0VarArrMo1726j[1].mo3991b();
/* 1307 */                  int iMo3997j = lw0VarArrMo1726j[1].mo3997j();
/* 1311 */                  if (iMo3991b == i4) {
/* 1313 */                      buffer.get(bArr2, 0, i6);
/* 1316 */                      i = i6;
/* 1320 */                      i2 = i;
                            } else {
/* 1323 */                      i = i6;
/* 1327 */                      int i7 = 0;
/* 1329 */                      i2 = 0;
/* 1330 */                      for (int i8 = 0; i8 < i5; i8++) {
/* 1332 */                          buffer.position(i7);
/* 1335 */                          buffer.get(bArr2, i2, i4);
/* 1338 */                          i2 += i4;
/* 1339 */                          i7 += iMo3991b;
                                }
                            }
/* 1343 */                  int i9 = i5 / 2;
/* 1345 */                  int i10 = i4 / 2;
/* 1348 */                  if (iMo3997j != 2 || buffer2.remaining() < (i3 = i10 * i9) || buffer3.remaining() < i3) {
/* 1419 */                      bArr = bArr2;
/* 1423 */                      qj3.m7881N(buffer2, iMo3991b2, iMo3997j, i10, i9, bArr, i + 1);
/* 1430 */                      qj3.m7881N(buffer3, iMo3991b2, iMo3997j, i10, i9, bArr, i);
                            } else {
/* 1364 */                      int i11 = 0;
/* 1365 */                      while (i11 < i9) {
/* 1367 */                          int i12 = i11 * iMo3991b2;
/* 1369 */                          int i13 = i2;
/* 1371 */                          int i14 = 0;
/* 1372 */                          while (i14 < i10) {
/* 1376 */                              int i15 = iMo3997j;
/* 1378 */                              int i16 = (i14 * iMo3997j) + i12;
/* 1380 */                              int i17 = i13 + 1;
/* 1386 */                              bArr2[i13] = buffer3.get(i16);
/* 1388 */                              i13 += 2;
/* 1394 */                              bArr2[i17] = buffer2.get(i16);
/* 1396 */                              i14++;
/* 1398 */                              iMo3997j = i15;
                                    }
/* 1403 */                          i11++;
/* 1405 */                          i2 = i13;
                                }
/* 1408 */                      bArr = bArr2;
                            }
/* 1439 */                  cs1 cs1Var = new cs1(bArr, i4, i5, iMax, iMax2, iMin3, iMin4);
                            try {
                                try {
/* 1448 */                          ((fj1) this.f7569c).f8229W.getClass();
                                    try {
/* 1469 */                              wc0VarM13a = ((fj1) this.f7569c).f8229W.m13a(new C0210cb(new ra2(cs1Var), 10));
                                    } catch (un1 unused) {
/* 1502 */                              wc0VarM13a = ((fj1) this.f7569c).f8229W.m13a(new C0210cb(new ra2(new sz0(cs1Var)), 10));
                                    }
/* 1508 */                          String str = (String) wc0VarM13a.f18577b;
/* 1510 */                          str.getClass();
/* 1517 */                          if (str.length() > 0) {
/* 1524 */                              ((fj1) this.f7569c).f8232Z = false;
/* 1526 */                              m60 m60Var = z80.f19975a;
/* 1542 */                              i13.m4443w(y10Var, gb1.f8531a, new C2107qh((fj1) this.f7569c, str, null, 6), 2);
                                    }
/* 1545 */                          m60 m60Var2 = z80.f19975a;
/* 1547 */                          kt0Var = gb1.f8531a;
/* 1557 */                          c1929mj = new C1929mj((wb2) this.f7570d, null, 4);
                                } catch (Throwable th) {
/* 1616 */                          m60 m60Var3 = z80.f19975a;
/* 1632 */                          i13.m4443w(y10Var, gb1.f8531a, new C1929mj((wb2) this.f7570d, null, 4), 2);
/* 1635 */                          throw th;
                                }
                                break;
                            } catch (Exception e) {
/* 1567 */                      if (!(e instanceof un1) && !(e instanceof C2473xt) && !(e instanceof yl0)) {
/* 1577 */                          m60 m60Var4 = z80.f19975a;
/* 1594 */                          i13.m4443w(y10Var, gb1.f8531a, new C2107qh((fj1) this.f7569c, e, null, 8), 2);
                                }
/* 1597 */                      m60 m60Var5 = z80.f19975a;
/* 1599 */                      kt0Var = gb1.f8531a;
/* 1609 */                      c1929mj = new C1929mj((wb2) this.f7570d, null, 4);
                            }
/* 1561 */                  i13.m4443w(y10Var, kt0Var, c1929mj, 2);
/* 1613 */                  return Unit.f12910a;
                        default:
/* 10 */                    z10 z10Var3 = z10.f19902a;
/* 12 */                    pg3.m7417A(obj);
/* 19 */                    fb1 fb1Var = ((a13) this.f7568b).f30a;
/* 31 */                    CCPASettings cCPASettings = ((ac2) fb1Var.f8068F.getValue()).f182c.f12613d;
/* 39 */                    if (cCPASettings != null ? cCPASettings.f6381h : false) {
/* 53 */                        Boolean bool2 = ((C2508yr) fb1Var.f8071I.getValue()).m10171a().f6018c;
/* 63 */                        boolValueOf = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                            } else {
/* 68 */                        boolValueOf = null;
                            }
/* 71 */                    ArrayList<UsercentricsServiceConsent> arrayList = (ArrayList) this.f7569c;
/* 77 */                    int iM6962c = nc1.m6962c(C2122qw.m8020h(arrayList, 10));
/* 83 */                    if (iM6962c < 16) {
/* 85 */                        iM6962c = 16;
                            }
/* 88 */                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM6962c);
/* 99 */                    for (UsercentricsServiceConsent usercentricsServiceConsent : arrayList) {
/* 115 */                       linkedHashMap2.put(usercentricsServiceConsent.f6064a, Boolean.valueOf(usercentricsServiceConsent.f6065b));
                            }
/* 121 */                   tk2 tk2Var = (tk2) this.f7570d;
/* 131 */                   g13 g13Var = ((sx0) fb1Var.f8106t.getValue()).f16850l;
/* 133 */                   g13Var.getClass();
/* 142 */                   bg1 bg1Var = (bg1) fb1Var.f8085W.getValue();
/* 144 */                   bg1Var.getClass();
/* 147 */                   ac1 ac1Var = bg1Var.f2409a;
/* 151 */                   ArrayList<C2568zy> arrayList2 = new ArrayList();
/* 154 */                   Set setKeySet = linkedHashMap2.keySet();
/* 160 */                   C0875ec c0875ec = (C0875ec) ac1Var.f179d;
/* 164 */                   C0006a4 c0006a4 = (C0006a4) c0875ec.f7613b;
/* 166 */                   setKeySet.getClass();
/* 171 */                   String str2 = (String) c0875ec.f7615d;
/* 173 */                   boolean zContains = setKeySet.contains(str2);
/* 177 */                   if (tk2Var != null) {
/* 181 */                       ArrayList arrayList3 = new ArrayList();
/* 186 */                       LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 193 */                       Iterator it = ((List) ac1Var.f178c).iterator();
/* 201 */                       while (it.hasNext()) {
/* 211 */                           dg1 dg1Var = (dg1) it.next();
/* 213 */                           Integer numMo3062e = dg1Var.mo3062e();
/* 217 */                           Iterator it2 = it;
/* 219 */                           if (numMo3062e != null) {
/* 227 */                               uk2 uk2Var = (uk2) tk2Var.f17138c.get(numMo3062e);
/* 288 */                               cg1 cg1Var = uk2Var == null ? null : new cg1(tk2Var.f17136a, tk2Var.m8807a(uk2Var, 9, 10), tk2Var.m8807a(uk2Var, 1), tk2Var.m8807a(uk2Var, 1, 7), tk2Var.m8807a(uk2Var, 3, 4));
/* 293 */                               if (cg1Var != null) {
/* 325 */                                   arrayList3.add(new C2568zy(fm0.m3783i(dg1Var.mo3061d(), " (Granular Signal)"), dg1Var.mo3059b(cg1Var), null, null, cg1Var, 12));
/* 328 */                                   if (zContains && !linkedHashSet.contains(numMo3062e)) {
/* 380 */                                       arrayList3.add(new C2568zy(fm0.m3783i(dg1Var.mo3061d(), " (Adjust Signal)"), !((List) c0875ec.f7614c).contains(numMo3062e) ? false : c0006a4.m53I(cg1Var), null, null, cg1Var, 12));
/* 383 */                                       linkedHashSet.add(numMo3062e);
                                            }
                                        }
                                    } else {
/* 387 */                               boolValueOf = boolValueOf;
/* 389 */                               linkedHashMap2 = linkedHashMap2;
                                    }
/* 391 */                           it = it2;
/* 393 */                           boolValueOf = boolValueOf;
/* 395 */                           linkedHashMap2 = linkedHashMap2;
                                }
/* 401 */                       bool = boolValueOf;
/* 403 */                       linkedHashMap = linkedHashMap2;
/* 405 */                       arrayList2.addAll(arrayList3);
                            } else {
/* 409 */                       bool = boolValueOf;
/* 411 */                       linkedHashMap = linkedHashMap2;
                            }
/* 415 */                   ArrayList arrayList4 = new ArrayList();
/* 430 */                   for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 442 */                       String str3 = (String) entry.getKey();
/* 450 */                       boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
/* 468 */                       boolean z2 = bool == null ? zBooleanValue : zBooleanValue ? true : !bool.booleanValue();
/* 470 */                       if (zContains) {
/* 472 */                           str3.getClass();
/* 509 */                           if (C2085pw.m7566e("Jy6PlrM3", "weoN4Lb_MjWLuu", "ocv9HNX_g", "S1_9Vsuj-Q", "t-TPeXsRi", "QcD9GVNXZ", "tMLzMavbHZoxW0", "6-qobRfu", "Skj79NodobQ", "HJSPc4ids-Q", "gUbemZYaQwqxss").contains(str3)) {
/* 515 */                               if (str3.equals(str2)) {
/* 525 */                                   c2521z3 = new C2521z3("Adjust", c0006a4.m51G(z2));
                                        } else if (str3.equals("weoN4Lb_MjWLuu")) {
/* 548 */                                   c2521z3 = new C2521z3("AppleAds", c0006a4.m52H("apple_ads", z2));
                                        } else if (str3.equals("ocv9HNX_g")) {
/* 571 */                                   c2521z3 = new C2521z3("Facebook", c0006a4.m52H("facebook", z2));
                                        } else if (str3.equals("S1_9Vsuj-Q")) {
/* 594 */                                   c2521z3 = new C2521z3("GoogleAds", c0006a4.m52H("adwords", z2));
                                        } else if (str3.equals("t-TPeXsRi")) {
/* 617 */                                   c2521z3 = new C2521z3("GoogleMarketingPlatform", c0006a4.m52H("google_marketing_platform", z2));
                                        } else if (str3.equals("QcD9GVNXZ")) {
/* 640 */                                   c2521z3 = new C2521z3("Snapchat", c0006a4.m52H("snapchat", z2));
                                        } else if (str3.equals("tMLzMavbHZoxW0")) {
/* 663 */                                   c2521z3 = new C2521z3("Tencent", c0006a4.m52H("tencent", z2));
                                        } else if (str3.equals("6-qobRfu")) {
/* 685 */                                   c2521z3 = new C2521z3("TikTokSan", c0006a4.m52H("tiktok_san", z2));
                                        } else if (str3.equals("Skj79NodobQ")) {
/* 707 */                                   c2521z3 = new C2521z3("Twitter", c0006a4.m52H("twitter", z2));
                                        } else if (str3.equals("HJSPc4ids-Q")) {
/* 729 */                                   c2521z3 = new C2521z3("YahooGemini", c0006a4.m52H("yahoo_gemini", z2));
                                        } else {
/* 760 */                                   c2521z3 = str3.equals("gUbemZYaQwqxss") ? new C2521z3("YahooJapanSearch", c0006a4.m52H("yahoo_japan_search", z2)) : new C2521z3("UNKNOWN", false);
                                        }
/* 788 */                               arrayList4.add(new C2568zy(c2521z3.f19919a, c2521z3.f19920b, str3, Boolean.valueOf(z2), null, 16));
                                    }
                                }
/* 801 */                       dg1 dg1Var2 = (dg1) ((Map) ac1Var.f177b).get(str3);
/* 803 */                       if (dg1Var2 != null) {
/* 832 */                           arrayList4.add(new C2568zy(dg1Var2.mo3061d(), dg1Var2.mo3058a(z2, g13Var), str3, Boolean.valueOf(z2), null, 16));
                                }
                            }
/* 837 */                   arrayList2.addAll(arrayList4);
/* 840 */                   Iterator it3 = arrayList2.iterator();
                            while (true) {
/* 844 */                       boolean zHasNext = it3.hasNext();
/* 848 */                       String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 850 */                       if (!zHasNext) {
/* 963 */                           ArrayList arrayList5 = new ArrayList(C2122qw.m8020h(arrayList2, 10));
/* 974 */                           for (C2568zy c2568zy : arrayList2) {
/* 984 */                               String str5 = c2568zy.f20377a;
/* 986 */                               String str6 = c2568zy.f20379c;
/* 988 */                               if (str6 == null) {
/* 990 */                                   str6 = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
/* 991 */                               Boolean bool3 = c2568zy.f20380d;
/* 1006 */                              arrayList5.add(new ConsentApplied(str5, str6, bool3 != null ? bool3.booleanValue() : false, c2568zy.f20378b));
                                    }
/* 1012 */                          return new MediationResultPayload(arrayList5);
                                }
/* 856 */                       C2568zy c2568zy2 = (C2568zy) it3.next();
/* 858 */                       cg1 cg1Var2 = c2568zy2.f20381e;
/* 860 */                       String str7 = c2568zy2.f20377a;
/* 866 */                       boolean z3 = cg1Var2 != null;
/* 869 */                       if (!c2568zy2.f20378b) {
/* 871 */                           if (z3) {
/* 873 */                               str4 = "Granular";
                                    }
/* 881 */                           strM3785k = fm0.m3785k("[Mediation] ", str7, " - Unable to pass", str4, " consent. Please, report this issue to Usercentrics. https://usercentricssupport.zendesk.com/hc/en-us/requests/new");
                                } else if (z3) {
/* 906 */                           strM3785k = "[Mediation] Applied Granular Consent to " + str7 + " - " + cg1Var2;
                                } else {
/* 919 */                           String upperCase = String.valueOf(c2568zy2.f20380d).toUpperCase(Locale.ROOT);
/* 923 */                           upperCase.getClass();
/* 944 */                           strM3785k = "[Mediation] Applied " + str7 + " - Consent is " + upperCase;
                                }
/* 951 */                       bg1Var.f2410b.mo2906a(strM3785k, null);
                            }
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public C0871e8(fj1 fj1Var, wb2 wb2Var, c10 c10Var) {
                    super(2, c10Var);
                    this.f7567a = 1;
/* 14 */            this.f7569c = fj1Var;
                    this.f7570d = wb2Var;
                }
            }
