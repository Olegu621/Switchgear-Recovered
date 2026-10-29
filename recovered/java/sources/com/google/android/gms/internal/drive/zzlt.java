            package com.google.android.gms.internal.drive;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.TreeSet;
            import okhttp3.HttpUrl;
            import p000.fm0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 645 */   final class zzlt {
                /* JADX WARN: Code duplicated, block: B:80:0x01d7  */
                /* JADX WARN: Code duplicated, block: B:81:0x01da  */
                private static void zza(zzlq zzlqVar, StringBuilder sb, int i) {
                    boolean zEquals;
/* 9 */             HashMap map = new HashMap();
/* 14 */            HashMap map2 = new HashMap();
/* 19 */            TreeSet<String> treeSet = new TreeSet();
/* 35 */            for (Method method : zzlqVar.getClass().getDeclaredMethods()) {
/* 43 */                map2.put(method.getName(), method);
/* 51 */                if (method.getParameterTypes().length == 0) {
/* 57 */                    map.put(method.getName(), method);
/* 68 */                    if (method.getName().startsWith("get")) {
/* 74 */                        treeSet.add(method.getName());
                            }
                        }
                    }
/* 88 */            for (String str : treeSet) {
/* 98 */                String strReplaceFirst = str.replaceFirst("get", HttpUrl.FRAGMENT_ENCODE_SET);
/* 108 */               boolean zBooleanValue = true;
/* 109 */               if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
/* 133 */                   String strValueOf = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
/* 143 */                   String strSubstring = strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
/* 160 */                   String strConcat = strSubstring.length() != 0 ? strValueOf.concat(strSubstring) : new String(strValueOf);
/* 168 */                   Method method2 = (Method) map.get(str);
/* 170 */                   if (method2 != null && method2.getReturnType().equals(List.class)) {
/* 194 */                       zza(sb, i, zzo(strConcat), zzkk.zza(method2, zzlqVar, new Object[0]));
                            }
                        }
/* 204 */               if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
/* 220 */                   String strValueOf2 = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
/* 230 */                   String strSubstring2 = strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
/* 247 */                   String strConcat2 = strSubstring2.length() != 0 ? strValueOf2.concat(strSubstring2) : new String(strValueOf2);
/* 255 */                   Method method3 = (Method) map.get(str);
/* 257 */                   if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
/* 299 */                       zza(sb, i, zzo(strConcat2), zzkk.zza(method3, zzlqVar, new Object[0]));
                            }
                        }
/* 328 */               if (((Method) map2.get(strReplaceFirst.length() != 0 ? "set".concat(strReplaceFirst) : new String("set"))) != null) {
/* 336 */                   if (strReplaceFirst.endsWith("Bytes")) {
/* 344 */                       String strSubstring3 = strReplaceFirst.substring(0, strReplaceFirst.length() - 5);
/* 368 */                       if (!map.containsKey(strSubstring3.length() != 0 ? "get".concat(strSubstring3) : new String("get"))) {
                                }
                            }
/* 378 */                   String strValueOf3 = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
/* 382 */                   String strSubstring4 = strReplaceFirst.substring(1);
/* 399 */                   String strConcat3 = strSubstring4.length() != 0 ? strValueOf3.concat(strSubstring4) : new String(strValueOf3);
/* 423 */                   Method method4 = (Method) map.get(strReplaceFirst.length() != 0 ? "get".concat(strReplaceFirst) : new String("get"));
/* 447 */                   Method method5 = (Method) map.get(strReplaceFirst.length() != 0 ? "has".concat(strReplaceFirst) : new String("has"));
/* 449 */                   if (method4 != null) {
/* 453 */                       Object objZza = zzkk.zza(method4, zzlqVar, new Object[0]);
/* 457 */                       if (method5 == null) {
/* 461 */                           if (objZza instanceof Boolean) {
/* 470 */                               if (((Boolean) objZza).booleanValue()) {
/* 475 */                                   zEquals = false;
                                        } else {
/* 472 */                                   zEquals = true;
                                        }
                                    } else if (objZza instanceof Integer) {
/* 488 */                               if (((Integer) objZza).intValue() == 0) {
/* 472 */                                   zEquals = true;
                                        } else {
/* 475 */                                   zEquals = false;
                                        }
                                    } else if (objZza instanceof Float) {
/* 505 */                               if (((Float) objZza).floatValue() == 0.0f) {
/* 472 */                                   zEquals = true;
                                        } else {
/* 475 */                                   zEquals = false;
                                        }
                                    } else if (objZza instanceof Double) {
/* 523 */                               if (((Double) objZza).doubleValue() == 0.0d) {
/* 472 */                                   zEquals = true;
                                        } else {
/* 475 */                                   zEquals = false;
                                        }
                                    } else if (objZza instanceof String) {
/* 530 */                               zEquals = objZza.equals(HttpUrl.FRAGMENT_ENCODE_SET);
                                    } else if (objZza instanceof zzjc) {
/* 541 */                               zEquals = objZza.equals(zzjc.zznq);
                                    } else if (!(objZza instanceof zzlq) ? !((objZza instanceof Enum) && ((Enum) objZza).ordinal() == 0) : objZza != ((zzlq) objZza).zzda()) {
/* 475 */                               zEquals = false;
                                    } else {
/* 472 */                               zEquals = true;
                                    }
/* 574 */                           if (zEquals) {
/* 577 */                               zBooleanValue = false;
                                    }
                                } else {
/* 587 */                           zBooleanValue = ((Boolean) zzkk.zza(method5, zzlqVar, new Object[0])).booleanValue();
                                }
/* 591 */                       if (zBooleanValue) {
/* 597 */                           zza(sb, i, zzo(strConcat3), objZza);
                                }
                            }
                        }
                    }
/* 604 */           if (zzlqVar instanceof zzkk.zzc) {
/* 611 */               Iterator<Map.Entry<FieldDescriptorType, Object>> it = ((zzkk.zzc) zzlqVar).zzrw.iterator();
/* 619 */               if (it.hasNext()) {
/* 628 */                   ((Map.Entry) it.next()).getKey();
/* 636 */                   throw new NoSuchMethodError();
                        }
                    }
/* 639 */           zzmy zzmyVar = ((zzkk) zzlqVar).zzrq;
/* 641 */           if (zzmyVar != null) {
/* 643 */               zzmyVar.zza(sb, i);
                    }
                }

                private static final String zzo(String str) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 11 */            for (int i = 0; i < str.length(); i++) {
/* 13 */                char cCharAt = str.charAt(i);
/* 21 */                if (Character.isUpperCase(cCharAt)) {
/* 25 */                    sb.append("_");
                        }
/* 32 */                sb.append(Character.toLowerCase(cCharAt));
                    }
/* 38 */            return sb.toString();
                }

/* 646 */       public static String zza(zzlq zzlqVar, String str) {
/* 648 */           StringBuilder sbM3794t = fm0.m3794t("# ", str);
/* 649 */           zza(zzlqVar, sbM3794t, 0);
/* 650 */           return sbM3794t.toString();
                }

/* 650 */       public static final void zza(StringBuilder sb, int i, String str, Object obj) {
/* 651 */           if (obj instanceof List) {
/* 653 */               Iterator it = ((List) obj).iterator();
                        while (it.hasNext()) {
/* 654 */                   zza(sb, i, str, it.next());
                        }
                        return;
                    }
/* 655 */           if (obj instanceof Map) {
/* 657 */               Iterator it2 = ((Map) obj).entrySet().iterator();
                        while (it2.hasNext()) {
/* 658 */                   zza(sb, i, str, (Map.Entry) it2.next());
                        }
                        return;
                    }
/* 659 */           sb.append('\n');
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
/* 660 */               sb.append(' ');
                    }
/* 661 */           sb.append(str);
/* 662 */           if (obj instanceof String) {
/* 663 */               sb.append(": \"");
/* 665 */               sb.append(zzmt.zzc(zzjc.zzk((String) obj)));
                        sb.append('\"');
                        return;
                    }
/* 666 */           if (obj instanceof zzjc) {
/* 667 */               sb.append(": \"");
                        sb.append(zzmt.zzc((zzjc) obj));
                        sb.append('\"');
                        return;
                    }
/* 668 */           if (obj instanceof zzkk) {
/* 669 */               sb.append(" {");
/* 670 */               zza((zzkk) obj, sb, i + 2);
/* 671 */               sb.append("\n");
                        while (i2 < i) {
/* 672 */                   sb.append(' ');
                            i2++;
                        }
/* 673 */               sb.append("}");
                        return;
                    }
/* 674 */           if (obj instanceof Map.Entry) {
/* 675 */               sb.append(" {");
/* 676 */               Map.Entry entry = (Map.Entry) obj;
                        int i4 = i + 2;
/* 677 */               zza(sb, i4, "key", entry.getKey());
/* 678 */               zza(sb, i4, FirebaseAnalytics.Param.VALUE, entry.getValue());
/* 679 */               sb.append("\n");
                        while (i2 < i) {
/* 680 */                   sb.append(' ');
                            i2++;
                        }
/* 681 */               sb.append("}");
                        return;
                    }
/* 682 */           sb.append(": ");
                    sb.append(obj.toString());
                }
            }
