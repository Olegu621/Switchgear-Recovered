            package com.google.android.material.internal;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.StateListDrawable;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewStub;
            import android.widget.CheckedTextView;
            import android.widget.FrameLayout;
            import android.widget.LinearLayout;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.widget.LinearLayoutCompat;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$drawable;
            import com.google.android.material.R$id;
            import com.google.android.material.R$layout;
            import java.util.WeakHashMap;
            import p000.C2343wt;
            import p000.d42;
            import p000.e33;
            import p000.gh1;
            import p000.i13;
            import p000.s90;
            import p000.sg1;
            import p000.y32;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 54 */    public class NavigationMenuItemView extends ForegroundLinearLayout implements gh1 {

                /* JADX INFO: renamed from: t0 */
                public static final int[] f4795t0 = {R.attr.state_checked};

                /* JADX INFO: renamed from: j0 */
                public int f4796j0;

                /* JADX INFO: renamed from: k0 */
                public boolean f4797k0;

                /* JADX INFO: renamed from: l0 */
                public boolean f4798l0;

                /* JADX INFO: renamed from: m0 */
                public final CheckedTextView f4799m0;

                /* JADX INFO: renamed from: n0 */
                public FrameLayout f4800n0;

                /* JADX INFO: renamed from: o0 */
                public sg1 f4801o0;

                /* JADX INFO: renamed from: p0 */
                public ColorStateList f4802p0;

                /* JADX INFO: renamed from: q0 */
                public boolean f4803q0;

                /* JADX INFO: renamed from: r0 */
                public Drawable f4804r0;

                /* JADX INFO: renamed from: s0 */
                public final C2343wt f4805s0;

                public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 7 */             C2343wt c2343wt = new C2343wt(this, 4);
/* 10 */            this.f4805s0 = c2343wt;
/* 13 */            setOrientation(0);
/* 23 */            LayoutInflater.from(context).inflate(R$layout.design_navigation_menu_item, (ViewGroup) this, true);
/* 36 */            setIconSize(context.getResources().getDimensionPixelSize(R$dimen.design_navigation_icon_size));
/* 45 */            CheckedTextView checkedTextView = (CheckedTextView) findViewById(R$id.design_menu_item_text);
/* 47 */            this.f4799m0 = checkedTextView;
/* 49 */            checkedTextView.setDuplicateParentStateEnabled(true);
/* 52 */            e33.m3318n(checkedTextView, c2343wt);
                }

                private void setActionView(View view) {
/* 1 */             if (view != null) {
/* 5 */                 if (this.f4800n0 == null) {
/* 21 */                    this.f4800n0 = (FrameLayout) ((ViewStub) findViewById(R$id.design_menu_item_action_area_stub)).inflate();
                        }
/* 25 */                this.f4800n0.removeAllViews();
/* 30 */                this.f4800n0.addView(view);
                    }
                }

                @Override // p000.gh1
                /* JADX INFO: renamed from: c */
                public final void mo327c(sg1 sg1Var) {
                    StateListDrawable stateListDrawable;
/* 1 */             this.f4801o0 = sg1Var;
/* 3 */             int i = sg1Var.f16583a;
/* 5 */             if (i > 0) {
/* 7 */                 setId(i);
                    }
/* 22 */            setVisibility(sg1Var.isVisible() ? 0 : 8);
/* 29 */            if (getBackground() == null) {
/* 33 */                TypedValue typedValue = new TypedValue();
/* 51 */                if (getContext().getTheme().resolveAttribute(R$attr.colorControlHighlight, typedValue, true)) {
/* 55 */                    stateListDrawable = new StateListDrawable();
/* 67 */                    stateListDrawable.addState(f4795t0, new ColorDrawable(typedValue.data));
/* 77 */                    stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
                        } else {
/* 81 */                    stateListDrawable = null;
                        }
/* 82 */                WeakHashMap weakHashMap = e33.f7494a;
/* 84 */                setBackground(stateListDrawable);
                    }
/* 91 */            setCheckable(sg1Var.isCheckable());
/* 98 */            setChecked(sg1Var.isChecked());
/* 105 */           setEnabled(sg1Var.isEnabled());
/* 110 */           setTitle(sg1Var.f16587e);
/* 117 */           setIcon(sg1Var.getIcon());
/* 124 */           setActionView(sg1Var.getActionView());
/* 129 */           setContentDescription(sg1Var.f16599q);
/* 134 */           i13.m4420B(this, sg1Var.f16600r);
/* 137 */           sg1 sg1Var2 = this.f4801o0;
/* 139 */           CharSequence charSequence = sg1Var2.f16587e;
/* 141 */           CheckedTextView checkedTextView = this.f4799m0;
/* 143 */           if (charSequence == null && sg1Var2.getIcon() == null && this.f4801o0.getActionView() != null) {
/* 159 */               checkedTextView.setVisibility(8);
/* 162 */               FrameLayout frameLayout = this.f4800n0;
/* 164 */               if (frameLayout != null) {
/* 170 */                   LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
/* 173 */                   ((LinearLayout.LayoutParams) layoutParams).width = -1;
/* 177 */                   this.f4800n0.setLayoutParams(layoutParams);
/* 180 */                   return;
                        }
/* 202 */               return;
                    }
/* 181 */           checkedTextView.setVisibility(0);
/* 184 */           FrameLayout frameLayout2 = this.f4800n0;
/* 186 */           if (frameLayout2 != null) {
/* 192 */               LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
/* 195 */               ((LinearLayout.LayoutParams) layoutParams2).width = -2;
/* 199 */               this.f4800n0.setLayoutParams(layoutParams2);
                    }
                }

                @Override // p000.gh1
                public sg1 getItemData() {
/* 1 */             return this.f4801o0;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final int[] onCreateDrawableState(int i) {
/* 3 */             int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
/* 7 */             sg1 sg1Var = this.f4801o0;
/* 9 */             if (sg1Var != null && sg1Var.isCheckable() && this.f4801o0.isChecked()) {
/* 27 */                View.mergeDrawableStates(iArrOnCreateDrawableState, f4795t0);
                    }
/* 30 */            return iArrOnCreateDrawableState;
                }

                public void setCheckable(boolean z) {
/* 1 */             refreshDrawableState();
/* 6 */             if (this.f4798l0 != z) {
/* 8 */                 this.f4798l0 = z;
/* 16 */                this.f4805s0.mo1208h(this.f4799m0, 2048);
                    }
                }

                public void setChecked(boolean z) {
/* 1 */             refreshDrawableState();
/* 6 */             this.f4799m0.setChecked(z);
                }

                public void setHorizontalPadding(int i) {
/* 9 */             setPadding(i, getPaddingTop(), i, getPaddingBottom());
                }

                public void setIcon(Drawable drawable) {
/* 2 */             if (drawable != null) {
/* 6 */                 if (this.f4803q0) {
/* 8 */                     Drawable.ConstantState constantState = drawable.getConstantState();
/* 12 */                    if (constantState != null) {
/* 15 */                        drawable = constantState.newDrawable();
                            }
/* 19 */                    drawable = drawable.mutate();
/* 25 */                    s90.m8448h(drawable, this.f4802p0);
                        }
/* 28 */                int i = this.f4796j0;
/* 30 */                drawable.setBounds(0, 0, i, i);
                    } else if (this.f4797k0) {
/* 40 */                if (this.f4804r0 == null) {
/* 42 */                    Resources resources = getResources();
/* 46 */                    int i2 = R$drawable.navigation_empty_icon;
/* 52 */                    Resources.Theme theme = getContext().getTheme();
/* 56 */                    ThreadLocal threadLocal = d42.f6978a;
/* 58 */                    Drawable drawableM10100a = y32.m10100a(resources, i2, theme);
/* 62 */                    this.f4804r0 = drawableM10100a;
/* 64 */                    if (drawableM10100a != null) {
/* 66 */                        int i3 = this.f4796j0;
/* 68 */                        drawableM10100a.setBounds(0, 0, i3, i3);
                            }
                        }
/* 71 */                drawable = this.f4804r0;
                    }
/* 76 */            this.f4799m0.setCompoundDrawablesRelative(drawable, null, null, null);
                }

                public void setIconPadding(int i) {
/* 3 */             this.f4799m0.setCompoundDrawablePadding(i);
                }

                public void setIconSize(int i) {
/* 1 */             this.f4796j0 = i;
                }

                public void setIconTintList(ColorStateList colorStateList) {
/* 1 */             this.f4802p0 = colorStateList;
/* 8 */             this.f4803q0 = colorStateList != null;
/* 10 */            sg1 sg1Var = this.f4801o0;
/* 12 */            if (sg1Var != null) {
/* 18 */                setIcon(sg1Var.getIcon());
                    }
                }

                public void setMaxLines(int i) {
/* 3 */             this.f4799m0.setMaxLines(i);
                }

                public void setNeedsEmptyIcon(boolean z) {
/* 1 */             this.f4797k0 = z;
                }

                public void setTextAppearance(int i) {
/* 3 */             this.f4799m0.setTextAppearance(i);
                }

                public void setTextColor(ColorStateList colorStateList) {
/* 3 */             this.f4799m0.setTextColor(colorStateList);
                }

                public void setTitle(CharSequence charSequence) {
/* 3 */             this.f4799m0.setText(charSequence);
                }

/* 55 */        public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
/* 56 */            this(context, attributeSet, 0);
                }
            }
