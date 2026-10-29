            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.graphics.drawable.Drawable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.ContextThemeWrapper;
            import android.view.KeyEvent;
            import android.view.Menu;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityEvent;
            import android.widget.LinearLayout;
            import androidx.appcompat.view.menu.ActionMenuItemView;
            import p000.AbstractC0208c9;
            import p000.C0829d2;
            import p000.C0902f2;
            import p000.InterfaceC0939g2;
            import p000.InterfaceC0976h2;
            import p000.dc0;
            import p000.dh1;
            import p000.gr0;
            import p000.hg1;
            import p000.hh1;
            import p000.ig1;
            import p000.jg1;
            import p000.m53;
            import p000.sg1;
            import p000.zr3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public class ActionMenuView extends LinearLayoutCompat implements ig1, hh1 {

                /* JADX INFO: renamed from: d0 */
                public jg1 f457d0;

                /* JADX INFO: renamed from: e0 */
                public Context f458e0;

                /* JADX INFO: renamed from: f0 */
                public int f459f0;

                /* JADX INFO: renamed from: g0 */
                public boolean f460g0;

                /* JADX INFO: renamed from: h0 */
                public C0062b f461h0;

                /* JADX INFO: renamed from: i0 */
                public zr3 f462i0;

                /* JADX INFO: renamed from: j0 */
                public hg1 f463j0;

                /* JADX INFO: renamed from: k0 */
                public boolean f464k0;

                /* JADX INFO: renamed from: l0 */
                public int f465l0;

                /* JADX INFO: renamed from: m0 */
                public final int f466m0;

                /* JADX INFO: renamed from: n0 */
                public final int f467n0;

                /* JADX INFO: renamed from: o0 */
                public InterfaceC0976h2 f468o0;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

                    /* JADX INFO: renamed from: a */
                    public boolean f469a;

                    /* JADX INFO: renamed from: b */
                    public int f470b;

                    /* JADX INFO: renamed from: c */
                    public int f471c;

                    /* JADX INFO: renamed from: d */
                    public boolean f472d;

                    /* JADX INFO: renamed from: e */
                    public boolean f473e;

                    /* JADX INFO: renamed from: f */
                    public boolean f474f;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
                    }
                }

                public ActionMenuView(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             setBaselineAligned(false);
/* 16 */            float f = context.getResources().getDisplayMetrics().density;
/* 22 */            this.f466m0 = (int) (56.0f * f);
/* 28 */            this.f467n0 = (int) (f * 4.0f);
/* 30 */            this.f458e0 = context;
/* 32 */            this.f459f0 = 0;
                }

                /* JADX INFO: renamed from: j */
                public static LayoutParams m347j() {
/* 4 */             LayoutParams layoutParams = new LayoutParams(-2, -2);
/* 8 */             layoutParams.f469a = false;
/* 12 */            ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
/* 14 */            return layoutParams;
                }

                /* JADX INFO: renamed from: k */
                public static LayoutParams m348k(ViewGroup.LayoutParams layoutParams) {
                    LayoutParams layoutParams2;
/* 1 */             if (layoutParams == null) {
/* 33 */                return m347j();
                    }
/* 5 */             if (layoutParams instanceof LayoutParams) {
/* 9 */                 LayoutParams layoutParams3 = (LayoutParams) layoutParams;
/* 11 */                layoutParams2 = new LayoutParams(layoutParams3);
/* 16 */                layoutParams2.f469a = layoutParams3.f469a;
                    } else {
/* 21 */                layoutParams2 = new LayoutParams(layoutParams);
                    }
/* 26 */            if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
/* 30 */                ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
                    }
/* 32 */            return layoutParams2;
                }

                @Override // p000.ig1
                /* JADX INFO: renamed from: a */
                public final boolean mo330a(sg1 sg1Var) {
/* 5 */             return this.f457d0.m5809q(sg1Var, null, 0);
                }

                @Override // p000.hh1
                /* JADX INFO: renamed from: b */
                public final void mo331b(jg1 jg1Var) {
/* 1 */             this.f457d0 = jg1Var;
                }

                @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             return layoutParams instanceof LayoutParams;
                }

                @Override // android.view.View
                public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             return false;
                }

                @Override // androidx.appcompat.widget.LinearLayoutCompat
                /* JADX INFO: renamed from: f */
                public final /* bridge */ /* synthetic */ LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
/* 1 */             return m347j();
                }

                @Override // androidx.appcompat.widget.LinearLayoutCompat
                /* JADX INFO: renamed from: g */
                public final LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new LayoutParams(getContext(), attributeSet);
                }

                @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
                public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 1 */             return m347j();
                }

                @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new LayoutParams(getContext(), attributeSet);
                }

                public Menu getMenu() {
/* 3 */             if (this.f457d0 == null) {
/* 5 */                 Context context = getContext();
/* 11 */                jg1 jg1Var = new jg1(context);
/* 14 */                this.f457d0 = jg1Var;
/* 21 */                jg1Var.f12260e = new gr0(this);
/* 25 */                C0062b c0062b = new C0062b(context);
/* 28 */                this.f461h0 = c0062b;
/* 31 */                c0062b.f741X = true;
/* 33 */                c0062b.f742Y = true;
/* 35 */                dh1 dc0Var = this.f462i0;
/* 37 */                if (dc0Var == null) {
/* 44 */                    dc0Var = new dc0(15);
                        }
/* 47 */                c0062b.f9608e = dc0Var;
/* 53 */                this.f457d0.m5802b(c0062b, this.f458e0);
/* 56 */                C0062b c0062b2 = this.f461h0;
/* 58 */                c0062b2.f9611v = this;
/* 62 */                this.f457d0 = c0062b2.f9606c;
                    }
/* 64 */            return this.f457d0;
                }

                public Drawable getOverflowIcon() {
/* 1 */             getMenu();
/* 4 */             C0062b c0062b = this.f461h0;
/* 6 */             C0902f2 c0902f2 = c0062b.f738U;
/* 8 */             if (c0902f2 != null) {
/* 10 */                return c0902f2.getDrawable();
                    }
/* 17 */            if (c0062b.f740W) {
/* 19 */                return c0062b.f739V;
                    }
/* 22 */            return null;
                }

                public int getPopupTheme() {
/* 1 */             return this.f459f0;
                }

                public int getWindowAnimations() {
/* 1 */             return 0;
                }

                @Override // androidx.appcompat.widget.LinearLayoutCompat
                /* JADX INFO: renamed from: h */
                public final /* bridge */ /* synthetic */ LinearLayoutCompat.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             return m348k(layoutParams);
                }

                /* JADX INFO: renamed from: l */
                public final boolean m352l(int i) {
/* 1 */             boolean zMo325a = false;
/* 2 */             if (i == 0) {
/* 1 */                 return false;
                    }
/* 7 */             KeyEvent.Callback childAt = getChildAt(i - 1);
/* 11 */            KeyEvent.Callback childAt2 = getChildAt(i);
/* 19 */            if (i < getChildCount() && (childAt instanceof InterfaceC0939g2)) {
/* 27 */                zMo325a = ((InterfaceC0939g2) childAt).mo325a();
                    }
                    return (i <= 0 || !(childAt2 instanceof InterfaceC0939g2)) ? zMo325a : ((InterfaceC0939g2) childAt2).mo326b() | zMo325a;
                }

                @Override // android.view.View
                public final void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 4 */             C0062b c0062b = this.f461h0;
/* 6 */             if (c0062b != null) {
/* 9 */                 c0062b.mo419b(false);
/* 18 */                if (this.f461h0.m427m()) {
/* 22 */                    this.f461h0.m424j();
/* 27 */                    this.f461h0.m428n();
                        }
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             C0062b c0062b = this.f461h0;
/* 6 */             if (c0062b != null) {
/* 8 */                 c0062b.m424j();
/* 11 */                C0829d2 c0829d2 = c0062b.f749f0;
/* 13 */                if (c0829d2 == null || !c0829d2.m10351b()) {
/* 26 */                    return;
                        }
/* 23 */                c0829d2.f20144i.dismiss();
                    }
                }

                @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int width;
                    int paddingLeft;
/* 5 */             if (!this.f464k0) {
/* 7 */                 super.onLayout(z, i, i2, i3, i4);
/* 10 */                return;
                    }
/* 11 */            int childCount = getChildCount();
/* 17 */            int i5 = (i4 - i2) / 2;
/* 19 */            int dividerWidth = getDividerWidth();
/* 23 */            int i6 = i3 - i;
/* 35 */            int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
/* 36 */            boolean z2 = m53.f13568a;
/* 47 */            boolean z3 = getLayoutDirection() == 1;
/* 49 */            int i7 = 0;
/* 50 */            int i8 = 0;
/* 53 */            for (int i9 = 0; i9 < childCount; i9++) {
/* 55 */                View childAt = getChildAt(i9);
/* 63 */                if (childAt.getVisibility() != 8) {
/* 70 */                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 74 */                    if (layoutParams.f469a) {
/* 76 */                        int measuredWidth = childAt.getMeasuredWidth();
/* 84 */                        if (m352l(i9)) {
/* 86 */                            measuredWidth += dividerWidth;
                                }
/* 87 */                        int measuredHeight = childAt.getMeasuredHeight();
/* 91 */                        if (z3) {
/* 99 */                            paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
/* 100 */                           width = paddingLeft + measuredWidth;
                                } else {
/* 115 */                           width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
/* 117 */                           paddingLeft = width - measuredWidth;
                                }
/* 121 */                       int i10 = i5 - (measuredHeight / 2);
/* 124 */                       childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
/* 127 */                       paddingRight -= measuredWidth;
/* 128 */                       i7 = 1;
                            } else {
/* 140 */                       paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
/* 141 */                       m352l(i9);
/* 144 */                       i8++;
                            }
                        }
                    }
/* 149 */           if (childCount == 1 && i7 == 0) {
/* 154 */               View childAt2 = getChildAt(0);
/* 158 */               int measuredWidth2 = childAt2.getMeasuredWidth();
/* 162 */               int measuredHeight2 = childAt2.getMeasuredHeight();
/* 170 */               int i11 = (i6 / 2) - (measuredWidth2 / 2);
/* 173 */               int i12 = i5 - (measuredHeight2 / 2);
/* 176 */               childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
/* 179 */               return;
                    }
/* 182 */           int i13 = i8 - (i7 ^ 1);
/* 191 */           int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
/* 195 */           if (z3) {
/* 205 */               int width2 = getWidth() - getPaddingRight();
/* 207 */               for (int i14 = 0; i14 < childCount; i14++) {
/* 209 */                   View childAt3 = getChildAt(i14);
/* 217 */                   LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
/* 223 */                   if (childAt3.getVisibility() != 8 && !layoutParams2.f469a) {
/* 232 */                       int i15 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
/* 233 */                       int measuredWidth3 = childAt3.getMeasuredWidth();
/* 237 */                       int measuredHeight3 = childAt3.getMeasuredHeight();
/* 243 */                       int i16 = i5 - (measuredHeight3 / 2);
/* 248 */                       childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
/* 255 */                       width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                            }
                        }
/* 317 */               return;
                    }
/* 259 */           int paddingLeft2 = getPaddingLeft();
/* 264 */           for (int i17 = 0; i17 < childCount; i17++) {
/* 266 */               View childAt4 = getChildAt(i17);
/* 274 */               LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
/* 280 */               if (childAt4.getVisibility() != 8 && !layoutParams3.f469a) {
/* 289 */                   int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
/* 290 */                   int measuredWidth4 = childAt4.getMeasuredWidth();
/* 294 */                   int measuredHeight4 = childAt4.getMeasuredHeight();
/* 300 */                   int i19 = i5 - (measuredHeight4 / 2);
/* 305 */                   childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
/* 312 */                   paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + iMax + i18;
                        }
                    }
                }

                /* JADX WARN: Type inference failed for: r11v15 */
                /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r11v18 */
                /* JADX WARN: Type inference failed for: r11v41 */
                @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
                public final void onMeasure(int i, int i2) {
                    int i3;
                    int i4;
                    ?? r11;
                    int i5;
                    int i6;
                    jg1 jg1Var;
/* 3 */             boolean z = this.f464k0;
/* 17 */            boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
/* 18 */            this.f464k0 = z2;
/* 20 */            if (z != z2) {
/* 22 */                this.f465l0 = 0;
                    }
/* 24 */            int size = View.MeasureSpec.getSize(i);
/* 30 */            if (this.f464k0 && (jg1Var = this.f457d0) != null && size != this.f465l0) {
/* 40 */                this.f465l0 = size;
/* 42 */                jg1Var.mo5808p(true);
                    }
/* 45 */            int childCount = getChildCount();
/* 51 */            if (!this.f464k0 || childCount <= 0) {
/* 767 */               for (int i7 = 0; i7 < childCount; i7++) {
/* 777 */                   LayoutParams layoutParams = (LayoutParams) getChildAt(i7).getLayoutParams();
/* 780 */                   ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
/* 782 */                   ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
                        }
/* 787 */               super.onMeasure(i, i2);
/* 790 */               return;
                    }
/* 55 */            int mode = View.MeasureSpec.getMode(i2);
/* 59 */            int size2 = View.MeasureSpec.getSize(i);
/* 63 */            int size3 = View.MeasureSpec.getSize(i2);
/* 75 */            int paddingRight = getPaddingRight() + getPaddingLeft();
/* 84 */            int paddingBottom = getPaddingBottom() + getPaddingTop();
/* 88 */            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
/* 92 */            int i8 = size2 - paddingRight;
/* 93 */            int i9 = this.f466m0;
/* 95 */            int i10 = i8 / i9;
/* 97 */            int i11 = i8 % i9;
/* 99 */            if (i10 == 0) {
/* 101 */               setMeasuredDimension(i8, 0);
/* 104 */               return;
                    }
/* 106 */           int i12 = (i11 / i10) + i9;
/* 107 */           int childCount2 = getChildCount();
/* 111 */           int iMax = 0;
/* 112 */           int i13 = 0;
/* 113 */           int iMax2 = 0;
/* 114 */           int i14 = 0;
/* 115 */           boolean z3 = false;
/* 116 */           int i15 = 0;
/* 120 */           long j = 0;
                    while (true) {
/* 122 */               i3 = this.f467n0;
/* 124 */               if (i14 >= childCount2) {
                            break;
                        }
/* 126 */               View childAt = getChildAt(i14);
/* 130 */               int i16 = size3;
/* 136 */               int i17 = paddingBottom;
/* 140 */               if (childAt.getVisibility() == 8) {
/* 142 */                   i5 = i12;
                        } else {
/* 146 */                   boolean z4 = childAt instanceof ActionMenuItemView;
/* 148 */                   i13++;
/* 151 */                   if (z4) {
/* 153 */                       childAt.setPadding(i3, 0, i3, 0);
                            }
/* 160 */                   LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
/* 162 */                   layoutParams2.f474f = false;
/* 164 */                   layoutParams2.f471c = 0;
/* 166 */                   layoutParams2.f470b = 0;
/* 168 */                   layoutParams2.f472d = false;
/* 170 */                   ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 0;
/* 172 */                   ((LinearLayout.LayoutParams) layoutParams2).rightMargin = 0;
/* 192 */                   layoutParams2.f473e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
/* 200 */                   int i18 = layoutParams2.f469a ? 1 : i10;
/* 209 */                   LayoutParams layoutParams3 = (LayoutParams) childAt.getLayoutParams();
/* 215 */                   int i19 = i10;
/* 219 */                   i5 = i12;
/* 225 */                   int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
/* 235 */                   ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
/* 250 */                   boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
/* 251 */                   boolean z6 = z5;
/* 253 */                   if (i18 <= 0 || (z5 && i18 < 2)) {
/* 290 */                       i6 = 0;
                            } else {
/* 268 */                       childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
/* 271 */                       int measuredWidth = childAt.getMeasuredWidth();
/* 275 */                       i6 = measuredWidth / i5;
/* 279 */                       if (measuredWidth % i5 != 0) {
/* 281 */                           i6++;
                                }
/* 283 */                       if (z6 && i6 < 2) {
/* 288 */                           i6 = 2;
                                }
                            }
/* 300 */                   layoutParams3.f472d = !layoutParams3.f469a && z6;
/* 302 */                   layoutParams3.f470b = i6;
/* 312 */                   childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
/* 315 */                   iMax2 = Math.max(iMax2, i6);
/* 321 */                   if (layoutParams2.f472d) {
/* 323 */                       i15++;
                            }
/* 327 */                   if (layoutParams2.f469a) {
/* 329 */                       z3 = true;
                            }
/* 330 */                   i10 = i19 - i6;
/* 336 */                   iMax = Math.max(iMax, childAt.getMeasuredHeight());
/* 341 */                   if (i6 == 1) {
/* 346 */                       j |= (long) (1 << i14);
                            }
                        }
/* 348 */               i14++;
/* 350 */               size3 = i16;
/* 352 */               paddingBottom = i17;
/* 354 */               i12 = i5;
                    }
/* 359 */           int i20 = size3;
/* 361 */           int i21 = i10;
/* 363 */           int i22 = i12;
/* 372 */           boolean z7 = z3 && i13 == 2;
/* 373 */           int i23 = i21;
/* 375 */           boolean z8 = false;
                    while (true) {
/* 378 */               if (i15 <= 0 || i23 <= 0) {
/* 521 */                   i4 = iMax;
                            break;
                        }
/* 382 */               int i24 = AbstractC0208c9.API_PRIORITY_OTHER;
/* 385 */               long j2 = 0;
/* 387 */               int i25 = 0;
/* 388 */               int i26 = 0;
/* 389 */               while (i26 < childCount2) {
/* 399 */                   int i27 = iMax;
/* 403 */                   LayoutParams layoutParams4 = (LayoutParams) getChildAt(i26).getLayoutParams();
/* 405 */                   boolean z9 = z7;
/* 409 */                   if (layoutParams4.f472d) {
/* 412 */                       int i28 = layoutParams4.f470b;
/* 414 */                       if (i28 < i24) {
/* 416 */                           j2 = 1 << i26;
/* 418 */                           i24 = i28;
/* 419 */                           i25 = 1;
                                } else if (i28 == i24) {
/* 425 */                           j2 |= 1 << i26;
/* 427 */                           i25++;
                                }
                            }
/* 430 */                   i26++;
/* 432 */                   z7 = z9;
/* 434 */                   iMax = i27;
                        }
/* 437 */               i4 = iMax;
/* 439 */               boolean z10 = z7;
/* 441 */               j |= j2;
/* 443 */               if (i25 > i23) {
                            break;
                        }
/* 448 */               int i29 = i24 + 1;
/* 450 */               int i30 = 0;
/* 451 */               while (i30 < childCount2) {
/* 453 */                   View childAt2 = getChildAt(i30);
/* 461 */                   LayoutParams layoutParams5 = (LayoutParams) childAt2.getLayoutParams();
/* 467 */                   boolean z11 = z3;
/* 465 */                   long j3 = 1 << i30;
/* 474 */                   if ((j2 & j3) != 0) {
/* 483 */                       if (z10 && layoutParams5.f473e) {
/* 489 */                           r11 = 1;
/* 489 */                           r11 = 1;
/* 490 */                           if (i23 == 1) {
/* 495 */                               childAt2.setPadding(i3 + i22, 0, i3, 0);
                                    }
                                } else {
/* 499 */                           r11 = 1;
                                }
/* 503 */                       layoutParams5.f470b += r11;
/* 505 */                       layoutParams5.f474f = r11;
/* 507 */                       i23--;
                            } else if (layoutParams5.f470b == i29) {
/* 480 */                       j |= j3;
                            }
/* 509 */                   i30++;
/* 511 */                   z3 = z11;
                        }
/* 514 */               z7 = z10;
/* 516 */               iMax = i4;
/* 518 */               z8 = true;
                    }
/* 531 */           boolean z12 = !z3 && i13 == 1;
/* 532 */           if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
/* 545 */               float fBitCount = Long.bitCount(j);
/* 550 */               if (!z12) {
/* 558 */                   if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f473e) {
/* 575 */                       fBitCount -= 0.5f;
                            }
/* 576 */                   int i31 = childCount2 - 1;
/* 587 */                   if ((j & ((long) (1 << i31))) != 0 && !((LayoutParams) getChildAt(i31).getLayoutParams()).f473e) {
/* 603 */                       fBitCount -= 0.5f;
                            }
                        }
/* 615 */               int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
/* 616 */               boolean z13 = z8;
/* 618 */               for (int i33 = 0; i33 < childCount2; i33++) {
/* 629 */                   if ((j & ((long) (1 << i33))) != 0) {
/* 635 */                       View childAt3 = getChildAt(i33);
/* 643 */                       LayoutParams layoutParams6 = (LayoutParams) childAt3.getLayoutParams();
/* 647 */                       if (childAt3 instanceof ActionMenuItemView) {
/* 649 */                           layoutParams6.f471c = i32;
/* 652 */                           layoutParams6.f474f = true;
/* 654 */                           if (i33 == 0 && !layoutParams6.f473e) {
/* 665 */                               ((LinearLayout.LayoutParams) layoutParams6).leftMargin = (-i32) / 2;
                                    }
/* 670 */                           z13 = true;
                                } else if (layoutParams6.f469a) {
/* 679 */                           layoutParams6.f471c = i32;
/* 682 */                           layoutParams6.f474f = true;
/* 687 */                           ((LinearLayout.LayoutParams) layoutParams6).rightMargin = (-i32) / 2;
/* 689 */                           z13 = true;
                                } else {
/* 692 */                           if (i33 != 0) {
/* 696 */                               ((LinearLayout.LayoutParams) layoutParams6).leftMargin = i32 / 2;
                                    }
/* 700 */                           if (i33 != childCount2 - 1) {
/* 704 */                               ((LinearLayout.LayoutParams) layoutParams6).rightMargin = i32 / 2;
                                    }
                                }
                            }
                        }
/* 709 */               z8 = z13;
                    }
/* 710 */           if (z8) {
/* 713 */               for (int i34 = 0; i34 < childCount2; i34++) {
/* 715 */                   View childAt4 = getChildAt(i34);
/* 723 */                   LayoutParams layoutParams7 = (LayoutParams) childAt4.getLayoutParams();
/* 727 */                   if (layoutParams7.f474f) {
/* 745 */                       childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams7.f470b * i22) + layoutParams7.f471c, 1073741824), childMeasureSpec);
                            }
                        }
                    }
/* 760 */           setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
                }

                public void setExpandedActionViewsExclusive(boolean z) {
/* 3 */             this.f461h0.f746c0 = z;
                }

                public void setOnMenuItemClickListener(InterfaceC0976h2 interfaceC0976h2) {
/* 1 */             this.f468o0 = interfaceC0976h2;
                }

                public void setOverflowIcon(Drawable drawable) {
/* 1 */             getMenu();
/* 4 */             C0062b c0062b = this.f461h0;
/* 6 */             C0902f2 c0902f2 = c0062b.f738U;
/* 8 */             if (c0902f2 != null) {
/* 10 */                c0902f2.setImageDrawable(drawable);
                    } else {
/* 15 */                c0062b.f740W = true;
/* 17 */                c0062b.f739V = drawable;
                    }
                }

                public void setOverflowReserved(boolean z) {
/* 1 */             this.f460g0 = z;
                }

                public void setPopupTheme(int i) {
/* 3 */             if (this.f459f0 != i) {
/* 5 */                 this.f459f0 = i;
/* 7 */                 if (i == 0) {
/* 13 */                    this.f458e0 = getContext();
                        } else {
/* 25 */                    this.f458e0 = new ContextThemeWrapper(getContext(), i);
                        }
                    }
                }

                public void setPresenter(C0062b c0062b) {
/* 1 */             this.f461h0 = c0062b;
/* 3 */             c0062b.f9611v = this;
/* 7 */             this.f457d0 = c0062b.f9606c;
                }

                @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
/* 10 */        public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 11 */            return m348k(layoutParams);
                }
            }
