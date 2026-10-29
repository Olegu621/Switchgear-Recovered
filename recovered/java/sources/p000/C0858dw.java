            package p000;

            import java.util.Arrays;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: dw */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0858dw extends AbstractC1006hw {

                /* JADX INFO: renamed from: c */
                public final byte[] f7423c;

                /* JADX INFO: renamed from: d */
                public int f7424d;

                /* JADX INFO: renamed from: e */
                public int f7425e;

                /* JADX INFO: renamed from: f */
                public int f7426f;

                /* JADX INFO: renamed from: g */
                public final int f7427g;

                /* JADX INFO: renamed from: h */
                public int f7428h;

                /* JADX INFO: renamed from: i */
                public int f7429i = AbstractC0208c9.API_PRIORITY_OTHER;

                public C0858dw(byte[] bArr, int i, int i2, boolean z) {
/* 9 */             this.f7423c = bArr;
/* 12 */            this.f7424d = i2 + i;
/* 14 */            this.f7426f = i;
/* 16 */            this.f7427g = i;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: A */
                public final String mo3244A() throws pz0 {
/* 1 */             int iM3251J = m3251J();
/* 5 */             if (iM3251J > 0) {
/* 7 */                 int i = this.f7424d;
/* 9 */                 int i2 = this.f7426f;
/* 12 */                if (iM3251J <= i - i2) {
/* 20 */                    String str = new String(this.f7423c, i2, iM3251J, ez0.f7923a);
/* 26 */                    this.f7426f += iM3251J;
/* 28 */                    return str;
                        }
                    }
/* 29 */            if (iM3251J == 0) {
/* 31 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 34 */            if (iM3251J < 0) {
/* 40 */                throw pz0.m7626e();
                    }
/* 45 */            throw pz0.m7628g();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: B */
                public final String mo3245B() throws pz0 {
/* 1 */             int iM3251J = m3251J();
/* 5 */             if (iM3251J > 0) {
/* 7 */                 int i = this.f7424d;
/* 9 */                 int i2 = this.f7426f;
/* 12 */                if (iM3251J <= i - i2) {
/* 18 */                    String strM4447l = m13.f13547a.m4447l(this.f7423c, i2, iM3251J);
/* 25 */                    this.f7426f += iM3251J;
/* 27 */                    return strM4447l;
                        }
                    }
/* 28 */            if (iM3251J == 0) {
/* 30 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 33 */            if (iM3251J <= 0) {
/* 39 */                throw pz0.m7626e();
                    }
/* 44 */            throw pz0.m7628g();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: C */
                public final int mo3246C() throws pz0 {
/* 5 */             if (mo3257g()) {
/* 8 */                 this.f7428h = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iM3251J = m3251J();
/* 15 */            this.f7428h = iM3251J;
/* 19 */            if ((iM3251J >>> 3) != 0) {
/* 21 */                return iM3251J;
                    }
/* 26 */            throw pz0.m7622a();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: D */
                public final int mo3247D() {
/* 1 */             return m3251J();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: E */
                public final long mo3248E() {
/* 1 */             return m3252K();
                }

                /* JADX INFO: renamed from: H */
                public final int m3249H() throws pz0 {
/* 1 */             int i = this.f7426f;
/* 7 */             if (this.f7424d - i < 4) {
/* 51 */                throw pz0.m7628g();
                    }
/* 11 */            this.f7426f = i + 4;
/* 13 */            byte[] bArr = this.f7423c;
/* 45 */            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
                }

                /* JADX INFO: renamed from: I */
                public final long m3250I() throws pz0 {
/* 1 */             int i = this.f7426f;
/* 8 */             if (this.f7424d - i < 8) {
/* 97 */                throw pz0.m7628g();
                    }
/* 12 */            this.f7426f = i + 8;
/* 14 */            byte[] bArr = this.f7423c;
/* 90 */            return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
                }

                /* JADX INFO: renamed from: J */
                public final int m3251J() {
                    int i;
/* 1 */             int i2 = this.f7426f;
/* 3 */             int i3 = this.f7424d;
/* 5 */             if (i3 != i2) {
/* 8 */                 int i4 = i2 + 1;
/* 10 */                byte[] bArr = this.f7423c;
/* 12 */                byte b = bArr[i2];
/* 14 */                if (b >= 0) {
/* 16 */                    this.f7426f = i4;
/* 18 */                    return b;
                        }
/* 22 */                if (i3 - i4 >= 9) {
/* 25 */                    int i5 = i2 + 2;
/* 31 */                    int i6 = (bArr[i4] << 7) ^ b;
/* 32 */                    if (i6 < 0) {
/* 34 */                        i = i6 ^ (-128);
                            } else {
/* 37 */                        int i7 = i2 + 3;
/* 43 */                        int i8 = (bArr[i5] << 14) ^ i6;
/* 44 */                        if (i8 >= 0) {
/* 46 */                            i = i8 ^ 16256;
                                } else {
/* 50 */                            int i9 = i2 + 4;
/* 56 */                            int i10 = i8 ^ (bArr[i7] << 21);
/* 57 */                            if (i10 < 0) {
/* 62 */                                i = (-2080896) ^ i10;
                                    } else {
/* 65 */                                i7 = i2 + 5;
/* 67 */                                byte b2 = bArr[i9];
/* 75 */                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
/* 76 */                                if (b2 < 0) {
/* 78 */                                    i9 = i2 + 6;
/* 82 */                                    if (bArr[i7] < 0) {
/* 84 */                                        i7 = i2 + 7;
/* 88 */                                        if (bArr[i9] < 0) {
/* 90 */                                            i9 = i2 + 8;
/* 94 */                                            if (bArr[i7] < 0) {
/* 96 */                                                i7 = i2 + 9;
/* 100 */                                               if (bArr[i9] < 0) {
/* 102 */                                                   int i12 = i2 + 10;
/* 106 */                                                   if (bArr[i7] >= 0) {
/* 115 */                                                       i5 = i12;
/* 116 */                                                       i = i11;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
/* 120 */                                   i = i11;
                                        }
/* 118 */                               i = i11;
                                    }
/* 63 */                            i5 = i9;
                                }
/* 48 */                        i5 = i7;
                            }
/* 122 */                   this.f7426f = i5;
/* 124 */                   return i;
                        }
                    }
/* 112 */           return (int) m3253L();
                }

                /* JADX INFO: renamed from: K */
                public final long m3252K() {
                    long j;
                    long j2;
                    long j3;
                    long j4;
/* 1 */             int i = this.f7426f;
/* 3 */             int i2 = this.f7424d;
/* 5 */             if (i2 != i) {
/* 9 */                 int i3 = i + 1;
/* 11 */                byte[] bArr = this.f7423c;
/* 13 */                byte b = bArr[i];
/* 15 */                if (b >= 0) {
/* 17 */                    this.f7426f = i3;
/* 19 */                    return b;
                        }
/* 24 */                if (i2 - i3 >= 9) {
/* 28 */                    int i4 = i + 2;
/* 34 */                    int i5 = (bArr[i3] << 7) ^ b;
/* 35 */                    if (i5 < 0) {
/* 37 */                        j = i5 ^ (-128);
                            } else {
/* 42 */                        int i6 = i + 3;
/* 48 */                        int i7 = (bArr[i4] << 14) ^ i5;
/* 49 */                        if (i7 >= 0) {
/* 51 */                            j = i7 ^ 16256;
/* 54 */                            i4 = i6;
                                } else {
/* 57 */                            int i8 = i + 4;
/* 63 */                            int i9 = i7 ^ (bArr[i6] << 21);
/* 64 */                            if (i9 < 0) {
/* 69 */                                j4 = (-2080896) ^ i9;
                                    } else {
                                        long j5 = i9;
/* 77 */                                i4 = i + 5;
/* 85 */                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
/* 90 */                                if (j6 >= 0) {
/* 92 */                                    j3 = 266354560;
                                        } else {
/* 97 */                                    i8 = i + 6;
/* 105 */                                   long j7 = j6 ^ (((long) bArr[i4]) << 35);
/* 108 */                                   if (j7 < 0) {
/* 110 */                                       j2 = -34093383808L;
                                            } else {
/* 117 */                                       i4 = i + 7;
/* 125 */                                       j6 = j7 ^ (((long) bArr[i8]) << 42);
/* 128 */                                       if (j6 >= 0) {
/* 130 */                                           j3 = 4363953127296L;
                                                } else {
/* 136 */                                           i8 = i + 8;
/* 144 */                                           j7 = j6 ^ (((long) bArr[i4]) << 49);
/* 147 */                                           if (j7 < 0) {
/* 149 */                                               j2 = -558586000294016L;
                                                    } else {
/* 155 */                                               i4 = i + 9;
/* 169 */                                               long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
/* 172 */                                               if (j8 < 0) {
/* 174 */                                                   int i10 = i + 10;
/* 181 */                                                   if (bArr[i4] >= 0) {
/* 188 */                                                       i4 = i10;
                                                            }
                                                        }
/* 189 */                                               j = j8;
                                                    }
                                                }
                                            }
/* 115 */                                   j4 = j2 ^ j7;
                                        }
/* 95 */                                j = j3 ^ j6;
                                    }
/* 72 */                            i4 = i8;
/* 73 */                            j = j4;
                                }
                            }
/* 190 */                   this.f7426f = i4;
/* 192 */                   return j;
                        }
                    }
/* 183 */           return m3253L();
                }

                /* JADX INFO: renamed from: L */
                public final long m3253L() throws pz0 {
/* 1 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 8 */                 int i2 = this.f7426f;
/* 12 */                if (i2 == this.f7424d) {
/* 39 */                    throw pz0.m7628g();
                        }
/* 16 */                this.f7426f = i2 + 1;
/* 20 */                byte b = this.f7423c[i2];
/* 26 */                j |= ((long) (b & 127)) << i;
/* 29 */                if ((b & 128) == 0) {
/* 31 */                    return j;
                        }
                    }
/* 44 */            throw pz0.m7625d();
                }

                /* JADX INFO: renamed from: M */
                public final void m3254M() {
/* 5 */             int i = this.f7424d + this.f7425e;
/* 6 */             this.f7424d = i;
/* 10 */            int i2 = i - this.f7427g;
/* 12 */            int i3 = this.f7429i;
/* 14 */            if (i2 <= i3) {
/* 24 */                this.f7425e = 0;
/* 26 */                return;
                    }
/* 16 */            int i4 = i2 - i3;
/* 17 */            this.f7425e = i4;
/* 20 */            this.f7424d = i - i4;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: b */
                public final void mo3255b(int i) {
/* 3 */             if (this.f7428h != i) {
/* 13 */                throw new pz0("Protocol message end-group tag did not match expected tag.");
                    }
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: f */
                public final int mo3256f() {
/* 5 */             return this.f7426f - this.f7427g;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: g */
                public final boolean mo3257g() {
                    return this.f7426f == this.f7424d;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: j */
                public final void mo3258j(int i) {
/* 1 */             this.f7429i = i;
/* 3 */             m3254M();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: l */
                public final int mo3259l(int i) throws pz0 {
/* 1 */             if (i < 0) {
/* 34 */                throw pz0.m7626e();
                    }
/* 7 */             int iMo3256f = mo3256f() + i;
/* 8 */             if (iMo3256f < 0) {
/* 29 */                throw pz0.m7627f();
                    }
/* 10 */            int i2 = this.f7429i;
/* 12 */            if (iMo3256f > i2) {
/* 24 */                throw pz0.m7628g();
                    }
/* 14 */            this.f7429i = iMo3256f;
/* 16 */            m3254M();
/* 19 */            return i2;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: m */
                public final boolean mo3260m() {
                    return m3252K() != 0;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:17:0x0033  */
                /* JADX WARN: Code duplicated, block: B:20:0x003d  */
                /* JADX WARN: Code duplicated, block: B:22:0x0042  */
                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: n */
                public final C2222tl mo3261n() throws pz0 {
                    byte[] bArrCopyOfRange;
/* 1 */             int iM3251J = m3251J();
/* 5 */             byte[] bArr = this.f7423c;
/* 7 */             if (iM3251J > 0) {
/* 9 */                 int i = this.f7424d;
/* 11 */                int i2 = this.f7426f;
/* 14 */                if (iM3251J <= i - i2) {
/* 16 */                    C2222tl c2222tlM9303c = AbstractC2298vl.m9303c(bArr, i2, iM3251J);
/* 23 */                    this.f7426f += iM3251J;
/* 25 */                    return c2222tlM9303c;
                        }
                    }
/* 26 */            if (iM3251J == 0) {
/* 28 */                return AbstractC2298vl.f18234b;
                    }
/* 31 */            if (iM3251J > 0) {
/* 33 */                int i3 = this.f7424d;
/* 35 */                int i4 = this.f7426f;
/* 38 */                if (iM3251J <= i3 - i4) {
/* 40 */                    int i5 = iM3251J + i4;
/* 41 */                    this.f7426f = i5;
/* 43 */                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                        } else {
/* 48 */                    if (iM3251J <= 0) {
/* 71 */                        throw pz0.m7628g();
                            }
/* 50 */                    if (iM3251J == 0) {
/* 66 */                        throw pz0.m7626e();
                            }
/* 52 */                    bArrCopyOfRange = ez0.f7924b;
                        }
                    } else {
/* 48 */                if (iM3251J <= 0) {
/* 71 */                    throw pz0.m7628g();
                        }
/* 50 */                if (iM3251J == 0) {
/* 66 */                    throw pz0.m7626e();
                        }
/* 52 */                bArrCopyOfRange = ez0.f7924b;
                    }
/* 54 */            C2222tl c2222tl = AbstractC2298vl.f18234b;
/* 58 */            return new C2222tl(bArrCopyOfRange);
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: p */
                public final double mo3262p() {
/* 5 */             return Double.longBitsToDouble(m3250I());
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: q */
                public final int mo3263q() {
/* 1 */             return m3251J();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: r */
                public final int mo3264r() {
/* 1 */             return m3249H();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: s */
                public final long mo3265s() {
/* 1 */             return m3250I();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: t */
                public final float mo3266t() {
/* 5 */             return Float.intBitsToFloat(m3249H());
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: u */
                public final int mo3267u() {
/* 1 */             return m3251J();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: v */
                public final long mo3268v() {
/* 1 */             return m3252K();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: w */
                public final int mo3269w() {
/* 1 */             return m3249H();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: x */
                public final long mo3270x() {
/* 1 */             return m3250I();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: y */
                public final int mo3271y() {
/* 5 */             return AbstractC1006hw.m4384d(m3251J());
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: z */
                public final long mo3272z() {
/* 5 */             return AbstractC1006hw.m4385e(m3252K());
                }
            }
