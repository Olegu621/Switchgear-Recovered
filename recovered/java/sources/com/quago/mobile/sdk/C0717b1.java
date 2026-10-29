            package com.quago.mobile.sdk;

            import java.lang.reflect.Field;
            import java.lang.reflect.Modifier;
            import java.util.Map;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.b1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0717b1 {

                /* JADX INFO: renamed from: b */
                public static final String[] f5364b = new String[128];

                /* JADX INFO: renamed from: a */
                public StringBuilder f5365a;

                static {
/* 10 */            for (int i = 0; i <= 31; i++) {
/* 28 */                f5364b[i] = String.format("\\u%04x", Integer.valueOf(i));
                    }
/* 33 */            String[] strArr = f5364b;
/* 39 */            strArr[34] = "\\\"";
/* 45 */            strArr[92] = "\\\\";
/* 51 */            strArr[9] = "\\t";
/* 57 */            strArr[8] = "\\b";
/* 63 */            strArr[10] = "\\n";
/* 69 */            strArr[13] = "\\r";
/* 75 */            strArr[12] = "\\f";
                }

                /* JADX INFO: renamed from: a */
                public final void m2548a(Object obj) {
                    String str;
/* 3 */             if (obj == null) {
/* 7 */                 this.f5365a.append("null");
/* 10 */                return;
                    }
/* 13 */            if (obj instanceof Float) {
/* 17 */                float fFloatValue = ((Float) obj).floatValue();
/* 21 */                boolean zIsNaN = Float.isNaN(fFloatValue);
/* 25 */                StringBuilder sb = this.f5365a;
/* 27 */                if (zIsNaN) {
/* 29 */                    sb.append("null");
/* 32 */                    return;
                        } else {
/* 33 */                    sb.append(fFloatValue);
/* 36 */                    return;
                        }
                    }
/* 39 */            if (obj instanceof Integer) {
/* 49 */                this.f5365a.append(((Integer) obj).intValue());
/* 52 */                return;
                    }
/* 55 */            if (obj instanceof Long) {
/* 65 */                this.f5365a.append(((Long) obj).longValue());
/* 68 */                return;
                    }
/* 71 */            int i = 0;
/* 74 */            if (obj instanceof CharSequence) {
/* 76 */                CharSequence charSequence = (CharSequence) obj;
/* 78 */                int length = charSequence.length();
/* 84 */                this.f5365a.append('\"');
/* 87 */                while (i < length) {
/* 89 */                    char cCharAt = charSequence.charAt(i);
/* 93 */                    String[] strArr = f5364b;
/* 97 */                    if (cCharAt >= 128 || (str = strArr[cCharAt]) == null) {
/* 111 */                       this.f5365a.append(cCharAt);
                            } else {
/* 105 */                       this.f5365a.append(str);
                            }
/* 114 */                   i++;
                        }
/* 119 */               this.f5365a.append('\"');
/* 122 */               return;
                    }
/* 125 */           if (obj instanceof Boolean) {
/* 135 */               this.f5365a.append(((Boolean) obj).booleanValue());
/* 138 */               return;
                    }
/* 141 */           if (obj instanceof Double) {
/* 145 */               double dDoubleValue = ((Double) obj).doubleValue();
/* 149 */               boolean zIsNaN2 = Double.isNaN(dDoubleValue);
/* 153 */               StringBuilder sb2 = this.f5365a;
/* 155 */               if (zIsNaN2) {
/* 157 */                   sb2.append("null");
/* 160 */                   return;
                        } else {
/* 161 */                   sb2.append(dDoubleValue);
/* 164 */                   return;
                        }
                    }
/* 167 */           if (obj instanceof Short) {
/* 177 */               this.f5365a.append((int) ((Short) obj).shortValue());
/* 180 */               return;
                    }
/* 183 */           if (obj instanceof Character) {
/* 187 */               this.f5365a.append('\"');
/* 198 */               this.f5365a.append(((Character) obj).charValue());
/* 203 */               this.f5365a.append('\"');
/* 206 */               return;
                    }
/* 209 */           if (obj instanceof Byte) {
/* 219 */               this.f5365a.append((int) ((Byte) obj).byteValue());
/* 222 */               return;
                    }
/* 238 */           if (obj.getClass().isArray()) {
/* 242 */               this.f5365a.append('[');
/* 245 */               Object[] objArr = (Object[]) obj;
/* 248 */               if (objArr.length > 0) {
/* 252 */                   m2548a(objArr[0]);
/* 256 */                   for (int i2 = 1; i2 < objArr.length; i2++) {
/* 260 */                       this.f5365a.append(',');
/* 265 */                       m2548a(objArr[i2]);
                            }
                        }
/* 273 */               this.f5365a.append(']');
/* 276 */               return;
                    }
/* 279 */           if (obj instanceof Enum) {
/* 283 */               this.f5365a.append('\"');
/* 294 */               this.f5365a.append(((Enum) obj).name());
/* 299 */               this.f5365a.append('\"');
/* 302 */               return;
                    }
/* 311 */           if (obj instanceof Map) {
/* 315 */               this.f5365a.append('{');
/* 332 */               for (Object obj2 : ((Map) obj).entrySet()) {
/* 338 */                   if (i == 0) {
/* 340 */                       i = 1;
                            } else {
/* 344 */                       this.f5365a.append(',');
                            }
/* 347 */                   Map.Entry entry = (Map.Entry) obj2;
/* 349 */                   Object key = entry.getKey();
/* 355 */                   this.f5365a.append('\"');
/* 360 */                   if (key instanceof Integer) {
/* 370 */                       this.f5365a.append(((Integer) key).intValue());
                            } else if (key instanceof Float) {
/* 387 */                       this.f5365a.append(((Float) key).floatValue());
                            } else if (key instanceof Long) {
/* 404 */                       this.f5365a.append(((Long) key).longValue());
                            } else if (key instanceof String) {
/* 416 */                       this.f5365a.append((String) key);
                            } else if (key instanceof Boolean) {
/* 432 */                       this.f5365a.append(((Boolean) key).booleanValue());
                            } else if (key instanceof Double) {
/* 448 */                       this.f5365a.append(((Double) key).doubleValue());
                            } else if (key instanceof Short) {
/* 464 */                       this.f5365a.append((int) ((Short) key).shortValue());
                            } else if (key instanceof Character) {
/* 480 */                       this.f5365a.append(((Character) key).charValue());
                            } else if (key instanceof Byte) {
/* 496 */                       this.f5365a.append((int) ((Byte) key).byteValue());
                            } else {
/* 500 */                       m2548a(key);
                            }
/* 505 */                   this.f5365a.append('\"');
/* 510 */                   this.f5365a.append(':');
/* 517 */                   m2548a(entry.getValue());
                        }
/* 524 */               this.f5365a.append('}');
/* 527 */               return;
                    }
/* 528 */           boolean z = obj instanceof Iterable;
/* 530 */           StringBuilder sb3 = this.f5365a;
/* 532 */           if (z) {
/* 534 */               sb3.append('[');
/* 547 */               for (Object obj3 : (Iterable) obj) {
/* 553 */                   if (i == 0) {
/* 555 */                       i = 1;
                            } else {
/* 559 */                       this.f5365a.append(',');
                            }
/* 562 */                   m2548a(obj3);
                        }
/* 568 */               this.f5365a.append(']');
/* 571 */               return;
                    }
/* 572 */           sb3.append('{');
/* 575 */           Class<?> superclass = obj.getClass();
/* 579 */           boolean z2 = false;
/* 663 */           do {
/* 586 */               for (Field field : superclass.getDeclaredFields()) {
/* 590 */                   int modifiers = field.getModifiers();
/* 598 */                   if (!field.isSynthetic() && !Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
/* 613 */                       if (z2) {
/* 619 */                           this.f5365a.append(',');
                                } else {
/* 615 */                           z2 = true;
                                }
/* 624 */                       this.f5365a.append('\"');
/* 633 */                       this.f5365a.append(field.getName());
/* 638 */                       this.f5365a.append('\"');
/* 643 */                       this.f5365a.append(':');
/* 646 */                       field.setAccessible(true);
/* 653 */                       m2548a(field.get(obj));
                            }
                        }
/* 659 */               superclass = superclass.getSuperclass();
/* 663 */           } while (superclass != null);
/* 667 */           this.f5365a.append('}');
                }

                /* JADX INFO: renamed from: b */
                public final synchronized String m2549b(Object obj) {
/* 2 */             return m2550c(obj);
                }

                /* JADX INFO: renamed from: c */
                public final synchronized String m2550c(Object obj) {
/* 2 */             if (obj == null) {
/* 4 */                 return "null";
                    }
                    try {
/* 12 */                if (this.f5365a == null) {
/* 22 */                    this.f5365a = new StringBuilder(200000);
                        }
/* 27 */                m2548a(obj);
/* 32 */                String string = this.f5365a.toString();
/* 39 */                this.f5365a.setLength(0);
/* 43 */                return string;
                    } catch (Exception e) {
/* 44 */                e.printStackTrace();
/* 48 */                return null;
                    }
                }
            }
