            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.C1869kx;
            import p000.c10;
            import p000.i13;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzlu extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzly zzb;
                private /* synthetic */ Object zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzlu(zzly zzlyVar, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.zzb = zzlyVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             zzlu zzluVar = new zzlu(this.zzb, c10Var);
/* 8 */             zzluVar.zzc = obj;
/* 10 */            return zzluVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzlu) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
                
                    if (r7.zzc(r1, r6) == r0) goto L19;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    zzhk zzhkVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 6 */             if (i != 0) {
/* 10 */                zzhkVar = (zzhk) this.zzc;
/* 12 */                pg3.m7417A(obj);
/* 15 */                if (i == 1) {
                        }
/* 84 */                zzly zzlyVar = this.zzb;
/* 91 */                zzlyVar.zza = new C1869kx();
/* 108 */               i13.m4443w(zzlyVar.zzD().zza(), null, new zzlt(zzhkVar, zzlyVar, null), 3);
/* 111 */               return Unit.f12910a;
                    }
/* 18 */            pg3.m7417A(obj);
/* 23 */            zzhk zzhkVar2 = (zzhk) this.zzc;
/* 27 */            zzdj zzdjVarZzn = this.zzb.zzn();
/* 37 */            zzmc[] zzmcVarArr = {zzmc.zzd, zzmc.zzc, zzmc.zzb};
/* 41 */            this.zzc = zzhkVar2;
/* 43 */            this.zza = 1;
/* 45 */            Object objZzb = zzdjVarZzn.zzb(zzmcVarArr, this);
/* 49 */            if (objZzb != z10Var) {
/* 51 */                zzhkVar = zzhkVar2;
/* 52 */                obj = objZzb;
                    }
/* 114 */           return z10Var;
/* 59 */            if (((Boolean) obj).booleanValue()) {
/* 61 */                return Unit.f12910a;
                    }
/* 66 */            zzdj zzdjVarZzn2 = this.zzb.zzn();
/* 70 */            zzmc zzmcVar = zzmc.zzb;
/* 72 */            this.zzc = zzhkVar;
/* 75 */            this.zza = 2;
                }
            }
