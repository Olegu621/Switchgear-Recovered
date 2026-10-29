            package p000;

            import java.io.EOFException;
            import java.io.IOException;
            import java.nio.charset.StandardCharsets;
            
            /* JADX INFO: renamed from: uj */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2257uj {

                /* JADX INFO: renamed from: a */
                public final byte[] f17551a;

                /* JADX INFO: renamed from: b */
                public int f17552b;

                /* JADX INFO: renamed from: c */
                public int f17553c;

                public C2257uj(byte[] bArr, int i) {
                    switch (i) {
                        case 1:
/* 10 */                    int length = bArr.length;
/* 14 */                    this.f17551a = bArr;
/* 17 */                    this.f17552b = 0;
/* 19 */                    this.f17553c = length;
                            break;
                        default:
/* 7 */                     this.f17551a = bArr;
                            break;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static void m9022b(int i, int i2, int i3) {
                    String str;
/* 1 */             if (i2 == i3) {
/* 3 */                 return;
                    }
/* 10 */            StringBuilder sbM3793s = fm0.m3793s(i, "Field ", ": expected ");
/* 14 */            String str2 = "varint";
/* 27 */            if (i2 == 0) {
/* 14 */                str = "varint";
                    } else if (i2 == 1) {
/* 16 */                str = "fixed64";
                    } else if (i2 != 2) {
/* 33 */                str = i2 != 5 ? "unknown" : "fixed32";
                    } else {
/* 18 */                str = "length-delimited";
                    }
/* 44 */            sbM3793s.append(str);
/* 49 */            sbM3793s.append(" (wire type ");
/* 52 */            sbM3793s.append(i2);
/* 57 */            sbM3793s.append(") but got ");
/* 60 */            if (i3 != 0) {
/* 62 */                if (i3 == 1) {
/* 16 */                    str2 = "fixed64";
                        } else if (i3 != 2) {
/* 66 */                    str2 = i3 != 5 ? "unknown" : "fixed32";
                        } else {
/* 18 */                    str2 = "length-delimited";
                        }
                    }
/* 75 */            sbM3793s.append(str2);
/* 78 */            sbM3793s.append(" (wire type ");
/* 81 */            sbM3793s.append(i3);
/* 86 */            sbM3793s.append(")");
/* 96 */            throw new IOException(sbM3793s.toString());
                }

                /* JADX INFO: renamed from: a */
                public int m9023a() {
/* 11 */            return ((this.f17551a.length - this.f17552b) * 8) - this.f17553c;
                }

                /* JADX INFO: renamed from: c */
                public int m9024c(int i) {
/* 1 */             int i2 = 0;
/* 2 */             if (i <= 0 || i > 32 || i > m9023a()) {
/* 101 */               C1951n4.m6859j(String.valueOf(i));
/* 1 */                 return 0;
                    }
/* 14 */            int i3 = this.f17553c;
/* 16 */            byte[] bArr = this.f17551a;
/* 22 */            if (i3 > 0) {
/* 24 */                int i4 = 8 - i3;
/* 30 */                int i5 = i < i4 ? i : i4;
/* 31 */                int i6 = i4 - i5;
/* 37 */                int i7 = this.f17552b;
/* 42 */                int i8 = (((255 >> (8 - i5)) << i6) & bArr[i7]) >> i6;
/* 44 */                i -= i5;
/* 45 */                int i9 = i3 + i5;
/* 46 */                this.f17553c = i9;
/* 48 */                if (i9 == 8) {
/* 50 */                    this.f17553c = 0;
/* 54 */                    this.f17552b = i7 + 1;
                        }
/* 56 */                i2 = i8;
                    }
/* 57 */            if (i <= 0) {
/* 96 */                return i2;
                    }
/* 59 */            while (i >= 8) {
/* 63 */                int i10 = this.f17552b;
/* 68 */                i2 = (i2 << 8) | (bArr[i10] & 255);
/* 71 */                this.f17552b = i10 + 1;
/* 73 */                i -= 8;
                    }
/* 76 */            if (i <= 0) {
/* 96 */                return i2;
                    }
/* 78 */            int i11 = 8 - i;
/* 90 */            int i12 = (i2 << i) | ((bArr[this.f17552b] & ((255 >> i11) << i11)) >> i11);
/* 94 */            this.f17553c += i;
/* 96 */            return i12;
                }

                /* JADX INFO: renamed from: d */
                public boolean m9025d() {
                    return m9030i() != 0;
                }

                /* JADX INFO: renamed from: e */
                public byte[] m9026e() {
/* 5 */             int iM9030i = (int) m9030i();
/* 6 */             if (iM9030i < 0) {
/* 43 */                ds0.m3195l(fm0.m3781g(iM9030i, "Negative length: "));
/* 46 */                return null;
                    }
/* 8 */             int i = this.f17553c;
/* 10 */            int i2 = this.f17552b;
/* 13 */            if (i - i2 < iM9030i) {
/* 36 */                throw new EOFException("Not enough bytes for length-delimited field");
                    }
/* 15 */            byte[] bArr = new byte[iM9030i];
/* 20 */            System.arraycopy(this.f17551a, i2, bArr, 0, iM9030i);
/* 26 */            this.f17552b += iM9030i;
/* 28 */            return bArr;
                }

                /* JADX INFO: renamed from: f */
                public C2257uj m9027f() {
/* 8 */             return new C2257uj(m9026e(), 1);
                }

                /* JADX INFO: renamed from: g */
                public String m9028g() {
/* 9 */             return new String(m9026e(), StandardCharsets.UTF_8);
                }

                /* JADX INFO: renamed from: h */
                public int m9029h() {
/* 5 */             if (this.f17552b < this.f17553c) {
/* 11 */                return (int) m9030i();
                    }
/* 13 */            return 0;
                }

                /* JADX INFO: renamed from: i */
                public long m9030i() {
/* 1 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 8 */                 int i2 = this.f17552b;
/* 12 */                if (i2 >= this.f17553c) {
/* 42 */                    throw new EOFException("Truncated varint");
                        }
/* 16 */                this.f17552b = i2 + 1;
/* 20 */                byte b = this.f17551a[i2];
/* 26 */                j |= ((long) (b & 127)) << i;
/* 29 */                if ((b & 128) == 0) {
/* 31 */                    return j;
                        }
                    }
/* 45 */            ds0.m3195l("Malformed varint");
/* 48 */            return 0L;
                }

                /* JADX INFO: renamed from: j */
                public void m9031j(int i) {
/* 1 */             int i2 = this.f17553c;
/* 3 */             if (i == 0) {
/* 83 */                m9030i();
/* 86 */                return;
                    }
/* 6 */             if (i == 1) {
/* 64 */                int i3 = this.f17552b;
/* 69 */                if (i2 - i3 < 8) {
/* 82 */                    throw new EOFException("Not enough bytes to skip fixed64");
                        }
/* 72 */                this.f17552b = i3 + 8;
/* 74 */                return;
                    }
/* 9 */             if (i == 2) {
/* 46 */                int iM9030i = (int) m9030i();
/* 47 */                int i4 = this.f17552b;
/* 50 */                if (i2 - i4 < iM9030i) {
/* 63 */                    throw new EOFException("Not enough bytes to skip length-delimited");
                        }
/* 53 */                this.f17552b = i4 + iM9030i;
/* 55 */                return;
                    }
/* 12 */            if (i != 5) {
/* 38 */                ds0.m3195l(fm0.m3781g(i, "Unknown wire type: "));
/* 41 */                return;
                    }
/* 14 */            int i5 = this.f17552b;
/* 18 */            if (i2 - i5 < 4) {
/* 31 */                throw new EOFException("Not enough bytes to skip fixed32");
                    }
/* 21 */            this.f17552b = i5 + 4;
                }
            }
