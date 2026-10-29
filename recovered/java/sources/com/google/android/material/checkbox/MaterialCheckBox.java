            package com.google.android.material.checkbox;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import androidx.appcompat.widget.AppCompatCheckBox;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import p000.AbstractC1944my;
            import p000.AbstractC1981ny;
            import p000.de3;
            import p000.hd1;
            import p000.kb1;
            import p000.rn2;
            import p000.s90;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 61 */    public class MaterialCheckBox extends AppCompatCheckBox {

                /* JADX INFO: renamed from: v */
                public static final int f4571v = R$style.Widget_MaterialComponents_CompoundButton_CheckBox;

                /* JADX INFO: renamed from: w */
                public static final int[][] f4572w = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

                /* JADX INFO: renamed from: e */
                public ColorStateList f4573e;

                /* JADX INFO: renamed from: f */
                public boolean f4574f;

                /* JADX INFO: renamed from: i */
                public boolean f4575i;

                /* JADX WARN: Illegal instructions before constructor call */
                public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = f4571v;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 10 */            Context context2 = getContext();
/* 21 */            TypedArray typedArrayM8213d = rn2.m8213d(context2, attributeSet, R$styleable.MaterialCheckBox, i, i2, new int[0]);
/* 31 */            if (typedArrayM8213d.hasValue(R$styleable.MaterialCheckBox_buttonTint)) {
/* 39 */                AbstractC1944my.m6813c(this, de3.m3033o(context2, typedArrayM8213d, R$styleable.MaterialCheckBox_buttonTint));
                    }
/* 48 */            this.f4574f = typedArrayM8213d.getBoolean(R$styleable.MaterialCheckBox_useMaterialThemeColors, false);
/* 57 */            this.f4575i = typedArrayM8213d.getBoolean(R$styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
/* 59 */            typedArrayM8213d.recycle();
                }

                private ColorStateList getMaterialThemeColorsTintList() {
/* 3 */             if (this.f4573e == null) {
/* 7 */                 int iM9779q = xe2.m9779q(R$attr.colorControlActivated, this);
/* 13 */                int iM9779q2 = xe2.m9779q(R$attr.colorSurface, this);
/* 19 */                int iM9779q3 = xe2.m9779q(R$attr.colorOnSurface, this);
/* 58 */                this.f4573e = new ColorStateList(f4572w, new int[]{xe2.m9757A(iM9779q2, 1.0f, iM9779q), xe2.m9757A(iM9779q2, 0.54f, iM9779q3), xe2.m9757A(iM9779q2, 0.38f, iM9779q3), xe2.m9757A(iM9779q2, 0.38f, iM9779q3)});
                    }
/* 60 */            return this.f4573e;
                }

                @Override // android.widget.TextView, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             if (this.f4574f && AbstractC1944my.m6811a(this) == null) {
/* 15 */                setUseMaterialThemeColors(true);
                    }
                }

                @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
                public final void onDraw(Canvas canvas) {
                    Drawable drawableM7068a;
/* 3 */             if (!this.f4575i || !TextUtils.isEmpty(getText()) || (drawableM7068a = AbstractC1981ny.m7068a(this)) == null) {
/* 85 */                super.onDraw(canvas);
/* 88 */                return;
                    }
/* 41 */            int width = ((getWidth() - drawableM7068a.getIntrinsicWidth()) / 2) * (kb1.m6036J(this) ? -1 : 1);
/* 42 */            int iSave = canvas.save();
/* 48 */            canvas.translate(width, 0.0f);
/* 51 */            super.onDraw(canvas);
/* 54 */            canvas.restoreToCount(iSave);
/* 61 */            if (getBackground() != null) {
/* 63 */                Rect bounds = drawableM7068a.getBounds();
/* 81 */                s90.m8446f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                    }
                }

                public void setCenterIfNoTextEnabled(boolean z) {
/* 1 */             this.f4575i = z;
                }

                public void setUseMaterialThemeColors(boolean z) {
/* 1 */             this.f4574f = z;
/* 3 */             if (z) {
/* 9 */                 AbstractC1944my.m6813c(this, getMaterialThemeColorsTintList());
                    } else {
/* 14 */                AbstractC1944my.m6813c(this, null);
                    }
                }

/* 62 */        public MaterialCheckBox(Context context, AttributeSet attributeSet) {
/* 63 */            this(context, attributeSet, R$attr.checkboxStyle);
                }
            }
