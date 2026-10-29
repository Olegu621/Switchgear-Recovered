            package com.google.android.gms.internal.drive;

            import io.sentry.C1697u2;
            import java.io.IOException;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public abstract class zzjr extends zzjb {
                private static final Logger logger = Logger.getLogger(zzjr.class.getName());
                private static final boolean zzog = zznd.zzfd();
                zzjt zzoh;

                private zzjr() {
                }

                public static int zzab(int i) {
/* 3 */             return zzad(i << 3);
                }

                public static int zzac(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return zzad(i);
                    }
/* 8 */             return 10;
                }

                public static int zzad(int i) {
/* 3 */             if ((i & (-128)) == 0) {
/* 5 */                 return 1;
                    }
/* 9 */             if ((i & (-16384)) == 0) {
/* 11 */                return 2;
                    }
/* 16 */            if (((-2097152) & i) == 0) {
/* 18 */                return 3;
                    }
                    return (i & (-268435456)) == 0 ? 4 : 5;
                }

                public static int zzae(int i) {
/* 5 */             return zzad(zzai(i));
                }

                public static int zzaf(int i) {
/* 1 */             return 4;
                }

                public static int zzag(int i) {
/* 1 */             return 4;
                }

                public static int zzah(int i) {
/* 1 */             return zzac(i);
                }

                private static int zzai(int i) {
/* 5 */             return (i >> 31) ^ (i << 1);
                }

                @Deprecated
                public static int zzaj(int i) {
/* 1 */             return zzad(i);
                }

                public static int zzb(int i, zzlq zzlqVar) {
/* 24 */            return zzc(zzlqVar) + zzab(3) + zzh(2, i) + (zzab(1) << 1);
                }

                @Deprecated
                public static int zzc(int i, zzlq zzlqVar, zzmf zzmfVar) {
/* 5 */             int iZzab = zzab(i) << 1;
/* 7 */             zzit zzitVar = (zzit) zzlqVar;
/* 9 */             int iZzbm = zzitVar.zzbm();
/* 14 */            if (iZzbm == -1) {
/* 16 */                iZzbm = zzmfVar.zzn(zzitVar);
/* 20 */                zzitVar.zzo(iZzbm);
                    }
/* 23 */            return iZzab + iZzbm;
                }

                public static int zzd(int i, zzjc zzjcVar) {
/* 19 */            return zzc(3, zzjcVar) + zzh(2, i) + (zzab(1) << 1);
                }

                public static int zze(int i, long j) {
/* 9 */             return zzp(j) + zzab(i);
                }

                public static int zzf(int i, long j) {
/* 13 */            return zzp(zzt(j)) + zzab(i);
                }

                public static int zzg(int i, int i2) {
/* 9 */             return zzac(i2) + zzab(i);
                }

                public static int zzh(int i, int i2) {
/* 9 */             return zzad(i2) + zzab(i);
                }

                public static int zzi(int i, int i2) {
/* 13 */            return zzad(zzai(i2)) + zzab(i);
                }

                public static int zzj(int i, int i2) {
/* 5 */             return zzab(i) + 4;
                }

                public static int zzk(int i, int i2) {
/* 5 */             return zzab(i) + 4;
                }

                public static int zzl(int i, int i2) {
/* 9 */             return zzac(i2) + zzab(i);
                }

                public static int zzm(String str) {
                    int length;
                    try {
/* 1 */                 length = zznf.zza(str);
                    } catch (zznj unused) {
/* 12 */                length = str.getBytes(zzkm.UTF_8).length;
                    }
/* 17 */            return zzad(length) + length;
                }

                public static int zzo(long j) {
/* 1 */             return zzp(j);
                }

                public static int zzp(long j) {
                    int i;
/* 9 */             if (((-128) & j) == 0) {
/* 8 */                 return 1;
                    }
/* 14 */            if (j < 0) {
/* 16 */                return 10;
                    }
/* 27 */            if (((-34359738368L) & j) != 0) {
/* 31 */                j >>>= 28;
/* 32 */                i = 6;
                    } else {
/* 34 */                i = 2;
                    }
/* 41 */            if (((-2097152) & j) != 0) {
/* 43 */                i += 2;
/* 47 */                j >>>= 14;
                    }
                    return (j & (-16384)) != 0 ? i + 1 : i;
                }

                public static int zzq(long j) {
/* 5 */             return zzp(zzt(j));
                }

                public static int zzr(long j) {
/* 1 */             return 8;
                }

                public static int zzs(long j) {
/* 1 */             return 8;
                }

                private static long zzt(long j) {
/* 7 */             return (j >> 63) ^ (j << 1);
                }

                public abstract void zza(int i, long j) throws IOException;

                public abstract void zza(int i, zzjc zzjcVar) throws IOException;

                public abstract void zza(int i, zzlq zzlqVar) throws IOException;

                public abstract void zza(int i, zzlq zzlqVar, zzmf zzmfVar) throws IOException;

                public abstract void zza(int i, String str) throws IOException;

                public abstract void zza(zzjc zzjcVar) throws IOException;

                public final void zza(String str, zznj zznjVar) throws IOException {
/* 12 */            logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zznjVar);
/* 17 */            byte[] bytes = str.getBytes(zzkm.UTF_8);
                    try {
/* 22 */                zzy(bytes.length);
/* 27 */                zza(bytes, 0, bytes.length);
                    } catch (zzb e) {
/* 33 */                throw e;
                    } catch (IndexOutOfBoundsException e2) {
/* 41 */                throw new zzb(e2);
                    }
                }

                public abstract void zzaa(int i) throws IOException;

                public abstract void zzb(int i, int i2) throws IOException;

                public abstract void zzb(int i, zzjc zzjcVar) throws IOException;

                public abstract void zzb(int i, boolean z) throws IOException;

                public abstract void zzb(zzlq zzlqVar) throws IOException;

                public abstract void zzc(byte b) throws IOException;

                public abstract void zzc(int i, int i2) throws IOException;

                public abstract void zzc(int i, long j) throws IOException;

                public abstract int zzca();

                public final void zzcb() {
/* 5 */             if (zzca() == 0) {
/* 7 */                 return;
                    }
/* 10 */            f42.m3656l("Did not write as much data as expected.");
                }

                public abstract void zzd(int i, int i2) throws IOException;

                public abstract void zzd(byte[] bArr, int i, int i2) throws IOException;

                public abstract void zzf(int i, int i2) throws IOException;

                public abstract void zzl(long j) throws IOException;

                public abstract void zzl(String str) throws IOException;

                public abstract void zzn(long j) throws IOException;

                public abstract void zzx(int i) throws IOException;

                public abstract void zzy(int i) throws IOException;

                public final void zzz(int i) throws IOException {
/* 5 */             zzy(zzai(i));
                }

/* 7 */         public static class zza extends zzjr {
                    private final byte[] buffer;
                    private final int limit;
                    private final int offset;
                    private int position;

                    public zza(byte[] bArr, int i, int i2) {
/* 2 */                 super();
/* 5 */                 if (bArr == null) {
/* 47 */                    C1951n4.m6868s("buffer");
/* 50 */                    throw null;
                        }
/* 11 */                if (((bArr.length - i2) | i2) < 0) {
/* 41 */                    C1697u2.m5437m("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)});
/* 44 */                    throw null;
                        }
/* 13 */                this.buffer = bArr;
/* 15 */                this.offset = 0;
/* 17 */                this.position = 0;
/* 19 */                this.limit = i2;
                    }

                    private final void write(byte[] bArr, int i, int i2) throws IOException {
                        try {
/* 5 */                     System.arraycopy(bArr, i, this.buffer, this.position, i2);
/* 11 */                    this.position += i2;
                        } catch (IndexOutOfBoundsException e) {
/* 46 */                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)), e);
                        }
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
                    public final void zza(int i, zzlq zzlqVar, zzmf zzmfVar) throws IOException {
/* 2 */                 zzb(i, 2);
/* 6 */                 zzit zzitVar = (zzit) zzlqVar;
/* 8 */                 int iZzbm = zzitVar.zzbm();
/* 13 */                if (iZzbm == -1) {
/* 15 */                    iZzbm = zzmfVar.zzn(zzitVar);
/* 19 */                    zzitVar.zzo(iZzbm);
                        }
/* 22 */                zzy(iZzbm);
/* 27 */                zzmfVar.zza(zzlqVar, this.zzoh);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
                    public final void zzaa(int i) throws IOException {
                        try {
/* 1 */                     byte[] bArr = this.buffer;
/* 3 */                     int i2 = this.position;
/* 5 */                     int i3 = i2 + 1;
/* 7 */                     this.position = i3;
/* 10 */                    bArr[i2] = (byte) i;
/* 12 */                    int i4 = i2 + 2;
/* 14 */                    this.position = i4;
/* 19 */                    bArr[i3] = (byte) (i >> 8);
/* 21 */                    int i5 = i2 + 3;
/* 23 */                    this.position = i5;
/* 28 */                    bArr[i4] = (byte) (i >> 16);
/* 32 */                    this.position = i2 + 4;
/* 37 */                    bArr[i5] = (byte) (i >>> 24);
                        } catch (IndexOutOfBoundsException e) {
/* 73 */                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                        }
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
                    public final void zzb(int i, zzjc zzjcVar) throws IOException {
/* 3 */                 zzb(1, 3);
/* 7 */                 zzd(2, i);
/* 10 */                zza(3, zzjcVar);
/* 14 */                zzb(1, 4);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
                    public final void zzc(byte b) throws IOException {
                        try {
/* 1 */                     byte[] bArr = this.buffer;
/* 3 */                     int i = this.position;
/* 7 */                     this.position = i + 1;
/* 9 */                     bArr[i] = b;
                        } catch (IndexOutOfBoundsException e) {
/* 45 */                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                        }
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
                    public final int zzca() {
/* 5 */                 return this.limit - this.position;
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
                    public final void zzd(int i, int i2) throws IOException {
/* 2 */                 zzb(i, 0);
/* 5 */                 zzy(i2);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
                    public final void zzf(int i, int i2) throws IOException {
/* 2 */                 zzb(i, 5);
/* 5 */                 zzaa(i2);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
                    public final void zzl(long j) throws IOException {
/* 10 */                if (!zzjr.zzog || zzca() < 10) {
                            while (true) {
/* 59 */                        long j2 = j & (-128);
/* 63 */                        byte[] bArr = this.buffer;
/* 65 */                        if (j2 == 0) {
/* 67 */                            int i = this.position;
/* 71 */                            this.position = i + 1;
/* 75 */                            bArr[i] = (byte) j;
/* 77 */                            return;
                                } else {
                                    try {
/* 80 */                                int i2 = this.position;
/* 84 */                                this.position = i2 + 1;
/* 92 */                                bArr[i2] = (byte) ((((int) j) & 127) | 128);
/* 94 */                                j >>>= 7;
                                    } catch (IndexOutOfBoundsException e) {
/* 128 */                               throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                                    }
                                }
/* 128 */                       throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                            }
                        }
                        while (true) {
/* 20 */                    long j3 = j & (-128);
/* 24 */                    byte[] bArr2 = this.buffer;
/* 26 */                    if (j3 == 0) {
/* 28 */                        int i3 = this.position;
/* 32 */                        this.position = i3 + 1;
/* 37 */                        zznd.zza(bArr2, i3, (byte) j);
/* 40 */                        return;
                            } else {
/* 41 */                        int i4 = this.position;
/* 45 */                        this.position = i4 + 1;
/* 54 */                        zznd.zza(bArr2, i4, (byte) ((((int) j) & 127) | 128));
/* 57 */                        j >>>= 7;
                            }
                        }
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
                    public final void zzn(long j) throws IOException {
                        try {
/* 1 */                     byte[] bArr = this.buffer;
/* 3 */                     int i = this.position;
/* 5 */                     int i2 = i + 1;
/* 7 */                     this.position = i2;
/* 11 */                    bArr[i] = (byte) j;
/* 13 */                    int i3 = i + 2;
/* 15 */                    this.position = i3;
/* 23 */                    bArr[i2] = (byte) (j >> 8);
/* 25 */                    int i4 = i + 3;
/* 27 */                    this.position = i4;
/* 35 */                    bArr[i3] = (byte) (j >> 16);
/* 37 */                    int i5 = i + 4;
/* 39 */                    this.position = i5;
/* 47 */                    bArr[i4] = (byte) (j >> 24);
/* 49 */                    int i6 = i + 5;
/* 51 */                    this.position = i6;
/* 59 */                    bArr[i5] = (byte) (j >> 32);
/* 61 */                    int i7 = i + 6;
/* 63 */                    this.position = i7;
/* 71 */                    bArr[i6] = (byte) (j >> 40);
/* 73 */                    int i8 = i + 7;
/* 75 */                    this.position = i8;
/* 83 */                    bArr[i7] = (byte) (j >> 48);
/* 86 */                    this.position = i + 8;
/* 93 */                    bArr[i8] = (byte) (j >> 56);
                        } catch (IndexOutOfBoundsException e) {
/* 129 */                   throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                        }
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
                    public final void zzx(int i) throws IOException {
/* 1 */                 if (i >= 0) {
/* 3 */                     zzy(i);
                        } else {
/* 8 */                     zzl(i);
                        }
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
                    public final void zzy(int i) throws IOException {
/* 5 */                 if (!zzjr.zzog || zzix.zzbr() || zzca() < 5) {
                            while (true) {
/* 166 */                       int i2 = i & (-128);
/* 168 */                       byte[] bArr = this.buffer;
/* 170 */                       if (i2 == 0) {
/* 172 */                           int i3 = this.position;
/* 176 */                           this.position = i3 + 1;
/* 179 */                           bArr[i3] = (byte) i;
/* 181 */                           return;
                                } else {
                                    try {
/* 184 */                               int i4 = this.position;
/* 188 */                               this.position = i4 + 1;
/* 195 */                               bArr[i4] = (byte) ((i & 127) | 128);
/* 197 */                               i >>>= 7;
                                    } catch (IndexOutOfBoundsException e) {
/* 232 */                               throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                                    }
                                }
/* 232 */                       throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                            }
                        }
/* 20 */                int i5 = i & (-128);
/* 22 */                byte[] bArr2 = this.buffer;
/* 24 */                if (i5 == 0) {
/* 26 */                    int i6 = this.position;
/* 30 */                    this.position = i6 + 1;
/* 34 */                    zznd.zza(bArr2, i6, (byte) i);
/* 37 */                    return;
                        }
/* 38 */                int i7 = this.position;
/* 42 */                this.position = i7 + 1;
/* 48 */                zznd.zza(bArr2, i7, (byte) (i | 128));
/* 51 */                int i8 = i >>> 7;
/* 53 */                int i9 = i8 & (-128);
/* 55 */                byte[] bArr3 = this.buffer;
/* 57 */                if (i9 == 0) {
/* 59 */                    int i10 = this.position;
/* 63 */                    this.position = i10 + 1;
/* 67 */                    zznd.zza(bArr3, i10, (byte) i8);
/* 70 */                    return;
                        }
/* 71 */                int i11 = this.position;
/* 75 */                this.position = i11 + 1;
/* 81 */                zznd.zza(bArr3, i11, (byte) (i8 | 128));
/* 84 */                int i12 = i >>> 14;
/* 86 */                int i13 = i12 & (-128);
/* 88 */                byte[] bArr4 = this.buffer;
/* 90 */                if (i13 == 0) {
/* 92 */                    int i14 = this.position;
/* 96 */                    this.position = i14 + 1;
/* 100 */                   zznd.zza(bArr4, i14, (byte) i12);
/* 103 */                   return;
                        }
/* 104 */               int i15 = this.position;
/* 108 */               this.position = i15 + 1;
/* 114 */               zznd.zza(bArr4, i15, (byte) (i12 | 128));
/* 117 */               int i16 = i >>> 21;
/* 119 */               int i17 = i16 & (-128);
/* 121 */               byte[] bArr5 = this.buffer;
/* 123 */               if (i17 == 0) {
/* 125 */                   int i18 = this.position;
/* 129 */                   this.position = i18 + 1;
/* 133 */                   zznd.zza(bArr5, i18, (byte) i16);
/* 136 */                   return;
                        }
/* 137 */               int i19 = this.position;
/* 141 */               this.position = i19 + 1;
/* 147 */               zznd.zza(bArr5, i19, (byte) (i16 | 128));
/* 152 */               byte[] bArr6 = this.buffer;
/* 154 */               int i20 = this.position;
/* 158 */               this.position = i20 + 1;
/* 162 */               zznd.zza(bArr6, i20, (byte) (i >>> 28));
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
/* 8 */             public final void zzd(byte[] bArr, int i, int i2) throws IOException {
/* 9 */                 zzy(i2);
/* 10 */                write(bArr, 0, i2);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
/* 17 */            public final void zzb(int i, boolean z) throws IOException {
/* 18 */                zzb(i, 0);
/* 19 */                zzc(z ? (byte) 1 : (byte) 0);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
/* 19 */            public final void zzb(int i, int i2) throws IOException {
/* 20 */                zzy((i << 3) | i2);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
/* 20 */            public final void zzb(zzlq zzlqVar) throws IOException {
/* 21 */                zzy(zzlqVar.zzcx());
/* 22 */                zzlqVar.zzb(this);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
/* 30 */            public final void zza(int i, String str) throws IOException {
/* 31 */                zzb(i, 2);
/* 32 */                zzl(str);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
/* 32 */            public final void zza(int i, zzjc zzjcVar) throws IOException {
/* 33 */                zzb(i, 2);
/* 34 */                zza(zzjcVar);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
/* 34 */            public final void zza(zzjc zzjcVar) throws IOException {
/* 35 */                zzy(zzjcVar.size());
/* 36 */                zzjcVar.zza(this);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
/* 36 */            public final void zza(int i, long j) throws IOException {
/* 37 */                zzb(i, 0);
/* 38 */                zzl(j);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
/* 38 */            public final void zza(int i, zzlq zzlqVar) throws IOException {
/* 39 */                zzb(1, 3);
/* 40 */                zzd(2, i);
/* 41 */                zzb(3, 2);
/* 42 */                zzb(zzlqVar);
/* 43 */                zzb(1, 4);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjb
/* 43 */            public final void zza(byte[] bArr, int i, int i2) throws IOException {
/* 44 */                write(bArr, i, i2);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
/* 45 */            public final void zzc(int i, long j) throws IOException {
/* 46 */                zzb(i, 1);
/* 47 */                zzn(j);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
/* 47 */            public final void zzc(int i, int i2) throws IOException {
/* 48 */                zzb(i, 0);
/* 49 */                zzx(i2);
                    }

                    @Override // com.google.android.gms.internal.drive.zzjr
/* 128 */           public final void zzl(String str) throws IOException {
/* 129 */               int i = this.position;
                        try {
/* 131 */                   int iZzad = zzjr.zzad(str.length() * 3);
/* 132 */                   int iZzad2 = zzjr.zzad(str.length());
                            if (iZzad2 == iZzad) {
                                int i2 = i + iZzad2;
/* 133 */                       this.position = i2;
/* 134 */                       int iZza = zznf.zza(str, this.buffer, i2, zzca());
/* 135 */                       this.position = i;
/* 136 */                       zzy((iZza - i) - iZzad2);
/* 137 */                       this.position = iZza;
                                return;
                            }
/* 139 */                   zzy(zznf.zza(str));
/* 140 */                   this.position = zznf.zza(str, this.buffer, this.position, zzca());
                        } catch (zznj e) {
/* 142 */                   this.position = i;
/* 143 */                   zza(str, e);
                        } catch (IndexOutOfBoundsException e2) {
/* 141 */                   throw new zzb(e2);
                        }
                    }
                }

/* 10 */        public static int zzg(int i, long j) {
/* 11 */            return zzab(i) + 8;
                }

/* 10 */        public static int zzh(int i, long j) {
/* 11 */            return zzab(i) + 8;
                }

/* 10 */        public final void zze(int i, int i2) throws IOException {
/* 11 */            zzd(i, zzai(i2));
                }

/* 18 */        public final void zzm(long j) throws IOException {
/* 19 */            zzl(zzt(j));
                }

/* 20 */        public static int zzd(int i, long j) {
/* 22 */            return zzp(j) + zzab(i);
                }

/* 22 */        public static int zzd(boolean z) {
/* 23 */            return 1;
                }

                @Deprecated
/* 23 */        public static int zzd(zzlq zzlqVar) {
/* 24 */            return zzlqVar.zzcx();
                }

/* 24 */        public final void zzc(boolean z) throws IOException {
/* 25 */            zzc(z ? (byte) 1 : (byte) 0);
                }

/* 25 */        public static class zzb extends IOException {
                    /* JADX WARN: Illegal instructions before constructor call */
                    public zzb(String str, Throwable th) {
/* 1 */                 String strValueOf = String.valueOf(str);
/* 23 */                super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
                    }

/* 26 */            public zzb(Throwable th) {
/* 27 */                super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
                    }

/* 27 */            public zzb() {
/* 28 */                super("CodedOutputStream was writing to a flat byte array and ran out of space.");
                    }
                }

/* 25 */        public static int zzb(float f) {
/* 26 */            return 4;
                }

/* 25 */        public static int zzc(int i, boolean z) {
/* 26 */            return zzab(i) + 1;
                }

/* 26 */        public static zzjr zzb(byte[] bArr) {
/* 28 */            return new zza(bArr, 0, bArr.length);
                }

/* 26 */        public static int zzc(int i, zzjc zzjcVar) {
/* 27 */            int iZzab = zzab(i);
/* 28 */            int size = zzjcVar.size();
/* 29 */            return zzad(size) + size + iZzab;
                }

/* 28 */        public final void zzb(int i, long j) throws IOException {
/* 29 */            zza(i, zzt(j));
                }

/* 29 */        public static int zzb(int i, float f) {
/* 30 */            return zzab(i) + 4;
                }

/* 29 */        public static int zzc(byte[] bArr) {
/* 30 */            int length = bArr.length;
/* 31 */            return zzad(length) + length;
                }

/* 30 */        public static int zzb(int i, double d) {
/* 31 */            return zzab(i) + 8;
                }

/* 31 */        public static int zzb(int i, String str) {
                    return zzm(str) + zzab(i);
                }

/* 31 */        public static int zzc(zzlq zzlqVar) {
/* 32 */            int iZzcx = zzlqVar.zzcx();
/* 33 */            return zzad(iZzcx) + iZzcx;
                }

/* 32 */        public static int zzb(int i, zzlq zzlqVar, zzmf zzmfVar) {
                    return zza(zzlqVar, zzmfVar) + zzab(i);
                }

/* 33 */        public static int zzb(double d) {
/* 34 */            return 8;
                }

/* 34 */        public static int zzb(int i, zzkx zzkxVar) {
/* 37 */            return zza(3, zzkxVar) + zzh(2, i) + (zzab(1) << 1);
                }

/* 37 */        public static int zzb(zzjc zzjcVar) {
/* 38 */            int size = zzjcVar.size();
/* 39 */            return zzad(size) + size;
                }

/* 41 */        public final void zza(int i, float f) throws IOException {
/* 42 */            zzf(i, Float.floatToRawIntBits(f));
                }

/* 42 */        public final void zza(int i, double d) throws IOException {
/* 43 */            zzc(i, Double.doubleToRawLongBits(d));
                }

/* 43 */        public final void zza(float f) throws IOException {
/* 44 */            zzaa(Float.floatToRawIntBits(f));
                }

/* 44 */        public final void zza(double d) throws IOException {
/* 45 */            zzn(Double.doubleToRawLongBits(d));
                }

/* 45 */        public static int zza(int i, zzkx zzkxVar) {
/* 46 */            int iZzab = zzab(i);
/* 47 */            int iZzcx = zzkxVar.zzcx();
/* 48 */            return zzad(iZzcx) + iZzcx + iZzab;
                }

/* 48 */        public static int zza(zzkx zzkxVar) {
/* 49 */            int iZzcx = zzkxVar.zzcx();
/* 50 */            return zzad(iZzcx) + iZzcx;
                }

/* 50 */        public static int zza(zzlq zzlqVar, zzmf zzmfVar) {
/* 51 */            zzit zzitVar = (zzit) zzlqVar;
/* 52 */            int iZzbm = zzitVar.zzbm();
                    if (iZzbm == -1) {
/* 53 */                iZzbm = zzmfVar.zzn(zzitVar);
/* 54 */                zzitVar.zzo(iZzbm);
                    }
/* 55 */            return zzad(iZzbm) + iZzbm;
                }
            }
