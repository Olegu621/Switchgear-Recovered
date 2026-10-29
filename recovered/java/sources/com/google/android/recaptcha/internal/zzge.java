            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.RecaptchaAction;
            import p000.c10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzge implements zzdw {
                private final zzfp zza;
                private zzdv zzb = zzdv.zza;
                private zzxn zzc;

                public zzge(zzfp zzfpVar) {
/* 4 */             this.zza = zzfpVar;
                }

                @Override // com.google.android.recaptcha.internal.zzdw
                public final Object zza(String str, RecaptchaAction recaptchaAction, long j, c10 c10Var) {
/* 13 */            return new zzhg(new zzgc(this, j, str, recaptchaAction, null));
                }

                @Override // com.google.android.recaptcha.internal.zzdw
                public final Object zzb(long j, c10 c10Var) {
/* 9 */             return new zzhg(new zzgd(this, j, null));
                }
            }
