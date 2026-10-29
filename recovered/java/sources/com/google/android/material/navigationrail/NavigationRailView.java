            package com.google.android.material.navigationrail;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.FrameLayout;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import com.google.android.material.navigation.AbstractC0368d;
            import p000.ac1;
            import p000.im1;
            import p000.kb1;
            import p000.rn2;
            import p000.tl1;
            import p000.ts0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 165 */   public class NavigationRailView extends AbstractC0368d {

                /* JADX INFO: renamed from: f */
                public final int f4839f;

                /* JADX INFO: renamed from: i */
                public final View f4840i;

                /* JADX INFO: renamed from: v */
                public final Boolean f4841v;

                /* JADX INFO: renamed from: w */
                public final Boolean f4842w;

                /* JADX WARN: Illegal instructions before constructor call */
                public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = R$style.Widget_MaterialComponents_NavigationRailView;
/* 3 */             super(context, attributeSet, i, i2);
/* 7 */             this.f4841v = null;
/* 9 */             this.f4842w = null;
/* 17 */            int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.mtrl_navigation_rail_margin);
/* 21 */            this.f4839f = dimensionPixelSize;
/* 34 */            ac1 ac1VarM8214e = rn2.m8214e(getContext(), attributeSet, R$styleable.NavigationRailView, i, i2, new int[0]);
/* 38 */            int i3 = R$styleable.NavigationRailView_headerLayout;
/* 42 */            TypedArray typedArray = (TypedArray) ac1VarM8214e.f178c;
/* 44 */            int resourceId = typedArray.getResourceId(i3, 0);
/* 50 */            if (resourceId != 0) {
/* 60 */                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
/* 64 */                View view = this.f4840i;
/* 66 */                if (view != null) {
/* 68 */                    removeView(view);
/* 71 */                    this.f4840i = null;
                        }
/* 73 */                this.f4840i = viewInflate;
/* 78 */                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
/* 81 */                layoutParams.gravity = 49;
/* 83 */                layoutParams.topMargin = dimensionPixelSize;
/* 85 */                addView(viewInflate, 0, layoutParams);
                    }
/* 94 */            setMenuGravity(typedArray.getInt(R$styleable.NavigationRailView_menuGravity, 49));
/* 103 */           if (typedArray.hasValue(R$styleable.NavigationRailView_itemMinHeight)) {
/* 112 */               setItemMinimumHeight(typedArray.getDimensionPixelSize(R$styleable.NavigationRailView_itemMinHeight, -1));
                    }
/* 121 */           if (typedArray.hasValue(R$styleable.NavigationRailView_paddingTopSystemWindowInsets)) {
/* 133 */               this.f4841v = Boolean.valueOf(typedArray.getBoolean(R$styleable.NavigationRailView_paddingTopSystemWindowInsets, false));
                    }
/* 141 */           if (typedArray.hasValue(R$styleable.NavigationRailView_paddingBottomSystemWindowInsets)) {
/* 153 */               this.f4842w = Boolean.valueOf(typedArray.getBoolean(R$styleable.NavigationRailView_paddingBottomSystemWindowInsets, false));
                    }
/* 155 */           ac1VarM8214e.m168J();
/* 163 */           kb1.m6073z(this, new ts0(this));
                }

                private im1 getNavigationRailMenuView() {
/* 5 */             return (im1) getMenuView();
                }

                @Override // com.google.android.material.navigation.AbstractC0368d
                /* JADX INFO: renamed from: a */
                public final tl1 mo2251a(Context context) {
/* 3 */             return new im1(context);
                }

                public View getHeaderView() {
/* 1 */             return this.f4840i;
                }

                public int getItemMinimumHeight() {
/* 7 */             return ((im1) getMenuView()).getItemMinimumHeight();
                }

                @Override // com.google.android.material.navigation.AbstractC0368d
                public int getMaxItemCount() {
/* 1 */             return 7;
                }

                public int getMenuGravity() {
/* 5 */             return getNavigationRailMenuView().getMenuGravity();
                }

                /* JADX WARN: Code duplicated, block: B:12:0x002f  */
                @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             im1 navigationRailMenuView = getNavigationRailMenuView();
/* 8 */             int i5 = this.f4839f;
/* 11 */            View view = this.f4840i;
/* 13 */            if (view != null && view.getVisibility() != 8) {
/* 27 */                int bottom = view.getBottom() + i5;
/* 28 */                int top = navigationRailMenuView.getTop();
/* 32 */                if (top < bottom) {
/* 34 */                    i5 = bottom - top;
                        } else {
/* 48 */                    i5 = 0;
                        }
                    } else if ((navigationRailMenuView.f9717t0.gravity & 112) != 48) {
/* 48 */                i5 = 0;
                    }
/* 49 */            if (i5 > 0) {
/* 69 */                navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
                    }
                }

                @Override // android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             int suggestedMinimumWidth = getSuggestedMinimumWidth();
/* 11 */            if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumWidth > 0) {
/* 33 */                i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
                    }
/* 37 */            super.onMeasure(i, i2);
/* 40 */            View view = this.f4840i;
/* 42 */            if (view == null || view.getVisibility() == 8) {
/* 77 */                return;
                    }
/* 74 */            measureChild(getNavigationRailMenuView(), i, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - view.getMeasuredHeight()) - this.f4839f, Integer.MIN_VALUE));
                }

                public void setItemMinimumHeight(int i) {
/* 7 */             ((im1) getMenuView()).setItemMinimumHeight(i);
                }

                public void setMenuGravity(int i) {
/* 5 */             getNavigationRailMenuView().setMenuGravity(i);
                }

/* 166 */       public NavigationRailView(Context context, AttributeSet attributeSet) {
/* 167 */           this(context, attributeSet, R$attr.navigationRailStyle);
                }
            }
