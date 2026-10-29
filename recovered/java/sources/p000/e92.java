            package p000;

            import com.usercentrics.tcf.core.model.gvl.Vendor;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class e92 extends b51 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ wp0 f7579a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ u13 f7580b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f7581c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ xz1 f7582d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ql2 f7583e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e92(wp0 wp0Var, u13 u13Var, String str, xz1 xz1Var, ql2 ql2Var) {
/* 12 */            super(2);
/* 1 */             this.f7579a = wp0Var;
/* 3 */             this.f7580b = u13Var;
/* 5 */             this.f7581c = str;
/* 7 */             this.f7582d = xz1Var;
/* 9 */             this.f7583e = ql2Var;
                }

                /* JADX WARN: Code duplicated, block: B:131:0x0284  */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    List list;
                    List list2;
                    List list3;
                    List list4;
                    List list5;
/* 7 */             boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 15 */            int iIntValue = ((Number) obj2).intValue();
/* 19 */            if (zBooleanValue) {
/* 25 */                Map map = this.f7579a.f18719b;
/* 27 */                map.getClass();
/* 38 */                Vendor vendor = (Vendor) map.get(String.valueOf(iIntValue));
/* 40 */                u13 u13Var = this.f7580b;
/* 42 */                if (vendor != null) {
/* 44 */                    List list6 = vendor.f6834c;
/* 46 */                    List list7 = vendor.f6835d;
/* 48 */                    List list8 = vendor.f6833b;
/* 50 */                    List list9 = vendor.f6832a;
/* 52 */                    String str = vendor.f6839h;
/* 54 */                    if (str == null || StringsKt.m6228D(str)) {
/* 62 */                        String str2 = this.f7581c;
/* 70 */                        if (Intrinsics.m6216a(str2, "legIntPurposes") && list9.isEmpty() && list8.isEmpty() && !list7.isEmpty()) {
/* 90 */                            u13Var.m8935b(iIntValue);
                                } else if (!Intrinsics.m6216a(str2, "legIntPurposes") || list9.isEmpty() || !list8.isEmpty() || list7.isEmpty()) {
/* 130 */                           ArrayList<wz1> arrayListM10050b = this.f7582d.m10050b(Integer.valueOf(iIntValue));
/* 138 */                           int i = 1;
/* 139 */                           if (Intrinsics.m6216a(str2, "legIntPurposes")) {
/* 143 */                               h22 h22Var = new h22();
/* 150 */                               h22Var.f8873a = CollectionsKt.m6194M(list8);
/* 154 */                               h22 h22Var2 = new h22();
/* 161 */                               h22Var2.f8873a = CollectionsKt.m6194M(list9);
/* 171 */                               for (wz1 wz1Var : arrayListM10050b) {
/* 183 */                                   int iOrdinal = wz1Var.m9670b().ordinal();
/* 187 */                                   if (iOrdinal == 0) {
/* 378 */                                       list3 = list7;
/* 380 */                                       list4 = list8;
/* 382 */                                       list5 = list9;
/* 386 */                                       ArrayList arrayList = new ArrayList();
/* 397 */                                       for (Object obj3 : list5) {
/* 406 */                                           int iIntValue2 = ((Number) obj3).intValue();
/* 410 */                                           Integer num = wz1Var.f18878a;
/* 412 */                                           if (num == null || iIntValue2 != num.intValue()) {
/* 421 */                                               arrayList.add(obj3);
                                                    }
                                                }
/* 430 */                                       h22Var2.f8873a = new ArrayList(arrayList);
/* 434 */                                       ArrayList arrayList2 = new ArrayList();
/* 445 */                                       for (Object obj4 : list4) {
/* 454 */                                           int iIntValue3 = ((Number) obj4).intValue();
/* 458 */                                           Integer num2 = wz1Var.f18878a;
/* 460 */                                           if (num2 == null || iIntValue3 != num2.intValue()) {
/* 469 */                                               arrayList2.add(obj4);
                                                    }
                                                }
/* 478 */                                       h22Var.f8873a = new ArrayList(arrayList2);
                                            } else if (iOrdinal == i) {
/* 297 */                                       list3 = list7;
/* 299 */                                       list4 = list8;
/* 301 */                                       list5 = list9;
/* 305 */                                       Iterable iterable = (Iterable) h22Var.f8873a;
/* 309 */                                       ArrayList arrayList3 = new ArrayList();
/* 320 */                                       for (Object obj5 : iterable) {
/* 329 */                                           int iIntValue4 = ((Number) obj5).intValue();
/* 333 */                                           Integer num3 = wz1Var.f18878a;
/* 335 */                                           if (num3 == null || iIntValue4 != num3.intValue()) {
/* 366 */                                               arrayList3.add(obj5);
                                                    } else if (list6.contains(Integer.valueOf(iIntValue4))) {
/* 362 */                                               ((List) h22Var2.f8873a).add(Integer.valueOf(iIntValue4));
                                                    }
                                                }
/* 375 */                                       h22Var.f8873a = new ArrayList(arrayList3);
                                            } else if (iOrdinal != 2) {
/* 194 */                                       list3 = list7;
/* 196 */                                       list4 = list8;
/* 198 */                                       list5 = list9;
                                            } else {
/* 204 */                                       Iterable iterable2 = (Iterable) h22Var2.f8873a;
/* 208 */                                       ArrayList arrayList4 = new ArrayList();
/* 219 */                                       for (Object obj6 : iterable2) {
/* 221 */                                           List list10 = list7;
/* 231 */                                           List list11 = list8;
/* 233 */                                           int iIntValue5 = ((Number) obj6).intValue();
/* 237 */                                           List list12 = list9;
/* 239 */                                           Integer num4 = wz1Var.f18878a;
/* 241 */                                           if (num4 == null || iIntValue5 != num4.intValue()) {
/* 278 */                                               arrayList4.add(obj6);
                                                    } else if (list6.contains(Integer.valueOf(iIntValue5))) {
/* 268 */                                               ((List) h22Var.f8873a).add(Integer.valueOf(iIntValue5));
                                                    }
/* 271 */                                           list8 = list11;
/* 273 */                                           list7 = list10;
/* 275 */                                           list9 = list12;
                                                }
/* 282 */                                       list3 = list7;
/* 284 */                                       list4 = list8;
/* 286 */                                       list5 = list9;
/* 293 */                                       h22Var2.f8873a = new ArrayList(arrayList4);
                                            }
/* 480 */                                   list8 = list4;
/* 482 */                                   list7 = list3;
/* 484 */                                   list9 = list5;
/* 486 */                                   i = 1;
                                        }
/* 489 */                               List list13 = list7;
/* 491 */                               list = list8;
/* 493 */                               list2 = list9;
/* 503 */                               if (!((List) h22Var2.f8873a).isEmpty() || !((List) h22Var.f8873a).isEmpty() || list13.isEmpty()) {
/* 531 */                                   if (((List) h22Var.f8873a).isEmpty()) {
/* 533 */                                       u13Var.m8937d(iIntValue);
                                            }
                                        }
                                    } else {
/* 538 */                               list = list8;
/* 540 */                               list2 = list9;
                                    }
/* 567 */                           if ((Intrinsics.m6216a(str2, "purposes") ? list2.size() : Intrinsics.m6216a(str2, "legIntPurposes") ? list.size() : -1) == 0) {
/* 572 */                               boolean z = this.f7583e.f15624c;
/* 574 */                               if (!(z && list6.isEmpty()) && z) {
/* 594 */                                   boolean z2 = false;
/* 599 */                                   for (int i2 = 0; i2 < arrayListM10050b.size() && !z2; i2++) {
/* 609 */                                       l42 l42VarM9670b = ((wz1) arrayListM10050b.get(i2)).m9670b();
/* 635 */                                       z2 = (l42VarM9670b == l42.REQUIRE_CONSENT && Intrinsics.m6216a(str2, "purposes")) || (l42VarM9670b == l42.REQUIRE_LI && Intrinsics.m6216a(str2, "legIntPurposes"));
                                            }
/* 639 */                                   if (!z2) {
/* 641 */                                       u13Var.m8937d(iIntValue);
                                            }
                                        } else {
/* 588 */                                   u13Var.m8937d(iIntValue);
                                        }
                                    }
                                } else {
/* 119 */                           u13Var.m8935b(iIntValue);
                                }
                            } else {
/* 645 */                       u13Var.m8937d(iIntValue);
                            }
                        } else {
/* 645 */                   u13Var.m8937d(iIntValue);
                        }
                    }
/* 648 */           return Unit.f12910a;
                }
            }
