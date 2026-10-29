            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class m13 {

                /* JADX INFO: renamed from: a */
                public static final i13 f13547a;

                static {
/* 28 */            f13547a = (my2.f14066e && my2.f14065d && !AbstractC2358x7.m9726a()) ? new i13(1) : new i13(0);
                }

                /* JADX INFO: renamed from: a */
                public static int m6589a(byte[] bArr, int i, int i2) {
/* 3 */             byte b = bArr[i - 1];
/* 5 */             int i3 = i2 - i;
/* 6 */             if (i3 == 0) {
/* 39 */                if (b > -12) {
/* 41 */                    return -1;
                        }
/* 43 */                return b;
                    }
/* 9 */             if (i3 == 1) {
/* 32 */                return m6591c(b, bArr[i]);
                    }
/* 12 */            if (i3 == 2) {
/* 19 */                return m6592d(b, bArr[i], bArr[i + 1]);
                    }
/* 29 */            throw new AssertionError();
                }

                /* JADX INFO: renamed from: b */
                public static int m6590b(String str) {
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
/* 86 */                                    throw new k13(i, length2);
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

                /* JADX INFO: renamed from: c */
                public static int m6591c(int i, int i2) {
/* 3 */             if (i > -12 || i2 > -65) {
/* 14 */                return -1;
                    }
/* 12 */            return i ^ (i2 << 8);
                }

                /* JADX INFO: renamed from: d */
                public static int m6592d(int i, int i2, int i3) {
/* 3 */             if (i > -12 || i2 > -65 || i3 > -65) {
/* 19 */                return -1;
                    }
/* 17 */            return (i ^ (i2 << 8)) ^ (i3 << 16);
                }
            }
