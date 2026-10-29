            package com.google.android.gms.internal.measurement;

            import java.io.IOException;
            import java.util.Locale;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzlj extends zzll {
                private final byte[] zzc;
                private final int zzd;
                private int zze;

                public zzlj(byte[] bArr, int i, int i2) {
/* 2 */             super(null);
/* 5 */             int length = bArr.length;
/* 9 */             if (((length - i2) | i2) < 0) {
/* 19 */                Locale locale = Locale.US;
/* 29 */                C1951n4.m6859j(AbstractC0886en.m3506j("Array range is invalid. Buffer.length=", length, i2, ", offset=0, length="));
/* 32 */                throw null;
                    }
/* 11 */            this.zzc = bArr;
/* 14 */            this.zze = 0;
/* 16 */            this.zzd = i2;
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zza(int i, int i2) throws IOException {
/* 4 */             zzr((i << 3) | i2);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzb(int i, int i2) throws IOException {
/* 3 */             zzr(i << 3);
/* 6 */             zzq(i2);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzc(int i, int i2) throws IOException {
/* 3 */             zzr(i << 3);
/* 6 */             zzr(i2);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzd(int i, int i2) throws IOException {
/* 5 */             zzr((i << 3) | 5);
/* 8 */             zzs(i2);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zze(int i, long j) throws IOException {
/* 3 */             zzr(i << 3);
/* 6 */             zzt(j);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzf(int i, long j) throws IOException {
/* 5 */             zzr((i << 3) | 1);
/* 8 */             zzu(j);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzg(int i, boolean z) throws IOException {
/* 3 */             zzr(i << 3);
/* 6 */             zzp(z ? (byte) 1 : (byte) 0);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzh(int i, String str) throws IOException {
/* 5 */             zzr((i << 3) | 2);
/* 8 */             zzx(str);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzi(int i, zzlg zzlgVar) throws IOException {
/* 5 */             zzr((i << 3) | 2);
/* 8 */             zzj(zzlgVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzj(zzlg zzlgVar) throws IOException {
/* 5 */             zzr(zzlgVar.zzc());
/* 8 */             zzlgVar.zzf(this);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzk(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             zzr(i2);
/* 5 */             zzv(bArr, 0, i2);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzl(int i, zznl zznlVar, zznw zznwVar) throws IOException {
/* 5 */             zzr((i << 3) | 2);
/* 15 */            zzr(((zzkr) zznlVar).zzcd(zznwVar));
/* 20 */            zznwVar.zzf(zznlVar, this.zza);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzm(int i, zznl zznlVar) throws IOException {
/* 3 */             zzr(11);
/* 7 */             zzc(2, i);
/* 12 */            zzr(26);
/* 15 */            zzo(zznlVar);
/* 20 */            zzr(12);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzn(int i, zzlg zzlgVar) throws IOException {
/* 3 */             zzr(11);
/* 7 */             zzc(2, i);
/* 11 */            zzi(3, zzlgVar);
/* 16 */            zzr(12);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzo(zznl zznlVar) throws IOException {
/* 5 */             zzr(zznlVar.zzcn());
/* 8 */             zznlVar.zzcB(this);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzp(byte b) throws IOException {
/* 1 */             int i = this.zze;
                    try {
/* 5 */                 int i2 = i + 1;
                        try {
/* 7 */                     this.zzc[i] = b;
/* 9 */                     this.zze = i2;
                        } catch (IndexOutOfBoundsException e) {
/* 12 */                    e = e;
/* 13 */                    i = i2;
/* 29 */                    throw new zzlk(i, this.zzd, 1, e);
                        }
                    } catch (IndexOutOfBoundsException e2) {
/* 17 */                e = e2;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzq(int i) throws IOException {
/* 1 */             if (i >= 0) {
/* 3 */                 zzr(i);
                    } else {
/* 8 */                 zzt(i);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzr(int i) throws IOException {
                    int i2;
/* 1 */             int i3 = this.zze;
                    while (true) {
/* 3 */                 int i4 = i & (-128);
/* 5 */                 byte[] bArr = this.zzc;
/* 7 */                 if (i4 == 0) {
/* 9 */                     i2 = i3 + 1;
/* 12 */                    bArr[i3] = (byte) i;
/* 14 */                    this.zze = i2;
/* 16 */                    return;
                        } else {
/* 21 */                    i2 = i3 + 1;
                            try {
/* 26 */                        bArr[i3] = (byte) (i | 128);
/* 28 */                        i >>>= 7;
/* 30 */                        i3 = i2;
                            } catch (IndexOutOfBoundsException e) {
/* 42 */                        throw new zzlk(i2, this.zzd, 1, e);
                            }
                        }
/* 42 */                throw new zzlk(i2, this.zzd, 1, e);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzs(int i) throws IOException {
/* 1 */             int i2 = this.zze;
                    try {
/* 3 */                 byte[] bArr = this.zzc;
/* 6 */                 bArr[i2] = (byte) i;
/* 13 */                bArr[i2 + 1] = (byte) (i >> 8);
/* 20 */                bArr[i2 + 2] = (byte) (i >> 16);
/* 27 */                bArr[i2 + 3] = (byte) (i >> 24);
/* 31 */                this.zze = i2 + 4;
                    } catch (IndexOutOfBoundsException e) {
/* 47 */                throw new zzlk(i2, this.zzd, 4, e);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzt(long j) throws IOException {
                    byte[] bArr;
                    int i;
                    int i2;
                    byte[] bArr2;
/* 1 */             boolean z = zzll.zzd;
/* 5 */             int i3 = this.zze;
/* 12 */            if (!z || this.zzd - i3 < 10) {
                        while (true) {
/* 51 */                    long j2 = j & (-128);
/* 55 */                    bArr = this.zzc;
/* 57 */                    if (j2 == 0) {
                                break;
                            }
/* 73 */                    int i4 = i3 + 1;
                            try {
/* 79 */                        bArr[i3] = (byte) (((int) j) | 128);
/* 81 */                        j >>>= 7;
/* 82 */                        i3 = i4;
                            } catch (IndexOutOfBoundsException e) {
/* 84 */                        e = e;
/* 85 */                        i = i4;
                            }
/* 97 */                    throw new zzlk(i, this.zzd, 1, e);
                        }
/* 59 */                i = i3 + 1;
                        try {
/* 63 */                    bArr[i3] = (byte) j;
/* 65 */                    i2 = i;
                        } catch (IndexOutOfBoundsException e2) {
/* 69 */                    e = e2;
                        }
                    } else {
                        while (true) {
/* 21 */                    long j3 = j & (-128);
/* 25 */                    bArr2 = this.zzc;
/* 27 */                    if (j3 == 0) {
                                break;
                            }
/* 45 */                    zzoo.zzp(bArr2, i3, (byte) (((int) j) | 128));
/* 48 */                    j >>>= 7;
/* 38 */                    i3++;
                        }
/* 29 */                i2 = i3 + 1;
/* 34 */                zzoo.zzp(bArr2, i3, (byte) j);
                    }
/* 66 */            this.zze = i2;
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzu(long j) throws IOException {
/* 1 */             int i = this.zze;
                    try {
/* 3 */                 byte[] bArr = this.zzc;
/* 7 */                 bArr[i] = (byte) j;
/* 17 */                bArr[i + 1] = (byte) (j >> 8);
/* 27 */                bArr[i + 2] = (byte) (j >> 16);
/* 37 */                bArr[i + 3] = (byte) (j >> 24);
/* 47 */                bArr[i + 4] = (byte) (j >> 32);
/* 57 */                bArr[i + 5] = (byte) (j >> 40);
/* 67 */                bArr[i + 6] = (byte) (j >> 48);
/* 76 */                bArr[i + 7] = (byte) (j >> 56);
/* 79 */                this.zze = i + 8;
                    } catch (IndexOutOfBoundsException e) {
/* 96 */                throw new zzlk(i, this.zzd, 8, e);
                    }
                }

                public final void zzv(byte[] bArr, int i, int i2) throws IOException {
                    try {
/* 6 */                 System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
/* 12 */                this.zze += i2;
                    } catch (IndexOutOfBoundsException e) {
/* 30 */                throw new zzlk(this.zze, this.zzd, i2, e);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzw(byte[] bArr, int i, int i2) throws IOException {
/* 2 */             zzv(bArr, 0, i2);
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final void zzx(String str) throws IOException {
/* 1 */             int i = this.zze;
                    try {
/* 9 */                 int iZzz = zzll.zzz(str.length() * 3);
/* 17 */                int iZzz2 = zzll.zzz(str.length());
/* 21 */                if (iZzz2 != iZzz) {
/* 53 */                    zzr(zzor.zzb(str));
/* 56 */                    byte[] bArr = this.zzc;
/* 58 */                    int i2 = this.zze;
/* 67 */                    this.zze = zzor.zzc(str, bArr, i2, this.zzd - i2);
/* 69 */                    return;
                        }
/* 23 */                int i3 = i + iZzz2;
/* 25 */                this.zze = i3;
/* 32 */                int iZzc = zzor.zzc(str, this.zzc, i3, this.zzd - i3);
/* 36 */                this.zze = i;
/* 41 */                zzr((iZzc - i) - iZzz2);
/* 44 */                this.zze = iZzc;
                    } catch (zzoq e) {
/* 77 */                this.zze = i;
/* 79 */                zzF(str, e);
                    } catch (IndexOutOfBoundsException e2) {
/* 76 */                throw new zzlk(e2);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzll
                public final int zzy() {
/* 5 */             return this.zzd - this.zze;
                }
            }
