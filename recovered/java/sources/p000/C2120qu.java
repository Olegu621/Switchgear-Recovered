            package p000;

            import android.animation.ObjectAnimator;
            import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
            
            /* JADX INFO: renamed from: qu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2120qu extends kx0 {

                /* JADX INFO: renamed from: l */
                public static final int[] f15738l = {0, 1350, 2700, 4050};

                /* JADX INFO: renamed from: m */
                public static final int[] f15739m = {667, 2017, 3367, 4717};

                /* JADX INFO: renamed from: n */
                public static final int[] f15740n = {1000, 2350, 3700, 5050};

                /* JADX INFO: renamed from: o */
                public static final C1938ms f15741o = new C1938ms("animationFraction", Float.class, 8);

                /* JADX INFO: renamed from: p */
                public static final C1938ms f15742p = new C1938ms("completeEndFraction", Float.class, 9);

                /* JADX INFO: renamed from: d */
                public ObjectAnimator f15743d;

                /* JADX INFO: renamed from: e */
                public ObjectAnimator f15744e;

                /* JADX INFO: renamed from: f */
                public final xg0 f15745f;

                /* JADX INFO: renamed from: g */
                public final CircularProgressIndicatorSpec f15746g;

                /* JADX INFO: renamed from: h */
                public int f15747h;

                /* JADX INFO: renamed from: i */
                public float f15748i;

                /* JADX INFO: renamed from: j */
                public float f15749j;

                /* JADX INFO: renamed from: k */
                public C1965ni f15750k;

                public C2120qu(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
/* 2 */             super(1);
/* 6 */             this.f15747h = 0;
/* 9 */             this.f15750k = null;
/* 11 */            this.f15746g = circularProgressIndicatorSpec;
/* 18 */            this.f15745f = new xg0();
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: a */
                public final void mo6292a() {
/* 1 */             ObjectAnimator objectAnimator = this.f15743d;
/* 3 */             if (objectAnimator != null) {
/* 5 */                 objectAnimator.cancel();
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: n */
                public final void mo6295n() {
/* 2 */             this.f15747h = 0;
/* 24 */            ((int[]) this.f13035c)[0] = xe2.m9772j(this.f15746g.f14764c[0], ((lx0) this.f13033a).f19528U);
/* 27 */            this.f15749j = 0.0f;
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: r */
                public final void mo6299r(C1965ni c1965ni) {
/* 1 */             this.f15750k = c1965ni;
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: s */
                public final void mo6300s() {
/* 1 */             ObjectAnimator objectAnimator = this.f15744e;
/* 3 */             if (objectAnimator == null || objectAnimator.isRunning()) {
/* 31 */                return;
                    }
/* 20 */            if (((lx0) this.f13033a).isVisible()) {
/* 24 */                this.f15744e.start();
                    } else {
/* 28 */                mo6292a();
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: u */
                public final void mo6301u() {
/* 5 */             if (this.f15743d == null) {
/* 14 */                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f15741o, 0.0f, 1.0f);
/* 18 */                this.f15743d = objectAnimatorOfFloat;
/* 22 */                objectAnimatorOfFloat.setDuration(5400L);
/* 28 */                this.f15743d.setInterpolator(null);
/* 34 */                this.f15743d.setRepeatCount(-1);
/* 44 */                this.f15743d.addListener(new C2083pu(this, 0));
                    }
/* 49 */            if (this.f15744e == null) {
/* 58 */                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f15742p, 0.0f, 1.0f);
/* 62 */                this.f15744e = objectAnimatorOfFloat2;
/* 66 */                objectAnimatorOfFloat2.setDuration(333L);
/* 73 */                this.f15744e.setInterpolator(this.f15745f);
/* 84 */                this.f15744e.addListener(new C2083pu(this, 1));
                    }
/* 87 */            this.f15747h = 0;
/* 109 */           ((int[]) this.f13035c)[0] = xe2.m9772j(this.f15746g.f14764c[0], ((lx0) this.f13033a).f19528U);
/* 112 */           this.f15749j = 0.0f;
/* 116 */           this.f15743d.start();
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: w */
                public final void mo6303w() {
/* 2 */             this.f15750k = null;
                }
            }
