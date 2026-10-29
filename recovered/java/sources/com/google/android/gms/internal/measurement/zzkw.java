            package com.google.android.gms.internal.measurement;

            import io.sentry.C1697u2;
            import java.io.IOException;
            import okhttp3.HttpUrl;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzkw {
                public static final /* synthetic */ int zza = 0;
                private static volatile int zzb = 100;

                public static int zza(byte[] bArr, int i, zzkv zzkvVar) {
/* 1 */             int i2 = i + 1;
/* 3 */             byte b = bArr[i];
/* 5 */             if (b < 0) {
/* 10 */                return zzb(b, bArr, i2, zzkvVar);
                    }
/* 7 */             zzkvVar.zza = b;
/* 9 */             return i2;
                }

                public static int zzb(int i, byte[] bArr, int i2, zzkv zzkvVar) {
/* 1 */             byte b = bArr[i2];
/* 3 */             int i3 = i2 + 1;
/* 5 */             int i4 = i & 127;
/* 7 */             if (b >= 0) {
/* 12 */                zzkvVar.zza = i4 | (b << 7);
/* 14 */                return i3;
                    }
/* 19 */            int i5 = i4 | ((b & 127) << 7);
/* 20 */            int i6 = i2 + 2;
/* 22 */            byte b2 = bArr[i3];
/* 24 */            if (b2 >= 0) {
/* 29 */                zzkvVar.zza = i5 | (b2 << 14);
/* 31 */                return i6;
                    }
/* 36 */            int i7 = i5 | ((b2 & 127) << 14);
/* 37 */            int i8 = i2 + 3;
/* 39 */            byte b3 = bArr[i6];
/* 41 */            if (b3 >= 0) {
/* 46 */                zzkvVar.zza = i7 | (b3 << 21);
/* 48 */                return i8;
                    }
/* 53 */            int i9 = i7 | ((b3 & 127) << 21);
/* 54 */            int i10 = i2 + 4;
/* 56 */            byte b4 = bArr[i8];
/* 58 */            if (b4 >= 0) {
/* 63 */                zzkvVar.zza = i9 | (b4 << 28);
/* 65 */                return i10;
                    }
/* 70 */            int i11 = i9 | ((b4 & 127) << 28);
                    while (true) {
/* 71 */                int i12 = i10 + 1;
/* 75 */                if (bArr[i10] >= 0) {
/* 79 */                    zzkvVar.zza = i11;
/* 81 */                    return i12;
                        }
/* 77 */                i10 = i12;
                    }
                }

                public static int zzc(byte[] bArr, int i, zzkv zzkvVar) {
/* 1 */             long j = bArr[i];
/* 8 */             int i2 = i + 1;
/* 10 */            if (j >= 0) {
/* 12 */                zzkvVar.zzb = j;
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
/* 45 */            zzkvVar.zzb = j2;
/* 47 */            return i3;
                }

                public static int zzd(byte[] bArr, int i) {
/* 3 */             int i2 = bArr[i] & 255;
/* 9 */             int i3 = bArr[i + 1] & 255;
/* 15 */            int i4 = bArr[i + 2] & 255;
/* 31 */            return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
                }

                public static long zze(byte[] bArr, int i) {
/* 91 */            return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
                }

                public static int zzf(byte[] bArr, int i, zzkv zzkvVar) throws zzmq {
                    int i2;
/* 1 */             int iZza = zza(bArr, i, zzkvVar);
/* 5 */             int i3 = zzkvVar.zza;
/* 8 */             if (i3 < 0) {
/* 200 */               pk3.m7472h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 7 */                 return 0;
                    }
/* 10 */            if (i3 == 0) {
/* 14 */                zzkvVar.zzc = HttpUrl.FRAGMENT_ENCODE_SET;
/* 16 */                return iZza;
                    }
/* 17 */            int i4 = zzor.zza;
/* 19 */            int length = bArr.length;
/* 26 */            if ((((length - iZza) - i3) | iZza | i3) < 0) {
/* 194 */               C1697u2.m5440p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iZza), Integer.valueOf(i3)});
/* 7 */                 return 0;
                    }
/* 28 */            int i5 = iZza + i3;
/* 30 */            char[] cArr = new char[i3];
/* 32 */            int i6 = 0;
/* 33 */            while (iZza < i5) {
/* 35 */                byte b = bArr[iZza];
/* 41 */                if (!zzop.zza(b)) {
                            break;
                        }
/* 43 */                iZza++;
/* 48 */                cArr[i6] = (char) b;
/* 45 */                i6++;
                    }
/* 52 */            int i7 = i6;
/* 53 */            while (iZza < i5) {
/* 55 */                int i8 = iZza + 1;
/* 57 */                byte b2 = bArr[iZza];
/* 63 */                if (zzop.zza(b2)) {
/* 68 */                    cArr[i7] = (char) b2;
/* 65 */                    i7++;
/* 71 */                    iZza = i8;
/* 72 */                    while (iZza < i5) {
/* 74 */                        byte b3 = bArr[iZza];
/* 80 */                        if (!zzop.zza(b3)) {
                                    break;
                                }
/* 82 */                        iZza++;
/* 87 */                        cArr[i7] = (char) b3;
/* 84 */                        i7++;
                            }
                        } else {
/* 95 */                    if (b2 < -32) {
/* 97 */                        if (i8 >= i5) {
/* 110 */                           pk3.m7472h("Protocol message had invalid UTF-8.");
/* 7 */                             return 0;
                                }
/* 99 */                        i2 = i7 + 1;
/* 101 */                       iZza += 2;
/* 105 */                       zzop.zzb(b2, bArr[i8], cArr, i7);
                            } else if (b2 < -16) {
/* 120 */                       if (i8 >= i5 - 1) {
/* 136 */                           pk3.m7472h("Protocol message had invalid UTF-8.");
/* 7 */                             return 0;
                                }
/* 122 */                       i2 = i7 + 1;
/* 124 */                       int i9 = iZza + 2;
/* 128 */                       iZza += 3;
/* 132 */                       zzop.zzc(b2, bArr[i8], bArr[i9], cArr, i7);
                            } else {
/* 142 */                       if (i8 >= i5 - 2) {
/* 164 */                           pk3.m7472h("Protocol message had invalid UTF-8.");
/* 7 */                             return 0;
                                }
/* 146 */                       byte b4 = bArr[i8];
/* 148 */                       int i10 = iZza + 3;
/* 150 */                       byte b5 = bArr[iZza + 2];
/* 152 */                       iZza += 4;
/* 158 */                       zzop.zzd(b2, b4, b5, bArr[i10], cArr, i7);
/* 161 */                       i7 += 2;
                            }
/* 108 */                   i7 = i2;
                        }
                    }
/* 173 */           zzkvVar.zzc = new String(cArr, 0, i7);
/* 175 */           return i5;
                }

                public static int zzg(byte[] bArr, int i, zzkv zzkvVar) throws zzmq {
/* 1 */             int iZza = zza(bArr, i, zzkvVar);
/* 5 */             int i2 = zzkvVar.zza;
/* 8 */             if (i2 < 0) {
/* 37 */                pk3.m7472h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 7 */                 return 0;
                    }
/* 12 */            if (i2 > bArr.length - iZza) {
/* 31 */                pk3.m7472h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 7 */                 return 0;
                    }
/* 14 */            if (i2 == 0) {
/* 18 */                zzkvVar.zzc = zzlg.zzb;
/* 20 */                return iZza;
                    }
/* 25 */            zzkvVar.zzc = zzlg.zzh(bArr, iZza, i2);
/* 27 */            return iZza + i2;
                }

                public static int zzh(zznw zznwVar, byte[] bArr, int i, int i2, zzkv zzkvVar) throws IOException {
/* 1 */             Object objZza = zznwVar.zza();
/* 10 */            int iZzj = zzj(objZza, zznwVar, bArr, i, i2, zzkvVar);
/* 14 */            zznwVar.zzj(objZza);
/* 17 */            zzkvVar.zzc = objZza;
/* 19 */            return iZzj;
                }

                public static int zzi(zznw zznwVar, byte[] bArr, int i, int i2, int i3, zzkv zzkvVar) throws IOException {
/* 1 */             Object objZza = zznwVar.zza();
/* 11 */            int iZzk = zzk(objZza, zznwVar, bArr, i, i2, i3, zzkvVar);
/* 15 */            zznwVar.zzj(objZza);
/* 18 */            zzkvVar.zzc = objZza;
/* 20 */            return iZzk;
                }

                public static int zzj(Object obj, zznw zznwVar, byte[] bArr, int i, int i2, zzkv zzkvVar) throws IOException {
/* 1 */             int iZzb = i + 1;
/* 3 */             int i3 = bArr[i];
/* 5 */             if (i3 < 0) {
/* 7 */                 iZzb = zzb(i3, bArr, iZzb, zzkvVar);
/* 11 */                i3 = zzkvVar.zza;
                    }
/* 13 */            int i4 = iZzb;
/* 14 */            if (i3 < 0 || i3 > i2 - i4) {
/* 48 */                pk3.m7472h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 51 */                return 0;
                    }
/* 21 */            int i5 = zzkvVar.zze + 1;
/* 23 */            zzkvVar.zze = i5;
/* 25 */            zzq(i5);
/* 28 */            int i6 = i4 + i3;
/* 34 */            zznwVar.zzi(obj, bArr, i4, i6, zzkvVar);
/* 41 */            zzkvVar.zze--;
/* 43 */            zzkvVar.zzc = obj;
/* 45 */            return i6;
                }

                public static int zzk(Object obj, zznw zznwVar, byte[] bArr, int i, int i2, int i3, zzkv zzkvVar) throws IOException {
/* 5 */             int i4 = zzkvVar.zze + 1;
/* 7 */             zzkvVar.zze = i4;
/* 9 */             zzq(i4);
/* 15 */            int iZzh = ((zzno) zznwVar).zzh(obj, bArr, i, i2, i3, zzkvVar);
/* 23 */            zzkvVar.zze--;
/* 25 */            zzkvVar.zzc = obj;
/* 27 */            return iZzh;
                }

                public static int zzl(int i, byte[] bArr, int i2, int i3, zzmn zzmnVar, zzkv zzkvVar) {
/* 1 */             zzmf zzmfVar = (zzmf) zzmnVar;
/* 3 */             int iZza = zza(bArr, i2, zzkvVar);
/* 9 */             zzmfVar.zzh(zzkvVar.zza);
/* 12 */            while (iZza < i3) {
/* 14 */                int iZza2 = zza(bArr, iZza, zzkvVar);
/* 20 */                if (i != zzkvVar.zza) {
                            break;
                        }
/* 23 */                iZza = zza(bArr, iZza2, zzkvVar);
/* 29 */                zzmfVar.zzh(zzkvVar.zza);
                    }
/* 33 */            return iZza;
                }

                public static int zzm(byte[] bArr, int i, zzmn zzmnVar, zzkv zzkvVar) throws IOException {
/* 1 */             zzmf zzmfVar = (zzmf) zzmnVar;
/* 3 */             int iZza = zza(bArr, i, zzkvVar);
/* 9 */             int i2 = zzkvVar.zza + iZza;
/* 10 */            while (iZza < i2) {
/* 12 */                iZza = zza(bArr, iZza, zzkvVar);
/* 18 */                zzmfVar.zzh(zzkvVar.zza);
                    }
/* 22 */            if (iZza == i2) {
/* 24 */                return iZza;
                    }
/* 27 */            pk3.m7472h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 30 */            return 0;
                }

                public static int zzn(zznw zznwVar, int i, byte[] bArr, int i2, int i3, zzmn zzmnVar, zzkv zzkvVar) throws IOException {
/* 1 */             int iZzh = zzh(zznwVar, bArr, i2, i3, zzkvVar);
/* 7 */             zzmnVar.add(zzkvVar.zzc);
/* 10 */            while (iZzh < i3) {
/* 12 */                int iZza = zza(bArr, iZzh, zzkvVar);
/* 18 */                if (i != zzkvVar.zza) {
                            break;
                        }
/* 21 */                iZzh = zzh(zznwVar, bArr, iZza, i3, zzkvVar);
/* 27 */                zzmnVar.add(zzkvVar.zzc);
                    }
/* 31 */            return iZzh;
                }

                public static int zzo(int i, byte[] bArr, int i2, int i3, zzoi zzoiVar, zzkv zzkvVar) throws zzmq {
/* 6 */             if ((i >>> 3) == 0) {
/* 177 */               pk3.m7472h("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 8 */             int i4 = i & 7;
/* 10 */            if (i4 == 0) {
/* 163 */               int iZzc = zzc(bArr, i2, zzkvVar);
/* 173 */               zzoiVar.zzk(i, Long.valueOf(zzkvVar.zzb));
/* 176 */               return iZzc;
                    }
/* 13 */            if (i4 == 1) {
/* 155 */               zzoiVar.zzk(i, Long.valueOf(zze(bArr, i2)));
/* 158 */               return i2 + 8;
                    }
/* 16 */            if (i4 == 2) {
/* 105 */               int iZza = zza(bArr, i2, zzkvVar);
/* 109 */               int i5 = zzkvVar.zza;
/* 111 */               if (i5 < 0) {
/* 142 */                   pk3.m7472h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
/* 3 */                     return 0;
                        }
/* 115 */               if (i5 > bArr.length - iZza) {
/* 136 */                   pk3.m7472h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 3 */                     return 0;
                        }
/* 117 */               if (i5 == 0) {
/* 121 */                   zzoiVar.zzk(i, zzlg.zzb);
                        } else {
/* 129 */                   zzoiVar.zzk(i, zzlg.zzh(bArr, iZza, i5));
                        }
/* 132 */               return iZza + i5;
                    }
/* 19 */            if (i4 != 3) {
/* 22 */                if (i4 == 5) {
/* 32 */                    zzoiVar.zzk(i, Integer.valueOf(zzd(bArr, i2)));
/* 35 */                    return i2 + 4;
                        }
/* 38 */                pk3.m7472h("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 44 */            int i6 = (i & (-8)) | 4;
/* 46 */            zzoi zzoiVarZzb = zzoi.zzb();
/* 52 */            int i7 = zzkvVar.zze + 1;
/* 53 */            zzkvVar.zze = i7;
/* 55 */            zzq(i7);
/* 58 */            int i8 = 0;
/* 59 */            while (i2 < i3) {
/* 61 */                int iZza2 = zza(bArr, i2, zzkvVar);
/* 65 */                int i9 = zzkvVar.zza;
/* 67 */                if (i9 == i6) {
/* 69 */                    i8 = i9;
/* 70 */                    i2 = iZza2;
                            break;
                        }
/* 77 */                i2 = zzo(i9, bArr, iZza2, i3, zzoiVarZzb, zzkvVar);
/* 81 */                i8 = i9;
                    }
/* 87 */            zzkvVar.zze--;
/* 89 */            if (i2 > i3 || i8 != i6) {
/* 99 */                pk3.m7472h("Failed to parse the message.");
/* 3 */                 return 0;
                    }
/* 93 */            zzoiVar.zzk(i, zzoiVarZzb);
/* 96 */            return i2;
                }

                public static int zzp(int i, byte[] bArr, int i2, int i3, zzkv zzkvVar) throws zzmq {
/* 6 */             if ((i >>> 3) == 0) {
/* 78 */                pk3.m7472h("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 8 */             int i4 = i & 7;
/* 10 */            if (i4 == 0) {
/* 73 */                return zzc(bArr, i2, zzkvVar);
                    }
/* 13 */            if (i4 == 1) {
/* 70 */                return i2 + 8;
                    }
/* 16 */            if (i4 == 2) {
/* 68 */                return zza(bArr, i2, zzkvVar) + zzkvVar.zza;
                    }
/* 19 */            if (i4 != 3) {
/* 22 */                if (i4 == 5) {
/* 24 */                    return i2 + 4;
                        }
/* 27 */                pk3.m7472h("Protocol message contained an invalid tag (zero).");
/* 3 */                 return 0;
                    }
/* 33 */            int i5 = (i & (-8)) | 4;
/* 35 */            int i6 = 0;
/* 36 */            while (i2 < i3) {
/* 38 */                i2 = zza(bArr, i2, zzkvVar);
/* 42 */                i6 = zzkvVar.zza;
/* 44 */                if (i6 == i5) {
                            break;
                        }
/* 46 */                i2 = zzp(i6, bArr, i2, i3, zzkvVar);
                    }
/* 51 */            if (i2 <= i3 && i6 == i5) {
/* 55 */                return i2;
                    }
/* 58 */            pk3.m7472h("Failed to parse the message.");
/* 3 */             return 0;
                }

                private static void zzq(int i) throws zzmq {
/* 3 */             if (i < zzb) {
/* 5 */                 return;
                    }
/* 8 */             pk3.m7472h("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
            }
