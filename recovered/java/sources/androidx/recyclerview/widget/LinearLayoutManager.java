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
            import java.util.List;
            import p000.C0193bu;
            import p000.C0875ec;
            import p000.C1771iw;
            import p000.C1951n4;
            import p000.b40;
            import p000.fm0;
            import p000.o12;
            import p000.pc0;
            import p000.s71;
            import p000.ts0;
            import p000.w12;
            import p000.y12;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 75 */    public class LinearLayoutManager extends AbstractC0133k implements w12 {

                /* JADX INFO: renamed from: a0 */
                public int f1586a0;

                /* JADX INFO: renamed from: b0 */
                public C0124b f1587b0;

                /* JADX INFO: renamed from: c0 */
                public pc0 f1588c0;

                /* JADX INFO: renamed from: d0 */
                public boolean f1589d0;

                /* JADX INFO: renamed from: e0 */
                public final boolean f1590e0;

                /* JADX INFO: renamed from: f0 */
                public boolean f1591f0;

                /* JADX INFO: renamed from: g0 */
                public boolean f1592g0;

                /* JADX INFO: renamed from: h0 */
                public final boolean f1593h0;

                /* JADX INFO: renamed from: i0 */
                public int f1594i0;

                /* JADX INFO: renamed from: j0 */
                public int f1595j0;

                /* JADX INFO: renamed from: k0 */
                public SavedState f1596k0;

                /* JADX INFO: renamed from: l0 */
                public final C0123a f1597l0;

                /* JADX INFO: renamed from: m0 */
                public final s71 f1598m0;

                /* JADX INFO: renamed from: n0 */
                public final int f1599n0;

                /* JADX INFO: renamed from: o0 */
                public final int[] f1600o0;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState implements Parcelable {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0125c();

                    /* JADX INFO: renamed from: a */
                    public int f1601a;

                    /* JADX INFO: renamed from: b */
                    public int f1602b;

                    /* JADX INFO: renamed from: c */
                    public boolean f1603c;

                    @Override // android.os.Parcelable
                    public final int describeContents() {
/* 1 */                 return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 3 */                 parcel.writeInt(this.f1601a);
/* 8 */                 parcel.writeInt(this.f1602b);
/* 13 */                parcel.writeInt(this.f1603c ? 1 : 0);
                    }
                }

                public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
/* 5 */             this.f1586a0 = 1;
/* 8 */             this.f1590e0 = false;
/* 10 */            this.f1591f0 = false;
/* 12 */            this.f1592g0 = false;
/* 14 */            this.f1593h0 = true;
/* 17 */            this.f1594i0 = -1;
/* 21 */            this.f1595j0 = Integer.MIN_VALUE;
/* 24 */            this.f1596k0 = null;
/* 31 */            this.f1597l0 = new C0123a();
/* 38 */            this.f1598m0 = new s71();
/* 41 */            this.f1599n0 = 2;
/* 45 */            this.f1600o0 = new int[2];
/* 47 */            o12 o12VarM975P = AbstractC0133k.m975P(context, attributeSet, i, i2);
/* 53 */            m828l1(o12VarM975P.f14586a);
/* 56 */            boolean z = o12VarM975P.f14588c;
/* 58 */            mo829m(null);
/* 63 */            if (z != this.f1590e0) {
/* 66 */                this.f1590e0 = z;
/* 68 */                m1003w0();
                    }
/* 73 */            mo782m1(o12VarM975P.f14589d);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: B */
                public final View mo799B(int i) {
/* 1 */             int iM986G = m986G();
/* 5 */             if (iM986G == 0) {
/* 7 */                 return null;
                    }
/* 18 */            int iM974O = i - AbstractC0133k.m974O(m984F(0));
/* 20 */            if (iM974O >= 0 && iM974O < iM986G) {
/* 24 */                View viewM984F = m984F(iM974O);
/* 32 */                if (AbstractC0133k.m974O(viewM984F) == i) {
/* 34 */                    return viewM984F;
                        }
                    }
/* 35 */            return super.mo799B(i);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: C */
                public RecyclerView.LayoutParams mo762C() {
/* 4 */             return new RecyclerView.LayoutParams(-2, -2);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: G0 */
                public final boolean mo800G0() {
/* 6 */             if (this.f1756X != 1073741824 && this.f1755W != 1073741824) {
/* 12 */                int iM986G = m986G();
/* 17 */                for (int i = 0; i < iM986G; i++) {
/* 23 */                    ViewGroup.LayoutParams layoutParams = m984F(i).getLayoutParams();
/* 29 */                    if (layoutParams.width < 0 && layoutParams.height < 0) {
/* 35 */                        return true;
                            }
                        }
                    }
/* 3 */             return false;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: I0 */
                public void mo801I0(RecyclerView recyclerView, int i) {
/* 7 */             C0126d c0126d = new C0126d(recyclerView.getContext());
/* 10 */            c0126d.f18902a = i;
/* 12 */            m988J0(c0126d);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: K0 */
                public boolean mo767K0() {
                    return this.f1596k0 == null && this.f1589d0 == this.f1592g0;
                }

                /* JADX INFO: renamed from: L0 */
                public void mo802L0(y12 y12Var, int[] iArr) {
                    int i;
/* 14 */            int iMo951l = y12Var.f19437a != -1 ? this.f1588c0.mo951l() : 0;
/* 19 */            if (this.f1587b0.f1733f == -1) {
/* 21 */                i = 0;
                    } else {
/* 23 */                i = iMo951l;
/* 24 */                iMo951l = 0;
                    }
/* 25 */            iArr[0] = iMo951l;
/* 28 */            iArr[1] = i;
                }

                /* JADX INFO: renamed from: M0 */
                public void mo768M0(y12 y12Var, C0124b c0124b, C1771iw c1771iw) {
/* 1 */             int i = c0124b.f1731d;
/* 3 */             if (i < 0 || i >= y12Var.m10082b()) {
/* 21 */                return;
                    }
/* 18 */            c1771iw.m5583a(i, Math.max(0, c0124b.f1734g));
                }

                /* JADX INFO: renamed from: N0 */
                public final int m803N0(y12 y12Var) {
/* 5 */             if (m986G() == 0) {
/* 7 */                 return 0;
                    }
/* 9 */             m807R0();
/* 12 */            pc0 pc0Var = this.f1588c0;
/* 16 */            boolean z = !this.f1593h0;
/* 30 */            return b40.m1222f(y12Var, pc0Var, m811U0(z), m810T0(z), this, this.f1593h0);
                }

                /* JADX INFO: renamed from: O0 */
                public final int m804O0(y12 y12Var) {
/* 5 */             if (m986G() == 0) {
/* 7 */                 return 0;
                    }
/* 9 */             m807R0();
/* 12 */            pc0 pc0Var = this.f1588c0;
/* 16 */            boolean z = !this.f1593h0;
/* 32 */            return b40.m1223g(y12Var, pc0Var, m811U0(z), m810T0(z), this, this.f1593h0, this.f1591f0);
                }

                /* JADX INFO: renamed from: P0 */
                public final int m805P0(y12 y12Var) {
/* 5 */             if (m986G() == 0) {
/* 7 */                 return 0;
                    }
/* 9 */             m807R0();
/* 12 */            pc0 pc0Var = this.f1588c0;
/* 16 */            boolean z = !this.f1593h0;
/* 30 */            return b40.m1224h(y12Var, pc0Var, m811U0(z), m810T0(z), this, this.f1593h0);
                }

                /* JADX INFO: renamed from: Q0 */
                public final int m806Q0(int i) {
/* 3 */             if (i == 1) {
                        return (this.f1586a0 != 1 && m823e1()) ? 1 : -1;
                    }
/* 6 */             if (i == 2) {
                        return (this.f1586a0 != 1 && m823e1()) ? -1 : 1;
                    }
/* 12 */            if (i == 17) {
                        return this.f1586a0 == 0 ? -1 : Integer.MIN_VALUE;
                    }
/* 16 */            if (i == 33) {
                        return this.f1586a0 == 1 ? -1 : Integer.MIN_VALUE;
                    }
/* 20 */            if (i != 66) {
                        return (i == 130 && this.f1586a0 == 1) ? 1 : Integer.MIN_VALUE;
                    }
                    return this.f1586a0 == 0 ? 1 : Integer.MIN_VALUE;
                }

                /* JADX INFO: renamed from: R0 */
                public final void m807R0() {
/* 3 */             if (this.f1587b0 == null) {
/* 7 */                 C0124b c0124b = new C0124b();
/* 11 */                c0124b.f1728a = true;
/* 14 */                c0124b.f1735h = 0;
/* 16 */                c0124b.f1736i = 0;
/* 19 */                c0124b.f1738k = null;
/* 21 */                this.f1587b0 = c0124b;
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: S */
                public final boolean mo808S() {
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: S0 */
                public final int m809S0(C0134l c0134l, C0124b c0124b, y12 y12Var, boolean z) {
                    int i;
/* 1 */             int i2 = c0124b.f1730c;
/* 3 */             int i3 = c0124b.f1734g;
/* 7 */             if (i3 != Integer.MIN_VALUE) {
/* 9 */                 if (i2 < 0) {
/* 12 */                    c0124b.f1734g = i3 + i2;
                        }
/* 14 */                m824h1(c0134l, c0124b);
                    }
/* 21 */            int i4 = c0124b.f1730c + c0124b.f1735h;
                    while (true) {
/* 24 */                if ((!c0124b.f1739l && i4 <= 0) || (i = c0124b.f1731d) < 0 || i >= y12Var.m10082b()) {
                            break;
                        }
/* 38 */                s71 s71Var = this.f1598m0;
/* 41 */                s71Var.f16458a = 0;
/* 43 */                s71Var.f16459b = false;
/* 45 */                s71Var.f16460c = false;
/* 47 */                s71Var.f16461d = false;
/* 49 */                mo774f1(c0134l, y12Var, c0124b, s71Var);
/* 54 */                if (!s71Var.f16459b) {
/* 57 */                    int i5 = c0124b.f1729b;
/* 59 */                    int i6 = s71Var.f16458a;
/* 65 */                    c0124b.f1729b = (c0124b.f1733f * i6) + i5;
/* 69 */                    if (!s71Var.f16460c || c0124b.f1738k != null || !y12Var.f19443g) {
/* 82 */                        c0124b.f1730c -= i6;
/* 84 */                        i4 -= i6;
                            }
/* 85 */                    int i7 = c0124b.f1734g;
/* 87 */                    if (i7 != Integer.MIN_VALUE) {
/* 89 */                        int i8 = i7 + i6;
/* 90 */                        c0124b.f1734g = i8;
/* 92 */                        int i9 = c0124b.f1730c;
/* 94 */                        if (i9 < 0) {
/* 97 */                            c0124b.f1734g = i8 + i9;
                                }
/* 99 */                        m824h1(c0134l, c0124b);
                            }
/* 102 */                   if (z && s71Var.f16461d) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
/* 110 */           return i2 - c0124b.f1730c;
                }

                /* JADX INFO: renamed from: T0 */
                public final View m810T0(boolean z) {
                    return this.f1591f0 ? m815Y0(0, m986G(), z) : m815Y0(m986G() - 1, -1, z);
                }

                /* JADX INFO: renamed from: U0 */
                public final View m811U0(boolean z) {
                    return this.f1591f0 ? m815Y0(m986G() - 1, -1, z) : m815Y0(0, m986G(), z);
                }

                /* JADX INFO: renamed from: V0 */
                public final int m812V0() {
/* 6 */             View viewM815Y0 = m815Y0(0, m986G(), false);
/* 10 */            if (viewM815Y0 == null) {
/* 12 */                return -1;
                    }
/* 14 */            return AbstractC0133k.m974O(viewM815Y0);
                }

                /* JADX INFO: renamed from: W0 */
                public final int m813W0() {
/* 9 */             View viewM815Y0 = m815Y0(m986G() - 1, -1, false);
/* 13 */            if (viewM815Y0 == null) {
/* 8 */                 return -1;
                    }
/* 16 */            return AbstractC0133k.m974O(viewM815Y0);
                }

                /* JADX INFO: renamed from: X0 */
                public final View m814X0(int i, int i2) {
                    int i3;
                    int i4;
/* 1 */             m807R0();
/* 4 */             if (i2 <= i && i2 >= i) {
/* 54 */                return m984F(i);
                    }
/* 25 */            if (this.f1588c0.mo944e(m984F(i)) < this.f1588c0.mo950k()) {
/* 27 */                i3 = 16644;
/* 29 */                i4 = 16388;
                    } else {
/* 32 */                i3 = 4161;
/* 34 */                i4 = 4097;
                    }
                    return this.f1586a0 == 0 ? this.f1761c.m9559c(i, i2, i3, i4) : this.f1762d.m9559c(i, i2, i3, i4);
                }

                /* JADX INFO: renamed from: Y0 */
                public final View m815Y0(int i, int i2, boolean z) {
/* 1 */             m807R0();
/* 11 */            int i3 = z ? 24579 : 320;
                    return this.f1586a0 == 0 ? this.f1761c.m9559c(i, i2, i3, 320) : this.f1762d.m9559c(i, i2, i3, 320);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: Z */
                public final void mo816Z(RecyclerView recyclerView) {
                }

                /* JADX WARN: Code duplicated, block: B:33:0x0075  */
                /* JADX WARN: Code duplicated, block: B:35:0x0079  */
                /* JADX INFO: renamed from: Z0 */
                public View mo770Z0(C0134l c0134l, y12 y12Var, boolean z, boolean z2) {
                    int i;
                    int iM986G;
                    int i2;
/* 3 */             m807R0();
/* 6 */             int iM986G2 = m986G();
/* 12 */            if (z2) {
/* 18 */                iM986G = m986G() - 1;
/* 19 */                i = -1;
/* 20 */                i2 = -1;
                    } else {
/* 22 */                i = iM986G2;
/* 23 */                iM986G = 0;
/* 24 */                i2 = 1;
                    }
/* 25 */            int iM10082b = y12Var.m10082b();
/* 31 */            int iMo950k = this.f1588c0.mo950k();
/* 37 */            int iMo946g = this.f1588c0.mo946g();
/* 41 */            View view = null;
/* 42 */            View view2 = null;
/* 43 */            View view3 = null;
/* 44 */            while (iM986G != i) {
/* 46 */                View viewM984F = m984F(iM986G);
/* 50 */                int iM974O = AbstractC0133k.m974O(viewM984F);
/* 56 */                int iMo944e = this.f1588c0.mo944e(viewM984F);
/* 62 */                int iMo941b = this.f1588c0.mo941b(viewM984F);
/* 66 */                if (iM974O >= 0 && iM974O < iM10082b) {
/* 82 */                    if (!((RecyclerView.LayoutParams) viewM984F.getLayoutParams()).f1681a.m1024h()) {
/* 94 */                        boolean z3 = iMo941b <= iMo950k && iMo944e < iMo950k;
/* 101 */                       boolean z4 = iMo944e >= iMo946g && iMo941b > iMo946g;
/* 102 */                       if (!z3 && !z4) {
/* 107 */                           return viewM984F;
                                }
/* 108 */                       if (z) {
/* 110 */                           if (z4) {
/* 118 */                               view2 = viewM984F;
                                    } else if (view == null) {
/* 122 */                               view = viewM984F;
                                    }
                                } else if (z3) {
/* 118 */                           view2 = viewM984F;
                                } else if (view == null) {
/* 122 */                           view = viewM984F;
                                }
                            } else if (view3 == null) {
/* 86 */                        view3 = viewM984F;
                            }
                        }
/* 123 */               iM986G += i2;
                    }
/* 125 */           if (view != null) {
/* 127 */               return view;
                    }
                    return view2 != null ? view2 : view3;
                }

                @Override // p000.w12
                /* JADX INFO: renamed from: a */
                public final PointF mo817a(int i) {
/* 5 */             if (m986G() == 0) {
/* 7 */                 return null;
                    }
/* 24 */            int i2 = (i < AbstractC0133k.m974O(m984F(0))) != this.f1591f0 ? -1 : 1;
                    return this.f1586a0 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: a0 */
                public View mo771a0(View view, int i, C0134l c0134l, y12 y12Var) {
                    int iM806Q0;
                    View viewM814X0;
/* 1 */             m826j1();
/* 8 */             if (m986G() != 0 && (iM806Q0 = m806Q0(i)) != Integer.MIN_VALUE) {
/* 20 */                m807R0();
/* 36 */                m831n1(iM806Q0, (int) (this.f1588c0.mo951l() * 0.33333334f), false, y12Var);
/* 39 */                C0124b c0124b = this.f1587b0;
/* 41 */                c0124b.f1734g = Integer.MIN_VALUE;
/* 43 */                c0124b.f1728a = false;
/* 46 */                m809S0(c0134l, c0124b, y12Var, true);
/* 49 */                boolean z = this.f1591f0;
/* 52 */                if (iM806Q0 == -1) {
/* 70 */                    viewM814X0 = z ? m814X0(m986G() - 1, -1) : m814X0(0, m986G());
                        } else {
/* 91 */                    viewM814X0 = z ? m814X0(0, m986G()) : m814X0(m986G() - 1, -1);
                        }
/* 102 */               View viewM822d1 = iM806Q0 == -1 ? m822d1() : m821c1();
/* 110 */               if (!viewM822d1.hasFocusable()) {
/* 116 */                   return viewM814X0;
                        }
/* 112 */               if (viewM814X0 != null) {
/* 115 */                   return viewM822d1;
                        }
                    }
/* 114 */           return null;
                }

                /* JADX INFO: renamed from: a1 */
                public final int m818a1(int i, C0134l c0134l, y12 y12Var, boolean z) {
                    int iMo946g;
/* 7 */             int iMo946g2 = this.f1588c0.mo946g() - i;
/* 8 */             if (iMo946g2 <= 0) {
/* 36 */                return 0;
                    }
/* 15 */            int i2 = -m827k1(-iMo946g2, y12Var, c0134l);
/* 16 */            int i3 = i + i2;
/* 17 */            if (!z || (iMo946g = this.f1588c0.mo946g() - i3) <= 0) {
/* 35 */                return i2;
                    }
/* 30 */            this.f1588c0.mo954p(iMo946g);
/* 33 */            return iMo946g + i2;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: b0 */
                public final void mo819b0(AccessibilityEvent accessibilityEvent) {
/* 1 */             super.mo819b0(accessibilityEvent);
/* 8 */             if (m986G() > 0) {
/* 14 */                accessibilityEvent.setFromIndex(m812V0());
/* 21 */                accessibilityEvent.setToIndex(m813W0());
                    }
                }

                /* JADX INFO: renamed from: b1 */
                public final int m820b1(int i, C0134l c0134l, y12 y12Var, boolean z) {
                    int iMo950k;
/* 7 */             int iMo950k2 = i - this.f1588c0.mo950k();
/* 9 */             if (iMo950k2 <= 0) {
/* 36 */                return 0;
                    }
/* 15 */            int i2 = -m827k1(iMo950k2, y12Var, c0134l);
/* 16 */            int i3 = i + i2;
/* 17 */            if (!z || (iMo950k = i3 - this.f1588c0.mo950k()) <= 0) {
/* 35 */                return i2;
                    }
/* 31 */            this.f1588c0.mo954p(-iMo950k);
/* 34 */            return i2 - iMo950k;
                }

                /* JADX INFO: renamed from: c1 */
                public final View m821c1() {
/* 13 */            return m984F(this.f1591f0 ? 0 : m986G() - 1);
                }

                /* JADX INFO: renamed from: d1 */
                public final View m822d1() {
/* 13 */            return m984F(this.f1591f0 ? m986G() - 1 : 0);
                }

                /* JADX INFO: renamed from: e1 */
                public final boolean m823e1() {
                    return m989N() == 1;
                }

                /* JADX INFO: renamed from: f1 */
                public void mo774f1(C0134l c0134l, y12 y12Var, C0124b c0124b, s71 s71Var) {
                    int i;
                    int iMo943d;
                    int i2;
                    int iMo943d2;
/* 1 */             View viewM936b = c0124b.m936b(c0134l);
/* 6 */             if (viewM936b == null) {
/* 8 */                 s71Var.f16459b = true;
/* 10 */                return;
                    }
/* 15 */            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewM936b.getLayoutParams();
/* 17 */            List list = c0124b.f1738k;
/* 19 */            boolean z = this.f1591f0;
/* 21 */            int i3 = c0124b.f1733f;
/* 25 */            if (list == null) {
/* 32 */                if (z == (i3 == -1)) {
/* 34 */                    m995l(-1, viewM936b, false);
                        } else {
/* 38 */                    m995l(0, viewM936b, false);
                        }
                    } else {
/* 47 */                if (z == (i3 == -1)) {
/* 49 */                    m995l(-1, viewM936b, true);
                        } else {
/* 53 */                    m995l(0, viewM936b, true);
                        }
                    }
/* 60 */            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) viewM936b.getLayoutParams();
/* 64 */            Rect rectM858L = this.f1760b.m858L(viewM936b);
/* 72 */            int i4 = rectM858L.left + rectM858L.right;
/* 77 */            int i5 = rectM858L.top + rectM858L.bottom;
/* 104 */           int iM969H = AbstractC0133k.m969H(this.f1757Y, this.f1755W, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams2).width, mo832o());
/* 134 */           int iM969H2 = AbstractC0133k.m969H(this.f1758Z, this.f1756X, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) layoutParams2).height, mo835p());
/* 142 */           if (m985F0(viewM936b, iM969H, iM969H2, layoutParams2)) {
/* 144 */               viewM936b.measure(iM969H, iM969H2);
                    }
/* 153 */           s71Var.f16458a = this.f1588c0.mo942c(viewM936b);
/* 157 */           if (this.f1586a0 == 1) {
/* 163 */               if (m823e1()) {
/* 171 */                   iMo943d2 = this.f1757Y - getPaddingRight();
/* 178 */                   iMo943d = iMo943d2 - this.f1588c0.mo943d(viewM936b);
                        } else {
/* 181 */                   int paddingLeft = getPaddingLeft();
/* 191 */                   iMo943d2 = this.f1588c0.mo943d(viewM936b) + paddingLeft;
/* 194 */                   iMo943d = paddingLeft;
                        }
/* 195 */               int i6 = c0124b.f1733f;
/* 197 */               i2 = c0124b.f1729b;
/* 199 */               int i7 = s71Var.f16458a;
/* 201 */               if (i6 == -1) {
/* 203 */                   int i8 = i2 - i7;
/* 205 */                   i = i2;
/* 206 */                   i2 = i8;
                        } else {
/* 208 */                   i = i7 + i2;
                        }
                    } else {
/* 210 */               int paddingTop = getPaddingTop();
/* 220 */               int iMo943d3 = this.f1588c0.mo943d(viewM936b) + paddingTop;
/* 221 */               int i9 = c0124b.f1733f;
/* 223 */               int i10 = c0124b.f1729b;
/* 225 */               int i11 = s71Var.f16458a;
/* 227 */               if (i9 == -1) {
/* 229 */                   int i12 = i10 - i11;
/* 232 */                   iMo943d2 = i10;
/* 233 */                   i2 = paddingTop;
/* 234 */                   i = iMo943d3;
/* 235 */                   iMo943d = i12;
                        } else {
/* 237 */                   int i13 = i10 + i11;
/* 239 */                   i = iMo943d3;
/* 240 */                   iMo943d = i10;
/* 241 */                   i2 = paddingTop;
/* 242 */                   iMo943d2 = i13;
                        }
                    }
/* 243 */           AbstractC0133k.m977U(viewM936b, iMo943d, i2, iMo943d2, i);
/* 252 */           if (layoutParams.f1681a.m1024h() || layoutParams.f1681a.m1027k()) {
/* 262 */               s71Var.f16460c = true;
                    }
/* 268 */           s71Var.f16461d = viewM936b.hasFocusable();
                }

                /* JADX INFO: renamed from: g1 */
                public void mo776g1(C0134l c0134l, y12 y12Var, C0123a c0123a, int i) {
                }

                /* JADX INFO: renamed from: h1 */
                public final void m824h1(C0134l c0134l, C0124b c0124b) {
/* 3 */             if (!c0124b.f1728a || c0124b.f1739l) {
/* 180 */               return;
                    }
/* 11 */            int i = c0124b.f1734g;
/* 13 */            int i2 = c0124b.f1736i;
/* 19 */            if (c0124b.f1733f == -1) {
/* 21 */                int iM986G = m986G();
/* 25 */                if (i < 0) {
/* 180 */                   return;
                        }
/* 36 */                int iMo945f = (this.f1588c0.mo945f() - i) + i2;
/* 39 */                if (this.f1591f0) {
/* 42 */                    for (int i3 = 0; i3 < iM986G; i3++) {
/* 44 */                        View viewM984F = m984F(i3);
/* 54 */                        if (this.f1588c0.mo944e(viewM984F) < iMo945f || this.f1588c0.mo953o(viewM984F) < iMo945f) {
/* 68 */                            m825i1(c0134l, 0, i3);
/* 71 */                            return;
                                }
                            }
/* 180 */                   return;
                        }
/* 72 */                int i4 = iM986G - 1;
/* 75 */                for (int i5 = i4; i5 >= 0; i5--) {
/* 77 */                    View viewM984F2 = m984F(i5);
/* 87 */                    if (this.f1588c0.mo944e(viewM984F2) < iMo945f || this.f1588c0.mo953o(viewM984F2) < iMo945f) {
/* 101 */                       m825i1(c0134l, i4, i5);
/* 104 */                       return;
                            }
                        }
/* 180 */               return;
                    }
/* 105 */           if (i < 0) {
/* 180 */               return;
                    }
/* 108 */           int i6 = i - i2;
/* 109 */           int iM986G2 = m986G();
/* 115 */           if (!this.f1591f0) {
/* 151 */               for (int i7 = 0; i7 < iM986G2; i7++) {
/* 153 */                   View viewM984F3 = m984F(i7);
/* 163 */                   if (this.f1588c0.mo941b(viewM984F3) > i6 || this.f1588c0.mo952n(viewM984F3) > i6) {
/* 177 */                       m825i1(c0134l, 0, i7);
/* 180 */                       return;
                            }
                        }
/* 180 */               return;
                    }
/* 117 */           int i8 = iM986G2 - 1;
/* 120 */           for (int i9 = i8; i9 >= 0; i9--) {
/* 122 */               View viewM984F4 = m984F(i9);
/* 132 */               if (this.f1588c0.mo941b(viewM984F4) > i6 || this.f1588c0.mo952n(viewM984F4) > i6) {
/* 146 */                   m825i1(c0134l, i8, i9);
/* 149 */                   return;
                        }
                    }
                }

                /* JADX INFO: renamed from: i1 */
                public final void m825i1(C0134l c0134l, int i, int i2) {
/* 1 */             if (i == i2) {
/* 119 */               return;
                    }
/* 5 */             if (i2 <= i) {
/* 64 */                while (i > i2) {
/* 66 */                    View viewM984F = m984F(i);
/* 74 */                    if (m984F(i) != null) {
/* 76 */                        C0875ec c0875ec = this.f1759a;
/* 78 */                        int iM3397x = c0875ec.m3397x(i);
/* 84 */                        ts0 ts0Var = (ts0) c0875ec.f7613b;
/* 90 */                        View childAt = ((RecyclerView) ts0Var.f17248a).getChildAt(iM3397x);
/* 94 */                        if (childAt != null) {
/* 105 */                           if (((C0193bu) c0875ec.f7614c).m1438f(iM3397x)) {
/* 107 */                               c0875ec.m3376O(childAt);
                                    }
/* 110 */                           ts0Var.m8890D(iM3397x);
                                }
                            }
/* 113 */                   c0134l.m1009f(viewM984F);
/* 116 */                   i--;
                        }
/* 119 */               return;
                    }
/* 9 */             for (int i3 = i2 - 1; i3 >= i; i3--) {
/* 11 */                View viewM984F2 = m984F(i3);
/* 19 */                if (m984F(i3) != null) {
/* 21 */                    C0875ec c0875ec2 = this.f1759a;
/* 23 */                    int iM3397x2 = c0875ec2.m3397x(i3);
/* 29 */                    ts0 ts0Var2 = (ts0) c0875ec2.f7613b;
/* 35 */                    View childAt2 = ((RecyclerView) ts0Var2.f17248a).getChildAt(iM3397x2);
/* 39 */                    if (childAt2 != null) {
/* 50 */                        if (((C0193bu) c0875ec2.f7614c).m1438f(iM3397x2)) {
/* 52 */                            c0875ec2.m3376O(childAt2);
                                }
/* 55 */                        ts0Var2.m8890D(iM3397x2);
                            }
                        }
/* 58 */                c0134l.m1009f(viewM984F2);
                    }
                }

                /* JADX INFO: renamed from: j1 */
                public final void m826j1() {
/* 4 */             if (this.f1586a0 == 1 || !m823e1()) {
/* 21 */                this.f1591f0 = this.f1590e0;
                    } else {
/* 16 */                this.f1591f0 = !this.f1590e0;
                    }
                }

                /* JADX INFO: renamed from: k1 */
                public final int m827k1(int i, y12 y12Var, C0134l c0134l) {
/* 6 */             if (m986G() != 0 && i != 0) {
/* 11 */                m807R0();
/* 17 */                this.f1587b0.f1728a = true;
/* 23 */                int i2 = i > 0 ? 1 : -1;
/* 24 */                int iAbs = Math.abs(i);
/* 28 */                m831n1(i2, iAbs, true, y12Var);
/* 31 */                C0124b c0124b = this.f1587b0;
/* 39 */                int iM809S0 = m809S0(c0134l, c0124b, y12Var, false) + c0124b.f1734g;
/* 40 */                if (iM809S0 >= 0) {
/* 43 */                    if (iAbs > iM809S0) {
/* 45 */                        i = i2 * iM809S0;
                            }
/* 50 */                    this.f1588c0.mo954p(-i);
/* 55 */                    this.f1587b0.f1737j = i;
/* 57 */                    return i;
                        }
                    }
/* 5 */             return 0;
                }

                /* JADX WARN: Code duplicated, block: B:100:0x019d  */
                /* JADX WARN: Code duplicated, block: B:107:0x01c8  */
                /* JADX WARN: Code duplicated, block: B:110:0x01d0  */
                /* JADX WARN: Code duplicated, block: B:114:0x01e2  */
                /* JADX WARN: Code duplicated, block: B:115:0x01f0  */
                /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
                /* JADX WARN: Code duplicated, block: B:122:0x021c A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:124:0x0220  */
                /* JADX WARN: Code duplicated, block: B:126:0x0223 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:128:0x0227  */
                /* JADX WARN: Code duplicated, block: B:130:0x022a A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:131:0x022c  */
                /* JADX WARN: Code duplicated, block: B:133:0x0230  */
                /* JADX WARN: Code duplicated, block: B:135:0x0234  */
                /* JADX WARN: Code duplicated, block: B:137:0x023b  */
                /* JADX WARN: Code duplicated, block: B:138:0x0241  */
                /* JADX WARN: Code duplicated, block: B:91:0x0183  */
                /* JADX WARN: Code duplicated, block: B:98:0x019a  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v12 */
                /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r4v14 */
                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: l0 */
                public void mo780l0(C0134l c0134l, y12 y12Var) {
                    View focusedChild;
                    int iM10082b;
                    RecyclerView recyclerView;
                    View focusedChild2;
                    boolean z;
                    boolean z2;
                    View viewMo770Z0;
                    boolean z3;
                    pc0 pc0Var;
                    int iMo944e;
                    int iMo941b;
                    int iMo950k;
                    int iMo946g;
                    boolean z4;
                    boolean z5;
                    RecyclerView.LayoutParams layoutParams;
                    int i;
                    int i2;
                    int i3;
                    ?? r4;
                    List list;
                    int i4;
                    int i5;
                    int iM818a1;
                    int i6;
                    View viewMo799B;
                    int iMo944e2;
                    int iMo946g2;
                    int i7;
/* 9 */             int i8 = -1;
/* 10 */            if (!(this.f1596k0 == null && this.f1594i0 == -1) && y12Var.m10082b() == 0) {
/* 22 */                m999s0(c0134l);
/* 25 */                return;
                    }
/* 26 */            SavedState savedState = this.f1596k0;
/* 28 */            if (savedState != null && (i7 = savedState.f1601a) >= 0) {
/* 34 */                this.f1594i0 = i7;
                    }
/* 36 */            m807R0();
/* 41 */            boolean z6 = false;
/* 42 */            this.f1587b0.f1728a = false;
/* 44 */            m826j1();
/* 47 */            RecyclerView recyclerView2 = this.f1760b;
/* 49 */            if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f1759a.f7615d).contains(focusedChild)) {
/* 70 */                focusedChild = null;
                    }
/* 71 */            C0123a c0123a = this.f1597l0;
/* 78 */            if (!c0123a.f1727e || this.f1594i0 != -1 || this.f1596k0 != null) {
/* 128 */               c0123a.m934c();
/* 136 */               c0123a.f1726d = this.f1591f0 ^ this.f1592g0;
/* 140 */               if (y12Var.f19443g || (i = this.f1594i0) == -1) {
/* 384 */                   if (m986G() != 0) {
/* 388 */                       recyclerView = this.f1760b;
/* 390 */                       if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f1759a.f7615d).contains(focusedChild2)) {
/* 411 */                           focusedChild2 = null;
                                }
/* 412 */                       if (focusedChild2 != null) {
/* 418 */                           layoutParams = (RecyclerView.LayoutParams) focusedChild2.getLayoutParams();
/* 426 */                           if (!layoutParams.f1681a.m1024h() || layoutParams.f1681a.m1018b() < 0 || layoutParams.f1681a.m1018b() >= y12Var.m10082b()) {
/* 457 */                               z = this.f1589d0;
/* 459 */                               z2 = this.f1592g0;
/* 461 */                               if (z == z2 || (viewMo770Z0 = mo770Z0(c0134l, y12Var, c0123a.f1726d, z2)) == null) {
/* 565 */                                   c0123a.m932a();
/* 570 */                                   if (this.f1592g0) {
/* 576 */                                       iM10082b = y12Var.m10082b() - 1;
                                            } else {
/* 578 */                                       iM10082b = 0;
                                            }
/* 579 */                                   c0123a.f1724b = iM10082b;
                                        } else {
/* 473 */                                   int iM974O = AbstractC0133k.m974O(viewMo770Z0);
/* 477 */                                   z3 = c0123a.f1726d;
/* 479 */                                   pc0Var = c0123a.f1723a;
/* 481 */                                   if (z3) {
/* 494 */                                       c0123a.f1725c = c0123a.f1723a.m7384m() + pc0Var.mo941b(viewMo770Z0);
                                            } else {
/* 501 */                                       c0123a.f1725c = pc0Var.mo944e(viewMo770Z0);
                                            }
/* 503 */                                   c0123a.f1724b = iM974O;
/* 507 */                                   if (!y12Var.f19443g && mo767K0()) {
/* 517 */                                       iMo944e = this.f1588c0.mo944e(viewMo770Z0);
/* 523 */                                       iMo941b = this.f1588c0.mo941b(viewMo770Z0);
/* 529 */                                       iMo950k = this.f1588c0.mo950k();
/* 535 */                                       iMo946g = this.f1588c0.mo946g();
/* 539 */                                       if (iMo941b <= iMo950k || iMo944e >= iMo950k) {
/* 545 */                                           z4 = false;
                                                } else {
/* 543 */                                           z4 = true;
                                                }
/* 546 */                                       if (iMo944e >= iMo946g || iMo941b <= iMo946g) {
/* 552 */                                           z5 = false;
                                                } else {
/* 550 */                                           z5 = true;
                                                }
/* 553 */                                       if (z4 || z5) {
/* 559 */                                           if (c0123a.f1726d) {
/* 561 */                                               iMo950k = iMo946g;
                                                    }
/* 562 */                                           c0123a.f1725c = iMo950k;
                                                }
                                            }
                                        }
                                    } else {
/* 452 */                               c0123a.m933b(AbstractC0133k.m974O(focusedChild2), focusedChild2);
                                    }
                                } else {
/* 457 */                           z = this.f1589d0;
/* 459 */                           z2 = this.f1592g0;
/* 461 */                           if (z == z2) {
/* 565 */                               c0123a.m932a();
/* 570 */                               if (this.f1592g0) {
/* 576 */                                   iM10082b = y12Var.m10082b() - 1;
                                        } else {
/* 578 */                                   iM10082b = 0;
                                        }
/* 579 */                               c0123a.f1724b = iM10082b;
                                    } else {
/* 473 */                               int iM974O2 = AbstractC0133k.m974O(viewMo770Z0);
/* 477 */                               z3 = c0123a.f1726d;
/* 479 */                               pc0Var = c0123a.f1723a;
/* 481 */                               if (z3) {
/* 494 */                                   c0123a.f1725c = c0123a.f1723a.m7384m() + pc0Var.mo941b(viewMo770Z0);
                                        } else {
/* 501 */                                   c0123a.f1725c = pc0Var.mo944e(viewMo770Z0);
                                        }
/* 503 */                               c0123a.f1724b = iM974O2;
/* 507 */                               if (!y12Var.f19443g) {
/* 517 */                                   iMo944e = this.f1588c0.mo944e(viewMo770Z0);
/* 523 */                                   iMo941b = this.f1588c0.mo941b(viewMo770Z0);
/* 529 */                                   iMo950k = this.f1588c0.mo950k();
/* 535 */                                   iMo946g = this.f1588c0.mo946g();
/* 539 */                                   if (iMo941b <= iMo950k) {
/* 545 */                                       z4 = false;
                                            } else {
/* 545 */                                       z4 = false;
                                            }
/* 546 */                                   if (iMo944e >= iMo946g) {
/* 552 */                                       z5 = false;
                                            } else {
/* 552 */                                       z5 = false;
                                            }
/* 553 */                                   if (z4) {
/* 559 */                                       if (c0123a.f1726d) {
/* 561 */                                           iMo950k = iMo946g;
                                                }
/* 562 */                                       c0123a.f1725c = iMo950k;
                                            } else {
/* 559 */                                       if (c0123a.f1726d) {
/* 561 */                                           iMo950k = iMo946g;
                                                }
/* 562 */                                       c0123a.f1725c = iMo950k;
                                            }
                                        }
                                    }
                                }
                            } else {
/* 565 */                       c0123a.m932a();
/* 570 */                       if (this.f1592g0) {
/* 576 */                           iM10082b = y12Var.m10082b() - 1;
                                } else {
/* 578 */                           iM10082b = 0;
                                }
/* 579 */                       c0123a.f1724b = iM10082b;
                            }
                        } else if (i < 0 || i >= y12Var.m10082b()) {
/* 376 */                   this.f1594i0 = -1;
/* 378 */                   this.f1595j0 = Integer.MIN_VALUE;
/* 384 */                   if (m986G() != 0) {
/* 388 */                       recyclerView = this.f1760b;
/* 390 */                       if (recyclerView != null) {
/* 411 */                           focusedChild2 = null;
                                } else {
/* 411 */                           focusedChild2 = null;
                                }
/* 412 */                       if (focusedChild2 != null) {
/* 418 */                           layoutParams = (RecyclerView.LayoutParams) focusedChild2.getLayoutParams();
/* 426 */                           if (layoutParams.f1681a.m1024h()) {
/* 457 */                               z = this.f1589d0;
/* 459 */                               z2 = this.f1592g0;
/* 461 */                               if (z == z2) {
/* 565 */                                   c0123a.m932a();
/* 570 */                                   if (this.f1592g0) {
/* 576 */                                       iM10082b = y12Var.m10082b() - 1;
                                            } else {
/* 578 */                                       iM10082b = 0;
                                            }
/* 579 */                                   c0123a.f1724b = iM10082b;
                                        } else {
/* 473 */                                   int iM974O3 = AbstractC0133k.m974O(viewMo770Z0);
/* 477 */                                   z3 = c0123a.f1726d;
/* 479 */                                   pc0Var = c0123a.f1723a;
/* 481 */                                   if (z3) {
/* 494 */                                       c0123a.f1725c = c0123a.f1723a.m7384m() + pc0Var.mo941b(viewMo770Z0);
                                            } else {
/* 501 */                                       c0123a.f1725c = pc0Var.mo944e(viewMo770Z0);
                                            }
/* 503 */                                   c0123a.f1724b = iM974O3;
/* 507 */                                   if (!y12Var.f19443g) {
/* 517 */                                       iMo944e = this.f1588c0.mo944e(viewMo770Z0);
/* 523 */                                       iMo941b = this.f1588c0.mo941b(viewMo770Z0);
/* 529 */                                       iMo950k = this.f1588c0.mo950k();
/* 535 */                                       iMo946g = this.f1588c0.mo946g();
/* 539 */                                       if (iMo941b <= iMo950k) {
/* 545 */                                           z4 = false;
                                                } else {
/* 545 */                                           z4 = false;
                                                }
/* 546 */                                       if (iMo944e >= iMo946g) {
/* 552 */                                           z5 = false;
                                                } else {
/* 552 */                                           z5 = false;
                                                }
/* 553 */                                       if (z4) {
/* 559 */                                           if (c0123a.f1726d) {
/* 561 */                                               iMo950k = iMo946g;
                                                    }
/* 562 */                                           c0123a.f1725c = iMo950k;
                                                } else {
/* 559 */                                           if (c0123a.f1726d) {
/* 561 */                                               iMo950k = iMo946g;
                                                    }
/* 562 */                                           c0123a.f1725c = iMo950k;
                                                }
                                            }
                                        }
                                    } else {
/* 457 */                               z = this.f1589d0;
/* 459 */                               z2 = this.f1592g0;
/* 461 */                               if (z == z2) {
/* 565 */                                   c0123a.m932a();
/* 570 */                                   if (this.f1592g0) {
/* 576 */                                       iM10082b = y12Var.m10082b() - 1;
                                            } else {
/* 578 */                                       iM10082b = 0;
                                            }
/* 579 */                                   c0123a.f1724b = iM10082b;
                                        } else {
/* 473 */                                   int iM974O4 = AbstractC0133k.m974O(viewMo770Z0);
/* 477 */                                   z3 = c0123a.f1726d;
/* 479 */                                   pc0Var = c0123a.f1723a;
/* 481 */                                   if (z3) {
/* 494 */                                       c0123a.f1725c = c0123a.f1723a.m7384m() + pc0Var.mo941b(viewMo770Z0);
                                            } else {
/* 501 */                                       c0123a.f1725c = pc0Var.mo944e(viewMo770Z0);
                                            }
/* 503 */                                   c0123a.f1724b = iM974O4;
/* 507 */                                   if (!y12Var.f19443g) {
/* 517 */                                       iMo944e = this.f1588c0.mo944e(viewMo770Z0);
/* 523 */                                       iMo941b = this.f1588c0.mo941b(viewMo770Z0);
/* 529 */                                       iMo950k = this.f1588c0.mo950k();
/* 535 */                                       iMo946g = this.f1588c0.mo946g();
/* 539 */                                       if (iMo941b <= iMo950k) {
/* 545 */                                           z4 = false;
                                                } else {
/* 545 */                                           z4 = false;
                                                }
/* 546 */                                       if (iMo944e >= iMo946g) {
/* 552 */                                           z5 = false;
                                                } else {
/* 552 */                                           z5 = false;
                                                }
/* 553 */                                       if (z4) {
/* 559 */                                           if (c0123a.f1726d) {
/* 561 */                                               iMo950k = iMo946g;
                                                    }
/* 562 */                                           c0123a.f1725c = iMo950k;
                                                } else {
/* 559 */                                           if (c0123a.f1726d) {
/* 561 */                                               iMo950k = iMo946g;
                                                    }
/* 562 */                                           c0123a.f1725c = iMo950k;
                                                }
                                            }
                                        }
                                    }
                                } else {
/* 457 */                           z = this.f1589d0;
/* 459 */                           z2 = this.f1592g0;
/* 461 */                           if (z == z2) {
/* 565 */                               c0123a.m932a();
/* 570 */                               if (this.f1592g0) {
/* 576 */                                   iM10082b = y12Var.m10082b() - 1;
                                        } else {
/* 578 */                                   iM10082b = 0;
                                        }
/* 579 */                               c0123a.f1724b = iM10082b;
                                    } else {
/* 473 */                               int iM974O5 = AbstractC0133k.m974O(viewMo770Z0);
/* 477 */                               z3 = c0123a.f1726d;
/* 479 */                               pc0Var = c0123a.f1723a;
/* 481 */                               if (z3) {
/* 494 */                                   c0123a.f1725c = c0123a.f1723a.m7384m() + pc0Var.mo941b(viewMo770Z0);
                                        } else {
/* 501 */                                   c0123a.f1725c = pc0Var.mo944e(viewMo770Z0);
                                        }
/* 503 */                               c0123a.f1724b = iM974O5;
/* 507 */                               if (!y12Var.f19443g) {
/* 517 */                                   iMo944e = this.f1588c0.mo944e(viewMo770Z0);
/* 523 */                                   iMo941b = this.f1588c0.mo941b(viewMo770Z0);
/* 529 */                                   iMo950k = this.f1588c0.mo950k();
/* 535 */                                   iMo946g = this.f1588c0.mo946g();
/* 539 */                                   if (iMo941b <= iMo950k) {
/* 545 */                                       z4 = false;
                                            } else {
/* 545 */                                       z4 = false;
                                            }
/* 546 */                                   if (iMo944e >= iMo946g) {
/* 552 */                                       z5 = false;
                                            } else {
/* 552 */                                       z5 = false;
                                            }
/* 553 */                                   if (z4) {
/* 559 */                                       if (c0123a.f1726d) {
/* 561 */                                           iMo950k = iMo946g;
                                                }
/* 562 */                                       c0123a.f1725c = iMo950k;
                                            } else {
/* 559 */                                       if (c0123a.f1726d) {
/* 561 */                                           iMo950k = iMo946g;
                                                }
/* 562 */                                       c0123a.f1725c = iMo950k;
                                            }
                                        }
                                    }
                                }
                            } else {
/* 565 */                       c0123a.m932a();
/* 570 */                       if (this.f1592g0) {
/* 576 */                           iM10082b = y12Var.m10082b() - 1;
                                } else {
/* 578 */                           iM10082b = 0;
                                }
/* 579 */                       c0123a.f1724b = iM10082b;
                            }
                        } else {
/* 158 */                   int i9 = this.f1594i0;
/* 160 */                   c0123a.f1724b = i9;
/* 162 */                   SavedState savedState2 = this.f1596k0;
/* 164 */                   if (savedState2 != null && savedState2.f1601a >= 0) {
/* 170 */                       boolean z7 = savedState2.f1603c;
/* 172 */                       c0123a.f1726d = z7;
/* 174 */                       pc0 pc0Var2 = this.f1588c0;
/* 176 */                       if (z7) {
/* 187 */                           c0123a.f1725c = pc0Var2.mo946g() - this.f1596k0.f1602b;
                                } else {
/* 200 */                           c0123a.f1725c = pc0Var2.mo950k() + this.f1596k0.f1602b;
                                }
                            } else if (this.f1595j0 == Integer.MIN_VALUE) {
/* 208 */                       View viewMo799B2 = mo799B(i9);
/* 212 */                       if (viewMo799B2 == null) {
/* 315 */                           if (m986G() > 0) {
/* 339 */                               c0123a.f1726d = (this.f1594i0 < AbstractC0133k.m974O(m984F(0))) == this.f1591f0;
                                    }
/* 341 */                           c0123a.m932a();
                                } else if (this.f1588c0.mo942c(viewMo799B2) > this.f1588c0.mo951l()) {
/* 228 */                           c0123a.m932a();
                                } else {
/* 245 */                           int iMo944e3 = this.f1588c0.mo944e(viewMo799B2) - this.f1588c0.mo950k();
/* 246 */                           pc0 pc0Var3 = this.f1588c0;
/* 248 */                           if (iMo944e3 < 0) {
/* 254 */                               c0123a.f1725c = pc0Var3.mo950k();
/* 256 */                               c0123a.f1726d = false;
                                    } else if (pc0Var3.mo946g() - this.f1588c0.mo941b(viewMo799B2) < 0) {
/* 279 */                               c0123a.f1725c = this.f1588c0.mo946g();
/* 281 */                               c0123a.f1726d = true;
                                    } else {
/* 285 */                               boolean z8 = c0123a.f1726d;
/* 287 */                               pc0 pc0Var4 = this.f1588c0;
/* 307 */                               c0123a.f1725c = z8 ? this.f1588c0.m7384m() + pc0Var4.mo941b(viewMo799B2) : pc0Var4.mo944e(viewMo799B2);
                                    }
                                }
                            } else {
/* 346 */                       boolean z9 = this.f1591f0;
/* 348 */                       c0123a.f1726d = z9;
/* 350 */                       pc0 pc0Var5 = this.f1588c0;
/* 352 */                       if (z9) {
/* 361 */                           c0123a.f1725c = pc0Var5.mo946g() - this.f1595j0;
                                } else {
/* 372 */                           c0123a.f1725c = pc0Var5.mo950k() + this.f1595j0;
                                }
                            }
                        }
/* 581 */               c0123a.f1727e = true;
                    } else if (focusedChild != null && (this.f1588c0.mo944e(focusedChild) >= this.f1588c0.mo946g() || this.f1588c0.mo941b(focusedChild) <= this.f1588c0.mo950k())) {
/* 123 */               c0123a.m933b(AbstractC0133k.m974O(focusedChild), focusedChild);
                    }
/* 583 */           C0124b c0124b = this.f1587b0;
/* 592 */           c0124b.f1733f = c0124b.f1737j >= 0 ? 1 : -1;
/* 594 */           int[] iArr = this.f1600o0;
/* 596 */           iArr[0] = 0;
/* 598 */           iArr[1] = 0;
/* 600 */           mo802L0(y12Var, iArr);
/* 615 */           int iMo950k2 = this.f1588c0.mo950k() + Math.max(0, iArr[0]);
/* 628 */           int iMo947h = this.f1588c0.mo947h() + Math.max(0, iArr[1]);
/* 631 */           if (y12Var.f19443g && (i6 = this.f1594i0) != -1 && this.f1595j0 != Integer.MIN_VALUE && (viewMo799B = mo799B(i6)) != null) {
/* 647 */               boolean z10 = this.f1591f0;
/* 649 */               pc0 pc0Var6 = this.f1588c0;
/* 651 */               if (z10) {
/* 663 */                   iMo946g2 = pc0Var6.mo946g() - this.f1588c0.mo941b(viewMo799B);
/* 664 */                   iMo944e2 = this.f1595j0;
                        } else {
/* 678 */                   iMo944e2 = pc0Var6.mo944e(viewMo799B) - this.f1588c0.mo950k();
/* 679 */                   iMo946g2 = this.f1595j0;
                        }
/* 666 */               int i10 = iMo946g2 - iMo944e2;
/* 682 */               if (i10 > 0) {
/* 684 */                   iMo950k2 += i10;
                        } else {
/* 686 */                   iMo947h -= i10;
                        }
                    }
/* 687 */           boolean z11 = c0123a.f1726d;
/* 689 */           boolean z12 = this.f1591f0;
/* 691 */           if (!z11 ? !z12 : z12) {
/* 695 */               i8 = 1;
                    }
/* 699 */           mo776g1(c0134l, y12Var, c0123a, i8);
/* 702 */           m979A(c0134l);
/* 726 */           this.f1587b0.f1739l = this.f1588c0.mo948i() == 0 && this.f1588c0.mo945f() == 0;
/* 730 */           this.f1587b0.getClass();
/* 735 */           this.f1587b0.f1736i = 0;
/* 737 */           boolean z13 = c0123a.f1726d;
/* 739 */           int i11 = c0123a.f1724b;
/* 741 */           if (z13) {
/* 745 */               m836p1(i11, c0123a.f1725c);
/* 748 */               C0124b c0124b2 = this.f1587b0;
/* 750 */               c0124b2.f1735h = iMo950k2;
/* 752 */               m809S0(c0134l, c0124b2, y12Var, false);
/* 755 */               C0124b c0124b3 = this.f1587b0;
/* 757 */               i3 = c0124b3.f1729b;
/* 759 */               int i12 = c0124b3.f1731d;
/* 761 */               int i13 = c0124b3.f1730c;
/* 763 */               if (i13 > 0) {
/* 765 */                   iMo947h += i13;
                        }
/* 770 */               m834o1(c0123a.f1724b, c0123a.f1725c);
/* 773 */               C0124b c0124b4 = this.f1587b0;
/* 775 */               c0124b4.f1735h = iMo947h;
/* 782 */               c0124b4.f1731d += c0124b4.f1732e;
/* 784 */               m809S0(c0134l, c0124b4, y12Var, false);
/* 787 */               C0124b c0124b5 = this.f1587b0;
/* 789 */               i2 = c0124b5.f1729b;
/* 791 */               int i14 = c0124b5.f1730c;
/* 793 */               if (i14 > 0) {
/* 795 */                   m836p1(i12, i3);
/* 798 */                   C0124b c0124b6 = this.f1587b0;
/* 800 */                   c0124b6.f1735h = i14;
/* 802 */                   m809S0(c0134l, c0124b6, y12Var, false);
/* 807 */                   i3 = this.f1587b0.f1729b;
                        }
                    } else {
/* 812 */               m834o1(i11, c0123a.f1725c);
/* 815 */               C0124b c0124b7 = this.f1587b0;
/* 817 */               c0124b7.f1735h = iMo947h;
/* 819 */               m809S0(c0134l, c0124b7, y12Var, false);
/* 822 */               C0124b c0124b8 = this.f1587b0;
/* 824 */               i2 = c0124b8.f1729b;
/* 826 */               int i15 = c0124b8.f1731d;
/* 828 */               int i16 = c0124b8.f1730c;
/* 830 */               if (i16 > 0) {
/* 832 */                   iMo950k2 += i16;
                        }
/* 837 */               m836p1(c0123a.f1724b, c0123a.f1725c);
/* 840 */               C0124b c0124b9 = this.f1587b0;
/* 842 */               c0124b9.f1735h = iMo950k2;
/* 849 */               c0124b9.f1731d += c0124b9.f1732e;
/* 851 */               m809S0(c0134l, c0124b9, y12Var, false);
/* 854 */               C0124b c0124b10 = this.f1587b0;
/* 856 */               int i17 = c0124b10.f1729b;
/* 858 */               int i18 = c0124b10.f1730c;
/* 860 */               if (i18 > 0) {
/* 862 */                   m834o1(i15, i2);
/* 865 */                   C0124b c0124b11 = this.f1587b0;
/* 867 */                   c0124b11.f1735h = i18;
/* 869 */                   m809S0(c0134l, c0124b11, y12Var, false);
/* 874 */                   i2 = this.f1587b0.f1729b;
                        }
/* 876 */               i3 = i17;
                    }
/* 881 */           if (m986G() > 0) {
/* 888 */               if (this.f1591f0 ^ this.f1592g0) {
/* 890 */                   int iM818a2 = m818a1(i2, c0134l, y12Var, true);
/* 894 */                   i4 = i3 + iM818a2;
/* 895 */                   i5 = i2 + iM818a2;
/* 896 */                   iM818a1 = m820b1(i4, c0134l, y12Var, false);
                        } else {
/* 903 */                   int iM820b1 = m820b1(i3, c0134l, y12Var, true);
/* 907 */                   i4 = i3 + iM820b1;
/* 908 */                   i5 = i2 + iM820b1;
/* 909 */                   iM818a1 = m818a1(i5, c0134l, y12Var, false);
                        }
/* 900 */               i3 = i4 + iM818a1;
/* 901 */               i2 = i5 + iM818a1;
                    }
/* 916 */           if (y12Var.f19447k && m986G() != 0 && !y12Var.f19443g && mo767K0()) {
/* 936 */               List list2 = c0134l.f1771d;
/* 938 */               int size = list2.size();
/* 946 */               int iM974O6 = AbstractC0133k.m974O(m984F(0));
/* 950 */               int i19 = 0;
/* 951 */               int iMo942c = 0;
/* 952 */               int iMo942c2 = 0;
/* 953 */               while (i19 < size) {
/* 959 */                   AbstractC0137o abstractC0137o = (AbstractC0137o) list2.get(i19);
/* 961 */                   boolean zM1024h = abstractC0137o.m1024h();
/* 965 */                   View view = abstractC0137o.f1778a;
/* 967 */                   if (!zM1024h) {
/* 978 */                       boolean z14 = abstractC0137o.m1018b() < iM974O6 ? true : z6;
/* 979 */                       boolean z15 = this.f1591f0;
/* 981 */                       pc0 pc0Var7 = this.f1588c0;
/* 983 */                       if (z14 != z15) {
/* 989 */                           iMo942c += pc0Var7.mo942c(view);
                                } else {
/* 995 */                           iMo942c2 += pc0Var7.mo942c(view);
                                }
                            }
/* 996 */                   i19++;
/* 998 */                   z6 = false;
                        }
/* 1003 */              this.f1587b0.f1738k = list2;
/* 1005 */              if (iMo942c > 0) {
/* 1015 */                  m836p1(AbstractC0133k.m974O(m822d1()), i3);
/* 1018 */                  C0124b c0124b12 = this.f1587b0;
/* 1020 */                  c0124b12.f1735h = iMo942c;
/* 1022 */                  r4 = 0;
/* 1023 */                  c0124b12.f1730c = 0;
/* 1026 */                  c0124b12.m935a(null);
/* 1031 */                  m809S0(c0134l, this.f1587b0, y12Var, false);
                        } else {
/* 1035 */                  r4 = 0;
                        }
/* 1036 */              if (iMo942c2 > 0) {
/* 1046 */                  m834o1(AbstractC0133k.m974O(m821c1()), i2);
/* 1049 */                  C0124b c0124b13 = this.f1587b0;
/* 1051 */                  c0124b13.f1735h = iMo942c2;
/* 1053 */                  c0124b13.f1730c = r4;
/* 1055 */                  list = null;
/* 1056 */                  c0124b13.m935a(null);
/* 1061 */                  m809S0(c0134l, this.f1587b0, y12Var, r4);
                        } else {
/* 1065 */                  list = null;
                        }
/* 1068 */              this.f1587b0.f1738k = list;
                    }
/* 1072 */          if (y12Var.f19443g) {
/* 1083 */              c0123a.m934c();
                    } else {
/* 1074 */              pc0 pc0Var8 = this.f1588c0;
/* 1080 */              pc0Var8.f15060a = pc0Var8.mo951l();
                    }
/* 1088 */          this.f1589d0 = this.f1592g0;
                }

                /* JADX INFO: renamed from: l1 */
                public final void m828l1(int i) {
/* 1 */             if (i != 0 && i != 1) {
/* 13 */                C1951n4.m6859j(fm0.m3781g(i, "invalid orientation:"));
/* 16 */                return;
                    }
/* 18 */            mo829m(null);
/* 23 */            if (i != this.f1586a0 || this.f1588c0 == null) {
/* 31 */                pc0 pc0VarM7383a = pc0.m7383a(this, i);
/* 35 */                this.f1588c0 = pc0VarM7383a;
/* 39 */                this.f1597l0.f1723a = pc0VarM7383a;
/* 41 */                this.f1586a0 = i;
/* 43 */                m1003w0();
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: m */
                public final void mo829m(String str) {
/* 3 */             if (this.f1596k0 == null) {
/* 5 */                 super.mo829m(str);
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: m0 */
                public void mo781m0(y12 y12Var) {
/* 2 */             this.f1596k0 = null;
/* 5 */             this.f1594i0 = -1;
/* 9 */             this.f1595j0 = Integer.MIN_VALUE;
/* 13 */            this.f1597l0.m934c();
                }

                /* JADX INFO: renamed from: m1 */
                public void mo782m1(boolean z) {
/* 2 */             mo829m(null);
/* 7 */             if (this.f1592g0 == z) {
/* 9 */                 return;
                    }
/* 10 */            this.f1592g0 = z;
/* 12 */            m1003w0();
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: n0 */
                public final void mo830n0(Parcelable parcelable) {
/* 3 */             if (parcelable instanceof SavedState) {
/* 5 */                 SavedState savedState = (SavedState) parcelable;
/* 7 */                 this.f1596k0 = savedState;
/* 12 */                if (this.f1594i0 != -1) {
/* 14 */                    savedState.f1601a = -1;
                        }
/* 16 */                m1003w0();
                    }
                }

                /* JADX INFO: renamed from: n1 */
                public final void m831n1(int i, int i2, boolean z, y12 y12Var) {
                    int iMo950k;
/* 24 */            this.f1587b0.f1739l = this.f1588c0.mo948i() == 0 && this.f1588c0.mo945f() == 0;
/* 28 */            this.f1587b0.f1733f = i;
/* 30 */            int[] iArr = this.f1600o0;
/* 32 */            iArr[0] = 0;
/* 34 */            iArr[1] = 0;
/* 36 */            mo802L0(y12Var, iArr);
/* 41 */            int iMax = Math.max(0, iArr[0]);
/* 47 */            int iMax2 = Math.max(0, iArr[1]);
/* 51 */            boolean z2 = i == 1;
/* 54 */            C0124b c0124b = this.f1587b0;
/* 60 */            int i3 = z2 ? iMax2 : iMax;
/* 61 */            c0124b.f1735h = i3;
/* 63 */            if (!z2) {
/* 66 */                iMax = iMax2;
                    }
/* 67 */            c0124b.f1736i = iMax;
/* 70 */            if (z2) {
/* 79 */                c0124b.f1735h = this.f1588c0.mo947h() + i3;
/* 81 */                View viewM821c1 = m821c1();
/* 85 */                C0124b c0124b2 = this.f1587b0;
/* 92 */                c0124b2.f1732e = this.f1591f0 ? -1 : 1;
/* 94 */                int iM974O = AbstractC0133k.m974O(viewM821c1);
/* 98 */                C0124b c0124b3 = this.f1587b0;
/* 103 */               c0124b2.f1731d = iM974O + c0124b3.f1732e;
/* 111 */               c0124b3.f1729b = this.f1588c0.mo941b(viewM821c1);
/* 125 */               iMo950k = this.f1588c0.mo941b(viewM821c1) - this.f1588c0.mo946g();
                    } else {
/* 127 */               View viewM822d1 = m822d1();
/* 131 */               C0124b c0124b4 = this.f1587b0;
/* 142 */               c0124b4.f1735h = this.f1588c0.mo950k() + c0124b4.f1735h;
/* 144 */               C0124b c0124b5 = this.f1587b0;
/* 152 */               c0124b5.f1732e = this.f1591f0 ? 1 : -1;
/* 154 */               int iM974O2 = AbstractC0133k.m974O(viewM822d1);
/* 158 */               C0124b c0124b6 = this.f1587b0;
/* 163 */               c0124b5.f1731d = iM974O2 + c0124b6.f1732e;
/* 171 */               c0124b6.f1729b = this.f1588c0.mo944e(viewM822d1);
/* 186 */               iMo950k = (-this.f1588c0.mo944e(viewM822d1)) + this.f1588c0.mo950k();
                    }
/* 187 */           C0124b c0124b7 = this.f1587b0;
/* 189 */           c0124b7.f1730c = i2;
/* 191 */           if (z) {
/* 194 */               c0124b7.f1730c = i2 - iMo950k;
                    }
/* 196 */           c0124b7.f1734g = iMo950k;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: o */
                public final boolean mo832o() {
                    return this.f1586a0 == 0;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: o0 */
                public final Parcelable mo833o0() {
/* 1 */             SavedState savedState = this.f1596k0;
/* 3 */             if (savedState != null) {
/* 7 */                 SavedState savedState2 = new SavedState();
/* 12 */                savedState2.f1601a = savedState.f1601a;
/* 16 */                savedState2.f1602b = savedState.f1602b;
/* 20 */                savedState2.f1603c = savedState.f1603c;
/* 22 */                return savedState2;
                    }
/* 25 */            SavedState savedState3 = new SavedState();
/* 32 */            if (m986G() <= 0) {
/* 99 */                savedState3.f1601a = -1;
/* 101 */               return savedState3;
                    }
/* 34 */            m807R0();
/* 41 */            boolean z = this.f1589d0 ^ this.f1591f0;
/* 42 */            savedState3.f1603c = z;
/* 44 */            if (z) {
/* 46 */                View viewM821c1 = m821c1();
/* 63 */                savedState3.f1602b = this.f1588c0.mo946g() - this.f1588c0.mo941b(viewM821c1);
/* 69 */                savedState3.f1601a = AbstractC0133k.m974O(viewM821c1);
/* 71 */                return savedState3;
                    }
/* 72 */            View viewM822d1 = m822d1();
/* 80 */            savedState3.f1601a = AbstractC0133k.m974O(viewM822d1);
/* 95 */            savedState3.f1602b = this.f1588c0.mo944e(viewM822d1) - this.f1588c0.mo950k();
/* 97 */            return savedState3;
                }

                /* JADX INFO: renamed from: o1 */
                public final void m834o1(int i, int i2) {
/* 10 */            this.f1587b0.f1730c = this.f1588c0.mo946g() - i2;
/* 12 */            C0124b c0124b = this.f1587b0;
/* 22 */            c0124b.f1732e = this.f1591f0 ? -1 : 1;
/* 24 */            c0124b.f1731d = i;
/* 26 */            c0124b.f1733f = 1;
/* 28 */            c0124b.f1729b = i2;
/* 32 */            c0124b.f1734g = Integer.MIN_VALUE;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: p */
                public final boolean mo835p() {
                    return this.f1586a0 == 1;
                }

                /* JADX INFO: renamed from: p1 */
                public final void m836p1(int i, int i2) {
/* 11 */            this.f1587b0.f1730c = i2 - this.f1588c0.mo950k();
/* 13 */            C0124b c0124b = this.f1587b0;
/* 15 */            c0124b.f1731d = i;
/* 25 */            c0124b.f1732e = this.f1591f0 ? 1 : -1;
/* 27 */            c0124b.f1733f = -1;
/* 29 */            c0124b.f1729b = i2;
/* 33 */            c0124b.f1734g = Integer.MIN_VALUE;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: s */
                public final void mo837s(int i, int i2, y12 y12Var, C1771iw c1771iw) {
/* 3 */             if (this.f1586a0 != 0) {
/* 6 */                 i = i2;
                    }
/* 11 */            if (m986G() == 0 || i == 0) {
/* 37 */                return;
                    }
/* 16 */            m807R0();
/* 29 */            m831n1(i > 0 ? 1 : -1, Math.abs(i), true, y12Var);
/* 34 */            mo768M0(y12Var, this.f1587b0, c1771iw);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: t */
                public final void mo838t(int i, C1771iw c1771iw) {
                    boolean z;
                    int i2;
/* 1 */             SavedState savedState = this.f1596k0;
/* 5 */             if (savedState == null || (i2 = savedState.f1601a) < 0) {
/* 14 */                m826j1();
/* 17 */                z = this.f1591f0;
/* 19 */                i2 = this.f1594i0;
/* 21 */                if (i2 == -1) {
/* 28 */                    i2 = z ? i - 1 : 0;
                        }
                    } else {
/* 11 */                z = savedState.f1603c;
                    }
/* 29 */            int i3 = z ? -1 : 1;
/* 36 */            for (int i4 = 0; i4 < this.f1599n0 && i2 >= 0 && i2 < i; i4++) {
/* 42 */                c1771iw.m5583a(i2, 0);
/* 45 */                i2 += i3;
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: u */
                public final int mo839u(y12 y12Var) {
/* 1 */             return m803N0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: v */
                public int mo789v(y12 y12Var) {
/* 1 */             return m804O0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: w */
                public int mo791w(y12 y12Var) {
/* 1 */             return m805P0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: x */
                public final int mo840x(y12 y12Var) {
/* 1 */             return m803N0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: x0 */
                public int mo793x0(int i, y12 y12Var, C0134l c0134l) {
/* 4 */             if (this.f1586a0 == 1) {
/* 6 */                 return 0;
                    }
/* 8 */             return m827k1(i, y12Var, c0134l);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: y */
                public int mo795y(y12 y12Var) {
/* 1 */             return m804O0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: y0 */
                public final void mo841y0(int i) {
/* 1 */             this.f1594i0 = i;
/* 5 */             this.f1595j0 = Integer.MIN_VALUE;
/* 7 */             SavedState savedState = this.f1596k0;
/* 9 */             if (savedState != null) {
/* 12 */                savedState.f1601a = -1;
                    }
/* 14 */            m1003w0();
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: z */
                public int mo797z(y12 y12Var) {
/* 1 */             return m805P0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: z0 */
                public int mo798z0(int i, y12 y12Var, C0134l c0134l) {
/* 3 */             if (this.f1586a0 == 0) {
/* 5 */                 return 0;
                    }
/* 7 */             return m827k1(i, y12Var, c0134l);
                }

/* 76 */        public LinearLayoutManager(int i) {
/* 78 */            this.f1586a0 = 1;
/* 79 */            this.f1590e0 = false;
/* 80 */            this.f1591f0 = false;
/* 81 */            this.f1592g0 = false;
/* 82 */            this.f1593h0 = true;
/* 83 */            this.f1594i0 = -1;
/* 84 */            this.f1595j0 = Integer.MIN_VALUE;
/* 85 */            this.f1596k0 = null;
/* 86 */            this.f1597l0 = new C0123a();
/* 89 */            this.f1598m0 = new s71();
/* 90 */            this.f1599n0 = 2;
/* 91 */            this.f1600o0 = new int[2];
/* 92 */            m828l1(i);
/* 93 */            mo829m(null);
/* 94 */            if (this.f1590e0) {
/* 95 */                this.f1590e0 = false;
/* 96 */                m1003w0();
                    }
                }
            }
