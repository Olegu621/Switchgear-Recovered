            package com.google.android.gms.internal.common;

            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzm extends zzl {
                private final char zza;

                public zzm(char c) {
/* 4 */             this.zza = c;
                }

                public final String toString() {
/* 2 */             char[] cArr = new char[6];
/* 7 */             cArr[0] = '\\';
/* 12 */            cArr[1] = 'u';
/* 15 */            cArr[2] = 0;
/* 18 */            cArr[3] = 0;
/* 21 */            cArr[4] = 0;
/* 24 */            cArr[5] = 0;
/* 26 */            int i = this.zza;
/* 28 */            for (int i2 = 0; i2 < 4; i2++) {
/* 40 */                cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
/* 42 */                i >>= 4;
                    }
/* 46 */            String strCopyValueOf = String.copyValueOf(cArr);
/* 69 */            return fm0.m3790p(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
                }

                @Override // com.google.android.gms.internal.common.zzp
                public final boolean zza(char c) {
                    return c == this.zza;
                }
            }
