            package com.google.android.gms.internal.play_billing;

            import java.io.IOException;
            import java.util.List;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zziz {
                public static final /* synthetic */ int zza = 0;
                private static final zzjj zzb;

                static {
/* 1 */             int i = zziu.zza;
/* 8 */             zzb = new zzjl();
                }

                public static void zzA(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzC(i, list, z);
                }

                public static void zzB(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzE(i, list, z);
                }

                public static void zzC(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzJ(i, list, z);
                }

                public static void zzD(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzL(i, list, z);
                }

                public static boolean zzE(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }

                public static int zza(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzhl)) {
/* 32 */                int iZzA = 0;
/* 33 */                while (i < size) {
/* 50 */                    iZzA += zzgr.zzA(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 54 */                return iZzA;
                    }
/* 13 */            zzhl zzhlVar = (zzhl) list;
/* 15 */            int iZzA2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iZzA2 += zzgr.zzA(zzhlVar.zze(i));
/* 28 */                i++;
                    }
/* 31 */            return iZzA2;
                }

                public static int zzb(int i, List list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (zzgr.zzz(i << 3) + 4) * size;
                }

                public static int zzc(List list) {
/* 5 */             return list.size() * 4;
                }

                public static int zzd(int i, List list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (zzgr.zzz(i << 3) + 8) * size;
                }

                public static int zze(List list) {
/* 5 */             return list.size() * 8;
                }

                public static int zzf(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzhl)) {
/* 32 */                int iZzA = 0;
/* 33 */                while (i < size) {
/* 50 */                    iZzA += zzgr.zzA(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 54 */                return iZzA;
                    }
/* 13 */            zzhl zzhlVar = (zzhl) list;
/* 15 */            int iZzA2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iZzA2 += zzgr.zzA(zzhlVar.zze(i));
/* 28 */                i++;
                    }
/* 31 */            return iZzA2;
                }

                public static int zzg(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzib)) {
/* 31 */                int iZzA = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzA += zzgr.zzA(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzA;
                    }
/* 13 */            zzib zzibVar = (zzib) list;
/* 15 */            int iZzA2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzA2 += zzgr.zzA(zzibVar.zze(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzA2;
                }

                public static int zzh(int i, Object obj, zzix zzixVar) {
/* 1 */             int i2 = i << 3;
/* 5 */             if (!(obj instanceof zzhx)) {
/* 32 */                return zzgr.zzx((zzim) obj, zzixVar) + zzgr.zzz(i2);
                    }
/* 9 */             int iZzz = zzgr.zzz(i2);
/* 13 */            int iZza = ((zzhx) obj).zza();
/* 17 */            return pm2.m7491n(iZza, iZza, iZzz);
                }

                public static int zzi(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzhl)) {
/* 36 */                int iZzz = 0;
/* 37 */                while (i < size) {
/* 45 */                    int iIntValue = ((Integer) list.get(i)).intValue();
/* 58 */                    iZzz += zzgr.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 59 */                    i++;
                        }
/* 62 */                return iZzz;
                    }
/* 13 */            zzhl zzhlVar = (zzhl) list;
/* 15 */            int iZzz2 = 0;
/* 16 */            while (i < size) {
/* 18 */                int iZze = zzhlVar.zze(i);
/* 31 */                iZzz2 += zzgr.zzz((iZze >> 31) ^ (iZze + iZze));
/* 32 */                i++;
                    }
/* 35 */            return iZzz2;
                }

                public static int zzj(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            if (!(list instanceof zzib)) {
/* 37 */                int iZzA = 0;
/* 38 */                while (i < size) {
/* 46 */                    long jLongValue = ((Long) list.get(i)).longValue();
/* 58 */                    iZzA += zzgr.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 59 */                    i++;
                        }
/* 62 */                return iZzA;
                    }
/* 15 */            zzib zzibVar = (zzib) list;
/* 17 */            int iZzA2 = 0;
/* 18 */            while (i < size) {
/* 20 */                long jZze = zzibVar.zze(i);
/* 32 */                iZzA2 += zzgr.zzA((jZze >> 63) ^ (jZze + jZze));
/* 33 */                i++;
                    }
/* 36 */            return iZzA2;
                }

                public static int zzk(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzhl)) {
/* 31 */                int iZzz = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzz += zzgr.zzz(((Integer) list.get(i)).intValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzz;
                    }
/* 13 */            zzhl zzhlVar = (zzhl) list;
/* 15 */            int iZzz2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzz2 += zzgr.zzz(zzhlVar.zze(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzz2;
                }

                public static int zzl(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzib)) {
/* 31 */                int iZzA = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzA += zzgr.zzA(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzA;
                    }
/* 13 */            zzib zzibVar = (zzib) list;
/* 15 */            int iZzA2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzA2 += zzgr.zzA(zzibVar.zze(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzA2;
                }

                public static zzjj zzm() {
/* 1 */             return zzb;
                }

                public static Object zzn(Object obj, int i, int i2, Object obj2, zzjj zzjjVar) {
                    zzhk zzhkVar;
                    zzjk zzjkVar;
                    Object obj3 = obj2;
/* 1 */             if (obj2 == null && (zzjkVar = (zzhkVar = (zzhk) obj).zzc) == zzjk.zzc()) {
                        obj3 = zzjkVar;
/* 13 */                zzjk zzjkVarZzf = zzjk.zzf();
/* 17 */                zzhkVar.zzc = zzjkVarZzf;
                        obj3 = zzjkVarZzf;
                    }
                    obj3 = zzjkVar;
/* 29 */            ((zzjk) obj3).zzj(i << 3, Long.valueOf(i2));
/* 32 */            return obj3;
                }

                public static void zzo(zzgx zzgxVar, Object obj, Object obj2) {
/* 11 */            if (((zzhh) obj2).zzb.zza.isEmpty()) {
/* 13 */                return;
                    }
/* 17 */            throw null;
                }

                public static void zzp(zzjj zzjjVar, Object obj, Object obj2) {
/* 1 */             zzhk zzhkVar = (zzhk) obj;
/* 3 */             zzjk zzjkVarZze = zzhkVar.zzc;
/* 7 */             zzjk zzjkVar = ((zzhk) obj2).zzc;
/* 17 */            if (!zzjk.zzc().equals(zzjkVar)) {
/* 27 */                if (zzjk.zzc().equals(zzjkVarZze)) {
/* 29 */                    zzjkVarZze = zzjk.zze(zzjkVarZze, zzjkVar);
                        } else {
/* 34 */                    zzjkVarZze.zzd(zzjkVar);
                        }
                    }
/* 37 */            zzhkVar.zzc = zzjkVarZze;
                }

                public static void zzq(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzc(i, list, z);
                }

                public static void zzr(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzg(i, list, z);
                }

                public static void zzs(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzj(i, list, z);
                }

                public static void zzt(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzl(i, list, z);
                }

                public static void zzu(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzn(i, list, z);
                }

                public static void zzv(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzp(i, list, z);
                }

                public static void zzw(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzs(i, list, z);
                }

                public static void zzx(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzu(i, list, z);
                }

                public static void zzy(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzy(i, list, z);
                }

                public static void zzz(int i, List list, zzjw zzjwVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzjwVar.zzA(i, list, z);
                }
            }
