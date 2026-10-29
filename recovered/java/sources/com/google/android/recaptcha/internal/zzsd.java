            package com.google.android.recaptcha.internal;

            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1697u2;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.C1951n4;
            import p000.f42;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    final class zzsd {
                private static final zzsd zzb = new zzsd(true);
                final zzuo zza = new zzuj();
                private boolean zzc;
                private boolean zzd;

                private zzsd(boolean z) {
/* 11 */            zzg();
/* 14 */            zzg();
                }

                public static int zza(zzsc zzscVar, Object obj) {
                    int iZzd;
                    int iZzA;
/* 1 */             zzvg zzvgVarZzd = zzscVar.zzd();
/* 5 */             int iZza = zzscVar.zza();
/* 9 */             zzscVar.zzg();
/* 14 */            int iZzA2 = zzqv.zzA(iZza << 3);
/* 20 */            if (zzvgVarZzd == zzvg.zzj) {
/* 25 */                byte[] bArr = zzsv.zzb;
/* 29 */                if (((zzts) obj) instanceof zzpx) {
/* 34 */                    throw null;
                        }
/* 31 */                iZzA2 += iZzA2;
                    }
/* 35 */            zzvh zzvhVar = zzvh.INT;
/* 41 */            int iZzB = 4;
                    switch (zzvgVarZzd.ordinal()) {
                        case 0:
/* 285 */                   ((Double) obj).getClass();
/* 94 */                    iZzB = 8;
/* 290 */                   return iZzA2 + iZzB;
                        case 1:
/* 279 */                   ((Float) obj).getClass();
/* 290 */                   return iZzA2 + iZzB;
                        case 2:
/* 272 */                   iZzB = zzqv.zzB(((Long) obj).longValue());
/* 290 */                   return iZzA2 + iZzB;
                        case 3:
/* 261 */                   iZzB = zzqv.zzB(((Long) obj).longValue());
/* 290 */                   return iZzA2 + iZzB;
                        case 4:
/* 250 */                   iZzB = zzqv.zzB(((Integer) obj).intValue());
/* 290 */                   return iZzA2 + iZzB;
                        case 5:
/* 238 */                   ((Long) obj).getClass();
/* 94 */                    iZzB = 8;
/* 290 */                   return iZzA2 + iZzB;
                        case 6:
/* 232 */                   ((Integer) obj).getClass();
/* 290 */                   return iZzA2 + iZzB;
                        case 7:
/* 225 */                   ((Boolean) obj).getClass();
/* 228 */                   iZzB = 1;
/* 290 */                   return iZzA2 + iZzB;
                        case 8:
/* 203 */                   if (obj instanceof zzqm) {
/* 207 */                       iZzd = ((zzqm) obj).zzd();
/* 211 */                       iZzA = zzqv.zzA(iZzd);
/* 160 */                       iZzB = iZzA + iZzd;
                            } else {
/* 218 */                       iZzB = zzqv.zzz((String) obj);
                            }
/* 290 */                   return iZzA2 + iZzB;
                        case 9:
/* 196 */                   iZzB = ((zzts) obj).zzo();
/* 290 */                   return iZzA2 + iZzB;
                        case 10:
/* 174 */                   if (obj instanceof zztc) {
/* 178 */                       iZzd = ((zztc) obj).zza();
/* 182 */                       iZzA = zzqv.zzA(iZzd);
/* 160 */                       iZzB = iZzA + iZzd;
                            } else {
/* 189 */                       iZzB = zzqv.zzx((zzts) obj);
                            }
/* 290 */                   return iZzA2 + iZzB;
                        case 11:
/* 148 */                   if (obj instanceof zzqm) {
/* 152 */                       iZzd = ((zzqm) obj).zzd();
/* 156 */                       iZzA = zzqv.zzA(iZzd);
                            } else {
/* 166 */                       iZzd = ((byte[]) obj).length;
/* 167 */                       iZzA = zzqv.zzA(iZzd);
                            }
/* 160 */                   iZzB = iZzA + iZzd;
/* 290 */                   return iZzA2 + iZzB;
                        case 12:
/* 140 */                   iZzB = zzqv.zzA(((Integer) obj).intValue());
/* 290 */                   return iZzA2 + iZzB;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 128 */                   iZzB = obj instanceof zzsp ? zzqv.zzB(((zzsp) obj).zza()) : zzqv.zzB(((Integer) obj).intValue());
/* 290 */                   return iZzA2 + iZzB;
                        case 14:
/* 99 */                    ((Integer) obj).getClass();
/* 290 */                   return iZzA2 + iZzB;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 91 */                    ((Long) obj).getClass();
/* 94 */                    iZzB = 8;
/* 290 */                   return iZzA2 + iZzB;
                        case 16:
/* 74 */                    int iIntValue = ((Integer) obj).intValue();
/* 83 */                    iZzB = zzqv.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 290 */                   return iZzA2 + iZzB;
                        case 17:
/* 56 */                    long jLongValue = ((Long) obj).longValue();
/* 66 */                    iZzB = zzqv.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 290 */                   return iZzA2 + iZzB;
                        default:
/* 49 */                    f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 52 */                    return 0;
                    }
                }

                public static zzsd zzd() {
/* 1 */             return zzb;
                }

                private static Object zzl(Object obj) {
/* 3 */             if (obj instanceof zztx) {
/* 7 */                 return ((zztx) obj).zzd();
                    }
/* 14 */            if (!(obj instanceof byte[])) {
/* 26 */                return obj;
                    }
/* 16 */            byte[] bArr = (byte[]) obj;
/* 18 */            int length = bArr.length;
/* 19 */            byte[] bArr2 = new byte[length];
/* 22 */            System.arraycopy(bArr, 0, bArr2, 0, length);
/* 25 */            return bArr2;
                }

                private final void zzm(Map.Entry entry) {
/* 5 */             zzsc zzscVar = (zzsc) entry.getKey();
/* 7 */             Object value = entry.getValue();
/* 11 */            boolean z = value instanceof zztc;
/* 13 */            zzscVar.zzg();
/* 22 */            if (zzscVar.zze() != zzvh.MESSAGE) {
/* 84 */                if (z) {
/* 98 */                    f42.m3656l("Lazy fields must be message-valued");
/* 101 */                   return;
                        } else {
/* 92 */                    this.zza.put(zzscVar, zzl(value));
/* 95 */                    return;
                        }
                    }
/* 24 */            Object objZze = zze(zzscVar);
/* 28 */            if (objZze != null) {
/* 45 */                if (z) {
/* 83 */                    throw null;
                        }
/* 78 */                this.zza.put(zzscVar, objZze instanceof zztx ? zzscVar.zzc((zztx) objZze, (zztx) value) : zzscVar.zzb(((zzts) objZze).zzag(), (zzts) value).zzk());
                    } else {
/* 36 */                this.zza.put(zzscVar, zzl(value));
/* 39 */                if (z) {
/* 42 */                    this.zzd = true;
                        }
                    }
                }

                private static boolean zzn(Map.Entry entry) {
/* 5 */             zzsc zzscVar = (zzsc) entry.getKey();
/* 14 */            if (zzscVar.zze() != zzvh.MESSAGE) {
/* 13 */                return true;
                    }
/* 16 */            zzscVar.zzg();
/* 19 */            Object value = entry.getValue();
/* 25 */            if (value instanceof zztt) {
/* 29 */                return ((zztt) value).zzp();
                    }
/* 36 */            if (value instanceof zztc) {
/* 13 */                return true;
                    }
/* 41 */            C1951n4.m6859j("Wrong object type used with protocol message reflection.");
/* 44 */            return false;
                }

                private static final int zzo(Map.Entry entry) {
                    int i;
                    int iZzA;
                    int iZzx;
/* 5 */             zzsc zzscVar = (zzsc) entry.getKey();
/* 7 */             Object value = entry.getValue();
/* 17 */            if (zzscVar.zze() != zzvh.MESSAGE) {
/* 112 */               return zza(zzscVar, value);
                    }
/* 19 */            zzscVar.zzg();
/* 22 */            zzscVar.zzf();
/* 33 */            if (value instanceof zztc) {
/* 41 */                int iZza = ((zzsc) entry.getKey()).zza();
/* 47 */                int iZzA2 = zzqv.zzA(8);
/* 51 */                i = iZzA2 + iZzA2;
/* 60 */                iZzA = zzqv.zzA(iZza) + zzqv.zzA(16);
/* 61 */                int iZzA3 = zzqv.zzA(24);
/* 65 */                int iZza2 = ((zztc) value).zza();
/* 69 */                iZzx = pm2.m7496s(iZza2, iZza2, iZzA3);
                    } else {
/* 82 */                int iZza3 = ((zzsc) entry.getKey()).zza();
/* 88 */                int iZzA4 = zzqv.zzA(8);
/* 92 */                i = iZzA4 + iZzA4;
/* 101 */               iZzA = zzqv.zzA(iZza3) + zzqv.zzA(16);
/* 110 */               iZzx = zzqv.zzx((zzts) value) + zzqv.zzA(24);
                    }
/* 74 */            return i + iZzA + iZzx;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof zzsd) {
/* 17 */                return this.zza.equals(((zzsd) obj).zza);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                public final int zzb() {
/* 1 */             zzuo zzuoVar = this.zza;
/* 3 */             int iZzc = zzuoVar.zzc();
/* 8 */             int iZzo = 0;
/* 9 */             for (int i = 0; i < iZzc; i++) {
/* 19 */                iZzo += zzo(zzuoVar.zzg(i));
                    }
/* 27 */            Iterator it = zzuoVar.zzd().iterator();
/* 35 */            while (it.hasNext()) {
/* 47 */                iZzo += zzo((Map.Entry) it.next());
                    }
/* 49 */            return iZzo;
                }

                /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
                public final zzsd clone() {
/* 3 */             zzsd zzsdVar = new zzsd();
/* 6 */             zzuo zzuoVar = this.zza;
/* 8 */             int iZzc = zzuoVar.zzc();
/* 13 */            for (int i = 0; i < iZzc; i++) {
/* 15 */                Map.Entry entryZzg = zzuoVar.zzg(i);
/* 32 */                zzsdVar.zzi((zzsc) ((zzuk) entryZzg).zza(), entryZzg.getValue());
                    }
/* 50 */            for (Map.Entry entry : zzuoVar.zzd()) {
/* 68 */                zzsdVar.zzi((zzsc) entry.getKey(), entry.getValue());
                    }
/* 74 */            zzsdVar.zzd = this.zzd;
/* 76 */            return zzsdVar;
                }

                public final Object zze(zzsc zzscVar) {
/* 3 */             Object obj = this.zza.get(zzscVar);
/* 9 */             if (obj instanceof zztc) {
/* 13 */                throw null;
                    }
/* 11 */            return obj;
                }

                public final Iterator zzf() {
/* 1 */             zzuo zzuoVar = this.zza;
/* 7 */             if (zzuoVar.isEmpty()) {
/* 9 */                 return Collections.emptyIterator();
                    }
                    return this.zzd ? new zzta(zzuoVar.entrySet().iterator()) : zzuoVar.entrySet().iterator();
                }

                public final void zzg() {
/* 3 */             if (this.zzc) {
/* 5 */                 return;
                    }
/* 6 */             zzuo zzuoVar = this.zza;
/* 8 */             int iZzc = zzuoVar.zzc();
/* 13 */            for (int i = 0; i < iZzc; i++) {
/* 19 */                Object value = zzuoVar.zzg(i).getValue();
/* 25 */                if (value instanceof zzsn) {
/* 29 */                    ((zzsn) value).zzG();
                        }
                    }
/* 39 */            Iterator it = zzuoVar.zzd().iterator();
/* 47 */            while (it.hasNext()) {
/* 55 */                Object value2 = ((Map.Entry) it.next()).getValue();
/* 61 */                if (value2 instanceof zzsn) {
/* 65 */                    ((zzsn) value2).zzG();
                        }
                    }
/* 69 */            zzuoVar.zza();
/* 73 */            this.zzc = true;
                }

                public final void zzh(zzsd zzsdVar) {
/* 1 */             zzuo zzuoVar = zzsdVar.zza;
/* 3 */             int iZzc = zzuoVar.zzc();
/* 8 */             for (int i = 0; i < iZzc; i++) {
/* 14 */                zzm(zzuoVar.zzg(i));
                    }
/* 24 */            Iterator it = zzuoVar.zzd().iterator();
/* 32 */            while (it.hasNext()) {
/* 40 */                zzm((Map.Entry) it.next());
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:29:0x004e  */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
                
                    if ((r4 instanceof com.google.android.recaptcha.internal.zzsp) == false) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
                
                    if ((r4 instanceof byte[]) == false) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
                
                    if (r0 != false) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
                
                    if ((r4 instanceof com.google.android.recaptcha.internal.zztc) == false) goto L32;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void zzi(zzsc zzscVar, Object obj) {
                    boolean z;
/* 1 */             zzscVar.zzg();
/* 4 */             zzscVar.zzd();
/* 8 */             byte[] bArr = zzsv.zzb;
/* 10 */            obj.getClass();
/* 13 */            zzvg zzvgVar = zzvg.zza;
/* 15 */            zzvh zzvhVar = zzvh.INT;
                    switch (r0.zza()) {
                        case INT:
/* 71 */                    z = obj instanceof Integer;
                            break;
                        case LONG:
/* 68 */                    z = obj instanceof Long;
                            break;
                        case FLOAT:
/* 65 */                    z = obj instanceof Float;
                            break;
                        case DOUBLE:
/* 62 */                    z = obj instanceof Double;
                            break;
                        case BOOLEAN:
/* 59 */                    z = obj instanceof Boolean;
                            break;
                        case STRING:
/* 56 */                    z = obj instanceof String;
                            break;
                        case BYTE_STRING:
/* 49 */                    if (!(obj instanceof zzqm)) {
                            }
/* 77 */                    if (obj instanceof zztc) {
/* 80 */                        this.zzd = true;
                            }
/* 84 */                    this.zza.put(zzscVar, obj);
                            break;
                        case ENUM:
/* 40 */                    if (!(obj instanceof Integer)) {
                            }
/* 77 */                    if (obj instanceof zztc) {
/* 80 */                        this.zzd = true;
                            }
/* 84 */                    this.zza.put(zzscVar, obj);
                            break;
                        case MESSAGE:
/* 31 */                    if (!(obj instanceof zzts)) {
                            }
/* 77 */                    if (obj instanceof zztc) {
/* 80 */                        this.zzd = true;
                            }
/* 84 */                    this.zza.put(zzscVar, obj);
                            break;
                        default:
/* 118 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzscVar.zza()), zzscVar.zzd().zza(), obj.getClass().getName()});
                            break;
                    }
                }

                public final boolean zzj() {
/* 1 */             return this.zzc;
                }

                public final boolean zzk() {
/* 1 */             zzuo zzuoVar = this.zza;
/* 3 */             int iZzc = zzuoVar.zzc();
/* 9 */             for (int i = 0; i < iZzc; i++) {
/* 19 */                if (!zzn(zzuoVar.zzg(i))) {
/* 7 */                     return false;
                        }
                    }
/* 29 */            Iterator it = zzuoVar.zzd().iterator();
/* 37 */            while (it.hasNext()) {
/* 49 */                if (!zzn((Map.Entry) it.next())) {
/* 7 */                     return false;
                        }
                    }
/* 52 */            return true;
                }

/* 17 */        private zzsd() {
                }
            }
