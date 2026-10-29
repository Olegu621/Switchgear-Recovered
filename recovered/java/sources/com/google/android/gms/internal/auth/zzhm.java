            package com.google.android.gms.internal.auth;

            import io.sentry.C1697u2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzhm {
                private static final zzhk zza;

                static {
/* 5 */             if (zzhi.zzu() && zzhi.zzv()) {
/* 13 */                int i = zzdr.zza;
                    }
/* 20 */            zza = new zzhl();
                }

                public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i2) {
/* 3 */             byte b = bArr[i - 1];
/* 5 */             int i3 = i2 - i;
/* 9 */             if (i3 == 0) {
/* 57 */                if (b > -12) {
/* 8 */                     return -1;
                        }
/* 60 */                return b;
                    }
/* 14 */            if (i3 == 1) {
/* 45 */                byte b2 = bArr[i];
/* 47 */                if (b > -12 || b2 > -65) {
/* 8 */                     return -1;
                        }
/* 54 */                return (b2 << 8) ^ b;
                    }
/* 17 */            if (i3 != 2) {
/* 44 */                throw new AssertionError();
                    }
/* 19 */            byte b3 = bArr[i];
/* 22 */            byte b4 = bArr[i + 1];
/* 24 */            if (b > -12 || b3 > -65 || b4 > -65) {
/* 8 */                 return -1;
                    }
/* 36 */            return (b4 << 16) ^ ((b3 << 8) ^ b);
                }

                public static String zzb(byte[] bArr, int i, int i2) throws zzfa {
/* 1 */             int length = bArr.length;
/* 8 */             if ((i | i2 | ((length - i) - i2)) < 0) {
/* 178 */               C1697u2.m5440p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)});
/* 181 */               return null;
                    }
/* 10 */            int i3 = i + i2;
/* 12 */            char[] cArr = new char[i2];
/* 15 */            int i4 = 0;
/* 16 */            while (i < i3) {
/* 18 */                byte b = bArr[i];
/* 24 */                if (!zzhj.zzd(b)) {
                            break;
                        }
/* 27 */                i++;
/* 32 */                cArr[i4] = (char) b;
/* 29 */                i4++;
                    }
/* 36 */            int i5 = i4;
/* 37 */            while (i < i3) {
/* 39 */                int i6 = i + 1;
/* 42 */                byte b2 = bArr[i];
/* 48 */                if (zzhj.zzd(b2)) {
/* 53 */                    cArr[i5] = (char) b2;
/* 50 */                    i5++;
/* 56 */                    i = i6;
/* 57 */                    while (i < i3) {
/* 59 */                        byte b3 = bArr[i];
/* 65 */                        if (!zzhj.zzd(b3)) {
                                    break;
                                }
/* 68 */                        i++;
/* 73 */                        cArr[i5] = (char) b3;
/* 70 */                        i5++;
                            }
                        } else if (b2 < -32) {
/* 81 */                    if (i6 >= i3) {
/* 98 */                        throw zzfa.zzb();
                            }
/* 83 */                    i += 2;
/* 89 */                    zzhj.zzc(b2, bArr[i6], cArr, i5);
/* 85 */                    i5++;
                        } else if (b2 < -16) {
/* 105 */                   if (i6 >= i3 - 1) {
/* 126 */                       throw zzfa.zzb();
                            }
/* 107 */                   int i7 = i + 2;
/* 109 */                   i += 3;
/* 117 */                   zzhj.zzb(b2, bArr[i6], bArr[i7], cArr, i5);
/* 111 */                   i5++;
                        } else {
/* 129 */                   if (i6 >= i3 - 2) {
/* 153 */                       throw zzfa.zzb();
                            }
/* 131 */                   int i8 = i + 2;
/* 133 */                   int i9 = i + 3;
/* 135 */                   i += 4;
/* 143 */                   zzhj.zza(b2, bArr[i6], bArr[i8], bArr[i9], cArr, i5);
/* 146 */                   i5 += 2;
                        }
                    }
/* 156 */           return new String(cArr, 0, i5);
                }

                public static boolean zzc(byte[] bArr) {
/* 5 */             return zza.zzb(bArr, 0, bArr.length);
                }

                public static boolean zzd(byte[] bArr, int i, int i2) {
/* 3 */             return zza.zzb(bArr, i, i2);
                }
            }
