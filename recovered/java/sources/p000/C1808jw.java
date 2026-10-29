            package p000;

            import io.sentry.C1697u2;
            import java.util.logging.Logger;
            
            /* JADX INFO: renamed from: jw */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1808jw {

                /* JADX INFO: renamed from: e */
                public static final Logger f12511e = Logger.getLogger(C1808jw.class.getName());

                /* JADX INFO: renamed from: f */
                public static final boolean f12512f = my2.f14066e;

                /* JADX INFO: renamed from: a */
                public d52 f12513a;

                /* JADX INFO: renamed from: b */
                public final byte[] f12514b;

                /* JADX INFO: renamed from: c */
                public final int f12515c;

                /* JADX INFO: renamed from: d */
                public int f12516d;

                public C1808jw(byte[] bArr, int i) {
/* 8 */             if (((bArr.length - i) | i) < 0) {
/* 36 */                C1697u2.m5437m("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
/* 40 */                throw null;
                    }
/* 10 */            this.f12514b = bArr;
/* 12 */            this.f12516d = 0;
/* 14 */            this.f12515c = i;
                }

                /* JADX INFO: renamed from: a */
                public static int m5901a(int i, AbstractC2298vl abstractC2298vl) {
/* 9 */             return m5902b(abstractC2298vl) + m5908h(i);
                }

                /* JADX INFO: renamed from: b */
                public static int m5902b(AbstractC2298vl abstractC2298vl) {
/* 1 */             int size = abstractC2298vl.size();
/* 9 */             return m5909i(size) + size;
                }

                /* JADX INFO: renamed from: c */
                public static int m5903c(int i) {
/* 5 */             return m5908h(i) + 4;
                }

                /* JADX INFO: renamed from: d */
                public static int m5904d(int i) {
/* 5 */             return m5908h(i) + 8;
                }

                /* JADX INFO: renamed from: e */
                public static int m5905e(int i, AbstractC2313w abstractC2313w, h72 h72Var) {
/* 11 */            return abstractC2313w.mo8615b(h72Var) + (m5908h(i) * 2);
                }

                /* JADX INFO: renamed from: f */
                public static int m5906f(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return m5909i(i);
                    }
/* 8 */             return 10;
                }

                /* JADX INFO: renamed from: g */
                public static int m5907g(String str) {
                    int length;
                    try {
/* 1 */                 length = m13.m6590b(str);
                    } catch (k13 unused) {
/* 12 */                length = str.getBytes(ez0.f7923a).length;
                    }
/* 17 */            return m5909i(length) + length;
                }

                /* JADX INFO: renamed from: h */
                public static int m5908h(int i) {
/* 3 */             return m5909i(i << 3);
                }

                /* JADX INFO: renamed from: i */
                public static int m5909i(int i) {
/* 3 */             if ((i & (-128)) == 0) {
/* 5 */                 return 1;
                    }
/* 9 */             if ((i & (-16384)) == 0) {
/* 11 */                return 2;
                    }
/* 16 */            if (((-2097152) & i) == 0) {
/* 18 */                return 3;
                    }
                    return (i & (-268435456)) == 0 ? 4 : 5;
                }

                /* JADX INFO: renamed from: j */
                public static int m5910j(long j) {
                    int i;
/* 9 */             if (((-128) & j) == 0) {
/* 8 */                 return 1;
                    }
/* 14 */            if (j < 0) {
/* 16 */                return 10;
                    }
/* 27 */            if (((-34359738368L) & j) != 0) {
/* 31 */                j >>>= 28;
/* 32 */                i = 6;
                    } else {
/* 34 */                i = 2;
                    }
/* 41 */            if (((-2097152) & j) != 0) {
/* 43 */                i += 2;
/* 47 */                j >>>= 14;
                    }
                    return (j & (-16384)) != 0 ? i + 1 : i;
                }

                /* JADX INFO: renamed from: k */
                public final void m5911k(byte b) throws C1868kw {
                    try {
/* 1 */                 byte[] bArr = this.f12514b;
/* 3 */                 int i = this.f12516d;
/* 7 */                 this.f12516d = i + 1;
/* 9 */                 bArr[i] = b;
                    } catch (IndexOutOfBoundsException e) {
/* 46 */                throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12516d), Integer.valueOf(this.f12515c), 1), e, 0);
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m5912l(byte[] bArr, int i, int i2) throws C1868kw {
                    try {
/* 5 */                 System.arraycopy(bArr, i, this.f12514b, this.f12516d, i2);
/* 11 */                this.f12516d += i2;
                    } catch (IndexOutOfBoundsException e) {
/* 47 */                throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12516d), Integer.valueOf(this.f12515c), Integer.valueOf(i2)), e, 0);
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m5913m(int i, int i2) throws C1868kw {
/* 2 */             m5918r(i, 5);
/* 5 */             m5914n(i2);
                }

                /* JADX INFO: renamed from: n */
                public final void m5914n(int i) throws C1868kw {
                    try {
/* 1 */                 byte[] bArr = this.f12514b;
/* 3 */                 int i2 = this.f12516d;
/* 5 */                 int i3 = i2 + 1;
/* 7 */                 this.f12516d = i3;
/* 12 */                bArr[i2] = (byte) (i & 255);
/* 14 */                int i4 = i2 + 2;
/* 16 */                this.f12516d = i4;
/* 23 */                bArr[i3] = (byte) ((i >> 8) & 255);
/* 25 */                int i5 = i2 + 3;
/* 27 */                this.f12516d = i5;
/* 34 */                bArr[i4] = (byte) ((i >> 16) & 255);
/* 38 */                this.f12516d = i2 + 4;
/* 45 */                bArr[i5] = (byte) ((i >> 24) & 255);
                    } catch (IndexOutOfBoundsException e) {
/* 82 */                throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12516d), Integer.valueOf(this.f12515c), 1), e, 0);
                    }
                }

                /* JADX INFO: renamed from: o */
                public final void m5915o(int i, long j) throws C1868kw {
/* 2 */             m5918r(i, 1);
/* 5 */             m5916p(j);
                }

                /* JADX INFO: renamed from: p */
                public final void m5916p(long j) throws C1868kw {
                    try {
/* 1 */                 byte[] bArr = this.f12514b;
/* 3 */                 int i = this.f12516d;
/* 5 */                 int i2 = i + 1;
/* 7 */                 this.f12516d = i2;
/* 13 */                bArr[i] = (byte) (((int) j) & 255);
/* 15 */                int i3 = i + 2;
/* 17 */                this.f12516d = i3;
/* 27 */                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
/* 29 */                int i4 = i + 3;
/* 31 */                this.f12516d = i4;
/* 41 */                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
/* 43 */                int i5 = i + 4;
/* 45 */                this.f12516d = i5;
/* 55 */                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
/* 57 */                int i6 = i + 5;
/* 59 */                this.f12516d = i6;
/* 69 */                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
/* 71 */                int i7 = i + 6;
/* 73 */                this.f12516d = i7;
/* 83 */                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
/* 85 */                int i8 = i + 7;
/* 87 */                this.f12516d = i8;
/* 97 */                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
/* 100 */               this.f12516d = i + 8;
/* 109 */               bArr[i8] = (byte) (((int) (j >> 56)) & 255);
                    } catch (IndexOutOfBoundsException e) {
/* 146 */               throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12516d), Integer.valueOf(this.f12515c), 1), e, 0);
                    }
                }

                /* JADX INFO: renamed from: q */
                public final void m5917q(int i) throws C1868kw {
/* 1 */             if (i >= 0) {
/* 3 */                 m5919s(i);
                    } else {
/* 8 */                 m5921u(i);
                    }
                }

                /* JADX INFO: renamed from: r */
                public final void m5918r(int i, int i2) throws C1868kw {
/* 4 */             m5919s((i << 3) | i2);
                }

                /* JADX INFO: renamed from: s */
                public final void m5919s(int i) throws C1868kw {
                    while (true) {
/* 1 */                 int i2 = i & (-128);
/* 3 */                 int i3 = this.f12516d;
/* 5 */                 byte[] bArr = this.f12514b;
/* 7 */                 if (i2 == 0) {
/* 11 */                    this.f12516d = i3 + 1;
/* 14 */                    bArr[i3] = (byte) i;
/* 16 */                    return;
                        } else {
                            try {
/* 21 */                        this.f12516d = i3 + 1;
/* 28 */                        bArr[i3] = (byte) ((i & 127) | 128);
/* 30 */                        i >>>= 7;
                            } catch (IndexOutOfBoundsException e) {
/* 66 */                        throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12516d), Integer.valueOf(this.f12515c), 1), e, 0);
                            }
                        }
/* 66 */                throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12516d), Integer.valueOf(this.f12515c), 1), e, 0);
                    }
                }

                /* JADX INFO: renamed from: t */
                public final void m5920t(int i, long j) throws C1868kw {
/* 2 */             m5918r(i, 0);
/* 5 */             m5921u(j);
                }

                /* JADX INFO: renamed from: u */
                public final void m5921u(long j) throws C1868kw {
/* 1 */             boolean z = f12512f;
/* 3 */             int i = this.f12515c;
/* 6 */             byte[] bArr = this.f12514b;
/* 12 */            if (!z || i - this.f12516d < 10) {
                        while (true) {
/* 57 */                    long j2 = j & (-128);
/* 61 */                    int i2 = this.f12516d;
/* 63 */                    if (j2 == 0) {
/* 67 */                        this.f12516d = i2 + 1;
/* 71 */                        bArr[i2] = (byte) j;
/* 73 */                        return;
                            } else {
                                try {
/* 78 */                            this.f12516d = i2 + 1;
/* 86 */                            bArr[i2] = (byte) ((((int) j) & 127) | 128);
/* 88 */                            j >>>= 7;
                                } catch (IndexOutOfBoundsException e) {
/* 121 */                           throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12516d), Integer.valueOf(i), 1), e, 0);
                                }
                            }
/* 121 */                   throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12516d), Integer.valueOf(i), 1), e, 0);
                        }
                    }
                    while (true) {
/* 22 */                long j3 = j & (-128);
/* 26 */                int i3 = this.f12516d;
/* 28 */                if (j3 == 0) {
/* 32 */                    this.f12516d = i3 + 1;
/* 37 */                    my2.m6825k(bArr, i3, (byte) j);
/* 40 */                    return;
                        } else {
/* 43 */                    this.f12516d = i3 + 1;
/* 52 */                    my2.m6825k(bArr, i3, (byte) ((((int) j) & 127) | 128));
/* 55 */                    j >>>= 7;
                        }
                    }
                }
            }
