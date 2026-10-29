            package com.google.android.material.progressindicator;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$styleable;
            import p000.AbstractC2002oi;
            import p000.de3;
            import p000.rn2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 78 */    public final class CircularProgressIndicatorSpec extends AbstractC2002oi {

                /* JADX INFO: renamed from: g */
                public int f4844g;

                /* JADX INFO: renamed from: h */
                public int f4845h;

                /* JADX INFO: renamed from: i */
                public int f4846i;

                /* JADX WARN: Illegal instructions before constructor call */
                public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = CircularProgressIndicator.f4843a0;
/* 3 */             super(context, attributeSet, i, i2);
/* 12 */            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.mtrl_progress_circular_size_medium);
/* 22 */            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.mtrl_progress_circular_inset_medium);
/* 26 */            int[] iArr = R$styleable.CircularProgressIndicator;
/* 31 */            rn2.m8210a(context, attributeSet, i, i2);
/* 37 */            rn2.m8211b(context, attributeSet, iArr, i, i2, new int[0]);
/* 40 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
/* 58 */            this.f4844g = Math.max(de3.m3034p(context, typedArrayObtainStyledAttributes, R$styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.f14762a * 2);
/* 66 */            this.f4845h = de3.m3034p(context, typedArrayObtainStyledAttributes, R$styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
/* 74 */            this.f4846i = typedArrayObtainStyledAttributes.getInt(R$styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
/* 76 */            typedArrayObtainStyledAttributes.recycle();
                }

                @Override // p000.AbstractC2002oi
                /* JADX INFO: renamed from: a */
                public final void mo2348a() {
                }

/* 79 */        public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
/* 80 */            this(context, attributeSet, R$attr.circularProgressIndicatorStyle);
                }
            }
