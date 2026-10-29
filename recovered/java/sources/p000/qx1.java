            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qx1 extends C1789jd {

                /* JADX INFO: renamed from: f */
                public qf2[] f15790f;

                /* JADX INFO: renamed from: g */
                public qf2[] f15791g;

                /* JADX INFO: renamed from: h */
                public int f15792h;

                /* JADX INFO: renamed from: i */
                public wc0 f15793i;

                @Override // p000.C1789jd
                /* JADX INFO: renamed from: d */
                public final qf2 mo5790d(boolean[] zArr) {
/* 3 */             int i = -1;
/* 6 */             for (int i2 = 0; i2 < this.f15792h; i2++) {
/* 8 */                 qf2[] qf2VarArr = this.f15790f;
/* 10 */                qf2 qf2Var = qf2VarArr[i2];
/* 16 */                if (!zArr[qf2Var.f15515b]) {
/* 19 */                    wc0 wc0Var = this.f15793i;
/* 21 */                    wc0Var.f18577b = qf2Var;
/* 23 */                    int i3 = 8;
/* 25 */                    if (i != -1) {
/* 51 */                        qf2 qf2Var2 = qf2VarArr[i];
/* 53 */                        while (i3 >= 0) {
/* 57 */                            float f = qf2Var2.f15521v[i3];
/* 65 */                            float f2 = ((qf2) wc0Var.f18577b).f15521v[i3];
/* 69 */                            if (f2 != f) {
/* 76 */                                if (f2 >= f) {
                                            break;
                                        }
/* 78 */                                i = i2;
                                        break;
                                        break;
                                    }
/* 71 */                            i3--;
                                }
                            } else {
/* 27 */                        while (i3 >= 0) {
/* 35 */                            float f3 = ((qf2) wc0Var.f18577b).f15521v[i3];
/* 40 */                            if (f3 > 0.0f) {
                                        break;
                                    }
/* 45 */                            if (f3 < 0.0f) {
/* 78 */                                i = i2;
                                        break;
                                    }
/* 48 */                            i3--;
                                }
                            }
                        }
                    }
/* 82 */            if (i == -1) {
/* 84 */                return null;
                    }
/* 88 */            return this.f15790f[i];
                }

                @Override // p000.C1789jd
                /* JADX INFO: renamed from: e */
                public final boolean mo5791e() {
                    return this.f15792h == 0;
                }

                @Override // p000.C1789jd
                /* JADX INFO: renamed from: i */
                public final void mo5795i(t71 t71Var, C1789jd c1789jd, boolean z) {
/* 5 */             qf2 qf2Var = c1789jd.f12222a;
/* 7 */             if (qf2Var == null) {
/* 9 */                 return;
                    }
/* 10 */            float[] fArr = qf2Var.f15521v;
/* 12 */            C0913fd c0913fd = c1789jd.f12225d;
/* 14 */            int iM3719d = c0913fd.m3719d();
/* 19 */            for (int i = 0; i < iM3719d; i++) {
/* 21 */                qf2 qf2VarM3720e = c0913fd.m3720e(i);
/* 25 */                float fM3721f = c0913fd.m3721f(i);
/* 29 */                wc0 wc0Var = this.f15793i;
/* 31 */                wc0Var.f18577b = qf2VarM3720e;
/* 41 */                if (qf2VarM3720e.f15514a) {
/* 43 */                    boolean z2 = true;
/* 45 */                    for (int i2 = 0; i2 < 9; i2++) {
/* 51 */                        float[] fArr2 = ((qf2) wc0Var.f18577b).f15521v;
/* 59 */                        float f = (fArr[i2] * fM3721f) + fArr2[i2];
/* 61 */                        fArr2[i2] = f;
/* 69 */                        if (Math.abs(f) < 1.0E-4f) {
/* 77 */                            ((qf2) wc0Var.f18577b).f15521v[i2] = 0.0f;
                                } else {
/* 80 */                            z2 = false;
                                }
                            }
/* 84 */                    if (z2) {
/* 94 */                        ((qx1) wc0Var.f18578c).m8027k((qf2) wc0Var.f18577b);
                            }
                        } else {
/* 99 */                    for (int i3 = 0; i3 < 9; i3++) {
/* 101 */                       float f2 = fArr[i3];
/* 105 */                       if (f2 != 0.0f) {
/* 107 */                           float f3 = f2 * fM3721f;
/* 114 */                           if (Math.abs(f3) < 1.0E-4f) {
/* 116 */                               f3 = 0.0f;
                                    }
/* 123 */                           ((qf2) wc0Var.f18577b).f15521v[i3] = f3;
                                } else {
/* 132 */                           ((qf2) wc0Var.f18577b).f15521v[i3] = 0.0f;
                                }
                            }
/* 137 */                   m8026j(qf2VarM3720e);
                        }
/* 146 */               this.f12223b = (c1789jd.f12223b * fM3721f) + this.f12223b;
                    }
/* 152 */           m8027k(qf2Var);
                }

                /* JADX INFO: renamed from: j */
                public final void m8026j(qf2 qf2Var) {
                    int i;
                    qf2[] qf2VarArr;
/* 4 */             int i2 = this.f15792h + 1;
/* 5 */             qf2[] qf2VarArr2 = this.f15790f;
/* 8 */             if (i2 > qf2VarArr2.length) {
/* 17 */                qf2[] qf2VarArr3 = (qf2[]) Arrays.copyOf(qf2VarArr2, qf2VarArr2.length * 2);
/* 19 */                this.f15790f = qf2VarArr3;
/* 30 */                this.f15791g = (qf2[]) Arrays.copyOf(qf2VarArr3, qf2VarArr3.length * 2);
                    }
/* 32 */            qf2[] qf2VarArr4 = this.f15790f;
/* 34 */            int i3 = this.f15792h;
/* 36 */            qf2VarArr4[i3] = qf2Var;
/* 38 */            int i4 = i3 + 1;
/* 40 */            this.f15792h = i4;
/* 42 */            if (i4 > 1 && qf2VarArr4[i3].f15515b > qf2Var.f15515b) {
/* 53 */                int i5 = 0;
                        while (true) {
/* 54 */                    i = this.f15792h;
/* 56 */                    qf2VarArr = this.f15791g;
/* 58 */                    if (i5 >= i) {
                                break;
                            }
/* 64 */                    qf2VarArr[i5] = this.f15790f[i5];
/* 66 */                    i5++;
                        }
/* 76 */                Arrays.sort(qf2VarArr, 0, i, new wa3(8));
/* 81 */                for (int i6 = 0; i6 < this.f15792h; i6++) {
/* 89 */                    this.f15790f[i6] = this.f15791g[i6];
                        }
                    }
/* 94 */            qf2Var.f15514a = true;
/* 96 */            qf2Var.m7785a(this);
                }

                /* JADX INFO: renamed from: k */
                public final void m8027k(qf2 qf2Var) {
/* 2 */             int i = 0;
/* 5 */             while (i < this.f15792h) {
/* 11 */                if (this.f15790f[i] == qf2Var) {
                            while (true) {
/* 13 */                        int i2 = this.f15792h;
/* 17 */                        if (i >= i2 - 1) {
/* 31 */                            this.f15792h = i2 - 1;
/* 33 */                            qf2Var.f15514a = false;
/* 35 */                            return;
                                } else {
/* 19 */                            qf2[] qf2VarArr = this.f15790f;
/* 21 */                            int i3 = i + 1;
/* 25 */                            qf2VarArr[i] = qf2VarArr[i3];
/* 27 */                            i = i3;
                                }
                            }
                        } else {
/* 36 */                    i++;
                        }
                    }
                }

                @Override // p000.C1789jd
                public final String toString() {
/* 1 */             wc0 wc0Var = this.f15793i;
/* 20 */            String str = " goal -> (" + this.f12223b + ") : ";
/* 27 */            for (int i = 0; i < this.f15792h; i++) {
/* 33 */                wc0Var.f18577b = this.f15790f[i];
/* 51 */                str = str + wc0Var + " ";
                    }
/* 58 */            return str;
                }
            }
