            package com.quago.mobile.sdk;

            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.RadialGradient;
            import android.graphics.Shader;
            import android.opengl.GLES20;
            import android.opengl.Matrix;
            import io.sentry.C1697u2;
            import java.nio.ByteBuffer;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.q */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 48 */    public abstract class AbstractC0755q {

                /* JADX INFO: renamed from: a */
                public static final float[] f5614a;

                static {
/* 3 */             float[] fArr = new float[16];
/* 5 */             f5614a = fArr;
/* 8 */             Matrix.setIdentityM(fArr, 0);
                }

                /* JADX INFO: renamed from: a */
                public static Bitmap m2648a(int i, int i2) {
/* 3 */             Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
/* 9 */             Canvas canvas = new Canvas(bitmapCreateBitmap);
/* 14 */            Paint paint = new Paint();
/* 19 */            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
/* 32 */            paint.setShader(new RadialGradient(0.0f, 512.0f, 512.0f, -1, 0, tileMode));
/* 41 */            canvas.drawRect(0.0f, 0.0f, 512.0f, 512.0f, paint);
/* 56 */            paint.setShader(new RadialGradient(0.0f, 0.0f, 512.0f, -65536, 0, tileMode));
/* 59 */            canvas.drawRect(0.0f, 0.0f, 512.0f, 512.0f, paint);
/* 72 */            paint.setShader(new RadialGradient(512.0f, 0.0f, 512.0f, -16711936, 0, tileMode));
/* 75 */            canvas.drawRect(0.0f, 0.0f, 512.0f, 512.0f, paint);
/* 88 */            paint.setShader(new RadialGradient(512.0f, 512.0f, 512.0f, -16776961, 0, tileMode));
/* 91 */            canvas.drawRect(0.0f, 0.0f, 512.0f, 512.0f, paint);
/* 94 */            return bitmapCreateBitmap;
                }

                /* JADX INFO: renamed from: b */
                public static int m2651b(int i, String str) {
/* 1 */             int iGlCreateShader = GLES20.glCreateShader(i);
/* 19 */            m2650a("glCreateShader type = " + i);
/* 22 */            GLES20.glShaderSource(iGlCreateShader, str);
/* 25 */            GLES20.glCompileShader(iGlCreateShader);
/* 29 */            int[] iArr = new int[1];
/* 35 */            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
/* 40 */            if (iArr[0] != 0) {
/* 49 */                return iGlCreateShader;
                    }
/* 42 */            GLES20.glGetShaderInfoLog(iGlCreateShader);
/* 45 */            GLES20.glDeleteShader(iGlCreateShader);
/* 34 */            return 0;
                }

                /* JADX INFO: renamed from: c */
                public static String m2653c() {
/* 3 */             return GLES20.glGetString(7936);
                }

                /* JADX INFO: renamed from: d */
                public static String m2654d() {
/* 3 */             return GLES20.glGetString(7938);
                }

                /* JADX INFO: renamed from: b */
/* 49 */        public static String m2652b() {
/* 50 */            return GLES20.glGetString(7937);
                }

                /* JADX INFO: renamed from: a */
/* 94 */        public static void m2650a(String str) {
/* 95 */            int iGlGetError = GLES20.glGetError();
                    if (iGlGetError == 0) {
                        return;
                    }
/* 99 */            C1697u2.m5438n(fm0.m3794t(str, ": glError 0x"), Integer.toHexString(iGlGetError));
                }

                /* JADX INFO: renamed from: a */
/* 99 */        public static void m2649a(int i, String str) {
                    if (i >= 0) {
                        return;
                    }
/* 102 */           f42.m3663s(fm0.m3784j("Can't find '", str, "' in program"));
                }

                /* JADX INFO: renamed from: a */
/* 102 */       public static int m2646a() {
                    int iM2651b;
/* 103 */           int iM2651b2 = m2651b(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
                    if (iM2651b2 == 0 || (iM2651b = m2651b(35632, "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) == 0) {
                        return 0;
                    }
/* 105 */           int iGlCreateProgram = GLES20.glCreateProgram();
/* 106 */           m2650a("glCreateProgram");
/* 107 */           GLES20.glAttachShader(iGlCreateProgram, iM2651b2);
/* 108 */           m2650a("glAttachShader");
/* 109 */           GLES20.glAttachShader(iGlCreateProgram, iM2651b);
/* 110 */           m2650a("glAttachShader");
/* 111 */           GLES20.glLinkProgram(iGlCreateProgram);
/* 112 */           int[] iArr = new int[1];
/* 113 */           GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
/* 114 */           if (iArr[0] == 1) {
                        return iGlCreateProgram;
                    }
/* 115 */           GLES20.glGetProgramInfoLog(iGlCreateProgram);
/* 116 */           GLES20.glDeleteProgram(iGlCreateProgram);
                    return 0;
                }

                /* JADX INFO: renamed from: a */
/* 116 */       public static int m2647a(Bitmap bitmap) {
/* 118 */           ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
/* 119 */           bitmap.copyPixelsToBuffer(byteBufferAllocateDirect);
/* 120 */           byteBufferAllocateDirect.position(0);
/* 121 */           int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
/* 122 */           int[] iArr = new int[1];
/* 123 */           GLES20.glGenTextures(1, iArr, 0);
/* 124 */           int i = iArr[0];
/* 125 */           m2650a("glGenTextures");
/* 126 */           GLES20.glBindTexture(3553, i);
/* 127 */           GLES20.glTexParameteri(3553, 10241, 9729);
/* 128 */           GLES20.glTexParameteri(3553, 10240, 9729);
/* 129 */           m2650a("loadImageTexture");
/* 130 */           GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, byteBufferAllocateDirect);
/* 131 */           m2650a("loadImageTexture");
                    return i;
                }
            }
