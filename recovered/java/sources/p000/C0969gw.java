            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            import java.util.ArrayList;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: gw */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0969gw extends AbstractC1006hw {

                /* JADX INFO: renamed from: c */
                public final InputStream f8826c;

                /* JADX INFO: renamed from: d */
                public final byte[] f8827d;

                /* JADX INFO: renamed from: e */
                public int f8828e;

                /* JADX INFO: renamed from: f */
                public int f8829f;

                /* JADX INFO: renamed from: g */
                public int f8830g;

                /* JADX INFO: renamed from: h */
                public int f8831h;

                /* JADX INFO: renamed from: i */
                public int f8832i;

                /* JADX INFO: renamed from: j */
                public int f8833j = AbstractC0208c9.API_PRIORITY_OTHER;

                public C0969gw(InputStream inputStream) {
/* 11 */            fz0.m3858a(inputStream, "input");
/* 14 */            this.f8826c = inputStream;
/* 20 */            this.f8827d = new byte[4096];
/* 23 */            this.f8828e = 0;
/* 25 */            this.f8830g = 0;
/* 27 */            this.f8832i = 0;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: A */
                public final String mo3244A() throws qz0 {
/* 1 */             int iM4029M = m4029M();
/* 5 */             byte[] bArr = this.f8827d;
/* 7 */             if (iM4029M > 0) {
/* 9 */                 int i = this.f8828e;
/* 11 */                int i2 = this.f8830g;
/* 14 */                if (iM4029M <= i - i2) {
/* 20 */                    String str = new String(bArr, i2, iM4029M, fz0.f8401a);
/* 26 */                    this.f8830g += iM4029M;
/* 28 */                    return str;
                        }
                    }
/* 29 */            if (iM4029M == 0) {
/* 31 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 34 */            if (iM4029M < 0) {
/* 74 */                throw qz0.m8032d();
                    }
/* 38 */            if (iM4029M > this.f8828e) {
/* 66 */                return new String(m4024H(iM4029M), fz0.f8401a);
                    }
/* 40 */            m4033Q(iM4029M);
/* 49 */            String str2 = new String(bArr, this.f8830g, iM4029M, fz0.f8401a);
/* 55 */            this.f8830g += iM4029M;
/* 57 */            return str2;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: B */
                public final String mo3245B() throws IOException {
/* 1 */             int iM4029M = m4029M();
/* 5 */             int i = this.f8830g;
/* 7 */             int i2 = this.f8828e;
/* 9 */             int i3 = i2 - i;
/* 11 */            byte[] bArrM4024H = this.f8827d;
/* 13 */            if (iM4029M <= i3 && iM4029M > 0) {
/* 19 */                this.f8830g = i + iM4029M;
                    } else {
/* 22 */                if (iM4029M == 0) {
/* 24 */                    return HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 27 */                if (iM4029M < 0) {
/* 53 */                    throw qz0.m8032d();
                        }
/* 29 */                i = 0;
/* 30 */                if (iM4029M <= i2) {
/* 32 */                    m4033Q(iM4029M);
/* 35 */                    this.f8830g = iM4029M;
                        } else {
/* 38 */                    bArrM4024H = m4024H(iM4029M);
                        }
                    }
/* 44 */            return n13.f14100a.m5665e(bArrM4024H, i, iM4029M);
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: C */
                public final int mo3246C() throws qz0 {
/* 5 */             if (mo3257g()) {
/* 8 */                 this.f8831h = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iM4029M = m4029M();
/* 15 */            this.f8831h = iM4029M;
/* 19 */            if ((iM4029M >>> 3) != 0) {
/* 21 */                return iM4029M;
                    }
/* 29 */            throw new qz0("Protocol message contained an invalid tag (zero).");
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: D */
                public final int mo3247D() {
/* 1 */             return m4029M();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: E */
                public final long mo3248E() {
/* 1 */             return m4030N();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: F */
                public final boolean mo3603F(int i) throws qz0 {
/* 1 */             int i2 = i & 7;
/* 3 */             int i3 = 0;
/* 5 */             if (i2 != 0) {
/* 7 */                 if (i2 == 1) {
/* 51 */                    m4034R(8);
/* 4 */                     return true;
                        }
/* 10 */                if (i2 == 2) {
/* 45 */                    m4034R(m4029M());
/* 4 */                     return true;
                        }
/* 14 */                if (i2 == 3) {
/* 31 */                    m4387G();
/* 37 */                    mo3255b(((i >>> 3) << 3) | 4);
/* 4 */                     return true;
                        }
/* 16 */                if (i2 == 4) {
/* 3 */                     return false;
                        }
/* 19 */                if (i2 != 5) {
/* 29 */                    throw qz0.m8030b();
                        }
/* 21 */                m4034R(4);
/* 4 */                 return true;
                    }
/* 59 */            int i4 = this.f8828e - this.f8830g;
/* 60 */            byte[] bArr = this.f8827d;
/* 64 */            if (i4 >= 10) {
/* 66 */                while (i3 < 10) {
/* 68 */                    int i5 = this.f8830g;
/* 72 */                    this.f8830g = i5 + 1;
/* 76 */                    if (bArr[i5] < 0) {
/* 79 */                        i3++;
                            }
                        }
/* 86 */                throw qz0.m8031c();
                    }
/* 87 */            while (i3 < 10) {
/* 93 */                if (this.f8830g == this.f8828e) {
/* 95 */                    m4033Q(1);
                        }
/* 98 */                int i6 = this.f8830g;
/* 102 */               this.f8830g = i6 + 1;
/* 106 */               if (bArr[i6] < 0) {
/* 109 */                   i3++;
                        }
                    }
/* 116 */           throw qz0.m8031c();
/* 4 */             return true;
                }

                /* JADX INFO: renamed from: H */
                public final byte[] m4024H(int i) throws IOException {
/* 1 */             byte[] bArrM4025I = m4025I(i);
/* 5 */             if (bArrM4025I != null) {
/* 7 */                 return bArrM4025I;
                    }
/* 8 */             int i2 = this.f8830g;
/* 10 */            int i3 = this.f8828e;
/* 12 */            int length = i3 - i2;
/* 17 */            this.f8832i += i3;
/* 20 */            this.f8830g = 0;
/* 22 */            this.f8828e = 0;
/* 26 */            ArrayList<byte[]> arrayListM4026J = m4026J(i - length);
/* 30 */            byte[] bArr = new byte[i];
/* 34 */            System.arraycopy(this.f8827d, i2, bArr, 0, length);
/* 45 */            for (byte[] bArr2 : arrayListM4026J) {
/* 54 */                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
/* 58 */                length += bArr2.length;
                    }
/* 60 */            return bArr;
                }

                /* JADX INFO: renamed from: I */
                public final byte[] m4025I(int i) throws IOException {
/* 1 */             if (i == 0) {
/* 3 */                 return fz0.f8402b;
                    }
/* 6 */             if (i < 0) {
/* 122 */               throw qz0.m8032d();
                    }
/* 8 */             int i2 = this.f8832i;
/* 10 */            int i3 = this.f8830g;
/* 14 */            int i4 = i2 + i3 + i;
/* 20 */            if (i4 - AbstractC0208c9.API_PRIORITY_OTHER > 0) {
/* 117 */               throw new qz0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                    }
/* 22 */            int i5 = this.f8833j;
/* 24 */            if (i4 > i5) {
/* 102 */               m4034R((i5 - i2) - i3);
/* 109 */               throw qz0.m8033e();
                    }
/* 28 */            int i6 = this.f8828e - i3;
/* 29 */            int i7 = i - i6;
/* 34 */            InputStream inputStream = this.f8826c;
/* 36 */            if (i7 >= 4096) {
                        try {
/* 42 */                    if (i7 > inputStream.available()) {
/* 45 */                        return null;
                            }
                        } catch (qz0 e) {
/* 48 */                    e.f15809a = true;
/* 50 */                    throw e;
                        }
                    }
/* 51 */            byte[] bArr = new byte[i];
/* 58 */            System.arraycopy(this.f8827d, this.f8830g, bArr, 0, i6);
/* 66 */            this.f8832i += this.f8828e;
/* 68 */            this.f8830g = 0;
/* 70 */            this.f8828e = 0;
/* 72 */            while (i6 < i) {
                        try {
/* 76 */                    int i8 = inputStream.read(bArr, i6, i - i6);
/* 81 */                    if (i8 == -1) {
/* 94 */                        throw qz0.m8033e();
                            }
/* 86 */                    this.f8832i += i8;
/* 88 */                    i6 += i8;
                        } catch (qz0 e2) {
/* 96 */                    e2.f15809a = true;
/* 98 */                    throw e2;
                        }
                    }
/* 99 */            return bArr;
                }

                /* JADX INFO: renamed from: J */
                public final ArrayList m4026J(int i) throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             while (i > 0) {
/* 10 */                int iMin = Math.min(i, 4096);
/* 14 */                byte[] bArr = new byte[iMin];
/* 16 */                int i2 = 0;
/* 17 */                while (i2 < iMin) {
/* 23 */                    int i3 = this.f8826c.read(bArr, i2, iMin - i2);
/* 28 */                    if (i3 == -1) {
/* 41 */                        throw qz0.m8033e();
                            }
/* 33 */                    this.f8832i += i3;
/* 35 */                    i2 += i3;
                        }
/* 42 */                i -= iMin;
/* 43 */                arrayList.add(bArr);
                    }
/* 47 */            return arrayList;
                }

                /* JADX INFO: renamed from: K */
                public final int m4027K() throws qz0 {
/* 1 */             int i = this.f8830g;
/* 7 */             if (this.f8828e - i < 4) {
/* 9 */                 m4033Q(4);
/* 12 */                i = this.f8830g;
                    }
/* 16 */            this.f8830g = i + 4;
/* 18 */            byte[] bArr = this.f8827d;
/* 50 */            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
                }

                /* JADX INFO: renamed from: L */
                public final long m4028L() throws qz0 {
/* 1 */             int i = this.f8830g;
/* 8 */             if (this.f8828e - i < 8) {
/* 10 */                m4033Q(8);
/* 13 */                i = this.f8830g;
                    }
/* 17 */            this.f8830g = i + 8;
/* 19 */            byte[] bArr = this.f8827d;
/* 95 */            return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
                }

                /* JADX INFO: renamed from: M */
                public final int m4029M() {
                    int i;
/* 1 */             int i2 = this.f8830g;
/* 3 */             int i3 = this.f8828e;
/* 5 */             if (i3 != i2) {
/* 8 */                 int i4 = i2 + 1;
/* 10 */                byte[] bArr = this.f8827d;
/* 12 */                byte b = bArr[i2];
/* 14 */                if (b >= 0) {
/* 16 */                    this.f8830g = i4;
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
/* 122 */                   this.f8830g = i5;
/* 124 */                   return i;
                        }
                    }
/* 112 */           return (int) m4031O();
                }

                /* JADX INFO: renamed from: N */
                public final long m4030N() {
                    long j;
                    long j2;
                    long j3;
                    long j4;
/* 1 */             int i = this.f8830g;
/* 3 */             int i2 = this.f8828e;
/* 5 */             if (i2 != i) {
/* 9 */                 int i3 = i + 1;
/* 11 */                byte[] bArr = this.f8827d;
/* 13 */                byte b = bArr[i];
/* 15 */                if (b >= 0) {
/* 17 */                    this.f8830g = i3;
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
/* 190 */                   this.f8830g = i4;
/* 192 */                   return j;
                        }
                    }
/* 183 */           return m4031O();
                }

                /* JADX INFO: renamed from: O */
                public final long m4031O() throws qz0 {
/* 1 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 12 */                if (this.f8830g == this.f8828e) {
/* 15 */                    m4033Q(1);
                        }
/* 18 */                int i2 = this.f8830g;
/* 22 */                this.f8830g = i2 + 1;
/* 26 */                byte b = this.f8827d[i2];
/* 32 */                j |= ((long) (b & 127)) << i;
/* 35 */                if ((b & 128) == 0) {
/* 37 */                    return j;
                        }
                    }
/* 45 */            throw qz0.m8031c();
                }

                /* JADX INFO: renamed from: P */
                public final void m4032P() {
/* 5 */             int i = this.f8828e + this.f8829f;
/* 6 */             this.f8828e = i;
/* 10 */            int i2 = this.f8832i + i;
/* 11 */            int i3 = this.f8833j;
/* 13 */            if (i2 <= i3) {
/* 23 */                this.f8829f = 0;
/* 25 */                return;
                    }
/* 15 */            int i4 = i2 - i3;
/* 16 */            this.f8829f = i4;
/* 19 */            this.f8828e = i - i4;
                }

                /* JADX INFO: renamed from: Q */
                public final void m4033Q(int i) throws qz0 {
/* 5 */             if (m4035S(i)) {
/* 31 */                return;
                    }
/* 16 */            if (i <= (AbstractC0208c9.API_PRIORITY_OTHER - this.f8832i) - this.f8830g) {
/* 30 */                throw qz0.m8033e();
                    }
/* 25 */            throw new qz0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }

                /* JADX INFO: renamed from: R */
                public final void m4034R(int i) throws qz0 {
/* 1 */             int i2 = this.f8828e;
/* 3 */             int i3 = this.f8830g;
/* 7 */             if (i <= i2 - i3 && i >= 0) {
/* 12 */                this.f8830g = i3 + i;
/* 14 */                return;
                    }
/* 15 */            InputStream inputStream = this.f8826c;
/* 17 */            if (i < 0) {
/* 164 */               throw qz0.m8032d();
                    }
/* 19 */            int i4 = this.f8832i;
/* 21 */            int i5 = i4 + i3;
/* 23 */            int i6 = i5 + i;
/* 25 */            int i7 = this.f8833j;
/* 27 */            if (i6 > i7) {
/* 152 */               m4034R((i7 - i4) - i3);
/* 159 */               throw qz0.m8033e();
                    }
/* 29 */            this.f8832i = i5;
/* 31 */            int i8 = i2 - i3;
/* 33 */            this.f8828e = 0;
/* 35 */            this.f8830g = 0;
/* 38 */            while (i8 < i) {
/* 40 */                long j = i - i8;
                        try {
                            try {
/* 43 */                        long jSkip = inputStream.skip(j);
/* 51 */                        if (jSkip < 0 || jSkip > j) {
/* 97 */                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                                }
/* 57 */                        if (jSkip == 0) {
                                    break;
                                } else {
/* 61 */                            i8 += (int) jSkip;
                                }
                            } catch (qz0 e) {
/* 101 */                       e.f15809a = true;
/* 103 */                       throw e;
                            }
                        } catch (Throwable th) {
/* 107 */                   this.f8832i += i8;
/* 109 */                   m4032P();
/* 112 */                   throw th;
                        }
                    }
/* 116 */           this.f8832i += i8;
/* 118 */           m4032P();
/* 121 */           if (i8 >= i) {
/* 149 */               return;
                    }
/* 123 */           int i9 = this.f8828e;
/* 127 */           int i10 = i9 - this.f8830g;
/* 129 */           this.f8830g = i9;
/* 131 */           m4033Q(1);
                    while (true) {
/* 134 */               int i11 = i - i10;
/* 136 */               int i12 = this.f8828e;
/* 138 */               if (i11 <= i12) {
/* 147 */                   this.f8830g = i11;
/* 149 */                   return;
                        } else {
/* 140 */                   i10 += i12;
/* 141 */                   this.f8830g = i12;
/* 143 */                   m4033Q(1);
                        }
                    }
                }

                /* JADX INFO: renamed from: S */
                public final boolean m4035S(int i) throws IOException {
/* 1 */             InputStream inputStream = this.f8826c;
/* 3 */             int i2 = this.f8830g;
/* 5 */             int i3 = i2 + i;
/* 7 */             int i4 = this.f8828e;
/* 10 */            if (i3 <= i4) {
/* 145 */               f42.m3656l(AbstractC0886en.m3505i(i, "refillBuffer() called when ", " bytes were already available in buffer"));
/* 9 */                 return false;
                    }
/* 12 */            int i5 = this.f8832i;
/* 20 */            if (i <= (AbstractC0208c9.API_PRIORITY_OTHER - i5) - i2 && i5 + i2 + i <= this.f8833j) {
/* 30 */                byte[] bArr = this.f8827d;
/* 32 */                if (i2 > 0) {
/* 34 */                    if (i4 > i2) {
/* 37 */                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                            }
/* 43 */                    this.f8832i += i2;
/* 48 */                    this.f8828e -= i2;
/* 50 */                    this.f8830g = 0;
                        }
/* 52 */                int i6 = this.f8828e;
                        try {
/* 65 */                    int i7 = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (AbstractC0208c9.API_PRIORITY_OTHER - this.f8832i) - i6));
/* 69 */                    if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
/* 132 */                       throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                            }
/* 77 */                    if (i7 > 0) {
/* 82 */                        this.f8828e += i7;
/* 84 */                        m4032P();
/* 89 */                        if (this.f8828e >= i) {
/* 64 */                            return true;
                                }
/* 92 */                        return m4035S(i);
                            }
                        } catch (qz0 e) {
/* 134 */                   e.f15809a = true;
/* 136 */                   throw e;
                        }
                    }
/* 9 */             return false;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: b */
                public final void mo3255b(int i) throws qz0 {
/* 3 */             if (this.f8831h != i) {
/* 13 */                throw new qz0("Protocol message end-group tag did not match expected tag.");
                    }
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: f */
                public final int mo3256f() {
/* 5 */             return this.f8832i + this.f8830g;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: g */
                public final boolean mo3257g() {
                    return this.f8830g == this.f8828e && !m4035S(1);
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: j */
                public final void mo3258j(int i) {
/* 1 */             this.f8833j = i;
/* 3 */             m4032P();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: l */
                public final int mo3259l(int i) throws qz0 {
/* 1 */             if (i < 0) {
/* 38 */                throw qz0.m8032d();
                    }
/* 8 */             int i2 = this.f8832i + this.f8830g + i;
/* 9 */             if (i2 < 0) {
/* 33 */                throw new qz0("Failed to parse the message.");
                    }
/* 11 */            int i3 = this.f8833j;
/* 13 */            if (i2 > i3) {
/* 25 */                throw qz0.m8033e();
                    }
/* 15 */            this.f8833j = i2;
/* 17 */            m4032P();
/* 20 */            return i3;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: m */
                public final boolean mo3260m() {
                    return m4030N() != 0;
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: o */
                public final C2259ul mo3611o() throws IOException {
/* 1 */             int iM4029M = m4029M();
/* 5 */             int i = this.f8828e;
/* 7 */             int i2 = this.f8830g;
/* 9 */             int i3 = i - i2;
/* 10 */            byte[] bArr = this.f8827d;
/* 12 */            if (iM4029M <= i3 && iM4029M > 0) {
/* 16 */                C2259ul c2259ulM9039c = C2259ul.m9039c(bArr, i2, iM4029M);
/* 23 */                this.f8830g += iM4029M;
/* 25 */                return c2259ulM9039c;
                    }
/* 26 */            if (iM4029M == 0) {
/* 28 */                return C2259ul.f17581c;
                    }
/* 31 */            if (iM4029M < 0) {
/* 107 */               throw qz0.m8032d();
                    }
/* 33 */            byte[] bArrM4025I = m4025I(iM4029M);
/* 38 */            if (bArrM4025I != null) {
/* 41 */                return C2259ul.m9039c(bArrM4025I, 0, bArrM4025I.length);
                    }
/* 46 */            int i4 = this.f8830g;
/* 48 */            int i5 = this.f8828e;
/* 50 */            int length = i5 - i4;
/* 55 */            this.f8832i += i5;
/* 57 */            this.f8830g = 0;
/* 59 */            this.f8828e = 0;
/* 63 */            ArrayList<byte[]> arrayListM4026J = m4026J(iM4029M - length);
/* 67 */            byte[] bArr2 = new byte[iM4029M];
/* 69 */            System.arraycopy(bArr, i4, bArr2, 0, length);
/* 80 */            for (byte[] bArr3 : arrayListM4026J) {
/* 89 */                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
/* 93 */                length += bArr3.length;
                    }
/* 95 */            C2259ul c2259ul = C2259ul.f17581c;
/* 99 */            return new C2259ul(bArr2);
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: p */
                public final double mo3262p() {
/* 5 */             return Double.longBitsToDouble(m4028L());
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: q */
                public final int mo3263q() {
/* 1 */             return m4029M();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: r */
                public final int mo3264r() {
/* 1 */             return m4027K();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: s */
                public final long mo3265s() {
/* 1 */             return m4028L();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: t */
                public final float mo3266t() {
/* 5 */             return Float.intBitsToFloat(m4027K());
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: u */
                public final int mo3267u() {
/* 1 */             return m4029M();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: v */
                public final long mo3268v() {
/* 1 */             return m4030N();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: w */
                public final int mo3269w() {
/* 1 */             return m4027K();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: x */
                public final long mo3270x() {
/* 1 */             return m4028L();
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: y */
                public final int mo3271y() {
/* 1 */             int iM4029M = m4029M();
/* 10 */            return (-(iM4029M & 1)) ^ (iM4029M >>> 1);
                }

                @Override // p000.AbstractC1006hw
                /* JADX INFO: renamed from: z */
                public final long mo3272z() {
/* 1 */             long jM4030N = m4030N();
/* 12 */            return (-(jM4030N & 1)) ^ (jM4030N >>> 1);
                }
            }
