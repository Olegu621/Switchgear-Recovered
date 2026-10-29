            package com.quago.mobile.sdk;

            import android.opengl.GLES20;
            import java.nio.Buffer;
            import java.nio.FloatBuffer;
            import p000.f42;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.i1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 122 */   public final class C0738i1 {

                /* JADX INFO: renamed from: a */
                public int f5489a;

                /* JADX INFO: renamed from: b */
                public final int f5490b;

                /* JADX INFO: renamed from: c */
                public final int f5491c;

                /* JADX INFO: renamed from: d */
                public final int f5492d;

                /* JADX INFO: renamed from: e */
                public final int f5493e;

                public C0738i1() {
/* 4 */             int iM2646a = AbstractC0755q.m2646a();
/* 8 */             this.f5489a = iM2646a;
/* 10 */            if (iM2646a == 0) {
/* 65 */                f42.m3663s("Unable to create program");
/* 69 */                throw null;
                    }
/* 14 */            int iGlGetAttribLocation = GLES20.glGetAttribLocation(iM2646a, "aPosition");
/* 18 */            this.f5492d = iGlGetAttribLocation;
/* 20 */            AbstractC0755q.m2649a(iGlGetAttribLocation, "aPosition");
/* 27 */            int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f5489a, "aTextureCoord");
/* 31 */            this.f5493e = iGlGetAttribLocation2;
/* 33 */            AbstractC0755q.m2649a(iGlGetAttribLocation2, "aTextureCoord");
/* 40 */            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f5489a, "uMVPMatrix");
/* 44 */            this.f5490b = iGlGetUniformLocation;
/* 46 */            AbstractC0755q.m2649a(iGlGetUniformLocation, "uMVPMatrix");
/* 53 */            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f5489a, "uTexMatrix");
/* 57 */            this.f5491c = iGlGetUniformLocation2;
/* 59 */            AbstractC0755q.m2649a(iGlGetUniformLocation2, "uTexMatrix");
                }

                /* JADX INFO: renamed from: a */
                public final void m2609a(float[] fArr, FloatBuffer floatBuffer, int i, int i2, int i3, float[] fArr2, FloatBuffer floatBuffer2, int i4, int i5) {
/* 3 */             AbstractC0755q.m2650a("render start");
/* 8 */             GLES20.glUseProgram(this.f5489a);
/* 13 */            AbstractC0755q.m2650a("glUseProgram");
/* 19 */            GLES20.glActiveTexture(33984);
/* 26 */            GLES20.glBindTexture(3553, i4);
/* 33 */            GLES20.glUniformMatrix4fv(this.f5490b, 1, false, fArr, 0);
/* 38 */            AbstractC0755q.m2650a("glUniformMatrix4fv");
/* 45 */            GLES20.glUniformMatrix4fv(this.f5491c, 1, false, fArr2, 0);
/* 48 */            AbstractC0755q.m2650a("glUniformMatrix4fv");
/* 53 */            GLES20.glEnableVertexAttribArray(this.f5492d);
/* 58 */            AbstractC0755q.m2650a("glEnableVertexAttribArray");
/* 69 */            GLES20.glVertexAttribPointer(this.f5492d, i2, 5126, false, i3, (Buffer) floatBuffer);
/* 74 */            AbstractC0755q.m2650a("glVertexAttribPointer");
/* 79 */            GLES20.glEnableVertexAttribArray(this.f5493e);
/* 82 */            AbstractC0755q.m2650a("glEnableVertexAttribArray");
/* 92 */            GLES20.glVertexAttribPointer(this.f5493e, 2, 5126, false, i5, (Buffer) floatBuffer2);
/* 95 */            AbstractC0755q.m2650a("glVertexAttribPointer");
/* 99 */            GLES20.glDrawArrays(5, 0, i);
/* 104 */           AbstractC0755q.m2650a("glDrawArrays");
/* 109 */           GLES20.glDisableVertexAttribArray(this.f5492d);
/* 114 */           GLES20.glDisableVertexAttribArray(this.f5493e);
/* 117 */           GLES20.glBindTexture(3553, 0);
/* 120 */           GLES20.glUseProgram(0);
                }

                /* JADX INFO: renamed from: a */
/* 123 */       public final void m2608a() {
/* 124 */           GLES20.glDeleteProgram(this.f5489a);
/* 125 */           this.f5489a = -1;
                }
            }
