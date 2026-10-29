            package com.google.android.gms.internal.measurement;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzas implements Iterable, zzao {
                private final String zza;

                public zzas(String str) {
/* 4 */             if (str != null) {
/* 6 */                 this.zza = str;
                    } else {
/* 11 */                C1951n4.m6859j("StringValue cannot be null.");
/* 15 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof zzas) {
/* 17 */                return this.zza.equals(((zzas) obj).zza);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 3 */             return new zzar(this);
                }

                public final String toString() {
/* 3 */             String str = this.zza;
/* 16 */            return fm0.m3790p(new StringBuilder(str.length() + 2), "\"", str, "\"");
                }

                public final /* synthetic */ String zzb() {
/* 1 */             return this.zza;
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final String zzc() {
/* 1 */             return this.zza;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:104:0x02c1 A[PHI: r11
  0x02c1: PHI (r11v6 boolean) = (r11v12 boolean), (r11v13 boolean), (r11v16 boolean) binds: [B:100:0x02ad, B:101:0x02af, B:103:0x02bf] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzcA(String str, zzg zzgVar, List list) {
                    String str2;
                    int i;
                    zzas zzasVar;
                    int i2;
                    int i3;
                    boolean zIsEmpty;
                    zzg zzgVar2;
/* 49 */            if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || FirebaseAnalytics.Event.SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
/* 9 */                 str2 = "trim";
                    } else {
/* 9 */                 str2 = "trim";
/* 149 */               if (!str2.equals(str)) {
/* 158 */                   C1951n4.m6859j(fm0.m3783i(str, " is not a String function"));
/* 27 */                    return null;
                        }
                    }
/* 170 */           String strZzc = "undefined";
/* 179 */           z = false;
/* 179 */           boolean z = false;
                    switch (str.hashCode()) {
                        case -1789698943:
/* 1443 */                  if (str.equals("hasOwnProperty")) {
/* 1446 */                      zzh.zza("hasOwnProperty", 1, list);
/* 1449 */                      String str3 = this.zza;
/* 1457 */                      zzao zzaoVarZza = zzgVar.zza((zzao) list.get(0));
/* 1471 */                      if ("length".equals(zzaoVarZza.zzc())) {
/* 1473 */                          return zzao.zzk;
                                }
/* 1480 */                      double dDoubleValue = zzaoVarZza.zzd().doubleValue();
                                return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? zzao.zzl : zzao.zzk;
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case -1776922004:
/* 1425 */                  if (str.equals("toString")) {
/* 1427 */                      zzh.zza("toString", 0, list);
/* 1415 */                      return this;
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case -1464939364:
/* 1398 */                  if (str.equals("toLocaleLowerCase")) {
/* 1400 */                      zzh.zza("toLocaleLowerCase", 0, list);
/* 1411 */                      return new zzas(this.zza.toLowerCase());
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case -1361633751:
/* 1325 */                  if (str.equals("charAt")) {
/* 1328 */                      zzh.zzc("charAt", 1, list);
/* 1359 */                      int iZzi = list.isEmpty() ? 0 : (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
/* 1360 */                      String str4 = this.zza;
                                return (iZzi < 0 || iZzi >= str4.length()) ? zzao.zzm : new zzas(String.valueOf(str4.charAt(iZzi)));
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case -1354795244:
/* 1251 */                  zzasVar = this;
/* 1261 */                  if (str.equals("concat")) {
/* 1267 */                      if (!list.isEmpty()) {
/* 1273 */                          StringBuilder sb = new StringBuilder(zzasVar.zza);
/* 1280 */                          for (int i4 = 0; i4 < list.size(); i4++) {
/* 1296 */                              sb.append(zzgVar.zza((zzao) list.get(i4)).zzc());
                                    }
/* 1308 */                          return new zzas(sb.toString());
                                }
/* 1312 */                      return zzasVar;
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case -1137582698:
/* 1232 */                  if (str.equals("toLowerCase")) {
/* 1234 */                      zzh.zza("toLowerCase", 0, list);
/* 1247 */                      return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case -906336856:
/* 1155 */                  if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
/* 1158 */                      zzh.zzc(FirebaseAnalytics.Event.SEARCH, 1, list);
/* 1187 */                      Matcher matcher = Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza);
                                return matcher.find() ? new zzah(Double.valueOf(matcher.start())) : new zzah(Double.valueOf(-1.0d));
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case -726908483:
/* 1128 */                  if (str.equals("toLocaleUpperCase")) {
/* 1130 */                      zzh.zza("toLocaleUpperCase", 0, list);
/* 1141 */                      return new zzas(this.zza.toUpperCase());
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case -467511597:
/* 1032 */                  if (str.equals("lastIndexOf")) {
/* 1034 */                      zzh.zzc("lastIndexOf", 2, list);
/* 1037 */                      String str5 = this.zza;
/* 1058 */                      String strZzc2 = list.size() > 0 ? zzgVar.zza((zzao) list.get(0)).zzc() : "undefined";
/* 1087 */                      double dDoubleValue2 = list.size() < 2 ? Double.NaN : zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
/* 1116 */                      return new zzah(Double.valueOf(str5.lastIndexOf(strZzc2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : zzh.zzi(dDoubleValue2)))));
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case -399551817:
/* 1003 */                  if (str.equals("toUpperCase")) {
/* 1005 */                      zzh.zza("toUpperCase", 0, list);
/* 1018 */                      return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case 3568674:
/* 978 */                   if (str.equals(str2)) {
/* 980 */                       zzh.zza("toUpperCase", 0, list);
/* 991 */                       return new zzas(this.zza.trim());
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case 103668165:
/* 898 */                   if (str.equals("match")) {
/* 901 */                       zzh.zzc("match", 1, list);
/* 933 */                       Matcher matcher2 = Pattern.compile(list.size() <= 0 ? HttpUrl.FRAGMENT_ENCODE_SET : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(this.zza);
                                return matcher2.find() ? new zzae(Arrays.asList(new zzas(matcher2.group()))) : zzao.zzg;
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case 109526418:
/* 745 */                   if (str.equals("slice")) {
/* 747 */                       zzh.zzc("slice", 2, list);
/* 750 */                       String str6 = this.zza;
/* 779 */                       double dZzi = zzh.zzi(!list.isEmpty() ? zzgVar.zza((zzao) list.get(0)).zzd().doubleValue() : 0.0d);
/* 805 */                       double dMax = dZzi < 0.0d ? Math.max(((double) str6.length()) + dZzi, 0.0d) : Math.min(dZzi, str6.length());
/* 840 */                       double dZzi2 = zzh.zzi(list.size() > 1 ? zzgVar.zza((zzao) list.get(1)).zzd().doubleValue() : str6.length());
/* 870 */                       int i5 = (int) dMax;
/* 884 */                       return new zzas(str6.substring(i5, Math.max(0, ((int) (dZzi2 < 0.0d ? Math.max(((double) str6.length()) + dZzi2, 0.0d) : Math.min(dZzi2, str6.length()))) - i5) + i5));
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case 109648666:
/* 565 */                   if (str.equals("split")) {
/* 567 */                       zzh.zzc("split", 2, list);
/* 570 */                       String str7 = this.zza;
/* 576 */                       if (str7.length() == 0) {
/* 589 */                           return new zzae(Arrays.asList(this));
                                }
/* 595 */                       ArrayList arrayList = new ArrayList();
/* 602 */                       if (list.isEmpty()) {
/* 604 */                           arrayList.add(this);
                                } else {
/* 619 */                           String strZzc3 = zzgVar.zza((zzao) list.get(0)).zzc();
/* 653 */                           long jZzh = list.size() > 1 ? zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) : 2147483647L;
/* 660 */                           if (jZzh == 0) {
/* 664 */                               return new zzae();
                                    }
/* 677 */                           String[] strArrSplit = str7.split(Pattern.quote(strZzc3), ((int) jZzh) + 1);
/* 681 */                           int length = strArrSplit.length;
/* 686 */                           if (!strZzc3.isEmpty() || length <= 0) {
                                        i3 = zIsEmpty;
                                        z = zIsEmpty;
/* 706 */                               i2 = length;
                                        i3 = z;
                                    } else {
/* 692 */                               zIsEmpty = strArrSplit[0].isEmpty();
/* 696 */                               i2 = length - 1;
/* 704 */                               if (!strArrSplit[i2].isEmpty()) {
                                            i3 = zIsEmpty;
                                            z = zIsEmpty;
/* 706 */                                   i2 = length;
                                            i3 = z;
                                        }
                                    }
                                    i3 = zIsEmpty;
                                    z = zIsEmpty;
/* 710 */                           if (length > jZzh) {
/* 712 */                               i2--;
                                    }
/* 714 */                           while (i3 < i2) {
/* 723 */                               arrayList.add(new zzas(strArrSplit[i3]));
/* 726 */                               i3++;
                                    }
                                }
/* 731 */                       return new zzae(arrayList);
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case 530542161:
/* 440 */                   if (str.equals("substring")) {
/* 442 */                       zzh.zzc("substring", 2, list);
/* 445 */                       String str8 = this.zza;
/* 477 */                       int iZzi2 = !list.isEmpty() ? (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) : 0;
/* 509 */                       int iZzi3 = list.size() > 1 ? (int) zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) : str8.length();
/* 521 */                       int iMin = Math.min(Math.max(iZzi2, 0), str8.length());
/* 533 */                       int iMin2 = Math.min(Math.max(iZzi3, 0), str8.length());
/* 551 */                       return new zzas(str8.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case 1094496948:
/* 276 */                   zzasVar = this;
/* 286 */                   if (str.equals("replace")) {
/* 288 */                       zzh.zzc("replace", 2, list);
/* 291 */                       zzao zzaoVarZza2 = zzao.zzf;
/* 297 */                       if (!list.isEmpty()) {
/* 309 */                           strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
/* 318 */                           if (list.size() > 1) {
/* 326 */                               zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
                                    }
                                }
/* 330 */                       String str9 = strZzc;
/* 332 */                       String str10 = zzasVar.zza;
/* 334 */                       int iIndexOf = str10.indexOf(str9);
/* 338 */                       if (iIndexOf >= 0) {
/* 342 */                           if (zzaoVarZza2 instanceof zzai) {
/* 376 */                               zzaoVarZza2 = ((zzai) zzaoVarZza2).zza(zzgVar, Arrays.asList(new zzas(str9), new zzah(Double.valueOf(iIndexOf)), zzasVar));
                                    }
/* 382 */                           String strSubstring = str10.substring(0, iIndexOf);
/* 386 */                           String strZzc4 = zzaoVarZza2.zzc();
/* 395 */                           String strSubstring2 = str10.substring(str9.length() + iIndexOf);
/* 426 */                           return new zzas(fm0.m3790p(new StringBuilder(strSubstring.length() + String.valueOf(strZzc4).length() + strSubstring2.length()), strSubstring, strZzc4, strSubstring2));
                                }
/* 1312 */                      return zzasVar;
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        case 1943291465:
/* 189 */                   if (str.equals("indexOf")) {
/* 193 */                       zzh.zzc("indexOf", 2, list);
/* 198 */                       String str11 = this.zza;
/* 204 */                       if (list.size() <= 0) {
/* 206 */                           zzgVar2 = zzgVar;
                                } else {
/* 217 */                           zzgVar2 = zzgVar;
/* 223 */                           strZzc = zzgVar2.zza((zzao) list.get(0)).zzc();
                                }
/* 272 */                       return new zzah(Double.valueOf(str11.indexOf(strZzc, (int) zzh.zzi(list.size() < 2 ? 0.0d : zzgVar2.zza((zzao) list.get(1)).zzd().doubleValue()))));
                            }
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                        default:
/* 1509 */                  C1951n4.m6859j("Command not supported");
/* 27 */                    return null;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Double zzd() {
/* 1 */             String str = this.zza;
/* 7 */             if (str.isEmpty()) {
/* 23 */                return Double.valueOf(0.0d);
                    }
                    try {
/* 9 */                 return Double.valueOf(str);
                    } catch (NumberFormatException unused) {
/* 16 */                return Double.valueOf(Double.NaN);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Boolean zze() {
/* 9 */             return Boolean.valueOf(!this.zza.isEmpty());
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final Iterator zzf() {
/* 3 */             return new zzaq(this);
                }

                @Override // com.google.android.gms.internal.measurement.zzao
                public final zzao zzt() {
/* 5 */             return new zzas(this.zza);
                }
            }
