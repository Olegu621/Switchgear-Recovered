            package androidx.recyclerview.widget;

            import android.content.Context;
            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityEvent;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.BitSet;
            import java.util.WeakHashMap;
            import p000.AbstractC0208c9;
            import p000.C1771iw;
            import p000.C1951n4;
            import p000.RunnableC2495ye;
            import p000.b40;
            import p000.e33;
            import p000.gg2;
            import p000.o12;
            import p000.o51;
            import p000.pc0;
            import p000.w12;
            import p000.y12;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class StaggeredGridLayoutManager extends AbstractC0133k implements w12 {

                /* JADX INFO: renamed from: a0 */
                public final int f1686a0;

                /* JADX INFO: renamed from: b0 */
                public final C0141s[] f1687b0;

                /* JADX INFO: renamed from: c0 */
                public final pc0 f1688c0;

                /* JADX INFO: renamed from: d0 */
                public final pc0 f1689d0;

                /* JADX INFO: renamed from: e0 */
                public final int f1690e0;

                /* JADX INFO: renamed from: f0 */
                public int f1691f0;

                /* JADX INFO: renamed from: g0 */
                public final o51 f1692g0;

                /* JADX INFO: renamed from: h0 */
                public boolean f1693h0;

                /* JADX INFO: renamed from: j0 */
                public final BitSet f1695j0;

                /* JADX INFO: renamed from: m0 */
                public final C0139q f1698m0;

                /* JADX INFO: renamed from: n0 */
                public final int f1699n0;

                /* JADX INFO: renamed from: o0 */
                public boolean f1700o0;

                /* JADX INFO: renamed from: p0 */
                public boolean f1701p0;

                /* JADX INFO: renamed from: q0 */
                public SavedState f1702q0;

                /* JADX INFO: renamed from: r0 */
                public final Rect f1703r0;

                /* JADX INFO: renamed from: s0 */
                public final gg2 f1704s0;

                /* JADX INFO: renamed from: t0 */
                public final boolean f1705t0;

                /* JADX INFO: renamed from: u0 */
                public int[] f1706u0;

                /* JADX INFO: renamed from: v0 */
                public final RunnableC2495ye f1707v0;

                /* JADX INFO: renamed from: i0 */
                public boolean f1694i0 = false;

                /* JADX INFO: renamed from: k0 */
                public int f1696k0 = -1;

                /* JADX INFO: renamed from: l0 */
                public int f1697l0 = Integer.MIN_VALUE;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LayoutParams extends RecyclerView.LayoutParams {

                    /* JADX INFO: renamed from: e */
                    public C0141s f1708e;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState implements Parcelable {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0140r();

                    /* JADX INFO: renamed from: U */
                    public boolean f1713U;

                    /* JADX INFO: renamed from: a */
                    public int f1714a;

                    /* JADX INFO: renamed from: b */
                    public int f1715b;

                    /* JADX INFO: renamed from: c */
                    public int f1716c;

                    /* JADX INFO: renamed from: d */
                    public int[] f1717d;

                    /* JADX INFO: renamed from: e */
                    public int f1718e;

                    /* JADX INFO: renamed from: f */
                    public int[] f1719f;

                    /* JADX INFO: renamed from: i */
                    public ArrayList f1720i;

                    /* JADX INFO: renamed from: v */
                    public boolean f1721v;

                    /* JADX INFO: renamed from: w */
                    public boolean f1722w;

                    @Override // android.os.Parcelable
                    public final int describeContents() {
/* 1 */                 return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 3 */                 parcel.writeInt(this.f1714a);
/* 8 */                 parcel.writeInt(this.f1715b);
/* 13 */                parcel.writeInt(this.f1716c);
/* 18 */                if (this.f1716c > 0) {
/* 22 */                    parcel.writeIntArray(this.f1717d);
                        }
/* 27 */                parcel.writeInt(this.f1718e);
/* 32 */                if (this.f1718e > 0) {
/* 36 */                    parcel.writeIntArray(this.f1719f);
                        }
/* 41 */                parcel.writeInt(this.f1721v ? 1 : 0);
/* 46 */                parcel.writeInt(this.f1722w ? 1 : 0);
/* 51 */                parcel.writeInt(this.f1713U ? 1 : 0);
/* 56 */                parcel.writeList(this.f1720i);
                    }
                }

                public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
/* 5 */             this.f1686a0 = -1;
/* 8 */             this.f1693h0 = false;
/* 20 */            C0139q c0139q = new C0139q();
/* 23 */            this.f1698m0 = c0139q;
/* 26 */            this.f1699n0 = 2;
/* 33 */            this.f1703r0 = new Rect();
/* 40 */            this.f1704s0 = new gg2(this);
/* 43 */            this.f1705t0 = true;
/* 52 */            this.f1707v0 = new RunnableC2495ye(this, 23);
/* 54 */            o12 o12VarM975P = AbstractC0133k.m975P(context, attributeSet, i, i2);
/* 58 */            int i3 = o12VarM975P.f14586a;
/* 61 */            if (i3 != 0 && i3 != 1) {
/* 68 */                C1951n4.m6859j("invalid orientation.");
/* 71 */                throw null;
                    }
/* 72 */            mo829m(null);
/* 77 */            if (i3 != this.f1690e0) {
/* 80 */                this.f1690e0 = i3;
/* 82 */                pc0 pc0Var = this.f1688c0;
/* 86 */                this.f1688c0 = this.f1689d0;
/* 88 */                this.f1689d0 = pc0Var;
/* 90 */                m1003w0();
                    }
/* 93 */            int i4 = o12VarM975P.f14587b;
/* 95 */            mo829m(null);
/* 100 */           if (i4 != this.f1686a0) {
/* 102 */               c0139q.m1033a();
/* 105 */               m1003w0();
/* 108 */               this.f1686a0 = i4;
/* 117 */               this.f1695j0 = new BitSet(this.f1686a0);
/* 123 */               this.f1687b0 = new C0141s[this.f1686a0];
/* 128 */               for (int i5 = 0; i5 < this.f1686a0; i5++) {
/* 137 */                   this.f1687b0[i5] = new C0141s(this, i5);
                        }
/* 142 */               m1003w0();
                    }
/* 145 */           boolean z = o12VarM975P.f14588c;
/* 147 */           mo829m(null);
/* 150 */           SavedState savedState = this.f1702q0;
/* 152 */           if (savedState != null && savedState.f1721v != z) {
/* 158 */               savedState.f1721v = z;
                    }
/* 160 */           this.f1693h0 = z;
/* 162 */           m1003w0();
/* 167 */           o51 o51Var = new o51();
/* 170 */           o51Var.f14621a = true;
/* 172 */           o51Var.f14626f = 0;
/* 174 */           o51Var.f14627g = 0;
/* 176 */           this.f1692g0 = o51Var;
/* 184 */           this.f1688c0 = pc0.m7383a(this, this.f1690e0);
/* 193 */           this.f1689d0 = pc0.m7383a(this, 1 - this.f1690e0);
                }

                /* JADX INFO: renamed from: l1 */
                public static int m901l1(int i, int i2, int i3) {
                    int mode;
                    return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: C */
                public final RecyclerView.LayoutParams mo762C() {
                    return this.f1690e0 == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: C0 */
                public final void mo763C0(Rect rect, int i, int i2) {
                    int iM978r;
                    int iM978r2;
/* 9 */             int paddingRight = getPaddingRight() + getPaddingLeft();
/* 18 */            int paddingBottom = getPaddingBottom() + getPaddingTop();
/* 19 */            int i3 = this.f1690e0;
/* 22 */            int i4 = this.f1686a0;
/* 24 */            if (i3 == 1) {
/* 30 */                int iHeight = rect.height() + paddingBottom;
/* 31 */                RecyclerView recyclerView = this.f1760b;
/* 33 */                WeakHashMap weakHashMap = e33.f7494a;
/* 39 */                iM978r2 = AbstractC0133k.m978r(i2, iHeight, recyclerView.getMinimumHeight());
/* 53 */                iM978r = AbstractC0133k.m978r(i, (this.f1691f0 * i4) + paddingRight, this.f1760b.getMinimumWidth());
                    } else {
/* 62 */                int iWidth = rect.width() + paddingRight;
/* 63 */                RecyclerView recyclerView2 = this.f1760b;
/* 65 */                WeakHashMap weakHashMap2 = e33.f7494a;
/* 71 */                iM978r = AbstractC0133k.m978r(i, iWidth, recyclerView2.getMinimumWidth());
/* 85 */                iM978r2 = AbstractC0133k.m978r(i2, (this.f1691f0 * i4) + paddingBottom, this.f1760b.getMinimumHeight());
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
                    return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: I0 */
                public final void mo801I0(RecyclerView recyclerView, int i) {
/* 7 */             C0126d c0126d = new C0126d(recyclerView.getContext());
/* 10 */            c0126d.f18902a = i;
/* 12 */            m988J0(c0126d);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: K0 */
                public final boolean mo767K0() {
                    return this.f1702q0 == null;
                }

                /* JADX INFO: renamed from: L0 */
                public final boolean m902L0() {
                    int iM909S0;
/* 6 */             if (m986G() != 0 && this.f1699n0 != 0 && this.f1765i) {
/* 19 */                if (this.f1694i0) {
/* 21 */                    iM909S0 = m910T0();
/* 25 */                    m909S0();
                        } else {
/* 29 */                    iM909S0 = m909S0();
/* 33 */                    m910T0();
                        }
/* 36 */                if (iM909S0 == 0 && m917X0() != null) {
/* 46 */                    this.f1698m0.m1033a();
/* 50 */                    this.f1764f = true;
/* 52 */                    m1003w0();
/* 49 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                /* JADX INFO: renamed from: M0 */
                public final int m903M0(y12 y12Var) {
/* 5 */             if (m986G() == 0) {
/* 7 */                 return 0;
                    }
/* 11 */            boolean z = !this.f1705t0;
/* 29 */            return b40.m1223g(y12Var, this.f1688c0, m906P0(z), m905O0(z), this, this.f1705t0, this.f1694i0);
                }

                /* JADX WARN: Type inference failed for: r5v14 */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
                /* JADX INFO: renamed from: N0 */
                public final int m904N0(C0134l c0134l, o51 o51Var, y12 y12Var) {
                    int i;
                    C0141s[] c0141sArr;
                    int iM911U0;
                    BitSet bitSet;
                    C0141s[] c0141sArr2;
                    C0141s c0141s;
                    ?? r5;
                    int iM1044h;
                    int iMo942c;
                    int iMo942c2;
                    int iMo946g;
                    BitSet bitSet2;
                    int i2;
                    int i3;
/* 3 */             C0134l c0134l2 = c0134l;
/* 7 */             BitSet bitSet3 = this.f1695j0;
/* 10 */            int i4 = this.f1686a0;
/* 13 */            bitSet3.set(0, i4, true);
/* 16 */            o51 o51Var2 = this.f1692g0;
/* 20 */            if (o51Var2.f14629i) {
/* 30 */                i = o51Var.f14625e == 1 ? AbstractC0208c9.API_PRIORITY_OTHER : Integer.MIN_VALUE;
                    } else {
/* 47 */                i = o51Var.f14625e == 1 ? o51Var.f14627g + o51Var.f14622b : o51Var.f14626f - o51Var.f14622b;
                    }
/* 48 */            int i5 = o51Var.f14625e;
/* 50 */            int i6 = 0;
                    while (true) {
/* 51 */                c0141sArr = this.f1687b0;
/* 53 */                if (i6 >= i4) {
                            break;
                        }
/* 63 */                if (!c0141sArr[i6].f1799a.isEmpty()) {
/* 68 */                    m930k1(c0141sArr[i6], i5, i);
                        }
/* 71 */                i6++;
                    }
/* 74 */            boolean z = this.f1694i0;
/* 76 */            pc0 pc0Var = this.f1688c0;
/* 85 */            int iMo946g2 = z ? pc0Var.mo946g() : pc0Var.mo950k();
/* 89 */            boolean z2 = false;
                    while (true) {
/* 90 */                int i7 = o51Var.f14623c;
/* 92 */                if (i7 < 0 || i7 >= y12Var.m10082b() || (!o51Var2.f14629i && bitSet3.isEmpty())) {
                            break;
                        }
/* 121 */               View view = c0134l2.m1012i(o51Var.f14623c, Long.MAX_VALUE).f1778a;
/* 128 */               o51Var.f14623c += o51Var.f14624d;
/* 134 */               LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 138 */               int iM1018b = layoutParams.f1681a.m1018b();
/* 142 */               C0139q c0139q = this.f1698m0;
/* 144 */               int[] iArr = c0139q.f1797a;
/* 156 */               int i8 = (iArr == null || iM1018b >= iArr.length) ? -1 : iArr[iM1018b];
/* 158 */               if (i8 == -1) {
/* 166 */                   if (m921b1(o51Var.f14625e)) {
/* 168 */                       i3 = i4 - 1;
/* 174 */                       i4 = -1;
/* 175 */                       i2 = -1;
                            } else {
/* 179 */                       i2 = 1;
/* 180 */                       i3 = 0;
                            }
/* 184 */                   C0141s c0141s2 = null;
/* 186 */                   int i9 = i2;
/* 189 */                   if (o51Var.f14625e == 1) {
/* 191 */                       int iMo950k = pc0Var.mo950k();
/* 195 */                       c0141sArr2 = c0141sArr;
/* 197 */                       int i10 = i3;
/* 199 */                       int i11 = AbstractC0208c9.API_PRIORITY_OTHER;
/* 202 */                       while (i10 != i4) {
/* 204 */                           int i12 = i10;
/* 206 */                           C0141s c0141s3 = c0141sArr2[i12];
/* 208 */                           BitSet bitSet4 = bitSet3;
/* 210 */                           int iM1042f = c0141s3.m1042f(iMo950k);
/* 214 */                           if (iM1042f < i11) {
/* 216 */                               i11 = iM1042f;
/* 217 */                               c0141s2 = c0141s3;
                                    }
/* 219 */                           i10 = i12 + i9;
/* 221 */                           bitSet3 = bitSet4;
                                }
/* 224 */                       bitSet = bitSet3;
                            } else {
/* 229 */                       bitSet = bitSet3;
/* 231 */                       c0141sArr2 = c0141sArr;
/* 233 */                       int iMo946g3 = pc0Var.mo946g();
/* 237 */                       int i13 = i3;
/* 239 */                       int i14 = Integer.MIN_VALUE;
/* 241 */                       while (i13 != i4) {
/* 243 */                           C0141s c0141s4 = c0141sArr2[i13];
/* 245 */                           int i15 = i4;
/* 247 */                           int iM1044h2 = c0141s4.m1044h(iMo946g3);
/* 251 */                           if (iM1044h2 > i14) {
/* 253 */                               i14 = iM1044h2;
/* 254 */                               c0141s2 = c0141s4;
                                    }
/* 256 */                           i13 += i9;
/* 258 */                           i4 = i15;
                                }
                            }
/* 226 */                   c0141s = c0141s2;
/* 261 */                   c0139q.m1034b(iM1018b);
/* 268 */                   c0139q.f1797a[iM1018b] = c0141s.f1803e;
                        } else {
/* 271 */                   bitSet = bitSet3;
/* 273 */                   i4 = i4;
/* 275 */                   c0141sArr2 = c0141sArr;
/* 277 */                   c0141s = c0141sArr2[i8];
                        }
/* 279 */               layoutParams.f1708e = c0141s;
/* 284 */               if (o51Var.f14625e == 1) {
/* 287 */                   r5 = 0;
/* 288 */                   m995l(-1, view, false);
                        } else {
/* 292 */                   r5 = 0;
/* 293 */                   m995l(0, view, false);
                        }
/* 296 */               int i16 = this.f1690e0;
/* 298 */               if (i16 == 1) {
/* 330 */                   m919Z0(view, AbstractC0133k.m969H(this.f1691f0, this.f1755W, r5, ((ViewGroup.MarginLayoutParams) layoutParams).width, r5), AbstractC0133k.m969H(this.f1758Z, this.f1756X, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true));
                        } else {
/* 364 */                   m919Z0(view, AbstractC0133k.m969H(this.f1757Y, this.f1755W, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), AbstractC0133k.m969H(this.f1691f0, this.f1756X, 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false));
                        }
/* 369 */               if (o51Var.f14625e == 1) {
/* 371 */                   iMo942c = c0141s.m1042f(iMo946g2);
/* 379 */                   iM1044h = pc0Var.mo942c(view) + iMo942c;
                        } else {
/* 381 */                   iM1044h = c0141s.m1044h(iMo946g2);
/* 389 */                   iMo942c = iM1044h - pc0Var.mo942c(view);
                        }
/* 391 */               int i17 = o51Var.f14625e;
/* 393 */               C0141s c0141s5 = layoutParams.f1708e;
/* 395 */               if (i17 == 1) {
/* 397 */                   c0141s5.getClass();
/* 404 */                   LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
/* 406 */                   layoutParams2.f1708e = c0141s5;
/* 408 */                   ArrayList arrayList = c0141s5.f1799a;
/* 410 */                   arrayList.add(view);
/* 415 */                   c0141s5.f1801c = Integer.MIN_VALUE;
/* 421 */                   if (arrayList.size() == 1) {
/* 423 */                       c0141s5.f1800b = Integer.MIN_VALUE;
                            }
/* 431 */                   if (layoutParams2.f1681a.m1024h() || layoutParams2.f1681a.m1027k()) {
/* 452 */                       c0141s5.f1802d = c0141s5.f1804f.f1688c0.mo942c(view) + c0141s5.f1802d;
                            }
                        } else {
/* 457 */                   c0141s5.getClass();
/* 464 */                   LayoutParams layoutParams3 = (LayoutParams) view.getLayoutParams();
/* 466 */                   layoutParams3.f1708e = c0141s5;
/* 468 */                   ArrayList arrayList2 = c0141s5.f1799a;
/* 471 */                   arrayList2.add(0, view);
/* 476 */                   c0141s5.f1800b = Integer.MIN_VALUE;
/* 483 */                   if (arrayList2.size() == 1) {
/* 485 */                       c0141s5.f1801c = Integer.MIN_VALUE;
                            }
/* 493 */                   if (layoutParams3.f1681a.m1024h() || layoutParams3.f1681a.m1027k()) {
/* 514 */                       c0141s5.f1802d = c0141s5.f1804f.f1688c0.mo942c(view) + c0141s5.f1802d;
                            }
                        }
/* 516 */               boolean zM918Y0 = m918Y0();
/* 520 */               pc0 pc0Var2 = this.f1689d0;
/* 522 */               if (zM918Y0 && i16 == 1) {
/* 539 */                   iMo946g = pc0Var2.mo946g() - (((i4 - 1) - c0141s.f1803e) * this.f1691f0);
/* 544 */                   iMo942c2 = iMo946g - pc0Var2.mo942c(view);
                        } else {
/* 557 */                   int iMo950k2 = (c0141s.f1803e * this.f1691f0) + pc0Var2.mo950k();
/* 562 */                   int iMo942c3 = pc0Var2.mo942c(view) + iMo950k2;
/* 564 */                   iMo942c2 = iMo950k2;
/* 565 */                   iMo946g = iMo942c3;
                        }
/* 546 */               z2 = true;
/* 567 */               if (i16 == 1) {
/* 569 */                   AbstractC0133k.m977U(view, iMo942c2, iMo942c, iMo946g, iM1044h);
                        } else {
/* 573 */                   AbstractC0133k.m977U(view, iMo942c, iMo942c2, iM1044h, iMo946g);
                        }
/* 578 */               m930k1(c0141s, o51Var2.f14625e, i);
/* 581 */               c0134l2 = c0134l;
/* 583 */               m923d1(c0134l2, o51Var2);
/* 588 */               if (o51Var2.f14628h && view.hasFocusable()) {
/* 598 */                   bitSet2 = bitSet;
/* 601 */                   bitSet2.set(c0141s.f1803e, false);
                        } else {
/* 605 */                   bitSet2 = bitSet;
                        }
/* 607 */               bitSet3 = bitSet2;
/* 609 */               i4 = i4;
/* 611 */               c0141sArr = c0141sArr2;
                    }
/* 616 */           if (!z2) {
/* 618 */               m923d1(c0134l2, o51Var2);
                    }
/* 624 */           if (o51Var2.f14625e == -1) {
/* 638 */               iM911U0 = pc0Var.mo950k() - m913V0(pc0Var.mo950k());
                    } else {
/* 652 */               iM911U0 = m911U0(pc0Var.mo946g()) - pc0Var.mo946g();
                    }
/* 654 */           if (iM911U0 > 0) {
/* 658 */               return Math.min(o51Var.f14622b, iM911U0);
                    }
/* 663 */           return 0;
                }

                /* JADX INFO: renamed from: O0 */
                public final View m905O0(boolean z) {
/* 1 */             pc0 pc0Var = this.f1688c0;
/* 3 */             int iMo950k = pc0Var.mo950k();
/* 7 */             int iMo946g = pc0Var.mo946g();
/* 17 */            View view = null;
/* 18 */            for (int iM986G = m986G() - 1; iM986G >= 0; iM986G--) {
/* 20 */                View viewM984F = m984F(iM986G);
/* 24 */                int iMo944e = pc0Var.mo944e(viewM984F);
/* 28 */                int iMo941b = pc0Var.mo941b(viewM984F);
/* 32 */                if (iMo941b > iMo950k && iMo944e < iMo946g) {
/* 37 */                    if (iMo941b <= iMo946g || !z) {
/* 46 */                        return viewM984F;
                            }
/* 42 */                    if (view == null) {
/* 44 */                        view = viewM984F;
                            }
                        }
                    }
/* 50 */            return view;
                }

                /* JADX INFO: renamed from: P0 */
                public final View m906P0(boolean z) {
/* 1 */             pc0 pc0Var = this.f1688c0;
/* 3 */             int iMo950k = pc0Var.mo950k();
/* 7 */             int iMo946g = pc0Var.mo946g();
/* 11 */            int iM986G = m986G();
/* 15 */            View view = null;
/* 17 */            for (int i = 0; i < iM986G; i++) {
/* 19 */                View viewM984F = m984F(i);
/* 23 */                int iMo944e = pc0Var.mo944e(viewM984F);
/* 31 */                if (pc0Var.mo941b(viewM984F) > iMo950k && iMo944e < iMo946g) {
/* 36 */                    if (iMo944e >= iMo950k || !z) {
/* 45 */                        return viewM984F;
                            }
/* 41 */                    if (view == null) {
/* 43 */                        view = viewM984F;
                            }
                        }
                    }
/* 49 */            return view;
                }

                /* JADX INFO: renamed from: Q0 */
                public final void m907Q0(C0134l c0134l, y12 y12Var, boolean z) {
                    int iMo946g;
/* 3 */             int iM911U0 = m911U0(Integer.MIN_VALUE);
/* 7 */             if (iM911U0 != Integer.MIN_VALUE && (iMo946g = this.f1688c0.mo946g() - iM911U0) > 0) {
/* 25 */                int i = iMo946g - (-m927h1(-iMo946g, y12Var, c0134l));
/* 26 */                if (!z || i <= 0) {
/* 35 */                    return;
                        }
/* 32 */                this.f1688c0.mo954p(i);
                    }
                }

                /* JADX INFO: renamed from: R0 */
                public final void m908R0(C0134l c0134l, y12 y12Var, boolean z) {
                    int iMo950k;
/* 4 */             int iM913V0 = m913V0(AbstractC0208c9.API_PRIORITY_OTHER);
/* 8 */             if (iM913V0 != Integer.MAX_VALUE && (iMo950k = iM913V0 - this.f1688c0.mo950k()) > 0) {
/* 24 */                int iM927h1 = iMo950k - m927h1(iMo950k, y12Var, c0134l);
/* 25 */                if (!z || iM927h1 <= 0) {
/* 35 */                    return;
                        }
/* 32 */                this.f1688c0.mo954p(-iM927h1);
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: S */
                public final boolean mo808S() {
                    return this.f1699n0 != 0;
                }

                /* JADX INFO: renamed from: S0 */
                public final int m909S0() {
/* 6 */             if (m986G() == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            return AbstractC0133k.m974O(m984F(0));
                }

                /* JADX INFO: renamed from: T0 */
                public final int m910T0() {
/* 1 */             int iM986G = m986G();
/* 5 */             if (iM986G == 0) {
/* 7 */                 return 0;
                    }
/* 15 */            return AbstractC0133k.m974O(m984F(iM986G - 1));
                }

                /* JADX INFO: renamed from: U0 */
                public final int m911U0(int i) {
/* 6 */             int iM1042f = this.f1687b0[0].m1042f(i);
/* 13 */            for (int i2 = 1; i2 < this.f1686a0; i2++) {
/* 19 */                int iM1042f2 = this.f1687b0[i2].m1042f(i);
/* 23 */                if (iM1042f2 > iM1042f) {
/* 25 */                    iM1042f = iM1042f2;
                        }
                    }
/* 29 */            return iM1042f;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: V */
                public final void mo912V(int i) {
/* 1 */             super.mo912V(i);
/* 7 */             for (int i2 = 0; i2 < this.f1686a0; i2++) {
/* 11 */                C0141s c0141s = this.f1687b0[i2];
/* 13 */                int i3 = c0141s.f1800b;
/* 17 */                if (i3 != Integer.MIN_VALUE) {
/* 20 */                    c0141s.f1800b = i3 + i;
                        }
/* 22 */                int i4 = c0141s.f1801c;
/* 24 */                if (i4 != Integer.MIN_VALUE) {
/* 27 */                    c0141s.f1801c = i4 + i;
                        }
                    }
                }

                /* JADX INFO: renamed from: V0 */
                public final int m913V0(int i) {
/* 6 */             int iM1044h = this.f1687b0[0].m1044h(i);
/* 13 */            for (int i2 = 1; i2 < this.f1686a0; i2++) {
/* 19 */                int iM1044h2 = this.f1687b0[i2].m1044h(i);
/* 23 */                if (iM1044h2 < iM1044h) {
/* 25 */                    iM1044h = iM1044h2;
                        }
                    }
/* 29 */            return iM1044h;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: W */
                public final void mo914W(int i) {
/* 1 */             super.mo914W(i);
/* 7 */             for (int i2 = 0; i2 < this.f1686a0; i2++) {
/* 11 */                C0141s c0141s = this.f1687b0[i2];
/* 13 */                int i3 = c0141s.f1800b;
/* 17 */                if (i3 != Integer.MIN_VALUE) {
/* 20 */                    c0141s.f1800b = i3 + i;
                        }
/* 22 */                int i4 = c0141s.f1801c;
/* 24 */                if (i4 != Integer.MIN_VALUE) {
/* 27 */                    c0141s.f1801c = i4 + i;
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0031  */
                /* JADX WARN: Code duplicated, block: B:22:0x0033 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:24:0x0036  */
                /* JADX WARN: Code duplicated, block: B:26:0x003d  */
                /* JADX WARN: Code duplicated, block: B:29:0x004a A[LOOP:0: B:25:0x003b->B:29:0x004a, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:31:0x004e BREAK  A[LOOP:0: B:25:0x003b->B:29:0x004a]] */
                /* JADX WARN: Code duplicated, block: B:32:0x0050  */
                /* JADX WARN: Code duplicated, block: B:35:0x005e  */
                /* JADX WARN: Code duplicated, block: B:38:0x006b A[LOOP:1: B:34:0x005c->B:38:0x006b, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:41:0x0071  */
                /* JADX WARN: Code duplicated, block: B:44:0x0084  */
                /* JADX WARN: Code duplicated, block: B:45:0x008c  */
                /* JADX WARN: Code duplicated, block: B:47:0x0099  */
                /* JADX WARN: Code duplicated, block: B:49:0x009c A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:51:0x009f  */
                /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
                /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
                /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
                /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
                /* JADX WARN: Code duplicated, block: B:59:0x00b9  */
                /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
                /* JADX WARN: Code duplicated, block: B:63:0x004d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:64:0x004e A[EDGE_INSN: B:64:0x004e->B:31:0x004e BREAK  A[LOOP:0: B:25:0x003b->B:29:0x004a], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:65:0x006e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:66:0x006f A[EDGE_INSN: B:66:0x006f->B:40:0x006f BREAK  A[LOOP:1: B:34:0x005c->B:38:0x006b], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
                /* JADX INFO: renamed from: W0 */
                public final void m915W0(int i, int i2, int i3) {
                    int i4;
                    int i5;
                    C0139q c0139q;
                    int[] iArr;
                    int iM910T0;
                    ArrayList arrayList;
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
                    int size;
                    int i6;
                    int i7;
                    int size2;
                    int[] iArr2;
/* 10 */            int iM910T1 = this.f1694i0 ? m910T0() : m909S0();
/* 16 */            if (i3 == 8) {
/* 18 */                if (i < i2) {
/* 20 */                    i4 = i2 + 1;
                        } else {
/* 24 */                    i4 = i + 1;
/* 26 */                    i5 = i2;
                        }
/* 31 */                c0139q = this.f1698m0;
/* 33 */                iArr = c0139q.f1797a;
/* 36 */                if (iArr != null && i5 < iArr.length) {
/* 45 */                    arrayList = c0139q.f1798b;
/* 48 */                    if (arrayList != null) {
/* 52 */                        if (arrayList == null) {
/* 59 */                            size2 = arrayList.size() - 1;
                                    while (true) {
/* 60 */                                if (size2 >= 0) {
/* 78 */                                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                                            break;
                                        }
/* 68 */                                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) c0139q.f1798b.get(size2);
/* 72 */                                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1709a == i5) {
                                            break;
                                        } else {
/* 75 */                                    size2--;
                                        }
                                    }
                                } else {
/* 78 */                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                                    break;
                                }
/* 79 */                        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
/* 83 */                            c0139q.f1798b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                                }
/* 88 */                        size = c0139q.f1798b.size();
/* 92 */                        i6 = 0;
                                while (true) {
/* 93 */                            if (i6 < size) {
/* 111 */                               i6 = -1;
                                        break;
                                    } else if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) c0139q.f1798b.get(i6)).f1709a >= i5) {
                                        break;
                                    } else {
/* 108 */                               i6++;
                                    }
                                }
/* 112 */                       if (i6 != -1) {
/* 120 */                           StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) c0139q.f1798b.get(i6);
/* 124 */                           c0139q.f1798b.remove(i6);
/* 127 */                           i7 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f1709a;
                                } else {
/* 50 */                            i7 = -1;
                                }
                            } else {
/* 50 */                        i7 = -1;
                            }
/* 129 */                   iArr2 = c0139q.f1797a;
/* 131 */                   if (i7 == -1) {
/* 134 */                       Arrays.fill(iArr2, i5, iArr2.length, -1);
/* 139 */                       int length = c0139q.f1797a.length;
                            } else {
/* 149 */                       Arrays.fill(c0139q.f1797a, i5, Math.min(i7 + 1, iArr2.length), -1);
                            }
                        }
/* 152 */               if (i3 != 1) {
/* 171 */                   c0139q.m1035c(i, i2);
                        } else if (i3 != 2) {
/* 167 */                   c0139q.m1036d(i, i2);
                        } else if (i3 == 8) {
/* 160 */                   c0139q.m1036d(i, 1);
/* 163 */                   c0139q.m1035c(i2, 1);
                        }
/* 174 */               if (i4 <= iM910T1) {
/* 195 */                   return;
                        }
/* 179 */               if (this.f1694i0) {
/* 181 */                   iM910T0 = m909S0();
                        } else {
/* 186 */                   iM910T0 = m910T0();
                        }
/* 190 */               if (i5 <= iM910T0) {
/* 192 */                   m1003w0();
                        }
                    }
/* 28 */            i4 = i + i2;
/* 22 */            i5 = i;
/* 31 */            c0139q = this.f1698m0;
/* 33 */            iArr = c0139q.f1797a;
/* 36 */            if (iArr != null) {
/* 45 */                arrayList = c0139q.f1798b;
/* 48 */                if (arrayList != null) {
/* 52 */                    if (arrayList == null) {
/* 59 */                        size2 = arrayList.size() - 1;
                                while (true) {
/* 60 */                            if (size2 >= 0) {
/* 78 */                                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                                        break;
                                    }
/* 68 */                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) c0139q.f1798b.get(size2);
/* 72 */                            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1709a == i5) {
                                        break;
                                        break;
                                    }
/* 75 */                            size2--;
                                }
                            } else {
/* 78 */                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                                break;
                            }
/* 79 */                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
/* 83 */                        c0139q.f1798b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                            }
/* 88 */                    size = c0139q.f1798b.size();
/* 92 */                    i6 = 0;
                            while (true) {
/* 93 */                        if (i6 < size) {
/* 111 */                           i6 = -1;
                                    break;
                                } else {
/* 105 */                           if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) c0139q.f1798b.get(i6)).f1709a >= i5) {
                                        break;
                                        break;
                                    }
/* 108 */                           i6++;
                                }
                            }
/* 112 */                   if (i6 != -1) {
/* 120 */                       StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) c0139q.f1798b.get(i6);
/* 124 */                       c0139q.f1798b.remove(i6);
/* 127 */                       i7 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3.f1709a;
                            } else {
/* 50 */                        i7 = -1;
                            }
                        } else {
/* 50 */                    i7 = -1;
                        }
/* 129 */               iArr2 = c0139q.f1797a;
/* 131 */               if (i7 == -1) {
/* 134 */                   Arrays.fill(iArr2, i5, iArr2.length, -1);
/* 139 */                   int length2 = c0139q.f1797a.length;
                        } else {
/* 149 */                   Arrays.fill(c0139q.f1797a, i5, Math.min(i7 + 1, iArr2.length), -1);
                        }
                    }
/* 152 */           if (i3 != 1) {
/* 171 */               c0139q.m1035c(i, i2);
                    } else if (i3 != 2) {
/* 167 */               c0139q.m1036d(i, i2);
                    } else if (i3 == 8) {
/* 160 */               c0139q.m1036d(i, 1);
/* 163 */               c0139q.m1035c(i2, 1);
                    }
/* 174 */           if (i4 <= iM910T1) {
/* 195 */               return;
                    }
/* 179 */           if (this.f1694i0) {
/* 181 */               iM910T0 = m909S0();
                    } else {
/* 186 */               iM910T0 = m910T0();
                    }
/* 190 */           if (i5 <= iM910T0) {
/* 192 */               m1003w0();
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: X */
                public final void mo916X() {
/* 3 */             this.f1698m0.m1033a();
/* 9 */             for (int i = 0; i < this.f1686a0; i++) {
/* 15 */                this.f1687b0[i].m1038b();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
                /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
                /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
                /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
                /* JADX WARN: Code duplicated, block: B:68:0x00f1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:74:0x002a A[SYNTHETIC] */
                /* JADX INFO: renamed from: X0 */
                public final View m917X0() {
                    boolean z;
                    boolean z2;
/* 1 */             int iM986G = m986G();
/* 5 */             int i = iM986G - 1;
/* 9 */             int i2 = this.f1686a0;
/* 11 */            BitSet bitSet = new BitSet(i2);
/* 16 */            bitSet.set(0, i2, true);
/* 32 */            byte b = (this.f1690e0 == 1 && m918Y0()) ? (byte) 1 : (byte) -1;
/* 35 */            if (this.f1694i0) {
/* 37 */                iM986G = -1;
                    } else {
/* 39 */                i = 0;
                    }
/* 40 */            int i3 = i < iM986G ? 1 : -1;
/* 43 */            while (i != iM986G) {
/* 45 */                View viewM984F = m984F(i);
/* 53 */                LayoutParams layoutParams = (LayoutParams) viewM984F.getLayoutParams();
/* 59 */                boolean z3 = bitSet.get(layoutParams.f1708e.f1803e);
/* 63 */                pc0 pc0Var = this.f1688c0;
/* 65 */                if (z3) {
/* 67 */                    C0141s c0141s = layoutParams.f1708e;
/* 73 */                    if (this.f1694i0) {
/* 75 */                        int i4 = c0141s.f1801c;
/* 77 */                        if (i4 == Integer.MIN_VALUE) {
/* 80 */                            c0141s.m1037a();
/* 83 */                            i4 = c0141s.f1801c;
                                }
/* 89 */                        if (i4 < pc0Var.mo946g()) {
/* 91 */                            ArrayList arrayList = c0141s.f1799a;
/* 110 */                           ((LayoutParams) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
/* 113 */                           return viewM984F;
                                }
                            } else {
/* 114 */                       int i5 = c0141s.f1800b;
/* 116 */                       ArrayList arrayList2 = c0141s.f1799a;
/* 118 */                       if (i5 == Integer.MIN_VALUE) {
/* 125 */                           View view = (View) arrayList2.get(0);
/* 131 */                           LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
/* 141 */                           c0141s.f1800b = c0141s.f1804f.f1688c0.mo944e(view);
/* 143 */                           layoutParams2.getClass();
/* 146 */                           i5 = c0141s.f1800b;
                                }
/* 152 */                       if (i5 > pc0Var.mo950k()) {
/* 166 */                           ((LayoutParams) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
/* 169 */                           return viewM984F;
                                }
                            }
/* 174 */                   bitSet.clear(layoutParams.f1708e.f1803e);
                        }
/* 177 */               i += i3;
/* 178 */               if (i != iM986G) {
/* 180 */                   View viewM984F2 = m984F(i);
/* 186 */                   if (this.f1694i0) {
/* 188 */                       int iMo941b = pc0Var.mo941b(viewM984F);
/* 192 */                       int iMo941b2 = pc0Var.mo941b(viewM984F2);
/* 196 */                       if (iMo941b >= iMo941b2) {
/* 199 */                           if (iMo941b == iMo941b2) {
/* 230 */                               if (layoutParams.f1708e.f1803e - ((LayoutParams) viewM984F2.getLayoutParams()).f1708e.f1803e < 0) {
/* 232 */                                   z = true;
                                        } else {
/* 234 */                                   z = false;
                                        }
/* 235 */                               if (b < 0) {
/* 237 */                                   z2 = true;
                                        } else {
/* 239 */                                   z2 = false;
                                        }
/* 240 */                               if (z != z2) {
                                        }
                                    } else {
                                        continue;
                                    }
                                }
/* 242 */                       return viewM984F;
                            }
/* 202 */                   int iMo944e = pc0Var.mo944e(viewM984F);
/* 206 */                   int iMo944e2 = pc0Var.mo944e(viewM984F2);
/* 210 */                   if (iMo944e <= iMo944e2) {
/* 213 */                       if (iMo944e == iMo944e2) {
/* 230 */                           if (layoutParams.f1708e.f1803e - ((LayoutParams) viewM984F2.getLayoutParams()).f1708e.f1803e < 0) {
/* 232 */                               z = true;
                                    } else {
/* 234 */                               z = false;
                                    }
/* 235 */                           if (b < 0) {
/* 237 */                               z2 = true;
                                    } else {
/* 239 */                               z2 = false;
                                    }
/* 240 */                           if (z != z2) {
                                    }
                                } else {
                                    continue;
                                }
                            }
/* 242 */                   return viewM984F;
                        }
                    }
/* 243 */           return null;
                }

                /* JADX INFO: renamed from: Y0 */
                public final boolean m918Y0() {
                    return m989N() == 1;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: Z */
                public final void mo816Z(RecyclerView recyclerView) {
/* 1 */             RecyclerView recyclerView2 = this.f1760b;
/* 3 */             if (recyclerView2 != null) {
/* 7 */                 recyclerView2.removeCallbacks(this.f1707v0);
                    }
/* 13 */            for (int i = 0; i < this.f1686a0; i++) {
/* 19 */                this.f1687b0[i].m1038b();
                    }
/* 25 */            recyclerView.requestLayout();
                }

                /* JADX INFO: renamed from: Z0 */
                public final void m919Z0(View view, int i, int i2) {
/* 1 */             Rect rect = this.f1703r0;
/* 3 */             m996n(rect, view);
/* 10 */            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 22 */            int iM901l1 = m901l1(i, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
/* 36 */            int iM901l2 = m901l1(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
/* 44 */            if (m985F0(view, iM901l1, iM901l2, layoutParams)) {
/* 46 */                view.measure(iM901l1, iM901l2);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:6:0x000c  */
                @Override // p000.w12
                /* JADX INFO: renamed from: a */
                public final PointF mo817a(int i) {
/* 5 */             int i2 = -1;
/* 7 */             if (m986G() != 0) {
/* 26 */                if ((i < m909S0()) == this.f1694i0) {
/* 13 */                    i2 = 1;
                        }
                    } else if (this.f1694i0) {
/* 13 */                i2 = 1;
                    }
/* 30 */            PointF pointF = new PointF();
/* 33 */            if (i2 == 0) {
/* 35 */                return null;
                    }
/* 40 */            if (this.f1690e0 == 0) {
/* 43 */                pointF.x = i2;
/* 45 */                pointF.y = 0.0f;
/* 47 */                return pointF;
                    }
/* 48 */            pointF.x = 0.0f;
/* 51 */            pointF.y = i2;
/* 53 */            return pointF;
                }

                /* JADX WARN: Code duplicated, block: B:30:0x0048  */
                /* JADX WARN: Code duplicated, block: B:34:0x004f  */
                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: a0 */
                public final View mo771a0(View view, int i, C0134l c0134l, y12 y12Var) {
                    View viewM851B;
                    int i2;
/* 6 */             if (m986G() != 0) {
/* 10 */                RecyclerView recyclerView = this.f1760b;
/* 12 */                if (recyclerView == null || (viewM851B = recyclerView.m851B(view)) == null || ((ArrayList) this.f1759a.f7615d).contains(viewM851B)) {
/* 34 */                    viewM851B = null;
                        }
/* 35 */                if (viewM851B != null) {
/* 39 */                    m926g1();
/* 42 */                    int i3 = this.f1690e0;
/* 48 */                    if (i != 1) {
/* 51 */                        if (i != 2) {
/* 55 */                            if (i != 17) {
/* 59 */                                if (i != 33) {
/* 63 */                                    if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
/* 73 */                                        i2 = 1;
                                            }
                                        } else if (i3 == 1) {
/* 80 */                                    i2 = -1;
                                        }
/* 69 */                                i2 = Integer.MIN_VALUE;
                                    } else if (i3 == 0) {
/* 80 */                                i2 = -1;
                                    } else {
/* 69 */                                i2 = Integer.MIN_VALUE;
                                    }
                                } else if (i3 != 1 && m918Y0()) {
/* 80 */                            i2 = -1;
                                } else {
/* 73 */                            i2 = 1;
                                }
                            } else if (i3 != 1 && m918Y0()) {
/* 73 */                        i2 = 1;
                            } else {
/* 80 */                        i2 = -1;
                            }
/* 105 */                   if (i2 != Integer.MIN_VALUE) {
/* 113 */                       LayoutParams layoutParams = (LayoutParams) viewM851B.getLayoutParams();
/* 115 */                       layoutParams.getClass();
/* 118 */                       C0141s c0141s = layoutParams.f1708e;
/* 127 */                       int iM910T0 = i2 == 1 ? m910T0() : m909S0();
/* 131 */                       m929j1(iM910T0, y12Var);
/* 134 */                       m928i1(i2);
/* 137 */                       o51 o51Var = this.f1692g0;
/* 142 */                       o51Var.f14623c = o51Var.f14624d + iM910T0;
/* 156 */                       o51Var.f14622b = (int) (this.f1688c0.mo951l() * 0.33333334f);
/* 158 */                       o51Var.f14628h = true;
/* 161 */                       o51Var.f14621a = false;
/* 163 */                       m904N0(c0134l, o51Var, y12Var);
/* 168 */                       this.f1700o0 = this.f1694i0;
/* 170 */                       View viewM1043g = c0141s.m1043g(iM910T0, i2);
/* 174 */                       if (viewM1043g != null && viewM1043g != viewM851B) {
/* 178 */                           return viewM1043g;
                                }
/* 179 */                       boolean zM921b1 = m921b1(i2);
/* 183 */                       C0141s[] c0141sArr = this.f1687b0;
/* 185 */                       int i4 = this.f1686a0;
/* 187 */                       if (zM921b1) {
/* 191 */                           for (int i5 = i4 - 1; i5 >= 0; i5--) {
/* 195 */                               View viewM1043g2 = c0141sArr[i5].m1043g(iM910T0, i2);
/* 199 */                               if (viewM1043g2 != null && viewM1043g2 != viewM851B) {
/* 203 */                                   return viewM1043g2;
                                        }
                                    }
                                } else {
/* 208 */                           for (int i6 = 0; i6 < i4; i6++) {
/* 212 */                               View viewM1043g3 = c0141sArr[i6].m1043g(iM910T0, i2);
/* 216 */                               if (viewM1043g3 != null && viewM1043g3 != viewM851B) {
/* 220 */                                   return viewM1043g3;
                                        }
                                    }
                                }
/* 236 */                       boolean z = (this.f1693h0 ^ true) == (i2 == -1);
/* 248 */                       View viewMo799B = mo799B(z ? c0141s.m1039c() : c0141s.m1040d());
/* 252 */                       if (viewMo799B != null && viewMo799B != viewM851B) {
/* 256 */                           return viewMo799B;
                                }
/* 261 */                       if (m921b1(i2)) {
/* 264 */                           for (int i7 = i4 - 1; i7 >= 0; i7--) {
/* 268 */                               if (i7 != c0141s.f1803e) {
/* 286 */                                   View viewMo799B2 = mo799B(z ? c0141sArr[i7].m1039c() : c0141sArr[i7].m1040d());
/* 290 */                                   if (viewMo799B2 != null && viewMo799B2 != viewM851B) {
/* 294 */                                       return viewMo799B2;
                                            }
                                        }
                                    }
                                } else {
/* 298 */                           for (int i8 = 0; i8 < i4; i8++) {
/* 315 */                               View viewMo799B3 = mo799B(z ? c0141sArr[i8].m1039c() : c0141sArr[i8].m1040d());
/* 319 */                               if (viewMo799B3 != null && viewMo799B3 != viewM851B) {
/* 323 */                                   return viewMo799B3;
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 5 */             return null;
                }

                /* JADX WARN: Code duplicated, block: B:107:0x0189  */
                /* JADX WARN: Code duplicated, block: B:108:0x018b  */
                /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
                /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
                /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
                /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
                /* JADX WARN: Code duplicated, block: B:254:0x03e6  */
                /* JADX WARN: Code duplicated, block: B:265:0x01de A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:269:0x01de A[SYNTHETIC] */
                /* JADX INFO: renamed from: a1 */
                public final void m920a1(C0134l c0134l, y12 y12Var, boolean z) {
                    int i;
                    boolean z2;
                    boolean z3;
                    SavedState savedState;
                    int iM986G;
                    int i2;
                    int iM974O;
                    int iM974O2;
                    int iM986G2;
                    boolean z4;
                    int i3;
                    boolean z5;
/* 7 */             SavedState savedState2 = this.f1702q0;
/* 10 */            gg2 gg2Var = this.f1704s0;
/* 12 */            if (!(savedState2 == null && this.f1696k0 == -1) && y12Var.m10082b() == 0) {
/* 24 */                m999s0(c0134l);
/* 27 */                gg2Var.m3924a();
/* 30 */                return;
                    }
/* 31 */            boolean z6 = gg2Var.f8605e;
/* 33 */            StaggeredGridLayoutManager staggeredGridLayoutManager = gg2Var.f8607g;
/* 49 */            boolean z7 = (z6 && this.f1696k0 == -1 && this.f1702q0 == null) ? false : true;
/* 50 */            C0141s[] c0141sArr = this.f1687b0;
/* 52 */            int i4 = this.f1686a0;
/* 54 */            C0139q c0139q = this.f1698m0;
/* 58 */            if (z7) {
/* 60 */                gg2Var.m3924a();
/* 63 */                SavedState savedState3 = this.f1702q0;
/* 65 */                pc0 pc0Var = this.f1688c0;
/* 67 */                if (savedState3 != null) {
/* 69 */                    int i5 = savedState3.f1716c;
/* 72 */                    if (i5 > 0) {
/* 74 */                        if (i5 == i4) {
/* 77 */                            for (int i6 = 0; i6 < i4; i6++) {
/* 81 */                                c0141sArr[i6].m1038b();
/* 84 */                                SavedState savedState4 = this.f1702q0;
/* 88 */                                int iMo946g = savedState4.f1717d[i6];
/* 90 */                                if (iMo946g != Integer.MIN_VALUE) {
/* 100 */                                   iMo946g += savedState4.f1722w ? pc0Var.mo946g() : pc0Var.mo950k();
                                        }
/* 107 */                               C0141s c0141s = c0141sArr[i6];
/* 109 */                               c0141s.f1800b = iMo946g;
/* 111 */                               c0141s.f1801c = iMo946g;
                                    }
                                } else {
/* 117 */                           savedState3.f1717d = null;
/* 119 */                           savedState3.f1716c = 0;
/* 121 */                           savedState3.f1718e = 0;
/* 123 */                           savedState3.f1719f = null;
/* 125 */                           savedState3.f1720i = null;
/* 129 */                           savedState3.f1714a = savedState3.f1715b;
                                }
                            }
/* 131 */                   SavedState savedState5 = this.f1702q0;
/* 135 */                   this.f1701p0 = savedState5.f1713U;
/* 137 */                   boolean z8 = savedState5.f1721v;
/* 139 */                   mo829m(null);
/* 142 */                   SavedState savedState6 = this.f1702q0;
/* 144 */                   if (savedState6 != null && savedState6.f1721v != z8) {
/* 150 */                       savedState6.f1721v = z8;
                            }
/* 152 */                   this.f1693h0 = z8;
/* 154 */                   m1003w0();
/* 157 */                   m926g1();
/* 160 */                   SavedState savedState7 = this.f1702q0;
/* 162 */                   int i7 = savedState7.f1714a;
/* 165 */                   if (i7 != -1) {
/* 167 */                       this.f1696k0 = i7;
/* 171 */                       gg2Var.f8603c = savedState7.f1722w;
                            } else {
/* 176 */                       gg2Var.f8603c = this.f1694i0;
                            }
/* 181 */                   if (savedState7.f1718e > 1) {
/* 185 */                       c0139q.f1797a = savedState7.f1719f;
/* 189 */                       c0139q.f1798b = savedState7.f1720i;
                            }
                        } else {
/* 192 */                   m926g1();
/* 197 */                   gg2Var.f8603c = this.f1694i0;
                        }
/* 201 */               if (y12Var.f19443g || (i3 = this.f1696k0) == -1) {
/* 447 */                   if (this.f1700o0) {
/* 449 */                       int iM10082b = y12Var.m10082b();
/* 459 */                       iM986G2 = m986G() - 1;
                                while (true) {
/* 461 */                           if (iM986G2 < 0) {
/* 479 */                               iM974O2 = 0;
                                        break;
                                    }
/* 467 */                           iM974O2 = AbstractC0133k.m974O(m984F(iM986G2));
/* 471 */                           if (iM974O2 < 0 && iM974O2 < iM10082b) {
                                        break;
                                    } else {
/* 476 */                               iM986G2--;
                                    }
                                }
                            } else {
/* 481 */                       int iM10082b2 = y12Var.m10082b();
/* 485 */                       iM986G = m986G();
/* 489 */                       i2 = 0;
                                while (true) {
/* 490 */                           if (i2 >= iM986G) {
/* 479 */                               iM974O2 = 0;
                                        break;
                                    }
/* 496 */                           iM974O = AbstractC0133k.m974O(m984F(i2));
/* 500 */                           if (iM974O < 0 && iM974O < iM10082b2) {
/* 504 */                               iM974O2 = iM974O;
                                        break;
                                    }
/* 506 */                           i2++;
                                }
                            }
/* 509 */                   gg2Var.f8601a = iM974O2;
/* 511 */                   gg2Var.f8602b = Integer.MIN_VALUE;
/* 240 */                   z4 = true;
                        } else if (i3 < 0 || i3 >= y12Var.m10082b()) {
/* 441 */                   this.f1696k0 = -1;
/* 443 */                   this.f1697l0 = Integer.MIN_VALUE;
/* 447 */                   if (this.f1700o0) {
/* 449 */                       int iM10082b3 = y12Var.m10082b();
/* 459 */                       iM986G2 = m986G() - 1;
                                while (true) {
/* 461 */                           if (iM986G2 < 0) {
/* 479 */                               iM974O2 = 0;
                                        break;
                                    } else {
/* 467 */                               iM974O2 = AbstractC0133k.m974O(m984F(iM986G2));
/* 471 */                               if (iM974O2 < 0) {
                                        }
/* 476 */                               iM986G2--;
                                    }
                                }
                            } else {
/* 481 */                       int iM10082b4 = y12Var.m10082b();
/* 485 */                       iM986G = m986G();
/* 489 */                       i2 = 0;
                                while (true) {
/* 490 */                           if (i2 >= iM986G) {
/* 479 */                               iM974O2 = 0;
                                        break;
                                    } else {
/* 496 */                               iM974O = AbstractC0133k.m974O(m984F(i2));
/* 500 */                               if (iM974O < 0) {
                                        }
/* 506 */                               i2++;
                                    }
                                }
                            }
/* 509 */                   gg2Var.f8601a = iM974O2;
/* 511 */                   gg2Var.f8602b = Integer.MIN_VALUE;
/* 240 */                   z4 = true;
                        } else {
/* 220 */                   SavedState savedState8 = this.f1702q0;
/* 222 */                   if (savedState8 == null || savedState8.f1714a == -1 || savedState8.f1716c < 1) {
/* 245 */                       View viewMo799B = mo799B(this.f1696k0);
/* 249 */                       if (viewMo799B != null) {
/* 264 */                           gg2Var.f8601a = this.f1694i0 ? m910T0() : m909S0();
/* 268 */                           if (this.f1697l0 != Integer.MIN_VALUE) {
/* 272 */                               if (gg2Var.f8603c) {
/* 286 */                                   gg2Var.f8602b = (pc0Var.mo946g() - this.f1697l0) - pc0Var.mo941b(viewMo799B);
                                        } else {
/* 301 */                                   gg2Var.f8602b = (pc0Var.mo950k() + this.f1697l0) - pc0Var.mo944e(viewMo799B);
                                        }
                                    } else if (pc0Var.mo942c(viewMo799B) > pc0Var.mo951l()) {
/* 327 */                               gg2Var.f8602b = gg2Var.f8603c ? pc0Var.mo946g() : pc0Var.mo950k();
                                    } else {
/* 338 */                               int iMo944e = pc0Var.mo944e(viewMo799B) - pc0Var.mo950k();
/* 339 */                               if (iMo944e < 0) {
/* 342 */                                   gg2Var.f8602b = -iMo944e;
                                        } else {
/* 353 */                                   int iMo946g2 = pc0Var.mo946g() - pc0Var.mo941b(viewMo799B);
/* 354 */                                   if (iMo946g2 < 0) {
/* 356 */                                       gg2Var.f8602b = iMo946g2;
                                            } else {
/* 359 */                                       gg2Var.f8602b = Integer.MIN_VALUE;
                                            }
                                        }
                                    }
                                } else {
/* 362 */                           int i8 = this.f1696k0;
/* 364 */                           gg2Var.f8601a = i8;
/* 366 */                           int i9 = this.f1697l0;
/* 368 */                           if (i9 == Integer.MIN_VALUE) {
/* 374 */                               if (m986G() != 0) {
/* 392 */                                   if ((i8 < m909S0()) != this.f1694i0) {
/* 394 */                                       z5 = false;
                                            } else {
/* 396 */                                       z5 = true;
                                            }
                                        } else if (this.f1694i0) {
/* 396 */                                   z5 = true;
                                        } else {
/* 394 */                                   z5 = false;
                                        }
/* 397 */                               gg2Var.f8603c = z5;
/* 399 */                               pc0 pc0Var2 = staggeredGridLayoutManager.f1688c0;
/* 412 */                               gg2Var.f8602b = z5 ? pc0Var2.mo946g() : pc0Var2.mo950k();
                                    } else {
/* 416 */                               boolean z9 = gg2Var.f8603c;
/* 418 */                               pc0 pc0Var3 = staggeredGridLayoutManager.f1688c0;
/* 420 */                               if (z9) {
/* 427 */                                   gg2Var.f8602b = pc0Var3.mo946g() - i9;
                                        } else {
/* 435 */                                   gg2Var.f8602b = pc0Var3.mo950k() + i9;
                                        }
                                    }
/* 414 */                           z4 = true;
/* 438 */                           gg2Var.f8604d = true;
                                }
                            } else {
/* 234 */                       gg2Var.f8602b = Integer.MIN_VALUE;
/* 238 */                       gg2Var.f8601a = this.f1696k0;
                            }
/* 240 */                   z4 = true;
                        }
/* 515 */               gg2Var.f8605e = z4;
                    }
/* 519 */           if (this.f1702q0 == null && this.f1696k0 == -1 && !(gg2Var.f8603c == this.f1700o0 && m918Y0() == this.f1701p0)) {
/* 543 */               c0139q.m1033a();
/* 546 */               i = 1;
/* 547 */               gg2Var.f8604d = true;
                    } else {
/* 541 */               i = 1;
                    }
/* 553 */           if (m986G() > 0 && ((savedState = this.f1702q0) == null || savedState.f1716c < i)) {
/* 565 */               if (gg2Var.f8604d) {
/* 568 */                   for (int i10 = 0; i10 < i4; i10++) {
/* 572 */                       c0141sArr[i10].m1038b();
/* 575 */                       int i11 = gg2Var.f8602b;
/* 577 */                       if (i11 != Integer.MIN_VALUE) {
/* 579 */                           C0141s c0141s2 = c0141sArr[i10];
/* 581 */                           c0141s2.f1800b = i11;
/* 583 */                           c0141s2.f1801c = i11;
                                }
                            }
                        } else if (z7 || gg2Var.f8606f == null) {
/* 615 */                   for (int i12 = 0; i12 < i4; i12++) {
/* 617 */                       C0141s c0141s3 = c0141sArr[i12];
/* 619 */                       boolean z10 = this.f1694i0;
/* 621 */                       int i13 = gg2Var.f8602b;
/* 623 */                       StaggeredGridLayoutManager staggeredGridLayoutManager2 = c0141s3.f1804f;
/* 632 */                       int iM1042f = z10 ? c0141s3.m1042f(Integer.MIN_VALUE) : c0141s3.m1044h(Integer.MIN_VALUE);
/* 636 */                       c0141s3.m1038b();
/* 639 */                       if (iM1042f != Integer.MIN_VALUE && ((!z10 || iM1042f >= staggeredGridLayoutManager2.f1688c0.mo946g()) && (z10 || iM1042f <= staggeredGridLayoutManager2.f1688c0.mo950k()))) {
/* 663 */                           if (i13 != Integer.MIN_VALUE) {
/* 665 */                               iM1042f += i13;
                                    }
/* 666 */                           c0141s3.f1801c = iM1042f;
/* 668 */                           c0141s3.f1800b = iM1042f;
                                }
                            }
/* 673 */                   int length = c0141sArr.length;
/* 674 */                   int[] iArr = gg2Var.f8606f;
/* 676 */                   if (iArr == null || iArr.length < length) {
/* 686 */                       gg2Var.f8606f = new int[staggeredGridLayoutManager.f1687b0.length];
                            }
/* 689 */                   for (int i14 = 0; i14 < length; i14++) {
/* 699 */                       gg2Var.f8606f[i14] = c0141sArr[i14].m1044h(Integer.MIN_VALUE);
                            }
                        } else {
/* 596 */                   for (int i15 = 0; i15 < i4; i15++) {
/* 598 */                       C0141s c0141s4 = c0141sArr[i15];
/* 600 */                       c0141s4.m1038b();
/* 605 */                       int i16 = gg2Var.f8606f[i15];
/* 607 */                       c0141s4.f1800b = i16;
/* 609 */                       c0141s4.f1801c = i16;
                            }
                        }
                    }
/* 704 */           m979A(c0134l);
/* 707 */           o51 o51Var = this.f1692g0;
/* 709 */           o51Var.f14621a = false;
/* 711 */           pc0 pc0Var4 = this.f1689d0;
/* 713 */           int iMo951l = pc0Var4.mo951l();
/* 719 */           this.f1691f0 = iMo951l / i4;
/* 725 */           View.MeasureSpec.makeMeasureSpec(iMo951l, pc0Var4.mo948i());
/* 730 */           m929j1(gg2Var.f8601a, y12Var);
/* 735 */           if (gg2Var.f8603c) {
/* 738 */               m928i1(-1);
/* 741 */               m904N0(c0134l, o51Var, y12Var);
/* 745 */               m928i1(1);
/* 753 */               o51Var.f14623c = gg2Var.f8601a + o51Var.f14624d;
/* 755 */               m904N0(c0134l, o51Var, y12Var);
                    } else {
/* 761 */               m928i1(1);
/* 764 */               m904N0(c0134l, o51Var, y12Var);
/* 767 */               m928i1(-1);
/* 775 */               o51Var.f14623c = gg2Var.f8601a + o51Var.f14624d;
/* 777 */               m904N0(c0134l, o51Var, y12Var);
                    }
/* 786 */           if (pc0Var4.mo948i() != 1073741824) {
/* 790 */               int iM986G3 = m986G();
/* 794 */               float fMax = 0.0f;
/* 796 */               for (int i17 = 0; i17 < iM986G3; i17++) {
/* 798 */                   View viewM984F = m984F(i17);
/* 802 */                   float fMo942c = pc0Var4.mo942c(viewM984F);
/* 809 */                   if (fMo942c >= fMax) {
/* 818 */                       ((LayoutParams) viewM984F.getLayoutParams()).getClass();
/* 821 */                       fMax = Math.max(fMax, fMo942c);
                            }
                        }
/* 828 */               int i18 = this.f1691f0;
/* 832 */               int iRound = Math.round(fMax * i4);
/* 840 */               if (pc0Var4.mo948i() == Integer.MIN_VALUE) {
/* 846 */                   iRound = Math.min(iRound, pc0Var4.mo951l());
                        }
/* 852 */               this.f1691f0 = iRound / i4;
/* 858 */               View.MeasureSpec.makeMeasureSpec(iRound, pc0Var4.mo948i());
/* 863 */               if (this.f1691f0 != i18) {
/* 867 */                   for (int i19 = 0; i19 < iM986G3; i19++) {
/* 869 */                       View viewM984F2 = m984F(i19);
/* 877 */                       LayoutParams layoutParams = (LayoutParams) viewM984F2.getLayoutParams();
/* 879 */                       layoutParams.getClass();
/* 882 */                       boolean zM918Y0 = m918Y0();
/* 886 */                       int i20 = this.f1690e0;
/* 888 */                       if (zM918Y0 && i20 == 1) {
/* 900 */                           int i21 = -((i4 - 1) - layoutParams.f1708e.f1803e);
/* 906 */                           viewM984F2.offsetLeftAndRight((this.f1691f0 * i21) - (i21 * i18));
                                } else {
/* 912 */                           int i22 = layoutParams.f1708e.f1803e;
/* 916 */                           int i23 = this.f1691f0 * i22;
/* 917 */                           int i24 = i22 * i18;
/* 919 */                           if (i20 == 1) {
/* 922 */                               viewM984F2.offsetLeftAndRight(i23 - i24);
                                    } else {
/* 927 */                               viewM984F2.offsetTopAndBottom(i23 - i24);
                                    }
                                }
                            }
                        }
                    }
/* 937 */           if (m986G() <= 0) {
/* 959 */               z2 = true;
                    } else if (this.f1694i0) {
/* 943 */               z2 = true;
/* 944 */               m907Q0(c0134l, y12Var, true);
/* 947 */               m908R0(c0134l, y12Var, false);
                    } else {
/* 951 */               z2 = true;
/* 952 */               m908R0(c0134l, y12Var, true);
/* 955 */               m907Q0(c0134l, y12Var, false);
                    }
/* 960 */           if (!z || y12Var.f19443g || this.f1699n0 == 0 || m986G() <= 0 || m917X0() == null) {
/* 999 */               z3 = false;
                    } else {
/* 982 */               RecyclerView recyclerView = this.f1760b;
/* 984 */               if (recyclerView != null) {
/* 988 */                   recyclerView.removeCallbacks(this.f1707v0);
                        }
/* 995 */               if (m902L0()) {
/* 997 */                   z3 = z2;
                        } else {
/* 999 */                   z3 = false;
                        }
                    }
/* 1002 */          if (y12Var.f19443g) {
/* 1004 */              gg2Var.m3924a();
                    }
/* 1009 */          this.f1700o0 = gg2Var.f8603c;
/* 1015 */          this.f1701p0 = m918Y0();
/* 1017 */          if (z3) {
/* 1019 */              gg2Var.m3924a();
/* 1022 */              m920a1(c0134l, y12Var, false);
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: b0 */
                public final void mo819b0(AccessibilityEvent accessibilityEvent) {
/* 1 */             super.mo819b0(accessibilityEvent);
/* 8 */             if (m986G() > 0) {
/* 11 */                View viewM906P0 = m906P0(false);
/* 15 */                View viewM905O0 = m905O0(false);
/* 19 */                if (viewM906P0 == null || viewM905O0 == null) {
/* 47 */                    return;
                        }
/* 24 */                int iM974O = AbstractC0133k.m974O(viewM906P0);
/* 28 */                int iM974O2 = AbstractC0133k.m974O(viewM905O0);
/* 32 */                if (iM974O < iM974O2) {
/* 34 */                    accessibilityEvent.setFromIndex(iM974O);
/* 37 */                    accessibilityEvent.setToIndex(iM974O2);
                        } else {
/* 41 */                    accessibilityEvent.setFromIndex(iM974O2);
/* 44 */                    accessibilityEvent.setToIndex(iM974O);
                        }
                    }
                }

                /* JADX INFO: renamed from: b1 */
                public final boolean m921b1(int i) {
/* 6 */             if (this.f1690e0 == 0) {
                        return (i == -1) != this.f1694i0;
                    }
                    return ((i == -1) == this.f1694i0) == m918Y0();
                }

                /* JADX INFO: renamed from: c1 */
                public final void m922c1(int i, y12 y12Var) {
                    int iM909S0;
                    int i2;
/* 2 */             if (i > 0) {
/* 4 */                 iM909S0 = m910T0();
/* 8 */                 i2 = 1;
                    } else {
/* 10 */                iM909S0 = m909S0();
/* 14 */                i2 = -1;
                    }
/* 15 */            o51 o51Var = this.f1692g0;
/* 17 */            o51Var.f14621a = true;
/* 19 */            m929j1(iM909S0, y12Var);
/* 22 */            m928i1(i2);
/* 28 */            o51Var.f14623c = iM909S0 + o51Var.f14624d;
/* 34 */            o51Var.f14622b = Math.abs(i);
                }

                /* JADX INFO: renamed from: d1 */
                public final void m923d1(C0134l c0134l, o51 o51Var) {
/* 3 */             if (!o51Var.f14621a || o51Var.f14629i) {
/* 119 */               return;
                    }
/* 11 */            int i = o51Var.f14622b;
/* 13 */            int i2 = o51Var.f14625e;
/* 16 */            if (i == 0) {
/* 18 */                if (i2 == -1) {
/* 22 */                    m924e1(c0134l, o51Var.f14627g);
/* 25 */                    return;
                        } else {
/* 28 */                    m925f1(c0134l, o51Var.f14626f);
/* 31 */                    return;
                        }
                    }
/* 32 */            int i3 = this.f1686a0;
/* 34 */            C0141s[] c0141sArr = this.f1687b0;
/* 36 */            int i4 = 1;
/* 38 */            if (i2 == -1) {
/* 40 */                int i5 = o51Var.f14626f;
/* 44 */                int iM1044h = c0141sArr[0].m1044h(i5);
/* 48 */                while (i4 < i3) {
/* 52 */                    int iM1044h2 = c0141sArr[i4].m1044h(i5);
/* 56 */                    if (iM1044h2 > iM1044h) {
/* 58 */                        iM1044h = iM1044h2;
                            }
/* 59 */                    i4++;
                        }
/* 62 */                int i6 = i5 - iM1044h;
/* 63 */                int iMin = o51Var.f14627g;
/* 65 */                if (i6 >= 0) {
/* 74 */                    iMin -= Math.min(i6, o51Var.f14622b);
                        }
/* 75 */                m924e1(c0134l, iMin);
/* 78 */                return;
                    }
/* 79 */            int i7 = o51Var.f14627g;
/* 83 */            int iM1042f = c0141sArr[0].m1042f(i7);
/* 87 */            while (i4 < i3) {
/* 91 */                int iM1042f2 = c0141sArr[i4].m1042f(i7);
/* 95 */                if (iM1042f2 < iM1042f) {
/* 97 */                    iM1042f = iM1042f2;
                        }
/* 98 */                i4++;
                    }
/* 103 */           int i8 = iM1042f - o51Var.f14627g;
/* 104 */           int iMin2 = o51Var.f14626f;
/* 106 */           if (i8 >= 0) {
/* 115 */               iMin2 += Math.min(i8, o51Var.f14622b);
                    }
/* 116 */           m925f1(c0134l, iMin2);
                }

                /* JADX INFO: renamed from: e1 */
                public final void m924e1(C0134l c0134l, int i) {
/* 7 */             for (int iM986G = m986G() - 1; iM986G >= 0; iM986G--) {
/* 9 */                 View viewM984F = m984F(iM986G);
/* 13 */                pc0 pc0Var = this.f1688c0;
/* 19 */                if (pc0Var.mo944e(viewM984F) < i || pc0Var.mo953o(viewM984F) < i) {
/* 115 */                   return;
                        }
/* 31 */                LayoutParams layoutParams = (LayoutParams) viewM984F.getLayoutParams();
/* 33 */                layoutParams.getClass();
/* 44 */                if (layoutParams.f1708e.f1799a.size() == 1) {
/* 115 */                   return;
                        }
/* 47 */                C0141s c0141s = layoutParams.f1708e;
/* 49 */                ArrayList arrayList = c0141s.f1799a;
/* 51 */                int size = arrayList.size();
/* 61 */                View view = (View) arrayList.remove(size - 1);
/* 67 */                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
/* 70 */                layoutParams2.f1708e = null;
/* 78 */                if (layoutParams2.f1681a.m1024h() || layoutParams2.f1681a.m1027k()) {
/* 99 */                    c0141s.f1802d -= c0141s.f1804f.f1688c0.mo942c(view);
                        }
/* 103 */               if (size == 1) {
/* 105 */                   c0141s.f1800b = Integer.MIN_VALUE;
                        }
/* 107 */               c0141s.f1801c = Integer.MIN_VALUE;
/* 109 */               m1001u0(viewM984F, c0134l);
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: f0 */
                public final void mo773f0(int i, int i2) {
/* 2 */             m915W0(i, i2, 1);
                }

                /* JADX INFO: renamed from: f1 */
                public final void m925f1(C0134l c0134l, int i) {
/* 5 */             while (m986G() > 0) {
/* 8 */                 View viewM984F = m984F(0);
/* 12 */                pc0 pc0Var = this.f1688c0;
/* 18 */                if (pc0Var.mo941b(viewM984F) > i || pc0Var.mo952n(viewM984F) > i) {
/* 111 */                   return;
                        }
/* 30 */                LayoutParams layoutParams = (LayoutParams) viewM984F.getLayoutParams();
/* 32 */                layoutParams.getClass();
/* 44 */                if (layoutParams.f1708e.f1799a.size() == 1) {
/* 111 */                   return;
                        }
/* 47 */                C0141s c0141s = layoutParams.f1708e;
/* 49 */                ArrayList arrayList = c0141s.f1799a;
/* 55 */                View view = (View) arrayList.remove(0);
/* 61 */                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
/* 64 */                layoutParams2.f1708e = null;
/* 72 */                if (arrayList.size() == 0) {
/* 74 */                    c0141s.f1801c = Integer.MIN_VALUE;
                        }
/* 82 */                if (layoutParams2.f1681a.m1024h() || layoutParams2.f1681a.m1027k()) {
/* 103 */                   c0141s.f1802d -= c0141s.f1804f.f1688c0.mo942c(view);
                        }
/* 105 */               c0141s.f1800b = Integer.MIN_VALUE;
/* 107 */               m1001u0(viewM984F, c0134l);
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: g0 */
                public final void mo775g0() {
/* 3 */             this.f1698m0.m1033a();
/* 6 */             m1003w0();
                }

                /* JADX INFO: renamed from: g1 */
                public final void m926g1() {
/* 4 */             if (this.f1690e0 == 1 || !m918Y0()) {
/* 21 */                this.f1694i0 = this.f1693h0;
                    } else {
/* 16 */                this.f1694i0 = !this.f1693h0;
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: h0 */
                public final void mo777h0(int i, int i2) {
/* 3 */             m915W0(i, i2, 8);
                }

                /* JADX INFO: renamed from: h1 */
                public final int m927h1(int i, y12 y12Var, C0134l c0134l) {
/* 6 */             if (m986G() == 0 || i == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            m922c1(i, y12Var);
/* 14 */            o51 o51Var = this.f1692g0;
/* 16 */            int iM904N0 = m904N0(c0134l, o51Var, y12Var);
/* 22 */            if (o51Var.f14622b >= iM904N0) {
/* 29 */                i = i < 0 ? -iM904N0 : iM904N0;
                    }
/* 33 */            this.f1688c0.mo954p(-i);
/* 38 */            this.f1700o0 = this.f1694i0;
/* 40 */            o51Var.f14622b = 0;
/* 42 */            m923d1(c0134l, o51Var);
/* 45 */            return i;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: i0 */
                public final void mo778i0(int i, int i2) {
/* 2 */             m915W0(i, i2, 2);
                }

                /* JADX INFO: renamed from: i1 */
                public final void m928i1(int i) {
/* 1 */             o51 o51Var = this.f1692g0;
/* 3 */             o51Var.f14625e = i;
/* 18 */            o51Var.f14624d = this.f1694i0 != (i == -1) ? -1 : 1;
                }

                /* JADX INFO: renamed from: j1 */
                public final void m929j1(int i, y12 y12Var) {
                    int iMo951l;
                    int iMo951l2;
                    int i2;
/* 1 */             o51 o51Var = this.f1692g0;
/* 3 */             boolean z = false;
/* 4 */             o51Var.f14622b = 0;
/* 6 */             o51Var.f14623c = i;
/* 8 */             C0126d c0126d = this.f1763e;
/* 10 */            pc0 pc0Var = this.f1688c0;
/* 13 */            if (c0126d == null || !c0126d.f18906e || (i2 = y12Var.f19437a) == -1) {
/* 46 */                iMo951l = 0;
/* 47 */                iMo951l2 = 0;
                    } else {
/* 31 */                if (this.f1694i0 == (i2 < i)) {
/* 33 */                    iMo951l = pc0Var.mo951l();
/* 37 */                    iMo951l2 = 0;
                        } else {
/* 39 */                    iMo951l2 = pc0Var.mo951l();
/* 44 */                    iMo951l = 0;
                        }
                    }
/* 48 */            RecyclerView recyclerView = this.f1760b;
/* 50 */            if (recyclerView == null || !recyclerView.f1658i) {
/* 76 */                o51Var.f14627g = pc0Var.mo945f() + iMo951l;
/* 79 */                o51Var.f14626f = -iMo951l2;
                    } else {
/* 61 */                o51Var.f14626f = pc0Var.mo950k() - iMo951l2;
/* 68 */                o51Var.f14627g = pc0Var.mo946g() + iMo951l;
                    }
/* 81 */            o51Var.f14628h = false;
/* 83 */            o51Var.f14621a = true;
/* 89 */            if (pc0Var.mo948i() == 0 && pc0Var.mo945f() == 0) {
/* 97 */                z = true;
                    }
/* 98 */            o51Var.f14629i = z;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: k0 */
                public final void mo779k0(RecyclerView recyclerView, int i, int i2) {
/* 2 */             m915W0(i, i2, 4);
                }

                /* JADX INFO: renamed from: k1 */
                public final void m930k1(C0141s c0141s, int i, int i2) {
/* 1 */             int i3 = c0141s.f1802d;
/* 3 */             int i4 = c0141s.f1803e;
/* 6 */             BitSet bitSet = this.f1695j0;
/* 11 */            if (i != -1) {
/* 54 */                int i5 = c0141s.f1801c;
/* 56 */                if (i5 == Integer.MIN_VALUE) {
/* 59 */                    c0141s.m1037a();
/* 62 */                    i5 = c0141s.f1801c;
                        }
/* 65 */                if (i5 - i3 >= i2) {
/* 67 */                    bitSet.set(i4, false);
/* 70 */                    return;
                        }
/* 70 */                return;
                    }
/* 13 */            int i6 = c0141s.f1800b;
/* 15 */            if (i6 == Integer.MIN_VALUE) {
/* 24 */                View view = (View) c0141s.f1799a.get(0);
/* 30 */                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 40 */                c0141s.f1800b = c0141s.f1804f.f1688c0.mo944e(view);
/* 42 */                layoutParams.getClass();
/* 45 */                i6 = c0141s.f1800b;
                    }
/* 48 */            if (i6 + i3 <= i2) {
/* 50 */                bitSet.set(i4, false);
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: l0 */
                public final void mo780l0(C0134l c0134l, y12 y12Var) {
/* 2 */             m920a1(c0134l, y12Var, true);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: m */
                public final void mo829m(String str) {
/* 3 */             if (this.f1702q0 == null) {
/* 5 */                 super.mo829m(str);
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: m0 */
                public final void mo781m0(y12 y12Var) {
/* 2 */             this.f1696k0 = -1;
/* 6 */             this.f1697l0 = Integer.MIN_VALUE;
/* 9 */             this.f1702q0 = null;
/* 13 */            this.f1704s0.m3924a();
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: n0 */
                public final void mo830n0(Parcelable parcelable) {
/* 3 */             if (parcelable instanceof SavedState) {
/* 5 */                 SavedState savedState = (SavedState) parcelable;
/* 7 */                 this.f1702q0 = savedState;
/* 12 */                if (this.f1696k0 != -1) {
/* 14 */                    savedState.f1714a = -1;
/* 16 */                    savedState.f1715b = -1;
/* 19 */                    savedState.f1717d = null;
/* 22 */                    savedState.f1716c = 0;
/* 24 */                    savedState.f1718e = 0;
/* 26 */                    savedState.f1719f = null;
/* 28 */                    savedState.f1720i = null;
                        }
/* 30 */                m1003w0();
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: o */
                public final boolean mo832o() {
                    return this.f1690e0 == 0;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: o0 */
                public final Parcelable mo833o0() {
                    int iM1044h;
                    int iMo950k;
                    int[] iArr;
/* 1 */             SavedState savedState = this.f1702q0;
/* 3 */             if (savedState != null) {
/* 7 */                 SavedState savedState2 = new SavedState();
/* 12 */                savedState2.f1716c = savedState.f1716c;
/* 16 */                savedState2.f1714a = savedState.f1714a;
/* 20 */                savedState2.f1715b = savedState.f1715b;
/* 24 */                savedState2.f1717d = savedState.f1717d;
/* 28 */                savedState2.f1718e = savedState.f1718e;
/* 32 */                savedState2.f1719f = savedState.f1719f;
/* 36 */                savedState2.f1721v = savedState.f1721v;
/* 40 */                savedState2.f1722w = savedState.f1722w;
/* 44 */                savedState2.f1713U = savedState.f1713U;
/* 48 */                savedState2.f1720i = savedState.f1720i;
/* 50 */                return savedState2;
                    }
/* 53 */            SavedState savedState3 = new SavedState();
/* 58 */            savedState3.f1721v = this.f1693h0;
/* 62 */            savedState3.f1722w = this.f1700o0;
/* 66 */            savedState3.f1713U = this.f1701p0;
/* 69 */            C0139q c0139q = this.f1698m0;
/* 71 */            if (c0139q == null || (iArr = c0139q.f1797a) == null) {
/* 87 */                savedState3.f1718e = 0;
                    } else {
/* 77 */                savedState3.f1719f = iArr;
/* 80 */                savedState3.f1718e = iArr.length;
/* 84 */                savedState3.f1720i = c0139q.f1798b;
                    }
/* 94 */            if (m986G() <= 0) {
/* 189 */               savedState3.f1714a = -1;
/* 191 */               savedState3.f1715b = -1;
/* 193 */               savedState3.f1716c = 0;
/* 195 */               return savedState3;
                    }
/* 109 */           savedState3.f1714a = this.f1700o0 ? m910T0() : m909S0();
/* 121 */           View viewM905O0 = this.f1694i0 ? m905O0(true) : m906P0(true);
/* 132 */           savedState3.f1715b = viewM905O0 != null ? AbstractC0133k.m974O(viewM905O0) : -1;
/* 134 */           int i = this.f1686a0;
/* 136 */           savedState3.f1716c = i;
/* 140 */           savedState3.f1717d = new int[i];
/* 142 */           for (int i2 = 0; i2 < i; i2++) {
/* 144 */               boolean z = this.f1700o0;
/* 146 */               pc0 pc0Var = this.f1688c0;
/* 150 */               C0141s[] c0141sArr = this.f1687b0;
/* 152 */               if (z) {
/* 156 */                   iM1044h = c0141sArr[i2].m1042f(Integer.MIN_VALUE);
/* 160 */                   if (iM1044h != Integer.MIN_VALUE) {
/* 162 */                       iMo950k = pc0Var.mo946g();
/* 166 */                       iM1044h -= iMo950k;
                            }
                        } else {
/* 170 */                   iM1044h = c0141sArr[i2].m1044h(Integer.MIN_VALUE);
/* 174 */                   if (iM1044h != Integer.MIN_VALUE) {
/* 176 */                       iMo950k = pc0Var.mo950k();
/* 166 */                       iM1044h -= iMo950k;
                            }
                        }
/* 183 */               savedState3.f1717d[i2] = iM1044h;
                    }
/* 188 */           return savedState3;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: p */
                public final boolean mo835p() {
                    return this.f1690e0 == 1;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: p0 */
                public final void mo931p0(int i) {
/* 1 */             if (i == 0) {
/* 3 */                 m902L0();
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: q */
                public final boolean mo783q(RecyclerView.LayoutParams layoutParams) {
/* 1 */             return layoutParams instanceof LayoutParams;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: s */
                public final void mo837s(int i, int i2, y12 y12Var, C1771iw c1771iw) {
                    o51 o51Var;
                    int iM1042f;
/* 3 */             if (this.f1690e0 != 0) {
/* 6 */                 i = i2;
                    }
/* 11 */            if (m986G() == 0 || i == 0) {
/* 115 */               return;
                    }
/* 16 */            m922c1(i, y12Var);
/* 19 */            int[] iArr = this.f1706u0;
/* 21 */            int i3 = this.f1686a0;
/* 23 */            if (iArr == null || iArr.length < i3) {
/* 30 */                this.f1706u0 = new int[i3];
                    }
/* 33 */            int i4 = 0;
/* 34 */            int i5 = 0;
                    while (true) {
/* 35 */                o51Var = this.f1692g0;
/* 37 */                if (i4 >= i3) {
                            break;
                        }
/* 39 */                int i6 = o51Var.f14624d;
/* 42 */                C0141s[] c0141sArr = this.f1687b0;
/* 44 */                if (i6 == -1) {
/* 46 */                    int i7 = o51Var.f14626f;
/* 54 */                    iM1042f = i7 - c0141sArr[i4].m1044h(i7);
                        } else {
/* 66 */                    iM1042f = c0141sArr[i4].m1042f(o51Var.f14627g) - o51Var.f14627g;
                        }
/* 68 */                if (iM1042f >= 0) {
/* 72 */                    this.f1706u0[i5] = iM1042f;
/* 74 */                    i5++;
                        }
/* 76 */                i4++;
                    }
/* 81 */            Arrays.sort(this.f1706u0, 0, i5);
/* 84 */            for (int i8 = 0; i8 < i5; i8++) {
/* 86 */                int i9 = o51Var.f14623c;
/* 88 */                if (i9 < 0 || i9 >= y12Var.m10082b()) {
/* 115 */                   return;
                        }
/* 102 */               c1771iw.m5583a(o51Var.f14623c, this.f1706u0[i8]);
/* 110 */               o51Var.f14623c += o51Var.f14624d;
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: u */
                public final int mo839u(y12 y12Var) {
/* 5 */             if (m986G() == 0) {
/* 7 */                 return 0;
                    }
/* 11 */            boolean z = !this.f1705t0;
/* 27 */            return b40.m1222f(y12Var, this.f1688c0, m906P0(z), m905O0(z), this, this.f1705t0);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: v */
                public final int mo789v(y12 y12Var) {
/* 1 */             return m903M0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: w */
                public final int mo791w(y12 y12Var) {
/* 5 */             if (m986G() == 0) {
/* 7 */                 return 0;
                    }
/* 11 */            boolean z = !this.f1705t0;
/* 27 */            return b40.m1224h(y12Var, this.f1688c0, m906P0(z), m905O0(z), this, this.f1705t0);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: x */
                public final int mo840x(y12 y12Var) {
/* 5 */             if (m986G() == 0) {
/* 7 */                 return 0;
                    }
/* 11 */            boolean z = !this.f1705t0;
/* 27 */            return b40.m1222f(y12Var, this.f1688c0, m906P0(z), m905O0(z), this, this.f1705t0);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: x0 */
                public final int mo793x0(int i, y12 y12Var, C0134l c0134l) {
/* 1 */             return m927h1(i, y12Var, c0134l);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: y */
                public final int mo795y(y12 y12Var) {
/* 1 */             return m903M0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: y0 */
                public final void mo841y0(int i) {
/* 1 */             SavedState savedState = this.f1702q0;
/* 3 */             if (savedState != null && savedState.f1714a != i) {
/* 10 */                savedState.f1717d = null;
/* 13 */                savedState.f1716c = 0;
/* 16 */                savedState.f1714a = -1;
/* 18 */                savedState.f1715b = -1;
                    }
/* 20 */            this.f1696k0 = i;
/* 24 */            this.f1697l0 = Integer.MIN_VALUE;
/* 26 */            m1003w0();
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: z */
                public final int mo797z(y12 y12Var) {
/* 5 */             if (m986G() == 0) {
/* 7 */                 return 0;
                    }
/* 11 */            boolean z = !this.f1705t0;
/* 27 */            return b40.m1224h(y12Var, this.f1688c0, m906P0(z), m905O0(z), this, this.f1705t0);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: z0 */
                public final int mo798z0(int i, y12 y12Var, C0134l c0134l) {
/* 1 */             return m927h1(i, y12Var, c0134l);
                }
            }
