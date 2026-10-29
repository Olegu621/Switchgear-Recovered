            package com.google.android.gms.internal.measurement;

            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.Callable;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzw extends zzai {
                final Map zza;
                private final zzj zzb;

                public zzw(zzj zzjVar) {
/* 3 */             super("require");
/* 11 */            this.zza = new HashMap();
/* 13 */            this.zzb = zzjVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzai
                public final zzao zza(zzg zzgVar, List list) {
                    zzao zzaoVar;
/* 4 */             zzh.zza("require", 1, list);
/* 18 */            String strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
/* 22 */            Map map = this.zza;
/* 28 */            if (map.containsKey(strZzc)) {
/* 34 */                return (zzao) map.get(strZzc);
                    }
/* 39 */            Map map2 = this.zzb.zza;
/* 45 */            if (map2.containsKey(strZzc)) {
                        try {
/* 57 */                    zzaoVar = (zzao) ((Callable) map2.get(strZzc)).call();
                        } catch (Exception unused) {
/* 70 */                    f42.m3656l("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
/* 73 */                    return null;
                        }
                    } else {
/* 75 */                zzaoVar = zzao.zzf;
                    }
/* 79 */            if (zzaoVar instanceof zzai) {
/* 86 */                this.zza.put(strZzc, (zzai) zzaoVar);
                    }
/* 89 */            return zzaoVar;
                }
            }
