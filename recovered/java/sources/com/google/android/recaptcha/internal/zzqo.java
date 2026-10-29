            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import java.io.InputStream;
            import java.util.ArrayList;
            import java.util.List;
            import okhttp3.HttpUrl;
            import p000.AbstractC0208c9;
            import p000.AbstractC0886en;
            import p000.f42;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzqo extends zzqq {
                private final InputStream zzf;
                private final byte[] zzg;
                private int zzh;
                private int zzi;
                private int zzj;
                private int zzk;
                private int zzl;
                private int zzm;

                public /* synthetic */ zzqo(InputStream inputStream, int i, zzqp zzqpVar) {
/* 2 */             super(null);
/* 8 */             this.zzm = AbstractC0208c9.API_PRIORITY_OTHER;
/* 10 */            byte[] bArr = zzsv.zzb;
/* 12 */            this.zzf = inputStream;
/* 18 */            this.zzg = new byte[4096];
/* 21 */            this.zzh = 0;
/* 23 */            this.zzj = 0;
/* 25 */            this.zzl = 0;
                }

                private final List zzL(int i) throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             while (i > 0) {
/* 10 */                int iMin = Math.min(i, 4096);
/* 14 */                byte[] bArr = new byte[iMin];
/* 16 */                int i2 = 0;
/* 17 */                while (i2 < iMin) {
/* 23 */                    int i3 = this.zzf.read(bArr, i2, iMin - i2);
/* 28 */                    if (i3 == -1) {
/* 39 */                        pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 42 */                        return null;
                            }
/* 33 */                    this.zzl += i3;
/* 35 */                    i2 += i3;
                        }
/* 44 */                i -= iMin;
/* 45 */                arrayList.add(bArr);
                    }
/* 49 */            return arrayList;
                }

                private final void zzM() {
/* 5 */             int i = this.zzh + this.zzi;
/* 6 */             this.zzh = i;
/* 10 */            int i2 = this.zzl + i;
/* 11 */            int i3 = this.zzm;
/* 13 */            if (i2 <= i3) {
/* 23 */                this.zzi = 0;
/* 25 */                return;
                    }
/* 15 */            int i4 = i2 - i3;
/* 16 */            this.zzi = i4;
/* 19 */            this.zzh = i - i4;
                }

                private final void zzN(int i) throws IOException {
/* 5 */             if (zzO(i)) {
/* 29 */                return;
                    }
/* 16 */            if (i > (AbstractC0208c9.API_PRIORITY_OTHER - this.zzl) - this.zzj) {
/* 20 */                pk3.m7475k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                    } else {
/* 26 */                pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                }

                private final boolean zzO(int i) throws IOException {
/* 1 */             int i2 = this.zzj;
/* 3 */             int i3 = i2 + i;
/* 5 */             int i4 = this.zzh;
/* 8 */             if (i3 <= i4) {
/* 152 */               f42.m3656l(AbstractC0886en.m3505i(i, "refillBuffer() called when ", " bytes were already available in buffer"));
/* 7 */                 return false;
                    }
/* 10 */            int i5 = this.zzl;
/* 18 */            if (i > (AbstractC0208c9.API_PRIORITY_OTHER - i5) - i2 || i5 + i2 + i > this.zzm) {
/* 7 */                 return false;
                    }
/* 29 */            if (i2 > 0) {
/* 31 */                if (i4 > i2) {
/* 33 */                    byte[] bArr = this.zzg;
/* 36 */                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                        }
/* 41 */                i5 = this.zzl + i2;
/* 42 */                this.zzl = i5;
/* 46 */                i4 = this.zzh - i2;
/* 47 */                this.zzh = i4;
/* 49 */                this.zzj = 0;
                    }
                    try {
/* 63 */                int i6 = this.zzf.read(this.zzg, i4, Math.min(4096 - i4, (AbstractC0208c9.API_PRIORITY_OTHER - i5) - i4));
/* 67 */                if (i6 == 0 || i6 < -1 || i6 > 4096) {
/* 138 */                   throw new IllegalStateException(String.valueOf(this.zzf.getClass()) + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
                        }
/* 76 */                if (i6 <= 0) {
/* 7 */                     return false;
                        }
/* 81 */                this.zzh += i6;
/* 83 */                zzM();
/* 88 */                if (this.zzh >= i) {
/* 90 */                    return true;
                        }
/* 92 */                return zzO(i);
                    } catch (zzsx e) {
/* 140 */               e.zza();
/* 143 */               throw e;
                    }
                }

                private final byte[] zzP(int i, boolean z) throws IOException {
/* 1 */             byte[] bArrZzQ = zzQ(i);
/* 5 */             if (bArrZzQ != null) {
/* 7 */                 return bArrZzQ;
                    }
/* 8 */             int i2 = this.zzj;
/* 10 */            int i3 = this.zzh;
/* 12 */            int i4 = i3 - i2;
/* 17 */            this.zzl += i3;
/* 20 */            this.zzj = 0;
/* 22 */            this.zzh = 0;
/* 26 */            List<byte[]> listZzL = zzL(i - i4);
/* 30 */            byte[] bArr = new byte[i];
/* 34 */            System.arraycopy(this.zzg, i2, bArr, 0, i4);
/* 45 */            for (byte[] bArr2 : listZzL) {
/* 53 */                int length = bArr2.length;
/* 54 */                System.arraycopy(bArr2, 0, bArr, i4, length);
/* 57 */                i4 += length;
                    }
/* 59 */            return bArr;
                }

                private final byte[] zzQ(int i) throws IOException {
/* 1 */             if (i == 0) {
/* 3 */                 return zzsv.zzb;
                    }
/* 6 */             int i2 = this.zzl;
/* 8 */             int i3 = this.zzj;
/* 12 */            int i4 = i2 + i3 + i;
/* 17 */            if ((-2147483647) + i4 > 0) {
/* 113 */               pk3.m7475k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
/* 94 */                return null;
                    }
/* 19 */            int i5 = this.zzm;
/* 23 */            if (i4 > i5) {
/* 104 */               zzB((i5 - i2) - i3);
/* 107 */               pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 94 */                return null;
                    }
/* 27 */            int i6 = this.zzh - i3;
/* 28 */            int i7 = i - i6;
/* 32 */            if (i7 >= 4096) {
                        try {
/* 40 */                    if (i7 > this.zzf.available()) {
/* 43 */                        return null;
                            }
                        } catch (zzsx e) {
/* 46 */                    e.zza();
/* 49 */                    throw e;
                        }
                    }
/* 50 */            byte[] bArr = new byte[i];
/* 57 */            System.arraycopy(this.zzg, this.zzj, bArr, 0, i6);
/* 65 */            this.zzl += this.zzh;
/* 67 */            this.zzj = 0;
/* 69 */            this.zzh = 0;
/* 71 */            while (i6 < i) {
                        try {
/* 77 */                    int i8 = this.zzf.read(bArr, i6, i - i6);
/* 82 */                    if (i8 == -1) {
/* 91 */                        pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 94 */                        return null;
                            }
/* 87 */                    this.zzl += i8;
/* 89 */                    i6 += i8;
                        } catch (zzsx e2) {
/* 97 */                    e2.zza();
/* 100 */                   throw e2;
                        }
                    }
/* 101 */           return bArr;
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final void zzA(int i) {
/* 1 */             this.zzm = i;
/* 3 */             zzM();
                }

                public final void zzB(int i) throws IOException {
/* 1 */             int i2 = this.zzh;
/* 3 */             int i3 = this.zzj;
/* 5 */             int i4 = i2 - i3;
/* 6 */             if (i <= i4 && i >= 0) {
/* 12 */                this.zzj = i3 + i;
/* 14 */                return;
                    }
/* 15 */            if (i < 0) {
/* 169 */               pk3.m7475k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 172 */               return;
                    }
/* 17 */            int i5 = this.zzl;
/* 19 */            int i6 = i5 + i3;
/* 21 */            int i7 = this.zzm;
/* 25 */            if (i6 + i > i7) {
/* 158 */               zzB((i7 - i5) - i3);
/* 163 */               pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 166 */               return;
                    }
/* 27 */            this.zzl = i6;
/* 30 */            this.zzh = 0;
/* 32 */            this.zzj = 0;
/* 34 */            while (i4 < i) {
                        try {
/* 38 */                    long j = i - i4;
                            try {
/* 41 */                        long jSkip = this.zzf.skip(j);
/* 49 */                        if (jSkip < 0 || jSkip > j) {
/* 101 */                           throw new IllegalStateException(String.valueOf(this.zzf.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                                }
/* 55 */                        if (jSkip == 0) {
                                    break;
                                } else {
/* 59 */                            i4 += (int) jSkip;
                                }
                            } catch (zzsx e) {
/* 105 */                       e.zza();
/* 108 */                       throw e;
                            }
                        } catch (Throwable th) {
/* 112 */                   this.zzl += i4;
/* 114 */                   zzM();
/* 117 */                   throw th;
                        }
                    }
/* 121 */           this.zzl += i4;
/* 123 */           zzM();
/* 126 */           if (i4 >= i) {
/* 155 */               return;
                    }
/* 128 */           int i8 = this.zzh;
/* 132 */           int i9 = i8 - this.zzj;
/* 134 */           this.zzj = i8;
/* 137 */           zzN(1);
                    while (true) {
/* 140 */               int i10 = i - i9;
/* 142 */               int i11 = this.zzh;
/* 144 */               if (i10 <= i11) {
/* 153 */                   this.zzj = i10;
/* 155 */                   return;
                        } else {
/* 146 */                   i9 += i11;
/* 147 */                   this.zzj = i11;
/* 149 */                   zzN(1);
                        }
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final boolean zzC() throws IOException {
                    return this.zzj == this.zzh && !zzO(1);
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final boolean zzD() throws IOException {
                    return zzr() != 0;
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final boolean zzE(int i) throws IOException {
/* 1 */             int i2 = i & 7;
/* 3 */             int i3 = 0;
/* 5 */             if (i2 == 0) {
/* 67 */                if (this.zzh - this.zzj < 10) {
/* 91 */                    while (i3 < 10) {
/* 97 */                        if (zza() < 0) {
/* 99 */                            i3++;
                                }
                            }
/* 103 */                   pk3.m7475k("CodedInputStream encountered a malformed varint.");
/* 28 */                    return false;
                        }
/* 69 */                while (i3 < 10) {
/* 71 */                    byte[] bArr = this.zzg;
/* 73 */                    int i4 = this.zzj;
/* 77 */                    this.zzj = i4 + 1;
/* 81 */                    if (bArr[i4] < 0) {
/* 84 */                        i3++;
                            }
                        }
/* 87 */                pk3.m7475k("CodedInputStream encountered a malformed varint.");
/* 28 */                return false;
/* 4 */                 return true;
                    }
/* 7 */             if (i2 == 1) {
/* 54 */                zzB(8);
/* 4 */                 return true;
                    }
/* 10 */            if (i2 == 2) {
/* 48 */                zzB(zzj());
/* 4 */                 return true;
                    }
/* 14 */            if (i2 == 3) {
/* 34 */                zzK();
/* 40 */                zzz(((i >>> 3) << 3) | 4);
/* 4 */                 return true;
                    }
/* 16 */            if (i2 == 4) {
/* 30 */                zzJ();
/* 3 */                 return false;
                    }
/* 19 */            if (i2 == 5) {
/* 21 */                zzB(4);
/* 4 */                 return true;
                    }
/* 25 */            pk3.m7465a();
/* 28 */            return false;
                }

                public final byte zza() throws IOException {
/* 5 */             if (this.zzj == this.zzh) {
/* 8 */                 zzN(1);
                    }
/* 11 */            byte[] bArr = this.zzg;
/* 13 */            int i = this.zzj;
/* 17 */            this.zzj = i + 1;
/* 19 */            return bArr[i];
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final double zzb() throws IOException {
/* 5 */             return Double.longBitsToDouble(zzq());
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final float zzc() throws IOException {
/* 5 */             return Float.intBitsToFloat(zzi());
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final int zzd() {
/* 5 */             return this.zzl + this.zzj;
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final int zze(int i) throws zzsx {
/* 1 */             if (i < 0) {
/* 36 */                pk3.m7475k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 26 */                return 0;
                    }
/* 8 */             int i2 = this.zzl + this.zzj + i;
/* 9 */             if (i2 < 0) {
/* 30 */                pk3.m7475k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
/* 26 */                return 0;
                    }
/* 11 */            int i3 = this.zzm;
/* 13 */            if (i2 > i3) {
/* 23 */                pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 26 */                return 0;
                    }
/* 15 */            this.zzm = i2;
/* 17 */            zzM();
/* 20 */            return i3;
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final int zzf() throws IOException {
/* 1 */             return zzj();
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final int zzg() throws IOException {
/* 1 */             return zzi();
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final int zzh() throws IOException {
/* 1 */             return zzj();
                }

                public final int zzi() throws IOException {
/* 1 */             int i = this.zzj;
/* 7 */             if (this.zzh - i < 4) {
/* 9 */                 zzN(4);
/* 12 */                i = this.zzj;
                    }
/* 14 */            byte[] bArr = this.zzg;
/* 18 */            this.zzj = i + 4;
/* 50 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final int zzj() throws IOException {
                    int i;
/* 1 */             int i2 = this.zzj;
/* 3 */             int i3 = this.zzh;
/* 5 */             if (i3 != i2) {
/* 9 */                 byte[] bArr = this.zzg;
/* 11 */                int i4 = i2 + 1;
/* 13 */                byte b = bArr[i2];
/* 15 */                if (b >= 0) {
/* 17 */                    this.zzj = i4;
/* 19 */                    return b;
                        }
/* 23 */                if (i3 - i4 >= 9) {
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
/* 110 */                                                       i5 = i12;
/* 111 */                                                       i = i11;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
/* 115 */                                   i = i11;
                                        }
/* 113 */                               i = i11;
                                    }
/* 63 */                            i5 = i9;
                                }
/* 48 */                        i5 = i7;
                            }
/* 117 */                   this.zzj = i5;
/* 119 */                   return i;
                        }
                    }
/* 124 */           return (int) zzs();
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final int zzk() throws IOException {
/* 1 */             return zzi();
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final int zzl() throws IOException {
/* 5 */             return zzqq.zzF(zzj());
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final int zzm() throws IOException {
/* 5 */             if (zzC()) {
/* 8 */                 this.zzk = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iZzj = zzj();
/* 15 */            this.zzk = iZzj;
/* 19 */            if ((iZzj >>> 3) != 0) {
/* 21 */                return iZzj;
                    }
/* 24 */            pk3.m7475k("Protocol message contained an invalid tag (zero).");
/* 27 */            return 0;
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final int zzn() throws IOException {
/* 1 */             return zzj();
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final long zzo() throws IOException {
/* 1 */             return zzq();
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final long zzp() throws IOException {
/* 1 */             return zzr();
                }

                public final long zzq() throws IOException {
/* 3 */             int i = this.zzj;
/* 10 */            if (this.zzh - i < 8) {
/* 12 */                zzN(8);
/* 15 */                i = this.zzj;
                    }
/* 17 */            byte[] bArr = this.zzg;
/* 21 */            this.zzj = i + 8;
/* 23 */            long j = bArr[i];
/* 35 */            long j2 = (((long) bArr[i + 1]) & 255) << 8;
/* 38 */            long j3 = bArr[i + 2];
/* 43 */            long j4 = bArr[i + 3];
/* 106 */           return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
                }

                public final long zzr() throws IOException {
                    long j;
                    long j2;
/* 1 */             int i = this.zzj;
/* 3 */             int i2 = this.zzh;
/* 5 */             if (i2 != i) {
/* 9 */                 byte[] bArr = this.zzg;
/* 11 */                int i3 = i + 1;
/* 13 */                byte b = bArr[i];
/* 15 */                if (b >= 0) {
/* 17 */                    this.zzj = i3;
/* 19 */                    return b;
                        }
/* 24 */                if (i2 - i3 >= 9) {
/* 26 */                    int i4 = i + 2;
/* 32 */                    int i5 = (bArr[i3] << 7) ^ b;
/* 33 */                    if (i5 < 0) {
/* 35 */                        j = i5 ^ (-128);
                            } else {
/* 40 */                        int i6 = i + 3;
/* 46 */                        int i7 = (bArr[i4] << 14) ^ i5;
/* 47 */                        if (i7 >= 0) {
/* 49 */                            j = i7 ^ 16256;
                                } else {
/* 55 */                            int i8 = i + 4;
/* 61 */                            int i9 = i7 ^ (bArr[i6] << 21);
/* 62 */                            if (i9 < 0) {
/* 67 */                                long j3 = (-2080896) ^ i9;
/* 70 */                                i4 = i8;
/* 71 */                                j = j3;
                                    } else {
/* 74 */                                i6 = i + 5;
/* 83 */                                long j4 = (((long) bArr[i8]) << 28) ^ ((long) i9);
/* 88 */                                if (j4 >= 0) {
/* 93 */                                    j = j4 ^ 266354560;
                                        } else {
/* 96 */                                    i4 = i + 6;
/* 104 */                                   long j5 = (((long) bArr[i6]) << 35) ^ j4;
/* 107 */                                   if (j5 < 0) {
/* 109 */                                       j2 = -34093383808L;
                                            } else {
/* 117 */                                       int i10 = i + 7;
/* 125 */                                       long j6 = j5 ^ (((long) bArr[i4]) << 42);
/* 128 */                                       if (j6 >= 0) {
/* 135 */                                           j = j6 ^ 4363953127296L;
                                                } else {
/* 139 */                                           i4 = i + 8;
/* 147 */                                           j5 = j6 ^ (((long) bArr[i10]) << 49);
/* 150 */                                           if (j5 < 0) {
/* 152 */                                               j2 = -558586000294016L;
                                                    } else {
/* 158 */                                               i10 = i + 9;
/* 172 */                                               long j7 = (j5 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
/* 175 */                                               if (j7 < 0) {
/* 177 */                                                   i4 = i + 10;
/* 184 */                                                   if (bArr[i10] >= 0) {
/* 186 */                                                       j = j7;
                                                            }
                                                        } else {
/* 188 */                                                   j = j7;
                                                        }
                                                    }
                                                }
/* 137 */                                       i4 = i10;
                                            }
/* 114 */                                   j = j5 ^ j2;
                                        }
                                    }
                                }
/* 52 */                        i4 = i6;
                            }
/* 190 */                   this.zzj = i4;
/* 192 */                   return j;
                        }
                    }
/* 193 */           return zzs();
                }

                public final long zzs() throws IOException {
/* 2 */             long j = 0;
/* 6 */             for (int i = 0; i < 64; i += 7) {
/* 8 */                 byte bZza = zza();
/* 16 */                j |= ((long) (bZza & 127)) << i;
/* 19 */                if ((bZza & 128) == 0) {
/* 21 */                    return j;
                        }
                    }
/* 27 */            pk3.m7475k("CodedInputStream encountered a malformed varint.");
/* 30 */            return 0L;
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final long zzt() throws IOException {
/* 1 */             return zzq();
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final long zzu() throws IOException {
/* 5 */             return zzqq.zzG(zzr());
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final long zzv() throws IOException {
/* 1 */             return zzr();
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final zzqm zzw() throws IOException {
/* 1 */             int iZzj = zzj();
/* 5 */             int i = this.zzh;
/* 7 */             int i2 = this.zzj;
/* 10 */            if (iZzj <= i - i2 && iZzj > 0) {
/* 17 */                zzqm zzqmVarZzl = zzqm.zzl(this.zzg, i2, iZzj);
/* 24 */                this.zzj += iZzj;
/* 26 */                return zzqmVarZzl;
                    }
/* 27 */            if (iZzj == 0) {
/* 29 */                return zzqm.zzb;
                    }
/* 32 */            if (iZzj < 0) {
/* 107 */               pk3.m7475k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 110 */               return null;
                    }
/* 34 */            byte[] bArrZzQ = zzQ(iZzj);
/* 39 */            if (bArrZzQ != null) {
/* 42 */                return zzqm.zzl(bArrZzQ, 0, bArrZzQ.length);
                    }
/* 47 */            int i3 = this.zzj;
/* 49 */            int i4 = this.zzh;
/* 51 */            int i5 = i4 - i3;
/* 56 */            this.zzl += i4;
/* 58 */            this.zzj = 0;
/* 60 */            this.zzh = 0;
/* 64 */            List<byte[]> listZzL = zzL(iZzj - i5);
/* 68 */            byte[] bArr = new byte[iZzj];
/* 72 */            System.arraycopy(this.zzg, i3, bArr, 0, i5);
/* 83 */            for (byte[] bArr2 : listZzL) {
/* 91 */                int length = bArr2.length;
/* 92 */                System.arraycopy(bArr2, 0, bArr, i5, length);
/* 95 */                i5 += length;
                    }
/* 97 */            zzqm zzqmVar = zzqm.zzb;
/* 101 */           return new zzqk(bArr);
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final String zzx() throws IOException {
/* 1 */             int iZzj = zzj();
/* 5 */             if (iZzj > 0) {
/* 7 */                 int i = this.zzh;
/* 9 */                 int i2 = this.zzj;
/* 12 */                if (iZzj <= i - i2) {
/* 21 */                    String str = new String(this.zzg, i2, iZzj, zzsv.zza);
/* 27 */                    this.zzj += iZzj;
/* 29 */                    return str;
                        }
                    }
/* 30 */            if (iZzj == 0) {
/* 32 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 35 */            if (iZzj < 0) {
/* 76 */                pk3.m7475k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 79 */                return null;
                    }
/* 39 */            if (iZzj > this.zzh) {
/* 70 */                return new String(zzP(iZzj, false), zzsv.zza);
                    }
/* 41 */            zzN(iZzj);
/* 52 */            String str2 = new String(this.zzg, this.zzj, iZzj, zzsv.zza);
/* 58 */            this.zzj += iZzj;
/* 60 */            return str2;
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final String zzy() throws IOException {
                    byte[] bArrZzP;
/* 1 */             int iZzj = zzj();
/* 5 */             int i = this.zzj;
/* 7 */             int i2 = this.zzh;
/* 11 */            if (iZzj <= i2 - i && iZzj > 0) {
/* 15 */                bArrZzP = this.zzg;
/* 19 */                this.zzj = i + iZzj;
                    } else {
/* 22 */                if (iZzj == 0) {
/* 24 */                    return HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 27 */                if (iZzj < 0) {
/* 51 */                    pk3.m7475k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 54 */                    return null;
                        }
/* 29 */                i = 0;
/* 30 */                if (iZzj <= i2) {
/* 32 */                    zzN(iZzj);
/* 35 */                    bArrZzP = this.zzg;
/* 37 */                    this.zzj = iZzj;
                        } else {
/* 40 */                    bArrZzP = zzP(iZzj, false);
                        }
                    }
/* 44 */            return zzvf.zzd(bArrZzP, i, iZzj);
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final void zzz(int i) throws zzsx {
/* 3 */             if (this.zzk == i) {
/* 5 */                 return;
                    }
/* 8 */             pk3.m7475k("Protocol message end-group tag did not match expected tag.");
                }
            }
