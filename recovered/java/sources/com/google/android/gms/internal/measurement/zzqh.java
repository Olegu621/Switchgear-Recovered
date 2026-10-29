            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzqh implements zzqg {
                public static final zzkl zza;

                static {
/* 16 */            zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
/* 23 */            zzkfVarZzb.zzd("measurement.sdk.collection.enable_extend_user_property_size", true);
/* 33 */            zza = zzkfVarZzb.zzd("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
/* 39 */            zzkfVarZzb.zzc("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
                }

                @Override // com.google.android.gms.internal.measurement.zzqg
                public final boolean zza() {
/* 9 */             return ((Boolean) zza.zzd()).booleanValue();
                }
            }
