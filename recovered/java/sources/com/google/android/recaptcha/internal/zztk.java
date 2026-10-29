            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zztk implements zzuh {
                private static final zztq zza = new zzti();
                private final zztq zzb;

                public zztk() {
/* 3 */             zzsg zzsgVarZza = zzsg.zza();
/* 7 */             int i = zzuc.zza;
/* 20 */            zztj zztjVar = new zztj(zzsgVarZza, zza);
/* 26 */            byte[] bArr = zzsv.zzb;
/* 28 */            this.zzb = zztjVar;
                }

                @Override // com.google.android.recaptcha.internal.zzuh
                public final zzug zza(Class cls) {
/* 1 */             int i = zzui.zza;
/* 9 */             if (!zzsn.class.isAssignableFrom(cls)) {
/* 11 */                int i2 = zzuc.zza;
                    }
/* 15 */            zztp zztpVarZzb = this.zzb.zzb(cls);
/* 23 */            if (zztpVarZzb.zzb()) {
/* 66 */                int i3 = zzuc.zza;
/* 80 */                return zztw.zzc(zzui.zzm(), zzsb.zza(), zztpVarZzb.zza());
                    }
/* 25 */            int i4 = zzuc.zza;
/* 61 */            return zztv.zzm(cls, zztpVarZzb, zztz.zza(), zztg.zza(), zzui.zzm(), zztpVarZzb.zzc() + (-1) != 1 ? zzsb.zza() : null, zzto.zza());
                }
            }
