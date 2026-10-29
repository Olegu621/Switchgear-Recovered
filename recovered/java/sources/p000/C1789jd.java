            package p000;

            import java.util.ArrayList;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: jd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C1789jd {

                /* JADX INFO: renamed from: d */
                public final C0913fd f12225d;

                /* JADX INFO: renamed from: a */
                public qf2 f12222a = null;

                /* JADX INFO: renamed from: b */
                public float f12223b = 0.0f;

                /* JADX INFO: renamed from: c */
                public final ArrayList f12224c = new ArrayList();

                /* JADX INFO: renamed from: e */
                public boolean f12226e = false;

                public C1789jd(C0875ec c0875ec) {
/* 25 */            this.f12225d = new C0913fd(this, c0875ec);
                }

                /* JADX INFO: renamed from: a */
                public final void m5787a(t71 t71Var, int i) {
/* 1 */             qf2 qf2VarM8715j = t71Var.m8715j(i);
/* 7 */             C0913fd c0913fd = this.f12225d;
/* 9 */             c0913fd.m3722g(qf2VarM8715j, 1.0f);
/* 18 */            c0913fd.m3722g(t71Var.m8715j(i), -1.0f);
                }

                /* JADX INFO: renamed from: b */
                public final void m5788b(qf2 qf2Var, qf2 qf2Var2, qf2 qf2Var3, int i) {
/* 1 */             boolean z = false;
/* 2 */             if (i != 0) {
/* 4 */                 if (i < 0) {
/* 6 */                     i *= -1;
/* 8 */                     z = true;
                        }
/* 10 */                this.f12223b = i;
                    }
/* 12 */            C0913fd c0913fd = this.f12225d;
/* 18 */            if (z) {
/* 30 */                c0913fd.m3722g(qf2Var, 1.0f);
/* 33 */                c0913fd.m3722g(qf2Var2, -1.0f);
/* 36 */                c0913fd.m3722g(qf2Var3, -1.0f);
                    } else {
/* 20 */                c0913fd.m3722g(qf2Var, -1.0f);
/* 23 */                c0913fd.m3722g(qf2Var2, 1.0f);
/* 26 */                c0913fd.m3722g(qf2Var3, 1.0f);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m5789c(qf2 qf2Var, qf2 qf2Var2, qf2 qf2Var3, int i) {
/* 1 */             boolean z = false;
/* 2 */             if (i != 0) {
/* 4 */                 if (i < 0) {
/* 6 */                     i *= -1;
/* 8 */                     z = true;
                        }
/* 10 */                this.f12223b = i;
                    }
/* 12 */            C0913fd c0913fd = this.f12225d;
/* 18 */            if (z) {
/* 30 */                c0913fd.m3722g(qf2Var, 1.0f);
/* 33 */                c0913fd.m3722g(qf2Var2, -1.0f);
/* 36 */                c0913fd.m3722g(qf2Var3, 1.0f);
                    } else {
/* 20 */                c0913fd.m3722g(qf2Var, -1.0f);
/* 23 */                c0913fd.m3722g(qf2Var2, 1.0f);
/* 26 */                c0913fd.m3722g(qf2Var3, -1.0f);
                    }
                }

                /* JADX INFO: renamed from: d */
                public qf2 mo5790d(boolean[] zArr) {
/* 2 */             return m5792f(zArr, null);
                }

                /* JADX INFO: renamed from: e */
                public boolean mo5791e() {
                    return this.f12222a == null && this.f12223b == 0.0f && this.f12225d.m3719d() == 0;
                }

                /* JADX INFO: renamed from: f */
                public final qf2 m5792f(boolean[] zArr, qf2 qf2Var) {
                    int i;
/* 1 */             C0913fd c0913fd = this.f12225d;
/* 3 */             int iM3719d = c0913fd.m3719d();
/* 8 */             qf2 qf2Var2 = null;
/* 10 */            float f = 0.0f;
/* 11 */            for (int i2 = 0; i2 < iM3719d; i2++) {
/* 13 */                float fM3721f = c0913fd.m3721f(i2);
/* 19 */                if (fM3721f < 0.0f) {
/* 21 */                    qf2 qf2VarM3720e = c0913fd.m3720e(i2);
/* 25 */                    if ((zArr == null || !zArr[qf2VarM3720e.f15515b]) && qf2VarM3720e != qf2Var && (((i = qf2VarM3720e.f15513W) == 3 || i == 4) && fM3721f < f)) {
/* 47 */                        f = fM3721f;
/* 48 */                        qf2Var2 = qf2VarM3720e;
                            }
                        }
                    }
/* 52 */            return qf2Var2;
                }

                /* JADX INFO: renamed from: g */
                public final void m5793g(qf2 qf2Var) {
/* 1 */             qf2 qf2Var2 = this.f12222a;
/* 4 */             C0913fd c0913fd = this.f12225d;
/* 8 */             if (qf2Var2 != null) {
/* 10 */                c0913fd.m3722g(qf2Var2, -1.0f);
/* 15 */                this.f12222a.f15516c = -1;
/* 18 */                this.f12222a = null;
                    }
/* 25 */            float fM3723h = c0913fd.m3723h(qf2Var, true) * (-1.0f);
/* 26 */            this.f12222a = qf2Var;
/* 32 */            if (fM3723h == 1.0f) {
/* 34 */                return;
                    }
/* 38 */            this.f12223b /= fM3723h;
/* 40 */            int i = c0913fd.f8138h;
/* 43 */            for (int i2 = 0; i != -1 && i2 < c0913fd.f8131a; i2++) {
/* 49 */                float[] fArr = c0913fd.f8137g;
/* 54 */                fArr[i] = fArr[i] / fM3723h;
/* 58 */                i = c0913fd.f8136f[i];
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m5794h(t71 t71Var, qf2 qf2Var, boolean z) {
/* 3 */             if (qf2Var.f15519f) {
/* 6 */                 C0913fd c0913fd = this.f12225d;
/* 8 */                 float fM3718c = c0913fd.m3718c(qf2Var);
/* 18 */                this.f12223b = (qf2Var.f15518e * fM3718c) + this.f12223b;
/* 20 */                c0913fd.m3723h(qf2Var, z);
/* 23 */                if (z) {
/* 25 */                    qf2Var.m7786b(this);
                        }
/* 32 */                if (c0913fd.m3719d() == 0) {
/* 35 */                    this.f12226e = true;
/* 37 */                    t71Var.f16933a = true;
                        }
                    }
                }

                /* JADX INFO: renamed from: i */
                public void mo5795i(t71 t71Var, C1789jd c1789jd, boolean z) {
/* 1 */             C0913fd c0913fd = this.f12225d;
/* 3 */             c0913fd.getClass();
/* 8 */             float fM3718c = c0913fd.m3718c(c1789jd.f12222a);
/* 14 */            c0913fd.m3723h(c1789jd.f12222a, z);
/* 17 */            C0913fd c0913fd2 = c1789jd.f12225d;
/* 19 */            int iM3719d = c0913fd2.m3719d();
/* 24 */            for (int i = 0; i < iM3719d; i++) {
/* 26 */                qf2 qf2VarM3720e = c0913fd2.m3720e(i);
/* 35 */                c0913fd.m3716a(qf2VarM3720e, c0913fd2.m3718c(qf2VarM3720e) * fM3718c, z);
                    }
/* 47 */            this.f12223b = (c1789jd.f12223b * fM3718c) + this.f12223b;
/* 49 */            if (z) {
/* 53 */                c1789jd.f12222a.m7786b(this);
                    }
/* 58 */            if (this.f12222a == null || c0913fd.m3719d() != 0) {
/* 71 */                return;
                    }
/* 67 */            this.f12226e = true;
/* 69 */            t71Var.f16933a = true;
                }

                public String toString() {
                    boolean z;
/* 26 */            String strConcat = (this.f12222a == null ? "0" : HttpUrl.FRAGMENT_ENCODE_SET + this.f12222a).concat(" = ");
/* 37 */            if (this.f12223b != 0.0f) {
/* 39 */                StringBuilder sbM3512p = AbstractC0886en.m3512p(strConcat);
/* 45 */                sbM3512p.append(this.f12223b);
/* 48 */                strConcat = sbM3512p.toString();
/* 52 */                z = true;
                    } else {
/* 54 */                z = false;
                    }
/* 55 */            C0913fd c0913fd = this.f12225d;
/* 57 */            int iM3719d = c0913fd.m3719d();
/* 61 */            for (int i = 0; i < iM3719d; i++) {
/* 63 */                qf2 qf2VarM3720e = c0913fd.m3720e(i);
/* 67 */                if (qf2VarM3720e != null) {
/* 70 */                    float fM3721f = c0913fd.m3721f(i);
/* 76 */                    if (fM3721f != 0.0f) {
/* 79 */                        String string = qf2VarM3720e.toString();
/* 85 */                        if (z) {
/* 99 */                            if (fM3721f > 0.0f) {
/* 103 */                               strConcat = strConcat.concat(" + ");
                                    } else {
/* 110 */                               strConcat = strConcat.concat(" - ");
/* 97 */                                fM3721f *= -1.0f;
                                    }
                                } else if (fM3721f < 0.0f) {
/* 93 */                            strConcat = strConcat.concat("- ");
/* 97 */                            fM3721f *= -1.0f;
                                }
/* 145 */                       strConcat = fM3721f == 1.0f ? strConcat.concat(string) : strConcat + fM3721f + " " + string;
/* 149 */                       z = true;
                            }
                        }
                    }
                    return !z ? strConcat.concat("0.0") : strConcat;
                }
            }
