            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzed extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzeh zzb;
                final /* synthetic */ String zzc;
                final /* synthetic */ zzdw zzd;
                final /* synthetic */ zzdq zze;
                final /* synthetic */ long zzf;
                private /* synthetic */ Object zzg;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzed(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j, c10 c10Var) {
/* 12 */            super(2, c10Var);
/* 1 */             this.zzb = zzehVar;
/* 3 */             this.zzc = str;
/* 5 */             this.zzd = zzdwVar;
/* 7 */             this.zze = zzdqVar;
/* 9 */             this.zzf = j;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 14 */            zzed zzedVar = new zzed(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, c10Var);
/* 17 */            zzedVar.zzg = obj;
/* 19 */            return zzedVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzed) create((zzhh) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i != 0) {
/* 10 */                return obj;
                    }
/* 14 */            zzhh zzhhVar = (zzhh) this.zzg;
/* 29 */            zzec zzecVar = new zzec(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzhhVar, null);
/* 33 */            this.zza = 1;
/* 35 */            Object objZza = zzhj.zza(zzhhVar, zzecVar, this);
                    return objZza == z10Var ? z10Var : objZza;
                }
            }
