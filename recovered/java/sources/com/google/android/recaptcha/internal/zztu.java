            package com.google.android.recaptcha.internal;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.TreeMap;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zztu {
                private static final char[] zza;

                static {
/* 3 */             char[] cArr = new char[80];
/* 5 */             zza = cArr;
/* 9 */             Arrays.fill(cArr, ' ');
                }

                public static String zza(zzts zztsVar, String str) {
/* 3 */             StringBuilder sbM3794t = fm0.m3794t("# ", str);
/* 8 */             zzd(zztsVar, sbM3794t, 0);
/* 11 */            return sbM3794t.toString();
                }

                public static void zzb(StringBuilder sb, int i, String str, Object obj) {
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
/* 61 */            zzc(i, sb);
/* 68 */            if (!str.isEmpty()) {
/* 72 */                StringBuilder sb2 = new StringBuilder();
/* 84 */                sb2.append(Character.toLowerCase(str.charAt(0)));
/* 92 */                for (int i2 = 1; i2 < str.length(); i2++) {
/* 94 */                    char cCharAt = str.charAt(i2);
/* 102 */                   if (Character.isUpperCase(cCharAt)) {
/* 106 */                       sb2.append("_");
                            }
/* 113 */                   sb2.append(Character.toLowerCase(cCharAt));
                        }
/* 119 */               str = sb2.toString();
                    }
/* 123 */           sb.append(str);
/* 132 */           if (obj instanceof String) {
/* 134 */               sb.append(": \"");
/* 139 */               zzqm zzqmVar = zzqm.zzb;
/* 156 */               sb.append(zzuq.zza(new zzqk(((String) obj).getBytes(zzsv.zza))));
/* 159 */               sb.append('\"');
/* 162 */               return;
                    }
/* 165 */           if (obj instanceof zzqm) {
/* 167 */               sb.append(": \"");
/* 176 */               sb.append(zzuq.zza((zzqm) obj));
/* 179 */               sb.append('\"');
/* 182 */               return;
                    }
/* 191 */           if (obj instanceof zzsn) {
/* 195 */               sb.append(" {");
/* 200 */               zzd((zzsn) obj, sb, i + 2);
/* 203 */               sb.append("\n");
/* 206 */               zzc(i, sb);
/* 209 */               sb.append("}");
/* 212 */               return;
                    }
/* 215 */           if (!(obj instanceof Map.Entry)) {
/* 254 */               sb.append(": ");
/* 257 */               sb.append(obj);
/* 260 */               return;
                    }
/* 217 */           int i3 = i + 2;
/* 219 */           sb.append(" {");
/* 222 */           Map.Entry entry = (Map.Entry) obj;
/* 230 */           zzb(sb, i3, "key", entry.getKey());
/* 239 */           zzb(sb, i3, FirebaseAnalytics.Param.VALUE, entry.getValue());
/* 242 */           sb.append("\n");
/* 245 */           zzc(i, sb);
/* 248 */           sb.append("}");
                }

                private static void zzc(int i, StringBuilder sb) {
/* 1 */             while (i > 0) {
/* 3 */                 int i2 = 80;
/* 5 */                 if (i <= 80) {
/* 8 */                     i2 = i;
                        }
/* 12 */                sb.append(zza, 0, i2);
/* 15 */                i -= i2;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:102:0x01f6  */
                private static void zzd(zzts zztsVar, StringBuilder sb, int i) {
                    int i2;
                    boolean zEquals;
                    Method method;
                    Method method2;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            HashMap map = new HashMap();
/* 19 */            TreeMap treeMap = new TreeMap();
/* 26 */            Method[] declaredMethods = zztsVar.getClass().getDeclaredMethods();
/* 30 */            int length = declaredMethods.length;
/* 32 */            int i3 = 0;
                    while (true) {
/* 39 */                i2 = 3;
/* 40 */                if (i3 >= length) {
                            break;
                        }
/* 42 */                Method method3 = declaredMethods[i3];
/* 52 */                if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
/* 73 */                    if (method3.getName().startsWith("set")) {
/* 79 */                        hashSet.add(method3.getName());
                            } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
/* 108 */                       if (method3.getName().startsWith("has")) {
/* 114 */                           map.put(method3.getName(), method3);
                                } else if (method3.getName().startsWith("get")) {
/* 132 */                           treeMap.put(method3.getName(), method3);
                                }
                            }
                        }
/* 135 */               i3++;
                    }
/* 150 */           for (Map.Entry entry : treeMap.entrySet()) {
/* 164 */               String strSubstring = ((String) entry.getKey()).substring(i2);
/* 174 */               if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
/* 226 */                   zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zzsn.zzE(method2, zztsVar, new Object[0]));
                        } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
/* 299 */                   zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zzsn.zzE(method, zztsVar, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 345 */                   Method method4 = (Method) entry.getValue();
/* 355 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 357 */                   if (method4 != null) {
/* 361 */                       Object objZzE = zzsn.zzE(method4, zztsVar, new Object[0]);
/* 365 */                       if (method5 == null) {
/* 369 */                           if (objZzE instanceof Boolean) {
/* 378 */                               if (((Boolean) objZzE).booleanValue()) {
/* 503 */                                   zzb(sb, i, strSubstring, objZzE);
                                        }
                                    } else if (objZzE instanceof Integer) {
/* 393 */                               if (((Integer) objZzE).intValue() != 0) {
/* 503 */                                   zzb(sb, i, strSubstring, objZzE);
                                        }
                                    } else if (objZzE instanceof Float) {
/* 412 */                               if (Float.floatToRawIntBits(((Float) objZzE).floatValue()) != 0) {
/* 503 */                                   zzb(sb, i, strSubstring, objZzE);
                                        }
                                    } else if (!(objZzE instanceof Double)) {
/* 439 */                               if (objZzE instanceof String) {
/* 443 */                                   zEquals = objZzE.equals(HttpUrl.FRAGMENT_ENCODE_SET);
                                        } else if (objZzE instanceof zzqm) {
/* 454 */                                   zEquals = objZzE.equals(zzqm.zzb);
                                        } else if (objZzE instanceof zzts) {
/* 472 */                                   if (objZzE != ((zzts) objZzE).zzm()) {
/* 503 */                                       zzb(sb, i, strSubstring, objZzE);
                                            }
                                        } else if (!(objZzE instanceof Enum) || ((Enum) objZzE).ordinal() != 0) {
/* 503 */                                   zzb(sb, i, strSubstring, objZzE);
                                        }
/* 458 */                               if (!zEquals) {
/* 503 */                                   zzb(sb, i, strSubstring, objZzE);
                                        }
                                    } else if (Double.doubleToRawLongBits(((Double) objZzE).doubleValue()) != 0) {
/* 503 */                               zzb(sb, i, strSubstring, objZzE);
                                    }
                                } else if (((Boolean) zzsn.zzE(method5, zztsVar, new Object[0])).booleanValue()) {
/* 503 */                           zzb(sb, i, strSubstring, objZzE);
                                }
                            }
                        }
/* 229 */               i2 = 3;
                    }
/* 510 */           if (zztsVar instanceof zzsk) {
/* 517 */               Iterator itZzf = ((zzsk) zztsVar).zzb.zzf();
/* 525 */               while (itZzf.hasNext()) {
/* 531 */                   Map.Entry entry2 = (Map.Entry) itZzf.next();
/* 553 */                   zzb(sb, i, AbstractC0886en.m3505i(((zzsl) entry2.getKey()).zza, "[", "]"), entry2.getValue());
                        }
                    }
/* 559 */           zzuw zzuwVar = ((zzsn) zztsVar).zzc;
/* 561 */           if (zzuwVar != null) {
/* 563 */               zzuwVar.zzi(sb, i);
                    }
                }
            }
