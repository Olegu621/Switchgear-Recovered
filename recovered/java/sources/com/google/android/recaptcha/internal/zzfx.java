            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.C1869kx;
            import p000.InterfaceC1809jx;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfx extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzgb zzc;
                final /* synthetic */ long zzd;
                final /* synthetic */ InterfaceC1809jx zze;
                private /* synthetic */ Object zzf;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzfx(zzgb zzgbVar, long j, InterfaceC1809jx interfaceC1809jx, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzc = zzgbVar;
/* 3 */             this.zzd = j;
/* 5 */             this.zze = interfaceC1809jx;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 10 */            zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, c10Var);
/* 13 */            zzfxVar.zzf = obj;
/* 15 */            return zzfxVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzfx) create((zzgr) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:30:0x007c A[Catch: zzcg -> 0x0015, PHI: r1 r9
  0x007c: PHI (r1v7 com.google.android.recaptcha.internal.zzgr) = (r1v6 com.google.android.recaptcha.internal.zzgr), (r1v14 com.google.android.recaptcha.internal.zzgr) binds: [B:29:0x007a, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r9v12 java.lang.Object) = (r9v11 java.lang.Object), (r9v0 java.lang.Object) binds: [B:29:0x007a, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {zzcg -> 0x0015, blocks: (B:7:0x0010, B:33:0x008e, B:12:0x001c, B:30:0x007c, B:15:0x0024, B:28:0x0065, B:18:0x0030, B:25:0x0052, B:21:0x003c), top: B:39:0x0008 }] */
                /* JADX WARN: Code duplicated, block: B:32:0x008d  */
                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
                    zzgr zzgrVar;
                    zzgr zzgrVar2;
                    zzgr zzgrVar3;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzb;
                    try {
/* 9 */                 if (i == 0) {
/* 53 */                    pg3.m7417A(obj);
/* 59 */                    zzgrVar = (zzgr) this.zzf;
/* 1 */                     zzfp zzfpVar = this.zzc.zza;
/* 67 */                    long j = this.zzd;
/* 69 */                    this.zzf = zzgrVar;
/* 71 */                    this.zza = zzgrVar;
/* 73 */                    this.zzb = 1;
/* 75 */                    obj = zzfpVar.zzp(j, this);
/* 79 */                    if (obj != z10Var) {
/* 82 */                        zzgrVar2 = zzgrVar;
                            }
/* 167 */                   return z10Var;
                        }
/* 11 */                if (i == 1) {
/* 43 */                    zzgrVar = (zzgr) this.zza;
/* 47 */                    zzgrVar2 = (zzgr) this.zzf;
/* 49 */                    pg3.m7417A(obj);
                        } else {
/* 13 */                    if (i == 2) {
/* 35 */                        zzgrVar3 = (zzgr) this.zzf;
/* 37 */                        pg3.m7417A(obj);
/* 102 */                       zzxn zzxnVar = (zzxn) obj;
/* 104 */                       zzgb zzgbVar = this.zzc;
/* 1 */                         zzgbVar.zze = zzxnVar;
/* 1 */                         zzfp zzfpVar2 = zzgbVar.zza;
/* 113 */                       long j2 = this.zzd;
/* 115 */                       this.zzf = zzgrVar3;
/* 117 */                       this.zzb = 3;
/* 119 */                       obj = zzfpVar2.zzn(zzxnVar, j2, this);
/* 123 */                       if (obj != z10Var) {
/* 127 */                           this.zzf = null;
/* 130 */                           this.zzb = 4;
/* 140 */                           if (((zzhg) obj).zza(zzgrVar3.zza(), this) == z10Var) {
                                    }
                                }
/* 167 */                       return z10Var;
                            }
/* 15 */                    if (i != 3) {
/* 17 */                        pg3.m7417A(obj);
                            } else {
/* 27 */                        zzgrVar3 = (zzgr) this.zzf;
/* 29 */                        pg3.m7417A(obj);
/* 127 */                       this.zzf = null;
/* 130 */                       this.zzb = 4;
/* 140 */                       if (((zzhg) obj).zza(zzgrVar3.zza(), this) == z10Var) {
/* 167 */                           return z10Var;
                                }
                            }
                        }
/* 1 */                 this.zzc.zzf = zzdv.zzb;
/* 162 */               return Boolean.valueOf(((C1869kx) this.zze).m10238D(Unit.f12910a));
/* 85 */                this.zzf = zzgrVar2;
/* 87 */                this.zza = null;
/* 89 */                this.zzb = 2;
/* 95 */                obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
/* 99 */                if (obj != z10Var) {
/* 101 */                   zzgrVar3 = zzgrVar2;
/* 102 */                   zzxn zzxnVar2 = (zzxn) obj;
/* 104 */                   zzgb zzgbVar2 = this.zzc;
/* 1 */                     zzgbVar2.zze = zzxnVar2;
/* 1 */                     zzfp zzfpVar3 = zzgbVar2.zza;
/* 113 */                   long j3 = this.zzd;
/* 115 */                   this.zzf = zzgrVar3;
/* 117 */                   this.zzb = 3;
/* 119 */                   obj = zzfpVar3.zzn(zzxnVar2, j3, this);
/* 123 */                   if (obj != z10Var) {
/* 127 */                       this.zzf = null;
/* 130 */                       this.zzb = 4;
/* 140 */                       if (((zzhg) obj).zza(zzgrVar3.zza(), this) == z10Var) {
                                }
/* 1 */                         this.zzc.zzf = zzdv.zzb;
/* 162 */                       return Boolean.valueOf(((C1869kx) this.zze).m10238D(Unit.f12910a));
                            }
                        }
/* 167 */               return z10Var;
                    } catch (zzcg e) {
/* 1 */                 this.zzc.zzd = e;
/* 173 */               throw e;
                    }
                }
            }
