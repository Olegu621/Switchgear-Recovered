            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.RecaptchaAction;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfq extends tj2 implements Function2 {
                Object zza;
                double zzb;
                int zzc;
                final /* synthetic */ zzgb zzd;
                final /* synthetic */ long zze;
                final /* synthetic */ String zzf;
                final /* synthetic */ RecaptchaAction zzg;
                private /* synthetic */ Object zzh;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzfq(zzgb zzgbVar, long j, String str, RecaptchaAction recaptchaAction, c10 c10Var) {
/* 10 */            super(2, c10Var);
/* 1 */             this.zzd = zzgbVar;
/* 3 */             this.zze = j;
/* 5 */             this.zzf = str;
/* 7 */             this.zzg = recaptchaAction;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 12 */            zzfq zzfqVar = new zzfq(this.zzd, this.zze, this.zzf, this.zzg, c10Var);
/* 15 */            zzfqVar.zzh = obj;
/* 17 */            return zzfqVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzfq) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:34:0x0094  */
                /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
                /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
                /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
                /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
                /* JADX WARN: Code duplicated, block: B:49:0x010a  */
                /* JADX WARN: Code duplicated, block: B:52:0x0120 A[Catch: Exception -> 0x0137, zzcg -> 0x014b, PHI: r1 r3 r12
  0x0120: PHI (r1v25 com.google.android.recaptcha.internal.zzhk) = (r1v22 com.google.android.recaptcha.internal.zzhk), (r1v27 com.google.android.recaptcha.internal.zzhk) binds: [B:51:0x011e, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0120: PHI (r3v21 java.lang.Object) = (r3v20 java.lang.Object), (r3v25 java.lang.Object) binds: [B:51:0x011e, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0120: PHI (r12v24 com.google.android.recaptcha.internal.zzyg) = (r12v23 com.google.android.recaptcha.internal.zzyg), (r12v25 com.google.android.recaptcha.internal.zzyg) binds: [B:51:0x011e, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {zzcg -> 0x014b, Exception -> 0x0137, blocks: (B:5:0x000c, B:55:0x0131, B:8:0x0019, B:52:0x0120, B:11:0x0025, B:50:0x010b, B:14:0x0032, B:47:0x00fb, B:17:0x003d, B:41:0x00d3, B:44:0x00e4, B:20:0x004c, B:38:0x00c1, B:23:0x0055, B:35:0x0095, B:26:0x0061, B:32:0x0085, B:29:0x006d), top: B:64:0x0005 }] */
                /* JADX WARN: Code duplicated, block: B:54:0x0130  */
                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
                    zzhk zzhkVar;
                    zzhk zzhkVar2;
                    zzhk zzhkVar3;
                    double d;
                    zzhk zzhkVar4;
                    zzhk zzhkVar5;
                    zzxn zzxnVar;
                    zzhk zzhkVar6;
                    zzhk zzhkVar7;
                    zzyg zzygVar;
                    Object objZzo;
                    zzyg zzygVar2;
/* 1 */             z10 z10Var = z10.f19902a;
                    try {
                        switch (this.zzc) {
                            case 0:
/* 102 */                       pg3.m7417A(obj);
/* 108 */                       zzhkVar = (zzhk) this.zzh;
/* 110 */                       zzgb zzgbVar = this.zzd;
/* 112 */                       long j = this.zze;
/* 114 */                       this.zzh = zzhkVar;
/* 116 */                       this.zza = zzhkVar;
/* 119 */                       this.zzc = 1;
/* 128 */                       obj = new zzhg(new zzfu(zzgbVar, j, null));
/* 131 */                       if (obj != z10Var) {
/* 133 */                           zzhkVar2 = zzhkVar;
/* 136 */                           this.zzh = zzhkVar2;
/* 138 */                           this.zza = null;
/* 141 */                           this.zzc = 2;
/* 143 */                           obj = ((zzhg) obj).zza(zzhkVar, this);
/* 147 */                           if (obj != z10Var) {
/* 149 */                               zzhkVar3 = zzhkVar2;
/* 152 */                               double dLongValue = ((Number) obj).longValue();
/* 1 */                                 zzfp zzfpVar = this.zzd.zza;
/* 163 */                               String str = this.zzf;
/* 170 */                               double d2 = 0.45d * dLongValue;
/* 171 */                               this.zzh = zzhkVar3;
/* 173 */                               this.zza = zzhkVar3;
/* 180 */                               d = dLongValue * 0.55d;
/* 181 */                               this.zzb = d;
/* 184 */                               this.zzc = 3;
/* 187 */                               obj = zzfpVar.zzl(str, (long) d2, this);
/* 191 */                               if (obj != z10Var) {
/* 193 */                                   zzhkVar4 = zzhkVar3;
/* 196 */                                   this.zzh = zzhkVar4;
/* 198 */                                   this.zza = null;
/* 200 */                                   this.zzb = d;
/* 203 */                                   this.zzc = 4;
/* 205 */                                   obj = ((zzhf) obj).zza(zzhkVar3, this);
/* 209 */                                   if (obj != z10Var) {
/* 211 */                                       zzhkVar5 = zzhkVar4;
/* 212 */                                       zzxx zzxxVar = (zzxx) obj;
/* 214 */                                       zzgb zzgbVar2 = this.zzd;
/* 1 */                                         zzfp zzfpVar2 = zzgbVar2.zza;
/* 220 */                                       RecaptchaAction recaptchaAction = this.zzg;
/* 1 */                                         zzxnVar = zzgbVar2.zze;
/* 226 */                                       if (zzxnVar == null) {
/* 228 */                                           zzxnVar = null;
                                                }
/* 229 */                                       zzye zzyeVarZzk = zzfpVar2.zzk(recaptchaAction, zzxxVar, zzxnVar);
/* 238 */                                       this.zzh = zzhkVar5;
/* 240 */                                       this.zza = zzhkVar5;
/* 243 */                                       this.zzc = 5;
/* 245 */                                       obj = zzgbVar2.zza.zzm(zzyeVarZzk, (long) d, this);
/* 249 */                                       if (obj != z10Var) {
/* 251 */                                           zzhkVar6 = zzhkVar5;
/* 254 */                                           this.zzh = zzhkVar6;
/* 256 */                                           this.zza = null;
/* 259 */                                           this.zzc = 6;
/* 261 */                                           obj = ((zzhf) obj).zza(zzhkVar5, this);
/* 265 */                                           if (obj != z10Var) {
/* 267 */                                               zzhkVar7 = zzhkVar6;
/* 268 */                                               zzygVar = (zzyg) obj;
/* 1 */                                                 zzfp zzfpVar3 = this.zzd.zza;
/* 276 */                                               this.zzh = zzygVar;
/* 278 */                                               this.zza = zzhkVar7;
/* 281 */                                               this.zzc = 7;
/* 283 */                                               objZzo = zzfpVar3.zzo(zzygVar, this);
/* 287 */                                               if (objZzo != z10Var) {
/* 291 */                                                   this.zzh = zzygVar;
/* 293 */                                                   this.zza = null;
/* 297 */                                                   this.zzc = 8;
/* 303 */                                                   if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != z10Var) {
/* 305 */                                                       zzygVar2 = zzygVar;
/* 306 */                                                       return zzygVar2.zzj();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
/* 311 */                       return z10Var;
                            case 1:
/* 92 */                        zzhkVar = (zzhk) this.zza;
/* 96 */                        zzhkVar2 = (zzhk) this.zzh;
/* 98 */                        pg3.m7417A(obj);
/* 136 */                       this.zzh = zzhkVar2;
/* 138 */                       this.zza = null;
/* 141 */                       this.zzc = 2;
/* 143 */                       obj = ((zzhg) obj).zza(zzhkVar, this);
/* 147 */                       if (obj != z10Var) {
/* 149 */                           zzhkVar3 = zzhkVar2;
/* 152 */                           double dLongValue2 = ((Number) obj).longValue();
/* 1 */                             zzfp zzfpVar4 = this.zzd.zza;
/* 163 */                           String str2 = this.zzf;
/* 170 */                           double d3 = 0.45d * dLongValue2;
/* 171 */                           this.zzh = zzhkVar3;
/* 173 */                           this.zza = zzhkVar3;
/* 180 */                           d = dLongValue2 * 0.55d;
/* 181 */                           this.zzb = d;
/* 184 */                           this.zzc = 3;
/* 187 */                           obj = zzfpVar4.zzl(str2, (long) d3, this);
/* 191 */                           if (obj != z10Var) {
/* 193 */                               zzhkVar4 = zzhkVar3;
/* 196 */                               this.zzh = zzhkVar4;
/* 198 */                               this.zza = null;
/* 200 */                               this.zzb = d;
/* 203 */                               this.zzc = 4;
/* 205 */                               obj = ((zzhf) obj).zza(zzhkVar3, this);
/* 209 */                               if (obj != z10Var) {
/* 211 */                                   zzhkVar5 = zzhkVar4;
/* 212 */                                   zzxx zzxxVar2 = (zzxx) obj;
/* 214 */                                   zzgb zzgbVar3 = this.zzd;
/* 1 */                                     zzfp zzfpVar5 = zzgbVar3.zza;
/* 220 */                                   RecaptchaAction recaptchaAction2 = this.zzg;
/* 1 */                                     zzxnVar = zzgbVar3.zze;
/* 226 */                                   if (zzxnVar == null) {
/* 228 */                                       zzxnVar = null;
                                            }
/* 229 */                                   zzye zzyeVarZzk2 = zzfpVar5.zzk(recaptchaAction2, zzxxVar2, zzxnVar);
/* 238 */                                   this.zzh = zzhkVar5;
/* 240 */                                   this.zza = zzhkVar5;
/* 243 */                                   this.zzc = 5;
/* 245 */                                   obj = zzgbVar3.zza.zzm(zzyeVarZzk2, (long) d, this);
/* 249 */                                   if (obj != z10Var) {
/* 251 */                                       zzhkVar6 = zzhkVar5;
/* 254 */                                       this.zzh = zzhkVar6;
/* 256 */                                       this.zza = null;
/* 259 */                                       this.zzc = 6;
/* 261 */                                       obj = ((zzhf) obj).zza(zzhkVar5, this);
/* 265 */                                       if (obj != z10Var) {
/* 267 */                                           zzhkVar7 = zzhkVar6;
/* 268 */                                           zzygVar = (zzyg) obj;
/* 1 */                                             zzfp zzfpVar6 = this.zzd.zza;
/* 276 */                                           this.zzh = zzygVar;
/* 278 */                                           this.zza = zzhkVar7;
/* 281 */                                           this.zzc = 7;
/* 283 */                                           objZzo = zzfpVar6.zzo(zzygVar, this);
/* 287 */                                           if (objZzo != z10Var) {
/* 291 */                                               this.zzh = zzygVar;
/* 293 */                                               this.zza = null;
/* 297 */                                               this.zzc = 8;
/* 303 */                                               if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != z10Var) {
/* 305 */                                                   zzygVar2 = zzygVar;
/* 306 */                                                   return zzygVar2.zzj();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
/* 311 */                       return z10Var;
                            case 2:
/* 84 */                        zzhkVar3 = (zzhk) this.zzh;
/* 86 */                        pg3.m7417A(obj);
/* 152 */                       double dLongValue3 = ((Number) obj).longValue();
/* 1 */                         zzfp zzfpVar7 = this.zzd.zza;
/* 163 */                       String str3 = this.zzf;
/* 170 */                       double d4 = 0.45d * dLongValue3;
/* 171 */                       this.zzh = zzhkVar3;
/* 173 */                       this.zza = zzhkVar3;
/* 180 */                       d = dLongValue3 * 0.55d;
/* 181 */                       this.zzb = d;
/* 184 */                       this.zzc = 3;
/* 187 */                       obj = zzfpVar7.zzl(str3, (long) d4, this);
/* 191 */                       if (obj != z10Var) {
/* 193 */                           zzhkVar4 = zzhkVar3;
/* 196 */                           this.zzh = zzhkVar4;
/* 198 */                           this.zza = null;
/* 200 */                           this.zzb = d;
/* 203 */                           this.zzc = 4;
/* 205 */                           obj = ((zzhf) obj).zza(zzhkVar3, this);
/* 209 */                           if (obj != z10Var) {
/* 211 */                               zzhkVar5 = zzhkVar4;
/* 212 */                               zzxx zzxxVar3 = (zzxx) obj;
/* 214 */                               zzgb zzgbVar4 = this.zzd;
/* 1 */                                 zzfp zzfpVar8 = zzgbVar4.zza;
/* 220 */                               RecaptchaAction recaptchaAction3 = this.zzg;
/* 1 */                                 zzxnVar = zzgbVar4.zze;
/* 226 */                               if (zzxnVar == null) {
/* 228 */                                   zzxnVar = null;
                                        }
/* 229 */                               zzye zzyeVarZzk3 = zzfpVar8.zzk(recaptchaAction3, zzxxVar3, zzxnVar);
/* 238 */                               this.zzh = zzhkVar5;
/* 240 */                               this.zza = zzhkVar5;
/* 243 */                               this.zzc = 5;
/* 245 */                               obj = zzgbVar4.zza.zzm(zzyeVarZzk3, (long) d, this);
/* 249 */                               if (obj != z10Var) {
/* 251 */                                   zzhkVar6 = zzhkVar5;
/* 254 */                                   this.zzh = zzhkVar6;
/* 256 */                                   this.zza = null;
/* 259 */                                   this.zzc = 6;
/* 261 */                                   obj = ((zzhf) obj).zza(zzhkVar5, this);
/* 265 */                                   if (obj != z10Var) {
/* 267 */                                       zzhkVar7 = zzhkVar6;
/* 268 */                                       zzygVar = (zzyg) obj;
/* 1 */                                         zzfp zzfpVar9 = this.zzd.zza;
/* 276 */                                       this.zzh = zzygVar;
/* 278 */                                       this.zza = zzhkVar7;
/* 281 */                                       this.zzc = 7;
/* 283 */                                       objZzo = zzfpVar9.zzo(zzygVar, this);
/* 287 */                                       if (objZzo != z10Var) {
/* 291 */                                           this.zzh = zzygVar;
/* 293 */                                           this.zza = null;
/* 297 */                                           this.zzc = 8;
/* 303 */                                           if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != z10Var) {
/* 305 */                                               zzygVar2 = zzygVar;
/* 306 */                                               return zzygVar2.zzj();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
/* 311 */                       return z10Var;
                            case 3:
/* 67 */                        d = this.zzb;
/* 71 */                        zzhkVar3 = (zzhk) this.zza;
/* 75 */                        zzhkVar4 = (zzhk) this.zzh;
/* 77 */                        pg3.m7417A(obj);
/* 196 */                       this.zzh = zzhkVar4;
/* 198 */                       this.zza = null;
/* 200 */                       this.zzb = d;
/* 203 */                       this.zzc = 4;
/* 205 */                       obj = ((zzhf) obj).zza(zzhkVar3, this);
/* 209 */                       if (obj != z10Var) {
/* 211 */                           zzhkVar5 = zzhkVar4;
/* 212 */                           zzxx zzxxVar4 = (zzxx) obj;
/* 214 */                           zzgb zzgbVar5 = this.zzd;
/* 1 */                             zzfp zzfpVar10 = zzgbVar5.zza;
/* 220 */                           RecaptchaAction recaptchaAction4 = this.zzg;
/* 1 */                             zzxnVar = zzgbVar5.zze;
/* 226 */                           if (zzxnVar == null) {
/* 228 */                               zzxnVar = null;
                                    }
/* 229 */                           zzye zzyeVarZzk4 = zzfpVar10.zzk(recaptchaAction4, zzxxVar4, zzxnVar);
/* 238 */                           this.zzh = zzhkVar5;
/* 240 */                           this.zza = zzhkVar5;
/* 243 */                           this.zzc = 5;
/* 245 */                           obj = zzgbVar5.zza.zzm(zzyeVarZzk4, (long) d, this);
/* 249 */                           if (obj != z10Var) {
/* 251 */                               zzhkVar6 = zzhkVar5;
/* 254 */                               this.zzh = zzhkVar6;
/* 256 */                               this.zza = null;
/* 259 */                               this.zzc = 6;
/* 261 */                               obj = ((zzhf) obj).zza(zzhkVar5, this);
/* 265 */                               if (obj != z10Var) {
/* 267 */                                   zzhkVar7 = zzhkVar6;
/* 268 */                                   zzygVar = (zzyg) obj;
/* 1 */                                     zzfp zzfpVar11 = this.zzd.zza;
/* 276 */                                   this.zzh = zzygVar;
/* 278 */                                   this.zza = zzhkVar7;
/* 281 */                                   this.zzc = 7;
/* 283 */                                   objZzo = zzfpVar11.zzo(zzygVar, this);
/* 287 */                                   if (objZzo != z10Var) {
/* 291 */                                       this.zzh = zzygVar;
/* 293 */                                       this.zza = null;
/* 297 */                                       this.zzc = 8;
/* 303 */                                       if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != z10Var) {
/* 305 */                                           zzygVar2 = zzygVar;
/* 306 */                                           return zzygVar2.zzj();
                                                }
                                            }
                                        }
                                    }
                                }
/* 311 */                       return z10Var;
                            case 4:
/* 56 */                        d = this.zzb;
/* 60 */                        zzhkVar5 = (zzhk) this.zzh;
/* 62 */                        pg3.m7417A(obj);
/* 212 */                       zzxx zzxxVar5 = (zzxx) obj;
/* 214 */                       zzgb zzgbVar6 = this.zzd;
/* 1 */                         zzfp zzfpVar12 = zzgbVar6.zza;
/* 220 */                       RecaptchaAction recaptchaAction5 = this.zzg;
/* 1 */                         zzxnVar = zzgbVar6.zze;
/* 226 */                       if (zzxnVar == null) {
/* 228 */                           zzxnVar = null;
                                }
/* 229 */                       zzye zzyeVarZzk5 = zzfpVar12.zzk(recaptchaAction5, zzxxVar5, zzxnVar);
/* 238 */                       this.zzh = zzhkVar5;
/* 240 */                       this.zza = zzhkVar5;
/* 243 */                       this.zzc = 5;
/* 245 */                       obj = zzgbVar6.zza.zzm(zzyeVarZzk5, (long) d, this);
/* 249 */                       if (obj != z10Var) {
/* 251 */                           zzhkVar6 = zzhkVar5;
/* 254 */                           this.zzh = zzhkVar6;
/* 256 */                           this.zza = null;
/* 259 */                           this.zzc = 6;
/* 261 */                           obj = ((zzhf) obj).zza(zzhkVar5, this);
/* 265 */                           if (obj != z10Var) {
/* 267 */                               zzhkVar7 = zzhkVar6;
/* 268 */                               zzygVar = (zzyg) obj;
/* 1 */                                 zzfp zzfpVar13 = this.zzd.zza;
/* 276 */                               this.zzh = zzygVar;
/* 278 */                               this.zza = zzhkVar7;
/* 281 */                               this.zzc = 7;
/* 283 */                               objZzo = zzfpVar13.zzo(zzygVar, this);
/* 287 */                               if (objZzo != z10Var) {
/* 291 */                                   this.zzh = zzygVar;
/* 293 */                                   this.zza = null;
/* 297 */                                   this.zzc = 8;
/* 303 */                                   if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != z10Var) {
/* 305 */                                       zzygVar2 = zzygVar;
/* 306 */                                       return zzygVar2.zzj();
                                            }
                                        }
                                    }
                                }
/* 311 */                       return z10Var;
                            case 5:
/* 45 */                        zzhkVar5 = (zzhk) this.zza;
/* 49 */                        zzhkVar6 = (zzhk) this.zzh;
/* 51 */                        pg3.m7417A(obj);
/* 254 */                       this.zzh = zzhkVar6;
/* 256 */                       this.zza = null;
/* 259 */                       this.zzc = 6;
/* 261 */                       obj = ((zzhf) obj).zza(zzhkVar5, this);
/* 265 */                       if (obj != z10Var) {
/* 267 */                           zzhkVar7 = zzhkVar6;
/* 268 */                           zzygVar = (zzyg) obj;
/* 1 */                             zzfp zzfpVar14 = this.zzd.zza;
/* 276 */                           this.zzh = zzygVar;
/* 278 */                           this.zza = zzhkVar7;
/* 281 */                           this.zzc = 7;
/* 283 */                           objZzo = zzfpVar14.zzo(zzygVar, this);
/* 287 */                           if (objZzo != z10Var) {
/* 291 */                               this.zzh = zzygVar;
/* 293 */                               this.zza = null;
/* 297 */                               this.zzc = 8;
/* 303 */                               if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != z10Var) {
/* 305 */                                   zzygVar2 = zzygVar;
/* 306 */                                   return zzygVar2.zzj();
                                        }
                                    }
                                }
/* 311 */                       return z10Var;
                            case 6:
/* 36 */                        zzhkVar7 = (zzhk) this.zzh;
/* 38 */                        pg3.m7417A(obj);
/* 268 */                       zzygVar = (zzyg) obj;
/* 1 */                         zzfp zzfpVar15 = this.zzd.zza;
/* 276 */                       this.zzh = zzygVar;
/* 278 */                       this.zza = zzhkVar7;
/* 281 */                       this.zzc = 7;
/* 283 */                       objZzo = zzfpVar15.zzo(zzygVar, this);
/* 287 */                       if (objZzo != z10Var) {
/* 291 */                           this.zzh = zzygVar;
/* 293 */                           this.zza = null;
/* 297 */                           this.zzc = 8;
/* 303 */                           if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != z10Var) {
/* 305 */                               zzygVar2 = zzygVar;
/* 306 */                               return zzygVar2.zzj();
                                    }
                                }
/* 311 */                       return z10Var;
                            case 7:
/* 20 */                        zzhkVar7 = (zzhk) this.zza;
/* 24 */                        zzyg zzygVar3 = (zzyg) this.zzh;
/* 26 */                        pg3.m7417A(obj);
/* 30 */                        objZzo = obj;
/* 31 */                        zzygVar = zzygVar3;
/* 291 */                       this.zzh = zzygVar;
/* 293 */                       this.zza = null;
/* 297 */                       this.zzc = 8;
/* 303 */                       if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != z10Var) {
/* 305 */                           zzygVar2 = zzygVar;
/* 306 */                           return zzygVar2.zzj();
                                }
/* 311 */                       return z10Var;
                            default:
/* 11 */                        zzygVar2 = (zzyg) this.zzh;
/* 13 */                        pg3.m7417A(obj);
/* 306 */                       return zzygVar2.zzj();
                        }
                    } catch (zzcg e) {
/* 334 */               throw e;
                    } catch (Exception e2) {
/* 331 */               throw new zzcg(zzce.zzb, zzcd.zzaB, e2.getMessage(), null, 8, null);
                    }
                }
            }
