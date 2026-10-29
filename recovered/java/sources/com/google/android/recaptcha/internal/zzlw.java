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
            final class zzlw extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzly zzc;
                final /* synthetic */ zzgr zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzlw(zzly zzlyVar, zzgr zzgrVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzc = zzlyVar;
/* 3 */             this.zzd = zzgrVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzlw(this.zzc, this.zzd, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzlw) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
                
                    if (p000.qj3.m7884Q(20000, r10, r9) == r1) goto L23;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws zzcg {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzb;
                    try {
/* 7 */                 if (i == 0) {
/* 32 */                    pg3.m7417A(obj);
/* 35 */                    zzly zzlyVar = this.zzc;
/* 37 */                    this.zzb = 1;
/* 43 */                    if (zzlyVar.zzw(this) != z10Var) {
                            }
/* 112 */                   return z10Var;
                        }
/* 9 */                 if (i == 1) {
/* 28 */                    pg3.m7417A(obj);
                        } else {
/* 11 */                    if (i != 2) {
/* 22 */                        zzcg zzcgVar = (zzcg) this.zza;
/* 24 */                        pg3.m7417A(obj);
/* 114 */                       throw zzcgVar;
                            }
/* 13 */                    pg3.m7417A(obj);
                        }
/* 66 */                return Unit.f12910a;
/* 52 */                zzlv zzlvVar = new zzlv(this.zzc, this.zzd, null);
/* 55 */                this.zzb = 2;
                    } catch (Exception e) {
/* 69 */                e.getMessage();
/* 89 */                zzcg zzcgVarZza = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzV, e.getMessage(), null, 8, null));
/* 95 */                zzdj zzdjVarZzn = this.zzc.zzn();
/* 99 */                zzmc zzmcVar = zzmc.zza;
/* 101 */               this.zza = zzcgVarZza;
/* 104 */               this.zzb = 3;
/* 110 */               if (zzdjVarZzn.zzc(zzmcVar, this) != z10Var) {
/* 114 */                   throw zzcgVarZza;
                        }
                    }
                }
            }
