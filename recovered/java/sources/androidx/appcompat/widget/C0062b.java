            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.graphics.drawable.Drawable;
            import android.os.Parcelable;
            import android.util.SparseBooleanArray;
            import android.view.LayoutInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.appcompat.R$layout;
            import androidx.appcompat.view.menu.ActionMenuItemView;
            import java.util.ArrayList;
            import p000.AbstractC1028ii;
            import p000.AbstractC1815k2;
            import p000.C0829d2;
            import p000.C0865e2;
            import p000.C0902f2;
            import p000.d52;
            import p000.dh1;
            import p000.dp0;
            import p000.f42;
            import p000.gh1;
            import p000.hi2;
            import p000.jg1;
            import p000.sg1;
            import p000.xg1;
            
            /* JADX INFO: renamed from: androidx.appcompat.widget.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0062b extends AbstractC1028ii {

                /* JADX INFO: renamed from: U */
                public C0902f2 f738U;

                /* JADX INFO: renamed from: V */
                public Drawable f739V;

                /* JADX INFO: renamed from: W */
                public boolean f740W;

                /* JADX INFO: renamed from: X */
                public boolean f741X;

                /* JADX INFO: renamed from: Y */
                public boolean f742Y;

                /* JADX INFO: renamed from: Z */
                public int f743Z;

                /* JADX INFO: renamed from: a0 */
                public int f744a0;

                /* JADX INFO: renamed from: b0 */
                public int f745b0;

                /* JADX INFO: renamed from: c0 */
                public boolean f746c0;

                /* JADX INFO: renamed from: d0 */
                public final SparseBooleanArray f747d0;

                /* JADX INFO: renamed from: e0 */
                public C0829d2 f748e0;

                /* JADX INFO: renamed from: f0 */
                public C0829d2 f749f0;

                /* JADX INFO: renamed from: g0 */
                public dp0 f750g0;

                /* JADX INFO: renamed from: h0 */
                public C0865e2 f751h0;

                /* JADX INFO: renamed from: i0 */
                public final d52 f752i0;

                /* JADX INFO: renamed from: j0 */
                public int f753j0;

                public C0062b(Context context) {
/* 1 */             int i = R$layout.abc_action_menu_layout;
/* 3 */             int i2 = R$layout.abc_action_menu_item_layout;
/* 8 */             this.f9604a = context;
/* 14 */            this.f9607d = LayoutInflater.from(context);
/* 16 */            this.f9609f = i;
/* 18 */            this.f9610i = i2;
/* 25 */            this.f747d0 = new SparseBooleanArray();
/* 32 */            this.f752i0 = new d52(this);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public final View m418a(sg1 sg1Var, View view, ViewGroup viewGroup) {
/* 1 */             View actionView = sg1Var.getActionView();
/* 6 */             if (actionView == null || sg1Var.m8502e()) {
/* 29 */                gh1 gh1Var = view instanceof gh1 ? (gh1) view : (gh1) this.f9607d.inflate(this.f9610i, viewGroup, false);
/* 31 */                gh1Var.mo327c(sg1Var);
/* 39 */                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) gh1Var;
/* 41 */                actionMenuItemView.setItemInvoker((ActionMenuView) this.f9611v);
/* 46 */                if (this.f751h0 == null) {
/* 53 */                    this.f751h0 = new C0865e2(this);
                        }
/* 57 */                actionMenuItemView.setPopupCallback(this.f751h0);
/* 61 */                actionView = (View) gh1Var;
                    }
/* 69 */            actionView.setVisibility(sg1Var.f16582C ? 8 : 0);
/* 74 */            ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
/* 78 */            ((ActionMenuView) viewGroup).getClass();
/* 83 */            if (!(layoutParams instanceof ActionMenuView.LayoutParams)) {
/* 89 */                actionView.setLayoutParams(ActionMenuView.m348k(layoutParams));
                    }
/* 92 */            return actionView;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p000.eh1
                /* JADX INFO: renamed from: b */
                public final void mo419b(boolean z) {
                    int i;
/* 3 */             ViewGroup viewGroup = (ViewGroup) this.f9611v;
/* 5 */             ArrayList arrayList = null;
/* 6 */             boolean z2 = false;
/* 7 */             if (viewGroup != null) {
/* 11 */                jg1 jg1Var = this.f9606c;
/* 13 */                if (jg1Var != null) {
/* 15 */                    jg1Var.m5806i();
/* 20 */                    ArrayList arrayListM5807l = this.f9606c.m5807l();
/* 24 */                    int size = arrayListM5807l.size();
/* 29 */                    i = 0;
/* 30 */                    for (int i2 = 0; i2 < size; i2++) {
/* 36 */                        sg1 sg1Var = (sg1) arrayListM5807l.get(i2);
/* 43 */                        if ((sg1Var.f16606x & 32) == 32) {
/* 45 */                            View childAt = viewGroup.getChildAt(i);
/* 61 */                            sg1 itemData = childAt instanceof gh1 ? ((gh1) childAt).getItemData() : null;
/* 62 */                            View viewM418a = m418a(sg1Var, childAt, viewGroup);
/* 66 */                            if (sg1Var != itemData) {
/* 68 */                                viewM418a.setPressed(false);
/* 71 */                                viewM418a.jumpDrawablesToCurrentState();
                                    }
/* 74 */                            if (viewM418a != childAt) {
/* 80 */                                ViewGroup viewGroup2 = (ViewGroup) viewM418a.getParent();
/* 82 */                                if (viewGroup2 != null) {
/* 84 */                                    viewGroup2.removeView(viewM418a);
                                        }
/* 91 */                                ((ViewGroup) this.f9611v).addView(viewM418a, i);
                                    }
/* 94 */                            i++;
                                }
                            }
                        } else {
/* 99 */                    i = 0;
                        }
/* 104 */               while (i < viewGroup.getChildCount()) {
/* 112 */                   if (viewGroup.getChildAt(i) == this.f738U) {
/* 114 */                       i++;
                            } else {
/* 117 */                       viewGroup.removeViewAt(i);
                            }
                        }
                    }
/* 125 */           ((View) this.f9611v).requestLayout();
/* 128 */           jg1 jg1Var2 = this.f9606c;
/* 130 */           if (jg1Var2 != null) {
/* 132 */               jg1Var2.m5806i();
/* 135 */               ArrayList arrayList2 = jg1Var2.f12264i;
/* 137 */               int size2 = arrayList2.size();
/* 142 */               for (int i3 = 0; i3 < size2; i3++) {
/* 150 */                   AbstractC1815k2 abstractC1815k2 = ((sg1) arrayList2.get(i3)).f16580A;
/* 152 */                   if (abstractC1815k2 != null) {
/* 154 */                       abstractC1815k2.f12562a = this;
                            }
                        }
                    }
/* 159 */           jg1 jg1Var3 = this.f9606c;
/* 161 */           if (jg1Var3 != null) {
/* 163 */               jg1Var3.m5806i();
/* 166 */               arrayList = jg1Var3.f12265j;
                    }
/* 171 */           if (this.f741X && arrayList != null) {
/* 175 */               int size3 = arrayList.size();
/* 179 */               if (size3 == 1) {
/* 189 */                   z2 = !((sg1) arrayList.get(0)).f16582C;
                        } else if (size3 > 0) {
/* 194 */                   z2 = true;
                        }
                    }
/* 195 */           C0902f2 c0902f2 = this.f738U;
/* 197 */           if (z2) {
/* 199 */               if (c0902f2 == null) {
/* 208 */                   this.f738U = new C0902f2(this, this.f9604a);
                        }
/* 216 */               ViewGroup viewGroup3 = (ViewGroup) this.f738U.getParent();
/* 220 */               if (viewGroup3 != this.f9611v) {
/* 222 */                   if (viewGroup3 != null) {
/* 226 */                       viewGroup3.removeView(this.f738U);
                            }
/* 231 */                   ActionMenuView actionMenuView = (ActionMenuView) this.f9611v;
/* 233 */                   C0902f2 c0902f3 = this.f738U;
/* 235 */                   actionMenuView.getClass();
/* 238 */                   ActionMenuView.LayoutParams layoutParamsM347j = ActionMenuView.m347j();
/* 242 */                   layoutParamsM347j.f469a = true;
/* 244 */                   actionMenuView.addView(c0902f3, layoutParamsM347j);
                        }
                    } else if (c0902f2 != null) {
/* 250 */               Object parent = c0902f2.getParent();
/* 254 */               Object obj = this.f9611v;
/* 256 */               if (parent == obj) {
/* 262 */                   ((ViewGroup) obj).removeView(this.f738U);
                        }
                    }
/* 271 */           ((ActionMenuView) this.f9611v).setOverflowReserved(this.f741X);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p000.eh1
                /* JADX INFO: renamed from: c */
                public final boolean mo420c(hi2 hi2Var) {
                    boolean z;
/* 6 */             if (hi2Var.hasVisibleItems()) {
/* 9 */                 hi2 hi2Var2 = hi2Var;
                        while (true) {
/* 10 */                    jg1 jg1Var = hi2Var2.f9088A;
/* 14 */                    if (jg1Var == this.f9606c) {
                                break;
                            }
/* 17 */                    hi2Var2 = (hi2) jg1Var;
                        }
/* 20 */                sg1 sg1Var = hi2Var2.f9089B;
/* 24 */                ViewGroup viewGroup = (ViewGroup) this.f9611v;
/* 26 */                View view = null;
/* 26 */                view = null;
/* 27 */                if (viewGroup != null) {
/* 30 */                    int childCount = viewGroup.getChildCount();
/* 35 */                    for (int i = 0; i < childCount; i++) {
/* 37 */                        View childAt = viewGroup.getChildAt(i);
/* 43 */                        if ((childAt instanceof gh1) && ((gh1) childAt).getItemData() == sg1Var) {
/* 54 */                            view = childAt;
                                    break;
                                }
                            }
                        }
/* 59 */                if (view != null) {
/* 66 */                    this.f753j0 = hi2Var.f9089B.f16583a;
/* 70 */                    int size = hi2Var.f12261f.size();
/* 74 */                    int i2 = 0;
                            while (true) {
/* 76 */                        if (i2 >= size) {
/* 99 */                            z = false;
                                    break;
                                }
/* 78 */                        MenuItem item = hi2Var.getItem(i2);
/* 86 */                        if (item.isVisible() && item.getIcon() != null) {
/* 94 */                            z = true;
                                    break;
                                }
/* 96 */                        i2++;
                            }
/* 104 */                   C0829d2 c0829d2 = new C0829d2(this, this.f9605b, hi2Var, view);
/* 107 */                   this.f749f0 = c0829d2;
/* 109 */                   c0829d2.f20142g = z;
/* 111 */                   xg1 xg1Var = c0829d2.f20144i;
/* 113 */                   if (xg1Var != null) {
/* 115 */                       xg1Var.mo5820p(z);
                            }
/* 118 */                   C0829d2 c0829d3 = this.f749f0;
/* 124 */                   if (!c0829d3.m10351b()) {
/* 129 */                       if (c0829d3.f20140e == null) {
/* 144 */                           f42.m3656l("MenuPopupHelper cannot be used without an anchor");
/* 5 */                             return false;
                                }
/* 131 */                       c0829d3.m10352d(0, 0, false, false);
                            }
/* 134 */                   dh1 dh1Var = this.f9608e;
/* 136 */                   if (dh1Var != null) {
/* 138 */                       dh1Var.mo2942z(hi2Var);
                            }
/* 75 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: d */
                public final void mo421d(jg1 jg1Var, boolean z) {
/* 1 */             m424j();
/* 4 */             C0829d2 c0829d2 = this.f749f0;
/* 6 */             if (c0829d2 != null && c0829d2.m10351b()) {
/* 16 */                c0829d2.f20144i.dismiss();
                    }
/* 19 */            dh1 dh1Var = this.f9608e;
/* 21 */            if (dh1Var != null) {
/* 23 */                dh1Var.mo2938d(jg1Var, z);
                    }
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: e */
                public final boolean mo422e() {
                    int size;
                    ArrayList arrayListM5807l;
                    int i;
                    boolean z;
/* 1 */             C0062b c0062b = this;
/* 3 */             jg1 jg1Var = c0062b.f9606c;
/* 6 */             if (jg1Var != null) {
/* 8 */                 arrayListM5807l = jg1Var.m5807l();
/* 12 */                size = arrayListM5807l.size();
                    } else {
/* 17 */                size = 0;
/* 18 */                arrayListM5807l = null;
                    }
/* 19 */            int i2 = c0062b.f745b0;
/* 21 */            int i3 = c0062b.f744a0;
/* 23 */            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
/* 29 */            ViewGroup viewGroup = (ViewGroup) c0062b.f9611v;
/* 31 */            int i4 = 0;
/* 32 */            boolean z2 = false;
/* 33 */            int i5 = 0;
/* 34 */            int i6 = 0;
                    while (true) {
/* 35 */                i = 2;
/* 36 */                z = true;
/* 37 */                if (i4 >= size) {
                            break;
                        }
/* 43 */                sg1 sg1Var = (sg1) arrayListM5807l.get(i4);
/* 45 */                int i7 = sg1Var.f16607y;
/* 49 */                if ((i7 & 2) == 2) {
/* 51 */                    i5++;
                        } else if ((i7 & 1) == 1) {
/* 58 */                    i6++;
                        } else {
/* 61 */                    z2 = true;
                        }
/* 64 */                if (c0062b.f746c0 && sg1Var.f16582C) {
/* 70 */                    i2 = 0;
                        }
/* 71 */                i4++;
                    }
/* 77 */            if (c0062b.f741X && (z2 || i6 + i5 > i2)) {
/* 84 */                i2--;
                    }
/* 86 */            int i8 = i2 - i5;
/* 87 */            SparseBooleanArray sparseBooleanArray = c0062b.f747d0;
/* 89 */            sparseBooleanArray.clear();
/* 92 */            int i9 = 0;
/* 93 */            int i10 = 0;
/* 94 */            while (i9 < size) {
/* 100 */               sg1 sg1Var2 = (sg1) arrayListM5807l.get(i9);
/* 102 */               int i11 = sg1Var2.f16607y;
/* 110 */               boolean z3 = (i11 & 2) == i ? z : false;
/* 111 */               int i12 = sg1Var2.f16584b;
/* 113 */               if (z3) {
/* 116 */                   View viewM418a = c0062b.m418a(sg1Var2, null, viewGroup);
/* 120 */                   viewM418a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
/* 123 */                   int measuredWidth = viewM418a.getMeasuredWidth();
/* 127 */                   i3 -= measuredWidth;
/* 128 */                   if (i10 == 0) {
/* 130 */                       i10 = measuredWidth;
                            }
/* 131 */                   if (i12 != 0) {
/* 133 */                       sparseBooleanArray.put(i12, z);
                            }
/* 136 */                   sg1Var2.m8504g(z);
                        } else {
/* 144 */                   if ((i11 & 1) == z) {
/* 146 */                       boolean z4 = sparseBooleanArray.get(i12);
/* 158 */                       boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
/* 160 */                       if (z5) {
/* 162 */                           View viewM418a2 = c0062b.m418a(sg1Var2, null, viewGroup);
/* 166 */                           viewM418a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
/* 169 */                           int measuredWidth2 = viewM418a2.getMeasuredWidth();
/* 173 */                           i3 -= measuredWidth2;
/* 174 */                           if (i10 == 0) {
/* 176 */                               i10 = measuredWidth2;
                                    }
/* 184 */                           z5 &= i3 + i10 > 0;
                                }
/* 185 */                       if (z5 && i12 != 0) {
/* 190 */                           sparseBooleanArray.put(i12, true);
                                } else if (z4) {
/* 197 */                           sparseBooleanArray.put(i12, false);
/* 201 */                           for (int i13 = 0; i13 < i9; i13++) {
/* 207 */                               sg1 sg1Var3 = (sg1) arrayListM5807l.get(i13);
/* 211 */                               if (sg1Var3.f16584b == i12) {
/* 218 */                                   if ((sg1Var3.f16606x & 32) == 32) {
/* 220 */                                       i8++;
                                            }
/* 223 */                                   sg1Var3.m8504g(false);
                                        }
                                    }
                                }
/* 232 */                       if (z5) {
/* 234 */                           i8--;
                                }
/* 236 */                       sg1Var2.m8504g(z5);
                            } else {
/* 241 */                       sg1Var2.m8504g(false);
                            }
/* 244 */                   i9++;
/* 246 */                   i = 2;
/* 247 */                   c0062b = this;
/* 249 */                   z = true;
                        }
/* 244 */               i9++;
/* 246 */               i = 2;
/* 247 */               c0062b = this;
/* 249 */               z = true;
                    }
/* 252 */           return z;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: g */
                public final void mo423g(Parcelable parcelable) {
                    int i;
                    MenuItem menuItemFindItem;
/* 3 */             if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i = ((ActionMenuPresenter$SavedState) parcelable).f456a) > 0 && (menuItemFindItem = this.f9606c.findItem(i)) != null) {
/* 26 */                mo420c((hi2) menuItemFindItem.getSubMenu());
                    }
                }

                /* JADX INFO: renamed from: j */
                public final boolean m424j() {
                    Object obj;
/* 1 */             dp0 dp0Var = this.f750g0;
/* 4 */             if (dp0Var != null && (obj = this.f9611v) != null) {
/* 12 */                ((View) obj).removeCallbacks(dp0Var);
/* 16 */                this.f750g0 = null;
/* 3 */                 return true;
                    }
/* 19 */            C0829d2 c0829d2 = this.f748e0;
/* 21 */            if (c0829d2 == null) {
/* 35 */                return false;
                    }
/* 27 */            if (c0829d2.m10351b()) {
/* 31 */                c0829d2.f20144i.dismiss();
                    }
/* 3 */             return true;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: k */
                public final void mo425k(Context context, jg1 jg1Var) {
/* 1 */             this.f9605b = context;
/* 3 */             LayoutInflater.from(context);
/* 6 */             this.f9606c = jg1Var;
/* 8 */             Resources resources = context.getResources();
/* 14 */            if (!this.f742Y) {
/* 17 */                this.f741X = true;
                    }
/* 29 */            int i = 2;
/* 31 */            this.f743Z = context.getResources().getDisplayMetrics().widthPixels / 2;
/* 37 */            Configuration configuration = context.getResources().getConfiguration();
/* 41 */            int i2 = configuration.screenWidthDp;
/* 43 */            int i3 = configuration.screenHeightDp;
/* 49 */            if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
/* 91 */                i = 5;
                    } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
/* 89 */                i = 4;
                    } else if (i2 >= 360) {
/* 87 */                i = 3;
                    }
/* 92 */            this.f745b0 = i;
/* 94 */            int measuredWidth = this.f743Z;
/* 99 */            if (this.f741X) {
/* 103 */               if (this.f738U == null) {
/* 109 */                   C0902f2 c0902f2 = new C0902f2(this, this.f9604a);
/* 112 */                   this.f738U = c0902f2;
/* 117 */                   if (this.f740W) {
/* 121 */                       c0902f2.setImageDrawable(this.f739V);
/* 124 */                       this.f739V = null;
/* 126 */                       this.f740W = false;
                            }
/* 128 */                   int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
/* 134 */                   this.f738U.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        }
/* 143 */               measuredWidth -= this.f738U.getMeasuredWidth();
                    } else {
/* 145 */               this.f738U = null;
                    }
/* 147 */           this.f744a0 = measuredWidth;
/* 153 */           float f = resources.getDisplayMetrics().density;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: l */
                public final Parcelable mo426l() {
/* 3 */             ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
/* 8 */             actionMenuPresenter$SavedState.f456a = this.f753j0;
/* 10 */            return actionMenuPresenter$SavedState;
                }

                /* JADX INFO: renamed from: m */
                public final boolean m427m() {
/* 1 */             C0829d2 c0829d2 = this.f748e0;
                    return c0829d2 != null && c0829d2.m10351b();
                }

                /* JADX INFO: renamed from: n */
                public final boolean m428n() {
                    jg1 jg1Var;
/* 3 */             boolean z = false;
/* 4 */             if (this.f741X && !m427m() && (jg1Var = this.f9606c) != null && this.f9611v != null && this.f750g0 == null) {
/* 24 */                jg1Var.m5806i();
/* 33 */                if (!jg1Var.f12265j.isEmpty()) {
/* 49 */                    dp0 dp0Var = new dp0(this, new C0829d2(this, this.f9605b, this.f9606c, this.f738U), 1, z);
/* 52 */                    this.f750g0 = dp0Var;
/* 58 */                    ((View) this.f9611v).post(dp0Var);
/* 48 */                    return true;
                        }
                    }
/* 3 */             return false;
                }
            }
