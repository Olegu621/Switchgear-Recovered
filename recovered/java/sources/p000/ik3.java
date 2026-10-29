            package p000;

            import java.util.AbstractMap;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 410 */   public final class ik3 extends AbstractMap {

                /* JADX INFO: renamed from: f */
                public static final wa3 f9696f = new wa3(21);

                /* JADX INFO: renamed from: a */
                public final Object[] f9697a;

                /* JADX INFO: renamed from: b */
                public final int[] f9698b;

                /* JADX INFO: renamed from: c */
                public final gk3 f9699c;

                /* JADX INFO: renamed from: d */
                public Integer f9700d;

                /* JADX INFO: renamed from: e */
                public String f9701e;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [ik3, java.util.AbstractMap] */
                /* JADX WARN: Type inference failed for: r0v14 */
                /* JADX WARN: Type inference failed for: r0v15 */
                /* JADX WARN: Type inference failed for: r0v16 */
                /* JADX WARN: Type inference failed for: r0v2 */
                /* JADX WARN: Type inference failed for: r0v4 */
                public ik3(ik3 ik3Var, ik3 ik3Var2) {
                    Object obj;
                    Object[] objArr;
/* 7 */             ik3 abstractMap = new AbstractMap();
/* 12 */            int i = -1;
/* 16 */            abstractMap.f9699c = new gk3(abstractMap, -1);
/* 19 */            abstractMap.f9700d = null;
/* 21 */            abstractMap.f9701e = null;
/* 31 */            int size = ik3Var2.size() + ik3Var.size();
/* 48 */            int i2 = ik3Var.f9698b[ik3Var.size()] + ik3Var2.f9698b[ik3Var2.size()];
/* 50 */            int i3 = size + 1;
/* 52 */            Object[] objArr2 = new Object[i2];
/* 54 */            int[] iArr = new int[i3];
/* 56 */            int i4 = 0;
/* 57 */            iArr[0] = size;
/* 59 */            Map.Entry entryM4578c = ik3Var.m4578c(0);
/* 63 */            Map.Entry entryM4578c2 = ik3Var2.m4578c(0);
/* 68 */            int i5 = 0;
/* 69 */            int i6 = 0;
/* 70 */            int iM4577a = size;
/* 71 */            int i7 = 0;
                    while (true) {
/* 73 */                if (entryM4578c == null && entryM4578c2 == null) {
                            break;
                        }
/* 145 */               int iCompareTo = entryM4578c == null ? 1 : entryM4578c2 == null ? i : i4;
/* 147 */               if (iCompareTo == 0 && (iCompareTo = ((String) entryM4578c.getKey()).compareTo((String) entryM4578c2.getKey())) == 0) {
/* 187 */                   objArr2[i7] = new AbstractMap.SimpleImmutableEntry((String) entryM4578c.getKey(), new gk3(abstractMap, i7));
/* 189 */                   int i8 = i7 + 1;
/* 196 */                   gk3 gk3Var = (gk3) entryM4578c.getValue();
/* 203 */                   gk3 gk3Var2 = (gk3) entryM4578c2.getValue();
/* 205 */                   int i9 = 0;
/* 206 */                   int i10 = 0;
                            while (true) {
/* 207 */                       int iM3966b = gk3Var.m3966b();
/* 211 */                       ik3 ik3Var3 = gk3Var.f8688b;
/* 219 */                       if (i9 >= iM3966b - gk3Var.m3965a() && i10 >= gk3Var2.m3966b() - gk3Var2.m3965a()) {
                                    break;
                                }
/* 283 */                       int iCompare = i9 == gk3Var.m3966b() - gk3Var.m3965a() ? 1 : i10 == gk3Var2.m3966b() - gk3Var2.m3965a() ? -1 : 0;
/* 284 */                       if (iCompare == 0) {
/* 286 */                           wa3 wa3Var = kk3.f12864b;
/* 316 */                           iCompare = kk3.f12864b.compare(ik3Var3.f9697a[gk3Var.m3965a() + i9], gk3Var2.f8688b.f9697a[gk3Var2.m3965a() + i10]);
                                }
/* 325 */                       if (iCompare < 0) {
/* 327 */                           i9++;
/* 337 */                           obj = ik3Var3.f9697a[gk3Var.m3965a() + i9];
/* 339 */                           i10 = i10;
                                } else {
/* 342 */                           i10++;
/* 354 */                           obj = gk3Var2.f8688b.f9697a[gk3Var2.m3965a() + i10];
/* 361 */                           i9 = iCompare == 0 ? i9 + 1 : i9;
                                }
/* 365 */                       objArr2[iM4577a] = obj;
/* 363 */                       iM4577a++;
                            }
/* 234 */                   iArr[i8] = iM4577a;
/* 236 */                   i5++;
/* 238 */                   entryM4578c = ik3Var.m4578c(i5);
/* 242 */                   i6++;
/* 244 */                   entryM4578c2 = ik3Var2.m4578c(i6);
/* 248 */                   i7 = i8;
/* 249 */                   i = -1;
/* 250 */                   i4 = 0;
/* 251 */                   abstractMap = this;
                        } else {
/* 372 */                   if (iCompareTo < 0) {
/* 376 */                       ik3 ik3Var4 = this;
/* 378 */                       iM4577a = ik3Var4.m4577a(entryM4578c, i7, iM4577a, objArr2, iArr);
/* 382 */                       i5++;
/* 384 */                       entryM4578c = ik3Var.m4578c(i5);
/* 374 */                       i7++;
                                abstractMap = ik3Var4;
                            } else {
/* 396 */                       ik3 ik3Var5 = this;
/* 399 */                       iM4577a = ik3Var5.m4577a(entryM4578c2, i7, iM4577a, objArr2, iArr);
/* 403 */                       i6++;
/* 405 */                       entryM4578c2 = ik3Var2.m4578c(i6);
/* 409 */                       entryM4578c = entryM4578c;
/* 394 */                       i7++;
                                abstractMap = ik3Var5;
                            }
/* 389 */                   i = -1;
/* 390 */                   i4 = 0;
                        }
                    }
/* 78 */            int i11 = iArr[i4];
/* 80 */            int i12 = i11 - i7;
/* 82 */            if (i12 != 0) {
/* 86 */                for (int i13 = i4; i13 <= i7; i13++) {
/* 91 */                    iArr[i13] = iArr[i13] - i12;
                        }
/* 96 */                int i14 = iArr[i7];
/* 98 */                int i15 = i14 - i7;
/* 104 */               if (m4576b(i2, i14)) {
/* 106 */                   objArr = new Object[i14];
/* 108 */                   System.arraycopy(objArr2, i4, objArr, i4, i7);
                        } else {
/* 112 */                   objArr = objArr2;
                        }
/* 113 */               System.arraycopy(objArr2, i11, objArr, i7, i15);
/* 116 */               objArr2 = objArr;
                    }
/* 117 */           abstractMap.f9697a = objArr2;
/* 121 */           int i16 = iArr[i4] + 1;
/* 132 */           abstractMap.f9698b = m4576b(i3, i16) ? Arrays.copyOf(iArr, i16) : iArr;
                }

                /* JADX INFO: renamed from: b */
                public static boolean m4576b(int i, int i2) {
                    return i > 16 && i * 9 > i2 * 10;
                }

                /* JADX INFO: renamed from: a */
                public final int m4577a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
/* 5 */             gk3 gk3Var = (gk3) entry.getValue();
/* 15 */            int iM3966b = gk3Var.m3966b() - gk3Var.m3965a();
/* 24 */            System.arraycopy(gk3Var.f8688b.f9697a, gk3Var.m3965a(), objArr, i2, iM3966b);
/* 43 */            objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new gk3(this, i));
/* 47 */            int i3 = i2 + iM3966b;
/* 48 */            iArr[i + 1] = i3;
/* 50 */            return i3;
                }

                /* JADX INFO: renamed from: c */
                public final Map.Entry m4578c(int i) {
/* 6 */             if (i < this.f9698b[0]) {
/* 12 */                return (Map.Entry) this.f9697a[i];
                    }
/* 15 */            return null;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final Set entrySet() {
/* 1 */             return this.f9699c;
                }

                @Override // java.util.AbstractMap, java.util.Map
                public final int hashCode() {
/* 3 */             if (this.f9700d == null) {
/* 13 */                this.f9700d = Integer.valueOf(super.hashCode());
                    }
/* 17 */            return this.f9700d.intValue();
                }

                @Override // java.util.AbstractMap
                public final String toString() {
/* 3 */             if (this.f9701e == null) {
/* 9 */                 this.f9701e = super.toString();
                    }
/* 11 */            return this.f9701e;
                }

/* 411 */       public ik3() {
                    List list = Collections.EMPTY_LIST;
/* 413 */           this.f9699c = new gk3(this, -1);
                    this.f9700d = null;
                    this.f9701e = null;
/* 414 */           Iterator it = list.iterator();
                    if (!it.hasNext()) {
/* 415 */               int size = list.size();
                        Object[] objArr = new Object[size];
/* 416 */               Iterator it2 = list.iterator();
                        if (!it2.hasNext()) {
/* 417 */                   int[] iArr = {0};
/* 418 */                   this.f9697a = m4576b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                            this.f9698b = iArr;
                            return;
                        }
/* 420 */               throw fm0.m3780f(it2);
                    }
/* 422 */           throw fm0.m3780f(it);
                }
            }
