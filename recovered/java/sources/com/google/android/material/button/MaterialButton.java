            package com.google.android.material.button;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.RippleDrawable;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.Layout;
            import android.text.TextPaint;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.Button;
            import android.widget.Checkable;
            import android.widget.CompoundButton;
            import androidx.appcompat.widget.AppCompatButton;
            import androidx.customview.view.AbsSavedState;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.WeakHashMap;
            import p000.C1951n4;
            import p000.c52;
            import p000.de3;
            import p000.e33;
            import p000.ed2;
            import p000.f42;
            import p000.fm0;
            import p000.fs0;
            import p000.hd1;
            import p000.he3;
            import p000.kb1;
            import p000.mn0;
            import p000.rn2;
            import p000.s90;
            import p000.sc2;
            import p000.tc1;
            import p000.tc2;
            import p000.uc1;
            import p000.v00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 326 */   public class MaterialButton extends AppCompatButton implements Checkable, ed2 {

                /* JADX INFO: renamed from: e0 */
                public static final int[] f4535e0 = {R.attr.state_checkable};

                /* JADX INFO: renamed from: f0 */
                public static final int[] f4536f0 = {R.attr.state_checked};

                /* JADX INFO: renamed from: g0 */
                public static final int f4537g0 = R$style.Widget_MaterialComponents_Button;

                /* JADX INFO: renamed from: U */
                public int f4538U;

                /* JADX INFO: renamed from: V */
                public int f4539V;

                /* JADX INFO: renamed from: W */
                public int f4540W;

                /* JADX INFO: renamed from: a0 */
                public int f4541a0;

                /* JADX INFO: renamed from: b0 */
                public boolean f4542b0;

                /* JADX INFO: renamed from: c0 */
                public boolean f4543c0;

                /* JADX INFO: renamed from: d */
                public final uc1 f4544d;

                /* JADX INFO: renamed from: d0 */
                public int f4545d0;

                /* JADX INFO: renamed from: e */
                public final LinkedHashSet f4546e;

                /* JADX INFO: renamed from: f */
                public tc1 f4547f;

                /* JADX INFO: renamed from: i */
                public PorterDuff.Mode f4548i;

                /* JADX INFO: renamed from: v */
                public ColorStateList f4549v;

                /* JADX INFO: renamed from: w */
                public Drawable f4550w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState extends AbsSavedState {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0343a();

                    /* JADX INFO: renamed from: c */
                    public boolean f4551c;

                    public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 1 */                 super(parcel, classLoader);
/* 4 */                 if (classLoader == null) {
/* 10 */                    getClass().getClassLoader();
                        }
/* 22 */                this.f4551c = parcel.readInt() == 1;
                    }

                    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 1 */                 super.writeToParcel(parcel, i);
/* 6 */                 parcel.writeInt(this.f4551c ? 1 : 0);
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public MaterialButton(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = f4537g0;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 15 */            this.f4546e = new LinkedHashSet();
/* 18 */            this.f4542b0 = false;
/* 20 */            this.f4543c0 = false;
/* 22 */            Context context2 = getContext();
/* 32 */            TypedArray typedArrayM8213d = rn2.m8213d(context2, attributeSet, R$styleable.MaterialButton, i, i2, new int[0]);
/* 42 */            this.f4541a0 = typedArrayM8213d.getDimensionPixelSize(R$styleable.MaterialButton_iconPadding, 0);
/* 47 */            int i3 = typedArrayM8213d.getInt(R$styleable.MaterialButton_iconTintMode, -1);
/* 51 */            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
/* 57 */            this.f4548i = kb1.m6039O(i3, mode);
/* 69 */            this.f4549v = de3.m3033o(getContext(), typedArrayM8213d, R$styleable.MaterialButton_iconTint);
/* 81 */            this.f4550w = de3.m3035q(getContext(), typedArrayM8213d, R$styleable.MaterialButton_icon);
/* 90 */            this.f4545d0 = typedArrayM8213d.getInteger(R$styleable.MaterialButton_iconGravity, 1);
/* 98 */            this.f4538U = typedArrayM8213d.getDimensionPixelSize(R$styleable.MaterialButton_iconSize, 0);
/* 110 */           uc1 uc1Var = new uc1(this, tc2.m8775b(context2, attributeSet, i, i2).m8478a());
/* 113 */           this.f4544d = uc1Var;
/* 121 */           uc1Var.f17451c = typedArrayM8213d.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetLeft, 0);
/* 129 */           uc1Var.f17452d = typedArrayM8213d.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetRight, 0);
/* 137 */           uc1Var.f17453e = typedArrayM8213d.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetTop, 0);
/* 145 */           uc1Var.f17454f = typedArrayM8213d.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetBottom, 0);
/* 153 */           if (typedArrayM8213d.hasValue(R$styleable.MaterialButton_cornerRadius)) {
/* 157 */               int dimensionPixelSize = typedArrayM8213d.getDimensionPixelSize(R$styleable.MaterialButton_cornerRadius, -1);
/* 161 */               uc1Var.f17455g = dimensionPixelSize;
/* 166 */               sc2 sc2VarM8779f = uc1Var.f17450b.m8779f();
/* 170 */               sc2VarM8779f.m8479b(dimensionPixelSize);
/* 177 */               uc1Var.m9000c(sc2VarM8779f.m8478a());
/* 180 */               uc1Var.f17464p = true;
                    }
/* 188 */           uc1Var.f17456h = typedArrayM8213d.getDimensionPixelSize(R$styleable.MaterialButton_strokeWidth, 0);
/* 200 */           uc1Var.f17457i = kb1.m6039O(typedArrayM8213d.getInt(R$styleable.MaterialButton_backgroundTintMode, -1), mode);
/* 212 */           uc1Var.f17458j = de3.m3033o(getContext(), typedArrayM8213d, R$styleable.MaterialButton_backgroundTint);
/* 224 */           uc1Var.f17459k = de3.m3033o(getContext(), typedArrayM8213d, R$styleable.MaterialButton_strokeColor);
/* 236 */           uc1Var.f17460l = de3.m3033o(getContext(), typedArrayM8213d, R$styleable.MaterialButton_rippleColor);
/* 244 */           uc1Var.f17465q = typedArrayM8213d.getBoolean(R$styleable.MaterialButton_android_checkable, false);
/* 252 */           uc1Var.f17467s = typedArrayM8213d.getDimensionPixelSize(R$styleable.MaterialButton_elevation, 0);
/* 254 */           WeakHashMap weakHashMap = e33.f7494a;
/* 256 */           int paddingStart = getPaddingStart();
/* 260 */           int paddingTop = getPaddingTop();
/* 264 */           int paddingEnd = getPaddingEnd();
/* 268 */           int paddingBottom = getPaddingBottom();
/* 278 */           if (typedArrayM8213d.hasValue(R$styleable.MaterialButton_android_background)) {
/* 280 */               uc1Var.f17463o = true;
/* 284 */               setSupportBackgroundTintList(uc1Var.f17458j);
/* 289 */               setSupportBackgroundTintMode(uc1Var.f17457i);
                    } else {
/* 293 */               uc1Var.m9002e();
                    }
/* 308 */           setPaddingRelative(paddingStart + uc1Var.f17451c, paddingTop + uc1Var.f17453e, paddingEnd + uc1Var.f17452d, paddingBottom + uc1Var.f17454f);
/* 311 */           typedArrayM8213d.recycle();
/* 316 */           setCompoundDrawablePadding(this.f4541a0);
/* 324 */           m2270c(this.f4550w != null);
                }

                private String getA11yClassName() {
/* 1 */             uc1 uc1Var = this.f4544d;
/* 14 */            return ((uc1Var == null || !uc1Var.f17465q) ? Button.class : CompoundButton.class).getName();
                }

                private Layout.Alignment getActualTextAlignment() {
/* 1 */             int textAlignment = getTextAlignment();
/* 6 */             if (textAlignment == 1) {
/* 26 */                return getGravityTextAlignment();
                    }
/* 9 */             if (textAlignment == 6 || textAlignment == 3) {
/* 23 */                return Layout.Alignment.ALIGN_OPPOSITE;
                    }
                    return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
                }

                private Layout.Alignment getGravityTextAlignment() {
/* 8 */             int gravity = getGravity() & 8388615;
/* 10 */            if (gravity != 1) {
                        return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    }
/* 26 */            return Layout.Alignment.ALIGN_CENTER;
                }

                private int getTextHeight() {
/* 1 */             TextPaint paint = getPaint();
/* 9 */             String string = getText().toString();
/* 17 */            if (getTransformationMethod() != null) {
/* 27 */                string = getTransformationMethod().getTransformation(string, this).toString();
                    }
/* 33 */            Rect rect = new Rect();
/* 41 */            paint.getTextBounds(string, 0, string.length(), rect);
/* 56 */            return Math.min(rect.height(), getLayout().getHeight());
                }

                private int getTextWidth() {
/* 1 */             TextPaint paint = getPaint();
/* 9 */             String string = getText().toString();
/* 17 */            if (getTransformationMethod() != null) {
/* 27 */                string = getTransformationMethod().getTransformation(string, this).toString();
                    }
/* 44 */            return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
                }

                /* JADX INFO: renamed from: a */
                public final boolean m2268a() {
/* 1 */             uc1 uc1Var = this.f4544d;
                    return (uc1Var == null || uc1Var.f17463o) ? false : true;
                }

                /* JADX INFO: renamed from: b */
                public final void m2269b() {
/* 1 */             int i = this.f4545d0;
/* 5 */             if (i == 1 || i == 2) {
/* 42 */                setCompoundDrawablesRelative(this.f4550w, null, null, null);
/* 45 */                return;
                    }
/* 12 */            if (i == 3 || i == 4) {
/* 36 */                setCompoundDrawablesRelative(null, null, this.f4550w, null);
                    } else if (i == 16 || i == 32) {
/* 30 */                setCompoundDrawablesRelative(null, this.f4550w, null, null);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m2270c(boolean z) {
/* 1 */             Drawable drawable = this.f4550w;
/* 4 */             if (drawable != null) {
/* 6 */                 Drawable drawableMutate = drawable.mutate();
/* 10 */                this.f4550w = drawableMutate;
/* 14 */                s90.m8448h(drawableMutate, this.f4549v);
/* 17 */                PorterDuff.Mode mode = this.f4548i;
/* 19 */                if (mode != null) {
/* 23 */                    s90.m8449i(this.f4550w, mode);
                        }
/* 26 */                int intrinsicWidth = this.f4538U;
/* 28 */                if (intrinsicWidth == 0) {
/* 33 */                    intrinsicWidth = this.f4550w.getIntrinsicWidth();
                        }
/* 37 */                int intrinsicHeight = this.f4538U;
/* 39 */                if (intrinsicHeight == 0) {
/* 44 */                    intrinsicHeight = this.f4550w.getIntrinsicHeight();
                        }
/* 48 */                Drawable drawable2 = this.f4550w;
/* 50 */                int i = this.f4539V;
/* 52 */                int i2 = this.f4540W;
/* 56 */                drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
/* 61 */                this.f4550w.setVisible(true, z);
                    }
/* 64 */            if (z) {
/* 66 */                m2269b();
/* 69 */                return;
                    }
/* 70 */            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
/* 75 */            Drawable drawable3 = compoundDrawablesRelative[0];
/* 77 */            Drawable drawable4 = compoundDrawablesRelative[1];
/* 80 */            Drawable drawable5 = compoundDrawablesRelative[2];
/* 82 */            int i3 = this.f4545d0;
/* 84 */            if (((i3 == 1 || i3 == 2) && drawable3 != this.f4550w) || (((i3 == 3 || i3 == 4) && drawable5 != this.f4550w) || ((i3 == 16 || i3 == 32) && drawable4 != this.f4550w))) {
/* 118 */               m2269b();
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m2271d(int i, int i2) {
/* 3 */             if (this.f4550w == null || getLayout() == null) {
/* 185 */               return;
                    }
/* 13 */            int i3 = this.f4545d0;
/* 20 */            if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
/* 32 */                if (i3 == 16 || i3 == 32) {
/* 40 */                    this.f4539V = 0;
/* 42 */                    if (i3 == 16) {
/* 44 */                        this.f4540W = 0;
/* 46 */                        m2270c(false);
/* 49 */                        return;
                            }
/* 50 */                    int intrinsicHeight = this.f4538U;
/* 52 */                    if (intrinsicHeight == 0) {
/* 56 */                        intrinsicHeight = this.f4550w.getIntrinsicHeight();
                            }
/* 79 */                    int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f4541a0) - getPaddingBottom()) / 2;
/* 82 */                    if (this.f4540W != textHeight) {
/* 84 */                        this.f4540W = textHeight;
/* 86 */                        m2270c(false);
/* 89 */                        return;
                            }
/* 185 */                   return;
                        }
/* 39 */                return;
                    }
/* 90 */            this.f4540W = 0;
/* 92 */            Layout.Alignment actualTextAlignment = getActualTextAlignment();
/* 96 */            int i4 = this.f4545d0;
/* 98 */            if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
/* 180 */               this.f4539V = 0;
/* 182 */               m2270c(false);
/* 185 */               return;
                    }
/* 115 */           int intrinsicWidth = this.f4538U;
/* 117 */           if (intrinsicWidth == 0) {
/* 121 */               intrinsicWidth = this.f4550w.getIntrinsicWidth();
                    }
/* 129 */           int textWidth = i - getTextWidth();
/* 130 */           WeakHashMap weakHashMap = e33.f7494a;
/* 145 */           int paddingEnd = (((textWidth - getPaddingEnd()) - intrinsicWidth) - this.f4541a0) - getPaddingStart();
/* 148 */           if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
/* 150 */               paddingEnd /= 2;
                    }
/* 167 */           if ((getLayoutDirection() == 1) != (this.f4545d0 == 4)) {
/* 169 */               paddingEnd = -paddingEnd;
                    }
/* 172 */           if (this.f4539V != paddingEnd) {
/* 174 */               this.f4539V = paddingEnd;
/* 176 */               m2270c(false);
                    }
                }

                @Override // android.view.View
                public ColorStateList getBackgroundTintList() {
/* 1 */             return getSupportBackgroundTintList();
                }

                @Override // android.view.View
                public PorterDuff.Mode getBackgroundTintMode() {
/* 1 */             return getSupportBackgroundTintMode();
                }

                public int getCornerRadius() {
/* 5 */             if (m2268a()) {
/* 9 */                 return this.f4544d.f17455g;
                    }
/* 12 */            return 0;
                }

                public Drawable getIcon() {
/* 1 */             return this.f4550w;
                }

                public int getIconGravity() {
/* 1 */             return this.f4545d0;
                }

                public int getIconPadding() {
/* 1 */             return this.f4541a0;
                }

                public int getIconSize() {
/* 1 */             return this.f4538U;
                }

                public ColorStateList getIconTint() {
/* 1 */             return this.f4549v;
                }

                public PorterDuff.Mode getIconTintMode() {
/* 1 */             return this.f4548i;
                }

                public int getInsetBottom() {
/* 3 */             return this.f4544d.f17454f;
                }

                public int getInsetTop() {
/* 3 */             return this.f4544d.f17453e;
                }

                public ColorStateList getRippleColor() {
/* 5 */             if (m2268a()) {
/* 9 */                 return this.f4544d.f17460l;
                    }
/* 12 */            return null;
                }

                public tc2 getShapeAppearanceModel() {
/* 5 */             if (m2268a()) {
/* 9 */                 return this.f4544d.f17450b;
                    }
/* 14 */            f42.m3656l("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
/* 17 */            return null;
                }

                public ColorStateList getStrokeColor() {
/* 5 */             if (m2268a()) {
/* 9 */                 return this.f4544d.f17459k;
                    }
/* 12 */            return null;
                }

                public int getStrokeWidth() {
/* 5 */             if (m2268a()) {
/* 9 */                 return this.f4544d.f17456h;
                    }
/* 12 */            return 0;
                }

                @Override // androidx.appcompat.widget.AppCompatButton
                public ColorStateList getSupportBackgroundTintList() {
                    return m2268a() ? this.f4544d.f17458j : super.getSupportBackgroundTintList();
                }

                @Override // androidx.appcompat.widget.AppCompatButton
                public PorterDuff.Mode getSupportBackgroundTintMode() {
                    return m2268a() ? this.f4544d.f17457i : super.getSupportBackgroundTintMode();
                }

                @Override // android.widget.Checkable
                public final boolean isChecked() {
/* 1 */             return this.f4542b0;
                }

                @Override // android.widget.TextView, android.view.View
                public void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 8 */             if (m2268a()) {
/* 17 */                he3.m4195r(this, this.f4544d.m8999b(false));
                    }
                }

                @Override // android.widget.TextView, android.view.View
                public final int[] onCreateDrawableState(int i) {
/* 3 */             int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
/* 7 */             uc1 uc1Var = this.f4544d;
/* 9 */             if (uc1Var != null && uc1Var.f17465q) {
/* 17 */                View.mergeDrawableStates(iArrOnCreateDrawableState, f4535e0);
                    }
/* 22 */            if (this.f4542b0) {
/* 26 */                View.mergeDrawableStates(iArrOnCreateDrawableState, f4536f0);
                    }
/* 29 */            return iArrOnCreateDrawableState;
                }

                @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
                public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             super.onInitializeAccessibilityEvent(accessibilityEvent);
/* 8 */             accessibilityEvent.setClassName(getA11yClassName());
/* 13 */            accessibilityEvent.setChecked(this.f4542b0);
                }

                @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 8 */             accessibilityNodeInfo.setClassName(getA11yClassName());
/* 11 */            uc1 uc1Var = this.f4544d;
/* 22 */            accessibilityNodeInfo.setCheckable(uc1Var != null && uc1Var.f17465q);
/* 27 */            accessibilityNodeInfo.setChecked(this.f4542b0);
/* 34 */            accessibilityNodeInfo.setClickable(isClickable());
                }

                @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 12 */            m2271d(getMeasuredWidth(), getMeasuredHeight());
                }

                @Override // android.widget.TextView, android.view.View
                public final void onRestoreInstanceState(Parcelable parcelable) {
/* 3 */             if (!(parcelable instanceof SavedState)) {
/* 5 */                 super.onRestoreInstanceState(parcelable);
/* 8 */                 return;
                    }
/* 9 */             SavedState savedState = (SavedState) parcelable;
/* 13 */            super.onRestoreInstanceState(savedState.f1292a);
/* 18 */            setChecked(savedState.f4551c);
                }

                @Override // android.widget.TextView, android.view.View
                public final Parcelable onSaveInstanceState() {
/* 7 */             SavedState savedState = new SavedState(super.onSaveInstanceState());
/* 12 */            savedState.f4551c = this.f4542b0;
/* 14 */            return savedState;
                }

                @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
/* 1 */             super.onTextChanged(charSequence, i, i2, i3);
/* 12 */            m2271d(getMeasuredWidth(), getMeasuredHeight());
                }

                @Override // android.view.View
                public final boolean performClick() {
/* 1 */             toggle();
/* 4 */             return super.performClick();
                }

                @Override // android.view.View
                public final void refreshDrawableState() {
/* 1 */             super.refreshDrawableState();
/* 6 */             if (this.f4550w != null) {
/* 18 */                if (this.f4550w.setState(getDrawableState())) {
/* 20 */                    invalidate();
                        }
                    }
                }

                @Override // android.view.View
                public void setBackground(Drawable drawable) {
/* 1 */             setBackgroundDrawable(drawable);
                }

                @Override // android.view.View
                public void setBackgroundColor(int i) {
/* 5 */             if (!m2268a()) {
/* 24 */                super.setBackgroundColor(i);
/* 27 */                return;
                    }
/* 7 */             uc1 uc1Var = this.f4544d;
/* 14 */            if (uc1Var.m8999b(false) != null) {
/* 20 */                uc1Var.m8999b(false).setTint(i);
                    }
                }

                @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 5 */             if (!m2268a()) {
/* 53 */                super.setBackgroundDrawable(drawable);
/* 56 */                return;
                    }
/* 11 */            if (drawable == getBackground()) {
/* 49 */                getBackground().setState(drawable.getState());
/* 52 */                return;
                    }
/* 17 */            AbstractC1245n0.m4889q("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
/* 21 */            uc1 uc1Var = this.f4544d;
/* 23 */            uc1Var.f17463o = true;
/* 25 */            MaterialButton materialButton = uc1Var.f17449a;
/* 29 */            materialButton.setSupportBackgroundTintList(uc1Var.f17458j);
/* 34 */            materialButton.setSupportBackgroundTintMode(uc1Var.f17457i);
/* 37 */            super.setBackgroundDrawable(drawable);
                }

                @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
                public void setBackgroundResource(int i) {
/* 13 */            setBackgroundDrawable(i != 0 ? mn0.m6700p(getContext(), i) : null);
                }

                @Override // android.view.View
                public void setBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             setSupportBackgroundTintList(colorStateList);
                }

                @Override // android.view.View
                public void setBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             setSupportBackgroundTintMode(mode);
                }

                public void setCheckable(boolean z) {
/* 5 */             if (m2268a()) {
/* 9 */                 this.f4544d.f17465q = z;
                    }
                }

                @Override // android.widget.Checkable
                public void setChecked(boolean z) {
/* 1 */             uc1 uc1Var = this.f4544d;
/* 3 */             if (uc1Var == null || !uc1Var.f17465q || !isEnabled() || this.f4542b0 == z) {
/* 81 */                return;
                    }
/* 19 */            this.f4542b0 = z;
/* 21 */            refreshDrawableState();
/* 30 */            if (getParent() instanceof MaterialButtonToggleGroup) {
/* 36 */                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
/* 38 */                boolean z2 = this.f4542b0;
/* 42 */                if (!materialButtonToggleGroup.f4559f) {
/* 49 */                    materialButtonToggleGroup.m2273b(getId(), z2);
                        }
                    }
/* 54 */            if (this.f4543c0) {
/* 81 */                return;
                    }
/* 58 */            this.f4543c0 = true;
/* 62 */            Iterator it = this.f4546e.iterator();
/* 70 */            if (it.hasNext()) {
/* 80 */                throw fm0.m3780f(it);
                    }
/* 73 */            this.f4543c0 = false;
                }

                public void setCornerRadius(int i) {
/* 5 */             if (m2268a()) {
/* 7 */                 uc1 uc1Var = this.f4544d;
/* 11 */                if (uc1Var.f17464p && uc1Var.f17455g == i) {
/* 39 */                    return;
                        }
/* 17 */                uc1Var.f17455g = i;
/* 20 */                uc1Var.f17464p = true;
/* 25 */                sc2 sc2VarM8779f = uc1Var.f17450b.m8779f();
/* 29 */                sc2VarM8779f.m8479b(i);
/* 36 */                uc1Var.m9000c(sc2VarM8779f.m8478a());
                    }
                }

                public void setCornerRadiusResource(int i) {
/* 5 */             if (m2268a()) {
/* 15 */                setCornerRadius(getResources().getDimensionPixelSize(i));
                    }
                }

                @Override // android.view.View
                public void setElevation(float f) {
/* 1 */             super.setElevation(f);
/* 8 */             if (m2268a()) {
/* 17 */                this.f4544d.m8999b(false).m3741m(f);
                    }
                }

                public void setIcon(Drawable drawable) {
/* 3 */             if (this.f4550w != drawable) {
/* 5 */                 this.f4550w = drawable;
/* 8 */                 m2270c(true);
/* 19 */                m2271d(getMeasuredWidth(), getMeasuredHeight());
                    }
                }

                public void setIconGravity(int i) {
/* 3 */             if (this.f4545d0 != i) {
/* 5 */                 this.f4545d0 = i;
/* 15 */                m2271d(getMeasuredWidth(), getMeasuredHeight());
                    }
                }

                public void setIconPadding(int i) {
/* 3 */             if (this.f4541a0 != i) {
/* 5 */                 this.f4541a0 = i;
/* 7 */                 setCompoundDrawablePadding(i);
                    }
                }

                public void setIconResource(int i) {
/* 13 */            setIcon(i != 0 ? mn0.m6700p(getContext(), i) : null);
                }

                public void setIconSize(int i) {
/* 1 */             if (i < 0) {
/* 16 */                C1951n4.m6859j("iconSize cannot be less than 0");
                    } else if (this.f4538U != i) {
/* 7 */                 this.f4538U = i;
/* 10 */                m2270c(true);
                    }
                }

                public void setIconTint(ColorStateList colorStateList) {
/* 3 */             if (this.f4549v != colorStateList) {
/* 5 */                 this.f4549v = colorStateList;
/* 8 */                 m2270c(false);
                    }
                }

                public void setIconTintMode(PorterDuff.Mode mode) {
/* 3 */             if (this.f4548i != mode) {
/* 5 */                 this.f4548i = mode;
/* 8 */                 m2270c(false);
                    }
                }

                public void setIconTintResource(int i) {
/* 9 */             setIconTint(v00.getColorStateList(getContext(), i));
                }

                public void setInsetBottom(int i) {
/* 1 */             uc1 uc1Var = this.f4544d;
/* 5 */             uc1Var.m9001d(uc1Var.f17453e, i);
                }

                public void setInsetTop(int i) {
/* 1 */             uc1 uc1Var = this.f4544d;
/* 5 */             uc1Var.m9001d(i, uc1Var.f17454f);
                }

                public void setInternalBackground(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
                }

                public void setOnPressedChangeListenerInternal(tc1 tc1Var) {
/* 1 */             this.f4547f = tc1Var;
                }

                @Override // android.view.View
                public void setPressed(boolean z) {
/* 1 */             tc1 tc1Var = this.f4547f;
/* 3 */             if (tc1Var != null) {
/* 11 */                ((MaterialButtonToggleGroup) ((fs0) tc1Var).f8339b).invalidate();
                    }
/* 14 */            super.setPressed(z);
                }

                public void setRippleColor(ColorStateList colorStateList) {
/* 5 */             if (m2268a()) {
/* 7 */                 uc1 uc1Var = this.f4544d;
/* 9 */                 MaterialButton materialButton = uc1Var.f17449a;
/* 13 */                if (uc1Var.f17460l != colorStateList) {
/* 15 */                    uc1Var.f17460l = colorStateList;
/* 23 */                    if (materialButton.getBackground() instanceof RippleDrawable) {
/* 35 */                        ((RippleDrawable) materialButton.getBackground()).setColor(c52.m1535b(colorStateList));
                            }
                        }
                    }
                }

                public void setRippleColorResource(int i) {
/* 5 */             if (m2268a()) {
/* 15 */                setRippleColor(v00.getColorStateList(getContext(), i));
                    }
                }

                @Override // p000.ed2
                public void setShapeAppearanceModel(tc2 tc2Var) {
/* 5 */             if (m2268a()) {
/* 9 */                 this.f4544d.m9000c(tc2Var);
                    } else {
/* 15 */                f42.m3656l("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
                    }
                }

                public void setShouldDrawSurfaceColorStroke(boolean z) {
/* 5 */             if (m2268a()) {
/* 7 */                 uc1 uc1Var = this.f4544d;
/* 9 */                 uc1Var.f17462n = z;
/* 11 */                uc1Var.m9003f();
                    }
                }

                public void setStrokeColor(ColorStateList colorStateList) {
/* 5 */             if (m2268a()) {
/* 7 */                 uc1 uc1Var = this.f4544d;
/* 11 */                if (uc1Var.f17459k != colorStateList) {
/* 13 */                    uc1Var.f17459k = colorStateList;
/* 15 */                    uc1Var.m9003f();
                        }
                    }
                }

                public void setStrokeColorResource(int i) {
/* 5 */             if (m2268a()) {
/* 15 */                setStrokeColor(v00.getColorStateList(getContext(), i));
                    }
                }

                public void setStrokeWidth(int i) {
/* 5 */             if (m2268a()) {
/* 7 */                 uc1 uc1Var = this.f4544d;
/* 11 */                if (uc1Var.f17456h != i) {
/* 13 */                    uc1Var.f17456h = i;
/* 15 */                    uc1Var.m9003f();
                        }
                    }
                }

                public void setStrokeWidthResource(int i) {
/* 5 */             if (m2268a()) {
/* 15 */                setStrokeWidth(getResources().getDimensionPixelSize(i));
                    }
                }

                @Override // androidx.appcompat.widget.AppCompatButton
                public void setSupportBackgroundTintList(ColorStateList colorStateList) {
/* 5 */             if (!m2268a()) {
/* 32 */                super.setSupportBackgroundTintList(colorStateList);
/* 35 */                return;
                    }
/* 7 */             uc1 uc1Var = this.f4544d;
/* 11 */            if (uc1Var.f17458j != colorStateList) {
/* 13 */                uc1Var.f17458j = colorStateList;
/* 20 */                if (uc1Var.m8999b(false) != null) {
/* 28 */                    s90.m8448h(uc1Var.m8999b(false), uc1Var.f17458j);
                        }
                    }
                }

                @Override // androidx.appcompat.widget.AppCompatButton
                public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
/* 5 */             if (!m2268a()) {
/* 36 */                super.setSupportBackgroundTintMode(mode);
/* 39 */                return;
                    }
/* 7 */             uc1 uc1Var = this.f4544d;
/* 11 */            if (uc1Var.f17457i != mode) {
/* 13 */                uc1Var.f17457i = mode;
/* 20 */                if (uc1Var.m8999b(false) == null || uc1Var.f17457i == null) {
/* 35 */                    return;
                        }
/* 32 */                s90.m8449i(uc1Var.m8999b(false), uc1Var.f17457i);
                    }
                }

                @Override // android.view.View
                public void setTextAlignment(int i) {
/* 1 */             super.setTextAlignment(i);
/* 12 */            m2271d(getMeasuredWidth(), getMeasuredHeight());
                }

                @Override // android.widget.Checkable
                public final void toggle() {
/* 5 */             setChecked(!this.f4542b0);
                }

/* 327 */       public MaterialButton(Context context, AttributeSet attributeSet) {
/* 328 */           this(context, attributeSet, R$attr.materialButtonStyle);
                }
            }
