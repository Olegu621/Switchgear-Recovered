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
            final class zzbh extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzbo zzc;
                final /* synthetic */ zzhk zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbh(zzbo zzboVar, zzhk zzhkVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzc = zzboVar;
/* 3 */             this.zzd = zzhkVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzbh(this.zzc, this.zzd, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzbh) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
                
                    if (((com.google.android.recaptcha.internal.zzhg) r4).zza(r1, r3) == r0) goto L14;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    zzhk zzhkVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzb;
/* 6 */             if (i != 0) {
/* 8 */                 if (i != 1) {
/* 10 */                    pg3.m7417A(obj);
                        } else {
/* 16 */                    zzhkVar = (zzhk) this.zza;
/* 18 */                    pg3.m7417A(obj);
                        }
/* 59 */                return Unit.f12910a;
                    }
/* 22 */            pg3.m7417A(obj);
/* 25 */            zzbo zzboVar = this.zzc;
/* 1 */             zzboVar.zzc = zzbp.zza;
/* 32 */            zzhkVar = this.zzd;
/* 34 */            this.zza = zzhkVar;
/* 36 */            this.zzb = 1;
/* 38 */            obj = zzboVar.zze(this);
/* 42 */            if (obj != z10Var) {
                    }
/* 62 */            return z10Var;
/* 47 */            this.zza = null;
/* 50 */            this.zzb = 2;
                }
            }
