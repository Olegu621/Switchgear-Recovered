            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzps {
                public static long zza(long j, long j2) {
/* 14 */            long j3 = j + j2;
/* 29 */            zzpt.zza(((j ^ j2) < 0) | ((j ^ j3) >= 0), "checkedAdd", j, j2);
/* 32 */            return j3;
                }

                public static long zzb(long j, long j2) {
/* 17 */            long j3 = (-1) + j;
/* 32 */            zzpt.zza(((1 ^ j) >= 0) | ((j ^ j3) >= 0), "checkedSubtract", j, 1L);
/* 35 */            return j3;
                }
            }
