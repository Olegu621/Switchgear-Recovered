            package p000;

            import android.util.Base64;
            import com.google.android.gms.common.server.converter.StringToIntConverter;
            import com.google.android.gms.common.server.response.FastJsonResponse$Field;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class wg0 {
                /* JADX INFO: renamed from: b */
                public static final void m9574b(StringBuilder sb, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
/* 1 */             int i = fastJsonResponse$Field.f3576b;
/* 5 */             if (i == 11) {
/* 32 */                Class cls = fastJsonResponse$Field.f3582v;
/* 34 */                kb1.m6061n(cls);
/* 47 */                sb.append(((wg0) cls.cast(obj)).toString());
                    } else {
/* 8 */                 if (i != 7) {
/* 28 */                    sb.append(obj);
/* 31 */                    return;
                        }
/* 12 */                sb.append("\"");
/* 21 */                sb.append(k21.m5934a((String) obj));
/* 24 */                sb.append("\"");
                    }
                }

                public static final Object zaD(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
/* 1 */             StringToIntConverter stringToIntConverter = fastJsonResponse$Field.f3574V;
/* 3 */             if (stringToIntConverter != null) {
/* 17 */                obj = (String) stringToIntConverter.f3567c.get(((Integer) obj).intValue());
/* 19 */                if (obj == null && stringToIntConverter.f3566b.containsKey("gms_unknown")) {
/* 23 */                    return "gms_unknown";
                        }
                    }
/* 32 */            return obj;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public final void m9575a(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
/* 1 */             int i = fastJsonResponse$Field.f3578d;
/* 3 */             StringToIntConverter stringToIntConverter = fastJsonResponse$Field.f3574V;
/* 5 */             kb1.m6061n(stringToIntConverter);
/* 8 */             HashMap map = stringToIntConverter.f3566b;
/* 16 */            Integer num = (Integer) map.get((String) obj);
                    Integer num2 = num;
/* 18 */            if (num == null) {
/* 26 */                num2 = (Integer) map.get("gms_unknown");
                    }
/* 28 */            kb1.m6061n(num2);
/* 31 */            String str = fastJsonResponse$Field.f3580f;
                    switch (i) {
                        case 0:
/* 104 */                   setIntegerInternal(fastJsonResponse$Field, str, num2.intValue());
                            break;
                        case 1:
/* 96 */                    zaf(fastJsonResponse$Field, str, (BigInteger) num2);
                            break;
                        case 2:
/* 90 */                    setLongInternal(fastJsonResponse$Field, str, ((Long) num2).longValue());
                            break;
                        case 3:
                        default:
/* 42 */                    f42.m3656l(fm0.m3781g(i, "Unsupported type for conversion: "));
                            break;
                        case 4:
/* 80 */                    zan(fastJsonResponse$Field, str, ((Double) num2).doubleValue());
                            break;
                        case 5:
/* 70 */                    zab(fastJsonResponse$Field, str, (BigDecimal) num2);
                            break;
                        case 6:
/* 64 */                    setBooleanInternal(fastJsonResponse$Field, str, ((Boolean) num2).booleanValue());
                            break;
                        case 7:
/* 54 */                    setStringInternal(fastJsonResponse$Field, str, (String) num2);
                            break;
                        case 8:
                        case 9:
/* 48 */                    setDecodedBytesInternal(fastJsonResponse$Field, str, (byte[]) num2);
                            break;
                    }
                }

                public <T extends wg0> void addConcreteTypeArrayInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList<T> arrayList) {
/* 8 */             throw new UnsupportedOperationException("Concrete type array not supported");
                }

                public <T extends wg0> void addConcreteTypeInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, T t) {
/* 8 */             throw new UnsupportedOperationException("Concrete type not supported");
                }

                public abstract Map<String, FastJsonResponse$Field<?, ?>> getFieldMappings();

                public Object getFieldValue(FastJsonResponse$Field fastJsonResponse$Field) {
/* 3 */             String str = fastJsonResponse$Field.f3580f;
/* 7 */             if (fastJsonResponse$Field.f3582v == null) {
/* 80 */                return getValueObject(str);
                    }
/* 19 */            boolean z = getValueObject(str) == null;
/* 20 */            String str2 = fastJsonResponse$Field.f3580f;
/* 23 */            if (!z) {
/* 76 */                f42.m3656l(AbstractC0886en.m3507k("Concrete field shouldn't be value object: ", str2));
/* 22 */                return null;
                    }
                    try {
/* 60 */                return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
                    } catch (Exception e) {
/* 66 */                ds0.m3199p(e);
/* 22 */                return null;
                    }
                }

                public abstract Object getValueObject(String str);

                public boolean isFieldSet(FastJsonResponse$Field fastJsonResponse$Field) {
/* 5 */             if (fastJsonResponse$Field.f3578d != 11) {
/* 26 */                return isPrimitiveFieldSet(fastJsonResponse$Field.f3580f);
                    }
/* 10 */            if (fastJsonResponse$Field.f3579e) {
/* 14 */                C1951n4.m6866q("Concrete type arrays not supported");
/* 9 */                 return false;
                    }
/* 20 */            C1951n4.m6866q("Concrete types not supported");
/* 9 */             return false;
                }

                public abstract boolean isPrimitiveFieldSet(String str);

                public void setBooleanInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, boolean z) {
/* 8 */             throw new UnsupportedOperationException("Boolean not supported");
                }

                public void setDecodedBytesInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, byte[] bArr) {
/* 8 */             throw new UnsupportedOperationException("byte[] not supported");
                }

                public void setIntegerInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, int i) {
/* 8 */             throw new UnsupportedOperationException("Integer not supported");
                }

                public void setLongInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, long j) {
/* 8 */             throw new UnsupportedOperationException("Long not supported");
                }

                public void setStringInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, String str2) {
/* 8 */             throw new UnsupportedOperationException("String not supported");
                }

                public void setStringMapInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, Map<String, String> map) {
/* 8 */             throw new UnsupportedOperationException("String map not supported");
                }

                public void setStringsInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, ArrayList<String> arrayList) {
/* 8 */             throw new UnsupportedOperationException("String list not supported");
                }

                public String toString() {
/* 1 */             Map<String, FastJsonResponse$Field<?, ?>> fieldMappings = getFieldMappings();
/* 9 */             StringBuilder sb = new StringBuilder(100);
/* 24 */            for (String str : fieldMappings.keySet()) {
/* 32 */                FastJsonResponse$Field<?, ?> fastJsonResponse$Field = fieldMappings.get(str);
/* 42 */                if (isFieldSet(fastJsonResponse$Field)) {
/* 48 */                    Object objZaD = zaD(fastJsonResponse$Field, getFieldValue(fastJsonResponse$Field));
/* 58 */                    if (sb.length() == 0) {
/* 62 */                        sb.append("{");
                            } else {
/* 66 */                        sb.append(",");
                            }
/* 71 */                    sb.append("\"");
/* 74 */                    sb.append(str);
/* 79 */                    sb.append("\":");
/* 82 */                    if (objZaD != null) {
                                switch (fastJsonResponse$Field.f3578d) {
                                    case 8:
/* 165 */                               sb.append("\"");
/* 174 */                               sb.append(Base64.encodeToString((byte[]) objZaD, 0));
/* 177 */                               sb.append("\"");
                                        break;
                                    case 9:
/* 146 */                               sb.append("\"");
/* 157 */                               sb.append(Base64.encodeToString((byte[]) objZaD, 10));
/* 160 */                               sb.append("\"");
                                        break;
                                    case 10:
/* 142 */                               kb1.m6047W(sb, (HashMap) objZaD);
                                        break;
                                    default:
/* 98 */                                if (fastJsonResponse$Field.f3577c) {
/* 100 */                                   ArrayList arrayList = (ArrayList) objZaD;
/* 104 */                                   sb.append("[");
/* 107 */                                   int size = arrayList.size();
/* 111 */                                   for (int i = 0; i < size; i++) {
/* 113 */                                       if (i > 0) {
/* 115 */                                           sb.append(",");
                                                }
/* 118 */                                       Object obj = arrayList.get(i);
/* 122 */                                       if (obj != null) {
/* 124 */                                           m9574b(sb, fastJsonResponse$Field, obj);
                                                }
                                            }
/* 132 */                                   sb.append("]");
                                        } else {
/* 136 */                                   m9574b(sb, fastJsonResponse$Field, objZaD);
                                        }
                                        break;
                                }
                            } else {
/* 86 */                        sb.append("null");
                            }
                        }
                    }
/* 186 */           if (sb.length() > 0) {
/* 190 */               sb.append("}");
                    } else {
/* 196 */               sb.append("{}");
                    }
/* 199 */           return sb.toString();
                }

                public final void zaA(FastJsonResponse$Field fastJsonResponse$Field, String str) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 5 */                 m9575a(fastJsonResponse$Field, str);
                    } else {
/* 11 */                setStringInternal(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, str);
                    }
                }

                public final void zaB(FastJsonResponse$Field fastJsonResponse$Field, Map map) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 5 */                 m9575a(fastJsonResponse$Field, map);
                    } else {
/* 11 */                setStringMapInternal(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, map);
                    }
                }

                public final void zaC(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 5 */                 m9575a(fastJsonResponse$Field, arrayList);
                    } else {
/* 11 */                setStringsInternal(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, arrayList);
                    }
                }

                public final void zaa(FastJsonResponse$Field fastJsonResponse$Field, BigDecimal bigDecimal) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 5 */                 m9575a(fastJsonResponse$Field, bigDecimal);
                    } else {
/* 11 */                zab(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, bigDecimal);
                    }
                }

                public void zab(FastJsonResponse$Field fastJsonResponse$Field, String str, BigDecimal bigDecimal) {
/* 8 */             throw new UnsupportedOperationException("BigDecimal not supported");
                }

                public final void zac(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 5 */                 m9575a(fastJsonResponse$Field, arrayList);
                    } else {
/* 11 */                zad(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, arrayList);
                    }
                }

                public void zad(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 8 */             throw new UnsupportedOperationException("BigDecimal list not supported");
                }

                public final void zae(FastJsonResponse$Field fastJsonResponse$Field, BigInteger bigInteger) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 5 */                 m9575a(fastJsonResponse$Field, bigInteger);
                    } else {
/* 11 */                zaf(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, bigInteger);
                    }
                }

                public void zaf(FastJsonResponse$Field fastJsonResponse$Field, String str, BigInteger bigInteger) {
/* 8 */             throw new UnsupportedOperationException("BigInteger not supported");
                }

                public final void zag(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 5 */                 m9575a(fastJsonResponse$Field, arrayList);
                    } else {
/* 11 */                zah(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, arrayList);
                    }
                }

                public void zah(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 8 */             throw new UnsupportedOperationException("BigInteger list not supported");
                }

                public final void zai(FastJsonResponse$Field fastJsonResponse$Field, boolean z) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 9 */                 m9575a(fastJsonResponse$Field, Boolean.valueOf(z));
                    } else {
/* 15 */                setBooleanInternal(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, z);
                    }
                }

                public final void zaj(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 5 */                 m9575a(fastJsonResponse$Field, arrayList);
                    } else {
/* 11 */                zak(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, arrayList);
                    }
                }

                public void zak(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 8 */             throw new UnsupportedOperationException("Boolean list not supported");
                }

                public final void zal(FastJsonResponse$Field fastJsonResponse$Field, byte[] bArr) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 5 */                 m9575a(fastJsonResponse$Field, bArr);
                    } else {
/* 11 */                setDecodedBytesInternal(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, bArr);
                    }
                }

                public final void zam(FastJsonResponse$Field fastJsonResponse$Field, double d) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 9 */                 m9575a(fastJsonResponse$Field, Double.valueOf(d));
                    } else {
/* 15 */                zan(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, d);
                    }
                }

                public void zan(FastJsonResponse$Field fastJsonResponse$Field, String str, double d) {
/* 8 */             throw new UnsupportedOperationException("Double not supported");
                }

                public final void zao(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 5 */                 m9575a(fastJsonResponse$Field, arrayList);
                    } else {
/* 11 */                zap(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, arrayList);
                    }
                }

                public void zap(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 8 */             throw new UnsupportedOperationException("Double list not supported");
                }

                public final void zaq(FastJsonResponse$Field fastJsonResponse$Field, float f) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 9 */                 m9575a(fastJsonResponse$Field, Float.valueOf(f));
                    } else {
/* 15 */                zar(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, f);
                    }
                }

                public void zar(FastJsonResponse$Field fastJsonResponse$Field, String str, float f) {
/* 8 */             throw new UnsupportedOperationException("Float not supported");
                }

                public final void zas(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 5 */                 m9575a(fastJsonResponse$Field, arrayList);
                    } else {
/* 11 */                zat(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, arrayList);
                    }
                }

                public void zat(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 8 */             throw new UnsupportedOperationException("Float list not supported");
                }

                public final void zau(FastJsonResponse$Field fastJsonResponse$Field, int i) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 9 */                 m9575a(fastJsonResponse$Field, Integer.valueOf(i));
                    } else {
/* 15 */                setIntegerInternal(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, i);
                    }
                }

                public final void zav(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 5 */                 m9575a(fastJsonResponse$Field, arrayList);
                    } else {
/* 11 */                zaw(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, arrayList);
                    }
                }

                public void zaw(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 8 */             throw new UnsupportedOperationException("Integer list not supported");
                }

                public final void zax(FastJsonResponse$Field fastJsonResponse$Field, long j) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 9 */                 m9575a(fastJsonResponse$Field, Long.valueOf(j));
                    } else {
/* 15 */                setLongInternal(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, j);
                    }
                }

                public final void zay(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
/* 3 */             if (fastJsonResponse$Field.f3574V != null) {
/* 5 */                 m9575a(fastJsonResponse$Field, arrayList);
                    } else {
/* 11 */                zaz(fastJsonResponse$Field, fastJsonResponse$Field.f3580f, arrayList);
                    }
                }

                public void zaz(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 8 */             throw new UnsupportedOperationException("Long list not supported");
                }
            }
