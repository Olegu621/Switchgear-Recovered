            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.k50;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzo extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzq zzb;
                final /* synthetic */ long zzc;
                final /* synthetic */ zzxn zzd;
                private /* synthetic */ Object zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzo(zzq zzqVar, long j, zzxn zzxnVar, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzb = zzqVar;
/* 3 */             this.zzc = j;
/* 5 */             this.zzd = zzxnVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 10 */            zzo zzoVar = new zzo(this.zzb, this.zzc, this.zzd, c10Var);
/* 13 */            zzoVar.zze = obj;
/* 15 */            return zzoVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzo) create((zzgr) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i == 0) {
/* 25 */                zzn zznVar = new zzn(this.zzb, (zzgr) this.zze, this.zzc, this.zzd, null);
/* 29 */                this.zza = 1;
/* 35 */                if (k50.m5966c(zznVar, this) == z10Var) {
/* 37 */                    return z10Var;
                        }
                    }
/* 38 */            return Unit.f12910a;
                }
            }
