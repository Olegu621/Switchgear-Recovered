            package com.google.android.gms.internal.play_billing;

            import io.sentry.C1697u2;
            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzga {
                public static final /* synthetic */ int zza = 0;
                private static volatile int zzb = 100;

                public static int zza(byte[] bArr, int i, zzfz zzfzVar) throws zzhr {
/* 1 */             int iZzh = zzh(bArr, i, zzfzVar);
/* 5 */             int i2 = zzfzVar.zza;
/* 8 */             if (i2 < 0) {
/* 37 */                C1697u2.m5436l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 7 */                 return 0;
                    }
/* 12 */            if (i2 > bArr.length - iZzh) {
/* 31 */                C1697u2.m5436l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 7 */                 return 0;
                    }
/* 14 */            if (i2 == 0) {
/* 18 */                zzfzVar.zzc = zzgk.zzb;
/* 20 */                return iZzh;
                    }
/* 25 */            zzfzVar.zzc = zzgk.zzj(bArr, iZzh, i2);
/* 27 */            return iZzh + i2;
                }

                public static int zzb(byte[] bArr, int i) {
/* 3 */             int i2 = bArr[i] & 255;
/* 9 */             int i3 = bArr[i + 1] & 255;
/* 15 */            int i4 = bArr[i + 2] & 255;
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
                }

                public static int zzc(zzix zzixVar, byte[] bArr, int i, int i2, int i3, zzfz zzfzVar) throws IOException {
/* 1 */             Object objZze = zzixVar.zze();
/* 11 */            int iZzl = zzl(objZze, zzixVar, bArr, i, i2, i3, zzfzVar);
/* 15 */            zzixVar.zzf(objZze);
/* 18 */            zzfzVar.zzc = objZze;
/* 20 */            return iZzl;
                }

                public static int zzd(zzix zzixVar, byte[] bArr, int i, int i2, zzfz zzfzVar) throws IOException {
/* 1 */             Object objZze = zzixVar.zze();
/* 10 */            int iZzm = zzm(objZze, zzixVar, bArr, i, i2, zzfzVar);
/* 14 */            zzixVar.zzf(objZze);
/* 17 */            zzfzVar.zzc = objZze;
/* 19 */            return iZzm;
                }

                public static int zze(zzix zzixVar, int i, byte[] bArr, int i2, int i3, zzho zzhoVar, zzfz zzfzVar) throws IOException {
/* 1 */             int iZzd = zzd(zzixVar, bArr, i2, i3, zzfzVar);
/* 7 */             zzhoVar.add(zzfzVar.zzc);
/* 10 */            while (iZzd < i3) {
/* 12 */                int iZzh = zzh(bArr, iZzd, zzfzVar);
/* 18 */                if (i != zzfzVar.zza) {
                            break;
                        }
/* 21 */                iZzd = zzd(zzixVar, bArr, iZzh, i3, zzfzVar);
/* 27 */                zzhoVar.add(zzfzVar.zzc);
                    }
/* 31 */            return iZzd;
                }

                public static int zzf(byte[] bArr, int i, zzho zzhoVar, zzfz zzfzVar) throws IOException {
/* 1 */             zzhl zzhlVar = (zzhl) zzhoVar;
/* 3 */             int iZzh = zzh(bArr, i, zzfzVar);
/* 9 */             int i2 = zzfzVar.zza + iZzh;
/* 10 */            while (iZzh < i2) {
/* 12 */                iZzh = zzh(bArr, iZzh, zzfzVar);
/* 18 */                zzhlVar.zzg(zzfzVar.zza);
                    }
/* 22 */            if (iZzh == i2) {
/* 24 */                return iZzh;
                    }
/* 27 */            C1697u2.m5436l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 30 */            return 0;
                }

                public static int zzg(int i, byte[] bArr, int i2, int i3, zzjk zzjkVar, zzfz zzfzVar) throws zzhr {
/* 6 */             if ((i >>> 3) == 0) {
/* 177 */               C1697u2.m5436l("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 8 */             int i4 = i & 7;
/* 10 */            if (i4 == 0) {
/* 163 */               int iZzk = zzk(bArr, i2, zzfzVar);
/* 173 */               zzjkVar.zzj(i, Long.valueOf(zzfzVar.zzb));
/* 176 */               return iZzk;
                    }
/* 13 */            if (i4 == 1) {
/* 155 */               zzjkVar.zzj(i, Long.valueOf(zzn(bArr, i2)));
/* 158 */               return i2 + 8;
                    }
/* 16 */            if (i4 == 2) {
/* 105 */               int iZzh = zzh(bArr, i2, zzfzVar);
/* 109 */               int i5 = zzfzVar.zza;
/* 111 */               if (i5 < 0) {
/* 142 */                   C1697u2.m5436l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 3 */                     return 0;
                        }
/* 115 */               if (i5 > bArr.length - iZzh) {
/* 136 */                   C1697u2.m5436l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 3 */                     return 0;
                        }
/* 117 */               if (i5 == 0) {
/* 121 */                   zzjkVar.zzj(i, zzgk.zzb);
                        } else {
/* 129 */                   zzjkVar.zzj(i, zzgk.zzj(bArr, iZzh, i5));
                        }
/* 132 */               return iZzh + i5;
                    }
/* 19 */            if (i4 != 3) {
/* 22 */                if (i4 == 5) {
/* 32 */                    zzjkVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
/* 35 */                    return i2 + 4;
                        }
/* 38 */                C1697u2.m5436l("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 44 */            int i6 = (i & (-8)) | 4;
/* 46 */            zzjk zzjkVarZzf = zzjk.zzf();
/* 52 */            int i7 = zzfzVar.zze + 1;
/* 53 */            zzfzVar.zze = i7;
/* 55 */            zzo(i7);
/* 58 */            int i8 = 0;
/* 59 */            while (i2 < i3) {
/* 61 */                int iZzh2 = zzh(bArr, i2, zzfzVar);
/* 65 */                int i9 = zzfzVar.zza;
/* 67 */                if (i9 == i6) {
/* 69 */                    i8 = i9;
/* 70 */                    i2 = iZzh2;
                            break;
                        }
/* 77 */                i2 = zzg(i9, bArr, iZzh2, i3, zzjkVarZzf, zzfzVar);
/* 81 */                i8 = i9;
                    }
/* 87 */            zzfzVar.zze--;
/* 89 */            if (i2 > i3 || i8 != i6) {
/* 99 */                C1697u2.m5436l("Failed to parse the message.");
/* 3 */                 return 0;
                    }
/* 93 */            zzjkVar.zzj(i, zzjkVarZzf);
/* 96 */            return i2;
                }

                public static int zzh(byte[] bArr, int i, zzfz zzfzVar) {
/* 1 */             int i2 = i + 1;
/* 3 */             byte b = bArr[i];
/* 5 */             if (b < 0) {
/* 10 */                return zzi(b, bArr, i2, zzfzVar);
                    }
/* 7 */             zzfzVar.zza = b;
/* 9 */             return i2;
                }

                public static int zzi(int i, byte[] bArr, int i2, zzfz zzfzVar) {
/* 1 */             byte b = bArr[i2];
/* 3 */             int i3 = i2 + 1;
/* 5 */             int i4 = i & 127;
/* 7 */             if (b >= 0) {
/* 12 */                zzfzVar.zza = i4 | (b << 7);
/* 14 */                return i3;
                    }
/* 19 */            int i5 = i4 | ((b & 127) << 7);
/* 20 */            int i6 = i2 + 2;
/* 22 */            byte b2 = bArr[i3];
/* 24 */            if (b2 >= 0) {
/* 29 */                zzfzVar.zza = i5 | (b2 << 14);
/* 31 */                return i6;
                    }
/* 36 */            int i7 = i5 | ((b2 & 127) << 14);
/* 37 */            int i8 = i2 + 3;
/* 39 */            byte b3 = bArr[i6];
/* 41 */            if (b3 >= 0) {
/* 46 */                zzfzVar.zza = i7 | (b3 << 21);
/* 48 */                return i8;
                    }
/* 53 */            int i9 = i7 | ((b3 & 127) << 21);
/* 54 */            int i10 = i2 + 4;
/* 56 */            byte b4 = bArr[i8];
/* 58 */            if (b4 >= 0) {
/* 63 */                zzfzVar.zza = i9 | (b4 << 28);
/* 65 */                return i10;
                    }
/* 70 */            int i11 = i9 | ((b4 & 127) << 28);
                    while (true) {
/* 71 */                int i12 = i10 + 1;
/* 75 */                if (bArr[i10] >= 0) {
/* 79 */                    zzfzVar.zza = i11;
/* 81 */                    return i12;
                        }
/* 77 */                i10 = i12;
                    }
                }

                public static int zzj(int i, byte[] bArr, int i2, int i3, zzho zzhoVar, zzfz zzfzVar) {
/* 1 */             zzhl zzhlVar = (zzhl) zzhoVar;
/* 3 */             int iZzh = zzh(bArr, i2, zzfzVar);
/* 9 */             zzhlVar.zzg(zzfzVar.zza);
/* 12 */            while (iZzh < i3) {
/* 14 */                int iZzh2 = zzh(bArr, iZzh, zzfzVar);
/* 20 */                if (i != zzfzVar.zza) {
                            break;
                        }
/* 23 */                iZzh = zzh(bArr, iZzh2, zzfzVar);
/* 29 */                zzhlVar.zzg(zzfzVar.zza);
                    }
/* 33 */            return iZzh;
                }

                public static int zzk(byte[] bArr, int i, zzfz zzfzVar) {
/* 1 */             long j = bArr[i];
/* 8 */             int i2 = i + 1;
/* 10 */            if (j >= 0) {
/* 12 */                zzfzVar.zzb = j;
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
/* 45 */            zzfzVar.zzb = j2;
/* 47 */            return i3;
                }

                public static int zzl(Object obj, zzix zzixVar, byte[] bArr, int i, int i2, int i3, zzfz zzfzVar) throws IOException {
/* 5 */             int i4 = zzfzVar.zze + 1;
/* 7 */             zzfzVar.zze = i4;
/* 9 */             zzo(i4);
/* 15 */            int iZzc = ((zzip) zzixVar).zzc(obj, bArr, i, i2, i3, zzfzVar);
/* 23 */            zzfzVar.zze--;
/* 25 */            zzfzVar.zzc = obj;
/* 27 */            return iZzc;
                }

                public static int zzm(Object obj, zzix zzixVar, byte[] bArr, int i, int i2, zzfz zzfzVar) throws IOException {
/* 1 */             int iZzi = i + 1;
/* 3 */             int i3 = bArr[i];
/* 5 */             if (i3 < 0) {
/* 7 */                 iZzi = zzi(i3, bArr, iZzi, zzfzVar);
/* 11 */                i3 = zzfzVar.zza;
                    }
/* 13 */            int i4 = iZzi;
/* 14 */            if (i3 < 0 || i3 > i2 - i4) {
/* 48 */                C1697u2.m5436l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 51 */                return 0;
                    }
/* 21 */            int i5 = zzfzVar.zze + 1;
/* 23 */            zzfzVar.zze = i5;
/* 25 */            zzo(i5);
/* 28 */            int i6 = i4 + i3;
/* 34 */            zzixVar.zzh(obj, bArr, i4, i6, zzfzVar);
/* 41 */            zzfzVar.zze--;
/* 43 */            zzfzVar.zzc = obj;
/* 45 */            return i6;
                }

                public static long zzn(byte[] bArr, int i) {
/* 91 */            return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
                }

                private static void zzo(int i) throws zzhr {
/* 3 */             if (i < zzb) {
/* 5 */                 return;
                    }
/* 8 */             C1697u2.m5436l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
            }
