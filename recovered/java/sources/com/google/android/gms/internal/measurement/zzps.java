            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzps implements zzpr {
                public static final zzkl zza;
                public static final zzkl zzb;
                public static final zzkl zzc;

                static {
/* 16 */            zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
/* 23 */            zzkfVarZzb.zzd("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
/* 33 */            zza = zzkfVarZzb.zzd("measurement.audience.refresh_event_count_filters_timestamp", false);
/* 41 */            zzb = zzkfVarZzb.zzd("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
/* 49 */            zzc = zzkfVarZzb.zzd("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
                }

                @Override // com.google.android.gms.internal.measurement.zzpr
                public final boolean zza() {
/* 1 */             return true;
                }

                @Override // com.google.android.gms.internal.measurement.zzpr
                public final boolean zzb() {
/* 9 */             return ((Boolean) zza.zzd()).booleanValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzpr
                public final boolean zzc() {
/* 9 */             return ((Boolean) zzb.zzd()).booleanValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzpr
                public final boolean zzd() {
/* 9 */             return ((Boolean) zzc.zzd()).booleanValue();
                }
            }
