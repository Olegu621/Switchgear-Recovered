            package com.google.android.gms.internal.measurement;

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
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zznn {
                private static final char[] zza;

                static {
/* 3 */             char[] cArr = new char[80];
/* 5 */             zza = cArr;
/* 9 */             Arrays.fill(cArr, ' ');
                }

                public static String zza(zznl zznlVar, String str) {
/* 3 */             StringBuilder sbM3794t = fm0.m3794t("# ", str);
/* 8 */             zzc(zznlVar, sbM3794t, 0);
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
/* 61 */            zzd(i, sb);
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
/* 139 */               zzlg zzlgVar = zzlg.zzb;
/* 156 */               sb.append(zzof.zza(new zzlf(((String) obj).getBytes(zzmo.zza))));
/* 159 */               sb.append('\"');
/* 162 */               return;
                    }
/* 165 */           if (obj instanceof zzlg) {
/* 167 */               sb.append(": \"");
/* 176 */               sb.append(zzof.zza((zzlg) obj));
/* 179 */               sb.append('\"');
/* 182 */               return;
                    }
/* 191 */           if (obj instanceof zzme) {
/* 195 */               sb.append(" {");
/* 200 */               zzc((zzme) obj, sb, i + 2);
/* 203 */               sb.append("\n");
/* 206 */               zzd(i, sb);
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
/* 245 */           zzd(i, sb);
/* 248 */           sb.append("}");
                }

                /* JADX WARN: Code duplicated, block: B:102:0x01f6  */
                private static void zzc(zznl zznlVar, StringBuilder sb, int i) {
                    int i2;
                    boolean zEquals;
                    Method method;
                    Method method2;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            HashMap map = new HashMap();
/* 19 */            TreeMap treeMap = new TreeMap();
/* 26 */            Method[] declaredMethods = zznlVar.getClass().getDeclaredMethods();
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
/* 226 */                   zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zzme.zzcr(method2, zznlVar, new Object[0]));
                        } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
/* 299 */                   zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zzme.zzcr(method, zznlVar, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 345 */                   Method method4 = (Method) entry.getValue();
/* 355 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 357 */                   if (method4 != null) {
/* 361 */                       Object objZzcr = zzme.zzcr(method4, zznlVar, new Object[0]);
/* 365 */                       if (method5 == null) {
/* 369 */                           if (objZzcr instanceof Boolean) {
/* 378 */                               if (((Boolean) objZzcr).booleanValue()) {
/* 503 */                                   zzb(sb, i, strSubstring, objZzcr);
                                        }
                                    } else if (objZzcr instanceof Integer) {
/* 393 */                               if (((Integer) objZzcr).intValue() != 0) {
/* 503 */                                   zzb(sb, i, strSubstring, objZzcr);
                                        }
                                    } else if (objZzcr instanceof Float) {
/* 412 */                               if (Float.floatToRawIntBits(((Float) objZzcr).floatValue()) != 0) {
/* 503 */                                   zzb(sb, i, strSubstring, objZzcr);
                                        }
                                    } else if (!(objZzcr instanceof Double)) {
/* 439 */                               if (objZzcr instanceof String) {
/* 443 */                                   zEquals = objZzcr.equals(HttpUrl.FRAGMENT_ENCODE_SET);
                                        } else if (objZzcr instanceof zzlg) {
/* 454 */                                   zEquals = objZzcr.equals(zzlg.zzb);
                                        } else if (objZzcr instanceof zznl) {
/* 472 */                                   if (objZzcr != ((zznl) objZzcr).zzcE()) {
/* 503 */                                       zzb(sb, i, strSubstring, objZzcr);
                                            }
                                        } else if (!(objZzcr instanceof Enum) || ((Enum) objZzcr).ordinal() != 0) {
/* 503 */                                   zzb(sb, i, strSubstring, objZzcr);
                                        }
/* 458 */                               if (!zEquals) {
/* 503 */                                   zzb(sb, i, strSubstring, objZzcr);
                                        }
                                    } else if (Double.doubleToRawLongBits(((Double) objZzcr).doubleValue()) != 0) {
/* 503 */                               zzb(sb, i, strSubstring, objZzcr);
                                    }
                                } else if (((Boolean) zzme.zzcr(method5, zznlVar, new Object[0])).booleanValue()) {
/* 503 */                           zzb(sb, i, strSubstring, objZzcr);
                                }
                            }
                        }
/* 229 */               i2 = 3;
                    }
/* 510 */           if (zznlVar instanceof zzmb) {
/* 517 */               Iterator itZzc = ((zzmb) zznlVar).zzb.zzc();
/* 525 */               if (itZzc.hasNext()) {
/* 541 */                   throw null;
                        }
                    }
/* 544 */           zzoi zzoiVar = ((zzme) zznlVar).zzc;
/* 546 */           if (zzoiVar != null) {
/* 548 */               zzoiVar.zzj(sb, i);
                    }
                }

                private static void zzd(int i, StringBuilder sb) {
/* 1 */             while (i > 0) {
/* 3 */                 int i2 = 80;
/* 5 */                 if (i <= 80) {
/* 8 */                     i2 = i;
                        }
/* 12 */                sb.append(zza, 0, i2);
/* 15 */                i -= i2;
                    }
                }
            }
