            package p000;

            import android.graphics.Bitmap;
            import android.graphics.SurfaceTexture;
            import android.opengl.GLES20;
            import android.opengl.Matrix;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.util.Size;
            import android.view.Surface;
            import androidx.camera.core.ImageProcessingUtil;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class x60 implements SurfaceTexture.OnFrameAvailableListener {

                /* JADX INFO: renamed from: a */
                public final jq1 f18962a;

                /* JADX INFO: renamed from: b */
                public final HandlerThread f18963b;

                /* JADX INFO: renamed from: c */
                public final nt0 f18964c;

                /* JADX INFO: renamed from: d */
                public final Handler f18965d;

                /* JADX INFO: renamed from: e */
                public final AtomicBoolean f18966e;

                /* JADX INFO: renamed from: f */
                public final float[] f18967f;

                /* JADX INFO: renamed from: g */
                public final float[] f18968g;

                /* JADX INFO: renamed from: h */
                public final LinkedHashMap f18969h;

                /* JADX INFO: renamed from: i */
                public int f18970i;

                /* JADX INFO: renamed from: j */
                public boolean f18971j;

                /* JADX INFO: renamed from: k */
                public final ArrayList f18972k;

                public x60(mb0 mb0Var) {
/* 1 */             Map map = Collections.EMPTY_MAP;
/* 12 */            this.f18966e = new AtomicBoolean(false);
/* 18 */            this.f18967f = new float[16];
/* 22 */            this.f18968g = new float[16];
/* 29 */            this.f18969h = new LinkedHashMap();
/* 31 */            this.f18970i = 0;
/* 33 */            this.f18971j = false;
/* 40 */            this.f18972k = new ArrayList();
/* 46 */            HandlerThread handlerThread = new HandlerThread("GL Thread");
/* 49 */            this.f18963b = handlerThread;
/* 51 */            handlerThread.start();
/* 60 */            Handler handler = new Handler(handlerThread.getLooper());
/* 63 */            this.f18965d = handler;
/* 70 */            this.f18964c = new nt0(handler);
/* 77 */            this.f18962a = new jq1();
                    try {
/* 79 */                m9719e(mb0Var);
                    } catch (RuntimeException e) {
/* 84 */                m9720f();
/* 87 */                throw e;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m9715a() {
/* 3 */             if (this.f18971j && this.f18970i == 0) {
/* 9 */                 LinkedHashMap linkedHashMap = this.f18969h;
/* 15 */                Iterator it = linkedHashMap.keySet().iterator();
/* 23 */                while (it.hasNext()) {
/* 31 */                    ((mj2) it.next()).close();
                        }
/* 37 */                Iterator it2 = this.f18972k.iterator();
/* 45 */                if (it2.hasNext()) {
/* 82 */                    ((AbstractC1962nf) it2.next()).getClass();
/* 89 */                    new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
/* 93 */                    throw null;
                        }
/* 47 */                linkedHashMap.clear();
/* 50 */                jq1 jq1Var = this.f18962a;
/* 59 */                if (jq1Var.f12424a.getAndSet(false)) {
/* 64 */                    sp0.m8592c(jq1Var.f12426c);
/* 67 */                    jq1Var.m5888h();
                        }
/* 72 */                this.f18963b.quit();
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m9716b(Runnable runnable, Runnable runnable2) {
                    try {
/* 9 */                 this.f18964c.execute(new RunnableC2558zo(5, this, runnable2, runnable));
                    } catch (RejectedExecutionException e) {
/* 18 */                hu0.m4317I0("DefaultSurfaceProcessor", "Unable to executor runnable", e);
/* 21 */                runnable2.run();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m9717c(Exception exc) {
/* 1 */             ArrayList arrayList = this.f18972k;
/* 3 */             Iterator it = arrayList.iterator();
/* 11 */            if (it.hasNext()) {
/* 23 */                ((AbstractC1962nf) it.next()).getClass();
/* 27 */                throw null;
                    }
/* 13 */            arrayList.clear();
                }

                /* JADX INFO: renamed from: d */
                public final Bitmap m9718d(Size size, float[] fArr, int i) {
/* 7 */             float[] fArr2 = (float[]) fArr.clone();
/* 10 */            w11.m9456z(i, fArr2);
/* 13 */            w11.m9391A(fArr2);
/* 18 */            Size sizeM2875e = cr2.m2875e(size, i);
/* 24 */            jq1 jq1Var = this.f18962a;
/* 26 */            jq1Var.getClass();
/* 40 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeM2875e.getHeight() * sizeM2875e.getWidth() * 4);
/* 67 */            de3.m3023e("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeM2875e.getHeight() * sizeM2875e.getWidth()) * 4);
/* 76 */            de3.m3023e("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
/* 79 */            int[] iArr = sp0.f16728a;
/* 81 */            int[] iArr2 = new int[1];
/* 83 */            GLES20.glGenTextures(1, iArr2, 0);
/* 88 */            sp0.m8591b("glGenTextures");
/* 91 */            int i2 = iArr2[0];
/* 96 */            GLES20.glActiveTexture(33985);
/* 101 */           sp0.m8591b("glActiveTexture");
/* 106 */           GLES20.glBindTexture(3553, i2);
/* 111 */           sp0.m8591b("glBindTexture");
/* 136 */           GLES20.glTexImage2D(3553, 0, 6407, sizeM2875e.getWidth(), sizeM2875e.getHeight(), 0, 6407, 5121, null);
/* 141 */           sp0.m8591b("glTexImage2D");
/* 148 */           GLES20.glTexParameteri(3553, 10240, 9729);
/* 153 */           GLES20.glTexParameteri(3553, 10241, 9729);
/* 156 */           int[] iArr3 = new int[1];
/* 158 */           GLES20.glGenFramebuffers(1, iArr3, 0);
/* 163 */           sp0.m8591b("glGenFramebuffers");
/* 166 */           int i3 = iArr3[0];
/* 171 */           GLES20.glBindFramebuffer(36160, i3);
/* 176 */           sp0.m8591b("glBindFramebuffer");
/* 182 */           GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
/* 187 */           sp0.m8591b("glFramebufferTexture2D");
/* 193 */           GLES20.glActiveTexture(33984);
/* 196 */           sp0.m8591b("glActiveTexture");
/* 204 */           GLES20.glBindTexture(36197, jq1Var.f12436m);
/* 207 */           sp0.m8591b("glBindTexture");
/* 211 */           jq1Var.f12432i = null;
/* 221 */           GLES20.glViewport(0, 0, sizeM2875e.getWidth(), sizeM2875e.getHeight());
/* 232 */           GLES20.glScissor(0, 0, sizeM2875e.getWidth(), sizeM2875e.getHeight());
/* 235 */           qp0 qp0Var = jq1Var.f12434k;
/* 237 */           qp0Var.getClass();
/* 242 */           if (qp0Var instanceof rp0) {
/* 248 */               GLES20.glUniformMatrix4fv(((rp0) qp0Var).f16217f, 1, false, fArr2, 0);
/* 253 */               sp0.m8591b("glUniformMatrix4fv");
                    }
/* 257 */           GLES20.glDrawArrays(5, 0, 4);
/* 262 */           sp0.m8591b("glDrawArrays");
/* 290 */           GLES20.glReadPixels(0, 0, sizeM2875e.getWidth(), sizeM2875e.getHeight(), 6408, 5121, byteBufferAllocateDirect);
/* 295 */           sp0.m8591b("glReadPixels");
/* 298 */           GLES20.glBindFramebuffer(36160, 0);
/* 305 */           GLES20.glDeleteTextures(1, new int[]{i2}, 0);
/* 310 */           sp0.m8591b("glDeleteTextures");
/* 317 */           GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
/* 322 */           sp0.m8591b("glDeleteFramebuffers");
/* 325 */           int i4 = jq1Var.f12436m;
/* 327 */           GLES20.glActiveTexture(33984);
/* 330 */           sp0.m8591b("glActiveTexture");
/* 333 */           GLES20.glBindTexture(36197, i4);
/* 336 */           sp0.m8591b("glBindTexture");
/* 349 */           Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeM2875e.getWidth(), sizeM2875e.getHeight(), Bitmap.Config.ARGB_8888);
/* 353 */           byteBufferAllocateDirect.rewind();
/* 362 */           ImageProcessingUtil.m447c(bitmapCreateBitmap, byteBufferAllocateDirect, sizeM2875e.getWidth() * 4);
/* 365 */           return bitmapCreateBitmap;
                }

                /* JADX INFO: renamed from: e */
                public final void m9719e(mb0 mb0Var) {
/* 1 */             Map map = Collections.EMPTY_MAP;
/* 7 */             C2260um c2260um = new C2260um();
/* 15 */            c2260um.f17592c = new u32();
/* 19 */            C2466xm c2466xm = new C2466xm(c2260um);
/* 22 */            c2260um.f17591b = c2466xm;
/* 26 */            c2260um.f17590a = AbstractC0886en.class;
                    try {
/* 39 */                m9716b(new RunnableC2558zo(this, mb0Var, c2260um), new RunnableC0981h7(1));
/* 42 */                c2260um.f17590a = "Init GlRenderer";
                    } catch (Exception e) {
/* 46 */                c2466xm.m9977b(e);
                    }
                    try {
/* 49 */                c2466xm.get();
                    } catch (InterruptedException | ExecutionException e2) {
/* 53 */                e = e2;
/* 56 */                if (e instanceof ExecutionException) {
/* 58 */                    e = e.getCause();
                        }
/* 64 */                if (!(e instanceof RuntimeException)) {
/* 76 */                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                        }
/* 68 */                throw ((RuntimeException) e);
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m9720f() {
/* 8 */             if (this.f18966e.getAndSet(true)) {
/* 10 */                return;
                    }
/* 24 */            m9716b(new RunnableC2166s2(this, 15), new RunnableC0981h7(1));
                }

                /* JADX INFO: renamed from: g */
                public final void m9721g(zr2 zr2Var) {
/* 1 */             ArrayList arrayList = this.f18972k;
/* 7 */             if (arrayList.isEmpty()) {
/* 9 */                 return;
                    }
/* 10 */            if (zr2Var == null) {
/* 19 */                m9717c(new Exception("Failed to snapshot: no JPEG Surface."));
/* 22 */                return;
                    }
                    try {
/* 25 */                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
/* 28 */                    Iterator it = arrayList.iterator();
/* 36 */                    if (!it.hasNext()) {
/* 38 */                        byteArrayOutputStream.close();
/* 41 */                        return;
                            }
/* 50 */                    ((AbstractC1962nf) it.next()).getClass();
/* 62 */                    Bitmap bitmapM9718d = m9718d((Size) zr2Var.f20307b, (float[]) zr2Var.f20308c, 0);
/* 66 */                    byteArrayOutputStream.reset();
/* 71 */                    bitmapM9718d.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
/* 74 */                    byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 80 */                    Surface surface = (Surface) zr2Var.f20306a;
/* 82 */                    Objects.requireNonNull(byteArray);
/* 85 */                    ImageProcessingUtil.m450f(byteArray, surface);
/* 89 */                    throw null;
                        } catch (Throwable th) {
                            try {
/* 91 */                        byteArrayOutputStream.close();
                            } catch (Throwable th2) {
/* 96 */                        th.addSuppressed(th2);
                            }
/* 99 */                    throw th;
                        }
                    } catch (IOException e) {
/* 100 */               m9717c(e);
                    }
/* 100 */           m9717c(e);
                }

                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
/* 7 */             if (this.f18966e.get()) {
/* 149 */               return;
                    }
/* 11 */            surfaceTexture.updateTexImage();
/* 14 */            float[] fArr = this.f18967f;
/* 16 */            surfaceTexture.getTransformMatrix(fArr);
/* 30 */            zr2 zr2Var = null;
/* 35 */            for (Map.Entry entry : this.f18969h.entrySet()) {
/* 48 */                Surface surface = (Surface) entry.getValue();
/* 54 */                mj2 mj2Var = (mj2) entry.getKey();
/* 56 */                float[] fArr2 = mj2Var.f13818e;
/* 59 */                float[] fArr3 = this.f18968g;
/* 63 */                Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
/* 66 */                int i = mj2Var.f13816c;
/* 70 */                if (i == 34) {
                            try {
/* 78 */                        this.f18962a.m5890j(surfaceTexture.getTimestamp(), fArr3, surface);
                            } catch (RuntimeException e) {
/* 87 */                        hu0.m4326U("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                            }
                        } else {
/* 114 */                   de3.m3028j("Unsupported format: " + i, i == 256);
/* 122 */                   de3.m3028j("Only one JPEG output is supported.", zr2Var == null);
/* 135 */                   zr2Var = new zr2(surface, mj2Var.f13817d, (float[]) fArr3.clone());
                        }
                    }
                    try {
/* 140 */               m9721g(zr2Var);
                    } catch (RuntimeException e2) {
/* 146 */               m9717c(e2);
                    }
                }
            }
