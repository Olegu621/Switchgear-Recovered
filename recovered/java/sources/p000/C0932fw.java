            package p000;

            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: fw */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0932fw extends AbstractC1006hw {

                /* JADX INFO: renamed from: c */
                public final ByteArrayInputStream f8366c;

                /* JADX INFO: renamed from: d */
                public final byte[] f8367d;

                /* JADX INFO: renamed from: e */
                public int f8368e;

                /* JADX INFO: renamed from: f */
                public int f8369f;

                /* JADX INFO: renamed from: g */
                public int f8370g;

                /* JADX INFO: renamed from: h */
                public int f8371h;

                /* JADX INFO: renamed from: i */
                public int f8372i;

                /* JADX INFO: renamed from: j */
                public int f8373j = AbstractC0208c9.API_PRIORITY_OTHER;

                public C0932fw(ByteArrayInputStream byteArrayInputStream) {
/* 9 */             Charset charset = ez0.f7923a;
/* 11 */            this.f8366c = byteArrayInputStream;
/* 17 */            this.f8367d = new byte[4096];
/* 20 */            this.f8368e = 0;
/* 22 */            this.f8370g = 0;
/* 24 */            this.f8372i = 0;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: A */
                public final String mo3244A() throws pz0 {
/* 1 */             int iM3842M = m3842M();
/* 5 */             byte[] bArr = this.f8367d;
/* 7 */             if (iM3842M > 0) {
/* 9 */                 int i = this.f8368e;
/* 11 */                int i2 = this.f8370g;
/* 14 */                if (iM3842M <= i - i2) {
/* 20 */                    String str = new String(bArr, i2, iM3842M, ez0.f7923a);
/* 26 */                    this.f8370g += iM3842M;
/* 28 */                    return str;
                        }
                    }
/* 29 */            if (iM3842M == 0) {
/* 31 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 36 */            if (iM3842M > this.f8368e) {
/* 64 */                return new String(m3837H(iM3842M), ez0.f7923a);
                    }
/* 38 */            m3846Q(iM3842M);
/* 47 */            String str2 = new String(bArr, this.f8370g, iM3842M, ez0.f7923a);
/* 53 */            this.f8370g += iM3842M;
/* 55 */            return str2;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: B */
                public final String mo3245B() throws IOException {
/* 1 */             int iM3842M = m3842M();
/* 5 */             int i = this.f8370g;
/* 7 */             int i2 = this.f8368e;
/* 9 */             int i3 = i2 - i;
/* 11 */            byte[] bArrM3837H = this.f8367d;
/* 13 */            if (iM3842M <= i3 && iM3842M > 0) {
/* 19 */                this.f8370g = i + iM3842M;
                    } else {
/* 22 */                if (iM3842M == 0) {
/* 24 */                    return HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 27 */                i = 0;
/* 28 */                if (iM3842M <= i2) {
/* 30 */                    m3846Q(iM3842M);
/* 33 */                    this.f8370g = iM3842M;
                        } else {
/* 36 */                    bArrM3837H = m3837H(iM3842M);
                        }
                    }
/* 42 */            return m13.f13547a.m4447l(bArrM3837H, i, iM3842M);
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: C */
                public final int mo3246C() throws pz0 {
/* 5 */             if (mo3257g()) {
/* 8 */                 this.f8371h = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iM3842M = m3842M();
/* 15 */            this.f8371h = iM3842M;
/* 19 */            if ((iM3842M >>> 3) != 0) {
/* 21 */                return iM3842M;
                    }
/* 26 */            throw pz0.m7622a();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: D */
                public final int mo3247D() {
/* 1 */             return m3842M();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: E */
                public final long mo3248E() {
/* 1 */             return m3843N();
                }

                /* JADX INFO: renamed from: H */
                public final byte[] m3837H(int i) throws IOException {
/* 1 */             byte[] bArrM3838I = m3838I(i);
/* 5 */             if (bArrM3838I != null) {
/* 7 */                 return bArrM3838I;
                    }
/* 8 */             int i2 = this.f8370g;
/* 10 */            int i3 = this.f8368e;
/* 12 */            int length = i3 - i2;
/* 17 */            this.f8372i += i3;
/* 20 */            this.f8370g = 0;
/* 22 */            this.f8368e = 0;
/* 26 */            ArrayList<byte[]> arrayListM3839J = m3839J(i - length);
/* 30 */            byte[] bArr = new byte[i];
/* 34 */            System.arraycopy(this.f8367d, i2, bArr, 0, length);
/* 45 */            for (byte[] bArr2 : arrayListM3839J) {
/* 54 */                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
/* 58 */                length += bArr2.length;
                    }
/* 60 */            return bArr;
                }

                /* JADX INFO: renamed from: I */
                public final byte[] m3838I(int i) throws IOException {
/* 1 */             if (i == 0) {
/* 3 */                 return ez0.f7924b;
                    }
/* 6 */             if (i < 0) {
/* 122 */               throw pz0.m7626e();
                    }
/* 8 */             int i2 = this.f8372i;
/* 10 */            int i3 = this.f8370g;
/* 14 */            int i4 = i2 + i3 + i;
/* 20 */            if (i4 - AbstractC0208c9.API_PRIORITY_OTHER > 0) {
/* 117 */               throw new pz0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                    }
/* 22 */            int i5 = this.f8373j;
/* 24 */            if (i4 > i5) {
/* 102 */               m3847R((i5 - i2) - i3);
/* 109 */               throw pz0.m7628g();
                    }
/* 28 */            int i6 = this.f8368e - i3;
/* 29 */            int i7 = i - i6;
/* 34 */            ByteArrayInputStream byteArrayInputStream = this.f8366c;
/* 36 */            if (i7 >= 4096) {
                        try {
/* 42 */                    if (i7 > byteArrayInputStream.available()) {
/* 45 */                        return null;
                            }
                        } catch (pz0 e) {
/* 48 */                    e.f15349a = true;
/* 50 */                    throw e;
                        }
                    }
/* 51 */            byte[] bArr = new byte[i];
/* 58 */            System.arraycopy(this.f8367d, this.f8370g, bArr, 0, i6);
/* 66 */            this.f8372i += this.f8368e;
/* 68 */            this.f8370g = 0;
/* 70 */            this.f8368e = 0;
/* 72 */            while (i6 < i) {
                        try {
/* 76 */                    int i8 = byteArrayInputStream.read(bArr, i6, i - i6);
/* 81 */                    if (i8 == -1) {
/* 94 */                        throw pz0.m7628g();
                            }
/* 86 */                    this.f8372i += i8;
/* 88 */                    i6 += i8;
                        } catch (pz0 e2) {
/* 96 */                    e2.f15349a = true;
/* 98 */                    throw e2;
                        }
                    }
/* 99 */            return bArr;
                }

                /* JADX INFO: renamed from: J */
                public final ArrayList m3839J(int i) throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             while (i > 0) {
/* 10 */                int iMin = Math.min(i, 4096);
/* 14 */                byte[] bArr = new byte[iMin];
/* 16 */                int i2 = 0;
/* 17 */                while (i2 < iMin) {
/* 23 */                    int i3 = this.f8366c.read(bArr, i2, iMin - i2);
/* 28 */                    if (i3 == -1) {
/* 41 */                        throw pz0.m7628g();
                            }
/* 33 */                    this.f8372i += i3;
/* 35 */                    i2 += i3;
                        }
/* 42 */                i -= iMin;
/* 43 */                arrayList.add(bArr);
                    }
/* 47 */            return arrayList;
                }

                /* JADX INFO: renamed from: K */
                public final int m3840K() throws pz0 {
/* 1 */             int i = this.f8370g;
/* 7 */             if (this.f8368e - i < 4) {
/* 9 */                 m3846Q(4);
/* 12 */                i = this.f8370g;
                    }
/* 16 */            this.f8370g = i + 4;
/* 18 */            byte[] bArr = this.f8367d;
/* 50 */            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
                }

                /* JADX INFO: renamed from: L */
                public final long m3841L() throws pz0 {
/* 1 */             int i = this.f8370g;
/* 8 */             if (this.f8368e - i < 8) {
/* 10 */                m3846Q(8);
/* 13 */                i = this.f8370g;
                    }
/* 17 */            this.f8370g = i + 8;
/* 19 */            byte[] bArr = this.f8367d;
/* 95 */            return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
                }

                /* JADX INFO: renamed from: M */
                public final int m3842M() {
                    int i;
/* 1 */             int i2 = this.f8370g;
/* 3 */             int i3 = this.f8368e;
/* 5 */             if (i3 != i2) {
/* 8 */                 int i4 = i2 + 1;
/* 10 */                byte[] bArr = this.f8367d;
/* 12 */                byte b = bArr[i2];
/* 14 */                if (b >= 0) {
/* 16 */                    this.f8370g = i4;
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
/* 122 */                   this.f8370g = i5;
/* 124 */                   return i;
                        }
                    }
/* 112 */           return (int) m3844O();
                }

                /* JADX INFO: renamed from: N */
                public final long m3843N() {
                    long j;
                    long j2;
                    long j3;
                    long j4;
/* 1 */             int i = this.f8370g;
/* 3 */             int i2 = this.f8368e;
/* 5 */             if (i2 != i) {
/* 9 */                 int i3 = i + 1;
/* 11 */                byte[] bArr = this.f8367d;
/* 13 */                byte b = bArr[i];
/* 15 */                if (b >= 0) {
/* 17 */                    this.f8370g = i3;
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
/* 190 */                   this.f8370g = i4;
/* 192 */                   return j;
                        }
                    }
/* 183 */           return m3844O();
                }

                /* JADX INFO: renamed from: O */
                public final long m3844O() throws pz0 {
/* 1 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 12 */                if (this.f8370g == this.f8368e) {
/* 15 */                    m3846Q(1);
                        }
/* 18 */                int i2 = this.f8370g;
/* 22 */                this.f8370g = i2 + 1;
/* 26 */                byte b = this.f8367d[i2];
/* 32 */                j |= ((long) (b & 127)) << i;
/* 35 */                if ((b & 128) == 0) {
/* 37 */                    return j;
                        }
                    }
/* 45 */            throw pz0.m7625d();
                }

                /* JADX INFO: renamed from: P */
                public final void m3845P() {
/* 5 */             int i = this.f8368e + this.f8369f;
/* 6 */             this.f8368e = i;
/* 10 */            int i2 = this.f8372i + i;
/* 11 */            int i3 = this.f8373j;
/* 13 */            if (i2 <= i3) {
/* 23 */                this.f8369f = 0;
/* 25 */                return;
                    }
/* 15 */            int i4 = i2 - i3;
/* 16 */            this.f8369f = i4;
/* 19 */            this.f8368e = i - i4;
                }

                /* JADX INFO: renamed from: Q */
                public final void m3846Q(int i) throws pz0 {
/* 5 */             if (m3848S(i)) {
/* 31 */                return;
                    }
/* 16 */            if (i <= (AbstractC0208c9.API_PRIORITY_OTHER - this.f8372i) - this.f8370g) {
/* 30 */                throw pz0.m7628g();
                    }
/* 25 */            throw new pz0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }

                /* JADX INFO: renamed from: R */
                public final void m3847R(int i) throws pz0 {
/* 1 */             int i2 = this.f8368e;
/* 3 */             int i3 = this.f8370g;
/* 5 */             int i4 = i2 - i3;
/* 6 */             if (i <= i4 && i >= 0) {
/* 11 */                this.f8370g = i3 + i;
/* 13 */                return;
                    }
/* 14 */            ByteArrayInputStream byteArrayInputStream = this.f8366c;
/* 16 */            if (i < 0) {
/* 162 */               throw pz0.m7626e();
                    }
/* 18 */            int i5 = this.f8372i;
/* 20 */            int i6 = i5 + i3;
/* 22 */            int i7 = i6 + i;
/* 24 */            int i8 = this.f8373j;
/* 26 */            if (i7 > i8) {
/* 150 */               m3847R((i8 - i5) - i3);
/* 157 */               throw pz0.m7628g();
                    }
/* 28 */            this.f8372i = i6;
/* 31 */            this.f8368e = 0;
/* 33 */            this.f8370g = 0;
/* 36 */            while (i4 < i) {
/* 38 */                long j = i - i4;
                        try {
                            try {
/* 41 */                        long jSkip = byteArrayInputStream.skip(j);
/* 49 */                        if (jSkip < 0 || jSkip > j) {
/* 95 */                            throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                                }
/* 55 */                        if (jSkip == 0) {
                                    break;
                                } else {
/* 59 */                            i4 += (int) jSkip;
                                }
                            } catch (pz0 e) {
/* 99 */                        e.f15349a = true;
/* 101 */                       throw e;
                            }
                        } catch (Throwable th) {
/* 105 */                   this.f8372i += i4;
/* 107 */                   m3845P();
/* 110 */                   throw th;
                        }
                    }
/* 114 */           this.f8372i += i4;
/* 116 */           m3845P();
/* 119 */           if (i4 >= i) {
/* 147 */               return;
                    }
/* 121 */           int i9 = this.f8368e;
/* 125 */           int i10 = i9 - this.f8370g;
/* 127 */           this.f8370g = i9;
/* 129 */           m3846Q(1);
                    while (true) {
/* 132 */               int i11 = i - i10;
/* 134 */               int i12 = this.f8368e;
/* 136 */               if (i11 <= i12) {
/* 145 */                   this.f8370g = i11;
/* 147 */                   return;
                        } else {
/* 138 */                   i10 += i12;
/* 139 */                   this.f8370g = i12;
/* 141 */                   m3846Q(1);
                        }
                    }
                }

                /* JADX INFO: renamed from: S */
                public final boolean m3848S(int i) throws IOException {
/* 1 */             ByteArrayInputStream byteArrayInputStream = this.f8366c;
/* 3 */             int i2 = this.f8370g;
/* 5 */             int i3 = i2 + i;
/* 7 */             int i4 = this.f8368e;
/* 10 */            if (i3 <= i4) {
/* 145 */               f42.m3656l(AbstractC0886en.m3505i(i, "refillBuffer() called when ", " bytes were already available in buffer"));
/* 9 */                 return false;
                    }
/* 12 */            int i5 = this.f8372i;
/* 20 */            if (i <= (AbstractC0208c9.API_PRIORITY_OTHER - i5) - i2 && i5 + i2 + i <= this.f8373j) {
/* 30 */                byte[] bArr = this.f8367d;
/* 32 */                if (i2 > 0) {
/* 34 */                    if (i4 > i2) {
/* 37 */                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                            }
/* 43 */                    this.f8372i += i2;
/* 48 */                    this.f8368e -= i2;
/* 50 */                    this.f8370g = 0;
                        }
/* 52 */                int i6 = this.f8368e;
                        try {
/* 65 */                    int i7 = byteArrayInputStream.read(bArr, i6, Math.min(bArr.length - i6, (AbstractC0208c9.API_PRIORITY_OTHER - this.f8372i) - i6));
/* 69 */                    if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
/* 132 */                       throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                            }
/* 77 */                    if (i7 > 0) {
/* 82 */                        this.f8368e += i7;
/* 84 */                        m3845P();
/* 89 */                        if (this.f8368e >= i) {
/* 64 */                            return true;
                                }
/* 92 */                        return m3848S(i);
                            }
                        } catch (pz0 e) {
/* 134 */                   e.f15349a = true;
/* 136 */                   throw e;
                        }
                    }
/* 9 */             return false;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: b */
                public final void mo3255b(int i) throws pz0 {
/* 3 */             if (this.f8371h != i) {
/* 13 */                throw new pz0("Protocol message end-group tag did not match expected tag.");
                    }
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: f */
                public final int mo3256f() {
/* 5 */             return this.f8372i + this.f8370g;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: g */
                public final boolean mo3257g() {
                    return this.f8370g == this.f8368e && !m3848S(1);
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: j */
                public final void mo3258j(int i) {
/* 1 */             this.f8373j = i;
/* 3 */             m3845P();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: l */
                public final int mo3259l(int i) throws pz0 {
/* 1 */             if (i < 0) {
/* 28 */                throw pz0.m7626e();
                    }
/* 8 */             int i2 = this.f8372i + this.f8370g + i;
/* 9 */             int i3 = this.f8373j;
/* 11 */            if (i2 > i3) {
/* 23 */                throw pz0.m7628g();
                    }
/* 13 */            this.f8373j = i2;
/* 15 */            m3845P();
/* 18 */            return i3;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: m */
                public final boolean mo3260m() {
                    return m3843N() != 0;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: n */
                public final C2222tl mo3261n() throws IOException {
/* 1 */             int iM3842M = m3842M();
/* 5 */             int i = this.f8368e;
/* 7 */             int i2 = this.f8370g;
/* 9 */             int i3 = i - i2;
/* 10 */            byte[] bArr = this.f8367d;
/* 12 */            if (iM3842M <= i3 && iM3842M > 0) {
/* 16 */                C2222tl c2222tlM9303c = AbstractC2298vl.m9303c(bArr, i2, iM3842M);
/* 23 */                this.f8370g += iM3842M;
/* 25 */                return c2222tlM9303c;
                    }
/* 26 */            if (iM3842M == 0) {
/* 28 */                return AbstractC2298vl.f18234b;
                    }
/* 31 */            byte[] bArrM3838I = m3838I(iM3842M);
/* 36 */            if (bArrM3838I != null) {
/* 39 */                return AbstractC2298vl.m9303c(bArrM3838I, 0, bArrM3838I.length);
                    }
/* 44 */            int i4 = this.f8370g;
/* 46 */            int i5 = this.f8368e;
/* 48 */            int length = i5 - i4;
/* 53 */            this.f8372i += i5;
/* 55 */            this.f8370g = 0;
/* 57 */            this.f8368e = 0;
/* 61 */            ArrayList<byte[]> arrayListM3839J = m3839J(iM3842M - length);
/* 65 */            byte[] bArr2 = new byte[iM3842M];
/* 67 */            System.arraycopy(bArr, i4, bArr2, 0, length);
/* 78 */            for (byte[] bArr3 : arrayListM3839J) {
/* 87 */                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
/* 91 */                length += bArr3.length;
                    }
/* 93 */            C2222tl c2222tl = AbstractC2298vl.f18234b;
/* 97 */            return new C2222tl(bArr2);
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: p */
                public final double mo3262p() {
/* 5 */             return Double.longBitsToDouble(m3841L());
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: q */
                public final int mo3263q() {
/* 1 */             return m3842M();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: r */
                public final int mo3264r() {
/* 1 */             return m3840K();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: s */
                public final long mo3265s() {
/* 1 */             return m3841L();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: t */
                public final float mo3266t() {
/* 5 */             return Float.intBitsToFloat(m3840K());
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: u */
                public final int mo3267u() {
/* 1 */             return m3842M();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: v */
                public final long mo3268v() {
/* 1 */             return m3843N();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: w */
                public final int mo3269w() {
/* 1 */             return m3840K();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: x */
                public final long mo3270x() {
/* 1 */             return m3841L();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: y */
                public final int mo3271y() {
/* 5 */             return AbstractC1006hw.m4384d(m3842M());
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: z */
                public final long mo3272z() {
/* 5 */             return AbstractC1006hw.m4385e(m3843N());
                }
            }
