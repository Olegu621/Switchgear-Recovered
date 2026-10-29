            package com.google.android.material.slider;

            import android.R;
            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffXfermode;
            import android.graphics.Rect;
            import android.graphics.Region;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.RippleDrawable;
            import android.os.Build;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.view.ViewOverlay;
            import android.view.ViewParent;
            import android.view.accessibility.AccessibilityManager;
            import android.widget.SeekBar;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$color;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import com.google.android.material.slider.BaseSlider;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            import java.math.BigDecimal;
            import java.math.MathContext;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.WeakHashMap;
            import p000.AbstractC0196bx;
            import p000.AbstractC0208c9;
            import p000.AbstractC0886en;
            import p000.AbstractC2246u8;
            import p000.C0862e;
            import p000.C1951n4;
            import p000.dc0;
            import p000.de3;
            import p000.dn2;
            import p000.dq2;
            import p000.e33;
            import p000.fd1;
            import p000.fm0;
            import p000.fs0;
            import p000.gn2;
            import p000.hd1;
            import p000.he3;
            import p000.kb1;
            import p000.rn2;
            import p000.s90;
            import p000.sc2;
            import p000.tc2;
            import p000.v00;
            import p000.w11;
            import p000.w70;
            import p000.yy1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    abstract class BaseSlider<S extends BaseSlider<S, L, T>, L, T> extends View {

                /* JADX INFO: renamed from: N0 */
                public static final int f4867N0 = R$style.Widget_MaterialComponents_Slider;

                /* JADX INFO: renamed from: A0 */
                public int f4868A0;

                /* JADX INFO: renamed from: B0 */
                public boolean f4869B0;

                /* JADX INFO: renamed from: C0 */
                public boolean f4870C0;

                /* JADX INFO: renamed from: D0 */
                public ColorStateList f4871D0;

                /* JADX INFO: renamed from: E0 */
                public ColorStateList f4872E0;

                /* JADX INFO: renamed from: F0 */
                public ColorStateList f4873F0;

                /* JADX INFO: renamed from: G0 */
                public ColorStateList f4874G0;

                /* JADX INFO: renamed from: H0 */
                public ColorStateList f4875H0;

                /* JADX INFO: renamed from: I0 */
                public final fd1 f4876I0;

                /* JADX INFO: renamed from: J0 */
                public Drawable f4877J0;

                /* JADX INFO: renamed from: K0 */
                public List f4878K0;

                /* JADX INFO: renamed from: L0 */
                public float f4879L0;

                /* JADX INFO: renamed from: M0 */
                public int f4880M0;

                /* JADX INFO: renamed from: U */
                public final C0371a f4881U;

                /* JADX INFO: renamed from: V */
                public final ArrayList f4882V;

                /* JADX INFO: renamed from: W */
                public final ArrayList f4883W;

                /* JADX INFO: renamed from: a */
                public final Paint f4884a;

                /* JADX INFO: renamed from: a0 */
                public final ArrayList f4885a0;

                /* JADX INFO: renamed from: b */
                public final Paint f4886b;

                /* JADX INFO: renamed from: b0 */
                public boolean f4887b0;

                /* JADX INFO: renamed from: c */
                public final Paint f4888c;

                /* JADX INFO: renamed from: c0 */
                public ValueAnimator f4889c0;

                /* JADX INFO: renamed from: d */
                public final Paint f4890d;

                /* JADX INFO: renamed from: d0 */
                public ValueAnimator f4891d0;

                /* JADX INFO: renamed from: e */
                public final Paint f4892e;

                /* JADX INFO: renamed from: e0 */
                public final int f4893e0;

                /* JADX INFO: renamed from: f */
                public final Paint f4894f;

                /* JADX INFO: renamed from: f0 */
                public final int f4895f0;

                /* JADX INFO: renamed from: g0 */
                public final int f4896g0;

                /* JADX INFO: renamed from: h0 */
                public final int f4897h0;

                /* JADX INFO: renamed from: i */
                public final C0375e f4898i;

                /* JADX INFO: renamed from: i0 */
                public int f4899i0;

                /* JADX INFO: renamed from: j0 */
                public int f4900j0;

                /* JADX INFO: renamed from: k0 */
                public int f4901k0;

                /* JADX INFO: renamed from: l0 */
                public final int f4902l0;

                /* JADX INFO: renamed from: m0 */
                public int f4903m0;

                /* JADX INFO: renamed from: n0 */
                public int f4904n0;

                /* JADX INFO: renamed from: o0 */
                public final int f4905o0;

                /* JADX INFO: renamed from: p0 */
                public float f4906p0;

                /* JADX INFO: renamed from: q0 */
                public MotionEvent f4907q0;

                /* JADX INFO: renamed from: r0 */
                public boolean f4908r0;

                /* JADX INFO: renamed from: s0 */
                public float f4909s0;

                /* JADX INFO: renamed from: t0 */
                public float f4910t0;

                /* JADX INFO: renamed from: u0 */
                public ArrayList f4911u0;

                /* JADX INFO: renamed from: v */
                public final AccessibilityManager f4912v;

                /* JADX INFO: renamed from: v0 */
                public int f4913v0;

                /* JADX INFO: renamed from: w */
                public RunnableC0374d f4914w;

                /* JADX INFO: renamed from: w0 */
                public int f4915w0;

                /* JADX INFO: renamed from: x0 */
                public float f4916x0;

                /* JADX INFO: renamed from: y0 */
                public float[] f4917y0;

                /* JADX INFO: renamed from: z0 */
                public boolean f4918z0;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SliderState extends View.BaseSavedState {
                    public static final Parcelable.Creator<SliderState> CREATOR = new C0376f();

                    /* JADX INFO: renamed from: a */
                    public float f4919a;

                    /* JADX INFO: renamed from: b */
                    public float f4920b;

                    /* JADX INFO: renamed from: c */
                    public ArrayList f4921c;

                    /* JADX INFO: renamed from: d */
                    public float f4922d;

                    /* JADX INFO: renamed from: e */
                    public boolean f4923e;

                    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeFloat(this.f4919a);
/* 11 */                parcel.writeFloat(this.f4920b);
/* 16 */                parcel.writeList(this.f4921c);
/* 21 */                parcel.writeFloat(this.f4922d);
/* 32 */                parcel.writeBooleanArray(new boolean[]{this.f4923e});
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public BaseSlider(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = f4867N0;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 15 */            this.f4882V = new ArrayList();
/* 22 */            this.f4883W = new ArrayList();
/* 29 */            this.f4885a0 = new ArrayList();
/* 32 */            this.f4887b0 = false;
/* 34 */            this.f4908r0 = false;
/* 41 */            this.f4911u0 = new ArrayList();
/* 44 */            this.f4913v0 = -1;
/* 46 */            this.f4915w0 = -1;
/* 49 */            this.f4916x0 = 0.0f;
/* 52 */            this.f4918z0 = true;
/* 54 */            this.f4869B0 = false;
/* 58 */            fd1 fd1Var = new fd1();
/* 61 */            this.f4876I0 = fd1Var;
/* 65 */            this.f4878K0 = Collections.EMPTY_LIST;
/* 67 */            this.f4880M0 = 0;
/* 69 */            Context context2 = getContext();
/* 75 */            Paint paint = new Paint();
/* 78 */            this.f4884a = paint;
/* 80 */            Paint.Style style = Paint.Style.STROKE;
/* 82 */            paint.setStyle(style);
/* 85 */            Paint.Cap cap = Paint.Cap.ROUND;
/* 87 */            paint.setStrokeCap(cap);
/* 92 */            Paint paint2 = new Paint();
/* 95 */            this.f4886b = paint2;
/* 97 */            paint2.setStyle(style);
/* 100 */           paint2.setStrokeCap(cap);
/* 105 */           Paint paint3 = new Paint(1);
/* 108 */           this.f4888c = paint3;
/* 110 */           Paint.Style style2 = Paint.Style.FILL;
/* 112 */           paint3.setStyle(style2);
/* 122 */           paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
/* 127 */           Paint paint4 = new Paint(1);
/* 130 */           this.f4890d = paint4;
/* 132 */           paint4.setStyle(style2);
/* 137 */           Paint paint5 = new Paint();
/* 140 */           this.f4892e = paint5;
/* 142 */           paint5.setStyle(style);
/* 145 */           paint5.setStrokeCap(cap);
/* 150 */           Paint paint6 = new Paint();
/* 153 */           this.f4894f = paint6;
/* 155 */           paint6.setStyle(style);
/* 158 */           paint6.setStrokeCap(cap);
/* 161 */           Resources resources = context2.getResources();
/* 171 */           this.f4897h0 = resources.getDimensionPixelSize(R$dimen.mtrl_slider_widget_height);
/* 175 */           int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_slider_track_side_padding);
/* 179 */           this.f4895f0 = dimensionPixelOffset;
/* 181 */           this.f4901k0 = dimensionPixelOffset;
/* 189 */           this.f4896g0 = resources.getDimensionPixelSize(R$dimen.mtrl_slider_thumb_radius);
/* 197 */           this.f4902l0 = resources.getDimensionPixelOffset(R$dimen.mtrl_slider_track_top);
/* 205 */           this.f4905o0 = resources.getDimensionPixelSize(R$dimen.mtrl_slider_label_padding);
/* 212 */           this.f4881U = new C0371a(this, attributeSet, i);
/* 214 */           int[] iArr = R$styleable.Slider;
/* 218 */           rn2.m8210a(context2, attributeSet, i, i2);
/* 223 */           rn2.m8211b(context2, attributeSet, iArr, i, i2, new int[0]);
/* 226 */           TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
/* 236 */           this.f4909s0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.Slider_android_valueFrom, 0.0f);
/* 246 */           this.f4910t0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.Slider_android_valueTo, 1.0f);
/* 258 */           setValues(Float.valueOf(this.f4909s0));
/* 267 */           this.f4916x0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.Slider_android_stepSize, 0.0f);
/* 271 */           boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.Slider_trackColor);
/* 280 */           int i3 = zHasValue ? R$styleable.Slider_trackColor : R$styleable.Slider_trackColorInactive;
/* 287 */           int i4 = zHasValue ? R$styleable.Slider_trackColor : R$styleable.Slider_trackColorActive;
/* 289 */           ColorStateList colorStateListM3033o = de3.m3033o(context2, typedArrayObtainStyledAttributes, i3);
/* 302 */           setTrackInactiveTintList(colorStateListM3033o == null ? v00.getColorStateList(context2, R$color.material_slider_inactive_track_color) : colorStateListM3033o);
/* 305 */           ColorStateList colorStateListM3033o2 = de3.m3033o(context2, typedArrayObtainStyledAttributes, i4);
/* 318 */           setTrackActiveTintList(colorStateListM3033o2 == null ? v00.getColorStateList(context2, R$color.material_slider_active_track_color) : colorStateListM3033o2);
/* 327 */           fd1Var.m3742n(de3.m3033o(context2, typedArrayObtainStyledAttributes, R$styleable.Slider_thumbColor));
/* 336 */           if (typedArrayObtainStyledAttributes.hasValue(R$styleable.Slider_thumbStrokeColor)) {
/* 344 */               setThumbStrokeColor(de3.m3033o(context2, typedArrayObtainStyledAttributes, R$styleable.Slider_thumbStrokeColor));
                    }
/* 353 */           setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R$styleable.Slider_thumbStrokeWidth, 0.0f));
/* 358 */           ColorStateList colorStateListM3033o3 = de3.m3033o(context2, typedArrayObtainStyledAttributes, R$styleable.Slider_haloColor);
/* 371 */           setHaloTintList(colorStateListM3033o3 == null ? v00.getColorStateList(context2, R$color.material_slider_halo_color) : colorStateListM3033o3);
/* 380 */           this.f4918z0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Slider_tickVisible, true);
/* 384 */           boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(R$styleable.Slider_tickColor);
/* 393 */           int i5 = zHasValue2 ? R$styleable.Slider_tickColor : R$styleable.Slider_tickColorInactive;
/* 400 */           int i6 = zHasValue2 ? R$styleable.Slider_tickColor : R$styleable.Slider_tickColorActive;
/* 402 */           ColorStateList colorStateListM3033o4 = de3.m3033o(context2, typedArrayObtainStyledAttributes, i5);
/* 415 */           setTickInactiveTintList(colorStateListM3033o4 == null ? v00.getColorStateList(context2, R$color.material_slider_inactive_tick_marks_color) : colorStateListM3033o4);
/* 418 */           ColorStateList colorStateListM3033o5 = de3.m3033o(context2, typedArrayObtainStyledAttributes, i6);
/* 431 */           setTickActiveTintList(colorStateListM3033o5 == null ? v00.getColorStateList(context2, R$color.material_slider_active_tick_marks_color) : colorStateListM3033o5);
/* 440 */           setThumbRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_thumbRadius, 0));
/* 449 */           setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_haloRadius, 0));
/* 458 */           setThumbElevation(typedArrayObtainStyledAttributes.getDimension(R$styleable.Slider_thumbElevation, 0.0f));
/* 467 */           setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_trackHeight, 0));
/* 476 */           setLabelBehavior(typedArrayObtainStyledAttributes.getInt(R$styleable.Slider_labelBehavior, 0));
/* 485 */           if (!typedArrayObtainStyledAttributes.getBoolean(R$styleable.Slider_android_enabled, true)) {
/* 487 */               setEnabled(false);
                    }
/* 490 */           typedArrayObtainStyledAttributes.recycle();
/* 493 */           setFocusable(true);
/* 496 */           setClickable(true);
/* 499 */           fd1Var.m3746r();
/* 510 */           this.f4893e0 = ViewConfiguration.get(context2).getScaledTouchSlop();
/* 514 */           C0375e c0375e = new C0375e(this);
/* 517 */           this.f4898i = c0375e;
/* 519 */           e33.m3318n(this, c0375e);
/* 534 */           this.f4912v = (AccessibilityManager) getContext().getSystemService("accessibility");
                }

                /* JADX INFO: renamed from: a */
                public final void m2351a(Drawable drawable) {
/* 3 */             int i = this.f4903m0 * 2;
/* 5 */             int intrinsicWidth = drawable.getIntrinsicWidth();
/* 9 */             int intrinsicHeight = drawable.getIntrinsicHeight();
/* 15 */            if (intrinsicWidth == -1 && intrinsicHeight == -1) {
/* 19 */                drawable.setBounds(0, 0, i, i);
                    } else {
/* 29 */                float fMax = i / Math.max(intrinsicWidth, intrinsicHeight);
/* 36 */                drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
                    }
                }

                /* JADX INFO: renamed from: b */
                public final int m2352b() {
/* 1 */             int i = this.f4899i0;
/* 24 */            return this.f4902l0 + ((i == 1 || i == 3) ? ((dq2) this.f4882V.get(0)).getIntrinsicHeight() : 0);
                }

                /* JADX INFO: renamed from: c */
                public final ValueAnimator m2353c(boolean z) {
/* 8 */             float fFloatValue = z ? 0.0f : 1.0f;
/* 14 */            ValueAnimator valueAnimator = z ? this.f4891d0 : this.f4889c0;
/* 16 */            if (valueAnimator != null && valueAnimator.isRunning()) {
/* 30 */                fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
/* 34 */                valueAnimator.cancel();
                    }
/* 50 */            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
/* 61 */            valueAnimatorOfFloat.setDuration(z ? 83L : 117L);
/* 71 */            valueAnimatorOfFloat.setInterpolator(z ? AbstractC2246u8.f17414e : AbstractC2246u8.f17412c);
/* 79 */            valueAnimatorOfFloat.addUpdateListener(new C0372b(this));
/* 82 */            return valueAnimatorOfFloat;
                }

                /* JADX INFO: renamed from: d */
                public final void m2354d(Canvas canvas, int i, int i2, float f, Drawable drawable) {
/* 1 */             canvas.save();
/* 40 */            canvas.translate((this.f4901k0 + ((int) (m2365o(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
/* 43 */            drawable.draw(canvas);
/* 46 */            canvas.restore();
                }

                @Override // android.view.View
                public boolean dispatchHoverEvent(MotionEvent motionEvent) {
                    return this.f4898i.m8494m(motionEvent) || super.dispatchHoverEvent(motionEvent);
                }

                @Override // android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 12 */            this.f4884a.setColor(m2358h(this.f4875H0));
/* 23 */            this.f4886b.setColor(m2358h(this.f4874G0));
/* 34 */            this.f4892e.setColor(m2358h(this.f4873F0));
/* 45 */            this.f4894f.setColor(m2358h(this.f4872E0));
/* 58 */            for (dq2 dq2Var : this.f4882V) {
/* 70 */                if (dq2Var.isStateful()) {
/* 76 */                    dq2Var.setState(getDrawableState());
                        }
                    }
/* 80 */            fd1 fd1Var = this.f4876I0;
/* 86 */            if (fd1Var.isStateful()) {
/* 92 */                fd1Var.setState(getDrawableState());
                    }
/* 97 */            int iM2358h = m2358h(this.f4871D0);
/* 101 */           Paint paint = this.f4890d;
/* 103 */           paint.setColor(iM2358h);
/* 108 */           paint.setAlpha(63);
                }

                /* JADX INFO: renamed from: e */
                public final void m2355e() {
/* 3 */             if (this.f4887b0) {
/* 6 */                 this.f4887b0 = false;
/* 8 */                 ValueAnimator valueAnimatorM2353c = m2353c(false);
/* 12 */                this.f4891d0 = valueAnimatorM2353c;
/* 15 */                this.f4889c0 = null;
/* 22 */                valueAnimatorM2353c.addListener(new C0373c(this));
/* 27 */                this.f4891d0.start();
                    }
                }

                /* JADX INFO: renamed from: f */
                public final String m2356f(float f) {
/* 20 */            return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
                }

                /* JADX INFO: renamed from: g */
                public final float[] m2357g() {
/* 11 */            float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
/* 25 */            float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
/* 36 */            if (this.f4911u0.size() == 1) {
/* 38 */                fFloatValue2 = this.f4909s0;
                    }
/* 40 */            float fM2365o = m2365o(fFloatValue2);
/* 44 */            float fM2365o2 = m2365o(fFloatValue);
                    return m2361k() ? new float[]{fM2365o2, fM2365o} : new float[]{fM2365o, fM2365o2};
                }

                @Override // android.view.View
                public CharSequence getAccessibilityClassName() {
/* 3 */             return SeekBar.class.getName();
                }

                public final int getAccessibilityFocusedVirtualViewId() {
/* 3 */             return this.f4898i.f16569k;
                }

                public float getMinSeparation() {
/* 1 */             return 0.0f;
                }

                public float getValueFrom() {
/* 1 */             return this.f4909s0;
                }

                public float getValueTo() {
/* 1 */             return this.f4910t0;
                }

                public List<Float> getValues() {
/* 5 */             return new ArrayList(this.f4911u0);
                }

                /* JADX INFO: renamed from: h */
                public final int m2358h(ColorStateList colorStateList) {
/* 9 */             return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
                }

                /* JADX INFO: renamed from: i */
                public final boolean m2359i() {
/* 7 */             for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
/* 10 */                ViewGroup viewGroup = (ViewGroup) parent;
/* 17 */                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
/* 12 */                    return true;
                        }
                    }
/* 38 */            return false;
                }

                /* JADX INFO: renamed from: j */
                public final boolean m2360j(float f) {
/* 27 */            double dDoubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f4916x0)), MathContext.DECIMAL64).doubleValue();
                    return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
                }

                /* JADX INFO: renamed from: k */
                public final boolean m2361k() {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
                    return getLayoutDirection() == 1;
                }

                /* JADX INFO: renamed from: l */
                public final void m2362l() {
/* 6 */             if (this.f4916x0 <= 0.0f) {
/* 88 */                return;
                    }
/* 9 */             m2374x();
/* 33 */            int iMin = Math.min((int) (((this.f4910t0 - this.f4909s0) / this.f4916x0) + 1.0f), (this.f4868A0 / (this.f4900j0 * 2)) + 1);
/* 37 */            float[] fArr = this.f4917y0;
/* 39 */            if (fArr == null || fArr.length != iMin * 2) {
/* 50 */                this.f4917y0 = new float[iMin * 2];
                    }
/* 58 */            float f = this.f4868A0 / (iMin - 1);
/* 62 */            for (int i = 0; i < iMin * 2; i += 2) {
/* 64 */                float[] fArr2 = this.f4917y0;
/* 74 */                fArr2[i] = ((i / 2) * f) + this.f4901k0;
/* 83 */                fArr2[i + 1] = m2352b();
                    }
                }

                /* JADX INFO: renamed from: m */
                public final boolean m2363m(int i) {
/* 1 */             int i2 = this.f4915w0;
/* 5 */             long j = ((long) i2) + ((long) i);
/* 13 */            long size = this.f4911u0.size() - 1;
/* 19 */            if (j < 0) {
/* 21 */                j = 0;
                    } else if (j > size) {
/* 27 */                j = size;
                    }
/* 28 */            int i3 = (int) j;
/* 29 */            this.f4915w0 = i3;
/* 31 */            if (i3 == i2) {
/* 33 */                return false;
                    }
/* 38 */            if (this.f4913v0 != -1) {
/* 40 */                this.f4913v0 = i3;
                    }
/* 42 */            m2373w();
/* 45 */            postInvalidate();
/* 12 */            return true;
                }

                /* JADX INFO: renamed from: n */
                public final void m2364n(int i) {
/* 5 */             if (m2361k()) {
/* 15 */                i = i == Integer.MIN_VALUE ? AbstractC0208c9.API_PRIORITY_OTHER : -i;
                    }
/* 16 */            m2363m(i);
                }

                /* JADX INFO: renamed from: o */
                public final float m2365o(float f) {
/* 1 */             float f2 = this.f4909s0;
/* 7 */             float f3 = (f - f2) / (this.f4910t0 - f2);
                    return m2361k() ? 1.0f - f3 : f3;
                }

                @Override // android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 14 */            for (dq2 dq2Var : this.f4882V) {
/* 22 */                ViewGroup viewGroupM6034G = kb1.m6034G(this);
/* 26 */                if (viewGroupM6034G == null) {
/* 28 */                    dq2Var.getClass();
                        } else {
/* 32 */                    dq2Var.getClass();
/* 36 */                    int[] iArr = new int[2];
/* 38 */                    viewGroupM6034G.getLocationOnScreen(iArr);
/* 44 */                    dq2Var.f7378t0 = iArr[0];
/* 48 */                    viewGroupM6034G.getWindowVisibleDisplayFrame(dq2Var.f7372n0);
/* 53 */                    viewGroupM6034G.addOnLayoutChangeListener(dq2Var.f7371m0);
                        }
                    }
                }

                @Override // android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             RunnableC0374d runnableC0374d = this.f4914w;
/* 3 */             if (runnableC0374d != null) {
/* 5 */                 removeCallbacks(runnableC0374d);
                    }
/* 9 */             this.f4887b0 = false;
/* 21 */            for (dq2 dq2Var : this.f4882V) {
/* 29 */                ViewGroup viewGroupM6034G = kb1.m6034G(this);
/* 39 */                fs0 fs0Var = viewGroupM6034G == null ? null : new fs0(viewGroupM6034G);
/* 43 */                if (fs0Var != null) {
/* 49 */                    ((ViewOverlay) fs0Var.f8339b).remove(dq2Var);
/* 52 */                    ViewGroup viewGroupM6034G2 = kb1.m6034G(this);
/* 56 */                    if (viewGroupM6034G2 == null) {
/* 58 */                        dq2Var.getClass();
                            } else {
/* 64 */                        viewGroupM6034G2.removeOnLayoutChangeListener(dq2Var.f7371m0);
                            }
                        }
                    }
/* 68 */            super.onDetachedFromWindow();
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
                    int i;
/* 3 */             if (this.f4870C0) {
/* 5 */                 m2374x();
/* 8 */                 m2362l();
                    }
/* 11 */            super.onDraw(canvas);
/* 14 */            int iM2352b = m2352b();
/* 18 */            int i2 = this.f4868A0;
/* 20 */            float[] fArrM2357g = m2357g();
/* 24 */            int i3 = this.f4901k0;
                    float f = i2;
/* 32 */            float f2 = (fArrM2357g[1] * f) + i3;
/* 33 */            float f3 = i3 + i2;
/* 37 */            Paint paint = this.f4884a;
/* 39 */            if (f2 < f3) {
                        float f4 = iM2352b;
/* 46 */                canvas.drawLine(f2, f4, f3, f4, paint);
                    }
/* 49 */            float f5 = this.f4901k0;
/* 52 */            int i4 = 0;
/* 56 */            float f6 = (fArrM2357g[0] * f) + f5;
/* 60 */            if (f6 > f5) {
                        float f7 = iM2352b;
/* 65 */                canvas.drawLine(f5, f7, f6, f7, paint);
                    }
/* 86 */            if (((Float) Collections.max(getValues())).floatValue() > this.f4909s0) {
/* 88 */                int i5 = this.f4868A0;
/* 90 */                float[] fArrM2357g2 = m2357g();
/* 94 */                float f8 = this.f4901k0;
                        float f9 = i5;
/* 101 */               float f10 = (fArrM2357g2[1] * f9) + f8;
/* 105 */               float f11 = (fArrM2357g2[0] * f9) + f8;
                        float f12 = iM2352b;
/* 111 */               canvas.drawLine(f11, f12, f10, f12, this.f4886b);
                    }
/* 117 */           if (this.f4918z0 && this.f4916x0 > 0.0f) {
/* 127 */               float[] fArrM2357g3 = m2357g();
/* 140 */               int iRound = Math.round(fArrM2357g3[0] * ((this.f4917y0.length / 2) - 1));
/* 153 */               int iRound2 = Math.round(fArrM2357g3[1] * ((this.f4917y0.length / 2) - 1));
/* 157 */               float[] fArr = this.f4917y0;
/* 159 */               int i6 = iRound * 2;
/* 160 */               Paint paint2 = this.f4892e;
/* 162 */               canvas.drawPoints(fArr, 0, i6, paint2);
/* 167 */               int i7 = iRound2 * 2;
/* 172 */               canvas.drawPoints(this.f4917y0, i6, i7 - i6, this.f4894f);
/* 175 */               float[] fArr2 = this.f4917y0;
/* 179 */               canvas.drawPoints(fArr2, i7, fArr2.length - i7, paint2);
                    }
/* 185 */           if ((this.f4908r0 || isFocused() || this.f4899i0 == 3) && isEnabled()) {
/* 203 */               int i8 = this.f4868A0;
/* 211 */               if (!(getBackground() instanceof RippleDrawable)) {
/* 237 */                   int iM2365o = (int) ((m2365o(((Float) this.f4911u0.get(this.f4915w0)).floatValue()) * i8) + this.f4901k0);
/* 242 */                   if (Build.VERSION.SDK_INT < 28) {
/* 244 */                       int i9 = this.f4904n0;
/* 265 */                       canvas.clipRect(iM2365o - i9, iM2352b - i9, iM2365o + i9, i9 + iM2352b, Region.Op.UNION);
                            }
/* 275 */                   canvas.drawCircle(iM2365o, iM2352b, this.f4904n0, this.f4890d);
                        }
/* 281 */               if (this.f4913v0 == -1 && this.f4899i0 != 3) {
/* 288 */                   m2355e();
                        } else if (this.f4899i0 != 2) {
/* 301 */                   if (!this.f4887b0) {
/* 303 */                       this.f4887b0 = true;
/* 305 */                       ValueAnimator valueAnimatorM2353c = m2353c(true);
/* 309 */                       this.f4889c0 = valueAnimatorM2353c;
/* 312 */                       this.f4891d0 = null;
/* 314 */                       valueAnimatorM2353c.start();
                            }
/* 317 */                   ArrayList arrayList = this.f4882V;
/* 319 */                   Iterator it = arrayList.iterator();
/* 330 */                   for (int i10 = 0; i10 < this.f4911u0.size() && it.hasNext(); i10++) {
/* 340 */                       if (i10 != this.f4915w0) {
/* 361 */                           m2368r((dq2) it.next(), ((Float) this.f4911u0.get(i10)).floatValue());
                                }
                            }
/* 371 */                   if (!it.hasNext()) {
/* 430 */                       throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f4911u0.size())));
                            }
/* 393 */                   m2368r((dq2) it.next(), ((Float) this.f4911u0.get(this.f4915w0)).floatValue());
                        }
                    } else {
/* 431 */               m2355e();
                    }
/* 434 */           int i11 = this.f4868A0;
/* 442 */           while (i4 < this.f4911u0.size()) {
/* 452 */               float fFloatValue = ((Float) this.f4911u0.get(i4)).floatValue();
/* 456 */               Drawable drawable = this.f4877J0;
/* 458 */               if (drawable != null) {
/* 462 */                   i = iM2352b;
/* 463 */                   m2354d(canvas, i11, i, fFloatValue, drawable);
                        } else {
/* 467 */                   i = iM2352b;
/* 474 */                   if (i4 < this.f4878K0.size()) {
/* 487 */                       m2354d(canvas, i11, i, fFloatValue, (Drawable) this.f4878K0.get(i4));
                            } else {
/* 495 */                       if (!isEnabled()) {
/* 513 */                           canvas.drawCircle((m2365o(fFloatValue) * i11) + this.f4901k0, i, this.f4903m0, this.f4888c);
                                }
/* 520 */                       m2354d(canvas, i11, i, fFloatValue, this.f4876I0);
                            }
                        }
/* 523 */               i4++;
/* 525 */               iM2352b = i;
                    }
                }

                @Override // android.view.View
                public final void onFocusChanged(boolean z, int i, Rect rect) {
/* 1 */             super.onFocusChanged(z, i, rect);
/* 4 */             C0375e c0375e = this.f4898i;
/* 6 */             if (!z) {
/* 9 */                 this.f4913v0 = -1;
/* 13 */                c0375e.m8491j(this.f4915w0);
/* 16 */                return;
                    }
/* 21 */            if (i == 1) {
/* 49 */                m2363m(AbstractC0208c9.API_PRIORITY_OTHER);
                    } else if (i == 2) {
/* 45 */                m2363m(Integer.MIN_VALUE);
                    } else if (i == 17) {
/* 41 */                m2364n(AbstractC0208c9.API_PRIORITY_OTHER);
                    } else if (i == 66) {
/* 37 */                m2364n(Integer.MIN_VALUE);
                    }
/* 54 */            c0375e.m8498w(this.f4915w0);
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0047  */
                /* JADX WARN: Code duplicated, block: B:22:0x004d  */
                @Override // android.view.View, android.view.KeyEvent.Callback
                public boolean onKeyDown(int i, KeyEvent keyEvent) {
/* 5 */             if (!isEnabled()) {
/* 7 */                 return super.onKeyDown(i, keyEvent);
                    }
/* 20 */            if (this.f4911u0.size() == 1) {
/* 22 */                this.f4913v0 = 0;
                    }
/* 26 */            Float fValueOf = null;
/* 26 */            Boolean boolValueOf = null;
/* 38 */            if (this.f4913v0 == -1) {
/* 40 */                if (i != 61) {
/* 42 */                    if (i == 66) {
/* 80 */                        this.f4913v0 = this.f4915w0;
/* 82 */                        postInvalidate();
/* 85 */                        boolValueOf = Boolean.TRUE;
                            } else if (i == 81) {
/* 72 */                        m2363m(1);
/* 75 */                        boolValueOf = Boolean.TRUE;
                            } else if (i == 69) {
/* 66 */                        m2363m(-1);
/* 69 */                        boolValueOf = Boolean.TRUE;
                            } else if (i != 70) {
                                switch (i) {
                                    case io.flutter.Build.API_LEVELS.API_21 /* 21 */:
/* 60 */                                m2364n(-1);
/* 63 */                                boolValueOf = Boolean.TRUE;
                                        break;
                                    case io.flutter.Build.API_LEVELS.API_22 /* 22 */:
/* 54 */                                m2364n(1);
/* 57 */                                boolValueOf = Boolean.TRUE;
                                        break;
                                    case io.flutter.Build.API_LEVELS.API_23 /* 23 */:
/* 80 */                                this.f4913v0 = this.f4915w0;
/* 82 */                                postInvalidate();
/* 85 */                                boolValueOf = Boolean.TRUE;
                                        break;
                                }
                            } else {
/* 72 */                        m2363m(1);
/* 75 */                        boolValueOf = Boolean.TRUE;
                            }
                        } else if (keyEvent.hasNoModifiers()) {
/* 98 */                    boolValueOf = Boolean.valueOf(m2363m(1));
                        } else {
/* 118 */                   boolValueOf = keyEvent.isShiftPressed() ? Boolean.valueOf(m2363m(-1)) : Boolean.FALSE;
                        }
                        return boolValueOf != null ? boolValueOf.booleanValue() : super.onKeyDown(i, keyEvent);
                    }
/* 138 */           boolean zIsLongPress = this.f4869B0 | keyEvent.isLongPress();
/* 139 */           this.f4869B0 = zIsLongPress;
/* 141 */           float fRound = this.f4916x0;
/* 146 */           if (zIsLongPress) {
/* 150 */               if (fRound == 0.0f) {
/* 152 */                   fRound = 1.0f;
                        }
/* 158 */               float f = (this.f4910t0 - this.f4909s0) / fRound;
/* 163 */               if (f > 20.0f) {
/* 172 */                   fRound *= Math.round(f / 20.0f);
                        }
                    } else if (fRound == 0.0f) {
/* 178 */               fRound = 1.0f;
                    }
/* 181 */           if (i == 21) {
/* 221 */               if (!m2361k()) {
/* 224 */                   fRound = -fRound;
                        }
/* 225 */               fValueOf = Float.valueOf(fRound);
                    } else if (i == 22) {
/* 209 */               if (m2361k()) {
/* 211 */                   fRound = -fRound;
                        }
/* 212 */               fValueOf = Float.valueOf(fRound);
                    } else if (i == 69) {
/* 200 */               fValueOf = Float.valueOf(-fRound);
                    } else if (i == 70 || i == 81) {
/* 194 */               fValueOf = Float.valueOf(fRound);
                    }
/* 229 */           if (fValueOf != null) {
/* 256 */               if (m2370t(fValueOf.floatValue() + ((Float) this.f4911u0.get(this.f4913v0)).floatValue(), this.f4913v0)) {
/* 258 */                   m2373w();
/* 261 */                   postInvalidate();
                        }
/* 19 */                return true;
                    }
/* 267 */           if (i != 23) {
/* 269 */               if (i == 61) {
/* 282 */                   if (keyEvent.hasNoModifiers()) {
/* 284 */                       return m2363m(1);
                            }
/* 293 */                   if (keyEvent.isShiftPressed()) {
/* 295 */                       return m2363m(-1);
                            }
/* 18 */                    return false;
                        }
/* 271 */               if (i != 66) {
/* 273 */                   return super.onKeyDown(i, keyEvent);
                        }
                    }
/* 301 */           this.f4913v0 = -1;
/* 303 */           postInvalidate();
/* 19 */            return true;
                }

                @Override // android.view.View, android.view.KeyEvent.Callback
                public boolean onKeyUp(int i, KeyEvent keyEvent) {
/* 2 */             this.f4869B0 = false;
/* 4 */             return super.onKeyUp(i, keyEvent);
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             int i3 = this.f4899i0;
/* 31 */            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f4897h0 + ((i3 == 1 || i3 == 3) ? ((dq2) this.f4882V.get(0)).getIntrinsicHeight() : 0), 1073741824));
                }

                @Override // android.view.View
                public void onRestoreInstanceState(Parcelable parcelable) {
/* 1 */             SliderState sliderState = (SliderState) parcelable;
/* 7 */             super.onRestoreInstanceState(sliderState.getSuperState());
/* 12 */            this.f4909s0 = sliderState.f4919a;
/* 16 */            this.f4910t0 = sliderState.f4920b;
/* 20 */            m2369s(sliderState.f4921c);
/* 25 */            this.f4916x0 = sliderState.f4922d;
/* 29 */            if (sliderState.f4923e) {
/* 31 */                requestFocus();
                    }
                }

                @Override // android.view.View
                public Parcelable onSaveInstanceState() {
/* 7 */             SliderState sliderState = new SliderState(super.onSaveInstanceState());
/* 12 */            sliderState.f4919a = this.f4909s0;
/* 16 */            sliderState.f4920b = this.f4910t0;
/* 25 */            sliderState.f4921c = new ArrayList(this.f4911u0);
/* 29 */            sliderState.f4922d = this.f4916x0;
/* 35 */            sliderState.f4923e = hasFocus();
/* 37 */            return sliderState;
                }

                @Override // android.view.View
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
/* 11 */            this.f4868A0 = Math.max(i - (this.f4901k0 * 2), 0);
/* 13 */            m2362l();
/* 16 */            m2373w();
                }

                @Override // android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
/* 6 */             if (isEnabled()) {
/* 9 */                 float x = motionEvent.getX();
/* 21 */                float f = (x - this.f4901k0) / this.f4868A0;
/* 22 */                this.f4879L0 = f;
/* 25 */                float fMax = Math.max(0.0f, f);
/* 29 */                this.f4879L0 = fMax;
/* 37 */                this.f4879L0 = Math.min(1.0f, fMax);
/* 39 */                int actionMasked = motionEvent.getActionMasked();
/* 44 */                if (actionMasked != 0) {
/* 46 */                    int i = this.f4893e0;
/* 48 */                    if (actionMasked == 1) {
/* 109 */                       this.f4908r0 = false;
/* 111 */                       MotionEvent motionEvent2 = this.f4907q0;
/* 113 */                       if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                                    float f2 = i;
/* 139 */                           if (Math.abs(this.f4907q0.getX() - motionEvent.getX()) <= f2 && Math.abs(this.f4907q0.getY() - motionEvent.getY()) <= f2 && mo2367q()) {
/* 166 */                               m2366p();
                                    }
                                }
/* 172 */                       if (this.f4913v0 != -1) {
/* 174 */                           m2371u();
/* 177 */                           this.f4913v0 = -1;
/* 181 */                           Iterator it = this.f4885a0.iterator();
/* 189 */                           if (it.hasNext()) {
/* 196 */                               throw fm0.m3780f(it);
                                    }
                                }
/* 197 */                       invalidate();
                            } else if (actionMasked == 2) {
/* 57 */                        if (!this.f4908r0) {
/* 63 */                            if (!m2359i() || Math.abs(x - this.f4906p0) >= i) {
/* 82 */                                getParent().requestDisallowInterceptTouchEvent(true);
/* 85 */                                m2366p();
                                    }
                                }
/* 92 */                        if (mo2367q()) {
/* 96 */                            this.f4908r0 = true;
/* 98 */                            m2371u();
/* 101 */                           m2373w();
/* 104 */                           invalidate();
                                }
                            }
                        } else {
/* 201 */                   this.f4906p0 = x;
/* 207 */                   if (!m2359i()) {
/* 214 */                       getParent().requestDisallowInterceptTouchEvent(true);
/* 221 */                       if (mo2367q()) {
/* 224 */                           requestFocus();
/* 227 */                           this.f4908r0 = true;
/* 229 */                           m2371u();
/* 232 */                           m2373w();
/* 235 */                           invalidate();
/* 238 */                           m2366p();
                                }
                            }
                        }
/* 243 */               setPressed(this.f4908r0);
/* 250 */               this.f4907q0 = MotionEvent.obtain(motionEvent);
/* 43 */                return true;
                    }
/* 5 */             return false;
                }

                /* JADX INFO: renamed from: p */
                public final void m2366p() {
/* 3 */             Iterator it = this.f4885a0.iterator();
/* 11 */            if (it.hasNext()) {
/* 18 */                throw fm0.m3780f(it);
                    }
                }

                /* JADX INFO: renamed from: q */
                public boolean mo2367q() {
/* 5 */             if (this.f4913v0 == -1) {
/* 9 */                 float f = this.f4879L0;
/* 15 */                if (m2361k()) {
/* 19 */                    f = 1.0f - f;
                        }
/* 21 */                float f2 = this.f4910t0;
/* 23 */                float f3 = this.f4909s0;
/* 25 */                float fM3503g = AbstractC0886en.m3503g(f2, f3, f, f3);
/* 40 */                float fM2365o = (m2365o(fM3503g) * this.f4868A0) + this.f4901k0;
/* 42 */                this.f4913v0 = 0;
/* 57 */                float fAbs = Math.abs(((Float) this.f4911u0.get(0)).floatValue() - fM3503g);
/* 68 */                for (int i = 1; i < this.f4911u0.size(); i++) {
/* 83 */                    float fAbs2 = Math.abs(((Float) this.f4911u0.get(i)).floatValue() - fM3503g);
/* 110 */                   float fM2365o2 = (m2365o(((Float) this.f4911u0.get(i)).floatValue()) * this.f4868A0) + this.f4901k0;
/* 115 */                   if (Float.compare(fAbs2, fAbs) > 1) {
                                break;
                            }
/* 133 */                   boolean z = !m2361k() ? fM2365o2 - fM2365o >= 0.0f : fM2365o2 - fM2365o <= 0.0f;
/* 146 */                   if (Float.compare(fAbs2, fAbs) < 0) {
/* 148 */                       this.f4913v0 = i;
                            } else {
/* 155 */                       if (Float.compare(fAbs2, fAbs) != 0) {
                                    continue;
                                } else {
/* 167 */                           if (Math.abs(fM2365o2 - fM2365o) < this.f4893e0) {
/* 169 */                               this.f4913v0 = -1;
/* 41 */                                return false;
                                    }
/* 172 */                           if (z) {
/* 174 */                               this.f4913v0 = i;
                                    }
                                }
                            }
/* 176 */                   fAbs = fAbs2;
                        }
/* 182 */               if (this.f4913v0 == -1) {
/* 41 */                    return false;
                        }
                    }
/* 3 */             return true;
                }

                /* JADX INFO: renamed from: r */
                public final void m2368r(dq2 dq2Var, float f) {
/* 1 */             String strM2356f = m2356f(f);
/* 11 */            if (!TextUtils.equals(dq2Var.f7367i0, strM2356f)) {
/* 13 */                dq2Var.f7367i0 = strM2356f;
/* 18 */                dq2Var.f7370l0.f8750d = true;
/* 20 */                dq2Var.invalidateSelf();
                    }
/* 41 */            int iM2365o = (this.f4901k0 + ((int) (m2365o(f) * this.f4868A0))) - (dq2Var.getIntrinsicWidth() / 2);
/* 51 */            int iM2352b = m2352b() - (this.f4905o0 + this.f4903m0);
/* 63 */            dq2Var.setBounds(iM2365o, iM2352b - dq2Var.getIntrinsicHeight(), dq2Var.getIntrinsicWidth() + iM2365o, iM2352b);
/* 72 */            Rect rect = new Rect(dq2Var.getBounds());
/* 79 */            w70.m9480c(kb1.m6034G(this), this, rect);
/* 82 */            dq2Var.setBounds(rect);
/* 85 */            ViewGroup viewGroupM6034G = kb1.m6034G(this);
/* 103 */           ((ViewOverlay) (viewGroupM6034G == null ? null : new fs0(viewGroupM6034G)).f8339b).add(dq2Var);
                }

                /* JADX INFO: renamed from: s */
                public final void m2369s(ArrayList arrayList) {
                    ViewGroup viewGroupM6034G;
                    int resourceId;
/* 5 */             if (arrayList.isEmpty()) {
/* 530 */               C1951n4.m6859j("At least one value must be set");
/* 533 */               return;
                    }
/* 7 */             Collections.sort(arrayList);
/* 20 */            if (this.f4911u0.size() == arrayList.size() && this.f4911u0.equals(arrayList)) {
/* 30 */                return;
                    }
/* 31 */            this.f4911u0 = arrayList;
/* 34 */            this.f4870C0 = true;
/* 37 */            this.f4915w0 = 0;
/* 39 */            m2373w();
/* 42 */            ArrayList<dq2> arrayList2 = this.f4882V;
/* 55 */            if (arrayList2.size() > this.f4911u0.size()) {
/* 67 */                List<dq2> listSubList = arrayList2.subList(this.f4911u0.size(), arrayList2.size());
/* 79 */                for (dq2 dq2Var : listSubList) {
/* 87 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 93 */                    if (isAttachedToWindow()) {
/* 95 */                        ViewGroup viewGroupM6034G2 = kb1.m6034G(this);
/* 105 */                       fs0 fs0Var = viewGroupM6034G2 == null ? null : new fs0(viewGroupM6034G2);
/* 108 */                       if (fs0Var != null) {
/* 114 */                           ((ViewOverlay) fs0Var.f8339b).remove(dq2Var);
/* 117 */                           ViewGroup viewGroupM6034G3 = kb1.m6034G(this);
/* 121 */                           if (viewGroupM6034G3 == null) {
/* 123 */                               dq2Var.getClass();
                                    } else {
/* 129 */                               viewGroupM6034G3.removeOnLayoutChangeListener(dq2Var.f7371m0);
                                    }
                                }
                            }
                        }
/* 133 */               listSubList.clear();
                    }
/* 146 */           while (arrayList2.size() < this.f4911u0.size()) {
/* 148 */               C0371a c0371a = this.f4881U;
/* 150 */               BaseSlider baseSlider = c0371a.f4930c;
/* 166 */               TypedArray typedArrayM8213d = rn2.m8213d(baseSlider.getContext(), c0371a.f4928a, R$styleable.Slider, c0371a.f4929b, f4867N0, new int[0]);
/* 170 */               Context context = baseSlider.getContext();
/* 178 */               int resourceId2 = typedArrayM8213d.getResourceId(R$styleable.Slider_labelStyle, R$style.Widget_MaterialComponents_Tooltip);
/* 184 */               dq2 dq2Var2 = new dq2(context, resourceId2);
/* 195 */               TypedArray typedArrayM8213d2 = rn2.m8213d(dq2Var2.f7368j0, null, R$styleable.Tooltip, 0, resourceId2, new int[0]);
/* 199 */               Context context2 = dq2Var2.f7368j0;
/* 211 */               dq2Var2.f7377s0 = context2.getResources().getDimensionPixelSize(R$dimen.mtrl_tooltip_arrowSize);
/* 217 */               sc2 sc2VarM8779f = dq2Var2.f8151a.f7635a.m8779f();
/* 225 */               sc2VarM8779f.f16533k = dq2Var2.m3176x();
/* 231 */               dq2Var2.setShapeAppearanceModel(sc2VarM8779f.m8478a());
/* 236 */               CharSequence text = typedArrayM8213d2.getText(R$styleable.Tooltip_android_text);
/* 242 */               boolean zEquals = TextUtils.equals(dq2Var2.f7367i0, text);
/* 246 */               gn2 gn2Var = dq2Var2.f7370l0;
/* 248 */               if (!zEquals) {
/* 250 */                   dq2Var2.f7367i0 = text;
/* 252 */                   gn2Var.f8750d = true;
/* 254 */                   dq2Var2.invalidateSelf();
                        }
/* 257 */               int i = R$styleable.Tooltip_android_textAppearance;
/* 277 */               dn2 dn2Var = (!typedArrayM8213d2.hasValue(i) || (resourceId = typedArrayM8213d2.getResourceId(i, 0)) == 0) ? null : new dn2(context2, resourceId);
/* 278 */               if (dn2Var != null && typedArrayM8213d2.hasValue(R$styleable.Tooltip_android_textColor)) {
/* 294 */                   dn2Var.f7346j = de3.m3033o(context2, typedArrayM8213d2, R$styleable.Tooltip_android_textColor);
                        }
/* 296 */               gn2Var.m3978b(dn2Var, context2);
/* 348 */               dq2Var2.m3742n(ColorStateList.valueOf(typedArrayM8213d2.getColor(R$styleable.Tooltip_backgroundTint, AbstractC0196bx.m1452d(AbstractC0196bx.m1454f(yy1.m10198D(context2, dq2.class.getCanonicalName(), R$attr.colorOnBackground), 153), AbstractC0196bx.m1454f(yy1.m10198D(context2, dq2.class.getCanonicalName(), R.attr.colorBackground), 229)))));
/* 365 */               dq2Var2.m3747s(ColorStateList.valueOf(yy1.m10198D(context2, dq2.class.getCanonicalName(), R$attr.colorSurface)));
/* 374 */               dq2Var2.f7373o0 = typedArrayM8213d2.getDimensionPixelSize(R$styleable.Tooltip_android_padding, 0);
/* 382 */               dq2Var2.f7374p0 = typedArrayM8213d2.getDimensionPixelSize(R$styleable.Tooltip_android_minWidth, 0);
/* 390 */               dq2Var2.f7375q0 = typedArrayM8213d2.getDimensionPixelSize(R$styleable.Tooltip_android_minHeight, 0);
/* 398 */               dq2Var2.f7376r0 = typedArrayM8213d2.getDimensionPixelSize(R$styleable.Tooltip_android_layout_margin, 0);
/* 400 */               typedArrayM8213d2.recycle();
/* 403 */               typedArrayM8213d.recycle();
/* 406 */               arrayList2.add(dq2Var2);
/* 409 */               WeakHashMap weakHashMap2 = e33.f7494a;
/* 415 */               if (isAttachedToWindow() && (viewGroupM6034G = kb1.m6034G(this)) != null) {
/* 426 */                   int[] iArr = new int[2];
/* 428 */                   viewGroupM6034G.getLocationOnScreen(iArr);
/* 433 */                   dq2Var2.f7378t0 = iArr[0];
/* 437 */                   viewGroupM6034G.getWindowVisibleDisplayFrame(dq2Var2.f7372n0);
/* 442 */                   viewGroupM6034G.addOnLayoutChangeListener(dq2Var2.f7371m0);
                        }
                    }
/* 451 */           int i2 = arrayList2.size() == 1 ? 0 : 1;
/* 462 */           for (dq2 dq2Var3 : arrayList2) {
/* 473 */               dq2Var3.f8151a.f7644j = i2;
/* 475 */               dq2Var3.invalidateSelf();
                    }
/* 481 */           Iterator it = this.f4883W.iterator();
/* 489 */           while (it.hasNext()) {
/* 495 */               if (it.next() != null) {
/* 520 */                   C1697u2.m5431g();
/* 523 */                   return;
                        }
/* 499 */               Iterator it2 = this.f4911u0.iterator();
/* 507 */               if (it2.hasNext()) {
/* 516 */                   ((Float) it2.next()).getClass();
/* 519 */                   throw null;
                        }
                    }
/* 524 */           postInvalidate();
                }

                public void setActiveThumbIndex(int i) {
/* 1 */             this.f4913v0 = i;
                }

                public void setCustomThumbDrawable(Drawable drawable) {
/* 9 */             Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
/* 13 */            m2351a(drawableNewDrawable);
/* 16 */            this.f4877J0 = drawableNewDrawable;
/* 20 */            this.f4878K0.clear();
/* 23 */            postInvalidate();
                }

                public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
/* 2 */             this.f4877J0 = null;
/* 9 */             this.f4878K0 = new ArrayList();
/* 13 */            for (Drawable drawable : drawableArr) {
/* 17 */                List list = this.f4878K0;
/* 27 */                Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
/* 31 */                m2351a(drawableNewDrawable);
/* 34 */                list.add(drawableNewDrawable);
                    }
/* 40 */            postInvalidate();
                }

                @Override // android.view.View
                public void setEnabled(boolean z) {
/* 1 */             super.setEnabled(z);
/* 10 */            setLayerType(z ? 0 : 2, null);
                }

                public void setFocusedThumbIndex(int i) {
/* 1 */             if (i < 0 || i >= this.f4911u0.size()) {
/* 24 */                C1951n4.m6859j("index out of range");
/* 27 */                return;
                    }
/* 11 */            this.f4915w0 = i;
/* 15 */            this.f4898i.m8498w(i);
/* 18 */            postInvalidate();
                }

                public void setHaloRadius(int i) {
/* 3 */             if (i == this.f4904n0) {
/* 5 */                 return;
                    }
/* 6 */             this.f4904n0 = i;
/* 8 */             Drawable background = getBackground();
/* 18 */            if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
/* 28 */                ((RippleDrawable) background).setRadius(this.f4904n0);
                    } else {
/* 32 */                postInvalidate();
                    }
                }

                public void setHaloTintList(ColorStateList colorStateList) {
/* 7 */             if (colorStateList.equals(this.f4871D0)) {
/* 9 */                 return;
                    }
/* 10 */            this.f4871D0 = colorStateList;
/* 12 */            Drawable background = getBackground();
/* 22 */            if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
/* 30 */                ((RippleDrawable) background).setColor(colorStateList);
/* 33 */                return;
                    }
/* 34 */            int iM2358h = m2358h(colorStateList);
/* 38 */            Paint paint = this.f4890d;
/* 40 */            paint.setColor(iM2358h);
/* 45 */            paint.setAlpha(63);
/* 48 */            invalidate();
                }

                public void setLabelBehavior(int i) {
/* 3 */             if (this.f4899i0 != i) {
/* 5 */                 this.f4899i0 = i;
/* 7 */                 requestLayout();
                    }
                }

                public void setSeparationUnit(int i) {
/* 1 */             this.f4880M0 = i;
/* 4 */             this.f4870C0 = true;
/* 6 */             postInvalidate();
                }

                public void setStepSize(float f) {
/* 4 */             if (f >= 0.0f) {
/* 10 */                if (this.f4916x0 != f) {
/* 12 */                    this.f4916x0 = f;
/* 15 */                    this.f4870C0 = true;
/* 17 */                    postInvalidate();
/* 20 */                    return;
                        }
/* 20 */                return;
                    }
/* 65 */            throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + this.f4909s0 + ")-valueTo(" + this.f4910t0 + ") range");
                }

                public void setThumbElevation(float f) {
/* 3 */             this.f4876I0.m3741m(f);
                }

                public void setThumbRadius(int i) {
/* 3 */             if (i == this.f4903m0) {
/* 5 */                 return;
                    }
/* 6 */             this.f4903m0 = i;
/* 11 */            int i2 = 0;
/* 19 */            this.f4901k0 = this.f4895f0 + Math.max(i - this.f4896g0, 0);
/* 21 */            WeakHashMap weakHashMap = e33.f7494a;
/* 27 */            if (isLaidOut()) {
/* 42 */                this.f4868A0 = Math.max(getWidth() - (this.f4901k0 * 2), 0);
/* 44 */                m2362l();
                    }
/* 49 */            dc0 dc0Var = new dc0(i2);
/* 54 */            dc0 dc0Var2 = new dc0(i2);
/* 59 */            dc0 dc0Var3 = new dc0(i2);
/* 64 */            dc0 dc0Var4 = new dc0(i2);
/* 67 */            float f = this.f4903m0;
/* 70 */            w11 w11VarM4182c = he3.m4182c(0);
/* 76 */            C0862e c0862e = new C0862e(f);
/* 81 */            C0862e c0862e2 = new C0862e(f);
/* 86 */            C0862e c0862e3 = new C0862e(f);
/* 91 */            C0862e c0862e4 = new C0862e(f);
/* 96 */            tc2 tc2Var = new tc2();
/* 99 */            tc2Var.f17032a = w11VarM4182c;
/* 101 */           tc2Var.f17033b = w11VarM4182c;
/* 103 */           tc2Var.f17034c = w11VarM4182c;
/* 105 */           tc2Var.f17035d = w11VarM4182c;
/* 107 */           tc2Var.f17036e = c0862e;
/* 109 */           tc2Var.f17037f = c0862e2;
/* 111 */           tc2Var.f17038g = c0862e3;
/* 113 */           tc2Var.f17039h = c0862e4;
/* 115 */           tc2Var.f17040i = dc0Var;
/* 117 */           tc2Var.f17041j = dc0Var2;
/* 119 */           tc2Var.f17042k = dc0Var3;
/* 121 */           tc2Var.f17043l = dc0Var4;
/* 123 */           fd1 fd1Var = this.f4876I0;
/* 125 */           fd1Var.setShapeAppearanceModel(tc2Var);
/* 130 */           int i3 = this.f4903m0 * 2;
/* 132 */           fd1Var.setBounds(0, 0, i3, i3);
/* 135 */           Drawable drawable = this.f4877J0;
/* 137 */           if (drawable != null) {
/* 139 */               m2351a(drawable);
                    }
/* 144 */           Iterator it = this.f4878K0.iterator();
/* 152 */           while (it.hasNext()) {
/* 160 */               m2351a((Drawable) it.next());
                    }
/* 164 */           postInvalidate();
                }

                public void setThumbStrokeColor(ColorStateList colorStateList) {
/* 3 */             this.f4876I0.m3747s(colorStateList);
/* 6 */             postInvalidate();
                }

                public void setThumbStrokeWidth(float f) {
/* 1 */             fd1 fd1Var = this.f4876I0;
/* 5 */             fd1Var.f8151a.f7644j = f;
/* 7 */             fd1Var.invalidateSelf();
/* 10 */            postInvalidate();
                }

                public void setTickActiveTintList(ColorStateList colorStateList) {
/* 7 */             if (colorStateList.equals(this.f4872E0)) {
/* 9 */                 return;
                    }
/* 10 */            this.f4872E0 = colorStateList;
/* 18 */            this.f4894f.setColor(m2358h(colorStateList));
/* 21 */            invalidate();
                }

                public void setTickInactiveTintList(ColorStateList colorStateList) {
/* 7 */             if (colorStateList.equals(this.f4873F0)) {
/* 9 */                 return;
                    }
/* 10 */            this.f4873F0 = colorStateList;
/* 18 */            this.f4892e.setColor(m2358h(colorStateList));
/* 21 */            invalidate();
                }

                public void setTrackActiveTintList(ColorStateList colorStateList) {
/* 7 */             if (colorStateList.equals(this.f4874G0)) {
/* 9 */                 return;
                    }
/* 10 */            this.f4874G0 = colorStateList;
/* 18 */            this.f4886b.setColor(m2358h(colorStateList));
/* 21 */            invalidate();
                }

                public void setTrackHeight(int i) {
/* 3 */             if (this.f4900j0 != i) {
/* 5 */                 this.f4900j0 = i;
/* 10 */                this.f4884a.setStrokeWidth(i);
/* 18 */                this.f4886b.setStrokeWidth(this.f4900j0);
/* 29 */                this.f4892e.setStrokeWidth(this.f4900j0 / 2.0f);
/* 38 */                this.f4894f.setStrokeWidth(this.f4900j0 / 2.0f);
/* 41 */                postInvalidate();
                    }
                }

                public void setTrackInactiveTintList(ColorStateList colorStateList) {
/* 7 */             if (colorStateList.equals(this.f4875H0)) {
/* 9 */                 return;
                    }
/* 10 */            this.f4875H0 = colorStateList;
/* 18 */            this.f4884a.setColor(m2358h(colorStateList));
/* 21 */            invalidate();
                }

                public void setValues(Float... fArr) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Collections.addAll(arrayList, fArr);
/* 9 */             m2369s(arrayList);
                }

                /* JADX INFO: renamed from: t */
                public final boolean m2370t(float f, int i) {
/* 1 */             this.f4915w0 = i;
/* 30 */            if (Math.abs(f - ((Float) this.f4911u0.get(i)).floatValue()) < 1.0E-4d) {
/* 29 */                return false;
                    }
/* 33 */            float minSeparation = getMinSeparation();
/* 39 */            if (this.f4880M0 == 0) {
/* 44 */                if (minSeparation == 0.0f) {
/* 46 */                    minSeparation = 0.0f;
                        } else {
/* 55 */                    float f2 = (minSeparation - this.f4901k0) / this.f4868A0;
/* 56 */                    float f3 = this.f4909s0;
/* 60 */                    minSeparation = AbstractC0886en.m3503g(f3, this.f4910t0, f2, f3);
                        }
                    }
/* 68 */            if (m2361k()) {
/* 70 */                minSeparation = -minSeparation;
                    }
/* 71 */            int i2 = i + 1;
/* 96 */            float fFloatValue = i2 >= this.f4911u0.size() ? this.f4910t0 : ((Float) this.f4911u0.get(i2)).floatValue() - minSeparation;
/* 97 */            int i3 = i - 1;
/* 116 */           float fFloatValue2 = i3 < 0 ? this.f4909s0 : minSeparation + ((Float) this.f4911u0.get(i3)).floatValue();
/* 119 */           if (f < fFloatValue2) {
/* 121 */               f = fFloatValue2;
                    } else if (f > fFloatValue) {
/* 127 */               f = fFloatValue;
                    }
/* 134 */           this.f4911u0.set(i, Float.valueOf(f));
/* 139 */           Iterator it = this.f4883W.iterator();
/* 147 */           if (it.hasNext()) {
/* 189 */               if (it.next() != null) {
/* 191 */                   C1697u2.m5431g();
/* 29 */                    return false;
                        }
/* 203 */               ((Float) this.f4911u0.get(i)).getClass();
/* 207 */               throw null;
                    }
/* 150 */           AccessibilityManager accessibilityManager = this.f4912v;
/* 152 */           if (accessibilityManager != null && accessibilityManager.isEnabled()) {
/* 160 */               RunnableC0374d runnableC0374d = this.f4914w;
/* 162 */               if (runnableC0374d == null) {
/* 169 */                   this.f4914w = new RunnableC0374d(this);
                        } else {
/* 172 */                   removeCallbacks(runnableC0374d);
                        }
/* 175 */               RunnableC0374d runnableC0374d2 = this.f4914w;
/* 177 */               runnableC0374d2.f4933a = i;
/* 181 */               postDelayed(runnableC0374d2, 200L);
                    }
/* 149 */           return true;
                }

                /* JADX INFO: renamed from: u */
                public final void m2371u() {
                    double dRound;
/* 1 */             float f = this.f4879L0;
/* 3 */             float f2 = this.f4916x0;
/* 8 */             if (f2 > 0.0f) {
/* 16 */                int i = (int) ((this.f4910t0 - this.f4909s0) / f2);
/* 25 */                dRound = ((double) Math.round(f * i)) / ((double) i);
                    } else {
                        dRound = f;
                    }
/* 32 */            if (m2361k()) {
/* 36 */                dRound = 1.0d - dRound;
                    }
/* 38 */            float f3 = this.f4910t0;
/* 40 */            float f4 = this.f4909s0;
/* 50 */            m2370t((float) ((dRound * ((double) (f3 - f4))) + ((double) f4)), this.f4913v0);
                }

                /* JADX INFO: renamed from: v */
                public final void m2372v(int i, Rect rect) {
/* 26 */            int iM2365o = this.f4901k0 + ((int) (m2365o(getValues().get(i).floatValue()) * this.f4868A0));
/* 27 */            int iM2352b = m2352b();
/* 31 */            int i2 = this.f4903m0;
/* 39 */            rect.set(iM2365o - i2, iM2352b - i2, iM2365o + i2, iM2352b + i2);
                }

                /* JADX INFO: renamed from: w */
                public final void m2373w() {
/* 7 */             if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
/* 65 */                return;
                    }
/* 15 */            Drawable background = getBackground();
/* 21 */            if (background instanceof RippleDrawable) {
/* 49 */                int iM2365o = (int) ((m2365o(((Float) this.f4911u0.get(this.f4915w0)).floatValue()) * this.f4868A0) + this.f4901k0);
/* 50 */                int iM2352b = m2352b();
/* 54 */                int i = this.f4904n0;
/* 62 */                s90.m8446f(background, iM2365o - i, iM2352b - i, iM2365o + i, iM2352b + i);
                    }
                }

                /* JADX INFO: renamed from: x */
                public final void m2374x() {
/* 3 */             if (this.f4870C0) {
/* 5 */                 float f = this.f4909s0;
/* 7 */                 float f2 = this.f4910t0;
/* 11 */                if (f >= f2) {
/* 444 */                   C1951n4.m6860k("valueFrom(", f, ") must be smaller than valueTo(", f2);
/* 447 */                   return;
                        }
/* 15 */                if (f2 <= f) {
/* 436 */                   C1951n4.m6860k("valueTo(", f2, ") must be greater than valueFrom(", f);
/* 439 */                   return;
                        }
/* 22 */                if (this.f4916x0 > 0.0f && !m2360j(f2 - f)) {
/* 78 */                    throw new IllegalStateException("The stepSize(" + this.f4916x0 + ") must be 0, or a factor of the valueFrom(" + this.f4909s0 + ")-valueTo(" + this.f4910t0 + ") range");
                        }
/* 93 */                for (Float f3 : this.f4911u0) {
/* 109 */                   if (f3.floatValue() < this.f4909s0 || f3.floatValue() > this.f4910t0) {
/* 232 */                       throw new IllegalStateException("Slider value(" + f3 + ") must be greater or equal to valueFrom(" + this.f4909s0 + "), and lower or equal to valueTo(" + this.f4910t0 + ")");
                            }
/* 125 */                   if (this.f4916x0 > 0.0f && !m2360j(f3.floatValue() - this.f4909s0)) {
/* 143 */                       float f4 = this.f4909s0;
/* 145 */                       float f5 = this.f4916x0;
/* 189 */                       throw new IllegalStateException("Value(" + f3 + ") must be equal to valueFrom(" + f4 + ") plus a multiple of stepSize(" + f5 + ") when using stepSize(" + f5 + ")");
                            }
                        }
/* 233 */               float minSeparation = getMinSeparation();
/* 241 */               if (minSeparation < 0.0f) {
/* 431 */                   throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
                        }
/* 243 */               float f6 = this.f4916x0;
/* 247 */               if (f6 > 0.0f && minSeparation > 0.0f) {
/* 256 */                   if (this.f4880M0 != 1) {
/* 308 */                       C1951n4.m6860k("minSeparation(", minSeparation, ") cannot be set as a dimension when using stepSize(", f6);
/* 311 */                       return;
                            }
/* 260 */                   if (minSeparation < f6 || !m2360j(minSeparation)) {
/* 271 */                       float f7 = this.f4916x0;
/* 305 */                       throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f7 + ") when using stepSize(" + f7 + ")");
                            }
                        }
/* 312 */               float f8 = this.f4916x0;
/* 316 */               if (f8 != 0.0f) {
/* 327 */                   if (((int) f8) != f8) {
/* 346 */                       AbstractC1245n0.m4889q("BaseSlider", "Floating point value used for stepSize(" + f8 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                            }
/* 349 */                   float f9 = this.f4909s0;
/* 355 */                   if (((int) f9) != f9) {
/* 374 */                       AbstractC1245n0.m4889q("BaseSlider", "Floating point value used for valueFrom(" + f9 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                            }
/* 377 */                   float f10 = this.f4910t0;
/* 383 */                   if (((int) f10) != f10) {
/* 402 */                       AbstractC1245n0.m4889q("BaseSlider", "Floating point value used for valueTo(" + f10 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                            }
                        }
/* 406 */               this.f4870C0 = false;
                    }
                }

/* 12 */        public void setValues(List<Float> list) {
/* 13 */            m2369s(new ArrayList(list));
                }

/* 43 */        public void setCustomThumbDrawablesForValues(int... iArr) {
/* 44 */            Drawable[] drawableArr = new Drawable[iArr.length];
/* 45 */            for (int i = 0; i < iArr.length; i++) {
/* 46 */                drawableArr[i] = getResources().getDrawable(iArr[i]);
                    }
/* 47 */            setCustomThumbDrawablesForValues(drawableArr);
                }

/* 536 */       public BaseSlider(Context context, AttributeSet attributeSet) {
/* 537 */           this(context, attributeSet, R$attr.sliderStyle);
                }
            }
