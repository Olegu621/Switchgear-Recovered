            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzm extends zzai {
                final /* synthetic */ zzo zza;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzm(zzn zznVar, String str, zzo zzoVar) {
/* 8 */             super("getValue");
/* 1 */             this.zza = zzoVar;
/* 3 */             Objects.requireNonNull(zznVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzai
                public final zzao zza(zzg zzgVar, List list) {
/* 4 */             zzh.zza("getValue", 2, list);
/* 14 */            zzao zzaoVarZza = zzgVar.zza((zzao) list.get(0));
/* 25 */            zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
/* 35 */            String strZza = this.zza.zza(zzaoVarZza.zzc());
                    return strZza != null ? new zzas(strZza) : zzaoVarZza2;
                }
            }
