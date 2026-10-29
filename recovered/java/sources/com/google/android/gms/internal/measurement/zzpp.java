            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzpp implements zzpo {
                public static final zzkl zza;
                public static final zzkl zzb;

                static {
/* 16 */            zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
/* 23 */            zzkfVarZzb.zzd("measurement.collection.event_safelist", true);
/* 32 */            zza = zzkfVarZzb.zzd("measurement.service.store_null_safelist", true);
/* 40 */            zzb = zzkfVarZzb.zzd("measurement.service.store_safelist", true);
                }

                @Override // com.google.android.gms.internal.measurement.zzpo
                public final boolean zza() {
/* 1 */             return true;
                }

                @Override // com.google.android.gms.internal.measurement.zzpo
                public final boolean zzb() {
/* 9 */             return ((Boolean) zza.zzd()).booleanValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzpo
                public final boolean zzc() {
/* 9 */             return ((Boolean) zzb.zzd()).booleanValue();
                }
            }
