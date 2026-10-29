            package com.google.android.material.switchmaterial;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewParent;
            import androidx.appcompat.widget.SwitchCompat;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import java.util.WeakHashMap;
            import p000.e33;
            import p000.hd1;
            import p000.ic0;
            import p000.rn2;
            import p000.s23;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 48 */    public class SwitchMaterial extends SwitchCompat {

                /* JADX INFO: renamed from: L0 */
                public static final int f4942L0 = R$style.Widget_MaterialComponents_CompoundButton_Switch;

                /* JADX INFO: renamed from: M0 */
                public static final int[][] f4943M0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

                /* JADX INFO: renamed from: H0 */
                public final ic0 f4944H0;

                /* JADX INFO: renamed from: I0 */
                public ColorStateList f4945I0;

                /* JADX INFO: renamed from: J0 */
                public ColorStateList f4946J0;

                /* JADX INFO: renamed from: K0 */
                public boolean f4947K0;

                /* JADX WARN: Illegal instructions before constructor call */
                public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = f4942L0;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 10 */            Context context2 = getContext();
/* 19 */            this.f4944H0 = new ic0(context2);
/* 21 */            int[] iArr = R$styleable.SwitchMaterial;
/* 26 */            rn2.m8210a(context2, attributeSet, i, i2);
/* 31 */            rn2.m8211b(context2, attributeSet, iArr, i, i2, new int[0]);
/* 34 */            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
/* 44 */            this.f4947K0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SwitchMaterial_useMaterialThemeColors, false);
/* 46 */            typedArrayObtainStyledAttributes.recycle();
                }

                private ColorStateList getMaterialThemeColorsThumbTintList() {
/* 3 */             if (this.f4945I0 == null) {
/* 7 */                 int iM9779q = xe2.m9779q(R$attr.colorSurface, this);
/* 13 */                int iM9779q2 = xe2.m9779q(R$attr.colorControlActivated, this);
/* 23 */                float dimension = getResources().getDimension(R$dimen.mtrl_switch_thumb_elevation);
/* 27 */                ic0 ic0Var = this.f4944H0;
/* 31 */                if (ic0Var.f9539a) {
/* 37 */                    float fM8371i = 0.0f;
/* 40 */                    for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
/* 45 */                        WeakHashMap weakHashMap = e33.f7494a;
/* 51 */                        fM8371i += s23.m8371i((View) parent);
                            }
/* 57 */                    dimension += fM8371i;
                        }
/* 58 */                int iM4516a = ic0Var.m4516a(dimension, iM9779q);
/* 86 */                this.f4945I0 = new ColorStateList(f4943M0, new int[]{xe2.m9757A(iM9779q, 1.0f, iM9779q2), iM4516a, xe2.m9757A(iM9779q, 0.38f, iM9779q2), iM4516a});
                    }
/* 88 */            return this.f4945I0;
                }

                private ColorStateList getMaterialThemeColorsTrackTintList() {
/* 3 */             if (this.f4946J0 == null) {
/* 7 */                 int iM9779q = xe2.m9779q(R$attr.colorSurface, this);
/* 13 */                int iM9779q2 = xe2.m9779q(R$attr.colorControlActivated, this);
/* 19 */                int iM9779q3 = xe2.m9779q(R$attr.colorOnSurface, this);
/* 59 */                this.f4946J0 = new ColorStateList(f4943M0, new int[]{xe2.m9757A(iM9779q, 0.54f, iM9779q2), xe2.m9757A(iM9779q, 0.32f, iM9779q3), xe2.m9757A(iM9779q, 0.12f, iM9779q2), xe2.m9757A(iM9779q, 0.12f, iM9779q3)});
                    }
/* 61 */            return this.f4946J0;
                }

                @Override // android.widget.TextView, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             if (this.f4947K0 && getThumbTintList() == null) {
/* 18 */                setThumbTintList(getMaterialThemeColorsThumbTintList());
                    }
/* 23 */            if (this.f4947K0 && getTrackTintList() == null) {
/* 35 */                setTrackTintList(getMaterialThemeColorsTrackTintList());
                    }
                }

                public void setUseMaterialThemeColors(boolean z) {
/* 1 */             this.f4947K0 = z;
/* 3 */             if (z) {
/* 9 */                 setThumbTintList(getMaterialThemeColorsThumbTintList());
/* 16 */                setTrackTintList(getMaterialThemeColorsTrackTintList());
                    } else {
/* 21 */                setThumbTintList(null);
/* 24 */                setTrackTintList(null);
                    }
                }

/* 49 */        public SwitchMaterial(Context context, AttributeSet attributeSet) {
/* 50 */            this(context, attributeSet, R$attr.switchStyle);
                }
            }
