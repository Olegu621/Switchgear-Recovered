            package com.appsflyer.internal;

            import io.flutter.embedding.android.KeyboardMap;
            import java.io.BufferedInputStream;
            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import p000.AbstractC0208c9;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 35 */    public final class AFk1rSDK extends FilterInputStream {
                private static final short getMonetizationNetwork = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
                private byte[] AFAdRevenueData;
                private int AFInAppEventType;
                private int areAllFieldsValid;
                private int component1;
                private int component2;
                private int component3;
                private int component4;
                private int copy;
                private final int copydefault;
                private final int equals;
                private int getCurrencyIso4217Code;
                private byte[] getMediationNetwork;
                private byte[] getRevenue;
                private int hashCode;
                private int toString;

                private AFk1rSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, byte b) throws IOException {
/* 8 */             super(new BufferedInputStream(inputStream, 4096));
/* 14 */            this.component3 = AbstractC0208c9.API_PRIORITY_OTHER;
/* 17 */            this.AFInAppEventType = 1;
/* 23 */            this.getMediationNetwork = new byte[8];
/* 27 */            this.AFAdRevenueData = new byte[8];
/* 31 */            this.getRevenue = new byte[8];
/* 33 */            this.getCurrencyIso4217Code = 8;
/* 35 */            this.component4 = 8;
/* 48 */            this.component2 = Math.min(Math.max(i2, 5), 16);
/* 50 */            this.component1 = i3;
/* 54 */            if (i3 == 3) {
/* 58 */                System.arraycopy(bArr, 0, this.AFAdRevenueData, 0, 8);
                    }
/* 77 */            long j = (((long) iArr[1]) & KeyboardMap.kValueMask) | ((((long) iArr[0]) & KeyboardMap.kValueMask) << 32);
/* 78 */            if (i == 0) {
/* 81 */                this.areAllFieldsValid = (int) j;
/* 83 */                long j2 = j >> 3;
/* 85 */                short s = getMonetizationNetwork;
/* 91 */                this.copy = (int) ((((long) s) * j2) >> 32);
/* 95 */                this.toString = (int) (j >> 32);
/* 100 */               this.hashCode = (int) (j2 + ((long) s));
                    } else {
/* 103 */               int i4 = (int) j;
/* 104 */               this.areAllFieldsValid = i4;
/* 108 */               this.copy = i4 * i;
/* 111 */               this.toString = i ^ i4;
/* 115 */               this.hashCode = (int) (j >> 32);
                    }
/* 119 */           this.equals = 100;
/* 121 */           this.copydefault = 100;
                }

                private void AFAdRevenueData() {
/* 7 */             if (this.component1 == 3) {
/* 9 */                 byte[] bArr = this.getMediationNetwork;
/* 14 */                System.arraycopy(bArr, 0, this.getRevenue, 0, bArr.length);
                    }
/* 17 */            byte[] bArr2 = this.getMediationNetwork;
/* 26 */            boolean z = true;
/* 35 */            char c = 2;
/* 50 */            int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
/* 75 */            int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
/* 76 */            int i3 = 0;
                    while (true) {
/* 77 */                int i4 = this.component2;
/* 79 */                if (i3 >= i4) {
                            break;
                        }
/* 81 */                short s = getMonetizationNetwork;
/* 105 */               i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.toString)) ^ ((i >>> 5) + this.hashCode);
/* 121 */               i -= (((i2 << 4) + this.areAllFieldsValid) ^ (((i4 - i3) * s) + i2)) ^ ((i2 >>> 5) + this.copy);
/* 122 */               i3++;
/* 124 */               c = c;
/* 126 */               z = z;
                    }
/* 133 */           byte[] bArr3 = this.getMediationNetwork;
/* 138 */           bArr3[0] = (byte) (i >> 24);
/* 143 */           bArr3[z ? 1 : 0] = (byte) (i >> 16);
/* 148 */           bArr3[c] = (byte) (i >> 8);
/* 151 */           bArr3[3] = (byte) i;
/* 156 */           bArr3[4] = (byte) (i2 >> 24);
/* 161 */           bArr3[5] = (byte) (i2 >> 16);
/* 166 */           bArr3[6] = (byte) (i2 >> 8);
/* 169 */           bArr3[7] = (byte) i2;
/* 173 */           if (this.component1 == 3) {
/* 176 */               for (int i5 = 0; i5 < 8; i5++) {
/* 178 */                   byte[] bArr4 = this.getMediationNetwork;
/* 188 */                   bArr4[i5] = (byte) (bArr4[i5] ^ this.AFAdRevenueData[i5]);
                        }
/* 193 */               byte[] bArr5 = this.getRevenue;
/* 198 */               System.arraycopy(bArr5, 0, this.AFAdRevenueData, 0, bArr5.length);
                    }
                }

                private int getMonetizationNetwork() throws IOException {
/* 6 */             if (this.component3 == Integer.MAX_VALUE) {
/* 14 */                this.component3 = ((FilterInputStream) this).in.read();
                    }
/* 20 */            if (this.getCurrencyIso4217Code == 8) {
/* 22 */                byte[] bArr = this.getMediationNetwork;
/* 24 */                int i = this.component3;
/* 28 */                bArr[0] = (byte) i;
/* 32 */                if (i < 0) {
/* 110 */                   f42.m3656l("unexpected block size");
/* 108 */                   return 0;
                        }
/* 35 */                int i2 = 1;
/* 49 */                do {
/* 42 */                    int i3 = ((FilterInputStream) this).in.read(this.getMediationNetwork, i2, 8 - i2);
/* 46 */                    if (i3 <= 0) {
                                break;
                            }
/* 48 */                    i2 += i3;
/* 49 */                } while (i2 < 8);
/* 51 */                if (i2 < 8) {
/* 105 */                   f42.m3656l("unexpected block size");
/* 108 */                   return 0;
                        }
/* 53 */                int i4 = this.equals;
/* 57 */                if (i4 == this.copydefault) {
/* 59 */                    AFAdRevenueData();
                        } else {
/* 65 */                    if (this.AFInAppEventType <= i4) {
/* 67 */                        AFAdRevenueData();
                            }
/* 70 */                    int i5 = this.AFInAppEventType;
/* 74 */                    if (i5 < this.copydefault) {
/* 77 */                        this.AFInAppEventType = i5 + 1;
                            } else {
/* 80 */                        this.AFInAppEventType = 1;
                            }
                        }
/* 84 */                int i6 = ((FilterInputStream) this).in.read();
/* 88 */                this.component3 = i6;
/* 90 */                this.getCurrencyIso4217Code = 0;
/* 102 */               this.component4 = i6 < 0 ? 8 - (this.getMediationNetwork[7] & 255) : 8;
                    }
/* 114 */           return this.component4;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final int available() throws IOException {
/* 1 */             getMonetizationNetwork();
/* 8 */             return this.component4 - this.getCurrencyIso4217Code;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final boolean markSupported() {
/* 1 */             return false;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             int i3 = i + i2;
/* 4 */             for (int i4 = i; i4 < i3; i4++) {
/* 6 */                 getMonetizationNetwork();
/* 9 */                 int i5 = this.getCurrencyIso4217Code;
/* 13 */                if (i5 >= this.component4) {
/* 15 */                    if (i4 == i) {
/* 17 */                        return -1;
                            }
/* 20 */                    return i2 - (i3 - i4);
                        }
/* 24 */                byte[] bArr2 = this.getMediationNetwork;
/* 28 */                this.getCurrencyIso4217Code = i5 + 1;
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
/* 37 */            getMonetizationNetwork();
/* 38 */            int i = this.getCurrencyIso4217Code;
                    if (i >= this.component4) {
                        return -1;
                    }
/* 39 */            byte[] bArr = this.getMediationNetwork;
                    this.getCurrencyIso4217Code = i + 1;
                    return bArr[i] & 255;
                }

/* 123 */       public AFk1rSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
/* 124 */           this(inputStream, iArr, i, bArr, i2, i3, (byte) 0);
                }
            }
