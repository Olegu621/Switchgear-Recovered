            package p000;

            import android.content.res.Resources;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.animation.AccelerateInterpolator;
            import android.view.animation.AnimationUtils;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class r81 implements View.OnTouchListener {

                /* JADX INFO: renamed from: c0 */
                public static final int f15913c0 = ViewConfiguration.getTapTimeout();

                /* JADX INFO: renamed from: U */
                public final float[] f15914U;

                /* JADX INFO: renamed from: V */
                public final float[] f15915V;

                /* JADX INFO: renamed from: W */
                public boolean f15916W;

                /* JADX INFO: renamed from: X */
                public boolean f15917X;

                /* JADX INFO: renamed from: Y */
                public boolean f15918Y;

                /* JADX INFO: renamed from: Z */
                public boolean f15919Z;

                /* JADX INFO: renamed from: a */
                public final C2365xe f15920a;

                /* JADX INFO: renamed from: a0 */
                public boolean f15921a0;

                /* JADX INFO: renamed from: b */
                public final AccelerateInterpolator f15922b;

                /* JADX INFO: renamed from: b0 */
                public final ra0 f15923b0;

                /* JADX INFO: renamed from: c */
                public final ra0 f15924c;

                /* JADX INFO: renamed from: d */
                public RunnableC2495ye f15925d;

                /* JADX INFO: renamed from: e */
                public final float[] f15926e;

                /* JADX INFO: renamed from: f */
                public final float[] f15927f;

                /* JADX INFO: renamed from: i */
                public final int f15928i;

                /* JADX INFO: renamed from: v */
                public final int f15929v;

                /* JADX INFO: renamed from: w */
                public final float[] f15930w;

                public r81(ra0 ra0Var) {
/* 6 */             C2365xe c2365xe = new C2365xe();
/* 11 */            c2365xe.f19048e = Long.MIN_VALUE;
/* 15 */            c2365xe.f19050g = -1L;
/* 19 */            c2365xe.f19049f = 0L;
/* 21 */            this.f15920a = c2365xe;
/* 28 */            this.f15922b = new AccelerateInterpolator();
/* 31 */            float[] fArr = {0.0f, 0.0f};
/* 36 */            this.f15926e = fArr;
/* 38 */            float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
/* 43 */            this.f15927f = fArr2;
/* 45 */            float[] fArr3 = {0.0f, 0.0f};
/* 50 */            this.f15930w = fArr3;
/* 52 */            float[] fArr4 = {0.0f, 0.0f};
/* 57 */            this.f15914U = fArr4;
/* 59 */            float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
/* 64 */            this.f15915V = fArr5;
/* 66 */            this.f15924c = ra0Var;
/* 76 */            float f = Resources.getSystem().getDisplayMetrics().density;
/* 95 */            float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
/* 97 */            fArr5[0] = f2;
/* 100 */           fArr5[1] = f2;
/* 103 */           float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
/* 104 */           fArr4[0] = f3;
/* 106 */           fArr4[1] = f3;
/* 108 */           this.f15928i = 1;
/* 113 */           fArr2[0] = Float.MAX_VALUE;
/* 115 */           fArr2[1] = Float.MAX_VALUE;
/* 120 */           fArr[0] = 0.2f;
/* 122 */           fArr[1] = 0.2f;
/* 127 */           fArr3[0] = 0.001f;
/* 129 */           fArr3[1] = 0.001f;
/* 133 */           this.f15929v = f15913c0;
/* 137 */           c2365xe.f19044a = 500;
/* 139 */           c2365xe.f19045b = 500;
/* 141 */           this.f15923b0 = ra0Var;
                }

                /* JADX INFO: renamed from: b */
                public static float m8081b(float f, float f2, float f3) {
/* 3 */             if (f > f3) {
/* 5 */                 return f3;
                    }
                    return f < f2 ? f2 : f;
                }

                /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:13:0x003c  */
                /* JADX WARN: Code duplicated, block: B:15:0x004b  */
                /* JADX WARN: Code duplicated, block: B:17:0x0051  */
                /* JADX INFO: renamed from: a */
                public final float m8082a(float f, float f2, float f3, int i) {
                    float fM8081b;
                    float interpolation;
/* 11 */            float fM8081b2 = m8081b(this.f15926e[i] * f2, 0.0f, this.f15927f[i]);
/* 24 */            float fM8083c = m8083c(f2 - f, fM8081b2) - m8083c(f, fM8081b2);
/* 27 */            AccelerateInterpolator accelerateInterpolator = this.f15922b;
/* 29 */            if (fM8083c >= 0.0f) {
/* 40 */                if (fM8083c > 0.0f) {
/* 42 */                    interpolation = accelerateInterpolator.getInterpolation(fM8083c);
                        } else {
/* 55 */                    fM8081b = 0.0f;
                        }
/* 58 */                if (fM8081b == 0.0f) {
/* 10 */                    return 0.0f;
                        }
/* 63 */                float f4 = this.f15930w[i];
/* 67 */                float f5 = this.f15914U[i];
/* 71 */                float f6 = this.f15915V[i];
/* 73 */                float f7 = f4 * f3;
                        return fM8081b > 0.0f ? m8081b(fM8081b * f7, f5, f6) : -m8081b((-fM8081b) * f7, f5, f6);
                    }
/* 36 */            interpolation = -accelerateInterpolator.getInterpolation(-fM8083c);
/* 50 */            fM8081b = m8081b(interpolation, -1.0f, 1.0f);
/* 58 */            if (fM8081b == 0.0f) {
/* 10 */                return 0.0f;
                    }
/* 63 */            float f8 = this.f15930w[i];
/* 67 */            float f9 = this.f15914U[i];
/* 71 */            float f10 = this.f15915V[i];
/* 73 */            float f11 = f8 * f3;
                    if (fM8081b > 0.0f) {
                    }
                }

                /* JADX INFO: renamed from: c */
                public final float m8083c(float f, float f2) {
/* 4 */             if (f2 != 0.0f) {
/* 8 */                 int i = this.f15928i;
/* 10 */                if (i == 0 || i == 1) {
/* 27 */                    if (f < f2) {
/* 33 */                        if (f >= 0.0f) {
/* 36 */                            return 1.0f - (f / f2);
                                }
/* 40 */                        if (this.f15919Z && i == 1) {
/* 31 */                            return 1.0f;
                                }
                            }
                        } else if (i == 2 && f < 0.0f) {
/* 23 */                    return f / (-f2);
                        }
                    }
/* 1 */             return 0.0f;
                }

                /* JADX INFO: renamed from: d */
                public final void m8084d() {
/* 3 */             int i = 0;
/* 4 */             if (this.f15917X) {
/* 6 */                 this.f15919Z = false;
/* 8 */                 return;
                    }
/* 9 */             long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
/* 13 */            C2365xe c2365xe = this.f15920a;
/* 19 */            int i2 = (int) (jCurrentAnimationTimeMillis - c2365xe.f19048e);
/* 20 */            int i3 = c2365xe.f19045b;
/* 22 */            if (i2 > i3) {
/* 24 */                i = i3;
                    } else if (i2 >= 0) {
/* 29 */                i = i2;
                    }
/* 30 */            c2365xe.f19052i = i;
/* 36 */            c2365xe.f19051h = c2365xe.m9755a(jCurrentAnimationTimeMillis);
/* 38 */            c2365xe.f19050g = jCurrentAnimationTimeMillis;
                }

                /* JADX INFO: renamed from: e */
                public final boolean m8085e() {
                    ra0 ra0Var;
                    int count;
/* 1 */             C2365xe c2365xe = this.f15920a;
/* 3 */             float f = c2365xe.f19047d;
/* 10 */            int iAbs = (int) (f / Math.abs(f));
/* 13 */            Math.abs(c2365xe.f19046c);
/* 17 */            if (iAbs != 0 && (count = (ra0Var = this.f15923b0).getCount()) != 0) {
/* 28 */                int childCount = ra0Var.getChildCount();
/* 32 */                int firstVisiblePosition = ra0Var.getFirstVisiblePosition();
/* 36 */                int i = firstVisiblePosition + childCount;
/* 39 */                if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && ra0Var.getChildAt(0).getTop() >= 0)) : !(i >= count && ra0Var.getChildAt(childCount - 1).getBottom() <= ra0Var.getHeight())) {
/* 38 */                    return true;
                        }
                    }
/* 16 */            return false;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
                
                    if (r0 != 3) goto L30;
                 */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i;
/* 3 */             int i2 = 0;
/* 4 */             if (this.f15921a0) {
/* 8 */                 int actionMasked = motionEvent.getActionMasked();
/* 13 */                if (actionMasked != 0) {
/* 15 */                    if (actionMasked != 1) {
/* 18 */                        if (actionMasked != 2) {
                                }
                            }
/* 24 */                    m8084d();
/* 3 */                     return false;
                        }
/* 28 */                this.f15918Y = true;
/* 30 */                this.f15916W = false;
/* 32 */                float x = motionEvent.getX();
/* 36 */                float width = view.getWidth();
/* 41 */                ra0 ra0Var = this.f15924c;
/* 48 */                float fM8082a = m8082a(x, width, ra0Var.getWidth(), 0);
/* 66 */                float fM8082a2 = m8082a(motionEvent.getY(), view.getHeight(), ra0Var.getHeight(), 1);
/* 70 */                C2365xe c2365xe = this.f15920a;
/* 72 */                c2365xe.f19046c = fM8082a;
/* 74 */                c2365xe.f19047d = fM8082a2;
/* 78 */                if (!this.f15919Z && m8085e()) {
/* 88 */                    if (this.f15925d == null) {
/* 95 */                        this.f15925d = new RunnableC2495ye(this, i2);
                            }
/* 97 */                    this.f15919Z = true;
/* 99 */                    this.f15917X = true;
/* 103 */                   if (this.f15916W || (i = this.f15929v) <= 0) {
/* 120 */                       this.f15925d.run();
                            } else {
/* 109 */                       RunnableC2495ye runnableC2495ye = this.f15925d;
                                long j = i;
/* 112 */                       WeakHashMap weakHashMap = e33.f7494a;
/* 114 */                       ra0Var.postOnAnimationDelayed(runnableC2495ye, j);
                            }
/* 123 */                   this.f15916W = true;
                        }
                    }
/* 3 */             return false;
                }
            }
