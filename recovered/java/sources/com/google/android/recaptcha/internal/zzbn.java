            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C1869kx;
            import p000.c10;
            import p000.dl1;
            import p000.gl1;
            import p000.i13;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbn extends tj2 implements Function2 {
                Object zza;
                Object zzb;
                int zzc;
                final /* synthetic */ zzbo zzd;
                private /* synthetic */ Object zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbn(zzbo zzboVar, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.zzd = zzboVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             zzbn zzbnVar = new zzbn(this.zzd, c10Var);
/* 8 */             zzbnVar.zze = obj;
/* 10 */            return zzbnVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzbn) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
                
                    if (((com.google.android.recaptcha.internal.zzhg) r10).zza(r1, r9) == r0) goto L29;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    zzhk zzhkVar;
                    zzbo zzboVar;
                    gl1 gl1Var;
                    dl1 dl1Var;
                    zzhk zzhkVar2;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzc;
                    try {
/* 9 */                 if (i == 0) {
/* 46 */                    pg3.m7417A(obj);
/* 51 */                    zzhkVar = (zzhk) this.zze;
/* 53 */                    zzboVar = this.zzd;
/* 1 */                     dl1 dl1Var2 = zzboVar.zzf;
/* 59 */                    this.zze = zzhkVar;
/* 61 */                    this.zza = dl1Var2;
/* 63 */                    this.zzb = zzboVar;
/* 65 */                    this.zzc = 1;
/* 68 */                    gl1Var = (gl1) dl1Var2;
/* 74 */                    if (gl1Var.m3967d(this) != z10Var) {
                            }
                            dl1Var = gl1Var;
/* 178 */                   return z10Var;
                        }
/* 11 */                if (i == 1) {
/* 31 */                    zzboVar = (zzbo) this.zzb;
/* 35 */                    dl1 dl1Var3 = (dl1) this.zza;
/* 39 */                    zzhk zzhkVar3 = (zzhk) this.zze;
/* 41 */                    pg3.m7417A(obj);
/* 44 */                    zzhkVar = zzhkVar3;
                            dl1Var = dl1Var3;
                        } else if (i != 2) {
/* 15 */                    pg3.m7417A(obj);
                        } else {
/* 22 */                    zzhkVar2 = (zzhk) this.zze;
/* 24 */                    pg3.m7417A(obj);
/* 158 */                   this.zze = null;
/* 160 */                   this.zzc = 3;
                        }
/* 169 */               return Unit.f12910a;
                        dl1Var = gl1Var;
/* 86 */                if (!Intrinsics.m6216a(zzboVar.zzc, zzbp.zza)) {
/* 88 */                    Unit unit = Unit.f12910a;
/* 92 */                    ((gl1) dl1Var).m3970g(null);
/* 95 */                    return unit;
                        }
/* 1 */                 zzboVar.zzc = zzbp.zzb;
/* 105 */               ((gl1) dl1Var).m3970g(null);
/* 108 */               zzbo zzboVar2 = this.zzd;
/* 115 */               zzboVar2.zza = new C1869kx();
/* 130 */               i13.m4443w(zzbo.zzb(zzboVar2).zzc(), null, new zzbm(zzhkVar, zzboVar2, null), 3);
/* 133 */               this.zze = zzhkVar;
/* 135 */               this.zza = null;
/* 137 */               this.zzb = null;
/* 139 */               this.zzc = 2;
/* 148 */               zzhg zzhgVar = new zzhg(new zzbj(zzboVar2, null));
/* 151 */               if (zzhgVar != z10Var) {
/* 154 */                   zzhkVar2 = zzhkVar;
/* 155 */                   obj = zzhgVar;
/* 158 */                   this.zze = null;
/* 160 */                   this.zzc = 3;
                        }
                        dl1Var = gl1Var;
/* 178 */               return z10Var;
                    } catch (Throwable th) {
/* 174 */               ((gl1) dl1Var).m3970g(null);
/* 177 */               throw th;
                    }
                }
            }
