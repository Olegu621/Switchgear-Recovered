            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzgd extends tj2 implements Function2 {
                Object zza;
                double zzb;
                int zzc;
                final /* synthetic */ zzge zzd;
                final /* synthetic */ long zze;
                private /* synthetic */ Object zzf;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzgd(zzge zzgeVar, long j, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzd = zzgeVar;
/* 3 */             this.zze = j;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             zzgd zzgdVar = new zzgd(this.zzd, this.zze, c10Var);
/* 10 */            zzgdVar.zzf = obj;
/* 12 */            return zzgdVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzgd) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[Catch: zzcg -> 0x0015, PHI: r1 r13
  0x00b5: PHI (r1v6 com.google.android.recaptcha.internal.zzhk) = (r1v5 com.google.android.recaptcha.internal.zzhk), (r1v12 com.google.android.recaptcha.internal.zzhk) binds: [B:33:0x00b3, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00b5: PHI (r13v12 java.lang.Object) = (r13v11 java.lang.Object), (r13v0 java.lang.Object) binds: [B:33:0x00b3, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {zzcg -> 0x0015, blocks: (B:7:0x0010, B:37:0x00c3, B:12:0x001c, B:34:0x00b5, B:15:0x0027, B:32:0x009f, B:18:0x0036, B:29:0x008d, B:26:0x0069), top: B:45:0x0008 }] */
                /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
                    zzhk zzhkVar;
                    double d;
                    zzhk zzhkVar2;
                    double d2;
                    zzhk zzhkVar3;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzc;
                    try {
/* 9 */                 if (i == 0) {
/* 59 */                    pg3.m7417A(obj);
/* 65 */                    zzhkVar = (zzhk) this.zzf;
/* 67 */                    zzge zzgeVar = this.zzd;
/* 81 */                    if (Intrinsics.m6216a(zzgeVar.zzb, zzdv.zzb) || Intrinsics.m6216a(zzgeVar.zzb, zzdv.zzd)) {
/* 219 */                       return Unit.f12910a;
                            }
/* 1 */                     zzgeVar.zzb = zzdv.zzc;
/* 106 */                   double d3 = this.zze;
/* 1 */                     zzfp zzfpVar = zzgeVar.zza;
/* 118 */                   double d4 = 0.6d * d3;
/* 119 */                   this.zzf = zzhkVar;
/* 121 */                   this.zza = zzhkVar;
/* 128 */                   double d5 = d3 * 0.4d;
/* 129 */                   this.zzb = d5;
/* 131 */                   this.zzc = 1;
/* 134 */                   obj = zzfpVar.zzp((long) d4, this);
/* 138 */                   if (obj != z10Var) {
/* 140 */                       d = d5;
/* 141 */                       zzhkVar2 = zzhkVar;
                            }
/* 208 */                   return z10Var;
                        }
/* 11 */                if (i == 1) {
/* 45 */                    d = this.zzb;
/* 49 */                    zzhkVar = (zzhk) this.zza;
/* 53 */                    zzhkVar2 = (zzhk) this.zzf;
/* 55 */                    pg3.m7417A(obj);
                        } else {
/* 13 */                    if (i == 2) {
/* 34 */                        d2 = this.zzb;
/* 38 */                        zzhkVar3 = (zzhk) this.zzf;
/* 40 */                        pg3.m7417A(obj);
/* 160 */                       zzxn zzxnVar = (zzxn) obj;
/* 162 */                       zzge zzgeVar2 = this.zzd;
/* 1 */                         zzgeVar2.zzc = zzxnVar;
/* 172 */                       this.zzf = zzhkVar3;
/* 174 */                       this.zzc = 3;
/* 176 */                       obj = zzgeVar2.zza.zzn(zzxnVar, (long) d2, this);
/* 180 */                       if (obj != z10Var) {
/* 184 */                           this.zzf = null;
/* 187 */                           this.zzc = 4;
/* 193 */                           if (((zzhg) obj).zza(zzhkVar3, this) == z10Var) {
                                    }
                                }
/* 208 */                       return z10Var;
                            }
/* 15 */                    if (i != 3) {
/* 17 */                        pg3.m7417A(obj);
                            } else {
/* 27 */                        zzhkVar3 = (zzhk) this.zzf;
/* 29 */                        pg3.m7417A(obj);
/* 184 */                       this.zzf = null;
/* 187 */                       this.zzc = 4;
/* 193 */                       if (((zzhg) obj).zza(zzhkVar3, this) == z10Var) {
/* 208 */                           return z10Var;
                                }
                            }
                        }
/* 1 */                 this.zzd.zzb = zzdv.zzb;
/* 205 */               return Unit.f12910a;
/* 144 */               this.zzf = zzhkVar2;
/* 146 */               this.zza = null;
/* 148 */               this.zzb = d;
/* 150 */               this.zzc = 2;
/* 152 */               obj = ((zzhf) obj).zza(zzhkVar, this);
/* 156 */               if (obj != z10Var) {
/* 158 */                   d2 = d;
/* 159 */                   zzhkVar3 = zzhkVar2;
/* 160 */                   zzxn zzxnVar2 = (zzxn) obj;
/* 162 */                   zzge zzgeVar3 = this.zzd;
/* 1 */                     zzgeVar3.zzc = zzxnVar2;
/* 172 */                   this.zzf = zzhkVar3;
/* 174 */                   this.zzc = 3;
/* 176 */                   obj = zzgeVar3.zza.zzn(zzxnVar2, (long) d2, this);
/* 180 */                   if (obj != z10Var) {
/* 184 */                       this.zzf = null;
/* 187 */                       this.zzc = 4;
/* 193 */                       if (((zzhg) obj).zza(zzhkVar3, this) == z10Var) {
                                }
/* 1 */                         this.zzd.zzb = zzdv.zzb;
/* 205 */                       return Unit.f12910a;
                            }
                        }
/* 208 */               return z10Var;
                    } catch (zzcg e) {
/* 1 */                 this.zzd.zzb = zzdv.zzd;
/* 218 */               throw e;
                    }
                }
            }
