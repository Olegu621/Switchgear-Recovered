            package com.appsflyer.internal;

            import java.io.BufferedInputStream;
            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import p000.AbstractC0208c9;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 35 */    public final class AFk1tSDK extends FilterInputStream {
                private final int AFAdRevenueData;
                private byte[] areAllFieldsValid;
                private short component1;
                private int component2;
                private int component3;
                private long[] component4;
                private long[] getCurrencyIso4217Code;
                private final int getMediationNetwork;
                private final int getMonetizationNetwork;
                private int getRevenue;
                private int toString;

                private AFk1tSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4, byte b) throws IOException {
/* 8 */             super(new BufferedInputStream(inputStream, 4096));
/* 12 */            this.getRevenue = 1;
/* 17 */            this.component3 = AbstractC0208c9.API_PRIORITY_OTHER;
/* 26 */            int iMin = Math.min(Math.max((int) s, 4), 8);
/* 30 */            this.getMonetizationNetwork = iMin;
/* 34 */            this.areAllFieldsValid = new byte[iMin];
/* 38 */            this.getCurrencyIso4217Code = new long[4];
/* 42 */            this.component4 = new long[4];
/* 44 */            this.component2 = iMin;
/* 46 */            this.toString = iMin;
/* 56 */            this.getCurrencyIso4217Code = AFk1sSDK.getCurrencyIso4217Code(i ^ i4, iMin ^ i4);
/* 66 */            this.component4 = AFk1sSDK.getCurrencyIso4217Code(i2 ^ i4, i3 ^ i4);
/* 70 */            this.AFAdRevenueData = 100;
/* 72 */            this.getMediationNetwork = 100;
                }

                private int getCurrencyIso4217Code() throws IOException {
/* 6 */             if (this.component3 == Integer.MAX_VALUE) {
/* 14 */                this.component3 = ((FilterInputStream) this).in.read();
                    }
/* 20 */            if (this.component2 == this.getMonetizationNetwork) {
/* 22 */                byte[] bArr = this.areAllFieldsValid;
/* 24 */                int i = this.component3;
/* 28 */                bArr[0] = (byte) i;
/* 32 */                if (i < 0) {
/* 118 */                   f42.m3656l("unexpected block size");
/* 116 */                   return 0;
                        }
/* 35 */                int i2 = 1;
/* 52 */                do {
/* 43 */                    int i3 = ((FilterInputStream) this).in.read(this.areAllFieldsValid, i2, this.getMonetizationNetwork - i2);
/* 47 */                    if (i3 <= 0) {
                                break;
                            }
/* 49 */                    i2 += i3;
/* 52 */                } while (i2 < this.getMonetizationNetwork);
/* 56 */                if (i2 < this.getMonetizationNetwork) {
/* 113 */                   f42.m3656l("unexpected block size");
/* 116 */                   return 0;
                        }
/* 58 */                int i4 = this.AFAdRevenueData;
/* 62 */                if (i4 == this.getMediationNetwork) {
/* 64 */                    getMonetizationNetwork();
                        } else {
/* 70 */                    if (this.getRevenue <= i4) {
/* 72 */                        getMonetizationNetwork();
                            }
/* 75 */                    int i5 = this.getRevenue;
/* 79 */                    if (i5 < this.getMediationNetwork) {
/* 82 */                        this.getRevenue = i5 + 1;
                            } else {
/* 85 */                        this.getRevenue = 1;
                            }
                        }
/* 89 */                int i6 = ((FilterInputStream) this).in.read();
/* 93 */                this.component3 = i6;
/* 95 */                this.component2 = 0;
/* 97 */                int i7 = this.getMonetizationNetwork;
/* 99 */                if (i6 < 0) {
/* 109 */                   i7 -= this.areAllFieldsValid[i7 - 1] & 255;
                        }
/* 110 */               this.toString = i7;
                    }
/* 122 */           return this.toString;
                }

                private void getMonetizationNetwork() {
/* 1 */             long[] jArr = this.getCurrencyIso4217Code;
/* 3 */             long[] jArr2 = this.component4;
/* 5 */             short s = this.component1;
/* 14 */            long j = jArr[s % 4] * 2147483085;
/* 19 */            long j2 = jArr2[(s + 2) % 4];
/* 28 */            int i = (s + 3) % 4;
/* 35 */            jArr2[i] = ((jArr[i] * 2147483085) + j2) / 2147483647L;
/* 37 */            jArr[i] = (j + j2) % 2147483647L;
/* 42 */            for (int i2 = 0; i2 < this.getMonetizationNetwork; i2++) {
/* 44 */                byte[] bArr = this.areAllFieldsValid;
/* 65 */                bArr[i2] = (byte) (((long) bArr[i2]) ^ ((this.getCurrencyIso4217Code[this.component1] >> (i2 << 3)) & 255));
                    }
/* 77 */            this.component1 = (short) ((this.component1 + 1) % 4);
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final int available() throws IOException {
/* 1 */             getCurrencyIso4217Code();
/* 8 */             return this.toString - this.component2;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final boolean markSupported() {
/* 1 */             return false;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             int i3 = i + i2;
/* 4 */             for (int i4 = i; i4 < i3; i4++) {
/* 6 */                 getCurrencyIso4217Code();
/* 9 */                 int i5 = this.component2;
/* 13 */                if (i5 >= this.toString) {
/* 15 */                    if (i4 == i) {
/* 17 */                        return -1;
                            }
/* 20 */                    return i2 - (i3 - i4);
                        }
/* 24 */                byte[] bArr2 = this.areAllFieldsValid;
/* 28 */                this.component2 = i5 + 1;
/* 32 */                bArr[i4] = bArr2[i5];
                    }
/* 36 */            return i2;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final long skip(long j) throws IOException {
/* 1 */             long j2 = 0;
/* 5 */             while (j2 < j && read() != -1) {
/* 16 */                j2++;
                    }
/* 18 */            return j2;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
/* 36 */        public final int read() throws IOException {
/* 37 */            getCurrencyIso4217Code();
/* 38 */            int i = this.component2;
                    if (i >= this.toString) {
                        return -1;
                    }
/* 39 */            byte[] bArr = this.areAllFieldsValid;
                    this.component2 = i + 1;
                    return bArr[i] & 255;
                }

/* 74 */        public AFk1tSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
/* 75 */            this(inputStream, i, i2, s, i3, i4, (byte) 0);
                }
            }
