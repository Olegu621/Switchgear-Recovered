            package com.google.android.gms.internal.auth;

            import java.io.IOException;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdt {
                public static int zza(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
/* 1 */             int iZzj = zzj(bArr, i, zzdsVar);
/* 5 */             int i2 = zzdsVar.zza;
/* 7 */             if (i2 < 0) {
/* 37 */                throw zzfa.zzc();
                    }
/* 11 */            if (i2 > bArr.length - iZzj) {
/* 32 */                throw zzfa.zzf();
                    }
/* 13 */            if (i2 == 0) {
/* 17 */                zzdsVar.zzc = zzee.zzb;
/* 19 */                return iZzj;
                    }
/* 24 */            zzdsVar.zzc = zzee.zzk(bArr, iZzj, i2);
/* 26 */            return iZzj + i2;
                }

                public static int zzb(byte[] bArr, int i) {
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
                }

                public static int zzc(zzgh zzghVar, byte[] bArr, int i, int i2, int i3, zzds zzdsVar) throws IOException {
/* 2 */             zzfz zzfzVar = (zzfz) zzghVar;
/* 4 */             Object objZzd = zzfzVar.zzd();
/* 13 */            int iZzb = zzfzVar.zzb(objZzd, bArr, i, i2, i3, zzdsVar);
/* 17 */            zzfzVar.zze(objZzd);
/* 20 */            zzdsVar.zzc = objZzd;
/* 22 */            return iZzb;
                }

                public static int zzd(zzgh zzghVar, byte[] bArr, int i, int i2, zzds zzdsVar) throws IOException {
/* 1 */             int iZzk = i + 1;
/* 3 */             int i3 = bArr[i];
/* 5 */             if (i3 < 0) {
/* 7 */                 iZzk = zzk(i3, bArr, iZzk, zzdsVar);
/* 11 */                i3 = zzdsVar.zza;
                    }
/* 13 */            int i4 = iZzk;
/* 14 */            if (i3 < 0 || i3 > i2 - i4) {
/* 41 */                throw zzfa.zzf();
                    }
/* 19 */            Object objZzd = zzghVar.zzd();
/* 23 */            int i5 = i4 + i3;
/* 28 */            zzghVar.zzg(objZzd, bArr, i4, i5, zzdsVar);
/* 31 */            zzghVar.zze(objZzd);
/* 34 */            zzdsVar.zzc = objZzd;
/* 36 */            return i5;
                }

                public static int zze(zzgh zzghVar, int i, byte[] bArr, int i2, int i3, zzey zzeyVar, zzds zzdsVar) throws IOException {
/* 1 */             int iZzd = zzd(zzghVar, bArr, i2, i3, zzdsVar);
/* 7 */             zzeyVar.add(zzdsVar.zzc);
/* 10 */            while (iZzd < i3) {
/* 12 */                int iZzj = zzj(bArr, iZzd, zzdsVar);
/* 18 */                if (i != zzdsVar.zza) {
                            break;
                        }
/* 21 */                iZzd = zzd(zzghVar, bArr, iZzj, i3, zzdsVar);
/* 27 */                zzeyVar.add(zzdsVar.zzc);
                    }
/* 31 */            return iZzd;
                }

                public static int zzf(byte[] bArr, int i, zzey zzeyVar, zzds zzdsVar) throws IOException {
/* 1 */             zzev zzevVar = (zzev) zzeyVar;
/* 3 */             int iZzj = zzj(bArr, i, zzdsVar);
/* 9 */             int i2 = zzdsVar.zza + iZzj;
/* 10 */            while (iZzj < i2) {
/* 12 */                iZzj = zzj(bArr, iZzj, zzdsVar);
/* 18 */                zzevVar.zze(zzdsVar.zza);
                    }
/* 22 */            if (iZzj == i2) {
/* 24 */                return iZzj;
                    }
/* 29 */            throw zzfa.zzf();
                }

                public static int zzg(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
/* 1 */             int iZzj = zzj(bArr, i, zzdsVar);
/* 5 */             int i2 = zzdsVar.zza;
/* 7 */             if (i2 < 0) {
/* 31 */                throw zzfa.zzc();
                    }
/* 9 */             if (i2 == 0) {
/* 13 */                zzdsVar.zzc = HttpUrl.FRAGMENT_ENCODE_SET;
/* 15 */                return iZzj;
                    }
/* 23 */            zzdsVar.zzc = new String(bArr, iZzj, i2, zzez.zzb);
/* 25 */            return iZzj + i2;
                }

                public static int zzh(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
/* 1 */             int iZzj = zzj(bArr, i, zzdsVar);
/* 5 */             int i2 = zzdsVar.zza;
/* 7 */             if (i2 < 0) {
/* 28 */                throw zzfa.zzc();
                    }
/* 9 */             if (i2 == 0) {
/* 13 */                zzdsVar.zzc = HttpUrl.FRAGMENT_ENCODE_SET;
/* 15 */                return iZzj;
                    }
/* 20 */            zzdsVar.zzc = zzhm.zzb(bArr, iZzj, i2);
/* 22 */            return iZzj + i2;
                }

                public static int zzi(int i, byte[] bArr, int i2, int i3, zzgz zzgzVar, zzds zzdsVar) throws zzfa {
/* 3 */             if ((i >>> 3) == 0) {
/* 159 */               throw zzfa.zza();
                    }
/* 5 */             int i4 = i & 7;
/* 7 */             if (i4 == 0) {
/* 141 */               int iZzm = zzm(bArr, i2, zzdsVar);
/* 151 */               zzgzVar.zzf(i, Long.valueOf(zzdsVar.zzb));
/* 154 */               return iZzm;
                    }
/* 10 */            if (i4 == 1) {
/* 133 */               zzgzVar.zzf(i, Long.valueOf(zzn(bArr, i2)));
/* 136 */               return i2 + 8;
                    }
/* 13 */            if (i4 == 2) {
/* 85 */                int iZzj = zzj(bArr, i2, zzdsVar);
/* 89 */                int i5 = zzdsVar.zza;
/* 91 */                if (i5 < 0) {
/* 123 */                   throw zzfa.zzc();
                        }
/* 95 */                if (i5 > bArr.length - iZzj) {
/* 118 */                   throw zzfa.zzf();
                        }
/* 97 */                if (i5 == 0) {
/* 101 */                   zzgzVar.zzf(i, zzee.zzb);
                        } else {
/* 109 */                   zzgzVar.zzf(i, zzee.zzk(bArr, iZzj, i5));
                        }
/* 112 */               return iZzj + i5;
                    }
/* 16 */            if (i4 != 3) {
/* 19 */                if (i4 != 5) {
/* 39 */                    throw zzfa.zza();
                        }
/* 29 */                zzgzVar.zzf(i, Integer.valueOf(zzb(bArr, i2)));
/* 32 */                return i2 + 4;
                    }
/* 42 */            int i6 = (i & (-8)) | 4;
/* 44 */            zzgz zzgzVarZzc = zzgz.zzc();
/* 48 */            int i7 = 0;
/* 49 */            while (i2 < i3) {
/* 51 */                int iZzj2 = zzj(bArr, i2, zzdsVar);
/* 55 */                i7 = zzdsVar.zza;
/* 57 */                if (i7 == i6) {
/* 59 */                    i2 = iZzj2;
                            break;
                        }
/* 65 */                i2 = zzi(i7, bArr, iZzj2, i3, zzgzVarZzc, zzdsVar);
                    }
/* 70 */            if (i2 > i3 || i7 != i6) {
/* 82 */                throw zzfa.zzd();
                    }
/* 74 */            zzgzVar.zzf(i, zzgzVarZzc);
/* 77 */            return i2;
                }

                public static int zzj(byte[] bArr, int i, zzds zzdsVar) {
/* 1 */             int i2 = i + 1;
/* 3 */             byte b = bArr[i];
/* 5 */             if (b < 0) {
/* 10 */                return zzk(b, bArr, i2, zzdsVar);
                    }
/* 7 */             zzdsVar.zza = b;
/* 9 */             return i2;
                }

                public static int zzk(int i, byte[] bArr, int i2, zzds zzdsVar) {
/* 1 */             int i3 = i & 127;
/* 3 */             int i4 = i2 + 1;
/* 5 */             byte b = bArr[i2];
/* 7 */             if (b >= 0) {
/* 12 */                zzdsVar.zza = i3 | (b << 7);
/* 14 */                return i4;
                    }
/* 19 */            int i5 = i3 | ((b & 127) << 7);
/* 20 */            int i6 = i2 + 2;
/* 22 */            byte b2 = bArr[i4];
/* 24 */            if (b2 >= 0) {
/* 29 */                zzdsVar.zza = i5 | (b2 << 14);
/* 31 */                return i6;
                    }
/* 36 */            int i7 = i5 | ((b2 & 127) << 14);
/* 37 */            int i8 = i2 + 3;
/* 39 */            byte b3 = bArr[i6];
/* 41 */            if (b3 >= 0) {
/* 46 */                zzdsVar.zza = i7 | (b3 << 21);
/* 48 */                return i8;
                    }
/* 53 */            int i9 = i7 | ((b3 & 127) << 21);
/* 54 */            int i10 = i2 + 4;
/* 56 */            byte b4 = bArr[i8];
/* 58 */            if (b4 >= 0) {
/* 63 */                zzdsVar.zza = i9 | (b4 << 28);
/* 65 */                return i10;
                    }
/* 70 */            int i11 = i9 | ((b4 & 127) << 28);
                    while (true) {
/* 71 */                int i12 = i10 + 1;
/* 75 */                if (bArr[i10] >= 0) {
/* 79 */                    zzdsVar.zza = i11;
/* 81 */                    return i12;
                        }
/* 77 */                i10 = i12;
                    }
                }

                public static int zzl(int i, byte[] bArr, int i2, int i3, zzey zzeyVar, zzds zzdsVar) {
/* 1 */             zzev zzevVar = (zzev) zzeyVar;
/* 3 */             int iZzj = zzj(bArr, i2, zzdsVar);
/* 9 */             zzevVar.zze(zzdsVar.zza);
/* 12 */            while (iZzj < i3) {
/* 14 */                int iZzj2 = zzj(bArr, iZzj, zzdsVar);
/* 20 */                if (i != zzdsVar.zza) {
                            break;
                        }
/* 23 */                iZzj = zzj(bArr, iZzj2, zzdsVar);
/* 29 */                zzevVar.zze(zzdsVar.zza);
                    }
/* 33 */            return iZzj;
                }

                public static int zzm(byte[] bArr, int i, zzds zzdsVar) {
/* 1 */             int i2 = i + 1;
/* 3 */             long j = bArr[i];
/* 10 */            if (j >= 0) {
/* 12 */                zzdsVar.zzb = j;
/* 14 */                return i2;
                    }
/* 15 */            int i3 = i + 2;
/* 17 */            byte b = bArr[i2];
/* 27 */            long j2 = (j & 127) | (((long) (b & 127)) << 7);
/* 28 */            int i4 = 7;
/* 29 */            while (b < 0) {
/* 31 */                int i5 = i3 + 1;
/* 33 */                byte b2 = bArr[i3];
/* 35 */                i4 += 7;
/* 40 */                j2 |= ((long) (b2 & 127)) << i4;
/* 42 */                b = b2;
/* 43 */                i3 = i5;
                    }
/* 45 */            zzdsVar.zzb = j2;
/* 47 */            return i3;
                }

                public static long zzn(byte[] bArr, int i) {
/* 76 */            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
                }
            }
