            package com.google.android.gms.internal.drive;

            import okio.Utf8;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     final class zzng {
                /* JADX INFO: Access modifiers changed from: private */
                public static void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzkq {
/* 5 */             if (!zzg(b2)) {
/* 14 */                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !zzg(b3) && !zzg(b4)) {
/* 44 */                    int i2 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
/* 52 */                    cArr[i] = (char) ((i2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
/* 63 */                    cArr[i + 1] = (char) ((i2 & 1023) + Utf8.LOG_SURROGATE_HEADER);
/* 65 */                    return;
                        }
                    }
/* 70 */            throw zzkq.zzdn();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static boolean zzd(byte b) {
                    return b >= 0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static boolean zze(byte b) {
                    return b < -32;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static boolean zzf(byte b) {
                    return b < -16;
                }

                private static boolean zzg(byte b) {
                    return b > -65;
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 70 */        public static void zza(byte b, byte b2, char[] cArr, int i) throws zzkq {
/* 71 */            if (b >= -62 && !zzg(b2)) {
/* 72 */                cArr[i] = (char) (((b & 31) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
/* 73 */            throw zzkq.zzdn();
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 73 */        public static void zza(byte b, byte b2, byte b3, char[] cArr, int i) throws zzkq {
/* 74 */            if (!zzg(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !zzg(b3)))) {
/* 76 */                cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                        return;
                    }
/* 77 */            throw zzkq.zzdn();
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 77 */        public static void zza(byte b, char[] cArr, int i) {
/* 78 */            cArr[i] = (char) b;
                }
            }
