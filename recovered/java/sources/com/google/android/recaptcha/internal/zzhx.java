            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzhx extends tj2 implements Function2 {
                final /* synthetic */ zzib zza;
                final /* synthetic */ String zzb;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzhx(zzib zzibVar, String str, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zza = zzibVar;
/* 3 */             this.zzb = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzhx(this.zza, this.zzb, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzhx) create((zzgr) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 6 */             zzib zzibVar = this.zza;
/* 8 */             zzbt zzbtVarZza = zzib.zza(zzibVar);
/* 12 */            String str = this.zzb;
/* 18 */            if (!zzbtVarZza.zzd(str)) {
/* 80 */                throw new zzcg(zzce.zzk, zzcd.zzS, null, null, 12, null);
                    }
                    try {
/* 24 */                String strZza = zzib.zza(zzibVar).zza(str);
/* 28 */                if (strZza != null) {
/* 30 */                    return strZza;
                        }
/* 45 */                throw new zzcg(zzce.zzk, zzcd.zzS, null, null, 12, null);
                    } catch (Exception e) {
/* 65 */                throw new zzcg(zzce.zzk, zzcd.zzR, e.getMessage(), null, 8, null);
                    }
                }
            }
