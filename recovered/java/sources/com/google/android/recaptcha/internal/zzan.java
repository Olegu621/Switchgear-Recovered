            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzan extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzar zzb;
                final /* synthetic */ String zzc;
                private /* synthetic */ Object zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzan(zzar zzarVar, String str, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = zzarVar;
/* 3 */             this.zzc = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             zzan zzanVar = new zzan(this.zzb, this.zzc, c10Var);
/* 10 */            zzanVar.zzd = obj;
/* 12 */            return zzanVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzan) create((zzgr) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    zzgr zzgrVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 6 */             if (i == 0) {
/* 22 */                pg3.m7417A(obj);
/* 28 */                zzgrVar = (zzgr) this.zzd;
/* 30 */                zzar zzarVar = this.zzb;
/* 32 */                String str = this.zzc;
/* 34 */                this.zzd = zzgrVar;
/* 36 */                this.zza = 1;
/* 38 */                obj = zzarVar.zze(str, this);
/* 42 */                if (obj != z10Var) {
                        }
                    }
/* 8 */             if (i != 1) {
/* 10 */                pg3.m7417A(obj);
/* 13 */                return obj;
                    }
/* 16 */            zzgrVar = (zzgr) this.zzd;
/* 18 */            pg3.m7417A(obj);
/* 47 */            this.zzd = null;
/* 50 */            this.zza = 2;
/* 56 */            Object objZza = ((zzhg) obj).zza(zzgrVar.zza(), this);
                    return objZza == z10Var ? z10Var : objZza;
                }
            }
