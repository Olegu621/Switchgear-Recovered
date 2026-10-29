            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import okhttp3.HttpUrl;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzqc {
                public static final /* synthetic */ int zza = 0;
                private static volatile int zzb = 100;

                public static int zza(byte[] bArr, int i, zzqb zzqbVar) throws zzsx {
/* 1 */             int iZzi = zzi(bArr, i, zzqbVar);
/* 5 */             int i2 = zzqbVar.zza;
/* 8 */             if (i2 < 0) {
/* 37 */                pk3.m7475k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 7 */                 return 0;
                    }
/* 12 */            if (i2 > bArr.length - iZzi) {
/* 31 */                pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 7 */                 return 0;
                    }
/* 14 */            if (i2 == 0) {
/* 18 */                zzqbVar.zzc = zzqm.zzb;
/* 20 */                return iZzi;
                    }
/* 25 */            zzqbVar.zzc = zzqm.zzl(bArr, iZzi, i2);
/* 27 */            return iZzi + i2;
                }

                public static int zzb(byte[] bArr, int i) {
/* 3 */             int i2 = bArr[i] & 255;
/* 9 */             int i3 = bArr[i + 1] & 255;
/* 15 */            int i4 = bArr[i + 2] & 255;
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
                }

                public static int zzc(zzug zzugVar, byte[] bArr, int i, int i2, int i3, zzqb zzqbVar) throws IOException {
/* 1 */             Object objZze = zzugVar.zze();
/* 11 */            int iZzm = zzm(objZze, zzugVar, bArr, i, i2, i3, zzqbVar);
/* 15 */            zzugVar.zzf(objZze);
/* 18 */            zzqbVar.zzc = objZze;
/* 20 */            return iZzm;
                }

                public static int zzd(zzug zzugVar, byte[] bArr, int i, int i2, zzqb zzqbVar) throws IOException {
/* 1 */             Object objZze = zzugVar.zze();
/* 10 */            int iZzn = zzn(objZze, zzugVar, bArr, i, i2, zzqbVar);
/* 14 */            zzugVar.zzf(objZze);
/* 17 */            zzqbVar.zzc = objZze;
/* 19 */            return iZzn;
                }

                public static int zze(zzug zzugVar, int i, byte[] bArr, int i2, int i3, zzsu zzsuVar, zzqb zzqbVar) throws IOException {
/* 1 */             int iZzd = zzd(zzugVar, bArr, i2, i3, zzqbVar);
/* 7 */             zzsuVar.add(zzqbVar.zzc);
/* 10 */            while (iZzd < i3) {
/* 12 */                int iZzi = zzi(bArr, iZzd, zzqbVar);
/* 18 */                if (i != zzqbVar.zza) {
                            break;
                        }
/* 21 */                iZzd = zzd(zzugVar, bArr, iZzi, i3, zzqbVar);
/* 27 */                zzsuVar.add(zzqbVar.zzc);
                    }
/* 31 */            return iZzd;
                }

                public static int zzf(byte[] bArr, int i, zzsu zzsuVar, zzqb zzqbVar) throws IOException {
/* 1 */             zzso zzsoVar = (zzso) zzsuVar;
/* 3 */             int iZzi = zzi(bArr, i, zzqbVar);
/* 9 */             int i2 = zzqbVar.zza + iZzi;
/* 10 */            while (iZzi < i2) {
/* 12 */                iZzi = zzi(bArr, iZzi, zzqbVar);
/* 18 */                zzsoVar.zzh(zzqbVar.zza);
                    }
/* 22 */            if (iZzi == i2) {
/* 24 */                return iZzi;
                    }
/* 27 */            pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 30 */            return 0;
                }

                public static int zzg(byte[] bArr, int i, zzqb zzqbVar) throws zzsx {
/* 1 */             int iZzi = zzi(bArr, i, zzqbVar);
/* 5 */             int i2 = zzqbVar.zza;
/* 7 */             if (i2 < 0) {
/* 29 */                pk3.m7475k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 32 */                return 0;
                    }
/* 9 */             if (i2 == 0) {
/* 13 */                zzqbVar.zzc = HttpUrl.FRAGMENT_ENCODE_SET;
/* 15 */                return iZzi;
                    }
/* 23 */            zzqbVar.zzc = new String(bArr, iZzi, i2, zzsv.zza);
/* 25 */            return iZzi + i2;
                }

                public static int zzh(int i, byte[] bArr, int i2, int i3, zzuw zzuwVar, zzqb zzqbVar) throws zzsx {
/* 6 */             if ((i >>> 3) == 0) {
/* 177 */               pk3.m7475k("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 8 */             int i4 = i & 7;
/* 10 */            if (i4 == 0) {
/* 163 */               int iZzl = zzl(bArr, i2, zzqbVar);
/* 173 */               zzuwVar.zzj(i, Long.valueOf(zzqbVar.zzb));
/* 176 */               return iZzl;
                    }
/* 13 */            if (i4 == 1) {
/* 155 */               zzuwVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
/* 158 */               return i2 + 8;
                    }
/* 16 */            if (i4 == 2) {
/* 105 */               int iZzi = zzi(bArr, i2, zzqbVar);
/* 109 */               int i5 = zzqbVar.zza;
/* 111 */               if (i5 < 0) {
/* 142 */                   pk3.m7475k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 3 */                     return 0;
                        }
/* 115 */               if (i5 > bArr.length - iZzi) {
/* 136 */                   pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 3 */                     return 0;
                        }
/* 117 */               if (i5 == 0) {
/* 121 */                   zzuwVar.zzj(i, zzqm.zzb);
                        } else {
/* 129 */                   zzuwVar.zzj(i, zzqm.zzl(bArr, iZzi, i5));
                        }
/* 132 */               return iZzi + i5;
                    }
/* 19 */            if (i4 != 3) {
/* 22 */                if (i4 == 5) {
/* 32 */                    zzuwVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
/* 35 */                    return i2 + 4;
                        }
/* 38 */                pk3.m7475k("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 44 */            int i6 = (i & (-8)) | 4;
/* 46 */            zzuw zzuwVarZzf = zzuw.zzf();
/* 52 */            int i7 = zzqbVar.zze + 1;
/* 53 */            zzqbVar.zze = i7;
/* 55 */            zzq(i7);
/* 58 */            int i8 = 0;
/* 59 */            while (i2 < i3) {
/* 61 */                int iZzi2 = zzi(bArr, i2, zzqbVar);
/* 65 */                int i9 = zzqbVar.zza;
/* 67 */                if (i9 == i6) {
/* 69 */                    i8 = i9;
/* 70 */                    i2 = iZzi2;
                            break;
                        }
/* 77 */                i2 = zzh(i9, bArr, iZzi2, i3, zzuwVarZzf, zzqbVar);
/* 81 */                i8 = i9;
                    }
/* 87 */            zzqbVar.zze--;
/* 89 */            if (i2 > i3 || i8 != i6) {
/* 99 */                pk3.m7475k("Failed to parse the message.");
/* 3 */                 return 0;
                    }
/* 93 */            zzuwVar.zzj(i, zzuwVarZzf);
/* 96 */            return i2;
                }

                public static int zzi(byte[] bArr, int i, zzqb zzqbVar) {
/* 1 */             int i2 = i + 1;
/* 3 */             byte b = bArr[i];
/* 5 */             if (b < 0) {
/* 10 */                return zzj(b, bArr, i2, zzqbVar);
                    }
/* 7 */             zzqbVar.zza = b;
/* 9 */             return i2;
                }

                public static int zzj(int i, byte[] bArr, int i2, zzqb zzqbVar) {
/* 1 */             byte b = bArr[i2];
/* 3 */             int i3 = i2 + 1;
/* 5 */             int i4 = i & 127;
/* 7 */             if (b >= 0) {
/* 12 */                zzqbVar.zza = i4 | (b << 7);
/* 14 */                return i3;
                    }
/* 19 */            int i5 = i4 | ((b & 127) << 7);
/* 20 */            int i6 = i2 + 2;
/* 22 */            byte b2 = bArr[i3];
/* 24 */            if (b2 >= 0) {
/* 29 */                zzqbVar.zza = i5 | (b2 << 14);
/* 31 */                return i6;
                    }
/* 36 */            int i7 = i5 | ((b2 & 127) << 14);
/* 37 */            int i8 = i2 + 3;
/* 39 */            byte b3 = bArr[i6];
/* 41 */            if (b3 >= 0) {
/* 46 */                zzqbVar.zza = i7 | (b3 << 21);
/* 48 */                return i8;
                    }
/* 53 */            int i9 = i7 | ((b3 & 127) << 21);
/* 54 */            int i10 = i2 + 4;
/* 56 */            byte b4 = bArr[i8];
/* 58 */            if (b4 >= 0) {
/* 63 */                zzqbVar.zza = i9 | (b4 << 28);
/* 65 */                return i10;
                    }
/* 70 */            int i11 = i9 | ((b4 & 127) << 28);
                    while (true) {
/* 71 */                int i12 = i10 + 1;
/* 75 */                if (bArr[i10] >= 0) {
/* 79 */                    zzqbVar.zza = i11;
/* 81 */                    return i12;
                        }
/* 77 */                i10 = i12;
                    }
                }

                public static int zzk(int i, byte[] bArr, int i2, int i3, zzsu zzsuVar, zzqb zzqbVar) {
/* 1 */             zzso zzsoVar = (zzso) zzsuVar;
/* 3 */             int iZzi = zzi(bArr, i2, zzqbVar);
/* 9 */             zzsoVar.zzh(zzqbVar.zza);
/* 12 */            while (iZzi < i3) {
/* 14 */                int iZzi2 = zzi(bArr, iZzi, zzqbVar);
/* 20 */                if (i != zzqbVar.zza) {
                            break;
                        }
/* 23 */                iZzi = zzi(bArr, iZzi2, zzqbVar);
/* 29 */                zzsoVar.zzh(zzqbVar.zza);
                    }
/* 33 */            return iZzi;
                }

                public static int zzl(byte[] bArr, int i, zzqb zzqbVar) {
/* 1 */             long j = bArr[i];
/* 8 */             int i2 = i + 1;
/* 10 */            if (j >= 0) {
/* 12 */                zzqbVar.zzb = j;
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
/* 45 */            zzqbVar.zzb = j2;
/* 47 */            return i3;
                }

                public static int zzm(Object obj, zzug zzugVar, byte[] bArr, int i, int i2, int i3, zzqb zzqbVar) throws IOException {
/* 5 */             int i4 = zzqbVar.zze + 1;
/* 7 */             zzqbVar.zze = i4;
/* 9 */             zzq(i4);
/* 15 */            int iZzc = ((zztv) zzugVar).zzc(obj, bArr, i, i2, i3, zzqbVar);
/* 23 */            zzqbVar.zze--;
/* 25 */            zzqbVar.zzc = obj;
/* 27 */            return iZzc;
                }

                public static int zzn(Object obj, zzug zzugVar, byte[] bArr, int i, int i2, zzqb zzqbVar) throws IOException {
/* 1 */             int iZzj = i + 1;
/* 3 */             int i3 = bArr[i];
/* 5 */             if (i3 < 0) {
/* 7 */                 iZzj = zzj(i3, bArr, iZzj, zzqbVar);
/* 11 */                i3 = zzqbVar.zza;
                    }
/* 13 */            int i4 = iZzj;
/* 14 */            if (i3 < 0 || i3 > i2 - i4) {
/* 48 */                pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 51 */                return 0;
                    }
/* 21 */            int i5 = zzqbVar.zze + 1;
/* 23 */            zzqbVar.zze = i5;
/* 25 */            zzq(i5);
/* 28 */            int i6 = i4 + i3;
/* 34 */            zzugVar.zzi(obj, bArr, i4, i6, zzqbVar);
/* 41 */            zzqbVar.zze--;
/* 43 */            zzqbVar.zzc = obj;
/* 45 */            return i6;
                }

                public static int zzo(int i, byte[] bArr, int i2, int i3, zzqb zzqbVar) throws zzsx {
/* 6 */             if ((i >>> 3) == 0) {
/* 78 */                pk3.m7475k("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 8 */             int i4 = i & 7;
/* 10 */            if (i4 == 0) {
/* 73 */                return zzl(bArr, i2, zzqbVar);
                    }
/* 13 */            if (i4 == 1) {
/* 70 */                return i2 + 8;
                    }
/* 16 */            if (i4 == 2) {
/* 68 */                return zzi(bArr, i2, zzqbVar) + zzqbVar.zza;
                    }
/* 19 */            if (i4 != 3) {
/* 22 */                if (i4 == 5) {
/* 24 */                    return i2 + 4;
                        }
/* 27 */                pk3.m7475k("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 33 */            int i5 = (i & (-8)) | 4;
/* 35 */            int i6 = 0;
/* 36 */            while (i2 < i3) {
/* 38 */                i2 = zzi(bArr, i2, zzqbVar);
/* 42 */                i6 = zzqbVar.zza;
/* 44 */                if (i6 == i5) {
                            break;
                        }
/* 46 */                i2 = zzo(i6, bArr, i2, i3, zzqbVar);
                    }
/* 51 */            if (i2 <= i3 && i6 == i5) {
/* 55 */                return i2;
                    }
/* 58 */            pk3.m7475k("Failed to parse the message.");
/* 3 */             return 0;
                }

                public static long zzp(byte[] bArr, int i) {
/* 91 */            return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
                }

                private static void zzq(int i) throws zzsx {
/* 3 */             if (i < zzb) {
/* 5 */                 return;
                    }
/* 8 */             pk3.m7475k("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
            }
