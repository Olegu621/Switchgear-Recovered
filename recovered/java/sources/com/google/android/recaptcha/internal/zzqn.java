            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import java.util.Arrays;
            import okhttp3.HttpUrl;
            import p000.AbstractC0208c9;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzqn extends zzqq {
                private final byte[] zzf;
                private int zzg;
                private int zzh;
                private int zzi;
                private int zzj;
                private int zzk;

                public /* synthetic */ zzqn(byte[] bArr, int i, int i2, boolean z, zzqp zzqpVar) {
/* 2 */             super(null);
/* 8 */             this.zzk = AbstractC0208c9.API_PRIORITY_OTHER;
/* 10 */            this.zzf = bArr;
/* 13 */            this.zzg = 0;
/* 15 */            this.zzi = 0;
                }

                private final void zzL() {
/* 5 */             int i = this.zzg + this.zzh;
/* 6 */             this.zzg = i;
/* 8 */             int i2 = this.zzk;
/* 10 */            if (i <= i2) {
/* 21 */                this.zzh = 0;
/* 23 */                return;
                    }
/* 12 */            int i3 = i - i2;
/* 14 */            this.zzh = i3;
/* 17 */            this.zzg = i - i3;
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final void zzA(int i) {
/* 1 */             this.zzk = i;
/* 3 */             zzL();
                }

                public final void zzB(int i) throws IOException {
/* 1 */             if (i >= 0) {
/* 3 */                 int i2 = this.zzg;
/* 5 */                 int i3 = this.zzi;
/* 8 */                 if (i <= i2 - i3) {
/* 12 */                    this.zzi = i3 + i;
/* 14 */                    return;
                        }
                    }
/* 15 */            if (i < 0) {
/* 19 */                pk3.m7475k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    } else {
/* 25 */                pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final boolean zzC() throws IOException {
                    return this.zzi == this.zzg;
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
/* 67 */                if (this.zzg - this.zzi < 10) {
/* 91 */                    while (i3 < 10) {
/* 97 */                        if (zza() < 0) {
/* 99 */                            i3++;
                                }
                            }
/* 103 */                   pk3.m7475k("CodedInputStream encountered a malformed varint.");
/* 28 */                    return false;
                        }
/* 69 */                while (i3 < 10) {
/* 71 */                    byte[] bArr = this.zzf;
/* 73 */                    int i4 = this.zzi;
/* 77 */                    this.zzi = i4 + 1;
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
/* 1 */             int i = this.zzi;
/* 5 */             if (i == this.zzg) {
/* 18 */                pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 21 */                return (byte) 0;
                    }
/* 7 */             byte[] bArr = this.zzf;
/* 11 */            this.zzi = i + 1;
/* 13 */            return bArr[i];
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
/* 1 */             return this.zzi;
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final int zze(int i) throws zzsx {
/* 1 */             if (i < 0) {
/* 33 */                pk3.m7475k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 23 */                return 0;
                    }
/* 5 */             int i2 = i + this.zzi;
/* 6 */             if (i2 < 0) {
/* 27 */                pk3.m7475k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
/* 23 */                return 0;
                    }
/* 8 */             int i3 = this.zzk;
/* 10 */            if (i2 > i3) {
/* 20 */                pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 23 */                return 0;
                    }
/* 12 */            this.zzk = i2;
/* 14 */            zzL();
/* 17 */            return i3;
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
/* 1 */             int i = this.zzi;
/* 7 */             if (this.zzg - i < 4) {
/* 49 */                pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 52 */                return 0;
                    }
/* 9 */             byte[] bArr = this.zzf;
/* 13 */            this.zzi = i + 4;
/* 45 */            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
                }

                public final int zzj() throws IOException {
                    int i;
/* 1 */             int i2 = this.zzi;
/* 3 */             int i3 = this.zzg;
/* 5 */             if (i3 != i2) {
/* 9 */                 byte[] bArr = this.zzf;
/* 11 */                int i4 = i2 + 1;
/* 13 */                byte b = bArr[i2];
/* 15 */                if (b >= 0) {
/* 17 */                    this.zzi = i4;
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
/* 117 */                   this.zzi = i5;
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
/* 8 */                 this.zzj = 0;
/* 7 */                 return 0;
                    }
/* 11 */            int iZzj = zzj();
/* 15 */            this.zzj = iZzj;
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
/* 3 */             int i = this.zzi;
/* 10 */            if (this.zzg - i < 8) {
/* 105 */               pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 108 */               return 0L;
                    }
/* 12 */            byte[] bArr = this.zzf;
/* 16 */            this.zzi = i + 8;
/* 18 */            long j = bArr[i];
/* 30 */            long j2 = (((long) bArr[i + 1]) & 255) << 8;
/* 33 */            long j3 = bArr[i + 2];
/* 38 */            long j4 = bArr[i + 3];
/* 101 */           return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
                }

                public final long zzr() throws IOException {
                    long j;
                    long j2;
/* 1 */             int i = this.zzi;
/* 3 */             int i2 = this.zzg;
/* 5 */             if (i2 != i) {
/* 9 */                 byte[] bArr = this.zzf;
/* 11 */                int i3 = i + 1;
/* 13 */                byte b = bArr[i];
/* 15 */                if (b >= 0) {
/* 17 */                    this.zzi = i3;
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
/* 190 */                   this.zzi = i4;
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
/* 5 */             if (iZzj > 0) {
/* 7 */                 int i = this.zzg;
/* 9 */                 int i2 = this.zzi;
/* 12 */                if (iZzj <= i - i2) {
/* 17 */                    zzqm zzqmVarZzl = zzqm.zzl(this.zzf, i2, iZzj);
/* 24 */                    this.zzi += iZzj;
/* 26 */                    return zzqmVarZzl;
                        }
                    }
/* 27 */            if (iZzj == 0) {
/* 71 */                return zzqm.zzb;
                    }
/* 29 */            if (iZzj > 0) {
/* 31 */                int i3 = this.zzg;
/* 33 */                int i4 = this.zzi;
/* 36 */                if (iZzj <= i3 - i4) {
/* 39 */                    int i5 = iZzj + i4;
/* 40 */                    this.zzi = i5;
/* 44 */                    byte[] bArrCopyOfRange = Arrays.copyOfRange(this.zzf, i4, i5);
/* 48 */                    zzqm zzqmVar = zzqm.zzb;
/* 52 */                    return new zzqk(bArrCopyOfRange);
                        }
                    }
/* 57 */            if (iZzj <= 0) {
/* 61 */                pk3.m7475k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 56 */                return null;
                    }
/* 67 */            pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 56 */            return null;
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final String zzx() throws IOException {
/* 1 */             int iZzj = zzj();
/* 5 */             if (iZzj > 0) {
/* 7 */                 int i = this.zzg;
/* 9 */                 int i2 = this.zzi;
/* 12 */                if (iZzj <= i - i2) {
/* 21 */                    String str = new String(this.zzf, i2, iZzj, zzsv.zza);
/* 27 */                    this.zzi += iZzj;
/* 29 */                    return str;
                        }
                    }
/* 30 */            if (iZzj == 0) {
/* 32 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 35 */            if (iZzj < 0) {
/* 39 */                pk3.m7475k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 42 */                return null;
                    }
/* 46 */            pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 42 */            return null;
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final String zzy() throws IOException {
/* 1 */             int iZzj = zzj();
/* 5 */             if (iZzj > 0) {
/* 7 */                 int i = this.zzg;
/* 9 */                 int i2 = this.zzi;
/* 12 */                if (iZzj <= i - i2) {
/* 17 */                    String strZzd = zzvf.zzd(this.zzf, i2, iZzj);
/* 24 */                    this.zzi += iZzj;
/* 26 */                    return strZzd;
                        }
                    }
/* 27 */            if (iZzj == 0) {
/* 29 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 32 */            if (iZzj <= 0) {
/* 36 */                pk3.m7475k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 39 */                return null;
                    }
/* 43 */            pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 39 */            return null;
                }

                @Override // com.google.android.recaptcha.internal.zzqq
                public final void zzz(int i) throws zzsx {
/* 3 */             if (this.zzj == i) {
/* 5 */                 return;
                    }
/* 8 */             pk3.m7475k("Protocol message end-group tag did not match expected tag.");
                }
            }
