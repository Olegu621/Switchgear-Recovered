            package p000;

            import android.opengl.EGL14;
            import android.opengl.EGLConfig;
            import android.opengl.EGLContext;
            import android.opengl.EGLDisplay;
            import android.opengl.EGLExt;
            import android.opengl.EGLSurface;
            import android.opengl.GLES20;
            import android.util.Size;
            import android.view.Surface;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicBoolean;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class jq1 {

                /* JADX INFO: renamed from: c */
                public Thread f12426c;

                /* JADX INFO: renamed from: g */
                public EGLConfig f12430g;

                /* JADX INFO: renamed from: i */
                public Surface f12432i;

                /* JADX INFO: renamed from: a */
                public final AtomicBoolean f12424a = new AtomicBoolean(false);

                /* JADX INFO: renamed from: b */
                public final HashMap f12425b = new HashMap();

                /* JADX INFO: renamed from: d */
                public EGLDisplay f12427d = EGL14.EGL_NO_DISPLAY;

                /* JADX INFO: renamed from: e */
                public EGLContext f12428e = EGL14.EGL_NO_CONTEXT;

                /* JADX INFO: renamed from: f */
                public int[] f12429f = sp0.f16728a;

                /* JADX INFO: renamed from: h */
                public EGLSurface f12431h = EGL14.EGL_NO_SURFACE;

                /* JADX INFO: renamed from: j */
                public Map f12433j = Collections.EMPTY_MAP;

                /* JADX INFO: renamed from: k */
                public qp0 f12434k = null;

                /* JADX INFO: renamed from: l */
                public pp0 f12435l = pp0.f15226a;

                /* JADX INFO: renamed from: m */
                public int f12436m = -1;

                /* JADX INFO: renamed from: a */
                public final void m5882a(mb0 mb0Var, C2216tf c2216tf) {
/* 6 */             EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
/* 10 */            this.f12427d = eGLDisplayEglGetDisplay;
/* 18 */            if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
/* 226 */               f42.m3656l("Unable to get EGL14 display");
/* 229 */               return;
                    }
/* 21 */            int[] iArr = new int[2];
/* 30 */            if (!EGL14.eglInitialize(this.f12427d, iArr, 0, iArr, 1)) {
/* 216 */               this.f12427d = EGL14.EGL_NO_DISPLAY;
/* 220 */               f42.m3656l("Unable to initialize EGL14");
/* 223 */               return;
                    }
/* 32 */            if (c2216tf != null) {
/* 58 */                c2216tf.f17062b = iArr[0] + "." + iArr[1];
                    }
/* 72 */            int i = mb0Var.m6634a() ? 10 : 8;
/* 140 */           EGLConfig[] eGLConfigArr = new EGLConfig[1];
/* 164 */           if (!EGL14.eglChooseConfig(this.f12427d, new int[]{12324, i, 12323, i, 12322, i, 12321, mb0Var.m6634a() ? 2 : 8, 12325, 0, 12326, 0, 12352, mb0Var.m6634a() ? 64 : 4, 12610, mb0Var.m6634a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
/* 210 */               f42.m3656l("Unable to find a suitable EGLConfig");
/* 213 */               return;
                    }
/* 166 */           EGLConfig eGLConfig = eGLConfigArr[0];
/* 187 */           EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f12427d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, mb0Var.m6634a() ? 3 : 2, 12344}, 0);
/* 193 */           sp0.m8590a("eglCreateContext");
/* 196 */           this.f12430g = eGLConfig;
/* 198 */           this.f12428e = eGLContextEglCreateContext;
/* 204 */           EGL14.eglQueryContext(this.f12427d, eGLContextEglCreateContext, 12440, new int[1], 0);
                }

                /* JADX INFO: renamed from: b */
                public final C0953gg m5883b(Surface surface) {
                    try {
/* 1 */                 EGLDisplay eGLDisplay = this.f12427d;
/* 3 */                 EGLConfig eGLConfig = this.f12430g;
/* 5 */                 Objects.requireNonNull(eGLConfig);
/* 10 */                EGLSurface eGLSurfaceM8598i = sp0.m8598i(eGLDisplay, eGLConfig, surface, this.f12429f);
/* 14 */                EGLDisplay eGLDisplay2 = this.f12427d;
/* 17 */                int[] iArr = new int[1];
/* 22 */                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceM8598i, 12375, iArr, 0);
/* 25 */                int i = iArr[0];
/* 27 */                int[] iArr2 = new int[1];
/* 31 */                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceM8598i, 12374, iArr2, 0);
/* 38 */                Size size = new Size(i, iArr2[0]);
/* 51 */                return new C0953gg(eGLSurfaceM8598i, size.getWidth(), size.getHeight());
                    } catch (IllegalArgumentException | IllegalStateException e) {
/* 76 */                hu0.m4317I0("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
/* 79 */                return null;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m5884c() {
/* 1 */             EGLDisplay eGLDisplay = this.f12427d;
/* 3 */             EGLConfig eGLConfig = this.f12430g;
/* 5 */             Objects.requireNonNull(eGLConfig);
/* 8 */             int[] iArr = sp0.f16728a;
/* 22 */            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
/* 28 */            sp0.m8590a("eglCreatePbufferSurface");
/* 31 */            if (eGLSurfaceEglCreatePbufferSurface != null) {
/* 33 */                this.f12431h = eGLSurfaceEglCreatePbufferSurface;
                    } else {
/* 38 */                f42.m3656l("surface was null");
                    }
                }

                /* JADX INFO: renamed from: d */
                public final hr1 m5885d(mb0 mb0Var) {
/* 8 */             sp0.m8593d(this.f12424a, false);
                    try {
/* 12 */                m5882a(mb0Var, null);
/* 15 */                m5884c();
/* 20 */                m5886f(this.f12431h);
/* 25 */                String strGlGetString = GLES20.glGetString(7939);
/* 33 */                String strEglQueryString = EGL14.eglQueryString(this.f12427d, 12373);
/* 39 */                if (strGlGetString == null) {
/* 42 */                    strGlGetString = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 43 */                if (strEglQueryString == null) {
/* 46 */                    strEglQueryString = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 47 */                return new hr1(strGlGetString, strEglQueryString);
                    } catch (IllegalStateException e) {
/* 75 */                hu0.m4317I0("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
/* 80 */                return new hr1(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                    } finally {
/* 87 */                m5888h();
                    }
                }

                /* JADX INFO: renamed from: e */
                public C2253uf mo143e(mb0 mb0Var) {
/* 1 */             Map map = Collections.EMPTY_MAP;
/* 4 */             AtomicBoolean atomicBoolean = this.f12424a;
/* 6 */             sp0.m8593d(atomicBoolean, false);
/* 11 */            C2216tf c2216tf = new C2216tf();
/* 16 */            c2216tf.f17061a = "0.0";
/* 18 */            c2216tf.f17062b = "0.0";
/* 20 */            String strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
/* 22 */            c2216tf.f17063c = HttpUrl.FRAGMENT_ENCODE_SET;
/* 24 */            c2216tf.f17064d = HttpUrl.FRAGMENT_ENCODE_SET;
                    try {
/* 30 */                if (mb0Var.m6634a()) {
/* 32 */                    hr1 hr1VarM5885d = m5885d(mb0Var);
/* 38 */                    String str = (String) hr1VarM5885d.f9210a;
/* 40 */                    str.getClass();
/* 45 */                    String str2 = (String) hr1VarM5885d.f9211b;
/* 47 */                    str2.getClass();
/* 56 */                    if (!str.contains("GL_EXT_YUV_target")) {
/* 62 */                        hu0.m4315H0("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
/* 65 */                        mb0Var = mb0.f13671d;
                            }
/* 76 */                    this.f12429f = sp0.m8595f(str2, mb0Var);
/* 78 */                    c2216tf.f17063c = str;
/* 80 */                    c2216tf.f17064d = str2;
                        }
/* 82 */                m5882a(mb0Var, c2216tf);
/* 85 */                m5884c();
/* 90 */                m5886f(this.f12431h);
/* 97 */                c2216tf.f17061a = sp0.m8599j();
/* 103 */               this.f12433j = sp0.m8596g(mb0Var);
/* 105 */               int iM8597h = sp0.m8597h();
/* 109 */               this.f12436m = iM8597h;
/* 111 */               m5891k(iM8597h);
/* 118 */               this.f12426c = Thread.currentThread();
/* 121 */               atomicBoolean.set(true);
/* 126 */               if (c2216tf.f17063c == null) {
/* 130 */                   strConcat = HttpUrl.FRAGMENT_ENCODE_SET.concat(" glExtensions");
                        }
/* 136 */               if (c2216tf.f17064d == null) {
/* 140 */                   strConcat = strConcat.concat(" eglExtensions");
                        }
/* 148 */               if (strConcat.isEmpty()) {
/* 160 */                   return new C2253uf(c2216tf.f17061a, c2216tf.f17062b, c2216tf.f17063c, c2216tf.f17064d);
                        }
/* 170 */               f42.m3656l("Missing required properties:".concat(strConcat));
/* 173 */               return null;
                    } catch (IllegalArgumentException e) {
/* 68 */                e = e;
/* 175 */               m5888h();
/* 178 */               throw e;
                    } catch (IllegalStateException e2) {
/* 70 */                e = e2;
/* 175 */               m5888h();
/* 178 */               throw e;
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m5886f(EGLSurface eGLSurface) {
/* 3 */             this.f12427d.getClass();
/* 8 */             this.f12428e.getClass();
/* 19 */            if (EGL14.eglMakeCurrent(this.f12427d, eGLSurface, eGLSurface, this.f12428e)) {
/* 21 */                return;
                    }
/* 24 */            f42.m3656l("eglMakeCurrent failed");
                }

                /* JADX INFO: renamed from: g */
                public final void m5887g(Surface surface) {
/* 4 */             sp0.m8593d(this.f12424a, true);
/* 9 */             sp0.m8592c(this.f12426c);
/* 12 */            HashMap map = this.f12425b;
/* 18 */            if (map.containsKey(surface)) {
/* 25 */                return;
                    }
/* 22 */            map.put(surface, sp0.f16737j);
                }

                /* JADX INFO: renamed from: h */
                public final void m5888h() {
/* 7 */             Iterator it = this.f12433j.values().iterator();
/* 15 */            while (it.hasNext()) {
/* 25 */                GLES20.glDeleteProgram(((qp0) it.next()).f15678a);
                    }
/* 31 */            this.f12433j = Collections.EMPTY_MAP;
/* 34 */            this.f12434k = null;
/* 44 */            if (!Objects.equals(this.f12427d, EGL14.EGL_NO_DISPLAY)) {
/* 46 */                EGLDisplay eGLDisplay = this.f12427d;
/* 48 */                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
/* 52 */                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
/* 55 */                HashMap map = this.f12425b;
/* 69 */                for (C0953gg c0953gg : map.values()) {
/* 85 */                    if (!Objects.equals(c0953gg.f8592a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f12427d, c0953gg.f8592a)) {
                                try {
/* 99 */                            sp0.m8590a("eglDestroySurface");
                                } catch (IllegalStateException e) {
/* 110 */                           hu0.m4326U("GLUtils", e.toString(), e);
                                }
                            }
                        }
/* 114 */               map.clear();
/* 125 */               if (!Objects.equals(this.f12431h, EGL14.EGL_NO_SURFACE)) {
/* 131 */                   EGL14.eglDestroySurface(this.f12427d, this.f12431h);
/* 136 */                   this.f12431h = EGL14.EGL_NO_SURFACE;
                        }
/* 146 */               if (!Objects.equals(this.f12428e, EGL14.EGL_NO_CONTEXT)) {
/* 152 */                   EGL14.eglDestroyContext(this.f12427d, this.f12428e);
/* 157 */                   this.f12428e = EGL14.EGL_NO_CONTEXT;
                        }
/* 159 */               EGL14.eglReleaseThread();
/* 164 */               EGL14.eglTerminate(this.f12427d);
/* 169 */               this.f12427d = EGL14.EGL_NO_DISPLAY;
                    }
/* 171 */           this.f12430g = null;
/* 174 */           this.f12436m = -1;
/* 178 */           this.f12435l = pp0.f15226a;
/* 180 */           this.f12432i = null;
/* 182 */           this.f12426c = null;
                }

                /* JADX INFO: renamed from: i */
                public final void m5889i(Surface surface, boolean z) {
/* 3 */             if (this.f12432i == surface) {
/* 6 */                 this.f12432i = null;
/* 10 */                m5886f(this.f12431h);
                    }
/* 13 */            HashMap map = this.f12425b;
/* 30 */            C0953gg c0953gg = z ? (C0953gg) map.remove(surface) : (C0953gg) map.put(surface, sp0.f16737j);
/* 32 */            if (c0953gg == null || c0953gg == sp0.f16737j) {
/* 70 */                return;
                    }
                    try {
/* 42 */                EGL14.eglDestroySurface(this.f12427d, c0953gg.f8592a);
                    } catch (RuntimeException e) {
/* 67 */                hu0.m4317I0("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
                    }
                }

                /* JADX INFO: renamed from: j */
                public final void m5890j(long j, float[] fArr, Surface surface) {
/* 4 */             sp0.m8593d(this.f12424a, true);
/* 9 */             sp0.m8592c(this.f12426c);
/* 12 */            HashMap map = this.f12425b;
/* 20 */            de3.m3028j("The surface is not registered.", map.containsKey(surface));
/* 27 */            C0953gg c0953ggM5883b = (C0953gg) map.get(surface);
/* 29 */            Objects.requireNonNull(c0953ggM5883b);
/* 34 */            if (c0953ggM5883b == sp0.f16737j) {
/* 36 */                c0953ggM5883b = m5883b(surface);
/* 40 */                if (c0953ggM5883b == null) {
/* 142 */                   return;
                        } else {
/* 43 */                    map.put(surface, c0953ggM5883b);
                        }
                    }
/* 46 */            int i = c0953ggM5883b.f8594c;
/* 48 */            int i2 = c0953ggM5883b.f8593b;
/* 50 */            EGLSurface eGLSurface = c0953ggM5883b.f8592a;
/* 55 */            if (surface != this.f12432i) {
/* 57 */                m5886f(eGLSurface);
/* 60 */                this.f12432i = surface;
/* 62 */                GLES20.glViewport(0, 0, i2, i);
/* 65 */                GLES20.glScissor(0, 0, i2, i);
                    }
/* 68 */            qp0 qp0Var = this.f12434k;
/* 70 */            qp0Var.getClass();
/* 75 */            if (qp0Var instanceof rp0) {
/* 81 */                GLES20.glUniformMatrix4fv(((rp0) qp0Var).f16217f, 1, false, fArr, 0);
/* 86 */                sp0.m8591b("glUniformMatrix4fv");
                    }
/* 91 */            GLES20.glDrawArrays(5, 0, 4);
/* 96 */            sp0.m8591b("glDrawArrays");
/* 101 */           EGLExt.eglPresentationTimeANDROID(this.f12427d, eGLSurface, j);
/* 110 */           if (EGL14.eglSwapBuffers(this.f12427d, eGLSurface)) {
/* 142 */               return;
                    }
/* 136 */           hu0.m4315H0("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
/* 139 */           m5889i(surface, false);
                }

                /* JADX INFO: renamed from: k */
                public final void m5891k(int i) {
/* 9 */             qp0 qp0Var = (qp0) this.f12433j.get(this.f12435l);
/* 11 */            if (qp0Var == null) {
/* 59 */                ds0.m3206w(this.f12435l, "Unable to configure program for input format: ");
/* 62 */                return;
                    }
/* 15 */            if (this.f12434k != qp0Var) {
/* 17 */                this.f12434k = qp0Var;
/* 19 */                qp0Var.mo7967b();
/* 24 */                Objects.toString(this.f12435l);
/* 29 */                Objects.toString(this.f12434k);
                    }
/* 35 */            GLES20.glActiveTexture(33984);
/* 40 */            sp0.m8591b("glActiveTexture");
/* 46 */            GLES20.glBindTexture(36197, i);
/* 51 */            sp0.m8591b("glBindTexture");
                }
            }
