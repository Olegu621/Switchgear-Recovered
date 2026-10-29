            package p000;

            import android.opengl.EGL14;
            import android.opengl.EGLConfig;
            import android.opengl.EGLDisplay;
            import android.opengl.EGLSurface;
            import android.opengl.GLES20;
            import android.view.Surface;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.FloatBuffer;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class sp0 {

                /* JADX INFO: renamed from: a */
                public static final int[] f16728a = {12344};

                /* JADX INFO: renamed from: b */
                public static final int[] f16729b = {12445, 13632, 12344};

                /* JADX INFO: renamed from: c */
                public static final String f16730c;

                /* JADX INFO: renamed from: d */
                public static final String f16731d;

                /* JADX INFO: renamed from: e */
                public static final np0 f16732e;

                /* JADX INFO: renamed from: f */
                public static final np0 f16733f;

                /* JADX INFO: renamed from: g */
                public static final np0 f16734g;

                /* JADX INFO: renamed from: h */
                public static final FloatBuffer f16735h;

                /* JADX INFO: renamed from: i */
                public static final FloatBuffer f16736i;

                /* JADX INFO: renamed from: j */
                public static final C0953gg f16737j;

                static {
/* 19 */            Locale locale = Locale.US;
/* 23 */            f16730c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
/* 27 */            f16731d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
/* 35 */            f16732e = new np0(0);
/* 43 */            f16733f = new np0(1);
/* 51 */            f16734g = new np0(2);
/* 62 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
/* 70 */            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
/* 73 */            FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
/* 77 */            floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
/* 80 */            floatBufferAsFloatBuffer.position(0);
/* 83 */            f16735h = floatBufferAsFloatBuffer;
/* 90 */            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
/* 98 */            byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
/* 101 */           FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
/* 105 */           floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
/* 108 */           floatBufferAsFloatBuffer2.position(0);
/* 111 */           f16736i = floatBufferAsFloatBuffer2;
/* 120 */           f16737j = new C0953gg(EGL14.EGL_NO_SURFACE, 0, 0);
                }

                /* JADX INFO: renamed from: a */
                public static void m8590a(String str) {
/* 1 */             int iEglGetError = EGL14.eglGetError();
/* 7 */             if (iEglGetError == 12288) {
/* 9 */                 return;
                    }
/* 20 */            f42.m3659o(fm0.m3794t(str, ": EGL error: 0x"), Integer.toHexString(iEglGetError));
                }

                /* JADX INFO: renamed from: b */
                public static void m8591b(String str) {
/* 1 */             int iGlGetError = GLES20.glGetError();
/* 5 */             if (iGlGetError == 0) {
/* 7 */                 return;
                    }
/* 18 */            f42.m3659o(fm0.m3794t(str, ": GL error 0x"), Integer.toHexString(iGlGetError));
                }

                /* JADX INFO: renamed from: c */
                public static void m8592c(Thread thread) {
/* 12 */            de3.m3028j("Method call must be called on the GL thread.", thread == Thread.currentThread());
                }

                /* JADX INFO: renamed from: d */
                public static void m8593d(AtomicBoolean atomicBoolean, boolean z) {
/* 17 */            de3.m3028j(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == atomicBoolean.get());
                }

                /* JADX INFO: renamed from: e */
                public static void m8594e(int i, String str) {
/* 1 */             if (i >= 0) {
/* 3 */                 return;
                    }
/* 12 */            f42.m3656l(fm0.m3784j("Unable to locate '", str, "' in program"));
                }

                /* JADX INFO: renamed from: f */
                public static int[] m8595f(String str, mb0 mb0Var) {
/* 1 */             int i = mb0Var.f13677a;
/* 4 */             int[] iArr = f16728a;
/* 6 */             if (i == 3) {
/* 14 */                if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
/* 16 */                    return f16729b;
                        }
/* 23 */                hu0.m4315H0("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
                    }
/* 26 */            return iArr;
                }

                /* JADX INFO: renamed from: g */
                public static HashMap m8596g(mb0 mb0Var) {
                    Object rp0Var;
                    pp0 pp0Var;
/* 1 */             Map map = Collections.EMPTY_MAP;
/* 5 */             HashMap map2 = new HashMap();
/* 8 */             pp0[] pp0VarArrValues = pp0.values();
/* 12 */            int length = pp0VarArrValues.length;
/* 15 */            for (int i = 0; i < length; i++) {
/* 17 */                pp0 pp0Var2 = pp0VarArrValues[i];
/* 23 */                np0 np0Var = (np0) map.get(pp0Var2);
/* 25 */                if (np0Var != null) {
/* 29 */                    rp0Var = new rp0(mb0Var, np0Var);
                        } else if (pp0Var2 == pp0.f15228c || pp0Var2 == (pp0Var = pp0.f15227b)) {
/* 105 */                   rp0Var = new rp0(mb0Var, pp0Var2);
                        } else {
/* 63 */                    de3.m3028j("Unhandled input format: " + pp0Var2, pp0Var2 == pp0.f15226a);
/* 70 */                    if (mb0Var.m6634a()) {
/* 78 */                        rp0Var = new op0("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                            } else {
/* 86 */                        np0 np0Var2 = (np0) map.get(pp0Var);
/* 99 */                        rp0Var = np0Var2 != null ? new rp0(mb0Var, np0Var2) : new rp0(mb0Var, pp0Var);
                            }
                        }
/* 108 */               Objects.toString(pp0Var2);
/* 111 */               rp0Var.toString();
/* 114 */               map2.put(pp0Var2, rp0Var);
                    }
/* 120 */           return map2;
                }

                /* JADX INFO: renamed from: h */
                public static int m8597h() {
/* 2 */             int[] iArr = new int[1];
/* 5 */             GLES20.glGenTextures(1, iArr, 0);
/* 10 */            m8591b("glGenTextures");
/* 13 */            int i = iArr[0];
/* 18 */            GLES20.glBindTexture(36197, i);
/* 35 */            m8591b("glBindTexture " + i);
/* 42 */            GLES20.glTexParameteri(36197, 10241, 9728);
/* 49 */            GLES20.glTexParameteri(36197, 10240, 9729);
/* 57 */            GLES20.glTexParameteri(36197, 10242, 33071);
/* 62 */            GLES20.glTexParameteri(36197, 10243, 33071);
/* 67 */            m8591b("glTexParameter");
/* 70 */            return i;
                }

                /* JADX INFO: renamed from: i */
                public static EGLSurface m8598i(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
/* 2 */             EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
/* 8 */             m8590a("eglCreateWindowSurface");
/* 11 */            if (eGLSurfaceEglCreateWindowSurface != null) {
/* 13 */                return eGLSurfaceEglCreateWindowSurface;
                    }
/* 16 */            f42.m3656l("surface was null");
/* 19 */            return null;
                }

                /* JADX INFO: renamed from: j */
                public static String m8599j() {
/* 13 */            Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
/* 21 */            if (!matcher.find()) {
/* 46 */                return "0.0";
                    }
/* 24 */            String strGroup = matcher.group(1);
/* 28 */            strGroup.getClass();
/* 32 */            String strGroup2 = matcher.group(2);
/* 36 */            strGroup2.getClass();
/* 41 */            return AbstractC0886en.m3508l(strGroup, ".", strGroup2);
                }

                /* JADX INFO: renamed from: k */
                public static int m8600k(int i, String str) {
/* 1 */             int iGlCreateShader = GLES20.glCreateShader(i);
/* 19 */            m8591b("glCreateShader type=" + i);
/* 22 */            GLES20.glShaderSource(iGlCreateShader, str);
/* 25 */            GLES20.glCompileShader(iGlCreateShader);
/* 29 */            int[] iArr = new int[1];
/* 35 */            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
/* 40 */            if (iArr[0] != 0) {
/* 42 */                return iGlCreateShader;
                    }
/* 59 */            hu0.m4315H0("GLUtils", "Could not compile shader: " + str);
/* 62 */            GLES20.glDeleteShader(iGlCreateShader);
/* 77 */            f42.m3659o(fm0.m3793s(i, "Could not compile shader type ", ":"), GLES20.glGetShaderInfoLog(iGlCreateShader));
/* 34 */            return 0;
                }
            }
