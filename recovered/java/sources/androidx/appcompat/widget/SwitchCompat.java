            package androidx.appcompat.widget;

            import android.R;
            import android.animation.ObjectAnimator;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.Region;
            import android.graphics.Typeface;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.text.InputFilter;
            import android.text.Layout;
            import android.text.StaticLayout;
            import android.text.TextPaint;
            import android.text.TextUtils;
            import android.text.method.TransformationMethod;
            import android.util.AttributeSet;
            import android.view.ActionMode;
            import android.view.MotionEvent;
            import android.view.VelocityTracker;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.CompoundButton;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$string;
            import androidx.appcompat.R$styleable;
            import androidx.core.R$id;
            import java.util.WeakHashMap;
            import p000.C0013ab;
            import p000.C1938ms;
            import p000.C2171s7;
            import p000.C2212tb;
            import p000.ac1;
            import p000.e33;
            import p000.hd0;
            import p000.he3;
            import p000.m53;
            import p000.mn0;
            import p000.o23;
            import p000.py0;
            import p000.s90;
            import p000.sc0;
            import p000.sn2;
            import p000.v00;
            import p000.w90;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 498 */   public class SwitchCompat extends CompoundButton {

                /* JADX INFO: renamed from: F0 */
                public static final C1938ms f640F0 = new C1938ms("thumbPos", Float.class, 17);

                /* JADX INFO: renamed from: G0 */
                public static final int[] f641G0 = {R.attr.state_checked};

                /* JADX INFO: renamed from: A0 */
                public final C2171s7 f642A0;

                /* JADX INFO: renamed from: B0 */
                public ObjectAnimator f643B0;

                /* JADX INFO: renamed from: C0 */
                public C0013ab f644C0;

                /* JADX INFO: renamed from: D0 */
                public hd0 f645D0;

                /* JADX INFO: renamed from: E0 */
                public final Rect f646E0;

                /* JADX INFO: renamed from: U */
                public boolean f647U;

                /* JADX INFO: renamed from: V */
                public int f648V;

                /* JADX INFO: renamed from: W */
                public int f649W;

                /* JADX INFO: renamed from: a */
                public Drawable f650a;

                /* JADX INFO: renamed from: a0 */
                public int f651a0;

                /* JADX INFO: renamed from: b */
                public ColorStateList f652b;

                /* JADX INFO: renamed from: b0 */
                public boolean f653b0;

                /* JADX INFO: renamed from: c */
                public PorterDuff.Mode f654c;

                /* JADX INFO: renamed from: c0 */
                public CharSequence f655c0;

                /* JADX INFO: renamed from: d */
                public boolean f656d;

                /* JADX INFO: renamed from: d0 */
                public CharSequence f657d0;

                /* JADX INFO: renamed from: e */
                public boolean f658e;

                /* JADX INFO: renamed from: e0 */
                public CharSequence f659e0;

                /* JADX INFO: renamed from: f */
                public Drawable f660f;

                /* JADX INFO: renamed from: f0 */
                public CharSequence f661f0;

                /* JADX INFO: renamed from: g0 */
                public boolean f662g0;

                /* JADX INFO: renamed from: h0 */
                public int f663h0;

                /* JADX INFO: renamed from: i */
                public ColorStateList f664i;

                /* JADX INFO: renamed from: i0 */
                public final int f665i0;

                /* JADX INFO: renamed from: j0 */
                public float f666j0;

                /* JADX INFO: renamed from: k0 */
                public float f667k0;

                /* JADX INFO: renamed from: l0 */
                public final VelocityTracker f668l0;

                /* JADX INFO: renamed from: m0 */
                public final int f669m0;

                /* JADX INFO: renamed from: n0 */
                public float f670n0;

                /* JADX INFO: renamed from: o0 */
                public int f671o0;

                /* JADX INFO: renamed from: p0 */
                public int f672p0;

                /* JADX INFO: renamed from: q0 */
                public int f673q0;

                /* JADX INFO: renamed from: r0 */
                public int f674r0;

                /* JADX INFO: renamed from: s0 */
                public int f675s0;

                /* JADX INFO: renamed from: t0 */
                public int f676t0;

                /* JADX INFO: renamed from: u0 */
                public int f677u0;

                /* JADX INFO: renamed from: v */
                public PorterDuff.Mode f678v;

                /* JADX INFO: renamed from: v0 */
                public boolean f679v0;

                /* JADX INFO: renamed from: w */
                public boolean f680w;

                /* JADX INFO: renamed from: w0 */
                public final TextPaint f681w0;

                /* JADX INFO: renamed from: x0 */
                public final ColorStateList f682x0;

                /* JADX INFO: renamed from: y0 */
                public StaticLayout f683y0;

                /* JADX INFO: renamed from: z0 */
                public StaticLayout f684z0;

                public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
                    Typeface typeface;
                    int resourceId;
/* 1 */             super(context, attributeSet, i);
/* 5 */             this.f652b = null;
/* 7 */             this.f654c = null;
/* 10 */            this.f656d = false;
/* 12 */            this.f658e = false;
/* 14 */            this.f664i = null;
/* 16 */            this.f678v = null;
/* 18 */            this.f680w = false;
/* 20 */            this.f647U = false;
/* 26 */            this.f668l0 = VelocityTracker.obtain();
/* 29 */            this.f679v0 = true;
/* 36 */            this.f646E0 = new Rect();
/* 42 */            sn2.m8583a(this, getContext());
/* 47 */            TextPaint textPaint = new TextPaint(1);
/* 50 */            this.f681w0 = textPaint;
/* 62 */            textPaint.density = getResources().getDisplayMetrics().density;
/* 66 */            ac1 ac1VarM156H = ac1.m156H(context, attributeSet, R$styleable.SwitchCompat, i);
/* 73 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 81 */            e33.m3317m(this, context, R$styleable.SwitchCompat, attributeSet, typedArray, i);
/* 86 */            Drawable drawableM184n = ac1VarM156H.m184n(R$styleable.SwitchCompat_android_thumb);
/* 90 */            this.f650a = drawableM184n;
/* 92 */            if (drawableM184n != null) {
/* 94 */                drawableM184n.setCallback(this);
                    }
/* 99 */            Drawable drawableM184n2 = ac1VarM156H.m184n(R$styleable.SwitchCompat_track);
/* 103 */           this.f660f = drawableM184n2;
/* 105 */           if (drawableM184n2 != null) {
/* 107 */               drawableM184n2.setCallback(this);
                    }
/* 116 */           setTextOnInternal(typedArray.getText(R$styleable.SwitchCompat_android_textOn));
/* 125 */           setTextOffInternal(typedArray.getText(R$styleable.SwitchCompat_android_textOff));
/* 134 */           this.f662g0 = typedArray.getBoolean(R$styleable.SwitchCompat_showText, true);
/* 142 */           this.f648V = typedArray.getDimensionPixelSize(R$styleable.SwitchCompat_thumbTextPadding, 0);
/* 150 */           this.f649W = typedArray.getDimensionPixelSize(R$styleable.SwitchCompat_switchMinWidth, 0);
/* 158 */           this.f651a0 = typedArray.getDimensionPixelSize(R$styleable.SwitchCompat_switchPadding, 0);
/* 166 */           this.f653b0 = typedArray.getBoolean(R$styleable.SwitchCompat_splitTrack, false);
/* 170 */           ColorStateList colorStateListM183m = ac1VarM156H.m183m(R$styleable.SwitchCompat_thumbTint);
/* 174 */           if (colorStateListM183m != null) {
/* 176 */               this.f652b = colorStateListM183m;
/* 178 */               this.f656d = true;
                    }
/* 187 */           PorterDuff.Mode modeM9485c = w90.m9485c(typedArray.getInt(R$styleable.SwitchCompat_thumbTintMode, -1), null);
/* 193 */           if (this.f654c != modeM9485c) {
/* 195 */               this.f654c = modeM9485c;
/* 197 */               this.f658e = true;
                    }
/* 201 */           if (this.f656d || this.f658e) {
/* 207 */               m391a();
                    }
/* 212 */           ColorStateList colorStateListM183m2 = ac1VarM156H.m183m(R$styleable.SwitchCompat_trackTint);
/* 216 */           if (colorStateListM183m2 != null) {
/* 218 */               this.f664i = colorStateListM183m2;
/* 220 */               this.f680w = true;
                    }
/* 228 */           PorterDuff.Mode modeM9485c2 = w90.m9485c(typedArray.getInt(R$styleable.SwitchCompat_trackTintMode, -1), null);
/* 234 */           if (this.f678v != modeM9485c2) {
/* 236 */               this.f678v = modeM9485c2;
/* 238 */               this.f647U = true;
                    }
/* 242 */           if (this.f680w || this.f647U) {
/* 248 */               m392b();
                    }
/* 253 */           int resourceId2 = typedArray.getResourceId(R$styleable.SwitchCompat_switchTextAppearance, 0);
/* 257 */           if (resourceId2 != 0) {
/* 261 */               TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, R$styleable.TextAppearance);
/* 265 */               int i2 = R$styleable.TextAppearance_android_textColor;
/* 286 */               ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) == 0 || (colorStateList = v00.getColorStateList(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(i2) : colorStateList;
/* 290 */               if (colorStateList != null) {
/* 292 */                   this.f682x0 = colorStateList;
                        } else {
/* 299 */                   this.f682x0 = getTextColors();
                        }
/* 303 */               int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, 0);
/* 307 */               if (dimensionPixelSize != 0) {
                            float f = dimensionPixelSize;
/* 316 */                   if (f != textPaint.getTextSize()) {
/* 318 */                       textPaint.setTextSize(f);
/* 321 */                       requestLayout();
                            }
                        }
/* 326 */               int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, -1);
/* 332 */               int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, -1);
/* 337 */               if (i3 == 1) {
/* 352 */                   typeface = Typeface.SANS_SERIF;
                        } else if (i3 != 2) {
/* 346 */                   typeface = i3 != 3 ? null : Typeface.MONOSPACE;
                        } else {
/* 349 */                   typeface = Typeface.SERIF;
                        }
/* 355 */               if (i4 > 0) {
/* 364 */                   Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
/* 368 */                   setSwitchTypeface(typefaceDefaultFromStyle);
/* 380 */                   int i5 = i4 & (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0));
/* 387 */                   textPaint.setFakeBoldText((i5 & 1) != 0);
/* 395 */                   textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
                        } else {
/* 399 */                   textPaint.setFakeBoldText(false);
/* 402 */                   textPaint.setTextSkewX(0.0f);
/* 405 */                   setSwitchTypeface(typeface);
                        }
/* 414 */               if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false)) {
/* 418 */                   Context context2 = getContext();
/* 422 */                   C2171s7 c2171s7 = new C2171s7();
/* 435 */                   c2171s7.f16457a = context2.getResources().getConfiguration().locale;
/* 437 */                   this.f642A0 = c2171s7;
                        } else {
/* 440 */                   this.f642A0 = null;
                        }
/* 444 */               setTextOnInternal(this.f655c0);
/* 449 */               setTextOffInternal(this.f659e0);
/* 452 */               typedArrayObtainStyledAttributes.recycle();
                    }
/* 460 */           new C2212tb(this).m8764f(attributeSet, i);
/* 463 */           ac1VarM156H.m168J();
/* 466 */           ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
/* 474 */           this.f665i0 = viewConfiguration.getScaledTouchSlop();
/* 480 */           this.f669m0 = viewConfiguration.getScaledMinimumFlingVelocity();
/* 486 */           getEmojiTextViewHelper().m140b(attributeSet, i);
/* 489 */           refreshDrawableState();
/* 496 */           setChecked(isChecked());
                }

                private C0013ab getEmojiTextViewHelper() {
/* 3 */             if (this.f644C0 == null) {
/* 10 */                this.f644C0 = new C0013ab(this);
                    }
/* 12 */            return this.f644C0;
                }

                private boolean getTargetCheckedState() {
                    return this.f670n0 > 0.5f;
                }

                private int getThumbOffset() {
/* 1 */             boolean z = m53.f13568a;
/* 3 */             int layoutDirection = getLayoutDirection();
/* 7 */             float f = this.f670n0;
/* 10 */            if (layoutDirection == 1) {
/* 14 */                f = 1.0f - f;
                    }
/* 25 */            return (int) ((f * getThumbScrollRange()) + 0.5f);
                }

                private int getThumbScrollRange() {
/* 1 */             Drawable drawable = this.f660f;
/* 3 */             if (drawable == null) {
/* 39 */                return 0;
                    }
/* 5 */             Rect rect = this.f646E0;
/* 7 */             drawable.getPadding(rect);
/* 10 */            Drawable drawable2 = this.f650a;
/* 19 */            Rect rectM9484b = drawable2 != null ? w90.m9484b(drawable2) : w90.f18485c;
/* 37 */            return ((((this.f671o0 - this.f673q0) - rect.left) - rect.right) - rectM9484b.left) - rectM9484b.right;
                }

                private void setTextOffInternal(CharSequence charSequence) {
/* 1 */             this.f659e0 = charSequence;
/* 15 */            TransformationMethod transformationMethodMo3728v0 = ((py0) getEmojiTextViewHelper().f155b.f7001a).mo3728v0(this.f642A0);
/* 19 */            if (transformationMethodMo3728v0 != null) {
/* 21 */                charSequence = transformationMethodMo3728v0.getTransformation(charSequence, this);
                    }
/* 25 */            this.f661f0 = charSequence;
/* 28 */            this.f684z0 = null;
/* 32 */            if (this.f662g0) {
/* 34 */                m394d();
                    }
                }

                private void setTextOnInternal(CharSequence charSequence) {
/* 1 */             this.f655c0 = charSequence;
/* 15 */            TransformationMethod transformationMethodMo3728v0 = ((py0) getEmojiTextViewHelper().f155b.f7001a).mo3728v0(this.f642A0);
/* 19 */            if (transformationMethodMo3728v0 != null) {
/* 21 */                charSequence = transformationMethodMo3728v0.getTransformation(charSequence, this);
                    }
/* 25 */            this.f657d0 = charSequence;
/* 28 */            this.f683y0 = null;
/* 32 */            if (this.f662g0) {
/* 34 */                m394d();
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m391a() {
/* 1 */             Drawable drawable = this.f650a;
/* 3 */             if (drawable != null) {
/* 7 */                 if (this.f656d || this.f658e) {
/* 13 */                    Drawable drawableMutate = drawable.mutate();
/* 17 */                    this.f650a = drawableMutate;
/* 21 */                    if (this.f656d) {
/* 25 */                        s90.m8448h(drawableMutate, this.f652b);
                            }
/* 30 */                    if (this.f658e) {
/* 36 */                        s90.m8449i(this.f650a, this.f654c);
                            }
/* 45 */                    if (this.f650a.isStateful()) {
/* 53 */                        this.f650a.setState(getDrawableState());
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m392b() {
/* 1 */             Drawable drawable = this.f660f;
/* 3 */             if (drawable != null) {
/* 7 */                 if (this.f680w || this.f647U) {
/* 13 */                    Drawable drawableMutate = drawable.mutate();
/* 17 */                    this.f660f = drawableMutate;
/* 21 */                    if (this.f680w) {
/* 25 */                        s90.m8448h(drawableMutate, this.f664i);
                            }
/* 30 */                    if (this.f647U) {
/* 36 */                        s90.m8449i(this.f660f, this.f678v);
                            }
/* 45 */                    if (this.f660f.isStateful()) {
/* 53 */                        this.f660f.setState(getDrawableState());
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m393c() {
/* 3 */             setTextOnInternal(this.f655c0);
/* 8 */             setTextOffInternal(this.f659e0);
/* 11 */            requestLayout();
                }

                /* JADX INFO: renamed from: d */
                public final void m394d() {
/* 3 */             if (this.f645D0 == null && ((py0) this.f644C0.f155b.f7001a).mo3725o0() && sc0.f16512k != null) {
/* 24 */                sc0 sc0VarM8471a = sc0.m8471a();
/* 28 */                int iM8472b = sc0VarM8471a.m8472b();
/* 33 */                if (iM8472b == 3 || iM8472b == 0) {
/* 39 */                    hd0 hd0Var = new hd0(this);
/* 42 */                    this.f645D0 = hd0Var;
/* 44 */                    sc0VarM8471a.m8476f(hd0Var);
                        }
                    }
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                    int i;
                    int i2;
/* 1 */             int i3 = this.f674r0;
/* 3 */             int i4 = this.f675s0;
/* 5 */             int i5 = this.f676t0;
/* 7 */             int i6 = this.f677u0;
/* 13 */            int thumbOffset = getThumbOffset() + i3;
/* 14 */            Drawable drawable = this.f650a;
/* 23 */            Rect rectM9484b = drawable != null ? w90.m9484b(drawable) : w90.f18485c;
/* 25 */            Drawable drawable2 = this.f660f;
/* 27 */            Rect rect = this.f646E0;
/* 29 */            if (drawable2 != null) {
/* 31 */                drawable2.getPadding(rect);
/* 34 */                int i7 = rect.left;
/* 36 */                thumbOffset += i7;
/* 37 */                if (rectM9484b != null) {
/* 39 */                    int i8 = rectM9484b.left;
/* 41 */                    if (i8 > i7) {
/* 44 */                        i3 += i8 - i7;
                            }
/* 45 */                    int i9 = rectM9484b.top;
/* 47 */                    int i10 = rect.top;
/* 54 */                    i = i9 > i10 ? (i9 - i10) + i4 : i4;
/* 55 */                    int i11 = rectM9484b.right;
/* 57 */                    int i12 = rect.right;
/* 59 */                    if (i11 > i12) {
/* 62 */                        i5 -= i11 - i12;
                            }
/* 63 */                    int i13 = rectM9484b.bottom;
/* 65 */                    int i14 = rect.bottom;
/* 67 */                    if (i13 > i14) {
/* 70 */                        i2 = i6 - (i13 - i14);
                            }
/* 79 */                    this.f660f.setBounds(i3, i, i5, i2);
                        } else {
/* 75 */                    i = i4;
                        }
/* 73 */                i2 = i6;
/* 79 */                this.f660f.setBounds(i3, i, i5, i2);
                    }
/* 82 */            Drawable drawable3 = this.f650a;
/* 84 */            if (drawable3 != null) {
/* 86 */                drawable3.getPadding(rect);
/* 91 */                int i15 = thumbOffset - rect.left;
/* 98 */                int i16 = thumbOffset + this.f673q0 + rect.right;
/* 101 */               this.f650a.setBounds(i15, i4, i16, i6);
/* 104 */               Drawable background = getBackground();
/* 108 */               if (background != null) {
/* 110 */                   s90.m8446f(background, i15, i4, i16, i6);
                        }
                    }
/* 113 */           super.draw(canvas);
                }

                @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
                public final void drawableHotspotChanged(float f, float f2) {
/* 1 */             super.drawableHotspotChanged(f, f2);
/* 4 */             Drawable drawable = this.f650a;
/* 6 */             if (drawable != null) {
/* 8 */                 s90.m8445e(drawable, f, f2);
                    }
/* 11 */            Drawable drawable2 = this.f660f;
/* 13 */            if (drawable2 != null) {
/* 15 */                s90.m8445e(drawable2, f, f2);
                    }
                }

                @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
                public final void drawableStateChanged() {
/* 1 */             super.drawableStateChanged();
/* 4 */             int[] drawableState = getDrawableState();
/* 8 */             Drawable drawable = this.f650a;
/* 23 */            boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
/* 24 */            Drawable drawable2 = this.f660f;
/* 26 */            if (drawable2 != null && drawable2.isStateful()) {
/* 38 */                state |= drawable2.setState(drawableState);
                    }
/* 39 */            if (state) {
/* 41 */                invalidate();
                    }
                }

                @Override // android.widget.CompoundButton, android.widget.TextView
                public int getCompoundPaddingLeft() {
/* 1 */             boolean z = m53.f13568a;
/* 8 */             if (getLayoutDirection() != 1) {
/* 31 */                return super.getCompoundPaddingLeft();
                    }
/* 16 */            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f671o0;
                    return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f651a0 : compoundPaddingLeft;
                }

                @Override // android.widget.CompoundButton, android.widget.TextView
                public int getCompoundPaddingRight() {
/* 1 */             boolean z = m53.f13568a;
/* 8 */             if (getLayoutDirection() == 1) {
/* 10 */                return super.getCompoundPaddingRight();
                    }
/* 21 */            int compoundPaddingRight = super.getCompoundPaddingRight() + this.f671o0;
                    return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f651a0 : compoundPaddingRight;
                }

                @Override // android.widget.TextView
                public ActionMode.Callback getCustomSelectionActionModeCallback() {
/* 5 */             return he3.m4200w(super.getCustomSelectionActionModeCallback());
                }

                public boolean getShowText() {
/* 1 */             return this.f662g0;
                }

                public boolean getSplitTrack() {
/* 1 */             return this.f653b0;
                }

                public int getSwitchMinWidth() {
/* 1 */             return this.f649W;
                }

                public int getSwitchPadding() {
/* 1 */             return this.f651a0;
                }

                public CharSequence getTextOff() {
/* 1 */             return this.f659e0;
                }

                public CharSequence getTextOn() {
/* 1 */             return this.f655c0;
                }

                public Drawable getThumbDrawable() {
/* 1 */             return this.f650a;
                }

                public final float getThumbPosition() {
/* 1 */             return this.f670n0;
                }

                public int getThumbTextPadding() {
/* 1 */             return this.f648V;
                }

                public ColorStateList getThumbTintList() {
/* 1 */             return this.f652b;
                }

                public PorterDuff.Mode getThumbTintMode() {
/* 1 */             return this.f654c;
                }

                public Drawable getTrackDrawable() {
/* 1 */             return this.f660f;
                }

                public ColorStateList getTrackTintList() {
/* 1 */             return this.f664i;
                }

                public PorterDuff.Mode getTrackTintMode() {
/* 1 */             return this.f678v;
                }

                @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
                public final void jumpDrawablesToCurrentState() {
/* 1 */             super.jumpDrawablesToCurrentState();
/* 4 */             Drawable drawable = this.f650a;
/* 6 */             if (drawable != null) {
/* 8 */                 drawable.jumpToCurrentState();
                    }
/* 11 */            Drawable drawable2 = this.f660f;
/* 13 */            if (drawable2 != null) {
/* 15 */                drawable2.jumpToCurrentState();
                    }
/* 18 */            ObjectAnimator objectAnimator = this.f643B0;
/* 20 */            if (objectAnimator == null || !objectAnimator.isStarted()) {
/* 36 */                return;
                    }
/* 30 */            this.f643B0.end();
/* 34 */            this.f643B0 = null;
                }

                @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
                public final int[] onCreateDrawableState(int i) {
/* 3 */             int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
/* 11 */            if (isChecked()) {
/* 15 */                View.mergeDrawableStates(iArrOnCreateDrawableState, f641G0);
                    }
/* 18 */            return iArrOnCreateDrawableState;
                }

                @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
                public final void onDraw(Canvas canvas) {
                    int width;
/* 1 */             super.onDraw(canvas);
/* 4 */             Drawable drawable = this.f660f;
/* 6 */             Rect rect = this.f646E0;
/* 8 */             if (drawable != null) {
/* 10 */                drawable.getPadding(rect);
                    } else {
/* 14 */                rect.setEmpty();
                    }
/* 17 */            int i = this.f675s0;
/* 19 */            int i2 = this.f677u0;
/* 23 */            int i3 = i + rect.top;
/* 26 */            int i4 = i2 - rect.bottom;
/* 27 */            Drawable drawable2 = this.f650a;
/* 29 */            if (drawable != null) {
/* 33 */                if (!this.f653b0 || drawable2 == null) {
/* 74 */                    drawable.draw(canvas);
                        } else {
/* 37 */                    Rect rectM9484b = w90.m9484b(drawable2);
/* 41 */                    drawable2.copyBounds(rect);
/* 49 */                    rect.left += rectM9484b.left;
/* 56 */                    rect.right -= rectM9484b.right;
/* 58 */                    int iSave = canvas.save();
/* 64 */                    canvas.clipRect(rect, Region.Op.DIFFERENCE);
/* 67 */                    drawable.draw(canvas);
/* 70 */                    canvas.restoreToCount(iSave);
                        }
                    }
/* 77 */            int iSave2 = canvas.save();
/* 81 */            if (drawable2 != null) {
/* 83 */                drawable2.draw(canvas);
                    }
/* 95 */            StaticLayout staticLayout = getTargetCheckedState() ? this.f683y0 : this.f684z0;
/* 97 */            if (staticLayout != null) {
/* 99 */                int[] drawableState = getDrawableState();
/* 103 */               TextPaint textPaint = this.f681w0;
/* 105 */               ColorStateList colorStateList = this.f682x0;
/* 107 */               if (colorStateList != null) {
/* 114 */                   textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
                        }
/* 117 */               textPaint.drawableState = drawableState;
/* 119 */               if (drawable2 != null) {
/* 121 */                   Rect bounds = drawable2.getBounds();
/* 129 */                   width = bounds.left + bounds.right;
                        } else {
/* 131 */                   width = getWidth();
                        }
/* 156 */               canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
/* 159 */               staticLayout.draw(canvas);
                    }
/* 162 */           canvas.restoreToCount(iSave2);
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             super.onInitializeAccessibilityEvent(accessibilityEvent);
/* 6 */             accessibilityEvent.setClassName("android.widget.Switch");
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 6 */             accessibilityNodeInfo.setClassName("android.widget.Switch");
/* 13 */            if (Build.VERSION.SDK_INT < 30) {
/* 24 */                CharSequence charSequence = isChecked() ? this.f655c0 : this.f659e0;
/* 30 */                if (TextUtils.isEmpty(charSequence)) {
/* 65 */                    return;
                        }
/* 32 */                CharSequence text = accessibilityNodeInfo.getText();
/* 40 */                if (TextUtils.isEmpty(text)) {
/* 42 */                    accessibilityNodeInfo.setText(charSequence);
/* 45 */                    return;
                        }
/* 48 */                StringBuilder sb = new StringBuilder();
/* 51 */                sb.append(text);
/* 56 */                sb.append(' ');
/* 59 */                sb.append(charSequence);
/* 62 */                accessibilityNodeInfo.setText(sb);
                    }
                }

                @Override // android.widget.TextView, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int iMax;
                    int width;
                    int paddingLeft;
                    int height;
                    int paddingTop;
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 6 */             int iMax2 = 0;
/* 7 */             if (this.f650a != null) {
/* 9 */                 Drawable drawable = this.f660f;
/* 11 */                Rect rect = this.f646E0;
/* 13 */                if (drawable != null) {
/* 15 */                    drawable.getPadding(rect);
                        } else {
/* 19 */                    rect.setEmpty();
                        }
/* 24 */                Rect rectM9484b = w90.m9484b(this.f650a);
/* 33 */                iMax = Math.max(0, rectM9484b.left - rect.left);
/* 42 */                iMax2 = Math.max(0, rectM9484b.right - rect.right);
                    } else {
/* 47 */                iMax = 0;
                    }
/* 48 */            boolean z2 = m53.f13568a;
/* 55 */            if (getLayoutDirection() == 1) {
/* 61 */                paddingLeft = getPaddingLeft() + iMax;
/* 66 */                width = ((this.f671o0 + paddingLeft) - iMax) - iMax2;
                    } else {
/* 77 */                width = (getWidth() - getPaddingRight()) - iMax2;
/* 84 */                paddingLeft = (width - this.f671o0) + iMax + iMax2;
                    }
/* 89 */            int gravity = getGravity() & 112;
/* 93 */            if (gravity == 16) {
/* 136 */               int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
/* 138 */               int i5 = this.f672p0;
/* 142 */               int i6 = height2 - (i5 / 2);
/* 143 */               height = i5 + i6;
/* 146 */               paddingTop = i6;
                    } else if (gravity != 80) {
/* 99 */                paddingTop = getPaddingTop();
/* 105 */               height = this.f672p0 + paddingTop;
                    } else {
/* 115 */               height = getHeight() - getPaddingBottom();
/* 119 */               paddingTop = height - this.f672p0;
                    }
/* 147 */           this.f674r0 = paddingLeft;
/* 149 */           this.f675s0 = paddingTop;
/* 151 */           this.f677u0 = height;
/* 153 */           this.f676t0 = width;
                }

                @Override // android.widget.TextView, android.view.View
                public final void onMeasure(int i, int i2) {
                    int intrinsicWidth;
                    int intrinsicHeight;
                    int iMax;
/* 3 */             int intrinsicHeight2 = 0;
/* 4 */             if (this.f662g0) {
/* 6 */                 StaticLayout staticLayout = this.f683y0;
/* 8 */                 TextPaint textPaint = this.f681w0;
/* 10 */                if (staticLayout == null) {
/* 12 */                    CharSequence charSequence = this.f657d0;
/* 40 */                    this.f683y0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                        }
/* 44 */                if (this.f684z0 == null) {
/* 46 */                    CharSequence charSequence2 = this.f661f0;
/* 74 */                    this.f684z0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                        }
                    }
/* 76 */            Drawable drawable = this.f650a;
/* 78 */            Rect rect = this.f646E0;
/* 80 */            if (drawable != null) {
/* 82 */                drawable.getPadding(rect);
/* 96 */                intrinsicWidth = (this.f650a.getIntrinsicWidth() - rect.left) - rect.right;
/* 99 */                intrinsicHeight = this.f650a.getIntrinsicHeight();
                    } else {
/* 104 */               intrinsicWidth = 0;
/* 105 */               intrinsicHeight = 0;
                    }
/* 108 */           if (this.f662g0) {
/* 130 */               iMax = (this.f648V * 2) + Math.max(this.f683y0.getWidth(), this.f684z0.getWidth());
                    } else {
/* 132 */               iMax = 0;
                    }
/* 137 */           this.f673q0 = Math.max(iMax, intrinsicWidth);
/* 139 */           Drawable drawable2 = this.f660f;
/* 141 */           if (drawable2 != null) {
/* 143 */               drawable2.getPadding(rect);
/* 148 */               intrinsicHeight2 = this.f660f.getIntrinsicHeight();
                    } else {
/* 153 */               rect.setEmpty();
                    }
/* 156 */           int iMax2 = rect.left;
/* 158 */           int iMax3 = rect.right;
/* 160 */           Drawable drawable3 = this.f650a;
/* 162 */           if (drawable3 != null) {
/* 164 */               Rect rectM9484b = w90.m9484b(drawable3);
/* 170 */               iMax2 = Math.max(iMax2, rectM9484b.left);
/* 176 */               iMax3 = Math.max(iMax3, rectM9484b.right);
                    }
/* 180 */           boolean z = this.f679v0;
/* 182 */           int iMax4 = this.f649W;
/* 184 */           if (z) {
/* 192 */               iMax4 = Math.max(iMax4, (this.f673q0 * 2) + iMax2 + iMax3);
                    }
/* 196 */           int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
/* 200 */           this.f671o0 = iMax4;
/* 202 */           this.f672p0 = iMax5;
/* 204 */           super.onMeasure(i, i2);
/* 211 */           if (getMeasuredHeight() < iMax5) {
/* 217 */               setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
                    }
                }

                @Override // android.view.View
                public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             super.onPopulateAccessibilityEvent(accessibilityEvent);
/* 13 */            CharSequence charSequence = isChecked() ? this.f655c0 : this.f659e0;
/* 15 */            if (charSequence != null) {
/* 21 */                accessibilityEvent.getText().add(charSequence);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:40:0x008e  */
                /* JADX WARN: Code duplicated, block: B:42:0x0093  */
                /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
                /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
                /* JADX WARN: Code duplicated, block: B:52:0x00be  */
                /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
                /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
                /* JADX WARN: Code duplicated, block: B:64:0x00db  */
                /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
                @Override // android.widget.TextView, android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    boolean z;
                    boolean zIsChecked;
                    boolean targetCheckedState;
                    float xVelocity;
                    float f;
/* 1 */             VelocityTracker velocityTracker = this.f668l0;
/* 3 */             velocityTracker.addMovement(motionEvent);
/* 6 */             int actionMasked = motionEvent.getActionMasked();
/* 10 */            int i = this.f665i0;
/* 13 */            if (actionMasked != 0) {
/* 16 */                float f2 = 0.0f;
/* 18 */                if (actionMasked == 1) {
/* 146 */                   if (this.f663h0 == 2) {
/* 148 */                       this.f663h0 = 0;
/* 154 */                       if (motionEvent.getAction() == 1 || !isEnabled()) {
/* 164 */                           z = false;
                                } else {
/* 162 */                           z = true;
                                }
/* 165 */                       zIsChecked = isChecked();
/* 169 */                       if (z) {
/* 173 */                           velocityTracker.computeCurrentVelocity(1000);
/* 176 */                           xVelocity = velocityTracker.getXVelocity();
/* 189 */                           if (Math.abs(xVelocity) > this.f669m0) {
/* 191 */                               boolean z2 = m53.f13568a;
/* 205 */                               targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                                    } else {
/* 212 */                               targetCheckedState = getTargetCheckedState();
                                    }
                                } else {
/* 217 */                           targetCheckedState = zIsChecked;
                                }
/* 218 */                       if (targetCheckedState != zIsChecked) {
/* 220 */                           playSoundEffect(0);
                                }
/* 223 */                       setChecked(targetCheckedState);
/* 226 */                       MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
/* 230 */                       motionEventObtain.setAction(3);
/* 233 */                       super.onTouchEvent(motionEventObtain);
/* 236 */                       motionEventObtain.recycle();
/* 239 */                       super.onTouchEvent(motionEvent);
/* 12 */                        return true;
                            }
/* 243 */                   this.f663h0 = 0;
/* 245 */                   velocityTracker.clear();
                        } else if (actionMasked == 2) {
/* 26 */                    int i2 = this.f663h0;
/* 28 */                    if (i2 == 1) {
/* 96 */                        float x = motionEvent.getX();
/* 100 */                       float y = motionEvent.getY();
                                float f3 = i;
/* 115 */                       if (Math.abs(x - this.f666j0) > f3 || Math.abs(y - this.f667k0) > f3) {
/* 129 */                           this.f663h0 = 2;
/* 135 */                           getParent().requestDisallowInterceptTouchEvent(true);
/* 138 */                           this.f666j0 = x;
/* 140 */                           this.f667k0 = y;
/* 12 */                            return true;
                                }
                            } else if (i2 == 2) {
/* 34 */                        float x2 = motionEvent.getX();
/* 38 */                        int thumbScrollRange = getThumbScrollRange();
/* 44 */                        float f4 = x2 - this.f666j0;
/* 48 */                        if (thumbScrollRange != 0) {
/* 51 */                            f = f4 / thumbScrollRange;
                                } else {
/* 61 */                            f = f4 > 0.0f ? 1.0f : -1.0f;
                                }
/* 62 */                        boolean z3 = m53.f13568a;
/* 68 */                        if (getLayoutDirection() == 1) {
/* 70 */                            f = -f;
                                }
/* 71 */                        float f5 = this.f670n0;
/* 73 */                        float f6 = f + f5;
/* 76 */                        if (f6 >= 0.0f) {
/* 85 */                            f2 = f6 > 1.0f ? 1.0f : f6;
                                }
/* 88 */                        if (f2 != f5) {
/* 90 */                            this.f666j0 = x2;
/* 92 */                            setThumbPosition(f2);
                                }
/* 12 */                        return true;
                            }
                        } else if (actionMasked == 3) {
/* 146 */                   if (this.f663h0 == 2) {
/* 148 */                       this.f663h0 = 0;
/* 154 */                       if (motionEvent.getAction() == 1) {
/* 164 */                           z = false;
                                } else {
/* 164 */                           z = false;
                                }
/* 165 */                       zIsChecked = isChecked();
/* 169 */                       if (z) {
/* 173 */                           velocityTracker.computeCurrentVelocity(1000);
/* 176 */                           xVelocity = velocityTracker.getXVelocity();
/* 189 */                           if (Math.abs(xVelocity) > this.f669m0) {
/* 191 */                               boolean z4 = m53.f13568a;
/* 205 */                               if (getLayoutDirection() == 1) {
                                        }
                                    } else {
/* 212 */                               targetCheckedState = getTargetCheckedState();
                                    }
                                } else {
/* 217 */                           targetCheckedState = zIsChecked;
                                }
/* 218 */                       if (targetCheckedState != zIsChecked) {
/* 220 */                           playSoundEffect(0);
                                }
/* 223 */                       setChecked(targetCheckedState);
/* 226 */                       MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
/* 230 */                       motionEventObtain2.setAction(3);
/* 233 */                       super.onTouchEvent(motionEventObtain2);
/* 236 */                       motionEventObtain2.recycle();
/* 239 */                       super.onTouchEvent(motionEvent);
/* 12 */                        return true;
                            }
/* 243 */                   this.f663h0 = 0;
/* 245 */                   velocityTracker.clear();
                        }
                    } else {
/* 249 */               float x3 = motionEvent.getX();
/* 253 */               float y2 = motionEvent.getY();
/* 261 */               if (isEnabled() && this.f650a != null) {
/* 268 */                   int thumbOffset = getThumbOffset();
/* 272 */                   Drawable drawable = this.f650a;
/* 274 */                   Rect rect = this.f646E0;
/* 276 */                   drawable.getPadding(rect);
/* 281 */                   int i3 = this.f675s0 - i;
/* 285 */                   int i4 = (this.f674r0 + thumbOffset) - i;
/* 295 */                   int i5 = this.f673q0 + i4 + rect.left + rect.right + i;
/* 298 */                   int i6 = this.f677u0 + i;
/* 302 */                   if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
/* 319 */                       this.f663h0 = 1;
/* 321 */                       this.f666j0 = x3;
/* 323 */                       this.f667k0 = y2;
                            }
                        }
                    }
/* 325 */           return super.onTouchEvent(motionEvent);
                }

                @Override // android.widget.TextView
                public void setAllCaps(boolean z) {
/* 1 */             super.setAllCaps(z);
/* 8 */             getEmojiTextViewHelper().m141c(z);
                }

                @Override // android.widget.CompoundButton, android.widget.Checkable
                public void setChecked(boolean z) {
/* 1 */             super.setChecked(z);
/* 4 */             boolean zIsChecked = isChecked();
/* 14 */            if (zIsChecked) {
/* 18 */                if (Build.VERSION.SDK_INT >= 30) {
/* 20 */                    Object string = this.f655c0;
/* 22 */                    if (string == null) {
/* 30 */                        string = getResources().getString(R$string.abc_capital_on);
                            }
/* 34 */                    Object obj = string;
/* 35 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 45 */                    new o23(R$id.tag_state_description, CharSequence.class, 64, 30, 2).m8129f(this, obj);
                        }
                    } else if (Build.VERSION.SDK_INT >= 30) {
/* 53 */                Object string2 = this.f659e0;
/* 55 */                if (string2 == null) {
/* 63 */                    string2 = getResources().getString(R$string.abc_capital_off);
                        }
/* 67 */                Object obj2 = string2;
/* 68 */                WeakHashMap weakHashMap2 = e33.f7494a;
/* 78 */                new o23(R$id.tag_state_description, CharSequence.class, 64, 30, 2).m8129f(this, obj2);
                    }
/* 88 */            if (getWindowToken() == null || !isLaidOut()) {
/* 129 */               ObjectAnimator objectAnimator = this.f643B0;
/* 131 */               if (objectAnimator != null) {
/* 133 */                   objectAnimator.cancel();
                        }
/* 139 */               setThumbPosition(zIsChecked ? 1.0f : 0.0f);
/* 142 */               return;
                    }
/* 107 */           ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f640F0, zIsChecked ? 1.0f : 0.0f);
/* 111 */           this.f643B0 = objectAnimatorOfFloat;
/* 115 */           objectAnimatorOfFloat.setDuration(250L);
/* 120 */           this.f643B0.setAutoCancel(true);
/* 125 */           this.f643B0.start();
                }

                @Override // android.widget.TextView
                public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
/* 5 */             super.setCustomSelectionActionModeCallback(he3.m4201x(callback, this));
                }

                public void setEmojiCompatEnabled(boolean z) {
/* 5 */             getEmojiTextViewHelper().m142d(z);
/* 10 */            setTextOnInternal(this.f655c0);
/* 15 */            setTextOffInternal(this.f659e0);
/* 18 */            requestLayout();
                }

                public final void setEnforceSwitchWidth(boolean z) {
/* 1 */             this.f679v0 = z;
/* 3 */             invalidate();
                }

                @Override // android.widget.TextView
                public void setFilters(InputFilter[] inputFilterArr) {
/* 9 */             super.setFilters(getEmojiTextViewHelper().m139a(inputFilterArr));
                }

                public void setShowText(boolean z) {
/* 3 */             if (this.f662g0 != z) {
/* 5 */                 this.f662g0 = z;
/* 7 */                 requestLayout();
/* 10 */                if (z) {
/* 12 */                    m394d();
                        }
                    }
                }

                public void setSplitTrack(boolean z) {
/* 1 */             this.f653b0 = z;
/* 3 */             invalidate();
                }

                public void setSwitchMinWidth(int i) {
/* 1 */             this.f649W = i;
/* 3 */             requestLayout();
                }

                public void setSwitchPadding(int i) {
/* 1 */             this.f651a0 = i;
/* 3 */             requestLayout();
                }

                public void setSwitchTypeface(Typeface typeface) {
/* 1 */             TextPaint textPaint = this.f681w0;
/* 7 */             if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
/* 36 */                return;
                    }
/* 27 */            textPaint.setTypeface(typeface);
/* 30 */            requestLayout();
/* 33 */            invalidate();
                }

                public void setTextOff(CharSequence charSequence) {
/* 1 */             setTextOffInternal(charSequence);
/* 4 */             requestLayout();
/* 11 */            if (isChecked() || Build.VERSION.SDK_INT < 30) {
/* 50 */                return;
                    }
/* 19 */            Object string = this.f659e0;
/* 21 */            if (string == null) {
/* 29 */                string = getResources().getString(R$string.abc_capital_off);
                    }
/* 33 */            WeakHashMap weakHashMap = e33.f7494a;
/* 47 */            new o23(R$id.tag_state_description, CharSequence.class, 64, 30, 2).m8129f(this, string);
                }

                public void setTextOn(CharSequence charSequence) {
/* 1 */             setTextOnInternal(charSequence);
/* 4 */             requestLayout();
/* 11 */            if (!isChecked() || Build.VERSION.SDK_INT < 30) {
/* 50 */                return;
                    }
/* 19 */            Object string = this.f655c0;
/* 21 */            if (string == null) {
/* 29 */                string = getResources().getString(R$string.abc_capital_on);
                    }
/* 33 */            WeakHashMap weakHashMap = e33.f7494a;
/* 47 */            new o23(R$id.tag_state_description, CharSequence.class, 64, 30, 2).m8129f(this, string);
                }

                public void setThumbDrawable(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.f650a;
/* 3 */             if (drawable2 != null) {
/* 6 */                 drawable2.setCallback(null);
                    }
/* 9 */             this.f650a = drawable;
/* 11 */            if (drawable != null) {
/* 13 */                drawable.setCallback(this);
                    }
/* 16 */            requestLayout();
                }

                public void setThumbPosition(float f) {
/* 1 */             this.f670n0 = f;
/* 3 */             invalidate();
                }

                public void setThumbResource(int i) {
/* 9 */             setThumbDrawable(mn0.m6700p(getContext(), i));
                }

                public void setThumbTextPadding(int i) {
/* 1 */             this.f648V = i;
/* 3 */             requestLayout();
                }

                public void setThumbTintList(ColorStateList colorStateList) {
/* 1 */             this.f652b = colorStateList;
/* 4 */             this.f656d = true;
/* 6 */             m391a();
                }

                public void setThumbTintMode(PorterDuff.Mode mode) {
/* 1 */             this.f654c = mode;
/* 4 */             this.f658e = true;
/* 6 */             m391a();
                }

                public void setTrackDrawable(Drawable drawable) {
/* 1 */             Drawable drawable2 = this.f660f;
/* 3 */             if (drawable2 != null) {
/* 6 */                 drawable2.setCallback(null);
                    }
/* 9 */             this.f660f = drawable;
/* 11 */            if (drawable != null) {
/* 13 */                drawable.setCallback(this);
                    }
/* 16 */            requestLayout();
                }

                public void setTrackResource(int i) {
/* 9 */             setTrackDrawable(mn0.m6700p(getContext(), i));
                }

                public void setTrackTintList(ColorStateList colorStateList) {
/* 1 */             this.f664i = colorStateList;
/* 4 */             this.f680w = true;
/* 6 */             m392b();
                }

                public void setTrackTintMode(PorterDuff.Mode mode) {
/* 1 */             this.f678v = mode;
/* 4 */             this.f647U = true;
/* 6 */             m392b();
                }

                @Override // android.widget.CompoundButton, android.widget.Checkable
                public final void toggle() {
/* 7 */             setChecked(!isChecked());
                }

                @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
                public final boolean verifyDrawable(Drawable drawable) {
                    return super.verifyDrawable(drawable) || drawable == this.f650a || drawable == this.f660f;
                }

/* 499 */       public SwitchCompat(Context context, AttributeSet attributeSet) {
/* 500 */           this(context, attributeSet, R$attr.switchStyle);
                }
            }
