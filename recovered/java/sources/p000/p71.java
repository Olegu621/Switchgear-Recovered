            package p000;

            import android.animation.ObjectAnimator;
            import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class p71 extends kx0 {

                /* JADX INFO: renamed from: j */
                public static final C1938ms f15003j = new C1938ms("animationFraction", Float.class, 15);

                /* JADX INFO: renamed from: d */
                public ObjectAnimator f15004d;

                /* JADX INFO: renamed from: e */
                public final xg0 f15005e;

                /* JADX INFO: renamed from: f */
                public final LinearProgressIndicatorSpec f15006f;

                /* JADX INFO: renamed from: g */
                public int f15007g;

                /* JADX INFO: renamed from: h */
                public boolean f15008h;

                /* JADX INFO: renamed from: i */
                public float f15009i;

                public p71(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
/* 2 */             super(3);
/* 6 */             this.f15007g = 1;
/* 8 */             this.f15006f = linearProgressIndicatorSpec;
/* 15 */            this.f15005e = new xg0();
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: a */
                public final void mo6292a() {
/* 1 */             ObjectAnimator objectAnimator = this.f15004d;
/* 3 */             if (objectAnimator != null) {
/* 5 */                 objectAnimator.cancel();
                    }
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: n */
                public final void mo6295n() {
/* 2 */             this.f15008h = true;
/* 4 */             this.f15007g = 1;
/* 27 */            Arrays.fill((int[]) this.f13035c, xe2.m9772j(this.f15006f.f14764c[0], ((lx0) this.f13033a).f19528U));
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: r */
                public final void mo6299r(C1965ni c1965ni) {
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: s */
                public final void mo6300s() {
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: u */
                public final void mo6301u() {
/* 3 */             if (this.f15004d == null) {
/* 13 */                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f15003j, 0.0f, 1.0f);
/* 17 */                this.f15004d = objectAnimatorOfFloat;
/* 21 */                objectAnimatorOfFloat.setDuration(333L);
/* 27 */                this.f15004d.setInterpolator(null);
/* 33 */                this.f15004d.setRepeatCount(-1);
/* 44 */                this.f15004d.addListener(new C2315w1(this, 6));
                    }
/* 48 */            this.f15008h = true;
/* 50 */            this.f15007g = 1;
/* 73 */            Arrays.fill((int[]) this.f13035c, xe2.m9772j(this.f15006f.f14764c[0], ((lx0) this.f13033a).f19528U));
/* 78 */            this.f15004d.start();
                }

                @Override // p000.kx0
                /* JADX INFO: renamed from: w */
                public final void mo6303w() {
                }
            }
