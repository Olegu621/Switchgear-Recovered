            package com.google.android.gms.internal.measurement;

            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzba {
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                public static zzao zza(String str, zzae zzaeVar, zzg zzgVar, List list) {
                    double dZzh;
/* 3 */             Double dValueOf = Double.valueOf(-1.0d);
/* 11 */            String strZzc = ",";
/* 15 */            double dZzh2 = 0.0d;
/* 17 */            zzai zzaiVar = null;
/* 20 */            int i = 0;
                    switch (str.hashCode()) {
                        case -1776922004:
/* 1602 */                  if (str.equals("toString")) {
/* 1604 */                      zzh.zza("toString", 0, list);
/* 1613 */                      return new zzas(zzaeVar.zzs(","));
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case -1354795244:
/* 1504 */                  if (str.equals("concat")) {
/* 1510 */                      zzae zzaeVar2 = (zzae) zzaeVar.zzt();
/* 1516 */                      if (!list.isEmpty()) {
/* 1518 */                          Iterator it = list.iterator();
/* 1526 */                          while (it.hasNext()) {
/* 1534 */                              zzao zzaoVarZza = zzgVar.zza((zzao) it.next());
/* 1540 */                              if (zzaoVarZza instanceof zzag) {
/* 1591 */                                  f42.m3656l("Failed evaluation of arguments");
/* 17 */                                    return null;
                                        }
/* 1542 */                              int iZzh = zzaeVar2.zzh();
/* 1548 */                              if (zzaoVarZza instanceof zzae) {
/* 1550 */                                  zzae zzaeVar3 = (zzae) zzaoVarZza;
/* 1552 */                                  Iterator itZzg = zzaeVar3.zzg();
/* 1560 */                                  while (itZzg.hasNext()) {
/* 1566 */                                      Integer num = (Integer) itZzg.next();
/* 1581 */                                      zzaeVar2.zzn(num.intValue() + iZzh, zzaeVar3.zzl(num.intValue()));
                                            }
                                        } else {
/* 1585 */                                  zzaeVar2.zzn(iZzh, zzaoVarZza);
                                        }
                                    }
                                }
/* 1595 */                      return zzaeVar2;
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case -1274492040:
/* 1411 */                  if (str.equals("filter")) {
/* 1413 */                      zzh.zza("filter", 1, list);
/* 1422 */                      zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(0));
/* 1428 */                      if (!(zzaoVarZza2 instanceof zzan)) {
/* 1494 */                          C1951n4.m6859j("Callback should be a method");
/* 17 */                            return null;
                                }
/* 1434 */                      if (zzaeVar.zzi() == 0) {
/* 1438 */                          return new zzae();
                                }
/* 1446 */                      zzae zzaeVar4 = (zzae) zzaeVar.zzt();
/* 1452 */                      zzae zzaeVarZzc = zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza2, null, Boolean.TRUE);
/* 1458 */                      zzae zzaeVar5 = new zzae();
/* 1461 */                      Iterator itZzg2 = zzaeVarZzc.zzg();
/* 1469 */                      while (itZzg2.hasNext()) {
/* 1489 */                          zzaeVar5.zzn(zzaeVar5.zzh(), zzaeVar4.zzl(((Integer) itZzg2.next()).intValue()));
                                }
/* 1493 */                      return zzaeVar5;
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case -934873754:
/* 1398 */                  if (str.equals("reduce")) {
/* 1400 */                      return zzb(zzaeVar, zzgVar, list, true);
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case -895859076:
/* 1201 */                  if (str.equals("splice")) {
/* 1207 */                      if (list.isEmpty()) {
/* 1211 */                          return new zzae();
                                }
/* 1237 */                      int iZzi = (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
/* 1238 */                      if (iZzi < 0) {
/* 1245 */                          iZzi = Math.max(0, zzaeVar.zzh() + iZzi);
                                } else if (iZzi > zzaeVar.zzh()) {
/* 1256 */                          iZzi = zzaeVar.zzh();
                                }
/* 1260 */                      int iZzh2 = zzaeVar.zzh();
/* 1266 */                      zzae zzaeVar6 = new zzae();
/* 1273 */                      if (list.size() > 1) {
/* 1298 */                          int iMax = Math.max(0, (int) zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
/* 1302 */                          if (iMax > 0) {
/* 1311 */                              for (int i2 = iZzi; i2 < Math.min(iZzh2, iZzi + iMax); i2++) {
/* 1321 */                                  zzaeVar6.zzn(zzaeVar6.zzh(), zzaeVar.zzl(iZzi));
/* 1324 */                                  zzaeVar.zzr(iZzi);
                                        }
                                    }
/* 1334 */                          if (list.size() > 2) {
/* 1340 */                              for (int i3 = 2; i3 < list.size(); i3++) {
/* 1348 */                                  zzao zzaoVarZza3 = zzgVar.zza((zzao) list.get(i3));
/* 1354 */                                  if (zzaoVarZza3 instanceof zzag) {
/* 1368 */                                      C1951n4.m6859j("Failed to parse elements to add");
/* 17 */                                        return null;
                                            }
/* 1360 */                                  zzaeVar.zzq((iZzi + i3) - 2, zzaoVarZza3);
                                        }
                                    }
                                } else {
/* 1372 */                          while (iZzi < iZzh2) {
/* 1382 */                              zzaeVar6.zzn(zzaeVar6.zzh(), zzaeVar.zzl(iZzi));
/* 1385 */                              zzaeVar.zzn(iZzi, null);
/* 1388 */                              iZzi++;
                                    }
                                }
/* 1391 */                      return zzaeVar6;
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case -678635926:
/* 1155 */                  if (str.equals("forEach")) {
/* 1157 */                      zzh.zza("forEach", 1, list);
/* 1166 */                      zzao zzaoVarZza4 = zzgVar.zza((zzao) list.get(0));
/* 1172 */                      if (!(zzaoVarZza4 instanceof zzan)) {
/* 1191 */                          C1951n4.m6859j("Callback should be a method");
/* 17 */                            return null;
                                }
/* 1178 */                      if (zzaeVar.zzi() == 0) {
/* 1180 */                          return zzao.zzf;
                                }
/* 1185 */                      zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza4, null, null);
/* 1188 */                      return zzao.zzf;
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case -467511597:
/* 1000 */                  if (str.equals("lastIndexOf")) {
/* 1002 */                      zzh.zzc("lastIndexOf", 2, list);
/* 1005 */                      zzao zzaoVarZza5 = zzao.zzf;
/* 1011 */                      if (!list.isEmpty()) {
/* 1019 */                          zzaoVarZza5 = zzgVar.zza((zzao) list.get(0));
                                }
/* 1027 */                      int iZzh3 = zzaeVar.zzh() - 1;
/* 1033 */                      if (list.size() > 1) {
/* 1041 */                          zzao zzaoVarZza6 = zzgVar.zza((zzao) list.get(1));
/* 1075 */                          dZzh = Double.isNaN(zzaoVarZza6.zzd().doubleValue()) ? zzaeVar.zzh() - 1 : zzh.zzi(zzaoVarZza6.zzd().doubleValue());
/* 1081 */                          if (dZzh < 0.0d) {
/* 1088 */                              dZzh += (double) zzaeVar.zzh();
                                    }
                                } else {
                                    dZzh = iZzh3;
                                }
/* 1093 */                      if (dZzh < 0.0d) {
/* 1097 */                          return new zzah(dValueOf);
                                }
/* 1111 */                      for (int iMin = (int) Math.min(zzaeVar.zzh(), dZzh); iMin >= 0; iMin--) {
/* 1117 */                          if (zzaeVar.zzo(iMin) && zzh.zzf(zzaeVar.zzl(iMin), zzaoVarZza5)) {
/* 1136 */                              return new zzah(Double.valueOf(iMin));
                                    }
                                }
/* 1145 */                      return new zzah(dValueOf);
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case -277637751:
/* 856 */                   if (str.equals("unshift")) {
/* 862 */                       if (!list.isEmpty()) {
/* 866 */                           zzae zzaeVar7 = new zzae();
/* 869 */                           Iterator it2 = list.iterator();
/* 877 */                           while (it2.hasNext()) {
/* 885 */                               zzao zzaoVarZza7 = zzgVar.zza((zzao) it2.next());
/* 891 */                               if (zzaoVarZza7 instanceof zzag) {
/* 903 */                                   f42.m3656l("Argument evaluation failed");
/* 17 */                                    return null;
                                        }
/* 897 */                               zzaeVar7.zzn(zzaeVar7.zzh(), zzaoVarZza7);
                                    }
/* 907 */                           int iZzh4 = zzaeVar7.zzh();
/* 911 */                           Iterator itZzg3 = zzaeVar.zzg();
/* 919 */                           while (itZzg3.hasNext()) {
/* 925 */                               Integer num2 = (Integer) itZzg3.next();
/* 940 */                               zzaeVar7.zzn(num2.intValue() + iZzh4, zzaeVar.zzl(num2.intValue()));
                                    }
/* 944 */                           zzaeVar.zzp();
/* 947 */                           Iterator itZzg4 = zzaeVar7.zzg();
/* 955 */                           while (itZzg4.hasNext()) {
/* 961 */                               Integer num3 = (Integer) itZzg4.next();
/* 975 */                               zzaeVar.zzn(num3.intValue(), zzaeVar7.zzl(num3.intValue()));
                                    }
                                }
/* 990 */                       return new zzah(Double.valueOf(zzaeVar.zzh()));
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case 107868:
/* 808 */                   if (str.equals("map")) {
/* 810 */                       zzh.zza("map", 1, list);
/* 819 */                       zzao zzaoVarZza8 = zzgVar.zza((zzao) list.get(0));
/* 825 */                       if (zzaoVarZza8 instanceof zzan) {
                                    return zzaeVar.zzh() == 0 ? new zzae() : zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza8, null, null);
                                }
/* 846 */                       C1951n4.m6859j("Callback should be a method");
/* 17 */                        return null;
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case 111185:
/* 778 */                   if (str.equals("pop")) {
/* 780 */                       zzh.zza("pop", 0, list);
/* 783 */                       int iZzh5 = zzaeVar.zzh();
/* 787 */                       if (iZzh5 == 0) {
/* 789 */                           return zzao.zzf;
                                }
/* 792 */                       int i4 = iZzh5 - 1;
/* 794 */                       zzao zzaoVarZzl = zzaeVar.zzl(i4);
/* 798 */                       zzaeVar.zzr(i4);
/* 801 */                       return zzaoVarZzl;
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case 3267882:
/* 716 */                   if (str.equals("join")) {
/* 718 */                       zzh.zzc("join", 1, list);
/* 725 */                       if (zzaeVar.zzh() == 0) {
/* 727 */                           return zzao.zzm;
                                }
/* 734 */                       if (!list.isEmpty()) {
/* 742 */                           zzao zzaoVarZza9 = zzgVar.zza((zzao) list.get(0));
/* 760 */                           strZzc = ((zzaoVarZza9 instanceof zzam) || (zzaoVarZza9 instanceof zzat)) ? HttpUrl.FRAGMENT_ENCODE_SET : zzaoVarZza9.zzc();
                                }
/* 768 */                       return new zzas(zzaeVar.zzs(strZzc));
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case 3452698:
/* 659 */                   if (str.equals("push")) {
/* 665 */                       if (!list.isEmpty()) {
/* 667 */                           Iterator it3 = list.iterator();
/* 675 */                           while (it3.hasNext()) {
/* 691 */                               zzaeVar.zzn(zzaeVar.zzh(), zzgVar.zza((zzao) it3.next()));
                                    }
                                }
/* 706 */                       return new zzah(Double.valueOf(zzaeVar.zzh()));
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case 3536116:
/* 546 */                   if (str.equals("some")) {
/* 548 */                       zzh.zza("some", 1, list);
/* 557 */                       zzao zzaoVarZza10 = zzgVar.zza((zzao) list.get(0));
/* 563 */                       if (!(zzaoVarZza10 instanceof zzai)) {
/* 649 */                           C1951n4.m6859j("Callback should be a method");
/* 17 */                            return null;
                                }
/* 569 */                       if (zzaeVar.zzh() == 0) {
/* 571 */                           return zzao.zzl;
                                }
/* 574 */                       zzai zzaiVar2 = (zzai) zzaoVarZza10;
/* 576 */                       Iterator itZzg5 = zzaeVar.zzg();
/* 584 */                       while (itZzg5.hasNext()) {
/* 592 */                           int iIntValue = ((Integer) itZzg5.next()).intValue();
/* 600 */                           if (zzaeVar.zzo(iIntValue) && zzaiVar2.zza(zzgVar, Arrays.asList(zzaeVar.zzl(iIntValue), new zzah(Double.valueOf(iIntValue)), zzaeVar)).zze().booleanValue()) {
/* 643 */                               return zzao.zzk;
                                    }
                                }
/* 646 */                       return zzao.zzl;
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case 3536286:
/* 460 */                   if (str.equals("sort")) {
/* 462 */                       zzh.zzc("sort", 1, list);
/* 469 */                       if (zzaeVar.zzh() >= 2) {
/* 471 */                           List listZzb = zzaeVar.zzb();
/* 479 */                           if (!list.isEmpty()) {
/* 487 */                               zzao zzaoVarZza11 = zzgVar.zza((zzao) list.get(0));
/* 493 */                               if (!(zzaoVarZza11 instanceof zzai)) {
/* 501 */                                   C1951n4.m6859j("Comparator should be a method");
/* 17 */                                    return null;
                                        }
/* 496 */                               zzaiVar = (zzai) zzaoVarZza11;
                                    }
/* 510 */                           Collections.sort(listZzb, new zzaz(zzaiVar, zzgVar));
/* 513 */                           zzaeVar.zzp();
/* 516 */                           Iterator it4 = listZzb.iterator();
/* 524 */                           while (it4.hasNext()) {
/* 534 */                               zzaeVar.zzn(i, (zzao) it4.next());
/* 532 */                               i++;
                                    }
                                }
/* 539 */                       return zzaeVar;
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case 96891675:
/* 396 */                   if (str.equals("every")) {
/* 398 */                       zzh.zza("every", 1, list);
/* 407 */                       zzao zzaoVarZza12 = zzgVar.zza((zzao) list.get(0));
/* 413 */                       if (!(zzaoVarZza12 instanceof zzan)) {
/* 450 */                           C1951n4.m6859j("Callback should be a method");
/* 17 */                            return null;
                                }
/* 419 */                       if (zzaeVar.zzh() == 0) {
/* 421 */                           return zzao.zzk;
                                }
                                return zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza12, Boolean.FALSE, Boolean.TRUE).zzh() != zzaeVar.zzh() ? zzao.zzl : zzao.zzk;
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case 109407362:
/* 368 */                   if (str.equals("shift")) {
/* 370 */                       zzh.zza("shift", 0, list);
/* 377 */                       if (zzaeVar.zzh() == 0) {
/* 379 */                           return zzao.zzf;
                                }
/* 382 */                       zzao zzaoVarZzl2 = zzaeVar.zzl(0);
/* 386 */                       zzaeVar.zzr(0);
/* 389 */                       return zzaoVarZzl2;
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case 109526418:
/* 237 */                   if (str.equals("slice")) {
/* 239 */                       zzh.zzc("slice", 2, list);
/* 246 */                       if (list.isEmpty()) {
/* 248 */                           return zzaeVar.zzt();
                                }
/* 253 */                       double dZzh3 = zzaeVar.zzh();
/* 276 */                       double dZzi = zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
/* 290 */                       double dMax = dZzi < 0.0d ? Math.max(dZzi + dZzh3, 0.0d) : Math.min(dZzi, dZzh3);
/* 298 */                       if (list.size() == 2) {
/* 318 */                           double dZzi2 = zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
/* 332 */                           dZzh3 = dZzi2 < 0.0d ? Math.max(dZzh3 + dZzi2, 0.0d) : Math.min(dZzh3, dZzi2);
                                }
/* 338 */                       zzae zzaeVar8 = new zzae();
/* 345 */                       for (int i5 = (int) dMax; i5 < dZzh3; i5++) {
/* 355 */                           zzaeVar8.zzn(zzaeVar8.zzh(), zzaeVar.zzl(i5));
                                }
/* 361 */                       return zzaeVar8;
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case 965561430:
/* 224 */                   if (str.equals("reduceRight")) {
/* 226 */                       return zzb(zzaeVar, zzgVar, list, false);
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case 1099846370:
/* 168 */                   if (str.equals("reverse")) {
/* 170 */                       zzh.zza("reverse", 0, list);
/* 173 */                       int iZzh6 = zzaeVar.zzh();
/* 177 */                       if (iZzh6 != 0) {
/* 181 */                           while (i < iZzh6 / 2) {
/* 187 */                               if (zzaeVar.zzo(i)) {
/* 189 */                                   zzao zzaoVarZzl3 = zzaeVar.zzl(i);
/* 193 */                                   zzaeVar.zzn(i, null);
/* 198 */                                   int i6 = (iZzh6 - 1) - i;
/* 203 */                                   if (zzaeVar.zzo(i6)) {
/* 209 */                                       zzaeVar.zzn(i, zzaeVar.zzl(i6));
                                            }
/* 212 */                                   zzaeVar.zzn(i6, zzaoVarZzl3);
                                        }
/* 215 */                               i++;
                                    }
                                }
/* 539 */                       return zzaeVar;
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        case 1943291465:
/* 32 */                    if (str.equals("indexOf")) {
/* 34 */                        zzh.zzc("indexOf", 2, list);
/* 37 */                        zzao zzaoVarZza13 = zzao.zzf;
/* 43 */                        if (!list.isEmpty()) {
/* 51 */                            zzaoVarZza13 = zzgVar.zza((zzao) list.get(0));
                                }
/* 59 */                        if (list.size() > 1) {
/* 79 */                            double dZzi3 = zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
/* 90 */                            if (dZzi3 >= zzaeVar.zzh()) {
/* 94 */                                return new zzah(dValueOf);
                                    }
/* 110 */                           dZzh2 = dZzi3 < 0.0d ? ((double) zzaeVar.zzh()) + dZzi3 : dZzi3;
                                }
/* 111 */                       Iterator itZzg6 = zzaeVar.zzg();
/* 119 */                       while (itZzg6.hasNext()) {
/* 127 */                           int iIntValue2 = ((Integer) itZzg6.next()).intValue();
                                    double d = iIntValue2;
/* 134 */                           if (d >= dZzh2 && zzh.zzf(zzaeVar.zzl(iIntValue2), zzaoVarZza13)) {
/* 152 */                               return new zzah(Double.valueOf(d));
                                    }
                                }
/* 158 */                       return new zzah(dValueOf);
                            }
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                        default:
/* 1619 */                  C1951n4.m6859j("Command not supported");
/* 17 */                    return null;
                    }
                }

                private static zzao zzb(zzae zzaeVar, zzg zzgVar, List list, boolean z) {
                    zzao zzaoVarZza;
/* 4 */             zzh.zzb("reduce", 1, list);
/* 8 */             zzh.zzc("reduce", 2, list);
/* 18 */            zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(0));
/* 25 */            if (!(zzaoVarZza2 instanceof zzai)) {
/* 155 */               C1951n4.m6859j("Callback should be a method");
/* 24 */                return null;
                    }
/* 31 */            if (list.size() == 2) {
/* 39 */                zzaoVarZza = zzgVar.zza((zzao) list.get(1));
/* 45 */                if (zzaoVarZza instanceof zzag) {
/* 50 */                    C1951n4.m6859j("Failed to parse initial value");
/* 24 */                    return null;
                        }
                    } else {
/* 58 */                if (zzaeVar.zzh() == 0) {
/* 149 */                   f42.m3656l("Empty array with no initial value error");
/* 24 */                    return null;
                        }
/* 60 */                zzaoVarZza = null;
                    }
/* 61 */            zzai zzaiVar = (zzai) zzaoVarZza2;
/* 63 */            int iZzh = zzaeVar.zzh();
/* 71 */            int i = z ? 0 : iZzh - 1;
/* 78 */            int i2 = z ? iZzh - 1 : 0;
/* 79 */            int i3 = true == z ? 1 : -1;
/* 83 */            if (zzaoVarZza == null) {
/* 85 */                zzaoVarZza = zzaeVar.zzl(i);
/* 89 */                i += i3;
                    }
/* 93 */            while ((i2 - i) * i3 >= 0) {
/* 99 */                if (zzaeVar.zzo(i)) {
/* 131 */                   zzaoVarZza = zzaiVar.zza(zzgVar, Arrays.asList(zzaoVarZza, zzaeVar.zzl(i), new zzah(Double.valueOf(i)), zzaeVar));
/* 137 */                   if (zzaoVarZza instanceof zzag) {
/* 142 */                       f42.m3656l("Reduce operation failed");
/* 24 */                        return null;
                            }
/* 89 */                    i += i3;
                        } else {
/* 89 */                    i += i3;
                        }
                    }
/* 146 */           return zzaoVarZza;
                }

                private static zzae zzc(zzae zzaeVar, zzg zzgVar, zzai zzaiVar, Boolean bool, Boolean bool2) {
/* 3 */             zzae zzaeVar2 = new zzae();
/* 6 */             Iterator itZzg = zzaeVar.zzg();
/* 14 */            while (itZzg.hasNext()) {
/* 22 */                int iIntValue = ((Integer) itZzg.next()).intValue();
/* 30 */                if (zzaeVar.zzo(iIntValue)) {
/* 62 */                    zzao zzaoVarZza = zzaiVar.zza(zzgVar, Arrays.asList(zzaeVar.zzl(iIntValue), new zzah(Double.valueOf(iIntValue)), zzaeVar));
/* 74 */                    if (zzaoVarZza.zze().equals(bool)) {
                                break;
                            }
/* 77 */                    if (bool2 == null || zzaoVarZza.zze().equals(bool2)) {
/* 89 */                        zzaeVar2.zzn(iIntValue, zzaoVarZza);
                            }
                        }
                    }
/* 93 */            return zzaeVar2;
                }
            }
