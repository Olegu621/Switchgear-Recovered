            package p000;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.sentry.C1697u2;
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
            public abstract class sp3 {

                /* JADX INFO: renamed from: a */
                public static final char[] f16745a;

                static {
/* 3 */             char[] cArr = new char[80];
/* 5 */             f16745a = cArr;
/* 9 */             Arrays.fill(cArr, ' ');
                }

                /* JADX INFO: renamed from: a */
                public static void m8605a(StringBuilder sb, int i, String str, Object obj) {
/* 3 */             if (obj instanceof List) {
/* 7 */                 Iterator it = ((List) obj).iterator();
/* 15 */                while (it.hasNext()) {
/* 21 */                    m8605a(sb, i, str, it.next());
                        }
/* 55 */                return;
                    }
/* 27 */            if (obj instanceof Map) {
/* 35 */                Iterator it2 = ((Map) obj).entrySet().iterator();
/* 43 */                while (it2.hasNext()) {
/* 51 */                    m8605a(sb, i, str, (Map.Entry) it2.next());
                        }
/* 55 */                return;
                    }
/* 58 */            sb.append('\n');
/* 61 */            m8607c(i, sb);
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
/* 154 */               sb.append(i13.m4423E(new an3(((String) obj).getBytes(so3.f16726a))));
/* 157 */               sb.append('\"');
/* 160 */               return;
                    }
/* 163 */           if (obj instanceof cn3) {
/* 165 */               sb.append(": \"");
/* 174 */               sb.append(i13.m4423E((cn3) obj));
/* 177 */               sb.append('\"');
/* 180 */               return;
                    }
/* 189 */           if (obj instanceof eo3) {
/* 191 */               sb.append(" {");
/* 198 */               m8606b((eo3) obj, sb, i + 2);
/* 201 */               sb.append("\n");
/* 204 */               m8607c(i, sb);
/* 207 */               sb.append("}");
/* 210 */               return;
                    }
/* 213 */           if (!(obj instanceof Map.Entry)) {
/* 252 */               sb.append(": ");
/* 255 */               sb.append(obj);
/* 258 */               return;
                    }
/* 215 */           sb.append(" {");
/* 218 */           Map.Entry entry = (Map.Entry) obj;
/* 220 */           int i3 = i + 2;
/* 228 */           m8605a(sb, i3, "key", entry.getKey());
/* 237 */           m8605a(sb, i3, FirebaseAnalytics.Param.VALUE, entry.getValue());
/* 240 */           sb.append("\n");
/* 243 */           m8607c(i, sb);
/* 246 */           sb.append("}");
                }

                /* JADX WARN: Code duplicated, block: B:103:0x0201  */
                /* JADX INFO: renamed from: b */
                public static void m8606b(eo3 eo3Var, StringBuilder sb, int i) {
                    int i2;
                    int i3;
                    boolean zEquals;
                    Method method;
                    Method method2;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            HashMap map = new HashMap();
/* 19 */            TreeMap treeMap = new TreeMap();
/* 26 */            Method[] declaredMethods = eo3Var.getClass().getDeclaredMethods();
/* 30 */            int length = declaredMethods.length;
/* 32 */            int i4 = 0;
                    while (true) {
/* 39 */                i2 = 3;
/* 40 */                if (i4 >= length) {
                            break;
                        }
/* 42 */                Method method3 = declaredMethods[i4];
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
/* 135 */               i4++;
                    }
/* 150 */           for (Map.Entry entry : treeMap.entrySet()) {
/* 164 */               String strSubstring = ((String) entry.getKey()).substring(i2);
/* 174 */               if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
/* 234 */                   i3 = i2;
                        } else {
/* 202 */                   i3 = i2;
/* 210 */                   if (method2.getReturnType().equals(List.class)) {
/* 228 */                       m8605a(sb, i, strSubstring.substring(0, strSubstring.length() - 4), eo3.m3537g(method2, eo3Var, new Object[0]));
                            }
/* 231 */                   i2 = i3;
                        }
/* 242 */               if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
/* 304 */                   m8605a(sb, i, strSubstring.substring(0, strSubstring.length() - 3), eo3.m3537g(method, eo3Var, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 350 */                   Method method4 = (Method) entry.getValue();
/* 360 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 362 */                   if (method4 != null) {
/* 366 */                       Object objM3537g = eo3.m3537g(method4, eo3Var, new Object[0]);
/* 370 */                       if (method5 == null) {
/* 374 */                           if (objM3537g instanceof Boolean) {
/* 383 */                               if (((Boolean) objM3537g).booleanValue()) {
/* 514 */                                   m8605a(sb, i, strSubstring, objM3537g);
                                        }
                                    } else if (objM3537g instanceof Integer) {
/* 398 */                               if (((Integer) objM3537g).intValue() != 0) {
/* 514 */                                   m8605a(sb, i, strSubstring, objM3537g);
                                        }
                                    } else if (objM3537g instanceof Float) {
/* 417 */                               if (Float.floatToRawIntBits(((Float) objM3537g).floatValue()) != 0) {
/* 514 */                                   m8605a(sb, i, strSubstring, objM3537g);
                                        }
                                    } else if (!(objM3537g instanceof Double)) {
/* 444 */                               if (objM3537g instanceof String) {
/* 448 */                                   zEquals = objM3537g.equals(HttpUrl.FRAGMENT_ENCODE_SET);
                                        } else if (objM3537g instanceof cn3) {
/* 459 */                                   zEquals = objM3537g.equals(cn3.f3019b);
                                        } else if (objM3537g instanceof tm3) {
/* 483 */                                   if (objM3537g != ((eo3) ((eo3) ((tm3) objM3537g)).mo317l(6, null))) {
/* 514 */                                       m8605a(sb, i, strSubstring, objM3537g);
                                            }
                                        } else if (!(objM3537g instanceof Enum) || ((Enum) objM3537g).ordinal() != 0) {
/* 514 */                                   m8605a(sb, i, strSubstring, objM3537g);
                                        }
/* 463 */                               if (!zEquals) {
/* 514 */                                   m8605a(sb, i, strSubstring, objM3537g);
                                        }
                                    } else if (Double.doubleToRawLongBits(((Double) objM3537g).doubleValue()) != 0) {
/* 514 */                               m8605a(sb, i, strSubstring, objM3537g);
                                    }
                                } else if (((Boolean) eo3.m3537g(method5, eo3Var, new Object[0])).booleanValue()) {
/* 514 */                           m8605a(sb, i, strSubstring, objM3537g);
                                }
                            }
                        }
/* 231 */               i2 = i3;
                    }
/* 523 */           if (eo3Var instanceof bo3) {
/* 534 */               ff2 ff2Var = (ff2) ((bo3) eo3Var).zza.m9046c();
/* 540 */               if (ff2Var.hasNext()) {
/* 553 */                   ((Map.Entry) ff2Var.next()).getKey().getClass();
/* 556 */                   C1697u2.m5431g();
/* 559 */                   return;
                        }
                    }
/* 560 */           mq3 mq3Var = eo3Var.zzc;
/* 562 */           if (mq3Var != null) {
/* 566 */               for (int i5 = 0; i5 < mq3Var.f13978a; i5++) {
/* 582 */                   m8605a(sb, i, String.valueOf(mq3Var.f13979b[i5] >>> 3), mq3Var.f13980c[i5]);
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public static void m8607c(int i, StringBuilder sb) {
/* 1 */             while (i > 0) {
/* 3 */                 int i2 = 80;
/* 5 */                 if (i <= 80) {
/* 8 */                     i2 = i;
                        }
/* 12 */                sb.append(f16745a, 0, i2);
/* 15 */                i -= i2;
                    }
                }
            }
