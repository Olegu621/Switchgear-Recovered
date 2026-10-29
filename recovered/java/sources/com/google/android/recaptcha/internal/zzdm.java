            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzdm extends Exception {
                private final Throwable zza;
                private final zzys zzb;
                private final int zzc;
                private final int zzd;

                public zzdm(int i, int i2, Throwable th) {
/* 4 */             this.zzc = i;
/* 6 */             this.zzd = i2;
/* 8 */             this.zza = th;
/* 10 */            zzys zzysVarZzf = zzyt.zzf();
/* 14 */            zzysVarZzf.zzq(i2);
/* 17 */            zzysVarZzf.zzr(i);
/* 20 */            this.zzb = zzysVarZzf;
                }

                @Override // java.lang.Throwable
                public final Throwable getCause() {
/* 1 */             return this.zza;
                }

                public final zzys zza() {
/* 1 */             return this.zzb;
                }

                public final int zzb() {
/* 1 */             return this.zzd;
                }
            }
