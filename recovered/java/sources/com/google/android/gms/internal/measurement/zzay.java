            package com.google.android.gms.internal.measurement;

            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import java.util.List;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzay extends zzav {
                public zzay() {
/* 8 */             this.zza.add(zzbk.APPLY);
/* 15 */            this.zza.add(zzbk.BLOCK);
/* 22 */            this.zza.add(zzbk.BREAK);
/* 29 */            this.zza.add(zzbk.CASE);
/* 36 */            this.zza.add(zzbk.DEFAULT);
/* 43 */            this.zza.add(zzbk.CONTINUE);
/* 50 */            this.zza.add(zzbk.DEFINE_FUNCTION);
/* 57 */            this.zza.add(zzbk.FN);
/* 64 */            this.zza.add(zzbk.IF);
/* 71 */            this.zza.add(zzbk.QUOTE);
/* 78 */            this.zza.add(zzbk.RETURN);
/* 85 */            this.zza.add(zzbk.SWITCH);
/* 92 */            this.zza.add(zzbk.TERNARY);
                }

                private static zzao zzc(zzg zzgVar, List list) {
/* 8 */             zzh.zzb(zzbk.FN.name(), 2, list);
/* 18 */            zzao zzaoVarZza = zzgVar.zza((zzao) list.get(0));
/* 29 */            zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
/* 35 */            if (!(zzaoVarZza2 instanceof zzae)) {
/* 86 */                C1951n4.m6859j(AbstractC0886en.m3507k("FN requires an ArrayValue of parameter names found ", zzaoVarZza2.getClass().getCanonicalName()));
/* 89 */                return null;
                    }
/* 39 */            List listZzb = ((zzae) zzaoVarZza2).zzb();
/* 45 */            List arrayList = new ArrayList();
/* 52 */            if (list.size() > 2) {
/* 58 */                arrayList = list.subList(2, list.size());
                    }
/* 68 */            return new zzan(zzaoVarZza.zzc(), listZzb, arrayList, zzgVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzav
                public final zzao zza(String str, zzg zzgVar, List list) {
/* 1 */             zzbk zzbkVar = zzbk.ADD;
/* 7 */             int iOrdinal = zzh.zze(str).ordinal();
/* 16 */            if (iOrdinal == 2) {
/* 511 */               zzao zzaoVarZza = zzgVar.zza((zzao) pm2.m7487j(zzbk.APPLY, 3, list, 0));
/* 525 */               String strZzc = zzgVar.zza((zzao) list.get(1)).zzc();
/* 535 */               zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(2));
/* 541 */               if (!(zzaoVarZza2 instanceof zzae)) {
/* 580 */                   C1951n4.m6859j(AbstractC0886en.m3507k("Function arguments for Apply are not a list found ", zzaoVarZza2.getClass().getCanonicalName()));
/* 11 */                    return null;
                        }
/* 547 */               if (!strZzc.isEmpty()) {
/* 555 */                   return zzaoVarZza.zzcA(strZzc, zzgVar, ((zzae) zzaoVarZza2).zzb());
                        }
/* 562 */               C1951n4.m6859j("Function name for apply is undefined");
/* 11 */                return null;
                    }
/* 20 */            if (iOrdinal == 15) {
/* 497 */               zzh.zza(zzbk.BREAK.name(), 0, list);
/* 500 */               return zzao.zzh;
                    }
/* 24 */            if (iOrdinal == 25) {
/* 486 */               return zzc(zzgVar, list);
                    }
/* 28 */            if (iOrdinal == 41) {
/* 412 */               zzh.zzb(zzbk.IF.name(), 2, list);
/* 421 */               zzao zzaoVarZza3 = zzgVar.zza((zzao) list.get(0));
/* 431 */               zzao zzaoVarZza4 = zzgVar.zza((zzao) list.get(1));
/* 447 */               zzao zzaoVarZza5 = list.size() > 2 ? zzgVar.zza((zzao) list.get(2)) : null;
/* 451 */               zzao zzaoVar = zzao.zzf;
/* 479 */               zzao zzaoVarZzb = zzaoVarZza3.zze().booleanValue() ? zzgVar.zzb((zzae) zzaoVarZza4) : zzaoVarZza5 != null ? zzgVar.zzb((zzae) zzaoVarZza5) : zzaoVar;
                        return true != (zzaoVarZzb instanceof zzag) ? zzaoVar : zzaoVarZzb;
                    }
/* 32 */            if (iOrdinal == 54) {
/* 402 */               return new zzae(list);
                    }
/* 38 */            if (iOrdinal == 57) {
                        return list.isEmpty() ? zzao.zzj : new zzag("return", zzgVar.zza((zzao) pm2.m7487j(zzbk.RETURN, 1, list, 0)));
                    }
/* 42 */            if (iOrdinal != 19) {
/* 46 */                if (iOrdinal == 20) {
/* 311 */                   zzh.zzb(zzbk.DEFINE_FUNCTION.name(), 2, list);
/* 318 */                   zzan zzanVar = (zzan) zzc(zzgVar, list);
/* 324 */                   if (zzanVar.zzg() == null) {
/* 328 */                       zzgVar.zze(HttpUrl.FRAGMENT_ENCODE_SET, zzanVar);
/* 331 */                       return zzanVar;
                            }
/* 336 */                   zzgVar.zze(zzanVar.zzg(), zzanVar);
/* 339 */                   return zzanVar;
                        }
/* 50 */                if (iOrdinal == 60) {
/* 142 */                   zzao zzaoVarZza6 = zzgVar.zza((zzao) pm2.m7487j(zzbk.SWITCH, 3, list, 0));
/* 152 */                   zzao zzaoVarZza7 = zzgVar.zza((zzao) list.get(1));
/* 162 */                   zzao zzaoVarZza8 = zzgVar.zza((zzao) list.get(2));
/* 168 */                   if (!(zzaoVarZza7 instanceof zzae)) {
/* 301 */                       C1951n4.m6859j("Malformed SWITCH statement, cases are not a list");
/* 11 */                        return null;
                            }
/* 172 */                   if (!(zzaoVarZza8 instanceof zzae)) {
/* 295 */                       C1951n4.m6859j("Malformed SWITCH statement, case statements are not a list");
/* 11 */                        return null;
                            }
/* 174 */                   zzae zzaeVar = (zzae) zzaoVarZza7;
/* 176 */                   zzae zzaeVar2 = (zzae) zzaoVarZza8;
/* 179 */                   boolean z = false;
/* 184 */                   for (int i = 0; i < zzaeVar.zzh(); i++) {
/* 186 */                       if (z || zzaoVarZza6.equals(zzgVar.zza(zzaeVar.zzl(i)))) {
/* 209 */                           zzao zzaoVarZza9 = zzgVar.zza(zzaeVar2.zzl(i));
/* 215 */                           if (zzaoVarZza9 instanceof zzag) {
                                        return ((zzag) zzaoVarZza9).zzg().equals("break") ? zzao.zzf : zzaoVarZza9;
                                    }
/* 236 */                           z = true;
                                } else {
/* 203 */                           z = false;
                                }
                            }
/* 249 */                   if (zzaeVar.zzh() + 1 == zzaeVar2.zzh()) {
/* 259 */                       zzao zzaoVarZza10 = zzgVar.zza(zzaeVar2.zzl(zzaeVar.zzh()));
/* 265 */                       if (zzaoVarZza10 instanceof zzag) {
/* 270 */                           String strZzg = ((zzag) zzaoVarZza10).zzg();
/* 278 */                           if (strZzg.equals("return") || strZzg.equals("continue")) {
/* 289 */                               return zzaoVarZza10;
                                    }
                                }
                            }
/* 290 */                   return zzao.zzf;
                        }
/* 54 */                if (iOrdinal == 61) {
                            return zzgVar.zza((zzao) pm2.m7487j(zzbk.TERNARY, 3, list, 0)).zze().booleanValue() ? zzgVar.zza((zzao) list.get(1)) : zzgVar.zza((zzao) list.get(2));
                        }
                        switch (iOrdinal) {
                            case 11:
/* 85 */                        return zzgVar.zzc().zzb(new zzae(list));
                            case 12:
/* 70 */                        zzh.zza(zzbk.BREAK.name(), 0, list);
/* 73 */                        return zzao.zzi;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                                break;
                            default:
/* 59 */                        return zzb(str);
                        }
                    }
/* 344 */           if (list.isEmpty()) {
/* 346 */               return zzao.zzf;
                    }
/* 355 */           zzao zzaoVarZza11 = zzgVar.zza((zzao) list.get(0));
                    return zzaoVarZza11 instanceof zzae ? zzgVar.zzb((zzae) zzaoVarZza11) : zzao.zzf;
                }
            }
