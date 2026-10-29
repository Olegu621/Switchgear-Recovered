            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zznc implements zznx {
                private static final zznj zzb = new zzna();
                private final zznj zza;

                public zznc() {
/* 3 */             zzlz zzlzVarZza = zzlz.zza();
/* 7 */             int i = zznt.zza;
/* 20 */            zznb zznbVar = new zznb(zzlzVarZza, zzb);
/* 26 */            byte[] bArr = zzmo.zzb;
/* 28 */            this.zza = zznbVar;
                }

                @Override // com.google.android.gms.internal.measurement.zznx
                public final zznw zza(Class cls) {
/* 1 */             int i = zzny.zza;
/* 9 */             if (!zzme.class.isAssignableFrom(cls)) {
/* 11 */                int i2 = zznt.zza;
                    }
/* 15 */            zzni zzniVarZzc = this.zza.zzc(cls);
/* 23 */            if (zzniVarZzc.zza()) {
/* 66 */                int i3 = zznt.zza;
/* 80 */                return zznp.zzg(zzny.zzA(), zzlt.zza(), zzniVarZzc.zzb());
                    }
/* 25 */            int i4 = zznt.zza;
/* 61 */            return zzno.zzl(cls, zzniVarZzc, zznr.zza(), zzmy.zza(), zzny.zzA(), zzniVarZzc.zzc() + (-1) != 1 ? zzlt.zza() : null, zznh.zza());
                }
            }
