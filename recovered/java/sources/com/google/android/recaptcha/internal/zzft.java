            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import p000.c10;
            import p000.pg3;
            import p000.qj3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzft extends tj2 implements Function1 {
                int zza;
                final /* synthetic */ long zzb;
                final /* synthetic */ zzgb zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzft(long j, zzgb zzgbVar, c10 c10Var) {
/* 6 */             super(1, c10Var);
/* 1 */             this.zzb = j;
/* 3 */             this.zzc = zzgbVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(c10 c10Var) {
/* 7 */             return new zzft(this.zzb, this.zzc, c10Var);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
/* 11 */            return ((zzft) create((c10) obj)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i == 0) {
/* 11 */                long j = this.zzb;
/* 18 */                zzfs zzfsVar = new zzfs(this.zzc, null);
/* 22 */                this.zza = 1;
/* 28 */                if (qj3.m7884Q(j, zzfsVar, this) == z10Var) {
/* 30 */                    return z10Var;
                        }
                    }
/* 31 */            return Unit.f12910a;
                }
            }
