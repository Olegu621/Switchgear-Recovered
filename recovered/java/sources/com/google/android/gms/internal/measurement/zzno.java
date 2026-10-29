            package com.google.android.gms.internal.measurement;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.io.IOException;
            import java.lang.reflect.Field;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Map;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            import p000.AbstractC0208c9;
            import p000.C1951n4;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            import p000.pk3;
            import p000.pm2;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzno<T> implements zznw<T> {
                private static final int[] zza = new int[0];
                private static final Unsafe zzb = zzoo.zzq();
                private final int[] zzc;
                private final Object[] zzd;
                private final int zze;
                private final int zzf;
                private final zznl zzg;
                private final boolean zzh;
                private final int[] zzi;
                private final int zzj;
                private final int zzk;
                private final zzoh zzl;
                private final zzlr zzm;

                private zzno(int[] iArr, Object[] objArr, int i, int i2, zznl zznlVar, boolean z, int[] iArr2, int i3, int i4, zznq zznqVar, zzmx zzmxVar, zzoh zzohVar, zzlr zzlrVar, zzng zzngVar) {
/* 4 */             this.zzc = iArr;
/* 6 */             this.zzd = objArr;
/* 8 */             this.zze = i;
/* 10 */            this.zzf = i2;
/* 12 */            boolean z2 = false;
/* 13 */            if (zzlrVar != null && (zznlVar instanceof zzmb)) {
/* 19 */                z2 = true;
                    }
/* 20 */            this.zzh = z2;
/* 22 */            this.zzi = iArr2;
/* 24 */            this.zzj = i3;
/* 26 */            this.zzk = i4;
/* 28 */            this.zzl = zzohVar;
/* 30 */            this.zzm = zzlrVar;
/* 32 */            this.zzg = zznlVar;
                }

                private static boolean zzA(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof zzme) {
/* 11 */                return ((zzme) obj).zzcf();
                    }
/* 16 */            return true;
                }

                private static void zzB(Object obj) {
/* 5 */             if (zzA(obj)) {
/* 7 */                 return;
                    }
/* 18 */            C1951n4.m6859j("Mutating immutable message: ".concat(String.valueOf(obj)));
                }

                private static double zzC(Object obj, long j) {
/* 7 */             return ((Double) zzoo.zzn(obj, j)).doubleValue();
                }

                private static float zzD(Object obj, long j) {
/* 7 */             return ((Float) zzoo.zzn(obj, j)).floatValue();
                }

                private static int zzE(Object obj, long j) {
/* 7 */             return ((Integer) zzoo.zzn(obj, j)).intValue();
                }

                private static long zzF(Object obj, long j) {
/* 7 */             return ((Long) zzoo.zzn(obj, j)).longValue();
                }

                private static boolean zzG(Object obj, long j) {
/* 7 */             return ((Boolean) zzoo.zzn(obj, j)).booleanValue();
                }

                private final boolean zzH(Object obj, Object obj2, int i) {
                    return zzJ(obj, i) == zzJ(obj2, i);
                }

                private final boolean zzI(Object obj, int i, int i2, int i3, int i4) {
/* 4 */             if (i2 == 1048575) {
/* 6 */                 return zzJ(obj, i);
                    }
                    return (i3 & i4) != 0;
                }

                private final boolean zzJ(Object obj, int i) {
/* 1 */             int iZzy = zzy(i);
/* 8 */             long j = iZzy & 1048575;
/* 18 */            if (j != 1048575) {
                        return ((1 << (iZzy >>> 20)) & zzoo.zzd(obj, j)) != 0;
                    }
/* 20 */            int iZzx = zzx(i);
/* 24 */            long j2 = iZzx & 1048575;
                    switch (zzz(iZzx)) {
                        case 0:
                            return Double.doubleToRawLongBits(zzoo.zzl(obj, j2)) != 0;
                        case 1:
                            return Float.floatToRawIntBits(zzoo.zzj(obj, j2)) != 0;
                        case 2:
                            return zzoo.zzf(obj, j2) != 0;
                        case 3:
                            return zzoo.zzf(obj, j2) != 0;
                        case 4:
                            return zzoo.zzd(obj, j2) != 0;
                        case 5:
                            return zzoo.zzf(obj, j2) != 0;
                        case 6:
                            return zzoo.zzd(obj, j2) != 0;
                        case 7:
/* 158 */                   return zzoo.zzh(obj, j2);
                        case 8:
/* 122 */                   Object objZzn = zzoo.zzn(obj, j2);
/* 128 */                   if (objZzn instanceof String) {
                                return !((String) objZzn).isEmpty();
                            }
/* 142 */                   if (objZzn instanceof zzlg) {
                                return !zzlg.zzb.equals(objZzn);
                            }
/* 154 */                   f42.m3649e();
/* 16 */                    return false;
                        case 9:
                            return zzoo.zzn(obj, j2) != null;
                        case 10:
                            return !zzlg.zzb.equals(zzoo.zzn(obj, j2));
                        case 11:
                            return zzoo.zzd(obj, j2) != 0;
                        case 12:
                            return zzoo.zzd(obj, j2) != 0;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                            return zzoo.zzd(obj, j2) != 0;
                        case 14:
                            return zzoo.zzf(obj, j2) != 0;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                            return zzoo.zzd(obj, j2) != 0;
                        case 16:
                            return zzoo.zzf(obj, j2) != 0;
                        case 17:
                            return zzoo.zzn(obj, j2) != null;
                        default:
/* 36 */                    f42.m3649e();
/* 16 */                    return false;
                    }
                }

                private final void zzK(Object obj, int i) {
/* 1 */             int iZzy = zzy(i);
/* 8 */             long j = 1048575 & iZzy;
/* 15 */            if (j == 1048575) {
/* 17 */                return;
                    }
/* 28 */            zzoo.zze(obj, j, (1 << (iZzy >>> 20)) | zzoo.zzd(obj, j));
                }

                private final boolean zzL(Object obj, int i, int i2) {
                    return zzoo.zzd(obj, (long) (zzy(i2) & 1048575)) == i;
                }

                private final void zzM(Object obj, int i, int i2) {
/* 10 */            zzoo.zze(obj, zzy(i2) & 1048575, i);
                }

                private final int zzN(int i, int i2) {
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

                private static final int zzO(byte[] bArr, int i, int i2, zzos zzosVar, Class cls, zzkv zzkvVar) throws IOException {
/* 1 */             zzos zzosVar2 = zzos.zza;
                    switch (zzosVar.ordinal()) {
                        case 0:
/* 163 */                   int i3 = i + 8;
/* 177 */                   zzkvVar.zzc = Double.valueOf(Double.longBitsToDouble(zzkw.zze(bArr, i)));
/* 179 */                   return i3;
                        case 1:
/* 146 */                   int i4 = i + 4;
/* 160 */                   zzkvVar.zzc = Float.valueOf(Float.intBitsToFloat(zzkw.zzd(bArr, i)));
/* 162 */                   return i4;
                        case 2:
                        case 3:
/* 133 */                   int iZzc = zzkw.zzc(bArr, i, zzkvVar);
/* 143 */                   zzkvVar.zzc = Long.valueOf(zzkvVar.zzb);
/* 145 */                   return iZzc;
                        case 4:
                        case 12:
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 120 */                   int iZza = zzkw.zza(bArr, i, zzkvVar);
/* 130 */                   zzkvVar.zzc = Integer.valueOf(zzkvVar.zza);
/* 132 */                   return iZza;
                        case 5:
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 107 */                   int i5 = i + 8;
/* 117 */                   zzkvVar.zzc = Long.valueOf(zzkw.zze(bArr, i));
/* 119 */                   return i5;
                        case 6:
                        case 14:
/* 94 */                    int i6 = i + 4;
/* 104 */                   zzkvVar.zzc = Integer.valueOf(zzkw.zzd(bArr, i));
/* 106 */                   return i6;
                        case 7:
/* 74 */                    int iZzc2 = zzkw.zzc(bArr, i, zzkvVar);
/* 91 */                    zzkvVar.zzc = Boolean.valueOf(zzkvVar.zzb != 0);
/* 93 */                    return iZzc2;
                        case 8:
/* 69 */                    return zzkw.zzf(bArr, i, zzkvVar);
                        case 9:
                        default:
/* 13 */                    f42.m3663s("unsupported field type.");
/* 7 */                     return 0;
                        case 10:
/* 64 */                    return zzkw.zzh(zznt.zza().zzb(cls), bArr, i, i2, zzkvVar);
                        case 11:
/* 51 */                    return zzkw.zzg(bArr, i, zzkvVar);
                        case 16:
/* 34 */                    int iZza2 = zzkw.zza(bArr, i, zzkvVar);
/* 48 */                    zzkvVar.zzc = Integer.valueOf(zzli.zzb(zzkvVar.zza));
/* 50 */                    return iZza2;
                        case 17:
/* 17 */                    int iZzc3 = zzkw.zzc(bArr, i, zzkvVar);
/* 31 */                    zzkvVar.zzc = Long.valueOf(zzli.zzc(zzkvVar.zzb));
/* 33 */                    return iZzc3;
                    }
                }

                private static final void zzP(int i, Object obj, zzou zzouVar) throws IOException {
/* 3 */             if (obj instanceof String) {
/* 7 */                 zzouVar.zzm(i, (String) obj);
                    } else {
/* 13 */                zzouVar.zzn(i, (zzlg) obj);
                    }
                }

                public static zzoi zzg(Object obj) {
/* 1 */             zzme zzmeVar = (zzme) obj;
/* 3 */             zzoi zzoiVar = zzmeVar.zzc;
/* 9 */             if (zzoiVar != zzoi.zza()) {
/* 17 */                return zzoiVar;
                    }
/* 11 */            zzoi zzoiVarZzb = zzoi.zzb();
/* 15 */            zzmeVar.zzc = zzoiVarZzb;
/* 17 */            return zzoiVarZzb;
                }

                /* JADX WARN: Code duplicated, block: B:187:0x03c3  */
                /* JADX WARN: Code duplicated, block: B:193:0x03e2  */
                public static zzno zzl(Class cls, zzni zzniVar, zznq zznqVar, zzmx zzmxVar, zzoh zzohVar, zzlr zzlrVar, zzng zzngVar) {
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
                    zznv zznvVar;
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
                    Field fieldZzm;
                    char cCharAt9;
                    int i25;
                    int i26;
                    int i27;
                    int i28;
                    int i29;
                    Field fieldZzm2;
                    Field fieldZzm3;
                    int i30;
                    char cCharAt10;
                    int i31;
                    int i32;
                    char cCharAt11;
                    int i33;
                    char cCharAt12;
                    int i34;
                    char cCharAt13;
/* 5 */             if (!(zzniVar instanceof zznv)) {
/* 1098 */              throw null;
                    }
/* 7 */             zznv zznvVar2 = (zznv) zzniVar;
/* 9 */             String strZzd = zznvVar2.zzd();
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
/* 365 */           Object[] objArrZze = zznvVar2.zze();
/* 373 */           Class<?> cls2 = zznvVar2.zzb().getClass();
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
/* 456 */                       zznvVar = zznvVar2;
/* 461 */                       if (cCharAt11 < 55296) {
                                    break;
                                }
/* 467 */                       i76 |= (cCharAt11 & 8191) << i78;
/* 468 */                       i78 += 13;
/* 470 */                       i77 = i32;
/* 472 */                       zznvVar2 = zznvVar;
                            }
/* 477 */                   iCharAt11 = i76 | (cCharAt11 << i78);
/* 478 */                   i17 = i32;
                        } else {
/* 481 */                   zznvVar = zznvVar2;
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
                            } else if (zznvVar.zzc() == 1 || i81 != 0) {
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
/* 636 */                       fieldZzm2 = (Field) obj;
                            } else {
/* 644 */                       fieldZzm2 = zzm(cls2, (String) obj);
/* 648 */                       objArrZze[i89] = fieldZzm2;
                            }
/* 638 */                   Object[] objArr3 = objArr2;
/* 639 */                   int i91 = i6;
/* 655 */                   int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzm2);
/* 656 */                   int i92 = i89 + 1;
/* 658 */                   Object obj2 = objArrZze[i92];
/* 664 */                   if (obj2 instanceof Field) {
/* 666 */                       fieldZzm3 = (Field) obj2;
                            } else {
/* 671 */                       fieldZzm3 = zzm(cls2, (String) obj2);
/* 675 */                       objArrZze[i92] = fieldZzm3;
                            }
/* 681 */                   int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzm3);
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
/* 716 */                   Field fieldZzm4 = zzm(cls2, (String) objArrZze[i6]);
/* 720 */                   i18 = iCharAt10;
/* 724 */                   if (i79 == 9 || i79 == 17) {
/* 730 */                       i7 = i7;
/* 867 */                       objArr[pm2.m7483f(i69, 3, 1)] = fieldZzm4.getType();
                            } else {
/* 738 */                       if (i79 != 27) {
/* 742 */                           if (i79 == 49) {
/* 744 */                               i27 = i6 + 2;
/* 748 */                               i25 = 3;
/* 749 */                               i26 = 1;
                                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
/* 817 */                               i7 = i7;
/* 820 */                               if (zznvVar.zzc() == 1 || i81 != 0) {
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
/* 874 */                           iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
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
/* 937 */                                   fieldZzm = (Field) obj3;
                                        } else {
/* 943 */                                   fieldZzm = zzm(cls2, (String) obj3);
/* 947 */                                   objArrZze[i100] = fieldZzm;
                                        }
/* 955 */                               i20 = iCharAt13 % 32;
/* 954 */                               iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzm);
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
/* 874 */                   iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
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
/* 1059 */              zznvVar2 = zznvVar;
/* 1061 */              i7 = i7;
/* 1063 */              objArr2 = objArr;
                    }
/* 1091 */          return new zzno(iArr3, objArr2, i2, i4, zznvVar2.zzb(), false, iArr, i5, i65, zznqVar, zzmxVar, zzohVar, zzlrVar, zzngVar);
                }

                private static Field zzm(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (NoSuchFieldException e) {
/* 7 */                 Field[] declaredFields = cls.getDeclaredFields();
/* 13 */                for (Field field : declaredFields) {
/* 25 */                    if (str.equals(field.getName())) {
/* 27 */                        return field;
                            }
                        }
/* 31 */                String name = cls.getName();
/* 35 */                String string = Arrays.toString(declaredFields);
/* 67 */                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
/* 74 */                fm0.m3796v(sb, "Field ", str, " for ", name);
/* 83 */                ds0.m3198o(fm0.m3789o(sb, " not found. Known fields are ", string), e);
/* 86 */                return null;
                    }
                }

                private final void zzn(Object obj, Object obj2, int i) {
/* 5 */             if (zzJ(obj2, i)) {
/* 15 */                int iZzx = zzx(i) & 1048575;
/* 16 */                Unsafe unsafe = zzb;
                        long j = iZzx;
/* 19 */                Object object = unsafe.getObject(obj2, j);
/* 23 */                if (object == null) {
/* 86 */                    int i2 = this.zzc[i];
/* 88 */                    String string = obj2.toString();
/* 107 */                   pk3.m7469e(String.valueOf(i2).length() + 38 + string.length(), string, i2);
/* 110 */                   return;
                        }
/* 25 */                zznw zznwVarZzp = zzp(i);
/* 33 */                if (!zzJ(obj, i)) {
/* 39 */                    if (zzA(object)) {
/* 45 */                        Object objZza = zznwVarZzp.zza();
/* 49 */                        zznwVarZzp.zzd(objZza, object);
/* 52 */                        unsafe.putObject(obj, j, objZza);
                            } else {
/* 41 */                        unsafe.putObject(obj, j, object);
                            }
/* 55 */                    zzK(obj, i);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, j);
/* 67 */                if (!zzA(object2)) {
/* 69 */                    Object objZza2 = zznwVarZzp.zza();
/* 73 */                    zznwVarZzp.zzd(objZza2, object2);
/* 76 */                    unsafe.putObject(obj, j, objZza2);
/* 79 */                    object2 = objZza2;
                        }
/* 80 */                zznwVarZzp.zzd(object2, object);
                    }
                }

                private final void zzo(Object obj, Object obj2, int i) {
/* 1 */             int[] iArr = this.zzc;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (zzL(obj2, i2, i)) {
/* 19 */                int iZzx = zzx(i) & 1048575;
/* 20 */                Unsafe unsafe = zzb;
                        long j = iZzx;
/* 23 */                Object object = unsafe.getObject(obj2, j);
/* 27 */                if (object == null) {
/* 88 */                    int i3 = iArr[i];
/* 90 */                    String string = obj2.toString();
/* 109 */                   pk3.m7469e(String.valueOf(i3).length() + 38 + string.length(), string, i3);
/* 112 */                   return;
                        }
/* 29 */                zznw zznwVarZzp = zzp(i);
/* 37 */                if (!zzL(obj, i2, i)) {
/* 43 */                    if (zzA(object)) {
/* 49 */                        Object objZza = zznwVarZzp.zza();
/* 53 */                        zznwVarZzp.zzd(objZza, object);
/* 56 */                        unsafe.putObject(obj, j, objZza);
                            } else {
/* 45 */                        unsafe.putObject(obj, j, object);
                            }
/* 59 */                    zzM(obj, i2, i);
/* 62 */                    return;
                        }
/* 63 */                Object object2 = unsafe.getObject(obj, j);
/* 71 */                if (!zzA(object2)) {
/* 73 */                    Object objZza2 = zznwVarZzp.zza();
/* 77 */                    zznwVarZzp.zzd(objZza2, object2);
/* 80 */                    unsafe.putObject(obj, j, objZza2);
/* 83 */                    object2 = objZza2;
                        }
/* 84 */                zznwVarZzp.zzd(object2, object);
                    }
                }

                private final zznw zzp(int i) {
/* 1 */             Object[] objArr = this.zzd;
/* 3 */             int i2 = i / 3;
/* 5 */             int i3 = i2 + i2;
/* 8 */             zznw zznwVar = (zznw) objArr[i3];
/* 10 */            if (zznwVar != null) {
/* 12 */                return zznwVar;
                    }
/* 23 */            zznw zznwVarZzb = zznt.zza().zzb((Class) objArr[i3 + 1]);
/* 27 */            objArr[i3] = zznwVarZzb;
/* 29 */            return zznwVarZzb;
                }

                private final Object zzq(int i) {
/* 1 */             int i2 = i / 3;
/* 6 */             return this.zzd[i2 + i2];
                }

                private final zzmj zzr(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (zzmj) this.zzd[i2 + i2 + 1];
                }

                private final Object zzs(Object obj, int i) {
/* 1 */             zznw zznwVarZzp = zzp(i);
/* 12 */            int iZzx = zzx(i) & 1048575;
/* 17 */            if (!zzJ(obj, i)) {
/* 19 */                return zznwVarZzp.zza();
                    }
/* 27 */            Object object = zzb.getObject(obj, iZzx);
/* 35 */            if (zzA(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZza = zznwVarZzp.zza();
/* 42 */            if (object != null) {
/* 44 */                zznwVarZzp.zzd(objZza, object);
                    }
/* 47 */            return objZza;
                }

                private final void zzt(Object obj, int i, Object obj2) {
/* 12 */            zzb.putObject(obj, zzx(i) & 1048575, obj2);
/* 15 */            zzK(obj, i);
                }

                private final Object zzu(Object obj, int i, int i2) {
/* 1 */             zznw zznwVarZzp = zzp(i2);
/* 9 */             if (!zzL(obj, i, i2)) {
/* 11 */                return zznwVarZzp.zza();
                    }
/* 27 */            Object object = zzb.getObject(obj, zzx(i2) & 1048575);
/* 35 */            if (zzA(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZza = zznwVarZzp.zza();
/* 42 */            if (object != null) {
/* 44 */                zznwVarZzp.zzd(objZza, object);
                    }
/* 47 */            return objZza;
                }

                private final void zzv(Object obj, int i, int i2, Object obj2) {
/* 12 */            zzb.putObject(obj, zzx(i2) & 1048575, obj2);
/* 15 */            zzM(obj, i, i2);
                }

                private static boolean zzw(Object obj, int i, zznw zznwVar) {
/* 10 */            return zznwVar.zzk(zzoo.zzn(obj, i & 1048575));
                }

                private final int zzx(int i) {
/* 5 */             return this.zzc[i + 1];
                }

                private final int zzy(int i) {
/* 5 */             return this.zzc[i + 2];
                }

                private static int zzz(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final Object zza() {
/* 5 */             return ((zzme) this.zzg).zzch();
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final boolean zzb(Object obj, Object obj2) {
                    boolean zZzB;
/* 6 */             for (int i = 0; i < this.zzc.length; i += 3) {
/* 8 */                 int iZzx = zzx(i);
/* 15 */                long j = iZzx & 1048575;
                        switch (zzz(iZzx)) {
                            case 0:
/* 427 */                       if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzoo.zzl(obj, j)) != Double.doubleToLongBits(zzoo.zzl(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 1:
/* 402 */                       if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzoo.zzj(obj, j)) != Float.floatToIntBits(zzoo.zzj(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 2:
/* 383 */                       if (!zzH(obj, obj2, i) || zzoo.zzf(obj, j) != zzoo.zzf(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 3:
/* 364 */                       if (!zzH(obj, obj2, i) || zzoo.zzf(obj, j) != zzoo.zzf(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 4:
/* 347 */                       if (!zzH(obj, obj2, i) || zzoo.zzd(obj, j) != zzoo.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 5:
/* 328 */                       if (!zzH(obj, obj2, i) || zzoo.zzf(obj, j) != zzoo.zzf(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 6:
/* 310 */                       if (!zzH(obj, obj2, i) || zzoo.zzd(obj, j) != zzoo.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 7:
/* 292 */                       if (!zzH(obj, obj2, i) || zzoo.zzh(obj, j) != zzoo.zzh(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 8:
/* 270 */                       if (!zzH(obj, obj2, i) || !zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 9:
/* 248 */                       if (!zzH(obj, obj2, i) || !zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 10:
/* 226 */                       if (!zzH(obj, obj2, i) || !zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 11:
/* 208 */                       if (!zzH(obj, obj2, i) || zzoo.zzd(obj, j) != zzoo.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 12:
/* 190 */                       if (!zzH(obj, obj2, i) || zzoo.zzd(obj, j) != zzoo.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 172 */                       if (!zzH(obj, obj2, i) || zzoo.zzd(obj, j) != zzoo.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 14:
/* 152 */                       if (!zzH(obj, obj2, i) || zzoo.zzf(obj, j) != zzoo.zzf(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 134 */                       if (!zzH(obj, obj2, i) || zzoo.zzd(obj, j) != zzoo.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 16:
/* 114 */                       if (!zzH(obj, obj2, i) || zzoo.zzf(obj, j) != zzoo.zzf(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            case 17:
/* 92 */                        if (!zzH(obj, obj2, i) || !zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j))) {
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
/* 80 */                        zZzB = zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j));
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 67 */                        zZzB = zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j));
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
/* 31 */                        long jZzy = zzy(i) & 1048575;
/* 41 */                        if (zzoo.zzd(obj, jZzy) != zzoo.zzd(obj2, jZzy) || !zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                                break;
                            default:
                                continue;
                                break;
                        }
/* 84 */                if (!zZzB) {
/* 1 */                     return false;
                        }
                    }
/* 468 */           if (!((zzme) obj).zzc.equals(((zzme) obj2).zzc)) {
/* 1 */                 return false;
                    }
/* 473 */           if (this.zzh) {
/* 483 */               return ((zzmb) obj).zzb.equals(((zzmb) obj2).zzb);
                    }
/* 488 */           return true;
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final int zzc(Object obj) {
                    int i;
                    long jDoubleToLongBits;
                    int i2;
                    int iFloatToIntBits;
                    int iZzd;
                    int i3;
/* 1 */             int i4 = 0;
/* 2 */             int i5 = 0;
                    while (true) {
/* 3 */                 int[] iArr = this.zzc;
/* 6 */                 if (i4 >= iArr.length) {
/* 555 */                   int iHashCode = ((zzme) obj).zzc.hashCode() + (i5 * 53);
                            return this.zzh ? (iHashCode * 53) + ((zzmb) obj).zzb.zza.hashCode() : iHashCode;
                        }
/* 8 */                 int iZzx = zzx(i4);
/* 15 */                int i6 = 1048575 & iZzx;
/* 16 */                int iZzz = zzz(iZzx);
/* 20 */                int i7 = iArr[i4];
                        long j = i6;
/* 23 */                int iHashCode2 = 37;
                        switch (iZzz) {
                            case 0:
/* 526 */                       i = i5 * 53;
/* 532 */                       jDoubleToLongBits = Double.doubleToLongBits(zzoo.zzl(obj, j));
/* 536 */                       byte[] bArr = zzmo.zzb;
/* 69 */                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzd;
                                break;
                            case 1:
/* 514 */                       i2 = i5 * 53;
/* 520 */                       iFloatToIntBits = Float.floatToIntBits(zzoo.zzj(obj, j));
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 2:
/* 504 */                       i = i5 * 53;
/* 506 */                       jDoubleToLongBits = zzoo.zzf(obj, j);
/* 510 */                       byte[] bArr2 = zzmo.zzb;
/* 69 */                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzd;
                                break;
                            case 3:
/* 494 */                       i = i5 * 53;
/* 496 */                       jDoubleToLongBits = zzoo.zzf(obj, j);
/* 500 */                       byte[] bArr3 = zzmo.zzb;
/* 69 */                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzd;
                                break;
                            case 4:
/* 486 */                       i = i5 * 53;
/* 488 */                       iZzd = zzoo.zzd(obj, j);
/* 70 */                        i5 = i + iZzd;
                                break;
                            case 5:
/* 476 */                       i = i5 * 53;
/* 478 */                       jDoubleToLongBits = zzoo.zzf(obj, j);
/* 482 */                       byte[] bArr4 = zzmo.zzb;
/* 69 */                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzd;
                                break;
                            case 6:
/* 468 */                       i = i5 * 53;
/* 470 */                       iZzd = zzoo.zzd(obj, j);
/* 70 */                        i5 = i + iZzd;
                                break;
                            case 7:
/* 456 */                       i2 = i5 * 53;
/* 462 */                       iFloatToIntBits = zzmo.zzb(zzoo.zzh(obj, j));
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 8:
/* 442 */                       i2 = i5 * 53;
/* 450 */                       iFloatToIntBits = ((String) zzoo.zzn(obj, j)).hashCode();
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 9:
/* 429 */                       i3 = i5 * 53;
/* 431 */                       Object objZzn = zzoo.zzn(obj, j);
/* 435 */                       if (objZzn != null) {
/* 437 */                           iHashCode2 = objZzn.hashCode();
                                }
/* 362 */                       i5 = i3 + iHashCode2;
                                break;
                            case 10:
/* 417 */                       i2 = i5 * 53;
/* 423 */                       iFloatToIntBits = zzoo.zzn(obj, j).hashCode();
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 11:
/* 409 */                       i = i5 * 53;
/* 411 */                       iZzd = zzoo.zzd(obj, j);
/* 70 */                        i5 = i + iZzd;
                                break;
                            case 12:
/* 401 */                       i = i5 * 53;
/* 403 */                       iZzd = zzoo.zzd(obj, j);
/* 70 */                        i5 = i + iZzd;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 393 */                       i = i5 * 53;
/* 395 */                       iZzd = zzoo.zzd(obj, j);
/* 70 */                        i5 = i + iZzd;
                                break;
                            case 14:
/* 383 */                       i = i5 * 53;
/* 385 */                       jDoubleToLongBits = zzoo.zzf(obj, j);
/* 389 */                       byte[] bArr5 = zzmo.zzb;
/* 69 */                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzd;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 375 */                       i = i5 * 53;
/* 377 */                       iZzd = zzoo.zzd(obj, j);
/* 70 */                        i5 = i + iZzd;
                                break;
                            case 16:
/* 365 */                       i = i5 * 53;
/* 367 */                       jDoubleToLongBits = zzoo.zzf(obj, j);
/* 371 */                       byte[] bArr6 = zzmo.zzb;
/* 69 */                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzd;
                                break;
                            case 17:
/* 350 */                       i3 = i5 * 53;
/* 352 */                       Object objZzn2 = zzoo.zzn(obj, j);
/* 356 */                       if (objZzn2 != null) {
/* 358 */                           iHashCode2 = objZzn2.hashCode();
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
/* 344 */                       iFloatToIntBits = zzoo.zzn(obj, j).hashCode();
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 326 */                       i2 = i5 * 53;
/* 332 */                       iFloatToIntBits = zzoo.zzn(obj, j).hashCode();
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 51:
/* 310 */                       if (zzL(obj, i7, i4)) {
/* 312 */                           i = i5 * 53;
/* 318 */                           jDoubleToLongBits = Double.doubleToLongBits(zzC(obj, j));
/* 322 */                           byte[] bArr7 = zzmo.zzb;
/* 69 */                            iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzd;
                                }
                                break;
                            case 52:
/* 292 */                       if (zzL(obj, i7, i4)) {
/* 294 */                           i2 = i5 * 53;
/* 300 */                           iFloatToIntBits = Float.floatToIntBits(zzD(obj, j));
/* 48 */                            i5 = iFloatToIntBits + i2;
                                }
                                break;
                            case 53:
/* 276 */                       if (zzL(obj, i7, i4)) {
/* 278 */                           i = i5 * 53;
/* 280 */                           jDoubleToLongBits = zzF(obj, j);
/* 284 */                           byte[] bArr8 = zzmo.zzb;
/* 69 */                            iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzd;
                                }
                                break;
                            case 54:
/* 260 */                       if (zzL(obj, i7, i4)) {
/* 262 */                           i = i5 * 53;
/* 264 */                           jDoubleToLongBits = zzF(obj, j);
/* 268 */                           byte[] bArr9 = zzmo.zzb;
/* 69 */                            iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzd;
                                }
                                break;
                            case 55:
/* 246 */                       if (zzL(obj, i7, i4)) {
/* 248 */                           i = i5 * 53;
/* 250 */                           iZzd = zzE(obj, j);
/* 70 */                            i5 = i + iZzd;
                                }
                                break;
                            case 56:
/* 230 */                       if (zzL(obj, i7, i4)) {
/* 232 */                           i = i5 * 53;
/* 234 */                           jDoubleToLongBits = zzF(obj, j);
/* 238 */                           byte[] bArr10 = zzmo.zzb;
/* 69 */                            iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzd;
                                }
                                break;
                            case 57:
/* 216 */                       if (zzL(obj, i7, i4)) {
/* 218 */                           i = i5 * 53;
/* 220 */                           iZzd = zzE(obj, j);
/* 70 */                            i5 = i + iZzd;
                                }
                                break;
                            case 58:
/* 198 */                       if (zzL(obj, i7, i4)) {
/* 200 */                           i2 = i5 * 53;
/* 206 */                           iFloatToIntBits = zzmo.zzb(zzG(obj, j));
/* 48 */                            i5 = iFloatToIntBits + i2;
                                }
                                break;
                            case 59:
/* 178 */                       if (zzL(obj, i7, i4)) {
/* 180 */                           i2 = i5 * 53;
/* 188 */                           iFloatToIntBits = ((String) zzoo.zzn(obj, j)).hashCode();
/* 48 */                            i5 = iFloatToIntBits + i2;
                                }
                                break;
                            case 60:
/* 161 */                       if (zzL(obj, i7, i4)) {
/* 163 */                           i2 = i5 * 53;
/* 169 */                           iFloatToIntBits = zzoo.zzn(obj, j).hashCode();
/* 48 */                            i5 = iFloatToIntBits + i2;
                                }
                                break;
                            case 61:
/* 144 */                       if (zzL(obj, i7, i4)) {
/* 146 */                           i2 = i5 * 53;
/* 152 */                           iFloatToIntBits = zzoo.zzn(obj, j).hashCode();
/* 48 */                            i5 = iFloatToIntBits + i2;
                                }
                                break;
                            case 62:
/* 131 */                       if (zzL(obj, i7, i4)) {
/* 133 */                           i = i5 * 53;
/* 135 */                           iZzd = zzE(obj, j);
/* 70 */                            i5 = i + iZzd;
                                }
                                break;
                            case 63:
/* 118 */                       if (zzL(obj, i7, i4)) {
/* 120 */                           i = i5 * 53;
/* 122 */                           iZzd = zzE(obj, j);
/* 70 */                            i5 = i + iZzd;
                                }
                                break;
                            case 64:
/* 105 */                       if (zzL(obj, i7, i4)) {
/* 107 */                           i = i5 * 53;
/* 109 */                           iZzd = zzE(obj, j);
/* 70 */                            i5 = i + iZzd;
                                }
                                break;
                            case 65:
/* 90 */                        if (zzL(obj, i7, i4)) {
/* 92 */                            i = i5 * 53;
/* 94 */                            jDoubleToLongBits = zzF(obj, j);
/* 98 */                            byte[] bArr11 = zzmo.zzb;
/* 69 */                            iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzd;
                                }
                                break;
                            case 66:
/* 77 */                        if (zzL(obj, i7, i4)) {
/* 79 */                            i = i5 * 53;
/* 81 */                            iZzd = zzE(obj, j);
/* 70 */                            i5 = i + iZzd;
                                }
                                break;
                            case 67:
/* 56 */                        if (zzL(obj, i7, i4)) {
/* 58 */                            i = i5 * 53;
/* 60 */                            jDoubleToLongBits = zzF(obj, j);
/* 64 */                            byte[] bArr12 = zzmo.zzb;
/* 69 */                            iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzd;
                                }
                                break;
                            case 68:
/* 36 */                        if (zzL(obj, i7, i4)) {
/* 38 */                            i2 = i5 * 53;
/* 44 */                            iFloatToIntBits = zzoo.zzn(obj, j).hashCode();
/* 48 */                            i5 = iFloatToIntBits + i2;
                                }
                                break;
                        }
/* 540 */               i4 += 3;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final void zzd(Object obj, Object obj2) {
/* 1 */             zzB(obj);
/* 4 */             obj2.getClass();
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 int[] iArr = this.zzc;
/* 11 */                if (i >= iArr.length) {
/* 441 */                   zzny.zzD(this.zzl, obj, obj2);
/* 446 */                   if (this.zzh) {
/* 450 */                       zzny.zzC(this.zzm, obj, obj2);
/* 453 */                       return;
                            }
/* 453 */                   return;
                        }
/* 13 */                int iZzx = zzx(i);
/* 20 */                int i2 = 1048575 & iZzx;
/* 21 */                int iZzz = zzz(iZzx);
/* 25 */                int i3 = iArr[i];
                        long j = i2;
                        switch (iZzz) {
                            case 0:
/* 423 */                       if (zzJ(obj2, i)) {
/* 429 */                           zzoo.zzm(obj, j, zzoo.zzl(obj2, j));
/* 432 */                           zzK(obj, i);
                                }
                                break;
                            case 1:
/* 406 */                       if (zzJ(obj2, i)) {
/* 412 */                           zzoo.zzk(obj, j, zzoo.zzj(obj2, j));
/* 415 */                           zzK(obj, i);
                                }
                                break;
                            case 2:
/* 389 */                       if (zzJ(obj2, i)) {
/* 395 */                           zzoo.zzg(obj, j, zzoo.zzf(obj2, j));
/* 398 */                           zzK(obj, i);
                                }
                                break;
                            case 3:
/* 372 */                       if (zzJ(obj2, i)) {
/* 378 */                           zzoo.zzg(obj, j, zzoo.zzf(obj2, j));
/* 381 */                           zzK(obj, i);
                                }
                                break;
                            case 4:
/* 355 */                       if (zzJ(obj2, i)) {
/* 361 */                           zzoo.zze(obj, j, zzoo.zzd(obj2, j));
/* 364 */                           zzK(obj, i);
                                }
                                break;
                            case 5:
/* 338 */                       if (zzJ(obj2, i)) {
/* 344 */                           zzoo.zzg(obj, j, zzoo.zzf(obj2, j));
/* 347 */                           zzK(obj, i);
                                }
                                break;
                            case 6:
/* 321 */                       if (zzJ(obj2, i)) {
/* 327 */                           zzoo.zze(obj, j, zzoo.zzd(obj2, j));
/* 330 */                           zzK(obj, i);
                                }
                                break;
                            case 7:
/* 303 */                       if (zzJ(obj2, i)) {
/* 309 */                           zzoo.zzi(obj, j, zzoo.zzh(obj2, j));
/* 312 */                           zzK(obj, i);
                                }
                                break;
                            case 8:
/* 285 */                       if (zzJ(obj2, i)) {
/* 291 */                           zzoo.zzo(obj, j, zzoo.zzn(obj2, j));
/* 294 */                           zzK(obj, i);
                                }
                                break;
                            case 9:
/* 276 */                       zzn(obj, obj2, i);
                                break;
                            case 10:
/* 262 */                       if (zzJ(obj2, i)) {
/* 268 */                           zzoo.zzo(obj, j, zzoo.zzn(obj2, j));
/* 271 */                           zzK(obj, i);
                                }
                                break;
                            case 11:
/* 244 */                       if (zzJ(obj2, i)) {
/* 250 */                           zzoo.zze(obj, j, zzoo.zzd(obj2, j));
/* 253 */                           zzK(obj, i);
                                }
                                break;
                            case 12:
/* 226 */                       if (zzJ(obj2, i)) {
/* 232 */                           zzoo.zze(obj, j, zzoo.zzd(obj2, j));
/* 235 */                           zzK(obj, i);
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 208 */                       if (zzJ(obj2, i)) {
/* 214 */                           zzoo.zze(obj, j, zzoo.zzd(obj2, j));
/* 217 */                           zzK(obj, i);
                                }
                                break;
                            case 14:
/* 190 */                       if (zzJ(obj2, i)) {
/* 196 */                           zzoo.zzg(obj, j, zzoo.zzf(obj2, j));
/* 199 */                           zzK(obj, i);
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 172 */                       if (zzJ(obj2, i)) {
/* 178 */                           zzoo.zze(obj, j, zzoo.zzd(obj2, j));
/* 181 */                           zzK(obj, i);
                                }
                                break;
                            case 16:
/* 154 */                       if (zzJ(obj2, i)) {
/* 160 */                           zzoo.zzg(obj, j, zzoo.zzf(obj2, j));
/* 163 */                           zzK(obj, i);
                                }
                                break;
                            case 17:
/* 145 */                       zzn(obj, obj2, i);
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
/* 102 */                       zzmn zzmnVarZzg = (zzmn) zzoo.zzn(obj, j);
/* 108 */                       zzmn zzmnVar = (zzmn) zzoo.zzn(obj2, j);
/* 110 */                       int size = zzmnVarZzg.size();
/* 114 */                       int size2 = zzmnVar.size();
/* 118 */                       if (size > 0 && size2 > 0) {
/* 126 */                           if (!zzmnVarZzg.zza()) {
/* 129 */                               zzmnVarZzg = zzmnVarZzg.zzg(size2 + size);
                                    }
/* 133 */                           zzmnVarZzg.addAll(zzmnVar);
                                }
/* 136 */                       if (size > 0) {
/* 139 */                           zzmnVar = zzmnVarZzg;
                                }
/* 140 */                       zzoo.zzo(obj, j, zzmnVar);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 79 */                        int i4 = zzny.zza;
/* 93 */                        zzoo.zzo(obj, j, zzng.zza(zzoo.zzn(obj, j), zzoo.zzn(obj2, j)));
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
/* 65 */                        if (zzL(obj2, i3, i)) {
/* 71 */                            zzoo.zzo(obj, j, zzoo.zzn(obj2, j));
/* 74 */                            zzM(obj, i3, i);
                                }
                                break;
                            case 60:
/* 56 */                        zzo(obj, obj2, i);
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
/* 42 */                        if (zzL(obj2, i3, i)) {
/* 48 */                            zzoo.zzo(obj, j, zzoo.zzn(obj2, j));
/* 51 */                            zzM(obj, i3, i);
                                }
                                break;
                            case 68:
/* 33 */                        zzo(obj, obj2, i);
                                break;
                        }
/* 435 */               i += 3;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:196:0x04ea  */
                /* JADX WARN: Code duplicated, block: B:83:0x01e5  */
                @Override // com.google.android.gms.internal.measurement.zznw
                public final int zze(Object obj) {
                    int i;
                    int iZzz;
                    int iZzA;
                    int iZzz2;
                    int iZzc;
                    int iZzz3;
                    int iZzz4;
                    int iZzG;
                    int iZzz5;
                    int size;
                    int iZzp;
                    int iZzz6;
                    int iZzz7;
                    int iZzz8;
                    int iZzx;
                    int iZzz9;
                    int iZzz10;
                    int iZzG2;
                    int iZzz11;
                    int iZzA2;
/* 1 */             zzno<T> zznoVar = this;
/* 5 */             Unsafe unsafe = zzb;
/* 8 */             int i2 = 1048575;
/* 11 */            int i3 = 0;
/* 12 */            int i4 = 0;
/* 13 */            int iM7493p = 0;
/* 14 */            int i5 = 1048575;
                    while (true) {
/* 15 */                int[] iArr = zznoVar.zzc;
/* 18 */                if (i3 >= iArr.length) {
/* 1804 */                  int iZzi = ((zzme) obj).zzc.zzi() + iM7493p;
/* 1807 */                  if (!zznoVar.zzh) {
/* 1886 */                      return iZzi;
                            }
/* 1815 */                  zzod zzodVar = ((zzmb) obj).zzb.zza;
/* 1817 */                  int iZzc2 = zzodVar.zzc();
/* 1821 */                  int iZzj = 0;
/* 1822 */                  for (int i6 = 0; i6 < iZzc2; i6++) {
/* 1824 */                      Map.Entry entryZzd = zzodVar.zzd(i6);
/* 1845 */                      iZzj += zzlv.zzj((zzlu) ((zzoa) entryZzd).zza(), entryZzd.getValue());
                            }
/* 1861 */                  for (Map.Entry entry : zzodVar.zze()) {
/* 1883 */                      iZzj += zzlv.zzj((zzlu) entry.getKey(), entry.getValue());
                            }
/* 1885 */                  return iZzi + iZzj;
                        }
/* 20 */                int iZzx2 = zznoVar.zzx(i3);
/* 24 */                int iZzz12 = zzz(iZzx2);
/* 28 */                int i7 = iArr[i3];
/* 32 */                int i8 = iArr[i3 + 2];
/* 34 */                int i9 = i8 & i2;
/* 39 */                if (iZzz12 <= 17) {
/* 41 */                    if (i9 != i5) {
/* 48 */                        i4 = i9 == i2 ? 0 : unsafe.getInt(obj, i9);
/* 53 */                        i5 = i9;
                            }
/* 56 */                    i = 1 << (i8 >>> 20);
                        } else {
/* 59 */                    i = 0;
                        }
/* 60 */                int i10 = iZzx2 & i2;
/* 67 */                if (iZzz12 >= zzlw.zzJ.zza()) {
/* 71 */                    zzlw.zzW.zza();
                        }
                        long j = i10;
                        switch (iZzz12) {
                            case 0:
/* 1777 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1781 */                          iM7493p = pm2.m7493p(i7 << 3, 8, iM7493p);
                                }
                                break;
                            case 1:
/* 1763 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1767 */                          iM7493p = pm2.m7493p(i7 << 3, 4, iM7493p);
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case 2:
/* 1741 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1745 */                          long j2 = unsafe.getLong(obj, j);
/* 1749 */                          iZzz = zzll.zzz(i7 << 3);
/* 1753 */                          iZzA = zzll.zzA(j2);
/* 1456 */                          iM7493p += iZzA + iZzz;
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case 3:
/* 1719 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1723 */                          long j3 = unsafe.getLong(obj, j);
/* 1727 */                          iZzz = zzll.zzz(i7 << 3);
/* 1731 */                          iZzA = zzll.zzA(j3);
/* 1456 */                          iM7493p += iZzA + iZzz;
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case 4:
/* 1696 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1700 */                          long j4 = unsafe.getInt(obj, j);
/* 1705 */                          iZzz = zzll.zzz(i7 << 3);
/* 1709 */                          iZzA = zzll.zzA(j4);
/* 1456 */                          iM7493p += iZzA + iZzz;
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case 5:
/* 1682 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1686 */                          iM7493p = pm2.m7493p(i7 << 3, 8, iM7493p);
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case 6:
/* 1668 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1672 */                          iM7493p = pm2.m7493p(i7 << 3, 4, iM7493p);
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case 7:
/* 1654 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1658 */                          iM7493p = pm2.m7493p(i7 << 3, 1, iM7493p);
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case 8:
/* 1611 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1613 */                          int i11 = i7 << 3;
/* 1615 */                          Object object = unsafe.getObject(obj, j);
/* 1621 */                          if (object instanceof zzlg) {
/* 1625 */                              iZzz2 = zzll.zzz(i11);
/* 1629 */                              iZzc = ((zzlg) object).zzc();
/* 1633 */                              iZzz3 = zzll.zzz(iZzc);
/* 1584 */                              iM7493p += iZzz3 + iZzc + iZzz2;
                                    } else {
/* 1640 */                              iZzz = zzll.zzz(i11);
/* 1644 */                              iZzA = zzll.zzB((String) object);
/* 1456 */                              iM7493p += iZzA + iZzz;
                                    }
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case 9:
/* 1591 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1601 */                          iZzz4 = zzny.zzz(i7, unsafe.getObject(obj, j), zznoVar.zzp(i3));
/* 285 */                           iM7493p += iZzz4;
                                }
                                break;
                            case 10:
/* 1560 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1568 */                          zzlg zzlgVar = (zzlg) unsafe.getObject(obj, j);
/* 1570 */                          iZzz2 = zzll.zzz(i7 << 3);
/* 1574 */                          iZzc = zzlgVar.zzc();
/* 1578 */                          iZzz3 = zzll.zzz(iZzc);
/* 1584 */                          iM7493p += iZzz3 + iZzc + iZzz2;
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case 11:
/* 1539 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1551 */                          iM7493p = pm2.m7493p(unsafe.getInt(obj, j), zzll.zzz(i7 << 3), iM7493p);
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case 12:
/* 1517 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1521 */                          long j5 = unsafe.getInt(obj, j);
/* 1526 */                          iZzz = zzll.zzz(i7 << 3);
/* 1530 */                          iZzA = zzll.zzA(j5);
/* 1456 */                          iM7493p += iZzA + iZzz;
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1504 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1508 */                          iM7493p = pm2.m7493p(i7 << 3, 4, iM7493p);
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case 14:
/* 1491 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1495 */                          iM7493p = pm2.m7493p(i7 << 3, 8, iM7493p);
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1465 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1469 */                          int i12 = unsafe.getInt(obj, j);
/* 1482 */                          iM7493p = pm2.m7493p((i12 >> 31) ^ (i12 + i12), zzll.zzz(i7 << 3), iM7493p);
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case 16:
/* 1434 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1438 */                          long j6 = unsafe.getLong(obj, j);
/* 1446 */                          iZzz = zzll.zzz(i7 << 3);
/* 1451 */                          iZzA = zzll.zzA((j6 >> 63) ^ (j6 + j6));
/* 1456 */                          iM7493p += iZzA + iZzz;
                                }
/* 1457 */                      zznoVar = this;
                                break;
                            case 17:
/* 1412 */                      if (zznoVar.zzI(obj, i3, i5, i4, i)) {
/* 1424 */                          iZzG = zzll.zzG(i7, (zznl) unsafe.getObject(obj, j), zznoVar.zzp(i3));
/* 105 */                           iM7493p += iZzG;
                                }
                                break;
                            case 18:
/* 1402 */                      iZzz4 = zzny.zzy(i7, (List) unsafe.getObject(obj, j), false);
/* 285 */                       iM7493p += iZzz4;
                                break;
                            case 19:
/* 1390 */                      iZzz4 = zzny.zzw(i7, (List) unsafe.getObject(obj, j), false);
/* 285 */                       iM7493p += iZzz4;
                                break;
                            case 20:
/* 1356 */                      List list = (List) unsafe.getObject(obj, j);
/* 1358 */                      int i13 = zzny.zza;
/* 1364 */                      if (list.size() == 0) {
/* 1259 */                          iZzz5 = 0;
                                } else {
/* 1382 */                          iZzz5 = (zzll.zzz(i7 << 3) * list.size()) + zzny.zzo(list);
                                }
/* 1269 */                      iM7493p += iZzz5;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 1328 */                      List list2 = (List) unsafe.getObject(obj, j);
/* 1330 */                      int i14 = zzny.zza;
/* 1332 */                      size = list2.size();
/* 1336 */                      if (size == 0) {
/* 486 */                           iZzz7 = 0;
                                } else {
/* 1342 */                          iZzp = zzny.zzp(list2);
/* 1346 */                          iZzz6 = zzll.zzz(i7 << 3);
/* 932 */                           iZzz7 = (iZzz6 * size) + iZzp;
                                }
/* 523 */                       iM7493p += iZzz7;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 1300 */                      List list3 = (List) unsafe.getObject(obj, j);
/* 1302 */                      int i15 = zzny.zza;
/* 1304 */                      size = list3.size();
/* 1308 */                      if (size == 0) {
/* 486 */                           iZzz7 = 0;
                                } else {
/* 1314 */                          iZzp = zzny.zzs(list3);
/* 1318 */                          iZzz6 = zzll.zzz(i7 << 3);
/* 932 */                           iZzz7 = (iZzz6 * size) + iZzp;
                                }
/* 523 */                       iM7493p += iZzz7;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 1290 */                      iZzz4 = zzny.zzy(i7, (List) unsafe.getObject(obj, j), false);
/* 285 */                       iM7493p += iZzz4;
                                break;
                            case 24:
/* 1278 */                      iZzz4 = zzny.zzw(i7, (List) unsafe.getObject(obj, j), false);
/* 285 */                       iM7493p += iZzz4;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 1249 */                      List list4 = (List) unsafe.getObject(obj, j);
/* 1251 */                      int i16 = zzny.zza;
/* 1253 */                      int size2 = list4.size();
/* 1257 */                      if (size2 == 0) {
/* 1259 */                          iZzz5 = 0;
                                } else {
/* 1268 */                          iZzz5 = (zzll.zzz(i7 << 3) + 1) * size2;
                                }
/* 1269 */                      iM7493p += iZzz5;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 1154 */                      List list5 = (List) unsafe.getObject(obj, j);
/* 1156 */                      int i17 = zzny.zza;
/* 1158 */                      int size3 = list5.size();
/* 1162 */                      if (size3 == 0) {
/* 486 */                           iZzz7 = 0;
                                } else {
/* 1172 */                          iZzz7 = zzll.zzz(i7 << 3) * size3;
/* 1175 */                          if (list5 instanceof zzmw) {
/* 1177 */                              zzmw zzmwVar = (zzmw) list5;
/* 1180 */                              for (int i18 = 0; i18 < size3; i18++) {
/* 1182 */                                  Object objZzc = zzmwVar.zzc();
/* 1188 */                                  if (objZzc instanceof zzlg) {
/* 1192 */                                      int iZzc3 = ((zzlg) objZzc).zzc();
/* 1196 */                                      iZzz7 = pm2.m7493p(iZzc3, iZzc3, iZzz7);
                                            } else {
/* 1207 */                                      iZzz7 = zzll.zzB((String) objZzc) + iZzz7;
                                            }
                                        }
                                    } else {
/* 1213 */                              for (int i19 = 0; i19 < size3; i19++) {
/* 1215 */                                  Object obj2 = list5.get(i19);
/* 1221 */                                  if (obj2 instanceof zzlg) {
/* 1225 */                                      int iZzc4 = ((zzlg) obj2).zzc();
/* 1229 */                                      iZzz7 = pm2.m7493p(iZzc4, iZzc4, iZzz7);
                                            } else {
/* 1240 */                                      iZzz7 = zzll.zzB((String) obj2) + iZzz7;
                                            }
                                        }
                                    }
                                }
/* 523 */                       iM7493p += iZzz7;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 1091 */                      List list6 = (List) unsafe.getObject(obj, j);
/* 1093 */                      zznw zznwVarZzp = zznoVar.zzp(i3);
/* 1097 */                      int i20 = zzny.zza;
/* 1099 */                      int size4 = list6.size();
/* 1103 */                      if (size4 == 0) {
/* 1105 */                          iZzz8 = 0;
                                } else {
/* 1113 */                          iZzz8 = zzll.zzz(i7 << 3) * size4;
/* 1115 */                          for (int i21 = 0; i21 < size4; i21++) {
/* 1117 */                              Object obj3 = list6.get(i21);
/* 1123 */                              if (obj3 instanceof zzmv) {
/* 1127 */                                  int iZzb = ((zzmv) obj3).zzb();
/* 1131 */                                  iZzz8 = pm2.m7493p(iZzb, iZzb, iZzz8);
                                        } else {
/* 1142 */                                  iZzz8 = zzll.zzD((zznl) obj3, zznwVarZzp) + iZzz8;
                                        }
                                    }
                                }
/* 1147 */                      iM7493p += iZzz8;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 1044 */                      List list7 = (List) unsafe.getObject(obj, j);
/* 1046 */                      int i22 = zzny.zza;
/* 1048 */                      int size5 = list7.size();
/* 1052 */                      if (size5 == 0) {
/* 486 */                           iZzz7 = 0;
                                } else {
/* 1062 */                          iZzz7 = zzll.zzz(i7 << 3) * size5;
/* 1068 */                          for (int i23 = 0; i23 < list7.size(); i23++) {
/* 1076 */                              int iZzc5 = ((zzlg) list7.get(i23)).zzc();
/* 1080 */                              iZzz7 = pm2.m7493p(iZzc5, iZzc5, iZzz7);
                                    }
                                }
/* 523 */                       iM7493p += iZzz7;
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 1017 */                      List list8 = (List) unsafe.getObject(obj, j);
/* 1019 */                      int i24 = zzny.zza;
/* 1021 */                      size = list8.size();
/* 1025 */                      if (size == 0) {
/* 486 */                           iZzz7 = 0;
                                } else {
/* 1031 */                          iZzp = zzny.zzt(list8);
/* 1035 */                          iZzz6 = zzll.zzz(i7 << 3);
/* 932 */                           iZzz7 = (iZzz6 * size) + iZzp;
                                }
/* 523 */                       iM7493p += iZzz7;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 990 */                       List list9 = (List) unsafe.getObject(obj, j);
/* 992 */                       int i25 = zzny.zza;
/* 994 */                       size = list9.size();
/* 998 */                       if (size == 0) {
/* 486 */                           iZzz7 = 0;
                                } else {
/* 1004 */                          iZzp = zzny.zzr(list9);
/* 1008 */                          iZzz6 = zzll.zzz(i7 << 3);
/* 932 */                           iZzz7 = (iZzz6 * size) + iZzp;
                                }
/* 523 */                       iM7493p += iZzz7;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 980 */                       iZzz4 = zzny.zzw(i7, (List) unsafe.getObject(obj, j), false);
/* 285 */                       iM7493p += iZzz4;
                                break;
                            case 32:
/* 968 */                       iZzz4 = zzny.zzy(i7, (List) unsafe.getObject(obj, j), false);
/* 285 */                       iM7493p += iZzz4;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 939 */                       List list10 = (List) unsafe.getObject(obj, j);
/* 941 */                       int i26 = zzny.zza;
/* 943 */                       size = list10.size();
/* 947 */                       if (size == 0) {
/* 486 */                           iZzz7 = 0;
                                } else {
/* 953 */                           iZzp = zzny.zzu(list10);
/* 957 */                           iZzz6 = zzll.zzz(i7 << 3);
/* 932 */                           iZzz7 = (iZzz6 * size) + iZzp;
                                }
/* 523 */                       iM7493p += iZzz7;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 909 */                       List list11 = (List) unsafe.getObject(obj, j);
/* 911 */                       int i27 = zzny.zza;
/* 913 */                       size = list11.size();
/* 917 */                       if (size == 0) {
/* 486 */                           iZzz7 = 0;
                                } else {
/* 923 */                           iZzp = zzny.zzq(list11);
/* 927 */                           iZzz6 = zzll.zzz(i7 << 3);
/* 932 */                           iZzz7 = (iZzz6 * size) + iZzp;
                                }
/* 523 */                       iM7493p += iZzz7;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 887 */                       iZzx = zzny.zzx((List) unsafe.getObject(obj, j));
/* 891 */                       if (iZzx > 0) {
/* 895 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 899 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 863 */                       iZzx = zzny.zzv((List) unsafe.getObject(obj, j));
/* 867 */                       if (iZzx > 0) {
/* 871 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 875 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case 37:
/* 839 */                       iZzx = zzny.zzo((List) unsafe.getObject(obj, j));
/* 843 */                       if (iZzx > 0) {
/* 847 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 851 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case 38:
/* 815 */                       iZzx = zzny.zzp((List) unsafe.getObject(obj, j));
/* 819 */                       if (iZzx > 0) {
/* 823 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 827 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case 39:
/* 791 */                       iZzx = zzny.zzs((List) unsafe.getObject(obj, j));
/* 795 */                       if (iZzx > 0) {
/* 799 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 803 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 767 */                       iZzx = zzny.zzx((List) unsafe.getObject(obj, j));
/* 771 */                       if (iZzx > 0) {
/* 775 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 779 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 743 */                       iZzx = zzny.zzv((List) unsafe.getObject(obj, j));
/* 747 */                       if (iZzx > 0) {
/* 751 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 755 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case 42:
/* 715 */                       List list12 = (List) unsafe.getObject(obj, j);
/* 717 */                       int i28 = zzny.zza;
/* 719 */                       iZzx = list12.size();
/* 723 */                       if (iZzx > 0) {
/* 727 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 731 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case 43:
/* 693 */                       iZzx = zzny.zzt((List) unsafe.getObject(obj, j));
/* 697 */                       if (iZzx > 0) {
/* 701 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 705 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case 44:
/* 669 */                       iZzx = zzny.zzr((List) unsafe.getObject(obj, j));
/* 673 */                       if (iZzx > 0) {
/* 677 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 681 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case 45:
/* 645 */                       iZzx = zzny.zzv((List) unsafe.getObject(obj, j));
/* 649 */                       if (iZzx > 0) {
/* 653 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 657 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case 46:
/* 621 */                       iZzx = zzny.zzx((List) unsafe.getObject(obj, j));
/* 625 */                       if (iZzx > 0) {
/* 629 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 633 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case 47:
/* 597 */                       iZzx = zzny.zzu((List) unsafe.getObject(obj, j));
/* 601 */                       if (iZzx > 0) {
/* 605 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 609 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case 48:
/* 573 */                       iZzx = zzny.zzq((List) unsafe.getObject(obj, j));
/* 577 */                       if (iZzx > 0) {
/* 581 */                           iZzz9 = zzll.zzz(i7 << 3);
/* 585 */                           iZzz10 = zzll.zzz(iZzx);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case 49:
/* 530 */                       List list13 = (List) unsafe.getObject(obj, j);
/* 532 */                       zznw zznwVarZzp2 = zznoVar.zzp(i3);
/* 536 */                       int i29 = zzny.zza;
/* 538 */                       int size6 = list13.size();
/* 542 */                       if (size6 == 0) {
/* 544 */                           iZzG2 = 0;
                                } else {
/* 547 */                           iZzG2 = 0;
/* 548 */                           for (int i30 = 0; i30 < size6; i30++) {
/* 560 */                               iZzG2 += zzll.zzG(i7, (zznl) list13.get(i30), zznwVarZzp2);
                                    }
                                }
/* 564 */                       iM7493p += iZzG2;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 476 */                       zznf zznfVar = (zznf) unsafe.getObject(obj, j);
/* 478 */                       zzne zzneVar = (zzne) zznoVar.zzq(i3);
/* 484 */                       if (zznfVar.isEmpty()) {
/* 486 */                           iZzz7 = 0;
                                } else {
/* 496 */                           iZzz7 = 0;
/* 501 */                           for (Map.Entry entry2 : zznfVar.entrySet()) {
/* 521 */                               iZzz7 += zzneVar.zzd(i7, entry2.getKey(), entry2.getValue());
                                    }
                                }
/* 523 */                       iM7493p += iZzz7;
                                break;
                            case 51:
/* 458 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 462 */                           iM7493p = pm2.m7493p(i7 << 3, 8, iM7493p);
                                }
                                break;
                            case 52:
/* 444 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 448 */                           iM7493p = pm2.m7493p(i7 << 3, 4, iM7493p);
                                }
                                break;
                            case 53:
/* 422 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 426 */                           long jZzF = zzF(obj, j);
/* 430 */                           iZzz11 = zzll.zzz(i7 << 3);
/* 434 */                           iZzA2 = zzll.zzA(jZzF);
/* 134 */                           iM7493p += iZzA2 + iZzz11;
                                }
                                break;
                            case 54:
/* 400 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 404 */                           long jZzF2 = zzF(obj, j);
/* 408 */                           iZzz11 = zzll.zzz(i7 << 3);
/* 412 */                           iZzA2 = zzll.zzA(jZzF2);
/* 134 */                           iM7493p += iZzA2 + iZzz11;
                                }
                                break;
                            case 55:
/* 377 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 381 */                           long jZzE = zzE(obj, j);
/* 386 */                           iZzz11 = zzll.zzz(i7 << 3);
/* 390 */                           iZzA2 = zzll.zzA(jZzE);
/* 134 */                           iM7493p += iZzA2 + iZzz11;
                                }
                                break;
                            case 56:
/* 363 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 367 */                           iM7493p = pm2.m7493p(i7 << 3, 8, iM7493p);
                                }
                                break;
                            case 57:
/* 349 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 353 */                           iM7493p = pm2.m7493p(i7 << 3, 4, iM7493p);
                                }
                                break;
                            case 58:
/* 335 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 339 */                           iM7493p = pm2.m7493p(i7 << 3, 1, iM7493p);
                                }
                                break;
                            case 59:
/* 292 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 294 */                           int i31 = i7 << 3;
/* 296 */                           Object object2 = unsafe.getObject(obj, j);
/* 302 */                           if (object2 instanceof zzlg) {
/* 306 */                               iZzx = zzll.zzz(i31);
/* 310 */                               iZzz9 = ((zzlg) object2).zzc();
/* 314 */                               iZzz10 = zzll.zzz(iZzz9);
/* 264 */                               iM7493p += iZzz10 + iZzz9 + iZzx;
                                    } else {
/* 321 */                               iZzz11 = zzll.zzz(i31);
/* 325 */                               iZzA2 = zzll.zzB((String) object2);
/* 134 */                               iM7493p += iZzA2 + iZzz11;
                                    }
                                }
                                break;
                            case 60:
/* 271 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 281 */                           iZzz4 = zzny.zzz(i7, unsafe.getObject(obj, j), zznoVar.zzp(i3));
/* 285 */                           iM7493p += iZzz4;
                                }
                                break;
                            case 61:
/* 240 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 248 */                           zzlg zzlgVar2 = (zzlg) unsafe.getObject(obj, j);
/* 250 */                           iZzx = zzll.zzz(i7 << 3);
/* 254 */                           iZzz9 = zzlgVar2.zzc();
/* 258 */                           iZzz10 = zzll.zzz(iZzz9);
/* 264 */                           iM7493p += iZzz10 + iZzz9 + iZzx;
                                }
                                break;
                            case 62:
/* 218 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 230 */                           iM7493p = pm2.m7493p(zzE(obj, j), zzll.zzz(i7 << 3), iM7493p);
                                }
                                break;
                            case 63:
/* 196 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 200 */                           long jZzE2 = zzE(obj, j);
/* 205 */                           iZzz11 = zzll.zzz(i7 << 3);
/* 209 */                           iZzA2 = zzll.zzA(jZzE2);
/* 134 */                           iM7493p += iZzA2 + iZzz11;
                                }
                                break;
                            case 64:
/* 182 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 186 */                           iM7493p = pm2.m7493p(i7 << 3, 4, iM7493p);
                                }
                                break;
                            case 65:
/* 168 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 172 */                           iM7493p = pm2.m7493p(i7 << 3, 8, iM7493p);
                                }
                                break;
                            case 66:
/* 141 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 145 */                           int iZzE = zzE(obj, j);
/* 158 */                           iM7493p = pm2.m7493p((iZzE >> 31) ^ (iZzE + iZzE), zzll.zzz(i7 << 3), iM7493p);
                                }
                                break;
                            case 67:
/* 112 */                       if (zznoVar.zzL(obj, i7, i3)) {
/* 116 */                           long jZzF3 = zzF(obj, j);
/* 124 */                           iZzz11 = zzll.zzz(i7 << 3);
/* 129 */                           iZzA2 = zzll.zzA((jZzF3 >> 63) ^ (jZzF3 + jZzF3));
/* 134 */                           iM7493p += iZzA2 + iZzz11;
                                }
                                break;
                            case 68:
/* 89 */                        if (zznoVar.zzL(obj, i7, i3)) {
/* 101 */                           iZzG = zzll.zzG(i7, (zznl) unsafe.getObject(obj, j), zznoVar.zzp(i3));
/* 105 */                           iM7493p += iZzG;
                                }
                                break;
                        }
/* 1785 */              i3 += 3;
/* 1789 */              i2 = 1048575;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0023  */
                @Override // com.google.android.gms.internal.measurement.zznw
                public final void zzf(Object obj, zzou zzouVar) throws IOException {
                    Map.Entry entry;
                    int i;
/* 1 */             zzno<T> zznoVar = this;
/* 9 */             if (zznoVar.zzh) {
/* 14 */                zzlv zzlvVar = ((zzmb) obj).zzb;
/* 22 */                if (zzlvVar.zza.isEmpty()) {
/* 36 */                    entry = null;
                        } else {
/* 32 */                    entry = (Map.Entry) zzlvVar.zzc().next();
                        }
                    } else {
/* 36 */                entry = null;
                    }
/* 37 */            int[] iArr = zznoVar.zzc;
/* 39 */            Unsafe unsafe = zzb;
/* 41 */            int i2 = 1048575;
/* 44 */            int i3 = 1048575;
/* 45 */            int i4 = 0;
/* 46 */            int i5 = 0;
/* 48 */            while (i4 < iArr.length) {
/* 50 */                int iZzx = zznoVar.zzx(i4);
/* 54 */                int iZzz = zzz(iZzx);
/* 58 */                int i6 = iArr[i4];
/* 65 */                if (iZzz <= 17) {
/* 69 */                    int i7 = iArr[i4 + 2];
/* 71 */                    int i8 = i7 & i2;
/* 73 */                    if (i8 != i3) {
/* 80 */                        i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
/* 85 */                        i3 = i8;
                            }
/* 88 */                    i = 1 << (i7 >>> 20);
                        } else {
/* 97 */                    i = 0;
                        }
/* 98 */                if (entry != null) {
/* 1215 */                  throw null;
                        }
/* 100 */               long j = iZzx & i2;
                        switch (iZzz) {
                            case 0:
/* 1191 */                      if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 1197 */                          zzouVar.zzf(i6, zzoo.zzl(obj, j));
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 1:
/* 1176 */                      if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 1182 */                          zzouVar.zze(i6, zzoo.zzj(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 2:
/* 1161 */                      if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 1167 */                          zzouVar.zzc(i6, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 3:
/* 1146 */                      if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 1152 */                          zzouVar.zzh(i6, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 4:
/* 1131 */                      if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 1137 */                          zzouVar.zzi(i6, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 5:
/* 1116 */                      if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 1122 */                          zzouVar.zzj(i6, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 6:
/* 1101 */                      if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 1107 */                          zzouVar.zzk(i6, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 7:
/* 1086 */                      if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 1092 */                          zzouVar.zzl(i6, zzoo.zzh(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 8:
/* 1070 */                      if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 1076 */                          zzP(i6, unsafe.getObject(obj, j), zzouVar);
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 9:
/* 1050 */                      if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 1060 */                          zzouVar.zzr(i6, unsafe.getObject(obj, j), zznoVar.zzp(i4));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 10:
/* 1032 */                      if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 1040 */                          zzouVar.zzn(i6, (zzlg) unsafe.getObject(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 11:
/* 1016 */                      if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 1022 */                          zzouVar.zzo(i6, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 12:
/* 1000 */                      if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 1006 */                          zzouVar.zzg(i6, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 984 */                       if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 990 */                           zzouVar.zzb(i6, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 14:
/* 968 */                       if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 974 */                           zzouVar.zzd(i6, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 952 */                       if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 958 */                           zzouVar.zzp(i6, unsafe.getInt(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 16:
/* 936 */                       if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 942 */                           zzouVar.zzq(i6, unsafe.getLong(obj, j));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 17:
/* 916 */                       if (zznoVar.zzI(obj, i4, i3, i5, i)) {
/* 926 */                           zzouVar.zzs(i6, unsafe.getObject(obj, j), zznoVar.zzp(i4));
                                } else {
                                    continue;
                                }
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 18:
/* 906 */                       zzny.zza(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 19:
/* 892 */                       zzny.zzb(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 20:
/* 878 */                       zzny.zzc(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 864 */                       zzny.zzd(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 850 */                       zzny.zzh(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 836 */                       zzny.zzf(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 24:
/* 822 */                       zzny.zzk(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 808 */                       zzny.zzn(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 776 */                       int i9 = iArr[i4];
/* 782 */                       List list = (List) unsafe.getObject(obj, j);
/* 784 */                       int i10 = zzny.zza;
/* 786 */                       if (list != null && !list.isEmpty()) {
/* 794 */                           zzouVar.zzF(i9, list);
                                }
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 734 */                       int i11 = iArr[i4];
/* 740 */                       List list2 = (List) unsafe.getObject(obj, j);
/* 742 */                       zznw zznwVarZzp = zznoVar.zzp(i4);
/* 746 */                       int i12 = zzny.zza;
/* 748 */                       if (list2 != null && !list2.isEmpty()) {
/* 761 */                           for (int i13 = 0; i13 < list2.size(); i13++) {
/* 770 */                               ((zzlm) zzouVar).zzr(i11, list2.get(i13), zznwVarZzp);
                                    }
                                }
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 711 */                       int i14 = iArr[i4];
/* 717 */                       List list3 = (List) unsafe.getObject(obj, j);
/* 719 */                       int i15 = zzny.zza;
/* 721 */                       if (list3 != null && !list3.isEmpty()) {
/* 729 */                           zzouVar.zzG(i14, list3);
                                }
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 706 */                       zzny.zzi(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 692 */                       zzny.zzm(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 678 */                       zzny.zzl(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case 32:
/* 664 */                       zzny.zzg(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 650 */                       zzny.zzj(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 636 */                       zzny.zze(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, false);
                                continue;
/* 1200 */                      i4 += 3;
/* 1202 */                      i2 = 1048575;
/* 1205 */                      zznoVar = this;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 622 */                       zzny.zza(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 609 */                       zzny.zzb(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case 37:
/* 596 */                       zzny.zzc(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case 38:
/* 583 */                       zzny.zzd(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case 39:
/* 570 */                       zzny.zzh(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 557 */                       zzny.zzf(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 544 */                       zzny.zzk(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case 42:
/* 531 */                       zzny.zzn(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case 43:
/* 518 */                       zzny.zzi(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case 44:
/* 505 */                       zzny.zzm(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case 45:
/* 492 */                       zzny.zzl(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case 46:
/* 479 */                       zzny.zzg(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case 47:
/* 466 */                       zzny.zzj(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case 48:
/* 453 */                       zzny.zze(iArr[i4], (List) unsafe.getObject(obj, j), zzouVar, true);
                                break;
                            case 49:
/* 403 */                       int i16 = iArr[i4];
/* 409 */                       List list4 = (List) unsafe.getObject(obj, j);
/* 411 */                       zznw zznwVarZzp2 = zznoVar.zzp(i4);
/* 415 */                       int i17 = zzny.zza;
/* 417 */                       if (list4 != null && !list4.isEmpty()) {
/* 430 */                           for (int i18 = 0; i18 < list4.size(); i18++) {
/* 439 */                               ((zzlm) zzouVar).zzs(i16, list4.get(i18), zznwVarZzp2);
                                    }
                                }
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 380 */                       Object object = unsafe.getObject(obj, j);
/* 384 */                       if (object != null) {
/* 398 */                           zzouVar.zzM(i6, ((zzne) zznoVar.zzq(i4)).zze(), (zznf) object);
                                }
                                break;
                            case 51:
/* 369 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 375 */                           zzouVar.zzf(i6, zzC(obj, j));
                                }
                                break;
                            case 52:
/* 354 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 360 */                           zzouVar.zze(i6, zzD(obj, j));
                                }
                                break;
                            case 53:
/* 339 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 345 */                           zzouVar.zzc(i6, zzF(obj, j));
                                }
                                break;
                            case 54:
/* 324 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 330 */                           zzouVar.zzh(i6, zzF(obj, j));
                                }
                                break;
                            case 55:
/* 309 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 315 */                           zzouVar.zzi(i6, zzE(obj, j));
                                }
                                break;
                            case 56:
/* 294 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 300 */                           zzouVar.zzj(i6, zzF(obj, j));
                                }
                                break;
                            case 57:
/* 279 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 285 */                           zzouVar.zzk(i6, zzE(obj, j));
                                }
                                break;
                            case 58:
/* 264 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 270 */                           zzouVar.zzl(i6, zzG(obj, j));
                                }
                                break;
                            case 59:
/* 249 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 255 */                           zzP(i6, unsafe.getObject(obj, j), zzouVar);
                                }
                                break;
                            case 60:
/* 230 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 240 */                           zzouVar.zzr(i6, unsafe.getObject(obj, j), zznoVar.zzp(i4));
                                }
                                break;
                            case 61:
/* 214 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 222 */                           zzouVar.zzn(i6, (zzlg) unsafe.getObject(obj, j));
                                }
                                break;
                            case 62:
/* 200 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 206 */                           zzouVar.zzo(i6, zzE(obj, j));
                                }
                                break;
                            case 63:
/* 186 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 192 */                           zzouVar.zzg(i6, zzE(obj, j));
                                }
                                break;
                            case 64:
/* 172 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 178 */                           zzouVar.zzb(i6, zzE(obj, j));
                                }
                                break;
                            case 65:
/* 158 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 164 */                           zzouVar.zzd(i6, zzF(obj, j));
                                }
                                break;
                            case 66:
/* 144 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 150 */                           zzouVar.zzp(i6, zzE(obj, j));
                                }
                                break;
                            case 67:
/* 130 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 136 */                           zzouVar.zzq(i6, zzF(obj, j));
                                }
                                break;
                            case 68:
/* 112 */                       if (zznoVar.zzL(obj, i6, i4)) {
/* 122 */                           zzouVar.zzs(i6, unsafe.getObject(obj, j), zznoVar.zzp(i4));
                                }
                                break;
                        }
/* 1200 */              i4 += 3;
/* 1202 */              i2 = 1048575;
/* 1205 */              zznoVar = this;
                    }
/* 1218 */          if (entry != null) {
/* 1235 */              throw null;
                    }
/* 1225 */          ((zzme) obj).zzc.zzg(zzouVar);
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40001. Try increasing type updates limit count.
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                    */
                public final int zzh(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, com.google.android.gms.internal.measurement.zzkv r45) throws java.io.IOException {
                    /*
                        Method dump skipped, instruction units count: 4000
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzno.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzkv):int");
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkv zzkvVar) throws IOException {
/* 8 */             zzh(obj, bArr, i, i2, 0, zzkvVar);
                }

                /* JADX WARN: Code duplicated, block: B:26:0x006f  */
                /* JADX WARN: Code duplicated, block: B:28:0x0075  */
                /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
                @Override // com.google.android.gms.internal.measurement.zznw
                public final void zzj(Object obj) {
/* 5 */             if (zzA(obj)) {
/* 12 */                if (obj instanceof zzme) {
/* 15 */                    zzme zzmeVar = (zzme) obj;
/* 20 */                    zzmeVar.zzcm(AbstractC0208c9.API_PRIORITY_OTHER);
/* 23 */                    zzmeVar.zza = 0;
/* 25 */                    zzmeVar.zzcg();
                        }
/* 28 */                int[] iArr = this.zzc;
/* 31 */                for (int i = 0; i < iArr.length; i += 3) {
/* 33 */                    int iZzx = zzx(i);
/* 40 */                    int i2 = 1048575 & iZzx;
/* 41 */                    int iZzz = zzz(iZzx);
                            long j = i2;
/* 48 */                    if (iZzz != 9) {
/* 52 */                        if (iZzz != 60 && iZzz != 68) {
                                    switch (iZzz) {
                                        case 17:
/* 116 */                                   if (zzJ(obj, i)) {
/* 128 */                                       zzp(i).zzj(zzb.getObject(obj, j));
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
/* 86 */                                    ((zzmn) zzoo.zzn(obj, j)).zzb();
                                            break;
                                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 62 */                                    Unsafe unsafe = zzb;
/* 64 */                                    Object object = unsafe.getObject(obj, j);
/* 68 */                                    if (object != null) {
/* 73 */                                        ((zznf) object).zzd();
/* 76 */                                        unsafe.putObject(obj, j, object);
                                            }
                                            break;
                                    }
                                } else if (zzL(obj, iArr[i], i)) {
/* 108 */                           zzp(i).zzj(zzb.getObject(obj, j));
                                }
                            } else if (zzJ(obj, i)) {
/* 128 */                       zzp(i).zzj(zzb.getObject(obj, j));
                            }
                        }
/* 136 */               this.zzl.zzb(obj);
/* 141 */               if (this.zzh) {
/* 145 */                   this.zzm.zza(obj);
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
                /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
                /* JADX WARN: Code duplicated, block: B:55:0x00db  */
                /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[LOOP:2: B:53:0x00d5->B:58:0x00e6, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:82:0x00fc A[SYNTHETIC] */
                @Override // com.google.android.gms.internal.measurement.zznw
                public final boolean zzk(Object obj) {
                    int i;
                    int i2;
                    List list;
                    zznw zznwVarZzp;
                    int i3;
/* 5 */             int i4 = 0;
/* 6 */             int i5 = 0;
/* 7 */             int i6 = 1048575;
/* 11 */            while (i5 < this.zzj) {
/* 13 */                int[] iArr = this.zzi;
/* 15 */                int[] iArr2 = this.zzc;
/* 17 */                int i7 = iArr[i5];
/* 19 */                int i8 = iArr2[i7];
/* 21 */                int iZzx = zzx(i7);
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
/* 56 */                if ((268435456 & iZzx) != 0 && !zzI(obj, i7, i, i2, i11)) {
/* 1 */                     return false;
                        }
/* 68 */                int iZzz = zzz(iZzx);
/* 74 */                if (iZzz == 9 || iZzz == 17) {
/* 240 */                   if (zzI(obj, i7, i, i2, i11) && !zzw(obj, iZzx, zzp(i7))) {
/* 1 */                         return false;
                            }
                        } else if (iZzz == 27) {
/* 201 */                   list = (List) zzoo.zzn(obj, iZzx & 1048575);
/* 207 */                   if (list.isEmpty()) {
                                continue;
                            } else {
/* 209 */                       zznwVarZzp = zzp(i7);
/* 218 */                       for (i3 = 0; i3 < list.size(); i3++) {
/* 228 */                           if (!zznwVarZzp.zzk(list.get(i3))) {
/* 1 */                                 return false;
                                    }
                                }
                            }
                        } else if (iZzz == 60 || iZzz == 68) {
/* 181 */                   if (zzL(obj, i8, i7) && !zzw(obj, iZzx, zzp(i7))) {
/* 1 */                         return false;
                            }
                        } else if (iZzz == 49) {
/* 201 */                   list = (List) zzoo.zzn(obj, iZzx & 1048575);
/* 207 */                   if (list.isEmpty()) {
/* 209 */                       zznwVarZzp = zzp(i7);
/* 218 */                       while (i3 < list.size()) {
/* 228 */                           if (!zznwVarZzp.zzk(list.get(i3))) {
/* 1 */                                 return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (iZzz != 50) {
                            continue;
                        } else {
/* 109 */                   zznf zznfVar = (zznf) zzoo.zzn(obj, iZzx & 1048575);
/* 115 */                   if (!zznfVar.isEmpty() && ((zzne) zzq(i7)).zze().zzc.zza() == zzot.MESSAGE) {
/* 145 */                       zznw zznwVarZzb = null;
/* 150 */                       for (Object obj2 : zznfVar.values()) {
/* 156 */                           if (zznwVarZzb == null) {
/* 166 */                               zznwVarZzb = zznt.zza().zzb(obj2.getClass());
                                    }
/* 174 */                           if (!zznwVarZzb.zzk(obj2)) {
/* 1 */                                 return false;
                                    }
                                }
                            }
                        }
/* 253 */               i5++;
/* 255 */               i6 = i;
/* 256 */               i4 = i2;
                    }
                    return !this.zzh || ((zzmb) obj).zzb.zze();
                }
            }
