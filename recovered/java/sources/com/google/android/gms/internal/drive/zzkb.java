            package com.google.android.gms.internal.drive;

            import com.google.android.gms.internal.drive.zzkd;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    final class zzkb<FieldDescriptorType extends zzkd<FieldDescriptorType>> {
                private static final zzkb zzov = new zzkb(true);
                private boolean zzot;
                private boolean zzou = false;
                final zzmi<FieldDescriptorType, Object> zzos = zzmi.zzav(16);

                private zzkb(boolean z) {
/* 13 */            zzbp();
                }

                public static void zza(zzjr zzjrVar, zznm zznmVar, int i, Object obj) throws IOException {
/* 3 */             if (zznmVar == zznm.zzxd) {
/* 5 */                 zzlq zzlqVar = (zzlq) obj;
/* 7 */                 zzkm.zzf(zzlqVar);
/* 11 */                zzjrVar.zzb(i, 3);
/* 14 */                zzlqVar.zzb(zzjrVar);
/* 18 */                zzjrVar.zzb(i, 4);
                    }
/* 26 */            zzjrVar.zzb(i, zznmVar.zzfk());
                    switch (zzkc.zzox[zznmVar.ordinal()]) {
                        case 1:
/* 237 */                   zzjrVar.zza(((Double) obj).doubleValue());
                            break;
                        case 2:
/* 227 */                   zzjrVar.zza(((Float) obj).floatValue());
                            break;
                        case 3:
/* 217 */                   zzjrVar.zzl(((Long) obj).longValue());
                            break;
                        case 4:
/* 207 */                   zzjrVar.zzl(((Long) obj).longValue());
                            break;
                        case 5:
/* 197 */                   zzjrVar.zzx(((Integer) obj).intValue());
                            break;
                        case 6:
/* 187 */                   zzjrVar.zzn(((Long) obj).longValue());
                            break;
                        case 7:
/* 177 */                   zzjrVar.zzaa(((Integer) obj).intValue());
                            break;
                        case 8:
/* 167 */                   zzjrVar.zzc(((Boolean) obj).booleanValue());
                            break;
                        case 9:
/* 157 */                   ((zzlq) obj).zzb(zzjrVar);
                            break;
                        case 10:
/* 151 */                   zzjrVar.zzb((zzlq) obj);
                            break;
                        case 11:
/* 135 */                   if (!(obj instanceof zzjc)) {
/* 145 */                       zzjrVar.zzl((String) obj);
                            } else {
/* 139 */                       zzjrVar.zza((zzjc) obj);
                            }
                            break;
                        case 12:
/* 117 */                   if (!(obj instanceof zzjc)) {
/* 125 */                       byte[] bArr = (byte[]) obj;
/* 129 */                       zzjrVar.zzd(bArr, 0, bArr.length);
                            } else {
/* 121 */                       zzjrVar.zza((zzjc) obj);
                            }
                            break;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 111 */                   zzjrVar.zzy(((Integer) obj).intValue());
                            break;
                        case 14:
/* 101 */                   zzjrVar.zzaa(((Integer) obj).intValue());
                            break;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 91 */                    zzjrVar.zzn(((Long) obj).longValue());
                            break;
                        case 16:
/* 81 */                    zzjrVar.zzz(((Integer) obj).intValue());
                            break;
                        case 17:
/* 71 */                    zzjrVar.zzm(((Long) obj).longValue());
                            break;
                        case 18:
/* 43 */                    if (!(obj instanceof zzkn)) {
/* 61 */                        zzjrVar.zzx(((Integer) obj).intValue());
                            } else {
/* 51 */                        zzjrVar.zzx(((zzkn) obj).zzcp());
                            }
                            break;
                    }
                }

                private static int zzb(zznm zznmVar, Object obj) {
                    switch (zzkc.zzox[zznmVar.ordinal()]) {
                        case 1:
/* 244 */                   return zzjr.zzb(((Double) obj).doubleValue());
                        case 2:
/* 233 */                   return zzjr.zzb(((Float) obj).floatValue());
                        case 3:
/* 222 */                   return zzjr.zzo(((Long) obj).longValue());
                        case 4:
/* 211 */                   return zzjr.zzp(((Long) obj).longValue());
                        case 5:
/* 200 */                   return zzjr.zzac(((Integer) obj).intValue());
                        case 6:
/* 189 */                   return zzjr.zzr(((Long) obj).longValue());
                        case 7:
/* 178 */                   return zzjr.zzaf(((Integer) obj).intValue());
                        case 8:
/* 167 */                   return zzjr.zzd(((Boolean) obj).booleanValue());
                        case 9:
/* 156 */                   return zzjr.zzd((zzlq) obj);
                        case 10:
                            return obj instanceof zzkt ? zzjr.zza((zzkt) obj) : zzjr.zzc((zzlq) obj);
                        case 11:
                            return obj instanceof zzjc ? zzjr.zzb((zzjc) obj) : zzjr.zzm((String) obj);
                        case 12:
                            return obj instanceof zzjc ? zzjr.zzb((zzjc) obj) : zzjr.zzc((byte[]) obj);
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 95 */                    return zzjr.zzad(((Integer) obj).intValue());
                        case 14:
/* 84 */                    return zzjr.zzag(((Integer) obj).intValue());
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 73 */                    return zzjr.zzs(((Long) obj).longValue());
                        case 16:
/* 62 */                    return zzjr.zzae(((Integer) obj).intValue());
                        case 17:
/* 51 */                    return zzjr.zzq(((Long) obj).longValue());
                        case 18:
                            return obj instanceof zzkn ? zzjr.zzah(((zzkn) obj).zzcp()) : zzjr.zzah(((Integer) obj).intValue());
                        default:
/* 14 */                    f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 17 */                    return 0;
                    }
                }

                private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
/* 1 */             FieldDescriptorType key = entry.getKey();
/* 7 */             Object value = entry.getValue();
/* 13 */            if (value instanceof zzkt) {
/* 15 */                value = zzkt.zzdp();
                    }
/* 23 */            if (key.zzcs()) {
/* 25 */                Object objZza = zza(key);
/* 29 */                if (objZza == null) {
/* 33 */                    objZza = new ArrayList();
                        }
/* 38 */                Iterator it = ((List) value).iterator();
/* 46 */                while (it.hasNext()) {
/* 59 */                    ((List) objZza).add(zze(it.next()));
                        }
/* 65 */                this.zzos.put(key, objZza);
/* 68 */                return;
                    }
/* 75 */            if (key.zzcr() != zznr.MESSAGE) {
/* 134 */               this.zzos.put(key, zze(value));
/* 137 */               return;
                    }
/* 77 */            Object objZza2 = zza(key);
/* 81 */            if (objZza2 == null) {
/* 89 */                this.zzos.put(key, zze(value));
                    } else {
/* 124 */               this.zzos.put(key, objZza2 instanceof zzlx ? key.zza((zzlx) objZza2, (zzlx) value) : key.zza(((zzlq) objZza2).zzcy(), (zzlq) value).zzdf());
                    }
                }

                public static <T extends zzkd<T>> zzkb<T> zzcn() {
/* 1 */             return zzov;
                }

                private static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
/* 1 */             FieldDescriptorType key = entry.getKey();
/* 7 */             Object value = entry.getValue();
/* 17 */            if (key.zzcr() != zznr.MESSAGE || key.zzcs() || key.zzct()) {
/* 69 */                return zzb((zzkd<?>) key, value);
                    }
                    return value instanceof zzkt ? zzjr.zzb(entry.getKey().zzcp(), (zzkt) value) : zzjr.zzb(entry.getKey().zzcp(), (zzlq) value);
                }

                private static Object zze(Object obj) {
/* 3 */             if (obj instanceof zzlx) {
/* 7 */                 return ((zzlx) obj).zzef();
                    }
/* 14 */            if (!(obj instanceof byte[])) {
/* 27 */                return obj;
                    }
/* 16 */            byte[] bArr = (byte[]) obj;
/* 19 */            byte[] bArr2 = new byte[bArr.length];
/* 23 */            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
/* 26 */            return bArr2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final /* synthetic */ Object clone() throws CloneNotSupportedException {
                    zzmi<FieldDescriptorType, Object> zzmiVar;
/* 3 */             zzkb zzkbVar = new zzkb();
/* 6 */             int i = 0;
                    while (true) {
/* 9 */                 int iZzer = this.zzos.zzer();
/* 13 */                zzmiVar = this.zzos;
/* 15 */                if (i >= iZzer) {
                            break;
                        }
/* 17 */                Map.Entry<K, Object> entryZzaw = zzmiVar.zzaw(i);
/* 31 */                zzkbVar.zza((zzkd) entryZzaw.getKey(), entryZzaw.getValue());
/* 34 */                i++;
                    }
/* 41 */            Iterator it = zzmiVar.zzes().iterator();
/* 49 */            while (it.hasNext()) {
/* 55 */                Map.Entry entry = (Map.Entry) it.next();
/* 67 */                zzkbVar.zza((zzkd) entry.getKey(), entry.getValue());
                    }
/* 73 */            zzkbVar.zzou = this.zzou;
/* 75 */            return zzkbVar;
                }

                public final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
/* 1 */             boolean z = this.zzou;
/* 3 */             zzmi<FieldDescriptorType, Object> zzmiVar = this.zzos;
                    return z ? new zzkw(zzmiVar.zzet().iterator()) : zzmiVar.zzet().iterator();
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof zzkb) {
/* 17 */                return this.zzos.equals(((zzkb) obj).zzos);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.zzos.hashCode();
                }

                public final boolean isImmutable() {
/* 1 */             return this.zzot;
                }

                public final boolean isInitialized() {
/* 2 */             int i = 0;
                    while (true) {
/* 5 */                 int iZzer = this.zzos.zzer();
/* 9 */                 zzmi<FieldDescriptorType, Object> zzmiVar = this.zzos;
/* 11 */                if (i >= iZzer) {
/* 31 */                    Iterator it = zzmiVar.zzes().iterator();
/* 39 */                    while (it.hasNext()) {
/* 51 */                        if (!zzb((Map.Entry) it.next())) {
/* 1 */                             return false;
                                }
                            }
/* 54 */                    return true;
                        }
/* 21 */                if (!zzb(zzmiVar.zzaw(i))) {
/* 1 */                     return false;
                        }
/* 24 */                i++;
                    }
                }

                public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
/* 1 */             boolean z = this.zzou;
/* 3 */             zzmi<FieldDescriptorType, Object> zzmiVar = this.zzos;
                    return z ? new zzkw(zzmiVar.entrySet().iterator()) : zzmiVar.entrySet().iterator();
                }

                public final void zzbp() {
/* 3 */             if (this.zzot) {
/* 5 */                 return;
                    }
/* 8 */             this.zzos.zzbp();
/* 12 */            this.zzot = true;
                }

                public final int zzco() {
                    zzmi<FieldDescriptorType, Object> zzmiVar;
/* 1 */             int i = 0;
/* 2 */             int iZzd = 0;
                    while (true) {
/* 5 */                 int iZzer = this.zzos.zzer();
/* 9 */                 zzmiVar = this.zzos;
/* 11 */                if (i >= iZzer) {
                            break;
                        }
/* 21 */                iZzd += zzd(zzmiVar.zzaw(i));
/* 22 */                i++;
                    }
/* 29 */            Iterator it = zzmiVar.zzes().iterator();
/* 37 */            while (it.hasNext()) {
/* 49 */                iZzd += zzd((Map.Entry) it.next());
                    }
/* 51 */            return iZzd;
                }

/* 16 */        private zzkb() {
                }

/* 240 */       private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
/* 241 */           if (fielddescriptortype.zzcs()) {
/* 242 */               if (obj instanceof List) {
/* 243 */                   ArrayList arrayList = new ArrayList();
/* 244 */                   arrayList.addAll((List) obj);
/* 245 */                   int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                i++;
/* 246 */                       zza(fielddescriptortype.zzcq(), obj2);
                            }
                            obj = arrayList;
                        } else {
/* 247 */                   C1951n4.m6859j("Wrong object type used with protocol message reflection.");
                            return;
                        }
                    } else {
/* 248 */               zza(fielddescriptortype.zzcq(), obj);
                    }
/* 249 */           if (obj instanceof zzkt) {
/* 250 */               this.zzou = true;
                    }
/* 251 */           this.zzos.put(fielddescriptortype, obj);
                }

/* 248 */       private static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
/* 249 */           FieldDescriptorType key = entry.getKey();
/* 250 */           if (key.zzcr() == zznr.MESSAGE) {
/* 251 */               if (key.zzcs()) {
/* 252 */                   Iterator it = ((List) entry.getValue()).iterator();
                            while (it.hasNext()) {
/* 253 */                       if (!((zzlq) it.next()).isInitialized()) {
                                    return false;
                                }
                            }
                        } else {
/* 254 */                   Object value = entry.getValue();
/* 255 */                   if (value instanceof zzlq) {
/* 256 */                       if (!((zzlq) value).isInitialized()) {
                                    return false;
                                }
                            } else {
/* 257 */                       if (value instanceof zzkt) {
                                    return true;
                                }
/* 258 */                       C1951n4.m6859j("Wrong object type used with protocol message reflection.");
                                return false;
                            }
                        }
                    }
                    return true;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x0027  */
                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
/* 251 */       private static void zza(zznm zznmVar, Object obj) {
/* 252 */           zzkm.checkNotNull(obj);
                    boolean z = true;
                    boolean z2 = false;
                    switch (zzkc.zzow[zznmVar.zzfj().ordinal()]) {
                        case 1:
/* 262 */                   z = obj instanceof Integer;
                            z2 = z;
                            break;
                        case 2:
/* 261 */                   z = obj instanceof Long;
                            z2 = z;
                            break;
                        case 3:
/* 260 */                   z = obj instanceof Float;
                            z2 = z;
                            break;
                        case 4:
/* 259 */                   z = obj instanceof Double;
                            z2 = z;
                            break;
                        case 5:
/* 258 */                   z = obj instanceof Boolean;
                            z2 = z;
                            break;
                        case 6:
/* 257 */                   z = obj instanceof String;
                            z2 = z;
                            break;
                        case 7:
/* 256 */                   if (!(obj instanceof zzjc) && !(obj instanceof byte[])) {
                                z = false;
                            }
                            z2 = z;
                            break;
                        case 8:
/* 255 */                   if (!(obj instanceof Integer) && !(obj instanceof zzkn)) {
                                z = false;
                            }
                            z2 = z;
                            break;
                        case 9:
/* 254 */                   if (!(obj instanceof zzlq) && !(obj instanceof zzkt)) {
                                z = false;
                            }
                            z2 = z;
                            break;
                    }
                    if (z2) {
                        return;
                    }
/* 263 */           C1951n4.m6859j("Wrong object type used with protocol message reflection.");
                }

/* 258 */       public static int zzb(zzkd<?> zzkdVar, Object obj) {
/* 259 */           zznm zznmVarZzcq = zzkdVar.zzcq();
/* 260 */           int iZzcp = zzkdVar.zzcp();
/* 261 */           if (zzkdVar.zzcs()) {
                        int iZza = 0;
/* 262 */               if (zzkdVar.zzct()) {
/* 263 */                   Iterator it = ((List) obj).iterator();
                            while (it.hasNext()) {
/* 264 */                       iZza += zzb(zznmVarZzcq, it.next());
                            }
/* 266 */                   return zzjr.zzaj(iZza) + zzjr.zzab(iZzcp) + iZza;
                        }
/* 267 */               Iterator it2 = ((List) obj).iterator();
                        while (it2.hasNext()) {
/* 268 */                   iZza += zza(zznmVarZzcq, iZzcp, it2.next());
                        }
                        return iZza;
                    }
/* 269 */           return zza(zznmVarZzcq, iZzcp, obj);
                }

/* 263 */       public final void zza(zzkb<FieldDescriptorType> zzkbVar) {
                    zzmi<FieldDescriptorType, Object> zzmiVar;
                    int i = 0;
                    while (true) {
/* 264 */               int iZzer = zzkbVar.zzos.zzer();
/* 265 */               zzmiVar = zzkbVar.zzos;
                        if (i >= iZzer) {
                            break;
                        }
/* 266 */               zzc(zzmiVar.zzaw(i));
                        i++;
                    }
/* 267 */           Iterator it = zzmiVar.zzes().iterator();
                    while (it.hasNext()) {
/* 268 */               zzc((Map.Entry) it.next());
                    }
                }

/* 268 */       private final Object zza(FieldDescriptorType fielddescriptortype) {
/* 269 */           Object obj = this.zzos.get(fielddescriptortype);
                    return obj instanceof zzkt ? zzkt.zzdp() : obj;
                }

/* 271 */       public static int zza(zznm zznmVar, int i, Object obj) {
/* 272 */           int iZzab = zzjr.zzab(i);
/* 273 */           if (zznmVar == zznm.zzxd) {
/* 274 */               zzkm.zzf((zzlq) obj);
                        iZzab <<= 1;
                    }
/* 275 */           return iZzab + zzb(zznmVar, obj);
                }
            }
