            package androidx.recyclerview.widget;

            import android.R;
            import android.animation.LayoutTransition;
            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.StateListDrawable;
            import android.os.Build;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.SystemClock;
            import android.os.Trace;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import android.view.Display;
            import android.view.FocusFinder;
            import android.view.MotionEvent;
            import android.view.VelocityTracker;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityManager;
            import android.view.animation.Interpolator;
            import android.widget.EdgeEffect;
            import android.widget.OverScroller;
            import androidx.core.view.ScrollingView;
            import androidx.customview.view.AbsSavedState;
            import androidx.recyclerview.C0122R;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            import okio.Segment;
            import p000.AbstractC0208c9;
            import p000.AbstractC0886en;
            import p000.C0193bu;
            import p000.C0875ec;
            import p000.C1771iw;
            import p000.C1951n4;
            import p000.C2056p3;
            import p000.C2093q3;
            import p000.a22;
            import p000.ah0;
            import p000.ar1;
            import p000.bc0;
            import p000.br1;
            import p000.c22;
            import p000.ds0;
            import p000.e33;
            import p000.er0;
            import p000.f12;
            import p000.f33;
            import p000.f42;
            import p000.g12;
            import p000.h12;
            import p000.hq0;
            import p000.i33;
            import p000.j60;
            import p000.k12;
            import p000.l12;
            import p000.le2;
            import p000.m12;
            import p000.n12;
            import p000.nm1;
            import p000.om1;
            import p000.oq2;
            import p000.p12;
            import p000.p33;
            import p000.pc0;
            import p000.q12;
            import p000.r12;
            import p000.s12;
            import p000.s23;
            import p000.s80;
            import p000.t12;
            import p000.ta1;
            import p000.ts0;
            import p000.u12;
            import p000.v23;
            import p000.w12;
            import p000.we2;
            import p000.y12;
            import p000.z12;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public class RecyclerView extends ViewGroup implements ScrollingView, nm1 {

                /* JADX INFO: renamed from: k1 */
                public static final int[] f1604k1 = {R.attr.nestedScrollingEnabled};

                /* JADX INFO: renamed from: l1 */
                public static final Class[] f1605l1;

                /* JADX INFO: renamed from: m1 */
                public static final g12 f1606m1;

                /* JADX INFO: renamed from: A0 */
                public int f1607A0;

                /* JADX INFO: renamed from: B0 */
                public int f1608B0;

                /* JADX INFO: renamed from: C0 */
                public VelocityTracker f1609C0;

                /* JADX INFO: renamed from: D0 */
                public int f1610D0;

                /* JADX INFO: renamed from: E0 */
                public int f1611E0;

                /* JADX INFO: renamed from: F0 */
                public int f1612F0;

                /* JADX INFO: renamed from: G0 */
                public int f1613G0;

                /* JADX INFO: renamed from: H0 */
                public int f1614H0;

                /* JADX INFO: renamed from: I0 */
                public q12 f1615I0;

                /* JADX INFO: renamed from: J0 */
                public final int f1616J0;

                /* JADX INFO: renamed from: K0 */
                public final int f1617K0;

                /* JADX INFO: renamed from: L0 */
                public final float f1618L0;

                /* JADX INFO: renamed from: M0 */
                public final float f1619M0;

                /* JADX INFO: renamed from: N0 */
                public boolean f1620N0;

                /* JADX INFO: renamed from: O0 */
                public final a22 f1621O0;

                /* JADX INFO: renamed from: P0 */
                public hq0 f1622P0;

                /* JADX INFO: renamed from: Q0 */
                public final C1771iw f1623Q0;

                /* JADX INFO: renamed from: R0 */
                public final y12 f1624R0;

                /* JADX INFO: renamed from: S0 */
                public r12 f1625S0;

                /* JADX INFO: renamed from: T0 */
                public ArrayList f1626T0;

                /* JADX INFO: renamed from: U */
                public final Rect f1627U;

                /* JADX INFO: renamed from: U0 */
                public boolean f1628U0;

                /* JADX INFO: renamed from: V */
                public final RectF f1629V;

                /* JADX INFO: renamed from: V0 */
                public boolean f1630V0;

                /* JADX INFO: renamed from: W */
                public AbstractC0129g f1631W;

                /* JADX INFO: renamed from: W0 */
                public final h12 f1632W0;

                /* JADX INFO: renamed from: X0 */
                public boolean f1633X0;

                /* JADX INFO: renamed from: Y0 */
                public c22 f1634Y0;

                /* JADX INFO: renamed from: Z0 */
                public final int[] f1635Z0;

                /* JADX INFO: renamed from: a */
                public final C0135m f1636a;

                /* JADX INFO: renamed from: a0 */
                public AbstractC0133k f1637a0;

                /* JADX INFO: renamed from: a1 */
                public om1 f1638a1;

                /* JADX INFO: renamed from: b */
                public final C0134l f1639b;

                /* JADX INFO: renamed from: b0 */
                public final ArrayList f1640b0;

                /* JADX INFO: renamed from: b1 */
                public final int[] f1641b1;

                /* JADX INFO: renamed from: c */
                public SavedState f1642c;

                /* JADX INFO: renamed from: c0 */
                public final ArrayList f1643c0;

                /* JADX INFO: renamed from: c1 */
                public final int[] f1644c1;

                /* JADX INFO: renamed from: d */
                public final C2093q3 f1645d;

                /* JADX INFO: renamed from: d0 */
                public final ArrayList f1646d0;

                /* JADX INFO: renamed from: d1 */
                public final int[] f1647d1;

                /* JADX INFO: renamed from: e */
                public final C0875ec f1648e;

                /* JADX INFO: renamed from: e0 */
                public ah0 f1649e0;

                /* JADX INFO: renamed from: e1 */
                public final ArrayList f1650e1;

                /* JADX INFO: renamed from: f */
                public final we2 f1651f;

                /* JADX INFO: renamed from: f0 */
                public boolean f1652f0;

                /* JADX INFO: renamed from: f1 */
                public final f12 f1653f1;

                /* JADX INFO: renamed from: g0 */
                public boolean f1654g0;

                /* JADX INFO: renamed from: g1 */
                public boolean f1655g1;

                /* JADX INFO: renamed from: h0 */
                public boolean f1656h0;

                /* JADX INFO: renamed from: h1 */
                public int f1657h1;

                /* JADX INFO: renamed from: i */
                public boolean f1658i;

                /* JADX INFO: renamed from: i0 */
                public int f1659i0;

                /* JADX INFO: renamed from: i1 */
                public int f1660i1;

                /* JADX INFO: renamed from: j0 */
                public boolean f1661j0;

                /* JADX INFO: renamed from: j1 */
                public final h12 f1662j1;

                /* JADX INFO: renamed from: k0 */
                public boolean f1663k0;

                /* JADX INFO: renamed from: l0 */
                public boolean f1664l0;

                /* JADX INFO: renamed from: m0 */
                public int f1665m0;

                /* JADX INFO: renamed from: n0 */
                public boolean f1666n0;

                /* JADX INFO: renamed from: o0 */
                public final AccessibilityManager f1667o0;

                /* JADX INFO: renamed from: p0 */
                public ArrayList f1668p0;

                /* JADX INFO: renamed from: q0 */
                public boolean f1669q0;

                /* JADX INFO: renamed from: r0 */
                public boolean f1670r0;

                /* JADX INFO: renamed from: s0 */
                public int f1671s0;

                /* JADX INFO: renamed from: t0 */
                public int f1672t0;

                /* JADX INFO: renamed from: u0 */
                public l12 f1673u0;

                /* JADX INFO: renamed from: v */
                public final f12 f1674v;

                /* JADX INFO: renamed from: v0 */
                public EdgeEffect f1675v0;

                /* JADX INFO: renamed from: w */
                public final Rect f1676w;

                /* JADX INFO: renamed from: w0 */
                public EdgeEffect f1677w0;

                /* JADX INFO: renamed from: x0 */
                public EdgeEffect f1678x0;

                /* JADX INFO: renamed from: y0 */
                public EdgeEffect f1679y0;

                /* JADX INFO: renamed from: z0 */
                public n12 f1680z0;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends AbsSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0136n();

                    /* JADX INFO: renamed from: c */
                    public Parcelable f1685c;

                    public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */                 super(parcel, classLoader);
/* 17 */                this.f1685c = parcel.readParcelable(classLoader == null ? AbstractC0133k.class.getClassLoader() : classLoader);
                    }

                    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 7 */                 parcel.writeParcelable(this.f1685c, 0);
                    }
                }

                static {
/* 12 */            Class cls = Integer.TYPE;
/* 20 */            f1605l1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
/* 28 */            f1606m1 = new g12(0);
                }

                public RecyclerView(Context context, AttributeSet attributeSet, int i) {
                    float fM4463a;
                    TypedArray typedArray;
                    Constructor constructor;
                    Object[] objArr;
/* 9 */             super(context, attributeSet, i);
/* 17 */            this.f1636a = new C0135m(this);
/* 24 */            this.f1639b = new C0134l(this);
/* 33 */            this.f1651f = new we2(11);
/* 41 */            this.f1674v = new f12(this, 0);
/* 48 */            this.f1676w = new Rect();
/* 55 */            this.f1627U = new Rect();
/* 62 */            this.f1629V = new RectF();
/* 69 */            this.f1640b0 = new ArrayList();
/* 76 */            this.f1643c0 = new ArrayList();
/* 83 */            this.f1646d0 = new ArrayList();
/* 85 */            this.f1659i0 = 0;
/* 87 */            this.f1669q0 = false;
/* 89 */            this.f1670r0 = false;
/* 91 */            this.f1671s0 = 0;
/* 93 */            this.f1672t0 = 0;
/* 100 */           this.f1673u0 = new l12();
/* 104 */           j60 j60Var = new j60();
/* 108 */           j60Var.f14094a = null;
/* 115 */           j60Var.f14095b = new ArrayList();
/* 119 */           j60Var.f14096c = 120L;
/* 121 */           j60Var.f14097d = 120L;
/* 125 */           j60Var.f14098e = 250L;
/* 127 */           j60Var.f14099f = 250L;
/* 130 */           j60Var.f12083g = true;
/* 137 */           j60Var.f12084h = new ArrayList();
/* 144 */           j60Var.f12085i = new ArrayList();
/* 151 */           j60Var.f12086j = new ArrayList();
/* 158 */           j60Var.f12087k = new ArrayList();
/* 165 */           j60Var.f12088l = new ArrayList();
/* 172 */           j60Var.f12089m = new ArrayList();
/* 179 */           j60Var.f12090n = new ArrayList();
/* 186 */           j60Var.f12091o = new ArrayList();
/* 193 */           j60Var.f12092p = new ArrayList();
/* 200 */           j60Var.f12093q = new ArrayList();
/* 207 */           j60Var.f12094r = new ArrayList();
/* 209 */           this.f1680z0 = j60Var;
/* 211 */           this.f1607A0 = 0;
/* 214 */           this.f1608B0 = -1;
/* 217 */           this.f1618L0 = Float.MIN_VALUE;
/* 219 */           this.f1619M0 = Float.MIN_VALUE;
/* 221 */           this.f1620N0 = true;
/* 228 */           this.f1621O0 = new a22(this);
/* 235 */           this.f1623Q0 = new C1771iw();
/* 239 */           y12 y12Var = new y12();
/* 242 */           y12Var.f19437a = -1;
/* 244 */           y12Var.f19438b = 0;
/* 246 */           y12Var.f19439c = 0;
/* 248 */           y12Var.f19440d = 1;
/* 250 */           y12Var.f19441e = 0;
/* 252 */           y12Var.f19442f = false;
/* 254 */           y12Var.f19443g = false;
/* 256 */           y12Var.f19444h = false;
/* 258 */           y12Var.f19445i = false;
/* 260 */           y12Var.f19446j = false;
/* 262 */           y12Var.f19447k = false;
/* 264 */           this.f1624R0 = y12Var;
/* 266 */           this.f1628U0 = false;
/* 268 */           this.f1630V0 = false;
/* 272 */           h12 h12Var = new h12(this);
/* 275 */           this.f1632W0 = h12Var;
/* 277 */           this.f1633X0 = false;
/* 282 */           this.f1635Z0 = new int[2];
/* 286 */           this.f1641b1 = new int[2];
/* 290 */           this.f1644c1 = new int[2];
/* 294 */           this.f1647d1 = new int[2];
/* 301 */           this.f1650e1 = new ArrayList();
/* 308 */           this.f1653f1 = new f12(this, 1);
/* 310 */           this.f1657h1 = 0;
/* 312 */           this.f1660i1 = 0;
/* 319 */           this.f1662j1 = new h12(this);
/* 321 */           setScrollContainer(true);
/* 324 */           setFocusableInTouchMode(true);
/* 327 */           ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
/* 335 */           this.f1614H0 = viewConfiguration.getScaledTouchSlop();
/* 337 */           int i2 = Build.VERSION.SDK_INT;
/* 341 */           if (i2 >= 26) {
/* 343 */               Method method = i33.f9439a;
/* 345 */               fM4463a = f33.m3647a(viewConfiguration);
                    } else {
/* 350 */               fM4463a = i33.m4463a(viewConfiguration, context);
                    }
/* 354 */           this.f1618L0 = fM4463a;
/* 367 */           this.f1619M0 = i2 >= 26 ? f33.m3648b(viewConfiguration) : i33.m4463a(viewConfiguration, context);
/* 373 */           this.f1616J0 = viewConfiguration.getScaledMinimumFlingVelocity();
/* 379 */           this.f1617K0 = viewConfiguration.getScaledMaximumFlingVelocity();
/* 390 */           setWillNotDraw(getOverScrollMode() == 2);
/* 395 */           this.f1680z0.f14094a = h12Var;
/* 409 */           this.f1645d = new C2093q3(new er0(this, 13));
/* 421 */           this.f1648e = new C0875ec(new ts0(this));
/* 423 */           WeakHashMap weakHashMap = e33.f7494a;
/* 433 */           if ((i2 >= 26 ? v23.m9194c(this) : 0) == 0 && i2 >= 26) {
/* 439 */               v23.m9204m(this, 8);
                    }
/* 446 */           if (getImportantForAccessibility() == 0) {
/* 448 */               setImportantForAccessibility(1);
                    }
/* 463 */           this.f1667o0 = (AccessibilityManager) getContext().getSystemService("accessibility");
/* 470 */           setAccessibilityDelegateCompat(new c22(this));
/* 475 */           TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0122R.styleable.RecyclerView, i, 0);
/* 481 */           e33.m3317m(this, context, C0122R.styleable.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i);
/* 490 */           String string = typedArrayObtainStyledAttributes.getString(C0122R.styleable.RecyclerView_layoutManager);
/* 500 */           if (typedArrayObtainStyledAttributes.getInt(C0122R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
/* 504 */               setDescendantFocusability(262144);
                    }
/* 513 */           this.f1658i = typedArrayObtainStyledAttributes.getBoolean(C0122R.styleable.RecyclerView_android_clipToPadding, true);
/* 521 */           if (typedArrayObtainStyledAttributes.getBoolean(C0122R.styleable.RecyclerView_fastScrollEnabled, false)) {
/* 529 */               StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C0122R.styleable.RecyclerView_fastScrollVerticalThumbDrawable);
/* 533 */               Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C0122R.styleable.RecyclerView_fastScrollVerticalTrackDrawable);
/* 543 */               StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C0122R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable);
/* 547 */               Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(C0122R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable);
/* 551 */               if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
/* 612 */                   C1951n4.m6859j("Trying to set fast scroller without both required drawables.".concat(m900z()));
/* 615 */                   throw null;
                        }
/* 563 */               Resources resources = getContext().getResources();
/* 596 */               typedArray = typedArrayObtainStyledAttributes;
/* 598 */               new ah0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0122R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C0122R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0122R.dimen.fastscroll_margin));
                    } else {
/* 620 */               typedArray = typedArrayObtainStyledAttributes;
                    }
/* 621 */           typedArray.recycle();
/* 626 */           if (string != null) {
/* 628 */               String strTrim = string.trim();
/* 636 */               if (!strTrim.isEmpty()) {
/* 644 */                   if (strTrim.charAt(0) == '.') {
/* 661 */                       strTrim = context.getPackageName() + strTrim;
                            } else if (!strTrim.contains(".")) {
/* 700 */                       strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                            }
/* 665 */                   String str = strTrim;
                            try {
/* 745 */                       Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0133k.class);
                                try {
/* 751 */                           constructor = clsAsSubclass.getConstructor(f1605l1);
/* 756 */                           objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                                } catch (NoSuchMethodException e) {
                                    try {
/* 780 */                               constructor = clsAsSubclass.getConstructor(null);
/* 784 */                               objArr = null;
                                    } catch (NoSuchMethodException e2) {
/* 800 */                               e2.initCause(e);
/* 832 */                               throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                                    }
                                }
/* 786 */                       constructor.setAccessible(true);
/* 795 */                       setLayoutManager((AbstractC0133k) constructor.newInstance(objArr));
                            } catch (ClassCastException e3) {
/* 839 */                       ds0.m3192i(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
/* 842 */                       throw null;
                            } catch (ClassNotFoundException e4) {
/* 875 */                       ds0.m3192i(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
/* 878 */                       throw null;
                            } catch (IllegalAccessException e5) {
/* 849 */                       ds0.m3192i(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
/* 852 */                       throw null;
                            } catch (InstantiationException e6) {
/* 857 */                       ds0.m3192i(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
/* 860 */                       throw null;
                            } catch (InvocationTargetException e7) {
/* 865 */                       ds0.m3192i(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
/* 868 */                       throw null;
                            }
                        }
                    }
/* 879 */           int[] iArr = f1604k1;
/* 881 */           TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
/* 888 */           e33.m3317m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i);
/* 892 */           boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
/* 896 */           typedArrayObtainStyledAttributes2.recycle();
/* 899 */           setNestedScrollingEnabled(z);
                }

                /* JADX INFO: renamed from: E */
                public static RecyclerView m842E(View view) {
/* 4 */             if (!(view instanceof ViewGroup)) {
/* 3 */                 return null;
                    }
/* 9 */             if (view instanceof RecyclerView) {
/* 11 */                return (RecyclerView) view;
                    }
/* 14 */            ViewGroup viewGroup = (ViewGroup) view;
/* 16 */            int childCount = viewGroup.getChildCount();
/* 21 */            for (int i = 0; i < childCount; i++) {
/* 27 */                RecyclerView recyclerViewM842E = m842E(viewGroup.getChildAt(i));
/* 31 */                if (recyclerViewM842E != null) {
/* 33 */                    return recyclerViewM842E;
                        }
                    }
/* 3 */             return null;
                }

                /* JADX INFO: renamed from: J */
                public static AbstractC0137o m843J(View view) {
/* 1 */             if (view == null) {
/* 3 */                 return null;
                    }
/* 11 */            return ((LayoutParams) view.getLayoutParams()).f1681a;
                }

                /* JADX INFO: renamed from: K */
                public static void m844K(Rect rect, View view) {
/* 5 */             LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 7 */             Rect rect2 = layoutParams.f1682b;
/* 49 */            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                }

                private om1 getScrollingChildHelper() {
/* 3 */             if (this.f1638a1 == null) {
/* 10 */                this.f1638a1 = new om1(this);
                    }
/* 12 */            return this.f1638a1;
                }

                /* JADX INFO: renamed from: j */
                public static void m849j(AbstractC0137o abstractC0137o) {
/* 1 */             WeakReference weakReference = abstractC0137o.f1779b;
/* 3 */             if (weakReference != null) {
/* 9 */                 View view = (View) weakReference.get();
/* 12 */                while (view != null) {
/* 16 */                    if (view == abstractC0137o.f1778a) {
/* 34 */                        return;
                            }
/* 19 */                    Object parent = view.getParent();
/* 30 */                    view = parent instanceof View ? (View) parent : null;
                        }
/* 32 */                abstractC0137o.f1779b = null;
                    }
                }

                /* JADX INFO: renamed from: A */
                public final void m850A(y12 y12Var) {
/* 6 */             if (getScrollState() != 2) {
/* 28 */                y12Var.getClass();
/* 31 */                return;
                    }
/* 10 */            OverScroller overScroller = this.f1621O0.f51c;
/* 12 */            overScroller.getFinalX();
/* 15 */            overScroller.getCurrX();
/* 18 */            y12Var.getClass();
/* 21 */            overScroller.getFinalY();
/* 24 */            overScroller.getCurrY();
                }

                /* JADX INFO: renamed from: B */
                public final View m851B(View view) {
/* 1 */             ViewParent parent = view.getParent();
/* 5 */             while (parent != null && parent != this && (parent instanceof View)) {
/* 14 */                view = parent;
/* 16 */                parent = view.getParent();
                    }
/* 21 */            if (parent == this) {
/* 23 */                return view;
                    }
/* 24 */            return null;
                }

                /* JADX WARN: Code duplicated, block: B:23:0x005e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:27:0x0061 A[SYNTHETIC] */
                /* JADX INFO: renamed from: C */
                public final boolean m852C(MotionEvent motionEvent) {
/* 1 */             int action = motionEvent.getAction();
/* 5 */             ArrayList arrayList = this.f1646d0;
/* 7 */             int size = arrayList.size();
/* 13 */            for (int i = 0; i < size; i++) {
/* 19 */                ah0 ah0Var = (ah0) arrayList.get(i);
/* 21 */                int i2 = ah0Var.f281v;
/* 25 */                if (i2 == 1) {
/* 35 */                    boolean zM283e = ah0Var.m283e(motionEvent.getX(), motionEvent.getY());
/* 47 */                    boolean zM282d = ah0Var.m282d(motionEvent.getX(), motionEvent.getY());
/* 55 */                    if (motionEvent.getAction() == 0 && (zM283e || zM282d)) {
/* 61 */                        if (zM282d) {
/* 63 */                            ah0Var.f282w = 1;
/* 71 */                            ah0Var.f275p = (int) motionEvent.getX();
                                } else if (zM283e) {
/* 76 */                            ah0Var.f282w = 2;
/* 84 */                            ah0Var.f272m = (int) motionEvent.getY();
                                }
/* 86 */                        ah0Var.m284g(2);
/* 93 */                        if (action != 3) {
/* 95 */                            this.f1649e0 = ah0Var;
/* 23 */                            return true;
                                }
                            }
                        } else if (i2 != 2) {
                            continue;
                        } else if (action != 3) {
/* 95 */                    this.f1649e0 = ah0Var;
/* 23 */                    return true;
                        }
                    }
/* 11 */            return false;
                }

                /* JADX INFO: renamed from: D */
                public final void m853D(int[] iArr) {
/* 1 */             C0875ec c0875ec = this.f1648e;
/* 3 */             int iM3396u = c0875ec.m3396u();
/* 9 */             if (iM3396u == 0) {
/* 12 */                iArr[0] = -1;
/* 14 */                iArr[1] = -1;
/* 16 */                return;
                    }
/* 17 */            int i = AbstractC0208c9.API_PRIORITY_OTHER;
/* 20 */            int i2 = Integer.MIN_VALUE;
/* 23 */            for (int i3 = 0; i3 < iM3396u; i3++) {
/* 29 */                AbstractC0137o abstractC0137oM843J = m843J(c0875ec.m3395t(i3));
/* 37 */                if (!abstractC0137oM843J.m1031o()) {
/* 40 */                    int iM1018b = abstractC0137oM843J.m1018b();
/* 44 */                    if (iM1018b < i) {
/* 46 */                        i = iM1018b;
                            }
/* 47 */                    if (iM1018b > i2) {
/* 49 */                        i2 = iM1018b;
                            }
                        }
                    }
/* 53 */            iArr[0] = i;
/* 55 */            iArr[1] = i2;
                }

                /* JADX INFO: renamed from: F */
                public final AbstractC0137o m854F(int i) {
/* 3 */             AbstractC0137o abstractC0137o = null;
/* 4 */             if (this.f1669q0) {
/* 3 */                 return null;
                    }
/* 7 */             C0875ec c0875ec = this.f1648e;
/* 9 */             int iM3363A = c0875ec.m3363A();
/* 14 */            for (int i2 = 0; i2 < iM3363A; i2++) {
/* 20 */                AbstractC0137o abstractC0137oM843J = m843J(c0875ec.m3399z(i2));
/* 24 */                if (abstractC0137oM843J != null && !abstractC0137oM843J.m1024h() && m855G(abstractC0137oM843J) == i) {
/* 48 */                    if (!((ArrayList) c0875ec.f7615d).contains(abstractC0137oM843J.f1778a)) {
/* 52 */                        return abstractC0137oM843J;
                            }
/* 50 */                    abstractC0137o = abstractC0137oM843J;
                        }
                    }
/* 56 */            return abstractC0137o;
                }

                /* JADX INFO: renamed from: G */
                public final int m855G(AbstractC0137o abstractC0137o) {
/* 6 */             if ((abstractC0137o.f1787j & 524) == 0 && abstractC0137o.m1021e()) {
/* 16 */                int i = abstractC0137o.f1780c;
/* 22 */                ArrayList arrayList = (ArrayList) this.f1645d.f15371c;
/* 24 */                int size = arrayList.size();
/* 29 */                for (int i2 = 0; i2 < size; i2++) {
/* 35 */                    C2056p3 c2056p3 = (C2056p3) arrayList.get(i2);
/* 37 */                    int i3 = c2056p3.f14951a;
/* 40 */                    if (i3 != 1) {
/* 43 */                        if (i3 == 2) {
/* 68 */                            int i4 = c2056p3.f14952b;
/* 70 */                            if (i4 <= i) {
/* 72 */                                int i5 = c2056p3.f14953c;
/* 75 */                                if (i4 + i5 <= i) {
/* 78 */                                    i -= i5;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else if (i3 == 8) {
/* 50 */                            int i6 = c2056p3.f14952b;
/* 52 */                            if (i6 == i) {
/* 54 */                                i = c2056p3.f14953c;
                                    } else {
/* 57 */                                if (i6 < i) {
/* 59 */                                    i--;
                                        }
/* 63 */                                if (c2056p3.f14953c <= i) {
/* 65 */                                    i++;
                                        }
                                    }
                                }
                            } else if (c2056p3.f14952b <= i) {
/* 86 */                        i += c2056p3.f14953c;
                            }
                        }
/* 90 */                return i;
                    }
/* 5 */             return -1;
                }

                /* JADX INFO: renamed from: H */
                public final long m856H(AbstractC0137o abstractC0137o) {
                    return this.f1631W.f1749b ? abstractC0137o.f1782e : abstractC0137o.f1780c;
                }

                /* JADX INFO: renamed from: I */
                public final AbstractC0137o m857I(View view) {
/* 1 */             ViewParent parent = view.getParent();
/* 5 */             if (parent == null || parent == this) {
/* 19 */                return m843J(view);
                    }
/* 14 */            ds0.m3196m("View ", view, " is not a direct child of ", this);
/* 17 */            return null;
                }

                /* JADX INFO: renamed from: L */
                public final Rect m858L(View view) {
/* 5 */             LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 7 */             boolean z = layoutParams.f1683c;
/* 9 */             Rect rect = layoutParams.f1682b;
/* 11 */            if (!z || (this.f1624R0.f19443g && (layoutParams.f1681a.m1027k() || layoutParams.f1681a.m1022f()))) {
/* 36 */                return rect;
                    }
/* 38 */            rect.set(0, 0, 0, 0);
/* 41 */            ArrayList arrayList = this.f1643c0;
/* 43 */            int size = arrayList.size();
/* 48 */            for (int i = 0; i < size; i++) {
/* 50 */                Rect rect2 = this.f1676w;
/* 52 */                rect2.set(0, 0, 0, 0);
/* 61 */                ((AbstractC0130h) arrayList.get(i)).mo962a(rect2, view);
/* 69 */                rect.left += rect2.left;
/* 76 */                rect.top += rect2.top;
/* 83 */                rect.right += rect2.right;
/* 90 */                rect.bottom += rect2.bottom;
                    }
/* 95 */            layoutParams.f1683c = false;
/* 97 */            return rect;
                }

                /* JADX INFO: renamed from: M */
                public final boolean m859M() {
                    return !this.f1656h0 || this.f1669q0 || this.f1645d.m7687h();
                }

                /* JADX INFO: renamed from: N */
                public final boolean m860N() {
                    return this.f1671s0 > 0;
                }

                /* JADX INFO: renamed from: O */
                public final void m861O(int i) {
/* 3 */             if (this.f1637a0 == null) {
/* 5 */                 return;
                    }
/* 7 */             setScrollState(2);
/* 12 */            this.f1637a0.mo841y0(i);
/* 15 */            awakenScrollBars();
                }

                /* JADX INFO: renamed from: P */
                public final void m862P() {
/* 1 */             C0875ec c0875ec = this.f1648e;
/* 3 */             int iM3363A = c0875ec.m3363A();
/* 10 */            for (int i = 0; i < iM3363A; i++) {
/* 22 */                ((LayoutParams) c0875ec.m3399z(i).getLayoutParams()).f1683c = true;
                    }
/* 29 */            ArrayList arrayList = this.f1639b.f1770c;
/* 31 */            int size = arrayList.size();
/* 35 */            for (int i2 = 0; i2 < size; i2++) {
/* 49 */                LayoutParams layoutParams = (LayoutParams) ((AbstractC0137o) arrayList.get(i2)).f1778a.getLayoutParams();
/* 51 */                if (layoutParams != null) {
/* 53 */                    layoutParams.f1683c = true;
                        }
                    }
                }

                /* JADX INFO: renamed from: Q */
                public final void m863Q(int i, int i2, boolean z) {
/* 1 */             int i3 = i + i2;
/* 3 */             C0875ec c0875ec = this.f1648e;
/* 5 */             int iM3363A = c0875ec.m3363A();
/* 13 */            for (int i4 = 0; i4 < iM3363A; i4++) {
/* 19 */                AbstractC0137o abstractC0137oM843J = m843J(c0875ec.m3399z(i4));
/* 23 */                if (abstractC0137oM843J != null && !abstractC0137oM843J.m1031o()) {
/* 31 */                    int i5 = abstractC0137oM843J.f1780c;
/* 33 */                    y12 y12Var = this.f1624R0;
/* 35 */                    if (i5 >= i3) {
/* 38 */                        abstractC0137oM843J.m1028l(-i2, z);
/* 41 */                        y12Var.f19442f = true;
                            } else if (i5 >= i) {
/* 49 */                        abstractC0137oM843J.m1017a(8);
/* 52 */                        abstractC0137oM843J.m1028l(-i2, z);
/* 55 */                        abstractC0137oM843J.f1780c = i - 1;
/* 57 */                        y12Var.f19442f = true;
                            }
                        }
                    }
/* 62 */            C0134l c0134l = this.f1639b;
/* 64 */            ArrayList arrayList = c0134l.f1770c;
/* 71 */            for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 77 */                AbstractC0137o abstractC0137o = (AbstractC0137o) arrayList.get(size);
/* 79 */                if (abstractC0137o != null) {
/* 81 */                    int i6 = abstractC0137o.f1780c;
/* 83 */                    if (i6 >= i3) {
/* 86 */                        abstractC0137o.m1028l(-i2, z);
                            } else if (i6 >= i) {
/* 92 */                        abstractC0137o.m1017a(8);
/* 95 */                        c0134l.m1008e(size);
                            }
                        }
                    }
/* 101 */           requestLayout();
                }

                /* JADX INFO: renamed from: R */
                public final void m864R() {
/* 5 */             this.f1671s0++;
                }

                /* JADX INFO: renamed from: S */
                public final void m865S(boolean z) {
                    int i;
                    AccessibilityManager accessibilityManager;
/* 4 */             int i2 = this.f1671s0 - 1;
/* 5 */             this.f1671s0 = i2;
/* 7 */             if (i2 < 1) {
/* 10 */                this.f1671s0 = 0;
/* 12 */                if (z) {
/* 14 */                    int i3 = this.f1665m0;
/* 16 */                    this.f1665m0 = 0;
/* 18 */                    if (i3 != 0 && (accessibilityManager = this.f1667o0) != null && accessibilityManager.isEnabled()) {
/* 30 */                        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
/* 36 */                        accessibilityEventObtain.setEventType(2048);
/* 39 */                        accessibilityEventObtain.setContentChangeTypes(i3);
/* 42 */                        sendAccessibilityEventUnchecked(accessibilityEventObtain);
                            }
/* 45 */                    ArrayList arrayList = this.f1650e1;
/* 52 */                    for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 58 */                        AbstractC0137o abstractC0137o = (AbstractC0137o) arrayList.get(size);
/* 66 */                        if (abstractC0137o.f1778a.getParent() == this && !abstractC0137o.m1031o() && (i = abstractC0137o.f1794q) != -1) {
/* 80 */                            View view = abstractC0137o.f1778a;
/* 82 */                            WeakHashMap weakHashMap = e33.f7494a;
/* 84 */                            view.setImportantForAccessibility(i);
/* 87 */                            abstractC0137o.f1794q = -1;
                                }
                            }
/* 92 */                    arrayList.clear();
                        }
                    }
                }

                /* JADX INFO: renamed from: T */
                public final void m866T(MotionEvent motionEvent) {
/* 1 */             int actionIndex = motionEvent.getActionIndex();
/* 11 */            if (motionEvent.getPointerId(actionIndex) == this.f1608B0) {
/* 17 */                int i = actionIndex == 0 ? 1 : 0;
/* 22 */                this.f1608B0 = motionEvent.getPointerId(i);
/* 31 */                int x = (int) (motionEvent.getX(i) + 0.5f);
/* 32 */                this.f1612F0 = x;
/* 34 */                this.f1610D0 = x;
/* 41 */                int y = (int) (motionEvent.getY(i) + 0.5f);
/* 42 */                this.f1613G0 = y;
/* 44 */                this.f1611E0 = y;
                    }
                }

                /* JADX INFO: renamed from: U */
                public final void m867U() {
/* 3 */             if (this.f1633X0 || !this.f1652f0) {
/* 19 */                return;
                    }
/* 9 */             WeakHashMap weakHashMap = e33.f7494a;
/* 13 */            postOnAnimation(this.f1653f1);
/* 17 */            this.f1633X0 = true;
                }

                /* JADX INFO: renamed from: V */
                public final void m868V() {
                    boolean z;
/* 1 */             boolean z2 = this.f1669q0;
/* 3 */             C2093q3 c2093q3 = this.f1645d;
/* 5 */             boolean z3 = false;
/* 6 */             if (z2) {
/* 12 */                c2093q3.m7691l((ArrayList) c2093q3.f15371c);
/* 19 */                c2093q3.m7691l((ArrayList) c2093q3.f15372d);
/* 22 */                c2093q3.f15369a = 0;
/* 26 */                if (this.f1670r0) {
/* 30 */                    this.f1637a0.mo775g0();
                        }
                    }
/* 49 */            if (this.f1680z0 != null && this.f1637a0.mo767K0()) {
/* 51 */                c2093q3.m7690k();
                    } else {
/* 55 */                c2093q3.m7683c();
                    }
/* 69 */            boolean z4 = this.f1628U0 || this.f1630V0;
/* 100 */           boolean z5 = this.f1656h0 && this.f1680z0 != null && ((z = this.f1669q0) || z4 || this.f1637a0.f1764f) && (!z || this.f1631W.f1749b);
/* 101 */           y12 y12Var = this.f1624R0;
/* 103 */           y12Var.f19446j = z5;
/* 105 */           if (z5 && z4 && !this.f1669q0 && this.f1680z0 != null && this.f1637a0.mo767K0()) {
/* 125 */               z3 = true;
                    }
/* 126 */           y12Var.f19447k = z3;
                }

                /* JADX INFO: renamed from: W */
                public final void m869W(boolean z) {
/* 4 */             this.f1670r0 = z | this.f1670r0;
/* 7 */             this.f1669q0 = true;
/* 9 */             C0875ec c0875ec = this.f1648e;
/* 11 */            int iM3363A = c0875ec.m3363A();
/* 18 */            for (int i = 0; i < iM3363A; i++) {
/* 24 */                AbstractC0137o abstractC0137oM843J = m843J(c0875ec.m3399z(i));
/* 28 */                if (abstractC0137oM843J != null && !abstractC0137oM843J.m1031o()) {
/* 36 */                    abstractC0137oM843J.m1017a(6);
                        }
                    }
/* 42 */            m862P();
/* 45 */            C0134l c0134l = this.f1639b;
/* 47 */            ArrayList arrayList = c0134l.f1770c;
/* 49 */            int size = arrayList.size();
/* 53 */            for (int i2 = 0; i2 < size; i2++) {
/* 59 */                AbstractC0137o abstractC0137o = (AbstractC0137o) arrayList.get(i2);
/* 61 */                if (abstractC0137o != null) {
/* 63 */                    abstractC0137o.m1017a(6);
/* 68 */                    abstractC0137o.m1017a(Segment.SHARE_MINIMUM);
                        }
                    }
/* 76 */            AbstractC0129g abstractC0129g = c0134l.f1775h.f1631W;
/* 78 */            if (abstractC0129g == null || !abstractC0129g.f1749b) {
/* 86 */                c0134l.m1007d();
                    }
                }

                /* JADX INFO: renamed from: X */
                public final void m870X(AbstractC0137o abstractC0137o, m12 m12Var) {
/* 5 */             abstractC0137o.f1787j &= -8193;
/* 9 */             boolean z = this.f1624R0.f19444h;
/* 11 */            we2 we2Var = this.f1651f;
/* 13 */            if (z && abstractC0137o.m1027k() && !abstractC0137o.m1024h() && !abstractC0137o.m1031o()) {
/* 41 */                ((ta1) we2Var.f18595b).m8755d(abstractC0137o, m856H(abstractC0137o));
                    }
/* 46 */            le2 le2Var = (le2) we2Var.f18596c;
/* 53 */            p33 p33VarM7324a = (p33) le2Var.getOrDefault(abstractC0137o, null);
/* 55 */            if (p33VarM7324a == null) {
/* 57 */                p33VarM7324a = p33.m7324a();
/* 61 */                le2Var.put(abstractC0137o, p33VarM7324a);
                    }
/* 64 */            p33VarM7324a.f14958b = m12Var;
/* 70 */            p33VarM7324a.f14957a |= 4;
                }

                /* JADX INFO: renamed from: Y */
                public final void m871Y(View view, View view2) {
/* 5 */             View view3 = view2 != null ? view2 : view;
/* 6 */             int width = view3.getWidth();
/* 10 */            int height = view3.getHeight();
/* 14 */            Rect rect = this.f1676w;
/* 17 */            rect.set(0, 0, width, height);
/* 20 */            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
/* 26 */            if (layoutParams instanceof LayoutParams) {
/* 28 */                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
/* 32 */                if (!layoutParams2.f1683c) {
/* 34 */                    Rect rect2 = layoutParams2.f1682b;
/* 41 */                    rect.left -= rect2.left;
/* 48 */                    rect.right += rect2.right;
/* 55 */                    rect.top -= rect2.top;
/* 62 */                    rect.bottom += rect2.bottom;
                        }
                    }
/* 64 */            if (view2 != null) {
/* 66 */                offsetDescendantRectToMyCoords(view2, rect);
/* 69 */                offsetRectIntoDescendantCoords(view, rect);
                    }
/* 88 */            this.f1637a0.mo1002v0(this, view, this.f1676w, !this.f1656h0, view2 == null);
                }

                /* JADX INFO: renamed from: Z */
                public final void m872Z() {
/* 1 */             VelocityTracker velocityTracker = this.f1609C0;
/* 3 */             if (velocityTracker != null) {
/* 5 */                 velocityTracker.clear();
                    }
/* 8 */             boolean zIsFinished = false;
/* 9 */             m883h0(0);
/* 12 */            EdgeEffect edgeEffect = this.f1675v0;
/* 14 */            if (edgeEffect != null) {
/* 16 */                edgeEffect.onRelease();
/* 21 */                zIsFinished = this.f1675v0.isFinished();
                    }
/* 25 */            EdgeEffect edgeEffect2 = this.f1677w0;
/* 27 */            if (edgeEffect2 != null) {
/* 29 */                edgeEffect2.onRelease();
/* 38 */                zIsFinished |= this.f1677w0.isFinished();
                    }
/* 39 */            EdgeEffect edgeEffect3 = this.f1678x0;
/* 41 */            if (edgeEffect3 != null) {
/* 43 */                edgeEffect3.onRelease();
/* 52 */                zIsFinished |= this.f1678x0.isFinished();
                    }
/* 53 */            EdgeEffect edgeEffect4 = this.f1679y0;
/* 55 */            if (edgeEffect4 != null) {
/* 57 */                edgeEffect4.onRelease();
/* 66 */                zIsFinished |= this.f1679y0.isFinished();
                    }
/* 67 */            if (zIsFinished) {
/* 69 */                WeakHashMap weakHashMap = e33.f7494a;
/* 71 */                postInvalidateOnAnimation();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
                /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
                /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
                /* JADX WARN: Code duplicated, block: B:36:0x00fc A[DONT_INVERT, PHI: r7
  0x00fc: PHI (r7v10 boolean) = (r7v8 boolean), (r7v11 boolean) binds: [B:34:0x00e3, B:32:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
                /* JADX WARN: Code duplicated, block: B:41:0x0106  */
                /* JADX INFO: renamed from: a0 */
                public final boolean m873a0(int i, int i2, MotionEvent motionEvent, int i3) {
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    boolean z;
                    boolean z2;
/* 7 */             m887m();
/* 10 */            AbstractC0129g abstractC0129g = this.f1631W;
/* 12 */            int[] iArr = this.f1647d1;
/* 16 */            if (abstractC0129g != null) {
/* 18 */                iArr[0] = 0;
/* 20 */                iArr[1] = 0;
/* 22 */                m874b0(i, i2, iArr);
/* 25 */                i4 = iArr[0];
/* 27 */                i5 = iArr[1];
/* 29 */                i6 = i - i4;
/* 31 */                i7 = i2 - i5;
                    } else {
/* 34 */                i4 = 0;
/* 35 */                i5 = 0;
/* 36 */                i6 = 0;
/* 37 */                i7 = 0;
                    }
/* 44 */            if (!this.f1643c0.isEmpty()) {
/* 46 */                invalidate();
                    }
/* 49 */            iArr[0] = 0;
/* 51 */            iArr[1] = 0;
/* 57 */            m894t(i4, i5, i6, i7, this.f1641b1, i3, iArr);
/* 60 */            int i8 = iArr[0];
/* 62 */            int i9 = i6 - i8;
/* 63 */            int i10 = iArr[1];
/* 65 */            int i11 = i7 - i10;
/* 73 */            boolean z3 = (i8 == 0 && i10 == 0) ? false : true;
/* 74 */            int i12 = this.f1612F0;
/* 76 */            int[] iArr2 = this.f1641b1;
/* 78 */            int i13 = iArr2[0];
/* 81 */            this.f1612F0 = i12 - i13;
/* 83 */            int i14 = this.f1613G0;
/* 85 */            int i15 = iArr2[1];
/* 88 */            this.f1613G0 = i14 - i15;
/* 90 */            int[] iArr3 = this.f1644c1;
/* 95 */            iArr3[0] = iArr3[0] + i13;
/* 100 */           iArr3[1] = iArr3[1] + i15;
/* 107 */           if (getOverScrollMode() != 2) {
/* 109 */               if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
/* 120 */                   z = true;
                        } else {
/* 124 */                   float x = motionEvent.getX();
                            float f = i9;
/* 129 */                   float y = motionEvent.getY();
                            float f2 = i11;
/* 139 */                   if (f < 0.0f) {
/* 141 */                       m897w();
/* 147 */                       z = true;
/* 163 */                       bc0.m1330a(this.f1675v0, (-f) / getWidth(), 1.0f - (y / getHeight()));
                            } else {
/* 169 */                       z = true;
/* 173 */                       if (f > 0.0f) {
/* 175 */                           m898x();
/* 193 */                           bc0.m1330a(this.f1678x0, f / getWidth(), y / getHeight());
                                } else {
/* 197 */                           z2 = false;
                                }
/* 200 */                       if (f2 < 0.0f) {
/* 202 */                           m899y();
/* 220 */                           bc0.m1330a(this.f1677w0, (-f2) / getHeight(), x / getWidth());
                                } else if (f2 > 0.0f) {
/* 230 */                           m896v();
/* 249 */                           bc0.m1330a(this.f1679y0, f2 / getHeight(), 1.0f - (x / getWidth()));
                                } else if (z2 || f != 0.0f || f2 != 0.0f) {
/* 263 */                           WeakHashMap weakHashMap = e33.f7494a;
/* 265 */                           postInvalidateOnAnimation();
                                }
/* 223 */                       z2 = z;
/* 253 */                       if (z2) {
/* 263 */                           WeakHashMap weakHashMap2 = e33.f7494a;
/* 265 */                           postInvalidateOnAnimation();
                                } else {
/* 263 */                           WeakHashMap weakHashMap3 = e33.f7494a;
/* 265 */                           postInvalidateOnAnimation();
                                }
                            }
/* 166 */                   z2 = z;
/* 200 */                   if (f2 < 0.0f) {
/* 202 */                       m899y();
/* 220 */                       bc0.m1330a(this.f1677w0, (-f2) / getHeight(), x / getWidth());
                            } else if (f2 > 0.0f) {
/* 230 */                       m896v();
/* 249 */                       bc0.m1330a(this.f1679y0, f2 / getHeight(), 1.0f - (x / getWidth()));
                            } else if (z2) {
/* 263 */                       WeakHashMap weakHashMap4 = e33.f7494a;
/* 265 */                       postInvalidateOnAnimation();
                            } else {
/* 263 */                       WeakHashMap weakHashMap5 = e33.f7494a;
/* 265 */                       postInvalidateOnAnimation();
                            }
/* 223 */                   z2 = z;
/* 253 */                   if (z2) {
/* 263 */                       WeakHashMap weakHashMap6 = e33.f7494a;
/* 265 */                       postInvalidateOnAnimation();
                            } else {
/* 263 */                       WeakHashMap weakHashMap7 = e33.f7494a;
/* 265 */                       postInvalidateOnAnimation();
                            }
                        }
/* 268 */               m886l(i, i2);
                    } else {
/* 272 */               z = true;
                    }
/* 274 */           if (i4 != 0 || i5 != 0) {
/* 278 */               m895u(i4, i5);
                    }
/* 285 */           if (!awakenScrollBars()) {
/* 287 */               invalidate();
                    }
/* 290 */           if (!z3 && i4 == 0 && i5 == 0) {
/* 15 */                return false;
                    }
/* 298 */           return z;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void addFocusables(ArrayList arrayList, int i, int i2) {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k != null) {
/* 5 */                 abstractC0133k.getClass();
                    }
/* 8 */             super.addFocusables(arrayList, i, i2);
                }

                /* JADX INFO: renamed from: b0 */
                public final void m874b0(int i, int i2, int[] iArr) {
                    AbstractC0137o abstractC0137o;
/* 1 */             m879f0();
/* 4 */             m864R();
/* 7 */             int i3 = oq2.f14866a;
/* 11 */            Trace.beginSection("RV Scroll");
/* 14 */            y12 y12Var = this.f1624R0;
/* 16 */            m850A(y12Var);
/* 19 */            C0134l c0134l = this.f1639b;
/* 31 */            int iMo793x0 = i != 0 ? this.f1637a0.mo793x0(i, y12Var, c0134l) : 0;
/* 41 */            int iMo798z0 = i2 != 0 ? this.f1637a0.mo798z0(i2, y12Var, c0134l) : 0;
/* 42 */            Trace.endSection();
/* 45 */            C0875ec c0875ec = this.f1648e;
/* 47 */            int iM3396u = c0875ec.m3396u();
/* 52 */            for (int i4 = 0; i4 < iM3396u; i4++) {
/* 54 */                View viewM3395t = c0875ec.m3395t(i4);
/* 58 */                AbstractC0137o abstractC0137oM857I = m857I(viewM3395t);
/* 62 */                if (abstractC0137oM857I != null && (abstractC0137o = abstractC0137oM857I.f1786i) != null) {
/* 68 */                    View view = abstractC0137o.f1778a;
/* 70 */                    int left = viewM3395t.getLeft();
/* 74 */                    int top = viewM3395t.getTop();
/* 82 */                    if (left != view.getLeft() || top != view.getTop()) {
/* 100 */                       view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                            }
                        }
                    }
/* 107 */           m865S(true);
/* 110 */           m881g0(false);
/* 113 */           if (iArr != null) {
/* 115 */               iArr[0] = iMo793x0;
/* 117 */               iArr[1] = iMo798z0;
                    }
                }

                /* JADX INFO: renamed from: c0 */
                public final void m875c0(int i) {
                    C0126d c0126d;
/* 3 */             if (this.f1663k0) {
/* 5 */                 return;
                    }
/* 7 */             setScrollState(0);
/* 10 */            a22 a22Var = this.f1621O0;
/* 14 */            a22Var.f55i.removeCallbacks(a22Var);
/* 19 */            a22Var.f51c.abortAnimation();
/* 22 */            AbstractC0133k abstractC0133k = this.f1637a0;
/* 24 */            if (abstractC0133k != null && (c0126d = abstractC0133k.f1763e) != null) {
/* 30 */                c0126d.m9682d();
                    }
/* 33 */            AbstractC0133k abstractC0133k2 = this.f1637a0;
/* 35 */            if (abstractC0133k2 == null) {
/* 41 */                AbstractC1245n0.m4876d("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else {
/* 45 */                abstractC0133k2.mo841y0(i);
/* 48 */                awakenScrollBars();
                    }
                }

                @Override // android.view.ViewGroup
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
                    return (layoutParams instanceof LayoutParams) && this.f1637a0.mo783q((LayoutParams) layoutParams);
                }

                @Override // android.view.View, androidx.core.view.ScrollingView
                public final int computeHorizontalScrollExtent() {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k != null && abstractC0133k.mo832o()) {
/* 16 */                return this.f1637a0.mo839u(this.f1624R0);
                    }
/* 21 */            return 0;
                }

                @Override // android.view.View, androidx.core.view.ScrollingView
                public final int computeHorizontalScrollOffset() {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k != null && abstractC0133k.mo832o()) {
/* 16 */                return this.f1637a0.mo789v(this.f1624R0);
                    }
/* 21 */            return 0;
                }

                @Override // android.view.View, androidx.core.view.ScrollingView
                public final int computeHorizontalScrollRange() {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k != null && abstractC0133k.mo832o()) {
/* 16 */                return this.f1637a0.mo791w(this.f1624R0);
                    }
/* 21 */            return 0;
                }

                @Override // android.view.View, androidx.core.view.ScrollingView
                public final int computeVerticalScrollExtent() {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k != null && abstractC0133k.mo835p()) {
/* 16 */                return this.f1637a0.mo840x(this.f1624R0);
                    }
/* 21 */            return 0;
                }

                @Override // android.view.View, androidx.core.view.ScrollingView
                public final int computeVerticalScrollOffset() {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k != null && abstractC0133k.mo835p()) {
/* 16 */                return this.f1637a0.mo795y(this.f1624R0);
                    }
/* 21 */            return 0;
                }

                @Override // android.view.View, androidx.core.view.ScrollingView
                public final int computeVerticalScrollRange() {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k != null && abstractC0133k.mo835p()) {
/* 16 */                return this.f1637a0.mo797z(this.f1624R0);
                    }
/* 21 */            return 0;
                }

                /* JADX INFO: renamed from: d0 */
                public final void m876d0(int i, int i2, boolean z) {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k == null) {
/* 9 */                 AbstractC1245n0.m4876d("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
/* 12 */                return;
                    }
/* 15 */            if (this.f1663k0) {
/* 40 */                return;
                    }
/* 23 */            if (!abstractC0133k.mo832o()) {
/* 25 */                i = 0;
                    }
/* 32 */            if (!this.f1637a0.mo835p()) {
/* 34 */                i2 = 0;
                    }
/* 35 */            if (i == 0 && i2 == 0) {
/* 40 */                return;
                    }
/* 41 */            if (z) {
/* 44 */                int i3 = i != 0 ? 1 : 0;
/* 47 */                if (i2 != 0) {
/* 49 */                    i3 |= 2;
                        }
/* 55 */                getScrollingChildHelper().m7214g(i3, 1);
                    }
/* 63 */            this.f1621O0.m41b(i, i2, Integer.MIN_VALUE, null);
                }

                @Override // android.view.View
                public final boolean dispatchNestedFling(float f, float f2, boolean z) {
/* 5 */             return getScrollingChildHelper().m7208a(f, f2, z);
                }

                @Override // android.view.View
                public final boolean dispatchNestedPreFling(float f, float f2) {
/* 5 */             return getScrollingChildHelper().m7209b(f, f2);
                }

                @Override // android.view.View
                public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
/* 10 */            return getScrollingChildHelper().m7210c(i, i2, iArr, iArr2, 0);
                }

                @Override // android.view.View
                public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
/* 12 */            return getScrollingChildHelper().m7211d(i, i2, i3, i4, iArr, 0, null);
                }

                @Override // android.view.View
                public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             onPopulateAccessibilityEvent(accessibilityEvent);
/* 4 */             return true;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
/* 1 */             dispatchThawSelfOnly(sparseArray);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void dispatchSaveInstanceState(SparseArray sparseArray) {
/* 1 */             dispatchFreezeSelfOnly(sparseArray);
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                    boolean z;
/* 1 */             super.draw(canvas);
/* 4 */             ArrayList arrayList = this.f1643c0;
/* 6 */             int size = arrayList.size();
/* 10 */            boolean z2 = false;
/* 12 */            for (int i = 0; i < size; i++) {
/* 20 */                ((AbstractC0130h) arrayList.get(i)).mo281c(canvas);
                    }
/* 26 */            EdgeEffect edgeEffect = this.f1675v0;
/* 29 */            if (edgeEffect == null || edgeEffect.isFinished()) {
/* 84 */                z = false;
                    } else {
/* 37 */                int iSave = canvas.save();
/* 50 */                int paddingBottom = this.f1658i ? getPaddingBottom() : 0;
/* 53 */                canvas.rotate(270.0f);
/* 64 */                canvas.translate((-getHeight()) + paddingBottom, 0.0f);
/* 67 */                EdgeEffect edgeEffect2 = this.f1675v0;
/* 79 */                z = edgeEffect2 != null && edgeEffect2.draw(canvas);
/* 80 */                canvas.restoreToCount(iSave);
                    }
/* 85 */            EdgeEffect edgeEffect3 = this.f1677w0;
/* 87 */            if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
/* 95 */                int iSave2 = canvas.save();
/* 101 */               if (this.f1658i) {
/* 113 */                   canvas.translate(getPaddingLeft(), getPaddingTop());
                        }
/* 116 */               EdgeEffect edgeEffect4 = this.f1677w0;
/* 129 */               z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
/* 130 */               canvas.restoreToCount(iSave2);
                    }
/* 133 */           EdgeEffect edgeEffect5 = this.f1678x0;
/* 135 */           if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
/* 143 */               int iSave3 = canvas.save();
/* 147 */               int width = getWidth();
/* 160 */               int paddingTop = this.f1658i ? getPaddingTop() : 0;
/* 163 */               canvas.rotate(90.0f);
/* 169 */               canvas.translate(paddingTop, -width);
/* 172 */               EdgeEffect edgeEffect6 = this.f1678x0;
/* 185 */               z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
/* 186 */               canvas.restoreToCount(iSave3);
                    }
/* 189 */           EdgeEffect edgeEffect7 = this.f1679y0;
/* 191 */           if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
/* 199 */               int iSave4 = canvas.save();
/* 205 */               canvas.rotate(180.0f);
/* 210 */               if (this.f1658i) {
/* 234 */                   canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
                        } else {
/* 250 */                   canvas.translate(-getWidth(), -getHeight());
                        }
/* 253 */               EdgeEffect edgeEffect8 = this.f1679y0;
/* 255 */               if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
/* 263 */                   z2 = true;
                        }
/* 264 */               z |= z2;
/* 265 */               canvas.restoreToCount(iSave4);
                    }
/* 290 */           if ((z || this.f1680z0 == null || arrayList.size() <= 0 || !this.f1680z0.mo5716f()) ? z : true) {
/* 292 */               WeakHashMap weakHashMap = e33.f7494a;
/* 294 */               postInvalidateOnAnimation();
                    }
                }

                @Override // android.view.ViewGroup
                public final boolean drawChild(Canvas canvas, View view, long j) {
/* 1 */             return super.drawChild(canvas, view, j);
                }

                /* JADX INFO: renamed from: e0 */
                public final void m877e0(int i) {
/* 3 */             if (this.f1663k0) {
/* 5 */                 return;
                    }
/* 6 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 8 */             if (abstractC0133k == null) {
/* 14 */                AbstractC1245n0.m4876d("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else {
/* 18 */                abstractC0133k.mo801I0(this, i);
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m878f(AbstractC0137o abstractC0137o) {
/* 1 */             View view = abstractC0137o.f1778a;
/* 12 */            boolean z = view.getParent() == this;
/* 19 */            this.f1639b.m1013j(m857I(view));
/* 22 */            boolean zM1026j = abstractC0137o.m1026j();
/* 27 */            C0875ec c0875ec = this.f1648e;
/* 29 */            if (zM1026j) {
/* 35 */                c0875ec.m3383f(view, -1, view.getLayoutParams(), true);
/* 38 */                return;
                    }
/* 39 */            if (!z) {
/* 41 */                c0875ec.m3382e(-1, view, true);
/* 44 */                return;
                    }
/* 53 */            int iIndexOfChild = ((RecyclerView) ((ts0) c0875ec.f7613b).f17248a).indexOfChild(view);
/* 57 */            if (iIndexOfChild < 0) {
/* 72 */                s80.m8430k(view, "view is not a child, cannot hide ");
                    } else {
/* 63 */                ((C0193bu) c0875ec.f7614c).m1440h(iIndexOfChild);
/* 66 */                c0875ec.m3366D(view);
                    }
                }

                /* JADX INFO: renamed from: f0 */
                public final void m879f0() {
/* 4 */             int i = this.f1659i0 + 1;
/* 5 */             this.f1659i0 = i;
/* 7 */             if (i != 1 || this.f1663k0) {
/* 16 */                return;
                    }
/* 14 */            this.f1661j0 = false;
                }

                /* JADX WARN: Code duplicated, block: B:109:0x0154 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:110:0x0156 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:111:0x0158 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:112:0x015a  */
                /* JADX WARN: Code duplicated, block: B:114:0x015e  */
                /* JADX WARN: Code duplicated, block: B:116:0x0162 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:118:0x0165  */
                /* JADX WARN: Code duplicated, block: B:120:0x0180 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:122:0x0183 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:124:0x0186 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:126:0x0189  */
                /* JADX WARN: Code duplicated, block: B:127:0x018b  */
                /* JADX WARN: Code duplicated, block: B:128:0x018d  */
                /* JADX WARN: Code duplicated, block: B:131:0x0191  */
                /* JADX WARN: Code duplicated, block: B:132:0x0193  */
                /* JADX WARN: Code duplicated, block: B:133:0x0195  */
                /* JADX WARN: Code duplicated, block: B:24:0x004c  */
                /* JADX WARN: Code duplicated, block: B:80:0x010e  */
                /* JADX WARN: Code duplicated, block: B:81:0x0110  */
                /* JADX WARN: Code restructure failed: missing block: B:116:0x0162, code lost:
                
                    if (r16 > 0) goto L135;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:120:0x0180, code lost:
                
                    if (r5 > 0) goto L135;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:122:0x0183, code lost:
                
                    if (r16 < 0) goto L135;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:124:0x0186, code lost:
                
                    if (r5 < 0) goto L135;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:129:0x018e, code lost:
                
                    if ((r5 * r6) <= 0) goto L136;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:134:0x0196, code lost:
                
                    if ((r5 * r6) >= 0) goto L136;
                 */
                /* JADX WARN: Instruction removed from duplicated block: B:118:0x0165, please report this as an issue */
                @Override // android.view.ViewGroup, android.view.ViewParent
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final View focusSearch(View view, int i) {
                    View viewMo771a0;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    byte b;
                    boolean z;
/* 9 */             this.f1637a0.getClass();
/* 34 */            boolean z2 = (this.f1631W == null || this.f1637a0 == null || m860N() || this.f1663k0) ? false : true;
/* 35 */            FocusFinder focusFinder = FocusFinder.getInstance();
/* 39 */            y12 y12Var = this.f1624R0;
/* 41 */            C0134l c0134l = this.f1639b;
/* 49 */            if (z2 && (i == 2 || i == 1)) {
/* 61 */                if (this.f1637a0.mo835p()) {
/* 73 */                    if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
/* 75 */                        z = true;
                            } else {
/* 77 */                        z = false;
                            }
                        } else {
/* 77 */                    z = false;
                        }
/* 78 */                if (!z && this.f1637a0.mo832o()) {
/* 119 */                   z = focusFinder.findNextFocus(this, view, (this.f1637a0.m989N() == 1) ^ (i == 2) ? 66 : 17) == null;
                        }
/* 120 */               if (z) {
/* 122 */                   m887m();
/* 129 */                   if (m851B(view) != null) {
/* 132 */                       m879f0();
/* 137 */                       this.f1637a0.mo771a0(view, i, c0134l, y12Var);
/* 140 */                       m881g0(false);
                            }
/* 47 */                    return null;
                        }
/* 143 */               viewMo771a0 = focusFinder.findNextFocus(this, view, i);
/* 180 */               if (viewMo771a0 == null) {
                        }
/* 203 */               if (viewMo771a0 != null) {
/* 219 */                   if (view != null) {
/* 231 */                       int width = view.getWidth();
/* 235 */                       int height = view.getHeight();
/* 239 */                       Rect rect = this.f1676w;
/* 241 */                       rect.set(0, 0, width, height);
/* 244 */                       int width2 = viewMo771a0.getWidth();
/* 248 */                       int height2 = viewMo771a0.getHeight();
/* 252 */                       Rect rect2 = this.f1627U;
/* 254 */                       rect2.set(0, 0, width2, height2);
/* 257 */                       offsetDescendantRectToMyCoords(view, rect);
/* 260 */                       offsetDescendantRectToMyCoords(viewMo771a0, rect2);
/* 269 */                       if (this.f1637a0.m989N() == 1) {
/* 271 */                           i2 = -1;
                                } else {
/* 273 */                           i2 = 1;
                                }
/* 274 */                       i3 = rect.left;
/* 276 */                       i4 = rect2.left;
/* 290 */                       int i7 = i3 < i4 ? 1 : 1;
/* 305 */                       i5 = rect.top;
/* 307 */                       i6 = rect2.top;
/* 321 */                       b = i5 < i6 ? (byte) 1 : (byte) 1;
/* 339 */                       if (i != 1) {
/* 341 */                           if (i != 2) {
/* 343 */                               if (i != 17) {
/* 345 */                                   if (i != 33) {
/* 349 */                                       if (i != 66) {
/* 353 */                                           if (i == 130) {
/* 384 */                                               throw new IllegalArgumentException("Invalid direction: " + i + m900z());
                                                    }
                                                }
                                            }
                                        }
                                    } else if (b <= 0) {
/* 396 */                               if (b == 0) {
                                        }
                                    }
                                } else if (b >= 0) {
/* 404 */                           if (b == 0) {
                                    }
                                }
                            }
/* 409 */                   return viewMo771a0;
                        }
/* 410 */               return super.focusSearch(view, i);
                    }
/* 148 */           View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
/* 152 */           if (viewFindNextFocus == null && z2) {
/* 156 */               m887m();
/* 163 */               if (m851B(view) != null) {
/* 166 */                   m879f0();
/* 171 */                   viewMo771a0 = this.f1637a0.mo771a0(view, i, c0134l, y12Var);
/* 175 */                   m881g0(false);
                        }
/* 47 */                return null;
                    }
/* 179 */           viewMo771a0 = viewFindNextFocus;
/* 180 */           if (viewMo771a0 == null && !viewMo771a0.hasFocusable()) {
/* 192 */               if (getFocusedChild() == null) {
/* 194 */                   return super.focusSearch(view, i);
                        }
/* 199 */               m871Y(viewMo771a0, null);
/* 3 */                 return view;
                    }
/* 203 */           if (viewMo771a0 != null && viewMo771a0 != this && viewMo771a0 != view && m851B(viewMo771a0) != null) {
/* 219 */               if (view != null && m851B(view) != null) {
/* 231 */                   int width3 = view.getWidth();
/* 235 */                   int height3 = view.getHeight();
/* 239 */                   Rect rect3 = this.f1676w;
/* 241 */                   rect3.set(0, 0, width3, height3);
/* 244 */                   int width4 = viewMo771a0.getWidth();
/* 248 */                   int height4 = viewMo771a0.getHeight();
/* 252 */                   Rect rect4 = this.f1627U;
/* 254 */                   rect4.set(0, 0, width4, height4);
/* 257 */                   offsetDescendantRectToMyCoords(view, rect3);
/* 260 */                   offsetDescendantRectToMyCoords(viewMo771a0, rect4);
/* 269 */                   if (this.f1637a0.m989N() == 1) {
/* 271 */                       i2 = -1;
                            } else {
/* 273 */                       i2 = 1;
                            }
/* 274 */                   i3 = rect3.left;
/* 276 */                   i4 = rect4.left;
/* 290 */                   if ((i3 < i4 && rect3.right > i4) || rect3.right >= rect4.right) {
/* 292 */                       int i8 = rect3.right;
/* 294 */                       int i9 = rect4.right;
/* 304 */                       i7 = ((i8 > i9 || i3 >= i9) && i3 > i4) ? -1 : 0;
                            }
/* 305 */                   i5 = rect3.top;
/* 307 */                   i6 = rect4.top;
/* 321 */                   if ((i5 < i6 && rect3.bottom > i6) || rect3.bottom >= rect4.bottom) {
/* 324 */                       int i10 = rect3.bottom;
/* 326 */                       int i11 = rect4.bottom;
/* 337 */                       b = ((i10 > i11 || i5 >= i11) && i5 > i6) ? (byte) -1 : (byte) 0;
                            }
/* 339 */                   if (i != 1) {
/* 341 */                       if (i != 2) {
/* 343 */                           if (i != 17) {
/* 345 */                               if (i != 33) {
/* 349 */                                   if (i != 66) {
/* 353 */                                       if (i == 130) {
/* 384 */                                           throw new IllegalArgumentException("Invalid direction: " + i + m900z());
                                                }
                                            }
                                        }
                                    }
                                } else if (b <= 0) {
/* 396 */                           if (b == 0) {
                                    }
                                }
                            } else if (b >= 0) {
/* 404 */                       if (b == 0) {
                                }
                            }
                        }
/* 409 */               return viewMo771a0;
                    }
/* 410 */           return super.focusSearch(view, i);
                }

                /* JADX INFO: renamed from: g */
                public final void m880g(AbstractC0130h abstractC0130h) {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k != null) {
/* 7 */                 abstractC0133k.mo829m("Cannot add item decoration during a scroll  or layout");
                    }
/* 10 */            ArrayList arrayList = this.f1643c0;
/* 16 */            if (arrayList.isEmpty()) {
/* 19 */                setWillNotDraw(false);
                    }
/* 22 */            arrayList.add(abstractC0130h);
/* 25 */            m862P();
/* 28 */            requestLayout();
                }

                /* JADX INFO: renamed from: g0 */
                public final void m881g0(boolean z) {
/* 4 */             if (this.f1659i0 < 1) {
/* 6 */                 this.f1659i0 = 1;
                    }
/* 9 */             if (!z && !this.f1663k0) {
/* 15 */                this.f1661j0 = false;
                    }
/* 19 */            if (this.f1659i0 == 1) {
/* 21 */                if (z && this.f1661j0 && !this.f1663k0 && this.f1637a0 != null && this.f1631W != null) {
/* 39 */                    m890p();
                        }
/* 44 */                if (!this.f1663k0) {
/* 46 */                    this.f1661j0 = false;
                        }
                    }
/* 51 */            this.f1659i0--;
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k != null) {
/* 5 */                 return abstractC0133k.mo762C();
                    }
/* 20 */            f42.m3656l("RecyclerView has no LayoutManager".concat(m900z()));
/* 23 */            return null;
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k != null) {
/* 9 */                 return abstractC0133k.mo764D(getContext(), attributeSet);
                    }
/* 24 */            f42.m3656l("RecyclerView has no LayoutManager".concat(m900z()));
/* 27 */            return null;
                }

                @Override // android.view.ViewGroup, android.view.View
                public CharSequence getAccessibilityClassName() {
/* 1 */             return "androidx.recyclerview.widget.RecyclerView";
                }

                public AbstractC0129g getAdapter() {
/* 1 */             return this.f1631W;
                }

                @Override // android.view.View
                public int getBaseline() {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k == null) {
/* 10 */                return super.getBaseline();
                    }
/* 5 */             abstractC0133k.getClass();
/* 8 */             return -1;
                }

                @Override // android.view.ViewGroup
                public final int getChildDrawingOrder(int i, int i2) {
/* 1 */             return super.getChildDrawingOrder(i, i2);
                }

                @Override // android.view.ViewGroup
                public boolean getClipToPadding() {
/* 1 */             return this.f1658i;
                }

                public c22 getCompatAccessibilityDelegate() {
/* 1 */             return this.f1634Y0;
                }

                public l12 getEdgeEffectFactory() {
/* 1 */             return this.f1673u0;
                }

                public n12 getItemAnimator() {
/* 1 */             return this.f1680z0;
                }

                public int getItemDecorationCount() {
/* 3 */             return this.f1643c0.size();
                }

                public AbstractC0133k getLayoutManager() {
/* 1 */             return this.f1637a0;
                }

                public int getMaxFlingVelocity() {
/* 1 */             return this.f1617K0;
                }

                public int getMinFlingVelocity() {
/* 1 */             return this.f1616J0;
                }

                public long getNanoTime() {
/* 1 */             return System.nanoTime();
                }

                public q12 getOnFlingListener() {
/* 1 */             return this.f1615I0;
                }

                public boolean getPreserveFocusAfterLayout() {
/* 1 */             return this.f1620N0;
                }

                public t12 getRecycledViewPool() {
/* 3 */             return this.f1639b.m1006c();
                }

                public int getScrollState() {
/* 1 */             return this.f1607A0;
                }

                /* JADX INFO: renamed from: h */
                public final void m882h(r12 r12Var) {
/* 3 */             if (this.f1626T0 == null) {
/* 10 */                this.f1626T0 = new ArrayList();
                    }
/* 14 */            this.f1626T0.add(r12Var);
                }

                /* JADX INFO: renamed from: h0 */
                public final void m883h0(int i) {
/* 5 */             getScrollingChildHelper().m7215h(i);
                }

                @Override // android.view.View
                public final boolean hasNestedScrollingParent() {
/* 6 */             return getScrollingChildHelper().m7213f(0);
                }

                /* JADX INFO: renamed from: i */
                public final void m884i(String str) {
/* 5 */             if (!m860N()) {
/* 29 */                if (this.f1672t0 > 0) {
/* 44 */                    AbstractC1245n0.m4891s("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(m900z()));
                        }
                    } else if (str == null) {
/* 19 */                f42.m3656l("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(m900z()));
                    } else {
/* 23 */                f42.m3656l(str);
                    }
                }

                @Override // android.view.View
                public final boolean isAttachedToWindow() {
/* 1 */             return this.f1652f0;
                }

                @Override // android.view.ViewGroup
                public final boolean isLayoutSuppressed() {
/* 1 */             return this.f1663k0;
                }

                @Override // android.view.View
                public final boolean isNestedScrollingEnabled() {
/* 5 */             return getScrollingChildHelper().f14823d;
                }

                /* JADX INFO: renamed from: k */
                public final void m885k() {
/* 1 */             C0875ec c0875ec = this.f1648e;
/* 3 */             int iM3363A = c0875ec.m3363A();
/* 10 */            for (int i = 0; i < iM3363A; i++) {
/* 16 */                AbstractC0137o abstractC0137oM843J = m843J(c0875ec.m3399z(i));
/* 24 */                if (!abstractC0137oM843J.m1031o()) {
/* 26 */                    abstractC0137oM843J.f1781d = -1;
/* 28 */                    abstractC0137oM843J.f1784g = -1;
                        }
                    }
/* 33 */            C0134l c0134l = this.f1639b;
/* 35 */            ArrayList arrayList = c0134l.f1768a;
/* 37 */            ArrayList arrayList2 = c0134l.f1770c;
/* 39 */            int size = arrayList2.size();
/* 44 */            for (int i2 = 0; i2 < size; i2++) {
/* 50 */                AbstractC0137o abstractC0137o = (AbstractC0137o) arrayList2.get(i2);
/* 52 */                abstractC0137o.f1781d = -1;
/* 54 */                abstractC0137o.f1784g = -1;
                    }
/* 59 */            int size2 = arrayList.size();
/* 64 */            for (int i3 = 0; i3 < size2; i3++) {
/* 70 */                AbstractC0137o abstractC0137o2 = (AbstractC0137o) arrayList.get(i3);
/* 72 */                abstractC0137o2.f1781d = -1;
/* 74 */                abstractC0137o2.f1784g = -1;
                    }
/* 79 */            ArrayList arrayList3 = c0134l.f1769b;
/* 81 */            if (arrayList3 != null) {
/* 83 */                int size3 = arrayList3.size();
/* 87 */                for (int i4 = 0; i4 < size3; i4++) {
/* 95 */                    AbstractC0137o abstractC0137o3 = (AbstractC0137o) c0134l.f1769b.get(i4);
/* 97 */                    abstractC0137o3.f1781d = -1;
/* 99 */                    abstractC0137o3.f1784g = -1;
                        }
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m886l(int i, int i2) {
                    boolean zIsFinished;
/* 1 */             EdgeEffect edgeEffect = this.f1675v0;
/* 3 */             if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
/* 25 */                zIsFinished = false;
                    } else {
/* 15 */                this.f1675v0.onRelease();
/* 20 */                zIsFinished = this.f1675v0.isFinished();
                    }
/* 26 */            EdgeEffect edgeEffect2 = this.f1678x0;
/* 28 */            if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
/* 40 */                this.f1678x0.onRelease();
/* 49 */                zIsFinished |= this.f1678x0.isFinished();
                    }
/* 50 */            EdgeEffect edgeEffect3 = this.f1677w0;
/* 52 */            if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
/* 64 */                this.f1677w0.onRelease();
/* 73 */                zIsFinished |= this.f1677w0.isFinished();
                    }
/* 74 */            EdgeEffect edgeEffect4 = this.f1679y0;
/* 76 */            if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
/* 88 */                this.f1679y0.onRelease();
/* 97 */                zIsFinished |= this.f1679y0.isFinished();
                    }
/* 98 */            if (zIsFinished) {
/* 100 */               WeakHashMap weakHashMap = e33.f7494a;
/* 102 */               postInvalidateOnAnimation();
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m887m() {
/* 5 */             if (!this.f1656h0 || this.f1669q0) {
/* 124 */               int i = oq2.f14866a;
/* 126 */               Trace.beginSection("RV FullInvalidate");
/* 129 */               m890p();
/* 132 */               Trace.endSection();
/* 135 */               return;
                    }
/* 13 */            C2093q3 c2093q3 = this.f1645d;
/* 19 */            if (c2093q3.m7687h()) {
/* 22 */                int i2 = c2093q3.f15369a;
/* 26 */                if ((i2 & 4) == 0 || (i2 & 11) != 0) {
/* 110 */                   if (c2093q3.m7687h()) {
/* 112 */                       int i3 = oq2.f14866a;
/* 114 */                       Trace.beginSection("RV FullInvalidate");
/* 117 */                       m890p();
/* 120 */                       Trace.endSection();
/* 123 */                       return;
                            }
/* 123 */                   return;
                        }
/* 33 */                int i4 = oq2.f14866a;
/* 37 */                Trace.beginSection("RV PartialInvalidate");
/* 40 */                m879f0();
/* 43 */                m864R();
/* 46 */                c2093q3.m7690k();
/* 51 */                if (!this.f1661j0) {
/* 53 */                    C0875ec c0875ec = this.f1648e;
/* 55 */                    int iM3396u = c0875ec.m3396u();
/* 60 */                    for (int i5 = 0; i5 < iM3396u; i5++) {
/* 66 */                        AbstractC0137o abstractC0137oM843J = m843J(c0875ec.m3395t(i5));
/* 70 */                        if (abstractC0137oM843J != null && !abstractC0137oM843J.m1031o() && abstractC0137oM843J.m1027k()) {
/* 85 */                            m890p();
                                }
                            }
/* 92 */                    c2093q3.m7682b();
                        }
/* 96 */                m881g0(true);
/* 99 */                m865S(true);
/* 102 */               Trace.endSection();
                    }
                }

                /* JADX INFO: renamed from: n */
                public final void m888n(int i, int i2) {
/* 9 */             int paddingRight = getPaddingRight() + getPaddingLeft();
/* 10 */            WeakHashMap weakHashMap = e33.f7494a;
/* 37 */            setMeasuredDimension(AbstractC0133k.m978r(i, paddingRight, getMinimumWidth()), AbstractC0133k.m978r(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
                }

                /* JADX INFO: renamed from: o */
                public final void m889o(View view) {
/* 1 */             m843J(view);
/* 4 */             ArrayList arrayList = this.f1668p0;
/* 6 */             if (arrayList != null) {
/* 14 */                for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 24 */                    ((p12) this.f1668p0.get(size)).getClass();
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:19:0x005d  */
                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
                    float refreshRate;
/* 1 */             super.onAttachedToWindow();
/* 5 */             this.f1671s0 = 0;
/* 8 */             this.f1652f0 = true;
/* 23 */            this.f1656h0 = this.f1656h0 && !isLayoutRequested();
/* 25 */            AbstractC0133k abstractC0133k = this.f1637a0;
/* 27 */            if (abstractC0133k != null) {
/* 29 */                abstractC0133k.f1765i = true;
/* 31 */                abstractC0133k.mo991Y(this);
                    }
/* 34 */            this.f1633X0 = false;
/* 36 */            ThreadLocal threadLocal = hq0.f9191e;
/* 42 */            hq0 hq0Var = (hq0) threadLocal.get();
/* 44 */            this.f1622P0 = hq0Var;
/* 46 */            if (hq0Var == null) {
/* 50 */                hq0 hq0Var2 = new hq0();
/* 58 */                hq0Var2.f9193a = new ArrayList();
/* 65 */                hq0Var2.f9196d = new ArrayList();
/* 67 */                this.f1622P0 = hq0Var2;
/* 69 */                WeakHashMap weakHashMap = e33.f7494a;
/* 71 */                Display display = getDisplay();
/* 79 */                if (isInEditMode() || display == null) {
/* 94 */                    refreshRate = 60.0f;
                        } else {
/* 83 */                    refreshRate = display.getRefreshRate();
/* 91 */                    if (refreshRate < 30.0f) {
/* 94 */                        refreshRate = 60.0f;
                            }
                        }
/* 96 */                hq0 hq0Var3 = this.f1622P0;
/* 103 */               hq0Var3.f9195c = (long) (1.0E9f / refreshRate);
/* 105 */               threadLocal.set(hq0Var3);
                    }
/* 112 */           this.f1622P0.f9193a.add(this);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
                    C0126d c0126d;
/* 1 */             super.onDetachedFromWindow();
/* 4 */             n12 n12Var = this.f1680z0;
/* 6 */             if (n12Var != null) {
/* 8 */                 n12Var.mo5715e();
                    }
/* 12 */            setScrollState(0);
/* 15 */            a22 a22Var = this.f1621O0;
/* 19 */            a22Var.f55i.removeCallbacks(a22Var);
/* 24 */            a22Var.f51c.abortAnimation();
/* 27 */            AbstractC0133k abstractC0133k = this.f1637a0;
/* 29 */            if (abstractC0133k != null && (c0126d = abstractC0133k.f1763e) != null) {
/* 35 */                c0126d.m9682d();
                    }
/* 38 */            this.f1652f0 = false;
/* 40 */            AbstractC0133k abstractC0133k2 = this.f1637a0;
/* 42 */            if (abstractC0133k2 != null) {
/* 44 */                abstractC0133k2.f1765i = false;
/* 46 */                abstractC0133k2.mo816Z(this);
                    }
/* 51 */            this.f1650e1.clear();
/* 56 */            removeCallbacks(this.f1653f1);
/* 61 */            this.f1651f.getClass();
/* 70 */            while (p33.f14956d.mo7042a() != null) {
                    }
/* 73 */            hq0 hq0Var = this.f1622P0;
/* 75 */            if (hq0Var != null) {
/* 79 */                hq0Var.f9193a.remove(this);
/* 83 */                this.f1622P0 = null;
                    }
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
/* 1 */             super.onDraw(canvas);
/* 4 */             ArrayList arrayList = this.f1643c0;
/* 6 */             int size = arrayList.size();
/* 11 */            for (int i = 0; i < size; i++) {
/* 19 */                ((AbstractC0130h) arrayList.get(i)).mo963b(canvas, this);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:28:0x0064  */
                @Override // android.view.View
                public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
                    float f;
                    float axisValue;
/* 4 */             if (this.f1637a0 != null && !this.f1663k0 && motionEvent.getAction() == 8) {
/* 29 */                if ((motionEvent.getSource() & 2) != 0) {
/* 47 */                    f = this.f1637a0.mo835p() ? -motionEvent.getAxisValue(9) : 0.0f;
/* 63 */                    axisValue = this.f1637a0.mo832o() ? motionEvent.getAxisValue(10) : 0.0f;
                        } else if ((motionEvent.getSource() & 4194304) != 0) {
/* 76 */                    float axisValue2 = motionEvent.getAxisValue(26);
/* 86 */                    if (this.f1637a0.mo835p()) {
/* 88 */                        f = -axisValue2;
                            } else if (this.f1637a0.mo832o()) {
/* 98 */                        axisValue = axisValue2;
/* 99 */                        f = 0.0f;
                            } else {
/* 101 */                       f = 0.0f;
/* 102 */                       axisValue = 0.0f;
                            }
                        } else {
/* 101 */                   f = 0.0f;
/* 102 */                   axisValue = 0.0f;
                        }
/* 105 */               if (f != 0.0f || axisValue != 0.0f) {
/* 114 */                   int i = (int) (axisValue * this.f1618L0);
/* 118 */                   int i2 = (int) (f * this.f1619M0);
/* 119 */                   AbstractC0133k abstractC0133k = this.f1637a0;
/* 121 */                   if (abstractC0133k == null) {
/* 127 */                       AbstractC1245n0.m4876d("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
/* 3 */                         return false;
                            }
/* 133 */                   if (!this.f1663k0) {
/* 136 */                       int[] iArr = this.f1647d1;
/* 138 */                       iArr[0] = 0;
/* 141 */                       iArr[1] = 0;
/* 143 */                       boolean zMo832o = abstractC0133k.mo832o();
/* 149 */                       boolean zMo835p = this.f1637a0.mo835p();
/* 164 */                       getScrollingChildHelper().m7214g(zMo835p ? (zMo832o ? 1 : 0) | 2 : zMo832o ? 1 : 0, 1);
/* 186 */                       if (m893s(zMo832o ? i : 0, zMo835p ? i2 : 0, this.f1647d1, this.f1641b1, 1)) {
/* 190 */                           i -= iArr[0];
/* 193 */                           i2 -= iArr[1];
                                }
/* 204 */                       m873a0(zMo832o ? i : 0, zMo835p ? i2 : 0, motionEvent, 1);
/* 207 */                       hq0 hq0Var = this.f1622P0;
/* 209 */                       if (hq0Var != null && (i != 0 || i2 != 0)) {
/* 215 */                           hq0Var.m4263a(this, i, i2);
                                }
/* 218 */                       m883h0(1);
                            }
                        }
                    }
/* 3 */             return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.ViewGroup
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    boolean z;
/* 4 */             if (!this.f1663k0) {
/* 9 */                 this.f1649e0 = null;
/* 16 */                if (m852C(motionEvent)) {
/* 18 */                    m872Z();
/* 21 */                    setScrollState(0);
/* 15 */                    return true;
                        }
/* 25 */                AbstractC0133k abstractC0133k = this.f1637a0;
/* 27 */                if (abstractC0133k != null) {
/* 31 */                    boolean zMo832o = abstractC0133k.mo832o();
/* 37 */                    boolean zMo835p = this.f1637a0.mo835p();
/* 43 */                    if (this.f1609C0 == null) {
/* 49 */                        this.f1609C0 = VelocityTracker.obtain();
                            }
/* 53 */                    this.f1609C0.addMovement(motionEvent);
/* 56 */                    int actionMasked = motionEvent.getActionMasked();
/* 60 */                    int actionIndex = motionEvent.getActionIndex();
/* 67 */                    if (actionMasked == 0) {
/* 229 */                       if (this.f1664l0) {
/* 231 */                           this.f1664l0 = false;
                                }
/* 237 */                       this.f1608B0 = motionEvent.getPointerId(0);
/* 244 */                       int x = (int) (motionEvent.getX() + 0.5f);
/* 245 */                       this.f1612F0 = x;
/* 247 */                       this.f1610D0 = x;
/* 254 */                       int y = (int) (motionEvent.getY() + 0.5f);
/* 255 */                       this.f1613G0 = y;
/* 257 */                       this.f1611E0 = y;
/* 261 */                       if (this.f1607A0 == 2) {
/* 267 */                           getParent().requestDisallowInterceptTouchEvent(true);
/* 270 */                           setScrollState(1);
/* 273 */                           m883h0(1);
                                }
/* 276 */                       int[] iArr = this.f1644c1;
/* 278 */                       iArr[1] = 0;
/* 280 */                       iArr[0] = 0;
                                int i = zMo832o;
/* 282 */                       if (zMo835p) {
/* 284 */                           i = (zMo832o ? 1 : 0) | 2;
                                }
/* 290 */                       getScrollingChildHelper().m7214g(i, 0);
                            } else if (actionMasked == 1) {
/* 220 */                       this.f1609C0.clear();
/* 223 */                       m883h0(0);
                            } else if (actionMasked == 2) {
/* 127 */                       int iFindPointerIndex = motionEvent.findPointerIndex(this.f1608B0);
/* 131 */                       if (iFindPointerIndex < 0) {
/* 156 */                           AbstractC1245n0.m4876d("RecyclerView", "Error processing scroll; pointer index for id " + this.f1608B0 + " not found. Did any MotionEvents get skipped?");
/* 3 */                             return false;
                                }
/* 165 */                       int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
/* 171 */                       int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
/* 174 */                       if (this.f1607A0 != 1) {
/* 178 */                           int i2 = x2 - this.f1610D0;
/* 182 */                           int i3 = y2 - this.f1611E0;
/* 184 */                           if (!zMo832o || Math.abs(i2) <= this.f1614H0) {
/* 198 */                               z = false;
                                    } else {
/* 194 */                               this.f1612F0 = x2;
/* 196 */                               z = true;
                                    }
/* 199 */                           if (zMo835p && Math.abs(i3) > this.f1614H0) {
/* 209 */                               this.f1613G0 = y2;
/* 211 */                               z = true;
                                    }
/* 212 */                           if (z) {
/* 214 */                               setScrollState(1);
                                    }
                                }
                            } else if (actionMasked == 3) {
/* 117 */                       m872Z();
/* 120 */                       setScrollState(0);
                            } else if (actionMasked == 5) {
/* 93 */                        this.f1608B0 = motionEvent.getPointerId(actionIndex);
/* 100 */                       int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
/* 101 */                       this.f1612F0 = x3;
/* 103 */                       this.f1610D0 = x3;
/* 110 */                       int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
/* 111 */                       this.f1613G0 = y3;
/* 113 */                       this.f1611E0 = y3;
                            } else if (actionMasked == 6) {
/* 84 */                        m866T(motionEvent);
                            }
/* 295 */                   if (this.f1607A0 == 1) {
/* 15 */                        return true;
                            }
                        }
                    }
/* 3 */             return false;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             int i5 = oq2.f14866a;
/* 5 */             Trace.beginSection("RV OnLayout");
/* 8 */             m890p();
/* 11 */            Trace.endSection();
/* 15 */            this.f1656h0 = true;
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k == null) {
/* 5 */                 m888n(i, i2);
/* 8 */                 return;
                    }
/* 9 */             boolean zMo808S = abstractC0133k.mo808S();
/* 14 */            boolean z = false;
/* 15 */            y12 y12Var = this.f1624R0;
/* 17 */            if (zMo808S) {
/* 19 */                int mode = View.MeasureSpec.getMode(i);
/* 23 */                int mode2 = View.MeasureSpec.getMode(i2);
/* 31 */                this.f1637a0.f1760b.m888n(i, i2);
/* 36 */                if (mode == 1073741824 && mode2 == 1073741824) {
/* 40 */                    z = true;
                        }
/* 41 */                this.f1655g1 = z;
/* 43 */                if (z || this.f1631W == null) {
/* 123 */                   return;
                        }
/* 52 */                if (y12Var.f19440d == 1) {
/* 54 */                    m891q();
                        }
/* 59 */                this.f1637a0.m981B0(i, i2);
/* 62 */                y12Var.f19445i = true;
/* 64 */                m892r();
/* 69 */                this.f1637a0.m982D0(i, i2);
/* 78 */                if (this.f1637a0.mo800G0()) {
/* 98 */                    this.f1637a0.m981B0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
/* 101 */                   y12Var.f19445i = true;
/* 103 */                   m892r();
/* 108 */                   this.f1637a0.m982D0(i, i2);
                        }
/* 115 */               this.f1657h1 = getMeasuredWidth();
/* 121 */               this.f1660i1 = getMeasuredHeight();
/* 123 */               return;
                    }
/* 126 */           if (this.f1654g0) {
/* 132 */               this.f1637a0.f1760b.m888n(i, i2);
/* 135 */               return;
                    }
/* 138 */           if (this.f1666n0) {
/* 140 */               m879f0();
/* 143 */               m864R();
/* 146 */               m868V();
/* 149 */               m865S(true);
/* 154 */               if (y12Var.f19447k) {
/* 156 */                   y12Var.f19443g = true;
                        } else {
/* 161 */                   this.f1645d.m7683c();
/* 164 */                   y12Var.f19443g = false;
                        }
/* 166 */               this.f1666n0 = false;
/* 168 */               m881g0(false);
                    } else if (y12Var.f19447k) {
/* 184 */               setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
/* 187 */               return;
                    }
/* 188 */           AbstractC0129g abstractC0129g = this.f1631W;
/* 190 */           if (abstractC0129g != null) {
/* 196 */               y12Var.f19441e = abstractC0129g.mo955a();
                    } else {
/* 199 */               y12Var.f19441e = 0;
                    }
/* 201 */           m879f0();
/* 208 */           this.f1637a0.f1760b.m888n(i, i2);
/* 211 */           m881g0(false);
/* 214 */           y12Var.f19443g = false;
                }

                @Override // android.view.ViewGroup
                public final boolean onRequestFocusInDescendants(int i, Rect rect) {
/* 5 */             if (m860N()) {
/* 7 */                 return false;
                    }
/* 9 */             return super.onRequestFocusInDescendants(i, rect);
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 11 */            this.f1642c = savedState;
/* 15 */            super.onRestoreInstanceState(savedState.f1292a);
/* 18 */            requestLayout();
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 10 */            SavedState savedState2 = this.f1642c;
/* 12 */            if (savedState2 != null) {
/* 16 */                savedState.f1685c = savedState2.f1685c;
/* 18 */                return savedState;
                    }
/* 19 */            AbstractC0133k abstractC0133k = this.f1637a0;
/* 21 */            if (abstractC0133k != null) {
/* 27 */                savedState.f1685c = abstractC0133k.mo833o0();
/* 29 */                return savedState;
                    }
/* 31 */            savedState.f1685c = null;
/* 33 */            return savedState;
                }

                @Override // android.view.View
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onSizeChanged(i, i2, i3, i4);
/* 4 */             if (i == i3 && i2 == i4) {
/* 9 */                 return;
                    }
/* 11 */            this.f1679y0 = null;
/* 13 */            this.f1677w0 = null;
/* 15 */            this.f1678x0 = null;
/* 17 */            this.f1675v0 = null;
                }

                /* JADX WARN: Code duplicated, block: B:200:0x035b  */
                /* JADX WARN: Code duplicated, block: B:269:0x042e  */
                /* JADX WARN: Code duplicated, block: B:271:0x0432 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:272:0x0434  */
                /* JADX WARN: Code duplicated, block: B:275:0x0463  */
                /* JADX WARN: Code duplicated, block: B:97:0x01f6 A[PHI: r1
  0x01f6: PHI (r1v52 int) = (r1v37 int), (r1v56 int) binds: [B:90:0x01e1, B:95:0x01f2] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
                /* JADX WARN: Type inference failed for: r9v26 */
                @Override // android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    boolean zM852C;
                    int i;
                    int i2;
                    a22 a22Var;
                    RecyclerView recyclerView;
                    Interpolator interpolator;
                    g12 g12Var;
                    int minFlingVelocity;
                    boolean z;
                    pc0 pc0VarM1418f;
                    int iM974O;
                    PointF pointFMo817a;
                    int i3;
                    int i4;
                    boolean z2;
/* 8 */             if (!this.f1663k0 && !this.f1664l0) {
/* 17 */                ah0 ah0Var = this.f1649e0;
/* 24 */                if (ah0Var == null) {
/* 35 */                    zM852C = motionEvent.getAction() == 0 ? false : m852C(motionEvent);
                        } else {
/* 41 */                    int i5 = ah0Var.f261b;
/* 45 */                    if (ah0Var.f281v != 0) {
/* 53 */                        if (motionEvent.getAction() == 0) {
/* 63 */                            boolean zM283e = ah0Var.m283e(motionEvent.getX(), motionEvent.getY());
/* 75 */                            boolean zM282d = ah0Var.m282d(motionEvent.getX(), motionEvent.getY());
/* 79 */                            if (zM283e || zM282d) {
/* 83 */                                if (zM282d) {
/* 85 */                                    ah0Var.f282w = 1;
/* 93 */                                    ah0Var.f275p = (int) motionEvent.getX();
                                        } else if (zM283e) {
/* 98 */                                    ah0Var.f282w = 2;
/* 106 */                                   ah0Var.f272m = (int) motionEvent.getY();
                                        }
/* 108 */                               ah0Var.m284g(2);
                                    }
                                } else if (motionEvent.getAction() == 1 && ah0Var.f281v == 2) {
/* 123 */                           ah0Var.f272m = 0.0f;
/* 125 */                           ah0Var.f275p = 0.0f;
/* 127 */                           ah0Var.m284g(1);
/* 130 */                           ah0Var.f282w = 0;
                                } else if (motionEvent.getAction() == 2 && ah0Var.f281v == 2) {
/* 144 */                           ah0Var.m285h();
/* 151 */                           if (ah0Var.f282w == 1) {
/* 153 */                               float x = motionEvent.getX();
/* 157 */                               int[] iArr = ah0Var.f284y;
/* 159 */                               iArr[0] = i5;
/* 163 */                               int i6 = ah0Var.f276q - i5;
/* 164 */                               iArr[1] = i6;
/* 172 */                               float fMax = Math.max(i5, Math.min(i6, x));
/* 186 */                               if (Math.abs(ah0Var.f274o - fMax) >= 2.0f) {
/* 207 */                                   int iM280f = ah0.m280f(ah0Var.f275p, fMax, iArr, ah0Var.f278s.computeHorizontalScrollRange(), ah0Var.f278s.computeHorizontalScrollOffset(), ah0Var.f276q);
/* 211 */                                   if (iM280f != 0) {
/* 215 */                                       ah0Var.f278s.scrollBy(iM280f, 0);
                                            }
/* 218 */                                   ah0Var.f275p = fMax;
                                        }
                                    }
/* 222 */                           if (ah0Var.f282w == 2) {
/* 224 */                               float y = motionEvent.getY();
/* 228 */                               int[] iArr2 = ah0Var.f283x;
/* 230 */                               iArr2[0] = i5;
/* 234 */                               int i7 = ah0Var.f277r - i5;
/* 235 */                               iArr2[1] = i7;
/* 243 */                               float fMax2 = Math.max(i5, Math.min(i7, y));
/* 257 */                               if (Math.abs(ah0Var.f271l - fMax2) >= 2.0f) {
/* 278 */                                   int iM280f2 = ah0.m280f(ah0Var.f272m, fMax2, iArr2, ah0Var.f278s.computeVerticalScrollRange(), ah0Var.f278s.computeVerticalScrollOffset(), ah0Var.f277r);
/* 282 */                                   if (iM280f2 != 0) {
/* 286 */                                       ah0Var.f278s.scrollBy(0, iM280f2);
                                            }
/* 289 */                                   ah0Var.f272m = fMax2;
                                        }
                                    }
                                }
                            }
/* 291 */                   int action = motionEvent.getAction();
/* 295 */                   if (action == 3 || action == 1) {
/* 299 */                       this.f1649e0 = null;
                            }
/* 301 */                   zM852C = true;
                        }
/* 302 */               if (zM852C) {
/* 304 */                   m872Z();
/* 307 */                   setScrollState(0);
/* 23 */                    return true;
                        }
/* 311 */               AbstractC0133k abstractC0133k = this.f1637a0;
/* 313 */               if (abstractC0133k != null) {
/* 317 */                   boolean zMo832o = abstractC0133k.mo832o();
/* 323 */                   boolean zMo835p = this.f1637a0.mo835p();
/* 329 */                   if (this.f1609C0 == null) {
/* 335 */                       this.f1609C0 = VelocityTracker.obtain();
                            }
/* 337 */                   int actionMasked = motionEvent.getActionMasked();
/* 341 */                   int actionIndex = motionEvent.getActionIndex();
/* 345 */                   int[] iArr3 = this.f1644c1;
/* 347 */                   if (actionMasked == 0) {
/* 349 */                       iArr3[1] = 0;
/* 351 */                       iArr3[0] = 0;
                            }
/* 353 */                   MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
/* 363 */                   motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
/* 368 */                   if (actionMasked != 0) {
/* 372 */                       if (actionMasked == 1) {
/* 642 */                           this.f1609C0.addMovement(motionEventObtain);
/* 645 */                           VelocityTracker velocityTracker = this.f1609C0;
/* 649 */                           int i8 = this.f1617K0;
/* 652 */                           velocityTracker.computeCurrentVelocity(1000, i8);
/* 667 */                           float f = zMo832o ? -this.f1609C0.getXVelocity(this.f1608B0) : 0.0f;
/* 680 */                           float f2 = zMo835p ? -this.f1609C0.getYVelocity(this.f1608B0) : 0.0f;
/* 683 */                           if (f == 0.0f && f2 == 0.0f) {
/* 690 */                               i4 = 0;
                                    } else {
/* 693 */                               int i9 = (int) f;
/* 694 */                               int i10 = (int) f2;
/* 695 */                               AbstractC0133k abstractC0133k2 = this.f1637a0;
/* 697 */                               if (abstractC0133k2 == null) {
/* 701 */                                   AbstractC1245n0.m4876d("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                                        } else if (!this.f1663k0) {
/* 712 */                                   int iMo832o = abstractC0133k2.mo832o();
/* 718 */                                   boolean zMo835p2 = this.f1637a0.mo835p();
/* 722 */                                   int i11 = this.f1616J0;
/* 724 */                                   if (iMo832o == 0 || Math.abs(i9) < i11) {
/* 732 */                                       i9 = 0;
                                            }
/* 733 */                                   if (!zMo835p2 || Math.abs(i10) < i11) {
/* 741 */                                       i10 = 0;
                                            }
/* 742 */                                   if (i9 != 0 || i10 != 0) {
                                                float f3 = i9;
                                                float f4 = i10;
/* 754 */                                       if (!dispatchNestedPreFling(f3, f4)) {
/* 763 */                                           boolean z3 = iMo832o != 0 || zMo835p2;
/* 764 */                                           dispatchNestedFling(f3, f4, z3);
/* 767 */                                           q12 q12Var = this.f1615I0;
/* 769 */                                           if (q12Var != null) {
/* 771 */                                               br1 br1Var = (br1) q12Var;
/* 775 */                                               AbstractC0133k layoutManager = br1Var.f2578a.getLayoutManager();
/* 779 */                                               if (layoutManager == 0 || br1Var.f2578a.getAdapter() == null || ((Math.abs(i10) <= (minFlingVelocity = br1Var.f2578a.getMinFlingVelocity()) && Math.abs(i9) <= minFlingVelocity) || !((z = layoutManager instanceof w12)))) {
/* 1071 */                                                  i2 = 1;
/* 1073 */                                                  if (z3) {
/* 1075 */                                                      if (zMo835p2) {
/* 1077 */                                                          iMo832o = (iMo832o == true ? 1 : 0) | 2;
                                                                }
/* 1085 */                                                      getScrollingChildHelper().m7214g(iMo832o, i2);
/* 1088 */                                                      int i12 = -i8;
/* 1093 */                                                      int iMax = Math.max(i12, Math.min(i9, i8));
/* 1101 */                                                      int iMax2 = Math.max(i12, Math.min(i10, i8));
/* 1105 */                                                      a22Var = this.f1621O0;
/* 1107 */                                                      recyclerView = a22Var.f55i;
/* 1110 */                                                      recyclerView.setScrollState(2);
/* 1114 */                                                      a22Var.f50b = 0;
/* 1116 */                                                      a22Var.f49a = 0;
/* 1118 */                                                      interpolator = a22Var.f52d;
/* 1120 */                                                      g12Var = f1606m1;
/* 1122 */                                                      if (interpolator != g12Var) {
/* 1124 */                                                          a22Var.f52d = g12Var;
/* 1135 */                                                          a22Var.f51c = new OverScroller(recyclerView.getContext(), g12Var);
                                                                }
/* 1155 */                                                      a22Var.f51c.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, AbstractC0208c9.API_PRIORITY_OTHER, Integer.MIN_VALUE, AbstractC0208c9.API_PRIORITY_OTHER);
/* 1158 */                                                      a22Var.m40a();
                                                            }
                                                        } else {
/* 833 */                                                   ar1 ar1Var = !z ? null : new ar1(br1Var, br1Var.f2578a.getContext());
/* 836 */                                                   if (ar1Var == null) {
/* 1071 */                                                      i2 = 1;
                                                            } else {
/* 840 */                                                       RecyclerView recyclerView2 = layoutManager.f1760b;
/* 849 */                                                       AbstractC0129g adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
/* 857 */                                                       int iMo955a = adapter != null ? adapter.mo955a() : 0;
/* 858 */                                                       if (iMo955a != 0) {
/* 870 */                                                           if (layoutManager.mo835p()) {
/* 872 */                                                               pc0VarM1418f = br1Var.m1419g(layoutManager);
                                                                    } else {
/* 888 */                                                               pc0VarM1418f = layoutManager.mo832o() ? br1Var.m1418f(layoutManager) : null;
                                                                    }
/* 889 */                                                           if (pc0VarM1418f == null) {
/* 860 */                                                               i2 = 1;
                                                                    } else {
/* 892 */                                                               int iM986G = layoutManager.m986G();
/* 901 */                                                               i2 = 1;
/* 903 */                                                               int i13 = Integer.MIN_VALUE;
/* 905 */                                                               int i14 = 0;
/* 906 */                                                               View view = null;
/* 910 */                                                               int i15 = Integer.MAX_VALUE;
/* 912 */                                                               View view2 = null;
/* 914 */                                                               while (i14 < iM986G) {
/* 916 */                                                                   int i16 = iM986G;
/* 918 */                                                                   View viewM984F = layoutManager.m984F(i14);
/* 922 */                                                                   if (viewM984F == null) {
/* 924 */                                                                       i3 = i14;
                                                                            } else {
/* 927 */                                                                       i3 = i14;
/* 929 */                                                                       int iM1413c = br1.m1413c(viewM984F, pc0VarM1418f);
/* 933 */                                                                       if (iM1413c <= 0 && iM1413c > i13) {
/* 937 */                                                                           view = viewM984F;
/* 939 */                                                                           i13 = iM1413c;
                                                                                }
/* 940 */                                                                       if (iM1413c >= 0 && iM1413c < i15) {
/* 944 */                                                                           view2 = viewM984F;
/* 946 */                                                                           i15 = iM1413c;
                                                                                }
                                                                            }
/* 947 */                                                                   i14 = i3 + 1;
/* 949 */                                                                   iM986G = i16;
                                                                        }
/* 963 */                                                               boolean z4 = !layoutManager.mo832o() ? i10 <= 0 : i9 <= 0;
/* 968 */                                                               if (z4 && view2 != null) {
/* 972 */                                                                   iM974O = AbstractC0133k.m974O(view2);
                                                                        } else if (z4 || view == null) {
/* 986 */                                                                   if (z4) {
/* 988 */                                                                       view2 = view;
                                                                            }
/* 990 */                                                                   if (view2 != null) {
/* 994 */                                                                       int iM974O2 = AbstractC0133k.m974O(view2);
/* 998 */                                                                       RecyclerView recyclerView3 = layoutManager.f1760b;
/* 1009 */                                                                      AbstractC0129g adapter2 = recyclerView3 != null ? recyclerView3.getAdapter() : null;
/* 1055 */                                                                      iM974O = ((z && (pointFMo817a = ((w12) layoutManager).mo817a((adapter2 != null ? adapter2.mo955a() : 0) + (-1))) != null && ((pointFMo817a.x > r5 ? 1 : (pointFMo817a.x == r5 ? 0 : -1)) < 0 || (pointFMo817a.y > 0 ? 1 : (pointFMo817a.y == 0 ? 0 : -1)) < 0)) == z4 ? -1 : 1) + iM974O2;
/* 1056 */                                                                      if (iM974O < 0 || iM974O >= iMo955a) {
                                                                                }
                                                                            }
                                                                        } else {
/* 981 */                                                                   iM974O = AbstractC0133k.m974O(view);
                                                                        }
                                                                    }
/* 862 */                                                           iM974O = -1;
                                                                } else {
/* 860 */                                                           i2 = 1;
/* 862 */                                                           iM974O = -1;
                                                                }
/* 1062 */                                                      if (iM974O != -1) {
/* 1065 */                                                          ar1Var.f18902a = iM974O;
/* 1067 */                                                          layoutManager.m988J0(ar1Var);
                                                                }
                                                            }
/* 1073 */                                                  if (z3) {
/* 1075 */                                                      if (zMo835p2) {
/* 1077 */                                                          iMo832o = (iMo832o == true ? 1 : 0) | 2;
                                                                }
/* 1085 */                                                      getScrollingChildHelper().m7214g(iMo832o, i2);
/* 1088 */                                                      int i17 = -i8;
/* 1093 */                                                      int iMax3 = Math.max(i17, Math.min(i9, i8));
/* 1101 */                                                      int iMax4 = Math.max(i17, Math.min(i10, i8));
/* 1105 */                                                      a22Var = this.f1621O0;
/* 1107 */                                                      recyclerView = a22Var.f55i;
/* 1110 */                                                      recyclerView.setScrollState(2);
/* 1114 */                                                      a22Var.f50b = 0;
/* 1116 */                                                      a22Var.f49a = 0;
/* 1118 */                                                      interpolator = a22Var.f52d;
/* 1120 */                                                      g12Var = f1606m1;
/* 1122 */                                                      if (interpolator != g12Var) {
/* 1124 */                                                          a22Var.f52d = g12Var;
/* 1135 */                                                          a22Var.f51c = new OverScroller(recyclerView.getContext(), g12Var);
                                                                }
/* 1155 */                                                      a22Var.f51c.fling(0, 0, iMax3, iMax4, Integer.MIN_VALUE, AbstractC0208c9.API_PRIORITY_OTHER, Integer.MIN_VALUE, AbstractC0208c9.API_PRIORITY_OTHER);
/* 1158 */                                                      a22Var.m40a();
                                                            }
                                                        }
                                                    } else {
/* 1071 */                                              i2 = 1;
/* 1073 */                                              if (z3) {
/* 1075 */                                                  if (zMo835p2) {
/* 1077 */                                                      iMo832o = (iMo832o == true ? 1 : 0) | 2;
                                                            }
/* 1085 */                                                  getScrollingChildHelper().m7214g(iMo832o, i2);
/* 1088 */                                                  int i18 = -i8;
/* 1093 */                                                  int iMax5 = Math.max(i18, Math.min(i9, i8));
/* 1101 */                                                  int iMax6 = Math.max(i18, Math.min(i10, i8));
/* 1105 */                                                  a22Var = this.f1621O0;
/* 1107 */                                                  recyclerView = a22Var.f55i;
/* 1110 */                                                  recyclerView.setScrollState(2);
/* 1114 */                                                  a22Var.f50b = 0;
/* 1116 */                                                  a22Var.f49a = 0;
/* 1118 */                                                  interpolator = a22Var.f52d;
/* 1120 */                                                  g12Var = f1606m1;
/* 1122 */                                                  if (interpolator != g12Var) {
/* 1124 */                                                      a22Var.f52d = g12Var;
/* 1135 */                                                      a22Var.f51c = new OverScroller(recyclerView.getContext(), g12Var);
                                                            }
/* 1155 */                                                  a22Var.f51c.fling(0, 0, iMax5, iMax6, Integer.MIN_VALUE, AbstractC0208c9.API_PRIORITY_OTHER, Integer.MIN_VALUE, AbstractC0208c9.API_PRIORITY_OTHER);
/* 1158 */                                                  a22Var.m40a();
                                                        }
                                                    }
/* 1166 */                                          m872Z();
                                                }
                                            }
                                        }
/* 1162 */                              i4 = 0;
                                    }
/* 1163 */                          setScrollState(i4);
/* 1166 */                          m872Z();
                                } else if (actionMasked == 2) {
/* 429 */                           int iFindPointerIndex = motionEvent.findPointerIndex(this.f1608B0);
/* 433 */                           if (iFindPointerIndex < 0) {
/* 456 */                               AbstractC1245n0.m4876d("RecyclerView", "Error processing scroll; pointer index for id " + this.f1608B0 + " not found. Did any MotionEvents get skipped?");
/* 7 */                                 return false;
                                    }
/* 465 */                           int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
/* 471 */                           int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
/* 474 */                           int iMax7 = this.f1612F0 - x2;
/* 477 */                           int iMax8 = this.f1613G0 - y2;
/* 480 */                           if (this.f1607A0 != 1) {
/* 482 */                               if (zMo832o) {
/* 484 */                                   int i19 = this.f1614H0;
/* 495 */                                   iMax7 = iMax7 > 0 ? Math.max(0, iMax7 - i19) : Math.min(0, iMax7 + i19);
/* 499 */                                   if (iMax7 != 0) {
/* 501 */                                       z2 = true;
                                            } else {
/* 503 */                                       z2 = false;
                                            }
                                        } else {
/* 503 */                                   z2 = false;
                                        }
/* 504 */                               if (zMo835p) {
/* 506 */                                   int i20 = this.f1614H0;
/* 517 */                                   iMax8 = iMax8 > 0 ? Math.max(0, iMax8 - i20) : Math.min(0, iMax8 + i20);
/* 521 */                                   if (iMax8 != 0) {
/* 523 */                                       z2 = true;
                                            }
                                        }
/* 524 */                               if (z2) {
/* 526 */                                   setScrollState(1);
                                        }
                                    }
/* 529 */                           int i21 = iMax7;
/* 530 */                           int i22 = iMax8;
/* 534 */                           if (this.f1607A0 == 1) {
/* 536 */                               int[] iArr4 = this.f1647d1;
/* 538 */                               iArr4[0] = 0;
/* 540 */                               iArr4[1] = 0;
/* 556 */                               boolean zM893s = m893s(zMo832o ? i21 : 0, zMo835p ? i22 : 0, iArr4, this.f1641b1, 0);
/* 560 */                               int[] iArr5 = this.f1641b1;
/* 562 */                               if (zM893s) {
/* 566 */                                   i21 -= iArr4[0];
/* 569 */                                   i22 -= iArr4[1];
/* 576 */                                   iArr3[0] = iArr3[0] + iArr5[0];
/* 583 */                                   iArr3[1] = iArr3[1] + iArr5[1];
/* 589 */                                   getParent().requestDisallowInterceptTouchEvent(true);
                                        }
/* 592 */                               int i23 = i22;
/* 597 */                               this.f1612F0 = x2 - iArr5[0];
/* 602 */                               this.f1613G0 = y2 - iArr5[1];
/* 618 */                               if (m873a0(zMo832o ? i21 : 0, zMo835p ? i23 : 0, motionEvent, 0)) {
/* 624 */                                   getParent().requestDisallowInterceptTouchEvent(true);
                                        }
/* 627 */                               hq0 hq0Var = this.f1622P0;
/* 629 */                               if (hq0Var != null && (i21 != 0 || i23 != 0)) {
/* 635 */                                   hq0Var.m4263a(this, i21, i23);
                                        }
                                    }
                                } else if (actionMasked == 3) {
/* 419 */                           m872Z();
/* 422 */                           setScrollState(0);
                                } else if (actionMasked == 5) {
/* 395 */                           this.f1608B0 = motionEvent.getPointerId(actionIndex);
/* 402 */                           int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
/* 403 */                           this.f1612F0 = x3;
/* 405 */                           this.f1610D0 = x3;
/* 412 */                           int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
/* 413 */                           this.f1613G0 = y3;
/* 415 */                           this.f1611E0 = y3;
                                } else if (actionMasked == 6) {
/* 386 */                           m866T(motionEvent);
                                }
/* 1214 */                      motionEventObtain.recycle();
/* 1217 */                      return true;
                            }
/* 1175 */                  this.f1608B0 = motionEvent.getPointerId(0);
/* 1182 */                  int x4 = (int) (motionEvent.getX() + 0.5f);
/* 1183 */                  this.f1612F0 = x4;
/* 1185 */                  this.f1610D0 = x4;
/* 1192 */                  int y4 = (int) (motionEvent.getY() + 0.5f);
/* 1193 */                  this.f1613G0 = y4;
/* 1195 */                  this.f1611E0 = y4;
/* 1197 */                  if (zMo835p) {
                                i = zMo832o;
/* 1199 */                      i = (zMo832o ? 1 : 0) | 2;
                            }
                            i = zMo832o;
/* 1206 */                  getScrollingChildHelper().m7214g(i, 0);
/* 1211 */                  this.f1609C0.addMovement(motionEventObtain);
/* 1214 */                  motionEventObtain.recycle();
/* 1217 */                  return true;
                        }
                    }
/* 7 */             return false;
                }

                /* JADX WARN: Code duplicated, block: B:124:0x0279  */
                /* JADX WARN: Code duplicated, block: B:163:0x0347  */
                /* JADX WARN: Code duplicated, block: B:182:0x0387  */
                /* JADX WARN: Code duplicated, block: B:184:0x038a  */
                /* JADX WARN: Code duplicated, block: B:190:0x039f  */
                /* JADX WARN: Code duplicated, block: B:192:0x03a5  */
                /* JADX WARN: Code duplicated, block: B:195:0x03aa  */
                /* JADX WARN: Code duplicated, block: B:198:0x03b2  */
                /* JADX WARN: Code duplicated, block: B:201:0x03b9  */
                /* JADX WARN: Code duplicated, block: B:204:0x03c3 A[LOOP:4: B:197:0x03b0->B:204:0x03c3, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:207:0x03d0  */
                /* JADX WARN: Code duplicated, block: B:210:0x03d7  */
                /* JADX WARN: Code duplicated, block: B:213:0x03e1 A[LOOP:5: B:206:0x03ce->B:213:0x03e1, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:215:0x03e6  */
                /* JADX WARN: Code duplicated, block: B:243:0x03c6 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:244:0x03c6 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:245:0x03c1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:246:0x03e4 A[EDGE_INSN: B:246:0x03e4->B:214:0x03e4 BREAK  A[LOOP:5: B:206:0x03ce->B:213:0x03e1], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:247:0x03df A[SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v0 */
                /* JADX WARN: Type inference failed for: r11v1, types: [androidx.recyclerview.widget.o] */
                /* JADX WARN: Type inference failed for: r11v13 */
                /* JADX WARN: Type inference failed for: r11v2 */
                /* JADX WARN: Type inference failed for: r11v3 */
                /* JADX WARN: Type inference failed for: r11v4 */
                /* JADX WARN: Type inference failed for: r11v7 */
                /* JADX WARN: Type inference failed for: r11v8 */
                /* JADX INFO: renamed from: p */
                public final void m890p() {
                    boolean z;
                    long j;
                    ?? r11;
                    int i;
                    int iM10082b;
                    int i2;
                    int iMin;
                    AbstractC0137o abstractC0137oM854F;
                    View view;
                    AbstractC0137o abstractC0137oM854F2;
                    View view2;
                    int i3;
                    View viewFindViewById;
                    View view3;
                    boolean z2;
                    le2 le2Var;
                    m12 m12Var;
                    boolean zM5717g;
                    boolean z3;
/* 7 */             if (this.f1631W == null) {
/* 11 */                AbstractC1245n0.m4889q("RecyclerView", "No adapter attached; skipping layout");
/* 14 */                return;
                    }
/* 17 */            if (this.f1637a0 == null) {
/* 21 */                AbstractC1245n0.m4876d("RecyclerView", "No layout manager attached; skipping layout");
/* 24 */                return;
                    }
/* 25 */            y12 y12Var = this.f1624R0;
/* 28 */            y12Var.f19445i = false;
/* 32 */            boolean z4 = true;
/* 53 */            boolean z5 = this.f1655g1 && !(this.f1657h1 == getWidth() && this.f1660i1 == getHeight());
/* 54 */            this.f1657h1 = 0;
/* 56 */            this.f1660i1 = 0;
/* 58 */            this.f1655g1 = false;
/* 62 */            if (y12Var.f19440d == 1) {
/* 64 */                m891q();
/* 69 */                this.f1637a0.m980A0(this);
/* 72 */                m892r();
                    } else {
/* 76 */                C2093q3 c2093q3 = this.f1645d;
/* 86 */                if ((((ArrayList) c2093q3.f15372d).isEmpty() || ((ArrayList) c2093q3.f15371c).isEmpty()) && !z5 && this.f1637a0.f1757Y == getWidth() && this.f1637a0.f1758Z == getHeight()) {
/* 124 */                   this.f1637a0.m980A0(this);
                        } else {
/* 130 */                   this.f1637a0.m980A0(this);
/* 133 */                   m892r();
                        }
                    }
/* 137 */           y12Var.m10081a(4);
/* 140 */           m879f0();
/* 143 */           m864R();
/* 146 */           y12Var.f19440d = 1;
/* 148 */           boolean z6 = y12Var.f19446j;
/* 150 */           C0875ec c0875ec = this.f1648e;
/* 152 */           View view4 = null;
/* 153 */           C0134l c0134l = this.f1639b;
/* 155 */           we2 we2Var = this.f1651f;
/* 157 */           if (z6) {
/* 163 */               int iM3396u = c0875ec.m3396u() - 1;
/* 164 */               while (iM3396u >= 0) {
/* 170 */                   AbstractC0137o abstractC0137oM843J = m843J(c0875ec.m3395t(iM3396u));
/* 178 */                   if (abstractC0137oM843J.m1031o()) {
/* 180 */                       z3 = z4;
                            } else {
/* 184 */                       long jM856H = m856H(abstractC0137oM843J);
/* 190 */                       this.f1680z0.getClass();
/* 195 */                       m12 m12Var2 = new m12();
/* 198 */                       m12Var2.m6588a(abstractC0137oM843J);
/* 203 */                       ta1 ta1Var = (ta1) we2Var.f18595b;
/* 205 */                       z3 = z4;
/* 209 */                       le2 le2Var2 = (le2) we2Var.f18596c;
/* 215 */                       AbstractC0137o abstractC0137o = (AbstractC0137o) ta1Var.m8754c(jM856H);
/* 217 */                       if (abstractC0137o == null || abstractC0137o.m1031o()) {
/* 449 */                           we2Var.m9558b(abstractC0137oM843J, m12Var2);
                                } else {
/* 231 */                           p33 p33Var = (p33) le2Var2.getOrDefault(abstractC0137o, view4);
/* 244 */                           boolean z7 = (p33Var == null || (p33Var.f14957a & 1) == 0) ? false : z3;
/* 249 */                           p33 p33Var2 = (p33) le2Var2.getOrDefault(abstractC0137oM843J, view4);
/* 262 */                           boolean z8 = (p33Var2 == null || (p33Var2.f14957a & 1) == 0) ? false : z3;
/* 263 */                           if (z7 && abstractC0137o == abstractC0137oM843J) {
/* 267 */                               we2Var.m9558b(abstractC0137oM843J, m12Var2);
                                    } else {
/* 272 */                               m12 m12VarM9563n = we2Var.m9563n(abstractC0137o, 4);
/* 276 */                               we2Var.m9558b(abstractC0137oM843J, m12Var2);
/* 281 */                               m12 m12VarM9563n2 = we2Var.m9563n(abstractC0137oM843J, 8);
/* 285 */                               if (m12VarM9563n == null) {
/* 287 */                                   int iM3396u2 = c0875ec.m3396u();
/* 292 */                                   for (int i4 = 0; i4 < iM3396u2; i4++) {
/* 298 */                                       AbstractC0137o abstractC0137oM843J2 = m843J(c0875ec.m3395t(i4));
/* 302 */                                       if (abstractC0137oM843J2 != abstractC0137oM843J && m856H(abstractC0137oM843J2) == jM856H) {
/* 313 */                                           AbstractC0129g abstractC0129g = this.f1631W;
/* 317 */                                           if (abstractC0129g == null || !abstractC0129g.f1749b) {
/* 351 */                                               StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
/* 354 */                                               sb.append(abstractC0137oM843J2);
/* 357 */                                               sb.append(" \n View Holder 2:");
/* 360 */                                               sb.append(abstractC0137oM843J);
/* 367 */                                               f42.m3659o(sb, m900z());
/* 370 */                                               return;
                                                    }
/* 327 */                                           StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
/* 330 */                                           sb2.append(abstractC0137oM843J2);
/* 333 */                                           sb2.append(" \n View Holder 2:");
/* 336 */                                           sb2.append(abstractC0137oM843J);
/* 343 */                                           f42.m3659o(sb2, m900z());
/* 346 */                                           return;
                                                }
                                            }
/* 403 */                                   AbstractC1245n0.m4876d("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0137o + " cannot be found but it is necessary for " + abstractC0137oM843J + m900z());
                                        } else {
/* 408 */                                   abstractC0137o.m1030n(false);
/* 411 */                                   if (z7) {
/* 413 */                                       m878f(abstractC0137o);
                                            }
/* 416 */                                   if (abstractC0137o != abstractC0137oM843J) {
/* 418 */                                       if (z8) {
/* 420 */                                           m878f(abstractC0137oM843J);
                                                }
/* 423 */                                       abstractC0137o.f1785h = abstractC0137oM843J;
/* 425 */                                       m878f(abstractC0137o);
/* 428 */                                       c0134l.m1013j(abstractC0137o);
/* 432 */                                       abstractC0137oM843J.m1030n(false);
/* 435 */                                       abstractC0137oM843J.f1786i = abstractC0137o;
                                            }
/* 443 */                                   if (this.f1680z0.mo5713a(abstractC0137o, abstractC0137oM843J, m12VarM9563n, m12VarM9563n2)) {
/* 445 */                                       m867U();
                                            }
                                        }
                                    }
                                }
                            }
/* 452 */                   iM3396u--;
/* 454 */                   z4 = z3;
/* 457 */                   view4 = null;
                        }
/* 460 */               z = z4;
/* 464 */               le2 le2Var3 = (le2) we2Var.f18596c;
/* 468 */               int i5 = le2Var3.f13213c - 1;
/* 470 */               while (i5 >= 0) {
/* 476 */                   AbstractC0137o abstractC0137o2 = (AbstractC0137o) le2Var3.m6428h(i5);
/* 482 */                   p33 p33Var3 = (p33) le2Var3.m6429i(i5);
/* 484 */                   int i6 = p33Var3.f14957a;
/* 486 */                   int i7 = i6 & 3;
/* 488 */                   h12 h12Var = this.f1662j1;
/* 491 */                   if (i7 == 3) {
/* 493 */                       RecyclerView recyclerView = h12Var.f8866a;
/* 501 */                       recyclerView.f1637a0.m1001u0(abstractC0137o2.f1778a, recyclerView.f1639b);
                            } else if ((i6 & 1) != 0) {
/* 514 */                       m12 m12Var3 = p33Var3.f14958b;
/* 516 */                       if (m12Var3 == null) {
/* 518 */                           RecyclerView recyclerView2 = h12Var.f8866a;
/* 526 */                           recyclerView2.f1637a0.m1001u0(abstractC0137o2.f1778a, recyclerView2.f1639b);
                                } else {
/* 532 */                           h12Var.m4080b(abstractC0137o2, m12Var3, p33Var3.f14959c);
                                }
                            } else if ((i6 & 14) == 14) {
/* 546 */                       h12Var.m4079a(abstractC0137o2, p33Var3.f14958b, p33Var3.f14959c);
                            } else {
/* 554 */                       if ((i6 & 12) == 12) {
/* 556 */                           m12 m12Var4 = p33Var3.f14958b;
/* 558 */                           m12 m12Var5 = p33Var3.f14959c;
/* 560 */                           h12Var.getClass();
/* 564 */                           abstractC0137o2.m1030n(false);
/* 567 */                           RecyclerView recyclerView3 = h12Var.f8866a;
/* 569 */                           boolean z9 = recyclerView3.f1669q0;
/* 571 */                           n12 n12Var = recyclerView3.f1680z0;
/* 573 */                           if (!z9) {
/* 585 */                               j60 j60Var = (j60) n12Var;
/* 587 */                               j60Var.getClass();
/* 590 */                               int i8 = m12Var4.f13545a;
/* 592 */                               int i9 = m12Var5.f13545a;
/* 594 */                               if (i8 == i9) {
/* 598 */                                   le2Var = le2Var3;
/* 602 */                                   if (m12Var4.f13546b == m12Var5.f13546b) {
/* 605 */                                       j60Var.m6851c(abstractC0137o2);
/* 608 */                                       zM5717g = false;
                                            }
/* 632 */                                   if (zM5717g) {
/* 634 */                                       recyclerView3.m867U();
                                            }
                                        } else {
/* 610 */                                   le2Var = le2Var3;
                                        }
/* 628 */                               zM5717g = j60Var.m5717g(abstractC0137o2, i8, m12Var4.f13546b, i9, m12Var5.f13546b);
/* 632 */                               if (zM5717g) {
/* 634 */                                   recyclerView3.m867U();
                                        }
                                    } else if (n12Var.mo5713a(abstractC0137o2, abstractC0137o2, m12Var4, m12Var5)) {
/* 581 */                               recyclerView3.m867U();
                                    }
/* 506 */                           m12Var = null;
                                } else {
/* 639 */                           le2Var = le2Var3;
/* 643 */                           if ((i6 & 4) != 0) {
/* 647 */                               m12Var = null;
/* 648 */                               h12Var.m4080b(abstractC0137o2, p33Var3.f14958b, null);
                                    } else {
/* 653 */                               m12Var = null;
/* 656 */                               if ((i6 & 8) != 0) {
/* 662 */                                   h12Var.m4079a(abstractC0137o2, p33Var3.f14958b, p33Var3.f14959c);
                                        }
                                    }
                                }
/* 667 */                       p33Var3.f14957a = 0;
/* 669 */                       p33Var3.f14958b = m12Var;
/* 671 */                       p33Var3.f14959c = m12Var;
/* 675 */                       p33.f14956d.mo7044c(p33Var3);
/* 678 */                       i5--;
/* 680 */                       le2Var3 = le2Var;
                            }
/* 504 */                   le2Var = le2Var3;
/* 506 */                   m12Var = null;
/* 667 */                   p33Var3.f14957a = 0;
/* 669 */                   p33Var3.f14958b = m12Var;
/* 671 */                   p33Var3.f14959c = m12Var;
/* 675 */                   p33.f14956d.mo7044c(p33Var3);
/* 678 */                   i5--;
/* 680 */                   le2Var3 = le2Var;
                        }
/* 684 */               view4 = null;
                    } else {
/* 686 */               z = true;
                    }
/* 690 */           this.f1637a0.m1000t0(c0134l);
/* 695 */           y12Var.f19438b = y12Var.f19441e;
/* 698 */           this.f1669q0 = false;
/* 700 */           this.f1670r0 = false;
/* 702 */           y12Var.f19446j = false;
/* 704 */           y12Var.f19447k = false;
/* 708 */           this.f1637a0.f1764f = false;
/* 710 */           ArrayList arrayList = c0134l.f1769b;
/* 712 */           if (arrayList != null) {
/* 714 */               arrayList.clear();
                    }
/* 717 */           AbstractC0133k abstractC0133k = this.f1637a0;
/* 721 */           if (abstractC0133k.f1754V) {
/* 723 */               abstractC0133k.f1753U = 0;
/* 725 */               abstractC0133k.f1754V = false;
/* 727 */               c0134l.m1014k();
                    }
/* 732 */           this.f1637a0.mo781m0(y12Var);
/* 735 */           boolean z10 = z;
/* 737 */           m865S(z10);
/* 740 */           m881g0(false);
/* 747 */           ((le2) we2Var.f18596c).clear();
/* 754 */           ((ta1) we2Var.f18595b).m8752a();
/* 757 */           int[] iArr = this.f1635Z0;
/* 759 */           int i10 = iArr[0];
/* 761 */           int i11 = iArr[z10 ? 1 : 0];
/* 763 */           m853D(iArr);
/* 768 */           if (iArr[0] != i10 || iArr[z10 ? 1 : 0] != i11) {
/* 774 */               m895u(0, 0);
                    }
/* 782 */           if (this.f1620N0 && this.f1631W != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
/* 822 */               if (isFocused()) {
/* 840 */                   j = y12Var.f19449m;
/* 844 */                   if (j == -1) {
/* 904 */                       r11 = view4;
                            } else {
/* 904 */                       r11 = view4;
                            }
/* 905 */                   if (r11 != 0) {
/* 907 */                       view3 = r11.f1778a;
/* 917 */                       if (!((ArrayList) c0875ec.f7615d).contains(view3)) {
/* 932 */                           if (c0875ec.m3396u() > 0) {
/* 934 */                               i = y12Var.f19448l;
/* 936 */                               if (i == -1) {
/* 939 */                                   i = 0;
                                        }
/* 940 */                               iM10082b = y12Var.m10082b();
/* 944 */                               i2 = i;
                                        while (true) {
/* 945 */                                   if (i2 < iM10082b) {
/* 947 */                                       abstractC0137oM854F2 = m854F(i2);
/* 951 */                                       if (abstractC0137oM854F2 != null) {
/* 954 */                                           view2 = abstractC0137oM854F2.f1778a;
/* 960 */                                           if (view2.hasFocusable()) {
/* 962 */                                               view4 = view2;
                                                    } else {
/* 964 */                                               i2++;
                                                    }
                                                }
                                            }
/* 975 */                                   for (iMin = Math.min(iM10082b, i) - 1; iMin >= 0; iMin--) {
/* 977 */                                       abstractC0137oM854F = m854F(iMin);
/* 981 */                                       if (abstractC0137oM854F == null) {
                                                    break;
                                                    break;
                                                }
/* 984 */                                       view = abstractC0137oM854F.f1778a;
/* 990 */                                       if (view.hasFocusable()) {
/* 992 */                                           view4 = view;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else if (c0875ec.m3396u() > 0) {
/* 934 */                           i = y12Var.f19448l;
/* 936 */                           if (i == -1) {
/* 939 */                               i = 0;
                                    }
/* 940 */                           iM10082b = y12Var.m10082b();
/* 944 */                           i2 = i;
                                    while (true) {
/* 945 */                               if (i2 < iM10082b) {
/* 947 */                                   abstractC0137oM854F2 = m854F(i2);
/* 951 */                                   if (abstractC0137oM854F2 != null) {
/* 954 */                                       view2 = abstractC0137oM854F2.f1778a;
/* 960 */                                       if (view2.hasFocusable()) {
/* 962 */                                           view4 = view2;
                                                } else {
/* 964 */                                           i2++;
                                                }
                                            }
                                        }
/* 975 */                               while (iMin >= 0) {
/* 977 */                                   abstractC0137oM854F = m854F(iMin);
/* 981 */                                   if (abstractC0137oM854F == null) {
                                                break;
                                                break;
                                            }
/* 984 */                                   view = abstractC0137oM854F.f1778a;
/* 990 */                                   if (view.hasFocusable()) {
/* 992 */                                       view4 = view;
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else if (c0875ec.m3396u() > 0) {
/* 934 */                       i = y12Var.f19448l;
/* 936 */                       if (i == -1) {
/* 939 */                           i = 0;
                                }
/* 940 */                       iM10082b = y12Var.m10082b();
/* 944 */                       i2 = i;
                                while (true) {
/* 945 */                           if (i2 < iM10082b) {
/* 947 */                               abstractC0137oM854F2 = m854F(i2);
/* 951 */                               if (abstractC0137oM854F2 != null) {
/* 954 */                                   view2 = abstractC0137oM854F2.f1778a;
/* 960 */                                   if (view2.hasFocusable()) {
/* 962 */                                       view4 = view2;
                                            } else {
/* 964 */                                       i2++;
                                            }
                                        }
                                    }
/* 975 */                           while (iMin >= 0) {
/* 977 */                               abstractC0137oM854F = m854F(iMin);
/* 981 */                               if (abstractC0137oM854F == null) {
                                            break;
                                            break;
                                        }
/* 984 */                               view = abstractC0137oM854F.f1778a;
/* 990 */                               if (view.hasFocusable()) {
/* 992 */                                   view4 = view;
                                            break;
                                        }
                                    }
                                }
                            }
/* 997 */                   if (view4 != null) {
/* 999 */                       i3 = y12Var.f19450n;
/* 1004 */                      if (i3 != -1) {
/* 1018 */                          view4 = viewFindViewById;
                                }
/* 1019 */                      view4.requestFocus();
                            }
                        } else if (((ArrayList) c0875ec.f7615d).contains(getFocusedChild())) {
/* 840 */                   j = y12Var.f19449m;
/* 844 */                   if (j == -1 && (z2 = this.f1631W.f1749b) && z2) {
/* 855 */                       int iM3363A = c0875ec.m3363A();
/* 859 */                       r11 = view4;
/* 860 */                       int i12 = 0;
/* 861 */                       while (i12 < iM3363A) {
/* 867 */                           AbstractC0137o abstractC0137oM843J3 = m843J(c0875ec.m3399z(i12));
/* 871 */                           if (abstractC0137oM843J3 != null && !abstractC0137oM843J3.m1024h() && abstractC0137oM843J3.f1782e == j) {
/* 895 */                               if (!((ArrayList) c0875ec.f7615d).contains(abstractC0137oM843J3.f1778a)) {
/* 899 */                                   r11 = abstractC0137oM843J3;
                                            break;
                                        }
/* 897 */                               r11 = abstractC0137oM843J3;
                                    }
/* 901 */                           i12++;
                                    r11 = r11;
                                }
                            } else {
/* 904 */                       r11 = view4;
                            }
/* 905 */                   if (r11 != 0) {
/* 907 */                       view3 = r11.f1778a;
/* 917 */                       if (!((ArrayList) c0875ec.f7615d).contains(view3) && view3.hasFocusable()) {
/* 926 */                           view4 = view3;
                                } else if (c0875ec.m3396u() > 0) {
/* 934 */                           i = y12Var.f19448l;
/* 936 */                           if (i == -1) {
/* 939 */                               i = 0;
                                    }
/* 940 */                           iM10082b = y12Var.m10082b();
/* 944 */                           i2 = i;
                                    while (true) {
/* 945 */                               if (i2 < iM10082b) {
/* 947 */                                   abstractC0137oM854F2 = m854F(i2);
/* 951 */                                   if (abstractC0137oM854F2 != null) {
/* 954 */                                       view2 = abstractC0137oM854F2.f1778a;
/* 960 */                                       if (view2.hasFocusable()) {
/* 962 */                                           view4 = view2;
                                                } else {
/* 964 */                                           i2++;
                                                }
                                            }
                                        }
/* 975 */                               while (iMin >= 0) {
/* 977 */                                   abstractC0137oM854F = m854F(iMin);
/* 981 */                                   if (abstractC0137oM854F == null) {
                                                break;
                                            }
/* 984 */                                   view = abstractC0137oM854F.f1778a;
/* 990 */                                   if (view.hasFocusable()) {
/* 992 */                                       view4 = view;
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else if (c0875ec.m3396u() > 0) {
/* 934 */                       i = y12Var.f19448l;
/* 936 */                       if (i == -1) {
/* 939 */                           i = 0;
                                }
/* 940 */                       iM10082b = y12Var.m10082b();
/* 944 */                       i2 = i;
                                while (true) {
/* 945 */                           if (i2 < iM10082b) {
/* 947 */                               abstractC0137oM854F2 = m854F(i2);
/* 951 */                               if (abstractC0137oM854F2 != null) {
/* 954 */                                   view2 = abstractC0137oM854F2.f1778a;
/* 960 */                                   if (view2.hasFocusable()) {
/* 962 */                                       view4 = view2;
                                            } else {
/* 964 */                                       i2++;
                                            }
                                        }
                                    }
/* 975 */                           while (iMin >= 0) {
/* 977 */                               abstractC0137oM854F = m854F(iMin);
/* 981 */                               if (abstractC0137oM854F == null) {
                                            break;
                                            break;
                                        }
/* 984 */                               view = abstractC0137oM854F.f1778a;
/* 990 */                               if (view.hasFocusable()) {
/* 992 */                                   view4 = view;
                                            break;
                                        }
                                    }
                                }
                            }
/* 997 */                   if (view4 != null) {
/* 999 */                       i3 = y12Var.f19450n;
/* 1004 */                      if (i3 != -1 && (viewFindViewById = view4.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
/* 1018 */                          view4 = viewFindViewById;
                                }
/* 1019 */                      view4.requestFocus();
                            }
                        }
                    }
/* 1022 */          y12Var.f19449m = -1L;
/* 1024 */          y12Var.f19448l = -1;
/* 1026 */          y12Var.f19450n = -1;
                }

                /* JADX WARN: Code duplicated, block: B:24:0x0067  */
                /* JADX INFO: renamed from: q */
                public final void m891q() {
                    View viewM851B;
                    int iM855G;
                    p33 p33Var;
/* 1 */             y12 y12Var = this.f1624R0;
/* 4 */             y12Var.m10081a(1);
/* 7 */             m850A(y12Var);
/* 11 */            y12Var.f19445i = false;
/* 13 */            m879f0();
/* 16 */            we2 we2Var = this.f1651f;
/* 20 */            le2 le2Var = (le2) we2Var.f18596c;
/* 24 */            le2 le2Var2 = (le2) we2Var.f18596c;
/* 26 */            le2Var.clear();
/* 31 */            ta1 ta1Var = (ta1) we2Var.f18595b;
/* 33 */            ta1Var.m8752a();
/* 36 */            m864R();
/* 39 */            m868V();
/* 62 */            View focusedChild = (this.f1620N0 && hasFocus() && this.f1631W != null) ? getFocusedChild() : null;
/* 74 */            AbstractC0137o abstractC0137oM857I = (focusedChild == null || (viewM851B = m851B(focusedChild)) == null) ? null : m857I(viewM851B);
/* 81 */            if (abstractC0137oM857I == null) {
/* 83 */                y12Var.f19449m = -1L;
/* 85 */                y12Var.f19448l = -1;
/* 87 */                y12Var.f19450n = -1;
                    } else {
/* 98 */                y12Var.f19449m = this.f1631W.f1749b ? abstractC0137oM857I.f1782e : -1L;
/* 102 */               if (this.f1669q0) {
/* 104 */                   iM855G = -1;
                        } else if (abstractC0137oM857I.m1024h()) {
/* 112 */                   iM855G = abstractC0137oM857I.f1781d;
                        } else {
/* 115 */                   RecyclerView recyclerView = abstractC0137oM857I.f1795r;
/* 117 */                   if (recyclerView == null) {
/* 104 */                       iM855G = -1;
                            } else {
/* 120 */                       iM855G = recyclerView.m855G(abstractC0137oM857I);
                            }
                        }
/* 124 */               y12Var.f19448l = iM855G;
/* 126 */               View focusedChild2 = abstractC0137oM857I.f1778a;
/* 128 */               int id = focusedChild2.getId();
/* 136 */               while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
/* 150 */                   focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
/* 158 */                   if (focusedChild2.getId() != -1) {
/* 160 */                       id = focusedChild2.getId();
                            }
                        }
/* 165 */               y12Var.f19450n = id;
                    }
/* 178 */           y12Var.f19444h = y12Var.f19446j && this.f1630V0;
/* 180 */           this.f1630V0 = false;
/* 182 */           this.f1628U0 = false;
/* 186 */           y12Var.f19443g = y12Var.f19447k;
/* 194 */           y12Var.f19441e = this.f1631W.mo955a();
/* 198 */           m853D(this.f1635Z0);
/* 201 */           boolean z = y12Var.f19446j;
/* 203 */           C0875ec c0875ec = this.f1648e;
/* 205 */           if (z) {
/* 207 */               int iM3396u = c0875ec.m3396u();
/* 212 */               for (int i = 0; i < iM3396u; i++) {
/* 218 */                   AbstractC0137o abstractC0137oM843J = m843J(c0875ec.m3395t(i));
/* 226 */                   if (!abstractC0137oM843J.m1031o() && (!abstractC0137oM843J.m1022f() || this.f1631W.f1749b)) {
/* 241 */                       n12 n12Var = this.f1680z0;
/* 243 */                       n12.m6850b(abstractC0137oM843J);
/* 246 */                       abstractC0137oM843J.m1019c();
/* 249 */                       n12Var.getClass();
/* 254 */                       m12 m12Var = new m12();
/* 257 */                       m12Var.m6588a(abstractC0137oM843J);
/* 264 */                       p33 p33VarM7324a = (p33) le2Var2.getOrDefault(abstractC0137oM843J, null);
/* 266 */                       if (p33VarM7324a == null) {
/* 268 */                           p33VarM7324a = p33.m7324a();
/* 272 */                           le2Var2.put(abstractC0137oM843J, p33VarM7324a);
                                }
/* 275 */                       p33VarM7324a.f14958b = m12Var;
/* 281 */                       p33VarM7324a.f14957a |= 4;
/* 285 */                       if (y12Var.f19444h && abstractC0137oM843J.m1027k() && !abstractC0137oM843J.m1024h() && !abstractC0137oM843J.m1031o() && !abstractC0137oM843J.m1022f()) {
/* 315 */                           ta1Var.m8755d(abstractC0137oM843J, m856H(abstractC0137oM843J));
                                }
                            }
                        }
                    }
/* 324 */           if (y12Var.f19447k) {
/* 326 */               int iM3363A = c0875ec.m3363A();
/* 331 */               for (int i2 = 0; i2 < iM3363A; i2++) {
/* 337 */                   AbstractC0137o abstractC0137oM843J2 = m843J(c0875ec.m3399z(i2));
/* 345 */                   if (!abstractC0137oM843J2.m1031o() && abstractC0137oM843J2.f1781d == -1) {
/* 353 */                       abstractC0137oM843J2.f1781d = abstractC0137oM843J2.f1780c;
                            }
                        }
/* 358 */               boolean z2 = y12Var.f19442f;
/* 360 */               y12Var.f19442f = false;
/* 366 */               this.f1637a0.mo780l0(this.f1639b, y12Var);
/* 369 */               y12Var.f19442f = z2;
/* 376 */               for (int i3 = 0; i3 < c0875ec.m3396u(); i3++) {
/* 382 */                   AbstractC0137o abstractC0137oM843J3 = m843J(c0875ec.m3395t(i3));
/* 390 */                   if (!abstractC0137oM843J3.m1031o() && ((p33Var = (p33) le2Var2.getOrDefault(abstractC0137oM843J3, null)) == null || (p33Var.f14957a & 4) == 0)) {
/* 408 */                       n12.m6850b(abstractC0137oM843J3);
/* 419 */                       boolean z3 = (abstractC0137oM843J3.f1787j & Segment.SIZE) != 0;
/* 420 */                       n12 n12Var2 = this.f1680z0;
/* 422 */                       abstractC0137oM843J3.m1019c();
/* 425 */                       n12Var2.getClass();
/* 430 */                       m12 m12Var2 = new m12();
/* 433 */                       m12Var2.m6588a(abstractC0137oM843J3);
/* 436 */                       if (z3) {
/* 438 */                           m870X(abstractC0137oM843J3, m12Var2);
                                } else {
/* 446 */                           p33 p33VarM7324a2 = (p33) le2Var2.getOrDefault(abstractC0137oM843J3, null);
/* 448 */                           if (p33VarM7324a2 == null) {
/* 450 */                               p33VarM7324a2 = p33.m7324a();
/* 454 */                               le2Var2.put(abstractC0137oM843J3, p33VarM7324a2);
                                    }
/* 460 */                           p33VarM7324a2.f14957a |= 2;
/* 462 */                           p33VarM7324a2.f14958b = m12Var2;
                                }
                            }
                        }
/* 467 */               m885k();
                    } else {
/* 471 */               m885k();
                    }
/* 474 */           m865S(true);
/* 477 */           m881g0(false);
/* 480 */           y12Var.f19440d = 2;
                }

                /* JADX INFO: renamed from: r */
                public final void m892r() {
/* 1 */             m879f0();
/* 4 */             m864R();
/* 8 */             y12 y12Var = this.f1624R0;
/* 10 */            y12Var.m10081a(6);
/* 15 */            this.f1645d.m7683c();
/* 24 */            y12Var.f19441e = this.f1631W.mo955a();
/* 27 */            y12Var.f19439c = 0;
/* 32 */            if (this.f1642c != null) {
/* 34 */                AbstractC0129g abstractC0129g = this.f1631W;
/* 38 */                int iM3520y = AbstractC0886en.m3520y(abstractC0129g.f1750c);
/* 42 */                if (iM3520y == 1 ? abstractC0129g.mo955a() > 0 : iM3520y != 2) {
/* 56 */                    Parcelable parcelable = this.f1642c.f1685c;
/* 58 */                    if (parcelable != null) {
/* 62 */                        this.f1637a0.mo830n0(parcelable);
                            }
/* 66 */                    this.f1642c = null;
                        }
                    }
/* 68 */            y12Var.f19443g = false;
/* 74 */            this.f1637a0.mo780l0(this.f1639b, y12Var);
/* 77 */            y12Var.f19442f = false;
/* 90 */            y12Var.f19446j = y12Var.f19446j && this.f1680z0 != null;
/* 93 */            y12Var.f19440d = 4;
/* 95 */            m865S(true);
/* 98 */            m881g0(false);
                }

                @Override // android.view.ViewGroup
                public final void removeDetachedView(View view, boolean z) {
/* 1 */             AbstractC0137o abstractC0137oM843J = m843J(view);
/* 5 */             if (abstractC0137oM843J != null) {
/* 11 */                if (abstractC0137oM843J.m1026j()) {
/* 17 */                    abstractC0137oM843J.f1787j &= -257;
                        } else if (!abstractC0137oM843J.m1031o()) {
/* 53 */                    throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC0137oM843J + m900z());
                        }
                    }
/* 54 */            view.clearAnimation();
/* 57 */            m889o(view);
/* 60 */            super.removeDetachedView(view, z);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final void requestChildFocus(View view, View view2) {
/* 3 */             C0126d c0126d = this.f1637a0.f1763e;
/* 5 */             if ((c0126d == null || !c0126d.f18906e) && !m860N() && view2 != null) {
/* 21 */                m871Y(view, view2);
                    }
/* 24 */            super.requestChildFocus(view, view2);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
/* 8 */             return this.f1637a0.mo1002v0(this, view, rect, z, false);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final void requestDisallowInterceptTouchEvent(boolean z) {
/* 1 */             ArrayList arrayList = this.f1646d0;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i = 0; i < size; i++) {
/* 16 */                ((ah0) arrayList.get(i)).getClass();
                    }
/* 22 */            super.requestDisallowInterceptTouchEvent(z);
                }

                @Override // android.view.View, android.view.ViewParent
                public final void requestLayout() {
/* 3 */             if (this.f1659i0 != 0 || this.f1663k0) {
/* 14 */                this.f1661j0 = true;
                    } else {
/* 9 */                 super.requestLayout();
                    }
                }

                /* JADX INFO: renamed from: s */
                public final boolean m893s(int i, int i2, int[] iArr, int[] iArr2, int i3) {
/* 5 */             return getScrollingChildHelper().m7210c(i, i2, iArr, iArr2, i3);
                }

                @Override // android.view.View
                public final void scrollBy(int i, int i2) {
/* 1 */             AbstractC0133k abstractC0133k = this.f1637a0;
/* 3 */             if (abstractC0133k == null) {
/* 9 */                 AbstractC1245n0.m4876d("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
/* 12 */                return;
                    }
/* 15 */            if (this.f1663k0) {
/* 33 */                return;
                    }
/* 18 */            boolean zMo832o = abstractC0133k.mo832o();
/* 24 */            boolean zMo835p = this.f1637a0.mo835p();
/* 28 */            if (zMo832o || zMo835p) {
/* 35 */                if (!zMo832o) {
/* 38 */                    i = 0;
                        }
/* 39 */                if (!zMo835p) {
/* 42 */                    i2 = 0;
                        }
/* 44 */                m873a0(i, i2, null, 0);
                    }
                }

                @Override // android.view.View
                public final void scrollTo(int i, int i2) {
/* 5 */             AbstractC1245n0.m4889q("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
                }

                @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
                public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
/* 5 */             if (!m860N()) {
/* 26 */                super.sendAccessibilityEventUnchecked(accessibilityEvent);
                    } else {
/* 15 */                int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
/* 23 */                this.f1665m0 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
                    }
                }

                public void setAccessibilityDelegateCompat(c22 c22Var) {
/* 1 */             this.f1634Y0 = c22Var;
/* 3 */             e33.m3318n(this, c22Var);
                }

                public void setAdapter(AbstractC0129g abstractC0129g) {
/* 2 */             setLayoutFrozen(false);
/* 5 */             AbstractC0129g abstractC0129g2 = this.f1631W;
/* 7 */             C0135m c0135m = this.f1636a;
/* 9 */             if (abstractC0129g2 != null) {
/* 13 */                abstractC0129g2.f1748a.unregisterObserver(c0135m);
/* 18 */                this.f1631W.getClass();
                    }
/* 21 */            n12 n12Var = this.f1680z0;
/* 23 */            if (n12Var != null) {
/* 25 */                n12Var.mo5715e();
                    }
/* 28 */            AbstractC0133k abstractC0133k = this.f1637a0;
/* 30 */            C0134l c0134l = this.f1639b;
/* 32 */            if (abstractC0133k != null) {
/* 34 */                abstractC0133k.m999s0(c0134l);
/* 39 */                this.f1637a0.m1000t0(c0134l);
                    }
/* 44 */            c0134l.f1768a.clear();
/* 47 */            c0134l.m1007d();
/* 50 */            C2093q3 c2093q3 = this.f1645d;
/* 56 */            c2093q3.m7691l((ArrayList) c2093q3.f15371c);
/* 63 */            c2093q3.m7691l((ArrayList) c2093q3.f15372d);
/* 66 */            c2093q3.f15369a = 0;
/* 68 */            AbstractC0129g abstractC0129g3 = this.f1631W;
/* 70 */            this.f1631W = abstractC0129g;
/* 72 */            if (abstractC0129g != null) {
/* 76 */                abstractC0129g.f1748a.registerObserver(c0135m);
                    }
/* 79 */            AbstractC0133k abstractC0133k2 = this.f1637a0;
/* 81 */            if (abstractC0133k2 != null) {
/* 83 */                abstractC0133k2.mo916X();
                    }
/* 86 */            AbstractC0129g abstractC0129g4 = this.f1631W;
/* 90 */            c0134l.f1768a.clear();
/* 93 */            c0134l.m1007d();
/* 96 */            t12 t12VarM1006c = c0134l.m1006c();
/* 101 */           if (abstractC0129g3 != null) {
/* 106 */               t12VarM1006c.f16897b--;
                    }
/* 110 */           if (t12VarM1006c.f16897b == 0) {
/* 112 */               SparseArray sparseArray = t12VarM1006c.f16896a;
/* 119 */               for (int i = 0; i < sparseArray.size(); i++) {
/* 129 */                   ((s12) sparseArray.valueAt(i)).f16381a.clear();
                        }
                    }
/* 135 */           if (abstractC0129g4 != null) {
/* 140 */               t12VarM1006c.f16897b++;
                    }
/* 144 */           this.f1624R0.f19442f = true;
/* 146 */           m869W(false);
/* 149 */           requestLayout();
                }

                public void setChildDrawingOrderCallback(k12 k12Var) {
/* 1 */             if (k12Var == null) {
/* 3 */                 return;
                    }
/* 5 */             setChildrenDrawingOrderEnabled(false);
                }

                @Override // android.view.ViewGroup
                public void setClipToPadding(boolean z) {
/* 3 */             if (z != this.f1658i) {
/* 6 */                 this.f1679y0 = null;
/* 8 */                 this.f1677w0 = null;
/* 10 */                this.f1678x0 = null;
/* 12 */                this.f1675v0 = null;
                    }
/* 14 */            this.f1658i = z;
/* 16 */            super.setClipToPadding(z);
/* 21 */            if (this.f1656h0) {
/* 23 */                requestLayout();
                    }
                }

                public void setEdgeEffectFactory(l12 l12Var) {
/* 1 */             l12Var.getClass();
/* 4 */             this.f1673u0 = l12Var;
/* 7 */             this.f1679y0 = null;
/* 9 */             this.f1677w0 = null;
/* 11 */            this.f1678x0 = null;
/* 13 */            this.f1675v0 = null;
                }

                public void setHasFixedSize(boolean z) {
/* 1 */             this.f1654g0 = z;
                }

                public void setItemAnimator(n12 n12Var) {
/* 1 */             n12 n12Var2 = this.f1680z0;
/* 3 */             if (n12Var2 != null) {
/* 5 */                 n12Var2.mo5715e();
/* 11 */                this.f1680z0.f14094a = null;
                    }
/* 13 */            this.f1680z0 = n12Var;
/* 15 */            if (n12Var != null) {
/* 19 */                n12Var.f14094a = this.f1632W0;
                    }
                }

                public void setItemViewCacheSize(int i) {
/* 1 */             C0134l c0134l = this.f1639b;
/* 3 */             c0134l.f1772e = i;
/* 5 */             c0134l.m1014k();
                }

                @Deprecated
                public void setLayoutFrozen(boolean z) {
/* 1 */             suppressLayout(z);
                }

                public void setLayoutManager(AbstractC0133k abstractC0133k) {
                    RecyclerView recyclerView;
                    C0126d c0126d;
/* 3 */             if (abstractC0133k == this.f1637a0) {
/* 5 */                 return;
                    }
/* 7 */             setScrollState(0);
/* 10 */            a22 a22Var = this.f1621O0;
/* 14 */            a22Var.f55i.removeCallbacks(a22Var);
/* 19 */            a22Var.f51c.abortAnimation();
/* 22 */            AbstractC0133k abstractC0133k2 = this.f1637a0;
/* 24 */            if (abstractC0133k2 != null && (c0126d = abstractC0133k2.f1763e) != null) {
/* 30 */                c0126d.m9682d();
                    }
/* 33 */            AbstractC0133k abstractC0133k3 = this.f1637a0;
/* 35 */            C0134l c0134l = this.f1639b;
/* 37 */            if (abstractC0133k3 != null) {
/* 39 */                n12 n12Var = this.f1680z0;
/* 41 */                if (n12Var != null) {
/* 43 */                    n12Var.mo5715e();
                        }
/* 48 */                this.f1637a0.m999s0(c0134l);
/* 53 */                this.f1637a0.m1000t0(c0134l);
/* 58 */                c0134l.f1768a.clear();
/* 61 */                c0134l.m1007d();
/* 66 */                if (this.f1652f0) {
/* 68 */                    AbstractC0133k abstractC0133k4 = this.f1637a0;
/* 70 */                    abstractC0133k4.f1765i = false;
/* 72 */                    abstractC0133k4.mo816Z(this);
                        }
/* 78 */                this.f1637a0.m983E0(null);
/* 81 */                this.f1637a0 = null;
                    } else {
/* 86 */                c0134l.f1768a.clear();
/* 89 */                c0134l.m1007d();
                    }
/* 92 */            C0875ec c0875ec = this.f1648e;
/* 98 */            ((C0193bu) c0875ec.f7614c).m1439g();
/* 103 */           ArrayList arrayList = (ArrayList) c0875ec.f7615d;
/* 110 */           int size = arrayList.size() - 1;
                    while (true) {
/* 117 */               recyclerView = (RecyclerView) ((ts0) c0875ec.f7613b).f17248a;
/* 119 */               if (size < 0) {
                            break;
                        }
/* 127 */               AbstractC0137o abstractC0137oM843J = m843J((View) arrayList.get(size));
/* 131 */               if (abstractC0137oM843J != null) {
/* 133 */                   int i = abstractC0137oM843J.f1793p;
/* 139 */                   if (recyclerView.m860N()) {
/* 141 */                       abstractC0137oM843J.f1794q = i;
/* 145 */                       recyclerView.f1650e1.add(abstractC0137oM843J);
                            } else {
/* 149 */                       View view = abstractC0137oM843J.f1778a;
/* 151 */                       WeakHashMap weakHashMap = e33.f7494a;
/* 153 */                       view.setImportantForAccessibility(i);
                            }
/* 156 */                   abstractC0137oM843J.f1793p = 0;
                        }
/* 158 */               arrayList.remove(size);
/* 161 */               size--;
                    }
/* 164 */           int childCount = recyclerView.getChildCount();
/* 168 */           for (int i2 = 0; i2 < childCount; i2++) {
/* 170 */               View childAt = recyclerView.getChildAt(i2);
/* 174 */               recyclerView.m889o(childAt);
/* 177 */               childAt.clearAnimation();
                    }
/* 183 */           recyclerView.removeAllViews();
/* 186 */           this.f1637a0 = abstractC0133k;
/* 188 */           if (abstractC0133k != null) {
/* 192 */               if (abstractC0133k.f1760b != null) {
/* 215 */                   StringBuilder sb = new StringBuilder("LayoutManager ");
/* 218 */                   sb.append(abstractC0133k);
/* 223 */                   String strM900z = abstractC0133k.f1760b.m900z();
/* 229 */                   sb.append(" is already attached to a RecyclerView:");
/* 232 */                   sb.append(strM900z);
/* 242 */                   throw new IllegalArgumentException(sb.toString());
                        }
/* 194 */               abstractC0133k.m983E0(this);
/* 199 */               if (this.f1652f0) {
/* 201 */                   AbstractC0133k abstractC0133k5 = this.f1637a0;
/* 203 */                   abstractC0133k5.f1765i = true;
/* 205 */                   abstractC0133k5.mo991Y(this);
                        }
                    }
/* 243 */           c0134l.m1014k();
/* 246 */           requestLayout();
                }

                @Override // android.view.ViewGroup
                @Deprecated
                public void setLayoutTransition(LayoutTransition layoutTransition) {
/* 1 */             if (layoutTransition == null) {
/* 4 */                 super.setLayoutTransition(null);
                    } else {
/* 10 */                C1951n4.m6859j("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
                    }
                }

                @Override // android.view.View
                public void setNestedScrollingEnabled(boolean z) {
/* 1 */             om1 scrollingChildHelper = getScrollingChildHelper();
/* 7 */             if (scrollingChildHelper.f14823d) {
/* 9 */                 ViewGroup viewGroup = scrollingChildHelper.f14822c;
/* 11 */                WeakHashMap weakHashMap = e33.f7494a;
/* 13 */                s23.m8388z(viewGroup);
                    }
/* 16 */            scrollingChildHelper.f14823d = z;
                }

                public void setOnFlingListener(q12 q12Var) {
/* 1 */             this.f1615I0 = q12Var;
                }

                @Deprecated
                public void setOnScrollListener(r12 r12Var) {
/* 1 */             this.f1625S0 = r12Var;
                }

                public void setPreserveFocusAfterLayout(boolean z) {
/* 1 */             this.f1620N0 = z;
                }

                public void setRecycledViewPool(t12 t12Var) {
/* 1 */             C0134l c0134l = this.f1639b;
/* 3 */             t12 t12Var2 = c0134l.f1774g;
/* 5 */             if (t12Var2 != null) {
/* 11 */                t12Var2.f16897b--;
                    }
/* 13 */            c0134l.f1774g = t12Var;
/* 15 */            if (t12Var == null || c0134l.f1775h.getAdapter() == null) {
/* 33 */                return;
                    }
/* 31 */            c0134l.f1774g.f16897b++;
                }

                @Deprecated
                public void setRecyclerListener(u12 u12Var) {
                }

                public void setScrollState(int i) {
                    C0126d c0126d;
/* 3 */             if (i == this.f1607A0) {
/* 74 */                return;
                    }
/* 6 */             this.f1607A0 = i;
/* 9 */             if (i != 2) {
/* 11 */                a22 a22Var = this.f1621O0;
/* 15 */                a22Var.f55i.removeCallbacks(a22Var);
/* 20 */                a22Var.f51c.abortAnimation();
/* 23 */                AbstractC0133k abstractC0133k = this.f1637a0;
/* 25 */                if (abstractC0133k != null && (c0126d = abstractC0133k.f1763e) != null) {
/* 31 */                    c0126d.m9682d();
                        }
                    }
/* 34 */            AbstractC0133k abstractC0133k2 = this.f1637a0;
/* 36 */            if (abstractC0133k2 != null) {
/* 38 */                abstractC0133k2.mo931p0(i);
                    }
/* 41 */            r12 r12Var = this.f1625S0;
/* 43 */            if (r12Var != null) {
/* 45 */                r12Var.mo2309a(this, i);
                    }
/* 48 */            ArrayList arrayList = this.f1626T0;
/* 50 */            if (arrayList != null) {
/* 58 */                for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 68 */                    ((r12) this.f1626T0.get(size)).mo2309a(this, i);
                        }
                    }
                }

                public void setScrollingTouchSlop(int i) {
/* 5 */             ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
/* 9 */             if (i != 0) {
/* 12 */                if (i == 1) {
/* 43 */                    this.f1614H0 = viewConfiguration.getScaledPagingTouchSlop();
/* 45 */                    return;
                        }
/* 35 */                AbstractC1245n0.m4889q("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
                    }
/* 50 */            this.f1614H0 = viewConfiguration.getScaledTouchSlop();
                }

                public void setViewCacheExtension(z12 z12Var) {
/* 3 */             this.f1639b.getClass();
                }

                @Override // android.view.View
                public final boolean startNestedScroll(int i) {
/* 6 */             return getScrollingChildHelper().m7214g(i, 0);
                }

                @Override // android.view.View
                public final void stopNestedScroll() {
/* 6 */             getScrollingChildHelper().m7215h(0);
                }

                @Override // android.view.ViewGroup
                public final void suppressLayout(boolean z) {
                    C0126d c0126d;
/* 3 */             if (z != this.f1663k0) {
/* 7 */                 m884i("Do not suppressLayout in layout or scroll");
/* 11 */                if (!z) {
/* 13 */                    this.f1663k0 = false;
/* 17 */                    if (this.f1661j0 && this.f1637a0 != null && this.f1631W != null) {
/* 27 */                        requestLayout();
                            }
/* 30 */                    this.f1661j0 = false;
/* 32 */                    return;
                        }
/* 33 */                long jUptimeMillis = SystemClock.uptimeMillis();
/* 46 */                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
/* 50 */                this.f1663k0 = true;
/* 52 */                this.f1664l0 = true;
/* 54 */                setScrollState(0);
/* 57 */                a22 a22Var = this.f1621O0;
/* 61 */                a22Var.f55i.removeCallbacks(a22Var);
/* 66 */                a22Var.f51c.abortAnimation();
/* 69 */                AbstractC0133k abstractC0133k = this.f1637a0;
/* 71 */                if (abstractC0133k == null || (c0126d = abstractC0133k.f1763e) == null) {
/* 80 */                    return;
                        }
/* 77 */                c0126d.m9682d();
                    }
                }

                /* JADX INFO: renamed from: t */
                public final void m894t(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
/* 5 */             getScrollingChildHelper().m7211d(i, i2, i3, i4, iArr, i5, iArr2);
                }

                /* JADX INFO: renamed from: u */
                public final void m895u(int i, int i2) {
/* 5 */             this.f1672t0++;
/* 7 */             int scrollX = getScrollX();
/* 11 */            int scrollY = getScrollY();
/* 19 */            onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
/* 22 */            r12 r12Var = this.f1625S0;
/* 24 */            if (r12Var != null) {
/* 26 */                r12Var.mo2310b(this, i, i2);
                    }
/* 29 */            ArrayList arrayList = this.f1626T0;
/* 31 */            if (arrayList != null) {
/* 39 */                for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 49 */                    ((r12) this.f1626T0.get(size)).mo2310b(this, i, i2);
                        }
                    }
/* 59 */            this.f1672t0--;
                }

                /* JADX INFO: renamed from: v */
                public final void m896v() {
/* 3 */             if (this.f1679y0 != null) {
/* 5 */                 return;
                    }
/* 8 */             this.f1673u0.getClass();
/* 17 */            EdgeEffect edgeEffect = new EdgeEffect(getContext());
/* 20 */            this.f1679y0 = edgeEffect;
/* 24 */            if (this.f1658i) {
/* 54 */                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                    } else {
/* 66 */                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
                    }
                }

                /* JADX INFO: renamed from: w */
                public final void m897w() {
/* 3 */             if (this.f1675v0 != null) {
/* 5 */                 return;
                    }
/* 8 */             this.f1673u0.getClass();
/* 17 */            EdgeEffect edgeEffect = new EdgeEffect(getContext());
/* 20 */            this.f1675v0 = edgeEffect;
/* 24 */            if (this.f1658i) {
/* 54 */                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                    } else {
/* 66 */                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
                    }
                }

                /* JADX INFO: renamed from: x */
                public final void m898x() {
/* 3 */             if (this.f1678x0 != null) {
/* 5 */                 return;
                    }
/* 8 */             this.f1673u0.getClass();
/* 17 */            EdgeEffect edgeEffect = new EdgeEffect(getContext());
/* 20 */            this.f1678x0 = edgeEffect;
/* 24 */            if (this.f1658i) {
/* 54 */                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                    } else {
/* 66 */                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
                    }
                }

                /* JADX INFO: renamed from: y */
                public final void m899y() {
/* 3 */             if (this.f1677w0 != null) {
/* 5 */                 return;
                    }
/* 8 */             this.f1673u0.getClass();
/* 17 */            EdgeEffect edgeEffect = new EdgeEffect(getContext());
/* 20 */            this.f1677w0 = edgeEffect;
/* 24 */            if (this.f1658i) {
/* 54 */                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                    } else {
/* 66 */                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
                    }
                }

                /* JADX INFO: renamed from: z */
                public final String m900z() {
/* 47 */            return " " + super.toString() + ", adapter:" + this.f1631W + ", layout:" + this.f1637a0 + ", context:" + getContext();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 16 */        public static class LayoutParams extends ViewGroup.MarginLayoutParams {

                    /* JADX INFO: renamed from: a */
                    public AbstractC0137o f1681a;

                    /* JADX INFO: renamed from: b */
                    public final Rect f1682b;

                    /* JADX INFO: renamed from: c */
                    public boolean f1683c;

                    /* JADX INFO: renamed from: d */
                    public boolean f1684d;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 9 */                 this.f1682b = new Rect();
/* 12 */                this.f1683c = true;
/* 15 */                this.f1684d = false;
                    }

/* 17 */            public LayoutParams(int i, int i2) {
/* 18 */                super(i, i2);
/* 19 */                this.f1682b = new Rect();
/* 20 */                this.f1683c = true;
/* 21 */                this.f1684d = false;
                    }

/* 21 */            public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
/* 22 */                super(marginLayoutParams);
/* 23 */                this.f1682b = new Rect();
/* 24 */                this.f1683c = true;
/* 25 */                this.f1684d = false;
                    }

/* 25 */            public LayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 26 */                super(layoutParams);
/* 27 */                this.f1682b = new Rect();
/* 28 */                this.f1683c = true;
/* 29 */                this.f1684d = false;
                    }

/* 29 */            public LayoutParams(LayoutParams layoutParams) {
/* 30 */                super((ViewGroup.LayoutParams) layoutParams);
/* 31 */                this.f1682b = new Rect();
/* 32 */                this.f1683c = true;
/* 33 */                this.f1684d = false;
                    }
                }

                @Override // android.view.ViewGroup
/* 28 */        public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 29 */            AbstractC0133k abstractC0133k = this.f1637a0;
                    if (abstractC0133k != null) {
/* 30 */                return abstractC0133k.mo765E(layoutParams);
                    }
/* 31 */            f42.m3656l("RecyclerView has no LayoutManager".concat(m900z()));
                    return null;
                }

/* 902 */       public RecyclerView(Context context, AttributeSet attributeSet) {
/* 903 */           this(context, attributeSet, C0122R.attr.recyclerViewStyle);
                }
            }
