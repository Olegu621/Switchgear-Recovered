            package com.google.android.flexbox;

            import android.content.Context;
            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.recyclerview.widget.AbstractC0133k;
            import androidx.recyclerview.widget.C0126d;
            import androidx.recyclerview.widget.C0127e;
            import androidx.recyclerview.widget.C0128f;
            import androidx.recyclerview.widget.C0134l;
            import androidx.recyclerview.widget.RecyclerView;
            import java.util.ArrayList;
            import java.util.List;
            import p000.AbstractC0886en;
            import p000.C0193bu;
            import p000.C0875ec;
            import p000.C1954n7;
            import p000.kj0;
            import p000.mj0;
            import p000.nj0;
            import p000.o12;
            import p000.pc0;
            import p000.ts0;
            import p000.w12;
            import p000.y12;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlexboxLayoutManager extends AbstractC0133k implements kj0, w12 {

                /* JADX INFO: renamed from: y0 */
                public static final Rect f3154y0 = new Rect();

                /* JADX INFO: renamed from: a0 */
                public int f3155a0;

                /* JADX INFO: renamed from: b0 */
                public final int f3156b0;

                /* JADX INFO: renamed from: c0 */
                public final int f3157c0;

                /* JADX INFO: renamed from: e0 */
                public boolean f3159e0;

                /* JADX INFO: renamed from: f0 */
                public boolean f3160f0;

                /* JADX INFO: renamed from: i0 */
                public C0134l f3163i0;

                /* JADX INFO: renamed from: j0 */
                public y12 f3164j0;

                /* JADX INFO: renamed from: k0 */
                public nj0 f3165k0;

                /* JADX INFO: renamed from: l0 */
                public final mj0 f3166l0;

                /* JADX INFO: renamed from: m0 */
                public pc0 f3167m0;

                /* JADX INFO: renamed from: n0 */
                public pc0 f3168n0;

                /* JADX INFO: renamed from: o0 */
                public SavedState f3169o0;

                /* JADX INFO: renamed from: p0 */
                public int f3170p0;

                /* JADX INFO: renamed from: q0 */
                public int f3171q0;

                /* JADX INFO: renamed from: r0 */
                public int f3172r0;

                /* JADX INFO: renamed from: s0 */
                public int f3173s0;

                /* JADX INFO: renamed from: t0 */
                public final SparseArray f3174t0;

                /* JADX INFO: renamed from: u0 */
                public final Context f3175u0;

                /* JADX INFO: renamed from: v0 */
                public View f3176v0;

                /* JADX INFO: renamed from: w0 */
                public int f3177w0;

                /* JADX INFO: renamed from: x0 */
                public final C1954n7 f3178x0;

                /* JADX INFO: renamed from: d0 */
                public final int f3158d0 = -1;

                /* JADX INFO: renamed from: g0 */
                public List f3161g0 = new ArrayList();

                /* JADX INFO: renamed from: h0 */
                public final C0313b f3162h0 = new C0313b(this);

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
                    public static final Parcelable.Creator<LayoutParams> CREATOR = new C0315d();

                    /* JADX INFO: renamed from: U */
                    public int f3179U;

                    /* JADX INFO: renamed from: V */
                    public int f3180V;

                    /* JADX INFO: renamed from: W */
                    public int f3181W;

                    /* JADX INFO: renamed from: X */
                    public boolean f3182X;

                    /* JADX INFO: renamed from: e */
                    public float f3183e;

                    /* JADX INFO: renamed from: f */
                    public float f3184f;

                    /* JADX INFO: renamed from: i */
                    public int f3185i;

                    /* JADX INFO: renamed from: v */
                    public float f3186v;

                    /* JADX INFO: renamed from: w */
                    public int f3187w;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 5 */                 this.f3183e = 0.0f;
/* 9 */                 this.f3184f = 1.0f;
/* 12 */                this.f3185i = -1;
/* 16 */                this.f3186v = -1.0f;
/* 21 */                this.f3180V = 16777215;
/* 23 */                this.f3181W = 16777215;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: E */
                    public final int mo1903E() {
/* 1 */                 return this.f3185i;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: H */
                    public final float mo1904H() {
/* 1 */                 return this.f3184f;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: H0 */
                    public final float mo1905H0() {
/* 1 */                 return this.f3186v;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: R */
                    public final int mo1906R() {
/* 1 */                 return this.f3187w;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: Y */
                    public final void mo1907Y(int i) {
/* 1 */                 this.f3187w = i;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: Y0 */
                    public final int mo1908Y0() {
/* 1 */                 return ((ViewGroup.MarginLayoutParams) this).rightMargin;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: Z */
                    public final int mo1909Z() {
/* 1 */                 return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: b1 */
                    public final int mo1910b1() {
/* 1 */                 return this.f3179U;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: d1 */
                    public final boolean mo1911d1() {
/* 1 */                 return this.f3182X;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
/* 1 */                 return 0;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: e0 */
                    public final int mo1912e0() {
/* 1 */                 return ((ViewGroup.MarginLayoutParams) this).leftMargin;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    public final int getHeight() {
/* 1 */                 return ((ViewGroup.MarginLayoutParams) this).height;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    public final int getOrder() {
/* 1 */                 return 1;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    public final int getWidth() {
/* 1 */                 return ((ViewGroup.MarginLayoutParams) this).width;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: i1 */
                    public final int mo1913i1() {
/* 1 */                 return this.f3181W;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: m0 */
                    public final int mo1914m0() {
/* 1 */                 return ((ViewGroup.MarginLayoutParams) this).topMargin;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: s0 */
                    public final void mo1915s0(int i) {
/* 1 */                 this.f3179U = i;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: v0 */
                    public final float mo1916v0() {
/* 1 */                 return this.f3183e;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 3 */                 parcel.writeFloat(this.f3183e);
/* 8 */                 parcel.writeFloat(this.f3184f);
/* 13 */                parcel.writeInt(this.f3185i);
/* 18 */                parcel.writeFloat(this.f3186v);
/* 23 */                parcel.writeInt(this.f3187w);
/* 28 */                parcel.writeInt(this.f3179U);
/* 33 */                parcel.writeInt(this.f3180V);
/* 38 */                parcel.writeInt(this.f3181W);
/* 43 */                parcel.writeByte(this.f3182X ? (byte) 1 : (byte) 0);
/* 48 */                parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
/* 53 */                parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
/* 58 */                parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
/* 63 */                parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
/* 68 */                parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
/* 73 */                parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: x1 */
                    public final int mo1917x1() {
/* 1 */                 return this.f3180V;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState implements Parcelable {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0316e();

                    /* JADX INFO: renamed from: a */
                    public int f3188a;

                    /* JADX INFO: renamed from: b */
                    public int f3189b;

                    @Override // android.os.Parcelable
                    public final int describeContents() {
/* 1 */                 return 0;
                    }

                    public final String toString() {
/* 5 */                 StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
/* 10 */                sb.append(this.f3188a);
/* 15 */                sb.append(", mAnchorOffset=");
/* 22 */                return AbstractC0886en.m3510n(sb, this.f3189b, '}');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 3 */                 parcel.writeInt(this.f3188a);
/* 8 */                 parcel.writeInt(this.f3189b);
                    }
                }

                public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
/* 23 */            mj0 mj0Var = new mj0(this);
/* 26 */            this.f3166l0 = mj0Var;
/* 28 */            this.f3170p0 = -1;
/* 32 */            this.f3171q0 = Integer.MIN_VALUE;
/* 34 */            this.f3172r0 = Integer.MIN_VALUE;
/* 36 */            this.f3173s0 = Integer.MIN_VALUE;
/* 43 */            this.f3174t0 = new SparseArray();
/* 45 */            this.f3177w0 = -1;
/* 53 */            this.f3178x0 = new C1954n7(3);
/* 55 */            o12 o12VarM975P = AbstractC0133k.m975P(context, attributeSet, i, i2);
/* 59 */            int i3 = o12VarM975P.f14586a;
/* 63 */            if (i3 != 0) {
/* 65 */                if (i3 == 1) {
/* 70 */                    if (o12VarM975P.f14588c) {
/* 72 */                        m1956b1(3);
                            } else {
/* 77 */                        m1956b1(2);
                            }
                        }
                    } else if (o12VarM975P.f14588c) {
/* 85 */                m1956b1(1);
                    } else {
/* 89 */                m1956b1(0);
                    }
/* 92 */            int i4 = this.f3156b0;
/* 94 */            if (i4 != 1) {
/* 96 */                if (i4 == 0) {
/* 99 */                    m998r0();
/* 104 */                   this.f3161g0.clear();
/* 107 */                   mj0.m6663b(mj0Var);
/* 110 */                   mj0Var.f13803d = 0;
                        }
/* 112 */               this.f3156b0 = 1;
/* 115 */               this.f3167m0 = null;
/* 117 */               this.f3168n0 = null;
/* 119 */               m1003w0();
                    }
/* 125 */           if (this.f3157c0 != 4) {
/* 127 */               m998r0();
/* 132 */               this.f3161g0.clear();
/* 135 */               mj0.m6663b(mj0Var);
/* 138 */               mj0Var.f13803d = 0;
/* 140 */               this.f3157c0 = 4;
/* 142 */               m1003w0();
                    }
/* 145 */           this.f3175u0 = context;
                }

                /* JADX INFO: renamed from: T */
                public static boolean m1939T(int i, int i2, int i3) {
/* 1 */             int mode = View.MeasureSpec.getMode(i2);
/* 5 */             int size = View.MeasureSpec.getSize(i2);
/* 10 */            if (i3 > 0 && i != i3) {
/* 9 */                 return false;
                    }
/* 18 */            if (mode == Integer.MIN_VALUE) {
                        return size >= i;
                    }
/* 20 */            if (mode != 0) {
                        return mode == 1073741824 && size == i;
                    }
/* 17 */            return true;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: C */
                public final RecyclerView.LayoutParams mo762C() {
/* 4 */             LayoutParams layoutParams = new LayoutParams(-2, -2);
/* 8 */             layoutParams.f3183e = 0.0f;
/* 12 */            layoutParams.f3184f = 1.0f;
/* 15 */            layoutParams.f3185i = -1;
/* 19 */            layoutParams.f3186v = -1.0f;
/* 24 */            layoutParams.f3180V = 16777215;
/* 26 */            layoutParams.f3181W = 16777215;
/* 28 */            return layoutParams;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: D */
                public final RecyclerView.LayoutParams mo764D(Context context, AttributeSet attributeSet) {
/* 3 */             return new LayoutParams(context, attributeSet);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: I0 */
                public final void mo801I0(RecyclerView recyclerView, int i) {
/* 7 */             C0126d c0126d = new C0126d(recyclerView.getContext());
/* 10 */            c0126d.f18902a = i;
/* 12 */            m988J0(c0126d);
                }

                /* JADX INFO: renamed from: L0 */
                public final int m1940L0(y12 y12Var) {
/* 5 */             if (m986G() == 0) {
/* 58 */                return 0;
                    }
/* 8 */             int iM10082b = y12Var.m10082b();
/* 12 */            m1943O0();
/* 15 */            View viewM1945Q0 = m1945Q0(iM10082b);
/* 19 */            View viewM1947S0 = m1947S0(iM10082b);
/* 27 */            if (y12Var.m10082b() == 0 || viewM1945Q0 == null || viewM1947S0 == null) {
/* 58 */                return 0;
                    }
/* 53 */            return Math.min(this.f3167m0.mo951l(), this.f3167m0.mo941b(viewM1947S0) - this.f3167m0.mo944e(viewM1945Q0));
                }

                /* JADX INFO: renamed from: M0 */
                public final int m1941M0(y12 y12Var) {
/* 5 */             if (m986G() == 0) {
/* 98 */                return 0;
                    }
/* 8 */             int iM10082b = y12Var.m10082b();
/* 12 */            View viewM1945Q0 = m1945Q0(iM10082b);
/* 16 */            View viewM1947S0 = m1947S0(iM10082b);
/* 24 */            if (y12Var.m10082b() == 0 || viewM1945Q0 == null || viewM1947S0 == null) {
/* 98 */                return 0;
                    }
/* 31 */            int iM974O = AbstractC0133k.m974O(viewM1945Q0);
/* 35 */            int iM974O2 = AbstractC0133k.m974O(viewM1947S0);
/* 52 */            int iAbs = Math.abs(this.f3167m0.mo941b(viewM1947S0) - this.f3167m0.mo944e(viewM1945Q0));
/* 58 */            int[] iArr = this.f3162h0.f3210c;
/* 60 */            int i = iArr[iM974O];
/* 62 */            if (i == 0 || i == -1) {
/* 98 */                return 0;
                    }
/* 93 */            return Math.round((i * (iAbs / ((iArr[iM974O2] - i) + 1))) + (this.f3167m0.mo950k() - this.f3167m0.mo944e(viewM1945Q0)));
                }

                /* JADX INFO: renamed from: N0 */
                public final int m1942N0(y12 y12Var) {
/* 6 */             if (m986G() != 0) {
/* 9 */                 int iM10082b = y12Var.m10082b();
/* 13 */                View viewM1945Q0 = m1945Q0(iM10082b);
/* 17 */                View viewM1947S0 = m1947S0(iM10082b);
/* 25 */                if (y12Var.m10082b() != 0 && viewM1945Q0 != null && viewM1947S0 != null) {
/* 36 */                    View viewM1949U0 = m1949U0(0, m986G());
/* 45 */                    int iM974O = viewM1949U0 == null ? -1 : AbstractC0133k.m974O(viewM1949U0);
/* 55 */                    View viewM1949U1 = m1949U0(m986G() - 1, -1);
/* 95 */                    return (int) ((Math.abs(this.f3167m0.mo941b(viewM1947S0) - this.f3167m0.mo944e(viewM1945Q0)) / (((viewM1949U1 != null ? AbstractC0133k.m974O(viewM1949U1) : -1) - iM974O) + 1)) * y12Var.m10082b());
                        }
                    }
/* 5 */             return 0;
                }

                /* JADX INFO: renamed from: O0 */
                public final void m1943O0() {
/* 3 */             if (this.f3167m0 != null) {
/* 5 */                 return;
                    }
/* 6 */             boolean zMo1927j = mo1927j();
/* 10 */            int i = this.f3156b0;
/* 12 */            if (zMo1927j) {
/* 14 */                if (i == 0) {
/* 21 */                    this.f3167m0 = new C0127e(this);
/* 28 */                    this.f3168n0 = new C0128f(this);
/* 30 */                    return;
                        } else {
/* 36 */                    this.f3167m0 = new C0128f(this);
/* 43 */                    this.f3168n0 = new C0127e(this);
/* 45 */                    return;
                        }
                    }
/* 46 */            if (i == 0) {
/* 53 */                this.f3167m0 = new C0128f(this);
/* 60 */                this.f3168n0 = new C0127e(this);
                    } else {
/* 68 */                this.f3167m0 = new C0127e(this);
/* 75 */                this.f3168n0 = new C0128f(this);
                    }
                }

                /* JADX INFO: renamed from: P0 */
                public final int m1944P0(C0134l c0134l, y12 y12Var, nj0 nj0Var) {
                    int i;
                    int i2;
                    boolean z;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    Rect rect;
                    int i7;
                    int i8;
                    int i9;
                    Rect rect2;
/* 7 */             int i10 = nj0Var.f14302f;
/* 11 */            if (i10 != Integer.MIN_VALUE) {
/* 13 */                int i11 = nj0Var.f14297a;
/* 15 */                if (i11 < 0) {
/* 18 */                    nj0Var.f14302f = i10 + i11;
                        }
/* 20 */                m1955a1(c0134l, nj0Var);
                    }
/* 23 */            int i12 = nj0Var.f14297a;
/* 25 */            boolean zMo1927j = mo1927j();
/* 29 */            int i13 = i12;
/* 30 */            int i14 = 0;
                    while (true) {
/* 31 */                if (i13 <= 0 && !this.f3165k0.f14298b) {
                            break;
                        }
/* 44 */                List list = this.f3161g0;
/* 46 */                int i15 = nj0Var.f14300d;
/* 48 */                if (i15 < 0 || i15 >= y12Var.m10082b() || (i = nj0Var.f14299c) < 0 || i >= list.size()) {
                            break;
                        }
/* 75 */                C0312a c0312a = (C0312a) this.f3161g0.get(nj0Var.f14299c);
/* 79 */                nj0Var.f14300d = c0312a.f3204o;
/* 81 */                boolean zMo1927j2 = mo1927j();
/* 88 */                mj0 mj0Var = this.f3166l0;
/* 90 */                Rect rect3 = f3154y0;
/* 92 */                C0313b c0313b = this.f3162h0;
/* 94 */                if (zMo1927j2) {
/* 96 */                    int paddingLeft = getPaddingLeft();
/* 100 */                   int paddingRight = getPaddingRight();
/* 104 */                   int i16 = this.f1757Y;
/* 106 */                   int i17 = nj0Var.f14301e;
/* 110 */                   if (nj0Var.f14304h == -1) {
/* 114 */                       i17 -= c0312a.f3196g;
                            }
/* 115 */                   int i18 = i17;
/* 117 */                   int i19 = nj0Var.f14300d;
/* 123 */                   float f = mj0Var.f13803d;
/* 126 */                   float f2 = paddingLeft - f;
/* 127 */                   float measuredWidth = (i16 - paddingRight) - f;
/* 129 */                   float fMax = Math.max(0.0f, 0.0f);
/* 133 */                   int i20 = c0312a.f3197h;
/* 135 */                   int i21 = i19;
/* 136 */                   int i22 = 0;
/* 140 */                   while (i21 < i19 + i20) {
/* 142 */                       int i23 = i20;
/* 143 */                       View viewMo1924g = mo1924g(i21);
/* 147 */                       if (viewMo1924g == null) {
/* 155 */                           i19 = i19;
/* 157 */                           i9 = i21;
/* 158 */                           rect2 = rect3;
                                } else {
/* 170 */                           if (nj0Var.f14304h == 1) {
/* 172 */                               m996n(rect3, viewMo1924g);
/* 177 */                               m995l(-1, viewMo1924g, false);
                                    } else {
/* 183 */                               m996n(rect3, viewMo1924g);
/* 186 */                               int i24 = i22;
/* 188 */                               m995l(i24, viewMo1924g, false);
/* 191 */                               i22 = i24 + 1;
                                    }
/* 195 */                           float f3 = measuredWidth;
/* 197 */                           long j = c0313b.f3211d[i21];
/* 199 */                           int i25 = (int) j;
/* 202 */                           int i26 = (int) (j >> 32);
/* 207 */                           LayoutParams layoutParams = (LayoutParams) viewMo1924g.getLayoutParams();
/* 213 */                           if (m1957c1(viewMo1924g, i25, i26, layoutParams)) {
/* 215 */                               viewMo1924g.measure(i25, i26);
                                    }
/* 232 */                           float f4 = f2 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((RecyclerView.LayoutParams) viewMo1924g.getLayoutParams()).f1682b.left;
/* 247 */                           float f5 = f3 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((RecyclerView.LayoutParams) viewMo1924g.getLayoutParams()).f1682b.right);
/* 259 */                           int i27 = i18 + ((RecyclerView.LayoutParams) viewMo1924g.getLayoutParams()).f1682b.top;
/* 263 */                           boolean z2 = this.f3159e0;
/* 267 */                           C0313b c0313b2 = this.f3162h0;
/* 269 */                           if (z2) {
/* 279 */                               int iRound = Math.round(f5) - viewMo1924g.getMeasuredWidth();
/* 281 */                               Rect rect4 = rect3;
/* 283 */                               int iRound2 = Math.round(f5);
/* 291 */                               int measuredHeight = viewMo1924g.getMeasuredHeight() + i27;
/* 296 */                               i9 = i21;
/* 300 */                               rect2 = rect4;
/* 306 */                               c0313b2.m1978o(viewMo1924g, c0312a, iRound, i27, iRound2, measuredHeight);
                                    } else {
/* 312 */                               i9 = i21;
/* 315 */                               rect2 = rect3;
/* 338 */                               c0313b2.m1978o(viewMo1924g, c0312a, Math.round(f4), i27, viewMo1924g.getMeasuredWidth() + Math.round(f4), viewMo1924g.getMeasuredHeight() + i27);
                                    }
/* 362 */                           float measuredWidth2 = viewMo1924g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((RecyclerView.LayoutParams) viewMo1924g.getLayoutParams()).f1682b.right + fMax + f4;
/* 384 */                           measuredWidth = f5 - (((viewMo1924g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((RecyclerView.LayoutParams) viewMo1924g.getLayoutParams()).f1682b.left) + fMax);
/* 386 */                           f2 = measuredWidth2;
                                }
/* 387 */                       i21 = i9 + 1;
/* 389 */                       i19 = i19;
/* 391 */                       i12 = i12;
/* 393 */                       zMo1927j = zMo1927j;
/* 395 */                       i20 = i23;
/* 397 */                       rect3 = rect2;
                            }
/* 401 */                   i2 = i12;
/* 403 */                   z = zMo1927j;
/* 412 */                   nj0Var.f14299c += this.f3165k0.f14304h;
/* 414 */                   i6 = c0312a.f3196g;
/* 416 */                   i5 = i13;
                        } else {
/* 420 */                   i2 = i12;
/* 422 */                   z = zMo1927j;
/* 425 */                   Rect rect5 = rect3;
/* 427 */                   int paddingTop = getPaddingTop();
/* 431 */                   int paddingBottom = getPaddingBottom();
/* 435 */                   int i28 = this.f1758Z;
/* 437 */                   int i29 = nj0Var.f14301e;
/* 441 */                   if (nj0Var.f14304h == -1) {
/* 443 */                       int i30 = c0312a.f3196g;
/* 447 */                       i4 = i29 + i30;
/* 445 */                       i3 = i29 - i30;
                            } else {
/* 453 */                       i3 = i29;
/* 455 */                       i4 = i3;
                            }
/* 457 */                   int i31 = nj0Var.f14300d;
/* 460 */                   float f6 = i28 - paddingBottom;
/* 462 */                   float f7 = mj0Var.f13803d;
/* 465 */                   float f8 = paddingTop - f7;
/* 466 */                   float f9 = f6 - f7;
/* 468 */                   float fMax2 = Math.max(0.0f, 0.0f);
/* 472 */                   int i32 = c0312a.f3197h;
/* 474 */                   float measuredHeight2 = f9;
/* 475 */                   int i33 = i31;
/* 476 */                   int i34 = 0;
/* 479 */                   while (i33 < i31 + i32) {
/* 481 */                       int i35 = i32;
/* 482 */                       View viewMo1924g2 = mo1924g(i33);
/* 486 */                       if (viewMo1924g2 == null) {
/* 490 */                           i13 = i13;
/* 494 */                           i7 = i33;
/* 496 */                           rect = rect5;
/* 500 */                           i8 = i35;
                                } else {
/* 508 */                           float f10 = f8;
/* 510 */                           long j2 = c0313b.f3211d[i33];
/* 512 */                           int i36 = (int) j2;
/* 515 */                           int i37 = (int) (j2 >> 32);
/* 520 */                           LayoutParams layoutParams2 = (LayoutParams) viewMo1924g2.getLayoutParams();
/* 526 */                           if (m1957c1(viewMo1924g2, i36, i37, layoutParams2)) {
/* 528 */                               viewMo1924g2.measure(i36, i37);
                                    }
/* 545 */                           float f11 = f10 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((RecyclerView.LayoutParams) viewMo1924g2.getLayoutParams()).f1682b.top;
/* 565 */                           float f12 = measuredHeight2 - (((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + ((RecyclerView.LayoutParams) viewMo1924g2.getLayoutParams()).f1682b.bottom);
/* 570 */                           if (nj0Var.f14304h == 1) {
/* 572 */                               rect = rect5;
/* 574 */                               m996n(rect, viewMo1924g2);
/* 583 */                               m995l(-1, viewMo1924g2, false);
                                    } else {
/* 591 */                               rect = rect5;
/* 595 */                               m996n(rect, viewMo1924g2);
/* 598 */                               m995l(i34, viewMo1924g2, false);
/* 601 */                               i34++;
                                    }
/* 615 */                           int i38 = i3 + ((RecyclerView.LayoutParams) viewMo1924g2.getLayoutParams()).f1682b.left;
/* 629 */                           int i39 = i4 - ((RecyclerView.LayoutParams) viewMo1924g2.getLayoutParams()).f1682b.right;
/* 633 */                           boolean z3 = this.f3159e0;
/* 635 */                           boolean z4 = this.f3160f0;
/* 639 */                           C0313b c0313b3 = this.f3162h0;
/* 641 */                           if (!z3) {
/* 709 */                               i7 = i33;
/* 711 */                               i8 = i35;
/* 715 */                               if (z4) {
/* 738 */                                   c0313b3.m1979p(viewMo1924g2, c0312a, z3, i38, Math.round(f12) - viewMo1924g2.getMeasuredHeight(), viewMo1924g2.getMeasuredWidth() + i38, Math.round(f12));
                                        } else {
/* 763 */                                   c0313b3.m1979p(viewMo1924g2, c0312a, z3, i38, Math.round(f11), viewMo1924g2.getMeasuredWidth() + i38, viewMo1924g2.getMeasuredHeight() + Math.round(f11));
                                        }
                                    } else if (z4) {
/* 667 */                               i7 = i33;
/* 672 */                               i8 = i35;
/* 675 */                               c0313b3.m1979p(viewMo1924g2, c0312a, z3, i39 - viewMo1924g2.getMeasuredWidth(), Math.round(f12) - viewMo1924g2.getMeasuredHeight(), i39, Math.round(f12));
                                    } else {
/* 679 */                               i7 = i33;
/* 681 */                               i8 = i35;
/* 705 */                               c0313b3.m1979p(viewMo1924g2, c0312a, z3, i39 - viewMo1924g2.getMeasuredWidth(), Math.round(f11), i39, viewMo1924g2.getMeasuredHeight() + Math.round(f11));
                                    }
/* 786 */                           float measuredHeight3 = viewMo1924g2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((RecyclerView.LayoutParams) viewMo1924g2.getLayoutParams()).f1682b.bottom + fMax2 + f11;
/* 808 */                           measuredHeight2 = f12 - (((viewMo1924g2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) + ((RecyclerView.LayoutParams) viewMo1924g2.getLayoutParams()).f1682b.top) + fMax2);
/* 811 */                           f8 = measuredHeight3;
                                }
/* 812 */                       i33 = i7 + 1;
/* 814 */                       i13 = i13;
/* 816 */                       i31 = i31;
/* 818 */                       i32 = i8;
/* 821 */                       rect5 = rect;
/* 823 */                       c0313b = c0313b;
                            }
/* 827 */                   i5 = i13;
/* 836 */                   nj0Var.f14299c += this.f3165k0.f14304h;
/* 838 */                   i6 = c0312a.f3196g;
                        }
/* 840 */               i14 += i6;
/* 841 */               if (z || !this.f3159e0) {
/* 866 */                   nj0Var.f14301e += c0312a.f3196g * nj0Var.f14304h;
                        } else {
/* 855 */                   nj0Var.f14301e -= c0312a.f3196g * nj0Var.f14304h;
                        }
/* 870 */               i13 = i5 - c0312a.f3196g;
/* 872 */               i12 = i2;
/* 874 */               zMo1927j = z;
                    }
/* 40 */            int i40 = i12;
/* 882 */           int i41 = nj0Var.f14297a - i14;
/* 883 */           nj0Var.f14297a = i41;
/* 885 */           int i42 = nj0Var.f14302f;
/* 889 */           if (i42 != Integer.MIN_VALUE) {
/* 891 */               int i43 = i42 + i14;
/* 892 */               nj0Var.f14302f = i43;
/* 894 */               if (i41 < 0) {
/* 897 */                   nj0Var.f14302f = i43 + i41;
                        }
/* 899 */               m1955a1(c0134l, nj0Var);
                    }
/* 904 */           return i40 - nj0Var.f14297a;
                }

                /* JADX INFO: renamed from: Q0 */
                public final View m1945Q0(int i) {
/* 6 */             View viewM1950V0 = m1950V0(0, m986G(), i);
/* 10 */            if (viewM1950V0 == null) {
/* 26 */                return null;
                    }
/* 21 */            int i2 = this.f3162h0.f3210c[AbstractC0133k.m974O(viewM1950V0)];
/* 24 */            if (i2 == -1) {
/* 26 */                return null;
                    }
/* 36 */            return m1946R0(viewM1950V0, (C0312a) this.f3161g0.get(i2));
                }

                /* JADX WARN: Code duplicated, block: B:17:0x003b  */
                /* JADX INFO: renamed from: R0 */
                public final View m1946R0(View view, C0312a c0312a) {
/* 1 */             boolean zMo1927j = mo1927j();
/* 5 */             int i = c0312a.f3197h;
/* 8 */             for (int i2 = 1; i2 < i; i2++) {
/* 10 */                View viewM984F = m984F(i2);
/* 14 */                if (viewM984F != null && viewM984F.getVisibility() != 8) {
/* 27 */                    if (!this.f3159e0 || zMo1927j) {
/* 58 */                        if (this.f3167m0.mo944e(view) > this.f3167m0.mo944e(viewM984F)) {
/* 60 */                            view = viewM984F;
                                }
                            } else if (this.f3167m0.mo941b(view) < this.f3167m0.mo941b(viewM984F)) {
/* 60 */                        view = viewM984F;
                            }
                        }
                    }
/* 64 */            return view;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: S */
                public final boolean mo808S() {
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: S0 */
                public final View m1947S0(int i) {
/* 8 */             View viewM1950V0 = m1950V0(m986G() - 1, -1, i);
/* 12 */            if (viewM1950V0 == null) {
/* 14 */                return null;
                    }
/* 34 */            return m1948T0(viewM1950V0, (C0312a) this.f3161g0.get(this.f3162h0.f3210c[AbstractC0133k.m974O(viewM1950V0)]));
                }

                /* JADX WARN: Code duplicated, block: B:17:0x0047  */
                /* JADX INFO: renamed from: T0 */
                public final View m1948T0(View view, C0312a c0312a) {
/* 1 */             boolean zMo1927j = mo1927j();
/* 18 */            int iM986G = (m986G() - c0312a.f3197h) - 1;
/* 20 */            for (int iM986G2 = m986G() - 2; iM986G2 > iM986G; iM986G2--) {
/* 22 */                View viewM984F = m984F(iM986G2);
/* 26 */                if (viewM984F != null && viewM984F.getVisibility() != 8) {
/* 39 */                    if (!this.f3159e0 || zMo1927j) {
/* 70 */                        if (this.f3167m0.mo941b(view) < this.f3167m0.mo941b(viewM984F)) {
/* 72 */                            view = viewM984F;
                                }
                            } else if (this.f3167m0.mo944e(view) > this.f3167m0.mo944e(viewM984F)) {
/* 72 */                        view = viewM984F;
                            }
                        }
                    }
/* 76 */            return view;
                }

                /* JADX INFO: renamed from: U0 */
                public final View m1949U0(int i, int i2) {
/* 6 */             int i3 = i2 > i ? 1 : -1;
/* 7 */             while (i != i2) {
/* 9 */                 View viewM984F = m984F(i);
/* 13 */                int paddingLeft = getPaddingLeft();
/* 17 */                int paddingTop = getPaddingTop();
/* 27 */                int paddingRight = this.f1757Y - getPaddingRight();
/* 34 */                int paddingBottom = this.f1758Z - getPaddingBottom();
/* 47 */                int iM971K = AbstractC0133k.m971K(viewM984F) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) viewM984F.getLayoutParams())).leftMargin;
/* 60 */                int iM973M = AbstractC0133k.m973M(viewM984F) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) viewM984F.getLayoutParams())).topMargin;
/* 73 */                int iM972L = AbstractC0133k.m972L(viewM984F) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) viewM984F.getLayoutParams())).rightMargin;
/* 86 */                int iM970J = AbstractC0133k.m970J(viewM984F) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) viewM984F.getLayoutParams())).bottomMargin;
/* 95 */                boolean z = iM971K >= paddingRight || iM972L >= paddingLeft;
/* 96 */                boolean z2 = iM973M >= paddingBottom || iM970J >= paddingTop;
/* 101 */               if (z && z2) {
/* 105 */                   return viewM984F;
                        }
/* 106 */               i += i3;
                    }
/* 108 */           return null;
                }

                /* JADX INFO: renamed from: V0 */
                public final View m1950V0(int i, int i2, int i3) {
                    int iM974O;
/* 1 */             m1943O0();
/* 7 */             if (this.f3165k0 == null) {
/* 11 */                nj0 nj0Var = new nj0();
/* 14 */                nj0Var.f14304h = 1;
/* 16 */                this.f3165k0 = nj0Var;
                    }
/* 20 */            int iMo950k = this.f3167m0.mo950k();
/* 26 */            int iMo946g = this.f3167m0.mo946g();
/* 30 */            int i4 = i2 <= i ? -1 : 1;
/* 34 */            View view = null;
/* 35 */            View view2 = null;
/* 36 */            while (i != i2) {
/* 38 */                View viewM984F = m984F(i);
/* 42 */                if (viewM984F != null && (iM974O = AbstractC0133k.m974O(viewM984F)) >= 0 && iM974O < i3) {
/* 65 */                    if (((RecyclerView.LayoutParams) viewM984F.getLayoutParams()).f1681a.m1024h()) {
/* 67 */                        if (view2 == null) {
/* 69 */                            view2 = viewM984F;
                                }
                            } else {
/* 77 */                        if (this.f3167m0.mo944e(viewM984F) >= iMo950k && this.f3167m0.mo941b(viewM984F) <= iMo946g) {
/* 88 */                            return viewM984F;
                                }
/* 89 */                        if (view == null) {
/* 91 */                            view = viewM984F;
                                }
                            }
                        }
/* 92 */                i += i4;
                    }
                    return view != null ? view : view2;
                }

                /* JADX INFO: renamed from: W0 */
                public final int m1951W0(int i, C0134l c0134l, y12 y12Var, boolean z) {
                    int iM1953Y0;
                    int iMo946g;
/* 5 */             if (mo1927j() || !this.f3159e0) {
/* 32 */                int iMo946g2 = this.f3167m0.mo946g() - i;
/* 33 */                if (iMo946g2 <= 0) {
/* 61 */                    return 0;
                        }
/* 40 */                iM1953Y0 = -m1953Y0(-iMo946g2, y12Var, c0134l);
                    } else {
/* 17 */                int iMo950k = i - this.f3167m0.mo950k();
/* 19 */                if (iMo950k <= 0) {
/* 61 */                    return 0;
                        }
/* 21 */                iM1953Y0 = m1953Y0(iMo950k, y12Var, c0134l);
                    }
/* 41 */            int i2 = i + iM1953Y0;
/* 42 */            if (!z || (iMo946g = this.f3167m0.mo946g() - i2) <= 0) {
/* 60 */                return iM1953Y0;
                    }
/* 55 */            this.f3167m0.mo954p(iMo946g);
/* 58 */            return iMo946g + iM1953Y0;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: X */
                public final void mo916X() {
/* 1 */             m998r0();
                }

                /* JADX INFO: renamed from: X0 */
                public final int m1952X0(int i, C0134l c0134l, y12 y12Var, boolean z) {
                    int iM1953Y0;
                    int iMo950k;
/* 5 */             if (mo1927j() || !this.f3159e0) {
/* 32 */                int iMo950k2 = i - this.f3167m0.mo950k();
/* 34 */                if (iMo950k2 <= 0) {
/* 61 */                    return 0;
                        }
/* 40 */                iM1953Y0 = -m1953Y0(iMo950k2, y12Var, c0134l);
                    } else {
/* 17 */                int iMo946g = this.f3167m0.mo946g() - i;
/* 18 */                if (iMo946g <= 0) {
/* 61 */                    return 0;
                        }
/* 21 */                iM1953Y0 = m1953Y0(-iMo946g, y12Var, c0134l);
                    }
/* 41 */            int i2 = i + iM1953Y0;
/* 42 */            if (!z || (iMo950k = i2 - this.f3167m0.mo950k()) <= 0) {
/* 60 */                return iM1953Y0;
                    }
/* 56 */            this.f3167m0.mo954p(-iMo950k);
/* 59 */            return iM1953Y0 - iMo950k;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: Y */
                public final void mo991Y(RecyclerView recyclerView) {
/* 7 */             this.f3176v0 = (View) recyclerView.getParent();
                }

                /* JADX WARN: Code duplicated, block: B:75:0x01e7  */
                /* JADX INFO: renamed from: Y0 */
                public final int m1953Y0(int i, y12 y12Var, C0134l c0134l) {
                    int i2;
/* 8 */             if (m986G() != 0 && i != 0) {
/* 14 */                m1943O0();
/* 20 */                this.f3165k0.f14305i = true;
/* 34 */                boolean z = !mo1927j() && this.f3159e0;
/* 42 */                int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
/* 47 */                int iAbs = Math.abs(i);
/* 53 */                this.f3165k0.f14304h = i3;
/* 55 */                boolean zMo1927j = mo1927j();
/* 63 */                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1757Y, this.f1755W);
/* 71 */                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f1758Z, this.f1756X);
/* 83 */                boolean z2 = !zMo1927j && this.f3159e0;
/* 84 */                C0313b c0313b = this.f3162h0;
/* 86 */                if (i3 == 1) {
/* 93 */                    View viewM984F = m984F(m986G() - 1);
/* 97 */                    if (viewM984F != null) {
/* 109 */                       this.f3165k0.f14301e = this.f3167m0.mo941b(viewM984F);
/* 111 */                       int iM974O = AbstractC0133k.m974O(viewM984F);
/* 127 */                       View viewM1948T0 = m1948T0(viewM984F, (C0312a) this.f3161g0.get(c0313b.f3210c[iM974O]));
/* 131 */                       nj0 nj0Var = this.f3165k0;
/* 133 */                       nj0Var.getClass();
/* 136 */                       int i4 = iM974O + 1;
/* 137 */                       nj0Var.f14300d = i4;
/* 139 */                       int[] iArr = c0313b.f3210c;
/* 144 */                       if (iArr.length <= i4) {
/* 146 */                           nj0Var.f14299c = -1;
                                } else {
/* 151 */                           nj0Var.f14299c = iArr[i4];
                                }
/* 153 */                       pc0 pc0Var = this.f3167m0;
/* 155 */                       if (z2) {
/* 161 */                           nj0Var.f14301e = pc0Var.mo944e(viewM1948T0);
/* 179 */                           this.f3165k0.f14302f = this.f3167m0.mo950k() + (-this.f3167m0.mo944e(viewM1948T0));
/* 181 */                           nj0 nj0Var2 = this.f3165k0;
/* 189 */                           nj0Var2.f14302f = Math.max(nj0Var2.f14302f, 0);
                                } else {
/* 196 */                           nj0Var.f14301e = pc0Var.mo941b(viewM1948T0);
/* 213 */                           this.f3165k0.f14302f = this.f3167m0.mo941b(viewM1948T0) - this.f3167m0.mo946g();
                                }
/* 217 */                       int i5 = this.f3165k0.f14299c;
/* 219 */                       if ((i5 == -1 || i5 > this.f3161g0.size() - 1) && this.f3165k0.f14300d <= this.f3164j0.m10082b()) {
/* 243 */                           nj0 nj0Var3 = this.f3165k0;
/* 247 */                           int i6 = iAbs - nj0Var3.f14302f;
/* 250 */                           C1954n7 c1954n7 = this.f3178x0;
/* 252 */                           c1954n7.f14152c = null;
/* 254 */                           c1954n7.f14151b = 0;
/* 256 */                           if (i6 > 0) {
/* 258 */                               C0313b c0313b2 = this.f3162h0;
/* 260 */                               if (zMo1927j) {
/* 270 */                                   c0313b2.m1966b(c1954n7, iMakeMeasureSpec, iMakeMeasureSpec2, i6, nj0Var3.f14300d, -1, this.f3161g0);
                                        } else {
/* 287 */                                   c0313b2.m1966b(c1954n7, iMakeMeasureSpec2, iMakeMeasureSpec, i6, nj0Var3.f14300d, -1, this.f3161g0);
/* 292 */                                   iMakeMeasureSpec2 = iMakeMeasureSpec2;
/* 293 */                                   iMakeMeasureSpec = iMakeMeasureSpec;
                                        }
/* 299 */                               c0313b.m1971h(iMakeMeasureSpec, iMakeMeasureSpec2, this.f3165k0.f14300d);
/* 306 */                               c0313b.m1983u(this.f3165k0.f14300d);
                                    }
                                }
/* 457 */                       nj0 nj0Var4 = this.f3165k0;
/* 463 */                       nj0Var4.f14297a = iAbs - nj0Var4.f14302f;
                            }
                        } else {
/* 313 */                   View viewM984F2 = m984F(0);
/* 317 */                   if (viewM984F2 != null) {
/* 329 */                       this.f3165k0.f14301e = this.f3167m0.mo944e(viewM984F2);
/* 331 */                       int iM974O2 = AbstractC0133k.m974O(viewM984F2);
/* 347 */                       View viewM1946R0 = m1946R0(viewM984F2, (C0312a) this.f3161g0.get(c0313b.f3210c[iM974O2]));
/* 351 */                       nj0 nj0Var5 = this.f3165k0;
/* 353 */                       nj0Var5.getClass();
/* 358 */                       int i7 = c0313b.f3210c[iM974O2];
/* 360 */                       if (i7 == -1) {
/* 362 */                           i7 = 0;
                                }
/* 363 */                       if (i7 > 0) {
/* 380 */                           this.f3165k0.f14300d = iM974O2 - ((C0312a) this.f3161g0.get(i7 - 1)).f3197h;
                                } else {
/* 383 */                           nj0Var5.f14300d = -1;
                                }
/* 385 */                       nj0 nj0Var6 = this.f3165k0;
/* 393 */                       nj0Var6.f14299c = i7 > 0 ? i7 - 1 : 0;
/* 395 */                       pc0 pc0Var2 = this.f3167m0;
/* 397 */                       if (z2) {
/* 403 */                           nj0Var6.f14301e = pc0Var2.mo941b(viewM1946R0);
/* 420 */                           this.f3165k0.f14302f = this.f3167m0.mo941b(viewM1946R0) - this.f3167m0.mo946g();
/* 422 */                           nj0 nj0Var7 = this.f3165k0;
/* 430 */                           nj0Var7.f14302f = Math.max(nj0Var7.f14302f, 0);
                                } else {
/* 437 */                           nj0Var6.f14301e = pc0Var2.mo944e(viewM1946R0);
/* 455 */                           this.f3165k0.f14302f = this.f3167m0.mo950k() + (-this.f3167m0.mo944e(viewM1946R0));
                                }
/* 457 */                       nj0 nj0Var8 = this.f3165k0;
/* 463 */                       nj0Var8.f14297a = iAbs - nj0Var8.f14302f;
                            }
                        }
/* 465 */               nj0 nj0Var9 = this.f3165k0;
/* 477 */               int iM1944P0 = m1944P0(c0134l, y12Var, nj0Var9) + nj0Var9.f14302f;
/* 478 */               if (iM1944P0 >= 0) {
/* 481 */                   if (z) {
/* 483 */                       if (iAbs > iM1944P0) {
/* 486 */                           i2 = (-i3) * iM1944P0;
                                } else {
/* 488 */                           i2 = i;
                                }
                            } else if (iAbs > iM1944P0) {
/* 493 */                       i2 = i3 * iM1944P0;
                            } else {
/* 488 */                       i2 = i;
                            }
/* 498 */                   this.f3167m0.mo954p(-i2);
/* 503 */                   this.f3165k0.f14303g = i2;
/* 505 */                   return i2;
                        }
                    }
/* 7 */             return 0;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: Z */
                public final void mo816Z(RecyclerView recyclerView) {
                }

                /* JADX INFO: renamed from: Z0 */
                public final int m1954Z0(int i) {
/* 5 */             if (m986G() == 0 || i == 0) {
/* 90 */                return 0;
                    }
/* 10 */            m1943O0();
/* 13 */            boolean zMo1927j = mo1927j();
/* 17 */            View view = this.f3176v0;
/* 26 */            int width = zMo1927j ? view.getWidth() : view.getHeight();
/* 35 */            int i2 = zMo1927j ? this.f1757Y : this.f1758Z;
/* 37 */            int iM989N = m989N();
/* 42 */            mj0 mj0Var = this.f3166l0;
/* 44 */            if (iM989N == 1) {
/* 46 */                int iAbs = Math.abs(i);
/* 50 */                if (i < 0) {
/* 60 */                    return -Math.min((i2 + mj0Var.f13803d) - width, iAbs);
                        }
/* 62 */                int i3 = mj0Var.f13803d;
/* 66 */                if (i3 + i > 0) {
/* 68 */                    return -i3;
                        }
                    } else {
/* 70 */                if (i > 0) {
/* 76 */                    return Math.min((i2 - mj0Var.f13803d) - width, i);
                        }
/* 81 */                int i4 = mj0Var.f13803d;
/* 85 */                if (i4 + i < 0) {
/* 88 */                    return -i4;
                        }
                    }
/* 87 */            return i;
                }

                @Override // p000.w12
                /* JADX INFO: renamed from: a */
                public final PointF mo817a(int i) {
                    View viewM984F;
/* 5 */             if (m986G() == 0 || (viewM984F = m984F(0)) == null) {
/* 15 */                return null;
                    }
/* 25 */            int i2 = i < AbstractC0133k.m974O(viewM984F) ? -1 : 1;
                    return mo1927j() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
                }

                /* JADX WARN: Code duplicated, block: B:108:0x0134 A[EDGE_INSN: B:108:0x0134->B:117:? BREAK  A[LOOP:2: B:61:0x00e3->B:80:0x0130], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:111:0x0130 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:32:0x0067  */
                /* JADX WARN: Code duplicated, block: B:34:0x006f A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:36:0x0073  */
                /* JADX WARN: Code duplicated, block: B:74:0x0110  */
                /* JADX WARN: Code duplicated, block: B:76:0x0118  */
                /* JADX WARN: Code duplicated, block: B:79:0x0123  */
                /* JADX WARN: Code duplicated, block: B:94:0x0071 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:99:0x0080 A[SYNTHETIC] */
                /* JADX INFO: renamed from: a1 */
                public final void m1955a1(C0134l c0134l, nj0 nj0Var) {
                    int iM986G;
                    int i;
                    int iM986G2;
                    int i2;
                    View viewM984F;
                    int i3;
/* 3 */             if (nj0Var.f14305i) {
/* 7 */                 int i4 = nj0Var.f14304h;
/* 9 */                 int i5 = nj0Var.f14302f;
/* 11 */                C0313b c0313b = this.f3162h0;
/* 13 */                int i6 = -1;
/* 14 */                if (i4 == -1) {
/* 16 */                    if (i5 < 0 || (iM986G2 = m986G()) == 0 || (viewM984F = m984F((i2 = iM986G2 - 1))) == null || (i3 = c0313b.f3210c[AbstractC0133k.m974O(viewM984F)]) == -1) {
/* 364 */                       return;
                            }
/* 56 */                    C0312a c0312a = (C0312a) this.f3161g0.get(i3);
/* 59 */                    for (int i7 = i2; i7 >= 0; i7--) {
/* 61 */                        View viewM984F2 = m984F(i7);
/* 65 */                        if (viewM984F2 != null) {
/* 68 */                            int i8 = nj0Var.f14302f;
/* 74 */                            if (!mo1927j() && this.f3159e0) {
/* 86 */                                if (this.f3167m0.mo941b(viewM984F2) > i8) {
                                            break;
                                        }
/* 110 */                               if (c0312a.f3204o != AbstractC0133k.m974O(viewM984F2)) {
                                            continue;
                                        } else if (i3 <= 0) {
/* 114 */                                   iM986G2 = i7;
                                            break;
                                        } else {
/* 118 */                                   i3 += nj0Var.f14304h;
/* 125 */                                   c0312a = (C0312a) this.f3161g0.get(i3);
/* 128 */                                   iM986G2 = i7;
                                        }
                                    } else {
/* 102 */                               if (this.f3167m0.mo944e(viewM984F2) < this.f3167m0.mo945f() - i8) {
                                            break;
                                        }
/* 110 */                               if (c0312a.f3204o != AbstractC0133k.m974O(viewM984F2)) {
                                            continue;
                                        } else if (i3 <= 0) {
/* 114 */                                   iM986G2 = i7;
                                            break;
                                        } else {
/* 118 */                                   i3 += nj0Var.f14304h;
/* 125 */                                   c0312a = (C0312a) this.f3161g0.get(i3);
/* 128 */                                   iM986G2 = i7;
                                        }
                                    }
                                }
                            }
/* 132 */                   while (i2 >= iM986G2) {
/* 134 */                       View viewM984F3 = m984F(i2);
/* 142 */                       if (m984F(i2) != null) {
/* 144 */                           C0875ec c0875ec = this.f1759a;
/* 146 */                           int iM3397x = c0875ec.m3397x(i2);
/* 152 */                           ts0 ts0Var = (ts0) c0875ec.f7613b;
/* 158 */                           View childAt = ((RecyclerView) ts0Var.f17248a).getChildAt(iM3397x);
/* 162 */                           if (childAt != null) {
/* 173 */                               if (((C0193bu) c0875ec.f7614c).m1438f(iM3397x)) {
/* 175 */                                   c0875ec.m3376O(childAt);
                                        }
/* 178 */                               ts0Var.m8890D(iM3397x);
                                    }
                                }
/* 181 */                       c0134l.m1009f(viewM984F3);
/* 184 */                       i2--;
                            }
/* 364 */                   return;
                        }
/* 187 */               if (i5 >= 0 && (iM986G = m986G()) != 0) {
/* 199 */                   int i9 = 0;
/* 200 */                   View viewM984F4 = m984F(0);
/* 204 */                   if (viewM984F4 == null || (i = c0313b.f3210c[AbstractC0133k.m974O(viewM984F4)]) == -1) {
/* 364 */                       return;
                            }
/* 226 */                   C0312a c0312a2 = (C0312a) this.f3161g0.get(i);
                            while (true) {
/* 228 */                       if (i9 < iM986G) {
/* 230 */                           View viewM984F5 = m984F(i9);
/* 234 */                           if (viewM984F5 != null) {
/* 237 */                               int i10 = nj0Var.f14302f;
/* 243 */                               if (mo1927j() || !this.f3159e0) {
/* 271 */                                   if (this.f3167m0.mo941b(viewM984F5) <= i10) {
/* 279 */                                       if (c0312a2.f3205p != AbstractC0133k.m974O(viewM984F5)) {
                                                    continue;
                                                } else {
/* 289 */                                           if (i >= this.f3161g0.size() - 1) {
                                                        break;
                                                    }
/* 294 */                                           i += nj0Var.f14304h;
/* 301 */                                           c0312a2 = (C0312a) this.f3161g0.get(i);
/* 304 */                                           i6 = i9;
                                                }
                                            }
                                        } else if (this.f3167m0.mo945f() - this.f3167m0.mo944e(viewM984F5) <= i10) {
/* 279 */                                   if (c0312a2.f3205p != AbstractC0133k.m974O(viewM984F5)) {
                                                continue;
                                            } else if (i >= this.f3161g0.size() - 1) {
                                                break;
                                                break;
                                            } else {
/* 294 */                                       i += nj0Var.f14304h;
/* 301 */                                       c0312a2 = (C0312a) this.f3161g0.get(i);
/* 304 */                                       i6 = i9;
                                            }
                                        }
                                    }
/* 305 */                           i9++;
                                }
/* 308 */                       i9 = i6;
                                break;
                            }
/* 309 */                   while (i9 >= 0) {
/* 311 */                       View viewM984F6 = m984F(i9);
/* 319 */                       if (m984F(i9) != null) {
/* 321 */                           C0875ec c0875ec2 = this.f1759a;
/* 323 */                           int iM3397x2 = c0875ec2.m3397x(i9);
/* 329 */                           ts0 ts0Var2 = (ts0) c0875ec2.f7613b;
/* 335 */                           View childAt2 = ((RecyclerView) ts0Var2.f17248a).getChildAt(iM3397x2);
/* 339 */                           if (childAt2 != null) {
/* 350 */                               if (((C0193bu) c0875ec2.f7614c).m1438f(iM3397x2)) {
/* 352 */                                   c0875ec2.m3376O(childAt2);
                                        }
/* 355 */                               ts0Var2.m8890D(iM3397x2);
                                    }
                                }
/* 358 */                       c0134l.m1009f(viewM984F6);
/* 361 */                       i9--;
                            }
                        }
                    }
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: b */
                public final void mo1919b(View view, int i, int i2, C0312a c0312a) {
/* 3 */             m996n(f3154y0, view);
/* 10 */            if (mo1927j()) {
/* 32 */                int i3 = ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.left + ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.right;
/* 36 */                c0312a.f3194e += i3;
/* 41 */                c0312a.f3195f += i3;
                    } else {
/* 64 */                int i4 = ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.top + ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.bottom;
/* 68 */                c0312a.f3194e += i4;
/* 73 */                c0312a.f3195f += i4;
                    }
                }

                /* JADX INFO: renamed from: b1 */
                public final void m1956b1(int i) {
/* 3 */             if (this.f3155a0 != i) {
/* 5 */                 m998r0();
/* 8 */                 this.f3155a0 = i;
/* 11 */                this.f3167m0 = null;
/* 13 */                this.f3168n0 = null;
/* 17 */                this.f3161g0.clear();
/* 20 */                mj0 mj0Var = this.f3166l0;
/* 22 */                mj0.m6663b(mj0Var);
/* 26 */                mj0Var.f13803d = 0;
/* 28 */                m1003w0();
                    }
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: c */
                public final void mo1920c(C0312a c0312a) {
                }

                /* JADX INFO: renamed from: c1 */
                public final boolean m1957c1(View view, int i, int i2, LayoutParams layoutParams) {
                    return (!view.isLayoutRequested() && this.f1766v && m1939T(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m1939T(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: d */
                public final View mo1921d(int i) {
/* 1 */             return mo1924g(i);
                }

                /* JADX INFO: renamed from: d1 */
                public final void m1958d1(int i) {
/* 8 */             View viewM1949U0 = m1949U0(m986G() - 1, -1);
/* 19 */            if (i >= (viewM1949U0 != null ? AbstractC0133k.m974O(viewM1949U0) : -1)) {
/* 52 */                return;
                    }
/* 22 */            int iM986G = m986G();
/* 26 */            C0313b c0313b = this.f3162h0;
/* 28 */            c0313b.m1973j(iM986G);
/* 31 */            c0313b.m1974k(iM986G);
/* 34 */            c0313b.m1972i(iM986G);
/* 40 */            if (i >= c0313b.f3210c.length) {
/* 52 */                return;
                    }
/* 43 */            this.f3177w0 = i;
/* 46 */            View viewM984F = m984F(0);
/* 50 */            if (viewM984F == null) {
/* 52 */                return;
                    }
/* 57 */            this.f3170p0 = AbstractC0133k.m974O(viewM984F);
/* 63 */            if (mo1927j() || !this.f3159e0) {
/* 98 */                this.f3171q0 = this.f3167m0.mo944e(viewM984F) - this.f3167m0.mo950k();
                    } else {
/* 82 */                this.f3171q0 = this.f3167m0.mo947h() + this.f3167m0.mo941b(viewM984F);
                    }
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: e */
                public final int mo1922e(int i, int i2, int i3) {
/* 9 */             return AbstractC0133k.m969H(this.f1757Y, this.f1755W, i2, i3, mo832o());
                }

                /* JADX INFO: renamed from: e1 */
                public final void m1959e1(mj0 mj0Var, boolean z, boolean z2) {
                    int i;
/* 5 */             if (z2) {
/* 16 */                int i2 = mo1927j() ? this.f1756X : this.f1755W;
/* 25 */                this.f3165k0.f14298b = i2 == 0 || i2 == Integer.MIN_VALUE;
                    } else {
/* 30 */                this.f3165k0.f14298b = false;
                    }
/* 36 */            if (mo1927j() || !this.f3159e0) {
/* 65 */                this.f3165k0.f14297a = this.f3167m0.mo946g() - mj0Var.f13802c;
                    } else {
/* 51 */                this.f3165k0.f14297a = mj0Var.f13802c - getPaddingRight();
                    }
/* 67 */            nj0 nj0Var = this.f3165k0;
/* 71 */            nj0Var.f14300d = mj0Var.f13800a;
/* 73 */            nj0Var.f14304h = 1;
/* 77 */            nj0Var.f14301e = mj0Var.f13802c;
/* 79 */            nj0Var.f14302f = Integer.MIN_VALUE;
/* 83 */            nj0Var.f14299c = mj0Var.f13801b;
/* 85 */            if (!z || this.f3161g0.size() <= 1 || (i = mj0Var.f13801b) < 0 || i >= this.f3161g0.size() - 1) {
/* 132 */               return;
                    }
/* 116 */           C0312a c0312a = (C0312a) this.f3161g0.get(mj0Var.f13801b);
/* 118 */           nj0 nj0Var2 = this.f3165k0;
/* 123 */           nj0Var2.f14299c++;
/* 130 */           nj0Var2.f14300d += c0312a.f3197h;
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: f */
                public final void mo1923f(int i, View view) {
/* 3 */             this.f3174t0.put(i, view);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: f0 */
                public final void mo773f0(int i, int i2) {
/* 1 */             m1958d1(i);
                }

                /* JADX INFO: renamed from: f1 */
                public final void m1960f1(mj0 mj0Var, boolean z, boolean z2) {
/* 5 */             if (z2) {
/* 16 */                int i = mo1927j() ? this.f1756X : this.f1755W;
/* 25 */                this.f3165k0.f14298b = i == 0 || i == Integer.MIN_VALUE;
                    } else {
/* 30 */                this.f3165k0.f14298b = false;
                    }
/* 36 */            if (mo1927j() || !this.f3159e0) {
/* 74 */                this.f3165k0.f14297a = mj0Var.f13802c - this.f3167m0.mo950k();
                    } else {
/* 60 */                this.f3165k0.f14297a = (this.f3176v0.getWidth() - mj0Var.f13802c) - this.f3167m0.mo950k();
                    }
/* 76 */            nj0 nj0Var = this.f3165k0;
/* 80 */            nj0Var.f14300d = mj0Var.f13800a;
/* 83 */            nj0Var.f14304h = -1;
/* 87 */            nj0Var.f14301e = mj0Var.f13802c;
/* 89 */            nj0Var.f14302f = Integer.MIN_VALUE;
/* 91 */            int i2 = mj0Var.f13801b;
/* 93 */            nj0Var.f14299c = i2;
/* 95 */            if (!z || i2 <= 0) {
/* 131 */               return;
                    }
/* 101 */           int size = this.f3161g0.size();
/* 105 */           int i3 = mj0Var.f13801b;
/* 107 */           if (size > i3) {
/* 115 */               C0312a c0312a = (C0312a) this.f3161g0.get(i3);
/* 117 */               nj0 nj0Var2 = this.f3165k0;
/* 122 */               nj0Var2.f14299c--;
/* 129 */               nj0Var2.f14300d -= c0312a.f3197h;
                    }
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: g */
                public final View mo1924g(int i) {
/* 7 */             View view = (View) this.f3174t0.get(i);
                    return view != null ? view : this.f3163i0.m1012i(i, Long.MAX_VALUE).f1778a;
                }

                @Override // p000.kj0
                public final int getAlignContent() {
/* 1 */             return 5;
                }

                @Override // p000.kj0
                public final int getAlignItems() {
/* 1 */             return this.f3157c0;
                }

                @Override // p000.kj0
                public final int getFlexDirection() {
/* 1 */             return this.f3155a0;
                }

                @Override // p000.kj0
                public final int getFlexItemCount() {
/* 3 */             return this.f3164j0.m10082b();
                }

                @Override // p000.kj0
                public final List getFlexLinesInternal() {
/* 1 */             return this.f3161g0;
                }

                @Override // p000.kj0
                public final int getFlexWrap() {
/* 1 */             return this.f3156b0;
                }

                @Override // p000.kj0
                public final int getLargestMainSize() {
/* 8 */             if (this.f3161g0.size() == 0) {
/* 7 */                 return 0;
                    }
/* 13 */            int size = this.f3161g0.size();
/* 17 */            int iMax = Integer.MIN_VALUE;
/* 19 */            for (int i = 0; i < size; i++) {
/* 31 */                iMax = Math.max(iMax, ((C0312a) this.f3161g0.get(i)).f3194e);
                    }
/* 38 */            return iMax;
                }

                @Override // p000.kj0
                public final int getMaxLine() {
/* 1 */             return this.f3158d0;
                }

                @Override // p000.kj0
                public final int getSumOfCrossSize() {
/* 3 */             int size = this.f3161g0.size();
/* 8 */             int i = 0;
/* 9 */             for (int i2 = 0; i2 < size; i2++) {
/* 21 */                i += ((C0312a) this.f3161g0.get(i2)).f3196g;
                    }
/* 25 */            return i;
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: h */
                public final int mo1925h(View view, int i, int i2) {
                    int i3;
                    int i4;
/* 5 */             if (mo1927j()) {
/* 15 */                i3 = ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.left;
/* 25 */                i4 = ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.right;
                    } else {
/* 37 */                i3 = ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.top;
/* 47 */                i4 = ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.bottom;
                    }
/* 27 */            return i3 + i4;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: h0 */
                public final void mo777h0(int i, int i2) {
/* 5 */             m1958d1(Math.min(i, i2));
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: i */
                public final int mo1926i(int i, int i2, int i3) {
/* 9 */             return AbstractC0133k.m969H(this.f1758Z, this.f1756X, i2, i3, mo835p());
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: i0 */
                public final void mo778i0(int i, int i2) {
/* 1 */             m1958d1(i);
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: j */
                public final boolean mo1927j() {
/* 1 */             int i = this.f3155a0;
                    return i == 0 || i == 1;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: j0 */
                public final void mo994j0(int i) {
/* 1 */             m1958d1(i);
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: k */
                public final int mo1928k(View view) {
                    int i;
                    int i2;
/* 5 */             if (mo1927j()) {
/* 15 */                i = ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.top;
/* 25 */                i2 = ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.bottom;
                    } else {
/* 37 */                i = ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.left;
/* 47 */                i2 = ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.right;
                    }
/* 27 */            return i + i2;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: k0 */
                public final void mo779k0(RecyclerView recyclerView, int i, int i2) {
/* 1 */             m1958d1(i);
/* 4 */             m1958d1(i);
                }

                /* JADX WARN: Code duplicated, block: B:101:0x0171  */
                /* JADX WARN: Code duplicated, block: B:106:0x0188  */
                /* JADX WARN: Code duplicated, block: B:111:0x01a1  */
                /* JADX WARN: Code duplicated, block: B:113:0x01a5  */
                /* JADX WARN: Code duplicated, block: B:114:0x01ae  */
                /* JADX WARN: Code duplicated, block: B:116:0x01b8  */
                /* JADX WARN: Code duplicated, block: B:118:0x01be  */
                /* JADX WARN: Code duplicated, block: B:119:0x01c1  */
                /* JADX WARN: Code duplicated, block: B:128:0x01e4  */
                /* JADX WARN: Code duplicated, block: B:130:0x01e8  */
                /* JADX WARN: Code duplicated, block: B:131:0x01f4  */
                /* JADX WARN: Code duplicated, block: B:135:0x0209  */
                /* JADX WARN: Code duplicated, block: B:139:0x020f  */
                /* JADX WARN: Code duplicated, block: B:142:0x021c  */
                /* JADX WARN: Code duplicated, block: B:143:0x0229  */
                /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
                /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
                /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
                /* JADX WARN: Code duplicated, block: B:79:0x0100  */
                /* JADX WARN: Code duplicated, block: B:80:0x0105  */
                /* JADX WARN: Code duplicated, block: B:82:0x0116  */
                /* JADX WARN: Code duplicated, block: B:83:0x0120  */
                /* JADX WARN: Code duplicated, block: B:85:0x012d  */
                /* JADX WARN: Code duplicated, block: B:86:0x0139  */
                /* JADX WARN: Code duplicated, block: B:88:0x013f  */
                /* JADX WARN: Code duplicated, block: B:89:0x014b  */
                /* JADX WARN: Code duplicated, block: B:91:0x0153  */
                /* JADX WARN: Code duplicated, block: B:97:0x0167  */
                /* JADX WARN: Code duplicated, block: B:98:0x0169  */
                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: l0 */
                public final void mo780l0(C0134l c0134l, y12 y12Var) {
                    View viewM1945Q0;
                    FlexboxLayoutManager flexboxLayoutManager;
                    pc0 pc0Var;
                    int iM974O;
                    int i;
                    int size;
                    int i2;
                    int i3;
                    View viewMo799B;
                    View viewM984F;
                    boolean z;
                    int iMo944e;
                    pc0 pc0Var2;
                    boolean z2;
                    pc0 pc0Var3;
                    int iMo944e2;
                    boolean z3;
                    int i4;
                    boolean z4;
                    int i5;
                    int i6;
                    int i7;
/* 7 */             this.f3163i0 = c0134l;
/* 9 */             this.f3164j0 = y12Var;
/* 11 */            int iM10082b = y12Var.m10082b();
/* 15 */            if (iM10082b == 0 && y12Var.f19443g) {
/* 984 */               return;
                    }
/* 23 */            int iM989N = m989N();
/* 27 */            int i8 = this.f3155a0;
/* 29 */            int i9 = this.f3156b0;
/* 34 */            if (i8 == 0) {
/* 98 */                this.f3159e0 = iM989N == 1;
/* 105 */               this.f3160f0 = i9 == 2;
                    } else if (i8 == 1) {
/* 83 */                this.f3159e0 = iM989N != 1;
/* 90 */                this.f3160f0 = i9 == 2;
                    } else if (i8 == 2) {
/* 67 */                boolean z5 = iM989N == 1;
/* 68 */                this.f3159e0 = z5;
/* 70 */                if (i9 == 2) {
/* 73 */                    this.f3159e0 = !z5;
                        }
/* 75 */                this.f3160f0 = false;
                    } else if (i8 != 3) {
/* 43 */                this.f3159e0 = false;
/* 45 */                this.f3160f0 = false;
                    } else {
/* 52 */                boolean z6 = iM989N == 1;
/* 53 */                this.f3159e0 = z6;
/* 55 */                if (i9 == 2) {
/* 58 */                    this.f3159e0 = !z6;
                        }
/* 60 */                this.f3160f0 = true;
                    }
/* 107 */           m1943O0();
/* 112 */           if (this.f3165k0 == null) {
/* 116 */               nj0 nj0Var = new nj0();
/* 119 */               nj0Var.f14304h = 1;
/* 121 */               this.f3165k0 = nj0Var;
                    }
/* 123 */           C0313b c0313b = this.f3162h0;
/* 125 */           c0313b.m1973j(iM10082b);
/* 128 */           c0313b.m1974k(iM10082b);
/* 131 */           c0313b.m1972i(iM10082b);
/* 136 */           this.f3165k0.f14305i = false;
/* 138 */           SavedState savedState = this.f3169o0;
/* 140 */           if (savedState != null && (i7 = savedState.f3188a) >= 0 && i7 < iM10082b) {
/* 148 */               this.f3170p0 = i7;
                    }
/* 150 */           mj0 mj0Var = this.f3166l0;
/* 157 */           if (!mj0Var.f13805f || this.f3170p0 != -1 || savedState != null) {
/* 165 */               mj0.m6663b(mj0Var);
/* 168 */               SavedState savedState2 = this.f3169o0;
/* 172 */               if (y12Var.f19443g || (i3 = this.f3170p0) == -1) {
/* 414 */                   if (m986G() != 0) {
/* 420 */                       if (mj0Var.f13804e) {
/* 426 */                           viewM1945Q0 = m1947S0(y12Var.m10082b());
                                } else {
/* 435 */                           viewM1945Q0 = m1945Q0(y12Var.m10082b());
                                }
/* 439 */                       if (viewM1945Q0 != null) {
/* 441 */                           flexboxLayoutManager = mj0Var.f13807h;
/* 445 */                           if (flexboxLayoutManager.f3156b0 == 0) {
/* 447 */                               pc0Var = flexboxLayoutManager.f3168n0;
                                    } else {
/* 450 */                               pc0Var = flexboxLayoutManager.f3167m0;
                                    }
/* 456 */                           if (flexboxLayoutManager.mo1927j() && flexboxLayoutManager.f3159e0) {
/* 464 */                               if (mj0Var.f13804e) {
/* 475 */                                   mj0Var.f13802c = pc0Var.m7384m() + pc0Var.mo944e(viewM1945Q0);
                                        } else {
/* 482 */                                   mj0Var.f13802c = pc0Var.mo941b(viewM1945Q0);
                                        }
                                    } else if (mj0Var.f13804e) {
/* 498 */                               mj0Var.f13802c = pc0Var.m7384m() + pc0Var.mo941b(viewM1945Q0);
                                    } else {
/* 505 */                               mj0Var.f13802c = pc0Var.mo944e(viewM1945Q0);
                                    }
/* 507 */                           iM974O = AbstractC0133k.m974O(viewM1945Q0);
/* 511 */                           mj0Var.f13800a = iM974O;
/* 513 */                           mj0Var.f13806g = false;
/* 517 */                           int[] iArr = flexboxLayoutManager.f3162h0.f3210c;
/* 519 */                           if (iM974O == -1) {
/* 522 */                               iM974O = 0;
                                    }
/* 523 */                           i = iArr[iM974O];
/* 525 */                           if (i == -1) {
/* 528 */                               i = 0;
                                    }
/* 529 */                           mj0Var.f13801b = i;
/* 533 */                           size = flexboxLayoutManager.f3161g0.size();
/* 537 */                           i2 = mj0Var.f13801b;
/* 539 */                           if (size > i2) {
/* 551 */                               mj0Var.f13800a = ((C0312a) flexboxLayoutManager.f3161g0.get(i2)).f3204o;
                                    }
                                } else {
/* 554 */                           mj0.m6662a(mj0Var);
/* 557 */                           mj0Var.f13800a = 0;
/* 559 */                           mj0Var.f13801b = 0;
                                }
                            } else {
/* 554 */                       mj0.m6662a(mj0Var);
/* 557 */                       mj0Var.f13800a = 0;
/* 559 */                       mj0Var.f13801b = 0;
                            }
                        } else if (i3 < 0 || i3 >= y12Var.m10082b()) {
/* 406 */                   this.f3170p0 = -1;
/* 408 */                   this.f3171q0 = Integer.MIN_VALUE;
/* 414 */                   if (m986G() != 0) {
/* 420 */                       if (mj0Var.f13804e) {
/* 426 */                           viewM1945Q0 = m1947S0(y12Var.m10082b());
                                } else {
/* 435 */                           viewM1945Q0 = m1945Q0(y12Var.m10082b());
                                }
/* 439 */                       if (viewM1945Q0 != null) {
/* 441 */                           flexboxLayoutManager = mj0Var.f13807h;
/* 445 */                           if (flexboxLayoutManager.f3156b0 == 0) {
/* 447 */                               pc0Var = flexboxLayoutManager.f3168n0;
                                    } else {
/* 450 */                               pc0Var = flexboxLayoutManager.f3167m0;
                                    }
/* 456 */                           if (flexboxLayoutManager.mo1927j()) {
/* 487 */                               if (mj0Var.f13804e) {
/* 498 */                                   mj0Var.f13802c = pc0Var.m7384m() + pc0Var.mo941b(viewM1945Q0);
                                        } else {
/* 505 */                                   mj0Var.f13802c = pc0Var.mo944e(viewM1945Q0);
                                        }
                                    } else if (mj0Var.f13804e) {
/* 498 */                               mj0Var.f13802c = pc0Var.m7384m() + pc0Var.mo941b(viewM1945Q0);
                                    } else {
/* 505 */                               mj0Var.f13802c = pc0Var.mo944e(viewM1945Q0);
                                    }
/* 507 */                           iM974O = AbstractC0133k.m974O(viewM1945Q0);
/* 511 */                           mj0Var.f13800a = iM974O;
/* 513 */                           mj0Var.f13806g = false;
/* 517 */                           int[] iArr2 = flexboxLayoutManager.f3162h0.f3210c;
/* 519 */                           if (iM974O == -1) {
/* 522 */                               iM974O = 0;
                                    }
/* 523 */                           i = iArr2[iM974O];
/* 525 */                           if (i == -1) {
/* 528 */                               i = 0;
                                    }
/* 529 */                           mj0Var.f13801b = i;
/* 533 */                           size = flexboxLayoutManager.f3161g0.size();
/* 537 */                           i2 = mj0Var.f13801b;
/* 539 */                           if (size > i2) {
/* 551 */                               mj0Var.f13800a = ((C0312a) flexboxLayoutManager.f3161g0.get(i2)).f3204o;
                                    }
                                } else {
/* 554 */                           mj0.m6662a(mj0Var);
/* 557 */                           mj0Var.f13800a = 0;
/* 559 */                           mj0Var.f13801b = 0;
                                }
                            } else {
/* 554 */                       mj0.m6662a(mj0Var);
/* 557 */                       mj0Var.f13800a = 0;
/* 559 */                       mj0Var.f13801b = 0;
                            }
                        } else {
/* 190 */                   int i10 = this.f3170p0;
/* 192 */                   mj0Var.f13800a = i10;
/* 198 */                   mj0Var.f13801b = c0313b.f3210c[i10];
/* 200 */                   SavedState savedState3 = this.f3169o0;
/* 202 */                   if (savedState3 != null) {
/* 204 */                       int iM10082b2 = y12Var.m10082b();
/* 208 */                       int i11 = savedState3.f3188a;
/* 210 */                       if (i11 >= 0 && i11 < iM10082b2) {
/* 223 */                           mj0Var.f13802c = this.f3167m0.mo950k() + savedState2.f3189b;
/* 225 */                           mj0Var.f13806g = true;
/* 227 */                           mj0Var.f13801b = -1;
                                } else if (this.f3171q0 == Integer.MIN_VALUE) {
/* 237 */                           viewMo799B = mo799B(this.f3170p0);
/* 241 */                           if (viewMo799B != null) {
/* 344 */                               if (m986G() > 0 && (viewM984F = m984F(0)) != null) {
/* 358 */                                   if (this.f3170p0 < AbstractC0133k.m974O(viewM984F)) {
/* 360 */                                       z = true;
                                            } else {
/* 362 */                                       z = false;
                                            }
/* 363 */                                   mj0Var.f13804e = z;
                                        }
/* 365 */                               mj0.m6662a(mj0Var);
                                    } else if (this.f3167m0.mo942c(viewMo799B) > this.f3167m0.mo951l()) {
/* 257 */                               mj0.m6662a(mj0Var);
                                    } else {
/* 274 */                               iMo944e = this.f3167m0.mo944e(viewMo799B) - this.f3167m0.mo950k();
/* 275 */                               pc0Var2 = this.f3167m0;
/* 277 */                               if (iMo944e < 0) {
/* 283 */                                   mj0Var.f13802c = pc0Var2.mo950k();
/* 285 */                                   mj0Var.f13804e = false;
                                        } else if (pc0Var2.mo946g() - this.f3167m0.mo941b(viewMo799B) < 0) {
/* 308 */                                   mj0Var.f13802c = this.f3167m0.mo946g();
/* 310 */                                   mj0Var.f13804e = true;
                                        } else {
/* 314 */                                   z2 = mj0Var.f13804e;
/* 316 */                                   pc0Var3 = this.f3167m0;
/* 318 */                                   if (z2) {
/* 330 */                                       iMo944e2 = this.f3167m0.m7384m() + pc0Var3.mo941b(viewMo799B);
                                            } else {
/* 332 */                                       iMo944e2 = pc0Var3.mo944e(viewMo799B);
                                            }
/* 336 */                                   mj0Var.f13802c = iMo944e2;
                                        }
                                    }
                                } else if (mo1927j() && this.f3159e0) {
/* 389 */                           mj0Var.f13802c = this.f3171q0 - this.f3167m0.mo947h();
                                } else {
/* 402 */                           mj0Var.f13802c = this.f3167m0.mo950k() + this.f3171q0;
                                }
                            } else if (this.f3171q0 == Integer.MIN_VALUE) {
/* 237 */                       viewMo799B = mo799B(this.f3170p0);
/* 241 */                       if (viewMo799B != null) {
/* 344 */                           if (m986G() > 0) {
/* 358 */                               if (this.f3170p0 < AbstractC0133k.m974O(viewM984F)) {
/* 360 */                                   z = true;
                                        } else {
/* 362 */                                   z = false;
                                        }
/* 363 */                               mj0Var.f13804e = z;
                                    }
/* 365 */                           mj0.m6662a(mj0Var);
                                } else if (this.f3167m0.mo942c(viewMo799B) > this.f3167m0.mo951l()) {
/* 257 */                           mj0.m6662a(mj0Var);
                                } else {
/* 274 */                           iMo944e = this.f3167m0.mo944e(viewMo799B) - this.f3167m0.mo950k();
/* 275 */                           pc0Var2 = this.f3167m0;
/* 277 */                           if (iMo944e < 0) {
/* 283 */                               mj0Var.f13802c = pc0Var2.mo950k();
/* 285 */                               mj0Var.f13804e = false;
                                    } else if (pc0Var2.mo946g() - this.f3167m0.mo941b(viewMo799B) < 0) {
/* 308 */                               mj0Var.f13802c = this.f3167m0.mo946g();
/* 310 */                               mj0Var.f13804e = true;
                                    } else {
/* 314 */                               z2 = mj0Var.f13804e;
/* 316 */                               pc0Var3 = this.f3167m0;
/* 318 */                               if (z2) {
/* 330 */                                   iMo944e2 = this.f3167m0.m7384m() + pc0Var3.mo941b(viewMo799B);
                                        } else {
/* 332 */                                   iMo944e2 = pc0Var3.mo944e(viewMo799B);
                                        }
/* 336 */                               mj0Var.f13802c = iMo944e2;
                                    }
                                }
                            } else if (mo1927j()) {
/* 402 */                       mj0Var.f13802c = this.f3167m0.mo950k() + this.f3171q0;
                            } else {
/* 402 */                       mj0Var.f13802c = this.f3167m0.mo950k() + this.f3171q0;
                            }
                        }
/* 561 */               mj0Var.f13805f = true;
                    }
/* 563 */           m979A(c0134l);
/* 568 */           if (mj0Var.f13804e) {
/* 570 */               m1960f1(mj0Var, false, true);
                    } else {
/* 574 */               m1959e1(mj0Var, false, true);
                    }
/* 581 */           int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1757Y, this.f1755W);
/* 589 */           int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f1758Z, this.f1756X);
/* 593 */           int i12 = this.f1757Y;
/* 595 */           int i13 = this.f1758Z;
/* 597 */           boolean zMo1927j = mo1927j();
/* 601 */           Context context = this.f3175u0;
/* 603 */           if (zMo1927j) {
/* 605 */               int i14 = this.f3172r0;
/* 613 */               z3 = (i14 == Integer.MIN_VALUE || i14 == i12) ? false : true;
/* 614 */               nj0 nj0Var2 = this.f3165k0;
/* 631 */               i4 = nj0Var2.f14298b ? context.getResources().getDisplayMetrics().heightPixels : nj0Var2.f14297a;
                    } else {
/* 636 */               int i15 = this.f3173s0;
/* 644 */               z3 = (i15 == Integer.MIN_VALUE || i15 == i13) ? false : true;
/* 645 */               nj0 nj0Var3 = this.f3165k0;
/* 662 */               i4 = nj0Var3.f14298b ? context.getResources().getDisplayMetrics().widthPixels : nj0Var3.f14297a;
                    }
/* 633 */           int i16 = i4;
/* 665 */           this.f3172r0 = i12;
/* 667 */           this.f3173s0 = i13;
/* 669 */           int i17 = this.f3177w0;
/* 672 */           C1954n7 c1954n7 = this.f3178x0;
/* 674 */           if (i17 != -1 || (this.f3170p0 == -1 && !z3)) {
/* 768 */               int iMin = mj0Var.f13800a;
/* 770 */               if (i17 != -1) {
/* 772 */                   iMin = Math.min(i17, iMin);
                        }
/* 776 */               c1954n7.f14152c = null;
/* 778 */               c1954n7.f14151b = 0;
/* 780 */               boolean zMo1927j2 = mo1927j();
/* 784 */               List list = this.f3161g0;
/* 786 */               if (zMo1927j2) {
/* 792 */                   if (list.size() > 0) {
/* 796 */                       c0313b.m1968d(iMin, this.f3161g0);
/* 813 */                       this.f3162h0.m1966b(this.f3178x0, iMakeMeasureSpec, iMakeMeasureSpec2, i16, iMin, mj0Var.f13800a, this.f3161g0);
                            } else {
/* 817 */                       c0313b.m1972i(iM10082b);
/* 832 */                       this.f3162h0.m1966b(this.f3178x0, iMakeMeasureSpec, iMakeMeasureSpec2, i16, 0, -1, this.f3161g0);
                            }
                        } else if (list.size() > 0) {
/* 844 */                   c0313b.m1968d(iMin, this.f3161g0);
/* 864 */                   int i18 = iMin;
/* 866 */                   this.f3162h0.m1966b(this.f3178x0, iMakeMeasureSpec2, iMakeMeasureSpec, i16, i18, mj0Var.f13800a, this.f3161g0);
/* 870 */                   iMakeMeasureSpec2 = iMakeMeasureSpec2;
/* 871 */                   iMakeMeasureSpec = iMakeMeasureSpec;
/* 872 */                   iMin = i18;
                        } else {
/* 875 */                   c0313b.m1972i(iM10082b);
/* 895 */                   this.f3162h0.m1966b(this.f3178x0, iMakeMeasureSpec2, iMakeMeasureSpec, i16, 0, -1, this.f3161g0);
/* 900 */                   iMakeMeasureSpec2 = iMakeMeasureSpec2;
/* 901 */                   iMakeMeasureSpec = iMakeMeasureSpec;
                        }
/* 907 */               this.f3161g0 = (List) c1954n7.f14152c;
/* 909 */               c0313b.m1971h(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
/* 912 */               c0313b.m1983u(iMin);
                    } else if (!mj0Var.f13804e) {
/* 690 */               this.f3161g0.clear();
/* 693 */               c1954n7.f14152c = null;
/* 695 */               c1954n7.f14151b = 0;
/* 697 */               boolean zMo1927j3 = mo1927j();
/* 701 */               int i19 = mj0Var.f13800a;
/* 703 */               C0313b c0313b2 = this.f3162h0;
/* 705 */               C1954n7 c1954n8 = this.f3178x0;
/* 707 */               if (zMo1927j3) {
/* 717 */                   c0313b2.m1966b(c1954n8, iMakeMeasureSpec, iMakeMeasureSpec2, i16, 0, i19, this.f3161g0);
                        } else {
/* 734 */                   c0313b2.m1966b(c1954n8, iMakeMeasureSpec2, iMakeMeasureSpec, i16, 0, i19, this.f3161g0);
/* 739 */                   iMakeMeasureSpec2 = iMakeMeasureSpec2;
/* 740 */                   iMakeMeasureSpec = iMakeMeasureSpec;
                        }
/* 746 */               this.f3161g0 = (List) c1954n7.f14152c;
/* 748 */               c0313b.m1971h(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
/* 751 */               c0313b.m1983u(0);
/* 758 */               int i20 = c0313b.f3210c[mj0Var.f13800a];
/* 760 */               mj0Var.f13801b = i20;
/* 764 */               this.f3165k0.f14299c = i20;
                    }
/* 917 */           m1944P0(c0134l, y12Var, this.f3165k0);
/* 920 */           boolean z7 = mj0Var.f13804e;
/* 922 */           nj0 nj0Var4 = this.f3165k0;
/* 924 */           if (z7) {
/* 926 */               i6 = nj0Var4.f14301e;
/* 928 */               z4 = true;
/* 929 */               m1959e1(mj0Var, true, false);
/* 934 */               m1944P0(c0134l, y12Var, this.f3165k0);
/* 939 */               i5 = this.f3165k0.f14301e;
                    } else {
/* 942 */               z4 = true;
/* 943 */               i5 = nj0Var4.f14301e;
/* 945 */               m1960f1(mj0Var, true, false);
/* 950 */               m1944P0(c0134l, y12Var, this.f3165k0);
/* 955 */               i6 = this.f3165k0.f14301e;
                    }
/* 961 */           if (m986G() > 0) {
/* 965 */               if (mj0Var.f13804e) {
/* 972 */                   m1952X0(m1951W0(i5, c0134l, y12Var, z4) + i6, c0134l, y12Var, false);
                        } else {
/* 981 */                   m1951W0(m1952X0(i6, c0134l, y12Var, z4) + i5, c0134l, y12Var, false);
                        }
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: m0 */
                public final void mo781m0(y12 y12Var) {
/* 2 */             this.f3169o0 = null;
/* 5 */             this.f3170p0 = -1;
/* 9 */             this.f3171q0 = Integer.MIN_VALUE;
/* 11 */            this.f3177w0 = -1;
/* 15 */            mj0.m6663b(this.f3166l0);
/* 20 */            this.f3174t0.clear();
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: n0 */
                public final void mo830n0(Parcelable parcelable) {
/* 3 */             if (parcelable instanceof SavedState) {
/* 7 */                 this.f3169o0 = (SavedState) parcelable;
/* 9 */                 m1003w0();
                    }
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: o */
                public final boolean mo832o() {
/* 3 */             if (this.f3156b0 == 0) {
/* 5 */                 return mo1927j();
                    }
/* 14 */            if (!mo1927j()) {
/* 33 */                return true;
                    }
/* 16 */            int i = this.f1757Y;
/* 18 */            View view = this.f3176v0;
                    return i > (view != null ? view.getWidth() : 0);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: o0 */
                public final Parcelable mo833o0() {
/* 1 */             SavedState savedState = this.f3169o0;
/* 3 */             if (savedState != null) {
/* 7 */                 SavedState savedState2 = new SavedState();
/* 12 */                savedState2.f3188a = savedState.f3188a;
/* 16 */                savedState2.f3189b = savedState.f3189b;
/* 18 */                return savedState2;
                    }
/* 21 */            SavedState savedState3 = new SavedState();
/* 28 */            if (m986G() <= 0) {
/* 58 */                savedState3.f3188a = -1;
/* 60 */                return savedState3;
                    }
/* 31 */            View viewM984F = m984F(0);
/* 39 */            savedState3.f3188a = AbstractC0133k.m974O(viewM984F);
/* 54 */            savedState3.f3189b = this.f3167m0.mo944e(viewM984F) - this.f3167m0.mo950k();
/* 56 */            return savedState3;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: p */
                public final boolean mo835p() {
/* 4 */             if (this.f3156b0 == 0) {
/* 10 */                return !mo1927j();
                    }
/* 16 */            if (!mo1927j()) {
/* 18 */                int i = this.f1758Z;
/* 20 */                View view = this.f3176v0;
/* 31 */                if (i <= (view != null ? view.getHeight() : 0)) {
/* 22 */                    return false;
                        }
                    }
/* 3 */             return true;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: q */
                public final boolean mo783q(RecyclerView.LayoutParams layoutParams) {
/* 1 */             return layoutParams instanceof LayoutParams;
                }

                @Override // p000.kj0
                public final void setFlexLines(List list) {
/* 1 */             this.f3161g0 = list;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: u */
                public final int mo839u(y12 y12Var) {
/* 1 */             return m1940L0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: v */
                public final int mo789v(y12 y12Var) {
/* 1 */             return m1941M0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: w */
                public final int mo791w(y12 y12Var) {
/* 1 */             return m1942N0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: x */
                public final int mo840x(y12 y12Var) {
/* 1 */             return m1940L0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: x0 */
                public final int mo793x0(int i, y12 y12Var, C0134l c0134l) {
/* 5 */             if (!mo1927j() || this.f3156b0 == 0) {
/* 30 */                int iM1953Y0 = m1953Y0(i, y12Var, c0134l);
/* 36 */                this.f3174t0.clear();
/* 39 */                return iM1953Y0;
                    }
/* 12 */            int iM1954Z0 = m1954Z0(i);
/* 21 */            this.f3166l0.f13803d += iM1954Z0;
/* 26 */            this.f3168n0.mo954p(-iM1954Z0);
/* 29 */            return iM1954Z0;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: y */
                public final int mo795y(y12 y12Var) {
/* 1 */             return m1941M0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: y0 */
                public final void mo841y0(int i) {
/* 1 */             this.f3170p0 = i;
/* 5 */             this.f3171q0 = Integer.MIN_VALUE;
/* 7 */             SavedState savedState = this.f3169o0;
/* 9 */             if (savedState != null) {
/* 12 */                savedState.f3188a = -1;
                    }
/* 14 */            m1003w0();
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: z */
                public final int mo797z(y12 y12Var) {
/* 1 */             return m1942N0(y12Var);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: z0 */
                public final int mo798z0(int i, y12 y12Var, C0134l c0134l) {
/* 5 */             if (mo1927j() || (this.f3156b0 == 0 && !mo1927j())) {
/* 36 */                int iM1953Y0 = m1953Y0(i, y12Var, c0134l);
/* 42 */                this.f3174t0.clear();
/* 45 */                return iM1953Y0;
                    }
/* 18 */            int iM1954Z0 = m1954Z0(i);
/* 27 */            this.f3166l0.f13803d += iM1954Z0;
/* 32 */            this.f3168n0.mo954p(-iM1954Z0);
/* 35 */            return iM1954Z0;
                }
            }
