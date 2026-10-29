            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.RecaptchaException;
            import p000.c10;
            import p000.k50;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzht {
                private final p51 zza;
                private final p51 zzb;

                public zzht() {
/* 4 */             int i = zzby.zza;
/* 12 */            this.zza = r51.m8065b(zzhr.zza);
/* 20 */            this.zzb = r51.m8065b(zzhs.zza);
                }

                public static final /* synthetic */ zzhn zza(zzht zzhtVar) {
/* 7 */             return (zzhn) zzhtVar.zzb.getValue();
                }

                public static final /* synthetic */ zzig zzb(zzht zzhtVar) {
/* 7 */             return (zzig) zzhtVar.zza.getValue();
                }

                public final Object zzc(String str, zzzd zzzdVar, c10 c10Var) throws RecaptchaException {
/* 7 */             return k50.m5966c(new zzhq(this, str, zzzdVar, null), c10Var);
                }
            }
