            package com.google.android.material.bottomsheet;

            import android.R;
            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.os.Build;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.util.TypedValue;
            import android.view.AbsSavedState;
            import android.view.MotionEvent;
            import android.view.VelocityTracker;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import androidx.coordinatorlayout.widget.C0080c;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$string;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.WeakHashMap;
            import p000.C1951n4;
            import p000.C1954n7;
            import p000.C2164s0;
            import p000.C2184sk;
            import p000.C2201t0;
            import p000.C2221tk;
            import p000.C2258uk;
            import p000.C2518z0;
            import p000.RunnableC2064pb;
            import p000.de3;
            import p000.e33;
            import p000.fd1;
            import p000.fm0;
            import p000.j33;
            import p000.kb1;
            import p000.pm2;
            import p000.s23;
            import p000.tc2;
            import p000.zr3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 47 */    public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

                /* JADX INFO: renamed from: b0 */
                public static final int f4476b0 = R$style.Widget_Design_BottomSheet_Modal;

                /* JADX INFO: renamed from: A */
                public final int f4477A;

                /* JADX INFO: renamed from: B */
                public int f4478B;

                /* JADX INFO: renamed from: C */
                public int f4479C;

                /* JADX INFO: renamed from: D */
                public final float f4480D;

                /* JADX INFO: renamed from: E */
                public int f4481E;

                /* JADX INFO: renamed from: F */
                public final float f4482F;

                /* JADX INFO: renamed from: G */
                public boolean f4483G;

                /* JADX INFO: renamed from: H */
                public boolean f4484H;

                /* JADX INFO: renamed from: I */
                public final boolean f4485I;

                /* JADX INFO: renamed from: J */
                public int f4486J;

                /* JADX INFO: renamed from: K */
                public j33 f4487K;

                /* JADX INFO: renamed from: L */
                public boolean f4488L;

                /* JADX INFO: renamed from: M */
                public int f4489M;

                /* JADX INFO: renamed from: N */
                public boolean f4490N;

                /* JADX INFO: renamed from: O */
                public int f4491O;

                /* JADX INFO: renamed from: P */
                public int f4492P;

                /* JADX INFO: renamed from: Q */
                public int f4493Q;

                /* JADX INFO: renamed from: R */
                public WeakReference f4494R;

                /* JADX INFO: renamed from: S */
                public WeakReference f4495S;

                /* JADX INFO: renamed from: T */
                public final ArrayList f4496T;

                /* JADX INFO: renamed from: U */
                public VelocityTracker f4497U;

                /* JADX INFO: renamed from: V */
                public int f4498V;

                /* JADX INFO: renamed from: W */
                public int f4499W;

                /* JADX INFO: renamed from: X */
                public boolean f4500X;

                /* JADX INFO: renamed from: Y */
                public HashMap f4501Y;

                /* JADX INFO: renamed from: Z */
                public int f4502Z;

                /* JADX INFO: renamed from: a */
                public final int f4503a;

                /* JADX INFO: renamed from: a0 */
                public final C2221tk f4504a0;

                /* JADX INFO: renamed from: b */
                public boolean f4505b;

                /* JADX INFO: renamed from: c */
                public final float f4506c;

                /* JADX INFO: renamed from: d */
                public int f4507d;

                /* JADX INFO: renamed from: e */
                public boolean f4508e;

                /* JADX INFO: renamed from: f */
                public int f4509f;

                /* JADX INFO: renamed from: g */
                public final int f4510g;

                /* JADX INFO: renamed from: h */
                public final fd1 f4511h;

                /* JADX INFO: renamed from: i */
                public final ColorStateList f4512i;

                /* JADX INFO: renamed from: j */
                public final int f4513j;

                /* JADX INFO: renamed from: k */
                public final int f4514k;

                /* JADX INFO: renamed from: l */
                public int f4515l;

                /* JADX INFO: renamed from: m */
                public final boolean f4516m;

                /* JADX INFO: renamed from: n */
                public final boolean f4517n;

                /* JADX INFO: renamed from: o */
                public final boolean f4518o;

                /* JADX INFO: renamed from: p */
                public final boolean f4519p;

                /* JADX INFO: renamed from: q */
                public final boolean f4520q;

                /* JADX INFO: renamed from: r */
                public final boolean f4521r;

                /* JADX INFO: renamed from: s */
                public final boolean f4522s;

                /* JADX INFO: renamed from: t */
                public final boolean f4523t;

                /* JADX INFO: renamed from: u */
                public int f4524u;

                /* JADX INFO: renamed from: v */
                public int f4525v;

                /* JADX INFO: renamed from: w */
                public final tc2 f4526w;

                /* JADX INFO: renamed from: x */
                public boolean f4527x;

                /* JADX INFO: renamed from: y */
                public final C2258uk f4528y;

                /* JADX INFO: renamed from: z */
                public final ValueAnimator f4529z;

                public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
                    int i;
/* 1 */             super(context, attributeSet);
/* 5 */             this.f4503a = 0;
/* 8 */             this.f4505b = true;
/* 11 */            this.f4513j = -1;
/* 13 */            this.f4514k = -1;
/* 20 */            this.f4528y = new C2258uk(this);
/* 24 */            this.f4480D = 0.5f;
/* 28 */            this.f4482F = -1.0f;
/* 30 */            this.f4485I = true;
/* 33 */            this.f4486J = 4;
/* 40 */            this.f4496T = new ArrayList();
/* 42 */            this.f4502Z = -1;
/* 49 */            this.f4504a0 = new C2221tk(this);
/* 61 */            this.f4510g = context.getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size);
/* 65 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
/* 75 */            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_backgroundTint)) {
/* 83 */                this.f4512i = de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.BottomSheetBehavior_Layout_backgroundTint);
                    }
/* 91 */            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
/* 105 */               this.f4526w = tc2.m8775b(context, attributeSet, R$attr.bottomSheetStyle, f4476b0).m8478a();
                    }
/* 107 */           tc2 tc2Var = this.f4526w;
/* 109 */           if (tc2Var != null) {
/* 114 */               fd1 fd1Var = new fd1(tc2Var);
/* 117 */               this.f4511h = fd1Var;
/* 119 */               fd1Var.m3739k(context);
/* 122 */               ColorStateList colorStateList = this.f4512i;
/* 124 */               if (colorStateList != null) {
/* 128 */                   this.f4511h.m3742n(colorStateList);
                        } else {
/* 134 */                   TypedValue typedValue = new TypedValue();
/* 144 */                   context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
/* 151 */                   this.f4511h.setTint(typedValue.data);
                        }
                    }
/* 160 */           ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
/* 164 */           this.f4529z = valueAnimatorOfFloat;
/* 168 */           valueAnimatorOfFloat.setDuration(500L);
/* 178 */           this.f4529z.addUpdateListener(new C2184sk(this, 0));
/* 187 */           this.f4482F = typedArrayObtainStyledAttributes.getDimension(R$styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
/* 195 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
/* 203 */               this.f4513j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_android_maxWidth, -1);
                    }
/* 211 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
/* 219 */               this.f4514k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_android_maxHeight, -1);
                    }
/* 223 */           TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
/* 227 */           if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
/* 243 */               m2267z(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
                    } else {
/* 233 */               m2267z(i);
                    }
/* 248 */           boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false);
/* 254 */           if (this.f4483G != z) {
/* 256 */               this.f4483G = z;
/* 258 */               if (!z && this.f4486J == 5) {
/* 265 */                   m2254A(4);
                        }
/* 268 */               m2258E();
                    }
/* 277 */           this.f4516m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
/* 281 */           boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true);
/* 287 */           if (this.f4505b != z2) {
/* 290 */               this.f4505b = z2;
/* 294 */               if (this.f4494R != null) {
/* 296 */                   m2262s();
                        }
/* 312 */               m2255B((this.f4505b && this.f4486J == 6) ? 3 : this.f4486J);
/* 315 */               m2258E();
                    }
/* 324 */           this.f4484H = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
/* 332 */           this.f4485I = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_draggable, true);
/* 340 */           this.f4503a = typedArrayObtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
/* 344 */           float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
/* 352 */           if (f <= 0.0f || f >= 1.0f) {
/* 488 */               C1951n4.m6859j("ratio must be a float value between 0 and 1");
/* 491 */               throw null;
                    }
/* 360 */           this.f4480D = f;
/* 364 */           if (this.f4494R != null) {
/* 372 */               this.f4479C = (int) ((1.0f - f) * this.f4493Q);
                    }
/* 376 */           TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
/* 382 */           if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
/* 403 */               int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
/* 407 */               if (dimensionPixelOffset < 0) {
/* 482 */                   C1951n4.m6859j("offset must be greater than or equal to 0");
/* 485 */                   throw null;
                        }
/* 409 */               this.f4477A = dimensionPixelOffset;
                    } else {
/* 390 */               int i2 = typedValuePeekValue2.data;
/* 392 */               if (i2 < 0) {
/* 397 */                   C1951n4.m6859j("offset must be greater than or equal to 0");
/* 400 */                   throw null;
                        }
/* 394 */               this.f4477A = i2;
                    }
/* 417 */           this.f4517n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
/* 425 */           this.f4518o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
/* 433 */           this.f4519p = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
/* 441 */           this.f4520q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
/* 449 */           this.f4521r = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
/* 457 */           this.f4522s = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
/* 465 */           this.f4523t = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
/* 467 */           typedArrayObtainStyledAttributes.recycle();
/* 479 */           this.f4506c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                }

                /* JADX INFO: renamed from: v */
                public static View m2252v(View view) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 7 */             if (s23.m8378p(view)) {
/* 9 */                 return view;
                    }
/* 12 */            if (!(view instanceof ViewGroup)) {
/* 37 */                return null;
                    }
/* 14 */            ViewGroup viewGroup = (ViewGroup) view;
/* 16 */            int childCount = viewGroup.getChildCount();
/* 21 */            for (int i = 0; i < childCount; i++) {
/* 27 */                View viewM2252v = m2252v(viewGroup.getChildAt(i));
/* 31 */                if (viewM2252v != null) {
/* 33 */                    return viewM2252v;
                        }
                    }
/* 37 */            return null;
                }

                /* JADX INFO: renamed from: w */
                public static int m2253w(int i, int i2, int i3, int i4) {
/* 1 */             int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
/* 6 */             if (i3 == -1) {
/* 8 */                 return childMeasureSpec;
                    }
/* 9 */             int mode = View.MeasureSpec.getMode(childMeasureSpec);
/* 13 */            int size = View.MeasureSpec.getSize(childMeasureSpec);
/* 19 */            if (mode == 1073741824) {
/* 39 */                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
                    }
/* 21 */            if (size != 0) {
/* 24 */                i3 = Math.min(size, i3);
                    }
/* 30 */            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                }

                /* JADX INFO: renamed from: A */
                public final void m2254A(int i) {
/* 2 */             if (i == 1 || i == 2) {
/* 134 */               throw new IllegalArgumentException(fm0.m3789o(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
/* 10 */            if (!this.f4483G && i == 5) {
/* 31 */                AbstractC1245n0.m4889q("BottomSheetBehavior", "Cannot set state: " + i);
/* 34 */                return;
                    }
/* 52 */            int i2 = (i == 6 && this.f4505b && m2266y(i) <= this.f4478B) ? 3 : i;
/* 53 */            WeakReference weakReference = this.f4494R;
/* 55 */            if (weakReference == null || weakReference.get() == null) {
/* 105 */               m2255B(i);
/* 108 */               return;
                    }
/* 70 */            View view = (View) this.f4494R.get();
/* 74 */            RunnableC2064pb runnableC2064pb = new RunnableC2064pb(this, view, i2);
/* 77 */            ViewParent parent = view.getParent();
/* 81 */            if (parent != null && parent.isLayoutRequested()) {
/* 89 */                WeakHashMap weakHashMap = e33.f7494a;
/* 95 */                if (view.isAttachedToWindow()) {
/* 97 */                    view.post(runnableC2064pb);
/* 100 */                   return;
                        }
                    }
/* 101 */           runnableC2064pb.run();
                }

                /* JADX INFO: renamed from: B */
                public final void m2255B(int i) {
/* 3 */             if (this.f4486J == i) {
/* 33 */                return;
                    }
/* 6 */             this.f4486J = i;
/* 12 */            if (i != 4 && i != 3 && i != 6) {
/* 18 */                boolean z = this.f4483G;
                    }
/* 20 */            WeakReference weakReference = this.f4494R;
/* 22 */            if (weakReference == null || ((View) weakReference.get()) == null) {
/* 33 */                return;
                    }
/* 35 */            if (i == 3) {
/* 38 */                m2260G(true);
                    } else if (i == 6 || i == 5 || i == 4) {
/* 48 */                m2260G(false);
                    }
/* 51 */            m2259F(i);
/* 54 */            ArrayList arrayList = this.f4496T;
/* 60 */            if (arrayList.size() > 0) {
/* 70 */                throw pm2.m7486i(0, arrayList);
                    }
/* 62 */            m2258E();
                }

                /* JADX INFO: renamed from: C */
                public final boolean m2256C(View view, float f) {
/* 4 */             if (this.f4484H) {
/* 3 */                 return true;
                    }
/* 14 */            if (view.getTop() < this.f4481E) {
/* 13 */                return false;
                    }
                    return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.f4481E)) / ((float) m2263t()) > 0.5f;
                }

                /* JADX INFO: renamed from: D */
                public final void m2257D(int i, View view, boolean z) {
/* 1 */             int iM2266y = m2266y(i);
/* 5 */             j33 j33Var = this.f4487K;
/* 7 */             if (j33Var == null || (!z ? j33Var.m5689u(view, view.getLeft(), iM2266y) : j33Var.m5687s(view.getLeft(), iM2266y))) {
/* 45 */                m2255B(i);
/* 48 */                return;
                    }
/* 33 */            m2255B(2);
/* 36 */            m2259F(i);
/* 41 */            this.f4528y.m9033a(i);
                }

                /* JADX INFO: renamed from: E */
                public final void m2258E() {
                    View view;
                    int iM10230a;
/* 1 */             WeakReference weakReference = this.f4494R;
/* 3 */             if (weakReference == null || (view = (View) weakReference.get()) == null) {
/* 260 */               return;
                    }
/* 19 */            e33.m3315k(524288, view);
/* 23 */            e33.m3311g(0, view);
/* 28 */            e33.m3315k(262144, view);
/* 31 */            e33.m3311g(0, view);
/* 36 */            e33.m3315k(1048576, view);
/* 39 */            e33.m3311g(0, view);
/* 42 */            int i = this.f4502Z;
/* 45 */            if (i != -1) {
/* 47 */                e33.m3315k(i, view);
/* 50 */                e33.m3311g(0, view);
                    }
/* 55 */            int i2 = 1;
/* 56 */            int i3 = 6;
/* 57 */            if (!this.f4505b && this.f4486J != 6) {
/* 69 */                String string = view.getResources().getString(R$string.bottomsheet_action_expand_halfway);
/* 75 */                C1954n7 c1954n7 = new C1954n7(this, i3, i2);
/* 78 */                ArrayList arrayListM3309e = e33.m3309e(view);
/* 82 */                int i4 = 0;
                        while (true) {
/* 87 */                    if (i4 >= arrayListM3309e.size()) {
/* 124 */                       int i5 = 0;
/* 125 */                       int i6 = -1;
                                while (true) {
/* 126 */                           int[] iArr = e33.f7497d;
/* 130 */                           if (i5 >= 32 || i6 != -1) {
                                        break;
                                    }
/* 134 */                           int i7 = iArr[i5];
/* 137 */                           boolean z = true;
/* 142 */                           for (int i8 = 0; i8 < arrayListM3309e.size(); i8++) {
/* 159 */                               z &= ((C2518z0) arrayListM3309e.get(i8)).m10230a() != i7;
                                    }
/* 163 */                           if (z) {
/* 165 */                               i6 = i7;
                                    }
/* 166 */                           i5++;
                                }
/* 169 */                       iM10230a = i6;
                                break;
                            }
/* 107 */                   if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C2518z0) arrayListM3309e.get(i4)).f19883a).getLabel())) {
/* 115 */                       iM10230a = ((C2518z0) arrayListM3309e.get(i4)).m10230a();
                                break;
                            }
/* 121 */                   i4++;
                        }
/* 170 */               if (iM10230a != -1) {
/* 176 */                   C2518z0 c2518z0 = new C2518z0(null, iM10230a, string, c1954n7, null);
/* 179 */                   View.AccessibilityDelegate accessibilityDelegateM3308d = e33.m3308d(view);
/* 198 */                   C2201t0 c2201t0 = accessibilityDelegateM3308d == null ? null : accessibilityDelegateM3308d instanceof C2164s0 ? ((C2164s0) accessibilityDelegateM3308d).f16369a : new C2201t0(accessibilityDelegateM3308d);
/* 202 */                   if (c2201t0 == null) {
/* 206 */                       c2201t0 = new C2201t0();
                            }
/* 209 */                   e33.m3318n(view, c2201t0);
/* 216 */                   e33.m3315k(c2518z0.m10230a(), view);
/* 223 */                   e33.m3309e(view).add(c2518z0);
/* 226 */                   e33.m3311g(0, view);
                        }
/* 229 */               this.f4502Z = iM10230a;
                    }
/* 233 */           if (this.f4483G) {
/* 237 */               int i9 = 5;
/* 238 */               if (this.f4486J != 5) {
/* 247 */                   e33.m3316l(view, C2518z0.f19879l, new C1954n7(this, i9, i2));
                        }
                    }
/* 250 */           int i10 = this.f4486J;
/* 252 */           int i11 = 4;
/* 253 */           int i12 = 3;
/* 254 */           if (i10 == 3) {
/* 310 */               e33.m3316l(view, C2518z0.f19878k, new C1954n7(this, this.f4505b ? 4 : 6, i2));
/* 313 */               return;
                    }
/* 256 */           if (i10 == 4) {
/* 294 */               e33.m3316l(view, C2518z0.f19877j, new C1954n7(this, this.f4505b ? 3 : 6, i2));
                    } else {
/* 258 */               if (i10 != 6) {
/* 260 */                   return;
                        }
/* 268 */               e33.m3316l(view, C2518z0.f19878k, new C1954n7(this, i11, i2));
/* 278 */               e33.m3316l(view, C2518z0.f19877j, new C1954n7(this, i12, i2));
                    }
                }

                /* JADX INFO: renamed from: F */
                public final void m2259F(int i) {
                    ValueAnimator valueAnimator;
/* 2 */             if (i == 2) {
/* 57 */                return;
                    }
/* 12 */            boolean z = i == 3;
/* 15 */            if (this.f4527x != z) {
/* 17 */                this.f4527x = z;
/* 21 */                if (this.f4511h == null || (valueAnimator = this.f4529z) == null) {
/* 57 */                    return;
                        }
/* 31 */                if (valueAnimator.isRunning()) {
/* 33 */                    valueAnimator.reverse();
/* 36 */                    return;
                        }
/* 43 */                float f = z ? 0.0f : 1.0f;
/* 51 */                valueAnimator.setFloatValues(1.0f - f, f);
/* 54 */                valueAnimator.start();
                    }
                }

                /* JADX INFO: renamed from: G */
                public final void m2260G(boolean z) {
/* 1 */             WeakReference weakReference = this.f4494R;
/* 3 */             if (weakReference == null) {
/* 79 */                return;
                    }
/* 12 */            ViewParent parent = ((View) weakReference.get()).getParent();
/* 18 */            if (parent instanceof CoordinatorLayout) {
/* 21 */                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
/* 23 */                int childCount = coordinatorLayout.getChildCount();
/* 27 */                if (z) {
/* 31 */                    if (this.f4501Y != null) {
/* 79 */                        return;
                            } else {
/* 38 */                        this.f4501Y = new HashMap(childCount);
                            }
                        }
/* 41 */                for (int i = 0; i < childCount; i++) {
/* 43 */                    View childAt = coordinatorLayout.getChildAt(i);
/* 53 */                    if (childAt != this.f4494R.get() && z) {
/* 68 */                        this.f4501Y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                        }
/* 74 */                if (z) {
/* 79 */                    return;
                        }
/* 77 */                this.f4501Y = null;
                    }
                }

                /* JADX INFO: renamed from: H */
                public final void m2261H() {
                    View view;
/* 3 */             if (this.f4494R != null) {
/* 5 */                 m2262s();
/* 11 */                if (this.f4486J != 4 || (view = (View) this.f4494R.get()) == null) {
/* 26 */                    return;
                        }
/* 23 */                view.requestLayout();
                    }
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: c */
                public final void mo565c(C0080c c0080c) {
/* 2 */             this.f4494R = null;
/* 4 */             this.f4487K = null;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: f */
                public final void mo568f() {
/* 2 */             this.f4494R = null;
/* 4 */             this.f4487K = null;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: g */
                public final boolean mo569g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
                    j33 j33Var;
/* 7 */             if (!view.isShown() || !this.f4485I) {
/* 217 */               this.f4488L = true;
/* 5 */                 return false;
                    }
/* 15 */            int actionMasked = motionEvent.getActionMasked();
/* 21 */            if (actionMasked == 0) {
/* 23 */                this.f4498V = -1;
/* 25 */                VelocityTracker velocityTracker = this.f4497U;
/* 27 */                if (velocityTracker != null) {
/* 29 */                    velocityTracker.recycle();
/* 32 */                    this.f4497U = null;
                        }
                    }
/* 36 */            if (this.f4497U == null) {
/* 42 */                this.f4497U = VelocityTracker.obtain();
                    }
/* 46 */            this.f4497U.addMovement(motionEvent);
/* 50 */            if (actionMasked == 0) {
/* 73 */                int x = (int) motionEvent.getX();
/* 79 */                this.f4499W = (int) motionEvent.getY();
/* 83 */                if (this.f4486J != 2) {
/* 85 */                    WeakReference weakReference = this.f4495S;
/* 96 */                    View view2 = weakReference != null ? (View) weakReference.get() : null;
/* 97 */                    if (view2 != null && coordinatorLayout.m555n(view2, x, this.f4499W)) {
/* 115 */                       this.f4498V = motionEvent.getPointerId(motionEvent.getActionIndex());
/* 117 */                       this.f4500X = true;
                            }
                        }
/* 134 */               this.f4488L = this.f4498V == -1 && !coordinatorLayout.m555n(view, x, this.f4499W);
                    } else if (actionMasked == 1 || actionMasked == 3) {
/* 58 */                this.f4500X = false;
/* 60 */                this.f4498V = -1;
/* 64 */                if (this.f4488L) {
/* 66 */                    this.f4488L = false;
/* 5 */                     return false;
                        }
                    }
/* 138 */           if (this.f4488L || (j33Var = this.f4487K) == null || !j33Var.m5688t(motionEvent)) {
/* 151 */               WeakReference weakReference2 = this.f4495S;
/* 160 */               View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
/* 162 */               if (actionMasked != 2 || view3 == null || this.f4488L || this.f4486J == 1 || coordinatorLayout.m555n(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f4487K == null || Math.abs(this.f4499W - motionEvent.getY()) <= this.f4487K.f12041b) {
/* 5 */                     return false;
                        }
                    }
/* 6 */             return true;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: h */
                public final boolean mo570h(CoordinatorLayout coordinatorLayout, View view, int i) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 8 */             if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
/* 16 */                view.setFitsSystemWindows(true);
                    }
/* 21 */            int i2 = 2;
/* 26 */            if (this.f4494R == null) {
/* 38 */                this.f4509f = coordinatorLayout.getResources().getDimensionPixelSize(R$dimen.design_bottom_sheet_peek_height_min);
/* 56 */                boolean z = (Build.VERSION.SDK_INT < 29 || this.f4516m || this.f4508e) ? false : true;
/* 59 */                if (this.f4517n || this.f4518o || this.f4519p || this.f4521r || this.f4522s || this.f4523t || z) {
/* 89 */                    kb1.m6073z(view, new zr3(i2, this, z));
                        }
/* 97 */                this.f4494R = new WeakReference(view);
/* 99 */                fd1 fd1Var = this.f4511h;
/* 101 */               if (fd1Var != null) {
/* 103 */                   view.setBackground(fd1Var);
/* 108 */                   float fM8371i = this.f4482F;
/* 112 */                   if (fM8371i == -1.0f) {
/* 114 */                       fM8371i = s23.m8371i(view);
                            }
/* 118 */                   fd1Var.m3741m(fM8371i);
/* 127 */                   boolean z2 = this.f4486J == 3;
/* 128 */                   this.f4527x = z2;
/* 135 */                   fd1Var.m3743o(z2 ? 0.0f : 1.0f);
                        } else {
/* 139 */                   ColorStateList colorStateList = this.f4512i;
/* 141 */                   if (colorStateList != null) {
/* 143 */                       s23.m8379q(view, colorStateList);
                            }
                        }
/* 146 */               m2258E();
/* 153 */               if (view.getImportantForAccessibility() == 0) {
/* 155 */                   view.setImportantForAccessibility(1);
                        }
                    }
/* 160 */           if (this.f4487K == null) {
/* 173 */               this.f4487K = new j33(coordinatorLayout.getContext(), coordinatorLayout, this.f4504a0);
                    }
/* 175 */           int top = view.getTop();
/* 179 */           coordinatorLayout.m557p(i, view);
/* 186 */           this.f4492P = coordinatorLayout.getWidth();
/* 192 */           this.f4493Q = coordinatorLayout.getHeight();
/* 194 */           int height = view.getHeight();
/* 198 */           this.f4491O = height;
/* 200 */           int i3 = this.f4493Q;
/* 202 */           int i4 = i3 - height;
/* 204 */           int i5 = this.f4525v;
/* 206 */           if (i4 < i5) {
/* 210 */               if (this.f4520q) {
/* 212 */                   this.f4491O = i3;
                        } else {
/* 217 */                   this.f4491O = i3 - i5;
                        }
                    }
/* 226 */           this.f4478B = Math.max(0, i3 - this.f4491O);
/* 236 */           this.f4479C = (int) ((1.0f - this.f4480D) * this.f4493Q);
/* 238 */           m2262s();
/* 241 */           int i6 = this.f4486J;
/* 243 */           if (i6 == 3) {
/* 249 */               view.offsetTopAndBottom(m2265x());
                    } else if (i6 == 6) {
/* 258 */               view.offsetTopAndBottom(this.f4479C);
                    } else if (this.f4483G && i6 == 5) {
/* 271 */               view.offsetTopAndBottom(this.f4493Q);
                    } else if (i6 == 4) {
/* 280 */               view.offsetTopAndBottom(this.f4481E);
                    } else if (i6 == 1 || i6 == 2) {
/* 293 */               view.offsetTopAndBottom(top - view.getTop());
                    }
/* 305 */           this.f4495S = new WeakReference(m2252v(view));
/* 307 */           ArrayList arrayList = this.f4496T;
/* 313 */           if (arrayList.size() <= 0) {
/* 7 */                 return true;
                    }
/* 320 */           throw pm2.m7486i(0, arrayList);
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: i */
                public final boolean mo571i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
/* 5 */             ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
/* 54 */            view.measure(m2253w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f4513j, marginLayoutParams.width), m2253w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f4514k, marginLayoutParams.height));
/* 57 */            return true;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: j */
                public final boolean mo572j(View view) {
/* 1 */             WeakReference weakReference = this.f4495S;
                    return (weakReference == null || view != weakReference.get() || this.f4486J == 3) ? false : true;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: k */
                public final void mo573k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
/* 2 */             if (i3 == 1) {
/* 103 */               return;
                    }
/* 5 */             WeakReference weakReference = this.f4495S;
/* 17 */            if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
/* 103 */               return;
                    }
/* 20 */            int top = view.getTop();
/* 24 */            int i4 = top - i2;
/* 26 */            boolean z = this.f4485I;
/* 28 */            if (i2 > 0) {
/* 34 */                if (i4 < m2265x()) {
/* 40 */                    int iM2265x = top - m2265x();
/* 41 */                    iArr[1] = iM2265x;
/* 43 */                    int i5 = -iM2265x;
/* 44 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 46 */                    view.offsetTopAndBottom(i5);
/* 50 */                    m2255B(3);
                        } else {
/* 54 */                    if (!z) {
/* 103 */                       return;
                            }
/* 57 */                    iArr[1] = i2;
/* 60 */                    WeakHashMap weakHashMap2 = e33.f7494a;
/* 62 */                    view.offsetTopAndBottom(-i2);
/* 65 */                    m2255B(1);
                        }
                    } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
/* 78 */                int i6 = this.f4481E;
/* 80 */                if (i4 > i6 && !this.f4483G) {
/* 87 */                    int i7 = top - i6;
/* 88 */                    iArr[1] = i7;
/* 90 */                    int i8 = -i7;
/* 91 */                    WeakHashMap weakHashMap3 = e33.f7494a;
/* 93 */                    view.offsetTopAndBottom(i8);
/* 97 */                    m2255B(4);
                        } else {
/* 101 */                   if (!z) {
/* 103 */                       return;
                            }
/* 104 */                   iArr[1] = i2;
/* 107 */                   WeakHashMap weakHashMap4 = e33.f7494a;
/* 109 */                   view.offsetTopAndBottom(-i2);
/* 112 */                   m2255B(1);
                        }
                    }
/* 119 */           m2264u(view.getTop());
/* 122 */           this.f4489M = i2;
/* 124 */           this.f4490N = true;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: l */
                public final void mo574l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: n */
                public final void mo576n(View view, Parcelable parcelable) {
/* 1 */             SavedState savedState = (SavedState) parcelable;
/* 6 */             int i = this.f4503a;
/* 8 */             if (i != 0) {
/* 12 */                if (i == -1 || (i & 1) == 1) {
/* 20 */                    this.f4507d = savedState.f4531d;
                        }
/* 22 */                if (i == -1 || (i & 2) == 2) {
/* 30 */                    this.f4505b = savedState.f4532e;
                        }
/* 32 */                if (i == -1 || (i & 4) == 4) {
/* 40 */                    this.f4483G = savedState.f4533f;
                        }
/* 42 */                if (i == -1 || (i & 8) == 8) {
/* 51 */                    this.f4484H = savedState.f4534i;
                        }
                    }
/* 53 */            int i2 = savedState.f4530c;
/* 55 */            if (i2 == 1 || i2 == 2) {
/* 63 */                this.f4486J = 4;
                    } else {
/* 60 */                this.f4486J = i2;
                    }
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: o */
                public final Parcelable mo577o(View view) {
/* 3 */             AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
/* 5 */             return new SavedState(this);
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: p */
                public final boolean mo578p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
/* 2 */             this.f4489M = 0;
/* 4 */             this.f4490N = false;
                    return (i & 2) != 0;
                }

                /* JADX WARN: Code duplicated, block: B:30:0x0055  */
                /* JADX WARN: Code duplicated, block: B:32:0x005a  */
                /* JADX WARN: Code duplicated, block: B:34:0x0062  */
                /* JADX WARN: Code duplicated, block: B:37:0x0074  */
                /* JADX WARN: Code duplicated, block: B:39:0x0078  */
                /* JADX WARN: Code duplicated, block: B:42:0x0083  */
                /* JADX WARN: Code duplicated, block: B:45:0x0093  */
                /* JADX WARN: Code duplicated, block: B:47:0x0097  */
                /* JADX WARN: Code duplicated, block: B:48:0x0099  */
                /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: q */
                public final void mo579q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
                    int top;
                    int top2;
                    int i2;
                    float yVelocity;
/* 9 */             int i3 = 3;
/* 10 */            if (view.getTop() == m2265x()) {
/* 12 */                m2255B(3);
/* 15 */                return;
                    }
/* 16 */            WeakReference weakReference = this.f4495S;
/* 18 */            if (weakReference != null && view2 == weakReference.get() && this.f4490N) {
/* 35 */                if (this.f4489M > 0) {
/* 39 */                    if (!this.f4505b && view.getTop() > this.f4479C) {
/* 175 */                       i3 = 6;
                            }
                        } else if (this.f4483G) {
/* 57 */                    VelocityTracker velocityTracker = this.f4497U;
/* 59 */                    if (velocityTracker == null) {
/* 61 */                        yVelocity = 0.0f;
                            } else {
/* 67 */                        velocityTracker.computeCurrentVelocity(1000, this.f4506c);
/* 74 */                        yVelocity = this.f4497U.getYVelocity(this.f4498V);
                            }
/* 82 */                    if (m2256C(view, yVelocity)) {
/* 84 */                        i3 = 5;
                            } else if (this.f4489M == 0) {
/* 91 */                        top2 = view.getTop();
/* 97 */                        if (this.f4505b) {
/* 117 */                           i2 = this.f4479C;
/* 119 */                           if (top2 < i2) {
/* 129 */                               if (top2 >= Math.abs(top2 - this.f4481E)) {
                                        }
                                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f4481E)) {
/* 152 */                               i3 = 4;
                                    }
/* 175 */                           i3 = 6;
                                } else if (Math.abs(top2 - this.f4478B) >= Math.abs(top2 - this.f4481E)) {
/* 152 */                           i3 = 4;
                                }
                            } else {
/* 150 */                       if (!this.f4505b) {
/* 154 */                           top = view.getTop();
/* 173 */                           if (Math.abs(top - this.f4479C) < Math.abs(top - this.f4481E)) {
/* 175 */                               i3 = 6;
                                    }
                                }
/* 152 */                       i3 = 4;
                            }
                        } else if (this.f4489M == 0) {
/* 91 */                    top2 = view.getTop();
/* 97 */                    if (this.f4505b) {
/* 117 */                       i2 = this.f4479C;
/* 119 */                       if (top2 < i2) {
/* 129 */                           if (top2 >= Math.abs(top2 - this.f4481E)) {
                                    }
                                } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f4481E)) {
/* 152 */                           i3 = 4;
                                }
/* 175 */                       i3 = 6;
                            } else if (Math.abs(top2 - this.f4478B) >= Math.abs(top2 - this.f4481E)) {
/* 152 */                       i3 = 4;
                            }
                        } else {
/* 150 */                   if (!this.f4505b) {
/* 154 */                       top = view.getTop();
/* 173 */                       if (Math.abs(top - this.f4479C) < Math.abs(top - this.f4481E)) {
/* 175 */                           i3 = 6;
                                }
                            }
/* 152 */                   i3 = 4;
                        }
/* 177 */               m2257D(i3, view, false);
/* 180 */               this.f4490N = false;
                    }
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: r */
                public final boolean mo580r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
/* 5 */             if (!view.isShown()) {
/* 7 */                 return false;
                    }
/* 9 */             int actionMasked = motionEvent.getActionMasked();
/* 13 */            int i = this.f4486J;
/* 16 */            if (i == 1 && actionMasked == 0) {
/* 15 */                return true;
                    }
/* 21 */            j33 j33Var = this.f4487K;
/* 23 */            boolean z = this.f4485I;
/* 25 */            if (j33Var != null && (z || i == 1)) {
/* 31 */                j33Var.m5681m(motionEvent);
                    }
/* 34 */            if (actionMasked == 0) {
/* 37 */                this.f4498V = -1;
/* 39 */                VelocityTracker velocityTracker = this.f4497U;
/* 41 */                if (velocityTracker != null) {
/* 43 */                    velocityTracker.recycle();
/* 47 */                    this.f4497U = null;
                        }
                    }
/* 51 */            if (this.f4497U == null) {
/* 57 */                this.f4497U = VelocityTracker.obtain();
                    }
/* 61 */            this.f4497U.addMovement(motionEvent);
/* 66 */            if (this.f4487K != null && ((z || this.f4486J == 1) && actionMasked == 2 && !this.f4488L)) {
/* 89 */                float fAbs = Math.abs(this.f4499W - motionEvent.getY());
/* 93 */                j33 j33Var2 = this.f4487K;
/* 100 */               if (fAbs > j33Var2.f12041b) {
/* 110 */                   j33Var2.m5672c(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
                        }
                    }
/* 115 */           return !this.f4488L;
                }

                /* JADX INFO: renamed from: s */
                public final void m2262s() {
/* 1 */             int iM2263t = m2263t();
/* 5 */             boolean z = this.f4505b;
/* 7 */             int i = this.f4493Q;
/* 9 */             if (z) {
/* 18 */                this.f4481E = Math.max(i - iM2263t, this.f4478B);
                    } else {
/* 22 */                this.f4481E = i - iM2263t;
                    }
                }

                /* JADX INFO: renamed from: t */
                public final int m2263t() {
                    int iMin;
                    int i;
                    int i2;
/* 3 */             if (this.f4508e) {
/* 22 */                iMin = Math.min(Math.max(this.f4509f, this.f4493Q - ((this.f4492P * 9) / 16)), this.f4491O);
/* 26 */                i = this.f4524u;
                    } else {
/* 32 */                if (!this.f4516m && !this.f4517n && (i2 = this.f4515l) > 0) {
/* 47 */                    return Math.max(this.f4507d, i2 + this.f4510g);
                        }
/* 52 */                iMin = this.f4507d;
/* 54 */                i = this.f4524u;
                    }
/* 28 */            return iMin + i;
                }

                /* JADX INFO: renamed from: u */
                public final void m2264u(int i) {
/* 9 */             if (((View) this.f4494R.get()) != null) {
/* 11 */                ArrayList arrayList = this.f4496T;
/* 17 */                if (arrayList.isEmpty()) {
/* 46 */                    return;
                        }
/* 19 */                int i2 = this.f4481E;
/* 21 */                if (i <= i2 && i2 != m2265x()) {
/* 30 */                    m2265x();
                        }
/* 37 */                if (arrayList.size() > 0) {
/* 45 */                    throw pm2.m7486i(0, arrayList);
                        }
                    }
                }

                /* JADX INFO: renamed from: x */
                public final int m2265x() {
/* 3 */             if (this.f4505b) {
/* 5 */                 return this.f4478B;
                    }
/* 18 */            return Math.max(this.f4477A, this.f4520q ? 0 : this.f4525v);
                }

                /* JADX INFO: renamed from: y */
                public final int m2266y(int i) {
/* 2 */             if (i == 3) {
/* 33 */                return m2265x();
                    }
/* 5 */             if (i == 4) {
/* 30 */                return this.f4481E;
                    }
/* 8 */             if (i == 5) {
/* 27 */                return this.f4493Q;
                    }
/* 11 */            if (i == 6) {
/* 13 */                return this.f4479C;
                    }
/* 22 */            C1951n4.m6859j(fm0.m3781g(i, "Invalid state to get top offset: "));
/* 25 */            return 0;
                }

                /* JADX INFO: renamed from: z */
                public final void m2267z(int i) {
/* 1 */             boolean z = this.f4508e;
/* 4 */             if (i == -1) {
/* 6 */                 if (z) {
/* 19 */                    return;
                        } else {
/* 9 */                     this.f4508e = true;
                        }
                    } else {
/* 12 */                if (!z && this.f4507d == i) {
/* 19 */                    return;
                        }
/* 21 */                this.f4508e = false;
/* 27 */                this.f4507d = Math.max(0, i);
                    }
/* 29 */            m2261H();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 48 */        public static class SavedState extends androidx.customview.view.AbsSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0342a();

                    /* JADX INFO: renamed from: c */
                    public final int f4530c;

                    /* JADX INFO: renamed from: d */
                    public final int f4531d;

                    /* JADX INFO: renamed from: e */
                    public final boolean f4532e;

                    /* JADX INFO: renamed from: f */
                    public final boolean f4533f;

                    /* JADX INFO: renamed from: i */
                    public final boolean f4534i;

                    public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */                 super(parcel, classLoader);
/* 8 */                 this.f4530c = parcel.readInt();
/* 14 */                this.f4531d = parcel.readInt();
/* 27 */                this.f4532e = parcel.readInt() == 1;
/* 38 */                this.f4533f = parcel.readInt() == 1;
/* 47 */                this.f4534i = parcel.readInt() == 1;
                    }

                    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeInt(this.f4530c);
/* 11 */                parcel.writeInt(this.f4531d);
/* 16 */                parcel.writeInt(this.f4532e ? 1 : 0);
/* 21 */                parcel.writeInt(this.f4533f ? 1 : 0);
/* 26 */                parcel.writeInt(this.f4534i ? 1 : 0);
                    }

/* 49 */            public SavedState(BottomSheetBehavior bottomSheetBehavior) {
/* 50 */                super(AbsSavedState.EMPTY_STATE);
/* 51 */                this.f4530c = bottomSheetBehavior.f4486J;
/* 53 */                this.f4531d = bottomSheetBehavior.f4507d;
/* 55 */                this.f4532e = bottomSheetBehavior.f4505b;
/* 56 */                this.f4533f = bottomSheetBehavior.f4483G;
/* 58 */                this.f4534i = bottomSheetBehavior.f4484H;
                    }
                }

/* 492 */       public BottomSheetBehavior() {
/* 494 */           this.f4503a = 0;
/* 495 */           this.f4505b = true;
/* 496 */           this.f4513j = -1;
/* 497 */           this.f4514k = -1;
/* 498 */           this.f4528y = new C2258uk(this);
/* 499 */           this.f4480D = 0.5f;
/* 500 */           this.f4482F = -1.0f;
/* 501 */           this.f4485I = true;
/* 502 */           this.f4486J = 4;
/* 503 */           this.f4496T = new ArrayList();
/* 504 */           this.f4502Z = -1;
/* 505 */           this.f4504a0 = new C2221tk(this);
                }
            }
