            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import p000.c10;
            import p000.lo2;
            import p000.pg3;
            import p000.qj3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfo extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ long zzb;
                final /* synthetic */ zzfp zzc;
                private /* synthetic */ Object zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzfo(long j, zzfp zzfpVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = j;
/* 3 */             this.zzc = zzfpVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             zzfo zzfoVar = new zzfo(this.zzb, this.zzc, c10Var);
/* 10 */            zzfoVar.zzd = obj;
/* 12 */            return zzfoVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzfo) create((zzgr) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             z10 z10Var = z10.f19902a;
                    try {
/* 5 */                 if (this.zza != 0) {
/* 7 */                     pg3.m7417A(obj);
                        } else {
/* 20 */                    pg3.m7417A(obj);
/* 25 */                    zzgr zzgrVar = (zzgr) this.zzd;
/* 27 */                    long j = this.zzb;
/* 34 */                    zzfn zzfnVar = new zzfn(zzgrVar, this.zzc, null);
/* 38 */                    this.zza = 1;
/* 40 */                    obj = qj3.m7884Q(j, zzfnVar, this);
/* 44 */                    if (obj == z10Var) {
/* 46 */                        return z10Var;
                            }
                        }
/* 47 */                return (zzxn) obj;
                    } catch (zzcg e) {
/* 108 */               if (Intrinsics.m6216a(e.zzb(), zzce.zzc)) {
/* 116 */                   throw this.zzc.zzt(e, e);
                        }
/* 117 */               throw e;
                    } catch (lo2 e2) {
/* 97 */                throw this.zzc.zzt(e2, new zzcg(zzce.zzc, zzcd.zzb, e2.getMessage(), null, 8, null));
                    } catch (Exception e3) {
/* 73 */                throw this.zzc.zzt(e3, new zzcg(zzce.zzc, zzcd.zzaz, e3.getMessage(), null, 8, null));
                    }
                }
            }
