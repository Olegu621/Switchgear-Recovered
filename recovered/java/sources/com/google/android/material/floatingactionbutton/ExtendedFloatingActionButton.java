            package com.google.android.material.floatingactionbutton;

            import android.animation.Animator;
            import android.animation.AnimatorSet;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.coordinatorlayout.widget.C0080c;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import androidx.coordinatorlayout.widget.InterfaceC0078a;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import com.google.android.material.appbar.AppBarLayout;
            import com.google.android.material.bottomsheet.BottomSheetBehavior;
            import com.google.android.material.button.MaterialButton;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.WeakHashMap;
            import p000.AbstractC1832ki;
            import p000.C1938ms;
            import p000.C2315w1;
            import p000.d52;
            import p000.e33;
            import p000.hd1;
            import p000.mk1;
            import p000.qc3;
            import p000.rn2;
            import p000.tc2;
            import p000.w70;
            import p000.wf0;
            import p000.xf0;
            import p000.yf0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public class ExtendedFloatingActionButton extends MaterialButton implements InterfaceC0078a {

                /* JADX INFO: renamed from: u0 */
                public static final int f4721u0 = R$style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

                /* JADX INFO: renamed from: v0 */
                public static final C1938ms f4722v0;

                /* JADX INFO: renamed from: w0 */
                public static final C1938ms f4723w0;

                /* JADX INFO: renamed from: x0 */
                public static final C1938ms f4724x0;

                /* JADX INFO: renamed from: y0 */
                public static final C1938ms f4725y0;

                /* JADX INFO: renamed from: h0 */
                public int f4726h0;

                /* JADX INFO: renamed from: i0 */
                public final wf0 f4727i0;

                /* JADX INFO: renamed from: j0 */
                public final wf0 f4728j0;

                /* JADX INFO: renamed from: k0 */
                public final yf0 f4729k0;

                /* JADX INFO: renamed from: l0 */
                public final xf0 f4730l0;

                /* JADX INFO: renamed from: m0 */
                public final int f4731m0;

                /* JADX INFO: renamed from: n0 */
                public int f4732n0;

                /* JADX INFO: renamed from: o0 */
                public int f4733o0;

                /* JADX INFO: renamed from: p0 */
                public final ExtendedFloatingActionButtonBehavior f4734p0;

                /* JADX INFO: renamed from: q0 */
                public boolean f4735q0;

                /* JADX INFO: renamed from: r0 */
                public boolean f4736r0;

                /* JADX INFO: renamed from: s0 */
                public boolean f4737s0;

                /* JADX INFO: renamed from: t0 */
                public ColorStateList f4738t0;

                static {
/* 11 */            Class<Float> cls = Float.class;
/* 16 */            f4722v0 = new C1938ms("width", cls, 11);
/* 27 */            f4723w0 = new C1938ms("height", cls, 12);
/* 38 */            f4724x0 = new C1938ms("paddingStart", cls, 13);
/* 49 */            f4725y0 = new C1938ms("paddingEnd", cls, 14);
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
/* 7 */             int i2 = f4721u0;
/* 15 */            super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 19 */            this.f4726h0 = 0;
/* 23 */            d52 d52Var = new d52();
/* 28 */            yf0 yf0Var = new yf0(this, d52Var);
/* 31 */            this.f4729k0 = yf0Var;
/* 35 */            xf0 xf0Var = new xf0(this, d52Var);
/* 38 */            this.f4730l0 = xf0Var;
/* 41 */            this.f4735q0 = true;
/* 43 */            this.f4736r0 = false;
/* 45 */            this.f4737s0 = false;
/* 47 */            Context context2 = getContext();
/* 56 */            this.f4734p0 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
/* 62 */            TypedArray typedArrayM8213d = rn2.m8213d(context2, attributeSet, R$styleable.ExtendedFloatingActionButton, i, i2, new int[0]);
/* 68 */            mk1 mk1VarM6667a = mk1.m6667a(context2, typedArrayM8213d, R$styleable.ExtendedFloatingActionButton_showMotionSpec);
/* 74 */            mk1 mk1VarM6667a2 = mk1.m6667a(context2, typedArrayM8213d, R$styleable.ExtendedFloatingActionButton_hideMotionSpec);
/* 80 */            mk1 mk1VarM6667a3 = mk1.m6667a(context2, typedArrayM8213d, R$styleable.ExtendedFloatingActionButton_extendMotionSpec);
/* 86 */            mk1 mk1VarM6667a4 = mk1.m6667a(context2, typedArrayM8213d, R$styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
/* 97 */            this.f4731m0 = typedArrayM8213d.getDimensionPixelSize(R$styleable.ExtendedFloatingActionButton_collapsedSize, -1);
/* 99 */            WeakHashMap weakHashMap = e33.f7494a;
/* 105 */           this.f4732n0 = getPaddingStart();
/* 111 */           this.f4733o0 = getPaddingEnd();
/* 115 */           d52 d52Var2 = new d52();
/* 129 */           wf0 wf0Var = new wf0(this, d52Var2, new qc3(this, 25), true);
/* 132 */           this.f4728j0 = wf0Var;
/* 142 */           wf0 wf0Var2 = new wf0(this, d52Var2, new d52(this), false);
/* 145 */           this.f4727i0 = wf0Var2;
/* 147 */           yf0Var.f12783f = mk1VarM6667a;
/* 149 */           xf0Var.f12783f = mk1VarM6667a2;
/* 151 */           wf0Var.f12783f = mk1VarM6667a3;
/* 153 */           wf0Var2.f12783f = mk1VarM6667a4;
/* 155 */           typedArrayM8213d.recycle();
/* 168 */           setShapeAppearanceModel(tc2.m8776c(context2, attributeSet, i, i2, tc2.f17031m).m8478a());
/* 175 */           this.f4738t0 = getTextColors();
                }

                /* JADX WARN: Code duplicated, block: B:17:0x0023  */
                /* JADX WARN: Code duplicated, block: B:19:0x0029  */
                /* JADX WARN: Code duplicated, block: B:22:0x0046 A[LOOP:0: B:20:0x0040->B:22:0x0046, LOOP_END] */
                /* JADX INFO: renamed from: e */
                public static void m2324e(ExtendedFloatingActionButton extendedFloatingActionButton, AbstractC1832ki abstractC1832ki) {
                    AnimatorSet animatorSetMo6104a;
                    Iterator it;
/* 5 */             if (abstractC1832ki.mo6111h()) {
/* 7 */                 return;
                    }
/* 8 */             WeakHashMap weakHashMap = e33.f7494a;
/* 14 */            if (!extendedFloatingActionButton.isLaidOut()) {
/* 16 */                int visibility = extendedFloatingActionButton.getVisibility();
/* 20 */                int i = extendedFloatingActionButton.f4726h0;
/* 22 */                if (visibility == 0 ? i == 1 : i != 2) {
/* 34 */                    if (extendedFloatingActionButton.f4737s0) {
/* 40 */                        if (!extendedFloatingActionButton.isInEditMode()) {
/* 43 */                            extendedFloatingActionButton.measure(0, 0);
/* 46 */                            animatorSetMo6104a = abstractC1832ki.mo6104a();
/* 56 */                            animatorSetMo6104a.addListener(new C2315w1(abstractC1832ki, 4));
/* 61 */                            it = abstractC1832ki.f12780c.iterator();
/* 69 */                            while (it.hasNext()) {
/* 77 */                                animatorSetMo6104a.addListener((Animator.AnimatorListener) it.next());
                                    }
/* 81 */                            animatorSetMo6104a.start();
/* 84 */                            return;
                                }
                            }
                        }
                    } else if (!extendedFloatingActionButton.isInEditMode()) {
/* 43 */                extendedFloatingActionButton.measure(0, 0);
/* 46 */                animatorSetMo6104a = abstractC1832ki.mo6104a();
/* 56 */                animatorSetMo6104a.addListener(new C2315w1(abstractC1832ki, 4));
/* 61 */                it = abstractC1832ki.f12780c.iterator();
/* 69 */                while (it.hasNext()) {
/* 77 */                    animatorSetMo6104a.addListener((Animator.AnimatorListener) it.next());
                        }
/* 81 */                animatorSetMo6104a.start();
/* 84 */                return;
                    }
/* 85 */            abstractC1832ki.mo6110g();
                }

                /* JADX INFO: renamed from: f */
                public final void m2325f(ColorStateList colorStateList) {
/* 1 */             super.setTextColor(colorStateList);
                }

                @Override // androidx.coordinatorlayout.widget.InterfaceC0078a
                public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
/* 1 */             return this.f4734p0;
                }

                public int getCollapsedPadding() {
/* 10 */            return (getCollapsedSize() - getIconSize()) / 2;
                }

                public int getCollapsedSize() {
/* 1 */             int i = this.f4731m0;
/* 3 */             if (i >= 0) {
/* 27 */                return i;
                    }
/* 5 */             WeakHashMap weakHashMap = e33.f7494a;
/* 25 */            return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
                }

                public mk1 getExtendMotionSpec() {
/* 3 */             return this.f4728j0.f12783f;
                }

                public mk1 getHideMotionSpec() {
/* 3 */             return this.f4730l0.f12783f;
                }

                public mk1 getShowMotionSpec() {
/* 3 */             return this.f4729k0.f12783f;
                }

                public mk1 getShrinkMotionSpec() {
/* 3 */             return this.f4727i0.f12783f;
                }

                @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             if (this.f4735q0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
/* 25 */                this.f4735q0 = false;
/* 29 */                this.f4727i0.mo6110g();
                    }
                }

                public void setAnimateShowBeforeLayout(boolean z) {
/* 1 */             this.f4737s0 = z;
                }

                public void setExtendMotionSpec(mk1 mk1Var) {
/* 3 */             this.f4728j0.f12783f = mk1Var;
                }

                public void setExtendMotionSpecResource(int i) {
/* 9 */             setExtendMotionSpec(mk1.m6668b(getContext(), i));
                }

                public void setExtended(boolean z) {
/* 3 */             if (this.f4735q0 == z) {
/* 19 */                return;
                    }
/* 11 */            wf0 wf0Var = z ? this.f4728j0 : this.f4727i0;
/* 17 */            if (wf0Var.mo6111h()) {
/* 19 */                return;
                    }
/* 20 */            wf0Var.mo6110g();
                }

                public void setHideMotionSpec(mk1 mk1Var) {
/* 3 */             this.f4730l0.f12783f = mk1Var;
                }

                public void setHideMotionSpecResource(int i) {
/* 9 */             setHideMotionSpec(mk1.m6668b(getContext(), i));
                }

                @Override // android.widget.TextView, android.view.View
                public final void setPadding(int i, int i2, int i3, int i4) {
/* 1 */             super.setPadding(i, i2, i3, i4);
/* 6 */             if (!this.f4735q0 || this.f4736r0) {
/* 26 */                return;
                    }
/* 12 */            WeakHashMap weakHashMap = e33.f7494a;
/* 18 */            this.f4732n0 = getPaddingStart();
/* 24 */            this.f4733o0 = getPaddingEnd();
                }

                @Override // android.widget.TextView, android.view.View
                public final void setPaddingRelative(int i, int i2, int i3, int i4) {
/* 1 */             super.setPaddingRelative(i, i2, i3, i4);
/* 6 */             if (!this.f4735q0 || this.f4736r0) {
/* 16 */                return;
                    }
/* 12 */            this.f4732n0 = i;
/* 14 */            this.f4733o0 = i3;
                }

                public void setShowMotionSpec(mk1 mk1Var) {
/* 3 */             this.f4729k0.f12783f = mk1Var;
                }

                public void setShowMotionSpecResource(int i) {
/* 9 */             setShowMotionSpec(mk1.m6668b(getContext(), i));
                }

                public void setShrinkMotionSpec(mk1 mk1Var) {
/* 3 */             this.f4727i0.f12783f = mk1Var;
                }

                public void setShrinkMotionSpecResource(int i) {
/* 9 */             setShrinkMotionSpec(mk1.m6668b(getContext(), i));
                }

                @Override // android.widget.TextView
                public void setTextColor(int i) {
/* 1 */             super.setTextColor(i);
/* 8 */             this.f4738t0 = getTextColors();
                }

                @Override // android.widget.TextView
/* 10 */        public void setTextColor(ColorStateList colorStateList) {
/* 11 */            super.setTextColor(colorStateList);
/* 12 */            this.f4738t0 = getTextColors();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 30 */        public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

                    /* JADX INFO: renamed from: a */
                    public Rect f4739a;

                    /* JADX INFO: renamed from: b */
                    public final boolean f4740b;

                    /* JADX INFO: renamed from: c */
                    public final boolean f4741c;

                    public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 6 */                 TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExtendedFloatingActionButton_Behavior_Layout);
/* 17 */                this.f4740b = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
/* 26 */                this.f4741c = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
/* 28 */                typedArrayObtainStyledAttributes.recycle();
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: a */
                    public final /* bridge */ /* synthetic */ boolean mo563a(Rect rect, View view) {
/* 3 */                 return false;
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
/* 1 */                 ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
/* 6 */                 if (view2 instanceof AppBarLayout) {
/* 10 */                    m2326s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                        } else {
/* 14 */                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
/* 30 */                    if (layoutParams instanceof C0080c ? ((C0080c) layoutParams).f1218a instanceof BottomSheetBehavior : false) {
/* 32 */                        m2327t(view2, extendedFloatingActionButton);
                            }
                        }
/* 5 */                 return false;
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: h */
                    public final boolean mo570h(CoordinatorLayout coordinatorLayout, View view, int i) {
/* 1 */                 ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
/* 3 */                 ArrayList arrayListM552i = coordinatorLayout.m552i(extendedFloatingActionButton);
/* 7 */                 int size = arrayListM552i.size();
/* 13 */                for (int i2 = 0; i2 < size; i2++) {
/* 19 */                    View view2 = (View) arrayListM552i.get(i2);
/* 23 */                    if (!(view2 instanceof AppBarLayout)) {
/* 34 */                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
/* 50 */                        if ((layoutParams instanceof C0080c ? ((C0080c) layoutParams).f1218a instanceof BottomSheetBehavior : false) && m2327t(view2, extendedFloatingActionButton)) {
                                    break;
                                }
                            } else {
/* 31 */                        if (m2326s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                                    break;
                                }
                            }
                        }
/* 62 */                coordinatorLayout.m557p(i, extendedFloatingActionButton);
/* 65 */                return true;
                    }

                    /* JADX INFO: renamed from: s */
                    public final boolean m2326s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
/* 5 */                 C0080c c0080c = (C0080c) extendedFloatingActionButton.getLayoutParams();
/* 7 */                 boolean z = this.f4740b;
/* 9 */                 boolean z2 = this.f4741c;
/* 11 */                if ((!z && !z2) || c0080c.f1223f != appBarLayout.getId()) {
/* 24 */                    return false;
                        }
/* 28 */                if (this.f4739a == null) {
/* 35 */                    this.f4739a = new Rect();
                        }
/* 37 */                Rect rect = this.f4739a;
/* 39 */                w70.m9478a(coordinatorLayout, appBarLayout, rect);
/* 48 */                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
/* 57 */                    ExtendedFloatingActionButton.m2324e(extendedFloatingActionButton, z2 ? extendedFloatingActionButton.f4727i0 : extendedFloatingActionButton.f4730l0);
/* 71 */                    return true;
                        }
/* 68 */                ExtendedFloatingActionButton.m2324e(extendedFloatingActionButton, z2 ? extendedFloatingActionButton.f4728j0 : extendedFloatingActionButton.f4729k0);
/* 71 */                return true;
                    }

                    /* JADX INFO: renamed from: t */
                    public final boolean m2327t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
/* 5 */                 C0080c c0080c = (C0080c) extendedFloatingActionButton.getLayoutParams();
/* 7 */                 boolean z = this.f4740b;
/* 9 */                 boolean z2 = this.f4741c;
/* 11 */                if ((!z && !z2) || c0080c.f1223f != view.getId()) {
/* 24 */                    return false;
                        }
/* 45 */                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((C0080c) extendedFloatingActionButton.getLayoutParams())).topMargin) {
/* 54 */                    ExtendedFloatingActionButton.m2324e(extendedFloatingActionButton, z2 ? extendedFloatingActionButton.f4727i0 : extendedFloatingActionButton.f4730l0);
/* 68 */                    return true;
                        }
/* 65 */                ExtendedFloatingActionButton.m2324e(extendedFloatingActionButton, z2 ? extendedFloatingActionButton.f4728j0 : extendedFloatingActionButton.f4729k0);
/* 68 */                return true;
                    }

/* 31 */            public ExtendedFloatingActionButtonBehavior() {
/* 33 */                this.f4740b = false;
/* 34 */                this.f4741c = true;
                    }
                }

/* 177 */       public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
/* 178 */           this(context, attributeSet, R$attr.extendedFloatingActionButtonStyle);
                }
            }
