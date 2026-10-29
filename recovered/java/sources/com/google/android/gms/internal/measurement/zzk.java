            package com.google.android.gms.internal.measurement;

            import java.util.HashMap;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzk extends zzai {
                private final zzab zza;

                public zzk(zzab zzabVar) {
/* 3 */             super("internal.eventLogger");
/* 6 */             this.zza = zzabVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzai
                public final zzao zza(zzg zzgVar, List list) {
/* 4 */             zzh.zza(this.zzd, 3, list);
/* 18 */            String strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
/* 45 */            long jZzi = (long) zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
/* 53 */            zzao zzaoVarZza = zzgVar.zza((zzao) list.get(2));
/* 75 */            this.zza.zze(strZzc, jZzi, zzaoVarZza instanceof zzal ? zzh.zzk((zzal) zzaoVarZza) : new HashMap());
/* 78 */            return zzao.zzf;
                }
            }
