            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzui {
                public static final /* synthetic */ int zza = 0;
                private static final zzuv zzb;

                static {
/* 1 */             int i = zzuc.zza;
/* 8 */             zzb = new zzux();
                }

                public static void zzA(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzA(i, list, z);
                }

                public static void zzB(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzC(i, list, z);
                }

                public static void zzC(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzE(i, list, z);
                }

                public static void zzD(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzJ(i, list, z);
                }

                public static void zzE(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzL(i, list, z);
                }

                public static boolean zzF(Object obj, Object obj2) {
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
/* 11 */            if (!(list instanceof zzso)) {
/* 32 */                int iZzB = 0;
/* 33 */                while (i < size) {
/* 50 */                    iZzB += zzqv.zzB(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 54 */                return iZzB;
                    }
/* 13 */            zzso zzsoVar = (zzso) list;
/* 15 */            int iZzB2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iZzB2 += zzqv.zzB(zzsoVar.zze(i));
/* 28 */                i++;
                    }
/* 31 */            return iZzB2;
                }

                public static int zzb(int i, List list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (zzqv.zzA(i << 3) + 4) * size;
                }

                public static int zzc(List list) {
/* 5 */             return list.size() * 4;
                }

                public static int zzd(int i, List list, boolean z) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (zzqv.zzA(i << 3) + 8) * size;
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
/* 11 */            if (!(list instanceof zzso)) {
/* 32 */                int iZzB = 0;
/* 33 */                while (i < size) {
/* 50 */                    iZzB += zzqv.zzB(((Integer) list.get(i)).intValue());
/* 51 */                    i++;
                        }
/* 54 */                return iZzB;
                    }
/* 13 */            zzso zzsoVar = (zzso) list;
/* 15 */            int iZzB2 = 0;
/* 16 */            while (i < size) {
/* 27 */                iZzB2 += zzqv.zzB(zzsoVar.zze(i));
/* 28 */                i++;
                    }
/* 31 */            return iZzB2;
                }

                public static int zzg(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzth)) {
/* 31 */                int iZzB = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzB += zzqv.zzB(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzB;
                    }
/* 13 */            zzth zzthVar = (zzth) list;
/* 15 */            int iZzB2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzB2 += zzqv.zzB(zzthVar.zze(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzB2;
                }

                public static int zzh(int i, Object obj, zzug zzugVar) {
/* 1 */             int i2 = i << 3;
/* 5 */             if (!(obj instanceof zztd)) {
/* 32 */                return zzqv.zzy((zzts) obj, zzugVar) + zzqv.zzA(i2);
                    }
/* 9 */             int iZzA = zzqv.zzA(i2);
/* 13 */            int iZza = ((zztd) obj).zza();
/* 17 */            return pm2.m7496s(iZza, iZza, iZzA);
                }

                public static int zzi(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzso)) {
/* 36 */                int iZzA = 0;
/* 37 */                while (i < size) {
/* 45 */                    int iIntValue = ((Integer) list.get(i)).intValue();
/* 58 */                    iZzA += zzqv.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 59 */                    i++;
                        }
/* 62 */                return iZzA;
                    }
/* 13 */            zzso zzsoVar = (zzso) list;
/* 15 */            int iZzA2 = 0;
/* 16 */            while (i < size) {
/* 18 */                int iZze = zzsoVar.zze(i);
/* 31 */                iZzA2 += zzqv.zzA((iZze >> 31) ^ (iZze + iZze));
/* 32 */                i++;
                    }
/* 35 */            return iZzA2;
                }

                public static int zzj(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 13 */            if (!(list instanceof zzth)) {
/* 37 */                int iZzB = 0;
/* 38 */                while (i < size) {
/* 46 */                    long jLongValue = ((Long) list.get(i)).longValue();
/* 58 */                    iZzB += zzqv.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 59 */                    i++;
                        }
/* 62 */                return iZzB;
                    }
/* 15 */            zzth zzthVar = (zzth) list;
/* 17 */            int iZzB2 = 0;
/* 18 */            while (i < size) {
/* 20 */                long jZze = zzthVar.zze(i);
/* 32 */                iZzB2 += zzqv.zzB((jZze >> 63) ^ (jZze + jZze));
/* 33 */                i++;
                    }
/* 36 */            return iZzB2;
                }

                public static int zzk(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzso)) {
/* 31 */                int iZzA = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzA += zzqv.zzA(((Integer) list.get(i)).intValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzA;
                    }
/* 13 */            zzso zzsoVar = (zzso) list;
/* 15 */            int iZzA2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzA2 += zzqv.zzA(zzsoVar.zze(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzA2;
                }

                public static int zzl(List list) {
/* 1 */             int size = list.size();
/* 5 */             int i = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            if (!(list instanceof zzth)) {
/* 31 */                int iZzB = 0;
/* 32 */                while (i < size) {
/* 48 */                    iZzB += zzqv.zzB(((Long) list.get(i)).longValue());
/* 49 */                    i++;
                        }
/* 52 */                return iZzB;
                    }
/* 13 */            zzth zzthVar = (zzth) list;
/* 15 */            int iZzB2 = 0;
/* 16 */            while (i < size) {
/* 26 */                iZzB2 += zzqv.zzB(zzthVar.zze(i));
/* 27 */                i++;
                    }
/* 30 */            return iZzB2;
                }

                public static zzuv zzm() {
/* 1 */             return zzb;
                }

                public static Object zzn(Object obj, int i, List list, zzsr zzsrVar, Object obj2, zzuv zzuvVar) {
/* 1 */             if (zzsrVar == null) {
/* 3 */                 return obj2;
                    }
/* 6 */             if (!(list instanceof RandomAccess)) {
/* 57 */                Iterator it = list.iterator();
/* 65 */                while (it.hasNext()) {
/* 73 */                    int iIntValue = ((Integer) it.next()).intValue();
/* 81 */                    if (!zzsrVar.zza(iIntValue)) {
/* 83 */                        obj2 = zzo(obj, i, iIntValue, obj2, zzuvVar);
/* 87 */                        it.remove();
                            }
                        }
/* 91 */                return obj2;
                    }
/* 8 */             int size = list.size();
/* 13 */            int i2 = 0;
/* 14 */            for (int i3 = 0; i3 < size; i3++) {
/* 20 */                Integer num = (Integer) list.get(i3);
/* 22 */                int iIntValue2 = num.intValue();
/* 30 */                if (zzsrVar.zza(iIntValue2)) {
/* 32 */                    if (i3 != i2) {
/* 34 */                        list.set(i2, num);
                            }
/* 37 */                    i2++;
                        } else {
/* 40 */                    obj2 = zzo(obj, i, iIntValue2, obj2, zzuvVar);
                        }
                    }
/* 47 */            if (i2 != size) {
/* 53 */                list.subList(i2, size).clear();
                    }
/* 56 */            return obj2;
                }

                public static Object zzo(Object obj, int i, int i2, Object obj2, zzuv zzuvVar) {
/* 1 */             if (obj2 == null) {
/* 3 */                 obj2 = zzuvVar.zza(obj);
                    }
/* 8 */             zzuvVar.zzh(obj2, i, i2);
/* 11 */            return obj2;
                }

                public static void zzp(zzrz zzrzVar, Object obj, Object obj2) {
/* 3 */             zzsd zzsdVar = ((zzsk) obj2).zzb;
/* 11 */            if (zzsdVar.zza.isEmpty()) {
/* 22 */                return;
                    }
/* 19 */            ((zzsk) obj).zzi().zzh(zzsdVar);
                }

                public static void zzq(zzuv zzuvVar, Object obj, Object obj2) {
/* 1 */             zzsn zzsnVar = (zzsn) obj;
/* 3 */             zzuw zzuwVarZze = zzsnVar.zzc;
/* 7 */             zzuw zzuwVar = ((zzsn) obj2).zzc;
/* 17 */            if (!zzuw.zzc().equals(zzuwVar)) {
/* 27 */                if (zzuw.zzc().equals(zzuwVarZze)) {
/* 29 */                    zzuwVarZze = zzuw.zze(zzuwVarZze, zzuwVar);
                        } else {
/* 34 */                    zzuwVarZze.zzd(zzuwVar);
                        }
                    }
/* 37 */            zzsnVar.zzc = zzuwVarZze;
                }

                public static void zzr(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzc(i, list, z);
                }

                public static void zzs(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzg(i, list, z);
                }

                public static void zzt(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzj(i, list, z);
                }

                public static void zzu(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzl(i, list, z);
                }

                public static void zzv(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzn(i, list, z);
                }

                public static void zzw(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzp(i, list, z);
                }

                public static void zzx(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzs(i, list, z);
                }

                public static void zzy(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzu(i, list, z);
                }

                public static void zzz(int i, List list, zzvi zzviVar, boolean z) throws IOException {
/* 1 */             if (list == null || list.isEmpty()) {
/* 12 */                return;
                    }
/* 9 */             zzviVar.zzy(i, list, z);
                }
            }
