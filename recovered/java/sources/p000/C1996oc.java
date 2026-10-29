            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import androidx.core.app.NotificationCompat;
            import com.usercentrics.sdk.UsercentricsReadyStatus;
            import com.usercentrics.sdk.p009v2.consent.data.SaveConsentsData;
            import com.usercentrics.sdk.services.tcf.interfaces.IdAndName;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
            import com.usercentrics.tcf.core.model.gvl.RetentionPeriod;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.InterfaceC1389c1;
            import io.sentry.android.replay.capture.AbstractC1310l;
            import io.sentry.android.replay.capture.C1305g;
            import io.sentry.android.replay.capture.C1308j;
            import io.sentry.android.replay.capture.C1312n;
            import io.sentry.rrweb.AbstractC1647b;
            import io.sentry.util.AbstractC1704c;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.TimeUnit;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: oc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1996oc extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14703a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f14704b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f14705c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1996oc(int i, Object obj, Object obj2) {
/* 8 */             super(1);
/* 1 */             this.f14703a = i;
/* 3 */             this.f14704b = obj;
/* 5 */             this.f14705c = obj2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r4v0, types: [c10] */
                /* JADX WARN: Type inference failed for: r4v21 */
                /* JADX WARN: Type inference failed for: r4v22 */
                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit unit;
                    Map map;
                    Object n42Var;
/* 5 */             int i = 0;
/* 6 */             int i2 = 1;
/* 7 */             ?? r4 = 0;
/* 7 */             r4 = 0;
                    switch (this.f14703a) {
                        case 0:
/* 1421 */                  oy0 oy0Var = (oy0) obj;
/* 1425 */                  C2065pc c2065pc = (C2065pc) this.f14704b;
/* 1427 */                  if (oy0Var != null) {
/* 1431 */                      c2065pc.f12550a.add(oy0Var);
                            }
/* 1436 */                  HashMap map2 = new HashMap();
/* 1441 */                  map2.put(NotificationCompat.CATEGORY_EVENT, c2065pc);
/* 1446 */                  xn1.m10006b("SnowplowInstallTracking", map2);
/* 1457 */                  SharedPreferences.Editor editorEdit = i13.m4439r((Context) this.f14705c).edit();
/* 1461 */                  if (editorEdit != null) {
/* 1467 */                      editorEdit.putString("installed_before", "YES");
                            }
/* 1470 */                  if (editorEdit != null) {
/* 1472 */                      editorEdit.apply();
                            }
/* 1475 */                  return Unit.f12910a;
                        case 1:
/* 1386 */                  Throwable th = (Throwable) obj;
/* 1388 */                  th.getClass();
/* 1393 */                  C1945mz c1945mz = (C1945mz) this.f14704b;
/* 1399 */                  c1945mz.f14070b.mo2907b("Failed while trying to save consents", th);
/* 1413 */                  c1945mz.f14069a.m9743b(new C1871kz(c1945mz, (SaveConsentsData) this.f14705c, r4, i));
/* 1416 */                  return Unit.f12910a;
                        case 2:
/* 1358 */                  List list = (List) obj;
/* 1360 */                  list.getClass();
/* 1378 */                  ((j10) this.f14704b).f11988a.m9744c(new C1908lz(i2, (C1983o) this.f14705c, list));
/* 1381 */                  return Unit.f12910a;
                        case 3:
/* 1332 */                  ((Throwable) obj).getClass();
/* 1350 */                  ((j10) this.f14704b).f11988a.m9744c(new C0908f8((C0908f8) this.f14705c, i2));
/* 1353 */                  return Unit.f12910a;
                        case 4:
/* 1277 */                  Throwable th2 = (Throwable) obj;
/* 1281 */                  C2260um c2260um = (C2260um) this.f14704b;
/* 1283 */                  if (th2 == null) {
/* 1322 */                      c2260um.m9040a(((f70) this.f14705c).m10256r());
                            } else if (th2 instanceof CancellationException) {
/* 1289 */                      c2260um.f17593d = true;
/* 1291 */                      C2466xm c2466xm = c2260um.f17591b;
/* 1293 */                      if (c2466xm != null && c2466xm.f19248b.cancel(true)) {
/* 1303 */                          c2260um.f17590a = null;
/* 1305 */                          c2260um.f17591b = null;
/* 1307 */                          c2260um.f17592c = null;
                                }
                            } else {
/* 1310 */                      c2260um.m9041b(th2);
                            }
/* 1325 */                  return Unit.f12910a;
                        case 5:
/* 1269 */                  ((kt0) this.f14704b).f13000c.removeCallbacks((cp0) this.f14705c);
/* 1272 */                  return Unit.f12910a;
                        case 6:
/* 1237 */                  ((C0908f8) ((er0) this.f14704b).f7853b).invoke();
/* 1249 */                  ((C0890er) this.f14705c).m3555H(new C1898lp());
/* 1252 */                  return Unit.f12910a;
                        case 7:
/* 656 */                   uq2 uq2Var = (uq2) obj;
/* 658 */                   uq2Var.getClass();
/* 665 */                   uq2Var.f17656j = (d31) this.f14704b;
/* 675 */                   String strM9332t = ((qa2) this.f14705c).m7752f().m9332t();
/* 681 */                   if (!uq2Var.f17649c) {
/* 683 */                       uq2Var.f17668v = strM9332t;
                            }
/* 693 */                   boolean zM9315c = ((qa2) this.f14705c).m7752f().m9315c();
/* 699 */                   if (!uq2Var.f17649c) {
/* 701 */                       uq2Var.f17658l = zM9315c;
                            }
/* 715 */                   uq2Var.f17645H = ((qa2) this.f14705c).m7752f().m9317e();
/* 725 */                   int iM9323k = ((qa2) this.f14705c).m7752f().m9323k();
/* 729 */                   if (iM9323k == 0) {
/* 1224 */                      throw null;
                            }
/* 733 */                   if (!uq2Var.f17649c) {
/* 735 */                       uq2Var.f17646I = iM9323k;
                            }
/* 745 */                   ((qa2) this.f14705c).m7752f().m9324l();
/* 750 */                   if (!uq2Var.f17649c) {
/* 752 */                       int i3 = k50.f12587b;
/* 754 */                       int i4 = k50.f12587b;
                            }
/* 764 */                   boolean zM9331s = ((qa2) this.f14705c).m7752f().m9331s();
                            synchronized (uq2Var) {
                                try {
/* 769 */                           uq2Var.f17670x = zM9331s;
/* 771 */                           za2 za2Var = uq2Var.f17657k;
/* 773 */                           if (za2Var != null && !zM9331s) {
/* 777 */                               uq2Var.m9120b();
/* 780 */                               uq2Var.f17657k = null;
                                    } else if (za2Var == null && zM9331s) {
/* 790 */                               Runnable[] runnableArr = {null, null, null, null};
/* 794 */                               Runnable[] runnableArr2 = uq2Var.f17669w;
/* 823 */                               uq2Var.f17657k = za2.f20037r.m7341e(uq2Var.f17650d, uq2Var.f17659m, uq2Var.f17660n, uq2Var.f17661o, uq2Var.f17647a, runnableArr2.length == 4 ? runnableArr2 : runnableArr);
                                    }
                                } catch (Throwable th3) {
/* 1223 */                          throw th3;
                                }
                            }
/* 834 */                   boolean zM9314b = ((qa2) this.f14705c).m7752f().m9314b();
/* 840 */                   if (!uq2Var.f17649c) {
/* 842 */                       uq2Var.f17638A = zM9314b;
                            }
/* 852 */                   boolean zM9325m = ((qa2) this.f14705c).m7752f().m9325m();
/* 858 */                   if (!uq2Var.f17649c) {
/* 860 */                       uq2Var.f17672z = zM9325m;
                            }
/* 870 */                   boolean zM9320h = ((qa2) this.f14705c).m7752f().m9320h();
/* 876 */                   if (!uq2Var.f17649c) {
/* 878 */                       uq2Var.f17671y = zM9320h;
                            }
/* 892 */                   if (((qa2) this.f14705c).m7752f().m9316d()) {
/* 899 */                       uq2Var.m9119a(new q50(0));
                            } else {
/* 907 */                       uq2Var.f17651e.m3643e("DeepLinkContext");
                            }
/* 922 */                   if (((qa2) this.f14705c).m7752f().m9328p()) {
/* 930 */                       uq2Var.m9119a(new q50(2));
                            } else {
/* 938 */                       uq2Var.f17651e.m3643e("ScreenContext");
                            }
/* 949 */                   boolean zM9330r = ((qa2) this.f14705c).m7752f().m9330r();
/* 955 */                   if (!uq2Var.f17649c) {
/* 957 */                       uq2Var.f17666t = zM9330r;
                            }
/* 971 */                   if (((qa2) this.f14705c).m7752f().m9329q()) {
/* 979 */                       uq2Var.m9119a(new q50(3));
                            } else {
/* 987 */                       uq2Var.f17651e.m3643e("ScreenSummaryContext");
                            }
/* 998 */                   boolean zM9322j = ((qa2) this.f14705c).m7752f().m9322j();
/* 1004 */                  if (!uq2Var.f17649c) {
/* 1006 */                      uq2Var.f17664r = zM9322j;
                            }
/* 1016 */                  boolean zM9321i = ((qa2) this.f14705c).m7752f().m9321i();
/* 1022 */                  if (!uq2Var.f17649c) {
/* 1024 */                      uq2Var.f17665s = zM9321i;
                            }
/* 1034 */                  boolean zM9319g = ((qa2) this.f14705c).m7752f().m9319g();
/* 1040 */                  if (!uq2Var.f17649c) {
/* 1042 */                      uq2Var.f17662p = zM9319g;
                            }
/* 1052 */                  boolean zM9318f = ((qa2) this.f14705c).m7752f().m9318f();
/* 1058 */                  if (!uq2Var.f17649c) {
/* 1060 */                      uq2Var.f17663q = zM9318f;
                            }
/* 1070 */                  boolean zM9333u = ((qa2) this.f14705c).m7752f().m9333u();
/* 1074 */                  boolean z = uq2Var.f17649c;
/* 1076 */                  if (!z) {
/* 1078 */                      uq2Var.f17667u = zM9333u;
                            } else if (uq2Var.f17667u != zM9333u && z) {
/* 1087 */                      uq2Var.f17667u = zM9333u;
/* 1089 */                      za2 za2Var2 = uq2Var.f17657k;
/* 1091 */                      if (za2Var2 != null) {
/* 1095 */                          za2Var2.f20045h.set(true);
                                }
                            }
/* 1106 */                  String strM9332t2 = ((qa2) this.f14705c).m7752f().m9332t();
/* 1112 */                  if (!uq2Var.f17649c) {
/* 1114 */                      uq2Var.f17668v = strM9332t2;
                            }
/* 1120 */                  iq0 iq0Var = ((qa2) this.f14705c).f15475o;
/* 1122 */                  if (iq0Var == null) {
/* 1218 */                      Intrinsics.m6220e("gdprConfiguration");
/* 1221 */                      throw null;
                            }
/* 1124 */                  iq0 iq0Var2 = iq0Var.f11895a;
/* 1126 */                  if (iq0Var2 != null) {
/* 1149 */                      uq2Var.f17639B = new ur3(iq0Var2.m5533a(), iq0Var2.m5535c(), iq0Var2.m5536d(), iq0Var2.m5534b());
                            }
/* 1159 */                  ((qa2) this.f14705c).m7751e().m3903a();
/* 1164 */                  TimeUnit.SECONDS.getClass();
/* 1171 */                  if (!uq2Var.f17649c) {
/* 1173 */                      uq2Var.f17660n = 1800L;
                            }
/* 1183 */                  ((qa2) this.f14705c).m7751e().m3904b();
/* 1188 */                  if (!uq2Var.f17649c) {
/* 1190 */                      uq2Var.f17659m = 1800L;
                            }
/* 1198 */                  Iterator it = ((qa2) this.f14705c).f15476p.iterator();
/* 1206 */                  if (it.hasNext()) {
/* 1215 */                      throw fm0.m3780f(it);
                            }
/* 1208 */                  return Unit.f12910a;
                        case 8:
/* 594 */                   Throwable th4 = (Throwable) obj;
/* 600 */                   ((C1983o) this.f14704b).invoke(th4);
/* 610 */                   C2554zk c2554zk = (C2554zk) ((ra2) this.f14705c).f15957c;
/* 612 */                   c2554zk.m10383g(false, th4);
/* 649 */                   do {
/* 615 */                       Object objM10375E = c2554zk.m10375E();
/* 621 */                       if (objM10375E instanceof C0892et) {
/* 624 */                           objM10375E = null;
                                }
/* 625 */                       if (objM10375E != null) {
/* 642 */                           ((kh1) objM10375E).f12766b.m6289U(th4 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th4);
/* 645 */                           unit = Unit.f12910a;
                                } else {
/* 648 */                           unit = null;
                                }
/* 649 */                   } while (unit != null);
/* 651 */                   return Unit.f12910a;
                        case 9:
/* 506 */                   IdAndName idAndName = (IdAndName) obj;
/* 510 */                   idAndName.getClass();
/* 515 */                   RetentionPeriod retentionPeriod = (RetentionPeriod) this.f14704b;
/* 517 */                   if (retentionPeriod != null && (map = retentionPeriod.f6824a) != null) {
/* 534 */                       r4 = (Integer) map.get(Integer.valueOf(idAndName.f6157a));
                            }
/* 536 */                   String str = idAndName.f6158b;
/* 538 */                   if (r4 == 0) {
/* 587 */                       return AbstractC0886en.m3507k("• ", StringsKt.m6239O(str).toString());
                            }
/* 562 */                   ?? M3514r = AbstractC0886en.m3514r("• ", StringsKt.m6239O(str).toString(), " (", ((ol2) this.f14705c).m7207b().f6472C, ": ");
/* 566 */                   M3514r.append(r4);
/* 571 */                   M3514r.append(")");
/* 574 */                   return M3514r.toString();
                        case 10:
/* 413 */                   Object obj2 = ((o42) obj).f14613a;
/* 417 */                   Function1 function1 = (Function1) this.f14704b;
/* 422 */                   Function1 function2 = (Function1) this.f14705c;
/* 424 */                   m42 m42Var = o42.f14612b;
/* 428 */                   if (!(obj2 instanceof n42)) {
                                try {
/* 433 */                           n42Var = ((u03) obj2).mo22b();
                                } catch (Throwable th5) {
/* 439 */                           m42 m42Var2 = o42.f14612b;
/* 443 */                           n42Var = new n42(th5);
                                }
/* 450 */                       if (!(n42Var instanceof n42)) {
/* 455 */                           function1.invoke((UsercentricsReadyStatus) n42Var);
                                }
/* 458 */                       Throwable thM7099a = o42.m7099a(n42Var);
/* 462 */                       if (thM7099a != null) {
/* 468 */                           String message = thM7099a.getMessage();
/* 472 */                           if (message == null) {
/* 474 */                               message = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 482 */                           function2.invoke(new tz2(new vz2(message, thM7099a)));
                                }
                                break;
                            }
/* 485 */                   Throwable thM7099a2 = o42.m7099a(obj2);
/* 489 */                   if (thM7099a2 != null) {
/* 498 */                       function2.invoke(new tz2((vz2) thM7099a2));
                            }
/* 501 */                   return Unit.f12910a;
                        case 11:
/* 380 */                   Object obj3 = ((o42) obj).f14613a;
/* 403 */                   ((a13) this.f14704b).f30a.m3696b().m9744c(new C0908f8((C1908lz) this.f14705c, 19));
/* 406 */                   return Unit.f12910a;
                        case 12:
/* 344 */                   Throwable th6 = (Throwable) obj;
/* 346 */                   th6.getClass();
/* 370 */                   ((a13) this.f14704b).f30a.m3696b().m9744c(new C1908lz(12, (C1996oc) this.f14705c, th6));
/* 373 */                   return Unit.f12910a;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 314 */                   ((Unit) obj).getClass();
/* 319 */                   a13 a13Var = (a13) this.f14704b;
/* 336 */                   a13Var.f30a.m3696b().m9744c(new C0908f8(a13Var, (t03) this.f14705c));
/* 339 */                   return Unit.f12910a;
                        case 14:
/* 280 */                   Throwable th7 = (Throwable) obj;
/* 282 */                   th7.getClass();
/* 287 */                   a13 a13Var2 = (a13) this.f14704b;
/* 304 */                   a13Var2.f30a.m3696b().m9744c(new C1908lz(th7, a13Var2, (C0197bz) this.f14705c));
/* 307 */                   return Unit.f12910a;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 246 */                   TCFData tCFData = (TCFData) obj;
/* 248 */                   tCFData.getClass();
/* 272 */                   ((a13) this.f14704b).f30a.m3696b().m9744c(new C1908lz(14, (Function1) this.f14705c, tCFData));
/* 275 */                   return Unit.f12910a;
                        case 16:
/* 191 */                   cw1 cw1Var = (cw1) obj;
/* 193 */                   cw1Var.getClass();
/* 198 */                   C2181sh c2181sh = (C2181sh) this.f14704b;
/* 206 */                   C0168b5 c0168b5 = (C0168b5) this.f14705c;
/* 238 */                   c2181sh.invoke(new wu1(cw1Var, new ac1((a13) c0168b5.f2211b, (g13) c0168b5.f2212c, (String) c0168b5.f2213d), new er0(new uv2(c0168b5, i2), 9)));
/* 241 */                   return Unit.f12910a;
                        case 17:
/* 163 */                   tz2 tz2Var = (tz2) obj;
/* 165 */                   tz2Var.getClass();
/* 176 */                   ((i03) ((C0168b5) this.f14704b).f2214e).mo2909d(tz2Var);
/* 183 */                   ((Function1) this.f14705c).invoke(tz2Var);
/* 186 */                   return Unit.f12910a;
                        case 18:
/* 80 */                    AbstractC1310l abstractC1310l = (AbstractC1310l) obj;
/* 82 */                    abstractC1310l.getClass();
/* 87 */                    C1305g c1305g = (C1305g) this.f14704b;
/* 89 */                    ArrayList arrayList = c1305g.f10492x;
/* 91 */                    InterfaceC1389c1 interfaceC1389c1 = c1305g.f10489u;
/* 93 */                    arrayList.getClass();
/* 108 */                   C1308j c1308j = (C1308j) (arrayList.isEmpty() ? null : arrayList.remove(0));
/* 110 */                   while (c1308j != null) {
/* 112 */                       C1308j.m5000a(c1308j, interfaceC1389c1);
/* 127 */                       c1308j = (C1308j) (arrayList.isEmpty() ? null : arrayList.remove(0));
/* 131 */                       Thread.sleep(100L);
                            }
/* 137 */                   if (abstractC1310l instanceof C1308j) {
/* 139 */                       C1308j c1308j2 = (C1308j) abstractC1310l;
/* 141 */                       C1308j.m5000a(c1308j2, interfaceC1389c1);
/* 146 */                       C1983o c1983o = (C1983o) this.f14705c;
/* 150 */                       Date date = c1308j2.f10493a.f11214f0;
/* 152 */                       date.getClass();
/* 155 */                       c1983o.invoke(date);
                            }
/* 158 */                   return Unit.f12910a;
                        case 19:
/* 49 */                    AbstractC1647b abstractC1647b = (AbstractC1647b) obj;
/* 51 */                    abstractC1647b.getClass();
/* 66 */                    if (abstractC1647b.f11589b >= ((Date) this.f14704b).getTime()) {
/* 72 */                        ((ArrayList) this.f14705c).add(abstractC1647b);
                            }
/* 75 */                    return Unit.f12910a;
                        default:
/* 13 */                    AbstractC1310l abstractC1310l2 = (AbstractC1310l) obj;
/* 17 */                    C1312n c1312n = (C1312n) this.f14704b;
/* 19 */                    abstractC1310l2.getClass();
/* 24 */                    if (abstractC1310l2 instanceof C1308j) {
/* 30 */                        C1308j.m5000a((C1308j) abstractC1310l2, c1312n.f10499u);
                            }
/* 34 */                    c1312n.m4994k(-1);
/* 41 */                    AbstractC1704c.m5451f((File) this.f14705c);
/* 44 */                    return Unit.f12910a;
                    }
                }
            }
