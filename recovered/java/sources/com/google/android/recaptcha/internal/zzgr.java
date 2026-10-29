            package com.google.android.recaptcha.internal;

            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgr {
                private final zzhk zza;
                private final Integer zzb;
                private final String zzc;
                private final long zzd;
                private final p51 zze;
                private final int zzf;

                public zzgr(zzhk zzhkVar, int i, Integer num) {
/* 4 */             this.zza = zzhkVar;
/* 6 */             this.zzf = i;
/* 8 */             this.zzb = num;
/* 10 */            int i2 = zzby.zza;
/* 18 */            this.zze = r51.m8065b(zzgq.zza);
/* 20 */            zzd();
/* 35 */            this.zzc = zzvl.zzc(zzvl.zzb(System.currentTimeMillis()));
/* 37 */            zzd();
/* 44 */            this.zzd = System.currentTimeMillis();
                }

                private final zzdk zzd() {
/* 7 */             return (zzdk) this.zze.getValue();
                }

                private final zzwk zze(int i) {
/* 1 */             zzwk zzwkVarZzj = zzwn.zzj();
/* 7 */             zzwkVarZzj.zzA(this.zzf);
/* 14 */            zzwkVarZzj.zzr(zzgl.zza());
/* 17 */            zzhk zzhkVar = this.zza;
/* 23 */            zzwkVarZzj.zzy(zzhkVar.zzb());
/* 34 */            zzwkVarZzj.zzu(zzhkVar.zza().zza());
/* 45 */            zzwkVarZzj.zzB(zzhkVar.zza().zzc());
/* 48 */            zzwkVarZzj.zzC(i);
/* 53 */            zzwkVarZzj.zzx(this.zzc);
/* 56 */            zzd();
/* 66 */            zzwkVarZzj.zzs(System.currentTimeMillis() - this.zzd);
/* 69 */            Integer num = this.zzb;
/* 71 */            if (num != null) {
/* 77 */                zzwkVarZzj.zzw(num.intValue());
                    }
/* 80 */            return zzwkVarZzj;
                }

                public final zzhk zza() {
/* 1 */             return this.zza;
                }

                public final void zzb() {
/* 2 */             zzwk zzwkVarZze = zze(3);
/* 6 */             int i = zzgl.zza;
/* 19 */            zzgl.zzb(zzwkVarZze, this.zza.zza().zzb(), null);
                }

                public final void zzc(zzcg zzcgVar) {
/* 1 */             zzvy zzvyVarZzg = zzwa.zzg();
/* 17 */            zzvyVarZzg.zzr(String.valueOf(zzcgVar.zzb().zza()));
/* 28 */            zzvyVarZzg.zze(zzcgVar.zza().zza());
/* 43 */            zzvyVarZzg.zzq(zzcgVar.zzc().getErrorCode().getErrorCode());
/* 46 */            String strZzd = zzcgVar.zzd();
/* 50 */            if (strZzd != null) {
/* 52 */                zzvyVarZzg.zzf(strZzd);
                    }
/* 56 */            zzwk zzwkVarZze = zze(4);
/* 60 */            zzhk zzhkVar = this.zza;
/* 62 */            int i = zzgl.zza;
/* 78 */            zzgl.zzb(zzwkVarZze, zzhkVar.zza().zzb(), (zzwa) zzvyVarZzg.zzk());
                }
            }
