            package com.google.android.material.slider;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.view.ViewGroup;
            import android.view.ViewOverlay;
            import p000.dq2;
            import p000.fs0;
            import p000.kb1;
            
            /* JADX INFO: renamed from: com.google.android.material.slider.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0373c extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ BaseSlider f4932a;

                public C0373c(BaseSlider baseSlider) {
/* 1 */             this.f4932a = baseSlider;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 1 */             super.onAnimationEnd(animator);
/* 4 */             BaseSlider baseSlider = this.f4932a;
/* 16 */            for (dq2 dq2Var : baseSlider.f4882V) {
/* 24 */                ViewGroup viewGroupM6034G = kb1.m6034G(baseSlider);
/* 42 */                ((ViewOverlay) (viewGroupM6034G == null ? null : new fs0(viewGroupM6034G)).f8339b).remove(dq2Var);
                    }
                }
            }
