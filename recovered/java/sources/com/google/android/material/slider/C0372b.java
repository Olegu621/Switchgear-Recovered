            package com.google.android.material.slider;

            import android.animation.ValueAnimator;
            import java.util.WeakHashMap;
            import p000.AbstractC2246u8;
            import p000.dq2;
            import p000.e33;
            
            /* JADX INFO: renamed from: com.google.android.material.slider.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0372b implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ BaseSlider f4931a;

                public C0372b(BaseSlider baseSlider) {
/* 4 */             this.f4931a = baseSlider;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
/* 7 */             float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
/* 11 */            BaseSlider baseSlider = this.f4931a;
/* 23 */            for (dq2 dq2Var : baseSlider.f4882V) {
/* 34 */                dq2Var.f7381w0 = 1.2f;
/* 36 */                dq2Var.f7379u0 = fFloatValue;
/* 38 */                dq2Var.f7380v0 = fFloatValue;
/* 50 */                dq2Var.f7382x0 = AbstractC2246u8.m8971b(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
/* 52 */                dq2Var.invalidateSelf();
                    }
/* 56 */            WeakHashMap weakHashMap = e33.f7494a;
/* 58 */            baseSlider.postInvalidateOnAnimation();
                }
            }
