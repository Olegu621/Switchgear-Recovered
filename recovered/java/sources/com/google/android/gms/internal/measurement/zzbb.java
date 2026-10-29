            package com.google.android.gms.internal.measurement;

            import java.util.List;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbb extends zzav {
                public zzbb() {
/* 8 */             this.zza.add(zzbk.AND);
/* 15 */            this.zza.add(zzbk.NOT);
/* 22 */            this.zza.add(zzbk.OR);
                }

                @Override // com.google.android.gms.internal.measurement.zzav
                public final zzao zza(String str, zzg zzgVar, List list) {
/* 1 */             zzbk zzbkVar = zzbk.ADD;
/* 7 */             int iOrdinal = zzh.zze(str).ordinal();
/* 14 */            if (iOrdinal == 1) {
/* 101 */               zzao zzaoVarZza = zzgVar.zza((zzao) pm2.m7487j(zzbk.AND, 2, list, 0));
                        return zzaoVarZza.zze().booleanValue() ? zzgVar.zza((zzao) list.get(1)) : zzaoVarZza;
                    }
/* 18 */            if (iOrdinal == 47) {
/* 89 */                return new zzaf(Boolean.valueOf(!zzgVar.zza((zzao) pm2.m7487j(zzbk.NOT, 1, list, 0)).zze().booleanValue()));
                    }
/* 22 */            if (iOrdinal != 50) {
/* 24 */                return zzb(str);
                    }
/* 37 */            zzao zzaoVarZza2 = zzgVar.zza((zzao) pm2.m7487j(zzbk.OR, 2, list, 0));
                    return !zzaoVarZza2.zze().booleanValue() ? zzgVar.zza((zzao) list.get(1)) : zzaoVarZza2;
                }
            }
