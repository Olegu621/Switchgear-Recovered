            package com.google.android.gms.internal.measurement;

            import java.util.Collections;
            import java.util.Iterator;
            import java.util.TreeMap;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzz {
                final TreeMap zza = new TreeMap();
                final TreeMap zzb = new TreeMap();

                private static final int zzc(zzg zzgVar, zzan zzanVar, zzao zzaoVar) {
/* 5 */             zzao zzaoVarZza = zzanVar.zza(zzgVar, Collections.singletonList(zzaoVar));
/* 11 */            if (zzaoVarZza instanceof zzah) {
/* 21 */                return zzh.zzg(zzaoVarZza.zzd().doubleValue());
                    }
/* 26 */            return -1;
                }

                public final void zza(String str, int i, zzan zzanVar, String str2) {
                    TreeMap treeMap;
/* 7 */             if ("create".equals(str2)) {
/* 9 */                 treeMap = this.zzb;
                    } else {
/* 18 */                if (!"edit".equals(str2)) {
/* 62 */                    f42.m3656l("Unknown callback type: ".concat(String.valueOf(str2)));
/* 65 */                    return;
                        }
/* 20 */                treeMap = this.zza;
                    }
/* 30 */            if (treeMap.containsKey(Integer.valueOf(i))) {
/* 42 */                i = ((Integer) treeMap.lastKey()).intValue() + 1;
                    }
/* 48 */            treeMap.put(Integer.valueOf(i), zzanVar);
                }

                public final void zzb(zzg zzgVar, zzab zzabVar) {
/* 3 */             zzl zzlVar = new zzl(zzabVar);
/* 6 */             TreeMap treeMap = this.zza;
/* 20 */            for (Integer num : treeMap.keySet()) {
/* 32 */                zzaa zzaaVarClone = zzabVar.zzc().clone();
/* 42 */                int iZzc = zzc(zzgVar, (zzan) treeMap.get(num), zzlVar);
/* 47 */                if (iZzc == 2 || iZzc == -1) {
/* 52 */                    zzabVar.zzd(zzaaVarClone);
                        }
                    }
/* 56 */            TreeMap treeMap2 = this.zzb;
/* 62 */            Iterator it = treeMap2.keySet().iterator();
/* 70 */            while (it.hasNext()) {
/* 84 */                zzc(zzgVar, (zzan) treeMap2.get((Integer) it.next()), zzlVar);
                    }
                }
            }
