            package androidx.recyclerview.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import androidx.recyclerview.C0122R;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            import okio.Segment;
            import p000.C0193bu;
            import p000.C0828d1;
            import p000.C0875ec;
            import p000.C0901f1;
            import p000.C1771iw;
            import p000.C1951n4;
            import p000.a22;
            import p000.e33;
            import p000.le2;
            import p000.n12;
            import p000.o12;
            import p000.p33;
            import p000.ts0;
            import p000.we2;
            import p000.y12;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0133k {

                /* JADX INFO: renamed from: U */
                public int f1753U;

                /* JADX INFO: renamed from: V */
                public boolean f1754V;

                /* JADX INFO: renamed from: W */
                public int f1755W;

                /* JADX INFO: renamed from: X */
                public int f1756X;

                /* JADX INFO: renamed from: Y */
                public int f1757Y;

                /* JADX INFO: renamed from: Z */
                public int f1758Z;

                /* JADX INFO: renamed from: a */
                public C0875ec f1759a;

                /* JADX INFO: renamed from: b */
                public RecyclerView f1760b;

                /* JADX INFO: renamed from: c */
                public final we2 f1761c;

                /* JADX INFO: renamed from: d */
                public final we2 f1762d;

                /* JADX INFO: renamed from: e */
                public C0126d f1763e;

                /* JADX INFO: renamed from: f */
                public boolean f1764f;

                /* JADX INFO: renamed from: i */
                public boolean f1765i;

                /* JADX INFO: renamed from: v */
                public final boolean f1766v;

                /* JADX INFO: renamed from: w */
                public final boolean f1767w;

                public AbstractC0133k() {
/* 6 */             C0131i c0131i = new C0131i(this);
/* 11 */            C0132j c0132j = new C0132j(this);
/* 19 */            this.f1761c = new we2(c0131i);
/* 26 */            this.f1762d = new we2(c0132j);
/* 29 */            this.f1764f = false;
/* 31 */            this.f1765i = false;
/* 34 */            this.f1766v = true;
/* 36 */            this.f1767w = true;
                }

                /* JADX WARN: Code duplicated, block: B:10:0x001a  */
                /* JADX WARN: Code duplicated, block: B:14:0x0022  */
                /* JADX WARN: Code duplicated, block: B:5:0x0010  */
                /* JADX INFO: renamed from: H */
                public static int m969H(int i, int i2, int i3, int i4, boolean z) {
/* 3 */             int iMax = Math.max(0, i - i3);
/* 13 */            if (z) {
/* 15 */                if (i4 >= 0) {
/* 17 */                    i2 = 1073741824;
                        } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
/* 27 */                    i2 = 0;
/* 28 */                    i4 = 0;
                        } else {
/* 35 */                    i4 = iMax;
                        }
                    } else if (i4 >= 0) {
/* 17 */                i2 = 1073741824;
                    } else if (i4 == -1) {
/* 35 */                i4 = iMax;
                    } else if (i4 != -2) {
/* 27 */                i2 = 0;
/* 28 */                i4 = 0;
                    } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
/* 47 */                i4 = iMax;
/* 48 */                i2 = Integer.MIN_VALUE;
                    } else {
/* 44 */                i4 = iMax;
/* 45 */                i2 = 0;
                    }
/* 49 */            return View.MeasureSpec.makeMeasureSpec(i4, i2);
                }

                /* JADX INFO: renamed from: J */
                public static int m970J(View view) {
/* 15 */            return view.getBottom() + ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.bottom;
                }

                /* JADX INFO: renamed from: K */
                public static int m971K(View view) {
/* 15 */            return view.getLeft() - ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.left;
                }

                /* JADX INFO: renamed from: L */
                public static int m972L(View view) {
/* 15 */            return view.getRight() + ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.right;
                }

                /* JADX INFO: renamed from: M */
                public static int m973M(View view) {
/* 15 */            return view.getTop() - ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b.top;
                }

                /* JADX INFO: renamed from: O */
                public static int m974O(View view) {
/* 9 */             return ((RecyclerView.LayoutParams) view.getLayoutParams()).f1681a.m1018b();
                }

                /* JADX INFO: renamed from: P */
                public static o12 m975P(Context context, AttributeSet attributeSet, int i, int i2) {
/* 3 */             o12 o12Var = new o12();
/* 8 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0122R.styleable.RecyclerView, i, i2);
/* 19 */            o12Var.f14586a = typedArrayObtainStyledAttributes.getInt(C0122R.styleable.RecyclerView_android_orientation, 1);
/* 27 */            o12Var.f14587b = typedArrayObtainStyledAttributes.getInt(C0122R.styleable.RecyclerView_spanCount, 1);
/* 36 */            o12Var.f14588c = typedArrayObtainStyledAttributes.getBoolean(C0122R.styleable.RecyclerView_reverseLayout, false);
/* 44 */            o12Var.f14589d = typedArrayObtainStyledAttributes.getBoolean(C0122R.styleable.RecyclerView_stackFromEnd, false);
/* 46 */            typedArrayObtainStyledAttributes.recycle();
/* 49 */            return o12Var;
                }

                /* JADX INFO: renamed from: T */
                public static boolean m976T(int i, int i2, int i3) {
/* 1 */             int mode = View.MeasureSpec.getMode(i2);
/* 5 */             int size = View.MeasureSpec.getSize(i2);
/* 10 */            if (i3 > 0 && i != i3) {
/* 9 */                 return false;
                    }
/* 18 */            if (mode == Integer.MIN_VALUE) {
                        return size >= i;
                    }
/* 20 */            if (mode != 0) {
                        return mode == 1073741824 && size == i;
                    }
/* 17 */            return true;
                }

                /* JADX INFO: renamed from: U */
                public static void m977U(View view, int i, int i2, int i3, int i4) {
/* 5 */             RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
/* 7 */             Rect rect = layoutParams.f1682b;
/* 33 */            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                }

                /* JADX INFO: renamed from: r */
                public static int m978r(int i, int i2, int i3) {
/* 1 */             int mode = View.MeasureSpec.getMode(i);
/* 5 */             int size = View.MeasureSpec.getSize(i);
/* 11 */            if (mode != Integer.MIN_VALUE) {
                        return mode != 1073741824 ? Math.max(i2, i3) : size;
                    }
/* 26 */            return Math.min(size, Math.max(i2, i3));
                }

                /* JADX INFO: renamed from: A */
                public final void m979A(C0134l c0134l) {
/* 7 */             for (int iM986G = m986G() - 1; iM986G >= 0; iM986G--) {
/* 9 */                 View viewM984F = m984F(iM986G);
/* 13 */                AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(viewM984F);
/* 21 */                if (!abstractC0137oM843J.m1031o()) {
/* 28 */                    if (!abstractC0137oM843J.m1022f() || abstractC0137oM843J.m1024h() || this.f1760b.f1631W.f1749b) {
/* 91 */                        m984F(iM986G);
/* 96 */                        this.f1759a.m3392p(iM986G);
/* 99 */                        c0134l.m1011h(viewM984F);
/* 106 */                       this.f1760b.f1651f.m9564o(abstractC0137oM843J);
                            } else {
/* 48 */                        if (m984F(iM986G) != null) {
/* 50 */                            C0875ec c0875ec = this.f1759a;
/* 52 */                            int iM3397x = c0875ec.m3397x(iM986G);
/* 58 */                            ts0 ts0Var = (ts0) c0875ec.f7613b;
/* 64 */                            View childAt = ((RecyclerView) ts0Var.f17248a).getChildAt(iM3397x);
/* 68 */                            if (childAt != null) {
/* 79 */                                if (((C0193bu) c0875ec.f7614c).m1438f(iM3397x)) {
/* 81 */                                    c0875ec.m3376O(childAt);
                                        }
/* 84 */                                ts0Var.m8890D(iM3397x);
                                    }
                                }
/* 87 */                        c0134l.m1010g(abstractC0137oM843J);
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: A0 */
                public final void m980A0(RecyclerView recyclerView) {
/* 19 */            m981B0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
                }

                /* JADX INFO: renamed from: B */
                public View mo799B(int i) {
/* 1 */             int iM986G = m986G();
/* 6 */             for (int i2 = 0; i2 < iM986G; i2++) {
/* 8 */                 View viewM984F = m984F(i2);
/* 12 */                AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(viewM984F);
/* 16 */                if (abstractC0137oM843J != null && abstractC0137oM843J.m1018b() == i && !abstractC0137oM843J.m1031o() && (this.f1760b.f1624R0.f19443g || !abstractC0137oM843J.m1024h())) {
/* 45 */                    return viewM984F;
                        }
                    }
/* 49 */            return null;
                }

                /* JADX INFO: renamed from: B0 */
                public final void m981B0(int i, int i2) {
/* 5 */             this.f1757Y = View.MeasureSpec.getSize(i);
/* 7 */             int mode = View.MeasureSpec.getMode(i);
/* 11 */            this.f1755W = mode;
/* 13 */            if (mode == 0) {
/* 15 */                int[] iArr = RecyclerView.f1604k1;
                    }
/* 21 */            this.f1758Z = View.MeasureSpec.getSize(i2);
/* 23 */            int mode2 = View.MeasureSpec.getMode(i2);
/* 27 */            this.f1756X = mode2;
/* 29 */            if (mode2 == 0) {
/* 31 */                int[] iArr2 = RecyclerView.f1604k1;
                    }
                }

                /* JADX INFO: renamed from: C */
                public abstract RecyclerView.LayoutParams mo762C();

                /* JADX INFO: renamed from: C0 */
                public void mo763C0(Rect rect, int i, int i2) {
/* 14 */            int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
/* 28 */            int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
/* 29 */            RecyclerView recyclerView = this.f1760b;
/* 31 */            WeakHashMap weakHashMap = e33.f7494a;
/* 1 */             this.f1760b.setMeasuredDimension(m978r(i, paddingRight, recyclerView.getMinimumWidth()), m978r(i2, paddingBottom, this.f1760b.getMinimumHeight()));
                }

                /* JADX INFO: renamed from: D */
                public RecyclerView.LayoutParams mo764D(Context context, AttributeSet attributeSet) {
/* 3 */             return new RecyclerView.LayoutParams(context, attributeSet);
                }

                /* JADX INFO: renamed from: D0 */
                public final void m982D0(int i, int i2) {
/* 1 */             int iM986G = m986G();
/* 5 */             if (iM986G == 0) {
/* 9 */                 this.f1760b.m888n(i, i2);
/* 12 */                return;
                    }
/* 13 */            int i3 = Integer.MIN_VALUE;
/* 19 */            int i4 = Integer.MAX_VALUE;
/* 21 */            int i5 = Integer.MIN_VALUE;
/* 22 */            int i6 = Integer.MAX_VALUE;
/* 23 */            for (int i7 = 0; i7 < iM986G; i7++) {
/* 25 */                View viewM984F = m984F(i7);
/* 31 */                Rect rect = this.f1760b.f1676w;
/* 33 */                RecyclerView.m844K(rect, viewM984F);
/* 36 */                int i8 = rect.left;
/* 38 */                if (i8 < i6) {
/* 40 */                    i6 = i8;
                        }
/* 41 */                int i9 = rect.right;
/* 43 */                if (i9 > i3) {
/* 45 */                    i3 = i9;
                        }
/* 46 */                int i10 = rect.top;
/* 48 */                if (i10 < i4) {
/* 50 */                    i4 = i10;
                        }
/* 51 */                int i11 = rect.bottom;
/* 53 */                if (i11 > i5) {
/* 55 */                    i5 = i11;
                        }
                    }
/* 63 */            this.f1760b.f1676w.set(i6, i4, i3, i5);
/* 70 */            mo763C0(this.f1760b.f1676w, i, i2);
                }

                /* JADX INFO: renamed from: E */
                public RecyclerView.LayoutParams mo765E(ViewGroup.LayoutParams layoutParams) {
/* 3 */             if (layoutParams instanceof RecyclerView.LayoutParams) {
/* 9 */                 return new RecyclerView.LayoutParams((RecyclerView.LayoutParams) layoutParams);
                    }
                    return layoutParams instanceof ViewGroup.MarginLayoutParams ? new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new RecyclerView.LayoutParams(layoutParams);
                }

                /* JADX INFO: renamed from: E0 */
                public final void m983E0(RecyclerView recyclerView) {
/* 1 */             if (recyclerView == null) {
/* 4 */                 this.f1760b = null;
/* 6 */                 this.f1759a = null;
/* 9 */                 this.f1757Y = 0;
/* 11 */                this.f1758Z = 0;
                    } else {
/* 14 */                this.f1760b = recyclerView;
/* 18 */                this.f1759a = recyclerView.f1648e;
/* 24 */                this.f1757Y = recyclerView.getWidth();
/* 30 */                this.f1758Z = recyclerView.getHeight();
                    }
/* 34 */            this.f1755W = 1073741824;
/* 36 */            this.f1756X = 1073741824;
                }

                /* JADX INFO: renamed from: F */
                public final View m984F(int i) {
/* 1 */             C0875ec c0875ec = this.f1759a;
/* 3 */             if (c0875ec != null) {
/* 5 */                 return c0875ec.m3395t(i);
                    }
/* 10 */            return null;
                }

                /* JADX INFO: renamed from: F0 */
                final boolean m985F0(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
                    return (!view.isLayoutRequested() && this.f1766v && m976T(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m976T(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
                }

                /* JADX INFO: renamed from: G */
                public final int m986G() {
/* 1 */             C0875ec c0875ec = this.f1759a;
/* 3 */             if (c0875ec != null) {
/* 5 */                 return c0875ec.m3396u();
                    }
/* 10 */            return 0;
                }

                /* JADX INFO: renamed from: G0 */
                public boolean mo800G0() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: H0 */
                public final boolean m987H0(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
                    return (this.f1766v && m976T(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m976T(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
                }

                /* JADX INFO: renamed from: I */
                public int mo766I(C0134l c0134l, y12 y12Var) {
/* 1 */             return -1;
                }

                /* JADX INFO: renamed from: I0 */
                public abstract void mo801I0(RecyclerView recyclerView, int i);

                /* JADX INFO: renamed from: J0 */
                public final void m988J0(C0126d c0126d) {
/* 1 */             C0126d c0126d2 = this.f1763e;
/* 3 */             if (c0126d2 != null && c0126d != c0126d2 && c0126d2.f18906e) {
/* 11 */                c0126d2.m9682d();
                    }
/* 14 */            this.f1763e = c0126d;
/* 16 */            RecyclerView recyclerView = this.f1760b;
/* 18 */            a22 a22Var = recyclerView.f1621O0;
/* 22 */            a22Var.f55i.removeCallbacks(a22Var);
/* 27 */            a22Var.f51c.abortAnimation();
/* 32 */            if (c0126d.f18909h) {
/* 79 */                AbstractC1245n0.m4889q("RecyclerView", "An instance of " + c0126d.getClass().getSimpleName() + " was started more than once. Each instance of" + c0126d.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
                    }
/* 82 */            c0126d.f18903b = recyclerView;
/* 84 */            c0126d.f18904c = this;
/* 86 */            int i = c0126d.f18902a;
/* 89 */            if (i == -1) {
/* 120 */               C1951n4.m6859j("Invalid target position");
/* 123 */               return;
                    }
/* 93 */            recyclerView.f1624R0.f19437a = i;
/* 96 */            c0126d.f18906e = true;
/* 98 */            c0126d.f18905d = true;
/* 106 */           c0126d.f18907f = recyclerView.f1637a0.mo799B(i);
/* 112 */           c0126d.f18903b.f1621O0.m40a();
/* 115 */           c0126d.f18909h = true;
                }

                /* JADX INFO: renamed from: K0 */
                public boolean mo767K0() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: N */
                public final int m989N() {
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 3 */             WeakHashMap weakHashMap = e33.f7494a;
/* 5 */             return recyclerView.getLayoutDirection();
                }

                /* JADX INFO: renamed from: Q */
                public int mo769Q(C0134l c0134l, y12 y12Var) {
/* 1 */             return -1;
                }

                /* JADX INFO: renamed from: R */
                public final void m990R(Rect rect, View view) {
                    Matrix matrix;
/* 7 */             Rect rect2 = ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b;
/* 29 */            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
/* 34 */            if (this.f1760b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
/* 50 */                RectF rectF = this.f1760b.f1629V;
/* 52 */                rectF.set(rect);
/* 55 */                matrix.mapRect(rectF);
/* 90 */                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
                    }
/* 101 */           rect.offset(view.getLeft(), view.getTop());
                }

                /* JADX INFO: renamed from: S */
                public abstract boolean mo808S();

                /* JADX INFO: renamed from: V */
                public void mo912V(int i) {
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 3 */             if (recyclerView != null) {
/* 7 */                 int iM3396u = recyclerView.f1648e.m3396u();
/* 12 */                for (int i2 = 0; i2 < iM3396u; i2++) {
/* 20 */                    recyclerView.f1648e.m3395t(i2).offsetLeftAndRight(i);
                        }
                    }
                }

                /* JADX INFO: renamed from: W */
                public void mo914W(int i) {
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 3 */             if (recyclerView != null) {
/* 7 */                 int iM3396u = recyclerView.f1648e.m3396u();
/* 12 */                for (int i2 = 0; i2 < iM3396u; i2++) {
/* 20 */                    recyclerView.f1648e.m3395t(i2).offsetTopAndBottom(i);
                        }
                    }
                }

                /* JADX INFO: renamed from: X */
                public void mo916X() {
                }

                /* JADX INFO: renamed from: Y */
                public void mo991Y(RecyclerView recyclerView) {
                }

                /* JADX INFO: renamed from: Z */
                public abstract void mo816Z(RecyclerView recyclerView);

                /* JADX INFO: renamed from: a0 */
                public View mo771a0(View view, int i, C0134l c0134l, y12 y12Var) {
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: b0 */
                public void mo819b0(AccessibilityEvent accessibilityEvent) {
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 3 */             C0134l c0134l = recyclerView.f1639b;
/* 5 */             y12 y12Var = recyclerView.f1624R0;
/* 7 */             if (recyclerView == null || accessibilityEvent == null) {
/* 62 */                return;
                    }
/* 12 */            boolean z = true;
/* 17 */            if (!recyclerView.canScrollVertically(1) && !this.f1760b.canScrollVertically(-1) && !this.f1760b.canScrollHorizontally(-1) && !this.f1760b.canScrollHorizontally(1)) {
/* 45 */                z = false;
                    }
/* 46 */            accessibilityEvent.setScrollable(z);
/* 51 */            AbstractC0129g abstractC0129g = this.f1760b.f1631W;
/* 53 */            if (abstractC0129g != null) {
/* 59 */                accessibilityEvent.setItemCount(abstractC0129g.mo955a());
                    }
                }

                /* JADX INFO: renamed from: c0 */
                public void mo992c0(C0134l c0134l, y12 y12Var, C0901f1 c0901f1) {
/* 9 */             if (this.f1760b.canScrollVertically(-1) || this.f1760b.canScrollHorizontally(-1)) {
/* 21 */                c0901f1.m3621a(Segment.SIZE);
/* 24 */                c0901f1.m3631l(true);
                    }
/* 33 */            if (this.f1760b.canScrollVertically(1) || this.f1760b.canScrollHorizontally(1)) {
/* 45 */                c0901f1.m3621a(4096);
/* 48 */                c0901f1.m3631l(true);
                    }
/* 70 */            c0901f1.f7961a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0828d1.m2904b(mo769Q(c0134l, y12Var), mo766I(c0134l, y12Var), 0).f6954a);
                }

                /* JADX INFO: renamed from: d0 */
                public final void m993d0(View view, C0901f1 c0901f1) {
/* 1 */             AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(view);
/* 5 */             if (abstractC0137oM843J == null || abstractC0137oM843J.m1024h()) {
/* 36 */                return;
                    }
/* 13 */            C0875ec c0875ec = this.f1759a;
/* 25 */            if (((ArrayList) c0875ec.f7615d).contains(abstractC0137oM843J.f1778a)) {
/* 36 */                return;
                    }
/* 27 */            RecyclerView recyclerView = this.f1760b;
/* 33 */            mo772e0(recyclerView.f1639b, recyclerView.f1624R0, view, c0901f1);
                }

                /* JADX INFO: renamed from: e0 */
                public void mo772e0(C0134l c0134l, y12 y12Var, View view, C0901f1 c0901f1) {
                }

                /* JADX INFO: renamed from: f0 */
                public void mo773f0(int i, int i2) {
                }

                /* JADX INFO: renamed from: g0 */
                public void mo775g0() {
                }

                public final int getPaddingBottom() {
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 3 */             if (recyclerView != null) {
/* 5 */                 return recyclerView.getPaddingBottom();
                    }
/* 10 */            return 0;
                }

                public final int getPaddingEnd() {
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 3 */             if (recyclerView == null) {
/* 12 */                return 0;
                    }
/* 5 */             WeakHashMap weakHashMap = e33.f7494a;
/* 7 */             return recyclerView.getPaddingEnd();
                }

                public final int getPaddingLeft() {
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 3 */             if (recyclerView != null) {
/* 5 */                 return recyclerView.getPaddingLeft();
                    }
/* 10 */            return 0;
                }

                public final int getPaddingRight() {
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 3 */             if (recyclerView != null) {
/* 5 */                 return recyclerView.getPaddingRight();
                    }
/* 10 */            return 0;
                }

                public final int getPaddingStart() {
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 3 */             if (recyclerView == null) {
/* 12 */                return 0;
                    }
/* 5 */             WeakHashMap weakHashMap = e33.f7494a;
/* 7 */             return recyclerView.getPaddingStart();
                }

                public final int getPaddingTop() {
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 3 */             if (recyclerView != null) {
/* 5 */                 return recyclerView.getPaddingTop();
                    }
/* 10 */            return 0;
                }

                /* JADX INFO: renamed from: h0 */
                public void mo777h0(int i, int i2) {
                }

                /* JADX INFO: renamed from: i0 */
                public void mo778i0(int i, int i2) {
                }

                /* JADX INFO: renamed from: j0 */
                public void mo994j0(int i) {
                }

                /* JADX INFO: renamed from: k0 */
                public void mo779k0(RecyclerView recyclerView, int i, int i2) {
/* 1 */             mo994j0(i);
                }

                /* JADX INFO: renamed from: l */
                public final void m995l(int i, View view, boolean z) {
/* 1 */             AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(view);
/* 7 */             if (z || abstractC0137oM843J.m1024h()) {
/* 30 */                le2 le2Var = (le2) this.f1760b.f1651f.f18596c;
/* 36 */                p33 p33VarM7324a = (p33) le2Var.getOrDefault(abstractC0137oM843J, null);
/* 38 */                if (p33VarM7324a == null) {
/* 40 */                    p33VarM7324a = p33.m7324a();
/* 44 */                    le2Var.put(abstractC0137oM843J, p33VarM7324a);
                        }
/* 50 */                p33VarM7324a.f14957a |= 1;
                    } else {
/* 20 */                this.f1760b.f1651f.m9564o(abstractC0137oM843J);
                    }
/* 56 */            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
/* 63 */            if (abstractC0137oM843J.m1032p() || abstractC0137oM843J.m1025i()) {
/* 310 */               if (abstractC0137oM843J.m1025i()) {
/* 314 */                   abstractC0137oM843J.f1791n.m1013j(abstractC0137oM843J);
                        } else {
/* 322 */                   abstractC0137oM843J.f1787j &= -33;
                        }
/* 330 */               this.f1759a.m3383f(view, i, view.getLayoutParams(), false);
                    } else {
/* 73 */                ViewParent parent = view.getParent();
/* 77 */                RecyclerView recyclerView = this.f1760b;
/* 79 */                C0875ec c0875ec = this.f1759a;
/* 82 */                if (parent == recyclerView) {
/* 86 */                    C0193bu c0193bu = (C0193bu) c0875ec.f7614c;
/* 96 */                    int iIndexOfChild = ((RecyclerView) ((ts0) c0875ec.f7613b).f17248a).indexOfChild(view);
/* 115 */                   int iM1434b = (iIndexOfChild == -1 || c0193bu.m1436d(iIndexOfChild)) ? -1 : iIndexOfChild - c0193bu.m1434b(iIndexOfChild);
/* 116 */                   if (i == -1) {
/* 120 */                       i = this.f1759a.m3396u();
                            }
/* 124 */                   if (iM1434b == -1) {
/* 270 */                       throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f1760b.indexOfChild(view) + this.f1760b.m900z());
                            }
/* 126 */                   if (iM1434b != i) {
/* 130 */                       AbstractC0133k abstractC0133k = this.f1760b.f1637a0;
/* 132 */                       View viewM984F = abstractC0133k.m984F(iM1434b);
/* 136 */                       if (viewM984F == null) {
/* 235 */                           throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM1434b + abstractC0133k.f1760b.toString());
                                }
/* 138 */                       abstractC0133k.m984F(iM1434b);
/* 143 */                       abstractC0133k.f1759a.m3392p(iM1434b);
/* 150 */                       RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) viewM984F.getLayoutParams();
/* 152 */                       AbstractC0137o abstractC0137oM843J2 = RecyclerView.m843J(viewM984F);
/* 156 */                       boolean zM1024h = abstractC0137oM843J2.m1024h();
/* 160 */                       RecyclerView recyclerView2 = abstractC0133k.f1760b;
/* 162 */                       if (zM1024h) {
/* 168 */                           le2 le2Var2 = (le2) recyclerView2.f1651f.f18596c;
/* 174 */                           p33 p33VarM7324a2 = (p33) le2Var2.getOrDefault(abstractC0137oM843J2, null);
/* 176 */                           if (p33VarM7324a2 == null) {
/* 178 */                               p33VarM7324a2 = p33.m7324a();
/* 182 */                               le2Var2.put(abstractC0137oM843J2, p33VarM7324a2);
                                    }
/* 188 */                           p33VarM7324a2.f14957a = 1 | p33VarM7324a2.f14957a;
                                } else {
/* 193 */                           recyclerView2.f1651f.m9564o(abstractC0137oM843J2);
                                }
/* 202 */                       abstractC0133k.f1759a.m3383f(viewM984F, i, layoutParams2, abstractC0137oM843J2.m1024h());
                            }
                        } else {
/* 271 */                   c0875ec.m3382e(i, view, false);
/* 274 */                   layoutParams.f1683c = true;
/* 276 */                   C0126d c0126d = this.f1763e;
/* 278 */                   if (c0126d != null && c0126d.f18906e) {
/* 286 */                       c0126d.f18903b.getClass();
/* 289 */                       AbstractC0137o abstractC0137oM843J3 = RecyclerView.m843J(view);
/* 301 */                       if ((abstractC0137oM843J3 != null ? abstractC0137oM843J3.m1018b() : -1) == c0126d.f18902a) {
/* 303 */                           c0126d.f18907f = view;
                                }
                            }
                        }
                    }
/* 335 */           if (layoutParams.f1684d) {
/* 339 */               abstractC0137oM843J.f1778a.invalidate();
/* 342 */               layoutParams.f1684d = false;
                    }
                }

                /* JADX INFO: renamed from: l0 */
                public abstract void mo780l0(C0134l c0134l, y12 y12Var);

                /* JADX INFO: renamed from: m */
                public void mo829m(String str) {
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 3 */             if (recyclerView != null) {
/* 5 */                 recyclerView.m884i(str);
                    }
                }

                /* JADX INFO: renamed from: m0 */
                public abstract void mo781m0(y12 y12Var);

                /* JADX INFO: renamed from: n */
                public final void m996n(Rect rect, View view) {
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 3 */             if (recyclerView == null) {
/* 6 */                 rect.set(0, 0, 0, 0);
                    } else {
/* 14 */                rect.set(recyclerView.m858L(view));
                    }
                }

                /* JADX INFO: renamed from: n0 */
                public abstract void mo830n0(Parcelable parcelable);

                /* JADX INFO: renamed from: o */
                public abstract boolean mo832o();

                /* JADX INFO: renamed from: o0 */
                public abstract Parcelable mo833o0();

                /* JADX INFO: renamed from: p */
                public abstract boolean mo835p();

                /* JADX INFO: renamed from: p0 */
                public void mo931p0(int i) {
                }

                /* JADX INFO: renamed from: q */
                public boolean mo783q(RecyclerView.LayoutParams layoutParams) {
                    return layoutParams != null;
                }

                /* JADX WARN: Code duplicated, block: B:17:0x003f A[PHI: r2
  0x003f: PHI (r2v8 int) = (r2v4 int), (r2v12 int) binds: [B:23:0x005b, B:15:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX INFO: renamed from: q0 */
                public boolean mo997q0(C0134l c0134l, y12 y12Var, int i, Bundle bundle) {
                    int paddingTop;
                    int paddingLeft;
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 4 */             if (recyclerView != null) {
/* 11 */                if (i == 4096) {
/* 85 */                    paddingTop = recyclerView.canScrollVertically(1) ? (this.f1758Z - getPaddingTop()) - getPaddingBottom() : 0;
/* 92 */                    if (this.f1760b.canScrollHorizontally(1)) {
/* 105 */                       paddingLeft = (this.f1757Y - getPaddingLeft()) - getPaddingRight();
                            } else {
/* 64 */                        paddingLeft = 0;
                            }
                        } else if (i != 8192) {
/* 17 */                    paddingTop = 0;
/* 18 */                    paddingLeft = 0;
                        } else {
/* 41 */                    paddingTop = recyclerView.canScrollVertically(-1) ? -((this.f1758Z - getPaddingTop()) - getPaddingBottom()) : 0;
/* 48 */                    if (this.f1760b.canScrollHorizontally(-1)) {
/* 62 */                        paddingLeft = -((this.f1757Y - getPaddingLeft()) - getPaddingRight());
                            } else {
/* 64 */                        paddingLeft = 0;
                            }
                        }
/* 106 */               if (paddingTop != 0 || paddingLeft != 0) {
/* 113 */                   this.f1760b.m876d0(paddingLeft, paddingTop, true);
/* 10 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                /* JADX INFO: renamed from: r0 */
                public final void m998r0() {
/* 7 */             for (int iM986G = m986G() - 1; iM986G >= 0; iM986G--) {
/* 9 */                 C0875ec c0875ec = this.f1759a;
/* 11 */                int iM3397x = c0875ec.m3397x(iM986G);
/* 17 */                ts0 ts0Var = (ts0) c0875ec.f7613b;
/* 23 */                View childAt = ((RecyclerView) ts0Var.f17248a).getChildAt(iM3397x);
/* 27 */                if (childAt != null) {
/* 38 */                    if (((C0193bu) c0875ec.f7614c).m1438f(iM3397x)) {
/* 40 */                        c0875ec.m3376O(childAt);
                            }
/* 43 */                    ts0Var.m8890D(iM3397x);
                        }
                    }
                }

                /* JADX INFO: renamed from: s */
                public void mo837s(int i, int i2, y12 y12Var, C1771iw c1771iw) {
                }

                /* JADX INFO: renamed from: s0 */
                public final void m999s0(C0134l c0134l) {
/* 7 */             for (int iM986G = m986G() - 1; iM986G >= 0; iM986G--) {
/* 21 */                if (!RecyclerView.m843J(m984F(iM986G)).m1031o()) {
/* 23 */                    View viewM984F = m984F(iM986G);
/* 31 */                    if (m984F(iM986G) != null) {
/* 33 */                        C0875ec c0875ec = this.f1759a;
/* 35 */                        int iM3397x = c0875ec.m3397x(iM986G);
/* 41 */                        ts0 ts0Var = (ts0) c0875ec.f7613b;
/* 47 */                        View childAt = ((RecyclerView) ts0Var.f17248a).getChildAt(iM3397x);
/* 51 */                        if (childAt != null) {
/* 62 */                            if (((C0193bu) c0875ec.f7614c).m1438f(iM3397x)) {
/* 64 */                                c0875ec.m3376O(childAt);
                                    }
/* 67 */                            ts0Var.m8890D(iM3397x);
                                }
                            }
/* 70 */                    c0134l.m1009f(viewM984F);
                        }
                    }
                }

                /* JADX INFO: renamed from: t */
                public void mo838t(int i, C1771iw c1771iw) {
                }

                /* JADX INFO: renamed from: t0 */
                public final void m1000t0(C0134l c0134l) {
                    ArrayList arrayList;
/* 3 */             int size = c0134l.f1768a.size();
/* 7 */             int i = size - 1;
                    while (true) {
/* 9 */                 arrayList = c0134l.f1768a;
/* 11 */                if (i < 0) {
                            break;
                        }
/* 19 */                View view = ((AbstractC0137o) arrayList.get(i)).f1778a;
/* 21 */                AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(view);
/* 29 */                if (!abstractC0137oM843J.m1031o()) {
/* 33 */                    abstractC0137oM843J.m1030n(false);
/* 40 */                    if (abstractC0137oM843J.m1026j()) {
/* 44 */                        this.f1760b.removeDetachedView(view, false);
                            }
/* 49 */                    n12 n12Var = this.f1760b.f1680z0;
/* 51 */                    if (n12Var != null) {
/* 53 */                        n12Var.mo5714d(abstractC0137oM843J);
                            }
/* 57 */                    abstractC0137oM843J.m1030n(true);
/* 60 */                    AbstractC0137o abstractC0137oM843J2 = RecyclerView.m843J(view);
/* 65 */                    abstractC0137oM843J2.f1791n = null;
/* 67 */                    abstractC0137oM843J2.f1792o = false;
/* 73 */                    abstractC0137oM843J2.f1787j &= -33;
/* 75 */                    c0134l.m1010g(abstractC0137oM843J2);
                        }
/* 78 */                i--;
                    }
/* 81 */            arrayList.clear();
/* 84 */            ArrayList arrayList2 = c0134l.f1769b;
/* 86 */            if (arrayList2 != null) {
/* 88 */                arrayList2.clear();
                    }
/* 91 */            if (size > 0) {
/* 95 */                this.f1760b.invalidate();
                    }
                }

                /* JADX INFO: renamed from: u */
                public abstract int mo839u(y12 y12Var);

                /* JADX INFO: renamed from: u0 */
                public final void m1001u0(View view, C0134l c0134l) {
/* 1 */             C0875ec c0875ec = this.f1759a;
/* 5 */             ts0 ts0Var = (ts0) c0875ec.f7613b;
/* 11 */            int iIndexOfChild = ((RecyclerView) ts0Var.f17248a).indexOfChild(view);
/* 15 */            if (iIndexOfChild >= 0) {
/* 26 */                if (((C0193bu) c0875ec.f7614c).m1438f(iIndexOfChild)) {
/* 28 */                    c0875ec.m3376O(view);
                        }
/* 31 */                ts0Var.m8890D(iIndexOfChild);
                    }
/* 34 */            c0134l.m1009f(view);
                }

                /* JADX INFO: renamed from: v */
                public abstract int mo789v(y12 y12Var);

                /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
                /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
                /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
                /* JADX INFO: renamed from: v0 */
                public boolean mo1002v0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
/* 1 */             int paddingLeft = getPaddingLeft();
/* 5 */             int paddingTop = getPaddingTop();
/* 15 */            int paddingRight = this.f1757Y - getPaddingRight();
/* 22 */            int paddingBottom = this.f1758Z - getPaddingBottom();
/* 34 */            int left = (view.getLeft() + rect.left) - view.getScrollX();
/* 46 */            int top = (view.getTop() + rect.top) - view.getScrollY();
/* 51 */            int iWidth = rect.width() + left;
/* 56 */            int iHeight = rect.height() + top;
/* 57 */            int i = left - paddingLeft;
/* 59 */            int iMin = Math.min(0, i);
/* 63 */            int i2 = top - paddingTop;
/* 64 */            int iMin2 = Math.min(0, i2);
/* 68 */            int i3 = iWidth - paddingRight;
/* 69 */            int iMax = Math.max(0, i3);
/* 74 */            int iMax2 = Math.max(0, iHeight - paddingBottom);
/* 83 */            if (m989N() != 1) {
/* 93 */                if (iMin == 0) {
/* 96 */                    iMin = Math.min(i, iMax);
                        }
/* 100 */               iMax = iMin;
                    } else if (iMax == 0) {
/* 88 */                iMax = Math.max(iMin, i3);
                    }
/* 101 */           if (iMin2 == 0) {
/* 104 */               iMin2 = Math.min(i2, iMax2);
                    }
/* 108 */           int[] iArr = {iMax, iMin2};
/* 112 */           int i4 = iArr[0];
/* 114 */           int i5 = iArr[1];
/* 116 */           if (z2) {
/* 118 */               View focusedChild = recyclerView.getFocusedChild();
/* 122 */               if (focusedChild != null) {
/* 125 */                   int paddingLeft2 = getPaddingLeft();
/* 129 */                   int paddingTop2 = getPaddingTop();
/* 139 */                   int paddingRight2 = this.f1757Y - getPaddingRight();
/* 146 */                   int paddingBottom2 = this.f1758Z - getPaddingBottom();
/* 149 */                   Rect rect2 = this.f1760b.f1676w;
/* 151 */                   RecyclerView.m844K(rect2, focusedChild);
/* 157 */                   if (rect2.left - i4 < paddingRight2 && rect2.right - i4 > paddingLeft2 && rect2.top - i5 < paddingBottom2 && rect2.bottom - i5 > paddingTop2) {
/* 175 */                       if (i4 == 0) {
                                }
/* 181 */                       if (z) {
/* 183 */                           recyclerView.scrollBy(i4, i5);
/* 82 */                            return true;
                                }
/* 187 */                       recyclerView.m876d0(i4, i5, false);
/* 82 */                        return true;
                            }
                        }
                    } else if (i4 == 0 || i5 != 0) {
/* 181 */               if (z) {
/* 183 */                   recyclerView.scrollBy(i4, i5);
/* 82 */                    return true;
                        }
/* 187 */               recyclerView.m876d0(i4, i5, false);
/* 82 */                return true;
                    }
/* 58 */            return false;
                }

                /* JADX INFO: renamed from: w */
                public abstract int mo791w(y12 y12Var);

                /* JADX INFO: renamed from: w0 */
                public final void m1003w0() {
/* 1 */             RecyclerView recyclerView = this.f1760b;
/* 3 */             if (recyclerView != null) {
/* 5 */                 recyclerView.requestLayout();
                    }
                }

                /* JADX INFO: renamed from: x */
                public abstract int mo840x(y12 y12Var);

                /* JADX INFO: renamed from: x0 */
                public abstract int mo793x0(int i, y12 y12Var, C0134l c0134l);

                /* JADX INFO: renamed from: y */
                public abstract int mo795y(y12 y12Var);

                /* JADX INFO: renamed from: y0 */
                public abstract void mo841y0(int i);

                /* JADX INFO: renamed from: z */
                public abstract int mo797z(y12 y12Var);

                /* JADX INFO: renamed from: z0 */
                public abstract int mo798z0(int i, y12 y12Var, C0134l c0134l);
            }
