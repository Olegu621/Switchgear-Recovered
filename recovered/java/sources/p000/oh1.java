            package p000;

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
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class oh1 {

                /* JADX INFO: renamed from: a */
                public static final char[] f14754a;

                static {
/* 3 */             char[] cArr = new char[80];
/* 5 */             f14754a = cArr;
/* 9 */             Arrays.fill(cArr, ' ');
                }

                /* JADX INFO: renamed from: a */
                public static void m7171a(int i, StringBuilder sb) {
/* 1 */             while (i > 0) {
/* 3 */                 int i2 = 80;
/* 5 */                 if (i <= 80) {
/* 8 */                     i2 = i;
                        }
/* 12 */                sb.append(f14754a, 0, i2);
/* 15 */                i -= i2;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static void m7172b(StringBuilder sb, int i, String str, Object obj) {
/* 3 */             if (obj instanceof List) {
/* 7 */                 Iterator it = ((List) obj).iterator();
/* 15 */                while (it.hasNext()) {
/* 21 */                    m7172b(sb, i, str, it.next());
                        }
/* 55 */                return;
                    }
/* 27 */            if (obj instanceof Map) {
/* 35 */                Iterator it2 = ((Map) obj).entrySet().iterator();
/* 43 */                while (it2.hasNext()) {
/* 51 */                    m7172b(sb, i, str, (Map.Entry) it2.next());
                        }
/* 55 */                return;
                    }
/* 58 */            sb.append('\n');
/* 61 */            m7171a(i, sb);
/* 68 */            if (!str.isEmpty()) {
/* 73 */                StringBuilder sb2 = new StringBuilder();
/* 85 */                sb2.append(Character.toLowerCase(str.charAt(0)));
/* 93 */                for (int i2 = 1; i2 < str.length(); i2++) {
/* 95 */                    char cCharAt = str.charAt(i2);
/* 103 */                   if (Character.isUpperCase(cCharAt)) {
/* 107 */                       sb2.append("_");
                            }
/* 114 */                   sb2.append(Character.toLowerCase(cCharAt));
                        }
/* 120 */               str = sb2.toString();
                    }
/* 124 */           sb.append(str);
/* 133 */           if (obj instanceof String) {
/* 135 */               sb.append(": \"");
/* 140 */               C2222tl c2222tl = AbstractC2298vl.f18234b;
/* 157 */               sb.append(yy1.m10222q(new C2222tl(((String) obj).getBytes(ez0.f7923a))));
/* 160 */               sb.append('\"');
/* 163 */               return;
                    }
/* 166 */           if (obj instanceof AbstractC2298vl) {
/* 168 */               sb.append(": \"");
/* 177 */               sb.append(yy1.m10222q((AbstractC2298vl) obj));
/* 180 */               sb.append('\"');
/* 183 */               return;
                    }
/* 192 */           if (obj instanceof sq0) {
/* 194 */               sb.append(" {");
/* 201 */               m7173c((sq0) obj, sb, i + 2);
/* 204 */               sb.append("\n");
/* 207 */               m7171a(i, sb);
/* 210 */               sb.append("}");
/* 213 */               return;
                    }
/* 216 */           if (!(obj instanceof Map.Entry)) {
/* 255 */               sb.append(": ");
/* 258 */               sb.append(obj);
/* 261 */               return;
                    }
/* 218 */           sb.append(" {");
/* 221 */           Map.Entry entry = (Map.Entry) obj;
/* 223 */           int i3 = i + 2;
/* 231 */           m7172b(sb, i3, "key", entry.getKey());
/* 240 */           m7172b(sb, i3, FirebaseAnalytics.Param.VALUE, entry.getValue());
/* 243 */           sb.append("\n");
/* 246 */           m7171a(i, sb);
/* 249 */           sb.append("}");
                }

                /* JADX WARN: Code duplicated, block: B:75:0x0194  */
                /* JADX WARN: Code duplicated, block: B:76:0x0196  */
                /* JADX INFO: renamed from: c */
                public static void m7173c(sq0 sq0Var, StringBuilder sb, int i) {
                    int i2;
                    int i3;
                    boolean zBooleanValue;
                    boolean zEquals;
                    Method method;
                    Method method2;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            HashMap map = new HashMap();
/* 19 */            TreeMap treeMap = new TreeMap();
/* 26 */            Method[] declaredMethods = sq0Var.getClass().getDeclaredMethods();
/* 30 */            int length = declaredMethods.length;
/* 32 */            int i4 = 0;
                    while (true) {
/* 39 */                i2 = 3;
/* 40 */                if (i4 >= length) {
                            break;
                        }
/* 42 */                Method method3 = declaredMethods[i4];
/* 52 */                if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
/* 74 */                    if (method3.getName().startsWith("set")) {
/* 80 */                        hashSet.add(method3.getName());
                            } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
/* 111 */                       if (method3.getName().startsWith("has")) {
/* 117 */                           map.put(method3.getName(), method3);
                                } else if (method3.getName().startsWith("get")) {
/* 135 */                           treeMap.put(method3.getName(), method3);
                                }
                            }
                        }
/* 138 */               i4++;
                    }
/* 153 */           for (Map.Entry entry : treeMap.entrySet()) {
/* 167 */               String strSubstring = ((String) entry.getKey()).substring(i2);
/* 177 */               if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
/* 237 */                   i3 = i2;
                        } else {
/* 205 */                   i3 = i2;
/* 213 */                   if (method2.getReturnType().equals(List.class)) {
/* 231 */                       m7172b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), sq0.m8610l(method2, sq0Var, new Object[0]));
                            }
/* 234 */                   i2 = i3;
                        }
/* 245 */               if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
/* 307 */                   m7172b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), sq0.m8610l(method, sq0Var, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 355 */                   Method method4 = (Method) entry.getValue();
/* 365 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 367 */                   if (method4 != null) {
/* 371 */                       Object objM8610l = sq0.m8610l(method4, sq0Var, new Object[0]);
/* 375 */                       if (method5 == null) {
/* 379 */                           zBooleanValue = true;
/* 380 */                           if (objM8610l instanceof Boolean) {
/* 389 */                               zEquals = !((Boolean) objM8610l).booleanValue();
                                    } else if (objM8610l instanceof Integer) {
/* 403 */                               if (((Integer) objM8610l).intValue() == 0) {
/* 405 */                                   zEquals = true;
                                        } else {
/* 407 */                                   zEquals = false;
                                        }
                                    } else if (objM8610l instanceof Float) {
/* 424 */                               if (Float.floatToRawIntBits(((Float) objM8610l).floatValue()) == 0) {
/* 405 */                                   zEquals = true;
                                        } else {
/* 407 */                                   zEquals = false;
                                        }
                                    } else if (objM8610l instanceof Double) {
/* 446 */                               if (Double.doubleToRawLongBits(((Double) objM8610l).doubleValue()) == 0) {
/* 405 */                                   zEquals = true;
                                        } else {
/* 407 */                                   zEquals = false;
                                        }
                                    } else if (objM8610l instanceof String) {
/* 455 */                               zEquals = objM8610l.equals(HttpUrl.FRAGMENT_ENCODE_SET);
                                    } else if (objM8610l instanceof AbstractC2298vl) {
/* 466 */                               zEquals = objM8610l.equals(AbstractC2298vl.f18234b);
                                    } else if (!(objM8610l instanceof AbstractC2313w) ? !((objM8610l instanceof Enum) && ((Enum) objM8610l).ordinal() == 0) : objM8610l != ((AbstractC2313w) objM8610l).mo1421a()) {
/* 407 */                               zEquals = false;
                                    } else {
/* 405 */                               zEquals = true;
                                    }
/* 499 */                           if (zEquals) {
/* 502 */                               zBooleanValue = false;
                                    }
                                } else {
/* 512 */                           zBooleanValue = ((Boolean) sq0.m8610l(method5, sq0Var, new Object[0])).booleanValue();
                                }
/* 516 */                       if (zBooleanValue) {
/* 518 */                           m7172b(sb, i, strSubstring, objM8610l);
                                }
                            }
                        }
/* 234 */               i2 = i3;
                    }
/* 525 */           rx2 rx2Var = sq0Var.unknownFields;
/* 527 */           if (rx2Var != null) {
/* 531 */               for (int i5 = 0; i5 < rx2Var.f16340a; i5++) {
/* 547 */                   m7172b(sb, i, String.valueOf(rx2Var.f16341b[i5] >>> 3), rx2Var.f16342c[i5]);
                        }
                    }
                }
            }
