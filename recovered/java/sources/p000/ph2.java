            package p000;

            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.json.AbstractC1858b;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ph2 extends py0 implements p11 {

                /* JADX INFO: renamed from: k */
                public final zr3 f15123k;

                /* JADX INFO: renamed from: l */
                public final b11 f15124l;

                /* JADX INFO: renamed from: m */
                public final int f15125m;

                /* JADX INFO: renamed from: n */
                public final p11[] f15126n;

                /* JADX INFO: renamed from: o */
                public final C0168b5 f15127o;

                /* JADX INFO: renamed from: p */
                public final wl0 f15128p;

                /* JADX INFO: renamed from: q */
                public boolean f15129q;

                /* JADX INFO: renamed from: r */
                public String f15130r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ph2(zr3 zr3Var, b11 b11Var, int i, p11[] p11VarArr) {
/* 4 */             super(4);
/* 1 */             if (i == 0) {
/* 39 */                throw null;
                    }
/* 7 */             this.f15123k = zr3Var;
/* 9 */             this.f15124l = b11Var;
/* 11 */            this.f15125m = i;
/* 13 */            this.f15126n = p11VarArr;
/* 17 */            this.f15127o = b11Var.f2163b;
/* 21 */            this.f15128p = b11Var.f2162a;
/* 23 */            int iM3520y = AbstractC0886en.m3520y(i);
/* 27 */            if (p11VarArr != null) {
/* 29 */                p11 p11Var = p11VarArr[iM3520y];
/* 31 */                if (p11Var == null && p11Var == this) {
/* 37 */                    return;
                        }
/* 35 */                p11VarArr[iM3520y] = this;
                    }
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: A */
                public final void mo1484A(KSerializer kSerializer, Object obj) {
/* 1 */             kSerializer.getClass();
/* 6 */             if (!(kSerializer instanceof mt1)) {
/* 47 */                kSerializer.serialize(this, obj);
/* 50 */                return;
                    }
/* 9 */             mt1 mt1Var = (mt1) kSerializer;
/* 19 */            String strM7589L = py0.m7589L(this.f15124l, ((mt1) kSerializer).getDescriptor());
/* 23 */            obj.getClass();
/* 26 */            KSerializer kSerializerM5756p = jb1.m5756p(mt1Var, this, obj);
/* 38 */            py0.m7588K(kSerializerM5756p.getDescriptor().mo134e());
/* 41 */            this.f15130r = strM7589L;
/* 43 */            kSerializerM5756p.serialize(this, obj);
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: B */
                public final void mo1485B(long j) {
/* 3 */             if (this.f15129q) {
/* 9 */                 mo1489F(String.valueOf(j));
                    } else {
/* 15 */                this.f15123k.mo5926s(j);
                    }
                }

                @Override // p000.py0, p000.InterfaceC1907ly
                /* JADX INFO: renamed from: E */
                public final boolean mo1488E(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 6 */             return this.f15128p.f18680b;
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: F */
                public final void mo1489F(String str) {
/* 1 */             str.getClass();
/* 6 */             this.f15123k.m10438u(str);
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: S */
                public final void mo7451S(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 6 */             int iM3520y = AbstractC0886en.m3520y(this.f15125m);
/* 12 */            zr3 zr3Var = this.f15123k;
/* 14 */            boolean z = true;
/* 15 */            if (iM3520y == 1) {
/* 97 */                if (!zr3Var.f20311b) {
/* 99 */                    zr3Var.m10437n(',');
                        }
/* 102 */               zr3Var.m10436l();
/* 105 */               return;
                    }
/* 21 */            if (iM3520y == 2) {
/* 67 */                if (zr3Var.f20311b) {
/* 89 */                    this.f15129q = true;
/* 91 */                    zr3Var.m10436l();
/* 94 */                    return;
                        }
/* 70 */                if (i % 2 == 0) {
/* 72 */                    zr3Var.m10437n(',');
/* 75 */                    zr3Var.m10436l();
                        } else {
/* 79 */                    zr3Var.m10437n(':');
/* 82 */                    zr3Var.m10439v();
/* 85 */                    z = false;
                        }
/* 86 */                this.f15129q = z;
/* 88 */                return;
                    }
/* 24 */            if (iM3520y != 3) {
/* 28 */                if (!zr3Var.f20311b) {
/* 30 */                    zr3Var.m10437n(',');
                        }
/* 33 */                zr3Var.m10436l();
/* 40 */                mo1489F(serialDescriptor.mo136g(i));
/* 43 */                zr3Var.m10437n(':');
/* 46 */                zr3Var.m10439v();
/* 49 */                return;
                    }
/* 50 */            if (i == 0) {
/* 52 */                this.f15129q = true;
                    }
/* 54 */            if (i == 1) {
/* 56 */                zr3Var.m10437n(',');
/* 59 */                zr3Var.m10439v();
/* 62 */                this.f15129q = false;
                    }
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: a */
                public final C0168b5 mo1497a() {
/* 1 */             return this.f15127o;
                }

                @Override // p000.py0, p000.InterfaceC1907ly
                /* JADX INFO: renamed from: b */
                public final void mo1498b(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             int i = this.f15125m;
/* 6 */             pm2.m7482e(i);
/* 9 */             zr3 zr3Var = this.f15123k;
/* 11 */            zr3Var.m10436l();
/* 18 */            zr3Var.m10437n(pm2.m7482e(i));
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: c */
                public final InterfaceC1907ly mo1499c(SerialDescriptor serialDescriptor) {
                    p11 p11Var;
/* 1 */             serialDescriptor.getClass();
/* 4 */             b11 b11Var = this.f15124l;
/* 6 */             int iM7880M = qj3.m7880M(b11Var, serialDescriptor);
/* 10 */            char cM7481d = pm2.m7481d(iM7880M);
/* 14 */            zr3 zr3Var = this.f15123k;
/* 16 */            zr3Var.m10437n(cM7481d);
/* 20 */            zr3Var.f20311b = true;
/* 24 */            if (this.f15130r != null) {
/* 26 */                zr3Var.m10436l();
/* 29 */                String str = this.f15130r;
/* 31 */                str.getClass();
/* 34 */                zr3Var.m10438u(str);
/* 39 */                zr3Var.m10437n(':');
/* 46 */                mo1489F(serialDescriptor.mo130a());
/* 50 */                this.f15130r = null;
                    }
/* 54 */            if (this.f15125m == iM7880M) {
/* 56 */                return this;
                    }
/* 57 */            p11[] p11VarArr = this.f15126n;
                    return (p11VarArr == null || (p11Var = p11VarArr[AbstractC0886en.m3520y(iM7880M)]) == null) ? new ph2(zr3Var, b11Var, iM7880M, p11VarArr) : p11Var;
                }

                @Override // p000.p11
                /* JADX INFO: renamed from: d */
                public final b11 mo1500d() {
/* 1 */             return this.f15124l;
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: f */
                public final void mo1502f() {
/* 9 */             ((C1954n7) this.f15123k.f20312c).m6910p("null");
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: g */
                public final void mo1503g(double d) {
/* 5 */             C1954n7 c1954n7 = (C1954n7) this.f15123k.f20312c;
/* 9 */             if (this.f15129q) {
/* 15 */                mo1489F(String.valueOf(d));
                    } else {
/* 23 */                c1954n7.m6910p(String.valueOf(d));
                    }
/* 30 */            if (Double.isInfinite(d) || Double.isNaN(d)) {
/* 51 */                throw kb1.m6048a(c1954n7.toString(), Double.valueOf(d));
                    }
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: h */
                public final void mo1504h(short s) {
/* 3 */             if (this.f15129q) {
/* 9 */                 mo1489F(String.valueOf((int) s));
                    } else {
/* 15 */                this.f15123k.mo5927t(s);
                    }
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: j */
                public final void mo1506j(byte b) {
/* 3 */             if (this.f15129q) {
/* 9 */                 mo1489F(String.valueOf((int) b));
                    } else {
/* 15 */                this.f15123k.mo5924m(b);
                    }
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: k */
                public final void mo1507k(boolean z) {
/* 3 */             if (this.f15129q) {
/* 9 */                 mo1489F(String.valueOf(z));
                    } else {
/* 23 */                ((C1954n7) this.f15123k.f20312c).m6910p(String.valueOf(z));
                    }
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: m */
                public final void mo1509m(float f) {
/* 5 */             C1954n7 c1954n7 = (C1954n7) this.f15123k.f20312c;
/* 9 */             if (this.f15129q) {
/* 15 */                mo1489F(String.valueOf(f));
                    } else {
/* 23 */                c1954n7.m6910p(String.valueOf(f));
                    }
/* 30 */            if (Float.isInfinite(f) || Float.isNaN(f)) {
/* 51 */                throw kb1.m6048a(c1954n7.toString(), Float.valueOf(f));
                    }
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: o */
                public final void mo1511o(char c) {
/* 5 */             mo1489F(String.valueOf(c));
                }

                @Override // p000.py0, p000.InterfaceC1907ly
                /* JADX INFO: renamed from: s */
                public final void mo1515s(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             kSerializer.getClass();
/* 7 */             super.mo1515s(serialDescriptor, i, kSerializer, obj);
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: v */
                public final void mo1518v(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 8 */             mo1489F(serialDescriptor.mo136g(i));
                }

                @Override // p000.p11
                /* JADX INFO: renamed from: w */
                public final void mo1519w(AbstractC1858b abstractC1858b) {
/* 1 */             abstractC1858b.getClass();
/* 6 */             mo1484A(n11.f14092a, abstractC1858b);
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: y */
                public final void mo1521y(int i) {
/* 3 */             if (this.f15129q) {
/* 9 */                 mo1489F(String.valueOf(i));
                    } else {
/* 15 */                this.f15123k.mo5925r(i);
                    }
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: z */
                public final Encoder mo1522z(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 8 */             if (!qh2.m7852a(serialDescriptor)) {
/* 40 */                return this;
                    }
/* 12 */            zr3 c1810jy = this.f15123k;
/* 16 */            if (!(c1810jy instanceof C1810jy)) {
/* 27 */                c1810jy = new C1810jy((C1954n7) c1810jy.f20312c, this.f15129q);
                    }
/* 36 */            return new ph2(c1810jy, this.f15124l, this.f15125m, null);
                }
            }
