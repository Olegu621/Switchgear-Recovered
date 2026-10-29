            package com.google.android.recaptcha.internal;

            import java.util.Map;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.C1869kx;
            import p000.InterfaceC1809jx;
            import p000.c10;
            import p000.i13;
            import p000.m42;
            import p000.n42;
            import p000.o42;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzlk extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzly zzb;
                final /* synthetic */ String zzc;
                private /* synthetic */ Object zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzlk(zzly zzlyVar, String str, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = zzlyVar;
/* 3 */             this.zzc = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             zzlk zzlkVar = new zzlk(this.zzb, this.zzc, c10Var);
/* 10 */            zzlkVar.zzd = obj;
/* 12 */            return zzlkVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzlk) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
                /* JADX WARN: Code duplicated, block: B:30:0x00ad A[PHI: r2 r6
  0x00ad: PHI (r2v8 com.google.android.recaptcha.internal.zzhk) = (r2v7 com.google.android.recaptcha.internal.zzhk), (r2v25 com.google.android.recaptcha.internal.zzhk) binds: [B:29:0x00ab, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x00ad: PHI (r6v8 java.lang.Object) = (r6v7 java.lang.Object), (r6v15 java.lang.Object) binds: [B:29:0x00ab, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:32:0x00b9 A[Catch: Exception -> 0x001f, TRY_ENTER, TryCatch #0 {Exception -> 0x001f, blocks: (B:9:0x0018, B:37:0x0110, B:12:0x0022, B:34:0x00cb, B:32:0x00b9), top: B:46:0x000c }] */
                /* JADX WARN: Code duplicated, block: B:34:0x00cb A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:9:0x0018, B:37:0x0110, B:12:0x0022, B:34:0x00cb, B:32:0x00b9), top: B:46:0x000c }] */
                /* JADX WARN: Code duplicated, block: B:36:0x010f  */
                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM7426e;
                    zzhk zzhkVar;
                    Object objZza;
                    Object objZza2;
                    Object objZzu;
                    InterfaceC1809jx interfaceC1809jxZzz;
                    Object objM10250i;
/* 3 */             z10 z10Var = z10.f19902a;
/* 5 */             int i = this.zza;
                    try {
/* 13 */                if (i == 0) {
/* 76 */                    pg3.m7417A(obj);
/* 81 */                    zzhkVar = (zzhk) this.zzd;
/* 85 */                    zzdj zzdjVarZzn = this.zzb.zzn();
/* 89 */                    zzmc zzmcVar = zzmc.zzd;
/* 91 */                    this.zzd = zzhkVar;
/* 93 */                    this.zza = 1;
/* 95 */                    objZza = zzdjVarZzn.zza(zzmcVar, this);
/* 99 */                    if (objZza != z10Var) {
                            }
/* 380 */                   return z10Var;
                        }
/* 15 */                if (i == 1) {
/* 68 */                    zzhkVar = (zzhk) this.zzd;
/* 70 */                    pg3.m7417A(obj);
/* 73 */                    objZza = obj;
                        } else {
/* 17 */                    if (i == 2) {
/* 58 */                        zzhkVar = (zzhk) this.zzd;
/* 60 */                        pg3.m7417A(obj);
/* 63 */                        objZza2 = obj;
/* 160 */                       if (((Boolean) objZza2).booleanValue()) {
/* 188 */                           interfaceC1809jxZzz = this.zzb.zzz();
/* 192 */                           this.zzd = null;
/* 194 */                           this.zza = 5;
/* 202 */                           if (((C1869kx) interfaceC1809jxZzz).m10250i(this) != z10Var) {
/* 206 */                               C1869kx c1869kx = new C1869kx();
/* 209 */                               zzly zzlyVar = this.zzb;
/* 1 */                                 Map map = zzlyVar.zzd;
/* 215 */                               String str = this.zzc;
/* 217 */                               map.put(str, c1869kx);
/* 220 */                               zzze zzzeVarZzf = zzzf.zzf();
/* 224 */                               zzzeVarZzf.zze(str);
/* 233 */                               byte[] bArrZzd = ((zzzf) zzzeVarZzf.zzk()).zzd();
/* 260 */                               i13.m4443w(zzlyVar.zzD().zzb(), null, new zzlj(zzlyVar, zzpp.zzh().zzi(bArrZzd, 0, bArrZzd.length), null), 3);
/* 264 */                               this.zza = 6;
/* 266 */                               objM10250i = c1869kx.m10250i(this);
/* 270 */                               if (objM10250i == z10Var) {
                                        }
                                    }
                                } else {
/* 162 */                           zzly zzlyVar2 = this.zzb;
/* 164 */                           this.zzd = zzhkVar;
/* 166 */                           this.zza = 3;
/* 168 */                           objZzu = zzly.zzu(zzlyVar2, this);
/* 172 */                           if (objZzu != z10Var) {
/* 176 */                               this.zzd = null;
/* 178 */                               this.zza = 4;
/* 184 */                               if (((zzhg) objZzu).zza(zzhkVar, this) != z10Var) {
/* 188 */                                   interfaceC1809jxZzz = this.zzb.zzz();
/* 192 */                                   this.zzd = null;
/* 194 */                                   this.zza = 5;
/* 202 */                                   if (((C1869kx) interfaceC1809jxZzz).m10250i(this) != z10Var) {
/* 206 */                                       C1869kx c1869kx2 = new C1869kx();
/* 209 */                                       zzly zzlyVar3 = this.zzb;
/* 1 */                                         Map map2 = zzlyVar3.zzd;
/* 215 */                                       String str2 = this.zzc;
/* 217 */                                       map2.put(str2, c1869kx2);
/* 220 */                                       zzze zzzeVarZzf2 = zzzf.zzf();
/* 224 */                                       zzzeVarZzf2.zze(str2);
/* 233 */                                       byte[] bArrZzd2 = ((zzzf) zzzeVarZzf2.zzk()).zzd();
/* 260 */                                       i13.m4443w(zzlyVar3.zzD().zzb(), null, new zzlj(zzlyVar3, zzpp.zzh().zzi(bArrZzd2, 0, bArrZzd2.length), null), 3);
/* 264 */                                       this.zza = 6;
/* 266 */                                       objM10250i = c1869kx2.m10250i(this);
/* 270 */                                       if (objM10250i == z10Var) {
                                                }
                                            }
                                        }
                                    }
                                }
/* 380 */                       return z10Var;
                            }
/* 19 */                    if (i == 3) {
/* 47 */                        zzhkVar = (zzhk) this.zzd;
/* 49 */                        pg3.m7417A(obj);
/* 52 */                        objZzu = obj;
/* 176 */                       this.zzd = null;
/* 178 */                       this.zza = 4;
/* 184 */                       if (((zzhg) objZzu).zza(zzhkVar, this) != z10Var) {
/* 188 */                           interfaceC1809jxZzz = this.zzb.zzz();
/* 192 */                           this.zzd = null;
/* 194 */                           this.zza = 5;
/* 202 */                           if (((C1869kx) interfaceC1809jxZzz).m10250i(this) != z10Var) {
/* 206 */                               C1869kx c1869kx3 = new C1869kx();
/* 209 */                               zzly zzlyVar4 = this.zzb;
/* 1 */                                 Map map3 = zzlyVar4.zzd;
/* 215 */                               String str3 = this.zzc;
/* 217 */                               map3.put(str3, c1869kx3);
/* 220 */                               zzze zzzeVarZzf3 = zzzf.zzf();
/* 224 */                               zzzeVarZzf3.zze(str3);
/* 233 */                               byte[] bArrZzd3 = ((zzzf) zzzeVarZzf3.zzk()).zzd();
/* 260 */                               i13.m4443w(zzlyVar4.zzD().zzb(), null, new zzlj(zzlyVar4, zzpp.zzh().zzi(bArrZzd3, 0, bArrZzd3.length), null), 3);
/* 264 */                               this.zza = 6;
/* 266 */                               objM10250i = c1869kx3.m10250i(this);
/* 270 */                               if (objM10250i == z10Var) {
                                        }
                                    }
                                }
/* 380 */                       return z10Var;
                            }
/* 21 */                    if (i == 4) {
/* 40 */                        pg3.m7417A(obj);
/* 188 */                       interfaceC1809jxZzz = this.zzb.zzz();
/* 192 */                       this.zzd = null;
/* 194 */                       this.zza = 5;
/* 202 */                       if (((C1869kx) interfaceC1809jxZzz).m10250i(this) != z10Var) {
/* 206 */                           C1869kx c1869kx4 = new C1869kx();
/* 209 */                           zzly zzlyVar5 = this.zzb;
/* 1 */                             Map map4 = zzlyVar5.zzd;
/* 215 */                           String str4 = this.zzc;
/* 217 */                           map4.put(str4, c1869kx4);
/* 220 */                           zzze zzzeVarZzf4 = zzzf.zzf();
/* 224 */                           zzzeVarZzf4.zze(str4);
/* 233 */                           byte[] bArrZzd4 = ((zzzf) zzzeVarZzf4.zzk()).zzd();
/* 260 */                           i13.m4443w(zzlyVar5.zzD().zzb(), null, new zzlj(zzlyVar5, zzpp.zzh().zzi(bArrZzd4, 0, bArrZzd4.length), null), 3);
/* 264 */                           this.zza = 6;
/* 266 */                           objM10250i = c1869kx4.m10250i(this);
/* 270 */                           if (objM10250i == z10Var) {
                                    }
                                }
/* 380 */                       return z10Var;
                            }
/* 23 */                    if (i != 5) {
/* 25 */                        pg3.m7417A(obj);
/* 28 */                        objM10250i = obj;
                            } else {
/* 35 */                        pg3.m7417A(obj);
/* 206 */                       C1869kx c1869kx5 = new C1869kx();
/* 209 */                       zzly zzlyVar6 = this.zzb;
/* 1 */                         Map map5 = zzlyVar6.zzd;
/* 215 */                       String str5 = this.zzc;
/* 217 */                       map5.put(str5, c1869kx5);
/* 220 */                       zzze zzzeVarZzf5 = zzzf.zzf();
/* 224 */                       zzzeVarZzf5.zze(str5);
/* 233 */                       byte[] bArrZzd5 = ((zzzf) zzzeVarZzf5.zzk()).zzd();
/* 260 */                       i13.m4443w(zzlyVar6.zzD().zzb(), null, new zzlj(zzlyVar6, zzpp.zzh().zzi(bArrZzd5, 0, bArrZzd5.length), null), 3);
/* 264 */                       this.zza = 6;
/* 266 */                       objM10250i = c1869kx5.m10250i(this);
/* 270 */                       if (objM10250i == z10Var) {
/* 380 */                           return z10Var;
                                }
                            }
                        }
/* 273 */               zzxx zzxxVar = (zzxx) objM10250i;
/* 275 */               zzxw zzxwVarZzf = zzxx.zzf();
/* 281 */               zzxwVarZzf.zze(this.zzc);
/* 284 */               zzya zzyaVarZzf = zzyb.zzf();
/* 292 */               zzyaVarZzf.zze(zzxxVar.zzl());
/* 295 */               zzxwVarZzf.zzr(zzyaVarZzf);
/* 298 */               zzxy zzxyVarZzf = zzxz.zzf();
/* 306 */               zzxyVarZzf.zze(zzxxVar.zzj());
/* 313 */               zzxyVarZzf.zzf(zzxxVar.zzM());
/* 316 */               zzxwVarZzf.zzs(zzxyVarZzf);
/* 319 */               m42 m42Var = o42.f14612b;
/* 321 */               objM7426e = zzxwVarZzf.zzk();
/* 376 */               return new o42(objM7426e);
/* 107 */               if (((Boolean) objZza).booleanValue()) {
/* 120 */                   zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null);
/* 123 */                   m42 m42Var2 = o42.f14612b;
/* 132 */                   return new o42(new n42(zzcgVar));
                        }
/* 138 */               zzdj zzdjVarZzn2 = this.zzb.zzn();
/* 142 */               zzmc zzmcVar2 = zzmc.zzc;
/* 144 */               this.zzd = zzhkVar;
/* 146 */               this.zza = 2;
/* 148 */               objZza2 = zzdjVarZzn2.zza(zzmcVar2, this);
/* 152 */               if (objZza2 != z10Var) {
/* 160 */                   if (((Boolean) objZza2).booleanValue()) {
/* 162 */                       zzly zzlyVar7 = this.zzb;
/* 164 */                       this.zzd = zzhkVar;
/* 166 */                       this.zza = 3;
/* 168 */                       objZzu = zzly.zzu(zzlyVar7, this);
/* 172 */                       if (objZzu != z10Var) {
/* 176 */                           this.zzd = null;
/* 178 */                           this.zza = 4;
/* 184 */                           if (((zzhg) objZzu).zza(zzhkVar, this) != z10Var) {
/* 188 */                               interfaceC1809jxZzz = this.zzb.zzz();
/* 192 */                               this.zzd = null;
/* 194 */                               this.zza = 5;
/* 202 */                               if (((C1869kx) interfaceC1809jxZzz).m10250i(this) != z10Var) {
/* 206 */                                   C1869kx c1869kx6 = new C1869kx();
/* 209 */                                   zzly zzlyVar8 = this.zzb;
/* 1 */                                     Map map6 = zzlyVar8.zzd;
/* 215 */                                   String str6 = this.zzc;
/* 217 */                                   map6.put(str6, c1869kx6);
/* 220 */                                   zzze zzzeVarZzf6 = zzzf.zzf();
/* 224 */                                   zzzeVarZzf6.zze(str6);
/* 233 */                                   byte[] bArrZzd6 = ((zzzf) zzzeVarZzf6.zzk()).zzd();
/* 260 */                                   i13.m4443w(zzlyVar8.zzD().zzb(), null, new zzlj(zzlyVar8, zzpp.zzh().zzi(bArrZzd6, 0, bArrZzd6.length), null), 3);
/* 264 */                                   this.zza = 6;
/* 266 */                                   objM10250i = c1869kx6.m10250i(this);
/* 270 */                                   if (objM10250i == z10Var) {
                                            }
/* 273 */                                   zzxx zzxxVar2 = (zzxx) objM10250i;
/* 275 */                                   zzxw zzxwVarZzf2 = zzxx.zzf();
/* 281 */                                   zzxwVarZzf2.zze(this.zzc);
/* 284 */                                   zzya zzyaVarZzf2 = zzyb.zzf();
/* 292 */                                   zzyaVarZzf2.zze(zzxxVar2.zzl());
/* 295 */                                   zzxwVarZzf2.zzr(zzyaVarZzf2);
/* 298 */                                   zzxy zzxyVarZzf2 = zzxz.zzf();
/* 306 */                                   zzxyVarZzf2.zze(zzxxVar2.zzj());
/* 313 */                                   zzxyVarZzf2.zzf(zzxxVar2.zzM());
/* 316 */                                   zzxwVarZzf2.zzs(zzxyVarZzf2);
/* 319 */                                   m42 m42Var3 = o42.f14612b;
/* 321 */                                   objM7426e = zzxwVarZzf2.zzk();
/* 376 */                                   return new o42(objM7426e);
                                        }
                                    }
                                }
                            } else {
/* 188 */                       interfaceC1809jxZzz = this.zzb.zzz();
/* 192 */                       this.zzd = null;
/* 194 */                       this.zza = 5;
/* 202 */                       if (((C1869kx) interfaceC1809jxZzz).m10250i(this) != z10Var) {
/* 206 */                           C1869kx c1869kx7 = new C1869kx();
/* 209 */                           zzly zzlyVar9 = this.zzb;
/* 1 */                             Map map7 = zzlyVar9.zzd;
/* 215 */                           String str7 = this.zzc;
/* 217 */                           map7.put(str7, c1869kx7);
/* 220 */                           zzze zzzeVarZzf7 = zzzf.zzf();
/* 224 */                           zzzeVarZzf7.zze(str7);
/* 233 */                           byte[] bArrZzd7 = ((zzzf) zzzeVarZzf7.zzk()).zzd();
/* 260 */                           i13.m4443w(zzlyVar9.zzD().zzb(), null, new zzlj(zzlyVar9, zzpp.zzh().zzi(bArrZzd7, 0, bArrZzd7.length), null), 3);
/* 264 */                           this.zza = 6;
/* 266 */                           objM10250i = c1869kx7.m10250i(this);
/* 270 */                           if (objM10250i == z10Var) {
                                    }
/* 273 */                           zzxx zzxxVar3 = (zzxx) objM10250i;
/* 275 */                           zzxw zzxwVarZzf3 = zzxx.zzf();
/* 281 */                           zzxwVarZzf3.zze(this.zzc);
/* 284 */                           zzya zzyaVarZzf3 = zzyb.zzf();
/* 292 */                           zzyaVarZzf3.zze(zzxxVar3.zzl());
/* 295 */                           zzxwVarZzf3.zzr(zzyaVarZzf3);
/* 298 */                           zzxy zzxyVarZzf3 = zzxz.zzf();
/* 306 */                           zzxyVarZzf3.zze(zzxxVar3.zzj());
/* 313 */                           zzxyVarZzf3.zzf(zzxxVar3.zzM());
/* 316 */                           zzxwVarZzf3.zzs(zzxyVarZzf3);
/* 319 */                           m42 m42Var4 = o42.f14612b;
/* 321 */                           objM7426e = zzxwVarZzf3.zzk();
/* 376 */                           return new o42(objM7426e);
                                }
                            }
                        }
/* 380 */               return z10Var;
                    } catch (Exception e) {
/* 343 */               zzcg zzcgVarZza = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzW, e.getMessage(), null, 8, null));
/* 347 */               zzly zzlyVar10 = this.zzb;
/* 359 */               InterfaceC1809jx interfaceC1809jx = (InterfaceC1809jx) zzlyVar10.zzd.remove(this.zzc);
/* 361 */               if (interfaceC1809jx != null) {
/* 365 */                   ((C1869kx) interfaceC1809jx).m6289U(zzcgVarZza);
                        }
/* 368 */               m42 m42Var5 = o42.f14612b;
/* 370 */               objM7426e = pg3.m7426e(zzcgVarZza);
                    }
                }
            }
