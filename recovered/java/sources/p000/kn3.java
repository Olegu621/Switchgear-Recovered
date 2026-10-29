            package p000;

            import io.sentry.C1697u2;
            import java.util.logging.Logger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kn3 {

                /* JADX INFO: renamed from: e */
                public static final Logger f12895e = Logger.getLogger(kn3.class.getName());

                /* JADX INFO: renamed from: f */
                public static final boolean f12896f = tq3.f17234e;

                /* JADX INFO: renamed from: a */
                public pi3 f12897a;

                /* JADX INFO: renamed from: b */
                public final byte[] f12898b;

                /* JADX INFO: renamed from: c */
                public final int f12899c;

                /* JADX INFO: renamed from: d */
                public int f12900d;

                public kn3(byte[] bArr, int i) {
/* 4 */             int length = bArr.length;
/* 9 */             if (((length - i) | i) < 0) {
/* 36 */                C1697u2.m5437m("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)});
/* 40 */                throw null;
                    }
/* 11 */            this.f12898b = bArr;
/* 13 */            this.f12900d = 0;
/* 15 */            this.f12899c = i;
                }

                /* JADX INFO: renamed from: a */
                public static int m6152a(int i, tm3 tm3Var, bq3 bq3Var) {
/* 1 */             int iMo3540b = tm3Var.mo3540b(bq3Var);
/* 7 */             int iM6154p = m6154p(i << 3);
/* 12 */            return iM6154p + iM6154p + iMo3540b;
                }

                /* JADX INFO: renamed from: o */
                public static int m6153o(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return m6154p(i);
                    }
/* 8 */             return 10;
                }

                /* JADX INFO: renamed from: p */
                public static int m6154p(int i) {
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

                /* JADX INFO: renamed from: q */
                public static int m6155q(long j) {
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
/* 45 */                j >>>= 14;
/* 46 */                i += 2;
                    }
                    return (j & (-16384)) != 0 ? i + 1 : i;
                }

                /* JADX INFO: renamed from: r */
                public static int m6156r(String str) {
                    int length;
                    try {
/* 1 */                 length = zq3.m10424a(str);
                    } catch (uq3 unused) {
/* 12 */                length = str.getBytes(so3.f16726a).length;
                    }
/* 17 */            return m6154p(length) + length;
                }

                /* JADX INFO: renamed from: b */
                public final void m6157b(int i, int i2) throws C1868kw {
/* 4 */             m6165j((i << 3) | i2);
                }

                /* JADX INFO: renamed from: c */
                public final void m6158c(int i, int i2) throws C1868kw {
/* 3 */             m6165j(i << 3);
/* 6 */             m6165j(i2);
                }

                /* JADX INFO: renamed from: d */
                public final void m6159d(int i, int i2) throws C1868kw {
/* 5 */             m6165j((i << 3) | 5);
/* 8 */             m6166k(i2);
                }

                /* JADX INFO: renamed from: e */
                public final void m6160e(int i, long j) throws C1868kw {
/* 3 */             m6165j(i << 3);
/* 6 */             m6167l(j);
                }

                /* JADX INFO: renamed from: f */
                public final void m6161f(int i, long j) throws C1868kw {
/* 5 */             m6165j((i << 3) | 1);
/* 8 */             m6168m(j);
                }

                /* JADX INFO: renamed from: g */
                public final void m6162g(int i, cn3 cn3Var) throws C1868kw {
/* 5 */             m6165j((i << 3) | 2);
/* 12 */            m6165j(cn3Var.mo320c());
/* 15 */            an3 an3Var = (an3) cn3Var;
/* 23 */            m6169n(an3Var.f344c, an3Var.mo320c());
                }

                /* JADX INFO: renamed from: h */
                public final void m6163h(byte b) throws C1868kw {
                    try {
/* 1 */                 byte[] bArr = this.f12898b;
/* 3 */                 int i = this.f12900d;
/* 7 */                 this.f12900d = i + 1;
/* 9 */                 bArr[i] = b;
                    } catch (IndexOutOfBoundsException e) {
/* 46 */                throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12900d), Integer.valueOf(this.f12899c), 1), e, 3);
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m6164i(int i) throws C1868kw {
/* 1 */             if (i >= 0) {
/* 3 */                 m6165j(i);
                    } else {
/* 8 */                 m6167l(i);
                    }
                }

                /* JADX INFO: renamed from: j */
                public final void m6165j(int i) throws C1868kw {
                    while (true) {
/* 1 */                 int i2 = i & (-128);
/* 3 */                 int i3 = this.f12900d;
/* 5 */                 byte[] bArr = this.f12898b;
/* 7 */                 if (i2 == 0) {
/* 11 */                    this.f12900d = i3 + 1;
/* 14 */                    bArr[i3] = (byte) i;
/* 16 */                    return;
                        } else {
                            try {
/* 21 */                        this.f12900d = i3 + 1;
/* 28 */                        bArr[i3] = (byte) ((i & 127) | 128);
/* 30 */                        i >>>= 7;
                            } catch (IndexOutOfBoundsException e) {
/* 66 */                        throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12900d), Integer.valueOf(this.f12899c), 1), e, 3);
                            }
                        }
/* 66 */                throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12900d), Integer.valueOf(this.f12899c), 1), e, 3);
                    }
                }

                /* JADX INFO: renamed from: k */
                public final void m6166k(int i) throws C1868kw {
                    try {
/* 1 */                 byte[] bArr = this.f12898b;
/* 3 */                 int i2 = this.f12900d;
/* 5 */                 int i3 = i2 + 1;
/* 7 */                 this.f12900d = i3;
/* 12 */                bArr[i2] = (byte) (i & 255);
/* 14 */                int i4 = i2 + 2;
/* 16 */                this.f12900d = i4;
/* 23 */                bArr[i3] = (byte) ((i >> 8) & 255);
/* 25 */                int i5 = i2 + 3;
/* 27 */                this.f12900d = i5;
/* 34 */                bArr[i4] = (byte) ((i >> 16) & 255);
/* 38 */                this.f12900d = i2 + 4;
/* 45 */                bArr[i5] = (byte) ((i >> 24) & 255);
                    } catch (IndexOutOfBoundsException e) {
/* 82 */                throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12900d), Integer.valueOf(this.f12899c), 1), e, 3);
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m6167l(long j) throws C1868kw {
/* 1 */             boolean z = f12896f;
/* 4 */             byte[] bArr = this.f12898b;
/* 10 */            int i = this.f12899c;
/* 12 */            if (!z || i - this.f12900d < 10) {
                        while (true) {
/* 67 */                    long j2 = j & (-128);
/* 71 */                    int i2 = this.f12900d;
/* 73 */                    if (j2 == 0) {
/* 77 */                        this.f12900d = i2 + 1;
/* 81 */                        bArr[i2] = (byte) j;
/* 83 */                        return;
                            } else {
                                try {
/* 88 */                            this.f12900d = i2 + 1;
/* 96 */                            bArr[i2] = (byte) ((((int) j) & 127) | 128);
/* 98 */                            j >>>= 7;
                                } catch (IndexOutOfBoundsException e) {
/* 131 */                           throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12900d), Integer.valueOf(i), 1), e, 3);
                                }
                            }
/* 131 */                   throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12900d), Integer.valueOf(i), 1), e, 3);
                        }
                    }
                    while (true) {
/* 22 */                long j3 = j & (-128);
/* 26 */                int i3 = this.f12900d;
/* 28 */                if (j3 == 0) {
/* 32 */                    this.f12900d = i3 + 1;
/* 42 */                    tq3.f17232c.mo7995o(bArr, tq3.f17235f + ((long) i3), (byte) j);
/* 45 */                    return;
                        }
/* 48 */                this.f12900d = i3 + 1;
/* 62 */                tq3.f17232c.mo7995o(bArr, tq3.f17235f + ((long) i3), (byte) ((((int) j) & 127) | 128));
/* 65 */                j >>>= 7;
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m6168m(long j) throws C1868kw {
                    try {
/* 1 */                 byte[] bArr = this.f12898b;
/* 3 */                 int i = this.f12900d;
/* 5 */                 int i2 = i + 1;
/* 7 */                 this.f12900d = i2;
/* 13 */                bArr[i] = (byte) (((int) j) & 255);
/* 15 */                int i3 = i + 2;
/* 17 */                this.f12900d = i3;
/* 27 */                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
/* 29 */                int i4 = i + 3;
/* 31 */                this.f12900d = i4;
/* 41 */                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
/* 43 */                int i5 = i + 4;
/* 45 */                this.f12900d = i5;
/* 55 */                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
/* 57 */                int i6 = i + 5;
/* 59 */                this.f12900d = i6;
/* 69 */                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
/* 71 */                int i7 = i + 6;
/* 73 */                this.f12900d = i7;
/* 83 */                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
/* 85 */                int i8 = i + 7;
/* 87 */                this.f12900d = i8;
/* 97 */                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
/* 100 */               this.f12900d = i + 8;
/* 109 */               bArr[i8] = (byte) (((int) (j >> 56)) & 255);
                    } catch (IndexOutOfBoundsException e) {
/* 146 */               throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12900d), Integer.valueOf(this.f12899c), 1), e, 3);
                    }
                }

                /* JADX INFO: renamed from: n */
                public final void m6169n(byte[] bArr, int i) throws C1868kw {
                    try {
/* 6 */                 System.arraycopy(bArr, 0, this.f12898b, this.f12900d, i);
/* 12 */                this.f12900d += i;
                    } catch (IndexOutOfBoundsException e) {
/* 48 */                throw new C1868kw(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12900d), Integer.valueOf(this.f12899c), Integer.valueOf(i)), e, 3);
                    }
                }
            }
