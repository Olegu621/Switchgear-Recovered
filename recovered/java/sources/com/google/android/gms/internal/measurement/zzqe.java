            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzqe implements zzqd {
                public static final zzkl zza;

                static {
/* 16 */            zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
/* 23 */            zzkfVarZzb.zzd("measurement.gmscore_feature_tracking", true);
/* 33 */            zza = zzkfVarZzb.zzd("measurement.gmscore_client_telemetry", false);
                }

                @Override // com.google.android.gms.internal.measurement.zzqd
                public final boolean zza() {
/* 9 */             return ((Boolean) zza.zzd()).booleanValue();
                }
            }
