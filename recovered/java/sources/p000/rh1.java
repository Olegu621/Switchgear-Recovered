            package p000;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1697u2;
            import java.io.IOException;
            import java.lang.reflect.Field;
            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rh1 implements i72 {

                /* JADX INFO: renamed from: n */
                public static final int[] f16060n = new int[0];

                /* JADX INFO: renamed from: o */
                public static final Unsafe f16061o = ny2.m7077i();

                /* JADX INFO: renamed from: a */
                public final int[] f16062a;

                /* JADX INFO: renamed from: b */
                public final Object[] f16063b;

                /* JADX INFO: renamed from: c */
                public final int f16064c;

                /* JADX INFO: renamed from: d */
                public final int f16065d;

                /* JADX INFO: renamed from: e */
                public final AbstractC2350x f16066e;

                /* JADX INFO: renamed from: f */
                public final boolean f16067f;

                /* JADX INFO: renamed from: g */
                public final int[] f16068g;

                /* JADX INFO: renamed from: h */
                public final int f16069h;

                /* JADX INFO: renamed from: i */
                public final int f16070i;

                /* JADX INFO: renamed from: j */
                public final hn1 f16071j;

                /* JADX INFO: renamed from: k */
                public final d81 f16072k;

                /* JADX INFO: renamed from: l */
                public final ux2 f16073l;

                /* JADX INFO: renamed from: m */
                public final ic1 f16074m;

                public rh1(int[] iArr, Object[] objArr, int i, int i2, AbstractC2350x abstractC2350x, int[] iArr2, int i3, int i4, hn1 hn1Var, d81 d81Var, ux2 ux2Var, gg0 gg0Var, ic1 ic1Var) {
/* 4 */             this.f16062a = iArr;
/* 6 */             this.f16063b = objArr;
/* 8 */             this.f16064c = i;
/* 10 */            this.f16065d = i2;
/* 14 */            this.f16067f = abstractC2350x instanceof tq0;
/* 16 */            this.f16068g = iArr2;
/* 18 */            this.f16069h = i3;
/* 20 */            this.f16070i = i4;
/* 22 */            this.f16071j = hn1Var;
/* 24 */            this.f16072k = d81Var;
/* 26 */            this.f16073l = ux2Var;
/* 28 */            this.f16066e = abstractC2350x;
/* 30 */            this.f16074m = ic1Var;
                }

                /* JADX INFO: renamed from: E */
                public static Field m8159E(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (NoSuchFieldException unused) {
/* 6 */                 Field[] declaredFields = cls.getDeclaredFields();
/* 12 */                for (Field field : declaredFields) {
/* 24 */                    if (str.equals(field.getName())) {
/* 26 */                        return field;
                            }
                        }
/* 34 */                StringBuilder sbM3513q = AbstractC0886en.m3513q("Field ", str, " for ");
/* 42 */                sbM3513q.append(cls.getName());
/* 47 */                sbM3513q.append(" not found. Known fields are ");
/* 54 */                C1697u2.m5438n(sbM3513q, Arrays.toString(declaredFields));
/* 57 */                return null;
                    }
                }

                /* JADX INFO: renamed from: J */
                public static int m8160J(int i) {
/* 4 */             return (i & 267386880) >>> 20;
                }

                /* JADX INFO: renamed from: o */
                public static boolean m8161o(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof tq0) {
/* 11 */                return ((tq0) obj).m8858g();
                    }
/* 16 */            return true;
                }

                /* JADX WARN: Code duplicated, block: B:120:0x025b  */
                /* JADX WARN: Code duplicated, block: B:121:0x025e  */
                /* JADX WARN: Code duplicated, block: B:124:0x0275  */
                /* JADX WARN: Code duplicated, block: B:125:0x0278  */
                /* JADX WARN: Code duplicated, block: B:162:0x0334  */
                /* JADX WARN: Code duplicated, block: B:177:0x037e  */
                /* JADX WARN: Code duplicated, block: B:180:0x0388  */
                /* JADX WARN: Code duplicated, block: B:183:0x0398  */
                /* JADX INFO: renamed from: v */
                public static rh1 m8162v(t02 t02Var, hn1 hn1Var, d81 d81Var, ux2 ux2Var, gg0 gg0Var, ic1 ic1Var) {
                    int i;
                    int iCharAt;
                    int i2;
                    int i3;
                    int i4;
                    int[] iArr;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    char cCharAt;
                    int i9;
                    char cCharAt2;
                    int i10;
                    char cCharAt3;
                    int i11;
                    char cCharAt4;
                    int i12;
                    char cCharAt5;
                    int i13;
                    char cCharAt6;
                    int i14;
                    char cCharAt7;
                    int i15;
                    char cCharAt8;
                    int i16;
                    int i17;
                    int i18;
                    int i19;
                    int iObjectFieldOffset;
                    int iObjectFieldOffset2;
                    int i20;
                    int i21;
                    int i22;
                    int i23;
                    Field fieldM8159E;
                    char cCharAt9;
                    int i24;
                    int i25;
                    int i26;
                    Object obj;
                    Field fieldM8159E2;
                    int i27;
                    Object obj2;
                    Field fieldM8159E3;
                    int i28;
                    char cCharAt10;
                    int i29;
                    char cCharAt11;
                    int i30;
                    char cCharAt12;
                    int i31;
                    char cCharAt13;
/* 1 */             String str = t02Var.f16889b;
/* 2 */             int length = str.length();
                    int i32 = 55296;
/* 3 */             if (str.charAt(0) >= 55296) {
                        int i33 = 1;
                        while (true) {
                            i = i33 + 1;
/* 4 */                     if (str.charAt(i33) < 55296) {
                                break;
                            }
                            i33 = i;
                        }
                    } else {
                        i = 1;
                    }
                    int i34 = i + 1;
/* 5 */             int iCharAt2 = str.charAt(i);
                    if (iCharAt2 >= 55296) {
                        int i35 = iCharAt2 & 8191;
                        int i36 = 13;
                        while (true) {
                            i31 = i34 + 1;
/* 6 */                     cCharAt13 = str.charAt(i34);
                            if (cCharAt13 < 55296) {
                                break;
                            }
                            i35 |= (cCharAt13 & 8191) << i36;
                            i36 += 13;
                            i34 = i31;
                        }
                        iCharAt2 = i35 | (cCharAt13 << i36);
                        i34 = i31;
                    }
                    if (iCharAt2 == 0) {
                        i3 = 0;
                        i6 = 0;
                        iCharAt = 0;
                        i2 = 0;
                        i5 = 0;
                        i7 = 0;
/* 7 */                 iArr = f16060n;
                        i4 = 0;
                    } else {
                        int i37 = i34 + 1;
/* 8 */                 int iCharAt3 = str.charAt(i34);
                        if (iCharAt3 >= 55296) {
                            int i38 = iCharAt3 & 8191;
                            int i39 = 13;
                            while (true) {
                                i15 = i37 + 1;
/* 9 */                         cCharAt8 = str.charAt(i37);
                                if (cCharAt8 < 55296) {
                                    break;
                                }
                                i38 |= (cCharAt8 & 8191) << i39;
                                i39 += 13;
                                i37 = i15;
                            }
                            iCharAt3 = i38 | (cCharAt8 << i39);
                            i37 = i15;
                        }
                        int i40 = i37 + 1;
/* 10 */                int iCharAt4 = str.charAt(i37);
                        if (iCharAt4 >= 55296) {
                            int i41 = iCharAt4 & 8191;
                            int i42 = 13;
                            while (true) {
                                i14 = i40 + 1;
/* 11 */                        cCharAt7 = str.charAt(i40);
                                if (cCharAt7 < 55296) {
                                    break;
                                }
                                i41 |= (cCharAt7 & 8191) << i42;
                                i42 += 13;
                                i40 = i14;
                            }
                            iCharAt4 = i41 | (cCharAt7 << i42);
                            i40 = i14;
                        }
                        int i43 = i40 + 1;
/* 12 */                int iCharAt5 = str.charAt(i40);
                        if (iCharAt5 >= 55296) {
                            int i44 = iCharAt5 & 8191;
                            int i45 = 13;
                            while (true) {
                                i13 = i43 + 1;
/* 13 */                        cCharAt6 = str.charAt(i43);
                                if (cCharAt6 < 55296) {
                                    break;
                                }
                                i44 |= (cCharAt6 & 8191) << i45;
                                i45 += 13;
                                i43 = i13;
                            }
                            iCharAt5 = i44 | (cCharAt6 << i45);
                            i43 = i13;
                        }
                        int i46 = i43 + 1;
/* 14 */                int iCharAt6 = str.charAt(i43);
                        if (iCharAt6 >= 55296) {
                            int i47 = iCharAt6 & 8191;
                            int i48 = 13;
                            while (true) {
                                i12 = i46 + 1;
/* 15 */                        cCharAt5 = str.charAt(i46);
                                if (cCharAt5 < 55296) {
                                    break;
                                }
                                i47 |= (cCharAt5 & 8191) << i48;
                                i48 += 13;
                                i46 = i12;
                            }
                            iCharAt6 = i47 | (cCharAt5 << i48);
                            i46 = i12;
                        }
                        int i49 = i46 + 1;
/* 16 */                iCharAt = str.charAt(i46);
                        if (iCharAt >= 55296) {
                            int i50 = iCharAt & 8191;
                            int i51 = 13;
                            while (true) {
                                i11 = i49 + 1;
/* 17 */                        cCharAt4 = str.charAt(i49);
                                if (cCharAt4 < 55296) {
                                    break;
                                }
                                i50 |= (cCharAt4 & 8191) << i51;
                                i51 += 13;
                                i49 = i11;
                            }
                            iCharAt = i50 | (cCharAt4 << i51);
                            i49 = i11;
                        }
                        int i52 = i49 + 1;
/* 18 */                int iCharAt7 = str.charAt(i49);
                        if (iCharAt7 >= 55296) {
                            int i53 = iCharAt7 & 8191;
                            int i54 = 13;
                            while (true) {
                                i10 = i52 + 1;
/* 19 */                        cCharAt3 = str.charAt(i52);
                                if (cCharAt3 < 55296) {
                                    break;
                                }
                                i53 |= (cCharAt3 & 8191) << i54;
                                i54 += 13;
                                i52 = i10;
                            }
                            iCharAt7 = i53 | (cCharAt3 << i54);
                            i52 = i10;
                        }
                        int i55 = i52 + 1;
/* 20 */                int iCharAt8 = str.charAt(i52);
                        if (iCharAt8 >= 55296) {
                            int i56 = iCharAt8 & 8191;
                            int i57 = 13;
                            while (true) {
                                i9 = i55 + 1;
/* 21 */                        cCharAt2 = str.charAt(i55);
                                if (cCharAt2 < 55296) {
                                    break;
                                }
                                i56 |= (cCharAt2 & 8191) << i57;
                                i57 += 13;
                                i55 = i9;
                            }
                            iCharAt8 = i56 | (cCharAt2 << i57);
                            i55 = i9;
                        }
                        int i58 = i55 + 1;
/* 22 */                int iCharAt9 = str.charAt(i55);
                        if (iCharAt9 >= 55296) {
                            int i59 = iCharAt9 & 8191;
                            int i60 = 13;
                            while (true) {
                                i8 = i58 + 1;
/* 23 */                        cCharAt = str.charAt(i58);
                                if (cCharAt < 55296) {
                                    break;
                                }
                                i59 |= (cCharAt & 8191) << i60;
                                i60 += 13;
                                i58 = i8;
                            }
                            iCharAt9 = i59 | (cCharAt << i60);
                            i58 = i8;
                        }
/* 24 */                int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
                        int i61 = (iCharAt3 * 2) + iCharAt4;
                        int i62 = iCharAt7;
                        i2 = iCharAt5;
                        i3 = i62;
                        i4 = iCharAt3;
                        i34 = i58;
                        iArr = iArr2;
                        i5 = iCharAt6;
                        i6 = i61;
                        i7 = iCharAt9;
                    }
/* 25 */            Unsafe unsafe = f16061o;
/* 26 */            Object[] objArr = t02Var.f16890c;
/* 28 */            Class<?> cls = t02Var.f16888a.getClass();
/* 29 */            int[] iArr3 = new int[iCharAt * 3];
/* 30 */            Object[] objArr2 = new Object[iCharAt * 2];
                    int i63 = i7 + i3;
                    int i64 = i63;
                    int i65 = i7;
                    int i66 = 0;
                    int i67 = 0;
                    while (i34 < length) {
                        int i68 = i34 + 1;
/* 31 */                int iCharAt10 = str.charAt(i34);
                        if (iCharAt10 >= i32) {
                            int i69 = iCharAt10 & 8191;
                            int i70 = i68;
                            int i71 = 13;
                            while (true) {
                                i30 = i70 + 1;
/* 32 */                        cCharAt12 = str.charAt(i70);
                                i16 = length;
                                if (cCharAt12 < 55296) {
                                    break;
                                }
                                i69 |= (cCharAt12 & 8191) << i71;
                                i71 += 13;
                                i70 = i30;
                                length = i16;
                            }
                            iCharAt10 = i69 | (cCharAt12 << i71);
                            i17 = i30;
                        } else {
                            i16 = length;
                            i17 = i68;
                        }
                        int i72 = i17 + 1;
/* 33 */                int iCharAt11 = str.charAt(i17);
                        Object[] objArr3 = objArr;
                        char c = 55296;
                        if (iCharAt11 >= 55296) {
                            int i73 = iCharAt11 & 8191;
                            int i74 = 13;
                            while (true) {
                                i29 = i72 + 1;
/* 34 */                        cCharAt11 = str.charAt(i72);
                                if (cCharAt11 < c) {
                                    break;
                                }
                                i73 |= (cCharAt11 & 8191) << i74;
                                i74 += 13;
                                i72 = i29;
                                c = 55296;
                            }
                            iCharAt11 = i73 | (cCharAt11 << i74);
                            i72 = i29;
                        }
                        int i75 = iCharAt11 & 255;
                        int i76 = iCharAt10;
                        if ((iCharAt11 & Segment.SHARE_MINIMUM) != 0) {
/* 35 */                    iArr[i66] = i67;
                            i66++;
                        }
                        int[] iArr4 = iArr3;
                        if (i75 >= 51) {
                            int i77 = i72 + 1;
/* 36 */                    int iCharAt12 = str.charAt(i72);
                            char c2 = 55296;
                            if (iCharAt12 >= 55296) {
                                int i78 = iCharAt12 & 8191;
                                int i79 = 13;
                                while (true) {
                                    i28 = i77 + 1;
/* 37 */                            cCharAt10 = str.charAt(i77);
                                    if (cCharAt10 < c2) {
                                        break;
                                    }
                                    i78 |= (cCharAt10 & 8191) << i79;
                                    i79 += 13;
                                    i77 = i28;
                                    c2 = 55296;
                                }
                                iCharAt12 = i78 | (cCharAt10 << i79);
                                i77 = i28;
                            }
                            int i80 = i75 - 51;
                            int i81 = i77;
                            if (i80 == 9 || i80 == 17) {
                                i25 = i6 + 1;
/* 40 */                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i6];
                            } else {
/* 38 */                        if (i80 == 12 && (AbstractC0886en.m3499c(t02Var.m8671a(), 1) || (iCharAt11 & 2048) != 0)) {
                                    i25 = i6 + 1;
/* 39 */                            objArr2[((i67 / 3) * 2) + 1] = objArr3[i6];
                                }
                                i26 = iCharAt12 * 2;
/* 41 */                        obj = objArr3[i26];
/* 42 */                        if (obj instanceof Field) {
/* 43 */                            fieldM8159E2 = (Field) obj;
                                } else {
/* 44 */                            fieldM8159E2 = m8159E(cls, (String) obj);
/* 45 */                            objArr3[i26] = fieldM8159E2;
                                }
/* 46 */                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM8159E2);
                                i27 = i26 + 1;
/* 47 */                        obj2 = objArr3[i27];
/* 48 */                        if (obj2 instanceof Field) {
/* 49 */                            fieldM8159E3 = (Field) obj2;
                                } else {
/* 50 */                            fieldM8159E3 = m8159E(cls, (String) obj2);
/* 51 */                            objArr3[i27] = fieldM8159E3;
                                }
/* 52 */                        int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM8159E3);
                                int i82 = i4;
                                iObjectFieldOffset2 = iObjectFieldOffset4;
                                i23 = iObjectFieldOffset3;
                                i18 = i82;
                                i22 = i6;
                                i20 = i81;
                                i21 = 0;
                                cls = cls;
                            }
                            i6 = i25;
                            i26 = iCharAt12 * 2;
/* 41 */                    obj = objArr3[i26];
/* 42 */                    if (obj instanceof Field) {
/* 43 */                        fieldM8159E2 = (Field) obj;
                            } else {
/* 44 */                        fieldM8159E2 = m8159E(cls, (String) obj);
/* 45 */                        objArr3[i26] = fieldM8159E2;
                            }
/* 46 */                    int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldM8159E2);
                            i27 = i26 + 1;
/* 47 */                    obj2 = objArr3[i27];
/* 48 */                    if (obj2 instanceof Field) {
/* 49 */                        fieldM8159E3 = (Field) obj2;
                            } else {
/* 50 */                        fieldM8159E3 = m8159E(cls, (String) obj2);
/* 51 */                        objArr3[i27] = fieldM8159E3;
                            }
/* 52 */                    int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldM8159E3);
                            int i83 = i4;
                            iObjectFieldOffset2 = iObjectFieldOffset6;
                            i23 = iObjectFieldOffset5;
                            i18 = i83;
                            i22 = i6;
                            i20 = i81;
                            i21 = 0;
                            cls = cls;
                        } else {
                            int i84 = i6 + 1;
/* 53 */                    Field fieldM8159E4 = m8159E(cls, (String) objArr3[i6]);
                            if (i75 == 9 || i75 == 17) {
                                i18 = i4;
/* 60 */                        objArr2[((i67 / 3) * 2) + 1] = fieldM8159E4.getType();
                            } else {
                                if (i75 == 27 || i75 == 49) {
                                    i18 = i4;
                                    i24 = i6 + 2;
/* 59 */                            objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                                } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                                    i18 = i4;
/* 57 */                            if (t02Var.m8671a() == 1 || (iCharAt11 & 2048) != 0) {
                                        i24 = i6 + 2;
/* 58 */                                objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                                    }
/* 61 */                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM8159E4);
                                    if ((iCharAt11 & 4096) != 0 || i75 > 17) {
                                        iObjectFieldOffset2 = 1048575;
                                        i20 = i72;
                                        i21 = 0;
                                    } else {
                                        int i85 = i72 + 1;
/* 62 */                                int iCharAt13 = str.charAt(i72);
                                        if (iCharAt13 >= 55296) {
                                            int i86 = iCharAt13 & 8191;
                                            int i87 = 13;
                                            while (true) {
                                                i20 = i85 + 1;
/* 63 */                                        cCharAt9 = str.charAt(i85);
                                                if (cCharAt9 < 55296) {
                                                    break;
                                                }
                                                i86 |= (cCharAt9 & 8191) << i87;
                                                i87 += 13;
                                                i85 = i20;
                                            }
                                            iCharAt13 = i86 | (cCharAt9 << i87);
                                        } else {
                                            i20 = i85;
                                        }
/* 64 */                                int i88 = (iCharAt13 / 32) + (i18 * 2);
/* 65 */                                Object obj3 = objArr3[i88];
/* 66 */                                if (obj3 instanceof Field) {
/* 67 */                                    fieldM8159E = (Field) obj3;
                                        } else {
/* 68 */                                    fieldM8159E = m8159E(cls, (String) obj3);
/* 69 */                                    objArr3[i88] = fieldM8159E;
                                        }
/* 70 */                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM8159E);
/* 71 */                                i21 = iCharAt13 % 32;
                                    }
                                    if (i75 >= 18 || i75 > 49) {
                                        i22 = i19;
                                        i23 = iObjectFieldOffset;
                                    } else {
/* 72 */                                iArr[i64] = iObjectFieldOffset;
                                        i22 = i19;
                                        i23 = iObjectFieldOffset;
                                        i64++;
                                    }
                                } else {
                                    if (i75 == 50) {
                                        int i89 = i65 + 1;
/* 54 */                                iArr[i65] = i67;
/* 55 */                                int i90 = (i67 / 3) * 2;
                                        int i91 = i6 + 2;
                                        objArr2[i90] = objArr3[i84];
                                        if ((iCharAt11 & 2048) != 0) {
                                            i19 = i6 + 3;
/* 56 */                                    objArr2[i90 + 1] = objArr3[i91];
                                            i18 = i4;
                                            i65 = i89;
                                        } else {
                                            i19 = i91;
                                            i65 = i89;
                                            i18 = i4;
                                        }
                                    } else {
                                        i18 = i4;
                                    }
/* 61 */                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM8159E4);
                                    if ((iCharAt11 & 4096) != 0) {
                                        iObjectFieldOffset2 = 1048575;
                                        i20 = i72;
                                        i21 = 0;
                                    } else {
                                        iObjectFieldOffset2 = 1048575;
                                        i20 = i72;
                                        i21 = 0;
                                    }
                                    if (i75 >= 18) {
                                        i22 = i19;
                                        i23 = iObjectFieldOffset;
                                    } else {
                                        i22 = i19;
                                        i23 = iObjectFieldOffset;
                                    }
                                }
                                i19 = i24;
/* 61 */                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM8159E4);
                                if ((iCharAt11 & 4096) != 0) {
                                    iObjectFieldOffset2 = 1048575;
                                    i20 = i72;
                                    i21 = 0;
                                } else {
                                    iObjectFieldOffset2 = 1048575;
                                    i20 = i72;
                                    i21 = 0;
                                }
                                if (i75 >= 18) {
                                    i22 = i19;
                                    i23 = iObjectFieldOffset;
                                } else {
                                    i22 = i19;
                                    i23 = iObjectFieldOffset;
                                }
                            }
                            i19 = i84;
/* 61 */                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM8159E4);
                            if ((iCharAt11 & 4096) != 0) {
                                iObjectFieldOffset2 = 1048575;
                                i20 = i72;
                                i21 = 0;
                            } else {
                                iObjectFieldOffset2 = 1048575;
                                i20 = i72;
                                i21 = 0;
                            }
                            if (i75 >= 18) {
                                i22 = i19;
                                i23 = iObjectFieldOffset;
                            } else {
                                i22 = i19;
                                i23 = iObjectFieldOffset;
                            }
                        }
                        int i92 = i67 + 1;
/* 73 */                iArr4[i67] = i76;
                        int i93 = i67 + 2;
                        String str2 = str;
/* 74 */                iArr4[i92] = ((iCharAt11 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? 536870912 : 0) | ((iCharAt11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i23;
                        i67 += 3;
/* 75 */                iArr4[i93] = (i21 << 20) | iObjectFieldOffset2;
                        cls = cls;
                        objArr = objArr3;
                        str = str2;
                        length = i16;
                        i4 = i18;
                        i34 = i20;
                        i32 = 55296;
                        i6 = i22;
                        iArr3 = iArr4;
                    }
/* 78 */            return new rh1(iArr3, objArr2, i2, i5, t02Var.f16888a, iArr, i7, i63, hn1Var, d81Var, ux2Var, gg0Var, ic1Var);
                }

                /* JADX INFO: renamed from: w */
                public static long m8163w(int i) {
/* 5 */             return i & 1048575;
                }

                /* JADX INFO: renamed from: x */
                public static int m8164x(Object obj, long j) {
/* 9 */             return ((Integer) ny2.f14568c.m6580h(obj, j)).intValue();
                }

                /* JADX INFO: renamed from: y */
                public static long m8165y(Object obj, long j) {
/* 9 */             return ((Long) ny2.f14568c.m6580h(obj, j)).longValue();
                }

                /* JADX INFO: renamed from: A */
                public final void m8166A(Object obj, long j, C1771iw c1771iw, i72 i72Var, eg0 eg0Var) throws oz0 {
                    int iMo3246C;
/* 3 */             this.f16072k.getClass();
/* 6 */             dz0 dz0VarM2961a = d81.m2961a(obj, j);
/* 12 */            AbstractC1006hw abstractC1006hw = (AbstractC1006hw) c1771iw.f11948e;
/* 14 */            int i = c1771iw.f11945b;
/* 19 */            if ((i & 7) != 3) {
/* 61 */                throw qz0.m8030b();
                    }
/* 52 */            do {
/* 21 */                tq0 tq0VarNewInstance = i72Var.newInstance();
/* 25 */                c1771iw.m5587e(tq0VarNewInstance, i72Var, eg0Var);
/* 28 */                i72Var.mo4492b(tq0VarNewInstance);
/* 34 */                ((ez1) dz0VarM2961a).add(tq0VarNewInstance);
/* 41 */                if (abstractC1006hw.mo3257g() || c1771iw.f11947d != 0) {
/* 56 */                    return;
                        } else {
/* 48 */                    iMo3246C = abstractC1006hw.mo3246C();
                        }
/* 52 */            } while (iMo3246C == i);
/* 54 */            c1771iw.f11947d = iMo3246C;
                }

                /* JADX INFO: renamed from: B */
                public final void m8167B(Object obj, int i, C1771iw c1771iw, i72 i72Var, eg0 eg0Var) throws qz0 {
                    int iMo3246C;
/* 8 */             this.f16072k.getClass();
/* 11 */            dz0 dz0VarM2961a = d81.m2961a(obj, i & 1048575);
/* 17 */            AbstractC1006hw abstractC1006hw = (AbstractC1006hw) c1771iw.f11948e;
/* 19 */            int i2 = c1771iw.f11945b;
/* 24 */            if ((i2 & 7) != 2) {
/* 66 */                throw qz0.m8030b();
                    }
/* 57 */            do {
/* 26 */                tq0 tq0VarNewInstance = i72Var.newInstance();
/* 30 */                c1771iw.m5589g(tq0VarNewInstance, i72Var, eg0Var);
/* 33 */                i72Var.mo4492b(tq0VarNewInstance);
/* 39 */                ((ez1) dz0VarM2961a).add(tq0VarNewInstance);
/* 46 */                if (abstractC1006hw.mo3257g() || c1771iw.f11947d != 0) {
/* 61 */                    return;
                        } else {
/* 53 */                    iMo3246C = abstractC1006hw.mo3246C();
                        }
/* 57 */            } while (iMo3246C == i2);
/* 59 */            c1771iw.f11947d = iMo3246C;
                }

                /* JADX INFO: renamed from: C */
                public final void m8168C(int i, C1771iw c1771iw, Object obj) throws oz0, nz0 {
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) c1771iw.f11948e;
/* 12 */            if ((536870912 & i) != 0) {
/* 17 */                c1771iw.m5581R(2);
/* 24 */                ny2.m7083o(obj, i & 1048575, abstractC1006hw.mo3245B());
                    } else if (!this.f16067f) {
/* 53 */                ny2.m7083o(obj, i & 1048575, c1771iw.m5592j());
                    } else {
/* 35 */                c1771iw.m5581R(2);
/* 42 */                ny2.m7083o(obj, i & 1048575, abstractC1006hw.mo3244A());
                    }
                }

                /* JADX INFO: renamed from: D */
                public final void m8169D(int i, C1771iw c1771iw, Object obj) throws oz0, nz0 {
/* 10 */            boolean z = (536870912 & i) != 0;
/* 14 */            d81 d81Var = this.f16072k;
/* 16 */            if (z) {
/* 20 */                d81Var.getClass();
/* 27 */                c1771iw.m5574K(d81.m2961a(obj, i & 1048575), true);
                    } else {
/* 33 */                d81Var.getClass();
/* 40 */                c1771iw.m5574K(d81.m2961a(obj, i & 1048575), false);
                    }
                }

                /* JADX INFO: renamed from: F */
                public final void m8170F(int i, Object obj) {
/* 5 */             int i2 = this.f16062a[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 32 */            ny2.m7081m(obj, (1 << (i2 >>> 20)) | ny2.f14568c.m6578f(obj, j), j);
                }

                /* JADX INFO: renamed from: G */
                public final void m8171G(int i, Object obj, int i2) {
/* 12 */            ny2.m7081m(obj, i, this.f16062a[i2 + 2] & 1048575);
                }

                /* JADX INFO: renamed from: H */
                public final void m8172H(Object obj, int i, AbstractC2350x abstractC2350x) {
/* 12 */            f16061o.putObject(obj, m8174K(i) & 1048575, abstractC2350x);
/* 15 */            m8170F(i, obj);
                }

                /* JADX INFO: renamed from: I */
                public final void m8173I(Object obj, int i, int i2, AbstractC2350x abstractC2350x) {
/* 12 */            f16061o.putObject(obj, m8174K(i2) & 1048575, abstractC2350x);
/* 15 */            m8171G(i, obj, i2);
                }

                /* JADX INFO: renamed from: K */
                public final int m8174K(int i) {
/* 5 */             return this.f16062a[i + 1];
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX INFO: renamed from: L */
                public final void m8175L(Object obj, gr0 gr0Var) throws IOException {
                    int i;
                    int i2;
                    boolean z;
/* 1 */             rh1 rh1Var = this;
/* 7 */             int[] iArr = rh1Var.f16062a;
/* 9 */             int length = iArr.length;
/* 10 */            Unsafe unsafe = f16061o;
/* 12 */            int i3 = 1048575;
/* 15 */            int i4 = 1048575;
/* 16 */            int i5 = 0;
/* 17 */            int i6 = 0;
/* 18 */            while (i5 < length) {
/* 20 */                int iM8174K = rh1Var.m8174K(i5);
/* 24 */                int i7 = iArr[i5];
/* 26 */                int iM8160J = m8160J(iM8174K);
/* 33 */                if (iM8160J <= 17) {
/* 37 */                    int i8 = iArr[i5 + 2];
/* 39 */                    int i9 = i8 & i3;
/* 41 */                    if (i9 != i4) {
/* 48 */                        i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
/* 53 */                        i4 = i9;
                            }
/* 56 */                    i = 1 << (i8 >>> 20);
                        } else {
/* 65 */                    i = 0;
                        }
/* 66 */                long j = iM8174K & i3;
                        switch (iM8160J) {
                            case 0:
/* 1590 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1594 */                          double dMo4395d = ny2.f14568c.mo4395d(obj, j);
/* 1600 */                          C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 1602 */                          c1905lw.getClass();
/* 1609 */                          c1905lw.m6564t(i7, Double.doubleToRawLongBits(dMo4395d));
                                }
                                break;
                            case 1:
/* 1561 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1565 */                          float fMo4396e = ny2.f14568c.mo4396e(obj, j);
/* 1571 */                          C1905lw c1905lw2 = (C1905lw) gr0Var.f8789a;
/* 1573 */                          c1905lw2.getClass();
/* 1580 */                          c1905lw2.m6562r(i7, Float.floatToRawIntBits(fMo4396e));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case 2:
/* 1541 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1551 */                          ((C1905lw) gr0Var.f8789a).m6548E(i7, unsafe.getLong(obj, j));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case 3:
/* 1521 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1531 */                          ((C1905lw) gr0Var.f8789a).m6548E(i7, unsafe.getLong(obj, j));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case 4:
/* 1501 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1511 */                          ((C1905lw) gr0Var.f8789a).m6566v(i7, unsafe.getInt(obj, j));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case 5:
/* 1481 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1491 */                          ((C1905lw) gr0Var.f8789a).m6564t(i7, unsafe.getLong(obj, j));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case 6:
/* 1461 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1471 */                          ((C1905lw) gr0Var.f8789a).m6562r(i7, unsafe.getInt(obj, j));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case 7:
/* 1439 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1451 */                          ((C1905lw) gr0Var.f8789a).m6559o(i7, ny2.f14568c.mo4394c(obj, j));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case 8:
/* 1402 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1404 */                          Object object = unsafe.getObject(obj, j);
/* 1410 */                          if (object instanceof String) {
/* 1418 */                              ((C1905lw) gr0Var.f8789a).m6570z(i7, (String) object);
                                    } else {
/* 1429 */                              ((C1905lw) gr0Var.f8789a).m6560p(i7, (C2259ul) object);
                                    }
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case 9:
/* 1376 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1392 */                          ((C1905lw) gr0Var.f8789a).m6569y(i7, (AbstractC2350x) unsafe.getObject(obj, j), rh1Var.m8179l(i5));
                                }
                                break;
                            case 10:
/* 1355 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1367 */                          ((C1905lw) gr0Var.f8789a).m6560p(i7, (C2259ul) unsafe.getObject(obj, j));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case 11:
/* 1336 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1346 */                          ((C1905lw) gr0Var.f8789a).m6546C(i7, unsafe.getInt(obj, j));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case 12:
/* 1317 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1327 */                          ((C1905lw) gr0Var.f8789a).m6566v(i7, unsafe.getInt(obj, j));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1298 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1308 */                          ((C1905lw) gr0Var.f8789a).m6562r(i7, unsafe.getInt(obj, j));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case 14:
/* 1279 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1289 */                          ((C1905lw) gr0Var.f8789a).m6564t(i7, unsafe.getLong(obj, j));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1255 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1257 */                          int i10 = unsafe.getInt(obj, j);
/* 1270 */                          ((C1905lw) gr0Var.f8789a).m6546C(i7, (i10 >> 31) ^ (i10 << 1));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case 16:
/* 1228 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1230 */                          long j2 = unsafe.getLong(obj, j);
/* 1243 */                          ((C1905lw) gr0Var.f8789a).m6548E(i7, (j2 >> 63) ^ (j2 << 1));
                                }
/* 1246 */                      rh1Var = this;
                                break;
                            case 17:
/* 1208 */                      if (rh1Var.m8181n(obj, i5, i4, i6, i)) {
/* 1218 */                          gr0Var.m4004v(i7, unsafe.getObject(obj, j), rh1Var.m8179l(i5));
                                }
                                break;
                            case 18:
/* 1187 */                      i4 = i4;
/* 1198 */                      n72.m6930n(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case 19:
/* 1171 */                      i4 = i4;
/* 1182 */                      n72.m6934r(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case 20:
/* 1155 */                      i4 = i4;
/* 1166 */                      n72.m6936t(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 1139 */                      i4 = i4;
/* 1150 */                      n72.m6942z(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 1123 */                      i4 = i4;
/* 1134 */                      n72.m6935s(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 1107 */                      i4 = i4;
/* 1118 */                      n72.m6933q(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case 24:
/* 1091 */                      i4 = i4;
/* 1102 */                      n72.m6932p(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 1075 */                      i4 = i4;
/* 1086 */                      n72.m6929m(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 1029 */                      i2 = i4;
/* 1031 */                      int i11 = iArr[i5];
/* 1037 */                      List list = (List) unsafe.getObject(obj, j);
/* 1039 */                      Class cls = n72.f14156a;
/* 1041 */                      if (list != null && !list.isEmpty()) {
/* 1049 */                          gr0Var.getClass();
/* 1057 */                          for (int i12 = 0; i12 < list.size(); i12++) {
/* 1069 */                              ((C1905lw) gr0Var.f8789a).m6570z(i11, (String) list.get(i12));
                                    }
                                }
/* 586 */                       i4 = i2;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 979 */                       i2 = i4;
/* 981 */                       int i13 = iArr[i5];
/* 987 */                       List list2 = (List) unsafe.getObject(obj, j);
/* 989 */                       i72 i72VarM8179l = rh1Var.m8179l(i5);
/* 993 */                       Class cls2 = n72.f14156a;
/* 995 */                       if (list2 != null && !list2.isEmpty()) {
/* 1003 */                          gr0Var.getClass();
/* 1011 */                          for (int i14 = 0; i14 < list2.size(); i14++) {
/* 1023 */                              ((C1905lw) gr0Var.f8789a).m6569y(i13, (AbstractC2350x) list2.get(i14), i72VarM8179l);
                                    }
                                }
/* 586 */                       i4 = i2;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 933 */                       i2 = i4;
/* 935 */                       int i15 = iArr[i5];
/* 941 */                       List list3 = (List) unsafe.getObject(obj, j);
/* 943 */                       Class cls3 = n72.f14156a;
/* 945 */                       if (list3 != null && !list3.isEmpty()) {
/* 953 */                           gr0Var.getClass();
/* 961 */                           for (int i16 = 0; i16 < list3.size(); i16++) {
/* 973 */                               ((C1905lw) gr0Var.f8789a).m6560p(i15, (C2259ul) list3.get(i16));
                                    }
                                }
/* 586 */                       i4 = i2;
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 920 */                       z = false;
/* 929 */                       n72.m6941y(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 905 */                       z = false;
/* 914 */                       n72.m6931o(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 890 */                       z = false;
/* 899 */                       n72.m6937u(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case 32:
/* 875 */                       z = false;
/* 884 */                       n72.m6938v(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 860 */                       z = false;
/* 869 */                       n72.m6939w(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 849 */                       z = false;
/* 850 */                       n72.m6940x(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, false);
/* 854 */                       i4 = i4;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 824 */                       i2 = i4;
/* 834 */                       n72.m6930n(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 809 */                       i2 = i4;
/* 819 */                       n72.m6934r(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case 37:
/* 794 */                       i2 = i4;
/* 804 */                       n72.m6936t(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case 38:
/* 779 */                       i2 = i4;
/* 789 */                       n72.m6942z(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case 39:
/* 764 */                       i2 = i4;
/* 774 */                       n72.m6935s(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 749 */                       i2 = i4;
/* 759 */                       n72.m6933q(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 734 */                       i2 = i4;
/* 744 */                       n72.m6932p(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case 42:
/* 719 */                       i2 = i4;
/* 729 */                       n72.m6929m(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case 43:
/* 704 */                       i2 = i4;
/* 714 */                       n72.m6941y(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case 44:
/* 690 */                       i2 = i4;
/* 700 */                       n72.m6931o(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case 45:
/* 676 */                       i2 = i4;
/* 686 */                       n72.m6937u(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case 46:
/* 662 */                       i2 = i4;
/* 672 */                       n72.m6938v(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case 47:
/* 648 */                       i2 = i4;
/* 658 */                       n72.m6939w(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case 48:
/* 634 */                       i2 = i4;
/* 644 */                       n72.m6940x(iArr[i5], (List) unsafe.getObject(obj, j), gr0Var, true);
/* 586 */                       i4 = i2;
                                break;
                            case 49:
/* 590 */                       i2 = i4;
/* 592 */                       int i17 = iArr[i5];
/* 598 */                       List list4 = (List) unsafe.getObject(obj, j);
/* 600 */                       i72 i72VarM8179l2 = rh1Var.m8179l(i5);
/* 604 */                       Class cls4 = n72.f14156a;
/* 606 */                       if (list4 != null && !list4.isEmpty()) {
/* 614 */                           gr0Var.getClass();
/* 622 */                           for (int i18 = 0; i18 < list4.size(); i18++) {
/* 628 */                               gr0Var.m4004v(i17, list4.get(i18), i72VarM8179l2);
                                    }
                                }
/* 586 */                       i4 = i2;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 486 */                       Object object2 = unsafe.getObject(obj, j);
/* 490 */                       if (object2 != null) {
/* 494 */                           int i19 = 2;
/* 498 */                           Object obj2 = rh1Var.f16063b[(i5 / 3) * 2];
/* 502 */                           rh1Var.f16074m.getClass();
/* 507 */                           ac1 ac1Var = ((bc1) obj2).f2364a;
/* 513 */                           C1905lw c1905lw3 = (C1905lw) gr0Var.f8789a;
/* 515 */                           c1905lw3.getClass();
/* 530 */                           for (Map.Entry entry : ((gc1) object2).entrySet()) {
/* 538 */                               c1905lw3.m6545B(i7, i19);
/* 553 */                               c1905lw3.m6547D(bc1.m1331a(ac1Var, entry.getKey(), entry.getValue()));
/* 556 */                               Object key = entry.getKey();
/* 560 */                               Object value = entry.getValue();
/* 570 */                               fh0.m3762b(c1905lw3, (y83) ac1Var.f177b, 1, key);
/* 577 */                               i19 = 2;
/* 578 */                               fh0.m3762b(c1905lw3, (y83) ac1Var.f178c, 2, value);
/* 581 */                               i4 = i4;
                                    }
                                }
/* 584 */                       i2 = i4;
/* 586 */                       i4 = i2;
                                break;
                            case 51:
/* 456 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 466 */                           double dDoubleValue = ((Double) ny2.f14568c.m6580h(obj, j)).doubleValue();
/* 472 */                           C1905lw c1905lw4 = (C1905lw) gr0Var.f8789a;
/* 474 */                           c1905lw4.getClass();
/* 481 */                           c1905lw4.m6564t(i7, Double.doubleToRawLongBits(dDoubleValue));
                                }
                                break;
                            case 52:
/* 422 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 432 */                           float fFloatValue = ((Float) ny2.f14568c.m6580h(obj, j)).floatValue();
/* 438 */                           C1905lw c1905lw5 = (C1905lw) gr0Var.f8789a;
/* 440 */                           c1905lw5.getClass();
/* 447 */                           c1905lw5.m6562r(i7, Float.floatToRawIntBits(fFloatValue));
                                }
                                break;
                            case 53:
/* 403 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 413 */                           ((C1905lw) gr0Var.f8789a).m6548E(i7, m8165y(obj, j));
                                }
                                break;
                            case 54:
/* 384 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 394 */                           ((C1905lw) gr0Var.f8789a).m6548E(i7, m8165y(obj, j));
                                }
                                break;
                            case 55:
/* 365 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 375 */                           ((C1905lw) gr0Var.f8789a).m6566v(i7, m8164x(obj, j));
                                }
                                break;
                            case 56:
/* 346 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 356 */                           ((C1905lw) gr0Var.f8789a).m6564t(i7, m8165y(obj, j));
                                }
                                break;
                            case 57:
/* 327 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 337 */                           ((C1905lw) gr0Var.f8789a).m6562r(i7, m8164x(obj, j));
                                }
                                break;
                            case 58:
/* 300 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 318 */                           ((C1905lw) gr0Var.f8789a).m6559o(i7, ((Boolean) ny2.f14568c.m6580h(obj, j)).booleanValue());
                                }
                                break;
                            case 59:
/* 264 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 266 */                           Object object3 = unsafe.getObject(obj, j);
/* 272 */                           if (object3 instanceof String) {
/* 280 */                               ((C1905lw) gr0Var.f8789a).m6570z(i7, (String) object3);
                                    } else {
/* 291 */                               ((C1905lw) gr0Var.f8789a).m6560p(i7, (C2259ul) object3);
                                    }
                                }
                                break;
                            case 60:
/* 239 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 255 */                           ((C1905lw) gr0Var.f8789a).m6569y(i7, (AbstractC2350x) unsafe.getObject(obj, j), rh1Var.m8179l(i5));
                                }
                                break;
                            case 61:
/* 218 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 230 */                           ((C1905lw) gr0Var.f8789a).m6560p(i7, (C2259ul) unsafe.getObject(obj, j));
                                }
                                break;
                            case 62:
/* 199 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 209 */                           ((C1905lw) gr0Var.f8789a).m6546C(i7, m8164x(obj, j));
                                }
                                break;
                            case 63:
/* 181 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 191 */                           ((C1905lw) gr0Var.f8789a).m6566v(i7, m8164x(obj, j));
                                }
                                break;
                            case 64:
/* 163 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 173 */                           ((C1905lw) gr0Var.f8789a).m6562r(i7, m8164x(obj, j));
                                }
                                break;
                            case 65:
/* 145 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 155 */                           ((C1905lw) gr0Var.f8789a).m6564t(i7, m8165y(obj, j));
                                }
                                break;
                            case 66:
/* 122 */                       if (rh1Var.m8182p(i7, obj, i5)) {
/* 124 */                           int iM8164x = m8164x(obj, j);
/* 137 */                           ((C1905lw) gr0Var.f8789a).m6546C(i7, (iM8164x >> 31) ^ (iM8164x << 1));
                                }
                                break;
                            case 67:
/* 98 */                        if (rh1Var.m8182p(i7, obj, i5)) {
/* 100 */                           long jM8165y = m8165y(obj, j);
/* 114 */                           ((C1905lw) gr0Var.f8789a).m6548E(i7, (jM8165y << 1) ^ (jM8165y >> 63));
                                }
                                break;
                            case 68:
/* 80 */                        if (rh1Var.m8182p(i7, obj, i5)) {
/* 90 */                            gr0Var.m4004v(i7, unsafe.getObject(obj, j), rh1Var.m8179l(i5));
                                }
                                break;
                            default:
                                break;
                        }
/* 1612 */              i5 += 3;
/* 1614 */              i3 = 1048575;
                    }
/* 1621 */          rh1Var.f16073l.getClass();
/* 1629 */          ((tq0) obj).unknownFields.m8660d(gr0Var);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:11:0x0025  */
                @Override // p000.i72
                /* JADX INFO: renamed from: a */
                public final void mo4491a(Object obj, Object obj2) {
                    Object obj3;
/* 5 */             if (!m8161o(obj)) {
/* 513 */               s80.m8430k(obj, "Mutating immutable message: ");
/* 516 */               return;
                    }
/* 7 */             obj2.getClass();
/* 10 */            int i = 0;
                    while (true) {
/* 11 */                int[] iArr = this.f16062a;
/* 14 */                if (i >= iArr.length) {
/* 506 */                   n72.m6927k(this.f16073l, obj, obj2);
/* 509 */                   return;
                        }
/* 16 */                int iM8174K = m8174K(i);
/* 23 */                long j = 1048575 & iM8174K;
/* 25 */                int i2 = iArr[i];
                        switch (m8160J(iM8174K)) {
                            case 0:
/* 483 */                       if (!m8180m(i, obj2)) {
/* 38 */                            obj3 = obj;
                                } else {
/* 485 */                           ly2 ly2Var = ny2.f14568c;
/* 491 */                           obj3 = obj;
/* 492 */                           ly2Var.mo4399l(obj3, j, ly2Var.mo4395d(obj2, j));
/* 495 */                           m8170F(i, obj3);
                                }
                                break;
                            case 1:
/* 463 */                       if (m8180m(i, obj2)) {
/* 465 */                           ly2 ly2Var2 = ny2.f14568c;
/* 471 */                           ly2Var2.mo4400m(obj, j, ly2Var2.mo4396e(obj2, j));
/* 474 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 2:
/* 443 */                       if (m8180m(i, obj2)) {
/* 451 */                           ny2.m7082n(obj, j, ny2.f14568c.m6579g(obj2, j));
/* 454 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 3:
/* 423 */                       if (m8180m(i, obj2)) {
/* 431 */                           ny2.m7082n(obj, j, ny2.f14568c.m6579g(obj2, j));
/* 434 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 4:
/* 403 */                       if (m8180m(i, obj2)) {
/* 411 */                           ny2.m7081m(obj, ny2.f14568c.m6578f(obj2, j), j);
/* 414 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 5:
/* 383 */                       if (m8180m(i, obj2)) {
/* 391 */                           ny2.m7082n(obj, j, ny2.f14568c.m6579g(obj2, j));
/* 394 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 6:
/* 363 */                       if (m8180m(i, obj2)) {
/* 371 */                           ny2.m7081m(obj, ny2.f14568c.m6578f(obj2, j), j);
/* 374 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 7:
/* 343 */                       if (m8180m(i, obj2)) {
/* 345 */                           ly2 ly2Var3 = ny2.f14568c;
/* 351 */                           ly2Var3.mo4397j(obj, j, ly2Var3.mo4394c(obj2, j));
/* 354 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 8:
/* 323 */                       if (m8180m(i, obj2)) {
/* 331 */                           ny2.m7083o(obj, j, ny2.f14568c.m6580h(obj2, j));
/* 334 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 9:
/* 314 */                       m8184r(i, obj, obj2);
/* 38 */                        obj3 = obj;
                                break;
                            case 10:
/* 298 */                       if (m8180m(i, obj2)) {
/* 306 */                           ny2.m7083o(obj, j, ny2.f14568c.m6580h(obj2, j));
/* 309 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 11:
/* 278 */                       if (m8180m(i, obj2)) {
/* 286 */                           ny2.m7081m(obj, ny2.f14568c.m6578f(obj2, j), j);
/* 289 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 12:
/* 258 */                       if (m8180m(i, obj2)) {
/* 266 */                           ny2.m7081m(obj, ny2.f14568c.m6578f(obj2, j), j);
/* 269 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 238 */                       if (m8180m(i, obj2)) {
/* 246 */                           ny2.m7081m(obj, ny2.f14568c.m6578f(obj2, j), j);
/* 249 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 14:
/* 218 */                       if (m8180m(i, obj2)) {
/* 226 */                           ny2.m7082n(obj, j, ny2.f14568c.m6579g(obj2, j));
/* 229 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 198 */                       if (m8180m(i, obj2)) {
/* 206 */                           ny2.m7081m(obj, ny2.f14568c.m6578f(obj2, j), j);
/* 209 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 16:
/* 178 */                       if (m8180m(i, obj2)) {
/* 186 */                           ny2.m7082n(obj, j, ny2.f14568c.m6579g(obj2, j));
/* 189 */                           m8170F(i, obj);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 17:
/* 169 */                       m8184r(i, obj, obj2);
/* 38 */                        obj3 = obj;
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case Build.API_LEVELS.API_21 /* 21 */:
                            case Build.API_LEVELS.API_22 /* 22 */:
                            case Build.API_LEVELS.API_23 /* 23 */:
                            case 24:
                            case Build.API_LEVELS.API_25 /* 25 */:
                            case Build.API_LEVELS.API_26 /* 26 */:
                            case Build.API_LEVELS.API_27 /* 27 */:
                            case Build.API_LEVELS.API_28 /* 28 */:
                            case Build.API_LEVELS.API_29 /* 29 */:
                            case Build.API_LEVELS.API_30 /* 30 */:
                            case Build.API_LEVELS.API_31 /* 31 */:
                            case 32:
                            case Build.API_LEVELS.API_33 /* 33 */:
                            case Build.API_LEVELS.API_34 /* 34 */:
                            case Build.API_LEVELS.API_35 /* 35 */:
                            case Build.API_LEVELS.API_36 /* 36 */:
                            case 37:
                            case 38:
                            case 39:
                            case RequestError.NETWORK_FAILURE /* 40 */:
                            case RequestError.NO_DEV_KEY /* 41 */:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
/* 110 */                       this.f16072k.getClass();
/* 113 */                       ly2 ly2Var4 = ny2.f14568c;
/* 119 */                       dz0 dz0VarM3618c = (dz0) ly2Var4.m6580h(obj, j);
/* 125 */                       dz0 dz0Var = (dz0) ly2Var4.m6580h(obj2, j);
/* 130 */                       int i3 = ((ez1) dz0VarM3618c).f7928c;
/* 135 */                       int i4 = ((ez1) dz0Var).f7928c;
/* 137 */                       if (i3 > 0 && i4 > 0) {
/* 146 */                           if (!((ez1) dz0VarM3618c).f7926a) {
/* 151 */                               dz0VarM3618c = ((ez1) dz0VarM3618c).m3618c(i4 + i3);
                                    }
/* 158 */                           ((ez1) dz0VarM3618c).addAll(dz0Var);
                                }
/* 161 */                       if (i3 > 0) {
/* 163 */                           dz0Var = dz0VarM3618c;
                                }
/* 164 */                       ny2.m7083o(obj, j, dz0Var);
/* 38 */                        obj3 = obj;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 83 */                        Class cls = n72.f14156a;
/* 85 */                        ly2 ly2Var5 = ny2.f14568c;
/* 87 */                        Object objM6580h = ly2Var5.m6580h(obj, j);
/* 91 */                        Object objM6580h2 = ly2Var5.m6580h(obj2, j);
/* 97 */                        this.f16074m.getClass();
/* 104 */                       ny2.m7083o(obj, j, ic1.m4517a(objM6580h, objM6580h2));
/* 38 */                        obj3 = obj;
                                break;
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
/* 68 */                        if (m8182p(i2, obj2, i)) {
/* 76 */                            ny2.m7083o(obj, j, ny2.f14568c.m6580h(obj2, j));
/* 79 */                            m8171G(i2, obj, i);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 60:
/* 60 */                        m8185s(i, obj, obj2);
/* 38 */                        obj3 = obj;
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
/* 45 */                        if (m8182p(i2, obj2, i)) {
/* 53 */                            ny2.m7083o(obj, j, ny2.f14568c.m6580h(obj2, j));
/* 56 */                            m8171G(i2, obj, i);
                                }
/* 38 */                        obj3 = obj;
                                break;
                            case 68:
/* 35 */                        m8185s(i, obj, obj2);
/* 38 */                        obj3 = obj;
                                break;
                            default:
/* 38 */                        obj3 = obj;
                                break;
                        }
/* 498 */               i += 3;
/* 500 */               obj = obj3;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:27:0x0080  */
                /* JADX WARN: Code duplicated, block: B:29:0x0086  */
                /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
                @Override // p000.i72
                /* JADX INFO: renamed from: b */
                public final void mo4492b(Object obj) {
/* 5 */             if (m8161o(obj)) {
/* 12 */                if (obj instanceof tq0) {
/* 15 */                    tq0 tq0Var = (tq0) obj;
/* 20 */                    tq0Var.m8861k(AbstractC0208c9.API_PRIORITY_OTHER);
/* 23 */                    tq0Var.memoizedHashCode = 0;
/* 25 */                    tq0Var.m8859h();
                        }
/* 28 */                int[] iArr = this.f16062a;
/* 30 */                int length = iArr.length;
/* 32 */                for (int i = 0; i < length; i += 3) {
/* 34 */                    int iM8174K = m8174K(i);
/* 41 */                    long j = 1048575 & iM8174K;
/* 43 */                    int iM8160J = m8160J(iM8174K);
/* 49 */                    if (iM8160J != 9) {
/* 53 */                        if (iM8160J != 60 && iM8160J != 68) {
                                    switch (iM8160J) {
                                        case 17:
/* 133 */                                   if (m8180m(i, obj)) {
/* 145 */                                       m8179l(i).mo4492b(f16061o.getObject(obj, j));
                                            }
                                            break;
                                        case 18:
                                        case 19:
                                        case 20:
                                        case Build.API_LEVELS.API_21 /* 21 */:
                                        case Build.API_LEVELS.API_22 /* 22 */:
                                        case Build.API_LEVELS.API_23 /* 23 */:
                                        case 24:
                                        case Build.API_LEVELS.API_25 /* 25 */:
                                        case Build.API_LEVELS.API_26 /* 26 */:
                                        case Build.API_LEVELS.API_27 /* 27 */:
                                        case Build.API_LEVELS.API_28 /* 28 */:
                                        case Build.API_LEVELS.API_29 /* 29 */:
                                        case Build.API_LEVELS.API_30 /* 30 */:
                                        case Build.API_LEVELS.API_31 /* 31 */:
                                        case 32:
                                        case Build.API_LEVELS.API_33 /* 33 */:
                                        case Build.API_LEVELS.API_34 /* 34 */:
                                        case Build.API_LEVELS.API_35 /* 35 */:
                                        case Build.API_LEVELS.API_36 /* 36 */:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case RequestError.NETWORK_FAILURE /* 40 */:
                                        case RequestError.NO_DEV_KEY /* 41 */:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
/* 87 */                                    this.f16072k.getClass();
/* 98 */                                    ez1 ez1Var = (ez1) ((dz0) ny2.f14568c.m6580h(obj, j));
/* 102 */                                   if (ez1Var.f7926a) {
/* 104 */                                       ez1Var.f7926a = false;
                                            }
                                            break;
                                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 63 */                                    Unsafe unsafe = f16061o;
/* 65 */                                    Object object = unsafe.getObject(obj, j);
/* 69 */                                    if (object != null) {
/* 73 */                                        this.f16074m.getClass();
/* 79 */                                        ((gc1) object).f8538a = false;
/* 81 */                                        unsafe.putObject(obj, j, object);
                                            }
                                            break;
                                    }
                                } else if (m8182p(iArr[i], obj, i)) {
/* 125 */                           m8179l(i).mo4492b(f16061o.getObject(obj, j));
                                }
                            } else if (m8180m(i, obj)) {
/* 145 */                       m8179l(i).mo4492b(f16061o.getObject(obj, j));
                            }
                        }
/* 153 */               this.f16073l.getClass();
/* 158 */               sx2 sx2Var = ((tq0) obj).unknownFields;
/* 162 */               if (sx2Var.f16863e) {
/* 164 */                   sx2Var.f16863e = false;
                        }
                    }
                }

                @Override // p000.i72
                /* JADX INFO: renamed from: c */
                public final boolean mo4493c(Object obj) {
                    int i;
                    int i2;
/* 9 */             int i3 = 1048575;
/* 10 */            int i4 = 0;
/* 11 */            int i5 = 0;
/* 15 */            while (i5 < this.f16069h) {
/* 19 */                int i6 = this.f16068g[i5];
/* 21 */                int[] iArr = this.f16062a;
/* 23 */                int i7 = iArr[i6];
/* 25 */                int iM8174K = m8174K(i6);
/* 31 */                int i8 = iArr[i6 + 2];
/* 33 */                int i9 = i8 & 1048575;
/* 37 */                int i10 = 1 << (i8 >>> 20);
/* 38 */                if (i9 != i3) {
/* 40 */                    if (i9 != 1048575) {
/* 45 */                        i4 = f16061o.getInt(obj, i9);
                            }
/* 50 */                    i2 = i4;
/* 51 */                    i = i9;
                        } else {
/* 53 */                    int i11 = i4;
/* 54 */                    i = i3;
/* 56 */                    i2 = i11;
                        }
/* 60 */                if ((268435456 & iM8174K) == 0 || m8181n(obj, i6, i, i2, i10)) {
/* 70 */                    int iM8160J = m8160J(iM8174K);
/* 76 */                    if (iM8160J == 9 || iM8160J == 17) {
/* 263 */                       if (m8181n(obj, i6, i, i2, i10)) {
/* 282 */                           if (!m8179l(i6).mo4493c(ny2.f14568c.m6580h(obj, iM8174K & 1048575))) {
                                    }
                                } else {
                                    continue;
                                }
/* 285 */                       i5++;
/* 287 */                       i3 = i;
/* 288 */                       i4 = i2;
                            } else {
/* 84 */                        if (iM8160J != 27) {
/* 88 */                            if (iM8160J == 60 || iM8160J == 68) {
/* 194 */                               if (m8182p(i7, obj, i6)) {
/* 213 */                                   if (!m8179l(i6).mo4493c(ny2.f14568c.m6580h(obj, iM8174K & 1048575))) {
                                            }
                                        } else {
                                            continue;
                                        }
/* 285 */                               i5++;
/* 287 */                               i3 = i;
/* 288 */                               i4 = i2;
                                    } else if (iM8160J != 49) {
/* 100 */                               if (iM8160J != 50) {
                                            continue;
                                        } else {
/* 109 */                                   Object objM6580h = ny2.f14568c.m6580h(obj, iM8174K & 1048575);
/* 115 */                                   this.f16074m.getClass();
/* 118 */                                   gc1 gc1Var = (gc1) objM6580h;
/* 124 */                                   if (gc1Var.isEmpty()) {
                                                continue;
                                            } else {
/* 148 */                                       if (((y83) ((bc1) this.f16063b[(i6 / 3) * 2]).f2364a.f178c).f19525a != z83.f19991w) {
                                                    continue;
                                                } else {
/* 160 */                                           i72 i72VarM2900a = null;
/* 165 */                                           for (Object obj2 : gc1Var.values()) {
/* 171 */                                               if (i72VarM2900a == null) {
/* 179 */                                                   i72VarM2900a = cz1.f6940c.m2900a(obj2.getClass());
                                                        }
/* 187 */                                               if (!i72VarM2900a.mo4493c(obj2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
/* 285 */                               i5++;
/* 287 */                               i3 = i;
/* 288 */                               i4 = i2;
                                    }
                                }
/* 225 */                       List list = (List) ny2.f14568c.m6580h(obj, iM8174K & 1048575);
/* 231 */                       if (list.isEmpty()) {
                                    continue;
                                } else {
/* 234 */                           i72 i72VarM8179l = m8179l(i6);
/* 243 */                           for (int i12 = 0; i12 < list.size(); i12++) {
/* 253 */                               if (i72VarM8179l.mo4493c(list.get(i12))) {
                                        }
                                    }
                                }
/* 285 */                       i5++;
/* 287 */                       i3 = i;
/* 288 */                       i4 = i2;
                            }
                        }
/* 8 */                 return false;
                    }
/* 14 */            return true;
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19221. Try increasing type updates limit count.
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                    */
                @Override // p000.i72
                /* JADX INFO: renamed from: d */
                public final void mo4494d(java.lang.Object r19, p000.C1771iw r20, p000.eg0 r21) {
                    /*
                        Method dump skipped, instruction units count: 1922
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.rh1.mo4494d(java.lang.Object, iw, eg0):void");
                }

                /* JADX WARN: Code duplicated, block: B:13:0x003d  */
                @Override // p000.i72
                /* JADX INFO: renamed from: e */
                public final boolean mo4495e(tq0 tq0Var, tq0 tq0Var2) {
/* 1 */             int[] iArr = this.f16062a;
/* 3 */             int length = iArr.length;
/* 5 */             int i = 0;
                    while (true) {
/* 6 */                 boolean zM6928l = true;
/* 7 */                 if (i < length) {
/* 9 */                     int iM8174K = m8174K(i);
/* 16 */                    long j = iM8174K & 1048575;
                            switch (m8160J(iM8174K)) {
                                case 0:
/* 471 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 473 */                               ly2 ly2Var = ny2.f14568c;
/* 493 */                               if (Double.doubleToLongBits(ly2Var.mo4395d(tq0Var, j)) != Double.doubleToLongBits(ly2Var.mo4395d(tq0Var2, j))) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 1:
/* 444 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 446 */                               ly2 ly2Var2 = ny2.f14568c;
/* 464 */                               if (Float.floatToIntBits(ly2Var2.mo4396e(tq0Var, j)) != Float.floatToIntBits(ly2Var2.mo4396e(tq0Var2, j))) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 2:
/* 423 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 425 */                               ly2 ly2Var3 = ny2.f14568c;
/* 437 */                               if (ly2Var3.m6579g(tq0Var, j) != ly2Var3.m6579g(tq0Var2, j)) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 3:
/* 402 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 404 */                               ly2 ly2Var4 = ny2.f14568c;
/* 416 */                               if (ly2Var4.m6579g(tq0Var, j) != ly2Var4.m6579g(tq0Var2, j)) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 4:
/* 383 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 385 */                               ly2 ly2Var5 = ny2.f14568c;
/* 395 */                               if (ly2Var5.m6578f(tq0Var, j) != ly2Var5.m6578f(tq0Var2, j)) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 5:
/* 361 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 363 */                               ly2 ly2Var6 = ny2.f14568c;
/* 375 */                               if (ly2Var6.m6579g(tq0Var, j) != ly2Var6.m6579g(tq0Var2, j)) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 6:
/* 341 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 343 */                               ly2 ly2Var7 = ny2.f14568c;
/* 353 */                               if (ly2Var7.m6578f(tq0Var, j) != ly2Var7.m6578f(tq0Var2, j)) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 7:
/* 321 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 323 */                               ly2 ly2Var8 = ny2.f14568c;
/* 333 */                               if (ly2Var8.mo4394c(tq0Var, j) != ly2Var8.mo4394c(tq0Var2, j)) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 8:
/* 297 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 299 */                               ly2 ly2Var9 = ny2.f14568c;
/* 313 */                               if (!n72.m6928l(ly2Var9.m6580h(tq0Var, j), ly2Var9.m6580h(tq0Var2, j))) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 9:
/* 273 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 275 */                               ly2 ly2Var10 = ny2.f14568c;
/* 289 */                               if (!n72.m6928l(ly2Var10.m6580h(tq0Var, j), ly2Var10.m6580h(tq0Var2, j))) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 10:
/* 249 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 251 */                               ly2 ly2Var11 = ny2.f14568c;
/* 265 */                               if (!n72.m6928l(ly2Var11.m6580h(tq0Var, j), ly2Var11.m6580h(tq0Var2, j))) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 11:
/* 229 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 231 */                               ly2 ly2Var12 = ny2.f14568c;
/* 241 */                               if (ly2Var12.m6578f(tq0Var, j) != ly2Var12.m6578f(tq0Var2, j)) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 12:
/* 209 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 211 */                               ly2 ly2Var13 = ny2.f14568c;
/* 221 */                               if (ly2Var13.m6578f(tq0Var, j) != ly2Var13.m6578f(tq0Var2, j)) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 189 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 191 */                               ly2 ly2Var14 = ny2.f14568c;
/* 201 */                               if (ly2Var14.m6578f(tq0Var, j) != ly2Var14.m6578f(tq0Var2, j)) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 14:
/* 167 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 169 */                               ly2 ly2Var15 = ny2.f14568c;
/* 181 */                               if (ly2Var15.m6579g(tq0Var, j) != ly2Var15.m6579g(tq0Var2, j)) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 147 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 149 */                               ly2 ly2Var16 = ny2.f14568c;
/* 159 */                               if (ly2Var16.m6578f(tq0Var, j) != ly2Var16.m6578f(tq0Var2, j)) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 16:
/* 125 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 127 */                               ly2 ly2Var17 = ny2.f14568c;
/* 139 */                               if (ly2Var17.m6579g(tq0Var, j) != ly2Var17.m6579g(tq0Var2, j)) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 17:
/* 101 */                           if (!m8176i(tq0Var, tq0Var2, i)) {
/* 62 */                                zM6928l = false;
                                    } else {
/* 103 */                               ly2 ly2Var18 = ny2.f14568c;
/* 117 */                               if (!n72.m6928l(ly2Var18.m6580h(tq0Var, j), ly2Var18.m6580h(tq0Var2, j))) {
/* 62 */                                    zM6928l = false;
                                        }
                                    }
                                    break;
                                case 18:
                                case 19:
                                case 20:
                                case Build.API_LEVELS.API_21 /* 21 */:
                                case Build.API_LEVELS.API_22 /* 22 */:
                                case Build.API_LEVELS.API_23 /* 23 */:
                                case 24:
                                case Build.API_LEVELS.API_25 /* 25 */:
                                case Build.API_LEVELS.API_26 /* 26 */:
                                case Build.API_LEVELS.API_27 /* 27 */:
                                case Build.API_LEVELS.API_28 /* 28 */:
                                case Build.API_LEVELS.API_29 /* 29 */:
                                case Build.API_LEVELS.API_30 /* 30 */:
                                case Build.API_LEVELS.API_31 /* 31 */:
                                case 32:
                                case Build.API_LEVELS.API_33 /* 33 */:
                                case Build.API_LEVELS.API_34 /* 34 */:
                                case Build.API_LEVELS.API_35 /* 35 */:
                                case Build.API_LEVELS.API_36 /* 36 */:
                                case 37:
                                case 38:
                                case 39:
                                case RequestError.NETWORK_FAILURE /* 40 */:
                                case RequestError.NO_DEV_KEY /* 41 */:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
/* 81 */                            ly2 ly2Var19 = ny2.f14568c;
/* 91 */                            zM6928l = n72.m6928l(ly2Var19.m6580h(tq0Var, j), ly2Var19.m6580h(tq0Var2, j));
                                    break;
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 65 */                            ly2 ly2Var20 = ny2.f14568c;
/* 75 */                            zM6928l = n72.m6928l(ly2Var20.m6580h(tq0Var, j), ly2Var20.m6580h(tq0Var2, j));
                                    break;
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                case 60:
                                case 61:
                                case 62:
                                case 63:
                                case 64:
                                case 65:
                                case 66:
                                case 67:
                                case 68:
/* 32 */                            long j2 = iArr[i + 2] & 1048575;
/* 34 */                            ly2 ly2Var21 = ny2.f14568c;
/* 44 */                            if (ly2Var21.m6578f(tq0Var, j2) != ly2Var21.m6578f(tq0Var2, j2) || !n72.m6928l(ly2Var21.m6580h(tq0Var, j), ly2Var21.m6580h(tq0Var2, j))) {
/* 62 */                                zM6928l = false;
                                    }
                                    break;
                            }
/* 495 */                   if (zM6928l) {
/* 498 */                       i += 3;
                            }
                        } else {
/* 504 */                   this.f16073l.getClass();
/* 515 */                   if (tq0Var.unknownFields.equals(tq0Var2.unknownFields)) {
/* 6 */                         return true;
                            }
                        }
                    }
/* 4 */             return false;
                }

                /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // p000.i72
                /* JADX INFO: renamed from: f */
                public final int mo4496f(tq0 tq0Var) {
                    int i;
                    int iM3859b;
                    int i2;
/* 1 */             int[] iArr = this.f16062a;
/* 3 */             int length = iArr.length;
/* 5 */             int i3 = 0;
/* 6 */             for (int i4 = 0; i4 < length; i4 += 3) {
/* 8 */                 int iM8174K = m8174K(i4);
/* 12 */                int i5 = iArr[i4];
/* 17 */                long j = 1048575 & iM8174K;
/* 23 */                int i6 = 1237;
/* 27 */                int iHashCode = 37;
                        switch (m8160J(iM8174K)) {
                            case 0:
/* 615 */                       i = i3 * 53;
/* 627 */                       iM3859b = fz0.m3859b(Double.doubleToLongBits(ny2.f14568c.mo4395d(tq0Var, j)));
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 1:
/* 601 */                       i = i3 * 53;
/* 609 */                       iM3859b = Float.floatToIntBits(ny2.f14568c.mo4396e(tq0Var, j));
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 2:
/* 587 */                       i = i3 * 53;
/* 595 */                       iM3859b = fz0.m3859b(ny2.f14568c.m6579g(tq0Var, j));
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 3:
/* 573 */                       i = i3 * 53;
/* 581 */                       iM3859b = fz0.m3859b(ny2.f14568c.m6579g(tq0Var, j));
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 4:
/* 563 */                       i = i3 * 53;
/* 567 */                       iM3859b = ny2.f14568c.m6578f(tq0Var, j);
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 5:
/* 549 */                       i = i3 * 53;
/* 557 */                       iM3859b = fz0.m3859b(ny2.f14568c.m6579g(tq0Var, j));
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 6:
/* 539 */                       i = i3 * 53;
/* 543 */                       iM3859b = ny2.f14568c.m6578f(tq0Var, j);
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 7:
/* 525 */                       i2 = i3 * 53;
/* 529 */                       boolean zMo4394c = ny2.f14568c.mo4394c(tq0Var, j);
/* 533 */                       Charset charset = fz0.f8401a;
/* 535 */                       if (zMo4394c) {
/* 226 */                           i6 = 1231;
                                }
/* 227 */                       i3 = i6 + i2;
                                break;
                            case 8:
/* 509 */                       i = i3 * 53;
/* 519 */                       iM3859b = ((String) ny2.f14568c.m6580h(tq0Var, j)).hashCode();
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 9:
/* 498 */                       Object objM6580h = ny2.f14568c.m6580h(tq0Var, j);
/* 502 */                       if (objM6580h != null) {
/* 504 */                           iHashCode = objM6580h.hashCode();
                                }
/* 411 */                       i3 = (i3 * 53) + iHashCode;
                                break;
                            case 10:
/* 482 */                       i = i3 * 53;
/* 490 */                       iM3859b = ny2.f14568c.m6580h(tq0Var, j).hashCode();
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 11:
/* 472 */                       i = i3 * 53;
/* 476 */                       iM3859b = ny2.f14568c.m6578f(tq0Var, j);
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 12:
/* 462 */                       i = i3 * 53;
/* 466 */                       iM3859b = ny2.f14568c.m6578f(tq0Var, j);
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 452 */                       i = i3 * 53;
/* 456 */                       iM3859b = ny2.f14568c.m6578f(tq0Var, j);
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 14:
/* 438 */                       i = i3 * 53;
/* 446 */                       iM3859b = fz0.m3859b(ny2.f14568c.m6579g(tq0Var, j));
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 428 */                       i = i3 * 53;
/* 432 */                       iM3859b = ny2.f14568c.m6578f(tq0Var, j);
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 16:
/* 414 */                       i = i3 * 53;
/* 422 */                       iM3859b = fz0.m3859b(ny2.f14568c.m6579g(tq0Var, j));
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 17:
/* 399 */                       Object objM6580h2 = ny2.f14568c.m6580h(tq0Var, j);
/* 403 */                       if (objM6580h2 != null) {
/* 405 */                           iHashCode = objM6580h2.hashCode();
                                }
/* 411 */                       i3 = (i3 * 53) + iHashCode;
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case Build.API_LEVELS.API_21 /* 21 */:
                            case Build.API_LEVELS.API_22 /* 22 */:
                            case Build.API_LEVELS.API_23 /* 23 */:
                            case 24:
                            case Build.API_LEVELS.API_25 /* 25 */:
                            case Build.API_LEVELS.API_26 /* 26 */:
                            case Build.API_LEVELS.API_27 /* 27 */:
                            case Build.API_LEVELS.API_28 /* 28 */:
                            case Build.API_LEVELS.API_29 /* 29 */:
                            case Build.API_LEVELS.API_30 /* 30 */:
                            case Build.API_LEVELS.API_31 /* 31 */:
                            case 32:
                            case Build.API_LEVELS.API_33 /* 33 */:
                            case Build.API_LEVELS.API_34 /* 34 */:
                            case Build.API_LEVELS.API_35 /* 35 */:
                            case Build.API_LEVELS.API_36 /* 36 */:
                            case 37:
                            case 38:
                            case 39:
                            case RequestError.NETWORK_FAILURE /* 40 */:
                            case RequestError.NO_DEV_KEY /* 41 */:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
/* 383 */                       i = i3 * 53;
/* 391 */                       iM3859b = ny2.f14568c.m6580h(tq0Var, j).hashCode();
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 369 */                       i = i3 * 53;
/* 377 */                       iM3859b = ny2.f14568c.m6580h(tq0Var, j).hashCode();
/* 52 */                        i3 = iM3859b + i;
                                break;
                            case 51:
/* 343 */                       if (m8182p(i5, tq0Var, i4)) {
/* 345 */                           i = i3 * 53;
/* 363 */                           iM3859b = fz0.m3859b(Double.doubleToLongBits(((Double) ny2.f14568c.m6580h(tq0Var, j)).doubleValue()));
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 52:
/* 317 */                       if (m8182p(i5, tq0Var, i4)) {
/* 319 */                           i = i3 * 53;
/* 333 */                           iM3859b = Float.floatToIntBits(((Float) ny2.f14568c.m6580h(tq0Var, j)).floatValue());
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 53:
/* 299 */                       if (m8182p(i5, tq0Var, i4)) {
/* 301 */                           i = i3 * 53;
/* 307 */                           iM3859b = fz0.m3859b(m8165y(tq0Var, j));
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 54:
/* 281 */                       if (m8182p(i5, tq0Var, i4)) {
/* 283 */                           i = i3 * 53;
/* 289 */                           iM3859b = fz0.m3859b(m8165y(tq0Var, j));
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 55:
/* 267 */                       if (m8182p(i5, tq0Var, i4)) {
/* 269 */                           i = i3 * 53;
/* 271 */                           iM3859b = m8164x(tq0Var, j);
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 56:
/* 249 */                       if (m8182p(i5, tq0Var, i4)) {
/* 251 */                           i = i3 * 53;
/* 257 */                           iM3859b = fz0.m3859b(m8165y(tq0Var, j));
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 57:
/* 235 */                       if (m8182p(i5, tq0Var, i4)) {
/* 237 */                           i = i3 * 53;
/* 239 */                           iM3859b = m8164x(tq0Var, j);
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 58:
/* 206 */                       if (m8182p(i5, tq0Var, i4)) {
/* 208 */                           i2 = i3 * 53;
/* 218 */                           boolean zBooleanValue = ((Boolean) ny2.f14568c.m6580h(tq0Var, j)).booleanValue();
/* 222 */                           Charset charset2 = fz0.f8401a;
/* 224 */                           if (zBooleanValue) {
/* 226 */                               i6 = 1231;
                                    }
/* 227 */                           i3 = i6 + i2;
                                }
                                break;
                            case 59:
/* 184 */                       if (m8182p(i5, tq0Var, i4)) {
/* 186 */                           i = i3 * 53;
/* 196 */                           iM3859b = ((String) ny2.f14568c.m6580h(tq0Var, j)).hashCode();
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 60:
/* 165 */                       if (m8182p(i5, tq0Var, i4)) {
/* 173 */                           i = i3 * 53;
/* 175 */                           iM3859b = ny2.f14568c.m6580h(tq0Var, j).hashCode();
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 61:
/* 146 */                       if (m8182p(i5, tq0Var, i4)) {
/* 148 */                           i = i3 * 53;
/* 156 */                           iM3859b = ny2.f14568c.m6580h(tq0Var, j).hashCode();
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 62:
/* 133 */                       if (m8182p(i5, tq0Var, i4)) {
/* 135 */                           i = i3 * 53;
/* 137 */                           iM3859b = m8164x(tq0Var, j);
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 63:
/* 120 */                       if (m8182p(i5, tq0Var, i4)) {
/* 122 */                           i = i3 * 53;
/* 124 */                           iM3859b = m8164x(tq0Var, j);
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 64:
/* 107 */                       if (m8182p(i5, tq0Var, i4)) {
/* 109 */                           i = i3 * 53;
/* 111 */                           iM3859b = m8164x(tq0Var, j);
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 65:
/* 90 */                        if (m8182p(i5, tq0Var, i4)) {
/* 92 */                            i = i3 * 53;
/* 98 */                            iM3859b = fz0.m3859b(m8165y(tq0Var, j));
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 66:
/* 77 */                        if (m8182p(i5, tq0Var, i4)) {
/* 79 */                            i = i3 * 53;
/* 81 */                            iM3859b = m8164x(tq0Var, j);
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 67:
/* 60 */                        if (m8182p(i5, tq0Var, i4)) {
/* 62 */                            i = i3 * 53;
/* 68 */                            iM3859b = fz0.m3859b(m8165y(tq0Var, j));
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                            case 68:
/* 38 */                        if (m8182p(i5, tq0Var, i4)) {
/* 46 */                            i = i3 * 53;
/* 48 */                            iM3859b = ny2.f14568c.m6580h(tq0Var, j).hashCode();
/* 52 */                            i3 = iM3859b + i;
                                }
                                break;
                        }
                    }
/* 641 */           this.f16073l.getClass();
/* 650 */           return tq0Var.unknownFields.hashCode() + (i3 * 53);
                }

                /* JADX WARN: Code duplicated, block: B:144:0x038c  */
                /* JADX WARN: Code duplicated, block: B:86:0x01cd  */
                @Override // p000.i72
                /* JADX INFO: renamed from: g */
                public final int mo4497g(tq0 tq0Var) {
                    int i;
                    int iM6541h;
                    int iM6541h2;
                    int iM6541h3;
                    int iM6543j;
                    int iM6541h4;
                    int iM6543j2;
                    int iM6541h5;
                    int iM6541h6;
                    int iM6539f;
                    int iM6541h7;
                    int iMo8856a;
                    int iM6919c;
                    int iM6541h8;
                    int size;
                    int iM6925i;
                    int iM6541h9;
                    int iM6541h10;
                    int size2;
                    int iM6541h11;
                    int iM6542i;
                    int iM6543j3;
                    int iMo8856a2;
                    int iM6541h12;
                    int iM6542i2;
/* 1 */             rh1 rh1Var = this;
/* 3 */             tq0 tq0Var2 = tq0Var;
/* 5 */             Unsafe unsafe = f16061o;
/* 10 */            int i2 = 1048575;
/* 11 */            int i3 = 0;
/* 12 */            int i4 = 0;
/* 13 */            int iM6539f2 = 0;
                    while (true) {
/* 14 */                int[] iArr = rh1Var.f16062a;
/* 17 */                if (i3 >= iArr.length) {
/* 1697 */                  rh1Var.f16073l.getClass();
/* 1706 */                  return tq0Var2.unknownFields.m8658b() + iM6539f2;
                        }
/* 19 */                int iM8174K = rh1Var.m8174K(i3);
/* 23 */                int iM8160J = m8160J(iM8174K);
/* 27 */                int i5 = iArr[i3];
/* 31 */                int i6 = iArr[i3 + 2];
/* 33 */                int i7 = i6 & 1048575;
/* 38 */                if (iM8160J <= 17) {
/* 40 */                    if (i7 != i2) {
/* 47 */                        i4 = i7 == 1048575 ? 0 : unsafe.getInt(tq0Var2, i7);
/* 52 */                        i2 = i7;
                            }
/* 55 */                    i = 1 << (i6 >>> 20);
                        } else {
/* 58 */                    i = 0;
                        }
/* 59 */                long j = iM8174K & 1048575;
/* 65 */                if (iM8160J >= hh0.f9077b.f9081a) {
/* 69 */                    int i8 = hh0.f9078c.f9081a;
                        }
                        switch (iM8160J) {
                            case 0:
/* 1683 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1685 */                          iM6541h = C1905lw.m6541h(i5);
/* 170 */                           iM6919c = iM6541h + 8;
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 1:
/* 1671 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1673 */                          iM6541h2 = C1905lw.m6541h(i5);
/* 1439 */                          iM6541h6 = iM6541h2 + 4;
/* 1422 */                          iM6539f2 += iM6541h6;
                                }
/* 1423 */                      rh1Var = this;
/* 1425 */                      tq0Var2 = tq0Var;
                                break;
                            case 2:
/* 1651 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1653 */                          long j2 = unsafe.getLong(tq0Var2, j);
/* 1657 */                          iM6541h3 = C1905lw.m6541h(i5);
/* 1661 */                          iM6543j = C1905lw.m6543j(j2);
/* 1379 */                          iM6539f2 += iM6543j + iM6541h3;
                                }
/* 1380 */                      rh1Var = this;
                                break;
                            case 3:
/* 1631 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1633 */                          long j3 = unsafe.getLong(tq0Var2, j);
/* 1637 */                          iM6541h3 = C1905lw.m6541h(i5);
/* 1641 */                          iM6543j = C1905lw.m6543j(j3);
/* 1379 */                          iM6539f2 += iM6543j + iM6541h3;
                                }
/* 1380 */                      rh1Var = this;
                                break;
                            case 4:
/* 1610 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1612 */                          int i9 = unsafe.getInt(tq0Var2, j);
/* 1616 */                          iM6541h4 = C1905lw.m6541h(i5);
/* 1621 */                          iM6543j2 = C1905lw.m6543j(i9);
/* 1407 */                          iM6539f = iM6543j2 + iM6541h4;
/* 1408 */                          iM6539f2 += iM6539f;
                                }
/* 1380 */                      rh1Var = this;
                                break;
                            case 5:
/* 1598 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1600 */                          iM6541h5 = C1905lw.m6541h(i5);
/* 1420 */                          iM6541h6 = iM6541h5 + 8;
/* 1422 */                          iM6539f2 += iM6541h6;
                                }
/* 1423 */                      rh1Var = this;
/* 1425 */                      tq0Var2 = tq0Var;
                                break;
                            case 6:
/* 1586 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1588 */                          iM6541h2 = C1905lw.m6541h(i5);
/* 1439 */                          iM6541h6 = iM6541h2 + 4;
/* 1422 */                          iM6539f2 += iM6541h6;
                                }
/* 1423 */                      rh1Var = this;
/* 1425 */                      tq0Var2 = tq0Var;
                                break;
                            case 7:
/* 1573 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1579 */                          iM6541h6 = C1905lw.m6541h(i5) + 1;
/* 1422 */                          iM6539f2 += iM6541h6;
                                }
/* 1423 */                      rh1Var = this;
/* 1425 */                      tq0Var2 = tq0Var;
                                break;
                            case 8:
/* 1537 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1539 */                          Object object = unsafe.getObject(tq0Var2, j);
/* 1553 */                          iM6539f2 = (object instanceof C2259ul ? C1905lw.m6539f(i5, (C2259ul) object) : C1905lw.m6540g((String) object) + C1905lw.m6541h(i5)) + iM6539f2;
                                }
/* 1380 */                      rh1Var = this;
                                break;
                            case 9:
/* 1502 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1504 */                          Object object2 = unsafe.getObject(tq0Var2, j);
/* 1508 */                          i72 i72VarM8179l = rh1Var.m8179l(i3);
/* 1512 */                          Class cls = n72.f14156a;
/* 1516 */                          int iM6541h13 = C1905lw.m6541h(i5);
/* 1520 */                          int iMo8856a3 = ((AbstractC2350x) object2).mo8856a(i72VarM8179l);
/* 1530 */                          iM6539f2 += C1905lw.m6542i(iMo8856a3) + iMo8856a3 + iM6541h13;
                                }
                                break;
                            case 10:
/* 1485 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1493 */                          iM6539f = C1905lw.m6539f(i5, (C2259ul) unsafe.getObject(tq0Var2, j));
/* 1408 */                          iM6539f2 += iM6539f;
                                }
/* 1380 */                      rh1Var = this;
                                break;
                            case 11:
/* 1466 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1468 */                          int i10 = unsafe.getInt(tq0Var2, j);
/* 1472 */                          iM6541h4 = C1905lw.m6541h(i5);
/* 1476 */                          iM6543j2 = C1905lw.m6542i(i10);
/* 1407 */                          iM6539f = iM6543j2 + iM6541h4;
/* 1408 */                          iM6539f2 += iM6539f;
                                }
/* 1380 */                      rh1Var = this;
                                break;
                            case 12:
/* 1446 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1448 */                          int i11 = unsafe.getInt(tq0Var2, j);
/* 1452 */                          iM6541h4 = C1905lw.m6541h(i5);
/* 1457 */                          iM6543j2 = C1905lw.m6543j(i11);
/* 1407 */                          iM6539f = iM6543j2 + iM6541h4;
/* 1408 */                          iM6539f2 += iM6539f;
                                }
/* 1380 */                      rh1Var = this;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1433 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1435 */                          iM6541h2 = C1905lw.m6541h(i5);
/* 1439 */                          iM6541h6 = iM6541h2 + 4;
/* 1422 */                          iM6539f2 += iM6541h6;
                                }
/* 1423 */                      rh1Var = this;
/* 1425 */                      tq0Var2 = tq0Var;
                                break;
                            case 14:
/* 1414 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1416 */                          iM6541h5 = C1905lw.m6541h(i5);
/* 1420 */                          iM6541h6 = iM6541h5 + 8;
/* 1422 */                          iM6539f2 += iM6541h6;
                                }
/* 1423 */                      rh1Var = this;
/* 1425 */                      tq0Var2 = tq0Var;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1388 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1390 */                          int i12 = unsafe.getInt(tq0Var2, j);
/* 1394 */                          iM6541h4 = C1905lw.m6541h(i5);
/* 1403 */                          iM6543j2 = C1905lw.m6542i((i12 >> 31) ^ (i12 << 1));
/* 1407 */                          iM6539f = iM6543j2 + iM6541h4;
/* 1408 */                          iM6539f2 += iM6539f;
                                }
/* 1380 */                      rh1Var = this;
                                break;
                            case 16:
/* 1359 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1361 */                          long j4 = unsafe.getLong(tq0Var2, j);
/* 1365 */                          iM6541h3 = C1905lw.m6541h(i5);
/* 1374 */                          iM6543j = C1905lw.m6543j((j4 << 1) ^ (j4 >> 63));
/* 1379 */                          iM6539f2 += iM6543j + iM6541h3;
                                }
/* 1380 */                      rh1Var = this;
                                break;
                            case 17:
/* 1331 */                      if (rh1Var.m8181n(tq0Var2, i3, i2, i4, i)) {
/* 1337 */                          AbstractC2350x abstractC2350x = (AbstractC2350x) unsafe.getObject(tq0Var2, j);
/* 1339 */                          i72 i72VarM8179l2 = rh1Var.m8179l(i3);
/* 1347 */                          iM6541h7 = C1905lw.m6541h(i5) * 2;
/* 1349 */                          iMo8856a = abstractC2350x.mo8856a(i72VarM8179l2);
/* 158 */                           iM6919c = iMo8856a + iM6541h7;
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 18:
/* 1321 */                      iM6919c = n72.m6919c(i5, (List) unsafe.getObject(tq0Var2, j));
/* 105 */                       iM6539f2 += iM6919c;
                                break;
                            case 19:
/* 1309 */                      iM6919c = n72.m6918b(i5, (List) unsafe.getObject(tq0Var2, j));
/* 105 */                       iM6539f2 += iM6919c;
                                break;
                            case 20:
/* 1275 */                      List list = (List) unsafe.getObject(tq0Var2, j);
/* 1277 */                      Class cls2 = n72.f14156a;
/* 1283 */                      if (list.size() == 0) {
/* 909 */                           iM6541h8 = 0;
                                } else {
/* 1300 */                          iM6541h8 = (C1905lw.m6541h(i5) * list.size()) + n72.m6921e(list);
                                }
/* 921 */                       iM6539f2 += iM6541h8;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 1249 */                      List list2 = (List) unsafe.getObject(tq0Var2, j);
/* 1251 */                      Class cls3 = n72.f14156a;
/* 1253 */                      size = list2.size();
/* 1257 */                      if (size == 0) {
/* 909 */                           iM6541h8 = 0;
                                } else {
/* 1261 */                          iM6925i = n72.m6925i(list2);
/* 1265 */                          iM6541h9 = C1905lw.m6541h(i5);
/* 920 */                           iM6541h8 = (iM6541h9 * size) + iM6925i;
                                }
/* 921 */                       iM6539f2 += iM6541h8;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 1223 */                      List list3 = (List) unsafe.getObject(tq0Var2, j);
/* 1225 */                      Class cls4 = n72.f14156a;
/* 1227 */                      size = list3.size();
/* 1231 */                      if (size == 0) {
/* 909 */                           iM6541h8 = 0;
                                } else {
/* 1235 */                          iM6925i = n72.m6920d(list3);
/* 1239 */                          iM6541h9 = C1905lw.m6541h(i5);
/* 920 */                           iM6541h8 = (iM6541h9 * size) + iM6925i;
                                }
/* 921 */                       iM6539f2 += iM6541h8;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 1213 */                      iM6919c = n72.m6919c(i5, (List) unsafe.getObject(tq0Var2, j));
/* 105 */                       iM6539f2 += iM6919c;
                                break;
                            case 24:
/* 1201 */                      iM6919c = n72.m6918b(i5, (List) unsafe.getObject(tq0Var2, j));
/* 105 */                       iM6539f2 += iM6919c;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 1174 */                      List list4 = (List) unsafe.getObject(tq0Var2, j);
/* 1176 */                      Class cls5 = n72.f14156a;
/* 1178 */                      int size3 = list4.size();
/* 1192 */                      iM6539f2 += size3 == 0 ? 0 : (C1905lw.m6541h(i5) + 1) * size3;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 1117 */                      List list5 = (List) unsafe.getObject(tq0Var2, j);
/* 1119 */                      Class cls6 = n72.f14156a;
/* 1121 */                      int size4 = list5.size();
/* 1125 */                      if (size4 == 0) {
/* 909 */                           iM6541h8 = 0;
                                } else {
/* 1133 */                          iM6541h8 = C1905lw.m6541h(i5) * size4;
/* 1135 */                          for (int i13 = 0; i13 < size4; i13++) {
/* 1137 */                              Object obj = list5.get(i13);
/* 1143 */                              if (obj instanceof C2259ul) {
/* 1147 */                                  int size5 = ((C2259ul) obj).size();
/* 1156 */                                  iM6541h8 = C1905lw.m6542i(size5) + size5 + iM6541h8;
                                        } else {
/* 1165 */                                  iM6541h8 = C1905lw.m6540g((String) obj) + iM6541h8;
                                        }
                                    }
                                }
/* 921 */                       iM6539f2 += iM6541h8;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 1070 */                      List list6 = (List) unsafe.getObject(tq0Var2, j);
/* 1072 */                      i72 i72VarM8179l3 = rh1Var.m8179l(i3);
/* 1076 */                      Class cls7 = n72.f14156a;
/* 1078 */                      int size6 = list6.size();
/* 1082 */                      if (size6 == 0) {
/* 462 */                           iM6541h10 = 0;
                                } else {
/* 1090 */                          iM6541h10 = C1905lw.m6541h(i5) * size6;
/* 1092 */                          for (int i14 = 0; i14 < size6; i14++) {
/* 1100 */                              int iMo8856a4 = ((AbstractC2350x) list6.get(i14)).mo8856a(i72VarM8179l3);
/* 1109 */                              iM6541h10 += C1905lw.m6542i(iMo8856a4) + iMo8856a4;
                                    }
                                }
/* 514 */                       iM6539f2 += iM6541h10;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 1024 */                      List list7 = (List) unsafe.getObject(tq0Var2, j);
/* 1026 */                      Class cls8 = n72.f14156a;
/* 1028 */                      int size7 = list7.size();
/* 1032 */                      if (size7 == 0) {
/* 909 */                           iM6541h8 = 0;
                                } else {
/* 1039 */                          iM6541h8 = C1905lw.m6541h(i5) * size7;
/* 1045 */                          for (int i15 = 0; i15 < list7.size(); i15++) {
/* 1053 */                              int size8 = ((C2259ul) list7.get(i15)).size();
/* 1062 */                              iM6541h8 += C1905lw.m6542i(size8) + size8;
                                    }
                                }
/* 921 */                       iM6539f2 += iM6541h8;
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 1000 */                      List list8 = (List) unsafe.getObject(tq0Var2, j);
/* 1002 */                      Class cls9 = n72.f14156a;
/* 1004 */                      size = list8.size();
/* 1008 */                      if (size == 0) {
/* 909 */                           iM6541h8 = 0;
                                } else {
/* 1011 */                          iM6925i = n72.m6924h(list8);
/* 1015 */                          iM6541h9 = C1905lw.m6541h(i5);
/* 920 */                           iM6541h8 = (iM6541h9 * size) + iM6925i;
                                }
/* 921 */                       iM6539f2 += iM6541h8;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 976 */                       List list9 = (List) unsafe.getObject(tq0Var2, j);
/* 978 */                       Class cls10 = n72.f14156a;
/* 980 */                       size = list9.size();
/* 984 */                       if (size == 0) {
/* 909 */                           iM6541h8 = 0;
                                } else {
/* 987 */                           iM6925i = n72.m6917a(list9);
/* 991 */                           iM6541h9 = C1905lw.m6541h(i5);
/* 920 */                           iM6541h8 = (iM6541h9 * size) + iM6925i;
                                }
/* 921 */                       iM6539f2 += iM6541h8;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 966 */                       iM6919c = n72.m6918b(i5, (List) unsafe.getObject(tq0Var2, j));
/* 105 */                       iM6539f2 += iM6919c;
                                break;
                            case 32:
/* 954 */                       iM6919c = n72.m6919c(i5, (List) unsafe.getObject(tq0Var2, j));
/* 105 */                       iM6539f2 += iM6919c;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 928 */                       List list10 = (List) unsafe.getObject(tq0Var2, j);
/* 930 */                       Class cls11 = n72.f14156a;
/* 932 */                       size = list10.size();
/* 936 */                       if (size == 0) {
/* 909 */                           iM6541h8 = 0;
                                } else {
/* 939 */                           iM6925i = n72.m6922f(list10);
/* 943 */                           iM6541h9 = C1905lw.m6541h(i5);
/* 920 */                           iM6541h8 = (iM6541h9 * size) + iM6925i;
                                }
/* 921 */                       iM6539f2 += iM6541h8;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 899 */                       List list11 = (List) unsafe.getObject(tq0Var2, j);
/* 901 */                       Class cls12 = n72.f14156a;
/* 903 */                       size = list11.size();
/* 907 */                       if (size == 0) {
/* 909 */                           iM6541h8 = 0;
                                } else {
/* 911 */                           iM6925i = n72.m6923g(list11);
/* 915 */                           iM6541h9 = C1905lw.m6541h(i5);
/* 920 */                           iM6541h8 = (iM6541h9 * size) + iM6925i;
                                }
/* 921 */                       iM6539f2 += iM6541h8;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 873 */                       List list12 = (List) unsafe.getObject(tq0Var2, j);
/* 875 */                       Class cls13 = n72.f14156a;
/* 881 */                       size2 = list12.size() * 8;
/* 883 */                       if (size2 > 0) {
/* 885 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 889 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 847 */                       List list13 = (List) unsafe.getObject(tq0Var2, j);
/* 849 */                       Class cls14 = n72.f14156a;
/* 855 */                       size2 = list13.size() * 4;
/* 857 */                       if (size2 > 0) {
/* 859 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 863 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 37:
/* 827 */                       size2 = n72.m6921e((List) unsafe.getObject(tq0Var2, j));
/* 831 */                       if (size2 > 0) {
/* 833 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 837 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 38:
/* 805 */                       size2 = n72.m6925i((List) unsafe.getObject(tq0Var2, j));
/* 809 */                       if (size2 > 0) {
/* 811 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 815 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 39:
/* 783 */                       size2 = n72.m6920d((List) unsafe.getObject(tq0Var2, j));
/* 787 */                       if (size2 > 0) {
/* 789 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 793 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 755 */                       List list14 = (List) unsafe.getObject(tq0Var2, j);
/* 757 */                       Class cls15 = n72.f14156a;
/* 763 */                       size2 = list14.size() * 8;
/* 765 */                       if (size2 > 0) {
/* 767 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 771 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 729 */                       List list15 = (List) unsafe.getObject(tq0Var2, j);
/* 731 */                       Class cls16 = n72.f14156a;
/* 737 */                       size2 = list15.size() * 4;
/* 739 */                       if (size2 > 0) {
/* 741 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 745 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 42:
/* 705 */                       List list16 = (List) unsafe.getObject(tq0Var2, j);
/* 707 */                       Class cls17 = n72.f14156a;
/* 709 */                       size2 = list16.size();
/* 713 */                       if (size2 > 0) {
/* 715 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 719 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 43:
/* 686 */                       size2 = n72.m6924h((List) unsafe.getObject(tq0Var2, j));
/* 690 */                       if (size2 > 0) {
/* 692 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 696 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 44:
/* 665 */                       size2 = n72.m6917a((List) unsafe.getObject(tq0Var2, j));
/* 669 */                       if (size2 > 0) {
/* 671 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 675 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 45:
/* 638 */                       List list17 = (List) unsafe.getObject(tq0Var2, j);
/* 640 */                       Class cls18 = n72.f14156a;
/* 646 */                       size2 = list17.size() * 4;
/* 648 */                       if (size2 > 0) {
/* 650 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 654 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 46:
/* 613 */                       List list18 = (List) unsafe.getObject(tq0Var2, j);
/* 615 */                       Class cls19 = n72.f14156a;
/* 621 */                       size2 = list18.size() * 8;
/* 623 */                       if (size2 > 0) {
/* 625 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 629 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 47:
/* 594 */                       size2 = n72.m6922f((List) unsafe.getObject(tq0Var2, j));
/* 598 */                       if (size2 > 0) {
/* 600 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 604 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 48:
/* 571 */                       size2 = n72.m6923g((List) unsafe.getObject(tq0Var2, j));
/* 575 */                       if (size2 > 0) {
/* 577 */                           iM6541h11 = C1905lw.m6541h(i5);
/* 581 */                           iM6542i = C1905lw.m6542i(size2);
/* 585 */                           iM6543j3 = iM6542i + iM6541h11;
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 49:
/* 521 */                       List list19 = (List) unsafe.getObject(tq0Var2, j);
/* 523 */                       i72 i72VarM8179l4 = rh1Var.m8179l(i3);
/* 527 */                       Class cls20 = n72.f14156a;
/* 529 */                       int size9 = list19.size();
/* 533 */                       if (size9 == 0) {
/* 535 */                           iMo8856a2 = 0;
                                } else {
/* 538 */                           iMo8856a2 = 0;
/* 539 */                           for (int i16 = 0; i16 < size9; i16++) {
/* 558 */                               iMo8856a2 += ((AbstractC2350x) list19.get(i16)).mo8856a(i72VarM8179l4) + (C1905lw.m6541h(i5) * 2);
                                    }
                                }
/* 562 */                       iM6539f2 += iMo8856a2;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 435 */                       Object object3 = unsafe.getObject(tq0Var2, j);
/* 445 */                       Object obj2 = rh1Var.f16063b[(i3 / 3) * 2];
/* 449 */                       rh1Var.f16074m.getClass();
/* 452 */                       gc1 gc1Var = (gc1) object3;
/* 454 */                       bc1 bc1Var = (bc1) obj2;
/* 460 */                       if (gc1Var.isEmpty()) {
/* 462 */                           iM6541h10 = 0;
                                } else {
/* 472 */                           iM6541h10 = 0;
/* 477 */                           for (Map.Entry entry : gc1Var.entrySet()) {
/* 485 */                               Object key = entry.getKey();
/* 489 */                               Object value = entry.getValue();
/* 493 */                               bc1Var.getClass();
/* 496 */                               int iM6541h14 = C1905lw.m6541h(i5);
/* 502 */                               int iM1331a = bc1.m1331a(bc1Var.f2364a, key, value);
/* 512 */                               iM6541h10 += C1905lw.m6542i(iM1331a) + iM1331a + iM6541h14;
                                    }
                                }
/* 514 */                       iM6539f2 += iM6541h10;
                                break;
                            case 51:
/* 427 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 429 */                           iM6541h = C1905lw.m6541h(i5);
/* 170 */                           iM6919c = iM6541h + 8;
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 52:
/* 415 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 417 */                           iM6541h12 = C1905lw.m6541h(i5);
/* 183 */                           iM6919c = iM6541h12 + 4;
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 53:
/* 395 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 397 */                           long jM8165y = m8165y(tq0Var2, j);
/* 401 */                           size2 = C1905lw.m6541h(i5);
/* 405 */                           iM6543j3 = C1905lw.m6543j(jM8165y);
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 54:
/* 375 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 377 */                           long jM8165y2 = m8165y(tq0Var2, j);
/* 381 */                           size2 = C1905lw.m6541h(i5);
/* 385 */                           iM6543j3 = C1905lw.m6543j(jM8165y2);
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 55:
/* 354 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 356 */                           int iM8164x = m8164x(tq0Var2, j);
/* 360 */                           iM6541h7 = C1905lw.m6541h(i5);
/* 365 */                           iMo8856a = C1905lw.m6543j(iM8164x);
/* 158 */                           iM6919c = iMo8856a + iM6541h7;
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 56:
/* 342 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 344 */                           iM6541h = C1905lw.m6541h(i5);
/* 170 */                           iM6919c = iM6541h + 8;
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 57:
/* 330 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 332 */                           iM6541h12 = C1905lw.m6541h(i5);
/* 183 */                           iM6919c = iM6541h12 + 4;
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 58:
/* 317 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 323 */                           iM6919c = C1905lw.m6541h(i5) + 1;
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 59:
/* 281 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 283 */                           Object object4 = unsafe.getObject(tq0Var2, j);
/* 297 */                           iM6539f2 = (object4 instanceof C2259ul ? C1905lw.m6539f(i5, (C2259ul) object4) : C1905lw.m6540g((String) object4) + C1905lw.m6541h(i5)) + iM6539f2;
                                }
                                break;
                            case 60:
/* 247 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 249 */                           Object object5 = unsafe.getObject(tq0Var2, j);
/* 253 */                           i72 i72VarM8179l5 = rh1Var.m8179l(i3);
/* 257 */                           Class cls21 = n72.f14156a;
/* 261 */                           int iM6541h15 = C1905lw.m6541h(i5);
/* 265 */                           int iMo8856a5 = ((AbstractC2350x) object5).mo8856a(i72VarM8179l5);
/* 274 */                           iM6542i2 = C1905lw.m6542i(iMo8856a5) + iMo8856a5 + iM6541h15;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 61:
/* 229 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 237 */                           iM6919c = C1905lw.m6539f(i5, (C2259ul) unsafe.getObject(tq0Var2, j));
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 62:
/* 210 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 212 */                           int iM8164x2 = m8164x(tq0Var2, j);
/* 216 */                           iM6541h7 = C1905lw.m6541h(i5);
/* 220 */                           iMo8856a = C1905lw.m6542i(iM8164x2);
/* 158 */                           iM6919c = iMo8856a + iM6541h7;
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 63:
/* 190 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 192 */                           int iM8164x3 = m8164x(tq0Var2, j);
/* 196 */                           iM6541h7 = C1905lw.m6541h(i5);
/* 201 */                           iMo8856a = C1905lw.m6543j(iM8164x3);
/* 158 */                           iM6919c = iMo8856a + iM6541h7;
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 64:
/* 177 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 179 */                           iM6541h12 = C1905lw.m6541h(i5);
/* 183 */                           iM6919c = iM6541h12 + 4;
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 65:
/* 164 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 166 */                           iM6541h = C1905lw.m6541h(i5);
/* 170 */                           iM6919c = iM6541h + 8;
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 66:
/* 139 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 141 */                           int iM8164x4 = m8164x(tq0Var2, j);
/* 145 */                           iM6541h7 = C1905lw.m6541h(i5);
/* 154 */                           iMo8856a = C1905lw.m6542i((iM8164x4 >> 31) ^ (iM8164x4 << 1));
/* 158 */                           iM6919c = iMo8856a + iM6541h7;
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                            case 67:
/* 112 */                       if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 114 */                           long jM8165y3 = m8165y(tq0Var2, j);
/* 118 */                           size2 = C1905lw.m6541h(i5);
/* 127 */                           iM6543j3 = C1905lw.m6543j((jM8165y3 << 1) ^ (jM8165y3 >> 63));
/* 131 */                           iM6542i2 = iM6543j3 + size2;
/* 132 */                           iM6539f2 += iM6542i2;
                                }
                                break;
                            case 68:
/* 82 */                        if (rh1Var.m8182p(i5, tq0Var2, i3)) {
/* 104 */                           iM6919c = ((AbstractC2350x) unsafe.getObject(tq0Var2, j)).mo8856a(rh1Var.m8179l(i3)) + (C1905lw.m6541h(i5) * 2);
/* 105 */                           iM6539f2 += iM6919c;
                                }
                                break;
                        }
/* 1691 */              i3 += 3;
                    }
                }

                @Override // p000.i72
                /* JADX INFO: renamed from: h */
                public final void mo4498h(Object obj, gr0 gr0Var) throws IOException {
/* 1 */             gr0Var.getClass();
/* 4 */             m8175L(obj, gr0Var);
                }

                /* JADX INFO: renamed from: i */
                public final boolean m8176i(tq0 tq0Var, tq0 tq0Var2, int i) {
                    return m8180m(i, tq0Var) == m8180m(i, tq0Var2);
                }

                /* JADX INFO: renamed from: j */
                public final void m8177j(int i, Object obj, Object obj2) {
/* 3 */             int i2 = this.f16062a[i];
/* 20 */            if (ny2.f14568c.m6580h(obj, m8174K(i) & 1048575) == null) {
/* 22 */                return;
                    }
/* 23 */            m8178k(i);
                }

                /* JADX INFO: renamed from: k */
                public final void m8178k(int i) {
/* 11 */            if (this.f16063b[((i / 3) * 2) + 1] == null) {
/* 13 */                return;
                    }
/* 14 */            C1697u2.m5431g();
                }

                /* JADX INFO: renamed from: l */
                public final i72 m8179l(int i) {
/* 3 */             int i2 = (i / 3) * 2;
/* 5 */             Object[] objArr = this.f16063b;
/* 9 */             i72 i72Var = (i72) objArr[i2];
/* 11 */            if (i72Var != null) {
/* 13 */                return i72Var;
                    }
/* 22 */            i72 i72VarM2900a = cz1.f6940c.m2900a((Class) objArr[i2 + 1]);
/* 26 */            objArr[i2] = i72VarM2900a;
/* 28 */            return i72VarM2900a;
                }

                /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
                /* JADX INFO: renamed from: m */
                public final boolean m8180m(int i, Object obj) {
/* 5 */             int i2 = this.f16062a[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j != 1048575) {
/* 271 */               if (((1 << (i2 >>> 20)) & ny2.f14568c.m6578f(obj, j)) != 0) {
/* 19 */                    return true;
                        }
/* 18 */                return false;
                    }
/* 22 */            int iM8174K = m8174K(i);
/* 26 */            long j2 = iM8174K & 1048575;
                    switch (m8160J(iM8174K)) {
                        case 0:
/* 257 */                   if (Double.doubleToRawLongBits(ny2.f14568c.mo4395d(obj, j2)) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 1:
/* 242 */                   if (Float.floatToRawIntBits(ny2.f14568c.mo4396e(obj, j2)) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 2:
/* 229 */                   if (ny2.f14568c.m6579g(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 3:
/* 218 */                   if (ny2.f14568c.m6579g(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 4:
/* 207 */                   if (ny2.f14568c.m6578f(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 5:
/* 198 */                   if (ny2.f14568c.m6579g(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 6:
/* 187 */                   if (ny2.f14568c.m6578f(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 7:
/* 176 */                   return ny2.f14568c.mo4394c(obj, j2);
                        case 8:
/* 142 */                   Object objM6580h = ny2.f14568c.m6580h(obj, j2);
/* 148 */                   if (objM6580h instanceof String) {
/* 156 */                       return !((String) objM6580h).isEmpty();
                            }
/* 160 */                   if (objM6580h instanceof C2259ul) {
/* 168 */                       return !C2259ul.f17581c.equals(objM6580h);
                            }
/* 170 */                   f42.m3649e();
/* 18 */                    return false;
                        case 9:
/* 136 */                   if (ny2.f14568c.m6580h(obj, j2) != null) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 10:
/* 128 */                   return !C2259ul.f17581c.equals(ny2.f14568c.m6580h(obj, j2));
                        case 11:
/* 112 */                   if (ny2.f14568c.m6578f(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 12:
/* 102 */                   if (ny2.f14568c.m6578f(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 92 */                    if (ny2.f14568c.m6578f(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 14:
/* 82 */                    if (ny2.f14568c.m6579g(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 70 */                    if (ny2.f14568c.m6578f(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 16:
/* 60 */                    if (ny2.f14568c.m6579g(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 17:
/* 48 */                    if (ny2.f14568c.m6580h(obj, j2) != null) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        default:
/* 38 */                    f42.m3649e();
/* 18 */                    return false;
                    }
                }

                /* JADX INFO: renamed from: n */
                public final boolean m8181n(Object obj, int i, int i2, int i3, int i4) {
/* 4 */             if (i2 == 1048575) {
/* 6 */                 return m8180m(i, obj);
                    }
                    return (i3 & i4) != 0;
                }

                @Override // p000.i72
                public final tq0 newInstance() {
/* 3 */             this.f16071j.getClass();
/* 10 */            return ((tq0) this.f16066e).m8860i();
                }

                /* JADX INFO: renamed from: p */
                public final boolean m8182p(int i, Object obj, int i2) {
                    return ny2.f14568c.m6578f(obj, (long) (this.f16062a[i2 + 2] & 1048575)) == i;
                }

                /* JADX INFO: renamed from: q */
                public final void m8183q(Object obj, int i, Object obj2, eg0 eg0Var, C1771iw c1771iw) throws oz0, nz0 {
/* 8 */             long jM8174K = m8174K(i) & 1048575;
/* 12 */            Object objM6580h = ny2.f14568c.m6580h(obj, jM8174K);
/* 16 */            ic1 ic1Var = this.f16074m;
/* 18 */            if (objM6580h == null) {
/* 20 */                ic1Var.getClass();
/* 25 */                objM6580h = gc1.f8537b.m3911b();
/* 29 */                ny2.m7083o(obj, jM8174K, objM6580h);
                    } else {
/* 33 */                ic1Var.getClass();
/* 41 */                if (!((gc1) objM6580h).f8538a) {
/* 45 */                    gc1 gc1VarM3911b = gc1.f8537b.m3911b();
/* 49 */                    ic1.m4517a(gc1VarM3911b, objM6580h);
/* 52 */                    ny2.m7083o(obj, jM8174K, gc1VarM3911b);
/* 55 */                    objM6580h = gc1VarM3911b;
                        }
                    }
/* 56 */            ic1Var.getClass();
/* 59 */            gc1 gc1Var = (gc1) objM6580h;
/* 63 */            ac1 ac1Var = ((bc1) obj2).f2364a;
/* 66 */            c1771iw.m5581R(2);
/* 71 */            AbstractC1006hw abstractC1006hw = (AbstractC1006hw) c1771iw.f11948e;
/* 77 */            int iMo3259l = abstractC1006hw.mo3259l(abstractC1006hw.mo3247D());
/* 81 */            Object obj3 = ac1Var.f179d;
/* 83 */            Object objM5600r = HttpUrl.FRAGMENT_ENCODE_SET;
/* 85 */            Object objM5600r2 = obj3;
                    while (true) {
                        try {
/* 86 */                    int iM5585c = c1771iw.m5585c();
/* 93 */                    if (iM5585c == Integer.MAX_VALUE || abstractC1006hw.mo3257g()) {
                                break;
                            }
/* 105 */                   if (iM5585c == 1) {
/* 142 */                       objM5600r = c1771iw.m5600r((y83) ac1Var.f177b, null, null);
                            } else if (iM5585c != 2) {
                                try {
/* 113 */                           if (!c1771iw.m5582S()) {
/* 121 */                               throw new qz0("Unable to parse map entry.");
                                    }
                                } catch (oz0 unused) {
/* 151 */                           if (!c1771iw.m5582S()) {
/* 159 */                               throw new qz0("Unable to parse map entry.");
                                    }
                                }
                            } else {
/* 132 */                       objM5600r2 = c1771iw.m5600r((y83) ac1Var.f178c, obj3.getClass(), eg0Var);
                            }
                        } catch (Throwable th) {
/* 167 */                   abstractC1006hw.mo3258j(iMo3259l);
/* 170 */                   throw th;
                        }
                    }
/* 160 */           gc1Var.put(objM5600r, objM5600r2);
/* 163 */           abstractC1006hw.mo3258j(iMo3259l);
                }

                /* JADX INFO: renamed from: r */
                public final void m8184r(int i, Object obj, Object obj2) {
/* 5 */             if (m8180m(i, obj2)) {
/* 15 */                long jM8174K = m8174K(i) & 1048575;
/* 17 */                Unsafe unsafe = f16061o;
/* 19 */                Object object = unsafe.getObject(obj2, jM8174K);
/* 23 */                if (object == null) {
/* 88 */                    ds0.m3188d(this.f16062a[i], obj2);
/* 91 */                    return;
                        }
/* 25 */                i72 i72VarM8179l = m8179l(i);
/* 33 */                if (!m8180m(i, obj)) {
/* 39 */                    if (m8161o(object)) {
/* 45 */                        tq0 tq0VarNewInstance = i72VarM8179l.newInstance();
/* 49 */                        i72VarM8179l.mo4491a(tq0VarNewInstance, object);
/* 52 */                        unsafe.putObject(obj, jM8174K, tq0VarNewInstance);
                            } else {
/* 41 */                        unsafe.putObject(obj, jM8174K, object);
                            }
/* 55 */                    m8170F(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jM8174K);
/* 67 */                if (!m8161o(object2)) {
/* 69 */                    tq0 tq0VarNewInstance2 = i72VarM8179l.newInstance();
/* 73 */                    i72VarM8179l.mo4491a(tq0VarNewInstance2, object2);
/* 76 */                    unsafe.putObject(obj, jM8174K, tq0VarNewInstance2);
/* 79 */                    object2 = tq0VarNewInstance2;
                        }
/* 80 */                i72VarM8179l.mo4491a(object2, object);
                    }
                }

                /* JADX INFO: renamed from: s */
                public final void m8185s(int i, Object obj, Object obj2) {
/* 1 */             int[] iArr = this.f16062a;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (m8182p(i2, obj2, i)) {
/* 19 */                long jM8174K = m8174K(i) & 1048575;
/* 21 */                Unsafe unsafe = f16061o;
/* 23 */                Object object = unsafe.getObject(obj2, jM8174K);
/* 27 */                if (object == null) {
/* 90 */                    ds0.m3188d(iArr[i], obj2);
/* 93 */                    return;
                        }
/* 29 */                i72 i72VarM8179l = m8179l(i);
/* 37 */                if (!m8182p(i2, obj, i)) {
/* 43 */                    if (m8161o(object)) {
/* 49 */                        tq0 tq0VarNewInstance = i72VarM8179l.newInstance();
/* 53 */                        i72VarM8179l.mo4491a(tq0VarNewInstance, object);
/* 56 */                        unsafe.putObject(obj, jM8174K, tq0VarNewInstance);
                            } else {
/* 45 */                        unsafe.putObject(obj, jM8174K, object);
                            }
/* 59 */                    m8171G(i2, obj, i);
/* 62 */                    return;
                        }
/* 63 */                Object object2 = unsafe.getObject(obj, jM8174K);
/* 71 */                if (!m8161o(object2)) {
/* 73 */                    tq0 tq0VarNewInstance2 = i72VarM8179l.newInstance();
/* 77 */                    i72VarM8179l.mo4491a(tq0VarNewInstance2, object2);
/* 80 */                    unsafe.putObject(obj, jM8174K, tq0VarNewInstance2);
/* 83 */                    object2 = tq0VarNewInstance2;
                        }
/* 84 */                i72VarM8179l.mo4491a(object2, object);
                    }
                }

                /* JADX INFO: renamed from: t */
                public final Object m8186t(int i, Object obj) {
/* 1 */             i72 i72VarM8179l = m8179l(i);
/* 12 */            long jM8174K = m8174K(i) & 1048575;
/* 18 */            if (!m8180m(i, obj)) {
/* 20 */                return i72VarM8179l.newInstance();
                    }
/* 27 */            Object object = f16061o.getObject(obj, jM8174K);
/* 35 */            if (m8161o(object)) {
/* 37 */                return object;
                    }
/* 38 */            tq0 tq0VarNewInstance = i72VarM8179l.newInstance();
/* 42 */            if (object != null) {
/* 44 */                i72VarM8179l.mo4491a(tq0VarNewInstance, object);
                    }
/* 47 */            return tq0VarNewInstance;
                }

                /* JADX INFO: renamed from: u */
                public final Object m8187u(int i, Object obj, int i2) {
/* 1 */             i72 i72VarM8179l = m8179l(i2);
/* 9 */             if (!m8182p(i, obj, i2)) {
/* 11 */                return i72VarM8179l.newInstance();
                    }
/* 27 */            Object object = f16061o.getObject(obj, m8174K(i2) & 1048575);
/* 35 */            if (m8161o(object)) {
/* 37 */                return object;
                    }
/* 38 */            tq0 tq0VarNewInstance = i72VarM8179l.newInstance();
/* 42 */            if (object != null) {
/* 44 */                i72VarM8179l.mo4491a(tq0VarNewInstance, object);
                    }
/* 47 */            return tq0VarNewInstance;
                }

                /* JADX INFO: renamed from: z */
                public final int m8188z(int i) {
/* 3 */             if (i < this.f16064c || i > this.f16065d) {
/* 40 */                return -1;
                    }
/* 9 */             int[] iArr = this.f16062a;
/* 14 */            int length = (iArr.length / 3) - 1;
/* 16 */            int i2 = 0;
/* 17 */            while (i2 <= length) {
/* 21 */                int i3 = (length + i2) >>> 1;
/* 23 */                int i4 = i3 * 3;
/* 25 */                int i5 = iArr[i4];
/* 27 */                if (i == i5) {
/* 29 */                    return i4;
                        }
/* 30 */                if (i < i5) {
/* 32 */                    length = i3 - 1;
                        } else {
/* 36 */                    i2 = i3 + 1;
                        }
                    }
/* 40 */            return -1;
                }
            }
