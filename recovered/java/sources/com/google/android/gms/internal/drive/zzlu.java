            package com.google.android.gms.internal.drive;

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
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            import p000.pm2;
            import sun.misc.Unsafe;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 67 */    final class zzlu<T> implements zzmf<T> {
                private static final int[] zzub = new int[0];
                private static final Unsafe zzuc = zznd.zzff();
                private final int[] zzud;
                private final Object[] zzue;
                private final int zzuf;
                private final int zzug;
                private final zzlq zzuh;
                private final boolean zzui;
                private final boolean zzuj;
                private final boolean zzuk;
                private final boolean zzul;
                private final int[] zzum;
                private final int zzun;
                private final int zzuo;
                private final zzly zzup;
                private final zzla zzuq;
                private final zzmx<?, ?> zzur;
                private final zzjy<?> zzus;
                private final zzll zzut;

                private zzlu(int[] iArr, Object[] objArr, int i, int i2, zzlq zzlqVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzly zzlyVar, zzla zzlaVar, zzmx<?, ?> zzmxVar, zzjy<?> zzjyVar, zzll zzllVar) {
/* 4 */             this.zzud = iArr;
/* 6 */             this.zzue = objArr;
/* 8 */             this.zzuf = i;
/* 10 */            this.zzug = i2;
/* 14 */            this.zzuj = zzlqVar instanceof zzkk;
/* 16 */            this.zzuk = z;
/* 30 */            this.zzui = zzjyVar != null && zzjyVar.zze(zzlqVar);
/* 32 */            this.zzul = false;
/* 34 */            this.zzum = iArr2;
/* 36 */            this.zzun = i3;
/* 38 */            this.zzuo = i4;
/* 40 */            this.zzup = zzlyVar;
/* 42 */            this.zzuq = zzlaVar;
/* 44 */            this.zzur = zzmxVar;
/* 46 */            this.zzus = zzjyVar;
/* 48 */            this.zzuh = zzlqVar;
/* 50 */            this.zzut = zzllVar;
                }

                private final zzmf zzap(int i) {
/* 3 */             int i2 = (i / 3) << 1;
/* 9 */             zzmf zzmfVar = (zzmf) this.zzue[i2];
/* 11 */            if (zzmfVar != null) {
/* 13 */                return zzmfVar;
                    }
/* 26 */            zzmf<T> zzmfVarZzf = zzmd.zzej().zzf((Class) this.zzue[i2 + 1]);
/* 32 */            this.zzue[i2] = zzmfVarZzf;
/* 34 */            return zzmfVarZzf;
                }

                private final Object zzaq(int i) {
/* 7 */             return this.zzue[(i / 3) << 1];
                }

                private final zzko zzar(int i) {
/* 11 */            return (zzko) this.zzue[((i / 3) << 1) + 1];
                }

                private final int zzas(int i) {
/* 5 */             return this.zzud[i + 1];
                }

                private final int zzat(int i) {
/* 5 */             return this.zzud[i + 2];
                }

                private final int zzau(int i) {
/* 3 */             if (i < this.zzuf || i > this.zzug) {
/* 15 */                return -1;
                    }
/* 10 */            return zzq(i, 0);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:7:0x0023  */
                private final void zzb(T t, zzns zznsVar) throws IOException {
                    Iterator it;
                    Map.Entry<?, ?> entry;
                    boolean z;
                    int i;
                    boolean z2;
/* 9 */             if (this.zzui) {
/* 13 */                zzkb<T> zzkbVarZzb = this.zzus.zzb(t);
/* 23 */                if (zzkbVarZzb.zzos.isEmpty()) {
/* 36 */                    it = null;
/* 37 */                    entry = null;
                        } else {
/* 25 */                    it = zzkbVarZzb.iterator();
/* 33 */                    entry = (Map.Entry) it.next();
                        }
                    } else {
/* 36 */                it = null;
/* 37 */                entry = null;
                    }
/* 40 */            int length = this.zzud.length;
/* 41 */            Unsafe unsafe = zzuc;
/* 43 */            int i2 = -1;
/* 45 */            int i3 = 0;
/* 46 */            for (int i4 = 0; i4 < length; i4 += 3) {
/* 48 */                int iZzas = zzas(i4);
/* 52 */                int[] iArr = this.zzud;
/* 54 */                int i5 = iArr[i4];
/* 59 */                int i6 = (267386880 & iZzas) >>> 20;
/* 66 */                if (this.zzuk || i6 > 17) {
/* 93 */                    z = true;
/* 95 */                    i = 0;
                        } else {
/* 74 */                    int i7 = iArr[i4 + 2];
/* 76 */                    int i8 = i7 & 1048575;
/* 78 */                    z = true;
/* 80 */                    if (i8 != i2) {
/* 83 */                        i3 = unsafe.getInt(t, i8);
/* 87 */                        i2 = i8;
                            }
/* 90 */                    i = 1 << (i7 >>> 20);
                        }
/* 96 */                while (entry != null && this.zzus.zza(entry) <= i5) {
/* 108 */                   this.zzus.zza(zznsVar, entry);
/* 124 */                   entry = it.hasNext() ? (Map.Entry) it.next() : null;
                        }
/* 126 */               long j = iZzas & 1048575;
                        switch (i6) {
                            case 0:
/* 1167 */                      if ((i & i3) != 0) {
/* 1173 */                          zznsVar.zza(i5, zznd.zzn(t, j));
                                }
                                break;
                            case 1:
/* 1155 */                      if ((i & i3) != 0) {
/* 1161 */                          zznsVar.zza(i5, zznd.zzm(t, j));
                                }
                                break;
                            case 2:
/* 1143 */                      if ((i & i3) != 0) {
/* 1149 */                          zznsVar.zzi(i5, unsafe.getLong(t, j));
                                }
                                break;
                            case 3:
/* 1131 */                      if ((i & i3) != 0) {
/* 1137 */                          zznsVar.zza(i5, unsafe.getLong(t, j));
                                }
                                break;
                            case 4:
/* 1119 */                      if ((i & i3) != 0) {
/* 1125 */                          zznsVar.zzc(i5, unsafe.getInt(t, j));
                                }
                                break;
                            case 5:
/* 1107 */                      if ((i & i3) != 0) {
/* 1113 */                          zznsVar.zzc(i5, unsafe.getLong(t, j));
                                }
                                break;
                            case 6:
/* 1095 */                      if ((i & i3) != 0) {
/* 1101 */                          zznsVar.zzf(i5, unsafe.getInt(t, j));
                                }
                                break;
                            case 7:
/* 1083 */                      if ((i & i3) != 0) {
/* 1089 */                          zznsVar.zzb(i5, zznd.zzl(t, j));
                                }
                                break;
                            case 8:
/* 1071 */                      if ((i & i3) != 0) {
/* 1077 */                          zza(i5, unsafe.getObject(t, j), zznsVar);
                                }
                                break;
                            case 9:
/* 1054 */                      if ((i & i3) != 0) {
/* 1064 */                          zznsVar.zza(i5, unsafe.getObject(t, j), zzap(i4));
                                }
                                break;
                            case 10:
/* 1039 */                      if ((i & i3) != 0) {
/* 1047 */                          zznsVar.zza(i5, (zzjc) unsafe.getObject(t, j));
                                }
                                break;
                            case 11:
/* 1026 */                      if ((i & i3) != 0) {
/* 1032 */                          zznsVar.zzd(i5, unsafe.getInt(t, j));
                                }
                                break;
                            case 12:
/* 1013 */                      if ((i & i3) != 0) {
/* 1019 */                          zznsVar.zzn(i5, unsafe.getInt(t, j));
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1000 */                      if ((i & i3) != 0) {
/* 1006 */                          zznsVar.zzm(i5, unsafe.getInt(t, j));
                                }
                                break;
                            case 14:
/* 987 */                       if ((i & i3) != 0) {
/* 993 */                           zznsVar.zzj(i5, unsafe.getLong(t, j));
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 974 */                       if ((i & i3) != 0) {
/* 980 */                           zznsVar.zze(i5, unsafe.getInt(t, j));
                                }
                                break;
                            case 16:
/* 961 */                       if ((i & i3) != 0) {
/* 967 */                           zznsVar.zzb(i5, unsafe.getLong(t, j));
                                }
                                break;
                            case 17:
/* 944 */                       if ((i & i3) != 0) {
/* 954 */                           zznsVar.zzb(i5, unsafe.getObject(t, j), zzap(i4));
                                }
                                break;
                            case 18:
/* 937 */                       zzmh.zza(this.zzud[i4], (List<Double>) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case 19:
/* 921 */                       zzmh.zzb(this.zzud[i4], (List<Float>) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case 20:
/* 905 */                       zzmh.zzc(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 889 */                       zzmh.zzd(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 873 */                       zzmh.zzh(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 857 */                       zzmh.zzf(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case 24:
/* 841 */                       zzmh.zzk(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 825 */                       zzmh.zzn(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 809 */                       zzmh.zza(this.zzud[i4], (List<String>) unsafe.getObject(t, j), zznsVar);
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 794 */                       zzmh.zza(this.zzud[i4], (List<?>) unsafe.getObject(t, j), zznsVar, zzap(i4));
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 775 */                       zzmh.zzb(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar);
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 750 */                       z2 = false;
/* 761 */                       zzmh.zzi(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 735 */                       z2 = false;
/* 746 */                       zzmh.zzm(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 720 */                       z2 = false;
/* 731 */                       zzmh.zzl(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case 32:
/* 705 */                       z2 = false;
/* 716 */                       zzmh.zzg(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 690 */                       z2 = false;
/* 701 */                       zzmh.zzj(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 683 */                       z2 = false;
/* 684 */                       zzmh.zze(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 668 */                       zzmh.zza(this.zzud[i4], (List<Double>) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 651 */                       zzmh.zzb(this.zzud[i4], (List<Float>) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case 37:
/* 634 */                       zzmh.zzc(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case 38:
/* 617 */                       zzmh.zzd(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case 39:
/* 600 */                       zzmh.zzh(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 583 */                       zzmh.zzf(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 566 */                       zzmh.zzk(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case 42:
/* 549 */                       zzmh.zzn(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case 43:
/* 532 */                       zzmh.zzi(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case 44:
/* 515 */                       zzmh.zzm(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case 45:
/* 498 */                       zzmh.zzl(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case 46:
/* 481 */                       zzmh.zzg(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case 47:
/* 464 */                       zzmh.zzj(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case 48:
/* 447 */                       zzmh.zze(this.zzud[i4], (List) unsafe.getObject(t, j), zznsVar, z);
                                break;
                            case 49:
/* 430 */                       zzmh.zzb(this.zzud[i4], (List<?>) unsafe.getObject(t, j), zznsVar, zzap(i4));
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 411 */                       zza(zznsVar, i5, unsafe.getObject(t, j), i4);
                                break;
                            case 51:
/* 396 */                       if (zza(t, i5, i4)) {
/* 402 */                           zznsVar.zza(i5, zze(t, j));
                                }
                                break;
                            case 52:
/* 381 */                       if (zza(t, i5, i4)) {
/* 387 */                           zznsVar.zza(i5, zzf(t, j));
                                }
                                break;
                            case 53:
/* 366 */                       if (zza(t, i5, i4)) {
/* 372 */                           zznsVar.zzi(i5, zzh(t, j));
                                }
                                break;
                            case 54:
/* 351 */                       if (zza(t, i5, i4)) {
/* 357 */                           zznsVar.zza(i5, zzh(t, j));
                                }
                                break;
                            case 55:
/* 336 */                       if (zza(t, i5, i4)) {
/* 342 */                           zznsVar.zzc(i5, zzg(t, j));
                                }
                                break;
                            case 56:
/* 321 */                       if (zza(t, i5, i4)) {
/* 327 */                           zznsVar.zzc(i5, zzh(t, j));
                                }
                                break;
                            case 57:
/* 306 */                       if (zza(t, i5, i4)) {
/* 312 */                           zznsVar.zzf(i5, zzg(t, j));
                                }
                                break;
                            case 58:
/* 291 */                       if (zza(t, i5, i4)) {
/* 297 */                           zznsVar.zzb(i5, zzi(t, j));
                                }
                                break;
                            case 59:
/* 276 */                       if (zza(t, i5, i4)) {
/* 282 */                           zza(i5, unsafe.getObject(t, j), zznsVar);
                                }
                                break;
                            case 60:
/* 257 */                       if (zza(t, i5, i4)) {
/* 267 */                           zznsVar.zza(i5, unsafe.getObject(t, j), zzap(i4));
                                }
                                break;
                            case 61:
/* 241 */                       if (zza(t, i5, i4)) {
/* 249 */                           zznsVar.zza(i5, (zzjc) unsafe.getObject(t, j));
                                }
                                break;
                            case 62:
/* 227 */                       if (zza(t, i5, i4)) {
/* 233 */                           zznsVar.zzd(i5, zzg(t, j));
                                }
                                break;
                            case 63:
/* 213 */                       if (zza(t, i5, i4)) {
/* 219 */                           zznsVar.zzn(i5, zzg(t, j));
                                }
                                break;
                            case 64:
/* 199 */                       if (zza(t, i5, i4)) {
/* 205 */                           zznsVar.zzm(i5, zzg(t, j));
                                }
                                break;
                            case 65:
/* 185 */                       if (zza(t, i5, i4)) {
/* 191 */                           zznsVar.zzj(i5, zzh(t, j));
                                }
                                break;
                            case 66:
/* 171 */                       if (zza(t, i5, i4)) {
/* 177 */                           zznsVar.zze(i5, zzg(t, j));
                                }
                                break;
                            case 67:
/* 157 */                       if (zza(t, i5, i4)) {
/* 163 */                           zznsVar.zzb(i5, zzh(t, j));
                                }
                                break;
                            case 68:
/* 139 */                       if (zza(t, i5, i4)) {
/* 149 */                           zznsVar.zzb(i5, unsafe.getObject(t, j), zzap(i4));
                                }
                                break;
                            default:
                                break;
                        }
                    }
/* 1180 */          while (entry != null) {
/* 1184 */              this.zzus.zza(zznsVar, entry);
/* 1201 */              entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
/* 1205 */          zza(this.zzur, t, zznsVar);
                }

                private static <T> double zze(T t, long j) {
/* 7 */             return ((Double) zznd.zzo(t, j)).doubleValue();
                }

                private static <T> float zzf(T t, long j) {
/* 7 */             return ((Float) zznd.zzo(t, j)).floatValue();
                }

                private static <T> int zzg(T t, long j) {
/* 7 */             return ((Integer) zznd.zzo(t, j)).intValue();
                }

                private static <T> long zzh(T t, long j) {
/* 7 */             return ((Long) zznd.zzo(t, j)).longValue();
                }

                private static <T> boolean zzi(T t, long j) {
/* 7 */             return ((Boolean) zznd.zzo(t, j)).booleanValue();
                }

                private static zzmy zzo(Object obj) {
/* 1 */             zzkk zzkkVar = (zzkk) obj;
/* 3 */             zzmy zzmyVar = zzkkVar.zzrq;
/* 9 */             if (zzmyVar != zzmy.zzfa()) {
/* 17 */                return zzmyVar;
                    }
/* 11 */            zzmy zzmyVarZzfb = zzmy.zzfb();
/* 15 */            zzkkVar.zzrq = zzmyVarZzfb;
/* 17 */            return zzmyVarZzfb;
                }

                private final int zzq(int i, int i2) {
/* 6 */             int length = (this.zzud.length / 3) - 1;
/* 8 */             while (i2 <= length) {
/* 12 */                int i3 = (length + i2) >>> 1;
/* 14 */                int i4 = i3 * 3;
/* 18 */                int i5 = this.zzud[i4];
/* 20 */                if (i == i5) {
/* 22 */                    return i4;
                        }
/* 23 */                if (i < i5) {
/* 25 */                    length = i3 - 1;
                        } else {
/* 28 */                    i2 = i3 + 1;
                        }
                    }
/* 31 */            return -1;
                }

                /* JADX WARN: Code duplicated, block: B:12:0x003a  */
                @Override // com.google.android.gms.internal.drive.zzmf
                public final boolean equals(T t, T t2) {
/* 3 */             int length = this.zzud.length;
/* 5 */             int i = 0;
                    while (true) {
/* 6 */                 boolean zZzd = true;
/* 7 */                 if (i >= length) {
/* 476 */                   if (!this.zzur.zzr(t).equals(this.zzur.zzr(t2))) {
/* 4 */                         return false;
                            }
/* 481 */                   if (this.zzui) {
/* 495 */                       return this.zzus.zzb(t).equals(this.zzus.zzb(t2));
                            }
/* 6 */                     return true;
                        }
/* 9 */                 int iZzas = zzas(i);
/* 16 */                long j = iZzas & 1048575;
                        switch ((iZzas & 267386880) >>> 20) {
                            case 0:
/* 429 */                       if (!zzc(t, t2, i) || Double.doubleToLongBits(zznd.zzn(t, j)) != Double.doubleToLongBits(zznd.zzn(t2, j))) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 1:
/* 403 */                       if (!zzc(t, t2, i) || Float.floatToIntBits(zznd.zzm(t, j)) != Float.floatToIntBits(zznd.zzm(t2, j))) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 2:
/* 383 */                       if (!zzc(t, t2, i) || zznd.zzk(t, j) != zznd.zzk(t2, j)) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 3:
/* 363 */                       if (!zzc(t, t2, i) || zznd.zzk(t, j) != zznd.zzk(t2, j)) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 4:
/* 345 */                       if (!zzc(t, t2, i) || zznd.zzj(t, j) != zznd.zzj(t2, j)) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 5:
/* 325 */                       if (!zzc(t, t2, i) || zznd.zzk(t, j) != zznd.zzk(t2, j)) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 6:
/* 307 */                       if (!zzc(t, t2, i) || zznd.zzj(t, j) != zznd.zzj(t2, j)) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 7:
/* 289 */                       if (!zzc(t, t2, i) || zznd.zzl(t, j) != zznd.zzl(t2, j)) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 8:
/* 267 */                       if (!zzc(t, t2, i) || !zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j))) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 9:
/* 245 */                       if (!zzc(t, t2, i) || !zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j))) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 10:
/* 223 */                       if (!zzc(t, t2, i) || !zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j))) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 11:
/* 205 */                       if (!zzc(t, t2, i) || zznd.zzj(t, j) != zznd.zzj(t2, j)) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 12:
/* 187 */                       if (!zzc(t, t2, i) || zznd.zzj(t, j) != zznd.zzj(t2, j)) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 170 */                       if (!zzc(t, t2, i) || zznd.zzj(t, j) != zznd.zzj(t2, j)) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 14:
/* 151 */                       if (!zzc(t, t2, i) || zznd.zzk(t, j) != zznd.zzk(t2, j)) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 134 */                       if (!zzc(t, t2, i) || zznd.zzj(t, j) != zznd.zzj(t2, j)) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 16:
/* 115 */                       if (!zzc(t, t2, i) || zznd.zzk(t, j) != zznd.zzk(t2, j)) {
/* 59 */                            zZzd = false;
                                }
                                break;
                            case 17:
/* 94 */                        if (!zzc(t, t2, i) || !zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j))) {
/* 59 */                            zZzd = false;
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
/* 84 */                        zZzd = zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j));
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 70 */                        zZzd = zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j));
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
/* 33 */                        long jZzat = zzat(i) & 1048575;
/* 43 */                        if (zznd.zzj(t, jZzat) != zznd.zzj(t2, jZzat) || !zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j))) {
/* 59 */                            zZzd = false;
                                }
                                break;
                        }
/* 453 */               if (!zZzd) {
/* 4 */                     return false;
                        }
/* 456 */               i += 3;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzmf
                public final int hashCode(T t) {
                    int i;
                    int iZzu;
                    int i2;
                    int iZzj;
/* 3 */             int length = this.zzud.length;
/* 5 */             int i3 = 0;
/* 6 */             for (int i4 = 0; i4 < length; i4 += 3) {
/* 8 */                 int iZzas = zzas(i4);
/* 14 */                int i5 = this.zzud[i4];
/* 19 */                long j = 1048575 & iZzas;
/* 26 */                int iHashCode = 37;
                        switch ((iZzas & 267386880) >>> 20) {
                            case 0:
/* 543 */                       i = i3 * 53;
/* 553 */                       iZzu = zzkm.zzu(Double.doubleToLongBits(zznd.zzn(t, j)));
/* 49 */                        i3 = iZzu + i;
                                break;
                            case 1:
/* 531 */                       i = i3 * 53;
/* 537 */                       iZzu = Float.floatToIntBits(zznd.zzm(t, j));
/* 49 */                        i3 = iZzu + i;
                                break;
                            case 2:
/* 519 */                       i = i3 * 53;
/* 525 */                       iZzu = zzkm.zzu(zznd.zzk(t, j));
/* 49 */                        i3 = iZzu + i;
                                break;
                            case 3:
/* 507 */                       i = i3 * 53;
/* 513 */                       iZzu = zzkm.zzu(zznd.zzk(t, j));
/* 49 */                        i3 = iZzu + i;
                                break;
                            case 4:
/* 499 */                       i2 = i3 * 53;
/* 501 */                       iZzj = zznd.zzj(t, j);
/* 82 */                        i3 = i2 + iZzj;
                                break;
                            case 5:
/* 487 */                       i = i3 * 53;
/* 493 */                       iZzu = zzkm.zzu(zznd.zzk(t, j));
/* 49 */                        i3 = iZzu + i;
                                break;
                            case 6:
/* 479 */                       i2 = i3 * 53;
/* 481 */                       iZzj = zznd.zzj(t, j);
/* 82 */                        i3 = i2 + iZzj;
                                break;
                            case 7:
/* 467 */                       i = i3 * 53;
/* 473 */                       iZzu = zzkm.zze(zznd.zzl(t, j));
/* 49 */                        i3 = iZzu + i;
                                break;
                            case 8:
/* 453 */                       i = i3 * 53;
/* 461 */                       iZzu = ((String) zznd.zzo(t, j)).hashCode();
/* 49 */                        i3 = iZzu + i;
                                break;
                            case 9:
/* 442 */                       Object objZzo = zznd.zzo(t, j);
/* 446 */                       if (objZzo != null) {
/* 448 */                           iHashCode = objZzo.hashCode();
                                }
/* 371 */                       i3 = (i3 * 53) + iHashCode;
                                break;
                            case 10:
/* 430 */                       i = i3 * 53;
/* 436 */                       iZzu = zznd.zzo(t, j).hashCode();
/* 49 */                        i3 = iZzu + i;
                                break;
                            case 11:
/* 422 */                       i2 = i3 * 53;
/* 424 */                       iZzj = zznd.zzj(t, j);
/* 82 */                        i3 = i2 + iZzj;
                                break;
                            case 12:
/* 414 */                       i2 = i3 * 53;
/* 416 */                       iZzj = zznd.zzj(t, j);
/* 82 */                        i3 = i2 + iZzj;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 406 */                       i2 = i3 * 53;
/* 408 */                       iZzj = zznd.zzj(t, j);
/* 82 */                        i3 = i2 + iZzj;
                                break;
                            case 14:
/* 394 */                       i = i3 * 53;
/* 400 */                       iZzu = zzkm.zzu(zznd.zzk(t, j));
/* 49 */                        i3 = iZzu + i;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 386 */                       i2 = i3 * 53;
/* 388 */                       iZzj = zznd.zzj(t, j);
/* 82 */                        i3 = i2 + iZzj;
                                break;
                            case 16:
/* 374 */                       i = i3 * 53;
/* 380 */                       iZzu = zzkm.zzu(zznd.zzk(t, j));
/* 49 */                        i3 = iZzu + i;
                                break;
                            case 17:
/* 359 */                       Object objZzo2 = zznd.zzo(t, j);
/* 363 */                       if (objZzo2 != null) {
/* 365 */                           iHashCode = objZzo2.hashCode();
                                }
/* 371 */                       i3 = (i3 * 53) + iHashCode;
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
/* 347 */                       i = i3 * 53;
/* 353 */                       iZzu = zznd.zzo(t, j).hashCode();
/* 49 */                        i3 = iZzu + i;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 335 */                       i = i3 * 53;
/* 341 */                       iZzu = zznd.zzo(t, j).hashCode();
/* 49 */                        i3 = iZzu + i;
                                break;
                            case 51:
/* 317 */                       if (zza(t, i5, i4)) {
/* 319 */                           i = i3 * 53;
/* 329 */                           iZzu = zzkm.zzu(Double.doubleToLongBits(zze(t, j)));
/* 49 */                            i3 = iZzu + i;
                                }
                                break;
                            case 52:
/* 299 */                       if (zza(t, i5, i4)) {
/* 301 */                           i = i3 * 53;
/* 307 */                           iZzu = Float.floatToIntBits(zzf(t, j));
/* 49 */                            i3 = iZzu + i;
                                }
                                break;
                            case 53:
/* 281 */                       if (zza(t, i5, i4)) {
/* 283 */                           i = i3 * 53;
/* 289 */                           iZzu = zzkm.zzu(zzh(t, j));
/* 49 */                            i3 = iZzu + i;
                                }
                                break;
                            case 54:
/* 263 */                       if (zza(t, i5, i4)) {
/* 265 */                           i = i3 * 53;
/* 271 */                           iZzu = zzkm.zzu(zzh(t, j));
/* 49 */                            i3 = iZzu + i;
                                }
                                break;
                            case 55:
/* 249 */                       if (zza(t, i5, i4)) {
/* 251 */                           i2 = i3 * 53;
/* 253 */                           iZzj = zzg(t, j);
/* 82 */                            i3 = i2 + iZzj;
                                }
                                break;
                            case 56:
/* 231 */                       if (zza(t, i5, i4)) {
/* 233 */                           i = i3 * 53;
/* 239 */                           iZzu = zzkm.zzu(zzh(t, j));
/* 49 */                            i3 = iZzu + i;
                                }
                                break;
                            case 57:
/* 217 */                       if (zza(t, i5, i4)) {
/* 219 */                           i2 = i3 * 53;
/* 221 */                           iZzj = zzg(t, j);
/* 82 */                            i3 = i2 + iZzj;
                                }
                                break;
                            case 58:
/* 199 */                       if (zza(t, i5, i4)) {
/* 201 */                           i = i3 * 53;
/* 207 */                           iZzu = zzkm.zze(zzi(t, j));
/* 49 */                            i3 = iZzu + i;
                                }
                                break;
                            case 59:
/* 179 */                       if (zza(t, i5, i4)) {
/* 181 */                           i = i3 * 53;
/* 189 */                           iZzu = ((String) zznd.zzo(t, j)).hashCode();
/* 49 */                            i3 = iZzu + i;
                                }
                                break;
                            case 60:
/* 162 */                       if (zza(t, i5, i4)) {
/* 168 */                           i = i3 * 53;
/* 170 */                           iZzu = zznd.zzo(t, j).hashCode();
/* 49 */                            i3 = iZzu + i;
                                }
                                break;
                            case 61:
/* 145 */                       if (zza(t, i5, i4)) {
/* 147 */                           i = i3 * 53;
/* 153 */                           iZzu = zznd.zzo(t, j).hashCode();
/* 49 */                            i3 = iZzu + i;
                                }
                                break;
                            case 62:
/* 132 */                       if (zza(t, i5, i4)) {
/* 134 */                           i2 = i3 * 53;
/* 136 */                           iZzj = zzg(t, j);
/* 82 */                            i3 = i2 + iZzj;
                                }
                                break;
                            case 63:
/* 119 */                       if (zza(t, i5, i4)) {
/* 121 */                           i2 = i3 * 53;
/* 123 */                           iZzj = zzg(t, j);
/* 82 */                            i3 = i2 + iZzj;
                                }
                                break;
                            case 64:
/* 106 */                       if (zza(t, i5, i4)) {
/* 108 */                           i2 = i3 * 53;
/* 110 */                           iZzj = zzg(t, j);
/* 82 */                            i3 = i2 + iZzj;
                                }
                                break;
                            case 65:
/* 89 */                        if (zza(t, i5, i4)) {
/* 91 */                            i = i3 * 53;
/* 97 */                            iZzu = zzkm.zzu(zzh(t, j));
/* 49 */                            i3 = iZzu + i;
                                }
                                break;
                            case 66:
/* 74 */                        if (zza(t, i5, i4)) {
/* 76 */                            i2 = i3 * 53;
/* 78 */                            iZzj = zzg(t, j);
/* 82 */                            i3 = i2 + iZzj;
                                }
                                break;
                            case 67:
/* 57 */                        if (zza(t, i5, i4)) {
/* 59 */                            i = i3 * 53;
/* 65 */                            iZzu = zzkm.zzu(zzh(t, j));
/* 49 */                            i3 = iZzu + i;
                                }
                                break;
                            case 68:
/* 37 */                        if (zza(t, i5, i4)) {
/* 43 */                            i = i3 * 53;
/* 45 */                            iZzu = zznd.zzo(t, j).hashCode();
/* 49 */                            i3 = iZzu + i;
                                }
                                break;
                        }
                    }
/* 575 */           int iHashCode2 = this.zzur.zzr(t).hashCode() + (i3 * 53);
                    return this.zzui ? (iHashCode2 * 53) + this.zzus.zzb(t).hashCode() : iHashCode2;
                }

                @Override // com.google.android.gms.internal.drive.zzmf
                public final T newInstance() {
/* 5 */             return (T) this.zzup.newInstance(this.zzuh);
                }

                /* JADX WARN: Code duplicated, block: B:178:0x054a  */
                /* JADX WARN: Code duplicated, block: B:9:0x0032  */
                @Override // com.google.android.gms.internal.drive.zzmf
                public final void zza(T t, zzns zznsVar) throws IOException {
                    Iterator it;
                    Map.Entry<?, ?> entry;
                    Iterator itDescendingIterator;
                    Map.Entry<?, ?> entry2;
/* 15 */            if (zznsVar.zzcd() == zzkk.zze.zzsj) {
/* 19 */                zza(this.zzur, t, zznsVar);
/* 24 */                if (this.zzui) {
/* 28 */                    zzkb<T> zzkbVarZzb = this.zzus.zzb(t);
/* 38 */                    if (zzkbVarZzb.zzos.isEmpty()) {
/* 51 */                        itDescendingIterator = null;
/* 52 */                        entry2 = null;
                            } else {
/* 40 */                        itDescendingIterator = zzkbVarZzb.descendingIterator();
/* 48 */                        entry2 = (Map.Entry) itDescendingIterator.next();
                            }
                        } else {
/* 51 */                    itDescendingIterator = null;
/* 52 */                    entry2 = null;
                        }
/* 58 */                for (int length = this.zzud.length - 3; length >= 0; length -= 3) {
/* 60 */                    int iZzas = zzas(length);
/* 66 */                    int i = this.zzud[length];
/* 68 */                    while (entry2 != null && this.zzus.zza(entry2) > i) {
/* 80 */                        this.zzus.zza(zznsVar, entry2);
/* 96 */                        entry2 = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
                            }
                            switch ((iZzas & 267386880) >>> 20) {
                                case 0:
/* 1283 */                          if (zza(t, length)) {
/* 1291 */                              zznsVar.zza(i, zznd.zzn(t, iZzas & 1048575));
                                    }
                                    break;
                                case 1:
/* 1267 */                          if (zza(t, length)) {
/* 1275 */                              zznsVar.zza(i, zznd.zzm(t, iZzas & 1048575));
                                    }
                                    break;
                                case 2:
/* 1251 */                          if (zza(t, length)) {
/* 1259 */                              zznsVar.zzi(i, zznd.zzk(t, iZzas & 1048575));
                                    }
                                    break;
                                case 3:
/* 1235 */                          if (zza(t, length)) {
/* 1243 */                              zznsVar.zza(i, zznd.zzk(t, iZzas & 1048575));
                                    }
                                    break;
                                case 4:
/* 1219 */                          if (zza(t, length)) {
/* 1227 */                              zznsVar.zzc(i, zznd.zzj(t, iZzas & 1048575));
                                    }
                                    break;
                                case 5:
/* 1203 */                          if (zza(t, length)) {
/* 1211 */                              zznsVar.zzc(i, zznd.zzk(t, iZzas & 1048575));
                                    }
                                    break;
                                case 6:
/* 1187 */                          if (zza(t, length)) {
/* 1195 */                              zznsVar.zzf(i, zznd.zzj(t, iZzas & 1048575));
                                    }
                                    break;
                                case 7:
/* 1170 */                          if (zza(t, length)) {
/* 1178 */                              zznsVar.zzb(i, zznd.zzl(t, iZzas & 1048575));
                                    }
                                    break;
                                case 8:
/* 1153 */                          if (zza(t, length)) {
/* 1161 */                              zza(i, zznd.zzo(t, iZzas & 1048575), zznsVar);
                                    }
                                    break;
                                case 9:
/* 1132 */                          if (zza(t, length)) {
/* 1144 */                              zznsVar.zza(i, zznd.zzo(t, iZzas & 1048575), zzap(length));
                                    }
                                    break;
                                case 10:
/* 1113 */                          if (zza(t, length)) {
/* 1123 */                              zznsVar.zza(i, (zzjc) zznd.zzo(t, iZzas & 1048575));
                                    }
                                    break;
                                case 11:
/* 1096 */                          if (zza(t, length)) {
/* 1104 */                              zznsVar.zzd(i, zznd.zzj(t, iZzas & 1048575));
                                    }
                                    break;
                                case 12:
/* 1079 */                          if (zza(t, length)) {
/* 1087 */                              zznsVar.zzn(i, zznd.zzj(t, iZzas & 1048575));
                                    }
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1062 */                          if (zza(t, length)) {
/* 1070 */                              zznsVar.zzm(i, zznd.zzj(t, iZzas & 1048575));
                                    }
                                    break;
                                case 14:
/* 1045 */                          if (zza(t, length)) {
/* 1053 */                              zznsVar.zzj(i, zznd.zzk(t, iZzas & 1048575));
                                    }
                                    break;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1028 */                          if (zza(t, length)) {
/* 1036 */                              zznsVar.zze(i, zznd.zzj(t, iZzas & 1048575));
                                    }
                                    break;
                                case 16:
/* 1011 */                          if (zza(t, length)) {
/* 1019 */                              zznsVar.zzb(i, zznd.zzk(t, iZzas & 1048575));
                                    }
                                    break;
                                case 17:
/* 990 */                           if (zza(t, length)) {
/* 1002 */                              zznsVar.zzb(i, zznd.zzo(t, iZzas & 1048575), zzap(length));
                                    }
                                    break;
                                case 18:
/* 981 */                           zzmh.zza(this.zzud[length], (List<Double>) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case 19:
/* 964 */                           zzmh.zzb(this.zzud[length], (List<Float>) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case 20:
/* 947 */                           zzmh.zzc(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case Build.API_LEVELS.API_21 /* 21 */:
/* 930 */                           zzmh.zzd(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case Build.API_LEVELS.API_22 /* 22 */:
/* 913 */                           zzmh.zzh(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case Build.API_LEVELS.API_23 /* 23 */:
/* 896 */                           zzmh.zzf(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case 24:
/* 879 */                           zzmh.zzk(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case Build.API_LEVELS.API_25 /* 25 */:
/* 862 */                           zzmh.zzn(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case Build.API_LEVELS.API_26 /* 26 */:
/* 845 */                           zzmh.zza(this.zzud[length], (List<String>) zznd.zzo(t, iZzas & 1048575), zznsVar);
                                    break;
                                case Build.API_LEVELS.API_27 /* 27 */:
/* 828 */                           zzmh.zza(this.zzud[length], (List<?>) zznd.zzo(t, iZzas & 1048575), zznsVar, zzap(length));
                                    break;
                                case Build.API_LEVELS.API_28 /* 28 */:
/* 807 */                           zzmh.zzb(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar);
                                    break;
                                case Build.API_LEVELS.API_29 /* 29 */:
/* 790 */                           zzmh.zzi(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case Build.API_LEVELS.API_30 /* 30 */:
/* 773 */                           zzmh.zzm(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case Build.API_LEVELS.API_31 /* 31 */:
/* 756 */                           zzmh.zzl(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case 32:
/* 739 */                           zzmh.zzg(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case Build.API_LEVELS.API_33 /* 33 */:
/* 722 */                           zzmh.zzj(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case Build.API_LEVELS.API_34 /* 34 */:
/* 705 */                           zzmh.zze(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, false);
                                    break;
                                case Build.API_LEVELS.API_35 /* 35 */:
/* 688 */                           zzmh.zza(this.zzud[length], (List<Double>) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case Build.API_LEVELS.API_36 /* 36 */:
/* 671 */                           zzmh.zzb(this.zzud[length], (List<Float>) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case 37:
/* 654 */                           zzmh.zzc(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case 38:
/* 637 */                           zzmh.zzd(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case 39:
/* 620 */                           zzmh.zzh(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case RequestError.NETWORK_FAILURE /* 40 */:
/* 603 */                           zzmh.zzf(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case RequestError.NO_DEV_KEY /* 41 */:
/* 586 */                           zzmh.zzk(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case 42:
/* 569 */                           zzmh.zzn(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case 43:
/* 552 */                           zzmh.zzi(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case 44:
/* 535 */                           zzmh.zzm(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case 45:
/* 518 */                           zzmh.zzl(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case 46:
/* 501 */                           zzmh.zzg(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case 47:
/* 484 */                           zzmh.zzj(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case 48:
/* 467 */                           zzmh.zze(this.zzud[length], (List) zznd.zzo(t, iZzas & 1048575), zznsVar, true);
                                    break;
                                case 49:
/* 450 */                           zzmh.zzb(this.zzud[length], (List<?>) zznd.zzo(t, iZzas & 1048575), zznsVar, zzap(length));
                                    break;
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 429 */                           zza(zznsVar, i, zznd.zzo(t, iZzas & 1048575), length);
                                    break;
                                case 51:
/* 410 */                           if (zza(t, i, length)) {
/* 418 */                               zznsVar.zza(i, zze(t, iZzas & 1048575));
                                    }
                                    break;
                                case 52:
/* 393 */                           if (zza(t, i, length)) {
/* 401 */                               zznsVar.zza(i, zzf(t, iZzas & 1048575));
                                    }
                                    break;
                                case 53:
/* 376 */                           if (zza(t, i, length)) {
/* 384 */                               zznsVar.zzi(i, zzh(t, iZzas & 1048575));
                                    }
                                    break;
                                case 54:
/* 359 */                           if (zza(t, i, length)) {
/* 367 */                               zznsVar.zza(i, zzh(t, iZzas & 1048575));
                                    }
                                    break;
                                case 55:
/* 342 */                           if (zza(t, i, length)) {
/* 350 */                               zznsVar.zzc(i, zzg(t, iZzas & 1048575));
                                    }
                                    break;
                                case 56:
/* 325 */                           if (zza(t, i, length)) {
/* 333 */                               zznsVar.zzc(i, zzh(t, iZzas & 1048575));
                                    }
                                    break;
                                case 57:
/* 308 */                           if (zza(t, i, length)) {
/* 316 */                               zznsVar.zzf(i, zzg(t, iZzas & 1048575));
                                    }
                                    break;
                                case 58:
/* 291 */                           if (zza(t, i, length)) {
/* 299 */                               zznsVar.zzb(i, zzi(t, iZzas & 1048575));
                                    }
                                    break;
                                case 59:
/* 274 */                           if (zza(t, i, length)) {
/* 282 */                               zza(i, zznd.zzo(t, iZzas & 1048575), zznsVar);
                                    }
                                    break;
                                case 60:
/* 253 */                           if (zza(t, i, length)) {
/* 265 */                               zznsVar.zza(i, zznd.zzo(t, iZzas & 1048575), zzap(length));
                                    }
                                    break;
                                case 61:
/* 234 */                           if (zza(t, i, length)) {
/* 244 */                               zznsVar.zza(i, (zzjc) zznd.zzo(t, iZzas & 1048575));
                                    }
                                    break;
                                case 62:
/* 217 */                           if (zza(t, i, length)) {
/* 225 */                               zznsVar.zzd(i, zzg(t, iZzas & 1048575));
                                    }
                                    break;
                                case 63:
/* 200 */                           if (zza(t, i, length)) {
/* 208 */                               zznsVar.zzn(i, zzg(t, iZzas & 1048575));
                                    }
                                    break;
                                case 64:
/* 183 */                           if (zza(t, i, length)) {
/* 191 */                               zznsVar.zzm(i, zzg(t, iZzas & 1048575));
                                    }
                                    break;
                                case 65:
/* 166 */                           if (zza(t, i, length)) {
/* 174 */                               zznsVar.zzj(i, zzh(t, iZzas & 1048575));
                                    }
                                    break;
                                case 66:
/* 149 */                           if (zza(t, i, length)) {
/* 157 */                               zznsVar.zze(i, zzg(t, iZzas & 1048575));
                                    }
                                    break;
                                case 67:
/* 132 */                           if (zza(t, i, length)) {
/* 140 */                               zznsVar.zzb(i, zzh(t, iZzas & 1048575));
                                    }
                                    break;
                                case 68:
/* 111 */                           if (zza(t, i, length)) {
/* 123 */                               zznsVar.zzb(i, zznd.zzo(t, iZzas & 1048575), zzap(length));
                                    }
                                    break;
                            }
                        }
/* 1298 */              while (entry2 != null) {
/* 1302 */                  this.zzus.zza(zznsVar, entry2);
/* 1319 */                  entry2 = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
                        }
/* 1321 */              return;
                    }
/* 1324 */          if (!this.zzuk) {
/* 2629 */              zzb(t, zznsVar);
/* 2632 */              return;
                    }
/* 1328 */          if (this.zzui) {
/* 1332 */              zzkb<T> zzkbVarZzb2 = this.zzus.zzb(t);
/* 1342 */              if (zzkbVarZzb2.zzos.isEmpty()) {
/* 1355 */                  it = null;
/* 1356 */                  entry = null;
                        } else {
/* 1344 */                  it = zzkbVarZzb2.iterator();
/* 1352 */                  entry = (Map.Entry) it.next();
                        }
                    } else {
/* 1355 */              it = null;
/* 1356 */              entry = null;
                    }
/* 1359 */          int length2 = this.zzud.length;
/* 1361 */          for (int i2 = 0; i2 < length2; i2 += 3) {
/* 1363 */              int iZzas2 = zzas(i2);
/* 1369 */              int i3 = this.zzud[i2];
/* 1371 */              while (entry != null && this.zzus.zza(entry) <= i3) {
/* 1383 */                  this.zzus.zza(zznsVar, entry);
/* 1399 */                  entry = it.hasNext() ? (Map.Entry) it.next() : null;
                        }
                        switch ((iZzas2 & 267386880) >>> 20) {
                            case 0:
/* 2586 */                      if (zza(t, i2)) {
/* 2594 */                          zznsVar.zza(i3, zznd.zzn(t, iZzas2 & 1048575));
                                }
                                break;
                            case 1:
/* 2570 */                      if (zza(t, i2)) {
/* 2578 */                          zznsVar.zza(i3, zznd.zzm(t, iZzas2 & 1048575));
                                }
                                break;
                            case 2:
/* 2554 */                      if (zza(t, i2)) {
/* 2562 */                          zznsVar.zzi(i3, zznd.zzk(t, iZzas2 & 1048575));
                                }
                                break;
                            case 3:
/* 2538 */                      if (zza(t, i2)) {
/* 2546 */                          zznsVar.zza(i3, zznd.zzk(t, iZzas2 & 1048575));
                                }
                                break;
                            case 4:
/* 2522 */                      if (zza(t, i2)) {
/* 2530 */                          zznsVar.zzc(i3, zznd.zzj(t, iZzas2 & 1048575));
                                }
                                break;
                            case 5:
/* 2506 */                      if (zza(t, i2)) {
/* 2514 */                          zznsVar.zzc(i3, zznd.zzk(t, iZzas2 & 1048575));
                                }
                                break;
                            case 6:
/* 2490 */                      if (zza(t, i2)) {
/* 2498 */                          zznsVar.zzf(i3, zznd.zzj(t, iZzas2 & 1048575));
                                }
                                break;
                            case 7:
/* 2473 */                      if (zza(t, i2)) {
/* 2481 */                          zznsVar.zzb(i3, zznd.zzl(t, iZzas2 & 1048575));
                                }
                                break;
                            case 8:
/* 2456 */                      if (zza(t, i2)) {
/* 2464 */                          zza(i3, zznd.zzo(t, iZzas2 & 1048575), zznsVar);
                                }
                                break;
                            case 9:
/* 2435 */                      if (zza(t, i2)) {
/* 2447 */                          zznsVar.zza(i3, zznd.zzo(t, iZzas2 & 1048575), zzap(i2));
                                }
                                break;
                            case 10:
/* 2416 */                      if (zza(t, i2)) {
/* 2426 */                          zznsVar.zza(i3, (zzjc) zznd.zzo(t, iZzas2 & 1048575));
                                }
                                break;
                            case 11:
/* 2399 */                      if (zza(t, i2)) {
/* 2407 */                          zznsVar.zzd(i3, zznd.zzj(t, iZzas2 & 1048575));
                                }
                                break;
                            case 12:
/* 2382 */                      if (zza(t, i2)) {
/* 2390 */                          zznsVar.zzn(i3, zznd.zzj(t, iZzas2 & 1048575));
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 2365 */                      if (zza(t, i2)) {
/* 2373 */                          zznsVar.zzm(i3, zznd.zzj(t, iZzas2 & 1048575));
                                }
                                break;
                            case 14:
/* 2348 */                      if (zza(t, i2)) {
/* 2356 */                          zznsVar.zzj(i3, zznd.zzk(t, iZzas2 & 1048575));
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 2331 */                      if (zza(t, i2)) {
/* 2339 */                          zznsVar.zze(i3, zznd.zzj(t, iZzas2 & 1048575));
                                }
                                break;
                            case 16:
/* 2314 */                      if (zza(t, i2)) {
/* 2322 */                          zznsVar.zzb(i3, zznd.zzk(t, iZzas2 & 1048575));
                                }
                                break;
                            case 17:
/* 2293 */                      if (zza(t, i2)) {
/* 2305 */                          zznsVar.zzb(i3, zznd.zzo(t, iZzas2 & 1048575), zzap(i2));
                                }
                                break;
                            case 18:
/* 2284 */                      zzmh.zza(this.zzud[i2], (List<Double>) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case 19:
/* 2267 */                      zzmh.zzb(this.zzud[i2], (List<Float>) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case 20:
/* 2250 */                      zzmh.zzc(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 2233 */                      zzmh.zzd(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 2216 */                      zzmh.zzh(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 2199 */                      zzmh.zzf(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case 24:
/* 2182 */                      zzmh.zzk(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 2165 */                      zzmh.zzn(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 2148 */                      zzmh.zza(this.zzud[i2], (List<String>) zznd.zzo(t, iZzas2 & 1048575), zznsVar);
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 2131 */                      zzmh.zza(this.zzud[i2], (List<?>) zznd.zzo(t, iZzas2 & 1048575), zznsVar, zzap(i2));
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 2110 */                      zzmh.zzb(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar);
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 2093 */                      zzmh.zzi(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 2076 */                      zzmh.zzm(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 2059 */                      zzmh.zzl(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case 32:
/* 2042 */                      zzmh.zzg(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 2025 */                      zzmh.zzj(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 2008 */                      zzmh.zze(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, false);
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 1991 */                      zzmh.zza(this.zzud[i2], (List<Double>) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 1974 */                      zzmh.zzb(this.zzud[i2], (List<Float>) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case 37:
/* 1957 */                      zzmh.zzc(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case 38:
/* 1940 */                      zzmh.zzd(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case 39:
/* 1923 */                      zzmh.zzh(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 1906 */                      zzmh.zzf(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 1889 */                      zzmh.zzk(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case 42:
/* 1872 */                      zzmh.zzn(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case 43:
/* 1855 */                      zzmh.zzi(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case 44:
/* 1838 */                      zzmh.zzm(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case 45:
/* 1821 */                      zzmh.zzl(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case 46:
/* 1804 */                      zzmh.zzg(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case 47:
/* 1787 */                      zzmh.zzj(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case 48:
/* 1770 */                      zzmh.zze(this.zzud[i2], (List) zznd.zzo(t, iZzas2 & 1048575), zznsVar, true);
                                break;
                            case 49:
/* 1753 */                      zzmh.zzb(this.zzud[i2], (List<?>) zznd.zzo(t, iZzas2 & 1048575), zznsVar, zzap(i2));
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 1732 */                      zza(zznsVar, i3, zznd.zzo(t, iZzas2 & 1048575), i2);
                                break;
                            case 51:
/* 1713 */                      if (zza(t, i3, i2)) {
/* 1721 */                          zznsVar.zza(i3, zze(t, iZzas2 & 1048575));
                                }
                                break;
                            case 52:
/* 1696 */                      if (zza(t, i3, i2)) {
/* 1704 */                          zznsVar.zza(i3, zzf(t, iZzas2 & 1048575));
                                }
                                break;
                            case 53:
/* 1679 */                      if (zza(t, i3, i2)) {
/* 1687 */                          zznsVar.zzi(i3, zzh(t, iZzas2 & 1048575));
                                }
                                break;
                            case 54:
/* 1662 */                      if (zza(t, i3, i2)) {
/* 1670 */                          zznsVar.zza(i3, zzh(t, iZzas2 & 1048575));
                                }
                                break;
                            case 55:
/* 1645 */                      if (zza(t, i3, i2)) {
/* 1653 */                          zznsVar.zzc(i3, zzg(t, iZzas2 & 1048575));
                                }
                                break;
                            case 56:
/* 1628 */                      if (zza(t, i3, i2)) {
/* 1636 */                          zznsVar.zzc(i3, zzh(t, iZzas2 & 1048575));
                                }
                                break;
                            case 57:
/* 1611 */                      if (zza(t, i3, i2)) {
/* 1619 */                          zznsVar.zzf(i3, zzg(t, iZzas2 & 1048575));
                                }
                                break;
                            case 58:
/* 1594 */                      if (zza(t, i3, i2)) {
/* 1602 */                          zznsVar.zzb(i3, zzi(t, iZzas2 & 1048575));
                                }
                                break;
                            case 59:
/* 1577 */                      if (zza(t, i3, i2)) {
/* 1585 */                          zza(i3, zznd.zzo(t, iZzas2 & 1048575), zznsVar);
                                }
                                break;
                            case 60:
/* 1556 */                      if (zza(t, i3, i2)) {
/* 1568 */                          zznsVar.zza(i3, zznd.zzo(t, iZzas2 & 1048575), zzap(i2));
                                }
                                break;
                            case 61:
/* 1537 */                      if (zza(t, i3, i2)) {
/* 1547 */                          zznsVar.zza(i3, (zzjc) zznd.zzo(t, iZzas2 & 1048575));
                                }
                                break;
                            case 62:
/* 1520 */                      if (zza(t, i3, i2)) {
/* 1528 */                          zznsVar.zzd(i3, zzg(t, iZzas2 & 1048575));
                                }
                                break;
                            case 63:
/* 1503 */                      if (zza(t, i3, i2)) {
/* 1511 */                          zznsVar.zzn(i3, zzg(t, iZzas2 & 1048575));
                                }
                                break;
                            case 64:
/* 1486 */                      if (zza(t, i3, i2)) {
/* 1494 */                          zznsVar.zzm(i3, zzg(t, iZzas2 & 1048575));
                                }
                                break;
                            case 65:
/* 1469 */                      if (zza(t, i3, i2)) {
/* 1477 */                          zznsVar.zzj(i3, zzh(t, iZzas2 & 1048575));
                                }
                                break;
                            case 66:
/* 1452 */                      if (zza(t, i3, i2)) {
/* 1460 */                          zznsVar.zze(i3, zzg(t, iZzas2 & 1048575));
                                }
                                break;
                            case 67:
/* 1435 */                      if (zza(t, i3, i2)) {
/* 1443 */                          zznsVar.zzb(i3, zzh(t, iZzas2 & 1048575));
                                }
                                break;
                            case 68:
/* 1414 */                      if (zza(t, i3, i2)) {
/* 1426 */                          zznsVar.zzb(i3, zznd.zzo(t, iZzas2 & 1048575), zzap(i2));
                                }
                                break;
                        }
                    }
/* 2601 */          while (entry != null) {
/* 2605 */              this.zzus.zza(zznsVar, entry);
/* 2621 */              entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
/* 2625 */          zza(this.zzur, t, zznsVar);
                }

                @Override // com.google.android.gms.internal.drive.zzmf
                public final void zzc(T t, T t2) {
/* 1 */             t2.getClass();
/* 8 */             for (int i = 0; i < this.zzud.length; i += 3) {
/* 10 */                int iZzas = zzas(i);
/* 17 */                long j = 1048575 & iZzas;
/* 21 */                int i2 = this.zzud[i];
                        switch ((iZzas & 267386880) >>> 20) {
                            case 0:
/* 371 */                       if (zza(t2, i)) {
/* 377 */                           zznd.zza(t, j, zznd.zzn(t2, j));
/* 380 */                           zzb(t, i);
                                }
                                break;
                            case 1:
/* 354 */                       if (zza(t2, i)) {
/* 360 */                           zznd.zza((Object) t, j, zznd.zzm(t2, j));
/* 363 */                           zzb(t, i);
                                }
                                break;
                            case 2:
/* 337 */                       if (zza(t2, i)) {
/* 343 */                           zznd.zza((Object) t, j, zznd.zzk(t2, j));
/* 346 */                           zzb(t, i);
                                }
                                break;
                            case 3:
/* 320 */                       if (zza(t2, i)) {
/* 326 */                           zznd.zza((Object) t, j, zznd.zzk(t2, j));
/* 329 */                           zzb(t, i);
                                }
                                break;
                            case 4:
/* 303 */                       if (zza(t2, i)) {
/* 309 */                           zznd.zza((Object) t, j, zznd.zzj(t2, j));
/* 312 */                           zzb(t, i);
                                }
                                break;
                            case 5:
/* 286 */                       if (zza(t2, i)) {
/* 292 */                           zznd.zza((Object) t, j, zznd.zzk(t2, j));
/* 295 */                           zzb(t, i);
                                }
                                break;
                            case 6:
/* 269 */                       if (zza(t2, i)) {
/* 275 */                           zznd.zza((Object) t, j, zznd.zzj(t2, j));
/* 278 */                           zzb(t, i);
                                }
                                break;
                            case 7:
/* 251 */                       if (zza(t2, i)) {
/* 257 */                           zznd.zza(t, j, zznd.zzl(t2, j));
/* 260 */                           zzb(t, i);
                                }
                                break;
                            case 8:
/* 233 */                       if (zza(t2, i)) {
/* 239 */                           zznd.zza(t, j, zznd.zzo(t2, j));
/* 242 */                           zzb(t, i);
                                }
                                break;
                            case 9:
/* 224 */                       zza(t, t2, i);
                                break;
                            case 10:
/* 210 */                       if (zza(t2, i)) {
/* 216 */                           zznd.zza(t, j, zznd.zzo(t2, j));
/* 219 */                           zzb(t, i);
                                }
                                break;
                            case 11:
/* 192 */                       if (zza(t2, i)) {
/* 198 */                           zznd.zza((Object) t, j, zznd.zzj(t2, j));
/* 201 */                           zzb(t, i);
                                }
                                break;
                            case 12:
/* 174 */                       if (zza(t2, i)) {
/* 180 */                           zznd.zza((Object) t, j, zznd.zzj(t2, j));
/* 183 */                           zzb(t, i);
                                }
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 156 */                       if (zza(t2, i)) {
/* 162 */                           zznd.zza((Object) t, j, zznd.zzj(t2, j));
/* 165 */                           zzb(t, i);
                                }
                                break;
                            case 14:
/* 138 */                       if (zza(t2, i)) {
/* 144 */                           zznd.zza((Object) t, j, zznd.zzk(t2, j));
/* 147 */                           zzb(t, i);
                                }
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 120 */                       if (zza(t2, i)) {
/* 126 */                           zznd.zza((Object) t, j, zznd.zzj(t2, j));
/* 129 */                           zzb(t, i);
                                }
                                break;
                            case 16:
/* 102 */                       if (zza(t2, i)) {
/* 108 */                           zznd.zza((Object) t, j, zznd.zzk(t2, j));
/* 111 */                           zzb(t, i);
                                }
                                break;
                            case 17:
/* 93 */                        zza(t, t2, i);
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
/* 88 */                        this.zzuq.zza(t, t2, j);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 81 */                        zzmh.zza(this.zzut, t, t2, j);
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
/* 65 */                        if (zza(t2, i2, i)) {
/* 71 */                            zznd.zza(t, j, zznd.zzo(t2, j));
/* 74 */                            zzb(t, i2, i);
                                }
                                break;
                            case 60:
/* 56 */                        zzb(t, t2, i);
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
/* 42 */                        if (zza(t2, i2, i)) {
/* 48 */                            zznd.zza(t, j, zznd.zzo(t2, j));
/* 51 */                            zzb(t, i2, i);
                                }
                                break;
                            case 68:
/* 33 */                        zzb(t, t2, i);
                                break;
                        }
                    }
/* 389 */           if (this.zzuk) {
/* 405 */               return;
                    }
/* 393 */           zzmh.zza(this.zzur, t, t2);
/* 398 */           if (this.zzui) {
/* 402 */               zzmh.zza(this.zzus, t, t2);
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzmf
                public final void zzd(T t) {
                    int i;
                    int[] iArr;
/* 1 */             int i2 = this.zzun;
                    while (true) {
/* 3 */                 i = this.zzuo;
/* 5 */                 iArr = this.zzum;
/* 7 */                 if (i2 >= i) {
                            break;
                        }
/* 18 */                long jZzas = zzas(iArr[i2]) & 1048575;
/* 20 */                Object objZzo = zznd.zzo(t, jZzas);
/* 24 */                if (objZzo != null) {
/* 32 */                    zznd.zza(t, jZzas, this.zzut.zzk(objZzo));
                        }
/* 35 */                i2++;
                    }
/* 38 */            int length = iArr.length;
/* 39 */            while (i < length) {
/* 48 */                this.zzuq.zza(t, this.zzum[i]);
/* 51 */                i++;
                    }
/* 56 */            this.zzur.zzd(t);
/* 61 */            if (this.zzui) {
/* 65 */                this.zzus.zzd(t);
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:261:0x0571 A[PHI: r5
  0x0571: PHI (r5v4 int) = 
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v12 int)
  (r5v1 int)
  (r5v13 int)
  (r5v1 int)
  (r5v14 int)
  (r5v1 int)
  (r5v15 int)
  (r5v1 int)
  (r5v16 int)
  (r5v1 int)
  (r5v17 int)
  (r5v1 int)
  (r5v18 int)
  (r5v1 int)
  (r5v19 int)
  (r5v1 int)
  (r5v20 int)
  (r5v1 int)
  (r5v21 int)
  (r5v1 int)
  (r5v22 int)
  (r5v1 int)
  (r5v23 int)
  (r5v1 int)
  (r5v24 int)
  (r5v1 int)
  (r5v25 int)
  (r5v1 int)
  (r5v26 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v27 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v28 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v29 int)
  (r5v1 int)
 binds: [B:255:0x0558, B:461:0x09c8, B:458:0x09be, B:452:0x09a2, B:449:0x0990, B:446:0x0980, B:443:0x0972, B:440:0x0964, B:437:0x0959, B:434:0x094f, B:431:0x0941, B:428:0x0933, B:425:0x091f, B:401:0x082e, B:405:0x0838, B:395:0x0810, B:399:0x081a, B:389:0x07f2, B:393:0x07fc, B:383:0x07d4, B:387:0x07de, B:377:0x07b6, B:381:0x07c0, B:371:0x0798, B:375:0x07a2, B:365:0x077a, B:369:0x0784, B:359:0x075c, B:363:0x0766, B:353:0x073e, B:357:0x0748, B:347:0x0720, B:351:0x072a, B:341:0x0702, B:345:0x070c, B:335:0x06e4, B:339:0x06ee, B:329:0x06c6, B:333:0x06d0, B:323:0x06a8, B:327:0x06b2, B:318:0x0673, B:319:0x0675, B:315:0x0666, B:312:0x0656, B:309:0x0646, B:306:0x0636, B:303:0x062a, B:300:0x061e, B:297:0x0612, B:291:0x05f4, B:289:0x05ee, B:287:0x05e0, B:284:0x05cf, B:281:0x05c0, B:278:0x05b1, B:276:0x05ab, B:274:0x05a4, B:271:0x0599, B:268:0x058a, B:265:0x057b, B:260:0x0570, B:258:0x0560] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.google.android.gms.internal.drive.zzmf
                public final int zzn(T t) {
                    int i;
                    int i2;
                    int i3;
                    boolean z;
                    int iZzd;
                    int iZzc;
                    int iZzc2;
                    int iZzk;
                    int i4;
                    int iZzv;
                    int iZzb;
                    int iZzc3;
/* 7 */             int i5 = 267386880;
/* 10 */            int i6 = 1048575;
/* 16 */            int i7 = 0;
/* 17 */            if (this.zzuk) {
/* 19 */                Unsafe unsafe = zzuc;
/* 21 */                int i8 = 0;
/* 22 */                int iM7484g = 0;
/* 26 */                while (i8 < this.zzud.length) {
/* 28 */                    int iZzas = zzas(i8);
/* 34 */                    int i9 = (iZzas & i5) >>> 20;
/* 36 */                    int i10 = i5;
/* 40 */                    int i11 = this.zzud[i8];
/* 42 */                    long j = iZzas & 1048575;
/* 68 */                    int i12 = (i9 < zzke.zzqh.m2156id() || i9 > zzke.zzqu.m2156id()) ? 0 : this.zzud[i8 + 2] & 1048575;
                            switch (i9) {
                                case 0:
/* 1259 */                          if (zza(t, i8)) {
/* 1263 */                              iZzb = zzjr.zzb(i11, 0.0d);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 1:
/* 1247 */                          if (zza(t, i8)) {
/* 1249 */                              iZzb = zzjr.zzb(i11, 0.0f);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 2:
/* 1231 */                          if (zza(t, i8)) {
/* 1237 */                              iZzb = zzjr.zzd(i11, zznd.zzk(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 3:
/* 1215 */                          if (zza(t, i8)) {
/* 1221 */                              iZzb = zzjr.zze(i11, zznd.zzk(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 4:
/* 1199 */                          if (zza(t, i8)) {
/* 1205 */                              iZzb = zzjr.zzg(i11, zznd.zzj(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 5:
/* 1187 */                          if (zza(t, i8)) {
/* 1189 */                              iZzb = zzjr.zzg(i11, 0L);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 6:
/* 1175 */                          if (zza(t, i8)) {
/* 1177 */                              iZzb = zzjr.zzj(i11, 0);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 7:
/* 1163 */                          if (zza(t, i8)) {
/* 1165 */                              iZzb = zzjr.zzc(i11, true);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 8:
/* 1133 */                          if (zza(t, i8)) {
/* 1135 */                              Object objZzo = zznd.zzo(t, j);
/* 1153 */                              iZzb = objZzo instanceof zzjc ? zzjr.zzc(i11, (zzjc) objZzo) : zzjr.zzb(i11, (String) objZzo);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 9:
/* 1113 */                          if (zza(t, i8)) {
/* 1123 */                              iZzc3 = zzmh.zzc(i11, zznd.zzo(t, j), zzap(i8));
/* 214 */                               iM7484g += iZzc3;
                                    }
                                    break;
                                case 10:
/* 1095 */                          if (zza(t, i8)) {
/* 1103 */                              iZzb = zzjr.zzc(i11, (zzjc) zznd.zzo(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 11:
/* 1079 */                          if (zza(t, i8)) {
/* 1085 */                              iZzb = zzjr.zzh(i11, zznd.zzj(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 12:
/* 1063 */                          if (zza(t, i8)) {
/* 1069 */                              iZzb = zzjr.zzl(i11, zznd.zzj(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1051 */                          if (zza(t, i8)) {
/* 1053 */                              iZzb = zzjr.zzk(i11, 0);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 14:
/* 1039 */                          if (zza(t, i8)) {
/* 1041 */                              iZzb = zzjr.zzh(i11, 0L);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1023 */                          if (zza(t, i8)) {
/* 1029 */                              iZzb = zzjr.zzi(i11, zznd.zzj(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 16:
/* 1007 */                          if (zza(t, i8)) {
/* 1013 */                              iZzb = zzjr.zzf(i11, zznd.zzk(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 17:
/* 985 */                           if (zza(t, i8)) {
/* 997 */                               iZzb = zzjr.zzc(i11, (zzlq) zznd.zzo(t, j), zzap(i8));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 18:
/* 975 */                           iZzc3 = zzmh.zzw(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case 19:
/* 965 */                           iZzc3 = zzmh.zzv(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case 20:
/* 955 */                           iZzc3 = zzmh.zzo(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case Build.API_LEVELS.API_21 /* 21 */:
/* 945 */                           iZzc3 = zzmh.zzp(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case Build.API_LEVELS.API_22 /* 22 */:
/* 935 */                           iZzc3 = zzmh.zzs(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case Build.API_LEVELS.API_23 /* 23 */:
/* 925 */                           iZzc3 = zzmh.zzw(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case 24:
/* 915 */                           iZzc3 = zzmh.zzv(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case Build.API_LEVELS.API_25 /* 25 */:
/* 905 */                           iZzc3 = zzmh.zzx(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case Build.API_LEVELS.API_26 /* 26 */:
/* 895 */                           iZzc3 = zzmh.zzc(i11, zzd(t, j));
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case Build.API_LEVELS.API_27 /* 27 */:
/* 885 */                           iZzc3 = zzmh.zzc(i11, (List<?>) zzd(t, j), zzap(i8));
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case Build.API_LEVELS.API_28 /* 28 */:
/* 871 */                           iZzc3 = zzmh.zzd(i11, (List<zzjc>) zzd(t, j));
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case Build.API_LEVELS.API_29 /* 29 */:
/* 861 */                           iZzc3 = zzmh.zzt(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case Build.API_LEVELS.API_30 /* 30 */:
/* 851 */                           iZzc3 = zzmh.zzr(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case Build.API_LEVELS.API_31 /* 31 */:
/* 841 */                           iZzc3 = zzmh.zzv(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case 32:
/* 831 */                           iZzc3 = zzmh.zzw(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case Build.API_LEVELS.API_33 /* 33 */:
/* 821 */                           iZzc3 = zzmh.zzu(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case Build.API_LEVELS.API_34 /* 34 */:
/* 811 */                           iZzc3 = zzmh.zzq(i11, zzd(t, j), false);
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case Build.API_LEVELS.API_35 /* 35 */:
/* 783 */                           int iZzi = zzmh.zzi((List) unsafe.getObject(t, j));
/* 787 */                           if (iZzi > 0) {
/* 791 */                               if (this.zzul) {
/* 794 */                                   unsafe.putInt(t, i12, iZzi);
                                        }
/* 801 */                               iM7484g = pm2.m7484g(iZzi, zzjr.zzab(i11), iZzi, iM7484g);
                                    }
                                    break;
                                case Build.API_LEVELS.API_36 /* 36 */:
/* 753 */                           int iZzh = zzmh.zzh((List) unsafe.getObject(t, j));
/* 757 */                           if (iZzh > 0) {
/* 761 */                               if (this.zzul) {
/* 764 */                                   unsafe.putInt(t, i12, iZzh);
                                        }
/* 771 */                               iM7484g = pm2.m7484g(iZzh, zzjr.zzab(i11), iZzh, iM7484g);
                                    }
                                    break;
                                case 37:
/* 723 */                           int iZza = zzmh.zza((List) unsafe.getObject(t, j));
/* 727 */                           if (iZza > 0) {
/* 731 */                               if (this.zzul) {
/* 734 */                                   unsafe.putInt(t, i12, iZza);
                                        }
/* 741 */                               iM7484g = pm2.m7484g(iZza, zzjr.zzab(i11), iZza, iM7484g);
                                    }
                                    break;
                                case 38:
/* 693 */                           int iZzb2 = zzmh.zzb((List) unsafe.getObject(t, j));
/* 697 */                           if (iZzb2 > 0) {
/* 701 */                               if (this.zzul) {
/* 704 */                                   unsafe.putInt(t, i12, iZzb2);
                                        }
/* 711 */                               iM7484g = pm2.m7484g(iZzb2, zzjr.zzab(i11), iZzb2, iM7484g);
                                    }
                                    break;
                                case 39:
/* 663 */                           int iZze = zzmh.zze((List) unsafe.getObject(t, j));
/* 667 */                           if (iZze > 0) {
/* 671 */                               if (this.zzul) {
/* 674 */                                   unsafe.putInt(t, i12, iZze);
                                        }
/* 681 */                               iM7484g = pm2.m7484g(iZze, zzjr.zzab(i11), iZze, iM7484g);
                                    }
                                    break;
                                case RequestError.NETWORK_FAILURE /* 40 */:
/* 633 */                           int iZzi2 = zzmh.zzi((List) unsafe.getObject(t, j));
/* 637 */                           if (iZzi2 > 0) {
/* 641 */                               if (this.zzul) {
/* 644 */                                   unsafe.putInt(t, i12, iZzi2);
                                        }
/* 651 */                               iM7484g = pm2.m7484g(iZzi2, zzjr.zzab(i11), iZzi2, iM7484g);
                                    }
                                    break;
                                case RequestError.NO_DEV_KEY /* 41 */:
/* 603 */                           int iZzh2 = zzmh.zzh((List) unsafe.getObject(t, j));
/* 607 */                           if (iZzh2 > 0) {
/* 611 */                               if (this.zzul) {
/* 614 */                                   unsafe.putInt(t, i12, iZzh2);
                                        }
/* 621 */                               iM7484g = pm2.m7484g(iZzh2, zzjr.zzab(i11), iZzh2, iM7484g);
                                    }
                                    break;
                                case 42:
/* 573 */                           int iZzj = zzmh.zzj((List) unsafe.getObject(t, j));
/* 577 */                           if (iZzj > 0) {
/* 581 */                               if (this.zzul) {
/* 584 */                                   unsafe.putInt(t, i12, iZzj);
                                        }
/* 591 */                               iM7484g = pm2.m7484g(iZzj, zzjr.zzab(i11), iZzj, iM7484g);
                                    }
                                    break;
                                case 43:
/* 543 */                           int iZzf = zzmh.zzf((List<Integer>) unsafe.getObject(t, j));
/* 547 */                           if (iZzf > 0) {
/* 551 */                               if (this.zzul) {
/* 554 */                                   unsafe.putInt(t, i12, iZzf);
                                        }
/* 561 */                               iM7484g = pm2.m7484g(iZzf, zzjr.zzab(i11), iZzf, iM7484g);
                                    }
                                    break;
                                case 44:
/* 513 */                           int iZzd2 = zzmh.zzd((List) unsafe.getObject(t, j));
/* 517 */                           if (iZzd2 > 0) {
/* 521 */                               if (this.zzul) {
/* 524 */                                   unsafe.putInt(t, i12, iZzd2);
                                        }
/* 531 */                               iM7484g = pm2.m7484g(iZzd2, zzjr.zzab(i11), iZzd2, iM7484g);
                                    }
                                    break;
                                case 45:
/* 483 */                           int iZzh3 = zzmh.zzh((List) unsafe.getObject(t, j));
/* 487 */                           if (iZzh3 > 0) {
/* 491 */                               if (this.zzul) {
/* 494 */                                   unsafe.putInt(t, i12, iZzh3);
                                        }
/* 501 */                               iM7484g = pm2.m7484g(iZzh3, zzjr.zzab(i11), iZzh3, iM7484g);
                                    }
                                    break;
                                case 46:
/* 453 */                           int iZzi3 = zzmh.zzi((List) unsafe.getObject(t, j));
/* 457 */                           if (iZzi3 > 0) {
/* 461 */                               if (this.zzul) {
/* 464 */                                   unsafe.putInt(t, i12, iZzi3);
                                        }
/* 471 */                               iM7484g = pm2.m7484g(iZzi3, zzjr.zzab(i11), iZzi3, iM7484g);
                                    }
                                    break;
                                case 47:
/* 423 */                           int iZzg = zzmh.zzg((List<Integer>) unsafe.getObject(t, j));
/* 427 */                           if (iZzg > 0) {
/* 431 */                               if (this.zzul) {
/* 434 */                                   unsafe.putInt(t, i12, iZzg);
                                        }
/* 441 */                               iM7484g = pm2.m7484g(iZzg, zzjr.zzab(i11), iZzg, iM7484g);
                                    }
                                    break;
                                case 48:
/* 393 */                           int iZzc4 = zzmh.zzc((List) unsafe.getObject(t, j));
/* 397 */                           if (iZzc4 > 0) {
/* 401 */                               if (this.zzul) {
/* 404 */                                   unsafe.putInt(t, i12, iZzc4);
                                        }
/* 411 */                               iM7484g = pm2.m7484g(iZzc4, zzjr.zzab(i11), iZzc4, iM7484g);
                                    }
                                    break;
                                case 49:
/* 381 */                           iZzc3 = zzmh.zzd(i11, zzd(t, j), zzap(i8));
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 367 */                           iZzc3 = this.zzut.zzb(i11, zznd.zzo(t, j), zzaq(i8));
/* 214 */                           iM7484g += iZzc3;
                                    break;
                                case 51:
/* 347 */                           if (zza(t, i11, i8)) {
/* 351 */                               iZzb = zzjr.zzb(i11, 0.0d);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 52:
/* 335 */                           if (zza(t, i11, i8)) {
/* 337 */                               iZzb = zzjr.zzb(i11, 0.0f);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 53:
/* 319 */                           if (zza(t, i11, i8)) {
/* 325 */                               iZzb = zzjr.zzd(i11, zzh(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 54:
/* 303 */                           if (zza(t, i11, i8)) {
/* 309 */                               iZzb = zzjr.zze(i11, zzh(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 55:
/* 287 */                           if (zza(t, i11, i8)) {
/* 293 */                               iZzb = zzjr.zzg(i11, zzg(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 56:
/* 275 */                           if (zza(t, i11, i8)) {
/* 277 */                               iZzb = zzjr.zzg(i11, 0L);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 57:
/* 263 */                           if (zza(t, i11, i8)) {
/* 265 */                               iZzb = zzjr.zzj(i11, 0);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 58:
/* 251 */                           if (zza(t, i11, i8)) {
/* 253 */                               iZzb = zzjr.zzc(i11, true);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 59:
/* 221 */                           if (zza(t, i11, i8)) {
/* 223 */                               Object objZzo2 = zznd.zzo(t, j);
/* 241 */                               iZzb = objZzo2 instanceof zzjc ? zzjr.zzc(i11, (zzjc) objZzo2) : zzjr.zzb(i11, (String) objZzo2);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 60:
/* 200 */                           if (zza(t, i11, i8)) {
/* 210 */                               iZzc3 = zzmh.zzc(i11, zznd.zzo(t, j), zzap(i8));
/* 214 */                               iM7484g += iZzc3;
                                    }
                                    break;
                                case 61:
/* 183 */                           if (zza(t, i11, i8)) {
/* 191 */                               iZzb = zzjr.zzc(i11, (zzjc) zznd.zzo(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 62:
/* 168 */                           if (zza(t, i11, i8)) {
/* 174 */                               iZzb = zzjr.zzh(i11, zzg(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 63:
/* 153 */                           if (zza(t, i11, i8)) {
/* 159 */                               iZzb = zzjr.zzl(i11, zzg(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 64:
/* 142 */                           if (zza(t, i11, i8)) {
/* 144 */                               iZzb = zzjr.zzk(i11, 0);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 65:
/* 131 */                           if (zza(t, i11, i8)) {
/* 133 */                               iZzb = zzjr.zzh(i11, 0L);
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 66:
/* 116 */                           if (zza(t, i11, i8)) {
/* 122 */                               iZzb = zzjr.zzi(i11, zzg(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 67:
/* 101 */                           if (zza(t, i11, i8)) {
/* 107 */                               iZzb = zzjr.zzf(i11, zzh(t, j));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                                case 68:
/* 78 */                            if (zza(t, i11, i8)) {
/* 90 */                                iZzb = zzjr.zzc(i11, (zzlq) zznd.zzo(t, j), zzap(i8));
/* 94 */                                iM7484g += iZzb;
                                    }
                                    break;
                            }
/* 1269 */                  i8 += 3;
/* 1271 */                  i5 = i10;
                        }
/* 1281 */              return iM7484g + zza(this.zzur, t);
                    }
/* 1285 */          Unsafe unsafe2 = zzuc;
/* 1287 */          int i13 = -1;
/* 1288 */          int i14 = 0;
/* 1289 */          int iZzb3 = 0;
/* 1290 */          int i15 = 0;
/* 1294 */          while (i14 < this.zzud.length) {
/* 1296 */              int iZzas2 = zzas(i14);
/* 1300 */              int[] iArr = this.zzud;
/* 1302 */              int i16 = iArr[i14];
/* 1306 */              int i17 = i6;
/* 1308 */              int i18 = (iZzas2 & 267386880) >>> 20;
/* 1312 */              if (i18 <= 17) {
/* 1316 */                  i = iArr[i14 + 2];
/* 1318 */                  int i19 = i & i17;
/* 1322 */                  i2 = 1 << (i >>> 20);
/* 1324 */                  if (i19 != i13) {
/* 1327 */                      i15 = unsafe2.getInt(t, i19);
/* 1331 */                      i13 = i19;
                            }
                        } else {
/* 1364 */                  i = (!this.zzul || i18 < zzke.zzqh.m2156id() || i18 > zzke.zzqu.m2156id()) ? 0 : this.zzud[i14 + 2] & i17;
/* 1361 */                  i2 = 0;
                        }
/* 1366 */              long j2 = iZzas2 & i17;
                        switch (i18) {
                            case 0:
/* 2580 */                      i3 = 0;
/* 2581 */                      z = false;
/* 2586 */                      if ((i15 & i2) != 0) {
/* 2592 */                          iZzb3 += zzjr.zzb(i16, 0.0d);
                                }
                                break;
                            case 1:
/* 2567 */                      i3 = 0;
/* 2570 */                      if ((i15 & i2) != 0) {
/* 2572 */                          z = false;
/* 2577 */                          iZzb3 += zzjr.zzb(i16, 0.0f);
                                } else {
/* 1395 */                          z = false;
                                }
                                break;
                            case 2:
/* 2553 */                      i3 = 0;
/* 2556 */                      if ((i15 & i2) != 0) {
/* 2562 */                          iZzd = zzjr.zzd(i16, unsafe2.getLong(t, j2));
/* 2512 */                          iZzb3 += iZzd;
                                }
/* 1395 */                      z = false;
                                break;
                            case 3:
/* 2539 */                      i3 = 0;
/* 2542 */                      if ((i15 & i2) != 0) {
/* 2548 */                          iZzd = zzjr.zze(i16, unsafe2.getLong(t, j2));
/* 2512 */                          iZzb3 += iZzd;
                                }
/* 1395 */                      z = false;
                                break;
                            case 4:
/* 2525 */                      i3 = 0;
/* 2528 */                      if ((i15 & i2) != 0) {
/* 2534 */                          iZzd = zzjr.zzg(i16, unsafe2.getInt(t, j2));
/* 2512 */                          iZzb3 += iZzd;
                                }
/* 1395 */                      z = false;
                                break;
                            case 5:
/* 2515 */                      i3 = 0;
/* 2518 */                      if ((i15 & i2) != 0) {
/* 2520 */                          iZzd = zzjr.zzg(i16, 0L);
/* 2512 */                          iZzb3 += iZzd;
                                }
/* 1395 */                      z = false;
                                break;
                            case 6:
/* 2505 */                      if ((i15 & i2) != 0) {
/* 2507 */                          i3 = 0;
/* 2508 */                          iZzd = zzjr.zzj(i16, 0);
/* 2512 */                          iZzb3 += iZzd;
                                } else {
/* 1394 */                          i3 = 0;
                                }
/* 1395 */                      z = false;
                                break;
                            case 7:
/* 2495 */                      if ((i15 & i2) != 0) {
/* 2497 */                          iZzc = zzjr.zzc(i16, true);
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 8:
/* 2467 */                      if ((i15 & i2) != 0) {
/* 2469 */                          Object object = unsafe2.getObject(t, j2);
/* 2487 */                          iZzc = object instanceof zzjc ? zzjr.zzc(i16, (zzjc) object) : zzjr.zzb(i16, (String) object);
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 9:
/* 2449 */                      if ((i15 & i2) != 0) {
/* 2459 */                          iZzc2 = zzmh.zzc(i16, unsafe2.getObject(t, j2), zzap(i14));
/* 1519 */                          iZzb3 += iZzc2;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 10:
/* 2433 */                      if ((i15 & i2) != 0) {
/* 2441 */                          iZzc = zzjr.zzc(i16, (zzjc) unsafe2.getObject(t, j2));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 11:
/* 2419 */                      if ((i15 & i2) != 0) {
/* 2425 */                          iZzc = zzjr.zzh(i16, unsafe2.getInt(t, j2));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 12:
/* 2405 */                      if ((i15 & i2) != 0) {
/* 2411 */                          iZzc = zzjr.zzl(i16, unsafe2.getInt(t, j2));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 2394 */                      if ((i15 & i2) != 0) {
/* 2397 */                          iZzk = zzjr.zzk(i16, 0);
/* 1452 */                          iZzb3 += iZzk;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 14:
/* 2384 */                      if ((i15 & i2) != 0) {
/* 2386 */                          iZzc = zzjr.zzh(i16, 0L);
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 2370 */                      if ((i15 & i2) != 0) {
/* 2376 */                          iZzc = zzjr.zzi(i16, unsafe2.getInt(t, j2));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 16:
/* 2356 */                      if ((i15 & i2) != 0) {
/* 2362 */                          iZzc = zzjr.zzf(i16, unsafe2.getLong(t, j2));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 17:
/* 2336 */                      if ((i15 & i2) != 0) {
/* 2348 */                          iZzc = zzjr.zzc(i16, (zzlq) unsafe2.getObject(t, j2), zzap(i14));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 18:
/* 2328 */                      iZzc2 = zzmh.zzw(i16, (List) unsafe2.getObject(t, j2), false);
/* 1519 */                      iZzb3 += iZzc2;
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 19:
/* 2308 */                      i4 = 0;
/* 2315 */                      iZzv = zzmh.zzv(i16, (List) unsafe2.getObject(t, j2), false);
/* 2126 */                      iZzb3 += iZzv;
/* 2127 */                      i3 = i4;
/* 1395 */                      z = false;
                                break;
                            case 20:
/* 2295 */                      i4 = 0;
/* 2302 */                      iZzv = zzmh.zzo(i16, (List) unsafe2.getObject(t, j2), false);
/* 2126 */                      iZzb3 += iZzv;
/* 2127 */                      i3 = i4;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 2282 */                      i4 = 0;
/* 2289 */                      iZzv = zzmh.zzp(i16, (List) unsafe2.getObject(t, j2), false);
/* 2126 */                      iZzb3 += iZzv;
/* 2127 */                      i3 = i4;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 2269 */                      i4 = 0;
/* 2276 */                      iZzv = zzmh.zzs(i16, (List) unsafe2.getObject(t, j2), false);
/* 2126 */                      iZzb3 += iZzv;
/* 2127 */                      i3 = i4;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 2256 */                      i4 = 0;
/* 2263 */                      iZzv = zzmh.zzw(i16, (List) unsafe2.getObject(t, j2), false);
/* 2126 */                      iZzb3 += iZzv;
/* 2127 */                      i3 = i4;
/* 1395 */                      z = false;
                                break;
                            case 24:
/* 2243 */                      i4 = 0;
/* 2250 */                      iZzv = zzmh.zzv(i16, (List) unsafe2.getObject(t, j2), false);
/* 2126 */                      iZzb3 += iZzv;
/* 2127 */                      i3 = i4;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 2237 */                      i4 = 0;
/* 2238 */                      iZzv = zzmh.zzx(i16, (List) unsafe2.getObject(t, j2), false);
/* 2126 */                      iZzb3 += iZzv;
/* 2127 */                      i3 = i4;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 2225 */                      iZzc2 = zzmh.zzc(i16, (List) unsafe2.getObject(t, j2));
/* 1519 */                      iZzb3 += iZzc2;
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 2213 */                      iZzc2 = zzmh.zzc(i16, (List<?>) unsafe2.getObject(t, j2), zzap(i14));
/* 1519 */                      iZzb3 += iZzc2;
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_28 /* 28 */:
/* 2197 */                      iZzc2 = zzmh.zzd(i16, (List<zzjc>) unsafe2.getObject(t, j2));
/* 1519 */                      iZzb3 += iZzc2;
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_29 /* 29 */:
/* 2185 */                      iZzc2 = zzmh.zzt(i16, (List) unsafe2.getObject(t, j2), false);
/* 1519 */                      iZzb3 += iZzc2;
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_30 /* 30 */:
/* 2166 */                      i4 = 0;
/* 2173 */                      iZzv = zzmh.zzr(i16, (List) unsafe2.getObject(t, j2), false);
/* 2126 */                      iZzb3 += iZzv;
/* 2127 */                      i3 = i4;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_31 /* 31 */:
/* 2154 */                      i4 = 0;
/* 2161 */                      iZzv = zzmh.zzv(i16, (List) unsafe2.getObject(t, j2), false);
/* 2126 */                      iZzb3 += iZzv;
/* 2127 */                      i3 = i4;
/* 1395 */                      z = false;
                                break;
                            case 32:
/* 2142 */                      i4 = 0;
/* 2149 */                      iZzv = zzmh.zzw(i16, (List) unsafe2.getObject(t, j2), false);
/* 2126 */                      iZzb3 += iZzv;
/* 2127 */                      i3 = i4;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
/* 2130 */                      i4 = 0;
/* 2137 */                      iZzv = zzmh.zzu(i16, (List) unsafe2.getObject(t, j2), false);
/* 2126 */                      iZzb3 += iZzv;
/* 2127 */                      i3 = i4;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
/* 2121 */                      i4 = 0;
/* 2122 */                      iZzv = zzmh.zzq(i16, (List) unsafe2.getObject(t, j2), false);
/* 2126 */                      iZzb3 += iZzv;
/* 2127 */                      i3 = i4;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_35 /* 35 */:
/* 2091 */                      int iZzi4 = zzmh.zzi((List) unsafe2.getObject(t, j2));
/* 2095 */                      if (iZzi4 > 0) {
/* 2099 */                          if (this.zzul) {
/* 2102 */                              unsafe2.putInt(t, i, iZzi4);
                                    }
/* 2109 */                          iZzb3 = pm2.m7484g(iZzi4, zzjr.zzab(i16), iZzi4, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case Build.API_LEVELS.API_36 /* 36 */:
/* 2061 */                      int iZzh4 = zzmh.zzh((List) unsafe2.getObject(t, j2));
/* 2065 */                      if (iZzh4 > 0) {
/* 2069 */                          if (this.zzul) {
/* 2072 */                              unsafe2.putInt(t, i, iZzh4);
                                    }
/* 2079 */                          iZzb3 = pm2.m7484g(iZzh4, zzjr.zzab(i16), iZzh4, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 37:
/* 2031 */                      int iZza2 = zzmh.zza((List) unsafe2.getObject(t, j2));
/* 2035 */                      if (iZza2 > 0) {
/* 2039 */                          if (this.zzul) {
/* 2042 */                              unsafe2.putInt(t, i, iZza2);
                                    }
/* 2049 */                          iZzb3 = pm2.m7484g(iZza2, zzjr.zzab(i16), iZza2, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 38:
/* 2001 */                      int iZzb4 = zzmh.zzb((List) unsafe2.getObject(t, j2));
/* 2005 */                      if (iZzb4 > 0) {
/* 2009 */                          if (this.zzul) {
/* 2012 */                              unsafe2.putInt(t, i, iZzb4);
                                    }
/* 2019 */                          iZzb3 = pm2.m7484g(iZzb4, zzjr.zzab(i16), iZzb4, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 39:
/* 1971 */                      int iZze2 = zzmh.zze((List) unsafe2.getObject(t, j2));
/* 1975 */                      if (iZze2 > 0) {
/* 1979 */                          if (this.zzul) {
/* 1982 */                              unsafe2.putInt(t, i, iZze2);
                                    }
/* 1989 */                          iZzb3 = pm2.m7484g(iZze2, zzjr.zzab(i16), iZze2, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
/* 1941 */                      int iZzi5 = zzmh.zzi((List) unsafe2.getObject(t, j2));
/* 1945 */                      if (iZzi5 > 0) {
/* 1949 */                          if (this.zzul) {
/* 1952 */                              unsafe2.putInt(t, i, iZzi5);
                                    }
/* 1959 */                          iZzb3 = pm2.m7484g(iZzi5, zzjr.zzab(i16), iZzi5, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
/* 1911 */                      int iZzh5 = zzmh.zzh((List) unsafe2.getObject(t, j2));
/* 1915 */                      if (iZzh5 > 0) {
/* 1919 */                          if (this.zzul) {
/* 1922 */                              unsafe2.putInt(t, i, iZzh5);
                                    }
/* 1929 */                          iZzb3 = pm2.m7484g(iZzh5, zzjr.zzab(i16), iZzh5, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 42:
/* 1881 */                      int iZzj2 = zzmh.zzj((List) unsafe2.getObject(t, j2));
/* 1885 */                      if (iZzj2 > 0) {
/* 1889 */                          if (this.zzul) {
/* 1892 */                              unsafe2.putInt(t, i, iZzj2);
                                    }
/* 1899 */                          iZzb3 = pm2.m7484g(iZzj2, zzjr.zzab(i16), iZzj2, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 43:
/* 1851 */                      int iZzf2 = zzmh.zzf((List<Integer>) unsafe2.getObject(t, j2));
/* 1855 */                      if (iZzf2 > 0) {
/* 1859 */                          if (this.zzul) {
/* 1862 */                              unsafe2.putInt(t, i, iZzf2);
                                    }
/* 1869 */                          iZzb3 = pm2.m7484g(iZzf2, zzjr.zzab(i16), iZzf2, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 44:
/* 1821 */                      int iZzd3 = zzmh.zzd((List) unsafe2.getObject(t, j2));
/* 1825 */                      if (iZzd3 > 0) {
/* 1829 */                          if (this.zzul) {
/* 1832 */                              unsafe2.putInt(t, i, iZzd3);
                                    }
/* 1839 */                          iZzb3 = pm2.m7484g(iZzd3, zzjr.zzab(i16), iZzd3, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 45:
/* 1791 */                      int iZzh6 = zzmh.zzh((List) unsafe2.getObject(t, j2));
/* 1795 */                      if (iZzh6 > 0) {
/* 1799 */                          if (this.zzul) {
/* 1802 */                              unsafe2.putInt(t, i, iZzh6);
                                    }
/* 1809 */                          iZzb3 = pm2.m7484g(iZzh6, zzjr.zzab(i16), iZzh6, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 46:
/* 1761 */                      int iZzi6 = zzmh.zzi((List) unsafe2.getObject(t, j2));
/* 1765 */                      if (iZzi6 > 0) {
/* 1769 */                          if (this.zzul) {
/* 1772 */                              unsafe2.putInt(t, i, iZzi6);
                                    }
/* 1779 */                          iZzb3 = pm2.m7484g(iZzi6, zzjr.zzab(i16), iZzi6, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 47:
/* 1731 */                      int iZzg2 = zzmh.zzg((List<Integer>) unsafe2.getObject(t, j2));
/* 1735 */                      if (iZzg2 > 0) {
/* 1739 */                          if (this.zzul) {
/* 1742 */                              unsafe2.putInt(t, i, iZzg2);
                                    }
/* 1749 */                          iZzb3 = pm2.m7484g(iZzg2, zzjr.zzab(i16), iZzg2, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 48:
/* 1701 */                      int iZzc5 = zzmh.zzc((List) unsafe2.getObject(t, j2));
/* 1705 */                      if (iZzc5 > 0) {
/* 1709 */                          if (this.zzul) {
/* 1712 */                              unsafe2.putInt(t, i, iZzc5);
                                    }
/* 1719 */                          iZzb3 = pm2.m7484g(iZzc5, zzjr.zzab(i16), iZzc5, iZzb3);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 49:
/* 1689 */                      iZzc2 = zzmh.zzd(i16, (List) unsafe2.getObject(t, j2), zzap(i14));
/* 1519 */                      iZzb3 += iZzc2;
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 1673 */                      iZzc2 = this.zzut.zzb(i16, unsafe2.getObject(t, j2), zzaq(i14));
/* 1519 */                      iZzb3 += iZzc2;
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 51:
/* 1652 */                      if (zza(t, i16, i14)) {
/* 1660 */                          iZzb3 += zzjr.zzb(i16, 0.0d);
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 52:
/* 1639 */                      if (zza(t, i16, i14)) {
/* 1642 */                          iZzk = zzjr.zzb(i16, 0.0f);
/* 1452 */                          iZzb3 += iZzk;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 53:
/* 1623 */                      if (zza(t, i16, i14)) {
/* 1629 */                          iZzc = zzjr.zzd(i16, zzh(t, j2));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 54:
/* 1607 */                      if (zza(t, i16, i14)) {
/* 1613 */                          iZzc = zzjr.zze(i16, zzh(t, j2));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 55:
/* 1591 */                      if (zza(t, i16, i14)) {
/* 1597 */                          iZzc = zzjr.zzg(i16, zzg(t, j2));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 56:
/* 1579 */                      if (zza(t, i16, i14)) {
/* 1581 */                          iZzc = zzjr.zzg(i16, 0L);
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 57:
/* 1567 */                      if (zza(t, i16, i14)) {
/* 1570 */                          iZzk = zzjr.zzj(i16, 0);
/* 1452 */                          iZzb3 += iZzk;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 58:
/* 1555 */                      if (zza(t, i16, i14)) {
/* 1557 */                          iZzc = zzjr.zzc(i16, true);
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 59:
/* 1525 */                      if (zza(t, i16, i14)) {
/* 1527 */                          Object object2 = unsafe2.getObject(t, j2);
/* 1545 */                          iZzc = object2 instanceof zzjc ? zzjr.zzc(i16, (zzjc) object2) : zzjr.zzb(i16, (String) object2);
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 60:
/* 1505 */                      if (zza(t, i16, i14)) {
/* 1515 */                          iZzc2 = zzmh.zzc(i16, unsafe2.getObject(t, j2), zzap(i14));
/* 1519 */                          iZzb3 += iZzc2;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 61:
/* 1488 */                      if (zza(t, i16, i14)) {
/* 1496 */                          iZzc = zzjr.zzc(i16, (zzjc) unsafe2.getObject(t, j2));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 62:
/* 1473 */                      if (zza(t, i16, i14)) {
/* 1479 */                          iZzc = zzjr.zzh(i16, zzg(t, j2));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 63:
/* 1458 */                      if (zza(t, i16, i14)) {
/* 1464 */                          iZzc = zzjr.zzl(i16, zzg(t, j2));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 64:
/* 1445 */                      if (zza(t, i16, i14)) {
/* 1448 */                          iZzk = zzjr.zzk(i16, 0);
/* 1452 */                          iZzb3 += iZzk;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 65:
/* 1434 */                      if (zza(t, i16, i14)) {
/* 1436 */                          iZzc = zzjr.zzh(i16, 0L);
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 66:
/* 1419 */                      if (zza(t, i16, i14)) {
/* 1425 */                          iZzc = zzjr.zzi(i16, zzg(t, j2));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 67:
/* 1404 */                      if (zza(t, i16, i14)) {
/* 1410 */                          iZzc = zzjr.zzf(i16, zzh(t, j2));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            case 68:
/* 1377 */                      if (zza(t, i16, i14)) {
/* 1389 */                          iZzc = zzjr.zzc(i16, (zzlq) unsafe2.getObject(t, j2), zzap(i14));
/* 1393 */                          iZzb3 += iZzc;
                                }
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                            default:
/* 1394 */                      i3 = 0;
/* 1395 */                      z = false;
                                break;
                        }
/* 2593 */              i14 += 3;
/* 2595 */              i7 = i3;
/* 2597 */              i6 = i17;
                    }
/* 2601 */          int iZzb5 = i7;
/* 2608 */          int iZza3 = iZzb3 + zza(this.zzur, t);
/* 2611 */          if (!this.zzui) {
/* 2689 */              return iZza3;
                    }
/* 2615 */          zzkb<T> zzkbVarZzb = this.zzus.zzb(t);
/* 2619 */          int i20 = iZzb5;
                    while (true) {
/* 2622 */              int iZzer = zzkbVarZzb.zzos.zzer();
/* 2626 */              zzmi<FieldDescriptorType, Object> zzmiVar = zzkbVarZzb.zzos;
/* 2628 */              if (i20 >= iZzer) {
/* 2664 */                  for (Map.Entry entry : zzmiVar.zzes()) {
/* 2686 */                      iZzb5 += zzkb.zzb((zzkd<?>) entry.getKey(), entry.getValue());
                            }
/* 2688 */                  return iZza3 + iZzb5;
                        }
/* 2630 */              Map.Entry entryZzaw = zzmiVar.zzaw(i20);
/* 2648 */              iZzb5 += zzkb.zzb((zzkd<?>) entryZzaw.getKey(), entryZzaw.getValue());
/* 2649 */              i20++;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
                /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
                /* JADX WARN: Code duplicated, block: B:57:0x00e7 A[LOOP:2: B:52:0x00d6->B:57:0x00e7, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:74:0x00e6 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:81:0x00fb A[SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.drive.zzmf] */
                /* JADX WARN: Type inference failed for: r5v16 */
                /* JADX WARN: Type inference failed for: r5v17 */
                /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.drive.zzmf] */
                /* JADX WARN: Type inference failed for: r5v22 */
                /* JADX WARN: Type inference failed for: r5v23 */
                @Override // com.google.android.gms.internal.drive.zzmf
                public final boolean zzp(T t) {
                    int i;
                    List list;
                    ?? Zzap;
                    int i2;
/* 1 */             int i3 = -1;
/* 4 */             int i4 = 0;
/* 8 */             for (int i5 = 0; i5 < this.zzun; i5++) {
/* 12 */                int i6 = this.zzum[i5];
/* 16 */                int i7 = this.zzud[i6];
/* 18 */                int iZzas = zzas(i6);
/* 27 */                if (this.zzuk) {
/* 51 */                    i = 0;
                        } else {
/* 33 */                    int i8 = this.zzud[i6 + 2];
/* 35 */                    int i9 = i8 & 1048575;
/* 39 */                    i = 1 << (i8 >>> 20);
/* 40 */                    if (i9 != i3) {
/* 45 */                        i4 = zzuc.getInt(t, i9);
/* 49 */                        i3 = i9;
                            }
                        }
/* 55 */                if ((268435456 & iZzas) != 0 && !zza(t, i6, i4, i)) {
/* 2 */                     return false;
                        }
/* 67 */                int i10 = (267386880 & iZzas) >>> 20;
/* 71 */                if (i10 == 9 || i10 == 17) {
/* 239 */                   if (zza(t, i6, i4, i) && !zza(t, iZzas, zzap(i6))) {
/* 2 */                         return false;
                            }
                        } else if (i10 == 27) {
/* 202 */                   list = (List) zznd.zzo(t, iZzas & 1048575);
/* 208 */                   if (list.isEmpty()) {
                                continue;
                            } else {
/* 210 */                       Zzap = zzap(i6);
/* 219 */                       for (i2 = 0; i2 < list.size(); i2++) {
/* 229 */                           if (!Zzap.zzp(list.get(i2))) {
/* 2 */                                 return false;
                                    }
                                }
                            }
                        } else if (i10 == 60 || i10 == 68) {
/* 182 */                   if (zza(t, i7, i6) && !zza(t, iZzas, zzap(i6))) {
/* 2 */                         return false;
                            }
                        } else if (i10 == 49) {
/* 202 */                   list = (List) zznd.zzo(t, iZzas & 1048575);
/* 208 */                   if (list.isEmpty()) {
/* 210 */                       Zzap = zzap(i6);
/* 219 */                       while (i2 < list.size()) {
/* 229 */                           if (!Zzap.zzp(list.get(i2))) {
/* 2 */                                 return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (i10 != 50) {
                            continue;
                        } else {
/* 108 */                   Map<?, ?> mapZzi = this.zzut.zzi(zznd.zzo(t, iZzas & 1048575));
/* 116 */                   if (mapZzi.isEmpty()) {
                                continue;
                            } else if (this.zzut.zzm(zzaq(i6)).zztw.zzfj() == zznr.MESSAGE) {
/* 146 */                       ?? Zzf = 0;
/* 151 */                       for (Object obj : mapZzi.values()) {
/* 157 */                           if (Zzf == 0) {
                                        Zzf = Zzf;
/* 167 */                               Zzf = zzmd.zzej().zzf(obj.getClass());
                                    }
                                    Zzf = Zzf;
/* 175 */                           if (!Zzf.zzp(obj)) {
/* 2 */                                 return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return !this.zzui || this.zzus.zzb(t).isInitialized();
                }

/* 68 */        private static <E> List<E> zzd(Object obj, long j) {
/* 69 */            return (List) zznd.zzo(obj, j);
                }

/* 273 */       private final int zzp(int i, int i2) {
/* 274 */           if (i < this.zzuf || i > this.zzug) {
                        return -1;
                    }
/* 275 */           return zzq(i, i2);
                }

/* 406 */       private final boolean zzc(T t, T t2, int i) {
                    return zza(t, i) == zza(t2, i);
                }

/* 1208 */      private final void zzb(T t, T t2, int i) {
/* 1209 */          int iZzas = zzas(i);
/* 1210 */          int i2 = this.zzud[i];
                    long j = iZzas & 1048575;
/* 1211 */          if (zza(t2, i2, i)) {
/* 1212 */              Object objZzo = zznd.zzo(t, j);
/* 1213 */              Object objZzo2 = zznd.zzo(t2, j);
                        if (objZzo != null && objZzo2 != null) {
/* 1215 */                  zznd.zza(t, j, zzkm.zza(objZzo, objZzo2));
/* 1216 */                  zzb(t, i2, i);
                        } else if (objZzo2 != null) {
/* 1217 */                  zznd.zza(t, j, objZzo2);
/* 1218 */                  zzb(t, i2, i);
                        }
                    }
                }

/* 1218 */      private final void zzb(T t, int i) {
/* 1219 */          if (this.zzuk) {
                        return;
                    }
/* 1220 */          int iZzat = zzat(i);
                    long j = iZzat & 1048575;
/* 1222 */          zznd.zza((Object) t, j, zznd.zzj(t, j) | (1 << (iZzat >>> 20)));
                }

/* 1222 */      private final void zzb(T t, int i, int i2) {
/* 1224 */          zznd.zza((Object) t, zzat(i2) & 1048575, i);
                }

/* 2632 */      private static Field zza(Class<?> cls, String str) {
                    try {
/* 2633 */              return cls.getDeclaredField(str);
                    } catch (NoSuchFieldException unused) {
/* 2634 */              Field[] declaredFields = cls.getDeclaredFields();
                        for (Field field : declaredFields) {
/* 2636 */                  if (str.equals(field.getName())) {
                                return field;
                            }
                        }
/* 2637 */              String name = cls.getName();
/* 2638 */              String string = Arrays.toString(declaredFields);
                        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + name.length() + String.valueOf(str).length() + 40);
                        sb.append("Field ");
                        sb.append(str);
                        sb.append(" for ");
                        sb.append(name);
/* 2640 */              f42.m3663s(fm0.m3789o(sb, " not found. Known fields are ", string));
                        return null;
                    }
                }

/* 2640 */      private final void zza(T t, T t2, int i) {
/* 2641 */          long jZzas = zzas(i) & 1048575;
/* 2642 */          if (zza(t2, i)) {
/* 2643 */              Object objZzo = zznd.zzo(t, jZzas);
/* 2644 */              Object objZzo2 = zznd.zzo(t2, jZzas);
                        if (objZzo != null && objZzo2 != null) {
/* 2646 */                  zznd.zza(t, jZzas, zzkm.zza(objZzo, objZzo2));
/* 2647 */                  zzb(t, i);
                        } else if (objZzo2 != null) {
/* 2648 */                  zznd.zza(t, jZzas, objZzo2);
/* 2649 */                  zzb(t, i);
                        }
                    }
                }

/* 2649 */      private static <UT, UB> int zza(zzmx<UT, UB> zzmxVar, T t) {
/* 2651 */          return zzmxVar.zzn(zzmxVar.zzr(t));
                }

                /* JADX WARN: Code duplicated, block: B:169:0x036e  */
                /* JADX WARN: Code duplicated, block: B:171:0x0372  */
                /* JADX WARN: Code duplicated, block: B:173:0x037d  */
                /* JADX WARN: Code duplicated, block: B:176:0x0389 A[LOOP:6: B:174:0x0381->B:176:0x0389, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:179:0x0399  */
                /* JADX WARN: Code duplicated, block: B:182:0x03a8  */
                /* JADX WARN: Code duplicated, block: B:183:0x03ab  */
                /* JADX WARN: Code duplicated, block: B:185:0x03bb  */
                /* JADX WARN: Code duplicated, block: B:186:0x03be  */
                /* JADX WARN: Code duplicated, block: B:190:0x03c8  */
                /* JADX WARN: Code duplicated, block: B:193:0x03d8  */
                /* JADX WARN: Code duplicated, block: B:215:0x0393 A[EDGE_INSN: B:215:0x0393->B:177:0x0393 BREAK  A[LOOP:6: B:174:0x0381->B:176:0x0389], SYNTHETIC] */
/* 2651 */      public static <T> zzlu<T> zza(Class<T> cls, zzlo zzloVar, zzly zzlyVar, zzla zzlaVar, zzmx<?, ?> zzmxVar, zzjy<?> zzjyVar, zzll zzllVar) {
                    int i;
                    int iCharAt;
                    int i2;
                    int i3;
                    int[] iArr;
                    int i4;
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
                    int i20;
                    int iObjectFieldOffset;
                    int i21;
                    int i22;
                    int iObjectFieldOffset2;
                    int i23;
                    int i24;
                    int i25;
                    int iCharAt2;
                    int i26;
                    Object obj;
                    Field fieldZza;
                    int i27;
                    int i28;
                    char cCharAt9;
                    int i29;
                    Field fieldZza2;
                    Field fieldZza3;
                    int i30;
                    int i31;
                    char cCharAt10;
                    int i32;
                    char cCharAt11;
                    int i33;
                    int i34;
                    char cCharAt12;
                    int i35;
                    char cCharAt13;
                    char cCharAt14;
/* 2652 */          if (zzloVar instanceof zzme) {
/* 2653 */              zzme zzmeVar = (zzme) zzloVar;
                        int i36 = 0;
/* 2654 */              boolean z = zzmeVar.zzec() == zzkk.zze.zzsg;
/* 2655 */              String strZzek = zzmeVar.zzek();
/* 2656 */              int length = strZzek.length();
/* 2657 */              int iCharAt3 = strZzek.charAt(0);
                        if (iCharAt3 >= 55296) {
                            int i37 = iCharAt3 & 8191;
                            int i38 = 1;
                            int i39 = 13;
                            while (true) {
                                i = i38 + 1;
/* 2658 */                      cCharAt14 = strZzek.charAt(i38);
                                if (cCharAt14 < 55296) {
                                    break;
                                }
                                i37 |= (cCharAt14 & 8191) << i39;
                                i39 += 13;
                                i38 = i;
                            }
                            iCharAt3 = i37 | (cCharAt14 << i39);
                        } else {
                            i = 1;
                        }
                        int i40 = i + 1;
/* 2659 */              int iCharAt4 = strZzek.charAt(i);
                        if (iCharAt4 >= 55296) {
                            int i41 = iCharAt4 & 8191;
                            int i42 = 13;
                            while (true) {
                                i35 = i40 + 1;
/* 2660 */                      cCharAt13 = strZzek.charAt(i40);
                                if (cCharAt13 < 55296) {
                                    break;
                                }
                                i41 |= (cCharAt13 & 8191) << i42;
                                i42 += 13;
                                i40 = i35;
                            }
                            iCharAt4 = i41 | (cCharAt13 << i42);
                            i40 = i35;
                        }
                        if (iCharAt4 == 0) {
                            i4 = 0;
                            iCharAt = 0;
                            i6 = 0;
                            i7 = 0;
                            i3 = 0;
/* 2661 */                  iArr = zzub;
                            i5 = 0;
                        } else {
                            int i43 = i40 + 1;
/* 2662 */                  int iCharAt5 = strZzek.charAt(i40);
                            if (iCharAt5 >= 55296) {
                                int i44 = iCharAt5 & 8191;
                                int i45 = 13;
                                while (true) {
                                    i15 = i43 + 1;
/* 2663 */                          cCharAt8 = strZzek.charAt(i43);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i44 |= (cCharAt8 & 8191) << i45;
                                    i45 += 13;
                                    i43 = i15;
                                }
                                iCharAt5 = i44 | (cCharAt8 << i45);
                                i43 = i15;
                            }
                            int i46 = i43 + 1;
/* 2664 */                  int iCharAt6 = strZzek.charAt(i43);
                            if (iCharAt6 >= 55296) {
                                int i47 = iCharAt6 & 8191;
                                int i48 = 13;
                                while (true) {
                                    i14 = i46 + 1;
/* 2665 */                          cCharAt7 = strZzek.charAt(i46);
                                    if (cCharAt7 < 55296) {
                                        break;
                                    }
                                    i47 |= (cCharAt7 & 8191) << i48;
                                    i48 += 13;
                                    i46 = i14;
                                }
                                iCharAt6 = i47 | (cCharAt7 << i48);
                                i46 = i14;
                            }
                            int i49 = i46 + 1;
/* 2666 */                  iCharAt = strZzek.charAt(i46);
                            if (iCharAt >= 55296) {
                                int i50 = iCharAt & 8191;
                                int i51 = 13;
                                while (true) {
                                    i13 = i49 + 1;
/* 2667 */                          cCharAt6 = strZzek.charAt(i49);
                                    if (cCharAt6 < 55296) {
                                        break;
                                    }
                                    i50 |= (cCharAt6 & 8191) << i51;
                                    i51 += 13;
                                    i49 = i13;
                                }
                                iCharAt = i50 | (cCharAt6 << i51);
                                i49 = i13;
                            }
                            int i52 = i49 + 1;
/* 2668 */                  int iCharAt7 = strZzek.charAt(i49);
                            if (iCharAt7 >= 55296) {
                                int i53 = iCharAt7 & 8191;
                                int i54 = 13;
                                while (true) {
                                    i12 = i52 + 1;
/* 2669 */                          cCharAt5 = strZzek.charAt(i52);
                                    if (cCharAt5 < 55296) {
                                        break;
                                    }
                                    i53 |= (cCharAt5 & 8191) << i54;
                                    i54 += 13;
                                    i52 = i12;
                                }
                                iCharAt7 = i53 | (cCharAt5 << i54);
                                i52 = i12;
                            }
                            int i55 = i52 + 1;
/* 2670 */                  int iCharAt8 = strZzek.charAt(i52);
                            if (iCharAt8 >= 55296) {
                                int i56 = iCharAt8 & 8191;
                                int i57 = 13;
                                while (true) {
                                    i11 = i55 + 1;
/* 2671 */                          cCharAt4 = strZzek.charAt(i55);
                                    if (cCharAt4 < 55296) {
                                        break;
                                    }
                                    i56 |= (cCharAt4 & 8191) << i57;
                                    i57 += 13;
                                    i55 = i11;
                                }
                                iCharAt8 = i56 | (cCharAt4 << i57);
                                i55 = i11;
                            }
                            int i58 = i55 + 1;
/* 2672 */                  int iCharAt9 = strZzek.charAt(i55);
                            if (iCharAt9 >= 55296) {
                                int i59 = iCharAt9 & 8191;
                                int i60 = 13;
                                while (true) {
                                    i10 = i58 + 1;
/* 2673 */                          cCharAt3 = strZzek.charAt(i58);
                                    if (cCharAt3 < 55296) {
                                        break;
                                    }
                                    i59 |= (cCharAt3 & 8191) << i60;
                                    i60 += 13;
                                    i58 = i10;
                                }
                                iCharAt9 = i59 | (cCharAt3 << i60);
                                i58 = i10;
                            }
                            int i61 = i58 + 1;
/* 2674 */                  int iCharAt10 = strZzek.charAt(i58);
                            if (iCharAt10 >= 55296) {
                                int i62 = iCharAt10 & 8191;
                                int i63 = i61;
                                int i64 = 13;
                                while (true) {
                                    i9 = i63 + 1;
/* 2675 */                          cCharAt2 = strZzek.charAt(i63);
                                    if (cCharAt2 < 55296) {
                                        break;
                                    }
                                    i62 |= (cCharAt2 & 8191) << i64;
                                    i64 += 13;
                                    i63 = i9;
                                }
                                iCharAt10 = i62 | (cCharAt2 << i64);
                                i2 = i9;
                            } else {
                                i2 = i61;
                            }
                            int i65 = i2 + 1;
/* 2676 */                  int iCharAt11 = strZzek.charAt(i2);
                            if (iCharAt11 >= 55296) {
                                int i66 = iCharAt11 & 8191;
                                int i67 = i65;
                                int i68 = 13;
                                while (true) {
                                    i8 = i67 + 1;
/* 2677 */                          cCharAt = strZzek.charAt(i67);
                                    if (cCharAt < 55296) {
                                        break;
                                    }
                                    i66 |= (cCharAt & 8191) << i68;
                                    i68 += 13;
                                    i67 = i8;
                                }
                                iCharAt11 = i66 | (cCharAt << i68);
                                i65 = i8;
                            }
/* 2678 */                  int[] iArr2 = new int[iCharAt11 + iCharAt9 + iCharAt10];
                            i3 = (iCharAt5 << 1) + iCharAt6;
                            int i69 = iCharAt8;
                            iArr = iArr2;
                            i4 = i69;
                            i5 = iCharAt7;
                            i6 = iCharAt9;
                            i7 = iCharAt11;
                            i36 = iCharAt5;
                            i40 = i65;
                        }
                        int i70 = 1;
/* 2679 */              Unsafe unsafe = zzuc;
/* 2680 */              Object[] objArrZzel = zzmeVar.zzel();
/* 2681 */              Class<?> cls2 = zzmeVar.zzee().getClass();
/* 2682 */              int[] iArr3 = new int[i4 * 3];
/* 2683 */              Object[] objArr = new Object[i4 << 1];
                        int i71 = i6 + i7;
                        int i72 = i71;
                        int i73 = i7;
                        int i74 = 0;
                        int i75 = 0;
                        while (i40 < length) {
                            int i76 = i40 + 1;
/* 2684 */                  int iCharAt12 = strZzek.charAt(i40);
                            int[] iArr4 = iArr3;
                            if (iCharAt12 >= 55296) {
                                int i77 = iCharAt12 & 8191;
                                int i78 = i76;
                                int i79 = 13;
                                while (true) {
                                    i34 = i78 + 1;
/* 2685 */                          cCharAt12 = strZzek.charAt(i78);
                                    i16 = length;
                                    if (cCharAt12 < 55296) {
                                        break;
                                    }
                                    i77 |= (cCharAt12 & 8191) << i79;
                                    i79 += 13;
                                    i78 = i34;
                                    length = i16;
                                }
                                iCharAt12 = i77 | (cCharAt12 << i79);
                                i17 = i34;
                            } else {
                                i16 = length;
                                i17 = i76;
                            }
                            int i80 = i17 + 1;
/* 2686 */                  int iCharAt13 = strZzek.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i81 = iCharAt13 & 8191;
                                int i82 = i80;
                                int i83 = 13;
                                while (true) {
                                    i32 = i82 + 1;
/* 2687 */                          cCharAt11 = strZzek.charAt(i82);
                                    i33 = i81;
                                    if (cCharAt11 < 55296) {
                                        break;
                                    }
                                    i81 = i33 | ((cCharAt11 & 8191) << i83);
                                    i83 += 13;
                                    i82 = i32;
                                }
                                iCharAt13 = i33 | (cCharAt11 << i83);
                                i18 = i32;
                            } else {
                                i18 = i80;
                            }
                            int i84 = i36;
                            int i85 = iCharAt13 & 255;
                            int i86 = iCharAt3;
                            if ((iCharAt13 & Segment.SHARE_MINIMUM) != 0) {
/* 2688 */                      iArr[i74] = i75;
                                i74++;
                            }
                            Object[] objArr2 = objArr;
                            if (i85 >= 51) {
                                int i87 = i18 + 1;
/* 2689 */                      int iCharAt14 = strZzek.charAt(i18);
                                char c = 55296;
                                if (iCharAt14 >= 55296) {
                                    int i88 = iCharAt14 & 8191;
                                    int i89 = 13;
                                    while (true) {
                                        i31 = i87 + 1;
/* 2690 */                              cCharAt10 = strZzek.charAt(i87);
                                        if (cCharAt10 < c) {
                                            break;
                                        }
                                        i88 |= (cCharAt10 & 8191) << i89;
                                        i89 += 13;
                                        i87 = i31;
                                        c = 55296;
                                    }
                                    iCharAt14 = i88 | (cCharAt10 << i89);
                                    i87 = i31;
                                }
                                int i90 = i85 - 51;
                                int i91 = iCharAt14;
                                if (i90 == 9 || i90 == 17) {
/* 2692 */                          objArr2[((i75 / 3) << 1) + 1] = objArrZzel[i3];
                                    i3++;
                                } else if (i90 == 12 && (i86 & 1) == (i30 = i70)) {
/* 2691 */                          objArr2[((i75 / 3) << i30) + i30] = objArrZzel[i3];
                                    i3++;
                                }
                                int i92 = i91 << 1;
/* 2693 */                      Object obj2 = objArrZzel[i92];
/* 2694 */                      if (obj2 instanceof Field) {
/* 2695 */                          fieldZza2 = (Field) obj2;
                                } else {
/* 2696 */                          fieldZza2 = zza(cls2, (String) obj2);
/* 2697 */                          objArrZzel[i92] = fieldZza2;
                                }
                                int i93 = i87;
/* 2698 */                      int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZza2);
                                int i94 = i92 + 1;
/* 2699 */                      Object obj3 = objArrZzel[i94];
/* 2700 */                      if (obj3 instanceof Field) {
/* 2701 */                          fieldZza3 = (Field) obj3;
                                } else {
/* 2702 */                          fieldZza3 = zza(cls2, (String) obj3);
/* 2703 */                          objArrZzel[i94] = fieldZza3;
                                }
                                i23 = i3;
                                i24 = iObjectFieldOffset3;
                                i70 = 1;
                                i5 = i5;
                                i21 = i93;
                                i19 = iCharAt12;
/* 2704 */                      iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza3);
                                i22 = 0;
                            } else {
                                int i95 = i3 + 1;
/* 2705 */                      Field fieldZza4 = zza(cls2, (String) objArrZzel[i3]);
                                if (i85 == 9 || i85 == 17) {
                                    i19 = iCharAt12;
/* 2711 */                          objArr2[((i75 / 3) << 1) + 1] = fieldZza4.getType();
                                } else {
                                    if (i85 == 27 || i85 == 49) {
                                        i19 = iCharAt12;
                                        i29 = i3 + 2;
/* 2710 */                              objArr2[((i75 / 3) << 1) + 1] = objArrZzel[i95];
                                    } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                                        i19 = iCharAt12;
                                        if ((i86 & 1) == 1) {
                                            i29 = i3 + 2;
/* 2709 */                                  objArr2[((i75 / 3) << 1) + 1] = objArrZzel[i95];
                                        }
/* 2712 */                              iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                                        if ((i86 & 1) == 1) {
                                            if (i85 <= 17) {
                                                i25 = i18 + 1;
/* 2713 */                                      iCharAt2 = strZzek.charAt(i18);
                                                if (iCharAt2 >= 55296) {
                                                    i27 = iCharAt2 & 8191;
                                                    i28 = 13;
                                                    while (true) {
                                                        i21 = i25 + 1;
/* 2714 */                                              cCharAt9 = strZzek.charAt(i25);
                                                        if (cCharAt9 >= 55296) {
                                                            break;
                                                        }
                                                        i27 |= (cCharAt9 & 8191) << i28;
                                                        i28 += 13;
                                                        i25 = i21;
                                                    }
                                                    iCharAt2 = i27 | (cCharAt9 << i28);
                                                } else {
                                                    i21 = i25;
                                                }
                                                i70 = 1;
/* 2715 */                                      i26 = (iCharAt2 / 32) + (i84 << 1);
/* 2716 */                                      obj = objArrZzel[i26];
/* 2717 */                                      if (obj instanceof Field) {
/* 2718 */                                          fieldZza = (Field) obj;
                                                } else {
/* 2719 */                                          fieldZza = zza(cls2, (String) obj);
/* 2720 */                                          objArrZzel[i26] = fieldZza;
                                                }
/* 2721 */                                      iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza);
/* 2722 */                                      i22 = iCharAt2 % 32;
                                            } else {
                                                i70 = 1;
                                            }
                                            if (i85 >= 18 || i85 > 49) {
                                                i23 = i20;
                                                i24 = iObjectFieldOffset;
                                            } else {
/* 2723 */                                      iArr[i72] = iObjectFieldOffset;
                                                i23 = i20;
                                                i24 = iObjectFieldOffset;
                                                i72++;
                                            }
                                        } else {
                                            i70 = 1;
                                        }
                                        i21 = i18;
                                        i22 = 0;
                                        iObjectFieldOffset2 = 0;
                                        if (i85 >= 18) {
                                            i23 = i20;
                                            i24 = iObjectFieldOffset;
                                        } else {
                                            i23 = i20;
                                            i24 = iObjectFieldOffset;
                                        }
                                    } else {
                                        if (i85 == 50) {
                                            int i96 = i73 + 1;
/* 2706 */                                  iArr[i73] = i75;
/* 2707 */                                  int i97 = (i75 / 3) << 1;
                                            int i98 = i3 + 2;
                                            objArr2[i97] = objArrZzel[i95];
                                            if ((iCharAt13 & 2048) != 0) {
                                                i20 = i3 + 3;
/* 2708 */                                      objArr2[i97 + 1] = objArrZzel[i98];
                                                i19 = iCharAt12;
                                                i73 = i96;
                                            } else {
                                                i20 = i98;
                                                i73 = i96;
                                                i19 = iCharAt12;
                                            }
                                        } else {
                                            i19 = iCharAt12;
                                        }
/* 2712 */                              iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                                        if ((i86 & 1) == 1) {
                                            if (i85 <= 17) {
                                                i25 = i18 + 1;
/* 2713 */                                      iCharAt2 = strZzek.charAt(i18);
                                                if (iCharAt2 >= 55296) {
                                                    i27 = iCharAt2 & 8191;
                                                    i28 = 13;
                                                    while (true) {
                                                        i21 = i25 + 1;
/* 2714 */                                              cCharAt9 = strZzek.charAt(i25);
                                                        if (cCharAt9 >= 55296) {
                                                            break;
                                                            break;
                                                        }
                                                        i27 |= (cCharAt9 & 8191) << i28;
                                                        i28 += 13;
                                                        i25 = i21;
                                                    }
                                                    iCharAt2 = i27 | (cCharAt9 << i28);
                                                } else {
                                                    i21 = i25;
                                                }
                                                i70 = 1;
/* 2715 */                                      i26 = (iCharAt2 / 32) + (i84 << 1);
/* 2716 */                                      obj = objArrZzel[i26];
/* 2717 */                                      if (obj instanceof Field) {
/* 2718 */                                          fieldZza = (Field) obj;
                                                } else {
/* 2719 */                                          fieldZza = zza(cls2, (String) obj);
/* 2720 */                                          objArrZzel[i26] = fieldZza;
                                                }
/* 2721 */                                      iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza);
/* 2722 */                                      i22 = iCharAt2 % 32;
                                            } else {
                                                i70 = 1;
                                            }
                                            if (i85 >= 18) {
                                                i23 = i20;
                                                i24 = iObjectFieldOffset;
                                            } else {
                                                i23 = i20;
                                                i24 = iObjectFieldOffset;
                                            }
                                        } else {
                                            i70 = 1;
                                        }
                                        i21 = i18;
                                        i22 = 0;
                                        iObjectFieldOffset2 = 0;
                                        if (i85 >= 18) {
                                            i23 = i20;
                                            i24 = iObjectFieldOffset;
                                        } else {
                                            i23 = i20;
                                            i24 = iObjectFieldOffset;
                                        }
                                    }
                                    i20 = i29;
/* 2712 */                          iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                                    if ((i86 & 1) == 1) {
                                        if (i85 <= 17) {
                                            i25 = i18 + 1;
/* 2713 */                                  iCharAt2 = strZzek.charAt(i18);
                                            if (iCharAt2 >= 55296) {
                                                i27 = iCharAt2 & 8191;
                                                i28 = 13;
                                                while (true) {
                                                    i21 = i25 + 1;
/* 2714 */                                          cCharAt9 = strZzek.charAt(i25);
                                                    if (cCharAt9 >= 55296) {
                                                        break;
                                                        break;
                                                    }
                                                    i27 |= (cCharAt9 & 8191) << i28;
                                                    i28 += 13;
                                                    i25 = i21;
                                                }
                                                iCharAt2 = i27 | (cCharAt9 << i28);
                                            } else {
                                                i21 = i25;
                                            }
                                            i70 = 1;
/* 2715 */                                  i26 = (iCharAt2 / 32) + (i84 << 1);
/* 2716 */                                  obj = objArrZzel[i26];
/* 2717 */                                  if (obj instanceof Field) {
/* 2718 */                                      fieldZza = (Field) obj;
                                            } else {
/* 2719 */                                      fieldZza = zza(cls2, (String) obj);
/* 2720 */                                      objArrZzel[i26] = fieldZza;
                                            }
/* 2721 */                                  iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza);
/* 2722 */                                  i22 = iCharAt2 % 32;
                                        } else {
                                            i70 = 1;
                                        }
                                        if (i85 >= 18) {
                                            i23 = i20;
                                            i24 = iObjectFieldOffset;
                                        } else {
                                            i23 = i20;
                                            i24 = iObjectFieldOffset;
                                        }
                                    } else {
                                        i70 = 1;
                                    }
                                    i21 = i18;
                                    i22 = 0;
                                    iObjectFieldOffset2 = 0;
                                    if (i85 >= 18) {
                                        i23 = i20;
                                        i24 = iObjectFieldOffset;
                                    } else {
                                        i23 = i20;
                                        i24 = iObjectFieldOffset;
                                    }
                                }
                                i20 = i95;
/* 2712 */                      iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                                if ((i86 & 1) == 1) {
                                    if (i85 <= 17) {
                                        i25 = i18 + 1;
/* 2713 */                              iCharAt2 = strZzek.charAt(i18);
                                        if (iCharAt2 >= 55296) {
                                            i27 = iCharAt2 & 8191;
                                            i28 = 13;
                                            while (true) {
                                                i21 = i25 + 1;
/* 2714 */                                      cCharAt9 = strZzek.charAt(i25);
                                                if (cCharAt9 >= 55296) {
                                                    break;
                                                    break;
                                                }
                                                i27 |= (cCharAt9 & 8191) << i28;
                                                i28 += 13;
                                                i25 = i21;
                                            }
                                            iCharAt2 = i27 | (cCharAt9 << i28);
                                        } else {
                                            i21 = i25;
                                        }
                                        i70 = 1;
/* 2715 */                              i26 = (iCharAt2 / 32) + (i84 << 1);
/* 2716 */                              obj = objArrZzel[i26];
/* 2717 */                              if (obj instanceof Field) {
/* 2718 */                                  fieldZza = (Field) obj;
                                        } else {
/* 2719 */                                  fieldZza = zza(cls2, (String) obj);
/* 2720 */                                  objArrZzel[i26] = fieldZza;
                                        }
/* 2721 */                              iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza);
/* 2722 */                              i22 = iCharAt2 % 32;
                                    } else {
                                        i70 = 1;
                                    }
                                    if (i85 >= 18) {
                                        i23 = i20;
                                        i24 = iObjectFieldOffset;
                                    } else {
                                        i23 = i20;
                                        i24 = iObjectFieldOffset;
                                    }
                                } else {
                                    i70 = 1;
                                }
                                i21 = i18;
                                i22 = 0;
                                iObjectFieldOffset2 = 0;
                                if (i85 >= 18) {
                                    i23 = i20;
                                    i24 = iObjectFieldOffset;
                                } else {
                                    i23 = i20;
                                    i24 = iObjectFieldOffset;
                                }
                            }
                            int i99 = i75 + 1;
/* 2724 */                  iArr4[i75] = i19;
                            int i100 = i75 + 2;
                            String str = strZzek;
/* 2725 */                  iArr4[i99] = ((iCharAt13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | ((iCharAt13 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? 536870912 : 0) | (i85 << 20) | i24;
                            i75 += 3;
/* 2726 */                  iArr4[i100] = (i22 << 20) | iObjectFieldOffset2;
                            i5 = i5;
                            i36 = i84;
                            iArr3 = iArr4;
                            iCharAt3 = i86;
                            length = i16;
                            strZzek = str;
                            i40 = i21;
                            i3 = i23;
                            objArr = objArr2;
                        }
/* 2727 */              return new zzlu<>(iArr3, objArr, iCharAt, i5, zzmeVar.zzee(), z, false, iArr, i7, i71, zzlyVar, zzlaVar, zzmxVar, zzjyVar, zzllVar);
                    }
/* 2730 */          ((zzms) zzloVar).zzec();
/* 2731 */          throw new NoSuchMethodError();
                }

/* 2731 */      private final <K, V> void zza(zzns zznsVar, int i, Object obj, int i2) throws IOException {
                    if (obj != null) {
/* 2735 */              zznsVar.zza(i, this.zzut.zzm(zzaq(i2)), this.zzut.zzi(obj));
                    }
                }

/* 2735 */      private static <UT, UB> void zza(zzmx<UT, UB> zzmxVar, T t, zzns zznsVar) throws IOException {
/* 2736 */          zzmxVar.zza(zzmxVar.zzr(t), zznsVar);
                }

/* 2736 */      private static int zza(byte[] bArr, int i, int i2, zznm zznmVar, Class<?> cls, zziz zzizVar) throws IOException {
                    switch (zzlv.zzox[zznmVar.ordinal()]) {
                        case 1:
/* 2755 */                  int iZzb = zziy.zzb(bArr, i, zzizVar);
                            zzizVar.zznm = Boolean.valueOf(zzizVar.zznl != 0);
                            return iZzb;
                        case 2:
/* 2754 */                  return zziy.zze(bArr, i, zzizVar);
                        case 3:
/* 2753 */                  zzizVar.zznm = Double.valueOf(zziy.zzc(bArr, i));
                            return i + 8;
                        case 4:
                        case 5:
/* 2752 */                  zzizVar.zznm = Integer.valueOf(zziy.zza(bArr, i));
                            return i + 4;
                        case 6:
                        case 7:
/* 2751 */                  zzizVar.zznm = Long.valueOf(zziy.zzb(bArr, i));
                            return i + 8;
                        case 8:
/* 2750 */                  zzizVar.zznm = Float.valueOf(zziy.zzd(bArr, i));
                            return i + 4;
                        case 9:
                        case 10:
                        case 11:
/* 2748 */                  int iZza = zziy.zza(bArr, i, zzizVar);
/* 2749 */                  zzizVar.zznm = Integer.valueOf(zzizVar.zznk);
                            return iZza;
                        case 12:
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 2746 */                  int iZzb2 = zziy.zzb(bArr, i, zzizVar);
/* 2747 */                  zzizVar.zznm = Long.valueOf(zzizVar.zznl);
                            return iZzb2;
                        case 14:
/* 2745 */                  return zziy.zza(zzmd.zzej().zzf(cls), bArr, i, i2, zzizVar);
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 2742 */                  int iZza2 = zziy.zza(bArr, i, zzizVar);
/* 2743 */                  zzizVar.zznm = Integer.valueOf(zzjo.zzw(zzizVar.zznk));
                            return iZza2;
                        case 16:
/* 2740 */                  int iZzb3 = zziy.zzb(bArr, i, zzizVar);
/* 2741 */                  zzizVar.zznm = Long.valueOf(zzjo.zzk(zzizVar.zznl));
                            return iZzb3;
                        case 17:
/* 2739 */                  return zziy.zzd(bArr, i, zzizVar);
                        default:
/* 2738 */                  f42.m3663s("unsupported field type.");
                            return 0;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 2756 */      private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zziz zzizVar) throws IOException {
                    int i8;
                    int i9;
                    int iZza;
/* 2757 */          Unsafe unsafe = zzuc;
                    zzkp zzkpVarZzr = (zzkp) unsafe.getObject(t, j2);
/* 2758 */          if (!zzkpVarZzr.zzbo()) {
/* 2759 */              int size = zzkpVarZzr.size();
/* 2760 */              zzkpVarZzr = zzkpVarZzr.zzr(size == 0 ? 10 : size << 1);
/* 2761 */              unsafe.putObject(t, j2, zzkpVarZzr);
                    }
                    zzkp zzkpVar = zzkpVarZzr;
                    switch (i7) {
                        case 18:
                        case Build.API_LEVELS.API_35 /* 35 */:
                            if (i5 == 2) {
/* 2911 */                      zzju zzjuVar = (zzju) zzkpVar;
/* 2912 */                      int iZza2 = zziy.zza(bArr, i, zzizVar);
/* 2913 */                      int i10 = zzizVar.zznk + iZza2;
                                while (iZza2 < i10) {
/* 2914 */                          zzjuVar.zzc(zziy.zzc(bArr, iZza2));
                                    iZza2 += 8;
                                }
                                if (iZza2 == i10) {
                                    return iZza2;
                                }
/* 2915 */                      throw zzkq.zzdi();
                            }
                            if (i5 != 1) {
                                return i;
                            }
/* 2916 */                  zzju zzjuVar2 = (zzju) zzkpVar;
/* 2917 */                  zzjuVar2.zzc(zziy.zzc(bArr, i));
                            int i11 = i + 8;
                            while (i11 < i2) {
/* 2918 */                      int iZza3 = zziy.zza(bArr, i11, zzizVar);
/* 2919 */                      if (i3 != zzizVar.zznk) {
                                    return i11;
                                }
/* 2920 */                      zzjuVar2.zzc(zziy.zzc(bArr, iZza3));
                                i11 = iZza3 + 8;
                            }
                            return i11;
                        case 19:
                        case Build.API_LEVELS.API_36 /* 36 */:
                            if (i5 == 2) {
/* 2901 */                      zzkh zzkhVar = (zzkh) zzkpVar;
/* 2902 */                      int iZza4 = zziy.zza(bArr, i, zzizVar);
/* 2903 */                      int i12 = zzizVar.zznk + iZza4;
                                while (iZza4 < i12) {
/* 2904 */                          zzkhVar.zzc(zziy.zzd(bArr, iZza4));
                                    iZza4 += 4;
                                }
                                if (iZza4 == i12) {
                                    return iZza4;
                                }
/* 2905 */                      throw zzkq.zzdi();
                            }
                            if (i5 != 5) {
                                return i;
                            }
/* 2906 */                  zzkh zzkhVar2 = (zzkh) zzkpVar;
/* 2907 */                  zzkhVar2.zzc(zziy.zzd(bArr, i));
                            int i13 = i + 4;
                            while (i13 < i2) {
/* 2908 */                      int iZza5 = zziy.zza(bArr, i13, zzizVar);
/* 2909 */                      if (i3 != zzizVar.zznk) {
                                    return i13;
                                }
/* 2910 */                      zzkhVar2.zzc(zziy.zzd(bArr, iZza5));
                                i13 = iZza5 + 4;
                            }
                            return i13;
                        case 20:
                        case Build.API_LEVELS.API_21 /* 21 */:
                        case 37:
                        case 38:
                            if (i5 == 2) {
/* 2888 */                      zzle zzleVar = (zzle) zzkpVar;
/* 2889 */                      int iZza6 = zziy.zza(bArr, i, zzizVar);
/* 2890 */                      int i14 = zzizVar.zznk + iZza6;
                                while (iZza6 < i14) {
/* 2891 */                          iZza6 = zziy.zzb(bArr, iZza6, zzizVar);
/* 2892 */                          zzleVar.zzv(zzizVar.zznl);
                                }
                                if (iZza6 == i14) {
                                    return iZza6;
                                }
/* 2893 */                      throw zzkq.zzdi();
                            }
                            if (i5 != 0) {
                                return i;
                            }
/* 2894 */                  zzle zzleVar2 = (zzle) zzkpVar;
/* 2895 */                  int iZzb = zziy.zzb(bArr, i, zzizVar);
/* 2896 */                  zzleVar2.zzv(zzizVar.zznl);
                            while (iZzb < i2) {
/* 2897 */                      int iZza7 = zziy.zza(bArr, iZzb, zzizVar);
/* 2898 */                      if (i3 != zzizVar.zznk) {
                                    return iZzb;
                                }
/* 2899 */                      iZzb = zziy.zzb(bArr, iZza7, zzizVar);
/* 2900 */                      zzleVar2.zzv(zzizVar.zznl);
                            }
                            return iZzb;
                        case Build.API_LEVELS.API_22 /* 22 */:
                        case Build.API_LEVELS.API_29 /* 29 */:
                        case 39:
                        case 43:
                            if (i5 == 2) {
/* 2886 */                      return zziy.zza(bArr, i, (zzkp<?>) zzkpVar, zzizVar);
                            }
                            return i5 == 0 ? zziy.zza(i3, bArr, i, i2, (zzkp<?>) zzkpVar, zzizVar) : i;
                        case Build.API_LEVELS.API_23 /* 23 */:
                        case 32:
                        case RequestError.NETWORK_FAILURE /* 40 */:
                        case 46:
                            if (i5 == 2) {
/* 2876 */                      zzle zzleVar3 = (zzle) zzkpVar;
/* 2877 */                      int iZza8 = zziy.zza(bArr, i, zzizVar);
/* 2878 */                      int i15 = zzizVar.zznk + iZza8;
                                while (iZza8 < i15) {
/* 2879 */                          zzleVar3.zzv(zziy.zzb(bArr, iZza8));
                                    iZza8 += 8;
                                }
                                if (iZza8 == i15) {
                                    return iZza8;
                                }
/* 2880 */                      throw zzkq.zzdi();
                            }
                            if (i5 != 1) {
                                return i;
                            }
/* 2881 */                  zzle zzleVar4 = (zzle) zzkpVar;
/* 2882 */                  zzleVar4.zzv(zziy.zzb(bArr, i));
                            int i16 = i + 8;
                            while (i16 < i2) {
/* 2883 */                      int iZza9 = zziy.zza(bArr, i16, zzizVar);
/* 2884 */                      if (i3 != zzizVar.zznk) {
                                    return i16;
                                }
/* 2885 */                      zzleVar4.zzv(zziy.zzb(bArr, iZza9));
                                i16 = iZza9 + 8;
                            }
                            return i16;
                        case 24:
                        case Build.API_LEVELS.API_31 /* 31 */:
                        case RequestError.NO_DEV_KEY /* 41 */:
                        case 45:
                            if (i5 == 2) {
/* 2866 */                      zzkl zzklVar = (zzkl) zzkpVar;
/* 2867 */                      int iZza10 = zziy.zza(bArr, i, zzizVar);
/* 2868 */                      int i17 = zzizVar.zznk + iZza10;
                                while (iZza10 < i17) {
/* 2869 */                          zzklVar.zzam(zziy.zza(bArr, iZza10));
                                    iZza10 += 4;
                                }
                                if (iZza10 == i17) {
                                    return iZza10;
                                }
/* 2870 */                      throw zzkq.zzdi();
                            }
                            if (i5 != 5) {
                                return i;
                            }
/* 2871 */                  zzkl zzklVar2 = (zzkl) zzkpVar;
/* 2872 */                  zzklVar2.zzam(zziy.zza(bArr, i));
                            int i18 = i + 4;
                            while (i18 < i2) {
/* 2873 */                      int iZza11 = zziy.zza(bArr, i18, zzizVar);
/* 2874 */                      if (i3 != zzizVar.zznk) {
                                    return i18;
                                }
/* 2875 */                      zzklVar2.zzam(zziy.zza(bArr, iZza11));
                                i18 = iZza11 + 4;
                            }
                            return i18;
                        case Build.API_LEVELS.API_25 /* 25 */:
                        case 42:
                            if (i5 == 2) {
/* 2853 */                      zzja zzjaVar = (zzja) zzkpVar;
/* 2854 */                      int iZza12 = zziy.zza(bArr, i, zzizVar);
/* 2855 */                      int i19 = zzizVar.zznk + iZza12;
                                while (iZza12 < i19) {
/* 2856 */                          iZza12 = zziy.zzb(bArr, iZza12, zzizVar);
                                    zzjaVar.addBoolean(zzizVar.zznl != 0);
                                }
                                if (iZza12 == i19) {
                                    return iZza12;
                                }
/* 2858 */                      throw zzkq.zzdi();
                            }
                            if (i5 != 0) {
                                return i;
                            }
/* 2859 */                  zzja zzjaVar2 = (zzja) zzkpVar;
/* 2860 */                  int iZzb2 = zziy.zzb(bArr, i, zzizVar);
                            zzjaVar2.addBoolean(zzizVar.zznl != 0);
                            while (iZzb2 < i2) {
/* 2862 */                      int iZza13 = zziy.zza(bArr, iZzb2, zzizVar);
/* 2863 */                      if (i3 != zzizVar.zznk) {
                                    return iZzb2;
                                }
/* 2864 */                      iZzb2 = zziy.zzb(bArr, iZza13, zzizVar);
                                zzjaVar2.addBoolean(zzizVar.zznl != 0);
                            }
                            return iZzb2;
                        case Build.API_LEVELS.API_26 /* 26 */:
                            if (i5 != 2) {
                                return i;
                            }
                            if ((j & 536870912) == 0) {
/* 2821 */                      int iZza14 = zziy.zza(bArr, i, zzizVar);
/* 2822 */                      int i20 = zzizVar.zznk;
                                if (i20 < 0) {
/* 2834 */                          throw zzkq.zzdj();
                                }
                                if (i20 == 0) {
/* 2823 */                          zzkpVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
/* 2825 */                          zzkpVar.add(new String(bArr, iZza14, i20, zzkm.UTF_8));
                                    iZza14 += i20;
                                }
                                while (iZza14 < i2) {
/* 2826 */                          int iZza15 = zziy.zza(bArr, iZza14, zzizVar);
/* 2827 */                          if (i3 != zzizVar.zznk) {
                                        return iZza14;
                                    }
/* 2828 */                          iZza14 = zziy.zza(bArr, iZza15, zzizVar);
/* 2829 */                          int i21 = zzizVar.zznk;
                                    if (i21 < 0) {
/* 2833 */                              throw zzkq.zzdj();
                                    }
                                    if (i21 == 0) {
/* 2830 */                              zzkpVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                    } else {
/* 2832 */                              zzkpVar.add(new String(bArr, iZza14, i21, zzkm.UTF_8));
                                        iZza14 += i21;
                                    }
                                }
                                return iZza14;
                            }
/* 2835 */                  int iZza16 = zziy.zza(bArr, i, zzizVar);
/* 2836 */                  int i22 = zzizVar.zznk;
                            if (i22 < 0) {
/* 2852 */                      throw zzkq.zzdj();
                            }
                            if (i22 == 0) {
/* 2837 */                      zzkpVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                            } else {
                                int i23 = iZza16 + i22;
/* 2838 */                      if (zznf.zze(bArr, iZza16, i23)) {
/* 2840 */                          zzkpVar.add(new String(bArr, iZza16, i22, zzkm.UTF_8));
                                    iZza16 = i23;
                                } else {
/* 2851 */                          throw zzkq.zzdn();
                                }
                            }
                            while (iZza16 < i2) {
/* 2841 */                      int iZza17 = zziy.zza(bArr, iZza16, zzizVar);
/* 2842 */                      if (i3 != zzizVar.zznk) {
                                    return iZza16;
                                }
/* 2843 */                      iZza16 = zziy.zza(bArr, iZza17, zzizVar);
/* 2844 */                      int i24 = zzizVar.zznk;
                                if (i24 < 0) {
/* 2850 */                          throw zzkq.zzdj();
                                }
                                if (i24 == 0) {
/* 2845 */                          zzkpVar.add(HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
                                    int i25 = iZza16 + i24;
/* 2846 */                          if (zznf.zze(bArr, iZza16, i25)) {
/* 2848 */                              zzkpVar.add(new String(bArr, iZza16, i24, zzkm.UTF_8));
                                        iZza16 = i25;
                                    } else {
/* 2849 */                              throw zzkq.zzdn();
                                    }
                                }
                            }
                            return iZza16;
                        case Build.API_LEVELS.API_27 /* 27 */:
                            i8 = i;
                            if (i5 == 2) {
/* 2819 */                      return zziy.zza(zzap(i6), i3, bArr, i8, i2, zzkpVar, zzizVar);
                            }
                            return i8;
                        case Build.API_LEVELS.API_28 /* 28 */:
                            i8 = i;
                            if (i5 == 2) {
/* 2802 */                      int iZza18 = zziy.zza(bArr, i8, zzizVar);
/* 2803 */                      int i26 = zzizVar.zznk;
                                if (i26 >= 0) {
/* 2804 */                          if (i26 > bArr.length - iZza18) {
/* 2816 */                              throw zzkq.zzdi();
                                    }
                                    if (i26 == 0) {
/* 2805 */                              zzkpVar.add(zzjc.zznq);
                                    } else {
/* 2806 */                              zzkpVar.add(zzjc.zzb(bArr, iZza18, i26));
                                        iZza18 += i26;
                                    }
                                    while (iZza18 < i2) {
/* 2807 */                              int iZza19 = zziy.zza(bArr, iZza18, zzizVar);
/* 2808 */                              if (i3 != zzizVar.zznk) {
                                            return iZza18;
                                        }
/* 2809 */                              iZza18 = zziy.zza(bArr, iZza19, zzizVar);
/* 2810 */                              int i27 = zzizVar.zznk;
                                        if (i27 >= 0) {
/* 2811 */                                  if (i27 > bArr.length - iZza18) {
/* 2814 */                                      throw zzkq.zzdi();
                                            }
                                            if (i27 == 0) {
/* 2812 */                                      zzkpVar.add(zzjc.zznq);
                                            } else {
/* 2813 */                                      zzkpVar.add(zzjc.zzb(bArr, iZza18, i27));
                                                iZza18 += i27;
                                            }
                                        } else {
/* 2815 */                                  throw zzkq.zzdj();
                                        }
                                    }
                                    return iZza18;
                                }
/* 2817 */                      throw zzkq.zzdj();
                            }
                            return i8;
                        case Build.API_LEVELS.API_30 /* 30 */:
                        case 44:
                            i9 = i;
                            if (i5 != 2) {
                                if (i5 == 0) {
/* 2796 */                          iZza = zziy.zza(i3, bArr, i9, i2, (zzkp<?>) zzkpVar, zzizVar);
                                }
                                return i9;
                            }
/* 2795 */                  iZza = zziy.zza(bArr, i9, (zzkp<?>) zzkpVar, zzizVar);
/* 2797 */                  zzkk zzkkVar = (zzkk) t;
                            zzmy zzmyVar = zzkkVar.zzrq;
/* 2798 */                  if (zzmyVar == zzmy.zzfa()) {
                                zzmyVar = null;
                            }
/* 2800 */                  zzmy zzmyVar2 = (zzmy) zzmh.zza(i4, zzkpVar, zzar(i6), zzmyVar, this.zzur);
                            if (zzmyVar2 != null) {
/* 2801 */                      zzkkVar.zzrq = zzmyVar2;
                            }
                            return iZza;
                        case Build.API_LEVELS.API_33 /* 33 */:
                        case 47:
                            i9 = i;
                            if (i5 == 2) {
/* 2782 */                      zzkl zzklVar3 = (zzkl) zzkpVar;
/* 2783 */                      int iZza20 = zziy.zza(bArr, i9, zzizVar);
/* 2784 */                      int i28 = zzizVar.zznk + iZza20;
                                while (iZza20 < i28) {
/* 2785 */                          iZza20 = zziy.zza(bArr, iZza20, zzizVar);
/* 2786 */                          zzklVar3.zzam(zzjo.zzw(zzizVar.zznk));
                                }
                                if (iZza20 == i28) {
                                    return iZza20;
                                }
/* 2787 */                      throw zzkq.zzdi();
                            }
                            if (i5 == 0) {
/* 2788 */                      zzkl zzklVar4 = (zzkl) zzkpVar;
/* 2789 */                      int iZza21 = zziy.zza(bArr, i9, zzizVar);
/* 2790 */                      zzklVar4.zzam(zzjo.zzw(zzizVar.zznk));
                                while (iZza21 < i2) {
/* 2791 */                          int iZza22 = zziy.zza(bArr, iZza21, zzizVar);
/* 2792 */                          if (i3 != zzizVar.zznk) {
                                        return iZza21;
                                    }
/* 2793 */                          iZza21 = zziy.zza(bArr, iZza22, zzizVar);
/* 2794 */                          zzklVar4.zzam(zzjo.zzw(zzizVar.zznk));
                                }
                                return iZza21;
                            }
                            return i9;
                        case Build.API_LEVELS.API_34 /* 34 */:
                        case 48:
                            i9 = i;
                            if (i5 == 2) {
/* 2769 */                      zzle zzleVar5 = (zzle) zzkpVar;
/* 2770 */                      int iZza23 = zziy.zza(bArr, i9, zzizVar);
/* 2771 */                      int i29 = zzizVar.zznk + iZza23;
                                while (iZza23 < i29) {
/* 2772 */                          iZza23 = zziy.zzb(bArr, iZza23, zzizVar);
/* 2773 */                          zzleVar5.zzv(zzjo.zzk(zzizVar.zznl));
                                }
                                if (iZza23 == i29) {
                                    return iZza23;
                                }
/* 2774 */                      throw zzkq.zzdi();
                            }
                            if (i5 == 0) {
/* 2775 */                      zzle zzleVar6 = (zzle) zzkpVar;
/* 2776 */                      int iZzb3 = zziy.zzb(bArr, i9, zzizVar);
/* 2777 */                      zzleVar6.zzv(zzjo.zzk(zzizVar.zznl));
                                while (iZzb3 < i2) {
/* 2778 */                          int iZza24 = zziy.zza(bArr, iZzb3, zzizVar);
/* 2779 */                          if (i3 != zzizVar.zznk) {
                                        return iZzb3;
                                    }
/* 2780 */                          iZzb3 = zziy.zzb(bArr, iZza24, zzizVar);
/* 2781 */                          zzleVar6.zzv(zzjo.zzk(zzizVar.zznl));
                                }
                                return iZzb3;
                            }
                            return i9;
                        case 49:
                            if (i5 == 3) {
/* 2762 */                      zzmf zzmfVarZzap = zzap(i6);
                                int i30 = (i3 & (-8)) | 4;
/* 2763 */                      int iZza25 = zziy.zza(zzmfVarZzap, bArr, i, i2, i30, zzizVar);
                                byte[] bArr2 = bArr;
                                int i31 = i2;
                                int i32 = i30;
                                zziz zzizVar2 = zzizVar;
/* 2764 */                      zzkpVar.add(zzizVar2.zznm);
                                while (iZza25 < i31) {
/* 2765 */                          int iZza26 = zziy.zza(bArr2, iZza25, zzizVar2);
/* 2766 */                          if (i3 != zzizVar2.zznk) {
                                        return iZza25;
                                    }
                                    byte[] bArr3 = bArr2;
                                    int i33 = i32;
                                    int i34 = i31;
                                    zziz zzizVar3 = zzizVar2;
/* 2767 */                          iZza25 = zziy.zza(zzmfVarZzap, bArr3, iZza26, i34, i33, zzizVar3);
/* 2768 */                          zzkpVar.add(zzizVar3.zznm);
                                    i32 = i33;
                                    bArr2 = bArr3;
                                    i31 = i34;
                                    zzizVar2 = zzizVar3;
                                }
                                return iZza25;
                            }
                        default:
                            return i;
                    }
                }

/* 2920 */      private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zziz zzizVar) throws IOException {
                    byte[] bArr2;
                    zziz zzizVar2;
                    int i4;
/* 2921 */          Unsafe unsafe = zzuc;
/* 2922 */          Object objZzaq = zzaq(i3);
/* 2923 */          Object object = unsafe.getObject(t, j);
/* 2924 */          if (this.zzut.zzj(object)) {
/* 2925 */              Object objZzl = this.zzut.zzl(objZzaq);
/* 2926 */              this.zzut.zzb(objZzl, object);
/* 2927 */              unsafe.putObject(t, j, objZzl);
                        object = objZzl;
                    }
/* 2929 */          zzlj<?, ?> zzljVarZzm = this.zzut.zzm(objZzaq);
/* 2930 */          Map<?, ?> mapZzh = this.zzut.zzh(object);
/* 2931 */          int iZza = zziy.zza(bArr, i, zzizVar);
/* 2932 */          int i5 = zzizVar.zznk;
                    if (i5 >= 0 && i5 <= i2 - iZza) {
                        int i6 = i5 + iZza;
/* 2933 */              K k = zzljVarZzm.zztv;
/* 2934 */              V v = zzljVarZzm.zztx;
                        while (iZza < i6) {
                            int iZza2 = iZza + 1;
/* 2935 */                  int i7 = bArr[iZza];
                            if (i7 < 0) {
/* 2936 */                      iZza2 = zziy.zza(i7, bArr, iZza2, zzizVar);
/* 2937 */                      i7 = zzizVar.zznk;
                            }
                            int i8 = iZza2;
                            int i9 = i7 >>> 3;
                            int i10 = i7 & 7;
                            if (i9 != 1) {
/* 2938 */                      if (i9 == 2 && i10 == zzljVarZzm.zztw.zzfk()) {
                                    byte[] bArr3 = bArr;
                                    int i11 = i2;
                                    zziz zzizVar3 = zzizVar;
/* 2941 */                          iZza = zza(bArr3, i8, i11, zzljVarZzm.zztw, zzljVarZzm.zztx.getClass(), zzizVar3);
/* 2942 */                          v = (V) zzizVar3.zznm;
                                    i2 = i11;
                                    bArr = bArr3;
                                } else {
                                    bArr2 = bArr;
                                    i4 = i2;
                                    zzizVar2 = zzizVar;
                                }
                            } else {
                                bArr2 = bArr;
                                int i12 = i2;
                                zzizVar2 = zzizVar;
/* 2943 */                      if (i10 == zzljVarZzm.zztu.zzfk()) {
                                    i4 = i12;
/* 2945 */                          iZza = zza(bArr2, i8, i4, zzljVarZzm.zztu, (Class<?>) null, zzizVar2);
/* 2946 */                          k = zzizVar2.zznm;
                                } else {
                                    i4 = i12;
                                }
                                bArr = bArr2;
                                i2 = i4;
                                zzizVar = zzizVar2;
                            }
/* 2947 */                  iZza = zziy.zza(i7, bArr2, i8, i4, zzizVar2);
                            k = k;
                            bArr = bArr2;
                            i2 = i4;
                            zzizVar = zzizVar2;
                        }
                        if (iZza == i6) {
/* 2948 */                  mapZzh.put(k, v);
                            return i6;
                        }
/* 2949 */              throw zzkq.zzdm();
                    }
/* 2950 */          throw zzkq.zzdi();
                }

/* 2950 */      private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zziz zzizVar) throws IOException {
                    int i9;
                    int i10;
                    int iZzb;
                    Object object;
/* 2951 */          Unsafe unsafe = zzuc;
/* 2952 */          long j2 = this.zzud[i8 + 2] & 1048575;
                    switch (i7) {
                        case 51:
                            i9 = i;
                            if (i5 != 1) {
                                return i9;
                            }
/* 2999 */                  unsafe.putObject(t, j, Double.valueOf(zziy.zzc(bArr, i)));
                            iZzb = i9 + 8;
/* 3000 */                  unsafe.putInt(t, j2, i4);
                            return iZzb;
                        case 52:
                            i10 = i;
                            if (i5 != 5) {
                                return i10;
                            }
/* 2998 */                  unsafe.putObject(t, j, Float.valueOf(zziy.zzd(bArr, i)));
                            iZzb = i10 + 4;
/* 3000 */                  unsafe.putInt(t, j2, i4);
                            return iZzb;
                        case 53:
                        case 54:
                            if (i5 != 0) {
                                return i;
                            }
/* 2996 */                  iZzb = zziy.zzb(bArr, i, zzizVar);
/* 2997 */                  unsafe.putObject(t, j, Long.valueOf(zzizVar.zznl));
/* 3000 */                  unsafe.putInt(t, j2, i4);
                            return iZzb;
                        case 55:
                        case 62:
                            if (i5 != 0) {
                                return i;
                            }
/* 2994 */                  iZzb = zziy.zza(bArr, i, zzizVar);
/* 2995 */                  unsafe.putObject(t, j, Integer.valueOf(zzizVar.zznk));
/* 3000 */                  unsafe.putInt(t, j2, i4);
                            return iZzb;
                        case 56:
                        case 65:
                            i9 = i;
                            if (i5 != 1) {
                                return i9;
                            }
/* 2993 */                  unsafe.putObject(t, j, Long.valueOf(zziy.zzb(bArr, i)));
                            iZzb = i9 + 8;
/* 3000 */                  unsafe.putInt(t, j2, i4);
                            return iZzb;
                        case 57:
                        case 64:
                            i10 = i;
                            if (i5 != 5) {
                                return i10;
                            }
/* 2992 */                  unsafe.putObject(t, j, Integer.valueOf(zziy.zza(bArr, i)));
                            iZzb = i10 + 4;
/* 3000 */                  unsafe.putInt(t, j2, i4);
                            return iZzb;
                        case 58:
                            if (i5 != 0) {
                                return i;
                            }
/* 2990 */                  iZzb = zziy.zzb(bArr, i, zzizVar);
                            unsafe.putObject(t, j, Boolean.valueOf(zzizVar.zznl != 0));
/* 3000 */                  unsafe.putInt(t, j2, i4);
                            return iZzb;
                        case 59:
                            if (i5 != 2) {
                                return i;
                            }
/* 2982 */                  int iZza = zziy.zza(bArr, i, zzizVar);
/* 2983 */                  int i11 = zzizVar.zznk;
                            if (i11 == 0) {
/* 2984 */                      unsafe.putObject(t, j, HttpUrl.FRAGMENT_ENCODE_SET);
                            } else {
/* 2985 */                      if ((i6 & 536870912) != 0 && !zznf.zze(bArr, iZza, iZza + i11)) {
/* 2986 */                          throw zzkq.zzdn();
                                }
/* 2988 */                      unsafe.putObject(t, j, new String(bArr, iZza, i11, zzkm.UTF_8));
                                iZza += i11;
                            }
/* 2989 */                  unsafe.putInt(t, j2, i4);
                            return iZza;
                        case 60:
                            if (i5 != 2) {
                                return i;
                            }
/* 2974 */                  int iZza2 = zziy.zza(zzap(i8), bArr, i, i2, zzizVar);
/* 2976 */                  object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                            if (object == null) {
/* 2977 */                      unsafe.putObject(t, j, zzizVar.zznm);
                            } else {
/* 2980 */                      unsafe.putObject(t, j, zzkm.zza(object, zzizVar.zznm));
                            }
/* 2981 */                  unsafe.putInt(t, j2, i4);
                            return iZza2;
                        case 61:
                            if (i5 != 2) {
                                return i;
                            }
/* 2971 */                  iZzb = zziy.zze(bArr, i, zzizVar);
/* 2972 */                  unsafe.putObject(t, j, zzizVar.zznm);
/* 3000 */                  unsafe.putInt(t, j2, i4);
                            return iZzb;
                        case 63:
                            if (i5 != 0) {
                                return i;
                            }
/* 2965 */                  int iZza3 = zziy.zza(bArr, i, zzizVar);
/* 2966 */                  int i12 = zzizVar.zznk;
/* 2967 */                  zzko zzkoVarZzar = zzar(i8);
/* 2968 */                  if (zzkoVarZzar != null && !zzkoVarZzar.zzan(i12)) {
/* 2969 */                      zzo(t).zzb(i3, Long.valueOf(i12));
                                return iZza3;
                            }
/* 2970 */                  unsafe.putObject(t, j, Integer.valueOf(i12));
                            iZzb = iZza3;
/* 3000 */                  unsafe.putInt(t, j2, i4);
                            return iZzb;
                        case 66:
                            if (i5 != 0) {
                                return i;
                            }
/* 2963 */                  iZzb = zziy.zza(bArr, i, zzizVar);
/* 2964 */                  unsafe.putObject(t, j, Integer.valueOf(zzjo.zzw(zzizVar.zznk)));
/* 3000 */                  unsafe.putInt(t, j2, i4);
                            return iZzb;
                        case 67:
                            if (i5 != 0) {
                                return i;
                            }
/* 2961 */                  iZzb = zziy.zzb(bArr, i, zzizVar);
/* 2962 */                  unsafe.putObject(t, j, Long.valueOf(zzjo.zzk(zzizVar.zznl)));
/* 3000 */                  unsafe.putInt(t, j2, i4);
                            return iZzb;
                        case 68:
                            if (i5 == 3) {
/* 2954 */                      iZzb = zziy.zza(zzap(i8), bArr, i, i2, (i3 & (-8)) | 4, zzizVar);
/* 2956 */                      object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                                if (object == null) {
/* 2957 */                          unsafe.putObject(t, j, zzizVar.zznm);
                                } else {
/* 2960 */                          unsafe.putObject(t, j, zzkm.zza(object, zzizVar.zznm));
                                }
/* 3000 */                      unsafe.putInt(t, j2, i4);
                                return iZzb;
                            }
                        default:
                            return i;
                    }
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12641. Try increasing type updates limit count.
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                    */
/* 3000 */      public final int zza(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.drive.zziz r34) throws java.io.IOException {
                    /*
                        Method dump skipped, instruction units count: 1264
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.drive.zziz):int");
                }

                /* JADX WARN: Failed to find 'out' block for switch in B:19:0x005c. Please report as an issue. */
                @Override // com.google.android.gms.internal.drive.zzmf
/* 3087 */      public final void zza(T t, byte[] bArr, int i, int i2, zziz zzizVar) throws IOException {
                    int iZzau;
                    Unsafe unsafe;
                    int i3;
                    int i4;
                    int i5;
                    boolean z;
                    Unsafe unsafe2;
                    boolean z2;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    boolean z3;
                    boolean z4;
                    int iZzb;
                    T t2;
                    this = this;
                    bArr = bArr;
                    i2 = i2;
                    zzizVar = zzizVar;
/* 3088 */          if (this.zzuk) {
/* 3089 */              Unsafe unsafe3 = zzuc;
                        int i10 = -1;
                        int iZza = i;
                        int i11 = -1;
                        int i12 = 0;
                        while (iZza < i2) {
                            int iZza2 = iZza + 1;
/* 3090 */                  int i13 = bArr[iZza];
                            if (i13 < 0) {
/* 3091 */                      iZza2 = zziy.zza(i13, bArr, iZza2, zzizVar);
/* 3092 */                      i13 = zzizVar.zznk;
                            }
                            int i14 = iZza2;
                            int i15 = i13;
                            int i16 = (i15 == true ? 1 : 0) >>> 3;
                            int i17 = (i15 == true ? 1 : 0) & 7;
                            if (i16 > i11) {
/* 3093 */                      iZzau = this.zzp(i16, i12 / 3);
                            } else {
/* 3094 */                      iZzau = this.zzau(i16);
                            }
                            int i18 = iZzau;
                            if (i18 == i10) {
                                unsafe = unsafe3;
                                i3 = i14;
                                i4 = i16;
                                i5 = 0;
                                z = i15 == true ? 1 : 0;
                            } else {
/* 3095 */                      int i19 = this.zzud[i18 + 1];
                                int i20 = (267386880 & i19) >>> 20;
                                long j = 1048575 & i19;
                                if (i20 <= 17) {
                                    switch (i20) {
                                        case 0:
                                            unsafe2 = unsafe3;
                                            if (i17 != 1) {
                                                unsafe = unsafe2;
                                                i9 = i14;
                                                i8 = i16;
                                                i7 = i18;
                                                z4 = i15 == true ? 1 : 0;
                                            } else {
/* 3127 */                                      zznd.zza(t, j, zziy.zzc(bArr, i14));
                                                iZza = i14 + 8;
                                                unsafe3 = unsafe2;
                                                i11 = i16;
                                                i12 = i18;
                                                i10 = -1;
                                            }
                                            break;
                                        case 1:
                                            unsafe2 = unsafe3;
                                            if (i17 != 5) {
                                                unsafe = unsafe2;
                                                i9 = i14;
                                                i8 = i16;
                                                i7 = i18;
                                                z4 = i15 == true ? 1 : 0;
                                            } else {
/* 3126 */                                      zznd.zza((Object) t, j, zziy.zzd(bArr, i14));
                                                iZza = i14 + 4;
                                                unsafe3 = unsafe2;
                                                i11 = i16;
                                                i12 = i18;
                                                i10 = -1;
                                            }
                                            break;
                                        case 2:
                                        case 3:
                                            unsafe2 = unsafe3;
                                            if (i17 != 0) {
                                                unsafe = unsafe2;
                                                i9 = i14;
                                                i8 = i16;
                                                i7 = i18;
                                                z4 = i15 == true ? 1 : 0;
                                            } else {
/* 3124 */                                      iZzb = zziy.zzb(bArr, i14, zzizVar);
                                                t2 = t;
                                                unsafe3 = unsafe2;
/* 3125 */                                      unsafe3.putLong(t2, j, zzizVar.zznl);
                                                unsafe3 = unsafe3;
                                                iZza = iZzb;
                                                i11 = i16;
                                                i12 = i18;
                                                i10 = -1;
                                            }
                                            break;
                                        case 4:
                                        case 11:
                                            unsafe2 = unsafe3;
                                            if (i17 != 0) {
                                                unsafe = unsafe2;
                                                i9 = i14;
                                                i8 = i16;
                                                i7 = i18;
                                                z4 = i15 == true ? 1 : 0;
                                            } else {
/* 3122 */                                      iZza = zziy.zza(bArr, i14, zzizVar);
/* 3123 */                                      unsafe2.putInt(t, j, zzizVar.zznk);
                                                unsafe3 = unsafe2;
                                                i11 = i16;
                                                i12 = i18;
                                                i10 = -1;
                                            }
                                            break;
                                        case 5:
                                        case 14:
                                            unsafe2 = unsafe3;
                                            if (i17 != 1) {
                                                unsafe = unsafe2;
                                                i9 = i14;
                                                i8 = i16;
                                                i7 = i18;
                                                z4 = i15 == true ? 1 : 0;
                                            } else {
/* 3121 */                                      unsafe2.putLong(t, j, zziy.zzb(bArr, i14));
                                                unsafe2 = unsafe2;
                                                iZza = i14 + 8;
                                                unsafe3 = unsafe2;
                                                i11 = i16;
                                                i12 = i18;
                                                i10 = -1;
                                            }
                                            break;
                                        case 6:
                                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                                            unsafe2 = unsafe3;
                                            if (i17 != 5) {
                                                unsafe = unsafe2;
                                                i9 = i14;
                                                i8 = i16;
                                                i7 = i18;
                                                z4 = i15 == true ? 1 : 0;
                                            } else {
/* 3120 */                                      unsafe2.putInt(t, j, zziy.zza(bArr, i14));
                                                iZza = i14 + 4;
                                                unsafe3 = unsafe2;
                                                i11 = i16;
                                                i12 = i18;
                                                i10 = -1;
                                            }
                                            break;
                                        case 7:
                                            unsafe2 = unsafe3;
                                            if (i17 != 0) {
                                                unsafe = unsafe2;
                                                i9 = i14;
                                                i8 = i16;
                                                i7 = i18;
                                                z4 = i15 == true ? 1 : 0;
                                            } else {
/* 3118 */                                      int iZzb2 = zziy.zzb(bArr, i14, zzizVar);
/* 3119 */                                      zznd.zza(t, j, zzizVar.zznl != 0);
                                                iZza = iZzb2;
                                                unsafe3 = unsafe2;
                                                i11 = i16;
                                                i12 = i18;
                                                i10 = -1;
                                            }
                                            break;
                                        case 8:
                                            unsafe2 = unsafe3;
                                            if (i17 != 2) {
                                                unsafe = unsafe2;
                                                i9 = i14;
                                                i8 = i16;
                                                i7 = i18;
                                                z4 = i15 == true ? 1 : 0;
                                            } else {
                                                if ((536870912 & i19) == 0) {
/* 3115 */                                          iZza = zziy.zzc(bArr, i14, zzizVar);
                                                } else {
/* 3116 */                                          iZza = zziy.zzd(bArr, i14, zzizVar);
                                                }
/* 3117 */                                      unsafe2.putObject(t, j, zzizVar.zznm);
                                                unsafe3 = unsafe2;
                                                i11 = i16;
                                                i12 = i18;
                                                i10 = -1;
                                            }
                                            break;
                                        case 9:
                                            unsafe2 = unsafe3;
                                            if (i17 != 2) {
                                                unsafe = unsafe2;
                                                i9 = i14;
                                                i8 = i16;
                                                i7 = i18;
                                                z4 = i15 == true ? 1 : 0;
                                            } else {
/* 3109 */                                      iZza = zziy.zza(this.zzap(i18), bArr, i14, i2, zzizVar);
/* 3110 */                                      Object object = unsafe2.getObject(t, j);
                                                if (object == null) {
/* 3111 */                                          unsafe2.putObject(t, j, zzizVar.zznm);
                                                } else {
/* 3114 */                                          unsafe2.putObject(t, j, zzkm.zza(object, zzizVar.zznm));
                                                }
                                                unsafe3 = unsafe2;
                                                i11 = i16;
                                                i12 = i18;
                                                i10 = -1;
                                            }
                                            break;
                                        case 10:
                                            unsafe2 = unsafe3;
                                            if (i17 != 2) {
                                                unsafe = unsafe2;
                                                i9 = i14;
                                                i8 = i16;
                                                i7 = i18;
                                                z4 = i15 == true ? 1 : 0;
                                            } else {
/* 3106 */                                      iZza = zziy.zze(bArr, i14, zzizVar);
/* 3107 */                                      unsafe2.putObject(t, j, zzizVar.zznm);
                                                unsafe3 = unsafe2;
                                                i11 = i16;
                                                i12 = i18;
                                                i10 = -1;
                                            }
                                            break;
                                        case 12:
                                            unsafe2 = unsafe3;
                                            if (i17 != 0) {
                                                unsafe = unsafe2;
                                                i9 = i14;
                                                i8 = i16;
                                                i7 = i18;
                                                z4 = i15 == true ? 1 : 0;
                                            } else {
/* 3104 */                                      iZza = zziy.zza(bArr, i14, zzizVar);
/* 3105 */                                      unsafe2.putInt(t, j, zzizVar.zznk);
                                                unsafe3 = unsafe2;
                                                i11 = i16;
                                                i12 = i18;
                                                i10 = -1;
                                            }
                                            break;
                                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                                            unsafe2 = unsafe3;
                                            if (i17 != 0) {
                                                unsafe = unsafe2;
                                                i9 = i14;
                                                i8 = i16;
                                                i7 = i18;
                                                z4 = i15 == true ? 1 : 0;
                                            } else {
/* 3100 */                                      iZza = zziy.zza(bArr, i14, zzizVar);
/* 3103 */                                      unsafe2.putInt(t, j, zzjo.zzw(zzizVar.zznk));
                                                unsafe3 = unsafe2;
                                                i11 = i16;
                                                i12 = i18;
                                                i10 = -1;
                                            }
                                            break;
                                        case 16:
                                            if (i17 != 0) {
                                                unsafe2 = unsafe3;
                                                unsafe = unsafe2;
                                                i9 = i14;
                                                i8 = i16;
                                                i7 = i18;
                                                z4 = i15 == true ? 1 : 0;
                                            } else {
/* 3096 */                                      iZzb = zziy.zzb(bArr, i14, zzizVar);
                                                t2 = t;
/* 3099 */                                      unsafe3.putLong(t2, j, zzjo.zzk(zzizVar.zznl));
                                                unsafe3 = unsafe3;
                                                iZza = iZzb;
                                                i11 = i16;
                                                i12 = i18;
                                                i10 = -1;
                                            }
                                            break;
                                        default:
                                            unsafe = unsafe3;
                                            i9 = i14;
                                            i8 = i16;
                                            i7 = i18;
                                            z4 = i15 == true ? 1 : 0;
                                            break;
                                    }
                                } else {
                                    unsafe2 = unsafe3;
                                    if (i20 != 27) {
                                        unsafe = unsafe2;
                                        if (i20 <= 49) {
/* 3135 */                                  int iZza3 = this.zza(t, bArr, i14, i2, i15 == true ? 1 : 0, i16, i17, i18, i19, i20, j, zzizVar);
                                            z2 = i15 == true ? 1 : 0;
                                            i6 = i18;
                                            if (iZza3 == i14) {
                                                i3 = iZza3;
                                                i4 = i16;
                                                i5 = i6;
                                                z = z2;
                                            } else {
                                                i2 = i2;
                                                i12 = i6;
                                                iZza = iZza3;
                                                i11 = i16;
                                            }
                                        } else {
                                            i7 = i18;
                                            i8 = i16;
                                            boolean z5 = i15 == true ? 1 : 0;
                                            if (i20 == 50) {
                                                if (i17 == 2) {
/* 3136 */                                          int iZza4 = zza(t, bArr, i14, i2, i7, j, zzizVar);
                                                    if (iZza4 == i14) {
                                                        i5 = i7;
                                                        i3 = iZza4;
                                                        z3 = z5;
                                                    } else {
                                                        this = this;
                                                        i12 = i7;
                                                        iZza = iZza4;
                                                        i11 = i8;
                                                    }
                                                } else {
                                                    i9 = i14;
                                                    z4 = z5;
                                                }
                                                i4 = i8;
                                                z = z3;
                                            } else {
                                                i4 = i8;
/* 3137 */                                      int iZza5 = zza(t, bArr, i14, i2, z5 ? 1 : 0, i4, i17, i19, i20, j, i7, zzizVar);
                                                z2 = z5 ? 1 : 0;
                                                i6 = i7;
                                                if (iZza5 == i14) {
                                                    i3 = iZza5;
                                                    i5 = i6;
                                                    z = z2;
                                                } else {
                                                    i2 = i2;
                                                    i12 = i6;
                                                    i11 = i4;
                                                    iZza = iZza5;
                                                }
                                            }
                                        }
                                        unsafe3 = unsafe;
                                        i10 = -1;
                                        bArr = bArr;
                                    } else if (i17 == 2) {
/* 3128 */                              zzkp zzkpVarZzr = (zzkp) unsafe2.getObject(t, j);
/* 3129 */                              if (!zzkpVarZzr.zzbo()) {
/* 3130 */                                  int size = zzkpVarZzr.size();
/* 3131 */                                  zzkpVarZzr = zzkpVarZzr.zzr(size == 0 ? 10 : size << 1);
/* 3132 */                                  unsafe2.putObject(t, j, zzkpVarZzr);
                                        }
                                        unsafe = unsafe2;
/* 3134 */                              iZza = zziy.zza(this.zzap(i18), i15 == true ? 1 : 0, bArr, i14, i2, zzkpVarZzr, zzizVar);
                                        i11 = i16;
                                        i12 = i18;
                                    } else {
                                        unsafe = unsafe2;
                                        i9 = i14;
                                        i8 = i16;
                                        i7 = i18;
                                        z4 = i15 == true ? 1 : 0;
                                    }
                                    unsafe3 = unsafe;
                                    i10 = -1;
                                }
                                i3 = i9;
                                i5 = i7;
                                z3 = z4;
                                i4 = i8;
                                z = z3;
                            }
/* 3139 */                  iZza = zziy.zza(z ? 1 : 0, bArr, i3, i2, zzo(t), zzizVar);
                            i2 = i2;
                            i11 = i4;
                            i12 = i5;
                            unsafe3 = unsafe;
                            i10 = -1;
                            bArr = bArr;
                        }
                        if (iZza != i2) {
/* 3140 */                  throw zzkq.zzdm();
                        }
                        return;
                    }
/* 3141 */          zza(t, bArr, i, i2, 0, zzizVar);
                }

/* 3141 */      private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzko zzkoVar, UB ub, zzmx<UT, UB> zzmxVar) {
/* 3143 */          zzlj<?, ?> zzljVarZzm = this.zzut.zzm(zzaq(i));
/* 3144 */          Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
/* 3145 */              Map.Entry<K, V> next = it.next();
/* 3146 */              if (!zzkoVar.zzan(((Integer) next.getValue()).intValue())) {
                            if (ub == null) {
/* 3147 */                      ub = zzmxVar.zzez();
                            }
/* 3149 */                  zzjk zzjkVarZzu = zzjc.zzu(zzli.zza(zzljVarZzm, next.getKey(), next.getValue()));
                            try {
/* 3151 */                      zzli.zza(zzjkVarZzu.zzby(), zzljVarZzm, next.getKey(), next.getValue());
/* 3152 */                      zzmxVar.zza(ub, i2, zzjkVarZzu.zzbx());
/* 3153 */                      it.remove();
                            } catch (IOException e) {
/* 3154 */                      ds0.m3199p(e);
                                return null;
                            }
                        }
                    }
                    return ub;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 3154 */      private static boolean zza(Object obj, int i, zzmf zzmfVar) {
/* 3156 */          return zzmfVar.zzp(zznd.zzo(obj, i & 1048575));
                }

/* 3156 */      private static void zza(int i, Object obj, zzns zznsVar) throws IOException {
/* 3157 */          if (obj instanceof String) {
/* 3158 */              zznsVar.zza(i, (String) obj);
                    } else {
/* 3159 */              zznsVar.zza(i, (zzjc) obj);
                    }
                }

/* 3159 */      private final boolean zza(T t, int i, int i2, int i3) {
/* 3160 */          if (this.zzuk) {
/* 3161 */              return zza(t, i);
                    }
                    return (i2 & i3) != 0;
                }

/* 3161 */      private final boolean zza(T t, int i) {
/* 3162 */          if (this.zzuk) {
/* 3163 */              int iZzas = zzas(i);
                        long j = iZzas & 1048575;
                        switch ((iZzas & 267386880) >>> 20) {
                            case 0:
                                return zznd.zzn(t, j) != 0.0d;
                            case 1:
                                return zznd.zzm(t, j) != 0.0f;
                            case 2:
                                return zznd.zzk(t, j) != 0;
                            case 3:
                                return zznd.zzk(t, j) != 0;
                            case 4:
                                return zznd.zzj(t, j) != 0;
                            case 5:
                                return zznd.zzk(t, j) != 0;
                            case 6:
                                return zznd.zzj(t, j) != 0;
                            case 7:
/* 3180 */                      return zznd.zzl(t, j);
                            case 8:
/* 3174 */                      Object objZzo = zznd.zzo(t, j);
/* 3175 */                      if (objZzo instanceof String) {
                                    return !((String) objZzo).isEmpty();
                                }
/* 3177 */                      if (objZzo instanceof zzjc) {
                                    return !zzjc.zznq.equals(objZzo);
                                }
/* 3179 */                      f42.m3649e();
                                return false;
                            case 9:
                                return zznd.zzo(t, j) != null;
                            case 10:
                                return !zzjc.zznq.equals(zznd.zzo(t, j));
                            case 11:
                                return zznd.zzj(t, j) != 0;
                            case 12:
                                return zznd.zzj(t, j) != 0;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                                return zznd.zzj(t, j) != 0;
                            case 14:
                                return zznd.zzk(t, j) != 0;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                                return zznd.zzj(t, j) != 0;
                            case 16:
                                return zznd.zzk(t, j) != 0;
                            case 17:
                                return zznd.zzo(t, j) != null;
                            default:
/* 3164 */                      f42.m3649e();
                                return false;
                        }
                    }
/* 3188 */          int iZzat = zzat(i);
                    return (zznd.zzj(t, (long) (iZzat & 1048575)) & (1 << (iZzat >>> 20))) != 0;
                }

/* 3189 */      private final boolean zza(T t, int i, int i2) {
                    return zznd.zzj(t, (long) (zzat(i2) & 1048575)) == i;
                }
            }
