            package com.google.android.material.progressindicator;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$styleable;
            import p000.AbstractC2002oi;
            import p000.C1951n4;
            import p000.rn2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 54 */    public final class LinearProgressIndicatorSpec extends AbstractC2002oi {

                /* JADX INFO: renamed from: g */
                public int f4848g;

                /* JADX INFO: renamed from: h */
                public int f4849h;

                /* JADX INFO: renamed from: i */
                public boolean f4850i;

                /* JADX WARN: Illegal instructions before constructor call */
                public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = LinearProgressIndicator.f4847a0;
/* 3 */             super(context, attributeSet, i, i2);
/* 6 */             int[] iArr = R$styleable.LinearProgressIndicator;
/* 8 */             int i3 = R$attr.linearProgressIndicatorStyle;
/* 13 */            rn2.m8210a(context, attributeSet, i3, i2);
/* 18 */            rn2.m8211b(context, attributeSet, iArr, i3, i2, new int[0]);
/* 21 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i2);
/* 32 */            this.f4848g = typedArrayObtainStyledAttributes.getInt(R$styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
/* 40 */            this.f4849h = typedArrayObtainStyledAttributes.getInt(R$styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
/* 42 */            typedArrayObtainStyledAttributes.recycle();
/* 45 */            mo2348a();
/* 53 */            this.f4850i = this.f4849h == 1;
                }

                @Override // p000.AbstractC2002oi
                /* JADX INFO: renamed from: a */
                public final void mo2348a() {
/* 3 */             if (this.f4848g == 0) {
/* 7 */                 if (this.f14763b > 0) {
/* 24 */                    C1951n4.m6859j("Rounded corners are not supported in contiguous indeterminate animation.");
                        } else {
/* 13 */                    if (this.f14764c.length >= 3) {
/* 27 */                        return;
                            }
/* 18 */                    C1951n4.m6859j("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                        }
                    }
                }

/* 55 */        public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
/* 56 */            this(context, attributeSet, R$attr.linearProgressIndicatorStyle);
                }
            }
