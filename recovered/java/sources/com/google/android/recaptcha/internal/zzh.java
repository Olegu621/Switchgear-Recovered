            package com.google.android.recaptcha.internal;

            import p000.lo2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzh {
                public static final zzcg zza(Exception exc, zzcg zzcgVar) {
/* 3 */             if (exc instanceof lo2) {
/* 19 */                return new zzcg(zzce.zzb, zzcd.zzb, exc.getMessage(), null, 8, null);
                    }
                    return exc instanceof zzcg ? (zzcg) exc : zzcgVar;
                }
            }
