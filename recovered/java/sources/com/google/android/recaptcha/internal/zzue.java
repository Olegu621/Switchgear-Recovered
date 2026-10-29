            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzue implements zztp {
                private final zzts zza;
                private final String zzb;
                private final Object[] zzc;
                private final int zzd;

                public zzue(zzts zztsVar, String str, Object[] objArr) {
/* 4 */             this.zza = zztsVar;
/* 6 */             this.zzb = str;
/* 8 */             this.zzc = objArr;
/* 11 */            char cCharAt = str.charAt(0);
/* 18 */            if (cCharAt < 55296) {
/* 20 */                this.zzd = cCharAt;
/* 22 */                return;
                    }
/* 23 */            int i = cCharAt & 8191;
/* 25 */            int i2 = 1;
/* 26 */            int i3 = 13;
                    while (true) {
/* 28 */                int i4 = i2 + 1;
/* 30 */                char cCharAt2 = str.charAt(i2);
/* 34 */                if (cCharAt2 < 55296) {
/* 47 */                    this.zzd = i | (cCharAt2 << i3);
/* 49 */                    return;
                        } else {
/* 39 */                    i |= (cCharAt2 & 8191) << i3;
/* 40 */                    i3 += 13;
/* 42 */                    i2 = i4;
                        }
                    }
                }

                @Override // com.google.android.recaptcha.internal.zztp
                public final zzts zza() {
/* 1 */             return this.zza;
                }

                @Override // com.google.android.recaptcha.internal.zztp
                public final boolean zzb() {
                    return (this.zzd & 2) == 2;
                }

                @Override // com.google.android.recaptcha.internal.zztp
                public final int zzc() {
/* 1 */             int i = this.zzd;
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 return 1;
                    }
                    return (i & 4) == 4 ? 3 : 2;
                }

                public final String zzd() {
/* 1 */             return this.zzb;
                }

                public final Object[] zze() {
/* 1 */             return this.zzc;
                }
            }
