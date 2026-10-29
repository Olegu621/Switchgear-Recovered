            package com.google.android.gms.internal.measurement;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzaw {
                final Map zza = new HashMap();
                final zzbi zzb = new zzbi();

                public zzaw() {
/* 23 */            zza(new zzau());
/* 31 */            zza(new zzax());
/* 39 */            zza(new zzay());
/* 47 */            zza(new zzbb());
/* 55 */            zza(new zzbg());
/* 63 */            zza(new zzbh());
/* 71 */            zza(new zzbj());
                }

                public final void zza(zzav zzavVar) {
/* 3 */             Iterator it = zzavVar.zza.iterator();
/* 11 */            while (it.hasNext()) {
/* 29 */                this.zza.put(((zzbk) it.next()).zzb().toString(), zzavVar);
                    }
                }

                public final zzao zzb(zzg zzgVar, zzao zzaoVar) {
/* 1 */             zzh.zzl(zzgVar);
/* 6 */             if (!(zzaoVar instanceof zzap)) {
/* 40 */                return zzaoVar;
                    }
/* 8 */             zzap zzapVar = (zzap) zzaoVar;
/* 10 */            ArrayList arrayListZzg = zzapVar.zzg();
/* 14 */            String strZzb = zzapVar.zzb();
/* 18 */            Map map = this.zza;
/* 35 */            return (map.containsKey(strZzb) ? (zzav) map.get(strZzb) : this.zzb).zza(strZzb, zzgVar, arrayListZzg);
                }
            }
