            package com.google.android.material.floatingactionbutton;

            import android.animation.Animator;
            import android.animation.AnimatorSet;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Matrix;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.LayerDrawable;
            import android.graphics.drawable.RippleDrawable;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.widget.ImageView;
            import androidx.coordinatorlayout.widget.C0080c;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import androidx.coordinatorlayout.widget.InterfaceC0078a;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$color;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import com.google.android.material.appbar.AppBarLayout;
            import com.google.android.material.bottomsheet.BottomSheetBehavior;
            import com.google.android.material.internal.VisibilityAwareImageButton;
            import com.google.android.material.stateful.ExtendableSavedState;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.WeakHashMap;
            import p000.C0162b;
            import p000.C0174bb;
            import p000.C0994hk;
            import p000.C1030ik;
            import p000.C1796jk;
            import p000.C1834kk;
            import p000.C1951n4;
            import p000.C2491ya;
            import p000.bk0;
            import p000.c52;
            import p000.ck0;
            import p000.d52;
            import p000.de3;
            import p000.dk0;
            import p000.e33;
            import p000.ed2;
            import p000.f42;
            import p000.gr0;
            import p000.hd1;
            import p000.he3;
            import p000.kb1;
            import p000.mk1;
            import p000.pg0;
            import p000.qf0;
            import p000.rn2;
            import p000.s90;
            import p000.tc2;
            import p000.uj0;
            import p000.v00;
            import p000.vj0;
            import p000.w70;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 2 */     public class FloatingActionButton extends VisibilityAwareImageButton implements qf0, ed2, InterfaceC0078a {

                /* JADX INFO: renamed from: e0 */
                public static final int f4742e0 = R$style.Widget_Design_FloatingActionButton;

                /* JADX INFO: renamed from: U */
                public int f4743U;

                /* JADX INFO: renamed from: V */
                public boolean f4744V;

                /* JADX INFO: renamed from: W */
                public final Rect f4745W;

                /* JADX INFO: renamed from: a0 */
                public final Rect f4746a0;

                /* JADX INFO: renamed from: b */
                public ColorStateList f4747b;

                /* JADX INFO: renamed from: b0 */
                public final C0174bb f4748b0;

                /* JADX INFO: renamed from: c */
                public PorterDuff.Mode f4749c;

                /* JADX INFO: renamed from: c0 */
                public final C0162b f4750c0;

                /* JADX INFO: renamed from: d */
                public ColorStateList f4751d;

                /* JADX INFO: renamed from: d0 */
                public dk0 f4752d0;

                /* JADX INFO: renamed from: e */
                public PorterDuff.Mode f4753e;

                /* JADX INFO: renamed from: f */
                public ColorStateList f4754f;

                /* JADX INFO: renamed from: i */
                public int f4755i;

                /* JADX INFO: renamed from: v */
                public int f4756v;

                /* JADX INFO: renamed from: w */
                public int f4757w;

                /* JADX WARN: Illegal instructions before constructor call */
                public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
                    Drawable drawable;
                    Drawable layerDrawable;
/* 7 */             int i2 = f4742e0;
/* 15 */            super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 23 */            this.f4745W = new Rect();
/* 30 */            this.f4746a0 = new Rect();
/* 32 */            Context context2 = getContext();
/* 41 */            TypedArray typedArrayM8213d = rn2.m8213d(context2, attributeSet, R$styleable.FloatingActionButton, i, i2, new int[0]);
/* 51 */            this.f4747b = de3.m3033o(context2, typedArrayM8213d, R$styleable.FloatingActionButton_backgroundTint);
/* 65 */            this.f4749c = kb1.m6039O(typedArrayM8213d.getInt(R$styleable.FloatingActionButton_backgroundTintMode, -1), null);
/* 73 */            this.f4754f = de3.m3033o(context2, typedArrayM8213d, R$styleable.FloatingActionButton_rippleColor);
/* 81 */            this.f4755i = typedArrayM8213d.getInt(R$styleable.FloatingActionButton_fabSize, -1);
/* 89 */            this.f4756v = typedArrayM8213d.getDimensionPixelSize(R$styleable.FloatingActionButton_fabCustomSize, 0);
/* 93 */            int dimensionPixelSize = typedArrayM8213d.getDimensionPixelSize(R$styleable.FloatingActionButton_borderWidth, 0);
/* 100 */           float dimension = typedArrayM8213d.getDimension(R$styleable.FloatingActionButton_elevation, 0.0f);
/* 106 */           float dimension2 = typedArrayM8213d.getDimension(R$styleable.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
/* 112 */           float dimension3 = typedArrayM8213d.getDimension(R$styleable.FloatingActionButton_pressedTranslationZ, 0.0f);
/* 122 */           this.f4744V = typedArrayM8213d.getBoolean(R$styleable.FloatingActionButton_useCompatPadding, false);
/* 130 */           int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.mtrl_fab_min_touch_target);
/* 140 */           setMaxImageSize(typedArrayM8213d.getDimensionPixelSize(R$styleable.FloatingActionButton_maxImageSize, 0));
/* 145 */           mk1 mk1VarM6667a = mk1.m6667a(context2, typedArrayM8213d, R$styleable.FloatingActionButton_showMotionSpec);
/* 151 */           mk1 mk1VarM6667a2 = mk1.m6667a(context2, typedArrayM8213d, R$styleable.FloatingActionButton_hideMotionSpec);
/* 161 */           tc2 tc2VarM8478a = tc2.m8776c(context2, attributeSet, i, i2, tc2.f17031m).m8478a();
/* 167 */           boolean z = typedArrayM8213d.getBoolean(R$styleable.FloatingActionButton_ensureMinTouchTargetSize, false);
/* 180 */           setEnabled(typedArrayM8213d.getBoolean(R$styleable.FloatingActionButton_android_enabled, true));
/* 183 */           typedArrayM8213d.recycle();
/* 188 */           C0174bb c0174bb = new C0174bb(this);
/* 191 */           this.f4748b0 = c0174bb;
/* 193 */           c0174bb.m1313b(attributeSet, i);
/* 201 */           this.f4750c0 = new C0162b(this);
/* 207 */           getImpl().m1388h(tc2VarM8478a);
/* 210 */           bk0 impl = getImpl();
/* 214 */           ColorStateList colorStateList = this.f4747b;
/* 216 */           PorterDuff.Mode mode = this.f4749c;
/* 218 */           ColorStateList colorStateList2 = this.f4754f;
/* 220 */           dk0 dk0Var = (dk0) impl;
/* 222 */           FloatingActionButton floatingActionButton = dk0Var.f2487u;
/* 224 */           tc2 tc2Var = dk0Var.f2467a;
/* 226 */           tc2Var.getClass();
/* 231 */           ck0 ck0Var = new ck0(tc2Var);
/* 234 */           dk0Var.f2468b = ck0Var;
/* 236 */           ck0Var.setTintList(colorStateList);
/* 239 */           if (mode != null) {
/* 243 */               dk0Var.f2468b.setTintMode(mode);
                    }
/* 252 */           dk0Var.f2468b.m3739k(floatingActionButton.getContext());
/* 255 */           if (dimensionPixelSize > 0) {
/* 257 */               Context context3 = floatingActionButton.getContext();
/* 263 */               tc2 tc2Var2 = dk0Var.f2467a;
/* 265 */               tc2Var2.getClass();
/* 268 */               C0994hk c0994hk = new C0994hk(tc2Var2);
/* 273 */               int color = v00.getColor(context3, R$color.design_fab_stroke_top_outer_color);
/* 279 */               int color2 = v00.getColor(context3, R$color.design_fab_stroke_top_inner_color);
/* 287 */               int color3 = v00.getColor(context3, R$color.design_fab_stroke_end_inner_color);
/* 293 */               int color4 = v00.getColor(context3, R$color.design_fab_stroke_end_outer_color);
/* 297 */               c0994hk.f9111i = color;
/* 299 */               c0994hk.f9112j = color2;
/* 301 */               c0994hk.f9113k = color3;
/* 303 */               c0994hk.f9114l = color4;
                        float f = dimensionPixelSize;
/* 310 */               if (c0994hk.f9110h != f) {
/* 312 */                   c0994hk.f9110h = f;
/* 320 */                   c0994hk.f9104b.setStrokeWidth(f * 1.3333f);
/* 324 */                   c0994hk.f9116n = true;
/* 326 */                   c0994hk.invalidateSelf();
                        }
/* 329 */               if (colorStateList != null) {
/* 341 */                   c0994hk.f9115m = colorStateList.getColorForState(c0994hk.getState(), c0994hk.f9115m);
                        }
/* 343 */               c0994hk.f9118p = colorStateList;
/* 346 */               c0994hk.f9116n = true;
/* 348 */               c0994hk.invalidateSelf();
/* 351 */               dk0Var.f2470d = c0994hk;
/* 355 */               C0994hk c0994hk2 = dk0Var.f2470d;
/* 357 */               c0994hk2.getClass();
/* 360 */               ck0 ck0Var2 = dk0Var.f2468b;
/* 362 */               ck0Var2.getClass();
/* 372 */               layerDrawable = new LayerDrawable(new Drawable[]{c0994hk2, ck0Var2});
/* 375 */               drawable = null;
                    } else {
/* 379 */               drawable = null;
/* 380 */               dk0Var.f2470d = null;
/* 382 */               layerDrawable = dk0Var.f2468b;
                    }
/* 390 */           RippleDrawable rippleDrawable = new RippleDrawable(c52.m1535b(colorStateList2), layerDrawable, drawable);
/* 393 */           dk0Var.f2469c = rippleDrawable;
/* 395 */           dk0Var.f2471e = rippleDrawable;
/* 401 */           getImpl().f2477k = dimensionPixelSize2;
/* 403 */           bk0 impl2 = getImpl();
/* 411 */           if (impl2.f2474h != dimension) {
/* 413 */               impl2.f2474h = dimension;
/* 419 */               impl2.mo1385e(dimension, impl2.f2475i, impl2.f2476j);
                    }
/* 422 */           bk0 impl3 = getImpl();
/* 430 */           if (impl3.f2475i != dimension2) {
/* 432 */               impl3.f2475i = dimension2;
/* 438 */               impl3.mo1385e(impl3.f2474h, dimension2, impl3.f2476j);
                    }
/* 441 */           bk0 impl4 = getImpl();
/* 449 */           if (impl4.f2476j != dimension3) {
/* 451 */               impl4.f2476j = dimension3;
/* 457 */               impl4.mo1385e(impl4.f2474h, impl4.f2475i, dimension3);
                    }
/* 464 */           getImpl().f2479m = mk1VarM6667a;
/* 470 */           getImpl().f2480n = mk1VarM6667a2;
/* 476 */           getImpl().f2472f = z;
/* 482 */           setScaleType(ImageView.ScaleType.MATRIX);
                }

                private bk0 getImpl() {
/* 3 */             if (this.f4752d0 == null) {
/* 15 */                this.f4752d0 = new dk0(this, new gr0(this));
                    }
/* 17 */            return this.f4752d0;
                }

                /* JADX INFO: renamed from: c */
                public final void m2329c(C1030ik c1030ik) {
/* 1 */             bk0 impl = getImpl();
/* 7 */             if (impl.f2485s == null) {
/* 14 */                impl.f2485s = new ArrayList();
                    }
/* 18 */            impl.f2485s.add(c1030ik);
                }

                /* JADX INFO: renamed from: d */
                public final void m2330d(C1030ik c1030ik) {
/* 1 */             bk0 impl = getImpl();
/* 7 */             if (impl.f2484r == null) {
/* 14 */                impl.f2484r = new ArrayList();
                    }
/* 18 */            impl.f2484r.add(c1030ik);
                }

                @Override // android.widget.ImageView, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             bk0 impl = getImpl();
/* 8 */             getDrawableState();
/* 11 */            impl.getClass();
                }

                /* JADX INFO: renamed from: e */
                public final void m2331e(d52 d52Var) {
/* 1 */             bk0 impl = getImpl();
/* 7 */             uj0 uj0Var = new uj0(this, d52Var);
/* 12 */            if (impl.f2486t == null) {
/* 19 */                impl.f2486t = new ArrayList();
                    }
/* 23 */            impl.f2486t.add(uj0Var);
                }

                /* JADX INFO: renamed from: f */
                public final int m2332f(int i) {
/* 1 */             int i2 = this.f4756v;
/* 3 */             if (i2 != 0) {
/* 5 */                 return i2;
                    }
/* 6 */             Resources resources = getResources();
/* 12 */            if (i != -1) {
                        return i != 1 ? resources.getDimensionPixelSize(R$dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R$dimen.design_fab_size_mini);
                    }
                    return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m2332f(1) : m2332f(0);
                }

                /* JADX INFO: renamed from: g */
                public final void m2333g(C1834kk c1834kk, boolean z) {
/* 1 */             bk0 impl = getImpl();
/* 11 */            wc0 wc0Var = c1834kk == null ? null : new wc0(this, c1834kk);
/* 15 */            FloatingActionButton floatingActionButton = impl.f2487u;
/* 17 */            FloatingActionButton floatingActionButton2 = impl.f2487u;
/* 19 */            int visibility = floatingActionButton.getVisibility();
/* 23 */            int i = impl.f2483q;
/* 25 */            if (visibility == 0) {
/* 28 */                if (i == 1) {
/* 131 */                   return;
                        }
                    } else if (i != 2) {
/* 131 */               return;
                    }
/* 35 */            Animator animator = impl.f2478l;
/* 37 */            if (animator != null) {
/* 39 */                animator.cancel();
                    }
/* 42 */            WeakHashMap weakHashMap = e33.f7494a;
/* 48 */            if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
/* 115 */               floatingActionButton2.m2344a(z ? 8 : 4, z);
/* 118 */               if (wc0Var != null) {
/* 128 */                   ((he3) wc0Var.f18577b).mo4204k((FloatingActionButton) wc0Var.f18578c);
/* 131 */                   return;
                        }
/* 131 */               return;
                    }
/* 56 */            mk1 mk1Var = impl.f2480n;
/* 69 */            AnimatorSet animatorSetM1383b = mk1Var != null ? impl.m1383b(mk1Var, 0.0f, 0.0f, 0.0f) : impl.m1384c(0.0f, 0.4f, 0.4f);
/* 78 */            animatorSetM1383b.addListener(new vj0(impl, z, wc0Var));
/* 81 */            ArrayList arrayList = impl.f2485s;
/* 83 */            if (arrayList != null) {
/* 85 */                Iterator it = arrayList.iterator();
/* 93 */                while (it.hasNext()) {
/* 101 */                   animatorSetM1383b.addListener((Animator.AnimatorListener) it.next());
                        }
                    }
/* 105 */           animatorSetM1383b.start();
                }

                @Override // android.view.View
                public ColorStateList getBackgroundTintList() {
/* 1 */             return this.f4747b;
                }

                @Override // android.view.View
                public PorterDuff.Mode getBackgroundTintMode() {
/* 1 */             return this.f4749c;
                }

                @Override // androidx.coordinatorlayout.widget.InterfaceC0078a
                public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
/* 3 */             return new Behavior();
                }

                public float getCompatElevation() {
/* 9 */             return ((dk0) getImpl()).f2487u.getElevation();
                }

                public float getCompatHoveredFocusedTranslationZ() {
/* 5 */             return getImpl().f2475i;
                }

                public float getCompatPressedTranslationZ() {
/* 5 */             return getImpl().f2476j;
                }

                public Drawable getContentBackground() {
/* 5 */             return getImpl().f2471e;
                }

                public int getCustomSize() {
/* 1 */             return this.f4756v;
                }

                public int getExpandedComponentIdHint() {
/* 3 */             return this.f4750c0.f2149b;
                }

                public mk1 getHideMotionSpec() {
/* 5 */             return getImpl().f2480n;
                }

                @Deprecated
                public int getRippleColor() {
/* 1 */             ColorStateList colorStateList = this.f4754f;
/* 3 */             if (colorStateList != null) {
/* 5 */                 return colorStateList.getDefaultColor();
                    }
/* 10 */            return 0;
                }

                public ColorStateList getRippleColorStateList() {
/* 1 */             return this.f4754f;
                }

                public tc2 getShapeAppearanceModel() {
/* 5 */             tc2 tc2Var = getImpl().f2467a;
/* 7 */             tc2Var.getClass();
/* 10 */            return tc2Var;
                }

                public mk1 getShowMotionSpec() {
/* 5 */             return getImpl().f2479m;
                }

                public int getSize() {
/* 1 */             return this.f4755i;
                }

                public int getSizeDimension() {
/* 3 */             return m2332f(this.f4755i);
                }

                public ColorStateList getSupportBackgroundTintList() {
/* 1 */             return getBackgroundTintList();
                }

                public PorterDuff.Mode getSupportBackgroundTintMode() {
/* 1 */             return getBackgroundTintMode();
                }

                public ColorStateList getSupportImageTintList() {
/* 1 */             return this.f4751d;
                }

                public PorterDuff.Mode getSupportImageTintMode() {
/* 1 */             return this.f4753e;
                }

                public boolean getUseCompatPadding() {
/* 1 */             return this.f4744V;
                }

                /* JADX INFO: renamed from: h */
                public final boolean m2334h() {
/* 1 */             bk0 impl = getImpl();
/* 7 */             int visibility = impl.f2487u.getVisibility();
/* 11 */            int i = impl.f2483q;
/* 14 */            if (visibility == 0) {
/* 16 */                if (i != 1) {
/* 23 */                    return false;
                        }
                    } else if (i == 2) {
/* 23 */                return false;
                    }
/* 13 */            return true;
                }

                /* JADX INFO: renamed from: i */
                public final boolean m2335i() {
/* 1 */             bk0 impl = getImpl();
/* 7 */             int visibility = impl.f2487u.getVisibility();
/* 11 */            int i = impl.f2483q;
/* 14 */            if (visibility != 0) {
/* 17 */                if (i != 2) {
/* 23 */                    return false;
                        }
                    } else if (i == 1) {
/* 23 */                return false;
                    }
/* 13 */            return true;
                }

                /* JADX INFO: renamed from: j */
                public final void m2336j(Rect rect) {
/* 1 */             int i = rect.left;
/* 3 */             Rect rect2 = this.f4745W;
/* 8 */             rect.left = i + rect2.left;
/* 15 */            rect.top += rect2.top;
/* 22 */            rect.right -= rect2.right;
/* 29 */            rect.bottom -= rect2.bottom;
                }

                @Override // android.widget.ImageView, android.view.View
                public final void jumpDrawablesToCurrentState() {
/* 1 */             super.jumpDrawablesToCurrentState();
/* 8 */             getImpl().getClass();
                }

                /* JADX INFO: renamed from: k */
                public final void m2337k() {
/* 1 */             Drawable drawable = getDrawable();
/* 5 */             if (drawable == null) {
/* 7 */                 return;
                    }
/* 8 */             ColorStateList colorStateList = this.f4751d;
/* 10 */            if (colorStateList == null) {
/* 12 */                drawable.clearColorFilter();
/* 15 */                return;
                    }
/* 21 */            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
/* 25 */            PorterDuff.Mode mode = this.f4753e;
/* 27 */            if (mode == null) {
/* 29 */                mode = PorterDuff.Mode.SRC_IN;
                    }
/* 39 */            drawable.mutate().setColorFilter(C2491ya.m10133c(colorForState, mode));
                }

                /* JADX INFO: renamed from: l */
                public final void m2338l(C1796jk c1796jk, boolean z) {
/* 1 */             bk0 impl = getImpl();
/* 11 */            wc0 wc0Var = c1796jk == null ? null : new wc0(this, c1796jk);
/* 15 */            FloatingActionButton floatingActionButton = impl.f2487u;
/* 17 */            Matrix matrix = impl.f2492z;
/* 19 */            FloatingActionButton floatingActionButton2 = impl.f2487u;
/* 21 */            int visibility = floatingActionButton.getVisibility();
/* 25 */            int i = impl.f2483q;
/* 28 */            if (visibility != 0) {
/* 31 */                if (i == 2) {
/* 187 */                   return;
                        }
                    } else if (i != 1) {
/* 187 */               return;
                    }
/* 39 */            Animator animator = impl.f2478l;
/* 41 */            if (animator != null) {
/* 43 */                animator.cancel();
                    }
/* 49 */            boolean z2 = impl.f2479m == null;
/* 53 */            WeakHashMap weakHashMap = e33.f7494a;
/* 61 */            if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
/* 158 */               floatingActionButton.m2344a(0, z);
/* 161 */               floatingActionButton.setAlpha(1.0f);
/* 164 */               floatingActionButton.setScaleY(1.0f);
/* 167 */               floatingActionButton.setScaleX(1.0f);
/* 170 */               impl.f2481o = 1.0f;
/* 172 */               impl.m1382a(1.0f, matrix);
/* 175 */               floatingActionButton2.setImageMatrix(matrix);
/* 178 */               if (wc0Var != null) {
/* 184 */                   ((he3) wc0Var.f18577b).mo4205l();
/* 187 */                   return;
                        }
/* 187 */               return;
                    }
/* 73 */            if (floatingActionButton.getVisibility() != 0) {
/* 76 */                floatingActionButton.setAlpha(0.0f);
/* 87 */                floatingActionButton.setScaleY(z2 ? 0.4f : 0.0f);
/* 95 */                floatingActionButton.setScaleX(z2 ? 0.4f : 0.0f);
/* 98 */                float f = z2 ? 0.4f : 0.0f;
/* 101 */               impl.f2481o = f;
/* 103 */               impl.m1382a(f, matrix);
/* 106 */               floatingActionButton2.setImageMatrix(matrix);
                    }
/* 109 */           mk1 mk1Var = impl.f2479m;
/* 118 */           AnimatorSet animatorSetM1383b = mk1Var != null ? impl.m1383b(mk1Var, 1.0f, 1.0f, 1.0f) : impl.m1384c(1.0f, 1.0f, 1.0f);
/* 127 */           animatorSetM1383b.addListener(new pg0(impl, z, wc0Var));
/* 130 */           ArrayList arrayList = impl.f2484r;
/* 132 */           if (arrayList != null) {
/* 134 */               Iterator it = arrayList.iterator();
/* 142 */               while (it.hasNext()) {
/* 150 */                   animatorSetM1383b.addListener((Animator.AnimatorListener) it.next());
                        }
                    }
/* 154 */           animatorSetM1383b.start();
                }

                @Override // android.widget.ImageView, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             bk0 impl = getImpl();
/* 8 */             ck0 ck0Var = impl.f2468b;
/* 10 */            if (ck0Var != null) {
/* 14 */                he3.m4195r(impl.f2487u, ck0Var);
                    }
                }

                @Override // android.widget.ImageView, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 10 */            getImpl().f2487u.getViewTreeObserver();
                }

                @Override // android.widget.ImageView, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             int sizeDimension = getSizeDimension();
/* 11 */            this.f4757w = (sizeDimension - this.f4743U) / 2;
/* 17 */            getImpl().m1389i();
/* 20 */            int mode = View.MeasureSpec.getMode(i);
/* 24 */            int size = View.MeasureSpec.getSize(i);
/* 32 */            if (mode == Integer.MIN_VALUE) {
/* 45 */                size = Math.min(sizeDimension, size);
                    } else if (mode == 0) {
/* 43 */                size = sizeDimension;
                    } else if (mode != 1073741824) {
/* 39 */                f42.m3649e();
/* 42 */                return;
                    }
/* 49 */            int mode2 = View.MeasureSpec.getMode(i2);
/* 53 */            int size2 = View.MeasureSpec.getSize(i2);
/* 57 */            if (mode2 == Integer.MIN_VALUE) {
/* 69 */                sizeDimension = Math.min(sizeDimension, size2);
                    } else if (mode2 != 0) {
/* 61 */                if (mode2 != 1073741824) {
/* 65 */                    f42.m3649e();
/* 68 */                    return;
                        }
/* 63 */                sizeDimension = size2;
                    }
/* 73 */            int iMin = Math.min(size, sizeDimension);
/* 77 */            Rect rect = this.f4745W;
/* 91 */            setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof ExtendableSavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
/* 13 */            super.onRestoreInstanceState(extendableSavedState.f1292a);
/* 21 */            Object orDefault = extendableSavedState.f4941c.getOrDefault("expandableWidgetHelper", null);
/* 25 */            orDefault.getClass();
/* 28 */            Bundle bundle = (Bundle) orDefault;
/* 30 */            C0162b c0162b = this.f4750c0;
/* 32 */            c0162b.getClass();
/* 42 */            c0162b.f2148a = bundle.getBoolean("expanded", false);
/* 50 */            c0162b.f2149b = bundle.getInt("expandedComponentIdHint", 0);
/* 54 */            if (c0162b.f2148a) {
/* 58 */                FloatingActionButton floatingActionButton = (FloatingActionButton) c0162b.f2150c;
/* 60 */                ViewParent parent = floatingActionButton.getParent();
/* 66 */                if (parent instanceof CoordinatorLayout) {
/* 70 */                    ((CoordinatorLayout) parent).m550g(floatingActionButton);
                        }
                    }
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
/* 1 */             Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
/* 5 */             if (parcelableOnSaveInstanceState == null) {
/* 9 */                 parcelableOnSaveInstanceState = new Bundle();
                    }
/* 14 */            ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
/* 17 */            C0162b c0162b = this.f4750c0;
/* 19 */            c0162b.getClass();
/* 24 */            Bundle bundle = new Bundle();
/* 31 */            bundle.putBoolean("expanded", c0162b.f2148a);
/* 38 */            bundle.putInt("expandedComponentIdHint", c0162b.f2149b);
/* 45 */            extendableSavedState.f4941c.put("expandableWidgetHelper", bundle);
/* 48 */            return extendableSavedState;
                }

                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 5 */             if (motionEvent.getAction() == 0) {
/* 7 */                 WeakHashMap weakHashMap = e33.f7494a;
/* 13 */                if (isLaidOut()) {
/* 15 */                    int width = getWidth();
/* 19 */                    int height = getHeight();
/* 23 */                    Rect rect = this.f4746a0;
/* 26 */                    rect.set(0, 0, width, height);
/* 29 */                    m2336j(rect);
/* 46 */                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
/* 25 */                        return false;
                            }
                        }
                    }
/* 49 */            return super.onTouchEvent(motionEvent);
                }

                @Override // android.view.View
                public void setBackgroundColor(int i) {
                }

                @Override // android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
                }

                @Override // android.view.View
                public void setBackgroundResource(int i) {
                }

                @Override // android.view.View
                public void setBackgroundTintList(ColorStateList colorStateList) {
/* 3 */             if (this.f4747b != colorStateList) {
/* 5 */                 this.f4747b = colorStateList;
/* 7 */                 bk0 impl = getImpl();
/* 11 */                ck0 ck0Var = impl.f2468b;
/* 13 */                if (ck0Var != null) {
/* 15 */                    ck0Var.setTintList(colorStateList);
                        }
/* 18 */                C0994hk c0994hk = impl.f2470d;
/* 20 */                if (c0994hk != null) {
/* 22 */                    if (colorStateList != null) {
/* 34 */                        c0994hk.f9115m = colorStateList.getColorForState(c0994hk.getState(), c0994hk.f9115m);
                            }
/* 36 */                    c0994hk.f9118p = colorStateList;
/* 39 */                    c0994hk.f9116n = true;
/* 41 */                    c0994hk.invalidateSelf();
                        }
                    }
                }

                @Override // android.view.View
                public void setBackgroundTintMode(PorterDuff.Mode mode) {
/* 3 */             if (this.f4749c != mode) {
/* 5 */                 this.f4749c = mode;
/* 11 */                ck0 ck0Var = getImpl().f2468b;
/* 13 */                if (ck0Var != null) {
/* 15 */                    ck0Var.setTintMode(mode);
                        }
                    }
                }

                public void setCompatElevation(float f) {
/* 1 */             bk0 impl = getImpl();
/* 9 */             if (impl.f2474h != f) {
/* 11 */                impl.f2474h = f;
/* 17 */                impl.mo1385e(f, impl.f2475i, impl.f2476j);
                    }
                }

                public void setCompatElevationResource(int i) {
/* 9 */             setCompatElevation(getResources().getDimension(i));
                }

                public void setCompatHoveredFocusedTranslationZ(float f) {
/* 1 */             bk0 impl = getImpl();
/* 9 */             if (impl.f2475i != f) {
/* 11 */                impl.f2475i = f;
/* 17 */                impl.mo1385e(impl.f2474h, f, impl.f2476j);
                    }
                }

                public void setCompatHoveredFocusedTranslationZResource(int i) {
/* 9 */             setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
                }

                public void setCompatPressedTranslationZ(float f) {
/* 1 */             bk0 impl = getImpl();
/* 9 */             if (impl.f2476j != f) {
/* 11 */                impl.f2476j = f;
/* 17 */                impl.mo1385e(impl.f2474h, impl.f2475i, f);
                    }
                }

                public void setCompatPressedTranslationZResource(int i) {
/* 9 */             setCompatPressedTranslationZ(getResources().getDimension(i));
                }

                public void setCustomSize(int i) {
/* 1 */             if (i < 0) {
/* 15 */                C1951n4.m6859j("Custom size must be non-negative");
                    } else if (i != this.f4756v) {
/* 7 */                 this.f4756v = i;
/* 9 */                 requestLayout();
                    }
                }

                @Override // android.view.View
                public void setElevation(float f) {
/* 1 */             super.setElevation(f);
/* 8 */             ck0 ck0Var = getImpl().f2468b;
/* 10 */            if (ck0Var != null) {
/* 12 */                ck0Var.m3741m(f);
                    }
                }

                public void setEnsureMinTouchTargetSize(boolean z) {
/* 7 */             if (z != getImpl().f2472f) {
/* 13 */                getImpl().f2472f = z;
/* 15 */                requestLayout();
                    }
                }

                public void setExpandedComponentIdHint(int i) {
/* 3 */             this.f4750c0.f2149b = i;
                }

                public void setHideMotionSpec(mk1 mk1Var) {
/* 5 */             getImpl().f2480n = mk1Var;
                }

                public void setHideMotionSpecResource(int i) {
/* 9 */             setHideMotionSpec(mk1.m6668b(getContext(), i));
                }

                @Override // android.widget.ImageView
                public void setImageDrawable(Drawable drawable) {
/* 5 */             if (getDrawable() != drawable) {
/* 7 */                 super.setImageDrawable(drawable);
/* 10 */                bk0 impl = getImpl();
/* 14 */                float f = impl.f2481o;
/* 16 */                impl.f2481o = f;
/* 18 */                Matrix matrix = impl.f2492z;
/* 20 */                impl.m1382a(f, matrix);
/* 25 */                impl.f2487u.setImageMatrix(matrix);
/* 30 */                if (this.f4751d != null) {
/* 32 */                    m2337k();
                        }
                    }
                }

                @Override // android.widget.ImageView
                public void setImageResource(int i) {
/* 3 */             this.f4748b0.m1314c(i);
/* 6 */             m2337k();
                }

                public void setMaxImageSize(int i) {
/* 1 */             this.f4743U = i;
/* 3 */             bk0 impl = getImpl();
/* 9 */             if (impl.f2482p != i) {
/* 11 */                impl.f2482p = i;
/* 13 */                float f = impl.f2481o;
/* 15 */                impl.f2481o = f;
/* 17 */                Matrix matrix = impl.f2492z;
/* 19 */                impl.m1382a(f, matrix);
/* 24 */                impl.f2487u.setImageMatrix(matrix);
                    }
                }

                public void setRippleColor(ColorStateList colorStateList) {
/* 3 */             if (this.f4754f != colorStateList) {
/* 5 */                 this.f4754f = colorStateList;
/* 7 */                 bk0 impl = getImpl();
/* 11 */                ColorStateList colorStateList2 = this.f4754f;
/* 15 */                RippleDrawable rippleDrawable = ((dk0) impl).f2469c;
/* 17 */                if (rippleDrawable != null) {
/* 23 */                    rippleDrawable.setColor(c52.m1535b(colorStateList2));
                        } else if (rippleDrawable != null) {
/* 33 */                    s90.m8448h(rippleDrawable, c52.m1535b(colorStateList2));
                        }
                    }
                }

                @Override // android.view.View
                public void setScaleX(float f) {
/* 1 */             super.setScaleX(f);
/* 8 */             getImpl().m1386f();
                }

                @Override // android.view.View
                public void setScaleY(float f) {
/* 1 */             super.setScaleY(f);
/* 8 */             getImpl().m1386f();
                }

                public void setShadowPaddingEnabled(boolean z) {
/* 1 */             bk0 impl = getImpl();
/* 5 */             impl.f2473g = z;
/* 7 */             impl.m1389i();
                }

                @Override // p000.ed2
                public void setShapeAppearanceModel(tc2 tc2Var) {
/* 5 */             getImpl().m1388h(tc2Var);
                }

                public void setShowMotionSpec(mk1 mk1Var) {
/* 5 */             getImpl().f2479m = mk1Var;
                }

                public void setShowMotionSpecResource(int i) {
/* 9 */             setShowMotionSpec(mk1.m6668b(getContext(), i));
                }

                public void setSize(int i) {
/* 2 */             this.f4756v = 0;
/* 6 */             if (i != this.f4755i) {
/* 8 */                 this.f4755i = i;
/* 10 */                requestLayout();
                    }
                }

                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             setBackgroundTintList(colorStateList);
                }

                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             setBackgroundTintMode(mode);
                }

                public void setSupportImageTintList(ColorStateList colorStateList) {
/* 3 */             if (this.f4751d != colorStateList) {
/* 5 */                 this.f4751d = colorStateList;
/* 7 */                 m2337k();
                    }
                }

                public void setSupportImageTintMode(PorterDuff.Mode mode) {
/* 3 */             if (this.f4753e != mode) {
/* 5 */                 this.f4753e = mode;
/* 7 */                 m2337k();
                    }
                }

                @Override // android.view.View
                public void setTranslationX(float f) {
/* 1 */             super.setTranslationX(f);
/* 8 */             getImpl().m1387g();
                }

                @Override // android.view.View
                public void setTranslationY(float f) {
/* 1 */             super.setTranslationY(f);
/* 8 */             getImpl().m1387g();
                }

                @Override // android.view.View
                public void setTranslationZ(float f) {
/* 1 */             super.setTranslationZ(f);
/* 8 */             getImpl().m1387g();
                }

                public void setUseCompatPadding(boolean z) {
/* 3 */             if (this.f4744V != z) {
/* 5 */                 this.f4744V = z;
/* 13 */                ((dk0) getImpl()).m1389i();
                    }
                }

                @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
                public void setVisibility(int i) {
/* 1 */             super.setVisibility(i);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 3 */         public static class Behavior extends BaseBehavior<FloatingActionButton> {
                    public Behavior() {
                    }

/* 4 */             public Behavior(Context context, AttributeSet attributeSet) {
/* 5 */                 super(context, attributeSet);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 21 */        public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

                    /* JADX INFO: renamed from: a */
                    public Rect f4758a;

                    /* JADX INFO: renamed from: b */
                    public final boolean f4759b;

                    public BaseBehavior(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 6 */                 TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FloatingActionButton_Behavior_Layout);
/* 17 */                this.f4759b = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
/* 19 */                typedArrayObtainStyledAttributes.recycle();
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: a */
                    public final boolean mo563a(Rect rect, View view) {
/* 1 */                 FloatingActionButton floatingActionButton = (FloatingActionButton) view;
/* 3 */                 Rect rect2 = floatingActionButton.f4745W;
/* 33 */                rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
/* 36 */                return true;
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: c */
                    public final void mo565c(C0080c c0080c) {
/* 3 */                 if (c0080c.f1225h == 0) {
/* 7 */                     c0080c.f1225h = 80;
                        }
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: d */
                    public final boolean mo566d(CoordinatorLayout coordinatorLayout, View view, View view2) {
/* 1 */                 FloatingActionButton floatingActionButton = (FloatingActionButton) view;
/* 6 */                 if (view2 instanceof AppBarLayout) {
/* 10 */                    m2339s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
                        } else {
/* 14 */                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
/* 30 */                    if (layoutParams instanceof C0080c ? ((C0080c) layoutParams).f1218a instanceof BottomSheetBehavior : false) {
/* 32 */                        m2340t(view2, floatingActionButton);
                            }
                        }
/* 5 */                 return false;
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: h */
                    public final boolean mo570h(CoordinatorLayout coordinatorLayout, View view, int i) {
/* 1 */                 FloatingActionButton floatingActionButton = (FloatingActionButton) view;
/* 3 */                 ArrayList arrayListM552i = coordinatorLayout.m552i(floatingActionButton);
/* 7 */                 int size = arrayListM552i.size();
/* 11 */                int i2 = 0;
/* 13 */                for (int i3 = 0; i3 < size; i3++) {
/* 19 */                    View view2 = (View) arrayListM552i.get(i3);
/* 23 */                    if (!(view2 instanceof AppBarLayout)) {
/* 34 */                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
/* 50 */                        if ((layoutParams instanceof C0080c ? ((C0080c) layoutParams).f1218a instanceof BottomSheetBehavior : false) && m2340t(view2, floatingActionButton)) {
                                    break;
                                }
                            } else {
/* 31 */                        if (m2339s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                                    break;
                                }
                            }
                        }
/* 62 */                coordinatorLayout.m557p(i, floatingActionButton);
/* 65 */                Rect rect = floatingActionButton.f4745W;
/* 68 */                if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
/* 86 */                    C0080c c0080c = (C0080c) floatingActionButton.getLayoutParams();
/* 116 */                   int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c0080c).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c0080c).leftMargin ? -rect.left : 0;
/* 128 */                   if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c0080c).bottomMargin) {
/* 130 */                       i2 = rect.bottom;
                            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c0080c).topMargin) {
/* 143 */                       i2 = -rect.top;
                            }
/* 144 */                   if (i2 != 0) {
/* 146 */                       WeakHashMap weakHashMap = e33.f7494a;
/* 148 */                       floatingActionButton.offsetTopAndBottom(i2);
                            }
/* 151 */                   if (i4 != 0) {
/* 153 */                       WeakHashMap weakHashMap2 = e33.f7494a;
/* 155 */                       floatingActionButton.offsetLeftAndRight(i4);
                            }
                        }
/* 67 */                return true;
                    }

                    /* JADX INFO: renamed from: s */
                    public final boolean m2339s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
/* 5 */                 C0080c c0080c = (C0080c) floatingActionButton.getLayoutParams();
/* 10 */                if (!this.f4759b || c0080c.f1223f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
/* 9 */                     return false;
                        }
/* 31 */                if (this.f4758a == null) {
/* 38 */                    this.f4758a = new Rect();
                        }
/* 40 */                Rect rect = this.f4758a;
/* 42 */                w70.m9478a(coordinatorLayout, appBarLayout, rect);
/* 52 */                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
/* 54 */                    floatingActionButton.m2333g(null, false);
/* 61 */                    return true;
                        }
/* 58 */                floatingActionButton.m2338l(null, false);
/* 61 */                return true;
                    }

                    /* JADX INFO: renamed from: t */
                    public final boolean m2340t(View view, FloatingActionButton floatingActionButton) {
/* 5 */                 C0080c c0080c = (C0080c) floatingActionButton.getLayoutParams();
/* 10 */                if (!this.f4759b || c0080c.f1223f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
/* 9 */                     return false;
                        }
/* 49 */                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((C0080c) floatingActionButton.getLayoutParams())).topMargin) {
/* 51 */                    floatingActionButton.m2333g(null, false);
/* 58 */                    return true;
                        }
/* 55 */                floatingActionButton.m2338l(null, false);
/* 58 */                return true;
                    }

/* 22 */            public BaseBehavior() {
/* 24 */                this.f4759b = true;
                    }
                }

/* 36 */        public void setRippleColor(int i) {
/* 37 */            setRippleColor(ColorStateList.valueOf(i));
                }

/* 485 */       public FloatingActionButton(Context context, AttributeSet attributeSet) {
/* 486 */           this(context, attributeSet, R$attr.floatingActionButtonStyle);
                }
            }
