            package com.google.android.gms.internal.measurement;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 51 */    public final class zzan extends zzai implements zzak {
                protected final List zza;
                protected final List zzb;
                protected zzg zzc;

                public zzan(String str, List list, List list2, zzg zzgVar) {
/* 1 */             super(str);
/* 9 */             this.zza = new ArrayList();
/* 11 */            this.zzc = zzgVar;
/* 17 */            if (!list.isEmpty()) {
/* 19 */                Iterator it = list.iterator();
/* 27 */                while (it.hasNext()) {
/* 41 */                    this.zza.add(((zzao) it.next()).zzc());
                        }
                    }
/* 50 */            this.zzb = new ArrayList(list2);
                }

                @Override // com.google.android.gms.internal.measurement.zzai
                public final zzao zza(zzg zzgVar, List list) {
/* 3 */             zzg zzgVarZzc = this.zzc.zzc();
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 List list2 = this.zza;
/* 14 */                if (i >= list2.size()) {
                            break;
                        }
/* 20 */                if (i < list.size()) {
/* 38 */                    zzgVarZzc.zzf((String) list2.get(i), zzgVar.zza((zzao) list.get(i)));
                        } else {
/* 50 */                    zzgVarZzc.zzf((String) list2.get(i), zzao.zzf);
                        }
/* 53 */                i++;
                    }
/* 66 */            for (zzao zzaoVar : this.zzb) {
/* 74 */                zzao zzaoVarZza = zzgVarZzc.zza(zzaoVar);
/* 80 */                if (zzaoVarZza instanceof zzap) {
/* 82 */                    zzaoVarZza = zzgVarZzc.zza(zzaoVar);
                        }
/* 88 */                if (zzaoVarZza instanceof zzag) {
/* 92 */                    return ((zzag) zzaoVarZza).zzb();
                        }
                    }
/* 97 */            return zzao.zzf;
                }

                @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzao
                public final zzao zzt() {
/* 3 */             return new zzan(this);
                }

/* 52 */        private zzan(zzan zzanVar) {
/* 53 */            super(zzanVar.zzd);
/* 54 */            ArrayList arrayList = new ArrayList(zzanVar.zza.size());
                    this.zza = arrayList;
/* 55 */            arrayList.addAll(zzanVar.zza);
/* 56 */            ArrayList arrayList2 = new ArrayList(zzanVar.zzb.size());
                    this.zzb = arrayList2;
/* 57 */            arrayList2.addAll(zzanVar.zzb);
                    this.zzc = zzanVar.zzc;
                }
            }
