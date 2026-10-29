            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzrf implements zzre {
                public static final zzkl zza;
                public static final zzkl zzb;

                static {
/* 16 */            zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
/* 27 */            zza = zzkfVarZzb.zzd("measurement.tcf.consent_fix", false);
/* 32 */            zzkfVarZzb.zzd("measurement.tcf.client", true);
/* 41 */            zzb = zzkfVarZzb.zzd("measurement.tcf.empty_pref_fix", true);
/* 47 */            zzkfVarZzb.zzc("measurement.id.tcf", 0L);
                }

                @Override // com.google.android.gms.internal.measurement.zzre
                public final boolean zza() {
/* 9 */             return ((Boolean) zza.zzd()).booleanValue();
                }

                @Override // com.google.android.gms.internal.measurement.zzre
                public final boolean zzb() {
/* 9 */             return ((Boolean) zzb.zzd()).booleanValue();
                }
            }
