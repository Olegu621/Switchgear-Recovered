            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.m42;
            import p000.n42;
            import p000.o42;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzm extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzgr zzc;
                final /* synthetic */ zzg zzd;
                final /* synthetic */ long zze;
                final /* synthetic */ zzxn zzf;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzm(zzgr zzgrVar, zzg zzgVar, long j, zzxn zzxnVar, c10 c10Var) {
/* 10 */            super(2, c10Var);
/* 1 */             this.zzc = zzgrVar;
/* 3 */             this.zzd = zzgVar;
/* 5 */             this.zze = j;
/* 7 */             this.zzf = zzxnVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 12 */            return new zzm(this.zzc, this.zzd, this.zze, this.zzf, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzm) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    Object n42Var;
                    zzgr zzgrVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzb;
                    try {
/* 7 */                 if (i != 0) {
/* 9 */                     if (i != 1) {
/* 11 */                        pg3.m7417A(obj);
                            } else {
/* 17 */                        zzgrVar = (zzgr) this.zza;
/* 19 */                        pg3.m7417A(obj);
                            }
/* 74 */                    m42 m42Var = o42.f14612b;
/* 76 */                    n42Var = Unit.f12910a;
/* 92 */                    return new o42(n42Var);
                        }
/* 23 */                pg3.m7417A(obj);
/* 26 */                zzgrVar = this.zzc;
/* 28 */                zzg zzgVar = this.zzd;
/* 30 */                long j = this.zze;
/* 32 */                zzxn zzxnVar = this.zzf;
/* 34 */                this.zza = zzgrVar;
/* 36 */                this.zzb = 1;
/* 50 */                zzhf zzhfVar = new zzhf(zzgVar.zzk(), new zzd(zzgVar, j, zzxnVar, null), null);
/* 53 */                if (zzhfVar != z10Var) {
/* 55 */                    obj = zzhfVar;
                        }
/* 79 */                return z10Var;
/* 58 */                this.zza = null;
/* 61 */                this.zzb = 2;
/* 71 */                if (((zzhf) obj).zza(zzgrVar.zza(), this) == z10Var) {
/* 79 */                    return z10Var;
                        }
/* 74 */                m42 m42Var2 = o42.f14612b;
/* 76 */                n42Var = Unit.f12910a;
                    } catch (zzcg e) {
/* 82 */                m42 m42Var3 = o42.f14612b;
/* 86 */                n42Var = new n42(e);
                    }
/* 92 */            return new o42(n42Var);
                }
            }
