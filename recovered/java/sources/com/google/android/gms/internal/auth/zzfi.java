            package com.google.android.gms.internal.auth;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 4 */     final class zzfi extends zzfk {
                public /* synthetic */ zzfi(zzfh zzfhVar) {
/* 2 */             super(null);
                }

                @Override // com.google.android.gms.internal.auth.zzfk
                public final void zza(Object obj, long j) {
/* 7 */             ((zzey) zzhi.zzf(obj, j)).zzb();
                }

                @Override // com.google.android.gms.internal.auth.zzfk
                public final void zzb(Object obj, Object obj2, long j) {
/* 5 */             zzey zzeyVarZzd = (zzey) zzhi.zzf(obj, j);
/* 11 */            zzey zzeyVar = (zzey) zzhi.zzf(obj2, j);
/* 13 */            int size = zzeyVarZzd.size();
/* 17 */            int size2 = zzeyVar.size();
/* 21 */            if (size > 0 && size2 > 0) {
/* 29 */                if (!zzeyVarZzd.zzc()) {
/* 32 */                    zzeyVarZzd = zzeyVarZzd.zzd(size2 + size);
                        }
/* 36 */                zzeyVarZzd.addAll(zzeyVar);
                    }
/* 39 */            if (size > 0) {
/* 42 */                zzeyVar = zzeyVarZzd;
                    }
/* 43 */            zzhi.zzp(obj, j, zzeyVar);
                }

/* 5 */         private zzfi() {
/* 6 */             super(null);
                }
            }
