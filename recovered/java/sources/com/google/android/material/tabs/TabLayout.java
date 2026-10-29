            package com.google.android.material.tabs;

            import android.animation.Animator;
            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.GradientDrawable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.FrameLayout;
            import android.widget.HorizontalScrollView;
            import android.widget.LinearLayout;
            import android.widget.TextView;
            import androidx.viewpager.widget.PagerAdapter;
            import androidx.viewpager.widget.ViewPager;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.WeakHashMap;
            import p000.AbstractC0208c9;
            import p000.AbstractC2246u8;
            import p000.C0828d1;
            import p000.C1951n4;
            import p000.C2184sk;
            import p000.b43;
            import p000.cm2;
            import p000.de3;
            import p000.dm2;
            import p000.e33;
            import p000.em2;
            import p000.fd1;
            import p000.gc0;
            import p000.hd1;
            import p000.he3;
            import p000.hm2;
            import p000.im2;
            import p000.jm2;
            import p000.kb1;
            import p000.lm2;
            import p000.mm2;
            import p000.mn0;
            import p000.nt1;
            import p000.ot1;
            import p000.q62;
            import p000.r20;
            import p000.rn2;
            import p000.s23;
            import p000.v00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @b43
/* 3 */     public class TabLayout extends HorizontalScrollView {

                /* JADX INFO: renamed from: F0 */
                public static final int f4951F0 = R$style.Widget_Design_TabLayout;

                /* JADX INFO: renamed from: G0 */
                public static final ot1 f4952G0 = new ot1(16);

                /* JADX INFO: renamed from: A0 */
                public r20 f4953A0;

                /* JADX INFO: renamed from: B0 */
                public jm2 f4954B0;

                /* JADX INFO: renamed from: C0 */
                public cm2 f4955C0;

                /* JADX INFO: renamed from: D0 */
                public boolean f4956D0;

                /* JADX INFO: renamed from: E0 */
                public final nt1 f4957E0;

                /* JADX INFO: renamed from: U */
                public ColorStateList f4958U;

                /* JADX INFO: renamed from: V */
                public ColorStateList f4959V;

                /* JADX INFO: renamed from: W */
                public Drawable f4960W;

                /* JADX INFO: renamed from: a */
                public final ArrayList f4961a;

                /* JADX INFO: renamed from: a0 */
                public int f4962a0;

                /* JADX INFO: renamed from: b */
                public im2 f4963b;

                /* JADX INFO: renamed from: b0 */
                public final PorterDuff.Mode f4964b0;

                /* JADX INFO: renamed from: c */
                public final hm2 f4965c;

                /* JADX INFO: renamed from: c0 */
                public final float f4966c0;

                /* JADX INFO: renamed from: d */
                public final int f4967d;

                /* JADX INFO: renamed from: d0 */
                public final float f4968d0;

                /* JADX INFO: renamed from: e */
                public final int f4969e;

                /* JADX INFO: renamed from: e0 */
                public final int f4970e0;

                /* JADX INFO: renamed from: f */
                public final int f4971f;

                /* JADX INFO: renamed from: f0 */
                public int f4972f0;

                /* JADX INFO: renamed from: g0 */
                public final int f4973g0;

                /* JADX INFO: renamed from: h0 */
                public final int f4974h0;

                /* JADX INFO: renamed from: i */
                public final int f4975i;

                /* JADX INFO: renamed from: i0 */
                public final int f4976i0;

                /* JADX INFO: renamed from: j0 */
                public final int f4977j0;

                /* JADX INFO: renamed from: k0 */
                public int f4978k0;

                /* JADX INFO: renamed from: l0 */
                public final int f4979l0;

                /* JADX INFO: renamed from: m0 */
                public int f4980m0;

                /* JADX INFO: renamed from: n0 */
                public int f4981n0;

                /* JADX INFO: renamed from: o0 */
                public boolean f4982o0;

                /* JADX INFO: renamed from: p0 */
                public boolean f4983p0;

                /* JADX INFO: renamed from: q0 */
                public int f4984q0;

                /* JADX INFO: renamed from: r0 */
                public int f4985r0;

                /* JADX INFO: renamed from: s0 */
                public boolean f4986s0;

                /* JADX INFO: renamed from: t0 */
                public q62 f4987t0;

                /* JADX INFO: renamed from: u0 */
                public dm2 f4988u0;

                /* JADX INFO: renamed from: v */
                public final int f4989v;

                /* JADX INFO: renamed from: v0 */
                public final ArrayList f4990v0;

                /* JADX INFO: renamed from: w */
                public ColorStateList f4991w;

                /* JADX INFO: renamed from: w0 */
                public mm2 f4992w0;

                /* JADX INFO: renamed from: x0 */
                public ValueAnimator f4993x0;

                /* JADX INFO: renamed from: y0 */
                public ViewPager f4994y0;

                /* JADX INFO: renamed from: z0 */
                public PagerAdapter f4995z0;

                /* JADX WARN: Illegal instructions before constructor call */
                public TabLayout(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = f4951F0;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 15 */            this.f4961a = new ArrayList();
/* 22 */            this.f4960W = new GradientDrawable();
/* 25 */            this.f4962a0 = 0;
/* 30 */            this.f4972f0 = AbstractC0208c9.API_PRIORITY_OTHER;
/* 33 */            this.f4984q0 = -1;
/* 40 */            this.f4990v0 = new ArrayList();
/* 49 */            this.f4957E0 = new nt1(12);
/* 51 */            Context context2 = getContext();
/* 55 */            setHorizontalScrollBarEnabled(false);
/* 60 */            hm2 hm2Var = new hm2(this, context2);
/* 63 */            this.f4965c = hm2Var;
/* 71 */            super.addView(hm2Var, 0, new FrameLayout.LayoutParams(-2, -1));
/* 84 */            TypedArray typedArrayM8213d = rn2.m8213d(context2, attributeSet, R$styleable.TabLayout, i, i2, R$styleable.TabLayout_tabTextAppearance);
/* 94 */            if (getBackground() instanceof ColorDrawable) {
/* 100 */               ColorDrawable colorDrawable = (ColorDrawable) getBackground();
/* 104 */               fd1 fd1Var = new fd1();
/* 115 */               fd1Var.m3742n(ColorStateList.valueOf(colorDrawable.getColor()));
/* 118 */               fd1Var.m3739k(context2);
/* 121 */               WeakHashMap weakHashMap = e33.f7494a;
/* 127 */               fd1Var.m3741m(s23.m8371i(this));
/* 130 */               setBackground(fd1Var);
                    }
/* 139 */           setSelectedTabIndicator(de3.m3035q(context2, typedArrayM8213d, R$styleable.TabLayout_tabIndicator));
/* 148 */           setSelectedTabIndicatorColor(typedArrayM8213d.getColor(R$styleable.TabLayout_tabIndicatorColor, 0));
/* 157 */           hm2Var.m4243b(typedArrayM8213d.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, -1));
/* 166 */           setSelectedTabIndicatorGravity(typedArrayM8213d.getInt(R$styleable.TabLayout_tabIndicatorGravity, 0));
/* 175 */           setTabIndicatorAnimationMode(typedArrayM8213d.getInt(R$styleable.TabLayout_tabIndicatorAnimationMode, 0));
/* 185 */           setTabIndicatorFullWidth(typedArrayM8213d.getBoolean(R$styleable.TabLayout_tabIndicatorFullWidth, true));
/* 190 */           int dimensionPixelSize = typedArrayM8213d.getDimensionPixelSize(R$styleable.TabLayout_tabPadding, 0);
/* 194 */           this.f4975i = dimensionPixelSize;
/* 196 */           this.f4971f = dimensionPixelSize;
/* 198 */           this.f4969e = dimensionPixelSize;
/* 200 */           this.f4967d = dimensionPixelSize;
/* 208 */           this.f4967d = typedArrayM8213d.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingStart, dimensionPixelSize);
/* 216 */           this.f4969e = typedArrayM8213d.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingTop, dimensionPixelSize);
/* 224 */           this.f4971f = typedArrayM8213d.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingEnd, dimensionPixelSize);
/* 232 */           this.f4975i = typedArrayM8213d.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingBottom, dimensionPixelSize);
/* 238 */           int resourceId = typedArrayM8213d.getResourceId(R$styleable.TabLayout_tabTextAppearance, R$style.TextAppearance_Design_Tab);
/* 242 */           this.f4989v = resourceId;
/* 246 */           TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, androidx.appcompat.R$styleable.TextAppearance);
                    try {
/* 257 */               this.f4966c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R$styleable.TextAppearance_android_textSize, 0);
/* 265 */               this.f4991w = de3.m3033o(context2, typedArrayObtainStyledAttributes, androidx.appcompat.R$styleable.TextAppearance_android_textColor);
/* 267 */               typedArrayObtainStyledAttributes.recycle();
/* 276 */               if (typedArrayM8213d.hasValue(R$styleable.TabLayout_tabTextColor)) {
/* 284 */                   this.f4991w = de3.m3033o(context2, typedArrayM8213d, R$styleable.TabLayout_tabTextColor);
                        }
/* 292 */               if (typedArrayM8213d.hasValue(R$styleable.TabLayout_tabSelectedTextColor)) {
/* 323 */                   this.f4991w = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayM8213d.getColor(R$styleable.TabLayout_tabSelectedTextColor, 0), this.f4991w.getDefaultColor()});
                        }
/* 331 */               this.f4958U = de3.m3033o(context2, typedArrayM8213d, R$styleable.TabLayout_tabIconTint);
/* 344 */               this.f4964b0 = kb1.m6039O(typedArrayM8213d.getInt(R$styleable.TabLayout_tabIconTintMode, -1), null);
/* 352 */               this.f4959V = de3.m3033o(context2, typedArrayM8213d, R$styleable.TabLayout_tabRippleColor);
/* 362 */               this.f4979l0 = typedArrayM8213d.getInt(R$styleable.TabLayout_tabIndicatorAnimationDuration, 300);
/* 370 */               this.f4973g0 = typedArrayM8213d.getDimensionPixelSize(R$styleable.TabLayout_tabMinWidth, -1);
/* 378 */               this.f4974h0 = typedArrayM8213d.getDimensionPixelSize(R$styleable.TabLayout_tabMaxWidth, -1);
/* 386 */               this.f4970e0 = typedArrayM8213d.getResourceId(R$styleable.TabLayout_tabBackground, 0);
/* 394 */               this.f4977j0 = typedArrayM8213d.getDimensionPixelSize(R$styleable.TabLayout_tabContentStart, 0);
/* 402 */               this.f4981n0 = typedArrayM8213d.getInt(R$styleable.TabLayout_tabMode, 1);
/* 410 */               this.f4978k0 = typedArrayM8213d.getInt(R$styleable.TabLayout_tabGravity, 0);
/* 418 */               this.f4982o0 = typedArrayM8213d.getBoolean(R$styleable.TabLayout_tabInlineLabel, false);
/* 426 */               this.f4986s0 = typedArrayM8213d.getBoolean(R$styleable.TabLayout_tabUnboundedRipple, false);
/* 428 */               typedArrayM8213d.recycle();
/* 431 */               Resources resources = getResources();
/* 442 */               this.f4968d0 = resources.getDimensionPixelSize(R$dimen.design_tab_text_size_2line);
/* 450 */               this.f4976i0 = resources.getDimensionPixelSize(R$dimen.design_tab_scrollable_min_width);
/* 452 */               m2383d();
                    } catch (Throwable th) {
/* 458 */               typedArrayObtainStyledAttributes.recycle();
/* 461 */               throw th;
                    }
                }

                private int getDefaultHeight() {
/* 1 */             ArrayList arrayList = this.f4961a;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i = 0; i < size; i++) {
/* 14 */                im2 im2Var = (im2) arrayList.get(i);
/* 16 */                if (im2Var != null && im2Var.f9718a != null && !TextUtils.isEmpty(im2Var.f9719b)) {
                            return !this.f4982o0 ? 72 : 48;
                        }
                    }
/* 40 */            return 48;
                }

                private int getTabMinWidth() {
/* 2 */             int i = this.f4973g0;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 7 */             int i2 = this.f4981n0;
/* 9 */             if (i2 == 0 || i2 == 2) {
/* 17 */                return this.f4976i0;
                    }
/* 15 */            return 0;
                }

                private int getTabScrollRange() {
/* 23 */            return Math.max(0, ((this.f4965c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
                }

                private void setSelectedTabView(int i) {
/* 1 */             hm2 hm2Var = this.f4965c;
/* 3 */             int childCount = hm2Var.getChildCount();
/* 7 */             if (i < childCount) {
/* 10 */                int i2 = 0;
/* 11 */                while (i2 < childCount) {
/* 13 */                    View childAt = hm2Var.getChildAt(i2);
/* 17 */                    boolean z = true;
/* 23 */                    childAt.setSelected(i2 == i);
/* 26 */                    if (i2 != i) {
/* 29 */                        z = false;
                            }
/* 30 */                    childAt.setActivated(z);
/* 33 */                    i2++;
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m2380a(im2 im2Var, boolean z) {
/* 1 */             ArrayList arrayList = this.f4961a;
/* 3 */             int size = arrayList.size();
/* 9 */             if (im2Var.f9723f != this) {
/* 96 */                C1951n4.m6859j("Tab belongs to a different TabLayout.");
/* 99 */                return;
                    }
/* 11 */            im2Var.f9721d = size;
/* 13 */            arrayList.add(size, im2Var);
/* 16 */            int size2 = arrayList.size();
/* 22 */            for (int i = size + 1; i < size2; i++) {
/* 30 */                ((im2) arrayList.get(i)).f9721d = i;
                    }
/* 35 */            lm2 lm2Var = im2Var.f9724g;
/* 38 */            lm2Var.setSelected(false);
/* 41 */            lm2Var.setActivated(false);
/* 44 */            int i2 = im2Var.f9721d;
/* 50 */            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
/* 55 */            if (this.f4981n0 == 1 && this.f4978k0 == 0) {
/* 61 */                layoutParams.width = 0;
/* 65 */                layoutParams.weight = 1.0f;
                    } else {
/* 68 */                layoutParams.width = -2;
/* 71 */                layoutParams.weight = 0.0f;
                    }
/* 75 */            this.f4965c.addView(lm2Var, i2, layoutParams);
/* 78 */            if (z) {
/* 80 */                TabLayout tabLayout = im2Var.f9723f;
/* 82 */                if (tabLayout != null) {
/* 84 */                    tabLayout.m2389j(im2Var, true);
                        } else {
/* 90 */                    C1951n4.m6859j("Tab not attached to a TabLayout");
                        }
                    }
                }

                @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
                public final void addView(View view) {
/* 1 */             m2381b(view);
                }

                /* JADX INFO: renamed from: b */
                public final void m2381b(View view) {
/* 3 */             if (!(view instanceof TabItem)) {
/* 120 */               C1951n4.m6859j("Only TabItem instances can be added to TabLayout");
/* 123 */               return;
                    }
/* 5 */             TabItem tabItem = (TabItem) view;
/* 7 */             im2 im2VarM2387h = m2387h();
/* 11 */            CharSequence charSequence = tabItem.f4948a;
/* 13 */            if (charSequence != null) {
/* 21 */                if (TextUtils.isEmpty(im2VarM2387h.f9720c) && !TextUtils.isEmpty(charSequence)) {
/* 31 */                    im2VarM2387h.f9724g.setContentDescription(charSequence);
                        }
/* 34 */                im2VarM2387h.f9719b = charSequence;
/* 36 */                im2VarM2387h.m4582a();
                    }
/* 39 */            Drawable drawable = tabItem.f4949b;
/* 41 */            if (drawable != null) {
/* 43 */                im2VarM2387h.f9718a = drawable;
/* 45 */                TabLayout tabLayout = im2VarM2387h.f9723f;
/* 50 */                if (tabLayout.f4978k0 == 1 || tabLayout.f4981n0 == 2) {
/* 57 */                    tabLayout.m2393n(true);
                        }
/* 60 */                im2VarM2387h.m4582a();
                    }
/* 63 */            int i = tabItem.f4950c;
/* 65 */            if (i != 0) {
/* 84 */                im2VarM2387h.f9722e = LayoutInflater.from(im2VarM2387h.f9724g.getContext()).inflate(i, (ViewGroup) im2VarM2387h.f9724g, false);
/* 86 */                im2VarM2387h.m4582a();
                    }
/* 97 */            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
/* 103 */               im2VarM2387h.f9720c = tabItem.getContentDescription();
/* 105 */               im2VarM2387h.m4582a();
                    }
/* 114 */           m2380a(im2VarM2387h, this.f4961a.isEmpty());
                }

                /* JADX INFO: renamed from: c */
                public final void m2382c(int i) {
/* 2 */             if (i == -1) {
/* 4 */                 return;
                    }
/* 11 */            if (getWindowToken() != null) {
/* 13 */                WeakHashMap weakHashMap = e33.f7494a;
/* 19 */                if (isLaidOut()) {
/* 21 */                    hm2 hm2Var = this.f4965c;
/* 23 */                    int childCount = hm2Var.getChildCount();
/* 28 */                    for (int i2 = 0; i2 < childCount; i2++) {
/* 38 */                        if (hm2Var.getChildAt(i2).getWidth() > 0) {
                                }
                            }
/* 44 */                    int scrollX = getScrollX();
/* 48 */                    int iM2384e = m2384e(0.0f, i);
/* 52 */                    if (scrollX != iM2384e) {
/* 54 */                        m2385f();
/* 63 */                        this.f4993x0.setIntValues(scrollX, iM2384e);
/* 68 */                        this.f4993x0.start();
                            }
/* 71 */                    ValueAnimator valueAnimator = hm2Var.f9143a;
/* 73 */                    if (valueAnimator != null && valueAnimator.isRunning()) {
/* 83 */                        hm2Var.f9143a.cancel();
                            }
/* 88 */                    hm2Var.m4245d(i, this.f4979l0, true);
/* 91 */                    return;
                        }
                    }
/* 92 */            m2391l(i, 0.0f, true, true);
                }

                /* JADX INFO: renamed from: d */
                public final void m2383d() {
/* 1 */             int i = this.f4981n0;
/* 17 */            int iMax = (i == 0 || i == 2) ? Math.max(0, this.f4977j0 - this.f4967d) : 0;
/* 21 */            WeakHashMap weakHashMap = e33.f7494a;
/* 23 */            hm2 hm2Var = this.f4965c;
/* 25 */            hm2Var.setPaddingRelative(iMax, 0, 0, 0);
/* 28 */            int i2 = this.f4981n0;
/* 33 */            if (i2 == 0) {
/* 53 */                int i3 = this.f4978k0;
/* 55 */                if (i3 == 0) {
/* 68 */                    AbstractC1245n0.m4889q("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                        } else if (i3 == 1) {
/* 62 */                    hm2Var.setGravity(1);
                        } else if (i3 == 2) {
                        }
/* 74 */                hm2Var.setGravity(8388611);
                    } else if (i2 == 1 || i2 == 2) {
/* 42 */                if (this.f4978k0 == 2) {
/* 46 */                    AbstractC1245n0.m4889q("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                        }
/* 49 */                hm2Var.setGravity(1);
                    }
/* 77 */            m2393n(true);
                }

                /* JADX INFO: renamed from: e */
                public final int m2384e(float f, int i) {
                    hm2 hm2Var;
                    View childAt;
/* 1 */             int i2 = this.f4981n0;
/* 5 */             if ((i2 != 0 && i2 != 2) || (childAt = (hm2Var = this.f4965c).getChildAt(i)) == null) {
/* 3 */                 return 0;
                    }
/* 20 */            int i3 = i + 1;
/* 33 */            View childAt2 = i3 < hm2Var.getChildCount() ? hm2Var.getChildAt(i3) : null;
/* 34 */            int width = childAt.getWidth();
/* 40 */            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
/* 56 */            int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
/* 63 */            int i4 = (int) ((width + width2) * 0.5f * f);
/* 64 */            WeakHashMap weakHashMap = e33.f7494a;
                    return getLayoutDirection() == 0 ? left + i4 : left - i4;
                }

                /* JADX INFO: renamed from: f */
                public final void m2385f() {
/* 3 */             if (this.f4993x0 == null) {
/* 7 */                 ValueAnimator valueAnimator = new ValueAnimator();
/* 10 */                this.f4993x0 = valueAnimator;
/* 14 */                valueAnimator.setInterpolator(AbstractC2246u8.f17411b);
/* 22 */                this.f4993x0.setDuration(this.f4979l0);
/* 33 */                this.f4993x0.addUpdateListener(new C2184sk(this, 5));
                    }
                }

                /* JADX INFO: renamed from: g */
                public final im2 m2386g(int i) {
/* 1 */             if (i < 0 || i >= getTabCount()) {
/* 19 */                return null;
                    }
/* 16 */            return (im2) this.f4961a.get(i);
                }

                @Override // android.widget.FrameLayout, android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 1 */             return generateDefaultLayoutParams();
                }

                public int getSelectedTabPosition() {
/* 1 */             im2 im2Var = this.f4963b;
/* 3 */             if (im2Var != null) {
/* 5 */                 return im2Var.f9721d;
                    }
/* 8 */             return -1;
                }

                public int getTabCount() {
/* 3 */             return this.f4961a.size();
                }

                public int getTabGravity() {
/* 1 */             return this.f4978k0;
                }

                public ColorStateList getTabIconTint() {
/* 1 */             return this.f4958U;
                }

                public int getTabIndicatorAnimationMode() {
/* 1 */             return this.f4985r0;
                }

                public int getTabIndicatorGravity() {
/* 1 */             return this.f4980m0;
                }

                public int getTabMaxWidth() {
/* 1 */             return this.f4972f0;
                }

                public int getTabMode() {
/* 1 */             return this.f4981n0;
                }

                public ColorStateList getTabRippleColor() {
/* 1 */             return this.f4959V;
                }

                public Drawable getTabSelectedIndicator() {
/* 1 */             return this.f4960W;
                }

                public ColorStateList getTabTextColors() {
/* 1 */             return this.f4991w;
                }

                /* JADX INFO: renamed from: h */
                public final im2 m2387h() {
/* 7 */             im2 im2Var = (im2) f4952G0.mo7042a();
/* 9 */             if (im2Var == null) {
/* 13 */                im2Var = new im2();
/* 17 */                im2Var.f9721d = -1;
                    }
/* 19 */            im2Var.f9723f = this;
/* 21 */            nt1 nt1Var = this.f4957E0;
/* 32 */            lm2 lm2Var = nt1Var != null ? (lm2) nt1Var.mo7042a() : null;
/* 33 */            if (lm2Var == null) {
/* 41 */                lm2Var = new lm2(this, getContext());
                    }
/* 44 */            lm2Var.setTab(im2Var);
/* 48 */            lm2Var.setFocusable(true);
/* 55 */            lm2Var.setMinimumWidth(getTabMinWidth());
/* 64 */            if (TextUtils.isEmpty(im2Var.f9720c)) {
/* 68 */                lm2Var.setContentDescription(im2Var.f9719b);
                    } else {
/* 74 */                lm2Var.setContentDescription(im2Var.f9720c);
                    }
/* 77 */            im2Var.f9724g = lm2Var;
/* 79 */            return im2Var;
                }

                /* JADX INFO: renamed from: i */
                public final void m2388i() {
                    int currentItem;
/* 1 */             hm2 hm2Var = this.f4965c;
/* 11 */            for (int childCount = hm2Var.getChildCount() - 1; childCount >= 0; childCount--) {
/* 17 */                lm2 lm2Var = (lm2) hm2Var.getChildAt(childCount);
/* 19 */                hm2Var.removeViewAt(childCount);
/* 22 */                if (lm2Var != null) {
/* 24 */                    lm2Var.setTab(null);
/* 27 */                    lm2Var.setSelected(false);
/* 32 */                    this.f4957E0.mo7044c(lm2Var);
                        }
/* 35 */                requestLayout();
                    }
/* 43 */            Iterator it = this.f4961a.iterator();
/* 51 */            while (it.hasNext()) {
/* 57 */                im2 im2Var = (im2) it.next();
/* 59 */                it.remove();
/* 62 */                im2Var.f9723f = null;
/* 64 */                im2Var.f9724g = null;
/* 66 */                im2Var.f9718a = null;
/* 68 */                im2Var.f9719b = null;
/* 70 */                im2Var.f9720c = null;
/* 73 */                im2Var.f9721d = -1;
/* 75 */                im2Var.f9722e = null;
/* 79 */                f4952G0.mo7044c(im2Var);
                    }
/* 83 */            this.f4963b = null;
/* 85 */            PagerAdapter pagerAdapter = this.f4995z0;
/* 87 */            if (pagerAdapter != null) {
/* 89 */                int count = pagerAdapter.getCount();
/* 94 */                for (int i = 0; i < count; i++) {
/* 96 */                    im2 im2VarM2387h = m2387h();
/* 102 */                   CharSequence pageTitle = this.f4995z0.getPageTitle(i);
/* 112 */                   if (TextUtils.isEmpty(im2VarM2387h.f9720c) && !TextUtils.isEmpty(pageTitle)) {
/* 122 */                       im2VarM2387h.f9724g.setContentDescription(pageTitle);
                            }
/* 125 */                   im2VarM2387h.f9719b = pageTitle;
/* 127 */                   im2VarM2387h.m4582a();
/* 130 */                   m2380a(im2VarM2387h, false);
                        }
/* 136 */               ViewPager viewPager = this.f4994y0;
/* 138 */               if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
/* 165 */                   return;
                        }
/* 162 */               m2389j(m2386g(currentItem), true);
                    }
                }

                /* JADX INFO: renamed from: j */
                public final void m2389j(im2 im2Var, boolean z) {
/* 1 */             im2 im2Var2 = this.f4963b;
/* 3 */             ArrayList arrayList = this.f4990v0;
/* 6 */             if (im2Var2 == im2Var) {
/* 8 */                 if (im2Var2 != null) {
/* 15 */                    for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 23 */                        ((dm2) arrayList.get(size)).getClass();
                            }
/* 31 */                    m2382c(im2Var.f9721d);
/* 34 */                    return;
                        }
/* 109 */               return;
                    }
/* 41 */            int i = im2Var != null ? im2Var.f9721d : -1;
/* 42 */            if (z) {
/* 44 */                if ((im2Var2 == null || im2Var2.f9721d == -1) && i != -1) {
/* 53 */                    m2391l(i, 0.0f, true, true);
                        } else {
/* 57 */                    m2382c(i);
                        }
/* 60 */                if (i != -1) {
/* 62 */                    setSelectedTabView(i);
                        }
                    }
/* 65 */            this.f4963b = im2Var;
/* 67 */            if (im2Var2 != null) {
/* 74 */                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
/* 82 */                    ((dm2) arrayList.get(size2)).mo3155a(im2Var2);
                        }
                    }
/* 88 */            if (im2Var != null) {
/* 95 */                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
/* 103 */                   ((dm2) arrayList.get(size3)).mo3156b(im2Var);
                        }
                    }
                }

                /* JADX INFO: renamed from: k */
                public final void m2390k(PagerAdapter pagerAdapter, boolean z) {
                    r20 r20Var;
/* 1 */             PagerAdapter pagerAdapter2 = this.f4995z0;
/* 3 */             if (pagerAdapter2 != null && (r20Var = this.f4953A0) != null) {
/* 9 */                 pagerAdapter2.unregisterDataSetObserver(r20Var);
                    }
/* 12 */            this.f4995z0 = pagerAdapter;
/* 14 */            if (z && pagerAdapter != null) {
/* 20 */                if (this.f4953A0 == null) {
/* 28 */                    this.f4953A0 = new r20(this, 2);
                        }
/* 32 */                pagerAdapter.registerDataSetObserver(this.f4953A0);
                    }
/* 35 */            m2388i();
                }

                /* JADX INFO: renamed from: l */
                public final void m2391l(int i, float f, boolean z, boolean z2) {
/* 3 */             int iRound = Math.round(i + f);
/* 7 */             if (iRound >= 0) {
/* 9 */                 hm2 hm2Var = this.f4965c;
/* 15 */                if (iRound >= hm2Var.getChildCount()) {
/* 88 */                    return;
                        }
/* 18 */                if (z2) {
/* 20 */                    ValueAnimator valueAnimator = hm2Var.f9143a;
/* 22 */                    if (valueAnimator != null && valueAnimator.isRunning()) {
/* 32 */                        hm2Var.f9143a.cancel();
                            }
/* 35 */                    hm2Var.f9144b = i;
/* 37 */                    hm2Var.f9145c = f;
/* 53 */                    hm2Var.m4244c(hm2Var.getChildAt(i), hm2Var.getChildAt(hm2Var.f9144b + 1), hm2Var.f9145c);
                        }
/* 56 */                ValueAnimator valueAnimator2 = this.f4993x0;
/* 58 */                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
/* 68 */                    this.f4993x0.cancel();
                        }
/* 80 */                scrollTo(i < 0 ? 0 : m2384e(f, i), 0);
/* 83 */                if (z) {
/* 85 */                    setSelectedTabView(iRound);
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m2392m(ViewPager viewPager, boolean z) {
                    ArrayList arrayList;
                    ArrayList arrayList2;
/* 1 */             ViewPager viewPager2 = this.f4994y0;
/* 3 */             if (viewPager2 != null) {
/* 5 */                 jm2 jm2Var = this.f4954B0;
/* 7 */                 if (jm2Var != null && (arrayList2 = viewPager2.f1956F0) != null) {
/* 13 */                    arrayList2.remove(jm2Var);
                        }
/* 16 */                cm2 cm2Var = this.f4955C0;
/* 18 */                if (cm2Var != null && (arrayList = this.f4994y0.f1959I0) != null) {
/* 26 */                    arrayList.remove(cm2Var);
                        }
                    }
/* 29 */            mm2 mm2Var = this.f4992w0;
/* 31 */            ArrayList arrayList3 = this.f4990v0;
/* 34 */            if (mm2Var != null) {
/* 36 */                arrayList3.remove(mm2Var);
/* 39 */                this.f4992w0 = null;
                    }
/* 42 */            if (viewPager != null) {
/* 44 */                this.f4994y0 = viewPager;
/* 48 */                if (this.f4954B0 == null) {
/* 55 */                    this.f4954B0 = new jm2(this);
                        }
/* 57 */                jm2 jm2Var2 = this.f4954B0;
/* 59 */                jm2Var2.f12383c = 0;
/* 61 */                jm2Var2.f12382b = 0;
/* 65 */                if (viewPager.f1956F0 == null) {
/* 72 */                    viewPager.f1956F0 = new ArrayList();
                        }
/* 76 */                viewPager.f1956F0.add(jm2Var2);
/* 81 */                mm2 mm2Var2 = new mm2(viewPager);
/* 84 */                this.f4992w0 = mm2Var2;
/* 90 */                if (!arrayList3.contains(mm2Var2)) {
/* 92 */                    arrayList3.add(mm2Var2);
                        }
/* 95 */                PagerAdapter adapter = viewPager.getAdapter();
/* 100 */               if (adapter != null) {
/* 102 */                   m2390k(adapter, true);
                        }
/* 107 */               if (this.f4955C0 == null) {
/* 114 */                   this.f4955C0 = new cm2(this);
                        }
/* 116 */               cm2 cm2Var2 = this.f4955C0;
/* 118 */               cm2Var2.f3002a = true;
/* 122 */               if (viewPager.f1959I0 == null) {
/* 129 */                   viewPager.f1959I0 = new ArrayList();
                        }
/* 133 */               viewPager.f1959I0.add(cm2Var2);
/* 141 */               m2391l(viewPager.getCurrentItem(), 0.0f, true, true);
                    } else {
/* 145 */               this.f4994y0 = null;
/* 147 */               m2390k(null, false);
                    }
/* 150 */           this.f4956D0 = z;
                }

                /* JADX INFO: renamed from: n */
                public final void m2393n(boolean z) {
/* 2 */             int i = 0;
                    while (true) {
/* 3 */                 hm2 hm2Var = this.f4965c;
/* 9 */                 if (i >= hm2Var.getChildCount()) {
/* 58 */                    return;
                        }
/* 11 */                View childAt = hm2Var.getChildAt(i);
/* 19 */                childAt.setMinimumWidth(getTabMinWidth());
/* 26 */                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
/* 31 */                if (this.f4981n0 == 1 && this.f4978k0 == 0) {
/* 37 */                    layoutParams.width = 0;
/* 41 */                    layoutParams.weight = 1.0f;
                        } else {
/* 45 */                    layoutParams.width = -2;
/* 48 */                    layoutParams.weight = 0.0f;
                        }
/* 50 */                if (z) {
/* 52 */                    childAt.requestLayout();
                        }
/* 55 */                i++;
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             he3.m4196s(this);
/* 9 */             if (this.f4994y0 == null) {
/* 11 */                ViewParent parent = getParent();
/* 17 */                if (parent instanceof ViewPager) {
/* 22 */                    m2392m((ViewPager) parent, true);
                        }
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 6 */             if (this.f4956D0) {
/* 9 */                 setupWithViewPager(null);
/* 13 */                this.f4956D0 = false;
                    }
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
                    lm2 lm2Var;
                    Drawable drawable;
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 hm2 hm2Var = this.f4965c;
/* 8 */                 if (i >= hm2Var.getChildCount()) {
/* 51 */                    super.onDraw(canvas);
/* 54 */                    return;
                        }
/* 10 */                View childAt = hm2Var.getChildAt(i);
/* 16 */                if ((childAt instanceof lm2) && (drawable = (lm2Var = (lm2) childAt).f13410w) != null) {
/* 40 */                    drawable.setBounds(lm2Var.getLeft(), lm2Var.getTop(), lm2Var.getRight(), lm2Var.getBottom());
/* 45 */                    lm2Var.f13410w.draw(canvas);
                        }
/* 48 */                i++;
                    }
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 17 */            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0828d1.m2904b(1, getTabCount(), 1).f6954a);
                }

                @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
                }

                /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
                @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 13 */            int iRound = Math.round(kb1.m6028A(getContext(), getDefaultHeight()));
/* 17 */            int mode = View.MeasureSpec.getMode(i2);
/* 27 */            if (mode != Integer.MIN_VALUE) {
/* 29 */                if (mode == 0) {
/* 42 */                    i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
                        }
                    } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
/* 63 */                getChildAt(0).setMinimumHeight(iRound);
                    }
/* 66 */            int size = View.MeasureSpec.getSize(i);
/* 74 */            if (View.MeasureSpec.getMode(i) != 0) {
/* 76 */                int iM6028A = this.f4974h0;
/* 78 */                if (iM6028A <= 0) {
/* 93 */                    iM6028A = (int) (size - kb1.m6028A(getContext(), 56));
                        }
/* 94 */                this.f4972f0 = iM6028A;
                    }
/* 96 */            super.onMeasure(i, i2);
/* 103 */           if (getChildCount() == 1) {
/* 105 */               View childAt = getChildAt(0);
/* 109 */               int i3 = this.f4981n0;
/* 111 */               if (i3 == 0) {
/* 139 */                   if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
/* 171 */                       return;
                            }
                        } else if (i3 != 1) {
/* 116 */                   if (i3 != 2) {
/* 171 */                       return;
                            }
/* 139 */                   if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
/* 171 */                       return;
                            }
                        } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
/* 130 */                   return;
                        }
/* 168 */               childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                    }
                }

                @Override // android.widget.HorizontalScrollView, android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 7 */             if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
/* 25 */                return super.onTouchEvent(motionEvent);
                    }
/* 23 */            return false;
                }

                @Override // android.view.View
                public void setElevation(float f) {
/* 1 */             super.setElevation(f);
/* 4 */             he3.m4190m(this, f);
                }

                public void setInlineLabel(boolean z) {
/* 3 */             if (this.f4982o0 == z) {
/* 63 */                return;
                    }
/* 5 */             this.f4982o0 = z;
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 hm2 hm2Var = this.f4965c;
/* 14 */                if (i >= hm2Var.getChildCount()) {
/* 60 */                    m2383d();
/* 63 */                    return;
                        }
/* 16 */                View childAt = hm2Var.getChildAt(i);
/* 22 */                if (childAt instanceof lm2) {
/* 24 */                    lm2 lm2Var = (lm2) childAt;
/* 32 */                    lm2Var.setOrientation(!lm2Var.f13401V.f4982o0 ? 1 : 0);
/* 35 */                    TextView textView = lm2Var.f13408i;
/* 37 */                    if (textView == null && lm2Var.f13409v == null) {
/* 48 */                        lm2Var.m6500f(lm2Var.f13403b, lm2Var.f13404c);
                            } else {
/* 54 */                        lm2Var.m6500f(textView, lm2Var.f13409v);
                            }
                        }
/* 57 */                i++;
                    }
                }

                public void setInlineLabelResource(int i) {
/* 9 */             setInlineLabel(getResources().getBoolean(i));
                }

                @Deprecated
                public void setOnTabSelectedListener(dm2 dm2Var) {
/* 1 */             dm2 dm2Var2 = this.f4988u0;
/* 3 */             ArrayList arrayList = this.f4990v0;
/* 5 */             if (dm2Var2 != null) {
/* 7 */                 arrayList.remove(dm2Var2);
                    }
/* 10 */            this.f4988u0 = dm2Var;
/* 12 */            if (dm2Var == null || arrayList.contains(dm2Var)) {
/* 23 */                return;
                    }
/* 20 */            arrayList.add(dm2Var);
                }

                public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
/* 1 */             m2385f();
/* 6 */             this.f4993x0.addListener(animatorListener);
                }

                public void setSelectedTabIndicator(Drawable drawable) {
/* 3 */             if (this.f4960W != drawable) {
/* 5 */                 if (drawable == null) {
/* 10 */                    drawable = new GradientDrawable();
                        }
/* 13 */                this.f4960W = drawable;
/* 15 */                int intrinsicHeight = this.f4984q0;
/* 18 */                if (intrinsicHeight == -1) {
/* 21 */                    intrinsicHeight = drawable.getIntrinsicHeight();
                        }
/* 27 */                this.f4965c.m4243b(intrinsicHeight);
                    }
                }

                public void setSelectedTabIndicatorColor(int i) {
/* 1 */             this.f4962a0 = i;
/* 4 */             m2393n(false);
                }

                public void setSelectedTabIndicatorGravity(int i) {
/* 3 */             if (this.f4980m0 != i) {
/* 5 */                 this.f4980m0 = i;
/* 7 */                 WeakHashMap weakHashMap = e33.f7494a;
/* 11 */                this.f4965c.postInvalidateOnAnimation();
                    }
                }

                @Deprecated
                public void setSelectedTabIndicatorHeight(int i) {
/* 1 */             this.f4984q0 = i;
/* 5 */             this.f4965c.m4243b(i);
                }

                public void setTabGravity(int i) {
/* 3 */             if (this.f4978k0 != i) {
/* 5 */                 this.f4978k0 = i;
/* 7 */                 m2383d();
                    }
                }

                public void setTabIconTint(ColorStateList colorStateList) {
/* 3 */             if (this.f4958U != colorStateList) {
/* 5 */                 this.f4958U = colorStateList;
/* 7 */                 ArrayList arrayList = this.f4961a;
/* 9 */                 int size = arrayList.size();
/* 14 */                for (int i = 0; i < size; i++) {
/* 22 */                    ((im2) arrayList.get(i)).m4582a();
                        }
                    }
                }

                public void setTabIconTintResource(int i) {
/* 9 */             setTabIconTint(v00.getColorStateList(getContext(), i));
                }

                public void setTabIndicatorAnimationMode(int i) {
/* 1 */             this.f4985r0 = i;
/* 3 */             if (i == 0) {
/* 57 */                this.f4987t0 = new q62(4);
/* 59 */                return;
                    }
/* 5 */             int i2 = 1;
/* 6 */             if (i == 1) {
/* 48 */                this.f4987t0 = new gc0(0);
                    } else {
/* 9 */                 if (i == 2) {
/* 16 */                    this.f4987t0 = new gc0(i2);
/* 18 */                    return;
                        }
/* 41 */                throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
                    }
                }

                public void setTabIndicatorFullWidth(boolean z) {
/* 1 */             this.f4983p0 = z;
/* 3 */             int i = hm2.f9142e;
/* 5 */             hm2 hm2Var = this.f4965c;
/* 7 */             hm2Var.m4242a();
/* 10 */            WeakHashMap weakHashMap = e33.f7494a;
/* 12 */            hm2Var.postInvalidateOnAnimation();
                }

                public void setTabMode(int i) {
/* 3 */             if (i != this.f4981n0) {
/* 5 */                 this.f4981n0 = i;
/* 7 */                 m2383d();
                    }
                }

                public void setTabRippleColor(ColorStateList colorStateList) {
/* 3 */             if (this.f4959V == colorStateList) {
/* 38 */                return;
                    }
/* 5 */             this.f4959V = colorStateList;
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 hm2 hm2Var = this.f4965c;
/* 14 */                if (i >= hm2Var.getChildCount()) {
/* 38 */                    return;
                        }
/* 16 */                View childAt = hm2Var.getChildAt(i);
/* 22 */                if (childAt instanceof lm2) {
/* 26 */                    Context context = getContext();
/* 30 */                    int i2 = lm2.f13399W;
/* 32 */                    ((lm2) childAt).m6499e(context);
                        }
/* 35 */                i++;
                    }
                }

                public void setTabRippleColorResource(int i) {
/* 9 */             setTabRippleColor(v00.getColorStateList(getContext(), i));
                }

                public void setTabTextColors(ColorStateList colorStateList) {
/* 3 */             if (this.f4991w != colorStateList) {
/* 5 */                 this.f4991w = colorStateList;
/* 7 */                 ArrayList arrayList = this.f4961a;
/* 9 */                 int size = arrayList.size();
/* 14 */                for (int i = 0; i < size; i++) {
/* 22 */                    ((im2) arrayList.get(i)).m4582a();
                        }
                    }
                }

                @Deprecated
                public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
/* 2 */             m2390k(pagerAdapter, false);
                }

                public void setUnboundedRipple(boolean z) {
/* 3 */             if (this.f4986s0 == z) {
/* 38 */                return;
                    }
/* 5 */             this.f4986s0 = z;
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 hm2 hm2Var = this.f4965c;
/* 14 */                if (i >= hm2Var.getChildCount()) {
/* 38 */                    return;
                        }
/* 16 */                View childAt = hm2Var.getChildAt(i);
/* 22 */                if (childAt instanceof lm2) {
/* 26 */                    Context context = getContext();
/* 30 */                    int i2 = lm2.f13399W;
/* 32 */                    ((lm2) childAt).m6499e(context);
                        }
/* 35 */                i++;
                    }
                }

                public void setUnboundedRippleResource(int i) {
/* 9 */             setUnboundedRipple(getResources().getBoolean(i));
                }

                public void setupWithViewPager(ViewPager viewPager) {
/* 2 */             m2392m(viewPager, false);
                }

                @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
                public final boolean shouldDelayChildPressedState() {
                    return getTabScrollRange() > 0;
                }

                @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
/* 4 */         public final void addView(View view, int i) {
/* 5 */             m2381b(view);
                }

                @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
/* 5 */         public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
/* 6 */             m2381b(view);
                }

                @Override // android.widget.FrameLayout, android.view.ViewGroup
/* 5 */         public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 6 */             return generateDefaultLayoutParams();
                }

                @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
/* 6 */         public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 7 */             m2381b(view);
                }

                @Deprecated
/* 23 */        public void setOnTabSelectedListener(em2 em2Var) {
/* 24 */            setOnTabSelectedListener((dm2) em2Var);
                }

/* 30 */        public void setSelectedTabIndicator(int i) {
                    if (i != 0) {
/* 32 */                setSelectedTabIndicator(mn0.m6700p(getContext(), i));
                    } else {
/* 33 */                setSelectedTabIndicator((Drawable) null);
                    }
                }

/* 461 */       public TabLayout(Context context, AttributeSet attributeSet) {
/* 462 */           this(context, attributeSet, R$attr.tabStyle);
                }
            }
