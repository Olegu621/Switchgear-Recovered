            package p000;

            import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
            import com.usercentrics.sdk.p009v2.settings.data.CCPASettings;
            import com.usercentrics.sdk.p009v2.settings.data.ConsentDisclosureObject;
            import com.usercentrics.sdk.p009v2.settings.data.FirstLayer;
            import com.usercentrics.sdk.p009v2.settings.data.SecondLayer;
            import com.usercentrics.sdk.p009v2.settings.data.ServiceConsentTemplate;
            import com.usercentrics.sdk.p009v2.settings.data.SubConsentTemplate;
            import com.usercentrics.sdk.p009v2.settings.data.TCF2Settings;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsCategory;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsCustomization;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsLabels;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsService;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsStyles;
            import com.usercentrics.sdk.p009v2.settings.data.VariantsSettings;
            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pc2 {

                /* JADX INFO: renamed from: a */
                public final lc2 f15064a;

                /* JADX INFO: renamed from: b */
                public final C2279v3 f15065b;

                /* JADX INFO: renamed from: c */
                public final C1032im f15066c;

                /* JADX INFO: renamed from: d */
                public kn1 f15067d;

                public pc2(lc2 lc2Var, C2279v3 c2279v3, C1032im c1032im) {
/* 1 */             c1032im.getClass();
/* 7 */             this.f15064a = lc2Var;
/* 9 */             this.f15065b = c2279v3;
/* 11 */            this.f15066c = c1032im;
                }

                /* JADX WARN: Code duplicated, block: B:74:0x0288  */
                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                /* JADX INFO: renamed from: a */
                public final Serializable m7385a(String str, UsercentricsSettings usercentricsSettings, boolean z, d10 d10Var) {
                    mc2 mc2Var;
                    Map map;
                    int iIntValue;
                    Object objM9209j;
                    Object next;
/* 1 */             pc2 pc2Var = this;
/* 3 */             UsercentricsSettings usercentricsSettings2 = usercentricsSettings;
/* 9 */             if (d10Var instanceof mc2) {
/* 12 */                mc2Var = (mc2) d10Var;
/* 14 */                int i = mc2Var.f13699i;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    mc2Var.f13699i = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    mc2Var = new mc2(pc2Var, d10Var);
                        }
                    } else {
/* 28 */                mc2Var = new mc2(pc2Var, d10Var);
                    }
/* 31 */            Object obj = mc2Var.f13697e;
/* 33 */            z10 z10Var = z10.f19902a;
/* 35 */            int i2 = mc2Var.f13699i;
/* 37 */            String str2 = null;
/* 41 */            boolean z2 = true;
/* 42 */            if (i2 == 0) {
/* 72 */                pg3.m7417A(obj);
/* 75 */                List list = usercentricsSettings2.f6700H;
/* 77 */                if (list == null) {
/* 79 */                    map = od0.f14715a;
/* 81 */                    map.getClass();
                        } else {
/* 89 */                    int iM6962c = nc1.m6962c(C2122qw.m8020h(list, 10));
/* 95 */                    if (iM6962c < 16) {
/* 97 */                        iM6962c = 16;
                            }
/* 100 */                   LinkedHashMap linkedHashMap = new LinkedHashMap(iM6962c);
/* 111 */                   for (Object obj2 : list) {
/* 122 */                       linkedHashMap.put(((UsercentricsCategory) obj2).f6533a, obj2);
                            }
/* 126 */                   map = linkedHashMap;
                        }
/* 129 */               ArrayList arrayList = new ArrayList();
/* 138 */               int i3 = 0;
/* 143 */               for (ServiceConsentTemplate serviceConsentTemplate : usercentricsSettings2.f6699G) {
/* 157 */                   if (map.containsKey(serviceConsentTemplate.f6451e)) {
/* 173 */                       arrayList.add(new C2295vi(serviceConsentTemplate.mo2821b(), serviceConsentTemplate.mo2824e()));
/* 186 */                       for (SubConsentTemplate subConsentTemplate : serviceConsentTemplate.f6454h) {
/* 207 */                           arrayList.add(new C2295vi(subConsentTemplate.mo2821b(), subConsentTemplate.mo2824e()));
                                }
/* 211 */                       i3++;
                            }
                        }
/* 219 */               List listM6186E = CollectionsKt.m6186E(new wa3(10), arrayList);
/* 223 */               Integer numValueOf = Integer.valueOf(i3);
/* 231 */               if (listM6186E.isEmpty()) {
/* 242 */                   return new Pair(nd0.f14189a, new Integer(0));
                        }
/* 246 */               iIntValue = numValueOf.intValue();
/* 250 */               mc2Var.f13693a = pc2Var;
/* 252 */               mc2Var.f13694b = usercentricsSettings2;
/* 254 */               mc2Var.f13695c = map;
/* 256 */               mc2Var.f13696d = iIntValue;
/* 258 */               mc2Var.f13699i = 1;
/* 266 */               objM9209j = pc2Var.f15065b.m9209j(str, listM6186E, z, mc2Var);
/* 270 */               if (objM9209j == z10Var) {
/* 272 */                   return z10Var;
                        }
                    } else {
/* 44 */                if (i2 != 1) {
/* 68 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 37 */                    return null;
                        }
/* 46 */                int i4 = mc2Var.f13696d;
/* 50 */                Map map2 = (Map) mc2Var.f13695c;
/* 52 */                UsercentricsSettings usercentricsSettings3 = mc2Var.f13694b;
/* 54 */                pc2 pc2Var2 = mc2Var.f13693a;
/* 56 */                pg3.m7417A(obj);
/* 59 */                iIntValue = i4;
/* 60 */                pc2Var = pc2Var2;
/* 61 */                objM9209j = obj;
/* 62 */                map = map2;
/* 63 */                usercentricsSettings2 = usercentricsSettings3;
                    }
/* 273 */           List<UsercentricsService> list2 = (List) objM9209j;
/* 277 */           List list3 = usercentricsSettings2.f6699G;
/* 279 */           pc2Var.getClass();
/* 284 */           ArrayList arrayList2 = new ArrayList();
/* 293 */           ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(list2, 10));
/* 304 */           for (UsercentricsService usercentricsService : list2) {
/* 312 */               Iterator it = list3.iterator();
/* 337 */               do {
/* 320 */                   if (!it.hasNext()) {
/* 340 */                       next = str2;
                                break;
                            }
/* 322 */                   next = it.next();
/* 337 */               } while (!Intrinsics.m6216a(usercentricsService.f6666a, ((ServiceConsentTemplate) next).f6449c));
/* 341 */               ServiceConsentTemplate serviceConsentTemplate2 = (ServiceConsentTemplate) next;
/* 353 */               UsercentricsCategory usercentricsCategory = (UsercentricsCategory) map.get(serviceConsentTemplate2 != null ? serviceConsentTemplate2.f6451e : str2);
/* 355 */               if (serviceConsentTemplate2 != null) {
/* 357 */                   List list4 = serviceConsentTemplate2.f6456j;
/* 359 */                   if (usercentricsCategory != null) {
/* 361 */                       if (list4 == null || list4.isEmpty()) {
/* 372 */                           list4 = usercentricsService.f6681p;
                                }
/* 369 */                       List list5 = list4;
/* 375 */                       String str3 = usercentricsCategory.f6533a;
/* 377 */                       Boolean bool = serviceConsentTemplate2.f6447a;
/* 379 */                       Boolean bool2 = serviceConsentTemplate2.f6455i;
/* 381 */                       Boolean bool3 = serviceConsentTemplate2.f6457k;
/* 383 */                       boolean z3 = usercentricsCategory.f6536d;
/* 397 */                       boolean z4 = (usercentricsCategory.f6537e || serviceConsentTemplate2.f6453g) ? z2 : false;
/* 399 */                       UsercentricsService.Companion companion = UsercentricsService.Companion;
/* 403 */                       String str4 = usercentricsService.f6666a;
/* 405 */                       String str5 = usercentricsService.f6667b;
/* 407 */                       String str6 = usercentricsService.f6668c;
/* 409 */                       List list6 = usercentricsService.f6669d;
/* 413 */                       String str7 = usercentricsService.f6670e;
/* 417 */                       List list7 = usercentricsService.f6671f;
/* 421 */                       String str8 = usercentricsService.f6672g;
/* 425 */                       String str9 = usercentricsService.f6673h;
/* 429 */                       String str10 = usercentricsService.f6674i;
/* 433 */                       String str11 = usercentricsService.f6675j;
/* 437 */                       List list8 = usercentricsService.f6676k;
/* 441 */                       List list9 = usercentricsService.f6677l;
/* 445 */                       List list10 = usercentricsService.f6678m;
/* 449 */                       List list11 = usercentricsService.f6679n;
/* 453 */                       List list12 = usercentricsService.f6680o;
/* 457 */                       List list13 = usercentricsService.f6682q;
/* 461 */                       List list14 = usercentricsService.f6683r;
/* 465 */                       String str12 = usercentricsService.f6684s;
/* 469 */                       String str13 = usercentricsService.f6685t;
/* 473 */                       String str14 = usercentricsService.f6686u;
/* 477 */                       Boolean bool4 = usercentricsService.f6687v;
/* 481 */                       String str15 = usercentricsService.f6688w;
/* 485 */                       String str16 = usercentricsService.f6689x;
/* 489 */                       String str17 = usercentricsService.f6690y;
/* 493 */                       String str18 = usercentricsService.f6691z;
/* 497 */                       String str19 = usercentricsService.f6646B;
/* 501 */                       String str20 = usercentricsService.f6647C;
/* 505 */                       String str21 = usercentricsService.f6648D;
/* 509 */                       String str22 = usercentricsService.f6649E;
/* 513 */                       String str23 = usercentricsService.f6650F;
/* 517 */                       String str24 = usercentricsService.f6651G;
/* 521 */                       String str25 = usercentricsService.f6652H;
/* 525 */                       String str26 = usercentricsService.f6653I;
/* 529 */                       String str27 = usercentricsService.f6654J;
/* 533 */                       Long l = usercentricsService.f6655K;
/* 537 */                       Boolean bool5 = usercentricsService.f6656L;
/* 541 */                       String str28 = usercentricsService.f6657M;
/* 545 */                       ConsentDisclosureObject consentDisclosureObject = usercentricsService.f6658N;
/* 549 */                       String str29 = usercentricsService.f6659O;
/* 551 */                       String str30 = usercentricsService.f6661Q;
/* 553 */                       list7.getClass();
/* 556 */                       str9.getClass();
/* 559 */                       str10.getClass();
/* 562 */                       str11.getClass();
/* 565 */                       list8.getClass();
/* 568 */                       list9.getClass();
/* 571 */                       list10.getClass();
/* 574 */                       list11.getClass();
/* 577 */                       list12.getClass();
/* 580 */                       list5.getClass();
/* 583 */                       list13.getClass();
/* 586 */                       str12.getClass();
/* 589 */                       str15.getClass();
/* 592 */                       str16.getClass();
/* 595 */                       str17.getClass();
/* 598 */                       str18.getClass();
/* 601 */                       str20.getClass();
/* 604 */                       str21.getClass();
/* 607 */                       str22.getClass();
/* 610 */                       str23.getClass();
/* 613 */                       str24.getClass();
/* 616 */                       str26.getClass();
/* 619 */                       consentDisclosureObject.getClass();
/* 645 */                       arrayList2.add(new UsercentricsService(str4, str5, str6, list6, str7, list7, str8, str9, str10, str11, list8, list9, list10, list11, list12, list5, list13, list14, str12, str13, str14, bool4, str15, str16, str17, str18, str3, str19, str20, str21, str22, str23, str24, str25, str26, str27, l, bool5, str28, consentDisclosureObject, str29, z4, str30, bool, bool2, bool3, z3));
                            }
                        }
/* 653 */               arrayList3.add(Unit.f12910a);
/* 656 */               list3 = list3;
/* 658 */               str2 = null;
/* 660 */               z2 = true;
                    }
/* 668 */           return new Pair(arrayList2, new Integer(iIntValue));
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                /* JADX INFO: renamed from: b */
                public final Object m7386b(SettingsInitializationParameters settingsInitializationParameters, d10 d10Var) {
                    nc2 nc2Var;
/* 1 */             pc2 pc2Var = this;
/* 3 */             SettingsInitializationParameters settingsInitializationParameters2 = settingsInitializationParameters;
/* 9 */             if (d10Var instanceof nc2) {
/* 12 */                nc2Var = (nc2) d10Var;
/* 14 */                int i = nc2Var.f14186e;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    nc2Var.f14186e = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    nc2Var = new nc2(pc2Var, d10Var);
                        }
                    } else {
/* 28 */                nc2Var = new nc2(pc2Var, d10Var);
                    }
/* 31 */            Object objM6416i = nc2Var.f14184c;
/* 33 */            z10 z10Var = z10.f19902a;
/* 35 */            int i2 = nc2Var.f14186e;
/* 37 */            boolean z = true;
/* 38 */            if (i2 == 0) {
/* 62 */                pg3.m7417A(objM6416i);
/* 65 */                nc2Var.f14182a = pc2Var;
/* 67 */                nc2Var.f14183b = settingsInitializationParameters2;
/* 69 */                nc2Var.f14186e = 1;
/* 73 */                objM6416i = pc2Var.f15064a.m6416i(settingsInitializationParameters2, nc2Var);
/* 77 */                if (objM6416i == z10Var) {
/* 79 */                    return z10Var;
                        }
                    } else {
/* 40 */                if (i2 != 1) {
/* 57 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 60 */                    return null;
                        }
/* 42 */                SettingsInitializationParameters settingsInitializationParameters3 = nc2Var.f14183b;
/* 44 */                pc2 pc2Var2 = nc2Var.f14182a;
/* 46 */                pg3.m7417A(objM6416i);
/* 51 */                settingsInitializationParameters2 = settingsInitializationParameters3;
/* 52 */                pc2Var = pc2Var2;
                    }
/* 80 */            UsercentricsSettings usercentricsSettings = (UsercentricsSettings) objM6416i;
/* 82 */            C1032im c1032im = pc2Var.f15066c;
/* 84 */            boolean z2 = settingsInitializationParameters2.f6080e;
/* 88 */            boolean z3 = pc2Var.f15064a.f13185f;
/* 90 */            c1032im.getClass();
/* 93 */            if (!z2 && !z3) {
/* 98 */                z = false;
                    }
/* 99 */            c1032im.f9710a = z;
/* 101 */           List list = usercentricsSettings.f6699G;
/* 105 */           ArrayList arrayList = new ArrayList();
/* 116 */           for (Object obj : list) {
/* 133 */               if (!Intrinsics.m6216a(((ServiceConsentTemplate) obj).f6447a, Boolean.TRUE)) {
/* 135 */                   arrayList.add(obj);
                        }
                    }
/* 139 */           UsercentricsLabels usercentricsLabels = usercentricsSettings.f6701a;
/* 141 */           SecondLayer secondLayer = usercentricsSettings.f6702b;
/* 143 */           String str = usercentricsSettings.f6703c;
/* 145 */           String str2 = usercentricsSettings.f6704d;
/* 147 */           String str3 = usercentricsSettings.f6705e;
/* 149 */           String str4 = usercentricsSettings.f6706f;
/* 151 */           String str5 = usercentricsSettings.f6707g;
/* 153 */           String str6 = usercentricsSettings.f6708h;
/* 155 */           String str7 = usercentricsSettings.f6709i;
/* 157 */           String str8 = usercentricsSettings.f6710j;
/* 159 */           boolean z4 = usercentricsSettings.f6711k;
/* 161 */           boolean z5 = usercentricsSettings.f6712l;
/* 163 */           boolean z6 = usercentricsSettings.f6713m;
/* 165 */           boolean z7 = usercentricsSettings.f6714n;
/* 169 */           Integer num = usercentricsSettings.f6715o;
/* 173 */           List list2 = usercentricsSettings.f6716p;
/* 177 */           List list3 = usercentricsSettings.f6717q;
/* 181 */           List list4 = usercentricsSettings.f6718r;
/* 185 */           CCPASettings cCPASettings = usercentricsSettings.f6719s;
/* 189 */           TCF2Settings tCF2Settings = usercentricsSettings.f6720t;
/* 193 */           UsercentricsCustomization usercentricsCustomization = usercentricsSettings.f6721u;
/* 197 */           FirstLayer firstLayer = usercentricsSettings.f6722v;
/* 201 */           UsercentricsStyles usercentricsStyles = usercentricsSettings.f6723w;
/* 205 */           boolean z8 = usercentricsSettings.f6724x;
/* 209 */           boolean z9 = usercentricsSettings.f6725y;
/* 213 */           boolean z10 = usercentricsSettings.f6726z;
/* 217 */           VariantsSettings variantsSettings = usercentricsSettings.f6693A;
/* 221 */           q90 q90Var = usercentricsSettings.f6694B;
/* 225 */           yw2 yw2Var = usercentricsSettings.f6695C;
/* 229 */           List list5 = usercentricsSettings.f6696D;
/* 233 */           Long l = usercentricsSettings.f6697E;
/* 237 */           boolean z11 = usercentricsSettings.f6698F;
/* 239 */           List list6 = usercentricsSettings.f6700H;
/* 241 */           usercentricsLabels.getClass();
/* 244 */           secondLayer.getClass();
/* 247 */           str.getClass();
/* 250 */           str2.getClass();
/* 253 */           str8.getClass();
/* 256 */           list2.getClass();
/* 259 */           list3.getClass();
/* 262 */           list4.getClass();
/* 275 */           return new UsercentricsSettings(usercentricsLabels, secondLayer, str, str2, str3, str4, str5, str6, str7, str8, z4, z5, z6, z7, num, list2, list3, list4, cCPASettings, tCF2Settings, usercentricsCustomization, firstLayer, usercentricsStyles, z8, z9, z10, variantsSettings, q90Var, yw2Var, list5, l, z11, arrayList, list6);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: c */
                public final Object m7387c(SettingsInitializationParameters settingsInitializationParameters, d10 d10Var) {
                    oc2 oc2Var;
                    pc2 pc2Var;
                    UsercentricsSettings usercentricsSettings;
/* 3 */             if (d10Var instanceof oc2) {
/* 6 */                 oc2Var = (oc2) d10Var;
/* 8 */                 int i = oc2Var.f14711e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oc2Var.f14711e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oc2Var = new oc2(this, d10Var);
                        }
                    } else {
/* 22 */                oc2Var = new oc2(this, d10Var);
                    }
/* 25 */            Object objM7386b = oc2Var.f14709c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = oc2Var.f14711e;
/* 33 */            if (i2 == 0) {
/* 67 */                pg3.m7417A(objM7386b);
/* 70 */                oc2Var.f14707a = this;
/* 72 */                oc2Var.f14708b = settingsInitializationParameters;
/* 74 */                oc2Var.f14711e = 1;
/* 76 */                objM7386b = m7386b(settingsInitializationParameters, oc2Var);
/* 80 */                if (objM7386b != z10Var) {
                        }
/* 103 */               return z10Var;
                    }
/* 35 */            if (i2 == 1) {
/* 59 */                settingsInitializationParameters = (SettingsInitializationParameters) oc2Var.f14708b;
/* 61 */                this = oc2Var.f14707a;
/* 63 */                pg3.m7417A(objM7386b);
                    } else {
/* 37 */                if (i2 != 2) {
/* 51 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 54 */                    return null;
                        }
/* 41 */                usercentricsSettings = (UsercentricsSettings) oc2Var.f14708b;
/* 43 */                pc2Var = oc2Var.f14707a;
/* 45 */                pg3.m7417A(objM7386b);
                    }
/* 108 */           Pair pair = (Pair) objM7386b;
/* 127 */           pc2Var.f15067d = new kn1(usercentricsSettings, (List) pair.f12908a, ((Number) pair.f12909b).intValue());
/* 129 */           return Unit.f12910a;
/* 83 */            UsercentricsSettings usercentricsSettings2 = (UsercentricsSettings) objM7386b;
/* 85 */            String str = settingsInitializationParameters.f6078c;
/* 89 */            boolean z = this.f15066c.f9710a;
/* 91 */            oc2Var.f14707a = this;
/* 93 */            oc2Var.f14708b = usercentricsSettings2;
/* 95 */            oc2Var.f14711e = 2;
/* 97 */            Serializable serializableM7385a = this.m7385a(str, usercentricsSettings2, z, oc2Var);
/* 101 */           if (serializableM7385a != z10Var) {
/* 105 */               pc2Var = this;
/* 106 */               usercentricsSettings = usercentricsSettings2;
/* 107 */               objM7386b = serializableM7385a;
/* 108 */               Pair pair2 = (Pair) objM7386b;
/* 127 */               pc2Var.f15067d = new kn1(usercentricsSettings, (List) pair2.f12908a, ((Number) pair2.f12909b).intValue());
/* 129 */               return Unit.f12910a;
                    }
/* 103 */           return z10Var;
                }
            }
