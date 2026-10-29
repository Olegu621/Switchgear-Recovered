            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C2103qd;
            import p000.c10;
            import p000.dl1;
            import p000.f42;
            import p000.gl1;
            import p000.pg3;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzdj {
                private Object zza;
                private final dl1 zzb = new gl1();

                public zzdj(Object obj) {
/* 4 */             this.zza = obj;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final Object zza(Object obj, c10 c10Var) {
                    zzdg zzdgVar;
                    gl1 gl1Var;
                    dl1 dl1Var;
/* 3 */             if (c10Var instanceof zzdg) {
/* 6 */                 zzdgVar = (zzdg) c10Var;
/* 8 */                 int i = zzdgVar.zzd;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzdgVar.zzd = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzdgVar = new zzdg(this, c10Var);
                        }
                    } else {
/* 22 */                zzdgVar = new zzdg(this, c10Var);
                    }
/* 25 */            Object obj2 = zzdgVar.zzb;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = zzdgVar.zzd;
/* 33 */            if (i2 == 0) {
/* 55 */                pg3.m7417A(obj2);
/* 58 */                dl1 dl1Var2 = this.zzb;
/* 63 */                zzdgVar.zze = (zzmc) obj;
/* 65 */                zzdgVar.zza = dl1Var2;
/* 67 */                zzdgVar.zzd = 1;
/* 69 */                gl1Var = (gl1) dl1Var2;
/* 75 */                if (gl1Var.m3967d(zzdgVar) == z10Var) {
                            dl1Var = gl1Var;
/* 100 */                   return z10Var;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 51 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 39 */                dl1 dl1Var3 = (dl1) zzdgVar.zza;
/* 41 */                zzmc zzmcVar = zzdgVar.zze;
/* 43 */                pg3.m7417A(obj2);
/* 46 */                dl1Var = dl1Var3;
/* 47 */                obj = zzmcVar;
                    }
                    try {
                        dl1Var = gl1Var;
/* 83 */                return Boolean.valueOf(Intrinsics.m6216a(this.zza, obj));
                    } finally {
/* 96 */                ((gl1) dl1Var).m3970g(null);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final Object zzb(Object[] objArr, c10 c10Var) {
                    zzdh zzdhVar;
                    gl1 gl1Var;
                    dl1 dl1Var;
/* 3 */             if (c10Var instanceof zzdh) {
/* 6 */                 zzdhVar = (zzdh) c10Var;
/* 8 */                 int i = zzdhVar.zzd;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzdhVar.zzd = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzdhVar = new zzdh(this, c10Var);
                        }
                    } else {
/* 22 */                zzdhVar = new zzdh(this, c10Var);
                    }
/* 25 */            Object obj = zzdhVar.zzb;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = zzdhVar.zzd;
/* 33 */            if (i2 == 0) {
/* 55 */                pg3.m7417A(obj);
/* 58 */                dl1 dl1Var2 = this.zzb;
/* 63 */                zzdhVar.zze = (zzmc[]) objArr;
/* 65 */                zzdhVar.zza = dl1Var2;
/* 67 */                zzdhVar.zzd = 1;
/* 69 */                gl1Var = (gl1) dl1Var2;
/* 75 */                if (gl1Var.m3967d(zzdhVar) == z10Var) {
                            dl1Var = gl1Var;
/* 100 */                   return z10Var;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 51 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 39 */                dl1 dl1Var3 = (dl1) zzdhVar.zza;
/* 41 */                zzmc[] zzmcVarArr = zzdhVar.zze;
/* 43 */                pg3.m7417A(obj);
/* 46 */                dl1Var = dl1Var3;
/* 47 */                objArr = zzmcVarArr;
                    }
                    try {
                        dl1Var = gl1Var;
/* 83 */                return Boolean.valueOf(C2103qd.m7772g(objArr, this.zza));
                    } finally {
/* 96 */                ((gl1) dl1Var).m3970g(null);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final Object zzc(Object obj, c10 c10Var) {
                    zzdi zzdiVar;
                    gl1 gl1Var;
                    dl1 dl1Var;
/* 3 */             if (c10Var instanceof zzdi) {
/* 6 */                 zzdiVar = (zzdi) c10Var;
/* 8 */                 int i = zzdiVar.zzd;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzdiVar.zzd = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzdiVar = new zzdi(this, c10Var);
                        }
                    } else {
/* 22 */                zzdiVar = new zzdi(this, c10Var);
                    }
/* 25 */            Object obj2 = zzdiVar.zzb;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = zzdiVar.zzd;
/* 33 */            if (i2 == 0) {
/* 55 */                pg3.m7417A(obj2);
/* 58 */                dl1 dl1Var2 = this.zzb;
/* 63 */                zzdiVar.zze = (zzmc) obj;
/* 65 */                zzdiVar.zza = dl1Var2;
/* 67 */                zzdiVar.zzd = 1;
/* 69 */                gl1Var = (gl1) dl1Var2;
/* 75 */                if (gl1Var.m3967d(zzdiVar) == z10Var) {
                            dl1Var = gl1Var;
/* 94 */                    return z10Var;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 51 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 39 */                dl1 dl1Var3 = (dl1) zzdiVar.zza;
/* 41 */                zzmc zzmcVar = zzdiVar.zze;
/* 43 */                pg3.m7417A(obj2);
/* 46 */                dl1Var = dl1Var3;
/* 47 */                obj = zzmcVar;
                    }
                    try {
                        dl1Var = gl1Var;
/* 77 */                this.zza = obj;
/* 84 */                return Unit.f12910a;
                    } finally {
/* 90 */                ((gl1) dl1Var).m3970g(null);
                    }
                }
            }
