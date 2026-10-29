            package com.google.android.gms.internal.measurement;

            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1697u2;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.C1951n4;
            import p000.f42;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    final class zzlv {
                private static final zzlv zzd = new zzlv(true);
                final zzod zza = new zznz();
                private boolean zzb;
                private boolean zzc;

                private zzlv(boolean z) {
/* 11 */            zzb();
/* 14 */            zzb();
                }

                public static zzlv zza() {
/* 1 */             return zzd;
                }

                public static void zzf(zzll zzllVar, zzos zzosVar, int i, Object obj) throws IOException {
/* 3 */             if (zzosVar == zzos.zzj) {
/* 241 */               zznl zznlVar = (zznl) obj;
/* 243 */               zzmo.zzd(zznlVar);
/* 247 */               zzllVar.zza(i, 3);
/* 250 */               zznlVar.zzcB(zzllVar);
/* 254 */               zzllVar.zza(i, 4);
/* 257 */               return;
                    }
/* 9 */             zzllVar.zza(i, zzosVar.zzb());
/* 12 */            zzot zzotVar = zzot.INT;
                    switch (zzosVar.ordinal()) {
                        case 0:
/* 237 */                   zzllVar.zzu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                            break;
                        case 1:
/* 223 */                   zzllVar.zzs(Float.floatToRawIntBits(((Float) obj).floatValue()));
                            break;
                        case 2:
/* 209 */                   zzllVar.zzt(((Long) obj).longValue());
                            break;
                        case 3:
/* 199 */                   zzllVar.zzt(((Long) obj).longValue());
                            break;
                        case 4:
/* 189 */                   zzllVar.zzq(((Integer) obj).intValue());
                            break;
                        case 5:
/* 179 */                   zzllVar.zzu(((Long) obj).longValue());
                            break;
                        case 6:
/* 169 */                   zzllVar.zzs(((Integer) obj).intValue());
                            break;
                        case 7:
/* 159 */                   zzllVar.zzp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                            break;
                        case 8:
/* 139 */                   if (!(obj instanceof zzlg)) {
/* 149 */                       zzllVar.zzx((String) obj);
                            } else {
/* 143 */                       zzllVar.zzj((zzlg) obj);
                            }
                            break;
                        case 9:
/* 133 */                   ((zznl) obj).zzcB(zzllVar);
                            break;
                        case 10:
/* 127 */                   zzllVar.zzo((zznl) obj);
                            break;
                        case 11:
/* 109 */                   if (!(obj instanceof zzlg)) {
/* 117 */                       byte[] bArr = (byte[]) obj;
/* 121 */                       zzllVar.zzk(bArr, 0, bArr.length);
                            } else {
/* 113 */                       zzllVar.zzj((zzlg) obj);
                            }
                            break;
                        case 12:
/* 103 */                   zzllVar.zzr(((Integer) obj).intValue());
                            break;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 75 */                    if (!(obj instanceof zzmi)) {
/* 93 */                        zzllVar.zzq(((Integer) obj).intValue());
                            } else {
/* 83 */                        zzllVar.zzq(((zzmi) obj).zza());
                            }
                            break;
                        case 14:
/* 69 */                    zzllVar.zzs(((Integer) obj).intValue());
                            break;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 59 */                    zzllVar.zzu(((Long) obj).longValue());
                            break;
                        case 16:
/* 40 */                    int iIntValue = ((Integer) obj).intValue();
/* 49 */                    zzllVar.zzr((iIntValue >> 31) ^ (iIntValue + iIntValue));
                            break;
                        case 17:
/* 24 */                    long jLongValue = ((Long) obj).longValue();
/* 34 */                    zzllVar.zzt((jLongValue >> 63) ^ (jLongValue + jLongValue));
                            break;
                    }
                }

                public static int zzh(zzos zzosVar, int i, Object obj) {
/* 3 */             int iZzz = zzll.zzz(i << 3);
/* 9 */             if (zzosVar == zzos.zzj) {
/* 14 */                zzmo.zzd((zznl) obj);
/* 17 */                iZzz += iZzz;
                    }
/* 22 */            return iZzz + zzi(zzosVar, obj);
                }

                public static int zzi(zzos zzosVar, Object obj) {
                    int iZzc;
                    int iZzz;
/* 1 */             zzos zzosVar2 = zzos.zza;
/* 3 */             zzot zzotVar = zzot.INT;
                    switch (zzosVar.ordinal()) {
                        case 0:
/* 262 */                   ((Double) obj).getClass();
/* 265 */                   int i = zzll.zzb;
/* 10 */                    return 8;
                        case 1:
/* 254 */                   ((Float) obj).getClass();
/* 257 */                   int i2 = zzll.zzb;
/* 9 */                     return 4;
                        case 2:
/* 247 */                   return zzll.zzA(((Long) obj).longValue());
                        case 3:
/* 236 */                   return zzll.zzA(((Long) obj).longValue());
                        case 4:
/* 225 */                   return zzll.zzA(((Integer) obj).intValue());
                        case 5:
/* 212 */                   ((Long) obj).getClass();
/* 215 */                   int i3 = zzll.zzb;
/* 10 */                    return 8;
                        case 6:
/* 204 */                   ((Integer) obj).getClass();
/* 207 */                   int i4 = zzll.zzb;
/* 9 */                     return 4;
                        case 7:
/* 195 */                   ((Boolean) obj).getClass();
/* 198 */                   int i5 = zzll.zzb;
/* 200 */                   return 1;
                        case 8:
/* 171 */                   if (!(obj instanceof zzlg)) {
/* 188 */                       return zzll.zzB((String) obj);
                            }
/* 175 */                   int i6 = zzll.zzb;
/* 177 */                   iZzc = ((zzlg) obj).zzc();
/* 181 */                   iZzz = zzll.zzz(iZzc);
                            break;
                            break;
                        case 9:
/* 164 */                   return ((zznl) obj).zzcn();
                        case 10:
/* 140 */                   if (!(obj instanceof zzmu)) {
/* 157 */                       return zzll.zzC((zznl) obj);
                            }
/* 144 */                   int i7 = zzll.zzb;
/* 146 */                   iZzc = ((zzmu) obj).zzb();
/* 150 */                   iZzz = zzll.zzz(iZzc);
                            break;
                            break;
                        case 11:
/* 112 */                   if (!(obj instanceof zzlg)) {
/* 130 */                       int i8 = zzll.zzb;
/* 132 */                       iZzc = ((byte[]) obj).length;
/* 133 */                       iZzz = zzll.zzz(iZzc);
                            } else {
/* 116 */                       int i9 = zzll.zzb;
/* 118 */                       iZzc = ((zzlg) obj).zzc();
/* 122 */                       iZzz = zzll.zzz(iZzc);
                            }
                            break;
                        case 12:
/* 105 */                   return zzll.zzz(((Integer) obj).intValue());
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                            return obj instanceof zzmi ? zzll.zzA(((zzmi) obj).zza()) : zzll.zzA(((Integer) obj).intValue());
                        case 14:
/* 65 */                    ((Integer) obj).getClass();
/* 68 */                    int i10 = zzll.zzb;
/* 9 */                     return 4;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 57 */                    ((Long) obj).getClass();
/* 60 */                    int i11 = zzll.zzb;
/* 10 */                    return 8;
                        case 16:
/* 41 */                    int iIntValue = ((Integer) obj).intValue();
/* 50 */                    return zzll.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                        case 17:
/* 24 */                    long jLongValue = ((Long) obj).longValue();
/* 34 */                    return zzll.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                        default:
/* 17 */                    f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 20 */                    return 0;
                    }
/* 126 */           return iZzz + iZzc;
                }

                public static int zzj(zzlu zzluVar, Object obj) {
/* 1 */             zzos zzosVarZzb = zzluVar.zzb();
/* 5 */             int iZza = zzluVar.zza();
/* 13 */            if (!zzluVar.zzd()) {
/* 79 */                return zzh(zzosVarZzb, iZza, obj);
                    }
/* 15 */            List list = (List) obj;
/* 17 */            int size = list.size();
/* 25 */            int i = 0;
/* 26 */            if (!zzluVar.zze()) {
/* 63 */                int iZzh = 0;
/* 64 */                while (i < size) {
/* 74 */                    iZzh += zzh(zzosVarZzb, iZza, list.get(i));
/* 75 */                    i++;
                        }
/* 78 */                return iZzh;
                    }
/* 32 */            if (list.isEmpty()) {
/* 25 */                return 0;
                    }
/* 34 */            int iZzi = 0;
/* 35 */            while (i < size) {
/* 45 */                iZzi += zzi(zzosVarZzb, list.get(i));
/* 46 */                i++;
                    }
/* 60 */            return zzll.zzz(iZzi) + zzll.zzz(iZza << 3) + iZzi;
                }

                private static boolean zzk(Map.Entry entry) {
/* 5 */             zzlu zzluVar = (zzlu) entry.getKey();
/* 13 */            if (zzluVar.zzc() != zzot.MESSAGE) {
/* 58 */                return true;
                    }
/* 19 */            if (!zzluVar.zzd()) {
/* 53 */                return zzl(entry.getValue());
                    }
/* 25 */            List list = (List) entry.getValue();
/* 27 */            int size = list.size();
/* 33 */            for (int i = 0; i < size; i++) {
/* 43 */                if (!zzl(list.get(i))) {
/* 31 */                    return false;
                        }
                    }
/* 58 */            return true;
                }

                private static boolean zzl(Object obj) {
/* 3 */             if (obj instanceof zznm) {
/* 7 */                 return ((zznm) obj).zzcD();
                    }
/* 14 */            if (obj instanceof zzmu) {
/* 16 */                return true;
                    }
/* 20 */            C1951n4.m6859j("Wrong object type used with protocol message reflection.");
/* 23 */            return false;
                }

                private static final int zzm(Map.Entry entry) {
                    int i;
                    int iZzz;
                    int iZzC;
/* 5 */             zzlu zzluVar = (zzlu) entry.getKey();
/* 7 */             Object value = entry.getValue();
/* 17 */            if (zzluVar.zzc() != zzot.MESSAGE || zzluVar.zzd() || zzluVar.zze()) {
/* 118 */               return zzj(zzluVar, value);
                    }
/* 39 */            if (value instanceof zzmu) {
/* 47 */                int iZza = ((zzlu) entry.getKey()).zza();
/* 53 */                int iZzz2 = zzll.zzz(8);
/* 57 */                i = iZzz2 + iZzz2;
/* 66 */                iZzz = zzll.zzz(iZza) + zzll.zzz(16);
/* 67 */                int iZzz3 = zzll.zzz(24);
/* 71 */                int iZzb = ((zzmu) value).zzb();
/* 75 */                iZzC = pm2.m7493p(iZzb, iZzb, iZzz3);
                    } else {
/* 88 */                int iZza2 = ((zzlu) entry.getKey()).zza();
/* 94 */                int iZzz4 = zzll.zzz(8);
/* 98 */                i = iZzz4 + iZzz4;
/* 107 */               iZzz = zzll.zzz(iZza2) + zzll.zzz(16);
/* 116 */               iZzC = zzll.zzC((zznl) value) + zzll.zzz(24);
                    }
/* 80 */            return i + iZzz + iZzC;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                private static final void zzn(zzlu zzluVar, Object obj) {
                    boolean z;
/* 1 */             zzluVar.zzb();
/* 5 */             byte[] bArr = zzmo.zzb;
/* 7 */             obj.getClass();
/* 10 */            zzos zzosVar = zzos.zza;
/* 12 */            zzot zzotVar = zzot.INT;
                    switch (r0.zza()) {
                        case INT:
/* 68 */                    z = obj instanceof Integer;
/* 70 */                    if (z) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case LONG:
/* 65 */                    z = obj instanceof Long;
/* 70 */                    if (z) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case FLOAT:
/* 62 */                    z = obj instanceof Float;
/* 70 */                    if (z) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case DOUBLE:
/* 59 */                    z = obj instanceof Double;
/* 70 */                    if (z) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case BOOLEAN:
/* 56 */                    z = obj instanceof Boolean;
/* 70 */                    if (z) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case STRING:
/* 53 */                    z = obj instanceof String;
/* 70 */                    if (z) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case BYTE_STRING:
/* 46 */                    if ((obj instanceof zzlg) || (obj instanceof byte[])) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case ENUM:
/* 37 */                    if ((obj instanceof Integer) || (obj instanceof zzmi)) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case MESSAGE:
/* 28 */                    if ((obj instanceof zznl) || (obj instanceof zzmu)) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        default:
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()});
                            break;
                    }
                }

                public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
/* 3 */             zzlv zzlvVar = new zzlv();
/* 6 */             zzod zzodVar = this.zza;
/* 8 */             int iZzc = zzodVar.zzc();
/* 13 */            for (int i = 0; i < iZzc; i++) {
/* 15 */                Map.Entry entryZzd = zzodVar.zzd(i);
/* 32 */                zzlvVar.zzd((zzlu) ((zzoa) entryZzd).zza(), entryZzd.getValue());
                    }
/* 50 */            for (Map.Entry entry : zzodVar.zze()) {
/* 68 */                zzlvVar.zzd((zzlu) entry.getKey(), entry.getValue());
                    }
/* 74 */            zzlvVar.zzc = this.zzc;
/* 76 */            return zzlvVar;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof zzlv) {
/* 17 */                return this.zza.equals(((zzlv) obj).zza);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                public final void zzb() {
/* 3 */             if (this.zzb) {
/* 5 */                 return;
                    }
/* 6 */             zzod zzodVar = this.zza;
/* 8 */             int iZzc = zzodVar.zzc();
/* 13 */            for (int i = 0; i < iZzc; i++) {
/* 19 */                Object value = zzodVar.zzd(i).getValue();
/* 25 */                if (value instanceof zzme) {
/* 29 */                    ((zzme) value).zzcj();
                        }
                    }
/* 39 */            Iterator it = zzodVar.zze().iterator();
/* 47 */            while (it.hasNext()) {
/* 55 */                Object value2 = ((Map.Entry) it.next()).getValue();
/* 61 */                if (value2 instanceof zzme) {
/* 65 */                    ((zzme) value2).zzcj();
                        }
                    }
/* 69 */            zzodVar.zza();
/* 73 */            this.zzb = true;
                }

                public final Iterator zzc() {
/* 1 */             zzod zzodVar = this.zza;
/* 7 */             if (zzodVar.isEmpty()) {
/* 9 */                 return Collections.emptyIterator();
                    }
                    return this.zzc ? new zzmt(zzodVar.entrySet().iterator()) : zzodVar.entrySet().iterator();
                }

                public final void zzd(zzlu zzluVar, Object obj) {
/* 5 */             if (!zzluVar.zzd()) {
/* 46 */                zzn(zzluVar, obj);
                    } else {
/* 9 */                 if (!(obj instanceof List)) {
/* 42 */                    C1951n4.m6859j("Wrong object type used with protocol message reflection.");
/* 45 */                    return;
                        }
/* 11 */                List list = (List) obj;
/* 13 */                int size = list.size();
/* 19 */                ArrayList arrayList = new ArrayList(size);
/* 23 */                for (int i = 0; i < size; i++) {
/* 25 */                    Object obj2 = list.get(i);
/* 29 */                    zzn(zzluVar, obj2);
/* 32 */                    arrayList.add(obj2);
                        }
/* 38 */                obj = arrayList;
                    }
/* 51 */            if (obj instanceof zzmu) {
/* 54 */                this.zzc = true;
                    }
/* 58 */            this.zza.put(zzluVar, obj);
                }

                public final boolean zze() {
/* 1 */             zzod zzodVar = this.zza;
/* 3 */             int iZzc = zzodVar.zzc();
/* 9 */             for (int i = 0; i < iZzc; i++) {
/* 19 */                if (!zzk(zzodVar.zzd(i))) {
/* 7 */                     return false;
                        }
                    }
/* 29 */            Iterator it = zzodVar.zze().iterator();
/* 37 */            while (it.hasNext()) {
/* 49 */                if (!zzk((Map.Entry) it.next())) {
/* 7 */                     return false;
                        }
                    }
/* 52 */            return true;
                }

                public final int zzg() {
/* 1 */             zzod zzodVar = this.zza;
/* 3 */             int iZzc = zzodVar.zzc();
/* 8 */             int iZzm = 0;
/* 9 */             for (int i = 0; i < iZzc; i++) {
/* 19 */                iZzm += zzm(zzodVar.zzd(i));
                    }
/* 27 */            Iterator it = zzodVar.zze().iterator();
/* 35 */            while (it.hasNext()) {
/* 47 */                iZzm += zzm((Map.Entry) it.next());
                    }
/* 49 */            return iZzm;
                }

/* 17 */        private zzlv() {
                }
            }
