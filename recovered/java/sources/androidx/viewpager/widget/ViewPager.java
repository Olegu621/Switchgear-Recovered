            package androidx.viewpager.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.view.FocusFinder;
            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.view.SoundEffectConstants;
            import android.view.VelocityTracker;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.accessibility.AccessibilityEvent;
            import android.widget.EdgeEffect;
            import android.widget.Scroller;
            import androidx.customview.view.AbsSavedState;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.WeakHashMap;
            import p000.C2343wt;
            import p000.RunnableC2495ye;
            import p000.b43;
            import p000.c43;
            import p000.d43;
            import p000.e33;
            import p000.e43;
            import p000.f42;
            import p000.fm0;
            import p000.g12;
            import p000.r20;
            import p000.s23;
            import p000.v00;
            import p000.wa3;
            import p000.we2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public class ViewPager extends ViewGroup {

                /* JADX INFO: renamed from: L0 */
                public static final int[] f1948L0 = {R.attr.layout_gravity};

                /* JADX INFO: renamed from: M0 */
                public static final wa3 f1949M0 = new wa3(18);

                /* JADX INFO: renamed from: N0 */
                public static final g12 f1950N0 = new g12(2);

                /* JADX INFO: renamed from: A0 */
                public final EdgeEffect f1951A0;

                /* JADX INFO: renamed from: B0 */
                public final EdgeEffect f1952B0;

                /* JADX INFO: renamed from: C0 */
                public boolean f1953C0;

                /* JADX INFO: renamed from: D0 */
                public boolean f1954D0;

                /* JADX INFO: renamed from: E0 */
                public int f1955E0;

                /* JADX INFO: renamed from: F0 */
                public ArrayList f1956F0;

                /* JADX INFO: renamed from: G0 */
                public e43 f1957G0;

                /* JADX INFO: renamed from: H0 */
                public e43 f1958H0;

                /* JADX INFO: renamed from: I0 */
                public ArrayList f1959I0;

                /* JADX INFO: renamed from: J0 */
                public final RunnableC2495ye f1960J0;

                /* JADX INFO: renamed from: K0 */
                public int f1961K0;

                /* JADX INFO: renamed from: U */
                public final Scroller f1962U;

                /* JADX INFO: renamed from: V */
                public boolean f1963V;

                /* JADX INFO: renamed from: W */
                public r20 f1964W;

                /* JADX INFO: renamed from: a */
                public int f1965a;

                /* JADX INFO: renamed from: a0 */
                public int f1966a0;

                /* JADX INFO: renamed from: b */
                public final ArrayList f1967b;

                /* JADX INFO: renamed from: b0 */
                public Drawable f1968b0;

                /* JADX INFO: renamed from: c */
                public final c43 f1969c;

                /* JADX INFO: renamed from: c0 */
                public int f1970c0;

                /* JADX INFO: renamed from: d */
                public final Rect f1971d;

                /* JADX INFO: renamed from: d0 */
                public int f1972d0;

                /* JADX INFO: renamed from: e */
                public PagerAdapter f1973e;

                /* JADX INFO: renamed from: e0 */
                public float f1974e0;

                /* JADX INFO: renamed from: f */
                public int f1975f;

                /* JADX INFO: renamed from: f0 */
                public float f1976f0;

                /* JADX INFO: renamed from: g0 */
                public int f1977g0;

                /* JADX INFO: renamed from: h0 */
                public boolean f1978h0;

                /* JADX INFO: renamed from: i */
                public int f1979i;

                /* JADX INFO: renamed from: i0 */
                public boolean f1980i0;

                /* JADX INFO: renamed from: j0 */
                public boolean f1981j0;

                /* JADX INFO: renamed from: k0 */
                public int f1982k0;

                /* JADX INFO: renamed from: l0 */
                public boolean f1983l0;

                /* JADX INFO: renamed from: m0 */
                public boolean f1984m0;

                /* JADX INFO: renamed from: n0 */
                public final int f1985n0;

                /* JADX INFO: renamed from: o0 */
                public int f1986o0;

                /* JADX INFO: renamed from: p0 */
                public final int f1987p0;

                /* JADX INFO: renamed from: q0 */
                public float f1988q0;

                /* JADX INFO: renamed from: r0 */
                public float f1989r0;

                /* JADX INFO: renamed from: s0 */
                public float f1990s0;

                /* JADX INFO: renamed from: t0 */
                public float f1991t0;

                /* JADX INFO: renamed from: u0 */
                public int f1992u0;

                /* JADX INFO: renamed from: v */
                public Parcelable f1993v;

                /* JADX INFO: renamed from: v0 */
                public VelocityTracker f1994v0;

                /* JADX INFO: renamed from: w */
                public ClassLoader f1995w;

                /* JADX INFO: renamed from: w0 */
                public final int f1996w0;

                /* JADX INFO: renamed from: x0 */
                public final int f1997x0;

                /* JADX INFO: renamed from: y0 */
                public final int f1998y0;

                /* JADX INFO: renamed from: z0 */
                public final int f1999z0;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LayoutParams extends ViewGroup.LayoutParams {

                    /* JADX INFO: renamed from: a */
                    public boolean f2000a;

                    /* JADX INFO: renamed from: b */
                    public final int f2001b;

                    /* JADX INFO: renamed from: c */
                    public float f2002c;

                    /* JADX INFO: renamed from: d */
                    public boolean f2003d;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 5 */                 this.f2002c = 0.0f;
/* 9 */                 TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f1948L0);
/* 20 */                this.f2001b = typedArrayObtainStyledAttributes.getInteger(0, 48);
/* 22 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends AbsSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0148a();

                    /* JADX INFO: renamed from: c */
                    public int f2004c;

                    /* JADX INFO: renamed from: d */
                    public Parcelable f2005d;

                    /* JADX INFO: renamed from: e */
                    public final ClassLoader f2006e;

                    public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */                 super(parcel, classLoader);
/* 10 */                classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
/* 18 */                this.f2004c = parcel.readInt();
/* 24 */                this.f2005d = parcel.readParcelable(classLoader);
/* 26 */                this.f2006e = classLoader;
                    }

                    public final String toString() {
/* 5 */                 StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
/* 16 */                sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 21 */                sb.append(" position=");
/* 28 */                return fm0.m3786l(sb, this.f2004c, "}");
                    }

                    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeInt(this.f2004c);
/* 11 */                parcel.writeParcelable(this.f2005d, i);
                    }
                }

                public ViewPager(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 9 */             this.f1967b = new ArrayList();
/* 16 */            this.f1969c = new c43();
/* 23 */            this.f1971d = new Rect();
/* 26 */            this.f1979i = -1;
/* 29 */            this.f1993v = null;
/* 31 */            this.f1995w = null;
/* 36 */            this.f1974e0 = -3.4028235E38f;
/* 41 */            this.f1976f0 = Float.MAX_VALUE;
/* 44 */            this.f1982k0 = 1;
/* 46 */            this.f1992u0 = -1;
/* 48 */            this.f1953C0 = true;
/* 57 */            this.f1960J0 = new RunnableC2495ye(this, 28);
/* 60 */            this.f1961K0 = 0;
/* 62 */            setWillNotDraw(false);
/* 67 */            setDescendantFocusability(262144);
/* 70 */            setFocusable(true);
/* 73 */            Context context2 = getContext();
/* 84 */            this.f1962U = new Scroller(context2, f1950N0);
/* 86 */            ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
/* 98 */            float f = context2.getResources().getDisplayMetrics().density;
/* 104 */           this.f1987p0 = viewConfiguration.getScaledPagingTouchSlop();
/* 110 */           this.f1996w0 = (int) (400.0f * f);
/* 116 */           this.f1997x0 = viewConfiguration.getScaledMaximumFlingVelocity();
/* 123 */           this.f1951A0 = new EdgeEffect(context2);
/* 130 */           this.f1952B0 = new EdgeEffect(context2);
/* 136 */           this.f1998y0 = (int) (25.0f * f);
/* 142 */           this.f1999z0 = (int) (2.0f * f);
/* 148 */           this.f1985n0 = (int) (f * 16.0f);
/* 156 */           e33.m3318n(this, new C2343wt(this, 5));
/* 163 */           if (getImportantForAccessibility() == 0) {
/* 165 */               setImportantForAccessibility(1);
                    }
/* 173 */           s23.m8383u(this, new we2(this));
                }

                /* JADX INFO: renamed from: c */
                public static boolean m1119c(int i, int i2, int i3, View view, boolean z) {
                    int i4;
/* 4 */             if (!(view instanceof ViewGroup)) {
                        return z ? false : false;
                    }
/* 7 */             ViewGroup viewGroup = (ViewGroup) view;
/* 9 */             int scrollX = view.getScrollX();
/* 13 */            int scrollY = view.getScrollY();
/* 22 */            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
/* 24 */                View childAt = viewGroup.getChildAt(childCount);
/* 28 */                int i5 = i2 + scrollX;
/* 34 */                if (i5 < childAt.getLeft() || i5 >= childAt.getRight() || (i4 = i3 + scrollY) < childAt.getTop() || i4 >= childAt.getBottom() || !m1119c(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                        }
                    }
/* 83 */            if (z || !view.canScrollHorizontally(-i)) {
                    }
/* 3 */             return true;
                }

                private int getClientWidth() {
/* 14 */            return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                }

                private void setScrollingCacheEnabled(boolean z) {
/* 3 */             if (this.f1980i0 != z) {
/* 5 */                 this.f1980i0 = z;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final c43 m1120a(int i, int i2) {
/* 3 */             c43 c43Var = new c43();
/* 6 */             c43Var.f2697b = i;
/* 14 */            c43Var.f2696a = this.f1973e.instantiateItem((ViewGroup) this, i);
/* 22 */            c43Var.f2699d = this.f1973e.getPageWidth(i);
/* 24 */            ArrayList arrayList = this.f1967b;
/* 26 */            if (i2 < 0 || i2 >= arrayList.size()) {
/* 39 */                arrayList.add(c43Var);
/* 42 */                return c43Var;
                    }
/* 35 */            arrayList.add(i2, c43Var);
/* 38 */            return c43Var;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void addFocusables(ArrayList arrayList, int i, int i2) {
                    c43 c43VarM1126h;
/* 1 */             int size = arrayList.size();
/* 5 */             int descendantFocusability = getDescendantFocusability();
/* 11 */            if (descendantFocusability != 393216) {
/* 18 */                for (int i3 = 0; i3 < getChildCount(); i3++) {
/* 20 */                    View childAt = getChildAt(i3);
/* 28 */                    if (childAt.getVisibility() == 0 && (c43VarM1126h = m1126h(childAt)) != null && c43VarM1126h.f2697b == this.f1975f) {
/* 42 */                        childAt.addFocusables(arrayList, i, i2);
                            }
                        }
                    }
/* 50 */            if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
/* 67 */                if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
/* 81 */                    return;
                        }
/* 82 */                arrayList.add(this);
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void addTouchables(ArrayList arrayList) {
                    c43 c43VarM1126h;
/* 6 */             for (int i = 0; i < getChildCount(); i++) {
/* 8 */                 View childAt = getChildAt(i);
/* 16 */                if (childAt.getVisibility() == 0 && (c43VarM1126h = m1126h(childAt)) != null && c43VarM1126h.f2697b == this.f1975f) {
/* 30 */                    childAt.addTouchables(arrayList);
                        }
                    }
                }

                @Override // android.view.ViewGroup
                public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 5 */             if (!checkLayoutParams(layoutParams)) {
/* 7 */                 layoutParams = generateDefaultLayoutParams();
                    }
/* 12 */            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
/* 32 */            boolean z = layoutParams2.f2000a | (view.getClass().getAnnotation(b43.class) != null);
/* 33 */            layoutParams2.f2000a = z;
/* 37 */            if (!this.f1978h0) {
/* 53 */                super.addView(view, i, layoutParams);
                    } else if (z) {
/* 49 */                f42.m3656l("Cannot add pager decor view during layout");
                    } else {
/* 41 */                layoutParams2.f2003d = true;
/* 43 */                addViewInLayout(view, i, layoutParams);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
                /* JADX INFO: renamed from: b */
                public final boolean m1121b(int i) {
                    boolean zRequestFocus;
/* 1 */             View viewFindFocus = findFocus();
/* 6 */             if (viewFindFocus == this) {
/* 8 */                 viewFindFocus = null;
                        break;
                    }
/* 10 */            if (viewFindFocus != null) {
/* 12 */                ViewParent parent = viewFindFocus.getParent();
                        while (true) {
/* 18 */                    if (!(parent instanceof ViewGroup)) {
/* 30 */                        StringBuilder sb = new StringBuilder();
/* 41 */                        sb.append(viewFindFocus.getClass().getSimpleName());
/* 50 */                        for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
/* 54 */                            sb.append(" => ");
/* 65 */                            sb.append(parent2.getClass().getSimpleName());
                                }
/* 85 */                        AbstractC1245n0.m4876d("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
/* 8 */                         viewFindFocus = null;
                                break;
                            }
/* 20 */                    if (parent == this) {
                                break;
                            }
/* 23 */                    parent = parent.getParent();
                        }
                    }
/* 93 */            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
/* 97 */            boolean z = true;
/* 98 */            boolean zM1131m = false;
/* 103 */           if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
/* 107 */               Rect rect = this.f1971d;
/* 109 */               if (i == 17) {
/* 115 */                   int i2 = m1125g(rect, viewFindNextFocus).left;
/* 121 */                   int i3 = m1125g(rect, viewFindFocus).left;
/* 123 */                   if (viewFindFocus == null || i2 < i3) {
/* 138 */                       zRequestFocus = viewFindNextFocus.requestFocus();
                            } else {
/* 127 */                       int i4 = this.f1975f;
/* 129 */                       if (i4 > 0) {
/* 132 */                           this.f1981j0 = false;
/* 134 */                           m1139u(i4 - 1, 0, true, false);
                                } else {
/* 198 */                           z = false;
                                }
/* 199 */                       zM1131m = z;
                            }
                        } else if (i == 66) {
/* 167 */                   zRequestFocus = (viewFindFocus == null || m1125g(rect, viewFindNextFocus).left > m1125g(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m1131m();
                        }
/* 142 */               zM1131m = zRequestFocus;
                    } else if (i == 17 || i == 1) {
/* 187 */               int i5 = this.f1975f;
/* 189 */               if (i5 > 0) {
/* 192 */                   this.f1981j0 = false;
/* 194 */                   m1139u(i5 - 1, 0, true, false);
                        } else {
/* 198 */                   z = false;
                        }
/* 199 */               zM1131m = z;
                    } else if (i == 66 || i == 2) {
/* 182 */               zM1131m = m1131m();
                    }
/* 200 */           if (zM1131m) {
/* 206 */               playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
                    }
/* 209 */           return zM1131m;
                }

                @Override // android.view.View
                public final boolean canScrollHorizontally(int i) {
/* 4 */             if (this.f1973e == null) {
/* 3 */                 return false;
                    }
/* 7 */             int clientWidth = getClientWidth();
/* 11 */            int scrollX = getScrollX();
/* 16 */            if (i < 0) {
                        return scrollX > ((int) (((float) clientWidth) * this.f1974e0));
                    }
                    return i > 0 && scrollX < ((int) (((float) clientWidth) * this.f1976f0));
                }

                @Override // android.view.ViewGroup
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
                    return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
                }

                @Override // android.view.View
                public final void computeScroll() {
/* 2 */             this.f1963V = true;
/* 4 */             Scroller scroller = this.f1962U;
/* 10 */            if (scroller.isFinished() || !scroller.computeScrollOffset()) {
/* 60 */                m1122d(true);
/* 63 */                return;
                    }
/* 18 */            int scrollX = getScrollX();
/* 22 */            int scrollY = getScrollY();
/* 26 */            int currX = scroller.getCurrX();
/* 30 */            int currY = scroller.getCurrY();
/* 34 */            if (scrollX != currX || scrollY != currY) {
/* 38 */                scrollTo(currX, currY);
/* 45 */                if (!m1132n(currX)) {
/* 47 */                    scroller.abortAnimation();
/* 51 */                    scrollTo(0, currY);
                        }
                    }
/* 54 */            WeakHashMap weakHashMap = e33.f7494a;
/* 56 */            postInvalidateOnAnimation();
                }

                /* JADX INFO: renamed from: d */
                public final void m1122d(boolean z) {
/* 10 */            boolean z2 = this.f1961K0 == 2;
/* 11 */            if (z2) {
/* 13 */                setScrollingCacheEnabled(false);
/* 16 */                Scroller scroller = this.f1962U;
/* 22 */                if (!scroller.isFinished()) {
/* 24 */                    scroller.abortAnimation();
/* 27 */                    int scrollX = getScrollX();
/* 31 */                    int scrollY = getScrollY();
/* 35 */                    int currX = scroller.getCurrX();
/* 39 */                    int currY = scroller.getCurrY();
/* 43 */                    if (scrollX != currX || scrollY != currY) {
/* 47 */                        scrollTo(currX, currY);
/* 50 */                        if (currX != scrollX) {
/* 52 */                            m1132n(currX);
                                }
                            }
                        }
                    }
/* 55 */            this.f1981j0 = false;
/* 57 */            int i = 0;
                    while (true) {
/* 58 */                ArrayList arrayList = this.f1967b;
/* 64 */                if (i >= arrayList.size()) {
                            break;
                        }
/* 70 */                c43 c43Var = (c43) arrayList.get(i);
/* 74 */                if (c43Var.f2698c) {
/* 76 */                    c43Var.f2698c = false;
/* 78 */                    z2 = true;
                        }
/* 79 */                i++;
                    }
/* 82 */            if (z2) {
/* 84 */                RunnableC2495ye runnableC2495ye = this.f1960J0;
/* 86 */                if (!z) {
/* 94 */                    runnableC2495ye.run();
                        } else {
/* 88 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 90 */                    postOnAnimation(runnableC2495ye);
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:29:0x0061  */
                @Override // android.view.ViewGroup, android.view.View
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                    boolean zM1121b;
/* 6 */             if (!super.dispatchKeyEvent(keyEvent)) {
/* 13 */                if (keyEvent.getAction() != 0) {
/* 98 */                    zM1121b = false;
                        } else {
/* 15 */                    int keyCode = keyEvent.getKeyCode();
/* 22 */                    if (keyCode != 21) {
/* 26 */                        if (keyCode == 22) {
/* 68 */                            zM1121b = keyEvent.hasModifiers(2) ? m1131m() : m1121b(66);
                                } else if (keyCode != 61) {
/* 98 */                            zM1121b = false;
                                } else if (keyEvent.hasNoModifiers()) {
/* 39 */                            zM1121b = m1121b(2);
                                } else if (keyEvent.hasModifiers(1)) {
/* 50 */                            zM1121b = m1121b(1);
                                } else {
/* 98 */                            zM1121b = false;
                                }
                            } else if (keyEvent.hasModifiers(2)) {
/* 79 */                        int i = this.f1975f;
/* 81 */                        if (i > 0) {
/* 84 */                            this.f1981j0 = false;
/* 86 */                            m1139u(i - 1, 0, true, false);
/* 89 */                            zM1121b = true;
                                } else {
/* 98 */                            zM1121b = false;
                                }
                            } else {
/* 93 */                        zM1121b = m1121b(17);
                            }
                        }
/* 99 */                if (!zM1121b) {
/* 12 */                    return false;
                        }
                    }
/* 5 */             return true;
                }

                @Override // android.view.View
                public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                    c43 c43VarM1126h;
/* 7 */             if (accessibilityEvent.getEventType() == 4096) {
/* 9 */                 return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
                    }
/* 14 */            int childCount = getChildCount();
/* 20 */            for (int i = 0; i < childCount; i++) {
/* 22 */                View childAt = getChildAt(i);
/* 30 */                if (childAt.getVisibility() == 0 && (c43VarM1126h = m1126h(childAt)) != null && c43VarM1126h.f2697b == this.f1975f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
/* 50 */                    return true;
                        }
                    }
/* 18 */            return false;
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                    PagerAdapter pagerAdapter;
/* 1 */             super.draw(canvas);
/* 4 */             int overScrollMode = getOverScrollMode();
/* 8 */             EdgeEffect edgeEffect = this.f1952B0;
/* 10 */            EdgeEffect edgeEffect2 = this.f1951A0;
/* 12 */            boolean zDraw = false;
/* 13 */            if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f1973e) != null && pagerAdapter.getCount() > 1)) {
/* 40 */                if (!edgeEffect2.isFinished()) {
/* 42 */                    int iSave = canvas.save();
/* 59 */                    int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
/* 60 */                    int width = getWidth();
/* 66 */                    canvas.rotate(270.0f);
/* 80 */                    canvas.translate(getPaddingTop() + (-height), this.f1974e0 * width);
/* 83 */                    edgeEffect2.setSize(height, width);
/* 86 */                    zDraw = edgeEffect2.draw(canvas);
/* 90 */                    canvas.restoreToCount(iSave);
                        }
/* 97 */                if (!edgeEffect.isFinished()) {
/* 99 */                    int iSave2 = canvas.save();
/* 103 */                   int width2 = getWidth();
/* 120 */                   int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
/* 123 */                   canvas.rotate(90.0f);
/* 140 */                   canvas.translate(-getPaddingTop(), (-(this.f1976f0 + 1.0f)) * width2);
/* 143 */                   edgeEffect.setSize(height2, width2);
/* 150 */                   zDraw |= edgeEffect.draw(canvas);
/* 151 */                   canvas.restoreToCount(iSave2);
                        }
                    } else {
/* 29 */                edgeEffect2.finish();
/* 32 */                edgeEffect.finish();
                    }
/* 154 */           if (zDraw) {
/* 156 */               WeakHashMap weakHashMap = e33.f7494a;
/* 158 */               postInvalidateOnAnimation();
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             Drawable drawable = this.f1968b0;
/* 6 */             if (drawable == null || !drawable.isStateful()) {
/* 21 */                return;
                    }
/* 18 */            drawable.setState(getDrawableState());
                }

                /* JADX INFO: renamed from: e */
                public final void m1123e() {
/* 3 */             int count = this.f1973e.getCount();
/* 7 */             this.f1965a = count;
/* 9 */             ArrayList arrayList = this.f1967b;
/* 32 */            boolean z = arrayList.size() < (this.f1982k0 * 2) + 1 && arrayList.size() < count;
/* 33 */            int iMax = this.f1975f;
/* 35 */            int i = 0;
/* 36 */            boolean z2 = false;
/* 41 */            while (i < arrayList.size()) {
/* 47 */                c43 c43Var = (c43) arrayList.get(i);
/* 53 */                int itemPosition = this.f1973e.getItemPosition(c43Var.f2696a);
/* 58 */                if (itemPosition != -1) {
/* 62 */                    if (itemPosition == -2) {
/* 64 */                        arrayList.remove(i);
/* 67 */                        i--;
/* 69 */                        if (!z2) {
/* 73 */                            this.f1973e.startUpdate((ViewGroup) this);
/* 76 */                            z2 = true;
                                }
/* 83 */                        this.f1973e.destroyItem((ViewGroup) this, c43Var.f2697b, c43Var.f2696a);
/* 86 */                        int i2 = this.f1975f;
/* 90 */                        if (i2 == c43Var.f2697b) {
/* 98 */                            iMax = Math.max(0, Math.min(i2, count - 1));
                                }
                            } else {
/* 105 */                       int i3 = c43Var.f2697b;
/* 107 */                       if (i3 != itemPosition) {
/* 111 */                           if (i3 == this.f1975f) {
/* 113 */                               iMax = itemPosition;
                                    }
/* 114 */                           c43Var.f2697b = itemPosition;
                                }
                            }
/* 103 */                   z = true;
                        }
/* 117 */               i++;
                    }
/* 119 */           if (z2) {
/* 123 */               this.f1973e.finishUpdate((ViewGroup) this);
                    }
/* 128 */           Collections.sort(arrayList, f1949M0);
/* 131 */           if (z) {
/* 133 */               int childCount = getChildCount();
/* 138 */               for (int i4 = 0; i4 < childCount; i4++) {
/* 148 */                   LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
/* 152 */                   if (!layoutParams.f2000a) {
/* 155 */                       layoutParams.f2002c = 0.0f;
                            }
                        }
/* 160 */               m1139u(iMax, 0, false, true);
/* 163 */               requestLayout();
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m1124f(int i) {
/* 1 */             e43 e43Var = this.f1957G0;
/* 3 */             if (e43Var != null) {
/* 5 */                 e43Var.mo3184d(i);
                    }
/* 8 */             ArrayList arrayList = this.f1956F0;
/* 10 */            if (arrayList != null) {
/* 12 */                int size = arrayList.size();
/* 17 */                for (int i2 = 0; i2 < size; i2++) {
/* 25 */                    e43 e43Var2 = (e43) this.f1956F0.get(i2);
/* 27 */                    if (e43Var2 != null) {
/* 29 */                        e43Var2.mo3184d(i);
                            }
                        }
                    }
/* 35 */            e43 e43Var3 = this.f1958H0;
/* 37 */            if (e43Var3 != null) {
/* 39 */                e43Var3.mo3184d(i);
                    }
                }

                /* JADX INFO: renamed from: g */
                public final Rect m1125g(Rect rect, View view) {
/* 1 */             if (rect == null) {
/* 5 */                 rect = new Rect();
                    }
/* 8 */             if (view == null) {
/* 11 */                rect.set(0, 0, 0, 0);
/* 14 */                return rect;
                    }
/* 19 */            rect.left = view.getLeft();
/* 25 */            rect.right = view.getRight();
/* 31 */            rect.top = view.getTop();
/* 37 */            rect.bottom = view.getBottom();
/* 39 */            ViewParent parent = view.getParent();
/* 45 */            while ((parent instanceof ViewGroup) && parent != this) {
/* 49 */                ViewGroup viewGroup = (ViewGroup) parent;
/* 58 */                rect.left = viewGroup.getLeft() + rect.left;
/* 67 */                rect.right = viewGroup.getRight() + rect.right;
/* 76 */                rect.top = viewGroup.getTop() + rect.top;
/* 85 */                rect.bottom = viewGroup.getBottom() + rect.bottom;
/* 87 */                parent = viewGroup.getParent();
                    }
/* 92 */            return rect;
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 4 */             LayoutParams layoutParams = new LayoutParams(-1, -1);
/* 8 */             layoutParams.f2002c = 0.0f;
/* 10 */            return layoutParams;
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new LayoutParams(getContext(), attributeSet);
                }

                public PagerAdapter getAdapter() {
/* 1 */             return this.f1973e;
                }

                @Override // android.view.ViewGroup
                public final int getChildDrawingOrder(int i, int i2) {
/* 2 */             throw null;
                }

                public int getCurrentItem() {
/* 1 */             return this.f1975f;
                }

                public int getOffscreenPageLimit() {
/* 1 */             return this.f1982k0;
                }

                public int getPageMargin() {
/* 1 */             return this.f1966a0;
                }

                /* JADX INFO: renamed from: h */
                public final c43 m1126h(View view) {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 ArrayList arrayList = this.f1967b;
/* 8 */                 if (i >= arrayList.size()) {
/* 30 */                    return null;
                        }
/* 14 */                c43 c43Var = (c43) arrayList.get(i);
/* 24 */                if (this.f1973e.isViewFromObject(view, c43Var.f2696a)) {
/* 26 */                    return c43Var;
                        }
/* 27 */                i++;
                    }
                }

                /* JADX INFO: renamed from: i */
                public final c43 m1127i() {
                    c43 c43Var;
                    int i;
/* 1 */             int clientWidth = getClientWidth();
/* 5 */             float f = 0.0f;
/* 16 */            float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
/* 25 */            float f2 = clientWidth > 0 ? this.f1966a0 / clientWidth : 0.0f;
/* 30 */            int i2 = 0;
/* 31 */            boolean z = true;
/* 32 */            c43 c43Var2 = null;
/* 33 */            int i3 = -1;
/* 34 */            float f3 = 0.0f;
                    while (true) {
/* 35 */                ArrayList arrayList = this.f1967b;
/* 41 */                if (i2 >= arrayList.size()) {
                            break;
                        }
/* 47 */                c43 c43Var3 = (c43) arrayList.get(i2);
/* 49 */                if (z || c43Var3.f2697b == (i = i3 + 1)) {
/* 76 */                    c43Var = c43Var3;
                        } else {
/* 57 */                    float f4 = f + f3 + f2;
/* 58 */                    c43 c43Var4 = this.f1969c;
/* 60 */                    c43Var4.f2700e = f4;
/* 62 */                    c43Var4.f2697b = i;
/* 70 */                    c43Var4.f2699d = this.f1973e.getPageWidth(i);
/* 72 */                    i2--;
/* 74 */                    c43Var = c43Var4;
                        }
/* 77 */                f = c43Var.f2700e;
/* 82 */                float f5 = c43Var.f2699d + f + f2;
/* 83 */                if (!z && scrollX < f) {
                            break;
                        }
/* 91 */                if (scrollX < f5 || i2 == arrayList.size() - 1) {
/* 113 */                   return c43Var;
                        }
/* 101 */               int i4 = c43Var.f2697b;
/* 103 */               float f6 = c43Var.f2699d;
/* 105 */               i2++;
/* 107 */               c43 c43Var5 = c43Var;
/* 108 */               i3 = i4;
/* 109 */               f3 = f6;
/* 110 */               c43Var2 = c43Var5;
/* 111 */               z = false;
                    }
/* 114 */           return c43Var2;
                }

                /* JADX INFO: renamed from: j */
                public final c43 m1128j(int i) {
/* 1 */             int i2 = 0;
                    while (true) {
/* 2 */                 ArrayList arrayList = this.f1967b;
/* 8 */                 if (i2 >= arrayList.size()) {
/* 24 */                    return null;
                        }
/* 14 */                c43 c43Var = (c43) arrayList.get(i2);
/* 18 */                if (c43Var.f2697b == i) {
/* 20 */                    return c43Var;
                        }
/* 21 */                i2++;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:22:0x0065  */
                /* JADX INFO: renamed from: k */
                public final void m1129k(int i, float f, int i2) {
                    int iMax;
                    int width;
                    int left;
/* 5 */             if (this.f1955E0 > 0) {
/* 7 */                 int scrollX = getScrollX();
/* 11 */                int paddingLeft = getPaddingLeft();
/* 15 */                int paddingRight = getPaddingRight();
/* 19 */                int width2 = getWidth();
/* 23 */                int childCount = getChildCount();
/* 28 */                for (int i3 = 0; i3 < childCount; i3++) {
/* 30 */                    View childAt = getChildAt(i3);
/* 38 */                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 42 */                    if (layoutParams.f2000a) {
/* 47 */                        int i4 = layoutParams.f2001b & 7;
/* 49 */                        if (i4 != 1) {
/* 52 */                            if (i4 == 3) {
/* 79 */                                width = childAt.getWidth() + paddingLeft;
                                    } else if (i4 != 5) {
/* 57 */                                width = paddingLeft;
                                    } else {
/* 65 */                                iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
/* 70 */                                paddingRight += childAt.getMeasuredWidth();
                                    }
/* 99 */                            left = (paddingLeft + scrollX) - childAt.getLeft();
/* 100 */                           if (left != 0) {
/* 102 */                               childAt.offsetLeftAndRight(left);
                                    }
/* 105 */                           paddingLeft = width;
                                } else {
/* 89 */                            iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                                }
/* 71 */                        int i5 = iMax;
/* 72 */                        width = paddingLeft;
/* 73 */                        paddingLeft = i5;
/* 99 */                        left = (paddingLeft + scrollX) - childAt.getLeft();
/* 100 */                       if (left != 0) {
/* 102 */                           childAt.offsetLeftAndRight(left);
                                }
/* 105 */                       paddingLeft = width;
                            }
                        }
                    }
/* 109 */           e43 e43Var = this.f1957G0;
/* 111 */           if (e43Var != null) {
/* 113 */               e43Var.mo3182b(f, i);
                    }
/* 116 */           ArrayList arrayList = this.f1956F0;
/* 118 */           if (arrayList != null) {
/* 120 */               int size = arrayList.size();
/* 124 */               for (int i6 = 0; i6 < size; i6++) {
/* 132 */                   e43 e43Var2 = (e43) this.f1956F0.get(i6);
/* 134 */                   if (e43Var2 != null) {
/* 136 */                       e43Var2.mo3182b(f, i);
                            }
                        }
                    }
/* 142 */           e43 e43Var3 = this.f1958H0;
/* 144 */           if (e43Var3 != null) {
/* 146 */               e43Var3.mo3182b(f, i);
                    }
/* 149 */           this.f1954D0 = true;
                }

                /* JADX INFO: renamed from: l */
                public final void m1130l(MotionEvent motionEvent) {
/* 1 */             int actionIndex = motionEvent.getActionIndex();
/* 11 */            if (motionEvent.getPointerId(actionIndex) == this.f1992u0) {
/* 17 */                int i = actionIndex == 0 ? 1 : 0;
/* 22 */                this.f1988q0 = motionEvent.getX(i);
/* 28 */                this.f1992u0 = motionEvent.getPointerId(i);
/* 30 */                VelocityTracker velocityTracker = this.f1994v0;
/* 32 */                if (velocityTracker != null) {
/* 34 */                    velocityTracker.clear();
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public final boolean m1131m() {
/* 1 */             PagerAdapter pagerAdapter = this.f1973e;
/* 4 */             if (pagerAdapter == null || this.f1975f >= pagerAdapter.getCount() - 1) {
/* 3 */                 return false;
                    }
/* 18 */            int i = this.f1975f + 1;
/* 19 */            this.f1981j0 = false;
/* 21 */            m1139u(i, 0, true, false);
/* 12 */            return true;
                }

                /* JADX INFO: renamed from: n */
                public final boolean m1132n(int i) {
/* 10 */            if (this.f1967b.size() == 0) {
/* 14 */                if (!this.f1953C0) {
/* 17 */                    this.f1954D0 = false;
/* 20 */                    m1129k(0, 0.0f, 0);
/* 25 */                    if (!this.f1954D0) {
/* 28 */                        f42.m3656l("onPageScrolled did not call superclass implementation");
/* 9 */                         return false;
                            }
                        }
/* 9 */                 return false;
                    }
/* 32 */            c43 c43VarM1127i = m1127i();
/* 36 */            int clientWidth = getClientWidth();
/* 40 */            int i2 = this.f1966a0;
/* 42 */            int i3 = clientWidth + i2;
                    float f = clientWidth;
/* 47 */            int i4 = c43VarM1127i.f2697b;
/* 57 */            float f2 = ((i / f) - c43VarM1127i.f2700e) / (c43VarM1127i.f2699d + (i2 / f));
/* 61 */            this.f1954D0 = false;
/* 63 */            m1129k(i4, f2, (int) (i3 * f2));
/* 68 */            if (this.f1954D0) {
/* 70 */                return true;
                    }
/* 72 */            f42.m3656l("onPageScrolled did not call superclass implementation");
/* 9 */             return false;
                }

                /* JADX INFO: renamed from: o */
                public final boolean m1133o(float f) {
                    boolean z;
                    boolean z2;
/* 3 */             float f2 = this.f1988q0 - f;
/* 4 */             this.f1988q0 = f;
/* 11 */            float scrollX = getScrollX() + f2;
/* 12 */            float clientWidth = getClientWidth();
/* 19 */            float f3 = this.f1974e0 * clientWidth;
/* 22 */            float f4 = this.f1976f0 * clientWidth;
/* 23 */            ArrayList arrayList = this.f1967b;
/* 25 */            boolean z3 = false;
/* 30 */            c43 c43Var = (c43) arrayList.get(0);
/* 42 */            c43 c43Var2 = (c43) arrayList.get(arrayList.size() - 1);
/* 46 */            if (c43Var.f2697b != 0) {
/* 50 */                f3 = c43Var.f2700e * clientWidth;
/* 51 */                z = false;
                    } else {
/* 53 */                z = true;
                    }
/* 63 */            if (c43Var2.f2697b != this.f1973e.getCount() - 1) {
/* 67 */                f4 = c43Var2.f2700e * clientWidth;
/* 68 */                z2 = false;
                    } else {
/* 70 */                z2 = true;
                    }
/* 73 */            if (scrollX < f3) {
/* 75 */                if (z) {
/* 86 */                    this.f1951A0.onPull(Math.abs(f3 - scrollX) / clientWidth);
/* 89 */                    z3 = true;
                        }
/* 90 */                scrollX = f3;
                    } else if (scrollX > f4) {
/* 96 */                if (z2) {
/* 106 */                   this.f1952B0.onPull(Math.abs(scrollX - f4) / clientWidth);
/* 109 */                   z3 = true;
                        }
/* 110 */               scrollX = f4;
                    }
/* 113 */           int i = (int) scrollX;
/* 117 */           this.f1988q0 = (scrollX - i) + this.f1988q0;
/* 123 */           scrollTo(i, getScrollY());
/* 126 */           m1132n(i);
/* 129 */           return z3;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 5 */             this.f1953C0 = true;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 3 */             removeCallbacks(this.f1960J0);
/* 6 */             Scroller scroller = this.f1962U;
/* 8 */             if (scroller != null && !scroller.isFinished()) {
/* 16 */                scroller.abortAnimation();
                    }
/* 19 */            super.onDetachedFromWindow();
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
                    int i;
                    float f;
/* 3 */             super.onDraw(canvas);
/* 8 */             if (this.f1966a0 <= 0 || this.f1968b0 == null) {
/* 168 */               return;
                    }
/* 14 */            ArrayList arrayList = this.f1967b;
/* 20 */            if (arrayList.size() <= 0 || this.f1973e == null) {
/* 168 */               return;
                    }
/* 26 */            int scrollX = getScrollX();
/* 30 */            int width = getWidth();
                    float f2 = width;
/* 38 */            float f3 = this.f1966a0 / f2;
/* 39 */            int i2 = 0;
/* 44 */            c43 c43Var = (c43) arrayList.get(0);
/* 46 */            float f4 = c43Var.f2700e;
/* 48 */            int size = arrayList.size();
/* 52 */            int i3 = c43Var.f2697b;
/* 62 */            int i4 = ((c43) arrayList.get(size - 1)).f2697b;
/* 64 */            while (i3 < i4) {
                        while (true) {
/* 66 */                    i = c43Var.f2697b;
/* 68 */                    if (i3 <= i || i2 >= size) {
                                break;
                            }
/* 72 */                    i2++;
/* 78 */                    c43Var = (c43) arrayList.get(i2);
                        }
/* 81 */                if (i3 == i) {
/* 83 */                    float f5 = c43Var.f2700e;
/* 85 */                    float f6 = c43Var.f2699d;
/* 89 */                    f = (f5 + f6) * f2;
/* 91 */                    f4 = f5 + f6 + f3;
                        } else {
/* 95 */                    float pageWidth = this.f1973e.getPageWidth(i3);
/* 101 */                   f = (f4 + pageWidth) * f2;
/* 103 */                   f4 = pageWidth + f3 + f4;
                        }
/* 112 */               if (this.f1966a0 + f > scrollX) {
/* 136 */                   this.f1968b0.setBounds(Math.round(f), this.f1970c0, Math.round(this.f1966a0 + f), this.f1972d0);
/* 143 */                   this.f1968b0.draw(canvas);
                        }
/* 158 */               if (f > scrollX + width) {
/* 168 */                   return;
                        }
/* 161 */               i3++;
/* 163 */               arrayList = arrayList;
/* 165 */               scrollX = scrollX;
                    }
                }

                @Override // android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
/* 5 */             int action = motionEvent.getAction() & 255;
/* 9 */             if (action == 3 || action == 1) {
/* 291 */               m1137s();
/* 8 */                 return false;
                    }
/* 16 */            if (action != 0) {
/* 20 */                if (this.f1983l0) {
/* 11 */                    return true;
                        }
/* 25 */                if (this.f1984m0) {
/* 8 */                     return false;
                        }
                    }
/* 29 */            if (action == 0) {
/* 193 */               float x = motionEvent.getX();
/* 197 */               this.f1990s0 = x;
/* 199 */               this.f1988q0 = x;
/* 201 */               float y = motionEvent.getY();
/* 205 */               this.f1991t0 = y;
/* 207 */               this.f1989r0 = y;
/* 213 */               this.f1992u0 = motionEvent.getPointerId(0);
/* 215 */               this.f1984m0 = false;
/* 217 */               this.f1963V = true;
/* 219 */               Scroller scroller = this.f1962U;
/* 221 */               scroller.computeScrollOffset();
/* 226 */               if (this.f1961K0 != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.f1999z0) {
/* 268 */                   m1122d(false);
/* 271 */                   this.f1983l0 = false;
                        } else {
/* 245 */                   scroller.abortAnimation();
/* 248 */                   this.f1981j0 = false;
/* 250 */                   m1134p();
/* 253 */                   this.f1983l0 = true;
/* 255 */                   ViewParent parent = getParent();
/* 259 */                   if (parent != null) {
/* 261 */                       parent.requestDisallowInterceptTouchEvent(true);
                            }
/* 264 */                   setScrollState(1);
                        }
                    } else if (action == 2) {
/* 43 */                int i = this.f1992u0;
/* 46 */                if (i != -1) {
/* 50 */                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
/* 54 */                    float x2 = motionEvent.getX(iFindPointerIndex);
/* 60 */                    float f = x2 - this.f1988q0;
/* 62 */                    float fAbs = Math.abs(f);
/* 66 */                    float y2 = motionEvent.getY(iFindPointerIndex);
/* 74 */                    float fAbs2 = Math.abs(y2 - this.f1991t0);
/* 81 */                    if (f != 0.0f) {
/* 83 */                        float f2 = this.f1988q0;
/* 90 */                        if ((f2 >= this.f1986o0 || f <= 0.0f) && ((f2 <= getWidth() - this.f1986o0 || f >= 0.0f) && m1119c((int) f, (int) x2, (int) y2, this, false))) {
/* 120 */                           this.f1988q0 = x2;
/* 122 */                           this.f1989r0 = y2;
/* 124 */                           this.f1984m0 = true;
/* 8 */                             return false;
                                }
                            }
/* 127 */                   int i2 = this.f1987p0;
                            float f3 = i2;
/* 132 */                   if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
/* 141 */                       this.f1983l0 = true;
/* 143 */                       ViewParent parent2 = getParent();
/* 147 */                       if (parent2 != null) {
/* 149 */                           parent2.requestDisallowInterceptTouchEvent(true);
                                }
/* 152 */                       setScrollState(1);
/* 155 */                       float f4 = this.f1990s0;
                                float f5 = i2;
/* 163 */                       this.f1988q0 = f > 0.0f ? f4 + f5 : f4 - f5;
/* 165 */                       this.f1989r0 = y2;
/* 167 */                       setScrollingCacheEnabled(true);
                            } else if (fAbs2 > f3) {
/* 175 */                       this.f1984m0 = true;
                            }
/* 179 */                   if (this.f1983l0 && m1133o(x2)) {
/* 187 */                       WeakHashMap weakHashMap = e33.f7494a;
/* 189 */                       postInvalidateOnAnimation();
                            }
                        }
                    } else if (action == 6) {
/* 38 */                m1130l(motionEvent);
                    }
/* 275 */           if (this.f1994v0 == null) {
/* 281 */               this.f1994v0 = VelocityTracker.obtain();
                    }
/* 285 */           this.f1994v0.addMovement(motionEvent);
/* 288 */           return this.f1983l0;
                }

                /* JADX WARN: Code duplicated, block: B:22:0x0072  */
                /* JADX WARN: Code duplicated, block: B:24:0x0076  */
                /* JADX WARN: Code duplicated, block: B:26:0x007a  */
                /* JADX WARN: Code duplicated, block: B:27:0x007c  */
                /* JADX WARN: Code duplicated, block: B:29:0x008e  */
                /* JADX WARN: Code duplicated, block: B:30:0x0094  */
                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    boolean z2;
                    c43 c43VarM1126h;
                    int iMax;
                    int measuredWidth;
                    int iMax2;
                    int measuredHeight;
/* 3 */             int childCount = getChildCount();
/* 7 */             int i5 = i3 - i;
/* 9 */             int i6 = i4 - i2;
/* 11 */            int paddingLeft = getPaddingLeft();
/* 15 */            int paddingTop = getPaddingTop();
/* 19 */            int paddingRight = getPaddingRight();
/* 23 */            int paddingBottom = getPaddingBottom();
/* 27 */            int scrollX = getScrollX();
/* 32 */            int i7 = 0;
/* 35 */            for (int i8 = 0; i8 < childCount; i8++) {
/* 37 */                View childAt = getChildAt(i8);
/* 45 */                if (childAt.getVisibility() != 8) {
/* 51 */                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 55 */                    if (layoutParams.f2000a) {
/* 57 */                        int i9 = layoutParams.f2001b;
/* 59 */                        int i10 = i9 & 7;
/* 61 */                        int i11 = i9 & 112;
/* 64 */                        if (i10 != 1) {
/* 67 */                            if (i10 == 3) {
/* 96 */                                measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                                    } else if (i10 != 5) {
/* 72 */                                measuredWidth = paddingLeft;
                                    } else {
/* 80 */                                iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
/* 85 */                                paddingRight += childAt.getMeasuredWidth();
                                    }
/* 113 */                           if (i11 != 16) {
/* 117 */                               if (i11 != 48) {
/* 147 */                                   measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                                        } else if (i11 != 80) {
/* 123 */                                   measuredHeight = paddingTop;
                                        } else {
/* 131 */                                   iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
/* 136 */                                   paddingBottom += childAt.getMeasuredHeight();
                                        }
/* 162 */                               int i12 = paddingLeft + scrollX;
/* 174 */                               childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
/* 177 */                               i7++;
/* 179 */                               paddingTop = measuredHeight;
/* 180 */                               paddingLeft = measuredWidth;
                                    } else {
/* 157 */                               iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                                    }
/* 137 */                           int i13 = iMax2;
/* 139 */                           measuredHeight = paddingTop;
/* 140 */                           paddingTop = i13;
/* 162 */                           int i14 = paddingLeft + scrollX;
/* 174 */                           childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
/* 177 */                           i7++;
/* 179 */                           paddingTop = measuredHeight;
/* 180 */                           paddingLeft = measuredWidth;
                                } else {
/* 106 */                           iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                                }
/* 86 */                        int i15 = iMax;
/* 88 */                        measuredWidth = paddingLeft;
/* 89 */                        paddingLeft = i15;
/* 113 */                       if (i11 != 16) {
/* 117 */                           if (i11 != 48) {
/* 147 */                               measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                                    } else if (i11 != 80) {
/* 123 */                               measuredHeight = paddingTop;
                                    } else {
/* 131 */                               iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
/* 136 */                               paddingBottom += childAt.getMeasuredHeight();
                                    }
/* 162 */                           int i16 = paddingLeft + scrollX;
/* 174 */                           childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
/* 177 */                           i7++;
/* 179 */                           paddingTop = measuredHeight;
/* 180 */                           paddingLeft = measuredWidth;
                                } else {
/* 157 */                           iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                                }
/* 137 */                       int i17 = iMax2;
/* 139 */                       measuredHeight = paddingTop;
/* 140 */                       paddingTop = i17;
/* 162 */                       int i18 = paddingLeft + scrollX;
/* 174 */                       childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
/* 177 */                       i7++;
/* 179 */                       paddingTop = measuredHeight;
/* 180 */                       paddingLeft = measuredWidth;
                            }
                        }
                    }
/* 186 */           int i19 = (i5 - paddingLeft) - paddingRight;
/* 188 */           for (int i20 = 0; i20 < childCount; i20++) {
/* 190 */               View childAt2 = getChildAt(i20);
/* 198 */               if (childAt2.getVisibility() != 8) {
/* 204 */                   LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
/* 208 */                   if (!layoutParams2.f2000a && (c43VarM1126h = m1126h(childAt2)) != null) {
                                float f = i19;
/* 221 */                       int i21 = ((int) (c43VarM1126h.f2700e * f)) + paddingLeft;
/* 224 */                       if (layoutParams2.f2003d) {
/* 227 */                           layoutParams2.f2003d = false;
/* 246 */                           childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f2002c), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                                }
/* 259 */                       childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                            }
                        }
                    }
/* 265 */           this.f1970c0 = paddingTop;
/* 268 */           this.f1972d0 = i6 - paddingBottom;
/* 270 */           this.f1955E0 = i7;
/* 274 */           if (this.f1953C0) {
/* 278 */               z2 = false;
/* 279 */               m1138t(this.f1975f, 0, false, false);
                    } else {
/* 283 */               z2 = false;
                    }
/* 284 */           this.f1953C0 = z2;
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
                    LayoutParams layoutParams;
                    LayoutParams layoutParams2;
                    int i3;
/* 10 */            setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
/* 13 */            int measuredWidth = getMeasuredWidth();
/* 25 */            this.f1986o0 = Math.min(measuredWidth / 10, this.f1985n0);
/* 36 */            int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
/* 50 */            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
/* 51 */            int childCount = getChildCount();
/* 55 */            int i4 = 0;
                    while (true) {
/* 58 */                boolean z = true;
/* 59 */                int i5 = 1073741824;
/* 61 */                if (i4 >= childCount) {
                            break;
                        }
/* 63 */                View childAt = getChildAt(i4);
/* 71 */                if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f2000a) {
/* 85 */                    int i6 = layoutParams2.f2001b;
/* 87 */                    int i7 = i6 & 7;
/* 89 */                    int i8 = i6 & 112;
/* 102 */                   boolean z2 = i8 == 48 || i8 == 80;
/* 104 */                   if (i7 != 3 && i7 != 5) {
/* 110 */                       z = false;
                            }
/* 111 */                   int i9 = Integer.MIN_VALUE;
/* 113 */                   if (z2) {
/* 115 */                       i3 = Integer.MIN_VALUE;
/* 116 */                       i9 = 1073741824;
                            } else {
/* 122 */                       i3 = z ? 1073741824 : Integer.MIN_VALUE;
                            }
/* 123 */                   int i10 = ((ViewGroup.LayoutParams) layoutParams2).width;
/* 127 */                   if (i10 != -2) {
/* 129 */                       if (i10 == -1) {
/* 133 */                           i10 = paddingLeft;
                                }
/* 131 */                       i9 = 1073741824;
                            } else {
/* 135 */                       i10 = paddingLeft;
                            }
/* 136 */                   int i11 = ((ViewGroup.LayoutParams) layoutParams2).height;
/* 138 */                   if (i11 == -2) {
/* 145 */                       i11 = measuredHeight;
/* 146 */                       i5 = i3;
                            } else if (i11 == -1) {
/* 143 */                       i11 = measuredHeight;
                            }
/* 155 */                   childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
/* 158 */                   if (z2) {
/* 164 */                       measuredHeight -= childAt.getMeasuredHeight();
                            } else if (z) {
/* 172 */                       paddingLeft -= childAt.getMeasuredWidth();
                            }
                        }
/* 173 */               i4++;
                    }
/* 176 */           View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
/* 183 */           this.f1977g0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
/* 185 */           this.f1978h0 = true;
/* 187 */           m1134p();
/* 190 */           this.f1978h0 = false;
/* 192 */           int childCount2 = getChildCount();
/* 196 */           for (int i12 = 0; i12 < childCount2; i12++) {
/* 198 */               View childAt2 = getChildAt(i12);
/* 206 */               if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f2000a)) {
/* 231 */                   childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f2002c), 1073741824), this.f1977g0);
                        }
                    }
                }

                @Override // android.view.ViewGroup
                public final boolean onRequestFocusInDescendants(int i, Rect rect) {
                    int i2;
                    int i3;
                    int i4;
                    c43 c43VarM1126h;
/* 1 */             int childCount = getChildCount();
/* 9 */             if ((i & 2) != 0) {
/* 11 */                i3 = childCount;
/* 12 */                i2 = 0;
/* 13 */                i4 = 1;
                    } else {
/* 15 */                i2 = childCount - 1;
/* 17 */                i3 = -1;
/* 18 */                i4 = -1;
                    }
/* 19 */            while (i2 != i3) {
/* 21 */                View childAt = getChildAt(i2);
/* 29 */                if (childAt.getVisibility() == 0 && (c43VarM1126h = m1126h(childAt)) != null && c43VarM1126h.f2697b == this.f1975f && childAt.requestFocus(i, rect)) {
/* 8 */                     return true;
                        }
/* 50 */                i2 += i4;
                    }
/* 7 */             return false;
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 11 */            ClassLoader classLoader = savedState.f2006e;
/* 15 */            super.onRestoreInstanceState(savedState.f1292a);
/* 18 */            PagerAdapter pagerAdapter = this.f1973e;
/* 20 */            if (pagerAdapter != null) {
/* 24 */                pagerAdapter.restoreState(savedState.f2005d, classLoader);
/* 31 */                m1139u(savedState.f2004c, 0, false, true);
                    } else {
/* 37 */                this.f1979i = savedState.f2004c;
/* 41 */                this.f1993v = savedState.f2005d;
/* 43 */                this.f1995w = classLoader;
                    }
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 12 */            savedState.f2004c = this.f1975f;
/* 14 */            PagerAdapter pagerAdapter = this.f1973e;
/* 16 */            if (pagerAdapter != null) {
/* 22 */                savedState.f2005d = pagerAdapter.saveState();
                    }
/* 24 */            return savedState;
                }

                @Override // android.view.View
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onSizeChanged(i, i2, i3, i4);
/* 4 */             if (i != i3) {
/* 6 */                 int i5 = this.f1966a0;
/* 8 */                 m1136r(i, i3, i5, i5);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:53:0x00da  */
                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    PagerAdapter pagerAdapter;
/* 5 */             boolean zM1137s = false;
/* 6 */             if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.f1973e) == null || pagerAdapter.getCount() == 0) {
/* 5 */                 return false;
                    }
/* 30 */            if (this.f1994v0 == null) {
/* 36 */                this.f1994v0 = VelocityTracker.obtain();
                    }
/* 40 */            this.f1994v0.addMovement(motionEvent);
/* 47 */            int action = motionEvent.getAction() & 255;
/* 50 */            if (action == 0) {
/* 383 */               this.f1962U.abortAnimation();
/* 386 */               this.f1981j0 = false;
/* 388 */               m1134p();
/* 391 */               float x = motionEvent.getX();
/* 395 */               this.f1990s0 = x;
/* 397 */               this.f1988q0 = x;
/* 399 */               float y = motionEvent.getY();
/* 403 */               this.f1991t0 = y;
/* 405 */               this.f1989r0 = y;
/* 411 */               this.f1992u0 = motionEvent.getPointerId(0);
                    } else if (action != 1) {
/* 55 */                if (action != 2) {
/* 58 */                    if (action != 3) {
/* 61 */                        if (action == 5) {
/* 85 */                            int actionIndex = motionEvent.getActionIndex();
/* 93 */                            this.f1988q0 = motionEvent.getX(actionIndex);
/* 99 */                            this.f1992u0 = motionEvent.getPointerId(actionIndex);
                                } else if (action == 6) {
/* 68 */                            m1130l(motionEvent);
/* 81 */                            this.f1988q0 = motionEvent.getX(motionEvent.findPointerIndex(this.f1992u0));
                                }
                            } else if (this.f1983l0) {
/* 109 */                       m1138t(this.f1975f, 0, true, false);
/* 112 */                       zM1137s = m1137s();
                            }
                        } else if (!this.f1983l0) {
/* 124 */                   int iFindPointerIndex = motionEvent.findPointerIndex(this.f1992u0);
/* 129 */                   if (iFindPointerIndex == -1) {
/* 131 */                       zM1137s = m1137s();
                            } else {
/* 137 */                       float x2 = motionEvent.getX(iFindPointerIndex);
/* 145 */                       float fAbs = Math.abs(x2 - this.f1988q0);
/* 149 */                       float y2 = motionEvent.getY(iFindPointerIndex);
/* 157 */                       float fAbs2 = Math.abs(y2 - this.f1989r0);
/* 161 */                       int i = this.f1987p0;
/* 166 */                       if (fAbs > i && fAbs > fAbs2) {
/* 172 */                           this.f1983l0 = true;
/* 174 */                           ViewParent parent = getParent();
/* 178 */                           if (parent != null) {
/* 180 */                               parent.requestDisallowInterceptTouchEvent(true);
                                    }
/* 183 */                           float f = this.f1990s0;
/* 196 */                           this.f1988q0 = x2 - f > 0.0f ? f + i : f - i;
/* 198 */                           this.f1989r0 = y2;
/* 200 */                           setScrollState(1);
/* 203 */                           setScrollingCacheEnabled(true);
/* 206 */                           ViewParent parent2 = getParent();
/* 210 */                           if (parent2 != null) {
/* 212 */                               parent2.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
/* 217 */                       if (this.f1983l0) {
/* 229 */                           zM1137s = m1133o(motionEvent.getX(motionEvent.findPointerIndex(this.f1992u0)));
                                }
                            }
                        } else if (this.f1983l0) {
/* 229 */                   zM1137s = m1133o(motionEvent.getX(motionEvent.findPointerIndex(this.f1992u0)));
                        }
                    } else if (this.f1983l0) {
/* 239 */               VelocityTracker velocityTracker = this.f1994v0;
/* 246 */               velocityTracker.computeCurrentVelocity(1000, this.f1997x0);
/* 255 */               int xVelocity = (int) velocityTracker.getXVelocity(this.f1992u0);
/* 256 */               this.f1981j0 = true;
/* 258 */               int clientWidth = getClientWidth();
/* 262 */               int scrollX = getScrollX();
/* 266 */               c43 c43VarM1127i = m1127i();
                        float f2 = clientWidth;
/* 274 */               float f3 = this.f1966a0 / f2;
/* 275 */               int iMax = c43VarM1127i.f2697b;
/* 285 */               float f4 = ((scrollX / f2) - c43VarM1127i.f2700e) / (c43VarM1127i.f2699d + f3);
/* 306 */               if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f1992u0)) - this.f1990s0)) <= this.f1998y0 || Math.abs(xVelocity) <= this.f1996w0) {
/* 335 */                   iMax += (int) (f4 + (iMax >= this.f1975f ? 0.4f : 0.6f));
                        } else if (xVelocity <= 0) {
/* 319 */                   iMax++;
                        }
/* 336 */               ArrayList arrayList = this.f1967b;
/* 342 */               if (arrayList.size() > 0) {
/* 369 */                   iMax = Math.max(((c43) arrayList.get(0)).f2697b, Math.min(iMax, ((c43) arrayList.get(arrayList.size() - 1)).f2697b));
                        }
/* 373 */               m1139u(iMax, xVelocity, true, true);
/* 376 */               zM1137s = m1137s();
                    }
/* 413 */           if (zM1137s) {
/* 415 */               WeakHashMap weakHashMap = e33.f7494a;
/* 417 */               postInvalidateOnAnimation();
                    }
/* 49 */            return true;
                }

                /* JADX INFO: renamed from: p */
                public final void m1134p() {
/* 3 */             m1135q(this.f1975f);
                }

                /* JADX WARN: Code duplicated, block: B:52:0x00c3 A[PHI: r7 r11 r15
  0x00c3: PHI (r7v13 int) = (r7v12 int), (r7v4 int), (r7v16 int) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r11v26 int) = (r11v1 int), (r11v25 int), (r11v29 int) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:88:0x0145 A[PHI: r3 r12
  0x0145: PHI (r3v42 float) = (r3v40 float), (r3v41 float), (r3v39 float) binds: [B:96:0x016c, B:93:0x0156, B:86:0x013c] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r12v10 int) = (r12v8 int), (r12v9 int), (r12v7 int) binds: [B:96:0x016c, B:93:0x0156, B:86:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX INFO: renamed from: q */
                public final void m1135q(int i) {
                    c43 c43VarM1128j;
                    String hexString;
                    ArrayList arrayList;
                    c43 c43VarM1120a;
                    float f;
                    c43 c43VarM1126h;
                    c43 c43VarM1126h2;
                    int i2;
                    int i3;
                    c43 c43Var;
                    c43 c43Var2;
                    c43 c43Var3;
/* 5 */             int i4 = this.f1975f;
/* 7 */             if (i4 != i) {
/* 9 */                 c43VarM1128j = m1128j(i4);
/* 13 */                this.f1975f = i;
                    } else {
/* 16 */                c43VarM1128j = null;
                    }
/* 19 */            if (this.f1973e == null || this.f1981j0 || getWindowToken() == null) {
/* 801 */               return;
                    }
/* 39 */            this.f1973e.startUpdate((ViewGroup) this);
/* 42 */            int i5 = this.f1982k0;
/* 48 */            int iMax = Math.max(0, this.f1975f - i5);
/* 54 */            int count = this.f1973e.getCount();
/* 63 */            int iMin = Math.min(count - 1, this.f1975f + i5);
/* 69 */            if (count != this.f1965a) {
                        try {
/* 810 */                   hexString = getResources().getResourceName(getId());
                        } catch (Resources.NotFoundException unused) {
/* 819 */                   hexString = Integer.toHexString(getId());
                        }
/* 829 */               StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
/* 834 */               sb.append(this.f1965a);
/* 839 */               sb.append(", found: ");
/* 842 */               sb.append(count);
/* 847 */               sb.append(" Pager id: ");
/* 850 */               sb.append(hexString);
/* 855 */               sb.append(" Pager class: ");
/* 862 */               sb.append(getClass());
/* 867 */               Class<?> cls = this.f1973e.getClass();
/* 873 */               sb.append(" Problematic adapter: ");
/* 876 */               sb.append(cls);
/* 886 */               throw new IllegalStateException(sb.toString());
                    }
/* 71 */            int i6 = 0;
                    while (true) {
/* 72 */                arrayList = this.f1967b;
/* 78 */                if (i6 < arrayList.size()) {
/* 84 */                    c43VarM1120a = (c43) arrayList.get(i6);
/* 86 */                    int i7 = c43VarM1120a.f2697b;
/* 88 */                    int i8 = this.f1975f;
/* 90 */                    if (i7 >= i8) {
/* 92 */                        if (i7 != i8) {
                                    break;
                                } else {
                                    break;
                                }
                            }
/* 95 */                    i6++;
                        }
/* 98 */                c43VarM1120a = null;
                        break;
                    }
/* 99 */            if (c43VarM1120a == null && count > 0) {
/* 105 */               c43VarM1120a = m1120a(this.f1975f, i6);
                    }
/* 109 */           if (c43VarM1120a != null) {
/* 111 */               int i9 = i6 - 1;
/* 122 */               c43 c43Var4 = i9 >= 0 ? (c43) arrayList.get(i9) : null;
/* 123 */               int clientWidth = getClientWidth();
/* 144 */               float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - c43VarM1120a.f2699d);
/* 149 */               float f2 = 0.0f;
/* 150 */               for (int i10 = this.f1975f - 1; i10 >= 0; i10--) {
/* 154 */                   if (f2 < paddingLeft || i10 >= iMax) {
/* 201 */                       if (c43Var4 == null || i10 != c43Var4.f2697b) {
/* 229 */                           f2 += m1120a(i10, i9 + 1).f2699d;
/* 230 */                           i6++;
/* 232 */                           if (i9 >= 0) {
/* 238 */                               c43Var3 = (c43) arrayList.get(i9);
                                    } else {
/* 196 */                               c43Var3 = null;
                                    }
                                } else {
/* 209 */                           f2 += c43Var4.f2699d;
/* 210 */                           i9--;
/* 212 */                           if (i9 >= 0) {
/* 218 */                               c43Var3 = (c43) arrayList.get(i9);
                                    } else {
/* 196 */                               c43Var3 = null;
                                    }
                                }
/* 197 */                       c43Var4 = c43Var3;
                            } else {
/* 158 */                       if (c43Var4 == null) {
                                    break;
                                }
/* 167 */                       if (i10 == c43Var4.f2697b && !c43Var4.f2698c) {
/* 173 */                           arrayList.remove(i9);
/* 180 */                           this.f1973e.destroyItem((ViewGroup) this, i10, c43Var4.f2696a);
/* 183 */                           i9--;
/* 185 */                           i6--;
/* 187 */                           if (i9 >= 0) {
/* 193 */                               c43Var3 = (c43) arrayList.get(i9);
                                    } else {
/* 196 */                               c43Var3 = null;
                                    }
/* 197 */                           c43Var4 = c43Var3;
                                }
                            }
                        }
/* 160 */               f = 0.0f;
/* 244 */               float f3 = c43VarM1120a.f2699d;
/* 246 */               int i11 = i6 + 1;
/* 250 */               if (f3 < 2.0f) {
/* 265 */                   c43 c43Var5 = i11 < arrayList.size() ? (c43) arrayList.get(i11) : null;
/* 278 */                   float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
/* 283 */                   int i12 = i11;
/* 284 */                   for (int i13 = this.f1975f + 1; i13 < count; i13++) {
/* 288 */                       if (f3 >= paddingRight && i13 > iMin) {
/* 292 */                           if (c43Var5 == null) {
                                        break;
                                    }
/* 297 */                           if (i13 == c43Var5.f2697b && !c43Var5.f2698c) {
/* 303 */                               arrayList.remove(i12);
/* 310 */                               this.f1973e.destroyItem((ViewGroup) this, i13, c43Var5.f2696a);
/* 317 */                               if (i12 < arrayList.size()) {
/* 323 */                                   c43Var5 = (c43) arrayList.get(i12);
                                        } else {
/* 326 */                                   c43Var5 = null;
                                        }
                                    }
                                } else if (c43Var5 == null || i13 != c43Var5.f2697b) {
/* 352 */                           c43 c43VarM1120a2 = m1120a(i13, i12);
/* 356 */                           i12++;
/* 360 */                           f3 += c43VarM1120a2.f2699d;
/* 365 */                           if (i12 < arrayList.size()) {
/* 371 */                               c43Var5 = (c43) arrayList.get(i12);
                                    } else {
/* 326 */                               c43Var5 = null;
                                    }
                                } else {
/* 336 */                           f3 += c43Var5.f2699d;
/* 337 */                           i12++;
/* 343 */                           if (i12 < arrayList.size()) {
/* 349 */                               c43Var5 = (c43) arrayList.get(i12);
                                    } else {
/* 326 */                               c43Var5 = null;
                                    }
                                }
                            }
                        }
/* 378 */               int count2 = this.f1973e.getCount();
/* 382 */               int clientWidth2 = getClientWidth();
/* 394 */               float f4 = clientWidth2 > 0 ? this.f1966a0 / clientWidth2 : 0.0f;
/* 396 */               if (c43VarM1128j != null) {
/* 398 */                   int i14 = c43VarM1128j.f2697b;
/* 400 */                   int i15 = c43VarM1120a.f2697b;
/* 402 */                   if (i14 < i15) {
/* 409 */                       float pageWidth = c43VarM1128j.f2700e + c43VarM1128j.f2699d + f4;
/* 410 */                       int i16 = i14 + 1;
/* 412 */                       int i17 = 0;
/* 415 */                       while (i16 <= c43VarM1120a.f2697b && i17 < arrayList.size()) {
/* 423 */                           Object obj = arrayList.get(i17);
                                    while (true) {
/* 427 */                               c43Var2 = (c43) obj;
/* 431 */                               if (i16 <= c43Var2.f2697b || i17 >= arrayList.size() - 1) {
                                            break;
                                        }
/* 441 */                               i17++;
/* 443 */                               obj = arrayList.get(i17);
                                    }
/* 452 */                           while (i16 < c43Var2.f2697b) {
/* 461 */                               pageWidth += this.f1973e.getPageWidth(i16) + f4;
/* 462 */                               i16++;
                                    }
/* 465 */                           c43Var2.f2700e = pageWidth;
/* 470 */                           pageWidth += c43Var2.f2699d + f4;
/* 471 */                           i16++;
                                }
                            } else if (i14 > i15) {
/* 480 */                       int size = arrayList.size() - 1;
/* 482 */                       float pageWidth2 = c43VarM1128j.f2700e;
                                while (true) {
/* 484 */                           i14--;
/* 488 */                           if (i14 < c43VarM1120a.f2697b || size < 0) {
                                        break;
                                    }
/* 492 */                           Object obj2 = arrayList.get(size);
                                    while (true) {
/* 496 */                               c43Var = (c43) obj2;
/* 500 */                               if (i14 >= c43Var.f2697b || size <= 0) {
                                            break;
                                        }
/* 504 */                               size--;
/* 506 */                               obj2 = arrayList.get(size);
                                    }
/* 515 */                           while (i14 > c43Var.f2697b) {
/* 524 */                               pageWidth2 -= this.f1973e.getPageWidth(i14) + f4;
/* 525 */                               i14--;
                                    }
/* 531 */                           pageWidth2 -= c43Var.f2699d + f4;
/* 532 */                           c43Var.f2700e = pageWidth2;
                                }
                            }
                        }
/* 537 */               int size2 = arrayList.size();
/* 541 */               float pageWidth3 = c43VarM1120a.f2700e;
/* 543 */               int i18 = c43VarM1120a.f2697b;
/* 545 */               int i19 = i18 - 1;
/* 554 */               this.f1974e0 = i18 == 0 ? pageWidth3 : -3.4028235E38f;
/* 556 */               int i20 = count2 - 1;
/* 570 */               this.f1976f0 = i18 == i20 ? (c43VarM1120a.f2699d + pageWidth3) - 1.0f : Float.MAX_VALUE;
/* 572 */               int i21 = i6 - 1;
/* 574 */               while (i21 >= 0) {
/* 580 */                   c43 c43Var6 = (c43) arrayList.get(i21);
                            while (true) {
/* 582 */                       i3 = c43Var6.f2697b;
/* 584 */                       if (i19 <= i3) {
                                    break;
                                }
/* 595 */                       pageWidth3 -= this.f1973e.getPageWidth(i19) + f4;
/* 588 */                       i19--;
                            }
/* 601 */                   pageWidth3 -= c43Var6.f2699d + f4;
/* 602 */                   c43Var6.f2700e = pageWidth3;
/* 604 */                   if (i3 == 0) {
/* 606 */                       this.f1974e0 = pageWidth3;
                            }
/* 608 */                   i21--;
/* 610 */                   i19--;
                        }
/* 618 */               float pageWidth4 = c43VarM1120a.f2700e + c43VarM1120a.f2699d + f4;
/* 619 */               int i22 = c43VarM1120a.f2697b;
                        while (true) {
/* 621 */                   i22++;
/* 623 */                   if (i11 >= size2) {
                                break;
                            }
/* 629 */                   c43 c43Var7 = (c43) arrayList.get(i11);
                            while (true) {
/* 631 */                       i2 = c43Var7.f2697b;
/* 633 */                       if (i22 >= i2) {
                                    break;
                                }
/* 644 */                       pageWidth4 += this.f1973e.getPageWidth(i22) + f4;
/* 637 */                       i22++;
                            }
/* 647 */                   if (i2 == i20) {
/* 653 */                       this.f1976f0 = (c43Var7.f2699d + pageWidth4) - 1.0f;
                            }
/* 655 */                   c43Var7.f2700e = pageWidth4;
/* 660 */                   pageWidth4 += c43Var7.f2699d + f4;
/* 661 */                   i11++;
                        }
/* 670 */               this.f1973e.setPrimaryItem((ViewGroup) this, this.f1975f, c43VarM1120a.f2696a);
                    } else {
/* 674 */               f = 0.0f;
                    }
/* 678 */           this.f1973e.finishUpdate((ViewGroup) this);
/* 681 */           int childCount = getChildCount();
/* 686 */           for (int i23 = 0; i23 < childCount; i23++) {
/* 688 */               View childAt = getChildAt(i23);
/* 696 */               LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 698 */               layoutParams.getClass();
/* 703 */               if (!layoutParams.f2000a && layoutParams.f2002c == f && (c43VarM1126h2 = m1126h(childAt)) != null) {
/* 719 */                   layoutParams.f2002c = c43VarM1126h2.f2699d;
                        }
                    }
/* 728 */           if (hasFocus()) {
/* 730 */               View viewFindFocus = findFocus();
/* 734 */               if (viewFindFocus == null) {
/* 758 */                   c43VarM1126h = null;
                            break;
                        }
                        while (true) {
/* 736 */                   Object parent = viewFindFocus.getParent();
/* 740 */                   if (parent == this) {
/* 753 */                       c43VarM1126h = m1126h(viewFindFocus);
                                break;
                            } else {
/* 742 */                       if (parent == null || !(parent instanceof View)) {
/* 758 */                           c43VarM1126h = null;
                                    break;
                                }
/* 750 */                       viewFindFocus = (View) parent;
                            }
                        }
/* 759 */               if (c43VarM1126h == null || c43VarM1126h.f2697b != this.f1975f) {
/* 772 */                   for (int i24 = 0; i24 < getChildCount(); i24++) {
/* 774 */                       View childAt2 = getChildAt(i24);
/* 778 */                       c43 c43VarM1126h3 = m1126h(childAt2);
/* 782 */                       if (c43VarM1126h3 != null && c43VarM1126h3.f2697b == this.f1975f && childAt2.requestFocus(2)) {
/* 801 */                           return;
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: r */
                public final void m1136r(int i, int i2, int i3, int i4) {
/* 1 */             if (i2 <= 0 || this.f1967b.isEmpty()) {
/* 74 */                c43 c43VarM1128j = m1128j(this.f1975f);
/* 102 */               int iMin = (int) ((c43VarM1128j != null ? Math.min(c43VarM1128j.f2700e, this.f1976f0) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
/* 107 */               if (iMin != getScrollX()) {
/* 110 */                   m1122d(false);
/* 117 */                   scrollTo(iMin, getScrollY());
/* 120 */                   return;
                        }
/* 120 */               return;
                    }
/* 11 */            Scroller scroller = this.f1962U;
/* 17 */            if (!scroller.isFinished()) {
/* 28 */                scroller.setFinalX(getCurrentItem() * getClientWidth());
                    } else {
/* 68 */                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                    }
                }

                @Override // android.view.ViewGroup, android.view.ViewManager
                public final void removeView(View view) {
/* 3 */             if (this.f1978h0) {
/* 5 */                 removeViewInLayout(view);
                    } else {
/* 9 */                 super.removeView(view);
                    }
                }

                /* JADX INFO: renamed from: s */
                public final boolean m1137s() {
/* 2 */             this.f1992u0 = -1;
/* 5 */             this.f1983l0 = false;
/* 7 */             this.f1984m0 = false;
/* 9 */             VelocityTracker velocityTracker = this.f1994v0;
/* 11 */            if (velocityTracker != null) {
/* 13 */                velocityTracker.recycle();
/* 17 */                this.f1994v0 = null;
                    }
/* 19 */            EdgeEffect edgeEffect = this.f1951A0;
/* 21 */            edgeEffect.onRelease();
/* 24 */            EdgeEffect edgeEffect2 = this.f1952B0;
/* 26 */            edgeEffect2.onRelease();
                    return edgeEffect.isFinished() || edgeEffect2.isFinished();
                }

                public void setAdapter(PagerAdapter pagerAdapter) {
                    ArrayList arrayList;
/* 1 */             PagerAdapter pagerAdapter2 = this.f1973e;
/* 6 */             if (pagerAdapter2 != null) {
/* 8 */                 pagerAdapter2.setViewPagerObserver(null);
/* 13 */                this.f1973e.startUpdate((ViewGroup) this);
/* 16 */                int i = 0;
                        while (true) {
/* 17 */                    arrayList = this.f1967b;
/* 23 */                    if (i >= arrayList.size()) {
                                break;
                            }
/* 29 */                    c43 c43Var = (c43) arrayList.get(i);
/* 37 */                    this.f1973e.destroyItem((ViewGroup) this, c43Var.f2697b, c43Var.f2696a);
/* 40 */                    i++;
                        }
/* 45 */                this.f1973e.finishUpdate((ViewGroup) this);
/* 48 */                arrayList.clear();
/* 51 */                int i2 = 0;
/* 56 */                while (i2 < getChildCount()) {
/* 70 */                    if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f2000a) {
/* 72 */                        removeViewAt(i2);
/* 75 */                        i2--;
                            }
/* 77 */                    i2++;
                        }
/* 79 */                this.f1975f = 0;
/* 81 */                scrollTo(0, 0);
                    }
/* 84 */            PagerAdapter pagerAdapter3 = this.f1973e;
/* 86 */            this.f1973e = pagerAdapter;
/* 88 */            this.f1965a = 0;
/* 90 */            if (pagerAdapter != null) {
/* 94 */                if (this.f1964W == null) {
/* 102 */                   this.f1964W = new r20(this, 3);
                        }
/* 108 */               this.f1973e.setViewPagerObserver(this.f1964W);
/* 111 */               this.f1981j0 = false;
/* 113 */               boolean z = this.f1953C0;
/* 115 */               this.f1953C0 = true;
/* 123 */               this.f1965a = this.f1973e.getCount();
/* 127 */               if (this.f1979i >= 0) {
/* 135 */                   this.f1973e.restoreState(this.f1993v, this.f1995w);
/* 140 */                   m1139u(this.f1979i, 0, false, true);
/* 144 */                   this.f1979i = -1;
/* 146 */                   this.f1993v = null;
/* 148 */                   this.f1995w = null;
                        } else if (z) {
/* 157 */                   requestLayout();
                        } else {
/* 153 */                   m1134p();
                        }
                    }
/* 160 */           ArrayList arrayList2 = this.f1959I0;
/* 162 */           if (arrayList2 == null || arrayList2.isEmpty()) {
/* 192 */               return;
                    }
/* 172 */           int size = this.f1959I0.size();
/* 176 */           for (int i3 = 0; i3 < size; i3++) {
/* 186 */               ((d43) this.f1959I0.get(i3)).mo1728a(this, pagerAdapter3, pagerAdapter);
                    }
                }

                public void setCurrentItem(int i) {
/* 2 */             this.f1981j0 = false;
/* 8 */             m1139u(i, 0, !this.f1953C0, false);
                }

                public void setOffscreenPageLimit(int i) {
/* 2 */             if (i < 1) {
/* 25 */                AbstractC1245n0.m4889q("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
/* 28 */                i = 1;
                    }
/* 31 */            if (i != this.f1982k0) {
/* 33 */                this.f1982k0 = i;
/* 35 */                m1134p();
                    }
                }

                @Deprecated
                public void setOnPageChangeListener(e43 e43Var) {
/* 1 */             this.f1957G0 = e43Var;
                }

                public void setPageMargin(int i) {
/* 1 */             int i2 = this.f1966a0;
/* 3 */             this.f1966a0 = i;
/* 5 */             int width = getWidth();
/* 9 */             m1136r(width, width, i, i2);
/* 12 */            requestLayout();
                }

                public void setPageMarginDrawable(Drawable drawable) {
/* 1 */             this.f1968b0 = drawable;
/* 3 */             if (drawable != null) {
/* 5 */                 refreshDrawableState();
                    }
/* 13 */            setWillNotDraw(drawable == null);
/* 16 */            invalidate();
                }

                public void setScrollState(int i) {
/* 3 */             if (this.f1961K0 == i) {
/* 49 */                return;
                    }
/* 6 */             this.f1961K0 = i;
/* 8 */             e43 e43Var = this.f1957G0;
/* 10 */            if (e43Var != null) {
/* 12 */                e43Var.mo3183c(i);
                    }
/* 15 */            ArrayList arrayList = this.f1956F0;
/* 17 */            if (arrayList != null) {
/* 19 */                int size = arrayList.size();
/* 24 */                for (int i2 = 0; i2 < size; i2++) {
/* 32 */                    e43 e43Var2 = (e43) this.f1956F0.get(i2);
/* 34 */                    if (e43Var2 != null) {
/* 36 */                        e43Var2.mo3183c(i);
                            }
                        }
                    }
/* 42 */            e43 e43Var3 = this.f1958H0;
/* 44 */            if (e43Var3 != null) {
/* 46 */                e43Var3.mo3183c(i);
                    }
                }

                /* JADX INFO: renamed from: t */
                public final void m1138t(int i, int i2, boolean z, boolean z2) {
                    int iMax;
                    int scrollX;
                    int iAbs;
/* 1 */             c43 c43VarM1128j = m1128j(i);
/* 6 */             if (c43VarM1128j != null) {
/* 28 */                iMax = (int) (Math.max(this.f1974e0, Math.min(c43VarM1128j.f2700e, this.f1976f0)) * getClientWidth());
                    } else {
/* 30 */                iMax = 0;
                    }
/* 31 */            if (!z) {
/* 216 */               if (z2) {
/* 218 */                   m1124f(i);
                        }
/* 221 */               m1122d(false);
/* 224 */               scrollTo(iMax, 0);
/* 227 */               m1132n(iMax);
/* 230 */               return;
                    }
/* 37 */            if (getChildCount() == 0) {
/* 39 */                setScrollingCacheEnabled(false);
                    } else {
/* 44 */                Scroller scroller = this.f1962U;
/* 46 */                if (scroller == null || scroller.isFinished()) {
/* 75 */                    scrollX = getScrollX();
                        } else {
/* 63 */                    scrollX = this.f1963V ? scroller.getCurrX() : scroller.getStartX();
/* 67 */                    scroller.abortAnimation();
/* 70 */                    setScrollingCacheEnabled(false);
                        }
/* 73 */                int i3 = scrollX;
/* 80 */                int scrollY = getScrollY();
/* 84 */                int i4 = iMax - i3;
/* 86 */                int i5 = 0 - scrollY;
/* 88 */                if (i4 == 0 && i5 == 0) {
/* 92 */                    m1122d(false);
/* 95 */                    m1134p();
/* 98 */                    setScrollState(0);
                        } else {
/* 103 */                   setScrollingCacheEnabled(true);
/* 107 */                   setScrollState(2);
/* 110 */                   int clientWidth = getClientWidth();
/* 114 */                   int i6 = clientWidth / 2;
                            float f = clientWidth;
                            float f2 = i6;
/* 145 */                   float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
/* 146 */                   int iAbs2 = Math.abs(i2);
/* 150 */                   if (iAbs2 > 0) {
/* 165 */                       iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                            } else {
/* 191 */                       iAbs = (int) (((Math.abs(i4) / ((this.f1973e.getPageWidth(this.f1975f) * f) + this.f1966a0)) + 1.0f) * 100.0f);
                            }
/* 194 */                   int iMin = Math.min(iAbs, 600);
/* 198 */                   this.f1963V = false;
/* 202 */                   this.f1962U.startScroll(i3, scrollY, i4, i5, iMin);
/* 205 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 207 */                   postInvalidateOnAnimation();
                        }
                    }
/* 210 */           if (z2) {
/* 212 */               m1124f(i);
                    }
                }

                /* JADX INFO: renamed from: u */
                public final void m1139u(int i, int i2, boolean z, boolean z2) {
/* 1 */             PagerAdapter pagerAdapter = this.f1973e;
/* 4 */             if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
/* 107 */               setScrollingCacheEnabled(false);
/* 110 */               return;
                    }
/* 13 */            ArrayList arrayList = this.f1967b;
/* 15 */            if (!z2 && this.f1975f == i && arrayList.size() != 0) {
/* 27 */                setScrollingCacheEnabled(false);
/* 30 */                return;
                    }
/* 32 */            if (i < 0) {
/* 34 */                i = 0;
                    } else if (i >= this.f1973e.getCount()) {
/* 50 */                i = this.f1973e.getCount() - 1;
                    }
/* 51 */            int i3 = this.f1982k0;
/* 53 */            int i4 = this.f1975f;
/* 57 */            if (i > i4 + i3 || i < i4 - i3) {
/* 67 */                for (int i5 = 0; i5 < arrayList.size(); i5++) {
/* 75 */                    ((c43) arrayList.get(i5)).f2698c = true;
                        }
                    }
/* 82 */            boolean z3 = this.f1975f != i;
/* 87 */            if (!this.f1953C0) {
/* 100 */               m1135q(i);
/* 103 */               m1138t(i, i2, z, z3);
                    } else {
/* 89 */                this.f1975f = i;
/* 91 */                if (z3) {
/* 93 */                    m1124f(i);
                        }
/* 96 */                requestLayout();
                    }
                }

                @Override // android.view.View
                public final boolean verifyDrawable(Drawable drawable) {
                    return super.verifyDrawable(drawable) || drawable == this.f1968b0;
                }

                @Override // android.view.ViewGroup
/* 10 */        public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 11 */            return generateDefaultLayoutParams();
                }

/* 19 */        public void setPageMarginDrawable(int i) {
/* 20 */            setPageMarginDrawable(v00.getDrawable(getContext(), i));
                }
            }
