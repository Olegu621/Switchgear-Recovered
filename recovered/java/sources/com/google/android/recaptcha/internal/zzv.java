            package com.google.android.recaptcha.internal;

            import android.os.Build;
            import kotlin.Unit;
            import kotlin.collections.C1839a;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzv extends tj2 implements Function2 {
                final /* synthetic */ zzx zza;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzv(zzx zzxVar, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.zza = zzxVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             return new zzv(this.zza, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzv) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 6 */             zzx zzxVar = this.zza;
/* 12 */            String strZza = zzbs.zza(zzx.zzb(zzxVar));
/* 20 */            if (strZza.length() == 0) {
/* 26 */                if (Build.VERSION.SDK_INT > 34) {
/* 58 */                    throw new zzcg(zzce.zzb, zzcd.zzaE, null, null, 12, null);
                        }
/* 58 */                throw new zzcg(zzce.zzb, zzcd.zzaF, null, null, 12, null);
                    }
/* 59 */            zzyu zzyuVarZzf = zzyx.zzf();
/* 63 */            zzyv zzyvVarZzf = zzyw.zzf();
/* 67 */            zzyvVarZzf.zzw(strZza);
/* 78 */            zzyuVarZzf.zze(C1839a.m6210b(zzyvVarZzf.zzk()));
/* 87 */            return zzas.zzb(zzxVar, (zzyx) zzyuVarZzf.zzk());
                }
            }
