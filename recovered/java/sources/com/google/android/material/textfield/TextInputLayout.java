            package com.google.android.material.textfield;

            import android.R;
            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Configuration;
            import android.content.res.TypedArray;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.Typeface;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.LayerDrawable;
            import android.os.Build;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextPaint;
            import android.text.TextUtils;
            import android.text.method.PasswordTransformationMethod;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewStructure;
            import android.view.accessibility.AccessibilityManager;
            import android.view.animation.LinearInterpolator;
            import android.widget.AutoCompleteTextView;
            import android.widget.EditText;
            import android.widget.FrameLayout;
            import android.widget.LinearLayout;
            import android.widget.TextView;
            import androidx.appcompat.widget.AppCompatTextView;
            import androidx.customview.view.AbsSavedState;
            import androidx.transition.Fade;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$color;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$id;
            import com.google.android.material.R$layout;
            import com.google.android.material.R$string;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import com.google.android.material.internal.CheckableImageButton;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Locale;
            import java.util.WeakHashMap;
            import okhttp3.HttpUrl;
            import p000.AbstractC0196bx;
            import p000.AbstractC2246u8;
            import p000.AccessibilityManagerTouchExplorationStateChangeListenerC2238u0;
            import p000.C0021aj;
            import p000.C0862e;
            import p000.C1867kv;
            import p000.C1941mv;
            import p000.C1951n4;
            import p000.C1978nv;
            import p000.C1979nw;
            import p000.C2121qv;
            import p000.C2184sk;
            import p000.C2491ya;
            import p000.ViewOnFocusChangeListenerC1904lv;
            import p000.ac1;
            import p000.cp0;
            import p000.de0;
            import p000.de3;
            import p000.dp0;
            import p000.e33;
            import p000.en2;
            import p000.f42;
            import p000.fd1;
            import p000.fm0;
            import p000.hd1;
            import p000.hn2;
            import p000.in2;
            import p000.kb1;
            import p000.kg2;
            import p000.lr2;
            import p000.m10;
            import p000.mn0;
            import p000.or1;
            import p000.ox0;
            import p000.px0;
            import p000.rn2;
            import p000.s30;
            import p000.s90;
            import p000.sc2;
            import p000.tc2;
            import p000.v00;
            import p000.v20;
            import p000.v23;
            import p000.w11;
            import p000.w70;
            import p000.w90;
            import p000.xe2;
            import p000.za0;
            import p000.zr3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public class TextInputLayout extends LinearLayout {

                /* JADX INFO: renamed from: t1 */
                public static final int f5002t1 = R$style.Widget_Design_TextInputLayout;

                /* JADX INFO: renamed from: A0 */
                public int f5003A0;

                /* JADX INFO: renamed from: B0 */
                public int f5004B0;

                /* JADX INFO: renamed from: C0 */
                public int f5005C0;

                /* JADX INFO: renamed from: D0 */
                public int f5006D0;

                /* JADX INFO: renamed from: E0 */
                public int f5007E0;

                /* JADX INFO: renamed from: F0 */
                public int f5008F0;

                /* JADX INFO: renamed from: G0 */
                public final Rect f5009G0;

                /* JADX INFO: renamed from: H0 */
                public final Rect f5010H0;

                /* JADX INFO: renamed from: I0 */
                public final RectF f5011I0;

                /* JADX INFO: renamed from: J0 */
                public Typeface f5012J0;

                /* JADX INFO: renamed from: K0 */
                public ColorDrawable f5013K0;

                /* JADX INFO: renamed from: L0 */
                public int f5014L0;

                /* JADX INFO: renamed from: M0 */
                public final LinkedHashSet f5015M0;

                /* JADX INFO: renamed from: N0 */
                public int f5016N0;

                /* JADX INFO: renamed from: O0 */
                public final SparseArray f5017O0;

                /* JADX INFO: renamed from: P0 */
                public final CheckableImageButton f5018P0;

                /* JADX INFO: renamed from: Q0 */
                public final LinkedHashSet f5019Q0;

                /* JADX INFO: renamed from: R0 */
                public ColorStateList f5020R0;

                /* JADX INFO: renamed from: S0 */
                public PorterDuff.Mode f5021S0;

                /* JADX INFO: renamed from: T0 */
                public ColorDrawable f5022T0;

                /* JADX INFO: renamed from: U */
                public int f5023U;

                /* JADX INFO: renamed from: U0 */
                public int f5024U0;

                /* JADX INFO: renamed from: V */
                public final px0 f5025V;

                /* JADX INFO: renamed from: V0 */
                public Drawable f5026V0;

                /* JADX INFO: renamed from: W */
                public boolean f5027W;

                /* JADX INFO: renamed from: W0 */
                public View.OnLongClickListener f5028W0;

                /* JADX INFO: renamed from: X0 */
                public View.OnLongClickListener f5029X0;

                /* JADX INFO: renamed from: Y0 */
                public final CheckableImageButton f5030Y0;

                /* JADX INFO: renamed from: Z0 */
                public ColorStateList f5031Z0;

                /* JADX INFO: renamed from: a */
                public final FrameLayout f5032a;

                /* JADX INFO: renamed from: a0 */
                public int f5033a0;

                /* JADX INFO: renamed from: a1 */
                public PorterDuff.Mode f5034a1;

                /* JADX INFO: renamed from: b */
                public final kg2 f5035b;

                /* JADX INFO: renamed from: b0 */
                public boolean f5036b0;

                /* JADX INFO: renamed from: b1 */
                public ColorStateList f5037b1;

                /* JADX INFO: renamed from: c */
                public final LinearLayout f5038c;

                /* JADX INFO: renamed from: c0 */
                public AppCompatTextView f5039c0;

                /* JADX INFO: renamed from: c1 */
                public ColorStateList f5040c1;

                /* JADX INFO: renamed from: d */
                public final FrameLayout f5041d;

                /* JADX INFO: renamed from: d0 */
                public int f5042d0;

                /* JADX INFO: renamed from: d1 */
                public int f5043d1;

                /* JADX INFO: renamed from: e */
                public EditText f5044e;

                /* JADX INFO: renamed from: e0 */
                public int f5045e0;

                /* JADX INFO: renamed from: e1 */
                public int f5046e1;

                /* JADX INFO: renamed from: f */
                public CharSequence f5047f;

                /* JADX INFO: renamed from: f0 */
                public CharSequence f5048f0;

                /* JADX INFO: renamed from: f1 */
                public int f5049f1;

                /* JADX INFO: renamed from: g0 */
                public boolean f5050g0;

                /* JADX INFO: renamed from: g1 */
                public ColorStateList f5051g1;

                /* JADX INFO: renamed from: h0 */
                public AppCompatTextView f5052h0;

                /* JADX INFO: renamed from: h1 */
                public int f5053h1;

                /* JADX INFO: renamed from: i */
                public int f5054i;

                /* JADX INFO: renamed from: i0 */
                public ColorStateList f5055i0;

                /* JADX INFO: renamed from: i1 */
                public int f5056i1;

                /* JADX INFO: renamed from: j0 */
                public int f5057j0;

                /* JADX INFO: renamed from: j1 */
                public int f5058j1;

                /* JADX INFO: renamed from: k0 */
                public Fade f5059k0;

                /* JADX INFO: renamed from: k1 */
                public int f5060k1;

                /* JADX INFO: renamed from: l0 */
                public Fade f5061l0;

                /* JADX INFO: renamed from: l1 */
                public int f5062l1;

                /* JADX INFO: renamed from: m0 */
                public ColorStateList f5063m0;

                /* JADX INFO: renamed from: m1 */
                public boolean f5064m1;

                /* JADX INFO: renamed from: n0 */
                public ColorStateList f5065n0;

                /* JADX INFO: renamed from: n1 */
                public final C1979nw f5066n1;

                /* JADX INFO: renamed from: o0 */
                public CharSequence f5067o0;

                /* JADX INFO: renamed from: o1 */
                public boolean f5068o1;

                /* JADX INFO: renamed from: p0 */
                public final AppCompatTextView f5069p0;

                /* JADX INFO: renamed from: p1 */
                public boolean f5070p1;

                /* JADX INFO: renamed from: q0 */
                public boolean f5071q0;

                /* JADX INFO: renamed from: q1 */
                public ValueAnimator f5072q1;

                /* JADX INFO: renamed from: r0 */
                public CharSequence f5073r0;

                /* JADX INFO: renamed from: r1 */
                public boolean f5074r1;

                /* JADX INFO: renamed from: s0 */
                public boolean f5075s0;

                /* JADX INFO: renamed from: s1 */
                public boolean f5076s1;

                /* JADX INFO: renamed from: t0 */
                public fd1 f5077t0;

                /* JADX INFO: renamed from: u0 */
                public fd1 f5078u0;

                /* JADX INFO: renamed from: v */
                public int f5079v;

                /* JADX INFO: renamed from: v0 */
                public fd1 f5080v0;

                /* JADX INFO: renamed from: w */
                public int f5081w;

                /* JADX INFO: renamed from: w0 */
                public tc2 f5082w0;

                /* JADX INFO: renamed from: x0 */
                public boolean f5083x0;

                /* JADX INFO: renamed from: y0 */
                public final int f5084y0;

                /* JADX INFO: renamed from: z0 */
                public int f5085z0;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends AbsSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0378a();

                    /* JADX INFO: renamed from: c */
                    public CharSequence f5086c;

                    /* JADX INFO: renamed from: d */
                    public boolean f5087d;

                    /* JADX INFO: renamed from: e */
                    public CharSequence f5088e;

                    /* JADX INFO: renamed from: f */
                    public CharSequence f5089f;

                    /* JADX INFO: renamed from: i */
                    public CharSequence f5090i;

                    public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */                 super(parcel, classLoader);
/* 4 */                 Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
/* 12 */                this.f5086c = (CharSequence) creator.createFromParcel(parcel);
/* 23 */                this.f5087d = parcel.readInt() == 1;
/* 31 */                this.f5088e = (CharSequence) creator.createFromParcel(parcel);
/* 39 */                this.f5089f = (CharSequence) creator.createFromParcel(parcel);
/* 47 */                this.f5090i = (CharSequence) creator.createFromParcel(parcel);
                    }

                    public final String toString() {
/* 64 */                return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f5086c) + " hint=" + ((Object) this.f5088e) + " helperText=" + ((Object) this.f5089f) + " placeholderText=" + ((Object) this.f5090i) + "}";
                    }

                    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 TextUtils.writeToParcel(this.f5086c, parcel, i);
/* 11 */                parcel.writeInt(this.f5087d ? 1 : 0);
/* 16 */                TextUtils.writeToParcel(this.f5088e, parcel, i);
/* 21 */                TextUtils.writeToParcel(this.f5089f, parcel, i);
/* 26 */                TextUtils.writeToParcel(this.f5090i, parcel, i);
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v27 */
                /* JADX WARN: Type inference failed for: r6v28, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r6v51 */
                public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
                    int i2;
                    ?? r6;
/* 7 */             int i3 = f5002t1;
/* 15 */            super(hd1.m4176a(context, attributeSet, i, i3), attributeSet, i);
/* 19 */            this.f5054i = -1;
/* 21 */            this.f5079v = -1;
/* 23 */            this.f5081w = -1;
/* 25 */            this.f5023U = -1;
/* 32 */            this.f5025V = new px0(this);
/* 39 */            this.f5009G0 = new Rect();
/* 46 */            this.f5010H0 = new Rect();
/* 53 */            this.f5011I0 = new RectF();
/* 60 */            this.f5015M0 = new LinkedHashSet();
/* 63 */            this.f5016N0 = 0;
/* 67 */            SparseArray sparseArray = new SparseArray();
/* 70 */            this.f5017O0 = sparseArray;
/* 77 */            this.f5019Q0 = new LinkedHashSet();
/* 81 */            C1979nw c1979nw = new C1979nw(this);
/* 84 */            this.f5066n1 = c1979nw;
/* 86 */            Context context2 = getContext();
/* 91 */            setOrientation(1);
/* 94 */            setWillNotDraw(false);
/* 97 */            setAddStatesFromChildren(true);
/* 102 */           FrameLayout frameLayout = new FrameLayout(context2);
/* 105 */           this.f5032a = frameLayout;
/* 109 */           FrameLayout frameLayout2 = new FrameLayout(context2);
/* 112 */           this.f5041d = frameLayout2;
/* 116 */           LinearLayout linearLayout = new LinearLayout(context2);
/* 119 */           this.f5038c = linearLayout;
/* 124 */           AppCompatTextView appCompatTextView = new AppCompatTextView(context2, null);
/* 127 */           this.f5069p0 = appCompatTextView;
/* 131 */           linearLayout.setVisibility(8);
/* 134 */           frameLayout2.setVisibility(8);
/* 137 */           appCompatTextView.setVisibility(8);
/* 140 */           LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
/* 150 */           CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(R$layout.design_text_input_end_icon, (ViewGroup) linearLayout, false);
/* 152 */           this.f5030Y0 = checkableImageButton;
/* 161 */           CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(R$layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
/* 163 */           this.f5018P0 = checkableImageButton2;
/* 165 */           frameLayout.setAddStatesFromChildren(true);
/* 168 */           linearLayout.setOrientation(0);
/* 181 */           linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
/* 189 */           frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
/* 192 */           LinearInterpolator linearInterpolator = AbstractC2246u8.f17410a;
/* 194 */           c1979nw.f14506W = linearInterpolator;
/* 197 */           c1979nw.m7054j(false);
/* 200 */           c1979nw.f14505V = linearInterpolator;
/* 202 */           c1979nw.m7054j(false);
/* 208 */           c1979nw.m7057m(8388659);
/* 234 */           ac1 ac1VarM8214e = rn2.m8214e(context2, attributeSet, R$styleable.TextInputLayout, i, i3, R$styleable.TextInputLayout_counterTextAppearance, R$styleable.TextInputLayout_counterOverflowTextAppearance, R$styleable.TextInputLayout_errorTextAppearance, R$styleable.TextInputLayout_helperTextTextAppearance, R$styleable.TextInputLayout_hintTextAppearance);
/* 240 */           kg2 kg2Var = new kg2(this, ac1VarM8214e);
/* 243 */           this.f5035b = kg2Var;
/* 245 */           int i4 = R$styleable.TextInputLayout_hintEnabled;
/* 249 */           TypedArray typedArray = (TypedArray) ac1VarM8214e.f178c;
/* 258 */           this.f5071q0 = typedArray.getBoolean(i4, true);
/* 266 */           setHint(typedArray.getText(R$styleable.TextInputLayout_android_hint));
/* 275 */           this.f5070p1 = typedArray.getBoolean(R$styleable.TextInputLayout_hintAnimationEnabled, true);
/* 283 */           this.f5068o1 = typedArray.getBoolean(R$styleable.TextInputLayout_expandedHintEnabled, true);
/* 291 */           if (typedArray.hasValue(R$styleable.TextInputLayout_android_minEms)) {
/* 295 */               i2 = -1;
/* 300 */               setMinEms(typedArray.getInt(R$styleable.TextInputLayout_android_minEms, -1));
                    } else {
/* 304 */               i2 = -1;
/* 311 */               if (typedArray.hasValue(R$styleable.TextInputLayout_android_minWidth)) {
/* 319 */                   setMinWidth(typedArray.getDimensionPixelSize(R$styleable.TextInputLayout_android_minWidth, -1));
                        }
                    }
/* 328 */           if (typedArray.hasValue(R$styleable.TextInputLayout_android_maxEms)) {
/* 336 */               setMaxEms(typedArray.getInt(R$styleable.TextInputLayout_android_maxEms, i2));
                    } else if (typedArray.hasValue(R$styleable.TextInputLayout_android_maxWidth)) {
/* 354 */               setMaxWidth(typedArray.getDimensionPixelSize(R$styleable.TextInputLayout_android_maxWidth, i2));
                    }
/* 365 */           this.f5082w0 = tc2.m8775b(context2, attributeSet, i, i3).m8478a();
/* 377 */           this.f5084y0 = context2.getResources().getDimensionPixelOffset(R$dimen.mtrl_textinput_box_label_cutout_padding);
/* 386 */           this.f5003A0 = typedArray.getDimensionPixelOffset(R$styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
/* 404 */           this.f5005C0 = typedArray.getDimensionPixelSize(R$styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(R$dimen.mtrl_textinput_box_stroke_width_default));
/* 422 */           this.f5006D0 = typedArray.getDimensionPixelSize(R$styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(R$dimen.mtrl_textinput_box_stroke_width_focused));
/* 426 */           this.f5004B0 = this.f5005C0;
/* 432 */           float dimension = typedArray.getDimension(R$styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
/* 438 */           float dimension2 = typedArray.getDimension(R$styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
/* 444 */           float dimension3 = typedArray.getDimension(R$styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
/* 450 */           float dimension4 = typedArray.getDimension(R$styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
/* 456 */           sc2 sc2VarM8779f = this.f5082w0.m8779f();
/* 464 */           if (dimension >= 0.0f) {
/* 473 */               sc2VarM8779f.f16527e = new C0862e(dimension);
                    }
/* 480 */           if (dimension2 >= 0.0f) {
/* 487 */               sc2VarM8779f.f16528f = new C0862e(dimension2);
                    }
/* 491 */           if (dimension3 >= 0.0f) {
/* 498 */               sc2VarM8779f.f16529g = new C0862e(dimension3);
                    }
/* 502 */           if (dimension4 >= 0.0f) {
/* 509 */               sc2VarM8779f.f16530h = new C0862e(dimension4);
                    }
/* 515 */           this.f5082w0 = sc2VarM8779f.m8478a();
/* 519 */           ColorStateList colorStateListM3032n = de3.m3032n(context2, ac1VarM8214e, R$styleable.TextInputLayout_boxBackgroundColor);
/* 523 */           if (colorStateListM3032n != null) {
/* 525 */               int defaultColor = colorStateListM3032n.getDefaultColor();
/* 529 */               this.f5053h1 = defaultColor;
/* 531 */               this.f5008F0 = defaultColor;
/* 543 */               if (colorStateListM3032n.isStateful()) {
/* 554 */                   this.f5056i1 = colorStateListM3032n.getColorForState(new int[]{-16842910}, -1);
/* 570 */                   this.f5058j1 = colorStateListM3032n.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
/* 580 */                   this.f5060k1 = colorStateListM3032n.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
                        } else {
/* 586 */                   this.f5058j1 = this.f5053h1;
/* 590 */                   ColorStateList colorStateList = v00.getColorStateList(context2, R$color.mtrl_filled_background_color);
/* 602 */                   this.f5056i1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
/* 612 */                   this.f5060k1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
                        }
                    } else {
/* 616 */               this.f5008F0 = 0;
/* 618 */               this.f5053h1 = 0;
/* 620 */               this.f5056i1 = 0;
/* 622 */               this.f5058j1 = 0;
/* 624 */               this.f5060k1 = 0;
                    }
/* 632 */           if (typedArray.hasValue(R$styleable.TextInputLayout_android_textColorHint)) {
/* 636 */               ColorStateList colorStateListM183m = ac1VarM8214e.m183m(R$styleable.TextInputLayout_android_textColorHint);
/* 640 */               this.f5040c1 = colorStateListM183m;
/* 642 */               this.f5037b1 = colorStateListM183m;
                    }
/* 646 */           ColorStateList colorStateListM3032n2 = de3.m3032n(context2, ac1VarM8214e, R$styleable.TextInputLayout_boxStrokeColor);
/* 657 */           this.f5049f1 = typedArray.getColor(R$styleable.TextInputLayout_boxStrokeColor, 0);
/* 665 */           this.f5043d1 = v00.getColor(context2, R$color.mtrl_textinput_default_box_stroke_color);
/* 673 */           this.f5062l1 = v00.getColor(context2, R$color.mtrl_textinput_disabled_color);
/* 681 */           this.f5046e1 = v00.getColor(context2, R$color.mtrl_textinput_hovered_box_stroke_color);
/* 683 */           if (colorStateListM3032n2 != null) {
/* 685 */               setBoxStrokeColorStateList(colorStateListM3032n2);
                    }
/* 694 */           if (typedArray.hasValue(R$styleable.TextInputLayout_boxStrokeErrorColor)) {
/* 702 */               setBoxStrokeErrorColor(de3.m3032n(context2, ac1VarM8214e, R$styleable.TextInputLayout_boxStrokeErrorColor));
                    }
/* 712 */           if (typedArray.getResourceId(R$styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
/* 716 */               r6 = 0;
/* 721 */               setHintTextAppearance(typedArray.getResourceId(R$styleable.TextInputLayout_hintTextAppearance, 0));
                    } else {
/* 725 */               r6 = 0;
                    }
/* 728 */           int resourceId = typedArray.getResourceId(R$styleable.TextInputLayout_errorTextAppearance, r6);
/* 734 */           CharSequence text = typedArray.getText(R$styleable.TextInputLayout_errorContentDescription);
/* 740 */           boolean z = typedArray.getBoolean(R$styleable.TextInputLayout_errorEnabled, r6);
/* 746 */           checkableImageButton.setId(R$id.text_input_error_icon);
/* 753 */           if (de3.m3042x(context2)) {
/* 761 */               ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(r6);
                    }
/* 770 */           if (typedArray.hasValue(R$styleable.TextInputLayout_errorIconTint)) {
/* 778 */               this.f5031Z0 = de3.m3032n(context2, ac1VarM8214e, R$styleable.TextInputLayout_errorIconTint);
                    }
/* 786 */           if (typedArray.hasValue(R$styleable.TextInputLayout_errorIconTintMode)) {
/* 800 */               this.f5034a1 = kb1.m6039O(typedArray.getInt(R$styleable.TextInputLayout_errorIconTintMode, -1), null);
                    }
/* 808 */           if (typedArray.hasValue(R$styleable.TextInputLayout_errorIconDrawable)) {
/* 816 */               setErrorIconDrawable(ac1VarM8214e.m184n(R$styleable.TextInputLayout_errorIconDrawable));
                    }
/* 829 */           checkableImageButton.setContentDescription(getResources().getText(R$string.error_icon_content_description));
/* 832 */           WeakHashMap weakHashMap = e33.f7494a;
/* 835 */           checkableImageButton.setImportantForAccessibility(2);
/* 839 */           checkableImageButton.setClickable(false);
/* 842 */           checkableImageButton.setPressable(false);
/* 845 */           checkableImageButton.setFocusable(false);
/* 850 */           int resourceId2 = typedArray.getResourceId(R$styleable.TextInputLayout_helperTextTextAppearance, 0);
/* 856 */           boolean z2 = typedArray.getBoolean(R$styleable.TextInputLayout_helperTextEnabled, false);
/* 862 */           CharSequence text2 = typedArray.getText(R$styleable.TextInputLayout_helperText);
/* 873 */           int resourceId3 = typedArray.getResourceId(R$styleable.TextInputLayout_placeholderTextAppearance, 0);
/* 879 */           CharSequence text3 = typedArray.getText(R$styleable.TextInputLayout_placeholderText);
/* 890 */           int resourceId4 = typedArray.getResourceId(R$styleable.TextInputLayout_suffixTextAppearance, 0);
/* 896 */           CharSequence text4 = typedArray.getText(R$styleable.TextInputLayout_suffixText);
/* 907 */           boolean z3 = typedArray.getBoolean(R$styleable.TextInputLayout_counterEnabled, false);
/* 920 */           setCounterMaxLength(typedArray.getInt(R$styleable.TextInputLayout_counterMaxLength, -1));
/* 925 */           int i5 = 0;
/* 930 */           this.f5045e0 = typedArray.getResourceId(R$styleable.TextInputLayout_counterTextAppearance, 0);
/* 938 */           this.f5042d0 = typedArray.getResourceId(R$styleable.TextInputLayout_counterOverflowTextAppearance, 0);
/* 946 */           setBoxBackgroundMode(typedArray.getInt(R$styleable.TextInputLayout_boxBackgroundMode, 0));
/* 953 */           if (de3.m3042x(context2)) {
/* 961 */               ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginStart(0);
                    }
/* 966 */           int resourceId5 = typedArray.getResourceId(R$styleable.TextInputLayout_endIconDrawable, 0);
/* 978 */           sparseArray.append(-1, new v20(this, resourceId5, i5));
/* 990 */           sparseArray.append(0, new v20(this, 0, 1));
/* 1009 */          sparseArray.append(1, new or1(this, resourceId5 == 0 ? typedArray.getResourceId(R$styleable.TextInputLayout_passwordToggleDrawable, 0) : resourceId5));
/* 1018 */          sparseArray.append(2, new C2121qv(this, resourceId5));
/* 1027 */          sparseArray.append(3, new za0(this, resourceId5));
/* 1036 */          if (!typedArray.hasValue(R$styleable.TextInputLayout_passwordToggleEnabled)) {
/* 1044 */              if (typedArray.hasValue(R$styleable.TextInputLayout_endIconTint)) {
/* 1052 */                  this.f5020R0 = de3.m3032n(context2, ac1VarM8214e, R$styleable.TextInputLayout_endIconTint);
                        }
/* 1060 */              if (typedArray.hasValue(R$styleable.TextInputLayout_endIconTintMode)) {
/* 1074 */                  this.f5021S0 = kb1.m6039O(typedArray.getInt(R$styleable.TextInputLayout_endIconTintMode, -1), null);
                        }
                    }
/* 1082 */          if (typedArray.hasValue(R$styleable.TextInputLayout_endIconMode)) {
/* 1091 */              setEndIconMode(typedArray.getInt(R$styleable.TextInputLayout_endIconMode, 0));
/* 1100 */              if (typedArray.hasValue(R$styleable.TextInputLayout_endIconContentDescription)) {
/* 1108 */                  setEndIconContentDescription(typedArray.getText(R$styleable.TextInputLayout_endIconContentDescription));
                        }
/* 1118 */              setEndIconCheckable(typedArray.getBoolean(R$styleable.TextInputLayout_endIconCheckable, true));
                    } else if (typedArray.hasValue(R$styleable.TextInputLayout_passwordToggleEnabled)) {
/* 1136 */              if (typedArray.hasValue(R$styleable.TextInputLayout_passwordToggleTint)) {
/* 1144 */                  this.f5020R0 = de3.m3032n(context2, ac1VarM8214e, R$styleable.TextInputLayout_passwordToggleTint);
                        }
/* 1152 */              if (typedArray.hasValue(R$styleable.TextInputLayout_passwordToggleTintMode)) {
/* 1166 */                  this.f5021S0 = kb1.m6039O(typedArray.getInt(R$styleable.TextInputLayout_passwordToggleTintMode, -1), null);
                        }
/* 1175 */              setEndIconMode(typedArray.getBoolean(R$styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
/* 1184 */              setEndIconContentDescription(typedArray.getText(R$styleable.TextInputLayout_passwordToggleContentDescription));
                    }
/* 1189 */          appCompatTextView.setId(R$id.textinput_suffix_text);
/* 1200 */          appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
/* 1204 */          appCompatTextView.setAccessibilityLiveRegion(1);
/* 1207 */          setErrorContentDescription(text);
/* 1212 */          setCounterOverflowTextAppearance(this.f5042d0);
/* 1215 */          setHelperTextTextAppearance(resourceId2);
/* 1218 */          setErrorTextAppearance(resourceId);
/* 1223 */          setCounterTextAppearance(this.f5045e0);
/* 1226 */          setPlaceholderText(text3);
/* 1229 */          setPlaceholderTextAppearance(resourceId3);
/* 1232 */          setSuffixTextAppearance(resourceId4);
/* 1241 */          if (typedArray.hasValue(R$styleable.TextInputLayout_errorTextColor)) {
/* 1249 */              setErrorTextColor(ac1VarM8214e.m183m(R$styleable.TextInputLayout_errorTextColor));
                    }
/* 1258 */          if (typedArray.hasValue(R$styleable.TextInputLayout_helperTextTextColor)) {
/* 1266 */              setHelperTextColor(ac1VarM8214e.m183m(R$styleable.TextInputLayout_helperTextTextColor));
                    }
/* 1275 */          if (typedArray.hasValue(R$styleable.TextInputLayout_hintTextColor)) {
/* 1283 */              setHintTextColor(ac1VarM8214e.m183m(R$styleable.TextInputLayout_hintTextColor));
                    }
/* 1292 */          if (typedArray.hasValue(R$styleable.TextInputLayout_counterTextColor)) {
/* 1300 */              setCounterTextColor(ac1VarM8214e.m183m(R$styleable.TextInputLayout_counterTextColor));
                    }
/* 1309 */          if (typedArray.hasValue(R$styleable.TextInputLayout_counterOverflowTextColor)) {
/* 1317 */              setCounterOverflowTextColor(ac1VarM8214e.m183m(R$styleable.TextInputLayout_counterOverflowTextColor));
                    }
/* 1326 */          if (typedArray.hasValue(R$styleable.TextInputLayout_placeholderTextColor)) {
/* 1334 */              setPlaceholderTextColor(ac1VarM8214e.m183m(R$styleable.TextInputLayout_placeholderTextColor));
                    }
/* 1343 */          if (typedArray.hasValue(R$styleable.TextInputLayout_suffixTextColor)) {
/* 1351 */              setSuffixTextColor(ac1VarM8214e.m183m(R$styleable.TextInputLayout_suffixTextColor));
                    }
/* 1361 */          setEnabled(typedArray.getBoolean(R$styleable.TextInputLayout_android_enabled, true));
/* 1364 */          ac1VarM8214e.m168J();
/* 1368 */          setImportantForAccessibility(2);
/* 1371 */          int i6 = Build.VERSION.SDK_INT;
/* 1375 */          if (i6 >= 26 && i6 >= 26) {
/* 1379 */              v23.m9204m(this, 1);
                    }
/* 1386 */          frameLayout2.addView(checkableImageButton2);
/* 1391 */          linearLayout.addView(appCompatTextView);
/* 1396 */          linearLayout.addView(checkableImageButton);
/* 1399 */          linearLayout.addView(frameLayout2);
/* 1406 */          frameLayout.addView(kg2Var);
/* 1409 */          frameLayout.addView(linearLayout);
/* 1412 */          addView(frameLayout);
/* 1417 */          setHelperTextEnabled(z2);
/* 1422 */          setErrorEnabled(z);
/* 1427 */          setCounterEnabled(z3);
/* 1432 */          setHelperText(text2);
/* 1437 */          setSuffixText(text4);
                }

                private de0 getEndIconDelegate() {
/* 1 */             int i = this.f5016N0;
/* 3 */             SparseArray sparseArray = this.f5017O0;
/* 9 */             de0 de0Var = (de0) sparseArray.get(i);
                    return de0Var != null ? de0Var : (de0) sparseArray.get(0);
                }

                private CheckableImageButton getEndIconToUpdateDummyDrawable() {
/* 1 */             CheckableImageButton checkableImageButton = this.f5030Y0;
/* 7 */             if (checkableImageButton.getVisibility() == 0) {
/* 9 */                 return checkableImageButton;
                    }
/* 12 */            if (this.f5016N0 == 0 || !m2404g()) {
/* 23 */                return null;
                    }
/* 20 */            return this.f5018P0;
                }

                /* JADX INFO: renamed from: j */
                public static void m2396j(ViewGroup viewGroup, boolean z) {
/* 1 */             int childCount = viewGroup.getChildCount();
/* 6 */             for (int i = 0; i < childCount; i++) {
/* 8 */                 View childAt = viewGroup.getChildAt(i);
/* 12 */                childAt.setEnabled(z);
/* 17 */                if (childAt instanceof ViewGroup) {
/* 21 */                    m2396j((ViewGroup) childAt, z);
                        }
                    }
                }

                /* JADX INFO: renamed from: k */
                public static void m2397k(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 3 */             boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
/* 13 */            boolean z = onLongClickListener != null;
/* 14 */            boolean z2 = zHasOnClickListeners || z;
/* 19 */            checkableImageButton.setFocusable(z2);
/* 22 */            checkableImageButton.setClickable(zHasOnClickListeners);
/* 25 */            checkableImageButton.setPressable(zHasOnClickListeners);
/* 28 */            checkableImageButton.setLongClickable(z);
/* 35 */            checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
                }

                private void setEditText(EditText editText) {
/* 3 */             if (this.f5044e != null) {
/* 265 */               C1951n4.m6859j("We already have an EditText, can only have one");
/* 268 */               return;
                    }
/* 5 */             this.f5044e = editText;
/* 7 */             int i = this.f5054i;
/* 10 */            if (i != -1) {
/* 12 */                setMinEms(i);
                    } else {
/* 18 */                setMinWidth(this.f5081w);
                    }
/* 21 */            int i2 = this.f5079v;
/* 23 */            if (i2 != -1) {
/* 25 */                setMaxEms(i2);
                    } else {
/* 31 */                setMaxWidth(this.f5023U);
                    }
/* 34 */            m2405h();
/* 42 */            setTextInputAccessibilityDelegate(new in2(this));
/* 47 */            Typeface typeface = this.f5044e.getTypeface();
/* 51 */            C1979nw c1979nw = this.f5066n1;
/* 53 */            boolean zM7058n = c1979nw.m7058n(typeface);
/* 57 */            boolean zM7060p = c1979nw.m7060p(typeface);
/* 62 */            if (zM7058n || zM7060p) {
/* 66 */                c1979nw.m7054j(false);
                    }
/* 71 */            float textSize = this.f5044e.getTextSize();
/* 79 */            if (c1979nw.f14534m != textSize) {
/* 81 */                c1979nw.f14534m = textSize;
/* 83 */                c1979nw.m7054j(false);
                    }
/* 88 */            float letterSpacing = this.f5044e.getLetterSpacing();
/* 96 */            if (c1979nw.f14523g0 != letterSpacing) {
/* 98 */                c1979nw.f14523g0 = letterSpacing;
/* 100 */               c1979nw.m7054j(false);
                    }
/* 105 */           int gravity = this.f5044e.getGravity();
/* 113 */           c1979nw.m7057m((gravity & (-113)) | 48);
/* 118 */           if (c1979nw.f14530k != gravity) {
/* 120 */               c1979nw.f14530k = gravity;
/* 122 */               c1979nw.m7054j(false);
                    }
/* 133 */           this.f5044e.addTextChangedListener(new C1867kv(this, 2));
/* 138 */           if (this.f5037b1 == null) {
/* 146 */               this.f5037b1 = this.f5044e.getHintTextColors();
                    }
/* 151 */           if (this.f5071q0) {
/* 159 */               if (TextUtils.isEmpty(this.f5073r0)) {
/* 163 */                   CharSequence hint = this.f5044e.getHint();
/* 167 */                   this.f5047f = hint;
/* 169 */                   setHint(hint);
/* 175 */                   this.f5044e.setHint((CharSequence) null);
                        }
/* 178 */               this.f5075s0 = true;
                    }
/* 182 */           if (this.f5039c0 != null) {
/* 194 */               m2408m(this.f5044e.getText().length());
                    }
/* 197 */           m2411p();
/* 202 */           this.f5025V.m7574b();
/* 207 */           this.f5035b.bringToFront();
/* 212 */           this.f5038c.bringToFront();
/* 217 */           this.f5041d.bringToFront();
/* 222 */           this.f5030Y0.bringToFront();
/* 227 */           Iterator it = this.f5015M0.iterator();
/* 235 */           while (it.hasNext()) {
/* 243 */               ((C1941mv) it.next()).m6810a(this);
                    }
/* 247 */           m2418w();
/* 254 */           if (!isEnabled()) {
/* 256 */               editText.setEnabled(false);
                    }
/* 259 */           m2415t(false, true);
                }

                private void setHintInternal(CharSequence charSequence) {
/* 7 */             if (TextUtils.equals(charSequence, this.f5073r0)) {
/* 48 */                return;
                    }
/* 9 */             this.f5073r0 = charSequence;
/* 11 */            C1979nw c1979nw = this.f5066n1;
/* 13 */            if (charSequence == null || !TextUtils.equals(c1979nw.f14490G, charSequence)) {
/* 23 */                c1979nw.f14490G = charSequence;
/* 26 */                c1979nw.f14491H = null;
/* 28 */                Bitmap bitmap = c1979nw.f14494K;
/* 30 */                if (bitmap != null) {
/* 32 */                    bitmap.recycle();
/* 35 */                    c1979nw.f14494K = null;
                        }
/* 38 */                c1979nw.m7054j(false);
                    }
/* 43 */            if (this.f5064m1) {
/* 48 */                return;
                    }
/* 45 */            m2406i();
                }

                private void setPlaceholderTextEnabled(boolean z) {
/* 3 */             if (this.f5050g0 == z) {
/* 5 */                 return;
                    }
/* 6 */             AppCompatTextView appCompatTextView = this.f5052h0;
/* 8 */             if (!z) {
/* 24 */                if (appCompatTextView != null) {
/* 28 */                    appCompatTextView.setVisibility(8);
                        }
/* 32 */                this.f5052h0 = null;
                    } else if (appCompatTextView != null) {
/* 14 */                this.f5032a.addView(appCompatTextView);
/* 20 */                this.f5052h0.setVisibility(0);
                    }
/* 34 */            this.f5050g0 = z;
                }

                /* JADX INFO: renamed from: a */
                public final void m2398a(float f) {
/* 1 */             C1979nw c1979nw = this.f5066n1;
/* 7 */             if (c1979nw.f14514c == f) {
/* 9 */                 return;
                    }
/* 12 */            if (this.f5072q1 == null) {
/* 16 */                ValueAnimator valueAnimator = new ValueAnimator();
/* 19 */                this.f5072q1 = valueAnimator;
/* 23 */                valueAnimator.setInterpolator(AbstractC2246u8.f17411b);
/* 30 */                this.f5072q1.setDuration(167L);
/* 41 */                this.f5072q1.addUpdateListener(new C2184sk(this, 6));
                    }
/* 57 */            this.f5072q1.setFloatValues(c1979nw.f14514c, f);
/* 62 */            this.f5072q1.start();
                }

                @Override // android.view.ViewGroup
                public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 3 */             if (!(view instanceof EditText)) {
/* 35 */                super.addView(view, i, layoutParams);
/* 38 */                return;
                    }
/* 7 */             FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
/* 16 */            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
/* 18 */            FrameLayout frameLayout = this.f5032a;
/* 20 */            frameLayout.addView(view, layoutParams2);
/* 23 */            frameLayout.setLayoutParams(layoutParams);
/* 26 */            m2414s();
/* 31 */            setEditText((EditText) view);
                }

                /* JADX INFO: renamed from: b */
                public final void m2399b() {
                    int i;
                    int i2;
/* 1 */             fd1 fd1Var = this.f5077t0;
/* 3 */             if (fd1Var == null) {
/* 5 */                 return;
                    }
/* 8 */             tc2 tc2Var = fd1Var.f8151a.f7635a;
/* 10 */            tc2 tc2Var2 = this.f5082w0;
/* 14 */            if (tc2Var != tc2Var2) {
/* 16 */                fd1Var.setShapeAppearanceModel(tc2Var2);
/* 21 */                if (this.f5016N0 == 3 && this.f5085z0 == 2) {
/* 33 */                    za0 za0Var = (za0) this.f5017O0.get(3);
/* 37 */                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.f5044e;
/* 39 */                    za0Var.getClass();
/* 46 */                    if (!za0.m10294h(autoCompleteTextView) && za0Var.f7137a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
/* 65 */                        za0Var.m10295e(autoCompleteTextView);
                            }
                        }
                    }
/* 71 */            if (this.f5085z0 == 2 && (i = this.f5004B0) > -1 && (i2 = this.f5007E0) != 0) {
/* 81 */                fd1 fd1Var2 = this.f5077t0;
/* 86 */                fd1Var2.f8151a.f7644j = i;
/* 88 */                fd1Var2.invalidateSelf();
/* 95 */                fd1Var2.m3747s(ColorStateList.valueOf(i2));
                    }
/* 98 */            int iM1452d = this.f5008F0;
/* 103 */           if (this.f5085z0 == 1) {
/* 118 */               iM1452d = AbstractC0196bx.m1452d(this.f5008F0, xe2.m9780r(getContext(), R$attr.colorSurface, 0));
                    }
/* 122 */           this.f5008F0 = iM1452d;
/* 130 */           this.f5077t0.m3742n(ColorStateList.valueOf(iM1452d));
/* 135 */           if (this.f5016N0 == 3) {
/* 143 */               this.f5044e.getBackground().invalidateSelf();
                    }
/* 146 */           fd1 fd1Var3 = this.f5078u0;
/* 148 */           if (fd1Var3 != null && this.f5080v0 != null) {
/* 157 */               if (this.f5004B0 > -1 && this.f5007E0 != 0) {
/* 184 */                   fd1Var3.m3742n(this.f5044e.isFocused() ? ColorStateList.valueOf(this.f5043d1) : ColorStateList.valueOf(this.f5007E0));
/* 195 */                   this.f5080v0.m3742n(ColorStateList.valueOf(this.f5007E0));
                        }
/* 198 */               invalidate();
                    }
/* 201 */           invalidate();
                }

                /* JADX INFO: renamed from: c */
                public final int m2400c() {
                    float fM7050e;
/* 4 */             if (!this.f5071q0) {
/* 3 */                 return 0;
                    }
/* 7 */             int i = this.f5085z0;
/* 9 */             C1979nw c1979nw = this.f5066n1;
/* 11 */            if (i == 0) {
/* 26 */                fM7050e = c1979nw.m7050e();
                    } else {
/* 14 */                if (i != 2) {
/* 3 */                     return 0;
                        }
/* 23 */                fM7050e = c1979nw.m7050e() / 2.0f;
                    }
/* 24 */            return (int) fM7050e;
                }

                /* JADX INFO: renamed from: d */
                public final boolean m2401d() {
                    return this.f5071q0 && !TextUtils.isEmpty(this.f5073r0) && (this.f5077t0 instanceof s30);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
/* 1 */             EditText editText = this.f5044e;
/* 3 */             if (editText == null) {
/* 5 */                 super.dispatchProvideAutofillStructure(viewStructure, i);
/* 8 */                 return;
                    }
/* 12 */            if (this.f5047f != null) {
/* 14 */                boolean z = this.f5075s0;
/* 16 */                this.f5075s0 = false;
/* 18 */                CharSequence hint = editText.getHint();
/* 26 */                this.f5044e.setHint(this.f5047f);
                        try {
/* 29 */                    super.dispatchProvideAutofillStructure(viewStructure, i);
/* 39 */                    return;
                        } finally {
/* 43 */                    this.f5044e.setHint(hint);
/* 46 */                    this.f5075s0 = z;
                        }
                    }
/* 53 */            viewStructure.setAutofillId(getAutofillId());
/* 56 */            onProvideAutofillStructure(viewStructure, i);
/* 59 */            onProvideAutofillVirtualStructure(viewStructure, i);
/* 62 */            FrameLayout frameLayout = this.f5032a;
/* 68 */            viewStructure.setChildCount(frameLayout.getChildCount());
/* 75 */            for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
/* 77 */                View childAt = frameLayout.getChildAt(i2);
/* 81 */                ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
/* 85 */                childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
/* 90 */                if (childAt == this.f5044e) {
/* 96 */                    viewStructureNewChild.setHint(getHint());
                        }
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
/* 2 */             this.f5076s1 = true;
/* 4 */             super.dispatchRestoreInstanceState(sparseArray);
/* 8 */             this.f5076s1 = false;
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                    fd1 fd1Var;
/* 1 */             super.draw(canvas);
/* 4 */             boolean z = this.f5071q0;
/* 6 */             C1979nw c1979nw = this.f5066n1;
/* 8 */             if (z) {
/* 10 */                c1979nw.m7049d(canvas);
                    }
/* 15 */            if (this.f5080v0 == null || (fd1Var = this.f5078u0) == null) {
/* 71 */                return;
                    }
/* 21 */            fd1Var.draw(canvas);
/* 30 */            if (this.f5044e.isFocused()) {
/* 34 */                Rect bounds = this.f5080v0.getBounds();
/* 40 */                Rect bounds2 = this.f5078u0.getBounds();
/* 44 */                float f = c1979nw.f14514c;
/* 46 */                int iCenterX = bounds2.centerX();
/* 56 */                bounds.left = AbstractC2246u8.m8972c(iCenterX, f, bounds2.left);
/* 64 */                bounds.right = AbstractC2246u8.m8972c(iCenterX, f, bounds2.right);
/* 68 */                this.f5080v0.draw(canvas);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:16:0x002f  */
                @Override // android.view.ViewGroup, android.view.View
                public final void drawableStateChanged() {
                    boolean z;
                    ColorStateList colorStateList;
/* 3 */             if (this.f5074r1) {
/* 5 */                 return;
                    }
/* 7 */             this.f5074r1 = true;
/* 9 */             super.drawableStateChanged();
/* 12 */            int[] drawableState = getDrawableState();
/* 17 */            C1979nw c1979nw = this.f5066n1;
/* 19 */            if (c1979nw != null) {
/* 21 */                c1979nw.f14501R = drawableState;
/* 23 */                ColorStateList colorStateList2 = c1979nw.f14540p;
/* 25 */                if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c1979nw.f14538o) == null || !colorStateList.isStateful())) {
/* 48 */                    z = false;
                        } else {
/* 43 */                    c1979nw.m7054j(false);
/* 46 */                    z = true;
                        }
                    } else {
/* 48 */                z = false;
                    }
/* 51 */            if (this.f5044e != null) {
/* 53 */                WeakHashMap weakHashMap = e33.f7494a;
/* 69 */                m2415t(isLaidOut() && isEnabled(), false);
                    }
/* 72 */            m2411p();
/* 75 */            m2420y();
/* 78 */            if (z) {
/* 80 */                invalidate();
                    }
/* 83 */            this.f5074r1 = false;
                }

                /* JADX INFO: renamed from: e */
                public final int m2402e(int i, boolean z) {
/* 7 */             int compoundPaddingLeft = this.f5044e.getCompoundPaddingLeft() + i;
/* 12 */            if (getPrefixText() == null || z) {
/* 35 */                return compoundPaddingLeft;
                    }
/* 33 */            return getPrefixTextView().getPaddingLeft() + (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth());
                }

                /* JADX INFO: renamed from: f */
                public final int m2403f(int i, boolean z) {
/* 7 */             int compoundPaddingRight = i - this.f5044e.getCompoundPaddingRight();
                    return (getPrefixText() == null || !z) ? compoundPaddingRight : (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight()) + compoundPaddingRight;
                }

                /* JADX INFO: renamed from: g */
                public final boolean m2404g() {
                    return this.f5041d.getVisibility() == 0 && this.f5018P0.getVisibility() == 0;
                }

                @Override // android.widget.LinearLayout, android.view.View
                public int getBaseline() {
/* 1 */             EditText editText = this.f5044e;
/* 3 */             if (editText == null) {
/* 20 */                return super.getBaseline();
                    }
/* 18 */            return m2400c() + getPaddingTop() + editText.getBaseline();
                }

                public fd1 getBoxBackground() {
/* 1 */             int i = this.f5085z0;
/* 4 */             if (i == 1 || i == 2) {
/* 15 */                return this.f5077t0;
                    }
/* 10 */            f42.m3664t();
/* 13 */            return null;
                }

                public int getBoxBackgroundColor() {
/* 1 */             return this.f5008F0;
                }

                public int getBoxBackgroundMode() {
/* 1 */             return this.f5085z0;
                }

                public int getBoxCollapsedPaddingTop() {
/* 1 */             return this.f5003A0;
                }

                public float getBoxCornerRadiusBottomEnd() {
/* 1 */             boolean zM6036J = kb1.m6036J(this);
/* 5 */             tc2 tc2Var = this.f5082w0;
/* 7 */             RectF rectF = this.f5011I0;
                    return zM6036J ? tc2Var.f17039h.mo47a(rectF) : tc2Var.f17038g.mo47a(rectF);
                }

                public float getBoxCornerRadiusBottomStart() {
/* 1 */             boolean zM6036J = kb1.m6036J(this);
/* 5 */             tc2 tc2Var = this.f5082w0;
/* 7 */             RectF rectF = this.f5011I0;
                    return zM6036J ? tc2Var.f17038g.mo47a(rectF) : tc2Var.f17039h.mo47a(rectF);
                }

                public float getBoxCornerRadiusTopEnd() {
/* 1 */             boolean zM6036J = kb1.m6036J(this);
/* 5 */             tc2 tc2Var = this.f5082w0;
/* 7 */             RectF rectF = this.f5011I0;
                    return zM6036J ? tc2Var.f17036e.mo47a(rectF) : tc2Var.f17037f.mo47a(rectF);
                }

                public float getBoxCornerRadiusTopStart() {
/* 1 */             boolean zM6036J = kb1.m6036J(this);
/* 5 */             tc2 tc2Var = this.f5082w0;
/* 7 */             RectF rectF = this.f5011I0;
                    return zM6036J ? tc2Var.f17037f.mo47a(rectF) : tc2Var.f17036e.mo47a(rectF);
                }

                public int getBoxStrokeColor() {
/* 1 */             return this.f5049f1;
                }

                public ColorStateList getBoxStrokeErrorColor() {
/* 1 */             return this.f5051g1;
                }

                public int getBoxStrokeWidth() {
/* 1 */             return this.f5005C0;
                }

                public int getBoxStrokeWidthFocused() {
/* 1 */             return this.f5006D0;
                }

                public int getCounterMaxLength() {
/* 1 */             return this.f5033a0;
                }

                public CharSequence getCounterOverflowDescription() {
                    AppCompatTextView appCompatTextView;
/* 3 */             if (this.f5027W && this.f5036b0 && (appCompatTextView = this.f5039c0) != null) {
/* 13 */                return appCompatTextView.getContentDescription();
                    }
/* 18 */            return null;
                }

                public ColorStateList getCounterOverflowTextColor() {
/* 1 */             return this.f5063m0;
                }

                public ColorStateList getCounterTextColor() {
/* 1 */             return this.f5063m0;
                }

                public ColorStateList getDefaultHintTextColor() {
/* 1 */             return this.f5037b1;
                }

                public EditText getEditText() {
/* 1 */             return this.f5044e;
                }

                public CharSequence getEndIconContentDescription() {
/* 3 */             return this.f5018P0.getContentDescription();
                }

                public Drawable getEndIconDrawable() {
/* 3 */             return this.f5018P0.getDrawable();
                }

                public int getEndIconMode() {
/* 1 */             return this.f5016N0;
                }

                public CheckableImageButton getEndIconView() {
/* 1 */             return this.f5018P0;
                }

                public CharSequence getError() {
/* 1 */             px0 px0Var = this.f5025V;
/* 5 */             if (px0Var.f15311k) {
/* 7 */                 return px0Var.f15310j;
                    }
/* 10 */            return null;
                }

                public CharSequence getErrorContentDescription() {
/* 3 */             return this.f5025V.f15313m;
                }

                public int getErrorCurrentTextColors() {
/* 3 */             AppCompatTextView appCompatTextView = this.f5025V.f15312l;
/* 5 */             if (appCompatTextView != null) {
/* 7 */                 return appCompatTextView.getCurrentTextColor();
                    }
/* 12 */            return -1;
                }

                public Drawable getErrorIconDrawable() {
/* 3 */             return this.f5030Y0.getDrawable();
                }

                public final int getErrorTextCurrentColor() {
/* 3 */             AppCompatTextView appCompatTextView = this.f5025V.f15312l;
/* 5 */             if (appCompatTextView != null) {
/* 7 */                 return appCompatTextView.getCurrentTextColor();
                    }
/* 12 */            return -1;
                }

                public CharSequence getHelperText() {
/* 1 */             px0 px0Var = this.f5025V;
/* 5 */             if (px0Var.f15317q) {
/* 7 */                 return px0Var.f15316p;
                    }
/* 10 */            return null;
                }

                public int getHelperTextCurrentTextColor() {
/* 3 */             AppCompatTextView appCompatTextView = this.f5025V.f15318r;
/* 5 */             if (appCompatTextView != null) {
/* 7 */                 return appCompatTextView.getCurrentTextColor();
                    }
/* 12 */            return -1;
                }

                public CharSequence getHint() {
/* 3 */             if (this.f5071q0) {
/* 5 */                 return this.f5073r0;
                    }
/* 8 */             return null;
                }

                public final float getHintCollapsedTextHeight() {
/* 3 */             return this.f5066n1.m7050e();
                }

                public final int getHintCurrentCollapsedTextColor() {
/* 1 */             C1979nw c1979nw = this.f5066n1;
/* 5 */             return c1979nw.m7051f(c1979nw.f14540p);
                }

                public ColorStateList getHintTextColor() {
/* 1 */             return this.f5040c1;
                }

                public int getMaxEms() {
/* 1 */             return this.f5079v;
                }

                public int getMaxWidth() {
/* 1 */             return this.f5023U;
                }

                public int getMinEms() {
/* 1 */             return this.f5054i;
                }

                public int getMinWidth() {
/* 1 */             return this.f5081w;
                }

                @Deprecated
                public CharSequence getPasswordVisibilityToggleContentDescription() {
/* 3 */             return this.f5018P0.getContentDescription();
                }

                @Deprecated
                public Drawable getPasswordVisibilityToggleDrawable() {
/* 3 */             return this.f5018P0.getDrawable();
                }

                public CharSequence getPlaceholderText() {
/* 3 */             if (this.f5050g0) {
/* 5 */                 return this.f5048f0;
                    }
/* 8 */             return null;
                }

                public int getPlaceholderTextAppearance() {
/* 1 */             return this.f5057j0;
                }

                public ColorStateList getPlaceholderTextColor() {
/* 1 */             return this.f5055i0;
                }

                public CharSequence getPrefixText() {
/* 3 */             return this.f5035b.f12749c;
                }

                public ColorStateList getPrefixTextColor() {
/* 5 */             return this.f5035b.f12748b.getTextColors();
                }

                public TextView getPrefixTextView() {
/* 3 */             return this.f5035b.f12748b;
                }

                public CharSequence getStartIconContentDescription() {
/* 5 */             return this.f5035b.f12750d.getContentDescription();
                }

                public Drawable getStartIconDrawable() {
/* 5 */             return this.f5035b.f12750d.getDrawable();
                }

                public CharSequence getSuffixText() {
/* 1 */             return this.f5067o0;
                }

                public ColorStateList getSuffixTextColor() {
/* 3 */             return this.f5069p0.getTextColors();
                }

                public TextView getSuffixTextView() {
/* 1 */             return this.f5069p0;
                }

                public Typeface getTypeface() {
/* 1 */             return this.f5012J0;
                }

                /* JADX INFO: renamed from: h */
                public final void m2405h() {
/* 1 */             int i = this.f5085z0;
/* 5 */             if (i == 0) {
/* 87 */                this.f5077t0 = null;
/* 89 */                this.f5078u0 = null;
/* 91 */                this.f5080v0 = null;
                    } else if (i == 1) {
/* 70 */                this.f5077t0 = new fd1(this.f5082w0);
/* 77 */                this.f5078u0 = new fd1();
/* 84 */                this.f5080v0 = new fd1();
                    } else {
/* 10 */                if (i != 2) {
/* 59 */                    C1951n4.m6859j(fm0.m3786l(new StringBuilder(), this.f5085z0, " is illegal; only @BoxBackgroundMode constants are supported."));
/* 62 */                    return;
                        }
/* 14 */                if (!this.f5071q0 || (this.f5077t0 instanceof s30)) {
/* 39 */                    this.f5077t0 = new fd1(this.f5082w0);
                        } else {
/* 29 */                    this.f5077t0 = new s30(this.f5082w0);
                        }
/* 41 */                this.f5078u0 = null;
/* 43 */                this.f5080v0 = null;
                    }
/* 93 */            EditText editText = this.f5044e;
/* 95 */            if (editText != null && this.f5077t0 != null && editText.getBackground() == null && this.f5085z0 != 0) {
/* 111 */               EditText editText2 = this.f5044e;
/* 113 */               fd1 fd1Var = this.f5077t0;
/* 115 */               WeakHashMap weakHashMap = e33.f7494a;
/* 117 */               editText2.setBackground(fd1Var);
                    }
/* 120 */           m2420y();
/* 127 */           if (this.f5085z0 == 1) {
/* 145 */               if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
/* 157 */                   this.f5003A0 = getResources().getDimensionPixelSize(R$dimen.material_font_2_0_box_collapsed_padding_top);
                        } else if (de3.m3042x(getContext())) {
/* 180 */                   this.f5003A0 = getResources().getDimensionPixelSize(R$dimen.material_font_1_3_box_collapsed_padding_top);
                        }
                    }
/* 184 */           if (this.f5044e != null && this.f5085z0 == 1) {
/* 207 */               if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
/* 209 */                   EditText editText3 = this.f5044e;
/* 211 */                   WeakHashMap weakHashMap2 = e33.f7494a;
/* 243 */                   editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_2_0_padding_top), this.f5044e.getPaddingEnd(), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_2_0_padding_bottom));
                        } else if (de3.m3042x(getContext())) {
/* 257 */                   EditText editText4 = this.f5044e;
/* 259 */                   WeakHashMap weakHashMap3 = e33.f7494a;
/* 291 */                   editText4.setPaddingRelative(editText4.getPaddingStart(), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_1_3_padding_top), this.f5044e.getPaddingEnd(), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_1_3_padding_bottom));
                        }
                    }
/* 296 */           if (this.f5085z0 != 0) {
/* 298 */               m2414s();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:42:0x0081  */
                /* JADX INFO: renamed from: i */
                public final void m2406i() {
                    float f;
                    float f2;
                    float f3;
                    float f4;
                    int i;
                    float f5;
                    int i2;
/* 5 */             if (m2401d()) {
/* 10 */                int width = this.f5044e.getWidth();
/* 16 */                int gravity = this.f5044e.getGravity();
/* 20 */                C1979nw c1979nw = this.f5066n1;
/* 24 */                boolean zM7047b = c1979nw.m7047b(c1979nw.f14490G);
/* 28 */                c1979nw.f14492I = zM7047b;
/* 30 */                Rect rect = c1979nw.f14526i;
/* 41 */                if (gravity != 17 && (gravity & 7) != 1) {
/* 50 */                    if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
/* 70 */                        if (zM7047b) {
/* 72 */                            i2 = rect.left;
                                    f3 = i2;
                                } else {
/* 75 */                            f = rect.right;
/* 78 */                            f2 = c1979nw.f14529j0;
                                }
                            } else if (zM7047b) {
/* 59 */                        f = rect.right;
/* 62 */                        f2 = c1979nw.f14529j0;
                            } else {
/* 66 */                        i2 = rect.left;
                                f3 = i2;
                            }
/* 87 */                    RectF rectF = this.f5011I0;
/* 89 */                    rectF.left = f3;
/* 91 */                    float f6 = rect.top;
/* 94 */                    rectF.top = f6;
/* 96 */                    if (gravity != 17 || (gravity & 7) == 1) {
/* 135 */                       f4 = (width / 2.0f) + (c1979nw.f14529j0 / 2.0f);
                            } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
/* 122 */                       if (zM7047b) {
/* 124 */                           f5 = c1979nw.f14529j0;
/* 120 */                           f4 = f5 + f3;
                                } else {
/* 127 */                           i = rect.right;
                                    f4 = i;
                                }
                            } else if (zM7047b) {
/* 114 */                       i = rect.right;
                                f4 = i;
                            } else {
/* 118 */                       f5 = c1979nw.f14529j0;
/* 120 */                       f4 = f5 + f3;
                            }
/* 136 */                   rectF.right = f4;
/* 143 */                   rectF.bottom = c1979nw.m7050e() + f6;
/* 145 */                   float f7 = rectF.left;
/* 147 */                   float f8 = this.f5084y0;
/* 151 */                   rectF.left = f7 - f8;
/* 156 */                   rectF.right += f8;
/* 180 */                   rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f5004B0);
/* 185 */                   s30 s30Var = (s30) this.f5077t0;
/* 187 */                   s30Var.getClass();
/* 198 */                   s30Var.m8389w(rectF.left, rectF.top, rectF.right, rectF.bottom);
                        }
/* 82 */                f = width / 2.0f;
/* 85 */                f2 = c1979nw.f14529j0 / 2.0f;
/* 64 */                f3 = f - f2;
/* 87 */                RectF rectF2 = this.f5011I0;
/* 89 */                rectF2.left = f3;
/* 91 */                float f9 = rect.top;
/* 94 */                rectF2.top = f9;
/* 96 */                if (gravity != 17) {
/* 135 */                   f4 = (width / 2.0f) + (c1979nw.f14529j0 / 2.0f);
                        } else {
/* 135 */                   f4 = (width / 2.0f) + (c1979nw.f14529j0 / 2.0f);
                        }
/* 136 */               rectF2.right = f4;
/* 143 */               rectF2.bottom = c1979nw.m7050e() + f9;
/* 145 */               float f10 = rectF2.left;
/* 147 */               float f11 = this.f5084y0;
/* 151 */               rectF2.left = f10 - f11;
/* 156 */               rectF2.right += f11;
/* 180 */               rectF2.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF2.height() / 2.0f)) + this.f5004B0);
/* 185 */               s30 s30Var2 = (s30) this.f5077t0;
/* 187 */               s30Var2.getClass();
/* 198 */               s30Var2.m8389w(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m2407l(AppCompatTextView appCompatTextView, int i) {
                    try {
/* 1 */                 appCompatTextView.setTextAppearance(i);
/* 15 */                if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
/* 18 */                    return;
                        }
                    } catch (Exception unused) {
                    }
/* 21 */            appCompatTextView.setTextAppearance(R$style.TextAppearance_AppCompat_Caption);
/* 34 */            appCompatTextView.setTextColor(v00.getColor(getContext(), R$color.design_error));
                }

                /* JADX INFO: renamed from: m */
                public final void m2408m(int i) {
/* 1 */             boolean z = this.f5036b0;
/* 3 */             int i2 = this.f5033a0;
/* 8 */             if (i2 == -1) {
/* 16 */                this.f5039c0.setText(String.valueOf(i));
/* 21 */                this.f5039c0.setContentDescription(null);
/* 24 */                this.f5036b0 = false;
                    } else {
/* 34 */                this.f5036b0 = i > i2;
/* 36 */                Context context = getContext();
/* 69 */                this.f5039c0.setContentDescription(context.getString(this.f5036b0 ? R$string.character_counter_overflowed_content_description : R$string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.f5033a0)));
/* 74 */                if (z != this.f5036b0) {
/* 76 */                    m2409n();
                        }
/* 79 */                String str = C0021aj.f304b;
/* 94 */                C0021aj c0021aj = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0021aj.f307e : C0021aj.f306d;
/* 96 */                AppCompatTextView appCompatTextView = this.f5039c0;
/* 118 */               String string = getContext().getString(R$string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f5033a0));
/* 122 */               c0021aj.getClass();
/* 125 */               zr3 zr3Var = en2.f7808a;
/* 138 */               appCompatTextView.setText(string != null ? c0021aj.m293c(string).toString() : null);
                    }
/* 143 */           if (this.f5044e == null || z == this.f5036b0) {
/* 158 */               return;
                    }
/* 149 */           m2415t(false, false);
/* 152 */           m2420y();
/* 155 */           m2411p();
                }

                /* JADX INFO: renamed from: n */
                public final void m2409n() {
                    ColorStateList colorStateList;
                    ColorStateList colorStateList2;
/* 1 */             AppCompatTextView appCompatTextView = this.f5039c0;
/* 3 */             if (appCompatTextView != null) {
/* 14 */                m2407l(appCompatTextView, this.f5036b0 ? this.f5042d0 : this.f5045e0);
/* 19 */                if (!this.f5036b0 && (colorStateList2 = this.f5063m0) != null) {
/* 27 */                    this.f5039c0.setTextColor(colorStateList2);
                        }
/* 32 */                if (!this.f5036b0 || (colorStateList = this.f5065n0) == null) {
/* 43 */                    return;
                        }
/* 40 */                this.f5039c0.setTextColor(colorStateList);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:21:0x005f  */
                /* JADX WARN: Code duplicated, block: B:23:0x0063  */
                /* JADX WARN: Code duplicated, block: B:25:0x0078  */
                /* JADX INFO: renamed from: o */
                public final boolean m2410o() {
                    boolean z;
/* 4 */             if (this.f5044e == null) {
/* 3 */                 return false;
                    }
/* 14 */            boolean z2 = true;
/* 15 */            if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
/* 33 */                kg2 kg2Var = this.f5035b;
/* 39 */                if (kg2Var.getMeasuredWidth() > 0) {
/* 51 */                    int measuredWidth = kg2Var.getMeasuredWidth() - this.f5044e.getPaddingLeft();
/* 54 */                    if (this.f5013K0 == null || this.f5014L0 != measuredWidth) {
/* 62 */                        ColorDrawable colorDrawable = new ColorDrawable();
/* 65 */                        this.f5013K0 = colorDrawable;
/* 67 */                        this.f5014L0 = measuredWidth;
/* 69 */                        colorDrawable.setBounds(0, 0, measuredWidth, 1);
                            }
/* 74 */                    Drawable[] compoundDrawablesRelative = this.f5044e.getCompoundDrawablesRelative();
/* 78 */                    Drawable drawable = compoundDrawablesRelative[0];
/* 80 */                    ColorDrawable colorDrawable2 = this.f5013K0;
/* 82 */                    if (drawable != colorDrawable2) {
/* 92 */                        this.f5044e.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
/* 119 */                       z = true;
                            } else {
/* 121 */                       z = false;
                            }
                        } else if (this.f5013K0 != null) {
/* 102 */                   Drawable[] compoundDrawablesRelative2 = this.f5044e.getCompoundDrawablesRelative();
/* 114 */                   this.f5044e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
/* 117 */                   this.f5013K0 = null;
/* 119 */                   z = true;
                        } else {
/* 121 */                   z = false;
                        }
                    } else if (this.f5013K0 != null) {
/* 102 */               Drawable[] compoundDrawablesRelative3 = this.f5044e.getCompoundDrawablesRelative();
/* 114 */               this.f5044e.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
/* 117 */               this.f5013K0 = null;
/* 119 */               z = true;
                    } else {
/* 121 */               z = false;
                    }
/* 128 */           if ((this.f5030Y0.getVisibility() == 0 || ((this.f5016N0 != 0 && m2404g()) || this.f5067o0 != null)) && this.f5038c.getMeasuredWidth() > 0) {
/* 164 */               int measuredWidth2 = this.f5069p0.getMeasuredWidth() - this.f5044e.getPaddingRight();
/* 165 */               CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
/* 169 */               if (endIconToUpdateDummyDrawable != null) {
/* 186 */                   measuredWidth2 = ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart() + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
                        }
/* 189 */               Drawable[] compoundDrawablesRelative4 = this.f5044e.getCompoundDrawablesRelative();
/* 193 */               ColorDrawable colorDrawable3 = this.f5022T0;
/* 195 */               if (colorDrawable3 != null && this.f5024U0 != measuredWidth2) {
/* 201 */                   this.f5024U0 = measuredWidth2;
/* 203 */                   colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
/* 216 */                   this.f5044e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f5022T0, compoundDrawablesRelative4[3]);
/* 14 */                    return true;
                        }
/* 220 */               if (colorDrawable3 == null) {
/* 224 */                   ColorDrawable colorDrawable4 = new ColorDrawable();
/* 227 */                   this.f5022T0 = colorDrawable4;
/* 229 */                   this.f5024U0 = measuredWidth2;
/* 231 */                   colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                        }
/* 234 */               Drawable drawable2 = compoundDrawablesRelative4[2];
/* 236 */               ColorDrawable colorDrawable5 = this.f5022T0;
/* 238 */               if (drawable2 != colorDrawable5) {
/* 240 */                   this.f5026V0 = drawable2;
/* 250 */                   this.f5044e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
/* 14 */                    return true;
                        }
                    } else if (this.f5022T0 != null) {
/* 260 */               Drawable[] compoundDrawablesRelative5 = this.f5044e.getCompoundDrawablesRelative();
/* 268 */               if (compoundDrawablesRelative5[2] == this.f5022T0) {
/* 280 */                   this.f5044e.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f5026V0, compoundDrawablesRelative5[3]);
                        } else {
/* 284 */                   z2 = z;
                        }
/* 285 */               this.f5022T0 = null;
/* 287 */               return z2;
                    }
/* 288 */           return z;
                }

                @Override // android.view.View
                public final void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 6 */             this.f5066n1.m7052h(configuration);
                }

                @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             EditText editText = this.f5044e;
/* 6 */             if (editText != null) {
/* 8 */                 Rect rect = this.f5009G0;
/* 10 */                w70.m9478a(this, editText, rect);
/* 13 */                fd1 fd1Var = this.f5078u0;
/* 15 */                if (fd1Var != null) {
/* 17 */                    int i5 = rect.bottom;
/* 27 */                    fd1Var.setBounds(rect.left, i5 - this.f5005C0, rect.right, i5);
                        }
/* 30 */                fd1 fd1Var2 = this.f5080v0;
/* 32 */                if (fd1Var2 != null) {
/* 34 */                    int i6 = rect.bottom;
/* 44 */                    fd1Var2.setBounds(rect.left, i6 - this.f5006D0, rect.right, i6);
                        }
/* 49 */                if (this.f5071q0) {
/* 53 */                    float textSize = this.f5044e.getTextSize();
/* 57 */                    C1979nw c1979nw = this.f5066n1;
/* 64 */                    if (c1979nw.f14534m != textSize) {
/* 66 */                        c1979nw.f14534m = textSize;
/* 68 */                        c1979nw.m7054j(false);
                            }
/* 73 */                    int gravity = this.f5044e.getGravity();
/* 81 */                    c1979nw.m7057m((gravity & (-113)) | 48);
/* 86 */                    if (c1979nw.f14530k != gravity) {
/* 88 */                        c1979nw.f14530k = gravity;
/* 90 */                        c1979nw.m7054j(false);
                            }
/* 95 */                    if (this.f5044e == null) {
/* 390 */                       f42.m3664t();
/* 393 */                       return;
                            }
/* 97 */                    boolean zM6036J = kb1.m6036J(this);
/* 101 */                   int i7 = rect.bottom;
/* 103 */                   Rect rect2 = this.f5010H0;
/* 105 */                   rect2.bottom = i7;
/* 107 */                   int i8 = this.f5085z0;
/* 109 */                   int i9 = rect.left;
/* 112 */                   if (i8 == 1) {
/* 172 */                       rect2.left = m2402e(i9, zM6036J);
/* 179 */                       rect2.top = rect.top + this.f5003A0;
/* 187 */                       rect2.right = m2403f(rect.right, zM6036J);
                            } else if (i8 != 2) {
/* 121 */                       rect2.left = m2402e(i9, zM6036J);
/* 127 */                       rect2.top = getPaddingTop();
/* 135 */                       rect2.right = m2403f(rect.right, zM6036J);
                            } else {
/* 145 */                       rect2.left = this.f5044e.getPaddingLeft() + i9;
/* 154 */                       rect2.top = rect.top - m2400c();
/* 165 */                       rect2.right = rect.right - this.f5044e.getPaddingRight();
                            }
/* 189 */                   int i10 = rect2.left;
/* 191 */                   int i11 = rect2.top;
/* 193 */                   int i12 = rect2.right;
/* 195 */                   int i13 = rect2.bottom;
/* 197 */                   Rect rect3 = c1979nw.f14526i;
/* 201 */                   if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
/* 216 */                       rect3.set(i10, i11, i12, i13);
/* 219 */                       c1979nw.f14502S = true;
/* 221 */                       c1979nw.m7053i();
                            }
/* 226 */                   if (this.f5044e == null) {
/* 386 */                       f42.m3664t();
/* 389 */                       return;
                            }
/* 228 */                   TextPaint textPaint = c1979nw.f14504U;
/* 232 */                   textPaint.setTextSize(c1979nw.f14534m);
/* 237 */                   textPaint.setTypeface(c1979nw.f14484A);
/* 242 */                   textPaint.setLetterSpacing(c1979nw.f14523g0);
/* 249 */                   float f = -textPaint.ascent();
/* 259 */                   rect2.left = this.f5044e.getCompoundPaddingLeft() + rect.left;
/* 294 */                   rect2.top = (this.f5085z0 != 1 || this.f5044e.getMinLines() > 1) ? rect.top + this.f5044e.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
/* 305 */                   rect2.right = rect.right - this.f5044e.getCompoundPaddingRight();
/* 333 */                   int compoundPaddingBottom = (this.f5085z0 != 1 || this.f5044e.getMinLines() > 1) ? rect.bottom - this.f5044e.getCompoundPaddingBottom() : (int) (rect2.top + f);
/* 334 */                   rect2.bottom = compoundPaddingBottom;
/* 336 */                   int i14 = rect2.left;
/* 338 */                   int i15 = rect2.top;
/* 340 */                   int i16 = rect2.right;
/* 342 */                   Rect rect4 = c1979nw.f14524h;
/* 346 */                   if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
/* 361 */                       rect4.set(i14, i15, i16, compoundPaddingBottom);
/* 364 */                       c1979nw.f14502S = true;
/* 366 */                       c1979nw.m7053i();
                            }
/* 369 */                   c1979nw.m7054j(false);
/* 376 */                   if (!m2401d() || this.f5064m1) {
/* 393 */                       return;
                            }
/* 382 */                   m2406i();
                        }
                    }
                }

                @Override // android.widget.LinearLayout, android.view.View
                public final void onMeasure(int i, int i2) {
                    EditText editText;
                    int iMax;
/* 1 */             super.onMeasure(i, i2);
/* 6 */             int i3 = 1;
/* 7 */             boolean z = false;
/* 8 */             if (this.f5044e != null && this.f5044e.getMeasuredHeight() < (iMax = Math.max(this.f5038c.getMeasuredHeight(), this.f5035b.getMeasuredHeight()))) {
/* 37 */                this.f5044e.setMinimumHeight(iMax);
/* 40 */                z = true;
                    }
/* 41 */            boolean zM2410o = m2410o();
/* 45 */            if (z || zM2410o) {
/* 56 */                this.f5044e.post(new hn2(this, i3));
                    }
/* 61 */            if (this.f5052h0 != null && (editText = this.f5044e) != null) {
/* 73 */                this.f5052h0.setGravity(editText.getGravity());
/* 102 */               this.f5052h0.setPadding(this.f5044e.getCompoundPaddingLeft(), this.f5044e.getCompoundPaddingTop(), this.f5044e.getCompoundPaddingRight(), this.f5044e.getCompoundPaddingBottom());
                    }
/* 105 */           m2418w();
                }

                @Override // android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 13 */            super.onRestoreInstanceState(savedState.f1292a);
/* 18 */            setError(savedState.f5086c);
/* 23 */            if (savedState.f5087d) {
/* 33 */                this.f5018P0.post(new hn2(this, 0));
                    }
/* 38 */            setHint(savedState.f5088e);
/* 43 */            setHelperText(savedState.f5089f);
/* 48 */            setPlaceholderText(savedState.f5090i);
/* 51 */            requestLayout();
                }

                @Override // android.widget.LinearLayout, android.view.View
                public final void onRtlPropertiesChanged(int i) {
/* 1 */             super.onRtlPropertiesChanged(i);
/* 4 */             boolean z = false;
/* 10 */            boolean z2 = i == 1;
/* 11 */            boolean z3 = this.f5083x0;
/* 13 */            if (z2 != z3) {
/* 15 */                if (z2 && !z3) {
/* 19 */                    z = true;
                        }
/* 22 */                m10 m10Var = this.f5082w0.f17036e;
/* 24 */                RectF rectF = this.f5011I0;
/* 26 */                float fMo47a = m10Var.mo47a(rectF);
/* 34 */                float fMo47a2 = this.f5082w0.f17037f.mo47a(rectF);
/* 42 */                float fMo47a3 = this.f5082w0.f17039h.mo47a(rectF);
/* 50 */                float fMo47a4 = this.f5082w0.f17038g.mo47a(rectF);
/* 58 */                float f = z ? fMo47a : fMo47a2;
/* 59 */                if (z) {
/* 61 */                    fMo47a = fMo47a2;
                        }
/* 66 */                float f2 = z ? fMo47a3 : fMo47a4;
/* 67 */                if (z) {
/* 69 */                    fMo47a3 = fMo47a4;
                        }
/* 70 */                boolean zM6036J = kb1.m6036J(this);
/* 74 */                this.f5083x0 = zM6036J;
/* 80 */                float f3 = zM6036J ? fMo47a : f;
/* 81 */                if (!zM6036J) {
/* 84 */                    f = fMo47a;
                        }
/* 89 */                float f4 = zM6036J ? fMo47a3 : f2;
/* 90 */                if (!zM6036J) {
/* 93 */                    f2 = fMo47a3;
                        }
/* 94 */                fd1 fd1Var = this.f5077t0;
/* 96 */                if (fd1Var != null && fd1Var.m3737i() == f3) {
/* 106 */                   fd1 fd1Var2 = this.f5077t0;
/* 124 */                   if (fd1Var2.f8151a.f7635a.f17037f.mo47a(fd1Var2.m3735g()) == f) {
/* 126 */                       fd1 fd1Var3 = this.f5077t0;
/* 144 */                       if (fd1Var3.f8151a.f7635a.f17039h.mo47a(fd1Var3.m3735g()) == f4) {
/* 146 */                           fd1 fd1Var4 = this.f5077t0;
/* 164 */                           if (fd1Var4.f8151a.f7635a.f17038g.mo47a(fd1Var4.m3735g()) == f2) {
/* 209 */                               return;
                                    }
                                }
                            }
                        }
/* 168 */               sc2 sc2VarM8779f = this.f5082w0.m8779f();
/* 177 */               sc2VarM8779f.f16527e = new C0862e(f3);
/* 184 */               sc2VarM8779f.f16528f = new C0862e(f);
/* 191 */               sc2VarM8779f.f16530h = new C0862e(f4);
/* 198 */               sc2VarM8779f.f16529g = new C0862e(f2);
/* 204 */               this.f5082w0 = sc2VarM8779f.m8478a();
/* 206 */               m2399b();
                    }
                }

                @Override // android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 16 */            if (this.f5025V.m7577e()) {
/* 22 */                savedState.f5086c = getError();
                    }
/* 37 */            savedState.f5087d = this.f5016N0 != 0 && this.f5018P0.f4781d;
/* 43 */            savedState.f5088e = getHint();
/* 49 */            savedState.f5089f = getHelperText();
/* 55 */            savedState.f5090i = getPlaceholderText();
/* 57 */            return savedState;
                }

                /* JADX INFO: renamed from: p */
                public final void m2411p() {
                    Drawable background;
                    AppCompatTextView appCompatTextView;
/* 1 */             EditText editText = this.f5044e;
/* 3 */             if (editText == null || this.f5085z0 != 0 || (background = editText.getBackground()) == null) {
/* 81 */                return;
                    }
/* 17 */            int[] iArr = w90.f18483a;
/* 19 */            Drawable drawableMutate = background.mutate();
/* 23 */            px0 px0Var = this.f5025V;
/* 29 */            if (px0Var.m7577e()) {
/* 31 */                AppCompatTextView appCompatTextView2 = px0Var.f15312l;
/* 47 */                drawableMutate.setColorFilter(C2491ya.m10133c(appCompatTextView2 != null ? appCompatTextView2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
                    } else if (this.f5036b0 && (appCompatTextView = this.f5039c0) != null) {
/* 69 */                drawableMutate.setColorFilter(C2491ya.m10133c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
                    } else {
/* 73 */                drawableMutate.clearColorFilter();
/* 78 */                this.f5044e.refreshDrawableState();
                    }
                }

                /* JADX INFO: renamed from: q */
                public final void m2412q() {
/* 3 */             int visibility = this.f5018P0.getVisibility();
/* 7 */             CheckableImageButton checkableImageButton = this.f5030Y0;
/* 26 */            this.f5041d.setVisibility((visibility != 0 || checkableImageButton.getVisibility() == 0) ? 8 : 0);
/* 64 */            this.f5038c.setVisibility(m2404g() || checkableImageButton.getVisibility() == 0 || ((this.f5067o0 == null || this.f5064m1) ? '\b' : (char) 0) == 0 ? 0 : 8);
                }

                /* JADX WARN: Code duplicated, block: B:9:0x0015  */
                /* JADX INFO: renamed from: r */
                public final void m2413r() {
                    boolean z;
/* 6 */             if (getErrorIconDrawable() != null) {
/* 8 */                 px0 px0Var = this.f5025V;
/* 12 */                if (px0Var.f15311k && px0Var.m7577e()) {
/* 20 */                    z = true;
                        } else {
/* 22 */                    z = false;
                        }
                    } else {
/* 22 */                z = false;
                    }
/* 30 */            this.f5030Y0.setVisibility(z ? 0 : 8);
/* 33 */            m2412q();
/* 36 */            m2418w();
/* 41 */            if (this.f5016N0 != 0) {
/* 43 */                return;
                    }
/* 44 */            m2410o();
                }

                /* JADX INFO: renamed from: s */
                public final void m2414s() {
/* 4 */             if (this.f5085z0 != 1) {
/* 6 */                 FrameLayout frameLayout = this.f5032a;
/* 12 */                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
/* 14 */                int iM2400c = m2400c();
/* 20 */                if (iM2400c != layoutParams.topMargin) {
/* 22 */                    layoutParams.topMargin = iM2400c;
/* 24 */                    frameLayout.requestLayout();
                        }
                    }
                }

                public void setBoxBackgroundColor(int i) {
/* 3 */             if (this.f5008F0 != i) {
/* 5 */                 this.f5008F0 = i;
/* 7 */                 this.f5053h1 = i;
/* 9 */                 this.f5058j1 = i;
/* 11 */                this.f5060k1 = i;
/* 13 */                m2399b();
                    }
                }

                public void setBoxBackgroundColorResource(int i) {
/* 9 */             setBoxBackgroundColor(v00.getColor(getContext(), i));
                }

                public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
/* 1 */             int defaultColor = colorStateList.getDefaultColor();
/* 5 */             this.f5053h1 = defaultColor;
/* 7 */             this.f5008F0 = defaultColor;
/* 21 */            this.f5056i1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
/* 37 */            this.f5058j1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
/* 50 */            this.f5060k1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
/* 52 */            m2399b();
                }

                public void setBoxBackgroundMode(int i) {
/* 3 */             if (i == this.f5085z0) {
/* 15 */                return;
                    }
/* 6 */             this.f5085z0 = i;
/* 10 */            if (this.f5044e != null) {
/* 12 */                m2405h();
                    }
                }

                public void setBoxCollapsedPaddingTop(int i) {
/* 1 */             this.f5003A0 = i;
                }

                public void setBoxStrokeColor(int i) {
/* 3 */             if (this.f5049f1 != i) {
/* 5 */                 this.f5049f1 = i;
/* 7 */                 m2420y();
                    }
                }

                public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
/* 5 */             if (colorStateList.isStateful()) {
/* 11 */                this.f5043d1 = colorStateList.getDefaultColor();
/* 25 */                this.f5062l1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
/* 41 */                this.f5046e1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
/* 54 */                this.f5049f1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                    } else if (this.f5049f1 != colorStateList.getDefaultColor()) {
/* 69 */                this.f5049f1 = colorStateList.getDefaultColor();
                    }
/* 71 */            m2420y();
                }

                public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
/* 3 */             if (this.f5051g1 != colorStateList) {
/* 5 */                 this.f5051g1 = colorStateList;
/* 7 */                 m2420y();
                    }
                }

                public void setBoxStrokeWidth(int i) {
/* 1 */             this.f5005C0 = i;
/* 3 */             m2420y();
                }

                public void setBoxStrokeWidthFocused(int i) {
/* 1 */             this.f5006D0 = i;
/* 3 */             m2420y();
                }

                public void setBoxStrokeWidthFocusedResource(int i) {
/* 9 */             setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
                }

                public void setBoxStrokeWidthResource(int i) {
/* 9 */             setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
                }

                public void setCounterEnabled(boolean z) {
/* 3 */             if (this.f5027W != z) {
/* 6 */                 px0 px0Var = this.f5025V;
/* 9 */                 if (z) {
/* 17 */                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
/* 20 */                    this.f5039c0 = appCompatTextView;
/* 24 */                    appCompatTextView.setId(R$id.textinput_counter);
/* 27 */                    Typeface typeface = this.f5012J0;
/* 29 */                    if (typeface != null) {
/* 33 */                        this.f5039c0.setTypeface(typeface);
                            }
/* 39 */                    this.f5039c0.setMaxLines(1);
/* 44 */                    px0Var.m7573a(this.f5039c0, 2);
/* 65 */                    ((ViewGroup.MarginLayoutParams) this.f5039c0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R$dimen.mtrl_textinput_counter_margin_start));
/* 68 */                    m2409n();
/* 73 */                    if (this.f5039c0 != null) {
/* 75 */                        EditText editText = this.f5044e;
/* 89 */                        m2408m(editText == null ? 0 : editText.getText().length());
                            }
                        } else {
/* 95 */                    px0Var.m7580h(this.f5039c0, 2);
/* 98 */                    this.f5039c0 = null;
                        }
/* 100 */               this.f5027W = z;
                    }
                }

                public void setCounterMaxLength(int i) {
/* 3 */             if (this.f5033a0 != i) {
/* 5 */                 if (i > 0) {
/* 7 */                     this.f5033a0 = i;
                        } else {
/* 11 */                    this.f5033a0 = -1;
                        }
/* 15 */                if (!this.f5027W || this.f5039c0 == null) {
/* 38 */                    return;
                        }
/* 21 */                EditText editText = this.f5044e;
/* 35 */                m2408m(editText == null ? 0 : editText.getText().length());
                    }
                }

                public void setCounterOverflowTextAppearance(int i) {
/* 3 */             if (this.f5042d0 != i) {
/* 5 */                 this.f5042d0 = i;
/* 7 */                 m2409n();
                    }
                }

                public void setCounterOverflowTextColor(ColorStateList colorStateList) {
/* 3 */             if (this.f5065n0 != colorStateList) {
/* 5 */                 this.f5065n0 = colorStateList;
/* 7 */                 m2409n();
                    }
                }

                public void setCounterTextAppearance(int i) {
/* 3 */             if (this.f5045e0 != i) {
/* 5 */                 this.f5045e0 = i;
/* 7 */                 m2409n();
                    }
                }

                public void setCounterTextColor(ColorStateList colorStateList) {
/* 3 */             if (this.f5063m0 != colorStateList) {
/* 5 */                 this.f5063m0 = colorStateList;
/* 7 */                 m2409n();
                    }
                }

                public void setDefaultHintTextColor(ColorStateList colorStateList) {
/* 1 */             this.f5037b1 = colorStateList;
/* 3 */             this.f5040c1 = colorStateList;
/* 7 */             if (this.f5044e != null) {
/* 10 */                m2415t(false, false);
                    }
                }

                @Override // android.view.View
                public void setEnabled(boolean z) {
/* 1 */             m2396j(this, z);
/* 4 */             super.setEnabled(z);
                }

                public void setEndIconActivated(boolean z) {
/* 3 */             this.f5018P0.setActivated(z);
                }

                public void setEndIconCheckable(boolean z) {
/* 3 */             this.f5018P0.setCheckable(z);
                }

                public void setEndIconContentDescription(int i) {
/* 13 */            setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
                }

                public void setEndIconDrawable(Drawable drawable) {
/* 1 */             CheckableImageButton checkableImageButton = this.f5018P0;
/* 3 */             checkableImageButton.setImageDrawable(drawable);
/* 6 */             if (drawable != null) {
/* 12 */                w11.m9419b(this, checkableImageButton, this.f5020R0, this.f5021S0);
/* 17 */                w11.m9394D(this, checkableImageButton, this.f5020R0);
                    }
                }

                public void setEndIconMode(int i) {
/* 1 */             int i2 = this.f5016N0;
/* 3 */             if (i2 == i) {
/* 5 */                 return;
                    }
/* 6 */             this.f5016N0 = i;
/* 10 */            Iterator it = this.f5019Q0.iterator();
                    while (true) {
/* 19 */                boolean z = false;
/* 20 */                if (!it.hasNext()) {
/* 173 */                   setEndIconVisible(i != 0);
/* 186 */                   if (getEndIconDelegate().mo3011b(this.f5085z0)) {
/* 192 */                       getEndIconDelegate().mo3010a();
/* 201 */                       w11.m9419b(this, this.f5018P0, this.f5020R0, this.f5021S0);
/* 204 */                       return;
                            }
/* 234 */                   throw new IllegalStateException("The current box background mode " + this.f5085z0 + " is not supported by the end icon mode " + i);
                        }
/* 26 */                C1978nv c1978nv = (C1978nv) it.next();
                        switch (c1978nv.f14462a) {
                            case 0:
/* 125 */                       C2121qv c2121qv = (C2121qv) c1978nv.f14463b;
/* 127 */                       CheckableImageButton checkableImageButton = c2121qv.f7139c;
/* 129 */                       ViewOnFocusChangeListenerC1904lv viewOnFocusChangeListenerC1904lv = c2121qv.f15765f;
/* 131 */                       EditText editText = getEditText();
/* 135 */                       if (editText != null && i2 == 2) {
/* 146 */                           editText.post(new cp0(c1978nv, editText, 5, z));
/* 153 */                           if (editText.getOnFocusChangeListener() == viewOnFocusChangeListenerC1904lv) {
/* 155 */                               editText.setOnFocusChangeListener(null);
                                    }
/* 162 */                           if (checkableImageButton.getOnFocusChangeListener() == viewOnFocusChangeListenerC1904lv) {
/* 164 */                               checkableImageButton.setOnFocusChangeListener(null);
                                    }
                                }
                                break;
                            case 1:
/* 62 */                        za0 za0Var = (za0) c1978nv.f14463b;
/* 68 */                        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) getEditText();
/* 71 */                        if (autoCompleteTextView != null && i2 == 3) {
/* 81 */                            autoCompleteTextView.post(new cp0(c1978nv, autoCompleteTextView, 6, z));
/* 90 */                            if (autoCompleteTextView.getOnFocusChangeListener() == za0Var.f20020f) {
/* 92 */                                autoCompleteTextView.setOnFocusChangeListener(null);
                                    }
/* 95 */                            autoCompleteTextView.setOnTouchListener(null);
/* 98 */                            autoCompleteTextView.setOnDismissListener(null);
                                }
/* 101 */                       if (i2 == 3) {
/* 105 */                           removeOnAttachStateChangeListener(za0Var.f20024j);
/* 108 */                           AccessibilityManager accessibilityManager = za0Var.f20031q;
/* 110 */                           if (accessibilityManager != null) {
/* 119 */                               accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2238u0(za0Var.f20025k));
                                    }
                                }
                                break;
                            default:
/* 34 */                        EditText editText2 = getEditText();
/* 38 */                        if (editText2 != null && i2 == 1) {
/* 46 */                            editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
/* 56 */                            editText2.post(new dp0(c1978nv, editText2, 18, z));
                                }
                                break;
                        }
                    }
                }

                public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
/* 1 */             View.OnLongClickListener onLongClickListener = this.f5028W0;
/* 3 */             CheckableImageButton checkableImageButton = this.f5018P0;
/* 5 */             checkableImageButton.setOnClickListener(onClickListener);
/* 8 */             m2397k(checkableImageButton, onLongClickListener);
                }

                public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
/* 1 */             this.f5028W0 = onLongClickListener;
/* 3 */             CheckableImageButton checkableImageButton = this.f5018P0;
/* 5 */             checkableImageButton.setOnLongClickListener(onLongClickListener);
/* 8 */             m2397k(checkableImageButton, onLongClickListener);
                }

                public void setEndIconTintList(ColorStateList colorStateList) {
/* 3 */             if (this.f5020R0 != colorStateList) {
/* 5 */                 this.f5020R0 = colorStateList;
/* 11 */                w11.m9419b(this, this.f5018P0, colorStateList, this.f5021S0);
                    }
                }

                public void setEndIconTintMode(PorterDuff.Mode mode) {
/* 3 */             if (this.f5021S0 != mode) {
/* 5 */                 this.f5021S0 = mode;
/* 11 */                w11.m9419b(this, this.f5018P0, this.f5020R0, mode);
                    }
                }

                public void setEndIconVisible(boolean z) {
/* 5 */             if (m2404g() != z) {
/* 15 */                this.f5018P0.setVisibility(z ? 0 : 8);
/* 18 */                m2412q();
/* 21 */                m2418w();
/* 24 */                m2410o();
                    }
                }

                public void setError(CharSequence charSequence) {
/* 1 */             px0 px0Var = this.f5025V;
/* 6 */             if (!px0Var.f15311k) {
/* 12 */                if (TextUtils.isEmpty(charSequence)) {
/* 14 */                    return;
                        } else {
/* 15 */                    setErrorEnabled(true);
                        }
                    }
/* 22 */            if (TextUtils.isEmpty(charSequence)) {
/* 52 */                px0Var.m7579g();
/* 55 */                return;
                    }
/* 24 */            px0Var.m7575c();
/* 27 */            px0Var.f15310j = charSequence;
/* 31 */            px0Var.f15312l.setText(charSequence);
/* 34 */            int i = px0Var.f15308h;
/* 36 */            if (i != 1) {
/* 38 */                px0Var.f15309i = 1;
                    }
/* 48 */            px0Var.m7582j(i, px0Var.f15309i, px0Var.m7581i(px0Var.f15312l, charSequence));
                }

                public void setErrorContentDescription(CharSequence charSequence) {
/* 1 */             px0 px0Var = this.f5025V;
/* 3 */             px0Var.f15313m = charSequence;
/* 5 */             AppCompatTextView appCompatTextView = px0Var.f15312l;
/* 7 */             if (appCompatTextView != null) {
/* 9 */                 appCompatTextView.setContentDescription(charSequence);
                    }
                }

                public void setErrorEnabled(boolean z) {
/* 1 */             px0 px0Var = this.f5025V;
/* 3 */             TextInputLayout textInputLayout = px0Var.f15302b;
/* 7 */             if (px0Var.f15311k == z) {
/* 9 */                 return;
                    }
/* 10 */            px0Var.m7575c();
/* 15 */            if (z) {
/* 21 */                AppCompatTextView appCompatTextView = new AppCompatTextView(px0Var.f15301a, null);
/* 24 */                px0Var.f15312l = appCompatTextView;
/* 28 */                appCompatTextView.setId(R$id.textinput_error);
/* 34 */                px0Var.f15312l.setTextAlignment(5);
/* 37 */                Typeface typeface = px0Var.f15321u;
/* 39 */                if (typeface != null) {
/* 43 */                    px0Var.f15312l.setTypeface(typeface);
                        }
/* 46 */                int i = px0Var.f15314n;
/* 48 */                px0Var.f15314n = i;
/* 50 */                AppCompatTextView appCompatTextView2 = px0Var.f15312l;
/* 52 */                if (appCompatTextView2 != null) {
/* 56 */                    px0Var.f15302b.m2407l(appCompatTextView2, i);
                        }
/* 59 */                ColorStateList colorStateList = px0Var.f15315o;
/* 61 */                px0Var.f15315o = colorStateList;
/* 63 */                AppCompatTextView appCompatTextView3 = px0Var.f15312l;
/* 65 */                if (appCompatTextView3 != null && colorStateList != null) {
/* 69 */                    appCompatTextView3.setTextColor(colorStateList);
                        }
/* 72 */                CharSequence charSequence = px0Var.f15313m;
/* 74 */                px0Var.f15313m = charSequence;
/* 76 */                AppCompatTextView appCompatTextView4 = px0Var.f15312l;
/* 78 */                if (appCompatTextView4 != null) {
/* 80 */                    appCompatTextView4.setContentDescription(charSequence);
                        }
/* 86 */                px0Var.f15312l.setVisibility(4);
/* 89 */                AppCompatTextView appCompatTextView5 = px0Var.f15312l;
/* 91 */                WeakHashMap weakHashMap = e33.f7494a;
/* 94 */                appCompatTextView5.setAccessibilityLiveRegion(1);
/* 99 */                px0Var.m7573a(px0Var.f15312l, 0);
                    } else {
/* 103 */               px0Var.m7579g();
/* 108 */               px0Var.m7580h(px0Var.f15312l, 0);
/* 111 */               px0Var.f15312l = null;
/* 113 */               textInputLayout.m2411p();
/* 116 */               textInputLayout.m2420y();
                    }
/* 119 */           px0Var.f15311k = z;
                }

                public void setErrorIconDrawable(int i) {
/* 13 */            setErrorIconDrawable(i != 0 ? mn0.m6700p(getContext(), i) : null);
/* 20 */            w11.m9394D(this, this.f5030Y0, this.f5031Z0);
                }

                public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
/* 1 */             View.OnLongClickListener onLongClickListener = this.f5029X0;
/* 3 */             CheckableImageButton checkableImageButton = this.f5030Y0;
/* 5 */             checkableImageButton.setOnClickListener(onClickListener);
/* 8 */             m2397k(checkableImageButton, onLongClickListener);
                }

                public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
/* 1 */             this.f5029X0 = onLongClickListener;
/* 3 */             CheckableImageButton checkableImageButton = this.f5030Y0;
/* 5 */             checkableImageButton.setOnLongClickListener(onLongClickListener);
/* 8 */             m2397k(checkableImageButton, onLongClickListener);
                }

                public void setErrorIconTintList(ColorStateList colorStateList) {
/* 3 */             if (this.f5031Z0 != colorStateList) {
/* 5 */                 this.f5031Z0 = colorStateList;
/* 11 */                w11.m9419b(this, this.f5030Y0, colorStateList, this.f5034a1);
                    }
                }

                public void setErrorIconTintMode(PorterDuff.Mode mode) {
/* 3 */             if (this.f5034a1 != mode) {
/* 5 */                 this.f5034a1 = mode;
/* 11 */                w11.m9419b(this, this.f5030Y0, this.f5031Z0, mode);
                    }
                }

                public void setErrorTextAppearance(int i) {
/* 1 */             px0 px0Var = this.f5025V;
/* 3 */             px0Var.f15314n = i;
/* 5 */             AppCompatTextView appCompatTextView = px0Var.f15312l;
/* 7 */             if (appCompatTextView != null) {
/* 11 */                px0Var.f15302b.m2407l(appCompatTextView, i);
                    }
                }

                public void setErrorTextColor(ColorStateList colorStateList) {
/* 1 */             px0 px0Var = this.f5025V;
/* 3 */             px0Var.f15315o = colorStateList;
/* 5 */             AppCompatTextView appCompatTextView = px0Var.f15312l;
/* 7 */             if (appCompatTextView == null || colorStateList == null) {
/* 14 */                return;
                    }
/* 11 */            appCompatTextView.setTextColor(colorStateList);
                }

                public void setExpandedHintEnabled(boolean z) {
/* 3 */             if (this.f5068o1 != z) {
/* 5 */                 this.f5068o1 = z;
/* 8 */                 m2415t(false, false);
                    }
                }

                public void setHelperText(CharSequence charSequence) {
/* 1 */             boolean zIsEmpty = TextUtils.isEmpty(charSequence);
/* 5 */             px0 px0Var = this.f5025V;
/* 7 */             if (zIsEmpty) {
/* 11 */                if (px0Var.f15317q) {
/* 14 */                    setHelperTextEnabled(false);
/* 17 */                    return;
                        }
/* 17 */                return;
                    }
/* 20 */            if (!px0Var.f15317q) {
/* 23 */                setHelperTextEnabled(true);
                    }
/* 26 */            px0Var.m7575c();
/* 29 */            px0Var.f15316p = charSequence;
/* 33 */            px0Var.f15318r.setText(charSequence);
/* 36 */            int i = px0Var.f15308h;
/* 39 */            if (i != 2) {
/* 41 */                px0Var.f15309i = 2;
                    }
/* 51 */            px0Var.m7582j(i, px0Var.f15309i, px0Var.m7581i(px0Var.f15318r, charSequence));
                }

                public void setHelperTextColor(ColorStateList colorStateList) {
/* 1 */             px0 px0Var = this.f5025V;
/* 3 */             px0Var.f15320t = colorStateList;
/* 5 */             AppCompatTextView appCompatTextView = px0Var.f15318r;
/* 7 */             if (appCompatTextView == null || colorStateList == null) {
/* 14 */                return;
                    }
/* 11 */            appCompatTextView.setTextColor(colorStateList);
                }

                public void setHelperTextEnabled(boolean z) {
/* 1 */             px0 px0Var = this.f5025V;
/* 3 */             TextInputLayout textInputLayout = px0Var.f15302b;
/* 7 */             if (px0Var.f15317q == z) {
/* 9 */                 return;
                    }
/* 10 */            px0Var.m7575c();
/* 15 */            if (z) {
/* 21 */                AppCompatTextView appCompatTextView = new AppCompatTextView(px0Var.f15301a, null);
/* 24 */                px0Var.f15318r = appCompatTextView;
/* 28 */                appCompatTextView.setId(R$id.textinput_helper_text);
/* 34 */                px0Var.f15318r.setTextAlignment(5);
/* 37 */                Typeface typeface = px0Var.f15321u;
/* 39 */                if (typeface != null) {
/* 43 */                    px0Var.f15318r.setTypeface(typeface);
                        }
/* 49 */                px0Var.f15318r.setVisibility(4);
/* 52 */                AppCompatTextView appCompatTextView2 = px0Var.f15318r;
/* 54 */                WeakHashMap weakHashMap = e33.f7494a;
/* 56 */                appCompatTextView2.setAccessibilityLiveRegion(1);
/* 59 */                int i = px0Var.f15319s;
/* 61 */                px0Var.f15319s = i;
/* 63 */                AppCompatTextView appCompatTextView3 = px0Var.f15318r;
/* 65 */                if (appCompatTextView3 != null) {
/* 67 */                    appCompatTextView3.setTextAppearance(i);
                        }
/* 70 */                ColorStateList colorStateList = px0Var.f15320t;
/* 72 */                px0Var.f15320t = colorStateList;
/* 74 */                AppCompatTextView appCompatTextView4 = px0Var.f15318r;
/* 76 */                if (appCompatTextView4 != null && colorStateList != null) {
/* 80 */                    appCompatTextView4.setTextColor(colorStateList);
                        }
/* 85 */                px0Var.m7573a(px0Var.f15318r, 1);
/* 95 */                px0Var.f15318r.setAccessibilityDelegate(new ox0(px0Var));
                    } else {
/* 99 */                px0Var.m7575c();
/* 102 */               int i2 = px0Var.f15308h;
/* 105 */               if (i2 == 2) {
/* 108 */                   px0Var.f15309i = 0;
                        }
/* 120 */               px0Var.m7582j(i2, px0Var.f15309i, px0Var.m7581i(px0Var.f15318r, HttpUrl.FRAGMENT_ENCODE_SET));
/* 125 */               px0Var.m7580h(px0Var.f15318r, 1);
/* 128 */               px0Var.f15318r = null;
/* 130 */               textInputLayout.m2411p();
/* 133 */               textInputLayout.m2420y();
                    }
/* 136 */           px0Var.f15317q = z;
                }

                public void setHelperTextTextAppearance(int i) {
/* 1 */             px0 px0Var = this.f5025V;
/* 3 */             px0Var.f15319s = i;
/* 5 */             AppCompatTextView appCompatTextView = px0Var.f15318r;
/* 7 */             if (appCompatTextView != null) {
/* 9 */                 appCompatTextView.setTextAppearance(i);
                    }
                }

                public void setHint(int i) {
/* 13 */            setHint(i != 0 ? getResources().getText(i) : null);
                }

                public void setHintAnimationEnabled(boolean z) {
/* 1 */             this.f5070p1 = z;
                }

                public void setHintEnabled(boolean z) {
/* 3 */             if (z != this.f5071q0) {
/* 5 */                 this.f5071q0 = z;
/* 8 */                 if (z) {
/* 46 */                    CharSequence hint = this.f5044e.getHint();
/* 54 */                    if (!TextUtils.isEmpty(hint)) {
/* 62 */                        if (TextUtils.isEmpty(this.f5073r0)) {
/* 64 */                            setHint(hint);
                                }
/* 69 */                        this.f5044e.setHint((CharSequence) null);
                            }
/* 73 */                    this.f5075s0 = true;
                        } else {
/* 11 */                    this.f5075s0 = false;
/* 19 */                    if (!TextUtils.isEmpty(this.f5073r0) && TextUtils.isEmpty(this.f5044e.getHint())) {
/* 37 */                        this.f5044e.setHint(this.f5073r0);
                            }
/* 40 */                    setHintInternal(null);
                        }
/* 77 */                if (this.f5044e != null) {
/* 79 */                    m2414s();
                        }
                    }
                }

                public void setHintTextAppearance(int i) {
/* 1 */             C1979nw c1979nw = this.f5066n1;
/* 3 */             c1979nw.m7055k(i);
/* 8 */             this.f5040c1 = c1979nw.f14540p;
/* 12 */            if (this.f5044e != null) {
/* 15 */                m2415t(false, false);
/* 18 */                m2414s();
                    }
                }

                public void setHintTextColor(ColorStateList colorStateList) {
/* 3 */             if (this.f5040c1 != colorStateList) {
/* 7 */                 if (this.f5037b1 == null) {
/* 11 */                    this.f5066n1.m7056l(colorStateList);
                        }
/* 14 */                this.f5040c1 = colorStateList;
/* 18 */                if (this.f5044e != null) {
/* 21 */                    m2415t(false, false);
                        }
                    }
                }

                public void setMaxEms(int i) {
/* 1 */             this.f5079v = i;
/* 3 */             EditText editText = this.f5044e;
/* 5 */             if (editText == null || i == -1) {
/* 13 */                return;
                    }
/* 10 */            editText.setMaxEms(i);
                }

                public void setMaxWidth(int i) {
/* 1 */             this.f5023U = i;
/* 3 */             EditText editText = this.f5044e;
/* 5 */             if (editText == null || i == -1) {
/* 13 */                return;
                    }
/* 10 */            editText.setMaxWidth(i);
                }

                public void setMaxWidthResource(int i) {
/* 13 */            setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
                }

                public void setMinEms(int i) {
/* 1 */             this.f5054i = i;
/* 3 */             EditText editText = this.f5044e;
/* 5 */             if (editText == null || i == -1) {
/* 13 */                return;
                    }
/* 10 */            editText.setMinEms(i);
                }

                public void setMinWidth(int i) {
/* 1 */             this.f5081w = i;
/* 3 */             EditText editText = this.f5044e;
/* 5 */             if (editText == null || i == -1) {
/* 13 */                return;
                    }
/* 10 */            editText.setMinWidth(i);
                }

                public void setMinWidthResource(int i) {
/* 13 */            setMinWidth(getContext().getResources().getDimensionPixelSize(i));
                }

                @Deprecated
                public void setPasswordVisibilityToggleContentDescription(int i) {
/* 13 */            setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
                }

                @Deprecated
                public void setPasswordVisibilityToggleDrawable(int i) {
/* 13 */            setPasswordVisibilityToggleDrawable(i != 0 ? mn0.m6700p(getContext(), i) : null);
                }

                @Deprecated
                public void setPasswordVisibilityToggleEnabled(boolean z) {
/* 1 */             if (z && this.f5016N0 != 1) {
/* 8 */                 setEndIconMode(1);
                    } else {
/* 12 */                if (z) {
/* 18 */                    return;
                        }
/* 15 */                setEndIconMode(0);
                    }
                }

                @Deprecated
                public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
/* 1 */             this.f5020R0 = colorStateList;
/* 7 */             w11.m9419b(this, this.f5018P0, colorStateList, this.f5021S0);
                }

                @Deprecated
                public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
/* 1 */             this.f5021S0 = mode;
/* 7 */             w11.m9419b(this, this.f5018P0, this.f5020R0, mode);
                }

                public void setPlaceholderText(CharSequence charSequence) {
/* 3 */             if (this.f5052h0 == null) {
/* 12 */                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
/* 15 */                this.f5052h0 = appCompatTextView;
/* 19 */                appCompatTextView.setId(R$id.textinput_placeholder);
/* 22 */                AppCompatTextView appCompatTextView2 = this.f5052h0;
/* 24 */                WeakHashMap weakHashMap = e33.f7494a;
/* 27 */                appCompatTextView2.setImportantForAccessibility(2);
/* 32 */                Fade fade = new Fade();
/* 37 */                fade.f1897c = 87L;
/* 39 */                LinearInterpolator linearInterpolator = AbstractC2246u8.f17410a;
/* 41 */                fade.f1899d = linearInterpolator;
/* 43 */                this.f5059k0 = fade;
/* 47 */                fade.f1895b = 67L;
/* 51 */                Fade fade2 = new Fade();
/* 54 */                fade2.f1897c = 87L;
/* 56 */                fade2.f1899d = linearInterpolator;
/* 58 */                this.f5061l0 = fade2;
/* 62 */                setPlaceholderTextAppearance(this.f5057j0);
/* 67 */                setPlaceholderTextColor(this.f5055i0);
                    }
/* 75 */            if (TextUtils.isEmpty(charSequence)) {
/* 77 */                setPlaceholderTextEnabled(false);
                    } else {
/* 83 */                if (!this.f5050g0) {
/* 86 */                    setPlaceholderTextEnabled(true);
                        }
/* 89 */                this.f5048f0 = charSequence;
                    }
/* 91 */            EditText editText = this.f5044e;
/* 104 */           m2416u(editText != null ? editText.getText().length() : 0);
                }

                public void setPlaceholderTextAppearance(int i) {
/* 1 */             this.f5057j0 = i;
/* 3 */             AppCompatTextView appCompatTextView = this.f5052h0;
/* 5 */             if (appCompatTextView != null) {
/* 7 */                 appCompatTextView.setTextAppearance(i);
                    }
                }

                public void setPlaceholderTextColor(ColorStateList colorStateList) {
/* 3 */             if (this.f5055i0 != colorStateList) {
/* 5 */                 this.f5055i0 = colorStateList;
/* 7 */                 AppCompatTextView appCompatTextView = this.f5052h0;
/* 9 */                 if (appCompatTextView == null || colorStateList == null) {
/* 16 */                    return;
                        }
/* 13 */                appCompatTextView.setTextColor(colorStateList);
                    }
                }

                public void setPrefixText(CharSequence charSequence) {
/* 1 */             kg2 kg2Var = this.f5035b;
/* 3 */             kg2Var.getClass();
/* 15 */            kg2Var.f12749c = TextUtils.isEmpty(charSequence) ? null : charSequence;
/* 19 */            kg2Var.f12748b.setText(charSequence);
/* 22 */            kg2Var.m6101d();
                }

                public void setPrefixTextAppearance(int i) {
/* 5 */             this.f5035b.f12748b.setTextAppearance(i);
                }

                public void setPrefixTextColor(ColorStateList colorStateList) {
/* 5 */             this.f5035b.f12748b.setTextColor(colorStateList);
                }

                public void setStartIconCheckable(boolean z) {
/* 5 */             this.f5035b.f12750d.setCheckable(z);
                }

                public void setStartIconContentDescription(int i) {
/* 13 */            setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
                }

                public void setStartIconDrawable(int i) {
/* 13 */            setStartIconDrawable(i != 0 ? mn0.m6700p(getContext(), i) : null);
                }

                public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
/* 1 */             kg2 kg2Var = this.f5035b;
/* 3 */             CheckableImageButton checkableImageButton = kg2Var.f12750d;
/* 5 */             View.OnLongClickListener onLongClickListener = kg2Var.f12753i;
/* 7 */             checkableImageButton.setOnClickListener(onClickListener);
/* 10 */            w11.m9395E(checkableImageButton, onLongClickListener);
                }

                public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
/* 1 */             kg2 kg2Var = this.f5035b;
/* 3 */             kg2Var.f12753i = onLongClickListener;
/* 5 */             CheckableImageButton checkableImageButton = kg2Var.f12750d;
/* 7 */             checkableImageButton.setOnLongClickListener(onLongClickListener);
/* 10 */            w11.m9395E(checkableImageButton, onLongClickListener);
                }

                public void setStartIconTintList(ColorStateList colorStateList) {
/* 1 */             kg2 kg2Var = this.f5035b;
/* 5 */             if (kg2Var.f12751e != colorStateList) {
/* 7 */                 kg2Var.f12751e = colorStateList;
/* 15 */                w11.m9419b(kg2Var.f12747a, kg2Var.f12750d, colorStateList, kg2Var.f12752f);
                    }
                }

                public void setStartIconTintMode(PorterDuff.Mode mode) {
/* 1 */             kg2 kg2Var = this.f5035b;
/* 5 */             if (kg2Var.f12752f != mode) {
/* 7 */                 kg2Var.f12752f = mode;
/* 15 */                w11.m9419b(kg2Var.f12747a, kg2Var.f12750d, kg2Var.f12751e, mode);
                    }
                }

                public void setStartIconVisible(boolean z) {
/* 3 */             this.f5035b.m6099b(z);
                }

                public void setSuffixText(CharSequence charSequence) {
/* 10 */            this.f5067o0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
/* 14 */            this.f5069p0.setText(charSequence);
/* 17 */            m2419x();
                }

                public void setSuffixTextAppearance(int i) {
/* 3 */             this.f5069p0.setTextAppearance(i);
                }

                public void setSuffixTextColor(ColorStateList colorStateList) {
/* 3 */             this.f5069p0.setTextColor(colorStateList);
                }

                public void setTextInputAccessibilityDelegate(in2 in2Var) {
/* 1 */             EditText editText = this.f5044e;
/* 3 */             if (editText != null) {
/* 5 */                 e33.m3318n(editText, in2Var);
                    }
                }

                public void setTypeface(Typeface typeface) {
/* 3 */             if (typeface != this.f5012J0) {
/* 5 */                 this.f5012J0 = typeface;
/* 7 */                 C1979nw c1979nw = this.f5066n1;
/* 9 */                 boolean zM7058n = c1979nw.m7058n(typeface);
/* 13 */                boolean zM7060p = c1979nw.m7060p(typeface);
/* 17 */                if (zM7058n || zM7060p) {
/* 22 */                    c1979nw.m7054j(false);
                        }
/* 25 */                px0 px0Var = this.f5025V;
/* 29 */                if (typeface != px0Var.f15321u) {
/* 31 */                    px0Var.f15321u = typeface;
/* 33 */                    AppCompatTextView appCompatTextView = px0Var.f15312l;
/* 35 */                    if (appCompatTextView != null) {
/* 37 */                        appCompatTextView.setTypeface(typeface);
                            }
/* 40 */                    AppCompatTextView appCompatTextView2 = px0Var.f15318r;
/* 42 */                    if (appCompatTextView2 != null) {
/* 44 */                        appCompatTextView2.setTypeface(typeface);
                            }
                        }
/* 47 */                AppCompatTextView appCompatTextView3 = this.f5039c0;
/* 49 */                if (appCompatTextView3 != null) {
/* 51 */                    appCompatTextView3.setTypeface(typeface);
                        }
                    }
                }

                /* JADX INFO: renamed from: t */
                public final void m2415t(boolean z, boolean z2) {
                    ColorStateList colorStateList;
                    AppCompatTextView appCompatTextView;
/* 1 */             boolean zIsEnabled = isEnabled();
/* 5 */             EditText editText = this.f5044e;
/* 23 */            boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
/* 24 */            EditText editText2 = this.f5044e;
/* 36 */            boolean z4 = editText2 != null && editText2.hasFocus();
/* 37 */            px0 px0Var = this.f5025V;
/* 39 */            boolean zM7577e = px0Var.m7577e();
/* 43 */            ColorStateList colorStateList2 = this.f5037b1;
/* 45 */            C1979nw c1979nw = this.f5066n1;
/* 47 */            if (colorStateList2 != null) {
/* 49 */                c1979nw.m7056l(colorStateList2);
/* 52 */                ColorStateList colorStateList3 = this.f5037b1;
/* 56 */                if (c1979nw.f14538o != colorStateList3) {
/* 58 */                    c1979nw.f14538o = colorStateList3;
/* 60 */                    c1979nw.m7054j(false);
                        }
                    }
/* 64 */            if (!zIsEnabled) {
/* 66 */                ColorStateList colorStateList4 = this.f5037b1;
/* 68 */                int colorForState = this.f5062l1;
/* 70 */                if (colorStateList4 != null) {
/* 79 */                    colorForState = colorStateList4.getColorForState(new int[]{-16842910}, colorForState);
                        }
/* 87 */                c1979nw.m7056l(ColorStateList.valueOf(colorForState));
/* 90 */                ColorStateList colorStateListValueOf = ColorStateList.valueOf(colorForState);
/* 96 */                if (c1979nw.f14538o != colorStateListValueOf) {
/* 98 */                    c1979nw.f14538o = colorStateListValueOf;
/* 100 */                   c1979nw.m7054j(false);
                        }
                    } else if (zM7577e) {
/* 106 */               AppCompatTextView appCompatTextView2 = px0Var.f15312l;
/* 116 */               c1979nw.m7056l(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
                    } else if (this.f5036b0 && (appCompatTextView = this.f5039c0) != null) {
/* 132 */               c1979nw.m7056l(appCompatTextView.getTextColors());
                    } else if (z4 && (colorStateList = this.f5040c1) != null) {
/* 142 */               c1979nw.m7056l(colorStateList);
                    }
/* 145 */           kg2 kg2Var = this.f5035b;
/* 147 */           if (z3 || !this.f5068o1 || (isEnabled() && z4)) {
/* 263 */               if (z2 || this.f5064m1) {
/* 271 */                   ValueAnimator valueAnimator = this.f5072q1;
/* 273 */                   if (valueAnimator != null && valueAnimator.isRunning()) {
/* 283 */                       this.f5072q1.cancel();
                            }
/* 288 */                   if (z && this.f5070p1) {
/* 294 */                       m2398a(1.0f);
                            } else {
/* 298 */                       c1979nw.m7061q(1.0f);
                            }
/* 301 */                   this.f5064m1 = false;
/* 307 */                   if (m2401d()) {
/* 309 */                       m2406i();
                            }
/* 312 */                   EditText editText3 = this.f5044e;
/* 326 */                   m2416u(editText3 == null ? 0 : editText3.getText().length());
/* 329 */                   kg2Var.f12754v = false;
/* 331 */                   kg2Var.m6101d();
/* 334 */                   m2419x();
/* 337 */                   return;
                        }
/* 270 */               return;
                    }
/* 162 */           if (z2 || !this.f5064m1) {
/* 168 */               ValueAnimator valueAnimator2 = this.f5072q1;
/* 170 */               if (valueAnimator2 != null && valueAnimator2.isRunning()) {
/* 180 */                   this.f5072q1.cancel();
                        }
/* 184 */               if (z && this.f5070p1) {
/* 190 */                   m2398a(0.0f);
                        } else {
/* 194 */                   c1979nw.m7061q(0.0f);
                        }
/* 201 */               if (m2401d() && !((s30) this.f5077t0).f16396i0.isEmpty() && m2401d()) {
/* 225 */                   ((s30) this.f5077t0).m8389w(0.0f, 0.0f, 0.0f, 0.0f);
                        }
/* 228 */               this.f5064m1 = true;
/* 230 */               AppCompatTextView appCompatTextView3 = this.f5052h0;
/* 232 */               if (appCompatTextView3 != null && this.f5050g0) {
/* 238 */                   appCompatTextView3.setText((CharSequence) null);
/* 245 */                   lr2.m6525a(this.f5032a, this.f5061l0);
/* 251 */                   this.f5052h0.setVisibility(4);
                        }
/* 254 */               kg2Var.f12754v = true;
/* 256 */               kg2Var.m6101d();
/* 259 */               m2419x();
                    }
                }

                /* JADX INFO: renamed from: u */
                public final void m2416u(int i) {
/* 1 */             FrameLayout frameLayout = this.f5032a;
/* 3 */             if (i != 0 || this.f5064m1) {
/* 54 */                AppCompatTextView appCompatTextView = this.f5052h0;
/* 56 */                if (appCompatTextView == null || !this.f5050g0) {
/* 77 */                    return;
                        }
/* 63 */                appCompatTextView.setText((CharSequence) null);
/* 68 */                lr2.m6525a(frameLayout, this.f5061l0);
/* 74 */                this.f5052h0.setVisibility(4);
/* 77 */                return;
                    }
/* 11 */            if (this.f5052h0 == null || !this.f5050g0 || TextUtils.isEmpty(this.f5048f0)) {
/* 77 */                return;
                    }
/* 29 */            this.f5052h0.setText(this.f5048f0);
/* 34 */            lr2.m6525a(frameLayout, this.f5059k0);
/* 40 */            this.f5052h0.setVisibility(0);
/* 45 */            this.f5052h0.bringToFront();
/* 50 */            announceForAccessibility(this.f5048f0);
                }

                /* JADX INFO: renamed from: v */
                public final void m2417v(boolean z, boolean z2) {
/* 3 */             int defaultColor = this.f5051g1.getDefaultColor();
/* 19 */            int colorForState = this.f5051g1.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
/* 32 */            int colorForState2 = this.f5051g1.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
/* 36 */            if (z) {
/* 38 */                this.f5007E0 = colorForState2;
                    } else if (z2) {
/* 43 */                this.f5007E0 = colorForState;
                    } else {
/* 46 */                this.f5007E0 = defaultColor;
                    }
                }

                /* JADX INFO: renamed from: w */
                public final void m2418w() {
                    int paddingEnd;
/* 3 */             if (this.f5044e == null) {
/* 5 */                 return;
                    }
/* 10 */            if (m2404g() || this.f5030Y0.getVisibility() == 0) {
/* 30 */                paddingEnd = 0;
                    } else {
/* 21 */                EditText editText = this.f5044e;
/* 23 */                WeakHashMap weakHashMap = e33.f7494a;
/* 25 */                paddingEnd = editText.getPaddingEnd();
                    }
/* 41 */            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.material_input_text_to_prefix_suffix_padding);
/* 47 */            int paddingTop = this.f5044e.getPaddingTop();
/* 53 */            int paddingBottom = this.f5044e.getPaddingBottom();
/* 57 */            WeakHashMap weakHashMap2 = e33.f7494a;
/* 61 */            this.f5069p0.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
                }

                /* JADX INFO: renamed from: x */
                public final void m2419x() {
/* 1 */             AppCompatTextView appCompatTextView = this.f5069p0;
/* 3 */             int visibility = appCompatTextView.getVisibility();
/* 18 */            int i = (this.f5067o0 == null || this.f5064m1) ? 8 : 0;
/* 20 */            if (visibility != i) {
/* 29 */                getEndIconDelegate().mo3012c(i == 0);
                    }
/* 32 */            m2412q();
/* 35 */            appCompatTextView.setVisibility(i);
/* 38 */            m2410o();
                }

                /* JADX INFO: renamed from: y */
                public final void m2420y() {
                    AppCompatTextView appCompatTextView;
                    EditText editText;
                    EditText editText2;
/* 3 */             if (this.f5077t0 == null || this.f5085z0 == 0) {
/* 306 */               return;
                    }
/* 15 */            boolean z = false;
/* 32 */            boolean z2 = isFocused() || ((editText2 = this.f5044e) != null && editText2.hasFocus());
/* 37 */            if (isHovered() || ((editText = this.f5044e) != null && editText.isHovered())) {
/* 49 */                z = true;
                    }
/* 50 */            boolean zIsEnabled = isEnabled();
/* 55 */            px0 px0Var = this.f5025V;
/* 57 */            if (!zIsEnabled) {
/* 61 */                this.f5007E0 = this.f5062l1;
                    } else if (px0Var.m7577e()) {
/* 72 */                if (this.f5051g1 != null) {
/* 74 */                    m2417v(z2, z);
                        } else {
/* 78 */                    AppCompatTextView appCompatTextView2 = px0Var.f15312l;
/* 88 */                    this.f5007E0 = appCompatTextView2 != null ? appCompatTextView2.getCurrentTextColor() : -1;
                        }
                    } else if (!this.f5036b0 || (appCompatTextView = this.f5039c0) == null) {
/* 114 */               if (z2) {
/* 118 */                   this.f5007E0 = this.f5049f1;
                        } else if (z) {
/* 125 */                   this.f5007E0 = this.f5046e1;
                        } else {
/* 130 */                   this.f5007E0 = this.f5043d1;
                        }
                    } else if (this.f5051g1 != null) {
/* 103 */               m2417v(z2, z);
                    } else {
/* 111 */               this.f5007E0 = appCompatTextView.getCurrentTextColor();
                    }
/* 132 */           m2413r();
/* 139 */           w11.m9394D(this, this.f5030Y0, this.f5031Z0);
/* 142 */           kg2 kg2Var = this.f5035b;
/* 150 */           w11.m9394D(kg2Var.f12747a, kg2Var.f12750d, kg2Var.f12751e);
/* 153 */           ColorStateList colorStateList = this.f5020R0;
/* 155 */           CheckableImageButton checkableImageButton = this.f5018P0;
/* 157 */           w11.m9394D(this, checkableImageButton, colorStateList);
/* 160 */           de0 endIconDelegate = getEndIconDelegate();
/* 164 */           endIconDelegate.getClass();
/* 169 */           if (endIconDelegate instanceof za0) {
/* 175 */               if (!px0Var.m7577e() || getEndIconDrawable() == null) {
/* 210 */                   w11.m9419b(this, checkableImageButton, this.f5020R0, this.f5021S0);
                        } else {
/* 187 */                   Drawable drawableMutate = getEndIconDrawable().mutate();
/* 191 */                   AppCompatTextView appCompatTextView3 = px0Var.f15312l;
/* 199 */                   s90.m8447g(drawableMutate, appCompatTextView3 != null ? appCompatTextView3.getCurrentTextColor() : -1);
/* 202 */                   checkableImageButton.setImageDrawable(drawableMutate);
                        }
                    }
/* 216 */           if (this.f5085z0 == 2) {
/* 218 */               int i = this.f5004B0;
/* 220 */               if (z2 && isEnabled()) {
/* 230 */                   this.f5004B0 = this.f5006D0;
                        } else {
/* 235 */                   this.f5004B0 = this.f5005C0;
                        }
/* 239 */               if (this.f5004B0 != i && m2401d() && !this.f5064m1) {
/* 255 */                   if (m2401d()) {
/* 262 */                       ((s30) this.f5077t0).m8389w(0.0f, 0.0f, 0.0f, 0.0f);
                            }
/* 265 */                   m2406i();
                        }
                    }
/* 270 */           if (this.f5085z0 == 1) {
/* 276 */               if (!isEnabled()) {
/* 280 */                   this.f5008F0 = this.f5056i1;
                        } else if (z && !z2) {
/* 289 */                   this.f5008F0 = this.f5060k1;
                        } else if (z2) {
/* 296 */                   this.f5008F0 = this.f5058j1;
                        } else {
/* 301 */                   this.f5008F0 = this.f5053h1;
                        }
                    }
/* 303 */           m2399b();
                }

/* 16 */        public void setEndIconContentDescription(CharSequence charSequence) {
/* 17 */            if (getEndIconContentDescription() != charSequence) {
/* 18 */                this.f5018P0.setContentDescription(charSequence);
                    }
                }

/* 16 */        public void setHint(CharSequence charSequence) {
/* 17 */            if (this.f5071q0) {
/* 18 */                setHintInternal(charSequence);
/* 19 */                sendAccessibilityEvent(2048);
                    }
                }

                @Deprecated
/* 16 */        public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
/* 17 */            this.f5018P0.setContentDescription(charSequence);
                }

                @Deprecated
/* 16 */        public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
/* 17 */            this.f5018P0.setImageDrawable(drawable);
                }

/* 16 */        public void setStartIconContentDescription(CharSequence charSequence) {
/* 18 */            CheckableImageButton checkableImageButton = this.f5035b.f12750d;
/* 19 */            if (checkableImageButton.getContentDescription() != charSequence) {
/* 20 */                checkableImageButton.setContentDescription(charSequence);
                    }
                }

/* 16 */        public void setStartIconDrawable(Drawable drawable) {
/* 17 */            this.f5035b.m6098a(drawable);
                }

/* 20 */        public void setEndIconDrawable(int i) {
/* 21 */            setEndIconDrawable(i != 0 ? mn0.m6700p(getContext(), i) : null);
                }

/* 23 */        public void setErrorIconDrawable(Drawable drawable) {
/* 24 */            CheckableImageButton checkableImageButton = this.f5030Y0;
                    checkableImageButton.setImageDrawable(drawable);
/* 25 */            m2413r();
/* 26 */            w11.m9419b(this, checkableImageButton, this.f5031Z0, this.f5034a1);
                }

/* 1440 */      public TextInputLayout(Context context, AttributeSet attributeSet) {
/* 1441 */          this(context, attributeSet, R$attr.textInputStyle);
                }
            }
