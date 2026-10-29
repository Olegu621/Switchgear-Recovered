            package com.google.android.material.navigation;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Path;
            import android.graphics.RectF;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.InsetDrawable;
            import android.graphics.drawable.RippleDrawable;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.Gravity;
            import android.view.Menu;
            import android.view.MenuInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.FrameLayout;
            import android.widget.LinearLayout;
            import androidx.appcompat.R$attr;
            import androidx.customview.view.AbsSavedState;
            import androidx.drawerlayout.widget.DrawerLayout;
            import com.google.android.material.R$layout;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import com.google.android.material.internal.NavigationMenuView;
            import com.google.android.material.internal.ScrimInsetsFrameLayout;
            import java.util.WeakHashMap;
            import p000.C0862e;
            import p000.C1951n4;
            import p000.ViewTreeObserverOnGlobalLayoutListenerC1986o2;
            import p000.ac1;
            import p000.c52;
            import p000.de3;
            import p000.dm1;
            import p000.e33;
            import p000.ed1;
            import p000.fd1;
            import p000.gm1;
            import p000.hd1;
            import p000.he3;
            import p000.km1;
            import p000.m83;
            import p000.rn2;
            import p000.sc2;
            import p000.sg1;
            import p000.tc2;
            import p000.uc2;
            import p000.v00;
            import p000.vc2;
            import p000.wl1;
            import p000.yi2;
            import p000.yl1;
            import p000.zb0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 27 */    public class NavigationView extends ScrimInsetsFrameLayout {

                /* JADX INFO: renamed from: f0 */
                public static final int[] f4815f0 = {R.attr.state_checked};

                /* JADX INFO: renamed from: g0 */
                public static final int[] f4816g0 = {-16842910};

                /* JADX INFO: renamed from: h0 */
                public static final int f4817h0 = R$style.Widget_Design_NavigationView;

                /* JADX INFO: renamed from: U */
                public yi2 f4818U;

                /* JADX INFO: renamed from: V */
                public final ViewTreeObserverOnGlobalLayoutListenerC1986o2 f4819V;

                /* JADX INFO: renamed from: W */
                public boolean f4820W;

                /* JADX INFO: renamed from: a0 */
                public boolean f4821a0;

                /* JADX INFO: renamed from: b0 */
                public final int f4822b0;

                /* JADX INFO: renamed from: c0 */
                public final int f4823c0;

                /* JADX INFO: renamed from: d0 */
                public Path f4824d0;

                /* JADX INFO: renamed from: e0 */
                public final RectF f4825e0;

                /* JADX INFO: renamed from: f */
                public final wl1 f4826f;

                /* JADX INFO: renamed from: i */
                public final gm1 f4827i;

                /* JADX INFO: renamed from: v */
                public final int f4828v;

                /* JADX INFO: renamed from: w */
                public final int[] f4829w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends AbsSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0369e();

                    /* JADX INFO: renamed from: c */
                    public Bundle f4830c;

                    public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */                 super(parcel, classLoader);
/* 8 */                 this.f4830c = parcel.readBundle(classLoader);
                    }

                    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeBundle(this.f4830c);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:55:0x0180 A[PHI: r14
  0x0180: PHI (r14v2 android.graphics.drawable.Drawable) = 
  (r14v1 android.graphics.drawable.Drawable)
  (r14v6 android.graphics.drawable.Drawable)
  (r14v1 android.graphics.drawable.Drawable)
 binds: [B:47:0x0144, B:53:0x016a, B:51:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Illegal instructions before constructor call */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v11 */
                /* JADX WARN: Type inference failed for: r4v12, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r4v13 */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public NavigationView(Context context, AttributeSet attributeSet, int i) {
                    int i2;
                    boolean z;
                    ?? r4;
/* 7 */             int i3 = f4817h0;
/* 15 */            super(hd1.m4176a(context, attributeSet, i, i3), attributeSet, i);
/* 20 */            gm1 gm1Var = new gm1();
/* 23 */            this.f4827i = gm1Var;
/* 28 */            this.f4829w = new int[2];
/* 31 */            this.f4820W = true;
/* 33 */            this.f4821a0 = true;
/* 36 */            this.f4822b0 = 0;
/* 38 */            this.f4823c0 = 0;
/* 45 */            this.f4825e0 = new RectF();
/* 47 */            Context context2 = getContext();
/* 53 */            wl1 wl1Var = new wl1(context2);
/* 56 */            this.f4826f = wl1Var;
/* 62 */            ac1 ac1VarM8214e = rn2.m8214e(context2, attributeSet, R$styleable.NavigationView, i, i3, new int[0]);
/* 66 */            int i4 = R$styleable.NavigationView_android_background;
/* 70 */            TypedArray typedArray = (TypedArray) ac1VarM8214e.f178c;
/* 76 */            if (typedArray.hasValue(i4)) {
/* 80 */                Drawable drawableM184n = ac1VarM8214e.m184n(R$styleable.NavigationView_android_background);
/* 84 */                WeakHashMap weakHashMap = e33.f7494a;
/* 86 */                setBackground(drawableM184n);
                    }
/* 95 */            this.f4823c0 = typedArray.getDimensionPixelSize(R$styleable.NavigationView_drawerLayoutCornerSize, 0);
/* 103 */           this.f4822b0 = typedArray.getInt(R$styleable.NavigationView_android_layout_gravity, 0);
/* 109 */           if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
/* 123 */               tc2 tc2VarM8478a = tc2.m8775b(context2, attributeSet, i, i3).m8478a();
/* 127 */               Drawable background = getBackground();
/* 133 */               fd1 fd1Var = new fd1(tc2VarM8478a);
/* 138 */               if (background instanceof ColorDrawable) {
/* 150 */                   fd1Var.m3742n(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
                        }
/* 153 */               fd1Var.m3739k(context2);
/* 156 */               WeakHashMap weakHashMap2 = e33.f7494a;
/* 158 */               setBackground(fd1Var);
                    }
/* 167 */           if (typedArray.hasValue(R$styleable.NavigationView_elevation)) {
/* 176 */               setElevation(typedArray.getDimensionPixelSize(R$styleable.NavigationView_elevation, 0));
                    }
/* 185 */           setFitsSystemWindows(typedArray.getBoolean(R$styleable.NavigationView_android_fitsSystemWindows, false));
/* 194 */           this.f4828v = typedArray.getDimensionPixelSize(R$styleable.NavigationView_android_maxWidth, 0);
/* 212 */           ColorStateList colorStateListM183m = typedArray.hasValue(R$styleable.NavigationView_subheaderColor) ? ac1VarM8214e.m183m(R$styleable.NavigationView_subheaderColor) : null;
/* 228 */           int resourceId = typedArray.hasValue(R$styleable.NavigationView_subheaderTextAppearance) ? typedArray.getResourceId(R$styleable.NavigationView_subheaderTextAppearance, 0) : 0;
/* 232 */           if (resourceId == 0 && colorStateListM183m == null) {
/* 236 */               colorStateListM183m = m2345b(R.attr.textColorSecondary);
                    }
/* 255 */           ColorStateList colorStateListM183m2 = typedArray.hasValue(R$styleable.NavigationView_itemIconTint) ? ac1VarM8214e.m183m(R$styleable.NavigationView_itemIconTint) : m2345b(R.attr.textColorSecondary);
/* 274 */           int resourceId2 = typedArray.hasValue(R$styleable.NavigationView_itemTextAppearance) ? typedArray.getResourceId(R$styleable.NavigationView_itemTextAppearance, 0) : 0;
/* 281 */           if (typedArray.hasValue(R$styleable.NavigationView_itemIconSize)) {
/* 289 */               setItemIconSize(typedArray.getDimensionPixelSize(R$styleable.NavigationView_itemIconSize, 0));
                    }
/* 307 */           ColorStateList colorStateListM183m3 = typedArray.hasValue(R$styleable.NavigationView_itemTextColor) ? ac1VarM8214e.m183m(R$styleable.NavigationView_itemTextColor) : null;
/* 308 */           if (resourceId2 == 0 && colorStateListM183m3 == null) {
/* 315 */               colorStateListM183m3 = m2345b(R.attr.textColorPrimary);
                    }
/* 321 */           Drawable drawableM184n2 = ac1VarM8214e.m184n(R$styleable.NavigationView_itemBackground);
/* 325 */           if (drawableM184n2 == null && (typedArray.hasValue(R$styleable.NavigationView_itemShapeAppearance) || typedArray.hasValue(R$styleable.NavigationView_itemShapeAppearanceOverlay))) {
/* 353 */               drawableM184n2 = m2346c(ac1VarM8214e, de3.m3032n(getContext(), ac1VarM8214e, R$styleable.NavigationView_itemShapeFillColor));
/* 359 */               ColorStateList colorStateListM3032n = de3.m3032n(context2, ac1VarM8214e, R$styleable.NavigationView_itemRippleColor);
/* 363 */               if (colorStateListM3032n != null) {
/* 378 */                   gm1Var.f8716X = new RippleDrawable(c52.m1535b(colorStateListM3032n), null, m2346c(ac1VarM8214e, null));
/* 380 */                   i2 = 0;
/* 381 */                   gm1Var.mo419b(false);
                        } else {
/* 385 */                   i2 = 0;
                        }
                    } else {
/* 385 */               i2 = 0;
                    }
/* 392 */           if (typedArray.hasValue(R$styleable.NavigationView_itemHorizontalPadding)) {
/* 400 */               setItemHorizontalPadding(typedArray.getDimensionPixelSize(R$styleable.NavigationView_itemHorizontalPadding, i2));
                    }
/* 409 */           if (typedArray.hasValue(R$styleable.NavigationView_itemVerticalPadding)) {
/* 417 */               setItemVerticalPadding(typedArray.getDimensionPixelSize(R$styleable.NavigationView_itemVerticalPadding, i2));
                    }
/* 426 */           setDividerInsetStart(typedArray.getDimensionPixelSize(R$styleable.NavigationView_dividerInsetStart, i2));
/* 435 */           setDividerInsetEnd(typedArray.getDimensionPixelSize(R$styleable.NavigationView_dividerInsetEnd, i2));
/* 444 */           setSubheaderInsetStart(typedArray.getDimensionPixelSize(R$styleable.NavigationView_subheaderInsetStart, i2));
/* 453 */           setSubheaderInsetEnd(typedArray.getDimensionPixelSize(R$styleable.NavigationView_subheaderInsetEnd, i2));
/* 464 */           setTopInsetScrimEnabled(typedArray.getBoolean(R$styleable.NavigationView_topInsetScrimEnabled, this.f4820W));
/* 475 */           setBottomInsetScrimEnabled(typedArray.getBoolean(R$styleable.NavigationView_bottomInsetScrimEnabled, this.f4821a0));
/* 480 */           int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.NavigationView_itemIconPadding, i2);
/* 491 */           setItemMaxLines(typedArray.getInt(R$styleable.NavigationView_itemMaxLines, 1));
/* 501 */           wl1Var.f12260e = new zb0(this, 22);
/* 503 */           gm1Var.f8725d = 1;
/* 505 */           gm1Var.mo425k(context2, wl1Var);
/* 508 */           if (resourceId != 0) {
/* 510 */               gm1Var.f8733i = resourceId;
/* 512 */               z = false;
/* 513 */               gm1Var.mo419b(false);
                    } else {
/* 517 */               z = false;
                    }
/* 518 */           gm1Var.f8738v = colorStateListM183m;
/* 520 */           gm1Var.mo419b(z);
/* 523 */           gm1Var.f8714V = colorStateListM183m2;
/* 525 */           gm1Var.mo419b(z);
/* 528 */           int overScrollMode = getOverScrollMode();
/* 532 */           gm1Var.f8736k0 = overScrollMode;
/* 534 */           NavigationMenuView navigationMenuView = gm1Var.f8719a;
/* 536 */           if (navigationMenuView != null) {
/* 538 */               navigationMenuView.setOverScrollMode(overScrollMode);
                    }
/* 541 */           if (resourceId2 != 0) {
/* 543 */               gm1Var.f8739w = resourceId2;
/* 545 */               gm1Var.mo419b(z);
                    }
/* 548 */           gm1Var.f8713U = colorStateListM183m3;
/* 550 */           gm1Var.mo419b(z);
/* 553 */           gm1Var.f8715W = drawableM184n2;
/* 555 */           gm1Var.mo419b(z);
/* 558 */           gm1Var.f8720a0 = dimensionPixelSize;
/* 560 */           gm1Var.mo419b(z);
/* 565 */           wl1Var.m5802b(gm1Var, wl1Var.f12256a);
/* 570 */           if (gm1Var.f8719a == null) {
/* 580 */               NavigationMenuView navigationMenuView2 = (NavigationMenuView) gm1Var.f8729f.inflate(R$layout.design_navigation_menu, this, z);
/* 582 */               gm1Var.f8719a = navigationMenuView2;
/* 591 */               navigationMenuView2.setAccessibilityDelegateCompat(new dm1(gm1Var, gm1Var.f8719a));
/* 596 */               if (gm1Var.f8727e == null) {
/* 603 */                   gm1Var.f8727e = new yl1(gm1Var);
                        }
/* 605 */               int i5 = gm1Var.f8736k0;
/* 608 */               if (i5 != -1) {
/* 612 */                   gm1Var.f8719a.setOverScrollMode(i5);
                        }
/* 628 */               gm1Var.f8721b = (LinearLayout) gm1Var.f8729f.inflate(R$layout.design_navigation_item_header, (ViewGroup) gm1Var.f8719a, false);
/* 634 */               gm1Var.f8719a.setAdapter(gm1Var.f8727e);
                    }
/* 639 */           addView(gm1Var.f8719a);
/* 648 */           if (typedArray.hasValue(R$styleable.NavigationView_menu)) {
/* 652 */               r4 = 0;
/* 653 */               int resourceId3 = typedArray.getResourceId(R$styleable.NavigationView_menu, 0);
/* 657 */               yl1 yl1Var = gm1Var.f8727e;
/* 659 */               if (yl1Var != null) {
/* 662 */                   yl1Var.f19679f = true;
                        }
/* 668 */               getMenuInflater().inflate(resourceId3, wl1Var);
/* 671 */               yl1 yl1Var2 = gm1Var.f8727e;
/* 673 */               if (yl1Var2 != null) {
/* 675 */                   yl1Var2.f19679f = false;
                        }
/* 677 */               gm1Var.mo419b(false);
                    } else {
/* 681 */               r4 = 0;
                    }
/* 688 */           if (typedArray.hasValue(R$styleable.NavigationView_headerLayout)) {
/* 706 */               gm1Var.f8721b.addView(gm1Var.f8729f.inflate(typedArray.getResourceId(R$styleable.NavigationView_headerLayout, r4), gm1Var.f8721b, (boolean) r4));
/* 709 */               NavigationMenuView navigationMenuView3 = gm1Var.f8719a;
/* 715 */               navigationMenuView3.setPadding(r4, r4, r4, navigationMenuView3.getPaddingBottom());
                    }
/* 718 */           ac1VarM8214e.m168J();
/* 727 */           this.f4819V = new ViewTreeObserverOnGlobalLayoutListenerC1986o2(this, 5);
/* 735 */           getViewTreeObserver().addOnGlobalLayoutListener(this.f4819V);
                }

                private MenuInflater getMenuInflater() {
/* 3 */             if (this.f4818U == null) {
/* 14 */                this.f4818U = new yi2(getContext());
                    }
/* 16 */            return this.f4818U;
                }

                @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
                /* JADX INFO: renamed from: a */
                public final void mo2343a(m83 m83Var) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 3 */             gm1Var.getClass();
/* 6 */             int iM6624d = m83Var.m6624d();
/* 13 */            if (gm1Var.f8734i0 != iM6624d) {
/* 15 */                gm1Var.f8734i0 = iM6624d;
/* 32 */                int i = (gm1Var.f8721b.getChildCount() == 0 && gm1Var.f8731g0) ? gm1Var.f8734i0 : 0;
/* 33 */                NavigationMenuView navigationMenuView = gm1Var.f8719a;
/* 39 */                navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
                    }
/* 42 */            NavigationMenuView navigationMenuView2 = gm1Var.f8719a;
/* 52 */            navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, m83Var.m6621a());
/* 57 */            e33.m3306b(gm1Var.f8721b, m83Var);
                }

                /* JADX INFO: renamed from: b */
                public final ColorStateList m2345b(int i) {
/* 3 */             TypedValue typedValue = new TypedValue();
/* 19 */            if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
/* 48 */                return null;
                    }
/* 28 */            ColorStateList colorStateList = v00.getColorStateList(getContext(), typedValue.resourceId);
/* 46 */            if (!getContext().getTheme().resolveAttribute(R$attr.colorPrimary, typedValue, true)) {
/* 48 */                return null;
                    }
/* 50 */            int i2 = typedValue.data;
/* 52 */            int defaultColor = colorStateList.getDefaultColor();
/* 58 */            int[] iArr = f4815f0;
/* 60 */            int[] iArr2 = FrameLayout.EMPTY_STATE_SET;
/* 62 */            int[] iArr3 = f4816g0;
/* 76 */            return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateList.getColorForState(iArr3, defaultColor), i2, defaultColor});
                }

                /* JADX INFO: renamed from: c */
                public final InsetDrawable m2346c(ac1 ac1Var, ColorStateList colorStateList) {
/* 1 */             int i = R$styleable.NavigationView_itemShapeAppearance;
/* 5 */             TypedArray typedArray = (TypedArray) ac1Var.f178c;
/* 38 */            fd1 fd1Var = new fd1(tc2.m8774a(getContext(), typedArray.getResourceId(i, 0), typedArray.getResourceId(R$styleable.NavigationView_itemShapeAppearanceOverlay, 0), new C0862e(0.0f)).m8478a());
/* 41 */            fd1Var.m3742n(colorStateList);
/* 70 */            return new InsetDrawable((Drawable) fd1Var, typedArray.getDimensionPixelSize(R$styleable.NavigationView_itemShapeInsetStart, 0), typedArray.getDimensionPixelSize(R$styleable.NavigationView_itemShapeInsetTop, 0), typedArray.getDimensionPixelSize(R$styleable.NavigationView_itemShapeInsetEnd, 0), typedArray.getDimensionPixelSize(R$styleable.NavigationView_itemShapeInsetBottom, 0));
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void dispatchDraw(Canvas canvas) {
/* 3 */             if (this.f4824d0 == null) {
/* 5 */                 super.dispatchDraw(canvas);
/* 8 */                 return;
                    }
/* 9 */             int iSave = canvas.save();
/* 15 */            canvas.clipPath(this.f4824d0);
/* 18 */            super.dispatchDraw(canvas);
/* 21 */            canvas.restoreToCount(iSave);
                }

                public MenuItem getCheckedItem() {
/* 5 */             return this.f4827i.f8727e.f19678e;
                }

                public int getDividerInsetEnd() {
/* 3 */             return this.f4827i.f8726d0;
                }

                public int getDividerInsetStart() {
/* 3 */             return this.f4827i.f8724c0;
                }

                public int getHeaderCount() {
/* 5 */             return this.f4827i.f8721b.getChildCount();
                }

                public Drawable getItemBackground() {
/* 3 */             return this.f4827i.f8715W;
                }

                public int getItemHorizontalPadding() {
/* 3 */             return this.f4827i.f8717Y;
                }

                public int getItemIconPadding() {
/* 3 */             return this.f4827i.f8720a0;
                }

                public ColorStateList getItemIconTintList() {
/* 3 */             return this.f4827i.f8714V;
                }

                public int getItemMaxLines() {
/* 3 */             return this.f4827i.f8732h0;
                }

                public ColorStateList getItemTextColor() {
/* 3 */             return this.f4827i.f8713U;
                }

                public int getItemVerticalPadding() {
/* 3 */             return this.f4827i.f8718Z;
                }

                public Menu getMenu() {
/* 1 */             return this.f4826f;
                }

                public int getSubheaderInsetEnd() {
/* 3 */             this.f4827i.getClass();
/* 6 */             return 0;
                }

                public int getSubheaderInsetStart() {
/* 3 */             return this.f4827i.f8728e0;
                }

                @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             he3.m4196s(this);
                }

                @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 10 */            getViewTreeObserver().removeOnGlobalLayoutListener(this.f4819V);
                }

                @Override // android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             int mode = View.MeasureSpec.getMode(i);
/* 9 */             int i3 = this.f4828v;
/* 11 */            if (mode == Integer.MIN_VALUE) {
/* 29 */                i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i3), 1073741824);
                    } else if (mode == 0) {
/* 16 */                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    }
/* 33 */            super.onMeasure(i, i2);
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 13 */            super.onRestoreInstanceState(savedState.f1292a);
/* 20 */            this.f4826f.m5812t(savedState.f4830c);
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 12 */            Bundle bundle = new Bundle();
/* 15 */            savedState.f4830c = bundle;
/* 19 */            this.f4826f.m5814v(bundle);
/* 22 */            return savedState;
                }

                @Override // android.view.View
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
                    int i5;
/* 1 */             super.onSizeChanged(i, i2, i3, i4);
/* 8 */             boolean z = getParent() instanceof DrawerLayout;
/* 10 */            RectF rectF = this.f4825e0;
/* 12 */            if (!z || (i5 = this.f4823c0) <= 0 || !(getBackground() instanceof fd1)) {
/* 134 */               this.f4824d0 = null;
/* 136 */               rectF.setEmpty();
/* 139 */               return;
                    }
/* 30 */            fd1 fd1Var = (fd1) getBackground();
/* 36 */            sc2 sc2VarM8779f = fd1Var.f8151a.f7635a.m8779f();
/* 40 */            WeakHashMap weakHashMap = e33.f7494a;
/* 53 */            if (Gravity.getAbsoluteGravity(this.f4822b0, getLayoutDirection()) == 3) {
                        float f = i5;
/* 61 */                sc2VarM8779f.f16528f = new C0862e(f);
/* 68 */                sc2VarM8779f.f16529g = new C0862e(f);
                    } else {
                        float f2 = i5;
/* 77 */                sc2VarM8779f.f16527e = new C0862e(f2);
/* 84 */                sc2VarM8779f.f16530h = new C0862e(f2);
                    }
/* 90 */            fd1Var.setShapeAppearanceModel(sc2VarM8779f.m8478a());
/* 95 */            if (this.f4824d0 == null) {
/* 102 */               this.f4824d0 = new Path();
                    }
/* 106 */           this.f4824d0.reset();
/* 112 */           rectF.set(0.0f, 0.0f, i, i2);
/* 115 */           vc2 vc2Var = uc2.f17468a;
/* 117 */           ed1 ed1Var = fd1Var.f8151a;
/* 126 */           vc2Var.m9251a(ed1Var.f7635a, ed1Var.f7643i, rectF, null, this.f4824d0);
/* 129 */           invalidate();
                }

                public void setBottomInsetScrimEnabled(boolean z) {
/* 1 */             this.f4821a0 = z;
                }

                public void setCheckedItem(MenuItem menuItem) {
/* 7 */             MenuItem menuItemFindItem = this.f4826f.findItem(menuItem.getItemId());
/* 11 */            if (menuItemFindItem == null) {
/* 25 */                C1951n4.m6859j("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
                    } else {
/* 19 */                this.f4827i.f8727e.m10158i((sg1) menuItemFindItem);
                    }
                }

                public void setDividerInsetEnd(int i) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 3 */             gm1Var.f8726d0 = i;
/* 6 */             gm1Var.mo419b(false);
                }

                public void setDividerInsetStart(int i) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 3 */             gm1Var.f8724c0 = i;
/* 6 */             gm1Var.mo419b(false);
                }

                @Override // android.view.View
                public void setElevation(float f) {
/* 1 */             super.setElevation(f);
/* 4 */             he3.m4190m(this, f);
                }

                public void setItemBackground(Drawable drawable) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 3 */             gm1Var.f8715W = drawable;
/* 6 */             gm1Var.mo419b(false);
                }

                public void setItemBackgroundResource(int i) {
/* 9 */             setItemBackground(v00.getDrawable(getContext(), i));
                }

                public void setItemHorizontalPadding(int i) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 3 */             gm1Var.f8717Y = i;
/* 6 */             gm1Var.mo419b(false);
                }

                public void setItemHorizontalPaddingResource(int i) {
/* 5 */             int dimensionPixelSize = getResources().getDimensionPixelSize(i);
/* 9 */             gm1 gm1Var = this.f4827i;
/* 11 */            gm1Var.f8717Y = dimensionPixelSize;
/* 14 */            gm1Var.mo419b(false);
                }

                public void setItemIconPadding(int i) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 3 */             gm1Var.f8720a0 = i;
/* 6 */             gm1Var.mo419b(false);
                }

                public void setItemIconPaddingResource(int i) {
/* 5 */             int dimensionPixelSize = getResources().getDimensionPixelSize(i);
/* 9 */             gm1 gm1Var = this.f4827i;
/* 11 */            gm1Var.f8720a0 = dimensionPixelSize;
/* 14 */            gm1Var.mo419b(false);
                }

                public void setItemIconSize(int i) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 5 */             if (gm1Var.f8722b0 != i) {
/* 7 */                 gm1Var.f8722b0 = i;
/* 10 */                gm1Var.f8730f0 = true;
/* 13 */                gm1Var.mo419b(false);
                    }
                }

                public void setItemIconTintList(ColorStateList colorStateList) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 3 */             gm1Var.f8714V = colorStateList;
/* 6 */             gm1Var.mo419b(false);
                }

                public void setItemMaxLines(int i) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 3 */             gm1Var.f8732h0 = i;
/* 6 */             gm1Var.mo419b(false);
                }

                public void setItemTextAppearance(int i) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 3 */             gm1Var.f8739w = i;
/* 6 */             gm1Var.mo419b(false);
                }

                public void setItemTextColor(ColorStateList colorStateList) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 3 */             gm1Var.f8713U = colorStateList;
/* 6 */             gm1Var.mo419b(false);
                }

                public void setItemVerticalPadding(int i) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 3 */             gm1Var.f8718Z = i;
/* 6 */             gm1Var.mo419b(false);
                }

                public void setItemVerticalPaddingResource(int i) {
/* 5 */             int dimensionPixelSize = getResources().getDimensionPixelSize(i);
/* 9 */             gm1 gm1Var = this.f4827i;
/* 11 */            gm1Var.f8718Z = dimensionPixelSize;
/* 14 */            gm1Var.mo419b(false);
                }

                public void setNavigationItemSelectedListener(km1 km1Var) {
                }

                @Override // android.view.View
                public void setOverScrollMode(int i) {
/* 1 */             super.setOverScrollMode(i);
/* 4 */             gm1 gm1Var = this.f4827i;
/* 6 */             if (gm1Var != null) {
/* 8 */                 gm1Var.f8736k0 = i;
/* 10 */                NavigationMenuView navigationMenuView = gm1Var.f8719a;
/* 12 */                if (navigationMenuView != null) {
/* 14 */                    navigationMenuView.setOverScrollMode(i);
                        }
                    }
                }

                public void setSubheaderInsetEnd(int i) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 3 */             gm1Var.f8728e0 = i;
/* 6 */             gm1Var.mo419b(false);
                }

                public void setSubheaderInsetStart(int i) {
/* 1 */             gm1 gm1Var = this.f4827i;
/* 3 */             gm1Var.f8728e0 = i;
/* 6 */             gm1Var.mo419b(false);
                }

                public void setTopInsetScrimEnabled(boolean z) {
/* 1 */             this.f4820W = z;
                }

/* 28 */        public void setCheckedItem(int i) {
/* 29 */            MenuItem menuItemFindItem = this.f4826f.findItem(i);
                    if (menuItemFindItem != null) {
/* 32 */                this.f4827i.f8727e.m10158i((sg1) menuItemFindItem);
                    }
                }

/* 738 */       public NavigationView(Context context, AttributeSet attributeSet) {
/* 739 */           this(context, attributeSet, com.google.android.material.R$attr.navigationViewStyle);
                }
            }
