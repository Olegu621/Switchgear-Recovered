            package p000;

            import android.content.Context;
            import android.util.ArrayMap;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.LinkedHashSet;
            
            /* JADX INFO: renamed from: jo */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1800jo implements cz2 {

                /* JADX INFO: renamed from: b */
                public final c90 f12409b;

                public C1800jo(Context context) {
/* 8 */             this.f12409b = c90.m1546b(context);
                }

                /* JADX WARN: Code duplicated, block: B:5:0x003a  */
                @Override // p000.cz2
                /* JADX INFO: renamed from: a */
                public final InterfaceC2235ty mo1183a(bz2 bz2Var, int i) {
                    int i2;
/* 5 */             uk1 uk1VarM9034j = uk1.m9034j();
/* 11 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 16 */            HashSet hashSet = new HashSet();
/* 19 */            uk1 uk1VarM9034j2 = uk1.m9034j();
/* 25 */            ArrayList arrayList = new ArrayList();
/* 32 */            ArrayMap arrayMap = cl1.m1721a().f14383a;
/* 36 */            ArrayList arrayList2 = new ArrayList();
/* 41 */            ArrayList arrayList3 = new ArrayList();
/* 46 */            ArrayList arrayList4 = new ArrayList();
/* 49 */            int iOrdinal = bz2Var.ordinal();
/* 55 */            if (iOrdinal != 0) {
/* 57 */                if (iOrdinal != 3) {
/* 59 */                    i2 = 1;
                        } else {
/* 62 */                    i2 = 3;
                        }
                    } else if (i == 2) {
/* 67 */                i2 = 5;
                    } else {
/* 59 */                i2 = 1;
                    }
/* 69 */            C1888lf c1888lf = zy2.f20384G;
/* 75 */            ArrayList arrayList5 = new ArrayList(linkedHashSet);
/* 80 */            ArrayList arrayList6 = new ArrayList(arrayList2);
/* 85 */            ArrayList arrayList7 = new ArrayList(arrayList3);
/* 90 */            ArrayList arrayList8 = new ArrayList(arrayList4);
/* 97 */            ArrayList arrayList9 = new ArrayList(hashSet);
/* 100 */           nq1 nq1VarM7021d = nq1.m7021d(uk1VarM9034j2);
/* 106 */           ArrayList arrayList10 = new ArrayList(arrayList);
/* 109 */           nm2 nm2Var = nm2.f14382b;
/* 113 */           ArrayMap arrayMap2 = new ArrayMap();
/* 128 */           for (String str : arrayMap.keySet()) {
/* 142 */               arrayMap2.put(str, arrayMap.get(str));
                    }
/* 188 */           uk1VarM9034j.m9037p(c1888lf, new fb2(arrayList5, arrayList6, arrayList7, arrayList8, new C1803jr(arrayList9, nq1VarM7021d, i2, arrayList10, false, new nm2(arrayMap2), null), null, null, null));
/* 195 */           uk1VarM9034j.m9037p(zy2.f20386I, C1034io.f9734a);
/* 200 */           HashSet hashSet2 = new HashSet();
/* 203 */           uk1 uk1VarM9034j3 = uk1.m9034j();
/* 209 */           ArrayList arrayList11 = new ArrayList();
/* 216 */           ArrayMap arrayMap3 = cl1.m1721a().f14383a;
/* 218 */           int iOrdinal2 = bz2Var.ordinal();
/* 235 */           int i3 = iOrdinal2 != 0 ? iOrdinal2 != 3 ? 1 : 3 : i == 2 ? 5 : 2;
/* 236 */           C1888lf c1888lf2 = zy2.f20385H;
/* 242 */           ArrayList arrayList12 = new ArrayList(hashSet2);
/* 245 */           nq1 nq1VarM7021d2 = nq1.m7021d(uk1VarM9034j3);
/* 251 */           ArrayList arrayList13 = new ArrayList(arrayList11);
/* 254 */           nm2 nm2Var2 = nm2.f14382b;
/* 258 */           ArrayMap arrayMap4 = new ArrayMap();
/* 273 */           for (String str2 : arrayMap3.keySet()) {
/* 285 */               arrayMap4.put(str2, arrayMap3.get(str2));
                    }
/* 299 */           uk1VarM9034j.m9037p(c1888lf2, new C1803jr(arrayList12, nq1VarM7021d2, i3, arrayList13, false, new nm2(arrayMap4), null));
/* 313 */           uk1VarM9034j.m9037p(zy2.f20387J, bz2Var == bz2.f2639a ? bw0.f2622b : C0223co.f3021a);
/* 316 */           bz2 bz2Var2 = bz2.f2640b;
/* 320 */           c90 c90Var = this.f12409b;
/* 322 */           if (bz2Var == bz2Var2) {
/* 330 */               uk1VarM9034j.m9037p(jw0.f12525y, c90Var.m1550e());
                    }
/* 348 */           uk1VarM9034j.m9037p(jw0.f12520r, Integer.valueOf(c90Var.m1549c(true).getRotation()));
/* 353 */           if (bz2Var == bz2.f2642d || bz2Var == bz2.f2643e) {
/* 363 */               uk1VarM9034j.m9037p(zy2.f20390M, Boolean.TRUE);
                    }
/* 366 */           return nq1.m7021d(uk1VarM9034j);
                }
            }
