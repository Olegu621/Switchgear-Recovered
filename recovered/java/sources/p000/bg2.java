            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 35 */    public final class bg2 {

                /* JADX INFO: renamed from: a */
                public double f2411a;

                /* JADX INFO: renamed from: b */
                public double f2412b;

                /* JADX INFO: renamed from: c */
                public boolean f2413c;

                /* JADX INFO: renamed from: d */
                public double f2414d;

                /* JADX INFO: renamed from: e */
                public double f2415e;

                /* JADX INFO: renamed from: f */
                public double f2416f;

                /* JADX INFO: renamed from: g */
                public double f2417g;

                /* JADX INFO: renamed from: h */
                public double f2418h;

                /* JADX INFO: renamed from: i */
                public double f2419i;

                /* JADX INFO: renamed from: j */
                public final lb0 f2420j;

                public bg2() {
/* 13 */            this.f2411a = Math.sqrt(1500.0d);
/* 17 */            this.f2412b = 0.5d;
/* 20 */            this.f2413c = false;
/* 27 */            this.f2419i = Double.MAX_VALUE;
/* 34 */            this.f2420j = new lb0();
                }

                /* JADX INFO: renamed from: a */
                public final lb0 m1351a(long j, double d, double d2) {
                    double dSin;
                    double dCos;
/* 7 */             if (!this.f2413c) {
/* 21 */                if (this.f2419i == Double.MAX_VALUE) {
/* 291 */                   f42.m3656l("Error: Final position of the spring must be set before the animation starts");
/* 294 */                   return null;
                        }
/* 23 */                double d3 = this.f2412b;
/* 27 */                if (d3 > 1.0d) {
/* 30 */                    double d4 = this.f2411a;
/* 41 */                    this.f2416f = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
/* 43 */                    double d5 = this.f2412b;
/* 46 */                    double d6 = this.f2411a;
/* 57 */                    this.f2417g = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
                        } else if (d3 >= 0.0d && d3 < 1.0d) {
/* 80 */                    this.f2418h = Math.sqrt(1.0d - (d3 * d3)) * this.f2411a;
                        }
/* 83 */                this.f2413c = true;
                    }
/* 92 */            double d7 = j / 1000.0d;
/* 95 */            double d8 = d - this.f2419i;
/* 97 */            double d9 = this.f2412b;
/* 106 */           if (d9 > 1.0d) {
/* 108 */               double d10 = this.f2417g;
/* 118 */               double d11 = ((d10 * d8) - d2) / (d10 - this.f2416f);
/* 119 */               double d12 = d8 - d11;
/* 134 */               dSin = (Math.pow(2.718281828459045d, this.f2416f * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
/* 135 */               double d13 = this.f2417g;
/* 143 */               double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
/* 144 */               double d14 = this.f2416f;
/* 153 */               dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
                    } else if (d9 == 1.0d) {
/* 158 */               double d15 = this.f2411a;
/* 162 */               double d16 = (d15 * d8) + d2;
/* 166 */               double d17 = (d16 * d7) + d8;
/* 173 */               double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
/* 182 */               double dPow3 = Math.pow(2.718281828459045d, (-this.f2411a) * d7) * d17;
/* 185 */               double d18 = -this.f2411a;
/* 193 */               dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
/* 194 */               dSin = dPow2;
                    } else {
/* 198 */               double d19 = 1.0d / this.f2418h;
/* 199 */               double d20 = this.f2411a;
/* 206 */               double d21 = ((d9 * d20 * d8) + d2) * d19;
/* 231 */               dSin = ((Math.sin(this.f2418h * d7) * d21) + (Math.cos(this.f2418h * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
/* 232 */               double d22 = this.f2411a;
/* 236 */               double d23 = this.f2412b;
/* 238 */               double d24 = (-d22) * dSin * d23;
/* 247 */               double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
/* 251 */               double d25 = this.f2418h;
/* 262 */               double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
/* 263 */               double d26 = this.f2418h;
/* 275 */               dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
                    }
/* 280 */           float f = (float) (dSin + this.f2419i);
/* 281 */           lb0 lb0Var = this.f2420j;
/* 283 */           lb0Var.f13169a = f;
/* 286 */           lb0Var.f13170b = (float) dCos;
/* 288 */           return lb0Var;
                }

/* 36 */        public bg2(float f) {
/* 38 */            this.f2411a = Math.sqrt(1500.0d);
/* 39 */            this.f2412b = 0.5d;
/* 40 */            this.f2413c = false;
/* 43 */            this.f2420j = new lb0();
/* 44 */            this.f2419i = f;
                }
            }
