            package com.google.android.gms.internal.play_billing;

            import p000.AbstractC0208c9;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzci {
                public static int zzc(int i, int i2) {
/* 1 */             if (i2 < 0) {
/* 28 */                C1951n4.m6859j("cannot store more than MAX_VALUE elements");
/* 31 */                return 0;
                    }
/* 3 */             if (i2 <= i) {
/* 5 */                 return i;
                    }
/* 9 */             int i3 = i + (i >> 1) + 1;
/* 11 */            if (i3 < i2) {
/* 15 */                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
/* 19 */                i3 = iHighestOneBit + iHighestOneBit;
                    }
                    return i3 < 0 ? AbstractC0208c9.API_PRIORITY_OTHER : i3;
                }
            }
