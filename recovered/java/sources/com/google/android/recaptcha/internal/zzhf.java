            package com.google.android.recaptcha.internal;

            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.f42;
            import p000.pg3;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhf {
                private final Function2 zza;
                private final Integer zzb;
                private final int zzc;

                public zzhf(int i, Function2 function2, Integer num) {
/* 4 */             this.zzc = i;
/* 6 */             this.zza = function2;
/* 8 */             this.zzb = num;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final Object zza(zzhk zzhkVar, c10 c10Var) throws zzcg {
                    zzhe zzheVar;
                    zzcg e;
                    zzgr zzgrVar;
/* 3 */             if (c10Var instanceof zzhe) {
/* 6 */                 zzheVar = (zzhe) c10Var;
/* 8 */                 int i = zzheVar.zzc;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzheVar.zzc = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzheVar = new zzhe(this, c10Var);
                        }
                    } else {
/* 22 */                zzheVar = new zzhe(this, c10Var);
                    }
/* 25 */            Object objInvoke = zzheVar.zza;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = zzheVar.zzc;
/* 32 */            if (i2 == 0) {
/* 51 */                pg3.m7417A(objInvoke);
/* 60 */                zzgr zzgrVar2 = new zzgr(zzhkVar, this.zzc, this.zzb);
                        try {
/* 63 */                    Function2 function2 = this.zza;
/* 65 */                    zzheVar.zzd = zzgrVar2;
/* 67 */                    zzheVar.zzc = 1;
/* 69 */                    objInvoke = function2.invoke(zzgrVar2, zzheVar);
/* 73 */                    if (objInvoke == z10Var) {
/* 80 */                        return z10Var;
                            }
/* 75 */                    zzgrVar = zzgrVar2;
                        } catch (zzcg e2) {
/* 82 */                    e = e2;
/* 83 */                    zzgrVar = zzgrVar2;
/* 84 */                    zzgrVar.zzc(e);
/* 87 */                    throw e;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 46 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 49 */                    return null;
                        }
/* 36 */                zzgrVar = zzheVar.zzd;
                        try {
/* 38 */                    pg3.m7417A(objInvoke);
                        } catch (zzcg e3) {
/* 42 */                    e = e3;
/* 84 */                    zzgrVar.zzc(e);
/* 87 */                    throw e;
                        }
                    }
/* 76 */            zzgrVar.zzb();
/* 79 */            return objInvoke;
                }
            }
