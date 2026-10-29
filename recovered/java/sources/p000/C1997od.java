            package p000;

            import android.app.Activity;
            import android.content.Context;
            import androidx.activity.ComponentActivity;
            import com.supercell.p007id.scid_plugin.platform_interface.PackageValidation;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.UUID;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: od */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C1997od implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14713a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f14714b;

                public /* synthetic */ C1997od(Object obj, int i) {
/* 1 */             this.f14713a = i;
/* 3 */             this.f14714b = obj;
                }

                /* JADX WARN: Type inference failed for: r2v10, types: [is1] */
                /* JADX WARN: Type inference failed for: r2v8, types: [js1] */
                /* JADX WARN: Type inference failed for: r3v5, types: [ks1] */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f14713a;
/* 10 */            ArrayList arrayList = null;
/* 10 */            ns1 ns1Var = null;
/* 10 */            ArrayList arrayList2 = null;
/* 10 */            ArrayList arrayList3 = null;
/* 11 */            Object obj = this.f14714b;
                    switch (i) {
                        case 0:
/* 909 */                   Object[] objArr = (Object[]) obj;
/* 911 */                   objArr.getClass();
/* 916 */                   return new C2126r(objArr);
                        case 1:
/* 903 */                   int i2 = ComponentActivity.f345a;
/* 905 */                   ((ComponentActivity) obj).reportFullyDrawn();
/* 10 */                    return null;
                        case 2:
/* 858 */                   List list = (List) mc1.m6638a(((C0898ez) obj).f7921a, C0898ez.f7920c[5].getName());
/* 860 */                   if (list != null) {
/* 868 */                       arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 871 */                       Iterator it = list.iterator();
/* 879 */                       while (it.hasNext()) {
/* 896 */                           arrayList.add(new C0825cz((Map) it.next()).m2898a());
                                }
                            }
/* 900 */                   return arrayList;
                        case 3:
/* 799 */                   List list2 = (List) mc1.m6638a(((C1774iz) obj).f11968a, C1774iz.f11967c[5].getName());
/* 801 */                   if (list2 != null) {
/* 809 */                       arrayList3 = new ArrayList(C2122qw.m8020h(list2, 10));
/* 812 */                       Iterator it2 = list2.iterator();
/* 820 */                       while (it2.hasNext()) {
/* 837 */                           arrayList3.add(new C0825cz((Map) it2.next()).m2898a());
                                }
                            }
/* 841 */                   return arrayList3;
                        case 4:
/* 723 */                   String str = (String) mc1.m6638a(((ud1) obj).f17472a, ud1.f17471d[2].getName());
/* 725 */                   if (str == null) {
/* 10 */                        return null;
                            }
/* 727 */                   int iHashCode = str.hashCode();
/* 734 */                   if (iHashCode == -1412832500) {
/* 777 */                       if (str.equals("companion")) {
/* 780 */                           return wd1.f18587c;
                                }
/* 10 */                        return null;
                            }
/* 739 */                   if (iHashCode == -1102672091) {
/* 765 */                       if (str.equals("linear")) {
/* 768 */                           return wd1.f18585a;
                                }
/* 10 */                        return null;
                            }
/* 744 */                   if (iHashCode == 44243026 && str.equals("nonLinear")) {
/* 756 */                       return wd1.f18586b;
                            }
/* 10 */                    return null;
                        case 5:
/* 683 */                   String str2 = (String) mc1.m6638a(((jf1) obj).f12249a, jf1.f12248c[7].getName());
/* 691 */                   if (Intrinsics.m6216a(str2, "audio")) {
/* 693 */                       return wf1.f18604b;
                            }
/* 702 */                   if (Intrinsics.m6216a(str2, "video")) {
/* 704 */                       return wf1.f18603a;
                            }
/* 10 */                    return null;
                        case 6:
/* 653 */                   Object obj2 = ((Map) obj).get("player");
/* 657 */                   if (obj2 != null) {
/* 663 */                       return new jf1((Map) obj2);
                            }
/* 10 */                    return null;
                        case 7:
/* 606 */                   List list3 = (List) mc1.m6638a(((uf1) obj).f17502a, uf1.f17501g[6].getName());
/* 608 */                   if (list3 != null) {
/* 616 */                       arrayList2 = new ArrayList(C2122qw.m8020h(list3, 10));
/* 619 */                       Iterator it3 = list3.iterator();
/* 627 */                       while (it3.hasNext()) {
/* 644 */                           arrayList2.add(new c92((Map) it3.next()).m1552a());
                                }
                            }
/* 648 */                   return arrayList2;
                        case 8:
/* 585 */                   return Boolean.valueOf(((PackageValidation) obj).validateCaller());
                        case 9:
/* 570 */                   String str3 = (String) mc1.m6638a(((w72) obj).f18471a, w72.f18470c[1].getName());
/* 572 */                   if (str3 != null) {
/* 574 */                       return UUID.fromString(str3);
                            }
/* 10 */                    return null;
                        case 10:
/* 529 */                   C0168b5 c0168b5 = (C0168b5) obj;
/* 533 */                   Context context = (Activity) c0168b5.f2212c;
/* 535 */                   if (context == null) {
/* 541 */                       context = (Context) c0168b5.f2211b;
                            }
/* 549 */                   return fm0.m3783i(context.getPackageName(), ".flutter.share_provider");
                        case 11:
/* 516 */                   Object obj3 = ((lg2) obj).f13269a.get("configuration");
/* 520 */                   obj3.getClass();
/* 525 */                   return new uf1((Map) obj3);
                        default:
/* 34 */                    Map map = (Map) mc1.m6638a(((wq2) obj).f18749a, wq2.f18748c[11].getName());
/* 36 */                    if (map != null) {
/* 40 */                        ls1 ls1Var = new ls1(map);
/* 45 */                        ns1Var = new ns1();
/* 48 */                        u21[] u21VarArr = ls1.f13485b;
/* 53 */                        String name = u21VarArr[0].getName();
/* 57 */                        Map map2 = ls1Var.f13486a;
/* 63 */                        String str4 = (String) mc1.m6638a(map2, name);
/* 65 */                        if (str4 != null) {
/* 72 */                            ns1Var.f14420a = new hs1(str4, 0);
                                }
/* 84 */                        String str5 = (String) mc1.m6638a(map2, u21VarArr[1].getName());
/* 86 */                        if (str5 != null) {
/* 93 */                            ns1Var.f14421b = new hs1(str5, 0);
                                }
/* 105 */                       String str6 = (String) mc1.m6638a(map2, u21VarArr[2].getName());
/* 107 */                       if (str6 != null) {
/* 114 */                           ns1Var.f14422c = new hs1(str6, 0);
                                }
/* 127 */                       String str7 = (String) mc1.m6638a(map2, u21VarArr[3].getName());
/* 129 */                       if (str7 != null) {
/* 136 */                           ns1Var.f14423d = new hs1(str7, 0);
                                }
/* 149 */                       String str8 = (String) mc1.m6638a(map2, u21VarArr[4].getName());
/* 151 */                       if (str8 != null) {
/* 158 */                           ns1Var.f14424e = new hs1(str8, 0);
                                }
/* 170 */                       String str9 = (String) mc1.m6638a(map2, u21VarArr[5].getName());
/* 172 */                       if (str9 != null) {
/* 179 */                           ns1Var.f14425f = new hs1(str9, 0);
                                }
/* 191 */                       String str10 = (String) mc1.m6638a(map2, u21VarArr[6].getName());
/* 193 */                       if (str10 != null) {
/* 200 */                           ns1Var.f14426g = new hs1(str10, 0);
                                }
/* 212 */                       String str11 = (String) mc1.m6638a(map2, u21VarArr[7].getName());
/* 214 */                       if (str11 != null) {
/* 221 */                           ns1Var.f14427h = new hs1(str11, 0);
                                }
/* 235 */                       String str12 = (String) mc1.m6638a(map2, u21VarArr[8].getName());
/* 237 */                       if (str12 != null) {
/* 244 */                           ns1Var.f14428i = new hs1(str12, 3);
                                }
/* 258 */                       String str13 = (String) mc1.m6638a(map2, u21VarArr[9].getName());
/* 260 */                       if (str13 != null) {
/* 267 */                           ns1Var.f14429j = new hs1(str13, 4);
                                }
/* 279 */                       String str14 = (String) mc1.m6638a(map2, u21VarArr[10].getName());
/* 281 */                       if (str14 != null) {
/* 288 */                           ns1Var.f14430k = new hs1(str14, 1);
                                }
/* 300 */                       String str15 = (String) mc1.m6638a(map2, u21VarArr[11].getName());
/* 302 */                       if (str15 != null) {
/* 309 */                           ns1Var.f14431l = new hs1(str15, 2);
                                }
/* 323 */                       Integer num = (Integer) mc1.m6638a(map2, u21VarArr[12].getName());
/* 325 */                       if (num != null) {
/* 327 */                           final int iIntValue = num.intValue();
/* 336 */                           ns1Var.f14432m = new Function0() { // from class: is1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
/* 3 */                                     return Integer.valueOf(iIntValue);
                                        }
                                    };
                                }
/* 350 */                       String str16 = (String) mc1.m6638a(map2, u21VarArr[13].getName());
/* 352 */                       if (str16 != null) {
/* 359 */                           ns1Var.f14433n = new hs1(str16, 0);
                                }
/* 373 */                       Boolean bool = (Boolean) mc1.m6638a(map2, u21VarArr[14].getName());
/* 375 */                       if (bool != null) {
/* 377 */                           final boolean zBooleanValue = bool.booleanValue();
/* 386 */                           ns1Var.f14434o = new Function0() { // from class: js1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
/* 3 */                                     return Boolean.valueOf(zBooleanValue);
                                        }
                                    };
                                }
/* 400 */                       String str17 = (String) mc1.m6638a(map2, u21VarArr[15].getName());
/* 402 */                       if (str17 != null) {
/* 409 */                           ns1Var.f14435p = new hs1(str17, 0);
                                }
/* 423 */                       Double d = (Double) mc1.m6638a(map2, u21VarArr[16].getName());
/* 425 */                       if (d != null) {
/* 427 */                           final double dDoubleValue = d.doubleValue();
/* 436 */                           ns1Var.f14436q = new Function0() { // from class: ks1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
/* 4 */                                     return Float.valueOf((float) dDoubleValue);
                                        }
                                    };
                                }
/* 450 */                       String str18 = (String) mc1.m6638a(map2, u21VarArr[17].getName());
/* 452 */                       if (str18 != null) {
/* 459 */                           ns1Var.f14437r = new hs1(str18, 0);
                                }
/* 473 */                       String str19 = (String) mc1.m6638a(map2, u21VarArr[18].getName());
/* 475 */                       if (str19 != null) {
/* 482 */                           ns1Var.f14438s = new hs1(str19, 0);
                                }
/* 496 */                       String str20 = (String) mc1.m6638a(map2, u21VarArr[19].getName());
/* 498 */                       if (str20 != null) {
/* 505 */                           ns1Var.f14439t = new hs1(str20, 0);
                                }
                            }
/* 507 */                   return ns1Var;
                    }
                }
            }
