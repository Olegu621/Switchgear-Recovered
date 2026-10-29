            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.InsetDrawable;
            import android.graphics.drawable.RippleDrawable;
            import android.widget.TextView;
            import androidx.recyclerview.widget.RecyclerView;
            import com.google.android.material.R$styleable;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: q3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 40 */    public final class C2093q3 {

                /* JADX INFO: renamed from: a */
                public int f15369a;

                /* JADX INFO: renamed from: b */
                public final Object f15370b;

                /* JADX INFO: renamed from: c */
                public final Object f15371c;

                /* JADX INFO: renamed from: d */
                public final Object f15372d;

                /* JADX INFO: renamed from: e */
                public final Object f15373e;

                /* JADX INFO: renamed from: f */
                public final Object f15374f;

                public C2093q3(er0 er0Var) {
/* 11 */            this.f15370b = new nt1(30);
/* 18 */            this.f15371c = new ArrayList();
/* 25 */            this.f15372d = new ArrayList();
/* 28 */            this.f15369a = 0;
/* 30 */            this.f15373e = er0Var;
/* 39 */            this.f15374f = new er0(this, 8);
                }

                /* JADX INFO: renamed from: d */
                public static C2093q3 m7680d(Context context, int i) {
/* 9 */             de3.m3023e("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
/* 14 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.MaterialCalendarItem);
/* 44 */            Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetBottom, 0));
/* 49 */            ColorStateList colorStateListM3033o = de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.MaterialCalendarItem_itemFillColor);
/* 55 */            ColorStateList colorStateListM3033o2 = de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.MaterialCalendarItem_itemTextColor);
/* 61 */            ColorStateList colorStateListM3033o3 = de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.MaterialCalendarItem_itemStrokeColor);
/* 67 */            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialCalendarItem_itemStrokeWidth, 0);
/* 93 */            tc2 tc2VarM8478a = tc2.m8774a(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new C0862e(0.0f)).m8478a();
/* 97 */            typedArrayObtainStyledAttributes.recycle();
/* 102 */           return new C2093q3(colorStateListM3033o, colorStateListM3033o2, colorStateListM3033o3, dimensionPixelSize, tc2VarM8478a, rect);
                }

                /* JADX INFO: renamed from: a */
                public boolean m7681a(int i) {
/* 3 */             ArrayList arrayList = (ArrayList) this.f15372d;
/* 5 */             int size = arrayList.size();
/* 11 */            for (int i2 = 0; i2 < size; i2++) {
/* 17 */                C2056p3 c2056p3 = (C2056p3) arrayList.get(i2);
/* 19 */                int i3 = c2056p3.f14951a;
/* 24 */                if (i3 != 8) {
/* 37 */                    if (i3 == 1) {
/* 39 */                        int i4 = c2056p3.f14952b;
/* 43 */                        int i5 = c2056p3.f14953c + i4;
/* 44 */                        while (i4 < i5) {
/* 52 */                            if (m7686g(i4, i2 + 1) == i) {
/* 23 */                                return true;
                                    }
/* 55 */                            i4++;
                                }
                            } else {
                                continue;
                            }
                        } else {
/* 34 */                    if (m7686g(c2056p3.f14953c, i2 + 1) == i) {
/* 23 */                        return true;
                            }
                        }
                    }
/* 9 */             return false;
                }

                /* JADX INFO: renamed from: b */
                public void m7682b() {
/* 3 */             ArrayList arrayList = (ArrayList) this.f15372d;
/* 5 */             int size = arrayList.size();
/* 11 */            for (int i = 0; i < size; i++) {
/* 23 */                ((er0) this.f15373e).m3580e((C2056p3) arrayList.get(i));
                    }
/* 29 */            m7691l(arrayList);
/* 32 */            this.f15369a = 0;
                }

                /* JADX INFO: renamed from: c */
                public void m7683c() {
/* 3 */             er0 er0Var = (er0) this.f15373e;
/* 5 */             m7682b();
/* 10 */            ArrayList arrayList = (ArrayList) this.f15371c;
/* 12 */            int size = arrayList.size();
/* 18 */            for (int i = 0; i < size; i++) {
/* 24 */                C2056p3 c2056p3 = (C2056p3) arrayList.get(i);
/* 26 */                int i2 = c2056p3.f14951a;
/* 29 */                if (i2 == 1) {
/* 88 */                    er0Var.m3580e(c2056p3);
/* 95 */                    er0Var.m3592u(c2056p3.f14952b, c2056p3.f14953c);
                        } else if (i2 == 2) {
/* 64 */                    er0Var.m3580e(c2056p3);
/* 67 */                    int i3 = c2056p3.f14952b;
/* 69 */                    int i4 = c2056p3.f14953c;
/* 73 */                    RecyclerView recyclerView = (RecyclerView) er0Var.f7853b;
/* 75 */                    recyclerView.m863Q(i3, i4, true);
/* 78 */                    recyclerView.f1628U0 = true;
/* 85 */                    recyclerView.f1624R0.f19439c += i4;
                        } else if (i2 == 4) {
/* 53 */                    er0Var.m3580e(c2056p3);
/* 60 */                    er0Var.m3590s(c2056p3.f14952b, c2056p3.f14953c);
                        } else if (i2 == 8) {
/* 42 */                    er0Var.m3580e(c2056p3);
/* 49 */                    er0Var.m3593v(c2056p3.f14952b, c2056p3.f14953c);
                        }
                    }
/* 101 */           m7691l(arrayList);
/* 104 */           this.f15369a = 0;
                }

                /* JADX INFO: renamed from: e */
                public void m7684e(C2056p3 c2056p3) {
                    int i;
/* 3 */             nt1 nt1Var = (nt1) this.f15370b;
/* 5 */             int i2 = c2056p3.f14951a;
/* 8 */             if (i2 == 1 || i2 == 8) {
/* 113 */               C1951n4.m6859j("should not dispatch add or move for pre layout");
/* 116 */               return;
                    }
/* 16 */            int iM7693n = m7693n(c2056p3.f14952b, i2);
/* 20 */            int i3 = c2056p3.f14952b;
/* 22 */            int i4 = c2056p3.f14951a;
/* 26 */            if (i4 == 2) {
/* 38 */                i = 0;
                    } else {
/* 28 */                if (i4 != 4) {
/* 34 */                    s80.m8430k(c2056p3, "op should be remove or update.");
/* 37 */                    return;
                        }
/* 30 */                i = 1;
                    }
/* 40 */            int i5 = 1;
/* 43 */            for (int i6 = 1; i6 < c2056p3.f14953c; i6++) {
/* 52 */                int iM7693n2 = m7693n((i * i6) + c2056p3.f14952b, c2056p3.f14951a);
/* 56 */                int i7 = c2056p3.f14951a;
/* 58 */                if (i7 == 2 ? iM7693n2 != iM7693n : !(i7 == 4 && iM7693n2 == iM7693n + 1)) {
/* 73 */                    C2056p3 c2056p3M7688i = m7688i(i7, iM7693n, i5);
/* 77 */                    m7685f(c2056p3M7688i, i3);
/* 80 */                    nt1Var.mo7044c(c2056p3M7688i);
/* 85 */                    if (c2056p3.f14951a == 4) {
/* 87 */                        i3 += i5;
                            }
/* 88 */                    i5 = 1;
/* 89 */                    iM7693n = iM7693n2;
                        } else {
/* 70 */                    i5++;
                        }
                    }
/* 93 */            nt1Var.mo7044c(c2056p3);
/* 96 */            if (i5 > 0) {
/* 100 */               C2056p3 c2056p3M7688i2 = m7688i(c2056p3.f14951a, iM7693n, i5);
/* 104 */               m7685f(c2056p3M7688i2, i3);
/* 107 */               nt1Var.mo7044c(c2056p3M7688i2);
                    }
                }

                /* JADX INFO: renamed from: f */
                public void m7685f(C2056p3 c2056p3, int i) {
/* 3 */             er0 er0Var = (er0) this.f15373e;
/* 5 */             er0Var.m3580e(c2056p3);
/* 8 */             int i2 = c2056p3.f14951a;
/* 11 */            if (i2 != 2) {
/* 14 */                if (i2 == 4) {
/* 18 */                    er0Var.m3590s(i, c2056p3.f14953c);
/* 21 */                    return;
                        } else {
/* 24 */                    C1951n4.m6859j("only remove and update ops can be dispatched in first pass");
/* 27 */                    return;
                        }
                    }
/* 28 */            int i3 = c2056p3.f14953c;
/* 32 */            RecyclerView recyclerView = (RecyclerView) er0Var.f7853b;
/* 35 */            recyclerView.m863Q(i, i3, true);
/* 38 */            recyclerView.f1628U0 = true;
/* 45 */            recyclerView.f1624R0.f19439c += i3;
                }

                /* JADX INFO: renamed from: g */
                public int m7686g(int i, int i2) {
/* 3 */             ArrayList arrayList = (ArrayList) this.f15372d;
/* 5 */             int size = arrayList.size();
/* 9 */             while (i2 < size) {
/* 15 */                C2056p3 c2056p3 = (C2056p3) arrayList.get(i2);
/* 17 */                int i3 = c2056p3.f14951a;
/* 19 */                int i4 = c2056p3.f14952b;
/* 23 */                if (i3 == 8) {
/* 25 */                    if (i4 == i) {
/* 27 */                        i = c2056p3.f14953c;
                            } else {
/* 30 */                        if (i4 < i) {
/* 32 */                            i--;
                                }
/* 36 */                        if (c2056p3.f14953c <= i) {
/* 38 */                            i++;
                                }
                            }
                        } else if (i4 > i) {
                            continue;
                        } else if (i3 == 2) {
/* 46 */                    int i5 = c2056p3.f14953c;
/* 49 */                    if (i < i4 + i5) {
/* 51 */                        return -1;
                            }
/* 53 */                    i -= i5;
                        } else if (i3 == 1) {
/* 60 */                    i += c2056p3.f14953c;
                        }
/* 61 */                i2++;
                    }
/* 64 */            return i;
                }

                /* JADX INFO: renamed from: h */
                public boolean m7687h() {
                    return ((ArrayList) this.f15371c).size() > 0;
                }

                /* JADX INFO: renamed from: i */
                public C2056p3 m7688i(int i, int i2, int i3) {
/* 9 */             C2056p3 c2056p3 = (C2056p3) ((nt1) this.f15370b).mo7042a();
/* 11 */            if (c2056p3 != null) {
/* 25 */                c2056p3.f14951a = i;
/* 27 */                c2056p3.f14952b = i2;
/* 29 */                c2056p3.f14953c = i3;
/* 31 */                return c2056p3;
                    }
/* 15 */            C2056p3 c2056p4 = new C2056p3();
/* 18 */            c2056p4.f14951a = i;
/* 20 */            c2056p4.f14952b = i2;
/* 22 */            c2056p4.f14953c = i3;
/* 24 */            return c2056p4;
                }

                /* JADX INFO: renamed from: j */
                public void m7689j(C2056p3 c2056p3) {
/* 3 */             er0 er0Var = (er0) this.f15373e;
/* 9 */             ((ArrayList) this.f15372d).add(c2056p3);
/* 12 */            int i = c2056p3.f14951a;
/* 15 */            if (i == 1) {
/* 68 */                er0Var.m3592u(c2056p3.f14952b, c2056p3.f14953c);
/* 71 */                return;
                    }
/* 18 */            if (i == 2) {
/* 49 */                int i2 = c2056p3.f14952b;
/* 51 */                int i3 = c2056p3.f14953c;
/* 55 */                RecyclerView recyclerView = (RecyclerView) er0Var.f7853b;
/* 58 */                recyclerView.m863Q(i2, i3, false);
/* 61 */                recyclerView.f1628U0 = true;
/* 63 */                return;
                    }
/* 21 */            if (i == 4) {
/* 45 */                er0Var.m3590s(c2056p3.f14952b, c2056p3.f14953c);
                    } else if (i == 8) {
/* 31 */                er0Var.m3593v(c2056p3.f14952b, c2056p3.f14953c);
                    } else {
/* 37 */                s80.m8430k(c2056p3, "Unknown update op type for ");
                    }
                }

                /* JADX WARN: Code duplicated, block: B:102:0x0188  */
                /* JADX WARN: Code duplicated, block: B:103:0x018c  */
                /* JADX WARN: Code duplicated, block: B:185:0x00a8 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:186:0x0120 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:189:0x0115 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:190:0x0191 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:199:0x0015 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:203:0x0015 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:29:0x0078  */
                /* JADX WARN: Code duplicated, block: B:30:0x007d  */
                /* JADX WARN: Code duplicated, block: B:32:0x0082  */
                /* JADX WARN: Code duplicated, block: B:36:0x0097  */
                /* JADX WARN: Code duplicated, block: B:37:0x009b  */
                /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
                /* JADX WARN: Code duplicated, block: B:74:0x0122  */
                /* JADX WARN: Code duplicated, block: B:75:0x0124  */
                /* JADX WARN: Code duplicated, block: B:77:0x012a  */
                /* JADX WARN: Code duplicated, block: B:80:0x0135  */
                /* JADX WARN: Code duplicated, block: B:83:0x0140  */
                /* JADX WARN: Code duplicated, block: B:86:0x014b  */
                /* JADX WARN: Code duplicated, block: B:87:0x0151  */
                /* JADX WARN: Code duplicated, block: B:88:0x0153  */
                /* JADX WARN: Code duplicated, block: B:90:0x0159  */
                /* JADX WARN: Code duplicated, block: B:93:0x0164  */
                /* JADX WARN: Code duplicated, block: B:96:0x016f  */
                /* JADX WARN: Code duplicated, block: B:99:0x017a  */
                /* JADX INFO: renamed from: k */
                public void m7690k() {
                    int i;
                    boolean z;
                    byte b;
                    C2056p3 c2056p3M7688i;
                    int i2;
                    int i3;
                    int i4;
                    C2056p3 c2056p3M7688i2;
                    boolean z2;
                    boolean z3;
                    C2056p3 c2056p3M7688i3;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
/* 5 */             nt1 nt1Var = (nt1) this.f15370b;
/* 9 */             er0 er0Var = (er0) this.f15373e;
/* 13 */            er0 er0Var2 = (er0) this.f15374f;
/* 17 */            ArrayList arrayList = (ArrayList) this.f15371c;
/* 19 */            er0Var2.getClass();
                    while (true) {
/* 27 */                int size = arrayList.size() - 1;
/* 28 */                boolean z4 = false;
                        while (true) {
/* 29 */                    i = 8;
/* 32 */                    if (size < 0) {
/* 51 */                        size = -1;
                                break;
                            }
/* 42 */                    if (((C2056p3) arrayList.get(size)).f14951a != 8) {
/* 47 */                        z4 = true;
                            } else if (z4) {
                                break;
                            }
/* 48 */                    size--;
                        }
/* 54 */                if (size == -1) {
                            break;
                        }
/* 56 */                int i13 = size + 1;
/* 60 */                C2093q3 c2093q3 = (C2093q3) er0Var2.f7853b;
/* 64 */                nt1 nt1Var2 = (nt1) c2093q3.f15370b;
/* 70 */                C2056p3 c2056p3 = (C2056p3) arrayList.get(size);
/* 76 */                C2056p3 c2056p4 = (C2056p3) arrayList.get(i13);
/* 78 */                int i14 = c2056p4.f14951a;
/* 80 */                if (i14 == 1) {
/* 407 */                   int i15 = c2056p3.f14953c;
/* 409 */                   int i16 = c2056p4.f14952b;
/* 416 */                   int i17 = i15 < i16 ? -1 : 0;
/* 418 */                   int i18 = c2056p3.f14952b;
/* 420 */                   if (i18 < i16) {
/* 422 */                       i17++;
                            }
/* 424 */                   if (i16 <= i18) {
/* 429 */                       c2056p3.f14952b = i18 + c2056p4.f14953c;
                            }
/* 431 */                   int i19 = c2056p4.f14952b;
/* 433 */                   if (i19 <= i15) {
/* 438 */                       c2056p3.f14953c = i15 + c2056p4.f14953c;
                            }
/* 442 */                   c2056p4.f14952b = i19 + i17;
/* 444 */                   arrayList.set(size, c2056p4);
/* 447 */                   arrayList.set(i13, c2056p3);
                        } else if (i14 == 2) {
/* 174 */                   int i20 = c2056p3.f14952b;
/* 176 */                   int i21 = c2056p3.f14953c;
/* 178 */                   int i22 = c2056p4.f14952b;
/* 180 */                   if (i20 < i21) {
/* 194 */                       z2 = i22 == i20 && c2056p4.f14953c == i21 - i20;
/* 191 */                       z3 = false;
                            } else {
/* 209 */                       z2 = i22 == i21 + 1 && c2056p4.f14953c == i20 - i21;
/* 206 */                       z3 = true;
                            }
/* 211 */                   if (i21 < i22) {
/* 215 */                       c2056p4.f14952b = i22 - 1;
                            } else {
/* 218 */                       int i23 = c2056p4.f14953c;
/* 221 */                       if (i21 < i22 + i23) {
/* 225 */                           c2056p4.f14953c = i23 - 1;
/* 227 */                           c2056p3.f14951a = 2;
/* 230 */                           c2056p3.f14953c = 1;
/* 234 */                           if (c2056p4.f14953c == 0) {
/* 236 */                               arrayList.remove(i13);
/* 239 */                               nt1Var2.mo7044c(c2056p4);
                                    }
                                }
                            }
/* 244 */                   int i24 = c2056p3.f14952b;
/* 246 */                   int i25 = c2056p4.f14952b;
/* 248 */                   if (i24 <= i25) {
/* 252 */                       c2056p4.f14952b = i25 + 1;
                            } else {
/* 257 */                       int i26 = i25 + c2056p4.f14953c;
/* 258 */                       if (i24 < i26) {
/* 263 */                           c2056p3M7688i3 = c2093q3.m7688i(2, i24 + 1, i26 - i24);
/* 272 */                           c2056p4.f14953c = c2056p3.f14952b - c2056p4.f14952b;
                                }
/* 276 */                       if (z2) {
/* 278 */                           arrayList.set(size, c2056p4);
/* 281 */                           arrayList.remove(i13);
/* 284 */                           nt1Var2.mo7044c(c2056p3);
                                } else {
/* 289 */                           if (z3) {
/* 291 */                               if (c2056p3M7688i3 != null) {
/* 293 */                                   i11 = c2056p3.f14952b;
/* 297 */                                   if (i11 > c2056p3M7688i3.f14952b) {
/* 302 */                                       c2056p3.f14952b = i11 - c2056p3M7688i3.f14953c;
                                            }
/* 304 */                                   i12 = c2056p3.f14953c;
/* 308 */                                   if (i12 > c2056p3M7688i3.f14952b) {
/* 313 */                                       c2056p3.f14953c = i12 - c2056p3M7688i3.f14953c;
                                            }
                                        }
/* 315 */                               i9 = c2056p3.f14952b;
/* 319 */                               if (i9 > c2056p4.f14952b) {
/* 324 */                                   c2056p3.f14952b = i9 - c2056p4.f14953c;
                                        }
/* 326 */                               i10 = c2056p3.f14953c;
/* 330 */                               if (i10 > c2056p4.f14952b) {
/* 335 */                                   c2056p3.f14953c = i10 - c2056p4.f14953c;
                                        }
                                    } else {
/* 338 */                               if (c2056p3M7688i3 != null) {
/* 340 */                                   i7 = c2056p3.f14952b;
/* 344 */                                   if (i7 >= c2056p3M7688i3.f14952b) {
/* 349 */                                       c2056p3.f14952b = i7 - c2056p3M7688i3.f14953c;
                                            }
/* 351 */                                   i8 = c2056p3.f14953c;
/* 355 */                                   if (i8 >= c2056p3M7688i3.f14952b) {
/* 360 */                                       c2056p3.f14953c = i8 - c2056p3M7688i3.f14953c;
                                            }
                                        }
/* 362 */                               i5 = c2056p3.f14952b;
/* 366 */                               if (i5 >= c2056p4.f14952b) {
/* 371 */                                   c2056p3.f14952b = i5 - c2056p4.f14953c;
                                        }
/* 373 */                               i6 = c2056p3.f14953c;
/* 377 */                               if (i6 >= c2056p4.f14952b) {
/* 382 */                                   c2056p3.f14953c = i6 - c2056p4.f14953c;
                                        }
                                    }
/* 384 */                           arrayList.set(size, c2056p4);
/* 391 */                           if (c2056p3.f14952b != c2056p3.f14953c) {
/* 393 */                               arrayList.set(i13, c2056p3);
                                    } else {
/* 397 */                               arrayList.remove(i13);
                                    }
/* 400 */                           if (c2056p3M7688i3 != null) {
/* 402 */                               arrayList.add(size, c2056p3M7688i3);
                                    }
                                }
                            }
/* 275 */                   c2056p3M7688i3 = null;
/* 276 */                   if (z2) {
/* 278 */                       arrayList.set(size, c2056p4);
/* 281 */                       arrayList.remove(i13);
/* 284 */                       nt1Var2.mo7044c(c2056p3);
                            } else {
/* 289 */                       if (z3) {
/* 291 */                           if (c2056p3M7688i3 != null) {
/* 293 */                               i11 = c2056p3.f14952b;
/* 297 */                               if (i11 > c2056p3M7688i3.f14952b) {
/* 302 */                                   c2056p3.f14952b = i11 - c2056p3M7688i3.f14953c;
                                        }
/* 304 */                               i12 = c2056p3.f14953c;
/* 308 */                               if (i12 > c2056p3M7688i3.f14952b) {
/* 313 */                                   c2056p3.f14953c = i12 - c2056p3M7688i3.f14953c;
                                        }
                                    }
/* 315 */                           i9 = c2056p3.f14952b;
/* 319 */                           if (i9 > c2056p4.f14952b) {
/* 324 */                               c2056p3.f14952b = i9 - c2056p4.f14953c;
                                    }
/* 326 */                           i10 = c2056p3.f14953c;
/* 330 */                           if (i10 > c2056p4.f14952b) {
/* 335 */                               c2056p3.f14953c = i10 - c2056p4.f14953c;
                                    }
                                } else {
/* 338 */                           if (c2056p3M7688i3 != null) {
/* 340 */                               i7 = c2056p3.f14952b;
/* 344 */                               if (i7 >= c2056p3M7688i3.f14952b) {
/* 349 */                                   c2056p3.f14952b = i7 - c2056p3M7688i3.f14953c;
                                        }
/* 351 */                               i8 = c2056p3.f14953c;
/* 355 */                               if (i8 >= c2056p3M7688i3.f14952b) {
/* 360 */                                   c2056p3.f14953c = i8 - c2056p3M7688i3.f14953c;
                                        }
                                    }
/* 362 */                           i5 = c2056p3.f14952b;
/* 366 */                           if (i5 >= c2056p4.f14952b) {
/* 371 */                               c2056p3.f14952b = i5 - c2056p4.f14953c;
                                    }
/* 373 */                           i6 = c2056p3.f14953c;
/* 377 */                           if (i6 >= c2056p4.f14952b) {
/* 382 */                               c2056p3.f14953c = i6 - c2056p4.f14953c;
                                    }
                                }
/* 384 */                       arrayList.set(size, c2056p4);
/* 391 */                       if (c2056p3.f14952b != c2056p3.f14953c) {
/* 393 */                           arrayList.set(i13, c2056p3);
                                } else {
/* 397 */                           arrayList.remove(i13);
                                }
/* 400 */                       if (c2056p3M7688i3 != null) {
/* 402 */                           arrayList.add(size, c2056p3M7688i3);
                                }
                            }
                        } else if (i14 == 4) {
/* 87 */                    int i27 = c2056p3.f14953c;
/* 89 */                    int i28 = c2056p4.f14952b;
/* 91 */                    if (i27 < i28) {
/* 95 */                        c2056p4.f14952b = i28 - 1;
                            } else {
/* 98 */                        int i29 = c2056p4.f14953c;
/* 101 */                       if (i27 < i28 + i29) {
/* 105 */                           c2056p4.f14953c = i29 - 1;
/* 109 */                           c2056p3M7688i = c2093q3.m7688i(4, c2056p3.f14952b, 1);
                                }
/* 115 */                       i2 = c2056p3.f14952b;
/* 117 */                       i3 = c2056p4.f14952b;
/* 119 */                       if (i2 <= i3) {
/* 123 */                           c2056p4.f14952b = i3 + 1;
                                } else {
/* 128 */                           i4 = i3 + c2056p4.f14953c;
/* 129 */                           if (i2 < i4) {
/* 131 */                               int i30 = i4 - i2;
/* 134 */                               c2056p3M7688i2 = c2093q3.m7688i(4, i2 + 1, i30);
/* 141 */                               c2056p4.f14953c -= i30;
                                    }
/* 145 */                           arrayList.set(i13, c2056p3);
/* 150 */                           if (c2056p4.f14953c > 0) {
/* 152 */                               arrayList.set(size, c2056p4);
                                    } else {
/* 156 */                               arrayList.remove(size);
/* 159 */                               nt1Var2.mo7044c(c2056p4);
                                    }
/* 162 */                           if (c2056p3M7688i != null) {
/* 164 */                               arrayList.add(size, c2056p3M7688i);
                                    }
/* 167 */                           if (c2056p3M7688i2 != null) {
/* 169 */                               arrayList.add(size, c2056p3M7688i2);
                                    }
                                }
/* 144 */                       c2056p3M7688i2 = null;
/* 145 */                       arrayList.set(i13, c2056p3);
/* 150 */                       if (c2056p4.f14953c > 0) {
/* 152 */                           arrayList.set(size, c2056p4);
                                } else {
/* 156 */                           arrayList.remove(size);
/* 159 */                           nt1Var2.mo7044c(c2056p4);
                                }
/* 162 */                       if (c2056p3M7688i != null) {
/* 164 */                           arrayList.add(size, c2056p3M7688i);
                                }
/* 167 */                       if (c2056p3M7688i2 != null) {
/* 169 */                           arrayList.add(size, c2056p3M7688i2);
                                }
                            }
/* 114 */                   c2056p3M7688i = null;
/* 115 */                   i2 = c2056p3.f14952b;
/* 117 */                   i3 = c2056p4.f14952b;
/* 119 */                   if (i2 <= i3) {
/* 123 */                       c2056p4.f14952b = i3 + 1;
                            } else {
/* 128 */                       i4 = i3 + c2056p4.f14953c;
/* 129 */                       if (i2 < i4) {
/* 131 */                           int i31 = i4 - i2;
/* 134 */                           c2056p3M7688i2 = c2093q3.m7688i(4, i2 + 1, i31);
/* 141 */                           c2056p4.f14953c -= i31;
                                }
/* 145 */                       arrayList.set(i13, c2056p3);
/* 150 */                       if (c2056p4.f14953c > 0) {
/* 152 */                           arrayList.set(size, c2056p4);
                                } else {
/* 156 */                           arrayList.remove(size);
/* 159 */                           nt1Var2.mo7044c(c2056p4);
                                }
/* 162 */                       if (c2056p3M7688i != null) {
/* 164 */                           arrayList.add(size, c2056p3M7688i);
                                }
/* 167 */                       if (c2056p3M7688i2 != null) {
/* 169 */                           arrayList.add(size, c2056p3M7688i2);
                                }
                            }
/* 144 */                   c2056p3M7688i2 = null;
/* 145 */                   arrayList.set(i13, c2056p3);
/* 150 */                   if (c2056p4.f14953c > 0) {
/* 152 */                       arrayList.set(size, c2056p4);
                            } else {
/* 156 */                       arrayList.remove(size);
/* 159 */                       nt1Var2.mo7044c(c2056p4);
                            }
/* 162 */                   if (c2056p3M7688i != null) {
/* 164 */                       arrayList.add(size, c2056p3M7688i);
                            }
/* 167 */                   if (c2056p3M7688i2 != null) {
/* 169 */                       arrayList.add(size, c2056p3M7688i2);
                            }
                        }
                    }
/* 452 */           int size2 = arrayList.size();
/* 456 */           int i32 = 0;
/* 457 */           while (i32 < size2) {
/* 463 */               C2056p3 c2056p3M7688i4 = (C2056p3) arrayList.get(i32);
/* 465 */               int i33 = c2056p3M7688i4.f14951a;
/* 468 */               if (i33 == 1) {
/* 655 */                   m7689j(c2056p3M7688i4);
                        } else if (i33 == 2) {
/* 564 */                   int i34 = c2056p3M7688i4.f14952b;
/* 568 */                   int i35 = c2056p3M7688i4.f14953c + i34;
/* 569 */                   int i36 = i34;
/* 570 */                   byte b2 = -1;
/* 571 */                   int i37 = 0;
/* 572 */                   while (i36 < i35) {
/* 578 */                       if (er0Var.m3581g(i36) != null || m7681a(i36)) {
/* 602 */                           if (b2 == 0) {
/* 608 */                               m7684e(m7688i(2, i34, i37));
/* 611 */                               z = true;
                                    } else {
/* 613 */                               z = false;
                                    }
/* 614 */                           b = 1;
                                } else {
/* 588 */                           if (b2 == 1) {
/* 594 */                               m7689j(m7688i(2, i34, i37));
/* 597 */                               z = true;
                                    } else {
/* 599 */                               z = false;
                                    }
/* 600 */                           b = 0;
                                }
/* 615 */                       if (z) {
/* 617 */                           i36 -= i37;
/* 618 */                           i35 -= i37;
/* 619 */                           i37 = 1;
                                } else {
/* 623 */                           i37++;
                                }
/* 626 */                       i36++;
/* 628 */                       b2 = b;
                            }
/* 634 */                   if (i37 != c2056p3M7688i4.f14953c) {
/* 636 */                       nt1Var.mo7044c(c2056p3M7688i4);
/* 639 */                       c2056p3M7688i4 = m7688i(2, i34, i37);
                            }
/* 643 */                   if (b2 == 0) {
/* 645 */                       m7684e(c2056p3M7688i4);
                            } else {
/* 649 */                       m7689j(c2056p3M7688i4);
                            }
                        } else if (i33 == 4) {
/* 484 */                   int i38 = c2056p3M7688i4.f14952b;
/* 488 */                   int i39 = c2056p3M7688i4.f14953c + i38;
/* 489 */                   int i40 = i38;
/* 490 */                   byte b3 = -1;
/* 491 */                   int i41 = 0;
/* 492 */                   while (i38 < i39) {
/* 498 */                       if (er0Var.m3581g(i38) != null || m7681a(i38)) {
/* 523 */                           if (b3 == 0) {
/* 529 */                               m7684e(m7688i(4, i40, i41));
/* 532 */                               i40 = i38;
/* 533 */                               i41 = 0;
                                    }
/* 534 */                           b3 = 1;
                                } else {
/* 508 */                           if (b3 == 1) {
/* 514 */                               m7689j(m7688i(4, i40, i41));
/* 517 */                               i40 = i38;
/* 518 */                               i41 = 0;
                                    }
/* 519 */                           b3 = 0;
                                }
/* 536 */                       i41++;
/* 538 */                       i38++;
                            }
/* 545 */                   if (i41 != c2056p3M7688i4.f14953c) {
/* 547 */                       nt1Var.mo7044c(c2056p3M7688i4);
/* 550 */                       c2056p3M7688i4 = m7688i(4, i40, i41);
                            }
/* 554 */                   if (b3 == 0) {
/* 556 */                       m7684e(c2056p3M7688i4);
                            } else {
/* 560 */                       m7689j(c2056p3M7688i4);
                            }
                        } else if (i33 == i) {
/* 480 */                   m7689j(c2056p3M7688i4);
                        }
/* 658 */               i32++;
/* 660 */               i = 8;
                    }
/* 664 */           arrayList.clear();
                }

                /* JADX INFO: renamed from: l */
                public void m7691l(ArrayList arrayList) {
/* 1 */             int size = arrayList.size();
/* 6 */             for (int i = 0; i < size; i++) {
/* 12 */                C2056p3 c2056p3 = (C2056p3) arrayList.get(i);
/* 14 */                c2056p3.getClass();
/* 21 */                ((nt1) this.f15370b).mo7044c(c2056p3);
                    }
/* 27 */            arrayList.clear();
                }

                /* JADX INFO: renamed from: m */
                public void m7692m(TextView textView) {
/* 3 */             fd1 fd1Var = new fd1();
/* 8 */             fd1 fd1Var2 = new fd1();
/* 13 */            tc2 tc2Var = (tc2) this.f15374f;
/* 15 */            fd1Var.setShapeAppearanceModel(tc2Var);
/* 18 */            fd1Var2.setShapeAppearanceModel(tc2Var);
/* 25 */            fd1Var.m3742n((ColorStateList) this.f15372d);
/* 28 */            float f = this.f15369a;
/* 33 */            ColorStateList colorStateList = (ColorStateList) this.f15373e;
/* 37 */            fd1Var.f8151a.f7644j = f;
/* 39 */            fd1Var.invalidateSelf();
/* 42 */            fd1Var.m3747s(colorStateList);
/* 47 */            ColorStateList colorStateList2 = (ColorStateList) this.f15371c;
/* 49 */            textView.setTextColor(colorStateList2);
/* 60 */            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2.withAlpha(30), fd1Var, fd1Var2);
/* 67 */            Rect rect = (Rect) this.f15370b;
/* 77 */            InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
/* 80 */            WeakHashMap weakHashMap = e33.f7494a;
/* 82 */            textView.setBackground(insetDrawable);
                }

                /* JADX INFO: renamed from: n */
                public int m7693n(int i, int i2) {
                    int i3;
                    int i4;
/* 3 */             nt1 nt1Var = (nt1) this.f15370b;
/* 7 */             ArrayList arrayList = (ArrayList) this.f15372d;
/* 17 */            for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 23 */                C2056p3 c2056p3 = (C2056p3) arrayList.get(size);
/* 25 */                int i5 = c2056p3.f14951a;
/* 27 */                int i6 = c2056p3.f14952b;
/* 30 */                if (i5 == 8) {
/* 32 */                    int i7 = c2056p3.f14953c;
/* 34 */                    if (i6 < i7) {
/* 36 */                        i4 = i7;
/* 37 */                        i3 = i6;
                            } else {
/* 39 */                        i3 = i7;
/* 40 */                        i4 = i6;
                            }
/* 41 */                    if (i < i3 || i > i4) {
/* 79 */                        if (i < i6) {
/* 81 */                            if (i2 == 1) {
/* 85 */                                c2056p3.f14952b = i6 + 1;
/* 89 */                                c2056p3.f14953c = i7 + 1;
                                    } else if (i2 == 2) {
/* 96 */                                c2056p3.f14952b = i6 - 1;
/* 100 */                               c2056p3.f14953c = i7 - 1;
                                    }
                                }
                            } else if (i3 == i6) {
/* 47 */                        if (i2 == 1) {
/* 51 */                            c2056p3.f14953c = i7 + 1;
                                } else if (i2 == 2) {
/* 58 */                            c2056p3.f14953c = i7 - 1;
                                }
/* 60 */                        i++;
                            } else {
/* 63 */                        if (i2 == 1) {
/* 67 */                            c2056p3.f14952b = i6 + 1;
                                } else if (i2 == 2) {
/* 74 */                            c2056p3.f14952b = i6 - 1;
                                }
/* 76 */                        i--;
                            }
                        } else if (i6 <= i) {
/* 105 */                   if (i5 == 1) {
/* 109 */                       i -= c2056p3.f14953c;
                            } else if (i5 == 2) {
/* 115 */                       i += c2056p3.f14953c;
                            }
                        } else if (i2 == 1) {
/* 121 */                   c2056p3.f14952b = i6 + 1;
                        } else if (i2 == 2) {
/* 128 */                   c2056p3.f14952b = i6 - 1;
                        }
                    }
/* 138 */           for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
/* 144 */               C2056p3 c2056p4 = (C2056p3) arrayList.get(size2);
/* 146 */               int i8 = c2056p4.f14951a;
/* 148 */               int i9 = c2056p4.f14953c;
/* 150 */               if (i8 == 8) {
/* 154 */                   if (i9 == c2056p4.f14952b || i9 < 0) {
/* 158 */                       arrayList.remove(size2);
/* 161 */                       nt1Var.mo7044c(c2056p4);
                            }
                        } else if (i9 <= 0) {
/* 167 */                   arrayList.remove(size2);
/* 170 */                   nt1Var.mo7044c(c2056p4);
                        }
                    }
/* 176 */           return i;
                }

/* 41 */        public C2093q3(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, tc2 tc2Var, Rect rect) {
/* 43 */            de3.m3026h(rect.left);
/* 44 */            de3.m3026h(rect.top);
/* 45 */            de3.m3026h(rect.right);
/* 46 */            de3.m3026h(rect.bottom);
/* 47 */            this.f15370b = rect;
/* 48 */            this.f15371c = colorStateList2;
/* 49 */            this.f15372d = colorStateList;
/* 50 */            this.f15373e = colorStateList3;
/* 51 */            this.f15369a = i;
/* 52 */            this.f15374f = tc2Var;
                }
            }
