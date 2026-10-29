            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.RecaptchaAction;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzgc extends tj2 implements Function2 {
                Object zza;
                double zzb;
                int zzc;
                final /* synthetic */ zzge zzd;
                final /* synthetic */ long zze;
                final /* synthetic */ String zzf;
                final /* synthetic */ RecaptchaAction zzg;
                private /* synthetic */ Object zzh;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzgc(zzge zzgeVar, long j, String str, RecaptchaAction recaptchaAction, c10 c10Var) {
/* 10 */            super(2, c10Var);
/* 1 */             this.zzd = zzgeVar;
/* 3 */             this.zze = j;
/* 5 */             this.zzf = str;
/* 7 */             this.zzg = recaptchaAction;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 12 */            zzgc zzgcVar = new zzgc(this.zzd, this.zze, this.zzf, this.zzg, c10Var);
/* 15 */            zzgcVar.zzh = obj;
/* 17 */            return zzgcVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzgc) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
                /* JADX WARN: Code duplicated, block: B:44:0x00ef A[Catch: Exception -> 0x0128, zzcg -> 0x013b, PHI: r2 r5
  0x00ef: PHI (r2v14 java.lang.Object) = (r2v13 java.lang.Object), (r2v27 java.lang.Object) binds: [B:43:0x00ed, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x00ef: PHI (r5v5 com.google.android.recaptcha.internal.zzhk) = (r5v4 com.google.android.recaptcha.internal.zzhk), (r5v9 com.google.android.recaptcha.internal.zzhk) binds: [B:43:0x00ed, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {zzcg -> 0x013b, Exception -> 0x0128, blocks: (B:10:0x001c, B:49:0x0113, B:13:0x0029, B:46:0x0103, B:16:0x0036, B:44:0x00ef, B:19:0x0046, B:42:0x00e1, B:22:0x0054, B:36:0x00ba, B:39:0x00cb, B:25:0x0065, B:33:0x00a9, B:28:0x0073, B:30:0x0083, B:52:0x0119, B:53:0x0127), top: B:59:0x000c }] */
                /* JADX WARN: Code duplicated, block: B:46:0x0103 A[Catch: Exception -> 0x0128, zzcg -> 0x013b, PHI: r2 r3 r5
  0x0103: PHI (r2v16 com.google.android.recaptcha.internal.zzyg) = (r2v15 com.google.android.recaptcha.internal.zzyg), (r2v30 com.google.android.recaptcha.internal.zzyg) binds: [B:45:0x0101, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r3v4 java.lang.Object) = (r3v3 java.lang.Object), (r3v8 java.lang.Object) binds: [B:45:0x0101, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r5v6 com.google.android.recaptcha.internal.zzhk) = (r5v5 com.google.android.recaptcha.internal.zzhk), (r5v10 com.google.android.recaptcha.internal.zzhk) binds: [B:45:0x0101, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {zzcg -> 0x013b, Exception -> 0x0128, blocks: (B:10:0x001c, B:49:0x0113, B:13:0x0029, B:46:0x0103, B:16:0x0036, B:44:0x00ef, B:19:0x0046, B:42:0x00e1, B:22:0x0054, B:36:0x00ba, B:39:0x00cb, B:25:0x0065, B:33:0x00a9, B:28:0x0073, B:30:0x0083, B:52:0x0119, B:53:0x0127), top: B:59:0x000c }] */
                /* JADX WARN: Code duplicated, block: B:48:0x0112  */
                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
                    zzhk zzhkVar;
                    Object objZzl;
                    double d;
                    zzhk zzhkVar2;
                    Object objZza;
                    double d2;
                    zzxn zzxnVar;
                    Object objZzm;
                    zzhk zzhkVar3;
                    Object objZza2;
                    zzyg zzygVar;
                    Object objZzo;
                    zzyg zzygVar2;
/* 3 */             z10 z10Var = z10.f19902a;
/* 5 */             int i = this.zzc;
                    try {
/* 13 */                if (i == 0) {
/* 109 */                   pg3.m7417A(obj);
/* 114 */                   zzhkVar = (zzhk) this.zzh;
/* 116 */                   zzge zzgeVar = this.zzd;
/* 130 */                   if (!Intrinsics.m6216a(zzgeVar.zzb, zzdv.zzb)) {
/* 296 */                       throw new zzcg(zzce.zzb, zzcd.zzas, null, null, 12, null);
                            }
/* 132 */                   double d3 = this.zze;
/* 1 */                     zzfp zzfpVar = zzgeVar.zza;
/* 139 */                   String str = this.zzf;
/* 146 */                   double d4 = 0.45d * d3;
/* 147 */                   this.zzh = zzhkVar;
/* 149 */                   this.zza = zzhkVar;
/* 156 */                   double d5 = d3 * 0.55d;
/* 157 */                   this.zzb = d5;
/* 159 */                   this.zzc = 1;
/* 162 */                   objZzl = zzfpVar.zzl(str, (long) d4, this);
/* 166 */                   if (objZzl != z10Var) {
/* 168 */                       d = d5;
/* 169 */                       zzhkVar2 = zzhkVar;
                            }
/* 281 */                   return z10Var;
                        }
/* 15 */                if (i == 1) {
/* 92 */                    d = this.zzb;
/* 96 */                    zzhkVar = (zzhk) this.zza;
/* 100 */                   zzhk zzhkVar4 = (zzhk) this.zzh;
/* 102 */                   pg3.m7417A(obj);
/* 105 */                   zzhkVar2 = zzhkVar4;
/* 106 */                   objZzl = obj;
                        } else {
/* 17 */                    if (i == 2) {
/* 79 */                        d2 = this.zzb;
/* 83 */                        zzhk zzhkVar5 = (zzhk) this.zzh;
/* 85 */                        pg3.m7417A(obj);
/* 88 */                        zzhkVar2 = zzhkVar5;
/* 89 */                        objZza = obj;
/* 187 */                       zzxx zzxxVar = (zzxx) objZza;
/* 189 */                       zzge zzgeVar2 = this.zzd;
/* 1 */                         zzfp zzfpVar2 = zzgeVar2.zza;
/* 195 */                       RecaptchaAction recaptchaAction = this.zzg;
/* 1 */                         zzxnVar = zzgeVar2.zzc;
/* 201 */                       if (zzxnVar == null) {
/* 203 */                           zzxnVar = null;
                                }
/* 204 */                       zzye zzyeVarZzk = zzfpVar2.zzk(recaptchaAction, zzxxVar, zzxnVar);
/* 213 */                       this.zzh = zzhkVar2;
/* 215 */                       this.zza = zzhkVar2;
/* 217 */                       this.zzc = 3;
/* 219 */                       objZzm = zzgeVar2.zza.zzm(zzyeVarZzk, (long) d2, this);
/* 223 */                       if (objZzm != z10Var) {
/* 225 */                           zzhkVar3 = zzhkVar2;
/* 228 */                           this.zzh = zzhkVar3;
/* 230 */                           this.zza = null;
/* 232 */                           this.zzc = 4;
/* 234 */                           objZza2 = ((zzhf) objZzm).zza(zzhkVar2, this);
/* 238 */                           if (objZza2 != z10Var) {
/* 240 */                               zzygVar = (zzyg) objZza2;
/* 1 */                                 zzfp zzfpVar3 = this.zzd.zza;
/* 248 */                               this.zzh = zzygVar;
/* 250 */                               this.zza = zzhkVar3;
/* 252 */                               this.zzc = 5;
/* 254 */                               objZzo = zzfpVar3.zzo(zzygVar, this);
/* 258 */                               if (objZzo != z10Var) {
/* 262 */                                   this.zzh = zzygVar;
/* 264 */                                   this.zza = null;
/* 267 */                                   this.zzc = 6;
/* 273 */                                   if (zzhj.zzb(zzhkVar3, (zzhf) objZzo, this) != z10Var) {
/* 275 */                                       zzygVar2 = zzygVar;
                                            }
                                        }
                                    }
                                }
/* 281 */                       return z10Var;
                            }
/* 19 */                    if (i == 3) {
/* 65 */                        zzhk zzhkVar6 = (zzhk) this.zza;
/* 69 */                        zzhkVar3 = (zzhk) this.zzh;
/* 71 */                        pg3.m7417A(obj);
/* 74 */                        zzhkVar2 = zzhkVar6;
/* 75 */                        objZzm = obj;
/* 228 */                       this.zzh = zzhkVar3;
/* 230 */                       this.zza = null;
/* 232 */                       this.zzc = 4;
/* 234 */                       objZza2 = ((zzhf) objZzm).zza(zzhkVar2, this);
/* 238 */                       if (objZza2 != z10Var) {
/* 240 */                           zzygVar = (zzyg) objZza2;
/* 1 */                             zzfp zzfpVar4 = this.zzd.zza;
/* 248 */                           this.zzh = zzygVar;
/* 250 */                           this.zza = zzhkVar3;
/* 252 */                           this.zzc = 5;
/* 254 */                           objZzo = zzfpVar4.zzo(zzygVar, this);
/* 258 */                           if (objZzo != z10Var) {
/* 262 */                               this.zzh = zzygVar;
/* 264 */                               this.zza = null;
/* 267 */                               this.zzc = 6;
/* 273 */                               if (zzhj.zzb(zzhkVar3, (zzhf) objZzo, this) != z10Var) {
/* 275 */                                   zzygVar2 = zzygVar;
                                        }
                                    }
                                }
/* 281 */                       return z10Var;
                            }
/* 21 */                    if (i == 4) {
/* 53 */                        zzhk zzhkVar7 = (zzhk) this.zzh;
/* 55 */                        pg3.m7417A(obj);
/* 58 */                        zzhkVar3 = zzhkVar7;
/* 59 */                        objZza2 = obj;
/* 240 */                       zzygVar = (zzyg) objZza2;
/* 1 */                         zzfp zzfpVar5 = this.zzd.zza;
/* 248 */                       this.zzh = zzygVar;
/* 250 */                       this.zza = zzhkVar3;
/* 252 */                       this.zzc = 5;
/* 254 */                       objZzo = zzfpVar5.zzo(zzygVar, this);
/* 258 */                       if (objZzo != z10Var) {
/* 262 */                           this.zzh = zzygVar;
/* 264 */                           this.zza = null;
/* 267 */                           this.zzc = 6;
/* 273 */                           if (zzhj.zzb(zzhkVar3, (zzhf) objZzo, this) != z10Var) {
/* 275 */                               zzygVar2 = zzygVar;
                                    }
                                }
/* 281 */                       return z10Var;
                            }
/* 23 */                    if (i == 5) {
/* 36 */                        zzhk zzhkVar8 = (zzhk) this.zza;
/* 40 */                        zzyg zzygVar3 = (zzyg) this.zzh;
/* 42 */                        pg3.m7417A(obj);
/* 45 */                        zzhkVar3 = zzhkVar8;
/* 46 */                        zzygVar = zzygVar3;
/* 47 */                        objZzo = obj;
/* 262 */                       this.zzh = zzygVar;
/* 264 */                       this.zza = null;
/* 267 */                       this.zzc = 6;
/* 273 */                       if (zzhj.zzb(zzhkVar3, (zzhf) objZzo, this) != z10Var) {
/* 275 */                           zzygVar2 = zzygVar;
                                }
/* 281 */                       return z10Var;
                            }
/* 27 */                    zzygVar2 = (zzyg) this.zzh;
/* 29 */                    pg3.m7417A(obj);
                        }
/* 276 */               return zzygVar2.zzj();
/* 172 */               this.zzh = zzhkVar2;
/* 174 */               this.zza = null;
/* 176 */               this.zzb = d;
/* 178 */               this.zzc = 2;
/* 180 */               objZza = ((zzhf) objZzl).zza(zzhkVar, this);
/* 184 */               if (objZza != z10Var) {
/* 186 */                   d2 = d;
/* 187 */                   zzxx zzxxVar2 = (zzxx) objZza;
/* 189 */                   zzge zzgeVar3 = this.zzd;
/* 1 */                     zzfp zzfpVar6 = zzgeVar3.zza;
/* 195 */                   RecaptchaAction recaptchaAction2 = this.zzg;
/* 1 */                     zzxnVar = zzgeVar3.zzc;
/* 201 */                   if (zzxnVar == null) {
/* 203 */                       zzxnVar = null;
                            }
/* 204 */                   zzye zzyeVarZzk2 = zzfpVar6.zzk(recaptchaAction2, zzxxVar2, zzxnVar);
/* 213 */                   this.zzh = zzhkVar2;
/* 215 */                   this.zza = zzhkVar2;
/* 217 */                   this.zzc = 3;
/* 219 */                   objZzm = zzgeVar3.zza.zzm(zzyeVarZzk2, (long) d2, this);
/* 223 */                   if (objZzm != z10Var) {
/* 225 */                       zzhkVar3 = zzhkVar2;
/* 228 */                       this.zzh = zzhkVar3;
/* 230 */                       this.zza = null;
/* 232 */                       this.zzc = 4;
/* 234 */                       objZza2 = ((zzhf) objZzm).zza(zzhkVar2, this);
/* 238 */                       if (objZza2 != z10Var) {
/* 240 */                           zzygVar = (zzyg) objZza2;
/* 1 */                             zzfp zzfpVar7 = this.zzd.zza;
/* 248 */                           this.zzh = zzygVar;
/* 250 */                           this.zza = zzhkVar3;
/* 252 */                           this.zzc = 5;
/* 254 */                           objZzo = zzfpVar7.zzo(zzygVar, this);
/* 258 */                           if (objZzo != z10Var) {
/* 262 */                               this.zzh = zzygVar;
/* 264 */                               this.zza = null;
/* 267 */                               this.zzc = 6;
/* 273 */                               if (zzhj.zzb(zzhkVar3, (zzhf) objZzo, this) != z10Var) {
/* 275 */                                   zzygVar2 = zzygVar;
/* 276 */                                   return zzygVar2.zzj();
                                        }
                                    }
                                }
                            }
                        }
/* 281 */               return z10Var;
                    } catch (zzcg e) {
/* 317 */               throw e;
                    } catch (Exception e2) {
/* 315 */               throw new zzcg(zzce.zzb, zzcd.zzaC, e2.getMessage(), null, 8, null);
                    }
                }
            }
