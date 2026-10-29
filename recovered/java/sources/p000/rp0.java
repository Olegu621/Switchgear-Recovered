            package p000;

            import android.opengl.GLES20;
            import java.nio.Buffer;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 115 */   public final class rp0 extends qp0 {

                /* JADX INFO: renamed from: e */
                public final int f16216e;

                /* JADX INFO: renamed from: f */
                public final int f16217f;

                /* JADX INFO: renamed from: g */
                public final int f16218g;

                /* JADX WARN: Illegal instructions before constructor call */
                public rp0(mb0 mb0Var, np0 np0Var) {
                    String str;
/* 12 */            String str2 = mb0Var.m6634a() ? sp0.f16731d : sp0.f16730c;
                    try {
                        switch (np0Var.f14400a) {
                            case 0:
/* 31 */                        Locale locale = Locale.US;
/* 33 */                        str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
                                break;
                            case 1:
/* 26 */                        Locale locale2 = Locale.US;
/* 28 */                        str = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
                                break;
                            default:
/* 21 */                        Locale locale3 = Locale.US;
/* 23 */                        str = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
                                break;
                        }
/* 39 */                if (!str.contains("vTextureCoord") || !str.contains("sTexture")) {
/* 101 */                   throw new IllegalArgumentException("Invalid fragment shader");
                        }
/* 47 */                super(str2, str);
/* 51 */                this.f16216e = -1;
/* 53 */                this.f16217f = -1;
/* 55 */                this.f16218g = -1;
/* 57 */                m7966a();
/* 60 */                int i = this.f15678a;
/* 62 */                int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "sTexture");
/* 66 */                this.f16216e = iGlGetUniformLocation;
/* 68 */                sp0.m8594e(iGlGetUniformLocation, "sTexture");
/* 73 */                int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aTextureCoord");
/* 77 */                this.f16218g = iGlGetAttribLocation;
/* 79 */                sp0.m8594e(iGlGetAttribLocation, "aTextureCoord");
/* 84 */                int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
/* 88 */                this.f16217f = iGlGetUniformLocation2;
/* 90 */                sp0.m8594e(iGlGetUniformLocation2, "uTexMatrix");
                    } catch (Throwable th) {
/* 105 */               if (!(th instanceof IllegalArgumentException)) {
/* 115 */                   throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
                        }
/* 107 */               throw th;
                    }
                }

                @Override // p000.qp0
                /* JADX INFO: renamed from: b */
                public final void mo7967b() {
/* 1 */             super.mo7967b();
/* 7 */             GLES20.glUniform1i(this.f16216e, 0);
/* 12 */            GLES20.glEnableVertexAttribArray(this.f16218g);
/* 17 */            sp0.m8591b("glEnableVertexAttribArray");
/* 29 */            GLES20.glVertexAttribPointer(this.f16218g, 2, 5126, false, 0, (Buffer) sp0.f16736i);
/* 34 */            sp0.m8591b("glVertexAttribPointer");
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 116 */       public rp0(mb0 mb0Var, pp0 pp0Var) {
                    np0 np0Var;
/* 117 */           if (mb0Var.m6634a()) {
/* 118 */               de3.m3023e("No default sampler shader available for" + pp0Var, pp0Var != pp0.f15226a);
/* 119 */               if (pp0Var == pp0.f15228c) {
/* 120 */                   np0Var = sp0.f16734g;
                        } else {
/* 121 */                   np0Var = sp0.f16733f;
                        }
                    } else {
/* 122 */               np0Var = sp0.f16732e;
                    }
/* 123 */           this(mb0Var, np0Var);
                }
            }
