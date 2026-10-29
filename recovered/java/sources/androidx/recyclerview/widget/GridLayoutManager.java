            package androidx.recyclerview.widget;

            import android.content.Context;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.util.SparseIntArray;
            import android.view.View;
            import android.view.ViewGroup;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.WeakHashMap;
            import p000.C0864e1;
            import p000.C0901f1;
            import p000.C1771iw;
            import p000.C1951n4;
            import p000.e33;
            import p000.fm0;
            import p000.s71;
            import p000.wc0;
            import p000.y12;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public class GridLayoutManager extends LinearLayoutManager {

                /* JADX INFO: renamed from: p0 */
                public boolean f1576p0;

                /* JADX INFO: renamed from: q0 */
                public int f1577q0;

                /* JADX INFO: renamed from: r0 */
                public int[] f1578r0;

                /* JADX INFO: renamed from: s0 */
                public View[] f1579s0;

                /* JADX INFO: renamed from: t0 */
                public final SparseIntArray f1580t0;

                /* JADX INFO: renamed from: u0 */
                public final SparseIntArray f1581u0;

                /* JADX INFO: renamed from: v0 */
                public final wc0 f1582v0;

                /* JADX INFO: renamed from: w0 */
                public final Rect f1583w0;

                public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
/* 1 */             super(context, attributeSet, i, i2);
/* 5 */             this.f1576p0 = false;
/* 8 */             this.f1577q0 = -1;
/* 15 */            this.f1580t0 = new SparseIntArray();
/* 22 */            this.f1581u0 = new SparseIntArray();
/* 31 */            this.f1582v0 = new wc0(11);
/* 38 */            this.f1583w0 = new Rect();
/* 46 */            m794x1(AbstractC0133k.m975P(context, attributeSet, i, i2).f14587b);
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: C */
                public final RecyclerView.LayoutParams mo762C() {
                    return this.f1586a0 == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: C0 */
                public final void mo763C0(Rect rect, int i, int i2) {
                    int iM978r;
                    int iM978r2;
/* 3 */             if (this.f1578r0 == null) {
/* 5 */                 super.mo763C0(rect, i, i2);
                    }
/* 16 */            int paddingRight = getPaddingRight() + getPaddingLeft();
/* 25 */            int paddingBottom = getPaddingBottom() + getPaddingTop();
/* 29 */            if (this.f1586a0 == 1) {
/* 35 */                int iHeight = rect.height() + paddingBottom;
/* 36 */                RecyclerView recyclerView = this.f1760b;
/* 38 */                WeakHashMap weakHashMap = e33.f7494a;
/* 44 */                iM978r2 = AbstractC0133k.m978r(i2, iHeight, recyclerView.getMinimumHeight());
/* 48 */                int[] iArr = this.f1578r0;
/* 61 */                iM978r = AbstractC0133k.m978r(i, iArr[iArr.length - 1] + paddingRight, this.f1760b.getMinimumWidth());
                    } else {
/* 70 */                int iWidth = rect.width() + paddingRight;
/* 71 */                RecyclerView recyclerView2 = this.f1760b;
/* 73 */                WeakHashMap weakHashMap2 = e33.f7494a;
/* 79 */                iM978r = AbstractC0133k.m978r(i, iWidth, recyclerView2.getMinimumWidth());
/* 83 */                int[] iArr2 = this.f1578r0;
/* 96 */                iM978r2 = AbstractC0133k.m978r(i2, iArr2[iArr2.length - 1] + paddingBottom, this.f1760b.getMinimumHeight());
                    }
/* 1 */             this.f1760b.setMeasuredDimension(iM978r, iM978r2);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: D */
                public final RecyclerView.LayoutParams mo764D(Context context, AttributeSet attributeSet) {
/* 3 */             return new LayoutParams(context, attributeSet);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: E */
                public final RecyclerView.LayoutParams mo765E(ViewGroup.LayoutParams layoutParams) {
/* 5 */             if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
/* 11 */                LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
/* 14 */                layoutParams2.f1584e = -1;
/* 16 */                layoutParams2.f1585f = 0;
/* 18 */                return layoutParams2;
                    }
/* 21 */            LayoutParams layoutParams3 = new LayoutParams(layoutParams);
/* 24 */            layoutParams3.f1584e = -1;
/* 26 */            layoutParams3.f1585f = 0;
/* 28 */            return layoutParams3;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: I */
                public final int mo766I(C0134l c0134l, y12 y12Var) {
/* 4 */             if (this.f1586a0 == 1) {
/* 6 */                 return this.f1577q0;
                    }
/* 13 */            if (y12Var.m10082b() < 1) {
/* 15 */                return 0;
                    }
/* 26 */            return m787t1(y12Var.m10082b() - 1, y12Var, c0134l) + 1;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: K0 */
                public final boolean mo767K0() {
                    return this.f1596k0 == null && !this.f1576p0;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager
                /* JADX INFO: renamed from: M0 */
                public final void mo768M0(y12 y12Var, C0124b c0124b, C1771iw c1771iw) {
                    int i;
/* 1 */             int i2 = this.f1577q0;
/* 7 */             for (int i3 = 0; i3 < this.f1577q0 && (i = c0124b.f1731d) >= 0 && i < y12Var.m10082b() && i2 > 0; i3++) {
/* 29 */                c1771iw.m5583a(c0124b.f1731d, Math.max(0, c0124b.f1734g));
/* 34 */                this.f1582v0.getClass();
/* 37 */                i2--;
/* 44 */                c0124b.f1731d += c0124b.f1732e;
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: Q */
                public final int mo769Q(C0134l c0134l, y12 y12Var) {
/* 3 */             if (this.f1586a0 == 0) {
/* 5 */                 return this.f1577q0;
                    }
/* 13 */            if (y12Var.m10082b() < 1) {
/* 15 */                return 0;
                    }
/* 26 */            return m787t1(y12Var.m10082b() - 1, y12Var, c0134l) + 1;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager
                /* JADX INFO: renamed from: Z0 */
                public final View mo770Z0(C0134l c0134l, y12 y12Var, boolean z, boolean z2) {
                    int i;
                    int iM986G;
/* 1 */             int iM986G2 = m986G();
/* 5 */             int i2 = 1;
/* 6 */             if (z2) {
/* 12 */                iM986G = m986G() - 1;
/* 13 */                i = -1;
/* 14 */                i2 = -1;
                    } else {
/* 18 */                i = iM986G2;
/* 19 */                iM986G = 0;
                    }
/* 20 */            int iM10082b = y12Var.m10082b();
/* 24 */            m807R0();
/* 29 */            int iMo950k = this.f1588c0.mo950k();
/* 35 */            int iMo946g = this.f1588c0.mo946g();
/* 39 */            View view = null;
/* 40 */            View view2 = null;
/* 41 */            while (iM986G != i) {
/* 43 */                View viewM984F = m984F(iM986G);
/* 47 */                int iM974O = AbstractC0133k.m974O(viewM984F);
/* 51 */                if (iM974O >= 0 && iM974O < iM10082b && m788u1(iM974O, y12Var, c0134l) == 0) {
/* 74 */                    if (((RecyclerView.LayoutParams) viewM984F.getLayoutParams()).f1681a.m1024h()) {
/* 76 */                        if (view2 == null) {
/* 78 */                            view2 = viewM984F;
                                }
                            } else {
/* 86 */                        if (this.f1588c0.mo944e(viewM984F) < iMo946g && this.f1588c0.mo941b(viewM984F) >= iMo950k) {
/* 97 */                            return viewM984F;
                                }
/* 98 */                        if (view == null) {
/* 100 */                           view = viewM984F;
                                }
                            }
                        }
/* 101 */               iM986G += i2;
                    }
                    return view != null ? view : view2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
                
                    if (r13 == (r2 > r15)) goto L57;
                 */
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: a0 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final View mo771a0(View view, int i, C0134l c0134l, y12 y12Var) {
                    View viewM851B;
                    int iM986G;
                    int i2;
                    int iM986G2;
                    View view2;
                    View view3;
                    int i3;
                    int i4;
/* 3 */             C0134l c0134l2 = c0134l;
/* 5 */             y12 y12Var2 = y12Var;
/* 7 */             RecyclerView recyclerView = this.f1760b;
/* 10 */            if (recyclerView == null || (viewM851B = recyclerView.m851B(view)) == null || ((ArrayList) this.f1759a.f7615d).contains(viewM851B)) {
/* 36 */                viewM851B = null;
                    }
/* 37 */            if (viewM851B != null) {
/* 44 */                LayoutParams layoutParams = (LayoutParams) viewM851B.getLayoutParams();
/* 46 */                int i5 = layoutParams.f1584e;
/* 50 */                int i6 = layoutParams.f1585f + i5;
/* 55 */                if (super.mo771a0(view, i, c0134l, y12Var) != null) {
/* 73 */                    if ((m806Q0(i) == 1) != this.f1591f0) {
/* 79 */                        iM986G2 = m986G() - 1;
/* 80 */                        iM986G = -1;
/* 81 */                        i2 = -1;
                            } else {
/* 83 */                        iM986G = m986G();
/* 88 */                        i2 = 1;
/* 89 */                        iM986G2 = 0;
                            }
/* 102 */                   boolean z = this.f1586a0 == 1 && m823e1();
/* 103 */                   int iM787t1 = m787t1(iM986G2, y12Var2, c0134l2);
/* 107 */                   View view4 = null;
/* 109 */                   int i7 = -1;
/* 110 */                   int i8 = -1;
/* 111 */                   int iMin = 0;
/* 112 */                   int i9 = iM986G2;
/* 113 */                   int iMin2 = 0;
/* 114 */                   View view5 = null;
                            while (true) {
/* 116 */                       view2 = view5;
/* 118 */                       if (i9 == iM986G) {
                                    break;
                                }
/* 120 */                       int iM787t2 = m787t1(i9, y12Var2, c0134l2);
/* 124 */                       View viewM984F = m984F(i9);
/* 128 */                       if (viewM984F == viewM851B) {
                                    break;
                                }
/* 136 */                       if (!viewM984F.hasFocusable() || iM787t2 == iM787t1) {
/* 156 */                           LayoutParams layoutParams2 = (LayoutParams) viewM984F.getLayoutParams();
/* 158 */                           int i10 = layoutParams2.f1584e;
/* 160 */                           view3 = viewM851B;
/* 164 */                           int i11 = layoutParams2.f1585f + i10;
/* 169 */                           if (viewM984F.hasFocusable() && i10 == i5 && i11 == i6) {
/* 175 */                               return viewM984F;
                                    }
/* 180 */                           if (!(viewM984F.hasFocusable() && view4 == null) && (viewM984F.hasFocusable() || view2 != null)) {
/* 205 */                               i3 = iM986G;
/* 207 */                               int iMin3 = Math.min(i11, i6) - Math.max(i10, i5);
/* 213 */                               if (viewM984F.hasFocusable()) {
/* 215 */                                   if (iMin3 <= iMin) {
/* 220 */                                       if (iMin3 == iMin) {
                                                }
/* 230 */                                       i4 = iMin;
                                            }
/* 217 */                                   i4 = iMin;
                                        } else if (view4 == null) {
/* 235 */                                   i4 = iMin;
/* 243 */                                   if (!this.f1761c.m9562m(viewM984F) || !this.f1762d.m9562m(viewM984F)) {
/* 254 */                                       if (iMin3 <= iMin2) {
/* 257 */                                           if (iMin3 == iMin2) {
/* 264 */                                               if (z == (i10 > i7)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
/* 230 */                                   i4 = iMin;
                                        }
/* 309 */                               i9 += i2;
/* 310 */                               c0134l2 = c0134l;
/* 312 */                               y12Var2 = y12Var;
/* 314 */                               viewM851B = view3;
/* 316 */                               iM986G = i3;
                                    } else {
/* 192 */                               i4 = iMin;
/* 194 */                               i3 = iM986G;
                                    }
/* 266 */                           boolean zHasFocusable = viewM984F.hasFocusable();
/* 270 */                           int i12 = layoutParams2.f1584e;
/* 272 */                           if (zHasFocusable) {
/* 282 */                               iMin = Math.min(i11, i6) - Math.max(i10, i5);
/* 284 */                               view4 = viewM984F;
/* 286 */                               i8 = i12;
/* 287 */                               view5 = view2;
                                    } else {
/* 298 */                               iMin2 = Math.min(i11, i6) - Math.max(i10, i5);
/* 300 */                               i7 = i12;
/* 301 */                               iMin = i4;
/* 303 */                               view5 = viewM984F;
                                    }
/* 309 */                           i9 += i2;
/* 310 */                           c0134l2 = c0134l;
/* 312 */                           y12Var2 = y12Var;
/* 314 */                           viewM851B = view3;
/* 316 */                           iM986G = i3;
                                } else {
/* 140 */                           if (view4 != null) {
                                        break;
                                    }
/* 144 */                           view3 = viewM851B;
/* 146 */                           i4 = iMin;
/* 148 */                           i3 = iM986G;
                                }
/* 305 */                       view5 = view2;
/* 307 */                       iMin = i4;
/* 309 */                       i9 += i2;
/* 310 */                       c0134l2 = c0134l;
/* 312 */                       y12Var2 = y12Var;
/* 314 */                       viewM851B = view3;
/* 316 */                       iM986G = i3;
                            }
                            return view4 != null ? view4 : view2;
                        }
                    }
/* 9 */             return null;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: e0 */
                public final void mo772e0(C0134l c0134l, y12 y12Var, View view, C0901f1 c0901f1) {
/* 1 */             ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
/* 7 */             if (!(layoutParams instanceof LayoutParams)) {
/* 9 */                 m993d0(view, c0901f1);
/* 12 */                return;
                    }
/* 13 */            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
/* 21 */            int iM787t1 = m787t1(layoutParams2.f1681a.m1018b(), y12Var, c0134l);
/* 25 */            int i = this.f1586a0;
/* 27 */            int i2 = layoutParams2.f1584e;
/* 29 */            int i3 = layoutParams2.f1585f;
/* 33 */            if (i == 0) {
/* 39 */                c0901f1.m3629j(C0864e1.m3291a(i2, i3, iM787t1, 1, false));
                    } else {
/* 47 */                c0901f1.m3629j(C0864e1.m3291a(iM787t1, 1, i2, i3, false));
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: f0 */
                public final void mo773f0(int i, int i2) {
/* 1 */             wc0 wc0Var = this.f1582v0;
/* 3 */             wc0Var.m9549y();
/* 10 */            ((SparseIntArray) wc0Var.f18578c).clear();
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager
                /* JADX INFO: renamed from: f1 */
                public final void mo774f1(C0134l c0134l, y12 y12Var, C0124b c0124b, s71 s71Var) {
                    int i;
                    int i2;
                    int i3;
                    int iMo943d;
                    int paddingLeft;
                    int iM969H;
                    int iM969H2;
                    boolean z;
                    int i4;
                    View viewM936b;
/* 13 */            int iMo949j = this.f1588c0.mo949j();
/* 24 */            boolean z2 = iMo949j != 1073741824;
/* 38 */            int i5 = m986G() > 0 ? this.f1578r0[this.f1577q0] : 0;
/* 39 */            if (z2) {
/* 41 */                m796y1();
                    }
/* 50 */            boolean z3 = c0124b.f1732e == 1;
/* 51 */            int iM788u1 = this.f1577q0;
/* 53 */            if (!z3) {
/* 67 */                iM788u1 = m788u1(c0124b.f1731d, y12Var, c0134l) + m790v1(c0124b.f1731d, y12Var, c0134l);
                    }
/* 68 */            int i6 = 0;
/* 71 */            while (i6 < this.f1577q0 && (i4 = c0124b.f1731d) >= 0 && i4 < y12Var.m10082b() && iM788u1 > 0) {
/* 85 */                int i7 = c0124b.f1731d;
/* 87 */                int iM790v1 = m790v1(i7, y12Var, c0134l);
/* 93 */                if (iM790v1 > this.f1577q0) {
/* 119 */                   StringBuilder sb = new StringBuilder("Item at position ");
/* 122 */                   sb.append(i7);
/* 127 */                   sb.append(" requires ");
/* 130 */                   sb.append(iM790v1);
/* 135 */                   sb.append(" spans but GridLayoutManager has only ");
/* 146 */                   C1951n4.m6859j(fm0.m3786l(sb, this.f1577q0, " spans."));
/* 149 */                   return;
                        }
/* 95 */                iM788u1 -= iM790v1;
/* 96 */                if (iM788u1 < 0 || (viewM936b = c0124b.m936b(c0134l)) == null) {
                            break;
                        }
/* 108 */               this.f1579s0[i6] = viewM936b;
/* 110 */               i6++;
                    }
/* 150 */           if (i6 == 0) {
/* 152 */               s71Var.f16459b = true;
/* 154 */               return;
                    }
/* 155 */           if (z3) {
/* 157 */               i3 = 1;
/* 158 */               i2 = i6;
/* 159 */               i = 0;
                    } else {
/* 161 */               i = i6 - 1;
/* 163 */               i2 = -1;
/* 164 */               i3 = -1;
                    }
/* 165 */           int i8 = 0;
/* 166 */           while (i != i2) {
/* 170 */               View view = this.f1579s0[i];
/* 178 */               LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 184 */               int iM790v2 = m790v1(AbstractC0133k.m974O(view), y12Var, c0134l);
/* 188 */               layoutParams.f1585f = iM790v2;
/* 190 */               layoutParams.f1584e = i8;
/* 192 */               i8 += iM790v2;
/* 193 */               i += i3;
                    }
/* 195 */           float f = 0.0f;
/* 197 */           int i9 = 0;
/* 198 */           for (int i10 = 0; i10 < i6; i10++) {
/* 202 */               View view2 = this.f1579s0[i10];
/* 206 */               if (c0124b.f1738k != null) {
/* 223 */                   z = false;
/* 224 */                   if (z3) {
/* 227 */                       m995l(-1, view2, true);
                            } else {
/* 232 */                       m995l(0, view2, true);
                            }
                        } else if (z3) {
/* 211 */                   z = false;
/* 212 */                   m995l(-1, view2, false);
                        } else {
/* 217 */                   z = false;
/* 218 */                   m995l(0, view2, false);
                        }
/* 237 */               m996n(this.f1583w0, view2);
/* 240 */               m792w1(iMo949j, view2, z);
/* 245 */               int iMo942c = this.f1588c0.mo942c(view2);
/* 249 */               if (iMo942c > i9) {
/* 251 */                   i9 = iMo942c;
                        }
/* 271 */               float fMo943d = (this.f1588c0.mo943d(view2) * 1.0f) / ((LayoutParams) view2.getLayoutParams()).f1585f;
/* 274 */               if (fMo943d > f) {
/* 276 */                   f = fMo943d;
                        }
                    }
/* 280 */           if (z2) {
/* 294 */               m784q1(Math.max(Math.round(f * this.f1577q0), i5));
/* 297 */               i9 = 0;
/* 299 */               for (int i11 = 0; i11 < i6; i11++) {
/* 303 */                   View view3 = this.f1579s0[i11];
/* 308 */                   m792w1(1073741824, view3, true);
/* 313 */                   int iMo942c2 = this.f1588c0.mo942c(view3);
/* 317 */                   if (iMo942c2 > i9) {
/* 319 */                       i9 = iMo942c2;
                            }
                        }
                    }
/* 324 */           for (int i12 = 0; i12 < i6; i12++) {
/* 328 */               View view4 = this.f1579s0[i12];
/* 336 */               if (this.f1588c0.mo942c(view4) != i9) {
/* 342 */                   LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
/* 344 */                   Rect rect = layoutParams2.f1682b;
/* 356 */                   int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
/* 367 */                   int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
/* 372 */                   int iM786s1 = m786s1(layoutParams2.f1584e, layoutParams2.f1585f);
/* 379 */                   if (this.f1586a0 == 1) {
/* 386 */                       iM969H2 = AbstractC0133k.m969H(iM786s1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) layoutParams2).width, false);
/* 392 */                       iM969H = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                            } else {
/* 402 */                       int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
/* 408 */                       iM969H = AbstractC0133k.m969H(iM786s1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) layoutParams2).height, false);
/* 412 */                       iM969H2 = iMakeMeasureSpec;
                            }
/* 423 */                   if (m987H0(view4, iM969H2, iM969H, (RecyclerView.LayoutParams) view4.getLayoutParams())) {
/* 425 */                       view4.measure(iM969H2, iM969H);
                            }
                        }
                    }
/* 435 */           int paddingTop = 0;
/* 436 */           s71Var.f16458a = i9;
/* 438 */           int i15 = this.f1586a0;
/* 440 */           int i16 = c0124b.f1733f;
/* 442 */           int iMo943d2 = c0124b.f1729b;
/* 445 */           if (i15 != 1) {
/* 464 */               if (i16 == -1) {
/* 466 */                   paddingLeft = iMo943d2 - i9;
/* 469 */                   iMo943d = iMo943d2;
                        } else {
/* 472 */                   iMo943d = iMo943d2 + i9;
/* 476 */                   paddingLeft = iMo943d2;
                        }
/* 470 */               iMo943d2 = paddingTop;
                    } else if (i16 == -1) {
/* 450 */               paddingTop = iMo943d2 - i9;
/* 453 */               paddingLeft = 0;
/* 454 */               iMo943d = 0;
                    } else {
/* 458 */               iMo943d = 0;
/* 459 */               paddingTop = iMo943d2;
/* 456 */               iMo943d2 += i9;
/* 461 */               paddingLeft = 0;
                    }
/* 478 */           int i17 = 0;
                    while (true) {
/* 479 */               View[] viewArr = this.f1579s0;
/* 481 */               if (i17 >= i6) {
/* 606 */                   Arrays.fill(viewArr, (Object) null);
/* 609 */                   return;
                        }
/* 483 */               View view5 = viewArr[i17];
/* 489 */               LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
/* 494 */               if (this.f1586a0 != 1) {
/* 559 */                   paddingTop = getPaddingTop() + this.f1578r0[layoutParams3.f1584e];
/* 566 */                   iMo943d2 = this.f1588c0.mo943d(view5) + paddingTop;
                        } else if (m823e1()) {
/* 515 */                   int paddingLeft2 = getPaddingLeft() + this.f1578r0[this.f1577q0 - layoutParams3.f1584e];
/* 526 */                   iMo943d = paddingLeft2;
/* 522 */                   paddingLeft = paddingLeft2 - this.f1588c0.mo943d(view5);
                        } else {
/* 540 */                   paddingLeft = getPaddingLeft() + this.f1578r0[layoutParams3.f1584e];
/* 547 */                   iMo943d = this.f1588c0.mo943d(view5) + paddingLeft;
                        }
/* 568 */               AbstractC0133k.m977U(view5, paddingLeft, paddingTop, iMo943d, iMo943d2);
/* 577 */               if (layoutParams3.f1681a.m1024h() || layoutParams3.f1681a.m1027k()) {
/* 591 */                   s71Var.f16460c = true;
                        }
/* 600 */               s71Var.f16461d = view5.hasFocusable() | s71Var.f16461d;
/* 602 */               i17++;
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: g0 */
                public final void mo775g0() {
/* 1 */             wc0 wc0Var = this.f1582v0;
/* 3 */             wc0Var.m9549y();
/* 10 */            ((SparseIntArray) wc0Var.f18578c).clear();
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager
                /* JADX INFO: renamed from: g1 */
                public final void mo776g1(C0134l c0134l, y12 y12Var, C0123a c0123a, int i) {
/* 1 */             m796y1();
/* 8 */             if (y12Var.m10082b() > 0 && !y12Var.f19443g) {
/* 19 */                boolean z = i == 1;
/* 22 */                int iM788u1 = m788u1(c0123a.f1724b, y12Var, c0134l);
/* 26 */                if (z) {
/* 28 */                    while (iM788u1 > 0) {
/* 30 */                        int i2 = c0123a.f1724b;
/* 32 */                        if (i2 <= 0) {
                                    break;
                                }
/* 34 */                        int i3 = i2 - 1;
/* 36 */                        c0123a.f1724b = i3;
/* 38 */                        iM788u1 = m788u1(i3, y12Var, c0134l);
                            }
                        } else {
/* 47 */                    int iM10082b = y12Var.m10082b() - 1;
/* 48 */                    int i4 = c0123a.f1724b;
/* 50 */                    while (i4 < iM10082b) {
/* 52 */                        int i5 = i4 + 1;
/* 54 */                        int iM788u2 = m788u1(i5, y12Var, c0134l);
/* 58 */                        if (iM788u2 <= iM788u1) {
                                    break;
                                }
/* 60 */                        i4 = i5;
/* 61 */                        iM788u1 = iM788u2;
                            }
/* 63 */                    c0123a.f1724b = i4;
                        }
                    }
/* 65 */            m785r1();
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: h0 */
                public final void mo777h0(int i, int i2) {
/* 1 */             wc0 wc0Var = this.f1582v0;
/* 3 */             wc0Var.m9549y();
/* 10 */            ((SparseIntArray) wc0Var.f18578c).clear();
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: i0 */
                public final void mo778i0(int i, int i2) {
/* 1 */             wc0 wc0Var = this.f1582v0;
/* 3 */             wc0Var.m9549y();
/* 10 */            ((SparseIntArray) wc0Var.f18578c).clear();
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: k0 */
                public final void mo779k0(RecyclerView recyclerView, int i, int i2) {
/* 1 */             wc0 wc0Var = this.f1582v0;
/* 3 */             wc0Var.m9549y();
/* 10 */            ((SparseIntArray) wc0Var.f18578c).clear();
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: l0 */
                public final void mo780l0(C0134l c0134l, y12 y12Var) {
/* 1 */             boolean z = y12Var.f19443g;
/* 3 */             SparseIntArray sparseIntArray = this.f1581u0;
/* 5 */             SparseIntArray sparseIntArray2 = this.f1580t0;
/* 7 */             if (z) {
/* 9 */                 int iM986G = m986G();
/* 14 */                for (int i = 0; i < iM986G; i++) {
/* 24 */                    LayoutParams layoutParams = (LayoutParams) m984F(i).getLayoutParams();
/* 28 */                    int iM1018b = layoutParams.f1681a.m1018b();
/* 34 */                    sparseIntArray2.put(iM1018b, layoutParams.f1585f);
/* 39 */                    sparseIntArray.put(iM1018b, layoutParams.f1584e);
                        }
                    }
/* 45 */            super.mo780l0(c0134l, y12Var);
/* 48 */            sparseIntArray2.clear();
/* 51 */            sparseIntArray.clear();
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: m0 */
                public final void mo781m0(y12 y12Var) {
/* 1 */             super.mo781m0(y12Var);
/* 5 */             this.f1576p0 = false;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager
                /* JADX INFO: renamed from: m1 */
                public final void mo782m1(boolean z) {
/* 1 */             if (z) {
/* 10 */                C1951n4.m6866q("GridLayoutManager does not support stack from end. Consider using reverse layout");
                    } else {
/* 4 */                 super.mo782m1(false);
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: q */
                public final boolean mo783q(RecyclerView.LayoutParams layoutParams) {
/* 1 */             return layoutParams instanceof LayoutParams;
                }

                /* JADX INFO: renamed from: q1 */
                public final void m784q1(int i) {
                    int i2;
/* 1 */             int[] iArr = this.f1578r0;
/* 3 */             int i3 = this.f1577q0;
/* 6 */             if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
/* 21 */                iArr = new int[i3 + 1];
                    }
/* 23 */            int i4 = 0;
/* 24 */            iArr[0] = 0;
/* 26 */            int i5 = i / i3;
/* 28 */            int i6 = i % i3;
/* 29 */            int i7 = 0;
/* 30 */            for (int i8 = 1; i8 <= i3; i8++) {
/* 32 */                i4 += i6;
/* 33 */                if (i4 <= 0 || i3 - i4 >= i6) {
/* 43 */                    i2 = i5;
                        } else {
/* 39 */                    i2 = i5 + 1;
/* 41 */                    i4 -= i3;
                        }
/* 44 */                i7 += i2;
/* 45 */                iArr[i8] = i7;
                    }
/* 50 */            this.f1578r0 = iArr;
                }

                /* JADX INFO: renamed from: r1 */
                public final void m785r1() {
/* 1 */             View[] viewArr = this.f1579s0;
/* 3 */             if (viewArr == null || viewArr.length != this.f1577q0) {
/* 16 */                this.f1579s0 = new View[this.f1577q0];
                    }
                }

                /* JADX INFO: renamed from: s1 */
                public final int m786s1(int i, int i2) {
/* 4 */             if (this.f1586a0 != 1 || !m823e1()) {
/* 26 */                int[] iArr = this.f1578r0;
/* 33 */                return iArr[i2 + i] - iArr[i];
                    }
/* 12 */            int[] iArr2 = this.f1578r0;
/* 14 */            int i3 = this.f1577q0;
/* 24 */            return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
                }

                /* JADX INFO: renamed from: t1 */
                public final int m787t1(int i, y12 y12Var, C0134l c0134l) {
/* 1 */             boolean z = y12Var.f19443g;
/* 3 */             wc0 wc0Var = this.f1582v0;
/* 5 */             if (!z) {
/* 7 */                 int i2 = this.f1577q0;
/* 9 */                 wc0Var.getClass();
/* 12 */                return wc0.m9523x(i, i2);
                    }
/* 17 */            int iM1005b = c0134l.m1005b(i);
/* 22 */            if (iM1005b != -1) {
/* 45 */                int i3 = this.f1577q0;
/* 47 */                wc0Var.getClass();
/* 50 */                return wc0.m9523x(iM1005b, i3);
                    }
/* 40 */            AbstractC1245n0.m4889q("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
/* 43 */            return 0;
                }

                /* JADX INFO: renamed from: u1 */
                public final int m788u1(int i, y12 y12Var, C0134l c0134l) {
/* 1 */             boolean z = y12Var.f19443g;
/* 3 */             wc0 wc0Var = this.f1582v0;
/* 5 */             if (!z) {
/* 7 */                 int i2 = this.f1577q0;
/* 9 */                 wc0Var.getClass();
/* 12 */                return i % i2;
                    }
/* 17 */            int i3 = this.f1581u0.get(i, -1);
/* 21 */            if (i3 != -1) {
/* 23 */                return i3;
                    }
/* 24 */            int iM1005b = c0134l.m1005b(i);
/* 28 */            if (iM1005b != -1) {
/* 51 */                int i4 = this.f1577q0;
/* 53 */                wc0Var.getClass();
/* 56 */                return iM1005b % i4;
                    }
/* 46 */            AbstractC1245n0.m4889q("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
/* 49 */            return 0;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: v */
                public final int mo789v(y12 y12Var) {
/* 1 */             return m804O0(y12Var);
                }

                /* JADX INFO: renamed from: v1 */
                public final int m790v1(int i, y12 y12Var, C0134l c0134l) {
/* 1 */             boolean z = y12Var.f19443g;
/* 3 */             wc0 wc0Var = this.f1582v0;
/* 6 */             if (!z) {
/* 8 */                 wc0Var.getClass();
/* 5 */                 return 1;
                    }
/* 15 */            int i2 = this.f1580t0.get(i, -1);
/* 19 */            if (i2 != -1) {
/* 21 */                return i2;
                    }
/* 26 */            if (c0134l.m1005b(i) != -1) {
/* 48 */                wc0Var.getClass();
/* 5 */                 return 1;
                    }
/* 44 */            AbstractC1245n0.m4889q("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
/* 5 */             return 1;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: w */
                public final int mo791w(y12 y12Var) {
/* 1 */             return m805P0(y12Var);
                }

                /* JADX INFO: renamed from: w1 */
                public final void m792w1(int i, View view, boolean z) {
                    int iM969H;
                    int iM969H2;
/* 5 */             LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 7 */             Rect rect = layoutParams.f1682b;
/* 19 */            int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
/* 30 */            int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
/* 35 */            int iM786s1 = m786s1(layoutParams.f1584e, layoutParams.f1585f);
/* 43 */            if (this.f1586a0 == 1) {
/* 47 */                iM969H2 = AbstractC0133k.m969H(iM786s1, i, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
/* 61 */                iM969H = AbstractC0133k.m969H(this.f1588c0.mo951l(), this.f1756X, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
                    } else {
/* 68 */                int iM969H3 = AbstractC0133k.m969H(iM786s1, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
/* 82 */                int iM969H4 = AbstractC0133k.m969H(this.f1588c0.mo951l(), this.f1755W, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
/* 87 */                iM969H = iM969H3;
/* 88 */                iM969H2 = iM969H4;
                    }
/* 93 */            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
/* 106 */           if (z ? m987H0(view, iM969H2, iM969H, layoutParams2) : m985F0(view, iM969H2, iM969H, layoutParams2)) {
/* 108 */               view.measure(iM969H2, iM969H);
                    }
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: x0 */
                public final int mo793x0(int i, y12 y12Var, C0134l c0134l) {
/* 1 */             m796y1();
/* 4 */             m785r1();
/* 7 */             return super.mo793x0(i, y12Var, c0134l);
                }

                /* JADX INFO: renamed from: x1 */
                public final void m794x1(int i) {
/* 3 */             if (i == this.f1577q0) {
/* 5 */                 return;
                    }
/* 7 */             this.f1576p0 = true;
/* 9 */             if (i < 1) {
/* 28 */                C1951n4.m6859j(fm0.m3781g(i, "Span count should be at least 1. Provided "));
/* 31 */                return;
                    }
/* 11 */            this.f1577q0 = i;
/* 15 */            this.f1582v0.m9549y();
/* 18 */            m1003w0();
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: y */
                public final int mo795y(y12 y12Var) {
/* 1 */             return m804O0(y12Var);
                }

                /* JADX INFO: renamed from: y1 */
                public final void m796y1() {
                    int paddingBottom;
                    int paddingTop;
/* 4 */             if (this.f1586a0 == 1) {
/* 12 */                paddingBottom = this.f1757Y - getPaddingRight();
/* 13 */                paddingTop = getPaddingLeft();
                    } else {
/* 25 */                paddingBottom = this.f1758Z - getPaddingBottom();
/* 26 */                paddingTop = getPaddingTop();
                    }
/* 31 */            m784q1(paddingBottom - paddingTop);
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: z */
                public final int mo797z(y12 y12Var) {
/* 1 */             return m805P0(y12Var);
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: z0 */
                public final int mo798z0(int i, y12 y12Var, C0134l c0134l) {
/* 1 */             m796y1();
/* 4 */             m785r1();
/* 7 */             return super.mo798z0(i, y12Var, c0134l);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 9 */         public static class LayoutParams extends RecyclerView.LayoutParams {

                    /* JADX INFO: renamed from: e */
                    public int f1584e;

                    /* JADX INFO: renamed from: f */
                    public int f1585f;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 5 */                 this.f1584e = -1;
/* 8 */                 this.f1585f = 0;
                    }

/* 10 */            public LayoutParams(int i, int i2) {
/* 11 */                super(i, i2);
/* 12 */                this.f1584e = -1;
/* 13 */                this.f1585f = 0;
                    }
                }

/* 49 */        public GridLayoutManager(int i) {
/* 50 */            super(1);
/* 51 */            this.f1576p0 = false;
/* 52 */            this.f1577q0 = -1;
/* 53 */            this.f1580t0 = new SparseIntArray();
/* 54 */            this.f1581u0 = new SparseIntArray();
/* 55 */            this.f1582v0 = new wc0(11);
/* 56 */            this.f1583w0 = new Rect();
/* 57 */            m794x1(i);
                }
            }
