            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzpt {
                public static void zza(boolean z, String str, long j, long j2) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 44 */            throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
                }

                public static void zzb(boolean z) {
/* 1 */             if (!z) {
/* 11 */                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                }
            }
