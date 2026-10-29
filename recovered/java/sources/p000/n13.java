            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class n13 {

                /* JADX INFO: renamed from: a */
                public static final j13 f14100a;

                static {
/* 28 */            f14100a = (ny2.f14570e && ny2.f14569d && !AbstractC2488y7.m10123a()) ? new j13(1) : new j13(0);
                }

                /* JADX INFO: renamed from: a */
                public static int m6852a(String str) {
/* 1 */             int length = str.length();
/* 6 */             int i = 0;
/* 7 */             while (i < length && str.charAt(i) < 128) {
/* 17 */                i++;
                    }
/* 20 */            int i2 = length;
/* 21 */            while (i < length) {
/* 23 */                char cCharAt = str.charAt(i);
/* 29 */                if (cCharAt >= 2048) {
/* 39 */                    int length2 = str.length();
/* 43 */                    int i3 = 0;
/* 44 */                    while (i < length2) {
/* 46 */                        char cCharAt2 = str.charAt(i);
/* 50 */                        if (cCharAt2 < 2048) {
/* 56 */                            i3 += (127 - cCharAt2) >>> 31;
                                } else {
/* 58 */                            i3 += 2;
/* 63 */                            if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
/* 76 */                                if (Character.codePointAt(str, i) < 65536) {
/* 86 */                                    throw new l13(i, length2);
                                        }
/* 78 */                                i++;
                                    }
                                }
/* 87 */                        i++;
                            }
/* 90 */                    i2 += i3;
                            break;
                        }
/* 35 */                i2 += (127 - cCharAt) >>> 31;
/* 36 */                i++;
                    }
/* 91 */            if (i2 >= length) {
/* 93 */                return i2;
                    }
/* 101 */           pk3.m7471g(((long) i2) + 4294967296L);
/* 5 */             return 0;
                }
            }
