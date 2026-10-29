            package com.google.android.gms.internal.p014authapi;

            import android.util.Base64;
            import java.util.Random;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zbbb {
                private static final Random zba = new Random();

                public static String zba() {
/* 3 */             byte[] bArr = new byte[16];
/* 7 */             zba.nextBytes(bArr);
/* 12 */            return Base64.encodeToString(bArr, 11);
                }
            }
