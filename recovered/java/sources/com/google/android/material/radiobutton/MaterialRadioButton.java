            package com.google.android.material.radiobutton;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import androidx.appcompat.widget.AppCompatRadioButton;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import p000.AbstractC1944my;
            import p000.de3;
            import p000.hd1;
            import p000.rn2;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 52 */    public class MaterialRadioButton extends AppCompatRadioButton {

                /* JADX INFO: renamed from: i */
                public static final int f4863i = R$style.Widget_MaterialComponents_CompoundButton_RadioButton;

                /* JADX INFO: renamed from: v */
                public static final int[][] f4864v = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

                /* JADX INFO: renamed from: e */
                public ColorStateList f4865e;

                /* JADX INFO: renamed from: f */
                public boolean f4866f;

                /* JADX WARN: Illegal instructions before constructor call */
                public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = f4863i;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 10 */            Context context2 = getContext();
/* 21 */            TypedArray typedArrayM8213d = rn2.m8213d(context2, attributeSet, R$styleable.MaterialRadioButton, i, i2, new int[0]);
/* 31 */            if (typedArrayM8213d.hasValue(R$styleable.MaterialRadioButton_buttonTint)) {
/* 39 */                AbstractC1944my.m6813c(this, de3.m3033o(context2, typedArrayM8213d, R$styleable.MaterialRadioButton_buttonTint));
                    }
/* 48 */            this.f4866f = typedArrayM8213d.getBoolean(R$styleable.MaterialRadioButton_useMaterialThemeColors, false);
/* 50 */            typedArrayM8213d.recycle();
                }

                private ColorStateList getMaterialThemeColorsTintList() {
/* 3 */             if (this.f4865e == null) {
/* 7 */                 int iM9779q = xe2.m9779q(R$attr.colorControlActivated, this);
/* 13 */                int iM9779q2 = xe2.m9779q(R$attr.colorOnSurface, this);
/* 19 */                int iM9779q3 = xe2.m9779q(R$attr.colorSurface, this);
/* 58 */                this.f4865e = new ColorStateList(f4864v, new int[]{xe2.m9757A(iM9779q3, 1.0f, iM9779q), xe2.m9757A(iM9779q3, 0.54f, iM9779q2), xe2.m9757A(iM9779q3, 0.38f, iM9779q2), xe2.m9757A(iM9779q3, 0.38f, iM9779q2)});
                    }
/* 60 */            return this.f4865e;
                }

                @Override // android.widget.TextView, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             if (this.f4866f && AbstractC1944my.m6811a(this) == null) {
/* 15 */                setUseMaterialThemeColors(true);
                    }
                }

                public void setUseMaterialThemeColors(boolean z) {
/* 1 */             this.f4866f = z;
/* 3 */             if (z) {
/* 9 */                 AbstractC1944my.m6813c(this, getMaterialThemeColorsTintList());
                    } else {
/* 14 */                AbstractC1944my.m6813c(this, null);
                    }
                }

/* 53 */        public MaterialRadioButton(Context context, AttributeSet attributeSet) {
/* 54 */            this(context, attributeSet, R$attr.radioButtonStyle);
                }
            }
