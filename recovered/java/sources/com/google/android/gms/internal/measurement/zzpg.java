            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzpg implements zzpf {
                public static final zzkl zza;
                public static final zzkl zzb;

                static {
/* 16 */            zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
/* 23 */            zzkfVarZzb.zzd("measurement.set_default_event_parameters_with_backfill.client.dev", false);
/* 29 */            zzkfVarZzb.zzd("measurement.set_default_event_parameters_with_backfill.service", true);
/* 36 */            zzkfVarZzb.zzc("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
/* 45 */            zza = zzkfVarZzb.zzd("measurement.set_default_event_parameters.fix_app_update_logging", true);
/* 53 */            zzb = zzkfVarZzb.zzd("measurement.set_default_event_parameters.fix_service_request_ordering", false);
/* 57 */            zzkfVarZzb.zzd("measurement.set_default_event_parameters.fix_subsequent_launches", true);
                }

                @Override // com.google.android.gms.internal.measurement.zzpf
                public final boolean zza() {
/* 9 */             return ((Boolean) zza.zzd()).booleanValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzpf
                public final boolean zzb() {
/* 9 */             return ((Boolean) zzb.zzd()).booleanValue();
                }
            }
