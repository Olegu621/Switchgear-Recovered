            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.media.ImageWriter;
            import androidx.camera.core.ImageProcessingUtil;
            import java.nio.ByteBuffer;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class rv0 implements nw0 {

                /* JADX INFO: renamed from: Y */
                public ByteBuffer f16307Y;

                /* JADX INFO: renamed from: Z */
                public ByteBuffer f16308Z;

                /* JADX INFO: renamed from: a */
                public C2357x6 f16309a;

                /* JADX INFO: renamed from: a0 */
                public ByteBuffer f16310a0;

                /* JADX INFO: renamed from: b */
                public volatile int f16311b;

                /* JADX INFO: renamed from: b0 */
                public ByteBuffer f16312b0;

                /* JADX INFO: renamed from: c */
                public volatile int f16313c;

                /* JADX INFO: renamed from: e */
                public volatile boolean f16317e;

                /* JADX INFO: renamed from: f */
                public volatile boolean f16318f;

                /* JADX INFO: renamed from: i */
                public Executor f16319i;

                /* JADX INFO: renamed from: v */
                public C1767ir f16320v;

                /* JADX INFO: renamed from: w */
                public ImageWriter f16321w;

                /* JADX INFO: renamed from: d */
                public volatile int f16315d = 1;

                /* JADX INFO: renamed from: U */
                public Rect f16303U = new Rect();

                /* JADX INFO: renamed from: V */
                public Rect f16304V = new Rect();

                /* JADX INFO: renamed from: W */
                public Matrix f16305W = new Matrix();

                /* JADX INFO: renamed from: X */
                public Matrix f16306X = new Matrix();

                /* JADX INFO: renamed from: c0 */
                public final Object f16314c0 = new Object();

                /* JADX INFO: renamed from: d0 */
                public boolean f16316d0 = true;

                /* JADX INFO: renamed from: a */
                public abstract mw0 mo8258a(ow0 ow0Var);

                /* JADX INFO: renamed from: b */
                public final s81 m8259b(mw0 mw0Var) throws Throwable {
                    Object obj;
                    Executor executor;
                    C2357x6 c2357x6;
                    boolean z;
                    C1767ir c1767ir;
                    ImageWriter imageWriter;
                    ByteBuffer byteBuffer;
                    ByteBuffer byteBuffer2;
                    ByteBuffer byteBuffer3;
                    ByteBuffer byteBuffer4;
                    vv0 vv0Var;
                    vv0 vv0VarM449e;
/* 14 */            int i = this.f16317e ? this.f16311b : 0;
/* 15 */            Object obj2 = this.f16314c0;
                    synchronized (obj2) {
                        try {
                            try {
/* 18 */                        executor = this.f16319i;
/* 20 */                        c2357x6 = this.f16309a;
/* 37 */                        z = this.f16317e && i != this.f16313c;
/* 38 */                        if (z) {
/* 40 */                            m8264h(mw0Var, i);
                                }
/* 45 */                        if (this.f16317e) {
/* 47 */                            m8261d(mw0Var);
                                }
                                try {
/* 51 */                            c1767ir = this.f16320v;
                                    try {
/* 54 */                                imageWriter = this.f16321w;
/* 56 */                                byteBuffer = this.f16307Y;
                                        try {
/* 59 */                                    byteBuffer2 = this.f16308Z;
/* 61 */                                    byteBuffer3 = this.f16310a0;
/* 64 */                                    byteBuffer4 = this.f16312b0;
                                        } catch (Throwable th) {
/* 238 */                                   th = th;
/* 239 */                                   obj = obj2;
/* 247 */                                   throw th;
                                        }
                                    } catch (Throwable th2) {
/* 241 */                               th = th2;
/* 242 */                               obj = obj2;
                                    }
                                } catch (Throwable th3) {
/* 244 */                           th = th3;
/* 245 */                           obj = obj2;
                                }
                            } catch (Throwable th4) {
/* 33 */                        th = th4;
/* 34 */                        obj = obj2;
                            }
                        } catch (Throwable th5) {
/* 236 */                   th = th5;
                        }
                    }
/* 67 */            if (c2357x6 == null || executor == null || !this.f16316d0) {
/* 232 */               return new tw0(new kq1("No analyzer or executor currently set."), 1);
                    }
/* 75 */            if (c1767ir == null) {
/* 115 */               vv0Var = null;
                    } else {
/* 80 */                if (this.f16315d == 2) {
/* 84 */                    vv0VarM449e = ImageProcessingUtil.m446b(mw0Var, c1767ir, byteBuffer, i, this.f16318f);
                        } else {
/* 92 */                    if (this.f16315d == 1) {
/* 96 */                        if (this.f16318f) {
/* 98 */                            ImageProcessingUtil.m445a(mw0Var);
                                }
/* 101 */                       if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
/* 110 */                           vv0VarM449e = ImageProcessingUtil.m449e(mw0Var, c1767ir, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                                }
                            }
/* 115 */                   vv0Var = null;
                        }
/* 88 */                vv0Var = vv0VarM449e;
                    }
/* 116 */           boolean z2 = vv0Var == null;
/* 124 */           mw0 mw0Var2 = z2 ? mw0Var : vv0Var;
/* 127 */           Rect rect = new Rect();
/* 132 */           Matrix matrix = new Matrix();
                    synchronized (this.f16314c0) {
/* 138 */               if (z && !z2) {
                            try {
/* 158 */                       m8263g(mw0Var.getWidth(), mw0Var.getHeight(), mw0Var2.getWidth(), mw0Var2.getHeight());
                            } catch (Throwable th6) {
/* 222 */                       throw th6;
                            }
                        }
/* 164 */               this.f16313c = i;
/* 168 */               rect.set(this.f16304V);
/* 173 */               matrix.set(this.f16306X);
                    }
/* 179 */           C2260um c2260um = new C2260um();
/* 187 */           c2260um.f17592c = new u32();
/* 191 */           C2466xm c2466xm = new C2466xm(c2260um);
/* 194 */           c2260um.f17591b = c2466xm;
/* 198 */           c2260um.f17590a = AbstractC0886en.class;
                    try {
/* 208 */               executor.execute(new qv0(this, mw0Var, matrix, mw0Var2, rect, c2357x6, c2260um));
/* 213 */               c2260um.f17590a = "analyzeImage";
/* 215 */               return c2466xm;
                    } catch (Exception e) {
/* 217 */               c2466xm.m9977b(e);
/* 220 */               return c2466xm;
                    }
                }

                /* JADX INFO: renamed from: c */
                public abstract void mo8260c();

                /* JADX INFO: renamed from: d */
                public final void m8261d(mw0 mw0Var) {
/* 4 */             if (this.f16315d != 1) {
/* 87 */                if (this.f16315d == 2 && this.f16307Y == null) {
/* 108 */                   this.f16307Y = ByteBuffer.allocateDirect(mw0Var.getHeight() * mw0Var.getWidth() * 4);
/* 110 */                   return;
                        }
/* 110 */               return;
                    }
/* 8 */             if (this.f16308Z == null) {
/* 23 */                this.f16308Z = ByteBuffer.allocateDirect(mw0Var.getHeight() * mw0Var.getWidth());
                    }
/* 28 */            this.f16308Z.position(0);
/* 33 */            if (this.f16310a0 == null) {
/* 50 */                this.f16310a0 = ByteBuffer.allocateDirect((mw0Var.getHeight() * mw0Var.getWidth()) / 4);
                    }
/* 54 */            this.f16310a0.position(0);
/* 59 */            if (this.f16312b0 == null) {
/* 76 */                this.f16312b0 = ByteBuffer.allocateDirect((mw0Var.getHeight() * mw0Var.getWidth()) / 4);
                    }
/* 80 */            this.f16312b0.position(0);
                }

                /* JADX INFO: renamed from: e */
                public abstract void mo8262e(mw0 mw0Var);

                @Override // p000.nw0
                /* JADX INFO: renamed from: f */
                public final void mo6871f(ow0 ow0Var) {
                    try {
/* 1 */                 mw0 mw0VarMo8258a = mo8258a(ow0Var);
/* 5 */                 if (mw0VarMo8258a != null) {
/* 7 */                     mo8262e(mw0VarMo8258a);
                        }
                    } catch (IllegalStateException e) {
/* 16 */                hu0.m4326U("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m8263g(int i, int i2, int i3, int i4) {
/* 1 */             int i5 = this.f16311b;
/* 5 */             Matrix matrix = new Matrix();
/* 8 */             if (i5 > 0) {
/* 15 */                RectF rectF = new RectF(0.0f, 0.0f, i, i2);
/* 18 */                RectF rectF2 = cr2.f6893a;
/* 20 */                Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
/* 22 */                matrix.setRectToRect(rectF, rectF2, scaleToFit);
/* 26 */                matrix.postRotate(i5);
/* 33 */                RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
/* 38 */                Matrix matrix2 = new Matrix();
/* 41 */                matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
/* 44 */                matrix.postConcat(matrix2);
                    }
/* 51 */            RectF rectF4 = new RectF(this.f16303U);
/* 54 */            matrix.mapRect(rectF4);
/* 59 */            Rect rect = new Rect();
/* 62 */            rectF4.round(rect);
/* 65 */            this.f16304V = rect;
/* 71 */            this.f16306X.setConcat(this.f16305W, matrix);
                }

                /* JADX INFO: renamed from: h */
                public final void m8264h(mw0 mw0Var, int i) {
/* 1 */             C1767ir c1767ir = this.f16320v;
/* 3 */             if (c1767ir == null) {
/* 91 */                return;
                    }
/* 6 */             c1767ir.m5547j();
/* 9 */             int width = mw0Var.getWidth();
/* 13 */            int height = mw0Var.getHeight();
/* 19 */            int iMo3809a = this.f16320v.mo3809a();
/* 25 */            int iMo3812g = this.f16320v.mo3812g();
/* 41 */            boolean z = i == 90 || i == 270;
/* 46 */            int i2 = z ? height : width;
/* 47 */            if (!z) {
/* 50 */                width = height;
                    }
/* 60 */            this.f16320v = new C1767ir(i13.m4433j(i2, width, iMo3809a, iMo3812g));
/* 64 */            if (this.f16315d == 1) {
/* 66 */                ImageWriter imageWriter = this.f16321w;
/* 68 */                if (imageWriter != null) {
/* 70 */                    imageWriter.close();
                        }
/* 89 */                this.f16321w = ImageWriter.newInstance(this.f16320v.getSurface(), this.f16320v.mo3812g());
                    }
                }
            }
