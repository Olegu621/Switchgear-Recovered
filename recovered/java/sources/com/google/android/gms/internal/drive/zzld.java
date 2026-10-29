            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 40 */    final class zzld extends zzla {
                private zzld() {
/* 2 */             super();
                }

                private static <E> zzkp<E> zzc(Object obj, long j) {
/* 5 */             return (zzkp) zznd.zzo(obj, j);
                }

                @Override // com.google.android.gms.internal.drive.zzla
                public final <E> void zza(Object obj, Object obj2, long j) {
/* 1 */             zzkp zzkpVarZzc = zzc(obj, j);
/* 5 */             zzkp zzkpVarZzc2 = zzc(obj2, j);
/* 9 */             int size = zzkpVarZzc.size();
/* 13 */            int size2 = zzkpVarZzc2.size();
/* 17 */            if (size > 0 && size2 > 0) {
/* 25 */                if (!zzkpVarZzc.zzbo()) {
/* 28 */                    zzkpVarZzc = zzkpVarZzc.zzr(size2 + size);
                        }
/* 32 */                zzkpVarZzc.addAll(zzkpVarZzc2);
                    }
/* 35 */            if (size > 0) {
/* 37 */                zzkpVarZzc2 = zzkpVarZzc;
                    }
/* 38 */            zznd.zza(obj, j, zzkpVarZzc2);
                }

                @Override // com.google.android.gms.internal.drive.zzla
/* 41 */        public final void zza(Object obj, long j) {
/* 43 */            zzc(obj, j).zzbp();
                }
            }
