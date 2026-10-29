            package com.google.android.gms.internal.play_billing;

            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.C1951n4;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    final class zzhb {
                private static final zzhb zzb = new zzhb(true);
                final zzjf zza = new zzja();
                private boolean zzc;
                private boolean zzd;

                private zzhb(boolean z) {
/* 11 */            zzf();
/* 14 */            zzf();
                }

                public static int zza(zzju zzjuVar, int i, Object obj) {
/* 3 */             zzgr.zzz(i << 3);
/* 9 */             if (zzju.zzj == null) {
/* 13 */                byte[] bArr = zzhp.zzb;
/* 17 */                if (((zzim) obj) instanceof zzfw) {
/* 19 */                    throw null;
                        }
                    }
/* 20 */            zzjv zzjvVar = zzjv.INT;
/* 22 */            throw null;
                }

                public static int zzb(zzha zzhaVar, Object obj) {
/* 1 */             zzju zzjuVarZzb = zzhaVar.zzb();
/* 5 */             int iZza = zzhaVar.zza();
/* 13 */            if (!zzhaVar.zze()) {
/* 74 */                return zza(zzjuVarZzb, iZza, obj);
                    }
/* 15 */            List list = (List) obj;
/* 17 */            int size = list.size();
/* 26 */            if (!zzhaVar.zzd()) {
/* 58 */                int iZza2 = 0;
/* 59 */                for (int i = 0; i < size; i++) {
/* 69 */                    iZza2 += zza(zzjuVarZzb, iZza, list.get(i));
                        }
/* 73 */                return iZza2;
                    }
/* 32 */            if (list.isEmpty()) {
/* 25 */                return 0;
                    }
/* 34 */            if (size <= 0) {
/* 46 */                return zzgr.zzz(0) + zzgr.zzz(iZza << 3);
                    }
/* 48 */            list.get(0);
/* 51 */            zzju zzjuVar = zzju.zza;
/* 53 */            zzjv zzjvVar = zzjv.INT;
/* 56 */            throw null;
                }

                public static zzhb zzd() {
/* 1 */             return zzb;
                }

                private static boolean zzi(Map.Entry entry) {
/* 5 */             zzha zzhaVar = (zzha) entry.getKey();
/* 13 */            if (zzhaVar.zzc() != zzjv.MESSAGE) {
/* 58 */                return true;
                    }
/* 19 */            if (!zzhaVar.zze()) {
/* 53 */                return zzj(entry.getValue());
                    }
/* 25 */            List list = (List) entry.getValue();
/* 27 */            int size = list.size();
/* 33 */            for (int i = 0; i < size; i++) {
/* 43 */                if (!zzj(list.get(i))) {
/* 31 */                    return false;
                        }
                    }
/* 58 */            return true;
                }

                private static boolean zzj(Object obj) {
/* 3 */             if (obj instanceof zzin) {
/* 7 */                 return ((zzin) obj).zzl();
                    }
/* 14 */            if (obj instanceof zzhw) {
/* 16 */                return true;
                    }
/* 20 */            C1951n4.m6859j("Wrong object type used with protocol message reflection.");
/* 23 */            return false;
                }

                private static final int zzk(Map.Entry entry) {
                    int i;
                    int iZzz;
                    int iM7491n;
/* 5 */             zzha zzhaVar = (zzha) entry.getKey();
/* 7 */             Object value = entry.getValue();
/* 17 */            if (zzhaVar.zzc() != zzjv.MESSAGE || zzhaVar.zze() || zzhaVar.zzd()) {
/* 121 */               return zzb(zzhaVar, value);
                    }
/* 39 */            if (value instanceof zzhw) {
/* 47 */                int iZza = ((zzha) entry.getKey()).zza();
/* 53 */                int iZzz2 = zzgr.zzz(8);
/* 57 */                i = iZzz2 + iZzz2;
/* 66 */                iZzz = zzgr.zzz(iZza) + zzgr.zzz(16);
/* 67 */                int iZzz3 = zzgr.zzz(24);
/* 71 */                int iZza2 = ((zzhw) value).zza();
/* 75 */                iM7491n = pm2.m7491n(iZza2, iZza2, iZzz3);
                    } else {
/* 88 */                int iZza3 = ((zzha) entry.getKey()).zza();
/* 94 */                int iZzz4 = zzgr.zzz(8);
/* 98 */                i = iZzz4 + iZzz4;
/* 107 */               iZzz = zzgr.zzz(iZza3) + zzgr.zzz(16);
/* 108 */               int iZzz5 = zzgr.zzz(24);
/* 112 */               int iZzk = ((zzim) value).zzk();
/* 116 */               iM7491n = pm2.m7491n(iZzk, iZzk, iZzz5);
                    }
/* 80 */            return i + iZzz + iM7491n;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                private static final void zzl(zzha zzhaVar, Object obj) {
                    boolean z;
/* 1 */             zzhaVar.zzb();
/* 5 */             byte[] bArr = zzhp.zzb;
/* 7 */             obj.getClass();
/* 10 */            zzju zzjuVar = zzju.zza;
/* 12 */            zzjv zzjvVar = zzjv.INT;
                    switch (r0.zza()) {
                        case INT:
/* 68 */                    z = obj instanceof Integer;
/* 70 */                    if (z) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case LONG:
/* 65 */                    z = obj instanceof Long;
/* 70 */                    if (z) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case FLOAT:
/* 62 */                    z = obj instanceof Float;
/* 70 */                    if (z) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case DOUBLE:
/* 59 */                    z = obj instanceof Double;
/* 70 */                    if (z) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case BOOLEAN:
/* 56 */                    z = obj instanceof Boolean;
/* 70 */                    if (z) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case STRING:
/* 53 */                    z = obj instanceof String;
/* 70 */                    if (z) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case BYTE_STRING:
/* 46 */                    if ((obj instanceof zzgk) || (obj instanceof byte[])) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case ENUM:
/* 37 */                    if ((obj instanceof Integer) || (obj instanceof zzkn)) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case MESSAGE:
/* 28 */                    if ((obj instanceof zzim) || (obj instanceof zzhw)) {
                            }
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        default:
/* 103 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzhaVar.zza()), zzhaVar.zzb().zza(), obj.getClass().getName()});
                            break;
                    }
                }

                public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
                    zzjf zzjfVar;
/* 3 */             zzhb zzhbVar = new zzhb();
/* 8 */             int iZzc = this.zza.zzc();
/* 12 */            int i = 0;
                    while (true) {
/* 13 */                zzjfVar = this.zza;
/* 15 */                if (i >= iZzc) {
                            break;
                        }
/* 17 */                Map.Entry entryZzg = zzjfVar.zzg(i);
/* 34 */                zzhbVar.zzg((zzha) ((zzjb) entryZzg).zza(), entryZzg.getValue());
/* 37 */                i++;
                    }
/* 52 */            for (Map.Entry entry : zzjfVar.zzd()) {
/* 70 */                zzhbVar.zzg((zzha) entry.getKey(), entry.getValue());
                    }
/* 76 */            zzhbVar.zzd = this.zzd;
/* 78 */            return zzhbVar;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof zzhb) {
/* 17 */                return this.zza.equals(((zzhb) obj).zza);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                public final int zzc() {
                    zzjf zzjfVar;
/* 3 */             int iZzc = this.zza.zzc();
/* 7 */             int i = 0;
/* 8 */             int iZzk = 0;
                    while (true) {
/* 9 */                 zzjfVar = this.zza;
/* 11 */                if (i >= iZzc) {
                            break;
                        }
/* 21 */                iZzk += zzk(zzjfVar.zzg(i));
/* 22 */                i++;
                    }
/* 29 */            Iterator it = zzjfVar.zzd().iterator();
/* 37 */            while (it.hasNext()) {
/* 49 */                iZzk += zzk((Map.Entry) it.next());
                    }
/* 51 */            return iZzk;
                }

                public final Iterator zze() {
/* 7 */             if (this.zza.isEmpty()) {
/* 9 */                 return Collections.emptyIterator();
                    }
/* 14 */            boolean z = this.zzd;
/* 16 */            zzjf zzjfVar = this.zza;
                    return z ? new zzhu(zzjfVar.entrySet().iterator()) : zzjfVar.entrySet().iterator();
                }

                public final void zzf() {
                    zzjf zzjfVar;
/* 3 */             if (this.zzc) {
/* 5 */                 return;
                    }
/* 8 */             int iZzc = this.zza.zzc();
/* 12 */            int i = 0;
                    while (true) {
/* 13 */                zzjfVar = this.zza;
/* 15 */                if (i >= iZzc) {
                            break;
                        }
/* 21 */                Object value = zzjfVar.zzg(i).getValue();
/* 27 */                if (value instanceof zzhk) {
/* 31 */                    ((zzhk) value).zzv();
                        }
/* 34 */                i++;
                    }
/* 41 */            Iterator it = zzjfVar.zzd().iterator();
/* 49 */            while (it.hasNext()) {
/* 57 */                Object value2 = ((Map.Entry) it.next()).getValue();
/* 63 */                if (value2 instanceof zzhk) {
/* 67 */                    ((zzhk) value2).zzv();
                        }
                    }
/* 73 */            this.zza.zza();
/* 77 */            this.zzc = true;
                }

                public final void zzg(zzha zzhaVar, Object obj) {
/* 5 */             if (!zzhaVar.zze()) {
/* 46 */                zzl(zzhaVar, obj);
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
/* 29 */                    zzl(zzhaVar, obj2);
/* 32 */                    arrayList.add(obj2);
                        }
/* 38 */                obj = arrayList;
                    }
/* 51 */            if (obj instanceof zzhw) {
/* 54 */                this.zzd = true;
                    }
/* 58 */            this.zza.put(zzhaVar, obj);
                }

                public final boolean zzh() {
/* 3 */             int iZzc = this.zza.zzc();
/* 8 */             int i = 0;
                    while (true) {
/* 9 */                 zzjf zzjfVar = this.zza;
/* 11 */                if (i >= iZzc) {
/* 31 */                    Iterator it = zzjfVar.zzd().iterator();
/* 39 */                    while (it.hasNext()) {
/* 51 */                        if (!zzi((Map.Entry) it.next())) {
/* 7 */                             return false;
                                }
                            }
/* 54 */                    return true;
                        }
/* 21 */                if (!zzi(zzjfVar.zzg(i))) {
/* 7 */                     return false;
                        }
/* 24 */                i++;
                    }
                }

/* 17 */        private zzhb() {
                }
            }
