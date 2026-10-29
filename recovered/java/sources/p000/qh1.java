            package p000;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1697u2;
            import java.lang.reflect.Field;
            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.List;
            import java.util.logging.Level;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qh1 implements h72 {

                /* JADX INFO: renamed from: o */
                public static final int[] f15548o = new int[0];

                /* JADX INFO: renamed from: p */
                public static final Unsafe f15549p = my2.m6824j();

                /* JADX INFO: renamed from: a */
                public final int[] f15550a;

                /* JADX INFO: renamed from: b */
                public final Object[] f15551b;

                /* JADX INFO: renamed from: c */
                public final int f15552c;

                /* JADX INFO: renamed from: d */
                public final int f15553d;

                /* JADX INFO: renamed from: e */
                public final AbstractC2313w f15554e;

                /* JADX INFO: renamed from: f */
                public final boolean f15555f;

                /* JADX INFO: renamed from: g */
                public final boolean f15556g;

                /* JADX INFO: renamed from: h */
                public final int[] f15557h;

                /* JADX INFO: renamed from: i */
                public final int f15558i;

                /* JADX INFO: renamed from: j */
                public final int f15559j;

                /* JADX INFO: renamed from: k */
                public final gn1 f15560k;

                /* JADX INFO: renamed from: l */
                public final c81 f15561l;

                /* JADX INFO: renamed from: m */
                public final tx2 f15562m;

                /* JADX INFO: renamed from: n */
                public final hc1 f15563n;

                public qh1(int[] iArr, Object[] objArr, int i, int i2, AbstractC2313w abstractC2313w, boolean z, int[] iArr2, int i3, int i4, gn1 gn1Var, c81 c81Var, tx2 tx2Var, fg0 fg0Var, hc1 hc1Var) {
/* 4 */             this.f15550a = iArr;
/* 6 */             this.f15551b = objArr;
/* 8 */             this.f15552c = i;
/* 10 */            this.f15553d = i2;
/* 14 */            this.f15555f = abstractC2313w instanceof sq0;
/* 16 */            this.f15556g = z;
/* 18 */            this.f15557h = iArr2;
/* 20 */            this.f15558i = i3;
/* 22 */            this.f15559j = i4;
/* 24 */            this.f15560k = gn1Var;
/* 26 */            this.f15561l = c81Var;
/* 28 */            this.f15562m = tx2Var;
/* 30 */            this.f15554e = abstractC2313w;
/* 32 */            this.f15563n = hc1Var;
                }

                /* JADX INFO: renamed from: A */
                public static qh1 m7812A(s02 s02Var, gn1 gn1Var, c81 c81Var, tx2 tx2Var, fg0 fg0Var, hc1 hc1Var) {
/* 3 */             if (s02Var instanceof s02) {
/* 5 */                 return m7813B(s02Var, gn1Var, c81Var, tx2Var, fg0Var, hc1Var);
                    }
/* 10 */            C1697u2.m5431g();
/* 13 */            return null;
                }

                /* JADX WARN: Code duplicated, block: B:123:0x026a  */
                /* JADX WARN: Code duplicated, block: B:125:0x026e  */
                /* JADX WARN: Code duplicated, block: B:128:0x0288  */
                /* JADX WARN: Code duplicated, block: B:129:0x028b  */
                /* JADX WARN: Code duplicated, block: B:177:0x0375  */
                /* JADX INFO: renamed from: B */
                public static qh1 m7813B(s02 s02Var, gn1 gn1Var, c81 c81Var, tx2 tx2Var, fg0 fg0Var, hc1 hc1Var) {
                    int i;
                    int iCharAt;
                    int iCharAt2;
                    int iCharAt3;
                    int i2;
                    int i3;
                    int i4;
                    int[] iArr;
                    int i5;
                    int i6;
                    char cCharAt;
                    int i7;
                    char cCharAt2;
                    int i8;
                    char cCharAt3;
                    int i9;
                    char cCharAt4;
                    int i10;
                    char cCharAt5;
                    int i11;
                    char cCharAt6;
                    int i12;
                    char cCharAt7;
                    int i13;
                    char cCharAt8;
                    int i14;
                    int i15;
                    int i16;
                    int iObjectFieldOffset;
                    int iObjectFieldOffset2;
                    int i17;
                    int i18;
                    Field fieldM7817N;
                    char cCharAt9;
                    int i19;
                    int i20;
                    Object obj;
                    Field fieldM7817N2;
                    int i21;
                    Object obj2;
                    Field fieldM7817N3;
                    int i22;
                    char cCharAt10;
                    int i23;
                    char cCharAt11;
                    int i24;
                    int i25;
                    char cCharAt12;
                    int i26;
                    char cCharAt13;
/* 1 */             boolean z = (s02Var.f16374d & 1) != 1;
/* 2 */             String str = s02Var.f16372b;
/* 3 */             int length = str.length();
/* 4 */             if (str.charAt(0) >= 55296) {
                        int i27 = 1;
                        while (true) {
                            i = i27 + 1;
/* 5 */                     if (str.charAt(i27) < 55296) {
                                break;
                            }
                            i27 = i;
                        }
                    } else {
                        i = 1;
                    }
                    int i28 = i + 1;
/* 6 */             int iCharAt4 = str.charAt(i);
                    if (iCharAt4 >= 55296) {
                        int i29 = iCharAt4 & 8191;
                        int i30 = 13;
                        while (true) {
                            i26 = i28 + 1;
/* 7 */                     cCharAt13 = str.charAt(i28);
                            if (cCharAt13 < 55296) {
                                break;
                            }
                            i29 |= (cCharAt13 & 8191) << i30;
                            i30 += 13;
                            i28 = i26;
                        }
                        iCharAt4 = i29 | (cCharAt13 << i30);
                        i28 = i26;
                    }
                    if (iCharAt4 == 0) {
                        i5 = 0;
                        iCharAt = 0;
                        iCharAt2 = 0;
                        i2 = 0;
                        iCharAt3 = 0;
/* 8 */                 iArr = f15548o;
                        i3 = 0;
                        i4 = 0;
                    } else {
                        int i31 = i28 + 1;
/* 9 */                 int iCharAt5 = str.charAt(i28);
                        if (iCharAt5 >= 55296) {
                            int i32 = iCharAt5 & 8191;
                            int i33 = 13;
                            while (true) {
                                i13 = i31 + 1;
/* 10 */                        cCharAt8 = str.charAt(i31);
                                if (cCharAt8 < 55296) {
                                    break;
                                }
                                i32 |= (cCharAt8 & 8191) << i33;
                                i33 += 13;
                                i31 = i13;
                            }
                            iCharAt5 = i32 | (cCharAt8 << i33);
                            i31 = i13;
                        }
                        int i34 = i31 + 1;
/* 11 */                int iCharAt6 = str.charAt(i31);
                        if (iCharAt6 >= 55296) {
                            int i35 = iCharAt6 & 8191;
                            int i36 = 13;
                            while (true) {
                                i12 = i34 + 1;
/* 12 */                        cCharAt7 = str.charAt(i34);
                                if (cCharAt7 < 55296) {
                                    break;
                                }
                                i35 |= (cCharAt7 & 8191) << i36;
                                i36 += 13;
                                i34 = i12;
                            }
                            iCharAt6 = i35 | (cCharAt7 << i36);
                            i34 = i12;
                        }
                        int i37 = i34 + 1;
/* 13 */                int iCharAt7 = str.charAt(i34);
                        if (iCharAt7 >= 55296) {
                            int i38 = iCharAt7 & 8191;
                            int i39 = 13;
                            while (true) {
                                i11 = i37 + 1;
/* 14 */                        cCharAt6 = str.charAt(i37);
                                if (cCharAt6 < 55296) {
                                    break;
                                }
                                i38 |= (cCharAt6 & 8191) << i39;
                                i39 += 13;
                                i37 = i11;
                            }
                            iCharAt7 = i38 | (cCharAt6 << i39);
                            i37 = i11;
                        }
                        int i40 = i37 + 1;
/* 15 */                int iCharAt8 = str.charAt(i37);
                        if (iCharAt8 >= 55296) {
                            int i41 = iCharAt8 & 8191;
                            int i42 = 13;
                            while (true) {
                                i10 = i40 + 1;
/* 16 */                        cCharAt5 = str.charAt(i40);
                                if (cCharAt5 < 55296) {
                                    break;
                                }
                                i41 |= (cCharAt5 & 8191) << i42;
                                i42 += 13;
                                i40 = i10;
                            }
                            iCharAt8 = i41 | (cCharAt5 << i42);
                            i40 = i10;
                        }
                        int i43 = i40 + 1;
/* 17 */                iCharAt = str.charAt(i40);
                        if (iCharAt >= 55296) {
                            int i44 = iCharAt & 8191;
                            int i45 = 13;
                            while (true) {
                                i9 = i43 + 1;
/* 18 */                        cCharAt4 = str.charAt(i43);
                                if (cCharAt4 < 55296) {
                                    break;
                                }
                                i44 |= (cCharAt4 & 8191) << i45;
                                i45 += 13;
                                i43 = i9;
                            }
                            iCharAt = i44 | (cCharAt4 << i45);
                            i43 = i9;
                        }
                        int i46 = i43 + 1;
/* 19 */                iCharAt2 = str.charAt(i43);
                        if (iCharAt2 >= 55296) {
                            int i47 = iCharAt2 & 8191;
                            int i48 = 13;
                            while (true) {
                                i8 = i46 + 1;
/* 20 */                        cCharAt3 = str.charAt(i46);
                                if (cCharAt3 < 55296) {
                                    break;
                                }
                                i47 |= (cCharAt3 & 8191) << i48;
                                i48 += 13;
                                i46 = i8;
                            }
                            iCharAt2 = i47 | (cCharAt3 << i48);
                            i46 = i8;
                        }
                        int i49 = i46 + 1;
/* 21 */                int iCharAt9 = str.charAt(i46);
                        if (iCharAt9 >= 55296) {
                            int i50 = iCharAt9 & 8191;
                            int i51 = 13;
                            while (true) {
                                i7 = i49 + 1;
/* 22 */                        cCharAt2 = str.charAt(i49);
                                if (cCharAt2 < 55296) {
                                    break;
                                }
                                i50 |= (cCharAt2 & 8191) << i51;
                                i51 += 13;
                                i49 = i7;
                            }
                            iCharAt9 = i50 | (cCharAt2 << i51);
                            i49 = i7;
                        }
                        int i52 = i49 + 1;
/* 23 */                iCharAt3 = str.charAt(i49);
                        if (iCharAt3 >= 55296) {
                            int i53 = iCharAt3 & 8191;
                            int i54 = i52;
                            int i55 = 13;
                            while (true) {
                                i6 = i54 + 1;
/* 24 */                        cCharAt = str.charAt(i54);
                                if (cCharAt < 55296) {
                                    break;
                                }
                                i53 |= (cCharAt & 8191) << i55;
                                i55 += 13;
                                i54 = i6;
                            }
                            iCharAt3 = i53 | (cCharAt << i55);
                            i52 = i6;
                        }
/* 25 */                int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt9];
                        i2 = (iCharAt5 * 2) + iCharAt6;
                        i3 = iCharAt7;
                        i4 = iCharAt8;
                        iArr = iArr2;
                        i5 = iCharAt5;
                        i28 = i52;
                    }
/* 26 */            Unsafe unsafe = f15549p;
/* 27 */            Object[] objArr = s02Var.f16373c;
/* 29 */            Class<?> cls = s02Var.f16371a.getClass();
                    int i56 = i5;
/* 30 */            int[] iArr3 = new int[iCharAt * 3];
/* 31 */            Object[] objArr2 = new Object[iCharAt * 2];
                    int i57 = iCharAt2 + iCharAt3;
                    int i58 = i57;
                    int i59 = iCharAt3;
                    int i60 = 0;
                    int i61 = 0;
                    while (i28 < length) {
                        int i62 = i28 + 1;
/* 32 */                int iCharAt10 = str.charAt(i28);
                        int[] iArr4 = iArr3;
                        if (iCharAt10 >= 55296) {
                            int i63 = iCharAt10 & 8191;
                            int i64 = i62;
                            int i65 = 13;
                            while (true) {
                                i25 = i64 + 1;
/* 33 */                        cCharAt12 = str.charAt(i64);
                                i14 = length;
                                if (cCharAt12 < 55296) {
                                    break;
                                }
                                i63 |= (cCharAt12 & 8191) << i65;
                                i65 += 13;
                                i64 = i25;
                                length = i14;
                            }
                            iCharAt10 = i63 | (cCharAt12 << i65);
                            i15 = i25;
                        } else {
                            i14 = length;
                            i15 = i62;
                        }
                        int i66 = i15 + 1;
/* 34 */                int iCharAt11 = str.charAt(i15);
                        if (iCharAt11 >= 55296) {
                            int i67 = iCharAt11 & 8191;
                            int i68 = i66;
                            int i69 = 13;
                            while (true) {
                                i23 = i68 + 1;
/* 35 */                        cCharAt11 = str.charAt(i68);
                                i24 = i67;
                                if (cCharAt11 < 55296) {
                                    break;
                                }
                                i67 = i24 | ((cCharAt11 & 8191) << i69);
                                i69 += 13;
                                i68 = i23;
                            }
                            iCharAt11 = i24 | (cCharAt11 << i69);
                            i16 = i23;
                        } else {
                            i16 = i66;
                        }
                        int i70 = iCharAt10;
                        int i71 = iCharAt11 & 255;
                        int i72 = i3;
                        if ((iCharAt11 & Segment.SHARE_MINIMUM) != 0) {
/* 36 */                    iArr[i60] = i61;
                            i60++;
                        }
                        int i73 = i4;
                        if (i71 >= 51) {
                            int i74 = i16 + 1;
/* 37 */                    int iCharAt12 = str.charAt(i16);
                            char c = 55296;
                            if (iCharAt12 >= 55296) {
                                int i75 = iCharAt12 & 8191;
                                int i76 = 13;
                                while (true) {
                                    i22 = i74 + 1;
/* 38 */                            cCharAt10 = str.charAt(i74);
                                    if (cCharAt10 < c) {
                                        break;
                                    }
                                    i75 |= (cCharAt10 & 8191) << i76;
                                    i76 += 13;
                                    i74 = i22;
                                    c = 55296;
                                }
                                iCharAt12 = i75 | (cCharAt10 << i76);
                                i74 = i22;
                            }
                            int i77 = i71 - 51;
                            int i78 = iCharAt12;
                            if (i77 == 9 || i77 == 17) {
                                i19 = i2 + 1;
/* 40 */                        objArr2[((i61 / 3) * 2) + 1] = objArr[i2];
                            } else {
                                if (i77 == 12 && !z) {
                                    i19 = i2 + 1;
/* 39 */                            objArr2[((i61 / 3) * 2) + 1] = objArr[i2];
                                }
                                i20 = i78 * 2;
/* 41 */                        obj = objArr[i20];
/* 42 */                        if (obj instanceof Field) {
/* 43 */                            fieldM7817N2 = (Field) obj;
                                } else {
/* 44 */                            fieldM7817N2 = m7817N(cls, (String) obj);
/* 45 */                            objArr[i20] = fieldM7817N2;
                                }
                                int i79 = i74;
/* 46 */                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM7817N2);
                                i21 = i20 + 1;
/* 47 */                        obj2 = objArr[i21];
/* 48 */                        if (obj2 instanceof Field) {
/* 49 */                            fieldM7817N3 = (Field) obj2;
                                } else {
/* 50 */                            fieldM7817N3 = m7817N(cls, (String) obj2);
/* 51 */                            objArr[i21] = fieldM7817N3;
                                }
                                i17 = i79;
                                iObjectFieldOffset = iObjectFieldOffset3;
/* 52 */                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM7817N3);
                                i18 = 0;
                            }
                            i2 = i19;
                            i20 = i78 * 2;
/* 41 */                    obj = objArr[i20];
/* 42 */                    if (obj instanceof Field) {
/* 43 */                        fieldM7817N2 = (Field) obj;
                            } else {
/* 44 */                        fieldM7817N2 = m7817N(cls, (String) obj);
/* 45 */                        objArr[i20] = fieldM7817N2;
                            }
                            int i710 = i74;
/* 46 */                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM7817N2);
                            i21 = i20 + 1;
/* 47 */                    obj2 = objArr[i21];
/* 48 */                    if (obj2 instanceof Field) {
/* 49 */                        fieldM7817N3 = (Field) obj2;
                            } else {
/* 50 */                        fieldM7817N3 = m7817N(cls, (String) obj2);
/* 51 */                        objArr[i21] = fieldM7817N3;
                            }
                            i17 = i710;
                            iObjectFieldOffset = iObjectFieldOffset4;
/* 52 */                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM7817N3);
                            i18 = 0;
                        } else {
                            int i80 = i2 + 1;
/* 53 */                    Field fieldM7817N4 = m7817N(cls, (String) objArr[i2]);
                            if (i71 == 9 || i71 == 17) {
/* 59 */                        objArr2[((i61 / 3) * 2) + 1] = fieldM7817N4.getType();
                            } else {
                                if (i71 == 27 || i71 == 49) {
                                    i2 += 2;
/* 58 */                            objArr2[((i61 / 3) * 2) + 1] = objArr[i80];
                                } else if (i71 == 12 || i71 == 30 || i71 == 44) {
                                    if (!z) {
                                        i2 += 2;
/* 57 */                                objArr2[((i61 / 3) * 2) + 1] = objArr[i80];
                                    }
                                } else if (i71 == 50) {
                                    int i81 = i59 + 1;
/* 54 */                            iArr[i59] = i61;
/* 55 */                            int i82 = (i61 / 3) * 2;
                                    int i83 = i2 + 2;
                                    objArr2[i82] = objArr[i80];
                                    if ((iCharAt11 & 2048) != 0) {
/* 56 */                                objArr2[i82 + 1] = objArr[i83];
                                        i2 += 3;
                                    } else {
                                        i2 = i83;
                                    }
                                    i59 = i81;
                                }
/* 60 */                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM7817N4);
                                if ((iCharAt11 & 4096) == 4096 || i71 > 17) {
                                    iObjectFieldOffset2 = 1048575;
                                    i17 = i16;
                                    i18 = 0;
                                } else {
                                    int i84 = i16 + 1;
/* 61 */                            int iCharAt13 = str.charAt(i16);
                                    if (iCharAt13 >= 55296) {
                                        int i85 = iCharAt13 & 8191;
                                        int i86 = 13;
                                        while (true) {
                                            i17 = i84 + 1;
/* 62 */                                    cCharAt9 = str.charAt(i84);
                                            if (cCharAt9 < 55296) {
                                                break;
                                            }
                                            i85 |= (cCharAt9 & 8191) << i86;
                                            i86 += 13;
                                            i84 = i17;
                                        }
                                        iCharAt13 = i85 | (cCharAt9 << i86);
                                    } else {
                                        i17 = i84;
                                    }
/* 63 */                            int i87 = (iCharAt13 / 32) + (i56 * 2);
/* 64 */                            Object obj3 = objArr[i87];
/* 65 */                            if (obj3 instanceof Field) {
/* 66 */                                fieldM7817N = (Field) obj3;
                                    } else {
/* 67 */                                fieldM7817N = m7817N(cls, (String) obj3);
/* 68 */                                objArr[i87] = fieldM7817N;
                                    }
/* 69 */                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM7817N);
/* 70 */                            i18 = iCharAt13 % 32;
                                }
                                if (i71 >= 18 && i71 <= 49) {
/* 71 */                            iArr[i58] = iObjectFieldOffset;
                                    i58++;
                                }
                            }
                            i2 = i80;
/* 60 */                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM7817N4);
                            if ((iCharAt11 & 4096) == 4096) {
                                iObjectFieldOffset2 = 1048575;
                                i17 = i16;
                                i18 = 0;
                            } else {
                                iObjectFieldOffset2 = 1048575;
                                i17 = i16;
                                i18 = 0;
                            }
                            if (i71 >= 18) {
/* 71 */                        iArr[i58] = iObjectFieldOffset;
                                i58++;
                            }
                        }
                        int i88 = i61 + 1;
/* 72 */                iArr4[i61] = i70;
                        int i89 = i61 + 2;
                        String str2 = str;
/* 73 */                iArr4[i88] = ((iCharAt11 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? 536870912 : 0) | ((iCharAt11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | (i71 << 20) | iObjectFieldOffset;
                        i61 += 3;
/* 74 */                iArr4[i89] = (i18 << 20) | iObjectFieldOffset2;
                        str = str2;
                        iArr3 = iArr4;
                        i3 = i72;
                        length = i14;
                        i28 = i17;
                        i4 = i73;
                    }
/* 77 */            return new qh1(iArr3, objArr2, i3, i4, s02Var.f16371a, z, iArr, iCharAt3, i57, gn1Var, c81Var, tx2Var, fg0Var, hc1Var);
                }

                /* JADX INFO: renamed from: C */
                public static long m7814C(int i) {
/* 5 */             return i & 1048575;
                }

                /* JADX INFO: renamed from: D */
                public static int m7815D(Object obj, long j) {
/* 9 */             return ((Integer) my2.f14064c.m6313i(obj, j)).intValue();
                }

                /* JADX INFO: renamed from: E */
                public static long m7816E(Object obj, long j) {
/* 9 */             return ((Long) my2.f14064c.m6313i(obj, j)).longValue();
                }

                /* JADX INFO: renamed from: N */
                public static Field m7817N(Class cls, String str) {
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

                /* JADX INFO: renamed from: T */
                public static int m7818T(int i) {
/* 4 */             return (i & 267386880) >>> 20;
                }

                /* JADX INFO: renamed from: W */
                public static void m7819W(int i, Object obj, d52 d52Var) throws C1868kw {
/* 3 */             if (!(obj instanceof String)) {
/* 127 */               d52Var.m2935I(i, (AbstractC2298vl) obj);
/* 130 */               return;
                    }
/* 5 */             String str = (String) obj;
/* 9 */             C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 12 */            c1808jw.m5918r(i, 2);
/* 15 */            int i2 = c1808jw.f12515c;
/* 17 */            byte[] bArr = c1808jw.f12514b;
/* 19 */            int i3 = c1808jw.f12516d;
                    try {
/* 27 */                int iM5909i = C1808jw.m5909i(str.length() * 3);
/* 35 */                int iM5909i2 = C1808jw.m5909i(str.length());
/* 39 */                if (iM5909i2 != iM5909i) {
/* 69 */                    c1808jw.m5919s(m13.m6590b(str));
/* 72 */                    int i4 = c1808jw.f12516d;
/* 81 */                    c1808jw.f12516d = m13.f13547a.m4448o(str, bArr, i4, i2 - i4);
/* 83 */                    return;
                        }
/* 41 */                int i5 = i3 + iM5909i2;
/* 43 */                c1808jw.f12516d = i5;
/* 48 */                int iM4448o = m13.f13547a.m4448o(str, bArr, i5, i2 - i5);
/* 52 */                c1808jw.f12516d = i3;
/* 57 */                c1808jw.m5919s((iM4448o - i3) - iM5909i2);
/* 60 */                c1808jw.f12516d = iM4448o;
                    } catch (IndexOutOfBoundsException e) {
/* 90 */                throw new C1868kw(e);
                    } catch (k13 e2) {
/* 91 */                c1808jw.f12516d = i3;
/* 99 */                C1808jw.f12511e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
/* 104 */               byte[] bytes = str.getBytes(ez0.f7923a);
                        try {
/* 109 */                   c1808jw.m5919s(bytes.length);
/* 114 */                   c1808jw.m5912l(bytes, 0, bytes.length);
                        } catch (IndexOutOfBoundsException e3) {
/* 124 */                   throw new C1868kw(e3);
                        }
                    }
                }

                /* JADX INFO: renamed from: k */
                public static void m7820k(Object obj) {
/* 5 */             if (m7821s(obj)) {
/* 7 */                 return;
                    }
/* 10 */            s80.m8430k(obj, "Mutating immutable message: ");
                }

                /* JADX INFO: renamed from: s */
                public static boolean m7821s(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof sq0) {
/* 11 */                return ((sq0) obj).m8620n();
                    }
/* 16 */            return true;
                }

                /* JADX INFO: renamed from: u */
                public static List m7822u(sq0 sq0Var, long j) {
/* 7 */             return (List) my2.f14064c.m6313i(sq0Var, j);
                }

                /* JADX INFO: renamed from: F */
                public final void m7823F(Object obj, int i, long j) {
/* 1 */             Unsafe unsafe = f15549p;
/* 3 */             Object objM7841n = m7841n(i);
/* 7 */             Object object = unsafe.getObject(obj, j);
/* 13 */            this.f15563n.getClass();
/* 21 */            if (!((fc1) object).f8123a) {
/* 25 */                fc1 fc1VarM3713c = fc1.f8122b.m3713c();
/* 29 */                hc1.m4164b(fc1VarM3713c, object);
/* 32 */                unsafe.putObject(obj, j, fc1VarM3713c);
                    }
/* 35 */            pm2.m7490m(objM7841n);
/* 39 */            throw null;
                }

                /* JADX INFO: renamed from: G */
                public final int m7824G(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C0176bd c0176bd) throws pz0 {
                    int i9;
/* 13 */            Unsafe unsafe = f15549p;
/* 24 */            long j2 = this.f15550a[i8 + 2] & 1048575;
                    switch (i7) {
                        case 51:
/* 429 */                   if (i5 != 1) {
/* 427 */                       return i;
                            }
/* 443 */                   unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(k50.m5971h(bArr, i))));
/* 446 */                   int i10 = i + 8;
/* 448 */                   unsafe.putInt(obj, j2, i4);
/* 451 */                   return i10;
                        case 52:
/* 402 */                   if (i5 != 5) {
/* 400 */                       return i;
                            }
/* 416 */                   unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(k50.m5970g(bArr, i))));
/* 419 */                   int i11 = i + 4;
/* 421 */                   unsafe.putInt(obj, j2, i4);
/* 424 */                   return i11;
                        case 53:
                        case 54:
/* 379 */                   if (i5 != 0) {
/* 375 */                       return i;
                            }
/* 381 */                   int iM5979p = k50.m5979p(bArr, i, c0176bd);
/* 391 */                   unsafe.putObject(obj, j, Long.valueOf(c0176bd.f2371b));
/* 394 */                   unsafe.putInt(obj, j2, i4);
/* 397 */                   return iM5979p;
                        case 55:
                        case 62:
/* 354 */                   if (i5 != 0) {
/* 350 */                       return i;
                            }
/* 356 */                   int iM5977n = k50.m5977n(bArr, i, c0176bd);
/* 366 */                   unsafe.putObject(obj, j, Integer.valueOf(c0176bd.f2370a));
/* 369 */                   unsafe.putInt(obj, j2, i4);
/* 372 */                   return iM5977n;
                        case 56:
                        case 65:
/* 329 */                   if (i5 != 1) {
/* 327 */                       return i;
                            }
/* 339 */                   unsafe.putObject(obj, j, Long.valueOf(k50.m5971h(bArr, i)));
/* 342 */                   int i12 = i + 8;
/* 344 */                   unsafe.putInt(obj, j2, i4);
/* 347 */                   return i12;
                        case 57:
                        case 64:
/* 306 */                   if (i5 != 5) {
/* 304 */                       return i;
                            }
/* 316 */                   unsafe.putObject(obj, j, Integer.valueOf(k50.m5970g(bArr, i)));
/* 319 */                   int i13 = i + 4;
/* 321 */                   unsafe.putInt(obj, j2, i4);
/* 324 */                   return i13;
                        case 58:
/* 275 */                   if (i5 != 0) {
/* 271 */                       return i;
                            }
/* 277 */                   int iM5979p2 = k50.m5979p(bArr, i, c0176bd);
/* 295 */                   unsafe.putObject(obj, j, Boolean.valueOf(c0176bd.f2371b != 0));
/* 298 */                   unsafe.putInt(obj, j2, i4);
/* 301 */                   return iM5979p2;
                        case 59:
/* 216 */                   if (i5 != 2) {
/* 212 */                       return i;
                            }
/* 218 */                   int iM5977n2 = k50.m5977n(bArr, i, c0176bd);
/* 222 */                   int i14 = c0176bd.f2370a;
/* 224 */                   if (i14 == 0) {
/* 228 */                       unsafe.putObject(obj, j, HttpUrl.FRAGMENT_ENCODE_SET);
                            } else {
/* 236 */                       if ((i6 & 536870912) != 0) {
/* 246 */                           if (!m13.f13547a.m4449t(bArr, iM5977n2, iM5977n2 + i14)) {
/* 253 */                               throw pz0.m7623b();
                                    }
                                }
/* 261 */                       unsafe.putObject(obj, j, new String(bArr, iM5977n2, i14, ez0.f7923a));
/* 264 */                       iM5977n2 += i14;
                            }
/* 265 */                   unsafe.putInt(obj, j2, i4);
/* 268 */                   return iM5977n2;
                        case 60:
/* 183 */                   i9 = i;
/* 187 */                   if (i5 == 2) {
/* 189 */                       Object objM7851z = m7851z(i4, obj, i8);
/* 202 */                       int iM5950B = k50.m5950B(objM7851z, m7842o(i8), bArr, i9, i2, c0176bd);
/* 206 */                       m7835S(obj, i4, i8, objM7851z);
/* 209 */                       return iM5950B;
                            }
/* 100 */                   return i9;
                        case 61:
/* 162 */                   i9 = i;
/* 166 */                   if (i5 == 2) {
/* 168 */                       int iM5969f = k50.m5969f(bArr, i9, c0176bd);
/* 174 */                       unsafe.putObject(obj, j, c0176bd.f2372c);
/* 177 */                       unsafe.putInt(obj, j2, i4);
/* 180 */                       return iM5969f;
                            }
/* 100 */                   return i9;
                        case 63:
/* 134 */                   i9 = i;
/* 138 */                   if (i5 == 0) {
/* 140 */                       int iM5977n3 = k50.m5977n(bArr, i9, c0176bd);
/* 144 */                       int i15 = c0176bd.f2370a;
/* 146 */                       m7840m(i8);
/* 153 */                       unsafe.putObject(obj, j, Integer.valueOf(i15));
/* 156 */                       unsafe.putInt(obj, j2, i4);
/* 159 */                       return iM5977n3;
                            }
/* 100 */                   return i9;
                        case 66:
/* 105 */                   i9 = i;
/* 109 */                   if (i5 == 0) {
/* 111 */                       int iM5977n4 = k50.m5977n(bArr, i9, c0176bd);
/* 125 */                       unsafe.putObject(obj, j, Integer.valueOf(AbstractC1006hw.m4384d(c0176bd.f2370a)));
/* 128 */                       unsafe.putInt(obj, j2, i4);
/* 131 */                       return iM5977n4;
                            }
/* 100 */                   return i9;
                        case 67:
/* 73 */                    i9 = i;
/* 77 */                    if (i5 == 0) {
/* 79 */                        int iM5979p3 = k50.m5979p(bArr, i9, c0176bd);
/* 93 */                        unsafe.putObject(obj, j, Long.valueOf(AbstractC1006hw.m4385e(c0176bd.f2371b)));
/* 96 */                        unsafe.putInt(obj, j2, i4);
/* 99 */                        return iM5979p3;
                            }
/* 100 */                   return i9;
                        case 68:
/* 37 */                    if (i5 == 3) {
/* 39 */                        Object objM7851z2 = m7851z(i4, obj, i8);
/* 61 */                        int iM7825H = ((qh1) m7842o(i8)).m7825H(objM7851z2, bArr, i, i2, (i3 & (-8)) | 4, c0176bd);
/* 65 */                        c0176bd.f2372c = objM7851z2;
/* 67 */                        m7835S(obj, i4, i8, objM7851z2);
/* 70 */                        return iM7825H;
                            }
                        default:
/* 32 */                    return i;
                    }
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12181. Try increasing type updates limit count.
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                    */
                /* JADX INFO: renamed from: H */
                public final int m7825H(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, p000.C0176bd r35) throws p000.pz0 {
                    /*
                        Method dump skipped, instruction units count: 1218
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.qh1.m7825H(java.lang.Object, byte[], int, int, int, bd):int");
                }

                /* JADX INFO: renamed from: I */
                public final void m7826I(Object obj, byte[] bArr, int i, int i2, C0176bd c0176bd) throws pz0 {
                    int i3;
                    int iM7833Q;
                    Object obj2;
                    int i4;
                    Unsafe unsafe;
                    int i5;
                    int i6;
                    int i7;
                    byte b;
                    Object obj3;
                    byte[] bArr2;
                    int i8;
                    byte[] bArr3;
                    Object obj4;
                    byte[] bArr4;
                    Unsafe unsafe2;
                    int i9;
                    Object obj5;
                    Object obj6;
                    int i10;
                    int i11;
                    int i12;
/* 1 */             qh1 qh1Var = this;
/* 3 */             Object obj7 = obj;
/* 5 */             byte[] bArr5 = bArr;
/* 7 */             int i13 = i2;
/* 9 */             C0176bd c0176bd2 = c0176bd;
/* 11 */            m7820k(obj7);
/* 14 */            Unsafe unsafe3 = f15549p;
/* 16 */            int iM5979p = i;
/* 18 */            int i14 = -1;
/* 19 */            int i15 = 0;
/* 20 */            int i16 = 1048575;
/* 23 */            int i17 = 0;
/* 24 */            while (iM5979p < i13) {
/* 26 */                int iM5976m = iM5979p + 1;
/* 28 */                int i18 = bArr5[iM5979p];
/* 30 */                if (i18 < 0) {
/* 32 */                    iM5976m = k50.m5976m(i18, bArr5, iM5976m, c0176bd2);
/* 36 */                    i18 = c0176bd2.f2370a;
                        }
/* 38 */                i14 = i18 >>> 3;
/* 43 */                int i19 = i18 & 7;
/* 45 */                int i20 = qh1Var.f15553d;
/* 47 */                int i21 = qh1Var.f15552c;
/* 49 */                if (i14 > i14) {
/* 62 */                    iM7833Q = (i14 < i21 || i14 > i20) ? -1 : qh1Var.m7833Q(i14, i15 / 3);
/* 63 */                    i3 = 0;
                        } else if (i14 < i21 || i14 > i20) {
/* 77 */                    i3 = 0;
/* 78 */                    iM7833Q = -1;
                        } else {
/* 71 */                    i3 = 0;
/* 72 */                    iM7833Q = qh1Var.m7833Q(i14, 0);
                        }
/* 64 */                i15 = iM7833Q;
/* 80 */                if (i15 == -1) {
/* 82 */                    int i22 = iM5976m;
/* 83 */                    obj2 = obj7;
/* 84 */                    i4 = i22;
/* 85 */                    unsafe = unsafe3;
/* 87 */                    i5 = i18;
/* 90 */                    i6 = i14;
/* 92 */                    i7 = i3;
                        } else {
/* 97 */                    int[] iArr = qh1Var.f15550a;
/* 99 */                    int i23 = iArr[i15 + 1];
/* 101 */                   int iM7818T = m7818T(i23);
/* 105 */                   int i24 = i18;
/* 107 */                   long j = i23 & 1048575;
/* 116 */                   if (iM7818T <= 17) {
/* 120 */                       int i25 = iArr[i15 + 2];
/* 125 */                       int i26 = 1 << (i25 >>> 20);
/* 127 */                       int i27 = i25 & 1048575;
/* 129 */                       if (i27 != i16) {
/* 131 */                           int i28 = 1048575;
/* 135 */                           if (i16 != 1048575) {
/* 138 */                               unsafe3.putInt(obj7, i16, i17);
/* 141 */                               i28 = 1048575;
                                    }
/* 144 */                           if (i27 != i28) {
/* 147 */                               i17 = unsafe3.getInt(obj7, i27);
                                    }
/* 151 */                           i16 = i27;
                                }
                                switch (iM7818T) {
                                    case 0:
/* 532 */                               unsafe3 = unsafe3;
/* 533 */                               bArr2 = bArr5;
/* 537 */                               b = -1;
/* 539 */                               i8 = iM5976m;
/* 540 */                               if (i19 != 1) {
/* 475 */                                   obj3 = obj7;
/* 562 */                                   i5 = i24 == true ? 1 : 0;
/* 564 */                                   obj2 = obj3;
/* 565 */                                   i4 = i8;
/* 566 */                                   unsafe = unsafe3;
/* 570 */                                   i6 = i14;
/* 572 */                                   i7 = i15;
                                        } else {
/* 555 */                                   my2.f14064c.mo4049m(obj7, j, Double.longBitsToDouble(k50.m5971h(bArr2, i8)));
/* 559 */                                   iM5979p = i8 + 8;
/* 524 */                                   i17 |= i26;
/* 526 */                                   bArr5 = bArr2;
/* 529 */                                   unsafe3 = unsafe3;
/* 304 */                                   i13 = i2;
                                        }
                                        break;
                                    case 1:
/* 500 */                               unsafe3 = unsafe3;
/* 501 */                               bArr2 = bArr5;
/* 504 */                               b = -1;
/* 506 */                               i8 = iM5976m;
/* 507 */                               if (i19 != 5) {
/* 475 */                                   obj3 = obj7;
/* 562 */                                   i5 = i24 == true ? 1 : 0;
/* 564 */                                   obj2 = obj3;
/* 565 */                                   i4 = i8;
/* 566 */                                   unsafe = unsafe3;
/* 570 */                                   i6 = i14;
/* 572 */                                   i7 = i15;
                                        } else {
/* 519 */                                   my2.f14064c.mo4050n(obj7, j, Float.intBitsToFloat(k50.m5970g(bArr2, i8)));
/* 522 */                                   iM5979p = i8 + 4;
/* 524 */                                   i17 |= i26;
/* 526 */                                   bArr5 = bArr2;
/* 529 */                                   unsafe3 = unsafe3;
/* 304 */                                   i13 = i2;
                                        }
                                        break;
                                    case 2:
                                    case 3:
/* 478 */                               bArr3 = bArr5;
/* 481 */                               b = -1;
/* 483 */                               i8 = iM5976m;
/* 484 */                               if (i19 != 0) {
/* 474 */                                   unsafe3 = unsafe3;
/* 475 */                                   obj3 = obj7;
/* 562 */                                   i5 = i24 == true ? 1 : 0;
/* 564 */                                   obj2 = obj3;
/* 565 */                                   i4 = i8;
/* 566 */                                   unsafe = unsafe3;
/* 570 */                                   i6 = i14;
/* 572 */                                   i7 = i15;
                                        } else {
/* 486 */                                   int iM5979p2 = k50.m5979p(bArr3, i8, c0176bd2);
/* 492 */                                   unsafe3.putLong(obj7, j, c0176bd2.f2371b);
/* 496 */                                   i17 |= i26;
/* 498 */                                   iM5979p = iM5979p2;
/* 436 */                                   bArr5 = bArr3;
/* 304 */                                   i13 = i2;
                                        }
                                        break;
                                    case 4:
                                    case 11:
/* 453 */                               bArr3 = bArr5;
/* 456 */                               b = -1;
/* 458 */                               i8 = iM5976m;
/* 459 */                               if (i19 != 0) {
/* 474 */                                   unsafe3 = unsafe3;
/* 475 */                                   obj3 = obj7;
/* 562 */                                   i5 = i24 == true ? 1 : 0;
/* 564 */                                   obj2 = obj3;
/* 565 */                                   i4 = i8;
/* 566 */                                   unsafe = unsafe3;
/* 570 */                                   i6 = i14;
/* 572 */                                   i7 = i15;
                                        } else {
/* 461 */                                   int iM5977n = k50.m5977n(bArr3, i8, c0176bd2);
/* 467 */                                   unsafe3.putInt(obj7, j, c0176bd2.f2370a);
/* 470 */                                   i17 |= i26;
/* 472 */                                   iM5979p = iM5977n;
/* 436 */                                   bArr5 = bArr3;
/* 304 */                                   i13 = i2;
                                        }
                                        break;
                                    case 5:
                                    case 14:
/* 409 */                               Object obj8 = obj7;
/* 410 */                               bArr3 = bArr5;
/* 414 */                               b = -1;
/* 416 */                               Unsafe unsafe4 = unsafe3;
/* 417 */                               int i29 = iM5976m;
/* 418 */                               if (i19 != 1) {
/* 443 */                                   i8 = i29;
/* 448 */                                   unsafe3 = unsafe4;
/* 449 */                                   obj3 = obj8;
/* 562 */                                   i5 = i24 == true ? 1 : 0;
/* 564 */                                   obj2 = obj3;
/* 565 */                                   i4 = i8;
/* 566 */                                   unsafe = unsafe3;
/* 570 */                                   i6 = i14;
/* 572 */                                   i7 = i15;
                                        } else {
/* 421 */                                   long jM5971h = k50.m5971h(bArr3, i29);
/* 427 */                                   unsafe3 = unsafe4;
/* 428 */                                   obj7 = obj8;
/* 429 */                                   unsafe3.putLong(obj7, j, jM5971h);
/* 432 */                                   iM5979p = i29 + 8;
/* 434 */                                   i17 |= i26;
/* 436 */                                   bArr5 = bArr3;
/* 304 */                                   i13 = i2;
                                        }
                                        break;
                                    case 6:
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 389 */                               obj4 = obj7;
/* 390 */                               bArr4 = bArr5;
/* 393 */                               b = -1;
/* 395 */                               unsafe2 = unsafe3;
/* 396 */                               i9 = iM5976m;
/* 397 */                               if (i19 != 5) {
/* 350 */                                   Unsafe unsafe5 = unsafe2;
/* 352 */                                   i8 = i9;
/* 353 */                                   obj3 = obj4;
/* 354 */                                   unsafe3 = unsafe5;
/* 562 */                                   i5 = i24 == true ? 1 : 0;
/* 564 */                                   obj2 = obj3;
/* 565 */                                   i4 = i8;
/* 566 */                                   unsafe = unsafe3;
/* 570 */                                   i6 = i14;
/* 572 */                                   i7 = i15;
                                        } else {
/* 403 */                                   unsafe2.putInt(obj4, j, k50.m5970g(bArr4, i9));
/* 406 */                                   iM5979p = i9 + 4;
/* 347 */                                   i17 |= i26;
/* 299 */                                   unsafe3 = unsafe2;
/* 300 */                                   bArr5 = bArr4;
/* 303 */                                   obj7 = obj4;
/* 304 */                                   i13 = i2;
                                        }
                                        break;
                                    case 7:
/* 358 */                               obj4 = obj7;
/* 359 */                               bArr4 = bArr5;
/* 362 */                               b = -1;
/* 364 */                               unsafe2 = unsafe3;
/* 365 */                               i9 = iM5976m;
/* 366 */                               if (i19 != 0) {
/* 350 */                                   Unsafe unsafe6 = unsafe2;
/* 352 */                                   i8 = i9;
/* 353 */                                   obj3 = obj4;
/* 354 */                                   unsafe3 = unsafe6;
/* 562 */                                   i5 = i24 == true ? 1 : 0;
/* 564 */                                   obj2 = obj3;
/* 565 */                                   i4 = i8;
/* 566 */                                   unsafe = unsafe3;
/* 570 */                                   i6 = i14;
/* 572 */                                   i7 = i15;
                                        } else {
/* 368 */                                   iM5979p = k50.m5979p(bArr4, i9, c0176bd2);
/* 385 */                                   my2.f14064c.mo4047k(obj4, j, c0176bd2.f2371b != 0);
/* 347 */                                   i17 |= i26;
/* 299 */                                   unsafe3 = unsafe2;
/* 300 */                                   bArr5 = bArr4;
/* 303 */                                   obj7 = obj4;
/* 304 */                                   i13 = i2;
                                        }
                                        break;
                                    case 8:
/* 314 */                               obj4 = obj7;
/* 315 */                               bArr4 = bArr5;
/* 319 */                               b = -1;
/* 321 */                               unsafe2 = unsafe3;
/* 322 */                               i9 = iM5976m;
/* 323 */                               if (i19 != 2) {
/* 350 */                                   Unsafe unsafe7 = unsafe2;
/* 352 */                                   i8 = i9;
/* 353 */                                   obj3 = obj4;
/* 354 */                                   unsafe3 = unsafe7;
/* 562 */                                   i5 = i24 == true ? 1 : 0;
/* 564 */                                   obj2 = obj3;
/* 565 */                                   i4 = i8;
/* 566 */                                   unsafe = unsafe3;
/* 570 */                                   i6 = i14;
/* 572 */                                   i7 = i15;
                                        } else {
/* 337 */                                   iM5979p = (i23 & 536870912) == 0 ? k50.m5973j(bArr4, i9, c0176bd2) : k50.m5974k(bArr4, i9, c0176bd2);
/* 344 */                                   unsafe2.putObject(obj4, j, c0176bd2.f2372c);
/* 347 */                                   i17 |= i26;
/* 299 */                                   unsafe3 = unsafe2;
/* 300 */                                   bArr5 = bArr4;
/* 303 */                                   obj7 = obj4;
/* 304 */                                   i13 = i2;
                                        }
                                        break;
                                    case 9:
/* 266 */                               obj4 = obj7;
/* 268 */                               b = -1;
/* 270 */                               if (i19 != 2) {
/* 309 */                                   Unsafe unsafe8 = unsafe3;
/* 310 */                                   obj3 = obj4;
/* 311 */                                   unsafe3 = unsafe8;
/* 164 */                                   i8 = iM5976m;
/* 562 */                                   i5 = i24 == true ? 1 : 0;
/* 564 */                                   obj2 = obj3;
/* 565 */                                   i4 = i8;
/* 566 */                                   unsafe = unsafe3;
/* 570 */                                   i6 = i14;
/* 572 */                                   i7 = i15;
                                        } else {
/* 272 */                                   Unsafe unsafe9 = unsafe3;
/* 273 */                                   Object objM7850y = qh1Var.m7850y(i15, obj4);
/* 282 */                                   byte[] bArr6 = bArr5;
/* 283 */                                   unsafe2 = unsafe9;
/* 288 */                                   int iM5950B = k50.m5950B(objM7850y, qh1Var.m7842o(i15), bArr6, iM5976m, i13, c0176bd2);
/* 292 */                                   bArr4 = bArr6;
/* 293 */                                   qh1Var.m7834R(i15, obj4, objM7850y);
/* 296 */                                   i17 |= i26;
/* 298 */                                   iM5979p = iM5950B;
/* 299 */                                   unsafe3 = unsafe2;
/* 300 */                                   bArr5 = bArr4;
/* 303 */                                   obj7 = obj4;
/* 304 */                                   i13 = i2;
                                        }
                                        break;
                                    case 10:
/* 248 */                               obj5 = obj7;
/* 252 */                               b = -1;
/* 254 */                               if (i19 != 2) {
/* 229 */                                   obj3 = obj5;
/* 164 */                                   i8 = iM5976m;
/* 562 */                                   i5 = i24 == true ? 1 : 0;
/* 564 */                                   obj2 = obj3;
/* 565 */                                   i4 = i8;
/* 566 */                                   unsafe = unsafe3;
/* 570 */                                   i6 = i14;
/* 572 */                                   i7 = i15;
                                        } else {
/* 256 */                                   iM5979p = k50.m5969f(bArr5, iM5976m, c0176bd2);
/* 262 */                                   unsafe3.putObject(obj5, j, c0176bd2.f2372c);
/* 220 */                                   i17 |= i26;
/* 222 */                                   i15 = i15;
/* 223 */                                   i14 = i14;
/* 224 */                                   obj7 = obj5;
                                        }
                                        break;
                                    case 12:
/* 231 */                               obj5 = obj7;
/* 234 */                               b = -1;
/* 236 */                               if (i19 != 0) {
/* 229 */                                   obj3 = obj5;
/* 164 */                                   i8 = iM5976m;
/* 562 */                                   i5 = i24 == true ? 1 : 0;
/* 564 */                                   obj2 = obj3;
/* 565 */                                   i4 = i8;
/* 566 */                                   unsafe = unsafe3;
/* 570 */                                   i6 = i14;
/* 572 */                                   i7 = i15;
                                        } else {
/* 238 */                                   iM5979p = k50.m5977n(bArr5, iM5976m, c0176bd2);
/* 244 */                                   unsafe3.putInt(obj5, j, c0176bd2.f2370a);
/* 220 */                                   i17 |= i26;
/* 222 */                                   i15 = i15;
/* 223 */                                   i14 = i14;
/* 224 */                                   obj7 = obj5;
                                        }
                                        break;
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 200 */                               obj5 = obj7;
/* 203 */                               b = -1;
/* 205 */                               if (i19 != 0) {
/* 229 */                                   obj3 = obj5;
/* 164 */                                   i8 = iM5976m;
/* 562 */                                   i5 = i24 == true ? 1 : 0;
/* 564 */                                   obj2 = obj3;
/* 565 */                                   i4 = i8;
/* 566 */                                   unsafe = unsafe3;
/* 570 */                                   i6 = i14;
/* 572 */                                   i7 = i15;
                                        } else {
/* 207 */                                   iM5979p = k50.m5977n(bArr5, iM5976m, c0176bd2);
/* 217 */                                   unsafe3.putInt(obj5, j, AbstractC1006hw.m4384d(c0176bd2.f2370a));
/* 220 */                                   i17 |= i26;
/* 222 */                                   i15 = i15;
/* 223 */                                   i14 = i14;
/* 224 */                                   obj7 = obj5;
                                        }
                                        break;
                                    case 16:
/* 167 */                               if (i19 != 0) {
/* 194 */                                   b = -1;
/* 197 */                                   obj3 = obj7;
/* 164 */                                   i8 = iM5976m;
/* 562 */                                   i5 = i24 == true ? 1 : 0;
/* 564 */                                   obj2 = obj3;
/* 565 */                                   i4 = i8;
/* 566 */                                   unsafe = unsafe3;
/* 570 */                                   i6 = i14;
/* 572 */                                   i7 = i15;
                                        } else {
/* 169 */                                   int iM5979p3 = k50.m5979p(bArr5, iM5976m, c0176bd2);
/* 183 */                                   unsafe3.putLong(obj7, j, AbstractC1006hw.m4385e(c0176bd2.f2371b));
/* 187 */                                   i17 |= i26;
/* 189 */                                   i15 = i15;
/* 190 */                                   i14 = i14;
/* 191 */                                   iM5979p = iM5979p3;
                                        }
                                        break;
                                    default:
/* 159 */                               unsafe3 = unsafe3;
/* 160 */                               obj3 = obj7;
/* 162 */                               b = -1;
/* 164 */                               i8 = iM5976m;
/* 562 */                               i5 = i24 == true ? 1 : 0;
/* 564 */                               obj2 = obj3;
/* 565 */                               i4 = i8;
/* 566 */                               unsafe = unsafe3;
/* 570 */                               i6 = i14;
/* 572 */                               i7 = i15;
                                        break;
                                }
                            } else {
/* 575 */                       Object obj9 = obj7;
/* 576 */                       Unsafe unsafe10 = unsafe3;
/* 580 */                       byte[] bArr7 = bArr5;
/* 585 */                       int i30 = iM5976m;
/* 588 */                       if (iM7818T != 27) {
/* 667 */                           i5 = i24 == true ? 1 : 0;
/* 670 */                           i10 = i30;
/* 673 */                           if (iM7818T <= 49) {
/* 684 */                               unsafe = unsafe10;
/* 689 */                               i6 = i14;
/* 692 */                               int i31 = i16;
/* 694 */                               int i32 = i17;
/* 701 */                               int iM7827J = qh1Var.m7827J(obj, bArr, i10, i2, i5 == true ? 1 : 0, i19, i15, i23, iM7818T, j, c0176bd);
/* 708 */                               i7 = i15;
/* 709 */                               if (iM7827J != i10) {
/* 711 */                                   bArr5 = bArr;
/* 713 */                                   i13 = i2;
/* 715 */                                   c0176bd2 = c0176bd;
/* 717 */                                   obj7 = obj;
/* 718 */                                   iM5979p = iM7827J;
/* 719 */                                   i15 = i7;
/* 720 */                                   i16 = i31;
/* 721 */                                   i17 = i32;
/* 722 */                                   i14 = i6;
/* 724 */                                   unsafe3 = unsafe;
                                        } else {
/* 728 */                                   i4 = iM7827J;
/* 729 */                                   i16 = i31;
/* 730 */                                   i17 = i32;
/* 731 */                                   obj2 = obj;
                                        }
                                    } else {
/* 734 */                               unsafe = unsafe10;
/* 742 */                               i11 = i16;
/* 743 */                               i6 = i14;
/* 746 */                               obj6 = obj;
/* 748 */                               i7 = i15;
/* 749 */                               i12 = i17;
/* 752 */                               if (iM7818T != 50) {
/* 782 */                                   int iM7824G = qh1Var.m7824G(obj6, bArr, i10, i2, i5 == true ? 1 : 0, i6, i19, i23, iM7818T, j, i7, c0176bd);
/* 786 */                                   obj2 = obj6;
/* 788 */                                   if (iM7824G != i10) {
/* 790 */                                       qh1Var = this;
/* 792 */                                       i13 = i2;
/* 794 */                                       c0176bd2 = c0176bd;
/* 796 */                                       obj7 = obj2;
/* 797 */                                       iM5979p = iM7824G;
/* 798 */                                       i15 = i7;
/* 799 */                                       i16 = i11;
/* 800 */                                       i17 = i12;
/* 801 */                                       i14 = i6;
/* 803 */                                       unsafe3 = unsafe;
/* 805 */                                       bArr5 = bArr;
                                            } else {
/* 809 */                                       i4 = iM7824G;
/* 759 */                                       i16 = i11;
/* 760 */                                       i17 = i12;
                                            }
                                        } else if (i19 == 2) {
/* 762 */                                   qh1Var.m7823F(obj6, i7, j);
/* 766 */                                   throw null;
                                        }
                                    }
                                } else if (i19 == 2) {
/* 597 */                           cz0 cz0VarMo2899x = (cz0) unsafe10.getObject(obj9, j);
/* 604 */                           if (!((AbstractC0827d0) cz0VarMo2899x).f6945a) {
/* 606 */                               int size = cz0VarMo2899x.size();
/* 617 */                               cz0VarMo2899x = cz0VarMo2899x.mo2899x(size == 0 ? 10 : size * 2);
/* 621 */                               unsafe10.putObject(obj9, j, cz0VarMo2899x);
                                    }
/* 637 */                           int iM5972i = k50.m5972i(qh1Var.m7842o(i15), i24 == true ? 1 : 0, bArr7, i30, i2, cz0VarMo2899x, c0176bd2);
/* 641 */                           obj7 = obj;
/* 643 */                           bArr5 = bArr;
/* 645 */                           c0176bd2 = c0176bd;
/* 647 */                           iM5979p = iM5972i;
/* 648 */                           unsafe3 = unsafe10;
/* 304 */                           i13 = i2;
                                } else {
/* 651 */                           obj6 = obj;
/* 653 */                           i5 = i24 == true ? 1 : 0;
/* 655 */                           unsafe = unsafe10;
/* 657 */                           i10 = i30;
/* 658 */                           i11 = i16;
/* 659 */                           i12 = i17;
/* 662 */                           i6 = i14;
/* 664 */                           i7 = i15;
                                }
/* 757 */                       i4 = i10;
/* 758 */                       obj2 = obj6;
/* 759 */                       i16 = i11;
/* 760 */                       i17 = i12;
                            }
                        }
/* 812 */               sq0 sq0Var = (sq0) obj2;
/* 814 */               rx2 rx2VarM8318c = sq0Var.unknownFields;
/* 818 */               if (rx2VarM8318c == rx2.f16339f) {
/* 820 */                   rx2VarM8318c = rx2.m8318c();
/* 824 */                   sq0Var.unknownFields = rx2VarM8318c;
                        }
/* 834 */               int iM5975l = k50.m5975l(i5 == true ? 1 : 0, bArr, i4, i2, rx2VarM8318c, c0176bd);
/* 838 */               bArr5 = bArr;
/* 840 */               c0176bd2 = c0176bd;
/* 842 */               i13 = i2;
/* 843 */               obj7 = obj2;
/* 844 */               i15 = i7;
/* 845 */               i14 = i6;
/* 847 */               unsafe3 = unsafe;
/* 849 */               iM5979p = iM5975l;
/* 850 */               qh1Var = this;
                    }
/* 854 */           Unsafe unsafe11 = unsafe3;
/* 856 */           Object obj10 = obj7;
/* 857 */           int i33 = i13;
/* 858 */           int i34 = i16;
/* 859 */           int i35 = i17;
/* 863 */           if (i34 != 1048575) {
/* 868 */               unsafe11.putInt(obj10, i34, i35);
                    }
/* 871 */           if (iM5979p != i33) {
/* 878 */               throw pz0.m7627f();
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX INFO: renamed from: J */
                public final int m7827J(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, C0176bd c0176bd) throws pz0 {
                    int iM5978o;
/* 1 */             Unsafe unsafe = f15549p;
                    cz0 cz0VarMo2899x = (cz0) unsafe.getObject(obj, j2);
/* 3 */             if (!((AbstractC0827d0) cz0VarMo2899x).f6945a) {
/* 4 */                 int size = cz0VarMo2899x.size();
/* 5 */                 cz0VarMo2899x = cz0VarMo2899x.mo2899x(size == 0 ? 10 : size * 2);
/* 6 */                 unsafe.putObject(obj, j2, cz0VarMo2899x);
                    }
                    cz0 cz0Var = cz0VarMo2899x;
                    switch (i6) {
                        case 18:
                        case Build.API_LEVELS.API_35 /* 35 */:
                            if (i4 == 2) {
/* 175 */                       k90 k90Var = (k90) cz0Var;
/* 176 */                       int iM5977n = k50.m5977n(bArr, i, c0176bd);
/* 177 */                       int i7 = c0176bd.f2370a + iM5977n;
                                while (iM5977n < i7) {
/* 179 */                           k90Var.m6027b(Double.longBitsToDouble(k50.m5971h(bArr, iM5977n)));
                                    iM5977n += 8;
                                }
                                if (iM5977n == i7) {
                                    return iM5977n;
                                }
/* 180 */                       throw pz0.m7628g();
                            }
                            if (i4 == 1) {
/* 181 */                       k90 k90Var2 = (k90) cz0Var;
/* 183 */                       k90Var2.m6027b(Double.longBitsToDouble(k50.m5971h(bArr, i)));
                                i += 8;
                                while (i < i2) {
/* 184 */                           int iM5977n2 = k50.m5977n(bArr, i, c0176bd);
/* 185 */                           if (i3 == c0176bd.f2370a) {
/* 187 */                               k90Var2.m6027b(Double.longBitsToDouble(k50.m5971h(bArr, iM5977n2)));
                                        i = iM5977n2 + 8;
                                    }
                                }
                            }
                            return i;
                        case 19:
                        case Build.API_LEVELS.API_36 /* 36 */:
                            if (i4 == 2) {
/* 162 */                       qj0 qj0Var = (qj0) cz0Var;
/* 163 */                       int iM5977n3 = k50.m5977n(bArr, i, c0176bd);
/* 164 */                       int i8 = c0176bd.f2370a + iM5977n3;
                                while (iM5977n3 < i8) {
/* 166 */                           qj0Var.m7867b(Float.intBitsToFloat(k50.m5970g(bArr, iM5977n3)));
                                    iM5977n3 += 4;
                                }
                                if (iM5977n3 == i8) {
                                    return iM5977n3;
                                }
/* 167 */                       throw pz0.m7628g();
                            }
                            if (i4 == 5) {
/* 168 */                       qj0 qj0Var2 = (qj0) cz0Var;
/* 170 */                       qj0Var2.m7867b(Float.intBitsToFloat(k50.m5970g(bArr, i)));
                                int i9 = i + 4;
                                while (i9 < i2) {
/* 171 */                           int iM5977n4 = k50.m5977n(bArr, i9, c0176bd);
/* 172 */                           if (i3 != c0176bd.f2370a) {
                                        return i9;
                                    }
/* 174 */                           qj0Var2.m7867b(Float.intBitsToFloat(k50.m5970g(bArr, iM5977n4)));
                                    i9 = iM5977n4 + 4;
                                }
                                return i9;
                            }
                            return i;
                        case 20:
                        case Build.API_LEVELS.API_21 /* 21 */:
                        case 37:
                        case 38:
                            if (i4 == 2) {
/* 149 */                       ja1 ja1Var = (ja1) cz0Var;
/* 150 */                       int iM5977n5 = k50.m5977n(bArr, i, c0176bd);
/* 151 */                       int i10 = c0176bd.f2370a + iM5977n5;
                                while (iM5977n5 < i10) {
/* 152 */                           iM5977n5 = k50.m5979p(bArr, iM5977n5, c0176bd);
/* 153 */                           ja1Var.m5731b(c0176bd.f2371b);
                                }
                                if (iM5977n5 == i10) {
                                    return iM5977n5;
                                }
/* 154 */                       throw pz0.m7628g();
                            }
                            if (i4 == 0) {
/* 155 */                       ja1 ja1Var2 = (ja1) cz0Var;
/* 156 */                       int iM5979p = k50.m5979p(bArr, i, c0176bd);
/* 157 */                       ja1Var2.m5731b(c0176bd.f2371b);
                                while (iM5979p < i2) {
/* 158 */                           int iM5977n6 = k50.m5977n(bArr, iM5979p, c0176bd);
/* 159 */                           if (i3 != c0176bd.f2370a) {
                                        return iM5979p;
                                    }
/* 160 */                           iM5979p = k50.m5979p(bArr, iM5977n6, c0176bd);
/* 161 */                           ja1Var2.m5731b(c0176bd.f2371b);
                                }
                                return iM5979p;
                            }
                            return i;
                        case Build.API_LEVELS.API_22 /* 22 */:
                        case Build.API_LEVELS.API_29 /* 29 */:
                        case 39:
                        case 43:
                            if (i4 != 2) {
                                if (i4 == 0) {
/* 148 */                           return k50.m5978o(i3, bArr, i, i2, cz0Var, c0176bd);
                                }
                                return i;
                            }
/* 142 */                   ry0 ry0Var = (ry0) cz0Var;
/* 143 */                   int iM5977n7 = k50.m5977n(bArr, i, c0176bd);
/* 144 */                   int i11 = c0176bd.f2370a + iM5977n7;
                            while (iM5977n7 < i11) {
/* 145 */                       iM5977n7 = k50.m5977n(bArr, iM5977n7, c0176bd);
/* 146 */                       ry0Var.m8332b(c0176bd.f2370a);
                            }
                            if (iM5977n7 == i11) {
                                return iM5977n7;
                            }
/* 147 */                   throw pz0.m7628g();
                        case Build.API_LEVELS.API_23 /* 23 */:
                        case 32:
                        case RequestError.NETWORK_FAILURE /* 40 */:
                        case 46:
                            if (i4 == 2) {
/* 132 */                       ja1 ja1Var3 = (ja1) cz0Var;
/* 133 */                       int iM5977n8 = k50.m5977n(bArr, i, c0176bd);
/* 134 */                       int i12 = c0176bd.f2370a + iM5977n8;
                                while (iM5977n8 < i12) {
/* 135 */                           ja1Var3.m5731b(k50.m5971h(bArr, iM5977n8));
                                    iM5977n8 += 8;
                                }
                                if (iM5977n8 == i12) {
                                    return iM5977n8;
                                }
/* 136 */                       throw pz0.m7628g();
                            }
                            if (i4 == 1) {
/* 137 */                       ja1 ja1Var4 = (ja1) cz0Var;
/* 138 */                       ja1Var4.m5731b(k50.m5971h(bArr, i));
                                int i13 = i + 8;
                                while (i13 < i2) {
/* 139 */                           int iM5977n9 = k50.m5977n(bArr, i13, c0176bd);
/* 140 */                           if (i3 != c0176bd.f2370a) {
                                        return i13;
                                    }
/* 141 */                           ja1Var4.m5731b(k50.m5971h(bArr, iM5977n9));
                                    i13 = iM5977n9 + 8;
                                }
                                return i13;
                            }
                            return i;
                        case 24:
                        case Build.API_LEVELS.API_31 /* 31 */:
                        case RequestError.NO_DEV_KEY /* 41 */:
                        case 45:
                            if (i4 == 2) {
/* 122 */                       ry0 ry0Var2 = (ry0) cz0Var;
/* 123 */                       int iM5977n10 = k50.m5977n(bArr, i, c0176bd);
/* 124 */                       int i14 = c0176bd.f2370a + iM5977n10;
                                while (iM5977n10 < i14) {
/* 125 */                           ry0Var2.m8332b(k50.m5970g(bArr, iM5977n10));
                                    iM5977n10 += 4;
                                }
                                if (iM5977n10 == i14) {
                                    return iM5977n10;
                                }
/* 126 */                       throw pz0.m7628g();
                            }
                            if (i4 == 5) {
/* 127 */                       ry0 ry0Var3 = (ry0) cz0Var;
/* 128 */                       ry0Var3.m8332b(k50.m5970g(bArr, i));
                                int i15 = i + 4;
                                while (i15 < i2) {
/* 129 */                           int iM5977n11 = k50.m5977n(bArr, i15, c0176bd);
/* 130 */                           if (i3 != c0176bd.f2370a) {
                                        return i15;
                                    }
/* 131 */                           ry0Var3.m8332b(k50.m5970g(bArr, iM5977n11));
                                    i15 = iM5977n11 + 4;
                                }
                                return i15;
                            }
                            return i;
                        case Build.API_LEVELS.API_25 /* 25 */:
                        case 42:
                            if (i4 == 2) {
/* 109 */                       AbstractC0022ak abstractC0022ak = (AbstractC0022ak) cz0Var;
/* 110 */                       int iM5977n12 = k50.m5977n(bArr, i, c0176bd);
/* 111 */                       int i16 = c0176bd.f2370a + iM5977n12;
                                while (iM5977n12 < i16) {
/* 112 */                           iM5977n12 = k50.m5979p(bArr, iM5977n12, c0176bd);
                                    abstractC0022ak.m297b(c0176bd.f2371b != 0);
                                }
                                if (iM5977n12 == i16) {
                                    return iM5977n12;
                                }
/* 114 */                       throw pz0.m7628g();
                            }
                            if (i4 == 0) {
/* 115 */                       AbstractC0022ak abstractC0022ak2 = (AbstractC0022ak) cz0Var;
/* 116 */                       int iM5979p2 = k50.m5979p(bArr, i, c0176bd);
                                abstractC0022ak2.m297b(c0176bd.f2371b != 0);
                                while (iM5979p2 < i2) {
/* 118 */                           int iM5977n13 = k50.m5977n(bArr, iM5979p2, c0176bd);
/* 119 */                           if (i3 != c0176bd.f2370a) {
                                        return iM5979p2;
                                    }
/* 120 */                           iM5979p2 = k50.m5979p(bArr, iM5977n13, c0176bd);
                                    abstractC0022ak2.m297b(c0176bd.f2371b != 0);
                                }
                                return iM5979p2;
                            }
                            return i;
                        case Build.API_LEVELS.API_26 /* 26 */:
                            if (i4 == 2) {
                                if ((j & 536870912) == 0) {
/* 77 */                            int iM5977n14 = k50.m5977n(bArr, i, c0176bd);
/* 78 */                            int i17 = c0176bd.f2370a;
                                    if (i17 < 0) {
/* 90 */                                throw pz0.m7626e();
                                    }
                                    if (i17 == 0) {
/* 79 */                                cz0Var.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                    } else {
/* 81 */                                cz0Var.add(new String(bArr, iM5977n14, i17, ez0.f7923a));
                                        iM5977n14 += i17;
                                    }
                                    while (iM5977n14 < i2) {
/* 82 */                                int iM5977n15 = k50.m5977n(bArr, iM5977n14, c0176bd);
/* 83 */                                if (i3 != c0176bd.f2370a) {
                                            return iM5977n14;
                                        }
/* 84 */                                iM5977n14 = k50.m5977n(bArr, iM5977n15, c0176bd);
/* 85 */                                int i18 = c0176bd.f2370a;
                                        if (i18 < 0) {
/* 89 */                                    throw pz0.m7626e();
                                        }
                                        if (i18 == 0) {
/* 86 */                                    cz0Var.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                        } else {
/* 88 */                                    cz0Var.add(new String(bArr, iM5977n14, i18, ez0.f7923a));
                                            iM5977n14 += i18;
                                        }
                                    }
                                    return iM5977n14;
                                }
/* 91 */                        int iM5977n16 = k50.m5977n(bArr, i, c0176bd);
/* 92 */                        int i19 = c0176bd.f2370a;
                                if (i19 < 0) {
/* 108 */                           throw pz0.m7626e();
                                }
                                if (i19 == 0) {
/* 93 */                            cz0Var.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
                                    int i20 = iM5977n16 + i19;
/* 94 */                            if (!m13.f13547a.m4449t(bArr, iM5977n16, i20)) {
/* 107 */                               throw pz0.m7623b();
                                    }
/* 96 */                            cz0Var.add(new String(bArr, iM5977n16, i19, ez0.f7923a));
                                    iM5977n16 = i20;
                                }
                                while (iM5977n16 < i2) {
/* 97 */                            int iM5977n17 = k50.m5977n(bArr, iM5977n16, c0176bd);
/* 98 */                            if (i3 != c0176bd.f2370a) {
                                        return iM5977n16;
                                    }
/* 99 */                            iM5977n16 = k50.m5977n(bArr, iM5977n17, c0176bd);
/* 100 */                           int i21 = c0176bd.f2370a;
                                    if (i21 < 0) {
/* 106 */                               throw pz0.m7626e();
                                    }
                                    if (i21 == 0) {
/* 101 */                               cz0Var.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                    } else {
                                        int i22 = iM5977n16 + i21;
/* 102 */                               if (!m13.f13547a.m4449t(bArr, iM5977n16, i22)) {
/* 105 */                                   throw pz0.m7623b();
                                        }
/* 104 */                               cz0Var.add(new String(bArr, iM5977n16, i21, ez0.f7923a));
                                        iM5977n16 = i22;
                                    }
                                }
                                return iM5977n16;
                            }
                            return i;
                        case Build.API_LEVELS.API_27 /* 27 */:
                            if (i4 == 2) {
/* 75 */                        return k50.m5972i(m7842o(i5), i3, bArr, i, i2, cz0Var, c0176bd);
                            }
                            return i;
                        case Build.API_LEVELS.API_28 /* 28 */:
                            if (i4 == 2) {
/* 58 */                        int iM5977n18 = k50.m5977n(bArr, i, c0176bd);
/* 59 */                        int i23 = c0176bd.f2370a;
                                if (i23 < 0) {
/* 73 */                            throw pz0.m7626e();
                                }
/* 60 */                        if (i23 > bArr.length - iM5977n18) {
/* 72 */                            throw pz0.m7628g();
                                }
                                if (i23 == 0) {
/* 61 */                            cz0Var.add(AbstractC2298vl.f18234b);
                                } else {
/* 62 */                            cz0Var.add(AbstractC2298vl.m9303c(bArr, iM5977n18, i23));
                                    iM5977n18 += i23;
                                }
                                while (iM5977n18 < i2) {
/* 63 */                            int iM5977n19 = k50.m5977n(bArr, iM5977n18, c0176bd);
/* 64 */                            if (i3 != c0176bd.f2370a) {
                                        return iM5977n18;
                                    }
/* 65 */                            iM5977n18 = k50.m5977n(bArr, iM5977n19, c0176bd);
/* 66 */                            int i24 = c0176bd.f2370a;
                                    if (i24 < 0) {
/* 71 */                                throw pz0.m7626e();
                                    }
/* 67 */                            if (i24 > bArr.length - iM5977n18) {
/* 70 */                                throw pz0.m7628g();
                                    }
                                    if (i24 == 0) {
/* 68 */                                cz0Var.add(AbstractC2298vl.f18234b);
                                    } else {
/* 69 */                                cz0Var.add(AbstractC2298vl.m9303c(bArr, iM5977n18, i24));
                                        iM5977n18 += i24;
                                    }
                                }
                                return iM5977n18;
                            }
                            return i;
                        case Build.API_LEVELS.API_30 /* 30 */:
                        case 44:
                            if (i4 != 2) {
                                if (i4 == 0) {
/* 55 */                            iM5978o = k50.m5978o(i3, bArr, i, i2, cz0Var, c0176bd);
                                }
                                return i;
                            }
/* 49 */                    ry0 ry0Var4 = (ry0) cz0Var;
/* 50 */                    iM5978o = k50.m5977n(bArr, i, c0176bd);
/* 51 */                    int i25 = c0176bd.f2370a + iM5978o;
                            while (iM5978o < i25) {
/* 52 */                        iM5978o = k50.m5977n(bArr, iM5978o, c0176bd);
/* 53 */                        ry0Var4.m8332b(c0176bd.f2370a);
                            }
                            if (iM5978o != i25) {
/* 54 */                        throw pz0.m7628g();
                            }
/* 56 */                    m7840m(i5);
/* 57 */                    Class cls = l72.f13131a;
                            return iM5978o;
                        case Build.API_LEVELS.API_33 /* 33 */:
                        case 47:
                            if (i4 == 2) {
/* 36 */                        ry0 ry0Var5 = (ry0) cz0Var;
/* 37 */                        int iM5977n20 = k50.m5977n(bArr, i, c0176bd);
/* 38 */                        int i26 = c0176bd.f2370a + iM5977n20;
                                while (iM5977n20 < i26) {
/* 39 */                            iM5977n20 = k50.m5977n(bArr, iM5977n20, c0176bd);
/* 40 */                            ry0Var5.m8332b(AbstractC1006hw.m4384d(c0176bd.f2370a));
                                }
                                if (iM5977n20 == i26) {
                                    return iM5977n20;
                                }
/* 41 */                        throw pz0.m7628g();
                            }
                            if (i4 == 0) {
/* 42 */                        ry0 ry0Var6 = (ry0) cz0Var;
/* 43 */                        int iM5977n21 = k50.m5977n(bArr, i, c0176bd);
/* 44 */                        ry0Var6.m8332b(AbstractC1006hw.m4384d(c0176bd.f2370a));
                                while (iM5977n21 < i2) {
/* 45 */                            int iM5977n22 = k50.m5977n(bArr, iM5977n21, c0176bd);
/* 46 */                            if (i3 != c0176bd.f2370a) {
                                        return iM5977n21;
                                    }
/* 47 */                            iM5977n21 = k50.m5977n(bArr, iM5977n22, c0176bd);
/* 48 */                            ry0Var6.m8332b(AbstractC1006hw.m4384d(c0176bd.f2370a));
                                }
                                return iM5977n21;
                            }
                            return i;
                        case Build.API_LEVELS.API_34 /* 34 */:
                        case 48:
                            if (i4 == 2) {
/* 23 */                        ja1 ja1Var5 = (ja1) cz0Var;
/* 24 */                        int iM5977n23 = k50.m5977n(bArr, i, c0176bd);
/* 25 */                        int i27 = c0176bd.f2370a + iM5977n23;
                                while (iM5977n23 < i27) {
/* 26 */                            iM5977n23 = k50.m5979p(bArr, iM5977n23, c0176bd);
/* 27 */                            ja1Var5.m5731b(AbstractC1006hw.m4385e(c0176bd.f2371b));
                                }
                                if (iM5977n23 == i27) {
                                    return iM5977n23;
                                }
/* 28 */                        throw pz0.m7628g();
                            }
                            if (i4 == 0) {
/* 29 */                        ja1 ja1Var6 = (ja1) cz0Var;
/* 30 */                        int iM5979p3 = k50.m5979p(bArr, i, c0176bd);
/* 31 */                        ja1Var6.m5731b(AbstractC1006hw.m4385e(c0176bd.f2371b));
                                while (iM5979p3 < i2) {
/* 32 */                            int iM5977n24 = k50.m5977n(bArr, iM5979p3, c0176bd);
/* 33 */                            if (i3 != c0176bd.f2370a) {
                                        return iM5979p3;
                                    }
/* 34 */                            iM5979p3 = k50.m5979p(bArr, iM5977n24, c0176bd);
/* 35 */                            ja1Var6.m5731b(AbstractC1006hw.m4385e(c0176bd.f2371b));
                                }
                                return iM5979p3;
                            }
                            return i;
                        case 49:
                            if (i4 == 3) {
/* 7 */                         h72 h72VarM7842o = m7842o(i5);
                                int i28 = (i3 & (-8)) | 4;
/* 8 */                         Object objNewInstance = h72VarM7842o.newInstance();
/* 9 */                         qh1 qh1Var = (qh1) h72VarM7842o;
/* 10 */                        int iM7825H = qh1Var.m7825H(objNewInstance, bArr, i, i2, i28, c0176bd);
/* 11 */                        c0176bd.f2372c = objNewInstance;
/* 12 */                        h72VarM7842o.mo4124b(objNewInstance);
/* 13 */                        c0176bd.f2372c = objNewInstance;
/* 14 */                        cz0Var.add(objNewInstance);
                                while (iM7825H < i2) {
/* 15 */                            int iM5977n25 = k50.m5977n(bArr, iM7825H, c0176bd);
/* 16 */                            if (i3 != c0176bd.f2370a) {
                                        return iM7825H;
                                    }
/* 17 */                            Object objNewInstance2 = h72VarM7842o.newInstance();
/* 18 */                            iM7825H = qh1Var.m7825H(objNewInstance2, bArr, iM5977n25, i2, i28, c0176bd);
/* 19 */                            c0176bd.f2372c = objNewInstance2;
/* 20 */                            h72VarM7842o.mo4124b(objNewInstance2);
/* 21 */                            c0176bd.f2372c = objNewInstance2;
/* 22 */                            cz0Var.add(objNewInstance2);
                                }
                                return iM7825H;
                            }
                            return i;
                        default:
                            return i;
                    }
                }

                /* JADX INFO: renamed from: K */
                public final void m7828K(Object obj, long j, C1771iw c1771iw, h72 h72Var, dg0 dg0Var) throws nz0 {
                    int iMo3246C;
/* 3 */             List listMo103c = this.f15561l.mo103c(obj, j);
/* 9 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) c1771iw.f11948e;
/* 11 */            int i = c1771iw.f11945b;
/* 16 */            if ((i & 7) != 3) {
/* 55 */                throw pz0.m7624c();
                    }
/* 46 */            do {
/* 18 */                Object objNewInstance = h72Var.newInstance();
/* 22 */                c1771iw.m5586d(objNewInstance, h72Var, dg0Var);
/* 25 */                h72Var.mo4124b(objNewInstance);
/* 28 */                listMo103c.add(objNewInstance);
/* 35 */                if (abstractC1006hw.mo3257g() || c1771iw.f11947d != 0) {
/* 50 */                    return;
                        } else {
/* 42 */                    iMo3246C = abstractC1006hw.mo3246C();
                        }
/* 46 */            } while (iMo3246C == i);
/* 48 */            c1771iw.f11947d = iMo3246C;
                }

                /* JADX INFO: renamed from: L */
                public final void m7829L(Object obj, int i, C1771iw c1771iw, h72 h72Var, dg0 dg0Var) throws pz0 {
                    int iMo3246C;
/* 8 */             List listMo103c = this.f15561l.mo103c(obj, i & 1048575);
/* 14 */            AbstractC1006hw abstractC1006hw = (AbstractC1006hw) c1771iw.f11948e;
/* 16 */            int i2 = c1771iw.f11945b;
/* 21 */            if ((i2 & 7) != 2) {
/* 60 */                throw pz0.m7624c();
                    }
/* 51 */            do {
/* 23 */                Object objNewInstance = h72Var.newInstance();
/* 27 */                c1771iw.m5588f(objNewInstance, h72Var, dg0Var);
/* 30 */                h72Var.mo4124b(objNewInstance);
/* 33 */                listMo103c.add(objNewInstance);
/* 40 */                if (abstractC1006hw.mo3257g() || c1771iw.f11947d != 0) {
/* 55 */                    return;
                        } else {
/* 47 */                    iMo3246C = abstractC1006hw.mo3246C();
                        }
/* 51 */            } while (iMo3246C == i2);
/* 53 */            c1771iw.f11947d = iMo3246C;
                }

                /* JADX INFO: renamed from: M */
                public final void m7830M(int i, C1771iw c1771iw, Object obj) throws oz0, nz0 {
/* 8 */             if ((536870912 & i) != 0) {
/* 13 */                c1771iw.m5581R(2);
/* 24 */                my2.m6830p(obj, i & 1048575, ((AbstractC1006hw) c1771iw.f11948e).mo3245B());
                    } else if (!this.f15555f) {
/* 57 */                my2.m6830p(obj, i & 1048575, c1771iw.m5593k());
                    } else {
/* 35 */                c1771iw.m5581R(2);
/* 46 */                my2.m6830p(obj, i & 1048575, ((AbstractC1006hw) c1771iw.f11948e).mo3244A());
                    }
                }

                /* JADX INFO: renamed from: O */
                public final void m7831O(int i, Object obj) {
/* 5 */             int i2 = this.f15550a[i + 2];
/* 10 */            long j = 1048575 & i2;
/* 17 */            if (j == 1048575) {
/* 19 */                return;
                    }
/* 32 */            my2.m6828n(obj, (1 << (i2 >>> 20)) | my2.f14064c.m6311g(obj, j), j);
                }

                /* JADX INFO: renamed from: P */
                public final void m7832P(int i, Object obj, int i2) {
/* 12 */            my2.m6828n(obj, i, this.f15550a[i2 + 2] & 1048575);
                }

                /* JADX INFO: renamed from: Q */
                public final int m7833Q(int i, int i2) {
/* 1 */             int[] iArr = this.f15550a;
/* 6 */             int length = (iArr.length / 3) - 1;
/* 8 */             while (i2 <= length) {
/* 12 */                int i3 = (length + i2) >>> 1;
/* 14 */                int i4 = i3 * 3;
/* 16 */                int i5 = iArr[i4];
/* 18 */                if (i == i5) {
/* 20 */                    return i4;
                        }
/* 21 */                if (i < i5) {
/* 23 */                    length = i3 - 1;
                        } else {
/* 27 */                    i2 = i3 + 1;
                        }
                    }
/* 31 */            return -1;
                }

                /* JADX INFO: renamed from: R */
                public final void m7834R(int i, Object obj, Object obj2) {
/* 12 */            f15549p.putObject(obj, m7836U(i) & 1048575, obj2);
/* 15 */            m7831O(i, obj);
                }

                /* JADX INFO: renamed from: S */
                public final void m7835S(Object obj, int i, int i2, Object obj2) {
/* 12 */            f15549p.putObject(obj, m7836U(i2) & 1048575, obj2);
/* 15 */            m7832P(i, obj, i2);
                }

                /* JADX INFO: renamed from: U */
                public final int m7836U(int i) {
/* 5 */             return this.f15550a[i + 1];
                }

                /* JADX INFO: renamed from: V */
                public final void m7837V(Object obj, d52 d52Var) throws C1868kw {
                    int i;
                    int i2;
                    int i3;
/* 7 */             int[] iArr = this.f15550a;
/* 9 */             int length = iArr.length;
/* 10 */            Unsafe unsafe = f15549p;
/* 13 */            int i4 = 1048575;
/* 16 */            int i5 = 0;
/* 17 */            for (int i6 = 0; i6 < length; i6 = i3 + 3) {
/* 19 */                int iM7836U = m7836U(i6);
/* 23 */                int i7 = iArr[i6];
/* 25 */                int iM7818T = m7818T(iM7836U);
/* 32 */                if (iM7818T <= 17) {
/* 36 */                    int i8 = iArr[i6 + 2];
/* 38 */                    i = 1048575;
/* 41 */                    int i9 = i8 & 1048575;
/* 43 */                    if (i9 != i4) {
/* 46 */                        i5 = unsafe.getInt(obj, i9);
/* 50 */                        i4 = i9;
                            }
/* 53 */                    i2 = 1 << (i8 >>> 20);
                        } else {
/* 56 */                    i = 1048575;
/* 59 */                    i2 = 0;
                        }
/* 62 */                int i10 = i6;
/* 60 */                long j = iM7836U & i;
                        switch (iM7818T) {
                            case 0:
/* 1378 */                      i3 = i10;
/* 1382 */                      if ((i2 & i5) != 0) {
/* 1386 */                          double dMo4045e = my2.f14064c.mo4045e(obj, j);
/* 1392 */                          C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 1394 */                          c1808jw.getClass();
/* 1401 */                          c1808jw.m5915o(i7, Double.doubleToRawLongBits(dMo4045e));
                                    continue;
                                }
                                break;
                            case 1:
/* 1351 */                      i3 = i10;
/* 1355 */                      if ((i2 & i5) != 0) {
/* 1359 */                          float fMo4046f = my2.f14064c.mo4046f(obj, j);
/* 1365 */                          C1808jw c1808jw2 = (C1808jw) d52Var.f7001a;
/* 1367 */                          c1808jw2.getClass();
/* 1374 */                          c1808jw2.m5913m(i7, Float.floatToRawIntBits(fMo4046f));
                                } else {
                                    continue;
                                }
                                break;
                            case 2:
/* 1333 */                      i3 = i10;
/* 1337 */                      if ((i2 & i5) != 0) {
/* 1347 */                          ((C1808jw) d52Var.f7001a).m5920t(i7, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
                                break;
                            case 3:
/* 1315 */                      i3 = i10;
/* 1319 */                      if ((i2 & i5) != 0) {
/* 1329 */                          ((C1808jw) d52Var.f7001a).m5920t(i7, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
                                break;
                            case 4:
/* 1294 */                      i3 = i10;
/* 1297 */                      if ((i2 & i5) != 0) {
/* 1299 */                          int i11 = unsafe.getInt(obj, j);
/* 1305 */                          C1808jw c1808jw3 = (C1808jw) d52Var.f7001a;
/* 1308 */                          c1808jw3.m5918r(i7, 0);
/* 1311 */                          c1808jw3.m5917q(i11);
                                }
                                break;
                            case 5:
/* 1276 */                      i3 = i10;
/* 1279 */                      if ((i2 & i5) != 0) {
/* 1289 */                          ((C1808jw) d52Var.f7001a).m5915o(i7, unsafe.getLong(obj, j));
                                }
                                break;
                            case 6:
/* 1258 */                      i3 = i10;
/* 1261 */                      if ((i2 & i5) != 0) {
/* 1271 */                          ((C1808jw) d52Var.f7001a).m5913m(i7, unsafe.getInt(obj, j));
                                }
                                break;
                            case 7:
/* 1233 */                      i3 = i10;
/* 1236 */                      if ((i2 & i5) != 0) {
/* 1240 */                          boolean zMo4043c = my2.f14064c.mo4043c(obj, j);
/* 1246 */                          C1808jw c1808jw4 = (C1808jw) d52Var.f7001a;
/* 1249 */                          c1808jw4.m5918r(i7, 0);
/* 1253 */                          c1808jw4.m5911k(zMo4043c ? (byte) 1 : (byte) 0);
                                }
                                break;
                            case 8:
/* 1219 */                      i3 = i10;
/* 1222 */                      if ((i2 & i5) != 0) {
/* 1228 */                          m7819W(i7, unsafe.getObject(obj, j), d52Var);
                                }
                                break;
                            case 9:
/* 1201 */                      i3 = i10;
/* 1204 */                      if ((i2 & i5) != 0) {
/* 1214 */                          d52Var.m2937K(i7, unsafe.getObject(obj, j), m7842o(i3));
                                }
                                break;
                            case 10:
/* 1185 */                      i3 = i10;
/* 1188 */                      if ((i2 & i5) != 0) {
/* 1196 */                          d52Var.m2935I(i7, (AbstractC2298vl) unsafe.getObject(obj, j));
                                }
                                break;
                            case 11:
/* 1163 */                      i3 = i10;
/* 1167 */                      if ((i2 & i5) != 0) {
/* 1169 */                          int i12 = unsafe.getInt(obj, j);
/* 1175 */                          C1808jw c1808jw5 = (C1808jw) d52Var.f7001a;
/* 1177 */                          c1808jw5.m5918r(i7, 0);
/* 1180 */                          c1808jw5.m5919s(i12);
                                }
                                break;
                            case 12:
/* 1141 */                      i3 = i10;
/* 1144 */                      if ((i2 & i5) != 0) {
/* 1146 */                          int i13 = unsafe.getInt(obj, j);
/* 1152 */                          C1808jw c1808jw6 = (C1808jw) d52Var.f7001a;
/* 1155 */                          c1808jw6.m5918r(i7, 0);
/* 1158 */                          c1808jw6.m5917q(i13);
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1123 */                      i3 = i10;
/* 1126 */                      if ((i2 & i5) != 0) {
/* 1136 */                          ((C1808jw) d52Var.f7001a).m5913m(i7, unsafe.getInt(obj, j));
                                }
                                break;
                            case 14:
/* 1105 */                      i3 = i10;
/* 1108 */                      if ((i2 & i5) != 0) {
/* 1118 */                          ((C1808jw) d52Var.f7001a).m5915o(i7, unsafe.getLong(obj, j));
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1078 */                      i3 = i10;
/* 1081 */                      if ((i2 & i5) != 0) {
/* 1083 */                          int i14 = unsafe.getInt(obj, j);
/* 1089 */                          C1808jw c1808jw7 = (C1808jw) d52Var.f7001a;
/* 1097 */                          c1808jw7.m5918r(i7, 0);
/* 1100 */                          c1808jw7.m5919s((i14 >> 31) ^ (i14 << 1));
                                }
                                break;
                            case 16:
/* 1055 */                      i3 = i10;
/* 1058 */                      if ((i2 & i5) != 0) {
/* 1060 */                          long j2 = unsafe.getLong(obj, j);
/* 1073 */                          ((C1808jw) d52Var.f7001a).m5920t(i7, (j2 << 1) ^ (j2 >> 63));
                                }
                                break;
                            case 17:
/* 1037 */                      i3 = i10;
/* 1040 */                      if ((i2 & i5) != 0) {
/* 1050 */                          d52Var.m2936J(i7, unsafe.getObject(obj, j), m7842o(i3));
                                }
                                break;
                            case 18:
/* 1021 */                      i3 = i10;
/* 1032 */                      l72.m6352A(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                break;
                            case 19:
/* 1005 */                      i3 = i10;
/* 1016 */                      l72.m6356E(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                continue;
                                break;
                            case 20:
/* 989 */                       i3 = i10;
/* 1000 */                      l72.m6359H(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                continue;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 973 */                       i3 = i10;
/* 984 */                       l72.m6367P(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                continue;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 957 */                       i3 = i10;
/* 968 */                       l72.m6358G(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                continue;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 941 */                       i3 = i10;
/* 952 */                       l72.m6355D(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                continue;
                                break;
                            case 24:
/* 925 */                       i3 = i10;
/* 936 */                       l72.m6354C(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                continue;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 909 */                       i3 = i10;
/* 920 */                       l72.m6392y(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                continue;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 894 */                       i3 = i10;
/* 904 */                       l72.m6365N(iArr[i3], (List) unsafe.getObject(obj, j), d52Var);
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 875 */                       i3 = i10;
/* 889 */                       l72.m6360I(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, m7842o(i3));
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 860 */                       i3 = i10;
/* 870 */                       l72.m6393z(iArr[i3], (List) unsafe.getObject(obj, j), d52Var);
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 844 */                       i3 = i10;
/* 855 */                       l72.m6366O(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 828 */                       i3 = i10;
/* 839 */                       l72.m6353B(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                continue;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 812 */                       i3 = i10;
/* 823 */                       l72.m6361J(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                continue;
                                break;
                            case 32:
/* 796 */                       i3 = i10;
/* 807 */                       l72.m6362K(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                continue;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 780 */                       i3 = i10;
/* 791 */                       l72.m6363L(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                continue;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 764 */                       i3 = i10;
/* 775 */                       l72.m6364M(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, false);
                                continue;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 749 */                       i3 = i10;
/* 759 */                       l72.m6352A(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 734 */                       i3 = i10;
/* 744 */                       l72.m6356E(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case 37:
/* 719 */                       i3 = i10;
/* 729 */                       l72.m6359H(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case 38:
/* 704 */                       i3 = i10;
/* 714 */                       l72.m6367P(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case 39:
/* 689 */                       i3 = i10;
/* 699 */                       l72.m6358G(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 674 */                       i3 = i10;
/* 684 */                       l72.m6355D(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 659 */                       i3 = i10;
/* 669 */                       l72.m6354C(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case 42:
/* 644 */                       i3 = i10;
/* 654 */                       l72.m6392y(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case 43:
/* 629 */                       i3 = i10;
/* 639 */                       l72.m6366O(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case 44:
/* 614 */                       i3 = i10;
/* 624 */                       l72.m6353B(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case 45:
/* 599 */                       i3 = i10;
/* 609 */                       l72.m6361J(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case 46:
/* 584 */                       i3 = i10;
/* 594 */                       l72.m6362K(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case 47:
/* 569 */                       i3 = i10;
/* 579 */                       l72.m6363L(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case 48:
/* 554 */                       i3 = i10;
/* 564 */                       l72.m6364M(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, true);
                                break;
                            case 49:
/* 535 */                       i3 = i10;
/* 549 */                       l72.m6357F(iArr[i3], (List) unsafe.getObject(obj, j), d52Var, m7842o(i3));
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 511 */                       i3 = i10;
/* 517 */                       if (unsafe.getObject(obj, j) != null) {
/* 521 */                           Object objM7841n = m7841n(i3);
/* 527 */                           this.f15563n.getClass();
/* 530 */                           pm2.m7490m(objM7841n);
/* 534 */                           throw null;
                                }
                                break;
                            case 51:
/* 475 */                       i3 = i10;
/* 481 */                       if (m7846t(i7, obj, i3)) {
/* 491 */                           double dDoubleValue = ((Double) my2.f14064c.m6313i(obj, j)).doubleValue();
/* 497 */                           C1808jw c1808jw8 = (C1808jw) d52Var.f7001a;
/* 499 */                           c1808jw8.getClass();
/* 506 */                           c1808jw8.m5915o(i7, Double.doubleToRawLongBits(dDoubleValue));
                                }
                                break;
                            case 52:
/* 439 */                       i3 = i10;
/* 445 */                       if (m7846t(i7, obj, i3)) {
/* 455 */                           float fFloatValue = ((Float) my2.f14064c.m6313i(obj, j)).floatValue();
/* 461 */                           C1808jw c1808jw9 = (C1808jw) d52Var.f7001a;
/* 463 */                           c1808jw9.getClass();
/* 470 */                           c1808jw9.m5913m(i7, Float.floatToRawIntBits(fFloatValue));
                                }
                                break;
                            case 53:
/* 418 */                       i3 = i10;
/* 424 */                       if (m7846t(i7, obj, i3)) {
/* 434 */                           ((C1808jw) d52Var.f7001a).m5920t(i7, m7816E(obj, j));
                                }
                                break;
                            case 54:
/* 397 */                       i3 = i10;
/* 403 */                       if (m7846t(i7, obj, i3)) {
/* 413 */                           ((C1808jw) d52Var.f7001a).m5920t(i7, m7816E(obj, j));
                                }
                                break;
                            case 55:
/* 372 */                       i3 = i10;
/* 378 */                       if (m7846t(i7, obj, i3)) {
/* 380 */                           int iM7815D = m7815D(obj, j);
/* 386 */                           C1808jw c1808jw10 = (C1808jw) d52Var.f7001a;
/* 389 */                           c1808jw10.m5918r(i7, 0);
/* 392 */                           c1808jw10.m5917q(iM7815D);
                                }
                                break;
                            case 56:
/* 351 */                       i3 = i10;
/* 357 */                       if (m7846t(i7, obj, i3)) {
/* 367 */                           ((C1808jw) d52Var.f7001a).m5915o(i7, m7816E(obj, j));
                                }
                                break;
                            case 57:
/* 330 */                       i3 = i10;
/* 336 */                       if (m7846t(i7, obj, i3)) {
/* 346 */                           ((C1808jw) d52Var.f7001a).m5913m(i7, m7815D(obj, j));
                                }
                                break;
                            case 58:
/* 296 */                       i3 = i10;
/* 302 */                       if (m7846t(i7, obj, i3)) {
/* 312 */                           boolean zBooleanValue = ((Boolean) my2.f14064c.m6313i(obj, j)).booleanValue();
/* 318 */                           C1808jw c1808jw11 = (C1808jw) d52Var.f7001a;
/* 321 */                           c1808jw11.m5918r(i7, 0);
/* 325 */                           c1808jw11.m5911k(zBooleanValue ? (byte) 1 : (byte) 0);
                                }
                                break;
                            case 59:
/* 279 */                       i3 = i10;
/* 285 */                       if (m7846t(i7, obj, i3)) {
/* 291 */                           m7819W(i7, unsafe.getObject(obj, j), d52Var);
                                }
                                break;
                            case 60:
/* 258 */                       i3 = i10;
/* 264 */                       if (m7846t(i7, obj, i3)) {
/* 274 */                           d52Var.m2937K(i7, unsafe.getObject(obj, j), m7842o(i3));
                                }
                                break;
                            case 61:
/* 239 */                       i3 = i10;
/* 245 */                       if (m7846t(i7, obj, i3)) {
/* 253 */                           d52Var.m2935I(i7, (AbstractC2298vl) unsafe.getObject(obj, j));
                                }
                                break;
                            case 62:
/* 214 */                       i3 = i10;
/* 221 */                       if (m7846t(i7, obj, i3)) {
/* 223 */                           int iM7815D2 = m7815D(obj, j);
/* 229 */                           C1808jw c1808jw12 = (C1808jw) d52Var.f7001a;
/* 231 */                           c1808jw12.m5918r(i7, 0);
/* 234 */                           c1808jw12.m5919s(iM7815D2);
                                }
                                break;
                            case 63:
/* 189 */                       i3 = i10;
/* 195 */                       if (m7846t(i7, obj, i3)) {
/* 197 */                           int iM7815D3 = m7815D(obj, j);
/* 203 */                           C1808jw c1808jw13 = (C1808jw) d52Var.f7001a;
/* 206 */                           c1808jw13.m5918r(i7, 0);
/* 209 */                           c1808jw13.m5917q(iM7815D3);
                                }
                                break;
                            case 64:
/* 169 */                       i3 = i10;
/* 175 */                       if (m7846t(i7, obj, i3)) {
/* 185 */                           ((C1808jw) d52Var.f7001a).m5913m(i7, m7815D(obj, j));
                                }
                                break;
                            case 65:
/* 149 */                       i3 = i10;
/* 155 */                       if (m7846t(i7, obj, i3)) {
/* 165 */                           ((C1808jw) d52Var.f7001a).m5915o(i7, m7816E(obj, j));
                                }
                                break;
                            case 66:
/* 120 */                       i3 = i10;
/* 126 */                       if (m7846t(i7, obj, i3)) {
/* 128 */                           int iM7815D4 = m7815D(obj, j);
/* 134 */                           C1808jw c1808jw14 = (C1808jw) d52Var.f7001a;
/* 142 */                           c1808jw14.m5918r(i7, 0);
/* 145 */                           c1808jw14.m5919s((iM7815D4 >> 31) ^ (iM7815D4 << 1));
                                }
                                break;
                            case 67:
/* 95 */                        i3 = i10;
/* 101 */                       if (m7846t(i7, obj, i3)) {
/* 103 */                           long jM7816E = m7816E(obj, j);
/* 116 */                           ((C1808jw) d52Var.f7001a).m5920t(i7, (jM7816E << 1) ^ (jM7816E >> 63));
                                }
                                break;
                            case 68:
/* 75 */                        i3 = i10;
/* 81 */                        if (m7846t(i7, obj, i3)) {
/* 91 */                            d52Var.m2936J(i7, unsafe.getObject(obj, j), m7842o(i3));
                                }
                                break;
                            default:
/* 70 */                        i3 = i10;
                                break;
                        }
                    }
/* 1410 */          this.f15562m.getClass();
/* 1418 */          ((sq0) obj).unknownFields.m8322e(d52Var);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:9:0x0022  */
                @Override // p000.h72
                /* JADX INFO: renamed from: a */
                public final void mo4123a(Object obj, Object obj2) {
                    Object obj3;
/* 1 */             m7820k(obj);
/* 4 */             obj2.getClass();
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 int[] iArr = this.f15550a;
/* 11 */                if (i >= iArr.length) {
/* 445 */                   l72.m6390w(this.f15562m, obj, obj2);
/* 448 */                   return;
                        }
/* 13 */                int iM7836U = m7836U(i);
/* 20 */                long j = 1048575 & iM7836U;
/* 22 */                int i2 = iArr[i];
                        switch (m7818T(iM7836U)) {
                            case 0:
/* 422 */                       if (!m7845r(i, obj2)) {
/* 35 */                            obj3 = obj;
                                } else {
/* 424 */                           ky2 ky2Var = my2.f14064c;
/* 430 */                           obj3 = obj;
/* 431 */                           ky2Var.mo4049m(obj3, j, ky2Var.mo4045e(obj2, j));
/* 434 */                           m7831O(i, obj3);
                                }
                                break;
                            case 1:
/* 402 */                       if (m7845r(i, obj2)) {
/* 404 */                           ky2 ky2Var2 = my2.f14064c;
/* 410 */                           ky2Var2.mo4050n(obj, j, ky2Var2.mo4046f(obj2, j));
/* 413 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 2:
/* 382 */                       if (m7845r(i, obj2)) {
/* 390 */                           my2.m6829o(obj, j, my2.f14064c.m6312h(obj2, j));
/* 393 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 3:
/* 362 */                       if (m7845r(i, obj2)) {
/* 370 */                           my2.m6829o(obj, j, my2.f14064c.m6312h(obj2, j));
/* 373 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 4:
/* 342 */                       if (m7845r(i, obj2)) {
/* 350 */                           my2.m6828n(obj, my2.f14064c.m6311g(obj2, j), j);
/* 353 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 5:
/* 322 */                       if (m7845r(i, obj2)) {
/* 330 */                           my2.m6829o(obj, j, my2.f14064c.m6312h(obj2, j));
/* 333 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 6:
/* 302 */                       if (m7845r(i, obj2)) {
/* 310 */                           my2.m6828n(obj, my2.f14064c.m6311g(obj2, j), j);
/* 313 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 7:
/* 282 */                       if (m7845r(i, obj2)) {
/* 284 */                           ky2 ky2Var3 = my2.f14064c;
/* 290 */                           ky2Var3.mo4047k(obj, j, ky2Var3.mo4043c(obj2, j));
/* 293 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 8:
/* 262 */                       if (m7845r(i, obj2)) {
/* 270 */                           my2.m6830p(obj, j, my2.f14064c.m6313i(obj2, j));
/* 273 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 9:
/* 253 */                       m7848w(i, obj, obj2);
/* 35 */                        obj3 = obj;
                                break;
                            case 10:
/* 237 */                       if (m7845r(i, obj2)) {
/* 245 */                           my2.m6830p(obj, j, my2.f14064c.m6313i(obj2, j));
/* 248 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 11:
/* 217 */                       if (m7845r(i, obj2)) {
/* 225 */                           my2.m6828n(obj, my2.f14064c.m6311g(obj2, j), j);
/* 228 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 12:
/* 197 */                       if (m7845r(i, obj2)) {
/* 205 */                           my2.m6828n(obj, my2.f14064c.m6311g(obj2, j), j);
/* 208 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 177 */                       if (m7845r(i, obj2)) {
/* 185 */                           my2.m6828n(obj, my2.f14064c.m6311g(obj2, j), j);
/* 188 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 14:
/* 157 */                       if (m7845r(i, obj2)) {
/* 165 */                           my2.m6829o(obj, j, my2.f14064c.m6312h(obj2, j));
/* 168 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 138 */                       if (m7845r(i, obj2)) {
/* 146 */                           my2.m6828n(obj, my2.f14064c.m6311g(obj2, j), j);
/* 149 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 16:
/* 119 */                       if (m7845r(i, obj2)) {
/* 127 */                           my2.m6829o(obj, j, my2.f14064c.m6312h(obj2, j));
/* 130 */                           m7831O(i, obj);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 17:
/* 111 */                       m7848w(i, obj, obj2);
/* 35 */                        obj3 = obj;
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
/* 107 */                       this.f15561l.mo102b(obj, j, obj2);
/* 35 */                        obj3 = obj;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 80 */                        Class cls = l72.f13131a;
/* 82 */                        ky2 ky2Var4 = my2.f14064c;
/* 84 */                        Object objM6313i = ky2Var4.m6313i(obj, j);
/* 88 */                        Object objM6313i2 = ky2Var4.m6313i(obj2, j);
/* 94 */                        this.f15563n.getClass();
/* 101 */                       my2.m6830p(obj, j, hc1.m4164b(objM6313i, objM6313i2));
/* 35 */                        obj3 = obj;
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
/* 65 */                        if (m7846t(i2, obj2, i)) {
/* 73 */                            my2.m6830p(obj, j, my2.f14064c.m6313i(obj2, j));
/* 76 */                            m7832P(i2, obj, i);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 60:
/* 57 */                        m7849x(i, obj, obj2);
/* 35 */                        obj3 = obj;
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
/* 42 */                        if (m7846t(i2, obj2, i)) {
/* 50 */                            my2.m6830p(obj, j, my2.f14064c.m6313i(obj2, j));
/* 53 */                            m7832P(i2, obj, i);
                                }
/* 35 */                        obj3 = obj;
                                break;
                            case 68:
/* 32 */                        m7849x(i, obj, obj2);
/* 35 */                        obj3 = obj;
                                break;
                            default:
/* 35 */                        obj3 = obj;
                                break;
                        }
/* 437 */               i += 3;
/* 439 */               obj = obj3;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:18:0x0051  */
                /* JADX WARN: Code duplicated, block: B:20:0x0057  */
                /* JADX WARN: Code duplicated, block: B:29:0x0064 A[SYNTHETIC] */
                @Override // p000.h72
                /* JADX INFO: renamed from: b */
                public final void mo4124b(Object obj) {
/* 5 */             if (m7821s(obj)) {
/* 11 */                if (obj instanceof sq0) {
/* 14 */                    sq0 sq0Var = (sq0) obj;
/* 19 */                    sq0Var.m8624u(AbstractC0208c9.API_PRIORITY_OTHER);
/* 22 */                    sq0Var.memoizedHashCode = 0;
/* 24 */                    sq0Var.m8621o();
                        }
/* 29 */                int length = this.f15550a.length;
/* 31 */                for (int i = 0; i < length; i += 3) {
/* 33 */                    int iM7836U = m7836U(i);
/* 40 */                    long j = 1048575 & iM7836U;
/* 42 */                    int iM7818T = m7818T(iM7836U);
/* 48 */                    if (iM7818T != 9) {
                                switch (iM7818T) {
                                    case 17:
/* 86 */                                if (m7845r(i, obj)) {
/* 98 */                                    m7842o(i).mo4124b(f15549p.getObject(obj, j));
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
/* 78 */                                this.f15561l.mo101a(obj, j);
                                        break;
                                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 54 */                                Unsafe unsafe = f15549p;
/* 56 */                                Object object = unsafe.getObject(obj, j);
/* 60 */                                if (object != null) {
/* 64 */                                    this.f15563n.getClass();
/* 70 */                                    ((fc1) object).f8123a = false;
/* 72 */                                    unsafe.putObject(obj, j, object);
                                        }
                                        break;
                                }
                            } else if (m7845r(i, obj)) {
/* 98 */                        m7842o(i).mo4124b(f15549p.getObject(obj, j));
                            }
                        }
/* 106 */               this.f15562m.getClass();
/* 113 */               ((sq0) obj).unknownFields.f16344e = false;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0045  */
                /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
                /* JADX WARN: Code duplicated, block: B:57:0x00d4  */
                /* JADX WARN: Code duplicated, block: B:60:0x00d8  */
                /* JADX WARN: Code duplicated, block: B:62:0x00db  */
                /* JADX WARN: Code duplicated, block: B:72:0x00ee A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:76:0x00ef A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:77:0x00ef A[SYNTHETIC] */
                @Override // p000.h72
                /* JADX INFO: renamed from: c */
                public final boolean mo4125c(Object obj) {
                    int iM7818T;
/* 5 */             int i = 1048575;
/* 6 */             int i2 = 0;
/* 7 */             int i3 = 0;
                    while (true) {
/* 10 */                boolean zM7845r = true;
/* 11 */                if (i2 >= this.f15558i) {
/* 10 */                    return true;
                        }
/* 15 */                int i4 = this.f15557h[i2];
/* 17 */                int[] iArr = this.f15550a;
/* 19 */                int i5 = iArr[i4];
/* 21 */                int iM7836U = m7836U(i4);
/* 27 */                int i6 = iArr[i4 + 2];
/* 29 */                int i7 = i6 & 1048575;
/* 33 */                int i8 = 1 << (i6 >>> 20);
/* 35 */                if (i7 != i) {
/* 37 */                    if (i7 != 1048575) {
/* 42 */                        i3 = f15549p.getInt(obj, i7);
                            }
/* 46 */                    i = i7;
                        }
/* 50 */                if ((268435456 & iM7836U) == 0) {
/* 70 */                    iM7818T = m7818T(iM7836U);
/* 76 */                    if (iM7818T != 9 || iM7818T == 17) {
/* 206 */                       if (i == 1048575) {
/* 208 */                           zM7845r = m7845r(i4, obj);
                                } else if ((i8 & i3) == 0) {
/* 217 */                           zM7845r = false;
                                }
/* 218 */                       if (zM7845r) {
                                    continue;
                                } else if (!m7842o(i4).mo4125c(my2.f14064c.m6313i(obj, iM7836U & 1048575))) {
                                }
/* 240 */                       i2++;
                            } else {
/* 84 */                        if (iM7818T != 27) {
/* 88 */                            if (iM7818T == 60 || iM7818T == 68) {
/* 141 */                               if (!m7846t(i5, obj, i4)) {
                                            continue;
                                        } else if (!m7842o(i4).mo4125c(my2.f14064c.m6313i(obj, iM7836U & 1048575))) {
                                        }
                                    } else if (iM7818T != 49) {
/* 100 */                               if (iM7818T != 50) {
                                            continue;
                                        } else {
/* 109 */                                   Object objM6313i = my2.f14064c.m6313i(obj, iM7836U & 1048575);
/* 115 */                                   this.f15563n.getClass();
/* 124 */                                   if (!((fc1) objM6313i).isEmpty()) {
/* 132 */                                       pm2.m7490m(m7841n(i4));
/* 136 */                                       throw null;
                                            }
                                        }
                                    }
/* 240 */                           i2++;
                                }
/* 172 */                       List list = (List) my2.f14064c.m6313i(obj, iM7836U & 1048575);
/* 178 */                       if (list.isEmpty()) {
                                    continue;
                                } else {
/* 181 */                           h72 h72VarM7842o = m7842o(i4);
/* 190 */                           for (int i9 = 0; i9 < list.size(); i9++) {
/* 200 */                               if (h72VarM7842o.mo4125c(list.get(i9))) {
                                        }
                                    }
                                }
/* 240 */                       i2++;
                            }
                        } else {
/* 66 */                    if (i == 1048575 ? m7845r(i4, obj) : (i3 & i8) != 0) {
/* 70 */                        iM7818T = m7818T(iM7836U);
/* 76 */                        if (iM7818T != 9) {
                                }
/* 206 */                       if (i == 1048575) {
/* 208 */                           zM7845r = m7845r(i4, obj);
                                } else if ((i8 & i3) == 0) {
/* 217 */                           zM7845r = false;
                                }
/* 218 */                       if (zM7845r) {
                                    continue;
                                } else if (!m7842o(i4).mo4125c(my2.f14064c.m6313i(obj, iM7836U & 1048575))) {
                                }
/* 240 */                       i2++;
                            }
                        }
/* 4 */                 return false;
                    }
                }

                @Override // p000.h72
                /* JADX INFO: renamed from: d */
                public final int mo4126d(sq0 sq0Var) {
                    return this.f15556g ? m7844q(sq0Var) : m7843p(sq0Var);
                }

                @Override // p000.h72
                /* JADX INFO: renamed from: e */
                public final void mo4127e(Object obj, d52 d52Var) throws C1868kw {
/* 7 */             d52Var.getClass();
/* 12 */            C1808jw c1808jw = (C1808jw) d52Var.f7001a;
/* 16 */            if (!this.f15556g) {
/* 1415 */              m7837V(obj, d52Var);
/* 1418 */              return;
                    }
/* 18 */            int[] iArr = this.f15550a;
/* 20 */            int length = iArr.length;
/* 23 */            for (int i = 0; i < length; i += 3) {
/* 25 */                int iM7836U = m7836U(i);
/* 29 */                int i2 = iArr[i];
                        switch (m7818T(iM7836U)) {
                            case 0:
/* 1377 */                      if (m7845r(i, obj)) {
/* 1383 */                          double dMo4045e = my2.f14064c.mo4045e(obj, iM7836U & 1048575);
/* 1387 */                          c1808jw.getClass();
/* 1394 */                          c1808jw.m5915o(i2, Double.doubleToRawLongBits(dMo4045e));
                                }
                                break;
                            case 1:
/* 1352 */                      if (m7845r(i, obj)) {
/* 1358 */                          float fMo4046f = my2.f14064c.mo4046f(obj, iM7836U & 1048575);
/* 1362 */                          c1808jw.getClass();
/* 1369 */                          c1808jw.m5913m(i2, Float.floatToRawIntBits(fMo4046f));
                                }
                                break;
                            case 2:
/* 1334 */                      if (m7845r(i, obj)) {
/* 1344 */                          c1808jw.m5920t(i2, my2.f14064c.m6312h(obj, iM7836U & 1048575));
                                }
                                break;
                            case 3:
/* 1316 */                      if (m7845r(i, obj)) {
/* 1326 */                          c1808jw.m5920t(i2, my2.f14064c.m6312h(obj, iM7836U & 1048575));
                                }
                                break;
                            case 4:
/* 1295 */                      if (m7845r(i, obj)) {
/* 1301 */                          int iM6311g = my2.f14064c.m6311g(obj, iM7836U & 1048575);
/* 1305 */                          c1808jw.m5918r(i2, 0);
/* 1308 */                          c1808jw.m5917q(iM6311g);
                                }
                                break;
                            case 5:
/* 1277 */                      if (m7845r(i, obj)) {
/* 1287 */                          c1808jw.m5915o(i2, my2.f14064c.m6312h(obj, iM7836U & 1048575));
                                }
                                break;
                            case 6:
/* 1258 */                      if (m7845r(i, obj)) {
/* 1268 */                          c1808jw.m5913m(i2, my2.f14064c.m6311g(obj, iM7836U & 1048575));
                                }
                                break;
                            case 7:
/* 1235 */                      if (m7845r(i, obj)) {
/* 1241 */                          boolean zMo4043c = my2.f14064c.mo4043c(obj, iM7836U & 1048575);
/* 1245 */                          c1808jw.m5918r(i2, 0);
/* 1249 */                          c1808jw.m5911k(zMo4043c ? (byte) 1 : (byte) 0);
                                }
                                break;
                            case 8:
/* 1216 */                      if (m7845r(i, obj)) {
/* 1226 */                          m7819W(i2, my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var);
                                }
                                break;
                            case 9:
/* 1193 */                      if (m7845r(i, obj)) {
/* 1207 */                          d52Var.m2937K(i2, my2.f14064c.m6313i(obj, iM7836U & 1048575), m7842o(i));
                                }
                                break;
                            case 10:
/* 1172 */                      if (m7845r(i, obj)) {
/* 1184 */                          d52Var.m2935I(i2, (AbstractC2298vl) my2.f14064c.m6313i(obj, iM7836U & 1048575));
                                }
                                break;
                            case 11:
/* 1150 */                      if (m7845r(i, obj)) {
/* 1156 */                          int iM6311g2 = my2.f14064c.m6311g(obj, iM7836U & 1048575);
/* 1160 */                          c1808jw.m5918r(i2, 0);
/* 1163 */                          c1808jw.m5919s(iM6311g2);
                                }
                                break;
                            case 12:
/* 1128 */                      if (m7845r(i, obj)) {
/* 1134 */                          int iM6311g3 = my2.f14064c.m6311g(obj, iM7836U & 1048575);
/* 1138 */                          c1808jw.m5918r(i2, 0);
/* 1141 */                          c1808jw.m5917q(iM6311g3);
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1109 */                      if (m7845r(i, obj)) {
/* 1119 */                          c1808jw.m5913m(i2, my2.f14064c.m6311g(obj, iM7836U & 1048575));
                                }
                                break;
                            case 14:
/* 1090 */                      if (m7845r(i, obj)) {
/* 1100 */                          c1808jw.m5915o(i2, my2.f14064c.m6312h(obj, iM7836U & 1048575));
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1063 */                      if (m7845r(i, obj)) {
/* 1069 */                          int iM6311g4 = my2.f14064c.m6311g(obj, iM7836U & 1048575);
/* 1078 */                          c1808jw.m5918r(i2, 0);
/* 1081 */                          c1808jw.m5919s((iM6311g4 >> 31) ^ (iM6311g4 << 1));
                                }
                                break;
                            case 16:
/* 1039 */                      if (m7845r(i, obj)) {
/* 1045 */                          long jM6312h = my2.f14064c.m6312h(obj, iM7836U & 1048575);
/* 1054 */                          c1808jw.m5920t(i2, (jM6312h >> 63) ^ (jM6312h << 1));
                                }
                                break;
                            case 17:
/* 1016 */                      if (m7845r(i, obj)) {
/* 1030 */                          d52Var.m2936J(i2, my2.f14064c.m6313i(obj, iM7836U & 1048575), m7842o(i));
                                }
                                break;
                            case 18:
/* 1007 */                      l72.m6352A(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case 19:
/* 990 */                       l72.m6356E(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case 20:
/* 973 */                       l72.m6359H(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 956 */                       l72.m6367P(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 939 */                       l72.m6358G(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 922 */                       l72.m6355D(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case 24:
/* 905 */                       l72.m6354C(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 888 */                       l72.m6392y(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 871 */                       l72.m6365N(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var);
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 854 */                       l72.m6360I(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, m7842o(i));
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 833 */                       l72.m6393z(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var);
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 816 */                       l72.m6366O(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 799 */                       l72.m6353B(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 782 */                       l72.m6361J(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case 32:
/* 765 */                       l72.m6362K(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 748 */                       l72.m6363L(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 731 */                       l72.m6364M(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, false);
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 714 */                       l72.m6352A(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 697 */                       l72.m6356E(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case 37:
/* 680 */                       l72.m6359H(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case 38:
/* 663 */                       l72.m6367P(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case 39:
/* 646 */                       l72.m6358G(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 629 */                       l72.m6355D(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 612 */                       l72.m6354C(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case 42:
/* 595 */                       l72.m6392y(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case 43:
/* 578 */                       l72.m6366O(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case 44:
/* 561 */                       l72.m6353B(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case 45:
/* 544 */                       l72.m6361J(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case 46:
/* 527 */                       l72.m6362K(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case 47:
/* 510 */                       l72.m6363L(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case 48:
/* 493 */                       l72.m6364M(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, true);
                                break;
                            case 49:
/* 476 */                       l72.m6357F(iArr[i], (List) my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var, m7842o(i));
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 442 */                       if (my2.f14064c.m6313i(obj, iM7836U & 1048575) != null) {
/* 446 */                           Object objM7841n = m7841n(i);
/* 452 */                           this.f15563n.getClass();
/* 455 */                           pm2.m7490m(objM7841n);
/* 459 */                           throw null;
                                }
                                break;
                                break;
                            case 51:
/* 406 */                       if (m7846t(i2, obj, i)) {
/* 418 */                           double dDoubleValue = ((Double) my2.f14064c.m6313i(obj, iM7836U & 1048575)).doubleValue();
/* 422 */                           c1808jw.getClass();
/* 429 */                           c1808jw.m5915o(i2, Double.doubleToRawLongBits(dDoubleValue));
                                }
                                break;
                            case 52:
/* 374 */                       if (m7846t(i2, obj, i)) {
/* 386 */                           float fFloatValue = ((Float) my2.f14064c.m6313i(obj, iM7836U & 1048575)).floatValue();
/* 390 */                           c1808jw.getClass();
/* 397 */                           c1808jw.m5913m(i2, Float.floatToRawIntBits(fFloatValue));
                                }
                                break;
                            case 53:
/* 357 */                       if (m7846t(i2, obj, i)) {
/* 365 */                           c1808jw.m5920t(i2, m7816E(obj, iM7836U & 1048575));
                                }
                                break;
                            case 54:
/* 340 */                       if (m7846t(i2, obj, i)) {
/* 348 */                           c1808jw.m5920t(i2, m7816E(obj, iM7836U & 1048575));
                                }
                                break;
                            case 55:
/* 320 */                       if (m7846t(i2, obj, i)) {
/* 324 */                           int iM7815D = m7815D(obj, iM7836U & 1048575);
/* 328 */                           c1808jw.m5918r(i2, 0);
/* 331 */                           c1808jw.m5917q(iM7815D);
                                }
                                break;
                            case 56:
/* 303 */                       if (m7846t(i2, obj, i)) {
/* 311 */                           c1808jw.m5915o(i2, m7816E(obj, iM7836U & 1048575));
                                }
                                break;
                            case 57:
/* 286 */                       if (m7846t(i2, obj, i)) {
/* 294 */                           c1808jw.m5913m(i2, m7815D(obj, iM7836U & 1048575));
                                }
                                break;
                            case 58:
/* 257 */                       if (m7846t(i2, obj, i)) {
/* 269 */                           boolean zBooleanValue = ((Boolean) my2.f14064c.m6313i(obj, iM7836U & 1048575)).booleanValue();
/* 273 */                           c1808jw.m5918r(i2, 0);
/* 277 */                           c1808jw.m5911k(zBooleanValue ? (byte) 1 : (byte) 0);
                                }
                                break;
                            case 59:
/* 238 */                       if (m7846t(i2, obj, i)) {
/* 248 */                           m7819W(i2, my2.f14064c.m6313i(obj, iM7836U & 1048575), d52Var);
                                }
                                break;
                            case 60:
/* 215 */                       if (m7846t(i2, obj, i)) {
/* 229 */                           d52Var.m2937K(i2, my2.f14064c.m6313i(obj, iM7836U & 1048575), m7842o(i));
                                }
                                break;
                            case 61:
/* 194 */                       if (m7846t(i2, obj, i)) {
/* 206 */                           d52Var.m2935I(i2, (AbstractC2298vl) my2.f14064c.m6313i(obj, iM7836U & 1048575));
                                }
                                break;
                            case 62:
/* 174 */                       if (m7846t(i2, obj, i)) {
/* 178 */                           int iM7815D2 = m7815D(obj, iM7836U & 1048575);
/* 182 */                           c1808jw.m5918r(i2, 0);
/* 185 */                           c1808jw.m5919s(iM7815D2);
                                }
                                break;
                            case 63:
/* 154 */                       if (m7846t(i2, obj, i)) {
/* 158 */                           int iM7815D3 = m7815D(obj, iM7836U & 1048575);
/* 162 */                           c1808jw.m5918r(i2, 0);
/* 165 */                           c1808jw.m5917q(iM7815D3);
                                }
                                break;
                            case 64:
/* 137 */                       if (m7846t(i2, obj, i)) {
/* 145 */                           c1808jw.m5913m(i2, m7815D(obj, iM7836U & 1048575));
                                }
                                break;
                            case 65:
/* 120 */                       if (m7846t(i2, obj, i)) {
/* 128 */                           c1808jw.m5915o(i2, m7816E(obj, iM7836U & 1048575));
                                }
                                break;
                            case 66:
/* 95 */                        if (m7846t(i2, obj, i)) {
/* 99 */                            int iM7815D4 = m7815D(obj, iM7836U & 1048575);
/* 108 */                           c1808jw.m5918r(i2, 0);
/* 111 */                           c1808jw.m5919s((iM7815D4 >> 31) ^ (iM7815D4 << 1));
                                }
                                break;
                            case 67:
/* 73 */                        if (m7846t(i2, obj, i)) {
/* 77 */                            long jM7816E = m7816E(obj, iM7836U & 1048575);
/* 86 */                            c1808jw.m5920t(i2, (jM7816E >> 63) ^ (jM7816E << 1));
                                }
                                break;
                            case 68:
/* 50 */                        if (m7846t(i2, obj, i)) {
/* 64 */                            d52Var.m2936J(i2, my2.f14064c.m6313i(obj, iM7836U & 1048575), m7842o(i));
                                }
                                break;
                        }
                    }
/* 1403 */          this.f15562m.getClass();
/* 1411 */          ((sq0) obj).unknownFields.m8322e(d52Var);
                }

                /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // p000.h72
                /* JADX INFO: renamed from: f */
                public final int mo4128f(sq0 sq0Var) {
                    int i;
                    int iM3615b;
                    int i2;
/* 1 */             int[] iArr = this.f15550a;
/* 3 */             int length = iArr.length;
/* 5 */             int i3 = 0;
/* 6 */             for (int i4 = 0; i4 < length; i4 += 3) {
/* 8 */                 int iM7836U = m7836U(i4);
/* 12 */                int i5 = iArr[i4];
/* 17 */                long j = 1048575 & iM7836U;
/* 23 */                int i6 = 1237;
/* 27 */                int iHashCode = 37;
                        switch (m7818T(iM7836U)) {
                            case 0:
/* 615 */                       i = i3 * 53;
/* 627 */                       iM3615b = ez0.m3615b(Double.doubleToLongBits(my2.f14064c.mo4045e(sq0Var, j)));
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 1:
/* 601 */                       i = i3 * 53;
/* 609 */                       iM3615b = Float.floatToIntBits(my2.f14064c.mo4046f(sq0Var, j));
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 2:
/* 587 */                       i = i3 * 53;
/* 595 */                       iM3615b = ez0.m3615b(my2.f14064c.m6312h(sq0Var, j));
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 3:
/* 573 */                       i = i3 * 53;
/* 581 */                       iM3615b = ez0.m3615b(my2.f14064c.m6312h(sq0Var, j));
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 4:
/* 563 */                       i = i3 * 53;
/* 567 */                       iM3615b = my2.f14064c.m6311g(sq0Var, j);
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 5:
/* 549 */                       i = i3 * 53;
/* 557 */                       iM3615b = ez0.m3615b(my2.f14064c.m6312h(sq0Var, j));
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 6:
/* 539 */                       i = i3 * 53;
/* 543 */                       iM3615b = my2.f14064c.m6311g(sq0Var, j);
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 7:
/* 525 */                       i2 = i3 * 53;
/* 529 */                       boolean zMo4043c = my2.f14064c.mo4043c(sq0Var, j);
/* 533 */                       Charset charset = ez0.f7923a;
/* 535 */                       if (zMo4043c) {
/* 226 */                           i6 = 1231;
                                }
/* 227 */                       i3 = i6 + i2;
                                break;
                            case 8:
/* 509 */                       i = i3 * 53;
/* 519 */                       iM3615b = ((String) my2.f14064c.m6313i(sq0Var, j)).hashCode();
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 9:
/* 498 */                       Object objM6313i = my2.f14064c.m6313i(sq0Var, j);
/* 502 */                       if (objM6313i != null) {
/* 504 */                           iHashCode = objM6313i.hashCode();
                                }
/* 411 */                       i3 = (i3 * 53) + iHashCode;
                                break;
                            case 10:
/* 482 */                       i = i3 * 53;
/* 490 */                       iM3615b = my2.f14064c.m6313i(sq0Var, j).hashCode();
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 11:
/* 472 */                       i = i3 * 53;
/* 476 */                       iM3615b = my2.f14064c.m6311g(sq0Var, j);
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 12:
/* 462 */                       i = i3 * 53;
/* 466 */                       iM3615b = my2.f14064c.m6311g(sq0Var, j);
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 452 */                       i = i3 * 53;
/* 456 */                       iM3615b = my2.f14064c.m6311g(sq0Var, j);
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 14:
/* 438 */                       i = i3 * 53;
/* 446 */                       iM3615b = ez0.m3615b(my2.f14064c.m6312h(sq0Var, j));
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 428 */                       i = i3 * 53;
/* 432 */                       iM3615b = my2.f14064c.m6311g(sq0Var, j);
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 16:
/* 414 */                       i = i3 * 53;
/* 422 */                       iM3615b = ez0.m3615b(my2.f14064c.m6312h(sq0Var, j));
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 17:
/* 399 */                       Object objM6313i2 = my2.f14064c.m6313i(sq0Var, j);
/* 403 */                       if (objM6313i2 != null) {
/* 405 */                           iHashCode = objM6313i2.hashCode();
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
/* 391 */                       iM3615b = my2.f14064c.m6313i(sq0Var, j).hashCode();
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 369 */                       i = i3 * 53;
/* 377 */                       iM3615b = my2.f14064c.m6313i(sq0Var, j).hashCode();
/* 52 */                        i3 = iM3615b + i;
                                break;
                            case 51:
/* 343 */                       if (m7846t(i5, sq0Var, i4)) {
/* 345 */                           i = i3 * 53;
/* 363 */                           iM3615b = ez0.m3615b(Double.doubleToLongBits(((Double) my2.f14064c.m6313i(sq0Var, j)).doubleValue()));
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 52:
/* 317 */                       if (m7846t(i5, sq0Var, i4)) {
/* 319 */                           i = i3 * 53;
/* 333 */                           iM3615b = Float.floatToIntBits(((Float) my2.f14064c.m6313i(sq0Var, j)).floatValue());
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 53:
/* 299 */                       if (m7846t(i5, sq0Var, i4)) {
/* 301 */                           i = i3 * 53;
/* 307 */                           iM3615b = ez0.m3615b(m7816E(sq0Var, j));
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 54:
/* 281 */                       if (m7846t(i5, sq0Var, i4)) {
/* 283 */                           i = i3 * 53;
/* 289 */                           iM3615b = ez0.m3615b(m7816E(sq0Var, j));
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 55:
/* 267 */                       if (m7846t(i5, sq0Var, i4)) {
/* 269 */                           i = i3 * 53;
/* 271 */                           iM3615b = m7815D(sq0Var, j);
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 56:
/* 249 */                       if (m7846t(i5, sq0Var, i4)) {
/* 251 */                           i = i3 * 53;
/* 257 */                           iM3615b = ez0.m3615b(m7816E(sq0Var, j));
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 57:
/* 235 */                       if (m7846t(i5, sq0Var, i4)) {
/* 237 */                           i = i3 * 53;
/* 239 */                           iM3615b = m7815D(sq0Var, j);
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 58:
/* 206 */                       if (m7846t(i5, sq0Var, i4)) {
/* 208 */                           i2 = i3 * 53;
/* 218 */                           boolean zBooleanValue = ((Boolean) my2.f14064c.m6313i(sq0Var, j)).booleanValue();
/* 222 */                           Charset charset2 = ez0.f7923a;
/* 224 */                           if (zBooleanValue) {
/* 226 */                               i6 = 1231;
                                    }
/* 227 */                           i3 = i6 + i2;
                                }
                                break;
                            case 59:
/* 184 */                       if (m7846t(i5, sq0Var, i4)) {
/* 186 */                           i = i3 * 53;
/* 196 */                           iM3615b = ((String) my2.f14064c.m6313i(sq0Var, j)).hashCode();
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 60:
/* 165 */                       if (m7846t(i5, sq0Var, i4)) {
/* 173 */                           i = i3 * 53;
/* 175 */                           iM3615b = my2.f14064c.m6313i(sq0Var, j).hashCode();
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 61:
/* 146 */                       if (m7846t(i5, sq0Var, i4)) {
/* 148 */                           i = i3 * 53;
/* 156 */                           iM3615b = my2.f14064c.m6313i(sq0Var, j).hashCode();
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 62:
/* 133 */                       if (m7846t(i5, sq0Var, i4)) {
/* 135 */                           i = i3 * 53;
/* 137 */                           iM3615b = m7815D(sq0Var, j);
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 63:
/* 120 */                       if (m7846t(i5, sq0Var, i4)) {
/* 122 */                           i = i3 * 53;
/* 124 */                           iM3615b = m7815D(sq0Var, j);
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 64:
/* 107 */                       if (m7846t(i5, sq0Var, i4)) {
/* 109 */                           i = i3 * 53;
/* 111 */                           iM3615b = m7815D(sq0Var, j);
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 65:
/* 90 */                        if (m7846t(i5, sq0Var, i4)) {
/* 92 */                            i = i3 * 53;
/* 98 */                            iM3615b = ez0.m3615b(m7816E(sq0Var, j));
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 66:
/* 77 */                        if (m7846t(i5, sq0Var, i4)) {
/* 79 */                            i = i3 * 53;
/* 81 */                            iM3615b = m7815D(sq0Var, j);
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 67:
/* 60 */                        if (m7846t(i5, sq0Var, i4)) {
/* 62 */                            i = i3 * 53;
/* 68 */                            iM3615b = ez0.m3615b(m7816E(sq0Var, j));
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                            case 68:
/* 38 */                        if (m7846t(i5, sq0Var, i4)) {
/* 46 */                            i = i3 * 53;
/* 48 */                            iM3615b = my2.f14064c.m6313i(sq0Var, j).hashCode();
/* 52 */                            i3 = iM3615b + i;
                                }
                                break;
                        }
                    }
/* 641 */           this.f15562m.getClass();
/* 650 */           return sq0Var.unknownFields.hashCode() + (i3 * 53);
                }

                /* JADX WARN: Code duplicated, block: B:150:0x063c A[Catch: all -> 0x046a, TryCatch #4 {all -> 0x046a, blocks: (B:148:0x0637, B:150:0x063c, B:151:0x0641, B:118:0x045e, B:123:0x0472, B:124:0x048e, B:125:0x04ab, B:126:0x04c8, B:127:0x04e7, B:128:0x0503, B:129:0x0518, B:130:0x0533, B:131:0x0540, B:132:0x055e, B:133:0x057b, B:134:0x0598, B:135:0x05b4, B:136:0x05d0, B:137:0x05ec, B:138:0x060a, B:142:0x0628), top: B:177:0x0637 }] */
                /* JADX WARN: Code duplicated, block: B:154:0x0649 A[LOOP:2: B:153:0x0647->B:154:0x0649, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:162:0x0663 A[LOOP:3: B:161:0x0661->B:162:0x0663, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:164:0x066d  */
                /* JADX WARN: Code duplicated, block: B:195:0x0647 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
                @Override // p000.h72
                /* JADX INFO: renamed from: g */
                public final void mo4129g(Object obj, C1771iw c1771iw, dg0 dg0Var) throws Throwable {
                    qh1 qh1Var;
                    tx2 tx2Var;
                    int[] iArr;
                    C1771iw c1771iw2;
/* 1 */             qh1 qh1Var2 = this;
/* 3 */             Object obj2 = obj;
/* 5 */             C1771iw c1771iw3 = c1771iw;
/* 7 */             dg0 dg0Var2 = dg0Var;
/* 9 */             dg0Var2.getClass();
/* 12 */            m7820k(obj2);
/* 15 */            tx2 tx2Var2 = qh1Var2.f15562m;
/* 17 */            int[] iArr2 = qh1Var2.f15557h;
/* 19 */            int i = qh1Var2.f15559j;
/* 21 */            int i2 = qh1Var2.f15558i;
/* 23 */            rx2 rx2VarM8921a = null;
                    while (true) {
                        try {
/* 24 */                    int iM5585c = c1771iw3.m5585c();
/* 46 */                    int iM7833Q = (iM5585c < qh1Var2.f15552c || iM5585c > qh1Var2.f15553d) ? -1 : qh1Var2.m7833Q(iM5585c, 0);
/* 48 */                    if (iM7833Q >= 0) {
/* 107 */                       int iM7836U = qh1Var2.m7836U(iM7833Q);
                                try {
/* 111 */                           int iM7818T = m7818T(iM7836U);
/* 121 */                           c81 c81Var = qh1Var2.f15561l;
                                    switch (iM7818T) {
                                        case 0:
/* 1547 */                                  c1771iw2 = c1771iw3;
/* 1549 */                                  tx2Var = tx2Var2;
/* 1550 */                                  iArr = iArr2;
/* 1551 */                                  qh1Var = qh1Var2;
/* 1552 */                                  long jM7814C = m7814C(iM7836U);
/* 1557 */                                  c1771iw2.m5581R(1);
/* 1570 */                                  Object obj3 = obj2;
                                            try {
/* 1573 */                                      my2.f14064c.mo4049m(obj3, jM7814C, ((AbstractC1006hw) c1771iw2.f11948e).mo3262p());
/* 1576 */                                      obj2 = obj3;
/* 1577 */                                      qh1Var.m7831O(iM7833Q, obj2);
                                            } catch (nz0 unused) {
/* 1584 */                                      obj2 = obj3;
                                                try {
/* 1592 */                                          tx2Var.getClass();
/* 1595 */                                          if (rx2VarM8921a == null) {
/* 1597 */                                              rx2VarM8921a = tx2.m8921a(obj2);
                                                    }
/* 1606 */                                          if (!tx2.m8922b(rx2VarM8921a, c1771iw2)) {
/* 1608 */                                              while (i2 < i) {
/* 1612 */                                                  qh1Var.m7839l(iArr[i2], obj2, rx2VarM8921a);
/* 1615 */                                                  i2++;
                                                        }
/* 1618 */                                              if (rx2VarM8921a == null) {
/* 1622 */                                                  return;
                                                        }
/* 73 */                                                ((sq0) obj2).unknownFields = rx2VarM8921a;
                                                    }
                                                } catch (Throwable th) {
/* 1131 */                                          th = th;
/* 1634 */                                          while (i2 < i) {
/* 1638 */                                              qh1Var.m7839l(iArr[i2], obj2, rx2VarM8921a);
/* 1641 */                                              i2++;
                                                    }
/* 1644 */                                          if (rx2VarM8921a != null) {
/* 1646 */                                              tx2Var.getClass();
/* 1652 */                                              ((sq0) obj2).unknownFields = rx2VarM8921a;
                                                    }
/* 1654 */                                          throw th;
                                                }
                                            } catch (Throwable th2) {
/* 1581 */                                      th = th2;
/* 1582 */                                      obj2 = obj3;
/* 1634 */                                      while (i2 < i) {
/* 1638 */                                          qh1Var.m7839l(iArr[i2], obj2, rx2VarM8921a);
/* 1641 */                                          i2++;
                                                }
/* 1644 */                                      if (rx2VarM8921a != null) {
/* 1646 */                                          tx2Var.getClass();
/* 1652 */                                          ((sq0) obj2).unknownFields = rx2VarM8921a;
                                                }
/* 1654 */                                      throw th;
                                            }
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 1:
/* 1517 */                                  c1771iw2 = c1771iw3;
/* 1519 */                                  tx2Var = tx2Var2;
/* 1520 */                                  iArr = iArr2;
/* 1521 */                                  qh1Var = qh1Var2;
/* 1522 */                                  long jM7814C2 = m7814C(iM7836U);
/* 1527 */                                  c1771iw2.m5581R(5);
/* 1540 */                                  my2.f14064c.mo4050n(obj2, jM7814C2, ((AbstractC1006hw) c1771iw2.f11948e).mo3266t());
/* 1543 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 2:
/* 1489 */                                  c1771iw2 = c1771iw3;
/* 1491 */                                  tx2Var = tx2Var2;
/* 1492 */                                  iArr = iArr2;
/* 1493 */                                  qh1Var = qh1Var2;
/* 1494 */                                  long jM7814C3 = m7814C(iM7836U);
/* 1498 */                                  c1771iw2.m5581R(0);
/* 1509 */                                  my2.m6829o(obj2, jM7814C3, ((AbstractC1006hw) c1771iw2.f11948e).mo3268v());
/* 1512 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 3:
/* 1461 */                                  c1771iw2 = c1771iw3;
/* 1463 */                                  tx2Var = tx2Var2;
/* 1464 */                                  iArr = iArr2;
/* 1465 */                                  qh1Var = qh1Var2;
/* 1466 */                                  long jM7814C4 = m7814C(iM7836U);
/* 1470 */                                  c1771iw2.m5581R(0);
/* 1481 */                                  my2.m6829o(obj2, jM7814C4, ((AbstractC1006hw) c1771iw2.f11948e).mo3248E());
/* 1484 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 4:
/* 1433 */                                  c1771iw2 = c1771iw3;
/* 1435 */                                  tx2Var = tx2Var2;
/* 1436 */                                  iArr = iArr2;
/* 1437 */                                  qh1Var = qh1Var2;
/* 1438 */                                  long jM7814C5 = m7814C(iM7836U);
/* 1442 */                                  c1771iw2.m5581R(0);
/* 1453 */                                  my2.m6828n(obj2, ((AbstractC1006hw) c1771iw2.f11948e).mo3267u(), jM7814C5);
/* 1456 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 5:
/* 1404 */                                  c1771iw2 = c1771iw3;
/* 1406 */                                  tx2Var = tx2Var2;
/* 1407 */                                  iArr = iArr2;
/* 1408 */                                  qh1Var = qh1Var2;
/* 1409 */                                  long jM7814C6 = m7814C(iM7836U);
/* 1414 */                                  c1771iw2.m5581R(1);
/* 1425 */                                  my2.m6829o(obj2, jM7814C6, ((AbstractC1006hw) c1771iw2.f11948e).mo3265s());
/* 1428 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 6:
/* 1375 */                                  c1771iw2 = c1771iw3;
/* 1377 */                                  tx2Var = tx2Var2;
/* 1378 */                                  iArr = iArr2;
/* 1379 */                                  qh1Var = qh1Var2;
/* 1380 */                                  long jM7814C7 = m7814C(iM7836U);
/* 1385 */                                  c1771iw2.m5581R(5);
/* 1396 */                                  my2.m6828n(obj2, ((AbstractC1006hw) c1771iw2.f11948e).mo3264r(), jM7814C7);
/* 1399 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 7:
/* 1345 */                                  c1771iw2 = c1771iw3;
/* 1347 */                                  tx2Var = tx2Var2;
/* 1348 */                                  iArr = iArr2;
/* 1349 */                                  qh1Var = qh1Var2;
/* 1350 */                                  long jM7814C8 = m7814C(iM7836U);
/* 1354 */                                  c1771iw2.m5581R(0);
/* 1367 */                                  my2.f14064c.mo4047k(obj2, jM7814C8, ((AbstractC1006hw) c1771iw2.f11948e).mo3260m());
/* 1370 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 8:
/* 1332 */                                  c1771iw2 = c1771iw3;
/* 1334 */                                  tx2Var = tx2Var2;
/* 1335 */                                  iArr = iArr2;
/* 1336 */                                  qh1Var = qh1Var2;
/* 1337 */                                  qh1Var.m7830M(iM7836U, c1771iw2, obj2);
/* 1340 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 9:
/* 1305 */                                  c1771iw2 = c1771iw3;
/* 1306 */                                  dg0 dg0Var3 = dg0Var2;
/* 1307 */                                  tx2Var = tx2Var2;
/* 1308 */                                  iArr = iArr2;
/* 1309 */                                  qh1Var = qh1Var2;
/* 1314 */                                  AbstractC2313w abstractC2313w = (AbstractC2313w) qh1Var.m7850y(iM7833Q, obj2);
/* 1316 */                                  h72 h72VarM7842o = qh1Var.m7842o(iM7833Q);
/* 1321 */                                  c1771iw2.m5581R(2);
/* 1324 */                                  c1771iw2.m5588f(abstractC2313w, h72VarM7842o, dg0Var3);
/* 1327 */                                  qh1Var.m7834R(iM7833Q, obj2, abstractC2313w);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 10:
/* 1284 */                                  c1771iw2 = c1771iw3;
/* 1286 */                                  tx2Var = tx2Var2;
/* 1287 */                                  iArr = iArr2;
/* 1288 */                                  qh1Var = qh1Var2;
/* 1297 */                                  my2.m6830p(obj2, m7814C(iM7836U), c1771iw2.m5593k());
/* 1300 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 11:
/* 1256 */                                  c1771iw2 = c1771iw3;
/* 1258 */                                  tx2Var = tx2Var2;
/* 1259 */                                  iArr = iArr2;
/* 1260 */                                  qh1Var = qh1Var2;
/* 1261 */                                  long jM7814C9 = m7814C(iM7836U);
/* 1265 */                                  c1771iw2.m5581R(0);
/* 1276 */                                  my2.m6828n(obj2, ((AbstractC1006hw) c1771iw2.f11948e).mo3247D(), jM7814C9);
/* 1279 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 12:
/* 1225 */                                  c1771iw2 = c1771iw3;
/* 1227 */                                  tx2Var = tx2Var2;
/* 1228 */                                  iArr = iArr2;
/* 1229 */                                  qh1Var = qh1Var2;
/* 1230 */                                  c1771iw2.m5581R(0);
/* 1237 */                                  int iMo3263q = ((AbstractC1006hw) c1771iw2.f11948e).mo3263q();
/* 1241 */                                  qh1Var.m7840m(iM7833Q);
/* 1248 */                                  my2.m6828n(obj2, iMo3263q, m7814C(iM7836U));
/* 1251 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1196 */                                  c1771iw2 = c1771iw3;
/* 1198 */                                  tx2Var = tx2Var2;
/* 1199 */                                  iArr = iArr2;
/* 1200 */                                  qh1Var = qh1Var2;
/* 1201 */                                  long jM7814C10 = m7814C(iM7836U);
/* 1206 */                                  c1771iw2.m5581R(5);
/* 1217 */                                  my2.m6828n(obj2, ((AbstractC1006hw) c1771iw2.f11948e).mo3269w(), jM7814C10);
/* 1220 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 14:
/* 1167 */                                  c1771iw2 = c1771iw3;
/* 1169 */                                  tx2Var = tx2Var2;
/* 1170 */                                  iArr = iArr2;
/* 1171 */                                  qh1Var = qh1Var2;
/* 1172 */                                  long jM7814C11 = m7814C(iM7836U);
/* 1177 */                                  c1771iw2.m5581R(1);
/* 1188 */                                  my2.m6829o(obj2, jM7814C11, ((AbstractC1006hw) c1771iw2.f11948e).mo3270x());
/* 1191 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1139 */                                  c1771iw2 = c1771iw3;
/* 1141 */                                  tx2Var = tx2Var2;
/* 1142 */                                  iArr = iArr2;
/* 1143 */                                  qh1Var = qh1Var2;
/* 1144 */                                  long jM7814C12 = m7814C(iM7836U);
/* 1148 */                                  c1771iw2.m5581R(0);
/* 1159 */                                  my2.m6828n(obj2, ((AbstractC1006hw) c1771iw2.f11948e).mo3271y(), jM7814C12);
/* 1162 */                                  qh1Var.m7831O(iM7833Q, obj2);
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 16:
/* 1103 */                                  c1771iw2 = c1771iw3;
/* 1105 */                                  qh1Var = qh1Var2;
/* 1106 */                                  long jM7814C13 = m7814C(iM7836U);
/* 1110 */                                  c1771iw2.m5581R(0);
/* 1117 */                                  tx2Var = tx2Var2;
/* 1118 */                                  iArr = iArr2;
                                            try {
/* 1123 */                                      my2.m6829o(obj2, jM7814C13, ((AbstractC1006hw) c1771iw2.f11948e).mo3272z());
/* 1126 */                                      qh1Var.m7831O(iM7833Q, obj2);
                                            } catch (nz0 unused2) {
/* 1592 */                                      tx2Var.getClass();
/* 1595 */                                      if (rx2VarM8921a == null) {
/* 1597 */                                          rx2VarM8921a = tx2.m8921a(obj2);
                                                }
/* 1606 */                                      if (!tx2.m8922b(rx2VarM8921a, c1771iw2)) {
/* 1608 */                                          while (i2 < i) {
/* 1612 */                                              qh1Var.m7839l(iArr[i2], obj2, rx2VarM8921a);
/* 1615 */                                              i2++;
                                                    }
/* 1618 */                                          if (rx2VarM8921a == null) {
/* 1622 */                                              return;
                                                    }
/* 73 */                                            ((sq0) obj2).unknownFields = rx2VarM8921a;
                                                }
                                            }
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 17:
/* 1079 */                                  c1771iw2 = c1771iw3;
/* 1080 */                                  dg0 dg0Var4 = dg0Var2;
/* 1081 */                                  qh1Var = qh1Var2;
/* 1086 */                                  AbstractC2313w abstractC2313w2 = (AbstractC2313w) qh1Var.m7850y(iM7833Q, obj2);
/* 1088 */                                  h72 h72VarM7842o2 = qh1Var.m7842o(iM7833Q);
/* 1092 */                                  c1771iw2.m5581R(3);
/* 1095 */                                  c1771iw2.m5586d(abstractC2313w2, h72VarM7842o2, dg0Var4);
/* 1098 */                                  qh1Var.m7834R(iM7833Q, obj2, abstractC2313w2);
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 18:
/* 1063 */                                  c1771iw2 = c1771iw3;
/* 1065 */                                  qh1Var = qh1Var2;
/* 1074 */                                  c1771iw2.m5597o(c81Var.mo103c(obj2, m7814C(iM7836U)));
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 19:
/* 1047 */                                  c1771iw2 = c1771iw3;
/* 1049 */                                  qh1Var = qh1Var2;
/* 1058 */                                  c1771iw2.m5606x(c81Var.mo103c(obj2, m7814C(iM7836U)));
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 20:
/* 1031 */                                  c1771iw2 = c1771iw3;
/* 1033 */                                  qh1Var = qh1Var2;
/* 1042 */                                  c1771iw2.m5565B(c81Var.mo103c(obj2, m7814C(iM7836U)));
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_21 /* 21 */:
/* 1016 */                                  c1771iw2 = c1771iw3;
/* 1018 */                                  qh1Var = qh1Var2;
/* 1026 */                                  c1771iw2.m5579P(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_22 /* 22 */:
/* 1001 */                                  c1771iw2 = c1771iw3;
/* 1003 */                                  qh1Var = qh1Var2;
/* 1011 */                                  c1771iw2.m5608z(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_23 /* 23 */:
/* 986 */                                   c1771iw2 = c1771iw3;
/* 988 */                                   qh1Var = qh1Var2;
/* 996 */                                   c1771iw2.m5604v(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 24:
/* 971 */                                   c1771iw2 = c1771iw3;
/* 973 */                                   qh1Var = qh1Var2;
/* 981 */                                   c1771iw2.m5602t(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_25 /* 25 */:
/* 956 */                                   c1771iw2 = c1771iw3;
/* 958 */                                   qh1Var = qh1Var2;
/* 966 */                                   c1771iw2.m5591i(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_26 /* 26 */:
/* 918 */                                   c1771iw2 = c1771iw3;
/* 920 */                                   qh1Var = qh1Var2;
/* 929 */                                   if ((536870912 & iM7836U) != 0) {
                                                try {
/* 939 */                                           c1771iw2.m5575L(c81Var.mo103c(obj2, iM7836U & 1048575), true);
                                                } catch (nz0 unused3) {
/* 139 */                                           tx2Var = tx2Var2;
/* 140 */                                           iArr = iArr2;
/* 1592 */                                          tx2Var.getClass();
/* 1595 */                                          if (rx2VarM8921a == null) {
/* 1597 */                                              rx2VarM8921a = tx2.m8921a(obj2);
                                                    }
/* 1606 */                                          if (!tx2.m8922b(rx2VarM8921a, c1771iw2)) {
/* 1608 */                                              while (i2 < i) {
/* 1612 */                                                  qh1Var.m7839l(iArr[i2], obj2, rx2VarM8921a);
/* 1615 */                                                  i2++;
                                                        }
/* 1618 */                                              if (rx2VarM8921a == null) {
/* 1622 */                                                  return;
                                                        }
/* 73 */                                                ((sq0) obj2).unknownFields = rx2VarM8921a;
                                                    }
                                                } catch (Throwable th3) {
/* 1134 */                                          th = th3;
/* 1135 */                                          tx2Var = tx2Var2;
/* 1136 */                                          iArr = iArr2;
/* 1634 */                                          while (i2 < i) {
/* 1638 */                                              qh1Var.m7839l(iArr[i2], obj2, rx2VarM8921a);
/* 1641 */                                              i2++;
                                                    }
/* 1644 */                                          if (rx2VarM8921a != null) {
/* 1646 */                                              tx2Var.getClass();
/* 1652 */                                              ((sq0) obj2).unknownFields = rx2VarM8921a;
                                                    }
/* 1654 */                                          throw th;
                                                }
                                            } else {
/* 951 */                                       c1771iw2.m5575L(c81Var.mo103c(obj2, iM7836U & 1048575), false);
                                            }
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_27 /* 27 */:
                                            try {
                                                try {
/* 901 */                                           qh1Var2.m7829L(obj2, iM7836U, c1771iw3, qh1Var2.m7842o(iM7833Q), dg0Var);
/* 904 */                                           c1771iw2 = c1771iw3;
/* 906 */                                           qh1Var = qh1Var2;
/* 186 */                                           tx2Var = tx2Var2;
/* 187 */                                           iArr = iArr2;
                                                } catch (nz0 unused4) {
/* 909 */                                           c1771iw2 = c1771iw3;
/* 911 */                                           qh1Var = qh1Var2;
/* 139 */                                           tx2Var = tx2Var2;
/* 140 */                                           iArr = iArr2;
/* 1592 */                                          tx2Var.getClass();
/* 1595 */                                          if (rx2VarM8921a == null) {
/* 1597 */                                              rx2VarM8921a = tx2.m8921a(obj2);
                                                    }
/* 1606 */                                          if (!tx2.m8922b(rx2VarM8921a, c1771iw2)) {
/* 1608 */                                              while (i2 < i) {
/* 1612 */                                                  qh1Var.m7839l(iArr[i2], obj2, rx2VarM8921a);
/* 1615 */                                                  i2++;
                                                        }
/* 1618 */                                              if (rx2VarM8921a == null) {
/* 1622 */                                                  return;
                                                        }
/* 73 */                                                ((sq0) obj2).unknownFields = rx2VarM8921a;
                                                    }
                                                }
                                            } catch (nz0 unused5) {
/* 137 */                                       qh1Var = qh1Var2;
/* 138 */                                       c1771iw2 = c1771iw3;
/* 139 */                                       tx2Var = tx2Var2;
/* 140 */                                       iArr = iArr2;
/* 1592 */                                      tx2Var.getClass();
/* 1595 */                                      if (rx2VarM8921a == null) {
/* 1597 */                                          rx2VarM8921a = tx2.m8921a(obj2);
                                                }
/* 1606 */                                      if (!tx2.m8922b(rx2VarM8921a, c1771iw2)) {
/* 1608 */                                          while (i2 < i) {
/* 1612 */                                              qh1Var.m7839l(iArr[i2], obj2, rx2VarM8921a);
/* 1615 */                                              i2++;
                                                    }
/* 1618 */                                          if (rx2VarM8921a == null) {
/* 1622 */                                              return;
                                                    }
/* 73 */                                            ((sq0) obj2).unknownFields = rx2VarM8921a;
                                                }
/* 1623 */                                      qh1Var2 = qh1Var;
/* 1624 */                                      tx2Var2 = tx2Var;
/* 1625 */                                      c1771iw3 = c1771iw2;
/* 1626 */                                      iArr2 = iArr;
/* 1627 */                                      dg0Var2 = dg0Var;
                                                break;
                                            }
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_28 /* 28 */:
/* 890 */                                   c1771iw3.m5595m(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_29 /* 29 */:
/* 878 */                                   c1771iw3.m5577N(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_30 /* 30 */:
/* 861 */                                   c1771iw3.m5599q(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 864 */                                   qh1Var2.m7840m(iM7833Q);
/* 867 */                                   Class cls = l72.f13131a;
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_31 /* 31 */:
/* 849 */                                   c1771iw3.m5567D(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 32:
/* 837 */                                   c1771iw3.m5569F(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_33 /* 33 */:
/* 825 */                                   c1771iw3.m5571H(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_34 /* 34 */:
/* 813 */                                   c1771iw3.m5573J(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_35 /* 35 */:
/* 801 */                                   c1771iw3.m5597o(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case Build.API_LEVELS.API_36 /* 36 */:
/* 789 */                                   c1771iw3.m5606x(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 37:
/* 777 */                                   c1771iw3.m5565B(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 38:
/* 765 */                                   c1771iw3.m5579P(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 39:
/* 753 */                                   c1771iw3.m5608z(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case RequestError.NETWORK_FAILURE /* 40 */:
/* 741 */                                   c1771iw3.m5604v(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case RequestError.NO_DEV_KEY /* 41 */:
/* 729 */                                   c1771iw3.m5602t(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 42:
/* 717 */                                   c1771iw3.m5591i(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 43:
/* 705 */                                   c1771iw3.m5577N(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 44:
/* 688 */                                   c1771iw3.m5599q(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 691 */                                   qh1Var2.m7840m(iM7833Q);
/* 694 */                                   Class cls2 = l72.f13131a;
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 45:
/* 676 */                                   c1771iw3.m5567D(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 46:
/* 664 */                                   c1771iw3.m5569F(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 47:
/* 652 */                                   c1771iw3.m5571H(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 48:
/* 640 */                                   c1771iw3.m5573J(c81Var.mo103c(obj2, iM7836U & 1048575));
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 49:
/* 621 */                                   C1771iw c1771iw4 = c1771iw3;
                                            try {
/* 623 */                                       qh1Var2.m7828K(obj2, iM7836U & 1048575, c1771iw4, qh1Var2.m7842o(iM7833Q), dg0Var);
/* 626 */                                       c1771iw3 = c1771iw4;
/* 184 */                                       qh1Var = qh1Var2;
/* 185 */                                       c1771iw2 = c1771iw3;
/* 186 */                                       tx2Var = tx2Var2;
/* 187 */                                       iArr = iArr2;
                                            } catch (nz0 unused6) {
/* 629 */                                       qh1Var = qh1Var2;
/* 630 */                                       c1771iw2 = c1771iw4;
/* 139 */                                       tx2Var = tx2Var2;
/* 140 */                                       iArr = iArr2;
/* 1592 */                                      tx2Var.getClass();
/* 1595 */                                      if (rx2VarM8921a == null) {
/* 1597 */                                          rx2VarM8921a = tx2.m8921a(obj2);
                                                }
/* 1606 */                                      if (!tx2.m8922b(rx2VarM8921a, c1771iw2)) {
/* 1608 */                                          while (i2 < i) {
/* 1612 */                                              qh1Var.m7839l(iArr[i2], obj2, rx2VarM8921a);
/* 1615 */                                              i2++;
                                                    }
/* 1618 */                                          if (rx2VarM8921a == null) {
/* 1622 */                                              return;
                                                    }
/* 73 */                                            ((sq0) obj2).unknownFields = rx2VarM8921a;
                                                }
                                            }
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 608 */                                   qh1Var2.m7847v(iM7833Q, obj2, qh1Var2.m7841n(iM7833Q));
/* 611 */                                   throw null;
                                        case 51:
/* 581 */                                   c1771iw3.m5581R(1);
/* 596 */                                   my2.m6830p(obj2, iM7836U & 1048575, Double.valueOf(((AbstractC1006hw) c1771iw3.f11948e).mo3262p()));
/* 599 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 52:
/* 554 */                                   c1771iw3.m5581R(5);
/* 569 */                                   my2.m6830p(obj2, iM7836U & 1048575, Float.valueOf(((AbstractC1006hw) c1771iw3.f11948e).mo3266t()));
/* 572 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 53:
/* 527 */                                   c1771iw3.m5581R(0);
/* 542 */                                   my2.m6830p(obj2, iM7836U & 1048575, Long.valueOf(((AbstractC1006hw) c1771iw3.f11948e).mo3268v()));
/* 545 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 54:
/* 501 */                                   c1771iw3.m5581R(0);
/* 516 */                                   my2.m6830p(obj2, iM7836U & 1048575, Long.valueOf(((AbstractC1006hw) c1771iw3.f11948e).mo3248E()));
/* 519 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 55:
/* 475 */                                   c1771iw3.m5581R(0);
/* 490 */                                   my2.m6830p(obj2, iM7836U & 1048575, Integer.valueOf(((AbstractC1006hw) c1771iw3.f11948e).mo3267u()));
/* 493 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 56:
/* 449 */                                   c1771iw3.m5581R(1);
/* 464 */                                   my2.m6830p(obj2, iM7836U & 1048575, Long.valueOf(((AbstractC1006hw) c1771iw3.f11948e).mo3265s()));
/* 467 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 57:
/* 422 */                                   c1771iw3.m5581R(5);
/* 437 */                                   my2.m6830p(obj2, iM7836U & 1048575, Integer.valueOf(((AbstractC1006hw) c1771iw3.f11948e).mo3264r()));
/* 440 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 58:
/* 395 */                                   c1771iw3.m5581R(0);
/* 410 */                                   my2.m6830p(obj2, iM7836U & 1048575, Boolean.valueOf(((AbstractC1006hw) c1771iw3.f11948e).mo3260m()));
/* 413 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 59:
/* 384 */                                   qh1Var2.m7830M(iM7836U, c1771iw3, obj2);
/* 387 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 60:
/* 366 */                                   AbstractC2313w abstractC2313w3 = (AbstractC2313w) qh1Var2.m7851z(iM5585c, obj2, iM7833Q);
/* 368 */                                   h72 h72VarM7842o3 = qh1Var2.m7842o(iM7833Q);
/* 373 */                                   c1771iw3.m5581R(2);
/* 376 */                                   c1771iw3.m5588f(abstractC2313w3, h72VarM7842o3, dg0Var2);
/* 379 */                                   qh1Var2.m7835S(obj2, iM5585c, iM7833Q, abstractC2313w3);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 61:
/* 354 */                                   my2.m6830p(obj2, iM7836U & 1048575, c1771iw3.m5593k());
/* 357 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 62:
/* 324 */                                   c1771iw3.m5581R(0);
/* 339 */                                   my2.m6830p(obj2, iM7836U & 1048575, Integer.valueOf(((AbstractC1006hw) c1771iw3.f11948e).mo3247D()));
/* 342 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 63:
/* 292 */                                   c1771iw3.m5581R(0);
/* 299 */                                   int iMo3263q2 = ((AbstractC1006hw) c1771iw3.f11948e).mo3263q();
/* 303 */                                   qh1Var2.m7840m(iM7833Q);
/* 313 */                                   my2.m6830p(obj2, iM7836U & 1048575, Integer.valueOf(iMo3263q2));
/* 316 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 64:
/* 270 */                                   c1771iw3.m5581R(5);
/* 285 */                                   my2.m6830p(obj2, iM7836U & 1048575, Integer.valueOf(((AbstractC1006hw) c1771iw3.f11948e).mo3269w()));
/* 288 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 65:
/* 244 */                                   c1771iw3.m5581R(1);
/* 259 */                                   my2.m6830p(obj2, iM7836U & 1048575, Long.valueOf(((AbstractC1006hw) c1771iw3.f11948e).mo3270x()));
/* 262 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 66:
/* 218 */                                   c1771iw3.m5581R(0);
/* 233 */                                   my2.m6830p(obj2, iM7836U & 1048575, Integer.valueOf(((AbstractC1006hw) c1771iw3.f11948e).mo3271y()));
/* 236 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 67:
/* 193 */                                   c1771iw3.m5581R(0);
/* 208 */                                   my2.m6830p(obj2, iM7836U & 1048575, Long.valueOf(((AbstractC1006hw) c1771iw3.f11948e).mo3272z()));
/* 211 */                                   qh1Var2.m7832P(iM5585c, obj2, iM7833Q);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        case 68:
/* 169 */                                   AbstractC2313w abstractC2313w4 = (AbstractC2313w) qh1Var2.m7851z(iM5585c, obj2, iM7833Q);
/* 171 */                                   h72 h72VarM7842o4 = qh1Var2.m7842o(iM7833Q);
/* 175 */                                   c1771iw3.m5581R(3);
/* 178 */                                   c1771iw3.m5586d(abstractC2313w4, h72VarM7842o4, dg0Var2);
/* 181 */                                   qh1Var2.m7835S(obj2, iM5585c, iM7833Q, abstractC2313w4);
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                        default:
/* 126 */                                   if (rx2VarM8921a == null) {
                                                try {
/* 128 */                                           tx2Var2.getClass();
/* 131 */                                           rx2VarM8921a = tx2.m8921a(obj2);
                                                } catch (nz0 unused7) {
/* 137 */                                           qh1Var = qh1Var2;
/* 138 */                                           c1771iw2 = c1771iw3;
/* 139 */                                           tx2Var = tx2Var2;
/* 140 */                                           iArr = iArr2;
/* 1592 */                                          tx2Var.getClass();
/* 1595 */                                          if (rx2VarM8921a == null) {
/* 1597 */                                              rx2VarM8921a = tx2.m8921a(obj2);
                                                    }
/* 1606 */                                          if (!tx2.m8922b(rx2VarM8921a, c1771iw2)) {
/* 1608 */                                              while (i2 < i) {
/* 1612 */                                                  qh1Var.m7839l(iArr[i2], obj2, rx2VarM8921a);
/* 1615 */                                                  i2++;
                                                        }
/* 1618 */                                              if (rx2VarM8921a == null) {
/* 1622 */                                                  return;
                                                        }
/* 73 */                                                ((sq0) obj2).unknownFields = rx2VarM8921a;
                                                    }
                                                }
                                            }
/* 143 */                                   tx2Var2.getClass();
/* 150 */                                   if (!tx2.m8922b(rx2VarM8921a, c1771iw3)) {
/* 152 */                                       while (i2 < i) {
/* 156 */                                           qh1Var2.m7839l(iArr2[i2], obj2, rx2VarM8921a);
/* 159 */                                           i2++;
                                                }
/* 162 */                                       if (rx2VarM8921a == null) {
/* 1622 */                                          return;
                                                }
                                            }
/* 184 */                                   qh1Var = qh1Var2;
/* 185 */                                   c1771iw2 = c1771iw3;
/* 186 */                                   tx2Var = tx2Var2;
/* 187 */                                   iArr = iArr2;
/* 1623 */                                  qh1Var2 = qh1Var;
/* 1624 */                                  tx2Var2 = tx2Var;
/* 1625 */                                  c1771iw3 = c1771iw2;
/* 1626 */                                  iArr2 = iArr;
/* 1627 */                                  dg0Var2 = dg0Var;
                                            break;
                                    }
                                } catch (nz0 unused8) {
/* 1586 */                          qh1Var = qh1Var2;
/* 1587 */                          c1771iw2 = c1771iw3;
/* 1588 */                          tx2Var = tx2Var2;
/* 1589 */                          iArr = iArr2;
                                }
                            } else if (iM5585c == Integer.MAX_VALUE) {
/* 55 */                        while (i2 < i) {
/* 59 */                            qh1Var2.m7839l(iArr2[i2], obj2, rx2VarM8921a);
/* 62 */                            i2++;
                                }
/* 65 */                        if (rx2VarM8921a == null) {
/* 1622 */                          return;
                                } else {
/* 67 */                            tx2Var2.getClass();
                                }
                            } else {
/* 77 */                        tx2Var2.getClass();
/* 80 */                        if (rx2VarM8921a == null) {
/* 82 */                            rx2VarM8921a = tx2.m8921a(obj2);
                                }
/* 91 */                        if (!tx2.m8922b(rx2VarM8921a, c1771iw3)) {
/* 94 */                            while (i2 < i) {
/* 98 */                                qh1Var2.m7839l(iArr2[i2], obj2, rx2VarM8921a);
/* 101 */                               i2++;
                                    }
/* 104 */                           if (rx2VarM8921a == null) {
/* 1622 */                              return;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
/* 1631 */                  th = th4;
/* 43 */                    qh1Var = qh1Var2;
                        }
                    }
/* 73 */            ((sq0) obj2).unknownFields = rx2VarM8921a;
                }

                @Override // p000.h72
                /* JADX INFO: renamed from: h */
                public final void mo4130h(Object obj, byte[] bArr, int i, int i2, C0176bd c0176bd) throws pz0 {
/* 3 */             if (this.f15556g) {
/* 5 */                 m7826I(obj, bArr, i, i2, c0176bd);
                    } else {
/* 16 */                m7825H(obj, bArr, i, i2, 0, c0176bd);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:13:0x003d  */
                @Override // p000.h72
                /* JADX INFO: renamed from: i */
                public final boolean mo4131i(sq0 sq0Var, sq0 sq0Var2) {
/* 1 */             int[] iArr = this.f15550a;
/* 3 */             int length = iArr.length;
/* 5 */             int i = 0;
                    while (true) {
/* 6 */                 boolean zM6391x = true;
/* 7 */                 if (i < length) {
/* 9 */                     int iM7836U = m7836U(i);
/* 16 */                    long j = iM7836U & 1048575;
                            switch (m7818T(iM7836U)) {
                                case 0:
/* 471 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 473 */                               ky2 ky2Var = my2.f14064c;
/* 493 */                               if (Double.doubleToLongBits(ky2Var.mo4045e(sq0Var, j)) != Double.doubleToLongBits(ky2Var.mo4045e(sq0Var2, j))) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 1:
/* 444 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 446 */                               ky2 ky2Var2 = my2.f14064c;
/* 464 */                               if (Float.floatToIntBits(ky2Var2.mo4046f(sq0Var, j)) != Float.floatToIntBits(ky2Var2.mo4046f(sq0Var2, j))) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 2:
/* 423 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 425 */                               ky2 ky2Var3 = my2.f14064c;
/* 437 */                               if (ky2Var3.m6312h(sq0Var, j) != ky2Var3.m6312h(sq0Var2, j)) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 3:
/* 402 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 404 */                               ky2 ky2Var4 = my2.f14064c;
/* 416 */                               if (ky2Var4.m6312h(sq0Var, j) != ky2Var4.m6312h(sq0Var2, j)) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 4:
/* 383 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 385 */                               ky2 ky2Var5 = my2.f14064c;
/* 395 */                               if (ky2Var5.m6311g(sq0Var, j) != ky2Var5.m6311g(sq0Var2, j)) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 5:
/* 361 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 363 */                               ky2 ky2Var6 = my2.f14064c;
/* 375 */                               if (ky2Var6.m6312h(sq0Var, j) != ky2Var6.m6312h(sq0Var2, j)) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 6:
/* 341 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 343 */                               ky2 ky2Var7 = my2.f14064c;
/* 353 */                               if (ky2Var7.m6311g(sq0Var, j) != ky2Var7.m6311g(sq0Var2, j)) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 7:
/* 321 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 323 */                               ky2 ky2Var8 = my2.f14064c;
/* 333 */                               if (ky2Var8.mo4043c(sq0Var, j) != ky2Var8.mo4043c(sq0Var2, j)) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 8:
/* 297 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 299 */                               ky2 ky2Var9 = my2.f14064c;
/* 313 */                               if (!l72.m6391x(ky2Var9.m6313i(sq0Var, j), ky2Var9.m6313i(sq0Var2, j))) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 9:
/* 273 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 275 */                               ky2 ky2Var10 = my2.f14064c;
/* 289 */                               if (!l72.m6391x(ky2Var10.m6313i(sq0Var, j), ky2Var10.m6313i(sq0Var2, j))) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 10:
/* 249 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 251 */                               ky2 ky2Var11 = my2.f14064c;
/* 265 */                               if (!l72.m6391x(ky2Var11.m6313i(sq0Var, j), ky2Var11.m6313i(sq0Var2, j))) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 11:
/* 229 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 231 */                               ky2 ky2Var12 = my2.f14064c;
/* 241 */                               if (ky2Var12.m6311g(sq0Var, j) != ky2Var12.m6311g(sq0Var2, j)) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 12:
/* 209 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 211 */                               ky2 ky2Var13 = my2.f14064c;
/* 221 */                               if (ky2Var13.m6311g(sq0Var, j) != ky2Var13.m6311g(sq0Var2, j)) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 189 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 191 */                               ky2 ky2Var14 = my2.f14064c;
/* 201 */                               if (ky2Var14.m6311g(sq0Var, j) != ky2Var14.m6311g(sq0Var2, j)) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 14:
/* 167 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 169 */                               ky2 ky2Var15 = my2.f14064c;
/* 181 */                               if (ky2Var15.m6312h(sq0Var, j) != ky2Var15.m6312h(sq0Var2, j)) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 147 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 149 */                               ky2 ky2Var16 = my2.f14064c;
/* 159 */                               if (ky2Var16.m6311g(sq0Var, j) != ky2Var16.m6311g(sq0Var2, j)) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 16:
/* 125 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 127 */                               ky2 ky2Var17 = my2.f14064c;
/* 139 */                               if (ky2Var17.m6312h(sq0Var, j) != ky2Var17.m6312h(sq0Var2, j)) {
/* 62 */                                    zM6391x = false;
                                        }
                                    }
                                    break;
                                case 17:
/* 101 */                           if (!m7838j(sq0Var, sq0Var2, i)) {
/* 62 */                                zM6391x = false;
                                    } else {
/* 103 */                               ky2 ky2Var18 = my2.f14064c;
/* 117 */                               if (!l72.m6391x(ky2Var18.m6313i(sq0Var, j), ky2Var18.m6313i(sq0Var2, j))) {
/* 62 */                                    zM6391x = false;
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
/* 81 */                            ky2 ky2Var19 = my2.f14064c;
/* 91 */                            zM6391x = l72.m6391x(ky2Var19.m6313i(sq0Var, j), ky2Var19.m6313i(sq0Var2, j));
                                    break;
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 65 */                            ky2 ky2Var20 = my2.f14064c;
/* 75 */                            zM6391x = l72.m6391x(ky2Var20.m6313i(sq0Var, j), ky2Var20.m6313i(sq0Var2, j));
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
/* 34 */                            ky2 ky2Var21 = my2.f14064c;
/* 44 */                            if (ky2Var21.m6311g(sq0Var, j2) != ky2Var21.m6311g(sq0Var2, j2) || !l72.m6391x(ky2Var21.m6313i(sq0Var, j), ky2Var21.m6313i(sq0Var2, j))) {
/* 62 */                                zM6391x = false;
                                    }
                                    break;
                            }
/* 495 */                   if (zM6391x) {
/* 498 */                       i += 3;
                            }
                        } else {
/* 504 */                   this.f15562m.getClass();
/* 515 */                   if (sq0Var.unknownFields.equals(sq0Var2.unknownFields)) {
/* 6 */                         return true;
                            }
                        }
                    }
/* 4 */             return false;
                }

                /* JADX INFO: renamed from: j */
                public final boolean m7838j(sq0 sq0Var, sq0 sq0Var2, int i) {
                    return m7845r(i, sq0Var) == m7845r(i, sq0Var2);
                }

                /* JADX INFO: renamed from: l */
                public final void m7839l(int i, Object obj, Object obj2) {
/* 3 */             int i2 = this.f15550a[i];
/* 20 */            if (my2.f14064c.m6313i(obj, m7836U(i) & 1048575) == null) {
/* 22 */                return;
                    }
/* 23 */            m7840m(i);
                }

                /* JADX INFO: renamed from: m */
                public final void m7840m(int i) {
/* 11 */            if (this.f15551b[((i / 3) * 2) + 1] == null) {
/* 13 */                return;
                    }
/* 14 */            C1697u2.m5431g();
                }

                /* JADX INFO: renamed from: n */
                public final Object m7841n(int i) {
/* 7 */             return this.f15551b[(i / 3) * 2];
                }

                @Override // p000.h72
                public final Object newInstance() {
/* 3 */             this.f15560k.getClass();
/* 10 */            return ((sq0) this.f15554e).m8623q();
                }

                /* JADX INFO: renamed from: o */
                public final h72 m7842o(int i) {
/* 3 */             int i2 = (i / 3) * 2;
/* 5 */             Object[] objArr = this.f15551b;
/* 9 */             h72 h72Var = (h72) objArr[i2];
/* 11 */            if (h72Var != null) {
/* 13 */                return h72Var;
                    }
/* 22 */            h72 h72VarM1182a = az1.f2145c.m1182a((Class) objArr[i2 + 1]);
/* 26 */            objArr[i2] = h72VarM1182a;
/* 28 */            return h72VarM1182a;
                }

                /* JADX WARN: Code duplicated, block: B:28:0x008f  */
                /* JADX WARN: Code duplicated, block: B:31:0x009b  */
                /* JADX WARN: Code duplicated, block: B:56:0x012b  */
                /* JADX INFO: renamed from: p */
                public final int m7843p(sq0 sq0Var) {
                    int i;
                    int iM5908h;
                    int iM5910j;
                    int iM5908h2;
                    int iM5906f;
                    int iM5904d;
                    int iM5908h3;
                    int iM5907g;
                    int iM5908h4;
                    int size;
                    int iM5908h5;
                    int iMo8615b;
                    int iM6374g;
                    int iM5908h6;
                    int iM5905e;
                    int iM3777c;
/* 5 */             Unsafe unsafe = f15549p;
/* 7 */             int i2 = 1048575;
/* 10 */            int i3 = 1048575;
/* 11 */            int i4 = 0;
/* 12 */            int iM5908h7 = 0;
/* 13 */            int i5 = 0;
                    while (true) {
/* 14 */                int[] iArr = this.f15550a;
/* 17 */                if (i4 >= iArr.length) {
/* 1218 */                  this.f15562m.getClass();
/* 1227 */                  return sq0Var.unknownFields.m8320b() + iM5908h7;
                        }
/* 19 */                int iM7836U = m7836U(i4);
/* 23 */                int i6 = iArr[i4];
/* 25 */                int iM7818T = m7818T(iM7836U);
/* 32 */                if (iM7818T <= 17) {
/* 36 */                    int i7 = iArr[i4 + 2];
/* 38 */                    int i8 = i7 & i2;
/* 42 */                    i = 1 << (i7 >>> 20);
/* 44 */                    if (i8 != i3) {
/* 47 */                        i5 = unsafe.getInt(sq0Var, i8);
/* 51 */                        i3 = i8;
                            }
                        } else {
/* 53 */                    i = 0;
                        }
/* 54 */                long j = iM7836U & i2;
                        switch (iM7818T) {
                            case 0:
/* 1205 */                      if ((i5 & i) != 0) {
/* 144 */                           iM5908h7 = fm0.m3776b(i6, 8, iM5908h7);
                                }
                                break;
                            case 1:
/* 1199 */                      if ((i5 & i) != 0) {
/* 156 */                           iM5908h7 = fm0.m3776b(i6, 4, iM5908h7);
                                }
                                break;
                            case 2:
/* 1181 */                      if ((i & i5) != 0) {
/* 1183 */                          long j2 = unsafe.getLong(sq0Var, j);
/* 1187 */                          iM5908h = C1808jw.m5908h(i6);
/* 1191 */                          iM5910j = C1808jw.m5910j(j2);
/* 111 */                           iM5904d = iM5910j + iM5908h;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 3:
/* 1164 */                      if ((i & i5) != 0) {
/* 1166 */                          long j3 = unsafe.getLong(sq0Var, j);
/* 1170 */                          iM5908h = C1808jw.m5908h(i6);
/* 1174 */                          iM5910j = C1808jw.m5910j(j3);
/* 111 */                           iM5904d = iM5910j + iM5908h;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 4:
/* 1147 */                      if ((i & i5) != 0) {
/* 1149 */                          int i9 = unsafe.getInt(sq0Var, j);
/* 1153 */                          iM5908h2 = C1808jw.m5908h(i6);
/* 1157 */                          iM5906f = C1808jw.m5906f(i9);
/* 136 */                           iM5904d = iM5906f + iM5908h2;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 5:
/* 1138 */                      if ((i5 & i) != 0) {
/* 1140 */                          iM5904d = C1808jw.m5904d(i6);
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 6:
/* 1128 */                      if ((i5 & i) != 0) {
/* 1130 */                          iM5904d = C1808jw.m5903c(i6);
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 7:
/* 1122 */                      if ((i5 & i) != 0) {
/* 300 */                           iM5908h7 = fm0.m3776b(i6, 1, iM5908h7);
                                }
                                break;
                            case 8:
/* 1086 */                      if ((i & i5) != 0) {
/* 1088 */                          Object object = unsafe.getObject(sq0Var, j);
/* 1094 */                          if (object instanceof AbstractC2298vl) {
/* 1098 */                              iM5908h4 = C1808jw.m5908h(i6);
/* 1102 */                              size = ((AbstractC2298vl) object).size();
/* 274 */                               iM3777c = fm0.m3777c(size, size, iM5908h4, iM5908h7);
/* 278 */                               iM5908h7 = iM3777c;
                                    } else {
/* 1110 */                              iM5908h3 = C1808jw.m5908h(i6);
/* 1114 */                              iM5907g = C1808jw.m5907g((String) object);
/* 292 */                               iM3777c = iM5907g + iM5908h3 + iM5908h7;
/* 278 */                               iM5908h7 = iM3777c;
                                    }
                                }
                                break;
                            case 9:
/* 1061 */                      if ((i & i5) != 0) {
/* 1063 */                          Object object2 = unsafe.getObject(sq0Var, j);
/* 1067 */                          h72 h72VarM7842o = m7842o(i4);
/* 1071 */                          Class cls = l72.f13131a;
/* 1075 */                          iM5908h5 = C1808jw.m5908h(i6);
/* 1079 */                          iMo8615b = ((AbstractC2313w) object2).mo8615b(h72VarM7842o);
/* 244 */                           iM5908h7 = fm0.m3777c(iMo8615b, iMo8615b, iM5908h5, iM5908h7);
                                }
                                break;
                            case 10:
/* 1046 */                      if ((i & i5) != 0) {
/* 1054 */                          iM5904d = C1808jw.m5901a(i6, (AbstractC2298vl) unsafe.getObject(sq0Var, j));
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 11:
/* 1029 */                      if ((i & i5) != 0) {
/* 1031 */                          int i10 = unsafe.getInt(sq0Var, j);
/* 1035 */                          iM5908h2 = C1808jw.m5908h(i6);
/* 1039 */                          iM5906f = C1808jw.m5909i(i10);
/* 136 */                           iM5904d = iM5906f + iM5908h2;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 12:
/* 1012 */                      if ((i & i5) != 0) {
/* 1014 */                          int i11 = unsafe.getInt(sq0Var, j);
/* 1018 */                          iM5908h2 = C1808jw.m5908h(i6);
/* 1022 */                          iM5906f = C1808jw.m5906f(i11);
/* 136 */                           iM5904d = iM5906f + iM5908h2;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1007 */                      if ((i5 & i) != 0) {
/* 156 */                           iM5908h7 = fm0.m3776b(i6, 4, iM5908h7);
                                }
                                break;
                            case 14:
/* 1001 */                      if ((i5 & i) != 0) {
/* 144 */                           iM5908h7 = fm0.m3776b(i6, 8, iM5908h7);
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 978 */                       if ((i & i5) != 0) {
/* 980 */                           int i12 = unsafe.getInt(sq0Var, j);
/* 984 */                           iM5908h2 = C1808jw.m5908h(i6);
/* 993 */                           iM5906f = C1808jw.m5909i((i12 >> 31) ^ (i12 << 1));
/* 136 */                           iM5904d = iM5906f + iM5908h2;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 16:
/* 957 */                       if ((i & i5) != 0) {
/* 959 */                           long j4 = unsafe.getLong(sq0Var, j);
/* 963 */                           iM5908h = C1808jw.m5908h(i6);
/* 971 */                           iM5910j = C1808jw.m5910j((j4 >> 63) ^ (j4 << 1));
/* 111 */                           iM5904d = iM5910j + iM5908h;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 17:
/* 938 */                       if ((i & i5) != 0) {
/* 950 */                           iM5904d = C1808jw.m5905e(i6, (AbstractC2313w) unsafe.getObject(sq0Var, j), m7842o(i4));
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 18:
/* 931 */                       iM5904d = l72.m6373f(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case 19:
/* 919 */                       iM5904d = l72.m6371d(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case 20:
/* 907 */                       iM5904d = l72.m6377j(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 895 */                       iM5904d = l72.m6387t(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 883 */                       iM5904d = l72.m6375h(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 871 */                       iM5904d = l72.m6373f(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case 24:
/* 859 */                       iM5904d = l72.m6371d(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 832 */                       List list = (List) unsafe.getObject(sq0Var, j);
/* 834 */                       Class cls2 = l72.f13131a;
/* 836 */                       int size2 = list.size();
/* 850 */                       iM5908h7 += size2 == 0 ? 0 : (C1808jw.m5908h(i6) + 1) * size2;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 822 */                       iM5904d = l72.m6384q(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 810 */                       iM5904d = l72.m6379l(i6, (List) unsafe.getObject(sq0Var, j), m7842o(i4));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 794 */                       iM5904d = l72.m6368a(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 782 */                       iM5904d = l72.m6385r(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 770 */                       iM5904d = l72.m6369b(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 758 */                       iM5904d = l72.m6371d(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case 32:
/* 746 */                       iM5904d = l72.m6373f(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 734 */                       iM5904d = l72.m6380m(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 722 */                       iM5904d = l72.m6382o(i6, (List) unsafe.getObject(sq0Var, j));
/* 86 */                        iM5908h7 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 704 */                       iM6374g = l72.m6374g((List) unsafe.getObject(sq0Var, j));
/* 708 */                       if (iM6374g > 0) {
/* 710 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 686 */                       iM6374g = l72.m6372e((List) unsafe.getObject(sq0Var, j));
/* 690 */                       if (iM6374g > 0) {
/* 692 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case 37:
/* 668 */                       iM6374g = l72.m6378k((List) unsafe.getObject(sq0Var, j));
/* 672 */                       if (iM6374g > 0) {
/* 674 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case 38:
/* 650 */                       iM6374g = l72.m6388u((List) unsafe.getObject(sq0Var, j));
/* 654 */                       if (iM6374g > 0) {
/* 656 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case 39:
/* 632 */                       iM6374g = l72.m6376i((List) unsafe.getObject(sq0Var, j));
/* 636 */                       if (iM6374g > 0) {
/* 638 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 614 */                       iM6374g = l72.m6374g((List) unsafe.getObject(sq0Var, j));
/* 618 */                       if (iM6374g > 0) {
/* 620 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 597 */                       iM6374g = l72.m6372e((List) unsafe.getObject(sq0Var, j));
/* 601 */                       if (iM6374g > 0) {
/* 603 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case 42:
/* 576 */                       List list2 = (List) unsafe.getObject(sq0Var, j);
/* 578 */                       Class cls3 = l72.f13131a;
/* 580 */                       iM6374g = list2.size();
/* 584 */                       if (iM6374g > 0) {
/* 586 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case 43:
/* 561 */                       iM6374g = l72.m6386s((List) unsafe.getObject(sq0Var, j));
/* 565 */                       if (iM6374g > 0) {
/* 567 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case 44:
/* 544 */                       iM6374g = l72.m6370c((List) unsafe.getObject(sq0Var, j));
/* 548 */                       if (iM6374g > 0) {
/* 550 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case 45:
/* 527 */                       iM6374g = l72.m6372e((List) unsafe.getObject(sq0Var, j));
/* 531 */                       if (iM6374g > 0) {
/* 533 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case 46:
/* 510 */                       iM6374g = l72.m6374g((List) unsafe.getObject(sq0Var, j));
/* 514 */                       if (iM6374g > 0) {
/* 516 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case 47:
/* 493 */                       iM6374g = l72.m6381n((List) unsafe.getObject(sq0Var, j));
/* 497 */                       if (iM6374g > 0) {
/* 499 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case 48:
/* 471 */                       iM6374g = l72.m6383p((List) unsafe.getObject(sq0Var, j));
/* 475 */                       if (iM6374g > 0) {
/* 477 */                           iM5908h6 = C1808jw.m5908h(i6);
/* 481 */                           iM5908h7 = fm0.m3777c(iM6374g, iM5908h6, iM6374g, iM5908h7);
                                }
                                break;
                            case 49:
/* 428 */                       List list3 = (List) unsafe.getObject(sq0Var, j);
/* 430 */                       h72 h72VarM7842o2 = m7842o(i4);
/* 434 */                       Class cls4 = l72.f13131a;
/* 436 */                       int size3 = list3.size();
/* 440 */                       if (size3 == 0) {
/* 442 */                           iM5905e = 0;
                                } else {
/* 445 */                           iM5905e = 0;
/* 446 */                           for (int i13 = 0; i13 < size3; i13++) {
/* 458 */                               iM5905e += C1808jw.m5905e(i6, (AbstractC2313w) list3.get(i13), h72VarM7842o2);
                                    }
                                }
/* 462 */                       iM5908h7 += iM5905e;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 406 */                       Object object3 = unsafe.getObject(sq0Var, j);
/* 410 */                       Object objM7841n = m7841n(i4);
/* 416 */                       this.f15563n.getClass();
/* 419 */                       hc1.m4163a(object3, objM7841n);
                                break;
                            case 51:
/* 402 */                       if (m7846t(i6, sq0Var, i4)) {
/* 144 */                           iM5908h7 = fm0.m3776b(i6, 8, iM5908h7);
                                }
                                break;
                            case 52:
/* 394 */                       if (m7846t(i6, sq0Var, i4)) {
/* 156 */                           iM5908h7 = fm0.m3776b(i6, 4, iM5908h7);
                                }
                                break;
                            case 53:
/* 374 */                       if (m7846t(i6, sq0Var, i4)) {
/* 376 */                           long jM7816E = m7816E(sq0Var, j);
/* 380 */                           iM5908h = C1808jw.m5908h(i6);
/* 384 */                           iM5910j = C1808jw.m5910j(jM7816E);
/* 111 */                           iM5904d = iM5910j + iM5908h;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 54:
/* 354 */                       if (m7846t(i6, sq0Var, i4)) {
/* 356 */                           long jM7816E2 = m7816E(sq0Var, j);
/* 360 */                           iM5908h = C1808jw.m5908h(i6);
/* 364 */                           iM5910j = C1808jw.m5910j(jM7816E2);
/* 111 */                           iM5904d = iM5910j + iM5908h;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 55:
/* 334 */                       if (m7846t(i6, sq0Var, i4)) {
/* 336 */                           int iM7815D = m7815D(sq0Var, j);
/* 340 */                           iM5908h2 = C1808jw.m5908h(i6);
/* 344 */                           iM5906f = C1808jw.m5906f(iM7815D);
/* 136 */                           iM5904d = iM5906f + iM5908h2;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 56:
/* 322 */                       if (m7846t(i6, sq0Var, i4)) {
/* 324 */                           iM5904d = C1808jw.m5904d(i6);
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 57:
/* 310 */                       if (m7846t(i6, sq0Var, i4)) {
/* 312 */                           iM5904d = C1808jw.m5903c(i6);
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 58:
/* 298 */                       if (m7846t(i6, sq0Var, i4)) {
/* 300 */                           iM5908h7 = fm0.m3776b(i6, 1, iM5908h7);
                                }
                                break;
                            case 59:
/* 254 */                       if (m7846t(i6, sq0Var, i4)) {
/* 256 */                           Object object4 = unsafe.getObject(sq0Var, j);
/* 262 */                           if (object4 instanceof AbstractC2298vl) {
/* 266 */                               iM5908h4 = C1808jw.m5908h(i6);
/* 270 */                               size = ((AbstractC2298vl) object4).size();
/* 274 */                               iM3777c = fm0.m3777c(size, size, iM5908h4, iM5908h7);
/* 278 */                               iM5908h7 = iM3777c;
                                    } else {
/* 283 */                               iM5908h3 = C1808jw.m5908h(i6);
/* 287 */                               iM5907g = C1808jw.m5907g((String) object4);
/* 292 */                               iM3777c = iM5907g + iM5908h3 + iM5908h7;
/* 278 */                               iM5908h7 = iM3777c;
                                    }
                                }
                                break;
                            case 60:
/* 222 */                       if (m7846t(i6, sq0Var, i4)) {
/* 224 */                           Object object5 = unsafe.getObject(sq0Var, j);
/* 228 */                           h72 h72VarM7842o3 = m7842o(i4);
/* 232 */                           Class cls5 = l72.f13131a;
/* 236 */                           iM5908h5 = C1808jw.m5908h(i6);
/* 240 */                           iMo8615b = ((AbstractC2313w) object5).mo8615b(h72VarM7842o3);
/* 244 */                           iM5908h7 = fm0.m3777c(iMo8615b, iMo8615b, iM5908h5, iM5908h7);
                                }
                                break;
                            case 61:
/* 204 */                       if (m7846t(i6, sq0Var, i4)) {
/* 212 */                           iM5904d = C1808jw.m5901a(i6, (AbstractC2298vl) unsafe.getObject(sq0Var, j));
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 62:
/* 185 */                       if (m7846t(i6, sq0Var, i4)) {
/* 187 */                           int iM7815D2 = m7815D(sq0Var, j);
/* 191 */                           iM5908h2 = C1808jw.m5908h(i6);
/* 195 */                           iM5906f = C1808jw.m5909i(iM7815D2);
/* 136 */                           iM5904d = iM5906f + iM5908h2;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 63:
/* 166 */                       if (m7846t(i6, sq0Var, i4)) {
/* 168 */                           int iM7815D3 = m7815D(sq0Var, j);
/* 172 */                           iM5908h2 = C1808jw.m5908h(i6);
/* 176 */                           iM5906f = C1808jw.m5906f(iM7815D3);
/* 136 */                           iM5904d = iM5906f + iM5908h2;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 64:
/* 154 */                       if (m7846t(i6, sq0Var, i4)) {
/* 156 */                           iM5908h7 = fm0.m3776b(i6, 4, iM5908h7);
                                }
                                break;
                            case 65:
/* 142 */                       if (m7846t(i6, sq0Var, i4)) {
/* 144 */                           iM5908h7 = fm0.m3776b(i6, 8, iM5908h7);
                                }
                                break;
                            case 66:
/* 117 */                       if (m7846t(i6, sq0Var, i4)) {
/* 119 */                           int iM7815D4 = m7815D(sq0Var, j);
/* 123 */                           iM5908h2 = C1808jw.m5908h(i6);
/* 132 */                           iM5906f = C1808jw.m5909i((iM7815D4 >> 31) ^ (iM7815D4 << 1));
/* 136 */                           iM5904d = iM5906f + iM5908h2;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 67:
/* 93 */                        if (m7846t(i6, sq0Var, i4)) {
/* 95 */                            long jM7816E3 = m7816E(sq0Var, j);
/* 99 */                            iM5908h = C1808jw.m5908h(i6);
/* 107 */                           iM5910j = C1808jw.m5910j((jM7816E3 >> 63) ^ (jM7816E3 << 1));
/* 111 */                           iM5904d = iM5910j + iM5908h;
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                            case 68:
/* 70 */                        if (m7846t(i6, sq0Var, i4)) {
/* 82 */                            iM5904d = C1808jw.m5905e(i6, (AbstractC2313w) unsafe.getObject(sq0Var, j), m7842o(i4));
/* 86 */                            iM5908h7 += iM5904d;
                                }
                                break;
                        }
/* 1209 */              i4 += 3;
/* 1211 */              i2 = 1048575;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:27:0x0085  */
                /* JADX WARN: Code duplicated, block: B:30:0x0091  */
                /* JADX WARN: Code duplicated, block: B:54:0x0128  */
                /* JADX INFO: renamed from: q */
                public final int m7844q(sq0 sq0Var) {
                    int iM5908h;
                    int iM5910j;
                    int iM5908h2;
                    int iM5906f;
                    int iM5904d;
                    int iM5908h3;
                    int iM5907g;
                    int iM5908h4;
                    int size;
                    int iM5908h5;
                    int iMo8615b;
                    int iM5908h6;
                    int iM5910j2;
                    int iM6374g;
                    int iM5908h7;
                    int iM5905e;
/* 1 */             Unsafe unsafe = f15549p;
/* 4 */             int i = 0;
/* 5 */             int iM5908h8 = 0;
                    while (true) {
/* 6 */                 int[] iArr = this.f15550a;
/* 9 */                 if (i >= iArr.length) {
/* 1248 */                  this.f15562m.getClass();
/* 1257 */                  return sq0Var.unknownFields.m8320b() + iM5908h8;
                        }
/* 11 */                int iM7836U = m7836U(i);
/* 15 */                int iM7818T = m7818T(iM7836U);
/* 19 */                int i2 = iArr[i];
/* 24 */                long j = iM7836U & 1048575;
/* 30 */                if (iM7818T >= gh0.f8610b.f8614a && iM7818T <= gh0.f8611c.f8614a) {
/* 40 */                    int i3 = iArr[i + 2];
                        }
                        switch (iM7818T) {
                            case 0:
/* 1238 */                      if (m7845r(i, sq0Var)) {
/* 134 */                           iM5908h8 = fm0.m3776b(i2, 8, iM5908h8);
                                }
                                break;
                            case 1:
/* 1230 */                      if (m7845r(i, sq0Var)) {
/* 146 */                           iM5908h8 = fm0.m3776b(i2, 4, iM5908h8);
                                }
                                break;
                            case 2:
/* 1208 */                      if (m7845r(i, sq0Var)) {
/* 1212 */                          long jM6312h = my2.f14064c.m6312h(sq0Var, j);
/* 1216 */                          iM5908h = C1808jw.m5908h(i2);
/* 1220 */                          iM5910j = C1808jw.m5910j(jM6312h);
/* 365 */                           iM5904d = iM5910j + iM5908h;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 3:
/* 1186 */                      if (m7845r(i, sq0Var)) {
/* 1190 */                          long jM6312h2 = my2.f14064c.m6312h(sq0Var, j);
/* 1194 */                          iM5908h = C1808jw.m5908h(i2);
/* 1198 */                          iM5910j = C1808jw.m5910j(jM6312h2);
/* 365 */                           iM5904d = iM5910j + iM5908h;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 4:
/* 1164 */                      if (m7845r(i, sq0Var)) {
/* 1168 */                          int iM6311g = my2.f14064c.m6311g(sq0Var, j);
/* 1172 */                          iM5908h2 = C1808jw.m5908h(i2);
/* 1176 */                          iM5906f = C1808jw.m5906f(iM6311g);
/* 126 */                           iM5904d = iM5906f + iM5908h2;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 5:
/* 1152 */                      if (m7845r(i, sq0Var)) {
/* 1154 */                          iM5904d = C1808jw.m5904d(i2);
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 6:
/* 1140 */                      if (m7845r(i, sq0Var)) {
/* 1142 */                          iM5904d = C1808jw.m5903c(i2);
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 7:
/* 1132 */                      if (m7845r(i, sq0Var)) {
/* 297 */                           iM5908h8 = fm0.m3776b(i2, 1, iM5908h8);
                                }
                                break;
                            case 8:
/* 1092 */                      if (m7845r(i, sq0Var)) {
/* 1096 */                          Object objM6313i = my2.f14064c.m6313i(sq0Var, j);
/* 1102 */                          if (objM6313i instanceof AbstractC2298vl) {
/* 1106 */                              iM5908h4 = C1808jw.m5908h(i2);
/* 1110 */                              size = ((AbstractC2298vl) objM6313i).size();
/* 270 */                               iM5908h8 = fm0.m3777c(size, size, iM5908h4, iM5908h8);
                                    } else {
/* 1118 */                              iM5908h3 = C1808jw.m5908h(i2);
/* 1122 */                              iM5907g = C1808jw.m5907g((String) objM6313i);
/* 287 */                               iM5908h8 = iM5907g + iM5908h3 + iM5908h8;
                                    }
                                }
                                break;
                            case 9:
/* 1062 */                      if (m7845r(i, sq0Var)) {
/* 1066 */                          Object objM6313i2 = my2.f14064c.m6313i(sq0Var, j);
/* 1070 */                          h72 h72VarM7842o = m7842o(i);
/* 1074 */                          Class cls = l72.f13131a;
/* 1078 */                          iM5908h5 = C1808jw.m5908h(i2);
/* 1082 */                          iMo8615b = ((AbstractC2313w) objM6313i2).mo8615b(h72VarM7842o);
/* 238 */                           iM5908h8 = fm0.m3777c(iMo8615b, iMo8615b, iM5908h5, iM5908h8);
                                }
                                break;
                            case 10:
/* 1042 */                      if (m7845r(i, sq0Var)) {
/* 1052 */                          iM5904d = C1808jw.m5901a(i2, (AbstractC2298vl) my2.f14064c.m6313i(sq0Var, j));
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 11:
/* 1020 */                      if (m7845r(i, sq0Var)) {
/* 1024 */                          int iM6311g2 = my2.f14064c.m6311g(sq0Var, j);
/* 1028 */                          iM5908h2 = C1808jw.m5908h(i2);
/* 1032 */                          iM5906f = C1808jw.m5909i(iM6311g2);
/* 126 */                           iM5904d = iM5906f + iM5908h2;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 12:
/* 998 */                       if (m7845r(i, sq0Var)) {
/* 1002 */                          int iM6311g3 = my2.f14064c.m6311g(sq0Var, j);
/* 1006 */                          iM5908h2 = C1808jw.m5908h(i2);
/* 1010 */                          iM5906f = C1808jw.m5906f(iM6311g3);
/* 126 */                           iM5904d = iM5906f + iM5908h2;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 990 */                       if (m7845r(i, sq0Var)) {
/* 146 */                           iM5908h8 = fm0.m3776b(i2, 4, iM5908h8);
                                }
                                break;
                            case 14:
/* 982 */                       if (m7845r(i, sq0Var)) {
/* 134 */                           iM5908h8 = fm0.m3776b(i2, 8, iM5908h8);
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 955 */                       if (m7845r(i, sq0Var)) {
/* 959 */                           int iM6311g4 = my2.f14064c.m6311g(sq0Var, j);
/* 963 */                           iM5908h2 = C1808jw.m5908h(i2);
/* 972 */                           iM5906f = C1808jw.m5909i((iM6311g4 >> 31) ^ (iM6311g4 << 1));
/* 126 */                           iM5904d = iM5906f + iM5908h2;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 16:
/* 928 */                       if (m7845r(i, sq0Var)) {
/* 932 */                           long jM6312h3 = my2.f14064c.m6312h(sq0Var, j);
/* 936 */                           iM5908h6 = C1808jw.m5908h(i2);
/* 945 */                           iM5910j2 = C1808jw.m5910j((jM6312h3 >> 63) ^ (jM6312h3 << 1));
/* 101 */                           iM5904d = iM5910j2 + iM5908h6;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 17:
/* 904 */                       if (m7845r(i, sq0Var)) {
/* 918 */                           iM5904d = C1808jw.m5905e(i2, (AbstractC2313w) my2.f14064c.m6313i(sq0Var, j), m7842o(i));
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 18:
/* 894 */                       iM5904d = l72.m6373f(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case 19:
/* 884 */                       iM5904d = l72.m6371d(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case 20:
/* 874 */                       iM5904d = l72.m6377j(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 864 */                       iM5904d = l72.m6387t(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 854 */                       iM5904d = l72.m6375h(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 844 */                       iM5904d = l72.m6373f(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case 24:
/* 834 */                       iM5904d = l72.m6371d(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 807 */                       List listM7822u = m7822u(sq0Var, j);
/* 811 */                       Class cls2 = l72.f13131a;
/* 813 */                       int size2 = listM7822u.size();
/* 827 */                       iM5908h8 += size2 == 0 ? 0 : (C1808jw.m5908h(i2) + 1) * size2;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 801 */                       iM5904d = l72.m6384q(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 791 */                       iM5904d = l72.m6379l(i2, m7822u(sq0Var, j), m7842o(i));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 777 */                       iM5904d = l72.m6368a(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 767 */                       iM5904d = l72.m6385r(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 757 */                       iM5904d = l72.m6369b(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 747 */                       iM5904d = l72.m6371d(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case 32:
/* 737 */                       iM5904d = l72.m6373f(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 727 */                       iM5904d = l72.m6380m(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 717 */                       iM5904d = l72.m6382o(i2, m7822u(sq0Var, j));
/* 75 */                        iM5908h8 += iM5904d;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 701 */                       iM6374g = l72.m6374g((List) unsafe.getObject(sq0Var, j));
/* 705 */                       if (iM6374g > 0) {
/* 707 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 683 */                       iM6374g = l72.m6372e((List) unsafe.getObject(sq0Var, j));
/* 687 */                       if (iM6374g > 0) {
/* 689 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case 37:
/* 665 */                       iM6374g = l72.m6378k((List) unsafe.getObject(sq0Var, j));
/* 669 */                       if (iM6374g > 0) {
/* 671 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case 38:
/* 647 */                       iM6374g = l72.m6388u((List) unsafe.getObject(sq0Var, j));
/* 651 */                       if (iM6374g > 0) {
/* 653 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case 39:
/* 629 */                       iM6374g = l72.m6376i((List) unsafe.getObject(sq0Var, j));
/* 633 */                       if (iM6374g > 0) {
/* 635 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 611 */                       iM6374g = l72.m6374g((List) unsafe.getObject(sq0Var, j));
/* 615 */                       if (iM6374g > 0) {
/* 617 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 594 */                       iM6374g = l72.m6372e((List) unsafe.getObject(sq0Var, j));
/* 598 */                       if (iM6374g > 0) {
/* 600 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case 42:
/* 573 */                       List list = (List) unsafe.getObject(sq0Var, j);
/* 575 */                       Class cls3 = l72.f13131a;
/* 577 */                       iM6374g = list.size();
/* 581 */                       if (iM6374g > 0) {
/* 583 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case 43:
/* 558 */                       iM6374g = l72.m6386s((List) unsafe.getObject(sq0Var, j));
/* 562 */                       if (iM6374g > 0) {
/* 564 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case 44:
/* 541 */                       iM6374g = l72.m6370c((List) unsafe.getObject(sq0Var, j));
/* 545 */                       if (iM6374g > 0) {
/* 547 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case 45:
/* 524 */                       iM6374g = l72.m6372e((List) unsafe.getObject(sq0Var, j));
/* 528 */                       if (iM6374g > 0) {
/* 530 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case 46:
/* 507 */                       iM6374g = l72.m6374g((List) unsafe.getObject(sq0Var, j));
/* 511 */                       if (iM6374g > 0) {
/* 513 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case 47:
/* 490 */                       iM6374g = l72.m6381n((List) unsafe.getObject(sq0Var, j));
/* 494 */                       if (iM6374g > 0) {
/* 496 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case 48:
/* 468 */                       iM6374g = l72.m6383p((List) unsafe.getObject(sq0Var, j));
/* 472 */                       if (iM6374g > 0) {
/* 474 */                           iM5908h7 = C1808jw.m5908h(i2);
/* 478 */                           iM5908h8 = fm0.m3777c(iM6374g, iM5908h7, iM6374g, iM5908h8);
                                }
                                break;
                            case 49:
/* 423 */                       List listM7822u2 = m7822u(sq0Var, j);
/* 427 */                       h72 h72VarM7842o2 = m7842o(i);
/* 431 */                       Class cls4 = l72.f13131a;
/* 433 */                       int size3 = listM7822u2.size();
/* 437 */                       if (size3 == 0) {
/* 439 */                           iM5905e = 0;
                                } else {
/* 442 */                           iM5905e = 0;
/* 443 */                           for (int i4 = 0; i4 < size3; i4++) {
/* 455 */                               iM5905e += C1808jw.m5905e(i2, (AbstractC2313w) listM7822u2.get(i4), h72VarM7842o2);
                                    }
                                }
/* 459 */                       iM5908h8 += iM5905e;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 405 */                       Object objM6313i3 = my2.f14064c.m6313i(sq0Var, j);
/* 409 */                       Object objM7841n = m7841n(i);
/* 415 */                       this.f15563n.getClass();
/* 418 */                       hc1.m4163a(objM6313i3, objM7841n);
                                break;
                            case 51:
/* 399 */                       if (m7846t(i2, sq0Var, i)) {
/* 134 */                           iM5908h8 = fm0.m3776b(i2, 8, iM5908h8);
                                }
                                break;
                            case 52:
/* 391 */                       if (m7846t(i2, sq0Var, i)) {
/* 146 */                           iM5908h8 = fm0.m3776b(i2, 4, iM5908h8);
                                }
                                break;
                            case 53:
/* 372 */                       if (m7846t(i2, sq0Var, i)) {
/* 374 */                           long jM7816E = m7816E(sq0Var, j);
/* 378 */                           iM5908h = C1808jw.m5908h(i2);
/* 382 */                           iM5910j = C1808jw.m5910j(jM7816E);
/* 365 */                           iM5904d = iM5910j + iM5908h;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 54:
/* 351 */                       if (m7846t(i2, sq0Var, i)) {
/* 353 */                           long jM7816E2 = m7816E(sq0Var, j);
/* 357 */                           iM5908h = C1808jw.m5908h(i2);
/* 361 */                           iM5910j = C1808jw.m5910j(jM7816E2);
/* 365 */                           iM5904d = iM5910j + iM5908h;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 55:
/* 331 */                       if (m7846t(i2, sq0Var, i)) {
/* 333 */                           int iM7815D = m7815D(sq0Var, j);
/* 337 */                           iM5908h2 = C1808jw.m5908h(i2);
/* 341 */                           iM5906f = C1808jw.m5906f(iM7815D);
/* 126 */                           iM5904d = iM5906f + iM5908h2;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 56:
/* 319 */                       if (m7846t(i2, sq0Var, i)) {
/* 321 */                           iM5904d = C1808jw.m5904d(i2);
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 57:
/* 307 */                       if (m7846t(i2, sq0Var, i)) {
/* 309 */                           iM5904d = C1808jw.m5903c(i2);
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 58:
/* 295 */                       if (m7846t(i2, sq0Var, i)) {
/* 297 */                           iM5908h8 = fm0.m3776b(i2, 1, iM5908h8);
                                }
                                break;
                            case 59:
/* 248 */                       if (m7846t(i2, sq0Var, i)) {
/* 252 */                           Object objM6313i4 = my2.f14064c.m6313i(sq0Var, j);
/* 258 */                           if (objM6313i4 instanceof AbstractC2298vl) {
/* 262 */                               iM5908h4 = C1808jw.m5908h(i2);
/* 266 */                               size = ((AbstractC2298vl) objM6313i4).size();
/* 270 */                               iM5908h8 = fm0.m3777c(size, size, iM5908h4, iM5908h8);
                                    } else {
/* 278 */                               iM5908h3 = C1808jw.m5908h(i2);
/* 282 */                               iM5907g = C1808jw.m5907g((String) objM6313i4);
/* 287 */                               iM5908h8 = iM5907g + iM5908h3 + iM5908h8;
                                    }
                                }
                                break;
                            case 60:
/* 214 */                       if (m7846t(i2, sq0Var, i)) {
/* 218 */                           Object objM6313i5 = my2.f14064c.m6313i(sq0Var, j);
/* 222 */                           h72 h72VarM7842o3 = m7842o(i);
/* 226 */                           Class cls5 = l72.f13131a;
/* 230 */                           iM5908h5 = C1808jw.m5908h(i2);
/* 234 */                           iMo8615b = ((AbstractC2313w) objM6313i5).mo8615b(h72VarM7842o3);
/* 238 */                           iM5908h8 = fm0.m3777c(iMo8615b, iMo8615b, iM5908h5, iM5908h8);
                                }
                                break;
                            case 61:
/* 194 */                       if (m7846t(i2, sq0Var, i)) {
/* 204 */                           iM5904d = C1808jw.m5901a(i2, (AbstractC2298vl) my2.f14064c.m6313i(sq0Var, j));
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 62:
/* 175 */                       if (m7846t(i2, sq0Var, i)) {
/* 177 */                           int iM7815D2 = m7815D(sq0Var, j);
/* 181 */                           iM5908h2 = C1808jw.m5908h(i2);
/* 185 */                           iM5906f = C1808jw.m5909i(iM7815D2);
/* 126 */                           iM5904d = iM5906f + iM5908h2;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 63:
/* 156 */                       if (m7846t(i2, sq0Var, i)) {
/* 158 */                           int iM7815D3 = m7815D(sq0Var, j);
/* 162 */                           iM5908h2 = C1808jw.m5908h(i2);
/* 166 */                           iM5906f = C1808jw.m5906f(iM7815D3);
/* 126 */                           iM5904d = iM5906f + iM5908h2;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 64:
/* 144 */                       if (m7846t(i2, sq0Var, i)) {
/* 146 */                           iM5908h8 = fm0.m3776b(i2, 4, iM5908h8);
                                }
                                break;
                            case 65:
/* 132 */                       if (m7846t(i2, sq0Var, i)) {
/* 134 */                           iM5908h8 = fm0.m3776b(i2, 8, iM5908h8);
                                }
                                break;
                            case 66:
/* 107 */                       if (m7846t(i2, sq0Var, i)) {
/* 109 */                           int iM7815D4 = m7815D(sq0Var, j);
/* 113 */                           iM5908h2 = C1808jw.m5908h(i2);
/* 122 */                           iM5906f = C1808jw.m5909i((iM7815D4 >> 31) ^ (iM7815D4 << 1));
/* 126 */                           iM5904d = iM5906f + iM5908h2;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 67:
/* 82 */                        if (m7846t(i2, sq0Var, i)) {
/* 84 */                            long jM7816E3 = m7816E(sq0Var, j);
/* 88 */                            iM5908h6 = C1808jw.m5908h(i2);
/* 97 */                            iM5910j2 = C1808jw.m5910j((jM7816E3 >> 63) ^ (jM7816E3 << 1));
/* 101 */                           iM5904d = iM5910j2 + iM5908h6;
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                            case 68:
/* 57 */                        if (m7846t(i2, sq0Var, i)) {
/* 71 */                            iM5904d = C1808jw.m5905e(i2, (AbstractC2313w) my2.f14064c.m6313i(sq0Var, j), m7842o(i));
/* 75 */                            iM5908h8 += iM5904d;
                                }
                                break;
                        }
/* 1242 */              i += 3;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
                /* JADX INFO: renamed from: r */
                public final boolean m7845r(int i, Object obj) {
/* 5 */             int i2 = this.f15550a[i + 2];
/* 10 */            long j = i2 & 1048575;
/* 20 */            if (j != 1048575) {
/* 271 */               if (((1 << (i2 >>> 20)) & my2.f14064c.m6311g(obj, j)) != 0) {
/* 19 */                    return true;
                        }
/* 18 */                return false;
                    }
/* 22 */            int iM7836U = m7836U(i);
/* 26 */            long j2 = iM7836U & 1048575;
                    switch (m7818T(iM7836U)) {
                        case 0:
/* 257 */                   if (Double.doubleToRawLongBits(my2.f14064c.mo4045e(obj, j2)) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 1:
/* 242 */                   if (Float.floatToRawIntBits(my2.f14064c.mo4046f(obj, j2)) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 2:
/* 229 */                   if (my2.f14064c.m6312h(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 3:
/* 218 */                   if (my2.f14064c.m6312h(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 4:
/* 207 */                   if (my2.f14064c.m6311g(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 5:
/* 198 */                   if (my2.f14064c.m6312h(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 6:
/* 187 */                   if (my2.f14064c.m6311g(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 7:
/* 176 */                   return my2.f14064c.mo4043c(obj, j2);
                        case 8:
/* 142 */                   Object objM6313i = my2.f14064c.m6313i(obj, j2);
/* 148 */                   if (objM6313i instanceof String) {
/* 156 */                       return !((String) objM6313i).isEmpty();
                            }
/* 160 */                   if (objM6313i instanceof AbstractC2298vl) {
/* 168 */                       return !AbstractC2298vl.f18234b.equals(objM6313i);
                            }
/* 170 */                   f42.m3649e();
/* 18 */                    return false;
                        case 9:
/* 136 */                   if (my2.f14064c.m6313i(obj, j2) != null) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 10:
/* 128 */                   return !AbstractC2298vl.f18234b.equals(my2.f14064c.m6313i(obj, j2));
                        case 11:
/* 112 */                   if (my2.f14064c.m6311g(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 12:
/* 102 */                   if (my2.f14064c.m6311g(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 92 */                    if (my2.f14064c.m6311g(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 14:
/* 82 */                    if (my2.f14064c.m6312h(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 70 */                    if (my2.f14064c.m6311g(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 16:
/* 60 */                    if (my2.f14064c.m6312h(obj, j2) != 0) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        case 17:
/* 48 */                    if (my2.f14064c.m6313i(obj, j2) != null) {
/* 19 */                        return true;
                            }
/* 18 */                    return false;
                        default:
/* 38 */                    f42.m3649e();
/* 18 */                    return false;
                    }
                }

                /* JADX INFO: renamed from: t */
                public final boolean m7846t(int i, Object obj, int i2) {
                    return my2.f14064c.m6311g(obj, (long) (this.f15550a[i2 + 2] & 1048575)) == i;
                }

                /* JADX INFO: renamed from: v */
                public final void m7847v(int i, Object obj, Object obj2) {
/* 8 */             long jM7836U = m7836U(i) & 1048575;
/* 12 */            Object objM6313i = my2.f14064c.m6313i(obj, jM7836U);
/* 16 */            hc1 hc1Var = this.f15563n;
/* 18 */            if (objM6313i != null) {
/* 20 */                hc1Var.getClass();
/* 28 */                if (!((fc1) objM6313i).f8123a) {
/* 32 */                    fc1 fc1VarM3713c = fc1.f8122b.m3713c();
/* 36 */                    hc1.m4164b(fc1VarM3713c, objM6313i);
/* 39 */                    my2.m6830p(obj, jM7836U, fc1VarM3713c);
/* 42 */                    objM6313i = fc1VarM3713c;
                        }
                    } else {
/* 44 */                hc1Var.getClass();
/* 49 */                objM6313i = fc1.f8122b.m3713c();
/* 53 */                my2.m6830p(obj, jM7836U, objM6313i);
                    }
/* 56 */            hc1Var.getClass();
/* 61 */            pm2.m7490m(obj2);
/* 65 */            throw null;
                }

                /* JADX INFO: renamed from: w */
                public final void m7848w(int i, Object obj, Object obj2) {
/* 5 */             if (m7845r(i, obj2)) {
/* 15 */                long jM7836U = m7836U(i) & 1048575;
/* 17 */                Unsafe unsafe = f15549p;
/* 19 */                Object object = unsafe.getObject(obj2, jM7836U);
/* 23 */                if (object == null) {
/* 88 */                    ds0.m3188d(this.f15550a[i], obj2);
/* 91 */                    return;
                        }
/* 25 */                h72 h72VarM7842o = m7842o(i);
/* 33 */                if (!m7845r(i, obj)) {
/* 39 */                    if (m7821s(object)) {
/* 45 */                        Object objNewInstance = h72VarM7842o.newInstance();
/* 49 */                        h72VarM7842o.mo4123a(objNewInstance, object);
/* 52 */                        unsafe.putObject(obj, jM7836U, objNewInstance);
                            } else {
/* 41 */                        unsafe.putObject(obj, jM7836U, object);
                            }
/* 55 */                    m7831O(i, obj);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, jM7836U);
/* 67 */                if (!m7821s(object2)) {
/* 69 */                    Object objNewInstance2 = h72VarM7842o.newInstance();
/* 73 */                    h72VarM7842o.mo4123a(objNewInstance2, object2);
/* 76 */                    unsafe.putObject(obj, jM7836U, objNewInstance2);
/* 79 */                    object2 = objNewInstance2;
                        }
/* 80 */                h72VarM7842o.mo4123a(object2, object);
                    }
                }

                /* JADX INFO: renamed from: x */
                public final void m7849x(int i, Object obj, Object obj2) {
/* 1 */             int[] iArr = this.f15550a;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (m7846t(i2, obj2, i)) {
/* 19 */                long jM7836U = m7836U(i) & 1048575;
/* 21 */                Unsafe unsafe = f15549p;
/* 23 */                Object object = unsafe.getObject(obj2, jM7836U);
/* 27 */                if (object == null) {
/* 90 */                    ds0.m3188d(iArr[i], obj2);
/* 93 */                    return;
                        }
/* 29 */                h72 h72VarM7842o = m7842o(i);
/* 37 */                if (!m7846t(i2, obj, i)) {
/* 43 */                    if (m7821s(object)) {
/* 49 */                        Object objNewInstance = h72VarM7842o.newInstance();
/* 53 */                        h72VarM7842o.mo4123a(objNewInstance, object);
/* 56 */                        unsafe.putObject(obj, jM7836U, objNewInstance);
                            } else {
/* 45 */                        unsafe.putObject(obj, jM7836U, object);
                            }
/* 59 */                    m7832P(i2, obj, i);
/* 62 */                    return;
                        }
/* 63 */                Object object2 = unsafe.getObject(obj, jM7836U);
/* 71 */                if (!m7821s(object2)) {
/* 73 */                    Object objNewInstance2 = h72VarM7842o.newInstance();
/* 77 */                    h72VarM7842o.mo4123a(objNewInstance2, object2);
/* 80 */                    unsafe.putObject(obj, jM7836U, objNewInstance2);
/* 83 */                    object2 = objNewInstance2;
                        }
/* 84 */                h72VarM7842o.mo4123a(object2, object);
                    }
                }

                /* JADX INFO: renamed from: y */
                public final Object m7850y(int i, Object obj) {
/* 1 */             h72 h72VarM7842o = m7842o(i);
/* 12 */            long jM7836U = m7836U(i) & 1048575;
/* 18 */            if (!m7845r(i, obj)) {
/* 20 */                return h72VarM7842o.newInstance();
                    }
/* 27 */            Object object = f15549p.getObject(obj, jM7836U);
/* 35 */            if (m7821s(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objNewInstance = h72VarM7842o.newInstance();
/* 42 */            if (object != null) {
/* 44 */                h72VarM7842o.mo4123a(objNewInstance, object);
                    }
/* 47 */            return objNewInstance;
                }

                /* JADX INFO: renamed from: z */
                public final Object m7851z(int i, Object obj, int i2) {
/* 1 */             h72 h72VarM7842o = m7842o(i2);
/* 9 */             if (!m7846t(i, obj, i2)) {
/* 11 */                return h72VarM7842o.newInstance();
                    }
/* 27 */            Object object = f15549p.getObject(obj, m7836U(i2) & 1048575);
/* 35 */            if (m7821s(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objNewInstance = h72VarM7842o.newInstance();
/* 42 */            if (object != null) {
/* 44 */                h72VarM7842o.mo4123a(objNewInstance, object);
                    }
/* 47 */            return objNewInstance;
                }
            }
