            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pc1 extends dc0 {

                /* JADX INFO: renamed from: a0 */
                public final float f15063a0;

                public pc1(float f) {
/* 2 */             super(0);
/* 9 */             this.f15063a0 = f - 0.001f;
                }

                @Override // p000.dc0
                /* JADX INFO: renamed from: h */
                public final void mo2993h(float f, float f2, float f3, dd2 dd2Var) {
/* 1 */             double d = this.f15063a0;
/* 12 */            float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
/* 27 */            float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
/* 42 */            dd2Var.m3009e(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, 0.0f);
/* 53 */            dd2Var.m3008d(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
/* 66 */            dd2Var.m3008d(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
                }
            }
