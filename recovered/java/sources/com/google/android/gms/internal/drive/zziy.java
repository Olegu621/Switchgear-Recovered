            package com.google.android.gms.internal.drive;

            import java.io.IOException;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 27 */    final class zziy {
                public static int zza(int i, byte[] bArr, int i2, int i3, zzmy zzmyVar, zziz zzizVar) throws zzkq {
/* 3 */             if ((i >>> 3) == 0) {
/* 158 */               throw zzkq.zzdk();
                    }
/* 5 */             int i4 = i & 7;
/* 7 */             if (i4 == 0) {
/* 140 */               int iZzb = zzb(bArr, i2, zzizVar);
/* 150 */               zzmyVar.zzb(i, Long.valueOf(zzizVar.zznl));
/* 153 */               return iZzb;
                    }
/* 10 */            if (i4 == 1) {
/* 132 */               zzmyVar.zzb(i, Long.valueOf(zzb(bArr, i2)));
/* 135 */               return i2 + 8;
                    }
/* 13 */            if (i4 == 2) {
/* 84 */                int iZza = zza(bArr, i2, zzizVar);
/* 88 */                int i5 = zzizVar.zznk;
/* 90 */                if (i5 < 0) {
/* 122 */                   throw zzkq.zzdj();
                        }
/* 94 */                if (i5 > bArr.length - iZza) {
/* 117 */                   throw zzkq.zzdi();
                        }
/* 96 */                if (i5 == 0) {
/* 100 */                   zzmyVar.zzb(i, zzjc.zznq);
                        } else {
/* 108 */                   zzmyVar.zzb(i, zzjc.zzb(bArr, iZza, i5));
                        }
/* 111 */               return iZza + i5;
                    }
/* 16 */            if (i4 != 3) {
/* 19 */                if (i4 != 5) {
/* 39 */                    throw zzkq.zzdk();
                        }
/* 29 */                zzmyVar.zzb(i, Integer.valueOf(zza(bArr, i2)));
/* 32 */                return i2 + 4;
                    }
/* 40 */            zzmy zzmyVarZzfb = zzmy.zzfb();
/* 46 */            int i6 = (i & (-8)) | 4;
/* 48 */            int i7 = 0;
/* 49 */            while (i2 < i3) {
/* 51 */                int iZza2 = zza(bArr, i2, zzizVar);
/* 55 */                i7 = zzizVar.zznk;
/* 57 */                if (i7 == i6) {
/* 67 */                    i2 = iZza2;
                            break;
                        }
/* 62 */                i2 = zza(i7, bArr, iZza2, i3, zzmyVarZzfb, zzizVar);
                    }
/* 69 */            if (i2 > i3 || i7 != i6) {
/* 81 */                throw zzkq.zzdm();
                    }
/* 73 */            zzmyVar.zzb(i, zzmyVarZzfb);
/* 76 */            return i2;
                }

                public static long zzb(byte[] bArr, int i) {
/* 76 */            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
                }

                public static int zzc(byte[] bArr, int i, zziz zzizVar) throws zzkq {
/* 1 */             int iZza = zza(bArr, i, zzizVar);
/* 5 */             int i2 = zzizVar.zznk;
/* 7 */             if (i2 < 0) {
/* 31 */                throw zzkq.zzdj();
                    }
/* 9 */             if (i2 == 0) {
/* 13 */                zzizVar.zznm = HttpUrl.FRAGMENT_ENCODE_SET;
/* 15 */                return iZza;
                    }
/* 23 */            zzizVar.zznm = new String(bArr, iZza, i2, zzkm.UTF_8);
/* 25 */            return iZza + i2;
                }

                public static int zzd(byte[] bArr, int i, zziz zzizVar) throws zzkq {
/* 1 */             int iZza = zza(bArr, i, zzizVar);
/* 5 */             int i2 = zzizVar.zznk;
/* 7 */             if (i2 < 0) {
/* 28 */                throw zzkq.zzdj();
                    }
/* 9 */             if (i2 == 0) {
/* 13 */                zzizVar.zznm = HttpUrl.FRAGMENT_ENCODE_SET;
/* 15 */                return iZza;
                    }
/* 20 */            zzizVar.zznm = zznf.zzg(bArr, iZza, i2);
/* 22 */            return iZza + i2;
                }

                public static int zze(byte[] bArr, int i, zziz zzizVar) throws zzkq {
/* 1 */             int iZza = zza(bArr, i, zzizVar);
/* 5 */             int i2 = zzizVar.zznk;
/* 7 */             if (i2 < 0) {
/* 37 */                throw zzkq.zzdj();
                    }
/* 11 */            if (i2 > bArr.length - iZza) {
/* 32 */                throw zzkq.zzdi();
                    }
/* 13 */            if (i2 == 0) {
/* 17 */                zzizVar.zznm = zzjc.zznq;
/* 19 */                return iZza;
                    }
/* 24 */            zzizVar.zznm = zzjc.zzb(bArr, iZza, i2);
/* 26 */            return iZza + i2;
                }

/* 28 */        public static float zzd(byte[] bArr, int i) {
/* 29 */            return Float.intBitsToFloat(zza(bArr, i));
                }

/* 31 */        public static double zzc(byte[] bArr, int i) {
/* 32 */            return Double.longBitsToDouble(zzb(bArr, i));
                }

/* 77 */        public static int zzb(byte[] bArr, int i, zziz zzizVar) {
                    int i2 = i + 1;
/* 78 */            long j = bArr[i];
                    if (j >= 0) {
/* 79 */                zzizVar.zznl = j;
                        return i2;
                    }
                    int i3 = i + 2;
/* 80 */            byte b = bArr[i2];
                    long j2 = (j & 127) | (((long) (b & 127)) << 7);
                    int i4 = 7;
                    while (b < 0) {
                        int i5 = i3 + 1;
/* 81 */                byte b2 = bArr[i3];
                        i4 += 7;
                        j2 |= ((long) (b2 & 127)) << i4;
                        b = b2;
                        i3 = i5;
                    }
/* 82 */            zzizVar.zznl = j2;
                    return i3;
                }

/* 158 */       public static int zza(int i, byte[] bArr, int i2, zziz zzizVar) {
                    int i3 = i & 127;
                    int i4 = i2 + 1;
/* 159 */           byte b = bArr[i2];
                    if (b >= 0) {
/* 160 */               zzizVar.zznk = i3 | (b << 7);
                        return i4;
                    }
                    int i5 = i3 | ((b & 127) << 7);
                    int i6 = i2 + 2;
/* 161 */           byte b2 = bArr[i4];
                    if (b2 >= 0) {
/* 162 */               zzizVar.zznk = i5 | (b2 << 14);
                        return i6;
                    }
                    int i7 = i5 | ((b2 & 127) << 14);
                    int i8 = i2 + 3;
/* 163 */           byte b3 = bArr[i6];
                    if (b3 >= 0) {
/* 164 */               zzizVar.zznk = i7 | (b3 << 21);
                        return i8;
                    }
                    int i9 = i7 | ((b3 & 127) << 21);
                    int i10 = i2 + 4;
/* 165 */           byte b4 = bArr[i8];
                    if (b4 >= 0) {
/* 166 */               zzizVar.zznk = i9 | (b4 << 28);
                        return i10;
                    }
                    int i11 = i9 | ((b4 & 127) << 28);
                    while (true) {
                        int i12 = i10 + 1;
/* 167 */               if (bArr[i10] >= 0) {
/* 168 */                   zzizVar.zznk = i11;
                            return i12;
                        }
                        i10 = i12;
                    }
                }

/* 168 */       public static int zza(byte[] bArr, int i) {
                    return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
                }

/* 169 */       public static int zza(zzmf zzmfVar, byte[] bArr, int i, int i2, zziz zzizVar) throws IOException {
                    int iZza = i + 1;
/* 170 */           int i3 = bArr[i];
                    if (i3 < 0) {
/* 171 */               iZza = zza(i3, bArr, iZza, zzizVar);
/* 172 */               i3 = zzizVar.zznk;
                    }
                    int i4 = iZza;
                    if (i3 >= 0 && i3 <= i2 - i4) {
/* 173 */               Object objNewInstance = zzmfVar.newInstance();
                        int i5 = i4 + i3;
/* 174 */               zzmfVar.zza(objNewInstance, bArr, i4, i5, zzizVar);
/* 175 */               zzmfVar.zzd(objNewInstance);
/* 176 */               zzizVar.zznm = objNewInstance;
                        return i5;
                    }
/* 177 */           throw zzkq.zzdi();
                }

/* 177 */       public static int zza(zzmf zzmfVar, byte[] bArr, int i, int i2, int i3, zziz zzizVar) throws IOException {
/* 178 */           zzlu zzluVar = (zzlu) zzmfVar;
/* 179 */           Object objNewInstance = zzluVar.newInstance();
/* 180 */           int iZza = zzluVar.zza(objNewInstance, bArr, i, i2, i3, zzizVar);
/* 181 */           zzluVar.zzd(objNewInstance);
/* 182 */           zzizVar.zznm = objNewInstance;
                    return iZza;
                }

/* 182 */       public static int zza(int i, byte[] bArr, int i2, int i3, zzkp<?> zzkpVar, zziz zzizVar) {
/* 183 */           zzkl zzklVar = (zzkl) zzkpVar;
/* 184 */           int iZza = zza(bArr, i2, zzizVar);
/* 185 */           zzklVar.zzam(zzizVar.zznk);
                    while (iZza < i3) {
/* 186 */               int iZza2 = zza(bArr, iZza, zzizVar);
/* 187 */               if (i != zzizVar.zznk) {
                            break;
                        }
/* 188 */               iZza = zza(bArr, iZza2, zzizVar);
/* 189 */               zzklVar.zzam(zzizVar.zznk);
                    }
                    return iZza;
                }

/* 189 */       public static int zza(byte[] bArr, int i, zzkp<?> zzkpVar, zziz zzizVar) throws IOException {
/* 190 */           zzkl zzklVar = (zzkl) zzkpVar;
/* 191 */           int iZza = zza(bArr, i, zzizVar);
/* 192 */           int i2 = zzizVar.zznk + iZza;
                    while (iZza < i2) {
/* 193 */               iZza = zza(bArr, iZza, zzizVar);
/* 194 */               zzklVar.zzam(zzizVar.zznk);
                    }
                    if (iZza == i2) {
                        return iZza;
                    }
/* 195 */           throw zzkq.zzdi();
                }

/* 195 */       public static int zza(zzmf<?> zzmfVar, int i, byte[] bArr, int i2, int i3, zzkp<?> zzkpVar, zziz zzizVar) throws IOException {
/* 196 */           int iZza = zza(zzmfVar, bArr, i2, i3, zzizVar);
/* 197 */           zzkpVar.add(zzizVar.zznm);
                    while (iZza < i3) {
/* 198 */               int iZza2 = zza(bArr, iZza, zzizVar);
/* 199 */               if (i != zzizVar.zznk) {
                            break;
                        }
/* 200 */               iZza = zza(zzmfVar, bArr, iZza2, i3, zzizVar);
/* 201 */               zzkpVar.add(zzizVar.zznm);
                    }
                    return iZza;
                }

/* 201 */       public static int zza(byte[] bArr, int i, zziz zzizVar) {
                    int i2 = i + 1;
/* 202 */           byte b = bArr[i];
                    if (b >= 0) {
/* 203 */               zzizVar.zznk = b;
                        return i2;
                    }
/* 204 */           return zza(b, bArr, i2, zzizVar);
                }

/* 204 */       public static int zza(int i, byte[] bArr, int i2, int i3, zziz zzizVar) throws zzkq {
                    if ((i >>> 3) == 0) {
/* 213 */               throw zzkq.zzdk();
                    }
                    int i4 = i & 7;
                    if (i4 == 0) {
/* 212 */               return zzb(bArr, i2, zzizVar);
                    }
                    if (i4 == 1) {
                        return i2 + 8;
                    }
                    if (i4 == 2) {
/* 211 */               return zza(bArr, i2, zzizVar) + zzizVar.zznk;
                    }
                    if (i4 != 3) {
                        if (i4 == 5) {
                            return i2 + 4;
                        }
/* 205 */               throw zzkq.zzdk();
                    }
                    int i5 = (i & (-8)) | 4;
                    int i6 = 0;
                    while (i2 < i3) {
/* 206 */               i2 = zza(bArr, i2, zzizVar);
/* 207 */               i6 = zzizVar.zznk;
                        if (i6 == i5) {
                            break;
                        }
/* 208 */               i2 = zza(i6, bArr, i2, i3, zzizVar);
                    }
                    if (i2 > i3 || i6 != i5) {
/* 209 */               throw zzkq.zzdm();
                    }
                    return i2;
                }
            }
