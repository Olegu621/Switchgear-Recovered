            package androidx.viewpager2.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import android.view.Gravity;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityNodeInfo;
            import androidx.recyclerview.widget.AbstractC0129g;
            import androidx.recyclerview.widget.AbstractC0133k;
            import androidx.viewpager2.R$styleable;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            import okio.Segment;
            import p000.C0828d1;
            import p000.C1951n4;
            import p000.RunnableC2503ym;
            import p000.c82;
            import p000.d82;
            import p000.e33;
            import p000.er0;
            import p000.f42;
            import p000.f43;
            import p000.g43;
            import p000.h43;
            import p000.i43;
            import p000.k43;
            import p000.l43;
            import p000.m43;
            import p000.n12;
            import p000.qc3;
            import p000.ra2;
            import p000.ts0;
            import p000.zq1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 51 */    public final class ViewPager2 extends ViewGroup {

                /* JADX INFO: renamed from: U */
                public m43 f2007U;

                /* JADX INFO: renamed from: V */
                public l43 f2008V;

                /* JADX INFO: renamed from: W */
                public d82 f2009W;

                /* JADX INFO: renamed from: a */
                public final Rect f2010a;

                /* JADX INFO: renamed from: a0 */
                public g43 f2011a0;

                /* JADX INFO: renamed from: b */
                public final Rect f2012b;

                /* JADX INFO: renamed from: b0 */
                public qc3 f2013b0;

                /* JADX INFO: renamed from: c */
                public final g43 f2014c;

                /* JADX INFO: renamed from: c0 */
                public zq1 f2015c0;

                /* JADX INFO: renamed from: d */
                public int f2016d;

                /* JADX INFO: renamed from: d0 */
                public n12 f2017d0;

                /* JADX INFO: renamed from: e */
                public boolean f2018e;

                /* JADX INFO: renamed from: e0 */
                public boolean f2019e0;

                /* JADX INFO: renamed from: f */
                public final f43 f2020f;

                /* JADX INFO: renamed from: f0 */
                public boolean f2021f0;

                /* JADX INFO: renamed from: g0 */
                public int f2022g0;

                /* JADX INFO: renamed from: h0 */
                public ra2 f2023h0;

                /* JADX INFO: renamed from: i */
                public i43 f2024i;

                /* JADX INFO: renamed from: v */
                public int f2025v;

                /* JADX INFO: renamed from: w */
                public Parcelable f2026w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends View.BaseSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0149a();

                    /* JADX INFO: renamed from: a */
                    public int f2027a;

                    /* JADX INFO: renamed from: b */
                    public int f2028b;

                    /* JADX INFO: renamed from: c */
                    public Parcelable f2029c;

                    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeInt(this.f2027a);
/* 11 */                parcel.writeInt(this.f2028b);
/* 16 */                parcel.writeParcelable(this.f2029c, i);
                    }
                }

                public ViewPager2(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 9 */             this.f2010a = new Rect();
/* 16 */            this.f2012b = new Rect();
/* 23 */            this.f2014c = new g43();
/* 26 */            this.f2018e = false;
/* 34 */            this.f2020f = new f43(this, 0);
/* 37 */            this.f2025v = -1;
/* 40 */            this.f2017d0 = null;
/* 42 */            this.f2019e0 = false;
/* 45 */            this.f2021f0 = true;
/* 47 */            this.f2022g0 = -1;
/* 49 */            m1140a(context, attributeSet);
                }

                /* JADX INFO: renamed from: a */
                public final void m1140a(Context context, AttributeSet attributeSet) {
/* 3 */             ra2 ra2Var = new ra2();
/* 6 */             ra2Var.f15958d = this;
/* 13 */            ra2Var.f15955a = new ts0(ra2Var);
/* 22 */            ra2Var.f15956b = new er0(ra2Var, 24);
/* 24 */            this.f2023h0 = ra2Var;
/* 28 */            m43 m43Var = new m43(this, context);
/* 31 */            this.f2007U = m43Var;
/* 33 */            WeakHashMap weakHashMap = e33.f7494a;
/* 39 */            m43Var.setId(View.generateViewId());
/* 46 */            this.f2007U.setDescendantFocusability(131072);
/* 51 */            i43 i43Var = new i43(this);
/* 54 */            this.f2024i = i43Var;
/* 58 */            this.f2007U.setLayoutManager(i43Var);
/* 63 */            int i = 1;
/* 64 */            this.f2007U.setScrollingTouchSlop(1);
/* 69 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ViewPager2);
/* 77 */            if (Build.VERSION.SDK_INT >= 29) {
/* 8 */                 saveAttributeDataForStyleable(context, R$styleable.ViewPager2, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
                    }
                    try {
/* 86 */                int i2 = 0;
/* 91 */                setOrientation(typedArrayObtainStyledAttributes.getInt(R$styleable.ViewPager2_android_orientation, 0));
/* 94 */                typedArrayObtainStyledAttributes.recycle();
/* 105 */               this.f2007U.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
/* 108 */               m43 m43Var2 = this.f2007U;
/* 112 */               h43 h43Var = new h43();
/* 117 */               if (m43Var2.f1668p0 == null) {
/* 124 */                   m43Var2.f1668p0 = new ArrayList();
                        }
/* 128 */               m43Var2.f1668p0.add(h43Var);
/* 133 */               d82 d82Var = new d82(this);
/* 136 */               this.f2009W = d82Var;
/* 145 */               this.f2013b0 = new qc3(d82Var, 26);
/* 149 */               l43 l43Var = new l43(this);
/* 152 */               this.f2008V = l43Var;
/* 156 */               l43Var.m1415a(this.f2007U);
/* 163 */               this.f2007U.m882h(this.f2009W);
/* 168 */               g43 g43Var = new g43();
/* 171 */               this.f2011a0 = g43Var;
/* 175 */               this.f2009W.f7042a = g43Var;
/* 179 */               g43 g43Var2 = new g43(this, i2);
/* 184 */               g43 g43Var3 = new g43(this, i);
/* 191 */               ((ArrayList) g43Var.f8471b).add(g43Var2);
/* 200 */               ((ArrayList) this.f2011a0.f8471b).add(g43Var3);
/* 203 */               ra2 ra2Var2 = this.f2023h0;
/* 205 */               m43 m43Var3 = this.f2007U;
/* 207 */               ra2Var2.getClass();
/* 211 */               m43Var3.setImportantForAccessibility(2);
/* 219 */               ra2Var2.f15957c = new f43(ra2Var2, i);
/* 223 */               ViewPager2 viewPager2 = (ViewPager2) ra2Var2.f15958d;
/* 229 */               if (viewPager2.getImportantForAccessibility() == 0) {
/* 231 */                   viewPager2.setImportantForAccessibility(1);
                        }
/* 242 */               ((ArrayList) this.f2011a0.f8471b).add(this.f2014c);
/* 247 */               zq1 zq1Var = new zq1();
/* 250 */               this.f2015c0 = zq1Var;
/* 258 */               ((ArrayList) this.f2011a0.f8471b).add(zq1Var);
/* 261 */               m43 m43Var4 = this.f2007U;
/* 267 */               attachViewToParent(m43Var4, 0, m43Var4.getLayoutParams());
                    } catch (Throwable th) {
/* 272 */               typedArrayObtainStyledAttributes.recycle();
/* 275 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m1141b() {
                    AbstractC0129g adapter;
/* 4 */             if (this.f2025v == -1 || (adapter = getAdapter()) == null) {
/* 13 */                return;
                    }
/* 16 */            if (this.f2026w != null) {
/* 19 */                this.f2026w = null;
                    }
/* 34 */            int iMax = Math.max(0, Math.min(this.f2025v, adapter.mo955a() - 1));
/* 38 */            this.f2016d = iMax;
/* 40 */            this.f2025v = -1;
/* 44 */            this.f2007U.m875c0(iMax);
/* 49 */            this.f2023h0.m8118w();
                }

                /* JADX INFO: renamed from: c */
                public final void m1142c(int i) {
                    g43 g43Var;
/* 1 */             AbstractC0129g adapter = getAdapter();
/* 6 */             if (adapter == null) {
/* 11 */                if (this.f2025v != -1) {
/* 17 */                    this.f2025v = Math.max(i, 0);
/* 19 */                    return;
                        }
/* 54 */                return;
                    }
/* 24 */            if (adapter.mo955a() <= 0) {
/* 54 */                return;
                    }
/* 37 */            int iMin = Math.min(Math.max(i, 0), adapter.mo955a() - 1);
/* 41 */            int i2 = this.f2016d;
/* 43 */            if ((iMin == i2 && this.f2009W.f7047f == 0) || iMin == i2) {
/* 54 */                return;
                    }
                    double d = i2;
/* 56 */            this.f2016d = iMin;
/* 60 */            this.f2023h0.m8118w();
/* 63 */            d82 d82Var = this.f2009W;
/* 67 */            if (d82Var.f7047f != 0) {
/* 70 */                d82Var.m2964e();
/* 73 */                c82 c82Var = d82Var.f7048g;
/* 81 */                d = ((double) c82Var.f2764a) + ((double) c82Var.f2765b);
                    }
/* 82 */            d82 d82Var2 = this.f2009W;
/* 84 */            d82Var2.getClass();
/* 88 */            d82Var2.f7046e = 2;
/* 92 */            boolean z = d82Var2.f7050i != iMin;
/* 95 */            d82Var2.f7050i = iMin;
/* 97 */            d82Var2.m2962c(2);
/* 100 */           if (z && (g43Var = d82Var2.f7042a) != null) {
/* 106 */               g43Var.mo3873c(iMin);
                    }
                    double d2 = iMin;
/* 112 */           double dAbs = Math.abs(d2 - d);
/* 120 */           m43 m43Var = this.f2007U;
/* 122 */           if (dAbs <= 3.0d) {
/* 147 */               m43Var.m877e0(iMin);
/* 150 */               return;
                    }
/* 133 */           m43Var.m875c0(d2 > d ? iMin - 3 : iMin + 3);
/* 136 */           m43 m43Var2 = this.f2007U;
/* 143 */           m43Var2.post(new RunnableC2503ym(iMin, m43Var2));
                }

                @Override // android.view.View
                public final boolean canScrollHorizontally(int i) {
/* 3 */             return this.f2007U.canScrollHorizontally(i);
                }

                @Override // android.view.View
                public final boolean canScrollVertically(int i) {
/* 3 */             return this.f2007U.canScrollVertically(i);
                }

                /* JADX INFO: renamed from: d */
                public final void m1143d() {
/* 1 */             l43 l43Var = this.f2008V;
/* 3 */             if (l43Var == null) {
/* 44 */                f42.m3656l("Design assumption violated.");
/* 47 */                return;
                    }
/* 7 */             View viewMo1417e = l43Var.mo1417e(this.f2024i);
/* 11 */            if (viewMo1417e == null) {
/* 13 */                return;
                    }
/* 16 */            this.f2024i.getClass();
/* 19 */            int iM974O = AbstractC0133k.m974O(viewMo1417e);
/* 25 */            if (iM974O != this.f2016d && getScrollState() == 0) {
/* 35 */                this.f2011a0.mo3873c(iM974O);
                    }
/* 39 */            this.f2018e = false;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
/* 9 */             Parcelable parcelable = (Parcelable) sparseArray.get(getId());
/* 13 */            if (parcelable instanceof SavedState) {
/* 17 */                int i = ((SavedState) parcelable).f2027a;
/* 29 */                sparseArray.put(this.f2007U.getId(), sparseArray.get(i));
/* 32 */                sparseArray.remove(i);
                    }
/* 35 */            super.dispatchRestoreInstanceState(sparseArray);
/* 38 */            m1141b();
                }

                @Override // android.view.ViewGroup, android.view.View
                public CharSequence getAccessibilityClassName() {
/* 3 */             this.f2023h0.getClass();
/* 8 */             this.f2023h0.getClass();
/* 11 */            return "androidx.viewpager.widget.ViewPager";
                }

                public AbstractC0129g getAdapter() {
/* 3 */             return this.f2007U.getAdapter();
                }

                public int getCurrentItem() {
/* 1 */             return this.f2016d;
                }

                public int getItemDecorationCount() {
/* 3 */             return this.f2007U.getItemDecorationCount();
                }

                public int getOffscreenPageLimit() {
/* 1 */             return this.f2022g0;
                }

                public int getOrientation() {
/* 3 */             return this.f2024i.f1586a0;
                }

                public int getPageSize() {
                    int height;
                    int paddingBottom;
/* 1 */             m43 m43Var = this.f2007U;
/* 7 */             if (getOrientation() == 0) {
/* 17 */                height = m43Var.getWidth() - m43Var.getPaddingLeft();
/* 18 */                paddingBottom = m43Var.getPaddingRight();
                    } else {
/* 32 */                height = m43Var.getHeight() - m43Var.getPaddingTop();
/* 33 */                paddingBottom = m43Var.getPaddingBottom();
                    }
/* 22 */            return height - paddingBottom;
                }

                public int getScrollState() {
/* 3 */             return this.f2009W.f7047f;
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                    int iMo955a;
                    int iMo955a2;
                    int iMo955a3;
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 8 */             ViewPager2 viewPager2 = (ViewPager2) this.f2023h0.f15958d;
/* 16 */            if (viewPager2.getAdapter() == null) {
/* 45 */                iMo955a = 0;
/* 46 */                iMo955a2 = 0;
                    } else if (viewPager2.getOrientation() == 1) {
/* 28 */                iMo955a = viewPager2.getAdapter().mo955a();
/* 32 */                iMo955a2 = 0;
                    } else {
/* 38 */                iMo955a2 = viewPager2.getAdapter().mo955a();
/* 43 */                iMo955a = 0;
                    }
/* 55 */            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0828d1.m2904b(iMo955a, iMo955a2, 0).f6954a);
/* 58 */            AbstractC0129g adapter = viewPager2.getAdapter();
/* 62 */            if (adapter == null || (iMo955a3 = adapter.mo955a()) == 0 || !viewPager2.f2021f0) {
/* 98 */                return;
                    }
/* 78 */            if (viewPager2.f2016d > 0) {
/* 82 */                accessibilityNodeInfo.addAction(Segment.SIZE);
                    }
/* 88 */            if (viewPager2.f2016d < iMo955a3 - 1) {
/* 92 */                accessibilityNodeInfo.addAction(4096);
                    }
/* 95 */            accessibilityNodeInfo.setScrollable(true);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 3 */             int measuredWidth = this.f2007U.getMeasuredWidth();
/* 9 */             int measuredHeight = this.f2007U.getMeasuredHeight();
/* 13 */            int paddingLeft = getPaddingLeft();
/* 17 */            Rect rect = this.f2010a;
/* 19 */            rect.left = paddingLeft;
/* 27 */            rect.right = (i3 - i) - getPaddingRight();
/* 33 */            rect.top = getPaddingTop();
/* 41 */            rect.bottom = (i4 - i2) - getPaddingBottom();
/* 46 */            Rect rect2 = this.f2012b;
/* 48 */            Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
/* 61 */            this.f2007U.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
/* 66 */            if (this.f2018e) {
/* 68 */                m1143d();
                    }
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 3 */             measureChild(this.f2007U, i, i2);
/* 8 */             int measuredWidth = this.f2007U.getMeasuredWidth();
/* 14 */            int measuredHeight = this.f2007U.getMeasuredHeight();
/* 20 */            int measuredState = this.f2007U.getMeasuredState();
/* 33 */            int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
/* 43 */            int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
/* 70 */            setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 15 */            super.onRestoreInstanceState(savedState.getSuperState());
/* 20 */            this.f2025v = savedState.f2028b;
/* 24 */            this.f2026w = savedState.f2029c;
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 16 */            savedState.f2027a = this.f2007U.getId();
/* 18 */            int i = this.f2025v;
/* 21 */            if (i == -1) {
/* 23 */                i = this.f2016d;
                    }
/* 25 */            savedState.f2028b = i;
/* 27 */            Parcelable parcelable = this.f2026w;
/* 29 */            if (parcelable != null) {
/* 31 */                savedState.f2029c = parcelable;
/* 33 */                return savedState;
                    }
/* 36 */            this.f2007U.getAdapter();
/* 39 */            return savedState;
                }

                @Override // android.view.ViewGroup
                public final void onViewAdded(View view) {
/* 8 */             throw new IllegalStateException("ViewPager2 does not support direct child views");
                }

                @Override // android.view.View
                public final boolean performAccessibilityAction(int i, Bundle bundle) {
/* 3 */             this.f2023h0.getClass();
/* 10 */            if (i != 8192 && i != 4096) {
/* 15 */                return super.performAccessibilityAction(i, bundle);
                    }
/* 20 */            ra2 ra2Var = this.f2023h0;
/* 22 */            ra2Var.getClass();
/* 27 */            ViewPager2 viewPager2 = (ViewPager2) ra2Var.f15958d;
/* 29 */            if (i != 8192 && i != 4096) {
/* 34 */                f42.m3664t();
/* 37 */                return false;
                    }
/* 52 */            int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
/* 55 */            if (viewPager2.f2021f0) {
/* 57 */                viewPager2.m1142c(currentItem);
                    }
/* 39 */            return true;
                }

                public void setAdapter(AbstractC0129g abstractC0129g) {
/* 3 */             AbstractC0129g adapter = this.f2007U.getAdapter();
/* 7 */             ra2 ra2Var = this.f2023h0;
/* 9 */             if (adapter != null) {
/* 17 */                adapter.f1748a.unregisterObserver((f43) ra2Var.f15957c);
                    } else {
/* 21 */                ra2Var.getClass();
                    }
/* 24 */            f43 f43Var = this.f2020f;
/* 26 */            if (adapter != null) {
/* 30 */                adapter.f1748a.unregisterObserver(f43Var);
                    }
/* 35 */            this.f2007U.setAdapter(abstractC0129g);
/* 39 */            this.f2016d = 0;
/* 41 */            m1141b();
/* 44 */            ra2 ra2Var2 = this.f2023h0;
/* 46 */            ra2Var2.m8118w();
/* 49 */            if (abstractC0129g != null) {
/* 57 */                abstractC0129g.f1748a.registerObserver((f43) ra2Var2.f15957c);
                    }
/* 60 */            if (abstractC0129g != null) {
/* 64 */                abstractC0129g.f1748a.registerObserver(f43Var);
                    }
                }

                public void setCurrentItem(int i) {
/* 3 */             Object obj = this.f2013b0.f15492b;
/* 5 */             m1142c(i);
                }

                @Override // android.view.View
                public void setLayoutDirection(int i) {
/* 1 */             super.setLayoutDirection(i);
/* 6 */             this.f2023h0.m8118w();
                }

                public void setOffscreenPageLimit(int i) {
/* 2 */             if (i < 1 && i != -1) {
/* 10 */                C1951n4.m6859j("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
                    } else {
/* 14 */                this.f2022g0 = i;
/* 18 */                this.f2007U.requestLayout();
                    }
                }

                public void setOrientation(int i) {
/* 3 */             this.f2024i.m828l1(i);
/* 8 */             this.f2023h0.m8118w();
                }

                public void setPageTransformer(k43 k43Var) {
/* 1 */             boolean z = this.f2019e0;
/* 4 */             if (k43Var != null) {
/* 6 */                 if (!z) {
/* 14 */                    this.f2017d0 = this.f2007U.getItemAnimator();
/* 17 */                    this.f2019e0 = true;
                        }
/* 21 */                this.f2007U.setItemAnimator(null);
                    } else if (z) {
/* 31 */                this.f2007U.setItemAnimator(this.f2017d0);
/* 34 */                this.f2017d0 = null;
/* 37 */                this.f2019e0 = false;
                    }
/* 41 */            this.f2015c0.getClass();
/* 44 */            if (k43Var == null) {
/* 46 */                return;
                    }
/* 49 */            this.f2015c0.getClass();
/* 54 */            this.f2015c0.getClass();
                }

                public void setUserInputEnabled(boolean z) {
/* 1 */             this.f2021f0 = z;
/* 5 */             this.f2023h0.m8118w();
                }

/* 52 */        public ViewPager2(Context context, AttributeSet attributeSet, int i) {
/* 53 */            super(context, attributeSet, i);
/* 54 */            this.f2010a = new Rect();
/* 55 */            this.f2012b = new Rect();
/* 56 */            this.f2014c = new g43();
/* 57 */            this.f2018e = false;
/* 58 */            this.f2020f = new f43(this, 0);
/* 59 */            this.f2025v = -1;
/* 60 */            this.f2017d0 = null;
/* 61 */            this.f2019e0 = false;
/* 62 */            this.f2021f0 = true;
/* 63 */            this.f2022g0 = -1;
/* 64 */            m1140a(context, attributeSet);
                }
            }
