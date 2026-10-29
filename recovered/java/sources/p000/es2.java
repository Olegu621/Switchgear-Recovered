            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class es2 {

                /* JADX INFO: renamed from: d */
                public static es2 f7866d;

                /* JADX INFO: renamed from: a */
                public long f7867a;

                /* JADX INFO: renamed from: b */
                public long f7868b;

                /* JADX INFO: renamed from: c */
                public int f7869c;

                /* JADX INFO: renamed from: a */
                public final void m3597a(long j, double d, double d2) {
/* 12 */            float f = (j - 946728000000L) / 8.64E7f;
/* 20 */            float f2 = (0.01720197f * f) + 6.24006f;
                    double d3 = f2;
/* 74 */            double dSin = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
/* 83 */            double d4 = (-d2) / 360.0d;
/* 122 */           double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (f - 9.0E-4f)) - d4) + 9.0E-4f)) + d4;
/* 137 */           double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
/* 146 */           double d5 = 0.01745329238474369d * d;
/* 176 */           double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d5))) / (Math.cos(dAsin) * Math.cos(d5));
/* 184 */           if (dSin3 >= 1.0d) {
/* 186 */               this.f7869c = 1;
/* 188 */               this.f7867a = -1L;
/* 190 */               this.f7868b = -1L;
                    } else {
/* 198 */               if (dSin3 <= -1.0d) {
/* 200 */                   this.f7869c = 0;
/* 202 */                   this.f7867a = -1L;
/* 204 */                   this.f7868b = -1L;
/* 206 */                   return;
                        }
/* 217 */               double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
/* 232 */               this.f7867a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
/* 240 */               long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
/* 241 */               this.f7868b = jRound;
/* 245 */               if (jRound >= j || this.f7867a <= j) {
/* 256 */                   this.f7869c = 1;
                        } else {
/* 253 */                   this.f7869c = 0;
                        }
                    }
                }
            }
