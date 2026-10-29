            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.i13;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzez extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzfp zzb;
                private /* synthetic */ Object zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzez(zzfp zzfpVar, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.zzb = zzfpVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             zzez zzezVar = new zzez(this.zzb, c10Var);
/* 8 */             zzezVar.zzc = obj;
/* 10 */            return zzezVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzez) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i != 0) {
/* 10 */                return obj;
                    }
/* 13 */            zzhk zzhkVar = (zzhk) this.zzc;
/* 15 */            zzfp zzfpVar = this.zzb;
/* 25 */            CoroutineContext coroutineContextMo4406c = zzfp.zzf(zzfpVar).zza().mo4406c();
/* 32 */            zzey zzeyVar = new zzey(zzfpVar, zzhkVar, null);
/* 36 */            this.zza = 1;
/* 38 */            Object objM4422D = i13.m4422D(coroutineContextMo4406c, zzeyVar, this);
                    return objM4422D == z10Var ? z10Var : objM4422D;
                }
            }
