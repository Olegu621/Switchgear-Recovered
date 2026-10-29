            package androidx.coordinatorlayout.widget;

            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.SystemClock;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import android.view.Gravity;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.coordinatorlayout.R$attr;
            import androidx.coordinatorlayout.R$style;
            import androidx.coordinatorlayout.R$styleable;
            import androidx.customview.view.AbsSavedState;
            import io.flutter.plugin.platform.PlatformPlugin;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.WeakHashMap;
            import p000.e33;
            import p000.f42;
            import p000.k10;
            import p000.l10;
            import p000.le2;
            import p000.m83;
            import p000.o33;
            import p000.ot1;
            import p000.pm1;
            import p000.q23;
            import p000.qc3;
            import p000.qm1;
            import p000.ra2;
            import p000.rm1;
            import p000.s23;
            import p000.t90;
            import p000.v00;
            import p000.wa3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 29 */    public class CoordinatorLayout extends ViewGroup implements pm1, qm1 {

                /* JADX INFO: renamed from: h0 */
                public static final String f1193h0;

                /* JADX INFO: renamed from: i0 */
                public static final Class[] f1194i0;

                /* JADX INFO: renamed from: j0 */
                public static final ThreadLocal f1195j0;

                /* JADX INFO: renamed from: k0 */
                public static final wa3 f1196k0;

                /* JADX INFO: renamed from: l0 */
                public static final ot1 f1197l0;

                /* JADX INFO: renamed from: U */
                public View f1198U;

                /* JADX INFO: renamed from: V */
                public View f1199V;

                /* JADX INFO: renamed from: W */
                public l10 f1200W;

                /* JADX INFO: renamed from: a */
                public final ArrayList f1201a;

                /* JADX INFO: renamed from: a0 */
                public boolean f1202a0;

                /* JADX INFO: renamed from: b */
                public final ra2 f1203b;

                /* JADX INFO: renamed from: b0 */
                public m83 f1204b0;

                /* JADX INFO: renamed from: c */
                public final ArrayList f1205c;

                /* JADX INFO: renamed from: c0 */
                public boolean f1206c0;

                /* JADX INFO: renamed from: d */
                public final ArrayList f1207d;

                /* JADX INFO: renamed from: d0 */
                public Drawable f1208d0;

                /* JADX INFO: renamed from: e */
                public final int[] f1209e;

                /* JADX INFO: renamed from: e0 */
                public ViewGroup.OnHierarchyChangeListener f1210e0;

                /* JADX INFO: renamed from: f */
                public final int[] f1211f;

                /* JADX INFO: renamed from: f0 */
                public qc3 f1212f0;

                /* JADX INFO: renamed from: g0 */
                public final rm1 f1213g0;

                /* JADX INFO: renamed from: i */
                public boolean f1214i;

                /* JADX INFO: renamed from: v */
                public boolean f1215v;

                /* JADX INFO: renamed from: w */
                public final int[] f1216w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Behavior<V extends View> {
                    public Behavior(Context context, AttributeSet attributeSet) {
                    }

                    /* JADX INFO: renamed from: a */
                    public boolean mo563a(Rect rect, View view) {
/* 1 */                 return false;
                    }

                    /* JADX INFO: renamed from: b */
                    public boolean mo564b(View view, View view2) {
/* 1 */                 return false;
                    }

                    /* JADX INFO: renamed from: c */
                    public void mo565c(C0080c c0080c) {
                    }

                    /* JADX INFO: renamed from: d */
                    public boolean mo566d(CoordinatorLayout coordinatorLayout, View view, View view2) {
/* 1 */                 return false;
                    }

                    /* JADX INFO: renamed from: e */
                    public void mo567e(CoordinatorLayout coordinatorLayout, View view) {
                    }

                    /* JADX INFO: renamed from: f */
                    public void mo568f() {
                    }

                    /* JADX INFO: renamed from: g */
                    public boolean mo569g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
/* 1 */                 return false;
                    }

                    /* JADX INFO: renamed from: h */
                    public boolean mo570h(CoordinatorLayout coordinatorLayout, View view, int i) {
/* 1 */                 return false;
                    }

                    /* JADX INFO: renamed from: i */
                    public boolean mo571i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
/* 1 */                 return false;
                    }

                    /* JADX INFO: renamed from: j */
                    public boolean mo572j(View view) {
/* 1 */                 return false;
                    }

                    /* JADX INFO: renamed from: k */
                    public void mo573k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
                    }

                    /* JADX INFO: renamed from: l */
                    public void mo574l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
/* 5 */                 iArr[0] = iArr[0] + i2;
/* 11 */                iArr[1] = iArr[1] + i3;
                    }

                    /* JADX INFO: renamed from: m */
                    public boolean mo575m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
/* 1 */                 return false;
                    }

                    /* JADX INFO: renamed from: n */
                    public void mo576n(View view, Parcelable parcelable) {
                    }

                    /* JADX INFO: renamed from: o */
                    public Parcelable mo577o(View view) {
/* 1 */                 return View.BaseSavedState.EMPTY_STATE;
                    }

                    /* JADX INFO: renamed from: p */
                    public boolean mo578p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
/* 1 */                 return false;
                    }

                    /* JADX INFO: renamed from: q */
                    public void mo579q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
                    }

                    /* JADX INFO: renamed from: r */
                    public boolean mo580r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
/* 1 */                 return false;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends AbsSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0081d();

                    /* JADX INFO: renamed from: c */
                    public SparseArray f1217c;

                    public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */                 super(parcel, classLoader);
/* 4 */                 int i = parcel.readInt();
/* 8 */                 int[] iArr = new int[i];
/* 10 */                parcel.readIntArray(iArr);
/* 13 */                Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
/* 22 */                this.f1217c = new SparseArray(i);
/* 25 */                for (int i2 = 0; i2 < i; i2++) {
/* 33 */                    this.f1217c.append(iArr[i2], parcelableArray[i2]);
                        }
                    }

                    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 4 */                 SparseArray sparseArray = this.f1217c;
/* 14 */                int size = sparseArray != null ? sparseArray.size() : 0;
/* 15 */                parcel.writeInt(size);
/* 18 */                int[] iArr = new int[size];
/* 20 */                Parcelable[] parcelableArr = new Parcelable[size];
/* 22 */                for (int i2 = 0; i2 < size; i2++) {
/* 30 */                    iArr[i2] = this.f1217c.keyAt(i2);
/* 40 */                    parcelableArr[i2] = (Parcelable) this.f1217c.valueAt(i2);
                        }
/* 45 */                parcel.writeIntArray(iArr);
/* 48 */                parcel.writeParcelableArray(parcelableArr, i);
                    }
                }

                static {
/* 3 */             Package r0 = CoordinatorLayout.class.getPackage();
/* 15 */            f1193h0 = r0 != null ? r0.getName() : null;
/* 23 */            f1196k0 = new wa3(4);
/* 33 */            f1194i0 = new Class[]{Context.class, AttributeSet.class};
/* 40 */            f1195j0 = new ThreadLocal();
/* 49 */            f1197l0 = new ot1(12);
                }

                public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
                    CoordinatorLayout coordinatorLayout;
                    Context context2;
/* 1 */             super(context, attributeSet, i);
/* 9 */             this.f1201a = new ArrayList();
/* 17 */            this.f1203b = new ra2(7);
/* 24 */            this.f1205c = new ArrayList();
/* 31 */            this.f1207d = new ArrayList();
/* 36 */            this.f1209e = new int[2];
/* 40 */            this.f1211f = new int[2];
/* 47 */            this.f1213g0 = new rm1();
/* 64 */            TypedArray typedArrayObtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, 0, R$style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, i, 0);
/* 73 */            if (Build.VERSION.SDK_INT < 29) {
/* 98 */                coordinatorLayout = this;
/* 99 */                context2 = context;
                    } else if (i == 0) {
/* 81 */                coordinatorLayout = this;
/* 82 */                context2 = context;
/* 8 */                 coordinatorLayout.saveAttributeDataForStyleable(context2, R$styleable.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, R$style.Widget_Support_CoordinatorLayout);
                    } else {
/* 88 */                coordinatorLayout = this;
/* 89 */                context2 = context;
/* 8 */                 coordinatorLayout.saveAttributeDataForStyleable(context2, R$styleable.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i, 0);
                    }
/* 102 */           int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CoordinatorLayout_keylines, 0);
/* 106 */           if (resourceId != 0) {
/* 108 */               Resources resources = context2.getResources();
/* 112 */               int[] intArray = resources.getIntArray(resourceId);
/* 116 */               coordinatorLayout.f1216w = intArray;
/* 122 */               float f = resources.getDisplayMetrics().density;
/* 124 */               int length = intArray.length;
/* 125 */               for (int i2 = 0; i2 < length; i2++) {
/* 127 */                   int[] iArr = coordinatorLayout.f1216w;
/* 134 */                   iArr[i2] = (int) (iArr[i2] * f);
                        }
                    }
/* 145 */           coordinatorLayout.f1208d0 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.CoordinatorLayout_statusBarBackground);
/* 147 */           typedArrayObtainStyledAttributes.recycle();
/* 150 */           coordinatorLayout.m562w();
/* 158 */           super.setOnHierarchyChangeListener(new k10(coordinatorLayout));
/* 161 */           WeakHashMap weakHashMap = e33.f7494a;
/* 167 */           if (coordinatorLayout.getImportantForAccessibility() == 0) {
/* 170 */               coordinatorLayout.setImportantForAccessibility(1);
                    }
                }

                /* JADX INFO: renamed from: e */
                public static Rect m544e() {
/* 7 */             Rect rect = (Rect) f1197l0.mo7042a();
                    return rect == null ? new Rect() : rect;
                }

                /* JADX INFO: renamed from: k */
                public static void m545k(int i, Rect rect, Rect rect2, C0080c c0080c, int i2, int i3) {
                    int iWidth;
                    int iHeight;
/* 1 */             int i4 = c0080c.f1220c;
/* 3 */             if (i4 == 0) {
/* 5 */                 i4 = 17;
                    }
/* 7 */             int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
/* 11 */            int i5 = c0080c.f1221d;
/* 15 */            if ((i5 & 7) == 0) {
/* 20 */                i5 |= 8388611;
                    }
/* 23 */            if ((i5 & 112) == 0) {
/* 25 */                i5 |= 48;
                    }
/* 27 */            int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
/* 31 */            int i6 = absoluteGravity & 7;
/* 33 */            int i7 = absoluteGravity & 112;
/* 35 */            int i8 = absoluteGravity2 & 7;
/* 37 */            int i9 = absoluteGravity2 & 112;
/* 41 */            if (i8 != 1) {
/* 48 */                iWidth = i8 != 5 ? rect.left : rect.right;
                    } else {
/* 59 */                iWidth = rect.left + (rect.width() / 2);
                    }
/* 64 */            if (i9 != 16) {
/* 71 */                iHeight = i9 != 80 ? rect.top : rect.bottom;
                    } else {
/* 82 */                iHeight = rect.top + (rect.height() / 2);
                    }
/* 83 */            if (i6 == 1) {
/* 91 */                iWidth -= i2 / 2;
                    } else if (i6 != 5) {
/* 87 */                iWidth -= i2;
                    }
/* 92 */            if (i7 == 16) {
/* 100 */               iHeight -= i3 / 2;
                    } else if (i7 != 80) {
/* 96 */                iHeight -= i3;
                    }
/* 103 */           rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: m */
                public static C0080c m546m(View view) {
/* 5 */             C0080c c0080c = (C0080c) view.getLayoutParams();
/* 9 */             if (!c0080c.f1219b) {
/* 16 */                if (view instanceof InterfaceC0078a) {
/* 20 */                    Behavior behavior = ((InterfaceC0078a) view).getBehavior();
/* 24 */                    if (behavior == null) {
/* 28 */                        AbstractC1245n0.m4876d("CoordinatorLayout", "Attached behavior class is null");
                            }
/* 31 */                    c0080c.m582b(behavior);
/* 34 */                    c0080c.f1219b = true;
/* 36 */                    return c0080c;
                        }
/* 42 */                InterfaceC0079b interfaceC0079b = null;
/* 43 */                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
/* 51 */                    interfaceC0079b = (InterfaceC0079b) superclass.getAnnotation(InterfaceC0079b.class);
/* 53 */                    if (interfaceC0079b != null) {
                                break;
                            }
                        }
/* 60 */                if (interfaceC0079b != null) {
                            try {
/* 76 */                        c0080c.m582b((Behavior) interfaceC0079b.value().getDeclaredConstructor(null).newInstance(null));
                            } catch (Exception e) {
/* 108 */                       AbstractC1245n0.m4877e("CoordinatorLayout", "Default behavior class " + interfaceC0079b.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                            }
                        }
/* 111 */               c0080c.f1219b = true;
                    }
/* 113 */           return c0080c;
                }

                /* JADX INFO: renamed from: u */
                public static void m547u(int i, View view) {
/* 5 */             C0080c c0080c = (C0080c) view.getLayoutParams();
/* 7 */             int i2 = c0080c.f1226i;
/* 9 */             if (i2 != i) {
/* 13 */                WeakHashMap weakHashMap = e33.f7494a;
/* 15 */                view.offsetLeftAndRight(i - i2);
/* 18 */                c0080c.f1226i = i;
                    }
                }

                /* JADX INFO: renamed from: v */
                public static void m548v(int i, View view) {
/* 5 */             C0080c c0080c = (C0080c) view.getLayoutParams();
/* 7 */             int i2 = c0080c.f1227j;
/* 9 */             if (i2 != i) {
/* 13 */                WeakHashMap weakHashMap = e33.f7494a;
/* 15 */                view.offsetTopAndBottom(i - i2);
/* 18 */                c0080c.f1227j = i;
                    }
                }

                @Override // android.view.ViewGroup
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
                    return (layoutParams instanceof C0080c) && super.checkLayoutParams(layoutParams);
                }

                @Override // android.view.ViewGroup
                public final boolean drawChild(Canvas canvas, View view, long j) {
/* 7 */             Behavior behavior = ((C0080c) view.getLayoutParams()).f1218a;
/* 9 */             if (behavior != null) {
/* 11 */                behavior.getClass();
                    }
/* 14 */            return super.drawChild(canvas, view, j);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             int[] drawableState = getDrawableState();
/* 8 */             Drawable drawable = this.f1208d0;
/* 24 */            if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
/* 26 */                invalidate();
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m549f(C0080c c0080c, Rect rect, int i, int i2) {
/* 1 */             int width = getWidth();
/* 5 */             int height = getHeight();
/* 31 */            int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0080c).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0080c).rightMargin));
/* 57 */            int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0080c).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0080c).bottomMargin));
/* 63 */            rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
                }

                /* JADX INFO: renamed from: g */
                public final void m550g(View view) {
/* 12 */            List list = (List) ((le2) this.f1203b.f15956b).getOrDefault(view, null);
/* 14 */            if (list == null || list.isEmpty()) {
/* 51 */                return;
                    }
/* 27 */            for (int i = 0; i < list.size(); i++) {
/* 33 */                View view2 = (View) list.get(i);
/* 41 */                Behavior behavior = ((C0080c) view2.getLayoutParams()).f1218a;
/* 43 */                if (behavior != null) {
/* 45 */                    behavior.mo566d(this, view2, view);
                        }
                    }
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 4 */             return new C0080c(-2, -2);
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 3 */             if (layoutParams instanceof C0080c) {
/* 9 */                 return new C0080c((C0080c) layoutParams);
                    }
                    return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0080c((ViewGroup.MarginLayoutParams) layoutParams) : new C0080c(layoutParams);
                }

                public final List<View> getDependencySortedChildren() {
/* 1 */             m560s();
/* 6 */             return Collections.unmodifiableList(this.f1201a);
                }

                public final m83 getLastWindowInsets() {
/* 1 */             return this.f1204b0;
                }

                @Override // android.view.ViewGroup
                public int getNestedScrollAxes() {
/* 1 */             rm1 rm1Var = this.f1213g0;
/* 7 */             return rm1Var.f16182b | rm1Var.f16181a;
                }

                public Drawable getStatusBarBackground() {
/* 1 */             return this.f1208d0;
                }

                @Override // android.view.View
                public int getSuggestedMinimumHeight() {
/* 14 */            return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
                }

                @Override // android.view.View
                public int getSuggestedMinimumWidth() {
/* 14 */            return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
                }

                /* JADX INFO: renamed from: h */
                public final void m551h(View view, Rect rect, boolean z) {
/* 5 */             if (view.isLayoutRequested() || view.getVisibility() == 8) {
/* 42 */                rect.setEmpty();
                    } else if (z) {
/* 18 */                m553j(rect, view);
                    } else {
/* 38 */                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    }
                }

                /* JADX INFO: renamed from: i */
                public final ArrayList m552i(View view) {
/* 5 */             le2 le2Var = (le2) this.f1203b.f15956b;
/* 7 */             int i = le2Var.f13213c;
/* 9 */             ArrayList arrayList = null;
/* 11 */            for (int i2 = 0; i2 < i; i2++) {
/* 17 */                ArrayList arrayList2 = (ArrayList) le2Var.m6430j(i2);
/* 19 */                if (arrayList2 != null && arrayList2.contains(view)) {
/* 27 */                    if (arrayList == null) {
/* 31 */                        arrayList = new ArrayList();
                            }
/* 38 */                    arrayList.add(le2Var.m6428h(i2));
                        }
                    }
/* 44 */            ArrayList arrayList3 = this.f1207d;
/* 46 */            arrayList3.clear();
/* 49 */            if (arrayList != null) {
/* 51 */                arrayList3.addAll(arrayList);
                    }
/* 54 */            return arrayList3;
                }

                /* JADX INFO: renamed from: j */
                public final void m553j(Rect rect, View view) {
/* 1 */             ThreadLocal threadLocal = o33.f14605a;
/* 12 */            rect.set(0, 0, view.getWidth(), view.getHeight());
/* 15 */            ThreadLocal threadLocal2 = o33.f14605a;
/* 21 */            Matrix matrix = (Matrix) threadLocal2.get();
/* 23 */            if (matrix == null) {
/* 27 */                matrix = new Matrix();
/* 30 */                threadLocal2.set(matrix);
                    } else {
/* 34 */                matrix.reset();
                    }
/* 37 */            o33.m7097a(this, view, matrix);
/* 40 */            ThreadLocal threadLocal3 = o33.f14606b;
/* 46 */            RectF rectF = (RectF) threadLocal3.get();
/* 48 */            if (rectF == null) {
/* 52 */                rectF = new RectF();
/* 55 */                threadLocal3.set(rectF);
                    }
/* 58 */            rectF.set(rect);
/* 61 */            matrix.mapRect(rectF);
/* 82 */            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
                }

                /* JADX INFO: renamed from: l */
                public final int m554l(int i) {
/* 4 */             int[] iArr = this.f1216w;
/* 6 */             if (iArr == null) {
/* 30 */                AbstractC1245n0.m4876d("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
/* 1 */                 return 0;
                    }
/* 34 */            if (i >= 0 && i < iArr.length) {
/* 40 */                return iArr[i];
                    }
/* 65 */            AbstractC1245n0.m4876d("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
/* 1 */             return 0;
                }

                /* JADX INFO: renamed from: n */
                public final boolean m555n(View view, int i, int i2) {
/* 1 */             ot1 ot1Var = f1197l0;
/* 3 */             Rect rectM544e = m544e();
/* 7 */             m553j(rectM544e, view);
                    try {
/* 10 */                return rectM544e.contains(i, i2);
                    } finally {
/* 22 */                rectM544e.setEmpty();
/* 25 */                ot1Var.mo7044c(rectM544e);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:34:0x00de  */
                /* JADX INFO: renamed from: o */
                public final void m556o(int i) {
                    int i2;
                    Rect rect;
                    int i3;
                    ArrayList arrayList;
                    boolean zMo566d;
                    boolean z;
                    boolean z2;
                    int width;
                    int i4;
                    int i5;
                    int i6;
                    int height;
                    int i7;
                    int i8;
                    int i9;
                    C0080c c0080c;
                    int i10;
                    View view;
                    Behavior behavior;
/* 5 */             WeakHashMap weakHashMap = e33.f7494a;
/* 7 */             int layoutDirection = getLayoutDirection();
/* 11 */            ArrayList arrayList2 = this.f1201a;
/* 13 */            int size = arrayList2.size();
/* 17 */            Rect rectM544e = m544e();
/* 21 */            Rect rectM544e2 = m544e();
/* 25 */            Rect rectM544e3 = m544e();
/* 29 */            int i11 = 0;
                    while (true) {
/* 30 */                ot1 ot1Var = f1197l0;
/* 32 */                if (i11 >= size) {
/* 736 */                   Rect rect2 = rectM544e3;
/* 737 */                   rectM544e.setEmpty();
/* 740 */                   ot1Var.mo7044c(rectM544e);
/* 743 */                   rectM544e2.setEmpty();
/* 746 */                   ot1Var.mo7044c(rectM544e2);
/* 749 */                   rect2.setEmpty();
/* 752 */                   ot1Var.mo7044c(rect2);
/* 755 */                   return;
                        }
/* 38 */                View view2 = (View) arrayList2.get(i11);
/* 44 */                C0080c c0080c2 = (C0080c) view2.getLayoutParams();
/* 46 */                if (i != 0 || view2.getVisibility() != 8) {
/* 64 */                    int i12 = 0;
/* 65 */                    while (i12 < i11) {
/* 75 */                        if (c0080c2.f1229l == ((View) arrayList2.get(i12))) {
/* 81 */                            C0080c c0080c3 = (C0080c) view2.getLayoutParams();
/* 85 */                            if (c0080c3.f1228k != null) {
/* 87 */                                Rect rectM544e4 = m544e();
/* 91 */                                Rect rectM544e5 = m544e();
/* 95 */                                C0080c c0080c4 = c0080c2;
/* 97 */                                Rect rectM544e6 = m544e();
/* 105 */                               m553j(rectM544e4, c0080c3.f1228k);
/* 109 */                               m551h(view2, rectM544e5, false);
/* 114 */                               int measuredWidth = view2.getMeasuredWidth();
/* 118 */                               View view3 = view2;
/* 121 */                               int measuredHeight = view3.getMeasuredHeight();
/* 129 */                               c0080c = c0080c4;
/* 133 */                               i10 = i12;
/* 135 */                               layoutDirection = layoutDirection;
/* 139 */                               view = view3;
/* 141 */                               m545k(layoutDirection, rectM544e4, rectM544e6, c0080c3, measuredWidth, measuredHeight);
/* 164 */                               boolean z3 = (rectM544e6.left == rectM544e5.left && rectM544e6.top == rectM544e5.top) ? false : true;
/* 166 */                               m549f(c0080c3, rectM544e6, measuredWidth, measuredHeight);
/* 173 */                               int i13 = rectM544e6.left - rectM544e5.left;
/* 178 */                               int i14 = rectM544e6.top - rectM544e5.top;
/* 179 */                               if (i13 != 0) {
/* 181 */                                   WeakHashMap weakHashMap2 = e33.f7494a;
/* 183 */                                   view.offsetLeftAndRight(i13);
                                        }
/* 186 */                               if (i14 != 0) {
/* 188 */                                   WeakHashMap weakHashMap3 = e33.f7494a;
/* 190 */                                   view.offsetTopAndBottom(i14);
                                        }
/* 193 */                               if (z3 && (behavior = c0080c3.f1218a) != null) {
/* 201 */                                   behavior.mo566d(this, view, c0080c3.f1228k);
                                        }
/* 204 */                               rectM544e4.setEmpty();
/* 207 */                               ot1Var.mo7044c(rectM544e4);
/* 210 */                               rectM544e5.setEmpty();
/* 213 */                               ot1Var.mo7044c(rectM544e5);
/* 216 */                               rectM544e6.setEmpty();
/* 219 */                               ot1Var.mo7044c(rectM544e6);
                                    } else {
/* 225 */                               c0080c = c0080c2;
/* 226 */                               i10 = i12;
/* 234 */                               view = view2;
                                    }
                                } else {
/* 225 */                           c0080c = c0080c2;
/* 226 */                           i10 = i12;
/* 234 */                           view = view2;
                                }
/* 235 */                       i12 = i10 + 1;
/* 237 */                       c0080c2 = c0080c;
/* 238 */                       view2 = view;
/* 239 */                       arrayList2 = arrayList2;
/* 241 */                       size = size;
/* 243 */                       i11 = i11;
/* 245 */                       rectM544e3 = rectM544e3;
                            }
/* 249 */                   ArrayList arrayList3 = arrayList2;
/* 251 */                   C0080c c0080c5 = c0080c2;
/* 252 */                   int i15 = size;
/* 254 */                   Rect rect3 = rectM544e3;
/* 256 */                   i2 = i11;
/* 258 */                   View view4 = view2;
/* 260 */                   m551h(view4, rectM544e2, true);
/* 271 */                   if (c0080c5.f1224g != 0 && !rectM544e2.isEmpty()) {
/* 281 */                       int absoluteGravity = Gravity.getAbsoluteGravity(c0080c5.f1224g, layoutDirection);
/* 285 */                       int i16 = absoluteGravity & 112;
/* 287 */                       if (i16 == 48) {
/* 316 */                           rectM544e.top = Math.max(rectM544e.top, rectM544e2.bottom);
                                } else if (i16 == 80) {
/* 305 */                           rectM544e.bottom = Math.max(rectM544e.bottom, getHeight() - rectM544e2.top);
                                }
/* 318 */                       int i17 = absoluteGravity & 7;
/* 320 */                       if (i17 == 3) {
/* 349 */                           rectM544e.left = Math.max(rectM544e.left, rectM544e2.right);
                                } else if (i17 == 5) {
/* 338 */                           rectM544e.right = Math.max(rectM544e.right, getWidth() - rectM544e2.left);
                                }
                            }
/* 353 */                   if (c0080c5.f1225h != 0 && view4.getVisibility() == 0) {
/* 361 */                       WeakHashMap weakHashMap4 = e33.f7494a;
/* 367 */                       if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
/* 389 */                           C0080c c0080c6 = (C0080c) view4.getLayoutParams();
/* 391 */                           Behavior behavior2 = c0080c6.f1218a;
/* 393 */                           Rect rectM544e7 = m544e();
/* 397 */                           Rect rectM544e8 = m544e();
/* 417 */                           rectM544e8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
/* 420 */                           if (behavior2 == null || !behavior2.mo563a(rectM544e7, view4)) {
/* 471 */                               rectM544e7.set(rectM544e8);
                                    } else if (!rectM544e8.contains(rectM544e7)) {
/* 470 */                               throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM544e7.toShortString() + " | Bounds:" + rectM544e8.toShortString());
                                    }
/* 474 */                           rectM544e8.setEmpty();
/* 477 */                           ot1Var.mo7044c(rectM544e8);
/* 484 */                           if (rectM544e7.isEmpty()) {
/* 486 */                               rectM544e7.setEmpty();
/* 489 */                               ot1Var.mo7044c(rectM544e7);
                                    } else {
/* 496 */                               int absoluteGravity2 = Gravity.getAbsoluteGravity(c0080c6.f1225h, layoutDirection);
/* 502 */                               if ((absoluteGravity2 & 48) != 48 || (i8 = (rectM544e7.top - ((ViewGroup.MarginLayoutParams) c0080c6).topMargin) - c0080c6.f1227j) >= (i9 = rectM544e.top)) {
/* 522 */                                   z = false;
                                        } else {
/* 517 */                                   m548v(i9 - i8, view4);
/* 520 */                                   z = true;
                                        }
/* 527 */                               if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM544e7.bottom) - ((ViewGroup.MarginLayoutParams) c0080c6).bottomMargin) + c0080c6.f1227j) < (i7 = rectM544e.bottom)) {
/* 547 */                                   m548v(height - i7, view4);
/* 550 */                                   z = true;
                                        }
/* 551 */                               if (!z) {
/* 554 */                                   m548v(0, view4);
                                        }
/* 560 */                               if ((absoluteGravity2 & 3) != 3 || (i5 = (rectM544e7.left - ((ViewGroup.MarginLayoutParams) c0080c6).leftMargin) - c0080c6.f1226i) >= (i6 = rectM544e.left)) {
/* 580 */                                   z2 = false;
                                        } else {
/* 575 */                                   m547u(i6 - i5, view4);
/* 578 */                                   z2 = true;
                                        }
/* 584 */                               if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM544e7.right) - ((ViewGroup.MarginLayoutParams) c0080c6).rightMargin) + c0080c6.f1226i) < (i4 = rectM544e.right)) {
/* 604 */                                   m547u(width - i4, view4);
/* 607 */                                   z2 = true;
                                        }
/* 608 */                               if (!z2) {
/* 611 */                                   m547u(0, view4);
                                        }
/* 614 */                               rectM544e7.setEmpty();
/* 617 */                               ot1Var.mo7044c(rectM544e7);
                                    }
                                }
                            }
/* 621 */                   if (i != 2) {
/* 631 */                       rect = rect3;
/* 633 */                       rect.set(((C0080c) view4.getLayoutParams()).f1233p);
/* 640 */                       if (rect.equals(rectM544e2)) {
/* 642 */                           arrayList = arrayList3;
/* 644 */                           i3 = i15;
                                } else {
/* 656 */                           ((C0080c) view4.getLayoutParams()).f1233p.set(rectM544e2);
                                }
                            } else {
/* 660 */                       rect = rect3;
                            }
/* 662 */                   int i18 = i2 + 1;
/* 664 */                   i3 = i15;
                            while (true) {
/* 666 */                       arrayList = arrayList3;
/* 668 */                       if (i18 >= i3) {
                                    break;
                                }
/* 674 */                       View view5 = (View) arrayList.get(i18);
/* 680 */                       C0080c c0080c7 = (C0080c) view5.getLayoutParams();
/* 682 */                       Behavior behavior3 = c0080c7.f1218a;
/* 684 */                       if (behavior3 != null && behavior3.mo564b(view5, view4)) {
/* 692 */                           if (i == 0 && c0080c7.f1232o) {
/* 699 */                               c0080c7.f1232o = false;
                                    } else {
/* 704 */                               if (i != 2) {
/* 706 */                                   zMo566d = behavior3.mo566d(this, view5, view4);
                                        } else {
/* 712 */                                   behavior3.mo567e(this, view4);
/* 715 */                                   zMo566d = true;
                                        }
/* 717 */                               if (i == 1) {
/* 719 */                                   c0080c7.f1232o = zMo566d;
                                        }
                                    }
                                }
/* 724 */                       i18++;
/* 726 */                       arrayList3 = arrayList;
                            }
                        } else {
/* 56 */                    arrayList = arrayList2;
/* 57 */                    i3 = size;
/* 58 */                    rect = rectM544e3;
/* 59 */                    i2 = i11;
                        }
/* 729 */               i11 = i2 + 1;
/* 731 */               rectM544e3 = rect;
/* 732 */               size = i3;
/* 733 */               arrayList2 = arrayList;
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             int i = 0;
/* 5 */             m561t(false);
/* 10 */            if (this.f1202a0) {
/* 14 */                if (this.f1200W == null) {
/* 21 */                    this.f1200W = new l10(this, i);
                        }
/* 29 */                getViewTreeObserver().addOnPreDrawListener(this.f1200W);
                    }
/* 34 */            if (this.f1204b0 == null) {
/* 36 */                WeakHashMap weakHashMap = e33.f7494a;
/* 42 */                if (getFitsSystemWindows()) {
/* 44 */                    q23.m7679c(this);
                        }
                    }
/* 48 */            this.f1215v = true;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 5 */             m561t(false);
/* 10 */            if (this.f1202a0 && this.f1200W != null) {
/* 22 */                getViewTreeObserver().removeOnPreDrawListener(this.f1200W);
                    }
/* 25 */            View view = this.f1199V;
/* 27 */            if (view != null) {
/* 29 */                onStopNestedScroll(view, 0);
                    }
/* 32 */            this.f1215v = false;
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
/* 1 */             super.onDraw(canvas);
/* 6 */             if (!this.f1206c0 || this.f1208d0 == null) {
/* 39 */                return;
                    }
/* 12 */            m83 m83Var = this.f1204b0;
/* 22 */            int iM6624d = m83Var != null ? m83Var.m6624d() : 0;
/* 23 */            if (iM6624d > 0) {
/* 31 */                this.f1208d0.setBounds(0, 0, getWidth(), iM6624d);
/* 36 */                this.f1208d0.draw(canvas);
                    }
                }

                @Override // android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 6 */             if (actionMasked == 0) {
/* 8 */                 m561t(true);
                    }
/* 12 */            boolean zM559r = m559r(motionEvent, 0);
/* 16 */            if (actionMasked != 1 && actionMasked != 3) {
/* 22 */                return zM559r;
                    }
/* 23 */            m561t(true);
/* 26 */            return zM559r;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    Behavior behavior;
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 3 */             int layoutDirection = getLayoutDirection();
/* 7 */             ArrayList arrayList = this.f1201a;
/* 9 */             int size = arrayList.size();
/* 14 */            for (int i5 = 0; i5 < size; i5++) {
/* 20 */                View view = (View) arrayList.get(i5);
/* 28 */                if (view.getVisibility() != 8 && ((behavior = ((C0080c) view.getLayoutParams()).f1218a) == null || !behavior.mo570h(this, view, layoutDirection))) {
/* 47 */                    m557p(layoutDirection, view);
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:69:0x012c  */
                /* JADX WARN: Code duplicated, block: B:72:0x015d  */
                /* JADX WARN: Code duplicated, block: B:75:0x0167  */
                /* JADX WARN: Code duplicated, block: B:78:0x0186  */
                /* JADX WARN: Code duplicated, block: B:79:0x0189  */
                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
                    boolean z;
                    int i3;
                    int i4;
                    int i5;
                    int iMakeMeasureSpec;
                    int iMakeMeasureSpec2;
                    Behavior behavior;
                    int i6;
                    int i7;
                    boolean z2;
                    int i8;
                    int i9;
                    ArrayList arrayList;
                    int i10;
                    View view;
                    int i11;
                    boolean zMo571i;
                    int iMax;
/* 1 */             CoordinatorLayout coordinatorLayout = this;
/* 3 */             coordinatorLayout.m560s();
/* 6 */             int childCount = coordinatorLayout.getChildCount();
/* 10 */            int i12 = 0;
/* 11 */            int i13 = 0;
                    loop0: while (true) {
/* 13 */                if (i13 >= childCount) {
/* 52 */                    z = false;
                            break;
                        }
/* 15 */                View childAt = coordinatorLayout.getChildAt(i13);
/* 23 */                le2 le2Var = (le2) coordinatorLayout.f1203b.f15956b;
/* 25 */                int i14 = le2Var.f13213c;
/* 28 */                for (int i15 = 0; i15 < i14; i15++) {
/* 34 */                    ArrayList arrayList2 = (ArrayList) le2Var.m6430j(i15);
/* 36 */                    if (arrayList2 != null && arrayList2.contains(childAt)) {
/* 44 */                        z = true;
                                break loop0;
                            }
                        }
/* 49 */                i13++;
                    }
/* 55 */            if (z != coordinatorLayout.f1202a0) {
/* 57 */                boolean z3 = coordinatorLayout.f1215v;
/* 59 */                if (z) {
/* 61 */                    if (z3) {
/* 65 */                        if (coordinatorLayout.f1200W == null) {
/* 72 */                            coordinatorLayout.f1200W = new l10(coordinatorLayout, i12);
                                }
/* 80 */                        coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f1200W);
                            }
/* 83 */                    coordinatorLayout.f1202a0 = true;
                        } else {
/* 86 */                    if (z3 && coordinatorLayout.f1200W != null) {
/* 98 */                        coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f1200W);
                            }
/* 101 */                   coordinatorLayout.f1202a0 = false;
                        }
                    }
/* 103 */           int paddingLeft = coordinatorLayout.getPaddingLeft();
/* 107 */           int paddingTop = coordinatorLayout.getPaddingTop();
/* 111 */           int paddingRight = coordinatorLayout.getPaddingRight();
/* 115 */           int paddingBottom = coordinatorLayout.getPaddingBottom();
/* 119 */           WeakHashMap weakHashMap = e33.f7494a;
/* 121 */           int layoutDirection = coordinatorLayout.getLayoutDirection();
/* 129 */           boolean z4 = layoutDirection == 1;
/* 130 */           int mode = View.MeasureSpec.getMode(i);
/* 134 */           int size = View.MeasureSpec.getSize(i);
/* 138 */           int mode2 = View.MeasureSpec.getMode(i2);
/* 142 */           int size2 = View.MeasureSpec.getSize(i2);
/* 146 */           int i16 = paddingLeft + paddingRight;
/* 148 */           int i17 = paddingTop + paddingBottom;
/* 150 */           int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
/* 154 */           int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
/* 171 */           boolean z5 = coordinatorLayout.f1204b0 != null && coordinatorLayout.getFitsSystemWindows();
/* 173 */           ArrayList arrayList3 = coordinatorLayout.f1201a;
/* 175 */           int size3 = arrayList3.size();
/* 179 */           int i18 = 0;
/* 180 */           int iCombineMeasuredStates = 0;
/* 182 */           while (i18 < size3) {
/* 188 */               View view2 = (View) arrayList3.get(i18);
/* 194 */               int i19 = suggestedMinimumWidth;
/* 198 */               if (view2.getVisibility() == 8) {
/* 200 */                   arrayList = arrayList3;
/* 202 */                   i4 = size3;
/* 204 */                   i11 = i18;
/* 206 */                   i6 = paddingLeft;
/* 208 */                   suggestedMinimumWidth = i19;
/* 210 */                   z2 = false;
/* 212 */                   i8 = paddingRight;
                        } else {
/* 221 */                   C0080c c0080c = (C0080c) view2.getLayoutParams();
/* 223 */                   int i20 = c0080c.f1222e;
/* 225 */                   if (i20 < 0 || mode == 0) {
/* 294 */                       i3 = suggestedMinimumHeight;
                            } else {
/* 229 */                       int iM554l = coordinatorLayout.m554l(i20);
/* 235 */                       int i21 = c0080c.f1220c;
/* 237 */                       if (i21 == 0) {
/* 239 */                           i21 = 8388661;
                                }
/* 246 */                       int absoluteGravity = Gravity.getAbsoluteGravity(i21, layoutDirection) & 7;
/* 248 */                       i3 = suggestedMinimumHeight;
/* 251 */                       if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
/* 275 */                           if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
/* 287 */                               iMax = Math.max(0, iM554l - paddingLeft);
                                    }
/* 299 */                           if (z5 || view2.getFitsSystemWindows()) {
/* 352 */                               iMakeMeasureSpec = i;
/* 354 */                               iMakeMeasureSpec2 = i2;
                                    } else {
/* 321 */                               int iM6623c = coordinatorLayout.f1204b0.m6623c() + coordinatorLayout.f1204b0.m6622b();
/* 336 */                               int iM6621a = coordinatorLayout.f1204b0.m6621a() + coordinatorLayout.f1204b0.m6624d();
/* 339 */                               iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM6623c, mode);
/* 345 */                               iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM6621a, mode2);
                                    }
/* 356 */                           behavior = c0080c.f1218a;
/* 358 */                           if (behavior != null) {
/* 360 */                               z2 = false;
/* 362 */                               i6 = paddingLeft;
/* 364 */                               i7 = i19;
/* 366 */                               i8 = paddingRight;
/* 368 */                               i9 = i3;
/* 370 */                               arrayList = arrayList3;
/* 372 */                               int i22 = iMakeMeasureSpec;
/* 375 */                               i11 = i18;
/* 377 */                               int i23 = iMakeMeasureSpec2;
/* 380 */                               zMo571i = behavior.mo571i(this, view2, i22, i5, i23);
/* 384 */                               view = view2;
/* 385 */                               iMakeMeasureSpec = i22;
/* 387 */                               i10 = i23;
/* 388 */                               if (zMo571i) {
/* 391 */                                   coordinatorLayout = this;
                                        }
/* 429 */                               int iMax2 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) c0080c).leftMargin + ((ViewGroup.MarginLayoutParams) c0080c).rightMargin);
/* 445 */                               int iMax3 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) c0080c).topMargin + ((ViewGroup.MarginLayoutParams) c0080c).bottomMargin);
/* 455 */                               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
/* 459 */                               suggestedMinimumWidth = iMax2;
/* 460 */                               suggestedMinimumHeight = iMax3;
                                    } else {
/* 394 */                               i6 = paddingLeft;
/* 396 */                               i7 = i19;
/* 398 */                               z2 = false;
/* 400 */                               i8 = paddingRight;
/* 402 */                               i9 = i3;
/* 404 */                               arrayList = arrayList3;
/* 407 */                               i10 = iMakeMeasureSpec2;
/* 408 */                               view = view2;
/* 410 */                               i11 = i18;
                                    }
/* 413 */                           coordinatorLayout = this;
/* 415 */                           coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
/* 429 */                           int iMax4 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) c0080c).leftMargin + ((ViewGroup.MarginLayoutParams) c0080c).rightMargin);
/* 445 */                           int iMax5 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) c0080c).topMargin + ((ViewGroup.MarginLayoutParams) c0080c).bottomMargin);
/* 455 */                           iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
/* 459 */                           suggestedMinimumWidth = iMax4;
/* 460 */                           suggestedMinimumHeight = iMax5;
                                } else {
/* 265 */                           iMax = Math.max(0, (size - paddingRight) - iM554l);
                                }
/* 269 */                       int i24 = size3;
/* 271 */                       i5 = iMax;
/* 272 */                       i4 = i24;
/* 299 */                       if (z5) {
/* 352 */                           iMakeMeasureSpec = i;
/* 354 */                           iMakeMeasureSpec2 = i2;
                                } else {
/* 352 */                           iMakeMeasureSpec = i;
/* 354 */                           iMakeMeasureSpec2 = i2;
                                }
/* 356 */                       behavior = c0080c.f1218a;
/* 358 */                       if (behavior != null) {
/* 360 */                           z2 = false;
/* 362 */                           i6 = paddingLeft;
/* 364 */                           i7 = i19;
/* 366 */                           i8 = paddingRight;
/* 368 */                           i9 = i3;
/* 370 */                           arrayList = arrayList3;
/* 372 */                           int i25 = iMakeMeasureSpec;
/* 375 */                           i11 = i18;
/* 377 */                           int i26 = iMakeMeasureSpec2;
/* 380 */                           zMo571i = behavior.mo571i(this, view2, i25, i5, i26);
/* 384 */                           view = view2;
/* 385 */                           iMakeMeasureSpec = i25;
/* 387 */                           i10 = i26;
/* 388 */                           if (zMo571i) {
/* 391 */                               coordinatorLayout = this;
                                    }
/* 429 */                           int iMax6 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) c0080c).leftMargin + ((ViewGroup.MarginLayoutParams) c0080c).rightMargin);
/* 445 */                           int iMax7 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) c0080c).topMargin + ((ViewGroup.MarginLayoutParams) c0080c).bottomMargin);
/* 455 */                           iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
/* 459 */                           suggestedMinimumWidth = iMax6;
/* 460 */                           suggestedMinimumHeight = iMax7;
                                } else {
/* 394 */                           i6 = paddingLeft;
/* 396 */                           i7 = i19;
/* 398 */                           z2 = false;
/* 400 */                           i8 = paddingRight;
/* 402 */                           i9 = i3;
/* 404 */                           arrayList = arrayList3;
/* 407 */                           i10 = iMakeMeasureSpec2;
/* 408 */                           view = view2;
/* 410 */                           i11 = i18;
                                }
/* 413 */                       coordinatorLayout = this;
/* 415 */                       coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
/* 429 */                       int iMax8 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) c0080c).leftMargin + ((ViewGroup.MarginLayoutParams) c0080c).rightMargin);
/* 445 */                       int iMax9 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) c0080c).topMargin + ((ViewGroup.MarginLayoutParams) c0080c).bottomMargin);
/* 455 */                       iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
/* 459 */                       suggestedMinimumWidth = iMax8;
/* 460 */                       suggestedMinimumHeight = iMax9;
                            }
/* 297 */                   i4 = size3;
/* 298 */                   i5 = 0;
/* 299 */                   if (z5) {
/* 352 */                       iMakeMeasureSpec = i;
/* 354 */                       iMakeMeasureSpec2 = i2;
                            } else {
/* 352 */                       iMakeMeasureSpec = i;
/* 354 */                       iMakeMeasureSpec2 = i2;
                            }
/* 356 */                   behavior = c0080c.f1218a;
/* 358 */                   if (behavior != null) {
/* 360 */                       z2 = false;
/* 362 */                       i6 = paddingLeft;
/* 364 */                       i7 = i19;
/* 366 */                       i8 = paddingRight;
/* 368 */                       i9 = i3;
/* 370 */                       arrayList = arrayList3;
/* 372 */                       int i27 = iMakeMeasureSpec;
/* 375 */                       i11 = i18;
/* 377 */                       int i28 = iMakeMeasureSpec2;
/* 380 */                       zMo571i = behavior.mo571i(this, view2, i27, i5, i28);
/* 384 */                       view = view2;
/* 385 */                       iMakeMeasureSpec = i27;
/* 387 */                       i10 = i28;
/* 388 */                       if (zMo571i) {
/* 391 */                           coordinatorLayout = this;
                                }
/* 429 */                       int iMax10 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) c0080c).leftMargin + ((ViewGroup.MarginLayoutParams) c0080c).rightMargin);
/* 445 */                       int iMax11 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) c0080c).topMargin + ((ViewGroup.MarginLayoutParams) c0080c).bottomMargin);
/* 455 */                       iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
/* 459 */                       suggestedMinimumWidth = iMax10;
/* 460 */                       suggestedMinimumHeight = iMax11;
                            } else {
/* 394 */                       i6 = paddingLeft;
/* 396 */                       i7 = i19;
/* 398 */                       z2 = false;
/* 400 */                       i8 = paddingRight;
/* 402 */                       i9 = i3;
/* 404 */                       arrayList = arrayList3;
/* 407 */                       i10 = iMakeMeasureSpec2;
/* 408 */                       view = view2;
/* 410 */                       i11 = i18;
                            }
/* 413 */                   coordinatorLayout = this;
/* 415 */                   coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
/* 429 */                   int iMax12 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) c0080c).leftMargin + ((ViewGroup.MarginLayoutParams) c0080c).rightMargin);
/* 445 */                   int iMax13 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) c0080c).topMargin + ((ViewGroup.MarginLayoutParams) c0080c).bottomMargin);
/* 455 */                   iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
/* 459 */                   suggestedMinimumWidth = iMax12;
/* 460 */                   suggestedMinimumHeight = iMax13;
                        }
/* 461 */               i18 = i11 + 1;
/* 463 */               paddingLeft = i6;
/* 465 */               paddingRight = i8;
/* 467 */               size3 = i4;
/* 469 */               arrayList3 = arrayList;
                    }
/* 477 */           int i29 = iCombineMeasuredStates;
/* 496 */           coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i29), View.resolveSizeAndState(suggestedMinimumHeight, i2, i29 << 16));
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final boolean onNestedFling(View view, float f, float f2, boolean z) {
/* 1 */             int childCount = getChildCount();
/* 7 */             for (int i = 0; i < childCount; i++) {
/* 9 */                 View childAt = getChildAt(i);
/* 19 */                if (childAt.getVisibility() != 8) {
/* 26 */                    C0080c c0080c = (C0080c) childAt.getLayoutParams();
/* 32 */                    if (c0080c.m581a(0)) {
/* 35 */                        Behavior behavior = c0080c.f1218a;
                            }
                        }
                    }
/* 5 */             return false;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final boolean onNestedPreFling(View view, float f, float f2) {
                    Behavior behavior;
/* 1 */             int childCount = getChildCount();
/* 7 */             boolean zMo572j = false;
/* 8 */             for (int i = 0; i < childCount; i++) {
/* 10 */                View childAt = getChildAt(i);
/* 20 */                if (childAt.getVisibility() != 8) {
/* 27 */                    C0080c c0080c = (C0080c) childAt.getLayoutParams();
/* 33 */                    if (c0080c.m581a(0) && (behavior = c0080c.f1218a) != null) {
/* 44 */                        zMo572j |= behavior.mo572j(view);
                            }
                        }
                    }
/* 48 */            return zMo572j;
                }

                @Override // p000.pm1
                public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
                    Behavior behavior;
/* 1 */             int childCount = getChildCount();
/* 6 */             boolean z = false;
/* 8 */             int iMax = 0;
/* 9 */             int iMax2 = 0;
/* 11 */            for (int i4 = 0; i4 < childCount; i4++) {
/* 13 */                View childAt = getChildAt(i4);
/* 23 */                if (childAt.getVisibility() != 8) {
/* 30 */                    C0080c c0080c = (C0080c) childAt.getLayoutParams();
/* 38 */                    if (c0080c.m581a(i3) && (behavior = c0080c.f1218a) != null) {
/* 45 */                        int[] iArr2 = this.f1209e;
/* 47 */                        iArr2[0] = 0;
/* 49 */                        iArr2[1] = 0;
/* 58 */                        behavior.mo573k(this, childAt, view, i, i2, iArr2, i3);
/* 73 */                        iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
/* 90 */                        iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
/* 95 */                        z = true;
                            }
                        }
                    }
/* 99 */            iArr[0] = iMax;
/* 101 */           iArr[1] = iMax2;
/* 103 */           if (z) {
/* 105 */               m556o(1);
                    }
                }

                @Override // p000.qm1
                public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
                    Behavior behavior;
/* 1 */             int childCount = getChildCount();
/* 7 */             int iMax = 0;
/* 8 */             int iMax2 = 0;
/* 9 */             boolean z = false;
/* 11 */            for (int i6 = 0; i6 < childCount; i6++) {
/* 13 */                View childAt = getChildAt(i6);
/* 23 */                if (childAt.getVisibility() != 8) {
/* 32 */                    C0080c c0080c = (C0080c) childAt.getLayoutParams();
/* 40 */                    if (c0080c.m581a(i5) && (behavior = c0080c.f1218a) != null) {
/* 47 */                        int[] iArr2 = this.f1209e;
/* 49 */                        iArr2[0] = 0;
/* 51 */                        iArr2[1] = 0;
/* 60 */                        behavior.mo574l(this, childAt, i2, i3, i4, iArr2);
/* 74 */                        iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
/* 89 */                        iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
/* 93 */                        z = true;
                            }
                        }
                    }
/* 100 */           iArr[0] = iArr[0] + iMax;
/* 105 */           iArr[1] = iArr[1] + iMax2;
/* 107 */           if (z) {
/* 109 */               m556o(1);
                    }
                }

                @Override // p000.pm1
                public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
/* 2 */             rm1 rm1Var = this.f1213g0;
/* 4 */             if (i2 == 1) {
/* 6 */                 rm1Var.f16182b = i;
                    } else {
/* 9 */                 rm1Var.f16181a = i;
                    }
/* 11 */            this.f1199V = view2;
/* 13 */            int childCount = getChildCount();
/* 18 */            for (int i3 = 0; i3 < childCount; i3++) {
/* 30 */                ((C0080c) getChildAt(i3).getLayoutParams()).getClass();
                    }
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
                    Parcelable parcelable2;
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 13 */            super.onRestoreInstanceState(savedState.f1292a);
/* 16 */            SparseArray sparseArray = savedState.f1217c;
/* 18 */            int childCount = getChildCount();
/* 23 */            for (int i = 0; i < childCount; i++) {
/* 25 */                View childAt = getChildAt(i);
/* 29 */                int id = childAt.getId();
/* 37 */                Behavior behavior = m546m(childAt).f1218a;
/* 40 */                if (id != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
/* 52 */                    behavior.mo576n(childAt, parcelable2);
                        }
                    }
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
                    Parcelable parcelableMo577o;
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 12 */            SparseArray sparseArray = new SparseArray();
/* 15 */            int childCount = getChildCount();
/* 20 */            for (int i = 0; i < childCount; i++) {
/* 22 */                View childAt = getChildAt(i);
/* 26 */                int id = childAt.getId();
/* 36 */                Behavior behavior = ((C0080c) childAt.getLayoutParams()).f1218a;
/* 39 */                if (id != -1 && behavior != null && (parcelableMo577o = behavior.mo577o(childAt)) != null) {
/* 49 */                    sparseArray.append(id, parcelableMo577o);
                        }
                    }
/* 55 */            savedState.f1217c = sparseArray;
/* 57 */            return savedState;
                }

                @Override // p000.pm1
                public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
/* 1 */             int childCount = getChildCount();
/* 7 */             boolean z = false;
/* 8 */             for (int i3 = 0; i3 < childCount; i3++) {
/* 10 */                View childAt = getChildAt(i3);
/* 20 */                if (childAt.getVisibility() != 8) {
/* 30 */                    C0080c c0080c = (C0080c) childAt.getLayoutParams();
/* 32 */                    Behavior behavior = c0080c.f1218a;
/* 35 */                    if (behavior != null) {
/* 44 */                        boolean zMo578p = behavior.mo578p(this, childAt, view, view2, i, i2);
/* 48 */                        z |= zMo578p;
/* 49 */                        if (i2 == 0) {
/* 57 */                            c0080c.f1230m = zMo578p;
                                } else if (i2 == 1) {
/* 54 */                            c0080c.f1231n = zMo578p;
                                }
                            } else if (i2 == 0) {
/* 70 */                        c0080c.f1230m = false;
                            } else if (i2 == 1) {
/* 67 */                        c0080c.f1231n = false;
                            }
                        }
                    }
/* 75 */            return z;
                }

                @Override // p000.pm1
                public final void onStopNestedScroll(View view, int i) {
/* 1 */             rm1 rm1Var = this.f1213g0;
/* 5 */             if (i == 1) {
/* 7 */                 rm1Var.f16182b = 0;
                    } else {
/* 10 */                rm1Var.f16181a = 0;
                    }
/* 12 */            int childCount = getChildCount();
/* 17 */            for (int i2 = 0; i2 < childCount; i2++) {
/* 19 */                View childAt = getChildAt(i2);
/* 27 */                C0080c c0080c = (C0080c) childAt.getLayoutParams();
/* 33 */                if (c0080c.m581a(i)) {
/* 36 */                    Behavior behavior = c0080c.f1218a;
/* 38 */                    if (behavior != null) {
/* 40 */                        behavior.mo579q(this, childAt, view, i);
                            }
/* 43 */                    if (i == 0) {
/* 51 */                        c0080c.f1230m = false;
                            } else if (i == 1) {
/* 48 */                        c0080c.f1231n = false;
                            }
/* 53 */                    c0080c.f1232o = false;
                        }
                    }
/* 59 */            this.f1199V = null;
                }

                /* JADX WARN: Code duplicated, block: B:14:0x002f  */
                /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:16:0x0037  */
                /* JADX WARN: Code duplicated, block: B:18:0x004a  */
                /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    boolean zM559r;
                    boolean zMo580r;
                    MotionEvent motionEventObtain;
/* 5 */             int actionMasked = motionEvent.getActionMasked();
/* 13 */            if (this.f1198U == null) {
/* 15 */                zM559r = m559r(motionEvent, 1);
/* 19 */                if (!zM559r) {
/* 22 */                    zMo580r = false;
                        }
/* 45 */                motionEventObtain = null;
/* 46 */                if (this.f1198U == null) {
/* 52 */                    zMo580r |= super.onTouchEvent(motionEvent);
                        } else if (zM559r) {
/* 56 */                    long jUptimeMillis = SystemClock.uptimeMillis();
/* 66 */                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
/* 70 */                    super.onTouchEvent(motionEventObtain);
                        }
/* 73 */                if (motionEventObtain != null) {
/* 75 */                    motionEventObtain.recycle();
                        }
/* 78 */                if (actionMasked == 1 && actionMasked != 3) {
/* 84 */                    return zMo580r;
                        }
/* 85 */                m561t(false);
/* 88 */                return zMo580r;
                    }
/* 24 */            zM559r = false;
/* 33 */            Behavior behavior = ((C0080c) this.f1198U.getLayoutParams()).f1218a;
/* 35 */            if (behavior != null) {
/* 39 */                zMo580r = behavior.mo580r(this, this.f1198U, motionEvent);
                    } else {
/* 22 */                zMo580r = false;
                    }
/* 45 */            motionEventObtain = null;
/* 46 */            if (this.f1198U == null) {
/* 52 */                zMo580r |= super.onTouchEvent(motionEvent);
                    } else if (zM559r) {
/* 56 */                long jUptimeMillis2 = SystemClock.uptimeMillis();
/* 66 */                motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
/* 70 */                super.onTouchEvent(motionEventObtain);
                    }
/* 73 */            if (motionEventObtain != null) {
/* 75 */                motionEventObtain.recycle();
                    }
/* 78 */            if (actionMasked == 1) {
                    }
/* 85 */            m561t(false);
/* 88 */            return zMo580r;
                }

                /* JADX INFO: renamed from: p */
                public final void m557p(int i, View view) {
                    int i2;
/* 5 */             C0080c c0080c = (C0080c) view.getLayoutParams();
/* 7 */             View view2 = c0080c.f1228k;
/* 9 */             if (view2 == null && c0080c.f1223f != -1) {
/* 19 */                f42.m3656l("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
/* 22 */                return;
                    }
/* 23 */            ot1 ot1Var = f1197l0;
/* 25 */            if (view2 != null) {
/* 27 */                Rect rectM544e = m544e();
/* 31 */                Rect rectM544e2 = m544e();
                        try {
/* 35 */                    m553j(rectM544e, view2);
/* 43 */                    C0080c c0080c2 = (C0080c) view.getLayoutParams();
/* 45 */                    int measuredWidth = view.getMeasuredWidth();
/* 49 */                    int measuredHeight = view.getMeasuredHeight();
/* 54 */                    m545k(i, rectM544e, rectM544e2, c0080c2, measuredWidth, measuredHeight);
/* 57 */                    m549f(c0080c2, rectM544e2, measuredWidth, measuredHeight);
/* 68 */                    view.layout(rectM544e2.left, rectM544e2.top, rectM544e2.right, rectM544e2.bottom);
/* 83 */                    return;
                        } finally {
/* 86 */                    rectM544e.setEmpty();
/* 89 */                    ot1Var.mo7044c(rectM544e);
/* 92 */                    rectM544e2.setEmpty();
/* 95 */                    ot1Var.mo7044c(rectM544e2);
                        }
                    }
/* 100 */           int i3 = c0080c.f1222e;
/* 102 */           if (i3 < 0) {
/* 234 */               C0080c c0080c3 = (C0080c) view.getLayoutParams();
/* 236 */               Rect rectM544e3 = m544e();
/* 278 */               rectM544e3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0080c3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0080c3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0080c3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0080c3).bottomMargin);
/* 283 */               if (this.f1204b0 != null) {
/* 285 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 291 */                   if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
/* 308 */                       rectM544e3.left = this.f1204b0.m6622b() + rectM544e3.left;
/* 319 */                       rectM544e3.top = this.f1204b0.m6624d() + rectM544e3.top;
/* 330 */                       rectM544e3.right -= this.f1204b0.m6623c();
/* 341 */                       rectM544e3.bottom -= this.f1204b0.m6621a();
                            }
                        }
/* 343 */               Rect rectM544e4 = m544e();
/* 347 */               int i4 = c0080c3.f1220c;
/* 351 */               if ((i4 & 7) == 0) {
/* 356 */                   i4 |= 8388611;
                        }
/* 359 */               if ((i4 & 112) == 0) {
/* 361 */                   i4 |= 48;
                        }
/* 373 */               Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM544e3, rectM544e4, i);
/* 384 */               view.layout(rectM544e4.left, rectM544e4.top, rectM544e4.right, rectM544e4.bottom);
/* 387 */               rectM544e3.setEmpty();
/* 390 */               ot1Var.mo7044c(rectM544e3);
/* 393 */               rectM544e4.setEmpty();
/* 396 */               ot1Var.mo7044c(rectM544e4);
/* 399 */               return;
                    }
/* 108 */           C0080c c0080c4 = (C0080c) view.getLayoutParams();
/* 110 */           int i5 = c0080c4.f1220c;
/* 112 */           if (i5 == 0) {
/* 114 */               i5 = 8388661;
                    }
/* 117 */           int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
/* 121 */           int i6 = absoluteGravity & 7;
/* 123 */           int i7 = absoluteGravity & 112;
/* 125 */           int width = getWidth();
/* 129 */           int height = getHeight();
/* 133 */           int measuredWidth2 = view.getMeasuredWidth();
/* 137 */           int measuredHeight2 = view.getMeasuredHeight();
/* 142 */           if (i == 1) {
/* 144 */               i3 = width - i3;
                    }
/* 150 */           int iM554l = m554l(i3) - measuredWidth2;
/* 151 */           if (i6 == 1) {
/* 161 */               iM554l += measuredWidth2 / 2;
                    } else if (i6 == 5) {
/* 157 */               iM554l += measuredWidth2;
                    }
/* 164 */           if (i7 != 16) {
/* 172 */               i2 = i7 != 80 ? 0 : measuredHeight2;
                    } else {
/* 174 */               i2 = measuredHeight2 / 2;
                    }
/* 196 */           int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0080c4).leftMargin, Math.min(iM554l, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0080c4).rightMargin));
/* 220 */           int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0080c4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0080c4).bottomMargin));
/* 226 */           view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
                }

                /* JADX INFO: renamed from: q */
                public final void m558q(int i, int i2, int i3, View view) {
/* 7 */             measureChildWithMargins(view, i, i2, i3, 0);
                }

                /* JADX INFO: renamed from: r */
                public final boolean m559r(MotionEvent motionEvent, int i) {
/* 7 */             int actionMasked = motionEvent.getActionMasked();
/* 11 */            ArrayList arrayList = this.f1205c;
/* 13 */            arrayList.clear();
/* 16 */            boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
/* 20 */            int childCount = getChildCount();
/* 26 */            for (int i2 = childCount - 1; i2 >= 0; i2--) {
/* 40 */                arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
                    }
/* 46 */            wa3 wa3Var = f1196k0;
/* 48 */            if (wa3Var != null) {
/* 50 */                Collections.sort(arrayList, wa3Var);
                    }
/* 53 */            int size = arrayList.size();
/* 59 */            MotionEvent motionEventObtain = null;
/* 60 */            boolean zMo569g = false;
/* 61 */            for (int i3 = 0; i3 < size; i3++) {
/* 67 */                View view = (View) arrayList.get(i3);
/* 75 */                Behavior behavior = ((C0080c) view.getLayoutParams()).f1218a;
/* 78 */                if (zMo569g && actionMasked != 0) {
/* 83 */                    if (behavior != null) {
/* 85 */                        if (motionEventObtain == null) {
/* 87 */                            long jUptimeMillis = SystemClock.uptimeMillis();
/* 100 */                           motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                                }
/* 104 */                       if (i == 0) {
/* 113 */                           behavior.mo569g(this, view, motionEventObtain);
                                } else if (i == 1) {
/* 109 */                           behavior.mo580r(this, view, motionEventObtain);
                                }
                            }
                        } else if (!zMo569g && behavior != null) {
/* 121 */                   if (i == 0) {
/* 131 */                       zMo569g = behavior.mo569g(this, view, motionEvent);
                            } else if (i == 1) {
/* 126 */                       zMo569g = behavior.mo580r(this, view, motionEvent);
                            }
/* 135 */                   if (zMo569g) {
/* 137 */                       this.f1198U = view;
                            }
                        }
                    }
/* 142 */           arrayList.clear();
/* 145 */           return zMo569g;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
/* 7 */             Behavior behavior = ((C0080c) view.getLayoutParams()).f1218a;
/* 9 */             if (behavior == null || !behavior.mo575m(this, view, rect, z)) {
/* 19 */                return super.requestChildRectangleOnScreen(view, rect, z);
                    }
/* 17 */            return true;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final void requestDisallowInterceptTouchEvent(boolean z) {
/* 1 */             super.requestDisallowInterceptTouchEvent(z);
/* 4 */             if (!z || this.f1214i) {
/* 17 */                return;
                    }
/* 11 */            m561t(false);
/* 15 */            this.f1214i = true;
                }

                /* JADX WARN: Code duplicated, block: B:103:0x0089 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:32:0x007e  */
                /* JADX WARN: Code duplicated, block: B:34:0x0084  */
                /* JADX WARN: Code duplicated, block: B:37:0x008f  */
                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0093
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                    */
                /* JADX INFO: renamed from: s */
                public final void m560s() {
                    /*
                        Method dump skipped, instruction units count: 396
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m560s():void");
                }

                @Override // android.view.View
                public void setFitsSystemWindows(boolean z) {
/* 1 */             super.setFitsSystemWindows(z);
/* 4 */             m562w();
                }

                @Override // android.view.ViewGroup
                public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
/* 1 */             this.f1210e0 = onHierarchyChangeListener;
                }

                public void setStatusBarBackground(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.f1208d0;
/* 3 */             if (drawable2 != drawable) {
/* 6 */                 if (drawable2 != null) {
/* 8 */                     drawable2.setCallback(null);
                        }
/* 13 */                Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
/* 17 */                this.f1208d0 = drawableMutate;
/* 19 */                if (drawableMutate != null) {
/* 25 */                    if (drawableMutate.isStateful()) {
/* 33 */                        this.f1208d0.setState(getDrawableState());
                            }
/* 36 */                    Drawable drawable3 = this.f1208d0;
/* 38 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 44 */                    t90.m8739b(drawable3, getLayoutDirection());
/* 59 */                    this.f1208d0.setVisible(getVisibility() == 0, false);
/* 64 */                    this.f1208d0.setCallback(this);
                        }
/* 67 */                WeakHashMap weakHashMap2 = e33.f7494a;
/* 69 */                postInvalidateOnAnimation();
                    }
                }

                public void setStatusBarBackgroundColor(int i) {
/* 6 */             setStatusBarBackground(new ColorDrawable(i));
                }

                public void setStatusBarBackgroundResource(int i) {
/* 13 */            setStatusBarBackground(i != 0 ? v00.getDrawable(getContext(), i) : null);
                }

                @Override // android.view.View
                public void setVisibility(int i) {
/* 1 */             super.setVisibility(i);
/* 9 */             boolean z = i == 0;
/* 10 */            Drawable drawable = this.f1208d0;
/* 12 */            if (drawable == null || drawable.isVisible() == z) {
/* 25 */                return;
                    }
/* 22 */            this.f1208d0.setVisible(z, false);
                }

                /* JADX INFO: renamed from: t */
                public final void m561t(boolean z) {
/* 1 */             int childCount = getChildCount();
/* 7 */             for (int i = 0; i < childCount; i++) {
/* 9 */                 View childAt = getChildAt(i);
/* 19 */                Behavior behavior = ((C0080c) childAt.getLayoutParams()).f1218a;
/* 21 */                if (behavior != null) {
/* 23 */                    long jUptimeMillis = SystemClock.uptimeMillis();
/* 32 */                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
/* 36 */                    if (z) {
/* 38 */                        behavior.mo569g(this, childAt, motionEventObtain);
                            } else {
/* 42 */                        behavior.mo580r(this, childAt, motionEventObtain);
                            }
/* 45 */                    motionEventObtain.recycle();
                        }
                    }
/* 52 */            for (int i2 = 0; i2 < childCount; i2++) {
/* 64 */                ((C0080c) getChildAt(i2).getLayoutParams()).getClass();
                    }
/* 71 */            this.f1198U = null;
/* 73 */            this.f1214i = false;
                }

                @Override // android.view.View
                public final boolean verifyDrawable(Drawable drawable) {
                    return super.verifyDrawable(drawable) || drawable == this.f1208d0;
                }

                /* JADX INFO: renamed from: w */
                public final void m562w() {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 7 */             if (!getFitsSystemWindows()) {
/* 34 */                s23.m8383u(this, null);
/* 37 */                return;
                    }
/* 11 */            if (this.f1212f0 == null) {
/* 20 */                this.f1212f0 = new qc3(this, 19);
                    }
/* 24 */            s23.m8383u(this, this.f1212f0);
/* 29 */            setSystemUiVisibility(PlatformPlugin.DEFAULT_SYSTEM_UI);
                }

                @Override // android.view.ViewGroup
/* 30 */        public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 31 */            return new C0080c(getContext(), attributeSet);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
/* 36 */        public final void onNestedScrollAccepted(View view, View view2, int i) {
/* 37 */            onNestedScrollAccepted(view, view2, i, 0);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
/* 61 */        public final void onStopNestedScroll(View view) {
/* 62 */            onStopNestedScroll(view, 0);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
/* 75 */        public final boolean onStartNestedScroll(View view, View view2, int i) {
/* 76 */            return onStartNestedScroll(view, view2, i, 0);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
/* 108 */       public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
/* 109 */           onNestedPreScroll(view, i, i2, iArr, 0);
                }

                @Override // p000.pm1
/* 112 */       public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
/* 113 */           onNestedScroll(view, i, i2, i3, i4, 0, this.f1211f);
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
/* 113 */       public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
/* 114 */           onNestedScroll(view, i, i2, i3, i4, 0);
                }

/* 173 */       public CoordinatorLayout(Context context, AttributeSet attributeSet) {
/* 174 */           this(context, attributeSet, R$attr.coordinatorLayoutStyle);
                }
            }
