            package com.google.android.gms.internal.auth;

            import java.io.Serializable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzdn {
                public static zzdj zza(zzdj zzdjVar) {
/* 3 */             if ((zzdjVar instanceof zzdl) || (zzdjVar instanceof zzdk)) {
/* 9 */                 return zzdjVar;
                    }
                    return zzdjVar instanceof Serializable ? new zzdk(zzdjVar) : new zzdl(zzdjVar);
                }

                public static zzdj zzb(Object obj) {
/* 3 */             return new zzdm(obj);
                }
            }
