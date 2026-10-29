            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     final class zznf {
                private static final zznh zzwt;

                static {
/* 30 */            zzwt = (zznd.zzfd() && zznd.zzfe() && !zzix.zzbr()) ? new zznk() : new zzni();
                }

                public static int zza(CharSequence charSequence) {
/* 1 */             int length = charSequence.length();
/* 5 */             int i = 0;
/* 6 */             int i2 = 0;
/* 7 */             while (i2 < length && charSequence.charAt(i2) < 128) {
/* 17 */                i2++;
                    }
/* 20 */            int i3 = length;
/* 21 */            while (i2 < length) {
/* 23 */                char cCharAt = charSequence.charAt(i2);
/* 29 */                if (cCharAt >= 2048) {
/* 39 */                    int length2 = charSequence.length();
/* 43 */                    while (i2 < length2) {
/* 45 */                        char cCharAt2 = charSequence.charAt(i2);
/* 49 */                        if (cCharAt2 < 2048) {
/* 55 */                            i += (127 - cCharAt2) >>> 31;
                                } else {
/* 57 */                            i += 2;
/* 62 */                            if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
/* 75 */                                if (Character.codePointAt(charSequence, i2) < 65536) {
/* 85 */                                    throw new zznj(i2, length2);
                                        }
/* 77 */                                i2++;
                                    }
                                }
/* 86 */                        i2++;
                            }
/* 89 */                    i3 += i;
                            break;
                        }
/* 35 */                i3 += (127 - cCharAt) >>> 31;
/* 36 */                i2++;
                    }
/* 90 */            if (i3 >= length) {
/* 92 */                return i3;
                    }
/* 106 */           StringBuilder sb = new StringBuilder(54);
/* 111 */           sb.append("UTF-8 length does not fit in int: ");
/* 114 */           sb.append(((long) i3) + 4294967296L);
/* 124 */           throw new IllegalArgumentException(sb.toString());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static int zzay(int i) {
/* 3 */             if (i > -12) {
/* 5 */                 return -1;
                    }
/* 6 */             return i;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static int zzc(int i, int i2, int i3) {
/* 3 */             if (i > -12 || i2 > -65 || i3 > -65) {
/* 19 */                return -1;
                    }
/* 17 */            return (i ^ (i2 << 8)) ^ (i3 << 16);
                }

                public static boolean zzd(byte[] bArr) {
/* 5 */             return zzwt.zze(bArr, 0, bArr.length);
                }

                public static boolean zze(byte[] bArr, int i, int i2) {
/* 3 */             return zzwt.zze(bArr, i, i2);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static int zzf(byte[] bArr, int i, int i2) {
/* 3 */             byte b = bArr[i - 1];
/* 5 */             int i3 = i2 - i;
/* 6 */             if (i3 == 0) {
/* 37 */                return zzay(b);
                    }
/* 9 */             if (i3 == 1) {
/* 32 */                return zzr(b, bArr[i]);
                    }
/* 12 */            if (i3 == 2) {
/* 19 */                return zzc(b, bArr[i], bArr[i + 1]);
                    }
/* 29 */            throw new AssertionError();
                }

                public static String zzg(byte[] bArr, int i, int i2) throws zzkq {
/* 3 */             return zzwt.zzg(bArr, i, i2);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static int zzr(int i, int i2) {
/* 3 */             if (i > -12 || i2 > -65) {
/* 14 */                return -1;
                    }
/* 12 */            return i ^ (i2 << 8);
                }

/* 124 */       public static int zza(CharSequence charSequence, byte[] bArr, int i, int i2) {
/* 125 */           return zzwt.zzb(charSequence, bArr, i, i2);
                }
            }
