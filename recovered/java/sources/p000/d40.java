            package p000;

            import com.usercentrics.sdk.p009v2.consent.data.DataTransferObject;
            import com.usercentrics.sdk.p009v2.consent.data.DataTransferObjectConsent;
            import com.usercentrics.sdk.p009v2.consent.data.DataTransferObjectService;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageConsentHistory;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageService;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageSettings;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class d40 {
                public static final c40 Companion = new c40();

                /* JADX INFO: renamed from: a */
                public final InterfaceC1811jz f6972a;

                /* JADX INFO: renamed from: b */
                public final ac2 f6973b;

                /* JADX INFO: renamed from: c */
                public final pc2 f6974c;

                /* JADX INFO: renamed from: d */
                public final g80 f6975d;

                public d40(InterfaceC1811jz interfaceC1811jz, ac2 ac2Var, pc2 pc2Var, g80 g80Var, il2 il2Var, C2484y3 c2484y3, i03 i03Var) {
/* 1 */             interfaceC1811jz.getClass();
/* 4 */             ac2Var.getClass();
/* 7 */             pc2Var.getClass();
/* 10 */            g80Var.getClass();
/* 13 */            il2Var.getClass();
/* 16 */            c2484y3.getClass();
/* 19 */            i03Var.getClass();
/* 25 */            this.f6972a = interfaceC1811jz;
/* 27 */            this.f6973b = ac2Var;
/* 29 */            this.f6974c = pc2Var;
/* 31 */            this.f6975d = g80Var;
                }

                /* JADX INFO: renamed from: a */
                public final ArrayList m2920a(String str, List list, DataTransferObject dataTransferObject) {
                    Object next;
                    List list2;
                    m61 m61Var;
/* 1 */             DataTransferObject dataTransferObject2 = dataTransferObject;
/* 3 */             List list3 = dataTransferObject2.f6319d;
/* 15 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 18 */            Iterator it = list.iterator();
/* 26 */            while (it.hasNext()) {
/* 32 */                m61 m61Var2 = (m61) it.next();
/* 34 */                Iterator it2 = list3.iterator();
/* 38 */                int i = 0;
                        while (true) {
/* 44 */                    if (!it2.hasNext()) {
/* 68 */                        i = -1;
                                break;
                            }
/* 60 */                    if (Intrinsics.m6216a(((DataTransferObjectService) it2.next()).f6324a, m61Var2.f13580f)) {
                                break;
                            }
/* 65 */                    i++;
                        }
/* 72 */                pz2 pz2Var = (pz2) this.f6975d;
/* 78 */                Iterator it3 = pz2Var.f15355f.f6142d.iterator();
/* 103 */               do {
/* 86 */                    if (!it3.hasNext()) {
/* 106 */                       next = null;
                                break;
                            }
/* 88 */                    next = it3.next();
/* 103 */               } while (!Intrinsics.m6216a(((StorageService) next).f6133b, m61Var2.f13580f));
/* 107 */               StorageService storageService = (StorageService) next;
/* 109 */               if (i > -1) {
/* 113 */                   ArrayList arrayList2 = new ArrayList();
/* 116 */                   i61 i61Var = m61Var2.f13590p;
/* 118 */                   List list4 = m61Var2.f13594t;
/* 120 */                   String str2 = m61Var2.f13589o;
/* 122 */                   String str3 = m61Var2.f13588n;
/* 124 */                   aw1 aw1Var = m61Var2.f13586l;
/* 126 */                   hv1 hv1Var = m61Var2.f13583i;
/* 130 */                   mu1 mu1Var = m61Var2.f13576b;
/* 134 */                   arrayList2.addAll(i61Var.f9465a);
/* 145 */                   long j = dataTransferObject2.f6320e * 1000;
/* 149 */                   DataTransferObjectConsent dataTransferObjectConsent = dataTransferObject2.f6317b;
/* 180 */                   arrayList2.add(new j61(dataTransferObjectConsent.f6322a, ((DataTransferObjectService) list3.get(i)).f6326c, dataTransferObjectConsent.f6323b, dataTransferObject2.f6318c.f6331c, j));
/* 193 */                   j61 j61Var = (j61) arrayList2.get(arrayList2.size() - 1);
/* 205 */                   if (!Intrinsics.m6216a(str, pz2Var.f15355f.f6139a) || storageService == null) {
/* 386 */                       list2 = list3;
                            } else {
/* 209 */                       List list5 = storageService.f6132a;
/* 211 */                       list2 = list3;
/* 243 */                       if ((!list5.isEmpty() ? ((StorageConsentHistory) list5.get(list5.size() - 1)).f6126e : 0L) >= j61Var.f12099e) {
/* 247 */                           List list6 = m61Var2.f13575a;
/* 251 */                           List list7 = m61Var2.f13577c;
/* 253 */                           List list8 = m61Var2.f13578d;
/* 255 */                           String str4 = m61Var2.f13579e;
/* 257 */                           String str5 = m61Var2.f13580f;
/* 259 */                           List list9 = m61Var2.f13581g;
/* 261 */                           String str6 = m61Var2.f13582h;
/* 265 */                           String str7 = m61Var2.f13584j;
/* 269 */                           List list10 = m61Var2.f13585k;
/* 273 */                           String str8 = m61Var2.f13587m;
/* 277 */                           boolean z = m61Var2.f13591q;
/* 281 */                           String str9 = m61Var2.f13593s;
/* 283 */                           boolean z2 = storageService.f6135d;
/* 299 */                           ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(list5, 10));
/* 302 */                           Iterator it4 = list5.iterator();
/* 310 */                           while (it4.hasNext()) {
/* 322 */                               arrayList3.add(((StorageConsentHistory) it4.next()).m2781a());
                                    }
/* 373 */                           m61Var = new m61(list6, mu1Var, list7, list8, str4, str5, list9, str6, hv1Var, str7, list10, aw1Var, str8, str3, str2, new i61(CollectionsKt.m6188G(arrayList3), z2), z, m61Var2.f13592r, str9, list4, m61Var2.f13595u, m61Var2.f13596v, m61Var2.f13597w, m61Var2.f13598x, m61Var2.f13599y, m61Var2.f13600z);
                                }
/* 376 */                       m61Var2 = m61Var;
                            }
/* 475 */                   m61Var = new m61(m61Var2.f13575a, mu1Var, m61Var2.f13577c, m61Var2.f13578d, m61Var2.f13579e, m61Var2.f13580f, m61Var2.f13581g, m61Var2.f13582h, hv1Var, m61Var2.f13584j, m61Var2.f13585k, aw1Var, m61Var2.f13587m, str3, str2, new i61(CollectionsKt.m6188G(arrayList2), j61Var.f12096b), m61Var2.f13591q, m61Var2.f13592r, m61Var2.f13593s, list4, m61Var2.f13595u, m61Var2.f13596v, m61Var2.f13597w, m61Var2.f13598x, m61Var2.f13599y, m61Var2.f13600z);
/* 376 */                   m61Var2 = m61Var;
                        } else {
/* 481 */                   list2 = list3;
                        }
/* 484 */               arrayList.add(m61Var2);
/* 487 */               it = it;
/* 489 */               dataTransferObject2 = dataTransferObject;
/* 491 */               list3 = list2;
                    }
/* 496 */           return arrayList;
                }

                /* JADX INFO: renamed from: b */
                public final void m2921b(String str, List list, kz2 kz2Var, mz2 mz2Var) {
/* 1 */             str.getClass();
/* 4 */             list.getClass();
/* 9 */             kn1 kn1Var = this.f6974c.f15067d;
/* 11 */            c10 c10Var = null;
/* 18 */            UsercentricsSettings usercentricsSettings = kn1Var != null ? kn1Var.f12892a : null;
/* 19 */            if (usercentricsSettings == null) {
/* 159 */               return;
                    }
/* 23 */            DataTransferObject.Companion companion = DataTransferObject.Companion;
/* 25 */            ac2 ac2Var = this.f6973b;
/* 46 */            List<m61> listM7882O = qj3.m7882O(ac2Var.f182c.f12611b, m2920a(str, list, DataTransferObject.Companion.m2817a(companion, usercentricsSettings, ac2Var.f182c.f12614e, list, kz2Var, mz2Var)));
/* 58 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(listM7882O, 10));
/* 69 */            for (m61 m61VarM6609a : listM7882O) {
/* 86 */                if (m61VarM6609a.f13590p.f9465a.size() > 3) {
/* 88 */                    i61 i61Var = m61VarM6609a.f13590p;
/* 92 */                    List listM6188G = CollectionsKt.m6188G(i61Var.f9465a);
/* 96 */                    boolean z = i61Var.f9466b;
/* 98 */                    listM6188G.getClass();
/* 106 */                   m61VarM6609a = m61.m6609a(m61VarM6609a, new i61(listM6188G, z));
                        }
/* 110 */               arrayList.add(m61VarM6609a);
                    }
/* 118 */           k61 k61VarM5996a = k61.m5996a(ac2Var.f182c, arrayList, null, 16381);
/* 122 */           ac2Var.f182c = k61VarM5996a;
/* 126 */           pz2 pz2Var = (pz2) this.f6975d;
/* 128 */           pz2Var.m7635g(k61VarM5996a, arrayList);
/* 133 */           C1945mz c1945mz = (C1945mz) this.f6972a;
/* 143 */           c1945mz.f14069a.m9743b(new C2107qh(c1945mz, kz2Var, c10Var, 1));
/* 148 */           if (kz2Var != kz2.INITIAL_PAGE_LOAD) {
/* 150 */               od2 od2Var = pz2Var.f15354e;
/* 152 */               fh2[] fh2VarArr = fh2.f8216a;
/* 156 */               od2Var.m7135a("user_action_required");
                    }
                }

                /* JADX INFO: renamed from: c */
                public final jh1 m2922c() {
                    Object next;
                    Object obj;
/* 3 */             C0170b7 c0170b7 = C0170b7.f2268i;
/* 9 */             StorageSettings storageSettings = ((pz2) this.f6975d).f15355f;
/* 11 */            ac2 ac2Var = this.f6973b;
/* 15 */            List list = ac2Var.f182c.f12611b;
/* 19 */            ArrayList arrayList = new ArrayList();
/* 30 */            for (Object obj2 : list) {
/* 41 */                if (((m61) obj2).f13591q) {
/* 43 */                    arrayList.add(obj2);
                        }
                    }
/* 47 */            List listM4309D0 = hu0.m4309D0(arrayList, c0170b7);
/* 53 */            ArrayList arrayList2 = new ArrayList();
/* 64 */            ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(listM4309D0, 10));
/* 75 */            for (Iterator it = listM4309D0.iterator(); it.hasNext(); it = it) {
/* 81 */                m61 m61Var = (m61) it.next();
/* 85 */                Iterator it2 = storageSettings.f6142d.iterator();
                        while (true) {
/* 93 */                    if (!it2.hasNext()) {
/* 114 */                       obj = null;
                                break;
                            }
/* 95 */                    Object next2 = it2.next();
/* 110 */                   if (Intrinsics.m6216a(((StorageService) next2).f6133b, m61Var.f13580f)) {
/* 112 */                       obj = next2;
                                break;
                            }
                        }
/* 115 */               StorageService storageService = (StorageService) obj;
/* 117 */               if (storageService != null) {
/* 119 */                   List list2 = m61Var.f13575a;
/* 121 */                   mu1 mu1Var = m61Var.f13576b;
/* 123 */                   List list3 = m61Var.f13577c;
/* 125 */                   List list4 = m61Var.f13578d;
/* 127 */                   String str = m61Var.f13579e;
/* 129 */                   String str2 = m61Var.f13580f;
/* 131 */                   List list5 = m61Var.f13581g;
/* 133 */                   String str3 = m61Var.f13582h;
/* 137 */                   hv1 hv1Var = m61Var.f13583i;
/* 141 */                   String str4 = m61Var.f13584j;
/* 145 */                   List list6 = m61Var.f13585k;
/* 149 */                   aw1 aw1Var = m61Var.f13586l;
/* 153 */                   String str5 = m61Var.f13587m;
/* 157 */                   String str6 = m61Var.f13588n;
/* 161 */                   String str7 = m61Var.f13589o;
/* 165 */                   boolean z = m61Var.f13591q;
/* 169 */                   List list7 = m61Var.f13594t;
/* 173 */                   String str8 = storageService.f6134c;
/* 177 */                   List list8 = storageService.f6132a;
/* 193 */                   ArrayList arrayList4 = new ArrayList(C2122qw.m8020h(list8, 10));
/* 196 */                   Iterator it3 = list8.iterator();
/* 204 */                   while (it3.hasNext()) {
/* 216 */                       arrayList4.add(((StorageConsentHistory) it3.next()).m2781a());
                            }
/* 264 */                   m61 m61Var2 = new m61(list2, mu1Var, list3, list4, str, str2, list5, str3, hv1Var, str4, list6, aw1Var, str5, str6, str7, new i61(CollectionsKt.m6188G(arrayList4), true), z, m61Var.f13592r, str8, list7, m61Var.f13595u, m61Var.f13596v, m61Var.f13597w, m61Var.f13598x, m61Var.f13599y, m61Var.f13600z);
/* 269 */                   if (!storageService.f6135d) {
/* 271 */                       arrayList2.add(m61Var2);
                            }
/* 274 */                   m61Var = m61Var2;
                        }
/* 278 */               arrayList3.add(m61Var);
                    }
/* 289 */           List list9 = ac2Var.f182c.f12611b;
/* 293 */           ArrayList arrayList5 = new ArrayList();
/* 304 */           for (Object obj3 : list9) {
/* 315 */               if (!((m61) obj3).f13591q) {
/* 317 */                   arrayList5.add(obj3);
                        }
                    }
/* 321 */           List listM4309D1 = hu0.m4309D0(arrayList5, c0170b7);
/* 327 */           ArrayList arrayList6 = new ArrayList();
/* 332 */           ArrayList arrayList7 = new ArrayList();
/* 343 */           for (Iterator it4 = listM4309D1.iterator(); it4.hasNext(); it4 = it4) {
/* 349 */               m61 m61Var3 = (m61) it4.next();
/* 353 */               Iterator it5 = storageSettings.f6142d.iterator();
/* 378 */               do {
/* 361 */                   if (!it5.hasNext()) {
/* 381 */                       next = null;
                                break;
                            }
/* 363 */                   next = it5.next();
/* 378 */               } while (!Intrinsics.m6216a(((StorageService) next).f6133b, m61Var3.f13580f));
/* 382 */               StorageService storageService2 = (StorageService) next;
/* 384 */               if (storageService2 == null) {
/* 386 */                   arrayList7.add(m61Var3);
                        } else {
/* 393 */                   List list10 = m61Var3.f13575a;
/* 395 */                   mu1 mu1Var2 = m61Var3.f13576b;
/* 397 */                   List list11 = m61Var3.f13577c;
/* 399 */                   List list12 = m61Var3.f13578d;
/* 401 */                   String str9 = m61Var3.f13579e;
/* 403 */                   String str10 = m61Var3.f13580f;
/* 405 */                   List list13 = m61Var3.f13581g;
/* 409 */                   String str11 = m61Var3.f13582h;
/* 413 */                   hv1 hv1Var2 = m61Var3.f13583i;
/* 417 */                   String str12 = m61Var3.f13584j;
/* 421 */                   List list14 = m61Var3.f13585k;
/* 425 */                   aw1 aw1Var2 = m61Var3.f13586l;
/* 429 */                   String str13 = m61Var3.f13587m;
/* 433 */                   String str14 = m61Var3.f13588n;
/* 437 */                   String str15 = m61Var3.f13589o;
/* 441 */                   boolean z2 = m61Var3.f13591q;
/* 445 */                   List list15 = m61Var3.f13594t;
/* 449 */                   String str16 = storageService2.f6134c;
/* 453 */                   List list16 = storageService2.f6132a;
/* 469 */                   ArrayList arrayList8 = new ArrayList(C2122qw.m8020h(list16, 10));
/* 472 */                   Iterator it6 = list16.iterator();
/* 480 */                   while (it6.hasNext()) {
/* 492 */                       arrayList8.add(((StorageConsentHistory) it6.next()).m2781a());
                            }
/* 542 */                   arrayList6.add(new m61(list10, mu1Var2, list11, list12, str9, str10, list13, str11, hv1Var2, str12, list14, aw1Var2, str13, str14, str15, new i61(CollectionsKt.m6188G(arrayList8), storageService2.f6135d), z2, m61Var3.f13592r, str16, list15, m61Var3.f13595u, m61Var3.f13596v, m61Var3.f13597w, m61Var3.f13598x, m61Var3.f13599y, m61Var3.f13600z));
                        }
                    }
/* 551 */           ArrayList arrayList9 = new ArrayList();
/* 554 */           arrayList9.addAll(arrayList3);
/* 557 */           arrayList9.addAll(arrayList6);
/* 560 */           arrayList9.addAll(arrayList7);
/* 563 */           k61 k61Var = ac2Var.f182c;
/* 565 */           String str17 = storageSettings.f6139a;
/* 571 */           if (StringsKt.m6228D(str17)) {
/* 573 */               str17 = k61Var.f12614e;
                    }
/* 584 */           return new jh1(arrayList9, k61.m5996a(k61Var, null, str17, 16367), arrayList2, arrayList7);
                }
            }
