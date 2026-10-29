            package com.google.android.gms.internal.auth;

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
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfy {
                public static String zza(zzfw zzfwVar, String str) {
/* 3 */             StringBuilder sbM3794t = fm0.m3794t("# ", str);
/* 8 */             zzd(zzfwVar, sbM3794t, 0);
/* 11 */            return sbM3794t.toString();
                }

                public static final void zzb(StringBuilder sb, int i, String str, Object obj) {
/* 3 */             if (obj instanceof List) {
/* 7 */                 Iterator it = ((List) obj).iterator();
/* 15 */                while (it.hasNext()) {
/* 21 */                    zzb(sb, i, str, it.next());
                        }
/* 55 */                return;
                    }
/* 27 */            if (obj instanceof Map) {
/* 35 */                Iterator it2 = ((Map) obj).entrySet().iterator();
/* 43 */                while (it2.hasNext()) {
/* 51 */                    zzb(sb, i, str, (Map.Entry) it2.next());
                        }
/* 55 */                return;
                    }
/* 58 */            sb.append('\n');
/* 61 */            int i2 = 0;
/* 65 */            for (int i3 = 0; i3 < i; i3++) {
/* 67 */                sb.append(' ');
                    }
/* 73 */            sb.append(str);
/* 82 */            if (obj instanceof String) {
/* 84 */                sb.append(": \"");
/* 97 */                sb.append(zzgw.zza(zzee.zzl((String) obj)));
/* 100 */               sb.append('\"');
/* 103 */               return;
                    }
/* 106 */           if (obj instanceof zzee) {
/* 108 */               sb.append(": \"");
/* 117 */               sb.append(zzgw.zza((zzee) obj));
/* 120 */               sb.append('\"');
/* 123 */               return;
                    }
/* 132 */           if (obj instanceof zzeu) {
/* 134 */               sb.append(" {");
/* 141 */               zzd((zzeu) obj, sb, i + 2);
/* 144 */               sb.append("\n");
/* 147 */               while (i2 < i) {
/* 149 */                   sb.append(' ');
/* 152 */                   i2++;
                        }
/* 155 */               sb.append("}");
/* 158 */               return;
                    }
/* 161 */           if (!(obj instanceof Map.Entry)) {
/* 205 */               sb.append(": ");
/* 208 */               sb.append(obj);
/* 211 */               return;
                    }
/* 163 */           sb.append(" {");
/* 166 */           Map.Entry entry = (Map.Entry) obj;
/* 168 */           int i4 = i + 2;
/* 176 */           zzb(sb, i4, "key", entry.getKey());
/* 185 */           zzb(sb, i4, FirebaseAnalytics.Param.VALUE, entry.getValue());
/* 188 */           sb.append("\n");
/* 191 */           while (i2 < i) {
/* 193 */               sb.append(' ');
/* 196 */               i2++;
                    }
/* 199 */           sb.append("}");
                }

                private static final String zzc(String str) {
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

                private static void zzd(zzfw zzfwVar, StringBuilder sb, int i) {
                    boolean zEquals;
/* 3 */             HashMap map = new HashMap();
/* 8 */             HashMap map2 = new HashMap();
/* 13 */            TreeSet<String> treeSet = new TreeSet();
/* 29 */            for (Method method : zzfwVar.getClass().getDeclaredMethods()) {
/* 37 */                map2.put(method.getName(), method);
/* 45 */                if (method.getParameterTypes().length == 0) {
/* 51 */                    map.put(method.getName(), method);
/* 62 */                    if (method.getName().startsWith("get")) {
/* 68 */                        treeSet.add(method.getName());
                            }
                        }
                    }
/* 82 */            for (String str : treeSet) {
/* 102 */               String strSubstring = str.startsWith("get") ? str.substring(3) : str;
/* 110 */               if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
/* 148 */                   String strConcat = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(strSubstring.substring(1, strSubstring.length() - 4));
/* 156 */                   Method method2 = (Method) map.get(str);
/* 158 */                   if (method2 != null && method2.getReturnType().equals(List.class)) {
/* 182 */                       zzb(sb, i, zzc(strConcat), zzeu.zze(method2, zzfwVar, new Object[0]));
                            }
                        }
/* 192 */               if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
/* 222 */                   String strConcat2 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(strSubstring.substring(1, strSubstring.length() - 3));
/* 230 */                   Method method3 = (Method) map.get(str);
/* 232 */                   if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
/* 274 */                       zzb(sb, i, zzc(strConcat2), zzeu.zze(method3, zzfwVar, new Object[0]));
                            }
                        }
/* 291 */               if (((Method) map2.get("set".concat(strSubstring))) != null && (!strSubstring.endsWith("Bytes") || !map.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 337 */                   String strConcat3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(strSubstring.substring(1));
/* 349 */                   Method method4 = (Method) map.get("get".concat(strSubstring));
/* 361 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 363 */                   if (method4 != null) {
/* 367 */                       Object objZze = zzeu.zze(method4, zzfwVar, new Object[0]);
/* 371 */                       if (method5 == null) {
/* 375 */                           if (objZze instanceof Boolean) {
/* 384 */                               if (((Boolean) objZze).booleanValue()) {
/* 513 */                                   zzb(sb, i, zzc(strConcat3), objZze);
                                        }
                                    } else if (objZze instanceof Integer) {
/* 399 */                               if (((Integer) objZze).intValue() != 0) {
/* 513 */                                   zzb(sb, i, zzc(strConcat3), objZze);
                                        }
                                    } else if (objZze instanceof Float) {
/* 418 */                               if (Float.floatToRawIntBits(((Float) objZze).floatValue()) != 0) {
/* 513 */                                   zzb(sb, i, zzc(strConcat3), objZze);
                                        }
                                    } else if (!(objZze instanceof Double)) {
/* 445 */                               if (objZze instanceof String) {
/* 449 */                                   zEquals = objZze.equals(HttpUrl.FRAGMENT_ENCODE_SET);
                                        } else if (objZze instanceof zzee) {
/* 460 */                                   zEquals = objZze.equals(zzee.zzb);
                                        } else if (objZze instanceof zzfw) {
/* 478 */                                   if (objZze != ((zzfw) objZze).zzh()) {
/* 513 */                                       zzb(sb, i, zzc(strConcat3), objZze);
                                            }
                                        } else if (!(objZze instanceof Enum) || ((Enum) objZze).ordinal() != 0) {
/* 513 */                                   zzb(sb, i, zzc(strConcat3), objZze);
                                        }
/* 464 */                               if (!zEquals) {
/* 513 */                                   zzb(sb, i, zzc(strConcat3), objZze);
                                        }
                                    } else if (Double.doubleToRawLongBits(((Double) objZze).doubleValue()) != 0) {
/* 513 */                               zzb(sb, i, zzc(strConcat3), objZze);
                                    }
                                } else if (((Boolean) zzeu.zze(method5, zzfwVar, new Object[0])).booleanValue()) {
/* 513 */                           zzb(sb, i, zzc(strConcat3), objZze);
                                }
                            }
                        }
                    }
/* 520 */           if (zzfwVar instanceof zzet) {
/* 535 */               throw null;
                    }
/* 524 */           zzgz zzgzVar = ((zzeu) zzfwVar).zzc;
/* 526 */           if (zzgzVar != null) {
/* 528 */               zzgzVar.zze(sb, i);
                    }
                }
            }
