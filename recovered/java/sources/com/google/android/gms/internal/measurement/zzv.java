            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzv extends zzai {
                private final zzz zza;

                public zzv(zzz zzzVar) {
/* 3 */             super("internal.registerCallback");
/* 6 */             this.zza = zzzVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzai
                public final zzao zza(zzg zzgVar, List list) {
/* 4 */             zzh.zza(this.zzd, 3, list);
/* 18 */            String strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
/* 29 */            zzao zzaoVarZza = zzgVar.zza((zzao) list.get(1));
/* 36 */            if (!(zzaoVarZza instanceof zzan)) {
/* 122 */               C1951n4.m6859j("Invalid callback type");
/* 35 */                return null;
                    }
/* 45 */            zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(2));
/* 51 */            if (!(zzaoVarZza2 instanceof zzal)) {
/* 116 */               C1951n4.m6859j("Invalid callback params");
/* 35 */                return null;
                    }
/* 53 */            zzal zzalVar = (zzal) zzaoVarZza2;
/* 61 */            if (!zzalVar.zzj("type")) {
/* 110 */               C1951n4.m6859j("Undefined rule type");
/* 35 */                return null;
                    }
/* 102 */           this.zza.zza(strZzc, zzalVar.zzj("priority") ? zzh.zzg(zzalVar.zzk("priority").zzd().doubleValue()) : 1000, (zzan) zzaoVarZza, zzalVar.zzk("type").zzc());
/* 105 */           return zzao.zzf;
                }
            }
