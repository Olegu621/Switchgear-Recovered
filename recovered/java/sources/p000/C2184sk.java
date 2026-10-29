            package p000;

            import android.animation.ValueAnimator;
            import android.view.View;
            import android.widget.TextView;
            import com.google.android.material.appbar.CollapsingToolbarLayout;
            import com.google.android.material.bottomsheet.BottomSheetBehavior;
            import com.google.android.material.tabs.TabLayout;
            import com.google.android.material.textfield.TextInputLayout;
            
            /* JADX INFO: renamed from: sk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2184sk implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16661a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f16662b;

                public /* synthetic */ C2184sk(Object obj, int i) {
/* 1 */             this.f16661a = i;
/* 3 */             this.f16662b = obj;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
/* 1 */             int i = this.f16661a;
/* 3 */             Object obj = this.f16662b;
                    switch (i) {
                        case 0:
/* 140 */                   float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
/* 146 */                   fd1 fd1Var = ((BottomSheetBehavior) obj).f4511h;
/* 148 */                   if (fd1Var != null) {
/* 150 */                       fd1Var.m3743o(fFloatValue);
                            }
                            break;
                        case 1:
/* 130 */                   ((CollapsingToolbarLayout) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            break;
                        case 2:
/* 114 */                   ((za0) obj).f7139c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        case 3:
/* 96 */                    ((View) obj).invalidate();
                            break;
                        case 4:
/* 75 */                    int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
/* 76 */                    ah0 ah0Var = (ah0) obj;
/* 80 */                    ah0Var.f262c.setAlpha(iFloatValue);
/* 85 */                    ah0Var.f263d.setAlpha(iFloatValue);
/* 90 */                    ah0Var.f278s.invalidate();
                            break;
                        case 5:
/* 58 */                    ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                            break;
                        case 6:
/* 41 */                    ((TextInputLayout) obj).f5066n1.m7061q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        default:
/* 14 */                    float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
/* 18 */                    TextView textView = (TextView) obj;
/* 20 */                    textView.setScaleX(fFloatValue2);
/* 23 */                    textView.setScaleY(fFloatValue2);
                            break;
                    }
                }
            }
