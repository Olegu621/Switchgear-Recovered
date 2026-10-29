            package com.google.android.gms.internal.auth;

            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfn implements zzfu {
                private final zzfu[] zza;

                public zzfn(zzfu... zzfuVarArr) {
/* 4 */             this.zza = zzfuVarArr;
                }

                @Override // com.google.android.gms.internal.auth.zzfu
                public final zzft zzb(Class cls) {
/* 1 */             zzfu[] zzfuVarArr = this.zza;
/* 5 */             for (int i = 0; i < 2; i++) {
/* 7 */                 zzfu zzfuVar = zzfuVarArr[i];
/* 13 */                if (zzfuVar.zzc(cls)) {
/* 15 */                    return zzfuVar.zzb(cls);
                        }
                    }
/* 33 */            C1951n4.m6866q("No factory is available for message type: ".concat(cls.getName()));
/* 36 */            return null;
                }

                @Override // com.google.android.gms.internal.auth.zzfu
                public final boolean zzc(Class cls) {
/* 1 */             zzfu[] zzfuVarArr = this.zza;
/* 6 */             for (int i = 0; i < 2; i++) {
/* 14 */                if (zzfuVarArr[i].zzc(cls)) {
/* 16 */                    return true;
                        }
                    }
/* 3 */             return false;
                }
            }
