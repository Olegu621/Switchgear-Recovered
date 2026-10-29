            package com.google.android.material.navigation;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.RippleDrawable;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.view.Menu;
            import android.view.MenuInflater;
            import android.view.MenuItem;
            import android.widget.FrameLayout;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$styleable;
            import java.util.WeakHashMap;
            import p000.C0862e;
            import p000.ac1;
            import p000.c52;
            import p000.de3;
            import p000.e33;
            import p000.ec0;
            import p000.fd1;
            import p000.hd1;
            import p000.he3;
            import p000.hh1;
            import p000.rn2;
            import p000.s90;
            import p000.sl1;
            import p000.tc2;
            import p000.tl1;
            import p000.ul1;
            import p000.vl1;
            import p000.yi2;
            
            /* JADX INFO: renamed from: com.google.android.material.navigation.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0368d extends FrameLayout {

                /* JADX INFO: renamed from: a */
                public final sl1 f4834a;

                /* JADX INFO: renamed from: b */
                public final tl1 f4835b;

                /* JADX INFO: renamed from: c */
                public final C0366b f4836c;

                /* JADX INFO: renamed from: d */
                public ColorStateList f4837d;

                /* JADX INFO: renamed from: e */
                public yi2 f4838e;

                public AbstractC0368d(Context context, AttributeSet attributeSet, int i, int i2) {
/* 5 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 10 */            C0366b c0366b = new C0366b();
/* 14 */            c0366b.f4832b = false;
/* 16 */            this.f4836c = c0366b;
/* 18 */            Context context2 = getContext();
/* 35 */            ac1 ac1VarM8214e = rn2.m8214e(context2, attributeSet, R$styleable.NavigationBarView, i, i2, R$styleable.NavigationBarView_itemTextAppearanceInactive, R$styleable.NavigationBarView_itemTextAppearanceActive);
/* 49 */            sl1 sl1Var = new sl1(context2, getClass(), getMaxItemCount());
/* 52 */            this.f4834a = sl1Var;
/* 54 */            tl1 tl1VarMo2251a = mo2251a(context2);
/* 58 */            this.f4835b = tl1VarMo2251a;
/* 60 */            c0366b.f4831a = tl1VarMo2251a;
/* 63 */            c0366b.f4833c = 1;
/* 65 */            tl1VarMo2251a.setPresenter(c0366b);
/* 70 */            sl1Var.m5802b(c0366b, sl1Var.f12256a);
/* 73 */            getContext();
/* 78 */            c0366b.f4831a.f17174p0 = sl1Var;
/* 80 */            int i3 = R$styleable.NavigationBarView_itemIconTint;
/* 84 */            TypedArray typedArray = (TypedArray) ac1VarM8214e.f178c;
/* 90 */            if (typedArray.hasValue(i3)) {
/* 98 */                tl1VarMo2251a.setIconTintList(ac1VarM8214e.m183m(R$styleable.NavigationBarView_itemIconTint));
                    } else {
/* 106 */               tl1VarMo2251a.setIconTintList(tl1VarMo2251a.m8810c());
                    }
/* 125 */           setItemIconSize(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(R$dimen.mtrl_navigation_bar_item_default_icon_size)));
/* 134 */           if (typedArray.hasValue(R$styleable.NavigationBarView_itemTextAppearanceInactive)) {
/* 142 */               setItemTextAppearanceInactive(typedArray.getResourceId(R$styleable.NavigationBarView_itemTextAppearanceInactive, 0));
                    }
/* 151 */           if (typedArray.hasValue(R$styleable.NavigationBarView_itemTextAppearanceActive)) {
/* 159 */               setItemTextAppearanceActive(typedArray.getResourceId(R$styleable.NavigationBarView_itemTextAppearanceActive, 0));
                    }
/* 168 */           if (typedArray.hasValue(R$styleable.NavigationBarView_itemTextColor)) {
/* 176 */               setItemTextColor(ac1VarM8214e.m183m(R$styleable.NavigationBarView_itemTextColor));
                    }
/* 183 */           if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
/* 195 */               fd1 fd1Var = new fd1();
/* 198 */               Drawable background = getBackground();
/* 204 */               if (background instanceof ColorDrawable) {
/* 216 */                   fd1Var.m3742n(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
                        }
/* 219 */               fd1Var.m3739k(context2);
/* 222 */               WeakHashMap weakHashMap = e33.f7494a;
/* 224 */               setBackground(fd1Var);
                    }
/* 233 */           if (typedArray.hasValue(R$styleable.NavigationBarView_itemPaddingTop)) {
/* 241 */               setItemPaddingTop(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_itemPaddingTop, 0));
                    }
/* 250 */           if (typedArray.hasValue(R$styleable.NavigationBarView_itemPaddingBottom)) {
/* 258 */               setItemPaddingBottom(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_itemPaddingBottom, 0));
                    }
/* 267 */           if (typedArray.hasValue(R$styleable.NavigationBarView_elevation)) {
/* 276 */               setElevation(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_elevation, 0));
                    }
/* 293 */           s90.m8448h(getBackground().mutate(), de3.m3032n(context2, ac1VarM8214e, R$styleable.NavigationBarView_backgroundTint));
/* 303 */           setLabelVisibilityMode(typedArray.getInteger(R$styleable.NavigationBarView_labelVisibilityMode, -1));
/* 308 */           int resourceId = typedArray.getResourceId(R$styleable.NavigationBarView_itemBackground, 0);
/* 312 */           if (resourceId != 0) {
/* 314 */               tl1VarMo2251a.setItemBackgroundRes(resourceId);
                    } else {
/* 324 */               setItemRippleColor(de3.m3032n(context2, ac1VarM8214e, R$styleable.NavigationBarView_itemRippleColor));
                    }
/* 329 */           int resourceId2 = typedArray.getResourceId(R$styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
/* 333 */           if (resourceId2 != 0) {
/* 335 */               setItemActiveIndicatorEnabled(true);
/* 340 */               TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, R$styleable.NavigationBarActiveIndicator);
/* 350 */               setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NavigationBarActiveIndicator_android_width, 0));
/* 359 */               setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NavigationBarActiveIndicator_android_height, 0));
/* 368 */               setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
/* 377 */               setItemActiveIndicatorColor(de3.m3033o(context2, typedArrayObtainStyledAttributes, R$styleable.NavigationBarActiveIndicator_android_color));
/* 400 */               setItemActiveIndicatorShapeAppearance(tc2.m8774a(context2, typedArrayObtainStyledAttributes.getResourceId(R$styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0, new C0862e(0.0f)).m8478a());
/* 403 */               typedArrayObtainStyledAttributes.recycle();
                    }
/* 412 */           if (typedArray.hasValue(R$styleable.NavigationBarView_menu)) {
/* 416 */               int resourceId3 = typedArray.getResourceId(R$styleable.NavigationBarView_menu, 0);
/* 420 */               c0366b.f4832b = true;
/* 426 */               getMenuInflater().inflate(resourceId3, sl1Var);
/* 429 */               c0366b.f4832b = false;
/* 431 */               c0366b.mo419b(true);
                    }
/* 434 */           ac1VarM8214e.m168J();
/* 437 */           addView(tl1VarMo2251a);
/* 445 */           sl1Var.f12260e = new ec0(this);
                }

                private MenuInflater getMenuInflater() {
/* 3 */             if (this.f4838e == null) {
/* 14 */                this.f4838e = new yi2(getContext());
                    }
/* 16 */            return this.f4838e;
                }

                /* JADX INFO: renamed from: a */
                public abstract tl1 mo2251a(Context context);

                public ColorStateList getItemActiveIndicatorColor() {
/* 3 */             return this.f4835b.getItemActiveIndicatorColor();
                }

                public int getItemActiveIndicatorHeight() {
/* 3 */             return this.f4835b.getItemActiveIndicatorHeight();
                }

                public int getItemActiveIndicatorMarginHorizontal() {
/* 3 */             return this.f4835b.getItemActiveIndicatorMarginHorizontal();
                }

                public tc2 getItemActiveIndicatorShapeAppearance() {
/* 3 */             return this.f4835b.getItemActiveIndicatorShapeAppearance();
                }

                public int getItemActiveIndicatorWidth() {
/* 3 */             return this.f4835b.getItemActiveIndicatorWidth();
                }

                public Drawable getItemBackground() {
/* 3 */             return this.f4835b.getItemBackground();
                }

                @Deprecated
                public int getItemBackgroundResource() {
/* 3 */             return this.f4835b.getItemBackgroundRes();
                }

                public int getItemIconSize() {
/* 3 */             return this.f4835b.getItemIconSize();
                }

                public ColorStateList getItemIconTintList() {
/* 3 */             return this.f4835b.getIconTintList();
                }

                public int getItemPaddingBottom() {
/* 3 */             return this.f4835b.getItemPaddingBottom();
                }

                public int getItemPaddingTop() {
/* 3 */             return this.f4835b.getItemPaddingTop();
                }

                public ColorStateList getItemRippleColor() {
/* 1 */             return this.f4837d;
                }

                public int getItemTextAppearanceActive() {
/* 3 */             return this.f4835b.getItemTextAppearanceActive();
                }

                public int getItemTextAppearanceInactive() {
/* 3 */             return this.f4835b.getItemTextAppearanceInactive();
                }

                public ColorStateList getItemTextColor() {
/* 3 */             return this.f4835b.getItemTextColor();
                }

                public int getLabelVisibilityMode() {
/* 3 */             return this.f4835b.getLabelVisibilityMode();
                }

                public abstract int getMaxItemCount();

                public Menu getMenu() {
/* 1 */             return this.f4834a;
                }

                public hh1 getMenuView() {
/* 1 */             return this.f4835b;
                }

                public C0366b getPresenter() {
/* 1 */             return this.f4836c;
                }

                public int getSelectedItemId() {
/* 3 */             return this.f4835b.getSelectedItemId();
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             he3.m4196s(this);
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof NavigationBarView$SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             NavigationBarView$SavedState navigationBarView$SavedState = (NavigationBarView$SavedState) parcelable;
/* 13 */            super.onRestoreInstanceState(navigationBarView$SavedState.f1292a);
/* 20 */            this.f4834a.m5812t(navigationBarView$SavedState.f4814c);
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             NavigationBarView$SavedState navigationBarView$SavedState = new NavigationBarView$SavedState(super.onSaveInstanceState());
/* 12 */            Bundle bundle = new Bundle();
/* 15 */            navigationBarView$SavedState.f4814c = bundle;
/* 19 */            this.f4834a.m5814v(bundle);
/* 22 */            return navigationBarView$SavedState;
                }

                @Override // android.view.View
                public void setElevation(float f) {
/* 1 */             super.setElevation(f);
/* 4 */             he3.m4190m(this, f);
                }

                public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
/* 3 */             this.f4835b.setItemActiveIndicatorColor(colorStateList);
                }

                public void setItemActiveIndicatorEnabled(boolean z) {
/* 3 */             this.f4835b.setItemActiveIndicatorEnabled(z);
                }

                public void setItemActiveIndicatorHeight(int i) {
/* 3 */             this.f4835b.setItemActiveIndicatorHeight(i);
                }

                public void setItemActiveIndicatorMarginHorizontal(int i) {
/* 3 */             this.f4835b.setItemActiveIndicatorMarginHorizontal(i);
                }

                public void setItemActiveIndicatorShapeAppearance(tc2 tc2Var) {
/* 3 */             this.f4835b.setItemActiveIndicatorShapeAppearance(tc2Var);
                }

                public void setItemActiveIndicatorWidth(int i) {
/* 3 */             this.f4835b.setItemActiveIndicatorWidth(i);
                }

                public void setItemBackground(Drawable drawable) {
/* 3 */             this.f4835b.setItemBackground(drawable);
/* 7 */             this.f4837d = null;
                }

                public void setItemBackgroundResource(int i) {
/* 3 */             this.f4835b.setItemBackgroundRes(i);
/* 7 */             this.f4837d = null;
                }

                public void setItemIconSize(int i) {
/* 3 */             this.f4835b.setItemIconSize(i);
                }

                public void setItemIconSizeRes(int i) {
/* 9 */             setItemIconSize(getResources().getDimensionPixelSize(i));
                }

                public void setItemIconTintList(ColorStateList colorStateList) {
/* 3 */             this.f4835b.setIconTintList(colorStateList);
                }

                public void setItemPaddingBottom(int i) {
/* 3 */             this.f4835b.setItemPaddingBottom(i);
                }

                public void setItemPaddingTop(int i) {
/* 3 */             this.f4835b.setItemPaddingTop(i);
                }

                public void setItemRippleColor(ColorStateList colorStateList) {
/* 1 */             ColorStateList colorStateList2 = this.f4837d;
/* 4 */             tl1 tl1Var = this.f4835b;
/* 6 */             if (colorStateList2 == colorStateList) {
/* 8 */                 if (colorStateList != null || tl1Var.getItemBackground() == null) {
/* 19 */                    return;
                        }
/* 16 */                tl1Var.setItemBackground(null);
/* 19 */                return;
                    }
/* 20 */            this.f4837d = colorStateList;
/* 22 */            if (colorStateList == null) {
/* 24 */                tl1Var.setItemBackground(null);
                    } else {
/* 37 */                tl1Var.setItemBackground(new RippleDrawable(c52.m1534a(colorStateList), null, null));
                    }
                }

                public void setItemTextAppearanceActive(int i) {
/* 3 */             this.f4835b.setItemTextAppearanceActive(i);
                }

                public void setItemTextAppearanceInactive(int i) {
/* 3 */             this.f4835b.setItemTextAppearanceInactive(i);
                }

                public void setItemTextColor(ColorStateList colorStateList) {
/* 3 */             this.f4835b.setItemTextColor(colorStateList);
                }

                public void setLabelVisibilityMode(int i) {
/* 1 */             tl1 tl1Var = this.f4835b;
/* 7 */             if (tl1Var.getLabelVisibilityMode() != i) {
/* 9 */                 tl1Var.setLabelVisibilityMode(i);
/* 15 */                this.f4836c.mo419b(false);
                    }
                }

                public void setOnItemReselectedListener(ul1 ul1Var) {
                }

                public void setOnItemSelectedListener(vl1 vl1Var) {
                }

                public void setSelectedItemId(int i) {
/* 1 */             sl1 sl1Var = this.f4834a;
/* 3 */             MenuItem menuItemFindItem = sl1Var.findItem(i);
/* 7 */             if (menuItemFindItem == null || sl1Var.m5809q(menuItemFindItem, this.f4836c, 0)) {
/* 22 */                return;
                    }
/* 19 */            menuItemFindItem.setChecked(true);
                }
            }
