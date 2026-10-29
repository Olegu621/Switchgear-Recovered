            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzau extends zzav {
                public zzau() {
/* 8 */             this.zza.add(zzbk.BITWISE_AND);
/* 15 */            this.zza.add(zzbk.BITWISE_LEFT_SHIFT);
/* 22 */            this.zza.add(zzbk.BITWISE_NOT);
/* 29 */            this.zza.add(zzbk.BITWISE_OR);
/* 36 */            this.zza.add(zzbk.BITWISE_RIGHT_SHIFT);
/* 43 */            this.zza.add(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT);
/* 50 */            this.zza.add(zzbk.BITWISE_XOR);
                }

                @Override // com.google.android.gms.internal.measurement.zzav
                public final zzao zza(String str, zzg zzgVar, List list) {
/* 1 */             zzbk zzbkVar = zzbk.ADD;
                    switch (zzh.zze(str).ordinal()) {
                        case 4:
/* 410 */                   return new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) pm2.m7487j(zzbk.BITWISE_AND, 2, list, 0)).zzd().doubleValue()) & zzh.zzg(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue())));
                        case 5:
/* 352 */                   return new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) pm2.m7487j(zzbk.BITWISE_LEFT_SHIFT, 2, list, 0)).zzd().doubleValue()) << ((int) (zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) & 31))));
                        case 6:
/* 292 */                   return new zzah(Double.valueOf(~zzh.zzg(zzgVar.zza((zzao) pm2.m7487j(zzbk.BITWISE_NOT, 1, list, 0)).zzd().doubleValue())));
                        case 7:
/* 256 */                   return new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) pm2.m7487j(zzbk.BITWISE_OR, 2, list, 0)).zzd().doubleValue()) | zzh.zzg(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue())));
                        case 8:
/* 198 */                   return new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) pm2.m7487j(zzbk.BITWISE_RIGHT_SHIFT, 2, list, 0)).zzd().doubleValue()) >> ((int) (zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) & 31))));
                        case 9:
/* 138 */                   return new zzah(Double.valueOf(zzh.zzh(zzgVar.zza((zzao) pm2.m7487j(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list, 0)).zzd().doubleValue()) >>> ((int) (zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) & 31))));
                        case 10:
/* 78 */                    return new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) pm2.m7487j(zzbk.BITWISE_XOR, 2, list, 0)).zzd().doubleValue()) ^ zzh.zzg(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue())));
                        default:
/* 19 */                    return zzb(str);
                    }
                }
            }
