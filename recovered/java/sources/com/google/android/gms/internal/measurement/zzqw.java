            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzqw implements zzqv {
                public static final zzkl zza;

                static {
/* 16 */            zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
/* 27 */            zza = zzkfVarZzb.zzd("measurement.session_stitching_token_enabled", false);
/* 32 */            zzkfVarZzb.zzd("measurement.link_sst_to_sid", true);
                }

                @Override // com.google.android.gms.internal.measurement.zzqv
                public final boolean zza() {
/* 1 */             return true;
                }

                @Override // com.google.android.gms.internal.measurement.zzqv
                public final boolean zzb() {
/* 9 */             return ((Boolean) zza.zzd()).booleanValue();
                }
            }
