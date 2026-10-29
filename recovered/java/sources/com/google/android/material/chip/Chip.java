            package com.google.android.material.chip;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.InsetDrawable;
            import android.graphics.drawable.RippleDrawable;
            import android.text.TextPaint;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.view.PointerIcon;
            import android.view.View;
            import android.view.ViewParent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.Checkable;
            import android.widget.CompoundButton;
            import android.widget.TextView;
            import androidx.appcompat.widget.AppCompatCheckBox;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$id;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import io.flutter.Build;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.util.Arrays;
            import java.util.Locale;
            import java.util.WeakHashMap;
            import okhttp3.HttpUrl;
            import p000.AbstractC0208c9;
            import p000.C0021aj;
            import p000.C0864e1;
            import p000.C0893eu;
            import p000.C0930fu;
            import p000.C0967gu;
            import p000.C1004hu;
            import p000.C1951n4;
            import p000.ad1;
            import p000.c52;
            import p000.de3;
            import p000.dn2;
            import p000.dw0;
            import p000.e33;
            import p000.ed2;
            import p000.en2;
            import p000.gn2;
            import p000.hd1;
            import p000.he3;
            import p000.kb1;
            import p000.mk1;
            import p000.mn0;
            import p000.rn2;
            import p000.s23;
            import p000.t90;
            import p000.tc2;
            import p000.v00;
            import p000.zr3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public class Chip extends AppCompatCheckBox implements ed2, Checkable {

                /* JADX INFO: renamed from: l0 */
                public static final int f4576l0 = R$style.Widget_MaterialComponents_Chip_Action;

                /* JADX INFO: renamed from: m0 */
                public static final Rect f4577m0 = new Rect();

                /* JADX INFO: renamed from: n0 */
                public static final int[] f4578n0 = {R.attr.state_selected};

                /* JADX INFO: renamed from: o0 */
                public static final int[] f4579o0 = {R.attr.state_checkable};

                /* JADX INFO: renamed from: U */
                public ad1 f4580U;

                /* JADX INFO: renamed from: V */
                public boolean f4581V;

                /* JADX INFO: renamed from: W */
                public boolean f4582W;

                /* JADX INFO: renamed from: a0 */
                public boolean f4583a0;

                /* JADX INFO: renamed from: b0 */
                public boolean f4584b0;

                /* JADX INFO: renamed from: c0 */
                public boolean f4585c0;

                /* JADX INFO: renamed from: d0 */
                public int f4586d0;

                /* JADX INFO: renamed from: e */
                public C1004hu f4587e;

                /* JADX INFO: renamed from: e0 */
                public int f4588e0;

                /* JADX INFO: renamed from: f */
                public InsetDrawable f4589f;

                /* JADX INFO: renamed from: f0 */
                public CharSequence f4590f0;

                /* JADX INFO: renamed from: g0 */
                public final C0967gu f4591g0;

                /* JADX INFO: renamed from: h0 */
                public boolean f4592h0;

                /* JADX INFO: renamed from: i */
                public RippleDrawable f4593i;

                /* JADX INFO: renamed from: i0 */
                public final Rect f4594i0;

                /* JADX INFO: renamed from: j0 */
                public final RectF f4595j0;

                /* JADX INFO: renamed from: k0 */
                public final C0893eu f4596k0;

                /* JADX INFO: renamed from: v */
                public View.OnClickListener f4597v;

                /* JADX INFO: renamed from: w */
                public CompoundButton.OnCheckedChangeListener f4598w;

                /* JADX WARN: Illegal instructions before constructor call */
                public Chip(Context context, AttributeSet attributeSet, int i) {
                    int resourceId;
/* 1 */             int i2 = f4576l0;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 15 */            this.f4594i0 = new Rect();
/* 22 */            this.f4595j0 = new RectF();
/* 30 */            this.f4596k0 = new C0893eu(this, 0);
/* 32 */            Context context2 = getContext();
/* 36 */            dn2 dn2Var = null;
/* 41 */            if (attributeSet != null) {
/* 54 */                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
/* 58 */                    AbstractC1245n0.m4889q("Chip", "Do not set the background; Chip manages its own background drawable.");
                        }
/* 67 */                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
/* 909 */                   C1951n4.m6866q("Please set left drawable using R.attr#chipIcon.");
/* 912 */                   throw null;
                        }
/* 75 */                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
/* 903 */                   C1951n4.m6866q("Please set start drawable using R.attr#chipIcon.");
/* 906 */                   throw null;
                        }
/* 85 */                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
/* 897 */                   C1951n4.m6866q("Please set end drawable using R.attr#closeIcon.");
/* 900 */                   throw null;
                        }
/* 93 */                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
/* 893 */                   C1951n4.m6866q("Please set end drawable using R.attr#closeIcon.");
/* 896 */                   throw null;
                        }
/* 101 */               if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
/* 889 */                   C1951n4.m6866q("Chip does not support multi-line text");
/* 892 */                   throw null;
                        }
/* 133 */               if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
/* 137 */                   AbstractC1245n0.m4889q("Chip", "Chip text must be vertically center and start aligned");
                        }
                    }
/* 142 */           C1004hu c1004hu = new C1004hu(context2, attributeSet, i);
/* 153 */           TypedArray typedArrayM8213d = rn2.m8213d(c1004hu.f9248P0, attributeSet, R$styleable.Chip, i, i2, new int[0]);
/* 163 */           c1004hu.f9282p1 = typedArrayM8213d.hasValue(R$styleable.Chip_shapeAppearance);
/* 165 */           int i3 = R$styleable.Chip_chipSurfaceColor;
/* 167 */           Context context3 = c1004hu.f9248P0;
/* 169 */           ColorStateList colorStateListM3033o = de3.m3033o(context3, typedArrayM8213d, i3);
/* 175 */           if (c1004hu.f9267i0 != colorStateListM3033o) {
/* 177 */               c1004hu.f9267i0 = colorStateListM3033o;
/* 183 */               c1004hu.onStateChange(c1004hu.getState());
                    }
/* 188 */           ColorStateList colorStateListM3033o2 = de3.m3033o(context3, typedArrayM8213d, R$styleable.Chip_chipBackgroundColor);
/* 194 */           if (c1004hu.f9269j0 != colorStateListM3033o2) {
/* 196 */               c1004hu.f9269j0 = colorStateListM3033o2;
/* 202 */               c1004hu.onStateChange(c1004hu.getState());
                    }
/* 208 */           float dimension = typedArrayM8213d.getDimension(R$styleable.Chip_chipMinHeight, 0.0f);
/* 216 */           if (c1004hu.f9271k0 != dimension) {
/* 218 */               c1004hu.f9271k0 = dimension;
/* 220 */               c1004hu.invalidateSelf();
/* 223 */               c1004hu.m4277D();
                    }
/* 232 */           if (typedArrayM8213d.hasValue(R$styleable.Chip_chipCornerRadius)) {
/* 240 */               c1004hu.m4283J(typedArrayM8213d.getDimension(R$styleable.Chip_chipCornerRadius, 0.0f));
                    }
/* 249 */           c1004hu.m4288O(de3.m3033o(context3, typedArrayM8213d, R$styleable.Chip_chipStrokeColor));
/* 258 */           c1004hu.m4289P(typedArrayM8213d.getDimension(R$styleable.Chip_chipStrokeWidth, 0.0f));
/* 267 */           c1004hu.m4298Y(de3.m3033o(context3, typedArrayM8213d, R$styleable.Chip_rippleColor));
/* 272 */           CharSequence text = typedArrayM8213d.getText(R$styleable.Chip_android_text);
/* 278 */           text = text == null ? HttpUrl.FRAGMENT_ENCODE_SET : text;
/* 282 */           boolean zEquals = TextUtils.equals(c1004hu.f9281p0, text);
/* 286 */           gn2 gn2Var = c1004hu.f9254V0;
/* 288 */           if (!zEquals) {
/* 290 */               c1004hu.f9281p0 = text;
/* 292 */               gn2Var.f8750d = true;
/* 294 */               c1004hu.invalidateSelf();
/* 297 */               c1004hu.m4277D();
                    }
/* 300 */           int i4 = R$styleable.Chip_android_textAppearance;
/* 306 */           if (typedArrayM8213d.hasValue(i4) && (resourceId = typedArrayM8213d.getResourceId(i4, 0)) != 0) {
/* 316 */               dn2Var = new dn2(context3, resourceId);
                    }
/* 327 */           dn2Var.f7347k = typedArrayM8213d.getDimension(R$styleable.Chip_android_textSize, dn2Var.f7347k);
/* 329 */           gn2Var.m3978b(dn2Var, context3);
/* 334 */           int i5 = typedArrayM8213d.getInt(R$styleable.Chip_android_ellipsize, 0);
/* 338 */           int i6 = 2;
/* 339 */           if (i5 == 1) {
/* 359 */               c1004hu.f9276m1 = TextUtils.TruncateAt.START;
                    } else if (i5 == 2) {
/* 354 */               c1004hu.f9276m1 = TextUtils.TruncateAt.MIDDLE;
                    } else if (i5 == 3) {
/* 349 */               c1004hu.f9276m1 = TextUtils.TruncateAt.END;
                    }
/* 367 */           c1004hu.m4287N(typedArrayM8213d.getBoolean(R$styleable.Chip_chipIconVisible, false));
/* 372 */           if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
/* 396 */               c1004hu.m4287N(typedArrayM8213d.getBoolean(R$styleable.Chip_chipIconEnabled, false));
                    }
/* 405 */           c1004hu.m4284K(de3.m3035q(context3, typedArrayM8213d, R$styleable.Chip_chipIcon));
/* 414 */           if (typedArrayM8213d.hasValue(R$styleable.Chip_chipIconTint)) {
/* 422 */               c1004hu.m4286M(de3.m3033o(context3, typedArrayM8213d, R$styleable.Chip_chipIconTint));
                    }
/* 433 */           c1004hu.m4285L(typedArrayM8213d.getDimension(R$styleable.Chip_chipIconSize, -1.0f));
/* 442 */           c1004hu.m4295V(typedArrayM8213d.getBoolean(R$styleable.Chip_closeIconVisible, false));
/* 445 */           if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
/* 469 */               c1004hu.m4295V(typedArrayM8213d.getBoolean(R$styleable.Chip_closeIconEnabled, false));
                    }
/* 478 */           c1004hu.m4290Q(de3.m3035q(context3, typedArrayM8213d, R$styleable.Chip_closeIcon));
/* 487 */           c1004hu.m4294U(de3.m3033o(context3, typedArrayM8213d, R$styleable.Chip_closeIconTint));
/* 496 */           c1004hu.m4292S(typedArrayM8213d.getDimension(R$styleable.Chip_closeIconSize, 0.0f));
/* 505 */           c1004hu.m4279F(typedArrayM8213d.getBoolean(R$styleable.Chip_android_checkable, false));
/* 514 */           c1004hu.m4282I(typedArrayM8213d.getBoolean(R$styleable.Chip_checkedIconVisible, false));
/* 517 */           if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
/* 541 */               c1004hu.m4282I(typedArrayM8213d.getBoolean(R$styleable.Chip_checkedIconEnabled, false));
                    }
/* 550 */           c1004hu.m4280G(de3.m3035q(context3, typedArrayM8213d, R$styleable.Chip_checkedIcon));
/* 559 */           if (typedArrayM8213d.hasValue(R$styleable.Chip_checkedIconTint)) {
/* 567 */               c1004hu.m4281H(de3.m3033o(context3, typedArrayM8213d, R$styleable.Chip_checkedIconTint));
                    }
/* 576 */           c1004hu.f9238F0 = mk1.m6667a(context3, typedArrayM8213d, R$styleable.Chip_showMotionSpec);
/* 584 */           c1004hu.f9239G0 = mk1.m6667a(context3, typedArrayM8213d, R$styleable.Chip_hideMotionSpec);
/* 588 */           float dimension2 = typedArrayM8213d.getDimension(R$styleable.Chip_chipStartPadding, 0.0f);
/* 596 */           if (c1004hu.f9240H0 != dimension2) {
/* 598 */               c1004hu.f9240H0 = dimension2;
/* 600 */               c1004hu.invalidateSelf();
/* 603 */               c1004hu.m4277D();
                    }
/* 612 */           c1004hu.m4297X(typedArrayM8213d.getDimension(R$styleable.Chip_iconStartPadding, 0.0f));
/* 621 */           c1004hu.m4296W(typedArrayM8213d.getDimension(R$styleable.Chip_iconEndPadding, 0.0f));
/* 626 */           float dimension3 = typedArrayM8213d.getDimension(R$styleable.Chip_textStartPadding, 0.0f);
/* 634 */           if (c1004hu.f9243K0 != dimension3) {
/* 636 */               c1004hu.f9243K0 = dimension3;
/* 638 */               c1004hu.invalidateSelf();
/* 641 */               c1004hu.m4277D();
                    }
/* 646 */           float dimension4 = typedArrayM8213d.getDimension(R$styleable.Chip_textEndPadding, 0.0f);
/* 654 */           if (c1004hu.f9244L0 != dimension4) {
/* 656 */               c1004hu.f9244L0 = dimension4;
/* 658 */               c1004hu.invalidateSelf();
/* 661 */               c1004hu.m4277D();
                    }
/* 670 */           c1004hu.m4293T(typedArrayM8213d.getDimension(R$styleable.Chip_closeIconStartPadding, 0.0f));
/* 679 */           c1004hu.m4291R(typedArrayM8213d.getDimension(R$styleable.Chip_closeIconEndPadding, 0.0f));
/* 684 */           float dimension5 = typedArrayM8213d.getDimension(R$styleable.Chip_chipEndPadding, 0.0f);
/* 692 */           if (c1004hu.f9247O0 != dimension5) {
/* 694 */               c1004hu.f9247O0 = dimension5;
/* 696 */               c1004hu.invalidateSelf();
/* 699 */               c1004hu.m4277D();
                    }
/* 711 */           c1004hu.f9280o1 = typedArrayM8213d.getDimensionPixelSize(R$styleable.Chip_android_maxWidth, AbstractC0208c9.API_PRIORITY_OTHER);
/* 713 */           typedArrayM8213d.recycle();
/* 716 */           int[] iArr = R$styleable.Chip;
/* 720 */           rn2.m8210a(context2, attributeSet, i, i2);
/* 724 */           rn2.m8211b(context2, attributeSet, iArr, i, i2, new int[0]);
/* 727 */           TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
/* 737 */           this.f4585c0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Chip_ensureMinTouchTargetSize, false);
/* 767 */           this.f4588e0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(R$styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil(kb1.m6028A(getContext(), 48))));
/* 769 */           typedArrayObtainStyledAttributes.recycle();
/* 772 */           setChipDrawable(c1004hu);
/* 775 */           WeakHashMap weakHashMap = e33.f7494a;
/* 781 */           c1004hu.m3741m(s23.m8371i(this));
/* 784 */           int[] iArr2 = R$styleable.Chip;
/* 788 */           rn2.m8210a(context2, attributeSet, i, i2);
/* 791 */           rn2.m8211b(context2, attributeSet, iArr2, i, i2, new int[0]);
/* 794 */           TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i, i2);
/* 800 */           boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(R$styleable.Chip_shapeAppearance);
/* 804 */           typedArrayObtainStyledAttributes2.recycle();
/* 812 */           this.f4591g0 = new C0967gu(this, this);
/* 814 */           m2282e();
/* 817 */           if (!zHasValue) {
/* 824 */               setOutlineProvider(new dw0(this, i6));
                    }
/* 829 */           setChecked(this.f4581V);
/* 834 */           setText(c1004hu.f9281p0);
/* 839 */           setEllipsize(c1004hu.f9276m1);
/* 842 */           m2285h();
/* 849 */           if (!this.f4587e.f9278n1) {
/* 851 */               setLines(1);
/* 854 */               setHorizontallyScrolling(true);
                    }
/* 857 */           setGravity(8388627);
/* 860 */           m2284g();
/* 865 */           if (this.f4585c0) {
/* 869 */               setMinHeight(this.f4588e0);
                    }
/* 876 */           this.f4586d0 = getLayoutDirection();
/* 883 */           super.setOnCheckedChangeListener(new C0930fu(this));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public RectF getCloseIconTouchBounds() {
/* 1 */             RectF rectF = this.f4595j0;
/* 3 */             rectF.setEmpty();
/* 10 */            if (m2281d() && this.f4597v != null) {
/* 16 */                C1004hu c1004hu = this.f4587e;
/* 18 */                Rect bounds = c1004hu.getBounds();
/* 22 */                rectF.setEmpty();
/* 29 */                if (c1004hu.m4301b0()) {
/* 44 */                    float f = c1004hu.f9247O0 + c1004hu.f9246N0 + c1004hu.f9292z0 + c1004hu.f9245M0 + c1004hu.f9244L0;
/* 49 */                    if (t90.m8738a(c1004hu) == 0) {
/* 51 */                        float f2 = bounds.right;
/* 54 */                        rectF.right = f2;
/* 57 */                        rectF.left = f2 - f;
                            } else {
/* 60 */                        float f3 = bounds.left;
/* 63 */                        rectF.left = f3;
/* 66 */                        rectF.right = f3 + f;
                            }
/* 71 */                    rectF.top = bounds.top;
/* 76 */                    rectF.bottom = bounds.bottom;
                        }
                    }
/* 78 */            return rectF;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public Rect getCloseIconTouchBoundsInt() {
/* 1 */             RectF closeIconTouchBounds = getCloseIconTouchBounds();
/* 7 */             int i = (int) closeIconTouchBounds.left;
/* 10 */            int i2 = (int) closeIconTouchBounds.top;
/* 13 */            int i3 = (int) closeIconTouchBounds.right;
/* 16 */            int i4 = (int) closeIconTouchBounds.bottom;
/* 17 */            Rect rect = this.f4594i0;
/* 19 */            rect.set(i, i2, i3, i4);
/* 22 */            return rect;
                }

                private dn2 getTextAppearance() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 7 */                 return c1004hu.f9254V0.f8752f;
                    }
/* 10 */            return null;
                }

                private void setCloseIconHovered(boolean z) {
/* 3 */             if (this.f4583a0 != z) {
/* 5 */                 this.f4583a0 = z;
/* 7 */                 refreshDrawableState();
                    }
                }

                private void setCloseIconPressed(boolean z) {
/* 3 */             if (this.f4582W != z) {
/* 5 */                 this.f4582W = z;
/* 7 */                 refreshDrawableState();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m2280c(int i) {
/* 1 */             this.f4588e0 = i;
/* 7 */             if (!this.f4585c0) {
/* 9 */                 InsetDrawable insetDrawable = this.f4589f;
/* 11 */                if (insetDrawable == null) {
/* 34 */                    int[] iArr = c52.f2721a;
/* 36 */                    m2283f();
/* 39 */                    return;
                        } else {
/* 13 */                    if (insetDrawable != null) {
/* 15 */                        this.f4589f = null;
/* 17 */                        setMinWidth(0);
/* 25 */                        setMinHeight((int) getChipMinHeight());
/* 28 */                        int[] iArr2 = c52.f2721a;
/* 30 */                        m2283f();
/* 33 */                        return;
                            }
/* 91 */                    return;
                        }
                    }
/* 47 */            int iMax = Math.max(0, i - ((int) this.f4587e.f9271k0));
/* 59 */            int iMax2 = Math.max(0, i - this.f4587e.getIntrinsicWidth());
/* 63 */            if (iMax2 <= 0 && iMax <= 0) {
/* 67 */                InsetDrawable insetDrawable2 = this.f4589f;
/* 69 */                if (insetDrawable2 == null) {
/* 92 */                    int[] iArr3 = c52.f2721a;
/* 94 */                    m2283f();
/* 97 */                    return;
                        } else {
/* 71 */                    if (insetDrawable2 != null) {
/* 73 */                        this.f4589f = null;
/* 75 */                        setMinWidth(0);
/* 83 */                        setMinHeight((int) getChipMinHeight());
/* 86 */                        int[] iArr4 = c52.f2721a;
/* 88 */                        m2283f();
/* 91 */                        return;
                            }
/* 91 */                    return;
                        }
                    }
/* 104 */           int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
/* 107 */           int i3 = iMax > 0 ? iMax / 2 : 0;
/* 112 */           if (this.f4589f != null) {
/* 116 */               Rect rect = new Rect();
/* 121 */               this.f4589f.getPadding(rect);
/* 126 */               if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
/* 140 */                   int[] iArr5 = c52.f2721a;
/* 142 */                   m2283f();
/* 145 */                   return;
                        }
                    }
/* 150 */           if (getMinHeight() != i) {
/* 152 */               setMinHeight(i);
                    }
/* 159 */           if (getMinWidth() != i) {
/* 161 */               setMinWidth(i);
                    }
/* 173 */           this.f4589f = new InsetDrawable((Drawable) this.f4587e, i2, i3, i2, i3);
/* 175 */           int[] iArr6 = c52.f2721a;
/* 177 */           m2283f();
                }

                /* JADX INFO: renamed from: d */
                public final boolean m2281d() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu == null) {
/* 15 */                return false;
                    }
/* 5 */             Drawable drawable = c1004hu.f9289w0;
/* 7 */             if (drawable == null) {
/* 10 */                drawable = null;
                    }
                    return drawable != null;
                }

                @Override // android.view.View
                public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
/* 3 */             if (this.f4592h0) {
                        return this.f4591g0.m8494m(motionEvent) || super.dispatchHoverEvent(motionEvent);
                    }
/* 5 */             return super.dispatchHoverEvent(motionEvent);
                }

                /* JADX WARN: Code duplicated, block: B:31:0x0057  */
                /* JADX WARN: Code duplicated, block: B:37:0x0067  */
                @Override // android.view.View
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                    int i;
/* 3 */             if (!this.f4592h0) {
/* 5 */                 return super.dispatchKeyEvent(keyEvent);
                    }
/* 10 */            C0967gu c0967gu = this.f4591g0;
/* 12 */            c0967gu.getClass();
/* 22 */            boolean zM8496q = false;
/* 22 */            int i2 = 0;
/* 22 */            zM8496q = false;
/* 22 */            zM8496q = false;
/* 22 */            zM8496q = false;
/* 22 */            zM8496q = false;
/* 22 */            zM8496q = false;
/* 23 */            if (keyEvent.getAction() != 1) {
/* 25 */                int keyCode = keyEvent.getKeyCode();
/* 32 */                if (keyCode != 61) {
/* 34 */                    int i3 = 66;
/* 36 */                    if (keyCode != 66) {
                                switch (keyCode) {
                                    case 19:
                                    case 20:
                                    case Build.API_LEVELS.API_21 /* 21 */:
                                    case Build.API_LEVELS.API_22 /* 22 */:
/* 46 */                                if (keyEvent.hasNoModifiers()) {
/* 50 */                                    if (keyCode == 19) {
/* 66 */                                        i3 = 33;
                                            } else if (keyCode == 21) {
/* 63 */                                        i3 = 17;
                                            } else if (keyCode != 22) {
/* 60 */                                        i3 = 130;
                                            }
/* 72 */                                    int repeatCount = keyEvent.getRepeatCount() + 1;
/* 73 */                                    boolean z = false;
/* 74 */                                    while (i2 < repeatCount && c0967gu.m8496q(i3, null)) {
/* 82 */                                        i2++;
/* 84 */                                        z = true;
                                            }
/* 86 */                                    zM8496q = z;
                                        }
                                        break;
                                    case Build.API_LEVELS.API_23 /* 23 */:
/* 92 */                                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
/* 100 */                                   i = c0967gu.f16570l;
/* 102 */                                   if (i != Integer.MIN_VALUE) {
/* 106 */                                       c0967gu.mo2377s(i, 16, null);
                                            }
/* 109 */                                   zM8496q = true;
                                        }
                                        break;
                                }
                            } else if (keyEvent.hasNoModifiers()) {
/* 100 */                       i = c0967gu.f16570l;
/* 102 */                       if (i != Integer.MIN_VALUE) {
/* 106 */                           c0967gu.mo2377s(i, 16, null);
                                }
/* 109 */                       zM8496q = true;
                            }
                        } else if (keyEvent.hasNoModifiers()) {
/* 118 */                   zM8496q = c0967gu.m8496q(2, null);
                        } else if (keyEvent.hasModifiers(1)) {
/* 129 */                   zM8496q = c0967gu.m8496q(1, null);
                        }
                    }
/* 133 */           if (!zM8496q || c0967gu.f16570l == Integer.MIN_VALUE) {
/* 140 */               return super.dispatchKeyEvent(keyEvent);
                    }
/* 21 */            return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
                @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
                public final void drawableStateChanged() {
                    int i;
                    int i2;
/* 1 */             super.drawableStateChanged();
/* 4 */             C1004hu c1004hu = this.f4587e;
/* 6 */             boolean zM4278E = false;
/* 7 */             if (c1004hu != null && C1004hu.m4274C(c1004hu.f9289w0)) {
/* 17 */                C1004hu c1004hu2 = this.f4587e;
/* 19 */                ?? IsEnabled = isEnabled();
/* 25 */                if (this.f4584b0) {
                            i = IsEnabled;
/* 27 */                    i = IsEnabled + 1;
                        }
                        i = IsEnabled;
                        int i3 = i;
/* 31 */                if (this.f4583a0) {
/* 33 */                    i3 = i + 1;
                        }
                        int i4 = i3;
/* 37 */                if (this.f4582W) {
/* 39 */                    i4 = i3 + 1;
                        }
                        int i5 = i4;
/* 45 */                if (isChecked()) {
/* 47 */                    i5 = i4 + 1;
                        }
/* 49 */                int[] iArr = new int[i5];
/* 55 */                if (isEnabled()) {
/* 60 */                    iArr[0] = 16842910;
/* 62 */                    i2 = 1;
                        } else {
/* 64 */                    i2 = 0;
                        }
/* 67 */                if (this.f4584b0) {
/* 72 */                    iArr[i2] = 16842908;
/* 74 */                    i2++;
                        }
/* 78 */                if (this.f4583a0) {
/* 83 */                    iArr[i2] = 16843623;
/* 85 */                    i2++;
                        }
/* 89 */                if (this.f4582W) {
/* 94 */                    iArr[i2] = 16842919;
/* 96 */                    i2++;
                        }
/* 102 */               if (isChecked()) {
/* 107 */                   iArr[i2] = 16842913;
                        }
/* 115 */               if (!Arrays.equals(c1004hu2.f9270j1, iArr)) {
/* 117 */                   c1004hu2.f9270j1 = iArr;
/* 123 */                   if (c1004hu2.m4301b0()) {
/* 129 */                       zM4278E = c1004hu2.m4278E(c1004hu2.getState(), iArr);
                            }
                        }
                    }
/* 133 */           if (zM4278E) {
/* 135 */               invalidate();
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m2282e() {
                    C1004hu c1004hu;
/* 5 */             if (!m2281d() || (c1004hu = this.f4587e) == null || !c1004hu.f9288v0 || this.f4597v == null) {
/* 29 */                e33.m3318n(this, null);
/* 33 */                this.f4592h0 = false;
                    } else {
/* 21 */                e33.m3318n(this, this.f4591g0);
/* 25 */                this.f4592h0 = true;
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m2283f() {
/* 19 */            this.f4593i = new RippleDrawable(c52.m1535b(this.f4587e.f9279o0), getBackgroundDrawable(), null);
/* 23 */            this.f4587e.getClass();
/* 26 */            RippleDrawable rippleDrawable = this.f4593i;
/* 28 */            WeakHashMap weakHashMap = e33.f7494a;
/* 30 */            setBackground(rippleDrawable);
/* 33 */            m2284g();
                }

                /* JADX INFO: renamed from: g */
                public final void m2284g() {
                    C1004hu c1004hu;
/* 9 */             if (TextUtils.isEmpty(getText()) || (c1004hu = this.f4587e) == null) {
/* 73 */                return;
                    }
/* 26 */            int iM4305z = (int) (c1004hu.m4305z() + c1004hu.f9247O0 + c1004hu.f9244L0);
/* 27 */            C1004hu c1004hu2 = this.f4587e;
/* 39 */            int iM4304y = (int) (c1004hu2.m4304y() + c1004hu2.f9240H0 + c1004hu2.f9243K0);
/* 42 */            if (this.f4589f != null) {
/* 46 */                Rect rect = new Rect();
/* 51 */                this.f4589f.getPadding(rect);
/* 56 */                iM4304y += rect.left;
/* 59 */                iM4305z += rect.right;
                    }
/* 60 */            int paddingTop = getPaddingTop();
/* 64 */            int paddingBottom = getPaddingBottom();
/* 68 */            WeakHashMap weakHashMap = e33.f7494a;
/* 70 */            setPaddingRelative(iM4304y, paddingTop, iM4305z, paddingBottom);
                }

                @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
                public CharSequence getAccessibilityClassName() {
/* 7 */             if (!TextUtils.isEmpty(this.f4590f0)) {
/* 9 */                 return this.f4590f0;
                    }
/* 12 */            C1004hu c1004hu = this.f4587e;
/* 14 */            if (c1004hu == null || !c1004hu.f9234B0) {
                        return isClickable() ? "android.widget.Button" : "android.view.View";
                    }
/* 20 */            ViewParent parent = getParent();
                    return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f4604v.f18348a) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
                }

                public Drawable getBackgroundDrawable() {
/* 1 */             InsetDrawable insetDrawable = this.f4589f;
                    return insetDrawable == null ? this.f4587e : insetDrawable;
                }

                public Drawable getCheckedIcon() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9236D0;
                    }
/* 8 */             return null;
                }

                public ColorStateList getCheckedIconTint() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9237E0;
                    }
/* 8 */             return null;
                }

                public ColorStateList getChipBackgroundColor() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9269j0;
                    }
/* 8 */             return null;
                }

                public float getChipCornerRadius() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 4 */             if (c1004hu != null) {
/* 10 */                return Math.max(0.0f, c1004hu.m4276A());
                    }
/* 3 */             return 0.0f;
                }

                public Drawable getChipDrawable() {
/* 1 */             return this.f4587e;
                }

                public float getChipEndPadding() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9247O0;
                    }
/* 8 */             return 0.0f;
                }

                public Drawable getChipIcon() {
                    Drawable drawable;
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 4 */             if (c1004hu == null || (drawable = c1004hu.f9284r0) == null) {
/* 3 */                 return null;
                    }
/* 10 */            return drawable;
                }

                public float getChipIconSize() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9286t0;
                    }
/* 8 */             return 0.0f;
                }

                public ColorStateList getChipIconTint() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9285s0;
                    }
/* 8 */             return null;
                }

                public float getChipMinHeight() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9271k0;
                    }
/* 8 */             return 0.0f;
                }

                public float getChipStartPadding() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9240H0;
                    }
/* 8 */             return 0.0f;
                }

                public ColorStateList getChipStrokeColor() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9275m0;
                    }
/* 8 */             return null;
                }

                public float getChipStrokeWidth() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9277n0;
                    }
/* 8 */             return 0.0f;
                }

                @Deprecated
                public CharSequence getChipText() {
/* 1 */             return getText();
                }

                public Drawable getCloseIcon() {
                    Drawable drawable;
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 4 */             if (c1004hu == null || (drawable = c1004hu.f9289w0) == null) {
/* 3 */                 return null;
                    }
/* 10 */            return drawable;
                }

                public CharSequence getCloseIconContentDescription() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9233A0;
                    }
/* 8 */             return null;
                }

                public float getCloseIconEndPadding() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9246N0;
                    }
/* 8 */             return 0.0f;
                }

                public float getCloseIconSize() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9292z0;
                    }
/* 8 */             return 0.0f;
                }

                public float getCloseIconStartPadding() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9245M0;
                    }
/* 8 */             return 0.0f;
                }

                public ColorStateList getCloseIconTint() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9291y0;
                    }
/* 8 */             return null;
                }

                @Override // android.widget.TextView
                public TextUtils.TruncateAt getEllipsize() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9276m1;
                    }
/* 8 */             return null;
                }

                @Override // android.widget.TextView, android.view.View
                public final void getFocusedRect(Rect rect) {
/* 3 */             if (this.f4592h0) {
/* 5 */                 C0967gu c0967gu = this.f4591g0;
/* 10 */                if (c0967gu.f16570l == 1 || c0967gu.f16569k == 1) {
/* 20 */                    rect.set(getCloseIconTouchBoundsInt());
/* 23 */                    return;
                        }
                    }
/* 24 */            super.getFocusedRect(rect);
                }

                public mk1 getHideMotionSpec() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9239G0;
                    }
/* 8 */             return null;
                }

                public float getIconEndPadding() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9242J0;
                    }
/* 8 */             return 0.0f;
                }

                public float getIconStartPadding() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9241I0;
                    }
/* 8 */             return 0.0f;
                }

                public ColorStateList getRippleColor() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9279o0;
                    }
/* 8 */             return null;
                }

                public tc2 getShapeAppearanceModel() {
/* 5 */             return this.f4587e.f8151a.f7635a;
                }

                public mk1 getShowMotionSpec() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9238F0;
                    }
/* 8 */             return null;
                }

                public float getTextEndPadding() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9244L0;
                    }
/* 8 */             return 0.0f;
                }

                public float getTextStartPadding() {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 return c1004hu.f9243K0;
                    }
/* 8 */             return 0.0f;
                }

                /* JADX INFO: renamed from: h */
                public final void m2285h() {
/* 1 */             TextPaint paint = getPaint();
/* 5 */             C1004hu c1004hu = this.f4587e;
/* 7 */             if (c1004hu != null) {
/* 13 */                paint.drawableState = c1004hu.getState();
                    }
/* 15 */            dn2 textAppearance = getTextAppearance();
/* 19 */            if (textAppearance != null) {
/* 27 */                textAppearance.m3162e(getContext(), paint, this.f4596k0);
                    }
                }

                @Override // android.widget.TextView, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             he3.m4195r(this, this.f4587e);
                }

                @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
                public final int[] onCreateDrawableState(int i) {
/* 3 */             int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
/* 11 */            if (isChecked()) {
/* 15 */                View.mergeDrawableStates(iArrOnCreateDrawableState, f4578n0);
                    }
/* 18 */            C1004hu c1004hu = this.f4587e;
/* 20 */            if (c1004hu != null && c1004hu.f9234B0) {
/* 28 */                View.mergeDrawableStates(iArrOnCreateDrawableState, f4579o0);
                    }
/* 31 */            return iArrOnCreateDrawableState;
                }

                @Override // android.widget.TextView, android.view.View
                public final void onFocusChanged(boolean z, int i, Rect rect) {
/* 1 */             super.onFocusChanged(z, i, rect);
/* 6 */             if (this.f4592h0) {
/* 8 */                 C0967gu c0967gu = this.f4591g0;
/* 10 */                int i2 = c0967gu.f16570l;
/* 14 */                if (i2 != Integer.MIN_VALUE) {
/* 16 */                    c0967gu.m8491j(i2);
                        }
/* 19 */                if (z) {
/* 21 */                    c0967gu.m8496q(i, rect);
                        }
                    }
                }

                @Override // android.view.View
                public final boolean onHoverEvent(MotionEvent motionEvent) {
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 6 */             if (actionMasked == 7) {
/* 34 */                setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
                    } else if (actionMasked == 10) {
/* 14 */                setCloseIconHovered(false);
                    }
/* 37 */            return super.onHoverEvent(motionEvent);
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                    int i;
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 8 */             accessibilityNodeInfo.setClassName(getAccessibilityClassName());
/* 11 */            C1004hu c1004hu = this.f4587e;
/* 13 */            int i2 = 0;
/* 24 */            accessibilityNodeInfo.setCheckable(c1004hu != null && c1004hu.f9234B0);
/* 31 */            accessibilityNodeInfo.setClickable(isClickable());
/* 40 */            if (getParent() instanceof ChipGroup) {
/* 46 */                ChipGroup chipGroup = (ChipGroup) getParent();
/* 51 */                if (!chipGroup.f4787c) {
/* 82 */                    i = -1;
                            break;
                        }
/* 53 */                i = 0;
                        while (true) {
/* 58 */                    if (i2 >= chipGroup.getChildCount()) {
/* 82 */                        i = -1;
                                break;
                            }
/* 66 */                    if (chipGroup.getChildAt(i2) instanceof Chip) {
/* 74 */                        if (((Chip) chipGroup.getChildAt(i2)) == this) {
                                    break;
                                } else {
/* 77 */                            i++;
                                }
                            }
/* 79 */                    i2++;
                        }
/* 85 */                Object tag = getTag(R$id.row_index_key);
/* 112 */               accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0864e1.m3291a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, isChecked()).f7471a);
                    }
                }

                @Override // android.widget.Button, android.widget.TextView, android.view.View
                public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
/* 17 */            if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
/* 31 */                return PointerIcon.getSystemIcon(getContext(), 1002);
                    }
/* 36 */            return null;
                }

                @Override // android.widget.TextView, android.view.View
                public final void onRtlPropertiesChanged(int i) {
/* 1 */             super.onRtlPropertiesChanged(i);
/* 6 */             if (this.f4586d0 != i) {
/* 8 */                 this.f4586d0 = i;
/* 10 */                m2284g();
                    }
                }

                @Override // android.widget.TextView, android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    boolean z;
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 17 */            boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
/* 23 */            if (actionMasked != 0) {
/* 25 */                if (actionMasked != 1) {
/* 28 */                    if (actionMasked != 2) {
/* 31 */                        if (actionMasked != 3) {
                                }
                            } else if (this.f4582W) {
/* 38 */                        if (!zContains) {
/* 40 */                            setCloseIconPressed(false);
                                }
/* 43 */                        z = true;
                            }
/* 81 */                    z = false;
                        } else {
/* 47 */                    if (this.f4582W) {
/* 49 */                        playSoundEffect(0);
/* 52 */                        View.OnClickListener onClickListener = this.f4597v;
/* 54 */                        if (onClickListener != null) {
/* 56 */                            onClickListener.onClick(this);
                                }
/* 61 */                        if (this.f4592h0) {
/* 65 */                            this.f4591g0.m8499x(1, 1);
                                }
/* 68 */                        z = true;
                            }
/* 71 */                    setCloseIconPressed(false);
                        }
/* 70 */                z = false;
/* 71 */                setCloseIconPressed(false);
                    } else if (zContains) {
/* 77 */                setCloseIconPressed(true);
/* 43 */                z = true;
                    } else {
/* 81 */                z = false;
                    }
                    return z || super.onTouchEvent(motionEvent);
                }

                public void setAccessibilityClassName(CharSequence charSequence) {
/* 1 */             this.f4590f0 = charSequence;
                }

                @Override // android.view.View
                public void setBackground(Drawable drawable) {
/* 5 */             if (drawable == getBackgroundDrawable() || drawable == this.f4593i) {
/* 19 */                super.setBackground(drawable);
                    } else {
/* 15 */                AbstractC1245n0.m4889q("Chip", "Do not set the background; Chip manages its own background drawable.");
                    }
                }

                @Override // android.view.View
                public void setBackgroundColor(int i) {
/* 5 */             AbstractC1245n0.m4889q("Chip", "Do not set the background color; Chip manages its own background drawable.");
                }

                @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 5 */             if (drawable == getBackgroundDrawable() || drawable == this.f4593i) {
/* 19 */                super.setBackgroundDrawable(drawable);
                    } else {
/* 15 */                AbstractC1245n0.m4889q("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
                    }
                }

                @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
                public void setBackgroundResource(int i) {
/* 5 */             AbstractC1245n0.m4889q("Chip", "Do not set the background resource; Chip manages its own background drawable.");
                }

                @Override // android.view.View
                public void setBackgroundTintList(ColorStateList colorStateList) {
/* 5 */             AbstractC1245n0.m4889q("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
                }

                @Override // android.view.View
                public void setBackgroundTintMode(PorterDuff.Mode mode) {
/* 5 */             AbstractC1245n0.m4889q("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
                }

                public void setCheckable(boolean z) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4279F(z);
                    }
                }

                public void setCheckableResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 15 */                c1004hu.m4279F(c1004hu.f9248P0.getResources().getBoolean(i));
                    }
                }

                @Override // android.widget.CompoundButton, android.widget.Checkable
                public void setChecked(boolean z) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu == null) {
/* 5 */                 this.f4581V = z;
                    } else if (c1004hu.f9234B0) {
/* 12 */                super.setChecked(z);
                    }
                }

                public void setCheckedIcon(Drawable drawable) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4280G(drawable);
                    }
                }

                @Deprecated
                public void setCheckedIconEnabled(boolean z) {
/* 1 */             setCheckedIconVisible(z);
                }

                @Deprecated
                public void setCheckedIconEnabledResource(int i) {
/* 1 */             setCheckedIconVisible(i);
                }

                public void setCheckedIconResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                c1004hu.m4280G(mn0.m6700p(c1004hu.f9248P0, i));
                    }
                }

                public void setCheckedIconTint(ColorStateList colorStateList) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4281H(colorStateList);
                    }
                }

                public void setCheckedIconTintResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                c1004hu.m4281H(v00.getColorStateList(c1004hu.f9248P0, i));
                    }
                }

                public void setCheckedIconVisible(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 15 */                c1004hu.m4282I(c1004hu.f9248P0.getResources().getBoolean(i));
                    }
                }

                public void setChipBackgroundColor(ColorStateList colorStateList) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu == null || c1004hu.f9269j0 == colorStateList) {
/* 18 */                return;
                    }
/* 9 */             c1004hu.f9269j0 = colorStateList;
/* 15 */            c1004hu.onStateChange(c1004hu.getState());
                }

                public void setChipBackgroundColorResource(int i) {
                    ColorStateList colorStateList;
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu == null || c1004hu.f9269j0 == (colorStateList = v00.getColorStateList(c1004hu.f9248P0, i))) {
/* 24 */                return;
                    }
/* 15 */            c1004hu.f9269j0 = colorStateList;
/* 21 */            c1004hu.onStateChange(c1004hu.getState());
                }

                @Deprecated
                public void setChipCornerRadius(float f) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4283J(f);
                    }
                }

                @Deprecated
                public void setChipCornerRadiusResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 15 */                c1004hu.m4283J(c1004hu.f9248P0.getResources().getDimension(i));
                    }
                }

                public void setChipDrawable(C1004hu c1004hu) {
/* 1 */             C1004hu c1004hu2 = this.f4587e;
/* 3 */             if (c1004hu2 != c1004hu) {
/* 5 */                 if (c1004hu2 != null) {
/* 13 */                    c1004hu2.f9274l1 = new WeakReference(null);
                        }
/* 15 */                this.f4587e = c1004hu;
/* 18 */                c1004hu.f9278n1 = false;
/* 25 */                c1004hu.f9274l1 = new WeakReference(this);
/* 29 */                m2280c(this.f4588e0);
                    }
                }

                public void setChipEndPadding(float f) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu == null || c1004hu.f9247O0 == f) {
/* 19 */                return;
                    }
/* 11 */            c1004hu.f9247O0 = f;
/* 13 */            c1004hu.invalidateSelf();
/* 16 */            c1004hu.m4277D();
                }

                public void setChipEndPaddingResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                float dimension = c1004hu.f9248P0.getResources().getDimension(i);
/* 19 */                if (c1004hu.f9247O0 != dimension) {
/* 21 */                    c1004hu.f9247O0 = dimension;
/* 23 */                    c1004hu.invalidateSelf();
/* 26 */                    c1004hu.m4277D();
                        }
                    }
                }

                public void setChipIcon(Drawable drawable) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4284K(drawable);
                    }
                }

                @Deprecated
                public void setChipIconEnabled(boolean z) {
/* 1 */             setChipIconVisible(z);
                }

                @Deprecated
                public void setChipIconEnabledResource(int i) {
/* 1 */             setChipIconVisible(i);
                }

                public void setChipIconResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                c1004hu.m4284K(mn0.m6700p(c1004hu.f9248P0, i));
                    }
                }

                public void setChipIconSize(float f) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4285L(f);
                    }
                }

                public void setChipIconSizeResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 15 */                c1004hu.m4285L(c1004hu.f9248P0.getResources().getDimension(i));
                    }
                }

                public void setChipIconTint(ColorStateList colorStateList) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4286M(colorStateList);
                    }
                }

                public void setChipIconTintResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                c1004hu.m4286M(v00.getColorStateList(c1004hu.f9248P0, i));
                    }
                }

                public void setChipIconVisible(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 15 */                c1004hu.m4287N(c1004hu.f9248P0.getResources().getBoolean(i));
                    }
                }

                public void setChipMinHeight(float f) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu == null || c1004hu.f9271k0 == f) {
/* 19 */                return;
                    }
/* 11 */            c1004hu.f9271k0 = f;
/* 13 */            c1004hu.invalidateSelf();
/* 16 */            c1004hu.m4277D();
                }

                public void setChipMinHeightResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                float dimension = c1004hu.f9248P0.getResources().getDimension(i);
/* 19 */                if (c1004hu.f9271k0 != dimension) {
/* 21 */                    c1004hu.f9271k0 = dimension;
/* 23 */                    c1004hu.invalidateSelf();
/* 26 */                    c1004hu.m4277D();
                        }
                    }
                }

                public void setChipStartPadding(float f) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu == null || c1004hu.f9240H0 == f) {
/* 19 */                return;
                    }
/* 11 */            c1004hu.f9240H0 = f;
/* 13 */            c1004hu.invalidateSelf();
/* 16 */            c1004hu.m4277D();
                }

                public void setChipStartPaddingResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                float dimension = c1004hu.f9248P0.getResources().getDimension(i);
/* 19 */                if (c1004hu.f9240H0 != dimension) {
/* 21 */                    c1004hu.f9240H0 = dimension;
/* 23 */                    c1004hu.invalidateSelf();
/* 26 */                    c1004hu.m4277D();
                        }
                    }
                }

                public void setChipStrokeColor(ColorStateList colorStateList) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4288O(colorStateList);
                    }
                }

                public void setChipStrokeColorResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                c1004hu.m4288O(v00.getColorStateList(c1004hu.f9248P0, i));
                    }
                }

                public void setChipStrokeWidth(float f) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4289P(f);
                    }
                }

                public void setChipStrokeWidthResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 15 */                c1004hu.m4289P(c1004hu.f9248P0.getResources().getDimension(i));
                    }
                }

                @Deprecated
                public void setChipText(CharSequence charSequence) {
/* 1 */             setText(charSequence);
                }

                @Deprecated
                public void setChipTextResource(int i) {
/* 9 */             setText(getResources().getString(i));
                }

                public void setCloseIcon(Drawable drawable) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4290Q(drawable);
                    }
/* 8 */             m2282e();
                }

                public void setCloseIconContentDescription(CharSequence charSequence) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu == null || c1004hu.f9233A0 == charSequence) {
/* 41 */                return;
                    }
/* 9 */             String str = C0021aj.f304b;
/* 25 */            C0021aj c0021aj = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0021aj.f307e : C0021aj.f306d;
/* 27 */            c0021aj.getClass();
/* 30 */            zr3 zr3Var = en2.f7808a;
/* 36 */            c1004hu.f9233A0 = c0021aj.m293c(charSequence);
/* 38 */            c1004hu.invalidateSelf();
                }

                @Deprecated
                public void setCloseIconEnabled(boolean z) {
/* 1 */             setCloseIconVisible(z);
                }

                @Deprecated
                public void setCloseIconEnabledResource(int i) {
/* 1 */             setCloseIconVisible(i);
                }

                public void setCloseIconEndPadding(float f) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4291R(f);
                    }
                }

                public void setCloseIconEndPaddingResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 15 */                c1004hu.m4291R(c1004hu.f9248P0.getResources().getDimension(i));
                    }
                }

                public void setCloseIconResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                c1004hu.m4290Q(mn0.m6700p(c1004hu.f9248P0, i));
                    }
/* 14 */            m2282e();
                }

                public void setCloseIconSize(float f) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4292S(f);
                    }
                }

                public void setCloseIconSizeResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 15 */                c1004hu.m4292S(c1004hu.f9248P0.getResources().getDimension(i));
                    }
                }

                public void setCloseIconStartPadding(float f) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4293T(f);
                    }
                }

                public void setCloseIconStartPaddingResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 15 */                c1004hu.m4293T(c1004hu.f9248P0.getResources().getDimension(i));
                    }
                }

                public void setCloseIconTint(ColorStateList colorStateList) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4294U(colorStateList);
                    }
                }

                public void setCloseIconTintResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                c1004hu.m4294U(v00.getColorStateList(c1004hu.f9248P0, i));
                    }
                }

                public void setCloseIconVisible(int i) {
/* 9 */             setCloseIconVisible(getResources().getBoolean(i));
                }

                @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
                public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             if (drawable != null) {
/* 17 */                C1951n4.m6866q("Please set start drawable using R.attr#chipIcon.");
                    } else if (drawable3 == null) {
/* 5 */                 super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                    } else {
/* 11 */                C1951n4.m6866q("Please set end drawable using R.attr#closeIcon.");
                    }
                }

                @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
                public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
/* 1 */             if (drawable != null) {
/* 17 */                C1951n4.m6866q("Please set start drawable using R.attr#chipIcon.");
                    } else if (drawable3 == null) {
/* 5 */                 super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                    } else {
/* 11 */                C1951n4.m6866q("Please set end drawable using R.attr#closeIcon.");
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
/* 1 */             if (i != 0) {
/* 17 */                C1951n4.m6866q("Please set start drawable using R.attr#chipIcon.");
                    } else if (i3 == 0) {
/* 5 */                 super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
                    } else {
/* 11 */                C1951n4.m6866q("Please set end drawable using R.attr#closeIcon.");
                    }
                }

                @Override // android.widget.TextView
                public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
/* 1 */             if (i != 0) {
/* 17 */                C1951n4.m6866q("Please set start drawable using R.attr#chipIcon.");
                    } else if (i3 == 0) {
/* 5 */                 super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
                    } else {
/* 11 */                C1951n4.m6866q("Please set end drawable using R.attr#closeIcon.");
                    }
                }

                @Override // android.view.View
                public void setElevation(float f) {
/* 1 */             super.setElevation(f);
/* 4 */             C1004hu c1004hu = this.f4587e;
/* 6 */             if (c1004hu != null) {
/* 8 */                 c1004hu.m3741m(f);
                    }
                }

                @Override // android.widget.TextView
                public void setEllipsize(TextUtils.TruncateAt truncateAt) {
/* 3 */             if (this.f4587e == null) {
/* 19 */                return;
                    }
/* 8 */             if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
/* 22 */                C1951n4.m6866q("Text within a chip are not allowed to scroll.");
/* 25 */                return;
                    }
/* 10 */            super.setEllipsize(truncateAt);
/* 13 */            C1004hu c1004hu = this.f4587e;
/* 15 */            if (c1004hu != null) {
/* 17 */                c1004hu.f9276m1 = truncateAt;
                    }
                }

                public void setEnsureMinTouchTargetSize(boolean z) {
/* 1 */             this.f4585c0 = z;
/* 5 */             m2280c(this.f4588e0);
                }

                @Override // android.widget.TextView
                public void setGravity(int i) {
/* 4 */             if (i != 8388627) {
/* 10 */                AbstractC1245n0.m4889q("Chip", "Chip text must be vertically center and start aligned");
                    } else {
/* 14 */                super.setGravity(i);
                    }
                }

                public void setHideMotionSpec(mk1 mk1Var) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.f9239G0 = mk1Var;
                    }
                }

                public void setHideMotionSpecResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                c1004hu.f9239G0 = mk1.m6668b(c1004hu.f9248P0, i);
                    }
                }

                public void setIconEndPadding(float f) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4296W(f);
                    }
                }

                public void setIconEndPaddingResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 15 */                c1004hu.m4296W(c1004hu.f9248P0.getResources().getDimension(i));
                    }
                }

                public void setIconStartPadding(float f) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4297X(f);
                    }
                }

                public void setIconStartPaddingResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 15 */                c1004hu.m4297X(c1004hu.f9248P0.getResources().getDimension(i));
                    }
                }

                public void setInternalOnCheckedChangeListener(ad1 ad1Var) {
/* 1 */             this.f4580U = ad1Var;
                }

                @Override // android.view.View
                public void setLayoutDirection(int i) {
/* 3 */             if (this.f4587e == null) {
/* 5 */                 return;
                    }
/* 6 */             super.setLayoutDirection(i);
                }

                @Override // android.widget.TextView
                public void setLines(int i) {
/* 2 */             if (i <= 1) {
/* 4 */                 super.setLines(i);
                    } else {
/* 10 */                C1951n4.m6866q("Chip does not support multi-line text");
                    }
                }

                @Override // android.widget.TextView
                public void setMaxLines(int i) {
/* 2 */             if (i <= 1) {
/* 4 */                 super.setMaxLines(i);
                    } else {
/* 10 */                C1951n4.m6866q("Chip does not support multi-line text");
                    }
                }

                @Override // android.widget.TextView
                public void setMaxWidth(int i) {
/* 1 */             super.setMaxWidth(i);
/* 4 */             C1004hu c1004hu = this.f4587e;
/* 6 */             if (c1004hu != null) {
/* 8 */                 c1004hu.f9280o1 = i;
                    }
                }

                @Override // android.widget.TextView
                public void setMinLines(int i) {
/* 2 */             if (i <= 1) {
/* 4 */                 super.setMinLines(i);
                    } else {
/* 10 */                C1951n4.m6866q("Chip does not support multi-line text");
                    }
                }

                @Override // android.widget.CompoundButton
                public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
/* 1 */             this.f4598w = onCheckedChangeListener;
                }

                public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
/* 1 */             this.f4597v = onClickListener;
/* 3 */             m2282e();
                }

                public void setRippleColor(ColorStateList colorStateList) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.m4298Y(colorStateList);
                    }
/* 10 */            this.f4587e.getClass();
/* 13 */            m2283f();
                }

                public void setRippleColorResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                c1004hu.m4298Y(v00.getColorStateList(c1004hu.f9248P0, i));
/* 16 */                this.f4587e.getClass();
/* 19 */                m2283f();
                    }
                }

                @Override // p000.ed2
                public void setShapeAppearanceModel(tc2 tc2Var) {
/* 3 */             this.f4587e.setShapeAppearanceModel(tc2Var);
                }

                public void setShowMotionSpec(mk1 mk1Var) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 5 */                 c1004hu.f9238F0 = mk1Var;
                    }
                }

                public void setShowMotionSpecResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                c1004hu.f9238F0 = mk1.m6668b(c1004hu.f9248P0, i);
                    }
                }

                @Override // android.widget.TextView
                public void setSingleLine(boolean z) {
/* 1 */             if (z) {
/* 3 */                 super.setSingleLine(z);
                    } else {
/* 9 */                 C1951n4.m6866q("Chip does not support multi-line text");
                    }
                }

                @Override // android.widget.TextView
                public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu == null) {
/* 45 */                return;
                    }
/* 6 */             if (charSequence == null) {
/* 8 */                 charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 17 */            super.setText(c1004hu.f9278n1 ? null : charSequence, bufferType);
/* 20 */            C1004hu c1004hu2 = this.f4587e;
/* 22 */            if (c1004hu2 == null || TextUtils.equals(c1004hu2.f9281p0, charSequence)) {
/* 45 */                return;
                    }
/* 32 */            c1004hu2.f9281p0 = charSequence;
/* 37 */            c1004hu2.f9254V0.f8750d = true;
/* 39 */            c1004hu2.invalidateSelf();
/* 42 */            c1004hu2.m4277D();
                }

                @Override // android.widget.TextView
                public final void setTextAppearance(Context context, int i) {
/* 1 */             super.setTextAppearance(context, i);
/* 4 */             C1004hu c1004hu = this.f4587e;
/* 6 */             if (c1004hu != null) {
/* 10 */                Context context2 = c1004hu.f9248P0;
/* 17 */                c1004hu.f9254V0.m3978b(new dn2(context2, i), context2);
                    }
/* 20 */            m2285h();
                }

                public void setTextAppearanceResource(int i) {
/* 5 */             setTextAppearance(getContext(), i);
                }

                public void setTextEndPadding(float f) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu == null || c1004hu.f9244L0 == f) {
/* 19 */                return;
                    }
/* 11 */            c1004hu.f9244L0 = f;
/* 13 */            c1004hu.invalidateSelf();
/* 16 */            c1004hu.m4277D();
                }

                public void setTextEndPaddingResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                float dimension = c1004hu.f9248P0.getResources().getDimension(i);
/* 19 */                if (c1004hu.f9244L0 != dimension) {
/* 21 */                    c1004hu.f9244L0 = dimension;
/* 23 */                    c1004hu.invalidateSelf();
/* 26 */                    c1004hu.m4277D();
                        }
                    }
                }

                public void setTextStartPadding(float f) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu == null || c1004hu.f9243K0 == f) {
/* 19 */                return;
                    }
/* 11 */            c1004hu.f9243K0 = f;
/* 13 */            c1004hu.invalidateSelf();
/* 16 */            c1004hu.m4277D();
                }

                public void setTextStartPaddingResource(int i) {
/* 1 */             C1004hu c1004hu = this.f4587e;
/* 3 */             if (c1004hu != null) {
/* 11 */                float dimension = c1004hu.f9248P0.getResources().getDimension(i);
/* 19 */                if (c1004hu.f9243K0 != dimension) {
/* 21 */                    c1004hu.f9243K0 = dimension;
/* 23 */                    c1004hu.invalidateSelf();
/* 26 */                    c1004hu.m4277D();
                        }
                    }
                }

/* 12 */        public void setCloseIconVisible(boolean z) {
/* 13 */            C1004hu c1004hu = this.f4587e;
                    if (c1004hu != null) {
/* 14 */                c1004hu.m4295V(z);
                    }
/* 15 */            m2282e();
                }

/* 18 */        public void setCheckedIconVisible(boolean z) {
/* 19 */            C1004hu c1004hu = this.f4587e;
                    if (c1004hu != null) {
/* 20 */                c1004hu.m4282I(z);
                    }
                }

/* 18 */        public void setChipIconVisible(boolean z) {
/* 19 */            C1004hu c1004hu = this.f4587e;
                    if (c1004hu != null) {
/* 20 */                c1004hu.m4287N(z);
                    }
                }

                @Override // android.widget.TextView
/* 20 */        public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
                    if (drawable != null) {
/* 23 */                C1951n4.m6866q("Please set start drawable using R.attr#chipIcon.");
                    } else if (drawable3 == null) {
/* 21 */                super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                    } else {
/* 22 */                C1951n4.m6866q("Please set end drawable using R.attr#closeIcon.");
                    }
                }

                @Override // android.widget.TextView
/* 20 */        public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
                    if (drawable != null) {
/* 23 */                C1951n4.m6866q("Please set left drawable using R.attr#chipIcon.");
                    } else if (drawable3 == null) {
/* 21 */                super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                    } else {
/* 22 */                C1951n4.m6866q("Please set right drawable using R.attr#closeIcon.");
                    }
                }

/* 23 */        public void setTextAppearance(dn2 dn2Var) {
/* 24 */            C1004hu c1004hu = this.f4587e;
                    if (c1004hu != null) {
/* 25 */                c1004hu.f9254V0.m3978b(dn2Var, c1004hu.f9248P0);
                    }
/* 26 */            m2285h();
                }

                @Override // android.widget.TextView
/* 26 */        public void setTextAppearance(int i) {
/* 27 */            super.setTextAppearance(i);
/* 28 */            C1004hu c1004hu = this.f4587e;
                    if (c1004hu != null) {
                        Context context = c1004hu.f9248P0;
/* 30 */                c1004hu.f9254V0.m3978b(new dn2(context, i), context);
                    }
/* 31 */            m2285h();
                }

/* 912 */       public Chip(Context context, AttributeSet attributeSet) {
/* 913 */           this(context, attributeSet, R$attr.chipStyle);
                }
            }
