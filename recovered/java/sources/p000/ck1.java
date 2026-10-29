            package p000;

            import androidx.constraintlayout.motion.widget.MotionLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ck1 extends ak1 {

                /* JADX INFO: renamed from: a */
                public float f2970a = 0.0f;

                /* JADX INFO: renamed from: b */
                public float f2971b = 0.0f;

                /* JADX INFO: renamed from: c */
                public float f2972c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ MotionLayout f2973d;

                public ck1(MotionLayout motionLayout) {
/* 4 */             this.f2973d = motionLayout;
                }

                @Override // p000.ak1
                /* JADX INFO: renamed from: a */
                public final float mo299a() {
/* 3 */             return this.f2973d.f914j0;
                }

                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
/* 1 */             float f2 = this.f2970a;
/* 6 */             float f3 = this.f2972c;
/* 10 */            MotionLayout motionLayout = this.f2973d;
/* 12 */            if (f2 > 0.0f) {
/* 14 */                float f4 = f2 / f3;
/* 18 */                if (f4 < f) {
/* 20 */                    f = f4;
                        }
/* 21 */                float f5 = f3 * f;
/* 24 */                motionLayout.f914j0 = f2 - f5;
/* 32 */                return ((f2 * f) - ((f5 * f) / 2.0f)) + this.f2971b;
                    }
/* 35 */            float f6 = (-f2) / f3;
/* 38 */            if (f6 < f) {
/* 40 */                f = f6;
                    }
/* 41 */            float f7 = f3 * f;
/* 44 */            motionLayout.f914j0 = f7 + f2;
/* 52 */            return ((f7 * f) / 2.0f) + (f2 * f) + this.f2971b;
                }
            }
