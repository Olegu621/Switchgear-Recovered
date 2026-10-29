            package androidx.core.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.os.Build;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.FocusFinder;
            import android.view.InputDevice;
            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.view.VelocityTracker;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.animation.AnimationUtils;
            import android.widget.EdgeEffect;
            import android.widget.FrameLayout;
            import android.widget.OverScroller;
            import androidx.core.R$attr;
            import androidx.core.view.ScrollingView;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Map;
            import java.util.Objects;
            import java.util.WeakHashMap;
            import p000.AbstractC0208c9;
            import p000.a23;
            import p000.aa0;
            import p000.b40;
            import p000.cc0;
            import p000.e33;
            import p000.er0;
            import p000.f42;
            import p000.fm0;
            import p000.h33;
            import p000.i33;
            import p000.lm1;
            import p000.m80;
            import p000.mm1;
            import p000.nm1;
            import p000.om1;
            import p000.qm1;
            import p000.rm1;
            import p000.s23;
            import p000.y13;
            import p000.z13;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public class NestedScrollView extends FrameLayout implements qm1, nm1, ScrollingView {

                /* JADX INFO: renamed from: q0 */
                public static final float f1259q0 = (float) (Math.log(0.78d) / Math.log(0.9d));

                /* JADX INFO: renamed from: r0 */
                public static final aa0 f1260r0 = new aa0(3);

                /* JADX INFO: renamed from: s0 */
                public static final int[] f1261s0 = {R.attr.fillViewport};

                /* JADX INFO: renamed from: U */
                public View f1262U;

                /* JADX INFO: renamed from: V */
                public boolean f1263V;

                /* JADX INFO: renamed from: W */
                public VelocityTracker f1264W;

                /* JADX INFO: renamed from: a */
                public final float f1265a;

                /* JADX INFO: renamed from: a0 */
                public boolean f1266a0;

                /* JADX INFO: renamed from: b */
                public long f1267b;

                /* JADX INFO: renamed from: b0 */
                public boolean f1268b0;

                /* JADX INFO: renamed from: c */
                public final Rect f1269c;

                /* JADX INFO: renamed from: c0 */
                public final int f1270c0;

                /* JADX INFO: renamed from: d */
                public final OverScroller f1271d;

                /* JADX INFO: renamed from: d0 */
                public final int f1272d0;

                /* JADX INFO: renamed from: e */
                public final EdgeEffect f1273e;

                /* JADX INFO: renamed from: e0 */
                public final int f1274e0;

                /* JADX INFO: renamed from: f */
                public final EdgeEffect f1275f;

                /* JADX INFO: renamed from: f0 */
                public int f1276f0;

                /* JADX INFO: renamed from: g0 */
                public final int[] f1277g0;

                /* JADX INFO: renamed from: h0 */
                public final int[] f1278h0;

                /* JADX INFO: renamed from: i */
                public int f1279i;

                /* JADX INFO: renamed from: i0 */
                public int f1280i0;

                /* JADX INFO: renamed from: j0 */
                public int f1281j0;

                /* JADX INFO: renamed from: k0 */
                public SavedState f1282k0;

                /* JADX INFO: renamed from: l0 */
                public final rm1 f1283l0;

                /* JADX INFO: renamed from: m0 */
                public final om1 f1284m0;

                /* JADX INFO: renamed from: n0 */
                public float f1285n0;

                /* JADX INFO: renamed from: o0 */
                public mm1 f1286o0;

                /* JADX INFO: renamed from: p0 */
                public final m80 f1287p0;

                /* JADX INFO: renamed from: v */
                public boolean f1288v;

                /* JADX INFO: renamed from: w */
                public boolean f1289w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends View.BaseSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0082a();

                    /* JADX INFO: renamed from: a */
                    public int f1290a;

                    public final String toString() {
/* 5 */                 StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
/* 16 */                sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 21 */                sb.append(" scrollPosition=");
/* 28 */                return fm0.m3786l(sb, this.f1290a, "}");
                    }

                    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeInt(this.f1290a);
                    }
                }

                public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 9 */             this.f1269c = new Rect();
/* 12 */            this.f1288v = true;
/* 15 */            this.f1289w = false;
/* 18 */            this.f1262U = null;
/* 20 */            this.f1263V = false;
/* 22 */            this.f1268b0 = true;
/* 25 */            this.f1276f0 = -1;
/* 30 */            this.f1277g0 = new int[2];
/* 34 */            this.f1278h0 = new int[2];
/* 51 */            this.f1287p0 = new m80(getContext(), new er0(this, 7));
/* 53 */            int i2 = Build.VERSION.SDK_INT;
/* 69 */            this.f1273e = i2 >= 31 ? cc0.m1628a(context, attributeSet) : new EdgeEffect(context);
/* 83 */            this.f1275f = i2 >= 31 ? cc0.m1628a(context, attributeSet) : new EdgeEffect(context);
/* 106 */           this.f1265a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
/* 117 */           this.f1271d = new OverScroller(getContext());
/* 119 */           setFocusable(true);
/* 124 */           setDescendantFocusability(262144);
/* 127 */           setWillNotDraw(false);
/* 134 */           ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
/* 142 */           this.f1270c0 = viewConfiguration.getScaledTouchSlop();
/* 148 */           this.f1272d0 = viewConfiguration.getScaledMinimumFlingVelocity();
/* 154 */           this.f1274e0 = viewConfiguration.getScaledMaximumFlingVelocity();
/* 158 */           TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1261s0, i, 0);
/* 166 */           setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
/* 169 */           typedArrayObtainStyledAttributes.recycle();
/* 177 */           this.f1283l0 = new rm1();
/* 184 */           this.f1284m0 = new om1(this);
/* 186 */           setNestedScrollingEnabled(true);
/* 191 */           e33.m3318n(this, f1260r0);
                }

                /* JADX INFO: renamed from: f */
                public static boolean m589f(View view, NestedScrollView nestedScrollView) {
/* 1 */             if (view == nestedScrollView) {
/* 20 */                return true;
                    }
/* 4 */             Object parent = view.getParent();
                    return (parent instanceof ViewGroup) && m589f((View) parent, nestedScrollView);
                }

                /* JADX INFO: renamed from: a */
                public final boolean m590a(int i) {
/* 1 */             View viewFindFocus = findFocus();
/* 5 */             if (viewFindFocus == this) {
/* 7 */                 viewFindFocus = null;
                    }
/* 12 */            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
/* 16 */            int maxScrollAmount = getMaxScrollAmount();
/* 22 */            if (viewFindNextFocus == null || !m595g(viewFindNextFocus, maxScrollAmount, getHeight())) {
/* 57 */                if (i == 33 && getScrollY() < maxScrollAmount) {
/* 65 */                    maxScrollAmount = getScrollY();
                        } else if (i == 130 && getChildCount() > 0) {
/* 78 */                    View childAt = getChildAt(0);
/* 110 */                   maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
                        }
/* 114 */               if (maxScrollAmount == 0) {
/* 20 */                    return false;
                        }
/* 117 */               if (i != 130) {
/* 120 */                   maxScrollAmount = -maxScrollAmount;
                        }
/* 121 */               m601m(maxScrollAmount, 0, 1, true);
                    } else {
/* 34 */                Rect rect = this.f1269c;
/* 36 */                viewFindNextFocus.getDrawingRect(rect);
/* 39 */                offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
/* 46 */                m601m(m591b(rect), 0, 1, true);
/* 49 */                viewFindNextFocus.requestFocus(i);
                    }
/* 124 */           if (viewFindFocus != null && viewFindFocus.isFocused() && !m595g(viewFindFocus, 0, getHeight())) {
/* 142 */               int descendantFocusability = getDescendantFocusability();
/* 148 */               setDescendantFocusability(131072);
/* 151 */               requestFocus();
/* 154 */               setDescendantFocusability(descendantFocusability);
                    }
/* 21 */            return true;
                }

                @Override // android.view.ViewGroup
                public final void addView(View view) {
/* 5 */             if (getChildCount() <= 0) {
/* 7 */                 super.addView(view);
                    } else {
/* 13 */                f42.m3656l("ScrollView can host only one direct child");
                    }
                }

                /* JADX INFO: renamed from: b */
                public final int m591b(Rect rect) {
/* 6 */             if (getChildCount() == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int height = getHeight();
/* 13 */            int scrollY = getScrollY();
/* 17 */            int i = scrollY + height;
/* 19 */            int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
/* 25 */            if (rect.top > 0) {
/* 27 */                scrollY += verticalFadingEdgeLength;
                    }
/* 28 */            View childAt = getChildAt(0);
/* 36 */            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 55 */            int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
/* 56 */            int i3 = rect.bottom;
/* 58 */            if (i3 > i2 && rect.top > scrollY) {
/* 85 */                return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
                    }
/* 92 */            if (rect.top >= scrollY || i3 >= i2) {
/* 5 */                 return 0;
                    }
/* 116 */           return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
                }

                /* JADX WARN: Code duplicated, block: B:48:0x0098  */
                /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
                /* JADX INFO: renamed from: c */
                public final boolean m592c(KeyEvent keyEvent) {
                    View viewFindFocus;
                    View viewFindNextFocus;
/* 3 */             this.f1269c.setEmpty();
/* 13 */            if (getChildCount() > 0) {
/* 15 */                View childAt = getChildAt(0);
/* 23 */                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 49 */                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
/* 55 */                    if (keyEvent.getAction() == 0) {
/* 57 */                        int keyCode = keyEvent.getKeyCode();
/* 65 */                        if (keyCode == 19) {
                                    return keyEvent.isAltPressed() ? m594e(33) : m590a(33);
                                }
/* 69 */                        if (keyCode == 20) {
                                    return keyEvent.isAltPressed() ? m594e(130) : m590a(130);
                                }
/* 73 */                        if (keyCode == 62) {
/* 117 */                           m599k(keyEvent.isShiftPressed() ? 33 : 130);
/* 12 */                            return false;
                                }
/* 77 */                        if (keyCode == 92) {
/* 105 */                           return m594e(33);
                                }
/* 81 */                        if (keyCode == 93) {
/* 100 */                           return m594e(130);
                                }
/* 85 */                        if (keyCode == 122) {
/* 96 */                            m599k(33);
/* 12 */                            return false;
                                }
/* 89 */                        if (keyCode == 123) {
/* 92 */                            m599k(130);
/* 12 */                            return false;
                                }
                            }
                        } else if (isFocused() && keyEvent.getKeyCode() != 4) {
/* 166 */                   viewFindFocus = findFocus();
/* 170 */                   if (viewFindFocus == this) {
/* 172 */                       viewFindFocus = null;
                            }
/* 177 */                   viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
/* 181 */                   if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
/* 191 */                       return true;
                            }
                        }
                    } else if (isFocused()) {
/* 166 */               viewFindFocus = findFocus();
/* 170 */               if (viewFindFocus == this) {
/* 172 */                   viewFindFocus = null;
                        }
/* 177 */               viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
/* 181 */               if (viewFindNextFocus == null) {
                        }
                    }
/* 12 */            return false;
                }

                @Override // android.view.View, androidx.core.view.ScrollingView
                public final int computeHorizontalScrollExtent() {
/* 1 */             return super.computeHorizontalScrollExtent();
                }

                @Override // android.view.View, androidx.core.view.ScrollingView
                public final int computeHorizontalScrollOffset() {
/* 1 */             return super.computeHorizontalScrollOffset();
                }

                @Override // android.view.View, androidx.core.view.ScrollingView
                public final int computeHorizontalScrollRange() {
/* 1 */             return super.computeHorizontalScrollRange();
                }

                /* JADX WARN: Code duplicated, block: B:22:0x007f  */
                /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
                /* JADX WARN: Code duplicated, block: B:28:0x00af A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
                /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
                /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
                /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
                /* JADX WARN: Code duplicated, block: B:38:0x00da  */
                /* JADX WARN: Code duplicated, block: B:40:0x00de  */
                @Override // android.view.View
                public final void computeScroll() {
                    int iRound;
                    int[] iArr;
                    int i;
                    int scrollRange;
                    int overScrollMode;
/* 3 */             OverScroller overScroller = this.f1271d;
/* 9 */             if (overScroller.isFinished()) {
/* 11 */                return;
                    }
/* 12 */            overScroller.computeScrollOffset();
/* 15 */            int currY = overScroller.getCurrY();
/* 21 */            int i2 = currY - this.f1281j0;
/* 23 */            int height = getHeight();
/* 27 */            EdgeEffect edgeEffect = this.f1273e;
/* 29 */            EdgeEffect edgeEffect2 = this.f1275f;
/* 36 */            if (i2 <= 0 || b40.m1229m(edgeEffect) == 0.0f) {
/* 71 */                if (i2 < 0 && b40.m1229m(edgeEffect2) != 0.0f) {
                            float f = height;
/* 91 */                    iRound = Math.round(b40.m1242z(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
/* 95 */                    if (iRound != i2) {
/* 97 */                        edgeEffect2.finish();
                            }
                        }
/* 69 */                int i3 = i2;
/* 101 */               this.f1281j0 = currY;
/* 103 */               iArr = this.f1278h0;
/* 107 */               iArr[1] = 0;
/* 114 */               this.f1284m0.m7210c(0, i3, iArr, null, 1);
/* 121 */               i = i3 - iArr[1];
/* 122 */               scrollRange = getScrollRange();
/* 126 */               if (i != 0) {
/* 128 */                   int scrollY = getScrollY();
/* 136 */                   m598j(i, getScrollX(), scrollY, scrollRange);
/* 143 */                   int scrollY2 = getScrollY() - scrollY;
/* 145 */                   int i4 = i - scrollY2;
/* 147 */                   iArr[1] = 0;
/* 157 */                   this.f1284m0.m7211d(0, scrollY2, 0, i4, this.f1277g0, 1, iArr);
/* 162 */                   i = i4 - iArr[1];
                        }
/* 164 */               if (i != 0) {
/* 166 */                   overScrollMode = getOverScrollMode();
/* 170 */                   if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
/* 176 */                       if (i < 0) {
/* 182 */                           if (edgeEffect.isFinished()) {
/* 189 */                               edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                                    }
                                } else if (edgeEffect2.isFinished()) {
/* 204 */                           edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                                }
                            }
/* 207 */                   overScroller.abortAnimation();
/* 210 */                   m605q(1);
                        }
/* 217 */               if (overScroller.isFinished()) {
/* 223 */                   m605q(1);
                        } else {
/* 219 */                   postInvalidateOnAnimation();
                        }
                    }
/* 59 */            iRound = Math.round(b40.m1242z(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
/* 63 */            if (iRound != i2) {
/* 65 */                edgeEffect.finish();
                    }
/* 68 */            i2 -= iRound;
/* 69 */            int i5 = i2;
/* 101 */           this.f1281j0 = currY;
/* 103 */           iArr = this.f1278h0;
/* 107 */           iArr[1] = 0;
/* 114 */           this.f1284m0.m7210c(0, i5, iArr, null, 1);
/* 121 */           i = i5 - iArr[1];
/* 122 */           scrollRange = getScrollRange();
/* 126 */           if (i != 0) {
/* 128 */               int scrollY3 = getScrollY();
/* 136 */               m598j(i, getScrollX(), scrollY3, scrollRange);
/* 143 */               int scrollY4 = getScrollY() - scrollY3;
/* 145 */               int i6 = i - scrollY4;
/* 147 */               iArr[1] = 0;
/* 157 */               this.f1284m0.m7211d(0, scrollY4, 0, i6, this.f1277g0, 1, iArr);
/* 162 */               i = i6 - iArr[1];
                    }
/* 164 */           if (i != 0) {
/* 166 */               overScrollMode = getOverScrollMode();
/* 170 */               if (overScrollMode != 0) {
/* 176 */                   if (i < 0) {
/* 182 */                       if (edgeEffect.isFinished()) {
/* 189 */                           edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                                }
                            } else if (edgeEffect2.isFinished()) {
/* 204 */                       edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                            }
                        } else if (i < 0) {
/* 182 */                   if (edgeEffect.isFinished()) {
/* 189 */                       edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                            }
                        } else if (edgeEffect2.isFinished()) {
/* 204 */                   edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                        }
/* 207 */               overScroller.abortAnimation();
/* 210 */               m605q(1);
                    }
/* 217 */           if (overScroller.isFinished()) {
/* 219 */               postInvalidateOnAnimation();
                    } else {
/* 223 */               m605q(1);
                    }
                }

                @Override // android.view.View, androidx.core.view.ScrollingView
                public final int computeVerticalScrollExtent() {
/* 1 */             return super.computeVerticalScrollExtent();
                }

                @Override // android.view.View, androidx.core.view.ScrollingView
                public final int computeVerticalScrollOffset() {
/* 6 */             return Math.max(0, super.computeVerticalScrollOffset());
                }

                @Override // android.view.View, androidx.core.view.ScrollingView
                public final int computeVerticalScrollRange() {
/* 1 */             int childCount = getChildCount();
/* 18 */            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
/* 19 */            if (childCount == 0) {
/* 21 */                return height;
                    }
/* 23 */            View childAt = getChildAt(0);
/* 39 */            int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
/* 40 */            int scrollY = getScrollY();
/* 46 */            int iMax = Math.max(0, bottom - height);
/* 50 */            if (scrollY < 0) {
/* 52 */                return bottom - scrollY;
                    }
                    return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
                }

                /* JADX INFO: renamed from: d */
                public final void m593d(int i) {
/* 5 */             if (getChildCount() > 0) {
/* 28 */                this.f1271d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, AbstractC0208c9.API_PRIORITY_OTHER, 0, 0);
/* 35 */                this.f1284m0.m7214g(2, 1);
/* 42 */                this.f1281j0 = getScrollY();
/* 44 */                postInvalidateOnAnimation();
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                    return super.dispatchKeyEvent(keyEvent) || m592c(keyEvent);
                }

                @Override // android.view.View
                public final boolean dispatchNestedFling(float f, float f2, boolean z) {
/* 3 */             return this.f1284m0.m7208a(f, f2, z);
                }

                @Override // android.view.View
                public final boolean dispatchNestedPreFling(float f, float f2) {
/* 3 */             return this.f1284m0.m7209b(f, f2);
                }

                @Override // android.view.View
                public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
/* 8 */             return this.f1284m0.m7210c(i, i2, iArr, iArr2, 0);
                }

                @Override // android.view.View
                public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
/* 10 */            return this.f1284m0.m7211d(i, i2, i3, i4, iArr, 0, null);
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                    int paddingLeft;
/* 1 */             super.draw(canvas);
/* 4 */             int scrollY = getScrollY();
/* 8 */             EdgeEffect edgeEffect = this.f1273e;
/* 14 */            int paddingLeft2 = 0;
/* 15 */            if (!edgeEffect.isFinished()) {
/* 17 */                int iSave = canvas.save();
/* 21 */                int width = getWidth();
/* 25 */                int height = getHeight();
/* 29 */                int iMin = Math.min(0, scrollY);
/* 37 */                if (lm1.m6494a(this)) {
/* 48 */                    width -= getPaddingRight() + getPaddingLeft();
/* 49 */                    paddingLeft = getPaddingLeft();
                        } else {
/* 54 */                    paddingLeft = 0;
                        }
/* 59 */                if (lm1.m6494a(this)) {
/* 70 */                    height -= getPaddingBottom() + getPaddingTop();
/* 75 */                    iMin += getPaddingTop();
                        }
/* 78 */                canvas.translate(paddingLeft, iMin);
/* 81 */                edgeEffect.setSize(width, height);
/* 88 */                if (edgeEffect.draw(canvas)) {
/* 90 */                    postInvalidateOnAnimation();
                        }
/* 93 */                canvas.restoreToCount(iSave);
                    }
/* 96 */            EdgeEffect edgeEffect2 = this.f1275f;
/* 102 */           if (edgeEffect2.isFinished()) {
/* 194 */               return;
                    }
/* 104 */           int iSave2 = canvas.save();
/* 108 */           int width2 = getWidth();
/* 112 */           int height2 = getHeight();
/* 124 */           int iMax = Math.max(getScrollRange(), scrollY) + height2;
/* 129 */           if (lm1.m6494a(this)) {
/* 140 */               width2 -= getPaddingRight() + getPaddingLeft();
/* 141 */               paddingLeft2 = getPaddingLeft();
                    }
/* 149 */           if (lm1.m6494a(this)) {
/* 160 */               height2 -= getPaddingBottom() + getPaddingTop();
/* 165 */               iMax -= getPaddingBottom();
                    }
/* 169 */           canvas.translate(paddingLeft2 - width2, iMax);
/* 176 */           canvas.rotate(180.0f, width2, 0.0f);
/* 179 */           edgeEffect2.setSize(width2, height2);
/* 186 */           if (edgeEffect2.draw(canvas)) {
/* 188 */               postInvalidateOnAnimation();
                    }
/* 191 */           canvas.restoreToCount(iSave2);
                }

                /* JADX INFO: renamed from: e */
                public final boolean m594e(int i) {
                    int childCount;
/* 9 */             boolean z = i == 130;
/* 10 */            int height = getHeight();
/* 14 */            Rect rect = this.f1269c;
/* 16 */            rect.top = 0;
/* 18 */            rect.bottom = height;
/* 20 */            if (z && (childCount = getChildCount()) > 0) {
/* 29 */                View childAt = getChildAt(childCount - 1);
/* 50 */                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
/* 51 */                rect.bottom = paddingBottom;
/* 54 */                rect.top = paddingBottom - height;
                    }
/* 60 */            return m600l(i, rect.top, rect.bottom);
                }

                /* JADX INFO: renamed from: g */
                public final boolean m595g(View view, int i, int i2) {
/* 1 */             Rect rect = this.f1269c;
/* 3 */             view.getDrawingRect(rect);
/* 6 */             offsetDescendantRectToMyCoords(view, rect);
                    return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
                }

                @Override // android.view.View
                public float getBottomFadingEdgeStrength() {
/* 5 */             if (getChildCount() == 0) {
/* 7 */                 return 0.0f;
                    }
/* 10 */            View childAt = getChildAt(0);
/* 18 */            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 20 */            int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
/* 45 */            int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
/* 46 */            if (bottom < verticalFadingEdgeLength) {
/* 50 */                return bottom / verticalFadingEdgeLength;
                    }
/* 52 */            return 1.0f;
                }

                public int getMaxScrollAmount() {
/* 9 */             return (int) (getHeight() * 0.5f);
                }

                @Override // android.view.ViewGroup
                public int getNestedScrollAxes() {
/* 1 */             rm1 rm1Var = this.f1283l0;
/* 7 */             return rm1Var.f16182b | rm1Var.f16181a;
                }

                public int getScrollRange() {
/* 6 */             if (getChildCount() <= 0) {
/* 5 */                 return 0;
                    }
/* 8 */             View childAt = getChildAt(0);
/* 16 */            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 43 */            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
                }

                @Override // android.view.View
                public float getTopFadingEdgeStrength() {
/* 5 */             if (getChildCount() == 0) {
/* 7 */                 return 0.0f;
                    }
/* 9 */             int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
/* 13 */            int scrollY = getScrollY();
/* 17 */            if (scrollY < verticalFadingEdgeLength) {
/* 21 */                return scrollY / verticalFadingEdgeLength;
                    }
/* 23 */            return 1.0f;
                }

                public float getVerticalScrollFactorCompat() {
/* 6 */             if (this.f1285n0 == 0.0f) {
/* 10 */                TypedValue typedValue = new TypedValue();
/* 13 */                Context context = getContext();
/* 29 */                if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
/* 48 */                    f42.m3656l("Expected theme to define listPreferredItemHeight.");
/* 3 */                     return 0.0f;
                        }
/* 43 */                this.f1285n0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
                    }
/* 52 */            return this.f1285n0;
                }

                /* JADX INFO: renamed from: h */
                public final void m596h(int i, int i2, int[] iArr) {
/* 1 */             int scrollY = getScrollY();
/* 6 */             scrollBy(0, i);
/* 13 */            int scrollY2 = getScrollY() - scrollY;
/* 15 */            if (iArr != null) {
/* 21 */                iArr[1] = iArr[1] + scrollY2;
                    }
/* 32 */            this.f1284m0.m7211d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
                }

                @Override // android.view.View
                public final boolean hasNestedScrollingParent() {
/* 4 */             return this.f1284m0.m7213f(0);
                }

                /* JADX INFO: renamed from: i */
                public final void m597i(MotionEvent motionEvent) {
/* 1 */             int actionIndex = motionEvent.getActionIndex();
/* 11 */            if (motionEvent.getPointerId(actionIndex) == this.f1276f0) {
/* 17 */                int i = actionIndex == 0 ? 1 : 0;
/* 23 */                this.f1279i = (int) motionEvent.getY(i);
/* 29 */                this.f1276f0 = motionEvent.getPointerId(i);
/* 31 */                VelocityTracker velocityTracker = this.f1264W;
/* 33 */                if (velocityTracker != null) {
/* 35 */                    velocityTracker.clear();
                        }
                    }
                }

                @Override // android.view.View
                public final boolean isNestedScrollingEnabled() {
/* 3 */             return this.f1284m0.f14823d;
                }

                /* JADX INFO: renamed from: j */
                public final boolean m598j(int i, int i2, int i3, int i4) {
                    int i5;
                    boolean z;
                    int i6;
                    boolean z2;
/* 1 */             getOverScrollMode();
/* 5 */             super.computeHorizontalScrollRange();
/* 8 */             super.computeHorizontalScrollExtent();
/* 11 */            computeVerticalScrollRange();
/* 14 */            super.computeVerticalScrollExtent();
/* 18 */            int i7 = i3 + i;
/* 20 */            if (i2 <= 0 && i2 >= 0) {
/* 28 */                i5 = i2;
/* 29 */                z = false;
                    } else {
/* 22 */                i5 = 0;
/* 23 */                z = true;
                    }
/* 30 */            if (i7 <= i4) {
/* 35 */                if (i7 < 0) {
/* 37 */                    i6 = 0;
                        } else {
/* 39 */                    i6 = i7;
/* 40 */                    z2 = false;
                        }
/* 41 */                if (z2 && !this.f1284m0.m7213f(1)) {
/* 60 */                    this.f1271d.springBack(i5, i6, 0, 0, 0, getScrollRange());
                        }
/* 63 */                super.scrollTo(i5, i6);
                        return !z || z2;
                    }
/* 32 */            i6 = i4;
/* 33 */            z2 = true;
/* 41 */            if (z2) {
/* 60 */                this.f1271d.springBack(i5, i6, 0, 0, 0, getScrollRange());
                    }
/* 63 */            super.scrollTo(i5, i6);
                    if (z) {
                    }
                }

                /* JADX INFO: renamed from: k */
                public final void m599k(int i) {
/* 9 */             boolean z = i == 130;
/* 10 */            int height = getHeight();
/* 14 */            Rect rect = this.f1269c;
/* 16 */            if (z) {
/* 23 */                rect.top = getScrollY() + height;
/* 25 */                int childCount = getChildCount();
/* 29 */                if (childCount > 0) {
/* 32 */                    View childAt = getChildAt(childCount - 1);
/* 53 */                    int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
/* 57 */                    if (rect.top + height > paddingBottom) {
/* 60 */                        rect.top = paddingBottom - height;
                            }
                        }
                    } else {
/* 67 */                int scrollY = getScrollY() - height;
/* 68 */                rect.top = scrollY;
/* 70 */                if (scrollY < 0) {
/* 72 */                    rect.top = 0;
                        }
                    }
/* 74 */            int i2 = rect.top;
/* 76 */            int i3 = height + i2;
/* 77 */            rect.bottom = i3;
/* 79 */            m600l(i, i2, i3);
                }

                /* JADX WARN: Code duplicated, block: B:32:0x0068  */
                /* JADX INFO: renamed from: l */
                public final boolean m600l(int i, int i2, int i3) {
                    boolean z;
/* 9 */             int height = getHeight();
/* 13 */            int scrollY = getScrollY();
/* 17 */            int i4 = height + scrollY;
/* 24 */            boolean z2 = i == 33;
/* 26 */            ArrayList<View> focusables = getFocusables(2);
/* 30 */            int size = focusables.size();
/* 34 */            View view = null;
/* 36 */            boolean z3 = false;
/* 37 */            for (int i5 = 0; i5 < size; i5++) {
/* 39 */                View view2 = focusables.get(i5);
/* 45 */                int top = view2.getTop();
/* 49 */                int bottom = view2.getBottom();
/* 53 */                if (i2 < bottom && top < i3) {
/* 64 */                    boolean z4 = i2 < top && bottom < i3;
/* 66 */                    if (view == null) {
/* 68 */                        view = view2;
/* 69 */                        z3 = z4;
                            } else {
/* 90 */                        boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
/* 91 */                        if (z3) {
/* 93 */                            if (z4 && z5) {
/* 105 */                               view = view2;
                                    }
                                } else if (z4) {
/* 100 */                           view = view2;
/* 101 */                           z3 = true;
                                } else if (z5) {
/* 105 */                           view = view2;
                                }
                            }
                        }
                    }
/* 109 */           if (view == null) {
/* 111 */               view = this;
                    }
/* 112 */           if (i2 < scrollY || i3 > i4) {
/* 127 */               m601m(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
/* 130 */               z = true;
                    } else {
/* 116 */               z = false;
                    }
/* 135 */           if (view != findFocus()) {
/* 137 */               view.requestFocus(i);
                    }
/* 140 */           return z;
                }

                /* JADX INFO: renamed from: m */
                public final int m601m(int i, int i2, int i3, boolean z) {
                    int i4;
                    int i5;
                    boolean z2;
                    VelocityTracker velocityTracker;
/* 7 */             om1 om1Var = this.f1284m0;
/* 10 */            if (i3 == 1) {
/* 13 */                om1Var.m7214g(2, i3);
                    }
/* 25 */            boolean zM7210c = this.f1284m0.m7210c(0, i, this.f1278h0, this.f1277g0, i3);
/* 29 */            int[] iArr = this.f1277g0;
/* 31 */            int[] iArr2 = this.f1278h0;
/* 34 */            if (zM7210c) {
/* 38 */                i4 = i - iArr2[1];
/* 40 */                i5 = iArr[1];
                    } else {
/* 45 */                i4 = i;
/* 47 */                i5 = 0;
                    }
/* 48 */            int scrollY = getScrollY();
/* 52 */            int scrollRange = getScrollRange();
/* 56 */            int overScrollMode = getOverScrollMode();
/* 75 */            boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
/* 92 */            boolean z4 = m598j(i4, 0, scrollY, scrollRange) && !om1Var.m7213f(i3);
/* 98 */            int scrollY2 = getScrollY() - scrollY;
/* 102 */           iArr2[1] = 0;
/* 115 */           this.f1284m0.m7211d(0, scrollY2, 0, i4 - scrollY2, this.f1277g0, i3, iArr2);
/* 121 */           int i6 = i5 + iArr[1];
/* 124 */           int i7 = i4 - iArr2[1];
/* 125 */           int i8 = scrollY + i7;
/* 126 */           EdgeEffect edgeEffect = this.f1275f;
/* 128 */           EdgeEffect edgeEffect2 = this.f1273e;
/* 130 */           if (i8 < 0) {
/* 132 */               if (z3) {
/* 149 */                   b40.m1242z(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
/* 156 */                   if (!edgeEffect.isFinished()) {
/* 158 */                       edgeEffect.onRelease();
                            }
                        }
                    } else if (i8 > scrollRange && z3) {
/* 183 */               b40.m1242z(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
/* 190 */               if (!edgeEffect2.isFinished()) {
/* 192 */                   edgeEffect2.onRelease();
                        }
                    }
/* 199 */           if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
/* 208 */               z2 = z4;
                    } else {
/* 211 */               postInvalidateOnAnimation();
/* 214 */               z2 = false;
                    }
/* 215 */           if (z2 && i3 == 0 && (velocityTracker = this.f1264W) != null) {
/* 223 */               velocityTracker.clear();
                    }
/* 226 */           if (i3 == 1) {
/* 228 */               m605q(i3);
/* 231 */               edgeEffect2.onRelease();
/* 234 */               edgeEffect.onRelease();
                    }
/* 237 */           return i6;
                }

                @Override // android.view.ViewGroup
                public final void measureChild(View view, int i, int i2) {
/* 1 */             ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
/* 25 */            view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                }

                @Override // android.view.ViewGroup
                public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
/* 5 */             ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
/* 39 */            view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
                }

                /* JADX INFO: renamed from: n */
                public final boolean m602n(EdgeEffect edgeEffect, int i) {
/* 2 */             if (i > 0) {
/* 1 */                 return true;
                    }
/* 14 */            float fM1229m = b40.m1229m(edgeEffect) * getHeight();
/* 24 */            float fAbs = Math.abs(-i) * 0.35f;
/* 30 */            float f = this.f1265a * 0.015f;
/* 33 */            double dLog = Math.log(fAbs / f);
/* 37 */            double d = f1259q0;
                    return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM1229m;
                }

                /* JADX INFO: renamed from: o */
                public final void m603o(int i, int i2, boolean z) {
/* 5 */             if (getChildCount() == 0) {
/* 7 */                 return;
                    }
/* 20 */            if (AnimationUtils.currentAnimationTimeMillis() - this.f1267b > 250) {
/* 23 */                View childAt = getChildAt(0);
/* 31 */                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 42 */                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
/* 56 */                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
/* 57 */                int scrollY = getScrollY();
/* 75 */                int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
/* 86 */                this.f1271d.startScroll(getScrollX(), scrollY, 0, iMax, 250);
/* 89 */                if (z) {
/* 94 */                    this.f1284m0.m7214g(2, 1);
                        } else {
/* 98 */                    m605q(1);
                        }
/* 105 */               this.f1281j0 = getScrollY();
/* 107 */               postInvalidateOnAnimation();
                    } else {
/* 111 */               OverScroller overScroller = this.f1271d;
/* 117 */               if (!overScroller.isFinished()) {
/* 119 */                   overScroller.abortAnimation();
/* 122 */                   m605q(1);
                        }
/* 125 */               scrollBy(i, i2);
                    }
/* 132 */           this.f1267b = AnimationUtils.currentAnimationTimeMillis();
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 5 */             this.f1289w = false;
                }

                /* JADX WARN: Code duplicated, block: B:134:0x029c  */
                /* JADX WARN: Code duplicated, block: B:135:0x02a4  */
                /* JADX WARN: Code duplicated, block: B:137:0x02ae  */
                /* JADX WARN: Code duplicated, block: B:49:0x00db  */
                /* JADX WARN: Code duplicated, block: B:70:0x0126  */
                @Override // android.view.View
                public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
                    float axisValue;
                    int i;
                    int width;
                    boolean z;
                    int i2;
                    int scaledMinimumFlingVelocity;
                    int scaledMaximumFlingVelocity;
                    boolean z2;
                    float yVelocity;
                    float f;
                    long j;
                    float f2;
                    int i3;
                    float fSqrt;
                    float f3;
/* 11 */            if (motionEvent.getAction() != 8 || this.f1263V) {
/* 832 */               return false;
                    }
/* 28 */            if ((motionEvent.getSource() & 2) == 2) {
/* 30 */                i = 9;
/* 32 */                axisValue = motionEvent.getAxisValue(9);
/* 40 */                width = (int) motionEvent.getX();
                    } else if ((motionEvent.getSource() & 4194304) == 4194304) {
/* 49 */                axisValue = motionEvent.getAxisValue(26);
/* 57 */                width = getWidth() / 2;
/* 59 */                i = 26;
                    } else {
/* 61 */                axisValue = 0.0f;
/* 62 */                i = 0;
/* 63 */                width = 0;
                    }
/* 66 */            if (axisValue == 0.0f) {
/* 832 */               return false;
                    }
/* 88 */            m601m(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
/* 91 */            if (i == 0) {
/* 81 */                return true;
                    }
/* 93 */            m80 m80Var = this.f1287p0;
/* 99 */            NestedScrollView nestedScrollView = (NestedScrollView) m80Var.f13651b.f7853b;
/* 101 */           int[] iArr = m80Var.f13657h;
/* 103 */           int source = motionEvent.getSource();
/* 107 */           int deviceId = motionEvent.getDeviceId();
/* 115 */           if (m80Var.f13655f == source && m80Var.f13656g == deviceId && m80Var.f13654e == i) {
/* 126 */               z = true;
/* 128 */               z2 = false;
/* 129 */               i2 = 0;
                    } else {
/* 133 */               Context context = m80Var.f13650a;
/* 135 */               z = true;
/* 137 */               ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
/* 141 */               int deviceId2 = motionEvent.getDeviceId();
/* 145 */               int source2 = motionEvent.getSource();
/* 149 */               i2 = 0;
/* 151 */               int i4 = Build.VERSION.SDK_INT;
/* 158 */               if (i4 >= 34) {
/* 160 */                   Method method = i33.f9439a;
/* 162 */                   scaledMinimumFlingVelocity = h33.m4101b(viewConfiguration, deviceId2, i, source2);
                        } else {
/* 167 */                   Method method2 = i33.f9439a;
/* 169 */                   InputDevice device = InputDevice.getDevice(deviceId2);
/* 173 */                   if (device == null || device.getMotionRange(i, source2) == null) {
/* 220 */                       scaledMinimumFlingVelocity = AbstractC0208c9.API_PRIORITY_OTHER;
                            } else {
/* 181 */                       Resources resources = context.getResources();
/* 200 */                       int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
/* 201 */                       Objects.requireNonNull(viewConfiguration);
/* 204 */                       if (identifier == -1) {
/* 215 */                           scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                                } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
/* 220 */                           scaledMinimumFlingVelocity = AbstractC0208c9.API_PRIORITY_OTHER;
                                }
                            }
                        }
/* 223 */               iArr[0] = scaledMinimumFlingVelocity;
/* 225 */               int deviceId3 = motionEvent.getDeviceId();
/* 229 */               int source3 = motionEvent.getSource();
/* 235 */               if (i4 >= 34) {
/* 237 */                   scaledMaximumFlingVelocity = h33.m4100a(viewConfiguration, deviceId3, i, source3);
                        } else {
/* 242 */                   InputDevice device2 = InputDevice.getDevice(deviceId3);
/* 248 */                   if (device2 == null || device2.getMotionRange(i, source3) == null) {
/* 295 */                       scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                            } else {
/* 256 */                       Resources resources2 = context.getResources();
/* 275 */                       int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
/* 276 */                       Objects.requireNonNull(viewConfiguration);
/* 279 */                       if (identifier2 == -1) {
/* 290 */                           scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                                } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
/* 295 */                           scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                                }
                            }
                        }
/* 296 */               iArr[1] = scaledMaximumFlingVelocity;
/* 298 */               m80Var.f13655f = source;
/* 300 */               m80Var.f13656g = deviceId;
/* 302 */               m80Var.f13654e = i;
/* 304 */               z2 = true;
                    }
/* 306 */           int i5 = iArr[i2];
/* 308 */           VelocityTracker velocityTracker = m80Var.f13652c;
/* 313 */           if (i5 == Integer.MAX_VALUE) {
/* 315 */               if (velocityTracker == null) {
/* 831 */                   return z;
                        }
/* 317 */               velocityTracker.recycle();
/* 321 */               m80Var.f13652c = null;
/* 323 */               return z;
                    }
/* 324 */           if (velocityTracker == null) {
/* 330 */               m80Var.f13652c = VelocityTracker.obtain();
                    }
/* 332 */           VelocityTracker velocityTracker2 = m80Var.f13652c;
/* 334 */           Map map = z13.f19906a;
/* 336 */           velocityTracker2.addMovement(motionEvent);
/* 345 */           if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
/* 356 */               Map map2 = z13.f19906a;
/* 362 */               if (!map2.containsKey(velocityTracker2)) {
/* 369 */                   map2.put(velocityTracker2, new a23());
                        }
/* 376 */               a23 a23Var = (a23) map2.get(velocityTracker2);
/* 378 */               long[] jArr = a23Var.f57b;
/* 380 */               long eventTime = motionEvent.getEventTime();
/* 386 */               if (a23Var.f59d != 0 && eventTime - jArr[a23Var.f60e] > 40) {
/* 402 */                   a23Var.f59d = i2;
/* 405 */                   a23Var.f58c = 0.0f;
                        }
/* 411 */               int i6 = (a23Var.f60e + 1) % 20;
/* 412 */               a23Var.f60e = i6;
/* 414 */               int i7 = a23Var.f59d;
/* 416 */               if (i7 != 20) {
/* 420 */                   a23Var.f59d = i7 + 1;
                        }
/* 430 */               a23Var.f56a[i6] = motionEvent.getAxisValue(26);
/* 434 */               jArr[a23Var.f60e] = eventTime;
                    }
/* 438 */           float f4 = Float.MAX_VALUE;
/* 441 */           velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
/* 450 */           a23 a23Var2 = (a23) z13.f19906a.get(velocityTracker2);
/* 452 */           if (a23Var2 != null) {
/* 454 */               float[] fArr = a23Var2.f56a;
/* 456 */               long[] jArr2 = a23Var2.f57b;
/* 458 */               int i8 = a23Var2.f59d;
/* 461 */               if (i8 < 2) {
/* 465 */                   f2 = Float.MAX_VALUE;
                        } else {
/* 470 */                   int i9 = a23Var2.f60e;
/* 477 */                   int i10 = ((i9 + 20) - (i8 - 1)) % 20;
/* 478 */                   long j2 = jArr2[i9];
                            while (true) {
/* 480 */                       j = jArr2[i10];
/* 482 */                       long j3 = j2 - j;
/* 488 */                       f2 = f4;
/* 490 */                       i3 = a23Var2.f59d;
/* 492 */                       if (j3 <= 100) {
                                    break;
                                }
/* 496 */                       a23Var2.f59d = i3 - 1;
/* 500 */                       i10 = (i10 + 1) % 20;
/* 501 */                       f4 = f2;
                            }
/* 507 */                   if (i3 >= 2) {
/* 512 */                       if (i3 == 2) {
/* 516 */                           int i11 = (i10 + 1) % 20;
/* 518 */                           long j4 = jArr2[i11];
/* 522 */                           if (j != j4) {
/* 531 */                               z2 = z2;
/* 529 */                               fSqrt = fArr[i11] / (j4 - j);
                                    }
                                } else {
/* 536 */                           float f5 = 0.0f;
/* 537 */                           int i12 = 0;
/* 538 */                           int i13 = 0;
                                    while (true) {
/* 549 */                               if (i12 >= a23Var2.f59d - 1) {
                                            break;
                                        }
/* 551 */                               int i14 = i12 + i10;
/* 555 */                               long j5 = jArr2[i14 % 20];
/* 559 */                               int i15 = (i14 + 1) % 20;
/* 565 */                               if (jArr2[i15] != j5) {
/* 570 */                                   i13++;
/* 596 */                                   float fSqrt2 = (f5 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(2.0f * Math.abs(f5)));
/* 605 */                                   float f6 = fArr[i15] / (jArr2[i15] - j5);
/* 614 */                                   float fAbs = (Math.abs(f6) * (f6 - fSqrt2)) + f5;
/* 618 */                                   if (i13 == z) {
/* 622 */                                       fAbs *= 0.5f;
                                            }
/* 623 */                                   f5 = fAbs;
                                        }
/* 624 */                               i12++;
/* 626 */                               z2 = z2;
/* 628 */                               z = true;
                                    }
/* 631 */                           z2 = z2;
/* 633 */                           float f7 = f5;
/* 654 */                           fSqrt = ((float) Math.sqrt(Math.abs(f7) * 2.0f)) * (f7 < 0.0f ? -1.0f : 1.0f);
                                }
/* 657 */                       f3 = fSqrt * 1000.0f;
/* 658 */                       a23Var2.f58c = f3;
/* 667 */                       if (f3 < (-Math.abs(f2))) {
/* 674 */                           a23Var2.f58c = -Math.abs(f2);
                                } else if (a23Var2.f58c > Math.abs(f2)) {
/* 691 */                           a23Var2.f58c = Math.abs(f2);
                                }
                            }
                        }
/* 467 */               fSqrt = 0.0f;
/* 657 */               f3 = fSqrt * 1000.0f;
/* 658 */               a23Var2.f58c = f3;
/* 667 */               if (f3 < (-Math.abs(f2))) {
/* 674 */                   a23Var2.f58c = -Math.abs(f2);
                        } else if (a23Var2.f58c > Math.abs(f2)) {
/* 691 */                   a23Var2.f58c = Math.abs(f2);
                        }
                    } else {
/* 694 */               z2 = z2;
                    }
/* 700 */           if (Build.VERSION.SDK_INT >= 34) {
/* 702 */               yVelocity = y13.m10083a(velocityTracker2, i);
                    } else if (i == 0) {
/* 709 */               yVelocity = velocityTracker2.getXVelocity();
                    } else if (i == 1) {
/* 717 */               yVelocity = velocityTracker2.getYVelocity();
                    } else {
/* 728 */               a23 a23Var3 = (a23) z13.f19906a.get(velocityTracker2);
/* 740 */               yVelocity = (a23Var3 == null || i != 26) ? 0.0f : a23Var3.f58c;
                    }
/* 746 */           float f8 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
/* 747 */           float fSignum = Math.signum(f8);
/* 751 */           if (z2 || (fSignum != Math.signum(m80Var.f13653d) && fSignum != 0.0f)) {
/* 771 */               nestedScrollView.f1271d.abortAnimation();
                    }
/* 785 */           if (Math.abs(f8) < iArr[0]) {
/* 787 */               return true;
                    }
/* 792 */           int i16 = iArr[1];
/* 801 */           float fMax = Math.max(-i16, Math.min(f8, i16));
/* 809 */           if (fMax == 0.0f) {
/* 811 */               f = 0.0f;
                    } else {
/* 816 */               nestedScrollView.f1271d.abortAnimation();
/* 820 */               nestedScrollView.m593d((int) fMax);
/* 823 */               f = fMax;
                    }
/* 824 */           m80Var.f13653d = f;
/* 826 */           return true;
                }

                /* JADX WARN: Code duplicated, block: B:34:0x0083  */
                /* JADX WARN: Code duplicated, block: B:36:0x008b  */
                /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
                /* JADX WARN: Code duplicated, block: B:62:0x0117  */
                /* JADX WARN: Code duplicated, block: B:70:0x012b  */
                @Override // android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    VelocityTracker velocityTracker;
                    VelocityTracker velocityTracker2;
/* 1 */             int action = motionEvent.getAction();
/* 5 */             boolean z = true;
/* 7 */             if (action == 2 && this.f1263V) {
/* 5 */                 return true;
                    }
/* 14 */            int i = action & 255;
/* 18 */            if (i == 0) {
/* 180 */               int y = (int) motionEvent.getY();
/* 185 */               int x = (int) motionEvent.getX();
/* 186 */               int childCount = getChildCount();
/* 190 */               OverScroller overScroller = this.f1271d;
/* 192 */               if (childCount > 0) {
/* 194 */                   int scrollY = getScrollY();
/* 198 */                   View childAt = getChildAt(0);
/* 207 */                   if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
/* 284 */                       if (!m604p(motionEvent) && overScroller.isFinished()) {
/* 293 */                           z = false;
                                }
/* 294 */                       this.f1263V = z;
/* 296 */                       velocityTracker = this.f1264W;
/* 298 */                       if (velocityTracker != null) {
/* 300 */                           velocityTracker.recycle();
/* 303 */                           this.f1264W = null;
                                }
                            } else {
/* 228 */                       this.f1279i = y;
/* 234 */                       this.f1276f0 = motionEvent.getPointerId(0);
/* 236 */                       VelocityTracker velocityTracker3 = this.f1264W;
/* 238 */                       if (velocityTracker3 == null) {
/* 244 */                           this.f1264W = VelocityTracker.obtain();
                                } else {
/* 247 */                           velocityTracker3.clear();
                                }
/* 252 */                       this.f1264W.addMovement(motionEvent);
/* 255 */                       overScroller.computeScrollOffset();
/* 262 */                       if (!m604p(motionEvent) && overScroller.isFinished()) {
/* 271 */                           z = false;
                                }
/* 272 */                       this.f1263V = z;
/* 276 */                       this.f1284m0.m7214g(2, 0);
                            }
                        } else {
/* 284 */                   if (!m604p(motionEvent)) {
/* 293 */                       z = false;
                            }
/* 294 */                   this.f1263V = z;
/* 296 */                   velocityTracker = this.f1264W;
/* 298 */                   if (velocityTracker != null) {
/* 300 */                       velocityTracker.recycle();
/* 303 */                       this.f1264W = null;
                            }
                        }
                    } else if (i == 1) {
/* 132 */               this.f1263V = false;
/* 134 */               this.f1276f0 = -1;
/* 136 */               velocityTracker2 = this.f1264W;
/* 138 */               if (velocityTracker2 != null) {
/* 140 */                   velocityTracker2.recycle();
/* 143 */                   this.f1264W = null;
                        }
/* 166 */               if (this.f1271d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
/* 168 */                   postInvalidateOnAnimation();
                        }
/* 171 */               m605q(0);
                    } else if (i == 2) {
/* 38 */                int i2 = this.f1276f0;
/* 40 */                if (i2 != -1) {
/* 44 */                    int iFindPointerIndex = motionEvent.findPointerIndex(i2);
/* 48 */                    if (iFindPointerIndex == -1) {
/* 71 */                        AbstractC1245n0.m4876d("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                            } else {
/* 80 */                        int y2 = (int) motionEvent.getY(iFindPointerIndex);
/* 91 */                        if (Math.abs(y2 - this.f1279i) > this.f1270c0 && (2 & getNestedScrollAxes()) == 0) {
/* 100 */                           this.f1263V = true;
/* 102 */                           this.f1279i = y2;
/* 106 */                           if (this.f1264W == null) {
/* 112 */                               this.f1264W = VelocityTracker.obtain();
                                    }
/* 116 */                           this.f1264W.addMovement(motionEvent);
/* 119 */                           this.f1280i0 = 0;
/* 121 */                           ViewParent parent = getParent();
/* 125 */                           if (parent != null) {
/* 127 */                               parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                        }
                    } else if (i == 3) {
/* 132 */               this.f1263V = false;
/* 134 */               this.f1276f0 = -1;
/* 136 */               velocityTracker2 = this.f1264W;
/* 138 */               if (velocityTracker2 != null) {
/* 140 */                   velocityTracker2.recycle();
/* 143 */                   this.f1264W = null;
                        }
/* 166 */               if (this.f1271d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
/* 168 */                   postInvalidateOnAnimation();
                        }
/* 171 */               m605q(0);
                    } else if (i == 6) {
/* 33 */                m597i(motionEvent);
                    }
/* 305 */           return this.f1263V;
                }

                @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int measuredHeight;
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             int i5 = 0;
/* 5 */             this.f1288v = false;
/* 7 */             View view = this.f1262U;
/* 9 */             if (view != null && m589f(view, this)) {
/* 17 */                View view2 = this.f1262U;
/* 19 */                Rect rect = this.f1269c;
/* 21 */                view2.getDrawingRect(rect);
/* 24 */                offsetDescendantRectToMyCoords(view2, rect);
/* 27 */                int iM591b = m591b(rect);
/* 31 */                if (iM591b != 0) {
/* 33 */                    scrollBy(0, iM591b);
                        }
                    }
/* 37 */            this.f1262U = null;
/* 41 */            if (!this.f1289w) {
/* 45 */                if (this.f1282k0 != null) {
/* 55 */                    scrollTo(getScrollX(), this.f1282k0.f1290a);
/* 58 */                    this.f1282k0 = null;
                        }
/* 64 */                if (getChildCount() > 0) {
/* 66 */                    View childAt = getChildAt(0);
/* 74 */                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 85 */                    measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        } else {
/* 87 */                    measuredHeight = 0;
                        }
/* 98 */                int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
/* 99 */                int scrollY = getScrollY();
/* 103 */               if (paddingTop < measuredHeight && scrollY >= 0) {
/* 115 */                   i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
                        }
/* 116 */               if (i5 != scrollY) {
/* 122 */                   scrollTo(getScrollX(), i5);
                        }
                    }
/* 133 */           scrollTo(getScrollX(), getScrollY());
/* 137 */           this.f1289w = true;
                }

                @Override // android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 6 */             if (this.f1266a0 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
/* 23 */                View childAt = getChildAt(0);
/* 31 */                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 33 */                int measuredHeight = childAt.getMeasuredHeight();
/* 56 */                int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
/* 57 */                if (measuredHeight < measuredHeight2) {
/* 86 */                    childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
                        }
                    }
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final boolean onNestedFling(View view, float f, float f2, boolean z) {
/* 1 */             if (z) {
/* 13 */                return false;
                    }
/* 5 */             dispatchNestedFling(0.0f, f2, true);
/* 9 */             m593d((int) f2);
/* 4 */             return true;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final boolean onNestedPreFling(View view, float f, float f2) {
/* 3 */             return this.f1284m0.m7209b(f, f2);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
/* 8 */             this.f1284m0.m7210c(i, i2, iArr, null, 0);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
/* 3 */             m596h(i4, 0, null);
                }

                @Override // p000.pm1
                public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
/* 2 */             rm1 rm1Var = this.f1283l0;
/* 4 */             if (i2 == 1) {
/* 6 */                 rm1Var.f16182b = i;
                    } else {
/* 9 */                 rm1Var.f16181a = i;
                    }
/* 14 */            this.f1284m0.m7214g(2, i2);
                }

                @Override // android.view.View
                public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
/* 1 */             super.scrollTo(i, i2);
                }

                @Override // android.view.ViewGroup
                public final boolean onRequestFocusInDescendants(int i, Rect rect) {
/* 2 */             if (i == 2) {
/* 4 */                 i = 130;
                    } else if (i == 1) {
/* 10 */                i = 33;
                    }
/* 28 */            View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
/* 33 */            if (viewFindNextFocus != null && m595g(viewFindNextFocus, 0, getHeight())) {
/* 47 */                return viewFindNextFocus.requestFocus(i, rect);
                    }
/* 32 */            return false;
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 15 */            super.onRestoreInstanceState(savedState.getSuperState());
/* 18 */            this.f1282k0 = savedState;
/* 20 */            requestLayout();
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 14 */            savedState.f1290a = getScrollY();
/* 16 */            return savedState;
                }

                @Override // android.view.View
                public final void onScrollChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onScrollChanged(i, i2, i3, i4);
/* 4 */             mm1 mm1Var = this.f1286o0;
/* 6 */             if (mm1Var != null) {
/* 8 */                 mm1Var.getClass();
                    }
                }

                @Override // android.view.View
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onSizeChanged(i, i2, i3, i4);
/* 4 */             View viewFindFocus = findFocus();
/* 8 */             if (viewFindFocus == null || this == viewFindFocus || !m595g(viewFindFocus, 0, i4)) {
/* 45 */                return;
                    }
/* 20 */            Rect rect = this.f1269c;
/* 22 */            viewFindFocus.getDrawingRect(rect);
/* 25 */            offsetDescendantRectToMyCoords(viewFindFocus, rect);
/* 28 */            int iM591b = m591b(rect);
/* 32 */            if (iM591b != 0) {
/* 36 */                if (this.f1268b0) {
/* 38 */                    m603o(0, iM591b, false);
                        } else {
/* 42 */                    scrollBy(0, iM591b);
                        }
                    }
                }

                @Override // p000.pm1
                public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
                    return (i & 2) != 0;
                }

                @Override // p000.pm1
                public final void onStopNestedScroll(View view, int i) {
/* 2 */             rm1 rm1Var = this.f1283l0;
/* 5 */             if (i == 1) {
/* 7 */                 rm1Var.f16182b = 0;
                    } else {
/* 10 */                rm1Var.f16181a = 0;
                    }
/* 12 */            m605q(i);
                }

                /* JADX WARN: Code duplicated, block: B:49:0x0120  */
                /* JADX WARN: Code duplicated, block: B:52:0x0128  */
                /* JADX WARN: Code duplicated, block: B:54:0x0130  */
                /* JADX WARN: Code duplicated, block: B:56:0x0136  */
                /* JADX WARN: Code duplicated, block: B:59:0x013d  */
                /* JADX WARN: Code duplicated, block: B:60:0x013f  */
                /* JADX WARN: Code duplicated, block: B:63:0x0144  */
                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    ViewParent parent;
                    float fM1242z;
                    int iRound;
                    int i;
                    int iAbs;
                    int i2;
                    ViewParent parent2;
/* 7 */             if (this.f1264W == null) {
/* 13 */                this.f1264W = VelocityTracker.obtain();
                    }
/* 15 */            int actionMasked = motionEvent.getActionMasked();
/* 20 */            if (actionMasked == 0) {
/* 22 */                this.f1280i0 = 0;
                    }
/* 24 */            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
/* 31 */            float f = 0.0f;
/* 32 */            motionEventObtain.offsetLocation(0.0f, this.f1280i0);
/* 35 */            om1 om1Var = this.f1284m0;
/* 39 */            if (actionMasked != 0) {
/* 43 */                EdgeEffect edgeEffect = this.f1273e;
/* 45 */                EdgeEffect edgeEffect2 = this.f1275f;
/* 47 */                if (actionMasked == 1) {
/* 344 */                   VelocityTracker velocityTracker = this.f1264W;
/* 351 */                   velocityTracker.computeCurrentVelocity(1000, this.f1274e0);
/* 360 */                   int yVelocity = (int) velocityTracker.getYVelocity(this.f1276f0);
/* 367 */                   if (Math.abs(yVelocity) >= this.f1272d0) {
/* 375 */                       if (b40.m1229m(edgeEffect) != 0.0f) {
/* 381 */                           if (m602n(edgeEffect, yVelocity)) {
/* 383 */                               edgeEffect.onAbsorb(yVelocity);
                                    } else {
/* 388 */                               m593d(-yVelocity);
                                    }
                                } else if (b40.m1229m(edgeEffect2) != 0.0f) {
/* 400 */                           int i3 = -yVelocity;
/* 405 */                           if (m602n(edgeEffect2, i3)) {
/* 407 */                               edgeEffect2.onAbsorb(i3);
                                    } else {
/* 411 */                               m593d(i3);
                                    }
                                } else {
/* 415 */                           int i4 = -yVelocity;
                                    float f2 = i4;
/* 421 */                           if (!om1Var.m7209b(0.0f, f2)) {
/* 423 */                               dispatchNestedFling(0.0f, f2, true);
/* 426 */                               m593d(i4);
                                    }
                                }
                            } else if (this.f1271d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
/* 456 */                       postInvalidateOnAnimation();
                            }
/* 459 */                   this.f1276f0 = -1;
/* 461 */                   this.f1263V = false;
/* 463 */                   VelocityTracker velocityTracker2 = this.f1264W;
/* 465 */                   if (velocityTracker2 != null) {
/* 467 */                       velocityTracker2.recycle();
/* 470 */                       this.f1264W = null;
                            }
/* 472 */                   m605q(0);
/* 475 */                   edgeEffect.onRelease();
/* 478 */                   edgeEffect2.onRelease();
                        } else if (actionMasked == 2) {
/* 164 */                   int iFindPointerIndex = motionEvent.findPointerIndex(this.f1276f0);
/* 168 */                   if (iFindPointerIndex == -1) {
/* 193 */                       AbstractC1245n0.m4876d("NestedScrollView", "Invalid pointerId=" + this.f1276f0 + " in onTouchEvent");
                            } else {
/* 202 */                       int y = (int) motionEvent.getY(iFindPointerIndex);
/* 205 */                       int i5 = this.f1279i - y;
/* 215 */                       float x = motionEvent.getX(iFindPointerIndex) / getWidth();
/* 222 */                       float height = i5 / getHeight();
/* 229 */                       if (b40.m1229m(edgeEffect) != 0.0f) {
/* 236 */                           fM1242z = -b40.m1242z(edgeEffect, -height, x);
/* 243 */                           if (b40.m1229m(edgeEffect) == 0.0f) {
/* 245 */                               edgeEffect.onRelease();
                                    }
                                } else if (b40.m1229m(edgeEffect2) != 0.0f) {
/* 261 */                           fM1242z = b40.m1242z(edgeEffect2, height, 1.0f - x);
/* 271 */                           if (b40.m1229m(edgeEffect2) == 0.0f) {
/* 273 */                               edgeEffect2.onRelease();
                                    }
                                } else {
/* 283 */                           iRound = Math.round(f * getHeight());
/* 287 */                           if (iRound != 0) {
/* 289 */                               invalidate();
                                    }
/* 292 */                           i = i5 - iRound;
/* 295 */                           if (!this.f1263V) {
/* 297 */                               iAbs = Math.abs(i);
/* 301 */                               i2 = this.f1270c0;
/* 303 */                               if (iAbs > i2) {
/* 305 */                                   parent2 = getParent();
/* 309 */                                   if (parent2 != null) {
/* 311 */                                       parent2.requestDisallowInterceptTouchEvent(true);
                                            }
/* 314 */                                   this.f1263V = true;
/* 316 */                                   if (i > 0) {
/* 318 */                                       i -= i2;
                                            } else {
/* 320 */                                       i += i2;
                                            }
                                        }
                                    }
/* 323 */                           if (this.f1263V) {
/* 330 */                               int iM601m = m601m(i, (int) motionEvent.getX(iFindPointerIndex), 0, false);
/* 335 */                               this.f1279i = y - iM601m;
/* 340 */                               this.f1280i0 += iM601m;
                                    }
                                }
/* 248 */                       f = fM1242z;
/* 283 */                       iRound = Math.round(f * getHeight());
/* 287 */                       if (iRound != 0) {
/* 289 */                           invalidate();
                                }
/* 292 */                       i = i5 - iRound;
/* 295 */                       if (!this.f1263V) {
/* 297 */                           iAbs = Math.abs(i);
/* 301 */                           i2 = this.f1270c0;
/* 303 */                           if (iAbs > i2) {
/* 305 */                               parent2 = getParent();
/* 309 */                               if (parent2 != null) {
/* 311 */                                   parent2.requestDisallowInterceptTouchEvent(true);
                                        }
/* 314 */                               this.f1263V = true;
/* 316 */                               if (i > 0) {
/* 318 */                                   i -= i2;
                                        } else {
/* 320 */                                   i += i2;
                                        }
                                    }
                                }
/* 323 */                       if (this.f1263V) {
/* 330 */                           int iM601m2 = m601m(i, (int) motionEvent.getX(iFindPointerIndex), 0, false);
/* 335 */                           this.f1279i = y - iM601m2;
/* 340 */                           this.f1280i0 += iM601m2;
                                }
                            }
                        } else if (actionMasked == 3) {
/* 101 */                   if (this.f1263V && getChildCount() > 0) {
/* 133 */                       if (this.f1271d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
/* 135 */                           postInvalidateOnAnimation();
                                }
                            }
/* 138 */                   this.f1276f0 = -1;
/* 140 */                   this.f1263V = false;
/* 142 */                   VelocityTracker velocityTracker3 = this.f1264W;
/* 144 */                   if (velocityTracker3 != null) {
/* 146 */                       velocityTracker3.recycle();
/* 149 */                       this.f1264W = null;
                            }
/* 151 */                   m605q(0);
/* 154 */                   edgeEffect.onRelease();
/* 157 */                   edgeEffect2.onRelease();
                        } else if (actionMasked == 5) {
/* 80 */                    int actionIndex = motionEvent.getActionIndex();
/* 89 */                    this.f1279i = (int) motionEvent.getY(actionIndex);
/* 95 */                    this.f1276f0 = motionEvent.getPointerId(actionIndex);
                        } else if (actionMasked == 6) {
/* 62 */                    m597i(motionEvent);
/* 76 */                    this.f1279i = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1276f0));
                        }
                    } else {
/* 486 */               if (getChildCount() == 0) {
/* 19 */                    return false;
                        }
/* 491 */               if (this.f1263V && (parent = getParent()) != null) {
/* 499 */                   parent.requestDisallowInterceptTouchEvent(true);
                        }
/* 502 */               OverScroller overScroller = this.f1271d;
/* 508 */               if (!overScroller.isFinished()) {
/* 510 */                   overScroller.abortAnimation();
/* 513 */                   m605q(1);
                        }
/* 520 */               int y2 = (int) motionEvent.getY();
/* 521 */               int pointerId = motionEvent.getPointerId(0);
/* 525 */               this.f1279i = y2;
/* 527 */               this.f1276f0 = pointerId;
/* 529 */               om1Var.m7214g(2, 0);
                    }
/* 532 */           VelocityTracker velocityTracker4 = this.f1264W;
/* 534 */           if (velocityTracker4 != null) {
/* 536 */               velocityTracker4.addMovement(motionEventObtain);
                    }
/* 539 */           motionEventObtain.recycle();
/* 38 */            return true;
                }

                /* JADX INFO: renamed from: p */
                public final boolean m604p(MotionEvent motionEvent) {
                    boolean z;
/* 1 */             EdgeEffect edgeEffect = this.f1273e;
/* 11 */            if (b40.m1229m(edgeEffect) != 0.0f) {
/* 23 */                b40.m1242z(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
/* 26 */                z = true;
                    } else {
/* 28 */                z = false;
                    }
/* 29 */            EdgeEffect edgeEffect2 = this.f1275f;
/* 37 */            if (b40.m1229m(edgeEffect2) == 0.0f) {
/* 56 */                return z;
                    }
/* 52 */            b40.m1242z(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
/* 10 */            return true;
                }

                /* JADX INFO: renamed from: q */
                public final void m605q(int i) {
/* 3 */             this.f1284m0.m7215h(i);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final void requestChildFocus(View view, View view2) {
/* 3 */             if (this.f1288v) {
/* 24 */                this.f1262U = view2;
                    } else {
/* 5 */                 Rect rect = this.f1269c;
/* 7 */                 view2.getDrawingRect(rect);
/* 10 */                offsetDescendantRectToMyCoords(view2, rect);
/* 13 */                int iM591b = m591b(rect);
/* 17 */                if (iM591b != 0) {
/* 20 */                    scrollBy(0, iM591b);
                        }
                    }
/* 26 */            super.requestChildFocus(view, view2);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
/* 19 */            rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
/* 22 */            int iM591b = m591b(rect);
/* 31 */            boolean z2 = iM591b != 0;
/* 32 */            if (z2) {
/* 34 */                if (z) {
/* 36 */                    scrollBy(0, iM591b);
/* 39 */                    return z2;
                        }
/* 40 */                m603o(0, iM591b, false);
                    }
/* 43 */            return z2;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final void requestDisallowInterceptTouchEvent(boolean z) {
                    VelocityTracker velocityTracker;
/* 1 */             if (z && (velocityTracker = this.f1264W) != null) {
/* 7 */                 velocityTracker.recycle();
/* 11 */                this.f1264W = null;
                    }
/* 13 */            super.requestDisallowInterceptTouchEvent(z);
                }

                @Override // android.view.View, android.view.ViewParent
                public final void requestLayout() {
/* 2 */             this.f1288v = true;
/* 4 */             super.requestLayout();
                }

                @Override // android.view.View
                public final void scrollTo(int i, int i2) {
/* 5 */             if (getChildCount() > 0) {
/* 8 */                 View childAt = getChildAt(0);
/* 16 */                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
/* 31 */                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
/* 41 */                int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
/* 55 */                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
/* 65 */                int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
/* 66 */                if (width >= width2 || i < 0) {
/* 78 */                    i = 0;
                        } else if (width + i > width2) {
/* 75 */                    i = width2 - width;
                        }
/* 79 */                if (height >= height2 || i2 < 0) {
/* 91 */                    i2 = 0;
                        } else if (height + i2 > height2) {
/* 88 */                    i2 = height2 - height;
                        }
/* 96 */                if (i == getScrollX() && i2 == getScrollY()) {
/* 107 */                   return;
                        }
/* 104 */               super.scrollTo(i, i2);
                    }
                }

                public void setFillViewport(boolean z) {
/* 3 */             if (z != this.f1266a0) {
/* 5 */                 this.f1266a0 = z;
/* 7 */                 requestLayout();
                    }
                }

                @Override // android.view.View
                public void setNestedScrollingEnabled(boolean z) {
/* 1 */             om1 om1Var = this.f1284m0;
/* 5 */             if (om1Var.f14823d) {
/* 7 */                 ViewGroup viewGroup = om1Var.f14822c;
/* 9 */                 WeakHashMap weakHashMap = e33.f7494a;
/* 11 */                s23.m8388z(viewGroup);
                    }
/* 14 */            om1Var.f14823d = z;
                }

                public void setOnScrollChangeListener(mm1 mm1Var) {
/* 1 */             this.f1286o0 = mm1Var;
                }

                public void setSmoothScrollingEnabled(boolean z) {
/* 1 */             this.f1268b0 = z;
                }

                @Override // android.widget.FrameLayout, android.view.ViewGroup
                public final boolean shouldDelayChildPressedState() {
/* 1 */             return true;
                }

                @Override // android.view.View
                public final boolean startNestedScroll(int i) {
/* 4 */             return this.f1284m0.m7214g(i, 0);
                }

                @Override // android.view.View
                public final void stopNestedScroll() {
/* 2 */             m605q(0);
                }

                @Override // p000.pm1
/* 6 */         public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
/* 7 */             m596h(i4, i5, null);
                }

                @Override // p000.qm1
/* 7 */         public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
/* 8 */             m596h(i4, i5, iArr);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
/* 8 */         public final boolean onStartNestedScroll(View view, View view2, int i) {
/* 9 */             return onStartNestedScroll(view, view2, i, 0);
                }

                @Override // p000.pm1
/* 11 */        public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
/* 12 */            this.f1284m0.m7210c(i, i2, iArr, null, i3);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
/* 15 */        public final void onStopNestedScroll(View view) {
/* 16 */            onStopNestedScroll(view, 0);
                }

                @Override // android.view.ViewGroup
/* 16 */        public final void addView(View view, int i) {
/* 17 */            if (getChildCount() <= 0) {
/* 18 */                super.addView(view, i);
                    } else {
/* 19 */                f42.m3656l("ScrollView can host only one direct child");
                    }
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
/* 17 */        public final void onNestedScrollAccepted(View view, View view2, int i) {
/* 18 */            onNestedScrollAccepted(view, view2, i, 0);
                }

                @Override // android.view.ViewGroup, android.view.ViewManager
/* 19 */        public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
/* 20 */            if (getChildCount() <= 0) {
/* 21 */                super.addView(view, layoutParams);
                    } else {
/* 22 */                f42.m3656l("ScrollView can host only one direct child");
                    }
                }

                @Override // android.view.ViewGroup
/* 22 */        public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 23 */            if (getChildCount() <= 0) {
/* 24 */                super.addView(view, i, layoutParams);
                    } else {
/* 25 */                f42.m3656l("ScrollView can host only one direct child");
                    }
                }

/* 194 */       public NestedScrollView(Context context, AttributeSet attributeSet) {
/* 195 */           this(context, attributeSet, R$attr.nestedScrollViewStyle);
                }
            }
