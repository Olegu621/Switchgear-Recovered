            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.f42;
            import p000.pg3;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhj {
                public static final Object zza(zzhh zzhhVar, Function2 function2, c10 c10Var) {
/* 6 */             return function2.invoke(new zzhk(zzhhVar), c10Var);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public static final Object zzb(zzhk zzhkVar, zzhf zzhfVar, c10 c10Var) {
                    zzhi zzhiVar;
/* 3 */             if (c10Var instanceof zzhi) {
/* 6 */                 zzhiVar = (zzhi) c10Var;
/* 8 */                 int i = zzhiVar.zzb;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzhiVar.zzb = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzhiVar = new zzhi(c10Var);
                        }
                    } else {
/* 22 */                zzhiVar = new zzhi(c10Var);
                    }
/* 25 */            Object obj = zzhiVar.zza;
/* 27 */            Object obj2 = z10.f19902a;
/* 29 */            int i2 = zzhiVar.zzb;
                    try {
/* 32 */                if (i2 == 0) {
/* 47 */                    pg3.m7417A(obj);
/* 50 */                    zzhiVar.zzb = 1;
/* 56 */                    if (zzhfVar.zza(zzhkVar, zzhiVar) == obj2) {
/* 58 */                        return obj2;
                            }
                        } else {
/* 34 */                    if (i2 != 1) {
/* 42 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 45 */                        return null;
                            }
/* 36 */                    pg3.m7417A(obj);
                        }
/* 59 */                return Unit.f12910a;
                    } catch (Exception unused) {
/* 62 */                return Unit.f12910a;
                    }
                }

                public static final Object zzc(zzgr zzgrVar, zzhg zzhgVar, c10 c10Var) {
/* 5 */             Object objZza = zzhgVar.zza(zzgrVar.zza(), c10Var);
                    return objZza == z10.f19902a ? objZza : Unit.f12910a;
                }

                public static final Object zzd(int i, int i2, Function2 function2, c10 c10Var) {
/* 8 */             return new zzhf(i, function2, new Integer(i2));
                }

                public static final Object zze(zzhk zzhkVar, int i, Function2 function2, c10 c10Var) {
/* 7 */             return new zzhf(i, function2, null).zza(zzhkVar, c10Var);
                }
            }
