            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.k50;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzlx extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzly zzb;
                private /* synthetic */ Object zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzlx(zzly zzlyVar, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.zzb = zzlyVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             zzlx zzlxVar = new zzlx(this.zzb, c10Var);
/* 8 */             zzlxVar.zzc = obj;
/* 10 */            return zzlxVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzlx) create((zzgr) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i == 0) {
/* 20 */                zzlw zzlwVar = new zzlw(this.zzb, (zzgr) this.zzc, null);
/* 24 */                this.zza = 1;
/* 30 */                if (k50.m5966c(zzlwVar, this) == z10Var) {
/* 32 */                    return z10Var;
                        }
                    }
/* 33 */            return Unit.f12910a;
                }
            }
