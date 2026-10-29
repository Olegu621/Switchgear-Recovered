            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorSet;
            import android.animation.ObjectAnimator;
            import android.animation.StateListAnimator;
            import android.os.Build;
            import android.util.Property;
            import android.view.View;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dk0 extends bk0 {
                @Override // p000.bk0
                /* JADX INFO: renamed from: e */
                public final void mo1385e(float f, float f2, float f3) {
/* 3 */             StateListAnimator stateListAnimator = new StateListAnimator();
/* 12 */            stateListAnimator.addState(bk0.f2461B, m3143j(f, f3));
/* 21 */            stateListAnimator.addState(bk0.f2462C, m3143j(f, f2));
/* 30 */            stateListAnimator.addState(bk0.f2463D, m3143j(f, f2));
/* 39 */            stateListAnimator.addState(bk0.f2464E, m3143j(f, f2));
/* 44 */            AnimatorSet animatorSet = new AnimatorSet();
/* 49 */            ArrayList arrayList = new ArrayList();
/* 53 */            float[] fArr = {f};
/* 58 */            FloatingActionButton floatingActionButton = this.f2487u;
/* 72 */            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L));
/* 81 */            if (Build.VERSION.SDK_INT <= 24) {
/* 101 */               arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
                    }
/* 119 */           arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
/* 130 */           animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
/* 135 */           animatorSet.setInterpolator(bk0.f2460A);
/* 140 */           stateListAnimator.addState(bk0.f2465F, animatorSet);
/* 149 */           stateListAnimator.addState(bk0.f2466G, m3143j(0.0f, 0.0f));
/* 152 */           floatingActionButton.setStateListAnimator(stateListAnimator);
/* 163 */           if (((FloatingActionButton) this.f2488v.f8789a).f4744V || (this.f2472f && floatingActionButton.getSizeDimension() < this.f2477k)) {
/* 178 */               m1389i();
                    }
                }

                /* JADX INFO: renamed from: j */
                public final AnimatorSet m3143j(float f, float f2) {
/* 3 */             AnimatorSet animatorSet = new AnimatorSet();
/* 12 */            FloatingActionButton floatingActionButton = this.f2487u;
/* 46 */            animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
/* 51 */            animatorSet.setInterpolator(bk0.f2460A);
/* 54 */            return animatorSet;
                }
            }
