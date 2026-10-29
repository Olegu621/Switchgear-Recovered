            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dj2 {

                /* JADX INFO: renamed from: a */
                public final ArrayList f7273a = new ArrayList();

                /* JADX INFO: renamed from: b */
                public static void m3139b(ArrayList arrayList, int i, int[] iArr, int i2) {
/* 2 */             if (i2 >= iArr.length) {
/* 10 */                arrayList.add((int[]) iArr.clone());
/* 13 */                return;
                    }
/* 16 */            for (int i3 = 0; i3 < i; i3++) {
/* 18 */                int i4 = 0;
                        while (true) {
/* 19 */                    if (i4 >= i2) {
/* 29 */                        iArr[i2] = i3;
/* 33 */                        m3139b(arrayList, i, iArr, i2 + 1);
                                break;
                            } else if (i3 == iArr[i4]) {
                                break;
                            } else {
/* 26 */                        i4++;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m3140a(C2143rg c2143rg) {
/* 3 */             this.f7273a.add(c2143rg);
                }

                /* JADX INFO: renamed from: c */
                public final List m3141c(List list) {
/* 5 */             if (list.isEmpty()) {
/* 9 */                 return new ArrayList();
                    }
/* 13 */            int size = list.size();
/* 17 */            ArrayList arrayList = this.f7273a;
/* 23 */            if (size != arrayList.size()) {
/* 141 */               return null;
                    }
/* 27 */            int size2 = arrayList.size();
/* 33 */            ArrayList<int[]> arrayList2 = new ArrayList();
/* 39 */            m3139b(arrayList2, size2, new int[size2], 0);
/* 46 */            C2143rg[] c2143rgArr = new C2143rg[list.size()];
/* 56 */            for (int[] iArr : arrayList2) {
/* 66 */                boolean z = true;
/* 71 */                for (int i = 0; i < arrayList.size(); i++) {
/* 79 */                    if (iArr[i] < list.size()) {
/* 85 */                        C2143rg c2143rg = (C2143rg) arrayList.get(i);
/* 93 */                        C2143rg c2143rg2 = (C2143rg) list.get(iArr[i]);
/* 95 */                        c2143rg.getClass();
/* 117 */                       z &= c2143rg2.f16042b.f7743a <= c2143rg.f16042b.f7743a && c2143rg2.f16041a == c2143rg.f16041a;
/* 118 */                       if (!z) {
                                    break;
                                }
/* 129 */                       c2143rgArr[iArr[i]] = (C2143rg) arrayList.get(i);
                            }
                        }
/* 134 */               if (z) {
/* 136 */                   return Arrays.asList(c2143rgArr);
                        }
                    }
/* 141 */           return null;
                }
            }
