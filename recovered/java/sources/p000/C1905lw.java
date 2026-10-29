            package p000;

            import java.io.IOException;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            /* JADX INFO: renamed from: lw */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1905lw {

                /* JADX INFO: renamed from: f */
                public static final Logger f13504f = Logger.getLogger(C1905lw.class.getName());

                /* JADX INFO: renamed from: g */
                public static final boolean f13505g = ny2.f14570e;

                /* JADX INFO: renamed from: a */
                public gr0 f13506a;

                /* JADX INFO: renamed from: b */
                public final byte[] f13507b;

                /* JADX INFO: renamed from: c */
                public final int f13508c;

                /* JADX INFO: renamed from: d */
                public int f13509d;

                /* JADX INFO: renamed from: e */
                public final ix2 f13510e;

                public C1905lw(ix2 ix2Var, int i) {
/* 4 */             if (i < 0) {
/* 23 */                C1951n4.m6859j("bufferSize must be >= 0");
/* 27 */                throw null;
                    }
/* 8 */             int iMax = Math.max(i, 20);
/* 14 */            this.f13507b = new byte[iMax];
/* 16 */            this.f13508c = iMax;
/* 18 */            this.f13510e = ix2Var;
                }

                /* JADX INFO: renamed from: f */
                public static int m6539f(int i, C2259ul c2259ul) {
/* 1 */             int iM6541h = m6541h(i);
/* 5 */             int size = c2259ul.size();
/* 14 */            return m6542i(size) + size + iM6541h;
                }

                /* JADX INFO: renamed from: g */
                public static int m6540g(String str) {
                    int length;
                    try {
/* 1 */                 length = n13.m6852a(str);
                    } catch (l13 unused) {
/* 12 */                length = str.getBytes(fz0.f8401a).length;
                    }
/* 17 */            return m6542i(length) + length;
                }

                /* JADX INFO: renamed from: h */
                public static int m6541h(int i) {
/* 3 */             return m6542i(i << 3);
                }

                /* JADX INFO: renamed from: i */
                public static int m6542i(int i) {
/* 9 */             return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
                }

                /* JADX INFO: renamed from: j */
                public static int m6543j(long j) {
/* 9 */             return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
                }

                /* JADX INFO: renamed from: A */
                public final void m6544A(String str) throws IOException {
                    try {
/* 6 */                 int length = str.length() * 3;
/* 8 */                 int iM6542i = m6542i(length);
/* 12 */                int i = iM6542i + length;
/* 14 */                int i2 = this.f13508c;
/* 16 */                if (i > i2) {
/* 18 */                    byte[] bArr = new byte[length];
/* 22 */                    int iM5666f = n13.f14100a.m5666f(str, bArr, 0, length);
/* 26 */                    m6547D(iM5666f);
/* 29 */                    m6558n(bArr, 0, iM5666f);
/* 32 */                    return;
                        }
/* 39 */                if (i > i2 - this.f13509d) {
/* 41 */                    m6555k();
                        }
/* 48 */                int iM6542i2 = m6542i(str.length());
/* 52 */                int i3 = this.f13509d;
/* 54 */                byte[] bArr2 = this.f13507b;
                        try {
/* 56 */                    if (iM6542i2 == iM6542i) {
/* 58 */                        int i4 = i3 + iM6542i2;
/* 60 */                        this.f13509d = i4;
/* 65 */                        int iM5666f2 = n13.f14100a.m5666f(str, bArr2, i4, i2 - i4);
/* 69 */                        this.f13509d = i3;
/* 74 */                        m6553d((iM5666f2 - i3) - iM6542i2);
/* 77 */                        this.f13509d = iM5666f2;
                            } else {
/* 84 */                        int iM6852a = n13.m6852a(str);
/* 88 */                        m6553d(iM6852a);
/* 99 */                        this.f13509d = n13.f14100a.m5666f(str, bArr2, this.f13509d, iM6852a);
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
/* 107 */                   throw new C1868kw(e);
                        } catch (l13 e2) {
/* 108 */                   this.f13509d = i3;
/* 110 */                   throw e2;
                        }
                    } catch (l13 e3) {
/* 117 */               f13504f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
/* 122 */               byte[] bytes = str.getBytes(fz0.f8401a);
                        try {
/* 127 */                   m6547D(bytes.length);
/* 131 */                   m6568x(bytes, 0, bytes.length);
                        } catch (IndexOutOfBoundsException e4) {
/* 141 */                   throw new C1868kw(e4);
                        }
                    }
                }

                /* JADX INFO: renamed from: B */
                public final void m6545B(int i, int i2) {
/* 4 */             m6547D((i << 3) | i2);
                }

                /* JADX INFO: renamed from: C */
                public final void m6546C(int i, int i2) {
/* 3 */             m6556l(20);
/* 7 */             m6552c(i, 0);
/* 10 */            m6553d(i2);
                }

                /* JADX INFO: renamed from: D */
                public final void m6547D(int i) {
/* 2 */             m6556l(5);
/* 5 */             m6553d(i);
                }

                /* JADX INFO: renamed from: E */
                public final void m6548E(int i, long j) {
/* 3 */             m6556l(20);
/* 7 */             m6552c(i, 0);
/* 10 */            m6554e(j);
                }

                /* JADX INFO: renamed from: F */
                public final void m6549F(long j) {
/* 3 */             m6556l(10);
/* 6 */             m6554e(j);
                }

                /* JADX INFO: renamed from: a */
                public final void m6550a(int i) {
/* 1 */             int i2 = this.f13509d;
/* 3 */             int i3 = i2 + 1;
/* 5 */             this.f13509d = i3;
/* 10 */            byte[] bArr = this.f13507b;
/* 12 */            bArr[i2] = (byte) (i & 255);
/* 14 */            int i4 = i2 + 2;
/* 16 */            this.f13509d = i4;
/* 23 */            bArr[i3] = (byte) ((i >> 8) & 255);
/* 25 */            int i5 = i2 + 3;
/* 27 */            this.f13509d = i5;
/* 34 */            bArr[i4] = (byte) ((i >> 16) & 255);
/* 38 */            this.f13509d = i2 + 4;
/* 45 */            bArr[i5] = (byte) ((i >> 24) & 255);
                }

                /* JADX INFO: renamed from: b */
                public final void m6551b(long j) {
/* 1 */             int i = this.f13509d;
/* 3 */             int i2 = i + 1;
/* 5 */             this.f13509d = i2;
/* 13 */            byte[] bArr = this.f13507b;
/* 15 */            bArr[i] = (byte) (j & 255);
/* 17 */            int i3 = i + 2;
/* 19 */            this.f13509d = i3;
/* 28 */            bArr[i2] = (byte) ((j >> 8) & 255);
/* 30 */            int i4 = i + 3;
/* 32 */            this.f13509d = i4;
/* 41 */            bArr[i3] = (byte) ((j >> 16) & 255);
/* 43 */            int i5 = i + 4;
/* 45 */            this.f13509d = i5;
/* 54 */            bArr[i4] = (byte) (255 & (j >> 24));
/* 56 */            int i6 = i + 5;
/* 58 */            this.f13509d = i6;
/* 68 */            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
/* 70 */            int i7 = i + 6;
/* 72 */            this.f13509d = i7;
/* 82 */            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
/* 84 */            int i8 = i + 7;
/* 86 */            this.f13509d = i8;
/* 96 */            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
/* 99 */            this.f13509d = i + 8;
/* 109 */           bArr[i8] = (byte) (((int) (j >> 56)) & 255);
                }

                /* JADX INFO: renamed from: c */
                public final void m6552c(int i, int i2) {
/* 4 */             m6553d((i << 3) | i2);
                }

                /* JADX INFO: renamed from: d */
                public final void m6553d(int i) {
/* 1 */             boolean z = f13505g;
/* 3 */             byte[] bArr = this.f13507b;
/* 5 */             if (z) {
                        while (true) {
/* 7 */                     int i2 = i & (-128);
/* 9 */                     int i3 = this.f13509d;
/* 11 */                    if (i2 == 0) {
/* 15 */                        this.f13509d = i3 + 1;
/* 19 */                        ny2.m7078j(bArr, i3, (byte) i);
/* 22 */                        return;
                            } else {
/* 25 */                        this.f13509d = i3 + 1;
/* 33 */                        ny2.m7078j(bArr, i3, (byte) ((i | 128) & 255));
/* 36 */                        i >>>= 7;
                            }
                        }
                    } else {
                        while (true) {
/* 39 */                    int i4 = i & (-128);
/* 41 */                    int i5 = this.f13509d;
/* 43 */                    if (i4 == 0) {
/* 47 */                        this.f13509d = i5 + 1;
/* 50 */                        bArr[i5] = (byte) i;
/* 52 */                        return;
                            } else {
/* 55 */                        this.f13509d = i5 + 1;
/* 62 */                        bArr[i5] = (byte) ((i | 128) & 255);
/* 64 */                        i >>>= 7;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m6554e(long j) {
/* 1 */             boolean z = f13505g;
/* 4 */             byte[] bArr = this.f13507b;
/* 10 */            if (z) {
                        while (true) {
/* 12 */                    long j2 = j & (-128);
/* 16 */                    int i = this.f13509d;
/* 18 */                    if (j2 == 0) {
/* 22 */                        this.f13509d = i + 1;
/* 27 */                        ny2.m7078j(bArr, i, (byte) j);
/* 30 */                        return;
                            } else {
/* 33 */                        this.f13509d = i + 1;
/* 42 */                        ny2.m7078j(bArr, i, (byte) ((((int) j) | 128) & 255));
/* 45 */                        j >>>= 7;
                            }
                        }
                    } else {
                        while (true) {
/* 47 */                    long j3 = j & (-128);
/* 51 */                    int i2 = this.f13509d;
/* 53 */                    if (j3 == 0) {
/* 57 */                        this.f13509d = i2 + 1;
/* 61 */                        bArr[i2] = (byte) j;
/* 63 */                        return;
                            } else {
/* 66 */                        this.f13509d = i2 + 1;
/* 74 */                        bArr[i2] = (byte) ((((int) j) | 128) & 255);
/* 76 */                        j >>>= 7;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: k */
                public final void m6555k() {
/* 8 */             this.f13510e.write(this.f13507b, 0, this.f13509d);
/* 11 */            this.f13509d = 0;
                }

                /* JADX INFO: renamed from: l */
                public final void m6556l(int i) {
/* 6 */             if (this.f13508c - this.f13509d < i) {
/* 8 */                 m6555k();
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m6557m(byte b) {
/* 5 */             if (this.f13509d == this.f13508c) {
/* 7 */                 m6555k();
                    }
/* 10 */            int i = this.f13509d;
/* 14 */            this.f13509d = i + 1;
/* 18 */            this.f13507b[i] = b;
                }

                /* JADX INFO: renamed from: n */
                public final void m6558n(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             int i3 = this.f13509d;
/* 3 */             int i4 = this.f13508c;
/* 5 */             int i5 = i4 - i3;
/* 7 */             byte[] bArr2 = this.f13507b;
/* 9 */             if (i5 >= i2) {
/* 11 */                System.arraycopy(bArr, i, bArr2, i3, i2);
/* 17 */                this.f13509d += i2;
/* 19 */                return;
                    }
/* 20 */            System.arraycopy(bArr, i, bArr2, i3, i5);
/* 23 */            int i6 = i + i5;
/* 24 */            int i7 = i2 - i5;
/* 25 */            this.f13509d = i4;
/* 27 */            m6555k();
/* 30 */            if (i7 > i4) {
/* 41 */                this.f13510e.write(bArr, i6, i7);
                    } else {
/* 33 */                System.arraycopy(bArr, i6, bArr2, 0, i7);
/* 36 */                this.f13509d = i7;
                    }
                }

                /* JADX INFO: renamed from: o */
                public final void m6559o(int i, boolean z) {
/* 3 */             m6556l(11);
/* 7 */             m6552c(i, 0);
/* 10 */            byte b = z ? (byte) 1 : (byte) 0;
/* 11 */            int i2 = this.f13509d;
/* 15 */            this.f13509d = i2 + 1;
/* 19 */            this.f13507b[i2] = b;
                }

                /* JADX INFO: renamed from: p */
                public final void m6560p(int i, C2259ul c2259ul) throws IOException {
/* 2 */             m6545B(i, 2);
/* 5 */             m6561q(c2259ul);
                }

                /* JADX INFO: renamed from: q */
                public final void m6561q(C2259ul c2259ul) throws IOException {
/* 5 */             m6547D(c2259ul.size());
/* 18 */            m6568x(c2259ul.f17584b, c2259ul.mo8551e(), c2259ul.size());
                }

                /* JADX INFO: renamed from: r */
                public final void m6562r(int i, int i2) {
/* 3 */             m6556l(14);
/* 7 */             m6552c(i, 5);
/* 10 */            m6550a(i2);
                }

                /* JADX INFO: renamed from: s */
                public final void m6563s(int i) {
/* 2 */             m6556l(4);
/* 5 */             m6550a(i);
                }

                /* JADX INFO: renamed from: t */
                public final void m6564t(int i, long j) {
/* 3 */             m6556l(18);
/* 7 */             m6552c(i, 1);
/* 10 */            m6551b(j);
                }

                /* JADX INFO: renamed from: u */
                public final void m6565u(long j) {
/* 3 */             m6556l(8);
/* 6 */             m6551b(j);
                }

                /* JADX INFO: renamed from: v */
                public final void m6566v(int i, int i2) {
/* 3 */             m6556l(20);
/* 7 */             m6552c(i, 0);
/* 10 */            if (i2 >= 0) {
/* 12 */                m6553d(i2);
                    } else {
/* 17 */                m6554e(i2);
                    }
                }

                /* JADX INFO: renamed from: w */
                public final void m6567w(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 m6547D(i);
                    } else {
/* 8 */                 m6549F(i);
                    }
                }

                /* JADX INFO: renamed from: x */
                public final void m6568x(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             m6558n(bArr, i, i2);
                }

                /* JADX INFO: renamed from: y */
                public final void m6569y(int i, AbstractC2350x abstractC2350x, i72 i72Var) {
/* 2 */             m6545B(i, 2);
/* 9 */             m6547D(abstractC2350x.mo8856a(i72Var));
/* 14 */            i72Var.mo4498h(abstractC2350x, this.f13506a);
                }

                /* JADX INFO: renamed from: z */
                public final void m6570z(int i, String str) throws IOException {
/* 2 */             m6545B(i, 2);
/* 5 */             m6544A(str);
                }
            }
