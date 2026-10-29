            package com.google.android.flexbox;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.drawable.Drawable;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.util.SparseIntArray;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.core.app.NotificationCompat;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.WeakHashMap;
            import okhttp3.internal.http2.Http2Connection;
            import p000.AbstractC0208c9;
            import p000.C1951n4;
            import p000.C1954n7;
            import p000.e33;
            import p000.f42;
            import p000.fm0;
            import p000.kj0;
            import p000.lj0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 133 */   public class FlexboxLayout extends ViewGroup implements kj0 {

                /* JADX INFO: renamed from: U */
                public int f3127U;

                /* JADX INFO: renamed from: V */
                public int f3128V;

                /* JADX INFO: renamed from: W */
                public int f3129W;

                /* JADX INFO: renamed from: a */
                public int f3130a;

                /* JADX INFO: renamed from: a0 */
                public int[] f3131a0;

                /* JADX INFO: renamed from: b */
                public int f3132b;

                /* JADX INFO: renamed from: b0 */
                public SparseIntArray f3133b0;

                /* JADX INFO: renamed from: c */
                public int f3134c;

                /* JADX INFO: renamed from: c0 */
                public final C0313b f3135c0;

                /* JADX INFO: renamed from: d */
                public int f3136d;

                /* JADX INFO: renamed from: d0 */
                public List f3137d0;

                /* JADX INFO: renamed from: e */
                public int f3138e;

                /* JADX INFO: renamed from: e0 */
                public final C1954n7 f3139e0;

                /* JADX INFO: renamed from: f */
                public int f3140f;

                /* JADX INFO: renamed from: i */
                public Drawable f3141i;

                /* JADX INFO: renamed from: v */
                public Drawable f3142v;

                /* JADX INFO: renamed from: w */
                public int f3143w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
                    public static final Parcelable.Creator<LayoutParams> CREATOR = new C0314c();

                    /* JADX INFO: renamed from: U */
                    public boolean f3144U;

                    /* JADX INFO: renamed from: a */
                    public int f3145a;

                    /* JADX INFO: renamed from: b */
                    public float f3146b;

                    /* JADX INFO: renamed from: c */
                    public float f3147c;

                    /* JADX INFO: renamed from: d */
                    public int f3148d;

                    /* JADX INFO: renamed from: e */
                    public float f3149e;

                    /* JADX INFO: renamed from: f */
                    public int f3150f;

                    /* JADX INFO: renamed from: i */
                    public int f3151i;

                    /* JADX INFO: renamed from: v */
                    public int f3152v;

                    /* JADX INFO: renamed from: w */
                    public int f3153w;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 5 */                 this.f3145a = 1;
/* 8 */                 this.f3146b = 0.0f;
/* 12 */                this.f3147c = 1.0f;
/* 15 */                this.f3148d = -1;
/* 19 */                this.f3149e = -1.0f;
/* 21 */                this.f3150f = -1;
/* 23 */                this.f3151i = -1;
/* 28 */                this.f3152v = 16777215;
/* 30 */                this.f3153w = 16777215;
/* 34 */                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FlexboxLayout_Layout);
/* 44 */                this.f3145a = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_Layout_layout_order, 1);
/* 52 */                this.f3146b = typedArrayObtainStyledAttributes.getFloat(R$styleable.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
/* 60 */                this.f3147c = typedArrayObtainStyledAttributes.getFloat(R$styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
/* 68 */                this.f3148d = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
/* 76 */                this.f3149e = typedArrayObtainStyledAttributes.getFraction(R$styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
/* 84 */                this.f3150f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_minWidth, -1);
/* 92 */                this.f3151i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_minHeight, -1);
/* 100 */               this.f3152v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_maxWidth, 16777215);
/* 108 */               this.f3153w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_maxHeight, 16777215);
/* 117 */               this.f3144U = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
/* 119 */               typedArrayObtainStyledAttributes.recycle();
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: E */
                    public final int mo1903E() {
/* 1 */                 return this.f3148d;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: H */
                    public final float mo1904H() {
/* 1 */                 return this.f3147c;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: H0 */
                    public final float mo1905H0() {
/* 1 */                 return this.f3149e;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: R */
                    public final int mo1906R() {
/* 1 */                 return this.f3150f;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: Y */
                    public final void mo1907Y(int i) {
/* 1 */                 this.f3150f = i;
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
/* 1 */                 return this.f3151i;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: d1 */
                    public final boolean mo1911d1() {
/* 1 */                 return this.f3144U;
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
/* 1 */                 return this.f3145a;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    public final int getWidth() {
/* 1 */                 return ((ViewGroup.MarginLayoutParams) this).width;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: i1 */
                    public final int mo1913i1() {
/* 1 */                 return this.f3153w;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: m0 */
                    public final int mo1914m0() {
/* 1 */                 return ((ViewGroup.MarginLayoutParams) this).topMargin;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: s0 */
                    public final void mo1915s0(int i) {
/* 1 */                 this.f3151i = i;
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: v0 */
                    public final float mo1916v0() {
/* 1 */                 return this.f3146b;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 3 */                 parcel.writeInt(this.f3145a);
/* 8 */                 parcel.writeFloat(this.f3146b);
/* 13 */                parcel.writeFloat(this.f3147c);
/* 18 */                parcel.writeInt(this.f3148d);
/* 23 */                parcel.writeFloat(this.f3149e);
/* 28 */                parcel.writeInt(this.f3150f);
/* 33 */                parcel.writeInt(this.f3151i);
/* 38 */                parcel.writeInt(this.f3152v);
/* 43 */                parcel.writeInt(this.f3153w);
/* 48 */                parcel.writeByte(this.f3144U ? (byte) 1 : (byte) 0);
/* 53 */                parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
/* 58 */                parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
/* 63 */                parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
/* 68 */                parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
/* 73 */                parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
/* 78 */                parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
                    }

                    @Override // com.google.android.flexbox.FlexItem
                    /* JADX INFO: renamed from: x1 */
                    public final int mo1917x1() {
/* 1 */                 return this.f3152v;
                    }
                }

                public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 5 */             this.f3140f = -1;
/* 12 */            this.f3135c0 = new C0313b(this);
/* 19 */            this.f3137d0 = new ArrayList();
/* 27 */            this.f3139e0 = new C1954n7(3);
/* 32 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FlexboxLayout, i, 0);
/* 42 */            this.f3130a = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_flexDirection, 0);
/* 50 */            this.f3132b = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_flexWrap, 0);
/* 58 */            this.f3134c = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_justifyContent, 0);
/* 66 */            this.f3136d = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_alignItems, 0);
/* 74 */            this.f3138e = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_alignContent, 0);
/* 82 */            this.f3140f = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_maxLine, -1);
/* 86 */            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawable);
/* 90 */            if (drawable != null) {
/* 92 */                setDividerDrawableHorizontal(drawable);
/* 95 */                setDividerDrawableVertical(drawable);
                    }
/* 100 */           Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawableHorizontal);
/* 104 */           if (drawable2 != null) {
/* 106 */               setDividerDrawableHorizontal(drawable2);
                    }
/* 111 */           Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawableVertical);
/* 115 */           if (drawable3 != null) {
/* 117 */               setDividerDrawableVertical(drawable3);
                    }
/* 122 */           int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDivider, 0);
/* 126 */           if (i2 != 0) {
/* 128 */               this.f3127U = i2;
/* 130 */               this.f3143w = i2;
                    }
/* 134 */           int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDividerVertical, 0);
/* 138 */           if (i3 != 0) {
/* 140 */               this.f3127U = i3;
                    }
/* 144 */           int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDividerHorizontal, 0);
/* 148 */           if (i4 != 0) {
/* 150 */               this.f3143w = i4;
                    }
/* 152 */           typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: a */
                public final void m1918a(Canvas canvas, boolean z, boolean z2) {
/* 1 */             int paddingLeft = getPaddingLeft();
/* 16 */            int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
/* 22 */            int size = this.f3137d0.size();
/* 27 */            for (int i = 0; i < size; i++) {
/* 35 */                C0312a c0312a = (C0312a) this.f3137d0.get(i);
/* 40 */                for (int i2 = 0; i2 < c0312a.f3197h; i2++) {
/* 44 */                    int i3 = c0312a.f3204o + i2;
/* 45 */                    View viewM1932o = m1932o(i3);
/* 49 */                    if (viewM1932o != null && viewM1932o.getVisibility() != 8) {
/* 64 */                        LayoutParams layoutParams = (LayoutParams) viewM1932o.getLayoutParams();
/* 70 */                        if (m1933p(i3, i2)) {
/* 96 */                            m1931n(canvas, z ? viewM1932o.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewM1932o.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f3129W, c0312a.f3191b, c0312a.f3196g);
                                }
/* 103 */                       if (i2 == c0312a.f3197h - 1 && (this.f3127U & 4) > 0) {
/* 135 */                           m1931n(canvas, z ? (viewM1932o.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f3129W : viewM1932o.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, c0312a.f3191b, c0312a.f3196g);
                                }
                            }
                        }
/* 145 */               if (m1934q(i)) {
/* 157 */                   m1930m(canvas, paddingLeft, z2 ? c0312a.f3193d : c0312a.f3191b - this.f3128V, iMax);
                        }
/* 164 */               if (m1935r(i) && (this.f3143w & 4) > 0) {
/* 182 */                   m1930m(canvas, paddingLeft, z2 ? c0312a.f3191b - this.f3128V : c0312a.f3193d, iMax);
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.ViewGroup
                public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 3 */             if (this.f3133b0 == null) {
/* 14 */                this.f3133b0 = new SparseIntArray(getChildCount());
                    }
/* 16 */            SparseIntArray sparseIntArray = this.f3133b0;
/* 18 */            C0313b c0313b = this.f3135c0;
/* 20 */            kj0 kj0Var = c0313b.f3208a;
/* 22 */            int flexItemCount = kj0Var.getFlexItemCount();
/* 26 */            ArrayList arrayListM1969f = c0313b.m1969f(flexItemCount);
/* 32 */            lj0 lj0Var = new lj0();
/* 36 */            if (view == null || !(layoutParams instanceof FlexItem)) {
/* 52 */                lj0Var.f13314b = 1;
                    } else {
/* 49 */                lj0Var.f13314b = ((FlexItem) layoutParams).getOrder();
                    }
/* 55 */            if (i == -1 || i == flexItemCount || i >= kj0Var.getFlexItemCount()) {
/* 85 */                lj0Var.f13313a = flexItemCount;
                    } else {
/* 66 */                lj0Var.f13313a = i;
/* 69 */                for (int i2 = i; i2 < flexItemCount; i2++) {
/* 80 */                    ((lj0) arrayListM1969f.get(i2)).f13313a++;
                        }
                    }
/* 90 */            arrayListM1969f.add(lj0Var);
/* 98 */            this.f3131a0 = C0313b.m1964r(flexItemCount + 1, arrayListM1969f, sparseIntArray);
/* 100 */           super.addView(view, i, layoutParams);
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: b */
                public final void mo1919b(View view, int i, int i2, C0312a c0312a) {
/* 5 */             if (m1933p(i, i2)) {
/* 7 */                 boolean zMo1927j = mo1927j();
/* 11 */                int i3 = c0312a.f3194e;
/* 13 */                if (zMo1927j) {
/* 15 */                    int i4 = this.f3129W;
/* 18 */                    c0312a.f3194e = i3 + i4;
/* 23 */                    c0312a.f3195f += i4;
                        } else {
/* 26 */                    int i5 = this.f3128V;
/* 29 */                    c0312a.f3194e = i3 + i5;
/* 34 */                    c0312a.f3195f += i5;
                        }
                    }
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: c */
                public final void mo1920c(C0312a c0312a) {
/* 5 */             if (mo1927j()) {
/* 11 */                if ((this.f3127U & 4) > 0) {
/* 13 */                    int i = c0312a.f3194e;
/* 15 */                    int i2 = this.f3129W;
/* 18 */                    c0312a.f3194e = i + i2;
/* 23 */                    c0312a.f3195f += i2;
/* 25 */                    return;
                        }
/* 44 */                return;
                    }
/* 30 */            if ((this.f3143w & 4) > 0) {
/* 32 */                int i3 = c0312a.f3194e;
/* 34 */                int i4 = this.f3128V;
/* 37 */                c0312a.f3194e = i3 + i4;
/* 42 */                c0312a.f3195f += i4;
                    }
                }

                @Override // android.view.ViewGroup
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             return layoutParams instanceof LayoutParams;
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: d */
                public final View mo1921d(int i) {
/* 1 */             return m1932o(i);
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: e */
                public final int mo1922e(int i, int i2, int i3) {
/* 1 */             return ViewGroup.getChildMeasureSpec(i, i2, i3);
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: f */
                public final void mo1923f(int i, View view) {
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: g */
                public final View mo1924g(int i) {
/* 1 */             return getChildAt(i);
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 13 */            if (layoutParams instanceof LayoutParams) {
/* 17 */                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
/* 19 */                LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
/* 22 */                layoutParams3.f3145a = 1;
/* 24 */                layoutParams3.f3146b = 0.0f;
/* 26 */                layoutParams3.f3147c = 1.0f;
/* 28 */                layoutParams3.f3148d = -1;
/* 30 */                layoutParams3.f3149e = -1.0f;
/* 32 */                layoutParams3.f3150f = -1;
/* 34 */                layoutParams3.f3151i = -1;
/* 36 */                layoutParams3.f3152v = 16777215;
/* 38 */                layoutParams3.f3153w = 16777215;
/* 42 */                layoutParams3.f3145a = layoutParams2.f3145a;
/* 46 */                layoutParams3.f3146b = layoutParams2.f3146b;
/* 50 */                layoutParams3.f3147c = layoutParams2.f3147c;
/* 54 */                layoutParams3.f3148d = layoutParams2.f3148d;
/* 58 */                layoutParams3.f3149e = layoutParams2.f3149e;
/* 62 */                layoutParams3.f3150f = layoutParams2.f3150f;
/* 66 */                layoutParams3.f3151i = layoutParams2.f3151i;
/* 70 */                layoutParams3.f3152v = layoutParams2.f3152v;
/* 74 */                layoutParams3.f3153w = layoutParams2.f3153w;
/* 78 */                layoutParams3.f3144U = layoutParams2.f3144U;
/* 80 */                return layoutParams3;
                    }
/* 83 */            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
/* 89 */                LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
/* 92 */                layoutParams4.f3145a = 1;
/* 94 */                layoutParams4.f3146b = 0.0f;
/* 96 */                layoutParams4.f3147c = 1.0f;
/* 98 */                layoutParams4.f3148d = -1;
/* 100 */               layoutParams4.f3149e = -1.0f;
/* 102 */               layoutParams4.f3150f = -1;
/* 104 */               layoutParams4.f3151i = -1;
/* 106 */               layoutParams4.f3152v = 16777215;
/* 108 */               layoutParams4.f3153w = 16777215;
/* 110 */               return layoutParams4;
                    }
/* 113 */           LayoutParams layoutParams5 = new LayoutParams(layoutParams);
/* 116 */           layoutParams5.f3145a = 1;
/* 118 */           layoutParams5.f3146b = 0.0f;
/* 120 */           layoutParams5.f3147c = 1.0f;
/* 122 */           layoutParams5.f3148d = -1;
/* 124 */           layoutParams5.f3149e = -1.0f;
/* 126 */           layoutParams5.f3150f = -1;
/* 128 */           layoutParams5.f3151i = -1;
/* 130 */           layoutParams5.f3152v = 16777215;
/* 132 */           layoutParams5.f3153w = 16777215;
/* 134 */           return layoutParams5;
                }

                @Override // p000.kj0
                public int getAlignContent() {
/* 1 */             return this.f3138e;
                }

                @Override // p000.kj0
                public int getAlignItems() {
/* 1 */             return this.f3136d;
                }

                public Drawable getDividerDrawableHorizontal() {
/* 1 */             return this.f3141i;
                }

                public Drawable getDividerDrawableVertical() {
/* 1 */             return this.f3142v;
                }

                @Override // p000.kj0
                public int getFlexDirection() {
/* 1 */             return this.f3130a;
                }

                @Override // p000.kj0
                public int getFlexItemCount() {
/* 1 */             return getChildCount();
                }

                public List<C0312a> getFlexLines() {
/* 9 */             ArrayList arrayList = new ArrayList(this.f3137d0.size());
/* 22 */            for (C0312a c0312a : this.f3137d0) {
/* 34 */                if (c0312a.m1961a() != 0) {
/* 37 */                    arrayList.add(c0312a);
                        }
                    }
/* 41 */            return arrayList;
                }

                @Override // p000.kj0
                public List<C0312a> getFlexLinesInternal() {
/* 1 */             return this.f3137d0;
                }

                @Override // p000.kj0
                public int getFlexWrap() {
/* 1 */             return this.f3132b;
                }

                public int getJustifyContent() {
/* 1 */             return this.f3134c;
                }

                @Override // p000.kj0
                public int getLargestMainSize() {
/* 3 */             Iterator it = this.f3137d0.iterator();
/* 7 */             int iMax = Integer.MIN_VALUE;
/* 13 */            while (it.hasNext()) {
/* 23 */                iMax = Math.max(iMax, ((C0312a) it.next()).f3194e);
                    }
/* 28 */            return iMax;
                }

                @Override // p000.kj0
                public int getMaxLine() {
/* 1 */             return this.f3140f;
                }

                public int getShowDividerHorizontal() {
/* 1 */             return this.f3143w;
                }

                public int getShowDividerVertical() {
/* 1 */             return this.f3127U;
                }

                @Override // p000.kj0
                public int getSumOfCrossSize() {
/* 3 */             int size = this.f3137d0.size();
/* 8 */             int i = 0;
/* 9 */             for (int i2 = 0; i2 < size; i2++) {
/* 17 */                C0312a c0312a = (C0312a) this.f3137d0.get(i2);
/* 23 */                if (m1934q(i2)) {
/* 33 */                    i += mo1927j() ? this.f3128V : this.f3129W;
                        }
/* 42 */                if (m1935r(i2)) {
/* 52 */                    i += mo1927j() ? this.f3128V : this.f3129W;
                        }
/* 59 */                i += c0312a.f3196g;
                    }
/* 63 */            return i;
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: h */
                public final int mo1925h(View view, int i, int i2) {
                    int i3;
                    int i4;
/* 6 */             if (mo1927j()) {
/* 14 */                i3 = m1933p(i, i2) ? this.f3129W : 0;
/* 20 */                if ((this.f3127U & 4) <= 0) {
/* 25 */                    return i3;
                        }
/* 22 */                i4 = this.f3129W;
                    } else {
/* 32 */                i3 = m1933p(i, i2) ? this.f3128V : 0;
/* 38 */                if ((this.f3143w & 4) <= 0) {
/* 43 */                    return i3;
                        }
/* 40 */                i4 = this.f3128V;
                    }
/* 24 */            return i3 + i4;
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: i */
                public final int mo1926i(int i, int i2, int i3) {
/* 1 */             return ViewGroup.getChildMeasureSpec(i, i2, i3);
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: j */
                public final boolean mo1927j() {
/* 1 */             int i = this.f3130a;
                    return i == 0 || i == 1;
                }

                @Override // p000.kj0
                /* JADX INFO: renamed from: k */
                public final int mo1928k(View view) {
/* 1 */             return 0;
                }

                /* JADX INFO: renamed from: l */
                public final void m1929l(Canvas canvas, boolean z, boolean z2) {
/* 1 */             int paddingTop = getPaddingTop();
/* 16 */            int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
/* 22 */            int size = this.f3137d0.size();
/* 27 */            for (int i = 0; i < size; i++) {
/* 35 */                C0312a c0312a = (C0312a) this.f3137d0.get(i);
/* 40 */                for (int i2 = 0; i2 < c0312a.f3197h; i2++) {
/* 44 */                    int i3 = c0312a.f3204o + i2;
/* 45 */                    View viewM1932o = m1932o(i3);
/* 49 */                    if (viewM1932o != null && viewM1932o.getVisibility() != 8) {
/* 64 */                        LayoutParams layoutParams = (LayoutParams) viewM1932o.getLayoutParams();
/* 70 */                        if (m1933p(i3, i2)) {
/* 96 */                            m1930m(canvas, c0312a.f3190a, z2 ? viewM1932o.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewM1932o.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f3128V, c0312a.f3196g);
                                }
/* 103 */                       if (i2 == c0312a.f3197h - 1 && (this.f3143w & 4) > 0) {
/* 135 */                           m1930m(canvas, c0312a.f3190a, z2 ? (viewM1932o.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f3128V : viewM1932o.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, c0312a.f3196g);
                                }
                            }
                        }
/* 145 */               if (m1934q(i)) {
/* 157 */                   m1931n(canvas, z ? c0312a.f3192c : c0312a.f3190a - this.f3129W, paddingTop, iMax);
                        }
/* 164 */               if (m1935r(i) && (this.f3127U & 4) > 0) {
/* 182 */                   m1931n(canvas, z ? c0312a.f3190a - this.f3129W : c0312a.f3192c, paddingTop, iMax);
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m1930m(Canvas canvas, int i, int i2, int i3) {
/* 1 */             Drawable drawable = this.f3141i;
/* 3 */             if (drawable == null) {
/* 5 */                 return;
                    }
/* 10 */            drawable.setBounds(i, i2, i3 + i, this.f3128V + i2);
/* 15 */            this.f3141i.draw(canvas);
                }

                /* JADX INFO: renamed from: n */
                public final void m1931n(Canvas canvas, int i, int i2, int i3) {
/* 1 */             Drawable drawable = this.f3142v;
/* 3 */             if (drawable == null) {
/* 5 */                 return;
                    }
/* 10 */            drawable.setBounds(i, i2, this.f3129W + i, i3 + i2);
/* 15 */            this.f3142v.draw(canvas);
                }

                /* JADX INFO: renamed from: o */
                public final View m1932o(int i) {
/* 1 */             if (i < 0) {
/* 16 */                return null;
                    }
/* 3 */             int[] iArr = this.f3131a0;
/* 6 */             if (i >= iArr.length) {
/* 16 */                return null;
                    }
/* 11 */            return getChildAt(iArr[i]);
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
/* 3 */             if (this.f3142v == null && this.f3141i == null) {
/* 39 */                return;
                    }
/* 12 */            if (this.f3143w == 0 && this.f3127U == 0) {
/* 39 */                return;
                    }
/* 19 */            WeakHashMap weakHashMap = e33.f7494a;
/* 21 */            int layoutDirection = getLayoutDirection();
/* 25 */            int i = this.f3130a;
/* 30 */            if (i == 0) {
/* 91 */                m1918a(canvas, layoutDirection == 1, this.f3132b == 2);
/* 94 */                return;
                    }
/* 32 */            if (i == 1) {
/* 77 */                m1918a(canvas, layoutDirection != 1, this.f3132b == 2);
/* 80 */                return;
                    }
/* 34 */            if (i == 2) {
/* 53 */                boolean z = layoutDirection == 1;
/* 59 */                if (this.f3132b == 2) {
/* 61 */                    z = !z;
                        }
/* 63 */                m1929l(canvas, z, false);
/* 66 */                return;
                    }
/* 37 */            if (i != 3) {
/* 39 */                return;
                    }
/* 40 */            boolean z2 = layoutDirection == 1;
/* 45 */            if (this.f3132b == 2) {
/* 47 */                z2 = !z2;
                    }
/* 49 */            m1929l(canvas, z2, true);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 3 */             int layoutDirection = getLayoutDirection();
/* 7 */             int i5 = this.f3130a;
/* 11 */            if (i5 == 0) {
/* 93 */                boolean z2 = false;
/* 94 */                if (layoutDirection == 1) {
/* 96 */                    z2 = true;
                        }
/* 98 */                m1936s(i, i2, i3, i4, z2);
/* 101 */               return;
                    }
/* 13 */            if (i5 == 1) {
/* 79 */                boolean z3 = false;
/* 80 */                if (layoutDirection != 1) {
/* 82 */                    z3 = true;
                        }
/* 84 */                m1936s(i, i2, i3, i4, z3);
/* 87 */                return;
                    }
/* 16 */            if (i5 == 2) {
/* 54 */                boolean z4 = false;
/* 55 */                if (layoutDirection == 1) {
/* 57 */                    z4 = true;
                        }
/* 60 */                if (this.f3132b == 2) {
/* 62 */                    z4 = !z4;
                        }
/* 70 */                m1937t(i, i2, i3, i4, z4, false);
/* 73 */                return;
                    }
/* 19 */            if (i5 != 3) {
/* 45 */                s80.m8420a(this.f3130a, "Invalid flex direction is set: ");
/* 48 */                return;
                    }
/* 21 */            boolean z5 = layoutDirection == 1;
/* 26 */            if (this.f3132b == 2) {
/* 28 */                z5 = !z5;
                    }
/* 37 */            m1937t(i, i2, i3, i4, z5, true);
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 5 */             if (this.f3133b0 == null) {
/* 16 */                this.f3133b0 = new SparseIntArray(getChildCount());
                    }
/* 18 */            SparseIntArray sparseIntArray = this.f3133b0;
/* 20 */            C0313b c0313b = this.f3135c0;
/* 22 */            kj0 kj0Var = c0313b.f3208a;
/* 24 */            int flexItemCount = kj0Var.getFlexItemCount();
/* 33 */            if (sparseIntArray.size() != flexItemCount) {
/* 62 */                SparseIntArray sparseIntArray2 = this.f3133b0;
/* 66 */                int flexItemCount2 = c0313b.f3208a.getFlexItemCount();
/* 78 */                this.f3131a0 = C0313b.m1964r(flexItemCount2, c0313b.m1969f(flexItemCount2), sparseIntArray2);
                        break;
                    }
/* 37 */            for (int i3 = 0; i3 < flexItemCount; i3++) {
/* 39 */                View viewMo1924g = kj0Var.mo1924g(i3);
/* 43 */                if (viewMo1924g != null && ((FlexItem) viewMo1924g.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
/* 62 */                    SparseIntArray sparseIntArray3 = this.f3133b0;
/* 66 */                    int flexItemCount3 = c0313b.f3208a.getFlexItemCount();
/* 78 */                    this.f3131a0 = C0313b.m1964r(flexItemCount3, c0313b.m1969f(flexItemCount3), sparseIntArray3);
                            break;
                        }
                    }
/* 84 */            int i4 = this.f3130a;
/* 87 */            C1954n7 c1954n7 = this.f3139e0;
/* 91 */            if (i4 != 0 && i4 != 1) {
/* 96 */                if (i4 != 2 && i4 != 3) {
/* 105 */                   s80.m8420a(this.f3130a, "Invalid value for the flex direction is set: ");
/* 108 */                   return;
                        }
/* 111 */               this.f3137d0.clear();
/* 114 */               c1954n7.f14152c = null;
/* 116 */               c1954n7.f14151b = 0;
/* 132 */               this.f3135c0.m1966b(this.f3139e0, i2, i, AbstractC0208c9.API_PRIORITY_OTHER, 0, -1, null);
/* 142 */               this.f3137d0 = (List) c1954n7.f14152c;
/* 144 */               c0313b.m1971h(i, i2, 0);
/* 156 */               c0313b.m1970g(i, i2, getPaddingRight() + getPaddingLeft());
/* 159 */               c0313b.m1983u(0);
/* 166 */               m1938u(this.f3130a, i, i2, c1954n7.f14151b);
/* 169 */               return;
                    }
/* 176 */           this.f3137d0.clear();
/* 179 */           c1954n7.f14152c = null;
/* 181 */           c1954n7.f14151b = 0;
/* 193 */           this.f3135c0.m1966b(this.f3139e0, i, i2, AbstractC0208c9.API_PRIORITY_OTHER, 0, -1, null);
/* 200 */           this.f3137d0 = (List) c1954n7.f14152c;
/* 202 */           c0313b.m1971h(i, i2, 0);
/* 207 */           if (this.f3136d == 3) {
/* 219 */               for (C0312a c0312a : this.f3137d0) {
/* 227 */                   int iMax = Integer.MIN_VALUE;
/* 232 */                   for (int i5 = 0; i5 < c0312a.f3197h; i5++) {
/* 237 */                       View viewM1932o = m1932o(c0312a.f3204o + i5);
/* 241 */                       if (viewM1932o != null && viewM1932o.getVisibility() != 8) {
/* 256 */                           LayoutParams layoutParams = (LayoutParams) viewM1932o.getLayoutParams();
/* 258 */                           int i6 = this.f3132b;
/* 260 */                           int i7 = c0312a.f3201l;
/* 312 */                           iMax = i6 != 2 ? Math.max(iMax, viewM1932o.getMeasuredHeight() + Math.max(i7 - viewM1932o.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewM1932o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(viewM1932o.getBaseline() + (i7 - viewM1932o.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                                }
                            }
/* 319 */                   c0312a.f3196g = iMax;
                        }
                    }
/* 331 */           c0313b.m1970g(i, i2, getPaddingBottom() + getPaddingTop());
/* 334 */           c0313b.m1983u(0);
/* 341 */           m1938u(this.f3130a, i, i2, c1954n7.f14151b);
                }

                /* JADX INFO: renamed from: p */
                public final boolean m1933p(int i, int i2) {
/* 4 */             for (int i3 = 1; i3 <= i2; i3++) {
/* 8 */                 View viewM1932o = m1932o(i - i3);
/* 12 */                if (viewM1932o != null && viewM1932o.getVisibility() != 8) {
/* 26 */                    if (mo1927j()) {
                                return (this.f3127U & 2) != 0;
                            }
                            return (this.f3143w & 2) != 0;
                        }
                    }
/* 51 */            if (mo1927j()) {
                        return (this.f3127U & 1) != 0;
                    }
                    return (this.f3143w & 1) != 0;
                }

                /* JADX INFO: renamed from: q */
                public final boolean m1934q(int i) {
/* 2 */             if (i >= 0 && i < this.f3137d0.size()) {
/* 15 */                for (int i2 = 0; i2 < i; i2++) {
/* 29 */                    if (((C0312a) this.f3137d0.get(i2)).m1961a() > 0) {
/* 35 */                        if (mo1927j()) {
                                    return (this.f3143w & 2) != 0;
                                }
                                return (this.f3127U & 2) != 0;
                            }
                        }
/* 60 */                if (mo1927j()) {
                            return (this.f3143w & 1) != 0;
                        }
/* 72 */                if ((this.f3127U & 1) != 0) {
/* 14 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: r */
                public final boolean m1935r(int i) {
/* 2 */             if (i >= 0 && i < this.f3137d0.size()) {
/* 21 */                for (int i2 = i + 1; i2 < this.f3137d0.size(); i2++) {
/* 35 */                    if (((C0312a) this.f3137d0.get(i2)).m1961a() > 0) {
/* 1 */                         return false;
                            }
                        }
/* 45 */                if (mo1927j()) {
                            return (this.f3143w & 4) != 0;
                        }
/* 59 */                if ((this.f3127U & 4) != 0) {
/* 13 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
                /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:45:0x00db  */
                /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
                /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
                /* JADX WARN: Code duplicated, block: B:51:0x0103  */
                /* JADX WARN: Code duplicated, block: B:57:0x0117  */
                /* JADX WARN: Code duplicated, block: B:60:0x011d  */
                /* JADX WARN: Code duplicated, block: B:62:0x0122  */
                /* JADX WARN: Code duplicated, block: B:64:0x0147  */
                /* JADX WARN: Code duplicated, block: B:65:0x0169  */
                /* JADX WARN: Code duplicated, block: B:67:0x0179  */
                /* JADX WARN: Code duplicated, block: B:68:0x0191  */
                /* JADX WARN: Code duplicated, block: B:71:0x01c2  */
                /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
                /* JADX WARN: Code duplicated, block: B:75:0x01df  */
                /* JADX INFO: renamed from: s */
                public final void m1936s(int i, int i2, int i3, int i4, boolean z) {
                    float measuredWidth;
                    float f;
                    float f2;
                    float fMax;
                    int i5;
                    int i6;
                    View viewM1932o;
                    boolean z2;
                    int i7;
                    int i8;
                    float f3;
                    float f4;
                    int i9;
                    float f5;
                    int i10;
                    View view;
                    C0313b c0313b;
                    C0312a c0312a;
                    C0313b c0313b2;
/* 3 */             int paddingLeft = getPaddingLeft();
/* 7 */             int paddingRight = getPaddingRight();
/* 13 */            int i11 = i3 - i;
/* 19 */            int paddingBottom = (i4 - i2) - getPaddingBottom();
/* 20 */            int paddingTop = getPaddingTop();
/* 26 */            int size = this.f3137d0.size();
/* 31 */            for (int i12 = 0; i12 < size; i12++) {
/* 40 */                C0312a c0312a2 = (C0312a) this.f3137d0.get(i12);
/* 46 */                if (m1934q(i12)) {
/* 48 */                    int i13 = this.f3128V;
/* 50 */                    paddingBottom -= i13;
/* 51 */                    paddingTop += i13;
                        }
/* 52 */                int i14 = paddingBottom;
/* 54 */                int i15 = this.f3134c;
/* 56 */                char c = 4;
/* 57 */                int i16 = 2;
/* 59 */                boolean z3 = true;
/* 60 */                if (i15 == 0) {
                            measuredWidth = paddingLeft;
/* 186 */                   f = i11 - paddingRight;
                        } else if (i15 != 1) {
/* 66 */                    if (i15 == 2) {
/* 158 */                       int i17 = c0312a2.f3194e;
/* 164 */                       measuredWidth = paddingLeft + ((i11 - i17) / 2.0f);
/* 172 */                       f = (i11 - paddingRight) - ((i11 - i17) / 2.0f);
                            } else if (i15 == 3) {
                                measuredWidth = paddingLeft;
/* 135 */                       int iM1961a = c0312a2.m1961a();
/* 152 */                       f2 = (i11 - c0312a2.f3194e) / (iM1961a != 1 ? iM1961a - 1 : 1.0f);
/* 153 */                       f = i11 - paddingRight;
                            } else if (i15 == 4) {
/* 108 */                       int iM1961a2 = c0312a2.m1961a();
/* 122 */                       float f6 = iM1961a2 != 0 ? (i11 - c0312a2.f3194e) / iM1961a2 : 0.0f;
/* 124 */                       float f7 = f6 / 2.0f;
/* 126 */                       measuredWidth = paddingLeft + f7;
/* 130 */                       float f8 = (i11 - paddingRight) - f7;
/* 131 */                       f2 = f6;
/* 132 */                       f = f8;
                            } else {
/* 74 */                        if (i15 != 5) {
/* 104 */                           s80.m8420a(this.f3134c, "Invalid justifyContent is set: ");
/* 107 */                           return;
                                }
/* 76 */                        int iM1961a3 = c0312a2.m1961a();
/* 92 */                        f2 = iM1961a3 != 0 ? (i11 - c0312a2.f3194e) / (iM1961a3 + 1) : 0.0f;
/* 94 */                        measuredWidth = paddingLeft + f2;
/* 98 */                        f = (i11 - paddingRight) - f2;
                            }
/* 190 */                   fMax = Math.max(f2, 0.0f);
/* 194 */                   i5 = 0;
/* 197 */                   while (i5 < c0312a2.f3197h) {
/* 201 */                       i6 = c0312a2.f3204o + i5;
/* 202 */                       viewM1932o = m1932o(i6);
/* 206 */                       char c2 = c;
/* 208 */                       if (viewM1932o != null) {
/* 214 */                           z2 = z3;
/* 218 */                           if (viewM1932o.getVisibility() == 8) {
/* 220 */                               z2 = z2;
                                    } else {
/* 234 */                               LayoutParams layoutParams = (LayoutParams) viewM1932o.getLayoutParams();
/* 239 */                               f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
/* 243 */                               f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
/* 248 */                               if (m1933p(i6, i5)) {
/* 250 */                                   int i18 = this.f3129W;
                                            float f9 = i18;
/* 253 */                                   f3 += f9;
/* 254 */                                   f4 -= f9;
/* 255 */                                   i9 = i18;
                                        } else {
/* 260 */                                   i9 = 0;
                                        }
/* 257 */                               f5 = f4;
/* 267 */                               if (i5 == c0312a2.f3197h - 1 || (this.f3127U & 4) <= 0) {
/* 280 */                                   i10 = 0;
                                        } else {
/* 275 */                                   i10 = this.f3129W;
                                        }
/* 284 */                               if (this.f3132b == i16) {
/* 286 */                                   i8 = i16;
/* 287 */                                   c0313b2 = this.f3135c0;
/* 289 */                                   if (z) {
/* 318 */                                       view = viewM1932o;
/* 322 */                                       c0313b2.m1978o(view, c0312a2, Math.round(f5) - viewM1932o.getMeasuredWidth(), i14 - viewM1932o.getMeasuredHeight(), Math.round(f5), i14);
                                            } else {
/* 332 */                                       view = viewM1932o;
/* 358 */                                       c0313b2.m1978o(view, c0312a2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                                            }
/* 325 */                                   i7 = i14;
                                        } else {
/* 364 */                                   i5 = i5;
/* 366 */                                   view = viewM1932o;
/* 368 */                                   z2 = z2;
/* 370 */                                   i8 = i16;
/* 372 */                                   i7 = i14;
/* 374 */                                   c0313b = this.f3135c0;
/* 376 */                                   if (z) {
/* 398 */                                       c0313b.m1978o(view, c0312a2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                                            } else {
/* 402 */                                       int i19 = paddingTop;
/* 422 */                                       c0313b.m1978o(view, c0312a2, Math.round(f3), i19, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i19);
/* 425 */                                       paddingTop = i19;
                                            }
                                        }
/* 436 */                               measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
/* 447 */                               float measuredWidth2 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
/* 449 */                               if (z) {
/* 453 */                                   c0312a = c0312a2;
/* 458 */                                   c0312a.m1962b(view, i10, 0, i9, 0);
                                        } else {
/* 469 */                                   c0312a = c0312a2;
/* 473 */                                   c0312a.m1962b(view, i9, 0, i10, 0);
                                        }
/* 461 */                               c0312a2 = c0312a;
/* 477 */                               f = measuredWidth2;
                                    }
/* 484 */                           i5++;
/* 486 */                           c = c2;
/* 488 */                           i16 = i8;
/* 490 */                           z3 = z2;
/* 492 */                           i14 = i7;
                                } else {
/* 480 */                           z2 = z3;
                                }
/* 222 */                       i8 = i16;
/* 224 */                       i5 = i5;
/* 226 */                       i7 = i14;
/* 484 */                       i5++;
/* 486 */                       c = c2;
/* 488 */                       i16 = i8;
/* 490 */                       z3 = z2;
/* 492 */                       i14 = i7;
                            }
/* 498 */                   int i20 = c0312a2.f3196g;
/* 500 */                   paddingTop += i20;
/* 501 */                   paddingBottom = i14 - i20;
                        } else {
/* 175 */                   int i21 = c0312a2.f3194e;
/* 181 */                   f = i21 - paddingLeft;
/* 179 */                   measuredWidth = (i11 - i21) + paddingRight;
                        }
/* 173 */               f2 = 0.0f;
/* 190 */               fMax = Math.max(f2, 0.0f);
/* 194 */               i5 = 0;
/* 197 */               while (i5 < c0312a2.f3197h) {
/* 201 */                   i6 = c0312a2.f3204o + i5;
/* 202 */                   viewM1932o = m1932o(i6);
/* 206 */                   char c3 = c;
/* 208 */                   if (viewM1932o != null) {
/* 214 */                       z2 = z3;
/* 218 */                       if (viewM1932o.getVisibility() == 8) {
/* 220 */                           z2 = z2;
                                } else {
/* 234 */                           LayoutParams layoutParams2 = (LayoutParams) viewM1932o.getLayoutParams();
/* 239 */                           f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
/* 243 */                           f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
/* 248 */                           if (m1933p(i6, i5)) {
/* 250 */                               int i110 = this.f3129W;
                                        float f10 = i110;
/* 253 */                               f3 += f10;
/* 254 */                               f4 -= f10;
/* 255 */                               i9 = i110;
                                    } else {
/* 260 */                               i9 = 0;
                                    }
/* 257 */                           f5 = f4;
/* 267 */                           if (i5 == c0312a2.f3197h - 1) {
/* 280 */                               i10 = 0;
                                    } else {
/* 280 */                               i10 = 0;
                                    }
/* 284 */                           if (this.f3132b == i16) {
/* 286 */                               i8 = i16;
/* 287 */                               c0313b2 = this.f3135c0;
/* 289 */                               if (z) {
/* 318 */                                   view = viewM1932o;
/* 322 */                                   c0313b2.m1978o(view, c0312a2, Math.round(f5) - viewM1932o.getMeasuredWidth(), i14 - viewM1932o.getMeasuredHeight(), Math.round(f5), i14);
                                        } else {
/* 332 */                                   view = viewM1932o;
/* 358 */                                   c0313b2.m1978o(view, c0312a2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                                        }
/* 325 */                               i7 = i14;
                                    } else {
/* 364 */                               i5 = i5;
/* 366 */                               view = viewM1932o;
/* 368 */                               z2 = z2;
/* 370 */                               i8 = i16;
/* 372 */                               i7 = i14;
/* 374 */                               c0313b = this.f3135c0;
/* 376 */                               if (z) {
/* 398 */                                   c0313b.m1978o(view, c0312a2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                                        } else {
/* 402 */                                   int i111 = paddingTop;
/* 422 */                                   c0313b.m1978o(view, c0312a2, Math.round(f3), i111, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i111);
/* 425 */                                   paddingTop = i111;
                                        }
                                    }
/* 436 */                           measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
/* 447 */                           float measuredWidth3 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
/* 449 */                           if (z) {
/* 453 */                               c0312a = c0312a2;
/* 458 */                               c0312a.m1962b(view, i10, 0, i9, 0);
                                    } else {
/* 469 */                               c0312a = c0312a2;
/* 473 */                               c0312a.m1962b(view, i9, 0, i10, 0);
                                    }
/* 461 */                           c0312a2 = c0312a;
/* 477 */                           f = measuredWidth3;
                                }
/* 484 */                       i5++;
/* 486 */                       c = c3;
/* 488 */                       i16 = i8;
/* 490 */                       z3 = z2;
/* 492 */                       i14 = i7;
                            } else {
/* 480 */                       z2 = z3;
                            }
/* 222 */                   i8 = i16;
/* 224 */                   i5 = i5;
/* 226 */                   i7 = i14;
/* 484 */                   i5++;
/* 486 */                   c = c3;
/* 488 */                   i16 = i8;
/* 490 */                   z3 = z2;
/* 492 */                   i14 = i7;
                        }
/* 498 */               int i22 = c0312a2.f3196g;
/* 500 */               paddingTop += i22;
/* 501 */               paddingBottom = i14 - i22;
                    }
                }

                public void setAlignContent(int i) {
/* 3 */             if (this.f3138e != i) {
/* 5 */                 this.f3138e = i;
/* 7 */                 requestLayout();
                    }
                }

                public void setAlignItems(int i) {
/* 3 */             if (this.f3136d != i) {
/* 5 */                 this.f3136d = i;
/* 7 */                 requestLayout();
                    }
                }

                public void setDividerDrawable(Drawable drawable) {
/* 1 */             setDividerDrawableHorizontal(drawable);
/* 4 */             setDividerDrawableVertical(drawable);
                }

                public void setDividerDrawableHorizontal(Drawable drawable) {
/* 3 */             if (drawable == this.f3141i) {
/* 5 */                 return;
                    }
/* 6 */             this.f3141i = drawable;
/* 9 */             if (drawable != null) {
/* 15 */                this.f3128V = drawable.getIntrinsicHeight();
                    } else {
/* 18 */                this.f3128V = 0;
                    }
/* 22 */            if (this.f3141i == null && this.f3142v == null) {
/* 29 */                setWillNotDraw(true);
                    } else {
/* 33 */                setWillNotDraw(false);
                    }
/* 36 */            requestLayout();
                }

                public void setDividerDrawableVertical(Drawable drawable) {
/* 3 */             if (drawable == this.f3142v) {
/* 5 */                 return;
                    }
/* 6 */             this.f3142v = drawable;
/* 9 */             if (drawable != null) {
/* 15 */                this.f3129W = drawable.getIntrinsicWidth();
                    } else {
/* 18 */                this.f3129W = 0;
                    }
/* 22 */            if (this.f3141i == null && this.f3142v == null) {
/* 29 */                setWillNotDraw(true);
                    } else {
/* 33 */                setWillNotDraw(false);
                    }
/* 36 */            requestLayout();
                }

                public void setFlexDirection(int i) {
/* 3 */             if (this.f3130a != i) {
/* 5 */                 this.f3130a = i;
/* 7 */                 requestLayout();
                    }
                }

                @Override // p000.kj0
                public void setFlexLines(List<C0312a> list) {
/* 1 */             this.f3137d0 = list;
                }

                public void setFlexWrap(int i) {
/* 3 */             if (this.f3132b != i) {
/* 5 */                 this.f3132b = i;
/* 7 */                 requestLayout();
                    }
                }

                public void setJustifyContent(int i) {
/* 3 */             if (this.f3134c != i) {
/* 5 */                 this.f3134c = i;
/* 7 */                 requestLayout();
                    }
                }

                public void setMaxLine(int i) {
/* 3 */             if (this.f3140f != i) {
/* 5 */                 this.f3140f = i;
/* 7 */                 requestLayout();
                    }
                }

                public void setShowDivider(int i) {
/* 1 */             setShowDividerVertical(i);
/* 4 */             setShowDividerHorizontal(i);
                }

                public void setShowDividerHorizontal(int i) {
/* 3 */             if (i != this.f3143w) {
/* 5 */                 this.f3143w = i;
/* 7 */                 requestLayout();
                    }
                }

                public void setShowDividerVertical(int i) {
/* 3 */             if (i != this.f3127U) {
/* 5 */                 this.f3127U = i;
/* 7 */                 requestLayout();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
                /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
                /* JADX WARN: Code duplicated, block: B:46:0x00de  */
                /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
                /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
                /* JADX WARN: Code duplicated, block: B:57:0x010d  */
                /* JADX WARN: Code duplicated, block: B:60:0x0114 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:61:0x0116  */
                /* JADX WARN: Code duplicated, block: B:63:0x0137  */
                /* JADX WARN: Code duplicated, block: B:64:0x0154  */
                /* JADX WARN: Code duplicated, block: B:66:0x015c  */
                /* JADX WARN: Code duplicated, block: B:67:0x0176  */
                /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
                /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
                /* JADX WARN: Code duplicated, block: B:74:0x01c3  */
                /* JADX INFO: renamed from: t */
                public final void m1937t(int i, int i2, int i3, int i4, boolean z, boolean z2) {
                    float measuredHeight;
                    float f;
                    float f2;
                    float fMax;
                    int i5;
                    int i6;
                    int i7;
                    View viewM1932o;
                    char c;
                    int i8;
                    int i9;
                    float f3;
                    float f4;
                    int i10;
                    float f5;
                    int i11;
                    C0313b c0313b;
                    C0312a c0312a;
/* 3 */             int paddingTop = getPaddingTop();
/* 7 */             int paddingBottom = getPaddingBottom();
/* 11 */            int paddingRight = getPaddingRight();
/* 15 */            int paddingLeft = getPaddingLeft();
/* 21 */            int i12 = i4 - i2;
/* 23 */            int i13 = (i3 - i) - paddingRight;
/* 26 */            int size = this.f3137d0.size();
/* 31 */            for (int i14 = 0; i14 < size; i14++) {
/* 40 */                C0312a c0312a2 = (C0312a) this.f3137d0.get(i14);
/* 46 */                if (m1934q(i14)) {
/* 48 */                    int i15 = this.f3129W;
/* 50 */                    paddingLeft += i15;
/* 51 */                    i13 -= i15;
                        }
/* 52 */                int i16 = i13;
/* 54 */                int i17 = this.f3134c;
/* 56 */                char c2 = 4;
/* 58 */                int i18 = 1;
/* 59 */                if (i17 == 0) {
                            measuredHeight = paddingTop;
/* 182 */                   f = i12 - paddingBottom;
                        } else if (i17 != 1) {
/* 66 */                    if (i17 == 2) {
/* 163 */                       float f6 = (i12 - c0312a2.f3194e) / 2.0f;
/* 164 */                       measuredHeight = paddingTop + f6;
/* 168 */                       f = (i12 - paddingBottom) - f6;
                            } else if (i17 == 3) {
                                measuredHeight = paddingTop;
/* 134 */                       int iM1961a = c0312a2.m1961a();
/* 151 */                       f2 = (i12 - c0312a2.f3194e) / (iM1961a != 1 ? iM1961a - 1 : 1.0f);
/* 153 */                       f = i12 - paddingBottom;
                            } else if (i17 == 4) {
/* 108 */                       int iM1961a2 = c0312a2.m1961a();
/* 122 */                       f2 = iM1961a2 != 0 ? (i12 - c0312a2.f3194e) / iM1961a2 : 0.0f;
/* 124 */                       float f7 = f2 / 2.0f;
/* 126 */                       measuredHeight = paddingTop + f7;
/* 130 */                       f = (i12 - paddingBottom) - f7;
                            } else {
/* 74 */                        if (i17 != 5) {
/* 104 */                           s80.m8420a(this.f3134c, "Invalid justifyContent is set: ");
/* 107 */                           return;
                                }
/* 76 */                        int iM1961a3 = c0312a2.m1961a();
/* 92 */                        f2 = iM1961a3 != 0 ? (i12 - c0312a2.f3194e) / (iM1961a3 + 1) : 0.0f;
/* 94 */                        measuredHeight = paddingTop + f2;
/* 98 */                        f = (i12 - paddingBottom) - f2;
                            }
/* 186 */                   fMax = Math.max(f2, 0.0f);
/* 190 */                   i5 = 0;
/* 193 */                   while (i5 < c0312a2.f3197h) {
/* 197 */                       i6 = c0312a2.f3204o + i5;
/* 198 */                       i7 = i18;
/* 199 */                       viewM1932o = m1932o(i6);
/* 203 */                       if (viewM1932o != null) {
/* 209 */                           c = c2;
/* 213 */                           if (viewM1932o.getVisibility() == 8) {
/* 227 */                               LayoutParams layoutParams = (LayoutParams) viewM1932o.getLayoutParams();
/* 232 */                               f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
/* 236 */                               f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
/* 241 */                               if (m1933p(i6, i5)) {
/* 243 */                                   i10 = this.f3128V;
                                            float f8 = i10;
/* 246 */                                   f3 += f8;
/* 247 */                                   f4 -= f8;
                                        } else {
/* 251 */                                   i10 = 0;
                                        }
/* 248 */                               f5 = f4;
/* 256 */                               if (i5 == c0312a2.f3197h - i7 || (this.f3143w & 4) <= 0) {
/* 270 */                                   i11 = 0;
                                        } else {
/* 264 */                                   i11 = this.f3128V;
                                        }
/* 268 */                               i9 = i5;
/* 273 */                               c0313b = this.f3135c0;
/* 275 */                               if (z) {
/* 277 */                                   if (z2) {
/* 306 */                                       c0313b.m1979p(viewM1932o, c0312a2, true, i16 - viewM1932o.getMeasuredWidth(), Math.round(f5) - viewM1932o.getMeasuredHeight(), i16, Math.round(f5));
                                            } else {
/* 337 */                                       c0313b.m1979p(viewM1932o, c0312a2, true, i16 - viewM1932o.getMeasuredWidth(), Math.round(f3), i16, viewM1932o.getMeasuredHeight() + Math.round(f3));
                                            }
/* 309 */                                   i8 = i16;
                                        } else {
/* 341 */                                   i9 = i9;
/* 343 */                                   i7 = i7;
/* 345 */                                   i8 = i16;
/* 347 */                                   if (z2) {
/* 371 */                                       c0313b.m1979p(viewM1932o, c0312a2, false, paddingLeft, Math.round(f5) - viewM1932o.getMeasuredHeight(), viewM1932o.getMeasuredWidth() + paddingLeft, Math.round(f5));
                                            } else {
/* 375 */                                       int i19 = paddingLeft;
/* 397 */                                       c0313b.m1979p(viewM1932o, c0312a2, false, i19, Math.round(f3), viewM1932o.getMeasuredWidth() + i19, viewM1932o.getMeasuredHeight() + Math.round(f3));
/* 400 */                                       paddingLeft = i19;
                                            }
                                        }
/* 412 */                               measuredHeight = f3 + viewM1932o.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
/* 424 */                               float measuredHeight2 = f5 - ((viewM1932o.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
/* 426 */                               if (z2) {
/* 428 */                                   c0312a = c0312a2;
/* 434 */                                   c0312a.m1962b(viewM1932o, 0, i11, 0, i10);
                                        } else {
/* 440 */                                   c0312a = c0312a2;
/* 445 */                                   c0312a.m1962b(viewM1932o, 0, i10, 0, i11);
                                        }
/* 437 */                               c0312a2 = c0312a;
/* 449 */                               f = measuredHeight2;
                                    }
/* 456 */                           i5 = i9 + 1;
/* 458 */                           c2 = c;
/* 460 */                           i18 = i7;
/* 462 */                           i16 = i8;
                                } else {
/* 452 */                           c = c2;
                                }
/* 215 */                       i9 = i5;
/* 217 */                       i7 = i7;
/* 219 */                       i8 = i16;
/* 456 */                       i5 = i9 + 1;
/* 458 */                       c2 = c;
/* 460 */                       i18 = i7;
/* 462 */                       i16 = i8;
                            }
/* 468 */                   int i20 = c0312a2.f3196g;
/* 470 */                   paddingLeft += i20;
/* 471 */                   i13 = i16 - i20;
                        } else {
/* 171 */                   int i21 = c0312a2.f3194e;
/* 177 */                   f = i21 - paddingTop;
/* 175 */                   measuredHeight = (i12 - i21) + paddingBottom;
                        }
/* 169 */               f2 = 0.0f;
/* 186 */               fMax = Math.max(f2, 0.0f);
/* 190 */               i5 = 0;
/* 193 */               while (i5 < c0312a2.f3197h) {
/* 197 */                   i6 = c0312a2.f3204o + i5;
/* 198 */                   i7 = i18;
/* 199 */                   viewM1932o = m1932o(i6);
/* 203 */                   if (viewM1932o != null) {
/* 209 */                       c = c2;
/* 213 */                       if (viewM1932o.getVisibility() == 8) {
/* 227 */                           LayoutParams layoutParams2 = (LayoutParams) viewM1932o.getLayoutParams();
/* 232 */                           f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
/* 236 */                           f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
/* 241 */                           if (m1933p(i6, i5)) {
/* 243 */                               i10 = this.f3128V;
                                        float f9 = i10;
/* 246 */                               f3 += f9;
/* 247 */                               f4 -= f9;
                                    } else {
/* 251 */                               i10 = 0;
                                    }
/* 248 */                           f5 = f4;
/* 256 */                           if (i5 == c0312a2.f3197h - i7) {
/* 270 */                               i11 = 0;
                                    } else {
/* 270 */                               i11 = 0;
                                    }
/* 268 */                           i9 = i5;
/* 273 */                           c0313b = this.f3135c0;
/* 275 */                           if (z) {
/* 277 */                               if (z2) {
/* 306 */                                   c0313b.m1979p(viewM1932o, c0312a2, true, i16 - viewM1932o.getMeasuredWidth(), Math.round(f5) - viewM1932o.getMeasuredHeight(), i16, Math.round(f5));
                                        } else {
/* 337 */                                   c0313b.m1979p(viewM1932o, c0312a2, true, i16 - viewM1932o.getMeasuredWidth(), Math.round(f3), i16, viewM1932o.getMeasuredHeight() + Math.round(f3));
                                        }
/* 309 */                               i8 = i16;
                                    } else {
/* 341 */                               i9 = i9;
/* 343 */                               i7 = i7;
/* 345 */                               i8 = i16;
/* 347 */                               if (z2) {
/* 371 */                                   c0313b.m1979p(viewM1932o, c0312a2, false, paddingLeft, Math.round(f5) - viewM1932o.getMeasuredHeight(), viewM1932o.getMeasuredWidth() + paddingLeft, Math.round(f5));
                                        } else {
/* 375 */                                   int i110 = paddingLeft;
/* 397 */                                   c0313b.m1979p(viewM1932o, c0312a2, false, i110, Math.round(f3), viewM1932o.getMeasuredWidth() + i110, viewM1932o.getMeasuredHeight() + Math.round(f3));
/* 400 */                                   paddingLeft = i110;
                                        }
                                    }
/* 412 */                           measuredHeight = f3 + viewM1932o.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
/* 424 */                           float measuredHeight3 = f5 - ((viewM1932o.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
/* 426 */                           if (z2) {
/* 428 */                               c0312a = c0312a2;
/* 434 */                               c0312a.m1962b(viewM1932o, 0, i11, 0, i10);
                                    } else {
/* 440 */                               c0312a = c0312a2;
/* 445 */                               c0312a.m1962b(viewM1932o, 0, i10, 0, i11);
                                    }
/* 437 */                           c0312a2 = c0312a;
/* 449 */                           f = measuredHeight3;
                                }
/* 456 */                       i5 = i9 + 1;
/* 458 */                       c2 = c;
/* 460 */                       i18 = i7;
/* 462 */                       i16 = i8;
                            } else {
/* 452 */                       c = c2;
                            }
/* 215 */                   i9 = i5;
/* 217 */                   i7 = i7;
/* 219 */                   i8 = i16;
/* 456 */                   i5 = i9 + 1;
/* 458 */                   c2 = c;
/* 460 */                   i18 = i7;
/* 462 */                   i16 = i8;
                        }
/* 468 */               int i22 = c0312a2.f3196g;
/* 470 */               paddingLeft += i22;
/* 471 */               i13 = i16 - i22;
                    }
                }

                /* JADX INFO: renamed from: u */
                public final void m1938u(int i, int i2, int i3, int i4) {
                    int paddingBottom;
                    int largestMainSize;
                    int iResolveSizeAndState;
                    int iResolveSizeAndState2;
/* 1 */             int mode = View.MeasureSpec.getMode(i2);
/* 5 */             int size = View.MeasureSpec.getSize(i2);
/* 9 */             int mode2 = View.MeasureSpec.getMode(i3);
/* 13 */            int size2 = View.MeasureSpec.getSize(i3);
/* 17 */            if (i == 0 || i == 1) {
/* 71 */                paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
/* 72 */                largestMainSize = getLargestMainSize();
                    } else {
/* 23 */                if (i != 2 && i != 3) {
/* 35 */                    C1951n4.m6859j(fm0.m3781g(i, "Invalid flex direction: "));
/* 38 */                    return;
                        }
/* 39 */                paddingBottom = getLargestMainSize();
/* 56 */                largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
                    }
/* 82 */            if (mode == Integer.MIN_VALUE) {
/* 114 */               if (size < largestMainSize) {
/* 116 */                   i4 = View.combineMeasuredStates(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        } else {
/* 121 */                   size = largestMainSize;
                        }
/* 122 */               iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
                    } else if (mode == 0) {
/* 109 */               iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
                    } else if (mode != 1073741824) {
/* 105 */               f42.m3656l(fm0.m3781g(mode, "Unknown width mode is set: "));
/* 108 */               return;
                    } else {
/* 88 */                if (size < largestMainSize) {
/* 90 */                    i4 = View.combineMeasuredStates(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        }
/* 94 */                iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
                    }
/* 128 */           if (mode2 == Integer.MIN_VALUE) {
/* 160 */               if (size2 < paddingBottom) {
/* 162 */                   i4 = View.combineMeasuredStates(i4, NotificationCompat.FLAG_LOCAL_ONLY);
                        } else {
/* 167 */                   size2 = paddingBottom;
                        }
/* 168 */               iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
                    } else if (mode2 == 0) {
/* 155 */               iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
                    } else if (mode2 != 1073741824) {
/* 151 */               f42.m3656l(fm0.m3781g(mode2, "Unknown height mode is set: "));
/* 154 */               return;
                    } else {
/* 134 */               if (size2 < paddingBottom) {
/* 136 */                   i4 = View.combineMeasuredStates(i4, NotificationCompat.FLAG_LOCAL_ONLY);
                        }
/* 140 */               iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
                    }
/* 172 */           setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
                }

                @Override // android.view.ViewGroup
/* 134 */       public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 135 */           return new LayoutParams(getContext(), attributeSet);
                }

/* 155 */       public FlexboxLayout(Context context, AttributeSet attributeSet) {
/* 156 */           this(context, attributeSet, 0);
                }
            }
