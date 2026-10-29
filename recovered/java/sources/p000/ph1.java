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
            public abstract class ph1 {

                /* JADX INFO: renamed from: a */
                public static final char[] f15122a;

                static {
/* 3 */             char[] cArr = new char[80];
/* 5 */             f15122a = cArr;
/* 9 */             Arrays.fill(cArr, ' ');
                }

                /* JADX INFO: renamed from: a */
                public static void m7448a(int i, StringBuilder sb) {
/* 1 */             while (i > 0) {
/* 3 */                 int i2 = 80;
/* 5 */                 if (i <= 80) {
/* 8 */                     i2 = i;
                        }
/* 12 */                sb.append(f15122a, 0, i2);
/* 15 */                i -= i2;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static void m7449b(StringBuilder sb, int i, String str, Object obj) {
/* 3 */             if (obj instanceof List) {
/* 7 */                 Iterator it = ((List) obj).iterator();
/* 15 */                while (it.hasNext()) {
/* 21 */                    m7449b(sb, i, str, it.next());
                        }
/* 55 */                return;
                    }
/* 27 */            if (obj instanceof Map) {
/* 35 */                Iterator it2 = ((Map) obj).entrySet().iterator();
/* 43 */                while (it2.hasNext()) {
/* 51 */                    m7449b(sb, i, str, (Map.Entry) it2.next());
                        }
/* 55 */                return;
                    }
/* 58 */            sb.append('\n');
/* 61 */            m7448a(i, sb);
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
/* 140 */               C2259ul c2259ul = C2259ul.f17581c;
/* 157 */               sb.append(xe2.m9778p(new C2259ul(((String) obj).getBytes(fz0.f8401a))));
/* 160 */               sb.append('\"');
/* 163 */               return;
                    }
/* 166 */           if (obj instanceof C2259ul) {
/* 168 */               sb.append(": \"");
/* 177 */               sb.append(xe2.m9778p((C2259ul) obj));
/* 180 */               sb.append('\"');
/* 183 */               return;
                    }
/* 192 */           if (obj instanceof tq0) {
/* 194 */               sb.append(" {");
/* 201 */               m7450c((tq0) obj, sb, i + 2);
/* 204 */               sb.append("\n");
/* 207 */               m7448a(i, sb);
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
/* 231 */           m7449b(sb, i3, "key", entry.getKey());
/* 240 */           m7449b(sb, i3, FirebaseAnalytics.Param.VALUE, entry.getValue());
/* 243 */           sb.append("\n");
/* 246 */           m7448a(i, sb);
/* 249 */           sb.append("}");
                }

                /* JADX WARN: Code duplicated, block: B:75:0x0194  */
                /* JADX WARN: Code duplicated, block: B:76:0x0196  */
                /* JADX INFO: renamed from: c */
                public static void m7450c(tq0 tq0Var, StringBuilder sb, int i) {
                    int i2;
                    int i3;
                    boolean zBooleanValue;
                    boolean zEquals;
                    Method method;
                    Method method2;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            HashMap map = new HashMap();
/* 19 */            TreeMap treeMap = new TreeMap();
/* 26 */            Method[] declaredMethods = tq0Var.getClass().getDeclaredMethods();
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
/* 231 */                       m7449b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), tq0.m8853e(method2, tq0Var, new Object[0]));
                            }
/* 234 */                   i2 = i3;
                        }
/* 245 */               if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
/* 307 */                   m7449b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), tq0.m8853e(method, tq0Var, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 355 */                   Method method4 = (Method) entry.getValue();
/* 365 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 367 */                   if (method4 != null) {
/* 371 */                       Object objM8853e = tq0.m8853e(method4, tq0Var, new Object[0]);
/* 375 */                       if (method5 == null) {
/* 379 */                           zBooleanValue = true;
/* 380 */                           if (objM8853e instanceof Boolean) {
/* 389 */                               zEquals = !((Boolean) objM8853e).booleanValue();
                                    } else if (objM8853e instanceof Integer) {
/* 403 */                               if (((Integer) objM8853e).intValue() == 0) {
/* 405 */                                   zEquals = true;
                                        } else {
/* 407 */                                   zEquals = false;
                                        }
                                    } else if (objM8853e instanceof Float) {
/* 424 */                               if (Float.floatToRawIntBits(((Float) objM8853e).floatValue()) == 0) {
/* 405 */                                   zEquals = true;
                                        } else {
/* 407 */                                   zEquals = false;
                                        }
                                    } else if (objM8853e instanceof Double) {
/* 446 */                               if (Double.doubleToRawLongBits(((Double) objM8853e).doubleValue()) == 0) {
/* 405 */                                   zEquals = true;
                                        } else {
/* 407 */                                   zEquals = false;
                                        }
                                    } else if (objM8853e instanceof String) {
/* 455 */                               zEquals = objM8853e.equals(HttpUrl.FRAGMENT_ENCODE_SET);
                                    } else if (objM8853e instanceof C2259ul) {
/* 466 */                               zEquals = objM8853e.equals(C2259ul.f17581c);
                                    } else if (!(objM8853e instanceof AbstractC2350x) ? !((objM8853e instanceof Enum) && ((Enum) objM8853e).ordinal() == 0) : objM8853e != ((tq0) ((tq0) ((AbstractC2350x) objM8853e)).mo7066c(6))) {
/* 407 */                               zEquals = false;
                                    } else {
/* 405 */                               zEquals = true;
                                    }
/* 504 */                           if (zEquals) {
/* 507 */                               zBooleanValue = false;
                                    }
                                } else {
/* 517 */                           zBooleanValue = ((Boolean) tq0.m8853e(method5, tq0Var, new Object[0])).booleanValue();
                                }
/* 521 */                       if (zBooleanValue) {
/* 523 */                           m7449b(sb, i, strSubstring, objM8853e);
                                }
                            }
                        }
/* 234 */               i2 = i3;
                    }
/* 530 */           sx2 sx2Var = tq0Var.unknownFields;
/* 532 */           if (sx2Var != null) {
/* 536 */               for (int i5 = 0; i5 < sx2Var.f16859a; i5++) {
/* 552 */                   m7449b(sb, i, String.valueOf(sx2Var.f16860b[i5] >>> 3), sx2Var.f16861c[i5]);
                        }
                    }
                }
            }
