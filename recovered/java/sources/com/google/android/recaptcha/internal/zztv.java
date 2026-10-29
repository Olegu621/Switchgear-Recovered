            package com.google.android.recaptcha.internal;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.io.IOException;
            import java.lang.reflect.Field;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            import p000.AbstractC0208c9;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.f42;
            import p000.pk3;
            import p000.pm2;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zztv<T> implements zzug<T> {
                private static final int[] zza = new int[0];
                private static final Unsafe zzb = zzvc.zzg();
                private final int[] zzc;
                private final Object[] zzd;
                private final int zze;
                private final int zzf;
                private final zzts zzg;
                private final boolean zzh;
                private final boolean zzi;
                private final int[] zzj;
                private final int zzk;
                private final int zzl;
                private final zzuv zzm;
                private final zzrz zzn;

                private zztv(int[] iArr, Object[] objArr, int i, int i2, zzts zztsVar, boolean z, int[] iArr2, int i3, int i4, zzty zztyVar, zztf zztfVar, zzuv zzuvVar, zzrz zzrzVar, zztn zztnVar) {
/* 4 */             this.zzc = iArr;
/* 6 */             this.zzd = objArr;
/* 8 */             this.zze = i;
/* 10 */            this.zzf = i2;
/* 14 */            this.zzi = zztsVar instanceof zzsn;
/* 16 */            boolean z2 = false;
/* 17 */            if (zzrzVar != null && (zztsVar instanceof zzsk)) {
/* 23 */                z2 = true;
                    }
/* 24 */            this.zzh = z2;
/* 26 */            this.zzj = iArr2;
/* 28 */            this.zzk = i3;
/* 30 */            this.zzl = i4;
/* 32 */            this.zzm = zzuvVar;
/* 34 */            this.zzn = zzrzVar;
/* 36 */            this.zzg = zztsVar;
                }

                private final Object zzA(Object obj, int i) {
/* 1 */             zzug zzugVarZzx = zzx(i);
/* 12 */            int iZzu = zzu(i) & 1048575;
/* 17 */            if (!zzN(obj, i)) {
/* 19 */                return zzugVarZzx.zze();
                    }
/* 27 */            Object object = zzb.getObject(obj, iZzu);
/* 35 */            if (zzQ(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZze = zzugVarZzx.zze();
/* 42 */            if (object != null) {
/* 44 */                zzugVarZzx.zzg(objZze, object);
                    }
/* 47 */            return objZze;
                }

                private final Object zzB(Object obj, int i, int i2) {
/* 1 */             zzug zzugVarZzx = zzx(i2);
/* 9 */             if (!zzR(obj, i, i2)) {
/* 11 */                return zzugVarZzx.zze();
                    }
/* 27 */            Object object = zzb.getObject(obj, zzu(i2) & 1048575);
/* 35 */            if (zzQ(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZze = zzugVarZzx.zze();
/* 42 */            if (object != null) {
/* 44 */                zzugVarZzx.zzg(objZze, object);
                    }
/* 47 */            return objZze;
                }

                private static Field zzC(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (NoSuchFieldException e) {
/* 7 */                 Field[] declaredFields = cls.getDeclaredFields();
/* 13 */                for (Field field : declaredFields) {
/* 25 */                    if (str.equals(field.getName())) {
/* 27 */                        return field;
                            }
                        }
/* 33 */                String name = cls.getName();
/* 37 */                String string = Arrays.toString(declaredFields);
/* 47 */                StringBuilder sbM3514r = AbstractC0886en.m3514r("Field ", str, " for ", name, " not found. Known fields are ");
/* 51 */                sbM3514r.append(string);
/* 61 */                throw new RuntimeException(sbM3514r.toString(), e);
                    }
                }

                private static void zzD(Object obj) {
/* 5 */             if (zzQ(obj)) {
/* 7 */                 return;
                    }
/* 18 */            C1951n4.m6859j("Mutating immutable message: ".concat(String.valueOf(obj)));
                }

                private final void zzE(Object obj, Object obj2, int i) {
/* 5 */             if (zzN(obj2, i)) {
/* 15 */                int iZzu = zzu(i) & 1048575;
/* 16 */                Unsafe unsafe = zzb;
                        long j = iZzu;
/* 19 */                Object object = unsafe.getObject(obj2, j);
/* 23 */                if (object == null) {
/* 88 */                    pk3.m7468d(this.zzc[i], obj2);
/* 91 */                    return;
                        }
/* 25 */                zzug zzugVarZzx = zzx(i);
/* 33 */                if (!zzN(obj, i)) {
/* 39 */                    if (zzQ(object)) {
/* 45 */                        Object objZze = zzugVarZzx.zze();
/* 49 */                        zzugVarZzx.zzg(objZze, object);
/* 52 */                        unsafe.putObject(obj, j, objZze);
                            } else {
/* 41 */                        unsafe.putObject(obj, j, object);
                            }
/* 55 */                    zzH(obj, i);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, j);
/* 67 */                if (!zzQ(object2)) {
/* 69 */                    Object objZze2 = zzugVarZzx.zze();
/* 73 */                    zzugVarZzx.zzg(objZze2, object2);
/* 76 */                    unsafe.putObject(obj, j, objZze2);
/* 79 */                    object2 = objZze2;
                        }
/* 80 */                zzugVarZzx.zzg(object2, object);
                    }
                }

                private final void zzF(Object obj, Object obj2, int i) {
/* 1 */             int[] iArr = this.zzc;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (zzR(obj2, i2, i)) {
/* 19 */                int iZzu = zzu(i) & 1048575;
/* 20 */                Unsafe unsafe = zzb;
                        long j = iZzu;
/* 23 */                Object object = unsafe.getObject(obj2, j);
/* 27 */                if (object == null) {
/* 90 */                    pk3.m7468d(iArr[i], obj2);
/* 93 */                    return;
                        }
/* 29 */                zzug zzugVarZzx = zzx(i);
/* 37 */                if (!zzR(obj, i2, i)) {
/* 43 */                    if (zzQ(object)) {
/* 49 */                        Object objZze = zzugVarZzx.zze();
/* 53 */                        zzugVarZzx.zzg(objZze, object);
/* 56 */                        unsafe.putObject(obj, j, objZze);
                            } else {
/* 45 */                        unsafe.putObject(obj, j, object);
                            }
/* 59 */                    zzI(obj, i2, i);
/* 62 */                    return;
                        }
/* 63 */                Object object2 = unsafe.getObject(obj, j);
/* 71 */                if (!zzQ(object2)) {
/* 73 */                    Object objZze2 = zzugVarZzx.zze();
/* 77 */                    zzugVarZzx.zzg(objZze2, object2);
/* 80 */                    unsafe.putObject(obj, j, objZze2);
/* 83 */                    object2 = objZze2;
                        }
/* 84 */                zzugVarZzx.zzg(object2, object);
                    }
                }

                private final void zzG(Object obj, int i, zzuf zzufVar) throws IOException {
/* 8 */             long j = i & 1048575;
/* 10 */            if (zzM(i)) {
/* 16 */                zzvc.zzs(obj, j, zzufVar.zzs());
                    } else if (this.zzi) {
/* 28 */                zzvc.zzs(obj, j, zzufVar.zzr());
                    } else {
/* 36 */                zzvc.zzs(obj, j, zzufVar.zzp());
                    }
                }

                private final void zzH(Object obj, int i) {
/* 1 */             int iZzr = zzr(i);
/* 8 */             long j = 1048575 & iZzr;
/* 15 */            if (j == 1048575) {
/* 17 */                return;
                    }
/* 28 */            zzvc.zzq(obj, j, (1 << (iZzr >>> 20)) | zzvc.zzc(obj, j));
                }

                private final void zzI(Object obj, int i, int i2) {
/* 10 */            zzvc.zzq(obj, zzr(i2) & 1048575, i);
                }

                private final void zzJ(Object obj, int i, Object obj2) {
/* 12 */            zzb.putObject(obj, zzu(i) & 1048575, obj2);
/* 15 */            zzH(obj, i);
                }

                private final void zzK(Object obj, int i, int i2, Object obj2) {
/* 12 */            zzb.putObject(obj, zzu(i2) & 1048575, obj2);
/* 15 */            zzI(obj, i, i2);
                }

                private final boolean zzL(Object obj, Object obj2, int i) {
                    return zzN(obj, i) == zzN(obj2, i);
                }

                private static boolean zzM(int i) {
                    return (i & 536870912) != 0;
                }

                private final boolean zzN(Object obj, int i) {
/* 1 */             int iZzr = zzr(i);
/* 8 */             long j = iZzr & 1048575;
/* 18 */            if (j != 1048575) {
                        return ((1 << (iZzr >>> 20)) & zzvc.zzc(obj, j)) != 0;
                    }
/* 20 */            int iZzu = zzu(i);
/* 24 */            long j2 = iZzu & 1048575;
                    switch (zzt(iZzu)) {
                        case 0:
                            return Double.doubleToRawLongBits(zzvc.zza(obj, j2)) != 0;
                        case 1:
                            return Float.floatToRawIntBits(zzvc.zzb(obj, j2)) != 0;
                        case 2:
                            return zzvc.zzd(obj, j2) != 0;
                        case 3:
                            return zzvc.zzd(obj, j2) != 0;
                        case 4:
                            return zzvc.zzc(obj, j2) != 0;
                        case 5:
                            return zzvc.zzd(obj, j2) != 0;
                        case 6:
                            return zzvc.zzc(obj, j2) != 0;
                        case 7:
/* 158 */                   return zzvc.zzw(obj, j2);
                        case 8:
/* 122 */                   Object objZzf = zzvc.zzf(obj, j2);
/* 128 */                   if (objZzf instanceof String) {
                                return !((String) objZzf).isEmpty();
                            }
/* 142 */                   if (objZzf instanceof zzqm) {
                                return !zzqm.zzb.equals(objZzf);
                            }
/* 154 */                   f42.m3649e();
/* 16 */                    return false;
                        case 9:
                            return zzvc.zzf(obj, j2) != null;
                        case 10:
                            return !zzqm.zzb.equals(zzvc.zzf(obj, j2));
                        case 11:
                            return zzvc.zzc(obj, j2) != 0;
                        case 12:
                            return zzvc.zzc(obj, j2) != 0;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                            return zzvc.zzc(obj, j2) != 0;
                        case 14:
                            return zzvc.zzd(obj, j2) != 0;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                            return zzvc.zzc(obj, j2) != 0;
                        case 16:
                            return zzvc.zzd(obj, j2) != 0;
                        case 17:
                            return zzvc.zzf(obj, j2) != null;
                        default:
/* 36 */                    f42.m3649e();
/* 16 */                    return false;
                    }
                }

                private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
/* 4 */             if (i2 == 1048575) {
/* 6 */                 return zzN(obj, i);
                    }
                    return (i3 & i4) != 0;
                }

                private static boolean zzP(Object obj, int i, zzug zzugVar) {
/* 10 */            return zzugVar.zzl(zzvc.zzf(obj, i & 1048575));
                }

                private static boolean zzQ(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof zzsn) {
/* 11 */                return ((zzsn) obj).zzL();
                    }
/* 16 */            return true;
                }

                private final boolean zzR(Object obj, int i, int i2) {
                    return zzvc.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
                }

                private static boolean zzS(Object obj, long j) {
/* 7 */             return ((Boolean) zzvc.zzf(obj, j)).booleanValue();
                }

                private static final void zzT(int i, Object obj, zzvi zzviVar) throws IOException {
/* 3 */             if (obj instanceof String) {
/* 7 */                 zzviVar.zzG(i, (String) obj);
                    } else {
/* 13 */                zzviVar.zzd(i, (zzqm) obj);
                    }
                }

                public static zzuw zzd(Object obj) {
/* 1 */             zzsn zzsnVar = (zzsn) obj;
/* 3 */             zzuw zzuwVar = zzsnVar.zzc;
/* 9 */             if (zzuwVar != zzuw.zzc()) {
/* 17 */                return zzuwVar;
                    }
/* 11 */            zzuw zzuwVarZzf = zzuw.zzf();
/* 15 */            zzsnVar.zzc = zzuwVarZzf;
/* 17 */            return zzuwVarZzf;
                }

                /* JADX WARN: Code duplicated, block: B:187:0x03c3  */
                /* JADX WARN: Code duplicated, block: B:193:0x03e2  */
                public static zztv zzm(Class cls, zztp zztpVar, zzty zztyVar, zztf zztfVar, zzuv zzuvVar, zzrz zzrzVar, zztn zztnVar) {
                    int i;
                    int iCharAt;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int[] iArr;
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
                    zzue zzueVar;
                    int i17;
                    Object[] objArr;
                    int i18;
                    int iObjectFieldOffset;
                    int iObjectFieldOffset2;
                    char c;
                    int i19;
                    int i20;
                    int i21;
                    int i22;
                    int i23;
                    int i24;
                    Field fieldZzC;
                    char cCharAt9;
                    int i25;
                    int i26;
                    int i27;
                    int i28;
                    int i29;
                    Field fieldZzC2;
                    Field fieldZzC3;
                    int i30;
                    char cCharAt10;
                    int i31;
                    int i32;
                    char cCharAt11;
                    int i33;
                    char cCharAt12;
                    int i34;
                    char cCharAt13;
/* 5 */             if (!(zztpVar instanceof zzue)) {
/* 1098 */              throw null;
                    }
/* 7 */             zzue zzueVar2 = (zzue) zztpVar;
/* 9 */             String strZzd = zzueVar2.zzd();
/* 13 */            int length = strZzd.length();
/* 22 */            char c2 = 55296;
/* 25 */            if (strZzd.charAt(0) >= 55296) {
/* 27 */                int i35 = 1;
                        while (true) {
/* 28 */                    i = i35 + 1;
/* 34 */                    if (strZzd.charAt(i35) < 55296) {
                                break;
                            }
/* 36 */                    i35 = i;
                        }
                    } else {
/* 38 */                i = 1;
                    }
/* 39 */            int i36 = i + 1;
/* 41 */            int iCharAt2 = strZzd.charAt(i);
/* 45 */            if (iCharAt2 >= 55296) {
/* 47 */                int i37 = iCharAt2 & 8191;
/* 49 */                int i38 = 13;
                        while (true) {
/* 51 */                    i34 = i36 + 1;
/* 53 */                    cCharAt13 = strZzd.charAt(i36);
/* 57 */                    if (cCharAt13 < 55296) {
                                break;
                            }
/* 62 */                    i37 |= (cCharAt13 & 8191) << i38;
/* 63 */                    i38 += 13;
/* 65 */                    i36 = i34;
                        }
/* 68 */                iCharAt2 = i37 | (cCharAt13 << i38);
/* 69 */                i36 = i34;
                    }
/* 70 */            if (iCharAt2 == 0) {
/* 74 */                i3 = 0;
/* 75 */                i6 = 0;
/* 76 */                iCharAt = 0;
/* 77 */                i2 = 0;
/* 78 */                i4 = 0;
/* 79 */                i5 = 0;
/* 72 */                iArr = zza;
/* 83 */                i7 = 0;
                    } else {
/* 87 */                int i39 = i36 + 1;
/* 89 */                int iCharAt3 = strZzd.charAt(i36);
/* 93 */                if (iCharAt3 >= 55296) {
/* 95 */                    int i40 = iCharAt3 & 8191;
/* 97 */                    int i41 = 13;
                            while (true) {
/* 99 */                        i15 = i39 + 1;
/* 101 */                       cCharAt8 = strZzd.charAt(i39);
/* 105 */                       if (cCharAt8 < 55296) {
                                    break;
                                }
/* 110 */                       i40 |= (cCharAt8 & 8191) << i41;
/* 111 */                       i41 += 13;
/* 113 */                       i39 = i15;
                            }
/* 116 */                   iCharAt3 = i40 | (cCharAt8 << i41);
/* 117 */                   i39 = i15;
                        }
/* 118 */               int i42 = i39 + 1;
/* 120 */               int iCharAt4 = strZzd.charAt(i39);
/* 124 */               if (iCharAt4 >= 55296) {
/* 126 */                   int i43 = iCharAt4 & 8191;
/* 128 */                   int i44 = 13;
                            while (true) {
/* 130 */                       i14 = i42 + 1;
/* 132 */                       cCharAt7 = strZzd.charAt(i42);
/* 136 */                       if (cCharAt7 < 55296) {
                                    break;
                                }
/* 141 */                       i43 |= (cCharAt7 & 8191) << i44;
/* 142 */                       i44 += 13;
/* 144 */                       i42 = i14;
                            }
/* 147 */                   iCharAt4 = i43 | (cCharAt7 << i44);
/* 148 */                   i42 = i14;
                        }
/* 149 */               int i45 = i42 + 1;
/* 151 */               int iCharAt5 = strZzd.charAt(i42);
/* 155 */               if (iCharAt5 >= 55296) {
/* 157 */                   int i46 = iCharAt5 & 8191;
/* 159 */                   int i47 = 13;
                            while (true) {
/* 161 */                       i13 = i45 + 1;
/* 163 */                       cCharAt6 = strZzd.charAt(i45);
/* 167 */                       if (cCharAt6 < 55296) {
                                    break;
                                }
/* 172 */                       i46 |= (cCharAt6 & 8191) << i47;
/* 173 */                       i47 += 13;
/* 175 */                       i45 = i13;
                            }
/* 178 */                   iCharAt5 = i46 | (cCharAt6 << i47);
/* 179 */                   i45 = i13;
                        }
/* 180 */               int i48 = i45 + 1;
/* 182 */               int iCharAt6 = strZzd.charAt(i45);
/* 186 */               if (iCharAt6 >= 55296) {
/* 188 */                   int i49 = iCharAt6 & 8191;
/* 190 */                   int i50 = 13;
                            while (true) {
/* 192 */                       i12 = i48 + 1;
/* 194 */                       cCharAt5 = strZzd.charAt(i48);
/* 198 */                       if (cCharAt5 < 55296) {
                                    break;
                                }
/* 203 */                       i49 |= (cCharAt5 & 8191) << i50;
/* 204 */                       i50 += 13;
/* 206 */                       i48 = i12;
                            }
/* 209 */                   iCharAt6 = i49 | (cCharAt5 << i50);
/* 210 */                   i48 = i12;
                        }
/* 211 */               int i51 = i48 + 1;
/* 213 */               iCharAt = strZzd.charAt(i48);
/* 217 */               if (iCharAt >= 55296) {
/* 219 */                   int i52 = iCharAt & 8191;
/* 221 */                   int i53 = 13;
                            while (true) {
/* 223 */                       i11 = i51 + 1;
/* 225 */                       cCharAt4 = strZzd.charAt(i51);
/* 229 */                       if (cCharAt4 < 55296) {
                                    break;
                                }
/* 234 */                       i52 |= (cCharAt4 & 8191) << i53;
/* 235 */                       i53 += 13;
/* 237 */                       i51 = i11;
                            }
/* 240 */                   iCharAt = i52 | (cCharAt4 << i53);
/* 241 */                   i51 = i11;
                        }
/* 242 */               int i54 = i51 + 1;
/* 244 */               int iCharAt7 = strZzd.charAt(i51);
/* 248 */               if (iCharAt7 >= 55296) {
/* 250 */                   int i55 = iCharAt7 & 8191;
/* 252 */                   int i56 = 13;
                            while (true) {
/* 254 */                       i10 = i54 + 1;
/* 256 */                       cCharAt3 = strZzd.charAt(i54);
/* 260 */                       if (cCharAt3 < 55296) {
                                    break;
                                }
/* 265 */                       i55 |= (cCharAt3 & 8191) << i56;
/* 266 */                       i56 += 13;
/* 268 */                       i54 = i10;
                            }
/* 271 */                   iCharAt7 = i55 | (cCharAt3 << i56);
/* 272 */                   i54 = i10;
                        }
/* 273 */               int i57 = i54 + 1;
/* 275 */               int iCharAt8 = strZzd.charAt(i54);
/* 279 */               if (iCharAt8 >= 55296) {
/* 281 */                   int i58 = iCharAt8 & 8191;
/* 283 */                   int i59 = 13;
                            while (true) {
/* 285 */                       i9 = i57 + 1;
/* 287 */                       cCharAt2 = strZzd.charAt(i57);
/* 291 */                       if (cCharAt2 < 55296) {
                                    break;
                                }
/* 296 */                       i58 |= (cCharAt2 & 8191) << i59;
/* 297 */                       i59 += 13;
/* 299 */                       i57 = i9;
                            }
/* 303 */                   iCharAt8 = i58 | (cCharAt2 << i59);
/* 304 */                   i57 = i9;
                        }
/* 306 */               int i60 = i57 + 1;
/* 308 */               int iCharAt9 = strZzd.charAt(i57);
/* 312 */               if (iCharAt9 >= 55296) {
/* 314 */                   int i61 = iCharAt9 & 8191;
/* 316 */                   int i62 = 13;
                            while (true) {
/* 318 */                       i8 = i60 + 1;
/* 320 */                       cCharAt = strZzd.charAt(i60);
/* 324 */                       if (cCharAt < 55296) {
                                    break;
                                }
/* 330 */                       i61 |= (cCharAt & 8191) << i62;
/* 331 */                       i62 += 13;
/* 333 */                       i60 = i8;
                            }
/* 338 */                   iCharAt9 = i61 | (cCharAt << i62);
/* 339 */                   i60 = i8;
                        }
/* 347 */               int i63 = iCharAt3 + iCharAt3 + iCharAt4;
/* 349 */               int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
/* 351 */               int i64 = iCharAt7;
/* 352 */               i2 = iCharAt5;
/* 353 */               i3 = i64;
/* 354 */               i4 = iCharAt6;
/* 355 */               i5 = iCharAt9;
/* 357 */               i6 = i63;
/* 359 */               iArr = iArr2;
/* 361 */               i7 = iCharAt3;
/* 362 */               i36 = i60;
                    }
/* 363 */           Unsafe unsafe = zzb;
/* 365 */           Object[] objArrZze = zzueVar2.zze();
/* 373 */           Class<?> cls2 = zzueVar2.zza().getClass();
/* 377 */           int i65 = i5 + i3;
/* 379 */           int i66 = iCharAt + iCharAt;
/* 383 */           int[] iArr3 = new int[iCharAt * 3];
/* 385 */           Object[] objArr2 = new Object[i66];
/* 387 */           int i67 = i5;
/* 389 */           int i68 = i65;
/* 391 */           int i69 = 0;
/* 392 */           int i70 = 0;
/* 394 */           while (i36 < length) {
/* 396 */               int i71 = i36 + 1;
/* 398 */               int iCharAt10 = strZzd.charAt(i36);
/* 402 */               if (iCharAt10 >= c2) {
/* 404 */                   int i72 = iCharAt10 & 8191;
/* 406 */                   int i73 = i71;
/* 408 */                   int i74 = 13;
                            while (true) {
/* 410 */                       i33 = i73 + 1;
/* 412 */                       cCharAt12 = strZzd.charAt(i73);
/* 416 */                       if (cCharAt12 < c2) {
                                    break;
                                }
/* 422 */                       i72 |= (cCharAt12 & 8191) << i74;
/* 423 */                       i74 += 13;
/* 425 */                       i73 = i33;
                            }
/* 430 */                   iCharAt10 = i72 | (cCharAt12 << i74);
/* 431 */                   i16 = i33;
                        } else {
/* 434 */                   i16 = i71;
                        }
/* 436 */               int i75 = i16 + 1;
/* 438 */               int iCharAt11 = strZzd.charAt(i16);
/* 442 */               if (iCharAt11 >= c2) {
/* 444 */                   int i76 = iCharAt11 & 8191;
/* 446 */                   int i77 = i75;
/* 448 */                   int i78 = 13;
                            while (true) {
/* 450 */                       i32 = i77 + 1;
/* 452 */                       cCharAt11 = strZzd.charAt(i77);
/* 456 */                       zzueVar = zzueVar2;
/* 461 */                       if (cCharAt11 < 55296) {
                                    break;
                                }
/* 467 */                       i76 |= (cCharAt11 & 8191) << i78;
/* 468 */                       i78 += 13;
/* 470 */                       i77 = i32;
/* 472 */                       zzueVar2 = zzueVar;
                            }
/* 477 */                   iCharAt11 = i76 | (cCharAt11 << i78);
/* 478 */                   i17 = i32;
                        } else {
/* 481 */                   zzueVar = zzueVar2;
/* 483 */                   i17 = i75;
                        }
/* 487 */               if ((iCharAt11 & Segment.SHARE_MINIMUM) != 0) {
/* 491 */                   iArr[i70] = i69;
/* 489 */                   i70++;
                        }
/* 495 */               int i79 = iCharAt11 & 255;
/* 497 */               int i80 = length;
/* 499 */               int i81 = iCharAt11 & 2048;
/* 505 */               if (i79 >= 51) {
/* 507 */                   int i82 = i17 + 1;
/* 509 */                   int iCharAt12 = strZzd.charAt(i17);
/* 518 */                   if (iCharAt12 >= 55296) {
/* 520 */                       int i83 = iCharAt12 & 8191;
/* 522 */                       int i84 = i82;
/* 524 */                       int i85 = 13;
                                while (true) {
/* 526 */                           i30 = i84 + 1;
/* 528 */                           cCharAt10 = strZzd.charAt(i84);
/* 532 */                           i31 = i83;
/* 537 */                           if (cCharAt10 < 55296) {
                                        break;
                                    }
/* 543 */                           i83 = i31 | ((cCharAt10 & 8191) << i85);
/* 545 */                           i85 += 13;
/* 547 */                           i84 = i30;
                                }
/* 552 */                       iCharAt12 = i31 | (cCharAt10 << i85);
/* 554 */                       i28 = i30;
                            } else {
/* 557 */                       i28 = i82;
                            }
/* 559 */                   int i86 = iCharAt12;
/* 561 */                   int i87 = i79 - 51;
/* 563 */                   int i88 = i28;
/* 567 */                   if (i87 == 9 || i87 == 17) {
/* 618 */                       objArr2[pm2.m7483f(i69, 3, 1)] = objArrZze[i6];
/* 620 */                       i29 = i81;
/* 610 */                       i6++;
                            } else if (i87 != 12) {
/* 607 */                       i29 = i81;
                            } else if (zzueVar.zzc() == 1 || i81 != 0) {
/* 603 */                       objArr2[pm2.m7483f(i69, 3, 1)] = objArrZze[i6];
/* 592 */                       i6++;
/* 607 */                       i29 = i81;
                            } else {
/* 590 */                       i29 = 0;
                            }
/* 624 */                   int i89 = i86 + i86;
/* 628 */                   Object obj = objArrZze[i89];
/* 630 */                   int i90 = i29;
/* 634 */                   if (obj instanceof Field) {
/* 636 */                       fieldZzC2 = (Field) obj;
                            } else {
/* 644 */                       fieldZzC2 = zzC(cls2, (String) obj);
/* 648 */                       objArrZze[i89] = fieldZzC2;
                            }
/* 638 */                   Object[] objArr3 = objArr2;
/* 639 */                   int i91 = i6;
/* 655 */                   int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC2);
/* 656 */                   int i92 = i89 + 1;
/* 658 */                   Object obj2 = objArrZze[i92];
/* 664 */                   if (obj2 instanceof Field) {
/* 666 */                       fieldZzC3 = (Field) obj2;
                            } else {
/* 671 */                       fieldZzC3 = zzC(cls2, (String) obj2);
/* 675 */                       objArrZze[i92] = fieldZzC3;
                            }
/* 681 */                   int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzC3);
/* 684 */                   i7 = i7;
/* 686 */                   i23 = i91;
/* 687 */                   i69 = i69;
/* 688 */                   c = 55296;
/* 691 */                   iObjectFieldOffset2 = iObjectFieldOffset4;
/* 692 */                   i22 = iObjectFieldOffset3;
/* 694 */                   i81 = i90;
/* 696 */                   i18 = iCharAt10;
/* 698 */                   i36 = i88;
/* 700 */                   objArr = objArr3;
/* 702 */                   i21 = 0;
                        } else {
/* 705 */                   Object[] objArr4 = objArr2;
/* 706 */                   int i93 = i6 + 1;
/* 710 */                   objArr = objArr4;
/* 716 */                   Field fieldZzC4 = zzC(cls2, (String) objArrZze[i6]);
/* 720 */                   i18 = iCharAt10;
/* 724 */                   if (i79 == 9 || i79 == 17) {
/* 730 */                       i7 = i7;
/* 867 */                       objArr[pm2.m7483f(i69, 3, 1)] = fieldZzC4.getType();
                            } else {
/* 738 */                       if (i79 != 27) {
/* 742 */                           if (i79 == 49) {
/* 744 */                               i27 = i6 + 2;
/* 748 */                               i25 = 3;
/* 749 */                               i26 = 1;
                                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
/* 817 */                               i7 = i7;
/* 820 */                               if (zzueVar.zzc() == 1 || i81 != 0) {
/* 830 */                                   i27 = i6 + 2;
/* 839 */                                   objArr[pm2.m7483f(i69, 3, 1)] = objArrZze[i93];
/* 841 */                                   i93 = i27;
                                        } else {
/* 825 */                                   i69 = i69;
/* 827 */                                   i81 = 0;
                                        }
                                    } else if (i79 == 50) {
/* 769 */                               int i94 = i6 + 2;
/* 771 */                               i67++;
/* 773 */                               iArr[i67] = i69;
/* 775 */                               int i95 = i69 / 3;
/* 779 */                               int i96 = i95 + i95;
/* 781 */                               objArr[i96] = objArrZze[i93];
/* 783 */                               if (i81 != 0) {
/* 787 */                                   i93 = i6 + 3;
/* 791 */                                   objArr[i96 + 1] = objArrZze[i94];
                                        } else {
/* 800 */                                   i93 = i94;
/* 805 */                                   i81 = 0;
                                        }
/* 797 */                               i7 = i7;
                                    } else {
/* 808 */                               i7 = i7;
                                    }
/* 874 */                           iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
/* 877 */                           iObjectFieldOffset2 = 1048575;
/* 880 */                           if ((iCharAt11 & 4096) != 0 || i79 > 17) {
/* 965 */                               c = 55296;
/* 968 */                               i19 = i17;
/* 969 */                               i20 = 0;
                                    } else {
/* 886 */                               int i97 = i17 + 1;
/* 888 */                               int iCharAt13 = strZzd.charAt(i17);
/* 895 */                               if (iCharAt13 >= 55296) {
/* 897 */                                   int i98 = iCharAt13 & 8191;
/* 899 */                                   int i99 = 13;
                                            while (true) {
/* 901 */                                       i24 = i97 + 1;
/* 903 */                                       cCharAt9 = strZzd.charAt(i97);
/* 907 */                                       if (cCharAt9 < 55296) {
                                                    break;
                                                }
/* 913 */                                       i98 |= (cCharAt9 & 8191) << i99;
/* 914 */                                       i99 += 13;
/* 916 */                                       i97 = i24;
                                            }
/* 921 */                                   iCharAt13 = i98 | (cCharAt9 << i99);
                                        } else {
/* 923 */                                   i24 = i97;
                                        }
/* 929 */                               int i100 = (iCharAt13 / 32) + i7 + i7;
/* 931 */                               Object obj3 = objArrZze[i100];
/* 935 */                               if (obj3 instanceof Field) {
/* 937 */                                   fieldZzC = (Field) obj3;
                                        } else {
/* 943 */                                   fieldZzC = zzC(cls2, (String) obj3);
/* 947 */                                   objArrZze[i100] = fieldZzC;
                                        }
/* 955 */                               i20 = iCharAt13 % 32;
/* 954 */                               iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC);
/* 958 */                               i19 = i24;
/* 960 */                               c = 55296;
                                    }
/* 972 */                           if (i79 >= 18 || i79 > 49) {
/* 997 */                               i21 = i20;
/* 998 */                               i22 = iObjectFieldOffset;
/* 1000 */                              int i101 = i19;
/* 1002 */                              i23 = i93;
/* 1003 */                              i36 = i101;
                                    } else {
/* 978 */                               int i102 = i68 + 1;
/* 980 */                               iArr[i68] = iObjectFieldOffset;
/* 984 */                               i21 = i20;
/* 985 */                               i22 = iObjectFieldOffset;
/* 987 */                               int i103 = i19;
/* 989 */                               i23 = i93;
/* 990 */                               i36 = i103;
/* 992 */                               i68 = i102;
                                    }
                                } else {
/* 846 */                           i25 = 3;
/* 847 */                           i26 = 1;
/* 848 */                           i27 = i6 + 2;
                                }
/* 856 */                       objArr[pm2.m7483f(i69, i25, i26)] = objArrZze[i93];
/* 841 */                       i93 = i27;
                            }
/* 842 */                   i69 = i69;
/* 874 */                   iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
/* 877 */                   iObjectFieldOffset2 = 1048575;
/* 880 */                   if ((iCharAt11 & 4096) != 0) {
/* 965 */                       c = 55296;
/* 968 */                       i19 = i17;
/* 969 */                       i20 = 0;
                            } else {
/* 965 */                       c = 55296;
/* 968 */                       i19 = i17;
/* 969 */                       i20 = 0;
                            }
/* 972 */                   if (i79 >= 18) {
/* 997 */                       i21 = i20;
/* 998 */                       i22 = iObjectFieldOffset;
/* 1000 */                      int i104 = i19;
/* 1002 */                      i23 = i93;
/* 1003 */                      i36 = i104;
                            } else {
/* 997 */                       i21 = i20;
/* 998 */                       i22 = iObjectFieldOffset;
/* 1000 */                      int i105 = i19;
/* 1002 */                      i23 = i93;
/* 1003 */                      i36 = i105;
                            }
                        }
/* 1005 */              int i106 = i69 + 1;
/* 1007 */              iArr3[i69] = i18;
/* 1009 */              int i107 = i69 + 2;
/* 1044 */              iArr3[i106] = ((iCharAt11 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? 536870912 : 0) | ((iCharAt11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | (i81 != 0 ? Integer.MIN_VALUE : 0) | (i79 << 20) | i22;
/* 1051 */              iArr3[i107] = (i21 << 20) | iObjectFieldOffset2;
/* 1046 */              i69 += 3;
/* 1054 */              i6 = i23;
/* 1055 */              length = i80;
/* 1057 */              c2 = c;
/* 1059 */              zzueVar2 = zzueVar;
/* 1061 */              i7 = i7;
/* 1063 */              objArr2 = objArr;
                    }
/* 1091 */          return new zztv(iArr3, objArr2, i2, i4, zzueVar2.zza(), false, iArr, i5, i65, zztyVar, zztfVar, zzuvVar, zzrzVar, zztnVar);
                }

                private static double zzn(Object obj, long j) {
/* 7 */             return ((Double) zzvc.zzf(obj, j)).doubleValue();
                }

                private static float zzo(Object obj, long j) {
/* 7 */             return ((Float) zzvc.zzf(obj, j)).floatValue();
                }

                private static int zzp(Object obj, long j) {
/* 7 */             return ((Integer) zzvc.zzf(obj, j)).intValue();
                }

                private final int zzq(int i) {
/* 3 */             if (i < this.zze || i > this.zzf) {
/* 15 */                return -1;
                    }
/* 10 */            return zzs(i, 0);
                }

                private final int zzr(int i) {
/* 5 */             return this.zzc[i + 2];
                }

                private final int zzs(int i, int i2) {
/* 1 */             int[] iArr = this.zzc;
/* 7 */             int length = (iArr.length / 3) - 1;
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
/* 26 */                    i2 = i3 + 1;
                        }
                    }
/* 6 */             return -1;
                }

                private static int zzt(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                private final int zzu(int i) {
/* 5 */             return this.zzc[i + 1];
                }

                private static long zzv(Object obj, long j) {
/* 7 */             return ((Long) zzvc.zzf(obj, j)).longValue();
                }

                private final zzsr zzw(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (zzsr) this.zzd[i2 + i2 + 1];
                }

                private final zzug zzx(int i) {
/* 1 */             Object[] objArr = this.zzd;
/* 3 */             int i2 = i / 3;
/* 5 */             int i3 = i2 + i2;
/* 8 */             zzug zzugVar = (zzug) objArr[i3];
/* 10 */            if (zzugVar != null) {
/* 12 */                return zzugVar;
                    }
/* 23 */            zzug zzugVarZzb = zzuc.zza().zzb((Class) objArr[i3 + 1]);
/* 27 */            objArr[i3] = zzugVarZzb;
/* 29 */            return zzugVarZzb;
                }

                private final Object zzy(Object obj, int i, Object obj2, zzuv zzuvVar, Object obj3) {
/* 3 */             int i2 = this.zzc[i];
/* 14 */            Object objZzf = zzvc.zzf(obj, zzu(i) & 1048575);
/* 18 */            if (objZzf == null || zzw(i) == null) {
/* 27 */                return obj2;
                    }
/* 37 */            throw null;
                }

                private final Object zzz(int i) {
/* 1 */             int i2 = i / 3;
/* 6 */             return this.zzd[i2 + i2];
                }

                /* JADX WARN: Code duplicated, block: B:139:0x038c  */
                /* JADX WARN: Code duplicated, block: B:196:0x04de  */
                @Override // com.google.android.recaptcha.internal.zzug
                public final int zza(Object obj) {
                    int i;
                    int iZzA;
                    int iZzB;
                    int iZzA2;
                    int iZzd;
                    int iZzA3;
                    int iZzh;
                    int iZzw;
                    int iZzA4;
                    int size;
                    int iZzl;
                    int iZzA5;
                    int iZzA6;
                    int iZzA7;
                    int iZze;
                    int iZzA8;
                    int iZzA9;
                    int iZzw2;
                    int iZzA10;
                    int iZzB2;
/* 1 */             zztv<T> zztvVar = this;
/* 5 */             Unsafe unsafe = zzb;
/* 8 */             int i2 = 1048575;
/* 11 */            int i3 = 0;
/* 12 */            int i4 = 0;
/* 13 */            int iM7496s = 0;
/* 14 */            int i5 = 1048575;
                    while (true) {
/* 15 */                int[] iArr = zztvVar.zzc;
/* 18 */                if (i3 >= iArr.length) {
/* 1792 */                  int iZza = ((zzsn) obj).zzc.zza() + iM7496s;
/* 1795 */                  if (!zztvVar.zzh) {
/* 1874 */                      return iZza;
                            }
/* 1803 */                  zzuo zzuoVar = ((zzsk) obj).zzb.zza;
/* 1805 */                  int iZzc = zzuoVar.zzc();
/* 1809 */                  int iZza2 = 0;
/* 1810 */                  for (int i6 = 0; i6 < iZzc; i6++) {
/* 1812 */                      Map.Entry entryZzg = zzuoVar.zzg(i6);
/* 1833 */                      iZza2 += zzsd.zza((zzsc) ((zzuk) entryZzg).zza(), entryZzg.getValue());
                            }
/* 1849 */                  for (Map.Entry entry : zzuoVar.zzd()) {
/* 1871 */                      iZza2 += zzsd.zza((zzsc) entry.getKey(), entry.getValue());
                            }
/* 1873 */                  return iZza + iZza2;
                        }
/* 20 */                int iZzu = zztvVar.zzu(i3);
/* 24 */                int iZzt = zzt(iZzu);
/* 28 */                int i7 = iArr[i3];
/* 32 */                int i8 = iArr[i3 + 2];
/* 34 */                int i9 = i8 & i2;
/* 39 */                if (iZzt <= 17) {
/* 41 */                    if (i9 != i5) {
/* 48 */                        i4 = i9 == i2 ? 0 : unsafe.getInt(obj, i9);
/* 53 */                        i5 = i9;
                            }
/* 56 */                    i = 1 << (i8 >>> 20);
                        } else {
/* 59 */                    i = 0;
                        }
/* 60 */                int i10 = iZzu & i2;
/* 67 */                if (iZzt >= zzse.zzJ.zza()) {
/* 71 */                    zzse.zzW.zza();
                        }
                        long j = i10;
                        switch (iZzt) {
                            case 0:
/* 1765 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1769 */                          iM7496s = pm2.m7496s(i7 << 3, 8, iM7496s);
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 1:
/* 1751 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1755 */                          iM7496s = pm2.m7496s(i7 << 3, 4, iM7496s);
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 2:
/* 1729 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1733 */                          long j2 = unsafe.getLong(obj, j);
/* 1737 */                          iZzA = zzqv.zzA(i7 << 3);
/* 1741 */                          iZzB = zzqv.zzB(j2);
/* 1444 */                          iM7496s += iZzB + iZzA;
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 3:
/* 1707 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1711 */                          long j3 = unsafe.getLong(obj, j);
/* 1715 */                          iZzA = zzqv.zzA(i7 << 3);
/* 1719 */                          iZzB = zzqv.zzB(j3);
/* 1444 */                          iM7496s += iZzB + iZzA;
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 4:
/* 1684 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1688 */                          long j4 = unsafe.getInt(obj, j);
/* 1693 */                          iZzA = zzqv.zzA(i7 << 3);
/* 1697 */                          iZzB = zzqv.zzB(j4);
/* 1444 */                          iM7496s += iZzB + iZzA;
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 5:
/* 1670 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1674 */                          iM7496s = pm2.m7496s(i7 << 3, 8, iM7496s);
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 6:
/* 1656 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1660 */                          iM7496s = pm2.m7496s(i7 << 3, 4, iM7496s);
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 7:
/* 1642 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1646 */                          iM7496s = pm2.m7496s(i7 << 3, 1, iM7496s);
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 8:
/* 1599 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1601 */                          int i11 = i7 << 3;
/* 1603 */                          Object object = unsafe.getObject(obj, j);
/* 1609 */                          if (object instanceof zzqm) {
/* 1613 */                              iZzA2 = zzqv.zzA(i11);
/* 1617 */                              iZzd = ((zzqm) object).zzd();
/* 1621 */                              iZzA3 = zzqv.zzA(iZzd);
/* 1572 */                              iM7496s += iZzA3 + iZzd + iZzA2;
                                    } else {
/* 1628 */                              iZzA = zzqv.zzA(i11);
/* 1632 */                              iZzB = zzqv.zzz((String) object);
/* 1444 */                              iM7496s += iZzB + iZzA;
                                    }
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 9:
/* 1579 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1589 */                          iZzh = zzui.zzh(i7, unsafe.getObject(obj, j), zztvVar.zzx(i3));
/* 285 */                           iM7496s += iZzh;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 10:
/* 1548 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1556 */                          zzqm zzqmVar = (zzqm) unsafe.getObject(obj, j);
/* 1558 */                          iZzA2 = zzqv.zzA(i7 << 3);
/* 1562 */                          iZzd = zzqmVar.zzd();
/* 1566 */                          iZzA3 = zzqv.zzA(iZzd);
/* 1572 */                          iM7496s += iZzA3 + iZzd + iZzA2;
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 11:
/* 1527 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1539 */                          iM7496s = pm2.m7496s(unsafe.getInt(obj, j), zzqv.zzA(i7 << 3), iM7496s);
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 12:
/* 1505 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1509 */                          long j5 = unsafe.getInt(obj, j);
/* 1514 */                          iZzA = zzqv.zzA(i7 << 3);
/* 1518 */                          iZzB = zzqv.zzB(j5);
/* 1444 */                          iM7496s += iZzB + iZzA;
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1492 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1496 */                          iM7496s = pm2.m7496s(i7 << 3, 4, iM7496s);
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 14:
/* 1479 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1483 */                          iM7496s = pm2.m7496s(i7 << 3, 8, iM7496s);
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1453 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1457 */                          int i12 = unsafe.getInt(obj, j);
/* 1470 */                          iM7496s = pm2.m7496s((i12 >> 31) ^ (i12 + i12), zzqv.zzA(i7 << 3), iM7496s);
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 16:
/* 1422 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1426 */                          long j6 = unsafe.getLong(obj, j);
/* 1434 */                          iZzA = zzqv.zzA(i7 << 3);
/* 1439 */                          iZzB = zzqv.zzB((j6 >> 63) ^ (j6 + j6));
/* 1444 */                          iM7496s += iZzB + iZzA;
                                }
/* 1445 */                      zztvVar = this;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 17:
/* 1400 */                      if (zztvVar.zzO(obj, i3, i5, i4, i)) {
/* 1412 */                          iZzw = zzqv.zzw(i7, (zzts) unsafe.getObject(obj, j), zztvVar.zzx(i3));
/* 105 */                           iM7496s += iZzw;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 18:
/* 1390 */                      iZzh = zzui.zzd(i7, (List) unsafe.getObject(obj, j), false);
/* 285 */                       iM7496s += iZzh;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 19:
/* 1378 */                      iZzh = zzui.zzb(i7, (List) unsafe.getObject(obj, j), false);
/* 285 */                       iM7496s += iZzh;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 20:
/* 1344 */                      List list = (List) unsafe.getObject(obj, j);
/* 1346 */                      int i13 = zzui.zza;
/* 1352 */                      if (list.size() == 0) {
/* 1247 */                          iZzA4 = 0;
                                } else {
/* 1370 */                          iZzA4 = (zzqv.zzA(i7 << 3) * list.size()) + zzui.zzg(list);
                                }
/* 1257 */                      iM7496s += iZzA4;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 1316 */                      List list2 = (List) unsafe.getObject(obj, j);
/* 1318 */                      int i14 = zzui.zza;
/* 1320 */                      size = list2.size();
/* 1324 */                      if (size == 0) {
/* 909 */                           iZzA6 = 0;
                                } else {
/* 1330 */                          iZzl = zzui.zzl(list2);
/* 1334 */                          iZzA5 = zzqv.zzA(i7 << 3);
/* 922 */                           iZzA6 = (iZzA5 * size) + iZzl;
                                }
/* 923 */                       iM7496s += iZzA6;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 1288 */                      List list3 = (List) unsafe.getObject(obj, j);
/* 1290 */                      int i15 = zzui.zza;
/* 1292 */                      size = list3.size();
/* 1296 */                      if (size == 0) {
/* 909 */                           iZzA6 = 0;
                                } else {
/* 1302 */                          iZzl = zzui.zzf(list3);
/* 1306 */                          iZzA5 = zzqv.zzA(i7 << 3);
/* 922 */                           iZzA6 = (iZzA5 * size) + iZzl;
                                }
/* 923 */                       iM7496s += iZzA6;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 1278 */                      iZzh = zzui.zzd(i7, (List) unsafe.getObject(obj, j), false);
/* 285 */                       iM7496s += iZzh;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 24:
/* 1266 */                      iZzh = zzui.zzb(i7, (List) unsafe.getObject(obj, j), false);
/* 285 */                       iM7496s += iZzh;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 1237 */                      List list4 = (List) unsafe.getObject(obj, j);
/* 1239 */                      int i16 = zzui.zza;
/* 1241 */                      int size2 = list4.size();
/* 1245 */                      if (size2 == 0) {
/* 1247 */                          iZzA4 = 0;
                                } else {
/* 1256 */                          iZzA4 = (zzqv.zzA(i7 << 3) + 1) * size2;
                                }
/* 1257 */                      iM7496s += iZzA4;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 1142 */                      List list5 = (List) unsafe.getObject(obj, j);
/* 1144 */                      int i17 = zzui.zza;
/* 1146 */                      int size3 = list5.size();
/* 1150 */                      if (size3 == 0) {
/* 909 */                           iZzA6 = 0;
                                } else {
/* 1160 */                          iZzA6 = zzqv.zzA(i7 << 3) * size3;
/* 1163 */                          if (list5 instanceof zzte) {
/* 1165 */                              zzte zzteVar = (zzte) list5;
/* 1168 */                              for (int i18 = 0; i18 < size3; i18++) {
/* 1170 */                                  Object objZzc = zzteVar.zzc();
/* 1176 */                                  if (objZzc instanceof zzqm) {
/* 1180 */                                      int iZzd2 = ((zzqm) objZzc).zzd();
/* 1184 */                                      iZzA6 = pm2.m7496s(iZzd2, iZzd2, iZzA6);
                                            } else {
/* 1195 */                                      iZzA6 = zzqv.zzz((String) objZzc) + iZzA6;
                                            }
                                        }
                                    } else {
/* 1201 */                              for (int i19 = 0; i19 < size3; i19++) {
/* 1203 */                                  Object obj2 = list5.get(i19);
/* 1209 */                                  if (obj2 instanceof zzqm) {
/* 1213 */                                      int iZzd3 = ((zzqm) obj2).zzd();
/* 1217 */                                      iZzA6 = pm2.m7496s(iZzd3, iZzd3, iZzA6);
                                            } else {
/* 1228 */                                      iZzA6 = zzqv.zzz((String) obj2) + iZzA6;
                                            }
                                        }
                                    }
                                }
/* 923 */                       iM7496s += iZzA6;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 1079 */                      List list6 = (List) unsafe.getObject(obj, j);
/* 1081 */                      zzug zzugVarZzx = zztvVar.zzx(i3);
/* 1085 */                      int i20 = zzui.zza;
/* 1087 */                      int size4 = list6.size();
/* 1091 */                      if (size4 == 0) {
/* 1093 */                          iZzA7 = 0;
                                } else {
/* 1101 */                          iZzA7 = zzqv.zzA(i7 << 3) * size4;
/* 1103 */                          for (int i21 = 0; i21 < size4; i21++) {
/* 1105 */                              Object obj3 = list6.get(i21);
/* 1111 */                              if (obj3 instanceof zztd) {
/* 1115 */                                  int iZza3 = ((zztd) obj3).zza();
/* 1119 */                                  iZzA7 = pm2.m7496s(iZza3, iZza3, iZzA7);
                                        } else {
/* 1130 */                                  iZzA7 = zzqv.zzy((zzts) obj3, zzugVarZzx) + iZzA7;
                                        }
                                    }
                                }
/* 1135 */                      iM7496s += iZzA7;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 1032 */                      List list7 = (List) unsafe.getObject(obj, j);
/* 1034 */                      int i22 = zzui.zza;
/* 1036 */                      int size5 = list7.size();
/* 1040 */                      if (size5 == 0) {
/* 909 */                           iZzA6 = 0;
                                } else {
/* 1050 */                          iZzA6 = zzqv.zzA(i7 << 3) * size5;
/* 1056 */                          for (int i23 = 0; i23 < list7.size(); i23++) {
/* 1064 */                              int iZzd4 = ((zzqm) list7.get(i23)).zzd();
/* 1068 */                              iZzA6 = pm2.m7496s(iZzd4, iZzd4, iZzA6);
                                    }
                                }
/* 923 */                       iM7496s += iZzA6;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 1006 */                      List list8 = (List) unsafe.getObject(obj, j);
/* 1008 */                      int i24 = zzui.zza;
/* 1010 */                      size = list8.size();
/* 1014 */                      if (size == 0) {
/* 909 */                           iZzA6 = 0;
                                } else {
/* 1019 */                          iZzl = zzui.zzk(list8);
/* 1023 */                          iZzA5 = zzqv.zzA(i7 << 3);
/* 922 */                           iZzA6 = (iZzA5 * size) + iZzl;
                                }
/* 923 */                       iM7496s += iZzA6;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 980 */                       List list9 = (List) unsafe.getObject(obj, j);
/* 982 */                       int i25 = zzui.zza;
/* 984 */                       size = list9.size();
/* 988 */                       if (size == 0) {
/* 909 */                           iZzA6 = 0;
                                } else {
/* 993 */                           iZzl = zzui.zza(list9);
/* 997 */                           iZzA5 = zzqv.zzA(i7 << 3);
/* 922 */                           iZzA6 = (iZzA5 * size) + iZzl;
                                }
/* 923 */                       iM7496s += iZzA6;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 970 */                       iZzh = zzui.zzb(i7, (List) unsafe.getObject(obj, j), false);
/* 285 */                       iM7496s += iZzh;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 32:
/* 958 */                       iZzh = zzui.zzd(i7, (List) unsafe.getObject(obj, j), false);
/* 285 */                       iM7496s += iZzh;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 930 */                       List list10 = (List) unsafe.getObject(obj, j);
/* 932 */                       int i26 = zzui.zza;
/* 934 */                       size = list10.size();
/* 938 */                       if (size == 0) {
/* 909 */                           iZzA6 = 0;
                                } else {
/* 943 */                           iZzl = zzui.zzi(list10);
/* 947 */                           iZzA5 = zzqv.zzA(i7 << 3);
/* 922 */                           iZzA6 = (iZzA5 * size) + iZzl;
                                }
/* 923 */                       iM7496s += iZzA6;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 899 */                       List list11 = (List) unsafe.getObject(obj, j);
/* 901 */                       int i27 = zzui.zza;
/* 903 */                       size = list11.size();
/* 907 */                       if (size == 0) {
/* 909 */                           iZzA6 = 0;
                                } else {
/* 913 */                           iZzl = zzui.zzj(list11);
/* 917 */                           iZzA5 = zzqv.zzA(i7 << 3);
/* 922 */                           iZzA6 = (iZzA5 * size) + iZzl;
                                }
/* 923 */                       iM7496s += iZzA6;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 877 */                       iZze = zzui.zze((List) unsafe.getObject(obj, j));
/* 881 */                       if (iZze > 0) {
/* 885 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 889 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 853 */                       iZze = zzui.zzc((List) unsafe.getObject(obj, j));
/* 857 */                       if (iZze > 0) {
/* 861 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 865 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 37:
/* 829 */                       iZze = zzui.zzg((List) unsafe.getObject(obj, j));
/* 833 */                       if (iZze > 0) {
/* 837 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 841 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 38:
/* 805 */                       iZze = zzui.zzl((List) unsafe.getObject(obj, j));
/* 809 */                       if (iZze > 0) {
/* 813 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 817 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 39:
/* 781 */                       iZze = zzui.zzf((List) unsafe.getObject(obj, j));
/* 785 */                       if (iZze > 0) {
/* 789 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 793 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 757 */                       iZze = zzui.zze((List) unsafe.getObject(obj, j));
/* 761 */                       if (iZze > 0) {
/* 765 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 769 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 733 */                       iZze = zzui.zzc((List) unsafe.getObject(obj, j));
/* 737 */                       if (iZze > 0) {
/* 741 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 745 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 42:
/* 705 */                       List list12 = (List) unsafe.getObject(obj, j);
/* 707 */                       int i28 = zzui.zza;
/* 709 */                       iZze = list12.size();
/* 713 */                       if (iZze > 0) {
/* 717 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 721 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 43:
/* 683 */                       iZze = zzui.zzk((List) unsafe.getObject(obj, j));
/* 687 */                       if (iZze > 0) {
/* 691 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 695 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 44:
/* 659 */                       iZze = zzui.zza((List) unsafe.getObject(obj, j));
/* 663 */                       if (iZze > 0) {
/* 667 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 671 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 45:
/* 635 */                       iZze = zzui.zzc((List) unsafe.getObject(obj, j));
/* 639 */                       if (iZze > 0) {
/* 643 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 647 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 46:
/* 611 */                       iZze = zzui.zze((List) unsafe.getObject(obj, j));
/* 615 */                       if (iZze > 0) {
/* 619 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 623 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 47:
/* 587 */                       iZze = zzui.zzi((List) unsafe.getObject(obj, j));
/* 591 */                       if (iZze > 0) {
/* 595 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 599 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 48:
/* 563 */                       iZze = zzui.zzj((List) unsafe.getObject(obj, j));
/* 567 */                       if (iZze > 0) {
/* 571 */                           iZzA8 = zzqv.zzA(i7 << 3);
/* 575 */                           iZzA9 = zzqv.zzA(iZze);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 49:
/* 520 */                       List list13 = (List) unsafe.getObject(obj, j);
/* 522 */                       zzug zzugVarZzx2 = zztvVar.zzx(i3);
/* 526 */                       int i29 = zzui.zza;
/* 528 */                       int size6 = list13.size();
/* 532 */                       if (size6 == 0) {
/* 534 */                           iZzw2 = 0;
                                } else {
/* 537 */                           iZzw2 = 0;
/* 538 */                           for (int i30 = 0; i30 < size6; i30++) {
/* 550 */                               iZzw2 += zzqv.zzw(i7, (zzts) list13.get(i30), zzugVarZzx2);
                                    }
                                }
/* 554 */                       iM7496s += iZzw2;
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 476 */                       zztm zztmVar = (zztm) unsafe.getObject(obj, j);
/* 484 */                       if (zztmVar.isEmpty()) {
                                    continue;
                                } else {
/* 490 */                           Iterator it = zztmVar.entrySet().iterator();
/* 498 */                           if (it.hasNext()) {
/* 506 */                               Map.Entry entry2 = (Map.Entry) it.next();
/* 508 */                               entry2.getKey();
/* 511 */                               entry2.getValue();
/* 515 */                               throw null;
                                    }
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                            case 51:
/* 458 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 462 */                           iM7496s = pm2.m7496s(i7 << 3, 8, iM7496s);
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 52:
/* 444 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 448 */                           iM7496s = pm2.m7496s(i7 << 3, 4, iM7496s);
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 53:
/* 422 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 426 */                           long jZzv = zzv(obj, j);
/* 430 */                           iZzA10 = zzqv.zzA(i7 << 3);
/* 434 */                           iZzB2 = zzqv.zzB(jZzv);
/* 134 */                           iM7496s += iZzB2 + iZzA10;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 54:
/* 400 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 404 */                           long jZzv2 = zzv(obj, j);
/* 408 */                           iZzA10 = zzqv.zzA(i7 << 3);
/* 412 */                           iZzB2 = zzqv.zzB(jZzv2);
/* 134 */                           iM7496s += iZzB2 + iZzA10;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 55:
/* 377 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 381 */                           long jZzp = zzp(obj, j);
/* 386 */                           iZzA10 = zzqv.zzA(i7 << 3);
/* 390 */                           iZzB2 = zzqv.zzB(jZzp);
/* 134 */                           iM7496s += iZzB2 + iZzA10;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 56:
/* 363 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 367 */                           iM7496s = pm2.m7496s(i7 << 3, 8, iM7496s);
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 57:
/* 349 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 353 */                           iM7496s = pm2.m7496s(i7 << 3, 4, iM7496s);
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 58:
/* 335 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 339 */                           iM7496s = pm2.m7496s(i7 << 3, 1, iM7496s);
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 59:
/* 292 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 294 */                           int i31 = i7 << 3;
/* 296 */                           Object object2 = unsafe.getObject(obj, j);
/* 302 */                           if (object2 instanceof zzqm) {
/* 306 */                               iZze = zzqv.zzA(i31);
/* 310 */                               iZzA8 = ((zzqm) object2).zzd();
/* 314 */                               iZzA9 = zzqv.zzA(iZzA8);
/* 264 */                               iM7496s += iZzA9 + iZzA8 + iZze;
                                    } else {
/* 321 */                               iZzA10 = zzqv.zzA(i31);
/* 325 */                               iZzB2 = zzqv.zzz((String) object2);
/* 134 */                               iM7496s += iZzB2 + iZzA10;
                                    }
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 60:
/* 271 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 281 */                           iZzh = zzui.zzh(i7, unsafe.getObject(obj, j), zztvVar.zzx(i3));
/* 285 */                           iM7496s += iZzh;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 61:
/* 240 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 248 */                           zzqm zzqmVar2 = (zzqm) unsafe.getObject(obj, j);
/* 250 */                           iZze = zzqv.zzA(i7 << 3);
/* 254 */                           iZzA8 = zzqmVar2.zzd();
/* 258 */                           iZzA9 = zzqv.zzA(iZzA8);
/* 264 */                           iM7496s += iZzA9 + iZzA8 + iZze;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 62:
/* 218 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 230 */                           iM7496s = pm2.m7496s(zzp(obj, j), zzqv.zzA(i7 << 3), iM7496s);
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 63:
/* 196 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 200 */                           long jZzp2 = zzp(obj, j);
/* 205 */                           iZzA10 = zzqv.zzA(i7 << 3);
/* 209 */                           iZzB2 = zzqv.zzB(jZzp2);
/* 134 */                           iM7496s += iZzB2 + iZzA10;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 64:
/* 182 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 186 */                           iM7496s = pm2.m7496s(i7 << 3, 4, iM7496s);
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 65:
/* 168 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 172 */                           iM7496s = pm2.m7496s(i7 << 3, 8, iM7496s);
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 66:
/* 141 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 145 */                           int iZzp = zzp(obj, j);
/* 158 */                           iM7496s = pm2.m7496s((iZzp >> 31) ^ (iZzp + iZzp), zzqv.zzA(i7 << 3), iM7496s);
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 67:
/* 112 */                       if (zztvVar.zzR(obj, i7, i3)) {
/* 116 */                           long jZzv3 = zzv(obj, j);
/* 124 */                           iZzA10 = zzqv.zzA(i7 << 3);
/* 129 */                           iZzB2 = zzqv.zzB((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
/* 134 */                           iM7496s += iZzB2 + iZzA10;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            case 68:
/* 89 */                        if (zztvVar.zzR(obj, i7, i3)) {
/* 101 */                           iZzw = zzqv.zzw(i7, (zzts) unsafe.getObject(obj, j), zztvVar.zzx(i3));
/* 105 */                           iM7496s += iZzw;
                                }
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                            default:
/* 1773 */                      i3 += 3;
/* 1777 */                      i2 = 1048575;
                                break;
                        }
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final int zzb(Object obj) {
                    int i;
                    long jDoubleToLongBits;
                    int i2;
                    int iFloatToIntBits;
                    int iZzc;
                    int i3;
/* 1 */             int i4 = 0;
/* 2 */             int i5 = 0;
                    while (true) {
/* 3 */                 int[] iArr = this.zzc;
/* 6 */                 if (i4 >= iArr.length) {
/* 555 */                   int iHashCode = ((zzsn) obj).zzc.hashCode() + (i5 * 53);
                            return this.zzh ? (iHashCode * 53) + ((zzsk) obj).zzb.zza.hashCode() : iHashCode;
                        }
/* 8 */                 int iZzu = zzu(i4);
/* 15 */                int i6 = 1048575 & iZzu;
/* 16 */                int iZzt = zzt(iZzu);
/* 20 */                int i7 = iArr[i4];
                        long j = i6;
/* 23 */                int iHashCode2 = 37;
                        switch (iZzt) {
                            case 0:
/* 526 */                       i = i5 * 53;
/* 532 */                       jDoubleToLongBits = Double.doubleToLongBits(zzvc.zza(obj, j));
/* 536 */                       byte[] bArr = zzsv.zzb;
/* 69 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 1:
/* 514 */                       i2 = i5 * 53;
/* 520 */                       iFloatToIntBits = Float.floatToIntBits(zzvc.zzb(obj, j));
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 2:
/* 504 */                       i = i5 * 53;
/* 506 */                       jDoubleToLongBits = zzvc.zzd(obj, j);
/* 510 */                       byte[] bArr2 = zzsv.zzb;
/* 69 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 3:
/* 494 */                       i = i5 * 53;
/* 496 */                       jDoubleToLongBits = zzvc.zzd(obj, j);
/* 500 */                       byte[] bArr3 = zzsv.zzb;
/* 69 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 4:
/* 486 */                       i = i5 * 53;
/* 488 */                       iZzc = zzvc.zzc(obj, j);
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 5:
/* 476 */                       i = i5 * 53;
/* 478 */                       jDoubleToLongBits = zzvc.zzd(obj, j);
/* 482 */                       byte[] bArr4 = zzsv.zzb;
/* 69 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 6:
/* 468 */                       i = i5 * 53;
/* 470 */                       iZzc = zzvc.zzc(obj, j);
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 7:
/* 456 */                       i2 = i5 * 53;
/* 462 */                       iFloatToIntBits = zzsv.zza(zzvc.zzw(obj, j));
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 8:
/* 442 */                       i2 = i5 * 53;
/* 450 */                       iFloatToIntBits = ((String) zzvc.zzf(obj, j)).hashCode();
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 9:
/* 429 */                       i3 = i5 * 53;
/* 431 */                       Object objZzf = zzvc.zzf(obj, j);
/* 435 */                       if (objZzf != null) {
/* 437 */                           iHashCode2 = objZzf.hashCode();
                                }
/* 362 */                       i5 = i3 + iHashCode2;
                                break;
                            case 10:
/* 417 */                       i2 = i5 * 53;
/* 423 */                       iFloatToIntBits = zzvc.zzf(obj, j).hashCode();
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 11:
/* 409 */                       i = i5 * 53;
/* 411 */                       iZzc = zzvc.zzc(obj, j);
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 12:
/* 401 */                       i = i5 * 53;
/* 403 */                       iZzc = zzvc.zzc(obj, j);
/* 70 */                        i5 = i + iZzc;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 393 */                       i = i5 * 53;
/* 395 */                       iZzc = zzvc.zzc(obj, j);
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 14:
/* 383 */                       i = i5 * 53;
/* 385 */                       jDoubleToLongBits = zzvc.zzd(obj, j);
/* 389 */                       byte[] bArr5 = zzsv.zzb;
/* 69 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzc;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 375 */                       i = i5 * 53;
/* 377 */                       iZzc = zzvc.zzc(obj, j);
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 16:
/* 365 */                       i = i5 * 53;
/* 367 */                       jDoubleToLongBits = zzvc.zzd(obj, j);
/* 371 */                       byte[] bArr6 = zzsv.zzb;
/* 69 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 17:
/* 350 */                       i3 = i5 * 53;
/* 352 */                       Object objZzf2 = zzvc.zzf(obj, j);
/* 356 */                       if (objZzf2 != null) {
/* 358 */                           iHashCode2 = objZzf2.hashCode();
                                }
/* 362 */                       i5 = i3 + iHashCode2;
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
/* 338 */                       i2 = i5 * 53;
/* 344 */                       iFloatToIntBits = zzvc.zzf(obj, j).hashCode();
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 326 */                       i2 = i5 * 53;
/* 332 */                       iFloatToIntBits = zzvc.zzf(obj, j).hashCode();
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 51:
/* 310 */                       if (zzR(obj, i7, i4)) {
/* 312 */                           i = i5 * 53;
/* 318 */                           jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
/* 322 */                           byte[] bArr7 = zzsv.zzb;
/* 69 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzc;
                                }
                                break;
                            case 52:
/* 292 */                       if (zzR(obj, i7, i4)) {
/* 294 */                           i2 = i5 * 53;
/* 300 */                           iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
/* 48 */                            i5 = iFloatToIntBits + i2;
                                }
                                break;
                            case 53:
/* 276 */                       if (zzR(obj, i7, i4)) {
/* 278 */                           i = i5 * 53;
/* 280 */                           jDoubleToLongBits = zzv(obj, j);
/* 284 */                           byte[] bArr8 = zzsv.zzb;
/* 69 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzc;
                                }
                                break;
                            case 54:
/* 260 */                       if (zzR(obj, i7, i4)) {
/* 262 */                           i = i5 * 53;
/* 264 */                           jDoubleToLongBits = zzv(obj, j);
/* 268 */                           byte[] bArr9 = zzsv.zzb;
/* 69 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzc;
                                }
                                break;
                            case 55:
/* 246 */                       if (zzR(obj, i7, i4)) {
/* 248 */                           i = i5 * 53;
/* 250 */                           iZzc = zzp(obj, j);
/* 70 */                            i5 = i + iZzc;
                                }
                                break;
                            case 56:
/* 230 */                       if (zzR(obj, i7, i4)) {
/* 232 */                           i = i5 * 53;
/* 234 */                           jDoubleToLongBits = zzv(obj, j);
/* 238 */                           byte[] bArr10 = zzsv.zzb;
/* 69 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzc;
                                }
                                break;
                            case 57:
/* 216 */                       if (zzR(obj, i7, i4)) {
/* 218 */                           i = i5 * 53;
/* 220 */                           iZzc = zzp(obj, j);
/* 70 */                            i5 = i + iZzc;
                                }
                                break;
                            case 58:
/* 198 */                       if (zzR(obj, i7, i4)) {
/* 200 */                           i2 = i5 * 53;
/* 206 */                           iFloatToIntBits = zzsv.zza(zzS(obj, j));
/* 48 */                            i5 = iFloatToIntBits + i2;
                                }
                                break;
                            case 59:
/* 178 */                       if (zzR(obj, i7, i4)) {
/* 180 */                           i2 = i5 * 53;
/* 188 */                           iFloatToIntBits = ((String) zzvc.zzf(obj, j)).hashCode();
/* 48 */                            i5 = iFloatToIntBits + i2;
                                }
                                break;
                            case 60:
/* 161 */                       if (zzR(obj, i7, i4)) {
/* 163 */                           i2 = i5 * 53;
/* 169 */                           iFloatToIntBits = zzvc.zzf(obj, j).hashCode();
/* 48 */                            i5 = iFloatToIntBits + i2;
                                }
                                break;
                            case 61:
/* 144 */                       if (zzR(obj, i7, i4)) {
/* 146 */                           i2 = i5 * 53;
/* 152 */                           iFloatToIntBits = zzvc.zzf(obj, j).hashCode();
/* 48 */                            i5 = iFloatToIntBits + i2;
                                }
                                break;
                            case 62:
/* 131 */                       if (zzR(obj, i7, i4)) {
/* 133 */                           i = i5 * 53;
/* 135 */                           iZzc = zzp(obj, j);
/* 70 */                            i5 = i + iZzc;
                                }
                                break;
                            case 63:
/* 118 */                       if (zzR(obj, i7, i4)) {
/* 120 */                           i = i5 * 53;
/* 122 */                           iZzc = zzp(obj, j);
/* 70 */                            i5 = i + iZzc;
                                }
                                break;
                            case 64:
/* 105 */                       if (zzR(obj, i7, i4)) {
/* 107 */                           i = i5 * 53;
/* 109 */                           iZzc = zzp(obj, j);
/* 70 */                            i5 = i + iZzc;
                                }
                                break;
                            case 65:
/* 90 */                        if (zzR(obj, i7, i4)) {
/* 92 */                            i = i5 * 53;
/* 94 */                            jDoubleToLongBits = zzv(obj, j);
/* 98 */                            byte[] bArr11 = zzsv.zzb;
/* 69 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzc;
                                }
                                break;
                            case 66:
/* 77 */                        if (zzR(obj, i7, i4)) {
/* 79 */                            i = i5 * 53;
/* 81 */                            iZzc = zzp(obj, j);
/* 70 */                            i5 = i + iZzc;
                                }
                                break;
                            case 67:
/* 56 */                        if (zzR(obj, i7, i4)) {
/* 58 */                            i = i5 * 53;
/* 60 */                            jDoubleToLongBits = zzv(obj, j);
/* 64 */                            byte[] bArr12 = zzsv.zzb;
/* 69 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzc;
                                }
                                break;
                            case 68:
/* 36 */                        if (zzR(obj, i7, i4)) {
/* 38 */                            i2 = i5 * 53;
/* 44 */                            iFloatToIntBits = zzvc.zzf(obj, j).hashCode();
/* 48 */                            i5 = iFloatToIntBits + i2;
                                }
                                break;
                        }
/* 540 */               i4 += 3;
                    }
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 37481. Try increasing type updates limit count.
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                    */
                public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.recaptcha.internal.zzqb r38) throws java.io.IOException {
                    /*
                        Method dump skipped, instruction units count: 3748
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zztv.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzqb):int");
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final Object zze() {
/* 5 */             return ((zzsn) this.zzg).zzv();
                }

                /* JADX WARN: Code duplicated, block: B:26:0x006f  */
                /* JADX WARN: Code duplicated, block: B:28:0x0075  */
                /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
                @Override // com.google.android.recaptcha.internal.zzug
                public final void zzf(Object obj) {
/* 5 */             if (zzQ(obj)) {
/* 12 */                if (obj instanceof zzsn) {
/* 15 */                    zzsn zzsnVar = (zzsn) obj;
/* 20 */                    zzsnVar.zzJ(AbstractC0208c9.API_PRIORITY_OTHER);
/* 23 */                    zzsnVar.zza = 0;
/* 25 */                    zzsnVar.zzH();
                        }
/* 28 */                int[] iArr = this.zzc;
/* 31 */                for (int i = 0; i < iArr.length; i += 3) {
/* 33 */                    int iZzu = zzu(i);
/* 40 */                    int i2 = 1048575 & iZzu;
/* 41 */                    int iZzt = zzt(iZzu);
                            long j = i2;
/* 48 */                    if (iZzt != 9) {
/* 52 */                        if (iZzt != 60 && iZzt != 68) {
                                    switch (iZzt) {
                                        case 17:
/* 116 */                                   if (zzN(obj, i)) {
/* 128 */                                       zzx(i).zzf(zzb.getObject(obj, j));
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
/* 86 */                                    ((zzsu) zzvc.zzf(obj, j)).zzb();
                                            break;
                                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 62 */                                    Unsafe unsafe = zzb;
/* 64 */                                    Object object = unsafe.getObject(obj, j);
/* 68 */                                    if (object != null) {
/* 73 */                                        ((zztm) object).zzc();
/* 76 */                                        unsafe.putObject(obj, j, object);
                                            }
                                            break;
                                    }
                                } else if (zzR(obj, iArr[i], i)) {
/* 108 */                           zzx(i).zzf(zzb.getObject(obj, j));
                                }
                            } else if (zzN(obj, i)) {
/* 128 */                       zzx(i).zzf(zzb.getObject(obj, j));
                            }
                        }
/* 136 */               this.zzm.zzi(obj);
/* 141 */               if (this.zzh) {
/* 145 */                   this.zzn.zza(obj);
                        }
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final void zzg(Object obj, Object obj2) {
/* 1 */             zzD(obj);
/* 4 */             obj2.getClass();
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 int[] iArr = this.zzc;
/* 11 */                if (i >= iArr.length) {
/* 441 */                   zzui.zzq(this.zzm, obj, obj2);
/* 446 */                   if (this.zzh) {
/* 450 */                       zzui.zzp(this.zzn, obj, obj2);
/* 453 */                       return;
                            }
/* 453 */                   return;
                        }
/* 13 */                int iZzu = zzu(i);
/* 20 */                int i2 = 1048575 & iZzu;
/* 21 */                int iZzt = zzt(iZzu);
/* 25 */                int i3 = iArr[i];
                        long j = i2;
                        switch (iZzt) {
                            case 0:
/* 423 */                       if (zzN(obj2, i)) {
/* 429 */                           zzvc.zzo(obj, j, zzvc.zza(obj2, j));
/* 432 */                           zzH(obj, i);
                                }
                                break;
                            case 1:
/* 406 */                       if (zzN(obj2, i)) {
/* 412 */                           zzvc.zzp(obj, j, zzvc.zzb(obj2, j));
/* 415 */                           zzH(obj, i);
                                }
                                break;
                            case 2:
/* 389 */                       if (zzN(obj2, i)) {
/* 395 */                           zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
/* 398 */                           zzH(obj, i);
                                }
                                break;
                            case 3:
/* 372 */                       if (zzN(obj2, i)) {
/* 378 */                           zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
/* 381 */                           zzH(obj, i);
                                }
                                break;
                            case 4:
/* 355 */                       if (zzN(obj2, i)) {
/* 361 */                           zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
/* 364 */                           zzH(obj, i);
                                }
                                break;
                            case 5:
/* 338 */                       if (zzN(obj2, i)) {
/* 344 */                           zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
/* 347 */                           zzH(obj, i);
                                }
                                break;
                            case 6:
/* 321 */                       if (zzN(obj2, i)) {
/* 327 */                           zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
/* 330 */                           zzH(obj, i);
                                }
                                break;
                            case 7:
/* 303 */                       if (zzN(obj2, i)) {
/* 309 */                           zzvc.zzm(obj, j, zzvc.zzw(obj2, j));
/* 312 */                           zzH(obj, i);
                                }
                                break;
                            case 8:
/* 285 */                       if (zzN(obj2, i)) {
/* 291 */                           zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
/* 294 */                           zzH(obj, i);
                                }
                                break;
                            case 9:
/* 276 */                       zzE(obj, obj2, i);
                                break;
                            case 10:
/* 262 */                       if (zzN(obj2, i)) {
/* 268 */                           zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
/* 271 */                           zzH(obj, i);
                                }
                                break;
                            case 11:
/* 244 */                       if (zzN(obj2, i)) {
/* 250 */                           zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
/* 253 */                           zzH(obj, i);
                                }
                                break;
                            case 12:
/* 226 */                       if (zzN(obj2, i)) {
/* 232 */                           zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
/* 235 */                           zzH(obj, i);
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 208 */                       if (zzN(obj2, i)) {
/* 214 */                           zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
/* 217 */                           zzH(obj, i);
                                }
                                break;
                            case 14:
/* 190 */                       if (zzN(obj2, i)) {
/* 196 */                           zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
/* 199 */                           zzH(obj, i);
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 172 */                       if (zzN(obj2, i)) {
/* 178 */                           zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
/* 181 */                           zzH(obj, i);
                                }
                                break;
                            case 16:
/* 154 */                       if (zzN(obj2, i)) {
/* 160 */                           zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
/* 163 */                           zzH(obj, i);
                                }
                                break;
                            case 17:
/* 145 */                       zzE(obj, obj2, i);
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
/* 102 */                       zzsu zzsuVarZzd = (zzsu) zzvc.zzf(obj, j);
/* 108 */                       zzsu zzsuVar = (zzsu) zzvc.zzf(obj2, j);
/* 110 */                       int size = zzsuVarZzd.size();
/* 114 */                       int size2 = zzsuVar.size();
/* 118 */                       if (size > 0 && size2 > 0) {
/* 126 */                           if (!zzsuVarZzd.zzc()) {
/* 129 */                               zzsuVarZzd = zzsuVarZzd.zzd(size2 + size);
                                    }
/* 133 */                           zzsuVarZzd.addAll(zzsuVar);
                                }
/* 136 */                       if (size > 0) {
/* 139 */                           zzsuVar = zzsuVarZzd;
                                }
/* 140 */                       zzvc.zzs(obj, j, zzsuVar);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 79 */                        int i4 = zzui.zza;
/* 93 */                        zzvc.zzs(obj, j, zztn.zzb(zzvc.zzf(obj, j), zzvc.zzf(obj2, j)));
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
/* 65 */                        if (zzR(obj2, i3, i)) {
/* 71 */                            zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
/* 74 */                            zzI(obj, i3, i);
                                }
                                break;
                            case 60:
/* 56 */                        zzF(obj, obj2, i);
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
/* 42 */                        if (zzR(obj2, i3, i)) {
/* 48 */                            zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
/* 51 */                            zzI(obj, i3, i);
                                }
                                break;
                            case 68:
/* 33 */                        zzF(obj, obj2, i);
                                break;
                        }
/* 435 */               i += 3;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:229:0x0823 A[LOOP:2: B:227:0x081f->B:229:0x0823, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:231:0x0832  */
                /* JADX WARN: Code duplicated, block: B:239:0x0843 A[LOOP:3: B:237:0x083f->B:239:0x0843, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:241:0x0854  */
                /* JADX WARN: Code duplicated, block: B:251:0x0810 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:274:0x081d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:284:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:62:0x0166  */
                /* JADX WARN: Code duplicated, block: B:65:0x016b A[Catch: all -> 0x005d, TryCatch #12 {all -> 0x005d, blocks: (B:20:0x0054, B:24:0x0064, B:26:0x006c, B:27:0x0070, B:60:0x015e, B:68:0x0183, B:65:0x016b, B:67:0x0171, B:29:0x0076, B:30:0x0080, B:31:0x008a, B:32:0x0094, B:33:0x009e, B:34:0x00a5, B:35:0x00a6, B:36:0x00b0, B:37:0x00b6, B:39:0x00be, B:41:0x00d3, B:42:0x00de, B:43:0x00e3, B:44:0x00e4, B:46:0x00ec, B:48:0x0101, B:49:0x010c, B:50:0x0111, B:51:0x0112, B:52:0x0117, B:53:0x0120, B:54:0x0129, B:55:0x0132, B:56:0x013b, B:57:0x0144, B:58:0x014d, B:59:0x0156, B:70:0x018a, B:71:0x018d, B:73:0x0190), top: B:255:0x0054 }] */
                @Override // com.google.android.recaptcha.internal.zzug
                public final void zzh(Object obj, zzuf zzufVar, zzry zzryVar) throws Throwable {
                    Object obj2;
                    zztv<T> zztvVar;
                    Object obj3;
                    int i;
                    zzuv zzuvVar;
                    Object obj4;
                    zzuv zzuvVar2;
                    Object obj5;
                    Object objValueOf;
                    int iOrdinal;
                    Object objZze;
                    int i2;
                    Object obj6;
/* 1 */             zztv<T> zztvVar2 = this;
/* 7 */             zzryVar.getClass();
/* 10 */            zzD(obj);
/* 13 */            zzuv zzuvVar3 = zztvVar2.zzm;
/* 16 */            Object objZza = null;
/* 17 */            zzsd zzsdVarZzi = null;
                    while (true) {
                        try {
/* 18 */                    int iZzc = zzufVar.zzc();
/* 22 */                    int iZzq = zztvVar2.zzq(iZzc);
/* 27 */                    if (iZzq >= 0) {
/* 469 */                       obj5 = obj;
/* 471 */                       zzuvVar2 = zzuvVar3;
/* 472 */                       obj4 = objZza;
                                try {
/* 473 */                           int iZzu = zztvVar2.zzu(iZzq);
                                    try {
                                        switch (zzt(iZzu)) {
                                            case 0:
/* 2043 */                                      zztvVar = zztvVar2;
/* 2044 */                                      obj3 = obj4;
/* 2045 */                                      zzuvVar3 = zzuvVar2;
/* 2053 */                                      zzvc.zzo(obj5, iZzu & 1048575, zzufVar.zza());
/* 2056 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 1:
/* 2025 */                                      zztvVar = zztvVar2;
/* 2026 */                                      obj3 = obj4;
/* 2027 */                                      zzuvVar3 = zzuvVar2;
/* 2035 */                                      zzvc.zzp(obj5, iZzu & 1048575, zzufVar.zzb());
/* 2038 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 2:
/* 2007 */                                      zztvVar = zztvVar2;
/* 2008 */                                      obj3 = obj4;
/* 2009 */                                      zzuvVar3 = zzuvVar2;
/* 2017 */                                      zzvc.zzr(obj5, iZzu & 1048575, zzufVar.zzl());
/* 2020 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 3:
/* 1989 */                                      zztvVar = zztvVar2;
/* 1990 */                                      obj3 = obj4;
/* 1991 */                                      zzuvVar3 = zzuvVar2;
/* 1999 */                                      zzvc.zzr(obj5, iZzu & 1048575, zzufVar.zzo());
/* 2002 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 4:
/* 1971 */                                      zztvVar = zztvVar2;
/* 1972 */                                      obj3 = obj4;
/* 1973 */                                      zzuvVar3 = zzuvVar2;
/* 1981 */                                      zzvc.zzq(obj5, iZzu & 1048575, zzufVar.zzg());
/* 1984 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 5:
/* 1952 */                                      zztvVar = zztvVar2;
/* 1953 */                                      obj3 = obj4;
/* 1954 */                                      zzuvVar3 = zzuvVar2;
/* 1962 */                                      zzvc.zzr(obj5, iZzu & 1048575, zzufVar.zzk());
/* 1965 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 6:
/* 1933 */                                      zztvVar = zztvVar2;
/* 1934 */                                      obj3 = obj4;
/* 1935 */                                      zzuvVar3 = zzuvVar2;
/* 1943 */                                      zzvc.zzq(obj5, iZzu & 1048575, zzufVar.zzf());
/* 1946 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 7:
/* 1914 */                                      zztvVar = zztvVar2;
/* 1915 */                                      obj3 = obj4;
/* 1916 */                                      zzuvVar3 = zzuvVar2;
/* 1924 */                                      zzvc.zzm(obj5, iZzu & 1048575, zzufVar.zzN());
/* 1927 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 8:
/* 1901 */                                      zztvVar = zztvVar2;
/* 1902 */                                      obj3 = obj4;
/* 1903 */                                      zzuvVar3 = zzuvVar2;
/* 1905 */                                      zztvVar.zzG(obj5, iZzu, zzufVar);
/* 1908 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 9:
/* 1878 */                                      zztvVar = zztvVar2;
/* 1879 */                                      obj3 = obj4;
/* 1880 */                                      zzuvVar3 = zzuvVar2;
/* 1886 */                                      zzts zztsVar = (zzts) zztvVar.zzA(obj5, iZzq);
/* 1892 */                                      zzufVar.zzu(zztsVar, zztvVar.zzx(iZzq), zzryVar);
/* 1895 */                                      zztvVar.zzJ(obj5, iZzq, zztsVar);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 10:
/* 1859 */                                      zztvVar = zztvVar2;
/* 1860 */                                      obj3 = obj4;
/* 1861 */                                      zzuvVar3 = zzuvVar2;
/* 1869 */                                      zzvc.zzs(obj5, iZzu & 1048575, zzufVar.zzp());
/* 1872 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 11:
/* 1840 */                                      zztvVar = zztvVar2;
/* 1841 */                                      obj3 = obj4;
/* 1842 */                                      zzuvVar3 = zzuvVar2;
/* 1850 */                                      zzvc.zzq(obj5, iZzu & 1048575, zzufVar.zzj());
/* 1853 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 12:
/* 1797 */                                      zztvVar = zztvVar2;
/* 1798 */                                      obj3 = obj4;
/* 1799 */                                      zzuvVar3 = zzuvVar2;
/* 1806 */                                      int iZze = zzufVar.zze();
/* 1810 */                                      zzsr zzsrVarZzw = zztvVar.zzw(iZzq);
/* 1814 */                                      if (zzsrVarZzw == null || zzsrVarZzw.zza(iZze)) {
/* 1831 */                                          zzvc.zzq(obj5, iZzu & 1048575, iZze);
/* 1834 */                                          zztvVar.zzH(obj5, iZzq);
/* 2059 */                                          objZza = obj3;
                                                } else {
/* 1823 */                                          objZza = zzui.zzo(obj5, iZzc, iZze, obj3, zzuvVar3);
                                                }
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1777 */                                      zztvVar = zztvVar2;
/* 1778 */                                      obj3 = obj4;
/* 1779 */                                      zzuvVar3 = zzuvVar2;
/* 1787 */                                      zzvc.zzq(obj5, iZzu & 1048575, zzufVar.zzh());
/* 1790 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 14:
/* 1758 */                                      zztvVar = zztvVar2;
/* 1759 */                                      obj3 = obj4;
/* 1760 */                                      zzuvVar3 = zzuvVar2;
/* 1768 */                                      zzvc.zzr(obj5, iZzu & 1048575, zzufVar.zzm());
/* 1771 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1739 */                                      zztvVar = zztvVar2;
/* 1740 */                                      obj3 = obj4;
/* 1741 */                                      zzuvVar3 = zzuvVar2;
/* 1749 */                                      zzvc.zzq(obj5, iZzu & 1048575, zzufVar.zzi());
/* 1752 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 16:
/* 1720 */                                      zztvVar = zztvVar2;
/* 1721 */                                      obj3 = obj4;
/* 1722 */                                      zzuvVar3 = zzuvVar2;
/* 1730 */                                      zzvc.zzr(obj5, iZzu & 1048575, zzufVar.zzn());
/* 1733 */                                      zztvVar.zzH(obj5, iZzq);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 17:
/* 1697 */                                      zztvVar = zztvVar2;
/* 1698 */                                      obj3 = obj4;
/* 1699 */                                      zzuvVar3 = zzuvVar2;
/* 1705 */                                      zzts zztsVar2 = (zzts) zztvVar.zzA(obj5, iZzq);
/* 1711 */                                      zzufVar.zzt(zztsVar2, zztvVar.zzx(iZzq), zzryVar);
/* 1714 */                                      zztvVar.zzJ(obj5, iZzq, zztsVar2);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 18:
/* 1680 */                                      zztvVar = zztvVar2;
/* 1681 */                                      obj3 = obj4;
/* 1682 */                                      zzuvVar3 = zzuvVar2;
/* 1691 */                                      zzufVar.zzx(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 19:
/* 1663 */                                      zztvVar = zztvVar2;
/* 1664 */                                      obj3 = obj4;
/* 1665 */                                      zzuvVar3 = zzuvVar2;
/* 1674 */                                      zzufVar.zzB(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 20:
/* 1646 */                                      zztvVar = zztvVar2;
/* 1647 */                                      obj3 = obj4;
/* 1648 */                                      zzuvVar3 = zzuvVar2;
/* 1657 */                                      zzufVar.zzE(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_21 /* 21 */:
/* 1629 */                                      zztvVar = zztvVar2;
/* 1630 */                                      obj3 = obj4;
/* 1631 */                                      zzuvVar3 = zzuvVar2;
/* 1640 */                                      zzufVar.zzM(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_22 /* 22 */:
/* 1612 */                                      zztvVar = zztvVar2;
/* 1613 */                                      obj3 = obj4;
/* 1614 */                                      zzuvVar3 = zzuvVar2;
/* 1623 */                                      zzufVar.zzD(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_23 /* 23 */:
/* 1595 */                                      zztvVar = zztvVar2;
/* 1596 */                                      obj3 = obj4;
/* 1597 */                                      zzuvVar3 = zzuvVar2;
/* 1606 */                                      zzufVar.zzA(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 24:
/* 1578 */                                      zztvVar = zztvVar2;
/* 1579 */                                      obj3 = obj4;
/* 1580 */                                      zzuvVar3 = zzuvVar2;
/* 1589 */                                      zzufVar.zzz(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_25 /* 25 */:
/* 1561 */                                      zztvVar = zztvVar2;
/* 1562 */                                      obj3 = obj4;
/* 1563 */                                      zzuvVar3 = zzuvVar2;
/* 1572 */                                      zzufVar.zzv(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_26 /* 26 */:
/* 1519 */                                      zztvVar = zztvVar2;
/* 1520 */                                      obj3 = obj4;
/* 1521 */                                      zzuvVar3 = zzuvVar2;
/* 1527 */                                      if (zzM(iZzu)) {
/* 1540 */                                          ((zzqr) zzufVar).zzK(zztf.zza(obj5, iZzu & 1048575), true);
                                                } else {
/* 1555 */                                          ((zzqr) zzufVar).zzK(zztf.zza(obj5, iZzu & 1048575), false);
                                                }
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_27 /* 27 */:
/* 1499 */                                      zztvVar = zztvVar2;
/* 1500 */                                      obj3 = obj4;
/* 1501 */                                      zzuvVar3 = zzuvVar2;
/* 1513 */                                      zzufVar.zzF(zztf.zza(obj5, iZzu & 1048575), zztvVar.zzx(iZzq), zzryVar);
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_28 /* 28 */:
/* 1482 */                                      zztvVar = zztvVar2;
/* 1483 */                                      obj3 = obj4;
/* 1484 */                                      zzuvVar3 = zzuvVar2;
/* 1493 */                                      zzufVar.zzw(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_29 /* 29 */:
/* 1465 */                                      zztvVar = zztvVar2;
/* 1466 */                                      obj3 = obj4;
/* 1467 */                                      zzuvVar3 = zzuvVar2;
/* 1476 */                                      zzufVar.zzL(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_30 /* 30 */:
/* 1427 */                                      zztvVar = zztvVar2;
/* 1438 */                                      List listZza = zztf.zza(obj5, iZzu & 1048575);
/* 1442 */                                      zzufVar.zzy(listZza);
/* 1456 */                                      objZza = zzui.zzn(obj5, iZzc, listZza, zztvVar.zzw(iZzq), obj4, zzuvVar2);
/* 1461 */                                      zzuvVar3 = zzuvVar2;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_31 /* 31 */:
/* 1409 */                                      zztvVar = zztvVar2;
/* 1410 */                                      obj3 = obj4;
/* 1411 */                                      zzuvVar3 = zzuvVar2;
/* 1420 */                                      zzufVar.zzG(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 32:
/* 1392 */                                      zztvVar = zztvVar2;
/* 1393 */                                      obj3 = obj4;
/* 1394 */                                      zzuvVar3 = zzuvVar2;
/* 1403 */                                      zzufVar.zzH(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_33 /* 33 */:
/* 1375 */                                      zztvVar = zztvVar2;
/* 1376 */                                      obj3 = obj4;
/* 1377 */                                      zzuvVar3 = zzuvVar2;
/* 1386 */                                      zzufVar.zzI(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_34 /* 34 */:
/* 1358 */                                      zztvVar = zztvVar2;
/* 1359 */                                      obj3 = obj4;
/* 1360 */                                      zzuvVar3 = zzuvVar2;
/* 1369 */                                      zzufVar.zzJ(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_35 /* 35 */:
/* 1341 */                                      zztvVar = zztvVar2;
/* 1342 */                                      obj3 = obj4;
/* 1343 */                                      zzuvVar3 = zzuvVar2;
/* 1352 */                                      zzufVar.zzx(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case Build.API_LEVELS.API_36 /* 36 */:
/* 1324 */                                      zztvVar = zztvVar2;
/* 1325 */                                      obj3 = obj4;
/* 1326 */                                      zzuvVar3 = zzuvVar2;
/* 1335 */                                      zzufVar.zzB(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 37:
/* 1307 */                                      zztvVar = zztvVar2;
/* 1308 */                                      obj3 = obj4;
/* 1309 */                                      zzuvVar3 = zzuvVar2;
/* 1318 */                                      zzufVar.zzE(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 38:
/* 1290 */                                      zztvVar = zztvVar2;
/* 1291 */                                      obj3 = obj4;
/* 1292 */                                      zzuvVar3 = zzuvVar2;
/* 1301 */                                      zzufVar.zzM(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 39:
/* 1273 */                                      zztvVar = zztvVar2;
/* 1274 */                                      obj3 = obj4;
/* 1275 */                                      zzuvVar3 = zzuvVar2;
/* 1284 */                                      zzufVar.zzD(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 1256 */                                      zztvVar = zztvVar2;
/* 1257 */                                      obj3 = obj4;
/* 1258 */                                      zzuvVar3 = zzuvVar2;
/* 1267 */                                      zzufVar.zzA(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case RequestError.NO_DEV_KEY /* 41 */:
/* 1239 */                                      zztvVar = zztvVar2;
/* 1240 */                                      obj3 = obj4;
/* 1241 */                                      zzuvVar3 = zzuvVar2;
/* 1250 */                                      zzufVar.zzz(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 42:
/* 1222 */                                      zztvVar = zztvVar2;
/* 1223 */                                      obj3 = obj4;
/* 1224 */                                      zzuvVar3 = zzuvVar2;
/* 1233 */                                      zzufVar.zzv(zztf.zza(obj5, iZzu & 1048575));
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 43:
/* 1202 */                                      zztvVar = zztvVar2;
/* 1203 */                                      obj3 = obj4;
/* 1204 */                                      zzuvVar3 = zzuvVar2;
/* 1205 */                                      obj2 = obj5;
                                                try {
/* 1213 */                                          zzufVar.zzL(zztf.zza(obj2, iZzu & 1048575));
/* 2059 */                                          objZza = obj3;
                                                } catch (zzsw unused) {
/* 2062 */                                          objZza = obj3;
/* 2063 */                                          if (objZza == null) {
                                                        try {
/* 2065 */                                                  objZza = zzuvVar3.zza(obj2);
                                                        } catch (Throwable th) {
/* 2070 */                                                  th = th;
                                                        }
                                                    }
/* 2076 */                                          if (!zzuvVar3.zzk(objZza, zzufVar, 0)) {
/* 2082 */                                              for (i2 = zztvVar.zzk; i2 < zztvVar.zzl; i2++) {
/* 2091 */                                                  zztvVar.zzy(obj2, zztvVar.zzj[i2], objZza, zzuvVar3, obj);
                                                        }
/* 2097 */                                              if (objZza != null) {
/* 2099 */                                                  zzuvVar3.zzj(obj2, objZza);
                                                        }
                                                    }
                                                } catch (Throwable th2) {
/* 1218 */                                          th = th2;
/* 2108 */                                          objZza = obj3;
/* 2109 */                                          i = zztvVar.zzk;
/* 2114 */                                          while (i < zztvVar.zzl) {
/* 2123 */                                              zztvVar.zzy(obj2, zztvVar.zzj[i], objZza, zzuvVar3, obj);
/* 2126 */                                              i++;
/* 2128 */                                              zztvVar = this;
                                                    }
/* 2131 */                                          if (objZza != null) {
/* 2133 */                                              zzuvVar3.zzj(obj2, objZza);
                                                    }
/* 2136 */                                          throw th;
                                                }
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 44:
/* 1174 */                                      zztvVar = zztvVar2;
/* 1180 */                                      List listZza2 = zztf.zza(obj5, iZzu & 1048575);
/* 1184 */                                      zzufVar.zzy(listZza2);
/* 1193 */                                      objZza = zzui.zzn(obj5, iZzc, listZza2, zztvVar.zzw(iZzq), obj4, zzuvVar2);
/* 1198 */                                      zzuvVar3 = zzuvVar2;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 45:
/* 1156 */                                      zztvVar = zztvVar2;
/* 1157 */                                      obj6 = obj5;
/* 1158 */                                      zzuvVar = zzuvVar2;
/* 1167 */                                      zzufVar.zzG(zztf.zza(obj6, iZzu & 1048575));
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 46:
/* 1138 */                                      zztvVar = zztvVar2;
/* 1139 */                                      obj6 = obj5;
/* 1140 */                                      zzuvVar = zzuvVar2;
/* 1149 */                                      zzufVar.zzH(zztf.zza(obj6, iZzu & 1048575));
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 47:
/* 1120 */                                      zztvVar = zztvVar2;
/* 1121 */                                      obj6 = obj5;
/* 1122 */                                      zzuvVar = zzuvVar2;
/* 1131 */                                      zzufVar.zzI(zztf.zza(obj6, iZzu & 1048575));
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 48:
/* 1102 */                                      zztvVar = zztvVar2;
/* 1103 */                                      obj6 = obj5;
/* 1104 */                                      zzuvVar = zzuvVar2;
/* 1113 */                                      zzufVar.zzJ(zztf.zza(obj6, iZzu & 1048575));
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 49:
/* 1080 */                                      zztvVar = zztvVar2;
/* 1081 */                                      obj6 = obj5;
/* 1082 */                                      zzuvVar = zzuvVar2;
/* 1095 */                                      zzufVar.zzC(zztf.zza(obj6, iZzu & 1048575), zztvVar.zzx(iZzq), zzryVar);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 1020 */                                      zztvVar = zztvVar2;
/* 1021 */                                      obj6 = obj5;
/* 1022 */                                      zzuvVar = zzuvVar2;
/* 1024 */                                      Object objZzz = zztvVar.zzz(iZzq);
/* 1032 */                                      long jZzu = zztvVar.zzu(iZzq) & 1048575;
/* 1034 */                                      Object objZzf = zzvc.zzf(obj6, jZzu);
/* 1038 */                                      if (objZzf == null) {
/* 1066 */                                          objZzf = zztm.zza().zzb();
/* 1070 */                                          zzvc.zzs(obj6, jZzu, objZzf);
                                                } else if (zztn.zza(objZzf)) {
/* 1050 */                                          Object objZzb = zztm.zza().zzb();
/* 1054 */                                          zztn.zzb(objZzb, objZzf);
/* 1057 */                                          zzvc.zzs(obj6, jZzu, objZzb);
/* 1060 */                                          objZzf = objZzb;
                                                }
/* 1077 */                                      throw null;
                                            case 51:
/* 996 */                                       zztvVar = zztvVar2;
/* 997 */                                       obj6 = obj5;
/* 998 */                                       zzuvVar = zzuvVar2;
/* 1010 */                                      zzvc.zzs(obj6, iZzu & 1048575, Double.valueOf(zzufVar.zza()));
/* 1013 */                                      zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 52:
/* 972 */                                       zztvVar = zztvVar2;
/* 973 */                                       obj6 = obj5;
/* 974 */                                       zzuvVar = zzuvVar2;
/* 986 */                                       zzvc.zzs(obj6, iZzu & 1048575, Float.valueOf(zzufVar.zzb()));
/* 989 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 53:
/* 948 */                                       zztvVar = zztvVar2;
/* 949 */                                       obj6 = obj5;
/* 950 */                                       zzuvVar = zzuvVar2;
/* 962 */                                       zzvc.zzs(obj6, iZzu & 1048575, Long.valueOf(zzufVar.zzl()));
/* 965 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 54:
/* 924 */                                       zztvVar = zztvVar2;
/* 925 */                                       obj6 = obj5;
/* 926 */                                       zzuvVar = zzuvVar2;
/* 938 */                                       zzvc.zzs(obj6, iZzu & 1048575, Long.valueOf(zzufVar.zzo()));
/* 941 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 55:
/* 900 */                                       zztvVar = zztvVar2;
/* 901 */                                       obj6 = obj5;
/* 902 */                                       zzuvVar = zzuvVar2;
/* 914 */                                       zzvc.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzufVar.zzg()));
/* 917 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 56:
/* 876 */                                       zztvVar = zztvVar2;
/* 877 */                                       obj6 = obj5;
/* 878 */                                       zzuvVar = zzuvVar2;
/* 890 */                                       zzvc.zzs(obj6, iZzu & 1048575, Long.valueOf(zzufVar.zzk()));
/* 893 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 57:
/* 852 */                                       zztvVar = zztvVar2;
/* 853 */                                       obj6 = obj5;
/* 854 */                                       zzuvVar = zzuvVar2;
/* 866 */                                       zzvc.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzufVar.zzf()));
/* 869 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 58:
/* 828 */                                       zztvVar = zztvVar2;
/* 829 */                                       obj6 = obj5;
/* 830 */                                       zzuvVar = zzuvVar2;
/* 842 */                                       zzvc.zzs(obj6, iZzu & 1048575, Boolean.valueOf(zzufVar.zzN()));
/* 845 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 59:
/* 814 */                                       zztvVar = zztvVar2;
/* 815 */                                       obj6 = obj5;
/* 816 */                                       zzuvVar = zzuvVar2;
/* 818 */                                       zztvVar.zzG(obj6, iZzu, zzufVar);
/* 821 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 60:
/* 790 */                                       zztvVar = zztvVar2;
/* 791 */                                       obj6 = obj5;
/* 792 */                                       zzuvVar = zzuvVar2;
/* 798 */                                       zzts zztsVar3 = (zzts) zztvVar.zzB(obj6, iZzc, iZzq);
/* 804 */                                       zzufVar.zzu(zztsVar3, zztvVar.zzx(iZzq), zzryVar);
/* 807 */                                       zztvVar.zzK(obj6, iZzc, iZzq, zztsVar3);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 61:
/* 770 */                                       zztvVar = zztvVar2;
/* 771 */                                       obj6 = obj5;
/* 772 */                                       zzuvVar = zzuvVar2;
/* 780 */                                       zzvc.zzs(obj6, iZzu & 1048575, zzufVar.zzp());
/* 783 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 62:
/* 746 */                                       zztvVar = zztvVar2;
/* 747 */                                       obj6 = obj5;
/* 748 */                                       zzuvVar = zzuvVar2;
/* 760 */                                       zzvc.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzufVar.zzj()));
/* 763 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 63:
/* 703 */                                       zztvVar = zztvVar2;
/* 704 */                                       obj6 = obj5;
/* 705 */                                       zzuvVar = zzuvVar2;
/* 707 */                                       int iZze2 = zzufVar.zze();
/* 711 */                                       zzsr zzsrVarZzw2 = zztvVar.zzw(iZzq);
/* 715 */                                       if (zzsrVarZzw2 != null && !zzsrVarZzw2.zza(iZze2)) {
/* 724 */                                           objZza = zzui.zzo(obj6, iZzc, iZze2, obj4, zzuvVar);
/* 548 */                                           zzuvVar3 = zzuvVar;
/* 549 */                                           zztvVar2 = zztvVar;
                                                }
/* 736 */                                       zzvc.zzs(obj6, iZzu & 1048575, Integer.valueOf(iZze2));
/* 739 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 64:
/* 680 */                                       zztvVar = zztvVar2;
/* 681 */                                       obj6 = obj5;
/* 682 */                                       zzuvVar = zzuvVar2;
/* 694 */                                       zzvc.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzufVar.zzh()));
/* 697 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 65:
/* 657 */                                       zztvVar = zztvVar2;
/* 658 */                                       obj6 = obj5;
/* 659 */                                       zzuvVar = zzuvVar2;
/* 671 */                                       zzvc.zzs(obj6, iZzu & 1048575, Long.valueOf(zzufVar.zzm()));
/* 674 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 66:
/* 634 */                                       zztvVar = zztvVar2;
/* 635 */                                       obj6 = obj5;
/* 636 */                                       zzuvVar = zzuvVar2;
/* 648 */                                       zzvc.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzufVar.zzi()));
/* 651 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 67:
/* 611 */                                       zztvVar = zztvVar2;
/* 612 */                                       obj6 = obj5;
/* 613 */                                       zzuvVar = zzuvVar2;
/* 625 */                                       zzvc.zzs(obj6, iZzu & 1048575, Long.valueOf(zzufVar.zzn()));
/* 628 */                                       zztvVar.zzI(obj6, iZzc, iZzq);
/* 596 */                                       obj3 = obj4;
/* 597 */                                       zzuvVar3 = zzuvVar;
/* 2059 */                                      objZza = obj3;
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            case 68:
/* 575 */                                       zztvVar = zztvVar2;
/* 576 */                                       obj6 = obj5;
/* 577 */                                       zzuvVar = zzuvVar2;
                                                try {
/* 583 */                                           zzts zztsVar4 = (zzts) zztvVar.zzB(obj6, iZzc, iZzq);
/* 589 */                                           zzufVar.zzt(zztsVar4, zztvVar.zzx(iZzq), zzryVar);
/* 592 */                                           zztvVar.zzK(obj6, iZzc, iZzq, zztsVar4);
/* 596 */                                           obj3 = obj4;
/* 597 */                                           zzuvVar3 = zzuvVar;
/* 2059 */                                          objZza = obj3;
                                                } catch (zzsw unused2) {
/* 604 */                                           obj2 = obj6;
/* 605 */                                           obj3 = obj4;
/* 606 */                                           zzuvVar3 = zzuvVar;
/* 2062 */                                          objZza = obj3;
/* 2063 */                                          if (objZza == null) {
/* 2065 */                                              objZza = zzuvVar3.zza(obj2);
                                                    }
/* 2076 */                                          if (!zzuvVar3.zzk(objZza, zzufVar, 0)) {
/* 2082 */                                              while (i2 < zztvVar.zzl) {
/* 2091 */                                                  zztvVar.zzy(obj2, zztvVar.zzj[i2], objZza, zzuvVar3, obj);
                                                        }
/* 2097 */                                              if (objZza != null) {
/* 2099 */                                                  zzuvVar3.zzj(obj2, objZza);
                                                        }
                                                    }
                                                } catch (Throwable th3) {
/* 600 */                                           th = th3;
/* 601 */                                           obj2 = obj6;
/* 97 */                                            obj3 = obj4;
/* 98 */                                            zzuvVar3 = zzuvVar;
/* 2108 */                                          objZza = obj3;
/* 2109 */                                          i = zztvVar.zzk;
/* 2114 */                                          while (i < zztvVar.zzl) {
/* 2123 */                                              zztvVar.zzy(obj2, zztvVar.zzj[i], objZza, zzuvVar3, obj);
/* 2126 */                                              i++;
/* 2128 */                                              zztvVar = this;
                                                    }
/* 2131 */                                          if (objZza != null) {
/* 2133 */                                              zzuvVar3.zzj(obj2, objZza);
                                                    }
/* 2136 */                                          throw th;
                                                }
/* 549 */                                       zztvVar2 = zztvVar;
                                                break;
                                            default:
/* 503 */                                       objZza = obj4 == null ? zzuvVar2.zza(obj5) : obj4;
                                                try {
/* 508 */                                           if (zzuvVar2.zzk(objZza, zzufVar, 0)) {
/* 544 */                                               zztvVar = zztvVar2;
/* 546 */                                               zzuvVar = zzuvVar2;
/* 548 */                                               zzuvVar3 = zzuvVar;
/* 549 */                                               zztvVar2 = zztvVar;
                                                    } else {
/* 510 */                                               int i3 = zztvVar2.zzk;
/* 514 */                                               while (i3 < zztvVar2.zzl) {
/* 524 */                                                   zzuv zzuvVar4 = zzuvVar2;
/* 525 */                                                   zztvVar2.zzy(obj, zztvVar2.zzj[i3], objZza, zzuvVar4, obj);
/* 531 */                                                   i3++;
/* 535 */                                                   obj5 = obj;
/* 536 */                                                   zztvVar2 = zztvVar2;
/* 537 */                                                   zzuvVar2 = zzuvVar4;
                                                        }
/* 540 */                                               obj2 = obj5;
/* 443 */                                               zzuvVar3 = zzuvVar2;
                                                    }
                                                } catch (zzsw unused3) {
/* 565 */                                           zztvVar = zztvVar2;
/* 569 */                                           obj2 = obj5;
/* 570 */                                           zzuvVar3 = zzuvVar2;
/* 2063 */                                          if (objZza == null) {
/* 2065 */                                              objZza = zzuvVar3.zza(obj2);
                                                    }
/* 2076 */                                          if (!zzuvVar3.zzk(objZza, zzufVar, 0)) {
/* 2082 */                                              while (i2 < zztvVar.zzl) {
/* 2091 */                                                  zztvVar.zzy(obj2, zztvVar.zzj[i2], objZza, zzuvVar3, obj);
                                                        }
/* 2097 */                                              if (objZza != null) {
/* 2099 */                                                  zzuvVar3.zzj(obj2, objZza);
                                                        }
                                                    }
                                                } catch (Throwable th4) {
/* 552 */                                           th = th4;
/* 555 */                                           zztvVar = zztvVar2;
/* 559 */                                           obj2 = obj5;
/* 560 */                                           zzuvVar3 = zzuvVar2;
                                                }
                                                break;
                                        }
                                    } catch (zzsw unused4) {
/* 497 */                               zztvVar = zztvVar2;
/* 498 */                               obj3 = obj4;
/* 499 */                               zzuvVar3 = zzuvVar2;
/* 500 */                               obj2 = obj5;
                                    }
                                } catch (Throwable th5) {
/* 494 */                           th = th5;
/* 462 */                           zzuv zzuvVar5 = zzuvVar2;
/* 463 */                           zztvVar = zztvVar2;
/* 464 */                           obj3 = obj4;
/* 465 */                           zzuvVar3 = zzuvVar5;
/* 466 */                           obj2 = obj5;
/* 2108 */                          objZza = obj3;
/* 2109 */                          i = zztvVar.zzk;
/* 2114 */                          while (i < zztvVar.zzl) {
/* 2123 */                              zztvVar.zzy(obj2, zztvVar.zzj[i], objZza, zzuvVar3, obj);
/* 2126 */                              i++;
/* 2128 */                              zztvVar = this;
                                    }
/* 2131 */                          if (objZza != null) {
/* 2133 */                              zzuvVar3.zzj(obj2, objZza);
                                    }
/* 2136 */                          throw th;
                                }
                            } else if (iZzc == Integer.MAX_VALUE) {
/* 34 */                        int i4 = zztvVar2.zzk;
/* 38 */                        while (i4 < zztvVar2.zzl) {
/* 48 */                            zztvVar2.zzy(obj, zztvVar2.zzj[i4], objZza, zzuvVar3, obj);
/* 54 */                            i4++;
/* 56 */                            zzuvVar3 = zzuvVar3;
                                }
/* 60 */                        obj2 = obj;
/* 62 */                        zzuvVar3 = zzuvVar3;
                            } else {
/* 65 */                        Object obj7 = obj;
/* 67 */                        zzuvVar = zzuvVar3;
/* 68 */                        obj4 = objZza;
                                try {
/* 77 */                            zzsm zzsmVarZza = !zztvVar2.zzh ? null : zzryVar.zza(zztvVar2.zzg, iZzc);
/* 81 */                            if (zzsmVarZza != null) {
/* 83 */                                if (zzsdVarZzi == null) {
                                            try {
/* 88 */                                        zzsdVarZzi = ((zzsk) obj7).zzi();
                                            } catch (Throwable th6) {
/* 94 */                                        th = th6;
/* 95 */                                        zztvVar = zztvVar2;
/* 96 */                                        obj2 = obj7;
/* 97 */                                        obj3 = obj4;
/* 98 */                                        zzuvVar3 = zzuvVar;
/* 2108 */                                      objZza = obj3;
/* 2109 */                                      i = zztvVar.zzk;
/* 2114 */                                      while (i < zztvVar.zzl) {
/* 2123 */                                          zztvVar.zzy(obj2, zztvVar.zzj[i], objZza, zzuvVar3, obj);
/* 2126 */                                          i++;
/* 2128 */                                          zztvVar = this;
                                                }
/* 2131 */                                      if (objZza != null) {
/* 2133 */                                          zzuvVar3.zzj(obj2, objZza);
                                                }
/* 2136 */                                      throw th;
                                            }
                                        }
/* 101 */                               zzsl zzslVar = zzsmVarZza.zza;
/* 103 */                               zzvg zzvgVar = zzvg.zzn;
/* 105 */                               zzvg zzvgVar2 = zzslVar.zzb;
/* 107 */                               if (zzvgVar2 == zzvgVar) {
/* 395 */                                   zzufVar.zzg();
/* 398 */                                   throw null;
                                        }
                                        switch (zzvgVar2.ordinal()) {
                                            case 0:
/* 347 */                                       objValueOf = Double.valueOf(zzufVar.zza());
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if ((iOrdinal != 9 || iOrdinal == 10) && (objZze = zzsdVarZzi.zze(zzslVar)) != null) {
/* 370 */                                           byte[] bArr = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case 1:
/* 338 */                                       objValueOf = Float.valueOf(zzufVar.zzb());
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr2 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr3 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case 2:
/* 329 */                                       objValueOf = Long.valueOf(zzufVar.zzl());
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr4 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr5 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case 3:
/* 320 */                                       objValueOf = Long.valueOf(zzufVar.zzo());
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr6 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr7 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case 4:
/* 311 */                                       objValueOf = Integer.valueOf(zzufVar.zzg());
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr8 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr9 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case 5:
/* 302 */                                       objValueOf = Long.valueOf(zzufVar.zzk());
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr10 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr11 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case 6:
/* 293 */                                       objValueOf = Integer.valueOf(zzufVar.zzf());
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr12 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr13 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case 7:
/* 284 */                                       objValueOf = Boolean.valueOf(zzufVar.zzN());
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr14 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr15 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case 8:
/* 275 */                                       objValueOf = zzufVar.zzr();
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr16 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr17 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case 9:
/* 229 */                                       Object objZze2 = zzsdVarZzi.zze(zzslVar);
/* 235 */                                       if (!(objZze2 instanceof zzsn)) {
/* 274 */                                           throw null;
                                                }
/* 245 */                                       zzug zzugVarZzb = zzuc.zza().zzb(objZze2.getClass());
/* 256 */                                       if (!((zzsn) objZze2).zzL()) {
/* 258 */                                           Object objZze3 = zzugVarZzb.zze();
/* 262 */                                           zzugVarZzb.zzg(objZze3, objZze2);
/* 265 */                                           zzsdVarZzi.zzi(zzslVar, objZze3);
/* 268 */                                           objZze2 = objZze3;
                                                }
/* 269 */                                       zzufVar.zzt(objZze2, zzugVarZzb, zzryVar);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                                break;
                                            case 10:
/* 183 */                                       Object objZze4 = zzsdVarZzi.zze(zzslVar);
/* 189 */                                       if (!(objZze4 instanceof zzsn)) {
/* 228 */                                           throw null;
                                                }
/* 199 */                                       zzug zzugVarZzb2 = zzuc.zza().zzb(objZze4.getClass());
/* 210 */                                       if (!((zzsn) objZze4).zzL()) {
/* 212 */                                           Object objZze5 = zzugVarZzb2.zze();
/* 216 */                                           zzugVarZzb2.zzg(objZze5, objZze4);
/* 219 */                                           zzsdVarZzi.zzi(zzslVar, objZze5);
/* 222 */                                           objZze4 = objZze5;
                                                }
/* 223 */                                       zzufVar.zzu(objZze4, zzugVarZzb2, zzryVar);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                                break;
                                            case 11:
/* 177 */                                       objValueOf = zzufVar.zzp();
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr18 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr19 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case 12:
/* 171 */                                       objValueOf = Integer.valueOf(zzufVar.zzj());
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr110 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr111 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 166 */                                       throw new IllegalStateException("Shouldn't reach here.");
                                            case 14:
/* 153 */                                       objValueOf = Integer.valueOf(zzufVar.zzh());
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr112 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr113 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 143 */                                       objValueOf = Long.valueOf(zzufVar.zzm());
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr114 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr115 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case 16:
/* 133 */                                       objValueOf = Integer.valueOf(zzufVar.zzi());
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr116 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr117 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            case 17:
/* 123 */                                       objValueOf = Long.valueOf(zzufVar.zzn());
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr118 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr119 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                            default:
/* 116 */                                       objValueOf = null;
/* 351 */                                       iOrdinal = zzvgVar2.ordinal();
/* 357 */                                       if (iOrdinal != 9) {
/* 370 */                                           byte[] bArr1110 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                } else {
/* 370 */                                           byte[] bArr1111 = zzsv.zzb;
/* 384 */                                           objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                                }
/* 388 */                                       zzsdVarZzi.zzi(zzslVar, objValueOf);
/* 391 */                                       objZza = obj4;
/* 392 */                                       zzuvVar3 = zzuvVar;
                                                break;
                                        }
                                    } else {
/* 406 */                               objZza = obj4 == null ? zzuvVar.zza(obj7) : obj4;
                                        try {
/* 411 */                                   if (zzuvVar.zzk(objZza, zzufVar, 0)) {
/* 448 */                                       zzuvVar3 = zzuvVar;
                                            } else {
/* 413 */                                       int i5 = zztvVar2.zzk;
/* 417 */                                       while (i5 < zztvVar2.zzl) {
/* 423 */                                           zzuv zzuvVar6 = zzuvVar;
/* 426 */                                           Object obj8 = obj7;
/* 431 */                                           zztvVar2.zzy(obj8, zztvVar2.zzj[i5], objZza, zzuvVar6, obj);
/* 436 */                                           i5++;
/* 438 */                                           obj7 = obj8;
/* 439 */                                           zzuvVar = zzuvVar6;
                                                }
/* 441 */                                       zzuvVar2 = zzuvVar;
/* 442 */                                       obj2 = obj7;
/* 443 */                                       zzuvVar3 = zzuvVar2;
                                            }
                                        } catch (Throwable th7) {
/* 451 */                                   th = th7;
/* 454 */                                   obj2 = obj7;
/* 455 */                                   zzuvVar3 = zzuvVar;
/* 456 */                                   zztvVar = zztvVar2;
                                        }
                                    }
                                } catch (Throwable th8) {
/* 459 */                           th = th8;
/* 460 */                           zzuvVar2 = zzuvVar;
/* 461 */                           obj5 = obj7;
/* 462 */                           zzuv zzuvVar7 = zzuvVar2;
/* 463 */                           zztvVar = zztvVar2;
/* 464 */                           obj3 = obj4;
/* 465 */                           zzuvVar3 = zzuvVar7;
/* 466 */                           obj2 = obj5;
/* 2108 */                          objZza = obj3;
                                }
                            }
                        } catch (Throwable th9) {
/* 2103 */                  th = th9;
/* 2104 */                  obj2 = obj;
/* 2106 */                  zztvVar = zztvVar2;
/* 2107 */                  obj3 = objZza;
                        }
/* 2109 */              i = zztvVar.zzk;
/* 2114 */              while (i < zztvVar.zzl) {
/* 2123 */                  zztvVar.zzy(obj2, zztvVar.zzj[i], objZza, zzuvVar3, obj);
/* 2126 */                  i++;
/* 2128 */                  zztvVar = this;
                        }
/* 2131 */              if (objZza != null) {
/* 2133 */                  zzuvVar3.zzj(obj2, objZza);
                        }
/* 2136 */              throw th;
                    }
/* 2097 */          if (objZza != null) {
/* 2099 */              zzuvVar3.zzj(obj2, objZza);
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final void zzi(Object obj, byte[] bArr, int i, int i2, zzqb zzqbVar) throws IOException {
/* 8 */             zzc(obj, bArr, i, i2, 0, zzqbVar);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:7:0x0023  */
                @Override // com.google.android.recaptcha.internal.zzug
                public final void zzj(Object obj, zzvi zzviVar) throws IOException {
                    Map.Entry entry;
                    Iterator it;
                    boolean z;
                    int i;
                    int i2;
                    int i3;
                    int i4;
/* 1 */             zztv<T> zztvVar = this;
/* 9 */             if (zztvVar.zzh) {
/* 14 */                zzsd zzsdVar = ((zzsk) obj).zzb;
/* 22 */                if (zzsdVar.zza.isEmpty()) {
/* 36 */                    entry = null;
/* 37 */                    it = null;
                        } else {
/* 24 */                    Iterator itZzf = zzsdVar.zzf();
/* 32 */                    entry = (Map.Entry) itZzf.next();
/* 34 */                    it = itZzf;
                        }
                    } else {
/* 36 */                entry = null;
/* 37 */                it = null;
                    }
/* 38 */            int[] iArr = zztvVar.zzc;
/* 40 */            Unsafe unsafe = zzb;
/* 42 */            int i5 = 1048575;
/* 45 */            int i6 = 1048575;
/* 46 */            int i7 = 0;
/* 47 */            int i8 = 0;
/* 49 */            while (i7 < iArr.length) {
/* 51 */                int iZzu = zztvVar.zzu(i7);
/* 55 */                int iZzt = zzt(iZzu);
/* 59 */                int i9 = iArr[i7];
/* 65 */                if (iZzt <= 17) {
/* 69 */                    int i10 = iArr[i7 + 2];
/* 71 */                    z = true;
/* 73 */                    int i11 = i10 & i5;
/* 75 */                    if (i11 != i6) {
/* 82 */                        i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
/* 87 */                        i6 = i11;
                            }
/* 95 */                    i = i6;
/* 96 */                    i2 = i8;
/* 90 */                    i3 = 1 << (i10 >>> 20);
                        } else {
/* 100 */                   z = true;
/* 103 */                   i = i6;
/* 104 */                   i2 = i8;
/* 105 */                   i3 = 0;
                        }
                        while (true) {
/* 106 */                   if (entry != null) {
/* 108 */                       zzrz zzrzVar = zztvVar.zzn;
/* 114 */                       i4 = i5;
/* 122 */                       if (((zzsl) entry.getKey()).zza <= i9) {
/* 124 */                           zzrzVar.zzb(zzviVar, entry);
/* 142 */                           entry = it.hasNext() ? (Map.Entry) it.next() : null;
/* 139 */                           i5 = i4;
                                }
                            } else {
/* 145 */                       i4 = i5;
                            }
                        }
/* 147 */               long j = iZzu & i4;
                        switch (iZzt) {
                            case 0:
/* 1262 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1268 */                          zzviVar.zzf(i9, zzvc.zza(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 1:
/* 1246 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1252 */                          zzviVar.zzo(i9, zzvc.zzb(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 2:
/* 1230 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1236 */                          zzviVar.zzt(i9, unsafe.getLong(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 3:
/* 1214 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1220 */                          zzviVar.zzK(i9, unsafe.getLong(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 4:
/* 1198 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1204 */                          zzviVar.zzr(i9, unsafe.getInt(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 5:
/* 1182 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1188 */                          zzviVar.zzm(i9, unsafe.getLong(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 6:
/* 1166 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1172 */                          zzviVar.zzk(i9, unsafe.getInt(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 7:
/* 1150 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1156 */                          zzviVar.zzb(i9, zzvc.zzw(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 8:
/* 1134 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1140 */                          zzT(i9, unsafe.getObject(obj, j), zzviVar);
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 9:
/* 1114 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1124 */                          zzviVar.zzv(i9, unsafe.getObject(obj, j), zztvVar.zzx(i7));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 10:
/* 1097 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1105 */                          zzviVar.zzd(i9, (zzqm) unsafe.getObject(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 11:
/* 1082 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1088 */                          zzviVar.zzI(i9, unsafe.getInt(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 12:
/* 1067 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1073 */                          zzviVar.zzi(i9, unsafe.getInt(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1052 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1058 */                          zzviVar.zzx(i9, unsafe.getInt(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 14:
/* 1037 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1043 */                          zzviVar.zzz(i9, unsafe.getLong(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1022 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1028 */                          zzviVar.zzB(i9, unsafe.getInt(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 16:
/* 1004 */                      if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 1010 */                          zzviVar.zzD(i9, unsafe.getLong(obj, j));
                                }
/* 1013 */                      zztvVar = this;
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 17:
/* 984 */                       if (zztvVar.zzO(obj, i7, i, i2, i3)) {
/* 994 */                           zzviVar.zzq(i9, unsafe.getObject(obj, j), zztvVar.zzx(i7));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 18:
/* 974 */                       zzui.zzs(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 19:
/* 960 */                       zzui.zzw(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 20:
/* 946 */                       zzui.zzy(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 932 */                       zzui.zzE(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 918 */                       zzui.zzx(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 904 */                       zzui.zzv(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 24:
/* 890 */                       zzui.zzu(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 876 */                       zzui.zzr(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 844 */                       int i12 = iArr[i7];
/* 850 */                       List list = (List) unsafe.getObject(obj, j);
/* 852 */                       int i13 = zzui.zza;
/* 854 */                       if (list != null && !list.isEmpty()) {
/* 862 */                           zzviVar.zzH(i12, list);
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 802 */                       int i14 = iArr[i7];
/* 808 */                       List list2 = (List) unsafe.getObject(obj, j);
/* 810 */                       zzug zzugVarZzx = zztvVar.zzx(i7);
/* 814 */                       int i15 = zzui.zza;
/* 816 */                       if (list2 != null && !list2.isEmpty()) {
/* 829 */                           for (int i16 = 0; i16 < list2.size(); i16++) {
/* 838 */                               ((zzqw) zzviVar).zzv(i14, list2.get(i16), zzugVarZzx);
                                    }
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 779 */                       int i17 = iArr[i7];
/* 785 */                       List list3 = (List) unsafe.getObject(obj, j);
/* 787 */                       int i18 = zzui.zza;
/* 789 */                       if (list3 != null && !list3.isEmpty()) {
/* 797 */                           zzviVar.zze(i17, list3);
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 774 */                       zzui.zzD(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 760 */                       zzui.zzt(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 746 */                       zzui.zzz(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 32:
/* 732 */                       zzui.zzA(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 718 */                       zzui.zzB(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 704 */                       zzui.zzC(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 690 */                       zzui.zzs(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 675 */                       zzui.zzw(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 37:
/* 660 */                       zzui.zzy(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 38:
/* 645 */                       zzui.zzE(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 39:
/* 630 */                       zzui.zzx(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 615 */                       zzui.zzv(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 600 */                       zzui.zzu(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 42:
/* 585 */                       zzui.zzr(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 43:
/* 570 */                       zzui.zzD(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 44:
/* 555 */                       zzui.zzt(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 45:
/* 540 */                       zzui.zzz(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 46:
/* 525 */                       zzui.zzA(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 47:
/* 510 */                       zzui.zzB(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 48:
/* 495 */                       zzui.zzC(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 49:
/* 443 */                       int i19 = iArr[i7];
/* 449 */                       List list4 = (List) unsafe.getObject(obj, j);
/* 451 */                       zzug zzugVarZzx2 = zztvVar.zzx(i7);
/* 455 */                       int i20 = zzui.zza;
/* 457 */                       if (list4 != null && !list4.isEmpty()) {
/* 470 */                           for (int i21 = 0; i21 < list4.size(); i21++) {
/* 479 */                               ((zzqw) zzviVar).zzq(i19, list4.get(i21), zzugVarZzx2);
                                    }
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 432 */                       if (unsafe.getObject(obj, j) != null) {
/* 442 */                           throw null;
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 51:
/* 417 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 423 */                           zzviVar.zzf(i9, zzn(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 52:
/* 402 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 408 */                           zzviVar.zzo(i9, zzo(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 53:
/* 387 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 393 */                           zzviVar.zzt(i9, zzv(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 54:
/* 372 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 378 */                           zzviVar.zzK(i9, zzv(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 55:
/* 357 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 363 */                           zzviVar.zzr(i9, zzp(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 56:
/* 342 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 348 */                           zzviVar.zzm(i9, zzv(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 57:
/* 327 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 333 */                           zzviVar.zzk(i9, zzp(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 58:
/* 312 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 318 */                           zzviVar.zzb(i9, zzS(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 59:
/* 297 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 303 */                           zzT(i9, unsafe.getObject(obj, j), zzviVar);
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 60:
/* 278 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 288 */                           zzviVar.zzv(i9, unsafe.getObject(obj, j), zztvVar.zzx(i7));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 61:
/* 262 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 270 */                           zzviVar.zzd(i9, (zzqm) unsafe.getObject(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 62:
/* 248 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 254 */                           zzviVar.zzI(i9, zzp(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 63:
/* 234 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 240 */                           zzviVar.zzi(i9, zzp(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 64:
/* 220 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 226 */                           zzviVar.zzx(i9, zzp(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 65:
/* 206 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 212 */                           zzviVar.zzz(i9, zzv(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 66:
/* 192 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 198 */                           zzviVar.zzB(i9, zzp(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 67:
/* 178 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 184 */                           zzviVar.zzD(i9, zzv(obj, j));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            case 68:
/* 160 */                       if (zztvVar.zzR(obj, i9, i7)) {
/* 170 */                           zzviVar.zzq(i9, unsafe.getObject(obj, j), zztvVar.zzx(i7));
                                }
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                            default:
/* 1271 */                      i7 += 3;
/* 1273 */                      i8 = i2;
/* 1274 */                      i5 = i4;
/* 1276 */                      i6 = i;
/* 1277 */                      entry = entry;
                                break;
                        }
                    }
/* 1282 */          while (entry != null) {
/* 1286 */              zztvVar.zzn.zzb(zzviVar, entry);
/* 1303 */              entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
/* 1311 */          ((zzsn) obj).zzc.zzl(zzviVar);
                }

                @Override // com.google.android.recaptcha.internal.zzug
                public final boolean zzk(Object obj, Object obj2) {
                    boolean zZzF;
/* 6 */             for (int i = 0; i < this.zzc.length; i += 3) {
/* 8 */                 int iZzu = zzu(i);
/* 15 */                long j = iZzu & 1048575;
                        switch (zzt(iZzu)) {
                            case 0:
/* 427 */                       if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzvc.zza(obj, j)) != Double.doubleToLongBits(zzvc.zza(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 1:
/* 402 */                       if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzvc.zzb(obj, j)) != Float.floatToIntBits(zzvc.zzb(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 2:
/* 383 */                       if (!zzL(obj, obj2, i) || zzvc.zzd(obj, j) != zzvc.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 3:
/* 364 */                       if (!zzL(obj, obj2, i) || zzvc.zzd(obj, j) != zzvc.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 4:
/* 347 */                       if (!zzL(obj, obj2, i) || zzvc.zzc(obj, j) != zzvc.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 5:
/* 328 */                       if (!zzL(obj, obj2, i) || zzvc.zzd(obj, j) != zzvc.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 6:
/* 310 */                       if (!zzL(obj, obj2, i) || zzvc.zzc(obj, j) != zzvc.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 7:
/* 292 */                       if (!zzL(obj, obj2, i) || zzvc.zzw(obj, j) != zzvc.zzw(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 8:
/* 270 */                       if (!zzL(obj, obj2, i) || !zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 9:
/* 248 */                       if (!zzL(obj, obj2, i) || !zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 10:
/* 226 */                       if (!zzL(obj, obj2, i) || !zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 11:
/* 208 */                       if (!zzL(obj, obj2, i) || zzvc.zzc(obj, j) != zzvc.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 12:
/* 190 */                       if (!zzL(obj, obj2, i) || zzvc.zzc(obj, j) != zzvc.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 172 */                       if (!zzL(obj, obj2, i) || zzvc.zzc(obj, j) != zzvc.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 14:
/* 152 */                       if (!zzL(obj, obj2, i) || zzvc.zzd(obj, j) != zzvc.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 134 */                       if (!zzL(obj, obj2, i) || zzvc.zzc(obj, j) != zzvc.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 16:
/* 114 */                       if (!zzL(obj, obj2, i) || zzvc.zzd(obj, j) != zzvc.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 17:
/* 92 */                        if (!zzL(obj, obj2, i) || !zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
/* 1 */                             return false;
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
/* 80 */                        zZzF = zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j));
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 67 */                        zZzF = zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j));
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
/* 31 */                        long jZzr = zzr(i) & 1048575;
/* 41 */                        if (zzvc.zzc(obj, jZzr) != zzvc.zzc(obj2, jZzr) || !zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            default:
                                continue;
                                break;
                        }
/* 84 */                if (!zZzF) {
/* 1 */                     return false;
                        }
                    }
/* 468 */           if (!((zzsn) obj).zzc.equals(((zzsn) obj2).zzc)) {
/* 1 */                 return false;
                    }
/* 473 */           if (this.zzh) {
/* 483 */               return ((zzsk) obj).zzb.equals(((zzsk) obj2).zzb);
                    }
/* 488 */           return true;
                }

                /* JADX WARN: Code duplicated, block: B:42:0x008d  */
                /* JADX WARN: Code duplicated, block: B:44:0x009c  */
                /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
                /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[SYNTHETIC] */
                @Override // com.google.android.recaptcha.internal.zzug
                public final boolean zzl(Object obj) {
                    int i;
                    int i2;
                    List list;
                    zzug zzugVarZzx;
                    int i3;
/* 5 */             int i4 = 0;
/* 6 */             int i5 = 0;
/* 7 */             int i6 = 1048575;
/* 11 */            while (i5 < this.zzk) {
/* 13 */                int[] iArr = this.zzj;
/* 15 */                int[] iArr2 = this.zzc;
/* 17 */                int i7 = iArr[i5];
/* 19 */                int i8 = iArr2[i7];
/* 21 */                int iZzu = zzu(i7);
/* 27 */                int i9 = iArr2[i7 + 2];
/* 29 */                int i10 = i9 & 1048575;
/* 33 */                int i11 = 1 << (i9 >>> 20);
/* 34 */                if (i10 != i6) {
/* 36 */                    if (i10 != 1048575) {
/* 41 */                        i4 = zzb.getInt(obj, i10);
                            }
/* 46 */                    i2 = i4;
/* 47 */                    i = i10;
                        } else {
/* 49 */                    int i12 = i4;
/* 50 */                    i = i6;
/* 52 */                    i2 = i12;
                        }
/* 56 */                if ((268435456 & iZzu) != 0 && !zzO(obj, i7, i, i2, i11)) {
/* 1 */                     return false;
                        }
/* 68 */                int iZzt = zzt(iZzu);
/* 74 */                if (iZzt == 9 || iZzt == 17) {
/* 188 */                   if (zzO(obj, i7, i, i2, i11) && !zzP(obj, iZzu, zzx(i7))) {
/* 1 */                         return false;
                            }
                        } else if (iZzt == 27) {
/* 149 */                   list = (List) zzvc.zzf(obj, iZzu & 1048575);
/* 155 */                   if (list.isEmpty()) {
                                continue;
                            } else {
/* 157 */                       zzugVarZzx = zzx(i7);
/* 166 */                       for (i3 = 0; i3 < list.size(); i3++) {
/* 176 */                           if (!zzugVarZzx.zzl(list.get(i3))) {
/* 1 */                                 return false;
                                    }
                                }
                            }
                        } else if (iZzt == 60 || iZzt == 68) {
/* 129 */                   if (zzR(obj, i8, i7) && !zzP(obj, iZzu, zzx(i7))) {
/* 1 */                         return false;
                            }
                        } else if (iZzt == 49) {
/* 149 */                   list = (List) zzvc.zzf(obj, iZzu & 1048575);
/* 155 */                   if (list.isEmpty()) {
/* 157 */                       zzugVarZzx = zzx(i7);
/* 166 */                       while (i3 < list.size()) {
/* 176 */                           if (!zzugVarZzx.zzl(list.get(i3))) {
/* 1 */                                 return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (iZzt == 50 && !((zztm) zzvc.zzf(obj, iZzu & 1048575)).isEmpty()) {
/* 124 */                   throw null;
                        }
/* 201 */               i5++;
/* 203 */               i6 = i;
/* 204 */               i4 = i2;
                    }
                    return !this.zzh || ((zzsk) obj).zzb.zzk();
                }
            }
