            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.RecaptchaAction;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzem extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzeq zzb;
                final /* synthetic */ long zzc;
                final /* synthetic */ RecaptchaAction zzd;
                private /* synthetic */ Object zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzem(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzb = zzeqVar;
/* 3 */             this.zzc = j;
/* 5 */             this.zzd = recaptchaAction;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 10 */            zzem zzemVar = new zzem(this.zzb, this.zzc, this.zzd, c10Var);
/* 13 */            zzemVar.zze = obj;
/* 15 */            return zzemVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzem) create((zzhh) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i != 0) {
/* 10 */                return obj;
                    }
/* 13 */            zzhh zzhhVar = (zzhh) this.zze;
/* 24 */            zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, null);
/* 28 */            this.zza = 1;
/* 30 */            Object objZza = zzhj.zza(zzhhVar, zzelVar, this);
                    return objZza == z10Var ? z10Var : objZza;
                }
            }
