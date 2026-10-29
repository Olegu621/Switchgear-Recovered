            package com.google.android.gms.internal.measurement;

            import io.flutter.Build;
            import java.util.Iterator;
            import java.util.List;
            import p000.C1951n4;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbg extends zzav {
                public zzbg() {
/* 8 */             this.zza.add(zzbk.FOR_IN);
/* 15 */            this.zza.add(zzbk.FOR_IN_CONST);
/* 22 */            this.zza.add(zzbk.FOR_IN_LET);
/* 29 */            this.zza.add(zzbk.FOR_LET);
/* 36 */            this.zza.add(zzbk.FOR_OF);
/* 43 */            this.zza.add(zzbk.FOR_OF_CONST);
/* 50 */            this.zza.add(zzbk.FOR_OF_LET);
/* 57 */            this.zza.add(zzbk.WHILE);
                }

                private static zzao zzc(zzbe zzbeVar, zzao zzaoVar, zzao zzaoVar2) {
/* 5 */             return zze(zzbeVar, zzaoVar.zzf(), zzaoVar2);
                }

                private static zzao zzd(zzbe zzbeVar, zzao zzaoVar, zzao zzaoVar2) {
/* 3 */             if (zzaoVar instanceof Iterable) {
/* 11 */                return zze(zzbeVar, ((Iterable) zzaoVar).iterator(), zzaoVar2);
                    }
/* 18 */            C1951n4.m6859j("Non-iterable type in for...of loop.");
/* 21 */            return null;
                }

                private static zzao zze(zzbe zzbeVar, Iterator it, zzao zzaoVar) {
/* 1 */             if (it != null) {
/* 7 */                 while (it.hasNext()) {
/* 22 */                    zzao zzaoVarZzb = zzbeVar.zza((zzao) it.next()).zzb((zzae) zzaoVar);
/* 28 */                    if (zzaoVarZzb instanceof zzag) {
/* 30 */                        zzag zzagVar = (zzag) zzaoVarZzb;
/* 42 */                        if ("break".equals(zzagVar.zzg())) {
/* 44 */                            return zzao.zzf;
                                }
/* 57 */                        if ("return".equals(zzagVar.zzg())) {
/* 59 */                            return zzagVar;
                                }
                            }
                        }
                    }
/* 60 */            return zzao.zzf;
                }

                @Override // com.google.android.gms.internal.measurement.zzav
                public final zzao zza(String str, zzg zzgVar, List list) {
/* 1 */             zzbk zzbkVar = zzbk.ADD;
/* 7 */             int iOrdinal = zzh.zze(str).ordinal();
/* 22 */            if (iOrdinal == 65) {
/* 538 */               zzao zzaoVar = (zzao) pm2.m7487j(zzbk.WHILE, 4, list, 0);
/* 544 */               zzao zzaoVar2 = (zzao) list.get(1);
/* 550 */               zzao zzaoVar3 = (zzao) list.get(2);
/* 558 */               zzao zzaoVarZza = zzgVar.zza((zzao) list.get(3));
/* 574 */               if (zzgVar.zza(zzaoVar3).zze().booleanValue()) {
/* 580 */                   zzao zzaoVarZzb = zzgVar.zzb((zzae) zzaoVarZza);
/* 586 */                   if (zzaoVarZzb instanceof zzag) {
/* 588 */                       zzag zzagVar = (zzag) zzaoVarZzb;
/* 598 */                       if ("break".equals(zzagVar.zzg())) {
/* 600 */                           return zzao.zzf;
                                }
/* 611 */                       if ("return".equals(zzagVar.zzg())) {
/* 613 */                           return zzagVar;
                                }
                            }
                        }
/* 626 */               while (zzgVar.zza(zzaoVar).zze().booleanValue()) {
/* 631 */                   zzao zzaoVarZzb2 = zzgVar.zzb((zzae) zzaoVarZza);
/* 637 */                   if (zzaoVarZzb2 instanceof zzag) {
/* 639 */                       zzag zzagVar2 = (zzag) zzaoVarZzb2;
/* 649 */                       if ("break".equals(zzagVar2.zzg())) {
/* 651 */                           return zzao.zzf;
                                }
/* 662 */                       if ("return".equals(zzagVar2.zzg())) {
/* 664 */                           return zzagVar2;
                                }
                            }
/* 665 */                   zzgVar.zza(zzaoVar2);
                        }
/* 669 */               return zzao.zzf;
                    }
                    switch (iOrdinal) {
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 484 */                   if (!(pm2.m7487j(zzbk.FOR_IN, 3, list, 0) instanceof zzas)) {
/* 528 */                       C1951n4.m6859j("Variable name in FOR_IN must be a string");
/* 24 */                        return null;
                            }
/* 521 */                   return zzc(new zzbf(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 428 */                   if (!(pm2.m7487j(zzbk.FOR_IN_CONST, 3, list, 0) instanceof zzas)) {
/* 472 */                       C1951n4.m6859j("Variable name in FOR_IN_CONST must be a string");
/* 24 */                        return null;
                            }
/* 465 */                   return zzc(new zzbc(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 372 */                   if (!(pm2.m7487j(zzbk.FOR_IN_LET, 3, list, 0) instanceof zzas)) {
/* 416 */                       C1951n4.m6859j("Variable name in FOR_IN_LET must be a string");
/* 24 */                        return null;
                            }
/* 409 */                   return zzc(new zzbd(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
                        case Build.API_LEVELS.API_29 /* 29 */:
/* 209 */                   zzao zzaoVarZza2 = zzgVar.zza((zzao) pm2.m7487j(zzbk.FOR_LET, 4, list, 0));
/* 215 */                   if (!(zzaoVarZza2 instanceof zzae)) {
/* 360 */                       C1951n4.m6859j("Initializer variables in FOR_LET must be an ArrayList");
/* 24 */                        return null;
                            }
/* 217 */                   zzae zzaeVar = (zzae) zzaoVarZza2;
/* 223 */                   zzao zzaoVar4 = (zzao) list.get(1);
/* 229 */                   zzao zzaoVar5 = (zzao) list.get(2);
/* 237 */                   zzao zzaoVarZza3 = zzgVar.zza((zzao) list.get(3));
/* 241 */                   zzg zzgVarZzc = zzgVar.zzc();
/* 250 */                   for (int i = 0; i < zzaeVar.zzh(); i++) {
/* 256 */                       String strZzc = zzaeVar.zzl(i).zzc();
/* 264 */                       zzgVarZzc.zze(strZzc, zzgVar.zzh(strZzc));
                            }
/* 282 */                   while (zzgVar.zza(zzaoVar4).zze().booleanValue()) {
/* 287 */                       zzao zzaoVarZzb3 = zzgVar.zzb((zzae) zzaoVarZza3);
/* 293 */                       if (zzaoVarZzb3 instanceof zzag) {
/* 295 */                           zzag zzagVar3 = (zzag) zzaoVarZzb3;
/* 305 */                           if ("break".equals(zzagVar3.zzg())) {
/* 307 */                               return zzao.zzf;
                                    }
/* 318 */                           if ("return".equals(zzagVar3.zzg())) {
/* 320 */                               return zzagVar3;
                                    }
                                }
/* 321 */                       zzg zzgVarZzc2 = zzgVar.zzc();
/* 330 */                       for (int i2 = 0; i2 < zzaeVar.zzh(); i2++) {
/* 336 */                           String strZzc2 = zzaeVar.zzl(i2).zzc();
/* 344 */                           zzgVarZzc2.zze(strZzc2, zzgVarZzc.zzh(strZzc2));
                                }
/* 350 */                       zzgVarZzc2.zza(zzaoVar5);
/* 353 */                       zzgVarZzc = zzgVarZzc2;
                            }
/* 355 */                   return zzao.zzf;
                        case Build.API_LEVELS.API_30 /* 30 */:
/* 153 */                   if (!(pm2.m7487j(zzbk.FOR_OF, 3, list, 0) instanceof zzas)) {
/* 197 */                       C1951n4.m6859j("Variable name in FOR_OF must be a string");
/* 24 */                        return null;
                            }
/* 190 */                   return zzd(new zzbf(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
                        case Build.API_LEVELS.API_31 /* 31 */:
/* 97 */                    if (!(pm2.m7487j(zzbk.FOR_OF_CONST, 3, list, 0) instanceof zzas)) {
/* 141 */                       C1951n4.m6859j("Variable name in FOR_OF_CONST must be a string");
/* 24 */                        return null;
                            }
/* 134 */                   return zzd(new zzbc(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
                        case 32:
/* 41 */                    if (!(pm2.m7487j(zzbk.FOR_OF_LET, 3, list, 0) instanceof zzas)) {
/* 85 */                        C1951n4.m6859j("Variable name in FOR_OF_LET must be a string");
/* 24 */                        return null;
                            }
/* 78 */                    return zzd(new zzbd(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
                        default:
/* 28 */                    return zzb(str);
                    }
                }
            }
