            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import p000.InterfaceC1809jx;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfy extends tj2 implements Function1 {
                int zza;
                final /* synthetic */ zzhk zzb;
                final /* synthetic */ zzgb zzc;
                final /* synthetic */ long zzd;
                final /* synthetic */ InterfaceC1809jx zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzfy(zzhk zzhkVar, zzgb zzgbVar, long j, InterfaceC1809jx interfaceC1809jx, c10 c10Var) {
/* 10 */            super(1, c10Var);
/* 1 */             this.zzb = zzhkVar;
/* 3 */             this.zzc = zzgbVar;
/* 5 */             this.zzd = j;
/* 7 */             this.zze = interfaceC1809jx;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(c10 c10Var) {
/* 12 */            return new zzfy(this.zzb, this.zzc, this.zzd, this.zze, c10Var);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
/* 11 */            return ((zzfy) create((c10) obj)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i != 0) {
/* 10 */                return obj;
                    }
/* 11 */            zzhk zzhkVar = this.zzb;
/* 22 */            zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, null);
/* 26 */            this.zza = 1;
/* 30 */            Object objZze = zzhj.zze(zzhkVar, 41, zzfxVar, this);
                    return objZze == z10Var ? z10Var : objZze;
                }
            }
