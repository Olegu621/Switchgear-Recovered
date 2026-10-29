            package com.google.android.material.bottomappbar;

            import android.animation.AnimatorSet;
            import android.animation.ObjectAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.appcompat.widget.ActionMenuView;
            import androidx.appcompat.widget.Toolbar;
            import androidx.coordinatorlayout.widget.C0080c;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import androidx.coordinatorlayout.widget.InterfaceC0078a;
            import androidx.customview.view.AbsSavedState;
            import com.google.android.material.R$animator;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
            import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.WeakHashMap;
            import p000.C0862e;
            import p000.C1030ik;
            import p000.C1834kk;
            import p000.C1893lk;
            import p000.C1967nk;
            import p000.RunnableC1930mk;
            import p000.d52;
            import p000.dc0;
            import p000.de3;
            import p000.e33;
            import p000.fd1;
            import p000.g52;
            import p000.g53;
            import p000.gr0;
            import p000.hd1;
            import p000.he3;
            import p000.kb1;
            import p000.le2;
            import p000.rn2;
            import p000.s90;
            import p000.tc2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    public class BottomAppBar extends Toolbar implements InterfaceC0078a {

                /* JADX INFO: renamed from: b1 */
                public static final int f4449b1 = R$style.Widget_MaterialComponents_BottomAppBar;

                /* JADX INFO: renamed from: I0 */
                public Integer f4450I0;

                /* JADX INFO: renamed from: J0 */
                public final int f4451J0;

                /* JADX INFO: renamed from: K0 */
                public final fd1 f4452K0;

                /* JADX INFO: renamed from: L0 */
                public AnimatorSet f4453L0;

                /* JADX INFO: renamed from: M0 */
                public AnimatorSet f4454M0;

                /* JADX INFO: renamed from: N0 */
                public int f4455N0;

                /* JADX INFO: renamed from: O0 */
                public int f4456O0;

                /* JADX INFO: renamed from: P0 */
                public boolean f4457P0;

                /* JADX INFO: renamed from: Q0 */
                public final boolean f4458Q0;

                /* JADX INFO: renamed from: R0 */
                public final boolean f4459R0;

                /* JADX INFO: renamed from: S0 */
                public final boolean f4460S0;

                /* JADX INFO: renamed from: T0 */
                public boolean f4461T0;

                /* JADX INFO: renamed from: U0 */
                public boolean f4462U0;

                /* JADX INFO: renamed from: V0 */
                public Behavior f4463V0;

                /* JADX INFO: renamed from: W0 */
                public int f4464W0;

                /* JADX INFO: renamed from: X0 */
                public int f4465X0;

                /* JADX INFO: renamed from: Y0 */
                public int f4466Y0;

                /* JADX INFO: renamed from: Z0 */
                public final C1030ik f4467Z0;

                /* JADX INFO: renamed from: a1 */
                public final d52 f4468a1;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends AbsSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0341b();

                    /* JADX INFO: renamed from: c */
                    public int f4473c;

                    /* JADX INFO: renamed from: d */
                    public boolean f4474d;

                    public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */                 super(parcel, classLoader);
/* 8 */                 this.f4473c = parcel.readInt();
/* 19 */                this.f4474d = parcel.readInt() != 0;
                    }

                    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeInt(this.f4473c);
/* 11 */                parcel.writeInt(this.f4474d ? 1 : 0);
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
/* 7 */             int i2 = f4449b1;
/* 15 */            super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 20 */            fd1 fd1Var = new fd1();
/* 23 */            this.f4452K0 = fd1Var;
/* 25 */            int i3 = 0;
/* 26 */            this.f4461T0 = false;
/* 29 */            this.f4462U0 = true;
/* 36 */            this.f4467Z0 = new C1030ik(this, i3);
/* 43 */            this.f4468a1 = new d52(this);
/* 45 */            Context context2 = getContext();
/* 53 */            TypedArray typedArrayM8213d = rn2.m8213d(context2, attributeSet, R$styleable.BottomAppBar, i, i2, new int[0]);
/* 59 */            ColorStateList colorStateListM3033o = de3.m3033o(context2, typedArrayM8213d, R$styleable.BottomAppBar_backgroundTint);
/* 69 */            if (typedArrayM8213d.hasValue(R$styleable.BottomAppBar_navigationIconTint)) {
/* 78 */                setNavigationIconTint(typedArrayM8213d.getColor(R$styleable.BottomAppBar_navigationIconTint, -1));
                    }
/* 83 */            int dimensionPixelSize = typedArrayM8213d.getDimensionPixelSize(R$styleable.BottomAppBar_elevation, 0);
/* 89 */            float dimensionPixelOffset = typedArrayM8213d.getDimensionPixelOffset(R$styleable.BottomAppBar_fabCradleMargin, 0);
/* 96 */            float dimensionPixelOffset2 = typedArrayM8213d.getDimensionPixelOffset(R$styleable.BottomAppBar_fabCradleRoundedCornerRadius, 0);
/* 103 */           float dimensionPixelOffset3 = typedArrayM8213d.getDimensionPixelOffset(R$styleable.BottomAppBar_fabCradleVerticalOffset, 0);
/* 114 */           this.f4455N0 = typedArrayM8213d.getInt(R$styleable.BottomAppBar_fabAlignmentMode, 0);
/* 122 */           this.f4456O0 = typedArrayM8213d.getInt(R$styleable.BottomAppBar_fabAnimationMode, 0);
/* 130 */           this.f4457P0 = typedArrayM8213d.getBoolean(R$styleable.BottomAppBar_hideOnScroll, false);
/* 138 */           this.f4458Q0 = typedArrayM8213d.getBoolean(R$styleable.BottomAppBar_paddingBottomSystemWindowInsets, false);
/* 146 */           this.f4459R0 = typedArrayM8213d.getBoolean(R$styleable.BottomAppBar_paddingLeftSystemWindowInsets, false);
/* 154 */           this.f4460S0 = typedArrayM8213d.getBoolean(R$styleable.BottomAppBar_paddingRightSystemWindowInsets, false);
/* 156 */           typedArrayM8213d.recycle();
/* 169 */           this.f4451J0 = getResources().getDimensionPixelOffset(R$dimen.mtrl_bottomappbar_fabOffsetEndMode);
/* 173 */           C1967nk c1967nk = new C1967nk(i3);
/* 178 */           c1967nk.f14326f0 = -1.0f;
/* 180 */           c1967nk.f14322b0 = dimensionPixelOffset;
/* 182 */           c1967nk.f14321a0 = dimensionPixelOffset2;
/* 184 */           c1967nk.m6994m(dimensionPixelOffset3);
/* 188 */           c1967nk.f14325e0 = 0.0f;
/* 192 */           g52 g52Var = new g52();
/* 197 */           g52 g52Var2 = new g52();
/* 202 */           g52 g52Var3 = new g52();
/* 207 */           g52 g52Var4 = new g52();
/* 212 */           C0862e c0862e = new C0862e(0.0f);
/* 217 */           C0862e c0862e2 = new C0862e(0.0f);
/* 222 */           C0862e c0862e3 = new C0862e(0.0f);
/* 227 */           C0862e c0862e4 = new C0862e(0.0f);
/* 234 */           int i4 = 0;
/* 235 */           dc0 dc0Var = new dc0(i4);
/* 242 */           dc0 dc0Var2 = new dc0(i4);
/* 247 */           dc0 dc0Var3 = new dc0(i4);
/* 252 */           tc2 tc2Var = new tc2();
/* 255 */           tc2Var.f17032a = g52Var;
/* 257 */           tc2Var.f17033b = g52Var2;
/* 259 */           tc2Var.f17034c = g52Var3;
/* 261 */           tc2Var.f17035d = g52Var4;
/* 263 */           tc2Var.f17036e = c0862e;
/* 265 */           tc2Var.f17037f = c0862e2;
/* 267 */           tc2Var.f17038g = c0862e3;
/* 269 */           tc2Var.f17039h = c0862e4;
/* 271 */           tc2Var.f17040i = c1967nk;
/* 273 */           tc2Var.f17041j = dc0Var;
/* 275 */           tc2Var.f17042k = dc0Var2;
/* 277 */           tc2Var.f17043l = dc0Var3;
/* 279 */           fd1Var.setShapeAppearanceModel(tc2Var);
/* 282 */           fd1Var.m3746r();
/* 285 */           Paint.Style style = Paint.Style.FILL;
/* 287 */           fd1Var.m3744p();
/* 290 */           fd1Var.m3739k(context2);
/* 296 */           setElevation(dimensionPixelSize);
/* 301 */           s90.m8448h(fd1Var, colorStateListM3033o);
/* 304 */           WeakHashMap weakHashMap = e33.f7494a;
/* 306 */           setBackground(fd1Var);
/* 311 */           gr0 gr0Var = new gr0(this);
/* 326 */           TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.Insets, i, i2);
/* 333 */           boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Insets_paddingBottomSystemWindowInsets, false);
/* 339 */           boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Insets_paddingLeftSystemWindowInsets, false);
/* 345 */           boolean z3 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Insets_paddingRightSystemWindowInsets, false);
/* 349 */           typedArrayObtainStyledAttributes.recycle();
/* 357 */           kb1.m6073z(this, new g53(z, z2, z3, gr0Var));
                }

                private ActionMenuView getActionMenuView() {
/* 6 */             for (int i = 0; i < getChildCount(); i++) {
/* 8 */                 View childAt = getChildAt(i);
/* 14 */                if (childAt instanceof ActionMenuView) {
/* 16 */                    return (ActionMenuView) childAt;
                        }
                    }
/* 22 */            return null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public int getBottomInset() {
/* 1 */             return this.f4464W0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public float getFabTranslationX() {
/* 3 */             return m2245D(this.f4455N0);
                }

                private float getFabTranslationY() {
/* 7 */             return -getTopEdgeTreatment().f14324d0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public int getLeftInset() {
/* 1 */             return this.f4466Y0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public int getRightInset() {
/* 1 */             return this.f4465X0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public C1967nk getTopEdgeTreatment() {
/* 9 */             return (C1967nk) this.f4452K0.f8151a.f7635a.f17040i;
                }

                /* JADX INFO: renamed from: B */
                public final View m2243B() {
/* 8 */             if (getParent() instanceof CoordinatorLayout) {
/* 15 */                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
/* 27 */                List list = (List) ((le2) coordinatorLayout.f1203b.f15956b).getOrDefault(this, null);
/* 29 */                ArrayList<View> arrayList = coordinatorLayout.f1207d;
/* 31 */                arrayList.clear();
/* 34 */                if (list != null) {
/* 36 */                    arrayList.addAll(list);
                        }
/* 47 */                for (View view : arrayList) {
/* 57 */                    if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
/* 63 */                        return view;
                            }
                        }
                    }
/* 7 */             return null;
                }

                /* JADX INFO: renamed from: C */
                public final int m2244C(ActionMenuView actionMenuView, int i, boolean z) {
/* 3 */             if (i != 1 || !z) {
/* 2 */                 return 0;
                    }
/* 8 */             boolean zM6036J = kb1.m6036J(this);
/* 19 */            int measuredWidth = zM6036J ? getMeasuredWidth() : 0;
/* 24 */            for (int i2 = 0; i2 < getChildCount(); i2++) {
/* 26 */                View childAt = getChildAt(i2);
/* 36 */                if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f359a & 8388615) == 8388611) {
/* 70 */                    measuredWidth = zM6036J ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
                        }
                    }
/* 97 */            return measuredWidth - ((zM6036J ? actionMenuView.getRight() : actionMenuView.getLeft()) + (zM6036J ? this.f4465X0 : -this.f4466Y0));
                }

                /* JADX INFO: renamed from: D */
                public final float m2245D(int i) {
/* 1 */             boolean zM6036J = kb1.m6036J(this);
/* 6 */             if (i == 1) {
/* 29 */                return ((getMeasuredWidth() / 2) - (this.f4451J0 + (zM6036J ? this.f4466Y0 : this.f4465X0))) * (zM6036J ? -1 : 1);
                    }
/* 31 */            return 0.0f;
                }

                /* JADX INFO: renamed from: E */
                public final void m2246E(int i, boolean z) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 8 */             if (!isLaidOut()) {
/* 10 */                this.f4461T0 = false;
/* 12 */                return;
                    }
/* 13 */            AnimatorSet animatorSet = this.f4454M0;
/* 15 */            if (animatorSet != null) {
/* 17 */                animatorSet.cancel();
                    }
/* 22 */            ArrayList arrayList = new ArrayList();
/* 25 */            View viewM2243B = m2243B();
/* 36 */            FloatingActionButton floatingActionButton = viewM2243B instanceof FloatingActionButton ? (FloatingActionButton) viewM2243B : null;
/* 37 */            if (floatingActionButton == null || !floatingActionButton.m2335i()) {
/* 46 */                i = 0;
/* 47 */                z = false;
                    }
/* 48 */            ActionMenuView actionMenuView = getActionMenuView();
/* 52 */            int i2 = 2;
/* 53 */            if (actionMenuView != null) {
/* 65 */                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
/* 85 */                if (Math.abs(actionMenuView.getTranslationX() - m2244C(actionMenuView, i, z)) > 1.0f) {
/* 92 */                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
/* 101 */                   objectAnimatorOfFloat2.addListener(new C1893lk(this, actionMenuView, i, z));
/* 106 */                   AnimatorSet animatorSet2 = new AnimatorSet();
/* 111 */                   animatorSet2.setDuration(150L);
/* 120 */                   animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
/* 123 */                   arrayList.add(animatorSet2);
                        } else if (actionMenuView.getAlpha() < 1.0f) {
/* 135 */                   arrayList.add(objectAnimatorOfFloat);
                        }
                    }
/* 140 */           AnimatorSet animatorSet3 = new AnimatorSet();
/* 143 */           animatorSet3.playTogether(arrayList);
/* 146 */           this.f4454M0 = animatorSet3;
/* 153 */           animatorSet3.addListener(new C1030ik(this, i2));
/* 158 */           this.f4454M0.start();
                }

                /* JADX INFO: renamed from: F */
                public final void m2247F() {
/* 1 */             ActionMenuView actionMenuView = getActionMenuView();
/* 5 */             if (actionMenuView == null || this.f4454M0 != null) {
/* 48 */                return;
                    }
/* 13 */            actionMenuView.setAlpha(1.0f);
/* 16 */            View viewM2243B = m2243B();
/* 27 */            FloatingActionButton floatingActionButton = viewM2243B instanceof FloatingActionButton ? (FloatingActionButton) viewM2243B : null;
/* 29 */            if (floatingActionButton == null || !floatingActionButton.m2335i()) {
/* 45 */                m2250I(actionMenuView, 0, false, false);
                    } else {
/* 41 */                m2250I(actionMenuView, this.f4455N0, this.f4462U0, false);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:12:0x0029  */
                /* JADX INFO: renamed from: G */
                public final void m2248G() {
                    float f;
/* 9 */             getTopEdgeTreatment().f14325e0 = getFabTranslationX();
/* 11 */            View viewM2243B = m2243B();
/* 17 */            if (this.f4462U0) {
/* 19 */                View viewM2243B2 = m2243B();
/* 30 */                FloatingActionButton floatingActionButton = viewM2243B2 instanceof FloatingActionButton ? (FloatingActionButton) viewM2243B2 : null;
/* 31 */                if (floatingActionButton == null || !floatingActionButton.m2335i()) {
/* 42 */                    f = 0.0f;
                        } else {
/* 39 */                    f = 1.0f;
                        }
                    } else {
/* 42 */                f = 0.0f;
                    }
/* 45 */            this.f4452K0.m3743o(f);
/* 48 */            if (viewM2243B != null) {
/* 54 */                viewM2243B.setTranslationY(getFabTranslationY());
/* 61 */                viewM2243B.setTranslationX(getFabTranslationX());
                    }
                }

                /* JADX INFO: renamed from: H */
                public final void m2249H(int i) {
                    float f = i;
/* 10 */            if (f != getTopEdgeTreatment().f14323c0) {
/* 16 */                getTopEdgeTreatment().f14323c0 = f;
/* 20 */                this.f4452K0.invalidateSelf();
                    }
                }

                /* JADX INFO: renamed from: I */
                public final void m2250I(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
/* 3 */             RunnableC1930mk runnableC1930mk = new RunnableC1930mk(this, actionMenuView, i, z);
/* 6 */             if (z2) {
/* 8 */                 actionMenuView.post(runnableC1930mk);
                    } else {
/* 12 */                runnableC1930mk.run();
                    }
                }

                public ColorStateList getBackgroundTint() {
/* 5 */             return this.f4452K0.f8151a.f7639e;
                }

                @Override // androidx.coordinatorlayout.widget.InterfaceC0078a
                public Behavior getBehavior() {
/* 3 */             if (this.f4463V0 == null) {
/* 10 */                this.f4463V0 = new Behavior();
                    }
/* 12 */            return this.f4463V0;
                }

                public float getCradleVerticalOffset() {
/* 5 */             return getTopEdgeTreatment().f14324d0;
                }

                public int getFabAlignmentMode() {
/* 1 */             return this.f4455N0;
                }

                public int getFabAnimationMode() {
/* 1 */             return this.f4456O0;
                }

                public float getFabCradleMargin() {
/* 5 */             return getTopEdgeTreatment().f14322b0;
                }

                public float getFabCradleRoundedCornerRadius() {
/* 5 */             return getTopEdgeTreatment().f14321a0;
                }

                public boolean getHideOnScroll() {
/* 1 */             return this.f4457P0;
                }

                @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             he3.m4195r(this, this.f4452K0);
/* 15 */            if (getParent() instanceof ViewGroup) {
/* 24 */                ((ViewGroup) getParent()).setClipChildren(false);
                    }
                }

                @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             if (z) {
/* 6 */                 AnimatorSet animatorSet = this.f4454M0;
/* 8 */                 if (animatorSet != null) {
/* 10 */                    animatorSet.cancel();
                        }
/* 13 */                AnimatorSet animatorSet2 = this.f4453L0;
/* 15 */                if (animatorSet2 != null) {
/* 17 */                    animatorSet2.cancel();
                        }
/* 20 */                m2248G();
                    }
/* 23 */            m2247F();
                }

                @Override // androidx.appcompat.widget.Toolbar, android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 13 */            super.onRestoreInstanceState(savedState.f1292a);
/* 18 */            this.f4455N0 = savedState.f4473c;
/* 22 */            this.f4462U0 = savedState.f4474d;
                }

                @Override // androidx.appcompat.widget.Toolbar, android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 12 */            savedState.f4473c = this.f4455N0;
/* 16 */            savedState.f4474d = this.f4462U0;
/* 18 */            return savedState;
                }

                public void setBackgroundTint(ColorStateList colorStateList) {
/* 3 */             s90.m8448h(this.f4452K0, colorStateList);
                }

                public void setCradleVerticalOffset(float f) {
/* 7 */             if (f != getCradleVerticalOffset()) {
/* 13 */                getTopEdgeTreatment().m6994m(f);
/* 18 */                this.f4452K0.invalidateSelf();
/* 21 */                m2248G();
                    }
                }

                @Override // android.view.View
                public void setElevation(float f) {
/* 1 */             fd1 fd1Var = this.f4452K0;
/* 3 */             fd1Var.m3741m(f);
/* 14 */            int iM3736h = fd1Var.f8151a.f7649o - fd1Var.m3736h();
/* 15 */            Behavior behavior = getBehavior();
/* 19 */            behavior.f4439c = iM3736h;
/* 24 */            if (behavior.f4438b == 1) {
/* 30 */                setTranslationY(behavior.f4437a + iM3736h);
                    }
                }

                public void setFabAlignmentMode(int i) {
/* 1 */             int i2 = 1;
/* 2 */             this.f4461T0 = true;
/* 6 */             m2246E(i, this.f4462U0);
/* 11 */            if (this.f4455N0 != i) {
/* 13 */                WeakHashMap weakHashMap = e33.f7494a;
/* 19 */                if (isLaidOut()) {
/* 22 */                    AnimatorSet animatorSet = this.f4453L0;
/* 24 */                    if (animatorSet != null) {
/* 26 */                        animatorSet.cancel();
                            }
/* 31 */                    ArrayList arrayList = new ArrayList();
/* 37 */                    if (this.f4456O0 == 1) {
/* 39 */                        View viewM2243B = m2243B();
/* 61 */                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewM2243B instanceof FloatingActionButton ? (FloatingActionButton) viewM2243B : null, "translationX", m2245D(i));
/* 67 */                        objectAnimatorOfFloat.setDuration(300L);
/* 70 */                        arrayList.add(objectAnimatorOfFloat);
                            } else {
/* 74 */                        View viewM2243B2 = m2243B();
/* 83 */                        FloatingActionButton floatingActionButton = viewM2243B2 instanceof FloatingActionButton ? (FloatingActionButton) viewM2243B2 : null;
/* 85 */                        if (floatingActionButton != null && !floatingActionButton.m2334h()) {
/* 99 */                            floatingActionButton.m2333g(new C1834kk(this, i), true);
                                }
                            }
/* 104 */                   AnimatorSet animatorSet2 = new AnimatorSet();
/* 107 */                   animatorSet2.playTogether(arrayList);
/* 110 */                   this.f4453L0 = animatorSet2;
/* 117 */                   animatorSet2.addListener(new C1030ik(this, i2));
/* 122 */                   this.f4453L0.start();
                        }
                    }
/* 125 */           this.f4455N0 = i;
                }

                public void setFabAnimationMode(int i) {
/* 1 */             this.f4456O0 = i;
                }

                public void setFabCornerSize(float f) {
/* 9 */             if (f != getTopEdgeTreatment().f14326f0) {
/* 15 */                getTopEdgeTreatment().f14326f0 = f;
/* 19 */                this.f4452K0.invalidateSelf();
                    }
                }

                public void setFabCradleMargin(float f) {
/* 7 */             if (f != getFabCradleMargin()) {
/* 13 */                getTopEdgeTreatment().f14322b0 = f;
/* 17 */                this.f4452K0.invalidateSelf();
                    }
                }

                public void setFabCradleRoundedCornerRadius(float f) {
/* 7 */             if (f != getFabCradleRoundedCornerRadius()) {
/* 13 */                getTopEdgeTreatment().f14321a0 = f;
/* 17 */                this.f4452K0.invalidateSelf();
                    }
                }

                public void setHideOnScroll(boolean z) {
/* 1 */             this.f4457P0 = z;
                }

                @Override // androidx.appcompat.widget.Toolbar
                public void setNavigationIcon(Drawable drawable) {
/* 1 */             if (drawable != null && this.f4450I0 != null) {
/* 7 */                 drawable = drawable.mutate();
/* 17 */                s90.m8447g(drawable, this.f4450I0.intValue());
                    }
/* 20 */            super.setNavigationIcon(drawable);
                }

                public void setNavigationIconTint(int i) {
/* 5 */             this.f4450I0 = Integer.valueOf(i);
/* 7 */             Drawable navigationIcon = getNavigationIcon();
/* 11 */            if (navigationIcon != null) {
/* 13 */                setNavigationIcon(navigationIcon);
                    }
                }

                @Override // androidx.appcompat.widget.Toolbar
                public void setSubtitle(CharSequence charSequence) {
                }

                @Override // androidx.appcompat.widget.Toolbar
                public void setTitle(CharSequence charSequence) {
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 17 */        public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

                    /* JADX INFO: renamed from: e */
                    public final Rect f4469e;

                    /* JADX INFO: renamed from: f */
                    public WeakReference f4470f;

                    /* JADX INFO: renamed from: g */
                    public int f4471g;

                    /* JADX INFO: renamed from: h */
                    public final ViewOnLayoutChangeListenerC0340a f4472h;

                    public Behavior() {
/* 9 */                 this.f4472h = new ViewOnLayoutChangeListenerC0340a(this);
/* 16 */                this.f4469e = new Rect();
                    }

                    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: h */
                    public final boolean mo570h(CoordinatorLayout coordinatorLayout, View view, int i) {
/* 1 */                 BottomAppBar bottomAppBar = (BottomAppBar) view;
/* 8 */                 this.f4470f = new WeakReference(bottomAppBar);
/* 10 */                int i2 = BottomAppBar.f4449b1;
/* 12 */                View viewM2243B = bottomAppBar.m2243B();
/* 16 */                if (viewM2243B != null) {
/* 18 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 24 */                    if (!viewM2243B.isLaidOut()) {
/* 30 */                        C0080c c0080c = (C0080c) viewM2243B.getLayoutParams();
/* 34 */                        c0080c.f1221d = 49;
/* 38 */                        this.f4471g = ((ViewGroup.MarginLayoutParams) c0080c).bottomMargin;
/* 42 */                        if (viewM2243B instanceof FloatingActionButton) {
/* 44 */                            FloatingActionButton floatingActionButton = (FloatingActionButton) viewM2243B;
/* 50 */                            if (floatingActionButton.getShowMotionSpec() == null) {
/* 54 */                                floatingActionButton.setShowMotionSpecResource(R$animator.mtrl_fab_show_motion_spec);
                                    }
/* 61 */                            if (floatingActionButton.getHideMotionSpec() == null) {
/* 65 */                                floatingActionButton.setHideMotionSpecResource(R$animator.mtrl_fab_hide_motion_spec);
                                    }
/* 70 */                            floatingActionButton.addOnLayoutChangeListener(this.f4472h);
/* 75 */                            floatingActionButton.m2329c(bottomAppBar.f4467Z0);
/* 84 */                            floatingActionButton.m2330d(new C1030ik(bottomAppBar, 3));
/* 89 */                            floatingActionButton.m2331e(bottomAppBar.f4468a1);
                                }
/* 92 */                        bottomAppBar.m2248G();
                            }
                        }
/* 95 */                coordinatorLayout.m557p(i, bottomAppBar);
/* 98 */                super.mo570h(coordinatorLayout, bottomAppBar, i);
/* 101 */               return false;
                    }

                    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: p */
                    public final boolean mo578p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
/* 1 */                 BottomAppBar bottomAppBar = (BottomAppBar) view;
                        return bottomAppBar.getHideOnScroll() && super.mo578p(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
                    }

/* 18 */            public Behavior(Context context, AttributeSet attributeSet) {
/* 19 */                super(context, attributeSet);
/* 20 */                this.f4472h = new ViewOnLayoutChangeListenerC0340a(this);
/* 21 */                this.f4469e = new Rect();
                    }
                }

/* 360 */       public BottomAppBar(Context context, AttributeSet attributeSet) {
/* 361 */           this(context, attributeSet, R$attr.bottomAppBarStyle);
                }
            }
