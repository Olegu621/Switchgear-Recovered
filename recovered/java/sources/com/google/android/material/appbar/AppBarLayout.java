            package com.google.android.material.appbar;

            import android.animation.AnimatorInflater;
            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewOutlineProvider;
            import android.view.animation.AnimationUtils;
            import android.view.animation.Interpolator;
            import android.widget.FrameLayout;
            import android.widget.LinearLayout;
            import android.widget.ListView;
            import android.widget.ScrollView;
            import androidx.coordinatorlayout.widget.C0080c;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import androidx.coordinatorlayout.widget.InterfaceC0078a;
            import androidx.customview.view.AbsSavedState;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$integer;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.WeakHashMap;
            import p000.AbstractC0886en;
            import p000.AbstractC2246u8;
            import p000.C0210cb;
            import p000.C1951n4;
            import p000.C1979nw;
            import p000.C2360x9;
            import p000.C2518z0;
            import p000.InterfaceC2490y9;
            import p000.e33;
            import p000.fd1;
            import p000.hd1;
            import p000.he3;
            import p000.jb1;
            import p000.le2;
            import p000.m83;
            import p000.mn0;
            import p000.nm1;
            import p000.qc3;
            import p000.qj3;
            import p000.rn2;
            import p000.s23;
            import p000.t90;
            import p000.v33;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 2 */     public class AppBarLayout extends LinearLayout implements InterfaceC0078a {

                /* JADX INFO: renamed from: h0 */
                public static final int f4318h0 = R$style.Widget_Design_AppBarLayout;

                /* JADX INFO: renamed from: U */
                public boolean f4319U;

                /* JADX INFO: renamed from: V */
                public boolean f4320V;

                /* JADX INFO: renamed from: W */
                public boolean f4321W;

                /* JADX INFO: renamed from: a */
                public int f4322a;

                /* JADX INFO: renamed from: a0 */
                public int f4323a0;

                /* JADX INFO: renamed from: b */
                public int f4324b;

                /* JADX INFO: renamed from: b0 */
                public WeakReference f4325b0;

                /* JADX INFO: renamed from: c */
                public int f4326c;

                /* JADX INFO: renamed from: c0 */
                public ValueAnimator f4327c0;

                /* JADX INFO: renamed from: d */
                public int f4328d;

                /* JADX INFO: renamed from: d0 */
                public final ArrayList f4329d0;

                /* JADX INFO: renamed from: e */
                public boolean f4330e;

                /* JADX INFO: renamed from: e0 */
                public int[] f4331e0;

                /* JADX INFO: renamed from: f */
                public int f4332f;

                /* JADX INFO: renamed from: f0 */
                public Drawable f4333f0;

                /* JADX INFO: renamed from: g0 */
                public Behavior f4334g0;

                /* JADX INFO: renamed from: i */
                public m83 f4335i;

                /* JADX INFO: renamed from: v */
                public ArrayList f4336v;

                /* JADX INFO: renamed from: w */
                public boolean f4337w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LayoutParams extends LinearLayout.LayoutParams {

                    /* JADX INFO: renamed from: a */
                    public int f4349a;

                    /* JADX INFO: renamed from: b */
                    public final C0210cb f4350b;

                    /* JADX INFO: renamed from: c */
                    public final Interpolator f4351c;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 5 */                 this.f4349a = 1;
/* 9 */                 TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppBarLayout_Layout);
/* 20 */                this.f4349a = typedArrayObtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
/* 38 */                this.f4350b = typedArrayObtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new C0210cb(4);
/* 46 */                if (typedArrayObtainStyledAttributes.hasValue(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
/* 58 */                    this.f4351c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
                        }
/* 60 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = f4318h0;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 11 */            this.f4324b = -1;
/* 13 */            this.f4326c = -1;
/* 15 */            this.f4328d = -1;
/* 18 */            this.f4332f = 0;
/* 25 */            this.f4329d0 = new ArrayList();
/* 27 */            Context context2 = getContext();
/* 32 */            setOrientation(1);
/* 41 */            if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
/* 45 */                setOutlineProvider(ViewOutlineProvider.BOUNDS);
                    }
/* 48 */            Context context3 = getContext();
/* 58 */            TypedArray typedArrayM8213d = rn2.m8213d(context3, attributeSet, jb1.f12172d, i, i2, new int[0]);
                    try {
/* 66 */                if (typedArrayM8213d.hasValue(0)) {
/* 76 */                    setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayM8213d.getResourceId(0, 0)));
                        }
/* 84 */                typedArrayM8213d.recycle();
/* 92 */                TypedArray typedArrayM8213d2 = rn2.m8213d(context2, attributeSet, R$styleable.AppBarLayout, i, i2, new int[0]);
/* 98 */                Drawable drawable = typedArrayM8213d2.getDrawable(R$styleable.AppBarLayout_android_background);
/* 102 */               WeakHashMap weakHashMap = e33.f7494a;
/* 104 */               setBackground(drawable);
/* 113 */               if (getBackground() instanceof ColorDrawable) {
/* 119 */                   ColorDrawable colorDrawable = (ColorDrawable) getBackground();
/* 123 */                   fd1 fd1Var = new fd1();
/* 134 */                   fd1Var.m3742n(ColorStateList.valueOf(colorDrawable.getColor()));
/* 137 */                   fd1Var.m3739k(context2);
/* 140 */                   setBackground(fd1Var);
                        }
/* 149 */               if (typedArrayM8213d2.hasValue(R$styleable.AppBarLayout_expanded)) {
/* 157 */                   m2206d(typedArrayM8213d2.getBoolean(R$styleable.AppBarLayout_expanded, false), false, false);
                        }
/* 166 */               if (typedArrayM8213d2.hasValue(R$styleable.AppBarLayout_elevation)) {
/* 175 */                   jb1.m5736B(this, typedArrayM8213d2.getDimensionPixelSize(R$styleable.AppBarLayout_elevation, 0));
                        }
/* 182 */               if (Build.VERSION.SDK_INT >= 26) {
/* 190 */                   if (typedArrayM8213d2.hasValue(R$styleable.AppBarLayout_android_keyboardNavigationCluster)) {
/* 1 */                         setKeyboardNavigationCluster(typedArrayM8213d2.getBoolean(R$styleable.AppBarLayout_android_keyboardNavigationCluster, false));
                            }
/* 207 */                   if (typedArrayM8213d2.hasValue(R$styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
/* 215 */                       setTouchscreenBlocksFocus(typedArrayM8213d2.getBoolean(R$styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
                            }
                        }
/* 224 */               this.f4321W = typedArrayM8213d2.getBoolean(R$styleable.AppBarLayout_liftOnScroll, false);
/* 232 */               this.f4323a0 = typedArrayM8213d2.getResourceId(R$styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
/* 240 */               setStatusBarForeground(typedArrayM8213d2.getDrawable(R$styleable.AppBarLayout_statusBarForeground));
/* 243 */               typedArrayM8213d2.recycle();
/* 252 */               s23.m8383u(this, new qc3(this, 7));
                    } catch (Throwable th) {
/* 256 */               typedArrayM8213d.recycle();
/* 259 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: a */
                public static LayoutParams m2203a(ViewGroup.LayoutParams layoutParams) {
/* 4 */             if (layoutParams instanceof LinearLayout.LayoutParams) {
/* 10 */                LayoutParams layoutParams2 = new LayoutParams((LinearLayout.LayoutParams) layoutParams);
/* 13 */                layoutParams2.f4349a = 1;
/* 15 */                return layoutParams2;
                    }
/* 18 */            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
/* 24 */                LayoutParams layoutParams3 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
/* 27 */                layoutParams3.f4349a = 1;
/* 29 */                return layoutParams3;
                    }
/* 32 */            LayoutParams layoutParams4 = new LayoutParams(layoutParams);
/* 35 */            layoutParams4.f4349a = 1;
/* 37 */            return layoutParams4;
                }

                /* JADX INFO: renamed from: b */
                public final void m2204b() {
/* 1 */             Behavior behavior = this.f4334g0;
/* 22 */            BaseBehavior.SavedState savedStateM2214F = (behavior == null || this.f4324b == -1 || this.f4332f != 0) ? null : behavior.m2214F(AbsSavedState.f1291b, this);
/* 23 */            this.f4324b = -1;
/* 25 */            this.f4326c = -1;
/* 27 */            this.f4328d = -1;
/* 29 */            if (savedStateM2214F != null) {
/* 31 */                Behavior behavior2 = this.f4334g0;
/* 35 */                if (behavior2.f4341m != null) {
/* 40 */                    return;
                        }
/* 38 */                behavior2.f4341m = savedStateM2214F;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m2205c(int i) {
/* 1 */             this.f4322a = i;
/* 7 */             if (!willNotDraw()) {
/* 9 */                 WeakHashMap weakHashMap = e33.f7494a;
/* 11 */                postInvalidateOnAnimation();
                    }
/* 14 */            ArrayList arrayList = this.f4336v;
/* 16 */            if (arrayList != null) {
/* 18 */                int size = arrayList.size();
/* 24 */                for (int i2 = 0; i2 < size; i2++) {
/* 32 */                    InterfaceC2490y9 interfaceC2490y9 = (InterfaceC2490y9) this.f4336v.get(i2);
/* 34 */                    if (interfaceC2490y9 != null) {
/* 38 */                        CollapsingToolbarLayout collapsingToolbarLayout = ((C0338f) interfaceC2490y9).f4415a;
/* 40 */                        collapsingToolbarLayout.f4373k0 = i;
/* 42 */                        C1979nw c1979nw = collapsingToolbarLayout.f4354V;
/* 44 */                        m83 m83Var = collapsingToolbarLayout.f4375m0;
/* 53 */                        int iM6624d = m83Var != null ? m83Var.m6624d() : 0;
/* 54 */                        int childCount = collapsingToolbarLayout.getChildCount();
/* 59 */                        for (int i3 = 0; i3 < childCount; i3++) {
/* 61 */                            View childAt = collapsingToolbarLayout.getChildAt(i3);
/* 69 */                            CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams();
/* 71 */                            v33 v33VarM2225b = CollapsingToolbarLayout.m2225b(childAt);
/* 75 */                            int i4 = layoutParams.f4382a;
/* 78 */                            if (i4 == 1) {
/* 127 */                               v33VarM2225b.m9217b(qj3.m7892c(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.m2225b(childAt).f17852b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin));
                                    } else if (i4 == 2) {
/* 93 */                                v33VarM2225b.m9217b(Math.round((-i) * layoutParams.f4383b));
                                    }
                                }
/* 133 */                       collapsingToolbarLayout.m2228d();
/* 138 */                       if (collapsingToolbarLayout.f4363d0 != null && iM6624d > 0) {
/* 142 */                           WeakHashMap weakHashMap2 = e33.f7494a;
/* 144 */                           collapsingToolbarLayout.postInvalidateOnAnimation();
                                }
/* 147 */                       int height = collapsingToolbarLayout.getHeight();
/* 151 */                       WeakHashMap weakHashMap3 = e33.f7494a;
/* 159 */                       int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - iM6624d;
/* 164 */                       float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
                                float f = minimumHeight;
/* 170 */                       float fMin = Math.min(1.0f, scrimVisibleHeightTrigger / f);
/* 174 */                       c1979nw.f14518e = fMin;
/* 182 */                       c1979nw.f14520f = AbstractC0886en.m3503g(1.0f, fMin, 0.5f, fMin);
/* 187 */                       c1979nw.f14522g = collapsingToolbarLayout.f4373k0 + minimumHeight;
/* 195 */                       c1979nw.m7061q(Math.abs(i) / f);
                            }
                        }
                    }
                }

                @Override // android.widget.LinearLayout, android.view.ViewGroup
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             return layoutParams instanceof LayoutParams;
                }

                /* JADX INFO: renamed from: d */
                public final void m2206d(boolean z, boolean z2, boolean z3) {
/* 18 */            this.f4332f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
/* 20 */            requestLayout();
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
/* 1 */             super.draw(canvas);
/* 6 */             if (this.f4333f0 == null || getTopInset() <= 0) {
/* 34 */                return;
                    }
/* 14 */            int iSave = canvas.save();
/* 23 */            canvas.translate(0.0f, -this.f4322a);
/* 28 */            this.f4333f0.draw(canvas);
/* 31 */            canvas.restoreToCount(iSave);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             int[] drawableState = getDrawableState();
/* 8 */             Drawable drawable = this.f4333f0;
/* 10 */            if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
/* 24 */                invalidateDrawable(drawable);
                    }
                }

                /* JADX INFO: renamed from: e */
                public final boolean m2207e(boolean z) {
/* 3 */             int i = 0;
/* 4 */             if (this.f4337w || this.f4320V == z) {
/* 3 */                 return false;
                    }
/* 10 */            this.f4320V = z;
/* 12 */            refreshDrawableState();
/* 18 */            if (this.f4321W && (getBackground() instanceof fd1)) {
/* 32 */                fd1 fd1Var = (fd1) getBackground();
/* 40 */                float dimension = getResources().getDimension(R$dimen.design_appbar_elevation);
/* 49 */                float f = z ? 0.0f : dimension;
/* 50 */                if (!z) {
/* 53 */                    dimension = 0.0f;
                        }
/* 54 */                ValueAnimator valueAnimator = this.f4327c0;
/* 56 */                if (valueAnimator != null) {
/* 58 */                    valueAnimator.cancel();
                        }
/* 68 */                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
/* 72 */                this.f4327c0 = valueAnimatorOfFloat;
/* 85 */                valueAnimatorOfFloat.setDuration(getResources().getInteger(R$integer.app_bar_elevation_anim_duration));
/* 92 */                this.f4327c0.setInterpolator(AbstractC2246u8.f17410a);
/* 102 */               this.f4327c0.addUpdateListener(new C2360x9(i, this, fd1Var));
/* 107 */               this.f4327c0.start();
                    }
/* 17 */            return true;
                }

                /* JADX INFO: renamed from: f */
                public final boolean m2208f(View view) {
                    int i;
/* 5 */             if (this.f4325b0 == null && (i = this.f4323a0) != -1) {
/* 18 */                View viewFindViewById = view != null ? view.findViewById(i) : null;
/* 19 */                if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
/* 37 */                    viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f4323a0);
                        }
/* 41 */                if (viewFindViewById != null) {
/* 48 */                    this.f4325b0 = new WeakReference(viewFindViewById);
                        }
                    }
/* 50 */            WeakReference weakReference = this.f4325b0;
/* 59 */            View view2 = weakReference != null ? (View) weakReference.get() : null;
/* 61 */            if (view2 != null) {
/* 64 */                view = view2;
                    }
/* 65 */            if (view != null) {
                        return view.canScrollVertically(-1) || view.getScrollY() > 0;
                    }
/* 81 */            return false;
                }

                @Override // android.widget.LinearLayout, android.view.ViewGroup
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 5 */             LayoutParams layoutParams = new LayoutParams(-1, -2);
/* 9 */             layoutParams.f4349a = 1;
/* 11 */            return layoutParams;
                }

                @Override // android.widget.LinearLayout, android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new LayoutParams(getContext(), attributeSet);
                }

                @Override // androidx.coordinatorlayout.widget.InterfaceC0078a
                public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
/* 3 */             Behavior behavior = new Behavior();
/* 6 */             this.f4334g0 = behavior;
/* 8 */             return behavior;
                }

                /* JADX WARN: Code duplicated, block: B:18:0x0047  */
                /* JADX WARN: Code duplicated, block: B:20:0x004f  */
                public int getDownNestedPreScrollRange() {
                    int iMin;
                    int minimumHeight;
/* 1 */             int i = this.f4326c;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 14 */            int i2 = 0;
/* 15 */            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
/* 17 */                View childAt = getChildAt(childCount);
/* 25 */                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 27 */                int measuredHeight = childAt.getMeasuredHeight();
/* 31 */                int i3 = layoutParams.f4349a;
/* 36 */                if ((i3 & 5) != 5) {
/* 91 */                    if (i2 > 0) {
                                break;
                            }
                        } else {
/* 42 */                    int i4 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
/* 45 */                    if ((i3 & 8) != 0) {
/* 47 */                        WeakHashMap weakHashMap = e33.f7494a;
/* 49 */                        minimumHeight = childAt.getMinimumHeight();
                            } else {
/* 57 */                        if ((i3 & 2) != 0) {
/* 59 */                            WeakHashMap weakHashMap2 = e33.f7494a;
/* 65 */                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                                } else {
/* 68 */                            iMin = i4 + measuredHeight;
                                }
/* 70 */                        if (childCount == 0) {
/* 72 */                            WeakHashMap weakHashMap3 = e33.f7494a;
/* 78 */                            if (childAt.getFitsSystemWindows()) {
/* 85 */                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                                    }
                                }
/* 89 */                        i2 += iMin;
                            }
/* 53 */                    iMin = minimumHeight + i4;
/* 70 */                    if (childCount == 0) {
/* 72 */                        WeakHashMap weakHashMap4 = e33.f7494a;
/* 78 */                        if (childAt.getFitsSystemWindows()) {
/* 85 */                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                                }
                            }
/* 89 */                    i2 += iMin;
                        }
                    }
/* 97 */            int iMax = Math.max(0, i2);
/* 101 */           this.f4326c = iMax;
/* 103 */           return iMax;
                }

                public int getDownNestedScrollRange() {
/* 1 */             int i = this.f4328d;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 7 */             int childCount = getChildCount();
/* 13 */            int minimumHeight = 0;
/* 14 */            for (int i2 = 0; i2 < childCount; i2++) {
/* 16 */                View childAt = getChildAt(i2);
/* 24 */                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 35 */                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
/* 36 */                int i3 = layoutParams.f4349a;
/* 40 */                if ((i3 & 1) == 0) {
                            break;
                        }
/* 42 */                minimumHeight += measuredHeight;
/* 45 */                if ((i3 & 2) != 0) {
/* 47 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 53 */                    minimumHeight -= childAt.getMinimumHeight();
                            break;
                        }
                    }
/* 58 */            int iMax = Math.max(0, minimumHeight);
/* 62 */            this.f4328d = iMax;
/* 64 */            return iMax;
                }

                public int getLiftOnScrollTargetViewId() {
/* 1 */             return this.f4323a0;
                }

                public final int getMinimumHeightForVisibleOverlappingContent() {
/* 1 */             int topInset = getTopInset();
/* 5 */             WeakHashMap weakHashMap = e33.f7494a;
/* 7 */             int minimumHeight = getMinimumHeight();
/* 11 */            if (minimumHeight == 0) {
/* 17 */                int childCount = getChildCount();
/* 34 */                minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
/* 35 */                if (minimumHeight == 0) {
/* 42 */                    return getHeight() / 3;
                        }
                    }
/* 15 */            return (minimumHeight * 2) + topInset;
                }

                public int getPendingAction() {
/* 1 */             return this.f4332f;
                }

                public Drawable getStatusBarForeground() {
/* 1 */             return this.f4333f0;
                }

                @Deprecated
                public float getTargetElevation() {
/* 1 */             return 0.0f;
                }

                public final int getTopInset() {
/* 1 */             m83 m83Var = this.f4335i;
/* 3 */             if (m83Var != null) {
/* 5 */                 return m83Var.m6624d();
                    }
/* 10 */            return 0;
                }

                public final int getTotalScrollRange() {
/* 1 */             int i = this.f4324b;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 7 */             int childCount = getChildCount();
/* 13 */            int minimumHeight = 0;
/* 14 */            for (int i2 = 0; i2 < childCount; i2++) {
/* 16 */                View childAt = getChildAt(i2);
/* 24 */                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 26 */                int measuredHeight = childAt.getMeasuredHeight();
/* 30 */                int i3 = layoutParams.f4349a;
/* 34 */                if ((i3 & 1) == 0) {
                            break;
                        }
/* 42 */                int topInset = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + minimumHeight;
/* 43 */                if (i2 == 0) {
/* 45 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 51 */                    if (childAt.getFitsSystemWindows()) {
/* 57 */                        topInset -= getTopInset();
                            }
                        }
/* 58 */                minimumHeight = topInset;
/* 61 */                if ((i3 & 2) != 0) {
/* 63 */                    WeakHashMap weakHashMap2 = e33.f7494a;
/* 69 */                    minimumHeight -= childAt.getMinimumHeight();
                            break;
                        }
                    }
/* 74 */            int iMax = Math.max(0, minimumHeight);
/* 78 */            this.f4324b = iMax;
/* 80 */            return iMax;
                }

                public int getUpNestedPreScrollRange() {
/* 1 */             return getTotalScrollRange();
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             he3.m4196s(this);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final int[] onCreateDrawableState(int i) {
/* 3 */             if (this.f4331e0 == null) {
/* 8 */                 this.f4331e0 = new int[4];
                    }
/* 10 */            int[] iArr = this.f4331e0;
/* 14 */            int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
/* 18 */            boolean z = this.f4319U;
/* 20 */            int i2 = R$attr.state_liftable;
/* 22 */            if (!z) {
/* 25 */                i2 = -i2;
                    }
/* 27 */            iArr[0] = i2;
/* 42 */            iArr[1] = (z && this.f4320V) ? R$attr.state_lifted : -R$attr.state_lifted;
/* 44 */            int i3 = R$attr.state_collapsible;
/* 46 */            if (!z) {
/* 49 */                i3 = -i3;
                    }
/* 51 */            iArr[2] = i3;
/* 66 */            iArr[3] = (z && this.f4320V) ? R$attr.state_collapsed : -R$attr.state_collapsed;
/* 68 */            return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             WeakReference weakReference = this.f4325b0;
/* 6 */             if (weakReference != null) {
/* 8 */                 weakReference.clear();
                    }
/* 12 */            this.f4325b0 = null;
                }

                @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             WeakHashMap weakHashMap = e33.f7494a;
/* 10 */            boolean z2 = true;
/* 12 */            if (getFitsSystemWindows() && getChildCount() > 0) {
/* 20 */                View childAt = getChildAt(0);
/* 30 */                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
/* 38 */                    int topInset = getTopInset();
/* 47 */                    for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
/* 53 */                        getChildAt(childCount).offsetTopAndBottom(topInset);
                            }
                        }
                    }
/* 59 */            m2204b();
/* 62 */            this.f4330e = false;
/* 64 */            int childCount2 = getChildCount();
/* 69 */            for (int i5 = 0; i5 < childCount2; i5++) {
/* 83 */                if (((LayoutParams) getChildAt(i5).getLayoutParams()).f4351c != null) {
/* 85 */                    this.f4330e = true;
                            break;
                        }
                    }
/* 91 */            Drawable drawable = this.f4333f0;
/* 93 */            if (drawable != null) {
/* 103 */               drawable.setBounds(0, 0, getWidth(), getTopInset());
                    }
/* 108 */           if (this.f4337w) {
/* 155 */               return;
                    }
/* 112 */           if (!this.f4321W) {
/* 114 */               int childCount3 = getChildCount();
/* 118 */               int i6 = 0;
                        while (true) {
/* 119 */                   if (i6 >= childCount3) {
/* 145 */                       z2 = false;
                                break;
                            }
/* 131 */                   int i7 = ((LayoutParams) getChildAt(i6).getLayoutParams()).f4349a;
/* 135 */                   if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                                break;
                            } else {
/* 142 */                       i6++;
                            }
                        }
                    }
/* 148 */           if (this.f4319U != z2) {
/* 150 */               this.f4319U = z2;
/* 152 */               refreshDrawableState();
                    }
                }

                @Override // android.widget.LinearLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 4 */             int mode = View.MeasureSpec.getMode(i2);
/* 10 */            if (mode != 1073741824) {
/* 12 */                WeakHashMap weakHashMap = e33.f7494a;
/* 18 */                if (getFitsSystemWindows() && getChildCount() > 0) {
/* 27 */                    View childAt = getChildAt(0);
/* 37 */                    if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
/* 45 */                        int measuredHeight = getMeasuredHeight();
/* 51 */                        if (mode == Integer.MIN_VALUE) {
/* 75 */                            measuredHeight = qj3.m7892c(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                                } else if (mode == 0) {
/* 60 */                            measuredHeight += getTopInset();
                                }
/* 83 */                        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                            }
                        }
                    }
/* 86 */            m2204b();
                }

                @Override // android.view.View
                public void setElevation(float f) {
/* 1 */             super.setElevation(f);
/* 4 */             he3.m4190m(this, f);
                }

                public void setExpanded(boolean z) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 8 */             m2206d(z, isLaidOut(), true);
                }

                public void setLiftOnScroll(boolean z) {
/* 1 */             this.f4321W = z;
                }

                public void setLiftOnScrollTargetViewId(int i) {
/* 1 */             this.f4323a0 = i;
/* 3 */             WeakReference weakReference = this.f4325b0;
/* 5 */             if (weakReference != null) {
/* 7 */                 weakReference.clear();
                    }
/* 11 */            this.f4325b0 = null;
                }

                public void setLiftableOverrideEnabled(boolean z) {
/* 1 */             this.f4337w = z;
                }

                @Override // android.widget.LinearLayout
                public void setOrientation(int i) {
/* 2 */             if (i == 1) {
/* 4 */                 super.setOrientation(i);
                    } else {
/* 10 */                C1951n4.m6859j("AppBarLayout is always vertical and does not support horizontal orientation");
                    }
                }

                public void setStatusBarForeground(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.f4333f0;
/* 3 */             if (drawable2 != drawable) {
/* 6 */                 if (drawable2 != null) {
/* 8 */                     drawable2.setCallback(null);
                        }
/* 13 */                Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
/* 17 */                this.f4333f0 = drawableMutate;
/* 20 */                boolean z = false;
/* 21 */                if (drawableMutate != null) {
/* 27 */                    if (drawableMutate.isStateful()) {
/* 35 */                        this.f4333f0.setState(getDrawableState());
                            }
/* 38 */                    Drawable drawable3 = this.f4333f0;
/* 40 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 46 */                    t90.m8739b(drawable3, getLayoutDirection());
/* 60 */                    this.f4333f0.setVisible(getVisibility() == 0, false);
/* 65 */                    this.f4333f0.setCallback(this);
                        }
/* 70 */                if (this.f4333f0 != null && getTopInset() > 0) {
/* 78 */                    z = true;
                        }
/* 80 */                setWillNotDraw(true ^ z);
/* 83 */                WeakHashMap weakHashMap2 = e33.f7494a;
/* 85 */                postInvalidateOnAnimation();
                    }
                }

                public void setStatusBarForegroundColor(int i) {
/* 6 */             setStatusBarForeground(new ColorDrawable(i));
                }

                public void setStatusBarForegroundResource(int i) {
/* 9 */             setStatusBarForeground(mn0.m6700p(getContext(), i));
                }

                @Deprecated
                public void setTargetElevation(float f) {
/* 1 */             jb1.m5736B(this, f);
                }

                @Override // android.view.View
                public void setVisibility(int i) {
/* 1 */             super.setVisibility(i);
/* 9 */             boolean z = i == 0;
/* 10 */            Drawable drawable = this.f4333f0;
/* 12 */            if (drawable != null) {
/* 14 */                drawable.setVisible(z, false);
                    }
                }

                @Override // android.view.View
                public final boolean verifyDrawable(Drawable drawable) {
                    return super.verifyDrawable(drawable) || drawable == this.f4333f0;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 3 */         public static class Behavior extends BaseBehavior<AppBarLayout> {
                    public Behavior() {
                    }

/* 4 */             public Behavior(Context context, AttributeSet attributeSet) {
/* 5 */                 super(context, attributeSet);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 8 */         public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

                    /* JADX INFO: renamed from: j */
                    public int f4338j;

                    /* JADX INFO: renamed from: k */
                    public int f4339k;

                    /* JADX INFO: renamed from: l */
                    public ValueAnimator f4340l;

                    /* JADX INFO: renamed from: m */
                    public SavedState f4341m;

                    /* JADX INFO: renamed from: n */
                    public WeakReference f4342n;

                    /* JADX INFO: renamed from: o */
                    public boolean f4343o;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class SavedState extends AbsSavedState {
                        public static final Parcelable.Creator<SavedState> CREATOR = new C0337e();

                        /* JADX INFO: renamed from: c */
                        public boolean f4344c;

                        /* JADX INFO: renamed from: d */
                        public boolean f4345d;

                        /* JADX INFO: renamed from: e */
                        public int f4346e;

                        /* JADX INFO: renamed from: f */
                        public float f4347f;

                        /* JADX INFO: renamed from: i */
                        public boolean f4348i;

                        public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */                     super(parcel, classLoader);
/* 15 */                    this.f4344c = parcel.readByte() != 0;
/* 26 */                    this.f4345d = parcel.readByte() != 0;
/* 32 */                    this.f4346e = parcel.readInt();
/* 38 */                    this.f4347f = parcel.readFloat();
/* 47 */                    this.f4348i = parcel.readByte() != 0;
                        }

                        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                        public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                     super.writeToParcel(parcel, i);
/* 7 */                     parcel.writeByte(this.f4344c ? (byte) 1 : (byte) 0);
/* 13 */                    parcel.writeByte(this.f4345d ? (byte) 1 : (byte) 0);
/* 18 */                    parcel.writeInt(this.f4346e);
/* 23 */                    parcel.writeFloat(this.f4347f);
/* 29 */                    parcel.writeByte(this.f4348i ? (byte) 1 : (byte) 0);
                        }
                    }

                    public BaseBehavior() {
/* 5 */                 this.f4387f = -1;
/* 7 */                 this.f4389h = -1;
                    }

                    /* JADX INFO: renamed from: D */
                    public static View m2209D(CoordinatorLayout coordinatorLayout) {
/* 1 */                 int childCount = coordinatorLayout.getChildCount();
/* 6 */                 for (int i = 0; i < childCount; i++) {
/* 8 */                     View childAt = coordinatorLayout.getChildAt(i);
/* 14 */                    if ((childAt instanceof nm1) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
/* 28 */                        return childAt;
                            }
                        }
/* 29 */                return null;
                    }

                    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
                    /* JADX INFO: renamed from: I */
                    public static void m2210I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
                        View childAt;
                        boolean zM2208f;
/* 1 */                 int iAbs = Math.abs(i);
/* 5 */                 int childCount = appBarLayout.getChildCount();
/* 10 */                int i3 = 0;
                        while (true) {
/* 12 */                    if (i3 >= childCount) {
/* 34 */                        childAt = null;
                                break;
                            }
/* 14 */                    childAt = appBarLayout.getChildAt(i3);
/* 22 */                    if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                                break;
                            } else {
/* 31 */                        i3++;
                            }
                        }
/* 35 */                if (childAt != null) {
/* 43 */                    int i4 = ((LayoutParams) childAt.getLayoutParams()).f4349a;
/* 47 */                    if ((i4 & 1) != 0) {
/* 49 */                        WeakHashMap weakHashMap = e33.f7494a;
/* 51 */                        int minimumHeight = childAt.getMinimumHeight();
/* 55 */                        zM2208f = true;
/* 56 */                        if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
/* 94 */                            zM2208f = false;
                                }
                            } else {
/* 94 */                        zM2208f = false;
                            }
                        } else {
/* 94 */                    zM2208f = false;
                        }
/* 97 */                if (appBarLayout.f4321W) {
/* 103 */                   zM2208f = appBarLayout.m2208f(m2209D(coordinatorLayout));
                        }
/* 107 */               boolean zM2207e = appBarLayout.m2207e(zM2208f);
/* 111 */               if (!z) {
/* 113 */                   if (zM2207e) {
/* 125 */                       List list = (List) ((le2) coordinatorLayout.f1203b.f15956b).getOrDefault(appBarLayout, null);
/* 127 */                       ArrayList arrayList = coordinatorLayout.f1207d;
/* 129 */                       arrayList.clear();
/* 132 */                       if (list != null) {
/* 134 */                           arrayList.addAll(list);
                                }
/* 137 */                       int size = arrayList.size();
/* 141 */                       for (int i5 = 0; i5 < size; i5++) {
/* 155 */                           CoordinatorLayout.Behavior behavior = ((C0080c) ((View) arrayList.get(i5)).getLayoutParams()).f1218a;
/* 159 */                           if (behavior instanceof ScrollingViewBehavior) {
/* 165 */                               if (((ScrollingViewBehavior) behavior).f4394f == 0) {
/* 171 */                                   return;
                                        }
                                    }
                                }
/* 171 */                       return;
                            }
/* 171 */                   return;
                        }
/* 172 */               appBarLayout.jumpDrawablesToCurrentState();
                    }

                    @Override // com.google.android.material.appbar.HeaderBehavior
                    /* JADX INFO: renamed from: A */
                    public final int mo2211A(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
                        int top;
                        int topInset;
/* 9 */                 AppBarLayout appBarLayout = (AppBarLayout) view;
/* 11 */                int iMo2217t = mo2217t();
/* 15 */                int i4 = 0;
/* 16 */                if (i2 == 0 || iMo2217t < i2 || iMo2217t > i3) {
/* 328 */                   this.f4338j = 0;
                        } else {
/* 24 */                    int iM7892c = qj3.m7892c(i, i2, i3);
/* 28 */                    if (iMo2217t != iM7892c) {
/* 32 */                        if (!appBarLayout.f4330e) {
/* 146 */                           top = iM7892c;
                                    break;
                                }
/* 34 */                        int iAbs = Math.abs(iM7892c);
/* 38 */                        int childCount = appBarLayout.getChildCount();
/* 42 */                        int i5 = 0;
                                while (true) {
/* 43 */                            if (i5 < childCount) {
/* 45 */                                View childAt = appBarLayout.getChildAt(i5);
/* 53 */                                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 55 */                                Interpolator interpolator = layoutParams.f4351c;
/* 61 */                                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
/* 143 */                                   i5++;
                                        } else if (interpolator != null) {
/* 71 */                                    int i6 = layoutParams.f4349a;
/* 75 */                                    if ((i6 & 1) != 0) {
/* 86 */                                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
/* 89 */                                        if ((i6 & 2) != 0) {
/* 91 */                                            WeakHashMap weakHashMap = e33.f7494a;
/* 97 */                                            topInset -= childAt.getMinimumHeight();
                                                }
                                            } else {
/* 99 */                                        topInset = 0;
                                            }
/* 100 */                                   WeakHashMap weakHashMap2 = e33.f7494a;
/* 106 */                                   if (childAt.getFitsSystemWindows()) {
/* 112 */                                       topInset -= appBarLayout.getTopInset();
                                            }
/* 113 */                                   if (topInset > 0) {
                                                float f = topInset;
/* 141 */                                       top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iM7892c);
                                                break;
                                            }
                                        }
                                    }
/* 146 */                           top = iM7892c;
                                    break;
                                }
/* 147 */                       boolean zM2235v = m2235v(top);
/* 151 */                       int i7 = iMo2217t - iM7892c;
/* 155 */                       this.f4338j = iM7892c - top;
/* 158 */                       if (zM2235v) {
/* 165 */                           for (int i8 = 0; i8 < appBarLayout.getChildCount(); i8++) {
/* 175 */                               LayoutParams layoutParams2 = (LayoutParams) appBarLayout.getChildAt(i8).getLayoutParams();
/* 177 */                               C0210cb c0210cb = layoutParams2.f4350b;
/* 179 */                               if (c0210cb != null && (layoutParams2.f4349a & 1) != 0) {
/* 186 */                                   View childAt2 = appBarLayout.getChildAt(i8);
/* 190 */                                   float fM2234s = m2234s();
/* 197 */                                   Rect rect = (Rect) c0210cb.f2805c;
/* 201 */                                   Rect rect2 = (Rect) c0210cb.f2804b;
/* 203 */                                   childAt2.getDrawingRect(rect2);
/* 206 */                                   appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
/* 214 */                                   rect2.offset(0, -appBarLayout.getTopInset());
/* 224 */                                   float fAbs = rect2.top - Math.abs(fM2234s);
/* 228 */                                   if (fAbs <= 0.0f) {
/* 237 */                                       float fAbs2 = Math.abs(fAbs / rect2.height());
/* 257 */                                       float f2 = 1.0f - (fAbs2 >= 0.0f ? fAbs2 > 1.0f ? 1.0f : fAbs2 : 0.0f);
/* 273 */                                       float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (f2 * f2)));
/* 274 */                                       childAt2.setTranslationY(fHeight);
/* 277 */                                       childAt2.getDrawingRect(rect);
/* 282 */                                       rect.offset(0, (int) (-fHeight));
/* 285 */                                       WeakHashMap weakHashMap3 = e33.f7494a;
/* 287 */                                       childAt2.setClipBounds(rect);
                                            } else {
/* 291 */                                       WeakHashMap weakHashMap4 = e33.f7494a;
/* 294 */                                       childAt2.setClipBounds(null);
/* 297 */                                       childAt2.setTranslationY(0.0f);
                                            }
                                        }
                                    }
                                }
/* 304 */                       if (!zM2235v && appBarLayout.f4330e) {
/* 310 */                           coordinatorLayout.m550g(appBarLayout);
                                }
/* 317 */                       appBarLayout.m2205c(m2234s());
/* 323 */                       m2210I(coordinatorLayout, appBarLayout, iM7892c, iM7892c < iMo2217t ? -1 : 1, false);
/* 326 */                       i4 = i7;
                            }
                        }
/* 330 */               m2216H(coordinatorLayout, appBarLayout);
/* 333 */               return i4;
                    }

                    /* JADX INFO: renamed from: C */
                    public final void m2212C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
/* 6 */                 int iAbs = Math.abs(mo2217t() - i);
/* 11 */                float fAbs = Math.abs(0.0f);
/* 44 */                int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
/* 45 */                int iMo2217t = mo2217t();
/* 49 */                ValueAnimator valueAnimator = this.f4340l;
/* 51 */                if (iMo2217t == i) {
/* 53 */                    if (valueAnimator == null || !valueAnimator.isRunning()) {
/* 66 */                        return;
                            }
/* 63 */                    this.f4340l.cancel();
/* 66 */                    return;
                        }
/* 67 */                if (valueAnimator == null) {
/* 71 */                    ValueAnimator valueAnimator2 = new ValueAnimator();
/* 74 */                    this.f4340l = valueAnimator2;
/* 78 */                    valueAnimator2.setInterpolator(AbstractC2246u8.f17414e);
/* 88 */                    this.f4340l.addUpdateListener(new C0333a(this, coordinatorLayout, appBarLayout));
                        } else {
/* 92 */                    valueAnimator.cancel();
                        }
/* 104 */               this.f4340l.setDuration(Math.min(iRound, 600));
/* 113 */               this.f4340l.setIntValues(iMo2217t, i);
/* 118 */               this.f4340l.start();
                    }

                    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
                    /* JADX INFO: renamed from: E */
                    public final void m2213E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
                        AppBarLayout appBarLayout2;
                        int i2;
                        int downNestedPreScrollRange;
/* 1 */                 if (i == 0) {
/* 44 */                    appBarLayout2 = appBarLayout;
                        } else {
/* 3 */                     if (i < 0) {
/* 9 */                         i2 = -appBarLayout.getTotalScrollRange();
/* 14 */                        downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                            } else {
/* 22 */                        i2 = -appBarLayout.getUpNestedPreScrollRange();
/* 23 */                        downNestedPreScrollRange = 0;
                            }
/* 15 */                    int i3 = i2;
/* 16 */                    int i4 = downNestedPreScrollRange;
/* 25 */                    if (i3 != i4) {
/* 35 */                        appBarLayout2 = appBarLayout;
/* 41 */                        iArr[1] = mo2211A(coordinatorLayout, appBarLayout2, mo2217t() - i, i3, i4);
                            } else {
/* 44 */                        appBarLayout2 = appBarLayout;
                            }
                        }
/* 47 */                if (appBarLayout2.f4321W) {
/* 53 */                    appBarLayout2.m2207e(appBarLayout2.m2208f(view));
                        }
                    }

                    /* JADX INFO: renamed from: F */
                    public final SavedState m2214F(Parcelable parcelable, AppBarLayout appBarLayout) {
/* 1 */                 int iM2234s = m2234s();
/* 5 */                 int childCount = appBarLayout.getChildCount();
/* 11 */                for (int i = 0; i < childCount; i++) {
/* 13 */                    View childAt = appBarLayout.getChildAt(i);
/* 21 */                    int bottom = childAt.getBottom() + iM2234s;
/* 27 */                    if (childAt.getTop() + iM2234s <= 0 && bottom >= 0) {
/* 33 */                        if (parcelable == null) {
/* 35 */                            parcelable = AbsSavedState.f1291b;
                                }
/* 37 */                        SavedState savedState = new SavedState(parcelable);
/* 45 */                        boolean z = iM2234s == 0;
/* 46 */                        savedState.f4345d = z;
/* 60 */                        savedState.f4344c = !z && (-iM2234s) >= appBarLayout.getTotalScrollRange();
/* 62 */                        savedState.f4346e = i;
/* 64 */                        WeakHashMap weakHashMap = e33.f7494a;
/* 78 */                        savedState.f4348i = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
/* 87 */                        savedState.f4347f = bottom / childAt.getHeight();
/* 89 */                        return savedState;
                            }
                        }
/* 93 */                return null;
                    }

                    /* JADX INFO: renamed from: G */
                    public final void m2215G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
/* 9 */                 int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
/* 14 */                int iMo2217t = mo2217t() - paddingTop;
/* 15 */                int childCount = appBarLayout.getChildCount();
/* 20 */                int i = 0;
                        while (true) {
/* 23 */                    if (i >= childCount) {
/* 63 */                        i = -1;
                                break;
                            }
/* 25 */                    View childAt = appBarLayout.getChildAt(i);
/* 29 */                    int top = childAt.getTop();
/* 33 */                    int bottom = childAt.getBottom();
/* 41 */                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 46 */                    if ((layoutParams.f4349a & 32) == 32) {
/* 50 */                        top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
/* 53 */                        bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            }
/* 54 */                    int i2 = -iMo2217t;
/* 55 */                    if (top <= i2 && bottom >= i2) {
                                break;
                            } else {
/* 60 */                        i++;
                            }
                        }
/* 64 */                if (i >= 0) {
/* 66 */                    View childAt2 = appBarLayout.getChildAt(i);
/* 74 */                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
/* 76 */                    int i3 = layoutParams2.f4349a;
/* 82 */                    if ((i3 & 17) == 17) {
/* 88 */                        int topInset = -childAt2.getTop();
/* 93 */                        int minimumHeight = -childAt2.getBottom();
/* 94 */                        if (i == 0) {
/* 96 */                            WeakHashMap weakHashMap = e33.f7494a;
/* 102 */                           if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
/* 114 */                               topInset -= appBarLayout.getTopInset();
                                    }
                                }
/* 118 */                       if ((i3 & 2) == 2) {
/* 120 */                           WeakHashMap weakHashMap2 = e33.f7494a;
/* 126 */                           minimumHeight += childAt2.getMinimumHeight();
                                } else if ((i3 & 5) == 5) {
/* 133 */                           WeakHashMap weakHashMap3 = e33.f7494a;
/* 139 */                           int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
/* 140 */                           if (iMo2217t < minimumHeight2) {
/* 142 */                               topInset = minimumHeight2;
                                    } else {
/* 144 */                               minimumHeight = minimumHeight2;
                                    }
                                }
/* 147 */                       if ((i3 & 32) == 32) {
/* 151 */                           topInset += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
/* 154 */                           minimumHeight -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                                }
/* 158 */                       if (iMo2217t < (minimumHeight + topInset) / 2) {
/* 160 */                           topInset = minimumHeight;
                                }
/* 171 */                       m2212C(coordinatorLayout, appBarLayout, qj3.m7892c(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                            }
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
                    /* JADX INFO: renamed from: H */
                    public final void m2216H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                        View childAt;
                        BaseBehavior<T> baseBehavior;
/* 7 */                 e33.m3315k(C2518z0.f19875h.m10230a(), coordinatorLayout);
/* 10 */                boolean z = false;
/* 11 */                e33.m3311g(0, coordinatorLayout);
/* 20 */                e33.m3315k(C2518z0.f19876i.m10230a(), coordinatorLayout);
/* 23 */                e33.m3311g(0, coordinatorLayout);
/* 30 */                if (appBarLayout.getTotalScrollRange() == 0) {
/* 187 */                   return;
                        }
/* 34 */                int childCount = coordinatorLayout.getChildCount();
/* 38 */                int i = 0;
                        while (true) {
/* 39 */                    if (i >= childCount) {
/* 62 */                        childAt = null;
                                break;
                            }
/* 41 */                    childAt = coordinatorLayout.getChildAt(i);
/* 55 */                    if (((C0080c) childAt.getLayoutParams()).f1218a instanceof ScrollingViewBehavior) {
                                break;
                            } else {
/* 59 */                        i++;
                            }
                        }
/* 57 */                View view = childAt;
/* 64 */                if (view == null) {
/* 187 */                   return;
                        }
/* 68 */                int childCount2 = appBarLayout.getChildCount();
/* 73 */                for (int i2 = 0; i2 < childCount2; i2++) {
/* 87 */                    if (((LayoutParams) appBarLayout.getChildAt(i2).getLayoutParams()).f4349a != 0) {
/* 93 */                        if (e33.m3308d(coordinatorLayout) == null) {
/* 101 */                           e33.m3318n(coordinatorLayout, new C0334b(this));
                                }
/* 113 */                       boolean z2 = true;
/* 114 */                       if (mo2217t() != (-appBarLayout.getTotalScrollRange())) {
/* 123 */                           e33.m3316l(coordinatorLayout, C2518z0.f19875h, new C0336d(appBarLayout, false));
/* 126 */                           z = true;
                                }
/* 131 */                       if (mo2217t() == 0) {
/* 161 */                           baseBehavior = this;
/* 177 */                           z2 = z;
                                } else if (view.canScrollVertically(-1)) {
/* 144 */                           int i3 = -appBarLayout.getDownNestedPreScrollRange();
/* 145 */                           if (i3 != 0) {
/* 151 */                               baseBehavior = this;
/* 157 */                               e33.m3316l(coordinatorLayout, C2518z0.f19876i, new C0335c(baseBehavior, coordinatorLayout, appBarLayout, view, i3));
                                    } else {
/* 161 */                               baseBehavior = this;
/* 177 */                               z2 = z;
                                    }
                                } else {
/* 163 */                           baseBehavior = this;
/* 173 */                           e33.m3316l(coordinatorLayout, C2518z0.f19876i, new C0336d(appBarLayout, true));
                                }
/* 178 */                       baseBehavior.f4343o = z2;
/* 180 */                       return;
                            }
                        }
                    }

                    @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: h */
                    public final boolean mo570h(CoordinatorLayout coordinatorLayout, View view, int i) {
                        int iRound;
/* 1 */                 AppBarLayout appBarLayout = (AppBarLayout) view;
/* 3 */                 super.mo570h(coordinatorLayout, appBarLayout, i);
/* 6 */                 int pendingAction = appBarLayout.getPendingAction();
/* 10 */                SavedState savedState = this.f4341m;
/* 14 */                if (savedState == null || (pendingAction & 8) != 0) {
/* 91 */                    if (pendingAction != 0) {
/* 99 */                        boolean z = (pendingAction & 4) != 0;
/* 102 */                       if ((pendingAction & 2) != 0) {
/* 108 */                           int i2 = -appBarLayout.getUpNestedPreScrollRange();
/* 109 */                           if (z) {
/* 111 */                               m2212C(coordinatorLayout, appBarLayout, i2);
                                    } else {
/* 115 */                               m2231B(coordinatorLayout, appBarLayout, i2);
                                    }
                                } else if ((pendingAction & 1) != 0) {
/* 122 */                           if (z) {
/* 124 */                               m2212C(coordinatorLayout, appBarLayout, 0);
                                    } else {
/* 128 */                               m2231B(coordinatorLayout, appBarLayout, 0);
                                    }
                                }
                            }
                        } else if (savedState.f4344c) {
/* 29 */                    m2231B(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
                        } else if (savedState.f4345d) {
/* 37 */                    m2231B(coordinatorLayout, appBarLayout, 0);
                        } else {
/* 43 */                    View childAt = appBarLayout.getChildAt(savedState.f4346e);
/* 51 */                    int i3 = -childAt.getBottom();
/* 56 */                    if (this.f4341m.f4348i) {
/* 58 */                        WeakHashMap weakHashMap = e33.f7494a;
/* 69 */                        iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                            } else {
/* 85 */                        iRound = Math.round(childAt.getHeight() * this.f4341m.f4347f) + i3;
                            }
/* 87 */                    m2231B(coordinatorLayout, appBarLayout, iRound);
                        }
/* 131 */               appBarLayout.f4332f = 0;
/* 134 */               this.f4341m = null;
/* 149 */               m2235v(qj3.m7892c(m2234s(), -appBarLayout.getTotalScrollRange(), 0));
/* 156 */               m2210I(coordinatorLayout, appBarLayout, m2234s(), 0, true);
/* 163 */               appBarLayout.m2205c(m2234s());
/* 166 */               m2216H(coordinatorLayout, appBarLayout);
/* 13 */                return true;
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: i */
                    public final boolean mo571i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
/* 1 */                 AppBarLayout appBarLayout = (AppBarLayout) view;
/* 13 */                if (((ViewGroup.MarginLayoutParams) ((C0080c) appBarLayout.getLayoutParams())).height != -2) {
/* 12 */                    return false;
                        }
/* 19 */                coordinatorLayout.m558q(i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
/* 22 */                return true;
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: k */
                    public final /* bridge */ /* synthetic */ void mo573k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
/* 5 */                 m2213E(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: l */
                    public final void mo574l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
                        BaseBehavior<T> baseBehavior;
                        CoordinatorLayout coordinatorLayout2;
/* 2 */                 AppBarLayout appBarLayout = (AppBarLayout) view;
/* 4 */                 if (i3 < 0) {
/* 18 */                    baseBehavior = this;
/* 19 */                    coordinatorLayout2 = coordinatorLayout;
/* 25 */                    iArr[1] = baseBehavior.mo2211A(coordinatorLayout2, appBarLayout, mo2217t() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
                        } else {
/* 28 */                    baseBehavior = this;
/* 29 */                    coordinatorLayout2 = coordinatorLayout;
                        }
/* 30 */                if (i3 == 0) {
/* 32 */                    baseBehavior.m2216H(coordinatorLayout2, appBarLayout);
                        }
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: n */
                    public final void mo576n(View view, Parcelable parcelable) {
/* 5 */                 if (parcelable instanceof SavedState) {
/* 9 */                     this.f4341m = (SavedState) parcelable;
                        } else {
/* 13 */                    this.f4341m = null;
                        }
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: o */
                    public final Parcelable mo577o(View view) {
/* 3 */                 android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
/* 5 */                 SavedState savedStateM2214F = m2214F(absSavedState, (AppBarLayout) view);
                        return savedStateM2214F == null ? absSavedState : savedStateM2214F;
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: p */
                    public final boolean mo578p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
                        ValueAnimator valueAnimator;
/* 1 */                 AppBarLayout appBarLayout = (AppBarLayout) view;
/* 34 */                boolean z = (i & 2) != 0 && (appBarLayout.f4321W || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
/* 35 */                if (z && (valueAnimator = this.f4340l) != null) {
/* 41 */                    valueAnimator.cancel();
                        }
/* 45 */                this.f4342n = null;
/* 47 */                this.f4339k = i2;
/* 49 */                return z;
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: q */
                    public final void mo579q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
/* 1 */                 AppBarLayout appBarLayout = (AppBarLayout) view;
/* 5 */                 if (this.f4339k == 0 || i == 1) {
/* 10 */                    m2215G(coordinatorLayout, appBarLayout);
/* 15 */                    if (appBarLayout.f4321W) {
/* 21 */                        appBarLayout.m2207e(appBarLayout.m2208f(view2));
                            }
                        }
/* 29 */                this.f4342n = new WeakReference(view2);
                    }

                    @Override // com.google.android.material.appbar.ViewOffsetBehavior
                    /* JADX INFO: renamed from: t */
                    public final int mo2217t() {
/* 7 */                 return m2234s() + this.f4338j;
                    }

                    @Override // com.google.android.material.appbar.HeaderBehavior
                    /* JADX INFO: renamed from: w */
                    public final boolean mo2218w(View view) {
/* 3 */                 WeakReference weakReference = this.f4342n;
/* 5 */                 if (weakReference == null) {
/* 31 */                    return true;
                        }
/* 11 */                View view2 = (View) weakReference.get();
                        return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
                    }

                    @Override // com.google.android.material.appbar.HeaderBehavior
                    /* JADX INFO: renamed from: x */
                    public final int mo2219x(View view) {
/* 7 */                 return -((AppBarLayout) view).getDownNestedScrollRange();
                    }

                    @Override // com.google.android.material.appbar.HeaderBehavior
                    /* JADX INFO: renamed from: y */
                    public final int mo2220y(View view) {
/* 3 */                 return ((AppBarLayout) view).getTotalScrollRange();
                    }

                    @Override // com.google.android.material.appbar.HeaderBehavior
                    /* JADX INFO: renamed from: z */
                    public final void mo2221z(CoordinatorLayout coordinatorLayout, View view) {
/* 1 */                 AppBarLayout appBarLayout = (AppBarLayout) view;
/* 3 */                 m2215G(coordinatorLayout, appBarLayout);
/* 8 */                 if (appBarLayout.f4321W) {
/* 18 */                    appBarLayout.m2207e(appBarLayout.m2208f(m2209D(coordinatorLayout)));
                        }
                    }

/* 9 */             public BaseBehavior(Context context, AttributeSet attributeSet) {
/* 10 */                super(context, attributeSet);
                    }
                }

                @Override // android.widget.LinearLayout, android.view.ViewGroup
/* 10 */        public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 11 */            return m2203a(layoutParams);
                }

                @Override // android.widget.LinearLayout, android.view.ViewGroup
/* 11 */        public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
/* 13 */            LayoutParams layoutParams = new LayoutParams(-1, -2);
/* 14 */            layoutParams.f4349a = 1;
                    return layoutParams;
                }

                @Override // android.widget.LinearLayout, android.view.ViewGroup
/* 11 */        public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 12 */            return m2203a(layoutParams);
                }

                @Override // android.widget.LinearLayout, android.view.ViewGroup
/* 12 */        public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 13 */            return new LayoutParams(getContext(), attributeSet);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 21 */        public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
                    public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 6 */                 TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollingViewBehavior_Layout);
/* 17 */                this.f4394f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
/* 19 */                typedArrayObtainStyledAttributes.recycle();
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: b */
                    public final boolean mo564b(View view, View view2) {
/* 1 */                 return view2 instanceof AppBarLayout;
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: d */
                    public final boolean mo566d(CoordinatorLayout coordinatorLayout, View view, View view2) {
                        int iM7892c;
/* 7 */                 CoordinatorLayout.Behavior behavior = ((C0080c) view2.getLayoutParams()).f1218a;
/* 12 */                if (behavior instanceof BaseBehavior) {
/* 30 */                    int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f4338j + this.f4393e;
/* 33 */                    if (this.f4394f == 0) {
/* 35 */                        iM7892c = 0;
                            } else {
/* 37 */                        float fMo2223x = mo2223x(view2);
/* 41 */                        int i = this.f4394f;
/* 46 */                        iM7892c = qj3.m7892c((int) (fMo2223x * i), 0, i);
                            }
/* 50 */                    int i2 = bottom - iM7892c;
/* 51 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 53 */                    view.offsetTopAndBottom(i2);
                        }
/* 58 */                if (view2 instanceof AppBarLayout) {
/* 60 */                    AppBarLayout appBarLayout = (AppBarLayout) view2;
/* 64 */                    if (appBarLayout.f4321W) {
/* 70 */                        appBarLayout.m2207e(appBarLayout.m2208f(view));
                            }
                        }
/* 11 */                return false;
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: e */
                    public final void mo567e(CoordinatorLayout coordinatorLayout, View view) {
/* 3 */                 if (view instanceof AppBarLayout) {
/* 11 */                    e33.m3315k(C2518z0.f19875h.m10230a(), coordinatorLayout);
/* 15 */                    e33.m3311g(0, coordinatorLayout);
/* 24 */                    e33.m3315k(C2518z0.f19876i.m10230a(), coordinatorLayout);
/* 27 */                    e33.m3311g(0, coordinatorLayout);
/* 31 */                    e33.m3318n(coordinatorLayout, null);
                        }
                    }

                    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    /* JADX INFO: renamed from: m */
                    public final boolean mo575m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
                        AppBarLayout appBarLayout;
/* 1 */                 ArrayList arrayListM552i = coordinatorLayout.m552i(view);
/* 5 */                 int size = arrayListM552i.size();
/* 10 */                int i = 0;
                        while (true) {
/* 11 */                    if (i >= size) {
/* 29 */                        appBarLayout = null;
                                break;
                            }
/* 17 */                    View view2 = (View) arrayListM552i.get(i);
/* 21 */                    if (view2 instanceof AppBarLayout) {
/* 23 */                        appBarLayout = (AppBarLayout) view2;
                                break;
                            }
/* 26 */                    i++;
                        }
/* 30 */                if (appBarLayout != null) {
/* 40 */                    rect.offset(view.getLeft(), view.getTop());
/* 43 */                    int width = coordinatorLayout.getWidth();
/* 47 */                    int height = coordinatorLayout.getHeight();
/* 51 */                    Rect rect2 = this.f4391c;
/* 53 */                    rect2.set(0, 0, width, height);
/* 60 */                    if (!rect2.contains(rect)) {
/* 65 */                        appBarLayout.m2206d(false, !z, true);
/* 62 */                        return true;
                            }
                        }
/* 9 */                 return false;
                    }

                    @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
                    /* JADX INFO: renamed from: w */
                    public final AppBarLayout mo2222w(ArrayList arrayList) {
/* 1 */                 int size = arrayList.size();
/* 6 */                 for (int i = 0; i < size; i++) {
/* 12 */                    View view = (View) arrayList.get(i);
/* 16 */                    if (view instanceof AppBarLayout) {
/* 18 */                        return (AppBarLayout) view;
                            }
                        }
/* 24 */                return null;
                    }

                    @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
                    /* JADX INFO: renamed from: x */
                    public final float mo2223x(View view) {
                        int i;
/* 4 */                 if (view instanceof AppBarLayout) {
/* 6 */                     AppBarLayout appBarLayout = (AppBarLayout) view;
/* 8 */                     int totalScrollRange = appBarLayout.getTotalScrollRange();
/* 12 */                    int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
/* 22 */                    CoordinatorLayout.Behavior behavior = ((C0080c) appBarLayout.getLayoutParams()).f1218a;
/* 35 */                    int iMo2217t = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).mo2217t() : 0;
/* 36 */                    if ((downNestedPreScrollRange == 0 || totalScrollRange + iMo2217t > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
/* 51 */                        return (iMo2217t / i) + 1.0f;
                            }
                        }
/* 3 */                 return 0.0f;
                    }

                    @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
                    /* JADX INFO: renamed from: y */
                    public final int mo2224y(View view) {
                        return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
                    }

/* 22 */            public ScrollingViewBehavior() {
                    }
                }

/* 259 */       public AppBarLayout(Context context, AttributeSet attributeSet) {
/* 260 */           this(context, attributeSet, R$attr.appBarLayoutStyle);
                }
            }
