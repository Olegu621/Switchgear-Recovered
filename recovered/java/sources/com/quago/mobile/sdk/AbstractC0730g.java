            package com.quago.mobile.sdk;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 69 */    public abstract class AbstractC0730g {
                /* JADX INFO: renamed from: a */
                public static int m2574a(int i) {
/* 1 */             if (i == 0) {
/* 68 */                return 17;
                    }
/* 4 */             if (i == 1) {
/* 65 */                return 20;
                    }
/* 7 */             if (i == 2) {
/* 62 */                return 16;
                    }
                    switch (i) {
                        case -256:
/* 59 */                    return 22;
                        case 4:
/* 56 */                    return 14;
                        case 8:
/* 53 */                    return 15;
                        case 16:
/* 50 */                    return 19;
                        case 255:
/* 47 */                    return 18;
                        case 257:
/* 44 */                    return 9;
                        case 513:
/* 41 */                    return 13;
                        case 1025:
/* 38 */                    return 12;
                        case 4098:
/* 6 */                     return 2;
                        case 8194:
/* 34 */                    return 8;
                        case 16386:
/* 32 */                    return 5;
                        case 49154:
/* 29 */                    return 21;
                        case 65540:
/* 3 */                     return 1;
                        case 131076:
/* 26 */                    return 7;
                        case 1048584:
/* 24 */                    return 3;
                        case 2097152:
/* 22 */                    return 4;
                        case 4194304:
/* 20 */                    return 6;
                        case 16777232:
/* 17 */                    return 10;
                        case 33554433:
/* 14 */                    return 11;
                        default:
/* 12 */                    return 0;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static int m2576b(int i) {
/* 1 */             int i2 = 1;
/* 2 */             if (i != 1) {
/* 4 */                 i2 = 2;
/* 5 */                 if (i != 2) {
/* 7 */                     i2 = 3;
/* 8 */                     if (i != 3) {
/* 10 */                        i2 = 4;
/* 11 */                        if (i != 4) {
/* 13 */                            return 0;
                                }
                            }
                        }
                    }
/* 15 */            return i2;
                }

                /* JADX INFO: renamed from: a */
/* 70 */        public static long m2575a(boolean... zArr) {
                    long j = 0;
                    for (boolean z : zArr) {
                        j = (j << 1) + (z ? 1L : 0L);
                    }
                    return j;
                }
            }
