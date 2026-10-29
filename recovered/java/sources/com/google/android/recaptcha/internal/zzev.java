            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import p000.c10;
            import p000.h22;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzev extends tj2 implements Function1 {
                Object zza;
                int zzb;
                final /* synthetic */ zzgr zzc;
                final /* synthetic */ zzfp zzd;
                final /* synthetic */ zzye zze;
                final /* synthetic */ h22 zzf;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzev(zzgr zzgrVar, zzfp zzfpVar, zzye zzyeVar, h22 h22Var, c10 c10Var) {
/* 10 */            super(1, c10Var);
/* 1 */             this.zzc = zzgrVar;
/* 3 */             this.zzd = zzfpVar;
/* 5 */             this.zze = zzyeVar;
/* 7 */             this.zzf = h22Var;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(c10 c10Var) {
/* 12 */            return new zzev(this.zzc, this.zzd, this.zze, this.zzf, c10Var);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
/* 11 */            return ((zzev) create((c10) obj)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
                    zzgr zzgrVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzb;
                    try {
/* 7 */                 if (i != 0) {
/* 9 */                     if (i != 1) {
/* 11 */                        pg3.m7417A(obj);
                            } else {
/* 19 */                        zzgrVar = (zzgr) this.zza;
/* 21 */                        pg3.m7417A(obj);
                            }
/* 70 */                    return (zzyg) obj;
                        }
/* 25 */                pg3.m7417A(obj);
/* 28 */                zzgrVar = this.zzc;
/* 30 */                zzfp zzfpVar = this.zzd;
/* 32 */                zzye zzyeVar = this.zze;
/* 34 */                this.zza = zzgrVar;
/* 36 */                this.zzb = 1;
/* 47 */                obj = new zzhf(48, new zzes(zzfpVar, zzyeVar, null), null);
/* 50 */                if (obj != z10Var) {
                        }
/* 73 */                return z10Var;
/* 54 */                this.zza = null;
/* 57 */                this.zzb = 2;
/* 63 */                obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
/* 67 */                if (obj == z10Var) {
/* 73 */                    return z10Var;
                        }
/* 70 */                return (zzyg) obj;
                    } catch (zzcg e) {
/* 76 */                this.zzf.f8873a = e;
/* 78 */                throw e;
                    }
                }
            }
