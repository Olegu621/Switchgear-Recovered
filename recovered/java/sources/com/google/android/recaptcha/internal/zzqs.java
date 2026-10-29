            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import java.util.Locale;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzqs extends zzqv {
                private final byte[] zzc;
                private final int zzd;
                private int zze;

                public zzqs(byte[] bArr, int i, int i2) {
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

                @Override // com.google.android.recaptcha.internal.zzqv
                public final int zza() {
/* 5 */             return this.zzd - this.zze;
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzb(byte b) throws IOException {
/* 1 */             int i = this.zze;
                    try {
/* 5 */                 int i2 = i + 1;
                        try {
/* 7 */                     this.zzc[i] = b;
/* 9 */                     this.zze = i2;
                        } catch (IndexOutOfBoundsException e) {
/* 12 */                    e = e;
/* 13 */                    i = i2;
/* 29 */                    throw new zzqt(i, this.zzd, 1, e);
                        }
                    } catch (IndexOutOfBoundsException e2) {
/* 17 */                e = e2;
                    }
                }

                public final void zzc(byte[] bArr, int i, int i2) throws IOException {
                    try {
/* 6 */                 System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
/* 12 */                this.zze += i2;
                    } catch (IndexOutOfBoundsException e) {
/* 30 */                throw new zzqt(this.zze, this.zzd, i2, e);
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzd(int i, boolean z) throws IOException {
/* 3 */             zzt(i << 3);
/* 6 */             zzb(z ? (byte) 1 : (byte) 0);
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zze(int i, zzqm zzqmVar) throws IOException {
/* 5 */             zzt((i << 3) | 2);
/* 12 */            zzt(zzqmVar.zzd());
/* 15 */            zzqmVar.zzi(this);
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzf(int i, int i2) throws IOException {
/* 5 */             zzt((i << 3) | 5);
/* 8 */             zzg(i2);
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzg(int i) throws IOException {
/* 1 */             int i2 = this.zze;
                    try {
/* 3 */                 byte[] bArr = this.zzc;
/* 6 */                 bArr[i2] = (byte) i;
/* 13 */                bArr[i2 + 1] = (byte) (i >> 8);
/* 20 */                bArr[i2 + 2] = (byte) (i >> 16);
/* 27 */                bArr[i2 + 3] = (byte) (i >> 24);
/* 31 */                this.zze = i2 + 4;
                    } catch (IndexOutOfBoundsException e) {
/* 47 */                throw new zzqt(i2, this.zzd, 4, e);
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzh(int i, long j) throws IOException {
/* 5 */             zzt((i << 3) | 1);
/* 8 */             zzi(j);
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzi(long j) throws IOException {
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
/* 96 */                throw new zzqt(i, this.zzd, 8, e);
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzj(int i, int i2) throws IOException {
/* 3 */             zzt(i << 3);
/* 6 */             zzk(i2);
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzk(int i) throws IOException {
/* 1 */             if (i >= 0) {
/* 3 */                 zzt(i);
                    } else {
/* 8 */                 zzv(i);
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzl(byte[] bArr, int i, int i2) throws IOException {
/* 2 */             zzc(bArr, 0, i2);
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzm(int i, zzts zztsVar, zzug zzugVar) throws IOException {
/* 5 */             zzt((i << 3) | 2);
/* 15 */            zzt(((zzpw) zztsVar).zza(zzugVar));
/* 20 */            zzugVar.zzj(zztsVar, this.zza);
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzn(int i, zzts zztsVar) throws IOException {
/* 3 */             zzt(11);
/* 7 */             zzs(2, i);
/* 12 */            zzt(26);
/* 19 */            zzt(zztsVar.zzo());
/* 22 */            zztsVar.zze(this);
/* 27 */            zzt(12);
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzo(int i, zzqm zzqmVar) throws IOException {
/* 3 */             zzt(11);
/* 7 */             zzs(2, i);
/* 11 */            zze(3, zzqmVar);
/* 16 */            zzt(12);
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzp(int i, String str) throws IOException {
/* 5 */             zzt((i << 3) | 2);
/* 8 */             zzq(str);
                }

                public final void zzq(String str) throws IOException {
/* 1 */             int i = this.zze;
                    try {
/* 9 */                 int iZzA = zzqv.zzA(str.length() * 3);
/* 17 */                int iZzA2 = zzqv.zzA(str.length());
/* 21 */                if (iZzA2 != iZzA) {
/* 53 */                    zzt(zzvf.zzc(str));
/* 56 */                    byte[] bArr = this.zzc;
/* 58 */                    int i2 = this.zze;
/* 67 */                    this.zze = zzvf.zzb(str, bArr, i2, this.zzd - i2);
/* 69 */                    return;
                        }
/* 23 */                int i3 = i + iZzA2;
/* 25 */                this.zze = i3;
/* 32 */                int iZzb = zzvf.zzb(str, this.zzc, i3, this.zzd - i3);
/* 36 */                this.zze = i;
/* 41 */                zzt((iZzb - i) - iZzA2);
/* 44 */                this.zze = iZzb;
                    } catch (zzve e) {
/* 77 */                this.zze = i;
/* 79 */                zzD(str, e);
                    } catch (IndexOutOfBoundsException e2) {
/* 76 */                throw new zzqt(e2);
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzr(int i, int i2) throws IOException {
/* 4 */             zzt((i << 3) | i2);
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzs(int i, int i2) throws IOException {
/* 3 */             zzt(i << 3);
/* 6 */             zzt(i2);
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzt(int i) throws IOException {
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
/* 42 */                        throw new zzqt(i2, this.zzd, 1, e);
                            }
                        }
/* 42 */                throw new zzqt(i2, this.zzd, 1, e);
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzu(int i, long j) throws IOException {
/* 3 */             zzt(i << 3);
/* 6 */             zzv(j);
                }

                @Override // com.google.android.recaptcha.internal.zzqv
                public final void zzv(long j) throws IOException {
                    byte[] bArr;
                    int i;
                    byte[] bArr2;
/* 1 */             int i2 = this.zze;
/* 12 */            if (!zzqv.zzd || this.zzd - i2 < 10) {
                        while (true) {
/* 51 */                    long j2 = j & (-128);
/* 55 */                    bArr = this.zzc;
/* 57 */                    if (j2 == 0) {
                                break;
                            }
/* 72 */                    i = i2 + 1;
                            try {
/* 78 */                        bArr[i2] = (byte) (((int) j) | 128);
/* 80 */                        j >>>= 7;
/* 81 */                        i2 = i;
                            } catch (IndexOutOfBoundsException e) {
/* 93 */                        throw new zzqt(i, this.zzd, 1, e);
                            }
/* 93 */                    throw new zzqt(i, this.zzd, 1, e);
                        }
/* 59 */                i = i2 + 1;
/* 63 */                bArr[i2] = (byte) j;
                    } else {
                        while (true) {
/* 21 */                    long j3 = j & (-128);
/* 25 */                    bArr2 = this.zzc;
/* 27 */                    if (j3 == 0) {
                                break;
                            }
/* 45 */                    zzvc.zzn(bArr2, i2, (byte) (((int) j) | 128));
/* 48 */                    j >>>= 7;
/* 38 */                    i2++;
                        }
/* 29 */                i = i2 + 1;
/* 34 */                zzvc.zzn(bArr2, i2, (byte) j);
                    }
/* 65 */            this.zze = i;
                }
            }
