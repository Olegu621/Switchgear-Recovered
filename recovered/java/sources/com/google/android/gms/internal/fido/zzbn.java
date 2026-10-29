            package com.google.android.gms.internal.fido;

            import java.math.RoundingMode;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbn {
                public static int zza(int i, int i2, RoundingMode roundingMode) {
/* 1 */             roundingMode.getClass();
/* 4 */             if (i2 == 0) {
/* 90 */                throw new ArithmeticException("/ by zero");
                    }
/* 6 */             int i3 = i / i2;
/* 10 */            int i4 = i - (i2 * i3);
/* 12 */            if (i4 == 0) {
/* 78 */                return i3;
                    }
/* 27 */            int i5 = ((i ^ i2) >> 31) | 1;
                    switch (zzbm.zza[roundingMode.ordinal()]) {
                        case 1:
/* 79 */                    zzbo.zza(false);
/* 82 */                    return i3;
                        case 2:
/* 78 */                    return i3;
                        case 3:
/* 75 */                    if (i5 >= 0) {
/* 78 */                        return i3;
                            }
                            break;
                        case 4:
                            break;
                        case 5:
/* 71 */                    if (i5 <= 0) {
/* 74 */                        return i3;
                            }
                            break;
                        case 6:
                        case 7:
                        case 8:
/* 38 */                    int iAbs = Math.abs(i4);
/* 47 */                    int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
/* 48 */                    if (iAbs2 == 0) {
/* 52 */                        if (roundingMode != RoundingMode.HALF_UP) {
/* 63 */                            if ((i3 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
/* 66 */                                return i3;
                                    }
                                }
                            } else if (iAbs2 <= 0) {
/* 70 */                        return i3;
                            }
                        default:
/* 37 */                    throw new AssertionError();
                    }
/* 77 */            return i3 + i5;
                }

                public static int zzb(int i, RoundingMode roundingMode) {
/* 1 */             if (i <= 0) {
/* 64 */                C1951n4.m6859j("x (0) must be > 0");
/* 67 */                return 0;
                    }
                    switch (zzbm.zza[roundingMode.ordinal()]) {
                        case 1:
/* 52 */                    zzbo.zza(((i + (-1)) & i) == 0);
                            break;
                        case 2:
                        case 3:
                            break;
                        case 4:
                        case 5:
/* 41 */                    return 32 - Integer.numberOfLeadingZeros(i - 1);
                        case 6:
                        case 7:
                        case 8:
/* 20 */                    int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
/* 33 */                    return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i) >>> 31);
                        default:
/* 19 */                    throw new AssertionError();
                    }
/* 59 */            return 31 - Integer.numberOfLeadingZeros(i);
                }
            }
