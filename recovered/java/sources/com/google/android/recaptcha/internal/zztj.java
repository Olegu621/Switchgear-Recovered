            package com.google.android.recaptcha.internal;

            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zztj implements zztq {
                private final zztq[] zza;

                public zztj(zztq... zztqVarArr) {
/* 4 */             this.zza = zztqVarArr;
                }

                @Override // com.google.android.recaptcha.internal.zztq
                public final zztp zzb(Class cls) {
/* 3 */             for (int i = 0; i < 2; i++) {
/* 7 */                 zztq zztqVar = this.zza[i];
/* 13 */                if (zztqVar.zzc(cls)) {
/* 15 */                    return zztqVar.zzb(cls);
                        }
                    }
/* 33 */            C1951n4.m6866q("No factory is available for message type: ".concat(cls.getName()));
/* 36 */            return null;
                }

                @Override // com.google.android.recaptcha.internal.zztq
                public final boolean zzc(Class cls) {
/* 4 */             for (int i = 0; i < 2; i++) {
/* 14 */                if (this.zza[i].zzc(cls)) {
/* 16 */                    return true;
                        }
                    }
/* 1 */             return false;
                }
            }
