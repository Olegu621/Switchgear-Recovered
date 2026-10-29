            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.lo2;
            import p000.pg3;
            import p000.qj3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfd extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ long zzb;
                final /* synthetic */ zzfp zzc;
                final /* synthetic */ zzxn zzd;
                private /* synthetic */ Object zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzfd(long j, zzfp zzfpVar, zzxn zzxnVar, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzb = j;
/* 3 */             this.zzc = zzfpVar;
/* 5 */             this.zzd = zzxnVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 10 */            zzfd zzfdVar = new zzfd(this.zzb, this.zzc, this.zzd, c10Var);
/* 13 */            zzfdVar.zze = obj;
/* 15 */            return zzfdVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzfd) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
/* 1 */             z10 z10Var = z10.f19902a;
                    try {
/* 5 */                 if (this.zza != 0) {
/* 7 */                     pg3.m7417A(obj);
                        } else {
/* 11 */                    pg3.m7417A(obj);
/* 17 */                    zzhk zzhkVar = (zzhk) this.zze;
/* 19 */                    long j = this.zzb;
/* 28 */                    zzfc zzfcVar = new zzfc(zzhkVar, this.zzc, this.zzd, j, null);
/* 32 */                    this.zza = 1;
/* 38 */                    if (qj3.m7884Q(j, zzfcVar, this) == z10Var) {
/* 40 */                        return z10Var;
                            }
                        }
/* 41 */                return Unit.f12910a;
                    } catch (zzcg e) {
/* 86 */                throw e;
                    } catch (lo2 e2) {
/* 83 */                throw new zzcg(zzce.zzb, zzcd.zzb, e2.getMessage(), null, 8, null);
                    } catch (Exception e3) {
/* 63 */                throw new zzcg(zzce.zzb, zzcd.zzap, e3.getMessage(), null, 8, null);
                    }
                }
            }
