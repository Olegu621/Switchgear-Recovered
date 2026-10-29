            package com.google.android.gms.internal.auth;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzhl extends zzhk {
                @Override // com.google.android.gms.internal.auth.zzhk
                public final int zza(int i, byte[] bArr, int i2, int i3) {
/* 1 */             while (i2 < i3 && bArr[i2] >= 0) {
/* 7 */                 i2++;
                    }
/* 11 */            if (i2 >= i3) {
/* 10 */                return 0;
                    }
/* 14 */            while (i2 < i3) {
/* 17 */                int i4 = i2 + 1;
/* 19 */                byte b = bArr[i2];
/* 21 */                if (b >= 0) {
/* 123 */                   i2 = i4;
                        } else {
/* 28 */                    if (b < -32) {
/* 30 */                        if (i4 >= i3) {
/* 43 */                            return b;
                                }
/* 34 */                        if (b >= -62) {
/* 36 */                            i2 += 2;
/* 40 */                            if (bArr[i4] > -65) {
                                    }
                                }
/* 27 */                        return -1;
                            }
/* 46 */                    if (b >= -16) {
/* 88 */                        if (i4 >= i3 - 2) {
/* 90 */                            return zzhm.zza(bArr, i4, i3);
                                }
/* 95 */                        int i5 = i2 + 2;
/* 97 */                        byte b2 = bArr[i4];
/* 99 */                        if (b2 <= -65) {
/* 108 */                           if ((((b2 + 112) + (b << 28)) >> 30) == 0) {
/* 110 */                               int i6 = i2 + 3;
/* 114 */                               if (bArr[i5] <= -65) {
/* 116 */                                   i2 += 4;
/* 120 */                                   if (bArr[i6] > -65) {
                                            }
                                        }
                                    }
                                }
/* 27 */                        return -1;
                            }
/* 50 */                    if (i4 >= i3 - 1) {
/* 52 */                        return zzhm.zza(bArr, i4, i3);
                            }
/* 57 */                    int i7 = i2 + 2;
/* 59 */                    byte b3 = bArr[i4];
/* 61 */                    if (b3 > -65 || (b == -32 && b3 < -96)) {
/* 27 */                        return -1;
                            }
/* 73 */                    if (b == -19 && b3 >= -96) {
/* 27 */                        return -1;
                            }
/* 79 */                    i2 += 3;
/* 83 */                    if (bArr[i7] > -65) {
/* 27 */                        return -1;
                            }
                        }
                    }
/* 10 */            return 0;
                }
            }
