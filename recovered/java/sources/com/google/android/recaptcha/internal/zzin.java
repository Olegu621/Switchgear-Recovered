            package com.google.android.recaptcha.internal;

            import java.util.Arrays;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.h01;
            import p000.j22;
            import p000.pg3;
            import p000.tj2;
            import p000.xt0;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzin extends tj2 implements Function2 {
                final /* synthetic */ Exception zza;
                final /* synthetic */ zziz zzb;
                final /* synthetic */ zzip zzc;
                private /* synthetic */ Object zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzin(Exception exc, zziz zzizVar, zzip zzipVar, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zza = exc;
/* 3 */             this.zzb = zzizVar;
/* 5 */             this.zzc = zzipVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 9 */             zzin zzinVar = new zzin(this.zza, this.zzb, this.zzc, c10Var);
/* 12 */            zzinVar.zzd = obj;
/* 14 */            return zzinVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzin) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    zzys zzysVarZza;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 8 */             y10 y10Var = (y10) this.zzd;
/* 10 */            Exception exc = this.zza;
/* 14 */            if (exc instanceof zzdm) {
/* 19 */                zzysVarZza = ((zzdm) exc).zza();
/* 29 */                zzysVarZza.zze(this.zzb.zza());
                    } else {
/* 33 */                zziz zzizVar = this.zzb;
/* 35 */                zzys zzysVarZzf = zzyt.zzf();
/* 43 */                zzysVarZzf.zze(zzizVar.zza());
/* 47 */                zzysVarZzf.zzr(2);
/* 50 */                zzysVarZzf.zzq(2);
/* 53 */                zzysVarZza = zzysVarZzf;
                    }
/* 58 */            zzyt zzytVar = (zzyt) zzysVarZza.zzk();
/* 60 */            zzytVar.zzl();
/* 63 */            zzytVar.zzk();
/* 74 */            j22.m5667a(exc.getClass()).m3242b();
/* 77 */            exc.getMessage();
/* 80 */            zziz zzizVar2 = this.zzb;
/* 82 */            zzcs zzcsVarZzb = zzizVar2.zzb();
/* 86 */            zzcs zzcsVar = zzizVar2.zza;
/* 88 */            if (zzcsVar == null) {
/* 90 */                zzcsVar = null;
                    }
/* 91 */            zzww zzwwVarZza = zzhd.zza(zzcsVarZzb, zzcsVar);
/* 95 */            String strZzd = zzizVar2.zzd();
/* 103 */           if (strZzd.length() == 0) {
/* 105 */               strZzd = "recaptcha.m.Main.rge";
                    }
/* 117 */           h01 h01Var = (h01) y10Var.mo4406c().get(xt0.f19368w);
/* 127 */           if (h01Var != null ? h01Var.isActive() : true) {
/* 129 */               zzip zzipVar = this.zzc;
/* 131 */               zzpp zzppVarZzh = zzpp.zzh();
/* 135 */               byte[] bArrZzd = zzytVar.zzd();
/* 141 */               String strZzi = zzppVarZzh.zzi(bArrZzd, 0, bArrZzd.length);
/* 145 */               zzpp zzppVarZzh2 = zzpp.zzh();
/* 149 */               byte[] bArrZzd2 = zzwwVarZza.zzd();
/* 14 */                zzipVar.zzb.zzd().zzb(strZzd, (String[]) Arrays.copyOf(new String[]{strZzi, zzppVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length)}, 2));
                    }
/* 165 */           return Unit.f12910a;
                }
            }
