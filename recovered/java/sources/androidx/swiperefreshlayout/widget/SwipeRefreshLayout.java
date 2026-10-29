            package androidx.swiperefreshlayout.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.drawable.ShapeDrawable;
            import android.graphics.drawable.shapes.OvalShape;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.util.DisplayMetrics;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.animation.Animation;
            import android.view.animation.DecelerateInterpolator;
            import android.widget.ListView;
            import androidx.swiperefreshlayout.R$styleable;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.WeakHashMap;
            import p000.C1977nu;
            import p000.C2194su;
            import p000.C2231tu;
            import p000.e33;
            import p000.nm1;
            import p000.om1;
            import p000.pm1;
            import p000.qm1;
            import p000.rm1;
            import p000.s23;
            import p000.v00;
            import p000.vj2;
            import p000.wj2;
            import p000.xj2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public class SwipeRefreshLayout extends ViewGroup implements qm1, pm1, nm1 {
                private static final int ALPHA_ANIMATION_DURATION = 300;
                private static final int ANIMATE_TO_START_DURATION = 200;
                private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
                static final int CIRCLE_DIAMETER = 40;
                static final int CIRCLE_DIAMETER_LARGE = 56;
                private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
                public static final int DEFAULT = 1;
                private static final int DEFAULT_CIRCLE_TARGET = 64;
                public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
                private static final float DRAG_RATE = 0.5f;
                private static final int INVALID_POINTER = -1;
                public static final int LARGE = 0;
                private static final int[] LAYOUT_ATTRS = {R.attr.enabled};
                private static final String LOG_TAG = "SwipeRefreshLayout";
                private static final int MAX_ALPHA = 255;
                private static final float MAX_PROGRESS_ANGLE = 0.8f;
                private static final int SCALE_DOWN_DURATION = 150;
                private static final int STARTING_PROGRESS_ALPHA = 76;
                private int mActivePointerId;
                private Animation mAlphaMaxAnimation;
                private Animation mAlphaStartAnimation;
                private final Animation mAnimateToCorrectPosition;
                private final Animation mAnimateToStartPosition;
                private wj2 mChildScrollUpCallback;
                private int mCircleDiameter;
                C1977nu mCircleView;
                private int mCircleViewIndex;
                int mCurrentTargetOffsetTop;
                int mCustomSlingshotDistance;
                private final DecelerateInterpolator mDecelerateInterpolator;
                private boolean mEnableLegacyRequestDisallowInterceptTouch;
                protected int mFrom;
                private float mInitialDownY;
                private float mInitialMotionY;
                private boolean mIsBeingDragged;
                xj2 mListener;
                private int mMediumAnimationDuration;
                private boolean mNestedScrollInProgress;
                private final om1 mNestedScrollingChildHelper;
                private final rm1 mNestedScrollingParentHelper;
                private final int[] mNestedScrollingV2ConsumedCompat;
                boolean mNotify;
                protected int mOriginalOffsetTop;
                private final int[] mParentOffsetInWindow;
                private final int[] mParentScrollConsumed;
                C2231tu mProgress;
                private Animation.AnimationListener mRefreshListener;
                boolean mRefreshing;
                private boolean mReturningToStart;
                boolean mScale;
                private Animation mScaleAnimation;
                private Animation mScaleDownAnimation;
                private Animation mScaleDownToStartAnimation;
                int mSpinnerOffsetEnd;
                float mStartingScale;
                private View mTarget;
                private float mTotalDragDistance;
                private float mTotalUnconsumed;
                private int mTouchSlop;
                boolean mUsingCustomStart;

                public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.mRefreshing = false;
/* 9 */             this.mTotalDragDistance = -1.0f;
/* 14 */            this.mParentScrollConsumed = new int[2];
/* 18 */            this.mParentOffsetInWindow = new int[2];
/* 22 */            this.mNestedScrollingV2ConsumedCompat = new int[2];
/* 25 */            this.mActivePointerId = -1;
/* 27 */            this.mCircleViewIndex = -1;
/* 34 */            this.mRefreshListener = new AnimationAnimationListenerC0144a(this, 0);
/* 41 */            this.mAnimateToCorrectPosition = new C0146c(this, 0);
/* 48 */            this.mAnimateToStartPosition = new vj2(this, 2);
/* 58 */            this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
/* 71 */            this.mMediumAnimationDuration = getResources().getInteger(R.integer.config_mediumAnimTime);
/* 73 */            setWillNotDraw(false);
/* 83 */            this.mDecelerateInterpolator = new DecelerateInterpolator(DECELERATE_INTERPOLATION_FACTOR);
/* 89 */            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
/* 99 */            this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
/* 107 */           C1977nu c1977nu = new C1977nu(getContext());
/* 122 */           float f = c1977nu.getContext().getResources().getDisplayMetrics().density;
/* 130 */           TypedArray typedArrayObtainStyledAttributes = c1977nu.getContext().obtainStyledAttributes(R$styleable.SwipeRefreshLayout);
/* 143 */           c1977nu.f14455b = typedArrayObtainStyledAttributes.getColor(R$styleable.f1836xaa980688, -328966);
/* 145 */           typedArrayObtainStyledAttributes.recycle();
/* 155 */           ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
/* 161 */           WeakHashMap weakHashMap = e33.f7494a;
/* 163 */           s23.m8381s(c1977nu, f * 4.0f);
/* 172 */           shapeDrawable.getPaint().setColor(c1977nu.f14455b);
/* 175 */           c1977nu.setBackground(shapeDrawable);
/* 178 */           this.mCircleView = c1977nu;
/* 186 */           C2231tu c2231tu = new C2231tu(getContext());
/* 189 */           this.mProgress = c2231tu;
/* 192 */           c2231tu.m8916c(1);
/* 199 */           this.mCircleView.setImageDrawable(this.mProgress);
/* 206 */           this.mCircleView.setVisibility(8);
/* 211 */           addView(this.mCircleView);
/* 214 */           setChildrenDrawingOrderEnabled(true);
/* 222 */           int i = (int) (displayMetrics.density * 64.0f);
/* 223 */           this.mSpinnerOffsetEnd = i;
/* 226 */           this.mTotalDragDistance = i;
/* 233 */           this.mNestedScrollingParentHelper = new rm1();
/* 240 */           this.mNestedScrollingChildHelper = new om1(this);
/* 242 */           setNestedScrollingEnabled(true);
/* 247 */           int i2 = -this.mCircleDiameter;
/* 248 */           this.mCurrentTargetOffsetTop = i2;
/* 250 */           this.mOriginalOffsetTop = i2;
/* 254 */           moveToStart(1.0f);
/* 259 */           TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
/* 267 */           setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
/* 270 */           typedArrayObtainStyledAttributes2.recycle();
                }

                private void setColorViewAlpha(int i) {
/* 7 */             this.mCircleView.getBackground().setAlpha(i);
/* 12 */            this.mProgress.setAlpha(i);
                }

                /* JADX INFO: renamed from: a */
                public final void m1052a() {
/* 3 */             if (this.mTarget == null) {
/* 10 */                for (int i = 0; i < getChildCount(); i++) {
/* 12 */                    View childAt = getChildAt(i);
/* 22 */                    if (!childAt.equals(this.mCircleView)) {
/* 24 */                        this.mTarget = childAt;
/* 26 */                        return;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m1053b(float f) {
/* 6 */             if (f > this.mTotalDragDistance) {
/* 8 */                 m1055d(true, true);
/* 11 */                return;
                    }
/* 13 */            this.mRefreshing = false;
/* 15 */            C2231tu c2231tu = this.mProgress;
/* 17 */            C2194su c2194su = c2231tu.f17264a;
/* 20 */            c2194su.f16784e = 0.0f;
/* 22 */            c2194su.f16785f = 0.0f;
/* 24 */            c2231tu.invalidateSelf();
/* 27 */            boolean z = this.mScale;
/* 37 */            AnimationAnimationListenerC0144a animationAnimationListenerC0144a = !z ? new AnimationAnimationListenerC0144a(this, 1) : null;
/* 38 */            int i = this.mCurrentTargetOffsetTop;
/* 40 */            if (z) {
/* 42 */                this.mFrom = i;
/* 50 */                this.mStartingScale = this.mCircleView.getScaleX();
/* 54 */                C0146c c0146c = new C0146c(this, 1);
/* 57 */                this.mScaleDownToStartAnimation = c0146c;
/* 61 */                c0146c.setDuration(150L);
/* 64 */                if (animationAnimationListenerC0144a != null) {
/* 68 */                    this.mCircleView.f14454a = animationAnimationListenerC0144a;
                        }
/* 72 */                this.mCircleView.clearAnimation();
/* 79 */                this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
                    } else {
/* 83 */                this.mFrom = i;
/* 87 */                this.mAnimateToStartPosition.reset();
/* 94 */                this.mAnimateToStartPosition.setDuration(200L);
/* 101 */               this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
/* 104 */               if (animationAnimationListenerC0144a != null) {
/* 108 */                   this.mCircleView.f14454a = animationAnimationListenerC0144a;
                        }
/* 112 */               this.mCircleView.clearAnimation();
/* 119 */               this.mCircleView.startAnimation(this.mAnimateToStartPosition);
                    }
/* 122 */           C2231tu c2231tu2 = this.mProgress;
/* 124 */           C2194su c2194su2 = c2231tu2.f17264a;
/* 128 */           if (c2194su2.f16793n) {
/* 130 */               c2194su2.f16793n = false;
                    }
/* 132 */           c2231tu2.invalidateSelf();
                }

                /* JADX INFO: renamed from: c */
                public final void m1054c(float f) {
                    float f2;
                    Animation animation;
                    Animation animation2;
/* 1 */             C2231tu c2231tu = this.mProgress;
/* 3 */             C2194su c2194su = c2231tu.f17264a;
/* 8 */             if (!c2194su.f16793n) {
/* 10 */                c2194su.f16793n = true;
                    }
/* 12 */            c2231tu.invalidateSelf();
/* 25 */            float fMin = Math.min(1.0f, Math.abs(f / this.mTotalDragDistance));
/* 48 */            float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
/* 55 */            float fAbs = Math.abs(f) - this.mTotalDragDistance;
/* 56 */            int i = this.mCustomSlingshotDistance;
/* 58 */            if (i > 0) {
                        f2 = i;
                    } else {
/* 62 */                boolean z = this.mUsingCustomStart;
/* 64 */                int i2 = this.mSpinnerOffsetEnd;
/* 66 */                if (z) {
/* 70 */                    i2 -= this.mOriginalOffsetTop;
                        }
                        f2 = i2;
                    }
/* 88 */            double dMax = Math.max(0.0f, Math.min(fAbs, f2 * DECELERATE_INTERPOLATION_FACTOR) / f2) / 4.0f;
/* 98 */            float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * DECELERATE_INTERPOLATION_FACTOR;
/* 107 */           int i3 = this.mOriginalOffsetTop + ((int) ((f2 * fMin) + (f2 * fPow * DECELERATE_INTERPOLATION_FACTOR)));
/* 114 */           if (this.mCircleView.getVisibility() != 0) {
/* 119 */               this.mCircleView.setVisibility(0);
                    }
/* 124 */           if (!this.mScale) {
/* 128 */               this.mCircleView.setScaleX(1.0f);
/* 133 */               this.mCircleView.setScaleY(1.0f);
                    }
/* 138 */           if (this.mScale) {
/* 148 */               setAnimationProgress(Math.min(1.0f, f / this.mTotalDragDistance));
                    }
/* 151 */           float f3 = this.mTotalDragDistance;
/* 155 */           C2231tu c2231tu2 = this.mProgress;
/* 160 */           if (f < f3) {
/* 168 */               if (c2231tu2.f17264a.f16799t > STARTING_PROGRESS_ALPHA && ((animation2 = this.mAlphaStartAnimation) == null || !animation2.hasStarted() || animation2.hasEnded())) {
/* 195 */                   C0145b c0145b = new C0145b(this, this.mProgress.f17264a.f16799t, STARTING_PROGRESS_ALPHA);
/* 198 */                   c0145b.setDuration(300L);
/* 201 */                   C1977nu c1977nu = this.mCircleView;
/* 203 */                   c1977nu.f14454a = null;
/* 205 */                   c1977nu.clearAnimation();
/* 210 */                   this.mCircleView.startAnimation(c0145b);
/* 213 */                   this.mAlphaStartAnimation = c0145b;
                        }
                    } else if (c2231tu2.f17264a.f16799t < MAX_ALPHA && ((animation = this.mAlphaMaxAnimation) == null || !animation.hasStarted() || animation.hasEnded())) {
/* 249 */               C0145b c0145b2 = new C0145b(this, this.mProgress.f17264a.f16799t, MAX_ALPHA);
/* 252 */               c0145b2.setDuration(300L);
/* 255 */               C1977nu c1977nu2 = this.mCircleView;
/* 257 */               c1977nu2.f14454a = null;
/* 259 */               c1977nu2.clearAnimation();
/* 264 */               this.mCircleView.startAnimation(c0145b2);
/* 267 */               this.mAlphaMaxAnimation = c0145b2;
                    }
/* 272 */           float f4 = fMax * MAX_PROGRESS_ANGLE;
/* 274 */           C2231tu c2231tu3 = this.mProgress;
/* 276 */           float fMin2 = Math.min(MAX_PROGRESS_ANGLE, f4);
/* 280 */           C2194su c2194su2 = c2231tu3.f17264a;
/* 282 */           c2194su2.f16784e = 0.0f;
/* 284 */           c2194su2.f16785f = fMin2;
/* 286 */           c2231tu3.invalidateSelf();
/* 289 */           C2231tu c2231tu4 = this.mProgress;
/* 291 */           float fMin3 = Math.min(1.0f, fMax);
/* 295 */           C2194su c2194su3 = c2231tu4.f17264a;
/* 301 */           if (fMin3 != c2194su3.f16795p) {
/* 303 */               c2194su3.f16795p = fMin3;
                    }
/* 305 */           c2231tu4.invalidateSelf();
/* 319 */           float f5 = ((fPow * DECELERATE_INTERPOLATION_FACTOR) + ((fMax * 0.4f) - 0.25f)) * DRAG_RATE;
/* 320 */           C2231tu c2231tu5 = this.mProgress;
/* 324 */           c2231tu5.f17264a.f16786g = f5;
/* 326 */           c2231tu5.invalidateSelf();
/* 332 */           setTargetOffsetTopAndBottom(i3 - this.mCurrentTargetOffsetTop);
                }

                public boolean canChildScrollUp() {
/* 1 */             wj2 wj2Var = this.mChildScrollUpCallback;
/* 3 */             View view = this.mTarget;
/* 5 */             if (wj2Var != null) {
/* 7 */                 return wj2Var.canChildScrollUp(this, view);
                    }
                    return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
                }

                /* JADX INFO: renamed from: d */
                public final void m1055d(boolean z, boolean z2) {
/* 3 */             if (this.mRefreshing != z) {
/* 5 */                 this.mNotify = z2;
/* 7 */                 m1052a();
/* 10 */                this.mRefreshing = z;
/* 12 */                if (!z) {
/* 60 */                    startScaleDownAnimation(this.mRefreshListener);
/* 63 */                    return;
                        }
/* 14 */                int i = this.mCurrentTargetOffsetTop;
/* 16 */                Animation.AnimationListener animationListener = this.mRefreshListener;
/* 18 */                this.mFrom = i;
/* 22 */                this.mAnimateToCorrectPosition.reset();
/* 29 */                this.mAnimateToCorrectPosition.setDuration(200L);
/* 36 */                this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
/* 39 */                if (animationListener != null) {
/* 43 */                    this.mCircleView.f14454a = animationListener;
                        }
/* 47 */                this.mCircleView.clearAnimation();
/* 54 */                this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
                    }
                }

                @Override // android.view.View
                public boolean dispatchNestedFling(float f, float f2, boolean z) {
/* 3 */             return this.mNestedScrollingChildHelper.m7208a(f, f2, z);
                }

                @Override // android.view.View
                public boolean dispatchNestedPreFling(float f, float f2) {
/* 3 */             return this.mNestedScrollingChildHelper.m7209b(f, f2);
                }

                public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
                    return i3 == 0 && dispatchNestedPreScroll(i, i2, iArr, iArr2);
                }

                public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
                    return i5 == 0 && this.mNestedScrollingChildHelper.m7211d(i, i2, i3, i4, iArr, i5, null);
                }

                /* JADX INFO: renamed from: e */
                public final void m1056e(float f) {
/* 1 */             float f2 = this.mInitialDownY;
/* 3 */             float f3 = f - f2;
/* 4 */             int i = this.mTouchSlop;
/* 9 */             if (f3 <= i || this.mIsBeingDragged) {
/* 29 */                return;
                    }
/* 17 */            this.mInitialMotionY = f2 + i;
/* 20 */            this.mIsBeingDragged = true;
/* 26 */            this.mProgress.setAlpha(STARTING_PROGRESS_ALPHA);
                }

                @Override // android.view.ViewGroup
                public int getChildDrawingOrder(int i, int i2) {
/* 1 */             int i3 = this.mCircleViewIndex;
/* 3 */             if (i3 < 0) {
/* 15 */                return i2;
                    }
/* 8 */             if (i2 == i - 1) {
/* 10 */                return i3;
                    }
                    return i2 >= i3 ? i2 + 1 : i2;
                }

                @Override // android.view.ViewGroup
                public int getNestedScrollAxes() {
/* 1 */             rm1 rm1Var = this.mNestedScrollingParentHelper;
/* 7 */             return rm1Var.f16182b | rm1Var.f16181a;
                }

                public int getProgressCircleDiameter() {
/* 1 */             return this.mCircleDiameter;
                }

                public int getProgressViewEndOffset() {
/* 1 */             return this.mSpinnerOffsetEnd;
                }

                public int getProgressViewStartOffset() {
/* 1 */             return this.mOriginalOffsetTop;
                }

                public boolean hasNestedScrollingParent(int i) {
                    return i == 0 && hasNestedScrollingParent();
                }

                @Override // android.view.View
                public boolean isNestedScrollingEnabled() {
/* 3 */             return this.mNestedScrollingChildHelper.f14823d;
                }

                public boolean isRefreshing() {
/* 1 */             return this.mRefreshing;
                }

                public void moveToStart(float f) {
/* 1 */             int i = this.mFrom;
/* 17 */            setTargetOffsetTopAndBottom((i + ((int) ((this.mOriginalOffsetTop - i) * f))) - this.mCircleView.getTop());
                }

                @Override // android.view.ViewGroup, android.view.View
                public void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 4 */             reset();
                }

                /* JADX WARN: Code duplicated, block: B:40:0x006b  */
                @Override // android.view.ViewGroup
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
/* 1 */             m1052a();
/* 4 */             int actionMasked = motionEvent.getActionMasked();
/* 11 */            if (this.mReturningToStart && actionMasked == 0) {
/* 15 */                this.mReturningToStart = false;
                    }
/* 21 */            if (isEnabled() && !this.mReturningToStart && !canChildScrollUp() && !this.mRefreshing && !this.mNestedScrollInProgress) {
/* 43 */                if (actionMasked != 0) {
/* 47 */                    if (actionMasked == 1) {
/* 108 */                       this.mIsBeingDragged = false;
/* 110 */                       this.mActivePointerId = -1;
                            } else if (actionMasked == 2) {
/* 81 */                        int i = this.mActivePointerId;
/* 83 */                        if (i == -1) {
/* 89 */                            AbstractC1245n0.m4876d(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
/* 10 */                            return false;
                                }
/* 93 */                        int iFindPointerIndex = motionEvent.findPointerIndex(i);
/* 97 */                        if (iFindPointerIndex >= 0) {
/* 104 */                           m1056e(motionEvent.getY(iFindPointerIndex));
                                }
                            } else if (actionMasked == 3) {
/* 108 */                       this.mIsBeingDragged = false;
/* 110 */                       this.mActivePointerId = -1;
                            } else if (actionMasked == 6) {
/* 59 */                        int actionIndex = motionEvent.getActionIndex();
/* 69 */                        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
/* 78 */                            this.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                }
                            }
/* 146 */                   return this.mIsBeingDragged;
                        }
/* 122 */               setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop());
/* 125 */               int pointerId = motionEvent.getPointerId(0);
/* 129 */               this.mActivePointerId = pointerId;
/* 131 */               this.mIsBeingDragged = false;
/* 133 */               int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
/* 137 */               if (iFindPointerIndex2 >= 0) {
/* 144 */                   this.mInitialDownY = motionEvent.getY(iFindPointerIndex2);
/* 146 */                   return this.mIsBeingDragged;
                        }
                    }
/* 10 */            return false;
                }

                @Override // android.view.ViewGroup, android.view.View
                public void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             int measuredWidth = getMeasuredWidth();
/* 5 */             int measuredHeight = getMeasuredHeight();
/* 13 */            if (getChildCount() == 0) {
/* 27 */                return;
                    }
/* 18 */            if (this.mTarget == null) {
/* 20 */                m1052a();
                    }
/* 23 */            View view = this.mTarget;
/* 25 */            if (view == null) {
/* 27 */                return;
                    }
/* 28 */            int paddingLeft = getPaddingLeft();
/* 32 */            int paddingTop = getPaddingTop();
/* 59 */            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
/* 64 */            int measuredWidth2 = this.mCircleView.getMeasuredWidth();
/* 70 */            int measuredHeight2 = this.mCircleView.getMeasuredHeight();
/* 76 */            int i5 = measuredWidth / 2;
/* 78 */            int i6 = measuredWidth2 / 2;
/* 82 */            int i7 = this.mCurrentTargetOffsetTop;
/* 86 */            this.mCircleView.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
                }

                @Override // android.view.View
                public void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 6 */             if (this.mTarget == null) {
/* 8 */                 m1052a();
                    }
/* 11 */            View view = this.mTarget;
/* 13 */            if (view == null) {
/* 98 */                return;
                    }
/* 54 */            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
/* 71 */            this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824));
/* 75 */            this.mCircleViewIndex = -1;
/* 82 */            for (int i3 = 0; i3 < getChildCount(); i3++) {
/* 90 */                if (getChildAt(i3) == this.mCircleView) {
/* 92 */                    this.mCircleViewIndex = i3;
/* 94 */                    return;
                        }
                    }
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public boolean onNestedFling(View view, float f, float f2, boolean z) {
/* 1 */             return dispatchNestedFling(f, f2, z);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public boolean onNestedPreFling(View view, float f, float f2) {
/* 1 */             return dispatchNestedPreFling(f, f2);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
/* 3 */             if (i2 > 0) {
/* 5 */                 float f = this.mTotalUnconsumed;
/* 9 */                 if (f > 0.0f) {
                            float f2 = i2;
/* 14 */                    if (f2 > f) {
/* 17 */                        iArr[1] = (int) f;
/* 19 */                        this.mTotalUnconsumed = 0.0f;
                            } else {
/* 23 */                        this.mTotalUnconsumed = f - f2;
/* 25 */                        iArr[1] = i2;
                            }
/* 29 */                    m1054c(this.mTotalUnconsumed);
                        }
                    }
/* 34 */            if (this.mUsingCustomStart && i2 > 0 && this.mTotalUnconsumed == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
/* 58 */                this.mCircleView.setVisibility(8);
                    }
/* 61 */            int[] iArr2 = this.mParentScrollConsumed;
/* 75 */            if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
/* 82 */                iArr[0] = iArr[0] + iArr2[0];
/* 89 */                iArr[1] = iArr[1] + iArr2[1];
                    }
                }

                @Override // p000.qm1
                public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
/* 1 */             if (i5 != 0) {
/* 60 */                return;
                    }
/* 5 */             int i6 = iArr[1];
/* 17 */            dispatchNestedScroll(i, i2, i3, i4, this.mParentOffsetInWindow, i5, iArr);
/* 23 */            int i7 = i4 - (iArr[1] - i6);
/* 33 */            int i8 = i7 == 0 ? i4 + this.mParentOffsetInWindow[1] : i7;
/* 34 */            if (i8 >= 0 || canChildScrollUp()) {
/* 60 */                return;
                    }
/* 49 */            float fAbs = this.mTotalUnconsumed + Math.abs(i8);
/* 50 */            this.mTotalUnconsumed = fAbs;
/* 52 */            m1054c(fAbs);
/* 58 */            iArr[1] = iArr[1] + i7;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public void onNestedScrollAccepted(View view, View view2, int i) {
/* 3 */             this.mNestedScrollingParentHelper.f16181a = i;
/* 7 */             startNestedScroll(i & 2);
/* 11 */            this.mTotalUnconsumed = 0.0f;
/* 14 */            this.mNestedScrollInProgress = true;
                }

                @Override // android.view.View
                public void onRestoreInstanceState(Parcelable parcelable) {
/* 1 */             SavedState savedState = (SavedState) parcelable;
/* 7 */             super.onRestoreInstanceState(savedState.getSuperState());
/* 12 */            setRefreshing(savedState.f1837a);
                }

                @Override // android.view.View
                public Parcelable onSaveInstanceState() {
/* 9 */             return new SavedState(super.onSaveInstanceState(), this.mRefreshing);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public boolean onStartNestedScroll(View view, View view2, int i) {
                    return (!isEnabled() || this.mReturningToStart || this.mRefreshing || (i & 2) == 0) ? false : true;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public void onStopNestedScroll(View view) {
/* 4 */             this.mNestedScrollingParentHelper.f16181a = 0;
/* 6 */             this.mNestedScrollInProgress = false;
/* 8 */             float f = this.mTotalUnconsumed;
/* 13 */            if (f > 0.0f) {
/* 15 */                m1053b(f);
/* 18 */                this.mTotalUnconsumed = 0.0f;
                    }
/* 20 */            stopNestedScroll();
                }

                @Override // android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 8 */             if (this.mReturningToStart && actionMasked == 0) {
/* 12 */                this.mReturningToStart = false;
                    }
/* 18 */            if (isEnabled() && !this.mReturningToStart && !canChildScrollUp() && !this.mRefreshing && !this.mNestedScrollInProgress) {
/* 41 */                if (actionMasked == 0) {
/* 191 */                   this.mActivePointerId = motionEvent.getPointerId(0);
/* 193 */                   this.mIsBeingDragged = false;
/* 40 */                    return true;
                        }
/* 45 */                if (actionMasked == 1) {
/* 152 */                   int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
/* 156 */                   if (iFindPointerIndex < 0) {
/* 162 */                       AbstractC1245n0.m4876d(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
/* 7 */                         return false;
                            }
/* 168 */                   if (this.mIsBeingDragged) {
/* 177 */                       float y = (motionEvent.getY(iFindPointerIndex) - this.mInitialMotionY) * DRAG_RATE;
/* 178 */                       this.mIsBeingDragged = false;
/* 180 */                       m1053b(y);
                            }
/* 184 */                   this.mActivePointerId = -1;
/* 7 */                     return false;
                        }
/* 48 */                if (actionMasked == 2) {
/* 105 */                   int iFindPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
/* 109 */                   if (iFindPointerIndex2 < 0) {
/* 115 */                       AbstractC1245n0.m4876d(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
/* 7 */                         return false;
                            }
/* 119 */                   float y2 = motionEvent.getY(iFindPointerIndex2);
/* 123 */                   m1056e(y2);
/* 128 */                   if (this.mIsBeingDragged) {
/* 133 */                       float f = (y2 - this.mInitialMotionY) * DRAG_RATE;
/* 137 */                       if (f > 0.0f) {
/* 143 */                           getParent().requestDisallowInterceptTouchEvent(true);
/* 146 */                           m1054c(f);
                                }
                            }
/* 40 */                    return true;
                        }
/* 51 */                if (actionMasked != 3) {
/* 54 */                    if (actionMasked != 5) {
/* 57 */                        if (actionMasked == 6) {
/* 60 */                            int actionIndex = motionEvent.getActionIndex();
/* 70 */                            if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
/* 79 */                                this.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
/* 40 */                                return true;
                                    }
                                }
/* 40 */                        return true;
                            }
/* 82 */                    int actionIndex2 = motionEvent.getActionIndex();
/* 86 */                    if (actionIndex2 < 0) {
/* 92 */                        AbstractC1245n0.m4876d(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
/* 7 */                         return false;
                            }
/* 100 */                   this.mActivePointerId = motionEvent.getPointerId(actionIndex2);
/* 40 */                    return true;
                        }
                    }
/* 7 */             return false;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public void requestDisallowInterceptTouchEvent(boolean z) {
                    ViewParent parent;
/* 1 */             View view = this.mTarget;
/* 3 */             if (view != null) {
/* 5 */                 WeakHashMap weakHashMap = e33.f7494a;
/* 11 */                if (!s23.m8378p(view)) {
/* 15 */                    if (this.mEnableLegacyRequestDisallowInterceptTouch || (parent = getParent()) == null) {
/* 27 */                        return;
                            }
/* 24 */                    parent.requestDisallowInterceptTouchEvent(z);
/* 27 */                    return;
                        }
                    }
/* 28 */            super.requestDisallowInterceptTouchEvent(z);
                }

                public void reset() {
/* 3 */             this.mCircleView.clearAnimation();
/* 8 */             this.mProgress.stop();
/* 15 */            this.mCircleView.setVisibility(8);
/* 20 */            setColorViewAlpha(MAX_ALPHA);
/* 25 */            if (this.mScale) {
/* 28 */                setAnimationProgress(0.0f);
                    } else {
/* 37 */                setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCurrentTargetOffsetTop);
                    }
/* 46 */            this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
                }

                public void setAnimationProgress(float f) {
/* 3 */             this.mCircleView.setScaleX(f);
/* 8 */             this.mCircleView.setScaleY(f);
                }

                @Deprecated
                public void setColorScheme(int... iArr) {
/* 1 */             setColorSchemeResources(iArr);
                }

                public void setColorSchemeColors(int... iArr) {
/* 1 */             m1052a();
/* 4 */             C2231tu c2231tu = this.mProgress;
/* 6 */             C2194su c2194su = c2231tu.f17264a;
/* 8 */             c2194su.f16788i = iArr;
/* 11 */            c2194su.m8633a(0);
/* 14 */            c2194su.m8633a(0);
/* 17 */            c2231tu.invalidateSelf();
                }

                public void setColorSchemeResources(int... iArr) {
/* 1 */             Context context = getContext();
/* 6 */             int[] iArr2 = new int[iArr.length];
/* 10 */            for (int i = 0; i < iArr.length; i++) {
/* 18 */                iArr2[i] = v00.getColor(context, iArr[i]);
                    }
/* 23 */            setColorSchemeColors(iArr2);
                }

                public void setDistanceToTriggerSync(int i) {
/* 2 */             this.mTotalDragDistance = i;
                }

                @Override // android.view.View
                public void setEnabled(boolean z) {
/* 1 */             super.setEnabled(z);
/* 4 */             if (z) {
/* 9 */                 return;
                    }
/* 6 */             reset();
                }

                @Deprecated
                public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
/* 1 */             this.mEnableLegacyRequestDisallowInterceptTouch = z;
                }

                @Override // android.view.View
                public void setNestedScrollingEnabled(boolean z) {
/* 1 */             om1 om1Var = this.mNestedScrollingChildHelper;
/* 5 */             if (om1Var.f14823d) {
/* 7 */                 ViewGroup viewGroup = om1Var.f14822c;
/* 9 */                 WeakHashMap weakHashMap = e33.f7494a;
/* 11 */                s23.m8388z(viewGroup);
                    }
/* 14 */            om1Var.f14823d = z;
                }

                public void setOnChildScrollUpCallback(wj2 wj2Var) {
/* 1 */             this.mChildScrollUpCallback = wj2Var;
                }

                public void setOnRefreshListener(xj2 xj2Var) {
/* 1 */             this.mListener = xj2Var;
                }

                @Deprecated
                public void setProgressBackgroundColor(int i) {
/* 1 */             setProgressBackgroundColorSchemeResource(i);
                }

                public void setProgressBackgroundColorSchemeColor(int i) {
/* 3 */             this.mCircleView.setBackgroundColor(i);
                }

                public void setProgressBackgroundColorSchemeResource(int i) {
/* 9 */             setProgressBackgroundColorSchemeColor(v00.getColor(getContext(), i));
                }

                public void setProgressViewEndTarget(boolean z, int i) {
/* 1 */             this.mSpinnerOffsetEnd = i;
/* 3 */             this.mScale = z;
/* 7 */             this.mCircleView.invalidate();
                }

                public void setProgressViewOffset(boolean z, int i, int i2) {
/* 1 */             this.mScale = z;
/* 3 */             this.mOriginalOffsetTop = i;
/* 5 */             this.mSpinnerOffsetEnd = i2;
/* 8 */             this.mUsingCustomStart = true;
/* 10 */            reset();
/* 14 */            this.mRefreshing = false;
                }

                public void setRefreshing(boolean z) {
/* 2 */             if (!z || this.mRefreshing == z) {
/* 73 */                m1055d(z, false);
/* 76 */                return;
                    }
/* 8 */             this.mRefreshing = z;
/* 10 */            boolean z2 = this.mUsingCustomStart;
/* 12 */            int i = this.mSpinnerOffsetEnd;
/* 14 */            if (!z2) {
/* 18 */                i += this.mOriginalOffsetTop;
                    }
/* 22 */            setTargetOffsetTopAndBottom(i - this.mCurrentTargetOffsetTop);
/* 25 */            this.mNotify = false;
/* 27 */            Animation.AnimationListener animationListener = this.mRefreshListener;
/* 31 */            this.mCircleView.setVisibility(0);
/* 38 */            this.mProgress.setAlpha(MAX_ALPHA);
/* 43 */            vj2 vj2Var = new vj2(this, 0);
/* 46 */            this.mScaleAnimation = vj2Var;
/* 51 */            vj2Var.setDuration(this.mMediumAnimationDuration);
/* 54 */            if (animationListener != null) {
/* 58 */                this.mCircleView.f14454a = animationListener;
                    }
/* 62 */            this.mCircleView.clearAnimation();
/* 69 */            this.mCircleView.startAnimation(this.mScaleAnimation);
                }

                public void setSize(int i) {
/* 1 */             if (i == 0 || i == 1) {
/* 11 */                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
/* 15 */                if (i == 0) {
/* 23 */                    this.mCircleDiameter = (int) (displayMetrics.density * 56.0f);
                        } else {
/* 32 */                    this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
                        }
/* 37 */                this.mCircleView.setImageDrawable(null);
/* 42 */                this.mProgress.m8916c(i);
/* 49 */                this.mCircleView.setImageDrawable(this.mProgress);
                    }
                }

                public void setSlingshotDistance(int i) {
/* 1 */             this.mCustomSlingshotDistance = i;
                }

                public void setTargetOffsetTopAndBottom(int i) {
/* 3 */             this.mCircleView.bringToFront();
/* 6 */             C1977nu c1977nu = this.mCircleView;
/* 8 */             WeakHashMap weakHashMap = e33.f7494a;
/* 10 */            c1977nu.offsetTopAndBottom(i);
/* 19 */            this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
                }

                public boolean startNestedScroll(int i, int i2) {
                    return i2 == 0 && startNestedScroll(i);
                }

                public void startScaleDownAnimation(Animation.AnimationListener animationListener) {
/* 4 */             vj2 vj2Var = new vj2(this, 1);
/* 7 */             this.mScaleDownAnimation = vj2Var;
/* 11 */            vj2Var.setDuration(150L);
/* 14 */            C1977nu c1977nu = this.mCircleView;
/* 16 */            c1977nu.f14454a = animationListener;
/* 18 */            c1977nu.clearAnimation();
/* 25 */            this.mCircleView.startAnimation(this.mScaleDownAnimation);
                }

                @Override // android.view.View
                public void stopNestedScroll() {
/* 4 */             this.mNestedScrollingChildHelper.m7215h(0);
                }

/* 7 */         public void stopNestedScroll(int i) {
                    if (i == 0) {
/* 8 */                 stopNestedScroll();
                    }
                }

                @Override // android.view.View
/* 12 */        public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
/* 14 */            return this.mNestedScrollingChildHelper.m7210c(i, i2, iArr, iArr2, 0);
                }

                @Override // android.view.View
/* 12 */        public boolean hasNestedScrollingParent() {
/* 14 */            return this.mNestedScrollingChildHelper.m7213f(0);
                }

                @Override // android.view.View
/* 12 */        public boolean startNestedScroll(int i) {
/* 14 */            return this.mNestedScrollingChildHelper.m7214g(i, 0);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 14 */        public static class SavedState extends View.BaseSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0147d();

                    /* JADX INFO: renamed from: a */
                    public final boolean f1837a;

                    public SavedState(Parcel parcel) {
/* 1 */                 super(parcel);
/* 13 */                this.f1837a = parcel.readByte() != 0;
                    }

                    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeByte(this.f1837a ? (byte) 1 : (byte) 0);
                    }

/* 15 */            public SavedState(Parcelable parcelable, boolean z) {
/* 16 */                super(parcelable);
/* 17 */                this.f1837a = z;
                    }
                }

                @Override // p000.pm1
/* 16 */        public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
                    if (i2 == 0) {
/* 17 */                onNestedScrollAccepted(view, view2, i);
                    }
                }

/* 21 */        public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
                    if (i5 == 0) {
/* 23 */                this.mNestedScrollingChildHelper.m7211d(i, i2, i3, i4, iArr, i5, iArr2);
                    }
                }

                @Override // p000.pm1
/* 22 */        public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
                    if (i2 == 0) {
/* 23 */                return onStartNestedScroll(view, view2, i);
                    }
                    return false;
                }

                @Override // android.view.View
/* 23 */        public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
/* 25 */            return this.mNestedScrollingChildHelper.m7211d(i, i2, i3, i4, iArr, 0, null);
                }

                @Override // p000.pm1
/* 23 */        public void onStopNestedScroll(View view, int i) {
                    if (i == 0) {
/* 24 */                onStopNestedScroll(view);
                    }
                }

                @Override // p000.pm1
/* 60 */        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
/* 61 */            onNestedScroll(view, i, i2, i3, i4, i5, this.mNestedScrollingV2ConsumedCompat);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
/* 61 */        public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
/* 62 */            onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
                }

                @Override // p000.pm1
/* 91 */        public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
                    if (i3 == 0) {
/* 92 */                onNestedPreScroll(view, i, i2, iArr);
                    }
                }
            }
