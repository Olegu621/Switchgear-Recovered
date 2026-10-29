            package com.google.android.gms.internal.play_billing;

            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbw {
                public static int zza(int i, String str) {
/* 1 */             if (i >= 0) {
/* 3 */                 return i;
                    }
/* 29 */            throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
                }

                public static void zzb(Object obj, Object obj2) {
/* 1 */             if (obj == null) {
/* 32 */                C1951n4.m6868s("null key in entry: null=".concat(String.valueOf(obj2)));
                    } else {
/* 3 */                 if (obj2 != null) {
/* 5 */                     return;
                        }
/* 18 */                C1951n4.m6868s(fm0.m3784j("null value in entry: ", obj.toString(), "=null"));
                    }
                }
            }
