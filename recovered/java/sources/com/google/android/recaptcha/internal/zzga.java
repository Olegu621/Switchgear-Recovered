            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C1869kx;
            import p000.c10;
            import p000.i13;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzga extends tj2 implements Function2 {
                final /* synthetic */ zzgb zza;
                final /* synthetic */ long zzb;
                private /* synthetic */ Object zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzga(zzgb zzgbVar, long j, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zza = zzgbVar;
/* 3 */             this.zzb = j;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             zzga zzgaVar = new zzga(this.zza, this.zzb, c10Var);
/* 10 */            zzgaVar.zzc = obj;
/* 12 */            return zzgaVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzga) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 9 */             zzhk zzhkVar = (zzhk) this.zzc;
/* 11 */            zzgb zzgbVar = this.zza;
/* 25 */            if (Intrinsics.m6216a(zzgbVar.zze(), zzdv.zzb) || Intrinsics.m6216a(zzgbVar.zze(), zzdv.zzc)) {
/* 108 */               return Unit.f12910a;
                    }
/* 54 */            if (Intrinsics.m6216a(zzgbVar.zze(), zzdv.zzd) && !zzgb.zzo(zzgbVar, zzgbVar.zzd)) {
/* 66 */                return Unit.f12910a;
                    }
/* 1 */             zzgbVar.zzf = zzdv.zzc;
/* 78 */            C1869kx c1869kx = new C1869kx();
/* 1 */             zzgbVar.zzb = c1869kx;
/* 102 */           i13.m4443w(zzgb.zzd(zzgbVar).zza(), null, new zzfz(zzgbVar, c1869kx, zzhkVar, this.zzb, null), 3);
/* 105 */           return Unit.f12910a;
                }
            }
