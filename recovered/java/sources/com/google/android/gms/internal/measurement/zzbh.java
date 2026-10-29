            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbh extends zzav {
                public zzbh() {
/* 8 */             this.zza.add(zzbk.ADD);
/* 15 */            this.zza.add(zzbk.DIVIDE);
/* 22 */            this.zza.add(zzbk.MODULUS);
/* 29 */            this.zza.add(zzbk.MULTIPLY);
/* 36 */            this.zza.add(zzbk.NEGATE);
/* 43 */            this.zza.add(zzbk.POST_DECREMENT);
/* 50 */            this.zza.add(zzbk.POST_INCREMENT);
/* 57 */            this.zza.add(zzbk.PRE_DECREMENT);
/* 64 */            this.zza.add(zzbk.PRE_INCREMENT);
/* 71 */            this.zza.add(zzbk.SUBTRACT);
                }

                @Override // com.google.android.gms.internal.measurement.zzav
                public final zzao zza(String str, zzg zzgVar, List list) {
/* 1 */             zzbk zzbkVar = zzbk.ADD;
/* 7 */             int iOrdinal = zzh.zze(str).ordinal();
/* 14 */            if (iOrdinal == 0) {
/* 338 */               zzao zzaoVarZza = zzgVar.zza((zzao) pm2.m7487j(zzbk.ADD, 2, list, 0));
/* 348 */               zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
/* 354 */               if (!(zzaoVarZza instanceof zzak) && !(zzaoVarZza instanceof zzas) && !(zzaoVarZza2 instanceof zzak) && !(zzaoVarZza2 instanceof zzas)) {
/* 392 */                   return new zzah(Double.valueOf(zzaoVarZza2.zzd().doubleValue() + zzaoVarZza.zzd().doubleValue()));
                        }
/* 418 */               return new zzas(String.valueOf(zzaoVarZza.zzc()).concat(String.valueOf(zzaoVarZza2.zzc())));
                    }
/* 18 */            if (iOrdinal == 21) {
/* 326 */               return new zzah(Double.valueOf(zzgVar.zza((zzao) pm2.m7487j(zzbk.DIVIDE, 2, list, 0)).zzd().doubleValue() / zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
                    }
/* 22 */            if (iOrdinal == 59) {
/* 222 */               zzao zzaoVarZza3 = zzgVar.zza((zzao) pm2.m7487j(zzbk.SUBTRACT, 2, list, 0));
/* 251 */               zzah zzahVar = new zzah(Double.valueOf(-zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
/* 277 */               return new zzah(Double.valueOf(zzahVar.zzd().doubleValue() + zzaoVarZza3.zzd().doubleValue()));
                    }
/* 26 */            if (iOrdinal == 52 || iOrdinal == 53) {
/* 191 */               zzh.zza(str, 2, list);
/* 200 */               zzao zzaoVarZza4 = zzgVar.zza((zzao) list.get(0));
/* 210 */               zzgVar.zza((zzao) list.get(1));
/* 213 */               return zzaoVarZza4;
                    }
/* 34 */            if (iOrdinal == 55 || iOrdinal == 56) {
/* 177 */               zzh.zza(str, 1, list);
/* 186 */               return zzgVar.zza((zzao) list.get(0));
                    }
                    switch (iOrdinal) {
                        case 44:
/* 173 */                   return new zzah(Double.valueOf(zzgVar.zza((zzao) pm2.m7487j(zzbk.MODULUS, 2, list, 0)).zzd().doubleValue() % zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
                        case 45:
/* 124 */                   return new zzah(Double.valueOf(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue() * zzgVar.zza((zzao) pm2.m7487j(zzbk.MULTIPLY, 2, list, 0)).zzd().doubleValue()));
                        case 46:
/* 75 */                    return new zzah(Double.valueOf(-zzgVar.zza((zzao) pm2.m7487j(zzbk.NEGATE, 1, list, 0)).zzd().doubleValue()));
                        default:
/* 43 */                    return zzb(str);
                    }
                }
            }
