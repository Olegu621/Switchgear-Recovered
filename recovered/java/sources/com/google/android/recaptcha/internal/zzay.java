            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzay extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzba zzb;
                final /* synthetic */ zzxp zzc;
                private /* synthetic */ Object zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzay(zzba zzbaVar, zzxp zzxpVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = zzbaVar;
/* 3 */             this.zzc = zzxpVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             zzay zzayVar = new zzay(this.zzb, this.zzc, c10Var);
/* 10 */            zzayVar.zzd = obj;
/* 12 */            return zzayVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzay) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
                
                    if (((com.google.android.recaptcha.internal.zzhg) r9).zza(r1, r8) == r0) goto L18;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws zzcg {
                    zzhk zzhkVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 6 */             if (i != 0) {
/* 8 */                 if (i != 1) {
/* 10 */                    pg3.m7417A(obj);
                        } else {
/* 16 */                    zzhkVar = (zzhk) this.zzd;
/* 18 */                    pg3.m7417A(obj);
                        }
/* 109 */               return Unit.f12910a;
                    }
/* 22 */            pg3.m7417A(obj);
/* 28 */            zzhkVar = (zzhk) this.zzd;
/* 30 */            zzba zzbaVar = this.zzb;
/* 44 */            if (zzbaVar.zzb.zzb(zzba.zzb(zzbaVar))) {
/* 46 */                zzxp zzxpVar = this.zzc;
/* 56 */                if (zzxpVar.zzf() != 0) {
/* 1 */                     zzbaVar.zzd = zzba.zzp(zzxpVar.zzg());
/* 77 */                    zzbaVar.zza.zzj(zzxpVar.zzf());
/* 1 */                     zzbo zzboVar = zzbaVar.zza;
/* 84 */                    this.zzd = zzhkVar;
/* 86 */                    this.zza = 1;
/* 88 */                    obj = zzboVar.zze(this);
/* 92 */                    if (obj != z10Var) {
                            }
/* 112 */                   return z10Var;
                        }
                    }
/* 114 */           zzbaVar.zzo(false);
/* 131 */           throw new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null);
/* 97 */            this.zzd = null;
/* 100 */           this.zza = 2;
                }
            }
