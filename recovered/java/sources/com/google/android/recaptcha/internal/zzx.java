            package com.google.android.recaptcha.internal;

            import android.content.ContentResolver;
            import android.os.Build;
            import p000.c10;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzx implements zzar {
                private final p51 zza;

                public zzx() {
/* 4 */             int i = zzby.zza;
/* 12 */            this.zza = r51.m8065b(zzw.zza);
                }

                public static final /* synthetic */ ContentResolver zzb(zzx zzxVar) {
/* 7 */             return (ContentResolver) zzxVar.zza.getValue();
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final int zza() {
/* 1 */             return 17;
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final /* synthetic */ Object zzc(String str, c10 c10Var) {
/* 1 */             return zzam.zza(this, str, c10Var);
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final /* synthetic */ Object zzd(zzxp zzxpVar, c10 c10Var) {
/* 13 */            return zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), c10Var);
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final Object zze(String str, c10 c10Var) {
/* 9 */             return new zzhg(new zzv(this, null));
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final /* synthetic */ Object zzf(zzxp zzxpVar, c10 c10Var) {
/* 1 */             return zzam.zzc(this, zzxpVar, c10Var);
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final Object zzg(Exception exc, c10 c10Var) {
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 3 */             zzys zzysVarZzf = zzyt.zzf();
/* 9 */             zzysVarZzf.zzr(16);
/* 21 */            zzysVarZzf.zzq(i > 34 ? 59 : 58);
/* 30 */            return zzas.zza(this, (zzyt) zzysVarZzf.zzk());
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final /* synthetic */ void zzh(zzyg zzygVar) {
                }

                @Override // com.google.android.recaptcha.internal.zzar
                public final boolean zzi() {
/* 1 */             return true;
                }
            }
