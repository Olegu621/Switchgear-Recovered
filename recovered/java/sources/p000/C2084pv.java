            package p000;

            import android.animation.ValueAnimator;
            import com.google.android.material.internal.CheckableImageButton;
            
            /* JADX INFO: renamed from: pv */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2084pv implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15288a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2121qv f15289b;

                public /* synthetic */ C2084pv(C2121qv c2121qv, int i) {
/* 1 */             this.f15288a = i;
/* 3 */             this.f15289b = c2121qv;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
/* 1 */             int i = this.f15288a;
/* 3 */             C2121qv c2121qv = this.f15289b;
                    switch (i) {
                        case 0:
/* 39 */                    c2121qv.f7139c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        default:
/* 14 */                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
/* 18 */                    CheckableImageButton checkableImageButton = c2121qv.f7139c;
/* 20 */                    checkableImageButton.setScaleX(fFloatValue);
/* 23 */                    checkableImageButton.setScaleY(fFloatValue);
                            break;
                    }
                }
            }
