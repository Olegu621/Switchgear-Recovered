            package p000;

            import android.graphics.Typeface;
            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.collections.C1839a;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ft2 {
                /* JADX INFO: renamed from: a */
                public static gt2 m3835a(uu1 uu1Var, ew2 ew2Var) {
                    kt2 kt2Var;
                    et2 et2Var;
/* 1 */             uu1Var.getClass();
/* 4 */             jt2 jt2Var = kt2.Companion;
/* 6 */             bu1 bu1Var = uu1Var.f17723u;
/* 8 */             jt2Var.getClass();
/* 11 */            bu1Var.getClass();
/* 14 */            int iOrdinal = bu1Var.ordinal();
/* 23 */            if (iOrdinal == 0) {
/* 50 */                kt2Var = kt2.f13003a;
                    } else if (iOrdinal == 1) {
/* 47 */                kt2Var = kt2.f13004b;
                    } else if (iOrdinal == 2) {
/* 44 */                kt2Var = kt2.f13007e;
                    } else if (iOrdinal == 3) {
/* 41 */                kt2Var = kt2.f13005c;
                    } else {
/* 31 */                if (iOrdinal != 4) {
/* 37 */                    ds0.m3187b();
/* 18 */                    return null;
                        }
/* 33 */                kt2Var = kt2.f13006d;
                    }
/* 35 */            kt2 kt2Var2 = kt2Var;
/* 53 */            it2 it2Var = ew2Var.f7910d;
/* 55 */            int iOrdinal2 = kt2Var2.ordinal();
/* 59 */            if (iOrdinal2 == 0) {
/* 85 */                et2Var = it2Var.f11923a;
                    } else if (iOrdinal2 == 1) {
/* 82 */                et2Var = it2Var.f11924b;
                    } else if (iOrdinal2 == 2) {
/* 79 */                et2Var = it2Var.f11926d;
                    } else if (iOrdinal2 == 3) {
/* 76 */                et2Var = it2Var.f11925c;
                    } else {
/* 67 */                if (iOrdinal2 != 4) {
/* 72 */                    ds0.m3187b();
/* 18 */                    return null;
                        }
/* 69 */                et2Var = it2Var.f11927e;
                    }
/* 87 */            wu2 wu2Var = ew2Var.f7908b;
/* 89 */            String str = uu1Var.f15867b;
/* 91 */            Integer num = et2Var.f7873b;
/* 93 */            int i = et2Var.f7874c;
/* 95 */            Integer num2 = et2Var.f7872a;
/* 97 */            Typeface typeface = Typeface.DEFAULT_BOLD;
/* 105 */           return new gt2(str, num, i, num2, wu2Var.f18822a.f17726b, kt2Var2);
                }

                /* JADX INFO: renamed from: b */
                public static List m3836b(boolean z, AbstractC1835kl abstractC1835kl, List list, ew2 ew2Var, ec0 ec0Var) {
                    ArrayList arrayList;
                    ArrayList arrayList2;
/* 1 */             list.getClass();
/* 10 */            hk2 hk2VarM8065b = r51.m8065b(new C1908lz(3, list, ew2Var));
/* 14 */            if (z) {
/* 20 */                return (List) hk2VarM8065b.getValue();
                    }
/* 28 */            if (abstractC1835kl instanceof C0995hl) {
/* 38 */                List list2 = (List) yy1.m10221p(((C0995hl) abstractC1835kl).f9128a);
/* 40 */                if (list2 != null) {
/* 48 */                    arrayList2 = new ArrayList(C2122qw.m8020h(list2, 10));
/* 51 */                    Iterator it = list2.iterator();
/* 59 */                    if (it.hasNext()) {
/* 66 */                        if (it.next() != null) {
/* 68 */                            C1697u2.m5431g();
/* 25 */                            return null;
                                }
/* 74 */                        gt2.Companion.getClass();
/* 77 */                        throw null;
                            }
                        } else {
/* 78 */                    ArrayList<uu1> arrayListM8021i = C2122qw.m8021i(list);
/* 88 */                    arrayList2 = new ArrayList(C2122qw.m8020h(arrayListM8021i, 10));
/* 99 */                    for (uu1 uu1Var : arrayListM8021i) {
/* 109 */                       gt2.Companion.getClass();
/* 116 */                       arrayList2.add(m3835a(uu1Var, ew2Var));
                            }
                        }
/* 126 */               ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(arrayList2, 10));
/* 129 */               Iterator it2 = arrayList2.iterator();
/* 137 */               while (it2.hasNext()) {
/* 149 */                   arrayList3.add(C1839a.m6210b((gt2) it2.next()));
                        }
/* 153 */               return arrayList3;
                    }
/* 156 */           if (abstractC1835kl instanceof C1797jl) {
/* 166 */               List list3 = (List) yy1.m10221p(((C1797jl) abstractC1835kl).f12344a);
/* 168 */               if (list3 != null) {
/* 176 */                   arrayList = new ArrayList(C2122qw.m8020h(list3, 10));
/* 179 */                   Iterator it3 = list3.iterator();
/* 187 */                   if (it3.hasNext()) {
/* 194 */                       if (it3.next() != null) {
/* 196 */                           C1697u2.m5431g();
/* 25 */                            return null;
                                }
/* 202 */                       gt2.Companion.getClass();
/* 205 */                       throw null;
                            }
                        } else {
/* 206 */                   ArrayList<uu1> arrayListM8021i2 = C2122qw.m8021i(list);
/* 216 */                   arrayList = new ArrayList(C2122qw.m8020h(arrayListM8021i2, 10));
/* 227 */                   for (uu1 uu1Var2 : arrayListM8021i2) {
/* 237 */                       gt2.Companion.getClass();
/* 244 */                       arrayList.add(m3835a(uu1Var2, ew2Var));
                            }
                        }
/* 248 */               return C1839a.m6210b(arrayList);
                    }
/* 255 */           if (!(abstractC1835kl instanceof C1031il)) {
/* 402 */               if (abstractC1835kl == null) {
/* 408 */                   return (List) hk2VarM8065b.getValue();
                        }
/* 411 */               ds0.m3187b();
/* 25 */                return null;
                    }
/* 265 */           List<List> list4 = (List) yy1.m10221p(((C1031il) abstractC1835kl).f9702a);
/* 267 */           if (list4 == null) {
/* 340 */               ArrayList arrayList4 = new ArrayList(C2122qw.m8020h(list, 10));
/* 343 */               Iterator it4 = list.iterator();
/* 351 */               while (it4.hasNext()) {
/* 357 */                   List<uu1> list5 = (List) it4.next();
/* 365 */                   ArrayList arrayList5 = new ArrayList(C2122qw.m8020h(list5, 10));
/* 376 */                   for (uu1 uu1Var3 : list5) {
/* 386 */                       gt2.Companion.getClass();
/* 393 */                       arrayList5.add(m3835a(uu1Var3, ew2Var));
                            }
/* 397 */                   arrayList4.add(arrayList5);
                        }
/* 401 */               return arrayList4;
                    }
/* 275 */           ArrayList arrayList6 = new ArrayList(C2122qw.m8020h(list4, 10));
/* 286 */           for (List list6 : list4) {
/* 300 */               ArrayList arrayList7 = new ArrayList(C2122qw.m8020h(list6, 10));
/* 303 */               Iterator it5 = list6.iterator();
/* 311 */               if (it5.hasNext()) {
/* 321 */                   if (it5.next() != null) {
/* 323 */                       C1697u2.m5431g();
/* 25 */                        return null;
                            }
/* 329 */                   gt2.Companion.getClass();
/* 332 */                   throw null;
                        }
/* 313 */               arrayList6.add(arrayList7);
                    }
/* 333 */           return arrayList6;
                }
            }
