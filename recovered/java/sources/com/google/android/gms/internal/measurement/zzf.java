            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzf {
                final zzaw zza;
                final zzg zzb;
                final zzg zzc;
                final zzj zzd;

                public zzf() {
/* 6 */             zzaw zzawVar = new zzaw();
/* 9 */             this.zza = zzawVar;
/* 14 */            zzg zzgVar = new zzg(null, zzawVar);
/* 17 */            this.zzc = zzgVar;
/* 23 */            this.zzb = zzgVar.zzc();
/* 27 */            zzj zzjVar = new zzj();
/* 30 */            this.zzd = zzjVar;
/* 39 */            zzgVar.zze("require", new zzw(zzjVar));
/* 46 */            zzjVar.zza("internal.platform", zze.zza);
/* 62 */            zzgVar.zze("runtime.counter", new zzah(Double.valueOf(0.0d)));
                }

                public final zzao zza(zzg zzgVar, zzje... zzjeVarArr) {
/* 1 */             zzao zzaoVarZzb = zzao.zzf;
/* 5 */             for (zzje zzjeVar : zzjeVarArr) {
/* 9 */                 zzaoVarZzb = zzi.zzb(zzjeVar);
/* 15 */                zzh.zzl(this.zzc);
/* 20 */                if ((zzaoVarZzb instanceof zzap) || (zzaoVarZzb instanceof zzan)) {
/* 28 */                    zzaoVarZzb = this.zza.zzb(zzgVar, zzaoVarZzb);
                        }
                    }
/* 35 */            return zzaoVarZzb;
                }
            }
