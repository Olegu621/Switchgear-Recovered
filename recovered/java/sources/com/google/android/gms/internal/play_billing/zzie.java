            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzie implements zziy {
                private static final zzik zza = new zzic();
                private final zzik zzb;

                public zzie() {
/* 3 */             zzhf zzhfVarZza = zzhf.zza();
/* 7 */             int i = zziu.zza;
/* 20 */            zzid zzidVar = new zzid(zzhfVarZza, zza);
/* 26 */            byte[] bArr = zzhp.zzb;
/* 28 */            this.zzb = zzidVar;
                }

                @Override // com.google.android.gms.internal.play_billing.zziy
                public final zzix zza(Class cls) {
/* 1 */             int i = zziz.zza;
/* 9 */             if (!zzhk.class.isAssignableFrom(cls)) {
/* 11 */                int i2 = zziu.zza;
                    }
/* 15 */            zzij zzijVarZzb = this.zzb.zzb(cls);
/* 23 */            if (zzijVarZzb.zzb()) {
/* 66 */                int i3 = zziu.zza;
/* 80 */                return zziq.zzc(zziz.zzm(), zzgz.zza(), zzijVarZzb.zza());
                    }
/* 25 */            int i4 = zziu.zza;
/* 61 */            return zzip.zzl(cls, zzijVarZzb, zzis.zza(), zzia.zza(), zziz.zzm(), zzijVarZzb.zzc() + (-1) != 1 ? zzgz.zza() : null, zzii.zza());
                }
            }
