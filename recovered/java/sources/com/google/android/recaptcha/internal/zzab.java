            package com.google.android.recaptcha.internal;

            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.nc1;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzab extends tj2 implements Function2 {
                final /* synthetic */ zzxp zza;
                final /* synthetic */ zzad zzb;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzab(zzxp zzxpVar, zzad zzadVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zza = zzxpVar;
/* 3 */             this.zzb = zzadVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzab(this.zza, this.zzb, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzab) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 6 */             zzxp zzxpVar = this.zza;
/* 12 */            int length = zzxpVar.zzl().length();
/* 16 */            zzad zzadVar = this.zzb;
/* 18 */            if (length != 0) {
/* 39 */                zzad.zzb(zzadVar).zzb(nc1.m6963d(new Pair("_GRECAPTCHA_KC", zzxpVar.zzl())));
/* 42 */                return Unit.f12910a;
                    }
/* 46 */            zzadVar.zzj(false);
/* 63 */            throw new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null);
                }
            }
