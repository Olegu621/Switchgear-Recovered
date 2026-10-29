            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzer extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzfp zzb;
                final /* synthetic */ zzye zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzer(zzfp zzfpVar, zzye zzyeVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = zzfpVar;
/* 3 */             this.zzc = zzyeVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzer(this.zzb, this.zzc, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzer) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
/* 1 */             z10 z10Var = z10.f19902a;
                    try {
/* 5 */                 if (this.zza != 0) {
/* 7 */                     pg3.m7417A(obj);
                        } else {
/* 13 */                    pg3.m7417A(obj);
/* 16 */                    zzfp zzfpVar = this.zzb;
/* 18 */                    zzif zzifVarZzj = zzfp.zzj(zzfpVar);
/* 22 */                    zzcy zzcyVarZzg = zzfp.zzg(zzfpVar);
/* 26 */                    zzye zzyeVar = this.zzc;
/* 29 */                    this.zza = 1;
/* 31 */                    obj = zzifVarZzj.zzb(zzcyVarZzg, zzyeVar, this);
/* 35 */                    if (obj == z10Var) {
/* 37 */                        return z10Var;
                            }
                        }
/* 38 */                return (zzyg) obj;
                    } catch (Exception e) {
/* 47 */                throw zzfp.zzd(this.zzb, e);
                    }
                }
            }
