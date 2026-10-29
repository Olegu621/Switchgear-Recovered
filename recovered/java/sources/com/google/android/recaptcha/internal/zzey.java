            package com.google.android.recaptcha.internal;

            import android.app.Application;
            import android.os.Build;
            import com.google.android.recaptcha.RecaptchaException;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzey extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzfp zzb;
                final /* synthetic */ zzhk zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzey(zzfp zzfpVar, zzhk zzhkVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = zzfpVar;
/* 3 */             this.zzc = zzhkVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzey(this.zzb, this.zzc, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzey) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws RecaptchaException {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i != 0) {
/* 10 */                return obj;
                    }
/* 11 */            zzfp zzfpVar = this.zzb;
/* 1 */             String str = zzfpVar.zza;
/* 1 */             zzfpVar.zzs();
/* 31 */            String strZza = this.zzc.zza().zza();
/* 35 */            zzci zzciVarZze = zzfp.zze(zzfpVar);
/* 39 */            zzda zzdaVarZzh = zzfp.zzh(zzfpVar);
/* 1 */             Application applicationZzs = zzfpVar.zzs();
/* 47 */            int i2 = Build.VERSION.SDK_INT;
/* 49 */            String strZza2 = zzciVarZze.zza();
/* 53 */            zzzc zzzcVarZzf = zzzd.zzf();
/* 57 */            zzzcVarZzf.zzw(str);
/* 60 */            zzzcVarZzf.zzt("com.supercell.brawlstars");
/* 67 */            zzzcVarZzf.zzx(zzdaVarZzh.zzd(applicationZzs));
/* 72 */            zzzcVarZzf.zzu("18.7.1");
/* 75 */            zzzcVarZzf.zzv(strZza);
/* 82 */            zzzcVarZzf.zzs(String.valueOf(i2));
/* 85 */            zzzcVarZzf.zzr(strZza2);
/* 92 */            zzzcVarZzf.zzf(zzdaVarZzh.zzb(applicationZzs));
/* 99 */            zzzcVarZzf.zzq(zzdaVarZzh.zzc(applicationZzs));
/* 106 */           zzzcVarZzf.zze(zzdaVarZzh.zza(applicationZzs));
/* 113 */           zzzd zzzdVar = (zzzd) zzzcVarZzf.zzk();
/* 119 */           zzzd zzzdVarZza = zzfp.zzb(zzfpVar).zza();
/* 127 */           zzzc zzzcVar = (zzzc) zzzdVar.zzr();
/* 129 */           zzzcVar.zzh(zzzdVarZza);
/* 136 */           zzzd zzzdVar2 = (zzzd) zzzcVar.zzk();
/* 138 */           zzht zzhtVarZzi = zzfp.zzi(zzfpVar);
/* 146 */           String strZzb = zzfp.zzg(zzfpVar).zzb();
/* 151 */           this.zza = 1;
/* 153 */           Object objZzc = zzhtVarZzi.zzc(strZzb, zzzdVar2, this);
                    return objZzc == z10Var ? z10Var : objZzc;
                }
            }
