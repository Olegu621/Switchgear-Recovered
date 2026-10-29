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
            final class zze extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzgr zzc;
                final /* synthetic */ zzg zzd;
                final /* synthetic */ String zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zze(zzgr zzgrVar, zzg zzgVar, String str, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzc = zzgrVar;
/* 3 */             this.zzd = zzgVar;
/* 5 */             this.zze = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 9 */             return new zze(this.zzc, this.zzd, this.zze, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zze) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
                    zzgr zzgrVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzb;
/* 6 */             if (i == 0) {
/* 22 */                pg3.m7417A(obj);
/* 25 */                zzgrVar = this.zzc;
/* 27 */                zzg zzgVar = this.zzd;
/* 29 */                String str = this.zze;
/* 31 */                this.zza = zzgrVar;
/* 33 */                this.zzb = 1;
/* 35 */                obj = zzgVar.zzb(str, this);
/* 39 */                if (obj != z10Var) {
                        }
                    }
/* 8 */             if (i != 1) {
/* 10 */                pg3.m7417A(obj);
/* 13 */                return obj;
                    }
/* 16 */            zzgrVar = (zzgr) this.zza;
/* 18 */            pg3.m7417A(obj);
/* 44 */            this.zza = null;
/* 47 */            this.zzb = 2;
/* 53 */            Object objZza = ((zzhg) obj).zza(zzgrVar.zza(), this);
                    return objZza == z10Var ? z10Var : objZza;
                }
            }
