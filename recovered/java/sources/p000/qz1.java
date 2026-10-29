            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.TreeSet;
            import kotlin.ranges.IntRange;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qz1 {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public static LinkedHashMap m8034a(xz1 xz1Var) {
                    Object next;
                    String string;
                    Map map;
/* 1 */             xz1Var.getClass();
/* 6 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 15 */            Iterator it = xz1Var.f19423b.entrySet().iterator();
/* 20 */            int iMax = 0;
                    while (true) {
/* 25 */                Object next2 = null;
/* 27 */                if (!it.hasNext()) {
                            break;
                        }
/* 41 */                TreeSet treeSet = ((rf2) ((Map.Entry) it.next()).getValue()).f16038a;
/* 43 */                treeSet.getClass();
/* 48 */                if (treeSet instanceof List) {
/* 50 */                    List list = (List) treeSet;
/* 56 */                    if (!list.isEmpty()) {
/* 64 */                        next2 = list.get(list.size() - 1);
                            }
                        } else {
/* 69 */                    Iterator it2 = treeSet.iterator();
/* 77 */                    if (it2.hasNext()) {
/* 80 */                        next2 = it2.next();
/* 88 */                        while (it2.hasNext()) {
/* 90 */                            next2 = it2.next();
                                }
                            }
                        }
/* 97 */                Integer num = (Integer) ((Comparable) next2);
/* 99 */                if (num != null) {
/* 105 */                   iMax = Math.max(num.intValue(), iMax);
                        }
                    }
/* 110 */           wp0 wp0Var = xz1Var.f19425d;
/* 130 */           Iterator it3 = new IntRange(1, (wp0Var == null || (map = wp0Var.f18723f) == null) ? 11 : map.size(), 1).iterator();
/* 139 */           while (((yy0) it3).f19856c) {
/* 144 */               int iNextInt = ((wy0) it3).nextInt();
/* 150 */               IntRange intRange = new IntRange(1, iMax, 1);
/* 155 */               ArrayList arrayList = new ArrayList();
/* 158 */               Iterator it4 = intRange.iterator();
/* 167 */               while (((yy0) it4).f19856c) {
/* 188 */                   l42 l42VarM9670b = null;
/* 193 */                   for (wz1 wz1Var : xz1Var.m10050b(Integer.valueOf(((wy0) it4).nextInt()))) {
/* 201 */                       Integer num2 = wz1Var.f18878a;
/* 203 */                       if (num2 != null && num2.intValue() == iNextInt && (l42VarM9670b == null || l42VarM9670b.ordinal() > wz1Var.m9670b().ordinal())) {
/* 228 */                           l42VarM9670b = wz1Var.m9670b();
                                }
                            }
/* 233 */                   if (l42VarM9670b != null) {
/* 235 */                       arrayList.add(l42VarM9670b);
                            }
                        }
/* 239 */               Iterator it5 = arrayList.iterator();
/* 247 */               if (it5.hasNext()) {
/* 251 */                   next = it5.next();
/* 259 */                   if (it5.hasNext()) {
/* 267 */                       int i = -((l42) next).f13106a;
/* 286 */                       do {
/* 268 */                           Object next3 = it5.next();
/* 277 */                           int i2 = -((l42) next3).f13106a;
/* 278 */                           if (i < i2) {
/* 280 */                               next = next3;
/* 281 */                               i = i2;
                                    }
/* 286 */                       } while (it5.hasNext());
                            }
                        } else {
/* 249 */                   next = null;
                        }
/* 288 */               l42 l42Var = (l42) next;
/* 290 */               Integer numValueOf = Integer.valueOf(iNextInt);
/* 294 */               if (l42Var == null) {
/* 296 */                   string = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
/* 301 */                   StringBuilder sb = new StringBuilder();
/* 305 */                   for (int i3 = 0; i3 < iMax; i3++) {
/* 309 */                       sb.append(l42Var.f13106a);
                            }
/* 315 */                   string = sb.toString();
                        }
/* 319 */               linkedHashMap.put(numValueOf, string);
                    }
/* 324 */           return linkedHashMap;
                }
            }
