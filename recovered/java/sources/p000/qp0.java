            package p000;

            import android.opengl.GLES20;
            import android.opengl.Matrix;
            import java.nio.Buffer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class qp0 {

                /* JADX INFO: renamed from: a */
                public final int f15678a;

                /* JADX INFO: renamed from: b */
                public int f15679b = -1;

                /* JADX INFO: renamed from: c */
                public int f15680c = -1;

                /* JADX INFO: renamed from: d */
                public int f15681d = -1;

                /* JADX WARN: Code duplicated, block: B:32:0x0075  */
                /* JADX WARN: Code duplicated, block: B:34:0x007a  */
                /* JADX WARN: Code duplicated, block: B:36:0x007f  */
                public qp0(String str, String str2) throws Throwable {
                    int iM8600k;
                    int iM8600k2;
                    int iGlCreateProgram;
                    try {
/* 18 */                iM8600k = sp0.m8600k(35633, str);
                        try {
/* 25 */                    iM8600k2 = sp0.m8600k(35632, str2);
                            try {
/* 29 */                        iGlCreateProgram = GLES20.glCreateProgram();
                                try {
/* 35 */                            sp0.m8591b("glCreateProgram");
/* 38 */                            GLES20.glAttachShader(iGlCreateProgram, iM8600k);
/* 41 */                            sp0.m8591b("glAttachShader");
/* 44 */                            GLES20.glAttachShader(iGlCreateProgram, iM8600k2);
/* 47 */                            sp0.m8591b("glAttachShader");
/* 50 */                            GLES20.glLinkProgram(iGlCreateProgram);
/* 54 */                            int[] iArr = new int[1];
/* 60 */                            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
/* 65 */                            if (iArr[0] == 1) {
/* 67 */                                this.f15678a = iGlCreateProgram;
/* 69 */                                m7966a();
                                    } else {
/* 98 */                                throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                                    }
                                } catch (IllegalArgumentException e) {
/* 73 */                            e = e;
/* 116 */                           if (iM8600k != -1) {
/* 118 */                               GLES20.glDeleteShader(iM8600k);
                                    }
/* 121 */                           if (iM8600k2 != -1) {
/* 123 */                               GLES20.glDeleteShader(iM8600k2);
                                    }
/* 126 */                           if (iGlCreateProgram != -1) {
/* 128 */                               GLES20.glDeleteProgram(iGlCreateProgram);
                                    }
/* 131 */                           throw e;
                                } catch (IllegalStateException e2) {
/* 75 */                            e = e2;
/* 116 */                           if (iM8600k != -1) {
/* 118 */                               GLES20.glDeleteShader(iM8600k);
                                    }
/* 121 */                           if (iM8600k2 != -1) {
/* 123 */                               GLES20.glDeleteShader(iM8600k2);
                                    }
/* 126 */                           if (iGlCreateProgram != -1) {
/* 128 */                               GLES20.glDeleteProgram(iGlCreateProgram);
                                    }
/* 131 */                           throw e;
                                }
                            } catch (IllegalArgumentException | IllegalStateException e3) {
/* 99 */                        e = e3;
/* 100 */                       iGlCreateProgram = -1;
                            }
                        } catch (IllegalArgumentException | IllegalStateException e4) {
/* 108 */                   e = e4;
/* 105 */                   iM8600k2 = -1;
/* 106 */                   iGlCreateProgram = iM8600k2;
/* 116 */                   if (iM8600k != -1) {
/* 118 */                       GLES20.glDeleteShader(iM8600k);
                            }
/* 121 */                   if (iM8600k2 != -1) {
/* 123 */                       GLES20.glDeleteShader(iM8600k2);
                            }
/* 126 */                   if (iGlCreateProgram != -1) {
/* 128 */                       GLES20.glDeleteProgram(iGlCreateProgram);
                            }
/* 131 */                   throw e;
                        }
                    } catch (IllegalArgumentException | IllegalStateException e5) {
/* 114 */               e = e5;
/* 111 */               iM8600k = -1;
/* 112 */               iM8600k2 = -1;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m7966a() {
/* 1 */             int i = this.f15678a;
/* 5 */             int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
/* 9 */             this.f15681d = iGlGetAttribLocation;
/* 11 */            sp0.m8594e(iGlGetAttribLocation, "aPosition");
/* 16 */            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
/* 20 */            this.f15679b = iGlGetUniformLocation;
/* 22 */            sp0.m8594e(iGlGetUniformLocation, "uTransMatrix");
/* 27 */            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
/* 31 */            this.f15680c = iGlGetUniformLocation2;
/* 33 */            sp0.m8594e(iGlGetUniformLocation2, "uAlphaScale");
                }

                /* JADX INFO: renamed from: b */
                public void mo7967b() {
/* 3 */             GLES20.glUseProgram(this.f15678a);
/* 8 */             sp0.m8591b("glUseProgram");
/* 13 */            GLES20.glEnableVertexAttribArray(this.f15681d);
/* 18 */            sp0.m8591b("glEnableVertexAttribArray");
/* 30 */            GLES20.glVertexAttribPointer(this.f15681d, 2, 5126, false, 0, (Buffer) sp0.f16735h);
/* 35 */            sp0.m8591b("glVertexAttribPointer");
/* 40 */            float[] fArr = new float[16];
/* 43 */            Matrix.setIdentityM(fArr, 0);
/* 49 */            GLES20.glUniformMatrix4fv(this.f15679b, 1, false, fArr, 0);
/* 54 */            sp0.m8591b("glUniformMatrix4fv");
/* 61 */            GLES20.glUniform1f(this.f15680c, 1.0f);
/* 66 */            sp0.m8591b("glUniform1f");
                }
            }
