            package androidx.drawerlayout.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.view.Gravity;
            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.WindowInsets;
            import androidx.customview.view.AbsSavedState;
            import androidx.drawerlayout.R$attr;
            import androidx.drawerlayout.R$dimen;
            import androidx.drawerlayout.R$styleable;
            import io.flutter.plugin.platform.PlatformPlugin;
            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            import p000.C1951n4;
            import p000.C2343wt;
            import p000.C2518z0;
            import p000.aa0;
            import p000.ba0;
            import p000.d52;
            import p000.e33;
            import p000.fm0;
            import p000.j33;
            import p000.ly0;
            import p000.m83;
            import p000.pm2;
            import p000.s23;
            import p000.v00;
            import p000.z90;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public class DrawerLayout extends ViewGroup {

                /* JADX INFO: renamed from: p0 */
                public static final int[] f1293p0 = {R.attr.colorPrimaryDark};

                /* JADX INFO: renamed from: q0 */
                public static final int[] f1294q0 = {R.attr.layout_gravity};

                /* JADX INFO: renamed from: r0 */
                public static final boolean f1295r0;

                /* JADX INFO: renamed from: U */
                public int f1296U;

                /* JADX INFO: renamed from: V */
                public boolean f1297V;

                /* JADX INFO: renamed from: W */
                public boolean f1298W;

                /* JADX INFO: renamed from: a */
                public float f1299a;

                /* JADX INFO: renamed from: a0 */
                public int f1300a0;

                /* JADX INFO: renamed from: b */
                public final int f1301b;

                /* JADX INFO: renamed from: b0 */
                public int f1302b0;

                /* JADX INFO: renamed from: c */
                public int f1303c;

                /* JADX INFO: renamed from: c0 */
                public int f1304c0;

                /* JADX INFO: renamed from: d */
                public float f1305d;

                /* JADX INFO: renamed from: d0 */
                public int f1306d0;

                /* JADX INFO: renamed from: e */
                public final Paint f1307e;

                /* JADX INFO: renamed from: e0 */
                public boolean f1308e0;

                /* JADX INFO: renamed from: f */
                public final j33 f1309f;

                /* JADX INFO: renamed from: f0 */
                public ArrayList f1310f0;

                /* JADX INFO: renamed from: g0 */
                public float f1311g0;

                /* JADX INFO: renamed from: h0 */
                public float f1312h0;

                /* JADX INFO: renamed from: i */
                public final j33 f1313i;

                /* JADX INFO: renamed from: i0 */
                public Drawable f1314i0;

                /* JADX INFO: renamed from: j0 */
                public WindowInsets f1315j0;

                /* JADX INFO: renamed from: k0 */
                public boolean f1316k0;

                /* JADX INFO: renamed from: l0 */
                public final ArrayList f1317l0;

                /* JADX INFO: renamed from: m0 */
                public Rect f1318m0;

                /* JADX INFO: renamed from: n0 */
                public Matrix f1319n0;

                /* JADX INFO: renamed from: o0 */
                public final d52 f1320o0;

                /* JADX INFO: renamed from: v */
                public final C0085b f1321v;

                /* JADX INFO: renamed from: w */
                public final C0085b f1322w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LayoutParams extends ViewGroup.MarginLayoutParams {

                    /* JADX INFO: renamed from: a */
                    public int f1323a;

                    /* JADX INFO: renamed from: b */
                    public float f1324b;

                    /* JADX INFO: renamed from: c */
                    public boolean f1325c;

                    /* JADX INFO: renamed from: d */
                    public int f1326d;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 5 */                 this.f1323a = 0;
/* 9 */                 TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1294q0);
/* 17 */                this.f1323a = typedArrayObtainStyledAttributes.getInt(0, 0);
/* 19 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends AbsSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0084a();

                    /* JADX INFO: renamed from: c */
                    public int f1327c;

                    /* JADX INFO: renamed from: d */
                    public int f1328d;

                    /* JADX INFO: renamed from: e */
                    public int f1329e;

                    /* JADX INFO: renamed from: f */
                    public int f1330f;

                    /* JADX INFO: renamed from: i */
                    public int f1331i;

                    public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */                 super(parcel, classLoader);
/* 5 */                 this.f1327c = 0;
/* 11 */                this.f1327c = parcel.readInt();
/* 17 */                this.f1328d = parcel.readInt();
/* 23 */                this.f1329e = parcel.readInt();
/* 29 */                this.f1330f = parcel.readInt();
/* 35 */                this.f1331i = parcel.readInt();
                    }

                    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeInt(this.f1327c);
/* 11 */                parcel.writeInt(this.f1328d);
/* 16 */                parcel.writeInt(this.f1329e);
/* 21 */                parcel.writeInt(this.f1330f);
/* 26 */                parcel.writeInt(this.f1331i);
                    }
                }

                static {
/* 28 */            f1295r0 = Build.VERSION.SDK_INT >= 29;
                }

                public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 7 */             new aa0(0);
/* 12 */            this.f1303c = -1728053248;
/* 19 */            this.f1307e = new Paint();
/* 22 */            this.f1298W = true;
/* 25 */            this.f1300a0 = 3;
/* 27 */            this.f1302b0 = 3;
/* 29 */            this.f1304c0 = 3;
/* 31 */            this.f1306d0 = 3;
/* 38 */            this.f1320o0 = new d52(this);
/* 42 */            setDescendantFocusability(262144);
/* 53 */            float f = getResources().getDisplayMetrics().density;
/* 62 */            this.f1301b = (int) ((64.0f * f) + 0.5f);
/* 66 */            float f2 = f * 400.0f;
/* 69 */            C0085b c0085b = new C0085b(this, 3);
/* 72 */            this.f1321v = c0085b;
/* 77 */            C0085b c0085b2 = new C0085b(this, 5);
/* 80 */            this.f1322w = c0085b2;
/* 88 */            j33 j33Var = new j33(getContext(), this, c0085b);
/* 98 */            j33Var.f12041b = (int) (j33Var.f12041b * 1.0f);
/* 100 */           this.f1309f = j33Var;
/* 102 */           j33Var.f12056q = 1;
/* 104 */           j33Var.f12053n = f2;
/* 106 */           c0085b.f1333f = j33Var;
/* 114 */           j33 j33Var2 = new j33(getContext(), this, c0085b2);
/* 122 */           j33Var2.f12041b = (int) (1.0f * j33Var2.f12041b);
/* 124 */           this.f1313i = j33Var2;
/* 127 */           j33Var2.f12056q = 2;
/* 129 */           j33Var2.f12053n = f2;
/* 131 */           c0085b2.f1333f = j33Var2;
/* 133 */           setFocusableInTouchMode(true);
/* 136 */           WeakHashMap weakHashMap = e33.f7494a;
/* 138 */           setImportantForAccessibility(1);
/* 146 */           e33.m3318n(this, new C2343wt(this));
/* 149 */           setMotionEventSplittingEnabled(false);
/* 156 */           if (getFitsSystemWindows()) {
/* 163 */               setOnApplyWindowInsetsListener(new z90());
/* 168 */               setSystemUiVisibility(PlatformPlugin.DEFAULT_SYSTEM_UI);
/* 173 */               TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f1293p0);
                        try {
/* 181 */                   this.f1314i0 = typedArrayObtainStyledAttributes.getDrawable(0);
/* 183 */                   typedArrayObtainStyledAttributes.recycle();
                        } catch (Throwable th) {
/* 188 */                   typedArrayObtainStyledAttributes.recycle();
/* 191 */                   throw th;
                        }
                    }
/* 194 */           TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.DrawerLayout, i, 0);
                    try {
/* 204 */               if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.DrawerLayout_elevation)) {
/* 213 */                   this.f1299a = typedArrayObtainStyledAttributes2.getDimension(R$styleable.DrawerLayout_elevation, 0.0f);
                        } else {
/* 228 */                   this.f1299a = getResources().getDimension(R$dimen.def_drawer_elevation);
                        }
/* 230 */               typedArrayObtainStyledAttributes2.recycle();
/* 238 */               this.f1317l0 = new ArrayList();
                    } catch (Throwable th2) {
/* 241 */               typedArrayObtainStyledAttributes2.recycle();
/* 244 */               throw th2;
                    }
                }

                /* JADX INFO: renamed from: h */
                public static boolean m606h(View view) {
                    return ((LayoutParams) view.getLayoutParams()).f1323a == 0;
                }

                /* JADX INFO: renamed from: i */
                public static boolean m607i(View view) {
/* 6 */             if (m608j(view)) {
                        return (((LayoutParams) view.getLayoutParams()).f1326d & 1) == 1;
                    }
/* 26 */            C1697u2.m5435k(view, "View ", " is not a drawer");
/* 5 */             return false;
                }

                /* JADX INFO: renamed from: j */
                public static boolean m608j(View view) {
/* 7 */             int i = ((LayoutParams) view.getLayoutParams()).f1323a;
/* 9 */             WeakHashMap weakHashMap = e33.f7494a;
/* 15 */            int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
                    return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m609a(int i, View view) {
                    return (m615g(view) & i) == i;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void addFocusables(ArrayList arrayList, int i, int i2) {
                    ArrayList arrayList2;
/* 7 */             if (getDescendantFocusability() == 393216) {
/* 9 */                 return;
                    }
/* 10 */            int childCount = getChildCount();
/* 15 */            int i3 = 0;
/* 16 */            boolean z = false;
                    while (true) {
/* 17 */                arrayList2 = this.f1317l0;
/* 19 */                if (i3 >= childCount) {
                            break;
                        }
/* 21 */                View childAt = getChildAt(i3);
/* 29 */                if (!m608j(childAt)) {
/* 42 */                    arrayList2.add(childAt);
                        } else if (m607i(childAt)) {
/* 37 */                    childAt.addFocusables(arrayList, i, i2);
/* 40 */                    z = true;
                        }
/* 45 */                i3++;
                    }
/* 48 */            if (!z) {
/* 50 */                int size = arrayList2.size();
/* 54 */                for (int i4 = 0; i4 < size; i4++) {
/* 60 */                    View view = (View) arrayList2.get(i4);
/* 66 */                    if (view.getVisibility() == 0) {
/* 68 */                        view.addFocusables(arrayList, i, i2);
                            }
                        }
                    }
/* 74 */            arrayList2.clear();
                }

                @Override // android.view.ViewGroup
                public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
                    View childAt;
/* 1 */             super.addView(view, i, layoutParams);
/* 4 */             int childCount = getChildCount();
/* 8 */             int i2 = 0;
                    while (true) {
/* 10 */                if (i2 >= childCount) {
/* 31 */                    childAt = null;
                            break;
                        }
/* 12 */                childAt = getChildAt(i2);
/* 25 */                if ((((LayoutParams) childAt.getLayoutParams()).f1326d & 1) == 1) {
                            break;
                        } else {
/* 28 */                    i2++;
                        }
                    }
/* 32 */            if (childAt != null || m608j(view)) {
/* 47 */                WeakHashMap weakHashMap = e33.f7494a;
/* 50 */                view.setImportantForAccessibility(4);
                    } else {
/* 41 */                WeakHashMap weakHashMap2 = e33.f7494a;
/* 43 */                view.setImportantForAccessibility(1);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m610b(View view) {
/* 5 */             if (!m608j(view)) {
/* 73 */                C1697u2.m5435k(view, "View ", " is not a sliding drawer");
/* 76 */                return;
                    }
/* 11 */            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 15 */            if (this.f1298W) {
/* 18 */                layoutParams.f1324b = 0.0f;
/* 21 */                layoutParams.f1326d = 0;
                    } else {
/* 28 */                layoutParams.f1326d |= 4;
/* 35 */                if (m609a(3, view)) {
/* 48 */                    this.f1309f.m5689u(view, -view.getWidth(), view.getTop());
                        } else {
/* 62 */                    this.f1313i.m5689u(view, getWidth(), view.getTop());
                        }
                    }
/* 65 */            invalidate();
                }

                /* JADX INFO: renamed from: c */
                public final void m611c(boolean z) {
/* 1 */             int childCount = getChildCount();
/* 7 */             boolean zM5689u = false;
/* 8 */             for (int i = 0; i < childCount; i++) {
/* 10 */                View childAt = getChildAt(i);
/* 18 */                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 24 */                if (m608j(childAt) && (!z || layoutParams.f1325c)) {
/* 55 */                    zM5689u |= m609a(3, childAt) ? this.f1309f.m5689u(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1313i.m5689u(childAt, getWidth(), childAt.getTop());
/* 72 */                    layoutParams.f1325c = false;
                        }
                    }
/* 77 */            C0085b c0085b = this.f1321v;
/* 83 */            c0085b.f1335h.removeCallbacks(c0085b.f1334g);
/* 86 */            C0085b c0085b2 = this.f1322w;
/* 92 */            c0085b2.f1335h.removeCallbacks(c0085b2.f1334g);
/* 95 */            if (zM5689u) {
/* 97 */                invalidate();
                    }
                }

                @Override // android.view.ViewGroup
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
                    return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
                }

                @Override // android.view.View
                public final void computeScroll() {
/* 1 */             int childCount = getChildCount();
/* 5 */             float fMax = 0.0f;
/* 7 */             for (int i = 0; i < childCount; i++) {
/* 21 */                fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).f1324b);
                    }
/* 28 */            this.f1305d = fMax;
/* 32 */            boolean zM5677h = this.f1309f.m5677h();
/* 38 */            boolean zM5677h2 = this.f1313i.m5677h();
/* 42 */            if (zM5677h || zM5677h2) {
/* 48 */                WeakHashMap weakHashMap = e33.f7494a;
/* 50 */                postInvalidateOnAnimation();
                    }
                }

                /* JADX INFO: renamed from: d */
                public final View m612d(int i) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 11 */            int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
/* 13 */            int childCount = getChildCount();
/* 18 */            for (int i2 = 0; i2 < childCount; i2++) {
/* 20 */                View childAt = getChildAt(i2);
/* 30 */                if ((m615g(childAt) & 7) == absoluteGravity) {
/* 32 */                    return childAt;
                        }
                    }
/* 36 */            return null;
                }

                @Override // android.view.View
                public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
                    boolean zDispatchGenericMotionEvent;
/* 7 */             if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1305d <= 0.0f) {
/* 198 */               return super.dispatchGenericMotionEvent(motionEvent);
                    }
/* 26 */            int childCount = getChildCount();
/* 30 */            if (childCount == 0) {
/* 196 */               return false;
                    }
/* 32 */            float x = motionEvent.getX();
/* 36 */            float y = motionEvent.getY();
/* 42 */            for (int i = childCount - 1; i >= 0; i--) {
/* 44 */                View childAt = getChildAt(i);
/* 50 */                if (this.f1318m0 == null) {
/* 57 */                    this.f1318m0 = new Rect();
                        }
/* 61 */                childAt.getHitRect(this.f1318m0);
/* 72 */                if (this.f1318m0.contains((int) x, (int) y) && !m606h(childAt)) {
/* 89 */                    if (childAt.getMatrix().isIdentity()) {
/* 165 */                       float scrollX = getScrollX() - childAt.getLeft();
/* 175 */                       float scrollY = getScrollY() - childAt.getTop();
/* 177 */                       motionEvent.offsetLocation(scrollX, scrollY);
/* 180 */                       zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
/* 186 */                       motionEvent.offsetLocation(-scrollX, -scrollY);
                            } else {
/* 99 */                        float scrollX2 = getScrollX() - childAt.getLeft();
/* 109 */                       float scrollY2 = getScrollY() - childAt.getTop();
/* 111 */                       MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
/* 115 */                       motionEventObtain.offsetLocation(scrollX2, scrollY2);
/* 118 */                       Matrix matrix = childAt.getMatrix();
/* 126 */                       if (!matrix.isIdentity()) {
/* 130 */                           if (this.f1319n0 == null) {
/* 137 */                               this.f1319n0 = new Matrix();
                                    }
/* 141 */                           matrix.invert(this.f1319n0);
/* 146 */                           motionEventObtain.transform(this.f1319n0);
                                }
/* 149 */                       zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
/* 153 */                       motionEventObtain.recycle();
                            }
/* 189 */                   if (zDispatchGenericMotionEvent) {
/* 40 */                        return true;
                            }
                        }
                    }
/* 196 */           return false;
                }

                @Override // android.view.ViewGroup
                public final boolean drawChild(Canvas canvas, View view, long j) {
                    Drawable background;
/* 1 */             int height = getHeight();
/* 5 */             boolean zM606h = m606h(view);
/* 9 */             int width = getWidth();
/* 13 */            int iSave = canvas.save();
/* 17 */            int i = 0;
/* 18 */            if (zM606h) {
/* 20 */                int childCount = getChildCount();
/* 25 */                int i2 = 0;
/* 26 */                for (int i3 = 0; i3 < childCount; i3++) {
/* 28 */                    View childAt = getChildAt(i3);
/* 32 */                    if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m608j(childAt) && childAt.getHeight() >= height) {
/* 71 */                        if (m609a(3, childAt)) {
/* 73 */                            int right = childAt.getRight();
/* 77 */                            if (right > i2) {
/* 79 */                                i2 = right;
                                    }
                                } else {
/* 81 */                            int left = childAt.getLeft();
/* 85 */                            if (left < width) {
/* 87 */                                width = left;
                                    }
                                }
                            }
                        }
/* 95 */                canvas.clipRect(i2, 0, width, getHeight());
/* 98 */                i = i2;
                    }
/* 99 */            boolean zDrawChild = super.drawChild(canvas, view, j);
/* 103 */           canvas.restoreToCount(iSave);
/* 106 */           float f = this.f1305d;
/* 111 */           if (f > 0.0f && zM606h) {
/* 115 */               int i4 = this.f1303c;
/* 132 */               Paint paint = this.f1307e;
/* 134 */               paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
/* 146 */               canvas.drawRect(i, 0.0f, width, getHeight(), paint);
                    }
/* 149 */           return zDrawChild;
                }

                /* JADX INFO: renamed from: e */
                public final View m613e() {
/* 1 */             int childCount = getChildCount();
/* 7 */             for (int i = 0; i < childCount; i++) {
/* 9 */                 View childAt = getChildAt(i);
/* 17 */                if (m608j(childAt)) {
/* 23 */                    if (!m608j(childAt)) {
/* 43 */                        C1697u2.m5435k(childAt, "View ", " is not a drawer");
/* 6 */                         return null;
                            }
/* 36 */                    if (((LayoutParams) childAt.getLayoutParams()).f1324b > 0.0f) {
/* 38 */                        return childAt;
                            }
                        }
                    }
/* 6 */             return null;
                }

                /* JADX INFO: renamed from: f */
                public final int m614f(View view) {
/* 6 */             if (!m608j(view)) {
/* 104 */               C1697u2.m5435k(view, "View ", " is not a drawer");
/* 5 */                 return 0;
                    }
/* 14 */            int i = ((LayoutParams) view.getLayoutParams()).f1323a;
/* 16 */            WeakHashMap weakHashMap = e33.f7494a;
/* 18 */            int layoutDirection = getLayoutDirection();
/* 23 */            if (i == 3) {
/* 84 */                int i2 = this.f1300a0;
/* 86 */                if (i2 != 3) {
/* 88 */                    return i2;
                        }
/* 94 */                int i3 = layoutDirection == 0 ? this.f1304c0 : this.f1306d0;
/* 96 */                if (i3 != 3) {
/* 98 */                    return i3;
                        }
                    } else if (i == 5) {
/* 69 */                int i4 = this.f1302b0;
/* 71 */                if (i4 != 3) {
/* 73 */                    return i4;
                        }
/* 79 */                int i5 = layoutDirection == 0 ? this.f1306d0 : this.f1304c0;
/* 81 */                if (i5 != 3) {
/* 83 */                    return i5;
                        }
                    } else if (i == 8388611) {
/* 54 */                int i6 = this.f1304c0;
/* 56 */                if (i6 != 3) {
/* 58 */                    return i6;
                        }
/* 64 */                int i7 = layoutDirection == 0 ? this.f1300a0 : this.f1302b0;
/* 66 */                if (i7 != 3) {
/* 68 */                    return i7;
                        }
                    } else if (i == 8388613) {
/* 39 */                int i8 = this.f1306d0;
/* 41 */                if (i8 != 3) {
/* 43 */                    return i8;
                        }
/* 49 */                int i9 = layoutDirection == 0 ? this.f1302b0 : this.f1300a0;
/* 51 */                if (i9 != 3) {
/* 53 */                    return i9;
                        }
                    }
/* 5 */             return 0;
                }

                /* JADX INFO: renamed from: g */
                public final int m615g(View view) {
/* 7 */             int i = ((LayoutParams) view.getLayoutParams()).f1323a;
/* 9 */             WeakHashMap weakHashMap = e33.f7494a;
/* 15 */            return Gravity.getAbsoluteGravity(i, getLayoutDirection());
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 4 */             LayoutParams layoutParams = new LayoutParams(-1, -1);
/* 8 */             layoutParams.f1323a = 0;
/* 10 */            return layoutParams;
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 4 */             if (layoutParams instanceof LayoutParams) {
/* 8 */                 LayoutParams layoutParams2 = (LayoutParams) layoutParams;
/* 10 */                LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
/* 13 */                layoutParams3.f1323a = 0;
/* 17 */                layoutParams3.f1323a = layoutParams2.f1323a;
/* 19 */                return layoutParams3;
                    }
/* 22 */            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
/* 28 */                LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
/* 31 */                layoutParams4.f1323a = 0;
/* 33 */                return layoutParams4;
                    }
/* 36 */            LayoutParams layoutParams5 = new LayoutParams(layoutParams);
/* 39 */            layoutParams5.f1323a = 0;
/* 41 */            return layoutParams5;
                }

                public float getDrawerElevation() {
/* 1 */             return this.f1299a;
                }

                public Drawable getStatusBarBackgroundDrawable() {
/* 1 */             return this.f1314i0;
                }

                /* JADX INFO: renamed from: k */
                public final void m616k(View view) {
/* 5 */             if (!m608j(view)) {
/* 81 */                C1697u2.m5435k(view, "View ", " is not a sliding drawer");
/* 84 */                return;
                    }
/* 11 */            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 15 */            if (this.f1298W) {
/* 19 */                layoutParams.f1324b = 1.0f;
/* 22 */                layoutParams.f1326d = 1;
/* 24 */                m620o(view, true);
/* 27 */                m619n(view);
                    } else {
/* 35 */                layoutParams.f1326d |= 2;
/* 42 */                if (m609a(3, view)) {
/* 51 */                    this.f1309f.m5689u(view, 0, view.getTop());
                        } else {
/* 70 */                    this.f1313i.m5689u(view, getWidth() - view.getWidth(), view.getTop());
                        }
                    }
/* 73 */            invalidate();
                }

                /* JADX INFO: renamed from: l */
                public final void m617l(int i, int i2) {
                    View viewM612d;
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 7 */             int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
/* 12 */            if (i2 == 3) {
/* 37 */                this.f1300a0 = i;
                    } else if (i2 == 5) {
/* 34 */                this.f1302b0 = i;
                    } else if (i2 == 8388611) {
/* 31 */                this.f1304c0 = i;
                    } else if (i2 == 8388613) {
/* 28 */                this.f1306d0 = i;
                    }
/* 39 */            if (i != 0) {
/* 48 */                (absoluteGravity == 3 ? this.f1309f : this.f1313i).m5671b();
                    }
/* 52 */            if (i != 1) {
/* 55 */                if (i == 2 && (viewM612d = m612d(absoluteGravity)) != null) {
/* 64 */                    m616k(viewM612d);
/* 67 */                    return;
                        }
/* 77 */                return;
                    }
/* 68 */            View viewM612d2 = m612d(absoluteGravity);
/* 72 */            if (viewM612d2 != null) {
/* 74 */                m610b(viewM612d2);
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m618m(View view, float f) {
                    int size;
/* 5 */             LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 11 */            if (f == layoutParams.f1324b) {
/* 36 */                return;
                    }
/* 14 */            layoutParams.f1324b = f;
/* 16 */            ArrayList arrayList = this.f1310f0;
/* 18 */            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
/* 35 */                throw pm2.m7486i(size, this.f1310f0);
                    }
                }

                /* JADX INFO: renamed from: n */
                public final void m619n(View view) {
/* 1 */             C2518z0 c2518z0 = C2518z0.f19879l;
/* 7 */             e33.m3314j(c2518z0.m10230a(), view);
/* 14 */            if (!m607i(view) || m614f(view) == 2) {
/* 28 */                return;
                    }
/* 25 */            e33.m3316l(view, c2518z0, this.f1320o0);
                }

                /* JADX INFO: renamed from: o */
                public final void m620o(View view, boolean z) {
/* 1 */             int childCount = getChildCount();
/* 6 */             for (int i = 0; i < childCount; i++) {
/* 8 */                 View childAt = getChildAt(i);
/* 12 */                if ((z || m608j(childAt)) && !(z && childAt == view)) {
/* 31 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 34 */                    childAt.setImportantForAccessibility(4);
                        } else {
/* 24 */                    WeakHashMap weakHashMap2 = e33.f7494a;
/* 27 */                    childAt.setImportantForAccessibility(1);
                        }
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 5 */             this.f1298W = true;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 5 */             this.f1298W = true;
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
/* 1 */             super.onDraw(canvas);
/* 6 */             if (!this.f1316k0 || this.f1314i0 == null) {
/* 39 */                return;
                    }
/* 12 */            WindowInsets windowInsets = this.f1315j0;
/* 22 */            int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
/* 23 */            if (systemWindowInsetTop > 0) {
/* 31 */                this.f1314i0.setBounds(0, 0, getWidth(), systemWindowInsetTop);
/* 36 */                this.f1314i0.draw(canvas);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:18:0x005e  */
                @Override // android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    boolean z;
                    View viewM5678i;
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 5 */             j33 j33Var = this.f1309f;
/* 17 */            boolean zM5688t = j33Var.m5688t(motionEvent) | this.f1313i.m5688t(motionEvent);
/* 20 */            if (actionMasked != 0) {
/* 22 */                if (actionMasked == 1) {
/* 95 */                    m611c(true);
/* 98 */                    this.f1308e0 = false;
                        } else if (actionMasked == 2) {
/* 33 */                    int length = j33Var.f12043d.length;
/* 35 */                    for (int i = 0; i < length; i++) {
/* 42 */                        if ((j33Var.f12050k & (1 << i)) != 0) {
/* 52 */                            float f = j33Var.f12045f[i] - j33Var.f12043d[i];
/* 61 */                            float f2 = j33Var.f12046g[i] - j33Var.f12044e[i];
/* 64 */                            float f3 = (f2 * f2) + (f * f);
/* 65 */                            int i2 = j33Var.f12041b;
/* 71 */                            if (f3 > i2 * i2) {
/* 73 */                                C0085b c0085b = this.f1321v;
/* 79 */                                c0085b.f1335h.removeCallbacks(c0085b.f1334g);
/* 82 */                                C0085b c0085b2 = this.f1322w;
/* 88 */                                c0085b2.f1335h.removeCallbacks(c0085b2.f1334g);
                                        break;
                                    }
                                }
                            }
                        } else if (actionMasked == 3) {
/* 95 */                    m611c(true);
/* 98 */                    this.f1308e0 = false;
                        }
/* 100 */               z = false;
                    } else {
/* 102 */               float x = motionEvent.getX();
/* 106 */               float y = motionEvent.getY();
/* 110 */               this.f1311g0 = x;
/* 112 */               this.f1312h0 = y;
/* 137 */               z = this.f1305d > 0.0f && (viewM5678i = j33Var.m5678i((int) x, (int) y)) != null && m606h(viewM5678i);
/* 138 */               this.f1308e0 = false;
                    }
/* 140 */           if (!zM5688t && !z) {
/* 144 */               int childCount = getChildCount();
/* 149 */               for (int i3 = 0; i3 < childCount; i3++) {
/* 163 */                   if (!((LayoutParams) getChildAt(i3).getLayoutParams()).f1325c) {
                            }
                        }
/* 171 */               if (!this.f1308e0) {
/* 19 */                    return false;
                        }
                    }
/* 18 */            return true;
                }

                @Override // android.view.View, android.view.KeyEvent.Callback
                public final boolean onKeyDown(int i, KeyEvent keyEvent) {
/* 2 */             if (i != 4 || m613e() == null) {
/* 15 */                return super.onKeyDown(i, keyEvent);
                    }
/* 10 */            keyEvent.startTracking();
/* 13 */            return true;
                }

                @Override // android.view.View, android.view.KeyEvent.Callback
                public final boolean onKeyUp(int i, KeyEvent keyEvent) {
/* 2 */             if (i != 4) {
/* 25 */                return super.onKeyUp(i, keyEvent);
                    }
/* 4 */             View viewM613e = m613e();
/* 9 */             if (viewM613e != null && m614f(viewM613e) == 0) {
/* 17 */                m611c(false);
                    }
                    return viewM613e != null;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    WindowInsets rootWindowInsets;
                    float f;
                    int i5;
/* 3 */             boolean z2 = true;
/* 4 */             this.f1297V = true;
/* 6 */             int i6 = i3 - i;
/* 8 */             int childCount = getChildCount();
/* 13 */            int i7 = 0;
/* 14 */            while (i7 < childCount) {
/* 16 */                View childAt = getChildAt(i7);
/* 26 */                if (childAt.getVisibility() != 8) {
/* 34 */                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 40 */                    if (m606h(childAt)) {
/* 42 */                        int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
/* 58 */                        childAt.layout(i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            } else {
/* 63 */                        int measuredWidth = childAt.getMeasuredWidth();
/* 67 */                        int measuredHeight = childAt.getMeasuredHeight();
/* 76 */                        if (m609a(3, childAt)) {
                                    float f2 = measuredWidth;
/* 84 */                            i5 = (-measuredWidth) + ((int) (layoutParams.f1324b * f2));
/* 88 */                            f = (measuredWidth + i5) / f2;
                                } else {
                                    float f3 = measuredWidth;
/* 95 */                            int i9 = i6 - ((int) (layoutParams.f1324b * f3));
/* 100 */                           f = (i6 - i9) / f3;
/* 101 */                           i5 = i9;
                                }
/* 110 */                       boolean z3 = f != layoutParams.f1324b ? z2 : false;
/* 113 */                       int i10 = layoutParams.f1323a & 112;
/* 117 */                       if (i10 == 16) {
/* 150 */                           int i11 = i4 - i2;
/* 154 */                           int i12 = (i11 - measuredHeight) / 2;
/* 156 */                           int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
/* 158 */                           if (i12 < i13) {
/* 160 */                               i12 = i13;
                                    } else {
/* 162 */                               int i14 = i12 + measuredHeight;
/* 166 */                               int i15 = i11 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
/* 167 */                               if (i14 > i15) {
/* 169 */                                   i12 = i15 - measuredHeight;
                                        }
                                    }
/* 173 */                           childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                                } else if (i10 != 80) {
/* 123 */                           int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
/* 127 */                           childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                                } else {
/* 131 */                           int i17 = i4 - i2;
/* 146 */                           childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                                }
/* 176 */                       if (z3) {
/* 178 */                           m618m(childAt, f);
                                }
/* 190 */                       int i18 = layoutParams.f1324b > 0.0f ? 0 : 4;
/* 195 */                       if (childAt.getVisibility() != i18) {
/* 197 */                           childAt.setVisibility(i18);
                                }
                            }
                        }
/* 200 */               i7++;
/* 202 */               z2 = true;
                    }
/* 207 */           if (f1295r0 && (rootWindowInsets = getRootWindowInsets()) != null) {
/* 222 */               ly0 ly0VarMo4133i = m83.m6620h(rootWindowInsets, null).f13660a.mo4133i();
/* 226 */               j33 j33Var = this.f1309f;
/* 236 */               j33Var.f12054o = Math.max(j33Var.f12055p, ly0VarMo4133i.f13528a);
/* 238 */               j33 j33Var2 = this.f1313i;
/* 248 */               j33Var2.f12054o = Math.max(j33Var2.f12055p, ly0VarMo4133i.f13530c);
                    }
/* 250 */           this.f1297V = false;
/* 252 */           this.f1298W = false;
                }

                /* JADX WARN: Code duplicated, block: B:17:0x0038  */
                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
                    boolean z;
/* 3 */             int mode = View.MeasureSpec.getMode(i);
/* 7 */             int mode2 = View.MeasureSpec.getMode(i2);
/* 11 */            int size = View.MeasureSpec.getSize(i);
/* 15 */            int size2 = View.MeasureSpec.getSize(i2);
/* 21 */            if (mode != 1073741824 || mode2 != 1073741824) {
/* 29 */                if (!isInEditMode()) {
/* 413 */                   C1951n4.m6859j("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
/* 416 */                   return;
                        }
/* 33 */                if (mode == 0) {
/* 35 */                    size = 300;
                        }
/* 36 */                if (mode2 == 0) {
/* 38 */                    size2 = 300;
                        }
                    }
/* 39 */            setMeasuredDimension(size, size2);
/* 45 */            if (this.f1315j0 != null) {
/* 47 */                WeakHashMap weakHashMap = e33.f7494a;
/* 53 */                if (getFitsSystemWindows()) {
/* 55 */                    z = true;
                        } else {
/* 57 */                    z = false;
                        }
                    } else {
/* 57 */                z = false;
                    }
/* 58 */            WeakHashMap weakHashMap2 = e33.f7494a;
/* 60 */            int layoutDirection = getLayoutDirection();
/* 64 */            int childCount = getChildCount();
/* 69 */            boolean z2 = false;
/* 70 */            boolean z3 = false;
/* 71 */            for (int i3 = 0; i3 < childCount; i3++) {
/* 73 */                View childAt = getChildAt(i3);
/* 83 */                if (childAt.getVisibility() != 8) {
/* 91 */                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 94 */                    if (z) {
/* 98 */                        int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.f1323a, layoutDirection);
/* 102 */                       boolean fitsSystemWindows = childAt.getFitsSystemWindows();
/* 106 */                       WindowInsets windowInsetsReplaceSystemWindowInsets = this.f1315j0;
/* 108 */                       if (fitsSystemWindows) {
/* 110 */                           if (absoluteGravity == 3) {
/* 124 */                               windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                                    } else if (absoluteGravity == 5) {
/* 144 */                               windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                                    }
/* 148 */                           childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                                } else {
/* 153 */                           if (absoluteGravity == 3) {
/* 167 */                               windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                                    } else if (absoluteGravity == 5) {
/* 187 */                               windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                                    }
/* 195 */                           ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft();
/* 201 */                           ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop();
/* 207 */                           ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight();
/* 213 */                           ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom();
                                }
                            }
/* 219 */                   if (m606h(childAt)) {
/* 245 */                       childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                            } else {
/* 260 */                       if (!m608j(childAt)) {
/* 409 */                           throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                                }
/* 262 */                       float fM8371i = s23.m8371i(childAt);
/* 266 */                       float f = this.f1299a;
/* 270 */                       if (fM8371i != f) {
/* 272 */                           s23.m8381s(childAt, f);
                                }
/* 275 */                       int iM615g = m615g(childAt);
/* 279 */                       int i4 = iM615g & 7;
/* 286 */                       boolean z4 = i4 == 3;
/* 287 */                       if ((z4 && z2) || (!z4 && z3)) {
/* 333 */                           throw new IllegalStateException(fm0.m3789o(new StringBuilder("Child drawer has absolute gravity "), (iM615g & 3) != 3 ? (iM615g & 5) == 5 ? "RIGHT" : Integer.toHexString(i4) : "LEFT", " but this DrawerLayout already has a drawer view along that edge"));
                                }
/* 334 */                       if (z4) {
/* 336 */                           z2 = true;
                                } else {
/* 338 */                           z3 = true;
                                }
/* 368 */                       childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f1301b + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                            }
                        }
                    }
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
                    View viewM612d;
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 13 */            super.onRestoreInstanceState(savedState.f1292a);
/* 16 */            int i = savedState.f1327c;
/* 18 */            if (i != 0 && (viewM612d = m612d(i)) != null) {
/* 26 */                m616k(viewM612d);
                    }
/* 29 */            int i2 = savedState.f1328d;
/* 32 */            if (i2 != 3) {
/* 34 */                m617l(i2, 3);
                    }
/* 37 */            int i3 = savedState.f1329e;
/* 39 */            if (i3 != 3) {
/* 42 */                m617l(i3, 5);
                    }
/* 45 */            int i4 = savedState.f1330f;
/* 47 */            if (i4 != 3) {
/* 52 */                m617l(i4, 8388611);
                    }
/* 55 */            int i5 = savedState.f1331i;
/* 57 */            if (i5 != 3) {
/* 62 */                m617l(i5, 8388613);
                    }
                }

                @Override // android.view.View
                public final void onRtlPropertiesChanged(int i) {
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 11 */            savedState.f1327c = 0;
/* 13 */            int childCount = getChildCount();
/* 18 */            for (int i = 0; i < childCount; i++) {
/* 28 */                LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
/* 30 */                int i2 = layoutParams.f1326d;
/* 37 */                boolean z = i2 == 1;
/* 39 */                boolean z2 = i2 == 2;
/* 43 */                if (z || z2) {
/* 53 */                    savedState.f1327c = layoutParams.f1323a;
                            break;
                        }
                    }
/* 57 */            savedState.f1328d = this.f1300a0;
/* 61 */            savedState.f1329e = this.f1302b0;
/* 65 */            savedState.f1330f = this.f1304c0;
/* 69 */            savedState.f1331i = this.f1306d0;
/* 71 */            return savedState;
                }

                /* JADX WARN: Code duplicated, block: B:26:0x006b  */
                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    boolean z;
                    View childAt;
/* 1 */             j33 j33Var = this.f1309f;
/* 3 */             j33Var.m5681m(motionEvent);
/* 8 */             this.f1313i.m5681m(motionEvent);
/* 15 */            int action = motionEvent.getAction() & 255;
/* 19 */            if (action == 0) {
/* 113 */               float x = motionEvent.getX();
/* 117 */               float y = motionEvent.getY();
/* 121 */               this.f1311g0 = x;
/* 123 */               this.f1312h0 = y;
/* 125 */               this.f1308e0 = false;
/* 18 */                return true;
                    }
/* 21 */            if (action != 1) {
/* 24 */                if (action != 3) {
/* 18 */                    return true;
                        }
/* 27 */                m611c(true);
/* 30 */                this.f1308e0 = false;
/* 18 */                return true;
                    }
/* 33 */            float x2 = motionEvent.getX();
/* 37 */            float y2 = motionEvent.getY();
/* 43 */            View viewM5678i = j33Var.m5678i((int) x2, (int) y2);
/* 47 */            if (viewM5678i != null && m606h(viewM5678i)) {
/* 57 */                float f = x2 - this.f1311g0;
/* 60 */                float f2 = y2 - this.f1312h0;
/* 61 */                int i = j33Var.f12041b;
/* 70 */                if ((f2 * f2) + (f * f) < i * i) {
/* 72 */                    int childCount = getChildCount();
/* 76 */                    int i2 = 0;
                            while (true) {
/* 77 */                        if (i2 >= childCount) {
/* 98 */                            childAt = null;
                                    break;
                                }
/* 79 */                        childAt = getChildAt(i2);
/* 92 */                        if ((((LayoutParams) childAt.getLayoutParams()).f1326d & 1) == 1) {
                                    break;
                                }
/* 95 */                        i2++;
                            }
/* 99 */                    z = childAt == null || m614f(childAt) == 2;
                        }
                    }
/* 109 */           m611c(z);
/* 18 */            return true;
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final void requestDisallowInterceptTouchEvent(boolean z) {
/* 1 */             super.requestDisallowInterceptTouchEvent(z);
/* 4 */             if (z) {
/* 7 */                 m611c(true);
                    }
                }

                @Override // android.view.View, android.view.ViewParent
                public final void requestLayout() {
/* 3 */             if (this.f1297V) {
/* 8 */                 return;
                    }
/* 5 */             super.requestLayout();
                }

                public void setDrawerElevation(float f) {
/* 1 */             this.f1299a = f;
/* 8 */             for (int i = 0; i < getChildCount(); i++) {
/* 10 */                View childAt = getChildAt(i);
/* 18 */                if (m608j(childAt)) {
/* 20 */                    float f2 = this.f1299a;
/* 22 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 24 */                    s23.m8381s(childAt, f2);
                        }
                    }
                }

                @Deprecated
                public void setDrawerListener(ba0 ba0Var) {
/* 1 */             if (ba0Var != null) {
/* 5 */                 if (this.f1310f0 == null) {
/* 12 */                    this.f1310f0 = new ArrayList();
                        }
/* 16 */                this.f1310f0.add(ba0Var);
                    }
                }

                public void setDrawerLockMode(int i) {
/* 2 */             m617l(i, 3);
/* 6 */             m617l(i, 5);
                }

                public void setScrimColor(int i) {
/* 1 */             this.f1303c = i;
/* 3 */             invalidate();
                }

                public void setStatusBarBackground(int i) {
/* 13 */            this.f1314i0 = i != 0 ? v00.getDrawable(getContext(), i) : null;
/* 15 */            invalidate();
                }

                public void setStatusBarBackgroundColor(int i) {
/* 6 */             this.f1314i0 = new ColorDrawable(i);
/* 8 */             invalidate();
                }

/* 18 */        public void setStatusBarBackground(Drawable drawable) {
/* 19 */            this.f1314i0 = drawable;
/* 20 */            invalidate();
                }

                @Override // android.view.ViewGroup
/* 41 */        public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 42 */            return new LayoutParams(getContext(), attributeSet);
                }

/* 244 */       public DrawerLayout(Context context, AttributeSet attributeSet) {
/* 245 */           this(context, attributeSet, R$attr.drawerLayoutStyle);
                }
            }
