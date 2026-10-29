            package com.google.android.gms.internal.play_billing;

            import java.io.IOException;
            import java.util.Locale;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzgo extends zzgr {
                private final byte[] zzb;
                private final int zzc;
                private int zzd;

                public zzgo(byte[] bArr, int i, int i2) {
/* 2 */             super(null);
/* 5 */             int length = bArr.length;
/* 9 */             if (((length - i2) | i2) < 0) {
/* 19 */                Locale locale = Locale.US;
/* 29 */                C1951n4.m6859j(AbstractC0886en.m3506j("Array range is invalid. Buffer.length=", length, i2, ", offset=0, length="));
/* 32 */                throw null;
                    }
/* 11 */            this.zzb = bArr;
/* 14 */            this.zzd = 0;
/* 16 */            this.zzc = i2;
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final int zza() {
/* 5 */             return this.zzc - this.zzd;
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzb(byte b) throws IOException {
/* 1 */             int i = this.zzd;
                    try {
/* 5 */                 int i2 = i + 1;
                        try {
/* 7 */                     this.zzb[i] = b;
/* 9 */                     this.zzd = i2;
                        } catch (IndexOutOfBoundsException e) {
/* 12 */                    e = e;
/* 13 */                    i = i2;
/* 29 */                    throw new zzgp(i, this.zzc, 1, e);
                        }
                    } catch (IndexOutOfBoundsException e2) {
/* 17 */                e = e2;
                    }
                }

                public final void zzc(byte[] bArr, int i, int i2) throws IOException {
                    try {
/* 6 */                 System.arraycopy(bArr, 0, this.zzb, this.zzd, i2);
/* 12 */                this.zzd += i2;
                    } catch (IndexOutOfBoundsException e) {
/* 30 */                throw new zzgp(this.zzd, this.zzc, i2, e);
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzd(int i, boolean z) throws IOException {
/* 3 */             zzt(i << 3);
/* 6 */             zzb(z ? (byte) 1 : (byte) 0);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zze(int i, zzgk zzgkVar) throws IOException {
/* 5 */             zzt((i << 3) | 2);
/* 12 */            zzt(zzgkVar.zzd());
/* 15 */            zzgkVar.zzg(this);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzf(int i, int i2) throws IOException {
/* 5 */             zzt((i << 3) | 5);
/* 8 */             zzg(i2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzg(int i) throws IOException {
/* 1 */             int i2 = this.zzd;
                    try {
/* 3 */                 byte[] bArr = this.zzb;
/* 8 */                 bArr[i2] = (byte) (i & 255);
/* 17 */                bArr[i2 + 1] = (byte) ((i >> 8) & 255);
/* 26 */                bArr[i2 + 2] = (byte) ((i >> 16) & 255);
/* 35 */                bArr[i2 + 3] = (byte) ((i >> 24) & 255);
/* 39 */                this.zzd = i2 + 4;
                    } catch (IndexOutOfBoundsException e) {
/* 55 */                throw new zzgp(i2, this.zzc, 4, e);
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzh(int i, long j) throws IOException {
/* 5 */             zzt((i << 3) | 1);
/* 8 */             zzi(j);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzi(long j) throws IOException {
/* 1 */             int i = this.zzd;
                    try {
/* 3 */                 byte[] bArr = this.zzb;
/* 9 */                 bArr[i] = (byte) (((int) j) & 255);
/* 21 */                bArr[i + 1] = (byte) (((int) (j >> 8)) & 255);
/* 33 */                bArr[i + 2] = (byte) (((int) (j >> 16)) & 255);
/* 45 */                bArr[i + 3] = (byte) (((int) (j >> 24)) & 255);
/* 57 */                bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
/* 69 */                bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
/* 81 */                bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
/* 92 */                bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
/* 95 */                this.zzd = i + 8;
                    } catch (IndexOutOfBoundsException e) {
/* 112 */               throw new zzgp(i, this.zzc, 8, e);
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzj(int i, int i2) throws IOException {
/* 3 */             zzt(i << 3);
/* 6 */             zzk(i2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzk(int i) throws IOException {
/* 1 */             if (i >= 0) {
/* 3 */                 zzt(i);
                    } else {
/* 8 */                 zzv(i);
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzl(byte[] bArr, int i, int i2) throws IOException {
/* 2 */             zzc(bArr, 0, i2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzm(int i, zzim zzimVar, zzix zzixVar) throws IOException {
/* 5 */             zzt((i << 3) | 2);
/* 15 */            zzt(((zzfv) zzimVar).zze(zzixVar));
/* 20 */            zzixVar.zzi(zzimVar, this.zza);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzn(int i, zzim zzimVar) throws IOException {
/* 3 */             zzt(11);
/* 7 */             zzs(2, i);
/* 12 */            zzt(26);
/* 19 */            zzt(zzimVar.zzk());
/* 22 */            zzimVar.zzJ(this);
/* 27 */            zzt(12);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzo(int i, zzgk zzgkVar) throws IOException {
/* 3 */             zzt(11);
/* 7 */             zzs(2, i);
/* 11 */            zze(3, zzgkVar);
/* 16 */            zzt(12);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzp(int i, String str) throws IOException {
/* 5 */             zzt((i << 3) | 2);
/* 8 */             zzq(str);
                }

                public final void zzq(String str) throws IOException {
/* 1 */             int i = this.zzd;
                    try {
/* 9 */                 int iZzz = zzgr.zzz(str.length() * 3);
/* 17 */                int iZzz2 = zzgr.zzz(str.length());
/* 21 */                if (iZzz2 != iZzz) {
/* 53 */                    zzt(zzjt.zzc(str));
/* 56 */                    byte[] bArr = this.zzb;
/* 58 */                    int i2 = this.zzd;
/* 67 */                    this.zzd = zzjt.zzb(str, bArr, i2, this.zzc - i2);
/* 69 */                    return;
                        }
/* 23 */                int i3 = i + iZzz2;
/* 25 */                this.zzd = i3;
/* 32 */                int iZzb = zzjt.zzb(str, this.zzb, i3, this.zzc - i3);
/* 36 */                this.zzd = i;
/* 41 */                zzt((iZzb - i) - iZzz2);
/* 44 */                this.zzd = iZzb;
                    } catch (zzjs e) {
/* 77 */                this.zzd = i;
/* 79 */                zzC(str, e);
                    } catch (IndexOutOfBoundsException e2) {
/* 76 */                throw new zzgp(e2);
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzr(int i, int i2) throws IOException {
/* 4 */             zzt((i << 3) | i2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzs(int i, int i2) throws IOException {
/* 3 */             zzt(i << 3);
/* 6 */             zzt(i2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzt(int i) throws IOException {
                    while (true) {
/* 1 */                 int i2 = i & (-128);
/* 3 */                 byte[] bArr = this.zzb;
/* 5 */                 if (i2 == 0) {
/* 7 */                     int i3 = this.zzd;
/* 11 */                    this.zzd = i3 + 1;
/* 14 */                    bArr[i3] = (byte) i;
/* 16 */                    return;
                        } else {
                            try {
/* 21 */                        int i4 = this.zzd;
/* 25 */                        this.zzd = i4 + 1;
/* 32 */                        bArr[i4] = (byte) ((i | 128) & 255);
/* 34 */                        i >>>= 7;
                            } catch (IndexOutOfBoundsException e) {
/* 49 */                        throw new zzgp(this.zzd, this.zzc, 1, e);
                            }
                        }
/* 49 */                throw new zzgp(this.zzd, this.zzc, 1, e);
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzu(int i, long j) throws IOException {
/* 3 */             zzt(i << 3);
/* 6 */             zzv(j);
                }

                @Override // com.google.android.gms.internal.play_billing.zzgr
                public final void zzv(long j) throws IOException {
/* 10 */            if (!zzgr.zzc || this.zzc - this.zzd < 10) {
                        while (true) {
/* 59 */                    long j2 = j & (-128);
/* 63 */                    byte[] bArr = this.zzb;
/* 65 */                    if (j2 == 0) {
/* 67 */                        int i = this.zzd;
/* 71 */                        this.zzd = i + 1;
/* 75 */                        bArr[i] = (byte) j;
/* 77 */                        return;
                            } else {
                                try {
/* 82 */                            int i2 = this.zzd;
/* 86 */                            this.zzd = i2 + 1;
/* 94 */                            bArr[i2] = (byte) ((((int) j) | 128) & 255);
/* 96 */                            j >>>= 7;
                                } catch (IndexOutOfBoundsException e) {
/* 110 */                           throw new zzgp(this.zzd, this.zzc, 1, e);
                                }
                            }
/* 110 */                   throw new zzgp(this.zzd, this.zzc, 1, e);
                        }
                    }
                    while (true) {
/* 21 */                long j3 = j & (-128);
/* 25 */                int i3 = (int) j;
/* 26 */                byte[] bArr2 = this.zzb;
/* 28 */                if (j3 == 0) {
/* 30 */                    int i4 = this.zzd;
/* 34 */                    this.zzd = i4 + 1;
/* 38 */                    zzjq.zzn(bArr2, i4, (byte) i3);
/* 41 */                    return;
                        } else {
/* 42 */                    int i5 = this.zzd;
/* 46 */                    this.zzd = i5 + 1;
/* 54 */                    zzjq.zzn(bArr2, i5, (byte) ((i3 | 128) & 255));
/* 57 */                    j >>>= 7;
                        }
                    }
                }
            }
