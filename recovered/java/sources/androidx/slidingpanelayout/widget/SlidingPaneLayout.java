            package androidx.slidingpanelayout.widget;

            import android.R;
            import android.app.Activity;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.customview.view.AbsSavedState;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.WeakHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import okhttp3.internal.http2.Http2Connection;
            import p000.C0832d5;
            import p000.C2223tm;
            import p000.C2334wk;
            import p000.af2;
            import p000.b22;
            import p000.bf2;
            import p000.c10;
            import p000.e33;
            import p000.i13;
            import p000.ig2;
            import p000.il0;
            import p000.j33;
            import p000.k50;
            import p000.ly0;
            import p000.m83;
            import p000.of0;
            import p000.ot0;
            import p000.pm2;
            import p000.t23;
            import p000.ts0;
            import p000.v00;
            import p000.v73;
            import p000.w73;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 22 */    public class SlidingPaneLayout extends ViewGroup {

                /* JADX INFO: renamed from: l0 */
                public static final boolean f1805l0;

                /* JADX INFO: renamed from: U */
                public boolean f1806U;

                /* JADX INFO: renamed from: V */
                public int f1807V;

                /* JADX INFO: renamed from: W */
                public float f1808W;

                /* JADX INFO: renamed from: a */
                public int f1809a;

                /* JADX INFO: renamed from: a0 */
                public float f1810a0;

                /* JADX INFO: renamed from: b */
                public int f1811b;

                /* JADX INFO: renamed from: b0 */
                public final CopyOnWriteArrayList f1812b0;

                /* JADX INFO: renamed from: c */
                public Drawable f1813c;

                /* JADX INFO: renamed from: c0 */
                public final j33 f1814c0;

                /* JADX INFO: renamed from: d */
                public Drawable f1815d;

                /* JADX INFO: renamed from: d0 */
                public boolean f1816d0;

                /* JADX INFO: renamed from: e */
                public boolean f1817e;

                /* JADX INFO: renamed from: e0 */
                public boolean f1818e0;

                /* JADX INFO: renamed from: f */
                public View f1819f;

                /* JADX INFO: renamed from: f0 */
                public final Rect f1820f0;

                /* JADX INFO: renamed from: g0 */
                public final ArrayList f1821g0;

                /* JADX INFO: renamed from: h0 */
                public int f1822h0;

                /* JADX INFO: renamed from: i */
                public float f1823i;

                /* JADX INFO: renamed from: i0 */
                public ot0 f1824i0;

                /* JADX INFO: renamed from: j0 */
                public final ts0 f1825j0;

                /* JADX INFO: renamed from: k0 */
                public il0 f1826k0;

                /* JADX INFO: renamed from: v */
                public float f1827v;

                /* JADX INFO: renamed from: w */
                public int f1828w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LayoutParams extends ViewGroup.MarginLayoutParams {

                    /* JADX INFO: renamed from: d */
                    public static final int[] f1829d = {R.attr.layout_weight};

                    /* JADX INFO: renamed from: a */
                    public float f1830a;

                    /* JADX INFO: renamed from: b */
                    public boolean f1831b;

                    /* JADX INFO: renamed from: c */
                    public boolean f1832c;

                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
/* 5 */                 this.f1830a = 0.0f;
/* 9 */                 TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1829d);
/* 18 */                this.f1830a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
/* 20 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends AbsSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0143b();

                    /* JADX INFO: renamed from: c */
                    public boolean f1833c;

                    /* JADX INFO: renamed from: d */
                    public int f1834d;

                    public SavedState(Parcel parcel) {
/* 2 */                 super(parcel, null);
/* 14 */                this.f1833c = parcel.readInt() != 0;
/* 20 */                this.f1834d = parcel.readInt();
                    }

                    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeInt(this.f1833c ? 1 : 0);
/* 11 */                parcel.writeInt(this.f1834d);
                    }
                }

                static {
/* 10 */            f1805l0 = Build.VERSION.SDK_INT >= 29;
                }

                public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 5 */             this.f1809a = 0;
/* 9 */             this.f1823i = 1.0f;
/* 16 */            this.f1812b0 = new CopyOnWriteArrayList();
/* 19 */            this.f1818e0 = true;
/* 26 */            this.f1820f0 = new Rect();
/* 33 */            this.f1821g0 = new ArrayList();
/* 40 */            this.f1825j0 = new ts0(this);
/* 50 */            float f = context.getResources().getDisplayMetrics().density;
/* 52 */            setWillNotDraw(false);
/* 60 */            e33.m3318n(this, new b22(this));
/* 63 */            setImportantForAccessibility(1);
/* 77 */            j33 j33Var = new j33(getContext(), this, new C0142a(this));
/* 87 */            j33Var.f12041b = (int) (2.0f * j33Var.f12041b);
/* 89 */            this.f1814c0 = j33Var;
/* 94 */            j33Var.f12053n = f * 400.0f;
/* 98 */            w73.f18473R.getClass();
/* 114 */           setFoldingFeatureObserver(new il0(v73.m9228a(context), v00.getMainExecutor(context)));
                }

                private ly0 getSystemGestureInsets() {
/* 3 */             if (!f1805l0) {
/* 20 */                return null;
                    }
/* 5 */             WeakHashMap weakHashMap = e33.f7494a;
/* 7 */             m83 m83VarM8681a = t23.m8681a(this);
/* 11 */            if (m83VarM8681a != null) {
/* 15 */                return m83VarM8681a.f13660a.mo4133i();
                    }
/* 20 */            return null;
                }

                private void setFoldingFeatureObserver(il0 il0Var) {
/* 1 */             this.f1826k0 = il0Var;
/* 3 */             il0Var.getClass();
/* 6 */             ts0 ts0Var = this.f1825j0;
/* 8 */             ts0Var.getClass();
/* 11 */            il0Var.f9706d = ts0Var;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m1045a(View view) {
/* 2 */             if (view == null) {
/* 1 */                 return false;
                    }
                    return this.f1817e && ((LayoutParams) view.getLayoutParams()).f1832c && this.f1823i > 0.0f;
                }

                @Override // android.view.ViewGroup
                public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 6 */             if (getChildCount() != 1) {
/* 24 */                super.addView(view, i, layoutParams);
/* 27 */                return;
                    }
/* 14 */            bf2 bf2Var = new bf2(view.getContext());
/* 17 */            bf2Var.addView(view);
/* 20 */            super.addView(bf2Var, i, layoutParams);
                }

                /* JADX INFO: renamed from: b */
                public final boolean m1046b() {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
                    return getLayoutDirection() == 1;
                }

                /* JADX INFO: renamed from: c */
                public final boolean m1047c() {
                    return !this.f1817e || this.f1823i == 0.0f;
                }

                @Override // android.view.ViewGroup
                public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
                    return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
                }

                @Override // android.view.View
                public final void computeScroll() {
/* 1 */             j33 j33Var = this.f1814c0;
/* 7 */             if (j33Var.m5677h()) {
/* 11 */                if (!this.f1817e) {
/* 13 */                    j33Var.m5670a();
                        } else {
/* 17 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 19 */                    postInvalidateOnAnimation();
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m1048d(float f) {
/* 1 */             boolean zM1046b = m1046b();
/* 5 */             int childCount = getChildCount();
/* 10 */            for (int i = 0; i < childCount; i++) {
/* 12 */                View childAt = getChildAt(i);
/* 18 */                if (childAt != this.f1819f) {
/* 25 */                    float f2 = 1.0f - this.f1827v;
/* 27 */                    int i2 = this.f1807V;
/* 32 */                    this.f1827v = f;
/* 38 */                    int i3 = ((int) (f2 * i2)) - ((int) ((1.0f - f) * i2));
/* 39 */                    if (zM1046b) {
/* 41 */                        i3 = -i3;
                            }
/* 42 */                    childAt.offsetLeftAndRight(i3);
                        }
                    }
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                    int i;
                    int right;
/* 1 */             super.draw(canvas);
/* 13 */            Drawable drawable = m1046b() ? this.f1815d : this.f1813c;
/* 27 */            View childAt = getChildCount() > 1 ? getChildAt(1) : null;
/* 28 */            if (childAt == null || drawable == null) {
/* 71 */                return;
                    }
/* 33 */            int top = childAt.getTop();
/* 37 */            int bottom = childAt.getBottom();
/* 41 */            int intrinsicWidth = drawable.getIntrinsicWidth();
/* 49 */            if (m1046b()) {
/* 51 */                right = childAt.getRight();
/* 55 */                i = intrinsicWidth + right;
                    } else {
/* 57 */                int left = childAt.getLeft();
/* 61 */                int i2 = left - intrinsicWidth;
/* 63 */                i = left;
/* 64 */                right = i2;
                    }
/* 65 */            drawable.setBounds(right, top, i, bottom);
/* 68 */            drawable.draw(canvas);
                }

                @Override // android.view.ViewGroup
                public final boolean drawChild(Canvas canvas, View view, long j) {
/* 9 */             boolean zM1046b = m1046b() ^ m1047c();
/* 10 */            j33 j33Var = this.f1814c0;
/* 12 */            if (zM1046b) {
/* 15 */                j33Var.f12056q = 1;
/* 17 */                ly0 systemGestureInsets = getSystemGestureInsets();
/* 21 */                if (systemGestureInsets != null) {
/* 31 */                    j33Var.f12054o = Math.max(j33Var.f12055p, systemGestureInsets.f13528a);
                        }
                    } else {
/* 35 */                j33Var.f12056q = 2;
/* 37 */                ly0 systemGestureInsets2 = getSystemGestureInsets();
/* 41 */                if (systemGestureInsets2 != null) {
/* 51 */                    j33Var.f12054o = Math.max(j33Var.f12055p, systemGestureInsets2.f13530c);
                        }
                    }
/* 57 */            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
/* 59 */            int iSave = canvas.save();
/* 65 */            if (this.f1817e && !layoutParams.f1831b && this.f1819f != null) {
/* 75 */                Rect rect = this.f1820f0;
/* 77 */                canvas.getClipBounds(rect);
/* 84 */                if (m1046b()) {
/* 98 */                    rect.left = Math.max(rect.left, this.f1819f.getRight());
                        } else {
/* 113 */                   rect.right = Math.min(rect.right, this.f1819f.getLeft());
                        }
/* 115 */               canvas.clipRect(rect);
                    }
/* 118 */           boolean zDrawChild = super.drawChild(canvas, view, j);
/* 122 */           canvas.restoreToCount(iSave);
/* 125 */           return zDrawChild;
                }

                /* JADX INFO: renamed from: e */
                public final boolean m1049e(float f) {
                    int paddingLeft;
/* 4 */             if (this.f1817e) {
/* 7 */                 boolean zM1046b = m1046b();
/* 17 */                LayoutParams layoutParams = (LayoutParams) this.f1819f.getLayoutParams();
/* 19 */                if (zM1046b) {
/* 27 */                    int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
/* 48 */                    paddingLeft = (int) (getWidth() - (((f * this.f1828w) + paddingRight) + this.f1819f.getWidth()));
                        } else {
/* 63 */                    paddingLeft = (int) ((f * this.f1828w) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                        }
/* 64 */                View view = this.f1819f;
/* 76 */                if (this.f1814c0.m5689u(view, paddingLeft, view.getTop())) {
/* 78 */                    int childCount = getChildCount();
/* 83 */                    for (int i = 0; i < childCount; i++) {
/* 85 */                        View childAt = getChildAt(i);
/* 94 */                        if (childAt.getVisibility() == 4) {
/* 96 */                            childAt.setVisibility(0);
                                }
                            }
/* 102 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 104 */                   postInvalidateOnAnimation();
/* 107 */                   return true;
                        }
                    }
/* 3 */             return false;
                }

                /* JADX INFO: renamed from: f */
                public final void m1050f(View view) {
                    int left;
                    int right;
                    int top;
                    int bottom;
/* 1 */             View view2 = view;
/* 3 */             boolean zM1046b = m1046b();
/* 19 */            int width = zM1046b ? getWidth() - getPaddingRight() : getPaddingLeft();
/* 38 */            int paddingLeft = zM1046b ? getPaddingLeft() : getWidth() - getPaddingRight();
/* 39 */            int paddingTop = getPaddingTop();
/* 51 */            int height = getHeight() - getPaddingBottom();
/* 52 */            if (view2 == null || !view2.isOpaque()) {
/* 77 */                left = 0;
/* 78 */                right = 0;
/* 79 */                top = 0;
/* 80 */                bottom = 0;
                    } else {
/* 60 */                left = view2.getLeft();
/* 64 */                right = view2.getRight();
/* 68 */                top = view2.getTop();
/* 72 */                bottom = view2.getBottom();
                    }
/* 81 */            int childCount = getChildCount();
/* 85 */            int i = 0;
/* 86 */            while (i < childCount) {
/* 90 */                View childAt = getChildAt(i);
/* 94 */                if (childAt == view2) {
/* 174 */                   return;
                        }
/* 103 */               if (childAt.getVisibility() != 8) {
/* 164 */                   childAt.setVisibility((Math.max(zM1046b ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zM1046b ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
                        }
/* 167 */               i++;
/* 169 */               view2 = view;
/* 171 */               zM1046b = zM1046b;
                    }
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
/* 4 */             LayoutParams layoutParams = new LayoutParams(-1, -1);
/* 8 */             layoutParams.f1830a = 0.0f;
/* 10 */            return layoutParams;
                }

                @Override // android.view.ViewGroup
                public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 4 */             if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
/* 10 */                LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
/* 13 */                layoutParams2.f1830a = 0.0f;
/* 15 */                return layoutParams2;
                    }
/* 18 */            LayoutParams layoutParams3 = new LayoutParams(layoutParams);
/* 21 */            layoutParams3.f1830a = 0.0f;
/* 23 */            return layoutParams3;
                }

                @Deprecated
                public int getCoveredFadeColor() {
/* 1 */             return this.f1811b;
                }

                public final int getLockMode() {
/* 1 */             return this.f1822h0;
                }

                public int getParallaxDistance() {
/* 1 */             return this.f1807V;
                }

                @Deprecated
                public int getSliderFadeColor() {
/* 1 */             return this.f1809a;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
                    c10 c10Var;
                    Activity activity;
/* 1 */             super.onAttachedToWindow();
/* 5 */             this.f1818e0 = true;
/* 9 */             if (this.f1826k0 != null) {
/* 11 */                Context context = getContext();
                        while (true) {
/* 17 */                    c10Var = null;
/* 18 */                    if (!(context instanceof ContextWrapper)) {
/* 34 */                        activity = null;
                                break;
                            } else {
/* 22 */                        if (context instanceof Activity) {
/* 24 */                            activity = (Activity) context;
                                    break;
                                }
/* 29 */                        context = ((ContextWrapper) context).getBaseContext();
                            }
                        }
/* 35 */                if (activity != null) {
/* 37 */                    il0 il0Var = this.f1826k0;
/* 39 */                    il0Var.getClass();
/* 42 */                    ig2 ig2Var = il0Var.f9705c;
/* 44 */                    if (ig2Var != null) {
/* 47 */                        ig2Var.cancel(null);
                            }
/* 72 */                    il0Var.f9705c = i13.m4443w(k50.m5964a(new of0(il0Var.f9704b)), null, new C2223tm(il0Var, activity, c10Var, 6), 3);
                        }
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
                    ig2 ig2Var;
/* 1 */             super.onDetachedFromWindow();
/* 5 */             this.f1818e0 = true;
/* 7 */             il0 il0Var = this.f1826k0;
/* 9 */             if (il0Var != null && (ig2Var = il0Var.f9705c) != null) {
/* 17 */                ig2Var.cancel(null);
                    }
/* 20 */            ArrayList arrayList = this.f1821g0;
/* 26 */            if (arrayList.size() > 0) {
/* 37 */                throw pm2.m7486i(0, arrayList);
                    }
/* 28 */            arrayList.clear();
                }

                @Override // android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    boolean z;
                    View childAt;
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 5 */             boolean z2 = this.f1817e;
/* 7 */             j33 j33Var = this.f1814c0;
/* 10 */            if (!z2 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
/* 30 */                int x = (int) motionEvent.getX();
/* 35 */                int y = (int) motionEvent.getY();
/* 36 */                j33Var.getClass();
/* 43 */                this.f1816d0 = j33.m5669l(childAt, x, y);
                    }
/* 47 */            if (!this.f1817e || (this.f1806U && actionMasked != 0)) {
/* 162 */               j33Var.m5671b();
/* 165 */               return super.onInterceptTouchEvent(motionEvent);
                    }
/* 59 */            if (actionMasked == 3 || actionMasked == 1) {
/* 158 */               j33Var.m5671b();
/* 58 */                return false;
                    }
/* 64 */            if (actionMasked == 0) {
/* 109 */               this.f1806U = false;
/* 111 */               float x2 = motionEvent.getX();
/* 115 */               float y2 = motionEvent.getY();
/* 119 */               this.f1808W = x2;
/* 121 */               this.f1810a0 = y2;
/* 127 */               j33Var.getClass();
/* 134 */               if (j33.m5669l(this.f1819f, (int) x2, (int) y2) && m1045a(this.f1819f)) {
/* 144 */                   z = true;
                        }
                        return !j33Var.m5688t(motionEvent) || z;
                    }
/* 67 */            if (actionMasked == 2) {
/* 70 */                float x3 = motionEvent.getX();
/* 74 */                float y3 = motionEvent.getY();
/* 81 */                float fAbs = Math.abs(x3 - this.f1808W);
/* 88 */                float fAbs2 = Math.abs(y3 - this.f1810a0);
/* 97 */                if (fAbs > j33Var.f12041b && fAbs2 > fAbs) {
/* 103 */                   j33Var.m5671b();
/* 106 */                   this.f1806U = true;
/* 58 */                    return false;
                        }
                    }
/* 146 */           z = false;
                    if (j33Var.m5688t(motionEvent)) {
                    }
                }

                /* JADX WARN: Code duplicated, block: B:42:0x00af  */
                /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
                /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
                /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
                /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
                /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    boolean z2;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    ot0 ot0Var;
                    int iWidth;
                    C2334wk c2334wk;
                    C0832d5 c0832d5;
/* 3 */             C0832d5 c0832d6 = C0832d5.f6993w;
/* 5 */             boolean zM1046b = m1046b();
/* 9 */             int i10 = i3 - i;
/* 18 */            int paddingRight = zM1046b ? getPaddingRight() : getPaddingLeft();
/* 29 */            int paddingLeft = zM1046b ? getPaddingLeft() : getPaddingRight();
/* 33 */            int paddingTop = getPaddingTop();
/* 37 */            int childCount = getChildCount();
/* 43 */            if (this.f1818e0) {
/* 57 */                this.f1823i = (this.f1817e && this.f1816d0) ? 0.0f : 1.0f;
                    }
/* 59 */            int i11 = paddingRight;
/* 60 */            int i12 = 0;
/* 61 */            while (i12 < childCount) {
/* 63 */                View childAt = getChildAt(i12);
/* 73 */                if (childAt.getVisibility() == 8) {
/* 75 */                    z2 = zM1046b;
                        } else {
/* 85 */                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 87 */                    int measuredWidth = childAt.getMeasuredWidth();
/* 93 */                    if (layoutParams.f1831b) {
/* 102 */                       int i13 = i10 - paddingLeft;
/* 110 */                       int iMin = (Math.min(paddingRight, i13) - i11) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
/* 112 */                       this.f1828w = iMin;
/* 119 */                       int i14 = zM1046b ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
/* 127 */                       z2 = zM1046b;
/* 136 */                       layoutParams.f1832c = (measuredWidth / 2) + ((i11 + i14) + iMin) > i13;
                                float f = iMin;
/* 142 */                       int i15 = (int) (this.f1823i * f);
/* 144 */                       i5 = i14 + i15 + i11;
/* 147 */                       this.f1823i = i15 / f;
                            } else {
/* 151 */                       z2 = zM1046b;
/* 157 */                       if (!this.f1817e || (i6 = this.f1807V) == 0) {
/* 172 */                           i5 = paddingRight;
                                } else {
/* 169 */                           i7 = (int) ((1.0f - this.f1823i) * i6);
/* 170 */                           i5 = paddingRight;
                                }
/* 174 */                       if (z2) {
/* 178 */                           i9 = (i10 - i5) + i7;
/* 179 */                           i8 = i9 - measuredWidth;
                                } else {
/* 182 */                           i8 = i5 - i7;
/* 184 */                           i9 = i8 + measuredWidth;
                                }
/* 191 */                       childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
/* 194 */                       ot0Var = this.f1824i0;
/* 196 */                       if (ot0Var != null) {
/* 198 */                           c2334wk = ot0Var.f14891a;
/* 210 */                           if (c2334wk.f18667c - c2334wk.f18665a > c2334wk.f18668d - c2334wk.f18666b) {
/* 212 */                               c0832d5 = C0832d5.f6981U;
                                    } else {
/* 215 */                               c0832d5 = c0832d6;
                                    }
/* 216 */                           if (c0832d5 == c0832d6 || !ot0Var.m7239a()) {
/* 237 */                               iWidth = 0;
                                    } else {
/* 232 */                               iWidth = this.f1824i0.f14891a.m9582a().width();
                                    }
                                } else {
/* 237 */                           iWidth = 0;
                                }
/* 247 */                       paddingRight = Math.abs(iWidth) + childAt.getWidth() + paddingRight;
/* 249 */                       i11 = i5;
                            }
/* 149 */                   i7 = 0;
/* 174 */                   if (z2) {
/* 178 */                       i9 = (i10 - i5) + i7;
/* 179 */                       i8 = i9 - measuredWidth;
                            } else {
/* 182 */                       i8 = i5 - i7;
/* 184 */                       i9 = i8 + measuredWidth;
                            }
/* 191 */                   childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
/* 194 */                   ot0Var = this.f1824i0;
/* 196 */                   if (ot0Var != null) {
/* 198 */                       c2334wk = ot0Var.f14891a;
/* 210 */                       if (c2334wk.f18667c - c2334wk.f18665a > c2334wk.f18668d - c2334wk.f18666b) {
/* 212 */                           c0832d5 = C0832d5.f6981U;
                                } else {
/* 215 */                           c0832d5 = c0832d6;
                                }
/* 216 */                       if (c0832d5 == c0832d6) {
/* 237 */                           iWidth = 0;
                                } else {
/* 237 */                           iWidth = 0;
                                }
                            } else {
/* 237 */                       iWidth = 0;
                            }
/* 247 */                   paddingRight = Math.abs(iWidth) + childAt.getWidth() + paddingRight;
/* 249 */                   i11 = i5;
                        }
/* 250 */               i12++;
/* 252 */               zM1046b = z2;
                    }
/* 258 */           if (this.f1818e0) {
/* 262 */               if (this.f1817e && this.f1807V != 0) {
/* 270 */                   m1048d(this.f1823i);
                        }
/* 275 */               m1050f(this.f1819f);
                    }
/* 279 */           this.f1818e0 = false;
                }

                /* JADX WARN: Code duplicated, block: B:142:0x00ed A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:144:0x00ed A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:23:0x0089 A[PHI: r17
  0x0089: PHI (r17v3 float) = (r17v1 float), (r17v4 float) binds: [B:19:0x007f, B:21:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:25:0x0099 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:26:0x009b  */
                /* JADX WARN: Code duplicated, block: B:27:0x009d  */
                /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
                /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
                /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
                /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
                /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
                /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:39:0x00da  */
                /* JADX WARN: Code duplicated, block: B:43:0x00df A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
                /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
                /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
                /* JADX WARN: Code duplicated, block: B:94:0x01af  */
                /* JADX WARN: Type inference failed for: r7v0 */
                /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r7v31 */
                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
                    int paddingTop;
                    int iMin;
                    int i3;
                    int iMax;
                    int iMakeMeasureSpec;
                    int i4;
                    ArrayList arrayList;
                    int i5;
                    int i6;
                    int minimumWidth;
                    int iMax2;
                    int i7;
                    int iMakeMeasureSpec2;
                    int measuredHeight;
                    boolean z;
                    int i8;
/* 5 */             int mode = View.MeasureSpec.getMode(i);
/* 9 */             int size = View.MeasureSpec.getSize(i);
/* 13 */            int mode2 = View.MeasureSpec.getMode(i2);
/* 17 */            int size2 = View.MeasureSpec.getSize(i2);
/* 23 */            ?? r7 = 0;
/* 26 */            if (mode2 != Integer.MIN_VALUE) {
/* 42 */                iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
/* 31 */                paddingTop = iMin;
                    } else {
/* 53 */                paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
/* 55 */                iMin = 0;
                    }
/* 67 */            int iMax3 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
/* 71 */            int childCount = getChildCount();
/* 76 */            if (childCount > 2) {
/* 82 */                AbstractC1245n0.m4876d("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
                    }
/* 86 */            this.f1819f = null;
/* 88 */            int i9 = 0;
/* 89 */            boolean z2 = false;
/* 91 */            int i10 = iMax3;
/* 92 */            float f = 0.0f;
                    while (true) {
/* 96 */                i3 = 8;
/* 98 */                if (i9 >= childCount) {
                            break;
                        }
/* 102 */               View childAt = getChildAt(i9);
/* 112 */               LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 118 */               if (childAt.getVisibility() == 8) {
/* 120 */                   layoutParams.f1832c = r7;
                        } else {
/* 124 */                   float f2 = layoutParams.f1830a;
/* 128 */                   if (f2 > 0.0f) {
/* 130 */                       f += f2;
/* 134 */                       if (((ViewGroup.MarginLayoutParams) layoutParams).width != 0) {
/* 145 */                           iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r7);
/* 149 */                           i7 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
/* 152 */                           if (i7 == -2) {
/* 154 */                               if (mode == 0) {
/* 156 */                                   i8 = mode;
                                        } else {
/* 158 */                                   i8 = Integer.MIN_VALUE;
                                        }
/* 160 */                               iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i8);
                                    } else if (i7 == -1) {
/* 168 */                               iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                                    } else {
/* 175 */                               iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                                    }
/* 195 */                           childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
/* 198 */                           int measuredWidth = childAt.getMeasuredWidth();
/* 202 */                           measuredHeight = childAt.getMeasuredHeight();
/* 206 */                           if (measuredHeight > iMin) {
/* 210 */                               if (mode2 == Integer.MIN_VALUE) {
/* 212 */                                   iMin = Math.min(measuredHeight, paddingTop);
                                        } else if (mode2 == 0) {
/* 219 */                                   iMin = measuredHeight;
                                        }
                                    }
/* 220 */                           i10 -= measuredWidth;
/* 221 */                           if (i9 != 0) {
/* 224 */                               if (i10 < 0) {
/* 226 */                                   z = true;
                                        } else {
/* 229 */                                   z = false;
                                        }
/* 230 */                               layoutParams.f1831b = z;
/* 232 */                               z2 |= z;
/* 234 */                               if (z) {
/* 236 */                                   this.f1819f = childAt;
                                        }
                                    }
                                }
                            } else {
/* 145 */                       iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r7);
/* 149 */                       i7 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
/* 152 */                       if (i7 == -2) {
/* 154 */                           if (mode == 0) {
/* 156 */                               i8 = mode;
                                    } else {
/* 158 */                               i8 = Integer.MIN_VALUE;
                                    }
/* 160 */                           iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i8);
                                } else if (i7 == -1) {
/* 168 */                           iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                                } else {
/* 175 */                           iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                                }
/* 195 */                       childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
/* 198 */                       int measuredWidth2 = childAt.getMeasuredWidth();
/* 202 */                       measuredHeight = childAt.getMeasuredHeight();
/* 206 */                       if (measuredHeight > iMin) {
/* 210 */                           if (mode2 == Integer.MIN_VALUE) {
/* 212 */                               iMin = Math.min(measuredHeight, paddingTop);
                                    } else if (mode2 == 0) {
/* 219 */                               iMin = measuredHeight;
                                    }
                                }
/* 220 */                       i10 -= measuredWidth2;
/* 221 */                       if (i9 != 0) {
/* 224 */                           if (i10 < 0) {
/* 226 */                               z = true;
                                    } else {
/* 229 */                               z = false;
                                    }
/* 230 */                           layoutParams.f1831b = z;
/* 232 */                           z2 |= z;
/* 234 */                           if (z) {
/* 236 */                               this.f1819f = childAt;
                                    }
                                }
                            }
                        }
/* 238 */               i9++;
/* 242 */               r7 = 0;
                    }
/* 248 */           int i11 = 1;
/* 250 */           if (z2 || f > 0.0f) {
/* 256 */               int i12 = 0;
/* 257 */               while (i12 < childCount) {
/* 259 */                   View childAt2 = getChildAt(i12);
/* 267 */                   if (childAt2.getVisibility() == i3) {
/* 269 */                       i4 = i12;
                            } else {
/* 277 */                       LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
/* 279 */                       int i13 = ((ViewGroup.MarginLayoutParams) layoutParams2).width;
/* 281 */                       float f3 = layoutParams2.f1830a;
/* 291 */                       int measuredWidth3 = (i13 != 0 || f3 <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
/* 295 */                       if (z2) {
/* 302 */                           iMax = iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
/* 306 */                           iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                                } else if (f3 > 0.0f) {
/* 327 */                           iMax = ((int) ((f3 * Math.max(0, i10)) / f)) + measuredWidth3;
/* 328 */                           iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                                } else {
/* 333 */                           iMax = measuredWidth3;
/* 334 */                           iMakeMeasureSpec = 0;
                                }
/* 343 */                       int paddingBottom = getPaddingBottom() + getPaddingTop();
/* 348 */                       LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
/* 350 */                       i4 = i12;
/* 375 */                       int iMakeMeasureSpec3 = (((ViewGroup.MarginLayoutParams) layoutParams3).width != 0 || layoutParams3.f1830a <= 0.0f) ? View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i2, paddingBottom, ((ViewGroup.MarginLayoutParams) layoutParams3).height);
/* 379 */                       if (measuredWidth3 != iMax) {
/* 381 */                           childAt2.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
/* 384 */                           int measuredHeight2 = childAt2.getMeasuredHeight();
/* 388 */                           if (measuredHeight2 > iMin) {
/* 392 */                               if (mode2 == Integer.MIN_VALUE) {
/* 394 */                                   measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                                        } else if (mode2 == 0) {
                                        }
/* 398 */                               iMin = measuredHeight2;
                                    }
                                }
                            }
/* 403 */                   i12 = i4 + 1;
/* 405 */                   i3 = 8;
                        }
                    }
/* 409 */           ot0 ot0Var = this.f1824i0;
/* 411 */           if (ot0Var == null || !ot0Var.m7239a() || this.f1824i0.f14891a.m9582a().left == 0 || this.f1824i0.f14891a.m9582a().top != 0) {
/* 432 */               arrayList = null;
                    } else {
/* 447 */               ot0 ot0Var2 = this.f1824i0;
/* 450 */               int[] iArr = new int[2];
/* 452 */               getLocationInWindow(iArr);
/* 459 */               int i14 = iArr[0];
/* 475 */               Rect rect = new Rect(i14, iArr[1], getWidth() + i14, getWidth() + iArr[1]);
/* 486 */               Rect rect2 = new Rect(ot0Var2.f14891a.m9582a());
/* 489 */               boolean zIntersect = rect2.intersect(rect);
/* 497 */               if (!(rect2.width() == 0 && rect2.height() == 0) && zIntersect) {
/* 517 */                   rect2.offset(-iArr[0], -iArr[1]);
                        } else {
/* 507 */                   rect2 = null;
                        }
/* 520 */               if (rect2 == null) {
/* 432 */                   arrayList = null;
                        } else {
/* 552 */                   Rect rect3 = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rect2.left), getHeight() - getPaddingBottom());
/* 563 */                   int width = getWidth() - getPaddingRight();
/* 598 */                   arrayList = new ArrayList(Arrays.asList(rect3, new Rect(Math.min(width, rect2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
                        }
                    }
/* 601 */           if (arrayList != null && !z2) {
/* 605 */               int i15 = 0;
/* 606 */               while (i15 < childCount) {
/* 608 */                   View childAt3 = getChildAt(i15);
/* 618 */                   if (childAt3.getVisibility() != 8) {
/* 631 */                       Rect rect4 = (Rect) arrayList.get(i15);
/* 637 */                       LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
/* 643 */                       int i16 = ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin;
/* 650 */                       int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
/* 664 */                       childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), iMakeMeasureSpec4);
/* 676 */                       if ((childAt3.getMeasuredWidthAndState() & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != i11) {
/* 678 */                           boolean z3 = childAt3 instanceof bf2;
/* 680 */                           if (z3) {
/* 685 */                               i6 = 0;
/* 686 */                               View childAt4 = ((bf2) childAt3).getChildAt(0);
/* 690 */                               WeakHashMap weakHashMap = e33.f7494a;
/* 692 */                               minimumWidth = childAt4.getMinimumWidth();
                                    } else {
/* 697 */                               i6 = 0;
/* 698 */                               WeakHashMap weakHashMap2 = e33.f7494a;
/* 700 */                               minimumWidth = childAt3.getMinimumWidth();
                                    }
/* 704 */                           if (minimumWidth != 0) {
/* 728 */                               if (rect4.width() < (z3 ? ((bf2) childAt3).getChildAt(i6).getMinimumWidth() : childAt3.getMinimumWidth())) {
                                        }
                                    }
/* 743 */                           childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), 1073741824), iMakeMeasureSpec4);
                                }
/* 755 */                       childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i16, 1073741824), iMakeMeasureSpec4);
/* 758 */                       if (i15 != 0) {
/* 762 */                           i5 = 1;
/* 763 */                           layoutParams4.f1831b = true;
/* 765 */                           this.f1819f = childAt3;
/* 767 */                           z2 = true;
                                }
/* 769 */                       i15++;
/* 771 */                       i11 = i5;
                            }
/* 760 */                   i5 = 1;
/* 769 */                   i15++;
/* 771 */                   i11 = i5;
                        }
                    }
/* 775 */           boolean z4 = z2;
/* 787 */           setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + iMin);
/* 790 */           this.f1817e = z4;
/* 792 */           j33 j33Var = this.f1814c0;
/* 796 */           if (j33Var.f12040a == 0 || z4) {
/* 803 */               return;
                    }
/* 800 */           j33Var.m5670a();
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 13 */            super.onRestoreInstanceState(savedState.f1292a);
/* 16 */            boolean z = savedState.f1833c;
/* 18 */            boolean z2 = this.f1817e;
/* 20 */            if (z) {
/* 23 */                if (!z2) {
/* 25 */                    this.f1816d0 = true;
                        }
/* 29 */                if (this.f1818e0 || m1049e(0.0f)) {
/* 38 */                    this.f1816d0 = true;
                        }
                    } else {
/* 42 */                if (!z2) {
/* 44 */                    this.f1816d0 = false;
                        }
/* 48 */                if (this.f1818e0 || m1049e(1.0f)) {
/* 58 */                    this.f1816d0 = false;
                        }
                    }
/* 62 */            this.f1816d0 = savedState.f1833c;
/* 66 */            setLockMode(savedState.f1834d);
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 21 */            savedState.f1833c = this.f1817e ? m1047c() : this.f1816d0;
/* 25 */            savedState.f1834d = this.f1822h0;
/* 27 */            return savedState;
                }

                @Override // android.view.View
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onSizeChanged(i, i2, i3, i4);
/* 4 */             if (i != i3) {
/* 7 */                 this.f1818e0 = true;
                    }
                }

                @Override // android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 3 */             if (!this.f1817e) {
/* 5 */                 return super.onTouchEvent(motionEvent);
                    }
/* 10 */            j33 j33Var = this.f1814c0;
/* 12 */            j33Var.m5681m(motionEvent);
/* 15 */            int actionMasked = motionEvent.getActionMasked();
/* 20 */            if (actionMasked == 0) {
/* 92 */                float x = motionEvent.getX();
/* 96 */                float y = motionEvent.getY();
/* 100 */               this.f1808W = x;
/* 102 */               this.f1810a0 = y;
/* 19 */                return true;
                    }
/* 22 */            if (actionMasked == 1 && m1045a(this.f1819f)) {
/* 33 */                float x2 = motionEvent.getX();
/* 37 */                float y2 = motionEvent.getY();
/* 43 */                float f = x2 - this.f1808W;
/* 47 */                float f2 = y2 - this.f1810a0;
/* 49 */                int i = j33Var.f12041b;
/* 58 */                if ((f2 * f2) + (f * f) < i * i && j33.m5669l(this.f1819f, (int) x2, (int) y2)) {
/* 73 */                    if (!this.f1817e) {
/* 75 */                        this.f1816d0 = false;
                            }
/* 79 */                    if (this.f1818e0 || m1049e(1.0f)) {
/* 89 */                        this.f1816d0 = false;
                            }
                        }
                    }
/* 19 */            return true;
                }

                @Override // android.view.ViewGroup, android.view.ViewManager
                public final void removeView(View view) {
/* 7 */             if (view.getParent() instanceof bf2) {
/* 15 */                super.removeView((View) view.getParent());
                    } else {
/* 19 */                super.removeView(view);
                    }
                }

                @Override // android.view.ViewGroup, android.view.ViewParent
                public final void requestChildFocus(View view, View view2) {
/* 1 */             super.requestChildFocus(view, view2);
/* 8 */             if (isInTouchMode() || this.f1817e) {
/* 23 */                return;
                    }
/* 21 */            this.f1816d0 = view == this.f1819f;
                }

                @Deprecated
                public void setCoveredFadeColor(int i) {
/* 1 */             this.f1811b = i;
                }

                public final void setLockMode(int i) {
/* 1 */             this.f1822h0 = i;
                }

                @Deprecated
                public void setPanelSlideListener(af2 af2Var) {
/* 1 */             if (af2Var != null) {
/* 5 */                 this.f1812b0.add(af2Var);
                    }
                }

                public void setParallaxDistance(int i) {
/* 1 */             this.f1807V = i;
/* 3 */             requestLayout();
                }

                @Deprecated
                public void setShadowDrawable(Drawable drawable) {
/* 1 */             setShadowDrawableLeft(drawable);
                }

                public void setShadowDrawableLeft(Drawable drawable) {
/* 1 */             this.f1813c = drawable;
                }

                public void setShadowDrawableRight(Drawable drawable) {
/* 1 */             this.f1815d = drawable;
                }

                @Deprecated
                public void setShadowResource(int i) {
/* 9 */             setShadowDrawableLeft(getResources().getDrawable(i));
                }

                public void setShadowResourceLeft(int i) {
/* 9 */             setShadowDrawableLeft(v00.getDrawable(getContext(), i));
                }

                public void setShadowResourceRight(int i) {
/* 9 */             setShadowDrawableRight(v00.getDrawable(getContext(), i));
                }

                @Deprecated
                public void setSliderFadeColor(int i) {
/* 1 */             this.f1809a = i;
                }

                @Override // android.view.ViewGroup
/* 23 */        public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 24 */            return new LayoutParams(getContext(), attributeSet);
                }

/* 117 */       public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
/* 118 */           this(context, attributeSet, 0);
                }
            }
