            package com.google.android.gms.internal.measurement;

            import okio.Utf8;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzop {
                public static /* synthetic */ boolean zza(byte b) {
                    return b >= 0;
                }

                public static /* synthetic */ void zzb(byte b, byte b2, char[] cArr, int i) throws zzmq {
/* 3 */             if (b < -62 || zze(b2)) {
/* 24 */                pk3.m7472h("Protocol message had invalid UTF-8.");
                    } else {
/* 19 */                cArr[i] = (char) (((b & 31) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
                    }
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:11:0x0015  */
                /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:14:0x001c  */
                public static /* synthetic */ void zzc(byte b, byte b2, byte b3, char[] cArr, int i) throws zzmq {
/* 5 */             if (!zze(b2)) {
/* 11 */                if (b != -32) {
/* 18 */                    if (b != -19) {
/* 27 */                        if (!zze(b3)) {
/* 42 */                            cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
/* 44 */                            return;
                                }
                            } else if (b2 < -96) {
/* 22 */                        b = -19;
/* 27 */                        if (!zze(b3)) {
/* 42 */                            cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
/* 44 */                            return;
                                }
                            }
                        } else if (b2 >= -96) {
/* 15 */                    b = -32;
/* 18 */                    if (b != -19) {
/* 27 */                        if (!zze(b3)) {
/* 42 */                            cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
/* 44 */                            return;
                                }
                            } else if (b2 < -96) {
/* 22 */                        b = -19;
/* 27 */                        if (!zze(b3)) {
/* 42 */                            cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
/* 44 */                            return;
                                }
                            }
                        }
                    }
/* 47 */            pk3.m7472h("Protocol message had invalid UTF-8.");
                }

                public static /* synthetic */ void zzd(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzmq {
/* 5 */             if (!zze(b2)) {
/* 14 */                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !zze(b3) && !zze(b4)) {
/* 44 */                    int i2 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
/* 52 */                    cArr[i] = (char) ((i2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
/* 63 */                    cArr[i + 1] = (char) ((i2 & 1023) + Utf8.LOG_SURROGATE_HEADER);
/* 65 */                    return;
                        }
                    }
/* 68 */            pk3.m7472h("Protocol message had invalid UTF-8.");
                }

                private static boolean zze(byte b) {
                    return b > -65;
                }
            }
