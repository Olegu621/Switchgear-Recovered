            package com.google.android.recaptcha.internal;

            import java.util.Timer;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbj extends tj2 implements Function2 {
                final /* synthetic */ zzbo zza;
                private /* synthetic */ Object zzb;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbj(zzbo zzboVar, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.zza = zzboVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             zzbj zzbjVar = new zzbj(this.zza, c10Var);
/* 8 */             zzbjVar.zzb = obj;
/* 10 */            return zzbjVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzbj) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 8 */             zzhk zzhkVar = (zzhk) this.zzb;
/* 10 */            zzbo zzboVar = this.zza;
/* 16 */            if (!zzboVar.zzg) {
/* 32 */                new Timer().schedule(new zzbi(zzboVar, zzhkVar), 28800000L, 28800000L);
/* 2 */                 zzboVar.zzg = true;
                    }
/* 39 */            return Unit.f12910a;
                }
            }
