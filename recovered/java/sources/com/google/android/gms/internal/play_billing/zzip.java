            package com.google.android.gms.internal.play_billing;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1697u2;
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
            final class zzip<T> implements zzix<T> {
                private static final int[] zza = new int[0];
                private static final Unsafe zzb = zzjq.zzg();
                private final int[] zzc;
                private final Object[] zzd;
                private final int zze;
                private final int zzf;
                private final zzim zzg;
                private final boolean zzh;
                private final int[] zzi;
                private final int zzj;
                private final int zzk;
                private final zzjj zzl;
                private final zzgx zzm;

                private zzip(int[] iArr, Object[] objArr, int i, int i2, zzim zzimVar, boolean z, int[] iArr2, int i3, int i4, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
/* 4 */             this.zzc = iArr;
/* 6 */             this.zzd = objArr;
/* 8 */             this.zze = i;
/* 10 */            this.zzf = i2;
/* 12 */            boolean z2 = false;
/* 13 */            if (zzgxVar != null && (zzimVar instanceof zzhh)) {
/* 19 */                z2 = true;
                    }
/* 20 */            this.zzh = z2;
/* 22 */            this.zzi = iArr2;
/* 24 */            this.zzj = i3;
/* 26 */            this.zzk = i4;
/* 28 */            this.zzl = zzjjVar;
/* 30 */            this.zzm = zzgxVar;
/* 32 */            this.zzg = zzimVar;
                }

                private static void zzA(Object obj) {
/* 5 */             if (zzL(obj)) {
/* 7 */                 return;
                    }
/* 18 */            C1951n4.m6859j("Mutating immutable message: ".concat(String.valueOf(obj)));
                }

                private final void zzB(Object obj, Object obj2, int i) {
/* 5 */             if (zzI(obj2, i)) {
/* 15 */                int iZzs = zzs(i) & 1048575;
/* 16 */                Unsafe unsafe = zzb;
                        long j = iZzs;
/* 19 */                Object object = unsafe.getObject(obj2, j);
/* 23 */                if (object == null) {
/* 88 */                    pk3.m7468d(this.zzc[i], obj2);
/* 91 */                    return;
                        }
/* 25 */                zzix zzixVarZzv = zzv(i);
/* 33 */                if (!zzI(obj, i)) {
/* 39 */                    if (zzL(object)) {
/* 45 */                        Object objZze = zzixVarZzv.zze();
/* 49 */                        zzixVarZzv.zzg(objZze, object);
/* 52 */                        unsafe.putObject(obj, j, objZze);
                            } else {
/* 41 */                        unsafe.putObject(obj, j, object);
                            }
/* 55 */                    zzD(obj, i);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, j);
/* 67 */                if (!zzL(object2)) {
/* 69 */                    Object objZze2 = zzixVarZzv.zze();
/* 73 */                    zzixVarZzv.zzg(objZze2, object2);
/* 76 */                    unsafe.putObject(obj, j, objZze2);
/* 79 */                    object2 = objZze2;
                        }
/* 80 */                zzixVarZzv.zzg(object2, object);
                    }
                }

                private final void zzC(Object obj, Object obj2, int i) {
/* 3 */             int i2 = this.zzc[i];
/* 9 */             if (zzM(obj2, i2, i)) {
/* 19 */                int iZzs = zzs(i) & 1048575;
/* 20 */                Unsafe unsafe = zzb;
                        long j = iZzs;
/* 23 */                Object object = unsafe.getObject(obj2, j);
/* 27 */                if (object == null) {
/* 92 */                    pk3.m7468d(this.zzc[i], obj2);
/* 95 */                    return;
                        }
/* 29 */                zzix zzixVarZzv = zzv(i);
/* 37 */                if (!zzM(obj, i2, i)) {
/* 43 */                    if (zzL(object)) {
/* 49 */                        Object objZze = zzixVarZzv.zze();
/* 53 */                        zzixVarZzv.zzg(objZze, object);
/* 56 */                        unsafe.putObject(obj, j, objZze);
                            } else {
/* 45 */                        unsafe.putObject(obj, j, object);
                            }
/* 59 */                    zzE(obj, i2, i);
/* 62 */                    return;
                        }
/* 63 */                Object object2 = unsafe.getObject(obj, j);
/* 71 */                if (!zzL(object2)) {
/* 73 */                    Object objZze2 = zzixVarZzv.zze();
/* 77 */                    zzixVarZzv.zzg(objZze2, object2);
/* 80 */                    unsafe.putObject(obj, j, objZze2);
/* 83 */                    object2 = objZze2;
                        }
/* 84 */                zzixVarZzv.zzg(object2, object);
                    }
                }

                private final void zzD(Object obj, int i) {
/* 1 */             int iZzp = zzp(i);
/* 8 */             long j = 1048575 & iZzp;
/* 15 */            if (j == 1048575) {
/* 17 */                return;
                    }
/* 28 */            zzjq.zzq(obj, j, (1 << (iZzp >>> 20)) | zzjq.zzc(obj, j));
                }

                private final void zzE(Object obj, int i, int i2) {
/* 10 */            zzjq.zzq(obj, zzp(i2) & 1048575, i);
                }

                private final void zzF(Object obj, int i, Object obj2) {
/* 12 */            zzb.putObject(obj, zzs(i) & 1048575, obj2);
/* 15 */            zzD(obj, i);
                }

                private final void zzG(Object obj, int i, int i2, Object obj2) {
/* 12 */            zzb.putObject(obj, zzs(i2) & 1048575, obj2);
/* 15 */            zzE(obj, i, i2);
                }

                private final boolean zzH(Object obj, Object obj2, int i) {
                    return zzI(obj, i) == zzI(obj2, i);
                }

                private final boolean zzI(Object obj, int i) {
/* 1 */             int iZzp = zzp(i);
/* 8 */             long j = iZzp & 1048575;
/* 18 */            if (j != 1048575) {
                        return ((1 << (iZzp >>> 20)) & zzjq.zzc(obj, j)) != 0;
                    }
/* 20 */            int iZzs = zzs(i);
/* 24 */            long j2 = iZzs & 1048575;
                    switch (zzr(iZzs)) {
                        case 0:
                            return Double.doubleToRawLongBits(zzjq.zza(obj, j2)) != 0;
                        case 1:
                            return Float.floatToRawIntBits(zzjq.zzb(obj, j2)) != 0;
                        case 2:
                            return zzjq.zzd(obj, j2) != 0;
                        case 3:
                            return zzjq.zzd(obj, j2) != 0;
                        case 4:
                            return zzjq.zzc(obj, j2) != 0;
                        case 5:
                            return zzjq.zzd(obj, j2) != 0;
                        case 6:
                            return zzjq.zzc(obj, j2) != 0;
                        case 7:
/* 158 */                   return zzjq.zzw(obj, j2);
                        case 8:
/* 122 */                   Object objZzf = zzjq.zzf(obj, j2);
/* 128 */                   if (objZzf instanceof String) {
                                return !((String) objZzf).isEmpty();
                            }
/* 142 */                   if (objZzf instanceof zzgk) {
                                return !zzgk.zzb.equals(objZzf);
                            }
/* 154 */                   f42.m3649e();
/* 16 */                    return false;
                        case 9:
                            return zzjq.zzf(obj, j2) != null;
                        case 10:
                            return !zzgk.zzb.equals(zzjq.zzf(obj, j2));
                        case 11:
                            return zzjq.zzc(obj, j2) != 0;
                        case 12:
                            return zzjq.zzc(obj, j2) != 0;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                            return zzjq.zzc(obj, j2) != 0;
                        case 14:
                            return zzjq.zzd(obj, j2) != 0;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                            return zzjq.zzc(obj, j2) != 0;
                        case 16:
                            return zzjq.zzd(obj, j2) != 0;
                        case 17:
                            return zzjq.zzf(obj, j2) != null;
                        default:
/* 36 */                    f42.m3649e();
/* 16 */                    return false;
                    }
                }

                private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
/* 4 */             if (i2 == 1048575) {
/* 6 */                 return zzI(obj, i);
                    }
                    return (i3 & i4) != 0;
                }

                private static boolean zzK(Object obj, int i, zzix zzixVar) {
/* 10 */            return zzixVar.zzk(zzjq.zzf(obj, i & 1048575));
                }

                private static boolean zzL(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof zzhk) {
/* 11 */                return ((zzhk) obj).zzA();
                    }
/* 16 */            return true;
                }

                private final boolean zzM(Object obj, int i, int i2) {
                    return zzjq.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
                }

                private static boolean zzN(Object obj, long j) {
/* 7 */             return ((Boolean) zzjq.zzf(obj, j)).booleanValue();
                }

                private static final void zzO(int i, Object obj, zzjw zzjwVar) throws IOException {
/* 3 */             if (obj instanceof String) {
/* 7 */                 zzjwVar.zzG(i, (String) obj);
                    } else {
/* 13 */                zzjwVar.zzd(i, (zzgk) obj);
                    }
                }

                public static zzjk zzd(Object obj) {
/* 1 */             zzhk zzhkVar = (zzhk) obj;
/* 3 */             zzjk zzjkVar = zzhkVar.zzc;
/* 9 */             if (zzjkVar != zzjk.zzc()) {
/* 17 */                return zzjkVar;
                    }
/* 11 */            zzjk zzjkVarZzf = zzjk.zzf();
/* 15 */            zzhkVar.zzc = zzjkVarZzf;
/* 17 */            return zzjkVarZzf;
                }

                /* JADX WARN: Code duplicated, block: B:187:0x03c3  */
                /* JADX WARN: Code duplicated, block: B:193:0x03e2  */
                public static zzip zzl(Class cls, zzij zzijVar, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
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
                    zziw zziwVar;
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
                    Field fieldZzz;
                    char cCharAt9;
                    int i25;
                    int i26;
                    int i27;
                    int i28;
                    int i29;
                    Field fieldZzz2;
                    Field fieldZzz3;
                    int i30;
                    char cCharAt10;
                    int i31;
                    int i32;
                    char cCharAt11;
                    int i33;
                    char cCharAt12;
                    int i34;
                    char cCharAt13;
/* 5 */             if (!(zzijVar instanceof zziw)) {
/* 1098 */              throw null;
                    }
/* 7 */             zziw zziwVar2 = (zziw) zzijVar;
/* 9 */             String strZzd = zziwVar2.zzd();
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
/* 365 */           Object[] objArrZze = zziwVar2.zze();
/* 373 */           Class<?> cls2 = zziwVar2.zza().getClass();
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
/* 456 */                       zziwVar = zziwVar2;
/* 461 */                       if (cCharAt11 < 55296) {
                                    break;
                                }
/* 467 */                       i76 |= (cCharAt11 & 8191) << i78;
/* 468 */                       i78 += 13;
/* 470 */                       i77 = i32;
/* 472 */                       zziwVar2 = zziwVar;
                            }
/* 477 */                   iCharAt11 = i76 | (cCharAt11 << i78);
/* 478 */                   i17 = i32;
                        } else {
/* 481 */                   zziwVar = zziwVar2;
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
                            } else if (zziwVar.zzc() == 1 || i81 != 0) {
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
/* 636 */                       fieldZzz2 = (Field) obj;
                            } else {
/* 644 */                       fieldZzz2 = zzz(cls2, (String) obj);
/* 648 */                       objArrZze[i89] = fieldZzz2;
                            }
/* 638 */                   Object[] objArr3 = objArr2;
/* 639 */                   int i91 = i6;
/* 655 */                   int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzz2);
/* 656 */                   int i92 = i89 + 1;
/* 658 */                   Object obj2 = objArrZze[i92];
/* 664 */                   if (obj2 instanceof Field) {
/* 666 */                       fieldZzz3 = (Field) obj2;
                            } else {
/* 671 */                       fieldZzz3 = zzz(cls2, (String) obj2);
/* 675 */                       objArrZze[i92] = fieldZzz3;
                            }
/* 681 */                   int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzz3);
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
/* 716 */                   Field fieldZzz4 = zzz(cls2, (String) objArrZze[i6]);
/* 720 */                   i18 = iCharAt10;
/* 724 */                   if (i79 == 9 || i79 == 17) {
/* 730 */                       i7 = i7;
/* 867 */                       objArr[pm2.m7483f(i69, 3, 1)] = fieldZzz4.getType();
                            } else {
/* 738 */                       if (i79 != 27) {
/* 742 */                           if (i79 == 49) {
/* 744 */                               i27 = i6 + 2;
/* 748 */                               i25 = 3;
/* 749 */                               i26 = 1;
                                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
/* 817 */                               i7 = i7;
/* 820 */                               if (zziwVar.zzc() == 1 || i81 != 0) {
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
/* 874 */                           iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
/* 937 */                                   fieldZzz = (Field) obj3;
                                        } else {
/* 943 */                                   fieldZzz = zzz(cls2, (String) obj3);
/* 947 */                                   objArrZze[i100] = fieldZzz;
                                        }
/* 955 */                               i20 = iCharAt13 % 32;
/* 954 */                               iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz);
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
/* 874 */                   iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
/* 1059 */              zziwVar2 = zziwVar;
/* 1061 */              i7 = i7;
/* 1063 */              objArr2 = objArr;
                    }
/* 1091 */          return new zzip(iArr3, objArr2, i2, i4, zziwVar2.zza(), false, iArr, i5, i65, zzirVar, zzhzVar, zzjjVar, zzgxVar, zzihVar);
                }

                private static double zzm(Object obj, long j) {
/* 7 */             return ((Double) zzjq.zzf(obj, j)).doubleValue();
                }

                private static float zzn(Object obj, long j) {
/* 7 */             return ((Float) zzjq.zzf(obj, j)).floatValue();
                }

                private static int zzo(Object obj, long j) {
/* 7 */             return ((Integer) zzjq.zzf(obj, j)).intValue();
                }

                private final int zzp(int i) {
/* 5 */             return this.zzc[i + 2];
                }

                private final int zzq(int i, int i2) {
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
/* 28 */                    i2 = i3 + 1;
                        }
                    }
/* 6 */             return -1;
                }

                private static int zzr(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                private final int zzs(int i) {
/* 5 */             return this.zzc[i + 1];
                }

                private static long zzt(Object obj, long j) {
/* 7 */             return ((Long) zzjq.zzf(obj, j)).longValue();
                }

                private final zzhm zzu(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (zzhm) this.zzd[i2 + i2 + 1];
                }

                private final zzix zzv(int i) {
/* 1 */             Object[] objArr = this.zzd;
/* 3 */             int i2 = i / 3;
/* 5 */             int i3 = i2 + i2;
/* 8 */             zzix zzixVar = (zzix) objArr[i3];
/* 10 */            if (zzixVar != null) {
/* 12 */                return zzixVar;
                    }
/* 23 */            zzix zzixVarZzb = zziu.zza().zzb((Class) objArr[i3 + 1]);
/* 29 */            this.zzd[i3] = zzixVarZzb;
/* 31 */            return zzixVarZzb;
                }

                private final Object zzw(int i) {
/* 1 */             int i2 = i / 3;
/* 6 */             return this.zzd[i2 + i2];
                }

                private final Object zzx(Object obj, int i) {
/* 1 */             zzix zzixVarZzv = zzv(i);
/* 12 */            int iZzs = zzs(i) & 1048575;
/* 17 */            if (!zzI(obj, i)) {
/* 19 */                return zzixVarZzv.zze();
                    }
/* 27 */            Object object = zzb.getObject(obj, iZzs);
/* 35 */            if (zzL(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZze = zzixVarZzv.zze();
/* 42 */            if (object != null) {
/* 44 */                zzixVarZzv.zzg(objZze, object);
                    }
/* 47 */            return objZze;
                }

                private final Object zzy(Object obj, int i, int i2) {
/* 1 */             zzix zzixVarZzv = zzv(i2);
/* 9 */             if (!zzM(obj, i, i2)) {
/* 11 */                return zzixVarZzv.zze();
                    }
/* 27 */            Object object = zzb.getObject(obj, zzs(i2) & 1048575);
/* 35 */            if (zzL(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZze = zzixVarZzv.zze();
/* 42 */            if (object != null) {
/* 44 */                zzixVarZzv.zzg(objZze, object);
                    }
/* 47 */            return objZze;
                }

                private static Field zzz(Class cls, String str) {
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

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:152:0x03df  */
                /* JADX WARN: Code duplicated, block: B:206:0x0522  */
                /* JADX WARN: Code duplicated, block: B:90:0x0211  */
                @Override // com.google.android.gms.internal.play_billing.zzix
                public final int zza(Object obj) {
                    int i;
                    int iZzz;
                    int iZzA;
                    int iZzz2;
                    int iZzd;
                    int iZzz3;
                    int iZzh;
                    int iZzz4;
                    int size;
                    int iZzl;
                    int iZzz5;
                    int iZzd2;
                    boolean z;
                    int iZzb;
                    int iZzy;
                    int iZzz6;
                    int iZzz7;
                    int size2;
                    int iZzk;
                    int iZzz8;
                    int size3;
                    int iZzi;
                    int iZzz9;
                    int i2;
                    int iZze;
                    int iZzz10;
                    int iZzz11;
                    int iZzz12;
                    int iZzA2;
/* 1 */             zzip<T> zzipVar = this;
/* 5 */             Unsafe unsafe = zzb;
/* 7 */             int i3 = 1048575;
/* 10 */            int i4 = 1048575;
/* 11 */            int i5 = 0;
/* 12 */            int i6 = 0;
/* 13 */            int iM7491n = 0;
/* 17 */            while (i5 < zzipVar.zzc.length) {
/* 19 */                int iZzs = zzipVar.zzs(i5);
/* 23 */                int iZzr = zzr(iZzs);
/* 27 */                int[] iArr = zzipVar.zzc;
/* 31 */                int i7 = iArr[i5];
/* 33 */                int i8 = iArr[i5 + 2];
/* 35 */                int i9 = i8 & i3;
/* 40 */                if (iZzr <= 17) {
/* 42 */                    if (i9 != i4) {
/* 49 */                        i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
/* 54 */                        i4 = i9;
                            }
/* 57 */                    i = 1 << (i8 >>> 20);
                        } else {
/* 60 */                    i = 0;
                        }
/* 61 */                int i10 = iZzs & i3;
/* 68 */                if (iZzr >= zzhc.zzJ.zza()) {
/* 72 */                    zzhc.zzW.zza();
                        }
                        long j = i10;
                        switch (iZzr) {
                            case 0:
/* 1829 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1833 */                          iM7491n = pm2.m7491n(i7 << 3, 8, iM7491n);
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 1:
/* 1813 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1817 */                          iM7491n = pm2.m7491n(i7 << 3, 4, iM7491n);
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 2:
/* 1788 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1792 */                          long j2 = unsafe.getLong(obj, j);
/* 1796 */                          iZzz = zzgr.zzz(i7 << 3);
/* 1800 */                          iZzA = zzgr.zzA(j2);
/* 1473 */                          iM7491n += iZzA + iZzz;
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 3:
/* 1764 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1768 */                          long j3 = unsafe.getLong(obj, j);
/* 1772 */                          iZzz = zzgr.zzz(i7 << 3);
/* 1776 */                          iZzA = zzgr.zzA(j3);
/* 1473 */                          iM7491n += iZzA + iZzz;
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 4:
/* 1739 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1743 */                          long j4 = unsafe.getInt(obj, j);
/* 1748 */                          iZzz = zzgr.zzz(i7 << 3);
/* 1752 */                          iZzA = zzgr.zzA(j4);
/* 1473 */                          iM7491n += iZzA + iZzz;
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 5:
/* 1723 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1727 */                          iM7491n = pm2.m7491n(i7 << 3, 8, iM7491n);
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 6:
/* 1707 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1711 */                          iM7491n = pm2.m7491n(i7 << 3, 4, iM7491n);
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 7:
/* 1690 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1694 */                          iM7491n = pm2.m7491n(i7 << 3, 1, iM7491n);
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 8:
/* 1645 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1647 */                          int i11 = i7 << 3;
/* 1649 */                          Object object = unsafe.getObject(obj, j);
/* 1655 */                          if (object instanceof zzgk) {
/* 1659 */                              iZzz2 = zzgr.zzz(i11);
/* 1663 */                              iZzd = ((zzgk) object).zzd();
/* 1667 */                              iZzz3 = zzgr.zzz(iZzd);
/* 1614 */                              iM7491n += iZzz3 + iZzd + iZzz2;
                                    } else {
/* 1674 */                              iZzz = zzgr.zzz(i11);
/* 1678 */                              iZzA = zzgr.zzy((String) object);
/* 1473 */                              iM7491n += iZzA + iZzz;
                                    }
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 9:
/* 1623 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1633 */                          iZzh = zziz.zzh(i7, unsafe.getObject(obj, j), zzipVar.zzv(i5));
/* 1405 */                          iM7491n += iZzh;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 10:
/* 1590 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1598 */                          zzgk zzgkVar = (zzgk) unsafe.getObject(obj, j);
/* 1600 */                          iZzz2 = zzgr.zzz(i7 << 3);
/* 1604 */                          iZzd = zzgkVar.zzd();
/* 1608 */                          iZzz3 = zzgr.zzz(iZzd);
/* 1614 */                          iM7491n += iZzz3 + iZzd + iZzz2;
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 11:
/* 1567 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1579 */                          iM7491n = pm2.m7491n(unsafe.getInt(obj, j), zzgr.zzz(i7 << 3), iM7491n);
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 12:
/* 1543 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1547 */                          long j5 = unsafe.getInt(obj, j);
/* 1552 */                          iZzz = zzgr.zzz(i7 << 3);
/* 1556 */                          iZzA = zzgr.zzA(j5);
/* 1473 */                          iM7491n += iZzA + iZzz;
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1528 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1532 */                          iM7491n = pm2.m7491n(i7 << 3, 4, iM7491n);
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 14:
/* 1512 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1516 */                          iM7491n = pm2.m7491n(i7 << 3, 8, iM7491n);
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1484 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1488 */                          int i12 = unsafe.getInt(obj, j);
/* 1501 */                          iM7491n = pm2.m7491n((i12 >> 31) ^ (i12 + i12), zzgr.zzz(i7 << 3), iM7491n);
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 16:
/* 1451 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1455 */                          long j6 = unsafe.getLong(obj, j);
/* 1463 */                          iZzz = zzgr.zzz(i7 << 3);
/* 1468 */                          iZzA = zzgr.zzA((j6 >> 63) ^ (j6 + j6));
/* 1473 */                          iM7491n += iZzA + iZzz;
                                }
/* 1474 */                      zzipVar = this;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 17:
/* 1426 */                      if (zzipVar.zzJ(obj, i5, i4, i6, i)) {
/* 1442 */                          iM7491n += zzgr.zzw(i7, (zzim) unsafe.getObject(obj, j), zzipVar.zzv(i5));
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 18:
/* 1415 */                      iZzh = zziz.zzd(i7, (List) unsafe.getObject(obj, j), false);
/* 1405 */                      iM7491n += iZzh;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 19:
/* 1401 */                      iZzh = zziz.zzb(i7, (List) unsafe.getObject(obj, j), false);
/* 1405 */                      iM7491n += iZzh;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 20:
/* 1365 */                      List list = (List) unsafe.getObject(obj, j);
/* 1367 */                      int i13 = zziz.zza;
/* 1373 */                      if (list.size() == 0) {
/* 1315 */                          iZzz4 = 0;
                                } else {
/* 1391 */                          iZzz4 = (zzgr.zzz(i7 << 3) * list.size()) + zziz.zzg(list);
                                }
/* 1331 */                      iM7491n += iZzz4;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 1339 */                      List list2 = (List) unsafe.getObject(obj, j);
/* 1341 */                      int i14 = zziz.zza;
/* 1343 */                      size = list2.size();
/* 1347 */                      if (size == 0) {
/* 1315 */                          iZzz4 = 0;
                                } else {
/* 1352 */                          iZzl = zziz.zzl(list2);
/* 1356 */                          iZzz5 = zzgr.zzz(i7 << 3);
/* 1329 */                          iZzz4 = (iZzz5 * size) + iZzl;
                                }
/* 1331 */                      iM7491n += iZzz4;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 1305 */                      List list3 = (List) unsafe.getObject(obj, j);
/* 1307 */                      int i15 = zziz.zza;
/* 1309 */                      size = list3.size();
/* 1313 */                      if (size == 0) {
/* 1315 */                          iZzz4 = 0;
                                } else {
/* 1320 */                          iZzl = zziz.zzf(list3);
/* 1324 */                          iZzz5 = zzgr.zzz(i7 << 3);
/* 1329 */                          iZzz4 = (iZzz5 * size) + iZzl;
                                }
/* 1331 */                      iM7491n += iZzz4;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 1295 */                      iZzd2 = zziz.zzd(i7, (List) unsafe.getObject(obj, j), false);
/* 281 */                       iM7491n += iZzd2;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 24:
/* 1281 */                      z = false;
/* 1282 */                      iZzb = zziz.zzb(i7, (List) unsafe.getObject(obj, j), false);
/* 961 */                       iM7491n += iZzb;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 1253 */                      List list4 = (List) unsafe.getObject(obj, j);
/* 1255 */                      int i16 = zziz.zza;
/* 1257 */                      int size4 = list4.size();
/* 1261 */                      if (size4 == 0) {
/* 992 */                           iZzd2 = 0;
                                } else {
/* 1272 */                          iZzd2 = size4 * (zzgr.zzz(i7 << 3) + 1);
                                }
/* 281 */                       iM7491n += iZzd2;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 1153 */                      List list5 = (List) unsafe.getObject(obj, j);
/* 1155 */                      int i17 = zziz.zza;
/* 1157 */                      int size5 = list5.size();
/* 1161 */                      if (size5 == 0) {
/* 1163 */                          iZzy = 0;
                                } else {
/* 1171 */                          int iZzz13 = zzgr.zzz(i7 << 3) * size5;
/* 1174 */                          if (list5 instanceof zzhy) {
/* 1176 */                              zzhy zzhyVar = (zzhy) list5;
/* 1178 */                              iZzy = iZzz13;
/* 1180 */                              for (int i18 = 0; i18 < size5; i18++) {
/* 1182 */                                  Object objZzc = zzhyVar.zzc();
/* 1188 */                                  if (objZzc instanceof zzgk) {
/* 1192 */                                      int iZzd3 = ((zzgk) objZzc).zzd();
/* 1196 */                                      iZzy = pm2.m7491n(iZzd3, iZzd3, iZzy);
                                            } else {
/* 1207 */                                      iZzy = zzgr.zzy((String) objZzc) + iZzy;
                                            }
                                        }
                                    } else {
/* 1212 */                              iZzy = iZzz13;
/* 1214 */                              for (int i19 = 0; i19 < size5; i19++) {
/* 1216 */                                  Object obj2 = list5.get(i19);
/* 1222 */                                  if (obj2 instanceof zzgk) {
/* 1226 */                                      int iZzd4 = ((zzgk) obj2).zzd();
/* 1230 */                                      iZzy = pm2.m7491n(iZzd4, iZzd4, iZzy);
                                            } else {
/* 1241 */                                      iZzy = zzgr.zzy((String) obj2) + iZzy;
                                            }
                                        }
                                    }
                                }
/* 1246 */                      iM7491n += iZzy;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 1089 */                      List list6 = (List) unsafe.getObject(obj, j);
/* 1091 */                      zzix zzixVarZzv = zzipVar.zzv(i5);
/* 1095 */                      int i20 = zziz.zza;
/* 1097 */                      int size6 = list6.size();
/* 1101 */                      if (size6 == 0) {
/* 1103 */                          iZzz6 = 0;
                                } else {
/* 1111 */                          iZzz6 = zzgr.zzz(i7 << 3) * size6;
/* 1114 */                          for (int i21 = 0; i21 < size6; i21++) {
/* 1116 */                              Object obj3 = list6.get(i21);
/* 1122 */                              if (obj3 instanceof zzhx) {
/* 1126 */                                  int iZza = ((zzhx) obj3).zza();
/* 1130 */                                  iZzz6 = pm2.m7491n(iZza, iZza, iZzz6);
                                        } else {
/* 1141 */                                  iZzz6 = zzgr.zzx((zzim) obj3, zzixVarZzv) + iZzz6;
                                        }
                                    }
                                }
/* 1146 */                      iM7491n += iZzz6;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 1039 */                      List list7 = (List) unsafe.getObject(obj, j);
/* 1041 */                      int i22 = zziz.zza;
/* 1043 */                      int size7 = list7.size();
/* 1047 */                      if (size7 == 0) {
/* 1049 */                          iZzz7 = 0;
                                } else {
/* 1057 */                          iZzz7 = zzgr.zzz(i7 << 3) * size7;
/* 1063 */                          for (int i23 = 0; i23 < list7.size(); i23++) {
/* 1071 */                              int iZzd5 = ((zzgk) list7.get(i23)).zzd();
/* 1075 */                              iZzz7 = pm2.m7491n(iZzd5, iZzd5, iZzz7);
                                    }
                                }
/* 1082 */                      iM7491n += iZzz7;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 1013 */                      List list8 = (List) unsafe.getObject(obj, j);
/* 1015 */                      int i24 = zziz.zza;
/* 1017 */                      size2 = list8.size();
/* 1021 */                      if (size2 == 0) {
/* 992 */                           iZzd2 = 0;
                                } else {
/* 1026 */                          iZzk = zziz.zzk(list8);
/* 1030 */                          iZzz8 = zzgr.zzz(i7 << 3);
/* 1006 */                          iZzd2 = iZzk + (iZzz8 * size2);
                                }
/* 281 */                       iM7491n += iZzd2;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 982 */                       List list9 = (List) unsafe.getObject(obj, j);
/* 984 */                       int i25 = zziz.zza;
/* 986 */                       size2 = list9.size();
/* 990 */                       if (size2 == 0) {
/* 992 */                           iZzd2 = 0;
                                } else {
/* 997 */                           iZzk = zziz.zza(list9);
/* 1001 */                          iZzz8 = zzgr.zzz(i7 << 3);
/* 1006 */                          iZzd2 = iZzk + (iZzz8 * size2);
                                }
/* 281 */                       iM7491n += iZzd2;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 972 */                       iZzd2 = zziz.zzb(i7, (List) unsafe.getObject(obj, j), false);
/* 281 */                       iM7491n += iZzd2;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 32:
/* 956 */                       z = false;
/* 957 */                       iZzb = zziz.zzd(i7, (List) unsafe.getObject(obj, j), false);
/* 961 */                       iM7491n += iZzb;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 927 */                       List list10 = (List) unsafe.getObject(obj, j);
/* 929 */                       int i26 = zziz.zza;
/* 931 */                       size3 = list10.size();
/* 935 */                       if (size3 == 0) {
/* 530 */                           i2 = 0;
                                } else {
/* 941 */                           iZzi = zziz.zzi(list10);
/* 945 */                           iZzz9 = zzgr.zzz(i7 << 3);
/* 919 */                           i2 = (iZzz9 * size3) + iZzi;
                                }
/* 551 */                       iM7491n += i2;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 896 */                       List list11 = (List) unsafe.getObject(obj, j);
/* 898 */                       int i27 = zziz.zza;
/* 900 */                       size3 = list11.size();
/* 904 */                       if (size3 == 0) {
/* 530 */                           i2 = 0;
                                } else {
/* 910 */                           iZzi = zziz.zzj(list11);
/* 914 */                           iZzz9 = zzgr.zzz(i7 << 3);
/* 919 */                           i2 = (iZzz9 * size3) + iZzi;
                                }
/* 551 */                       iM7491n += i2;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 874 */                       iZze = zziz.zze((List) unsafe.getObject(obj, j));
/* 878 */                       if (iZze > 0) {
/* 882 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 886 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 850 */                       iZze = zziz.zzc((List) unsafe.getObject(obj, j));
/* 854 */                       if (iZze > 0) {
/* 858 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 862 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 37:
/* 826 */                       iZze = zziz.zzg((List) unsafe.getObject(obj, j));
/* 830 */                       if (iZze > 0) {
/* 834 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 838 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 38:
/* 802 */                       iZze = zziz.zzl((List) unsafe.getObject(obj, j));
/* 806 */                       if (iZze > 0) {
/* 810 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 814 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 39:
/* 778 */                       iZze = zziz.zzf((List) unsafe.getObject(obj, j));
/* 782 */                       if (iZze > 0) {
/* 786 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 790 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 754 */                       iZze = zziz.zze((List) unsafe.getObject(obj, j));
/* 758 */                       if (iZze > 0) {
/* 762 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 766 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 730 */                       iZze = zziz.zzc((List) unsafe.getObject(obj, j));
/* 734 */                       if (iZze > 0) {
/* 738 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 742 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 42:
/* 702 */                       List list12 = (List) unsafe.getObject(obj, j);
/* 704 */                       int i28 = zziz.zza;
/* 706 */                       iZze = list12.size();
/* 710 */                       if (iZze > 0) {
/* 714 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 718 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 43:
/* 680 */                       iZze = zziz.zzk((List) unsafe.getObject(obj, j));
/* 684 */                       if (iZze > 0) {
/* 688 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 692 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 44:
/* 656 */                       iZze = zziz.zza((List) unsafe.getObject(obj, j));
/* 660 */                       if (iZze > 0) {
/* 664 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 668 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 45:
/* 632 */                       iZze = zziz.zzc((List) unsafe.getObject(obj, j));
/* 636 */                       if (iZze > 0) {
/* 640 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 644 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 46:
/* 608 */                       iZze = zziz.zze((List) unsafe.getObject(obj, j));
/* 612 */                       if (iZze > 0) {
/* 616 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 620 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 47:
/* 584 */                       iZze = zziz.zzi((List) unsafe.getObject(obj, j));
/* 588 */                       if (iZze > 0) {
/* 592 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 596 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 48:
/* 560 */                       iZze = zziz.zzj((List) unsafe.getObject(obj, j));
/* 564 */                       if (iZze > 0) {
/* 568 */                           iZzz10 = zzgr.zzz(i7 << 3);
/* 572 */                           iZzz11 = zzgr.zzz(iZze);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 49:
/* 516 */                       List list13 = (List) unsafe.getObject(obj, j);
/* 518 */                       zzix zzixVarZzv2 = zzipVar.zzv(i5);
/* 522 */                       int i29 = zziz.zza;
/* 524 */                       int size8 = list13.size();
/* 528 */                       if (size8 == 0) {
/* 530 */                           i2 = 0;
                                } else {
/* 532 */                           int iZzw = 0;
/* 534 */                           for (int i30 = 0; i30 < size8; i30++) {
/* 546 */                               iZzw += zzgr.zzw(i7, (zzim) list13.get(i30), zzixVarZzv2);
                                    }
/* 550 */                           i2 = iZzw;
                                }
/* 551 */                       iM7491n += i2;
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 472 */                       zzig zzigVar = (zzig) unsafe.getObject(obj, j);
/* 480 */                       if (!zzigVar.isEmpty()) {
/* 486 */                           Iterator it = zzigVar.entrySet().iterator();
/* 494 */                           if (it.hasNext()) {
/* 502 */                               Map.Entry entry = (Map.Entry) it.next();
/* 504 */                               entry.getKey();
/* 507 */                               entry.getValue();
/* 511 */                               throw null;
                                    }
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 51:
/* 454 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 458 */                           iM7491n = pm2.m7491n(i7 << 3, 8, iM7491n);
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 52:
/* 440 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 444 */                           iM7491n = pm2.m7491n(i7 << 3, 4, iM7491n);
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 53:
/* 418 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 422 */                           long jZzt = zzt(obj, j);
/* 426 */                           iZzz12 = zzgr.zzz(i7 << 3);
/* 430 */                           iZzA2 = zzgr.zzA(jZzt);
/* 135 */                           iM7491n += iZzA2 + iZzz12;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 54:
/* 396 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 400 */                           long jZzt2 = zzt(obj, j);
/* 404 */                           iZzz12 = zzgr.zzz(i7 << 3);
/* 408 */                           iZzA2 = zzgr.zzA(jZzt2);
/* 135 */                           iM7491n += iZzA2 + iZzz12;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 55:
/* 373 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 377 */                           long jZzo = zzo(obj, j);
/* 382 */                           iZzz12 = zzgr.zzz(i7 << 3);
/* 386 */                           iZzA2 = zzgr.zzA(jZzo);
/* 135 */                           iM7491n += iZzA2 + iZzz12;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 56:
/* 359 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 363 */                           iM7491n = pm2.m7491n(i7 << 3, 8, iM7491n);
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 57:
/* 345 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 349 */                           iM7491n = pm2.m7491n(i7 << 3, 4, iM7491n);
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 58:
/* 331 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 335 */                           iM7491n = pm2.m7491n(i7 << 3, 1, iM7491n);
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 59:
/* 288 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 290 */                           int i31 = i7 << 3;
/* 292 */                           Object object2 = unsafe.getObject(obj, j);
/* 298 */                           if (object2 instanceof zzgk) {
/* 302 */                               iZze = zzgr.zzz(i31);
/* 306 */                               iZzz10 = ((zzgk) object2).zzd();
/* 310 */                               iZzz11 = zzgr.zzz(iZzz10);
/* 260 */                               iM7491n += iZzz11 + iZzz10 + iZze;
                                    } else {
/* 317 */                               iZzz12 = zzgr.zzz(i31);
/* 321 */                               iZzA2 = zzgr.zzy((String) object2);
/* 135 */                               iM7491n += iZzA2 + iZzz12;
                                    }
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 60:
/* 267 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 277 */                           iZzd2 = zziz.zzh(i7, unsafe.getObject(obj, j), zzipVar.zzv(i5));
/* 281 */                           iM7491n += iZzd2;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 61:
/* 236 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 244 */                           zzgk zzgkVar2 = (zzgk) unsafe.getObject(obj, j);
/* 246 */                           iZze = zzgr.zzz(i7 << 3);
/* 250 */                           iZzz10 = zzgkVar2.zzd();
/* 254 */                           iZzz11 = zzgr.zzz(iZzz10);
/* 260 */                           iM7491n += iZzz11 + iZzz10 + iZze;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 62:
/* 215 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 227 */                           iM7491n = pm2.m7491n(zzo(obj, j), zzgr.zzz(i7 << 3), iM7491n);
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 63:
/* 193 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 197 */                           long jZzo2 = zzo(obj, j);
/* 202 */                           iZzz12 = zzgr.zzz(i7 << 3);
/* 206 */                           iZzA2 = zzgr.zzA(jZzo2);
/* 135 */                           iM7491n += iZzA2 + iZzz12;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 64:
/* 180 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 184 */                           iM7491n = pm2.m7491n(i7 << 3, 4, iM7491n);
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 65:
/* 167 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 171 */                           iM7491n = pm2.m7491n(i7 << 3, 8, iM7491n);
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 66:
/* 141 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 145 */                           int iZzo = zzo(obj, j);
/* 158 */                           iM7491n = pm2.m7491n((iZzo >> 31) ^ (iZzo + iZzo), zzgr.zzz(i7 << 3), iM7491n);
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 67:
/* 113 */                       if (zzipVar.zzM(obj, i7, i5)) {
/* 117 */                           long jZzt3 = zzt(obj, j);
/* 125 */                           iZzz12 = zzgr.zzz(i7 << 3);
/* 130 */                           iZzA2 = zzgr.zzA((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
/* 135 */                           iM7491n += iZzA2 + iZzz12;
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            case 68:
/* 89 */                        if (zzipVar.zzM(obj, i7, i5)) {
/* 105 */                           iM7491n += zzgr.zzw(i7, (zzim) unsafe.getObject(obj, j), zzipVar.zzv(i5));
                                }
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                            default:
/* 1837 */                      i5 += 3;
/* 1841 */                      i3 = 1048575;
                                break;
                        }
                    }
/* 1846 */          int iZzb2 = 0;
/* 1857 */          int iZza2 = ((zzhk) obj).zzc.zza() + iM7491n;
/* 1860 */          if (!zzipVar.zzh) {
/* 1941 */              return iZza2;
                    }
/* 1866 */          zzhb zzhbVar = ((zzhh) obj).zzb;
/* 1870 */          int iZzc = zzhbVar.zza.zzc();
/* 1874 */          int i32 = 0;
                    while (true) {
/* 1875 */              zzjf zzjfVar = zzhbVar.zza;
/* 1877 */              if (i32 >= iZzc) {
/* 1916 */                  for (Map.Entry entry2 : zzjfVar.zzd()) {
/* 1938 */                      iZzb2 += zzhb.zzb((zzha) entry2.getKey(), entry2.getValue());
                            }
/* 1940 */                  return iZza2 + iZzb2;
                        }
/* 1879 */              Map.Entry entryZzg = zzjfVar.zzg(i32);
/* 1900 */              iZzb2 += zzhb.zzb((zzha) ((zzjb) entryZzg).zza(), entryZzg.getValue());
/* 1901 */              i32++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final int zzb(Object obj) {
                    int i;
                    long jDoubleToLongBits;
                    int i2;
                    int iFloatToIntBits;
                    int iZzc;
                    int i3;
/* 2 */             int i4 = 0;
/* 6 */             for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
/* 8 */                 int iZzs = zzs(i5);
/* 12 */                int[] iArr = this.zzc;
/* 17 */                int i6 = 1048575 & iZzs;
/* 18 */                int iZzr = zzr(iZzs);
/* 22 */                int i7 = iArr[i5];
                        long j = i6;
/* 25 */                int iHashCode = 37;
                        switch (iZzr) {
                            case 0:
/* 528 */                       i = i4 * 53;
/* 534 */                       jDoubleToLongBits = Double.doubleToLongBits(zzjq.zza(obj, j));
/* 538 */                       byte[] bArr = zzhp.zzb;
/* 71 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 72 */                        i4 = i + iZzc;
                                break;
                            case 1:
/* 516 */                       i2 = i4 * 53;
/* 522 */                       iFloatToIntBits = Float.floatToIntBits(zzjq.zzb(obj, j));
/* 50 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 2:
/* 506 */                       i = i4 * 53;
/* 508 */                       jDoubleToLongBits = zzjq.zzd(obj, j);
/* 512 */                       byte[] bArr2 = zzhp.zzb;
/* 71 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 72 */                        i4 = i + iZzc;
                                break;
                            case 3:
/* 496 */                       i = i4 * 53;
/* 498 */                       jDoubleToLongBits = zzjq.zzd(obj, j);
/* 502 */                       byte[] bArr3 = zzhp.zzb;
/* 71 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 72 */                        i4 = i + iZzc;
                                break;
                            case 4:
/* 488 */                       i = i4 * 53;
/* 490 */                       iZzc = zzjq.zzc(obj, j);
/* 72 */                        i4 = i + iZzc;
                                break;
                            case 5:
/* 478 */                       i = i4 * 53;
/* 480 */                       jDoubleToLongBits = zzjq.zzd(obj, j);
/* 484 */                       byte[] bArr4 = zzhp.zzb;
/* 71 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 72 */                        i4 = i + iZzc;
                                break;
                            case 6:
/* 470 */                       i = i4 * 53;
/* 472 */                       iZzc = zzjq.zzc(obj, j);
/* 72 */                        i4 = i + iZzc;
                                break;
                            case 7:
/* 458 */                       i2 = i4 * 53;
/* 464 */                       iFloatToIntBits = zzhp.zza(zzjq.zzw(obj, j));
/* 50 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 8:
/* 444 */                       i2 = i4 * 53;
/* 452 */                       iFloatToIntBits = ((String) zzjq.zzf(obj, j)).hashCode();
/* 50 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 9:
/* 431 */                       i3 = i4 * 53;
/* 433 */                       Object objZzf = zzjq.zzf(obj, j);
/* 437 */                       if (objZzf != null) {
/* 439 */                           iHashCode = objZzf.hashCode();
                                }
/* 364 */                       i4 = i3 + iHashCode;
                                break;
                            case 10:
/* 419 */                       i2 = i4 * 53;
/* 425 */                       iFloatToIntBits = zzjq.zzf(obj, j).hashCode();
/* 50 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 11:
/* 411 */                       i = i4 * 53;
/* 413 */                       iZzc = zzjq.zzc(obj, j);
/* 72 */                        i4 = i + iZzc;
                                break;
                            case 12:
/* 403 */                       i = i4 * 53;
/* 405 */                       iZzc = zzjq.zzc(obj, j);
/* 72 */                        i4 = i + iZzc;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 395 */                       i = i4 * 53;
/* 397 */                       iZzc = zzjq.zzc(obj, j);
/* 72 */                        i4 = i + iZzc;
                                break;
                            case 14:
/* 385 */                       i = i4 * 53;
/* 387 */                       jDoubleToLongBits = zzjq.zzd(obj, j);
/* 391 */                       byte[] bArr5 = zzhp.zzb;
/* 71 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 72 */                        i4 = i + iZzc;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 377 */                       i = i4 * 53;
/* 379 */                       iZzc = zzjq.zzc(obj, j);
/* 72 */                        i4 = i + iZzc;
                                break;
                            case 16:
/* 367 */                       i = i4 * 53;
/* 369 */                       jDoubleToLongBits = zzjq.zzd(obj, j);
/* 373 */                       byte[] bArr6 = zzhp.zzb;
/* 71 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 72 */                        i4 = i + iZzc;
                                break;
                            case 17:
/* 352 */                       i3 = i4 * 53;
/* 354 */                       Object objZzf2 = zzjq.zzf(obj, j);
/* 358 */                       if (objZzf2 != null) {
/* 360 */                           iHashCode = objZzf2.hashCode();
                                }
/* 364 */                       i4 = i3 + iHashCode;
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
/* 340 */                       i2 = i4 * 53;
/* 346 */                       iFloatToIntBits = zzjq.zzf(obj, j).hashCode();
/* 50 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 328 */                       i2 = i4 * 53;
/* 334 */                       iFloatToIntBits = zzjq.zzf(obj, j).hashCode();
/* 50 */                        i4 = iFloatToIntBits + i2;
                                break;
                            case 51:
/* 312 */                       if (zzM(obj, i7, i5)) {
/* 314 */                           i = i4 * 53;
/* 320 */                           jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
/* 324 */                           byte[] bArr7 = zzhp.zzb;
/* 71 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 72 */                            i4 = i + iZzc;
                                }
                                break;
                            case 52:
/* 294 */                       if (zzM(obj, i7, i5)) {
/* 296 */                           i2 = i4 * 53;
/* 302 */                           iFloatToIntBits = Float.floatToIntBits(zzn(obj, j));
/* 50 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 53:
/* 278 */                       if (zzM(obj, i7, i5)) {
/* 280 */                           i = i4 * 53;
/* 282 */                           jDoubleToLongBits = zzt(obj, j);
/* 286 */                           byte[] bArr8 = zzhp.zzb;
/* 71 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 72 */                            i4 = i + iZzc;
                                }
                                break;
                            case 54:
/* 262 */                       if (zzM(obj, i7, i5)) {
/* 264 */                           i = i4 * 53;
/* 266 */                           jDoubleToLongBits = zzt(obj, j);
/* 270 */                           byte[] bArr9 = zzhp.zzb;
/* 71 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 72 */                            i4 = i + iZzc;
                                }
                                break;
                            case 55:
/* 248 */                       if (zzM(obj, i7, i5)) {
/* 250 */                           i = i4 * 53;
/* 252 */                           iZzc = zzo(obj, j);
/* 72 */                            i4 = i + iZzc;
                                }
                                break;
                            case 56:
/* 232 */                       if (zzM(obj, i7, i5)) {
/* 234 */                           i = i4 * 53;
/* 236 */                           jDoubleToLongBits = zzt(obj, j);
/* 240 */                           byte[] bArr10 = zzhp.zzb;
/* 71 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 72 */                            i4 = i + iZzc;
                                }
                                break;
                            case 57:
/* 218 */                       if (zzM(obj, i7, i5)) {
/* 220 */                           i = i4 * 53;
/* 222 */                           iZzc = zzo(obj, j);
/* 72 */                            i4 = i + iZzc;
                                }
                                break;
                            case 58:
/* 200 */                       if (zzM(obj, i7, i5)) {
/* 202 */                           i2 = i4 * 53;
/* 208 */                           iFloatToIntBits = zzhp.zza(zzN(obj, j));
/* 50 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 59:
/* 180 */                       if (zzM(obj, i7, i5)) {
/* 182 */                           i2 = i4 * 53;
/* 190 */                           iFloatToIntBits = ((String) zzjq.zzf(obj, j)).hashCode();
/* 50 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 60:
/* 163 */                       if (zzM(obj, i7, i5)) {
/* 165 */                           i2 = i4 * 53;
/* 171 */                           iFloatToIntBits = zzjq.zzf(obj, j).hashCode();
/* 50 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 61:
/* 146 */                       if (zzM(obj, i7, i5)) {
/* 148 */                           i2 = i4 * 53;
/* 154 */                           iFloatToIntBits = zzjq.zzf(obj, j).hashCode();
/* 50 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                            case 62:
/* 133 */                       if (zzM(obj, i7, i5)) {
/* 135 */                           i = i4 * 53;
/* 137 */                           iZzc = zzo(obj, j);
/* 72 */                            i4 = i + iZzc;
                                }
                                break;
                            case 63:
/* 120 */                       if (zzM(obj, i7, i5)) {
/* 122 */                           i = i4 * 53;
/* 124 */                           iZzc = zzo(obj, j);
/* 72 */                            i4 = i + iZzc;
                                }
                                break;
                            case 64:
/* 107 */                       if (zzM(obj, i7, i5)) {
/* 109 */                           i = i4 * 53;
/* 111 */                           iZzc = zzo(obj, j);
/* 72 */                            i4 = i + iZzc;
                                }
                                break;
                            case 65:
/* 92 */                        if (zzM(obj, i7, i5)) {
/* 94 */                            i = i4 * 53;
/* 96 */                            jDoubleToLongBits = zzt(obj, j);
/* 100 */                           byte[] bArr11 = zzhp.zzb;
/* 71 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 72 */                            i4 = i + iZzc;
                                }
                                break;
                            case 66:
/* 79 */                        if (zzM(obj, i7, i5)) {
/* 81 */                            i = i4 * 53;
/* 83 */                            iZzc = zzo(obj, j);
/* 72 */                            i4 = i + iZzc;
                                }
                                break;
                            case 67:
/* 58 */                        if (zzM(obj, i7, i5)) {
/* 60 */                            i = i4 * 53;
/* 62 */                            jDoubleToLongBits = zzt(obj, j);
/* 66 */                            byte[] bArr12 = zzhp.zzb;
/* 71 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 72 */                            i4 = i + iZzc;
                                }
                                break;
                            case 68:
/* 38 */                        if (zzM(obj, i7, i5)) {
/* 40 */                            i2 = i4 * 53;
/* 46 */                            iFloatToIntBits = zzjq.zzf(obj, j).hashCode();
/* 50 */                            i4 = iFloatToIntBits + i2;
                                }
                                break;
                        }
                    }
/* 557 */           int iHashCode2 = ((zzhk) obj).zzc.hashCode() + (i4 * 53);
                    return this.zzh ? (iHashCode2 * 53) + ((zzhh) obj).zzb.zza.hashCode() : iHashCode2;
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40581. Try increasing type updates limit count.
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                    */
                public final int zzc(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.play_billing.zzfz r41) throws java.io.IOException {
                    /*
                        Method dump skipped, instruction units count: 4058
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzip.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzfz):int");
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final Object zze() {
/* 5 */             return ((zzhk) this.zzg).zzp();
                }

                /* JADX WARN: Code duplicated, block: B:26:0x0071  */
                /* JADX WARN: Code duplicated, block: B:28:0x0077  */
                /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
                @Override // com.google.android.gms.internal.play_billing.zzix
                public final void zzf(Object obj) {
/* 5 */             if (zzL(obj)) {
/* 12 */                if (obj instanceof zzhk) {
/* 15 */                    zzhk zzhkVar = (zzhk) obj;
/* 20 */                    zzhkVar.zzy(AbstractC0208c9.API_PRIORITY_OTHER);
/* 23 */                    zzhkVar.zza = 0;
/* 25 */                    zzhkVar.zzw();
                        }
/* 28 */                int[] iArr = this.zzc;
/* 31 */                for (int i = 0; i < iArr.length; i += 3) {
/* 33 */                    int iZzs = zzs(i);
/* 40 */                    int i2 = 1048575 & iZzs;
/* 41 */                    int iZzr = zzr(iZzs);
                            long j = i2;
/* 48 */                    if (iZzr != 9) {
/* 52 */                        if (iZzr != 60 && iZzr != 68) {
                                    switch (iZzr) {
                                        case 17:
/* 118 */                                   if (zzI(obj, i)) {
/* 130 */                                       zzv(i).zzf(zzb.getObject(obj, j));
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
/* 86 */                                    ((zzho) zzjq.zzf(obj, j)).zzb();
                                            break;
                                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 62 */                                    Unsafe unsafe = zzb;
/* 64 */                                    Object object = unsafe.getObject(obj, j);
/* 68 */                                    if (object != null) {
/* 73 */                                        ((zzig) object).zzc();
/* 76 */                                        unsafe.putObject(obj, j, object);
                                            }
                                            break;
                                    }
                                } else if (zzM(obj, this.zzc[i], i)) {
/* 110 */                           zzv(i).zzf(zzb.getObject(obj, j));
                                }
                            } else if (zzI(obj, i)) {
/* 130 */                       zzv(i).zzf(zzb.getObject(obj, j));
                            }
                        }
/* 138 */               this.zzl.zza(obj);
/* 143 */               if (this.zzh) {
/* 147 */                   this.zzm.zza(obj);
                        }
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final void zzg(Object obj, Object obj2) {
/* 1 */             zzA(obj);
/* 4 */             obj2.getClass();
/* 11 */            for (int i = 0; i < this.zzc.length; i += 3) {
/* 13 */                int iZzs = zzs(i);
/* 20 */                int i2 = 1048575 & iZzs;
/* 21 */                int[] iArr = this.zzc;
/* 23 */                int iZzr = zzr(iZzs);
/* 27 */                int i3 = iArr[i];
                        long j = i2;
                        switch (iZzr) {
                            case 0:
/* 425 */                       if (zzI(obj2, i)) {
/* 431 */                           zzjq.zzo(obj, j, zzjq.zza(obj2, j));
/* 434 */                           zzD(obj, i);
                                }
                                break;
                            case 1:
/* 408 */                       if (zzI(obj2, i)) {
/* 414 */                           zzjq.zzp(obj, j, zzjq.zzb(obj2, j));
/* 417 */                           zzD(obj, i);
                                }
                                break;
                            case 2:
/* 391 */                       if (zzI(obj2, i)) {
/* 397 */                           zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
/* 400 */                           zzD(obj, i);
                                }
                                break;
                            case 3:
/* 374 */                       if (zzI(obj2, i)) {
/* 380 */                           zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
/* 383 */                           zzD(obj, i);
                                }
                                break;
                            case 4:
/* 357 */                       if (zzI(obj2, i)) {
/* 363 */                           zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
/* 366 */                           zzD(obj, i);
                                }
                                break;
                            case 5:
/* 340 */                       if (zzI(obj2, i)) {
/* 346 */                           zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
/* 349 */                           zzD(obj, i);
                                }
                                break;
                            case 6:
/* 323 */                       if (zzI(obj2, i)) {
/* 329 */                           zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
/* 332 */                           zzD(obj, i);
                                }
                                break;
                            case 7:
/* 305 */                       if (zzI(obj2, i)) {
/* 311 */                           zzjq.zzm(obj, j, zzjq.zzw(obj2, j));
/* 314 */                           zzD(obj, i);
                                }
                                break;
                            case 8:
/* 287 */                       if (zzI(obj2, i)) {
/* 293 */                           zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
/* 296 */                           zzD(obj, i);
                                }
                                break;
                            case 9:
/* 278 */                       zzB(obj, obj2, i);
                                break;
                            case 10:
/* 264 */                       if (zzI(obj2, i)) {
/* 270 */                           zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
/* 273 */                           zzD(obj, i);
                                }
                                break;
                            case 11:
/* 246 */                       if (zzI(obj2, i)) {
/* 252 */                           zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
/* 255 */                           zzD(obj, i);
                                }
                                break;
                            case 12:
/* 228 */                       if (zzI(obj2, i)) {
/* 234 */                           zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
/* 237 */                           zzD(obj, i);
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 210 */                       if (zzI(obj2, i)) {
/* 216 */                           zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
/* 219 */                           zzD(obj, i);
                                }
                                break;
                            case 14:
/* 192 */                       if (zzI(obj2, i)) {
/* 198 */                           zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
/* 201 */                           zzD(obj, i);
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 174 */                       if (zzI(obj2, i)) {
/* 180 */                           zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
/* 183 */                           zzD(obj, i);
                                }
                                break;
                            case 16:
/* 156 */                       if (zzI(obj2, i)) {
/* 162 */                           zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
/* 165 */                           zzD(obj, i);
                                }
                                break;
                            case 17:
/* 147 */                       zzB(obj, obj2, i);
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
/* 104 */                       zzho zzhoVarZzd = (zzho) zzjq.zzf(obj, j);
/* 110 */                       zzho zzhoVar = (zzho) zzjq.zzf(obj2, j);
/* 112 */                       int size = zzhoVarZzd.size();
/* 116 */                       int size2 = zzhoVar.size();
/* 120 */                       if (size > 0 && size2 > 0) {
/* 128 */                           if (!zzhoVarZzd.zzc()) {
/* 131 */                               zzhoVarZzd = zzhoVarZzd.zzd(size2 + size);
                                    }
/* 135 */                           zzhoVarZzd.addAll(zzhoVar);
                                }
/* 138 */                       if (size > 0) {
/* 141 */                           zzhoVar = zzhoVarZzd;
                                }
/* 142 */                       zzjq.zzs(obj, j, zzhoVar);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 81 */                        int i4 = zziz.zza;
/* 95 */                        zzjq.zzs(obj, j, zzih.zza(zzjq.zzf(obj, j), zzjq.zzf(obj2, j)));
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
/* 67 */                        if (zzM(obj2, i3, i)) {
/* 73 */                            zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
/* 76 */                            zzE(obj, i3, i);
                                }
                                break;
                            case 60:
/* 58 */                        zzC(obj, obj2, i);
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
/* 44 */                        if (zzM(obj2, i3, i)) {
/* 50 */                            zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
/* 53 */                            zzE(obj, i3, i);
                                }
                                break;
                            case 68:
/* 35 */                        zzC(obj, obj2, i);
                                break;
                        }
                    }
/* 443 */           zziz.zzp(this.zzl, obj, obj2);
/* 448 */           if (this.zzh) {
/* 452 */               zziz.zzo(this.zzm, obj, obj2);
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final void zzh(Object obj, byte[] bArr, int i, int i2, zzfz zzfzVar) throws IOException {
/* 8 */             zzc(obj, bArr, i, i2, 0, zzfzVar);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0023  */
                @Override // com.google.android.gms.internal.play_billing.zzix
                public final void zzi(Object obj, zzjw zzjwVar) throws IOException {
                    Map.Entry entry;
                    int i;
/* 1 */             zzip<T> zzipVar = this;
/* 9 */             if (zzipVar.zzh) {
/* 14 */                zzhb zzhbVar = ((zzhh) obj).zzb;
/* 22 */                if (zzhbVar.zza.isEmpty()) {
/* 36 */                    entry = null;
                        } else {
/* 32 */                    entry = (Map.Entry) zzhbVar.zze().next();
                        }
                    } else {
/* 36 */                entry = null;
                    }
/* 37 */            int[] iArr = zzipVar.zzc;
/* 39 */            Unsafe unsafe = zzb;
/* 41 */            int i2 = 1048575;
/* 44 */            int i3 = 1048575;
/* 45 */            int i4 = 0;
/* 46 */            int i5 = 0;
/* 48 */            while (i4 < iArr.length) {
/* 50 */                int iZzs = zzipVar.zzs(i4);
/* 54 */                int[] iArr2 = zzipVar.zzc;
/* 56 */                int iZzr = zzr(iZzs);
/* 60 */                int i6 = iArr2[i4];
/* 67 */                if (iZzr <= 17) {
/* 71 */                    int i7 = iArr2[i4 + 2];
/* 73 */                    int i8 = i7 & i2;
/* 75 */                    if (i8 != i3) {
/* 82 */                        i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
/* 87 */                        i3 = i8;
                            }
/* 90 */                    i = 1 << (i7 >>> 20);
                        } else {
/* 99 */                    i = 0;
                        }
/* 100 */               if (entry != null) {
/* 1287 */                  throw null;
                        }
/* 102 */               long j = iZzs & i2;
                        switch (iZzr) {
                            case 0:
/* 1263 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1269 */                          zzjwVar.zzf(i6, zzjq.zza(obj, j));
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 1:
/* 1248 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1254 */                          zzjwVar.zzo(i6, zzjq.zzb(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 2:
/* 1233 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1239 */                          zzjwVar.zzt(i6, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 3:
/* 1218 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1224 */                          zzjwVar.zzK(i6, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 4:
/* 1203 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1209 */                          zzjwVar.zzr(i6, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 5:
/* 1188 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1194 */                          zzjwVar.zzm(i6, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 6:
/* 1173 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1179 */                          zzjwVar.zzk(i6, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 7:
/* 1158 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1164 */                          zzjwVar.zzb(i6, zzjq.zzw(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 8:
/* 1142 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1148 */                          zzO(i6, unsafe.getObject(obj, j), zzjwVar);
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 9:
/* 1122 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1132 */                          zzjwVar.zzv(i6, unsafe.getObject(obj, j), zzipVar.zzv(i4));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 10:
/* 1104 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1112 */                          zzjwVar.zzd(i6, (zzgk) unsafe.getObject(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 11:
/* 1088 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1094 */                          zzjwVar.zzI(i6, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 12:
/* 1072 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1078 */                          zzjwVar.zzi(i6, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1056 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1062 */                          zzjwVar.zzx(i6, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 14:
/* 1040 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1046 */                          zzjwVar.zzz(i6, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1024 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1030 */                          zzjwVar.zzB(i6, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 16:
/* 1008 */                      if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 1014 */                          zzjwVar.zzD(i6, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 17:
/* 988 */                       if (zzipVar.zzJ(obj, i4, i3, i5, i)) {
/* 998 */                           zzjwVar.zzq(i6, unsafe.getObject(obj, j), zzipVar.zzv(i4));
                                } else {
                                    continue;
                                }
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 18:
/* 978 */                       zziz.zzr(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 19:
/* 962 */                       zziz.zzv(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 20:
/* 946 */                       zziz.zzx(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 930 */                       zziz.zzD(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 914 */                       zziz.zzw(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 898 */                       zziz.zzu(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 24:
/* 882 */                       zziz.zzt(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 866 */                       zziz.zzq(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 832 */                       int i9 = zzipVar.zzc[i4];
/* 838 */                       List list = (List) unsafe.getObject(obj, j);
/* 840 */                       int i10 = zziz.zza;
/* 842 */                       if (list != null && !list.isEmpty()) {
/* 850 */                           zzjwVar.zzH(i9, list);
                                }
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 788 */                       int i11 = zzipVar.zzc[i4];
/* 794 */                       List list2 = (List) unsafe.getObject(obj, j);
/* 796 */                       zzix zzixVarZzv = zzipVar.zzv(i4);
/* 800 */                       int i12 = zziz.zza;
/* 802 */                       if (list2 != null && !list2.isEmpty()) {
/* 815 */                           for (int i13 = 0; i13 < list2.size(); i13++) {
/* 824 */                               ((zzgs) zzjwVar).zzv(i11, list2.get(i13), zzixVarZzv);
                                    }
                                }
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 763 */                       int i14 = zzipVar.zzc[i4];
/* 769 */                       List list3 = (List) unsafe.getObject(obj, j);
/* 771 */                       int i15 = zziz.zza;
/* 773 */                       if (list3 != null && !list3.isEmpty()) {
/* 781 */                           zzjwVar.zze(i14, list3);
                                }
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 756 */                       zziz.zzC(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 740 */                       zziz.zzs(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 724 */                       zziz.zzy(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case 32:
/* 708 */                       zziz.zzz(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 692 */                       zziz.zzA(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 676 */                       zziz.zzB(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, false);
                                continue;
/* 1272 */                      i4 += 3;
/* 1274 */                      i2 = 1048575;
/* 1277 */                      zzipVar = this;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 660 */                       zziz.zzr(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 644 */                       zziz.zzv(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case 37:
/* 628 */                       zziz.zzx(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case 38:
/* 612 */                       zziz.zzD(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case 39:
/* 596 */                       zziz.zzw(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 580 */                       zziz.zzu(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 564 */                       zziz.zzt(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case 42:
/* 548 */                       zziz.zzq(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case 43:
/* 532 */                       zziz.zzC(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case 44:
/* 516 */                       zziz.zzs(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case 45:
/* 500 */                       zziz.zzy(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case 46:
/* 484 */                       zziz.zzz(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case 47:
/* 468 */                       zziz.zzA(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case 48:
/* 452 */                       zziz.zzB(zzipVar.zzc[i4], (List) unsafe.getObject(obj, j), zzjwVar, true);
                                break;
                            case 49:
/* 399 */                       int i16 = zzipVar.zzc[i4];
/* 405 */                       List list4 = (List) unsafe.getObject(obj, j);
/* 407 */                       zzix zzixVarZzv2 = zzipVar.zzv(i4);
/* 411 */                       int i17 = zziz.zza;
/* 413 */                       if (list4 != null && !list4.isEmpty()) {
/* 426 */                           for (int i18 = 0; i18 < list4.size(); i18++) {
/* 435 */                               ((zzgs) zzjwVar).zzq(i16, list4.get(i18), zzixVarZzv2);
                                    }
                                }
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 386 */                       if (unsafe.getObject(obj, j) != null) {
/* 396 */                           throw null;
                                }
                                break;
                            case 51:
/* 371 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 377 */                           zzjwVar.zzf(i6, zzm(obj, j));
                                }
                                break;
                            case 52:
/* 356 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 362 */                           zzjwVar.zzo(i6, zzn(obj, j));
                                }
                                break;
                            case 53:
/* 341 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 347 */                           zzjwVar.zzt(i6, zzt(obj, j));
                                }
                                break;
                            case 54:
/* 326 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 332 */                           zzjwVar.zzK(i6, zzt(obj, j));
                                }
                                break;
                            case 55:
/* 311 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 317 */                           zzjwVar.zzr(i6, zzo(obj, j));
                                }
                                break;
                            case 56:
/* 296 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 302 */                           zzjwVar.zzm(i6, zzt(obj, j));
                                }
                                break;
                            case 57:
/* 281 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 287 */                           zzjwVar.zzk(i6, zzo(obj, j));
                                }
                                break;
                            case 58:
/* 266 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 272 */                           zzjwVar.zzb(i6, zzN(obj, j));
                                }
                                break;
                            case 59:
/* 251 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 257 */                           zzO(i6, unsafe.getObject(obj, j), zzjwVar);
                                }
                                break;
                            case 60:
/* 232 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 242 */                           zzjwVar.zzv(i6, unsafe.getObject(obj, j), zzipVar.zzv(i4));
                                }
                                break;
                            case 61:
/* 216 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 224 */                           zzjwVar.zzd(i6, (zzgk) unsafe.getObject(obj, j));
                                }
                                break;
                            case 62:
/* 202 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 208 */                           zzjwVar.zzI(i6, zzo(obj, j));
                                }
                                break;
                            case 63:
/* 188 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 194 */                           zzjwVar.zzi(i6, zzo(obj, j));
                                }
                                break;
                            case 64:
/* 174 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 180 */                           zzjwVar.zzx(i6, zzo(obj, j));
                                }
                                break;
                            case 65:
/* 160 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 166 */                           zzjwVar.zzz(i6, zzt(obj, j));
                                }
                                break;
                            case 66:
/* 146 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 152 */                           zzjwVar.zzB(i6, zzo(obj, j));
                                }
                                break;
                            case 67:
/* 132 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 138 */                           zzjwVar.zzD(i6, zzt(obj, j));
                                }
                                break;
                            case 68:
/* 114 */                       if (zzipVar.zzM(obj, i6, i4)) {
/* 124 */                           zzjwVar.zzq(i6, unsafe.getObject(obj, j), zzipVar.zzv(i4));
                                }
                                break;
                        }
/* 1272 */              i4 += 3;
/* 1274 */              i2 = 1048575;
/* 1277 */              zzipVar = this;
                    }
/* 1290 */          if (entry != null) {
/* 1307 */              throw null;
                    }
/* 1297 */          ((zzhk) obj).zzc.zzl(zzjwVar);
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final boolean zzj(Object obj, Object obj2) {
                    boolean zZzE;
/* 6 */             for (int i = 0; i < this.zzc.length; i += 3) {
/* 8 */                 int iZzs = zzs(i);
/* 15 */                long j = iZzs & 1048575;
                        switch (zzr(iZzs)) {
                            case 0:
/* 427 */                       if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzjq.zza(obj, j)) != Double.doubleToLongBits(zzjq.zza(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 1:
/* 402 */                       if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzjq.zzb(obj, j)) != Float.floatToIntBits(zzjq.zzb(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 2:
/* 383 */                       if (!zzH(obj, obj2, i) || zzjq.zzd(obj, j) != zzjq.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 3:
/* 364 */                       if (!zzH(obj, obj2, i) || zzjq.zzd(obj, j) != zzjq.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 4:
/* 347 */                       if (!zzH(obj, obj2, i) || zzjq.zzc(obj, j) != zzjq.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 5:
/* 328 */                       if (!zzH(obj, obj2, i) || zzjq.zzd(obj, j) != zzjq.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 6:
/* 310 */                       if (!zzH(obj, obj2, i) || zzjq.zzc(obj, j) != zzjq.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 7:
/* 292 */                       if (!zzH(obj, obj2, i) || zzjq.zzw(obj, j) != zzjq.zzw(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 8:
/* 270 */                       if (!zzH(obj, obj2, i) || !zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 9:
/* 248 */                       if (!zzH(obj, obj2, i) || !zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 10:
/* 226 */                       if (!zzH(obj, obj2, i) || !zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 11:
/* 208 */                       if (!zzH(obj, obj2, i) || zzjq.zzc(obj, j) != zzjq.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 12:
/* 190 */                       if (!zzH(obj, obj2, i) || zzjq.zzc(obj, j) != zzjq.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 172 */                       if (!zzH(obj, obj2, i) || zzjq.zzc(obj, j) != zzjq.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 14:
/* 152 */                       if (!zzH(obj, obj2, i) || zzjq.zzd(obj, j) != zzjq.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 134 */                       if (!zzH(obj, obj2, i) || zzjq.zzc(obj, j) != zzjq.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 16:
/* 114 */                       if (!zzH(obj, obj2, i) || zzjq.zzd(obj, j) != zzjq.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 17:
/* 92 */                        if (!zzH(obj, obj2, i) || !zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
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
/* 80 */                        zZzE = zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j));
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 67 */                        zZzE = zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j));
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
/* 31 */                        long jZzp = zzp(i) & 1048575;
/* 41 */                        if (zzjq.zzc(obj, jZzp) != zzjq.zzc(obj2, jZzp) || !zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            default:
                                continue;
                                break;
                        }
/* 84 */                if (!zZzE) {
/* 1 */                     return false;
                        }
                    }
/* 468 */           if (!((zzhk) obj).zzc.equals(((zzhk) obj2).zzc)) {
/* 1 */                 return false;
                    }
/* 473 */           if (this.zzh) {
/* 483 */               return ((zzhh) obj).zzb.equals(((zzhh) obj2).zzb);
                    }
/* 488 */           return true;
                }

                /* JADX WARN: Code duplicated, block: B:42:0x008d  */
                /* JADX WARN: Code duplicated, block: B:44:0x009c  */
                /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
                /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
                @Override // com.google.android.gms.internal.play_billing.zzix
                public final boolean zzk(Object obj) {
                    int i;
                    int i2;
                    List list;
                    zzix zzixVarZzv;
                    int i3;
/* 5 */             int i4 = 0;
/* 6 */             int i5 = 0;
/* 7 */             int i6 = 1048575;
/* 11 */            while (i4 < this.zzj) {
/* 13 */                int[] iArr = this.zzi;
/* 15 */                int[] iArr2 = this.zzc;
/* 17 */                int i7 = iArr[i4];
/* 19 */                int i8 = iArr2[i7];
/* 21 */                int iZzs = this.zzs(i7);
/* 29 */                int i9 = this.zzc[i7 + 2];
/* 31 */                int i10 = i9 & 1048575;
/* 35 */                int i11 = 1 << (i9 >>> 20);
/* 37 */                if (i10 != i6) {
/* 39 */                    if (i10 != 1048575) {
/* 44 */                        i5 = zzb.getInt(obj, i10);
                            }
/* 48 */                    i2 = i5;
/* 49 */                    i = i10;
                        } else {
/* 51 */                    i = i6;
/* 52 */                    i2 = i5;
                        }
/* 56 */                zzip<T> zzipVar = this;
/* 57 */                Object obj2 = obj;
/* 58 */                if ((268435456 & iZzs) != 0 && !zzipVar.zzJ(obj2, i7, i, i2, i11)) {
/* 1 */                     return false;
                        }
/* 68 */                int iZzr = zzr(iZzs);
/* 74 */                if (iZzr == 9 || iZzr == 17) {
/* 186 */                   if (zzipVar.zzJ(obj2, i7, i, i2, i11) && !zzK(obj2, iZzs, zzipVar.zzv(i7))) {
/* 1 */                         return false;
                            }
                        } else if (iZzr == 27) {
/* 149 */                   list = (List) zzjq.zzf(obj2, iZzs & 1048575);
/* 155 */                   if (list.isEmpty()) {
                                continue;
                            } else {
/* 157 */                       zzixVarZzv = zzipVar.zzv(i7);
/* 166 */                       for (i3 = 0; i3 < list.size(); i3++) {
/* 176 */                           if (!zzixVarZzv.zzk(list.get(i3))) {
/* 1 */                                 return false;
                                    }
                                }
                            }
                        } else if (iZzr == 60 || iZzr == 68) {
/* 129 */                   if (zzipVar.zzM(obj2, i8, i7) && !zzK(obj2, iZzs, zzipVar.zzv(i7))) {
/* 1 */                         return false;
                            }
                        } else if (iZzr == 49) {
/* 149 */                   list = (List) zzjq.zzf(obj2, iZzs & 1048575);
/* 155 */                   if (list.isEmpty()) {
/* 157 */                       zzixVarZzv = zzipVar.zzv(i7);
/* 166 */                       while (i3 < list.size()) {
/* 176 */                           if (!zzixVarZzv.zzk(list.get(i3))) {
/* 1 */                                 return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (iZzr == 50 && !((zzig) zzjq.zzf(obj2, iZzs & 1048575)).isEmpty()) {
/* 124 */                   throw null;
                        }
/* 199 */               i4++;
/* 201 */               this = zzipVar;
/* 202 */               obj = obj2;
/* 203 */               i6 = i;
/* 204 */               i5 = i2;
                    }
                    return !this.zzh || ((zzhh) obj).zzb.zzh();
                }
            }
