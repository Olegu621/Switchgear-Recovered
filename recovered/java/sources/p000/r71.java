            package p000;

            import android.animation.ObjectAnimator;
            import android.content.Context;
            import android.view.animation.AnimationUtils;
            import android.view.animation.Interpolator;
            import com.google.android.material.R$animator;
            import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class r71 extends kx0 {

                /* JADX INFO: renamed from: l */
                public static final int[] f15898l = {533, 567, 850, 750};

                /* JADX INFO: renamed from: m */
                public static final int[] f15899m = {1267, 1000, 333, 0};

                /* JADX INFO: renamed from: n */
                public static final C1938ms f15900n = new C1938ms("animationFraction", Float.class, 16);

                /* JADX INFO: renamed from: d */
                public ObjectAnimator f15901d;

                /* JADX INFO: renamed from: e */
                public ObjectAnimator f15902e;

                /* JADX INFO: renamed from: f */
                public final Interpolator[] f15903f;

                /* JADX INFO: renamed from: g */
                public final LinearProgressIndicatorSpec f15904g;

                /* JADX INFO: renamed from: h */
                public int f15905h;

                /* JADX INFO: renamed from: i */
                public boolean f15906i;

                /* JADX INFO: renamed from: j */
                public float f15907j;

                /* JADX INFO: renamed from: k */
                public C1965ni f15908k;

                public r71(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
/* 2 */             super(2);
/* 6 */             this.f15905h = 0;
/* 9 */             this.f15908k = null;
/* 11 */            this.f15904g = linearProgressIndicatorSpec;
/* 50 */            this.f15903f = new Interpolator[]{AnimationUtils.loadInterpolator(context, R$animator.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R$animator.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R$animator.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R$animator.linear_indeterminate_line2_tail_interpolator)};
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: a */
                public final void mo6292a() {
/* 1 */             ObjectAnimator objectAnimator = this.f15901d;
/* 3 */             if (objectAnimator != null) {
/* 5 */                 objectAnimator.cancel();
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: n */
                public final void mo6295n() {
/* 2 */             this.f15905h = 0;
/* 16 */            int iM9772j = xe2.m9772j(this.f15904g.f14764c[0], ((lx0) this.f13033a).f19528U);
/* 22 */            int[] iArr = (int[]) this.f13035c;
/* 24 */            iArr[0] = iM9772j;
/* 27 */            iArr[1] = iM9772j;
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: r */
                public final void mo6299r(C1965ni c1965ni) {
/* 1 */             this.f15908k = c1965ni;
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: s */
                public final void mo6300s() {
/* 1 */             ObjectAnimator objectAnimator = this.f15902e;
/* 3 */             if (objectAnimator == null || objectAnimator.isRunning()) {
/* 60 */                return;
                    }
/* 12 */            mo6292a();
/* 23 */            if (((lx0) this.f13033a).isVisible()) {
/* 40 */                this.f15902e.setFloatValues(this.f15907j, 1.0f);
/* 52 */                this.f15902e.setDuration((long) ((1.0f - this.f15907j) * 1800.0f));
/* 57 */                this.f15902e.start();
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: u */
                public final void mo6301u() {
/* 1 */             ObjectAnimator objectAnimator = this.f15901d;
/* 7 */             C1938ms c1938ms = f15900n;
/* 9 */             if (objectAnimator == null) {
/* 17 */                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, c1938ms, 0.0f, 1.0f);
/* 21 */                this.f15901d = objectAnimatorOfFloat;
/* 23 */                objectAnimatorOfFloat.setDuration(1800L);
/* 28 */                this.f15901d.setInterpolator(null);
/* 34 */                this.f15901d.setRepeatCount(-1);
/* 44 */                this.f15901d.addListener(new q71(this, 0));
                    }
/* 50 */            if (this.f15902e == null) {
/* 58 */                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, c1938ms, 1.0f);
/* 62 */                this.f15902e = objectAnimatorOfFloat2;
/* 64 */                objectAnimatorOfFloat2.setDuration(1800L);
/* 69 */                this.f15902e.setInterpolator(null);
/* 79 */                this.f15902e.addListener(new q71(this, 1));
                    }
/* 82 */            this.f15905h = 0;
/* 96 */            int iM9772j = xe2.m9772j(this.f15904g.f14764c[0], ((lx0) this.f13033a).f19528U);
/* 102 */           int[] iArr = (int[]) this.f13035c;
/* 104 */           iArr[0] = iM9772j;
/* 106 */           iArr[1] = iM9772j;
/* 110 */           this.f15901d.start();
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: w */
                public final void mo6303w() {
/* 2 */             this.f15908k = null;
                }
            }
