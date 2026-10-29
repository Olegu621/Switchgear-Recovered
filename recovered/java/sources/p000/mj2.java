            package p000;

            import android.graphics.RectF;
            import android.opengl.Matrix;
            import android.util.Size;
            import android.view.Surface;
            import java.io.Closeable;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mj2 implements Closeable {

                /* JADX INFO: renamed from: U */
                public final C2466xm f13812U;

                /* JADX INFO: renamed from: V */
                public final C2260um f13813V;

                /* JADX INFO: renamed from: b */
                public final Surface f13815b;

                /* JADX INFO: renamed from: c */
                public final int f13816c;

                /* JADX INFO: renamed from: d */
                public final Size f13817d;

                /* JADX INFO: renamed from: e */
                public final float[] f13818e;

                /* JADX INFO: renamed from: f */
                public c00 f13819f;

                /* JADX INFO: renamed from: i */
                public Executor f13820i;

                /* JADX INFO: renamed from: a */
                public final Object f13814a = new Object();

                /* JADX INFO: renamed from: v */
                public boolean f13821v = false;

                /* JADX INFO: renamed from: w */
                public boolean f13822w = false;

                public mj2(Surface surface, int i, Size size, C2180sg c2180sg, C2180sg c2180sg2) {
/* 15 */            float[] fArr = new float[16];
/* 17 */            this.f13818e = fArr;
/* 30 */            this.f13815b = surface;
/* 32 */            this.f13816c = i;
/* 34 */            this.f13817d = size;
/* 36 */            m6664c(fArr, new float[16], c2180sg);
/* 39 */            m6664c(new float[16], new float[16], c2180sg2);
/* 44 */            C2260um c2260um = new C2260um();
/* 52 */            c2260um.f17592c = new u32();
/* 56 */            C2466xm c2466xm = new C2466xm(c2260um);
/* 59 */            c2260um.f17591b = c2466xm;
                    try {
/* 61 */                this.f13813V = c2260um;
/* 63 */                c2260um.f17590a = "SurfaceOutputImpl close future complete";
                    } catch (Exception e) {
/* 67 */                c2466xm.m9977b(e);
                    }
/* 70 */            this.f13812U = c2466xm;
                }

                /* JADX INFO: renamed from: c */
                public static void m6664c(float[] fArr, float[] fArr2, C2180sg c2180sg) {
/* 2 */             Matrix.setIdentityM(fArr, 0);
/* 5 */             if (c2180sg == null) {
/* 7 */                 return;
                    }
/* 8 */             Size size = c2180sg.f16575a;
/* 10 */            boolean z = c2180sg.f16579e;
/* 12 */            int i = c2180sg.f16578d;
/* 14 */            w11.m9391A(fArr);
/* 18 */            w11.m9456z(i, fArr);
/* 26 */            if (z) {
/* 28 */                Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
/* 31 */                Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
                    }
/* 34 */            Size sizeM2875e = cr2.m2875e(size, i);
/* 68 */            android.graphics.Matrix matrixM2871a = cr2.m2871a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, sizeM2875e.getWidth(), sizeM2875e.getHeight()), i, z);
/* 76 */            RectF rectF = new RectF(c2180sg.f16576b);
/* 79 */            matrixM2871a.mapRect(rectF);
/* 89 */            float width = rectF.left / sizeM2875e.getWidth();
/* 108 */           float height = ((sizeM2875e.getHeight() - rectF.height()) - rectF.top) / sizeM2875e.getHeight();
/* 118 */           float fWidth = rectF.width() / sizeM2875e.getWidth();
/* 128 */           float fHeight = rectF.height() / sizeM2875e.getHeight();
/* 129 */           Matrix.translateM(fArr, 0, width, height, 0.0f);
/* 132 */           Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
/* 135 */           InterfaceC2559zp interfaceC2559zp = c2180sg.f16577c;
/* 137 */           Matrix.setIdentityM(fArr2, 0);
/* 140 */           w11.m9391A(fArr2);
/* 143 */           if (interfaceC2559zp != null) {
/* 151 */               de3.m3028j("Camera has no transform.", interfaceC2559zp.mo8072k());
/* 163 */               w11.m9456z(interfaceC2559zp.mo8073m().mo309a(), fArr2);
/* 174 */               if (interfaceC2559zp.mo8073m().mo312d() == 0) {
/* 176 */                   Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
/* 179 */                   Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
                        }
                    }
/* 182 */           Matrix.invertM(fArr2, 0, fArr2, 0);
/* 191 */           Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    synchronized (this.f13814a) {
                        try {
/* 6 */                     if (!this.f13822w) {
/* 9 */                         this.f13822w = true;
                            }
                        } catch (Throwable th) {
/* 23 */                    throw th;
                        }
                    }
/* 18 */            this.f13813V.m9040a(null);
                }

                /* JADX INFO: renamed from: f */
                public final Surface m6665f(nt0 nt0Var, c00 c00Var) {
                    boolean z;
                    synchronized (this.f13814a) {
/* 4 */                 this.f13820i = nt0Var;
/* 6 */                 this.f13819f = c00Var;
/* 8 */                 z = this.f13821v;
                    }
/* 11 */            if (z) {
/* 13 */                m6666g();
                    }
/* 16 */            return this.f13815b;
                }

                /* JADX INFO: renamed from: g */
                public final void m6666g() {
                    Executor executor;
                    c00 c00Var;
/* 3 */             AtomicReference atomicReference = new AtomicReference();
                    synchronized (this.f13814a) {
                        try {
/* 11 */                    if (this.f13820i == null || (c00Var = this.f13819f) == null) {
/* 34 */                        this.f13821v = true;
                            } else if (!this.f13822w) {
/* 22 */                        atomicReference.set(c00Var);
/* 25 */                        executor = this.f13820i;
/* 28 */                        this.f13821v = false;
                            }
/* 36 */                    executor = null;
                        } catch (Throwable th) {
/* 58 */                    throw th;
                        }
                    }
/* 38 */            if (executor != null) {
                        try {
/* 47 */                    executor.execute(new ji1(10, this, atomicReference));
                        } catch (RejectedExecutionException unused) {
/* 53 */                    hu0.m4312F0("SurfaceOutputImpl");
                        }
                    }
                }
            }
