            package p000;

            import android.graphics.Rect;
            import android.view.animation.Interpolator;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class d53 {

                /* JADX INFO: renamed from: a */
                public final int f7002a;

                /* JADX INFO: renamed from: b */
                public final int f7003b;

                /* JADX INFO: renamed from: c */
                public final zj1 f7004c;

                /* JADX INFO: renamed from: d */
                public final int f7005d;

                /* JADX INFO: renamed from: f */
                public final C0168b5 f7007f;

                /* JADX INFO: renamed from: g */
                public final Interpolator f7008g;

                /* JADX INFO: renamed from: i */
                public float f7010i;

                /* JADX INFO: renamed from: j */
                public float f7011j;

                /* JADX INFO: renamed from: m */
                public final boolean f7014m;

                /* JADX INFO: renamed from: e */
                public final d31 f7006e = new d31();

                /* JADX INFO: renamed from: h */
                public boolean f7009h = false;

                /* JADX INFO: renamed from: l */
                public final Rect f7013l = new Rect();

                /* JADX INFO: renamed from: k */
                public long f7012k = System.nanoTime();

                public d53(C0168b5 c0168b5, zj1 zj1Var, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
/* 21 */            this.f7014m = false;
/* 23 */            this.f7007f = c0168b5;
/* 25 */            this.f7004c = zj1Var;
/* 27 */            this.f7005d = i2;
/* 39 */            if (((ArrayList) c0168b5.f2214e) == null) {
/* 46 */                c0168b5.f2214e = new ArrayList();
                    }
/* 52 */            ((ArrayList) c0168b5.f2214e).add(this);
/* 55 */            this.f7008g = interpolator;
/* 57 */            this.f7002a = i4;
/* 59 */            this.f7003b = i5;
/* 62 */            if (i3 == 3) {
/* 65 */                this.f7014m = true;
                    }
/* 77 */            this.f7011j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
/* 79 */            m2943a();
                }

                /* JADX INFO: renamed from: a */
                public final void m2943a() {
/* 1 */             boolean z = this.f7009h;
/* 4 */             int i = this.f7003b;
/* 6 */             int i2 = this.f7002a;
/* 8 */             Interpolator interpolator = this.f7008g;
/* 16 */            zj1 zj1Var = this.f7004c;
/* 18 */            C0168b5 c0168b5 = this.f7007f;
/* 20 */            if (z) {
/* 22 */                long jNanoTime = System.nanoTime();
/* 28 */                long j = jNanoTime - this.f7012k;
/* 30 */                this.f7012k = jNanoTime;
/* 40 */                float f = this.f7010i - (((float) (j * 1.0E-6d)) * this.f7011j);
/* 41 */                this.f7010i = f;
/* 46 */                if (f < 0.0f) {
/* 48 */                    this.f7010i = 0.0f;
                        }
/* 50 */                float interpolation = this.f7010i;
/* 52 */                if (interpolator != null) {
/* 56 */                    interpolation = interpolator.getInterpolation(interpolation);
                        }
/* 65 */                boolean zM10362e = zj1Var.m10362e(interpolation, jNanoTime, this.f7006e, zj1Var.f20177b);
/* 73 */                if (this.f7010i <= 0.0f) {
/* 75 */                    if (i2 != -1) {
/* 87 */                        zj1Var.f20177b.setTag(i2, Long.valueOf(System.nanoTime()));
                            }
/* 90 */                    if (i != -1) {
/* 94 */                        zj1Var.f20177b.setTag(i, null);
                            }
/* 101 */                   ((ArrayList) c0168b5.f2215f).add(this);
                        }
/* 108 */               if (this.f7010i > 0.0f || zM10362e) {
/* 116 */                   ((MotionLayout) c0168b5.f2211b).invalidate();
/* 119 */                   return;
                        }
/* 216 */               return;
                    }
/* 120 */           long jNanoTime2 = System.nanoTime();
/* 126 */           long j2 = jNanoTime2 - this.f7012k;
/* 128 */           this.f7012k = jNanoTime2;
/* 138 */           float f2 = (((float) (j2 * 1.0E-6d)) * this.f7011j) + this.f7010i;
/* 139 */           this.f7010i = f2;
/* 145 */           if (f2 >= 1.0f) {
/* 147 */               this.f7010i = 1.0f;
                    }
/* 149 */           float interpolation2 = this.f7010i;
/* 151 */           if (interpolator != null) {
/* 155 */               interpolation2 = interpolator.getInterpolation(interpolation2);
                    }
/* 164 */           boolean zM10362e2 = zj1Var.m10362e(interpolation2, jNanoTime2, this.f7006e, zj1Var.f20177b);
/* 172 */           if (this.f7010i >= 1.0f) {
/* 174 */               if (i2 != -1) {
/* 186 */                   zj1Var.f20177b.setTag(i2, Long.valueOf(System.nanoTime()));
                        }
/* 189 */               if (i != -1) {
/* 193 */                   zj1Var.f20177b.setTag(i, null);
                        }
/* 198 */               if (!this.f7014m) {
/* 204 */                   ((ArrayList) c0168b5.f2215f).add(this);
                        }
                    }
/* 211 */           if (this.f7010i < 1.0f || zM10362e2) {
/* 221 */               ((MotionLayout) c0168b5.f2211b).invalidate();
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m2944b() {
/* 2 */             this.f7009h = true;
/* 5 */             int i = this.f7005d;
/* 7 */             if (i != -1) {
/* 19 */                this.f7011j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
                    }
/* 27 */            ((MotionLayout) this.f7007f.f2211b).invalidate();
/* 34 */            this.f7012k = System.nanoTime();
                }
            }
