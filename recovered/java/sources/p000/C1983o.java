            package p000;

            import android.content.Context;
            import android.view.View;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.usercentrics.sdk.mediation.data.MediationResultPayload;
            import com.usercentrics.sdk.p008ui.secondLayer.component.footer.UCSecondLayerFooter;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.replay.C1345t;
            import io.sentry.android.replay.C1346u;
            import io.sentry.android.replay.ReplayIntegration;
            import io.sentry.android.replay.capture.AbstractC1301c;
            import io.sentry.util.C1702a;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Date;
            import java.util.EnumSet;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.WeakHashMap;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
            import kotlinx.serialization.json.AbstractC1858b;
            import okhttp3.CookieJar;
            import okhttp3.OkHttpClient;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: o */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1983o extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14577a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f14578b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1983o(Object obj, int i) {
/* 6 */             super(1);
/* 1 */             this.f14577a = i;
/* 3 */             this.f14578b = obj;
                }

                /* JADX WARN: Code duplicated, block: B:193:0x050f  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) throws Exception {
                    ip1 ip1Var;
                    ip1 ip1Var2;
                    ip1 ip1Var3;
/* 1 */             int i = this.f14577a;
/* 6 */             Long lValueOf = null;
/* 6 */             lValueOf = null;
/* 6 */             ip1 ip1Var4 = null;
/* 7 */             Object obj2 = this.f14578b;
                    switch (i) {
                        case 0:
/* 1341 */                  AbstractC1858b abstractC1858b = (AbstractC1858b) obj;
/* 1343 */                  abstractC1858b.getClass();
/* 1346 */                  c21 c21Var = (c21) obj2;
/* 1356 */                  c21Var.mo1496M((String) CollectionsKt.m6204y(c21Var.f2657a), abstractC1858b);
/* 1359 */                  return Unit.f12910a;
                        case 1:
/* 1324 */                  Throwable th = (Throwable) obj;
/* 1326 */                  th.getClass();
/* 1335 */                  ((C2321w7) obj2).f18462d.mo2907b("Request failed", th);
/* 1338 */                  return Unit.f12910a;
                        case 2:
/* 1311 */                  Throwable th2 = (Throwable) obj;
/* 1313 */                  th2.getClass();
/* 1318 */                  ((wu0) obj2).invoke(th2);
/* 1321 */                  return Unit.f12910a;
                        case 3:
/* 1215 */                  String str = (String) obj;
/* 1217 */                  str.getClass();
/* 1222 */                  C2003oj c2003oj = ((C2072pj) obj2).f15138a;
/* 1224 */                  c2003oj.getClass();
/* 1231 */                  od2 od2Var = ((pz2) c2003oj.f14775b).f15354e;
/* 1233 */                  fh2[] fh2VarArr = fh2.f8216a;
/* 1235 */                  od2Var.getClass();
/* 1242 */                  String string = od2Var.f14716a.getString("session_timestamp", null);
/* 1246 */                  if (string != null) {
                                try {
/* 1252 */                          lValueOf = Long.valueOf(Long.parseLong(string));
                                    break;
                                } catch (Throwable unused) {
                                }
                            }
/* 1256 */                  if (lValueOf != null) {
/* 1294 */                      if (((int) ((new h50().m4114b().m4115c() - new h50(lValueOf.longValue()).m4114b().m4115c()) / 86400000)) >= 1) {
/* 1305 */                          c2003oj.m7179a(str, new h50().m4115c());
                                }
                            } else {
/* 1305 */                      c2003oj.m7179a(str, new h50().m4115c());
                            }
/* 1308 */                  return Unit.f12910a;
                        case 4:
/* 1200 */                  String str2 = (String) obj;
/* 1202 */                  str2.getClass();
/* 1209 */                  ((C2508yr) obj2).f19766b.mo2906a(str2, null);
/* 1212 */                  return Unit.f12910a;
                        case 5:
/* 1169 */                  C0894ev c0894ev = (C0894ev) obj;
/* 1171 */                  c0894ev.getClass();
/* 1178 */                  SerialDescriptor descriptor = ((b10) obj2).f2157b.getDescriptor();
/* 1184 */                  List annotations = descriptor != null ? descriptor.getAnnotations() : null;
/* 1188 */                  if (annotations == null) {
/* 1190 */                      annotations = nd0.f14189a;
                            }
/* 1192 */                  annotations.getClass();
/* 1195 */                  c0894ev.f7886a = annotations;
/* 1197 */                  return Unit.f12910a;
                        case 6:
/* 1133 */                  Throwable th3 = (Throwable) obj;
/* 1135 */                  b50 b50Var = (b50) obj2;
/* 1137 */                  hk2 hk2Var = b50Var.f2225j;
/* 1139 */                  if (th3 != null) {
/* 1148 */                      b50Var.f2223h.m4003u(new mi0(th3));
                            }
/* 1155 */                  if (hk2Var.isInitialized()) {
/* 1163 */                      ((th0) hk2Var.getValue()).close();
                            }
/* 1166 */                  return Unit.f12910a;
                        case 7:
/* 1105 */                  Map.Entry entry = (Map.Entry) obj;
/* 1107 */                  entry.getClass();
/* 1116 */                  View view = (View) entry.getValue();
/* 1118 */                  WeakHashMap weakHashMap = e33.f7494a;
/* 1128 */                  return Boolean.valueOf(CollectionsKt.m6197r((Collection) obj2, s23.m8373k(view)));
                        case 8:
/* 1099 */                  ((ig2) obj2).cancel(null);
/* 1102 */                  return Unit.f12910a;
                        case 9:
/* 1082 */                  String str3 = (String) obj;
/* 1084 */                  str3.getClass();
/* 1089 */                  ((C1983o) obj2).invoke(str3);
/* 1092 */                  return Unit.f12910a;
                        case 10:
/* 1069 */                  Throwable th4 = (Throwable) obj;
/* 1071 */                  th4.getClass();
/* 1076 */                  ((C1996oc) obj2).invoke(th4);
/* 1079 */                  return Unit.f12910a;
                        case 11:
/* 1052 */                  C0894ev c0894ev2 = (C0894ev) obj;
/* 1054 */                  c0894ev2.getClass();
/* 1059 */                  nd0 nd0Var = ((ep1) obj2).f7818b;
/* 1061 */                  nd0Var.getClass();
/* 1064 */                  c0894ev2.f7886a = nd0Var;
/* 1066 */                  return Unit.f12910a;
                        case 12:
/* 1015 */                  int iIntValue = ((Number) obj).intValue();
/* 1021 */                  StringBuilder sb = new StringBuilder();
/* 1024 */                  PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = (PluginGeneratedSerialDescriptor) obj2;
/* 1030 */                  sb.append(pluginGeneratedSerialDescriptor.f12954e[iIntValue]);
/* 1033 */                  sb.append(": ");
/* 1044 */                  sb.append(pluginGeneratedSerialDescriptor.mo138i(iIntValue).mo130a());
/* 1047 */                  return sb.toString();
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 945 */                   C0894ev c0894ev3 = (C0894ev) obj;
/* 947 */                   c0894ev3.getClass();
/* 952 */                   j13.m5659u(rh2.f16075a);
/* 959 */                   C0894ev.m3601a(c0894ev3, "type", vh2.f18184b);
/* 966 */                   StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Polymorphic<");
/* 969 */                   mt1 mt1Var = (mt1) obj2;
/* 977 */                   sb2.append(mt1Var.f14021a.m3242b());
/* 982 */                   sb2.append('>');
/* 1000 */                  C0894ev.m3601a(c0894ev3, FirebaseAnalytics.Param.VALUE, hu0.m4322L(sb2.toString(), ba2.f2339k, new SerialDescriptor[0]));
/* 1003 */                  nd0 nd0Var2 = mt1Var.f14022b;
/* 1005 */                  nd0Var2.getClass();
/* 1008 */                  c0894ev3.f7886a = nd0Var2;
/* 1010 */                  return Unit.f12910a;
                        case 14:
/* 942 */                   return ((C2303vq) obj2).f18297j;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 927 */                   ((String) obj).getClass();
/* 932 */                   ((C1908lz) obj2).invoke();
/* 935 */                   return Unit.f12910a;
                        case 16:
/* 919 */                   ((j92) obj2).m5729b();
/* 922 */                   return Unit.f12910a;
                        case 17:
/* 878 */                   int iIntValue2 = ((Number) obj).intValue();
/* 884 */                   StringBuilder sb3 = new StringBuilder();
/* 887 */                   aa2 aa2Var = (aa2) obj2;
/* 893 */                   sb3.append(aa2Var.f148f[iIntValue2]);
/* 896 */                   sb3.append(": ");
/* 907 */                   sb3.append(aa2Var.f149g[iIntValue2].mo130a());
/* 910 */                   return sb3.toString();
                        case 18:
/* 281 */                   jc0 jc0Var = (jc0) obj;
/* 283 */                   jc0Var.getClass();
/* 286 */                   AtomicReference atomicReference = jc0Var.f12204v;
/* 288 */                   qa2 qa2Var = (qa2) obj2;
/* 294 */                   int iM8576c = qa2Var.m7748b().m8576c();
/* 298 */                   EnumSet enumSet = jc0Var.f12196n;
/* 300 */                   Context context = jc0Var.f12188f;
/* 302 */                   String str4 = jc0Var.f12189g;
/* 304 */                   boolean z = jc0Var.f12184b;
/* 306 */                   jc0Var.f12180C = iM8576c;
/* 308 */                   boolean z2 = jc0Var.f12187e;
/* 312 */                   if (!z2 && z) {
/* 316 */                       Integer num = jc0Var.f12202t;
/* 318 */                       if (num != null) {
/* 320 */                           int iIntValue3 = num.intValue();
/* 326 */                           if (str4 == null) {
/* 371 */                               Intrinsics.m6220e("uri");
/* 374 */                               throw null;
                                    }
/* 328 */                           hp1 hp1Var = new hp1(context, str4);
/* 331 */                           int i2 = jc0Var.f12180C;
/* 333 */                           if (i2 == 0) {
/* 370 */                               throw null;
                                    }
/* 335 */                           hp1Var.f9175c = i2;
/* 337 */                           enumSet.getClass();
/* 340 */                           hp1Var.f9176d = enumSet;
/* 342 */                           hp1Var.f9177e = iIntValue3;
/* 346 */                           hp1Var.f9180h = jc0Var.f12203u;
/* 350 */                           hp1Var.f9178f = jc0Var.f12194l;
/* 354 */                           hp1Var.f9179g = jc0Var.f12192j;
/* 358 */                           hp1Var.f9181i = jc0Var.f12205w;
/* 362 */                           hp1Var.f9182j = jc0Var.f12208z;
/* 366 */                           ip1Var3 = new ip1(hp1Var);
                                } else {
/* 375 */                           ip1Var3 = null;
                                }
/* 376 */                       jc0Var.m5773d(ip1Var3);
                            }
/* 387 */                   jc0Var.f12182E = qa2Var.m7748b().m8580g();
/* 389 */                   if (!z2 && z) {
/* 393 */                       Integer num2 = jc0Var.f12202t;
/* 395 */                       if (num2 != null) {
/* 397 */                           int iIntValue4 = num2.intValue();
/* 403 */                           if (str4 == null) {
/* 448 */                               Intrinsics.m6220e("uri");
/* 451 */                               throw null;
                                    }
/* 405 */                           hp1 hp1Var2 = new hp1(context, str4);
/* 408 */                           int i3 = jc0Var.f12180C;
/* 410 */                           if (i3 == 0) {
/* 447 */                               throw null;
                                    }
/* 412 */                           hp1Var2.f9175c = i3;
/* 414 */                           enumSet.getClass();
/* 417 */                           hp1Var2.f9176d = enumSet;
/* 419 */                           hp1Var2.f9177e = iIntValue4;
/* 423 */                           hp1Var2.f9180h = jc0Var.f12203u;
/* 427 */                           hp1Var2.f9178f = jc0Var.f12194l;
/* 431 */                           hp1Var2.f9179g = jc0Var.f12192j;
/* 435 */                           hp1Var2.f9181i = jc0Var.f12205w;
/* 439 */                           hp1Var2.f9182j = jc0Var.f12208z;
/* 443 */                           ip1Var2 = new ip1(hp1Var2);
                                } else {
/* 452 */                           ip1Var2 = null;
                                }
/* 453 */                       jc0Var.m5773d(ip1Var2);
                            }
/* 464 */                   jc0Var.m5773d(qa2Var.m7748b().m8577d());
/* 471 */                   String strM8574a = qa2Var.m7748b().m8574a();
/* 475 */                   jc0Var.f12203u = strM8574a;
/* 477 */                   if (!z2 && z) {
/* 481 */                       Integer num3 = jc0Var.f12202t;
/* 483 */                       if (num3 != null) {
/* 485 */                           int iIntValue5 = num3.intValue();
/* 491 */                           if (str4 == null) {
/* 534 */                               Intrinsics.m6220e("uri");
/* 537 */                               throw null;
                                    }
/* 493 */                           hp1 hp1Var3 = new hp1(context, str4);
/* 496 */                           int i4 = jc0Var.f12180C;
/* 498 */                           if (i4 == 0) {
/* 533 */                               throw null;
                                    }
/* 500 */                           hp1Var3.f9175c = i4;
/* 502 */                           enumSet.getClass();
/* 505 */                           hp1Var3.f9176d = enumSet;
/* 507 */                           hp1Var3.f9177e = iIntValue5;
/* 509 */                           hp1Var3.f9180h = strM8574a;
/* 513 */                           hp1Var3.f9178f = jc0Var.f12194l;
/* 517 */                           hp1Var3.f9179g = jc0Var.f12192j;
/* 521 */                           hp1Var3.f9181i = jc0Var.f12205w;
/* 525 */                           hp1Var3.f9182j = jc0Var.f12208z;
/* 529 */                           ip1Var = new ip1(hp1Var3);
                                } else {
/* 538 */                           ip1Var = null;
                                }
/* 539 */                       jc0Var.m5773d(ip1Var);
                            }
/* 546 */                   OkHttpClient okHttpClientM8578e = qa2Var.m7748b().m8578e();
/* 550 */                   if (!z) {
/* 552 */                       jc0Var.f12194l = okHttpClientM8578e;
                            }
/* 558 */                   CookieJar cookieJarM8579f = qa2Var.m7748b().m8579f();
/* 562 */                   if (!z) {
/* 564 */                       jc0Var.f12192j = cookieJarM8579f;
                            }
/* 570 */                   Integer numM8582i = qa2Var.m7748b().m8582i();
/* 574 */                   jc0Var.f12202t = numM8582i;
/* 576 */                   if (!z2 && z) {
/* 582 */                       if (str4 == null) {
/* 634 */                           Intrinsics.m6220e("uri");
/* 637 */                           throw null;
                                }
/* 584 */                       hp1 hp1Var4 = new hp1(context, str4);
/* 587 */                       int i5 = jc0Var.f12180C;
/* 589 */                       if (i5 == 0) {
/* 633 */                           throw null;
                                }
/* 591 */                       hp1Var4.f9175c = i5;
/* 593 */                       enumSet.getClass();
/* 596 */                       hp1Var4.f9176d = enumSet;
/* 602 */                       hp1Var4.f9177e = numM8582i.intValue();
/* 606 */                       hp1Var4.f9180h = jc0Var.f12203u;
/* 610 */                       hp1Var4.f9178f = jc0Var.f12194l;
/* 614 */                       hp1Var4.f9179g = jc0Var.f12192j;
/* 618 */                       hp1Var4.f9181i = jc0Var.f12205w;
/* 622 */                       hp1Var4.f9182j = jc0Var.f12208z;
/* 629 */                       jc0Var.m5773d(new ip1(hp1Var4));
                            }
/* 646 */                   jc0Var.f12199q = qa2Var.m7747a().m6081e();
/* 652 */                   int iM6077a = qa2Var.m7747a().m6077a();
/* 662 */                   if (!jc0Var.f12185c.get()) {
/* 664 */                       jc0Var.f12181D = iM6077a;
                            }
/* 674 */                   jc0Var.f12201s = qa2Var.m7747a().m6079c();
/* 684 */                   jc0Var.f12200r = qa2Var.m7747a().m6078b();
/* 690 */                   int iM6088l = qa2Var.m7747a().m6088l();
/* 694 */                   if (!z) {
/* 696 */                       jc0Var.f12193k = iM6088l;
                            }
/* 702 */                   qa2Var.m7747a().m6085i();
/* 709 */                   Map mapM6080d = qa2Var.m7747a().m6080d();
/* 713 */                   AtomicReference atomicReference2 = jc0Var.f12206x;
/* 715 */                   if (mapM6080d == null) {
/* 719 */                       mapM6080d = new HashMap();
                            }
/* 722 */                   atomicReference2.set(mapM6080d);
/* 729 */                   boolean zM6087k = qa2Var.m7747a().m6087k();
/* 733 */                   jc0Var.f12205w = zM6087k;
/* 735 */                   if (!z2 && z && (((um1) atomicReference.get()) instanceof ip1)) {
/* 753 */                       um1 um1Var = (um1) atomicReference.get();
/* 755 */                       um1Var.getClass();
/* 760 */                       ((ip1) um1Var).f11887e = zM6087k;
                            }
/* 766 */                   Map mapM8581h = qa2Var.m7748b().m8581h();
/* 770 */                   jc0Var.f12208z = mapM8581h;
/* 772 */                   if (!z2 && z) {
/* 776 */                       Integer num4 = jc0Var.f12202t;
/* 778 */                       if (num4 != null) {
/* 780 */                           int iIntValue6 = num4.intValue();
/* 786 */                           if (str4 == null) {
/* 829 */                               Intrinsics.m6220e("uri");
/* 832 */                               throw null;
                                    }
/* 788 */                           hp1 hp1Var5 = new hp1(context, str4);
/* 791 */                           int i6 = jc0Var.f12180C;
/* 793 */                           if (i6 == 0) {
/* 828 */                               throw null;
                                    }
/* 795 */                           hp1Var5.f9175c = i6;
/* 797 */                           enumSet.getClass();
/* 800 */                           hp1Var5.f9176d = enumSet;
/* 802 */                           hp1Var5.f9177e = iIntValue6;
/* 806 */                           hp1Var5.f9180h = jc0Var.f12203u;
/* 810 */                           hp1Var5.f9178f = jc0Var.f12194l;
/* 814 */                           hp1Var5.f9179g = jc0Var.f12192j;
/* 818 */                           hp1Var5.f9181i = jc0Var.f12205w;
/* 820 */                           hp1Var5.f9182j = mapM8581h;
/* 824 */                           ip1Var4 = new ip1(hp1Var5);
                                }
/* 833 */                       jc0Var.m5773d(ip1Var4);
                            }
/* 850 */                   jc0Var.f12207y.set(Boolean.valueOf(qa2Var.m7747a().m6086j()));
/* 861 */                   jc0Var.f12179B = qa2Var.m7747a().m6083g();
/* 871 */                   jc0Var.f12178A = qa2Var.m7747a().m6084h();
/* 873 */                   return Unit.f12910a;
                        case 19:
/* 269 */                   AbstractC1858b abstractC1858b2 = (AbstractC1858b) obj;
/* 271 */                   abstractC1858b2.getClass();
/* 276 */                   ((h22) obj2).f8873a = abstractC1858b2;
/* 278 */                   return Unit.f12910a;
                        case 20:
/* 222 */                   C0894ev c0894ev4 = (C0894ev) obj;
/* 224 */                   c0894ev4.getClass();
/* 227 */                   b10 b10Var = (b10) obj2;
/* 237 */                   C0894ev.m3601a(c0894ev4, "first", b10Var.f2157b.getDescriptor());
/* 250 */                   C0894ev.m3601a(c0894ev4, "second", ((KSerializer) b10Var.f2158c).getDescriptor());
/* 263 */                   C0894ev.m3601a(c0894ev4, "third", ((KSerializer) b10Var.f2159d).getDescriptor());
/* 266 */                   return Unit.f12910a;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 209 */                   List list = (List) obj;
/* 211 */                   list.getClass();
/* 216 */                   iu2.m5554j((iu2) obj2, list);
/* 219 */                   return Unit.f12910a;
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 196 */                   List list2 = (List) obj;
/* 198 */                   list2.getClass();
/* 203 */                   ((C1983o) obj2).invoke(list2);
/* 206 */                   return Unit.f12910a;
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 162 */                   Boolean bool = (Boolean) obj;
/* 164 */                   boolean zBooleanValue = bool.booleanValue();
/* 170 */                   ((su2) obj2).f16813k = bool;
/* 177 */                   ez2 ez2Var = zBooleanValue ? ez2.CCPA_TOGGLES_ON : ez2.CCPA_TOGGLES_OFF;
/* 179 */                   fz2 ec0Var = qu1.f15757c;
/* 181 */                   if (ec0Var == null) {
/* 187 */                       ec0Var = new ec0(22);
                            }
/* 190 */                   ec0Var.mo3403b(ez2Var);
/* 193 */                   return Unit.f12910a;
                        case 24:
/* 139 */                   boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
/* 145 */                   nv2 nv2Var = ((UCSecondLayerFooter) obj2).f6280l0;
/* 147 */                   if (nv2Var != null) {
/* 151 */                       nv2Var.f14481f.f19838q = zBooleanValue2;
/* 153 */                       return Unit.f12910a;
                            }
/* 158 */                   Intrinsics.m6220e("viewModel");
/* 161 */                   throw null;
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 110 */                   cw1 cw1Var = (cw1) obj;
/* 112 */                   cw1Var.getClass();
/* 115 */                   yv2 yv2Var = (yv2) obj2;
/* 117 */                   dw1 dw1Var = cw1Var.f6925b;
/* 121 */                   yv2Var.f19826e = dw1Var.f7435d;
/* 125 */                   yv2Var.f19831j = dw1Var.f7433b;
/* 127 */                   uv2 uv2Var = yv2Var.f19837p;
/* 129 */                   if (uv2Var != null) {
/* 131 */                       yv2Var.m10184a(uv2Var);
                            }
/* 134 */                   return Unit.f12910a;
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 84 */                    MediationResultPayload mediationResultPayload = (MediationResultPayload) obj;
/* 86 */                    mediationResultPayload.getClass();
/* 104 */                   ((a13) obj2).f30a.m3696b().m9744c(new C2498yh(mediationResultPayload, 27));
/* 107 */                   return Unit.f12910a;
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 71 */                    cw1 cw1Var2 = (cw1) obj;
/* 73 */                    cw1Var2.getClass();
/* 78 */                    ((Function1) obj2).invoke(cw1Var2);
/* 81 */                    return Unit.f12910a;
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 40 */                    Date date = (Date) obj;
/* 42 */                    date.getClass();
/* 45 */                    ReplayIntegration replayIntegration = (ReplayIntegration) obj2;
/* 47 */                    AbstractC1301c abstractC1301c = replayIntegration.f10413Y;
/* 49 */                    if (abstractC1301c != null) {
/* 57 */                        abstractC1301c.m4994k(abstractC1301c.m4988e() + 1);
                            }
/* 60 */                    AbstractC1301c abstractC1301c2 = replayIntegration.f10413Y;
/* 62 */                    if (abstractC1301c2 != null) {
/* 65 */                        abstractC1301c2.m4995l(date);
                            }
/* 68 */                    return Unit.f12910a;
                        default:
/* 12 */                    ArrayList arrayList = (ArrayList) obj;
/* 14 */                    arrayList.getClass();
/* 17 */                    C1346u c1346u = (C1346u) obj2;
/* 19 */                    C1702a c1702a = c1346u.f10641b;
/* 21 */                    c1702a.m5443c();
                            try {
/* 24 */                        C1345t c1345t = c1346u.f10643d;
/* 26 */                        c1345t.addAll(arrayList);
/* 29 */                        xe2.m9770h(c1702a, null);
/* 32 */                        return c1345t;
                            } catch (Throwable th5) {
                                try {
/* 34 */                            throw th5;
                                } catch (Throwable th6) {
/* 36 */                            xe2.m9770h(c1702a, th5);
/* 39 */                            throw th6;
                                }
                            }
                    }
                }
            }
