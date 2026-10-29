            package com.google.android.gms.internal.measurement;

            import io.sentry.C1697u2;
            import java.util.Iterator;
            import java.util.List;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.f42;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbj extends zzav {
                public zzbj() {
/* 8 */             this.zza.add(zzbk.ASSIGN);
/* 15 */            this.zza.add(zzbk.CONST);
/* 22 */            this.zza.add(zzbk.CREATE_ARRAY);
/* 29 */            this.zza.add(zzbk.CREATE_OBJECT);
/* 36 */            this.zza.add(zzbk.EXPRESSION_LIST);
/* 43 */            this.zza.add(zzbk.GET);
/* 50 */            this.zza.add(zzbk.GET_INDEX);
/* 57 */            this.zza.add(zzbk.GET_PROPERTY);
/* 64 */            this.zza.add(zzbk.NULL);
/* 71 */            this.zza.add(zzbk.SET_PROPERTY);
/* 78 */            this.zza.add(zzbk.TYPEOF);
/* 85 */            this.zza.add(zzbk.UNDEFINED);
/* 92 */            this.zza.add(zzbk.VAR);
                }

                @Override // com.google.android.gms.internal.measurement.zzav
                public final zzao zza(String str, zzg zzgVar, List list) {
                    String str2;
/* 1 */             zzbk zzbkVar = zzbk.ADD;
/* 7 */             int iOrdinal = zzh.zze(str).ordinal();
/* 13 */            int i = 0;
/* 16 */            if (iOrdinal == 3) {
/* 808 */               zzao zzaoVarZza = zzgVar.zza((zzao) pm2.m7487j(zzbk.ASSIGN, 2, list, 0));
/* 814 */               if (!(zzaoVarZza instanceof zzas)) {
/* 872 */                   C1951n4.m6859j(AbstractC0886en.m3507k("Expected string for assign var. got ", zzaoVarZza.getClass().getCanonicalName()));
/* 11 */                    return null;
                        }
/* 824 */               if (!zzgVar.zzd(zzaoVarZza.zzc())) {
/* 854 */                   C1951n4.m6859j(AbstractC0886en.m3507k("Attempting to assign undefined value ", zzaoVarZza.zzc()));
/* 11 */                    return null;
                        }
/* 832 */               zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
/* 840 */               zzgVar.zze(zzaoVarZza.zzc(), zzaoVarZza2);
/* 843 */               return zzaoVarZza2;
                    }
/* 20 */            if (iOrdinal == 14) {
/* 711 */               zzh.zzb(zzbk.CONST.name(), 2, list);
/* 719 */               if (list.size() % 2 != 0) {
/* 796 */                   C1951n4.m6859j(fm0.m3781g(list.size(), "CONST requires an even number of arguments, found "));
/* 11 */                    return null;
                        }
/* 727 */               while (i < list.size() - 1) {
/* 735 */                   zzao zzaoVarZza3 = zzgVar.zza((zzao) list.get(i));
/* 741 */                   if (!(zzaoVarZza3 instanceof zzas)) {
/* 779 */                       C1951n4.m6859j(AbstractC0886en.m3507k("Expected string for const name. got ", zzaoVarZza3.getClass().getCanonicalName()));
/* 11 */                        return null;
                            }
/* 759 */                   zzgVar.zzg(zzaoVarZza3.zzc(), zzgVar.zza((zzao) list.get(i + 1)));
/* 762 */                   i += 2;
                        }
/* 783 */               return zzao.zzf;
                    }
/* 24 */            if (iOrdinal == 24) {
/* 670 */               zzh.zzb(zzbk.EXPRESSION_LIST.name(), 1, list);
/* 673 */               zzao zzaoVarZza4 = zzao.zzf;
/* 679 */               while (i < list.size()) {
/* 687 */                   zzaoVarZza4 = zzgVar.zza((zzao) list.get(i));
/* 693 */                   if (zzaoVarZza4 instanceof zzag) {
/* 700 */                       f42.m3656l("ControlValue cannot be in an expression list");
/* 11 */                        return null;
                            }
/* 695 */                   i++;
                        }
/* 704 */               return zzaoVarZza4;
                    }
/* 28 */            if (iOrdinal == 33) {
/* 629 */               zzao zzaoVarZza5 = zzgVar.zza((zzao) pm2.m7487j(zzbk.GET, 1, list, 0));
/* 635 */               if (zzaoVarZza5 instanceof zzas) {
/* 641 */                   return zzgVar.zzh(zzaoVarZza5.zzc());
                        }
/* 660 */               C1951n4.m6859j(AbstractC0886en.m3507k("Expected string for get var. got ", zzaoVarZza5.getClass().getCanonicalName()));
/* 11 */                return null;
                    }
/* 32 */            if (iOrdinal == 49) {
/* 615 */               zzh.zza(zzbk.NULL.name(), 0, list);
/* 618 */               return zzao.zzg;
                    }
/* 36 */            if (iOrdinal == 58) {
/* 520 */               zzao zzaoVarZza6 = zzgVar.zza((zzao) pm2.m7487j(zzbk.SET_PROPERTY, 3, list, 0));
/* 530 */               zzao zzaoVarZza7 = zzgVar.zza((zzao) list.get(1));
/* 540 */               zzao zzaoVarZza8 = zzgVar.zza((zzao) list.get(2));
/* 546 */               if (zzaoVarZza6 == zzao.zzf || zzaoVarZza6 == zzao.zzg) {
/* 605 */                   f42.m3656l(AbstractC0886en.m3509m("Can't set property ", zzaoVarZza7.zzc(), " of ", zzaoVarZza6.zzc()));
/* 11 */                    return null;
                        }
/* 554 */               if ((zzaoVarZza6 instanceof zzae) && (zzaoVarZza7 instanceof zzah)) {
/* 570 */                   ((zzae) zzaoVarZza6).zzn(zzaoVarZza7.zzd().intValue(), zzaoVarZza8);
/* 573 */                   return zzaoVarZza8;
                        }
/* 576 */               if (!(zzaoVarZza6 instanceof zzak)) {
/* 578 */                   return zzaoVarZza8;
                        }
/* 585 */               ((zzak) zzaoVarZza6).zzm(zzaoVarZza7.zzc(), zzaoVarZza8);
/* 588 */               return zzaoVarZza8;
                    }
/* 40 */            if (iOrdinal == 17) {
/* 461 */               if (list.isEmpty()) {
/* 465 */                   return new zzae();
                        }
/* 471 */               zzae zzaeVar = new zzae();
/* 474 */               Iterator it = list.iterator();
/* 482 */               while (it.hasNext()) {
/* 490 */                   zzao zzaoVarZza9 = zzgVar.zza((zzao) it.next());
/* 496 */                   if (zzaoVarZza9 instanceof zzag) {
/* 507 */                       f42.m3656l("Failed to evaluate array element");
/* 11 */                        return null;
                            }
/* 500 */                   zzaeVar.zzn(i, zzaoVarZza9);
/* 498 */                   i++;
                        }
/* 511 */               return zzaeVar;
                    }
/* 44 */            if (iOrdinal == 18) {
/* 368 */               if (list.isEmpty()) {
/* 372 */                   return new zzal();
                        }
/* 381 */               if (list.size() % 2 != 0) {
/* 453 */                   C1951n4.m6859j(fm0.m3781g(list.size(), "CREATE_OBJECT requires an even number of arguments, found "));
/* 11 */                    return null;
                        }
/* 385 */               zzal zzalVar = new zzal();
/* 394 */               while (i < list.size() - 1) {
/* 402 */                   zzao zzaoVarZza10 = zzgVar.zza((zzao) list.get(i));
/* 414 */                   zzao zzaoVarZza11 = zzgVar.zza((zzao) list.get(i + 1));
/* 420 */                   if ((zzaoVarZza10 instanceof zzag) || (zzaoVarZza11 instanceof zzag)) {
/* 438 */                       f42.m3656l("Failed to evaluate map entry");
/* 11 */                        return null;
                            }
/* 430 */                   zzalVar.zzm(zzaoVarZza10.zzc(), zzaoVarZza11);
/* 433 */                   i += 2;
                        }
/* 442 */               return zzalVar;
                    }
/* 48 */            if (iOrdinal == 35 || iOrdinal == 36) {
/* 219 */               zzao zzaoVarZza12 = zzgVar.zza((zzao) pm2.m7487j(zzbk.GET_PROPERTY, 2, list, 0));
/* 229 */               zzao zzaoVarZza13 = zzgVar.zza((zzao) list.get(1));
/* 235 */               if ((zzaoVarZza12 instanceof zzae) && zzh.zzd(zzaoVarZza13)) {
/* 253 */                   return ((zzae) zzaoVarZza12).zzl(zzaoVarZza13.zzd().intValue());
                        }
/* 260 */               if (zzaoVarZza12 instanceof zzak) {
/* 268 */                   return ((zzak) zzaoVarZza12).zzk(zzaoVarZza13.zzc());
                        }
/* 275 */               if (zzaoVarZza12 instanceof zzas) {
/* 287 */                   if ("length".equals(zzaoVarZza13.zzc())) {
/* 304 */                       return new zzah(Double.valueOf(zzaoVarZza12.zzc().length()));
                            }
/* 312 */                   if (zzh.zzd(zzaoVarZza13) && zzaoVarZza13.zzd().doubleValue() < zzaoVarZza12.zzc().length()) {
/* 357 */                       return new zzas(String.valueOf(zzaoVarZza12.zzc().charAt(zzaoVarZza13.zzd().intValue())));
                            }
                        }
/* 361 */               return zzao.zzf;
                    }
                    switch (iOrdinal) {
                        case 62:
/* 146 */                   zzao zzaoVarZza14 = zzgVar.zza((zzao) pm2.m7487j(zzbk.TYPEOF, 1, list, 0));
/* 152 */                   if (zzaoVarZza14 instanceof zzat) {
/* 154 */                       str2 = "undefined";
                            } else if (zzaoVarZza14 instanceof zzaf) {
/* 161 */                       str2 = "boolean";
                            } else if (zzaoVarZza14 instanceof zzah) {
/* 168 */                       str2 = "number";
                            } else if (zzaoVarZza14 instanceof zzas) {
/* 175 */                       str2 = "string";
                            } else if (zzaoVarZza14 instanceof zzan) {
/* 182 */                       str2 = "function";
                            } else {
/* 187 */                       if ((zzaoVarZza14 instanceof zzap) || (zzaoVarZza14 instanceof zzag)) {
/* 207 */                           C1697u2.m5437m("Unsupported value type %s in typeof", new Object[]{zzaoVarZza14});
/* 11 */                            return null;
                                }
/* 193 */                       str2 = "object";
                            }
/* 197 */                   return new zzas(str2);
                        case 63:
/* 132 */                   zzh.zza(zzbk.UNDEFINED.name(), 0, list);
/* 135 */                   return zzao.zzf;
                        case 64:
/* 68 */                    zzh.zzb(zzbk.VAR.name(), 1, list);
/* 71 */                    Iterator it2 = list.iterator();
/* 79 */                    while (it2.hasNext()) {
/* 87 */                        zzao zzaoVarZza15 = zzgVar.zza((zzao) it2.next());
/* 93 */                        if (!(zzaoVarZza15 instanceof zzas)) {
/* 119 */                           C1951n4.m6859j(AbstractC0886en.m3507k("Expected string for var name. got ", zzaoVarZza15.getClass().getCanonicalName()));
/* 11 */                            return null;
                                }
/* 101 */                       zzgVar.zzf(zzaoVarZza15.zzc(), zzao.zzf);
                            }
/* 123 */                   return zzao.zzf;
                        default:
/* 57 */                    return zzb(str);
                    }
                }
            }
