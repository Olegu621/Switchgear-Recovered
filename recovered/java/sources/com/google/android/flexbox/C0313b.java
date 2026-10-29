            package com.google.android.flexbox;

            import android.graphics.drawable.Drawable;
            import android.util.SparseIntArray;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.CompoundButton;
            import io.flutter.embedding.android.KeyboardMap;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import p000.AbstractC1981ny;
            import p000.C1951n4;
            import p000.C1954n7;
            import p000.fm0;
            import p000.kj0;
            import p000.lj0;
            
            /* JADX INFO: renamed from: com.google.android.flexbox.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0313b {

                /* JADX INFO: renamed from: a */
                public final kj0 f3208a;

                /* JADX INFO: renamed from: b */
                public boolean[] f3209b;

                /* JADX INFO: renamed from: c */
                public int[] f3210c;

                /* JADX INFO: renamed from: d */
                public long[] f3211d;

                /* JADX INFO: renamed from: e */
                public long[] f3212e;

                public C0313b(kj0 kj0Var) {
/* 4 */             this.f3208a = kj0Var;
                }

                /* JADX INFO: renamed from: e */
                public static ArrayList m1963e(int i, int i2, List list) {
/* 2 */             int i3 = (i - i2) / 2;
/* 6 */             ArrayList arrayList = new ArrayList();
/* 11 */            C0312a c0312a = new C0312a();
/* 14 */            c0312a.f3196g = i3;
/* 16 */            int size = list.size();
/* 21 */            for (int i4 = 0; i4 < size; i4++) {
/* 23 */                if (i4 == 0) {
/* 25 */                    arrayList.add(c0312a);
                        }
/* 34 */                arrayList.add((C0312a) list.get(i4));
/* 43 */                if (i4 == list.size() - 1) {
/* 45 */                    arrayList.add(c0312a);
                        }
                    }
/* 51 */            return arrayList;
                }

                /* JADX INFO: renamed from: r */
                public static int[] m1964r(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
/* 1 */             Collections.sort(arrayList);
/* 4 */             sparseIntArray.clear();
/* 7 */             int[] iArr = new int[i];
/* 9 */             Iterator it = arrayList.iterator();
/* 13 */            int i2 = 0;
/* 18 */            while (it.hasNext()) {
/* 24 */                lj0 lj0Var = (lj0) it.next();
/* 26 */                int i3 = lj0Var.f13313a;
/* 28 */                iArr[i2] = i3;
/* 32 */                sparseIntArray.append(i3, lj0Var.f13314b);
/* 35 */                i2++;
                    }
/* 38 */            return iArr;
                }

                /* JADX INFO: renamed from: a */
                public final void m1965a(List list, C0312a c0312a, int i, int i2) {
/* 1 */             c0312a.f3202m = i2;
/* 5 */             this.f3208a.mo1920c(c0312a);
/* 8 */             c0312a.f3205p = i;
/* 10 */            list.add(c0312a);
                }

                /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
                /* JADX INFO: renamed from: b */
                public final void m1966b(C1954n7 c1954n7, int i, int i2, int i3, int i4, int i5, List list) {
                    int iMo1926i;
                    FlexItem flexItem;
                    int i6;
                    boolean z;
/* 5 */             int i7 = i;
/* 11 */            kj0 kj0Var = this.f3208a;
/* 13 */            boolean zMo1927j = kj0Var.mo1927j();
/* 17 */            int mode = View.MeasureSpec.getMode(i7);
/* 21 */            int size = View.MeasureSpec.getSize(i7);
/* 33 */            List arrayList = list == null ? new ArrayList() : list;
/* 35 */            c1954n7.f14152c = arrayList;
/* 42 */            boolean z2 = i5 == -1;
/* 50 */            int paddingStart = zMo1927j ? kj0Var.getPaddingStart() : kj0Var.getPaddingTop();
/* 61 */            int paddingEnd = zMo1927j ? kj0Var.getPaddingEnd() : kj0Var.getPaddingBottom();
/* 72 */            int paddingTop = zMo1927j ? kj0Var.getPaddingTop() : kj0Var.getPaddingStart();
/* 83 */            int paddingBottom = zMo1927j ? kj0Var.getPaddingBottom() : kj0Var.getPaddingEnd();
/* 89 */            C0312a c0312a = new C0312a();
/* 92 */            int i8 = i4;
/* 94 */            int i9 = 1;
/* 96 */            c0312a.f3204o = i8;
/* 98 */            int i10 = paddingStart + paddingEnd;
/* 99 */            c0312a.f3194e = i10;
/* 101 */           int flexItemCount = kj0Var.getFlexItemCount();
/* 109 */           boolean z3 = z2;
/* 111 */           int i11 = Integer.MIN_VALUE;
/* 113 */           int iCombineMeasuredStates = 0;
/* 114 */           int i12 = 0;
/* 115 */           int i13 = 0;
/* 116 */           while (i8 < flexItemCount) {
/* 118 */               int i14 = flexItemCount;
/* 120 */               View viewMo1921d = kj0Var.mo1921d(i8);
/* 124 */               if (viewMo1921d != null) {
/* 146 */                   if (viewMo1921d.getVisibility() == 8) {
/* 152 */                       c0312a.f3198i++;
/* 158 */                       c0312a.f3197h++;
/* 162 */                       if (i8 == i14 - 1 && c0312a.m1961a() != 0) {
/* 170 */                           m1965a(arrayList, c0312a, i8, i12);
                                }
                            } else {
/* 184 */                       if (viewMo1921d instanceof CompoundButton) {
/* 187 */                           CompoundButton compoundButton = (CompoundButton) viewMo1921d;
/* 193 */                           FlexItem flexItem2 = (FlexItem) compoundButton.getLayoutParams();
/* 197 */                           int iMo1906R = flexItem2.mo1906R();
/* 203 */                           int iMo1910b1 = flexItem2.mo1910b1();
/* 207 */                           Drawable drawableM7068a = AbstractC1981ny.m7068a(compoundButton);
/* 216 */                           int minimumWidth = drawableM7068a == null ? 0 : drawableM7068a.getMinimumWidth();
/* 228 */                           int minimumHeight = drawableM7068a == null ? 0 : drawableM7068a.getMinimumHeight();
/* 233 */                           if (iMo1906R == -1) {
/* 235 */                               iMo1906R = minimumWidth;
                                    }
/* 237 */                           flexItem2.mo1907Y(iMo1906R);
/* 240 */                           if (iMo1910b1 == -1) {
/* 242 */                               iMo1910b1 = minimumHeight;
                                    }
/* 244 */                           flexItem2.mo1915s0(iMo1910b1);
                                }
/* 256 */                       FlexItem flexItem3 = (FlexItem) viewMo1921d.getLayoutParams();
/* 263 */                       if (flexItem3.mo1903E() == 4) {
/* 271 */                           c0312a.f3203n.add(Integer.valueOf(i8));
                                }
/* 281 */                       int width = zMo1927j ? flexItem3.getWidth() : flexItem3.getHeight();
/* 293 */                       if (flexItem3.mo1905H0() != -1.0f && mode == 1073741824) {
/* 305 */                           width = Math.round(size * flexItem3.mo1905H0());
                                }
/* 309 */                       if (zMo1927j) {
/* 322 */                           iMo1926i = kj0Var.mo1922e(i7, i10 + flexItem3.mo1912e0() + flexItem3.mo1908Y0(), width);
/* 343 */                           int iMo1926i2 = kj0Var.mo1926i(i2, paddingTop + paddingBottom + flexItem3.mo1914m0() + flexItem3.mo1909Z() + i12, flexItem3.getHeight());
/* 347 */                           viewMo1921d.measure(iMo1926i, iMo1926i2);
/* 350 */                           m1984v(i8, iMo1926i, iMo1926i2, viewMo1921d);
                                } else {
/* 371 */                           int iMo1922e = kj0Var.mo1922e(i2, paddingTop + paddingBottom + flexItem3.mo1912e0() + flexItem3.mo1908Y0() + i12, flexItem3.getWidth());
/* 387 */                           iMo1926i = kj0Var.mo1926i(i7, i10 + flexItem3.mo1914m0() + flexItem3.mo1909Z(), width);
/* 391 */                           viewMo1921d.measure(iMo1922e, iMo1926i);
/* 394 */                           m1984v(i8, iMo1922e, iMo1926i, viewMo1921d);
                                }
/* 397 */                       kj0Var.mo1923f(i8, viewMo1921d);
/* 400 */                       m1967c(i8, viewMo1921d);
/* 407 */                       iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewMo1921d.getMeasuredState());
/* 411 */                       int i15 = c0312a.f3194e;
/* 448 */                       int measuredWidth = (zMo1927j ? viewMo1921d.getMeasuredWidth() : viewMo1921d.getMeasuredHeight()) + (zMo1927j ? flexItem3.mo1912e0() : flexItem3.mo1914m0()) + (zMo1927j ? flexItem3.mo1908Y0() : flexItem3.mo1909Z());
/* 450 */                       int size2 = arrayList.size();
/* 458 */                       if (kj0Var.getFlexWrap() != 0) {
/* 474 */                           if (flexItem3.mo1911d1()) {
/* 476 */                               flexItem = flexItem3;
                                    } else {
/* 479 */                               if (mode == 0) {
/* 460 */                                   flexItem = flexItem3;
                                        } else {
/* 482 */                                   flexItem = flexItem3;
/* 484 */                                   int maxLine = kj0Var.getMaxLine();
/* 489 */                                   if (maxLine == -1 || maxLine > size2 + 1) {
/* 496 */                                       int iMo1925h = kj0Var.mo1925h(viewMo1921d, i8, i13);
/* 500 */                                       if (iMo1925h > 0) {
/* 502 */                                           measuredWidth += iMo1925h;
                                                }
/* 504 */                                       if (size < i15 + measuredWidth) {
                                                }
                                            }
                                        }
/* 464 */                               i10 = i10;
/* 466 */                               arrayList = arrayList;
/* 637 */                               c0312a.f3197h += i9;
/* 639 */                               i13++;
/* 641 */                               i6 = i11;
                                    }
/* 510 */                           if (c0312a.m1961a() > 0) {
/* 516 */                               arrayList = arrayList;
/* 521 */                               m1965a(arrayList, c0312a, i8 > 0 ? i8 - 1 : 0, i12);
/* 526 */                               i12 += c0312a.f3196g;
                                    }
/* 530 */                           if (zMo1927j) {
/* 528 */                               arrayList = arrayList;
/* 537 */                               if (flexItem.getHeight() == -1) {
/* 567 */                                   viewMo1921d.measure(iMo1926i, kj0Var.mo1926i(i2, kj0Var.getPaddingBottom() + kj0Var.getPaddingTop() + flexItem.mo1914m0() + flexItem.mo1909Z() + i12, flexItem.getHeight()));
/* 570 */                                   m1967c(i8, viewMo1921d);
                                        }
                                    } else {
/* 528 */                               arrayList = arrayList;
/* 579 */                               if (flexItem.getWidth() == -1) {
/* 609 */                                   viewMo1921d.measure(kj0Var.mo1922e(i2, kj0Var.getPaddingRight() + kj0Var.getPaddingLeft() + flexItem.mo1912e0() + flexItem.mo1908Y0() + i12, flexItem.getWidth()), iMo1926i);
/* 612 */                                   m1967c(i8, viewMo1921d);
                                        }
                                    }
/* 617 */                           c0312a = new C0312a();
/* 622 */                           c0312a.f3197h = i9;
/* 624 */                           i10 = i10;
/* 626 */                           c0312a.f3194e = i10;
/* 628 */                           c0312a.f3204o = i8;
/* 630 */                           i6 = Integer.MIN_VALUE;
/* 632 */                           i13 = 0;
                                } else {
/* 460 */                           flexItem = flexItem3;
/* 464 */                           i10 = i10;
/* 466 */                           arrayList = arrayList;
/* 637 */                           c0312a.f3197h += i9;
/* 639 */                           i13++;
/* 641 */                           i6 = i11;
                                }
/* 659 */                       c0312a.f3206q |= flexItem.mo1916v0() != 0.0f;
/* 675 */                       c0312a.f3207r |= flexItem.mo1904H() != 0.0f;
/* 677 */                       int[] iArr = this.f3210c;
/* 679 */                       if (iArr != null) {
/* 685 */                           iArr[i8] = arrayList.size();
                                }
/* 727 */                       c0312a.f3194e = (zMo1927j ? viewMo1921d.getMeasuredWidth() : viewMo1921d.getMeasuredHeight()) + (zMo1927j ? flexItem.mo1912e0() : flexItem.mo1914m0()) + (zMo1927j ? flexItem.mo1908Y0() : flexItem.mo1909Z()) + c0312a.f3194e;
/* 736 */                       c0312a.f3199j += flexItem.mo1916v0();
/* 745 */                       c0312a.f3200k += flexItem.mo1904H();
/* 747 */                       kj0Var.mo1919b(viewMo1921d, i8, i13, c0312a);
/* 790 */                       int iMax = Math.max(i6, kj0Var.mo1928k(viewMo1921d) + (zMo1927j ? viewMo1921d.getMeasuredHeight() : viewMo1921d.getMeasuredWidth()) + (zMo1927j ? flexItem.mo1914m0() : flexItem.mo1912e0()) + (zMo1927j ? flexItem.mo1909Z() : flexItem.mo1908Y0()));
/* 800 */                       c0312a.f3196g = Math.max(c0312a.f3196g, iMax);
/* 802 */                       if (zMo1927j) {
/* 804 */                           int flexWrap = kj0Var.getFlexWrap();
/* 808 */                           int i16 = c0312a.f3201l;
/* 810 */                           i11 = iMax;
/* 813 */                           if (flexWrap != 2) {
/* 828 */                               c0312a.f3201l = Math.max(i16, viewMo1921d.getBaseline() + flexItem.mo1914m0());
                                    } else {
/* 849 */                               c0312a.f3201l = Math.max(i16, (viewMo1921d.getMeasuredHeight() - viewMo1921d.getBaseline()) + flexItem.mo1909Z());
                                    }
                                } else {
/* 852 */                           i11 = iMax;
                                }
/* 856 */                       if (i8 == i14 - 1 && c0312a.m1961a() != 0) {
/* 864 */                           m1965a(arrayList, c0312a, i8, i12);
/* 869 */                           i12 += c0312a.f3196g;
                                }
/* 873 */                       if (i5 != -1 && arrayList.size() > 0) {
/* 885 */                           i9 = 1;
/* 897 */                           if (((C0312a) arrayList.get(arrayList.size() - 1)).f3205p >= i5 && i8 >= i5 && !z3) {
/* 905 */                               i12 = -c0312a.f3196g;
/* 907 */                               z = true;
                                    }
/* 917 */                           if (i12 > i3 && z) {
                                        break;
                                    }
                                } else {
/* 912 */                           i9 = 1;
                                }
/* 914 */                       z = z3;
/* 917 */                       if (i12 > i3) {
                                    continue;
                                }
                            }
/* 924 */                   i8++;
/* 926 */                   i7 = i;
/* 928 */                   z3 = z;
/* 930 */                   flexItemCount = i14;
                        } else if (i8 == i14 - 1 && c0312a.m1961a() != 0) {
/* 136 */                   m1965a(arrayList, c0312a, i8, i12);
                        }
/* 175 */               z = z3;
/* 924 */               i8++;
/* 926 */               i7 = i;
/* 928 */               z3 = z;
/* 930 */               flexItemCount = i14;
                    }
/* 936 */           c1954n7.f14151b = iCombineMeasuredStates;
                }

                /* JADX WARN: Code duplicated, block: B:12:0x002d  */
                /* JADX WARN: Code duplicated, block: B:13:0x0032  */
                /* JADX WARN: Code duplicated, block: B:15:0x0038  */
                /* JADX WARN: Code duplicated, block: B:16:0x003d  */
                /* JADX WARN: Code duplicated, block: B:18:0x0040  */
                /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
                /* JADX INFO: renamed from: c */
                public final void m1967c(int i, View view) {
                    boolean z;
/* 5 */             FlexItem flexItem = (FlexItem) view.getLayoutParams();
/* 7 */             int measuredWidth = view.getMeasuredWidth();
/* 11 */            int measuredHeight = view.getMeasuredHeight();
/* 19 */            boolean z2 = true;
/* 20 */            if (measuredWidth >= flexItem.mo1906R()) {
/* 32 */                if (measuredWidth > flexItem.mo1917x1()) {
/* 34 */                    measuredWidth = flexItem.mo1917x1();
                        } else {
/* 39 */                    z = false;
                        }
/* 44 */                if (measuredHeight < flexItem.mo1910b1()) {
/* 46 */                    measuredHeight = flexItem.mo1910b1();
                        } else if (measuredHeight > flexItem.mo1913i1()) {
/* 57 */                    measuredHeight = flexItem.mo1913i1();
                        } else {
/* 62 */                    z2 = z;
                        }
/* 63 */                if (z2) {
/* 67 */                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
/* 71 */                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
/* 75 */                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
/* 78 */                    m1984v(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
/* 83 */                    this.f3208a.mo1923f(i, view);
                        }
                    }
/* 22 */            measuredWidth = flexItem.mo1906R();
/* 26 */            z = true;
/* 44 */            if (measuredHeight < flexItem.mo1910b1()) {
/* 46 */                measuredHeight = flexItem.mo1910b1();
                    } else if (measuredHeight > flexItem.mo1913i1()) {
/* 57 */                measuredHeight = flexItem.mo1913i1();
                    } else {
/* 62 */                z2 = z;
                    }
/* 63 */            if (z2) {
/* 67 */                int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
/* 71 */                int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
/* 75 */                view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
/* 78 */                m1984v(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
/* 83 */                this.f3208a.mo1923f(i, view);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m1968d(int i, List list) {
/* 3 */             int i2 = this.f3210c[i];
/* 6 */             if (i2 == -1) {
/* 8 */                 i2 = 0;
                    }
/* 13 */            if (list.size() > i2) {
/* 23 */                list.subList(i2, list.size()).clear();
                    }
/* 26 */            int[] iArr = this.f3210c;
/* 29 */            int length = iArr.length - 1;
/* 31 */            if (i > length) {
/* 33 */                Arrays.fill(iArr, -1);
                    } else {
/* 37 */                Arrays.fill(iArr, i, length, -1);
                    }
/* 40 */            long[] jArr = this.f3211d;
/* 43 */            int length2 = jArr.length - 1;
/* 47 */            if (i > length2) {
/* 49 */                Arrays.fill(jArr, 0L);
                    } else {
/* 53 */                Arrays.fill(jArr, i, length2, 0L);
                    }
                }

                /* JADX INFO: renamed from: f */
                public final ArrayList m1969f(int i) {
/* 3 */             ArrayList arrayList = new ArrayList(i);
/* 7 */             for (int i2 = 0; i2 < i; i2++) {
/* 19 */                FlexItem flexItem = (FlexItem) this.f3208a.mo1924g(i2).getLayoutParams();
/* 23 */                lj0 lj0Var = new lj0();
/* 30 */                lj0Var.f13314b = flexItem.getOrder();
/* 32 */                lj0Var.f13313a = i2;
/* 34 */                arrayList.add(lj0Var);
                    }
/* 40 */            return arrayList;
                }

                /* JADX INFO: renamed from: g */
                public final void m1970g(int i, int i2, int i3) {
                    int mode;
                    int size;
/* 1 */             kj0 kj0Var = this.f3208a;
/* 3 */             int flexDirection = kj0Var.getFlexDirection();
/* 10 */            if (flexDirection == 0 || flexDirection == 1) {
/* 38 */                int mode2 = View.MeasureSpec.getMode(i2);
/* 42 */                int size2 = View.MeasureSpec.getSize(i2);
/* 47 */                mode = mode2;
/* 48 */                size = size2;
                    } else if (flexDirection != 2 && flexDirection != 3) {
/* 25 */                C1951n4.m6859j(fm0.m3781g(flexDirection, "Invalid flex direction: "));
/* 28 */                return;
                    } else {
/* 29 */                mode = View.MeasureSpec.getMode(i);
/* 33 */                size = View.MeasureSpec.getSize(i);
                    }
/* 49 */            List<C0312a> flexLinesInternal = kj0Var.getFlexLinesInternal();
/* 55 */            if (mode == 1073741824) {
/* 61 */                int sumOfCrossSize = kj0Var.getSumOfCrossSize() + i3;
/* 66 */                int i4 = 0;
/* 67 */                if (flexLinesInternal.size() == 1) {
/* 76 */                    ((C0312a) flexLinesInternal.get(0)).f3196g = size - i3;
/* 78 */                    return;
                        }
/* 83 */                if (flexLinesInternal.size() >= 2) {
/* 85 */                    int alignContent = kj0Var.getAlignContent();
/* 89 */                    if (alignContent == 1) {
/* 350 */                       C0312a c0312a = new C0312a();
/* 353 */                       c0312a.f3196g = size - sumOfCrossSize;
/* 355 */                       flexLinesInternal.add(0, c0312a);
/* 358 */                       return;
                            }
/* 91 */                    if (alignContent == 2) {
/* 343 */                       kj0Var.setFlexLines(m1963e(size, sumOfCrossSize, flexLinesInternal));
/* 346 */                       return;
                            }
/* 98 */                    if (alignContent == 3) {
/* 234 */                       if (sumOfCrossSize >= size) {
/* 358 */                           return;
                                }
/* 246 */                       float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
/* 249 */                       ArrayList arrayList = new ArrayList();
/* 252 */                       int size4 = flexLinesInternal.size();
/* 256 */                       float f = 0.0f;
/* 257 */                       while (i4 < size4) {
/* 265 */                           arrayList.add((C0312a) flexLinesInternal.get(i4));
/* 273 */                           if (i4 != flexLinesInternal.size() - 1) {
/* 277 */                               C0312a c0312a2 = new C0312a();
/* 285 */                               if (i4 == flexLinesInternal.size() - 2) {
/* 292 */                                   c0312a2.f3196g = Math.round(f + size3);
/* 294 */                                   f = 0.0f;
                                        } else {
/* 300 */                                   c0312a2.f3196g = Math.round(size3);
                                        }
/* 302 */                               int i5 = c0312a2.f3196g;
/* 307 */                               float f2 = (size3 - i5) + f;
/* 310 */                               if (f2 > 1.0f) {
/* 314 */                                   c0312a2.f3196g = i5 + 1;
/* 316 */                                   f2 -= 1.0f;
                                        } else if (f2 < -1.0f) {
/* 325 */                                   c0312a2.f3196g = i5 - 1;
/* 327 */                                   f2 += 1.0f;
                                        }
/* 317 */                               f = f2;
/* 329 */                               arrayList.add(c0312a2);
                                    }
/* 332 */                           i4++;
                                }
/* 335 */                       kj0Var.setFlexLines(arrayList);
/* 338 */                       return;
                            }
/* 101 */                   if (alignContent == 4) {
/* 175 */                       if (sumOfCrossSize >= size) {
/* 181 */                           kj0Var.setFlexLines(m1963e(size, sumOfCrossSize, flexLinesInternal));
/* 184 */                           return;
                                }
/* 191 */                       int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
/* 194 */                       ArrayList arrayList2 = new ArrayList();
/* 199 */                       C0312a c0312a3 = new C0312a();
/* 202 */                       c0312a3.f3196g = size5;
/* 212 */                       for (C0312a c0312a4 : flexLinesInternal) {
/* 220 */                           arrayList2.add(c0312a3);
/* 223 */                           arrayList2.add(c0312a4);
/* 226 */                           arrayList2.add(c0312a3);
                                }
/* 230 */                       kj0Var.setFlexLines(arrayList2);
/* 233 */                       return;
                            }
/* 104 */                   if (alignContent == 5 && sumOfCrossSize < size) {
/* 119 */                       float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
/* 120 */                       int size7 = flexLinesInternal.size();
/* 124 */                       float f3 = 0.0f;
/* 125 */                       while (i4 < size7) {
/* 131 */                           C0312a c0312a5 = (C0312a) flexLinesInternal.get(i4);
/* 136 */                           float f4 = c0312a5.f3196g + size6;
/* 142 */                           if (i4 == flexLinesInternal.size() - 1) {
/* 144 */                               f4 += f3;
/* 145 */                               f3 = 0.0f;
                                    }
/* 146 */                           int iRound = Math.round(f4);
/* 152 */                           float f5 = (f4 - iRound) + f3;
/* 155 */                           if (f5 > 1.0f) {
/* 157 */                               iRound++;
/* 159 */                               f5 -= 1.0f;
                                    } else if (f5 < -1.0f) {
/* 166 */                               iRound--;
/* 168 */                               f5 += 1.0f;
                                    }
/* 160 */                           f3 = f5;
/* 170 */                           c0312a5.f3196g = iRound;
/* 172 */                           i4++;
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m1971h(int i, int i2, int i3) {
                    int size;
                    int paddingLeft;
                    int paddingRight;
                    C0313b c0313b;
                    int i4;
                    int i5;
/* 1 */             kj0 kj0Var = this.f3208a;
/* 3 */             int flexItemCount = kj0Var.getFlexItemCount();
/* 7 */             boolean[] zArr = this.f3209b;
/* 11 */            if (zArr == null) {
/* 21 */                this.f3209b = new boolean[Math.max(flexItemCount, 10)];
                    } else if (zArr.length < flexItemCount) {
/* 35 */                this.f3209b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
                    } else {
/* 38 */                Arrays.fill(zArr, false);
                    }
/* 45 */            if (i3 >= kj0Var.getFlexItemCount()) {
/* 194 */               return;
                    }
/* 49 */            int flexDirection = kj0Var.getFlexDirection();
/* 53 */            int flexDirection2 = kj0Var.getFlexDirection();
/* 59 */            if (flexDirection2 == 0 || flexDirection2 == 1) {
/* 107 */               int mode = View.MeasureSpec.getMode(i);
/* 111 */               size = View.MeasureSpec.getSize(i);
/* 115 */               int largestMainSize = kj0Var.getLargestMainSize();
/* 119 */               if (mode != 1073741824) {
/* 122 */                   size = Math.min(largestMainSize, size);
                        }
/* 127 */               paddingLeft = kj0Var.getPaddingLeft();
/* 131 */               paddingRight = kj0Var.getPaddingRight();
                    } else {
/* 64 */                if (flexDirection2 != 2 && flexDirection2 != 3) {
/* 76 */                    C1951n4.m6859j(fm0.m3781g(flexDirection, "Invalid flex direction: "));
/* 79 */                    return;
                        }
/* 80 */                int mode2 = View.MeasureSpec.getMode(i2);
/* 84 */                size = View.MeasureSpec.getSize(i2);
/* 88 */                if (mode2 != 1073741824) {
/* 91 */                    size = kj0Var.getLargestMainSize();
                        }
/* 95 */                paddingLeft = kj0Var.getPaddingTop();
/* 99 */                paddingRight = kj0Var.getPaddingBottom();
                    }
/* 103 */           int i6 = paddingRight + paddingLeft;
/* 104 */           int i7 = size;
/* 136 */           int[] iArr = this.f3210c;
/* 140 */           int i8 = iArr != null ? iArr[i3] : 0;
/* 142 */           List flexLinesInternal = kj0Var.getFlexLinesInternal();
/* 146 */           int size2 = flexLinesInternal.size();
/* 150 */           while (i8 < size2) {
/* 157 */               C0312a c0312a = (C0312a) flexLinesInternal.get(i8);
/* 159 */               int i9 = c0312a.f3194e;
/* 161 */               if (i9 >= i7 || !c0312a.f3206q) {
/* 175 */                   c0313b = this;
/* 176 */                   i4 = i;
/* 177 */                   i5 = i2;
/* 178 */                   if (i9 > i7 && c0312a.f3207r) {
/* 185 */                       c0313b.m1980q(i4, i5, c0312a, i7, i6, false);
                            }
                        } else {
/* 168 */                   c0313b = this;
/* 169 */                   i4 = i;
/* 170 */                   i5 = i2;
/* 171 */                   c0313b.m1975l(i4, i5, c0312a, i7, i6, false);
                        }
/* 188 */               i8++;
/* 190 */               this = c0313b;
/* 191 */               i = i4;
/* 192 */               i2 = i5;
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m1972i(int i) {
/* 1 */             int[] iArr = this.f3210c;
/* 3 */             if (iArr == null) {
/* 13 */                this.f3210c = new int[Math.max(i, 10)];
                    } else if (iArr.length < i) {
/* 32 */                this.f3210c = Arrays.copyOf(this.f3210c, Math.max(iArr.length * 2, i));
                    }
                }

                /* JADX INFO: renamed from: j */
                public final void m1973j(int i) {
/* 1 */             long[] jArr = this.f3211d;
/* 3 */             if (jArr == null) {
/* 13 */                this.f3211d = new long[Math.max(i, 10)];
                    } else if (jArr.length < i) {
/* 32 */                this.f3211d = Arrays.copyOf(this.f3211d, Math.max(jArr.length * 2, i));
                    }
                }

                /* JADX INFO: renamed from: k */
                public final void m1974k(int i) {
/* 1 */             long[] jArr = this.f3212e;
/* 3 */             if (jArr == null) {
/* 13 */                this.f3212e = new long[Math.max(i, 10)];
                    } else if (jArr.length < i) {
/* 32 */                this.f3212e = Arrays.copyOf(this.f3212e, Math.max(jArr.length * 2, i));
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m1975l(int i, int i2, C0312a c0312a, int i3, int i4, boolean z) {
                    int i5;
                    float f;
                    float f2;
                    boolean z2;
                    int i6;
                    int iMax;
                    double d;
                    boolean z3;
                    double d2;
/* 7 */             float f3 = c0312a.f3199j;
/* 9 */             float f4 = 0.0f;
/* 12 */            if (f3 <= 0.0f || i3 < (i5 = c0312a.f3194e)) {
/* 553 */               return;
                    }
/* 23 */            float f5 = (i3 - i5) / f3;
/* 28 */            c0312a.f3194e = i4 + c0312a.f3195f;
/* 30 */            if (!z) {
/* 34 */                c0312a.f3196g = Integer.MIN_VALUE;
                    }
/* 36 */            int i7 = 0;
/* 37 */            boolean z4 = false;
/* 38 */            int i8 = 0;
/* 39 */            float f6 = 0.0f;
/* 42 */            while (i7 < c0312a.f3197h) {
/* 46 */                int i9 = c0312a.f3204o + i7;
/* 47 */                kj0 kj0Var = this.f3208a;
/* 49 */                View viewMo1921d = kj0Var.mo1921d(i9);
/* 53 */                if (viewMo1921d == null || viewMo1921d.getVisibility() == 8) {
/* 63 */                    f = f4;
/* 65 */                    i5 = i5;
/* 67 */                    f2 = f5;
/* 69 */                    z2 = z4;
/* 73 */                    i6 = i7;
                        } else {
/* 80 */                    FlexItem flexItem = (FlexItem) viewMo1921d.getLayoutParams();
/* 82 */                    int flexDirection = kj0Var.getFlexDirection();
/* 94 */                    f = f4;
/* 97 */                    if (flexDirection == 0 || flexDirection == 1) {
/* 103 */                       i5 = i5;
/* 105 */                       float f7 = f5;
/* 106 */                       z2 = z4;
/* 318 */                       int measuredWidth = viewMo1921d.getMeasuredWidth();
/* 322 */                       long[] jArr = this.f3212e;
/* 324 */                       if (jArr != null) {
/* 328 */                           measuredWidth = (int) jArr[i9];
                                }
/* 329 */                       int measuredHeight = viewMo1921d.getMeasuredHeight();
/* 333 */                       long[] jArr2 = this.f3212e;
/* 335 */                       if (jArr2 != null) {
/* 341 */                           measuredHeight = (int) (jArr2[i9] >> 32);
                                }
/* 346 */                       if (this.f3209b[i9] || flexItem.mo1916v0() <= f) {
/* 466 */                           i6 = i7;
/* 467 */                           f2 = f7;
                                } else {
/* 363 */                           float fMo1916v0 = (f7 * flexItem.mo1916v0()) + measuredWidth;
/* 368 */                           if (i7 == c0312a.f3197h - 1) {
/* 370 */                               fMo1916v0 += f6;
/* 371 */                               f6 = f;
                                    }
/* 373 */                           int iRound = Math.round(fMo1916v0);
/* 381 */                           if (iRound > flexItem.mo1917x1()) {
/* 383 */                               iRound = flexItem.mo1917x1();
/* 389 */                               this.f3209b[i9] = true;
/* 398 */                               c0312a.f3199j -= flexItem.mo1916v0();
/* 400 */                               z2 = true;
/* 402 */                               i6 = i7;
/* 403 */                               f2 = f7;
                                    } else {
/* 408 */                               float f8 = (fMo1916v0 - iRound) + f6;
/* 409 */                               i6 = i7;
/* 410 */                               f2 = f7;
                                        double d3 = f8;
/* 415 */                               if (d3 > 1.0d) {
/* 417 */                                   iRound++;
/* 419 */                                   d = d3 - 1.0d;
                                        } else if (d3 < -1.0d) {
/* 428 */                                   iRound--;
/* 430 */                                   d = d3 + 1.0d;
                                        } else {
/* 433 */                                   f6 = f8;
                                        }
/* 421 */                               f6 = (float) d;
                                    }
/* 438 */                           int iM1976m = m1976m(i2, flexItem, c0312a.f3202m);
/* 442 */                           int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
/* 446 */                           viewMo1921d.measure(iMakeMeasureSpec, iM1976m);
/* 449 */                           int measuredWidth2 = viewMo1921d.getMeasuredWidth();
/* 453 */                           int measuredHeight2 = viewMo1921d.getMeasuredHeight();
/* 457 */                           m1984v(i9, iMakeMeasureSpec, iM1976m, viewMo1921d);
/* 460 */                           kj0Var.mo1923f(i9, viewMo1921d);
/* 463 */                           measuredWidth = measuredWidth2;
/* 464 */                           measuredHeight = measuredHeight2;
                                }
/* 486 */                       int iMax2 = Math.max(i8, kj0Var.mo1928k(viewMo1921d) + measuredHeight + flexItem.mo1914m0() + flexItem.mo1909Z());
/* 503 */                       c0312a.f3194e = measuredWidth + flexItem.mo1912e0() + flexItem.mo1908Y0() + c0312a.f3194e;
/* 505 */                       iMax = iMax2;
                            } else {
/* 112 */                       int measuredHeight3 = viewMo1921d.getMeasuredHeight();
/* 118 */                       long[] jArr3 = this.f3212e;
/* 120 */                       if (jArr3 != null) {
/* 129 */                           measuredHeight3 = (int) (jArr3[i9] >> 32);
                                }
/* 134 */                       int measuredWidth3 = viewMo1921d.getMeasuredWidth();
/* 138 */                       long[] jArr4 = this.f3212e;
/* 140 */                       if (jArr4 != null) {
/* 144 */                           measuredWidth3 = (int) jArr4[i9];
                                }
/* 149 */                       if (this.f3209b[i9] || flexItem.mo1916v0() <= f) {
/* 269 */                           i5 = i5;
/* 273 */                           z3 = z4;
                                } else {
/* 165 */                           float fMo1916v1 = (flexItem.mo1916v0() * f5) + measuredHeight3;
/* 170 */                           if (i7 == c0312a.f3197h - 1) {
/* 172 */                               fMo1916v1 += f6;
/* 173 */                               f6 = f;
                                    }
/* 175 */                           int iRound2 = Math.round(fMo1916v1);
/* 183 */                           if (iRound2 > flexItem.mo1913i1()) {
/* 185 */                               iRound2 = flexItem.mo1913i1();
/* 191 */                               this.f3209b[i9] = true;
/* 200 */                               c0312a.f3199j -= flexItem.mo1916v0();
/* 202 */                               z3 = true;
                                    } else {
/* 209 */                               float f9 = (fMo1916v1 - iRound2) + f6;
                                        double d4 = f9;
/* 215 */                               if (d4 > 1.0d) {
/* 217 */                                   iRound2++;
/* 219 */                                   d2 = d4 - 1.0d;
                                        } else {
/* 228 */                                   if (d4 < -1.0d) {
/* 230 */                                       iRound2--;
/* 232 */                                       d2 = d4 + 1.0d;
                                            } else {
/* 235 */                                       f6 = f9;
                                            }
/* 223 */                                   z3 = z4;
                                        }
/* 221 */                               f6 = (float) d2;
/* 223 */                               z3 = z4;
                                    }
/* 241 */                           int iM1977n = m1977n(i, flexItem, c0312a.f3202m);
/* 245 */                           int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
/* 249 */                           viewMo1921d.measure(iM1977n, iMakeMeasureSpec2);
/* 252 */                           int measuredWidth4 = viewMo1921d.getMeasuredWidth();
/* 256 */                           int measuredHeight4 = viewMo1921d.getMeasuredHeight();
/* 260 */                           m1984v(i9, iM1977n, iMakeMeasureSpec2, viewMo1921d);
/* 263 */                           kj0Var.mo1923f(i9, viewMo1921d);
/* 266 */                           measuredWidth3 = measuredWidth4;
/* 267 */                           measuredHeight3 = measuredHeight4;
                                }
/* 290 */                       iMax = Math.max(i8, kj0Var.mo1928k(viewMo1921d) + measuredWidth3 + flexItem.mo1912e0() + flexItem.mo1908Y0());
/* 307 */                       c0312a.f3194e = measuredHeight3 + flexItem.mo1914m0() + flexItem.mo1909Z() + c0312a.f3194e;
/* 309 */                       f2 = f5;
/* 311 */                       z2 = z3;
/* 315 */                       i6 = i7;
                            }
/* 512 */                   c0312a.f3196g = Math.max(c0312a.f3196g, iMax);
/* 514 */                   i8 = iMax;
                        }
/* 515 */               i7 = i6 + 1;
/* 519 */               f5 = f2;
/* 521 */               f4 = f;
/* 523 */               i5 = i5;
/* 525 */               z4 = z2;
                    }
/* 531 */           int i10 = i5;
/* 535 */           if (!z4 || i10 == c0312a.f3194e) {
/* 553 */               return;
                    }
/* 550 */           m1975l(i, i2, c0312a, i3, i4, true);
                }

                /* JADX INFO: renamed from: m */
                public final int m1976m(int i, FlexItem flexItem, int i2) {
/* 1 */             kj0 kj0Var = this.f3208a;
/* 27 */            int iMo1926i = kj0Var.mo1926i(i, kj0Var.getPaddingBottom() + kj0Var.getPaddingTop() + flexItem.mo1914m0() + flexItem.mo1909Z() + i2, flexItem.getHeight());
/* 31 */            int size = View.MeasureSpec.getSize(iMo1926i);
/* 39 */            if (size > flexItem.mo1913i1()) {
/* 49 */                return View.MeasureSpec.makeMeasureSpec(flexItem.mo1913i1(), View.MeasureSpec.getMode(iMo1926i));
                    }
                    return size < flexItem.mo1910b1() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo1910b1(), View.MeasureSpec.getMode(iMo1926i)) : iMo1926i;
                }

                /* JADX INFO: renamed from: n */
                public final int m1977n(int i, FlexItem flexItem, int i2) {
/* 1 */             kj0 kj0Var = this.f3208a;
/* 27 */            int iMo1922e = kj0Var.mo1922e(i, kj0Var.getPaddingRight() + kj0Var.getPaddingLeft() + flexItem.mo1912e0() + flexItem.mo1908Y0() + i2, flexItem.getWidth());
/* 31 */            int size = View.MeasureSpec.getSize(iMo1922e);
/* 39 */            if (size > flexItem.mo1917x1()) {
/* 49 */                return View.MeasureSpec.makeMeasureSpec(flexItem.mo1917x1(), View.MeasureSpec.getMode(iMo1922e));
                    }
                    return size < flexItem.mo1906R() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo1906R(), View.MeasureSpec.getMode(iMo1922e)) : iMo1922e;
                }

                /* JADX INFO: renamed from: o */
                public final void m1978o(View view, C0312a c0312a, int i, int i2, int i3, int i4) {
/* 5 */             FlexItem flexItem = (FlexItem) view.getLayoutParams();
/* 7 */             kj0 kj0Var = this.f3208a;
/* 9 */             int alignItems = kj0Var.getAlignItems();
/* 18 */            if (flexItem.mo1903E() != -1) {
/* 20 */                alignItems = flexItem.mo1903E();
                    }
/* 24 */            int i5 = c0312a.f3196g;
/* 27 */            if (alignItems != 0) {
/* 30 */                if (alignItems == 1) {
/* 138 */                   if (kj0Var.getFlexWrap() != 2) {
/* 140 */                       int i6 = i2 + i5;
/* 157 */                       view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.mo1909Z(), i3, i6 - flexItem.mo1909Z());
/* 160 */                       return;
                            } else {
/* 183 */                       view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.mo1914m0(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.mo1914m0());
/* 186 */                       return;
                            }
                        }
/* 32 */                if (alignItems == 2) {
/* 107 */                   int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo1914m0()) - flexItem.mo1909Z()) / 2;
/* 112 */                   if (kj0Var.getFlexWrap() != 2) {
/* 114 */                       int i7 = i2 + measuredHeight;
/* 120 */                       view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
/* 123 */                       return;
                            } else {
/* 124 */                       int i8 = i2 - measuredHeight;
/* 130 */                       view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
/* 133 */                       return;
                            }
                        }
/* 35 */                if (alignItems == 3) {
/* 41 */                    int flexWrap = kj0Var.getFlexWrap();
/* 45 */                    int i9 = c0312a.f3201l;
/* 47 */                    if (flexWrap != 2) {
/* 58 */                        int iMax = Math.max(i9 - view.getBaseline(), flexItem.mo1914m0());
/* 64 */                        view.layout(i, i2 + iMax, i3, i4 + iMax);
/* 67 */                        return;
                            } else {
/* 82 */                        int iMax2 = Math.max(view.getBaseline() + (i9 - view.getMeasuredHeight()), flexItem.mo1909Z());
/* 88 */                        view.layout(i, i2 - iMax2, i3, i4 - iMax2);
/* 91 */                        return;
                            }
                        }
/* 38 */                if (alignItems != 4) {
/* 40 */                    return;
                        }
                    }
/* 191 */           if (kj0Var.getFlexWrap() != 2) {
/* 203 */               view.layout(i, i2 + flexItem.mo1914m0(), i3, i4 + flexItem.mo1914m0());
                    } else {
/* 217 */               view.layout(i, i2 - flexItem.mo1909Z(), i3, i4 - flexItem.mo1909Z());
                    }
                }

                /* JADX INFO: renamed from: p */
                public final void m1979p(View view, C0312a c0312a, boolean z, int i, int i2, int i3, int i4) {
/* 5 */             FlexItem flexItem = (FlexItem) view.getLayoutParams();
/* 9 */             int alignItems = this.f3208a.getAlignItems();
/* 18 */            if (flexItem.mo1903E() != -1) {
/* 20 */                alignItems = flexItem.mo1903E();
                    }
/* 24 */            int i5 = c0312a.f3196g;
/* 26 */            if (alignItems != 0) {
/* 29 */                if (alignItems == 1) {
/* 77 */                    if (!z) {
/* 101 */                       view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo1908Y0(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo1908Y0(), i4);
/* 104 */                       return;
                            }
/* 127 */                   view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.mo1912e0(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.mo1912e0(), i4);
/* 130 */                   return;
                        }
/* 32 */                if (alignItems == 2) {
/* 45 */                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
/* 62 */                    int marginStart = ((marginLayoutParams.getMarginStart() + (i5 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
/* 63 */                    if (z) {
/* 73 */                        view.layout(i - marginStart, i2, i3 - marginStart, i4);
/* 76 */                        return;
                            } else {
/* 67 */                        view.layout(i + marginStart, i2, i3 + marginStart, i4);
/* 70 */                        return;
                            }
                        }
/* 35 */                if (alignItems != 3 && alignItems != 4) {
/* 40 */                    return;
                        }
                    }
/* 131 */           if (z) {
/* 157 */               view.layout(i - flexItem.mo1908Y0(), i2, i3 - flexItem.mo1908Y0(), i4);
                    } else {
/* 143 */               view.layout(i + flexItem.mo1912e0(), i2, i3 + flexItem.mo1912e0(), i4);
                    }
                }

                /* JADX INFO: renamed from: q */
                public final void m1980q(int i, int i2, C0312a c0312a, int i3, int i4, boolean z) {
                    float f;
                    int iMax;
                    int iMo1906R;
                    int iMo1910b1;
/* 7 */             int i5 = c0312a.f3194e;
/* 9 */             float f2 = c0312a.f3200k;
/* 11 */            float f3 = 0.0f;
/* 14 */            if (f2 <= 0.0f || i3 > i5) {
/* 517 */               return;
                    }
/* 23 */            float f4 = (i5 - i3) / f2;
/* 28 */            c0312a.f3194e = i4 + c0312a.f3195f;
/* 30 */            if (!z) {
/* 34 */                c0312a.f3196g = Integer.MIN_VALUE;
                    }
/* 36 */            int i6 = 0;
/* 37 */            boolean z2 = false;
/* 38 */            int i7 = 0;
/* 39 */            float f5 = 0.0f;
/* 42 */            while (i6 < c0312a.f3197h) {
/* 46 */                int i8 = c0312a.f3204o + i6;
/* 47 */                kj0 kj0Var = this.f3208a;
/* 49 */                View viewMo1921d = kj0Var.mo1921d(i8);
/* 53 */                if (viewMo1921d == null || viewMo1921d.getVisibility() == 8) {
/* 63 */                    f = f3;
/* 65 */                    f4 = f4;
                        } else {
/* 75 */                    FlexItem flexItem = (FlexItem) viewMo1921d.getLayoutParams();
/* 77 */                    int flexDirection = kj0Var.getFlexDirection();
/* 91 */                    f = f3;
/* 94 */                    if (flexDirection == 0 || flexDirection == 1) {
/* 100 */                       f4 = f4;
/* 296 */                       int measuredWidth = viewMo1921d.getMeasuredWidth();
/* 300 */                       long[] jArr = this.f3212e;
/* 302 */                       if (jArr != null) {
/* 306 */                           measuredWidth = (int) jArr[i8];
                                }
/* 307 */                       int measuredHeight = viewMo1921d.getMeasuredHeight();
/* 311 */                       long[] jArr2 = this.f3212e;
/* 313 */                       if (jArr2 != null) {
/* 319 */                           measuredHeight = (int) (jArr2[i8] >> 32);
                                }
/* 324 */                       if (!this.f3209b[i8] && flexItem.mo1904H() > f) {
/* 341 */                           float fMo1904H = measuredWidth - (f4 * flexItem.mo1904H());
/* 346 */                           if (i6 == c0312a.f3197h - 1) {
/* 348 */                               fMo1904H += f5;
/* 349 */                               f5 = f;
                                    }
/* 351 */                           int iRound = Math.round(fMo1904H);
/* 359 */                           if (iRound < flexItem.mo1906R()) {
/* 361 */                               iMo1906R = flexItem.mo1906R();
/* 367 */                               this.f3209b[i8] = true;
/* 376 */                               c0312a.f3200k -= flexItem.mo1904H();
/* 378 */                               z2 = true;
                                    } else {
/* 383 */                               float f6 = (fMo1904H - iRound) + f5;
                                        double d = f6;
/* 389 */                               if (d > 1.0d) {
/* 391 */                                   iMo1906R = iRound + 1;
/* 393 */                                   f6 -= 1.0f;
                                        } else if (d < -1.0d) {
/* 401 */                                   iMo1906R = iRound - 1;
/* 403 */                                   f6 += 1.0f;
                                        } else {
/* 406 */                                   iMo1906R = iRound;
                                        }
/* 395 */                               f5 = f6;
                                    }
/* 413 */                           int iM1976m = m1976m(i2, flexItem, c0312a.f3202m);
/* 417 */                           int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMo1906R, 1073741824);
/* 421 */                           viewMo1921d.measure(iMakeMeasureSpec, iM1976m);
/* 424 */                           int measuredWidth2 = viewMo1921d.getMeasuredWidth();
/* 428 */                           int measuredHeight2 = viewMo1921d.getMeasuredHeight();
/* 432 */                           m1984v(i8, iMakeMeasureSpec, iM1976m, viewMo1921d);
/* 435 */                           kj0Var.mo1923f(i8, viewMo1921d);
/* 438 */                           measuredWidth = measuredWidth2;
/* 439 */                           measuredHeight = measuredHeight2;
                                }
/* 458 */                       int iMax2 = Math.max(i7, kj0Var.mo1928k(viewMo1921d) + measuredHeight + flexItem.mo1914m0() + flexItem.mo1909Z());
/* 475 */                       c0312a.f3194e = measuredWidth + flexItem.mo1912e0() + flexItem.mo1908Y0() + c0312a.f3194e;
/* 477 */                       iMax = iMax2;
                            } else {
/* 106 */                       int measuredHeight3 = viewMo1921d.getMeasuredHeight();
/* 112 */                       long[] jArr3 = this.f3212e;
/* 114 */                       if (jArr3 != null) {
/* 120 */                           measuredHeight3 = (int) (jArr3[i8] >> 32);
                                }
/* 121 */                       int measuredWidth3 = viewMo1921d.getMeasuredWidth();
/* 125 */                       long[] jArr4 = this.f3212e;
/* 127 */                       if (jArr4 != null) {
/* 131 */                           measuredWidth3 = (int) jArr4[i8];
                                }
/* 136 */                       if (this.f3209b[i8] || flexItem.mo1904H() <= f) {
/* 254 */                           f4 = f4;
                                } else {
/* 152 */                           float fMo1904H2 = measuredHeight3 - (flexItem.mo1904H() * f4);
/* 157 */                           if (i6 == c0312a.f3197h - 1) {
/* 159 */                               fMo1904H2 += f5;
/* 160 */                               f5 = f;
                                    }
/* 162 */                           int iRound2 = Math.round(fMo1904H2);
/* 170 */                           if (iRound2 < flexItem.mo1910b1()) {
/* 172 */                               iMo1910b1 = flexItem.mo1910b1();
/* 178 */                               this.f3209b[i8] = true;
/* 187 */                               c0312a.f3200k -= flexItem.mo1904H();
/* 189 */                               z2 = true;
                                    } else {
/* 196 */                               float f7 = (fMo1904H2 - iRound2) + f5;
                                        double d2 = f7;
/* 203 */                               if (d2 > 1.0d) {
/* 205 */                                   iMo1910b1 = iRound2 + 1;
/* 207 */                                   f7 -= 1.0f;
                                        } else if (d2 < -1.0d) {
/* 215 */                                   iMo1910b1 = iRound2 - 1;
/* 217 */                                   f7 += 1.0f;
                                        } else {
/* 220 */                                   iMo1910b1 = iRound2;
                                        }
/* 209 */                               f5 = f7;
                                    }
/* 226 */                           int iM1977n = m1977n(i, flexItem, c0312a.f3202m);
/* 230 */                           int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMo1910b1, 1073741824);
/* 234 */                           viewMo1921d.measure(iM1977n, iMakeMeasureSpec2);
/* 237 */                           int measuredWidth4 = viewMo1921d.getMeasuredWidth();
/* 241 */                           int measuredHeight4 = viewMo1921d.getMeasuredHeight();
/* 245 */                           m1984v(i8, iM1977n, iMakeMeasureSpec2, viewMo1921d);
/* 248 */                           kj0Var.mo1923f(i8, viewMo1921d);
/* 251 */                           measuredWidth3 = measuredWidth4;
/* 252 */                           measuredHeight3 = measuredHeight4;
                                }
/* 273 */                       iMax = Math.max(i7, kj0Var.mo1928k(viewMo1921d) + measuredWidth3 + flexItem.mo1912e0() + flexItem.mo1908Y0());
/* 290 */                       c0312a.f3194e = measuredHeight3 + flexItem.mo1914m0() + flexItem.mo1909Z() + c0312a.f3194e;
                            }
/* 484 */                   c0312a.f3196g = Math.max(c0312a.f3196g, iMax);
/* 486 */                   i7 = iMax;
                        }
/* 487 */               i6++;
/* 491 */               f3 = f;
/* 493 */               f4 = f4;
                    }
/* 499 */           if (!z2 || i5 == c0312a.f3194e) {
/* 517 */               return;
                    }
/* 514 */           m1980q(i, i2, c0312a, i3, i4, true);
                }

                /* JADX INFO: renamed from: s */
                public final void m1981s(View view, int i, int i2) {
/* 5 */             FlexItem flexItem = (FlexItem) view.getLayoutParams();
/* 16 */            int iMo1912e0 = (i - flexItem.mo1912e0()) - flexItem.mo1908Y0();
/* 17 */            kj0 kj0Var = this.f3208a;
/* 36 */            int iMin = Math.min(Math.max(iMo1912e0 - kj0Var.mo1928k(view), flexItem.mo1906R()), flexItem.mo1917x1());
/* 40 */            long[] jArr = this.f3212e;
/* 57 */            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
/* 61 */            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
/* 65 */            view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
/* 68 */            m1984v(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
/* 71 */            kj0Var.mo1923f(i2, view);
                }

                /* JADX INFO: renamed from: t */
                public final void m1982t(View view, int i, int i2) {
/* 5 */             FlexItem flexItem = (FlexItem) view.getLayoutParams();
/* 16 */            int iMo1914m0 = (i - flexItem.mo1914m0()) - flexItem.mo1909Z();
/* 17 */            kj0 kj0Var = this.f3208a;
/* 36 */            int iMin = Math.min(Math.max(iMo1914m0 - kj0Var.mo1928k(view), flexItem.mo1910b1()), flexItem.mo1913i1());
/* 40 */            long[] jArr = this.f3212e;
/* 54 */            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
/* 58 */            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
/* 62 */            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
/* 65 */            m1984v(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
/* 68 */            kj0Var.mo1923f(i2, view);
                }

                /* JADX INFO: renamed from: u */
                public final void m1983u(int i) {
                    View viewMo1921d;
/* 5 */             kj0 kj0Var = this.f3208a;
/* 11 */            if (i >= kj0Var.getFlexItemCount()) {
/* 226 */               return;
                    }
/* 15 */            int flexDirection = kj0Var.getFlexDirection();
/* 26 */            if (kj0Var.getAlignItems() != 4) {
/* 151 */               for (C0312a c0312a : kj0Var.getFlexLinesInternal()) {
/* 169 */                   for (Integer num : c0312a.f3203n) {
/* 181 */                       View viewMo1921d2 = kj0Var.mo1921d(num.intValue());
/* 187 */                       if (flexDirection == 0 || flexDirection == 1) {
/* 222 */                           m1982t(viewMo1921d2, c0312a.f3196g, num.intValue());
                                } else {
/* 192 */                           if (flexDirection != 2 && flexDirection != 3) {
/* 201 */                               C1951n4.m6859j(fm0.m3781g(flexDirection, "Invalid flex direction: "));
/* 204 */                               return;
                                    }
/* 211 */                           m1981s(viewMo1921d2, c0312a.f3196g, num.intValue());
                                }
                            }
                        }
/* 226 */               return;
                    }
/* 28 */            int[] iArr = this.f3210c;
/* 36 */            List flexLinesInternal = kj0Var.getFlexLinesInternal();
/* 40 */            int size = flexLinesInternal.size();
/* 44 */            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
/* 50 */                C0312a c0312a2 = (C0312a) flexLinesInternal.get(i2);
/* 52 */                int i3 = c0312a2.f3197h;
/* 55 */                for (int i4 = 0; i4 < i3; i4++) {
/* 59 */                    int i5 = c0312a2.f3204o + i4;
/* 64 */                    if (i4 < kj0Var.getFlexItemCount() && (viewMo1921d = kj0Var.mo1921d(i5)) != null && viewMo1921d.getVisibility() != 8) {
/* 86 */                        FlexItem flexItem = (FlexItem) viewMo1921d.getLayoutParams();
/* 93 */                        if (flexItem.mo1903E() == -1 || flexItem.mo1903E() == 4) {
/* 102 */                           if (flexDirection == 0 || flexDirection == 1) {
/* 130 */                               m1982t(viewMo1921d, c0312a2.f3196g, i5);
                                    } else {
/* 108 */                               if (flexDirection != 2 && flexDirection != 3) {
/* 118 */                                   C1951n4.m6859j(fm0.m3781g(flexDirection, "Invalid flex direction: "));
/* 121 */                                   return;
                                        }
/* 124 */                               m1981s(viewMo1921d, c0312a2.f3196g, i5);
                                    }
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: v */
                public final void m1984v(int i, int i2, int i3, View view) {
/* 1 */             long[] jArr = this.f3211d;
/* 10 */            if (jArr != null) {
/* 17 */                jArr[i] = (((long) i2) & KeyboardMap.kValueMask) | (((long) i3) << 32);
                    }
/* 19 */            long[] jArr2 = this.f3212e;
/* 21 */            if (jArr2 != null) {
/* 38 */                jArr2[i] = (((long) view.getMeasuredHeight()) << 32) | (((long) view.getMeasuredWidth()) & KeyboardMap.kValueMask);
                    }
                }
            }
