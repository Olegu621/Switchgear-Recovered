            package p000;

            import java.util.Arrays;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: fd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0913fd {

                /* JADX INFO: renamed from: b */
                public final C1789jd f8132b;

                /* JADX INFO: renamed from: c */
                public final C0875ec f8133c;

                /* JADX INFO: renamed from: a */
                public int f8131a = 0;

                /* JADX INFO: renamed from: d */
                public int f8134d = 8;

                /* JADX INFO: renamed from: e */
                public int[] f8135e = new int[8];

                /* JADX INFO: renamed from: f */
                public int[] f8136f = new int[8];

                /* JADX INFO: renamed from: g */
                public float[] f8137g = new float[8];

                /* JADX INFO: renamed from: h */
                public int f8138h = -1;

                /* JADX INFO: renamed from: i */
                public int f8139i = -1;

                /* JADX INFO: renamed from: j */
                public boolean f8140j = false;

                public C0913fd(C1789jd c1789jd, C0875ec c0875ec) {
/* 30 */            this.f8132b = c1789jd;
/* 32 */            this.f8133c = c0875ec;
                }

                /* JADX INFO: renamed from: a */
                public final void m3716a(qf2 qf2Var, float f, boolean z) {
/* 9 */             if (f <= -0.001f || f >= 0.001f) {
/* 17 */                int i = this.f8138h;
/* 19 */                C1789jd c1789jd = this.f8132b;
/* 24 */                if (i == -1) {
/* 26 */                    this.f8138h = 0;
/* 30 */                    this.f8137g[0] = f;
/* 36 */                    this.f8135e[0] = qf2Var.f15515b;
/* 40 */                    this.f8136f[0] = -1;
/* 45 */                    qf2Var.f15512V++;
/* 47 */                    qf2Var.m7785a(c1789jd);
/* 53 */                    this.f8131a++;
/* 57 */                    if (this.f8140j) {
/* 311 */                       return;
                            }
/* 61 */                    int i2 = this.f8139i + 1;
/* 62 */                    this.f8139i = i2;
/* 64 */                    int[] iArr = this.f8135e;
/* 67 */                    if (i2 >= iArr.length) {
/* 69 */                        this.f8140j = true;
/* 73 */                        this.f8139i = iArr.length - 1;
/* 75 */                        return;
                            }
/* 311 */                   return;
                        }
/* 77 */                int i3 = -1;
/* 78 */                for (int i4 = 0; i != -1 && i4 < this.f8131a; i4++) {
/* 86 */                    int i5 = this.f8135e[i];
/* 88 */                    int i6 = qf2Var.f15515b;
/* 90 */                    if (i5 == i6) {
/* 92 */                        float[] fArr = this.f8137g;
/* 96 */                        float f2 = fArr[i] + f;
/* 100 */                       if (f2 > -0.001f && f2 < 0.001f) {
/* 106 */                           f2 = 0.0f;
                                }
/* 107 */                       fArr[i] = f2;
/* 111 */                       if (f2 == 0.0f) {
/* 113 */                           int i7 = this.f8138h;
/* 115 */                           int[] iArr2 = this.f8136f;
/* 117 */                           if (i == i7) {
/* 121 */                               this.f8138h = iArr2[i];
                                    } else {
/* 126 */                               iArr2[i3] = iArr2[i];
                                    }
/* 128 */                           if (z) {
/* 130 */                               qf2Var.m7786b(c1789jd);
                                    }
/* 135 */                           if (this.f8140j) {
/* 137 */                               this.f8139i = i;
                                    }
/* 142 */                           qf2Var.f15512V--;
/* 147 */                           this.f8131a--;
/* 149 */                           return;
                                }
/* 311 */                       return;
                            }
/* 150 */                   if (i5 < i6) {
/* 152 */                       i3 = i;
                            }
/* 155 */                   i = this.f8136f[i];
                        }
/* 160 */               int length = this.f8139i;
/* 162 */               int i8 = length + 1;
/* 166 */               if (this.f8140j) {
/* 168 */                   int[] iArr3 = this.f8135e;
/* 172 */                   if (iArr3[length] != -1) {
/* 175 */                       length = iArr3.length;
                            }
                        } else {
/* 177 */                   length = i8;
                        }
/* 178 */               int[] iArr4 = this.f8135e;
/* 181 */               if (length >= iArr4.length && this.f8131a < iArr4.length) {
/* 188 */                   int i9 = 0;
                            while (true) {
/* 189 */                       int[] iArr5 = this.f8135e;
/* 192 */                       if (i9 >= iArr5.length) {
                                    break;
                                }
/* 196 */                       if (iArr5[i9] == -1) {
/* 198 */                           length = i9;
                                    break;
                                }
/* 200 */                       i9++;
                            }
                        }
/* 203 */               int[] iArr6 = this.f8135e;
/* 206 */               if (length >= iArr6.length) {
/* 208 */                   length = iArr6.length;
/* 211 */                   int i10 = this.f8134d * 2;
/* 213 */                   this.f8134d = i10;
/* 215 */                   this.f8140j = false;
/* 219 */                   this.f8139i = length - 1;
/* 227 */                   this.f8137g = Arrays.copyOf(this.f8137g, i10);
/* 237 */                   this.f8135e = Arrays.copyOf(this.f8135e, this.f8134d);
/* 247 */                   this.f8136f = Arrays.copyOf(this.f8136f, this.f8134d);
                        }
/* 253 */               this.f8135e[length] = qf2Var.f15515b;
/* 257 */               this.f8137g[length] = f;
/* 259 */               int[] iArr7 = this.f8136f;
/* 261 */               if (i3 != -1) {
/* 265 */                   iArr7[length] = iArr7[i3];
/* 267 */                   iArr7[i3] = length;
                        } else {
/* 272 */                   iArr7[length] = this.f8138h;
/* 274 */                   this.f8138h = length;
                        }
/* 279 */               qf2Var.f15512V++;
/* 281 */               qf2Var.m7785a(c1789jd);
/* 287 */               this.f8131a++;
/* 291 */               if (!this.f8140j) {
/* 296 */                   this.f8139i++;
                        }
/* 298 */               int i11 = this.f8139i;
/* 300 */               int[] iArr8 = this.f8135e;
/* 303 */               if (i11 >= iArr8.length) {
/* 305 */                   this.f8140j = true;
/* 309 */                   this.f8139i = iArr8.length - 1;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m3717b() {
/* 1 */             int i = this.f8138h;
/* 6 */             for (int i2 = 0; i != -1 && i2 < this.f8131a; i2++) {
/* 22 */                qf2 qf2Var = ((qf2[]) this.f8133c.f7615d)[this.f8135e[i]];
/* 24 */                if (qf2Var != null) {
/* 28 */                    qf2Var.m7786b(this.f8132b);
                        }
/* 33 */                i = this.f8136f[i];
                    }
/* 38 */            this.f8138h = -1;
/* 40 */            this.f8139i = -1;
/* 42 */            this.f8140j = false;
/* 44 */            this.f8131a = 0;
                }

                /* JADX INFO: renamed from: c */
                public final float m3718c(qf2 qf2Var) {
/* 1 */             int i = this.f8138h;
/* 5 */             for (int i2 = 0; i != -1 && i2 < this.f8131a; i2++) {
/* 17 */                if (this.f8135e[i] == qf2Var.f15515b) {
/* 21 */                    return this.f8137g[i];
                        }
/* 26 */                i = this.f8136f[i];
                    }
/* 31 */            return 0.0f;
                }

                /* JADX INFO: renamed from: d */
                public final int m3719d() {
/* 1 */             return this.f8131a;
                }

                /* JADX INFO: renamed from: e */
                public final qf2 m3720e(int i) {
/* 1 */             int i2 = this.f8138h;
/* 5 */             for (int i3 = 0; i2 != -1 && i3 < this.f8131a; i3++) {
/* 11 */                if (i3 == i) {
/* 23 */                    return ((qf2[]) this.f8133c.f7615d)[this.f8135e[i2]];
                        }
/* 28 */                i2 = this.f8136f[i2];
                    }
/* 33 */            return null;
                }

                /* JADX INFO: renamed from: f */
                public final float m3721f(int i) {
/* 1 */             int i2 = this.f8138h;
/* 5 */             for (int i3 = 0; i2 != -1 && i3 < this.f8131a; i3++) {
/* 11 */                if (i3 == i) {
/* 15 */                    return this.f8137g[i2];
                        }
/* 20 */                i2 = this.f8136f[i2];
                    }
/* 25 */            return 0.0f;
                }

                /* JADX INFO: renamed from: g */
                public final void m3722g(qf2 qf2Var, float f) {
/* 5 */             if (f == 0.0f) {
/* 7 */                 m3723h(qf2Var, true);
/* 10 */                return;
                    }
/* 11 */            int i = this.f8138h;
/* 13 */            C1789jd c1789jd = this.f8132b;
/* 17 */            if (i == -1) {
/* 19 */                this.f8138h = 0;
/* 23 */                this.f8137g[0] = f;
/* 29 */                this.f8135e[0] = qf2Var.f15515b;
/* 33 */                this.f8136f[0] = -1;
/* 38 */                qf2Var.f15512V++;
/* 40 */                qf2Var.m7785a(c1789jd);
/* 46 */                this.f8131a++;
/* 50 */                if (this.f8140j) {
/* 256 */                   return;
                        }
/* 54 */                int i2 = this.f8139i + 1;
/* 55 */                this.f8139i = i2;
/* 57 */                int[] iArr = this.f8135e;
/* 60 */                if (i2 >= iArr.length) {
/* 62 */                    this.f8140j = true;
/* 66 */                    this.f8139i = iArr.length - 1;
/* 68 */                    return;
                        }
/* 256 */               return;
                    }
/* 70 */            int i3 = -1;
/* 71 */            for (int i4 = 0; i != -1 && i4 < this.f8131a; i4++) {
/* 79 */                int i5 = this.f8135e[i];
/* 81 */                int i6 = qf2Var.f15515b;
/* 83 */                if (i5 == i6) {
/* 87 */                    this.f8137g[i] = f;
/* 89 */                    return;
                        }
/* 90 */                if (i5 < i6) {
/* 92 */                    i3 = i;
                        }
/* 95 */                i = this.f8136f[i];
                    }
/* 100 */           int length = this.f8139i;
/* 102 */           int i7 = length + 1;
/* 106 */           if (this.f8140j) {
/* 108 */               int[] iArr2 = this.f8135e;
/* 112 */               if (iArr2[length] != -1) {
/* 115 */                   length = iArr2.length;
                        }
                    } else {
/* 117 */               length = i7;
                    }
/* 118 */           int[] iArr3 = this.f8135e;
/* 121 */           if (length >= iArr3.length && this.f8131a < iArr3.length) {
/* 128 */               int i8 = 0;
                        while (true) {
/* 129 */                   int[] iArr4 = this.f8135e;
/* 132 */                   if (i8 >= iArr4.length) {
                                break;
                            }
/* 136 */                   if (iArr4[i8] == -1) {
/* 138 */                       length = i8;
                                break;
                            }
/* 140 */                   i8++;
                        }
                    }
/* 143 */           int[] iArr5 = this.f8135e;
/* 146 */           if (length >= iArr5.length) {
/* 148 */               length = iArr5.length;
/* 151 */               int i9 = this.f8134d * 2;
/* 153 */               this.f8134d = i9;
/* 155 */               this.f8140j = false;
/* 159 */               this.f8139i = length - 1;
/* 167 */               this.f8137g = Arrays.copyOf(this.f8137g, i9);
/* 177 */               this.f8135e = Arrays.copyOf(this.f8135e, this.f8134d);
/* 187 */               this.f8136f = Arrays.copyOf(this.f8136f, this.f8134d);
                    }
/* 193 */           this.f8135e[length] = qf2Var.f15515b;
/* 197 */           this.f8137g[length] = f;
/* 199 */           int[] iArr6 = this.f8136f;
/* 201 */           if (i3 != -1) {
/* 205 */               iArr6[length] = iArr6[i3];
/* 207 */               iArr6[i3] = length;
                    } else {
/* 212 */               iArr6[length] = this.f8138h;
/* 214 */               this.f8138h = length;
                    }
/* 219 */           qf2Var.f15512V++;
/* 221 */           qf2Var.m7785a(c1789jd);
/* 226 */           int i10 = this.f8131a + 1;
/* 227 */           this.f8131a = i10;
/* 231 */           if (!this.f8140j) {
/* 236 */               this.f8139i++;
                    }
/* 238 */           int[] iArr7 = this.f8135e;
/* 241 */           if (i10 >= iArr7.length) {
/* 243 */               this.f8140j = true;
                    }
/* 248 */           if (this.f8139i >= iArr7.length) {
/* 250 */               this.f8140j = true;
/* 254 */               this.f8139i = iArr7.length - 1;
                    }
                }

                /* JADX INFO: renamed from: h */
                public final float m3723h(qf2 qf2Var, boolean z) {
/* 1 */             int i = this.f8138h;
/* 4 */             if (i == -1) {
/* 82 */                return 0.0f;
                    }
/* 7 */             int i2 = 0;
/* 8 */             int i3 = -1;
/* 9 */             while (i != -1 && i2 < this.f8131a) {
/* 21 */                if (this.f8135e[i] == qf2Var.f15515b) {
/* 23 */                    int i4 = this.f8138h;
/* 25 */                    int[] iArr = this.f8136f;
/* 27 */                    if (i == i4) {
/* 31 */                        this.f8138h = iArr[i];
                            } else {
/* 36 */                        iArr[i3] = iArr[i];
                            }
/* 38 */                    if (z) {
/* 42 */                        qf2Var.m7786b(this.f8132b);
                            }
/* 49 */                    qf2Var.f15512V--;
/* 55 */                    this.f8131a--;
/* 59 */                    this.f8135e[i] = -1;
/* 63 */                    if (this.f8140j) {
/* 65 */                        this.f8139i = i;
                            }
/* 69 */                    return this.f8137g[i];
                        }
/* 76 */                i2++;
/* 79 */                i3 = i;
/* 74 */                i = this.f8136f[i];
                    }
/* 82 */            return 0.0f;
                }

                public final String toString() {
/* 1 */             int i = this.f8138h;
/* 3 */             String string = HttpUrl.FRAGMENT_ENCODE_SET;
/* 7 */             for (int i2 = 0; i != -1 && i2 < this.f8131a; i2++) {
/* 19 */                StringBuilder sbM3512p = AbstractC0886en.m3512p(string.concat(" -> "));
/* 27 */                sbM3512p.append(this.f8137g[i]);
/* 32 */                sbM3512p.append(" : ");
/* 39 */                StringBuilder sbM3512p2 = AbstractC0886en.m3512p(sbM3512p.toString());
/* 55 */                sbM3512p2.append(((qf2[]) this.f8133c.f7615d)[this.f8135e[i]]);
/* 58 */                string = sbM3512p2.toString();
/* 64 */                i = this.f8136f[i];
                    }
/* 69 */            return string;
                }
            }
