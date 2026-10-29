            package com.google.android.gms.internal.measurement;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzs extends zzai {
                final boolean zza;
                final boolean zzb;
                final /* synthetic */ zzt zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzs(zzt zztVar, boolean z, boolean z2) {
/* 8 */             super("log");
/* 1 */             Objects.requireNonNull(zztVar);
/* 4 */             this.zzc = zztVar;
/* 11 */            this.zza = z;
/* 13 */            this.zzb = z2;
                }

                /* JADX WARN: Code duplicated, block: B:20:0x006e  */
                /* JADX WARN: Code duplicated, block: B:22:0x0080  */
                /* JADX WARN: Code duplicated, block: B:25:0x008f A[LOOP:0: B:23:0x0085->B:25:0x008f, LOOP_END] */
                @Override // com.google.android.gms.internal.measurement.zzai
                public final zzao zza(zzg zzgVar, List list) {
                    int i;
                    int i2;
                    String strZzc;
                    ArrayList arrayList;
/* 4 */             zzh.zzb("log", 1, list);
/* 12 */            if (list.size() == 1) {
/* 14 */                zzt zztVar = this.zzc;
/* 41 */                zztVar.zzb().zza(3, zzgVar.zza((zzao) list.get(0)).zzc(), Collections.EMPTY_LIST, this.zza, this.zzb);
/* 44 */                return zzao.zzf;
                    }
/* 65 */            int iZzg = zzh.zzg(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
/* 71 */            if (iZzg != 2) {
/* 73 */                i = 3;
/* 74 */                if (iZzg == 3) {
/* 87 */                    i2 = 1;
                        } else if (iZzg == 5) {
/* 85 */                    i2 = 5;
                        } else if (iZzg == 6) {
/* 83 */                    i2 = 2;
                        }
/* 101 */               strZzc = zzgVar.zza((zzao) list.get(1)).zzc();
/* 109 */               if (list.size() == 2) {
/* 111 */                   zzt zztVar2 = this.zzc;
/* 123 */                   zztVar2.zzb().zza(i2, strZzc, Collections.EMPTY_LIST, this.zza, this.zzb);
/* 126 */                   return zzao.zzf;
                        }
/* 131 */               arrayList = new ArrayList();
/* 142 */               for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
/* 158 */                   arrayList.add(zzgVar.zza((zzao) list.get(i3)).zzc());
                        }
/* 174 */               this.zzc.zzb().zza(i2, strZzc, arrayList, this.zza, this.zzb);
/* 177 */               return zzao.zzf;
                    }
/* 89 */            i = 4;
/* 81 */            i2 = i;
/* 101 */           strZzc = zzgVar.zza((zzao) list.get(1)).zzc();
/* 109 */           if (list.size() == 2) {
/* 111 */               zzt zztVar3 = this.zzc;
/* 123 */               zztVar3.zzb().zza(i2, strZzc, Collections.EMPTY_LIST, this.zza, this.zzb);
/* 126 */               return zzao.zzf;
                    }
/* 131 */           arrayList = new ArrayList();
/* 142 */           while (i3 < Math.min(list.size(), 5)) {
/* 158 */               arrayList.add(zzgVar.zza((zzao) list.get(i3)).zzc());
                    }
/* 174 */           this.zzc.zzb().zza(i2, strZzc, arrayList, this.zza, this.zzb);
/* 177 */           return zzao.zzf;
                }
            }
