            package p000;

            import androidx.constraintlayout.motion.widget.MotionLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fk1 {

                /* JADX INFO: renamed from: a */
                public float f8248a = Float.NaN;

                /* JADX INFO: renamed from: b */
                public float f8249b = Float.NaN;

                /* JADX INFO: renamed from: c */
                public int f8250c = -1;

                /* JADX INFO: renamed from: d */
                public int f8251d = -1;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ MotionLayout f8252e;

                public fk1(MotionLayout motionLayout) {
/* 4 */             this.f8252e = motionLayout;
                }

                /* JADX INFO: renamed from: a */
                public final void m3770a() {
/* 1 */             int i = this.f8250c;
/* 3 */             MotionLayout motionLayout = this.f8252e;
/* 6 */             if (i != -1 || this.f8251d != -1) {
/* 12 */                int i2 = this.f8251d;
/* 14 */                if (i == -1) {
/* 16 */                    motionLayout.m470A(i2);
                        } else if (i2 == -1) {
/* 22 */                    motionLayout.m486x(i);
                        } else {
/* 26 */                    motionLayout.m487y(i, i2);
                        }
/* 31 */                motionLayout.setState(hk1.f9120b);
                    }
/* 36 */            boolean zIsNaN = Float.isNaN(this.f8249b);
/* 40 */            float f = this.f8248a;
/* 42 */            if (zIsNaN) {
/* 48 */                if (Float.isNaN(f)) {
/* 50 */                    return;
                        }
/* 53 */                motionLayout.setProgress(this.f8248a);
                    } else {
/* 59 */                motionLayout.m485w(f, this.f8249b);
/* 64 */                this.f8248a = Float.NaN;
/* 66 */                this.f8249b = Float.NaN;
/* 68 */                this.f8250c = -1;
/* 70 */                this.f8251d = -1;
                    }
                }
            }
