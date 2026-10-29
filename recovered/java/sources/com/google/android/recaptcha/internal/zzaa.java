            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.collections.C1839a;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzaa extends tj2 implements Function2 {
                final /* synthetic */ zzad zza;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzaa(zzad zzadVar, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.zza = zzadVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             return new zzaa(this.zza, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzaa) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 6 */             zzad zzadVar = this.zza;
/* 12 */            String strZza = zzad.zzb(zzadVar).zza();
/* 16 */            zzyu zzyuVarZzf = zzyx.zzf();
/* 20 */            zzyv zzyvVarZzf = zzyw.zzf();
/* 24 */            zzyvVarZzf.zzw(strZza);
/* 35 */            zzyuVarZzf.zze(C1839a.m6210b(zzyvVarZzf.zzk()));
/* 44 */            return zzas.zzb(zzadVar, (zzyx) zzyuVarZzf.zzk());
                }
            }
