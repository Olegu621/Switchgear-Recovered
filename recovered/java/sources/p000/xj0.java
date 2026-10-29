            package p000;

            import android.animation.ValueAnimator;
            import android.graphics.Matrix;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xj0 implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ float f19203a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ float f19204b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ float f19205c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ float f19206d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ float f19207e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ float f19208f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ float f19209g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ Matrix f19210h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ bk0 f19211i;

                public xj0(bk0 bk0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
/* 4 */             this.f19211i = bk0Var;
/* 6 */             this.f19203a = f;
/* 8 */             this.f19204b = f2;
/* 10 */            this.f19205c = f3;
/* 12 */            this.f19206d = f4;
/* 14 */            this.f19207e = f5;
/* 16 */            this.f19208f = f6;
/* 18 */            this.f19209g = f7;
/* 20 */            this.f19210h = matrix;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
/* 7 */             float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
/* 11 */            bk0 bk0Var = this.f19211i;
/* 13 */            FloatingActionButton floatingActionButton = bk0Var.f2487u;
/* 27 */            floatingActionButton.setAlpha(AbstractC2246u8.m8971b(this.f19203a, this.f19204b, 0.0f, 0.2f, fFloatValue));
/* 30 */            float f = this.f19205c;
/* 32 */            float f2 = this.f19206d;
/* 38 */            floatingActionButton.setScaleX(AbstractC2246u8.m8970a(f, f2, fFloatValue));
/* 47 */            floatingActionButton.setScaleY(AbstractC2246u8.m8970a(this.f19207e, f2, fFloatValue));
/* 50 */            float f3 = this.f19208f;
/* 52 */            float f4 = this.f19209g;
/* 58 */            bk0Var.f2481o = AbstractC2246u8.m8970a(f3, f4, fFloatValue);
/* 60 */            float fM8970a = AbstractC2246u8.m8970a(f3, f4, fFloatValue);
/* 64 */            Matrix matrix = this.f19210h;
/* 66 */            bk0Var.m1382a(fM8970a, matrix);
/* 69 */            floatingActionButton.setImageMatrix(matrix);
                }
            }
