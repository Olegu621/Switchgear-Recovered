            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.drawable.Drawable;
            import android.util.SparseArray;
            import android.util.TypedValue;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.FrameLayout;
            import android.widget.ImageView;
            import androidx.transition.AutoTransition;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$integer;
            import com.google.android.material.navigation.C0366b;
            import java.lang.ref.WeakReference;
            import java.util.HashSet;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class tl1 extends ViewGroup implements hh1 {

                /* JADX INFO: renamed from: q0 */
                public static final int[] f17147q0 = {R.attr.state_checked};

                /* JADX INFO: renamed from: r0 */
                public static final int[] f17148r0 = {-16842910};

                /* JADX INFO: renamed from: U */
                public int f17149U;

                /* JADX INFO: renamed from: V */
                public ColorStateList f17150V;

                /* JADX INFO: renamed from: W */
                public final ColorStateList f17151W;

                /* JADX INFO: renamed from: a */
                public final AutoTransition f17152a;

                /* JADX INFO: renamed from: a0 */
                public int f17153a0;

                /* JADX INFO: renamed from: b */
                public final ViewOnClickListenerC2239u1 f17154b;

                /* JADX INFO: renamed from: b0 */
                public int f17155b0;

                /* JADX INFO: renamed from: c */
                public final ot1 f17156c;

                /* JADX INFO: renamed from: c0 */
                public Drawable f17157c0;

                /* JADX INFO: renamed from: d */
                public final SparseArray f17158d;

                /* JADX INFO: renamed from: d0 */
                public int f17159d0;

                /* JADX INFO: renamed from: e */
                public int f17160e;

                /* JADX INFO: renamed from: e0 */
                public final SparseArray f17161e0;

                /* JADX INFO: renamed from: f */
                public rl1[] f17162f;

                /* JADX INFO: renamed from: f0 */
                public int f17163f0;

                /* JADX INFO: renamed from: g0 */
                public int f17164g0;

                /* JADX INFO: renamed from: h0 */
                public boolean f17165h0;

                /* JADX INFO: renamed from: i */
                public int f17166i;

                /* JADX INFO: renamed from: i0 */
                public int f17167i0;

                /* JADX INFO: renamed from: j0 */
                public int f17168j0;

                /* JADX INFO: renamed from: k0 */
                public int f17169k0;

                /* JADX INFO: renamed from: l0 */
                public tc2 f17170l0;

                /* JADX INFO: renamed from: m0 */
                public boolean f17171m0;

                /* JADX INFO: renamed from: n0 */
                public ColorStateList f17172n0;

                /* JADX INFO: renamed from: o0 */
                public C0366b f17173o0;

                /* JADX INFO: renamed from: p0 */
                public jg1 f17174p0;

                /* JADX INFO: renamed from: v */
                public int f17175v;

                /* JADX INFO: renamed from: w */
                public ColorStateList f17176w;

                public tl1(Context context) {
/* 1 */             super(context);
/* 10 */            this.f17156c = new ot1(5);
/* 17 */            this.f17158d = new SparseArray(5);
/* 20 */            this.f17166i = 0;
/* 22 */            this.f17175v = 0;
/* 29 */            this.f17161e0 = new SparseArray(5);
/* 32 */            this.f17163f0 = -1;
/* 34 */            this.f17164g0 = -1;
/* 36 */            this.f17171m0 = false;
/* 42 */            this.f17151W = m8810c();
/* 48 */            if (isInEditMode()) {
/* 51 */                this.f17152a = null;
                    } else {
/* 56 */                AutoTransition autoTransition = new AutoTransition();
/* 59 */                this.f17152a = autoTransition;
/* 61 */                autoTransition.m1112K(0);
/* 64 */                Context context2 = getContext();
/* 68 */                int i = R$attr.motionDurationLong1;
/* 76 */                int integer = getResources().getInteger(R$integer.material_motion_duration_long_1);
/* 80 */                TypedValue typedValueM10197C = yy1.m10197C(context2, i);
/* 84 */                if (typedValueM10197C != null && typedValueM10197C.type == 16) {
/* 92 */                    integer = typedValueM10197C.data;
                        }
/* 95 */                autoTransition.mo1108z(integer);
/* 110 */               autoTransition.mo1084B(hu0.m4348y0(getContext(), R$attr.motionEasingStandard, AbstractC2246u8.f17411b));
/* 118 */               autoTransition.m1109H(new jn2());
                    }
/* 127 */           this.f17154b = new ViewOnClickListenerC2239u1(this, 6);
/* 129 */           WeakHashMap weakHashMap = e33.f7494a;
/* 132 */           setImportantForAccessibility(1);
                }

                /* JADX INFO: renamed from: f */
                public static boolean m8808f(int i, int i2) {
/* 2 */             if (i == -1) {
                        return i2 > 3;
                    }
                    return i == 0;
                }

                private rl1 getNewItem() {
/* 7 */             rl1 rl1Var = (rl1) this.f17156c.mo7042a();
                    return rl1Var == null ? mo4579e(getContext()) : rl1Var;
                }

                private void setBadgeIfNeeded(rl1 rl1Var) {
                    C1927mh c1927mh;
/* 1 */             int id = rl1Var.getId();
/* 6 */             if (id == -1 || (c1927mh = (C1927mh) this.f17161e0.get(id)) == null) {
/* 21 */                return;
                    }
/* 18 */            rl1Var.setBadge(c1927mh);
                }

                /* JADX INFO: renamed from: a */
                public final void m8809a() {
/* 1 */             removeAllViews();
/* 4 */             rl1[] rl1VarArr = this.f17162f;
/* 9 */             if (rl1VarArr != null) {
/* 13 */                for (rl1 rl1Var : rl1VarArr) {
/* 17 */                    if (rl1Var != null) {
/* 21 */                        this.f17156c.mo7044c(rl1Var);
/* 24 */                        ImageView imageView = rl1Var.f16148V;
/* 28 */                        if (rl1Var.f16172p0 != null) {
/* 30 */                            if (imageView != null) {
/* 32 */                                rl1Var.setClipChildren(true);
/* 35 */                                rl1Var.setClipToPadding(true);
/* 38 */                                C1927mh c1927mh = rl1Var.f16172p0;
/* 40 */                                if (c1927mh != null) {
/* 43 */                                    WeakReference weakReference = c1927mh.f13772X;
/* 55 */                                    if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
/* 57 */                                        WeakReference weakReference2 = c1927mh.f13772X;
/* 69 */                                        (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(null);
                                            } else {
/* 77 */                                        imageView.getOverlay().remove(c1927mh);
                                            }
                                        }
                                    }
/* 80 */                            rl1Var.f16172p0 = null;
                                }
/* 82 */                        rl1Var.f16157d0 = null;
/* 85 */                        rl1Var.f16166j0 = 0.0f;
/* 87 */                        rl1Var.f16150a = false;
                            }
                        }
                    }
/* 100 */           if (this.f17174p0.f12261f.size() == 0) {
/* 102 */               this.f17166i = 0;
/* 104 */               this.f17175v = 0;
/* 106 */               this.f17162f = null;
/* 108 */               return;
                    }
/* 111 */           HashSet hashSet = new HashSet();
/* 123 */           for (int i = 0; i < this.f17174p0.f12261f.size(); i++) {
/* 139 */               hashSet.add(Integer.valueOf(this.f17174p0.getItem(i).getItemId()));
                    }
/* 145 */           int i2 = 0;
                    while (true) {
/* 146 */               SparseArray sparseArray = this.f17161e0;
/* 152 */               if (i2 >= sparseArray.size()) {
                            break;
                        }
/* 154 */               int iKeyAt = sparseArray.keyAt(i2);
/* 166 */               if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
/* 168 */                   sparseArray.delete(iKeyAt);
                        }
/* 171 */               i2++;
                    }
/* 184 */           this.f17162f = new rl1[this.f17174p0.f12261f.size()];
/* 198 */           boolean zM8808f = m8808f(this.f17160e, this.f17174p0.m5807l().size());
/* 211 */           for (int i3 = 0; i3 < this.f17174p0.f12261f.size(); i3++) {
/* 215 */               this.f17173o0.f4832b = true;
/* 223 */               this.f17174p0.getItem(i3).setCheckable(true);
/* 228 */               this.f17173o0.f4832b = false;
/* 230 */               rl1 newItem = getNewItem();
/* 236 */               this.f17162f[i3] = newItem;
/* 240 */               newItem.setIconTintList(this.f17176w);
/* 245 */               newItem.setIconSize(this.f17149U);
/* 250 */               newItem.setTextColor(this.f17151W);
/* 255 */               newItem.setTextAppearanceInactive(this.f17153a0);
/* 260 */               newItem.setTextAppearanceActive(this.f17155b0);
/* 265 */               newItem.setTextColor(this.f17150V);
/* 268 */               int i4 = this.f17163f0;
/* 271 */               if (i4 != -1) {
/* 273 */                   newItem.setItemPaddingTop(i4);
                        }
/* 276 */               int i5 = this.f17164g0;
/* 278 */               if (i5 != -1) {
/* 280 */                   newItem.setItemPaddingBottom(i5);
                        }
/* 285 */               newItem.setActiveIndicatorWidth(this.f17167i0);
/* 290 */               newItem.setActiveIndicatorHeight(this.f17168j0);
/* 295 */               newItem.setActiveIndicatorMarginHorizontal(this.f17169k0);
/* 302 */               newItem.setActiveIndicatorDrawable(m8811d());
/* 307 */               newItem.setActiveIndicatorResizeable(this.f17171m0);
/* 312 */               newItem.setActiveIndicatorEnabled(this.f17165h0);
/* 315 */               Drawable drawable = this.f17157c0;
/* 317 */               if (drawable != null) {
/* 319 */                   newItem.setItemBackground(drawable);
                        } else {
/* 325 */                   newItem.setItemBackground(this.f17159d0);
                        }
/* 328 */               newItem.setShifting(zM8808f);
/* 333 */               newItem.setLabelVisibilityMode(this.f17160e);
/* 342 */               sg1 sg1Var = (sg1) this.f17174p0.getItem(i3);
/* 344 */               newItem.mo327c(sg1Var);
/* 347 */               newItem.setItemPosition(i3);
/* 350 */               int i6 = sg1Var.f16583a;
/* 360 */               newItem.setOnTouchListener((View.OnTouchListener) this.f17158d.get(i6));
/* 365 */               newItem.setOnClickListener(this.f17154b);
/* 368 */               int i7 = this.f17166i;
/* 370 */               if (i7 != 0 && i6 == i7) {
/* 374 */                   this.f17175v = i3;
                        }
/* 376 */               setBadgeIfNeeded(newItem);
/* 379 */               addView(newItem);
                    }
/* 397 */           int iMin = Math.min(this.f17174p0.f12261f.size() - 1, this.f17175v);
/* 401 */           this.f17175v = iMin;
/* 409 */           this.f17174p0.getItem(iMin).setChecked(true);
                }

                @Override // p000.hh1
                /* JADX INFO: renamed from: b */
                public final void mo331b(jg1 jg1Var) {
/* 1 */             this.f17174p0 = jg1Var;
                }

                /* JADX INFO: renamed from: c */
                public final ColorStateList m8810c() {
/* 3 */             TypedValue typedValue = new TypedValue();
/* 22 */            if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
/* 51 */                return null;
                    }
/* 31 */            ColorStateList colorStateList = v00.getColorStateList(getContext(), typedValue.resourceId);
/* 49 */            if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R$attr.colorPrimary, typedValue, true)) {
/* 51 */                return null;
                    }
/* 53 */            int i = typedValue.data;
/* 55 */            int defaultColor = colorStateList.getDefaultColor();
/* 61 */            int[] iArr = f17147q0;
/* 63 */            int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
/* 65 */            int[] iArr3 = f17148r0;
/* 79 */            return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateList.getColorForState(iArr3, defaultColor), i, defaultColor});
                }

                /* JADX INFO: renamed from: d */
                public final fd1 m8811d() {
/* 3 */             if (this.f17170l0 == null || this.f17172n0 == null) {
/* 22 */                return null;
                    }
/* 13 */            fd1 fd1Var = new fd1(this.f17170l0);
/* 18 */            fd1Var.m3742n(this.f17172n0);
/* 21 */            return fd1Var;
                }

                /* JADX INFO: renamed from: e */
                public abstract rl1 mo4579e(Context context);

                public SparseArray<C1927mh> getBadgeDrawables() {
/* 1 */             return this.f17161e0;
                }

                public ColorStateList getIconTintList() {
/* 1 */             return this.f17176w;
                }

                public ColorStateList getItemActiveIndicatorColor() {
/* 1 */             return this.f17172n0;
                }

                public boolean getItemActiveIndicatorEnabled() {
/* 1 */             return this.f17165h0;
                }

                public int getItemActiveIndicatorHeight() {
/* 1 */             return this.f17168j0;
                }

                public int getItemActiveIndicatorMarginHorizontal() {
/* 1 */             return this.f17169k0;
                }

                public tc2 getItemActiveIndicatorShapeAppearance() {
/* 1 */             return this.f17170l0;
                }

                public int getItemActiveIndicatorWidth() {
/* 1 */             return this.f17167i0;
                }

                public Drawable getItemBackground() {
/* 1 */             rl1[] rl1VarArr = this.f17162f;
                    return (rl1VarArr == null || rl1VarArr.length <= 0) ? this.f17157c0 : rl1VarArr[0].getBackground();
                }

                @Deprecated
                public int getItemBackgroundRes() {
/* 1 */             return this.f17159d0;
                }

                public int getItemIconSize() {
/* 1 */             return this.f17149U;
                }

                public int getItemPaddingBottom() {
/* 1 */             return this.f17164g0;
                }

                public int getItemPaddingTop() {
/* 1 */             return this.f17163f0;
                }

                public int getItemTextAppearanceActive() {
/* 1 */             return this.f17155b0;
                }

                public int getItemTextAppearanceInactive() {
/* 1 */             return this.f17153a0;
                }

                public ColorStateList getItemTextColor() {
/* 1 */             return this.f17150V;
                }

                public int getLabelVisibilityMode() {
/* 1 */             return this.f17160e;
                }

                public jg1 getMenu() {
/* 1 */             return this.f17174p0;
                }

                public int getSelectedItemId() {
/* 1 */             return this.f17166i;
                }

                public int getSelectedItemPosition() {
/* 1 */             return this.f17175v;
                }

                public int getWindowAnimations() {
/* 1 */             return 0;
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 23 */            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0828d1.m2904b(1, this.f17174p0.m5807l().size(), 1).f6954a);
                }

                public void setIconTintList(ColorStateList colorStateList) {
/* 1 */             this.f17176w = colorStateList;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setIconTintList(colorStateList);
                        }
                    }
                }

                public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
/* 1 */             this.f17172n0 = colorStateList;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 17 */                    rl1Var.setActiveIndicatorDrawable(m8811d());
                        }
                    }
                }

                public void setItemActiveIndicatorEnabled(boolean z) {
/* 1 */             this.f17165h0 = z;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setActiveIndicatorEnabled(z);
                        }
                    }
                }

                public void setItemActiveIndicatorHeight(int i) {
/* 1 */             this.f17168j0 = i;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setActiveIndicatorHeight(i);
                        }
                    }
                }

                public void setItemActiveIndicatorMarginHorizontal(int i) {
/* 1 */             this.f17169k0 = i;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setActiveIndicatorMarginHorizontal(i);
                        }
                    }
                }

                public void setItemActiveIndicatorResizeable(boolean z) {
/* 1 */             this.f17171m0 = z;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setActiveIndicatorResizeable(z);
                        }
                    }
                }

                public void setItemActiveIndicatorShapeAppearance(tc2 tc2Var) {
/* 1 */             this.f17170l0 = tc2Var;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 17 */                    rl1Var.setActiveIndicatorDrawable(m8811d());
                        }
                    }
                }

                public void setItemActiveIndicatorWidth(int i) {
/* 1 */             this.f17167i0 = i;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setActiveIndicatorWidth(i);
                        }
                    }
                }

                public void setItemBackground(Drawable drawable) {
/* 1 */             this.f17157c0 = drawable;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setItemBackground(drawable);
                        }
                    }
                }

                public void setItemBackgroundRes(int i) {
/* 1 */             this.f17159d0 = i;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setItemBackground(i);
                        }
                    }
                }

                public void setItemIconSize(int i) {
/* 1 */             this.f17149U = i;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setIconSize(i);
                        }
                    }
                }

                public void setItemPaddingBottom(int i) {
/* 1 */             this.f17164g0 = i;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setItemPaddingBottom(i);
                        }
                    }
                }

                public void setItemPaddingTop(int i) {
/* 1 */             this.f17163f0 = i;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setItemPaddingTop(i);
                        }
                    }
                }

                public void setItemTextAppearanceActive(int i) {
/* 1 */             this.f17155b0 = i;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setTextAppearanceActive(i);
/* 16 */                    ColorStateList colorStateList = this.f17150V;
/* 18 */                    if (colorStateList != null) {
/* 20 */                        rl1Var.setTextColor(colorStateList);
                            }
                        }
                    }
                }

                public void setItemTextAppearanceInactive(int i) {
/* 1 */             this.f17153a0 = i;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setTextAppearanceInactive(i);
/* 16 */                    ColorStateList colorStateList = this.f17150V;
/* 18 */                    if (colorStateList != null) {
/* 20 */                        rl1Var.setTextColor(colorStateList);
                            }
                        }
                    }
                }

                public void setItemTextColor(ColorStateList colorStateList) {
/* 1 */             this.f17150V = colorStateList;
/* 3 */             rl1[] rl1VarArr = this.f17162f;
/* 5 */             if (rl1VarArr != null) {
/* 9 */                 for (rl1 rl1Var : rl1VarArr) {
/* 13 */                    rl1Var.setTextColor(colorStateList);
                        }
                    }
                }

                public void setLabelVisibilityMode(int i) {
/* 1 */             this.f17160e = i;
                }

                public void setPresenter(C0366b c0366b) {
/* 1 */             this.f17173o0 = c0366b;
                }
            }
