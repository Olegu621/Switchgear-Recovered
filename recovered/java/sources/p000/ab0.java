            package p000;

            import android.graphics.SurfaceTexture;
            import android.opengl.EGL14;
            import android.opengl.EGLExt;
            import android.opengl.EGLSurface;
            import android.opengl.GLES20;
            import android.opengl.Matrix;
            import android.util.Size;
            import android.view.Surface;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Objects;
            import okhttp3.internal.http2.Http2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ab0 extends jq1 {

                /* JADX INFO: renamed from: n */
                public int f156n = -1;

                /* JADX INFO: renamed from: o */
                public int f157o = -1;

                /* JADX INFO: renamed from: p */
                public final xt0 f158p;

                /* JADX INFO: renamed from: q */
                public final xt0 f159q;

                public ab0(xt0 xt0Var, xt0 xt0Var2) {
/* 9 */             this.f158p = xt0Var;
/* 11 */            this.f159q = xt0Var2;
                }

                @Override // p000.jq1
                /* JADX INFO: renamed from: e */
                public final C2253uf mo143e(mb0 mb0Var) {
/* 1 */             Map map = Collections.EMPTY_MAP;
/* 3 */             C2253uf c2253ufMo143e = super.mo143e(mb0Var);
/* 11 */            this.f156n = sp0.m8597h();
/* 17 */            this.f157o = sp0.m8597h();
/* 19 */            return c2253ufMo143e;
                }

                /* JADX INFO: renamed from: l */
                public final void m144l(long j, Surface surface, mj2 mj2Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
/* 4 */             sp0.m8593d(this.f12424a, true);
/* 9 */             sp0.m8592c(this.f12426c);
/* 12 */            HashMap map = this.f12425b;
/* 20 */            de3.m3028j("The surface is not registered.", map.containsKey(surface));
/* 27 */            C0953gg c0953ggM5883b = (C0953gg) map.get(surface);
/* 29 */            Objects.requireNonNull(c0953ggM5883b);
/* 34 */            if (c0953ggM5883b == sp0.f16737j) {
/* 36 */                c0953ggM5883b = m5883b(surface);
/* 40 */                if (c0953ggM5883b == null) {
/* 131 */                   return;
                        } else {
/* 43 */                    map.put(surface, c0953ggM5883b);
                        }
                    }
/* 46 */            C0953gg c0953gg = c0953ggM5883b;
/* 47 */            EGLSurface eGLSurface = c0953gg.f8592a;
/* 51 */            if (surface != this.f12432i) {
/* 53 */                m5886f(eGLSurface);
/* 56 */                this.f12432i = surface;
                    }
/* 61 */            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
/* 66 */            GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
/* 76 */            m145m(c0953gg, mj2Var, surfaceTexture, this.f158p, this.f156n);
/* 84 */            m145m(c0953gg, mj2Var, surfaceTexture2, this.f159q, this.f157o);
/* 89 */            EGLExt.eglPresentationTimeANDROID(this.f12427d, eGLSurface, j);
/* 98 */            if (EGL14.eglSwapBuffers(this.f12427d, eGLSurface)) {
/* 131 */               return;
                    }
/* 124 */           hu0.m4315H0("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
/* 128 */           m5889i(surface, false);
                }

                /* JADX INFO: renamed from: m */
                public final void m145m(C0953gg c0953gg, mj2 mj2Var, SurfaceTexture surfaceTexture, xt0 xt0Var, int i) {
/* 1 */             m5891k(i);
/* 4 */             int i2 = c0953gg.f8593b;
/* 6 */             int i3 = c0953gg.f8594c;
/* 9 */             GLES20.glViewport(0, 0, i2, i3);
/* 12 */            GLES20.glScissor(0, 0, i2, i3);
/* 17 */            float[] fArr = new float[16];
/* 19 */            surfaceTexture.getTransformMatrix(fArr);
/* 22 */            float[] fArr2 = new float[16];
/* 29 */            Matrix.multiplyMM(fArr2, 0, fArr, 0, mj2Var.f13818e, 0);
/* 32 */            qp0 qp0Var = this.f12434k;
/* 34 */            qp0Var.getClass();
/* 42 */            if (qp0Var instanceof rp0) {
/* 49 */                GLES20.glUniformMatrix4fv(((rp0) qp0Var).f16217f, 1, false, fArr2, 0);
/* 52 */                sp0.m8591b("glUniformMatrix4fv");
                    }
/* 58 */            xt0Var.getClass();
/* 68 */            Size size = new Size((int) (i2 * 1.0f), (int) (i3 * 1.0f));
/* 73 */            Size size2 = new Size(i2, i3);
/* 76 */            float[] fArr3 = new float[16];
/* 78 */            Matrix.setIdentityM(fArr3, 0);
/* 81 */            float[] fArr4 = new float[16];
/* 83 */            Matrix.setIdentityM(fArr4, 0);
/* 86 */            float[] fArr5 = new float[16];
/* 88 */            Matrix.setIdentityM(fArr5, 0);
/* 113 */           Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
/* 117 */           Matrix.translateM(fArr4, 0, 0.0f, 0.0f, 0.0f);
/* 123 */           Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
/* 128 */           GLES20.glUniformMatrix4fv(qp0Var.f15679b, 1, false, fArr5, 0);
/* 131 */           sp0.m8591b("glUniformMatrix4fv");
/* 136 */           GLES20.glUniform1f(qp0Var.f15680c, 1.0f);
/* 141 */           sp0.m8591b("glUniform1f");
/* 146 */           GLES20.glEnable(3042);
/* 153 */           GLES20.glBlendFuncSeparate(770, 771, 1, 771);
/* 158 */           GLES20.glDrawArrays(5, 0, 4);
/* 163 */           sp0.m8591b("glDrawArrays");
/* 166 */           GLES20.glDisable(3042);
                }
            }
