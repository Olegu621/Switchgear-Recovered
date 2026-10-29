            package p000;

            import android.animation.AnimatorSet;
            import android.animation.ValueAnimator;
            import android.view.animation.LinearInterpolator;
            import android.widget.EditText;
            import com.google.android.material.R$drawable;
            import com.google.android.material.R$string;
            import com.google.android.material.textfield.TextInputLayout;
            import java.util.LinkedHashSet;
            
            /* JADX INFO: renamed from: qv */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2121qv extends de0 {

                /* JADX INFO: renamed from: e */
                public final C1867kv f15764e;

                /* JADX INFO: renamed from: f */
                public final ViewOnFocusChangeListenerC1904lv f15765f;

                /* JADX INFO: renamed from: g */
                public final C1941mv f15766g;

                /* JADX INFO: renamed from: h */
                public final C1978nv f15767h;

                /* JADX INFO: renamed from: i */
                public AnimatorSet f15768i;

                /* JADX INFO: renamed from: j */
                public ValueAnimator f15769j;

                public C2121qv(TextInputLayout textInputLayout, int i) {
/* 1 */             super(textInputLayout, i);
/* 6 */             int i2 = 0;
/* 10 */            this.f15764e = new C1867kv(this, 0);
/* 17 */            this.f15765f = new ViewOnFocusChangeListenerC1904lv(this, i2);
/* 24 */            this.f15766g = new C1941mv(this, i2);
/* 31 */            this.f15767h = new C1978nv(this, 0);
                }

                /* JADX INFO: renamed from: d */
                public static boolean m8018d(C2121qv c2121qv) {
/* 3 */             EditText editText = c2121qv.f7137a.getEditText();
/* 7 */             if (editText != null) {
                        return (editText.hasFocus() || c2121qv.f7139c.hasFocus()) && editText.getText().length() > 0;
                    }
/* 35 */            return false;
                }

                @Override // p000.de0
                /* JADX INFO: renamed from: a */
                public final void mo3010a() {
/* 1 */             int i = this.f7140d;
/* 3 */             if (i == 0) {
/* 5 */                 i = R$drawable.mtrl_ic_cancel;
                    }
/* 7 */             TextInputLayout textInputLayout = this.f7137a;
/* 9 */             textInputLayout.setEndIconDrawable(i);
/* 22 */            textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R$string.clear_text_end_icon_content_description));
/* 25 */            int i2 = 0;
/* 26 */            textInputLayout.setEndIconCheckable(false);
/* 35 */            textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC2239u1(this, 2));
/* 38 */            LinkedHashSet linkedHashSet = textInputLayout.f5015M0;
/* 40 */            C1941mv c1941mv = this.f15766g;
/* 42 */            linkedHashSet.add(c1941mv);
/* 47 */            if (textInputLayout.f5044e != null) {
/* 49 */                c1941mv.m6810a(textInputLayout);
                    }
/* 56 */            textInputLayout.f5019Q0.add(this.f15767h);
/* 64 */            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
/* 70 */            valueAnimatorOfFloat.setInterpolator(AbstractC2246u8.f17413d);
/* 75 */            valueAnimatorOfFloat.setDuration(150L);
/* 84 */            valueAnimatorOfFloat.addUpdateListener(new C2084pv(this, 1));
/* 92 */            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
/* 96 */            LinearInterpolator linearInterpolator = AbstractC2246u8.f17410a;
/* 98 */            valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
/* 103 */           valueAnimatorOfFloat2.setDuration(100L);
/* 111 */           valueAnimatorOfFloat2.addUpdateListener(new C2084pv(this, 0));
/* 116 */           AnimatorSet animatorSet = new AnimatorSet();
/* 119 */           this.f15768i = animatorSet;
/* 127 */           animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
/* 137 */           this.f15768i.addListener(new C2047ov(this, i2));
/* 145 */           ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
/* 149 */           valueAnimatorOfFloat3.setInterpolator(linearInterpolator);
/* 152 */           valueAnimatorOfFloat3.setDuration(100L);
/* 160 */           valueAnimatorOfFloat3.addUpdateListener(new C2084pv(this, 0));
/* 163 */           this.f15769j = valueAnimatorOfFloat3;
/* 170 */           valueAnimatorOfFloat3.addListener(new C2047ov(this, 1));
                }

                @Override // p000.de0
                /* JADX INFO: renamed from: c */
                public final void mo3012c(boolean z) {
/* 7 */             if (this.f7137a.getSuffixText() == null) {
/* 9 */                 return;
                    }
/* 10 */            m8019e(z);
                }

                /* JADX INFO: renamed from: e */
                public final void m8019e(boolean z) {
/* 11 */            boolean z2 = this.f7137a.m2404g() == z;
/* 12 */            if (z && !this.f15768i.isRunning()) {
/* 24 */                this.f15769j.cancel();
/* 29 */                this.f15768i.start();
/* 32 */                if (z2) {
/* 36 */                    this.f15768i.end();
/* 39 */                    return;
                        }
/* 59 */                return;
                    }
/* 40 */            if (z) {
/* 59 */                return;
                    }
/* 44 */            this.f15768i.cancel();
/* 49 */            this.f15769j.start();
/* 52 */            if (z2) {
/* 56 */                this.f15769j.end();
                    }
                }
            }
