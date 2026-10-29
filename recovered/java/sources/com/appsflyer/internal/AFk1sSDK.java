            package com.appsflyer.internal;

            import io.flutter.embedding.android.KeyboardMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFk1sSDK {
                public static long[] getCurrencyIso4217Code(int i, int i2) {
/* 2 */             long[] jArr = new long[4];
/* 18 */            jArr[0] = (((long) i2) & KeyboardMap.kValueMask) | ((((long) i) & KeyboardMap.kValueMask) << 32);
/* 21 */            for (int i3 = 1; i3 < 4; i3++) {
/* 25 */                long j = jArr[i3 - 1];
/* 38 */                jArr[i3] = ((j ^ (j >> 30)) * 1812433253) + ((long) i3);
                    }
/* 43 */            return jArr;
                }
            }
