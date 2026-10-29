            package com.google.android.gms.internal.auth;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzgg implements zzft {
                private final zzfw zza;
                private final String zzb = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
                private final Object[] zzc;
                private final int zzd;

                public zzgg(zzfw zzfwVar, String str, Object[] objArr) {
/* 4 */             this.zza = zzfwVar;
/* 10 */            this.zzc = objArr;
/* 13 */            char cCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
/* 20 */            if (cCharAt < 55296) {
/* 22 */                this.zzd = cCharAt;
/* 24 */                return;
                    }
/* 25 */            int i = cCharAt & 8191;
/* 27 */            int i2 = 13;
/* 29 */            int i3 = 1;
                    while (true) {
/* 30 */                int i4 = i3 + 1;
/* 32 */                char cCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i3);
/* 36 */                if (cCharAt2 < 55296) {
/* 49 */                    this.zzd = (cCharAt2 << i2) | i;
/* 51 */                    return;
                        } else {
/* 41 */                    i |= (cCharAt2 & 8191) << i2;
/* 42 */                    i2 += 13;
/* 44 */                    i3 = i4;
                        }
                    }
                }

                @Override // com.google.android.gms.internal.auth.zzft
                public final zzfw zza() {
/* 1 */             return this.zza;
                }

                @Override // com.google.android.gms.internal.auth.zzft
                public final boolean zzb() {
                    return (this.zzd & 2) == 2;
                }

                @Override // com.google.android.gms.internal.auth.zzft
                public final int zzc() {
                    return (this.zzd & 1) == 1 ? 1 : 2;
                }

                public final String zzd() {
/* 1 */             return this.zzb;
                }

                public final Object[] zze() {
/* 1 */             return this.zzc;
                }
            }
