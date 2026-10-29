            package com.google.android.gms.internal.measurement;

            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zznb implements zznj {
                private final zznj[] zza;

                public zznb(zznj... zznjVarArr) {
/* 4 */             this.zza = zznjVarArr;
                }

                @Override // com.google.android.gms.internal.measurement.zznj
                public final boolean zzb(Class cls) {
/* 4 */             for (int i = 0; i < 2; i++) {
/* 14 */                if (this.zza[i].zzb(cls)) {
/* 16 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                @Override // com.google.android.gms.internal.measurement.zznj
                public final zzni zzc(Class cls) {
/* 3 */             for (int i = 0; i < 2; i++) {
/* 7 */                 zznj zznjVar = this.zza[i];
/* 13 */                if (zznjVar.zzb(cls)) {
/* 15 */                    return zznjVar.zzc(cls);
                        }
                    }
/* 33 */            C1951n4.m6866q("No factory is available for message type: ".concat(cls.getName()));
/* 36 */            return null;
                }
            }
