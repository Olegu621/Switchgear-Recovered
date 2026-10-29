            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.RippleDrawable;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.FrameLayout;
            import android.widget.TextView;
            import androidx.recyclerview.widget.AbstractC0129g;
            import androidx.recyclerview.widget.AbstractC0137o;
            import com.google.android.material.R$layout;
            import com.google.android.material.internal.NavigationMenuItemView;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yl1 extends AbstractC0129g {

                /* JADX INFO: renamed from: d */
                public final ArrayList f19677d = new ArrayList();

                /* JADX INFO: renamed from: e */
                public sg1 f19678e;

                /* JADX INFO: renamed from: f */
                public boolean f19679f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ gm1 f19680g;

                public yl1(gm1 gm1Var) {
/* 1 */             this.f19680g = gm1Var;
/* 13 */            m10157h();
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: a */
                public final int mo955a() {
/* 3 */             return this.f19677d.size();
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: b */
                public final long mo956b(int i) {
/* 1 */             return i;
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: c */
                public final int mo957c(int i) {
/* 7 */             am1 am1Var = (am1) this.f19677d.get(i);
/* 11 */            if (am1Var instanceof bm1) {
/* 13 */                return 2;
                    }
/* 17 */            if (am1Var instanceof zl1) {
/* 19 */                return 3;
                    }
/* 24 */            if (am1Var instanceof cm1) {
                        return ((cm1) am1Var).f3000a.hasSubMenu() ? 1 : 0;
                    }
/* 41 */            f42.m3663s("Unknown item type.");
/* 23 */            return 0;
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: e */
                public final void mo959e(AbstractC0137o abstractC0137o, int i) {
/* 3 */             View view = ((fm1) abstractC0137o).f1778a;
/* 5 */             int iMo957c = mo957c(i);
/* 9 */             ArrayList arrayList = this.f19677d;
/* 11 */            gm1 gm1Var = this.f19680g;
/* 13 */            if (iMo957c != 0) {
/* 16 */                if (iMo957c != 1) {
/* 19 */                    if (iMo957c != 2) {
/* 83 */                        return;
                            }
/* 26 */                    bm1 bm1Var = (bm1) arrayList.get(i);
/* 36 */                    view.setPadding(gm1Var.f8724c0, bm1Var.f2534a, gm1Var.f8726d0, bm1Var.f2535b);
/* 39 */                    return;
                        }
/* 40 */                TextView textView = (TextView) view;
/* 52 */                textView.setText(((cm1) arrayList.get(i)).f3000a.f16587e);
/* 55 */                int i2 = gm1Var.f8733i;
/* 57 */                if (i2 != 0) {
/* 59 */                    textView.setTextAppearance(i2);
                        }
/* 73 */                textView.setPadding(gm1Var.f8728e0, textView.getPaddingTop(), 0, textView.getPaddingBottom());
/* 76 */                ColorStateList colorStateList = gm1Var.f8738v;
/* 78 */                if (colorStateList != null) {
/* 80 */                    textView.setTextColor(colorStateList);
/* 83 */                    return;
                        }
/* 83 */                return;
                    }
/* 84 */            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
/* 88 */            navigationMenuItemView.setIconTintList(gm1Var.f8714V);
/* 91 */            int i3 = gm1Var.f8739w;
/* 93 */            if (i3 != 0) {
/* 95 */                navigationMenuItemView.setTextAppearance(i3);
                    }
/* 98 */            ColorStateList colorStateList2 = gm1Var.f8713U;
/* 100 */           if (colorStateList2 != null) {
/* 102 */               navigationMenuItemView.setTextColor(colorStateList2);
                    }
/* 105 */           Drawable drawable = gm1Var.f8715W;
/* 118 */           Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
/* 119 */           WeakHashMap weakHashMap = e33.f7494a;
/* 121 */           navigationMenuItemView.setBackground(drawableNewDrawable);
/* 124 */           RippleDrawable rippleDrawable = gm1Var.f8716X;
/* 126 */           if (rippleDrawable != null) {
/* 136 */               navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
                    }
/* 143 */           cm1 cm1Var = (cm1) arrayList.get(i);
/* 147 */           navigationMenuItemView.setNeedsEmptyIcon(cm1Var.f3001b);
/* 150 */           int i4 = gm1Var.f8717Y;
/* 152 */           int i5 = gm1Var.f8718Z;
/* 154 */           navigationMenuItemView.setPadding(i4, i5, i4, i5);
/* 159 */           navigationMenuItemView.setIconPadding(gm1Var.f8720a0);
/* 164 */           if (gm1Var.f8730f0) {
/* 168 */               navigationMenuItemView.setIconSize(gm1Var.f8722b0);
                    }
/* 173 */           navigationMenuItemView.setMaxLines(gm1Var.f8732h0);
/* 178 */           navigationMenuItemView.mo327c(cm1Var.f3000a);
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: f */
                public final AbstractC0137o mo960f(ViewGroup viewGroup, int i) {
/* 2 */             gm1 gm1Var = this.f19680g;
/* 4 */             if (i == 0) {
/* 55 */                LayoutInflater layoutInflater = gm1Var.f8729f;
/* 57 */                ViewOnClickListenerC2239u1 viewOnClickListenerC2239u1 = gm1Var.f8737l0;
/* 61 */                View viewInflate = layoutInflater.inflate(R$layout.design_navigation_item, viewGroup, false);
/* 65 */                em1 em1Var = new em1(viewInflate);
/* 68 */                viewInflate.setOnClickListener(viewOnClickListenerC2239u1);
/* 71 */                return em1Var;
                    }
/* 7 */             if (i == 1) {
/* 49 */                return new xl1(gm1Var.f8729f.inflate(R$layout.design_navigation_item_subheader, viewGroup, false));
                    }
/* 10 */            if (i == 2) {
/* 35 */                return new xl1(gm1Var.f8729f.inflate(R$layout.design_navigation_item_separator, viewGroup, false));
                    }
/* 13 */            if (i != 3) {
/* 15 */                return null;
                    }
/* 21 */            return new xl1(gm1Var.f8721b);
                }

                @Override // androidx.recyclerview.widget.AbstractC0129g
                /* JADX INFO: renamed from: g */
                public final void mo961g(AbstractC0137o abstractC0137o) {
/* 1 */             fm1 fm1Var = (fm1) abstractC0137o;
/* 5 */             if (fm1Var instanceof em1) {
/* 9 */                 NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) fm1Var.f1778a;
/* 11 */                FrameLayout frameLayout = navigationMenuItemView.f4800n0;
/* 13 */                if (frameLayout != null) {
/* 15 */                    frameLayout.removeAllViews();
                        }
/* 21 */                navigationMenuItemView.f4799m0.setCompoundDrawables(null, null, null, null);
                    }
                }

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
                /* JADX INFO: renamed from: h */
                public final void m10157h() {
                    boolean z;
/* 5 */             if (this.f19679f) {
/* 7 */                 return;
                    }
/* 9 */             this.f19679f = true;
/* 11 */            ArrayList arrayList = this.f19677d;
/* 13 */            arrayList.clear();
/* 21 */            arrayList.add(new zl1());
/* 24 */            gm1 gm1Var = this.f19680g;
/* 32 */            int size = gm1Var.f8723c.m5807l().size();
/* 36 */            boolean z2 = false;
/* 37 */            int i = -1;
/* 38 */            int i2 = 0;
/* 39 */            boolean z3 = false;
/* 40 */            int size2 = 0;
/* 41 */            while (i2 < size) {
/* 53 */                sg1 sg1Var = (sg1) gm1Var.f8723c.m5807l().get(i2);
/* 59 */                if (sg1Var.isChecked()) {
/* 61 */                    m10158i(sg1Var);
                        }
/* 68 */                if (sg1Var.isCheckable()) {
/* 70 */                    sg1Var.m8503f(z2);
                        }
/* 77 */                if (sg1Var.hasSubMenu()) {
/* 79 */                    hi2 hi2Var = sg1Var.f16597o;
/* 85 */                    if (hi2Var.hasVisibleItems()) {
/* 87 */                        if (i2 != 0) {
/* 96 */                            arrayList.add(new bm1(gm1Var.f8735j0, z2 ? 1 : 0));
                                }
/* 104 */                       arrayList.add(new cm1(sg1Var));
/* 113 */                       int size3 = hi2Var.f12261f.size();
/* 117 */                       int i3 = z2 ? 1 : 0;
/* 118 */                       int i4 = i3;
/* 119 */                       while (i3 < size3) {
/* 127 */                           sg1 sg1Var2 = (sg1) hi2Var.getItem(i3);
/* 133 */                           if (sg1Var2.isVisible()) {
/* 135 */                               if (i4 == 0 && sg1Var2.getIcon() != null) {
/* 143 */                                   i4 = 1;
                                        }
/* 148 */                               if (sg1Var2.isCheckable()) {
/* 150 */                                   sg1Var2.m8503f(z2);
                                        }
/* 157 */                               if (sg1Var.isChecked()) {
/* 159 */                                   m10158i(sg1Var);
                                        }
/* 167 */                               arrayList.add(new cm1(sg1Var2));
                                    }
/* 170 */                           i3++;
/* 173 */                           z2 = false;
                                }
/* 175 */                       if (i4 != 0) {
/* 177 */                           int size4 = arrayList.size();
/* 181 */                           for (int size5 = arrayList.size(); size5 < size4; size5++) {
/* 190 */                               ((cm1) arrayList.get(size5)).f3001b = true;
                                    }
                                }
                            }
/* 195 */                   z = true;
                        } else {
/* 197 */                   int i5 = sg1Var.f16584b;
/* 199 */                   if (i5 != i) {
/* 201 */                       size2 = arrayList.size();
/* 213 */                       z3 = sg1Var.getIcon() != null;
/* 214 */                       if (i2 != 0) {
/* 216 */                           size2++;
/* 220 */                           int i6 = gm1Var.f8735j0;
/* 225 */                           arrayList.add(new bm1(i6, i6));
                                }
                            } else {
/* 230 */                       if (!z3 && sg1Var.getIcon() != null) {
/* 238 */                           int size6 = arrayList.size();
/* 243 */                           for (int i7 = size2; i7 < size6; i7++) {
/* 252 */                               ((cm1) arrayList.get(i7)).f3001b = true;
                                    }
/* 257 */                           z = true;
/* 258 */                           z3 = true;
                                }
/* 261 */                       cm1 cm1Var = new cm1(sg1Var);
/* 264 */                       cm1Var.f3001b = z3;
/* 266 */                       arrayList.add(cm1Var);
/* 269 */                       i = i5;
                            }
/* 228 */                   z = true;
/* 261 */                   cm1 cm1Var2 = new cm1(sg1Var);
/* 264 */                   cm1Var2.f3001b = z3;
/* 266 */                   arrayList.add(cm1Var2);
/* 269 */                   i = i5;
                        }
/* 270 */               i2++;
/* 273 */               z2 = false;
                    }
/* 277 */           this.f19679f = z2 ? 1 : 0;
                }

                /* JADX INFO: renamed from: i */
                public final void m10158i(sg1 sg1Var) {
/* 3 */             if (this.f19678e == sg1Var || !sg1Var.isCheckable()) {
/* 26 */                return;
                    }
/* 12 */            sg1 sg1Var2 = this.f19678e;
/* 14 */            if (sg1Var2 != null) {
/* 17 */                sg1Var2.setChecked(false);
                    }
/* 20 */            this.f19678e = sg1Var;
/* 23 */            sg1Var.setChecked(true);
                }
            }
