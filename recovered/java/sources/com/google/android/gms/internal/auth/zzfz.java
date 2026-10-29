            package com.google.android.gms.internal.auth;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1697u2;
            import java.io.IOException;
            import java.lang.reflect.Field;
            import java.util.Arrays;
            import java.util.List;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            import p000.AbstractC0886en;
            import p000.f42;
            import p000.pm2;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfz<T> implements zzgh<T> {
                private static final int[] zza = new int[0];
                private static final Unsafe zzb = zzhi.zzg();
                private final int[] zzc;
                private final Object[] zzd;
                private final int zze;
                private final int zzf;
                private final zzfw zzg;
                private final boolean zzh;
                private final int[] zzi;
                private final int zzj;
                private final int zzk;
                private final zzfk zzl;
                private final zzgy zzm;
                private final zzel zzn;
                private final zzgb zzo;
                private final zzfr zzp;

                private zzfz(int[] iArr, Object[] objArr, int i, int i2, zzfw zzfwVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
/* 4 */             this.zzc = iArr;
/* 6 */             this.zzd = objArr;
/* 8 */             this.zze = i;
/* 10 */            this.zzf = i2;
/* 12 */            this.zzh = z;
/* 14 */            this.zzi = iArr2;
/* 16 */            this.zzj = i3;
/* 18 */            this.zzk = i4;
/* 20 */            this.zzo = zzgbVar;
/* 22 */            this.zzl = zzfkVar;
/* 24 */            this.zzm = zzgyVar;
/* 26 */            this.zzn = zzelVar;
/* 28 */            this.zzg = zzfwVar;
/* 30 */            this.zzp = zzfrVar;
                }

                private static Field zzA(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (NoSuchFieldException unused) {
/* 6 */                 Field[] declaredFields = cls.getDeclaredFields();
/* 12 */                for (Field field : declaredFields) {
/* 24 */                    if (str.equals(field.getName())) {
/* 26 */                        return field;
                            }
                        }
/* 48 */                C1697u2.m5438n(AbstractC0886en.m3514r("Field ", str, " for ", cls.getName(), " not found. Known fields are "), Arrays.toString(declaredFields));
/* 51 */                return null;
                    }
                }

                private final void zzB(Object obj, Object obj2, int i) {
/* 8 */             long jZzv = zzv(i) & 1048575;
/* 14 */            if (zzG(obj2, i)) {
/* 17 */                Object objZzf = zzhi.zzf(obj, jZzv);
/* 21 */                Object objZzf2 = zzhi.zzf(obj2, jZzv);
/* 25 */                if (objZzf != null && objZzf2 != null) {
/* 34 */                    zzhi.zzp(obj, jZzv, zzez.zzg(objZzf, objZzf2));
/* 37 */                    zzD(obj, i);
                        } else if (objZzf2 != null) {
/* 43 */                    zzhi.zzp(obj, jZzv, objZzf2);
/* 46 */                    zzD(obj, i);
                        }
                    }
                }

                private final void zzC(Object obj, Object obj2, int i) {
/* 1 */             int iZzv = zzv(i);
/* 7 */             int i2 = this.zzc[i];
/* 12 */            long j = iZzv & 1048575;
/* 18 */            if (zzJ(obj2, i2, i)) {
/* 32 */                Object objZzf = zzJ(obj, i2, i) ? zzhi.zzf(obj, j) : null;
/* 33 */                Object objZzf2 = zzhi.zzf(obj2, j);
/* 37 */                if (objZzf != null && objZzf2 != null) {
/* 46 */                    zzhi.zzp(obj, j, zzez.zzg(objZzf, objZzf2));
/* 49 */                    zzE(obj, i2, i);
                        } else if (objZzf2 != null) {
/* 55 */                    zzhi.zzp(obj, j, objZzf2);
/* 58 */                    zzE(obj, i2, i);
                        }
                    }
                }

                private final void zzD(Object obj, int i) {
/* 1 */             int iZzs = zzs(i);
/* 8 */             long j = 1048575 & iZzs;
/* 15 */            if (j == 1048575) {
/* 17 */                return;
                    }
/* 28 */            zzhi.zzn(obj, j, (1 << (iZzs >>> 20)) | zzhi.zzc(obj, j));
                }

                private final void zzE(Object obj, int i, int i2) {
/* 10 */            zzhi.zzn(obj, zzs(i2) & 1048575, i);
                }

                private final boolean zzF(Object obj, Object obj2, int i) {
                    return zzG(obj, i) == zzG(obj2, i);
                }

                private final boolean zzG(Object obj, int i) {
/* 1 */             int iZzs = zzs(i);
/* 8 */             long j = iZzs & 1048575;
/* 18 */            if (j != 1048575) {
                        return (zzhi.zzc(obj, j) & (1 << (iZzs >>> 20))) != 0;
                    }
/* 20 */            int iZzv = zzv(i);
/* 24 */            long j2 = iZzv & 1048575;
                    switch (zzu(iZzv)) {
                        case 0:
                            return Double.doubleToRawLongBits(zzhi.zza(obj, j2)) != 0;
                        case 1:
                            return Float.floatToRawIntBits(zzhi.zzb(obj, j2)) != 0;
                        case 2:
                            return zzhi.zzd(obj, j2) != 0;
                        case 3:
                            return zzhi.zzd(obj, j2) != 0;
                        case 4:
                            return zzhi.zzc(obj, j2) != 0;
                        case 5:
                            return zzhi.zzd(obj, j2) != 0;
                        case 6:
                            return zzhi.zzc(obj, j2) != 0;
                        case 7:
/* 158 */                   return zzhi.zzt(obj, j2);
                        case 8:
/* 122 */                   Object objZzf = zzhi.zzf(obj, j2);
/* 128 */                   if (objZzf instanceof String) {
                                return !((String) objZzf).isEmpty();
                            }
/* 142 */                   if (objZzf instanceof zzee) {
                                return !zzee.zzb.equals(objZzf);
                            }
/* 154 */                   f42.m3649e();
/* 16 */                    return false;
                        case 9:
                            return zzhi.zzf(obj, j2) != null;
                        case 10:
                            return !zzee.zzb.equals(zzhi.zzf(obj, j2));
                        case 11:
                            return zzhi.zzc(obj, j2) != 0;
                        case 12:
                            return zzhi.zzc(obj, j2) != 0;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                            return zzhi.zzc(obj, j2) != 0;
                        case 14:
                            return zzhi.zzd(obj, j2) != 0;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                            return zzhi.zzc(obj, j2) != 0;
                        case 16:
                            return zzhi.zzd(obj, j2) != 0;
                        case 17:
                            return zzhi.zzf(obj, j2) != null;
                        default:
/* 36 */                    f42.m3649e();
/* 16 */                    return false;
                    }
                }

                private final boolean zzH(Object obj, int i, int i2, int i3, int i4) {
/* 4 */             if (i2 == 1048575) {
/* 6 */                 return zzG(obj, i);
                    }
                    return (i3 & i4) != 0;
                }

                private static boolean zzI(Object obj, int i, zzgh zzghVar) {
/* 10 */            return zzghVar.zzi(zzhi.zzf(obj, i & 1048575));
                }

                private final boolean zzJ(Object obj, int i, int i2) {
                    return zzhi.zzc(obj, (long) (zzs(i2) & 1048575)) == i;
                }

                public static zzgz zzc(Object obj) {
/* 1 */             zzeu zzeuVar = (zzeu) obj;
/* 3 */             zzgz zzgzVar = zzeuVar.zzc;
/* 9 */             if (zzgzVar != zzgz.zza()) {
/* 17 */                return zzgzVar;
                    }
/* 11 */            zzgz zzgzVarZzc = zzgz.zzc();
/* 15 */            zzeuVar.zzc = zzgzVarZzc;
/* 17 */            return zzgzVarZzc;
                }

                public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
/* 3 */             if (zzftVar instanceof zzgg) {
/* 7 */                 return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
                    }
/* 15 */            throw null;
                }

                /* JADX WARN: Code duplicated, block: B:123:0x0260  */
                /* JADX WARN: Code duplicated, block: B:124:0x0263  */
                /* JADX WARN: Code duplicated, block: B:127:0x027c  */
                /* JADX WARN: Code duplicated, block: B:128:0x027f  */
                /* JADX WARN: Code duplicated, block: B:162:0x033d  */
                /* JADX WARN: Code duplicated, block: B:177:0x038e  */
                /* JADX WARN: Code duplicated, block: B:180:0x0399  */
                public static zzfz zzk(zzgg zzggVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
                    int i;
                    int iCharAt;
                    int iCharAt2;
                    int iCharAt3;
                    int iCharAt4;
                    int i2;
                    int i3;
                    int[] iArr;
                    int i4;
                    int i5;
                    char cCharAt;
                    int i6;
                    char cCharAt2;
                    int i7;
                    char cCharAt3;
                    int i8;
                    char cCharAt4;
                    int i9;
                    char cCharAt5;
                    int i10;
                    char cCharAt6;
                    int i11;
                    char cCharAt7;
                    int i12;
                    char cCharAt8;
                    int i13;
                    int i14;
                    int i15;
                    int iObjectFieldOffset;
                    int iObjectFieldOffset2;
                    int i16;
                    int i17;
                    int i18;
                    int i19;
                    Field fieldZzA;
                    int i20;
                    char cCharAt9;
                    int i21;
                    int i22;
                    int i23;
                    int i24;
                    Object obj;
                    Field fieldZzA2;
                    int i25;
                    Object obj2;
                    Field fieldZzA3;
                    int i26;
                    char cCharAt10;
                    int i27;
                    int i28;
                    char cCharAt11;
                    int i29;
                    char cCharAt12;
                    int i30;
                    char cCharAt13;
/* 1 */             boolean z = zzggVar.zzc() == 2;
/* 2 */             String strZzd = zzggVar.zzd();
                    int length = strZzd.length();
                    int i31 = 55296;
/* 3 */             if (strZzd.charAt(0) >= 55296) {
                        int i32 = 1;
                        while (true) {
                            i = i32 + 1;
/* 4 */                     if (strZzd.charAt(i32) < 55296) {
                                break;
                            }
                            i32 = i;
                        }
                    } else {
                        i = 1;
                    }
                    int i33 = i + 1;
/* 5 */             int iCharAt5 = strZzd.charAt(i);
                    if (iCharAt5 >= 55296) {
                        int i34 = iCharAt5 & 8191;
                        int i35 = 13;
                        while (true) {
                            i30 = i33 + 1;
/* 6 */                     cCharAt13 = strZzd.charAt(i33);
                            if (cCharAt13 < 55296) {
                                break;
                            }
                            i34 |= (cCharAt13 & 8191) << i35;
                            i35 += 13;
                            i33 = i30;
                        }
                        iCharAt5 = i34 | (cCharAt13 << i35);
                        i33 = i30;
                    }
                    if (iCharAt5 == 0) {
                        iCharAt = 0;
                        iCharAt2 = 0;
                        iCharAt3 = 0;
                        i3 = 0;
                        iCharAt4 = 0;
                        i2 = 0;
                        iArr = zza;
                        i4 = 0;
                    } else {
                        int i36 = i33 + 1;
/* 7 */                 int iCharAt6 = strZzd.charAt(i33);
                        if (iCharAt6 >= 55296) {
                            int i37 = iCharAt6 & 8191;
                            int i38 = 13;
                            while (true) {
                                i12 = i36 + 1;
/* 8 */                         cCharAt8 = strZzd.charAt(i36);
                                if (cCharAt8 < 55296) {
                                    break;
                                }
                                i37 |= (cCharAt8 & 8191) << i38;
                                i38 += 13;
                                i36 = i12;
                            }
                            iCharAt6 = i37 | (cCharAt8 << i38);
                            i36 = i12;
                        }
                        int i39 = i36 + 1;
/* 9 */                 int iCharAt7 = strZzd.charAt(i36);
                        if (iCharAt7 >= 55296) {
                            int i40 = iCharAt7 & 8191;
                            int i41 = 13;
                            while (true) {
                                i11 = i39 + 1;
/* 10 */                        cCharAt7 = strZzd.charAt(i39);
                                if (cCharAt7 < 55296) {
                                    break;
                                }
                                i40 |= (cCharAt7 & 8191) << i41;
                                i41 += 13;
                                i39 = i11;
                            }
                            iCharAt7 = i40 | (cCharAt7 << i41);
                            i39 = i11;
                        }
                        int i42 = i39 + 1;
/* 11 */                iCharAt = strZzd.charAt(i39);
                        if (iCharAt >= 55296) {
                            int i43 = iCharAt & 8191;
                            int i44 = 13;
                            while (true) {
                                i10 = i42 + 1;
/* 12 */                        cCharAt6 = strZzd.charAt(i42);
                                if (cCharAt6 < 55296) {
                                    break;
                                }
                                i43 |= (cCharAt6 & 8191) << i44;
                                i44 += 13;
                                i42 = i10;
                            }
                            iCharAt = i43 | (cCharAt6 << i44);
                            i42 = i10;
                        }
                        int i45 = i42 + 1;
/* 13 */                iCharAt2 = strZzd.charAt(i42);
                        if (iCharAt2 >= 55296) {
                            int i46 = iCharAt2 & 8191;
                            int i47 = 13;
                            while (true) {
                                i9 = i45 + 1;
/* 14 */                        cCharAt5 = strZzd.charAt(i45);
                                if (cCharAt5 < 55296) {
                                    break;
                                }
                                i46 |= (cCharAt5 & 8191) << i47;
                                i47 += 13;
                                i45 = i9;
                            }
                            iCharAt2 = i46 | (cCharAt5 << i47);
                            i45 = i9;
                        }
                        int i48 = i45 + 1;
/* 15 */                iCharAt3 = strZzd.charAt(i45);
                        if (iCharAt3 >= 55296) {
                            int i49 = iCharAt3 & 8191;
                            int i50 = 13;
                            while (true) {
                                i8 = i48 + 1;
/* 16 */                        cCharAt4 = strZzd.charAt(i48);
                                if (cCharAt4 < 55296) {
                                    break;
                                }
                                i49 |= (cCharAt4 & 8191) << i50;
                                i50 += 13;
                                i48 = i8;
                            }
                            iCharAt3 = i49 | (cCharAt4 << i50);
                            i48 = i8;
                        }
                        int i51 = i48 + 1;
/* 17 */                int iCharAt8 = strZzd.charAt(i48);
                        if (iCharAt8 >= 55296) {
                            int i52 = iCharAt8 & 8191;
                            int i53 = 13;
                            while (true) {
                                i7 = i51 + 1;
/* 18 */                        cCharAt3 = strZzd.charAt(i51);
                                if (cCharAt3 < 55296) {
                                    break;
                                }
                                i52 |= (cCharAt3 & 8191) << i53;
                                i53 += 13;
                                i51 = i7;
                            }
                            iCharAt8 = i52 | (cCharAt3 << i53);
                            i51 = i7;
                        }
                        int i54 = i51 + 1;
/* 19 */                int iCharAt9 = strZzd.charAt(i51);
                        if (iCharAt9 >= 55296) {
                            int i55 = iCharAt9 & 8191;
                            int i56 = 13;
                            while (true) {
                                i6 = i54 + 1;
/* 20 */                        cCharAt2 = strZzd.charAt(i54);
                                if (cCharAt2 < 55296) {
                                    break;
                                }
                                i55 |= (cCharAt2 & 8191) << i56;
                                i56 += 13;
                                i54 = i6;
                            }
                            iCharAt9 = i55 | (cCharAt2 << i56);
                            i54 = i6;
                        }
                        int i57 = i54 + 1;
/* 21 */                iCharAt4 = strZzd.charAt(i54);
                        if (iCharAt4 >= 55296) {
                            int i58 = iCharAt4 & 8191;
                            int i59 = 13;
                            while (true) {
                                i5 = i57 + 1;
/* 22 */                        cCharAt = strZzd.charAt(i57);
                                if (cCharAt < 55296) {
                                    break;
                                }
                                i58 |= (cCharAt & 8191) << i59;
                                i59 += 13;
                                i57 = i5;
                            }
                            iCharAt4 = i58 | (cCharAt << i59);
                            i57 = i5;
                        }
/* 23 */                int[] iArr2 = new int[iCharAt4 + iCharAt8 + iCharAt9];
                        i2 = iCharAt6 + iCharAt6 + iCharAt7;
                        i3 = iCharAt8;
                        iArr = iArr2;
                        i4 = iCharAt6;
                        i33 = i57;
                    }
/* 24 */            Unsafe unsafe = zzb;
/* 25 */            Object[] objArrZze = zzggVar.zze();
/* 26 */            Class<?> cls = zzggVar.zza().getClass();
/* 27 */            int[] iArr3 = new int[iCharAt3 * 3];
/* 28 */            Object[] objArr = new Object[iCharAt3 + iCharAt3];
                    int i60 = i3 + iCharAt4;
                    int i61 = i60;
                    int i62 = iCharAt4;
                    int i63 = 0;
                    int i64 = 0;
                    while (i33 < length) {
                        int i65 = i33 + 1;
/* 29 */                int iCharAt10 = strZzd.charAt(i33);
                        if (iCharAt10 >= i31) {
                            int i66 = iCharAt10 & 8191;
                            int i67 = i65;
                            int i68 = 13;
                            while (true) {
                                i29 = i67 + 1;
/* 30 */                        cCharAt12 = strZzd.charAt(i67);
                                i13 = length;
                                if (cCharAt12 < 55296) {
                                    break;
                                }
                                i66 |= (cCharAt12 & 8191) << i68;
                                i68 += 13;
                                i67 = i29;
                                length = i13;
                            }
                            iCharAt10 = i66 | (cCharAt12 << i68);
                            i14 = i29;
                        } else {
                            i13 = length;
                            i14 = i65;
                        }
                        int i69 = i14 + 1;
/* 31 */                int iCharAt11 = strZzd.charAt(i14);
                        int i70 = iCharAt10;
                        char c = 55296;
                        if (iCharAt11 >= 55296) {
                            int i71 = iCharAt11 & 8191;
                            int i72 = 13;
                            while (true) {
                                i28 = i69 + 1;
/* 32 */                        cCharAt11 = strZzd.charAt(i69);
                                if (cCharAt11 < c) {
                                    break;
                                }
                                i71 |= (cCharAt11 & 8191) << i72;
                                i72 += 13;
                                i69 = i28;
                                c = 55296;
                            }
                            iCharAt11 = i71 | (cCharAt11 << i72);
                            i69 = i28;
                        }
                        int i73 = iCharAt11 & 255;
                        int i74 = i4;
                        if ((iCharAt11 & Segment.SHARE_MINIMUM) != 0) {
/* 33 */                    iArr[i64] = i63;
                            i64++;
                        }
                        if (i73 >= 51) {
                            int i75 = i69 + 1;
/* 34 */                    int iCharAt12 = strZzd.charAt(i69);
                            if (iCharAt12 >= 55296) {
                                int i76 = iCharAt12 & 8191;
                                int i77 = i75;
                                int i78 = 13;
                                while (true) {
                                    i26 = i77 + 1;
/* 35 */                            cCharAt10 = strZzd.charAt(i77);
                                    i27 = i76;
                                    if (cCharAt10 < 55296) {
                                        break;
                                    }
                                    i76 = i27 | ((cCharAt10 & 8191) << i78);
                                    i78 += 13;
                                    i77 = i26;
                                }
                                iCharAt12 = i27 | (cCharAt10 << i78);
                                i22 = i26;
                            } else {
                                i22 = i75;
                            }
                            int i79 = iCharAt12;
                            int i80 = i73 - 51;
                            int i81 = i22;
                            if (i80 == 9 || i80 == 17) {
/* 38 */                        int i82 = i63 / 3;
                                i23 = i2 + 1;
/* 39 */                        objArr[i82 + i82 + 1] = objArrZze[i2];
                            } else {
                                if (i80 == 12 && !z) {
/* 36 */                            int i83 = i63 / 3;
                                    i23 = i2 + 1;
/* 37 */                            objArr[i83 + i83 + 1] = objArrZze[i2];
                                }
                                i24 = i79 + i79;
/* 40 */                        obj = objArrZze[i24];
/* 41 */                        if (obj instanceof Field) {
/* 42 */                            fieldZzA2 = (Field) obj;
                                } else {
/* 43 */                            fieldZzA2 = zzA(cls, (String) obj);
/* 44 */                            objArrZze[i24] = fieldZzA2;
                                }
/* 45 */                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzA2);
                                i25 = i24 + 1;
/* 46 */                        obj2 = objArrZze[i25];
/* 47 */                        if (obj2 instanceof Field) {
/* 48 */                            fieldZzA3 = (Field) obj2;
                                } else {
/* 49 */                            fieldZzA3 = zzA(cls, (String) obj2);
/* 50 */                            objArrZze[i25] = fieldZzA3;
                                }
                                i63 = i63;
/* 51 */                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                                i15 = i2;
                                i19 = iObjectFieldOffset3;
                                iCharAt = iCharAt;
                                i16 = i81;
                                strZzd = strZzd;
                                cls = cls;
                                i18 = 0;
                            }
                            i2 = i23;
                            i24 = i79 + i79;
/* 40 */                    obj = objArrZze[i24];
/* 41 */                    if (obj instanceof Field) {
/* 42 */                        fieldZzA2 = (Field) obj;
                            } else {
/* 43 */                        fieldZzA2 = zzA(cls, (String) obj);
/* 44 */                        objArrZze[i24] = fieldZzA2;
                            }
/* 45 */                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzA2);
                            i25 = i24 + 1;
/* 46 */                    obj2 = objArrZze[i25];
/* 47 */                    if (obj2 instanceof Field) {
/* 48 */                        fieldZzA3 = (Field) obj2;
                            } else {
/* 49 */                        fieldZzA3 = zzA(cls, (String) obj2);
/* 50 */                        objArrZze[i25] = fieldZzA3;
                            }
                            i63 = i63;
/* 51 */                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                            i15 = i2;
                            i19 = iObjectFieldOffset4;
                            iCharAt = iCharAt;
                            i16 = i81;
                            strZzd = strZzd;
                            cls = cls;
                            i18 = 0;
                        } else {
                            int i84 = i2 + 1;
/* 52 */                    Field fieldZzA4 = zzA(cls, (String) objArrZze[i2]);
                            if (i73 == 9 || i73 == 17) {
/* 61 */                        objArr[pm2.m7483f(i63, 3, 1)] = fieldZzA4.getType();
                            } else {
                                if (i73 == 27 || i73 == 49) {
/* 58 */                            int i85 = i63 / 3;
                                    i21 = i2 + 2;
/* 59 */                            objArr[i85 + i85 + 1] = objArrZze[i84];
                                } else if (i73 != 12 && i73 != 30 && i73 != 44) {
                                    if (i73 == 50) {
                                        int i86 = i62 + 1;
/* 53 */                                iArr[i62] = i63;
                                        int i87 = i63 / 3;
                                        int i88 = i87 + i87;
                                        i15 = i2 + 2;
/* 54 */                                objArr[i88] = objArrZze[i84];
                                        if ((iCharAt11 & 2048) != 0) {
/* 55 */                                    objArr[i88 + 1] = objArrZze[i15];
                                            i15 = i2 + 3;
                                        }
                                        iCharAt = iCharAt;
                                        i62 = i86;
                                    }
/* 62 */                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                                    iObjectFieldOffset2 = 1048575;
                                    if ((iCharAt11 & 4096) == 4096 || i73 > 17) {
                                        i16 = i69;
                                        i17 = 0;
                                    } else {
                                        i16 = i69 + 1;
/* 63 */                                int iCharAt13 = strZzd.charAt(i69);
                                        if (iCharAt13 >= 55296) {
                                            int i89 = iCharAt13 & 8191;
                                            int i90 = 13;
                                            while (true) {
                                                i20 = i16 + 1;
/* 64 */                                        cCharAt9 = strZzd.charAt(i16);
                                                if (cCharAt9 < 55296) {
                                                    break;
                                                }
                                                i89 |= (cCharAt9 & 8191) << i90;
                                                i90 += 13;
                                                i16 = i20;
                                            }
                                            iCharAt13 = i89 | (cCharAt9 << i90);
                                            i16 = i20;
                                        }
                                        int i91 = (iCharAt13 / 32) + i74 + i74;
/* 65 */                                Object obj3 = objArrZze[i91];
/* 66 */                                if (obj3 instanceof Field) {
/* 67 */                                    fieldZzA = (Field) obj3;
                                        } else {
/* 68 */                                    fieldZzA = zzA(cls, (String) obj3);
/* 69 */                                    objArrZze[i91] = fieldZzA;
                                        }
                                        i17 = iCharAt13 % 32;
/* 70 */                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA);
                                    }
                                    if (i73 >= 18 && i73 <= 49) {
/* 71 */                                iArr[i61] = iObjectFieldOffset;
                                        i61++;
                                    }
                                    i18 = i17;
                                    i19 = iObjectFieldOffset;
                                } else if (!z) {
/* 56 */                            int i92 = i63 / 3;
                                    i21 = i2 + 2;
/* 57 */                            objArr[i92 + i92 + 1] = objArrZze[i84];
                                }
                                i15 = i21;
                                iCharAt = iCharAt;
/* 62 */                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                                iObjectFieldOffset2 = 1048575;
                                if ((iCharAt11 & 4096) == 4096) {
                                    i16 = i69;
                                    i17 = 0;
                                } else {
                                    i16 = i69;
                                    i17 = 0;
                                }
                                if (i73 >= 18) {
/* 71 */                            iArr[i61] = iObjectFieldOffset;
                                    i61++;
                                }
                                i18 = i17;
                                i19 = iObjectFieldOffset;
                            }
                            i15 = i84;
/* 62 */                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt11 & 4096) == 4096) {
                                i16 = i69;
                                i17 = 0;
                            } else {
                                i16 = i69;
                                i17 = 0;
                            }
                            if (i73 >= 18) {
/* 71 */                        iArr[i61] = iObjectFieldOffset;
                                i61++;
                            }
                            i18 = i17;
                            i19 = iObjectFieldOffset;
                        }
                        int i93 = i63 + 1;
/* 72 */                iArr3[i63] = i70;
                        int i94 = i63 + 2;
/* 73 */                iArr3[i93] = ((iCharAt11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | ((iCharAt11 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? 536870912 : 0) | (i73 << 20) | i19;
                        i63 += 3;
/* 74 */                iArr3[i94] = (i18 << 20) | iObjectFieldOffset2;
                        cls = cls;
                        i33 = i16;
                        iCharAt = iCharAt;
                        i4 = i74;
                        length = i13;
                        iArr3 = iArr3;
                        i2 = i15;
                        strZzd = strZzd;
                        i31 = 55296;
                    }
/* 75 */            return new zzfz(iArr3, objArr, iCharAt, iCharAt2, zzggVar.zza(), z, false, iArr, iCharAt4, i60, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar, null);
                }

                private static int zzl(Object obj, long j) {
/* 7 */             return ((Integer) zzhi.zzf(obj, j)).intValue();
                }

                private final int zzm(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzds zzdsVar) throws IOException {
/* 1 */             Unsafe unsafe = zzb;
/* 3 */             Object objZzz = zzz(i3);
/* 7 */             Object object = unsafe.getObject(obj, j);
/* 18 */            if (!((zzfq) object).zze()) {
/* 25 */                zzfq zzfqVarZzb = zzfq.zza().zzb();
/* 29 */                zzfr.zza(zzfqVarZzb, object);
/* 32 */                unsafe.putObject(obj, j, zzfqVarZzb);
                    }
/* 38 */            throw null;
                }

                private final int zzn(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzds zzdsVar) throws IOException {
                    Object object;
/* 13 */            Unsafe unsafe = zzb;
/* 24 */            long j2 = this.zzc[i8 + 2] & 1048575;
                    switch (i7) {
                        case 51:
/* 504 */                   if (i5 != 1) {
/* 502 */                       return i;
                            }
/* 519 */                   unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i))));
/* 522 */                   unsafe.putInt(obj, j2, i4);
/* 525 */                   return i + 8;
                        case 52:
/* 476 */                   if (i5 != 5) {
/* 474 */                       return i;
                            }
/* 491 */                   unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i))));
/* 494 */                   unsafe.putInt(obj, j2, i4);
/* 497 */                   return i + 4;
                        case 53:
                        case 54:
/* 452 */                   if (i5 != 0) {
/* 448 */                       return i;
                            }
/* 455 */                   int iZzm = zzdt.zzm(bArr, i, zzdsVar);
/* 465 */                   unsafe.putObject(obj, j, Long.valueOf(zzdsVar.zzb));
/* 468 */                   unsafe.putInt(obj, j2, i4);
/* 471 */                   return iZzm;
                        case 55:
                        case 62:
/* 426 */                   if (i5 != 0) {
/* 422 */                       return i;
                            }
/* 429 */                   int iZzj = zzdt.zzj(bArr, i, zzdsVar);
/* 439 */                   unsafe.putObject(obj, j, Integer.valueOf(zzdsVar.zza));
/* 442 */                   unsafe.putInt(obj, j2, i4);
/* 445 */                   return iZzj;
                        case 56:
                        case 65:
/* 400 */                   if (i5 != 1) {
/* 398 */                       return i;
                            }
/* 411 */                   unsafe.putObject(obj, j, Long.valueOf(zzdt.zzn(bArr, i)));
/* 414 */                   unsafe.putInt(obj, j2, i4);
/* 417 */                   return i + 8;
                        case 57:
                        case 64:
/* 375 */                   if (i5 != 5) {
/* 373 */                       return i;
                            }
/* 387 */                   unsafe.putObject(obj, j, Integer.valueOf(zzdt.zzb(bArr, i)));
/* 390 */                   unsafe.putInt(obj, j2, i4);
/* 393 */                   return i + 4;
                        case 58:
/* 344 */                   if (i5 != 0) {
/* 340 */                       return i;
                            }
/* 346 */                   int iZzm2 = zzdt.zzm(bArr, i, zzdsVar);
/* 364 */                   unsafe.putObject(obj, j, Boolean.valueOf(zzdsVar.zzb != 0));
/* 367 */                   unsafe.putInt(obj, j2, i4);
/* 370 */                   return iZzm2;
                        case 59:
/* 287 */                   if (i5 != 2) {
/* 283 */                       return i;
                            }
/* 289 */                   int iZzj2 = zzdt.zzj(bArr, i, zzdsVar);
/* 293 */                   int i9 = zzdsVar.zza;
/* 295 */                   if (i9 == 0) {
/* 299 */                       unsafe.putObject(obj, j, HttpUrl.FRAGMENT_ENCODE_SET);
                            } else {
/* 307 */                       if ((i6 & 536870912) != 0 && !zzhm.zzd(bArr, iZzj2, iZzj2 + i9)) {
/* 322 */                           throw zzfa.zzb();
                                }
/* 330 */                       unsafe.putObject(obj, j, new String(bArr, iZzj2, i9, zzez.zzb));
/* 333 */                       iZzj2 += i9;
                            }
/* 334 */                   unsafe.putInt(obj, j2, i4);
/* 337 */                   return iZzj2;
                        case 60:
/* 238 */                   if (i5 != 2) {
/* 234 */                       return i;
                            }
/* 246 */                   int iZzd = zzdt.zzd(zzy(i8), bArr, i, i2, zzdsVar);
/* 256 */                   object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
/* 260 */                   if (object == null) {
/* 264 */                       unsafe.putObject(obj, j, zzdsVar.zzc);
                            } else {
/* 274 */                       unsafe.putObject(obj, j, zzez.zzg(object, zzdsVar.zzc));
                            }
/* 277 */                   unsafe.putInt(obj, j2, i4);
/* 280 */                   return iZzd;
                        case 61:
/* 215 */                   if (i5 != 2) {
/* 211 */                       return i;
                            }
/* 219 */                   int iZza = zzdt.zza(bArr, i, zzdsVar);
/* 225 */                   unsafe.putObject(obj, j, zzdsVar.zzc);
/* 228 */                   unsafe.putInt(obj, j2, i4);
/* 231 */                   return iZza;
                        case 63:
/* 164 */                   if (i5 != 0) {
/* 158 */                       return i;
                            }
/* 166 */                   int iZzj3 = zzdt.zzj(bArr, i, zzdsVar);
/* 170 */                   int i10 = zzdsVar.zza;
/* 172 */                   zzex zzexVarZzx = zzx(i8);
/* 176 */                   if (zzexVarZzx != null && !zzexVarZzx.zza()) {
/* 194 */                       zzc(obj).zzf(i3, Long.valueOf(i10));
/* 197 */                       return iZzj3;
                            }
/* 202 */                   unsafe.putObject(obj, j, Integer.valueOf(i10));
/* 205 */                   unsafe.putInt(obj, j2, i4);
/* 208 */                   return iZzj3;
                        case 66:
/* 131 */                   if (i5 != 0) {
/* 127 */                       return i;
                            }
/* 135 */                   int iZzj4 = zzdt.zzj(bArr, i, zzdsVar);
/* 149 */                   unsafe.putObject(obj, j, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
/* 152 */                   unsafe.putInt(obj, j2, i4);
/* 155 */                   return iZzj4;
                        case 67:
/* 100 */                   if (i5 != 0) {
/* 96 */                        return i;
                            }
/* 104 */                   int iZzm3 = zzdt.zzm(bArr, i, zzdsVar);
/* 118 */                   unsafe.putObject(obj, j, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
/* 121 */                   unsafe.putInt(obj, j2, i4);
/* 124 */                   return iZzm3;
                        case 68:
/* 38 */                    if (i5 == 3) {
/* 58 */                        int iZzc = zzdt.zzc(zzy(i8), bArr, i, i2, (i3 & (-8)) | 4, zzdsVar);
/* 69 */                        object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
/* 73 */                        if (object == null) {
/* 77 */                            unsafe.putObject(obj, j, zzdsVar.zzc);
                                } else {
/* 87 */                            unsafe.putObject(obj, j, zzez.zzg(object, zzdsVar.zzc));
                                }
/* 90 */                        unsafe.putInt(obj, j2, i4);
/* 93 */                        return iZzc;
                            }
                            break;
                    }
/* 33 */            return i;
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0080. Please report as an issue. */
                private final int zzo(Object obj, byte[] bArr, int i, int i2, zzds zzdsVar) throws IOException {
                    Unsafe unsafe;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
/* 1 */             this = this;
/* 3 */             Object obj2 = obj;
/* 5 */             byte[] bArr2 = bArr;
/* 7 */             int i13 = i2;
/* 9 */             zzdsVar = zzdsVar;
/* 11 */            Unsafe unsafe2 = zzb;
/* 15 */            int i14 = -1;
/* 16 */            int iZzm = i;
/* 18 */            int i15 = -1;
/* 19 */            int i16 = 0;
/* 21 */            int i17 = 0;
/* 22 */            int i18 = 1048575;
/* 25 */            while (iZzm < i13) {
/* 27 */                int iZzk = iZzm + 1;
/* 29 */                int i19 = bArr2[iZzm];
/* 31 */                if (i19 < 0) {
/* 33 */                    iZzk = zzdt.zzk(i19, bArr2, iZzk, zzdsVar);
/* 37 */                    i19 = zzdsVar.zza;
                        }
/* 39 */                int i20 = iZzk;
/* 40 */                int i21 = i19 >>> 3;
/* 42 */                int i22 = i19 & 7;
/* 53 */                int iZzr = i21 > i15 ? this.zzr(i21, i16 / 3) : this.zzq(i21);
/* 57 */                if (iZzr == i14) {
/* 59 */                    unsafe = unsafe2;
/* 61 */                    i3 = i19;
/* 62 */                    i4 = i14;
/* 64 */                    i5 = i21;
/* 65 */                    i6 = 0;
/* 67 */                    obj = obj2;
                        } else {
/* 70 */                    int[] iArr = this.zzc;
/* 74 */                    int i23 = iArr[iZzr + 1];
/* 79 */                    int iZzu = zzu(i23);
/* 83 */                    int i24 = i19;
/* 87 */                    int i25 = iZzr;
/* 85 */                    long j = i23 & 1048575;
/* 94 */                    if (iZzu <= 17) {
/* 98 */                        int i26 = iArr[i25 + 2];
/* 103 */                       int i27 = 1 << (i26 >>> 20);
/* 105 */                       int i28 = i26 & 1048575;
/* 107 */                       if (i28 != i18) {
/* 109 */                           int i29 = 1048575;
/* 111 */                           if (i18 != 1048575) {
/* 114 */                               unsafe2.putInt(obj2, i18, i17);
/* 117 */                               i29 = 1048575;
                                    }
/* 120 */                           if (i28 != i29) {
/* 123 */                               i17 = unsafe2.getInt(obj2, i28);
                                    }
/* 127 */                           i18 = i28;
                                }
                                switch (iZzu) {
                                    case 0:
/* 440 */                               i12 = i25;
/* 445 */                               if (i22 != 1) {
/* 459 */                                   obj = obj2;
/* 460 */                                   unsafe = unsafe2;
/* 462 */                                   i5 = i21;
/* 463 */                                   i6 = i12;
/* 464 */                                   i4 = -1;
/* 466 */                                   i3 = i24 == true ? 1 : 0;
                                        } else {
/* 455 */                                   zzhi.zzl(obj2, j, Double.longBitsToDouble(zzdt.zzn(bArr2, i20)));
/* 362 */                                   iZzm = i20 + 8;
/* 315 */                                   i17 |= i27;
/* 317 */                                   i13 = i2;
/* 166 */                                   i15 = i21;
/* 167 */                                   i16 = i12;
/* 168 */                                   i14 = -1;
                                        }
                                        break;
                                    case 1:
/* 422 */                               i12 = i25;
/* 426 */                               if (i22 != 5) {
/* 459 */                                   obj = obj2;
/* 460 */                                   unsafe = unsafe2;
/* 462 */                                   i5 = i21;
/* 463 */                                   i6 = i12;
/* 464 */                                   i4 = -1;
/* 466 */                                   i3 = i24 == true ? 1 : 0;
                                        } else {
/* 436 */                                   zzhi.zzm(obj2, j, Float.intBitsToFloat(zzdt.zzb(bArr2, i20)));
/* 334 */                                   iZzm = i20 + 4;
/* 315 */                                   i17 |= i27;
/* 317 */                                   i13 = i2;
/* 166 */                                   i15 = i21;
/* 167 */                                   i16 = i12;
/* 168 */                                   i14 = -1;
                                        }
                                        break;
                                    case 2:
                                    case 3:
/* 387 */                               i12 = i25;
/* 391 */                               if (i22 != 0) {
/* 459 */                                   obj = obj2;
/* 460 */                                   unsafe = unsafe2;
/* 462 */                                   i5 = i21;
/* 463 */                                   i6 = i12;
/* 464 */                                   i4 = -1;
/* 466 */                                   i3 = i24 == true ? 1 : 0;
                                        } else {
/* 393 */                                   int iZzm2 = zzdt.zzm(bArr2, i20, zzdsVar);
/* 399 */                                   Unsafe unsafe3 = unsafe2;
/* 401 */                                   Object obj3 = obj2;
/* 404 */                                   unsafe3.putLong(obj3, j, zzdsVar.zzb);
/* 409 */                                   unsafe2 = unsafe3;
/* 410 */                                   obj2 = obj3;
/* 412 */                                   i17 |= i27;
/* 414 */                                   iZzm = iZzm2;
/* 415 */                                   i15 = i21;
/* 416 */                                   i16 = i12;
/* 417 */                                   i14 = -1;
/* 418 */                                   i13 = i2;
                                        }
                                        break;
                                    case 4:
                                    case 11:
/* 365 */                               i12 = i25;
/* 369 */                               if (i22 != 0) {
/* 459 */                                   obj = obj2;
/* 460 */                                   unsafe = unsafe2;
/* 462 */                                   i5 = i21;
/* 463 */                                   i6 = i12;
/* 464 */                                   i4 = -1;
/* 466 */                                   i3 = i24 == true ? 1 : 0;
                                        } else {
/* 371 */                                   int iZzj = zzdt.zzj(bArr2, i20, zzdsVar);
/* 377 */                                   unsafe2.putInt(obj2, j, zzdsVar.zza);
/* 380 */                                   i17 |= i27;
/* 382 */                                   i13 = i2;
/* 384 */                                   iZzm = iZzj;
/* 166 */                                   i15 = i21;
/* 167 */                                   i16 = i12;
/* 168 */                                   i14 = -1;
                                        }
                                        break;
                                    case 5:
                                    case 14:
/* 337 */                               i12 = i25;
/* 342 */                               if (i22 != 1) {
/* 459 */                                   obj = obj2;
/* 460 */                                   unsafe = unsafe2;
/* 462 */                                   i5 = i21;
/* 463 */                                   i6 = i12;
/* 464 */                                   i4 = -1;
/* 466 */                                   i3 = i24 == true ? 1 : 0;
                                        } else {
/* 349 */                                   Unsafe unsafe4 = unsafe2;
/* 351 */                                   Object obj4 = obj2;
/* 354 */                                   unsafe4.putLong(obj4, j, zzdt.zzn(bArr2, i20));
/* 359 */                                   unsafe2 = unsafe4;
/* 360 */                                   obj2 = obj4;
/* 362 */                                   iZzm = i20 + 8;
/* 315 */                                   i17 |= i27;
/* 317 */                                   i13 = i2;
/* 166 */                                   i15 = i21;
/* 167 */                                   i16 = i12;
/* 168 */                                   i14 = -1;
                                        }
                                        break;
                                    case 6:
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 321 */                               i12 = i25;
/* 325 */                               if (i22 != 5) {
/* 459 */                                   obj = obj2;
/* 460 */                                   unsafe = unsafe2;
/* 462 */                                   i5 = i21;
/* 463 */                                   i6 = i12;
/* 464 */                                   i4 = -1;
/* 466 */                                   i3 = i24 == true ? 1 : 0;
                                        } else {
/* 331 */                                   unsafe2.putInt(obj2, j, zzdt.zzb(bArr2, i20));
/* 334 */                                   iZzm = i20 + 4;
/* 315 */                                   i17 |= i27;
/* 317 */                                   i13 = i2;
/* 166 */                                   i15 = i21;
/* 167 */                                   i16 = i12;
/* 168 */                                   i14 = -1;
                                        }
                                        break;
                                    case 7:
/* 290 */                               i12 = i25;
/* 294 */                               if (i22 != 0) {
/* 459 */                                   obj = obj2;
/* 460 */                                   unsafe = unsafe2;
/* 462 */                                   i5 = i21;
/* 463 */                                   i6 = i12;
/* 464 */                                   i4 = -1;
/* 466 */                                   i3 = i24 == true ? 1 : 0;
                                        } else {
/* 296 */                                   iZzm = zzdt.zzm(bArr2, i20, zzdsVar);
/* 312 */                                   zzhi.zzk(obj2, j, zzdsVar.zzb != 0);
/* 315 */                                   i17 |= i27;
/* 317 */                                   i13 = i2;
/* 166 */                                   i15 = i21;
/* 167 */                                   i16 = i12;
/* 168 */                                   i14 = -1;
                                        }
                                        break;
                                    case 8:
/* 263 */                               i12 = i25;
/* 268 */                               if (i22 != 2) {
/* 459 */                                   obj = obj2;
/* 460 */                                   unsafe = unsafe2;
/* 462 */                                   i5 = i21;
/* 463 */                                   i6 = i12;
/* 464 */                                   i4 = -1;
/* 466 */                                   i3 = i24 == true ? 1 : 0;
                                        } else {
/* 280 */                                   iZzm = (536870912 & i23) == 0 ? zzdt.zzg(bArr2, i20, zzdsVar) : zzdt.zzh(bArr2, i20, zzdsVar);
/* 286 */                                   unsafe2.putObject(obj2, j, zzdsVar.zzc);
/* 190 */                                   i17 |= i27;
/* 166 */                                   i15 = i21;
/* 167 */                                   i16 = i12;
/* 168 */                                   i14 = -1;
                                        }
                                        break;
                                    case 9:
/* 226 */                               i12 = i25;
/* 231 */                               if (i22 != 2) {
/* 459 */                                   obj = obj2;
/* 460 */                                   unsafe = unsafe2;
/* 462 */                                   i5 = i21;
/* 463 */                                   i6 = i12;
/* 464 */                                   i4 = -1;
/* 466 */                                   i3 = i24 == true ? 1 : 0;
                                        } else {
/* 237 */                                   iZzm = zzdt.zzd(this.zzy(i12), bArr2, i20, i13, zzdsVar);
/* 241 */                                   Object object = unsafe2.getObject(obj2, j);
/* 245 */                                   if (object == null) {
/* 249 */                                       unsafe2.putObject(obj2, j, zzdsVar.zzc);
                                            } else {
/* 259 */                                       unsafe2.putObject(obj2, j, zzez.zzg(object, zzdsVar.zzc));
                                            }
/* 190 */                                   i17 |= i27;
/* 166 */                                   i15 = i21;
/* 167 */                                   i16 = i12;
/* 168 */                                   i14 = -1;
                                        }
                                        break;
                                    case 10:
/* 209 */                               i12 = i25;
/* 214 */                               if (i22 != 2) {
/* 459 */                                   obj = obj2;
/* 460 */                                   unsafe = unsafe2;
/* 462 */                                   i5 = i21;
/* 463 */                                   i6 = i12;
/* 464 */                                   i4 = -1;
/* 466 */                                   i3 = i24 == true ? 1 : 0;
                                        } else {
/* 216 */                                   iZzm = zzdt.zza(bArr2, i20, zzdsVar);
/* 222 */                                   unsafe2.putObject(obj2, j, zzdsVar.zzc);
/* 190 */                                   i17 |= i27;
/* 166 */                                   i15 = i21;
/* 167 */                                   i16 = i12;
/* 168 */                                   i14 = -1;
                                        }
                                        break;
                                    case 12:
/* 193 */                               i12 = i25;
/* 197 */                               if (i22 != 0) {
/* 459 */                                   obj = obj2;
/* 460 */                                   unsafe = unsafe2;
/* 462 */                                   i5 = i21;
/* 463 */                                   i6 = i12;
/* 464 */                                   i4 = -1;
/* 466 */                                   i3 = i24 == true ? 1 : 0;
                                        } else {
/* 199 */                                   iZzm = zzdt.zzj(bArr2, i20, zzdsVar);
/* 205 */                                   unsafe2.putInt(obj2, j, zzdsVar.zza);
/* 190 */                                   i17 |= i27;
/* 166 */                                   i15 = i21;
/* 167 */                                   i16 = i12;
/* 168 */                                   i14 = -1;
                                        }
                                        break;
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 171 */                               i12 = i25;
/* 175 */                               if (i22 != 0) {
/* 459 */                                   obj = obj2;
/* 460 */                                   unsafe = unsafe2;
/* 462 */                                   i5 = i21;
/* 463 */                                   i6 = i12;
/* 464 */                                   i4 = -1;
/* 466 */                                   i3 = i24 == true ? 1 : 0;
                                        } else {
/* 177 */                                   iZzm = zzdt.zzj(bArr2, i20, zzdsVar);
/* 187 */                                   unsafe2.putInt(obj2, j, zzei.zzb(zzdsVar.zza));
/* 190 */                                   i17 |= i27;
/* 166 */                                   i15 = i21;
/* 167 */                                   i16 = i12;
/* 168 */                                   i14 = -1;
                                        }
                                        break;
                                    case 16:
/* 136 */                               if (i22 != 0) {
/* 132 */                                   i12 = i25;
/* 459 */                                   obj = obj2;
/* 460 */                                   unsafe = unsafe2;
/* 462 */                                   i5 = i21;
/* 463 */                                   i6 = i12;
/* 464 */                                   i4 = -1;
/* 466 */                                   i3 = i24 == true ? 1 : 0;
                                        } else {
/* 138 */                                   int iZzm3 = zzdt.zzm(bArr2, i20, zzdsVar);
/* 148 */                                   Unsafe unsafe5 = unsafe2;
/* 149 */                                   Object obj5 = obj2;
/* 151 */                                   i12 = i25;
/* 155 */                                   unsafe5.putLong(obj5, j, zzei.zzc(zzdsVar.zzb));
/* 160 */                                   unsafe2 = unsafe5;
/* 161 */                                   obj2 = obj5;
/* 163 */                                   i17 |= i27;
/* 165 */                                   iZzm = iZzm3;
/* 166 */                                   i15 = i21;
/* 167 */                                   i16 = i12;
/* 168 */                                   i14 = -1;
                                        }
                                        break;
                                    default:
/* 132 */                               i12 = i25;
/* 459 */                               obj = obj2;
/* 460 */                               unsafe = unsafe2;
/* 462 */                               i5 = i21;
/* 463 */                               i6 = i12;
/* 464 */                               i4 = -1;
/* 466 */                               i3 = i24 == true ? 1 : 0;
                                        break;
                                }
                            } else {
/* 470 */                       i6 = i25;
/* 476 */                       if (iZzu != 27) {
/* 553 */                           i7 = i20;
/* 554 */                           Unsafe unsafe6 = unsafe2;
/* 559 */                           if (iZzu <= 49) {
/* 564 */                               i8 = i17;
/* 566 */                               unsafe = unsafe6;
/* 570 */                               i4 = -1;
/* 574 */                               i10 = i18;
/* 583 */                               int iZzp = this.zzp(obj, bArr, i7, i2, i24 == true ? 1 : 0, i21, i22, i6, i23, iZzu, j, zzdsVar);
/* 587 */                               i9 = i24 == true ? 1 : 0;
/* 588 */                               i11 = i21;
/* 589 */                               if (iZzp != i7) {
/* 593 */                                   obj2 = obj;
/* 597 */                                   iZzm = iZzp;
/* 598 */                                   i16 = i6;
/* 599 */                                   i15 = i11;
/* 600 */                                   i18 = i10;
/* 601 */                                   i14 = i4;
/* 603 */                                   i17 = i8;
/* 605 */                                   unsafe2 = unsafe;
/* 607 */                                   bArr2 = bArr;
/* 418 */                                   i13 = i2;
                                        } else {
/* 613 */                                   i20 = iZzp;
/* 614 */                                   i5 = i11;
/* 615 */                                   i3 = i9;
                                        }
                                    } else {
/* 622 */                               i8 = i17;
/* 624 */                               unsafe = unsafe6;
/* 626 */                               i4 = -1;
/* 628 */                               i9 = i24 == true ? 1 : 0;
/* 632 */                               i10 = i18;
/* 633 */                               i11 = i21;
/* 636 */                               if (iZzu == 50) {
/* 639 */                                   if (i22 == 2) {
/* 653 */                                       int iZzm4 = zzm(obj, bArr, i7, i2, i6, j, zzdsVar);
/* 658 */                                       if (iZzm4 != i7) {
/* 657 */                                           i6 = i6;
/* 660 */                                           this = this;
/* 662 */                                           obj2 = obj;
/* 664 */                                           bArr2 = bArr;
/* 666 */                                           zzdsVar = zzdsVar;
/* 668 */                                           iZzm = iZzm4;
/* 669 */                                           i16 = i6;
/* 670 */                                           i15 = i11;
/* 671 */                                           i18 = i10;
/* 672 */                                           i14 = -1;
/* 674 */                                           i17 = i8;
/* 676 */                                           unsafe2 = unsafe;
/* 418 */                                           i13 = i2;
                                                } else {
/* 657 */                                           i6 = i6;
/* 682 */                                           i20 = iZzm4;
                                                }
                                            } else {
/* 684 */                                       i6 = i6;
/* 687 */                                       i20 = i7;
                                            }
/* 614 */                                   i5 = i11;
/* 615 */                                   i3 = i9;
                                        } else {
/* 697 */                                   i5 = i11;
/* 705 */                                   int iZzn = zzn(obj, bArr, i7, i2, i9 == true ? 1 : 0, i5, i22, i23, iZzu, j, i6, zzdsVar);
/* 709 */                                   obj = obj;
/* 710 */                                   i3 = i9 == true ? 1 : 0;
/* 712 */                                   if (iZzn != i7) {
/* 711 */                                       i6 = i6;
/* 718 */                                       i15 = i5;
/* 719 */                                       iZzm = iZzn;
/* 720 */                                       i16 = i6;
/* 721 */                                       obj2 = obj;
/* 600 */                                       i18 = i10;
/* 601 */                                       i14 = i4;
/* 603 */                                       i17 = i8;
/* 605 */                                       unsafe2 = unsafe;
/* 607 */                                       bArr2 = bArr;
/* 418 */                                       i13 = i2;
                                            } else {
/* 711 */                                       i6 = i6;
/* 723 */                                       i20 = iZzn;
                                            }
                                        }
                                    }
                                } else if (i22 == 2) {
/* 485 */                           zzey zzeyVarZzd = (zzey) unsafe2.getObject(obj2, j);
/* 491 */                           if (!zzeyVarZzd.zzc()) {
/* 493 */                               int size = zzeyVarZzd.size();
/* 503 */                               zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
/* 507 */                               unsafe2.putObject(obj2, j, zzeyVarZzd);
                                    }
/* 523 */                           int iZze = zzdt.zze(this.zzy(i6), i24 == true ? 1 : 0, bArr2, i20, i2, zzeyVarZzd, zzdsVar);
/* 527 */                           bArr2 = bArr;
/* 529 */                           zzdsVar = zzdsVar;
/* 531 */                           iZzm = iZze;
/* 532 */                           i16 = i6;
/* 533 */                           unsafe2 = unsafe2;
/* 534 */                           i15 = i21;
/* 535 */                           i14 = -1;
/* 536 */                           obj2 = obj;
/* 418 */                           i13 = i2;
                                } else {
/* 539 */                           i7 = i20;
/* 541 */                           i10 = i18;
/* 542 */                           i8 = i17;
/* 544 */                           unsafe = unsafe2;
/* 546 */                           i11 = i21;
/* 547 */                           i4 = -1;
/* 549 */                           i9 = i24 == true ? 1 : 0;
/* 687 */                           i20 = i7;
/* 614 */                           i5 = i11;
/* 615 */                           i3 = i9;
                                }
/* 616 */                       i18 = i10;
/* 617 */                       i17 = i8;
                            }
                        }
/* 737 */               int iZzi = zzdt.zzi(i3 == true ? 1 : 0, bArr, i20, i2, zzc(obj), zzdsVar);
/* 741 */               bArr2 = bArr;
/* 743 */               zzdsVar = zzdsVar;
/* 745 */               i15 = i5;
/* 746 */               i16 = i6;
/* 747 */               obj2 = obj;
/* 748 */               i14 = i4;
/* 750 */               unsafe2 = unsafe;
/* 752 */               i13 = i2;
/* 753 */               iZzm = iZzi;
/* 754 */               this = this;
                    }
/* 758 */           Object obj6 = obj2;
/* 759 */           Unsafe unsafe7 = unsafe2;
/* 761 */           int i30 = i13;
/* 762 */           int i31 = i18;
/* 763 */           int i32 = i17;
/* 768 */           if (i31 != 1048575) {
/* 775 */               unsafe7.putInt(obj6, i31, i32);
                    }
/* 778 */           if (iZzm == i30) {
/* 780 */               return iZzm;
                    }
/* 785 */           throw zzfa.zzd();
                }

                private final int zzp(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzds zzdsVar) throws IOException {
                    int iZzl;
/* 1 */             Unsafe unsafe = zzb;
                    zzey zzeyVarZzd = (zzey) unsafe.getObject(obj, j2);
/* 2 */             if (!zzeyVarZzd.zzc()) {
/* 3 */                 int size = zzeyVarZzd.size();
/* 4 */                 zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
/* 5 */                 unsafe.putObject(obj, j2, zzeyVarZzd);
                    }
                    zzey zzeyVar = zzeyVarZzd;
                    switch (i7) {
                        case 18:
                        case Build.API_LEVELS.API_35 /* 35 */:
                            if (i5 == 2) {
/* 136 */                       zzej zzejVar = (zzej) zzeyVar;
/* 137 */                       int iZzj = zzdt.zzj(bArr, i, zzdsVar);
                                int i8 = zzdsVar.zza + iZzj;
                                while (iZzj < i8) {
/* 139 */                           zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj)));
                                    iZzj += 8;
                                }
                                if (iZzj == i8) {
                                    return iZzj;
                                }
/* 140 */                       throw zzfa.zzf();
                            }
                            if (i5 == 1) {
/* 141 */                       zzej zzejVar2 = (zzej) zzeyVar;
/* 143 */                       zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i)));
                                int i9 = i + 8;
                                while (i9 < i2) {
/* 144 */                           int iZzj2 = zzdt.zzj(bArr, i9, zzdsVar);
                                    if (i3 != zzdsVar.zza) {
                                        return i9;
                                    }
/* 146 */                           zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj2)));
                                    i9 = iZzj2 + 8;
                                }
                                return i9;
                            }
                            return i;
                        case 19:
                        case Build.API_LEVELS.API_36 /* 36 */:
                            if (i5 == 2) {
/* 125 */                       zzeq zzeqVar = (zzeq) zzeyVar;
/* 126 */                       int iZzj3 = zzdt.zzj(bArr, i, zzdsVar);
                                int i10 = zzdsVar.zza + iZzj3;
                                while (iZzj3 < i10) {
/* 128 */                           zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj3)));
                                    iZzj3 += 4;
                                }
                                if (iZzj3 == i10) {
                                    return iZzj3;
                                }
/* 129 */                       throw zzfa.zzf();
                            }
                            if (i5 == 5) {
/* 130 */                       zzeq zzeqVar2 = (zzeq) zzeyVar;
/* 132 */                       zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i)));
                                int i11 = i + 4;
                                while (i11 < i2) {
/* 133 */                           int iZzj4 = zzdt.zzj(bArr, i11, zzdsVar);
                                    if (i3 != zzdsVar.zza) {
                                        return i11;
                                    }
/* 135 */                           zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj4)));
                                    i11 = iZzj4 + 4;
                                }
                                return i11;
                            }
                            return i;
                        case 20:
                        case Build.API_LEVELS.API_21 /* 21 */:
                        case 37:
                        case 38:
                            if (i5 == 2) {
/* 114 */                       zzfl zzflVar = (zzfl) zzeyVar;
/* 115 */                       int iZzj5 = zzdt.zzj(bArr, i, zzdsVar);
                                int i12 = zzdsVar.zza + iZzj5;
                                while (iZzj5 < i12) {
/* 116 */                           iZzj5 = zzdt.zzm(bArr, iZzj5, zzdsVar);
/* 117 */                           zzflVar.zze(zzdsVar.zzb);
                                }
                                if (iZzj5 == i12) {
                                    return iZzj5;
                                }
/* 118 */                       throw zzfa.zzf();
                            }
                            if (i5 == 0) {
/* 119 */                       zzfl zzflVar2 = (zzfl) zzeyVar;
/* 120 */                       int iZzm = zzdt.zzm(bArr, i, zzdsVar);
/* 121 */                       zzflVar2.zze(zzdsVar.zzb);
                                while (iZzm < i2) {
/* 122 */                           int iZzj6 = zzdt.zzj(bArr, iZzm, zzdsVar);
                                    if (i3 != zzdsVar.zza) {
                                        return iZzm;
                                    }
/* 123 */                           iZzm = zzdt.zzm(bArr, iZzj6, zzdsVar);
/* 124 */                           zzflVar2.zze(zzdsVar.zzb);
                                }
                                return iZzm;
                            }
                            return i;
                        case Build.API_LEVELS.API_22 /* 22 */:
                        case Build.API_LEVELS.API_29 /* 29 */:
                        case 39:
                        case 43:
                            if (i5 == 2) {
/* 112 */                       return zzdt.zzf(bArr, i, zzeyVar, zzdsVar);
                            }
                            if (i5 == 0) {
/* 113 */                       return zzdt.zzl(i3, bArr, i, i2, zzeyVar, zzdsVar);
                            }
                            return i;
                        case Build.API_LEVELS.API_23 /* 23 */:
                        case 32:
                        case RequestError.NETWORK_FAILURE /* 40 */:
                        case 46:
                            if (i5 == 2) {
/* 104 */                       zzfl zzflVar3 = (zzfl) zzeyVar;
/* 105 */                       int iZzj7 = zzdt.zzj(bArr, i, zzdsVar);
                                int i13 = zzdsVar.zza + iZzj7;
                                while (iZzj7 < i13) {
/* 106 */                           zzflVar3.zze(zzdt.zzn(bArr, iZzj7));
                                    iZzj7 += 8;
                                }
                                if (iZzj7 == i13) {
                                    return iZzj7;
                                }
/* 107 */                       throw zzfa.zzf();
                            }
                            if (i5 == 1) {
/* 108 */                       zzfl zzflVar4 = (zzfl) zzeyVar;
/* 109 */                       zzflVar4.zze(zzdt.zzn(bArr, i));
                                int i14 = i + 8;
                                while (i14 < i2) {
/* 110 */                           int iZzj8 = zzdt.zzj(bArr, i14, zzdsVar);
                                    if (i3 != zzdsVar.zza) {
                                        return i14;
                                    }
/* 111 */                           zzflVar4.zze(zzdt.zzn(bArr, iZzj8));
                                    i14 = iZzj8 + 8;
                                }
                                return i14;
                            }
                            return i;
                        case 24:
                        case Build.API_LEVELS.API_31 /* 31 */:
                        case RequestError.NO_DEV_KEY /* 41 */:
                        case 45:
                            if (i5 == 2) {
/* 96 */                        zzev zzevVar = (zzev) zzeyVar;
/* 97 */                        int iZzj9 = zzdt.zzj(bArr, i, zzdsVar);
                                int i15 = zzdsVar.zza + iZzj9;
                                while (iZzj9 < i15) {
/* 98 */                            zzevVar.zze(zzdt.zzb(bArr, iZzj9));
                                    iZzj9 += 4;
                                }
                                if (iZzj9 == i15) {
                                    return iZzj9;
                                }
/* 99 */                        throw zzfa.zzf();
                            }
                            if (i5 == 5) {
/* 100 */                       zzev zzevVar2 = (zzev) zzeyVar;
/* 101 */                       zzevVar2.zze(zzdt.zzb(bArr, i));
                                int i16 = i + 4;
                                while (i16 < i2) {
/* 102 */                           int iZzj10 = zzdt.zzj(bArr, i16, zzdsVar);
                                    if (i3 != zzdsVar.zza) {
                                        return i16;
                                    }
/* 103 */                           zzevVar2.zze(zzdt.zzb(bArr, iZzj10));
                                    i16 = iZzj10 + 4;
                                }
                                return i16;
                            }
                            return i;
                        case Build.API_LEVELS.API_25 /* 25 */:
                        case 42:
                            if (i5 == 2) {
/* 85 */                        zzdu zzduVar = (zzdu) zzeyVar;
/* 86 */                        int iZzj11 = zzdt.zzj(bArr, i, zzdsVar);
                                int i17 = zzdsVar.zza + iZzj11;
                                while (iZzj11 < i17) {
/* 87 */                            iZzj11 = zzdt.zzm(bArr, iZzj11, zzdsVar);
/* 88 */                            zzduVar.zze(zzdsVar.zzb != 0);
                                }
                                if (iZzj11 == i17) {
                                    return iZzj11;
                                }
/* 89 */                        throw zzfa.zzf();
                            }
                            if (i5 == 0) {
/* 90 */                        zzdu zzduVar2 = (zzdu) zzeyVar;
/* 91 */                        int iZzm2 = zzdt.zzm(bArr, i, zzdsVar);
/* 92 */                        zzduVar2.zze(zzdsVar.zzb != 0);
                                while (iZzm2 < i2) {
/* 93 */                            int iZzj12 = zzdt.zzj(bArr, iZzm2, zzdsVar);
                                    if (i3 != zzdsVar.zza) {
                                        return iZzm2;
                                    }
/* 94 */                            iZzm2 = zzdt.zzm(bArr, iZzj12, zzdsVar);
/* 95 */                            zzduVar2.zze(zzdsVar.zzb != 0);
                                }
                                return iZzm2;
                            }
                            return i;
                        case Build.API_LEVELS.API_26 /* 26 */:
                            if (i5 == 2) {
                                if ((j & 536870912) == 0) {
/* 56 */                            int iZzj13 = zzdt.zzj(bArr, i, zzdsVar);
                                    int i18 = zzdsVar.zza;
                                    if (i18 < 0) {
/* 67 */                                throw zzfa.zzc();
                                    }
                                    if (i18 == 0) {
/* 57 */                                zzeyVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                    } else {
/* 60 */                                zzeyVar.add(new String(bArr, iZzj13, i18, zzez.zzb));
                                        iZzj13 += i18;
                                    }
                                    while (iZzj13 < i2) {
/* 61 */                                int iZzj14 = zzdt.zzj(bArr, iZzj13, zzdsVar);
                                        if (i3 != zzdsVar.zza) {
                                            return iZzj13;
                                        }
/* 62 */                                iZzj13 = zzdt.zzj(bArr, iZzj14, zzdsVar);
                                        int i19 = zzdsVar.zza;
                                        if (i19 < 0) {
/* 66 */                                    throw zzfa.zzc();
                                        }
                                        if (i19 == 0) {
/* 63 */                                    zzeyVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                        } else {
/* 65 */                                    zzeyVar.add(new String(bArr, iZzj13, i19, zzez.zzb));
                                            iZzj13 += i19;
                                        }
                                    }
                                    return iZzj13;
                                }
/* 68 */                        int iZzj15 = zzdt.zzj(bArr, i, zzdsVar);
                                int i20 = zzdsVar.zza;
                                if (i20 < 0) {
/* 84 */                            throw zzfa.zzc();
                                }
                                if (i20 == 0) {
/* 69 */                            zzeyVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
                                    int i21 = iZzj15 + i20;
/* 70 */                            if (!zzhm.zzd(bArr, iZzj15, i21)) {
/* 83 */                                throw zzfa.zzb();
                                    }
/* 73 */                            zzeyVar.add(new String(bArr, iZzj15, i20, zzez.zzb));
                                    iZzj15 = i21;
                                }
                                while (iZzj15 < i2) {
/* 74 */                            int iZzj16 = zzdt.zzj(bArr, iZzj15, zzdsVar);
                                    if (i3 != zzdsVar.zza) {
                                        return iZzj15;
                                    }
/* 75 */                            iZzj15 = zzdt.zzj(bArr, iZzj16, zzdsVar);
                                    int i22 = zzdsVar.zza;
                                    if (i22 < 0) {
/* 82 */                                throw zzfa.zzc();
                                    }
                                    if (i22 == 0) {
/* 76 */                                zzeyVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                    } else {
                                        int i23 = iZzj15 + i22;
/* 77 */                                if (!zzhm.zzd(bArr, iZzj15, i23)) {
/* 81 */                                    throw zzfa.zzb();
                                        }
/* 80 */                                zzeyVar.add(new String(bArr, iZzj15, i22, zzez.zzb));
                                        iZzj15 = i23;
                                    }
                                }
                                return iZzj15;
                            }
                            return i;
                        case Build.API_LEVELS.API_27 /* 27 */:
                            if (i5 == 2) {
/* 55 */                        return zzdt.zze(zzy(i6), i3, bArr, i, i2, zzeyVar, zzdsVar);
                            }
                            return i;
                        case Build.API_LEVELS.API_28 /* 28 */:
                            if (i5 == 2) {
/* 40 */                        int iZzj17 = zzdt.zzj(bArr, i, zzdsVar);
                                int i24 = zzdsVar.zza;
                                if (i24 < 0) {
/* 53 */                            throw zzfa.zzc();
                                }
/* 41 */                        if (i24 > bArr.length - iZzj17) {
/* 52 */                            throw zzfa.zzf();
                                }
                                if (i24 == 0) {
/* 42 */                            zzeyVar.add(zzee.zzb);
                                } else {
/* 43 */                            zzeyVar.add(zzee.zzk(bArr, iZzj17, i24));
                                    iZzj17 += i24;
                                }
                                while (iZzj17 < i2) {
/* 44 */                            int iZzj18 = zzdt.zzj(bArr, iZzj17, zzdsVar);
                                    if (i3 != zzdsVar.zza) {
                                        return iZzj17;
                                    }
/* 45 */                            iZzj17 = zzdt.zzj(bArr, iZzj18, zzdsVar);
                                    int i25 = zzdsVar.zza;
                                    if (i25 < 0) {
/* 51 */                                throw zzfa.zzc();
                                    }
/* 46 */                            if (i25 > bArr.length - iZzj17) {
/* 50 */                                throw zzfa.zzf();
                                    }
                                    if (i25 == 0) {
/* 48 */                                zzeyVar.add(zzee.zzb);
                                    } else {
/* 49 */                                zzeyVar.add(zzee.zzk(bArr, iZzj17, i25));
                                        iZzj17 += i25;
                                    }
                                }
                                return iZzj17;
                            }
                            return i;
                        case Build.API_LEVELS.API_30 /* 30 */:
                        case 44:
                            if (i5 != 2) {
                                if (i5 == 0) {
/* 35 */                            iZzl = zzdt.zzl(i3, bArr, i, i2, zzeyVar, zzdsVar);
                                }
                                return i;
                            }
/* 34 */                    iZzl = zzdt.zzf(bArr, i, zzeyVar, zzdsVar);
/* 36 */                    zzeu zzeuVar = (zzeu) obj;
                            zzgz zzgzVar = zzeuVar.zzc;
                            if (zzgzVar == zzgz.zza()) {
                                zzgzVar = null;
                            }
/* 38 */                    Object objZzd = zzgj.zzd(i4, zzeyVar, zzx(i6), zzgzVar, this.zzm);
                            if (objZzd == null) {
                                return iZzl;
                            }
/* 39 */                    zzeuVar.zzc = (zzgz) objZzd;
                            return iZzl;
                        case Build.API_LEVELS.API_33 /* 33 */:
                        case 47:
                            if (i5 == 2) {
/* 23 */                        zzev zzevVar3 = (zzev) zzeyVar;
/* 24 */                        int iZzj19 = zzdt.zzj(bArr, i, zzdsVar);
                                int i26 = zzdsVar.zza + iZzj19;
                                while (iZzj19 < i26) {
/* 25 */                            iZzj19 = zzdt.zzj(bArr, iZzj19, zzdsVar);
/* 26 */                            zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                                }
                                if (iZzj19 == i26) {
                                    return iZzj19;
                                }
/* 27 */                        throw zzfa.zzf();
                            }
                            if (i5 == 0) {
/* 28 */                        zzev zzevVar4 = (zzev) zzeyVar;
/* 29 */                        int iZzj20 = zzdt.zzj(bArr, i, zzdsVar);
/* 30 */                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                                while (iZzj20 < i2) {
/* 31 */                            int iZzj21 = zzdt.zzj(bArr, iZzj20, zzdsVar);
                                    if (i3 != zzdsVar.zza) {
                                        return iZzj20;
                                    }
/* 32 */                            iZzj20 = zzdt.zzj(bArr, iZzj21, zzdsVar);
/* 33 */                            zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                                }
                                return iZzj20;
                            }
                            return i;
                        case Build.API_LEVELS.API_34 /* 34 */:
                        case 48:
                            if (i5 == 2) {
/* 12 */                        zzfl zzflVar5 = (zzfl) zzeyVar;
/* 13 */                        int iZzj22 = zzdt.zzj(bArr, i, zzdsVar);
                                int i27 = zzdsVar.zza + iZzj22;
                                while (iZzj22 < i27) {
/* 14 */                            iZzj22 = zzdt.zzm(bArr, iZzj22, zzdsVar);
/* 15 */                            zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                                }
                                if (iZzj22 == i27) {
                                    return iZzj22;
                                }
/* 16 */                        throw zzfa.zzf();
                            }
                            if (i5 == 0) {
/* 17 */                        zzfl zzflVar6 = (zzfl) zzeyVar;
/* 18 */                        int iZzm3 = zzdt.zzm(bArr, i, zzdsVar);
/* 19 */                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                                while (iZzm3 < i2) {
/* 20 */                            int iZzj23 = zzdt.zzj(bArr, iZzm3, zzdsVar);
                                    if (i3 != zzdsVar.zza) {
                                        return iZzm3;
                                    }
/* 21 */                            iZzm3 = zzdt.zzm(bArr, iZzj23, zzdsVar);
/* 22 */                            zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                                }
                                return iZzm3;
                            }
                            return i;
                        default:
                            if (i5 == 3) {
/* 6 */                         zzgh zzghVarZzy = zzy(i6);
                                int i28 = (i3 & (-8)) | 4;
/* 7 */                         int iZzc = zzdt.zzc(zzghVarZzy, bArr, i, i2, i28, zzdsVar);
                                int i29 = i28;
                                zzds zzdsVar2 = zzdsVar;
/* 8 */                         zzeyVar.add(zzdsVar2.zzc);
                                while (iZzc < i2) {
/* 9 */                             int iZzj24 = zzdt.zzj(bArr, iZzc, zzdsVar2);
                                    if (i3 != zzdsVar2.zza) {
                                        return iZzc;
                                    }
                                    int i30 = i29;
                                    zzds zzdsVar3 = zzdsVar2;
/* 10 */                            iZzc = zzdt.zzc(zzghVarZzy, bArr, iZzj24, i2, i30, zzdsVar3);
/* 11 */                            zzeyVar.add(zzdsVar3.zzc);
                                    i29 = i30;
                                    zzdsVar2 = zzdsVar3;
                                }
                                return iZzc;
                            }
                            return i;
                    }
                }

                private final int zzq(int i) {
/* 3 */             if (i < this.zze || i > this.zzf) {
/* 15 */                return -1;
                    }
/* 10 */            return zzt(i, 0);
                }

                private final int zzr(int i, int i2) {
/* 3 */             if (i < this.zze || i > this.zzf) {
/* 14 */                return -1;
                    }
/* 9 */             return zzt(i, i2);
                }

                private final int zzs(int i) {
/* 5 */             return this.zzc[i + 2];
                }

                private final int zzt(int i, int i2) {
/* 7 */             int length = (this.zzc.length / 3) - 1;
/* 8 */             while (i2 <= length) {
/* 12 */                int i3 = (length + i2) >>> 1;
/* 14 */                int i4 = i3 * 3;
/* 18 */                int i5 = this.zzc[i4];
/* 20 */                if (i == i5) {
/* 22 */                    return i4;
                        }
/* 23 */                if (i < i5) {
/* 25 */                    length = i3 - 1;
                        } else {
/* 29 */                    i2 = i3 + 1;
                        }
                    }
/* 6 */             return -1;
                }

                private static int zzu(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                private final int zzv(int i) {
/* 5 */             return this.zzc[i + 1];
                }

                private static long zzw(Object obj, long j) {
/* 7 */             return ((Long) zzhi.zzf(obj, j)).longValue();
                }

                private final zzex zzx(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (zzex) this.zzd[i2 + i2 + 1];
                }

                private final zzgh zzy(int i) {
/* 1 */             int i2 = i / 3;
/* 3 */             int i3 = i2 + i2;
/* 8 */             zzgh zzghVar = (zzgh) this.zzd[i3];
/* 10 */            if (zzghVar != null) {
/* 12 */                return zzghVar;
                    }
/* 25 */            zzgh zzghVarZzb = zzge.zza().zzb((Class) this.zzd[i3 + 1]);
/* 31 */            this.zzd[i3] = zzghVarZzb;
/* 33 */            return zzghVarZzb;
                }

                private final Object zzz(int i) {
/* 1 */             int i2 = i / 3;
/* 6 */             return this.zzd[i2 + i2];
                }

                @Override // com.google.android.gms.internal.auth.zzgh
                public final int zza(Object obj) {
                    int i;
                    int iZzc;
                    int i2;
                    int iZzc2;
/* 3 */             int length = this.zzc.length;
/* 5 */             int i3 = 0;
/* 6 */             for (int i4 = 0; i4 < length; i4 += 3) {
/* 8 */                 int iZzv = zzv(i4);
/* 14 */                int i5 = this.zzc[i4];
/* 19 */                long j = 1048575 & iZzv;
/* 25 */                int iHashCode = 37;
                        switch (zzu(iZzv)) {
                            case 0:
/* 560 */                       i = i3 * 53;
/* 570 */                       iZzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j)));
/* 48 */                        i3 = iZzc + i;
                                break;
                            case 1:
/* 548 */                       i = i3 * 53;
/* 554 */                       iZzc = Float.floatToIntBits(zzhi.zzb(obj, j));
/* 48 */                        i3 = iZzc + i;
                                break;
                            case 2:
/* 536 */                       i = i3 * 53;
/* 542 */                       iZzc = zzez.zzc(zzhi.zzd(obj, j));
/* 48 */                        i3 = iZzc + i;
                                break;
                            case 3:
/* 524 */                       i = i3 * 53;
/* 530 */                       iZzc = zzez.zzc(zzhi.zzd(obj, j));
/* 48 */                        i3 = iZzc + i;
                                break;
                            case 4:
/* 516 */                       i2 = i3 * 53;
/* 518 */                       iZzc2 = zzhi.zzc(obj, j);
/* 81 */                        i3 = i2 + iZzc2;
                                break;
                            case 5:
/* 504 */                       i = i3 * 53;
/* 510 */                       iZzc = zzez.zzc(zzhi.zzd(obj, j));
/* 48 */                        i3 = iZzc + i;
                                break;
                            case 6:
/* 496 */                       i2 = i3 * 53;
/* 498 */                       iZzc2 = zzhi.zzc(obj, j);
/* 81 */                        i3 = i2 + iZzc2;
                                break;
                            case 7:
/* 484 */                       i = i3 * 53;
/* 490 */                       iZzc = zzez.zza(zzhi.zzt(obj, j));
/* 48 */                        i3 = iZzc + i;
                                break;
                            case 8:
/* 470 */                       i = i3 * 53;
/* 478 */                       iZzc = ((String) zzhi.zzf(obj, j)).hashCode();
/* 48 */                        i3 = iZzc + i;
                                break;
                            case 9:
/* 459 */                       Object objZzf = zzhi.zzf(obj, j);
/* 463 */                       if (objZzf != null) {
/* 465 */                           iHashCode = objZzf.hashCode();
                                }
/* 388 */                       i3 = (i3 * 53) + iHashCode;
                                break;
                            case 10:
/* 447 */                       i = i3 * 53;
/* 453 */                       iZzc = zzhi.zzf(obj, j).hashCode();
/* 48 */                        i3 = iZzc + i;
                                break;
                            case 11:
/* 439 */                       i2 = i3 * 53;
/* 441 */                       iZzc2 = zzhi.zzc(obj, j);
/* 81 */                        i3 = i2 + iZzc2;
                                break;
                            case 12:
/* 431 */                       i2 = i3 * 53;
/* 433 */                       iZzc2 = zzhi.zzc(obj, j);
/* 81 */                        i3 = i2 + iZzc2;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 423 */                       i2 = i3 * 53;
/* 425 */                       iZzc2 = zzhi.zzc(obj, j);
/* 81 */                        i3 = i2 + iZzc2;
                                break;
                            case 14:
/* 411 */                       i = i3 * 53;
/* 417 */                       iZzc = zzez.zzc(zzhi.zzd(obj, j));
/* 48 */                        i3 = iZzc + i;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 403 */                       i2 = i3 * 53;
/* 405 */                       iZzc2 = zzhi.zzc(obj, j);
/* 81 */                        i3 = i2 + iZzc2;
                                break;
                            case 16:
/* 391 */                       i = i3 * 53;
/* 397 */                       iZzc = zzez.zzc(zzhi.zzd(obj, j));
/* 48 */                        i3 = iZzc + i;
                                break;
                            case 17:
/* 376 */                       Object objZzf2 = zzhi.zzf(obj, j);
/* 380 */                       if (objZzf2 != null) {
/* 382 */                           iHashCode = objZzf2.hashCode();
                                }
/* 388 */                       i3 = (i3 * 53) + iHashCode;
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
/* 364 */                       i = i3 * 53;
/* 370 */                       iZzc = zzhi.zzf(obj, j).hashCode();
/* 48 */                        i3 = iZzc + i;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 352 */                       i = i3 * 53;
/* 358 */                       iZzc = zzhi.zzf(obj, j).hashCode();
/* 48 */                        i3 = iZzc + i;
                                break;
                            case 51:
/* 328 */                       if (zzJ(obj, i5, i4)) {
/* 330 */                           i = i3 * 53;
/* 346 */                           iZzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j)).doubleValue()));
/* 48 */                            i3 = iZzc + i;
                                }
                                break;
                            case 52:
/* 304 */                       if (zzJ(obj, i5, i4)) {
/* 306 */                           i = i3 * 53;
/* 318 */                           iZzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j)).floatValue());
/* 48 */                            i3 = iZzc + i;
                                }
                                break;
                            case 53:
/* 286 */                       if (zzJ(obj, i5, i4)) {
/* 288 */                           i = i3 * 53;
/* 294 */                           iZzc = zzez.zzc(zzw(obj, j));
/* 48 */                            i3 = iZzc + i;
                                }
                                break;
                            case 54:
/* 268 */                       if (zzJ(obj, i5, i4)) {
/* 270 */                           i = i3 * 53;
/* 276 */                           iZzc = zzez.zzc(zzw(obj, j));
/* 48 */                            i3 = iZzc + i;
                                }
                                break;
                            case 55:
/* 254 */                       if (zzJ(obj, i5, i4)) {
/* 256 */                           i2 = i3 * 53;
/* 258 */                           iZzc2 = zzl(obj, j);
/* 81 */                            i3 = i2 + iZzc2;
                                }
                                break;
                            case 56:
/* 236 */                       if (zzJ(obj, i5, i4)) {
/* 238 */                           i = i3 * 53;
/* 244 */                           iZzc = zzez.zzc(zzw(obj, j));
/* 48 */                            i3 = iZzc + i;
                                }
                                break;
                            case 57:
/* 222 */                       if (zzJ(obj, i5, i4)) {
/* 224 */                           i2 = i3 * 53;
/* 226 */                           iZzc2 = zzl(obj, j);
/* 81 */                            i3 = i2 + iZzc2;
                                }
                                break;
                            case 58:
/* 198 */                       if (zzJ(obj, i5, i4)) {
/* 200 */                           i = i3 * 53;
/* 212 */                           iZzc = zzez.zza(((Boolean) zzhi.zzf(obj, j)).booleanValue());
/* 48 */                            i3 = iZzc + i;
                                }
                                break;
                            case 59:
/* 178 */                       if (zzJ(obj, i5, i4)) {
/* 180 */                           i = i3 * 53;
/* 188 */                           iZzc = ((String) zzhi.zzf(obj, j)).hashCode();
/* 48 */                            i3 = iZzc + i;
                                }
                                break;
                            case 60:
/* 161 */                       if (zzJ(obj, i5, i4)) {
/* 163 */                           i = i3 * 53;
/* 169 */                           iZzc = zzhi.zzf(obj, j).hashCode();
/* 48 */                            i3 = iZzc + i;
                                }
                                break;
                            case 61:
/* 144 */                       if (zzJ(obj, i5, i4)) {
/* 146 */                           i = i3 * 53;
/* 152 */                           iZzc = zzhi.zzf(obj, j).hashCode();
/* 48 */                            i3 = iZzc + i;
                                }
                                break;
                            case 62:
/* 131 */                       if (zzJ(obj, i5, i4)) {
/* 133 */                           i2 = i3 * 53;
/* 135 */                           iZzc2 = zzl(obj, j);
/* 81 */                            i3 = i2 + iZzc2;
                                }
                                break;
                            case 63:
/* 118 */                       if (zzJ(obj, i5, i4)) {
/* 120 */                           i2 = i3 * 53;
/* 122 */                           iZzc2 = zzl(obj, j);
/* 81 */                            i3 = i2 + iZzc2;
                                }
                                break;
                            case 64:
/* 105 */                       if (zzJ(obj, i5, i4)) {
/* 107 */                           i2 = i3 * 53;
/* 109 */                           iZzc2 = zzl(obj, j);
/* 81 */                            i3 = i2 + iZzc2;
                                }
                                break;
                            case 65:
/* 88 */                        if (zzJ(obj, i5, i4)) {
/* 90 */                            i = i3 * 53;
/* 96 */                            iZzc = zzez.zzc(zzw(obj, j));
/* 48 */                            i3 = iZzc + i;
                                }
                                break;
                            case 66:
/* 73 */                        if (zzJ(obj, i5, i4)) {
/* 75 */                            i2 = i3 * 53;
/* 77 */                            iZzc2 = zzl(obj, j);
/* 81 */                            i3 = i2 + iZzc2;
                                }
                                break;
                            case 67:
/* 56 */                        if (zzJ(obj, i5, i4)) {
/* 58 */                            i = i3 * 53;
/* 64 */                            iZzc = zzez.zzc(zzw(obj, j));
/* 48 */                            i3 = iZzc + i;
                                }
                                break;
                            case 68:
/* 36 */                        if (zzJ(obj, i5, i4)) {
/* 38 */                            i = i3 * 53;
/* 44 */                            iZzc = zzhi.zzf(obj, j).hashCode();
/* 48 */                            i3 = iZzc + i;
                                }
                                break;
                        }
                    }
/* 592 */           return this.zzm.zza(obj).hashCode() + (i3 * 53);
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12421. Try increasing type updates limit count.
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                    */
                public final int zzb(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.auth.zzds r33) throws java.io.IOException {
                    /*
                        Method dump skipped, instruction units count: 1242
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzds):int");
                }

                @Override // com.google.android.gms.internal.auth.zzgh
                public final Object zzd() {
/* 7 */             return ((zzeu) this.zzg).zzi(4, null, null);
                }

                @Override // com.google.android.gms.internal.auth.zzgh
                public final void zze(Object obj) {
                    int i;
                    int[] iArr;
/* 1 */             int i2 = this.zzj;
                    while (true) {
/* 3 */                 i = this.zzk;
/* 5 */                 iArr = this.zzi;
/* 7 */                 if (i2 >= i) {
                            break;
                        }
/* 18 */                long jZzv = zzv(iArr[i2]) & 1048575;
/* 20 */                Object objZzf = zzhi.zzf(obj, jZzv);
/* 24 */                if (objZzf != null) {
/* 29 */                    ((zzfq) objZzf).zzc();
/* 32 */                    zzhi.zzp(obj, jZzv, objZzf);
                        }
/* 35 */                i2++;
                    }
/* 38 */            int length = iArr.length;
/* 39 */            while (i < length) {
/* 48 */                this.zzl.zza(obj, this.zzi[i]);
/* 51 */                i++;
                    }
/* 56 */            this.zzm.zze(obj);
                }

                @Override // com.google.android.gms.internal.auth.zzgh
                public final void zzf(Object obj, Object obj2) {
/* 1 */             obj2.getClass();
/* 8 */             for (int i = 0; i < this.zzc.length; i += 3) {
/* 10 */                int iZzv = zzv(i);
/* 17 */                long j = 1048575 & iZzv;
/* 21 */                int i2 = this.zzc[i];
                        switch (zzu(iZzv)) {
                            case 0:
/* 370 */                       if (zzG(obj2, i)) {
/* 376 */                           zzhi.zzl(obj, j, zzhi.zza(obj2, j));
/* 379 */                           zzD(obj, i);
                                }
                                break;
                            case 1:
/* 353 */                       if (zzG(obj2, i)) {
/* 359 */                           zzhi.zzm(obj, j, zzhi.zzb(obj2, j));
/* 362 */                           zzD(obj, i);
                                }
                                break;
                            case 2:
/* 336 */                       if (zzG(obj2, i)) {
/* 342 */                           zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
/* 345 */                           zzD(obj, i);
                                }
                                break;
                            case 3:
/* 319 */                       if (zzG(obj2, i)) {
/* 325 */                           zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
/* 328 */                           zzD(obj, i);
                                }
                                break;
                            case 4:
/* 302 */                       if (zzG(obj2, i)) {
/* 308 */                           zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
/* 311 */                           zzD(obj, i);
                                }
                                break;
                            case 5:
/* 285 */                       if (zzG(obj2, i)) {
/* 291 */                           zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
/* 294 */                           zzD(obj, i);
                                }
                                break;
                            case 6:
/* 268 */                       if (zzG(obj2, i)) {
/* 274 */                           zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
/* 277 */                           zzD(obj, i);
                                }
                                break;
                            case 7:
/* 250 */                       if (zzG(obj2, i)) {
/* 256 */                           zzhi.zzk(obj, j, zzhi.zzt(obj2, j));
/* 259 */                           zzD(obj, i);
                                }
                                break;
                            case 8:
/* 232 */                       if (zzG(obj2, i)) {
/* 238 */                           zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
/* 241 */                           zzD(obj, i);
                                }
                                break;
                            case 9:
/* 223 */                       zzB(obj, obj2, i);
                                break;
                            case 10:
/* 209 */                       if (zzG(obj2, i)) {
/* 215 */                           zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
/* 218 */                           zzD(obj, i);
                                }
                                break;
                            case 11:
/* 191 */                       if (zzG(obj2, i)) {
/* 197 */                           zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
/* 200 */                           zzD(obj, i);
                                }
                                break;
                            case 12:
/* 173 */                       if (zzG(obj2, i)) {
/* 179 */                           zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
/* 182 */                           zzD(obj, i);
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 155 */                       if (zzG(obj2, i)) {
/* 161 */                           zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
/* 164 */                           zzD(obj, i);
                                }
                                break;
                            case 14:
/* 137 */                       if (zzG(obj2, i)) {
/* 143 */                           zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
/* 146 */                           zzD(obj, i);
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 119 */                       if (zzG(obj2, i)) {
/* 125 */                           zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
/* 128 */                           zzD(obj, i);
                                }
                                break;
                            case 16:
/* 101 */                       if (zzG(obj2, i)) {
/* 107 */                           zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
/* 110 */                           zzD(obj, i);
                                }
                                break;
                            case 17:
/* 92 */                        zzB(obj, obj2, i);
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
/* 87 */                        this.zzl.zzb(obj, obj2, j);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 80 */                        zzgj.zzi(this.zzp, obj, obj2, j);
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
/* 64 */                        if (zzJ(obj2, i2, i)) {
/* 70 */                            zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
/* 73 */                            zzE(obj, i2, i);
                                }
                                break;
                            case 60:
/* 55 */                        zzC(obj, obj2, i);
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
/* 41 */                        if (zzJ(obj2, i2, i)) {
/* 47 */                            zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
/* 50 */                            zzE(obj, i2, i);
                                }
                                break;
                            case 68:
/* 32 */                        zzC(obj, obj2, i);
                                break;
                        }
                    }
/* 388 */           zzgj.zzf(this.zzm, obj, obj2);
                }

                @Override // com.google.android.gms.internal.auth.zzgh
                public final void zzg(Object obj, byte[] bArr, int i, int i2, zzds zzdsVar) throws IOException {
/* 3 */             if (this.zzh) {
/* 5 */                 zzo(obj, bArr, i, i2, zzdsVar);
                    } else {
/* 16 */                zzb(obj, bArr, i, i2, 0, zzdsVar);
                    }
                }

                @Override // com.google.android.gms.internal.auth.zzgh
                public final boolean zzh(Object obj, Object obj2) {
                    boolean zZzh;
/* 3 */             int length = this.zzc.length;
/* 6 */             for (int i = 0; i < length; i += 3) {
/* 8 */                 int iZzv = zzv(i);
/* 15 */                long j = iZzv & 1048575;
                        switch (zzu(iZzv)) {
                            case 0:
/* 427 */                       if (!zzF(obj, obj2, i) || Double.doubleToLongBits(zzhi.zza(obj, j)) != Double.doubleToLongBits(zzhi.zza(obj2, j))) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 1:
/* 402 */                       if (!zzF(obj, obj2, i) || Float.floatToIntBits(zzhi.zzb(obj, j)) != Float.floatToIntBits(zzhi.zzb(obj2, j))) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 2:
/* 383 */                       if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 3:
/* 364 */                       if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 4:
/* 347 */                       if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 5:
/* 328 */                       if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 6:
/* 310 */                       if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 7:
/* 292 */                       if (!zzF(obj, obj2, i) || zzhi.zzt(obj, j) != zzhi.zzt(obj2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 8:
/* 270 */                       if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 9:
/* 248 */                       if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 10:
/* 226 */                       if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 11:
/* 208 */                       if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 12:
/* 190 */                       if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 172 */                       if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 14:
/* 152 */                       if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 134 */                       if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 16:
/* 114 */                       if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 17:
/* 92 */                        if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
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
/* 80 */                        zZzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 67 */                        zZzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
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
/* 31 */                        long jZzs = zzs(i) & 1048575;
/* 41 */                        if (zzhi.zzc(obj, jZzs) != zzhi.zzc(obj2, jZzs) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
/* 4 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            default:
                                continue;
                                break;
                        }
/* 84 */                if (!zZzh) {
/* 4 */                     return false;
                        }
                    }
                    return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
                }

                /* JADX WARN: Code duplicated, block: B:42:0x008d  */
                /* JADX WARN: Code duplicated, block: B:44:0x009c  */
                /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
                /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:62:0x00b1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:66:0x00c6 A[SYNTHETIC] */
                @Override // com.google.android.gms.internal.auth.zzgh
                public final boolean zzi(Object obj) {
                    int i;
                    int i2;
                    List list;
                    zzgh zzghVarZzy;
                    int i3;
/* 5 */             int i4 = 1048575;
/* 6 */             int i5 = 0;
/* 7 */             int i6 = 0;
/* 11 */            while (i5 < this.zzj) {
/* 15 */                int i7 = this.zzi[i5];
/* 19 */                int i8 = this.zzc[i7];
/* 21 */                int iZzv = this.zzv(i7);
/* 29 */                int i9 = this.zzc[i7 + 2];
/* 31 */                int i10 = i9 & 1048575;
/* 35 */                int i11 = 1 << (i9 >>> 20);
/* 37 */                if (i10 != i4) {
/* 39 */                    if (i10 != 1048575) {
/* 44 */                        i6 = zzb.getInt(obj, i10);
                            }
/* 48 */                    i2 = i6;
/* 49 */                    i = i10;
                        } else {
/* 51 */                    i = i4;
/* 52 */                    i2 = i6;
                        }
/* 56 */                zzfz<T> zzfzVar = this;
/* 57 */                Object obj2 = obj;
/* 58 */                if ((268435456 & iZzv) != 0 && !zzfzVar.zzH(obj2, i7, i, i2, i11)) {
/* 4 */                     return false;
                        }
/* 68 */                int iZzu = zzu(iZzv);
/* 74 */                if (iZzu == 9 || iZzu == 17) {
/* 186 */                   if (zzfzVar.zzH(obj2, i7, i, i2, i11) && !zzI(obj2, iZzv, zzfzVar.zzy(i7))) {
/* 4 */                         return false;
                            }
                        } else if (iZzu == 27) {
/* 149 */                   list = (List) zzhi.zzf(obj2, iZzv & 1048575);
/* 155 */                   if (list.isEmpty()) {
                                continue;
                            } else {
/* 157 */                       zzghVarZzy = zzfzVar.zzy(i7);
/* 166 */                       for (i3 = 0; i3 < list.size(); i3++) {
/* 176 */                           if (!zzghVarZzy.zzi(list.get(i3))) {
/* 4 */                                 return false;
                                    }
                                }
                            }
                        } else if (iZzu == 60 || iZzu == 68) {
/* 129 */                   if (zzfzVar.zzJ(obj2, i8, i7) && !zzI(obj2, iZzv, zzfzVar.zzy(i7))) {
/* 4 */                         return false;
                            }
                        } else if (iZzu == 49) {
/* 149 */                   list = (List) zzhi.zzf(obj2, iZzv & 1048575);
/* 155 */                   if (list.isEmpty()) {
/* 157 */                       zzghVarZzy = zzfzVar.zzy(i7);
/* 166 */                       while (i3 < list.size()) {
/* 176 */                           if (!zzghVarZzy.zzi(list.get(i3))) {
/* 4 */                                 return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (iZzu == 50 && !((zzfq) zzhi.zzf(obj2, iZzv & 1048575)).isEmpty()) {
/* 124 */                   throw null;
                        }
/* 199 */               i5++;
/* 201 */               this = zzfzVar;
/* 202 */               obj = obj2;
/* 203 */               i4 = i;
/* 204 */               i6 = i2;
                    }
/* 10 */            return true;
                }
            }
