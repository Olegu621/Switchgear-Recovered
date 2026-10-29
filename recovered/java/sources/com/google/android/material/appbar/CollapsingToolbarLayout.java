            package com.google.android.material.appbar;

            import android.animation.TimeInterpolator;
            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Configuration;
            import android.content.res.TypedArray;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.Region;
            import android.graphics.Typeface;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.text.StaticLayout;
            import android.text.TextPaint;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.animation.AnimationUtils;
            import android.widget.FrameLayout;
            import androidx.appcompat.widget.Toolbar;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$id;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            import p000.AbstractC2246u8;
            import p000.C1979nw;
            import p000.C2184sk;
            import p000.de3;
            import p000.e33;
            import p000.gr0;
            import p000.hd1;
            import p000.ic0;
            import p000.m83;
            import p000.q23;
            import p000.rn2;
            import p000.s23;
            import p000.t90;
            import p000.v00;
            import p000.v33;
            import p000.w70;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public class CollapsingToolbarLayout extends FrameLayout {

                /* JADX INFO: renamed from: r0 */
                public static final int f4352r0 = R$style.Widget_Design_CollapsingToolbar;

                /* JADX INFO: renamed from: U */
                public final Rect f4353U;

                /* JADX INFO: renamed from: V */
                public final C1979nw f4354V;

                /* JADX INFO: renamed from: W */
                public final ic0 f4355W;

                /* JADX INFO: renamed from: a */
                public boolean f4356a;

                /* JADX INFO: renamed from: a0 */
                public boolean f4357a0;

                /* JADX INFO: renamed from: b */
                public final int f4358b;

                /* JADX INFO: renamed from: b0 */
                public boolean f4359b0;

                /* JADX INFO: renamed from: c */
                public ViewGroup f4360c;

                /* JADX INFO: renamed from: c0 */
                public Drawable f4361c0;

                /* JADX INFO: renamed from: d */
                public View f4362d;

                /* JADX INFO: renamed from: d0 */
                public Drawable f4363d0;

                /* JADX INFO: renamed from: e */
                public View f4364e;

                /* JADX INFO: renamed from: e0 */
                public int f4365e0;

                /* JADX INFO: renamed from: f */
                public int f4366f;

                /* JADX INFO: renamed from: f0 */
                public boolean f4367f0;

                /* JADX INFO: renamed from: g0 */
                public ValueAnimator f4368g0;

                /* JADX INFO: renamed from: h0 */
                public long f4369h0;

                /* JADX INFO: renamed from: i */
                public int f4370i;

                /* JADX INFO: renamed from: i0 */
                public int f4371i0;

                /* JADX INFO: renamed from: j0 */
                public C0338f f4372j0;

                /* JADX INFO: renamed from: k0 */
                public int f4373k0;

                /* JADX INFO: renamed from: l0 */
                public int f4374l0;

                /* JADX INFO: renamed from: m0 */
                public m83 f4375m0;

                /* JADX INFO: renamed from: n0 */
                public int f4376n0;

                /* JADX INFO: renamed from: o0 */
                public boolean f4377o0;

                /* JADX INFO: renamed from: p0 */
                public int f4378p0;

                /* JADX INFO: renamed from: q0 */
                public boolean f4379q0;

                /* JADX INFO: renamed from: v */
                public int f4380v;

                /* JADX INFO: renamed from: w */
                public int f4381w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LayoutParams extends FrameLayout.LayoutParams {

                    /* JADX INFO: renamed from: a */
                    public int f4382a;

                    /* JADX INFO: renamed from: b */
                    public float f4383b;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 5 */                 this.f4382a = 0;
/* 9 */                 this.f4383b = 0.5f;
/* 13 */                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CollapsingToolbarLayout_Layout);
/* 23 */                this.f4382a = typedArrayObtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
/* 31 */                this.f4383b = typedArrayObtainStyledAttributes.getFloat(R$styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
/* 33 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
                    int i2;
                    ColorStateList colorStateListM3033o;
/* 1 */             int i3 = f4352r0;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i3), attributeSet, i);
/* 11 */            this.f4356a = true;
/* 18 */            this.f4353U = new Rect();
/* 21 */            this.f4371i0 = -1;
/* 24 */            this.f4376n0 = 0;
/* 26 */            this.f4378p0 = 0;
/* 28 */            Context context2 = getContext();
/* 34 */            C1979nw c1979nw = new C1979nw(this);
/* 37 */            this.f4354V = c1979nw;
/* 41 */            c1979nw.f14506W = AbstractC2246u8.f17414e;
/* 43 */            c1979nw.m7054j(false);
/* 46 */            c1979nw.f14493J = false;
/* 53 */            this.f4355W = new ic0(context2);
/* 55 */            int[] iArr = R$styleable.CollapsingToolbarLayout;
/* 59 */            rn2.m8210a(context2, attributeSet, i, i3);
/* 64 */            rn2.m8211b(context2, attributeSet, iArr, i, i3, new int[0]);
/* 67 */            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i3);
/* 76 */            int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
/* 82 */            if (c1979nw.f14530k != i4) {
/* 84 */                c1979nw.f14530k = i4;
/* 86 */                c1979nw.m7054j(false);
                    }
/* 98 */            c1979nw.m7057m(typedArrayObtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
/* 103 */           int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
/* 107 */           this.f4381w = dimensionPixelSize;
/* 109 */           this.f4380v = dimensionPixelSize;
/* 111 */           this.f4370i = dimensionPixelSize;
/* 113 */           this.f4366f = dimensionPixelSize;
/* 121 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
/* 129 */               this.f4366f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
                    }
/* 137 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
/* 145 */               this.f4380v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
                    }
/* 153 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
/* 161 */               this.f4370i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
                    }
/* 169 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
/* 177 */               this.f4381w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
                    }
/* 185 */           this.f4357a0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CollapsingToolbarLayout_titleEnabled, true);
/* 193 */           setTitle(typedArrayObtainStyledAttributes.getText(R$styleable.CollapsingToolbarLayout_title));
/* 198 */           c1979nw.m7059o(R$style.TextAppearance_Design_CollapsingToolbar_Expanded);
/* 203 */           c1979nw.m7055k(androidx.appcompat.R$style.TextAppearance_AppCompat_Widget_ActionBar_Title);
/* 212 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
/* 220 */               c1979nw.m7059o(typedArrayObtainStyledAttributes.getResourceId(R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
                    }
/* 229 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
/* 237 */               c1979nw.m7055k(typedArrayObtainStyledAttributes.getResourceId(R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
                    }
/* 246 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleTextColor) && c1979nw.f14538o != (colorStateListM3033o = de3.m3033o(context2, typedArrayObtainStyledAttributes, R$styleable.CollapsingToolbarLayout_expandedTitleTextColor))) {
/* 258 */               c1979nw.f14538o = colorStateListM3033o;
/* 260 */               c1979nw.m7054j(false);
                    }
/* 269 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_collapsedTitleTextColor)) {
/* 277 */               c1979nw.m7056l(de3.m3033o(context2, typedArrayObtainStyledAttributes, R$styleable.CollapsingToolbarLayout_collapsedTitleTextColor));
                    }
/* 286 */           this.f4371i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
/* 294 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_maxLines) && (i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_maxLines, 1)) != c1979nw.f14537n0) {
/* 306 */               c1979nw.f14537n0 = i2;
/* 308 */               Bitmap bitmap = c1979nw.f14494K;
/* 310 */               if (bitmap != null) {
/* 312 */                   bitmap.recycle();
/* 316 */                   c1979nw.f14494K = null;
                        }
/* 318 */               c1979nw.m7054j(false);
                    }
/* 327 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CollapsingToolbarLayout_titlePositionInterpolator)) {
/* 339 */               c1979nw.f14505V = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(R$styleable.CollapsingToolbarLayout_titlePositionInterpolator, 0));
/* 341 */               c1979nw.m7054j(false);
                    }
/* 353 */           this.f4369h0 = typedArrayObtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
/* 361 */           setContentScrim(typedArrayObtainStyledAttributes.getDrawable(R$styleable.CollapsingToolbarLayout_contentScrim));
/* 370 */           setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(R$styleable.CollapsingToolbarLayout_statusBarScrim));
/* 379 */           setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_titleCollapseMode, 0));
/* 388 */           this.f4358b = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CollapsingToolbarLayout_toolbarId, -1);
/* 396 */           this.f4377o0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
/* 404 */           this.f4379q0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
/* 406 */           typedArrayObtainStyledAttributes.recycle();
/* 409 */           setWillNotDraw(false);
/* 414 */           gr0 gr0Var = new gr0(this);
/* 417 */           WeakHashMap weakHashMap = e33.f7494a;
/* 419 */           s23.m8383u(this, gr0Var);
                }

                /* JADX INFO: renamed from: b */
                public static v33 m2225b(View view) {
/* 7 */             v33 v33Var = (v33) view.getTag(R$id.view_offset_helper);
/* 9 */             if (v33Var != null) {
/* 21 */                return v33Var;
                    }
/* 13 */            v33 v33Var2 = new v33(view);
/* 18 */            view.setTag(R$id.view_offset_helper, v33Var2);
/* 21 */            return v33Var2;
                }

                /* JADX INFO: renamed from: a */
                public final void m2226a() {
                    View view;
/* 3 */             if (this.f4356a) {
/* 6 */                 ViewGroup viewGroup = null;
/* 7 */                 this.f4360c = null;
/* 9 */                 this.f4362d = null;
/* 12 */                int i = this.f4358b;
/* 14 */                if (i != -1) {
/* 20 */                    ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
/* 22 */                    this.f4360c = viewGroup2;
/* 24 */                    if (viewGroup2 != null) {
/* 26 */                        ViewParent parent = viewGroup2.getParent();
                                while (true) {
/* 30 */                            if (parent == this) {
                                        view = viewGroup2;
                                        break;
                                    } else {
/* 32 */                                if (parent == null) {
                                            break;
                                        }
/* 36 */                                if (parent instanceof View) {
/* 39 */                                    view = (View) parent;
                                        }
/* 41 */                                parent = parent.getParent();
                                        view = view;
                                    }
                                }
/* 46 */                        this.f4362d = view;
                            }
                        }
/* 51 */                if (this.f4360c == null) {
/* 53 */                    int childCount = getChildCount();
/* 58 */                    for (int i2 = 0; i2 < childCount; i2++) {
/* 60 */                        View childAt = getChildAt(i2);
/* 66 */                        if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
/* 77 */                            viewGroup = (ViewGroup) childAt;
                                    break;
                                }
                            }
/* 79 */                    this.f4360c = viewGroup;
                        }
/* 81 */                m2227c();
/* 84 */                this.f4356a = false;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m2227c() {
                    View view;
/* 3 */             if (!this.f4357a0 && (view = this.f4364e) != null) {
/* 9 */                 ViewParent parent = view.getParent();
/* 15 */                if (parent instanceof ViewGroup) {
/* 21 */                    ((ViewGroup) parent).removeView(this.f4364e);
                        }
                    }
/* 26 */            if (!this.f4357a0 || this.f4360c == null) {
/* 63 */                return;
                    }
/* 34 */            if (this.f4364e == null) {
/* 45 */                this.f4364e = new View(getContext());
                    }
/* 53 */            if (this.f4364e.getParent() == null) {
/* 60 */                this.f4360c.addView(this.f4364e, -1, -1);
                    }
                }

                @Override // android.widget.FrameLayout, android.view.ViewGroup
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             return layoutParams instanceof LayoutParams;
                }

                /* JADX INFO: renamed from: d */
                public final void m2228d() {
/* 3 */             if (this.f4361c0 == null && this.f4363d0 == null) {
/* 10 */                return;
                    }
/* 27 */            setScrimsShown(getHeight() + this.f4373k0 < getScrimVisibleHeightTrigger());
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                    Drawable drawable;
/* 1 */             super.draw(canvas);
/* 4 */             m2226a();
/* 9 */             if (this.f4360c == null && (drawable = this.f4361c0) != null && this.f4365e0 > 0) {
/* 25 */                drawable.mutate().setAlpha(this.f4365e0);
/* 30 */                this.f4361c0.draw(canvas);
                    }
/* 35 */            if (this.f4357a0 && this.f4359b0) {
/* 41 */                ViewGroup viewGroup = this.f4360c;
/* 43 */                C1979nw c1979nw = this.f4354V;
/* 45 */                if (viewGroup == null || this.f4361c0 == null || this.f4365e0 <= 0 || this.f4374l0 != 1 || c1979nw.f14514c >= c1979nw.f14520f) {
/* 90 */                    c1979nw.m7049d(canvas);
                        } else {
/* 68 */                    int iSave = canvas.save();
/* 80 */                    canvas.clipRect(this.f4361c0.getBounds(), Region.Op.DIFFERENCE);
/* 83 */                    c1979nw.m7049d(canvas);
/* 86 */                    canvas.restoreToCount(iSave);
                        }
                    }
/* 95 */            if (this.f4363d0 == null || this.f4365e0 <= 0) {
/* 145 */               return;
                    }
/* 101 */           m83 m83Var = this.f4375m0;
/* 111 */           int iM6624d = m83Var != null ? m83Var.m6624d() : 0;
/* 112 */           if (iM6624d > 0) {
/* 126 */               this.f4363d0.setBounds(0, -this.f4373k0, getWidth(), iM6624d - this.f4373k0);
/* 137 */               this.f4363d0.mutate().setAlpha(this.f4365e0);
/* 142 */               this.f4363d0.draw(canvas);
                    }
                }

                @Override // android.view.ViewGroup
                public final boolean drawChild(Canvas canvas, View view, long j) {
                    boolean z;
                    View view2;
/* 1 */             Drawable drawable = this.f4361c0;
/* 5 */             if (drawable == null || this.f4365e0 <= 0 || ((view2 = this.f4362d) == null || view2 == this ? view != this.f4360c : view != view2)) {
/* 68 */                z = false;
                    } else {
/* 25 */                int width = getWidth();
/* 29 */                int height = getHeight();
/* 35 */                if (this.f4374l0 == 1 && view != null && this.f4357a0) {
/* 43 */                    height = view.getBottom();
                        }
/* 47 */                drawable.setBounds(0, 0, width, height);
/* 58 */                this.f4361c0.mutate().setAlpha(this.f4365e0);
/* 63 */                this.f4361c0.draw(canvas);
/* 66 */                z = true;
                    }
                    return super.drawChild(canvas, view, j) || z;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void drawableStateChanged() {
                    ColorStateList colorStateList;
/* 1 */             super.drawableStateChanged();
/* 4 */             int[] drawableState = getDrawableState();
/* 8 */             Drawable drawable = this.f4363d0;
/* 10 */            boolean z = false;
/* 24 */            boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
/* 25 */            Drawable drawable2 = this.f4361c0;
/* 27 */            if (drawable2 != null && drawable2.isStateful()) {
/* 39 */                state |= drawable2.setState(drawableState);
                    }
/* 40 */            C1979nw c1979nw = this.f4354V;
/* 42 */            if (c1979nw != null) {
/* 44 */                c1979nw.f14501R = drawableState;
/* 46 */                ColorStateList colorStateList2 = c1979nw.f14540p;
/* 48 */                if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c1979nw.f14538o) != null && colorStateList.isStateful())) {
/* 66 */                    c1979nw.m7054j(false);
/* 69 */                    z = true;
                        }
/* 70 */                state |= z;
                    }
/* 71 */            if (state) {
/* 73 */                invalidate();
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m2229e(int i, int i2, int i3, int i4, boolean z) {
                    View view;
                    int titleMarginBottom;
                    int titleMarginEnd;
                    int titleMarginTop;
/* 3 */             if (!this.f4357a0 || (view = this.f4364e) == null) {
/* 242 */               return;
                    }
/* 9 */             WeakHashMap weakHashMap = e33.f7494a;
/* 15 */            int titleMarginStart = 0;
/* 29 */            boolean z2 = view.isAttachedToWindow() && this.f4364e.getVisibility() == 0;
/* 30 */            this.f4359b0 = z2;
/* 32 */            if (z2 || z) {
/* 44 */                boolean z3 = getLayoutDirection() == 1;
/* 45 */                View view2 = this.f4362d;
/* 47 */                if (view2 == null) {
/* 50 */                    view2 = this.f4360c;
                        }
/* 76 */                int height = ((getHeight() - m2225b(view2).f17852b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view2.getLayoutParams())).bottomMargin;
/* 77 */                View view3 = this.f4364e;
/* 79 */                Rect rect = this.f4353U;
/* 81 */                w70.m9478a(this, view3, rect);
/* 84 */                ViewGroup viewGroup = this.f4360c;
/* 88 */                if (viewGroup instanceof Toolbar) {
/* 90 */                    Toolbar toolbar = (Toolbar) viewGroup;
/* 92 */                    titleMarginStart = toolbar.getTitleMarginStart();
/* 96 */                    titleMarginEnd = toolbar.getTitleMarginEnd();
/* 100 */                   titleMarginTop = toolbar.getTitleMarginTop();
/* 104 */                   titleMarginBottom = toolbar.getTitleMarginBottom();
                        } else if (viewGroup instanceof android.widget.Toolbar) {
/* 113 */                   android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
/* 115 */                   titleMarginStart = toolbar2.getTitleMarginStart();
/* 119 */                   titleMarginEnd = toolbar2.getTitleMarginEnd();
/* 123 */                   titleMarginTop = toolbar2.getTitleMarginTop();
/* 127 */                   titleMarginBottom = toolbar2.getTitleMarginBottom();
                        } else {
/* 132 */                   titleMarginBottom = 0;
/* 133 */                   titleMarginEnd = 0;
/* 134 */                   titleMarginTop = 0;
                        }
/* 142 */               int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
/* 146 */               int i6 = rect.top + height + titleMarginTop;
/* 147 */               int i7 = rect.right;
/* 149 */               if (!z3) {
/* 152 */                   titleMarginStart = titleMarginEnd;
                        }
/* 153 */               int i8 = i7 - titleMarginStart;
/* 157 */               int i9 = (rect.bottom + height) - titleMarginBottom;
/* 158 */               C1979nw c1979nw = this.f4354V;
/* 160 */               Rect rect2 = c1979nw.f14526i;
/* 164 */               if (rect2.left != i5 || rect2.top != i6 || rect2.right != i8 || rect2.bottom != i9) {
/* 179 */                   rect2.set(i5, i6, i8, i9);
/* 182 */                   c1979nw.f14502S = true;
/* 184 */                   c1979nw.m7053i();
                        }
/* 192 */               int i10 = z3 ? this.f4380v : this.f4366f;
/* 198 */               int i11 = rect.top + this.f4370i;
/* 207 */               int i12 = (i3 - i) - (z3 ? this.f4366f : this.f4380v);
/* 211 */               int i13 = (i4 - i2) - this.f4381w;
/* 212 */               Rect rect3 = c1979nw.f14524h;
/* 216 */               if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
/* 231 */                   rect3.set(i10, i11, i12, i13);
/* 234 */                   c1979nw.f14502S = true;
/* 236 */                   c1979nw.m7053i();
                        }
/* 239 */               c1979nw.m7054j(z);
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m2230f() {
                    CharSequence title;
/* 3 */             if (this.f4360c != null && this.f4357a0 && TextUtils.isEmpty(this.f4354V.f14490G)) {
/* 19 */                ViewGroup viewGroup = this.f4360c;
/* 23 */                if (viewGroup instanceof Toolbar) {
/* 27 */                    title = ((Toolbar) viewGroup).getTitle();
                        } else {
/* 43 */                    title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
                        }
/* 44 */                setTitle(title);
                    }
                }

                @Override // android.widget.FrameLayout, android.view.ViewGroup
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 4 */             LayoutParams layoutParams = new LayoutParams(-1, -1);
/* 8 */             layoutParams.f4382a = 0;
/* 12 */            layoutParams.f4383b = 0.5f;
/* 14 */            return layoutParams;
                }

                @Override // android.widget.FrameLayout, android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 3 */             LayoutParams layoutParams2 = new LayoutParams(layoutParams);
/* 7 */             layoutParams2.f4382a = 0;
/* 11 */            layoutParams2.f4383b = 0.5f;
/* 13 */            return layoutParams2;
                }

                public int getCollapsedTitleGravity() {
/* 3 */             return this.f4354V.f14532l;
                }

                public Typeface getCollapsedTitleTypeface() {
/* 3 */             Typeface typeface = this.f4354V.f14550x;
                    return typeface != null ? typeface : Typeface.DEFAULT;
                }

                public Drawable getContentScrim() {
/* 1 */             return this.f4361c0;
                }

                public int getExpandedTitleGravity() {
/* 3 */             return this.f4354V.f14530k;
                }

                public int getExpandedTitleMarginBottom() {
/* 1 */             return this.f4381w;
                }

                public int getExpandedTitleMarginEnd() {
/* 1 */             return this.f4380v;
                }

                public int getExpandedTitleMarginStart() {
/* 1 */             return this.f4366f;
                }

                public int getExpandedTitleMarginTop() {
/* 1 */             return this.f4370i;
                }

                public Typeface getExpandedTitleTypeface() {
/* 3 */             Typeface typeface = this.f4354V.f14484A;
                    return typeface != null ? typeface : Typeface.DEFAULT;
                }

                public int getHyphenationFrequency() {
/* 3 */             return this.f4354V.f14543q0;
                }

                public int getLineCount() {
/* 3 */             StaticLayout staticLayout = this.f4354V.f14527i0;
/* 5 */             if (staticLayout != null) {
/* 7 */                 return staticLayout.getLineCount();
                    }
/* 12 */            return 0;
                }

                public float getLineSpacingAdd() {
/* 5 */             return this.f4354V.f14527i0.getSpacingAdd();
                }

                public float getLineSpacingMultiplier() {
/* 5 */             return this.f4354V.f14527i0.getSpacingMultiplier();
                }

                public int getMaxLines() {
/* 3 */             return this.f4354V.f14537n0;
                }

                public int getScrimAlpha() {
/* 1 */             return this.f4365e0;
                }

                public long getScrimAnimationDuration() {
/* 1 */             return this.f4369h0;
                }

                public int getScrimVisibleHeightTrigger() {
/* 1 */             int i = this.f4371i0;
/* 3 */             if (i >= 0) {
/* 10 */                return i + this.f4376n0 + this.f4378p0;
                    }
/* 12 */            m83 m83Var = this.f4375m0;
/* 21 */            int iM6624d = m83Var != null ? m83Var.m6624d() : 0;
/* 22 */            WeakHashMap weakHashMap = e33.f7494a;
/* 24 */            int minimumHeight = getMinimumHeight();
                    return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iM6624d, getHeight()) : getHeight() / 3;
                }

                public Drawable getStatusBarScrim() {
/* 1 */             return this.f4363d0;
                }

                public CharSequence getTitle() {
/* 3 */             if (this.f4357a0) {
/* 7 */                 return this.f4354V.f14490G;
                    }
/* 10 */            return null;
                }

                public int getTitleCollapseMode() {
/* 1 */             return this.f4374l0;
                }

                public TimeInterpolator getTitlePositionInterpolator() {
/* 3 */             return this.f4354V.f14505V;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             ViewParent parent = getParent();
/* 10 */            if (parent instanceof AppBarLayout) {
/* 12 */                AppBarLayout appBarLayout = (AppBarLayout) parent;
/* 17 */                if (this.f4374l0 == 1) {
/* 20 */                    appBarLayout.setLiftOnScroll(false);
                        }
/* 23 */                WeakHashMap weakHashMap = e33.f7494a;
/* 29 */                setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
/* 34 */                if (this.f4372j0 == null) {
/* 41 */                    this.f4372j0 = new C0338f(this);
                        }
/* 43 */                C0338f c0338f = this.f4372j0;
/* 47 */                if (appBarLayout.f4336v == null) {
/* 54 */                    appBarLayout.f4336v = new ArrayList();
                        }
/* 56 */                if (c0338f != null && !appBarLayout.f4336v.contains(c0338f)) {
/* 68 */                    appBarLayout.f4336v.add(c0338f);
                        }
/* 71 */                q23.m7679c(this);
                    }
                }

                @Override // android.view.View
                public final void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 6 */             this.f4354V.m7052h(configuration);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
                    ArrayList arrayList;
/* 1 */             ViewParent parent = getParent();
/* 5 */             C0338f c0338f = this.f4372j0;
/* 7 */             if (c0338f != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f4336v) != null) {
/* 19 */                arrayList.remove(c0338f);
                    }
/* 22 */            super.onDetachedFromWindow();
                }

                @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 8 */             m83 m83Var = this.f4375m0;
/* 11 */            if (m83Var != null) {
/* 13 */                int iM6624d = m83Var.m6624d();
/* 17 */                int childCount = getChildCount();
/* 22 */                for (int i5 = 0; i5 < childCount; i5++) {
/* 24 */                    View childAt = getChildAt(i5);
/* 28 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 34 */                    if (!childAt.getFitsSystemWindows() && childAt.getTop() < iM6624d) {
/* 42 */                        childAt.offsetTopAndBottom(iM6624d);
                            }
                        }
                    }
/* 48 */            int childCount2 = getChildCount();
/* 53 */            for (int i6 = 0; i6 < childCount2; i6++) {
/* 59 */                v33 v33VarM2225b = m2225b(getChildAt(i6));
/* 63 */                View view = v33VarM2225b.f17851a;
/* 69 */                v33VarM2225b.f17852b = view.getTop();
/* 75 */                v33VarM2225b.f17853c = view.getLeft();
                    }
/* 81 */            m2229e(i, i2, i3, i4, false);
/* 84 */            m2230f();
/* 87 */            m2228d();
/* 90 */            int childCount3 = getChildCount();
/* 94 */            for (int i7 = 0; i7 < childCount3; i7++) {
/* 104 */               m2225b(getChildAt(i7)).m9216a();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:19:0x007f  */
                @Override // android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
                    CollapsingToolbarLayout collapsingToolbarLayout;
                    int measuredHeight;
                    int measuredHeight2;
/* 1 */             m2226a();
/* 4 */             super.onMeasure(i, i2);
/* 7 */             int mode = View.MeasureSpec.getMode(i2);
/* 11 */            m83 m83Var = this.f4375m0;
/* 20 */            int iM6624d = m83Var != null ? m83Var.m6624d() : 0;
/* 23 */            if ((mode == 0 || this.f4377o0) && iM6624d > 0) {
/* 31 */                this.f4376n0 = iM6624d;
/* 42 */                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iM6624d, 1073741824));
                    }
/* 47 */            if (this.f4379q0) {
/* 49 */                C1979nw c1979nw = this.f4354V;
/* 54 */                if (c1979nw.f14537n0 > 1) {
/* 56 */                    m2230f();
/* 70 */                    collapsingToolbarLayout = this;
/* 71 */                    collapsingToolbarLayout.m2229e(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
/* 74 */                    int i3 = c1979nw.f14542q;
/* 76 */                    if (i3 > 1) {
/* 78 */                        TextPaint textPaint = c1979nw.f14504U;
/* 82 */                        textPaint.setTextSize(c1979nw.f14534m);
/* 87 */                        textPaint.setTypeface(c1979nw.f14484A);
/* 92 */                        textPaint.setLetterSpacing(c1979nw.f14523g0);
/* 111 */                       collapsingToolbarLayout.f4378p0 = (i3 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
/* 124 */                       super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(collapsingToolbarLayout.getMeasuredHeight() + collapsingToolbarLayout.f4378p0, 1073741824));
                            }
                        } else {
/* 128 */                   collapsingToolbarLayout = this;
                        }
                    } else {
/* 128 */               collapsingToolbarLayout = this;
                    }
/* 129 */           ViewGroup viewGroup = collapsingToolbarLayout.f4360c;
/* 131 */           if (viewGroup != null) {
/* 133 */               View view = collapsingToolbarLayout.f4362d;
/* 135 */               if (view == null || view == collapsingToolbarLayout) {
/* 169 */                   ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
/* 175 */                   if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
/* 177 */                       ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
/* 188 */                       measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                            } else {
/* 190 */                       measuredHeight = viewGroup.getMeasuredHeight();
                            }
/* 194 */                   collapsingToolbarLayout.setMinimumHeight(measuredHeight);
/* 197 */                   return;
                        }
/* 140 */               ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
/* 146 */               if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
/* 148 */                   ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
/* 159 */                   measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                        } else {
/* 161 */                   measuredHeight2 = view.getMeasuredHeight();
                        }
/* 165 */               collapsingToolbarLayout.setMinimumHeight(measuredHeight2);
                    }
                }

                @Override // android.view.View
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onSizeChanged(i, i2, i3, i4);
/* 4 */             Drawable drawable = this.f4361c0;
/* 6 */             if (drawable != null) {
/* 8 */                 ViewGroup viewGroup = this.f4360c;
/* 13 */                if (this.f4374l0 == 1 && viewGroup != null && this.f4357a0) {
/* 21 */                    i2 = viewGroup.getBottom();
                        }
/* 26 */                drawable.setBounds(0, 0, i, i2);
                    }
                }

                public void setCollapsedTitleGravity(int i) {
/* 3 */             this.f4354V.m7057m(i);
                }

                public void setCollapsedTitleTextAppearance(int i) {
/* 3 */             this.f4354V.m7055k(i);
                }

                public void setCollapsedTitleTextColor(int i) {
/* 5 */             setCollapsedTitleTextColor(ColorStateList.valueOf(i));
                }

                public void setCollapsedTitleTypeface(Typeface typeface) {
/* 1 */             C1979nw c1979nw = this.f4354V;
/* 7 */             if (c1979nw.m7058n(typeface)) {
/* 10 */                c1979nw.m7054j(false);
                    }
                }

                public void setContentScrim(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.f4361c0;
/* 3 */             if (drawable2 != drawable) {
/* 6 */                 if (drawable2 != null) {
/* 8 */                     drawable2.setCallback(null);
                        }
/* 13 */                Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
/* 17 */                this.f4361c0 = drawableMutate;
/* 19 */                if (drawableMutate != null) {
/* 21 */                    int width = getWidth();
/* 25 */                    int height = getHeight();
/* 29 */                    ViewGroup viewGroup = this.f4360c;
/* 34 */                    if (this.f4374l0 == 1 && viewGroup != null && this.f4357a0) {
/* 42 */                        height = viewGroup.getBottom();
                            }
/* 47 */                    drawableMutate.setBounds(0, 0, width, height);
/* 52 */                    this.f4361c0.setCallback(this);
/* 59 */                    this.f4361c0.setAlpha(this.f4365e0);
                        }
/* 62 */                WeakHashMap weakHashMap = e33.f7494a;
/* 64 */                postInvalidateOnAnimation();
                    }
                }

                public void setContentScrimColor(int i) {
/* 6 */             setContentScrim(new ColorDrawable(i));
                }

                public void setContentScrimResource(int i) {
/* 9 */             setContentScrim(v00.getDrawable(getContext(), i));
                }

                public void setExpandedTitleColor(int i) {
/* 5 */             setExpandedTitleTextColor(ColorStateList.valueOf(i));
                }

                public void setExpandedTitleGravity(int i) {
/* 1 */             C1979nw c1979nw = this.f4354V;
/* 5 */             if (c1979nw.f14530k != i) {
/* 7 */                 c1979nw.f14530k = i;
/* 10 */                c1979nw.m7054j(false);
                    }
                }

                public void setExpandedTitleMarginBottom(int i) {
/* 1 */             this.f4381w = i;
/* 3 */             requestLayout();
                }

                public void setExpandedTitleMarginEnd(int i) {
/* 1 */             this.f4380v = i;
/* 3 */             requestLayout();
                }

                public void setExpandedTitleMarginStart(int i) {
/* 1 */             this.f4366f = i;
/* 3 */             requestLayout();
                }

                public void setExpandedTitleMarginTop(int i) {
/* 1 */             this.f4370i = i;
/* 3 */             requestLayout();
                }

                public void setExpandedTitleTextAppearance(int i) {
/* 3 */             this.f4354V.m7059o(i);
                }

                public void setExpandedTitleTextColor(ColorStateList colorStateList) {
/* 1 */             C1979nw c1979nw = this.f4354V;
/* 5 */             if (c1979nw.f14538o != colorStateList) {
/* 7 */                 c1979nw.f14538o = colorStateList;
/* 10 */                c1979nw.m7054j(false);
                    }
                }

                public void setExpandedTitleTypeface(Typeface typeface) {
/* 1 */             C1979nw c1979nw = this.f4354V;
/* 7 */             if (c1979nw.m7060p(typeface)) {
/* 10 */                c1979nw.m7054j(false);
                    }
                }

                public void setExtraMultilineHeightEnabled(boolean z) {
/* 1 */             this.f4379q0 = z;
                }

                public void setForceApplySystemWindowInsetTop(boolean z) {
/* 1 */             this.f4377o0 = z;
                }

                public void setHyphenationFrequency(int i) {
/* 3 */             this.f4354V.f14543q0 = i;
                }

                public void setLineSpacingAdd(float f) {
/* 3 */             this.f4354V.f14539o0 = f;
                }

                public void setLineSpacingMultiplier(float f) {
/* 3 */             this.f4354V.f14541p0 = f;
                }

                public void setMaxLines(int i) {
/* 1 */             C1979nw c1979nw = this.f4354V;
/* 5 */             if (i != c1979nw.f14537n0) {
/* 7 */                 c1979nw.f14537n0 = i;
/* 9 */                 Bitmap bitmap = c1979nw.f14494K;
/* 11 */                if (bitmap != null) {
/* 13 */                    bitmap.recycle();
/* 17 */                    c1979nw.f14494K = null;
                        }
/* 20 */                c1979nw.m7054j(false);
                    }
                }

                public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
/* 3 */             this.f4354V.f14493J = z;
                }

                public void setScrimAlpha(int i) {
                    ViewGroup viewGroup;
/* 3 */             if (i != this.f4365e0) {
/* 7 */                 if (this.f4361c0 != null && (viewGroup = this.f4360c) != null) {
/* 13 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 15 */                    viewGroup.postInvalidateOnAnimation();
                        }
/* 18 */                this.f4365e0 = i;
/* 20 */                WeakHashMap weakHashMap2 = e33.f7494a;
/* 22 */                postInvalidateOnAnimation();
                    }
                }

                public void setScrimAnimationDuration(long j) {
/* 1 */             this.f4369h0 = j;
                }

                public void setScrimVisibleHeightTrigger(int i) {
/* 3 */             if (this.f4371i0 != i) {
/* 5 */                 this.f4371i0 = i;
/* 7 */                 m2228d();
                    }
                }

                public void setScrimsShown(boolean z) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 7 */             int i = 1;
/* 19 */            boolean z2 = isLaidOut() && !isInEditMode();
/* 22 */            if (this.f4367f0 != z) {
/* 26 */                if (z2) {
/* 28 */                    int i2 = z ? 255 : 0;
/* 31 */                    m2226a();
/* 34 */                    ValueAnimator valueAnimator = this.f4368g0;
/* 36 */                    if (valueAnimator == null) {
/* 40 */                        ValueAnimator valueAnimator2 = new ValueAnimator();
/* 43 */                        this.f4368g0 = valueAnimator2;
/* 54 */                        valueAnimator2.setInterpolator(i2 > this.f4365e0 ? AbstractC2246u8.f17412c : AbstractC2246u8.f17413d);
/* 64 */                        this.f4368g0.addUpdateListener(new C2184sk(this, i));
                            } else if (valueAnimator.isRunning()) {
/* 76 */                        this.f4368g0.cancel();
                            }
/* 83 */                    this.f4368g0.setDuration(this.f4369h0);
/* 94 */                    this.f4368g0.setIntValues(this.f4365e0, i2);
/* 99 */                    this.f4368g0.start();
                        } else {
/* 106 */                   setScrimAlpha(z ? 255 : 0);
                        }
/* 109 */               this.f4367f0 = z;
                    }
                }

                public void setStatusBarScrim(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.f4363d0;
/* 3 */             if (drawable2 != drawable) {
/* 6 */                 if (drawable2 != null) {
/* 8 */                     drawable2.setCallback(null);
                        }
/* 13 */                Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
/* 17 */                this.f4363d0 = drawableMutate;
/* 19 */                if (drawableMutate != null) {
/* 25 */                    if (drawableMutate.isStateful()) {
/* 33 */                        this.f4363d0.setState(getDrawableState());
                            }
/* 36 */                    Drawable drawable3 = this.f4363d0;
/* 38 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 44 */                    t90.m8739b(drawable3, getLayoutDirection());
/* 59 */                    this.f4363d0.setVisible(getVisibility() == 0, false);
/* 64 */                    this.f4363d0.setCallback(this);
/* 71 */                    this.f4363d0.setAlpha(this.f4365e0);
                        }
/* 74 */                WeakHashMap weakHashMap2 = e33.f7494a;
/* 76 */                postInvalidateOnAnimation();
                    }
                }

                public void setStatusBarScrimColor(int i) {
/* 6 */             setStatusBarScrim(new ColorDrawable(i));
                }

                public void setStatusBarScrimResource(int i) {
/* 9 */             setStatusBarScrim(v00.getDrawable(getContext(), i));
                }

                public void setTitle(CharSequence charSequence) {
/* 1 */             C1979nw c1979nw = this.f4354V;
/* 3 */             if (charSequence == null || !TextUtils.equals(c1979nw.f14490G, charSequence)) {
/* 13 */                c1979nw.f14490G = charSequence;
/* 16 */                c1979nw.f14491H = null;
/* 18 */                Bitmap bitmap = c1979nw.f14494K;
/* 20 */                if (bitmap != null) {
/* 22 */                    bitmap.recycle();
/* 25 */                    c1979nw.f14494K = null;
                        }
/* 28 */                c1979nw.m7054j(false);
                    }
/* 35 */            setContentDescription(getTitle());
                }

                public void setTitleCollapseMode(int i) {
/* 1 */             this.f4374l0 = i;
/* 9 */             boolean z = i == 1;
/* 12 */            this.f4354V.f14516d = z;
/* 14 */            ViewParent parent = getParent();
/* 20 */            if (parent instanceof AppBarLayout) {
/* 22 */                AppBarLayout appBarLayout = (AppBarLayout) parent;
/* 26 */                if (this.f4374l0 == 1) {
/* 28 */                    appBarLayout.setLiftOnScroll(false);
                        }
                    }
/* 31 */            if (z && this.f4361c0 == null) {
/* 43 */                float dimension = getResources().getDimension(R$dimen.design_appbar_elevation);
/* 47 */                ic0 ic0Var = this.f4355W;
/* 55 */                setContentScrimColor(ic0Var.m4516a(dimension, ic0Var.f9542d));
                    }
                }

                public void setTitleEnabled(boolean z) {
/* 3 */             if (z != this.f4357a0) {
/* 5 */                 this.f4357a0 = z;
/* 11 */                setContentDescription(getTitle());
/* 14 */                m2227c();
/* 17 */                requestLayout();
                    }
                }

                public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
/* 1 */             C1979nw c1979nw = this.f4354V;
/* 3 */             c1979nw.f14505V = timeInterpolator;
/* 6 */             c1979nw.m7054j(false);
                }

                @Override // android.view.View
                public void setVisibility(int i) {
/* 1 */             super.setVisibility(i);
/* 9 */             boolean z = i == 0;
/* 10 */            Drawable drawable = this.f4363d0;
/* 12 */            if (drawable != null && drawable.isVisible() != z) {
/* 22 */                this.f4363d0.setVisible(z, false);
                    }
/* 25 */            Drawable drawable2 = this.f4361c0;
/* 27 */            if (drawable2 == null || drawable2.isVisible() == z) {
/* 40 */                return;
                    }
/* 37 */            this.f4361c0.setVisible(z, false);
                }

                @Override // android.view.View
                public final boolean verifyDrawable(Drawable drawable) {
                    return super.verifyDrawable(drawable) || drawable == this.f4361c0 || drawable == this.f4363d0;
                }

/* 8 */         public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
/* 9 */             this.f4354V.m7056l(colorStateList);
                }

                @Override // android.widget.FrameLayout, android.view.ViewGroup
/* 13 */        public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 14 */            return new LayoutParams(getContext(), attributeSet);
                }

                @Override // android.widget.FrameLayout, android.view.ViewGroup
/* 14 */        public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
/* 16 */            LayoutParams layoutParams = new LayoutParams(-1, -1);
/* 17 */            layoutParams.f4382a = 0;
/* 18 */            layoutParams.f4383b = 0.5f;
                    return layoutParams;
                }

/* 422 */       public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
/* 423 */           this(context, attributeSet, R$attr.collapsingToolbarLayoutStyle);
                }
            }
